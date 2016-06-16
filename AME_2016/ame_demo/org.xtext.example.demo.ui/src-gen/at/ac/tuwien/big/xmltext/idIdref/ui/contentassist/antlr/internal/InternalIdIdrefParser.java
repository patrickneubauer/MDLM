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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'EmployeeListType'", "'['", "']'", "'boss'", "','", "'employee'", "'BossType'", "'lastName'", "'superBoss'", "'bossId'", "'EmployeeType'", "'employeeId'"
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


    // $ANTLR start "entryRuleID0"
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:200:1: entryRuleID0 : ruleID0 EOF ;
    public final void entryRuleID0() throws RecognitionException {
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:201:1: ( ruleID0 EOF )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:202:1: ruleID0 EOF
            {
             before(grammarAccess.getID0Rule()); 
            pushFollow(FollowSets000.FOLLOW_ruleID0_in_entryRuleID0360);
            ruleID0();

            state._fsp--;

             after(grammarAccess.getID0Rule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleID0367); 

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
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:209:1: ruleID0 : ( RULE_ID ) ;
    public final void ruleID0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:213:2: ( ( RULE_ID ) )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:214:1: ( RULE_ID )
            {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:214:1: ( RULE_ID )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:215:1: RULE_ID
            {
             before(grammarAccess.getID0Access().getIDTerminalRuleCall()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleID0393); 
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
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:232:1: rule__EmployeeListType__Group__0 : rule__EmployeeListType__Group__0__Impl rule__EmployeeListType__Group__1 ;
    public final void rule__EmployeeListType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:236:1: ( rule__EmployeeListType__Group__0__Impl rule__EmployeeListType__Group__1 )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:237:2: rule__EmployeeListType__Group__0__Impl rule__EmployeeListType__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmployeeListType__Group__0__Impl_in_rule__EmployeeListType__Group__0428);
            rule__EmployeeListType__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EmployeeListType__Group__1_in_rule__EmployeeListType__Group__0431);
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
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:244:1: rule__EmployeeListType__Group__0__Impl : ( () ) ;
    public final void rule__EmployeeListType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:248:1: ( ( () ) )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:249:1: ( () )
            {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:249:1: ( () )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:250:1: ()
            {
             before(grammarAccess.getEmployeeListTypeAccess().getEmployeeListTypeAction_0()); 
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:251:1: ()
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:253:1: 
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
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:263:1: rule__EmployeeListType__Group__1 : rule__EmployeeListType__Group__1__Impl rule__EmployeeListType__Group__2 ;
    public final void rule__EmployeeListType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:267:1: ( rule__EmployeeListType__Group__1__Impl rule__EmployeeListType__Group__2 )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:268:2: rule__EmployeeListType__Group__1__Impl rule__EmployeeListType__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmployeeListType__Group__1__Impl_in_rule__EmployeeListType__Group__1489);
            rule__EmployeeListType__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EmployeeListType__Group__2_in_rule__EmployeeListType__Group__1492);
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
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:275:1: rule__EmployeeListType__Group__1__Impl : ( 'EmployeeListType' ) ;
    public final void rule__EmployeeListType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:279:1: ( ( 'EmployeeListType' ) )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:280:1: ( 'EmployeeListType' )
            {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:280:1: ( 'EmployeeListType' )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:281:1: 'EmployeeListType'
            {
             before(grammarAccess.getEmployeeListTypeAccess().getEmployeeListTypeKeyword_1()); 
            match(input,11,FollowSets000.FOLLOW_11_in_rule__EmployeeListType__Group__1__Impl520); 
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
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:294:1: rule__EmployeeListType__Group__2 : rule__EmployeeListType__Group__2__Impl rule__EmployeeListType__Group__3 ;
    public final void rule__EmployeeListType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:298:1: ( rule__EmployeeListType__Group__2__Impl rule__EmployeeListType__Group__3 )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:299:2: rule__EmployeeListType__Group__2__Impl rule__EmployeeListType__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmployeeListType__Group__2__Impl_in_rule__EmployeeListType__Group__2551);
            rule__EmployeeListType__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EmployeeListType__Group__3_in_rule__EmployeeListType__Group__2554);
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
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:306:1: rule__EmployeeListType__Group__2__Impl : ( '[' ) ;
    public final void rule__EmployeeListType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:310:1: ( ( '[' ) )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:311:1: ( '[' )
            {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:311:1: ( '[' )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:312:1: '['
            {
             before(grammarAccess.getEmployeeListTypeAccess().getLeftSquareBracketKeyword_2()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__EmployeeListType__Group__2__Impl582); 
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
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:325:1: rule__EmployeeListType__Group__3 : rule__EmployeeListType__Group__3__Impl rule__EmployeeListType__Group__4 ;
    public final void rule__EmployeeListType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:329:1: ( rule__EmployeeListType__Group__3__Impl rule__EmployeeListType__Group__4 )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:330:2: rule__EmployeeListType__Group__3__Impl rule__EmployeeListType__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmployeeListType__Group__3__Impl_in_rule__EmployeeListType__Group__3613);
            rule__EmployeeListType__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EmployeeListType__Group__4_in_rule__EmployeeListType__Group__3616);
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
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:337:1: rule__EmployeeListType__Group__3__Impl : ( ( rule__EmployeeListType__Group_3__0 )? ) ;
    public final void rule__EmployeeListType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:341:1: ( ( ( rule__EmployeeListType__Group_3__0 )? ) )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:342:1: ( ( rule__EmployeeListType__Group_3__0 )? )
            {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:342:1: ( ( rule__EmployeeListType__Group_3__0 )? )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:343:1: ( rule__EmployeeListType__Group_3__0 )?
            {
             before(grammarAccess.getEmployeeListTypeAccess().getGroup_3()); 
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:344:1: ( rule__EmployeeListType__Group_3__0 )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==14) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:344:2: rule__EmployeeListType__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__EmployeeListType__Group_3__0_in_rule__EmployeeListType__Group__3__Impl643);
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
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:354:1: rule__EmployeeListType__Group__4 : rule__EmployeeListType__Group__4__Impl rule__EmployeeListType__Group__5 ;
    public final void rule__EmployeeListType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:358:1: ( rule__EmployeeListType__Group__4__Impl rule__EmployeeListType__Group__5 )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:359:2: rule__EmployeeListType__Group__4__Impl rule__EmployeeListType__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmployeeListType__Group__4__Impl_in_rule__EmployeeListType__Group__4674);
            rule__EmployeeListType__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EmployeeListType__Group__5_in_rule__EmployeeListType__Group__4677);
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
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:366:1: rule__EmployeeListType__Group__4__Impl : ( ( rule__EmployeeListType__Group_4__0 )? ) ;
    public final void rule__EmployeeListType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:370:1: ( ( ( rule__EmployeeListType__Group_4__0 )? ) )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:371:1: ( ( rule__EmployeeListType__Group_4__0 )? )
            {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:371:1: ( ( rule__EmployeeListType__Group_4__0 )? )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:372:1: ( rule__EmployeeListType__Group_4__0 )?
            {
             before(grammarAccess.getEmployeeListTypeAccess().getGroup_4()); 
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:373:1: ( rule__EmployeeListType__Group_4__0 )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==16) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:373:2: rule__EmployeeListType__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__EmployeeListType__Group_4__0_in_rule__EmployeeListType__Group__4__Impl704);
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
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:383:1: rule__EmployeeListType__Group__5 : rule__EmployeeListType__Group__5__Impl ;
    public final void rule__EmployeeListType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:387:1: ( rule__EmployeeListType__Group__5__Impl )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:388:2: rule__EmployeeListType__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmployeeListType__Group__5__Impl_in_rule__EmployeeListType__Group__5735);
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
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:394:1: rule__EmployeeListType__Group__5__Impl : ( ']' ) ;
    public final void rule__EmployeeListType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:398:1: ( ( ']' ) )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:399:1: ( ']' )
            {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:399:1: ( ']' )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:400:1: ']'
            {
             before(grammarAccess.getEmployeeListTypeAccess().getRightSquareBracketKeyword_5()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__EmployeeListType__Group__5__Impl763); 
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
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:425:1: rule__EmployeeListType__Group_3__0 : rule__EmployeeListType__Group_3__0__Impl rule__EmployeeListType__Group_3__1 ;
    public final void rule__EmployeeListType__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:429:1: ( rule__EmployeeListType__Group_3__0__Impl rule__EmployeeListType__Group_3__1 )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:430:2: rule__EmployeeListType__Group_3__0__Impl rule__EmployeeListType__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmployeeListType__Group_3__0__Impl_in_rule__EmployeeListType__Group_3__0806);
            rule__EmployeeListType__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EmployeeListType__Group_3__1_in_rule__EmployeeListType__Group_3__0809);
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
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:437:1: rule__EmployeeListType__Group_3__0__Impl : ( 'boss' ) ;
    public final void rule__EmployeeListType__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:441:1: ( ( 'boss' ) )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:442:1: ( 'boss' )
            {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:442:1: ( 'boss' )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:443:1: 'boss'
            {
             before(grammarAccess.getEmployeeListTypeAccess().getBossKeyword_3_0()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__EmployeeListType__Group_3__0__Impl837); 
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
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:456:1: rule__EmployeeListType__Group_3__1 : rule__EmployeeListType__Group_3__1__Impl rule__EmployeeListType__Group_3__2 ;
    public final void rule__EmployeeListType__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:460:1: ( rule__EmployeeListType__Group_3__1__Impl rule__EmployeeListType__Group_3__2 )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:461:2: rule__EmployeeListType__Group_3__1__Impl rule__EmployeeListType__Group_3__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmployeeListType__Group_3__1__Impl_in_rule__EmployeeListType__Group_3__1868);
            rule__EmployeeListType__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EmployeeListType__Group_3__2_in_rule__EmployeeListType__Group_3__1871);
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
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:468:1: rule__EmployeeListType__Group_3__1__Impl : ( '[' ) ;
    public final void rule__EmployeeListType__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:472:1: ( ( '[' ) )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:473:1: ( '[' )
            {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:473:1: ( '[' )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:474:1: '['
            {
             before(grammarAccess.getEmployeeListTypeAccess().getLeftSquareBracketKeyword_3_1()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__EmployeeListType__Group_3__1__Impl899); 
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
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:487:1: rule__EmployeeListType__Group_3__2 : rule__EmployeeListType__Group_3__2__Impl rule__EmployeeListType__Group_3__3 ;
    public final void rule__EmployeeListType__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:491:1: ( rule__EmployeeListType__Group_3__2__Impl rule__EmployeeListType__Group_3__3 )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:492:2: rule__EmployeeListType__Group_3__2__Impl rule__EmployeeListType__Group_3__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmployeeListType__Group_3__2__Impl_in_rule__EmployeeListType__Group_3__2930);
            rule__EmployeeListType__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EmployeeListType__Group_3__3_in_rule__EmployeeListType__Group_3__2933);
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
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:499:1: rule__EmployeeListType__Group_3__2__Impl : ( ( rule__EmployeeListType__BossAssignment_3_2 ) ) ;
    public final void rule__EmployeeListType__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:503:1: ( ( ( rule__EmployeeListType__BossAssignment_3_2 ) ) )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:504:1: ( ( rule__EmployeeListType__BossAssignment_3_2 ) )
            {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:504:1: ( ( rule__EmployeeListType__BossAssignment_3_2 ) )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:505:1: ( rule__EmployeeListType__BossAssignment_3_2 )
            {
             before(grammarAccess.getEmployeeListTypeAccess().getBossAssignment_3_2()); 
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:506:1: ( rule__EmployeeListType__BossAssignment_3_2 )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:506:2: rule__EmployeeListType__BossAssignment_3_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmployeeListType__BossAssignment_3_2_in_rule__EmployeeListType__Group_3__2__Impl960);
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
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:516:1: rule__EmployeeListType__Group_3__3 : rule__EmployeeListType__Group_3__3__Impl rule__EmployeeListType__Group_3__4 ;
    public final void rule__EmployeeListType__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:520:1: ( rule__EmployeeListType__Group_3__3__Impl rule__EmployeeListType__Group_3__4 )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:521:2: rule__EmployeeListType__Group_3__3__Impl rule__EmployeeListType__Group_3__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmployeeListType__Group_3__3__Impl_in_rule__EmployeeListType__Group_3__3990);
            rule__EmployeeListType__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EmployeeListType__Group_3__4_in_rule__EmployeeListType__Group_3__3993);
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
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:528:1: rule__EmployeeListType__Group_3__3__Impl : ( ( rule__EmployeeListType__Group_3_3__0 )* ) ;
    public final void rule__EmployeeListType__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:532:1: ( ( ( rule__EmployeeListType__Group_3_3__0 )* ) )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:533:1: ( ( rule__EmployeeListType__Group_3_3__0 )* )
            {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:533:1: ( ( rule__EmployeeListType__Group_3_3__0 )* )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:534:1: ( rule__EmployeeListType__Group_3_3__0 )*
            {
             before(grammarAccess.getEmployeeListTypeAccess().getGroup_3_3()); 
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:535:1: ( rule__EmployeeListType__Group_3_3__0 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==15) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:535:2: rule__EmployeeListType__Group_3_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__EmployeeListType__Group_3_3__0_in_rule__EmployeeListType__Group_3__3__Impl1020);
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
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:545:1: rule__EmployeeListType__Group_3__4 : rule__EmployeeListType__Group_3__4__Impl ;
    public final void rule__EmployeeListType__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:549:1: ( rule__EmployeeListType__Group_3__4__Impl )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:550:2: rule__EmployeeListType__Group_3__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmployeeListType__Group_3__4__Impl_in_rule__EmployeeListType__Group_3__41051);
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
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:556:1: rule__EmployeeListType__Group_3__4__Impl : ( ']' ) ;
    public final void rule__EmployeeListType__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:560:1: ( ( ']' ) )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:561:1: ( ']' )
            {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:561:1: ( ']' )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:562:1: ']'
            {
             before(grammarAccess.getEmployeeListTypeAccess().getRightSquareBracketKeyword_3_4()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__EmployeeListType__Group_3__4__Impl1079); 
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
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:585:1: rule__EmployeeListType__Group_3_3__0 : rule__EmployeeListType__Group_3_3__0__Impl rule__EmployeeListType__Group_3_3__1 ;
    public final void rule__EmployeeListType__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:589:1: ( rule__EmployeeListType__Group_3_3__0__Impl rule__EmployeeListType__Group_3_3__1 )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:590:2: rule__EmployeeListType__Group_3_3__0__Impl rule__EmployeeListType__Group_3_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmployeeListType__Group_3_3__0__Impl_in_rule__EmployeeListType__Group_3_3__01120);
            rule__EmployeeListType__Group_3_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EmployeeListType__Group_3_3__1_in_rule__EmployeeListType__Group_3_3__01123);
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
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:597:1: rule__EmployeeListType__Group_3_3__0__Impl : ( ',' ) ;
    public final void rule__EmployeeListType__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:601:1: ( ( ',' ) )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:602:1: ( ',' )
            {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:602:1: ( ',' )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:603:1: ','
            {
             before(grammarAccess.getEmployeeListTypeAccess().getCommaKeyword_3_3_0()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__EmployeeListType__Group_3_3__0__Impl1151); 
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
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:616:1: rule__EmployeeListType__Group_3_3__1 : rule__EmployeeListType__Group_3_3__1__Impl ;
    public final void rule__EmployeeListType__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:620:1: ( rule__EmployeeListType__Group_3_3__1__Impl )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:621:2: rule__EmployeeListType__Group_3_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmployeeListType__Group_3_3__1__Impl_in_rule__EmployeeListType__Group_3_3__11182);
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
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:627:1: rule__EmployeeListType__Group_3_3__1__Impl : ( ( rule__EmployeeListType__BossAssignment_3_3_1 ) ) ;
    public final void rule__EmployeeListType__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:631:1: ( ( ( rule__EmployeeListType__BossAssignment_3_3_1 ) ) )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:632:1: ( ( rule__EmployeeListType__BossAssignment_3_3_1 ) )
            {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:632:1: ( ( rule__EmployeeListType__BossAssignment_3_3_1 ) )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:633:1: ( rule__EmployeeListType__BossAssignment_3_3_1 )
            {
             before(grammarAccess.getEmployeeListTypeAccess().getBossAssignment_3_3_1()); 
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:634:1: ( rule__EmployeeListType__BossAssignment_3_3_1 )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:634:2: rule__EmployeeListType__BossAssignment_3_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmployeeListType__BossAssignment_3_3_1_in_rule__EmployeeListType__Group_3_3__1__Impl1209);
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
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:648:1: rule__EmployeeListType__Group_4__0 : rule__EmployeeListType__Group_4__0__Impl rule__EmployeeListType__Group_4__1 ;
    public final void rule__EmployeeListType__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:652:1: ( rule__EmployeeListType__Group_4__0__Impl rule__EmployeeListType__Group_4__1 )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:653:2: rule__EmployeeListType__Group_4__0__Impl rule__EmployeeListType__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmployeeListType__Group_4__0__Impl_in_rule__EmployeeListType__Group_4__01243);
            rule__EmployeeListType__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EmployeeListType__Group_4__1_in_rule__EmployeeListType__Group_4__01246);
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
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:660:1: rule__EmployeeListType__Group_4__0__Impl : ( 'employee' ) ;
    public final void rule__EmployeeListType__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:664:1: ( ( 'employee' ) )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:665:1: ( 'employee' )
            {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:665:1: ( 'employee' )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:666:1: 'employee'
            {
             before(grammarAccess.getEmployeeListTypeAccess().getEmployeeKeyword_4_0()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__EmployeeListType__Group_4__0__Impl1274); 
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
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:679:1: rule__EmployeeListType__Group_4__1 : rule__EmployeeListType__Group_4__1__Impl rule__EmployeeListType__Group_4__2 ;
    public final void rule__EmployeeListType__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:683:1: ( rule__EmployeeListType__Group_4__1__Impl rule__EmployeeListType__Group_4__2 )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:684:2: rule__EmployeeListType__Group_4__1__Impl rule__EmployeeListType__Group_4__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmployeeListType__Group_4__1__Impl_in_rule__EmployeeListType__Group_4__11305);
            rule__EmployeeListType__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EmployeeListType__Group_4__2_in_rule__EmployeeListType__Group_4__11308);
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
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:691:1: rule__EmployeeListType__Group_4__1__Impl : ( '[' ) ;
    public final void rule__EmployeeListType__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:695:1: ( ( '[' ) )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:696:1: ( '[' )
            {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:696:1: ( '[' )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:697:1: '['
            {
             before(grammarAccess.getEmployeeListTypeAccess().getLeftSquareBracketKeyword_4_1()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__EmployeeListType__Group_4__1__Impl1336); 
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
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:710:1: rule__EmployeeListType__Group_4__2 : rule__EmployeeListType__Group_4__2__Impl rule__EmployeeListType__Group_4__3 ;
    public final void rule__EmployeeListType__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:714:1: ( rule__EmployeeListType__Group_4__2__Impl rule__EmployeeListType__Group_4__3 )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:715:2: rule__EmployeeListType__Group_4__2__Impl rule__EmployeeListType__Group_4__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmployeeListType__Group_4__2__Impl_in_rule__EmployeeListType__Group_4__21367);
            rule__EmployeeListType__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EmployeeListType__Group_4__3_in_rule__EmployeeListType__Group_4__21370);
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
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:722:1: rule__EmployeeListType__Group_4__2__Impl : ( ( rule__EmployeeListType__EmployeeAssignment_4_2 ) ) ;
    public final void rule__EmployeeListType__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:726:1: ( ( ( rule__EmployeeListType__EmployeeAssignment_4_2 ) ) )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:727:1: ( ( rule__EmployeeListType__EmployeeAssignment_4_2 ) )
            {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:727:1: ( ( rule__EmployeeListType__EmployeeAssignment_4_2 ) )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:728:1: ( rule__EmployeeListType__EmployeeAssignment_4_2 )
            {
             before(grammarAccess.getEmployeeListTypeAccess().getEmployeeAssignment_4_2()); 
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:729:1: ( rule__EmployeeListType__EmployeeAssignment_4_2 )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:729:2: rule__EmployeeListType__EmployeeAssignment_4_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmployeeListType__EmployeeAssignment_4_2_in_rule__EmployeeListType__Group_4__2__Impl1397);
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
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:739:1: rule__EmployeeListType__Group_4__3 : rule__EmployeeListType__Group_4__3__Impl rule__EmployeeListType__Group_4__4 ;
    public final void rule__EmployeeListType__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:743:1: ( rule__EmployeeListType__Group_4__3__Impl rule__EmployeeListType__Group_4__4 )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:744:2: rule__EmployeeListType__Group_4__3__Impl rule__EmployeeListType__Group_4__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmployeeListType__Group_4__3__Impl_in_rule__EmployeeListType__Group_4__31427);
            rule__EmployeeListType__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EmployeeListType__Group_4__4_in_rule__EmployeeListType__Group_4__31430);
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
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:751:1: rule__EmployeeListType__Group_4__3__Impl : ( ( rule__EmployeeListType__Group_4_3__0 )* ) ;
    public final void rule__EmployeeListType__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:755:1: ( ( ( rule__EmployeeListType__Group_4_3__0 )* ) )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:756:1: ( ( rule__EmployeeListType__Group_4_3__0 )* )
            {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:756:1: ( ( rule__EmployeeListType__Group_4_3__0 )* )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:757:1: ( rule__EmployeeListType__Group_4_3__0 )*
            {
             before(grammarAccess.getEmployeeListTypeAccess().getGroup_4_3()); 
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:758:1: ( rule__EmployeeListType__Group_4_3__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==15) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:758:2: rule__EmployeeListType__Group_4_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__EmployeeListType__Group_4_3__0_in_rule__EmployeeListType__Group_4__3__Impl1457);
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
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:768:1: rule__EmployeeListType__Group_4__4 : rule__EmployeeListType__Group_4__4__Impl ;
    public final void rule__EmployeeListType__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:772:1: ( rule__EmployeeListType__Group_4__4__Impl )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:773:2: rule__EmployeeListType__Group_4__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmployeeListType__Group_4__4__Impl_in_rule__EmployeeListType__Group_4__41488);
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
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:779:1: rule__EmployeeListType__Group_4__4__Impl : ( ']' ) ;
    public final void rule__EmployeeListType__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:783:1: ( ( ']' ) )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:784:1: ( ']' )
            {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:784:1: ( ']' )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:785:1: ']'
            {
             before(grammarAccess.getEmployeeListTypeAccess().getRightSquareBracketKeyword_4_4()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__EmployeeListType__Group_4__4__Impl1516); 
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
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:808:1: rule__EmployeeListType__Group_4_3__0 : rule__EmployeeListType__Group_4_3__0__Impl rule__EmployeeListType__Group_4_3__1 ;
    public final void rule__EmployeeListType__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:812:1: ( rule__EmployeeListType__Group_4_3__0__Impl rule__EmployeeListType__Group_4_3__1 )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:813:2: rule__EmployeeListType__Group_4_3__0__Impl rule__EmployeeListType__Group_4_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmployeeListType__Group_4_3__0__Impl_in_rule__EmployeeListType__Group_4_3__01557);
            rule__EmployeeListType__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EmployeeListType__Group_4_3__1_in_rule__EmployeeListType__Group_4_3__01560);
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
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:820:1: rule__EmployeeListType__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__EmployeeListType__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:824:1: ( ( ',' ) )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:825:1: ( ',' )
            {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:825:1: ( ',' )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:826:1: ','
            {
             before(grammarAccess.getEmployeeListTypeAccess().getCommaKeyword_4_3_0()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__EmployeeListType__Group_4_3__0__Impl1588); 
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
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:839:1: rule__EmployeeListType__Group_4_3__1 : rule__EmployeeListType__Group_4_3__1__Impl ;
    public final void rule__EmployeeListType__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:843:1: ( rule__EmployeeListType__Group_4_3__1__Impl )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:844:2: rule__EmployeeListType__Group_4_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmployeeListType__Group_4_3__1__Impl_in_rule__EmployeeListType__Group_4_3__11619);
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
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:850:1: rule__EmployeeListType__Group_4_3__1__Impl : ( ( rule__EmployeeListType__EmployeeAssignment_4_3_1 ) ) ;
    public final void rule__EmployeeListType__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:854:1: ( ( ( rule__EmployeeListType__EmployeeAssignment_4_3_1 ) ) )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:855:1: ( ( rule__EmployeeListType__EmployeeAssignment_4_3_1 ) )
            {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:855:1: ( ( rule__EmployeeListType__EmployeeAssignment_4_3_1 ) )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:856:1: ( rule__EmployeeListType__EmployeeAssignment_4_3_1 )
            {
             before(grammarAccess.getEmployeeListTypeAccess().getEmployeeAssignment_4_3_1()); 
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:857:1: ( rule__EmployeeListType__EmployeeAssignment_4_3_1 )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:857:2: rule__EmployeeListType__EmployeeAssignment_4_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmployeeListType__EmployeeAssignment_4_3_1_in_rule__EmployeeListType__Group_4_3__1__Impl1646);
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
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:871:1: rule__BossType__Group__0 : rule__BossType__Group__0__Impl rule__BossType__Group__1 ;
    public final void rule__BossType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:875:1: ( rule__BossType__Group__0__Impl rule__BossType__Group__1 )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:876:2: rule__BossType__Group__0__Impl rule__BossType__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BossType__Group__0__Impl_in_rule__BossType__Group__01680);
            rule__BossType__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BossType__Group__1_in_rule__BossType__Group__01683);
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
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:883:1: rule__BossType__Group__0__Impl : ( 'BossType' ) ;
    public final void rule__BossType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:887:1: ( ( 'BossType' ) )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:888:1: ( 'BossType' )
            {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:888:1: ( 'BossType' )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:889:1: 'BossType'
            {
             before(grammarAccess.getBossTypeAccess().getBossTypeKeyword_0()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__BossType__Group__0__Impl1711); 
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
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:902:1: rule__BossType__Group__1 : rule__BossType__Group__1__Impl rule__BossType__Group__2 ;
    public final void rule__BossType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:906:1: ( rule__BossType__Group__1__Impl rule__BossType__Group__2 )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:907:2: rule__BossType__Group__1__Impl rule__BossType__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__BossType__Group__1__Impl_in_rule__BossType__Group__11742);
            rule__BossType__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BossType__Group__2_in_rule__BossType__Group__11745);
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
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:914:1: rule__BossType__Group__1__Impl : ( '[' ) ;
    public final void rule__BossType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:918:1: ( ( '[' ) )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:919:1: ( '[' )
            {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:919:1: ( '[' )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:920:1: '['
            {
             before(grammarAccess.getBossTypeAccess().getLeftSquareBracketKeyword_1()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__BossType__Group__1__Impl1773); 
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
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:933:1: rule__BossType__Group__2 : rule__BossType__Group__2__Impl rule__BossType__Group__3 ;
    public final void rule__BossType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:937:1: ( rule__BossType__Group__2__Impl rule__BossType__Group__3 )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:938:2: rule__BossType__Group__2__Impl rule__BossType__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__BossType__Group__2__Impl_in_rule__BossType__Group__21804);
            rule__BossType__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BossType__Group__3_in_rule__BossType__Group__21807);
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
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:945:1: rule__BossType__Group__2__Impl : ( 'lastName' ) ;
    public final void rule__BossType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:949:1: ( ( 'lastName' ) )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:950:1: ( 'lastName' )
            {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:950:1: ( 'lastName' )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:951:1: 'lastName'
            {
             before(grammarAccess.getBossTypeAccess().getLastNameKeyword_2()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__BossType__Group__2__Impl1835); 
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
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:964:1: rule__BossType__Group__3 : rule__BossType__Group__3__Impl rule__BossType__Group__4 ;
    public final void rule__BossType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:968:1: ( rule__BossType__Group__3__Impl rule__BossType__Group__4 )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:969:2: rule__BossType__Group__3__Impl rule__BossType__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__BossType__Group__3__Impl_in_rule__BossType__Group__31866);
            rule__BossType__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BossType__Group__4_in_rule__BossType__Group__31869);
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
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:976:1: rule__BossType__Group__3__Impl : ( ( rule__BossType__LastNameAssignment_3 ) ) ;
    public final void rule__BossType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:980:1: ( ( ( rule__BossType__LastNameAssignment_3 ) ) )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:981:1: ( ( rule__BossType__LastNameAssignment_3 ) )
            {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:981:1: ( ( rule__BossType__LastNameAssignment_3 ) )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:982:1: ( rule__BossType__LastNameAssignment_3 )
            {
             before(grammarAccess.getBossTypeAccess().getLastNameAssignment_3()); 
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:983:1: ( rule__BossType__LastNameAssignment_3 )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:983:2: rule__BossType__LastNameAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__BossType__LastNameAssignment_3_in_rule__BossType__Group__3__Impl1896);
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
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:993:1: rule__BossType__Group__4 : rule__BossType__Group__4__Impl rule__BossType__Group__5 ;
    public final void rule__BossType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:997:1: ( rule__BossType__Group__4__Impl rule__BossType__Group__5 )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:998:2: rule__BossType__Group__4__Impl rule__BossType__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__BossType__Group__4__Impl_in_rule__BossType__Group__41926);
            rule__BossType__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BossType__Group__5_in_rule__BossType__Group__41929);
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
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1005:1: rule__BossType__Group__4__Impl : ( 'superBoss' ) ;
    public final void rule__BossType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1009:1: ( ( 'superBoss' ) )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1010:1: ( 'superBoss' )
            {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1010:1: ( 'superBoss' )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1011:1: 'superBoss'
            {
             before(grammarAccess.getBossTypeAccess().getSuperBossKeyword_4()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__BossType__Group__4__Impl1957); 
             after(grammarAccess.getBossTypeAccess().getSuperBossKeyword_4()); 

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
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1024:1: rule__BossType__Group__5 : rule__BossType__Group__5__Impl rule__BossType__Group__6 ;
    public final void rule__BossType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1028:1: ( rule__BossType__Group__5__Impl rule__BossType__Group__6 )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1029:2: rule__BossType__Group__5__Impl rule__BossType__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__BossType__Group__5__Impl_in_rule__BossType__Group__51988);
            rule__BossType__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BossType__Group__6_in_rule__BossType__Group__51991);
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
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1036:1: rule__BossType__Group__5__Impl : ( ( rule__BossType__SuperBossAssignment_5 ) ) ;
    public final void rule__BossType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1040:1: ( ( ( rule__BossType__SuperBossAssignment_5 ) ) )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1041:1: ( ( rule__BossType__SuperBossAssignment_5 ) )
            {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1041:1: ( ( rule__BossType__SuperBossAssignment_5 ) )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1042:1: ( rule__BossType__SuperBossAssignment_5 )
            {
             before(grammarAccess.getBossTypeAccess().getSuperBossAssignment_5()); 
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1043:1: ( rule__BossType__SuperBossAssignment_5 )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1043:2: rule__BossType__SuperBossAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__BossType__SuperBossAssignment_5_in_rule__BossType__Group__5__Impl2018);
            rule__BossType__SuperBossAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getBossTypeAccess().getSuperBossAssignment_5()); 

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
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1053:1: rule__BossType__Group__6 : rule__BossType__Group__6__Impl rule__BossType__Group__7 ;
    public final void rule__BossType__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1057:1: ( rule__BossType__Group__6__Impl rule__BossType__Group__7 )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1058:2: rule__BossType__Group__6__Impl rule__BossType__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__BossType__Group__6__Impl_in_rule__BossType__Group__62048);
            rule__BossType__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BossType__Group__7_in_rule__BossType__Group__62051);
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
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1065:1: rule__BossType__Group__6__Impl : ( 'bossId' ) ;
    public final void rule__BossType__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1069:1: ( ( 'bossId' ) )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1070:1: ( 'bossId' )
            {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1070:1: ( 'bossId' )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1071:1: 'bossId'
            {
             before(grammarAccess.getBossTypeAccess().getBossIdKeyword_6()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__BossType__Group__6__Impl2079); 
             after(grammarAccess.getBossTypeAccess().getBossIdKeyword_6()); 

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
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1084:1: rule__BossType__Group__7 : rule__BossType__Group__7__Impl rule__BossType__Group__8 ;
    public final void rule__BossType__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1088:1: ( rule__BossType__Group__7__Impl rule__BossType__Group__8 )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1089:2: rule__BossType__Group__7__Impl rule__BossType__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__BossType__Group__7__Impl_in_rule__BossType__Group__72110);
            rule__BossType__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BossType__Group__8_in_rule__BossType__Group__72113);
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
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1096:1: rule__BossType__Group__7__Impl : ( ( rule__BossType__BossIdAssignment_7 ) ) ;
    public final void rule__BossType__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1100:1: ( ( ( rule__BossType__BossIdAssignment_7 ) ) )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1101:1: ( ( rule__BossType__BossIdAssignment_7 ) )
            {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1101:1: ( ( rule__BossType__BossIdAssignment_7 ) )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1102:1: ( rule__BossType__BossIdAssignment_7 )
            {
             before(grammarAccess.getBossTypeAccess().getBossIdAssignment_7()); 
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1103:1: ( rule__BossType__BossIdAssignment_7 )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1103:2: rule__BossType__BossIdAssignment_7
            {
            pushFollow(FollowSets000.FOLLOW_rule__BossType__BossIdAssignment_7_in_rule__BossType__Group__7__Impl2140);
            rule__BossType__BossIdAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getBossTypeAccess().getBossIdAssignment_7()); 

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
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1113:1: rule__BossType__Group__8 : rule__BossType__Group__8__Impl ;
    public final void rule__BossType__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1117:1: ( rule__BossType__Group__8__Impl )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1118:2: rule__BossType__Group__8__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__BossType__Group__8__Impl_in_rule__BossType__Group__82170);
            rule__BossType__Group__8__Impl();

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
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1124:1: rule__BossType__Group__8__Impl : ( ']' ) ;
    public final void rule__BossType__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1128:1: ( ( ']' ) )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1129:1: ( ']' )
            {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1129:1: ( ']' )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1130:1: ']'
            {
             before(grammarAccess.getBossTypeAccess().getRightSquareBracketKeyword_8()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__BossType__Group__8__Impl2198); 
             after(grammarAccess.getBossTypeAccess().getRightSquareBracketKeyword_8()); 

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


    // $ANTLR start "rule__EmployeeType__Group__0"
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1161:1: rule__EmployeeType__Group__0 : rule__EmployeeType__Group__0__Impl rule__EmployeeType__Group__1 ;
    public final void rule__EmployeeType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1165:1: ( rule__EmployeeType__Group__0__Impl rule__EmployeeType__Group__1 )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1166:2: rule__EmployeeType__Group__0__Impl rule__EmployeeType__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmployeeType__Group__0__Impl_in_rule__EmployeeType__Group__02247);
            rule__EmployeeType__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EmployeeType__Group__1_in_rule__EmployeeType__Group__02250);
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
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1173:1: rule__EmployeeType__Group__0__Impl : ( 'EmployeeType' ) ;
    public final void rule__EmployeeType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1177:1: ( ( 'EmployeeType' ) )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1178:1: ( 'EmployeeType' )
            {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1178:1: ( 'EmployeeType' )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1179:1: 'EmployeeType'
            {
             before(grammarAccess.getEmployeeTypeAccess().getEmployeeTypeKeyword_0()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__EmployeeType__Group__0__Impl2278); 
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
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1192:1: rule__EmployeeType__Group__1 : rule__EmployeeType__Group__1__Impl rule__EmployeeType__Group__2 ;
    public final void rule__EmployeeType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1196:1: ( rule__EmployeeType__Group__1__Impl rule__EmployeeType__Group__2 )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1197:2: rule__EmployeeType__Group__1__Impl rule__EmployeeType__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmployeeType__Group__1__Impl_in_rule__EmployeeType__Group__12309);
            rule__EmployeeType__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EmployeeType__Group__2_in_rule__EmployeeType__Group__12312);
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
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1204:1: rule__EmployeeType__Group__1__Impl : ( '[' ) ;
    public final void rule__EmployeeType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1208:1: ( ( '[' ) )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1209:1: ( '[' )
            {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1209:1: ( '[' )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1210:1: '['
            {
             before(grammarAccess.getEmployeeTypeAccess().getLeftSquareBracketKeyword_1()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__EmployeeType__Group__1__Impl2340); 
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
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1223:1: rule__EmployeeType__Group__2 : rule__EmployeeType__Group__2__Impl rule__EmployeeType__Group__3 ;
    public final void rule__EmployeeType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1227:1: ( rule__EmployeeType__Group__2__Impl rule__EmployeeType__Group__3 )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1228:2: rule__EmployeeType__Group__2__Impl rule__EmployeeType__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmployeeType__Group__2__Impl_in_rule__EmployeeType__Group__22371);
            rule__EmployeeType__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EmployeeType__Group__3_in_rule__EmployeeType__Group__22374);
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
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1235:1: rule__EmployeeType__Group__2__Impl : ( 'lastName' ) ;
    public final void rule__EmployeeType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1239:1: ( ( 'lastName' ) )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1240:1: ( 'lastName' )
            {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1240:1: ( 'lastName' )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1241:1: 'lastName'
            {
             before(grammarAccess.getEmployeeTypeAccess().getLastNameKeyword_2()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__EmployeeType__Group__2__Impl2402); 
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
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1254:1: rule__EmployeeType__Group__3 : rule__EmployeeType__Group__3__Impl rule__EmployeeType__Group__4 ;
    public final void rule__EmployeeType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1258:1: ( rule__EmployeeType__Group__3__Impl rule__EmployeeType__Group__4 )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1259:2: rule__EmployeeType__Group__3__Impl rule__EmployeeType__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmployeeType__Group__3__Impl_in_rule__EmployeeType__Group__32433);
            rule__EmployeeType__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EmployeeType__Group__4_in_rule__EmployeeType__Group__32436);
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
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1266:1: rule__EmployeeType__Group__3__Impl : ( ( rule__EmployeeType__LastNameAssignment_3 ) ) ;
    public final void rule__EmployeeType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1270:1: ( ( ( rule__EmployeeType__LastNameAssignment_3 ) ) )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1271:1: ( ( rule__EmployeeType__LastNameAssignment_3 ) )
            {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1271:1: ( ( rule__EmployeeType__LastNameAssignment_3 ) )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1272:1: ( rule__EmployeeType__LastNameAssignment_3 )
            {
             before(grammarAccess.getEmployeeTypeAccess().getLastNameAssignment_3()); 
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1273:1: ( rule__EmployeeType__LastNameAssignment_3 )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1273:2: rule__EmployeeType__LastNameAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmployeeType__LastNameAssignment_3_in_rule__EmployeeType__Group__3__Impl2463);
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
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1283:1: rule__EmployeeType__Group__4 : rule__EmployeeType__Group__4__Impl rule__EmployeeType__Group__5 ;
    public final void rule__EmployeeType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1287:1: ( rule__EmployeeType__Group__4__Impl rule__EmployeeType__Group__5 )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1288:2: rule__EmployeeType__Group__4__Impl rule__EmployeeType__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmployeeType__Group__4__Impl_in_rule__EmployeeType__Group__42493);
            rule__EmployeeType__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EmployeeType__Group__5_in_rule__EmployeeType__Group__42496);
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
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1295:1: rule__EmployeeType__Group__4__Impl : ( 'boss' ) ;
    public final void rule__EmployeeType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1299:1: ( ( 'boss' ) )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1300:1: ( 'boss' )
            {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1300:1: ( 'boss' )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1301:1: 'boss'
            {
             before(grammarAccess.getEmployeeTypeAccess().getBossKeyword_4()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__EmployeeType__Group__4__Impl2524); 
             after(grammarAccess.getEmployeeTypeAccess().getBossKeyword_4()); 

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
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1314:1: rule__EmployeeType__Group__5 : rule__EmployeeType__Group__5__Impl rule__EmployeeType__Group__6 ;
    public final void rule__EmployeeType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1318:1: ( rule__EmployeeType__Group__5__Impl rule__EmployeeType__Group__6 )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1319:2: rule__EmployeeType__Group__5__Impl rule__EmployeeType__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmployeeType__Group__5__Impl_in_rule__EmployeeType__Group__52555);
            rule__EmployeeType__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EmployeeType__Group__6_in_rule__EmployeeType__Group__52558);
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
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1326:1: rule__EmployeeType__Group__5__Impl : ( ( rule__EmployeeType__BossAssignment_5 ) ) ;
    public final void rule__EmployeeType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1330:1: ( ( ( rule__EmployeeType__BossAssignment_5 ) ) )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1331:1: ( ( rule__EmployeeType__BossAssignment_5 ) )
            {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1331:1: ( ( rule__EmployeeType__BossAssignment_5 ) )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1332:1: ( rule__EmployeeType__BossAssignment_5 )
            {
             before(grammarAccess.getEmployeeTypeAccess().getBossAssignment_5()); 
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1333:1: ( rule__EmployeeType__BossAssignment_5 )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1333:2: rule__EmployeeType__BossAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmployeeType__BossAssignment_5_in_rule__EmployeeType__Group__5__Impl2585);
            rule__EmployeeType__BossAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getEmployeeTypeAccess().getBossAssignment_5()); 

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
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1343:1: rule__EmployeeType__Group__6 : rule__EmployeeType__Group__6__Impl rule__EmployeeType__Group__7 ;
    public final void rule__EmployeeType__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1347:1: ( rule__EmployeeType__Group__6__Impl rule__EmployeeType__Group__7 )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1348:2: rule__EmployeeType__Group__6__Impl rule__EmployeeType__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmployeeType__Group__6__Impl_in_rule__EmployeeType__Group__62615);
            rule__EmployeeType__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EmployeeType__Group__7_in_rule__EmployeeType__Group__62618);
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
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1355:1: rule__EmployeeType__Group__6__Impl : ( 'employeeId' ) ;
    public final void rule__EmployeeType__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1359:1: ( ( 'employeeId' ) )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1360:1: ( 'employeeId' )
            {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1360:1: ( 'employeeId' )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1361:1: 'employeeId'
            {
             before(grammarAccess.getEmployeeTypeAccess().getEmployeeIdKeyword_6()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__EmployeeType__Group__6__Impl2646); 
             after(grammarAccess.getEmployeeTypeAccess().getEmployeeIdKeyword_6()); 

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
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1374:1: rule__EmployeeType__Group__7 : rule__EmployeeType__Group__7__Impl rule__EmployeeType__Group__8 ;
    public final void rule__EmployeeType__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1378:1: ( rule__EmployeeType__Group__7__Impl rule__EmployeeType__Group__8 )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1379:2: rule__EmployeeType__Group__7__Impl rule__EmployeeType__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmployeeType__Group__7__Impl_in_rule__EmployeeType__Group__72677);
            rule__EmployeeType__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EmployeeType__Group__8_in_rule__EmployeeType__Group__72680);
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
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1386:1: rule__EmployeeType__Group__7__Impl : ( ( rule__EmployeeType__EmployeeIdAssignment_7 ) ) ;
    public final void rule__EmployeeType__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1390:1: ( ( ( rule__EmployeeType__EmployeeIdAssignment_7 ) ) )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1391:1: ( ( rule__EmployeeType__EmployeeIdAssignment_7 ) )
            {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1391:1: ( ( rule__EmployeeType__EmployeeIdAssignment_7 ) )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1392:1: ( rule__EmployeeType__EmployeeIdAssignment_7 )
            {
             before(grammarAccess.getEmployeeTypeAccess().getEmployeeIdAssignment_7()); 
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1393:1: ( rule__EmployeeType__EmployeeIdAssignment_7 )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1393:2: rule__EmployeeType__EmployeeIdAssignment_7
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmployeeType__EmployeeIdAssignment_7_in_rule__EmployeeType__Group__7__Impl2707);
            rule__EmployeeType__EmployeeIdAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getEmployeeTypeAccess().getEmployeeIdAssignment_7()); 

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
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1403:1: rule__EmployeeType__Group__8 : rule__EmployeeType__Group__8__Impl ;
    public final void rule__EmployeeType__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1407:1: ( rule__EmployeeType__Group__8__Impl )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1408:2: rule__EmployeeType__Group__8__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmployeeType__Group__8__Impl_in_rule__EmployeeType__Group__82737);
            rule__EmployeeType__Group__8__Impl();

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
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1414:1: rule__EmployeeType__Group__8__Impl : ( ']' ) ;
    public final void rule__EmployeeType__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1418:1: ( ( ']' ) )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1419:1: ( ']' )
            {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1419:1: ( ']' )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1420:1: ']'
            {
             before(grammarAccess.getEmployeeTypeAccess().getRightSquareBracketKeyword_8()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__EmployeeType__Group__8__Impl2765); 
             after(grammarAccess.getEmployeeTypeAccess().getRightSquareBracketKeyword_8()); 

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


    // $ANTLR start "rule__IdValues__Group__0"
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1451:1: rule__IdValues__Group__0 : rule__IdValues__Group__0__Impl rule__IdValues__Group__1 ;
    public final void rule__IdValues__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1455:1: ( rule__IdValues__Group__0__Impl rule__IdValues__Group__1 )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1456:2: rule__IdValues__Group__0__Impl rule__IdValues__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__IdValues__Group__0__Impl_in_rule__IdValues__Group__02814);
            rule__IdValues__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__IdValues__Group__1_in_rule__IdValues__Group__02817);
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
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1463:1: rule__IdValues__Group__0__Impl : ( () ) ;
    public final void rule__IdValues__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1467:1: ( ( () ) )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1468:1: ( () )
            {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1468:1: ( () )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1469:1: ()
            {
             before(grammarAccess.getIdValuesAccess().getIdValuesAction_0()); 
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1470:1: ()
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1472:1: 
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
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1482:1: rule__IdValues__Group__1 : rule__IdValues__Group__1__Impl ;
    public final void rule__IdValues__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1486:1: ( rule__IdValues__Group__1__Impl )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1487:2: rule__IdValues__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__IdValues__Group__1__Impl_in_rule__IdValues__Group__12875);
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
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1493:1: rule__IdValues__Group__1__Impl : ( ( rule__IdValues__NameAssignment_1 ) ) ;
    public final void rule__IdValues__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1497:1: ( ( ( rule__IdValues__NameAssignment_1 ) ) )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1498:1: ( ( rule__IdValues__NameAssignment_1 ) )
            {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1498:1: ( ( rule__IdValues__NameAssignment_1 ) )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1499:1: ( rule__IdValues__NameAssignment_1 )
            {
             before(grammarAccess.getIdValuesAccess().getNameAssignment_1()); 
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1500:1: ( rule__IdValues__NameAssignment_1 )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1500:2: rule__IdValues__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__IdValues__NameAssignment_1_in_rule__IdValues__Group__1__Impl2902);
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


    // $ANTLR start "rule__EmployeeListType__BossAssignment_3_2"
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1515:1: rule__EmployeeListType__BossAssignment_3_2 : ( ruleBossType ) ;
    public final void rule__EmployeeListType__BossAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1519:1: ( ( ruleBossType ) )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1520:1: ( ruleBossType )
            {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1520:1: ( ruleBossType )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1521:1: ruleBossType
            {
             before(grammarAccess.getEmployeeListTypeAccess().getBossBossTypeParserRuleCall_3_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleBossType_in_rule__EmployeeListType__BossAssignment_3_22941);
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
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1530:1: rule__EmployeeListType__BossAssignment_3_3_1 : ( ruleBossType ) ;
    public final void rule__EmployeeListType__BossAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1534:1: ( ( ruleBossType ) )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1535:1: ( ruleBossType )
            {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1535:1: ( ruleBossType )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1536:1: ruleBossType
            {
             before(grammarAccess.getEmployeeListTypeAccess().getBossBossTypeParserRuleCall_3_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleBossType_in_rule__EmployeeListType__BossAssignment_3_3_12972);
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
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1545:1: rule__EmployeeListType__EmployeeAssignment_4_2 : ( ruleEmployeeType ) ;
    public final void rule__EmployeeListType__EmployeeAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1549:1: ( ( ruleEmployeeType ) )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1550:1: ( ruleEmployeeType )
            {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1550:1: ( ruleEmployeeType )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1551:1: ruleEmployeeType
            {
             before(grammarAccess.getEmployeeListTypeAccess().getEmployeeEmployeeTypeParserRuleCall_4_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEmployeeType_in_rule__EmployeeListType__EmployeeAssignment_4_23003);
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
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1560:1: rule__EmployeeListType__EmployeeAssignment_4_3_1 : ( ruleEmployeeType ) ;
    public final void rule__EmployeeListType__EmployeeAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1564:1: ( ( ruleEmployeeType ) )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1565:1: ( ruleEmployeeType )
            {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1565:1: ( ruleEmployeeType )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1566:1: ruleEmployeeType
            {
             before(grammarAccess.getEmployeeListTypeAccess().getEmployeeEmployeeTypeParserRuleCall_4_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEmployeeType_in_rule__EmployeeListType__EmployeeAssignment_4_3_13034);
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
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1575:1: rule__BossType__LastNameAssignment_3 : ( ruleString0 ) ;
    public final void rule__BossType__LastNameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1579:1: ( ( ruleString0 ) )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1580:1: ( ruleString0 )
            {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1580:1: ( ruleString0 )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1581:1: ruleString0
            {
             before(grammarAccess.getBossTypeAccess().getLastNameString0ParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleString0_in_rule__BossType__LastNameAssignment_33065);
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


    // $ANTLR start "rule__BossType__SuperBossAssignment_5"
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1590:1: rule__BossType__SuperBossAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__BossType__SuperBossAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1594:1: ( ( ( RULE_ID ) ) )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1595:1: ( ( RULE_ID ) )
            {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1595:1: ( ( RULE_ID ) )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1596:1: ( RULE_ID )
            {
             before(grammarAccess.getBossTypeAccess().getSuperBossIdValuesCrossReference_5_0()); 
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1597:1: ( RULE_ID )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1598:1: RULE_ID
            {
             before(grammarAccess.getBossTypeAccess().getSuperBossIdValuesIDTerminalRuleCall_5_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__BossType__SuperBossAssignment_53100); 
             after(grammarAccess.getBossTypeAccess().getSuperBossIdValuesIDTerminalRuleCall_5_0_1()); 

            }

             after(grammarAccess.getBossTypeAccess().getSuperBossIdValuesCrossReference_5_0()); 

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
    // $ANTLR end "rule__BossType__SuperBossAssignment_5"


    // $ANTLR start "rule__BossType__BossIdAssignment_7"
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1609:1: rule__BossType__BossIdAssignment_7 : ( ruleIdValues ) ;
    public final void rule__BossType__BossIdAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1613:1: ( ( ruleIdValues ) )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1614:1: ( ruleIdValues )
            {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1614:1: ( ruleIdValues )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1615:1: ruleIdValues
            {
             before(grammarAccess.getBossTypeAccess().getBossIdIdValuesParserRuleCall_7_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleIdValues_in_rule__BossType__BossIdAssignment_73135);
            ruleIdValues();

            state._fsp--;

             after(grammarAccess.getBossTypeAccess().getBossIdIdValuesParserRuleCall_7_0()); 

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
    // $ANTLR end "rule__BossType__BossIdAssignment_7"


    // $ANTLR start "rule__EmployeeType__LastNameAssignment_3"
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1624:1: rule__EmployeeType__LastNameAssignment_3 : ( ruleString0 ) ;
    public final void rule__EmployeeType__LastNameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1628:1: ( ( ruleString0 ) )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1629:1: ( ruleString0 )
            {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1629:1: ( ruleString0 )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1630:1: ruleString0
            {
             before(grammarAccess.getEmployeeTypeAccess().getLastNameString0ParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleString0_in_rule__EmployeeType__LastNameAssignment_33166);
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


    // $ANTLR start "rule__EmployeeType__BossAssignment_5"
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1639:1: rule__EmployeeType__BossAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__EmployeeType__BossAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1643:1: ( ( ( RULE_ID ) ) )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1644:1: ( ( RULE_ID ) )
            {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1644:1: ( ( RULE_ID ) )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1645:1: ( RULE_ID )
            {
             before(grammarAccess.getEmployeeTypeAccess().getBossIdValuesCrossReference_5_0()); 
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1646:1: ( RULE_ID )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1647:1: RULE_ID
            {
             before(grammarAccess.getEmployeeTypeAccess().getBossIdValuesIDTerminalRuleCall_5_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__EmployeeType__BossAssignment_53201); 
             after(grammarAccess.getEmployeeTypeAccess().getBossIdValuesIDTerminalRuleCall_5_0_1()); 

            }

             after(grammarAccess.getEmployeeTypeAccess().getBossIdValuesCrossReference_5_0()); 

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
    // $ANTLR end "rule__EmployeeType__BossAssignment_5"


    // $ANTLR start "rule__EmployeeType__EmployeeIdAssignment_7"
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1658:1: rule__EmployeeType__EmployeeIdAssignment_7 : ( ruleIdValues ) ;
    public final void rule__EmployeeType__EmployeeIdAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1662:1: ( ( ruleIdValues ) )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1663:1: ( ruleIdValues )
            {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1663:1: ( ruleIdValues )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1664:1: ruleIdValues
            {
             before(grammarAccess.getEmployeeTypeAccess().getEmployeeIdIdValuesParserRuleCall_7_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleIdValues_in_rule__EmployeeType__EmployeeIdAssignment_73236);
            ruleIdValues();

            state._fsp--;

             after(grammarAccess.getEmployeeTypeAccess().getEmployeeIdIdValuesParserRuleCall_7_0()); 

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
    // $ANTLR end "rule__EmployeeType__EmployeeIdAssignment_7"


    // $ANTLR start "rule__IdValues__NameAssignment_1"
    // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1673:1: rule__IdValues__NameAssignment_1 : ( ruleID0 ) ;
    public final void rule__IdValues__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1677:1: ( ( ruleID0 ) )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1678:1: ( ruleID0 )
            {
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1678:1: ( ruleID0 )
            // ../org.xtext.example.demo.ui/src-gen/at/ac/tuwien/big/xmltext/idIdref/ui/contentassist/antlr/internal/InternalIdIdref.g:1679:1: ruleID0
            {
             before(grammarAccess.getIdValuesAccess().getNameID0ParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleID0_in_rule__IdValues__NameAssignment_13267);
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
        public static final BitSet FOLLOW_ruleID0_in_entryRuleID0360 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleID0367 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleID0393 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmployeeListType__Group__0__Impl_in_rule__EmployeeListType__Group__0428 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_rule__EmployeeListType__Group__1_in_rule__EmployeeListType__Group__0431 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmployeeListType__Group__1__Impl_in_rule__EmployeeListType__Group__1489 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__EmployeeListType__Group__2_in_rule__EmployeeListType__Group__1492 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_rule__EmployeeListType__Group__1__Impl520 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmployeeListType__Group__2__Impl_in_rule__EmployeeListType__Group__2551 = new BitSet(new long[]{0x0000000000016000L});
        public static final BitSet FOLLOW_rule__EmployeeListType__Group__3_in_rule__EmployeeListType__Group__2554 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__EmployeeListType__Group__2__Impl582 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmployeeListType__Group__3__Impl_in_rule__EmployeeListType__Group__3613 = new BitSet(new long[]{0x0000000000016000L});
        public static final BitSet FOLLOW_rule__EmployeeListType__Group__4_in_rule__EmployeeListType__Group__3616 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmployeeListType__Group_3__0_in_rule__EmployeeListType__Group__3__Impl643 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmployeeListType__Group__4__Impl_in_rule__EmployeeListType__Group__4674 = new BitSet(new long[]{0x0000000000016000L});
        public static final BitSet FOLLOW_rule__EmployeeListType__Group__5_in_rule__EmployeeListType__Group__4677 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmployeeListType__Group_4__0_in_rule__EmployeeListType__Group__4__Impl704 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmployeeListType__Group__5__Impl_in_rule__EmployeeListType__Group__5735 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__EmployeeListType__Group__5__Impl763 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmployeeListType__Group_3__0__Impl_in_rule__EmployeeListType__Group_3__0806 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__EmployeeListType__Group_3__1_in_rule__EmployeeListType__Group_3__0809 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__EmployeeListType__Group_3__0__Impl837 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmployeeListType__Group_3__1__Impl_in_rule__EmployeeListType__Group_3__1868 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__EmployeeListType__Group_3__2_in_rule__EmployeeListType__Group_3__1871 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__EmployeeListType__Group_3__1__Impl899 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmployeeListType__Group_3__2__Impl_in_rule__EmployeeListType__Group_3__2930 = new BitSet(new long[]{0x000000000000A000L});
        public static final BitSet FOLLOW_rule__EmployeeListType__Group_3__3_in_rule__EmployeeListType__Group_3__2933 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmployeeListType__BossAssignment_3_2_in_rule__EmployeeListType__Group_3__2__Impl960 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmployeeListType__Group_3__3__Impl_in_rule__EmployeeListType__Group_3__3990 = new BitSet(new long[]{0x000000000000A000L});
        public static final BitSet FOLLOW_rule__EmployeeListType__Group_3__4_in_rule__EmployeeListType__Group_3__3993 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmployeeListType__Group_3_3__0_in_rule__EmployeeListType__Group_3__3__Impl1020 = new BitSet(new long[]{0x0000000000008002L});
        public static final BitSet FOLLOW_rule__EmployeeListType__Group_3__4__Impl_in_rule__EmployeeListType__Group_3__41051 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__EmployeeListType__Group_3__4__Impl1079 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmployeeListType__Group_3_3__0__Impl_in_rule__EmployeeListType__Group_3_3__01120 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__EmployeeListType__Group_3_3__1_in_rule__EmployeeListType__Group_3_3__01123 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__EmployeeListType__Group_3_3__0__Impl1151 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmployeeListType__Group_3_3__1__Impl_in_rule__EmployeeListType__Group_3_3__11182 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmployeeListType__BossAssignment_3_3_1_in_rule__EmployeeListType__Group_3_3__1__Impl1209 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmployeeListType__Group_4__0__Impl_in_rule__EmployeeListType__Group_4__01243 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__EmployeeListType__Group_4__1_in_rule__EmployeeListType__Group_4__01246 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__EmployeeListType__Group_4__0__Impl1274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmployeeListType__Group_4__1__Impl_in_rule__EmployeeListType__Group_4__11305 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__EmployeeListType__Group_4__2_in_rule__EmployeeListType__Group_4__11308 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__EmployeeListType__Group_4__1__Impl1336 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmployeeListType__Group_4__2__Impl_in_rule__EmployeeListType__Group_4__21367 = new BitSet(new long[]{0x000000000000A000L});
        public static final BitSet FOLLOW_rule__EmployeeListType__Group_4__3_in_rule__EmployeeListType__Group_4__21370 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmployeeListType__EmployeeAssignment_4_2_in_rule__EmployeeListType__Group_4__2__Impl1397 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmployeeListType__Group_4__3__Impl_in_rule__EmployeeListType__Group_4__31427 = new BitSet(new long[]{0x000000000000A000L});
        public static final BitSet FOLLOW_rule__EmployeeListType__Group_4__4_in_rule__EmployeeListType__Group_4__31430 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmployeeListType__Group_4_3__0_in_rule__EmployeeListType__Group_4__3__Impl1457 = new BitSet(new long[]{0x0000000000008002L});
        public static final BitSet FOLLOW_rule__EmployeeListType__Group_4__4__Impl_in_rule__EmployeeListType__Group_4__41488 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__EmployeeListType__Group_4__4__Impl1516 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmployeeListType__Group_4_3__0__Impl_in_rule__EmployeeListType__Group_4_3__01557 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__EmployeeListType__Group_4_3__1_in_rule__EmployeeListType__Group_4_3__01560 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__EmployeeListType__Group_4_3__0__Impl1588 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmployeeListType__Group_4_3__1__Impl_in_rule__EmployeeListType__Group_4_3__11619 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmployeeListType__EmployeeAssignment_4_3_1_in_rule__EmployeeListType__Group_4_3__1__Impl1646 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BossType__Group__0__Impl_in_rule__BossType__Group__01680 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__BossType__Group__1_in_rule__BossType__Group__01683 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__BossType__Group__0__Impl1711 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BossType__Group__1__Impl_in_rule__BossType__Group__11742 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__BossType__Group__2_in_rule__BossType__Group__11745 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__BossType__Group__1__Impl1773 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BossType__Group__2__Impl_in_rule__BossType__Group__21804 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__BossType__Group__3_in_rule__BossType__Group__21807 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__BossType__Group__2__Impl1835 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BossType__Group__3__Impl_in_rule__BossType__Group__31866 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_rule__BossType__Group__4_in_rule__BossType__Group__31869 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BossType__LastNameAssignment_3_in_rule__BossType__Group__3__Impl1896 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BossType__Group__4__Impl_in_rule__BossType__Group__41926 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__BossType__Group__5_in_rule__BossType__Group__41929 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__BossType__Group__4__Impl1957 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BossType__Group__5__Impl_in_rule__BossType__Group__51988 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_rule__BossType__Group__6_in_rule__BossType__Group__51991 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BossType__SuperBossAssignment_5_in_rule__BossType__Group__5__Impl2018 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BossType__Group__6__Impl_in_rule__BossType__Group__62048 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__BossType__Group__7_in_rule__BossType__Group__62051 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__BossType__Group__6__Impl2079 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BossType__Group__7__Impl_in_rule__BossType__Group__72110 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_rule__BossType__Group__8_in_rule__BossType__Group__72113 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BossType__BossIdAssignment_7_in_rule__BossType__Group__7__Impl2140 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BossType__Group__8__Impl_in_rule__BossType__Group__82170 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__BossType__Group__8__Impl2198 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmployeeType__Group__0__Impl_in_rule__EmployeeType__Group__02247 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__EmployeeType__Group__1_in_rule__EmployeeType__Group__02250 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__EmployeeType__Group__0__Impl2278 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmployeeType__Group__1__Impl_in_rule__EmployeeType__Group__12309 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__EmployeeType__Group__2_in_rule__EmployeeType__Group__12312 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__EmployeeType__Group__1__Impl2340 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmployeeType__Group__2__Impl_in_rule__EmployeeType__Group__22371 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__EmployeeType__Group__3_in_rule__EmployeeType__Group__22374 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__EmployeeType__Group__2__Impl2402 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmployeeType__Group__3__Impl_in_rule__EmployeeType__Group__32433 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__EmployeeType__Group__4_in_rule__EmployeeType__Group__32436 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmployeeType__LastNameAssignment_3_in_rule__EmployeeType__Group__3__Impl2463 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmployeeType__Group__4__Impl_in_rule__EmployeeType__Group__42493 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__EmployeeType__Group__5_in_rule__EmployeeType__Group__42496 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__EmployeeType__Group__4__Impl2524 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmployeeType__Group__5__Impl_in_rule__EmployeeType__Group__52555 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_rule__EmployeeType__Group__6_in_rule__EmployeeType__Group__52558 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmployeeType__BossAssignment_5_in_rule__EmployeeType__Group__5__Impl2585 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmployeeType__Group__6__Impl_in_rule__EmployeeType__Group__62615 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__EmployeeType__Group__7_in_rule__EmployeeType__Group__62618 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__EmployeeType__Group__6__Impl2646 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmployeeType__Group__7__Impl_in_rule__EmployeeType__Group__72677 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_rule__EmployeeType__Group__8_in_rule__EmployeeType__Group__72680 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmployeeType__EmployeeIdAssignment_7_in_rule__EmployeeType__Group__7__Impl2707 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmployeeType__Group__8__Impl_in_rule__EmployeeType__Group__82737 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__EmployeeType__Group__8__Impl2765 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IdValues__Group__0__Impl_in_rule__IdValues__Group__02814 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__IdValues__Group__1_in_rule__IdValues__Group__02817 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IdValues__Group__1__Impl_in_rule__IdValues__Group__12875 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IdValues__NameAssignment_1_in_rule__IdValues__Group__1__Impl2902 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBossType_in_rule__EmployeeListType__BossAssignment_3_22941 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBossType_in_rule__EmployeeListType__BossAssignment_3_3_12972 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEmployeeType_in_rule__EmployeeListType__EmployeeAssignment_4_23003 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEmployeeType_in_rule__EmployeeListType__EmployeeAssignment_4_3_13034 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleString0_in_rule__BossType__LastNameAssignment_33065 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__BossType__SuperBossAssignment_53100 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIdValues_in_rule__BossType__BossIdAssignment_73135 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleString0_in_rule__EmployeeType__LastNameAssignment_33166 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__EmployeeType__BossAssignment_53201 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIdValues_in_rule__EmployeeType__EmployeeIdAssignment_73236 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleID0_in_rule__IdValues__NameAssignment_13267 = new BitSet(new long[]{0x0000000000000002L});
    }


}