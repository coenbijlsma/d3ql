package nl.coenbijlsma.languages.d3ql.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import nl.coenbijlsma.languages.d3ql.services.D3qlGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalD3qlParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'from'", "','", "'select'", "'*'", "'as'", "'where'", "'or'", "'and'", "'='", "'!='", "'>='", "'<='", "'>'", "'<'", "'like'", "'between'", "'in'", "'('", "')'", "'!'", "'.'", "'true'", "'false'", "'null'", "'{'", "'}'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
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


        public InternalD3qlParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalD3qlParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalD3qlParser.tokenNames; }
    public String getGrammarFileName() { return "InternalD3ql.g"; }



     	private D3qlGrammarAccess grammarAccess;

        public InternalD3qlParser(TokenStream input, D3qlGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Query";
       	}

       	@Override
       	protected D3qlGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleQuery"
    // InternalD3ql.g:64:1: entryRuleQuery returns [EObject current=null] : iv_ruleQuery= ruleQuery EOF ;
    public final EObject entryRuleQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuery = null;


        try {
            // InternalD3ql.g:64:46: (iv_ruleQuery= ruleQuery EOF )
            // InternalD3ql.g:65:2: iv_ruleQuery= ruleQuery EOF
            {
             newCompositeNode(grammarAccess.getQueryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQuery=ruleQuery();

            state._fsp--;

             current =iv_ruleQuery; 
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
    // $ANTLR end "entryRuleQuery"


    // $ANTLR start "ruleQuery"
    // InternalD3ql.g:71:1: ruleQuery returns [EObject current=null] : ( ( (lv_from_0_0= ruleFromStatement ) ) ( (lv_select_1_0= ruleSelectStatement ) ) ( (lv_where_2_0= ruleWhereStatement ) )? ) ;
    public final EObject ruleQuery() throws RecognitionException {
        EObject current = null;

        EObject lv_from_0_0 = null;

        EObject lv_select_1_0 = null;

        EObject lv_where_2_0 = null;



        	enterRule();

        try {
            // InternalD3ql.g:77:2: ( ( ( (lv_from_0_0= ruleFromStatement ) ) ( (lv_select_1_0= ruleSelectStatement ) ) ( (lv_where_2_0= ruleWhereStatement ) )? ) )
            // InternalD3ql.g:78:2: ( ( (lv_from_0_0= ruleFromStatement ) ) ( (lv_select_1_0= ruleSelectStatement ) ) ( (lv_where_2_0= ruleWhereStatement ) )? )
            {
            // InternalD3ql.g:78:2: ( ( (lv_from_0_0= ruleFromStatement ) ) ( (lv_select_1_0= ruleSelectStatement ) ) ( (lv_where_2_0= ruleWhereStatement ) )? )
            // InternalD3ql.g:79:3: ( (lv_from_0_0= ruleFromStatement ) ) ( (lv_select_1_0= ruleSelectStatement ) ) ( (lv_where_2_0= ruleWhereStatement ) )?
            {
            // InternalD3ql.g:79:3: ( (lv_from_0_0= ruleFromStatement ) )
            // InternalD3ql.g:80:4: (lv_from_0_0= ruleFromStatement )
            {
            // InternalD3ql.g:80:4: (lv_from_0_0= ruleFromStatement )
            // InternalD3ql.g:81:5: lv_from_0_0= ruleFromStatement
            {

            					newCompositeNode(grammarAccess.getQueryAccess().getFromFromStatementParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_from_0_0=ruleFromStatement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getQueryRule());
            					}
            					set(
            						current,
            						"from",
            						lv_from_0_0,
            						"nl.coenbijlsma.languages.d3ql.D3ql.FromStatement");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalD3ql.g:98:3: ( (lv_select_1_0= ruleSelectStatement ) )
            // InternalD3ql.g:99:4: (lv_select_1_0= ruleSelectStatement )
            {
            // InternalD3ql.g:99:4: (lv_select_1_0= ruleSelectStatement )
            // InternalD3ql.g:100:5: lv_select_1_0= ruleSelectStatement
            {

            					newCompositeNode(grammarAccess.getQueryAccess().getSelectSelectStatementParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_select_1_0=ruleSelectStatement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getQueryRule());
            					}
            					set(
            						current,
            						"select",
            						lv_select_1_0,
            						"nl.coenbijlsma.languages.d3ql.D3ql.SelectStatement");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalD3ql.g:117:3: ( (lv_where_2_0= ruleWhereStatement ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==16) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalD3ql.g:118:4: (lv_where_2_0= ruleWhereStatement )
                    {
                    // InternalD3ql.g:118:4: (lv_where_2_0= ruleWhereStatement )
                    // InternalD3ql.g:119:5: lv_where_2_0= ruleWhereStatement
                    {

                    					newCompositeNode(grammarAccess.getQueryAccess().getWhereWhereStatementParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_where_2_0=ruleWhereStatement();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getQueryRule());
                    					}
                    					set(
                    						current,
                    						"where",
                    						lv_where_2_0,
                    						"nl.coenbijlsma.languages.d3ql.D3ql.WhereStatement");
                    					afterParserOrEnumRuleCall();
                    				

                    }


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
    // $ANTLR end "ruleQuery"


    // $ANTLR start "entryRuleFromStatement"
    // InternalD3ql.g:140:1: entryRuleFromStatement returns [EObject current=null] : iv_ruleFromStatement= ruleFromStatement EOF ;
    public final EObject entryRuleFromStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFromStatement = null;


        try {
            // InternalD3ql.g:140:54: (iv_ruleFromStatement= ruleFromStatement EOF )
            // InternalD3ql.g:141:2: iv_ruleFromStatement= ruleFromStatement EOF
            {
             newCompositeNode(grammarAccess.getFromStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFromStatement=ruleFromStatement();

            state._fsp--;

             current =iv_ruleFromStatement; 
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
    // $ANTLR end "entryRuleFromStatement"


    // $ANTLR start "ruleFromStatement"
    // InternalD3ql.g:147:1: ruleFromStatement returns [EObject current=null] : (otherlv_0= 'from' ( (lv_aggregates_1_0= ruleAggregateRoot ) ) (otherlv_2= ',' ( (lv_aggregates_3_0= ruleAggregateRoot ) ) )* ) ;
    public final EObject ruleFromStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_aggregates_1_0 = null;

        EObject lv_aggregates_3_0 = null;



        	enterRule();

        try {
            // InternalD3ql.g:153:2: ( (otherlv_0= 'from' ( (lv_aggregates_1_0= ruleAggregateRoot ) ) (otherlv_2= ',' ( (lv_aggregates_3_0= ruleAggregateRoot ) ) )* ) )
            // InternalD3ql.g:154:2: (otherlv_0= 'from' ( (lv_aggregates_1_0= ruleAggregateRoot ) ) (otherlv_2= ',' ( (lv_aggregates_3_0= ruleAggregateRoot ) ) )* )
            {
            // InternalD3ql.g:154:2: (otherlv_0= 'from' ( (lv_aggregates_1_0= ruleAggregateRoot ) ) (otherlv_2= ',' ( (lv_aggregates_3_0= ruleAggregateRoot ) ) )* )
            // InternalD3ql.g:155:3: otherlv_0= 'from' ( (lv_aggregates_1_0= ruleAggregateRoot ) ) (otherlv_2= ',' ( (lv_aggregates_3_0= ruleAggregateRoot ) ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getFromStatementAccess().getFromKeyword_0());
            		
            // InternalD3ql.g:159:3: ( (lv_aggregates_1_0= ruleAggregateRoot ) )
            // InternalD3ql.g:160:4: (lv_aggregates_1_0= ruleAggregateRoot )
            {
            // InternalD3ql.g:160:4: (lv_aggregates_1_0= ruleAggregateRoot )
            // InternalD3ql.g:161:5: lv_aggregates_1_0= ruleAggregateRoot
            {

            					newCompositeNode(grammarAccess.getFromStatementAccess().getAggregatesAggregateRootParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_6);
            lv_aggregates_1_0=ruleAggregateRoot();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFromStatementRule());
            					}
            					add(
            						current,
            						"aggregates",
            						lv_aggregates_1_0,
            						"nl.coenbijlsma.languages.d3ql.D3ql.AggregateRoot");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalD3ql.g:178:3: (otherlv_2= ',' ( (lv_aggregates_3_0= ruleAggregateRoot ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==12) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalD3ql.g:179:4: otherlv_2= ',' ( (lv_aggregates_3_0= ruleAggregateRoot ) )
            	    {
            	    otherlv_2=(Token)match(input,12,FOLLOW_5); 

            	    				newLeafNode(otherlv_2, grammarAccess.getFromStatementAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalD3ql.g:183:4: ( (lv_aggregates_3_0= ruleAggregateRoot ) )
            	    // InternalD3ql.g:184:5: (lv_aggregates_3_0= ruleAggregateRoot )
            	    {
            	    // InternalD3ql.g:184:5: (lv_aggregates_3_0= ruleAggregateRoot )
            	    // InternalD3ql.g:185:6: lv_aggregates_3_0= ruleAggregateRoot
            	    {

            	    						newCompositeNode(grammarAccess.getFromStatementAccess().getAggregatesAggregateRootParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_aggregates_3_0=ruleAggregateRoot();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getFromStatementRule());
            	    						}
            	    						add(
            	    							current,
            	    							"aggregates",
            	    							lv_aggregates_3_0,
            	    							"nl.coenbijlsma.languages.d3ql.D3ql.AggregateRoot");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


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
    // $ANTLR end "ruleFromStatement"


    // $ANTLR start "entryRuleSelectStatement"
    // InternalD3ql.g:207:1: entryRuleSelectStatement returns [EObject current=null] : iv_ruleSelectStatement= ruleSelectStatement EOF ;
    public final EObject entryRuleSelectStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectStatement = null;


        try {
            // InternalD3ql.g:207:56: (iv_ruleSelectStatement= ruleSelectStatement EOF )
            // InternalD3ql.g:208:2: iv_ruleSelectStatement= ruleSelectStatement EOF
            {
             newCompositeNode(grammarAccess.getSelectStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSelectStatement=ruleSelectStatement();

            state._fsp--;

             current =iv_ruleSelectStatement; 
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
    // $ANTLR end "entryRuleSelectStatement"


    // $ANTLR start "ruleSelectStatement"
    // InternalD3ql.g:214:1: ruleSelectStatement returns [EObject current=null] : (otherlv_0= 'select' ( ( (lv_arterisk_1_0= '*' ) ) | ( ( (lv_selections_2_0= ruleSelectionItem ) ) (otherlv_3= ',' ( (lv_selections_4_0= ruleSelectionItem ) ) )* ) ) ) ;
    public final EObject ruleSelectStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_arterisk_1_0=null;
        Token otherlv_3=null;
        EObject lv_selections_2_0 = null;

        EObject lv_selections_4_0 = null;



        	enterRule();

        try {
            // InternalD3ql.g:220:2: ( (otherlv_0= 'select' ( ( (lv_arterisk_1_0= '*' ) ) | ( ( (lv_selections_2_0= ruleSelectionItem ) ) (otherlv_3= ',' ( (lv_selections_4_0= ruleSelectionItem ) ) )* ) ) ) )
            // InternalD3ql.g:221:2: (otherlv_0= 'select' ( ( (lv_arterisk_1_0= '*' ) ) | ( ( (lv_selections_2_0= ruleSelectionItem ) ) (otherlv_3= ',' ( (lv_selections_4_0= ruleSelectionItem ) ) )* ) ) )
            {
            // InternalD3ql.g:221:2: (otherlv_0= 'select' ( ( (lv_arterisk_1_0= '*' ) ) | ( ( (lv_selections_2_0= ruleSelectionItem ) ) (otherlv_3= ',' ( (lv_selections_4_0= ruleSelectionItem ) ) )* ) ) )
            // InternalD3ql.g:222:3: otherlv_0= 'select' ( ( (lv_arterisk_1_0= '*' ) ) | ( ( (lv_selections_2_0= ruleSelectionItem ) ) (otherlv_3= ',' ( (lv_selections_4_0= ruleSelectionItem ) ) )* ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getSelectStatementAccess().getSelectKeyword_0());
            		
            // InternalD3ql.g:226:3: ( ( (lv_arterisk_1_0= '*' ) ) | ( ( (lv_selections_2_0= ruleSelectionItem ) ) (otherlv_3= ',' ( (lv_selections_4_0= ruleSelectionItem ) ) )* ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==14) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ID) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalD3ql.g:227:4: ( (lv_arterisk_1_0= '*' ) )
                    {
                    // InternalD3ql.g:227:4: ( (lv_arterisk_1_0= '*' ) )
                    // InternalD3ql.g:228:5: (lv_arterisk_1_0= '*' )
                    {
                    // InternalD3ql.g:228:5: (lv_arterisk_1_0= '*' )
                    // InternalD3ql.g:229:6: lv_arterisk_1_0= '*'
                    {
                    lv_arterisk_1_0=(Token)match(input,14,FOLLOW_2); 

                    						newLeafNode(lv_arterisk_1_0, grammarAccess.getSelectStatementAccess().getArteriskAsteriskKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSelectStatementRule());
                    						}
                    						setWithLastConsumed(current, "arterisk", lv_arterisk_1_0, "*");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalD3ql.g:242:4: ( ( (lv_selections_2_0= ruleSelectionItem ) ) (otherlv_3= ',' ( (lv_selections_4_0= ruleSelectionItem ) ) )* )
                    {
                    // InternalD3ql.g:242:4: ( ( (lv_selections_2_0= ruleSelectionItem ) ) (otherlv_3= ',' ( (lv_selections_4_0= ruleSelectionItem ) ) )* )
                    // InternalD3ql.g:243:5: ( (lv_selections_2_0= ruleSelectionItem ) ) (otherlv_3= ',' ( (lv_selections_4_0= ruleSelectionItem ) ) )*
                    {
                    // InternalD3ql.g:243:5: ( (lv_selections_2_0= ruleSelectionItem ) )
                    // InternalD3ql.g:244:6: (lv_selections_2_0= ruleSelectionItem )
                    {
                    // InternalD3ql.g:244:6: (lv_selections_2_0= ruleSelectionItem )
                    // InternalD3ql.g:245:7: lv_selections_2_0= ruleSelectionItem
                    {

                    							newCompositeNode(grammarAccess.getSelectStatementAccess().getSelectionsSelectionItemParserRuleCall_1_1_0_0());
                    						
                    pushFollow(FOLLOW_6);
                    lv_selections_2_0=ruleSelectionItem();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getSelectStatementRule());
                    							}
                    							add(
                    								current,
                    								"selections",
                    								lv_selections_2_0,
                    								"nl.coenbijlsma.languages.d3ql.D3ql.SelectionItem");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalD3ql.g:262:5: (otherlv_3= ',' ( (lv_selections_4_0= ruleSelectionItem ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==12) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalD3ql.g:263:6: otherlv_3= ',' ( (lv_selections_4_0= ruleSelectionItem ) )
                    	    {
                    	    otherlv_3=(Token)match(input,12,FOLLOW_7); 

                    	    						newLeafNode(otherlv_3, grammarAccess.getSelectStatementAccess().getCommaKeyword_1_1_1_0());
                    	    					
                    	    // InternalD3ql.g:267:6: ( (lv_selections_4_0= ruleSelectionItem ) )
                    	    // InternalD3ql.g:268:7: (lv_selections_4_0= ruleSelectionItem )
                    	    {
                    	    // InternalD3ql.g:268:7: (lv_selections_4_0= ruleSelectionItem )
                    	    // InternalD3ql.g:269:8: lv_selections_4_0= ruleSelectionItem
                    	    {

                    	    								newCompositeNode(grammarAccess.getSelectStatementAccess().getSelectionsSelectionItemParserRuleCall_1_1_1_1_0());
                    	    							
                    	    pushFollow(FOLLOW_6);
                    	    lv_selections_4_0=ruleSelectionItem();

                    	    state._fsp--;


                    	    								if (current==null) {
                    	    									current = createModelElementForParent(grammarAccess.getSelectStatementRule());
                    	    								}
                    	    								add(
                    	    									current,
                    	    									"selections",
                    	    									lv_selections_4_0,
                    	    									"nl.coenbijlsma.languages.d3ql.D3ql.SelectionItem");
                    	    								afterParserOrEnumRuleCall();
                    	    							

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);


                    }


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
    // $ANTLR end "ruleSelectStatement"


    // $ANTLR start "entryRuleSelectionItem"
    // InternalD3ql.g:293:1: entryRuleSelectionItem returns [EObject current=null] : iv_ruleSelectionItem= ruleSelectionItem EOF ;
    public final EObject entryRuleSelectionItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectionItem = null;


        try {
            // InternalD3ql.g:293:54: (iv_ruleSelectionItem= ruleSelectionItem EOF )
            // InternalD3ql.g:294:2: iv_ruleSelectionItem= ruleSelectionItem EOF
            {
             newCompositeNode(grammarAccess.getSelectionItemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSelectionItem=ruleSelectionItem();

            state._fsp--;

             current =iv_ruleSelectionItem; 
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
    // $ANTLR end "entryRuleSelectionItem"


    // $ANTLR start "ruleSelectionItem"
    // InternalD3ql.g:300:1: ruleSelectionItem returns [EObject current=null] : ( ( ( (lv_expression_0_1= ruleFQN | lv_expression_0_2= ruleFunctionCall ) ) ) (otherlv_1= 'as' ( (lv_alias_2_0= ruleAlias ) ) )? ) ;
    public final EObject ruleSelectionItem() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_0_1 = null;

        EObject lv_expression_0_2 = null;

        EObject lv_alias_2_0 = null;



        	enterRule();

        try {
            // InternalD3ql.g:306:2: ( ( ( ( (lv_expression_0_1= ruleFQN | lv_expression_0_2= ruleFunctionCall ) ) ) (otherlv_1= 'as' ( (lv_alias_2_0= ruleAlias ) ) )? ) )
            // InternalD3ql.g:307:2: ( ( ( (lv_expression_0_1= ruleFQN | lv_expression_0_2= ruleFunctionCall ) ) ) (otherlv_1= 'as' ( (lv_alias_2_0= ruleAlias ) ) )? )
            {
            // InternalD3ql.g:307:2: ( ( ( (lv_expression_0_1= ruleFQN | lv_expression_0_2= ruleFunctionCall ) ) ) (otherlv_1= 'as' ( (lv_alias_2_0= ruleAlias ) ) )? )
            // InternalD3ql.g:308:3: ( ( (lv_expression_0_1= ruleFQN | lv_expression_0_2= ruleFunctionCall ) ) ) (otherlv_1= 'as' ( (lv_alias_2_0= ruleAlias ) ) )?
            {
            // InternalD3ql.g:308:3: ( ( (lv_expression_0_1= ruleFQN | lv_expression_0_2= ruleFunctionCall ) ) )
            // InternalD3ql.g:309:4: ( (lv_expression_0_1= ruleFQN | lv_expression_0_2= ruleFunctionCall ) )
            {
            // InternalD3ql.g:309:4: ( (lv_expression_0_1= ruleFQN | lv_expression_0_2= ruleFunctionCall ) )
            // InternalD3ql.g:310:5: (lv_expression_0_1= ruleFQN | lv_expression_0_2= ruleFunctionCall )
            {
            // InternalD3ql.g:310:5: (lv_expression_0_1= ruleFQN | lv_expression_0_2= ruleFunctionCall )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==31) ) {
                    alt5=1;
                }
                else if ( (LA5_1==28) ) {
                    alt5=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalD3ql.g:311:6: lv_expression_0_1= ruleFQN
                    {

                    						newCompositeNode(grammarAccess.getSelectionItemAccess().getExpressionFQNParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_expression_0_1=ruleFQN();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSelectionItemRule());
                    						}
                    						set(
                    							current,
                    							"expression",
                    							lv_expression_0_1,
                    							"nl.coenbijlsma.languages.d3ql.D3ql.FQN");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalD3ql.g:327:6: lv_expression_0_2= ruleFunctionCall
                    {

                    						newCompositeNode(grammarAccess.getSelectionItemAccess().getExpressionFunctionCallParserRuleCall_0_0_1());
                    					
                    pushFollow(FOLLOW_8);
                    lv_expression_0_2=ruleFunctionCall();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSelectionItemRule());
                    						}
                    						set(
                    							current,
                    							"expression",
                    							lv_expression_0_2,
                    							"nl.coenbijlsma.languages.d3ql.D3ql.FunctionCall");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;

            }


            }


            }

            // InternalD3ql.g:345:3: (otherlv_1= 'as' ( (lv_alias_2_0= ruleAlias ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==15) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalD3ql.g:346:4: otherlv_1= 'as' ( (lv_alias_2_0= ruleAlias ) )
                    {
                    otherlv_1=(Token)match(input,15,FOLLOW_5); 

                    				newLeafNode(otherlv_1, grammarAccess.getSelectionItemAccess().getAsKeyword_1_0());
                    			
                    // InternalD3ql.g:350:4: ( (lv_alias_2_0= ruleAlias ) )
                    // InternalD3ql.g:351:5: (lv_alias_2_0= ruleAlias )
                    {
                    // InternalD3ql.g:351:5: (lv_alias_2_0= ruleAlias )
                    // InternalD3ql.g:352:6: lv_alias_2_0= ruleAlias
                    {

                    						newCompositeNode(grammarAccess.getSelectionItemAccess().getAliasAliasParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_alias_2_0=ruleAlias();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSelectionItemRule());
                    						}
                    						set(
                    							current,
                    							"alias",
                    							lv_alias_2_0,
                    							"nl.coenbijlsma.languages.d3ql.D3ql.Alias");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


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
    // $ANTLR end "ruleSelectionItem"


    // $ANTLR start "entryRuleWhereStatement"
    // InternalD3ql.g:374:1: entryRuleWhereStatement returns [EObject current=null] : iv_ruleWhereStatement= ruleWhereStatement EOF ;
    public final EObject entryRuleWhereStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhereStatement = null;


        try {
            // InternalD3ql.g:374:55: (iv_ruleWhereStatement= ruleWhereStatement EOF )
            // InternalD3ql.g:375:2: iv_ruleWhereStatement= ruleWhereStatement EOF
            {
             newCompositeNode(grammarAccess.getWhereStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWhereStatement=ruleWhereStatement();

            state._fsp--;

             current =iv_ruleWhereStatement; 
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
    // $ANTLR end "entryRuleWhereStatement"


    // $ANTLR start "ruleWhereStatement"
    // InternalD3ql.g:381:1: ruleWhereStatement returns [EObject current=null] : (otherlv_0= 'where' ( (lv_expressions_1_0= ruleExpression ) ) ) ;
    public final EObject ruleWhereStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_expressions_1_0 = null;



        	enterRule();

        try {
            // InternalD3ql.g:387:2: ( (otherlv_0= 'where' ( (lv_expressions_1_0= ruleExpression ) ) ) )
            // InternalD3ql.g:388:2: (otherlv_0= 'where' ( (lv_expressions_1_0= ruleExpression ) ) )
            {
            // InternalD3ql.g:388:2: (otherlv_0= 'where' ( (lv_expressions_1_0= ruleExpression ) ) )
            // InternalD3ql.g:389:3: otherlv_0= 'where' ( (lv_expressions_1_0= ruleExpression ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getWhereStatementAccess().getWhereKeyword_0());
            		
            // InternalD3ql.g:393:3: ( (lv_expressions_1_0= ruleExpression ) )
            // InternalD3ql.g:394:4: (lv_expressions_1_0= ruleExpression )
            {
            // InternalD3ql.g:394:4: (lv_expressions_1_0= ruleExpression )
            // InternalD3ql.g:395:5: lv_expressions_1_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getWhereStatementAccess().getExpressionsExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_expressions_1_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWhereStatementRule());
            					}
            					add(
            						current,
            						"expressions",
            						lv_expressions_1_0,
            						"nl.coenbijlsma.languages.d3ql.D3ql.Expression");
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
    // $ANTLR end "ruleWhereStatement"


    // $ANTLR start "entryRuleAggregateRoot"
    // InternalD3ql.g:416:1: entryRuleAggregateRoot returns [EObject current=null] : iv_ruleAggregateRoot= ruleAggregateRoot EOF ;
    public final EObject entryRuleAggregateRoot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAggregateRoot = null;


        try {
            // InternalD3ql.g:416:54: (iv_ruleAggregateRoot= ruleAggregateRoot EOF )
            // InternalD3ql.g:417:2: iv_ruleAggregateRoot= ruleAggregateRoot EOF
            {
             newCompositeNode(grammarAccess.getAggregateRootRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAggregateRoot=ruleAggregateRoot();

            state._fsp--;

             current =iv_ruleAggregateRoot; 
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
    // $ANTLR end "entryRuleAggregateRoot"


    // $ANTLR start "ruleAggregateRoot"
    // InternalD3ql.g:423:1: ruleAggregateRoot returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'as' ( (lv_alias_2_0= ruleAlias ) ) )? ) ;
    public final EObject ruleAggregateRoot() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_alias_2_0 = null;



        	enterRule();

        try {
            // InternalD3ql.g:429:2: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'as' ( (lv_alias_2_0= ruleAlias ) ) )? ) )
            // InternalD3ql.g:430:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'as' ( (lv_alias_2_0= ruleAlias ) ) )? )
            {
            // InternalD3ql.g:430:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'as' ( (lv_alias_2_0= ruleAlias ) ) )? )
            // InternalD3ql.g:431:3: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'as' ( (lv_alias_2_0= ruleAlias ) ) )?
            {
            // InternalD3ql.g:431:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalD3ql.g:432:4: (lv_name_0_0= RULE_ID )
            {
            // InternalD3ql.g:432:4: (lv_name_0_0= RULE_ID )
            // InternalD3ql.g:433:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_0_0, grammarAccess.getAggregateRootAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAggregateRootRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalD3ql.g:449:3: (otherlv_1= 'as' ( (lv_alias_2_0= ruleAlias ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==15) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalD3ql.g:450:4: otherlv_1= 'as' ( (lv_alias_2_0= ruleAlias ) )
                    {
                    otherlv_1=(Token)match(input,15,FOLLOW_5); 

                    				newLeafNode(otherlv_1, grammarAccess.getAggregateRootAccess().getAsKeyword_1_0());
                    			
                    // InternalD3ql.g:454:4: ( (lv_alias_2_0= ruleAlias ) )
                    // InternalD3ql.g:455:5: (lv_alias_2_0= ruleAlias )
                    {
                    // InternalD3ql.g:455:5: (lv_alias_2_0= ruleAlias )
                    // InternalD3ql.g:456:6: lv_alias_2_0= ruleAlias
                    {

                    						newCompositeNode(grammarAccess.getAggregateRootAccess().getAliasAliasParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_alias_2_0=ruleAlias();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAggregateRootRule());
                    						}
                    						set(
                    							current,
                    							"alias",
                    							lv_alias_2_0,
                    							"nl.coenbijlsma.languages.d3ql.D3ql.Alias");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


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
    // $ANTLR end "ruleAggregateRoot"


    // $ANTLR start "entryRuleAlias"
    // InternalD3ql.g:478:1: entryRuleAlias returns [EObject current=null] : iv_ruleAlias= ruleAlias EOF ;
    public final EObject entryRuleAlias() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlias = null;


        try {
            // InternalD3ql.g:478:46: (iv_ruleAlias= ruleAlias EOF )
            // InternalD3ql.g:479:2: iv_ruleAlias= ruleAlias EOF
            {
             newCompositeNode(grammarAccess.getAliasRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAlias=ruleAlias();

            state._fsp--;

             current =iv_ruleAlias; 
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
    // $ANTLR end "entryRuleAlias"


    // $ANTLR start "ruleAlias"
    // InternalD3ql.g:485:1: ruleAlias returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleAlias() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalD3ql.g:491:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalD3ql.g:492:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalD3ql.g:492:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalD3ql.g:493:3: (lv_name_0_0= RULE_ID )
            {
            // InternalD3ql.g:493:3: (lv_name_0_0= RULE_ID )
            // InternalD3ql.g:494:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getAliasAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getAliasRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

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
    // $ANTLR end "ruleAlias"


    // $ANTLR start "entryRuleExpression"
    // InternalD3ql.g:513:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalD3ql.g:513:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalD3ql.g:514:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalD3ql.g:520:1: ruleExpression returns [EObject current=null] : (this_Or_0= ruleOr ( () otherlv_2= 'as' ( (lv_alias_3_0= ruleAlias ) ) )? ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Or_0 = null;

        EObject lv_alias_3_0 = null;



        	enterRule();

        try {
            // InternalD3ql.g:526:2: ( (this_Or_0= ruleOr ( () otherlv_2= 'as' ( (lv_alias_3_0= ruleAlias ) ) )? ) )
            // InternalD3ql.g:527:2: (this_Or_0= ruleOr ( () otherlv_2= 'as' ( (lv_alias_3_0= ruleAlias ) ) )? )
            {
            // InternalD3ql.g:527:2: (this_Or_0= ruleOr ( () otherlv_2= 'as' ( (lv_alias_3_0= ruleAlias ) ) )? )
            // InternalD3ql.g:528:3: this_Or_0= ruleOr ( () otherlv_2= 'as' ( (lv_alias_3_0= ruleAlias ) ) )?
            {

            			newCompositeNode(grammarAccess.getExpressionAccess().getOrParserRuleCall_0());
            		
            pushFollow(FOLLOW_8);
            this_Or_0=ruleOr();

            state._fsp--;


            			current = this_Or_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalD3ql.g:536:3: ( () otherlv_2= 'as' ( (lv_alias_3_0= ruleAlias ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==15) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalD3ql.g:537:4: () otherlv_2= 'as' ( (lv_alias_3_0= ruleAlias ) )
                    {
                    // InternalD3ql.g:537:4: ()
                    // InternalD3ql.g:538:5: 
                    {

                    					current = forceCreateModelElementAndSet(
                    						grammarAccess.getExpressionAccess().getExpressionLeftAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_2=(Token)match(input,15,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getExpressionAccess().getAsKeyword_1_1());
                    			
                    // InternalD3ql.g:548:4: ( (lv_alias_3_0= ruleAlias ) )
                    // InternalD3ql.g:549:5: (lv_alias_3_0= ruleAlias )
                    {
                    // InternalD3ql.g:549:5: (lv_alias_3_0= ruleAlias )
                    // InternalD3ql.g:550:6: lv_alias_3_0= ruleAlias
                    {

                    						newCompositeNode(grammarAccess.getExpressionAccess().getAliasAliasParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_alias_3_0=ruleAlias();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExpressionRule());
                    						}
                    						set(
                    							current,
                    							"alias",
                    							lv_alias_3_0,
                    							"nl.coenbijlsma.languages.d3ql.D3ql.Alias");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleOr"
    // InternalD3ql.g:572:1: entryRuleOr returns [EObject current=null] : iv_ruleOr= ruleOr EOF ;
    public final EObject entryRuleOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOr = null;


        try {
            // InternalD3ql.g:572:43: (iv_ruleOr= ruleOr EOF )
            // InternalD3ql.g:573:2: iv_ruleOr= ruleOr EOF
            {
             newCompositeNode(grammarAccess.getOrRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOr=ruleOr();

            state._fsp--;

             current =iv_ruleOr; 
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
    // $ANTLR end "entryRuleOr"


    // $ANTLR start "ruleOr"
    // InternalD3ql.g:579:1: ruleOr returns [EObject current=null] : (this_And_0= ruleAnd ( () otherlv_2= 'or' ( (lv_right_3_0= ruleAnd ) ) )* ) ;
    public final EObject ruleOr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_And_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalD3ql.g:585:2: ( (this_And_0= ruleAnd ( () otherlv_2= 'or' ( (lv_right_3_0= ruleAnd ) ) )* ) )
            // InternalD3ql.g:586:2: (this_And_0= ruleAnd ( () otherlv_2= 'or' ( (lv_right_3_0= ruleAnd ) ) )* )
            {
            // InternalD3ql.g:586:2: (this_And_0= ruleAnd ( () otherlv_2= 'or' ( (lv_right_3_0= ruleAnd ) ) )* )
            // InternalD3ql.g:587:3: this_And_0= ruleAnd ( () otherlv_2= 'or' ( (lv_right_3_0= ruleAnd ) ) )*
            {

            			newCompositeNode(grammarAccess.getOrAccess().getAndParserRuleCall_0());
            		
            pushFollow(FOLLOW_10);
            this_And_0=ruleAnd();

            state._fsp--;


            			current = this_And_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalD3ql.g:595:3: ( () otherlv_2= 'or' ( (lv_right_3_0= ruleAnd ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==17) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalD3ql.g:596:4: () otherlv_2= 'or' ( (lv_right_3_0= ruleAnd ) )
            	    {
            	    // InternalD3ql.g:596:4: ()
            	    // InternalD3ql.g:597:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getOrAccess().getOrLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,17,FOLLOW_9); 

            	    				newLeafNode(otherlv_2, grammarAccess.getOrAccess().getOrKeyword_1_1());
            	    			
            	    // InternalD3ql.g:607:4: ( (lv_right_3_0= ruleAnd ) )
            	    // InternalD3ql.g:608:5: (lv_right_3_0= ruleAnd )
            	    {
            	    // InternalD3ql.g:608:5: (lv_right_3_0= ruleAnd )
            	    // InternalD3ql.g:609:6: lv_right_3_0= ruleAnd
            	    {

            	    						newCompositeNode(grammarAccess.getOrAccess().getRightAndParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    lv_right_3_0=ruleAnd();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getOrRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"nl.coenbijlsma.languages.d3ql.D3ql.And");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


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
    // $ANTLR end "ruleOr"


    // $ANTLR start "entryRuleAnd"
    // InternalD3ql.g:631:1: entryRuleAnd returns [EObject current=null] : iv_ruleAnd= ruleAnd EOF ;
    public final EObject entryRuleAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnd = null;


        try {
            // InternalD3ql.g:631:44: (iv_ruleAnd= ruleAnd EOF )
            // InternalD3ql.g:632:2: iv_ruleAnd= ruleAnd EOF
            {
             newCompositeNode(grammarAccess.getAndRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAnd=ruleAnd();

            state._fsp--;

             current =iv_ruleAnd; 
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
    // $ANTLR end "entryRuleAnd"


    // $ANTLR start "ruleAnd"
    // InternalD3ql.g:638:1: ruleAnd returns [EObject current=null] : (this_Equality_0= ruleEquality ( () otherlv_2= 'and' ( (lv_right_3_0= ruleEquality ) ) )* ) ;
    public final EObject ruleAnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Equality_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalD3ql.g:644:2: ( (this_Equality_0= ruleEquality ( () otherlv_2= 'and' ( (lv_right_3_0= ruleEquality ) ) )* ) )
            // InternalD3ql.g:645:2: (this_Equality_0= ruleEquality ( () otherlv_2= 'and' ( (lv_right_3_0= ruleEquality ) ) )* )
            {
            // InternalD3ql.g:645:2: (this_Equality_0= ruleEquality ( () otherlv_2= 'and' ( (lv_right_3_0= ruleEquality ) ) )* )
            // InternalD3ql.g:646:3: this_Equality_0= ruleEquality ( () otherlv_2= 'and' ( (lv_right_3_0= ruleEquality ) ) )*
            {

            			newCompositeNode(grammarAccess.getAndAccess().getEqualityParserRuleCall_0());
            		
            pushFollow(FOLLOW_11);
            this_Equality_0=ruleEquality();

            state._fsp--;


            			current = this_Equality_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalD3ql.g:654:3: ( () otherlv_2= 'and' ( (lv_right_3_0= ruleEquality ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==18) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalD3ql.g:655:4: () otherlv_2= 'and' ( (lv_right_3_0= ruleEquality ) )
            	    {
            	    // InternalD3ql.g:655:4: ()
            	    // InternalD3ql.g:656:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getAndAccess().getAndLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,18,FOLLOW_9); 

            	    				newLeafNode(otherlv_2, grammarAccess.getAndAccess().getAndKeyword_1_1());
            	    			
            	    // InternalD3ql.g:666:4: ( (lv_right_3_0= ruleEquality ) )
            	    // InternalD3ql.g:667:5: (lv_right_3_0= ruleEquality )
            	    {
            	    // InternalD3ql.g:667:5: (lv_right_3_0= ruleEquality )
            	    // InternalD3ql.g:668:6: lv_right_3_0= ruleEquality
            	    {

            	    						newCompositeNode(grammarAccess.getAndAccess().getRightEqualityParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_11);
            	    lv_right_3_0=ruleEquality();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAndRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"nl.coenbijlsma.languages.d3ql.D3ql.Equality");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


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
    // $ANTLR end "ruleAnd"


    // $ANTLR start "entryRuleEquality"
    // InternalD3ql.g:690:1: entryRuleEquality returns [EObject current=null] : iv_ruleEquality= ruleEquality EOF ;
    public final EObject entryRuleEquality() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEquality = null;


        try {
            // InternalD3ql.g:690:49: (iv_ruleEquality= ruleEquality EOF )
            // InternalD3ql.g:691:2: iv_ruleEquality= ruleEquality EOF
            {
             newCompositeNode(grammarAccess.getEqualityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEquality=ruleEquality();

            state._fsp--;

             current =iv_ruleEquality; 
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
    // $ANTLR end "entryRuleEquality"


    // $ANTLR start "ruleEquality"
    // InternalD3ql.g:697:1: ruleEquality returns [EObject current=null] : (this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* ) ;
    public final EObject ruleEquality() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_Comparison_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalD3ql.g:703:2: ( (this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* ) )
            // InternalD3ql.g:704:2: (this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* )
            {
            // InternalD3ql.g:704:2: (this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* )
            // InternalD3ql.g:705:3: this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )*
            {

            			newCompositeNode(grammarAccess.getEqualityAccess().getComparisonParserRuleCall_0());
            		
            pushFollow(FOLLOW_12);
            this_Comparison_0=ruleComparison();

            state._fsp--;


            			current = this_Comparison_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalD3ql.g:713:3: ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=19 && LA12_0<=20)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalD3ql.g:714:4: () ( ( (lv_op_2_1= '=' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) )
            	    {
            	    // InternalD3ql.g:714:4: ()
            	    // InternalD3ql.g:715:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getEqualityAccess().getEqualityLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalD3ql.g:721:4: ( ( (lv_op_2_1= '=' | lv_op_2_2= '!=' ) ) )
            	    // InternalD3ql.g:722:5: ( (lv_op_2_1= '=' | lv_op_2_2= '!=' ) )
            	    {
            	    // InternalD3ql.g:722:5: ( (lv_op_2_1= '=' | lv_op_2_2= '!=' ) )
            	    // InternalD3ql.g:723:6: (lv_op_2_1= '=' | lv_op_2_2= '!=' )
            	    {
            	    // InternalD3ql.g:723:6: (lv_op_2_1= '=' | lv_op_2_2= '!=' )
            	    int alt11=2;
            	    int LA11_0 = input.LA(1);

            	    if ( (LA11_0==19) ) {
            	        alt11=1;
            	    }
            	    else if ( (LA11_0==20) ) {
            	        alt11=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 11, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt11) {
            	        case 1 :
            	            // InternalD3ql.g:724:7: lv_op_2_1= '='
            	            {
            	            lv_op_2_1=(Token)match(input,19,FOLLOW_9); 

            	            							newLeafNode(lv_op_2_1, grammarAccess.getEqualityAccess().getOpEqualsSignKeyword_1_1_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getEqualityRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_1, null);
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalD3ql.g:735:7: lv_op_2_2= '!='
            	            {
            	            lv_op_2_2=(Token)match(input,20,FOLLOW_9); 

            	            							newLeafNode(lv_op_2_2, grammarAccess.getEqualityAccess().getOpExclamationMarkEqualsSignKeyword_1_1_0_1());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getEqualityRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_2, null);
            	            						

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // InternalD3ql.g:748:4: ( (lv_right_3_0= ruleComparison ) )
            	    // InternalD3ql.g:749:5: (lv_right_3_0= ruleComparison )
            	    {
            	    // InternalD3ql.g:749:5: (lv_right_3_0= ruleComparison )
            	    // InternalD3ql.g:750:6: lv_right_3_0= ruleComparison
            	    {

            	    						newCompositeNode(grammarAccess.getEqualityAccess().getRightComparisonParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_right_3_0=ruleComparison();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEqualityRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"nl.coenbijlsma.languages.d3ql.D3ql.Comparison");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


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
    // $ANTLR end "ruleEquality"


    // $ANTLR start "entryRuleComparison"
    // InternalD3ql.g:772:1: entryRuleComparison returns [EObject current=null] : iv_ruleComparison= ruleComparison EOF ;
    public final EObject entryRuleComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparison = null;


        try {
            // InternalD3ql.g:772:51: (iv_ruleComparison= ruleComparison EOF )
            // InternalD3ql.g:773:2: iv_ruleComparison= ruleComparison EOF
            {
             newCompositeNode(grammarAccess.getComparisonRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComparison=ruleComparison();

            state._fsp--;

             current =iv_ruleComparison; 
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
    // $ANTLR end "entryRuleComparison"


    // $ANTLR start "ruleComparison"
    // InternalD3ql.g:779:1: ruleComparison returns [EObject current=null] : (this_Primary_0= rulePrimary ( ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' | lv_op_2_5= 'like' ) ) ) ( (lv_right_3_0= rulePrimary ) ) ) | ( () ( (lv_op_5_0= 'between' ) ) ( (lv_x_6_0= rulePrimary ) ) otherlv_7= 'and' ( (lv_y_8_0= rulePrimary ) ) ) | ( () ( (lv_op_10_0= 'in' ) ) otherlv_11= '(' ( (lv_list_12_0= ruleAtomic ) ) (otherlv_13= ',' ( (lv_list_14_0= ruleAtomic ) ) )* otherlv_15= ')' ) )* ) ;
    public final EObject ruleComparison() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        Token lv_op_2_3=null;
        Token lv_op_2_4=null;
        Token lv_op_2_5=null;
        Token lv_op_5_0=null;
        Token otherlv_7=null;
        Token lv_op_10_0=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        EObject this_Primary_0 = null;

        EObject lv_right_3_0 = null;

        EObject lv_x_6_0 = null;

        EObject lv_y_8_0 = null;

        EObject lv_list_12_0 = null;

        EObject lv_list_14_0 = null;



        	enterRule();

        try {
            // InternalD3ql.g:785:2: ( (this_Primary_0= rulePrimary ( ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' | lv_op_2_5= 'like' ) ) ) ( (lv_right_3_0= rulePrimary ) ) ) | ( () ( (lv_op_5_0= 'between' ) ) ( (lv_x_6_0= rulePrimary ) ) otherlv_7= 'and' ( (lv_y_8_0= rulePrimary ) ) ) | ( () ( (lv_op_10_0= 'in' ) ) otherlv_11= '(' ( (lv_list_12_0= ruleAtomic ) ) (otherlv_13= ',' ( (lv_list_14_0= ruleAtomic ) ) )* otherlv_15= ')' ) )* ) )
            // InternalD3ql.g:786:2: (this_Primary_0= rulePrimary ( ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' | lv_op_2_5= 'like' ) ) ) ( (lv_right_3_0= rulePrimary ) ) ) | ( () ( (lv_op_5_0= 'between' ) ) ( (lv_x_6_0= rulePrimary ) ) otherlv_7= 'and' ( (lv_y_8_0= rulePrimary ) ) ) | ( () ( (lv_op_10_0= 'in' ) ) otherlv_11= '(' ( (lv_list_12_0= ruleAtomic ) ) (otherlv_13= ',' ( (lv_list_14_0= ruleAtomic ) ) )* otherlv_15= ')' ) )* )
            {
            // InternalD3ql.g:786:2: (this_Primary_0= rulePrimary ( ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' | lv_op_2_5= 'like' ) ) ) ( (lv_right_3_0= rulePrimary ) ) ) | ( () ( (lv_op_5_0= 'between' ) ) ( (lv_x_6_0= rulePrimary ) ) otherlv_7= 'and' ( (lv_y_8_0= rulePrimary ) ) ) | ( () ( (lv_op_10_0= 'in' ) ) otherlv_11= '(' ( (lv_list_12_0= ruleAtomic ) ) (otherlv_13= ',' ( (lv_list_14_0= ruleAtomic ) ) )* otherlv_15= ')' ) )* )
            // InternalD3ql.g:787:3: this_Primary_0= rulePrimary ( ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' | lv_op_2_5= 'like' ) ) ) ( (lv_right_3_0= rulePrimary ) ) ) | ( () ( (lv_op_5_0= 'between' ) ) ( (lv_x_6_0= rulePrimary ) ) otherlv_7= 'and' ( (lv_y_8_0= rulePrimary ) ) ) | ( () ( (lv_op_10_0= 'in' ) ) otherlv_11= '(' ( (lv_list_12_0= ruleAtomic ) ) (otherlv_13= ',' ( (lv_list_14_0= ruleAtomic ) ) )* otherlv_15= ')' ) )*
            {

            			newCompositeNode(grammarAccess.getComparisonAccess().getPrimaryParserRuleCall_0());
            		
            pushFollow(FOLLOW_13);
            this_Primary_0=rulePrimary();

            state._fsp--;


            			current = this_Primary_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalD3ql.g:795:3: ( ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' | lv_op_2_5= 'like' ) ) ) ( (lv_right_3_0= rulePrimary ) ) ) | ( () ( (lv_op_5_0= 'between' ) ) ( (lv_x_6_0= rulePrimary ) ) otherlv_7= 'and' ( (lv_y_8_0= rulePrimary ) ) ) | ( () ( (lv_op_10_0= 'in' ) ) otherlv_11= '(' ( (lv_list_12_0= ruleAtomic ) ) (otherlv_13= ',' ( (lv_list_14_0= ruleAtomic ) ) )* otherlv_15= ')' ) )*
            loop15:
            do {
                int alt15=4;
                switch ( input.LA(1) ) {
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                    {
                    alt15=1;
                    }
                    break;
                case 26:
                    {
                    alt15=2;
                    }
                    break;
                case 27:
                    {
                    alt15=3;
                    }
                    break;

                }

                switch (alt15) {
            	case 1 :
            	    // InternalD3ql.g:796:4: ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' | lv_op_2_5= 'like' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )
            	    {
            	    // InternalD3ql.g:796:4: ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' | lv_op_2_5= 'like' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )
            	    // InternalD3ql.g:797:5: () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' | lv_op_2_5= 'like' ) ) ) ( (lv_right_3_0= rulePrimary ) )
            	    {
            	    // InternalD3ql.g:797:5: ()
            	    // InternalD3ql.g:798:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0_0(),
            	    							current);
            	    					

            	    }

            	    // InternalD3ql.g:804:5: ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' | lv_op_2_5= 'like' ) ) )
            	    // InternalD3ql.g:805:6: ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' | lv_op_2_5= 'like' ) )
            	    {
            	    // InternalD3ql.g:805:6: ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' | lv_op_2_5= 'like' ) )
            	    // InternalD3ql.g:806:7: (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' | lv_op_2_5= 'like' )
            	    {
            	    // InternalD3ql.g:806:7: (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' | lv_op_2_5= 'like' )
            	    int alt13=5;
            	    switch ( input.LA(1) ) {
            	    case 21:
            	        {
            	        alt13=1;
            	        }
            	        break;
            	    case 22:
            	        {
            	        alt13=2;
            	        }
            	        break;
            	    case 23:
            	        {
            	        alt13=3;
            	        }
            	        break;
            	    case 24:
            	        {
            	        alt13=4;
            	        }
            	        break;
            	    case 25:
            	        {
            	        alt13=5;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 13, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt13) {
            	        case 1 :
            	            // InternalD3ql.g:807:8: lv_op_2_1= '>='
            	            {
            	            lv_op_2_1=(Token)match(input,21,FOLLOW_9); 

            	            								newLeafNode(lv_op_2_1, grammarAccess.getComparisonAccess().getOpGreaterThanSignEqualsSignKeyword_1_0_1_0_0());
            	            							

            	            								if (current==null) {
            	            									current = createModelElement(grammarAccess.getComparisonRule());
            	            								}
            	            								setWithLastConsumed(current, "op", lv_op_2_1, null);
            	            							

            	            }
            	            break;
            	        case 2 :
            	            // InternalD3ql.g:818:8: lv_op_2_2= '<='
            	            {
            	            lv_op_2_2=(Token)match(input,22,FOLLOW_9); 

            	            								newLeafNode(lv_op_2_2, grammarAccess.getComparisonAccess().getOpLessThanSignEqualsSignKeyword_1_0_1_0_1());
            	            							

            	            								if (current==null) {
            	            									current = createModelElement(grammarAccess.getComparisonRule());
            	            								}
            	            								setWithLastConsumed(current, "op", lv_op_2_2, null);
            	            							

            	            }
            	            break;
            	        case 3 :
            	            // InternalD3ql.g:829:8: lv_op_2_3= '>'
            	            {
            	            lv_op_2_3=(Token)match(input,23,FOLLOW_9); 

            	            								newLeafNode(lv_op_2_3, grammarAccess.getComparisonAccess().getOpGreaterThanSignKeyword_1_0_1_0_2());
            	            							

            	            								if (current==null) {
            	            									current = createModelElement(grammarAccess.getComparisonRule());
            	            								}
            	            								setWithLastConsumed(current, "op", lv_op_2_3, null);
            	            							

            	            }
            	            break;
            	        case 4 :
            	            // InternalD3ql.g:840:8: lv_op_2_4= '<'
            	            {
            	            lv_op_2_4=(Token)match(input,24,FOLLOW_9); 

            	            								newLeafNode(lv_op_2_4, grammarAccess.getComparisonAccess().getOpLessThanSignKeyword_1_0_1_0_3());
            	            							

            	            								if (current==null) {
            	            									current = createModelElement(grammarAccess.getComparisonRule());
            	            								}
            	            								setWithLastConsumed(current, "op", lv_op_2_4, null);
            	            							

            	            }
            	            break;
            	        case 5 :
            	            // InternalD3ql.g:851:8: lv_op_2_5= 'like'
            	            {
            	            lv_op_2_5=(Token)match(input,25,FOLLOW_9); 

            	            								newLeafNode(lv_op_2_5, grammarAccess.getComparisonAccess().getOpLikeKeyword_1_0_1_0_4());
            	            							

            	            								if (current==null) {
            	            									current = createModelElement(grammarAccess.getComparisonRule());
            	            								}
            	            								setWithLastConsumed(current, "op", lv_op_2_5, null);
            	            							

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // InternalD3ql.g:864:5: ( (lv_right_3_0= rulePrimary ) )
            	    // InternalD3ql.g:865:6: (lv_right_3_0= rulePrimary )
            	    {
            	    // InternalD3ql.g:865:6: (lv_right_3_0= rulePrimary )
            	    // InternalD3ql.g:866:7: lv_right_3_0= rulePrimary
            	    {

            	    							newCompositeNode(grammarAccess.getComparisonAccess().getRightPrimaryParserRuleCall_1_0_2_0());
            	    						
            	    pushFollow(FOLLOW_13);
            	    lv_right_3_0=rulePrimary();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getComparisonRule());
            	    							}
            	    							set(
            	    								current,
            	    								"right",
            	    								lv_right_3_0,
            	    								"nl.coenbijlsma.languages.d3ql.D3ql.Primary");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalD3ql.g:885:4: ( () ( (lv_op_5_0= 'between' ) ) ( (lv_x_6_0= rulePrimary ) ) otherlv_7= 'and' ( (lv_y_8_0= rulePrimary ) ) )
            	    {
            	    // InternalD3ql.g:885:4: ( () ( (lv_op_5_0= 'between' ) ) ( (lv_x_6_0= rulePrimary ) ) otherlv_7= 'and' ( (lv_y_8_0= rulePrimary ) ) )
            	    // InternalD3ql.g:886:5: () ( (lv_op_5_0= 'between' ) ) ( (lv_x_6_0= rulePrimary ) ) otherlv_7= 'and' ( (lv_y_8_0= rulePrimary ) )
            	    {
            	    // InternalD3ql.g:886:5: ()
            	    // InternalD3ql.g:887:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getComparisonAccess().getComparisonLeftAction_1_1_0(),
            	    							current);
            	    					

            	    }

            	    // InternalD3ql.g:893:5: ( (lv_op_5_0= 'between' ) )
            	    // InternalD3ql.g:894:6: (lv_op_5_0= 'between' )
            	    {
            	    // InternalD3ql.g:894:6: (lv_op_5_0= 'between' )
            	    // InternalD3ql.g:895:7: lv_op_5_0= 'between'
            	    {
            	    lv_op_5_0=(Token)match(input,26,FOLLOW_9); 

            	    							newLeafNode(lv_op_5_0, grammarAccess.getComparisonAccess().getOpBetweenKeyword_1_1_1_0());
            	    						

            	    							if (current==null) {
            	    								current = createModelElement(grammarAccess.getComparisonRule());
            	    							}
            	    							setWithLastConsumed(current, "op", lv_op_5_0, "between");
            	    						

            	    }


            	    }

            	    // InternalD3ql.g:907:5: ( (lv_x_6_0= rulePrimary ) )
            	    // InternalD3ql.g:908:6: (lv_x_6_0= rulePrimary )
            	    {
            	    // InternalD3ql.g:908:6: (lv_x_6_0= rulePrimary )
            	    // InternalD3ql.g:909:7: lv_x_6_0= rulePrimary
            	    {

            	    							newCompositeNode(grammarAccess.getComparisonAccess().getXPrimaryParserRuleCall_1_1_2_0());
            	    						
            	    pushFollow(FOLLOW_14);
            	    lv_x_6_0=rulePrimary();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getComparisonRule());
            	    							}
            	    							set(
            	    								current,
            	    								"x",
            	    								lv_x_6_0,
            	    								"nl.coenbijlsma.languages.d3ql.D3ql.Primary");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }

            	    otherlv_7=(Token)match(input,18,FOLLOW_9); 

            	    					newLeafNode(otherlv_7, grammarAccess.getComparisonAccess().getAndKeyword_1_1_3());
            	    				
            	    // InternalD3ql.g:930:5: ( (lv_y_8_0= rulePrimary ) )
            	    // InternalD3ql.g:931:6: (lv_y_8_0= rulePrimary )
            	    {
            	    // InternalD3ql.g:931:6: (lv_y_8_0= rulePrimary )
            	    // InternalD3ql.g:932:7: lv_y_8_0= rulePrimary
            	    {

            	    							newCompositeNode(grammarAccess.getComparisonAccess().getYPrimaryParserRuleCall_1_1_4_0());
            	    						
            	    pushFollow(FOLLOW_13);
            	    lv_y_8_0=rulePrimary();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getComparisonRule());
            	    							}
            	    							set(
            	    								current,
            	    								"y",
            	    								lv_y_8_0,
            	    								"nl.coenbijlsma.languages.d3ql.D3ql.Primary");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalD3ql.g:951:4: ( () ( (lv_op_10_0= 'in' ) ) otherlv_11= '(' ( (lv_list_12_0= ruleAtomic ) ) (otherlv_13= ',' ( (lv_list_14_0= ruleAtomic ) ) )* otherlv_15= ')' )
            	    {
            	    // InternalD3ql.g:951:4: ( () ( (lv_op_10_0= 'in' ) ) otherlv_11= '(' ( (lv_list_12_0= ruleAtomic ) ) (otherlv_13= ',' ( (lv_list_14_0= ruleAtomic ) ) )* otherlv_15= ')' )
            	    // InternalD3ql.g:952:5: () ( (lv_op_10_0= 'in' ) ) otherlv_11= '(' ( (lv_list_12_0= ruleAtomic ) ) (otherlv_13= ',' ( (lv_list_14_0= ruleAtomic ) ) )* otherlv_15= ')'
            	    {
            	    // InternalD3ql.g:952:5: ()
            	    // InternalD3ql.g:953:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getComparisonAccess().getComparisonLeftAction_1_2_0(),
            	    							current);
            	    					

            	    }

            	    // InternalD3ql.g:959:5: ( (lv_op_10_0= 'in' ) )
            	    // InternalD3ql.g:960:6: (lv_op_10_0= 'in' )
            	    {
            	    // InternalD3ql.g:960:6: (lv_op_10_0= 'in' )
            	    // InternalD3ql.g:961:7: lv_op_10_0= 'in'
            	    {
            	    lv_op_10_0=(Token)match(input,27,FOLLOW_15); 

            	    							newLeafNode(lv_op_10_0, grammarAccess.getComparisonAccess().getOpInKeyword_1_2_1_0());
            	    						

            	    							if (current==null) {
            	    								current = createModelElement(grammarAccess.getComparisonRule());
            	    							}
            	    							setWithLastConsumed(current, "op", lv_op_10_0, "in");
            	    						

            	    }


            	    }

            	    otherlv_11=(Token)match(input,28,FOLLOW_9); 

            	    					newLeafNode(otherlv_11, grammarAccess.getComparisonAccess().getLeftParenthesisKeyword_1_2_2());
            	    				
            	    // InternalD3ql.g:977:5: ( (lv_list_12_0= ruleAtomic ) )
            	    // InternalD3ql.g:978:6: (lv_list_12_0= ruleAtomic )
            	    {
            	    // InternalD3ql.g:978:6: (lv_list_12_0= ruleAtomic )
            	    // InternalD3ql.g:979:7: lv_list_12_0= ruleAtomic
            	    {

            	    							newCompositeNode(grammarAccess.getComparisonAccess().getListAtomicParserRuleCall_1_2_3_0());
            	    						
            	    pushFollow(FOLLOW_16);
            	    lv_list_12_0=ruleAtomic();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getComparisonRule());
            	    							}
            	    							add(
            	    								current,
            	    								"list",
            	    								lv_list_12_0,
            	    								"nl.coenbijlsma.languages.d3ql.D3ql.Atomic");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }

            	    // InternalD3ql.g:996:5: (otherlv_13= ',' ( (lv_list_14_0= ruleAtomic ) ) )*
            	    loop14:
            	    do {
            	        int alt14=2;
            	        int LA14_0 = input.LA(1);

            	        if ( (LA14_0==12) ) {
            	            alt14=1;
            	        }


            	        switch (alt14) {
            	    	case 1 :
            	    	    // InternalD3ql.g:997:6: otherlv_13= ',' ( (lv_list_14_0= ruleAtomic ) )
            	    	    {
            	    	    otherlv_13=(Token)match(input,12,FOLLOW_9); 

            	    	    						newLeafNode(otherlv_13, grammarAccess.getComparisonAccess().getCommaKeyword_1_2_4_0());
            	    	    					
            	    	    // InternalD3ql.g:1001:6: ( (lv_list_14_0= ruleAtomic ) )
            	    	    // InternalD3ql.g:1002:7: (lv_list_14_0= ruleAtomic )
            	    	    {
            	    	    // InternalD3ql.g:1002:7: (lv_list_14_0= ruleAtomic )
            	    	    // InternalD3ql.g:1003:8: lv_list_14_0= ruleAtomic
            	    	    {

            	    	    								newCompositeNode(grammarAccess.getComparisonAccess().getListAtomicParserRuleCall_1_2_4_1_0());
            	    	    							
            	    	    pushFollow(FOLLOW_16);
            	    	    lv_list_14_0=ruleAtomic();

            	    	    state._fsp--;


            	    	    								if (current==null) {
            	    	    									current = createModelElementForParent(grammarAccess.getComparisonRule());
            	    	    								}
            	    	    								add(
            	    	    									current,
            	    	    									"list",
            	    	    									lv_list_14_0,
            	    	    									"nl.coenbijlsma.languages.d3ql.D3ql.Atomic");
            	    	    								afterParserOrEnumRuleCall();
            	    	    							

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop14;
            	        }
            	    } while (true);

            	    otherlv_15=(Token)match(input,29,FOLLOW_13); 

            	    					newLeafNode(otherlv_15, grammarAccess.getComparisonAccess().getRightParenthesisKeyword_1_2_5());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


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
    // $ANTLR end "ruleComparison"


    // $ANTLR start "entryRulePrimary"
    // InternalD3ql.g:1031:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalD3ql.g:1031:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalD3ql.g:1032:2: iv_rulePrimary= rulePrimary EOF
            {
             newCompositeNode(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimary=rulePrimary();

            state._fsp--;

             current =iv_rulePrimary; 
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
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // InternalD3ql.g:1038:1: rulePrimary returns [EObject current=null] : ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () otherlv_4= '!' ( (lv_expression_5_0= rulePrimary ) ) ) | this_FQN_6= ruleFQN | this_FunctionCall_7= ruleFunctionCall | this_Atomic_8= ruleAtomic ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_Expression_1 = null;

        EObject lv_expression_5_0 = null;

        EObject this_FQN_6 = null;

        EObject this_FunctionCall_7 = null;

        EObject this_Atomic_8 = null;



        	enterRule();

        try {
            // InternalD3ql.g:1044:2: ( ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () otherlv_4= '!' ( (lv_expression_5_0= rulePrimary ) ) ) | this_FQN_6= ruleFQN | this_FunctionCall_7= ruleFunctionCall | this_Atomic_8= ruleAtomic ) )
            // InternalD3ql.g:1045:2: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () otherlv_4= '!' ( (lv_expression_5_0= rulePrimary ) ) ) | this_FQN_6= ruleFQN | this_FunctionCall_7= ruleFunctionCall | this_Atomic_8= ruleAtomic )
            {
            // InternalD3ql.g:1045:2: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () otherlv_4= '!' ( (lv_expression_5_0= rulePrimary ) ) ) | this_FQN_6= ruleFQN | this_FunctionCall_7= ruleFunctionCall | this_Atomic_8= ruleAtomic )
            int alt16=5;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt16=1;
                }
                break;
            case 30:
                {
                alt16=2;
                }
                break;
            case RULE_ID:
                {
                switch ( input.LA(2) ) {
                case EOF:
                case 15:
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 29:
                    {
                    alt16=5;
                    }
                    break;
                case 31:
                    {
                    alt16=3;
                    }
                    break;
                case 28:
                    {
                    alt16=4;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 3, input);

                    throw nvae;
                }

                }
                break;
            case RULE_INT:
            case RULE_STRING:
            case 32:
            case 33:
            case 34:
            case 35:
                {
                alt16=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalD3ql.g:1046:3: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
                    {
                    // InternalD3ql.g:1046:3: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
                    // InternalD3ql.g:1047:4: otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,28,FOLLOW_9); 

                    				newLeafNode(otherlv_0, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_0_0());
                    			

                    				newCompositeNode(grammarAccess.getPrimaryAccess().getExpressionParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_17);
                    this_Expression_1=ruleExpression();

                    state._fsp--;


                    				current = this_Expression_1;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_2=(Token)match(input,29,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_0_2());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalD3ql.g:1065:3: ( () otherlv_4= '!' ( (lv_expression_5_0= rulePrimary ) ) )
                    {
                    // InternalD3ql.g:1065:3: ( () otherlv_4= '!' ( (lv_expression_5_0= rulePrimary ) ) )
                    // InternalD3ql.g:1066:4: () otherlv_4= '!' ( (lv_expression_5_0= rulePrimary ) )
                    {
                    // InternalD3ql.g:1066:4: ()
                    // InternalD3ql.g:1067:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimaryAccess().getNotAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_4=(Token)match(input,30,FOLLOW_9); 

                    				newLeafNode(otherlv_4, grammarAccess.getPrimaryAccess().getExclamationMarkKeyword_1_1());
                    			
                    // InternalD3ql.g:1077:4: ( (lv_expression_5_0= rulePrimary ) )
                    // InternalD3ql.g:1078:5: (lv_expression_5_0= rulePrimary )
                    {
                    // InternalD3ql.g:1078:5: (lv_expression_5_0= rulePrimary )
                    // InternalD3ql.g:1079:6: lv_expression_5_0= rulePrimary
                    {

                    						newCompositeNode(grammarAccess.getPrimaryAccess().getExpressionPrimaryParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_expression_5_0=rulePrimary();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPrimaryRule());
                    						}
                    						set(
                    							current,
                    							"expression",
                    							lv_expression_5_0,
                    							"nl.coenbijlsma.languages.d3ql.D3ql.Primary");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalD3ql.g:1098:3: this_FQN_6= ruleFQN
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getFQNParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_FQN_6=ruleFQN();

                    state._fsp--;


                    			current = this_FQN_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalD3ql.g:1107:3: this_FunctionCall_7= ruleFunctionCall
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getFunctionCallParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_FunctionCall_7=ruleFunctionCall();

                    state._fsp--;


                    			current = this_FunctionCall_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalD3ql.g:1116:3: this_Atomic_8= ruleAtomic
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getAtomicParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Atomic_8=ruleAtomic();

                    state._fsp--;


                    			current = this_Atomic_8;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "rulePrimary"


    // $ANTLR start "entryRuleFQN"
    // InternalD3ql.g:1128:1: entryRuleFQN returns [EObject current=null] : iv_ruleFQN= ruleFQN EOF ;
    public final EObject entryRuleFQN() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFQN = null;


        try {
            // InternalD3ql.g:1128:44: (iv_ruleFQN= ruleFQN EOF )
            // InternalD3ql.g:1129:2: iv_ruleFQN= ruleFQN EOF
            {
             newCompositeNode(grammarAccess.getFQNRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFQN=ruleFQN();

            state._fsp--;

             current =iv_ruleFQN; 
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
    // $ANTLR end "entryRuleFQN"


    // $ANTLR start "ruleFQN"
    // InternalD3ql.g:1135:1: ruleFQN returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (lv_tail_2_0= RULE_ID ) ) (otherlv_3= '.' ( (lv_tail_4_0= RULE_ID ) ) )* ) ;
    public final EObject ruleFQN() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_tail_2_0=null;
        Token otherlv_3=null;
        Token lv_tail_4_0=null;


        	enterRule();

        try {
            // InternalD3ql.g:1141:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (lv_tail_2_0= RULE_ID ) ) (otherlv_3= '.' ( (lv_tail_4_0= RULE_ID ) ) )* ) )
            // InternalD3ql.g:1142:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (lv_tail_2_0= RULE_ID ) ) (otherlv_3= '.' ( (lv_tail_4_0= RULE_ID ) ) )* )
            {
            // InternalD3ql.g:1142:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (lv_tail_2_0= RULE_ID ) ) (otherlv_3= '.' ( (lv_tail_4_0= RULE_ID ) ) )* )
            // InternalD3ql.g:1143:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (lv_tail_2_0= RULE_ID ) ) (otherlv_3= '.' ( (lv_tail_4_0= RULE_ID ) ) )*
            {
            // InternalD3ql.g:1143:3: ( (otherlv_0= RULE_ID ) )
            // InternalD3ql.g:1144:4: (otherlv_0= RULE_ID )
            {
            // InternalD3ql.g:1144:4: (otherlv_0= RULE_ID )
            // InternalD3ql.g:1145:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFQNRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_18); 

            					newLeafNode(otherlv_0, grammarAccess.getFQNAccess().getHeadNamedCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,31,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getFQNAccess().getFullStopKeyword_1());
            		
            // InternalD3ql.g:1160:3: ( (lv_tail_2_0= RULE_ID ) )
            // InternalD3ql.g:1161:4: (lv_tail_2_0= RULE_ID )
            {
            // InternalD3ql.g:1161:4: (lv_tail_2_0= RULE_ID )
            // InternalD3ql.g:1162:5: lv_tail_2_0= RULE_ID
            {
            lv_tail_2_0=(Token)match(input,RULE_ID,FOLLOW_19); 

            					newLeafNode(lv_tail_2_0, grammarAccess.getFQNAccess().getTailIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFQNRule());
            					}
            					addWithLastConsumed(
            						current,
            						"tail",
            						lv_tail_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalD3ql.g:1178:3: (otherlv_3= '.' ( (lv_tail_4_0= RULE_ID ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==31) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalD3ql.g:1179:4: otherlv_3= '.' ( (lv_tail_4_0= RULE_ID ) )
            	    {
            	    otherlv_3=(Token)match(input,31,FOLLOW_5); 

            	    				newLeafNode(otherlv_3, grammarAccess.getFQNAccess().getFullStopKeyword_3_0());
            	    			
            	    // InternalD3ql.g:1183:4: ( (lv_tail_4_0= RULE_ID ) )
            	    // InternalD3ql.g:1184:5: (lv_tail_4_0= RULE_ID )
            	    {
            	    // InternalD3ql.g:1184:5: (lv_tail_4_0= RULE_ID )
            	    // InternalD3ql.g:1185:6: lv_tail_4_0= RULE_ID
            	    {
            	    lv_tail_4_0=(Token)match(input,RULE_ID,FOLLOW_19); 

            	    						newLeafNode(lv_tail_4_0, grammarAccess.getFQNAccess().getTailIDTerminalRuleCall_3_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getFQNRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"tail",
            	    							lv_tail_4_0,
            	    							"org.eclipse.xtext.common.Terminals.ID");
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


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
    // $ANTLR end "ruleFQN"


    // $ANTLR start "entryRuleFunctionCall"
    // InternalD3ql.g:1206:1: entryRuleFunctionCall returns [EObject current=null] : iv_ruleFunctionCall= ruleFunctionCall EOF ;
    public final EObject entryRuleFunctionCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionCall = null;


        try {
            // InternalD3ql.g:1206:53: (iv_ruleFunctionCall= ruleFunctionCall EOF )
            // InternalD3ql.g:1207:2: iv_ruleFunctionCall= ruleFunctionCall EOF
            {
             newCompositeNode(grammarAccess.getFunctionCallRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFunctionCall=ruleFunctionCall();

            state._fsp--;

             current =iv_ruleFunctionCall; 
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
    // $ANTLR end "entryRuleFunctionCall"


    // $ANTLR start "ruleFunctionCall"
    // InternalD3ql.g:1213:1: ruleFunctionCall returns [EObject current=null] : ( ( (lv_function_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_arguments_2_0= ruleFunctionArgument ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleFunctionArgument ) ) )* )? otherlv_5= ')' ) ;
    public final EObject ruleFunctionCall() throws RecognitionException {
        EObject current = null;

        Token lv_function_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_arguments_2_0 = null;

        EObject lv_arguments_4_0 = null;



        	enterRule();

        try {
            // InternalD3ql.g:1219:2: ( ( ( (lv_function_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_arguments_2_0= ruleFunctionArgument ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleFunctionArgument ) ) )* )? otherlv_5= ')' ) )
            // InternalD3ql.g:1220:2: ( ( (lv_function_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_arguments_2_0= ruleFunctionArgument ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleFunctionArgument ) ) )* )? otherlv_5= ')' )
            {
            // InternalD3ql.g:1220:2: ( ( (lv_function_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_arguments_2_0= ruleFunctionArgument ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleFunctionArgument ) ) )* )? otherlv_5= ')' )
            // InternalD3ql.g:1221:3: ( (lv_function_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_arguments_2_0= ruleFunctionArgument ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleFunctionArgument ) ) )* )? otherlv_5= ')'
            {
            // InternalD3ql.g:1221:3: ( (lv_function_0_0= RULE_ID ) )
            // InternalD3ql.g:1222:4: (lv_function_0_0= RULE_ID )
            {
            // InternalD3ql.g:1222:4: (lv_function_0_0= RULE_ID )
            // InternalD3ql.g:1223:5: lv_function_0_0= RULE_ID
            {
            lv_function_0_0=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(lv_function_0_0, grammarAccess.getFunctionCallAccess().getFunctionIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFunctionCallRule());
            					}
            					setWithLastConsumed(
            						current,
            						"function",
            						lv_function_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,28,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getFunctionCallAccess().getLeftParenthesisKeyword_1());
            		
            // InternalD3ql.g:1243:3: ( ( (lv_arguments_2_0= ruleFunctionArgument ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleFunctionArgument ) ) )* )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_ID) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalD3ql.g:1244:4: ( (lv_arguments_2_0= ruleFunctionArgument ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleFunctionArgument ) ) )*
                    {
                    // InternalD3ql.g:1244:4: ( (lv_arguments_2_0= ruleFunctionArgument ) )
                    // InternalD3ql.g:1245:5: (lv_arguments_2_0= ruleFunctionArgument )
                    {
                    // InternalD3ql.g:1245:5: (lv_arguments_2_0= ruleFunctionArgument )
                    // InternalD3ql.g:1246:6: lv_arguments_2_0= ruleFunctionArgument
                    {

                    						newCompositeNode(grammarAccess.getFunctionCallAccess().getArgumentsFunctionArgumentParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_arguments_2_0=ruleFunctionArgument();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFunctionCallRule());
                    						}
                    						add(
                    							current,
                    							"arguments",
                    							lv_arguments_2_0,
                    							"nl.coenbijlsma.languages.d3ql.D3ql.FunctionArgument");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalD3ql.g:1263:4: (otherlv_3= ',' ( (lv_arguments_4_0= ruleFunctionArgument ) ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==12) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalD3ql.g:1264:5: otherlv_3= ',' ( (lv_arguments_4_0= ruleFunctionArgument ) )
                    	    {
                    	    otherlv_3=(Token)match(input,12,FOLLOW_5); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getFunctionCallAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalD3ql.g:1268:5: ( (lv_arguments_4_0= ruleFunctionArgument ) )
                    	    // InternalD3ql.g:1269:6: (lv_arguments_4_0= ruleFunctionArgument )
                    	    {
                    	    // InternalD3ql.g:1269:6: (lv_arguments_4_0= ruleFunctionArgument )
                    	    // InternalD3ql.g:1270:7: lv_arguments_4_0= ruleFunctionArgument
                    	    {

                    	    							newCompositeNode(grammarAccess.getFunctionCallAccess().getArgumentsFunctionArgumentParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_16);
                    	    lv_arguments_4_0=ruleFunctionArgument();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getFunctionCallRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"arguments",
                    	    								lv_arguments_4_0,
                    	    								"nl.coenbijlsma.languages.d3ql.D3ql.FunctionArgument");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,29,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getFunctionCallAccess().getRightParenthesisKeyword_3());
            		

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
    // $ANTLR end "ruleFunctionCall"


    // $ANTLR start "entryRuleFunctionArgument"
    // InternalD3ql.g:1297:1: entryRuleFunctionArgument returns [EObject current=null] : iv_ruleFunctionArgument= ruleFunctionArgument EOF ;
    public final EObject entryRuleFunctionArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionArgument = null;


        try {
            // InternalD3ql.g:1297:57: (iv_ruleFunctionArgument= ruleFunctionArgument EOF )
            // InternalD3ql.g:1298:2: iv_ruleFunctionArgument= ruleFunctionArgument EOF
            {
             newCompositeNode(grammarAccess.getFunctionArgumentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFunctionArgument=ruleFunctionArgument();

            state._fsp--;

             current =iv_ruleFunctionArgument; 
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
    // $ANTLR end "entryRuleFunctionArgument"


    // $ANTLR start "ruleFunctionArgument"
    // InternalD3ql.g:1304:1: ruleFunctionArgument returns [EObject current=null] : ( () ( ( (otherlv_1= RULE_ID ) ) | ( (lv_fqn_2_0= ruleFQN ) ) ) ) ;
    public final EObject ruleFunctionArgument() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_fqn_2_0 = null;



        	enterRule();

        try {
            // InternalD3ql.g:1310:2: ( ( () ( ( (otherlv_1= RULE_ID ) ) | ( (lv_fqn_2_0= ruleFQN ) ) ) ) )
            // InternalD3ql.g:1311:2: ( () ( ( (otherlv_1= RULE_ID ) ) | ( (lv_fqn_2_0= ruleFQN ) ) ) )
            {
            // InternalD3ql.g:1311:2: ( () ( ( (otherlv_1= RULE_ID ) ) | ( (lv_fqn_2_0= ruleFQN ) ) ) )
            // InternalD3ql.g:1312:3: () ( ( (otherlv_1= RULE_ID ) ) | ( (lv_fqn_2_0= ruleFQN ) ) )
            {
            // InternalD3ql.g:1312:3: ()
            // InternalD3ql.g:1313:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFunctionArgumentAccess().getFunctionArgumentAction_0(),
            					current);
            			

            }

            // InternalD3ql.g:1319:3: ( ( (otherlv_1= RULE_ID ) ) | ( (lv_fqn_2_0= ruleFQN ) ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_ID) ) {
                int LA20_1 = input.LA(2);

                if ( (LA20_1==EOF||LA20_1==12||LA20_1==29) ) {
                    alt20=1;
                }
                else if ( (LA20_1==31) ) {
                    alt20=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 20, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalD3ql.g:1320:4: ( (otherlv_1= RULE_ID ) )
                    {
                    // InternalD3ql.g:1320:4: ( (otherlv_1= RULE_ID ) )
                    // InternalD3ql.g:1321:5: (otherlv_1= RULE_ID )
                    {
                    // InternalD3ql.g:1321:5: (otherlv_1= RULE_ID )
                    // InternalD3ql.g:1322:6: otherlv_1= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFunctionArgumentRule());
                    						}
                    					
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(otherlv_1, grammarAccess.getFunctionArgumentAccess().getReferenceNamedCrossReference_1_0_0());
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalD3ql.g:1334:4: ( (lv_fqn_2_0= ruleFQN ) )
                    {
                    // InternalD3ql.g:1334:4: ( (lv_fqn_2_0= ruleFQN ) )
                    // InternalD3ql.g:1335:5: (lv_fqn_2_0= ruleFQN )
                    {
                    // InternalD3ql.g:1335:5: (lv_fqn_2_0= ruleFQN )
                    // InternalD3ql.g:1336:6: lv_fqn_2_0= ruleFQN
                    {

                    						newCompositeNode(grammarAccess.getFunctionArgumentAccess().getFqnFQNParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_fqn_2_0=ruleFQN();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFunctionArgumentRule());
                    						}
                    						set(
                    							current,
                    							"fqn",
                    							lv_fqn_2_0,
                    							"nl.coenbijlsma.languages.d3ql.D3ql.FQN");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


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
    // $ANTLR end "ruleFunctionArgument"


    // $ANTLR start "entryRuleAtomic"
    // InternalD3ql.g:1358:1: entryRuleAtomic returns [EObject current=null] : iv_ruleAtomic= ruleAtomic EOF ;
    public final EObject entryRuleAtomic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomic = null;


        try {
            // InternalD3ql.g:1358:47: (iv_ruleAtomic= ruleAtomic EOF )
            // InternalD3ql.g:1359:2: iv_ruleAtomic= ruleAtomic EOF
            {
             newCompositeNode(grammarAccess.getAtomicRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAtomic=ruleAtomic();

            state._fsp--;

             current =iv_ruleAtomic; 
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
    // $ANTLR end "entryRuleAtomic"


    // $ANTLR start "ruleAtomic"
    // InternalD3ql.g:1365:1: ruleAtomic returns [EObject current=null] : ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) ) | ( () ( (lv_value_7_0= 'null' ) ) ) | ( () otherlv_9= '{' ( (lv_value_10_0= RULE_ID ) ) otherlv_11= '}' ) | ( () ( (otherlv_13= RULE_ID ) ) ) ) ;
    public final EObject ruleAtomic() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token lv_value_3_0=null;
        Token lv_value_5_1=null;
        Token lv_value_5_2=null;
        Token lv_value_7_0=null;
        Token otherlv_9=null;
        Token lv_value_10_0=null;
        Token otherlv_11=null;
        Token otherlv_13=null;


        	enterRule();

        try {
            // InternalD3ql.g:1371:2: ( ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) ) | ( () ( (lv_value_7_0= 'null' ) ) ) | ( () otherlv_9= '{' ( (lv_value_10_0= RULE_ID ) ) otherlv_11= '}' ) | ( () ( (otherlv_13= RULE_ID ) ) ) ) )
            // InternalD3ql.g:1372:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) ) | ( () ( (lv_value_7_0= 'null' ) ) ) | ( () otherlv_9= '{' ( (lv_value_10_0= RULE_ID ) ) otherlv_11= '}' ) | ( () ( (otherlv_13= RULE_ID ) ) ) )
            {
            // InternalD3ql.g:1372:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) ) | ( () ( (lv_value_7_0= 'null' ) ) ) | ( () otherlv_9= '{' ( (lv_value_10_0= RULE_ID ) ) otherlv_11= '}' ) | ( () ( (otherlv_13= RULE_ID ) ) ) )
            int alt22=6;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt22=1;
                }
                break;
            case RULE_STRING:
                {
                alt22=2;
                }
                break;
            case 32:
            case 33:
                {
                alt22=3;
                }
                break;
            case 34:
                {
                alt22=4;
                }
                break;
            case 35:
                {
                alt22=5;
                }
                break;
            case RULE_ID:
                {
                alt22=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // InternalD3ql.g:1373:3: ( () ( (lv_value_1_0= RULE_INT ) ) )
                    {
                    // InternalD3ql.g:1373:3: ( () ( (lv_value_1_0= RULE_INT ) ) )
                    // InternalD3ql.g:1374:4: () ( (lv_value_1_0= RULE_INT ) )
                    {
                    // InternalD3ql.g:1374:4: ()
                    // InternalD3ql.g:1375:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicAccess().getIntConstantAction_0_0(),
                    						current);
                    				

                    }

                    // InternalD3ql.g:1381:4: ( (lv_value_1_0= RULE_INT ) )
                    // InternalD3ql.g:1382:5: (lv_value_1_0= RULE_INT )
                    {
                    // InternalD3ql.g:1382:5: (lv_value_1_0= RULE_INT )
                    // InternalD3ql.g:1383:6: lv_value_1_0= RULE_INT
                    {
                    lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_value_1_0, grammarAccess.getAtomicAccess().getValueINTTerminalRuleCall_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAtomicRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_1_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalD3ql.g:1401:3: ( () ( (lv_value_3_0= RULE_STRING ) ) )
                    {
                    // InternalD3ql.g:1401:3: ( () ( (lv_value_3_0= RULE_STRING ) ) )
                    // InternalD3ql.g:1402:4: () ( (lv_value_3_0= RULE_STRING ) )
                    {
                    // InternalD3ql.g:1402:4: ()
                    // InternalD3ql.g:1403:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicAccess().getStringConstantAction_1_0(),
                    						current);
                    				

                    }

                    // InternalD3ql.g:1409:4: ( (lv_value_3_0= RULE_STRING ) )
                    // InternalD3ql.g:1410:5: (lv_value_3_0= RULE_STRING )
                    {
                    // InternalD3ql.g:1410:5: (lv_value_3_0= RULE_STRING )
                    // InternalD3ql.g:1411:6: lv_value_3_0= RULE_STRING
                    {
                    lv_value_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_value_3_0, grammarAccess.getAtomicAccess().getValueSTRINGTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAtomicRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_3_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalD3ql.g:1429:3: ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) )
                    {
                    // InternalD3ql.g:1429:3: ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) )
                    // InternalD3ql.g:1430:4: () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) )
                    {
                    // InternalD3ql.g:1430:4: ()
                    // InternalD3ql.g:1431:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicAccess().getBooleanConstantAction_2_0(),
                    						current);
                    				

                    }

                    // InternalD3ql.g:1437:4: ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) )
                    // InternalD3ql.g:1438:5: ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) )
                    {
                    // InternalD3ql.g:1438:5: ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) )
                    // InternalD3ql.g:1439:6: (lv_value_5_1= 'true' | lv_value_5_2= 'false' )
                    {
                    // InternalD3ql.g:1439:6: (lv_value_5_1= 'true' | lv_value_5_2= 'false' )
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==32) ) {
                        alt21=1;
                    }
                    else if ( (LA21_0==33) ) {
                        alt21=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 21, 0, input);

                        throw nvae;
                    }
                    switch (alt21) {
                        case 1 :
                            // InternalD3ql.g:1440:7: lv_value_5_1= 'true'
                            {
                            lv_value_5_1=(Token)match(input,32,FOLLOW_2); 

                            							newLeafNode(lv_value_5_1, grammarAccess.getAtomicAccess().getValueTrueKeyword_2_1_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getAtomicRule());
                            							}
                            							setWithLastConsumed(current, "value", lv_value_5_1, null);
                            						

                            }
                            break;
                        case 2 :
                            // InternalD3ql.g:1451:7: lv_value_5_2= 'false'
                            {
                            lv_value_5_2=(Token)match(input,33,FOLLOW_2); 

                            							newLeafNode(lv_value_5_2, grammarAccess.getAtomicAccess().getValueFalseKeyword_2_1_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getAtomicRule());
                            							}
                            							setWithLastConsumed(current, "value", lv_value_5_2, null);
                            						

                            }
                            break;

                    }


                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalD3ql.g:1466:3: ( () ( (lv_value_7_0= 'null' ) ) )
                    {
                    // InternalD3ql.g:1466:3: ( () ( (lv_value_7_0= 'null' ) ) )
                    // InternalD3ql.g:1467:4: () ( (lv_value_7_0= 'null' ) )
                    {
                    // InternalD3ql.g:1467:4: ()
                    // InternalD3ql.g:1468:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicAccess().getNullConstantAction_3_0(),
                    						current);
                    				

                    }

                    // InternalD3ql.g:1474:4: ( (lv_value_7_0= 'null' ) )
                    // InternalD3ql.g:1475:5: (lv_value_7_0= 'null' )
                    {
                    // InternalD3ql.g:1475:5: (lv_value_7_0= 'null' )
                    // InternalD3ql.g:1476:6: lv_value_7_0= 'null'
                    {
                    lv_value_7_0=(Token)match(input,34,FOLLOW_2); 

                    						newLeafNode(lv_value_7_0, grammarAccess.getAtomicAccess().getValueNullKeyword_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAtomicRule());
                    						}
                    						setWithLastConsumed(current, "value", lv_value_7_0, "null");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalD3ql.g:1490:3: ( () otherlv_9= '{' ( (lv_value_10_0= RULE_ID ) ) otherlv_11= '}' )
                    {
                    // InternalD3ql.g:1490:3: ( () otherlv_9= '{' ( (lv_value_10_0= RULE_ID ) ) otherlv_11= '}' )
                    // InternalD3ql.g:1491:4: () otherlv_9= '{' ( (lv_value_10_0= RULE_ID ) ) otherlv_11= '}'
                    {
                    // InternalD3ql.g:1491:4: ()
                    // InternalD3ql.g:1492:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicAccess().getTemplatedValueAction_4_0(),
                    						current);
                    				

                    }

                    otherlv_9=(Token)match(input,35,FOLLOW_5); 

                    				newLeafNode(otherlv_9, grammarAccess.getAtomicAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalD3ql.g:1502:4: ( (lv_value_10_0= RULE_ID ) )
                    // InternalD3ql.g:1503:5: (lv_value_10_0= RULE_ID )
                    {
                    // InternalD3ql.g:1503:5: (lv_value_10_0= RULE_ID )
                    // InternalD3ql.g:1504:6: lv_value_10_0= RULE_ID
                    {
                    lv_value_10_0=(Token)match(input,RULE_ID,FOLLOW_21); 

                    						newLeafNode(lv_value_10_0, grammarAccess.getAtomicAccess().getValueIDTerminalRuleCall_4_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAtomicRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_10_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    otherlv_11=(Token)match(input,36,FOLLOW_2); 

                    				newLeafNode(otherlv_11, grammarAccess.getAtomicAccess().getRightCurlyBracketKeyword_4_3());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalD3ql.g:1526:3: ( () ( (otherlv_13= RULE_ID ) ) )
                    {
                    // InternalD3ql.g:1526:3: ( () ( (otherlv_13= RULE_ID ) ) )
                    // InternalD3ql.g:1527:4: () ( (otherlv_13= RULE_ID ) )
                    {
                    // InternalD3ql.g:1527:4: ()
                    // InternalD3ql.g:1528:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicAccess().getReferenceAction_5_0(),
                    						current);
                    				

                    }

                    // InternalD3ql.g:1534:4: ( (otherlv_13= RULE_ID ) )
                    // InternalD3ql.g:1535:5: (otherlv_13= RULE_ID )
                    {
                    // InternalD3ql.g:1535:5: (otherlv_13= RULE_ID )
                    // InternalD3ql.g:1536:6: otherlv_13= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAtomicRule());
                    						}
                    					
                    otherlv_13=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(otherlv_13, grammarAccess.getAtomicAccess().getValueNamedCrossReference_5_1_0());
                    					

                    }


                    }


                    }


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
    // $ANTLR end "ruleAtomic"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000F50004070L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000180002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x000000000FE00002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000020001000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000020000010L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000001000000000L});

}