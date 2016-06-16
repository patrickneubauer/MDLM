/*
 * generated by Xtext
 */
package at.ac.tuwien.big.xmltext.idIdref.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import at.ac.tuwien.big.xmltext.idIdref.services.IdIdrefGrammarAccess;

public class IdIdrefParser extends AbstractContentAssistParser {
	
	@Inject
	private IdIdrefGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected at.ac.tuwien.big.xmltext.idIdref.ui.contentassist.antlr.internal.InternalIdIdrefParser createParser() {
		at.ac.tuwien.big.xmltext.idIdref.ui.contentassist.antlr.internal.InternalIdIdrefParser result = new at.ac.tuwien.big.xmltext.idIdref.ui.contentassist.antlr.internal.InternalIdIdrefParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getEmployeeListTypeAccess().getGroup(), "rule__EmployeeListType__Group__0");
					put(grammarAccess.getEmployeeListTypeAccess().getGroup_3(), "rule__EmployeeListType__Group_3__0");
					put(grammarAccess.getEmployeeListTypeAccess().getGroup_3_3(), "rule__EmployeeListType__Group_3_3__0");
					put(grammarAccess.getEmployeeListTypeAccess().getGroup_4(), "rule__EmployeeListType__Group_4__0");
					put(grammarAccess.getEmployeeListTypeAccess().getGroup_4_3(), "rule__EmployeeListType__Group_4_3__0");
					put(grammarAccess.getBossTypeAccess().getGroup(), "rule__BossType__Group__0");
					put(grammarAccess.getEmployeeTypeAccess().getGroup(), "rule__EmployeeType__Group__0");
					put(grammarAccess.getIdValuesAccess().getGroup(), "rule__IdValues__Group__0");
					put(grammarAccess.getEmployeeListTypeAccess().getBossAssignment_3_2(), "rule__EmployeeListType__BossAssignment_3_2");
					put(grammarAccess.getEmployeeListTypeAccess().getBossAssignment_3_3_1(), "rule__EmployeeListType__BossAssignment_3_3_1");
					put(grammarAccess.getEmployeeListTypeAccess().getEmployeeAssignment_4_2(), "rule__EmployeeListType__EmployeeAssignment_4_2");
					put(grammarAccess.getEmployeeListTypeAccess().getEmployeeAssignment_4_3_1(), "rule__EmployeeListType__EmployeeAssignment_4_3_1");
					put(grammarAccess.getBossTypeAccess().getLastNameAssignment_3(), "rule__BossType__LastNameAssignment_3");
					put(grammarAccess.getBossTypeAccess().getSuperBossAssignment_5(), "rule__BossType__SuperBossAssignment_5");
					put(grammarAccess.getBossTypeAccess().getBossIdAssignment_7(), "rule__BossType__BossIdAssignment_7");
					put(grammarAccess.getEmployeeTypeAccess().getLastNameAssignment_3(), "rule__EmployeeType__LastNameAssignment_3");
					put(grammarAccess.getEmployeeTypeAccess().getBossAssignment_5(), "rule__EmployeeType__BossAssignment_5");
					put(grammarAccess.getEmployeeTypeAccess().getEmployeeIdAssignment_7(), "rule__EmployeeType__EmployeeIdAssignment_7");
					put(grammarAccess.getIdValuesAccess().getNameAssignment_1(), "rule__IdValues__NameAssignment_1");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			at.ac.tuwien.big.xmltext.idIdref.ui.contentassist.antlr.internal.InternalIdIdrefParser typedParser = (at.ac.tuwien.big.xmltext.idIdref.ui.contentassist.antlr.internal.InternalIdIdrefParser) parser;
			typedParser.entryRuleEmployeeListType();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public IdIdrefGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(IdIdrefGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
