package at.ac.tuwien.big.xmltext.idIdref.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import at.ac.tuwien.big.xmltext.idIdref.services.IdIdrefGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalIdIdrefParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'EmployeeListType'", "'['", "'boss'", "','", "']'", "'employee'", "'BossType'", "'lastName'", "'birthDate'", "'superBoss'", "'bossId'", "'EmployeeType'", "'employeeId'", "'-'"
    };
    public static final int RULE_STRING=5;
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
    public static final int RULE_ID=4;
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
    public String getGrammarFileName() { return "../org.xtext.example.demo/src-gen/at/ac/tuwien/big/xmltext/idIdref/parser/antlr/internal/InternalIdIdref.g"; }



     	private IdIdrefGrammarAccess grammarAccess;
     	
        public InternalIdIdrefParser(TokenStream input, IdIdrefGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "EmployeeListType";	
       	}
       	
       	@Override
       	protected IdIdrefGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleEmployeeListType"
    // ../org.xtext.example.demo/src-gen/at/ac/tuwien/big/xmltext/idIdref/parser/antlr/internal/InternalIdIdref.g:67:1: entryRuleEmployeeListType returns [EObject current=null] : iv_ruleEmployeeListType= ruleEmployeeListType EOF ;
    public final EObject entryRuleEmployeeListType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmployeeListType = null;


        try {
            // ../org.xtext.example.demo/src-gen/at/ac/tuwien/big/xmltext/idIdref/parser/antlr/internal/InternalIdIdref.g:68:2: (iv_ruleEmployeeListType= ruleEmployeeListType EOF )
            // ../org.xtext.example.demo/src-gen/at/ac/tuwien/big/xmltext/idIdref/parser/antlr/internal/InternalIdIdref.g:69:2: iv_ruleEmployeeListType= ruleEmployeeListType EOF
            {
             newCompositeNode(grammarAccess.getEmployeeListTypeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEmployeeListType_in_entryRuleEmployeeListType75);
            iv_ruleEmployeeListType=ruleEmployeeListType();

            state._fsp--;

             current =iv_ruleEmployeeListType; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEmployeeListType85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEmployeeListType"


    // $ANTLR start "ruleEmployeeListType"
    // ../org.xtext.example.demo/src-gen/at/ac/tuwien/big/xmltext/idIdref/parser/antlr/internal/InternalIdIdref.g:76:1: ruleEmployeeListType returns [EObject current=null] : ( () otherlv_1= 'EmployeeListType' otherlv_2= '[' (otherlv_3= 'boss' otherlv_4= '[' ( (lv_boss_5_0= ruleBossType ) ) (otherlv_6= ',' ( (lv_boss_7_0= ruleBossType ) ) )* otherlv_8= ']' )? (otherlv_9= 'employee' otherlv_10= '[' ( (lv_employee_11_0= ruleEmployeeType ) ) (otherlv_12= ',' ( (lv_employee_13_0= ruleEmployeeType ) ) )* otherlv_14= ']' )? otherlv_15= ']' ) ;
    public final EObject ruleEmployeeListType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        EObject lv_boss_5_0 = null;

        EObject lv_boss_7_0 = null;

        EObject lv_employee_11_0 = null;

        EObject lv_employee_13_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.demo/src-gen/at/ac/tuwien/big/xmltext/idIdref/parser/antlr/internal/InternalIdIdref.g:79:28: ( ( () otherlv_1= 'EmployeeListType' otherlv_2= '[' (otherlv_3= 'boss' otherlv_4= '[' ( (lv_boss_5_0= ruleBossType ) ) (otherlv_6= ',' ( (lv_boss_7_0= ruleBossType ) ) )* otherlv_8= ']' )? (otherlv_9= 'employee' otherlv_10= '[' ( (lv_employee_11_0= ruleEmployeeType ) ) (otherlv_12= ',' ( (lv_employee_13_0= ruleEmployeeType ) ) )* otherlv_14= ']' )? otherlv_15= ']' ) )
            // ../org.xtext.example.demo/src-gen/at/ac/tuwien/big/xmltext/idIdref/parser/antlr/internal/InternalIdIdref.g:80:1: ( () otherlv_1= 'EmployeeListType' otherlv_2= '[' (otherlv_3= 'boss' otherlv_4= '[' ( (lv_boss_5_0= ruleBossType ) ) (otherlv_6= ',' ( (lv_boss_7_0= ruleBossType ) ) )* otherlv_8= ']' )? (otherlv_9= 'employee' otherlv_10= '[' ( (lv_employee_11_0= ruleEmployeeType ) ) (otherlv_12= ',' ( (lv_employee_13_0= ruleEmployeeType ) ) )* otherlv_14= ']' )? otherlv_15= ']' )
            {
            // ../org.xtext.example.demo/src-gen/at/ac/tuwien/big/xmltext/idIdref/parser/antlr/internal/InternalIdIdref.g:80:1: ( () otherlv_1= 'EmployeeListType' otherlv_2= '[' (otherlv_3= 'boss' otherlv_4= '[' ( (lv_boss_5_0= ruleBossType ) ) (otherlv_6= ',' ( (lv_boss_7_0= ruleBossType ) ) )* otherlv_8= ']' )? (otherlv_9= 'employee' otherlv_10= '[' ( (lv_employee_11_0= ruleEmployeeType ) ) (otherlv_12= ',' ( (lv_employee_13_0= ruleEmployeeType ) ) )* otherlv_14= ']' )? otherlv_15= ']' )
            // ../org.xtext.example.demo/src-gen/at/ac/tuwien/big/xmltext/idIdref/parser/antlr/internal/InternalIdIdref.g:80:2: () otherlv_1= 'EmployeeListType' otherlv_2= '[' (otherlv_3= 'boss' otherlv_4= '[' ( (lv_boss_5_0= ruleBossType ) ) (otherlv_6= ',' ( (lv_boss_7_0= ruleBossType ) ) )* otherlv_8= ']' )? (otherlv_9= 'employee' otherlv_10= '[' ( (lv_employee_11_0= ruleEmployeeType ) ) (otherlv_12= ',' ( (lv_employee_13_0= ruleEmployeeType ) ) )* otherlv_14= ']' )? otherlv_15= ']'
            {
            // ../org.xtext.example.demo/src-gen/at/ac/tuwien/big/xmltext/idIdref/parser/antlr/internal/InternalIdIdref.g:80:2: ()
            // ../org.xtext.example.demo/src-gen/at/ac/tuwien/big/xmltext/idIdref/parser/antlr/internal/InternalIdIdref.g:81:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getEmployeeListTypeAccess().getEmployeeListTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleEmployeeListType131); 

                	newLeafNode(otherlv_1, grammarAccess.getEmployeeListTypeAccess().getEmployeeListTypeKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleEmployeeListType143); 

                	newLeafNode(otherlv_2, grammarAccess.getEmployeeListTypeAccess().getLeftSquareBracketKeyword_2());
                
            // ../org.xtext.example.demo/src-gen/at/ac/tuwien/big/xmltext/idIdref/parser/antlr/internal/InternalIdIdref.g:94:1: (otherlv_3= 'boss' otherlv_4= '[' ( (lv_boss_5_0= ruleBossType ) ) (otherlv_6= ',' ( (lv_boss_7_0= ruleBossType ) ) )* otherlv_8= ']' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.xtext.example.demo/src-gen/at/ac/tuwien/big/xmltext/idIdref/parser/antlr/internal/InternalIdIdref.g:94:3: otherlv_3= 'boss' otherlv_4= '[' ( (lv_boss_5_0= ruleBossType ) ) (otherlv_6= ',' ( (lv_boss_7_0= ruleBossType ) ) )* otherlv_8= ']'
                    {
                    otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleEmployeeListType156); 

                        	newLeafNode(otherlv_3, grammarAccess.getEmployeeListTypeAccess().getBossKeyword_3_0());
                        
                    otherlv_4=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleEmployeeListType168); 

                        	newLeafNode(otherlv_4, grammarAccess.getEmployeeListTypeAccess().getLeftSquareBracketKeyword_3_1());
                        
                    // ../org.xtext.example.demo/src-gen/at/ac/tuwien/big/xmltext/idIdref/parser/antlr/internal/InternalIdIdref.g:102:1: ( (lv_boss_5_0= ruleBossType ) )
                    // ../org.xtext.example.demo/src-gen/at/ac/tuwien/big/xmltext/idIdref/parser/antlr/internal/InternalIdIdref.g:103:1: (lv_boss_5_0= ruleBossType )
                    {
                    // ../org.xtext.example.demo/src-gen/at/ac/tuwien/big/xmltext/idIdref/parser/antlr/internal/InternalIdIdref.g:103:1: (lv_boss_5_0= ruleBossType )
                    // ../org.xtext.example.demo/src-gen/at/ac/tuwien/big/xmltext/idIdref/parser/antlr/internal/InternalIdIdref.g:104:3: lv_boss_5_0= ruleBossType
                    {
                     
                    	        newCompositeNode(grammarAccess.getEmployeeListTypeAccess().getBossBossTypeParserRuleCall_3_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleBossType_in_ruleEmployeeListType189);
                    lv_boss_5_0=ruleBossType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEmployeeListTypeRule());
                    	        }
                           		add(
                           			current, 
                           			"boss",
                            		lv_boss_5_0, 
                            		"BossType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.example.demo/src-gen/at/ac/tuwien/big/xmltext/idIdref/parser/antlr/internal/InternalIdIdref.g:120:2: (otherlv_6= ',' ( (lv_boss_7_0= ruleBossType ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==14) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // ../org.xtext.example.demo/src-gen/at/ac/tuwien/big/xmltext/idIdref/parser/antlr/internal/InternalIdIdref.g:120:4: otherlv_6= ',' ( (lv_boss_7_0= ruleBossType ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleEmployeeListType202); 

                    	        	newLeafNode(otherlv_6, grammarAccess.getEmployeeListTypeAccess().getCommaKeyword_3_3_0());
                    	        
                    	    // ../org.xtext.example.demo/src-gen/at/ac/tuwien/big/xmltext/idIdref/parser/antlr/internal/InternalIdIdref.g:124:1: ( (lv_boss_7_0= ruleBossType ) )
                    	    // ../org.xtext.example.demo/src-gen/at/ac/tuwien/big/xmltext/idIdref/parser/antlr/internal/InternalIdIdref.g:125:1: (lv_boss_7_0= ruleBossType )
                    	    {
                    	    // ../org.xtext.example.demo/src-gen/at/ac/tuwien/big/xmltext/idIdref/parser/antlr/internal/InternalIdIdref.g:125:1: (lv_boss_7_0= ruleBossType )
                    	    // ../org.xtext.example.demo/src-gen/at/ac/tuwien/big/xmltext/idIdref/parser/antlr/internal/InternalIdIdref.g:126:3: lv_boss_7_0= ruleBossType
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getEmployeeListTypeAccess().getBossBossTypeParserRuleCall_3_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleBossType_in_ruleEmployeeListType223);
                    	    lv_boss_7_0=ruleBossType();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getEmployeeListTypeRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"boss",
                    	            		lv_boss_7_0, 
                    	            		"BossType");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleEmployeeListType237); 

                        	newLeafNode(otherlv_8, grammarAccess.getEmployeeListTypeAccess().getRightSquareBracketKeyword_3_4());
                        

                    }
                    break;

            }

            // ../org.xtext.example.demo/src-gen/at/ac/tuwien/big/xmltext/idIdref/parser/antlr/internal/InternalIdIdref.g:146:3: (otherlv_9= 'employee' otherlv_10= '[' ( (lv_employee_11_0= ruleEmployeeType ) ) (otherlv_12= ',' ( (lv_employee_13_0= ruleEmployeeType ) ) )* otherlv_14= ']' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.xtext.example.demo/src-gen/at/ac/tuwien/big/xmltext/idIdref/parser/antlr/internal/InternalIdIdref.g:146:5: otherlv_9= 'employee' otherlv_10= '[' ( (lv_employee_11_0= ruleEmployeeType ) ) (otherlv_12= ',' ( (lv_employee_13_0= ruleEmployeeType ) ) )* otherlv_14= ']'
                    {
                    otherlv_9=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleEmployeeListType252); 

                        	newLeafNode(otherlv_9, grammarAccess.getEmployeeListTypeAccess().getEmployeeKeyword_4_0());
                        
                    otherlv_10=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleEmployeeListType264); 

                        	newLeafNode(otherlv_10, grammarAccess.getEmployeeListTypeAccess().getLeftSquareBracketKeyword_4_1());
                        
                    // ../org.xtext.example.demo/src-gen/at/ac/tuwien/big/xmltext/idIdref/parser/antlr/internal/InternalIdIdref.g:154:1: ( (lv_employee_11_0= ruleEmployeeType ) )
                    // ../org.xtext.example.demo/src-gen/at/ac/tuwien/big/xmltext/idIdref/parser/antlr/internal/InternalIdIdref.g:155:1: (lv_employee_11_0= ruleEmployeeType )
                    {
                    // ../org.xtext.example.demo/src-gen/at/ac/tuwien/big/xmltext/idIdref/parser/antlr/internal/InternalIdIdref.g:155:1: (lv_employee_11_0= ruleEmployeeType )
                    // ../org.xtext.example.demo/src-gen/at/ac/tuwien/big/xmltext/idIdref/parser/antlr/internal/InternalIdIdref.g:156:3: lv_employee_11_0= ruleEmployeeType
                    {
                     
                    	        newCompositeNode(grammarAccess.getEmployeeListTypeAccess().getEmployeeEmployeeTypeParserRuleCall_4_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEmployeeType_in_ruleEmployeeListType285);
                    lv_employee_11_0=ruleEmployeeType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEmployeeListTypeRule());
                    	        }
                           		add(
                           			current, 
                           			"employee",
                            		lv_employee_11_0, 
                            		"EmployeeType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.example.demo/src-gen/at/ac/tuwien/big/xmltext/idIdref/parser/antlr/internal/InternalIdIdref.g:172:2: (otherlv_12= ',' ( (lv_employee_13_0= ruleEmployeeType ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==14) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../org.xtext.example.demo/src-gen/at/ac/tuwien/big/xmltext/idIdref/parser/antlr/internal/InternalIdIdref.g:172:4: otherlv_12= ',' ( (lv_employee_13_0= ruleEmployeeType ) )
                    	    {
                    	    otherlv_12=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleEmployeeListType298); 

                    	        	newLeafNode(otherlv_12, grammarAccess.getEmployeeListTypeAccess().getCommaKeyword_4_3_0());
                    	        
                    	    // ../org.xtext.example.demo/src-gen/at/ac/tuwien/big/xmltext/idIdref/parser/antlr/internal/InternalIdIdref.g:176:1: ( (lv_employee_13_0= ruleEmployeeType ) )
                    	    // ../org.xtext.example.demo/src-gen/at/ac/tuwien/big/xmltext/idIdref/parser/antlr/internal/InternalIdIdref.g:177:1: (lv_employee_13_0= ruleEmployeeType )
                    	    {
                    	    // ../org.xtext.example.demo/src-gen/at/ac/tuwien/big/xmltext/idIdref/parser/antlr/internal/InternalIdIdref.g:177:1: (lv_employee_13_0= ruleEmployeeType )
                    	    // ../org.xtext.example.demo/src-gen/at/ac/tuwien/big/xmltext/idIdref/parser/antlr/internal/InternalIdIdref.g:178:3: lv_employee_13_0= ruleEmployeeType
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getEmployeeListTypeAccess().getEmployeeEmployeeTypeParserRuleCall_4_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEmployeeType_in_ruleEmployeeListType319);
                    	    lv_employee_13_0=ruleEmployeeType();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getEmployeeListTypeRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"employee",
                    	            		lv_employee_13_0, 
                    	            		"EmployeeType");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleEmployeeListType333); 

                        	newLeafNode(otherlv_14, grammarAccess.getEmployeeListTypeAccess().getRightSquareBracketKeyword_4_4());
                        

                    }
                    break;

            }

            otherlv_15=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleEmployeeListType347); 

                	newLeafNode(otherlv_15, grammarAccess.getEmployeeListTypeAccess().getRightSquareBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEmployeeListType"


    // $ANTLR start "entryRuleBossType"
    // ../org.xtext.example.demo/src-gen/at/ac/tuwien/big/xmltext/idIdref/parser/antlr/internal/InternalIdIdref.g:210:1: entryRuleBossType returns [EObject current=null] : iv_ruleBossType= ruleBossType EOF ;
    public final EObject entryRuleBossType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBossType = null;


        try {
            // ../org.xtext.example.demo/src-gen/at/ac/tuwien/big/xmltext/idIdref/parser/antlr/internal/InternalIdIdref.g:211:2: (iv_ruleBossType= ruleBossType EOF )
            // ../org.xtext.example.demo/src-gen/at/ac/tuwien/big/xmltext/idIdref/parser/antlr/internal/InternalIdIdref.g:212:2: iv_ruleBossType= ruleBossType EOF
            {
             newCompositeNode(grammarAccess.getBossTypeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBossType_in_entryRuleBossType383);
            iv_ruleBossType=ruleBossType();

            state._fsp--;

             current =iv_ruleBossType; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBossType393); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBossType"


    // $ANTLR start "ruleBossType"
    // ../org.xtext.example.demo/src-gen/at/ac/tuwien/big/xmltext/idIdref/parser/antlr/internal/InternalIdIdref.g:219:1: ruleBossType returns [EObject current=null] : (otherlv_0= 'BossType' otherlv_1= '[' otherlv_2= 'lastName' ( (lv_lastName_3_0= ruleString0 ) ) otherlv_4= 'birthDate' ( (lv_birthDate_5_0= ruleDate ) ) otherlv_6= 'superBoss' ( (otherlv_7= RULE_ID ) ) otherlv_8= 'bossId' ( (lv_bossId_9_0= ruleIdValues ) ) otherlv_10= ']' ) ;
    public final EObject ruleBossType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_lastName_3_0 = null;

        AntlrDatatypeRuleToken lv_birthDate_5_0 = null;

        EObject lv_bossId_9_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.demo/src-gen/at/ac/tuwien/big/xmltext/idIdref/parser/antlr/internal/InternalIdIdref.g:222:28: ( (otherlv_0= 'BossType' otherlv_1= '[' otherlv_2= 'lastName' ( (lv_lastName_3_0= ruleString0 ) ) otherlv_4= 'birthDate' ( (lv_birthDate_5_0= ruleDate ) ) otherlv_6= 'superBoss' ( (otherlv_7= RULE_ID ) ) otherlv_8= 'bossId' ( (lv_bossId_9_0= ruleIdValues ) ) otherlv_10= ']' ) )
            // ../org.xtext.example.demo/src-gen/at/ac/tuwien/big/xmltext/idIdref/parser/antlr/internal/InternalIdIdref.g:223:1: (otherlv_0= 'BossType' otherlv_1= '[' otherlv_2= 'lastName' ( (lv_lastName_3_0= ruleString0 ) ) otherlv_4= 'birthDate' ( (lv_birthDate_5_0= ruleDate ) ) otherlv_6= 'superBoss' ( (otherlv_7= RULE_ID ) ) otherlv_8= 'bossId' ( (lv_bossId_9_0= ruleIdValues ) ) otherlv_10= ']' )
            {
            // ../org.xtext.example.demo/src-gen/at/ac/tuwien/big/xmltext/idIdref/parser/antlr/internal/InternalIdIdref.g:223:1: (otherlv_0= 'BossType' otherlv_1= '[' otherlv_2= 'lastName' ( (lv_lastName_3_0= ruleString0 ) ) otherlv_4= 'birthDate' ( (lv_birthDate_5_0= ruleDate ) ) otherlv_6= 'superBoss' ( (otherlv_7= RULE_ID ) ) otherlv_8= 'bossId' ( (lv_bossId_9_0= ruleIdValues ) ) otherlv_10= ']' )
            // ../org.xtext.example.demo/src-gen/at/ac/tuwien/big/xmltext/idIdref/parser/antlr/internal/InternalIdIdref.g:223:3: otherlv_0= 'BossType' otherlv_1= '[' otherlv_2= 'lastName' ( (lv_lastName_3_0= ruleString0 ) ) otherlv_4= 'birthDate' ( (lv_birthDate_5_0= ruleDate ) ) otherlv_6= 'superBoss' ( (otherlv_7= RULE_ID ) ) otherlv_8= 'bossId' ( (lv_bossId_9_0= ruleIdValues ) ) otherlv_10= ']'
            {
            otherlv_0=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleBossType430); 

                	newLeafNode(otherlv_0, grammarAccess.getBossTypeAccess().getBossTypeKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleBossType442); 

                	newLeafNode(otherlv_1, grammarAccess.getBossTypeAccess().getLeftSquareBracketKeyword_1());
                
            otherlv_2=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleBossType454); 

                	newLeafNode(otherlv_2, grammarAccess.getBossTypeAccess().getLastNameKeyword_2());
                
            // ../org.xtext.example.demo/src-gen/at/ac/tuwien/big/xmltext/idIdref/parser/antlr/internal/InternalIdIdref.g:235:1: ( (lv_lastName_3_0= ruleString0 ) )
            // ../org.xtext.example.demo/src-gen/at/ac/tuwien/big/xmltext/idIdref/parser/antlr/internal/InternalIdIdref.g:236:1: (lv_lastName_3_0= ruleString0 )
            {
            // ../org.xtext.example.demo/src-gen/at/ac/tuwien/big/xmltext/idIdref/parser/antlr/internal/InternalIdIdref.g:236:1: (lv_lastName_3_0= ruleString0 )
            // ../org.xtext.example.demo/src-gen/at/ac/tuwien/big/xmltext/idIdref/parser/antlr/internal/InternalIdIdref.g:237:3: lv_lastName_3_0= ruleString0
            {
             
            	        newCompositeNode(grammarAccess.getBossTypeAccess().getLastNameString0ParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleString0_in_ruleBossType475);
            lv_lastName_3_0=ruleString0();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBossTypeRule());
            	        }
                   		set(
                   			current, 
                   			"lastName",
                    		lv_lastName_3_0, 
                    		"String0");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleBossType487); 

                	newLeafNode(otherlv_4, grammarAccess.getBossTypeAccess().getBirthDateKeyword_4());
                
            // ../org.xtext.example.demo/src-gen/at/ac/tuwien/big/xmltext/idIdref/parser/antlr/internal/InternalIdIdref.g:257:1: ( (lv_birthDate_5_0= ruleDate ) )
            // ../org.xtext.example.demo/src-gen/at/ac/tuwien/big/xmltext/idIdref/parser/antlr/internal/InternalIdIdref.g:258:1: (lv_birthDate_5_0= ruleDate )
            {
            // ../org.xtext.example.demo/src-gen/at/ac/tuwien/big/xmltext/idIdref/parser/antlr/internal/InternalIdIdref.g:258:1: (lv_birthDate_5_0= ruleDate )
            // ../org.xtext.example.demo/src-gen/at/ac/tuwien/big/xmltext/idIdref/parser/antlr/internal/InternalIdIdref.g:259:3: lv_birthDate_5_0= ruleDate
            {
             
            	        newCompositeNode(grammarAccess.getBossTypeAccess().getBirthDateDateParserRuleCall_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleDate_in_ruleBossType508);
            lv_birthDate_5_0=ruleDate();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBossTypeRule());
            	        }
                   		set(
                   			current, 
                   			"birthDate",
                    		lv_birthDate_5_0, 
                    		"Date");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleBossType520); 

                	newLeafNode(otherlv_6, grammarAccess.getBossTypeAccess().getSuperBossKeyword_6());
                
            // ../org.xtext.example.demo/src-gen/at/ac/tuwien/big/xmltext/idIdref/parser/antlr/internal/InternalIdIdref.g:279:1: ( (otherlv_7= RULE_ID ) )
            // ../org.xtext.example.demo/src-gen/at/ac/tuwien/big/xmltext/idIdref/parser/antlr/internal/InternalIdIdref.g:280:1: (otherlv_7= RULE_ID )
            {
            // ../org.xtext.example.demo/src-gen/at/ac/tuwien/big/xmltext/idIdref/parser/antlr/internal/InternalIdIdref.g:280:1: (otherlv_7= RULE_ID )
            // ../org.xtext.example.demo/src-gen/at/ac/tuwien/big/xmltext/idIdref/parser/antlr/internal/InternalIdIdref.g:281:3: otherlv_7= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getBossTypeRule());
            	        }
                    
            otherlv_7=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleBossType540); 

            		newLeafNode(otherlv_7, grammarAccess.getBossTypeAccess().getSuperBossIdValuesCrossReference_7_0()); 
            	

            }


            }

            otherlv_8=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleBossType552); 

                	newLeafNode(otherlv_8, grammarAccess.getBossTypeAccess().getBossIdKeyword_8());
                
            // ../org.xtext.example.demo/src-gen/at/ac/tuwien/big/xmltext/idIdref/parser/antlr/internal/InternalIdIdref.g:296:1: ( (lv_bossId_9_0= ruleIdValues ) )
            // ../org.xtext.example.demo/src-gen/at/ac/tuwien/big/xmltext/idIdref/parser/antlr/internal/InternalIdIdref.g:297:1: (lv_bossId_9_0= ruleIdValues )
            {
            // ../org.xtext.example.demo/src-gen/at/ac/tuwien/big/xmltext/idIdref/parser/antlr/internal/InternalIdIdref.g:297:1: (lv_bossId_9_0= ruleIdValues )
            // ../org.xtext.example.demo/src-gen/at/ac/tuwien/big/xmltext/idIdref/parser/antlr/internal/InternalIdIdref.g:298:3: lv_bossId_9_0= ruleIdValues
            {
             
            	        newCompositeNode(grammarAccess.getBossTypeAccess().getBossIdIdValuesParserRuleCall_9_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleIdValues_in_ruleBossType573);
            lv_bossId_9_0=ruleIdValues();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBossTypeRule());
            	        }
                   		set(
                   			current, 
                   			"bossId",
                    		lv_bossId_9_0, 
                    		"IdValues");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_10=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleBossType585); 

                	newLeafNode(otherlv_10, grammarAccess.getBossTypeAccess().getRightSquareBracketKeyword_10());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBossType"


    // $ANTLR start "entryRuleEmployeeType"
    // ../org.xtext.example.demo/src-gen/at/ac/tuwien/big/xmltext/idIdref/parser/antlr/internal/InternalIdIdref.g:326:1: entryRuleEmployeeType returns [EObject current=null] : iv_ruleEmployeeType= ruleEmployeeType EOF ;
    public final EObject entryRuleEmployeeType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmployeeType = null;


        try {
            // ../org.xtext.example.demo/src-gen/at/ac/tuwien/big/xmltext/idIdref/parser/antlr/internal/InternalIdIdref.g:327:2: (iv_ruleEmployeeType= ruleEmployeeType EOF )
            // ../org.xtext.example.demo/src-gen/at/ac/tuwien/big/xmltext/idIdref/parser/antlr/internal/InternalIdIdref.g:328:2: iv_ruleEmployeeType= ruleEmployeeType EOF
            {
             newCompositeNode(grammarAccess.getEmployeeTypeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEmployeeType_in_entryRuleEmployeeType621);
            iv_ruleEmployeeType=ruleEmployeeType();

            state._fsp--;

             current =iv_ruleEmployeeType; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEmployeeType631); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEmployeeType"


    // $ANTLR start "ruleEmployeeType"
    // ../org.xtext.example.demo/src-gen/at/ac/tuwien/big/xmltext/idIdref/parser/antlr/internal/InternalIdIdref.g:335:1: ruleEmployeeType returns [EObject current=null] : (otherlv_0= 'EmployeeType' otherlv_1= '[' otherlv_2= 'lastName' ( (lv_lastName_3_0= ruleString0 ) ) otherlv_4= 'birthDate' ( (lv_birthDate_5_0= ruleDate ) ) otherlv_6= 'boss' ( (otherlv_7= RULE_ID ) ) otherlv_8= 'employeeId' ( (lv_employeeId_9_0= ruleIdValues ) ) otherlv_10= ']' ) ;
    public final EObject ruleEmployeeType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_lastName_3_0 = null;

        AntlrDatatypeRuleToken lv_birthDate_5_0 = null;

        EObject lv_employeeId_9_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.demo/src-gen/at/ac/tuwien/big/xmltext/idIdref/parser/antlr/internal/InternalIdIdref.g:338:28: ( (otherlv_0= 'EmployeeType' otherlv_1= '[' otherlv_2= 'lastName' ( (lv_lastName_3_0= ruleString0 ) ) otherlv_4= 'birthDate' ( (lv_birthDate_5_0= ruleDate ) ) otherlv_6= 'boss' ( (otherlv_7= RULE_ID ) ) otherlv_8= 'employeeId' ( (lv_employeeId_9_0= ruleIdValues ) ) otherlv_10= ']' ) )
            // ../org.xtext.example.demo/src-gen/at/ac/tuwien/big/xmltext/idIdref/parser/antlr/internal/InternalIdIdref.g:339:1: (otherlv_0= 'EmployeeType' otherlv_1= '[' otherlv_2= 'lastName' ( (lv_lastName_3_0= ruleString0 ) ) otherlv_4= 'birthDate' ( (lv_birthDate_5_0= ruleDate ) ) otherlv_6= 'boss' ( (otherlv_7= RULE_ID ) ) otherlv_8= 'employeeId' ( (lv_employeeId_9_0= ruleIdValues ) ) otherlv_10= ']' )
            {
            // ../org.xtext.example.demo/src-gen/at/ac/tuwien/big/xmltext/idIdref/parser/antlr/internal/InternalIdIdref.g:339:1: (otherlv_0= 'EmployeeType' otherlv_1= '[' otherlv_2= 'lastName' ( (lv_lastName_3_0= ruleString0 ) ) otherlv_4= 'birthDate' ( (lv_birthDate_5_0= ruleDate ) ) otherlv_6= 'boss' ( (otherlv_7= RULE_ID ) ) otherlv_8= 'employeeId' ( (lv_employeeId_9_0= ruleIdValues ) ) otherlv_10= ']' )
            // ../org.xtext.example.demo/src-gen/at/ac/tuwien/big/xmltext/idIdref/parser/antlr/internal/InternalIdIdref.g:339:3: otherlv_0= 'EmployeeType' otherlv_1= '[' otherlv_2= 'lastName' ( (lv_lastName_3_0= ruleString0 ) ) otherlv_4= 'birthDate' ( (lv_birthDate_5_0= ruleDate ) ) otherlv_6= 'boss' ( (otherlv_7= RULE_ID ) ) otherlv_8= 'employeeId' ( (lv_employeeId_9_0= ruleIdValues ) ) otherlv_10= ']'
            {
            otherlv_0=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleEmployeeType668); 

                	newLeafNode(otherlv_0, grammarAccess.getEmployeeTypeAccess().getEmployeeTypeKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleEmployeeType680); 

                	newLeafNode(otherlv_1, grammarAccess.getEmployeeTypeAccess().getLeftSquareBracketKeyword_1());
                
            otherlv_2=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleEmployeeType692); 

                	newLeafNode(otherlv_2, grammarAccess.getEmployeeTypeAccess().getLastNameKeyword_2());
                
            // ../org.xtext.example.demo/src-gen/at/ac/tuwien/big/xmltext/idIdref/parser/antlr/internal/InternalIdIdref.g:351:1: ( (lv_lastName_3_0= ruleString0 ) )
            // ../org.xtext.example.demo/src-gen/at/ac/tuwien/big/xmltext/idIdref/parser/antlr/internal/InternalIdIdref.g:352:1: (lv_lastName_3_0= ruleString0 )
            {
            // ../org.xtext.example.demo/src-gen/at/ac/tuwien/big/xmltext/idIdref/parser/antlr/internal/InternalIdIdref.g:352:1: (lv_lastName_3_0= ruleString0 )
            // ../org.xtext.example.demo/src-gen/at/ac/tuwien/big/xmltext/idIdref/parser/antlr/internal/InternalIdIdref.g:353:3: lv_lastName_3_0= ruleString0
            {
             
            	        newCompositeNode(grammarAccess.getEmployeeTypeAccess().getLastNameString0ParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleString0_in_ruleEmployeeType713);
            lv_lastName_3_0=ruleString0();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEmployeeTypeRule());
            	        }
                   		set(
                   			current, 
                   			"lastName",
                    		lv_lastName_3_0, 
                    		"String0");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleEmployeeType725); 

                	newLeafNode(otherlv_4, grammarAccess.getEmployeeTypeAccess().getBirthDateKeyword_4());
                
            // ../org.xtext.example.demo/src-gen/at/ac/tuwien/big/xmltext/idIdref/parser/antlr/internal/InternalIdIdref.g:373:1: ( (lv_birthDate_5_0= ruleDate ) )
            // ../org.xtext.example.demo/src-gen/at/ac/tuwien/big/xmltext/idIdref/parser/antlr/internal/InternalIdIdref.g:374:1: (lv_birthDate_5_0= ruleDate )
            {
            // ../org.xtext.example.demo/src-gen/at/ac/tuwien/big/xmltext/idIdref/parser/antlr/internal/InternalIdIdref.g:374:1: (lv_birthDate_5_0= ruleDate )
            // ../org.xtext.example.demo/src-gen/at/ac/tuwien/big/xmltext/idIdref/parser/antlr/internal/InternalIdIdref.g:375:3: lv_birthDate_5_0= ruleDate
            {
             
            	        newCompositeNode(grammarAccess.getEmployeeTypeAccess().getBirthDateDateParserRuleCall_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleDate_in_ruleEmployeeType746);
            lv_birthDate_5_0=ruleDate();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEmployeeTypeRule());
            	        }
                   		set(
                   			current, 
                   			"birthDate",
                    		lv_birthDate_5_0, 
                    		"Date");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleEmployeeType758); 

                	newLeafNode(otherlv_6, grammarAccess.getEmployeeTypeAccess().getBossKeyword_6());
                
            // ../org.xtext.example.demo/src-gen/at/ac/tuwien/big/xmltext/idIdref/parser/antlr/internal/InternalIdIdref.g:395:1: ( (otherlv_7= RULE_ID ) )
            // ../org.xtext.example.demo/src-gen/at/ac/tuwien/big/xmltext/idIdref/parser/antlr/internal/InternalIdIdref.g:396:1: (otherlv_7= RULE_ID )
            {
            // ../org.xtext.example.demo/src-gen/at/ac/tuwien/big/xmltext/idIdref/parser/antlr/internal/InternalIdIdref.g:396:1: (otherlv_7= RULE_ID )
            // ../org.xtext.example.demo/src-gen/at/ac/tuwien/big/xmltext/idIdref/parser/antlr/internal/InternalIdIdref.g:397:3: otherlv_7= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getEmployeeTypeRule());
            	        }
                    
            otherlv_7=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEmployeeType778); 

            		newLeafNode(otherlv_7, grammarAccess.getEmployeeTypeAccess().getBossIdValuesCrossReference_7_0()); 
            	

            }


            }

            otherlv_8=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleEmployeeType790); 

                	newLeafNode(otherlv_8, grammarAccess.getEmployeeTypeAccess().getEmployeeIdKeyword_8());
                
            // ../org.xtext.example.demo/src-gen/at/ac/tuwien/big/xmltext/idIdref/parser/antlr/internal/InternalIdIdref.g:412:1: ( (lv_employeeId_9_0= ruleIdValues ) )
            // ../org.xtext.example.demo/src-gen/at/ac/tuwien/big/xmltext/idIdref/parser/antlr/internal/InternalIdIdref.g:413:1: (lv_employeeId_9_0= ruleIdValues )
            {
            // ../org.xtext.example.demo/src-gen/at/ac/tuwien/big/xmltext/idIdref/parser/antlr/internal/InternalIdIdref.g:413:1: (lv_employeeId_9_0= ruleIdValues )
            // ../org.xtext.example.demo/src-gen/at/ac/tuwien/big/xmltext/idIdref/parser/antlr/internal/InternalIdIdref.g:414:3: lv_employeeId_9_0= ruleIdValues
            {
             
            	        newCompositeNode(grammarAccess.getEmployeeTypeAccess().getEmployeeIdIdValuesParserRuleCall_9_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleIdValues_in_ruleEmployeeType811);
            lv_employeeId_9_0=ruleIdValues();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEmployeeTypeRule());
            	        }
                   		set(
                   			current, 
                   			"employeeId",
                    		lv_employeeId_9_0, 
                    		"IdValues");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_10=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleEmployeeType823); 

                	newLeafNode(otherlv_10, grammarAccess.getEmployeeTypeAccess().getRightSquareBracketKeyword_10());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEmployeeType"


    // $ANTLR start "entryRuleString0"
    // ../org.xtext.example.demo/src-gen/at/ac/tuwien/big/xmltext/idIdref/parser/antlr/internal/InternalIdIdref.g:442:1: entryRuleString0 returns [String current=null] : iv_ruleString0= ruleString0 EOF ;
    public final String entryRuleString0() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleString0 = null;


        try {
            // ../org.xtext.example.demo/src-gen/at/ac/tuwien/big/xmltext/idIdref/parser/antlr/internal/InternalIdIdref.g:443:2: (iv_ruleString0= ruleString0 EOF )
            // ../org.xtext.example.demo/src-gen/at/ac/tuwien/big/xmltext/idIdref/parser/antlr/internal/InternalIdIdref.g:444:2: iv_ruleString0= ruleString0 EOF
            {
             newCompositeNode(grammarAccess.getString0Rule()); 
            pushFollow(FollowSets000.FOLLOW_ruleString0_in_entryRuleString0860);
            iv_ruleString0=ruleString0();

            state._fsp--;

             current =iv_ruleString0.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleString0871); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleString0"


    // $ANTLR start "ruleString0"
    // ../org.xtext.example.demo/src-gen/at/ac/tuwien/big/xmltext/idIdref/parser/antlr/internal/InternalIdIdref.g:451:1: ruleString0 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleString0() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.demo/src-gen/at/ac/tuwien/big/xmltext/idIdref/parser/antlr/internal/InternalIdIdref.g:454:28: (this_STRING_0= RULE_STRING )
            // ../org.xtext.example.demo/src-gen/at/ac/tuwien/big/xmltext/idIdref/parser/antlr/internal/InternalIdIdref.g:455:5: this_STRING_0= RULE_STRING
            {
            this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleString0910); 

            		current.merge(this_STRING_0);
                
             
                newLeafNode(this_STRING_0, grammarAccess.getString0Access().getSTRINGTerminalRuleCall()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleString0"


    // $ANTLR start "entryRuleIdValues"
    // ../org.xtext.example.demo/src-gen/at/ac/tuwien/big/xmltext/idIdref/parser/antlr/internal/InternalIdIdref.g:470:1: entryRuleIdValues returns [EObject current=null] : iv_ruleIdValues= ruleIdValues EOF ;
    public final EObject entryRuleIdValues() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIdValues = null;


        try {
            // ../org.xtext.example.demo/src-gen/at/ac/tuwien/big/xmltext/idIdref/parser/antlr/internal/InternalIdIdref.g:471:2: (iv_ruleIdValues= ruleIdValues EOF )
            // ../org.xtext.example.demo/src-gen/at/ac/tuwien/big/xmltext/idIdref/parser/antlr/internal/InternalIdIdref.g:472:2: iv_ruleIdValues= ruleIdValues EOF
            {
             newCompositeNode(grammarAccess.getIdValuesRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleIdValues_in_entryRuleIdValues954);
            iv_ruleIdValues=ruleIdValues();

            state._fsp--;

             current =iv_ruleIdValues; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIdValues964); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIdValues"


    // $ANTLR start "ruleIdValues"
    // ../org.xtext.example.demo/src-gen/at/ac/tuwien/big/xmltext/idIdref/parser/antlr/internal/InternalIdIdref.g:479:1: ruleIdValues returns [EObject current=null] : ( () ( (lv_name_1_0= ruleID0 ) ) ) ;
    public final EObject ruleIdValues() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.demo/src-gen/at/ac/tuwien/big/xmltext/idIdref/parser/antlr/internal/InternalIdIdref.g:482:28: ( ( () ( (lv_name_1_0= ruleID0 ) ) ) )
            // ../org.xtext.example.demo/src-gen/at/ac/tuwien/big/xmltext/idIdref/parser/antlr/internal/InternalIdIdref.g:483:1: ( () ( (lv_name_1_0= ruleID0 ) ) )
            {
            // ../org.xtext.example.demo/src-gen/at/ac/tuwien/big/xmltext/idIdref/parser/antlr/internal/InternalIdIdref.g:483:1: ( () ( (lv_name_1_0= ruleID0 ) ) )
            // ../org.xtext.example.demo/src-gen/at/ac/tuwien/big/xmltext/idIdref/parser/antlr/internal/InternalIdIdref.g:483:2: () ( (lv_name_1_0= ruleID0 ) )
            {
            // ../org.xtext.example.demo/src-gen/at/ac/tuwien/big/xmltext/idIdref/parser/antlr/internal/InternalIdIdref.g:483:2: ()
            // ../org.xtext.example.demo/src-gen/at/ac/tuwien/big/xmltext/idIdref/parser/antlr/internal/InternalIdIdref.g:484:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getIdValuesAccess().getIdValuesAction_0(),
                        current);
                

            }

            // ../org.xtext.example.demo/src-gen/at/ac/tuwien/big/xmltext/idIdref/parser/antlr/internal/InternalIdIdref.g:489:2: ( (lv_name_1_0= ruleID0 ) )
            // ../org.xtext.example.demo/src-gen/at/ac/tuwien/big/xmltext/idIdref/parser/antlr/internal/InternalIdIdref.g:490:1: (lv_name_1_0= ruleID0 )
            {
            // ../org.xtext.example.demo/src-gen/at/ac/tuwien/big/xmltext/idIdref/parser/antlr/internal/InternalIdIdref.g:490:1: (lv_name_1_0= ruleID0 )
            // ../org.xtext.example.demo/src-gen/at/ac/tuwien/big/xmltext/idIdref/parser/antlr/internal/InternalIdIdref.g:491:3: lv_name_1_0= ruleID0
            {
             
            	        newCompositeNode(grammarAccess.getIdValuesAccess().getNameID0ParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleID0_in_ruleIdValues1019);
            lv_name_1_0=ruleID0();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getIdValuesRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID0");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIdValues"


    // $ANTLR start "entryRuleDate"
    // ../org.xtext.example.demo/src-gen/at/ac/tuwien/big/xmltext/idIdref/parser/antlr/internal/InternalIdIdref.g:515:1: entryRuleDate returns [String current=null] : iv_ruleDate= ruleDate EOF ;
    public final String entryRuleDate() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDate = null;


        try {
            // ../org.xtext.example.demo/src-gen/at/ac/tuwien/big/xmltext/idIdref/parser/antlr/internal/InternalIdIdref.g:516:2: (iv_ruleDate= ruleDate EOF )
            // ../org.xtext.example.demo/src-gen/at/ac/tuwien/big/xmltext/idIdref/parser/antlr/internal/InternalIdIdref.g:517:2: iv_ruleDate= ruleDate EOF
            {
             newCompositeNode(grammarAccess.getDateRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDate_in_entryRuleDate1056);
            iv_ruleDate=ruleDate();

            state._fsp--;

             current =iv_ruleDate.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDate1067); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDate"


    // $ANTLR start "ruleDate"
    // ../org.xtext.example.demo/src-gen/at/ac/tuwien/big/xmltext/idIdref/parser/antlr/internal/InternalIdIdref.g:524:1: ruleDate returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT kw= '-' this_INT_2= RULE_INT kw= '-' this_INT_4= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleDate() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;
        Token this_INT_4=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.demo/src-gen/at/ac/tuwien/big/xmltext/idIdref/parser/antlr/internal/InternalIdIdref.g:527:28: ( (this_INT_0= RULE_INT kw= '-' this_INT_2= RULE_INT kw= '-' this_INT_4= RULE_INT ) )
            // ../org.xtext.example.demo/src-gen/at/ac/tuwien/big/xmltext/idIdref/parser/antlr/internal/InternalIdIdref.g:528:1: (this_INT_0= RULE_INT kw= '-' this_INT_2= RULE_INT kw= '-' this_INT_4= RULE_INT )
            {
            // ../org.xtext.example.demo/src-gen/at/ac/tuwien/big/xmltext/idIdref/parser/antlr/internal/InternalIdIdref.g:528:1: (this_INT_0= RULE_INT kw= '-' this_INT_2= RULE_INT kw= '-' this_INT_4= RULE_INT )
            // ../org.xtext.example.demo/src-gen/at/ac/tuwien/big/xmltext/idIdref/parser/antlr/internal/InternalIdIdref.g:528:6: this_INT_0= RULE_INT kw= '-' this_INT_2= RULE_INT kw= '-' this_INT_4= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleDate1107); 

            		current.merge(this_INT_0);
                
             
                newLeafNode(this_INT_0, grammarAccess.getDateAccess().getINTTerminalRuleCall_0()); 
                
            kw=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleDate1125); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getDateAccess().getHyphenMinusKeyword_1()); 
                
            this_INT_2=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleDate1140); 

            		current.merge(this_INT_2);
                
             
                newLeafNode(this_INT_2, grammarAccess.getDateAccess().getINTTerminalRuleCall_2()); 
                
            kw=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleDate1158); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getDateAccess().getHyphenMinusKeyword_3()); 
                
            this_INT_4=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleDate1173); 

            		current.merge(this_INT_4);
                
             
                newLeafNode(this_INT_4, grammarAccess.getDateAccess().getINTTerminalRuleCall_4()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDate"


    // $ANTLR start "entryRuleID0"
    // ../org.xtext.example.demo/src-gen/at/ac/tuwien/big/xmltext/idIdref/parser/antlr/internal/InternalIdIdref.g:569:1: entryRuleID0 returns [String current=null] : iv_ruleID0= ruleID0 EOF ;
    public final String entryRuleID0() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleID0 = null;


        try {
            // ../org.xtext.example.demo/src-gen/at/ac/tuwien/big/xmltext/idIdref/parser/antlr/internal/InternalIdIdref.g:570:2: (iv_ruleID0= ruleID0 EOF )
            // ../org.xtext.example.demo/src-gen/at/ac/tuwien/big/xmltext/idIdref/parser/antlr/internal/InternalIdIdref.g:571:2: iv_ruleID0= ruleID0 EOF
            {
             newCompositeNode(grammarAccess.getID0Rule()); 
            pushFollow(FollowSets000.FOLLOW_ruleID0_in_entryRuleID01219);
            iv_ruleID0=ruleID0();

            state._fsp--;

             current =iv_ruleID0.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleID01230); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleID0"


    // $ANTLR start "ruleID0"
    // ../org.xtext.example.demo/src-gen/at/ac/tuwien/big/xmltext/idIdref/parser/antlr/internal/InternalIdIdref.g:578:1: ruleID0 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleID0() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.demo/src-gen/at/ac/tuwien/big/xmltext/idIdref/parser/antlr/internal/InternalIdIdref.g:581:28: (this_ID_0= RULE_ID )
            // ../org.xtext.example.demo/src-gen/at/ac/tuwien/big/xmltext/idIdref/parser/antlr/internal/InternalIdIdref.g:582:5: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleID01269); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getID0Access().getIDTerminalRuleCall()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleID0"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleEmployeeListType_in_entryRuleEmployeeListType75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEmployeeListType85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleEmployeeListType131 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleEmployeeListType143 = new BitSet(new long[]{0x000000000001A000L});
        public static final BitSet FOLLOW_13_in_ruleEmployeeListType156 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleEmployeeListType168 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_ruleBossType_in_ruleEmployeeListType189 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleEmployeeListType202 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_ruleBossType_in_ruleEmployeeListType223 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_ruleEmployeeListType237 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_16_in_ruleEmployeeListType252 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleEmployeeListType264 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_ruleEmployeeType_in_ruleEmployeeListType285 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleEmployeeListType298 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_ruleEmployeeType_in_ruleEmployeeListType319 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_ruleEmployeeListType333 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleEmployeeListType347 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBossType_in_entryRuleBossType383 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBossType393 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_ruleBossType430 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleBossType442 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleBossType454 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleString0_in_ruleBossType475 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleBossType487 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_ruleDate_in_ruleBossType508 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleBossType520 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleBossType540 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleBossType552 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleIdValues_in_ruleBossType573 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleBossType585 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEmployeeType_in_entryRuleEmployeeType621 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEmployeeType631 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_ruleEmployeeType668 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleEmployeeType680 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleEmployeeType692 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleString0_in_ruleEmployeeType713 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleEmployeeType725 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_ruleDate_in_ruleEmployeeType746 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleEmployeeType758 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEmployeeType778 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23_in_ruleEmployeeType790 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleIdValues_in_ruleEmployeeType811 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleEmployeeType823 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleString0_in_entryRuleString0860 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleString0871 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleString0910 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIdValues_in_entryRuleIdValues954 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIdValues964 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleID0_in_ruleIdValues1019 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDate_in_entryRuleDate1056 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDate1067 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleDate1107 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_ruleDate1125 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleDate1140 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_ruleDate1158 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleDate1173 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleID0_in_entryRuleID01219 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleID01230 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleID01269 = new BitSet(new long[]{0x0000000000000002L});
    }


}