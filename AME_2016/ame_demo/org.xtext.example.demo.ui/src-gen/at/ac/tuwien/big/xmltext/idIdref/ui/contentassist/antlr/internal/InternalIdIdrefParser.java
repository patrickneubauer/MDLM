package at.ac.tuwien.big.xmltext.idIdref.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import at.ac.tuwien.big.xmltext.idIdref.services.IdIdrefGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalIdIdrefParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'EmployeeListType'", "'['", "']'", "'boss'", "','", "'employee'", "'BossType'", "'lastName'", "'birthDate'", "'superBoss'", "'bossId'", "'EmployeeType'", "'employeeId'", "'-'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalIdIdrefParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalIdIdrefParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalIdIdrefParser.tokenNames; }
    public String getGrammarFileName() { return "../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g"; }


     
     	private IdIdrefGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(IdIdrefGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleEmployeeListType"
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:60:1: entryRuleEmployeeListType : ruleEmployeeListType EOF ;
    public final void entryRuleEmployeeListType() throws RecognitionException {
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:61:1: ( ruleEmployeeListType EOF )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:62:1: ruleEmployeeListType EOF
            {
             before(grammarAccess.getEmployeeListTypeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEmployeeListType_in_entryRuleEmployeeListType61);
            ruleEmployeeListType();

            state._fsp--;

             after(grammarAccess.getEmployeeListTypeRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEmployeeListType68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEmployeeListType"


    // $ANTLR start "ruleEmployeeListType"
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:69:1: ruleEmployeeListType : ( ( rule__EmployeeListType__Group__0 ) ) ;
    public final void ruleEmployeeListType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:73:2: ( ( ( rule__EmployeeListType__Group__0 ) ) )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:74:1: ( ( rule__EmployeeListType__Group__0 ) )
            {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:74:1: ( ( rule__EmployeeListType__Group__0 ) )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:75:1: ( rule__EmployeeListType__Group__0 )
            {
             before(grammarAccess.getEmployeeListTypeAccess().getGroup()); 
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:76:1: ( rule__EmployeeListType__Group__0 )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:76:2: rule__EmployeeListType__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmployeeListType__Group__0_in_ruleEmployeeListType94);
            rule__EmployeeListType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEmployeeListTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEmployeeListType"


    // $ANTLR start "entryRuleBossType"
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:88:1: entryRuleBossType : ruleBossType EOF ;
    public final void entryRuleBossType() throws RecognitionException {
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:89:1: ( ruleBossType EOF )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:90:1: ruleBossType EOF
            {
             before(grammarAccess.getBossTypeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBossType_in_entryRuleBossType121);
            ruleBossType();

            state._fsp--;

             after(grammarAccess.getBossTypeRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBossType128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBossType"


    // $ANTLR start "ruleBossType"
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:97:1: ruleBossType : ( ( rule__BossType__Group__0 ) ) ;
    public final void ruleBossType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:101:2: ( ( ( rule__BossType__Group__0 ) ) )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:102:1: ( ( rule__BossType__Group__0 ) )
            {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:102:1: ( ( rule__BossType__Group__0 ) )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:103:1: ( rule__BossType__Group__0 )
            {
             before(grammarAccess.getBossTypeAccess().getGroup()); 
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:104:1: ( rule__BossType__Group__0 )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:104:2: rule__BossType__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__BossType__Group__0_in_ruleBossType154);
            rule__BossType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBossTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBossType"


    // $ANTLR start "entryRuleEmployeeType"
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:116:1: entryRuleEmployeeType : ruleEmployeeType EOF ;
    public final void entryRuleEmployeeType() throws RecognitionException {
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:117:1: ( ruleEmployeeType EOF )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:118:1: ruleEmployeeType EOF
            {
             before(grammarAccess.getEmployeeTypeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEmployeeType_in_entryRuleEmployeeType181);
            ruleEmployeeType();

            state._fsp--;

             after(grammarAccess.getEmployeeTypeRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEmployeeType188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEmployeeType"


    // $ANTLR start "ruleEmployeeType"
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:125:1: ruleEmployeeType : ( ( rule__EmployeeType__Group__0 ) ) ;
    public final void ruleEmployeeType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:129:2: ( ( ( rule__EmployeeType__Group__0 ) ) )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:130:1: ( ( rule__EmployeeType__Group__0 ) )
            {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:130:1: ( ( rule__EmployeeType__Group__0 ) )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:131:1: ( rule__EmployeeType__Group__0 )
            {
             before(grammarAccess.getEmployeeTypeAccess().getGroup()); 
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:132:1: ( rule__EmployeeType__Group__0 )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:132:2: rule__EmployeeType__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmployeeType__Group__0_in_ruleEmployeeType214);
            rule__EmployeeType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEmployeeTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEmployeeType"


    // $ANTLR start "entryRuleString0"
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:144:1: entryRuleString0 : ruleString0 EOF ;
    public final void entryRuleString0() throws RecognitionException {
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:145:1: ( ruleString0 EOF )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:146:1: ruleString0 EOF
            {
             before(grammarAccess.getString0Rule()); 
            pushFollow(FollowSets000.FOLLOW_ruleString0_in_entryRuleString0241);
            ruleString0();

            state._fsp--;

             after(grammarAccess.getString0Rule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleString0248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleString0"


    // $ANTLR start "ruleString0"
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:153:1: ruleString0 : ( RULE_STRING ) ;
    public final void ruleString0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:157:2: ( ( RULE_STRING ) )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:158:1: ( RULE_STRING )
            {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:158:1: ( RULE_STRING )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:159:1: RULE_STRING
            {
             before(grammarAccess.getString0Access().getSTRINGTerminalRuleCall()); 
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleString0274); 
             after(grammarAccess.getString0Access().getSTRINGTerminalRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleString0"


    // $ANTLR start "entryRuleIdValues"
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:172:1: entryRuleIdValues : ruleIdValues EOF ;
    public final void entryRuleIdValues() throws RecognitionException {
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:173:1: ( ruleIdValues EOF )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:174:1: ruleIdValues EOF
            {
             before(grammarAccess.getIdValuesRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleIdValues_in_entryRuleIdValues300);
            ruleIdValues();

            state._fsp--;

             after(grammarAccess.getIdValuesRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIdValues307); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIdValues"


    // $ANTLR start "ruleIdValues"
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:181:1: ruleIdValues : ( ( rule__IdValues__Group__0 ) ) ;
    public final void ruleIdValues() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:185:2: ( ( ( rule__IdValues__Group__0 ) ) )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:186:1: ( ( rule__IdValues__Group__0 ) )
            {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:186:1: ( ( rule__IdValues__Group__0 ) )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:187:1: ( rule__IdValues__Group__0 )
            {
             before(grammarAccess.getIdValuesAccess().getGroup()); 
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:188:1: ( rule__IdValues__Group__0 )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:188:2: rule__IdValues__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__IdValues__Group__0_in_ruleIdValues333);
            rule__IdValues__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIdValuesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIdValues"


    // $ANTLR start "entryRuleDate"
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:200:1: entryRuleDate : ruleDate EOF ;
    public final void entryRuleDate() throws RecognitionException {
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:201:1: ( ruleDate EOF )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:202:1: ruleDate EOF
            {
             before(grammarAccess.getDateRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDate_in_entryRuleDate360);
            ruleDate();

            state._fsp--;

             after(grammarAccess.getDateRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDate367); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDate"


    // $ANTLR start "ruleDate"
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:209:1: ruleDate : ( ( rule__Date__Group__0 ) ) ;
    public final void ruleDate() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:213:2: ( ( ( rule__Date__Group__0 ) ) )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:214:1: ( ( rule__Date__Group__0 ) )
            {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:214:1: ( ( rule__Date__Group__0 ) )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:215:1: ( rule__Date__Group__0 )
            {
             before(grammarAccess.getDateAccess().getGroup()); 
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:216:1: ( rule__Date__Group__0 )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:216:2: rule__Date__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Date__Group__0_in_ruleDate393);
            rule__Date__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDateAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDate"


    // $ANTLR start "entryRuleID0"
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:228:1: entryRuleID0 : ruleID0 EOF ;
    public final void entryRuleID0() throws RecognitionException {
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:229:1: ( ruleID0 EOF )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:230:1: ruleID0 EOF
            {
             before(grammarAccess.getID0Rule()); 
            pushFollow(FollowSets000.FOLLOW_ruleID0_in_entryRuleID0420);
            ruleID0();

            state._fsp--;

             after(grammarAccess.getID0Rule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleID0427); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleID0"


    // $ANTLR start "ruleID0"
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:237:1: ruleID0 : ( RULE_ID ) ;
    public final void ruleID0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:241:2: ( ( RULE_ID ) )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:242:1: ( RULE_ID )
            {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:242:1: ( RULE_ID )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:243:1: RULE_ID
            {
             before(grammarAccess.getID0Access().getIDTerminalRuleCall()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleID0453); 
             after(grammarAccess.getID0Access().getIDTerminalRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleID0"


    // $ANTLR start "rule__EmployeeListType__Group__0"
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:260:1: rule__EmployeeListType__Group__0 : rule__EmployeeListType__Group__0__Impl rule__EmployeeListType__Group__1 ;
    public final void rule__EmployeeListType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:264:1: ( rule__EmployeeListType__Group__0__Impl rule__EmployeeListType__Group__1 )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:265:2: rule__EmployeeListType__Group__0__Impl rule__EmployeeListType__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmployeeListType__Group__0__Impl_in_rule__EmployeeListType__Group__0488);
            rule__EmployeeListType__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EmployeeListType__Group__1_in_rule__EmployeeListType__Group__0491);
            rule__EmployeeListType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmployeeListType__Group__0"


    // $ANTLR start "rule__EmployeeListType__Group__0__Impl"
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:272:1: rule__EmployeeListType__Group__0__Impl : ( () ) ;
    public final void rule__EmployeeListType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:276:1: ( ( () ) )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:277:1: ( () )
            {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:277:1: ( () )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:278:1: ()
            {
             before(grammarAccess.getEmployeeListTypeAccess().getEmployeeListTypeAction_0()); 
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:279:1: ()
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:281:1: 
            {
            }

             after(grammarAccess.getEmployeeListTypeAccess().getEmployeeListTypeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmployeeListType__Group__0__Impl"


    // $ANTLR start "rule__EmployeeListType__Group__1"
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:291:1: rule__EmployeeListType__Group__1 : rule__EmployeeListType__Group__1__Impl rule__EmployeeListType__Group__2 ;
    public final void rule__EmployeeListType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:295:1: ( rule__EmployeeListType__Group__1__Impl rule__EmployeeListType__Group__2 )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:296:2: rule__EmployeeListType__Group__1__Impl rule__EmployeeListType__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmployeeListType__Group__1__Impl_in_rule__EmployeeListType__Group__1549);
            rule__EmployeeListType__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EmployeeListType__Group__2_in_rule__EmployeeListType__Group__1552);
            rule__EmployeeListType__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmployeeListType__Group__1"


    // $ANTLR start "rule__EmployeeListType__Group__1__Impl"
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:303:1: rule__EmployeeListType__Group__1__Impl : ( 'EmployeeListType' ) ;
    public final void rule__EmployeeListType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:307:1: ( ( 'EmployeeListType' ) )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:308:1: ( 'EmployeeListType' )
            {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:308:1: ( 'EmployeeListType' )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:309:1: 'EmployeeListType'
            {
             before(grammarAccess.getEmployeeListTypeAccess().getEmployeeListTypeKeyword_1()); 
            match(input,11,FollowSets000.FOLLOW_11_in_rule__EmployeeListType__Group__1__Impl580); 
             after(grammarAccess.getEmployeeListTypeAccess().getEmployeeListTypeKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmployeeListType__Group__1__Impl"


    // $ANTLR start "rule__EmployeeListType__Group__2"
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:322:1: rule__EmployeeListType__Group__2 : rule__EmployeeListType__Group__2__Impl rule__EmployeeListType__Group__3 ;
    public final void rule__EmployeeListType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:326:1: ( rule__EmployeeListType__Group__2__Impl rule__EmployeeListType__Group__3 )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:327:2: rule__EmployeeListType__Group__2__Impl rule__EmployeeListType__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmployeeListType__Group__2__Impl_in_rule__EmployeeListType__Group__2611);
            rule__EmployeeListType__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EmployeeListType__Group__3_in_rule__EmployeeListType__Group__2614);
            rule__EmployeeListType__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmployeeListType__Group__2"


    // $ANTLR start "rule__EmployeeListType__Group__2__Impl"
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:334:1: rule__EmployeeListType__Group__2__Impl : ( '[' ) ;
    public final void rule__EmployeeListType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:338:1: ( ( '[' ) )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:339:1: ( '[' )
            {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:339:1: ( '[' )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:340:1: '['
            {
             before(grammarAccess.getEmployeeListTypeAccess().getLeftSquareBracketKeyword_2()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__EmployeeListType__Group__2__Impl642); 
             after(grammarAccess.getEmployeeListTypeAccess().getLeftSquareBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmployeeListType__Group__2__Impl"


    // $ANTLR start "rule__EmployeeListType__Group__3"
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:353:1: rule__EmployeeListType__Group__3 : rule__EmployeeListType__Group__3__Impl rule__EmployeeListType__Group__4 ;
    public final void rule__EmployeeListType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:357:1: ( rule__EmployeeListType__Group__3__Impl rule__EmployeeListType__Group__4 )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:358:2: rule__EmployeeListType__Group__3__Impl rule__EmployeeListType__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmployeeListType__Group__3__Impl_in_rule__EmployeeListType__Group__3673);
            rule__EmployeeListType__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EmployeeListType__Group__4_in_rule__EmployeeListType__Group__3676);
            rule__EmployeeListType__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmployeeListType__Group__3"


    // $ANTLR start "rule__EmployeeListType__Group__3__Impl"
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:365:1: rule__EmployeeListType__Group__3__Impl : ( ( rule__EmployeeListType__Group_3__0 )? ) ;
    public final void rule__EmployeeListType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:369:1: ( ( ( rule__EmployeeListType__Group_3__0 )? ) )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:370:1: ( ( rule__EmployeeListType__Group_3__0 )? )
            {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:370:1: ( ( rule__EmployeeListType__Group_3__0 )? )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:371:1: ( rule__EmployeeListType__Group_3__0 )?
            {
             before(grammarAccess.getEmployeeListTypeAccess().getGroup_3()); 
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:372:1: ( rule__EmployeeListType__Group_3__0 )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==14) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:372:2: rule__EmployeeListType__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__EmployeeListType__Group_3__0_in_rule__EmployeeListType__Group__3__Impl703);
                    rule__EmployeeListType__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEmployeeListTypeAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmployeeListType__Group__3__Impl"


    // $ANTLR start "rule__EmployeeListType__Group__4"
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:382:1: rule__EmployeeListType__Group__4 : rule__EmployeeListType__Group__4__Impl rule__EmployeeListType__Group__5 ;
    public final void rule__EmployeeListType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:386:1: ( rule__EmployeeListType__Group__4__Impl rule__EmployeeListType__Group__5 )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:387:2: rule__EmployeeListType__Group__4__Impl rule__EmployeeListType__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmployeeListType__Group__4__Impl_in_rule__EmployeeListType__Group__4734);
            rule__EmployeeListType__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EmployeeListType__Group__5_in_rule__EmployeeListType__Group__4737);
            rule__EmployeeListType__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmployeeListType__Group__4"


    // $ANTLR start "rule__EmployeeListType__Group__4__Impl"
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:394:1: rule__EmployeeListType__Group__4__Impl : ( ( rule__EmployeeListType__Group_4__0 )? ) ;
    public final void rule__EmployeeListType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:398:1: ( ( ( rule__EmployeeListType__Group_4__0 )? ) )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:399:1: ( ( rule__EmployeeListType__Group_4__0 )? )
            {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:399:1: ( ( rule__EmployeeListType__Group_4__0 )? )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:400:1: ( rule__EmployeeListType__Group_4__0 )?
            {
             before(grammarAccess.getEmployeeListTypeAccess().getGroup_4()); 
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:401:1: ( rule__EmployeeListType__Group_4__0 )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==16) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:401:2: rule__EmployeeListType__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__EmployeeListType__Group_4__0_in_rule__EmployeeListType__Group__4__Impl764);
                    rule__EmployeeListType__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEmployeeListTypeAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmployeeListType__Group__4__Impl"


    // $ANTLR start "rule__EmployeeListType__Group__5"
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:411:1: rule__EmployeeListType__Group__5 : rule__EmployeeListType__Group__5__Impl ;
    public final void rule__EmployeeListType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:415:1: ( rule__EmployeeListType__Group__5__Impl )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:416:2: rule__EmployeeListType__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmployeeListType__Group__5__Impl_in_rule__EmployeeListType__Group__5795);
            rule__EmployeeListType__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmployeeListType__Group__5"


    // $ANTLR start "rule__EmployeeListType__Group__5__Impl"
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:422:1: rule__EmployeeListType__Group__5__Impl : ( ']' ) ;
    public final void rule__EmployeeListType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:426:1: ( ( ']' ) )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:427:1: ( ']' )
            {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:427:1: ( ']' )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:428:1: ']'
            {
             before(grammarAccess.getEmployeeListTypeAccess().getRightSquareBracketKeyword_5()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__EmployeeListType__Group__5__Impl823); 
             after(grammarAccess.getEmployeeListTypeAccess().getRightSquareBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmployeeListType__Group__5__Impl"


    // $ANTLR start "rule__EmployeeListType__Group_3__0"
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:453:1: rule__EmployeeListType__Group_3__0 : rule__EmployeeListType__Group_3__0__Impl rule__EmployeeListType__Group_3__1 ;
    public final void rule__EmployeeListType__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:457:1: ( rule__EmployeeListType__Group_3__0__Impl rule__EmployeeListType__Group_3__1 )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:458:2: rule__EmployeeListType__Group_3__0__Impl rule__EmployeeListType__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmployeeListType__Group_3__0__Impl_in_rule__EmployeeListType__Group_3__0866);
            rule__EmployeeListType__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EmployeeListType__Group_3__1_in_rule__EmployeeListType__Group_3__0869);
            rule__EmployeeListType__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmployeeListType__Group_3__0"


    // $ANTLR start "rule__EmployeeListType__Group_3__0__Impl"
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:465:1: rule__EmployeeListType__Group_3__0__Impl : ( 'boss' ) ;
    public final void rule__EmployeeListType__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:469:1: ( ( 'boss' ) )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:470:1: ( 'boss' )
            {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:470:1: ( 'boss' )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:471:1: 'boss'
            {
             before(grammarAccess.getEmployeeListTypeAccess().getBossKeyword_3_0()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__EmployeeListType__Group_3__0__Impl897); 
             after(grammarAccess.getEmployeeListTypeAccess().getBossKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmployeeListType__Group_3__0__Impl"


    // $ANTLR start "rule__EmployeeListType__Group_3__1"
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:484:1: rule__EmployeeListType__Group_3__1 : rule__EmployeeListType__Group_3__1__Impl rule__EmployeeListType__Group_3__2 ;
    public final void rule__EmployeeListType__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:488:1: ( rule__EmployeeListType__Group_3__1__Impl rule__EmployeeListType__Group_3__2 )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:489:2: rule__EmployeeListType__Group_3__1__Impl rule__EmployeeListType__Group_3__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmployeeListType__Group_3__1__Impl_in_rule__EmployeeListType__Group_3__1928);
            rule__EmployeeListType__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EmployeeListType__Group_3__2_in_rule__EmployeeListType__Group_3__1931);
            rule__EmployeeListType__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmployeeListType__Group_3__1"


    // $ANTLR start "rule__EmployeeListType__Group_3__1__Impl"
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:496:1: rule__EmployeeListType__Group_3__1__Impl : ( '[' ) ;
    public final void rule__EmployeeListType__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:500:1: ( ( '[' ) )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:501:1: ( '[' )
            {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:501:1: ( '[' )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:502:1: '['
            {
             before(grammarAccess.getEmployeeListTypeAccess().getLeftSquareBracketKeyword_3_1()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__EmployeeListType__Group_3__1__Impl959); 
             after(grammarAccess.getEmployeeListTypeAccess().getLeftSquareBracketKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmployeeListType__Group_3__1__Impl"


    // $ANTLR start "rule__EmployeeListType__Group_3__2"
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:515:1: rule__EmployeeListType__Group_3__2 : rule__EmployeeListType__Group_3__2__Impl rule__EmployeeListType__Group_3__3 ;
    public final void rule__EmployeeListType__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:519:1: ( rule__EmployeeListType__Group_3__2__Impl rule__EmployeeListType__Group_3__3 )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:520:2: rule__EmployeeListType__Group_3__2__Impl rule__EmployeeListType__Group_3__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmployeeListType__Group_3__2__Impl_in_rule__EmployeeListType__Group_3__2990);
            rule__EmployeeListType__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EmployeeListType__Group_3__3_in_rule__EmployeeListType__Group_3__2993);
            rule__EmployeeListType__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmployeeListType__Group_3__2"


    // $ANTLR start "rule__EmployeeListType__Group_3__2__Impl"
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:527:1: rule__EmployeeListType__Group_3__2__Impl : ( ( rule__EmployeeListType__BossAssignment_3_2 ) ) ;
    public final void rule__EmployeeListType__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:531:1: ( ( ( rule__EmployeeListType__BossAssignment_3_2 ) ) )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:532:1: ( ( rule__EmployeeListType__BossAssignment_3_2 ) )
            {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:532:1: ( ( rule__EmployeeListType__BossAssignment_3_2 ) )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:533:1: ( rule__EmployeeListType__BossAssignment_3_2 )
            {
             before(grammarAccess.getEmployeeListTypeAccess().getBossAssignment_3_2()); 
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:534:1: ( rule__EmployeeListType__BossAssignment_3_2 )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:534:2: rule__EmployeeListType__BossAssignment_3_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmployeeListType__BossAssignment_3_2_in_rule__EmployeeListType__Group_3__2__Impl1020);
            rule__EmployeeListType__BossAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getEmployeeListTypeAccess().getBossAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmployeeListType__Group_3__2__Impl"


    // $ANTLR start "rule__EmployeeListType__Group_3__3"
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:544:1: rule__EmployeeListType__Group_3__3 : rule__EmployeeListType__Group_3__3__Impl rule__EmployeeListType__Group_3__4 ;
    public final void rule__EmployeeListType__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:548:1: ( rule__EmployeeListType__Group_3__3__Impl rule__EmployeeListType__Group_3__4 )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:549:2: rule__EmployeeListType__Group_3__3__Impl rule__EmployeeListType__Group_3__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmployeeListType__Group_3__3__Impl_in_rule__EmployeeListType__Group_3__31050);
            rule__EmployeeListType__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EmployeeListType__Group_3__4_in_rule__EmployeeListType__Group_3__31053);
            rule__EmployeeListType__Group_3__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmployeeListType__Group_3__3"


    // $ANTLR start "rule__EmployeeListType__Group_3__3__Impl"
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:556:1: rule__EmployeeListType__Group_3__3__Impl : ( ( rule__EmployeeListType__Group_3_3__0 )* ) ;
    public final void rule__EmployeeListType__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:560:1: ( ( ( rule__EmployeeListType__Group_3_3__0 )* ) )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:561:1: ( ( rule__EmployeeListType__Group_3_3__0 )* )
            {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:561:1: ( ( rule__EmployeeListType__Group_3_3__0 )* )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:562:1: ( rule__EmployeeListType__Group_3_3__0 )*
            {
             before(grammarAccess.getEmployeeListTypeAccess().getGroup_3_3()); 
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:563:1: ( rule__EmployeeListType__Group_3_3__0 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==15) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:563:2: rule__EmployeeListType__Group_3_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__EmployeeListType__Group_3_3__0_in_rule__EmployeeListType__Group_3__3__Impl1080);
            	    rule__EmployeeListType__Group_3_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getEmployeeListTypeAccess().getGroup_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmployeeListType__Group_3__3__Impl"


    // $ANTLR start "rule__EmployeeListType__Group_3__4"
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:573:1: rule__EmployeeListType__Group_3__4 : rule__EmployeeListType__Group_3__4__Impl ;
    public final void rule__EmployeeListType__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:577:1: ( rule__EmployeeListType__Group_3__4__Impl )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:578:2: rule__EmployeeListType__Group_3__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmployeeListType__Group_3__4__Impl_in_rule__EmployeeListType__Group_3__41111);
            rule__EmployeeListType__Group_3__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmployeeListType__Group_3__4"


    // $ANTLR start "rule__EmployeeListType__Group_3__4__Impl"
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:584:1: rule__EmployeeListType__Group_3__4__Impl : ( ']' ) ;
    public final void rule__EmployeeListType__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:588:1: ( ( ']' ) )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:589:1: ( ']' )
            {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:589:1: ( ']' )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:590:1: ']'
            {
             before(grammarAccess.getEmployeeListTypeAccess().getRightSquareBracketKeyword_3_4()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__EmployeeListType__Group_3__4__Impl1139); 
             after(grammarAccess.getEmployeeListTypeAccess().getRightSquareBracketKeyword_3_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmployeeListType__Group_3__4__Impl"


    // $ANTLR start "rule__EmployeeListType__Group_3_3__0"
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:613:1: rule__EmployeeListType__Group_3_3__0 : rule__EmployeeListType__Group_3_3__0__Impl rule__EmployeeListType__Group_3_3__1 ;
    public final void rule__EmployeeListType__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:617:1: ( rule__EmployeeListType__Group_3_3__0__Impl rule__EmployeeListType__Group_3_3__1 )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:618:2: rule__EmployeeListType__Group_3_3__0__Impl rule__EmployeeListType__Group_3_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmployeeListType__Group_3_3__0__Impl_in_rule__EmployeeListType__Group_3_3__01180);
            rule__EmployeeListType__Group_3_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EmployeeListType__Group_3_3__1_in_rule__EmployeeListType__Group_3_3__01183);
            rule__EmployeeListType__Group_3_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmployeeListType__Group_3_3__0"


    // $ANTLR start "rule__EmployeeListType__Group_3_3__0__Impl"
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:625:1: rule__EmployeeListType__Group_3_3__0__Impl : ( ',' ) ;
    public final void rule__EmployeeListType__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:629:1: ( ( ',' ) )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:630:1: ( ',' )
            {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:630:1: ( ',' )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:631:1: ','
            {
             before(grammarAccess.getEmployeeListTypeAccess().getCommaKeyword_3_3_0()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__EmployeeListType__Group_3_3__0__Impl1211); 
             after(grammarAccess.getEmployeeListTypeAccess().getCommaKeyword_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmployeeListType__Group_3_3__0__Impl"


    // $ANTLR start "rule__EmployeeListType__Group_3_3__1"
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:644:1: rule__EmployeeListType__Group_3_3__1 : rule__EmployeeListType__Group_3_3__1__Impl ;
    public final void rule__EmployeeListType__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:648:1: ( rule__EmployeeListType__Group_3_3__1__Impl )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:649:2: rule__EmployeeListType__Group_3_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmployeeListType__Group_3_3__1__Impl_in_rule__EmployeeListType__Group_3_3__11242);
            rule__EmployeeListType__Group_3_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmployeeListType__Group_3_3__1"


    // $ANTLR start "rule__EmployeeListType__Group_3_3__1__Impl"
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:655:1: rule__EmployeeListType__Group_3_3__1__Impl : ( ( rule__EmployeeListType__BossAssignment_3_3_1 ) ) ;
    public final void rule__EmployeeListType__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:659:1: ( ( ( rule__EmployeeListType__BossAssignment_3_3_1 ) ) )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:660:1: ( ( rule__EmployeeListType__BossAssignment_3_3_1 ) )
            {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:660:1: ( ( rule__EmployeeListType__BossAssignment_3_3_1 ) )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:661:1: ( rule__EmployeeListType__BossAssignment_3_3_1 )
            {
             before(grammarAccess.getEmployeeListTypeAccess().getBossAssignment_3_3_1()); 
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:662:1: ( rule__EmployeeListType__BossAssignment_3_3_1 )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:662:2: rule__EmployeeListType__BossAssignment_3_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmployeeListType__BossAssignment_3_3_1_in_rule__EmployeeListType__Group_3_3__1__Impl1269);
            rule__EmployeeListType__BossAssignment_3_3_1();

            state._fsp--;


            }

             after(grammarAccess.getEmployeeListTypeAccess().getBossAssignment_3_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmployeeListType__Group_3_3__1__Impl"


    // $ANTLR start "rule__EmployeeListType__Group_4__0"
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:676:1: rule__EmployeeListType__Group_4__0 : rule__EmployeeListType__Group_4__0__Impl rule__EmployeeListType__Group_4__1 ;
    public final void rule__EmployeeListType__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:680:1: ( rule__EmployeeListType__Group_4__0__Impl rule__EmployeeListType__Group_4__1 )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:681:2: rule__EmployeeListType__Group_4__0__Impl rule__EmployeeListType__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmployeeListType__Group_4__0__Impl_in_rule__EmployeeListType__Group_4__01303);
            rule__EmployeeListType__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EmployeeListType__Group_4__1_in_rule__EmployeeListType__Group_4__01306);
            rule__EmployeeListType__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmployeeListType__Group_4__0"


    // $ANTLR start "rule__EmployeeListType__Group_4__0__Impl"
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:688:1: rule__EmployeeListType__Group_4__0__Impl : ( 'employee' ) ;
    public final void rule__EmployeeListType__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:692:1: ( ( 'employee' ) )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:693:1: ( 'employee' )
            {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:693:1: ( 'employee' )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:694:1: 'employee'
            {
             before(grammarAccess.getEmployeeListTypeAccess().getEmployeeKeyword_4_0()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__EmployeeListType__Group_4__0__Impl1334); 
             after(grammarAccess.getEmployeeListTypeAccess().getEmployeeKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmployeeListType__Group_4__0__Impl"


    // $ANTLR start "rule__EmployeeListType__Group_4__1"
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:707:1: rule__EmployeeListType__Group_4__1 : rule__EmployeeListType__Group_4__1__Impl rule__EmployeeListType__Group_4__2 ;
    public final void rule__EmployeeListType__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:711:1: ( rule__EmployeeListType__Group_4__1__Impl rule__EmployeeListType__Group_4__2 )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:712:2: rule__EmployeeListType__Group_4__1__Impl rule__EmployeeListType__Group_4__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmployeeListType__Group_4__1__Impl_in_rule__EmployeeListType__Group_4__11365);
            rule__EmployeeListType__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EmployeeListType__Group_4__2_in_rule__EmployeeListType__Group_4__11368);
            rule__EmployeeListType__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmployeeListType__Group_4__1"


    // $ANTLR start "rule__EmployeeListType__Group_4__1__Impl"
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:719:1: rule__EmployeeListType__Group_4__1__Impl : ( '[' ) ;
    public final void rule__EmployeeListType__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:723:1: ( ( '[' ) )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:724:1: ( '[' )
            {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:724:1: ( '[' )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:725:1: '['
            {
             before(grammarAccess.getEmployeeListTypeAccess().getLeftSquareBracketKeyword_4_1()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__EmployeeListType__Group_4__1__Impl1396); 
             after(grammarAccess.getEmployeeListTypeAccess().getLeftSquareBracketKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmployeeListType__Group_4__1__Impl"


    // $ANTLR start "rule__EmployeeListType__Group_4__2"
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:738:1: rule__EmployeeListType__Group_4__2 : rule__EmployeeListType__Group_4__2__Impl rule__EmployeeListType__Group_4__3 ;
    public final void rule__EmployeeListType__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:742:1: ( rule__EmployeeListType__Group_4__2__Impl rule__EmployeeListType__Group_4__3 )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:743:2: rule__EmployeeListType__Group_4__2__Impl rule__EmployeeListType__Group_4__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmployeeListType__Group_4__2__Impl_in_rule__EmployeeListType__Group_4__21427);
            rule__EmployeeListType__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EmployeeListType__Group_4__3_in_rule__EmployeeListType__Group_4__21430);
            rule__EmployeeListType__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmployeeListType__Group_4__2"


    // $ANTLR start "rule__EmployeeListType__Group_4__2__Impl"
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:750:1: rule__EmployeeListType__Group_4__2__Impl : ( ( rule__EmployeeListType__EmployeeAssignment_4_2 ) ) ;
    public final void rule__EmployeeListType__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:754:1: ( ( ( rule__EmployeeListType__EmployeeAssignment_4_2 ) ) )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:755:1: ( ( rule__EmployeeListType__EmployeeAssignment_4_2 ) )
            {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:755:1: ( ( rule__EmployeeListType__EmployeeAssignment_4_2 ) )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:756:1: ( rule__EmployeeListType__EmployeeAssignment_4_2 )
            {
             before(grammarAccess.getEmployeeListTypeAccess().getEmployeeAssignment_4_2()); 
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:757:1: ( rule__EmployeeListType__EmployeeAssignment_4_2 )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:757:2: rule__EmployeeListType__EmployeeAssignment_4_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmployeeListType__EmployeeAssignment_4_2_in_rule__EmployeeListType__Group_4__2__Impl1457);
            rule__EmployeeListType__EmployeeAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getEmployeeListTypeAccess().getEmployeeAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmployeeListType__Group_4__2__Impl"


    // $ANTLR start "rule__EmployeeListType__Group_4__3"
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:767:1: rule__EmployeeListType__Group_4__3 : rule__EmployeeListType__Group_4__3__Impl rule__EmployeeListType__Group_4__4 ;
    public final void rule__EmployeeListType__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:771:1: ( rule__EmployeeListType__Group_4__3__Impl rule__EmployeeListType__Group_4__4 )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:772:2: rule__EmployeeListType__Group_4__3__Impl rule__EmployeeListType__Group_4__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmployeeListType__Group_4__3__Impl_in_rule__EmployeeListType__Group_4__31487);
            rule__EmployeeListType__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EmployeeListType__Group_4__4_in_rule__EmployeeListType__Group_4__31490);
            rule__EmployeeListType__Group_4__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmployeeListType__Group_4__3"


    // $ANTLR start "rule__EmployeeListType__Group_4__3__Impl"
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:779:1: rule__EmployeeListType__Group_4__3__Impl : ( ( rule__EmployeeListType__Group_4_3__0 )* ) ;
    public final void rule__EmployeeListType__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:783:1: ( ( ( rule__EmployeeListType__Group_4_3__0 )* ) )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:784:1: ( ( rule__EmployeeListType__Group_4_3__0 )* )
            {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:784:1: ( ( rule__EmployeeListType__Group_4_3__0 )* )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:785:1: ( rule__EmployeeListType__Group_4_3__0 )*
            {
             before(grammarAccess.getEmployeeListTypeAccess().getGroup_4_3()); 
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:786:1: ( rule__EmployeeListType__Group_4_3__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==15) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:786:2: rule__EmployeeListType__Group_4_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__EmployeeListType__Group_4_3__0_in_rule__EmployeeListType__Group_4__3__Impl1517);
            	    rule__EmployeeListType__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getEmployeeListTypeAccess().getGroup_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmployeeListType__Group_4__3__Impl"


    // $ANTLR start "rule__EmployeeListType__Group_4__4"
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:796:1: rule__EmployeeListType__Group_4__4 : rule__EmployeeListType__Group_4__4__Impl ;
    public final void rule__EmployeeListType__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:800:1: ( rule__EmployeeListType__Group_4__4__Impl )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:801:2: rule__EmployeeListType__Group_4__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmployeeListType__Group_4__4__Impl_in_rule__EmployeeListType__Group_4__41548);
            rule__EmployeeListType__Group_4__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmployeeListType__Group_4__4"


    // $ANTLR start "rule__EmployeeListType__Group_4__4__Impl"
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:807:1: rule__EmployeeListType__Group_4__4__Impl : ( ']' ) ;
    public final void rule__EmployeeListType__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:811:1: ( ( ']' ) )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:812:1: ( ']' )
            {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:812:1: ( ']' )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:813:1: ']'
            {
             before(grammarAccess.getEmployeeListTypeAccess().getRightSquareBracketKeyword_4_4()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__EmployeeListType__Group_4__4__Impl1576); 
             after(grammarAccess.getEmployeeListTypeAccess().getRightSquareBracketKeyword_4_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmployeeListType__Group_4__4__Impl"


    // $ANTLR start "rule__EmployeeListType__Group_4_3__0"
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:836:1: rule__EmployeeListType__Group_4_3__0 : rule__EmployeeListType__Group_4_3__0__Impl rule__EmployeeListType__Group_4_3__1 ;
    public final void rule__EmployeeListType__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:840:1: ( rule__EmployeeListType__Group_4_3__0__Impl rule__EmployeeListType__Group_4_3__1 )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:841:2: rule__EmployeeListType__Group_4_3__0__Impl rule__EmployeeListType__Group_4_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmployeeListType__Group_4_3__0__Impl_in_rule__EmployeeListType__Group_4_3__01617);
            rule__EmployeeListType__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EmployeeListType__Group_4_3__1_in_rule__EmployeeListType__Group_4_3__01620);
            rule__EmployeeListType__Group_4_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmployeeListType__Group_4_3__0"


    // $ANTLR start "rule__EmployeeListType__Group_4_3__0__Impl"
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:848:1: rule__EmployeeListType__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__EmployeeListType__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:852:1: ( ( ',' ) )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:853:1: ( ',' )
            {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:853:1: ( ',' )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:854:1: ','
            {
             before(grammarAccess.getEmployeeListTypeAccess().getCommaKeyword_4_3_0()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__EmployeeListType__Group_4_3__0__Impl1648); 
             after(grammarAccess.getEmployeeListTypeAccess().getCommaKeyword_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmployeeListType__Group_4_3__0__Impl"


    // $ANTLR start "rule__EmployeeListType__Group_4_3__1"
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:867:1: rule__EmployeeListType__Group_4_3__1 : rule__EmployeeListType__Group_4_3__1__Impl ;
    public final void rule__EmployeeListType__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:871:1: ( rule__EmployeeListType__Group_4_3__1__Impl )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:872:2: rule__EmployeeListType__Group_4_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmployeeListType__Group_4_3__1__Impl_in_rule__EmployeeListType__Group_4_3__11679);
            rule__EmployeeListType__Group_4_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmployeeListType__Group_4_3__1"


    // $ANTLR start "rule__EmployeeListType__Group_4_3__1__Impl"
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:878:1: rule__EmployeeListType__Group_4_3__1__Impl : ( ( rule__EmployeeListType__EmployeeAssignment_4_3_1 ) ) ;
    public final void rule__EmployeeListType__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:882:1: ( ( ( rule__EmployeeListType__EmployeeAssignment_4_3_1 ) ) )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:883:1: ( ( rule__EmployeeListType__EmployeeAssignment_4_3_1 ) )
            {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:883:1: ( ( rule__EmployeeListType__EmployeeAssignment_4_3_1 ) )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:884:1: ( rule__EmployeeListType__EmployeeAssignment_4_3_1 )
            {
             before(grammarAccess.getEmployeeListTypeAccess().getEmployeeAssignment_4_3_1()); 
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:885:1: ( rule__EmployeeListType__EmployeeAssignment_4_3_1 )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:885:2: rule__EmployeeListType__EmployeeAssignment_4_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmployeeListType__EmployeeAssignment_4_3_1_in_rule__EmployeeListType__Group_4_3__1__Impl1706);
            rule__EmployeeListType__EmployeeAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getEmployeeListTypeAccess().getEmployeeAssignment_4_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmployeeListType__Group_4_3__1__Impl"


    // $ANTLR start "rule__BossType__Group__0"
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:899:1: rule__BossType__Group__0 : rule__BossType__Group__0__Impl rule__BossType__Group__1 ;
    public final void rule__BossType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:903:1: ( rule__BossType__Group__0__Impl rule__BossType__Group__1 )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:904:2: rule__BossType__Group__0__Impl rule__BossType__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BossType__Group__0__Impl_in_rule__BossType__Group__01740);
            rule__BossType__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BossType__Group__1_in_rule__BossType__Group__01743);
            rule__BossType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BossType__Group__0"


    // $ANTLR start "rule__BossType__Group__0__Impl"
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:911:1: rule__BossType__Group__0__Impl : ( 'BossType' ) ;
    public final void rule__BossType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:915:1: ( ( 'BossType' ) )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:916:1: ( 'BossType' )
            {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:916:1: ( 'BossType' )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:917:1: 'BossType'
            {
             before(grammarAccess.getBossTypeAccess().getBossTypeKeyword_0()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__BossType__Group__0__Impl1771); 
             after(grammarAccess.getBossTypeAccess().getBossTypeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BossType__Group__0__Impl"


    // $ANTLR start "rule__BossType__Group__1"
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:930:1: rule__BossType__Group__1 : rule__BossType__Group__1__Impl rule__BossType__Group__2 ;
    public final void rule__BossType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:934:1: ( rule__BossType__Group__1__Impl rule__BossType__Group__2 )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:935:2: rule__BossType__Group__1__Impl rule__BossType__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__BossType__Group__1__Impl_in_rule__BossType__Group__11802);
            rule__BossType__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BossType__Group__2_in_rule__BossType__Group__11805);
            rule__BossType__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BossType__Group__1"


    // $ANTLR start "rule__BossType__Group__1__Impl"
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:942:1: rule__BossType__Group__1__Impl : ( '[' ) ;
    public final void rule__BossType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:946:1: ( ( '[' ) )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:947:1: ( '[' )
            {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:947:1: ( '[' )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:948:1: '['
            {
             before(grammarAccess.getBossTypeAccess().getLeftSquareBracketKeyword_1()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__BossType__Group__1__Impl1833); 
             after(grammarAccess.getBossTypeAccess().getLeftSquareBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BossType__Group__1__Impl"


    // $ANTLR start "rule__BossType__Group__2"
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:961:1: rule__BossType__Group__2 : rule__BossType__Group__2__Impl rule__BossType__Group__3 ;
    public final void rule__BossType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:965:1: ( rule__BossType__Group__2__Impl rule__BossType__Group__3 )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:966:2: rule__BossType__Group__2__Impl rule__BossType__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__BossType__Group__2__Impl_in_rule__BossType__Group__21864);
            rule__BossType__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BossType__Group__3_in_rule__BossType__Group__21867);
            rule__BossType__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BossType__Group__2"


    // $ANTLR start "rule__BossType__Group__2__Impl"
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:973:1: rule__BossType__Group__2__Impl : ( 'lastName' ) ;
    public final void rule__BossType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:977:1: ( ( 'lastName' ) )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:978:1: ( 'lastName' )
            {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:978:1: ( 'lastName' )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:979:1: 'lastName'
            {
             before(grammarAccess.getBossTypeAccess().getLastNameKeyword_2()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__BossType__Group__2__Impl1895); 
             after(grammarAccess.getBossTypeAccess().getLastNameKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BossType__Group__2__Impl"


    // $ANTLR start "rule__BossType__Group__3"
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:992:1: rule__BossType__Group__3 : rule__BossType__Group__3__Impl rule__BossType__Group__4 ;
    public final void rule__BossType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:996:1: ( rule__BossType__Group__3__Impl rule__BossType__Group__4 )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:997:2: rule__BossType__Group__3__Impl rule__BossType__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__BossType__Group__3__Impl_in_rule__BossType__Group__31926);
            rule__BossType__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BossType__Group__4_in_rule__BossType__Group__31929);
            rule__BossType__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BossType__Group__3"


    // $ANTLR start "rule__BossType__Group__3__Impl"
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1004:1: rule__BossType__Group__3__Impl : ( ( rule__BossType__LastNameAssignment_3 ) ) ;
    public final void rule__BossType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1008:1: ( ( ( rule__BossType__LastNameAssignment_3 ) ) )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1009:1: ( ( rule__BossType__LastNameAssignment_3 ) )
            {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1009:1: ( ( rule__BossType__LastNameAssignment_3 ) )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1010:1: ( rule__BossType__LastNameAssignment_3 )
            {
             before(grammarAccess.getBossTypeAccess().getLastNameAssignment_3()); 
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1011:1: ( rule__BossType__LastNameAssignment_3 )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1011:2: rule__BossType__LastNameAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__BossType__LastNameAssignment_3_in_rule__BossType__Group__3__Impl1956);
            rule__BossType__LastNameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getBossTypeAccess().getLastNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BossType__Group__3__Impl"


    // $ANTLR start "rule__BossType__Group__4"
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1021:1: rule__BossType__Group__4 : rule__BossType__Group__4__Impl rule__BossType__Group__5 ;
    public final void rule__BossType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1025:1: ( rule__BossType__Group__4__Impl rule__BossType__Group__5 )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1026:2: rule__BossType__Group__4__Impl rule__BossType__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__BossType__Group__4__Impl_in_rule__BossType__Group__41986);
            rule__BossType__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BossType__Group__5_in_rule__BossType__Group__41989);
            rule__BossType__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BossType__Group__4"


    // $ANTLR start "rule__BossType__Group__4__Impl"
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1033:1: rule__BossType__Group__4__Impl : ( 'birthDate' ) ;
    public final void rule__BossType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1037:1: ( ( 'birthDate' ) )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1038:1: ( 'birthDate' )
            {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1038:1: ( 'birthDate' )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1039:1: 'birthDate'
            {
             before(grammarAccess.getBossTypeAccess().getBirthDateKeyword_4()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__BossType__Group__4__Impl2017); 
             after(grammarAccess.getBossTypeAccess().getBirthDateKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BossType__Group__4__Impl"


    // $ANTLR start "rule__BossType__Group__5"
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1052:1: rule__BossType__Group__5 : rule__BossType__Group__5__Impl rule__BossType__Group__6 ;
    public final void rule__BossType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1056:1: ( rule__BossType__Group__5__Impl rule__BossType__Group__6 )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1057:2: rule__BossType__Group__5__Impl rule__BossType__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__BossType__Group__5__Impl_in_rule__BossType__Group__52048);
            rule__BossType__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BossType__Group__6_in_rule__BossType__Group__52051);
            rule__BossType__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BossType__Group__5"


    // $ANTLR start "rule__BossType__Group__5__Impl"
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1064:1: rule__BossType__Group__5__Impl : ( ( rule__BossType__BirthDateAssignment_5 ) ) ;
    public final void rule__BossType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1068:1: ( ( ( rule__BossType__BirthDateAssignment_5 ) ) )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1069:1: ( ( rule__BossType__BirthDateAssignment_5 ) )
            {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1069:1: ( ( rule__BossType__BirthDateAssignment_5 ) )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1070:1: ( rule__BossType__BirthDateAssignment_5 )
            {
             before(grammarAccess.getBossTypeAccess().getBirthDateAssignment_5()); 
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1071:1: ( rule__BossType__BirthDateAssignment_5 )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1071:2: rule__BossType__BirthDateAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__BossType__BirthDateAssignment_5_in_rule__BossType__Group__5__Impl2078);
            rule__BossType__BirthDateAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getBossTypeAccess().getBirthDateAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BossType__Group__5__Impl"


    // $ANTLR start "rule__BossType__Group__6"
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1081:1: rule__BossType__Group__6 : rule__BossType__Group__6__Impl rule__BossType__Group__7 ;
    public final void rule__BossType__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1085:1: ( rule__BossType__Group__6__Impl rule__BossType__Group__7 )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1086:2: rule__BossType__Group__6__Impl rule__BossType__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__BossType__Group__6__Impl_in_rule__BossType__Group__62108);
            rule__BossType__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BossType__Group__7_in_rule__BossType__Group__62111);
            rule__BossType__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BossType__Group__6"


    // $ANTLR start "rule__BossType__Group__6__Impl"
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1093:1: rule__BossType__Group__6__Impl : ( 'superBoss' ) ;
    public final void rule__BossType__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1097:1: ( ( 'superBoss' ) )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1098:1: ( 'superBoss' )
            {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1098:1: ( 'superBoss' )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1099:1: 'superBoss'
            {
             before(grammarAccess.getBossTypeAccess().getSuperBossKeyword_6()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__BossType__Group__6__Impl2139); 
             after(grammarAccess.getBossTypeAccess().getSuperBossKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BossType__Group__6__Impl"


    // $ANTLR start "rule__BossType__Group__7"
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1112:1: rule__BossType__Group__7 : rule__BossType__Group__7__Impl rule__BossType__Group__8 ;
    public final void rule__BossType__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1116:1: ( rule__BossType__Group__7__Impl rule__BossType__Group__8 )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1117:2: rule__BossType__Group__7__Impl rule__BossType__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__BossType__Group__7__Impl_in_rule__BossType__Group__72170);
            rule__BossType__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BossType__Group__8_in_rule__BossType__Group__72173);
            rule__BossType__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BossType__Group__7"


    // $ANTLR start "rule__BossType__Group__7__Impl"
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1124:1: rule__BossType__Group__7__Impl : ( ( rule__BossType__SuperBossAssignment_7 ) ) ;
    public final void rule__BossType__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1128:1: ( ( ( rule__BossType__SuperBossAssignment_7 ) ) )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1129:1: ( ( rule__BossType__SuperBossAssignment_7 ) )
            {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1129:1: ( ( rule__BossType__SuperBossAssignment_7 ) )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1130:1: ( rule__BossType__SuperBossAssignment_7 )
            {
             before(grammarAccess.getBossTypeAccess().getSuperBossAssignment_7()); 
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1131:1: ( rule__BossType__SuperBossAssignment_7 )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1131:2: rule__BossType__SuperBossAssignment_7
            {
            pushFollow(FollowSets000.FOLLOW_rule__BossType__SuperBossAssignment_7_in_rule__BossType__Group__7__Impl2200);
            rule__BossType__SuperBossAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getBossTypeAccess().getSuperBossAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BossType__Group__7__Impl"


    // $ANTLR start "rule__BossType__Group__8"
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1141:1: rule__BossType__Group__8 : rule__BossType__Group__8__Impl rule__BossType__Group__9 ;
    public final void rule__BossType__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1145:1: ( rule__BossType__Group__8__Impl rule__BossType__Group__9 )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1146:2: rule__BossType__Group__8__Impl rule__BossType__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__BossType__Group__8__Impl_in_rule__BossType__Group__82230);
            rule__BossType__Group__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BossType__Group__9_in_rule__BossType__Group__82233);
            rule__BossType__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BossType__Group__8"


    // $ANTLR start "rule__BossType__Group__8__Impl"
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1153:1: rule__BossType__Group__8__Impl : ( 'bossId' ) ;
    public final void rule__BossType__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1157:1: ( ( 'bossId' ) )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1158:1: ( 'bossId' )
            {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1158:1: ( 'bossId' )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1159:1: 'bossId'
            {
             before(grammarAccess.getBossTypeAccess().getBossIdKeyword_8()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__BossType__Group__8__Impl2261); 
             after(grammarAccess.getBossTypeAccess().getBossIdKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BossType__Group__8__Impl"


    // $ANTLR start "rule__BossType__Group__9"
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1172:1: rule__BossType__Group__9 : rule__BossType__Group__9__Impl rule__BossType__Group__10 ;
    public final void rule__BossType__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1176:1: ( rule__BossType__Group__9__Impl rule__BossType__Group__10 )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1177:2: rule__BossType__Group__9__Impl rule__BossType__Group__10
            {
            pushFollow(FollowSets000.FOLLOW_rule__BossType__Group__9__Impl_in_rule__BossType__Group__92292);
            rule__BossType__Group__9__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BossType__Group__10_in_rule__BossType__Group__92295);
            rule__BossType__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BossType__Group__9"


    // $ANTLR start "rule__BossType__Group__9__Impl"
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1184:1: rule__BossType__Group__9__Impl : ( ( rule__BossType__BossIdAssignment_9 ) ) ;
    public final void rule__BossType__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1188:1: ( ( ( rule__BossType__BossIdAssignment_9 ) ) )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1189:1: ( ( rule__BossType__BossIdAssignment_9 ) )
            {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1189:1: ( ( rule__BossType__BossIdAssignment_9 ) )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1190:1: ( rule__BossType__BossIdAssignment_9 )
            {
             before(grammarAccess.getBossTypeAccess().getBossIdAssignment_9()); 
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1191:1: ( rule__BossType__BossIdAssignment_9 )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1191:2: rule__BossType__BossIdAssignment_9
            {
            pushFollow(FollowSets000.FOLLOW_rule__BossType__BossIdAssignment_9_in_rule__BossType__Group__9__Impl2322);
            rule__BossType__BossIdAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getBossTypeAccess().getBossIdAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BossType__Group__9__Impl"


    // $ANTLR start "rule__BossType__Group__10"
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1201:1: rule__BossType__Group__10 : rule__BossType__Group__10__Impl ;
    public final void rule__BossType__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1205:1: ( rule__BossType__Group__10__Impl )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1206:2: rule__BossType__Group__10__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__BossType__Group__10__Impl_in_rule__BossType__Group__102352);
            rule__BossType__Group__10__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BossType__Group__10"


    // $ANTLR start "rule__BossType__Group__10__Impl"
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1212:1: rule__BossType__Group__10__Impl : ( ']' ) ;
    public final void rule__BossType__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1216:1: ( ( ']' ) )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1217:1: ( ']' )
            {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1217:1: ( ']' )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1218:1: ']'
            {
             before(grammarAccess.getBossTypeAccess().getRightSquareBracketKeyword_10()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__BossType__Group__10__Impl2380); 
             after(grammarAccess.getBossTypeAccess().getRightSquareBracketKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BossType__Group__10__Impl"


    // $ANTLR start "rule__EmployeeType__Group__0"
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1253:1: rule__EmployeeType__Group__0 : rule__EmployeeType__Group__0__Impl rule__EmployeeType__Group__1 ;
    public final void rule__EmployeeType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1257:1: ( rule__EmployeeType__Group__0__Impl rule__EmployeeType__Group__1 )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1258:2: rule__EmployeeType__Group__0__Impl rule__EmployeeType__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmployeeType__Group__0__Impl_in_rule__EmployeeType__Group__02433);
            rule__EmployeeType__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EmployeeType__Group__1_in_rule__EmployeeType__Group__02436);
            rule__EmployeeType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmployeeType__Group__0"


    // $ANTLR start "rule__EmployeeType__Group__0__Impl"
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1265:1: rule__EmployeeType__Group__0__Impl : ( 'EmployeeType' ) ;
    public final void rule__EmployeeType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1269:1: ( ( 'EmployeeType' ) )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1270:1: ( 'EmployeeType' )
            {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1270:1: ( 'EmployeeType' )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1271:1: 'EmployeeType'
            {
             before(grammarAccess.getEmployeeTypeAccess().getEmployeeTypeKeyword_0()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__EmployeeType__Group__0__Impl2464); 
             after(grammarAccess.getEmployeeTypeAccess().getEmployeeTypeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmployeeType__Group__0__Impl"


    // $ANTLR start "rule__EmployeeType__Group__1"
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1284:1: rule__EmployeeType__Group__1 : rule__EmployeeType__Group__1__Impl rule__EmployeeType__Group__2 ;
    public final void rule__EmployeeType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1288:1: ( rule__EmployeeType__Group__1__Impl rule__EmployeeType__Group__2 )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1289:2: rule__EmployeeType__Group__1__Impl rule__EmployeeType__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmployeeType__Group__1__Impl_in_rule__EmployeeType__Group__12495);
            rule__EmployeeType__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EmployeeType__Group__2_in_rule__EmployeeType__Group__12498);
            rule__EmployeeType__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmployeeType__Group__1"


    // $ANTLR start "rule__EmployeeType__Group__1__Impl"
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1296:1: rule__EmployeeType__Group__1__Impl : ( '[' ) ;
    public final void rule__EmployeeType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1300:1: ( ( '[' ) )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1301:1: ( '[' )
            {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1301:1: ( '[' )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1302:1: '['
            {
             before(grammarAccess.getEmployeeTypeAccess().getLeftSquareBracketKeyword_1()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__EmployeeType__Group__1__Impl2526); 
             after(grammarAccess.getEmployeeTypeAccess().getLeftSquareBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmployeeType__Group__1__Impl"


    // $ANTLR start "rule__EmployeeType__Group__2"
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1315:1: rule__EmployeeType__Group__2 : rule__EmployeeType__Group__2__Impl rule__EmployeeType__Group__3 ;
    public final void rule__EmployeeType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1319:1: ( rule__EmployeeType__Group__2__Impl rule__EmployeeType__Group__3 )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1320:2: rule__EmployeeType__Group__2__Impl rule__EmployeeType__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmployeeType__Group__2__Impl_in_rule__EmployeeType__Group__22557);
            rule__EmployeeType__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EmployeeType__Group__3_in_rule__EmployeeType__Group__22560);
            rule__EmployeeType__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmployeeType__Group__2"


    // $ANTLR start "rule__EmployeeType__Group__2__Impl"
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1327:1: rule__EmployeeType__Group__2__Impl : ( 'lastName' ) ;
    public final void rule__EmployeeType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1331:1: ( ( 'lastName' ) )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1332:1: ( 'lastName' )
            {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1332:1: ( 'lastName' )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1333:1: 'lastName'
            {
             before(grammarAccess.getEmployeeTypeAccess().getLastNameKeyword_2()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__EmployeeType__Group__2__Impl2588); 
             after(grammarAccess.getEmployeeTypeAccess().getLastNameKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmployeeType__Group__2__Impl"


    // $ANTLR start "rule__EmployeeType__Group__3"
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1346:1: rule__EmployeeType__Group__3 : rule__EmployeeType__Group__3__Impl rule__EmployeeType__Group__4 ;
    public final void rule__EmployeeType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1350:1: ( rule__EmployeeType__Group__3__Impl rule__EmployeeType__Group__4 )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1351:2: rule__EmployeeType__Group__3__Impl rule__EmployeeType__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmployeeType__Group__3__Impl_in_rule__EmployeeType__Group__32619);
            rule__EmployeeType__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EmployeeType__Group__4_in_rule__EmployeeType__Group__32622);
            rule__EmployeeType__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmployeeType__Group__3"


    // $ANTLR start "rule__EmployeeType__Group__3__Impl"
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1358:1: rule__EmployeeType__Group__3__Impl : ( ( rule__EmployeeType__LastNameAssignment_3 ) ) ;
    public final void rule__EmployeeType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1362:1: ( ( ( rule__EmployeeType__LastNameAssignment_3 ) ) )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1363:1: ( ( rule__EmployeeType__LastNameAssignment_3 ) )
            {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1363:1: ( ( rule__EmployeeType__LastNameAssignment_3 ) )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1364:1: ( rule__EmployeeType__LastNameAssignment_3 )
            {
             before(grammarAccess.getEmployeeTypeAccess().getLastNameAssignment_3()); 
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1365:1: ( rule__EmployeeType__LastNameAssignment_3 )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1365:2: rule__EmployeeType__LastNameAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmployeeType__LastNameAssignment_3_in_rule__EmployeeType__Group__3__Impl2649);
            rule__EmployeeType__LastNameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getEmployeeTypeAccess().getLastNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmployeeType__Group__3__Impl"


    // $ANTLR start "rule__EmployeeType__Group__4"
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1375:1: rule__EmployeeType__Group__4 : rule__EmployeeType__Group__4__Impl rule__EmployeeType__Group__5 ;
    public final void rule__EmployeeType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1379:1: ( rule__EmployeeType__Group__4__Impl rule__EmployeeType__Group__5 )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1380:2: rule__EmployeeType__Group__4__Impl rule__EmployeeType__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmployeeType__Group__4__Impl_in_rule__EmployeeType__Group__42679);
            rule__EmployeeType__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EmployeeType__Group__5_in_rule__EmployeeType__Group__42682);
            rule__EmployeeType__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmployeeType__Group__4"


    // $ANTLR start "rule__EmployeeType__Group__4__Impl"
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1387:1: rule__EmployeeType__Group__4__Impl : ( 'birthDate' ) ;
    public final void rule__EmployeeType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1391:1: ( ( 'birthDate' ) )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1392:1: ( 'birthDate' )
            {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1392:1: ( 'birthDate' )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1393:1: 'birthDate'
            {
             before(grammarAccess.getEmployeeTypeAccess().getBirthDateKeyword_4()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__EmployeeType__Group__4__Impl2710); 
             after(grammarAccess.getEmployeeTypeAccess().getBirthDateKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmployeeType__Group__4__Impl"


    // $ANTLR start "rule__EmployeeType__Group__5"
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1406:1: rule__EmployeeType__Group__5 : rule__EmployeeType__Group__5__Impl rule__EmployeeType__Group__6 ;
    public final void rule__EmployeeType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1410:1: ( rule__EmployeeType__Group__5__Impl rule__EmployeeType__Group__6 )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1411:2: rule__EmployeeType__Group__5__Impl rule__EmployeeType__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmployeeType__Group__5__Impl_in_rule__EmployeeType__Group__52741);
            rule__EmployeeType__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EmployeeType__Group__6_in_rule__EmployeeType__Group__52744);
            rule__EmployeeType__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmployeeType__Group__5"


    // $ANTLR start "rule__EmployeeType__Group__5__Impl"
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1418:1: rule__EmployeeType__Group__5__Impl : ( ( rule__EmployeeType__BirthDateAssignment_5 ) ) ;
    public final void rule__EmployeeType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1422:1: ( ( ( rule__EmployeeType__BirthDateAssignment_5 ) ) )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1423:1: ( ( rule__EmployeeType__BirthDateAssignment_5 ) )
            {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1423:1: ( ( rule__EmployeeType__BirthDateAssignment_5 ) )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1424:1: ( rule__EmployeeType__BirthDateAssignment_5 )
            {
             before(grammarAccess.getEmployeeTypeAccess().getBirthDateAssignment_5()); 
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1425:1: ( rule__EmployeeType__BirthDateAssignment_5 )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1425:2: rule__EmployeeType__BirthDateAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmployeeType__BirthDateAssignment_5_in_rule__EmployeeType__Group__5__Impl2771);
            rule__EmployeeType__BirthDateAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getEmployeeTypeAccess().getBirthDateAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmployeeType__Group__5__Impl"


    // $ANTLR start "rule__EmployeeType__Group__6"
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1435:1: rule__EmployeeType__Group__6 : rule__EmployeeType__Group__6__Impl rule__EmployeeType__Group__7 ;
    public final void rule__EmployeeType__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1439:1: ( rule__EmployeeType__Group__6__Impl rule__EmployeeType__Group__7 )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1440:2: rule__EmployeeType__Group__6__Impl rule__EmployeeType__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmployeeType__Group__6__Impl_in_rule__EmployeeType__Group__62801);
            rule__EmployeeType__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EmployeeType__Group__7_in_rule__EmployeeType__Group__62804);
            rule__EmployeeType__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmployeeType__Group__6"


    // $ANTLR start "rule__EmployeeType__Group__6__Impl"
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1447:1: rule__EmployeeType__Group__6__Impl : ( 'boss' ) ;
    public final void rule__EmployeeType__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1451:1: ( ( 'boss' ) )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1452:1: ( 'boss' )
            {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1452:1: ( 'boss' )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1453:1: 'boss'
            {
             before(grammarAccess.getEmployeeTypeAccess().getBossKeyword_6()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__EmployeeType__Group__6__Impl2832); 
             after(grammarAccess.getEmployeeTypeAccess().getBossKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmployeeType__Group__6__Impl"


    // $ANTLR start "rule__EmployeeType__Group__7"
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1466:1: rule__EmployeeType__Group__7 : rule__EmployeeType__Group__7__Impl rule__EmployeeType__Group__8 ;
    public final void rule__EmployeeType__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1470:1: ( rule__EmployeeType__Group__7__Impl rule__EmployeeType__Group__8 )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1471:2: rule__EmployeeType__Group__7__Impl rule__EmployeeType__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmployeeType__Group__7__Impl_in_rule__EmployeeType__Group__72863);
            rule__EmployeeType__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EmployeeType__Group__8_in_rule__EmployeeType__Group__72866);
            rule__EmployeeType__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmployeeType__Group__7"


    // $ANTLR start "rule__EmployeeType__Group__7__Impl"
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1478:1: rule__EmployeeType__Group__7__Impl : ( ( rule__EmployeeType__BossAssignment_7 ) ) ;
    public final void rule__EmployeeType__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1482:1: ( ( ( rule__EmployeeType__BossAssignment_7 ) ) )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1483:1: ( ( rule__EmployeeType__BossAssignment_7 ) )
            {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1483:1: ( ( rule__EmployeeType__BossAssignment_7 ) )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1484:1: ( rule__EmployeeType__BossAssignment_7 )
            {
             before(grammarAccess.getEmployeeTypeAccess().getBossAssignment_7()); 
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1485:1: ( rule__EmployeeType__BossAssignment_7 )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1485:2: rule__EmployeeType__BossAssignment_7
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmployeeType__BossAssignment_7_in_rule__EmployeeType__Group__7__Impl2893);
            rule__EmployeeType__BossAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getEmployeeTypeAccess().getBossAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmployeeType__Group__7__Impl"


    // $ANTLR start "rule__EmployeeType__Group__8"
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1495:1: rule__EmployeeType__Group__8 : rule__EmployeeType__Group__8__Impl rule__EmployeeType__Group__9 ;
    public final void rule__EmployeeType__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1499:1: ( rule__EmployeeType__Group__8__Impl rule__EmployeeType__Group__9 )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1500:2: rule__EmployeeType__Group__8__Impl rule__EmployeeType__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmployeeType__Group__8__Impl_in_rule__EmployeeType__Group__82923);
            rule__EmployeeType__Group__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EmployeeType__Group__9_in_rule__EmployeeType__Group__82926);
            rule__EmployeeType__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmployeeType__Group__8"


    // $ANTLR start "rule__EmployeeType__Group__8__Impl"
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1507:1: rule__EmployeeType__Group__8__Impl : ( 'employeeId' ) ;
    public final void rule__EmployeeType__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1511:1: ( ( 'employeeId' ) )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1512:1: ( 'employeeId' )
            {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1512:1: ( 'employeeId' )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1513:1: 'employeeId'
            {
             before(grammarAccess.getEmployeeTypeAccess().getEmployeeIdKeyword_8()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__EmployeeType__Group__8__Impl2954); 
             after(grammarAccess.getEmployeeTypeAccess().getEmployeeIdKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmployeeType__Group__8__Impl"


    // $ANTLR start "rule__EmployeeType__Group__9"
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1526:1: rule__EmployeeType__Group__9 : rule__EmployeeType__Group__9__Impl rule__EmployeeType__Group__10 ;
    public final void rule__EmployeeType__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1530:1: ( rule__EmployeeType__Group__9__Impl rule__EmployeeType__Group__10 )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1531:2: rule__EmployeeType__Group__9__Impl rule__EmployeeType__Group__10
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmployeeType__Group__9__Impl_in_rule__EmployeeType__Group__92985);
            rule__EmployeeType__Group__9__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EmployeeType__Group__10_in_rule__EmployeeType__Group__92988);
            rule__EmployeeType__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmployeeType__Group__9"


    // $ANTLR start "rule__EmployeeType__Group__9__Impl"
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1538:1: rule__EmployeeType__Group__9__Impl : ( ( rule__EmployeeType__EmployeeIdAssignment_9 ) ) ;
    public final void rule__EmployeeType__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1542:1: ( ( ( rule__EmployeeType__EmployeeIdAssignment_9 ) ) )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1543:1: ( ( rule__EmployeeType__EmployeeIdAssignment_9 ) )
            {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1543:1: ( ( rule__EmployeeType__EmployeeIdAssignment_9 ) )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1544:1: ( rule__EmployeeType__EmployeeIdAssignment_9 )
            {
             before(grammarAccess.getEmployeeTypeAccess().getEmployeeIdAssignment_9()); 
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1545:1: ( rule__EmployeeType__EmployeeIdAssignment_9 )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1545:2: rule__EmployeeType__EmployeeIdAssignment_9
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmployeeType__EmployeeIdAssignment_9_in_rule__EmployeeType__Group__9__Impl3015);
            rule__EmployeeType__EmployeeIdAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getEmployeeTypeAccess().getEmployeeIdAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmployeeType__Group__9__Impl"


    // $ANTLR start "rule__EmployeeType__Group__10"
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1555:1: rule__EmployeeType__Group__10 : rule__EmployeeType__Group__10__Impl ;
    public final void rule__EmployeeType__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1559:1: ( rule__EmployeeType__Group__10__Impl )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1560:2: rule__EmployeeType__Group__10__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmployeeType__Group__10__Impl_in_rule__EmployeeType__Group__103045);
            rule__EmployeeType__Group__10__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmployeeType__Group__10"


    // $ANTLR start "rule__EmployeeType__Group__10__Impl"
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1566:1: rule__EmployeeType__Group__10__Impl : ( ']' ) ;
    public final void rule__EmployeeType__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1570:1: ( ( ']' ) )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1571:1: ( ']' )
            {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1571:1: ( ']' )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1572:1: ']'
            {
             before(grammarAccess.getEmployeeTypeAccess().getRightSquareBracketKeyword_10()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__EmployeeType__Group__10__Impl3073); 
             after(grammarAccess.getEmployeeTypeAccess().getRightSquareBracketKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmployeeType__Group__10__Impl"


    // $ANTLR start "rule__IdValues__Group__0"
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1607:1: rule__IdValues__Group__0 : rule__IdValues__Group__0__Impl rule__IdValues__Group__1 ;
    public final void rule__IdValues__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1611:1: ( rule__IdValues__Group__0__Impl rule__IdValues__Group__1 )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1612:2: rule__IdValues__Group__0__Impl rule__IdValues__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__IdValues__Group__0__Impl_in_rule__IdValues__Group__03126);
            rule__IdValues__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__IdValues__Group__1_in_rule__IdValues__Group__03129);
            rule__IdValues__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IdValues__Group__0"


    // $ANTLR start "rule__IdValues__Group__0__Impl"
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1619:1: rule__IdValues__Group__0__Impl : ( () ) ;
    public final void rule__IdValues__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1623:1: ( ( () ) )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1624:1: ( () )
            {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1624:1: ( () )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1625:1: ()
            {
             before(grammarAccess.getIdValuesAccess().getIdValuesAction_0()); 
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1626:1: ()
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1628:1: 
            {
            }

             after(grammarAccess.getIdValuesAccess().getIdValuesAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IdValues__Group__0__Impl"


    // $ANTLR start "rule__IdValues__Group__1"
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1638:1: rule__IdValues__Group__1 : rule__IdValues__Group__1__Impl ;
    public final void rule__IdValues__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1642:1: ( rule__IdValues__Group__1__Impl )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1643:2: rule__IdValues__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__IdValues__Group__1__Impl_in_rule__IdValues__Group__13187);
            rule__IdValues__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IdValues__Group__1"


    // $ANTLR start "rule__IdValues__Group__1__Impl"
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1649:1: rule__IdValues__Group__1__Impl : ( ( rule__IdValues__NameAssignment_1 ) ) ;
    public final void rule__IdValues__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1653:1: ( ( ( rule__IdValues__NameAssignment_1 ) ) )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1654:1: ( ( rule__IdValues__NameAssignment_1 ) )
            {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1654:1: ( ( rule__IdValues__NameAssignment_1 ) )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1655:1: ( rule__IdValues__NameAssignment_1 )
            {
             before(grammarAccess.getIdValuesAccess().getNameAssignment_1()); 
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1656:1: ( rule__IdValues__NameAssignment_1 )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1656:2: rule__IdValues__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__IdValues__NameAssignment_1_in_rule__IdValues__Group__1__Impl3214);
            rule__IdValues__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getIdValuesAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IdValues__Group__1__Impl"


    // $ANTLR start "rule__Date__Group__0"
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1670:1: rule__Date__Group__0 : rule__Date__Group__0__Impl rule__Date__Group__1 ;
    public final void rule__Date__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1674:1: ( rule__Date__Group__0__Impl rule__Date__Group__1 )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1675:2: rule__Date__Group__0__Impl rule__Date__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Date__Group__0__Impl_in_rule__Date__Group__03248);
            rule__Date__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Date__Group__1_in_rule__Date__Group__03251);
            rule__Date__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Date__Group__0"


    // $ANTLR start "rule__Date__Group__0__Impl"
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1682:1: rule__Date__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__Date__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1686:1: ( ( RULE_INT ) )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1687:1: ( RULE_INT )
            {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1687:1: ( RULE_INT )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1688:1: RULE_INT
            {
             before(grammarAccess.getDateAccess().getINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__Date__Group__0__Impl3278); 
             after(grammarAccess.getDateAccess().getINTTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Date__Group__0__Impl"


    // $ANTLR start "rule__Date__Group__1"
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1699:1: rule__Date__Group__1 : rule__Date__Group__1__Impl rule__Date__Group__2 ;
    public final void rule__Date__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1703:1: ( rule__Date__Group__1__Impl rule__Date__Group__2 )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1704:2: rule__Date__Group__1__Impl rule__Date__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Date__Group__1__Impl_in_rule__Date__Group__13307);
            rule__Date__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Date__Group__2_in_rule__Date__Group__13310);
            rule__Date__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Date__Group__1"


    // $ANTLR start "rule__Date__Group__1__Impl"
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1711:1: rule__Date__Group__1__Impl : ( '-' ) ;
    public final void rule__Date__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1715:1: ( ( '-' ) )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1716:1: ( '-' )
            {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1716:1: ( '-' )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1717:1: '-'
            {
             before(grammarAccess.getDateAccess().getHyphenMinusKeyword_1()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__Date__Group__1__Impl3338); 
             after(grammarAccess.getDateAccess().getHyphenMinusKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Date__Group__1__Impl"


    // $ANTLR start "rule__Date__Group__2"
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1730:1: rule__Date__Group__2 : rule__Date__Group__2__Impl rule__Date__Group__3 ;
    public final void rule__Date__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1734:1: ( rule__Date__Group__2__Impl rule__Date__Group__3 )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1735:2: rule__Date__Group__2__Impl rule__Date__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Date__Group__2__Impl_in_rule__Date__Group__23369);
            rule__Date__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Date__Group__3_in_rule__Date__Group__23372);
            rule__Date__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Date__Group__2"


    // $ANTLR start "rule__Date__Group__2__Impl"
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1742:1: rule__Date__Group__2__Impl : ( RULE_INT ) ;
    public final void rule__Date__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1746:1: ( ( RULE_INT ) )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1747:1: ( RULE_INT )
            {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1747:1: ( RULE_INT )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1748:1: RULE_INT
            {
             before(grammarAccess.getDateAccess().getINTTerminalRuleCall_2()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__Date__Group__2__Impl3399); 
             after(grammarAccess.getDateAccess().getINTTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Date__Group__2__Impl"


    // $ANTLR start "rule__Date__Group__3"
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1759:1: rule__Date__Group__3 : rule__Date__Group__3__Impl rule__Date__Group__4 ;
    public final void rule__Date__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1763:1: ( rule__Date__Group__3__Impl rule__Date__Group__4 )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1764:2: rule__Date__Group__3__Impl rule__Date__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Date__Group__3__Impl_in_rule__Date__Group__33428);
            rule__Date__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Date__Group__4_in_rule__Date__Group__33431);
            rule__Date__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Date__Group__3"


    // $ANTLR start "rule__Date__Group__3__Impl"
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1771:1: rule__Date__Group__3__Impl : ( '-' ) ;
    public final void rule__Date__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1775:1: ( ( '-' ) )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1776:1: ( '-' )
            {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1776:1: ( '-' )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1777:1: '-'
            {
             before(grammarAccess.getDateAccess().getHyphenMinusKeyword_3()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__Date__Group__3__Impl3459); 
             after(grammarAccess.getDateAccess().getHyphenMinusKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Date__Group__3__Impl"


    // $ANTLR start "rule__Date__Group__4"
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1790:1: rule__Date__Group__4 : rule__Date__Group__4__Impl ;
    public final void rule__Date__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1794:1: ( rule__Date__Group__4__Impl )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1795:2: rule__Date__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Date__Group__4__Impl_in_rule__Date__Group__43490);
            rule__Date__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Date__Group__4"


    // $ANTLR start "rule__Date__Group__4__Impl"
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1801:1: rule__Date__Group__4__Impl : ( RULE_INT ) ;
    public final void rule__Date__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1805:1: ( ( RULE_INT ) )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1806:1: ( RULE_INT )
            {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1806:1: ( RULE_INT )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1807:1: RULE_INT
            {
             before(grammarAccess.getDateAccess().getINTTerminalRuleCall_4()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__Date__Group__4__Impl3517); 
             after(grammarAccess.getDateAccess().getINTTerminalRuleCall_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Date__Group__4__Impl"


    // $ANTLR start "rule__EmployeeListType__BossAssignment_3_2"
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1829:1: rule__EmployeeListType__BossAssignment_3_2 : ( ruleBossType ) ;
    public final void rule__EmployeeListType__BossAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1833:1: ( ( ruleBossType ) )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1834:1: ( ruleBossType )
            {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1834:1: ( ruleBossType )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1835:1: ruleBossType
            {
             before(grammarAccess.getEmployeeListTypeAccess().getBossBossTypeParserRuleCall_3_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleBossType_in_rule__EmployeeListType__BossAssignment_3_23561);
            ruleBossType();

            state._fsp--;

             after(grammarAccess.getEmployeeListTypeAccess().getBossBossTypeParserRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmployeeListType__BossAssignment_3_2"


    // $ANTLR start "rule__EmployeeListType__BossAssignment_3_3_1"
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1844:1: rule__EmployeeListType__BossAssignment_3_3_1 : ( ruleBossType ) ;
    public final void rule__EmployeeListType__BossAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1848:1: ( ( ruleBossType ) )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1849:1: ( ruleBossType )
            {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1849:1: ( ruleBossType )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1850:1: ruleBossType
            {
             before(grammarAccess.getEmployeeListTypeAccess().getBossBossTypeParserRuleCall_3_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleBossType_in_rule__EmployeeListType__BossAssignment_3_3_13592);
            ruleBossType();

            state._fsp--;

             after(grammarAccess.getEmployeeListTypeAccess().getBossBossTypeParserRuleCall_3_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmployeeListType__BossAssignment_3_3_1"


    // $ANTLR start "rule__EmployeeListType__EmployeeAssignment_4_2"
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1859:1: rule__EmployeeListType__EmployeeAssignment_4_2 : ( ruleEmployeeType ) ;
    public final void rule__EmployeeListType__EmployeeAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1863:1: ( ( ruleEmployeeType ) )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1864:1: ( ruleEmployeeType )
            {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1864:1: ( ruleEmployeeType )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1865:1: ruleEmployeeType
            {
             before(grammarAccess.getEmployeeListTypeAccess().getEmployeeEmployeeTypeParserRuleCall_4_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEmployeeType_in_rule__EmployeeListType__EmployeeAssignment_4_23623);
            ruleEmployeeType();

            state._fsp--;

             after(grammarAccess.getEmployeeListTypeAccess().getEmployeeEmployeeTypeParserRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmployeeListType__EmployeeAssignment_4_2"


    // $ANTLR start "rule__EmployeeListType__EmployeeAssignment_4_3_1"
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1874:1: rule__EmployeeListType__EmployeeAssignment_4_3_1 : ( ruleEmployeeType ) ;
    public final void rule__EmployeeListType__EmployeeAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1878:1: ( ( ruleEmployeeType ) )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1879:1: ( ruleEmployeeType )
            {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1879:1: ( ruleEmployeeType )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1880:1: ruleEmployeeType
            {
             before(grammarAccess.getEmployeeListTypeAccess().getEmployeeEmployeeTypeParserRuleCall_4_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEmployeeType_in_rule__EmployeeListType__EmployeeAssignment_4_3_13654);
            ruleEmployeeType();

            state._fsp--;

             after(grammarAccess.getEmployeeListTypeAccess().getEmployeeEmployeeTypeParserRuleCall_4_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmployeeListType__EmployeeAssignment_4_3_1"


    // $ANTLR start "rule__BossType__LastNameAssignment_3"
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1889:1: rule__BossType__LastNameAssignment_3 : ( ruleString0 ) ;
    public final void rule__BossType__LastNameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1893:1: ( ( ruleString0 ) )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1894:1: ( ruleString0 )
            {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1894:1: ( ruleString0 )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1895:1: ruleString0
            {
             before(grammarAccess.getBossTypeAccess().getLastNameString0ParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleString0_in_rule__BossType__LastNameAssignment_33685);
            ruleString0();

            state._fsp--;

             after(grammarAccess.getBossTypeAccess().getLastNameString0ParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BossType__LastNameAssignment_3"


    // $ANTLR start "rule__BossType__BirthDateAssignment_5"
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1904:1: rule__BossType__BirthDateAssignment_5 : ( ruleDate ) ;
    public final void rule__BossType__BirthDateAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1908:1: ( ( ruleDate ) )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1909:1: ( ruleDate )
            {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1909:1: ( ruleDate )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1910:1: ruleDate
            {
             before(grammarAccess.getBossTypeAccess().getBirthDateDateParserRuleCall_5_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleDate_in_rule__BossType__BirthDateAssignment_53716);
            ruleDate();

            state._fsp--;

             after(grammarAccess.getBossTypeAccess().getBirthDateDateParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BossType__BirthDateAssignment_5"


    // $ANTLR start "rule__BossType__SuperBossAssignment_7"
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1919:1: rule__BossType__SuperBossAssignment_7 : ( ( RULE_ID ) ) ;
    public final void rule__BossType__SuperBossAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1923:1: ( ( ( RULE_ID ) ) )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1924:1: ( ( RULE_ID ) )
            {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1924:1: ( ( RULE_ID ) )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1925:1: ( RULE_ID )
            {
             before(grammarAccess.getBossTypeAccess().getSuperBossIdValuesCrossReference_7_0()); 
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1926:1: ( RULE_ID )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1927:1: RULE_ID
            {
             before(grammarAccess.getBossTypeAccess().getSuperBossIdValuesIDTerminalRuleCall_7_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__BossType__SuperBossAssignment_73751); 
             after(grammarAccess.getBossTypeAccess().getSuperBossIdValuesIDTerminalRuleCall_7_0_1()); 

            }

             after(grammarAccess.getBossTypeAccess().getSuperBossIdValuesCrossReference_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BossType__SuperBossAssignment_7"


    // $ANTLR start "rule__BossType__BossIdAssignment_9"
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1938:1: rule__BossType__BossIdAssignment_9 : ( ruleIdValues ) ;
    public final void rule__BossType__BossIdAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1942:1: ( ( ruleIdValues ) )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1943:1: ( ruleIdValues )
            {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1943:1: ( ruleIdValues )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1944:1: ruleIdValues
            {
             before(grammarAccess.getBossTypeAccess().getBossIdIdValuesParserRuleCall_9_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleIdValues_in_rule__BossType__BossIdAssignment_93786);
            ruleIdValues();

            state._fsp--;

             after(grammarAccess.getBossTypeAccess().getBossIdIdValuesParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BossType__BossIdAssignment_9"


    // $ANTLR start "rule__EmployeeType__LastNameAssignment_3"
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1953:1: rule__EmployeeType__LastNameAssignment_3 : ( ruleString0 ) ;
    public final void rule__EmployeeType__LastNameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1957:1: ( ( ruleString0 ) )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1958:1: ( ruleString0 )
            {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1958:1: ( ruleString0 )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1959:1: ruleString0
            {
             before(grammarAccess.getEmployeeTypeAccess().getLastNameString0ParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleString0_in_rule__EmployeeType__LastNameAssignment_33817);
            ruleString0();

            state._fsp--;

             after(grammarAccess.getEmployeeTypeAccess().getLastNameString0ParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmployeeType__LastNameAssignment_3"


    // $ANTLR start "rule__EmployeeType__BirthDateAssignment_5"
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1968:1: rule__EmployeeType__BirthDateAssignment_5 : ( ruleDate ) ;
    public final void rule__EmployeeType__BirthDateAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1972:1: ( ( ruleDate ) )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1973:1: ( ruleDate )
            {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1973:1: ( ruleDate )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1974:1: ruleDate
            {
             before(grammarAccess.getEmployeeTypeAccess().getBirthDateDateParserRuleCall_5_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleDate_in_rule__EmployeeType__BirthDateAssignment_53848);
            ruleDate();

            state._fsp--;

             after(grammarAccess.getEmployeeTypeAccess().getBirthDateDateParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmployeeType__BirthDateAssignment_5"


    // $ANTLR start "rule__EmployeeType__BossAssignment_7"
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1983:1: rule__EmployeeType__BossAssignment_7 : ( ( RULE_ID ) ) ;
    public final void rule__EmployeeType__BossAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1987:1: ( ( ( RULE_ID ) ) )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1988:1: ( ( RULE_ID ) )
            {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1988:1: ( ( RULE_ID ) )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1989:1: ( RULE_ID )
            {
             before(grammarAccess.getEmployeeTypeAccess().getBossIdValuesCrossReference_7_0()); 
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1990:1: ( RULE_ID )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1991:1: RULE_ID
            {
             before(grammarAccess.getEmployeeTypeAccess().getBossIdValuesIDTerminalRuleCall_7_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__EmployeeType__BossAssignment_73883); 
             after(grammarAccess.getEmployeeTypeAccess().getBossIdValuesIDTerminalRuleCall_7_0_1()); 

            }

             after(grammarAccess.getEmployeeTypeAccess().getBossIdValuesCrossReference_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmployeeType__BossAssignment_7"


    // $ANTLR start "rule__EmployeeType__EmployeeIdAssignment_9"
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:2002:1: rule__EmployeeType__EmployeeIdAssignment_9 : ( ruleIdValues ) ;
    public final void rule__EmployeeType__EmployeeIdAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:2006:1: ( ( ruleIdValues ) )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:2007:1: ( ruleIdValues )
            {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:2007:1: ( ruleIdValues )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:2008:1: ruleIdValues
            {
             before(grammarAccess.getEmployeeTypeAccess().getEmployeeIdIdValuesParserRuleCall_9_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleIdValues_in_rule__EmployeeType__EmployeeIdAssignment_93918);
            ruleIdValues();

            state._fsp--;

             after(grammarAccess.getEmployeeTypeAccess().getEmployeeIdIdValuesParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmployeeType__EmployeeIdAssignment_9"


    // $ANTLR start "rule__IdValues__NameAssignment_1"
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:2017:1: rule__IdValues__NameAssignment_1 : ( ruleID0 ) ;
    public final void rule__IdValues__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:2021:1: ( ( ruleID0 ) )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:2022:1: ( ruleID0 )
            {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:2022:1: ( ruleID0 )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:2023:1: ruleID0
            {
             before(grammarAccess.getIdValuesAccess().getNameID0ParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleID0_in_rule__IdValues__NameAssignment_13949);
            ruleID0();

            state._fsp--;

             after(grammarAccess.getIdValuesAccess().getNameID0ParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IdValues__NameAssignment_1"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleEmployeeListType_in_entryRuleEmployeeListType61 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEmployeeListType68 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmployeeListType__Group__0_in_ruleEmployeeListType94 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBossType_in_entryRuleBossType121 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBossType128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BossType__Group__0_in_ruleBossType154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEmployeeType_in_entryRuleEmployeeType181 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEmployeeType188 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmployeeType__Group__0_in_ruleEmployeeType214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleString0_in_entryRuleString0241 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleString0248 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleString0274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIdValues_in_entryRuleIdValues300 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIdValues307 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IdValues__Group__0_in_ruleIdValues333 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDate_in_entryRuleDate360 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDate367 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Date__Group__0_in_ruleDate393 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleID0_in_entryRuleID0420 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleID0427 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleID0453 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmployeeListType__Group__0__Impl_in_rule__EmployeeListType__Group__0488 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_rule__EmployeeListType__Group__1_in_rule__EmployeeListType__Group__0491 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmployeeListType__Group__1__Impl_in_rule__EmployeeListType__Group__1549 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__EmployeeListType__Group__2_in_rule__EmployeeListType__Group__1552 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_rule__EmployeeListType__Group__1__Impl580 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmployeeListType__Group__2__Impl_in_rule__EmployeeListType__Group__2611 = new BitSet(new long[]{0x0000000000016000L});
        public static final BitSet FOLLOW_rule__EmployeeListType__Group__3_in_rule__EmployeeListType__Group__2614 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__EmployeeListType__Group__2__Impl642 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmployeeListType__Group__3__Impl_in_rule__EmployeeListType__Group__3673 = new BitSet(new long[]{0x0000000000016000L});
        public static final BitSet FOLLOW_rule__EmployeeListType__Group__4_in_rule__EmployeeListType__Group__3676 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmployeeListType__Group_3__0_in_rule__EmployeeListType__Group__3__Impl703 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmployeeListType__Group__4__Impl_in_rule__EmployeeListType__Group__4734 = new BitSet(new long[]{0x0000000000016000L});
        public static final BitSet FOLLOW_rule__EmployeeListType__Group__5_in_rule__EmployeeListType__Group__4737 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmployeeListType__Group_4__0_in_rule__EmployeeListType__Group__4__Impl764 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmployeeListType__Group__5__Impl_in_rule__EmployeeListType__Group__5795 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__EmployeeListType__Group__5__Impl823 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmployeeListType__Group_3__0__Impl_in_rule__EmployeeListType__Group_3__0866 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__EmployeeListType__Group_3__1_in_rule__EmployeeListType__Group_3__0869 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__EmployeeListType__Group_3__0__Impl897 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmployeeListType__Group_3__1__Impl_in_rule__EmployeeListType__Group_3__1928 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__EmployeeListType__Group_3__2_in_rule__EmployeeListType__Group_3__1931 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__EmployeeListType__Group_3__1__Impl959 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmployeeListType__Group_3__2__Impl_in_rule__EmployeeListType__Group_3__2990 = new BitSet(new long[]{0x000000000000A000L});
        public static final BitSet FOLLOW_rule__EmployeeListType__Group_3__3_in_rule__EmployeeListType__Group_3__2993 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmployeeListType__BossAssignment_3_2_in_rule__EmployeeListType__Group_3__2__Impl1020 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmployeeListType__Group_3__3__Impl_in_rule__EmployeeListType__Group_3__31050 = new BitSet(new long[]{0x000000000000A000L});
        public static final BitSet FOLLOW_rule__EmployeeListType__Group_3__4_in_rule__EmployeeListType__Group_3__31053 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmployeeListType__Group_3_3__0_in_rule__EmployeeListType__Group_3__3__Impl1080 = new BitSet(new long[]{0x0000000000008002L});
        public static final BitSet FOLLOW_rule__EmployeeListType__Group_3__4__Impl_in_rule__EmployeeListType__Group_3__41111 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__EmployeeListType__Group_3__4__Impl1139 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmployeeListType__Group_3_3__0__Impl_in_rule__EmployeeListType__Group_3_3__01180 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__EmployeeListType__Group_3_3__1_in_rule__EmployeeListType__Group_3_3__01183 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__EmployeeListType__Group_3_3__0__Impl1211 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmployeeListType__Group_3_3__1__Impl_in_rule__EmployeeListType__Group_3_3__11242 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmployeeListType__BossAssignment_3_3_1_in_rule__EmployeeListType__Group_3_3__1__Impl1269 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmployeeListType__Group_4__0__Impl_in_rule__EmployeeListType__Group_4__01303 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__EmployeeListType__Group_4__1_in_rule__EmployeeListType__Group_4__01306 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__EmployeeListType__Group_4__0__Impl1334 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmployeeListType__Group_4__1__Impl_in_rule__EmployeeListType__Group_4__11365 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_rule__EmployeeListType__Group_4__2_in_rule__EmployeeListType__Group_4__11368 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__EmployeeListType__Group_4__1__Impl1396 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmployeeListType__Group_4__2__Impl_in_rule__EmployeeListType__Group_4__21427 = new BitSet(new long[]{0x000000000000A000L});
        public static final BitSet FOLLOW_rule__EmployeeListType__Group_4__3_in_rule__EmployeeListType__Group_4__21430 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmployeeListType__EmployeeAssignment_4_2_in_rule__EmployeeListType__Group_4__2__Impl1457 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmployeeListType__Group_4__3__Impl_in_rule__EmployeeListType__Group_4__31487 = new BitSet(new long[]{0x000000000000A000L});
        public static final BitSet FOLLOW_rule__EmployeeListType__Group_4__4_in_rule__EmployeeListType__Group_4__31490 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmployeeListType__Group_4_3__0_in_rule__EmployeeListType__Group_4__3__Impl1517 = new BitSet(new long[]{0x0000000000008002L});
        public static final BitSet FOLLOW_rule__EmployeeListType__Group_4__4__Impl_in_rule__EmployeeListType__Group_4__41548 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__EmployeeListType__Group_4__4__Impl1576 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmployeeListType__Group_4_3__0__Impl_in_rule__EmployeeListType__Group_4_3__01617 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_rule__EmployeeListType__Group_4_3__1_in_rule__EmployeeListType__Group_4_3__01620 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__EmployeeListType__Group_4_3__0__Impl1648 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmployeeListType__Group_4_3__1__Impl_in_rule__EmployeeListType__Group_4_3__11679 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmployeeListType__EmployeeAssignment_4_3_1_in_rule__EmployeeListType__Group_4_3__1__Impl1706 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BossType__Group__0__Impl_in_rule__BossType__Group__01740 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__BossType__Group__1_in_rule__BossType__Group__01743 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__BossType__Group__0__Impl1771 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BossType__Group__1__Impl_in_rule__BossType__Group__11802 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__BossType__Group__2_in_rule__BossType__Group__11805 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__BossType__Group__1__Impl1833 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BossType__Group__2__Impl_in_rule__BossType__Group__21864 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__BossType__Group__3_in_rule__BossType__Group__21867 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__BossType__Group__2__Impl1895 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BossType__Group__3__Impl_in_rule__BossType__Group__31926 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_rule__BossType__Group__4_in_rule__BossType__Group__31929 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BossType__LastNameAssignment_3_in_rule__BossType__Group__3__Impl1956 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BossType__Group__4__Impl_in_rule__BossType__Group__41986 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_rule__BossType__Group__5_in_rule__BossType__Group__41989 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__BossType__Group__4__Impl2017 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BossType__Group__5__Impl_in_rule__BossType__Group__52048 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_rule__BossType__Group__6_in_rule__BossType__Group__52051 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BossType__BirthDateAssignment_5_in_rule__BossType__Group__5__Impl2078 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BossType__Group__6__Impl_in_rule__BossType__Group__62108 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__BossType__Group__7_in_rule__BossType__Group__62111 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__BossType__Group__6__Impl2139 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BossType__Group__7__Impl_in_rule__BossType__Group__72170 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__BossType__Group__8_in_rule__BossType__Group__72173 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BossType__SuperBossAssignment_7_in_rule__BossType__Group__7__Impl2200 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BossType__Group__8__Impl_in_rule__BossType__Group__82230 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__BossType__Group__9_in_rule__BossType__Group__82233 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__BossType__Group__8__Impl2261 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BossType__Group__9__Impl_in_rule__BossType__Group__92292 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_rule__BossType__Group__10_in_rule__BossType__Group__92295 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BossType__BossIdAssignment_9_in_rule__BossType__Group__9__Impl2322 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BossType__Group__10__Impl_in_rule__BossType__Group__102352 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__BossType__Group__10__Impl2380 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmployeeType__Group__0__Impl_in_rule__EmployeeType__Group__02433 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__EmployeeType__Group__1_in_rule__EmployeeType__Group__02436 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__EmployeeType__Group__0__Impl2464 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmployeeType__Group__1__Impl_in_rule__EmployeeType__Group__12495 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__EmployeeType__Group__2_in_rule__EmployeeType__Group__12498 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__EmployeeType__Group__1__Impl2526 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmployeeType__Group__2__Impl_in_rule__EmployeeType__Group__22557 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__EmployeeType__Group__3_in_rule__EmployeeType__Group__22560 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__EmployeeType__Group__2__Impl2588 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmployeeType__Group__3__Impl_in_rule__EmployeeType__Group__32619 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_rule__EmployeeType__Group__4_in_rule__EmployeeType__Group__32622 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmployeeType__LastNameAssignment_3_in_rule__EmployeeType__Group__3__Impl2649 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmployeeType__Group__4__Impl_in_rule__EmployeeType__Group__42679 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_rule__EmployeeType__Group__5_in_rule__EmployeeType__Group__42682 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__EmployeeType__Group__4__Impl2710 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmployeeType__Group__5__Impl_in_rule__EmployeeType__Group__52741 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__EmployeeType__Group__6_in_rule__EmployeeType__Group__52744 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmployeeType__BirthDateAssignment_5_in_rule__EmployeeType__Group__5__Impl2771 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmployeeType__Group__6__Impl_in_rule__EmployeeType__Group__62801 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__EmployeeType__Group__7_in_rule__EmployeeType__Group__62804 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__EmployeeType__Group__6__Impl2832 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmployeeType__Group__7__Impl_in_rule__EmployeeType__Group__72863 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__EmployeeType__Group__8_in_rule__EmployeeType__Group__72866 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmployeeType__BossAssignment_7_in_rule__EmployeeType__Group__7__Impl2893 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmployeeType__Group__8__Impl_in_rule__EmployeeType__Group__82923 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__EmployeeType__Group__9_in_rule__EmployeeType__Group__82926 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__EmployeeType__Group__8__Impl2954 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmployeeType__Group__9__Impl_in_rule__EmployeeType__Group__92985 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_rule__EmployeeType__Group__10_in_rule__EmployeeType__Group__92988 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmployeeType__EmployeeIdAssignment_9_in_rule__EmployeeType__Group__9__Impl3015 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmployeeType__Group__10__Impl_in_rule__EmployeeType__Group__103045 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__EmployeeType__Group__10__Impl3073 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IdValues__Group__0__Impl_in_rule__IdValues__Group__03126 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__IdValues__Group__1_in_rule__IdValues__Group__03129 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IdValues__Group__1__Impl_in_rule__IdValues__Group__13187 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IdValues__NameAssignment_1_in_rule__IdValues__Group__1__Impl3214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Date__Group__0__Impl_in_rule__Date__Group__03248 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_rule__Date__Group__1_in_rule__Date__Group__03251 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__Date__Group__0__Impl3278 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Date__Group__1__Impl_in_rule__Date__Group__13307 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_rule__Date__Group__2_in_rule__Date__Group__13310 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__Date__Group__1__Impl3338 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Date__Group__2__Impl_in_rule__Date__Group__23369 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_rule__Date__Group__3_in_rule__Date__Group__23372 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__Date__Group__2__Impl3399 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Date__Group__3__Impl_in_rule__Date__Group__33428 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_rule__Date__Group__4_in_rule__Date__Group__33431 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__Date__Group__3__Impl3459 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Date__Group__4__Impl_in_rule__Date__Group__43490 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__Date__Group__4__Impl3517 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBossType_in_rule__EmployeeListType__BossAssignment_3_23561 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBossType_in_rule__EmployeeListType__BossAssignment_3_3_13592 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEmployeeType_in_rule__EmployeeListType__EmployeeAssignment_4_23623 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEmployeeType_in_rule__EmployeeListType__EmployeeAssignment_4_3_13654 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleString0_in_rule__BossType__LastNameAssignment_33685 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDate_in_rule__BossType__BirthDateAssignment_53716 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__BossType__SuperBossAssignment_73751 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIdValues_in_rule__BossType__BossIdAssignment_93786 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleString0_in_rule__EmployeeType__LastNameAssignment_33817 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDate_in_rule__EmployeeType__BirthDateAssignment_53848 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__EmployeeType__BossAssignment_73883 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIdValues_in_rule__EmployeeType__EmployeeIdAssignment_93918 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleID0_in_rule__IdValues__NameAssignment_13949 = new BitSet(new long[]{0x0000000000000002L});
    }


}