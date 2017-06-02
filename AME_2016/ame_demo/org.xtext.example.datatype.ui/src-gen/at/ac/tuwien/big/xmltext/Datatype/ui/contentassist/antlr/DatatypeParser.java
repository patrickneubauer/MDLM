/*
 * generated by Xtext
 */
package at.ac.tuwien.big.xmltext.Datatype.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import at.ac.tuwien.big.xmltext.Datatype.services.DatatypeGrammarAccess;

public class DatatypeParser extends AbstractContentAssistParser {
	
	@Inject
	private DatatypeGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected at.ac.tuwien.big.xmltext.Datatype.ui.contentassist.antlr.internal.InternalDatatypeParser createParser() {
		at.ac.tuwien.big.xmltext.Datatype.ui.contentassist.antlr.internal.InternalDatatypeParser result = new at.ac.tuwien.big.xmltext.Datatype.ui.contentassist.antlr.internal.InternalDatatypeParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getBooleanAccess().getAlternatives(), "rule__Boolean__Alternatives");
					put(grammarAccess.getLibraryTypeAccess().getGroup(), "rule__LibraryType__Group__0");
					put(grammarAccess.getLibraryTypeAccess().getGroup_3(), "rule__LibraryType__Group_3__0");
					put(grammarAccess.getLibraryTypeAccess().getGroup_3_3(), "rule__LibraryType__Group_3_3__0");
					put(grammarAccess.getCustomerTypeAccess().getGroup(), "rule__CustomerType__Group__0");
					put(grammarAccess.getCustomerTypeAccess().getGroup_10(), "rule__CustomerType__Group_10__0");
					put(grammarAccess.getDateAccess().getGroup(), "rule__Date__Group__0");
					put(grammarAccess.getTimeAccess().getGroup(), "rule__Time__Group__0");
					put(grammarAccess.getDecimalAccess().getGroup(), "rule__Decimal__Group__0");
					put(grammarAccess.getLibraryTypeAccess().getCustomerAssignment_3_2(), "rule__LibraryType__CustomerAssignment_3_2");
					put(grammarAccess.getLibraryTypeAccess().getCustomerAssignment_3_3_1(), "rule__LibraryType__CustomerAssignment_3_3_1");
					put(grammarAccess.getCustomerTypeAccess().getFirstNameAssignment_3(), "rule__CustomerType__FirstNameAssignment_3");
					put(grammarAccess.getCustomerTypeAccess().getLastNameAssignment_5(), "rule__CustomerType__LastNameAssignment_5");
					put(grammarAccess.getCustomerTypeAccess().getBirthDateAssignment_7(), "rule__CustomerType__BirthDateAssignment_7");
					put(grammarAccess.getCustomerTypeAccess().getBirthTimeAssignment_9(), "rule__CustomerType__BirthTimeAssignment_9");
					put(grammarAccess.getCustomerTypeAccess().getDateTimeAssignment_10_1(), "rule__CustomerType__DateTimeAssignment_10_1");
					put(grammarAccess.getCustomerTypeAccess().getAgeAssignment_12(), "rule__CustomerType__AgeAssignment_12");
					put(grammarAccess.getCustomerTypeAccess().getPrizeAssignment_14(), "rule__CustomerType__PrizeAssignment_14");
					put(grammarAccess.getCustomerTypeAccess().getDisabledAssignment_16(), "rule__CustomerType__DisabledAssignment_16");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			at.ac.tuwien.big.xmltext.Datatype.ui.contentassist.antlr.internal.InternalDatatypeParser typedParser = (at.ac.tuwien.big.xmltext.Datatype.ui.contentassist.antlr.internal.InternalDatatypeParser) parser;
			typedParser.entryRuleLibraryType();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public DatatypeGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(DatatypeGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
