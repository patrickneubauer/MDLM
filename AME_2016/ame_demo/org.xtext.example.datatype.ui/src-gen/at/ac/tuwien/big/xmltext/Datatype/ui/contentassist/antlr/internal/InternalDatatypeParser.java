package at.ac.tuwien.big.xmltext.Datatype.ui.contentassist.antlr.internal; 

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
import at.ac.tuwien.big.xmltext.Datatype.services.DatatypeGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDatatypeParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'DateTime'", "'true'", "'false'", "'LibraryType'", "'['", "']'", "'customer'", "','", "'CustomerType'", "'firstName'", "'lastName'", "'birthDate'", "'birthTime'", "'age'", "'prize'", "'disabled'", "'dateTime'", "'-'", "':'", "'.'"
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
    public static final int T__30=30;
    public static final int RULE_ID=6;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalDatatypeParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDatatypeParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDatatypeParser.tokenNames; }
    public String getGrammarFileName() { return "../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g"; }


     
     	private DatatypeGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(DatatypeGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleLibraryType"
    // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:60:1: entryRuleLibraryType : ruleLibraryType EOF ;
    public final void entryRuleLibraryType() throws RecognitionException {
        try {
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:61:1: ( ruleLibraryType EOF )
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:62:1: ruleLibraryType EOF
            {
             before(grammarAccess.getLibraryTypeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLibraryType_in_entryRuleLibraryType61);
            ruleLibraryType();

            state._fsp--;

             after(grammarAccess.getLibraryTypeRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLibraryType68); 

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
    // $ANTLR end "entryRuleLibraryType"


    // $ANTLR start "ruleLibraryType"
    // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:69:1: ruleLibraryType : ( ( rule__LibraryType__Group__0 ) ) ;
    public final void ruleLibraryType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:73:2: ( ( ( rule__LibraryType__Group__0 ) ) )
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:74:1: ( ( rule__LibraryType__Group__0 ) )
            {
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:74:1: ( ( rule__LibraryType__Group__0 ) )
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:75:1: ( rule__LibraryType__Group__0 )
            {
             before(grammarAccess.getLibraryTypeAccess().getGroup()); 
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:76:1: ( rule__LibraryType__Group__0 )
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:76:2: rule__LibraryType__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__LibraryType__Group__0_in_ruleLibraryType94);
            rule__LibraryType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLibraryTypeAccess().getGroup()); 

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
    // $ANTLR end "ruleLibraryType"


    // $ANTLR start "entryRuleCustomerType"
    // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:88:1: entryRuleCustomerType : ruleCustomerType EOF ;
    public final void entryRuleCustomerType() throws RecognitionException {
        try {
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:89:1: ( ruleCustomerType EOF )
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:90:1: ruleCustomerType EOF
            {
             before(grammarAccess.getCustomerTypeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCustomerType_in_entryRuleCustomerType121);
            ruleCustomerType();

            state._fsp--;

             after(grammarAccess.getCustomerTypeRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCustomerType128); 

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
    // $ANTLR end "entryRuleCustomerType"


    // $ANTLR start "ruleCustomerType"
    // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:97:1: ruleCustomerType : ( ( rule__CustomerType__Group__0 ) ) ;
    public final void ruleCustomerType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:101:2: ( ( ( rule__CustomerType__Group__0 ) ) )
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:102:1: ( ( rule__CustomerType__Group__0 ) )
            {
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:102:1: ( ( rule__CustomerType__Group__0 ) )
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:103:1: ( rule__CustomerType__Group__0 )
            {
             before(grammarAccess.getCustomerTypeAccess().getGroup()); 
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:104:1: ( rule__CustomerType__Group__0 )
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:104:2: rule__CustomerType__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__CustomerType__Group__0_in_ruleCustomerType154);
            rule__CustomerType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCustomerTypeAccess().getGroup()); 

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
    // $ANTLR end "ruleCustomerType"


    // $ANTLR start "entryRuleString0"
    // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:116:1: entryRuleString0 : ruleString0 EOF ;
    public final void entryRuleString0() throws RecognitionException {
        try {
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:117:1: ( ruleString0 EOF )
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:118:1: ruleString0 EOF
            {
             before(grammarAccess.getString0Rule()); 
            pushFollow(FollowSets000.FOLLOW_ruleString0_in_entryRuleString0181);
            ruleString0();

            state._fsp--;

             after(grammarAccess.getString0Rule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleString0188); 

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
    // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:125:1: ruleString0 : ( RULE_STRING ) ;
    public final void ruleString0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:129:2: ( ( RULE_STRING ) )
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:130:1: ( RULE_STRING )
            {
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:130:1: ( RULE_STRING )
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:131:1: RULE_STRING
            {
             before(grammarAccess.getString0Access().getSTRINGTerminalRuleCall()); 
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleString0214); 
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


    // $ANTLR start "entryRuleDate"
    // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:144:1: entryRuleDate : ruleDate EOF ;
    public final void entryRuleDate() throws RecognitionException {
        try {
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:145:1: ( ruleDate EOF )
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:146:1: ruleDate EOF
            {
             before(grammarAccess.getDateRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDate_in_entryRuleDate240);
            ruleDate();

            state._fsp--;

             after(grammarAccess.getDateRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDate247); 

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
    // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:153:1: ruleDate : ( ( rule__Date__Group__0 ) ) ;
    public final void ruleDate() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:157:2: ( ( ( rule__Date__Group__0 ) ) )
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:158:1: ( ( rule__Date__Group__0 ) )
            {
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:158:1: ( ( rule__Date__Group__0 ) )
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:159:1: ( rule__Date__Group__0 )
            {
             before(grammarAccess.getDateAccess().getGroup()); 
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:160:1: ( rule__Date__Group__0 )
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:160:2: rule__Date__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Date__Group__0_in_ruleDate273);
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


    // $ANTLR start "entryRuleTime"
    // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:172:1: entryRuleTime : ruleTime EOF ;
    public final void entryRuleTime() throws RecognitionException {
        try {
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:173:1: ( ruleTime EOF )
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:174:1: ruleTime EOF
            {
             before(grammarAccess.getTimeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTime_in_entryRuleTime300);
            ruleTime();

            state._fsp--;

             after(grammarAccess.getTimeRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTime307); 

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
    // $ANTLR end "entryRuleTime"


    // $ANTLR start "ruleTime"
    // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:181:1: ruleTime : ( ( rule__Time__Group__0 ) ) ;
    public final void ruleTime() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:185:2: ( ( ( rule__Time__Group__0 ) ) )
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:186:1: ( ( rule__Time__Group__0 ) )
            {
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:186:1: ( ( rule__Time__Group__0 ) )
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:187:1: ( rule__Time__Group__0 )
            {
             before(grammarAccess.getTimeAccess().getGroup()); 
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:188:1: ( rule__Time__Group__0 )
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:188:2: rule__Time__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Time__Group__0_in_ruleTime333);
            rule__Time__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTimeAccess().getGroup()); 

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
    // $ANTLR end "ruleTime"


    // $ANTLR start "entryRuleDateTime"
    // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:200:1: entryRuleDateTime : ruleDateTime EOF ;
    public final void entryRuleDateTime() throws RecognitionException {
        try {
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:201:1: ( ruleDateTime EOF )
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:202:1: ruleDateTime EOF
            {
             before(grammarAccess.getDateTimeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDateTime_in_entryRuleDateTime360);
            ruleDateTime();

            state._fsp--;

             after(grammarAccess.getDateTimeRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDateTime367); 

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
    // $ANTLR end "entryRuleDateTime"


    // $ANTLR start "ruleDateTime"
    // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:209:1: ruleDateTime : ( 'DateTime' ) ;
    public final void ruleDateTime() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:213:2: ( ( 'DateTime' ) )
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:214:1: ( 'DateTime' )
            {
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:214:1: ( 'DateTime' )
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:215:1: 'DateTime'
            {
             before(grammarAccess.getDateTimeAccess().getDateTimeKeyword()); 
            match(input,11,FollowSets000.FOLLOW_11_in_ruleDateTime394); 
             after(grammarAccess.getDateTimeAccess().getDateTimeKeyword()); 

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
    // $ANTLR end "ruleDateTime"


    // $ANTLR start "entryRuleInteger"
    // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:230:1: entryRuleInteger : ruleInteger EOF ;
    public final void entryRuleInteger() throws RecognitionException {
        try {
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:231:1: ( ruleInteger EOF )
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:232:1: ruleInteger EOF
            {
             before(grammarAccess.getIntegerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInteger_in_entryRuleInteger422);
            ruleInteger();

            state._fsp--;

             after(grammarAccess.getIntegerRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInteger429); 

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
    // $ANTLR end "entryRuleInteger"


    // $ANTLR start "ruleInteger"
    // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:239:1: ruleInteger : ( RULE_INT ) ;
    public final void ruleInteger() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:243:2: ( ( RULE_INT ) )
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:244:1: ( RULE_INT )
            {
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:244:1: ( RULE_INT )
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:245:1: RULE_INT
            {
             before(grammarAccess.getIntegerAccess().getINTTerminalRuleCall()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleInteger455); 
             after(grammarAccess.getIntegerAccess().getINTTerminalRuleCall()); 

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
    // $ANTLR end "ruleInteger"


    // $ANTLR start "entryRuleDecimal"
    // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:258:1: entryRuleDecimal : ruleDecimal EOF ;
    public final void entryRuleDecimal() throws RecognitionException {
        try {
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:259:1: ( ruleDecimal EOF )
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:260:1: ruleDecimal EOF
            {
             before(grammarAccess.getDecimalRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDecimal_in_entryRuleDecimal481);
            ruleDecimal();

            state._fsp--;

             after(grammarAccess.getDecimalRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDecimal488); 

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
    // $ANTLR end "entryRuleDecimal"


    // $ANTLR start "ruleDecimal"
    // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:267:1: ruleDecimal : ( ( rule__Decimal__Group__0 ) ) ;
    public final void ruleDecimal() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:271:2: ( ( ( rule__Decimal__Group__0 ) ) )
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:272:1: ( ( rule__Decimal__Group__0 ) )
            {
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:272:1: ( ( rule__Decimal__Group__0 ) )
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:273:1: ( rule__Decimal__Group__0 )
            {
             before(grammarAccess.getDecimalAccess().getGroup()); 
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:274:1: ( rule__Decimal__Group__0 )
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:274:2: rule__Decimal__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Decimal__Group__0_in_ruleDecimal514);
            rule__Decimal__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDecimalAccess().getGroup()); 

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
    // $ANTLR end "ruleDecimal"


    // $ANTLR start "entryRuleBoolean"
    // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:286:1: entryRuleBoolean : ruleBoolean EOF ;
    public final void entryRuleBoolean() throws RecognitionException {
        try {
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:287:1: ( ruleBoolean EOF )
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:288:1: ruleBoolean EOF
            {
             before(grammarAccess.getBooleanRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBoolean_in_entryRuleBoolean541);
            ruleBoolean();

            state._fsp--;

             after(grammarAccess.getBooleanRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBoolean548); 

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
    // $ANTLR end "entryRuleBoolean"


    // $ANTLR start "ruleBoolean"
    // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:295:1: ruleBoolean : ( ( rule__Boolean__Alternatives ) ) ;
    public final void ruleBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:299:2: ( ( ( rule__Boolean__Alternatives ) ) )
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:300:1: ( ( rule__Boolean__Alternatives ) )
            {
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:300:1: ( ( rule__Boolean__Alternatives ) )
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:301:1: ( rule__Boolean__Alternatives )
            {
             before(grammarAccess.getBooleanAccess().getAlternatives()); 
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:302:1: ( rule__Boolean__Alternatives )
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:302:2: rule__Boolean__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__Boolean__Alternatives_in_ruleBoolean574);
            rule__Boolean__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBooleanAccess().getAlternatives()); 

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
    // $ANTLR end "ruleBoolean"


    // $ANTLR start "rule__Boolean__Alternatives"
    // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:316:1: rule__Boolean__Alternatives : ( ( 'true' ) | ( 'false' ) );
    public final void rule__Boolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:320:1: ( ( 'true' ) | ( 'false' ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==12) ) {
                alt1=1;
            }
            else if ( (LA1_0==13) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:321:1: ( 'true' )
                    {
                    // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:321:1: ( 'true' )
                    // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:322:1: 'true'
                    {
                     before(grammarAccess.getBooleanAccess().getTrueKeyword_0()); 
                    match(input,12,FollowSets000.FOLLOW_12_in_rule__Boolean__Alternatives613); 
                     after(grammarAccess.getBooleanAccess().getTrueKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:329:6: ( 'false' )
                    {
                    // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:329:6: ( 'false' )
                    // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:330:1: 'false'
                    {
                     before(grammarAccess.getBooleanAccess().getFalseKeyword_1()); 
                    match(input,13,FollowSets000.FOLLOW_13_in_rule__Boolean__Alternatives633); 
                     after(grammarAccess.getBooleanAccess().getFalseKeyword_1()); 

                    }


                    }
                    break;

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
    // $ANTLR end "rule__Boolean__Alternatives"


    // $ANTLR start "rule__LibraryType__Group__0"
    // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:344:1: rule__LibraryType__Group__0 : rule__LibraryType__Group__0__Impl rule__LibraryType__Group__1 ;
    public final void rule__LibraryType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:348:1: ( rule__LibraryType__Group__0__Impl rule__LibraryType__Group__1 )
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:349:2: rule__LibraryType__Group__0__Impl rule__LibraryType__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__LibraryType__Group__0__Impl_in_rule__LibraryType__Group__0665);
            rule__LibraryType__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LibraryType__Group__1_in_rule__LibraryType__Group__0668);
            rule__LibraryType__Group__1();

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
    // $ANTLR end "rule__LibraryType__Group__0"


    // $ANTLR start "rule__LibraryType__Group__0__Impl"
    // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:356:1: rule__LibraryType__Group__0__Impl : ( () ) ;
    public final void rule__LibraryType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:360:1: ( ( () ) )
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:361:1: ( () )
            {
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:361:1: ( () )
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:362:1: ()
            {
             before(grammarAccess.getLibraryTypeAccess().getLibraryTypeAction_0()); 
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:363:1: ()
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:365:1: 
            {
            }

             after(grammarAccess.getLibraryTypeAccess().getLibraryTypeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LibraryType__Group__0__Impl"


    // $ANTLR start "rule__LibraryType__Group__1"
    // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:375:1: rule__LibraryType__Group__1 : rule__LibraryType__Group__1__Impl rule__LibraryType__Group__2 ;
    public final void rule__LibraryType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:379:1: ( rule__LibraryType__Group__1__Impl rule__LibraryType__Group__2 )
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:380:2: rule__LibraryType__Group__1__Impl rule__LibraryType__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__LibraryType__Group__1__Impl_in_rule__LibraryType__Group__1726);
            rule__LibraryType__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LibraryType__Group__2_in_rule__LibraryType__Group__1729);
            rule__LibraryType__Group__2();

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
    // $ANTLR end "rule__LibraryType__Group__1"


    // $ANTLR start "rule__LibraryType__Group__1__Impl"
    // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:387:1: rule__LibraryType__Group__1__Impl : ( 'LibraryType' ) ;
    public final void rule__LibraryType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:391:1: ( ( 'LibraryType' ) )
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:392:1: ( 'LibraryType' )
            {
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:392:1: ( 'LibraryType' )
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:393:1: 'LibraryType'
            {
             before(grammarAccess.getLibraryTypeAccess().getLibraryTypeKeyword_1()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__LibraryType__Group__1__Impl757); 
             after(grammarAccess.getLibraryTypeAccess().getLibraryTypeKeyword_1()); 

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
    // $ANTLR end "rule__LibraryType__Group__1__Impl"


    // $ANTLR start "rule__LibraryType__Group__2"
    // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:406:1: rule__LibraryType__Group__2 : rule__LibraryType__Group__2__Impl rule__LibraryType__Group__3 ;
    public final void rule__LibraryType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:410:1: ( rule__LibraryType__Group__2__Impl rule__LibraryType__Group__3 )
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:411:2: rule__LibraryType__Group__2__Impl rule__LibraryType__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__LibraryType__Group__2__Impl_in_rule__LibraryType__Group__2788);
            rule__LibraryType__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LibraryType__Group__3_in_rule__LibraryType__Group__2791);
            rule__LibraryType__Group__3();

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
    // $ANTLR end "rule__LibraryType__Group__2"


    // $ANTLR start "rule__LibraryType__Group__2__Impl"
    // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:418:1: rule__LibraryType__Group__2__Impl : ( '[' ) ;
    public final void rule__LibraryType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:422:1: ( ( '[' ) )
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:423:1: ( '[' )
            {
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:423:1: ( '[' )
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:424:1: '['
            {
             before(grammarAccess.getLibraryTypeAccess().getLeftSquareBracketKeyword_2()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__LibraryType__Group__2__Impl819); 
             after(grammarAccess.getLibraryTypeAccess().getLeftSquareBracketKeyword_2()); 

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
    // $ANTLR end "rule__LibraryType__Group__2__Impl"


    // $ANTLR start "rule__LibraryType__Group__3"
    // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:437:1: rule__LibraryType__Group__3 : rule__LibraryType__Group__3__Impl rule__LibraryType__Group__4 ;
    public final void rule__LibraryType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:441:1: ( rule__LibraryType__Group__3__Impl rule__LibraryType__Group__4 )
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:442:2: rule__LibraryType__Group__3__Impl rule__LibraryType__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__LibraryType__Group__3__Impl_in_rule__LibraryType__Group__3850);
            rule__LibraryType__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LibraryType__Group__4_in_rule__LibraryType__Group__3853);
            rule__LibraryType__Group__4();

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
    // $ANTLR end "rule__LibraryType__Group__3"


    // $ANTLR start "rule__LibraryType__Group__3__Impl"
    // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:449:1: rule__LibraryType__Group__3__Impl : ( ( rule__LibraryType__Group_3__0 )? ) ;
    public final void rule__LibraryType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:453:1: ( ( ( rule__LibraryType__Group_3__0 )? ) )
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:454:1: ( ( rule__LibraryType__Group_3__0 )? )
            {
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:454:1: ( ( rule__LibraryType__Group_3__0 )? )
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:455:1: ( rule__LibraryType__Group_3__0 )?
            {
             before(grammarAccess.getLibraryTypeAccess().getGroup_3()); 
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:456:1: ( rule__LibraryType__Group_3__0 )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==17) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:456:2: rule__LibraryType__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__LibraryType__Group_3__0_in_rule__LibraryType__Group__3__Impl880);
                    rule__LibraryType__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLibraryTypeAccess().getGroup_3()); 

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
    // $ANTLR end "rule__LibraryType__Group__3__Impl"


    // $ANTLR start "rule__LibraryType__Group__4"
    // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:466:1: rule__LibraryType__Group__4 : rule__LibraryType__Group__4__Impl ;
    public final void rule__LibraryType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:470:1: ( rule__LibraryType__Group__4__Impl )
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:471:2: rule__LibraryType__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__LibraryType__Group__4__Impl_in_rule__LibraryType__Group__4911);
            rule__LibraryType__Group__4__Impl();

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
    // $ANTLR end "rule__LibraryType__Group__4"


    // $ANTLR start "rule__LibraryType__Group__4__Impl"
    // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:477:1: rule__LibraryType__Group__4__Impl : ( ']' ) ;
    public final void rule__LibraryType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:481:1: ( ( ']' ) )
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:482:1: ( ']' )
            {
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:482:1: ( ']' )
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:483:1: ']'
            {
             before(grammarAccess.getLibraryTypeAccess().getRightSquareBracketKeyword_4()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__LibraryType__Group__4__Impl939); 
             after(grammarAccess.getLibraryTypeAccess().getRightSquareBracketKeyword_4()); 

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
    // $ANTLR end "rule__LibraryType__Group__4__Impl"


    // $ANTLR start "rule__LibraryType__Group_3__0"
    // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:506:1: rule__LibraryType__Group_3__0 : rule__LibraryType__Group_3__0__Impl rule__LibraryType__Group_3__1 ;
    public final void rule__LibraryType__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:510:1: ( rule__LibraryType__Group_3__0__Impl rule__LibraryType__Group_3__1 )
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:511:2: rule__LibraryType__Group_3__0__Impl rule__LibraryType__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__LibraryType__Group_3__0__Impl_in_rule__LibraryType__Group_3__0980);
            rule__LibraryType__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LibraryType__Group_3__1_in_rule__LibraryType__Group_3__0983);
            rule__LibraryType__Group_3__1();

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
    // $ANTLR end "rule__LibraryType__Group_3__0"


    // $ANTLR start "rule__LibraryType__Group_3__0__Impl"
    // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:518:1: rule__LibraryType__Group_3__0__Impl : ( 'customer' ) ;
    public final void rule__LibraryType__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:522:1: ( ( 'customer' ) )
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:523:1: ( 'customer' )
            {
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:523:1: ( 'customer' )
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:524:1: 'customer'
            {
             before(grammarAccess.getLibraryTypeAccess().getCustomerKeyword_3_0()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__LibraryType__Group_3__0__Impl1011); 
             after(grammarAccess.getLibraryTypeAccess().getCustomerKeyword_3_0()); 

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
    // $ANTLR end "rule__LibraryType__Group_3__0__Impl"


    // $ANTLR start "rule__LibraryType__Group_3__1"
    // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:537:1: rule__LibraryType__Group_3__1 : rule__LibraryType__Group_3__1__Impl rule__LibraryType__Group_3__2 ;
    public final void rule__LibraryType__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:541:1: ( rule__LibraryType__Group_3__1__Impl rule__LibraryType__Group_3__2 )
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:542:2: rule__LibraryType__Group_3__1__Impl rule__LibraryType__Group_3__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__LibraryType__Group_3__1__Impl_in_rule__LibraryType__Group_3__11042);
            rule__LibraryType__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LibraryType__Group_3__2_in_rule__LibraryType__Group_3__11045);
            rule__LibraryType__Group_3__2();

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
    // $ANTLR end "rule__LibraryType__Group_3__1"


    // $ANTLR start "rule__LibraryType__Group_3__1__Impl"
    // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:549:1: rule__LibraryType__Group_3__1__Impl : ( '[' ) ;
    public final void rule__LibraryType__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:553:1: ( ( '[' ) )
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:554:1: ( '[' )
            {
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:554:1: ( '[' )
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:555:1: '['
            {
             before(grammarAccess.getLibraryTypeAccess().getLeftSquareBracketKeyword_3_1()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__LibraryType__Group_3__1__Impl1073); 
             after(grammarAccess.getLibraryTypeAccess().getLeftSquareBracketKeyword_3_1()); 

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
    // $ANTLR end "rule__LibraryType__Group_3__1__Impl"


    // $ANTLR start "rule__LibraryType__Group_3__2"
    // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:568:1: rule__LibraryType__Group_3__2 : rule__LibraryType__Group_3__2__Impl rule__LibraryType__Group_3__3 ;
    public final void rule__LibraryType__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:572:1: ( rule__LibraryType__Group_3__2__Impl rule__LibraryType__Group_3__3 )
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:573:2: rule__LibraryType__Group_3__2__Impl rule__LibraryType__Group_3__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__LibraryType__Group_3__2__Impl_in_rule__LibraryType__Group_3__21104);
            rule__LibraryType__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LibraryType__Group_3__3_in_rule__LibraryType__Group_3__21107);
            rule__LibraryType__Group_3__3();

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
    // $ANTLR end "rule__LibraryType__Group_3__2"


    // $ANTLR start "rule__LibraryType__Group_3__2__Impl"
    // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:580:1: rule__LibraryType__Group_3__2__Impl : ( ( rule__LibraryType__CustomerAssignment_3_2 ) ) ;
    public final void rule__LibraryType__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:584:1: ( ( ( rule__LibraryType__CustomerAssignment_3_2 ) ) )
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:585:1: ( ( rule__LibraryType__CustomerAssignment_3_2 ) )
            {
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:585:1: ( ( rule__LibraryType__CustomerAssignment_3_2 ) )
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:586:1: ( rule__LibraryType__CustomerAssignment_3_2 )
            {
             before(grammarAccess.getLibraryTypeAccess().getCustomerAssignment_3_2()); 
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:587:1: ( rule__LibraryType__CustomerAssignment_3_2 )
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:587:2: rule__LibraryType__CustomerAssignment_3_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__LibraryType__CustomerAssignment_3_2_in_rule__LibraryType__Group_3__2__Impl1134);
            rule__LibraryType__CustomerAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getLibraryTypeAccess().getCustomerAssignment_3_2()); 

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
    // $ANTLR end "rule__LibraryType__Group_3__2__Impl"


    // $ANTLR start "rule__LibraryType__Group_3__3"
    // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:597:1: rule__LibraryType__Group_3__3 : rule__LibraryType__Group_3__3__Impl rule__LibraryType__Group_3__4 ;
    public final void rule__LibraryType__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:601:1: ( rule__LibraryType__Group_3__3__Impl rule__LibraryType__Group_3__4 )
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:602:2: rule__LibraryType__Group_3__3__Impl rule__LibraryType__Group_3__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__LibraryType__Group_3__3__Impl_in_rule__LibraryType__Group_3__31164);
            rule__LibraryType__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LibraryType__Group_3__4_in_rule__LibraryType__Group_3__31167);
            rule__LibraryType__Group_3__4();

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
    // $ANTLR end "rule__LibraryType__Group_3__3"


    // $ANTLR start "rule__LibraryType__Group_3__3__Impl"
    // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:609:1: rule__LibraryType__Group_3__3__Impl : ( ( rule__LibraryType__Group_3_3__0 )* ) ;
    public final void rule__LibraryType__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:613:1: ( ( ( rule__LibraryType__Group_3_3__0 )* ) )
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:614:1: ( ( rule__LibraryType__Group_3_3__0 )* )
            {
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:614:1: ( ( rule__LibraryType__Group_3_3__0 )* )
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:615:1: ( rule__LibraryType__Group_3_3__0 )*
            {
             before(grammarAccess.getLibraryTypeAccess().getGroup_3_3()); 
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:616:1: ( rule__LibraryType__Group_3_3__0 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==18) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:616:2: rule__LibraryType__Group_3_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__LibraryType__Group_3_3__0_in_rule__LibraryType__Group_3__3__Impl1194);
            	    rule__LibraryType__Group_3_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getLibraryTypeAccess().getGroup_3_3()); 

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
    // $ANTLR end "rule__LibraryType__Group_3__3__Impl"


    // $ANTLR start "rule__LibraryType__Group_3__4"
    // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:626:1: rule__LibraryType__Group_3__4 : rule__LibraryType__Group_3__4__Impl ;
    public final void rule__LibraryType__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:630:1: ( rule__LibraryType__Group_3__4__Impl )
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:631:2: rule__LibraryType__Group_3__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__LibraryType__Group_3__4__Impl_in_rule__LibraryType__Group_3__41225);
            rule__LibraryType__Group_3__4__Impl();

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
    // $ANTLR end "rule__LibraryType__Group_3__4"


    // $ANTLR start "rule__LibraryType__Group_3__4__Impl"
    // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:637:1: rule__LibraryType__Group_3__4__Impl : ( ']' ) ;
    public final void rule__LibraryType__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:641:1: ( ( ']' ) )
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:642:1: ( ']' )
            {
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:642:1: ( ']' )
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:643:1: ']'
            {
             before(grammarAccess.getLibraryTypeAccess().getRightSquareBracketKeyword_3_4()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__LibraryType__Group_3__4__Impl1253); 
             after(grammarAccess.getLibraryTypeAccess().getRightSquareBracketKeyword_3_4()); 

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
    // $ANTLR end "rule__LibraryType__Group_3__4__Impl"


    // $ANTLR start "rule__LibraryType__Group_3_3__0"
    // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:666:1: rule__LibraryType__Group_3_3__0 : rule__LibraryType__Group_3_3__0__Impl rule__LibraryType__Group_3_3__1 ;
    public final void rule__LibraryType__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:670:1: ( rule__LibraryType__Group_3_3__0__Impl rule__LibraryType__Group_3_3__1 )
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:671:2: rule__LibraryType__Group_3_3__0__Impl rule__LibraryType__Group_3_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__LibraryType__Group_3_3__0__Impl_in_rule__LibraryType__Group_3_3__01294);
            rule__LibraryType__Group_3_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LibraryType__Group_3_3__1_in_rule__LibraryType__Group_3_3__01297);
            rule__LibraryType__Group_3_3__1();

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
    // $ANTLR end "rule__LibraryType__Group_3_3__0"


    // $ANTLR start "rule__LibraryType__Group_3_3__0__Impl"
    // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:678:1: rule__LibraryType__Group_3_3__0__Impl : ( ',' ) ;
    public final void rule__LibraryType__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:682:1: ( ( ',' ) )
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:683:1: ( ',' )
            {
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:683:1: ( ',' )
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:684:1: ','
            {
             before(grammarAccess.getLibraryTypeAccess().getCommaKeyword_3_3_0()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__LibraryType__Group_3_3__0__Impl1325); 
             after(grammarAccess.getLibraryTypeAccess().getCommaKeyword_3_3_0()); 

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
    // $ANTLR end "rule__LibraryType__Group_3_3__0__Impl"


    // $ANTLR start "rule__LibraryType__Group_3_3__1"
    // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:697:1: rule__LibraryType__Group_3_3__1 : rule__LibraryType__Group_3_3__1__Impl ;
    public final void rule__LibraryType__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:701:1: ( rule__LibraryType__Group_3_3__1__Impl )
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:702:2: rule__LibraryType__Group_3_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__LibraryType__Group_3_3__1__Impl_in_rule__LibraryType__Group_3_3__11356);
            rule__LibraryType__Group_3_3__1__Impl();

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
    // $ANTLR end "rule__LibraryType__Group_3_3__1"


    // $ANTLR start "rule__LibraryType__Group_3_3__1__Impl"
    // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:708:1: rule__LibraryType__Group_3_3__1__Impl : ( ( rule__LibraryType__CustomerAssignment_3_3_1 ) ) ;
    public final void rule__LibraryType__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:712:1: ( ( ( rule__LibraryType__CustomerAssignment_3_3_1 ) ) )
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:713:1: ( ( rule__LibraryType__CustomerAssignment_3_3_1 ) )
            {
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:713:1: ( ( rule__LibraryType__CustomerAssignment_3_3_1 ) )
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:714:1: ( rule__LibraryType__CustomerAssignment_3_3_1 )
            {
             before(grammarAccess.getLibraryTypeAccess().getCustomerAssignment_3_3_1()); 
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:715:1: ( rule__LibraryType__CustomerAssignment_3_3_1 )
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:715:2: rule__LibraryType__CustomerAssignment_3_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__LibraryType__CustomerAssignment_3_3_1_in_rule__LibraryType__Group_3_3__1__Impl1383);
            rule__LibraryType__CustomerAssignment_3_3_1();

            state._fsp--;


            }

             after(grammarAccess.getLibraryTypeAccess().getCustomerAssignment_3_3_1()); 

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
    // $ANTLR end "rule__LibraryType__Group_3_3__1__Impl"


    // $ANTLR start "rule__CustomerType__Group__0"
    // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:729:1: rule__CustomerType__Group__0 : rule__CustomerType__Group__0__Impl rule__CustomerType__Group__1 ;
    public final void rule__CustomerType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:733:1: ( rule__CustomerType__Group__0__Impl rule__CustomerType__Group__1 )
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:734:2: rule__CustomerType__Group__0__Impl rule__CustomerType__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__CustomerType__Group__0__Impl_in_rule__CustomerType__Group__01417);
            rule__CustomerType__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CustomerType__Group__1_in_rule__CustomerType__Group__01420);
            rule__CustomerType__Group__1();

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
    // $ANTLR end "rule__CustomerType__Group__0"


    // $ANTLR start "rule__CustomerType__Group__0__Impl"
    // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:741:1: rule__CustomerType__Group__0__Impl : ( 'CustomerType' ) ;
    public final void rule__CustomerType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:745:1: ( ( 'CustomerType' ) )
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:746:1: ( 'CustomerType' )
            {
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:746:1: ( 'CustomerType' )
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:747:1: 'CustomerType'
            {
             before(grammarAccess.getCustomerTypeAccess().getCustomerTypeKeyword_0()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__CustomerType__Group__0__Impl1448); 
             after(grammarAccess.getCustomerTypeAccess().getCustomerTypeKeyword_0()); 

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
    // $ANTLR end "rule__CustomerType__Group__0__Impl"


    // $ANTLR start "rule__CustomerType__Group__1"
    // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:760:1: rule__CustomerType__Group__1 : rule__CustomerType__Group__1__Impl rule__CustomerType__Group__2 ;
    public final void rule__CustomerType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:764:1: ( rule__CustomerType__Group__1__Impl rule__CustomerType__Group__2 )
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:765:2: rule__CustomerType__Group__1__Impl rule__CustomerType__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__CustomerType__Group__1__Impl_in_rule__CustomerType__Group__11479);
            rule__CustomerType__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CustomerType__Group__2_in_rule__CustomerType__Group__11482);
            rule__CustomerType__Group__2();

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
    // $ANTLR end "rule__CustomerType__Group__1"


    // $ANTLR start "rule__CustomerType__Group__1__Impl"
    // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:772:1: rule__CustomerType__Group__1__Impl : ( '[' ) ;
    public final void rule__CustomerType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:776:1: ( ( '[' ) )
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:777:1: ( '[' )
            {
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:777:1: ( '[' )
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:778:1: '['
            {
             before(grammarAccess.getCustomerTypeAccess().getLeftSquareBracketKeyword_1()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__CustomerType__Group__1__Impl1510); 
             after(grammarAccess.getCustomerTypeAccess().getLeftSquareBracketKeyword_1()); 

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
    // $ANTLR end "rule__CustomerType__Group__1__Impl"


    // $ANTLR start "rule__CustomerType__Group__2"
    // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:791:1: rule__CustomerType__Group__2 : rule__CustomerType__Group__2__Impl rule__CustomerType__Group__3 ;
    public final void rule__CustomerType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:795:1: ( rule__CustomerType__Group__2__Impl rule__CustomerType__Group__3 )
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:796:2: rule__CustomerType__Group__2__Impl rule__CustomerType__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__CustomerType__Group__2__Impl_in_rule__CustomerType__Group__21541);
            rule__CustomerType__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CustomerType__Group__3_in_rule__CustomerType__Group__21544);
            rule__CustomerType__Group__3();

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
    // $ANTLR end "rule__CustomerType__Group__2"


    // $ANTLR start "rule__CustomerType__Group__2__Impl"
    // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:803:1: rule__CustomerType__Group__2__Impl : ( 'firstName' ) ;
    public final void rule__CustomerType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:807:1: ( ( 'firstName' ) )
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:808:1: ( 'firstName' )
            {
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:808:1: ( 'firstName' )
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:809:1: 'firstName'
            {
             before(grammarAccess.getCustomerTypeAccess().getFirstNameKeyword_2()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__CustomerType__Group__2__Impl1572); 
             after(grammarAccess.getCustomerTypeAccess().getFirstNameKeyword_2()); 

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
    // $ANTLR end "rule__CustomerType__Group__2__Impl"


    // $ANTLR start "rule__CustomerType__Group__3"
    // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:822:1: rule__CustomerType__Group__3 : rule__CustomerType__Group__3__Impl rule__CustomerType__Group__4 ;
    public final void rule__CustomerType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:826:1: ( rule__CustomerType__Group__3__Impl rule__CustomerType__Group__4 )
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:827:2: rule__CustomerType__Group__3__Impl rule__CustomerType__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__CustomerType__Group__3__Impl_in_rule__CustomerType__Group__31603);
            rule__CustomerType__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CustomerType__Group__4_in_rule__CustomerType__Group__31606);
            rule__CustomerType__Group__4();

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
    // $ANTLR end "rule__CustomerType__Group__3"


    // $ANTLR start "rule__CustomerType__Group__3__Impl"
    // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:834:1: rule__CustomerType__Group__3__Impl : ( ( rule__CustomerType__FirstNameAssignment_3 ) ) ;
    public final void rule__CustomerType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:838:1: ( ( ( rule__CustomerType__FirstNameAssignment_3 ) ) )
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:839:1: ( ( rule__CustomerType__FirstNameAssignment_3 ) )
            {
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:839:1: ( ( rule__CustomerType__FirstNameAssignment_3 ) )
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:840:1: ( rule__CustomerType__FirstNameAssignment_3 )
            {
             before(grammarAccess.getCustomerTypeAccess().getFirstNameAssignment_3()); 
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:841:1: ( rule__CustomerType__FirstNameAssignment_3 )
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:841:2: rule__CustomerType__FirstNameAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__CustomerType__FirstNameAssignment_3_in_rule__CustomerType__Group__3__Impl1633);
            rule__CustomerType__FirstNameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getCustomerTypeAccess().getFirstNameAssignment_3()); 

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
    // $ANTLR end "rule__CustomerType__Group__3__Impl"


    // $ANTLR start "rule__CustomerType__Group__4"
    // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:851:1: rule__CustomerType__Group__4 : rule__CustomerType__Group__4__Impl rule__CustomerType__Group__5 ;
    public final void rule__CustomerType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:855:1: ( rule__CustomerType__Group__4__Impl rule__CustomerType__Group__5 )
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:856:2: rule__CustomerType__Group__4__Impl rule__CustomerType__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__CustomerType__Group__4__Impl_in_rule__CustomerType__Group__41663);
            rule__CustomerType__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CustomerType__Group__5_in_rule__CustomerType__Group__41666);
            rule__CustomerType__Group__5();

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
    // $ANTLR end "rule__CustomerType__Group__4"


    // $ANTLR start "rule__CustomerType__Group__4__Impl"
    // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:863:1: rule__CustomerType__Group__4__Impl : ( 'lastName' ) ;
    public final void rule__CustomerType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:867:1: ( ( 'lastName' ) )
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:868:1: ( 'lastName' )
            {
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:868:1: ( 'lastName' )
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:869:1: 'lastName'
            {
             before(grammarAccess.getCustomerTypeAccess().getLastNameKeyword_4()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__CustomerType__Group__4__Impl1694); 
             after(grammarAccess.getCustomerTypeAccess().getLastNameKeyword_4()); 

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
    // $ANTLR end "rule__CustomerType__Group__4__Impl"


    // $ANTLR start "rule__CustomerType__Group__5"
    // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:882:1: rule__CustomerType__Group__5 : rule__CustomerType__Group__5__Impl rule__CustomerType__Group__6 ;
    public final void rule__CustomerType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:886:1: ( rule__CustomerType__Group__5__Impl rule__CustomerType__Group__6 )
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:887:2: rule__CustomerType__Group__5__Impl rule__CustomerType__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__CustomerType__Group__5__Impl_in_rule__CustomerType__Group__51725);
            rule__CustomerType__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CustomerType__Group__6_in_rule__CustomerType__Group__51728);
            rule__CustomerType__Group__6();

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
    // $ANTLR end "rule__CustomerType__Group__5"


    // $ANTLR start "rule__CustomerType__Group__5__Impl"
    // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:894:1: rule__CustomerType__Group__5__Impl : ( ( rule__CustomerType__LastNameAssignment_5 ) ) ;
    public final void rule__CustomerType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:898:1: ( ( ( rule__CustomerType__LastNameAssignment_5 ) ) )
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:899:1: ( ( rule__CustomerType__LastNameAssignment_5 ) )
            {
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:899:1: ( ( rule__CustomerType__LastNameAssignment_5 ) )
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:900:1: ( rule__CustomerType__LastNameAssignment_5 )
            {
             before(grammarAccess.getCustomerTypeAccess().getLastNameAssignment_5()); 
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:901:1: ( rule__CustomerType__LastNameAssignment_5 )
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:901:2: rule__CustomerType__LastNameAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__CustomerType__LastNameAssignment_5_in_rule__CustomerType__Group__5__Impl1755);
            rule__CustomerType__LastNameAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getCustomerTypeAccess().getLastNameAssignment_5()); 

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
    // $ANTLR end "rule__CustomerType__Group__5__Impl"


    // $ANTLR start "rule__CustomerType__Group__6"
    // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:911:1: rule__CustomerType__Group__6 : rule__CustomerType__Group__6__Impl rule__CustomerType__Group__7 ;
    public final void rule__CustomerType__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:915:1: ( rule__CustomerType__Group__6__Impl rule__CustomerType__Group__7 )
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:916:2: rule__CustomerType__Group__6__Impl rule__CustomerType__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__CustomerType__Group__6__Impl_in_rule__CustomerType__Group__61785);
            rule__CustomerType__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CustomerType__Group__7_in_rule__CustomerType__Group__61788);
            rule__CustomerType__Group__7();

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
    // $ANTLR end "rule__CustomerType__Group__6"


    // $ANTLR start "rule__CustomerType__Group__6__Impl"
    // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:923:1: rule__CustomerType__Group__6__Impl : ( 'birthDate' ) ;
    public final void rule__CustomerType__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:927:1: ( ( 'birthDate' ) )
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:928:1: ( 'birthDate' )
            {
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:928:1: ( 'birthDate' )
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:929:1: 'birthDate'
            {
             before(grammarAccess.getCustomerTypeAccess().getBirthDateKeyword_6()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__CustomerType__Group__6__Impl1816); 
             after(grammarAccess.getCustomerTypeAccess().getBirthDateKeyword_6()); 

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
    // $ANTLR end "rule__CustomerType__Group__6__Impl"


    // $ANTLR start "rule__CustomerType__Group__7"
    // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:942:1: rule__CustomerType__Group__7 : rule__CustomerType__Group__7__Impl rule__CustomerType__Group__8 ;
    public final void rule__CustomerType__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:946:1: ( rule__CustomerType__Group__7__Impl rule__CustomerType__Group__8 )
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:947:2: rule__CustomerType__Group__7__Impl rule__CustomerType__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__CustomerType__Group__7__Impl_in_rule__CustomerType__Group__71847);
            rule__CustomerType__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CustomerType__Group__8_in_rule__CustomerType__Group__71850);
            rule__CustomerType__Group__8();

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
    // $ANTLR end "rule__CustomerType__Group__7"


    // $ANTLR start "rule__CustomerType__Group__7__Impl"
    // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:954:1: rule__CustomerType__Group__7__Impl : ( ( rule__CustomerType__BirthDateAssignment_7 ) ) ;
    public final void rule__CustomerType__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:958:1: ( ( ( rule__CustomerType__BirthDateAssignment_7 ) ) )
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:959:1: ( ( rule__CustomerType__BirthDateAssignment_7 ) )
            {
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:959:1: ( ( rule__CustomerType__BirthDateAssignment_7 ) )
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:960:1: ( rule__CustomerType__BirthDateAssignment_7 )
            {
             before(grammarAccess.getCustomerTypeAccess().getBirthDateAssignment_7()); 
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:961:1: ( rule__CustomerType__BirthDateAssignment_7 )
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:961:2: rule__CustomerType__BirthDateAssignment_7
            {
            pushFollow(FollowSets000.FOLLOW_rule__CustomerType__BirthDateAssignment_7_in_rule__CustomerType__Group__7__Impl1877);
            rule__CustomerType__BirthDateAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getCustomerTypeAccess().getBirthDateAssignment_7()); 

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
    // $ANTLR end "rule__CustomerType__Group__7__Impl"


    // $ANTLR start "rule__CustomerType__Group__8"
    // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:971:1: rule__CustomerType__Group__8 : rule__CustomerType__Group__8__Impl rule__CustomerType__Group__9 ;
    public final void rule__CustomerType__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:975:1: ( rule__CustomerType__Group__8__Impl rule__CustomerType__Group__9 )
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:976:2: rule__CustomerType__Group__8__Impl rule__CustomerType__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__CustomerType__Group__8__Impl_in_rule__CustomerType__Group__81907);
            rule__CustomerType__Group__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CustomerType__Group__9_in_rule__CustomerType__Group__81910);
            rule__CustomerType__Group__9();

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
    // $ANTLR end "rule__CustomerType__Group__8"


    // $ANTLR start "rule__CustomerType__Group__8__Impl"
    // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:983:1: rule__CustomerType__Group__8__Impl : ( 'birthTime' ) ;
    public final void rule__CustomerType__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:987:1: ( ( 'birthTime' ) )
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:988:1: ( 'birthTime' )
            {
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:988:1: ( 'birthTime' )
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:989:1: 'birthTime'
            {
             before(grammarAccess.getCustomerTypeAccess().getBirthTimeKeyword_8()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__CustomerType__Group__8__Impl1938); 
             after(grammarAccess.getCustomerTypeAccess().getBirthTimeKeyword_8()); 

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
    // $ANTLR end "rule__CustomerType__Group__8__Impl"


    // $ANTLR start "rule__CustomerType__Group__9"
    // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1002:1: rule__CustomerType__Group__9 : rule__CustomerType__Group__9__Impl rule__CustomerType__Group__10 ;
    public final void rule__CustomerType__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1006:1: ( rule__CustomerType__Group__9__Impl rule__CustomerType__Group__10 )
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1007:2: rule__CustomerType__Group__9__Impl rule__CustomerType__Group__10
            {
            pushFollow(FollowSets000.FOLLOW_rule__CustomerType__Group__9__Impl_in_rule__CustomerType__Group__91969);
            rule__CustomerType__Group__9__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CustomerType__Group__10_in_rule__CustomerType__Group__91972);
            rule__CustomerType__Group__10();

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
    // $ANTLR end "rule__CustomerType__Group__9"


    // $ANTLR start "rule__CustomerType__Group__9__Impl"
    // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1014:1: rule__CustomerType__Group__9__Impl : ( ( rule__CustomerType__BirthTimeAssignment_9 ) ) ;
    public final void rule__CustomerType__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1018:1: ( ( ( rule__CustomerType__BirthTimeAssignment_9 ) ) )
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1019:1: ( ( rule__CustomerType__BirthTimeAssignment_9 ) )
            {
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1019:1: ( ( rule__CustomerType__BirthTimeAssignment_9 ) )
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1020:1: ( rule__CustomerType__BirthTimeAssignment_9 )
            {
             before(grammarAccess.getCustomerTypeAccess().getBirthTimeAssignment_9()); 
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1021:1: ( rule__CustomerType__BirthTimeAssignment_9 )
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1021:2: rule__CustomerType__BirthTimeAssignment_9
            {
            pushFollow(FollowSets000.FOLLOW_rule__CustomerType__BirthTimeAssignment_9_in_rule__CustomerType__Group__9__Impl1999);
            rule__CustomerType__BirthTimeAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getCustomerTypeAccess().getBirthTimeAssignment_9()); 

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
    // $ANTLR end "rule__CustomerType__Group__9__Impl"


    // $ANTLR start "rule__CustomerType__Group__10"
    // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1031:1: rule__CustomerType__Group__10 : rule__CustomerType__Group__10__Impl rule__CustomerType__Group__11 ;
    public final void rule__CustomerType__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1035:1: ( rule__CustomerType__Group__10__Impl rule__CustomerType__Group__11 )
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1036:2: rule__CustomerType__Group__10__Impl rule__CustomerType__Group__11
            {
            pushFollow(FollowSets000.FOLLOW_rule__CustomerType__Group__10__Impl_in_rule__CustomerType__Group__102029);
            rule__CustomerType__Group__10__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CustomerType__Group__11_in_rule__CustomerType__Group__102032);
            rule__CustomerType__Group__11();

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
    // $ANTLR end "rule__CustomerType__Group__10"


    // $ANTLR start "rule__CustomerType__Group__10__Impl"
    // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1043:1: rule__CustomerType__Group__10__Impl : ( ( rule__CustomerType__Group_10__0 )? ) ;
    public final void rule__CustomerType__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1047:1: ( ( ( rule__CustomerType__Group_10__0 )? ) )
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1048:1: ( ( rule__CustomerType__Group_10__0 )? )
            {
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1048:1: ( ( rule__CustomerType__Group_10__0 )? )
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1049:1: ( rule__CustomerType__Group_10__0 )?
            {
             before(grammarAccess.getCustomerTypeAccess().getGroup_10()); 
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1050:1: ( rule__CustomerType__Group_10__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==27) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1050:2: rule__CustomerType__Group_10__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__CustomerType__Group_10__0_in_rule__CustomerType__Group__10__Impl2059);
                    rule__CustomerType__Group_10__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCustomerTypeAccess().getGroup_10()); 

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
    // $ANTLR end "rule__CustomerType__Group__10__Impl"


    // $ANTLR start "rule__CustomerType__Group__11"
    // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1060:1: rule__CustomerType__Group__11 : rule__CustomerType__Group__11__Impl rule__CustomerType__Group__12 ;
    public final void rule__CustomerType__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1064:1: ( rule__CustomerType__Group__11__Impl rule__CustomerType__Group__12 )
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1065:2: rule__CustomerType__Group__11__Impl rule__CustomerType__Group__12
            {
            pushFollow(FollowSets000.FOLLOW_rule__CustomerType__Group__11__Impl_in_rule__CustomerType__Group__112090);
            rule__CustomerType__Group__11__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CustomerType__Group__12_in_rule__CustomerType__Group__112093);
            rule__CustomerType__Group__12();

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
    // $ANTLR end "rule__CustomerType__Group__11"


    // $ANTLR start "rule__CustomerType__Group__11__Impl"
    // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1072:1: rule__CustomerType__Group__11__Impl : ( 'age' ) ;
    public final void rule__CustomerType__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1076:1: ( ( 'age' ) )
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1077:1: ( 'age' )
            {
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1077:1: ( 'age' )
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1078:1: 'age'
            {
             before(grammarAccess.getCustomerTypeAccess().getAgeKeyword_11()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__CustomerType__Group__11__Impl2121); 
             after(grammarAccess.getCustomerTypeAccess().getAgeKeyword_11()); 

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
    // $ANTLR end "rule__CustomerType__Group__11__Impl"


    // $ANTLR start "rule__CustomerType__Group__12"
    // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1091:1: rule__CustomerType__Group__12 : rule__CustomerType__Group__12__Impl rule__CustomerType__Group__13 ;
    public final void rule__CustomerType__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1095:1: ( rule__CustomerType__Group__12__Impl rule__CustomerType__Group__13 )
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1096:2: rule__CustomerType__Group__12__Impl rule__CustomerType__Group__13
            {
            pushFollow(FollowSets000.FOLLOW_rule__CustomerType__Group__12__Impl_in_rule__CustomerType__Group__122152);
            rule__CustomerType__Group__12__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CustomerType__Group__13_in_rule__CustomerType__Group__122155);
            rule__CustomerType__Group__13();

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
    // $ANTLR end "rule__CustomerType__Group__12"


    // $ANTLR start "rule__CustomerType__Group__12__Impl"
    // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1103:1: rule__CustomerType__Group__12__Impl : ( ( rule__CustomerType__AgeAssignment_12 ) ) ;
    public final void rule__CustomerType__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1107:1: ( ( ( rule__CustomerType__AgeAssignment_12 ) ) )
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1108:1: ( ( rule__CustomerType__AgeAssignment_12 ) )
            {
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1108:1: ( ( rule__CustomerType__AgeAssignment_12 ) )
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1109:1: ( rule__CustomerType__AgeAssignment_12 )
            {
             before(grammarAccess.getCustomerTypeAccess().getAgeAssignment_12()); 
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1110:1: ( rule__CustomerType__AgeAssignment_12 )
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1110:2: rule__CustomerType__AgeAssignment_12
            {
            pushFollow(FollowSets000.FOLLOW_rule__CustomerType__AgeAssignment_12_in_rule__CustomerType__Group__12__Impl2182);
            rule__CustomerType__AgeAssignment_12();

            state._fsp--;


            }

             after(grammarAccess.getCustomerTypeAccess().getAgeAssignment_12()); 

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
    // $ANTLR end "rule__CustomerType__Group__12__Impl"


    // $ANTLR start "rule__CustomerType__Group__13"
    // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1120:1: rule__CustomerType__Group__13 : rule__CustomerType__Group__13__Impl rule__CustomerType__Group__14 ;
    public final void rule__CustomerType__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1124:1: ( rule__CustomerType__Group__13__Impl rule__CustomerType__Group__14 )
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1125:2: rule__CustomerType__Group__13__Impl rule__CustomerType__Group__14
            {
            pushFollow(FollowSets000.FOLLOW_rule__CustomerType__Group__13__Impl_in_rule__CustomerType__Group__132212);
            rule__CustomerType__Group__13__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CustomerType__Group__14_in_rule__CustomerType__Group__132215);
            rule__CustomerType__Group__14();

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
    // $ANTLR end "rule__CustomerType__Group__13"


    // $ANTLR start "rule__CustomerType__Group__13__Impl"
    // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1132:1: rule__CustomerType__Group__13__Impl : ( 'prize' ) ;
    public final void rule__CustomerType__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1136:1: ( ( 'prize' ) )
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1137:1: ( 'prize' )
            {
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1137:1: ( 'prize' )
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1138:1: 'prize'
            {
             before(grammarAccess.getCustomerTypeAccess().getPrizeKeyword_13()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__CustomerType__Group__13__Impl2243); 
             after(grammarAccess.getCustomerTypeAccess().getPrizeKeyword_13()); 

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
    // $ANTLR end "rule__CustomerType__Group__13__Impl"


    // $ANTLR start "rule__CustomerType__Group__14"
    // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1151:1: rule__CustomerType__Group__14 : rule__CustomerType__Group__14__Impl rule__CustomerType__Group__15 ;
    public final void rule__CustomerType__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1155:1: ( rule__CustomerType__Group__14__Impl rule__CustomerType__Group__15 )
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1156:2: rule__CustomerType__Group__14__Impl rule__CustomerType__Group__15
            {
            pushFollow(FollowSets000.FOLLOW_rule__CustomerType__Group__14__Impl_in_rule__CustomerType__Group__142274);
            rule__CustomerType__Group__14__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CustomerType__Group__15_in_rule__CustomerType__Group__142277);
            rule__CustomerType__Group__15();

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
    // $ANTLR end "rule__CustomerType__Group__14"


    // $ANTLR start "rule__CustomerType__Group__14__Impl"
    // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1163:1: rule__CustomerType__Group__14__Impl : ( ( rule__CustomerType__PrizeAssignment_14 ) ) ;
    public final void rule__CustomerType__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1167:1: ( ( ( rule__CustomerType__PrizeAssignment_14 ) ) )
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1168:1: ( ( rule__CustomerType__PrizeAssignment_14 ) )
            {
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1168:1: ( ( rule__CustomerType__PrizeAssignment_14 ) )
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1169:1: ( rule__CustomerType__PrizeAssignment_14 )
            {
             before(grammarAccess.getCustomerTypeAccess().getPrizeAssignment_14()); 
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1170:1: ( rule__CustomerType__PrizeAssignment_14 )
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1170:2: rule__CustomerType__PrizeAssignment_14
            {
            pushFollow(FollowSets000.FOLLOW_rule__CustomerType__PrizeAssignment_14_in_rule__CustomerType__Group__14__Impl2304);
            rule__CustomerType__PrizeAssignment_14();

            state._fsp--;


            }

             after(grammarAccess.getCustomerTypeAccess().getPrizeAssignment_14()); 

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
    // $ANTLR end "rule__CustomerType__Group__14__Impl"


    // $ANTLR start "rule__CustomerType__Group__15"
    // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1180:1: rule__CustomerType__Group__15 : rule__CustomerType__Group__15__Impl rule__CustomerType__Group__16 ;
    public final void rule__CustomerType__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1184:1: ( rule__CustomerType__Group__15__Impl rule__CustomerType__Group__16 )
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1185:2: rule__CustomerType__Group__15__Impl rule__CustomerType__Group__16
            {
            pushFollow(FollowSets000.FOLLOW_rule__CustomerType__Group__15__Impl_in_rule__CustomerType__Group__152334);
            rule__CustomerType__Group__15__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CustomerType__Group__16_in_rule__CustomerType__Group__152337);
            rule__CustomerType__Group__16();

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
    // $ANTLR end "rule__CustomerType__Group__15"


    // $ANTLR start "rule__CustomerType__Group__15__Impl"
    // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1192:1: rule__CustomerType__Group__15__Impl : ( 'disabled' ) ;
    public final void rule__CustomerType__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1196:1: ( ( 'disabled' ) )
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1197:1: ( 'disabled' )
            {
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1197:1: ( 'disabled' )
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1198:1: 'disabled'
            {
             before(grammarAccess.getCustomerTypeAccess().getDisabledKeyword_15()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__CustomerType__Group__15__Impl2365); 
             after(grammarAccess.getCustomerTypeAccess().getDisabledKeyword_15()); 

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
    // $ANTLR end "rule__CustomerType__Group__15__Impl"


    // $ANTLR start "rule__CustomerType__Group__16"
    // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1211:1: rule__CustomerType__Group__16 : rule__CustomerType__Group__16__Impl rule__CustomerType__Group__17 ;
    public final void rule__CustomerType__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1215:1: ( rule__CustomerType__Group__16__Impl rule__CustomerType__Group__17 )
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1216:2: rule__CustomerType__Group__16__Impl rule__CustomerType__Group__17
            {
            pushFollow(FollowSets000.FOLLOW_rule__CustomerType__Group__16__Impl_in_rule__CustomerType__Group__162396);
            rule__CustomerType__Group__16__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CustomerType__Group__17_in_rule__CustomerType__Group__162399);
            rule__CustomerType__Group__17();

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
    // $ANTLR end "rule__CustomerType__Group__16"


    // $ANTLR start "rule__CustomerType__Group__16__Impl"
    // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1223:1: rule__CustomerType__Group__16__Impl : ( ( rule__CustomerType__DisabledAssignment_16 ) ) ;
    public final void rule__CustomerType__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1227:1: ( ( ( rule__CustomerType__DisabledAssignment_16 ) ) )
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1228:1: ( ( rule__CustomerType__DisabledAssignment_16 ) )
            {
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1228:1: ( ( rule__CustomerType__DisabledAssignment_16 ) )
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1229:1: ( rule__CustomerType__DisabledAssignment_16 )
            {
             before(grammarAccess.getCustomerTypeAccess().getDisabledAssignment_16()); 
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1230:1: ( rule__CustomerType__DisabledAssignment_16 )
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1230:2: rule__CustomerType__DisabledAssignment_16
            {
            pushFollow(FollowSets000.FOLLOW_rule__CustomerType__DisabledAssignment_16_in_rule__CustomerType__Group__16__Impl2426);
            rule__CustomerType__DisabledAssignment_16();

            state._fsp--;


            }

             after(grammarAccess.getCustomerTypeAccess().getDisabledAssignment_16()); 

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
    // $ANTLR end "rule__CustomerType__Group__16__Impl"


    // $ANTLR start "rule__CustomerType__Group__17"
    // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1240:1: rule__CustomerType__Group__17 : rule__CustomerType__Group__17__Impl ;
    public final void rule__CustomerType__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1244:1: ( rule__CustomerType__Group__17__Impl )
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1245:2: rule__CustomerType__Group__17__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__CustomerType__Group__17__Impl_in_rule__CustomerType__Group__172456);
            rule__CustomerType__Group__17__Impl();

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
    // $ANTLR end "rule__CustomerType__Group__17"


    // $ANTLR start "rule__CustomerType__Group__17__Impl"
    // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1251:1: rule__CustomerType__Group__17__Impl : ( ']' ) ;
    public final void rule__CustomerType__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1255:1: ( ( ']' ) )
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1256:1: ( ']' )
            {
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1256:1: ( ']' )
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1257:1: ']'
            {
             before(grammarAccess.getCustomerTypeAccess().getRightSquareBracketKeyword_17()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__CustomerType__Group__17__Impl2484); 
             after(grammarAccess.getCustomerTypeAccess().getRightSquareBracketKeyword_17()); 

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
    // $ANTLR end "rule__CustomerType__Group__17__Impl"


    // $ANTLR start "rule__CustomerType__Group_10__0"
    // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1306:1: rule__CustomerType__Group_10__0 : rule__CustomerType__Group_10__0__Impl rule__CustomerType__Group_10__1 ;
    public final void rule__CustomerType__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1310:1: ( rule__CustomerType__Group_10__0__Impl rule__CustomerType__Group_10__1 )
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1311:2: rule__CustomerType__Group_10__0__Impl rule__CustomerType__Group_10__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__CustomerType__Group_10__0__Impl_in_rule__CustomerType__Group_10__02551);
            rule__CustomerType__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CustomerType__Group_10__1_in_rule__CustomerType__Group_10__02554);
            rule__CustomerType__Group_10__1();

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
    // $ANTLR end "rule__CustomerType__Group_10__0"


    // $ANTLR start "rule__CustomerType__Group_10__0__Impl"
    // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1318:1: rule__CustomerType__Group_10__0__Impl : ( 'dateTime' ) ;
    public final void rule__CustomerType__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1322:1: ( ( 'dateTime' ) )
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1323:1: ( 'dateTime' )
            {
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1323:1: ( 'dateTime' )
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1324:1: 'dateTime'
            {
             before(grammarAccess.getCustomerTypeAccess().getDateTimeKeyword_10_0()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__CustomerType__Group_10__0__Impl2582); 
             after(grammarAccess.getCustomerTypeAccess().getDateTimeKeyword_10_0()); 

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
    // $ANTLR end "rule__CustomerType__Group_10__0__Impl"


    // $ANTLR start "rule__CustomerType__Group_10__1"
    // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1337:1: rule__CustomerType__Group_10__1 : rule__CustomerType__Group_10__1__Impl ;
    public final void rule__CustomerType__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1341:1: ( rule__CustomerType__Group_10__1__Impl )
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1342:2: rule__CustomerType__Group_10__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__CustomerType__Group_10__1__Impl_in_rule__CustomerType__Group_10__12613);
            rule__CustomerType__Group_10__1__Impl();

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
    // $ANTLR end "rule__CustomerType__Group_10__1"


    // $ANTLR start "rule__CustomerType__Group_10__1__Impl"
    // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1348:1: rule__CustomerType__Group_10__1__Impl : ( ( rule__CustomerType__DateTimeAssignment_10_1 ) ) ;
    public final void rule__CustomerType__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1352:1: ( ( ( rule__CustomerType__DateTimeAssignment_10_1 ) ) )
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1353:1: ( ( rule__CustomerType__DateTimeAssignment_10_1 ) )
            {
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1353:1: ( ( rule__CustomerType__DateTimeAssignment_10_1 ) )
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1354:1: ( rule__CustomerType__DateTimeAssignment_10_1 )
            {
             before(grammarAccess.getCustomerTypeAccess().getDateTimeAssignment_10_1()); 
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1355:1: ( rule__CustomerType__DateTimeAssignment_10_1 )
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1355:2: rule__CustomerType__DateTimeAssignment_10_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__CustomerType__DateTimeAssignment_10_1_in_rule__CustomerType__Group_10__1__Impl2640);
            rule__CustomerType__DateTimeAssignment_10_1();

            state._fsp--;


            }

             after(grammarAccess.getCustomerTypeAccess().getDateTimeAssignment_10_1()); 

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
    // $ANTLR end "rule__CustomerType__Group_10__1__Impl"


    // $ANTLR start "rule__Date__Group__0"
    // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1369:1: rule__Date__Group__0 : rule__Date__Group__0__Impl rule__Date__Group__1 ;
    public final void rule__Date__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1373:1: ( rule__Date__Group__0__Impl rule__Date__Group__1 )
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1374:2: rule__Date__Group__0__Impl rule__Date__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Date__Group__0__Impl_in_rule__Date__Group__02674);
            rule__Date__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Date__Group__1_in_rule__Date__Group__02677);
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
    // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1381:1: rule__Date__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__Date__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1385:1: ( ( RULE_INT ) )
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1386:1: ( RULE_INT )
            {
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1386:1: ( RULE_INT )
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1387:1: RULE_INT
            {
             before(grammarAccess.getDateAccess().getINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__Date__Group__0__Impl2704); 
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
    // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1398:1: rule__Date__Group__1 : rule__Date__Group__1__Impl rule__Date__Group__2 ;
    public final void rule__Date__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1402:1: ( rule__Date__Group__1__Impl rule__Date__Group__2 )
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1403:2: rule__Date__Group__1__Impl rule__Date__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Date__Group__1__Impl_in_rule__Date__Group__12733);
            rule__Date__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Date__Group__2_in_rule__Date__Group__12736);
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
    // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1410:1: rule__Date__Group__1__Impl : ( '-' ) ;
    public final void rule__Date__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1414:1: ( ( '-' ) )
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1415:1: ( '-' )
            {
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1415:1: ( '-' )
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1416:1: '-'
            {
             before(grammarAccess.getDateAccess().getHyphenMinusKeyword_1()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__Date__Group__1__Impl2764); 
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
    // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1429:1: rule__Date__Group__2 : rule__Date__Group__2__Impl rule__Date__Group__3 ;
    public final void rule__Date__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1433:1: ( rule__Date__Group__2__Impl rule__Date__Group__3 )
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1434:2: rule__Date__Group__2__Impl rule__Date__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Date__Group__2__Impl_in_rule__Date__Group__22795);
            rule__Date__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Date__Group__3_in_rule__Date__Group__22798);
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
    // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1441:1: rule__Date__Group__2__Impl : ( RULE_INT ) ;
    public final void rule__Date__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1445:1: ( ( RULE_INT ) )
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1446:1: ( RULE_INT )
            {
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1446:1: ( RULE_INT )
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1447:1: RULE_INT
            {
             before(grammarAccess.getDateAccess().getINTTerminalRuleCall_2()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__Date__Group__2__Impl2825); 
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
    // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1458:1: rule__Date__Group__3 : rule__Date__Group__3__Impl rule__Date__Group__4 ;
    public final void rule__Date__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1462:1: ( rule__Date__Group__3__Impl rule__Date__Group__4 )
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1463:2: rule__Date__Group__3__Impl rule__Date__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Date__Group__3__Impl_in_rule__Date__Group__32854);
            rule__Date__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Date__Group__4_in_rule__Date__Group__32857);
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
    // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1470:1: rule__Date__Group__3__Impl : ( '-' ) ;
    public final void rule__Date__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1474:1: ( ( '-' ) )
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1475:1: ( '-' )
            {
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1475:1: ( '-' )
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1476:1: '-'
            {
             before(grammarAccess.getDateAccess().getHyphenMinusKeyword_3()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__Date__Group__3__Impl2885); 
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
    // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1489:1: rule__Date__Group__4 : rule__Date__Group__4__Impl ;
    public final void rule__Date__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1493:1: ( rule__Date__Group__4__Impl )
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1494:2: rule__Date__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Date__Group__4__Impl_in_rule__Date__Group__42916);
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
    // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1500:1: rule__Date__Group__4__Impl : ( RULE_INT ) ;
    public final void rule__Date__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1504:1: ( ( RULE_INT ) )
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1505:1: ( RULE_INT )
            {
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1505:1: ( RULE_INT )
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1506:1: RULE_INT
            {
             before(grammarAccess.getDateAccess().getINTTerminalRuleCall_4()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__Date__Group__4__Impl2943); 
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


    // $ANTLR start "rule__Time__Group__0"
    // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1527:1: rule__Time__Group__0 : rule__Time__Group__0__Impl rule__Time__Group__1 ;
    public final void rule__Time__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1531:1: ( rule__Time__Group__0__Impl rule__Time__Group__1 )
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1532:2: rule__Time__Group__0__Impl rule__Time__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Time__Group__0__Impl_in_rule__Time__Group__02982);
            rule__Time__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Time__Group__1_in_rule__Time__Group__02985);
            rule__Time__Group__1();

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
    // $ANTLR end "rule__Time__Group__0"


    // $ANTLR start "rule__Time__Group__0__Impl"
    // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1539:1: rule__Time__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__Time__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1543:1: ( ( RULE_INT ) )
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1544:1: ( RULE_INT )
            {
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1544:1: ( RULE_INT )
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1545:1: RULE_INT
            {
             before(grammarAccess.getTimeAccess().getINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__Time__Group__0__Impl3012); 
             after(grammarAccess.getTimeAccess().getINTTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__Time__Group__0__Impl"


    // $ANTLR start "rule__Time__Group__1"
    // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1556:1: rule__Time__Group__1 : rule__Time__Group__1__Impl rule__Time__Group__2 ;
    public final void rule__Time__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1560:1: ( rule__Time__Group__1__Impl rule__Time__Group__2 )
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1561:2: rule__Time__Group__1__Impl rule__Time__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Time__Group__1__Impl_in_rule__Time__Group__13041);
            rule__Time__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Time__Group__2_in_rule__Time__Group__13044);
            rule__Time__Group__2();

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
    // $ANTLR end "rule__Time__Group__1"


    // $ANTLR start "rule__Time__Group__1__Impl"
    // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1568:1: rule__Time__Group__1__Impl : ( ':' ) ;
    public final void rule__Time__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1572:1: ( ( ':' ) )
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1573:1: ( ':' )
            {
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1573:1: ( ':' )
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1574:1: ':'
            {
             before(grammarAccess.getTimeAccess().getColonKeyword_1()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__Time__Group__1__Impl3072); 
             after(grammarAccess.getTimeAccess().getColonKeyword_1()); 

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
    // $ANTLR end "rule__Time__Group__1__Impl"


    // $ANTLR start "rule__Time__Group__2"
    // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1587:1: rule__Time__Group__2 : rule__Time__Group__2__Impl rule__Time__Group__3 ;
    public final void rule__Time__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1591:1: ( rule__Time__Group__2__Impl rule__Time__Group__3 )
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1592:2: rule__Time__Group__2__Impl rule__Time__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Time__Group__2__Impl_in_rule__Time__Group__23103);
            rule__Time__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Time__Group__3_in_rule__Time__Group__23106);
            rule__Time__Group__3();

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
    // $ANTLR end "rule__Time__Group__2"


    // $ANTLR start "rule__Time__Group__2__Impl"
    // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1599:1: rule__Time__Group__2__Impl : ( RULE_INT ) ;
    public final void rule__Time__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1603:1: ( ( RULE_INT ) )
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1604:1: ( RULE_INT )
            {
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1604:1: ( RULE_INT )
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1605:1: RULE_INT
            {
             before(grammarAccess.getTimeAccess().getINTTerminalRuleCall_2()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__Time__Group__2__Impl3133); 
             after(grammarAccess.getTimeAccess().getINTTerminalRuleCall_2()); 

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
    // $ANTLR end "rule__Time__Group__2__Impl"


    // $ANTLR start "rule__Time__Group__3"
    // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1616:1: rule__Time__Group__3 : rule__Time__Group__3__Impl rule__Time__Group__4 ;
    public final void rule__Time__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1620:1: ( rule__Time__Group__3__Impl rule__Time__Group__4 )
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1621:2: rule__Time__Group__3__Impl rule__Time__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Time__Group__3__Impl_in_rule__Time__Group__33162);
            rule__Time__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Time__Group__4_in_rule__Time__Group__33165);
            rule__Time__Group__4();

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
    // $ANTLR end "rule__Time__Group__3"


    // $ANTLR start "rule__Time__Group__3__Impl"
    // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1628:1: rule__Time__Group__3__Impl : ( ':' ) ;
    public final void rule__Time__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1632:1: ( ( ':' ) )
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1633:1: ( ':' )
            {
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1633:1: ( ':' )
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1634:1: ':'
            {
             before(grammarAccess.getTimeAccess().getColonKeyword_3()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__Time__Group__3__Impl3193); 
             after(grammarAccess.getTimeAccess().getColonKeyword_3()); 

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
    // $ANTLR end "rule__Time__Group__3__Impl"


    // $ANTLR start "rule__Time__Group__4"
    // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1647:1: rule__Time__Group__4 : rule__Time__Group__4__Impl ;
    public final void rule__Time__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1651:1: ( rule__Time__Group__4__Impl )
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1652:2: rule__Time__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Time__Group__4__Impl_in_rule__Time__Group__43224);
            rule__Time__Group__4__Impl();

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
    // $ANTLR end "rule__Time__Group__4"


    // $ANTLR start "rule__Time__Group__4__Impl"
    // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1658:1: rule__Time__Group__4__Impl : ( RULE_INT ) ;
    public final void rule__Time__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1662:1: ( ( RULE_INT ) )
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1663:1: ( RULE_INT )
            {
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1663:1: ( RULE_INT )
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1664:1: RULE_INT
            {
             before(grammarAccess.getTimeAccess().getINTTerminalRuleCall_4()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__Time__Group__4__Impl3251); 
             after(grammarAccess.getTimeAccess().getINTTerminalRuleCall_4()); 

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
    // $ANTLR end "rule__Time__Group__4__Impl"


    // $ANTLR start "rule__Decimal__Group__0"
    // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1685:1: rule__Decimal__Group__0 : rule__Decimal__Group__0__Impl rule__Decimal__Group__1 ;
    public final void rule__Decimal__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1689:1: ( rule__Decimal__Group__0__Impl rule__Decimal__Group__1 )
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1690:2: rule__Decimal__Group__0__Impl rule__Decimal__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Decimal__Group__0__Impl_in_rule__Decimal__Group__03290);
            rule__Decimal__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Decimal__Group__1_in_rule__Decimal__Group__03293);
            rule__Decimal__Group__1();

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
    // $ANTLR end "rule__Decimal__Group__0"


    // $ANTLR start "rule__Decimal__Group__0__Impl"
    // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1697:1: rule__Decimal__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__Decimal__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1701:1: ( ( RULE_INT ) )
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1702:1: ( RULE_INT )
            {
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1702:1: ( RULE_INT )
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1703:1: RULE_INT
            {
             before(grammarAccess.getDecimalAccess().getINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__Decimal__Group__0__Impl3320); 
             after(grammarAccess.getDecimalAccess().getINTTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__Decimal__Group__0__Impl"


    // $ANTLR start "rule__Decimal__Group__1"
    // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1714:1: rule__Decimal__Group__1 : rule__Decimal__Group__1__Impl rule__Decimal__Group__2 ;
    public final void rule__Decimal__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1718:1: ( rule__Decimal__Group__1__Impl rule__Decimal__Group__2 )
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1719:2: rule__Decimal__Group__1__Impl rule__Decimal__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Decimal__Group__1__Impl_in_rule__Decimal__Group__13349);
            rule__Decimal__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Decimal__Group__2_in_rule__Decimal__Group__13352);
            rule__Decimal__Group__2();

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
    // $ANTLR end "rule__Decimal__Group__1"


    // $ANTLR start "rule__Decimal__Group__1__Impl"
    // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1726:1: rule__Decimal__Group__1__Impl : ( '.' ) ;
    public final void rule__Decimal__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1730:1: ( ( '.' ) )
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1731:1: ( '.' )
            {
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1731:1: ( '.' )
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1732:1: '.'
            {
             before(grammarAccess.getDecimalAccess().getFullStopKeyword_1()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__Decimal__Group__1__Impl3380); 
             after(grammarAccess.getDecimalAccess().getFullStopKeyword_1()); 

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
    // $ANTLR end "rule__Decimal__Group__1__Impl"


    // $ANTLR start "rule__Decimal__Group__2"
    // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1745:1: rule__Decimal__Group__2 : rule__Decimal__Group__2__Impl ;
    public final void rule__Decimal__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1749:1: ( rule__Decimal__Group__2__Impl )
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1750:2: rule__Decimal__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Decimal__Group__2__Impl_in_rule__Decimal__Group__23411);
            rule__Decimal__Group__2__Impl();

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
    // $ANTLR end "rule__Decimal__Group__2"


    // $ANTLR start "rule__Decimal__Group__2__Impl"
    // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1756:1: rule__Decimal__Group__2__Impl : ( RULE_INT ) ;
    public final void rule__Decimal__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1760:1: ( ( RULE_INT ) )
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1761:1: ( RULE_INT )
            {
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1761:1: ( RULE_INT )
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1762:1: RULE_INT
            {
             before(grammarAccess.getDecimalAccess().getINTTerminalRuleCall_2()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__Decimal__Group__2__Impl3438); 
             after(grammarAccess.getDecimalAccess().getINTTerminalRuleCall_2()); 

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
    // $ANTLR end "rule__Decimal__Group__2__Impl"


    // $ANTLR start "rule__LibraryType__CustomerAssignment_3_2"
    // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1780:1: rule__LibraryType__CustomerAssignment_3_2 : ( ruleCustomerType ) ;
    public final void rule__LibraryType__CustomerAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1784:1: ( ( ruleCustomerType ) )
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1785:1: ( ruleCustomerType )
            {
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1785:1: ( ruleCustomerType )
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1786:1: ruleCustomerType
            {
             before(grammarAccess.getLibraryTypeAccess().getCustomerCustomerTypeParserRuleCall_3_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleCustomerType_in_rule__LibraryType__CustomerAssignment_3_23478);
            ruleCustomerType();

            state._fsp--;

             after(grammarAccess.getLibraryTypeAccess().getCustomerCustomerTypeParserRuleCall_3_2_0()); 

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
    // $ANTLR end "rule__LibraryType__CustomerAssignment_3_2"


    // $ANTLR start "rule__LibraryType__CustomerAssignment_3_3_1"
    // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1795:1: rule__LibraryType__CustomerAssignment_3_3_1 : ( ruleCustomerType ) ;
    public final void rule__LibraryType__CustomerAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1799:1: ( ( ruleCustomerType ) )
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1800:1: ( ruleCustomerType )
            {
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1800:1: ( ruleCustomerType )
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1801:1: ruleCustomerType
            {
             before(grammarAccess.getLibraryTypeAccess().getCustomerCustomerTypeParserRuleCall_3_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleCustomerType_in_rule__LibraryType__CustomerAssignment_3_3_13509);
            ruleCustomerType();

            state._fsp--;

             after(grammarAccess.getLibraryTypeAccess().getCustomerCustomerTypeParserRuleCall_3_3_1_0()); 

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
    // $ANTLR end "rule__LibraryType__CustomerAssignment_3_3_1"


    // $ANTLR start "rule__CustomerType__FirstNameAssignment_3"
    // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1810:1: rule__CustomerType__FirstNameAssignment_3 : ( ruleString0 ) ;
    public final void rule__CustomerType__FirstNameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1814:1: ( ( ruleString0 ) )
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1815:1: ( ruleString0 )
            {
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1815:1: ( ruleString0 )
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1816:1: ruleString0
            {
             before(grammarAccess.getCustomerTypeAccess().getFirstNameString0ParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleString0_in_rule__CustomerType__FirstNameAssignment_33540);
            ruleString0();

            state._fsp--;

             after(grammarAccess.getCustomerTypeAccess().getFirstNameString0ParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__CustomerType__FirstNameAssignment_3"


    // $ANTLR start "rule__CustomerType__LastNameAssignment_5"
    // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1825:1: rule__CustomerType__LastNameAssignment_5 : ( ruleString0 ) ;
    public final void rule__CustomerType__LastNameAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1829:1: ( ( ruleString0 ) )
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1830:1: ( ruleString0 )
            {
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1830:1: ( ruleString0 )
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1831:1: ruleString0
            {
             before(grammarAccess.getCustomerTypeAccess().getLastNameString0ParserRuleCall_5_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleString0_in_rule__CustomerType__LastNameAssignment_53571);
            ruleString0();

            state._fsp--;

             after(grammarAccess.getCustomerTypeAccess().getLastNameString0ParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__CustomerType__LastNameAssignment_5"


    // $ANTLR start "rule__CustomerType__BirthDateAssignment_7"
    // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1840:1: rule__CustomerType__BirthDateAssignment_7 : ( ruleDate ) ;
    public final void rule__CustomerType__BirthDateAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1844:1: ( ( ruleDate ) )
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1845:1: ( ruleDate )
            {
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1845:1: ( ruleDate )
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1846:1: ruleDate
            {
             before(grammarAccess.getCustomerTypeAccess().getBirthDateDateParserRuleCall_7_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleDate_in_rule__CustomerType__BirthDateAssignment_73602);
            ruleDate();

            state._fsp--;

             after(grammarAccess.getCustomerTypeAccess().getBirthDateDateParserRuleCall_7_0()); 

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
    // $ANTLR end "rule__CustomerType__BirthDateAssignment_7"


    // $ANTLR start "rule__CustomerType__BirthTimeAssignment_9"
    // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1855:1: rule__CustomerType__BirthTimeAssignment_9 : ( ruleTime ) ;
    public final void rule__CustomerType__BirthTimeAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1859:1: ( ( ruleTime ) )
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1860:1: ( ruleTime )
            {
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1860:1: ( ruleTime )
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1861:1: ruleTime
            {
             before(grammarAccess.getCustomerTypeAccess().getBirthTimeTimeParserRuleCall_9_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleTime_in_rule__CustomerType__BirthTimeAssignment_93633);
            ruleTime();

            state._fsp--;

             after(grammarAccess.getCustomerTypeAccess().getBirthTimeTimeParserRuleCall_9_0()); 

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
    // $ANTLR end "rule__CustomerType__BirthTimeAssignment_9"


    // $ANTLR start "rule__CustomerType__DateTimeAssignment_10_1"
    // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1870:1: rule__CustomerType__DateTimeAssignment_10_1 : ( ruleDateTime ) ;
    public final void rule__CustomerType__DateTimeAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1874:1: ( ( ruleDateTime ) )
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1875:1: ( ruleDateTime )
            {
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1875:1: ( ruleDateTime )
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1876:1: ruleDateTime
            {
             before(grammarAccess.getCustomerTypeAccess().getDateTimeDateTimeParserRuleCall_10_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleDateTime_in_rule__CustomerType__DateTimeAssignment_10_13664);
            ruleDateTime();

            state._fsp--;

             after(grammarAccess.getCustomerTypeAccess().getDateTimeDateTimeParserRuleCall_10_1_0()); 

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
    // $ANTLR end "rule__CustomerType__DateTimeAssignment_10_1"


    // $ANTLR start "rule__CustomerType__AgeAssignment_12"
    // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1885:1: rule__CustomerType__AgeAssignment_12 : ( ruleInteger ) ;
    public final void rule__CustomerType__AgeAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1889:1: ( ( ruleInteger ) )
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1890:1: ( ruleInteger )
            {
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1890:1: ( ruleInteger )
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1891:1: ruleInteger
            {
             before(grammarAccess.getCustomerTypeAccess().getAgeIntegerParserRuleCall_12_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleInteger_in_rule__CustomerType__AgeAssignment_123695);
            ruleInteger();

            state._fsp--;

             after(grammarAccess.getCustomerTypeAccess().getAgeIntegerParserRuleCall_12_0()); 

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
    // $ANTLR end "rule__CustomerType__AgeAssignment_12"


    // $ANTLR start "rule__CustomerType__PrizeAssignment_14"
    // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1900:1: rule__CustomerType__PrizeAssignment_14 : ( ruleDecimal ) ;
    public final void rule__CustomerType__PrizeAssignment_14() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1904:1: ( ( ruleDecimal ) )
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1905:1: ( ruleDecimal )
            {
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1905:1: ( ruleDecimal )
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1906:1: ruleDecimal
            {
             before(grammarAccess.getCustomerTypeAccess().getPrizeDecimalParserRuleCall_14_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleDecimal_in_rule__CustomerType__PrizeAssignment_143726);
            ruleDecimal();

            state._fsp--;

             after(grammarAccess.getCustomerTypeAccess().getPrizeDecimalParserRuleCall_14_0()); 

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
    // $ANTLR end "rule__CustomerType__PrizeAssignment_14"


    // $ANTLR start "rule__CustomerType__DisabledAssignment_16"
    // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1915:1: rule__CustomerType__DisabledAssignment_16 : ( ruleBoolean ) ;
    public final void rule__CustomerType__DisabledAssignment_16() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1919:1: ( ( ruleBoolean ) )
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1920:1: ( ruleBoolean )
            {
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1920:1: ( ruleBoolean )
            // ../org.xtext.example.datatype.ui/src-gen/at/ac/tuwien/big/xmltext/Datatype/ui/contentassist/antlr/internal/InternalDatatype.g:1921:1: ruleBoolean
            {
             before(grammarAccess.getCustomerTypeAccess().getDisabledBooleanParserRuleCall_16_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleBoolean_in_rule__CustomerType__DisabledAssignment_163757);
            ruleBoolean();

            state._fsp--;

             after(grammarAccess.getCustomerTypeAccess().getDisabledBooleanParserRuleCall_16_0()); 

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
    // $ANTLR end "rule__CustomerType__DisabledAssignment_16"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleLibraryType_in_entryRuleLibraryType61 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLibraryType68 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LibraryType__Group__0_in_ruleLibraryType94 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCustomerType_in_entryRuleCustomerType121 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCustomerType128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CustomerType__Group__0_in_ruleCustomerType154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleString0_in_entryRuleString0181 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleString0188 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleString0214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDate_in_entryRuleDate240 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDate247 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Date__Group__0_in_ruleDate273 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTime_in_entryRuleTime300 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTime307 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Time__Group__0_in_ruleTime333 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDateTime_in_entryRuleDateTime360 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDateTime367 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleDateTime394 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInteger_in_entryRuleInteger422 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInteger429 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleInteger455 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDecimal_in_entryRuleDecimal481 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDecimal488 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Decimal__Group__0_in_ruleDecimal514 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBoolean_in_entryRuleBoolean541 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBoolean548 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Boolean__Alternatives_in_ruleBoolean574 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__Boolean__Alternatives613 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Boolean__Alternatives633 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LibraryType__Group__0__Impl_in_rule__LibraryType__Group__0665 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__LibraryType__Group__1_in_rule__LibraryType__Group__0668 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LibraryType__Group__1__Impl_in_rule__LibraryType__Group__1726 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rule__LibraryType__Group__2_in_rule__LibraryType__Group__1729 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__LibraryType__Group__1__Impl757 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LibraryType__Group__2__Impl_in_rule__LibraryType__Group__2788 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_rule__LibraryType__Group__3_in_rule__LibraryType__Group__2791 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__LibraryType__Group__2__Impl819 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LibraryType__Group__3__Impl_in_rule__LibraryType__Group__3850 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_rule__LibraryType__Group__4_in_rule__LibraryType__Group__3853 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LibraryType__Group_3__0_in_rule__LibraryType__Group__3__Impl880 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LibraryType__Group__4__Impl_in_rule__LibraryType__Group__4911 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__LibraryType__Group__4__Impl939 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LibraryType__Group_3__0__Impl_in_rule__LibraryType__Group_3__0980 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rule__LibraryType__Group_3__1_in_rule__LibraryType__Group_3__0983 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__LibraryType__Group_3__0__Impl1011 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LibraryType__Group_3__1__Impl_in_rule__LibraryType__Group_3__11042 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_rule__LibraryType__Group_3__2_in_rule__LibraryType__Group_3__11045 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__LibraryType__Group_3__1__Impl1073 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LibraryType__Group_3__2__Impl_in_rule__LibraryType__Group_3__21104 = new BitSet(new long[]{0x0000000000050000L});
        public static final BitSet FOLLOW_rule__LibraryType__Group_3__3_in_rule__LibraryType__Group_3__21107 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LibraryType__CustomerAssignment_3_2_in_rule__LibraryType__Group_3__2__Impl1134 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LibraryType__Group_3__3__Impl_in_rule__LibraryType__Group_3__31164 = new BitSet(new long[]{0x0000000000050000L});
        public static final BitSet FOLLOW_rule__LibraryType__Group_3__4_in_rule__LibraryType__Group_3__31167 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LibraryType__Group_3_3__0_in_rule__LibraryType__Group_3__3__Impl1194 = new BitSet(new long[]{0x0000000000040002L});
        public static final BitSet FOLLOW_rule__LibraryType__Group_3__4__Impl_in_rule__LibraryType__Group_3__41225 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__LibraryType__Group_3__4__Impl1253 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LibraryType__Group_3_3__0__Impl_in_rule__LibraryType__Group_3_3__01294 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_rule__LibraryType__Group_3_3__1_in_rule__LibraryType__Group_3_3__01297 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__LibraryType__Group_3_3__0__Impl1325 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LibraryType__Group_3_3__1__Impl_in_rule__LibraryType__Group_3_3__11356 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LibraryType__CustomerAssignment_3_3_1_in_rule__LibraryType__Group_3_3__1__Impl1383 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CustomerType__Group__0__Impl_in_rule__CustomerType__Group__01417 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rule__CustomerType__Group__1_in_rule__CustomerType__Group__01420 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__CustomerType__Group__0__Impl1448 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CustomerType__Group__1__Impl_in_rule__CustomerType__Group__11479 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_rule__CustomerType__Group__2_in_rule__CustomerType__Group__11482 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__CustomerType__Group__1__Impl1510 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CustomerType__Group__2__Impl_in_rule__CustomerType__Group__21541 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__CustomerType__Group__3_in_rule__CustomerType__Group__21544 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__CustomerType__Group__2__Impl1572 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CustomerType__Group__3__Impl_in_rule__CustomerType__Group__31603 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__CustomerType__Group__4_in_rule__CustomerType__Group__31606 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CustomerType__FirstNameAssignment_3_in_rule__CustomerType__Group__3__Impl1633 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CustomerType__Group__4__Impl_in_rule__CustomerType__Group__41663 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__CustomerType__Group__5_in_rule__CustomerType__Group__41666 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__CustomerType__Group__4__Impl1694 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CustomerType__Group__5__Impl_in_rule__CustomerType__Group__51725 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_rule__CustomerType__Group__6_in_rule__CustomerType__Group__51728 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CustomerType__LastNameAssignment_5_in_rule__CustomerType__Group__5__Impl1755 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CustomerType__Group__6__Impl_in_rule__CustomerType__Group__61785 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__CustomerType__Group__7_in_rule__CustomerType__Group__61788 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__CustomerType__Group__6__Impl1816 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CustomerType__Group__7__Impl_in_rule__CustomerType__Group__71847 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__CustomerType__Group__8_in_rule__CustomerType__Group__71850 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CustomerType__BirthDateAssignment_7_in_rule__CustomerType__Group__7__Impl1877 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CustomerType__Group__8__Impl_in_rule__CustomerType__Group__81907 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__CustomerType__Group__9_in_rule__CustomerType__Group__81910 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__CustomerType__Group__8__Impl1938 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CustomerType__Group__9__Impl_in_rule__CustomerType__Group__91969 = new BitSet(new long[]{0x0000000009000000L});
        public static final BitSet FOLLOW_rule__CustomerType__Group__10_in_rule__CustomerType__Group__91972 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CustomerType__BirthTimeAssignment_9_in_rule__CustomerType__Group__9__Impl1999 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CustomerType__Group__10__Impl_in_rule__CustomerType__Group__102029 = new BitSet(new long[]{0x0000000009000000L});
        public static final BitSet FOLLOW_rule__CustomerType__Group__11_in_rule__CustomerType__Group__102032 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CustomerType__Group_10__0_in_rule__CustomerType__Group__10__Impl2059 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CustomerType__Group__11__Impl_in_rule__CustomerType__Group__112090 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__CustomerType__Group__12_in_rule__CustomerType__Group__112093 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__CustomerType__Group__11__Impl2121 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CustomerType__Group__12__Impl_in_rule__CustomerType__Group__122152 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__CustomerType__Group__13_in_rule__CustomerType__Group__122155 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CustomerType__AgeAssignment_12_in_rule__CustomerType__Group__12__Impl2182 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CustomerType__Group__13__Impl_in_rule__CustomerType__Group__132212 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__CustomerType__Group__14_in_rule__CustomerType__Group__132215 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__CustomerType__Group__13__Impl2243 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CustomerType__Group__14__Impl_in_rule__CustomerType__Group__142274 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__CustomerType__Group__15_in_rule__CustomerType__Group__142277 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CustomerType__PrizeAssignment_14_in_rule__CustomerType__Group__14__Impl2304 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CustomerType__Group__15__Impl_in_rule__CustomerType__Group__152334 = new BitSet(new long[]{0x0000000000003000L});
        public static final BitSet FOLLOW_rule__CustomerType__Group__16_in_rule__CustomerType__Group__152337 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__CustomerType__Group__15__Impl2365 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CustomerType__Group__16__Impl_in_rule__CustomerType__Group__162396 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__CustomerType__Group__17_in_rule__CustomerType__Group__162399 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CustomerType__DisabledAssignment_16_in_rule__CustomerType__Group__16__Impl2426 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CustomerType__Group__17__Impl_in_rule__CustomerType__Group__172456 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__CustomerType__Group__17__Impl2484 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CustomerType__Group_10__0__Impl_in_rule__CustomerType__Group_10__02551 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_rule__CustomerType__Group_10__1_in_rule__CustomerType__Group_10__02554 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__CustomerType__Group_10__0__Impl2582 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CustomerType__Group_10__1__Impl_in_rule__CustomerType__Group_10__12613 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CustomerType__DateTimeAssignment_10_1_in_rule__CustomerType__Group_10__1__Impl2640 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Date__Group__0__Impl_in_rule__Date__Group__02674 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_rule__Date__Group__1_in_rule__Date__Group__02677 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__Date__Group__0__Impl2704 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Date__Group__1__Impl_in_rule__Date__Group__12733 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__Date__Group__2_in_rule__Date__Group__12736 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__Date__Group__1__Impl2764 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Date__Group__2__Impl_in_rule__Date__Group__22795 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_rule__Date__Group__3_in_rule__Date__Group__22798 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__Date__Group__2__Impl2825 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Date__Group__3__Impl_in_rule__Date__Group__32854 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__Date__Group__4_in_rule__Date__Group__32857 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__Date__Group__3__Impl2885 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Date__Group__4__Impl_in_rule__Date__Group__42916 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__Date__Group__4__Impl2943 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Time__Group__0__Impl_in_rule__Time__Group__02982 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_rule__Time__Group__1_in_rule__Time__Group__02985 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__Time__Group__0__Impl3012 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Time__Group__1__Impl_in_rule__Time__Group__13041 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__Time__Group__2_in_rule__Time__Group__13044 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__Time__Group__1__Impl3072 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Time__Group__2__Impl_in_rule__Time__Group__23103 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_rule__Time__Group__3_in_rule__Time__Group__23106 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__Time__Group__2__Impl3133 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Time__Group__3__Impl_in_rule__Time__Group__33162 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__Time__Group__4_in_rule__Time__Group__33165 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__Time__Group__3__Impl3193 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Time__Group__4__Impl_in_rule__Time__Group__43224 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__Time__Group__4__Impl3251 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Decimal__Group__0__Impl_in_rule__Decimal__Group__03290 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_rule__Decimal__Group__1_in_rule__Decimal__Group__03293 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__Decimal__Group__0__Impl3320 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Decimal__Group__1__Impl_in_rule__Decimal__Group__13349 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__Decimal__Group__2_in_rule__Decimal__Group__13352 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__Decimal__Group__1__Impl3380 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Decimal__Group__2__Impl_in_rule__Decimal__Group__23411 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__Decimal__Group__2__Impl3438 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCustomerType_in_rule__LibraryType__CustomerAssignment_3_23478 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCustomerType_in_rule__LibraryType__CustomerAssignment_3_3_13509 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleString0_in_rule__CustomerType__FirstNameAssignment_33540 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleString0_in_rule__CustomerType__LastNameAssignment_53571 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDate_in_rule__CustomerType__BirthDateAssignment_73602 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTime_in_rule__CustomerType__BirthTimeAssignment_93633 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDateTime_in_rule__CustomerType__DateTimeAssignment_10_13664 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInteger_in_rule__CustomerType__AgeAssignment_123695 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDecimal_in_rule__CustomerType__PrizeAssignment_143726 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBoolean_in_rule__CustomerType__DisabledAssignment_163757 = new BitSet(new long[]{0x0000000000000002L});
    }


}