package at.ac.tuwien.big.xmltext;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.TreeMap;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.ExtendedMetaData;
import org.eclipse.xtend.typesystem.emf.EcoreUtil2;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.AbstractRule;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.TypeRef;
import org.eclipse.xtext.XtextFactory;
import org.eclipse.xtext.impl.ParserRuleImpl;

/*
 * TODO: xsd:sequence and xsd:all reihenfolge im xtext beachten.
 * TODO: XML Schema genearte xml datei from that --> maybe in plugin/webtools
 * TODO: check AnyGenericConstruct again in xmltext_experiments 
 */

public class AMEGroupMixedContent {

	private static final String TEXT_CONTENT = "textContent";

	public static Map<String, EClass> storage = new HashMap<>();

	private final static String ANY_GENERIC_ELEMENT = "anyGenericElement";

	private static MixedContentSolution solutionMethod = MixedContentSolution.ANY_GENERIC_CONSTRUCT;
	// private static MixedContentSolution solutionMethod =
	// MixedContentSolution.INSERTING_TEXTCONTENT;

	/*
	 * TODO: IDEA BookType returns BookType: 'BookType' name=ID0 '{' ('text'
	 * texts+=EString)? 'title' title=String0 ('text' texts+=EString)? 'pages'
	 * pages=Int0 ('text' texts+=EString)? '}';
	 * 
	 */

	/*
	 * TODO: IDEA 1. First remove the mixed content with the EFeatureMap form
	 * the Ecore 2. Reinsert as AnyGenericConstruct or Introducte a new PCDATA
	 * class.
	 */
	public static void doMixedContent(Resource ecore, EcoreXSDMapper mapper) {
		EPackage pack = (EPackage) ecore.getAllContents().next();
		Collection<EObject> all = EcoreUtil2.allContents(pack);

		all.forEach(itm -> {
			if (itm instanceof EClass && !((EClass) itm).getName().equals("DocumentRoot")) {
				EClass eclass = (EClass) itm;
				System.err.println(eclass.getName());

				if (eclass.getEStructuralFeature("mixed") != null) {
					AMEGroupUtil.createAnyGenericStructure(pack);
					System.out.println("found mixed");

					// remove mixed feature
					EStructuralFeature foundMixed = eclass.getEStructuralFeature("mixed");
					eclass.getEStructuralFeatures().remove(foundMixed);
					EAnnotation anno = eclass.getEAnnotation(ExtendedMetaData.ANNOTATION_URI);
					// anno.getDetails().put("kind", "elementOnly");

					// remove derived, transient, volatile from features (set
					// when type is mixed)
					for (EStructuralFeature esf : eclass.getEAllStructuralFeatures()) {

						// esf.getEType().eClass().getESuperTypes().add((EClass)
						// pack.getEClassifier(AMEGroupUtil.ANY_GENERIC_ELEMENT));
						System.out.println(esf.getName());
						esf.setDerived(false);
						esf.setTransient(false);
						esf.setVolatile(false);

						EClass x = esf.eClass();
						x.getESuperTypes().add((EClass) pack.getEClassifier(AMEGroupUtil.ANY_GENERIC_CONSTRUCT));
					}

					switch (AMEGroupMixedContent.solutionMethod) {
					case ANY_GENERIC_CONSTRUCT:
						EReference ref = EcoreFactory.eINSTANCE.createEReference();
						ref.setName("properties");
						ref.setEType(pack.getEClassifier(AMEGroupUtil.PROPERTIES));
						ref.setLowerBound(0);
						ref.setUpperBound(1);
						ref.setContainment(true);
						eclass.getEStructuralFeatures().add(ref);
						break;
					case INSERTING_TEXTCONTENT:
						EAttribute attrText = EcoreFactory.eINSTANCE.createEAttribute();
						eclass.getEStructuralFeatures().add(attrText);
						attrText.setName(TEXT_CONTENT);
						attrText.setEType(EcorePackage.Literals.ESTRING);
						attrText.setLowerBound(0);
						attrText.setUpperBound(-1);
						break;
					default:
						System.err.println("MixedContent: NO VALID SOLUTION");
						break;
					}

					// createMixedElement(pack, eclass);
					// eclass.getESuperTypes().add((EClass)
					// pack.getEClassifier(AMEGroupUtil.MIXED_CONTENT_CLASS));

					storage.put(eclass.getName(), eclass);
				}
			}
		});

	}

	private static Optional<Group> getMixedContentGroup(Group group) {
		for (EObject x : group.eContents()) {
			if (x instanceof Keyword) {
				if (((Keyword) x).getValue().equals(ANY_GENERIC_ELEMENT)) {
					return Optional.of((Group) x.eContainer());
				}
			}
			if (x instanceof Group) {
				return getMixedContentGroup((Group) x);

			}
		}
		return Optional.empty();
	}

	private static Optional<Group> getMixedContentGroup(AbstractRule rule) {
		for (EObject obj : rule.eContents()) {
			if (obj instanceof Group) {
				Optional<Group> group = getMixedContentGroup((Group) obj);
				if (group.isPresent())
					return group;
			}
		}
		return Optional.empty();
	}

