package at.ac.tuwien.big.xmltext.Datatype.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import at.ac.tuwien.big.xmltext.Datatype.services.DatatypeGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDatatypeParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'LibraryType'", "'['", "'customer'", "','", "']'", "'CustomerType'", "'firstName'", "'lastName'", "'birthDate'", "'birthTime'", "'dateTime'", "'age'", "'prize'", "'disabled'", "'-'", "':'", "'DateTime'", "'.'", "'true'", "'false'"
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
    public String getGrammarFileName() { return "../org.xtext.example.datatype/src-gen/at/ac/tuwien/big/xmltext/Datatype/parser/antlr/internal/InternalDatatype.g"; }



     	private DatatypeGrammarAccess grammarAccess;
     	
        public InternalDatatypeParser(TokenStream input, DatatypeGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "LibraryType";	
       	}
       	
       	@Override
       	protected DatatypeGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleLibraryType"
    // ../org.xtext.example.datatype/src-gen/at/ac/tuwien/big/xmltext/Datatype/parser/antlr/internal/InternalDatatype.g:67:1: entryRuleLibraryType returns [EObject current=null] : iv_ruleLibraryType= ruleLibraryType EOF ;
    public final EObject entryRuleLibraryType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLibraryType = null;


        try {
            // ../org.xtext.example.datatype/src-gen/at/ac/tuwien/big/xmltext/Datatype/parser/antlr/internal/InternalDatatype.g:68:2: (iv_ruleLibraryType= ruleLibraryType EOF )
            // ../org.xtext.example.datatype/src-gen/at/ac/tuwien/big/xmltext/Datatype/parser/antlr/internal/InternalDatatype.g:69:2: iv_ruleLibraryType= ruleLibraryType EOF
            {
             newCompositeNode(grammarAccess.getLibraryTypeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLibraryType_in_entryRuleLibraryType75);
            iv_ruleLibraryType=ruleLibraryType();

            state._fsp--;

             current =iv_ruleLibraryType; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLibraryType85); 

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
    // $ANTLR end "entryRuleLibraryType"


    // $ANTLR start "ruleLibraryType"
    // ../org.xtext.example.datatype/src-gen/at/ac/tuwien/big/xmltext/Datatype/parser/antlr/internal/InternalDatatype.g:76:1: ruleLibraryType returns [EObject current=null] : ( () otherlv_1= 'LibraryType' otherlv_2= '[' (otherlv_3= 'customer' otherlv_4= '[' ( (lv_customer_5_0= ruleCustomerType ) ) (otherlv_6= ',' ( (lv_customer_7_0= ruleCustomerType ) ) )* otherlv_8= ']' )? otherlv_9= ']' ) ;
    public final EObject ruleLibraryType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_customer_5_0 = null;

        EObject lv_customer_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.datatype/src-gen/at/ac/tuwien/big/xmltext/Datatype/parser/antlr/internal/InternalDatatype.g:79:28: ( ( () otherlv_1= 'LibraryType' otherlv_2= '[' (otherlv_3= 'customer' otherlv_4= '[' ( (lv_customer_5_0= ruleCustomerType ) ) (otherlv_6= ',' ( (lv_customer_7_0= ruleCustomerType ) ) )* otherlv_8= ']' )? otherlv_9= ']' ) )
            // ../org.xtext.example.datatype/src-gen/at/ac/tuwien/big/xmltext/Datatype/parser/antlr/internal/InternalDatatype.g:80:1: ( () otherlv_1= 'LibraryType' otherlv_2= '[' (otherlv_3= 'customer' otherlv_4= '[' ( (lv_customer_5_0= ruleCustomerType ) ) (otherlv_6= ',' ( (lv_customer_7_0= ruleCustomerType ) ) )* otherlv_8= ']' )? otherlv_9= ']' )
            {
            // ../org.xtext.example.datatype/src-gen/at/ac/tuwien/big/xmltext/Datatype/parser/antlr/internal/InternalDatatype.g:80:1: ( () otherlv_1= 'LibraryType' otherlv_2= '[' (otherlv_3= 'customer' otherlv_4= '[' ( (lv_customer_5_0= ruleCustomerType ) ) (otherlv_6= ',' ( (lv_customer_7_0= ruleCustomerType ) ) )* otherlv_8= ']' )? otherlv_9= ']' )
            // ../org.xtext.example.datatype/src-gen/at/ac/tuwien/big/xmltext/Datatype/parser/antlr/internal/InternalDatatype.g:80:2: () otherlv_1= 'LibraryType' otherlv_2= '[' (otherlv_3= 'customer' otherlv_4= '[' ( (lv_customer_5_0= ruleCustomerType ) ) (otherlv_6= ',' ( (lv_customer_7_0= ruleCustomerType ) ) )* otherlv_8= ']' )? otherlv_9= ']'
            {
            // ../org.xtext.example.datatype/src-gen/at/ac/tuwien/big/xmltext/Datatype/parser/antlr/internal/InternalDatatype.g:80:2: ()
            // ../org.xtext.example.datatype/src-gen/at/ac/tuwien/big/xmltext/Datatype/parser/antlr/internal/InternalDatatype.g:81:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getLibraryTypeAccess().getLibraryTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleLibraryType131); 

                	newLeafNode(otherlv_1, grammarAccess.getLibraryTypeAccess().getLibraryTypeKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleLibraryType143); 

                	newLeafNode(otherlv_2, grammarAccess.getLibraryTypeAccess().getLeftSquareBracketKeyword_2());
                
            // ../org.xtext.example.datatype/src-gen/at/ac/tuwien/big/xmltext/Datatype/parser/antlr/internal/InternalDatatype.g:94:1: (otherlv_3= 'customer' otherlv_4= '[' ( (lv_customer_5_0= ruleCustomerType ) ) (otherlv_6= ',' ( (lv_customer_7_0= ruleCustomerType ) ) )* otherlv_8= ']' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.xtext.example.datatype/src-gen/at/ac/tuwien/big/xmltext/Datatype/parser/antlr/internal/InternalDatatype.g:94:3: otherlv_3= 'customer' otherlv_4= '[' ( (lv_customer_5_0= ruleCustomerType ) ) (otherlv_6= ',' ( (lv_customer_7_0= ruleCustomerType ) ) )* otherlv_8= ']'
                    {
                    otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleLibraryType156); 

                        	newLeafNode(otherlv_3, grammarAccess.getLibraryTypeAccess().getCustomerKeyword_3_0());
                        
                    otherlv_4=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleLibraryType168); 

                        	newLeafNode(otherlv_4, grammarAccess.getLibraryTypeAccess().getLeftSquareBracketKeyword_3_1());
                        
                    // ../org.xtext.example.datatype/src-gen/at/ac/tuwien/big/xmltext/Datatype/parser/antlr/internal/InternalDatatype.g:102:1: ( (lv_customer_5_0= ruleCustomerType ) )
                    // ../org.xtext.example.datatype/src-gen/at/ac/tuwien/big/xmltext/Datatype/parser/antlr/internal/InternalDatatype.g:103:1: (lv_customer_5_0= ruleCustomerType )
                    {
                    // ../org.xtext.example.datatype/src-gen/at/ac/tuwien/big/xmltext/Datatype/parser/antlr/internal/InternalDatatype.g:103:1: (lv_customer_5_0= ruleCustomerType )
                    // ../org.xtext.example.datatype/src-gen/at/ac/tuwien/big/xmltext/Datatype/parser/antlr/internal/InternalDatatype.g:104:3: lv_customer_5_0= ruleCustomerType
                    {
                     
                    	        newCompositeNode(grammarAccess.getLibraryTypeAccess().getCustomerCustomerTypeParserRuleCall_3_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleCustomerType_in_ruleLibraryType189);
                    lv_customer_5_0=ruleCustomerType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLibraryTypeRule());
                    	        }
                           		add(
                           			current, 
                           			"customer",
                            		lv_customer_5_0, 
                            		"CustomerType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.example.datatype/src-gen/at/ac/tuwien/big/xmltext/Datatype/parser/antlr/internal/InternalDatatype.g:120:2: (otherlv_6= ',' ( (lv_customer_7_0= ruleCustomerType ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==14) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // ../org.xtext.example.datatype/src-gen/at/ac/tuwien/big/xmltext/Datatype/parser/antlr/internal/InternalDatatype.g:120:4: otherlv_6= ',' ( (lv_customer_7_0= ruleCustomerType ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleLibraryType202); 

                    	        	newLeafNode(otherlv_6, grammarAccess.getLibraryTypeAccess().getCommaKeyword_3_3_0());
                    	        
                    	    // ../org.xtext.example.datatype/src-gen/at/ac/tuwien/big/xmltext/Datatype/parser/antlr/internal/InternalDatatype.g:124:1: ( (lv_customer_7_0= ruleCustomerType ) )
                    	    // ../org.xtext.example.datatype/src-gen/at/ac/tuwien/big/xmltext/Datatype/parser/antlr/internal/InternalDatatype.g:125:1: (lv_customer_7_0= ruleCustomerType )
                    	    {
                    	    // ../org.xtext.example.datatype/src-gen/at/ac/tuwien/big/xmltext/Datatype/parser/antlr/internal/InternalDatatype.g:125:1: (lv_customer_7_0= ruleCustomerType )
                    	    // ../org.xtext.example.datatype/src-gen/at/ac/tuwien/big/xmltext/Datatype/parser/antlr/internal/InternalDatatype.g:126:3: lv_customer_7_0= ruleCustomerType
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getLibraryTypeAccess().getCustomerCustomerTypeParserRuleCall_3_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleCustomerType_in_ruleLibraryType223);
                    	    lv_customer_7_0=ruleCustomerType();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getLibraryTypeRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"customer",
                    	            		lv_customer_7_0, 
                    	            		"CustomerType");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleLibraryType237); 

                        	newLeafNode(otherlv_8, grammarAccess.getLibraryTypeAccess().getRightSquareBracketKeyword_3_4());
                        

                    }
                    break;

            }

            otherlv_9=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleLibraryType251); 

                	newLeafNode(otherlv_9, grammarAccess.getLibraryTypeAccess().getRightSquareBracketKeyword_4());
                

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
    // $ANTLR end "ruleLibraryType"


    // $ANTLR start "entryRuleCustomerType"
    // ../org.xtext.example.datatype/src-gen/at/ac/tuwien/big/xmltext/Datatype/parser/antlr/internal/InternalDatatype.g:158:1: entryRuleCustomerType returns [EObject current=null] : iv_ruleCustomerType= ruleCustomerType EOF ;
    public final EObject entryRuleCustomerType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCustomerType = null;


        try {
            // ../org.xtext.example.datatype/src-gen/at/ac/tuwien/big/xmltext/Datatype/parser/antlr/internal/InternalDatatype.g:159:2: (iv_ruleCustomerType= ruleCustomerType EOF )
            // ../org.xtext.example.datatype/src-gen/at/ac/tuwien/big/xmltext/Datatype/parser/antlr/internal/InternalDatatype.g:160:2: iv_ruleCustomerType= ruleCustomerType EOF
            {
             newCompositeNode(grammarAccess.getCustomerTypeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCustomerType_in_entryRuleCustomerType287);
            iv_ruleCustomerType=ruleCustomerType();

            state._fsp--;

             current =iv_ruleCustomerType; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCustomerType297); 

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
    // $ANTLR end "entryRuleCustomerType"


    // $ANTLR start "ruleCustomerType"
    // ../org.xtext.example.datatype/src-gen/at/ac/tuwien/big/xmltext/Datatype/parser/antlr/internal/InternalDatatype.g:167:1: ruleCustomerType returns [EObject current=null] : (otherlv_0= 'CustomerType' otherlv_1= '[' otherlv_2= 'firstName' ( (lv_firstName_3_0= ruleString0 ) ) otherlv_4= 'lastName' ( (lv_lastName_5_0= ruleString0 ) ) otherlv_6= 'birthDate' ( (lv_birthDate_7_0= ruleDate ) ) otherlv_8= 'birthTime' ( (lv_birthTime_9_0= ruleTime ) ) (otherlv_10= 'dateTime' ( (lv_dateTime_11_0= ruleDateTime ) ) )? otherlv_12= 'age' ( (lv_age_13_0= ruleInteger ) ) otherlv_14= 'prize' ( (lv_prize_15_0= ruleDecimal ) ) otherlv_16= 'disabled' ( (lv_disabled_17_0= ruleBoolean ) ) otherlv_18= ']' ) ;
    public final EObject ruleCustomerType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        AntlrDatatypeRuleToken lv_firstName_3_0 = null;

        AntlrDatatypeRuleToken lv_lastName_5_0 = null;

        AntlrDatatypeRuleToken lv_birthDate_7_0 = null;

        AntlrDatatypeRuleToken lv_birthTime_9_0 = null;

        AntlrDatatypeRuleToken lv_dateTime_11_0 = null;

        AntlrDatatypeRuleToken lv_age_13_0 = null;

        AntlrDatatypeRuleToken lv_prize_15_0 = null;

        AntlrDatatypeRuleToken lv_disabled_17_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.datatype/src-gen/at/ac/tuwien/big/xmltext/Datatype/parser/antlr/internal/InternalDatatype.g:170:28: ( (otherlv_0= 'CustomerType' otherlv_1= '[' otherlv_2= 'firstName' ( (lv_firstName_3_0= ruleString0 ) ) otherlv_4= 'lastName' ( (lv_lastName_5_0= ruleString0 ) ) otherlv_6= 'birthDate' ( (lv_birthDate_7_0= ruleDate ) ) otherlv_8= 'birthTime' ( (lv_birthTime_9_0= ruleTime ) ) (otherlv_10= 'dateTime' ( (lv_dateTime_11_0= ruleDateTime ) ) )? otherlv_12= 'age' ( (lv_age_13_0= ruleInteger ) ) otherlv_14= 'prize' ( (lv_prize_15_0= ruleDecimal ) ) otherlv_16= 'disabled' ( (lv_disabled_17_0= ruleBoolean ) ) otherlv_18= ']' ) )
            // ../org.xtext.example.datatype/src-gen/at/ac/tuwien/big/xmltext/Datatype/parser/antlr/internal/InternalDatatype.g:171:1: (otherlv_0= 'CustomerType' otherlv_1= '[' otherlv_2= 'firstName' ( (lv_firstName_3_0= ruleString0 ) ) otherlv_4= 'lastName' ( (lv_lastName_5_0= ruleString0 ) ) otherlv_6= 'birthDate' ( (lv_birthDate_7_0= ruleDate ) ) otherlv_8= 'birthTime' ( (lv_birthTime_9_0= ruleTime ) ) (otherlv_10= 'dateTime' ( (lv_dateTime_11_0= ruleDateTime ) ) )? otherlv_12= 'age' ( (lv_age_13_0= ruleInteger ) ) otherlv_14= 'prize' ( (lv_prize_15_0= ruleDecimal ) ) otherlv_16= 'disabled' ( (lv_disabled_17_0= ruleBoolean ) ) otherlv_18= ']' )
            {
            // ../org.xtext.example.datatype/src-gen/at/ac/tuwien/big/xmltext/Datatype/parser/antlr/internal/InternalDatatype.g:171:1: (otherlv_0= 'CustomerType' otherlv_1= '[' otherlv_2= 'firstName' ( (lv_firstName_3_0= ruleString0 ) ) otherlv_4= 'lastName' ( (lv_lastName_5_0= ruleString0 ) ) otherlv_6= 'birthDate' ( (lv_birthDate_7_0= ruleDate ) ) otherlv_8= 'birthTime' ( (lv_birthTime_9_0= ruleTime ) ) (otherlv_10= 'dateTime' ( (lv_dateTime_11_0= ruleDateTime ) ) )? otherlv_12= 'age' ( (lv_age_13_0= ruleInteger ) ) otherlv_14= 'prize' ( (lv_prize_15_0= ruleDecimal ) ) otherlv_16= 'disabled' ( (lv_disabled_17_0= ruleBoolean ) ) otherlv_18= ']' )
            // ../org.xtext.example.datatype/src-gen/at/ac/tuwien/big/xmltext/Datatype/parser/antlr/internal/InternalDatatype.g:171:3: otherlv_0= 'CustomerType' otherlv_1= '[' otherlv_2= 'firstName' ( (lv_firstName_3_0= ruleString0 ) ) otherlv_4= 'lastName' ( (lv_lastName_5_0= ruleString0 ) ) otherlv_6= 'birthDate' ( (lv_birthDate_7_0= ruleDate ) ) otherlv_8= 'birthTime' ( (lv_birthTime_9_0= ruleTime ) ) (otherlv_10= 'dateTime' ( (lv_dateTime_11_0= ruleDateTime ) ) )? otherlv_12= 'age' ( (lv_age_13_0= ruleInteger ) ) otherlv_14= 'prize' ( (lv_prize_15_0= ruleDecimal ) ) otherlv_16= 'disabled' ( (lv_disabled_17_0= ruleBoolean ) ) otherlv_18= ']'
            {
            otherlv_0=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleCustomerType334); 

                	newLeafNode(otherlv_0, grammarAccess.getCustomerTypeAccess().getCustomerTypeKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleCustomerType346); 

                	newLeafNode(otherlv_1, grammarAccess.getCustomerTypeAccess().getLeftSquareBracketKeyword_1());
                
            otherlv_2=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleCustomerType358); 

                	newLeafNode(otherlv_2, grammarAccess.getCustomerTypeAccess().getFirstNameKeyword_2());
                
            // ../org.xtext.example.datatype/src-gen/at/ac/tuwien/big/xmltext/Datatype/parser/antlr/internal/InternalDatatype.g:183:1: ( (lv_firstName_3_0= ruleString0 ) )
            // ../org.xtext.example.datatype/src-gen/at/ac/tuwien/big/xmltext/Datatype/parser/antlr/internal/InternalDatatype.g:184:1: (lv_firstName_3_0= ruleString0 )
            {
            // ../org.xtext.example.datatype/src-gen/at/ac/tuwien/big/xmltext/Datatype/parser/antlr/internal/InternalDatatype.g:184:1: (lv_firstName_3_0= ruleString0 )
            // ../org.xtext.example.datatype/src-gen/at/ac/tuwien/big/xmltext/Datatype/parser/antlr/internal/InternalDatatype.g:185:3: lv_firstName_3_0= ruleString0
            {
             
            	        newCompositeNode(grammarAccess.getCustomerTypeAccess().getFirstNameString0ParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleString0_in_ruleCustomerType379);
            lv_firstName_3_0=ruleString0();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCustomerTypeRule());
            	        }
                   		set(
                   			current, 
                   			"firstName",
                    		lv_firstName_3_0, 
                    		"String0");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleCustomerType391); 

                	newLeafNode(otherlv_4, grammarAccess.getCustomerTypeAccess().getLastNameKeyword_4());
                
            // ../org.xtext.example.datatype/src-gen/at/ac/tuwien/big/xmltext/Datatype/parser/antlr/internal/InternalDatatype.g:205:1: ( (lv_lastName_5_0= ruleString0 ) )
            // ../org.xtext.example.datatype/src-gen/at/ac/tuwien/big/xmltext/Datatype/parser/antlr/internal/InternalDatatype.g:206:1: (lv_lastName_5_0= ruleString0 )
            {
            // ../org.xtext.example.datatype/src-gen/at/ac/tuwien/big/xmltext/Datatype/parser/antlr/internal/InternalDatatype.g:206:1: (lv_lastName_5_0= ruleString0 )
            // ../org.xtext.example.datatype/src-gen/at/ac/tuwien/big/xmltext/Datatype/parser/antlr/internal/InternalDatatype.g:207:3: lv_lastName_5_0= ruleString0
            {
             
            	        newCompositeNode(grammarAccess.getCustomerTypeAccess().getLastNameString0ParserRuleCall_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleString0_in_ruleCustomerType412);
            lv_lastName_5_0=ruleString0();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCustomerTypeRule());
            	        }
                   		set(
                   			current, 
                   			"lastName",
                    		lv_lastName_5_0, 
                    		"String0");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleCustomerType424); 

                	newLeafNode(otherlv_6, grammarAccess.getCustomerTypeAccess().getBirthDateKeyword_6());
                
            // ../org.xtext.example.datatype/src-gen/at/ac/tuwien/big/xmltext/Datatype/parser/antlr/internal/InternalDatatype.g:227:1: ( (lv_birthDate_7_0= ruleDate ) )
            // ../org.xtext.example.datatype/src-gen/at/ac/tuwien/big/xmltext/Datatype/parser/antlr/internal/InternalDatatype.g:228:1: (lv_birthDate_7_0= ruleDate )
            {
            // ../org.xtext.example.datatype/src-gen/at/ac/tuwien/big/xmltext/Datatype/parser/antlr/internal/InternalDatatype.g:228:1: (lv_birthDate_7_0= ruleDate )
            // ../org.xtext.example.datatype/src-gen/at/ac/tuwien/big/xmltext/Datatype/parser/antlr/internal/InternalDatatype.g:229:3: lv_birthDate_7_0= ruleDate
            {
             
            	        newCompositeNode(grammarAccess.getCustomerTypeAccess().getBirthDateDateParserRuleCall_7_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleDate_in_ruleCustomerType445);
            lv_birthDate_7_0=ruleDate();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCustomerTypeRule());
            	        }
                   		set(
                   			current, 
                   			"birthDate",
                    		lv_birthDate_7_0, 
                    		"Date");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_8=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleCustomerType457); 

                	newLeafNode(otherlv_8, grammarAccess.getCustomerTypeAccess().getBirthTimeKeyword_8());
                
            // ../org.xtext.example.datatype/src-gen/at/ac/tuwien/big/xmltext/Datatype/parser/antlr/internal/InternalDatatype.g:249:1: ( (lv_birthTime_9_0= ruleTime ) )
            // ../org.xtext.example.datatype/src-gen/at/ac/tuwien/big/xmltext/Datatype/parser/antlr/internal/InternalDatatype.g:250:1: (lv_birthTime_9_0= ruleTime )
            {
            // ../org.xtext.example.datatype/src-gen/at/ac/tuwien/big/xmltext/Datatype/parser/antlr/internal/InternalDatatype.g:250:1: (lv_birthTime_9_0= ruleTime )
            // ../org.xtext.example.datatype/src-gen/at/ac/tuwien/big/xmltext/Datatype/parser/antlr/internal/InternalDatatype.g:251:3: lv_birthTime_9_0= ruleTime
            {
             
            	        newCompositeNode(grammarAccess.getCustomerTypeAccess().getBirthTimeTimeParserRuleCall_9_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleTime_in_ruleCustomerType478);
            lv_birthTime_9_0=ruleTime();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCustomerTypeRule());
            	        }
                   		set(
                   			current, 
                   			"birthTime",
                    		lv_birthTime_9_0, 
                    		"Time");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.datatype/src-gen/at/ac/tuwien/big/xmltext/Datatype/parser/antlr/internal/InternalDatatype.g:267:2: (otherlv_10= 'dateTime' ( (lv_dateTime_11_0= ruleDateTime ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==21) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.xtext.example.datatype/src-gen/at/ac/tuwien/big/xmltext/Datatype/parser/antlr/internal/InternalDatatype.g:267:4: otherlv_10= 'dateTime' ( (lv_dateTime_11_0= ruleDateTime ) )
                    {
                    otherlv_10=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleCustomerType491); 

                        	newLeafNode(otherlv_10, grammarAccess.getCustomerTypeAccess().getDateTimeKeyword_10_0());
                        
                    // ../org.xtext.example.datatype/src-gen/at/ac/tuwien/big/xmltext/Datatype/parser/antlr/internal/InternalDatatype.g:271:1: ( (lv_dateTime_11_0= ruleDateTime ) )
                    // ../org.xtext.example.datatype/src-gen/at/ac/tuwien/big/xmltext/Datatype/parser/antlr/internal/InternalDatatype.g:272:1: (lv_dateTime_11_0= ruleDateTime )
                    {
                    // ../org.xtext.example.datatype/src-gen/at/ac/tuwien/big/xmltext/Datatype/parser/antlr/internal/InternalDatatype.g:272:1: (lv_dateTime_11_0= ruleDateTime )
                    // ../org.xtext.example.datatype/src-gen/at/ac/tuwien/big/xmltext/Datatype/parser/antlr/internal/InternalDatatype.g:273:3: lv_dateTime_11_0= ruleDateTime
                    {
                     
                    	        newCompositeNode(grammarAccess.getCustomerTypeAccess().getDateTimeDateTimeParserRuleCall_10_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleDateTime_in_ruleCustomerType512);
                    lv_dateTime_11_0=ruleDateTime();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCustomerTypeRule());
                    	        }
                           		set(
                           			current, 
                           			"dateTime",
                            		lv_dateTime_11_0, 
                            		"DateTime");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_12=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleCustomerType526); 

                	newLeafNode(otherlv_12, grammarAccess.getCustomerTypeAccess().getAgeKeyword_11());
                
            // ../org.xtext.example.datatype/src-gen/at/ac/tuwien/big/xmltext/Datatype/parser/antlr/internal/InternalDatatype.g:293:1: ( (lv_age_13_0= ruleInteger ) )
            // ../org.xtext.example.datatype/src-gen/at/ac/tuwien/big/xmltext/Datatype/parser/antlr/internal/InternalDatatype.g:294:1: (lv_age_13_0= ruleInteger )
            {
            // ../org.xtext.example.datatype/src-gen/at/ac/tuwien/big/xmltext/Datatype/parser/antlr/internal/InternalDatatype.g:294:1: (lv_age_13_0= ruleInteger )
            // ../org.xtext.example.datatype/src-gen/at/ac/tuwien/big/xmltext/Datatype/parser/antlr/internal/InternalDatatype.g:295:3: lv_age_13_0= ruleInteger
            {
             
            	        newCompositeNode(grammarAccess.getCustomerTypeAccess().getAgeIntegerParserRuleCall_12_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleInteger_in_ruleCustomerType547);
            lv_age_13_0=ruleInteger();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCustomerTypeRule());
            	        }
                   		set(
                   			current, 
                   			"age",
                    		lv_age_13_0, 
                    		"Integer");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_14=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleCustomerType559); 

                	newLeafNode(otherlv_14, grammarAccess.getCustomerTypeAccess().getPrizeKeyword_13());
                
            // ../org.xtext.example.datatype/src-gen/at/ac/tuwien/big/xmltext/Datatype/parser/antlr/internal/InternalDatatype.g:315:1: ( (lv_prize_15_0= ruleDecimal ) )
            // ../org.xtext.example.datatype/src-gen/at/ac/tuwien/big/xmltext/Datatype/parser/antlr/internal/InternalDatatype.g:316:1: (lv_prize_15_0= ruleDecimal )
            {
            // ../org.xtext.example.datatype/src-gen/at/ac/tuwien/big/xmltext/Datatype/parser/antlr/internal/InternalDatatype.g:316:1: (lv_prize_15_0= ruleDecimal )
            // ../org.xtext.example.datatype/src-gen/at/ac/tuwien/big/xmltext/Datatype/parser/antlr/internal/InternalDatatype.g:317:3: lv_prize_15_0= ruleDecimal
            {
             
            	        newCompositeNode(grammarAccess.getCustomerTypeAccess().getPrizeDecimalParserRuleCall_14_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleDecimal_in_ruleCustomerType580);
            lv_prize_15_0=ruleDecimal();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCustomerTypeRule());
            	        }
                   		set(
                   			current, 
                   			"prize",
                    		lv_prize_15_0, 
                    		"Decimal");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_16=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleCustomerType592); 

                	newLeafNode(otherlv_16, grammarAccess.getCustomerTypeAccess().getDisabledKeyword_15());
                
            // ../org.xtext.example.datatype/src-gen/at/ac/tuwien/big/xmltext/Datatype/parser/antlr/internal/InternalDatatype.g:337:1: ( (lv_disabled_17_0= ruleBoolean ) )
            // ../org.xtext.example.datatype/src-gen/at/ac/tuwien/big/xmltext/Datatype/parser/antlr/internal/InternalDatatype.g:338:1: (lv_disabled_17_0= ruleBoolean )
            {
            // ../org.xtext.example.datatype/src-gen/at/ac/tuwien/big/xmltext/Datatype/parser/antlr/internal/InternalDatatype.g:338:1: (lv_disabled_17_0= ruleBoolean )
            // ../org.xtext.example.datatype/src-gen/at/ac/tuwien/big/xmltext/Datatype/parser/antlr/internal/InternalDatatype.g:339:3: lv_disabled_17_0= ruleBoolean
            {
             
            	        newCompositeNode(grammarAccess.getCustomerTypeAccess().getDisabledBooleanParserRuleCall_16_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleBoolean_in_ruleCustomerType613);
            lv_disabled_17_0=ruleBoolean();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCustomerTypeRule());
            	        }
                   		set(
                   			current, 
                   			"disabled",
                    		lv_disabled_17_0, 
                    		"Boolean");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_18=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleCustomerType625); 

                	newLeafNode(otherlv_18, grammarAccess.getCustomerTypeAccess().getRightSquareBracketKeyword_17());
                

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
    // $ANTLR end "ruleCustomerType"


    // $ANTLR start "entryRuleString0"
    // ../org.xtext.example.datatype/src-gen/at/ac/tuwien/big/xmltext/Datatype/parser/antlr/internal/InternalDatatype.g:367:1: entryRuleString0 returns [String current=null] : iv_ruleString0= ruleString0 EOF ;
    public final String entryRuleString0() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleString0 = null;


        try {
            // ../org.xtext.example.datatype/src-gen/at/ac/tuwien/big/xmltext/Datatype/parser/antlr/internal/InternalDatatype.g:368:2: (iv_ruleString0= ruleString0 EOF )
            // ../org.xtext.example.datatype/src-gen/at/ac/tuwien/big/xmltext/Datatype/parser/antlr/internal/InternalDatatype.g:369:2: iv_ruleString0= ruleString0 EOF
            {
             newCompositeNode(grammarAccess.getString0Rule()); 
            pushFollow(FollowSets000.FOLLOW_ruleString0_in_entryRuleString0662);
            iv_ruleString0=ruleString0();

            state._fsp--;

             current =iv_ruleString0.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleString0673); 

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
    // ../org.xtext.example.datatype/src-gen/at/ac/tuwien/big/xmltext/Datatype/parser/antlr/internal/InternalDatatype.g:376:1: ruleString0 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleString0() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.datatype/src-gen/at/ac/tuwien/big/xmltext/Datatype/parser/antlr/internal/InternalDatatype.g:379:28: (this_STRING_0= RULE_STRING )
            // ../org.xtext.example.datatype/src-gen/at/ac/tuwien/big/xmltext/Datatype/parser/antlr/internal/InternalDatatype.g:380:5: this_STRING_0= RULE_STRING
            {
            this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleString0712); 

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


    // $ANTLR start "entryRuleDate"
    // ../org.xtext.example.datatype/src-gen/at/ac/tuwien/big/xmltext/Datatype/parser/antlr/internal/InternalDatatype.g:395:1: entryRuleDate returns [String current=null] : iv_ruleDate= ruleDate EOF ;
    public final String entryRuleDate() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDate = null;


        try {
            // ../org.xtext.example.datatype/src-gen/at/ac/tuwien/big/xmltext/Datatype/parser/antlr/internal/InternalDatatype.g:396:2: (iv_ruleDate= ruleDate EOF )
            // ../org.xtext.example.datatype/src-gen/at/ac/tuwien/big/xmltext/Datatype/parser/antlr/internal/InternalDatatype.g:397:2: iv_ruleDate= ruleDate EOF
            {
             newCompositeNode(grammarAccess.getDateRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDate_in_entryRuleDate757);
            iv_ruleDate=ruleDate();

            state._fsp--;

             current =iv_ruleDate.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDate768); 

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
    // ../org.xtext.example.datatype/src-gen/at/ac/tuwien/big/xmltext/Datatype/parser/antlr/internal/InternalDatatype.g:404:1: ruleDate returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT kw= '-' this_INT_2= RULE_INT kw= '-' this_INT_4= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleDate() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;
        Token this_INT_4=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.datatype/src-gen/at/ac/tuwien/big/xmltext/Datatype/parser/antlr/internal/InternalDatatype.g:407:28: ( (this_INT_0= RULE_INT kw= '-' this_INT_2= RULE_INT kw= '-' this_INT_4= RULE_INT ) )
            // ../org.xtext.example.datatype/src-gen/at/ac/tuwien/big/xmltext/Datatype/parser/antlr/internal/InternalDatatype.g:408:1: (this_INT_0= RULE_INT kw= '-' this_INT_2= RULE_INT kw= '-' this_INT_4= RULE_INT )
            {
            // ../org.xtext.example.datatype/src-gen/at/ac/tuwien/big/xmltext/Datatype/parser/antlr/internal/InternalDatatype.g:408:1: (this_INT_0= RULE_INT kw= '-' this_INT_2= RULE_INT kw= '-' this_INT_4= RULE_INT )
            // ../org.xtext.example.datatype/src-gen/at/ac/tuwien/big/xmltext/Datatype/parser/antlr/internal/InternalDatatype.g:408:6: this_INT_0= RULE_INT kw= '-' this_INT_2= RULE_INT kw= '-' this_INT_4= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleDate808); 

            		current.merge(this_INT_0);
                
             
                newLeafNode(this_INT_0, grammarAccess.getDateAccess().getINTTerminalRuleCall_0()); 
                
            kw=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleDate826); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getDateAccess().getHyphenMinusKeyword_1()); 
                
            this_INT_2=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleDate841); 

            		current.merge(this_INT_2);
                
             
                newLeafNode(this_INT_2, grammarAccess.getDateAccess().getINTTerminalRuleCall_2()); 
                
            kw=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleDate859); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getDateAccess().getHyphenMinusKeyword_3()); 
                
            this_INT_4=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleDate874); 

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


    // $ANTLR start "entryRuleTime"
    // ../org.xtext.example.datatype/src-gen/at/ac/tuwien/big/xmltext/Datatype/parser/antlr/internal/InternalDatatype.g:449:1: entryRuleTime returns [String current=null] : iv_ruleTime= ruleTime EOF ;
    public final String entryRuleTime() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTime = null;


        try {
            // ../org.xtext.example.datatype/src-gen/at/ac/tuwien/big/xmltext/Datatype/parser/antlr/internal/InternalDatatype.g:450:2: (iv_ruleTime= ruleTime EOF )
            // ../org.xtext.example.datatype/src-gen/at/ac/tuwien/big/xmltext/Datatype/parser/antlr/internal/InternalDatatype.g:451:2: iv_ruleTime= ruleTime EOF
            {
             newCompositeNode(grammarAccess.getTimeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTime_in_entryRuleTime920);
            iv_ruleTime=ruleTime();

            state._fsp--;

             current =iv_ruleTime.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTime931); 

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
    // $ANTLR end "entryRuleTime"


    // $ANTLR start "ruleTime"
    // ../org.xtext.example.datatype/src-gen/at/ac/tuwien/big/xmltext/Datatype/parser/antlr/internal/InternalDatatype.g:458:1: ruleTime returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT kw= ':' this_INT_2= RULE_INT kw= ':' this_INT_4= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleTime() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;
        Token this_INT_4=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.datatype/src-gen/at/ac/tuwien/big/xmltext/Datatype/parser/antlr/internal/InternalDatatype.g:461:28: ( (this_INT_0= RULE_INT kw= ':' this_INT_2= RULE_INT kw= ':' this_INT_4= RULE_INT ) )
            // ../org.xtext.example.datatype/src-gen/at/ac/tuwien/big/xmltext/Datatype/parser/antlr/internal/InternalDatatype.g:462:1: (this_INT_0= RULE_INT kw= ':' this_INT_2= RULE_INT kw= ':' this_INT_4= RULE_INT )
            {
            // ../org.xtext.example.datatype/src-gen/at/ac/tuwien/big/xmltext/Datatype/parser/antlr/internal/InternalDatatype.g:462:1: (this_INT_0= RULE_INT kw= ':' this_INT_2= RULE_INT kw= ':' this_INT_4= RULE_INT )
            // ../org.xtext.example.datatype/src-gen/at/ac/tuwien/big/xmltext/Datatype/parser/antlr/internal/InternalDatatype.g:462:6: this_INT_0= RULE_INT kw= ':' this_INT_2= RULE_INT kw= ':' this_INT_4= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleTime971); 

            		current.merge(this_INT_0);
                
             
                newLeafNode(this_INT_0, grammarAccess.getTimeAccess().getINTTerminalRuleCall_0()); 
                
            kw=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleTime989); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getTimeAccess().getColonKeyword_1()); 
                
            this_INT_2=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleTime1004); 

            		current.merge(this_INT_2);
                
             
                newLeafNode(this_INT_2, grammarAccess.getTimeAccess().getINTTerminalRuleCall_2()); 
                
            kw=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleTime1022); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getTimeAccess().getColonKeyword_3()); 
                
            this_INT_4=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleTime1037); 

            		current.merge(this_INT_4);
                
             
                newLeafNode(this_INT_4, grammarAccess.getTimeAccess().getINTTerminalRuleCall_4()); 
                

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
    // $ANTLR end "ruleTime"


    // $ANTLR start "entryRuleDateTime"
    // ../org.xtext.example.datatype/src-gen/at/ac/tuwien/big/xmltext/Datatype/parser/antlr/internal/InternalDatatype.g:503:1: entryRuleDateTime returns [String current=null] : iv_ruleDateTime= ruleDateTime EOF ;
    public final String entryRuleDateTime() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDateTime = null;


        try {
            // ../org.xtext.example.datatype/src-gen/at/ac/tuwien/big/xmltext/Datatype/parser/antlr/internal/InternalDatatype.g:504:2: (iv_ruleDateTime= ruleDateTime EOF )
            // ../org.xtext.example.datatype/src-gen/at/ac/tuwien/big/xmltext/Datatype/parser/antlr/internal/InternalDatatype.g:505:2: iv_ruleDateTime= ruleDateTime EOF
            {
             newCompositeNode(grammarAccess.getDateTimeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDateTime_in_entryRuleDateTime1083);
            iv_ruleDateTime=ruleDateTime();

            state._fsp--;

             current =iv_ruleDateTime.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDateTime1094); 

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
    // $ANTLR end "entryRuleDateTime"


    // $ANTLR start "ruleDateTime"
    // ../org.xtext.example.datatype/src-gen/at/ac/tuwien/big/xmltext/Datatype/parser/antlr/internal/InternalDatatype.g:512:1: ruleDateTime returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'DateTime' ;
    public final AntlrDatatypeRuleToken ruleDateTime() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.datatype/src-gen/at/ac/tuwien/big/xmltext/Datatype/parser/antlr/internal/InternalDatatype.g:515:28: (kw= 'DateTime' )
            // ../org.xtext.example.datatype/src-gen/at/ac/tuwien/big/xmltext/Datatype/parser/antlr/internal/InternalDatatype.g:517:2: kw= 'DateTime'
            {
            kw=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleDateTime1131); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getDateTimeAccess().getDateTimeKeyword()); 
                

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
    // $ANTLR end "ruleDateTime"


    // $ANTLR start "entryRuleInteger"
    // ../org.xtext.example.datatype/src-gen/at/ac/tuwien/big/xmltext/Datatype/parser/antlr/internal/InternalDatatype.g:530:1: entryRuleInteger returns [String current=null] : iv_ruleInteger= ruleInteger EOF ;
    public final String entryRuleInteger() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInteger = null;


        try {
            // ../org.xtext.example.datatype/src-gen/at/ac/tuwien/big/xmltext/Datatype/parser/antlr/internal/InternalDatatype.g:531:2: (iv_ruleInteger= ruleInteger EOF )
            // ../org.xtext.example.datatype/src-gen/at/ac/tuwien/big/xmltext/Datatype/parser/antlr/internal/InternalDatatype.g:532:2: iv_ruleInteger= ruleInteger EOF
            {
             newCompositeNode(grammarAccess.getIntegerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInteger_in_entryRuleInteger1171);
            iv_ruleInteger=ruleInteger();

            state._fsp--;

             current =iv_ruleInteger.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInteger1182); 

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
    // $ANTLR end "entryRuleInteger"


    // $ANTLR start "ruleInteger"
    // ../org.xtext.example.datatype/src-gen/at/ac/tuwien/big/xmltext/Datatype/parser/antlr/internal/InternalDatatype.g:539:1: ruleInteger returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleInteger() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.datatype/src-gen/at/ac/tuwien/big/xmltext/Datatype/parser/antlr/internal/InternalDatatype.g:542:28: (this_INT_0= RULE_INT )
            // ../org.xtext.example.datatype/src-gen/at/ac/tuwien/big/xmltext/Datatype/parser/antlr/internal/InternalDatatype.g:543:5: this_INT_0= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleInteger1221); 

            		current.merge(this_INT_0);
                
             
                newLeafNode(this_INT_0, grammarAccess.getIntegerAccess().getINTTerminalRuleCall()); 
                

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
    // $ANTLR end "ruleInteger"


    // $ANTLR start "entryRuleDecimal"
    // ../org.xtext.example.datatype/src-gen/at/ac/tuwien/big/xmltext/Datatype/parser/antlr/internal/InternalDatatype.g:558:1: entryRuleDecimal returns [String current=null] : iv_ruleDecimal= ruleDecimal EOF ;
    public final String entryRuleDecimal() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDecimal = null;


        try {
            // ../org.xtext.example.datatype/src-gen/at/ac/tuwien/big/xmltext/Datatype/parser/antlr/internal/InternalDatatype.g:559:2: (iv_ruleDecimal= ruleDecimal EOF )
            // ../org.xtext.example.datatype/src-gen/at/ac/tuwien/big/xmltext/Datatype/parser/antlr/internal/InternalDatatype.g:560:2: iv_ruleDecimal= ruleDecimal EOF
            {
             newCompositeNode(grammarAccess.getDecimalRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDecimal_in_entryRuleDecimal1266);
            iv_ruleDecimal=ruleDecimal();

            state._fsp--;

             current =iv_ruleDecimal.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDecimal1277); 

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
    // $ANTLR end "entryRuleDecimal"


    // $ANTLR start "ruleDecimal"
    // ../org.xtext.example.datatype/src-gen/at/ac/tuwien/big/xmltext/Datatype/parser/antlr/internal/InternalDatatype.g:567:1: ruleDecimal returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleDecimal() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.datatype/src-gen/at/ac/tuwien/big/xmltext/Datatype/parser/antlr/internal/InternalDatatype.g:570:28: ( (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) )
            // ../org.xtext.example.datatype/src-gen/at/ac/tuwien/big/xmltext/Datatype/parser/antlr/internal/InternalDatatype.g:571:1: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
            {
            // ../org.xtext.example.datatype/src-gen/at/ac/tuwien/big/xmltext/Datatype/parser/antlr/internal/InternalDatatype.g:571:1: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
            // ../org.xtext.example.datatype/src-gen/at/ac/tuwien/big/xmltext/Datatype/parser/antlr/internal/InternalDatatype.g:571:6: this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleDecimal1317); 

            		current.merge(this_INT_0);
                
             
                newLeafNode(this_INT_0, grammarAccess.getDecimalAccess().getINTTerminalRuleCall_0()); 
                
            kw=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleDecimal1335); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getDecimalAccess().getFullStopKeyword_1()); 
                
            this_INT_2=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleDecimal1350); 

            		current.merge(this_INT_2);
                
             
                newLeafNode(this_INT_2, grammarAccess.getDecimalAccess().getINTTerminalRuleCall_2()); 
                

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
    // $ANTLR end "ruleDecimal"


    // $ANTLR start "entryRuleBoolean"
    // ../org.xtext.example.datatype/src-gen/at/ac/tuwien/big/xmltext/Datatype/parser/antlr/internal/InternalDatatype.g:599:1: entryRuleBoolean returns [String current=null] : iv_ruleBoolean= ruleBoolean EOF ;
    public final String entryRuleBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBoolean = null;


        try {
            // ../org.xtext.example.datatype/src-gen/at/ac/tuwien/big/xmltext/Datatype/parser/antlr/internal/InternalDatatype.g:600:2: (iv_ruleBoolean= ruleBoolean EOF )
            // ../org.xtext.example.datatype/src-gen/at/ac/tuwien/big/xmltext/Datatype/parser/antlr/internal/InternalDatatype.g:601:2: iv_ruleBoolean= ruleBoolean EOF
            {
             newCompositeNode(grammarAccess.getBooleanRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBoolean_in_entryRuleBoolean1396);
            iv_ruleBoolean=ruleBoolean();

            state._fsp--;

             current =iv_ruleBoolean.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBoolean1407); 

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
    // $ANTLR end "entryRuleBoolean"


    // $ANTLR start "ruleBoolean"
    // ../org.xtext.example.datatype/src-gen/at/ac/tuwien/big/xmltext/Datatype/parser/antlr/internal/InternalDatatype.g:608:1: ruleBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.datatype/src-gen/at/ac/tuwien/big/xmltext/Datatype/parser/antlr/internal/InternalDatatype.g:611:28: ( (kw= 'true' | kw= 'false' ) )
            // ../org.xtext.example.datatype/src-gen/at/ac/tuwien/big/xmltext/Datatype/parser/antlr/internal/InternalDatatype.g:612:1: (kw= 'true' | kw= 'false' )
            {
            // ../org.xtext.example.datatype/src-gen/at/ac/tuwien/big/xmltext/Datatype/parser/antlr/internal/InternalDatatype.g:612:1: (kw= 'true' | kw= 'false' )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==29) ) {
                alt4=1;
            }
            else if ( (LA4_0==30) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../org.xtext.example.datatype/src-gen/at/ac/tuwien/big/xmltext/Datatype/parser/antlr/internal/InternalDatatype.g:613:2: kw= 'true'
                    {
                    kw=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleBoolean1445); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBooleanAccess().getTrueKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.datatype/src-gen/at/ac/tuwien/big/xmltext/Datatype/parser/antlr/internal/InternalDatatype.g:620:2: kw= 'false'
                    {
                    kw=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleBoolean1464); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBooleanAccess().getFalseKeyword_1()); 
                        

                    }
                    break;

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
    // $ANTLR end "ruleBoolean"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleLibraryType_in_entryRuleLibraryType75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLibraryType85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleLibraryType131 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleLibraryType143 = new BitSet(new long[]{0x000000000000A000L});
        public static final BitSet FOLLOW_13_in_ruleLibraryType156 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleLibraryType168 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_ruleCustomerType_in_ruleLibraryType189 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleLibraryType202 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_ruleCustomerType_in_ruleLibraryType223 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_ruleLibraryType237 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleLibraryType251 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCustomerType_in_entryRuleCustomerType287 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCustomerType297 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_ruleCustomerType334 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleCustomerType346 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleCustomerType358 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleString0_in_ruleCustomerType379 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleCustomerType391 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleString0_in_ruleCustomerType412 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleCustomerType424 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleDate_in_ruleCustomerType445 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleCustomerType457 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleTime_in_ruleCustomerType478 = new BitSet(new long[]{0x0000000000600000L});
        public static final BitSet FOLLOW_21_in_ruleCustomerType491 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_ruleDateTime_in_ruleCustomerType512 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleCustomerType526 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleInteger_in_ruleCustomerType547 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23_in_ruleCustomerType559 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleDecimal_in_ruleCustomerType580 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_ruleCustomerType592 = new BitSet(new long[]{0x0000000060000000L});
        public static final BitSet FOLLOW_ruleBoolean_in_ruleCustomerType613 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleCustomerType625 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleString0_in_entryRuleString0662 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleString0673 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleString0712 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDate_in_entryRuleDate757 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDate768 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleDate808 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_25_in_ruleDate826 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleDate841 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_25_in_ruleDate859 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleDate874 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTime_in_entryRuleTime920 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTime931 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleTime971 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_26_in_ruleTime989 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleTime1004 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_26_in_ruleTime1022 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleTime1037 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDateTime_in_entryRuleDateTime1083 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDateTime1094 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_ruleDateTime1131 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInteger_in_entryRuleInteger1171 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInteger1182 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleInteger1221 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDecimal_in_entryRuleDecimal1266 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDecimal1277 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleDecimal1317 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_28_in_ruleDecimal1335 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleDecimal1350 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBoolean_in_entryRuleBoolean1396 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBoolean1407 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_ruleBoolean1445 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_ruleBoolean1464 = new BitSet(new long[]{0x0000000000000002L});
    }


}