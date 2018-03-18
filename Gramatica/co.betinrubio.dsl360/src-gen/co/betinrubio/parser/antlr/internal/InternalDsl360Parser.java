package co.betinrubio.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import co.betinrubio.services.Dsl360GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDsl360Parser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_OPENBRACE", "RULE_COLON", "RULE_COMMA", "RULE_OPENBRAKET", "RULE_CLOSEBRAKET", "RULE_CLOSEBRACE", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_QUOTATIONMARK", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'name'", "'toures'", "'panoramas'", "'image'", "'hotspots'", "'to'", "'position'", "'rotation'", "'posx'", "'posy'", "'posz'", "'rotx'", "'roty'", "'rotz'", "'-'", "'.'", "'E'", "'e'"
    };
    public static final int RULE_STRING=10;
    public static final int RULE_SL_COMMENT=15;
    public static final int T__19=19;
    public static final int RULE_QUOTATIONMARK=13;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int RULE_CLOSEBRACE=9;
    public static final int RULE_OPENBRACE=4;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_OPENBRAKET=7;
    public static final int RULE_ID=11;
    public static final int RULE_COMMA=6;
    public static final int RULE_WS=16;
    public static final int RULE_COLON=5;
    public static final int RULE_ANY_OTHER=17;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=12;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=14;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int RULE_CLOSEBRAKET=8;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalDsl360Parser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDsl360Parser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDsl360Parser.tokenNames; }
    public String getGrammarFileName() { return "InternalDsl360.g"; }



     	private Dsl360GrammarAccess grammarAccess;

        public InternalDsl360Parser(TokenStream input, Dsl360GrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Proyecto";
       	}

       	@Override
       	protected Dsl360GrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleProyecto"
    // InternalDsl360.g:64:1: entryRuleProyecto returns [EObject current=null] : iv_ruleProyecto= ruleProyecto EOF ;
    public final EObject entryRuleProyecto() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProyecto = null;


        try {
            // InternalDsl360.g:64:49: (iv_ruleProyecto= ruleProyecto EOF )
            // InternalDsl360.g:65:2: iv_ruleProyecto= ruleProyecto EOF
            {
             newCompositeNode(grammarAccess.getProyectoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProyecto=ruleProyecto();

            state._fsp--;

             current =iv_ruleProyecto; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleProyecto"


    // $ANTLR start "ruleProyecto"
    // InternalDsl360.g:71:1: ruleProyecto returns [EObject current=null] : ( () this_OPENBRACE_1= RULE_OPENBRACE otherlv_2= 'name' this_COLON_3= RULE_COLON ( (lv_name_4_0= ruleEString ) ) this_COMMA_5= RULE_COMMA otherlv_6= 'toures' this_COLON_7= RULE_COLON this_OPENBRAKET_8= RULE_OPENBRAKET ( (lv_toures_9_0= ruleTour ) ) (this_COMMA_10= RULE_COMMA ( (lv_toures_11_0= ruleTour ) ) )* this_CLOSEBRAKET_12= RULE_CLOSEBRAKET this_CLOSEBRACE_13= RULE_CLOSEBRACE ) ;
    public final EObject ruleProyecto() throws RecognitionException {
        EObject current = null;

        Token this_OPENBRACE_1=null;
        Token otherlv_2=null;
        Token this_COLON_3=null;
        Token this_COMMA_5=null;
        Token otherlv_6=null;
        Token this_COLON_7=null;
        Token this_OPENBRAKET_8=null;
        Token this_COMMA_10=null;
        Token this_CLOSEBRAKET_12=null;
        Token this_CLOSEBRACE_13=null;
        AntlrDatatypeRuleToken lv_name_4_0 = null;

        EObject lv_toures_9_0 = null;

        EObject lv_toures_11_0 = null;



        	enterRule();

        try {
            // InternalDsl360.g:77:2: ( ( () this_OPENBRACE_1= RULE_OPENBRACE otherlv_2= 'name' this_COLON_3= RULE_COLON ( (lv_name_4_0= ruleEString ) ) this_COMMA_5= RULE_COMMA otherlv_6= 'toures' this_COLON_7= RULE_COLON this_OPENBRAKET_8= RULE_OPENBRAKET ( (lv_toures_9_0= ruleTour ) ) (this_COMMA_10= RULE_COMMA ( (lv_toures_11_0= ruleTour ) ) )* this_CLOSEBRAKET_12= RULE_CLOSEBRAKET this_CLOSEBRACE_13= RULE_CLOSEBRACE ) )
            // InternalDsl360.g:78:2: ( () this_OPENBRACE_1= RULE_OPENBRACE otherlv_2= 'name' this_COLON_3= RULE_COLON ( (lv_name_4_0= ruleEString ) ) this_COMMA_5= RULE_COMMA otherlv_6= 'toures' this_COLON_7= RULE_COLON this_OPENBRAKET_8= RULE_OPENBRAKET ( (lv_toures_9_0= ruleTour ) ) (this_COMMA_10= RULE_COMMA ( (lv_toures_11_0= ruleTour ) ) )* this_CLOSEBRAKET_12= RULE_CLOSEBRAKET this_CLOSEBRACE_13= RULE_CLOSEBRACE )
            {
            // InternalDsl360.g:78:2: ( () this_OPENBRACE_1= RULE_OPENBRACE otherlv_2= 'name' this_COLON_3= RULE_COLON ( (lv_name_4_0= ruleEString ) ) this_COMMA_5= RULE_COMMA otherlv_6= 'toures' this_COLON_7= RULE_COLON this_OPENBRAKET_8= RULE_OPENBRAKET ( (lv_toures_9_0= ruleTour ) ) (this_COMMA_10= RULE_COMMA ( (lv_toures_11_0= ruleTour ) ) )* this_CLOSEBRAKET_12= RULE_CLOSEBRAKET this_CLOSEBRACE_13= RULE_CLOSEBRACE )
            // InternalDsl360.g:79:3: () this_OPENBRACE_1= RULE_OPENBRACE otherlv_2= 'name' this_COLON_3= RULE_COLON ( (lv_name_4_0= ruleEString ) ) this_COMMA_5= RULE_COMMA otherlv_6= 'toures' this_COLON_7= RULE_COLON this_OPENBRAKET_8= RULE_OPENBRAKET ( (lv_toures_9_0= ruleTour ) ) (this_COMMA_10= RULE_COMMA ( (lv_toures_11_0= ruleTour ) ) )* this_CLOSEBRAKET_12= RULE_CLOSEBRAKET this_CLOSEBRACE_13= RULE_CLOSEBRACE
            {
            // InternalDsl360.g:79:3: ()
            // InternalDsl360.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getProyectoAccess().getProyectoAction_0(),
            					current);
            			

            }

            this_OPENBRACE_1=(Token)match(input,RULE_OPENBRACE,FOLLOW_3); 

            			newLeafNode(this_OPENBRACE_1, grammarAccess.getProyectoAccess().getOPENBRACETerminalRuleCall_1());
            		
            otherlv_2=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getProyectoAccess().getNameKeyword_2());
            		
            this_COLON_3=(Token)match(input,RULE_COLON,FOLLOW_5); 

            			newLeafNode(this_COLON_3, grammarAccess.getProyectoAccess().getCOLONTerminalRuleCall_3());
            		
            // InternalDsl360.g:98:3: ( (lv_name_4_0= ruleEString ) )
            // InternalDsl360.g:99:4: (lv_name_4_0= ruleEString )
            {
            // InternalDsl360.g:99:4: (lv_name_4_0= ruleEString )
            // InternalDsl360.g:100:5: lv_name_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getProyectoAccess().getNameEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_6);
            lv_name_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProyectoRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_4_0,
            						"co.betinrubio.Dsl360.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_COMMA_5=(Token)match(input,RULE_COMMA,FOLLOW_7); 

            			newLeafNode(this_COMMA_5, grammarAccess.getProyectoAccess().getCOMMATerminalRuleCall_5());
            		
            otherlv_6=(Token)match(input,19,FOLLOW_4); 

            			newLeafNode(otherlv_6, grammarAccess.getProyectoAccess().getTouresKeyword_6());
            		
            this_COLON_7=(Token)match(input,RULE_COLON,FOLLOW_8); 

            			newLeafNode(this_COLON_7, grammarAccess.getProyectoAccess().getCOLONTerminalRuleCall_7());
            		
            this_OPENBRAKET_8=(Token)match(input,RULE_OPENBRAKET,FOLLOW_9); 

            			newLeafNode(this_OPENBRAKET_8, grammarAccess.getProyectoAccess().getOPENBRAKETTerminalRuleCall_8());
            		
            // InternalDsl360.g:133:3: ( (lv_toures_9_0= ruleTour ) )
            // InternalDsl360.g:134:4: (lv_toures_9_0= ruleTour )
            {
            // InternalDsl360.g:134:4: (lv_toures_9_0= ruleTour )
            // InternalDsl360.g:135:5: lv_toures_9_0= ruleTour
            {

            					newCompositeNode(grammarAccess.getProyectoAccess().getTouresTourParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_10);
            lv_toures_9_0=ruleTour();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProyectoRule());
            					}
            					add(
            						current,
            						"toures",
            						lv_toures_9_0,
            						"co.betinrubio.Dsl360.Tour");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDsl360.g:152:3: (this_COMMA_10= RULE_COMMA ( (lv_toures_11_0= ruleTour ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_COMMA) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalDsl360.g:153:4: this_COMMA_10= RULE_COMMA ( (lv_toures_11_0= ruleTour ) )
            	    {
            	    this_COMMA_10=(Token)match(input,RULE_COMMA,FOLLOW_9); 

            	    				newLeafNode(this_COMMA_10, grammarAccess.getProyectoAccess().getCOMMATerminalRuleCall_10_0());
            	    			
            	    // InternalDsl360.g:157:4: ( (lv_toures_11_0= ruleTour ) )
            	    // InternalDsl360.g:158:5: (lv_toures_11_0= ruleTour )
            	    {
            	    // InternalDsl360.g:158:5: (lv_toures_11_0= ruleTour )
            	    // InternalDsl360.g:159:6: lv_toures_11_0= ruleTour
            	    {

            	    						newCompositeNode(grammarAccess.getProyectoAccess().getTouresTourParserRuleCall_10_1_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    lv_toures_11_0=ruleTour();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getProyectoRule());
            	    						}
            	    						add(
            	    							current,
            	    							"toures",
            	    							lv_toures_11_0,
            	    							"co.betinrubio.Dsl360.Tour");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            this_CLOSEBRAKET_12=(Token)match(input,RULE_CLOSEBRAKET,FOLLOW_11); 

            			newLeafNode(this_CLOSEBRAKET_12, grammarAccess.getProyectoAccess().getCLOSEBRAKETTerminalRuleCall_11());
            		
            this_CLOSEBRACE_13=(Token)match(input,RULE_CLOSEBRACE,FOLLOW_2); 

            			newLeafNode(this_CLOSEBRACE_13, grammarAccess.getProyectoAccess().getCLOSEBRACETerminalRuleCall_12());
            		

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
    // $ANTLR end "ruleProyecto"


    // $ANTLR start "entryRuleEString"
    // InternalDsl360.g:189:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalDsl360.g:189:47: (iv_ruleEString= ruleEString EOF )
            // InternalDsl360.g:190:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalDsl360.g:196:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalDsl360.g:202:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalDsl360.g:203:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalDsl360.g:203:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalDsl360.g:204:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalDsl360.g:212:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleTour"
    // InternalDsl360.g:223:1: entryRuleTour returns [EObject current=null] : iv_ruleTour= ruleTour EOF ;
    public final EObject entryRuleTour() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTour = null;


        try {
            // InternalDsl360.g:223:45: (iv_ruleTour= ruleTour EOF )
            // InternalDsl360.g:224:2: iv_ruleTour= ruleTour EOF
            {
             newCompositeNode(grammarAccess.getTourRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTour=ruleTour();

            state._fsp--;

             current =iv_ruleTour; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTour"


    // $ANTLR start "ruleTour"
    // InternalDsl360.g:230:1: ruleTour returns [EObject current=null] : ( () this_OPENBRACE_1= RULE_OPENBRACE otherlv_2= 'name' this_COLON_3= RULE_COLON ( (lv_name_4_0= ruleEString ) ) this_COMMA_5= RULE_COMMA otherlv_6= 'panoramas' this_COLON_7= RULE_COLON this_OPENBRAKET_8= RULE_OPENBRAKET ( (lv_panoramas_9_0= rulePanorama ) ) (this_COMMA_10= RULE_COMMA ( (lv_panoramas_11_0= rulePanorama ) ) )* this_CLOSEBRAKET_12= RULE_CLOSEBRAKET this_CLOSEBRACE_13= RULE_CLOSEBRACE ) ;
    public final EObject ruleTour() throws RecognitionException {
        EObject current = null;

        Token this_OPENBRACE_1=null;
        Token otherlv_2=null;
        Token this_COLON_3=null;
        Token this_COMMA_5=null;
        Token otherlv_6=null;
        Token this_COLON_7=null;
        Token this_OPENBRAKET_8=null;
        Token this_COMMA_10=null;
        Token this_CLOSEBRAKET_12=null;
        Token this_CLOSEBRACE_13=null;
        AntlrDatatypeRuleToken lv_name_4_0 = null;

        EObject lv_panoramas_9_0 = null;

        EObject lv_panoramas_11_0 = null;



        	enterRule();

        try {
            // InternalDsl360.g:236:2: ( ( () this_OPENBRACE_1= RULE_OPENBRACE otherlv_2= 'name' this_COLON_3= RULE_COLON ( (lv_name_4_0= ruleEString ) ) this_COMMA_5= RULE_COMMA otherlv_6= 'panoramas' this_COLON_7= RULE_COLON this_OPENBRAKET_8= RULE_OPENBRAKET ( (lv_panoramas_9_0= rulePanorama ) ) (this_COMMA_10= RULE_COMMA ( (lv_panoramas_11_0= rulePanorama ) ) )* this_CLOSEBRAKET_12= RULE_CLOSEBRAKET this_CLOSEBRACE_13= RULE_CLOSEBRACE ) )
            // InternalDsl360.g:237:2: ( () this_OPENBRACE_1= RULE_OPENBRACE otherlv_2= 'name' this_COLON_3= RULE_COLON ( (lv_name_4_0= ruleEString ) ) this_COMMA_5= RULE_COMMA otherlv_6= 'panoramas' this_COLON_7= RULE_COLON this_OPENBRAKET_8= RULE_OPENBRAKET ( (lv_panoramas_9_0= rulePanorama ) ) (this_COMMA_10= RULE_COMMA ( (lv_panoramas_11_0= rulePanorama ) ) )* this_CLOSEBRAKET_12= RULE_CLOSEBRAKET this_CLOSEBRACE_13= RULE_CLOSEBRACE )
            {
            // InternalDsl360.g:237:2: ( () this_OPENBRACE_1= RULE_OPENBRACE otherlv_2= 'name' this_COLON_3= RULE_COLON ( (lv_name_4_0= ruleEString ) ) this_COMMA_5= RULE_COMMA otherlv_6= 'panoramas' this_COLON_7= RULE_COLON this_OPENBRAKET_8= RULE_OPENBRAKET ( (lv_panoramas_9_0= rulePanorama ) ) (this_COMMA_10= RULE_COMMA ( (lv_panoramas_11_0= rulePanorama ) ) )* this_CLOSEBRAKET_12= RULE_CLOSEBRAKET this_CLOSEBRACE_13= RULE_CLOSEBRACE )
            // InternalDsl360.g:238:3: () this_OPENBRACE_1= RULE_OPENBRACE otherlv_2= 'name' this_COLON_3= RULE_COLON ( (lv_name_4_0= ruleEString ) ) this_COMMA_5= RULE_COMMA otherlv_6= 'panoramas' this_COLON_7= RULE_COLON this_OPENBRAKET_8= RULE_OPENBRAKET ( (lv_panoramas_9_0= rulePanorama ) ) (this_COMMA_10= RULE_COMMA ( (lv_panoramas_11_0= rulePanorama ) ) )* this_CLOSEBRAKET_12= RULE_CLOSEBRAKET this_CLOSEBRACE_13= RULE_CLOSEBRACE
            {
            // InternalDsl360.g:238:3: ()
            // InternalDsl360.g:239:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTourAccess().getTourAction_0(),
            					current);
            			

            }

            this_OPENBRACE_1=(Token)match(input,RULE_OPENBRACE,FOLLOW_3); 

            			newLeafNode(this_OPENBRACE_1, grammarAccess.getTourAccess().getOPENBRACETerminalRuleCall_1());
            		
            otherlv_2=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getTourAccess().getNameKeyword_2());
            		
            this_COLON_3=(Token)match(input,RULE_COLON,FOLLOW_5); 

            			newLeafNode(this_COLON_3, grammarAccess.getTourAccess().getCOLONTerminalRuleCall_3());
            		
            // InternalDsl360.g:257:3: ( (lv_name_4_0= ruleEString ) )
            // InternalDsl360.g:258:4: (lv_name_4_0= ruleEString )
            {
            // InternalDsl360.g:258:4: (lv_name_4_0= ruleEString )
            // InternalDsl360.g:259:5: lv_name_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTourAccess().getNameEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_6);
            lv_name_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTourRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_4_0,
            						"co.betinrubio.Dsl360.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_COMMA_5=(Token)match(input,RULE_COMMA,FOLLOW_12); 

            			newLeafNode(this_COMMA_5, grammarAccess.getTourAccess().getCOMMATerminalRuleCall_5());
            		
            otherlv_6=(Token)match(input,20,FOLLOW_4); 

            			newLeafNode(otherlv_6, grammarAccess.getTourAccess().getPanoramasKeyword_6());
            		
            this_COLON_7=(Token)match(input,RULE_COLON,FOLLOW_8); 

            			newLeafNode(this_COLON_7, grammarAccess.getTourAccess().getCOLONTerminalRuleCall_7());
            		
            this_OPENBRAKET_8=(Token)match(input,RULE_OPENBRAKET,FOLLOW_9); 

            			newLeafNode(this_OPENBRAKET_8, grammarAccess.getTourAccess().getOPENBRAKETTerminalRuleCall_8());
            		
            // InternalDsl360.g:292:3: ( (lv_panoramas_9_0= rulePanorama ) )
            // InternalDsl360.g:293:4: (lv_panoramas_9_0= rulePanorama )
            {
            // InternalDsl360.g:293:4: (lv_panoramas_9_0= rulePanorama )
            // InternalDsl360.g:294:5: lv_panoramas_9_0= rulePanorama
            {

            					newCompositeNode(grammarAccess.getTourAccess().getPanoramasPanoramaParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_10);
            lv_panoramas_9_0=rulePanorama();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTourRule());
            					}
            					add(
            						current,
            						"panoramas",
            						lv_panoramas_9_0,
            						"co.betinrubio.Dsl360.Panorama");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDsl360.g:311:3: (this_COMMA_10= RULE_COMMA ( (lv_panoramas_11_0= rulePanorama ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_COMMA) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalDsl360.g:312:4: this_COMMA_10= RULE_COMMA ( (lv_panoramas_11_0= rulePanorama ) )
            	    {
            	    this_COMMA_10=(Token)match(input,RULE_COMMA,FOLLOW_9); 

            	    				newLeafNode(this_COMMA_10, grammarAccess.getTourAccess().getCOMMATerminalRuleCall_10_0());
            	    			
            	    // InternalDsl360.g:316:4: ( (lv_panoramas_11_0= rulePanorama ) )
            	    // InternalDsl360.g:317:5: (lv_panoramas_11_0= rulePanorama )
            	    {
            	    // InternalDsl360.g:317:5: (lv_panoramas_11_0= rulePanorama )
            	    // InternalDsl360.g:318:6: lv_panoramas_11_0= rulePanorama
            	    {

            	    						newCompositeNode(grammarAccess.getTourAccess().getPanoramasPanoramaParserRuleCall_10_1_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    lv_panoramas_11_0=rulePanorama();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getTourRule());
            	    						}
            	    						add(
            	    							current,
            	    							"panoramas",
            	    							lv_panoramas_11_0,
            	    							"co.betinrubio.Dsl360.Panorama");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            this_CLOSEBRAKET_12=(Token)match(input,RULE_CLOSEBRAKET,FOLLOW_11); 

            			newLeafNode(this_CLOSEBRAKET_12, grammarAccess.getTourAccess().getCLOSEBRAKETTerminalRuleCall_11());
            		
            this_CLOSEBRACE_13=(Token)match(input,RULE_CLOSEBRACE,FOLLOW_2); 

            			newLeafNode(this_CLOSEBRACE_13, grammarAccess.getTourAccess().getCLOSEBRACETerminalRuleCall_12());
            		

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
    // $ANTLR end "ruleTour"


    // $ANTLR start "entryRulePanorama"
    // InternalDsl360.g:348:1: entryRulePanorama returns [EObject current=null] : iv_rulePanorama= rulePanorama EOF ;
    public final EObject entryRulePanorama() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePanorama = null;


        try {
            // InternalDsl360.g:348:49: (iv_rulePanorama= rulePanorama EOF )
            // InternalDsl360.g:349:2: iv_rulePanorama= rulePanorama EOF
            {
             newCompositeNode(grammarAccess.getPanoramaRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePanorama=rulePanorama();

            state._fsp--;

             current =iv_rulePanorama; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePanorama"


    // $ANTLR start "rulePanorama"
    // InternalDsl360.g:355:1: rulePanorama returns [EObject current=null] : ( () this_OPENBRACE_1= RULE_OPENBRACE otherlv_2= 'name' this_COLON_3= RULE_COLON ( (lv_name_4_0= ruleEString ) ) this_COMMA_5= RULE_COMMA (otherlv_6= 'image' this_COLON_7= RULE_COLON ( (lv_imagen_8_0= ruleEString ) ) this_COMMA_9= RULE_COMMA )? otherlv_10= 'hotspots' this_COLON_11= RULE_COLON this_OPENBRAKET_12= RULE_OPENBRAKET ( (lv_hotspots_13_0= ruleHotspot ) ) (this_COMMA_14= RULE_COMMA ( (lv_hotspots_15_0= ruleHotspot ) ) )* this_CLOSEBRAKET_16= RULE_CLOSEBRAKET this_CLOSEBRACE_17= RULE_CLOSEBRACE ) ;
    public final EObject rulePanorama() throws RecognitionException {
        EObject current = null;

        Token this_OPENBRACE_1=null;
        Token otherlv_2=null;
        Token this_COLON_3=null;
        Token this_COMMA_5=null;
        Token otherlv_6=null;
        Token this_COLON_7=null;
        Token this_COMMA_9=null;
        Token otherlv_10=null;
        Token this_COLON_11=null;
        Token this_OPENBRAKET_12=null;
        Token this_COMMA_14=null;
        Token this_CLOSEBRAKET_16=null;
        Token this_CLOSEBRACE_17=null;
        AntlrDatatypeRuleToken lv_name_4_0 = null;

        AntlrDatatypeRuleToken lv_imagen_8_0 = null;

        EObject lv_hotspots_13_0 = null;

        EObject lv_hotspots_15_0 = null;



        	enterRule();

        try {
            // InternalDsl360.g:361:2: ( ( () this_OPENBRACE_1= RULE_OPENBRACE otherlv_2= 'name' this_COLON_3= RULE_COLON ( (lv_name_4_0= ruleEString ) ) this_COMMA_5= RULE_COMMA (otherlv_6= 'image' this_COLON_7= RULE_COLON ( (lv_imagen_8_0= ruleEString ) ) this_COMMA_9= RULE_COMMA )? otherlv_10= 'hotspots' this_COLON_11= RULE_COLON this_OPENBRAKET_12= RULE_OPENBRAKET ( (lv_hotspots_13_0= ruleHotspot ) ) (this_COMMA_14= RULE_COMMA ( (lv_hotspots_15_0= ruleHotspot ) ) )* this_CLOSEBRAKET_16= RULE_CLOSEBRAKET this_CLOSEBRACE_17= RULE_CLOSEBRACE ) )
            // InternalDsl360.g:362:2: ( () this_OPENBRACE_1= RULE_OPENBRACE otherlv_2= 'name' this_COLON_3= RULE_COLON ( (lv_name_4_0= ruleEString ) ) this_COMMA_5= RULE_COMMA (otherlv_6= 'image' this_COLON_7= RULE_COLON ( (lv_imagen_8_0= ruleEString ) ) this_COMMA_9= RULE_COMMA )? otherlv_10= 'hotspots' this_COLON_11= RULE_COLON this_OPENBRAKET_12= RULE_OPENBRAKET ( (lv_hotspots_13_0= ruleHotspot ) ) (this_COMMA_14= RULE_COMMA ( (lv_hotspots_15_0= ruleHotspot ) ) )* this_CLOSEBRAKET_16= RULE_CLOSEBRAKET this_CLOSEBRACE_17= RULE_CLOSEBRACE )
            {
            // InternalDsl360.g:362:2: ( () this_OPENBRACE_1= RULE_OPENBRACE otherlv_2= 'name' this_COLON_3= RULE_COLON ( (lv_name_4_0= ruleEString ) ) this_COMMA_5= RULE_COMMA (otherlv_6= 'image' this_COLON_7= RULE_COLON ( (lv_imagen_8_0= ruleEString ) ) this_COMMA_9= RULE_COMMA )? otherlv_10= 'hotspots' this_COLON_11= RULE_COLON this_OPENBRAKET_12= RULE_OPENBRAKET ( (lv_hotspots_13_0= ruleHotspot ) ) (this_COMMA_14= RULE_COMMA ( (lv_hotspots_15_0= ruleHotspot ) ) )* this_CLOSEBRAKET_16= RULE_CLOSEBRAKET this_CLOSEBRACE_17= RULE_CLOSEBRACE )
            // InternalDsl360.g:363:3: () this_OPENBRACE_1= RULE_OPENBRACE otherlv_2= 'name' this_COLON_3= RULE_COLON ( (lv_name_4_0= ruleEString ) ) this_COMMA_5= RULE_COMMA (otherlv_6= 'image' this_COLON_7= RULE_COLON ( (lv_imagen_8_0= ruleEString ) ) this_COMMA_9= RULE_COMMA )? otherlv_10= 'hotspots' this_COLON_11= RULE_COLON this_OPENBRAKET_12= RULE_OPENBRAKET ( (lv_hotspots_13_0= ruleHotspot ) ) (this_COMMA_14= RULE_COMMA ( (lv_hotspots_15_0= ruleHotspot ) ) )* this_CLOSEBRAKET_16= RULE_CLOSEBRAKET this_CLOSEBRACE_17= RULE_CLOSEBRACE
            {
            // InternalDsl360.g:363:3: ()
            // InternalDsl360.g:364:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPanoramaAccess().getPanoramaAction_0(),
            					current);
            			

            }

            this_OPENBRACE_1=(Token)match(input,RULE_OPENBRACE,FOLLOW_3); 

            			newLeafNode(this_OPENBRACE_1, grammarAccess.getPanoramaAccess().getOPENBRACETerminalRuleCall_1());
            		
            otherlv_2=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getPanoramaAccess().getNameKeyword_2());
            		
            this_COLON_3=(Token)match(input,RULE_COLON,FOLLOW_5); 

            			newLeafNode(this_COLON_3, grammarAccess.getPanoramaAccess().getCOLONTerminalRuleCall_3());
            		
            // InternalDsl360.g:382:3: ( (lv_name_4_0= ruleEString ) )
            // InternalDsl360.g:383:4: (lv_name_4_0= ruleEString )
            {
            // InternalDsl360.g:383:4: (lv_name_4_0= ruleEString )
            // InternalDsl360.g:384:5: lv_name_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPanoramaAccess().getNameEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_6);
            lv_name_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPanoramaRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_4_0,
            						"co.betinrubio.Dsl360.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_COMMA_5=(Token)match(input,RULE_COMMA,FOLLOW_13); 

            			newLeafNode(this_COMMA_5, grammarAccess.getPanoramaAccess().getCOMMATerminalRuleCall_5());
            		
            // InternalDsl360.g:405:3: (otherlv_6= 'image' this_COLON_7= RULE_COLON ( (lv_imagen_8_0= ruleEString ) ) this_COMMA_9= RULE_COMMA )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==21) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalDsl360.g:406:4: otherlv_6= 'image' this_COLON_7= RULE_COLON ( (lv_imagen_8_0= ruleEString ) ) this_COMMA_9= RULE_COMMA
                    {
                    otherlv_6=(Token)match(input,21,FOLLOW_4); 

                    				newLeafNode(otherlv_6, grammarAccess.getPanoramaAccess().getImageKeyword_6_0());
                    			
                    this_COLON_7=(Token)match(input,RULE_COLON,FOLLOW_5); 

                    				newLeafNode(this_COLON_7, grammarAccess.getPanoramaAccess().getCOLONTerminalRuleCall_6_1());
                    			
                    // InternalDsl360.g:414:4: ( (lv_imagen_8_0= ruleEString ) )
                    // InternalDsl360.g:415:5: (lv_imagen_8_0= ruleEString )
                    {
                    // InternalDsl360.g:415:5: (lv_imagen_8_0= ruleEString )
                    // InternalDsl360.g:416:6: lv_imagen_8_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getPanoramaAccess().getImagenEStringParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_imagen_8_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPanoramaRule());
                    						}
                    						set(
                    							current,
                    							"imagen",
                    							lv_imagen_8_0,
                    							"co.betinrubio.Dsl360.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    this_COMMA_9=(Token)match(input,RULE_COMMA,FOLLOW_14); 

                    				newLeafNode(this_COMMA_9, grammarAccess.getPanoramaAccess().getCOMMATerminalRuleCall_6_3());
                    			

                    }
                    break;

            }

            otherlv_10=(Token)match(input,22,FOLLOW_4); 

            			newLeafNode(otherlv_10, grammarAccess.getPanoramaAccess().getHotspotsKeyword_7());
            		
            this_COLON_11=(Token)match(input,RULE_COLON,FOLLOW_8); 

            			newLeafNode(this_COLON_11, grammarAccess.getPanoramaAccess().getCOLONTerminalRuleCall_8());
            		
            this_OPENBRAKET_12=(Token)match(input,RULE_OPENBRAKET,FOLLOW_9); 

            			newLeafNode(this_OPENBRAKET_12, grammarAccess.getPanoramaAccess().getOPENBRAKETTerminalRuleCall_9());
            		
            // InternalDsl360.g:450:3: ( (lv_hotspots_13_0= ruleHotspot ) )
            // InternalDsl360.g:451:4: (lv_hotspots_13_0= ruleHotspot )
            {
            // InternalDsl360.g:451:4: (lv_hotspots_13_0= ruleHotspot )
            // InternalDsl360.g:452:5: lv_hotspots_13_0= ruleHotspot
            {

            					newCompositeNode(grammarAccess.getPanoramaAccess().getHotspotsHotspotParserRuleCall_10_0());
            				
            pushFollow(FOLLOW_10);
            lv_hotspots_13_0=ruleHotspot();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPanoramaRule());
            					}
            					add(
            						current,
            						"hotspots",
            						lv_hotspots_13_0,
            						"co.betinrubio.Dsl360.Hotspot");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDsl360.g:469:3: (this_COMMA_14= RULE_COMMA ( (lv_hotspots_15_0= ruleHotspot ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_COMMA) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalDsl360.g:470:4: this_COMMA_14= RULE_COMMA ( (lv_hotspots_15_0= ruleHotspot ) )
            	    {
            	    this_COMMA_14=(Token)match(input,RULE_COMMA,FOLLOW_9); 

            	    				newLeafNode(this_COMMA_14, grammarAccess.getPanoramaAccess().getCOMMATerminalRuleCall_11_0());
            	    			
            	    // InternalDsl360.g:474:4: ( (lv_hotspots_15_0= ruleHotspot ) )
            	    // InternalDsl360.g:475:5: (lv_hotspots_15_0= ruleHotspot )
            	    {
            	    // InternalDsl360.g:475:5: (lv_hotspots_15_0= ruleHotspot )
            	    // InternalDsl360.g:476:6: lv_hotspots_15_0= ruleHotspot
            	    {

            	    						newCompositeNode(grammarAccess.getPanoramaAccess().getHotspotsHotspotParserRuleCall_11_1_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    lv_hotspots_15_0=ruleHotspot();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getPanoramaRule());
            	    						}
            	    						add(
            	    							current,
            	    							"hotspots",
            	    							lv_hotspots_15_0,
            	    							"co.betinrubio.Dsl360.Hotspot");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            this_CLOSEBRAKET_16=(Token)match(input,RULE_CLOSEBRAKET,FOLLOW_11); 

            			newLeafNode(this_CLOSEBRAKET_16, grammarAccess.getPanoramaAccess().getCLOSEBRAKETTerminalRuleCall_12());
            		
            this_CLOSEBRACE_17=(Token)match(input,RULE_CLOSEBRACE,FOLLOW_2); 

            			newLeafNode(this_CLOSEBRACE_17, grammarAccess.getPanoramaAccess().getCLOSEBRACETerminalRuleCall_13());
            		

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
    // $ANTLR end "rulePanorama"


    // $ANTLR start "entryRuleHotspot"
    // InternalDsl360.g:506:1: entryRuleHotspot returns [EObject current=null] : iv_ruleHotspot= ruleHotspot EOF ;
    public final EObject entryRuleHotspot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHotspot = null;


        try {
            // InternalDsl360.g:506:48: (iv_ruleHotspot= ruleHotspot EOF )
            // InternalDsl360.g:507:2: iv_ruleHotspot= ruleHotspot EOF
            {
             newCompositeNode(grammarAccess.getHotspotRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHotspot=ruleHotspot();

            state._fsp--;

             current =iv_ruleHotspot; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleHotspot"


    // $ANTLR start "ruleHotspot"
    // InternalDsl360.g:513:1: ruleHotspot returns [EObject current=null] : ( () this_OPENBRACE_1= RULE_OPENBRACE otherlv_2= 'name' this_COLON_3= RULE_COLON ( (lv_name_4_0= ruleEString ) ) this_COMMA_5= RULE_COMMA otherlv_6= 'to' this_COLON_7= RULE_COLON ( ( ruleEString ) ) this_COMMA_9= RULE_COMMA otherlv_10= 'position' this_COLON_11= RULE_COLON ( (lv_posicion_12_0= rulePosicion ) ) this_COMMA_13= RULE_COMMA otherlv_14= 'rotation' this_COLON_15= RULE_COLON ( (lv_rotacion_16_0= ruleRotacion ) ) this_CLOSEBRACE_17= RULE_CLOSEBRACE ) ;
    public final EObject ruleHotspot() throws RecognitionException {
        EObject current = null;

        Token this_OPENBRACE_1=null;
        Token otherlv_2=null;
        Token this_COLON_3=null;
        Token this_COMMA_5=null;
        Token otherlv_6=null;
        Token this_COLON_7=null;
        Token this_COMMA_9=null;
        Token otherlv_10=null;
        Token this_COLON_11=null;
        Token this_COMMA_13=null;
        Token otherlv_14=null;
        Token this_COLON_15=null;
        Token this_CLOSEBRACE_17=null;
        AntlrDatatypeRuleToken lv_name_4_0 = null;

        EObject lv_posicion_12_0 = null;

        EObject lv_rotacion_16_0 = null;



        	enterRule();

        try {
            // InternalDsl360.g:519:2: ( ( () this_OPENBRACE_1= RULE_OPENBRACE otherlv_2= 'name' this_COLON_3= RULE_COLON ( (lv_name_4_0= ruleEString ) ) this_COMMA_5= RULE_COMMA otherlv_6= 'to' this_COLON_7= RULE_COLON ( ( ruleEString ) ) this_COMMA_9= RULE_COMMA otherlv_10= 'position' this_COLON_11= RULE_COLON ( (lv_posicion_12_0= rulePosicion ) ) this_COMMA_13= RULE_COMMA otherlv_14= 'rotation' this_COLON_15= RULE_COLON ( (lv_rotacion_16_0= ruleRotacion ) ) this_CLOSEBRACE_17= RULE_CLOSEBRACE ) )
            // InternalDsl360.g:520:2: ( () this_OPENBRACE_1= RULE_OPENBRACE otherlv_2= 'name' this_COLON_3= RULE_COLON ( (lv_name_4_0= ruleEString ) ) this_COMMA_5= RULE_COMMA otherlv_6= 'to' this_COLON_7= RULE_COLON ( ( ruleEString ) ) this_COMMA_9= RULE_COMMA otherlv_10= 'position' this_COLON_11= RULE_COLON ( (lv_posicion_12_0= rulePosicion ) ) this_COMMA_13= RULE_COMMA otherlv_14= 'rotation' this_COLON_15= RULE_COLON ( (lv_rotacion_16_0= ruleRotacion ) ) this_CLOSEBRACE_17= RULE_CLOSEBRACE )
            {
            // InternalDsl360.g:520:2: ( () this_OPENBRACE_1= RULE_OPENBRACE otherlv_2= 'name' this_COLON_3= RULE_COLON ( (lv_name_4_0= ruleEString ) ) this_COMMA_5= RULE_COMMA otherlv_6= 'to' this_COLON_7= RULE_COLON ( ( ruleEString ) ) this_COMMA_9= RULE_COMMA otherlv_10= 'position' this_COLON_11= RULE_COLON ( (lv_posicion_12_0= rulePosicion ) ) this_COMMA_13= RULE_COMMA otherlv_14= 'rotation' this_COLON_15= RULE_COLON ( (lv_rotacion_16_0= ruleRotacion ) ) this_CLOSEBRACE_17= RULE_CLOSEBRACE )
            // InternalDsl360.g:521:3: () this_OPENBRACE_1= RULE_OPENBRACE otherlv_2= 'name' this_COLON_3= RULE_COLON ( (lv_name_4_0= ruleEString ) ) this_COMMA_5= RULE_COMMA otherlv_6= 'to' this_COLON_7= RULE_COLON ( ( ruleEString ) ) this_COMMA_9= RULE_COMMA otherlv_10= 'position' this_COLON_11= RULE_COLON ( (lv_posicion_12_0= rulePosicion ) ) this_COMMA_13= RULE_COMMA otherlv_14= 'rotation' this_COLON_15= RULE_COLON ( (lv_rotacion_16_0= ruleRotacion ) ) this_CLOSEBRACE_17= RULE_CLOSEBRACE
            {
            // InternalDsl360.g:521:3: ()
            // InternalDsl360.g:522:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getHotspotAccess().getHotspotAction_0(),
            					current);
            			

            }

            this_OPENBRACE_1=(Token)match(input,RULE_OPENBRACE,FOLLOW_3); 

            			newLeafNode(this_OPENBRACE_1, grammarAccess.getHotspotAccess().getOPENBRACETerminalRuleCall_1());
            		
            otherlv_2=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getHotspotAccess().getNameKeyword_2());
            		
            this_COLON_3=(Token)match(input,RULE_COLON,FOLLOW_5); 

            			newLeafNode(this_COLON_3, grammarAccess.getHotspotAccess().getCOLONTerminalRuleCall_3());
            		
            // InternalDsl360.g:540:3: ( (lv_name_4_0= ruleEString ) )
            // InternalDsl360.g:541:4: (lv_name_4_0= ruleEString )
            {
            // InternalDsl360.g:541:4: (lv_name_4_0= ruleEString )
            // InternalDsl360.g:542:5: lv_name_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getHotspotAccess().getNameEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_6);
            lv_name_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getHotspotRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_4_0,
            						"co.betinrubio.Dsl360.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_COMMA_5=(Token)match(input,RULE_COMMA,FOLLOW_15); 

            			newLeafNode(this_COMMA_5, grammarAccess.getHotspotAccess().getCOMMATerminalRuleCall_5());
            		
            otherlv_6=(Token)match(input,23,FOLLOW_4); 

            			newLeafNode(otherlv_6, grammarAccess.getHotspotAccess().getToKeyword_6());
            		
            this_COLON_7=(Token)match(input,RULE_COLON,FOLLOW_5); 

            			newLeafNode(this_COLON_7, grammarAccess.getHotspotAccess().getCOLONTerminalRuleCall_7());
            		
            // InternalDsl360.g:571:3: ( ( ruleEString ) )
            // InternalDsl360.g:572:4: ( ruleEString )
            {
            // InternalDsl360.g:572:4: ( ruleEString )
            // InternalDsl360.g:573:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getHotspotRule());
            					}
            				

            					newCompositeNode(grammarAccess.getHotspotAccess().getDestinoPanoramaCrossReference_8_0());
            				
            pushFollow(FOLLOW_6);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_COMMA_9=(Token)match(input,RULE_COMMA,FOLLOW_16); 

            			newLeafNode(this_COMMA_9, grammarAccess.getHotspotAccess().getCOMMATerminalRuleCall_9());
            		
            otherlv_10=(Token)match(input,24,FOLLOW_4); 

            			newLeafNode(otherlv_10, grammarAccess.getHotspotAccess().getPositionKeyword_10());
            		
            this_COLON_11=(Token)match(input,RULE_COLON,FOLLOW_9); 

            			newLeafNode(this_COLON_11, grammarAccess.getHotspotAccess().getCOLONTerminalRuleCall_11());
            		
            // InternalDsl360.g:599:3: ( (lv_posicion_12_0= rulePosicion ) )
            // InternalDsl360.g:600:4: (lv_posicion_12_0= rulePosicion )
            {
            // InternalDsl360.g:600:4: (lv_posicion_12_0= rulePosicion )
            // InternalDsl360.g:601:5: lv_posicion_12_0= rulePosicion
            {

            					newCompositeNode(grammarAccess.getHotspotAccess().getPosicionPosicionParserRuleCall_12_0());
            				
            pushFollow(FOLLOW_6);
            lv_posicion_12_0=rulePosicion();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getHotspotRule());
            					}
            					set(
            						current,
            						"posicion",
            						lv_posicion_12_0,
            						"co.betinrubio.Dsl360.Posicion");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_COMMA_13=(Token)match(input,RULE_COMMA,FOLLOW_17); 

            			newLeafNode(this_COMMA_13, grammarAccess.getHotspotAccess().getCOMMATerminalRuleCall_13());
            		
            otherlv_14=(Token)match(input,25,FOLLOW_4); 

            			newLeafNode(otherlv_14, grammarAccess.getHotspotAccess().getRotationKeyword_14());
            		
            this_COLON_15=(Token)match(input,RULE_COLON,FOLLOW_9); 

            			newLeafNode(this_COLON_15, grammarAccess.getHotspotAccess().getCOLONTerminalRuleCall_15());
            		
            // InternalDsl360.g:630:3: ( (lv_rotacion_16_0= ruleRotacion ) )
            // InternalDsl360.g:631:4: (lv_rotacion_16_0= ruleRotacion )
            {
            // InternalDsl360.g:631:4: (lv_rotacion_16_0= ruleRotacion )
            // InternalDsl360.g:632:5: lv_rotacion_16_0= ruleRotacion
            {

            					newCompositeNode(grammarAccess.getHotspotAccess().getRotacionRotacionParserRuleCall_16_0());
            				
            pushFollow(FOLLOW_11);
            lv_rotacion_16_0=ruleRotacion();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getHotspotRule());
            					}
            					set(
            						current,
            						"rotacion",
            						lv_rotacion_16_0,
            						"co.betinrubio.Dsl360.Rotacion");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_CLOSEBRACE_17=(Token)match(input,RULE_CLOSEBRACE,FOLLOW_2); 

            			newLeafNode(this_CLOSEBRACE_17, grammarAccess.getHotspotAccess().getCLOSEBRACETerminalRuleCall_17());
            		

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
    // $ANTLR end "ruleHotspot"


    // $ANTLR start "entryRulePosicion"
    // InternalDsl360.g:657:1: entryRulePosicion returns [EObject current=null] : iv_rulePosicion= rulePosicion EOF ;
    public final EObject entryRulePosicion() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePosicion = null;


        try {
            // InternalDsl360.g:657:49: (iv_rulePosicion= rulePosicion EOF )
            // InternalDsl360.g:658:2: iv_rulePosicion= rulePosicion EOF
            {
             newCompositeNode(grammarAccess.getPosicionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePosicion=rulePosicion();

            state._fsp--;

             current =iv_rulePosicion; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePosicion"


    // $ANTLR start "rulePosicion"
    // InternalDsl360.g:664:1: rulePosicion returns [EObject current=null] : ( () this_OPENBRACE_1= RULE_OPENBRACE otherlv_2= 'posx' this_COLON_3= RULE_COLON ( (lv_x_4_0= ruleEDouble ) ) this_COMMA_5= RULE_COMMA otherlv_6= 'posy' this_COLON_7= RULE_COLON ( (lv_y_8_0= ruleEDouble ) ) this_COMMA_9= RULE_COMMA otherlv_10= 'posz' this_COLON_11= RULE_COLON ( (lv_z_12_0= ruleEDouble ) ) this_CLOSEBRACE_13= RULE_CLOSEBRACE ) ;
    public final EObject rulePosicion() throws RecognitionException {
        EObject current = null;

        Token this_OPENBRACE_1=null;
        Token otherlv_2=null;
        Token this_COLON_3=null;
        Token this_COMMA_5=null;
        Token otherlv_6=null;
        Token this_COLON_7=null;
        Token this_COMMA_9=null;
        Token otherlv_10=null;
        Token this_COLON_11=null;
        Token this_CLOSEBRACE_13=null;
        AntlrDatatypeRuleToken lv_x_4_0 = null;

        AntlrDatatypeRuleToken lv_y_8_0 = null;

        AntlrDatatypeRuleToken lv_z_12_0 = null;



        	enterRule();

        try {
            // InternalDsl360.g:670:2: ( ( () this_OPENBRACE_1= RULE_OPENBRACE otherlv_2= 'posx' this_COLON_3= RULE_COLON ( (lv_x_4_0= ruleEDouble ) ) this_COMMA_5= RULE_COMMA otherlv_6= 'posy' this_COLON_7= RULE_COLON ( (lv_y_8_0= ruleEDouble ) ) this_COMMA_9= RULE_COMMA otherlv_10= 'posz' this_COLON_11= RULE_COLON ( (lv_z_12_0= ruleEDouble ) ) this_CLOSEBRACE_13= RULE_CLOSEBRACE ) )
            // InternalDsl360.g:671:2: ( () this_OPENBRACE_1= RULE_OPENBRACE otherlv_2= 'posx' this_COLON_3= RULE_COLON ( (lv_x_4_0= ruleEDouble ) ) this_COMMA_5= RULE_COMMA otherlv_6= 'posy' this_COLON_7= RULE_COLON ( (lv_y_8_0= ruleEDouble ) ) this_COMMA_9= RULE_COMMA otherlv_10= 'posz' this_COLON_11= RULE_COLON ( (lv_z_12_0= ruleEDouble ) ) this_CLOSEBRACE_13= RULE_CLOSEBRACE )
            {
            // InternalDsl360.g:671:2: ( () this_OPENBRACE_1= RULE_OPENBRACE otherlv_2= 'posx' this_COLON_3= RULE_COLON ( (lv_x_4_0= ruleEDouble ) ) this_COMMA_5= RULE_COMMA otherlv_6= 'posy' this_COLON_7= RULE_COLON ( (lv_y_8_0= ruleEDouble ) ) this_COMMA_9= RULE_COMMA otherlv_10= 'posz' this_COLON_11= RULE_COLON ( (lv_z_12_0= ruleEDouble ) ) this_CLOSEBRACE_13= RULE_CLOSEBRACE )
            // InternalDsl360.g:672:3: () this_OPENBRACE_1= RULE_OPENBRACE otherlv_2= 'posx' this_COLON_3= RULE_COLON ( (lv_x_4_0= ruleEDouble ) ) this_COMMA_5= RULE_COMMA otherlv_6= 'posy' this_COLON_7= RULE_COLON ( (lv_y_8_0= ruleEDouble ) ) this_COMMA_9= RULE_COMMA otherlv_10= 'posz' this_COLON_11= RULE_COLON ( (lv_z_12_0= ruleEDouble ) ) this_CLOSEBRACE_13= RULE_CLOSEBRACE
            {
            // InternalDsl360.g:672:3: ()
            // InternalDsl360.g:673:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPosicionAccess().getPosicionAction_0(),
            					current);
            			

            }

            this_OPENBRACE_1=(Token)match(input,RULE_OPENBRACE,FOLLOW_18); 

            			newLeafNode(this_OPENBRACE_1, grammarAccess.getPosicionAccess().getOPENBRACETerminalRuleCall_1());
            		
            otherlv_2=(Token)match(input,26,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getPosicionAccess().getPosxKeyword_2());
            		
            this_COLON_3=(Token)match(input,RULE_COLON,FOLLOW_19); 

            			newLeafNode(this_COLON_3, grammarAccess.getPosicionAccess().getCOLONTerminalRuleCall_3());
            		
            // InternalDsl360.g:691:3: ( (lv_x_4_0= ruleEDouble ) )
            // InternalDsl360.g:692:4: (lv_x_4_0= ruleEDouble )
            {
            // InternalDsl360.g:692:4: (lv_x_4_0= ruleEDouble )
            // InternalDsl360.g:693:5: lv_x_4_0= ruleEDouble
            {

            					newCompositeNode(grammarAccess.getPosicionAccess().getXEDoubleParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_6);
            lv_x_4_0=ruleEDouble();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPosicionRule());
            					}
            					set(
            						current,
            						"x",
            						lv_x_4_0,
            						"co.betinrubio.Dsl360.EDouble");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_COMMA_5=(Token)match(input,RULE_COMMA,FOLLOW_20); 

            			newLeafNode(this_COMMA_5, grammarAccess.getPosicionAccess().getCOMMATerminalRuleCall_5());
            		
            otherlv_6=(Token)match(input,27,FOLLOW_4); 

            			newLeafNode(otherlv_6, grammarAccess.getPosicionAccess().getPosyKeyword_6());
            		
            this_COLON_7=(Token)match(input,RULE_COLON,FOLLOW_19); 

            			newLeafNode(this_COLON_7, grammarAccess.getPosicionAccess().getCOLONTerminalRuleCall_7());
            		
            // InternalDsl360.g:722:3: ( (lv_y_8_0= ruleEDouble ) )
            // InternalDsl360.g:723:4: (lv_y_8_0= ruleEDouble )
            {
            // InternalDsl360.g:723:4: (lv_y_8_0= ruleEDouble )
            // InternalDsl360.g:724:5: lv_y_8_0= ruleEDouble
            {

            					newCompositeNode(grammarAccess.getPosicionAccess().getYEDoubleParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_6);
            lv_y_8_0=ruleEDouble();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPosicionRule());
            					}
            					set(
            						current,
            						"y",
            						lv_y_8_0,
            						"co.betinrubio.Dsl360.EDouble");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_COMMA_9=(Token)match(input,RULE_COMMA,FOLLOW_21); 

            			newLeafNode(this_COMMA_9, grammarAccess.getPosicionAccess().getCOMMATerminalRuleCall_9());
            		
            otherlv_10=(Token)match(input,28,FOLLOW_4); 

            			newLeafNode(otherlv_10, grammarAccess.getPosicionAccess().getPoszKeyword_10());
            		
            this_COLON_11=(Token)match(input,RULE_COLON,FOLLOW_19); 

            			newLeafNode(this_COLON_11, grammarAccess.getPosicionAccess().getCOLONTerminalRuleCall_11());
            		
            // InternalDsl360.g:753:3: ( (lv_z_12_0= ruleEDouble ) )
            // InternalDsl360.g:754:4: (lv_z_12_0= ruleEDouble )
            {
            // InternalDsl360.g:754:4: (lv_z_12_0= ruleEDouble )
            // InternalDsl360.g:755:5: lv_z_12_0= ruleEDouble
            {

            					newCompositeNode(grammarAccess.getPosicionAccess().getZEDoubleParserRuleCall_12_0());
            				
            pushFollow(FOLLOW_11);
            lv_z_12_0=ruleEDouble();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPosicionRule());
            					}
            					set(
            						current,
            						"z",
            						lv_z_12_0,
            						"co.betinrubio.Dsl360.EDouble");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_CLOSEBRACE_13=(Token)match(input,RULE_CLOSEBRACE,FOLLOW_2); 

            			newLeafNode(this_CLOSEBRACE_13, grammarAccess.getPosicionAccess().getCLOSEBRACETerminalRuleCall_13());
            		

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
    // $ANTLR end "rulePosicion"


    // $ANTLR start "entryRuleRotacion"
    // InternalDsl360.g:780:1: entryRuleRotacion returns [EObject current=null] : iv_ruleRotacion= ruleRotacion EOF ;
    public final EObject entryRuleRotacion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRotacion = null;


        try {
            // InternalDsl360.g:780:49: (iv_ruleRotacion= ruleRotacion EOF )
            // InternalDsl360.g:781:2: iv_ruleRotacion= ruleRotacion EOF
            {
             newCompositeNode(grammarAccess.getRotacionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRotacion=ruleRotacion();

            state._fsp--;

             current =iv_ruleRotacion; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleRotacion"


    // $ANTLR start "ruleRotacion"
    // InternalDsl360.g:787:1: ruleRotacion returns [EObject current=null] : ( () this_OPENBRACE_1= RULE_OPENBRACE otherlv_2= 'rotx' this_COLON_3= RULE_COLON ( (lv_x_4_0= ruleEDouble ) ) this_COMMA_5= RULE_COMMA otherlv_6= 'roty' this_COLON_7= RULE_COLON ( (lv_y_8_0= ruleEDouble ) ) this_COMMA_9= RULE_COMMA otherlv_10= 'rotz' this_COLON_11= RULE_COLON ( (lv_z_12_0= ruleEDouble ) ) this_CLOSEBRACE_13= RULE_CLOSEBRACE ) ;
    public final EObject ruleRotacion() throws RecognitionException {
        EObject current = null;

        Token this_OPENBRACE_1=null;
        Token otherlv_2=null;
        Token this_COLON_3=null;
        Token this_COMMA_5=null;
        Token otherlv_6=null;
        Token this_COLON_7=null;
        Token this_COMMA_9=null;
        Token otherlv_10=null;
        Token this_COLON_11=null;
        Token this_CLOSEBRACE_13=null;
        AntlrDatatypeRuleToken lv_x_4_0 = null;

        AntlrDatatypeRuleToken lv_y_8_0 = null;

        AntlrDatatypeRuleToken lv_z_12_0 = null;



        	enterRule();

        try {
            // InternalDsl360.g:793:2: ( ( () this_OPENBRACE_1= RULE_OPENBRACE otherlv_2= 'rotx' this_COLON_3= RULE_COLON ( (lv_x_4_0= ruleEDouble ) ) this_COMMA_5= RULE_COMMA otherlv_6= 'roty' this_COLON_7= RULE_COLON ( (lv_y_8_0= ruleEDouble ) ) this_COMMA_9= RULE_COMMA otherlv_10= 'rotz' this_COLON_11= RULE_COLON ( (lv_z_12_0= ruleEDouble ) ) this_CLOSEBRACE_13= RULE_CLOSEBRACE ) )
            // InternalDsl360.g:794:2: ( () this_OPENBRACE_1= RULE_OPENBRACE otherlv_2= 'rotx' this_COLON_3= RULE_COLON ( (lv_x_4_0= ruleEDouble ) ) this_COMMA_5= RULE_COMMA otherlv_6= 'roty' this_COLON_7= RULE_COLON ( (lv_y_8_0= ruleEDouble ) ) this_COMMA_9= RULE_COMMA otherlv_10= 'rotz' this_COLON_11= RULE_COLON ( (lv_z_12_0= ruleEDouble ) ) this_CLOSEBRACE_13= RULE_CLOSEBRACE )
            {
            // InternalDsl360.g:794:2: ( () this_OPENBRACE_1= RULE_OPENBRACE otherlv_2= 'rotx' this_COLON_3= RULE_COLON ( (lv_x_4_0= ruleEDouble ) ) this_COMMA_5= RULE_COMMA otherlv_6= 'roty' this_COLON_7= RULE_COLON ( (lv_y_8_0= ruleEDouble ) ) this_COMMA_9= RULE_COMMA otherlv_10= 'rotz' this_COLON_11= RULE_COLON ( (lv_z_12_0= ruleEDouble ) ) this_CLOSEBRACE_13= RULE_CLOSEBRACE )
            // InternalDsl360.g:795:3: () this_OPENBRACE_1= RULE_OPENBRACE otherlv_2= 'rotx' this_COLON_3= RULE_COLON ( (lv_x_4_0= ruleEDouble ) ) this_COMMA_5= RULE_COMMA otherlv_6= 'roty' this_COLON_7= RULE_COLON ( (lv_y_8_0= ruleEDouble ) ) this_COMMA_9= RULE_COMMA otherlv_10= 'rotz' this_COLON_11= RULE_COLON ( (lv_z_12_0= ruleEDouble ) ) this_CLOSEBRACE_13= RULE_CLOSEBRACE
            {
            // InternalDsl360.g:795:3: ()
            // InternalDsl360.g:796:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRotacionAccess().getRotacionAction_0(),
            					current);
            			

            }

            this_OPENBRACE_1=(Token)match(input,RULE_OPENBRACE,FOLLOW_22); 

            			newLeafNode(this_OPENBRACE_1, grammarAccess.getRotacionAccess().getOPENBRACETerminalRuleCall_1());
            		
            otherlv_2=(Token)match(input,29,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getRotacionAccess().getRotxKeyword_2());
            		
            this_COLON_3=(Token)match(input,RULE_COLON,FOLLOW_19); 

            			newLeafNode(this_COLON_3, grammarAccess.getRotacionAccess().getCOLONTerminalRuleCall_3());
            		
            // InternalDsl360.g:814:3: ( (lv_x_4_0= ruleEDouble ) )
            // InternalDsl360.g:815:4: (lv_x_4_0= ruleEDouble )
            {
            // InternalDsl360.g:815:4: (lv_x_4_0= ruleEDouble )
            // InternalDsl360.g:816:5: lv_x_4_0= ruleEDouble
            {

            					newCompositeNode(grammarAccess.getRotacionAccess().getXEDoubleParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_6);
            lv_x_4_0=ruleEDouble();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRotacionRule());
            					}
            					set(
            						current,
            						"x",
            						lv_x_4_0,
            						"co.betinrubio.Dsl360.EDouble");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_COMMA_5=(Token)match(input,RULE_COMMA,FOLLOW_23); 

            			newLeafNode(this_COMMA_5, grammarAccess.getRotacionAccess().getCOMMATerminalRuleCall_5());
            		
            otherlv_6=(Token)match(input,30,FOLLOW_4); 

            			newLeafNode(otherlv_6, grammarAccess.getRotacionAccess().getRotyKeyword_6());
            		
            this_COLON_7=(Token)match(input,RULE_COLON,FOLLOW_19); 

            			newLeafNode(this_COLON_7, grammarAccess.getRotacionAccess().getCOLONTerminalRuleCall_7());
            		
            // InternalDsl360.g:845:3: ( (lv_y_8_0= ruleEDouble ) )
            // InternalDsl360.g:846:4: (lv_y_8_0= ruleEDouble )
            {
            // InternalDsl360.g:846:4: (lv_y_8_0= ruleEDouble )
            // InternalDsl360.g:847:5: lv_y_8_0= ruleEDouble
            {

            					newCompositeNode(grammarAccess.getRotacionAccess().getYEDoubleParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_6);
            lv_y_8_0=ruleEDouble();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRotacionRule());
            					}
            					set(
            						current,
            						"y",
            						lv_y_8_0,
            						"co.betinrubio.Dsl360.EDouble");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_COMMA_9=(Token)match(input,RULE_COMMA,FOLLOW_24); 

            			newLeafNode(this_COMMA_9, grammarAccess.getRotacionAccess().getCOMMATerminalRuleCall_9());
            		
            otherlv_10=(Token)match(input,31,FOLLOW_4); 

            			newLeafNode(otherlv_10, grammarAccess.getRotacionAccess().getRotzKeyword_10());
            		
            this_COLON_11=(Token)match(input,RULE_COLON,FOLLOW_19); 

            			newLeafNode(this_COLON_11, grammarAccess.getRotacionAccess().getCOLONTerminalRuleCall_11());
            		
            // InternalDsl360.g:876:3: ( (lv_z_12_0= ruleEDouble ) )
            // InternalDsl360.g:877:4: (lv_z_12_0= ruleEDouble )
            {
            // InternalDsl360.g:877:4: (lv_z_12_0= ruleEDouble )
            // InternalDsl360.g:878:5: lv_z_12_0= ruleEDouble
            {

            					newCompositeNode(grammarAccess.getRotacionAccess().getZEDoubleParserRuleCall_12_0());
            				
            pushFollow(FOLLOW_11);
            lv_z_12_0=ruleEDouble();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRotacionRule());
            					}
            					set(
            						current,
            						"z",
            						lv_z_12_0,
            						"co.betinrubio.Dsl360.EDouble");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_CLOSEBRACE_13=(Token)match(input,RULE_CLOSEBRACE,FOLLOW_2); 

            			newLeafNode(this_CLOSEBRACE_13, grammarAccess.getRotacionAccess().getCLOSEBRACETerminalRuleCall_13());
            		

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
    // $ANTLR end "ruleRotacion"


    // $ANTLR start "entryRuleEDouble"
    // InternalDsl360.g:903:1: entryRuleEDouble returns [String current=null] : iv_ruleEDouble= ruleEDouble EOF ;
    public final String entryRuleEDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDouble = null;


        try {
            // InternalDsl360.g:903:47: (iv_ruleEDouble= ruleEDouble EOF )
            // InternalDsl360.g:904:2: iv_ruleEDouble= ruleEDouble EOF
            {
             newCompositeNode(grammarAccess.getEDoubleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEDouble=ruleEDouble();

            state._fsp--;

             current =iv_ruleEDouble.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEDouble"


    // $ANTLR start "ruleEDouble"
    // InternalDsl360.g:910:1: ruleEDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleEDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;
        Token this_INT_7=null;


        	enterRule();

        try {
            // InternalDsl360.g:916:2: ( ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) )
            // InternalDsl360.g:917:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            {
            // InternalDsl360.g:917:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            // InternalDsl360.g:918:3: (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            {
            // InternalDsl360.g:918:3: (kw= '-' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==32) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalDsl360.g:919:4: kw= '-'
                    {
                    kw=(Token)match(input,32,FOLLOW_25); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            // InternalDsl360.g:925:3: (this_INT_1= RULE_INT )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_INT) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalDsl360.g:926:4: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_26); 

                    				current.merge(this_INT_1);
                    			

                    				newLeafNode(this_INT_1, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            kw=(Token)match(input,33,FOLLOW_27); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getEDoubleAccess().getFullStopKeyword_2());
            		
            this_INT_3=(Token)match(input,RULE_INT,FOLLOW_28); 

            			current.merge(this_INT_3);
            		

            			newLeafNode(this_INT_3, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3());
            		
            // InternalDsl360.g:946:3: ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=34 && LA10_0<=35)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalDsl360.g:947:4: (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT
                    {
                    // InternalDsl360.g:947:4: (kw= 'E' | kw= 'e' )
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==34) ) {
                        alt8=1;
                    }
                    else if ( (LA8_0==35) ) {
                        alt8=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 8, 0, input);

                        throw nvae;
                    }
                    switch (alt8) {
                        case 1 :
                            // InternalDsl360.g:948:5: kw= 'E'
                            {
                            kw=(Token)match(input,34,FOLLOW_29); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalDsl360.g:954:5: kw= 'e'
                            {
                            kw=(Token)match(input,35,FOLLOW_29); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_1());
                            				

                            }
                            break;

                    }

                    // InternalDsl360.g:960:4: (kw= '-' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==32) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalDsl360.g:961:5: kw= '-'
                            {
                            kw=(Token)match(input,32,FOLLOW_27); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1());
                            				

                            }
                            break;

                    }

                    this_INT_7=(Token)match(input,RULE_INT,FOLLOW_2); 

                    				current.merge(this_INT_7);
                    			

                    				newLeafNode(this_INT_7, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_4_2());
                    			

                    }
                    break;

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
    // $ANTLR end "ruleEDouble"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000C00L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000140L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000300001000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000200001000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000C00000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000100001000L});

}