	private static RuleCall createRuleCall(Grammar g, String name){

		Grammar terminals = g.getUsedGrammars().get(0);
		TerminalRule term = (TerminalRule) terminals.getRules().stream().filter(x -> x.getName().equals("STRING"))
				.findFirst().get();
		RuleCall ruleCall = XtextFactory.eINSTANCE.createRuleCall();
		ruleCall.setRule(term);
		return ruleCall;
	}
	
	private static Assignment createTextAssignment(Grammar g) {
		Assignment ass = XtextFactory.eINSTANCE.createAssignment();
		ass.setFeature(TEXT_CONTENT);
		ass.setOperator("+=");
		ass.setCardinality("?");

		ass.setTerminal(createRuleCall(g, "STRING"));

		return ass;
	}

	private static Group createTextGroup(Grammar g) {
		Group group = XtextFactory.eINSTANCE.createGroup();
		// Assignment ass = XtextFactory.eINSTANCE.createAssignment();
		// Keyword keyword = XtextFactory.eINSTANCE.createKeyword();
		// keyword.setValue("");

		// group.getElements().add(keyword);
		group.getElements().add(createTextAssignment(g));
		group.setFirstSetPredicated(false);
		group.setPredicated(false);
		group.setCardinality("?");

		return group;
	}

	public static void doMixedContentXText(Grammar g, EcoreXSDMapper mapper) {
		// TODO Auto-generated method stub
		for (Entry<String, EClass> entry : storage.entrySet()) {

			// Find rule linked to the EClass
			Optional<AbstractRule> absRule = g.getRules().stream().filter(x -> x.getName().equals(entry.getKey()))
					.findFirst();
			if (absRule.isPresent()) {
				ParserRuleImpl rule = (ParserRuleImpl) absRule.get();
				// what is rule.type and rule.alternatives

				// API XText Grammar or XText Grammar API
				// XPand Xtend

				// Optional<Group> mixedContentGroup =
				// getMixedContentGroup(rule);

				// if(mixedContentGroup.isPresent()){
				// (mixedContentGroup.get()).getElements().forEach(e -> {
				// System.out.println(e);
				//
				// if(e instanceof Keyword && ((Keyword)
				// e).getValue().equals(ANY_GENERIC_ELEMENT)){
				// ((Keyword) e).setValue("mixed");
				//
				// }
				// });
				// }
				if (MixedContentSolution.ANY_GENERIC_CONSTRUCT == AMEGroupMixedContent.solutionMethod) {
					
					// change syntax of AnyGenericAttribute
					Optional<AbstractRule> textRule = g.getRules().stream()
							.filter(x -> x.getName().equals(AMEGroupUtil.ANY_GENERIC_TEXT)).findFirst();
					if (textRule.isPresent()) {
						List<AbstractElement> toRemove = new ArrayList<>();

						Group alt = (Group) textRule.get().getAlternatives();
					
						while (alt.getElements().size() > 1) {
							alt.getElements().remove(1);
						}
						
						Keyword opening = XtextFactory.eINSTANCE.createKeyword();
						opening.setValue("{");
						alt.getElements().add(opening);
						
						Assignment ass = XtextFactory.eINSTANCE.createAssignment();
						ass.setFeature("textValue");
						ass.setOperator("=");
						ass.setTerminal(createRuleCall(g, "STRING"));
						ass.setCardinality("?");
						alt.getElements().add(ass);
						
						Keyword closing = XtextFactory.eINSTANCE.createKeyword();
						closing.setValue("}");
						alt.getElements().add(closing);
						
					}
				}

				if (MixedContentSolution.INSERTING_TEXTCONTENT == AMEGroupMixedContent.solutionMethod) {

					EClass clz = (EClass) rule.getType().getClassifier();
					List<String> ignoredFeatures = Arrays.asList(TEXT_CONTENT, "name");
					List<String> featuresInClass = clz.getEStructuralFeatures().stream().filter(x -> {

						return !ignoredFeatures.contains(x.getName());
					}).map(x -> x.getName()).collect(Collectors.toList());
					System.out.println(featuresInClass);

					rule.eContents().forEach(itm -> {
						if (itm instanceof Group) {
							Group grp = (Group) itm;
							System.out.println(grp.getElements());
							Map<Integer, Assignment> map = new TreeMap<Integer, Assignment>();

							for (int idx = 0; idx < grp.getElements().size(); idx++) {
								AbstractElement elm = grp.getElements().get(idx);
								if (elm instanceof Assignment) {
									if (featuresInClass.contains(((Assignment) elm).getFeature())) {

										// Group insertGroup =
										// createTextGroup(g);
										// map.put(idx+map.size()-1,
										// insertGroup);
										Assignment assignment = createTextAssignment(g);
										map.put(idx + map.size() - 1, assignment);
									}
								}
								if (elm instanceof Group) {
									AbstractElement e = ((Group) elm).getElements().get(0);

									Keyword k = (Keyword) e;
									if (k.getValue().equals(TEXT_CONTENT)) {
										Assignment ass = createTextAssignment(g);
										map.put(idx + map.size(), ass);
									}
									grp.getElements().remove(idx);
								}
							}
							map.entrySet().forEach(x -> {
								grp.getElements().add(x.getKey(), x.getValue());
							});
						}
					});

					System.out.println("-----");
					System.out.println(rule.eContents());
				}
			}

		}
	}

	private enum MixedContentSolution {
		INSERTING_TEXTCONTENT, ANY_GENERIC_CONSTRUCT
	}
}
