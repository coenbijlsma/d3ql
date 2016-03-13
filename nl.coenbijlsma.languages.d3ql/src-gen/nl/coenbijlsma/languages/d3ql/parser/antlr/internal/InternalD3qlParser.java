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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'from'", "','", "'as'", "'select'", "'.'", "'('", "')'", "'true'", "'false'"
    };
    public static final int RULE_STRING=6;
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
    public static final int RULE_INT=5;
    public static final int RULE_ML_COMMENT=7;

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
    // InternalD3ql.g:71:1: ruleQuery returns [EObject current=null] : ( ( (lv_fromStatement_0_0= ruleFromStatement ) ) ( (lv_selectStatement_1_0= ruleSelectStatement ) ) ) ;
    public final EObject ruleQuery() throws RecognitionException {
        EObject current = null;

        EObject lv_fromStatement_0_0 = null;

        EObject lv_selectStatement_1_0 = null;



        	enterRule();

        try {
            // InternalD3ql.g:77:2: ( ( ( (lv_fromStatement_0_0= ruleFromStatement ) ) ( (lv_selectStatement_1_0= ruleSelectStatement ) ) ) )
            // InternalD3ql.g:78:2: ( ( (lv_fromStatement_0_0= ruleFromStatement ) ) ( (lv_selectStatement_1_0= ruleSelectStatement ) ) )
            {
            // InternalD3ql.g:78:2: ( ( (lv_fromStatement_0_0= ruleFromStatement ) ) ( (lv_selectStatement_1_0= ruleSelectStatement ) ) )
            // InternalD3ql.g:79:3: ( (lv_fromStatement_0_0= ruleFromStatement ) ) ( (lv_selectStatement_1_0= ruleSelectStatement ) )
            {
            // InternalD3ql.g:79:3: ( (lv_fromStatement_0_0= ruleFromStatement ) )
            // InternalD3ql.g:80:4: (lv_fromStatement_0_0= ruleFromStatement )
            {
            // InternalD3ql.g:80:4: (lv_fromStatement_0_0= ruleFromStatement )
            // InternalD3ql.g:81:5: lv_fromStatement_0_0= ruleFromStatement
            {

            					newCompositeNode(grammarAccess.getQueryAccess().getFromStatementFromStatementParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_fromStatement_0_0=ruleFromStatement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getQueryRule());
            					}
            					set(
            						current,
            						"fromStatement",
            						lv_fromStatement_0_0,
            						"nl.coenbijlsma.languages.d3ql.D3ql.FromStatement");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalD3ql.g:98:3: ( (lv_selectStatement_1_0= ruleSelectStatement ) )
            // InternalD3ql.g:99:4: (lv_selectStatement_1_0= ruleSelectStatement )
            {
            // InternalD3ql.g:99:4: (lv_selectStatement_1_0= ruleSelectStatement )
            // InternalD3ql.g:100:5: lv_selectStatement_1_0= ruleSelectStatement
            {

            					newCompositeNode(grammarAccess.getQueryAccess().getSelectStatementSelectStatementParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_selectStatement_1_0=ruleSelectStatement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getQueryRule());
            					}
            					set(
            						current,
            						"selectStatement",
            						lv_selectStatement_1_0,
            						"nl.coenbijlsma.languages.d3ql.D3ql.SelectStatement");
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
    // $ANTLR end "ruleQuery"


    // $ANTLR start "entryRuleFromStatement"
    // InternalD3ql.g:121:1: entryRuleFromStatement returns [EObject current=null] : iv_ruleFromStatement= ruleFromStatement EOF ;
    public final EObject entryRuleFromStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFromStatement = null;


        try {
            // InternalD3ql.g:121:54: (iv_ruleFromStatement= ruleFromStatement EOF )
            // InternalD3ql.g:122:2: iv_ruleFromStatement= ruleFromStatement EOF
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
    // InternalD3ql.g:128:1: ruleFromStatement returns [EObject current=null] : (otherlv_0= 'from' ( (lv_aggregates_1_0= ruleAggregateRoot ) ) (otherlv_2= ',' ( (lv_aggregates_3_0= ruleAggregateRoot ) ) )* ) ;
    public final EObject ruleFromStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_aggregates_1_0 = null;

        EObject lv_aggregates_3_0 = null;



        	enterRule();

        try {
            // InternalD3ql.g:134:2: ( (otherlv_0= 'from' ( (lv_aggregates_1_0= ruleAggregateRoot ) ) (otherlv_2= ',' ( (lv_aggregates_3_0= ruleAggregateRoot ) ) )* ) )
            // InternalD3ql.g:135:2: (otherlv_0= 'from' ( (lv_aggregates_1_0= ruleAggregateRoot ) ) (otherlv_2= ',' ( (lv_aggregates_3_0= ruleAggregateRoot ) ) )* )
            {
            // InternalD3ql.g:135:2: (otherlv_0= 'from' ( (lv_aggregates_1_0= ruleAggregateRoot ) ) (otherlv_2= ',' ( (lv_aggregates_3_0= ruleAggregateRoot ) ) )* )
            // InternalD3ql.g:136:3: otherlv_0= 'from' ( (lv_aggregates_1_0= ruleAggregateRoot ) ) (otherlv_2= ',' ( (lv_aggregates_3_0= ruleAggregateRoot ) ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getFromStatementAccess().getFromKeyword_0());
            		
            // InternalD3ql.g:140:3: ( (lv_aggregates_1_0= ruleAggregateRoot ) )
            // InternalD3ql.g:141:4: (lv_aggregates_1_0= ruleAggregateRoot )
            {
            // InternalD3ql.g:141:4: (lv_aggregates_1_0= ruleAggregateRoot )
            // InternalD3ql.g:142:5: lv_aggregates_1_0= ruleAggregateRoot
            {

            					newCompositeNode(grammarAccess.getFromStatementAccess().getAggregatesAggregateRootParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
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

            // InternalD3ql.g:159:3: (otherlv_2= ',' ( (lv_aggregates_3_0= ruleAggregateRoot ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalD3ql.g:160:4: otherlv_2= ',' ( (lv_aggregates_3_0= ruleAggregateRoot ) )
            	    {
            	    otherlv_2=(Token)match(input,12,FOLLOW_4); 

            	    				newLeafNode(otherlv_2, grammarAccess.getFromStatementAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalD3ql.g:164:4: ( (lv_aggregates_3_0= ruleAggregateRoot ) )
            	    // InternalD3ql.g:165:5: (lv_aggregates_3_0= ruleAggregateRoot )
            	    {
            	    // InternalD3ql.g:165:5: (lv_aggregates_3_0= ruleAggregateRoot )
            	    // InternalD3ql.g:166:6: lv_aggregates_3_0= ruleAggregateRoot
            	    {

            	    						newCompositeNode(grammarAccess.getFromStatementAccess().getAggregatesAggregateRootParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_5);
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
            	    break loop1;
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


    // $ANTLR start "entryRuleAggregateRoot"
    // InternalD3ql.g:188:1: entryRuleAggregateRoot returns [EObject current=null] : iv_ruleAggregateRoot= ruleAggregateRoot EOF ;
    public final EObject entryRuleAggregateRoot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAggregateRoot = null;


        try {
            // InternalD3ql.g:188:54: (iv_ruleAggregateRoot= ruleAggregateRoot EOF )
            // InternalD3ql.g:189:2: iv_ruleAggregateRoot= ruleAggregateRoot EOF
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
    // InternalD3ql.g:195:1: ruleAggregateRoot returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'as' ( (lv_alias_2_0= ruleAlias ) ) )? ) ;
    public final EObject ruleAggregateRoot() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_alias_2_0 = null;



        	enterRule();

        try {
            // InternalD3ql.g:201:2: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'as' ( (lv_alias_2_0= ruleAlias ) ) )? ) )
            // InternalD3ql.g:202:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'as' ( (lv_alias_2_0= ruleAlias ) ) )? )
            {
            // InternalD3ql.g:202:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'as' ( (lv_alias_2_0= ruleAlias ) ) )? )
            // InternalD3ql.g:203:3: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'as' ( (lv_alias_2_0= ruleAlias ) ) )?
            {
            // InternalD3ql.g:203:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalD3ql.g:204:4: (lv_name_0_0= RULE_ID )
            {
            // InternalD3ql.g:204:4: (lv_name_0_0= RULE_ID )
            // InternalD3ql.g:205:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_6); 

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

            // InternalD3ql.g:221:3: (otherlv_1= 'as' ( (lv_alias_2_0= ruleAlias ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalD3ql.g:222:4: otherlv_1= 'as' ( (lv_alias_2_0= ruleAlias ) )
                    {
                    otherlv_1=(Token)match(input,13,FOLLOW_4); 

                    				newLeafNode(otherlv_1, grammarAccess.getAggregateRootAccess().getAsKeyword_1_0());
                    			
                    // InternalD3ql.g:226:4: ( (lv_alias_2_0= ruleAlias ) )
                    // InternalD3ql.g:227:5: (lv_alias_2_0= ruleAlias )
                    {
                    // InternalD3ql.g:227:5: (lv_alias_2_0= ruleAlias )
                    // InternalD3ql.g:228:6: lv_alias_2_0= ruleAlias
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
    // InternalD3ql.g:250:1: entryRuleAlias returns [EObject current=null] : iv_ruleAlias= ruleAlias EOF ;
    public final EObject entryRuleAlias() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlias = null;


        try {
            // InternalD3ql.g:250:46: (iv_ruleAlias= ruleAlias EOF )
            // InternalD3ql.g:251:2: iv_ruleAlias= ruleAlias EOF
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
    // InternalD3ql.g:257:1: ruleAlias returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleAlias() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalD3ql.g:263:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalD3ql.g:264:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalD3ql.g:264:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalD3ql.g:265:3: (lv_name_0_0= RULE_ID )
            {
            // InternalD3ql.g:265:3: (lv_name_0_0= RULE_ID )
            // InternalD3ql.g:266:4: lv_name_0_0= RULE_ID
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


    // $ANTLR start "entryRuleSelectStatement"
    // InternalD3ql.g:285:1: entryRuleSelectStatement returns [EObject current=null] : iv_ruleSelectStatement= ruleSelectStatement EOF ;
    public final EObject entryRuleSelectStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectStatement = null;


        try {
            // InternalD3ql.g:285:56: (iv_ruleSelectStatement= ruleSelectStatement EOF )
            // InternalD3ql.g:286:2: iv_ruleSelectStatement= ruleSelectStatement EOF
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
    // InternalD3ql.g:292:1: ruleSelectStatement returns [EObject current=null] : (otherlv_0= 'select' ( (lv_expressions_1_0= ruleSelectExpression ) ) (otherlv_2= ',' ( (lv_expressions_3_0= ruleSelectExpression ) ) )* ) ;
    public final EObject ruleSelectStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_expressions_1_0 = null;

        EObject lv_expressions_3_0 = null;



        	enterRule();

        try {
            // InternalD3ql.g:298:2: ( (otherlv_0= 'select' ( (lv_expressions_1_0= ruleSelectExpression ) ) (otherlv_2= ',' ( (lv_expressions_3_0= ruleSelectExpression ) ) )* ) )
            // InternalD3ql.g:299:2: (otherlv_0= 'select' ( (lv_expressions_1_0= ruleSelectExpression ) ) (otherlv_2= ',' ( (lv_expressions_3_0= ruleSelectExpression ) ) )* )
            {
            // InternalD3ql.g:299:2: (otherlv_0= 'select' ( (lv_expressions_1_0= ruleSelectExpression ) ) (otherlv_2= ',' ( (lv_expressions_3_0= ruleSelectExpression ) ) )* )
            // InternalD3ql.g:300:3: otherlv_0= 'select' ( (lv_expressions_1_0= ruleSelectExpression ) ) (otherlv_2= ',' ( (lv_expressions_3_0= ruleSelectExpression ) ) )*
            {
            otherlv_0=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getSelectStatementAccess().getSelectKeyword_0());
            		
            // InternalD3ql.g:304:3: ( (lv_expressions_1_0= ruleSelectExpression ) )
            // InternalD3ql.g:305:4: (lv_expressions_1_0= ruleSelectExpression )
            {
            // InternalD3ql.g:305:4: (lv_expressions_1_0= ruleSelectExpression )
            // InternalD3ql.g:306:5: lv_expressions_1_0= ruleSelectExpression
            {

            					newCompositeNode(grammarAccess.getSelectStatementAccess().getExpressionsSelectExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
            lv_expressions_1_0=ruleSelectExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSelectStatementRule());
            					}
            					add(
            						current,
            						"expressions",
            						lv_expressions_1_0,
            						"nl.coenbijlsma.languages.d3ql.D3ql.SelectExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalD3ql.g:323:3: (otherlv_2= ',' ( (lv_expressions_3_0= ruleSelectExpression ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==12) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalD3ql.g:324:4: otherlv_2= ',' ( (lv_expressions_3_0= ruleSelectExpression ) )
            	    {
            	    otherlv_2=(Token)match(input,12,FOLLOW_7); 

            	    				newLeafNode(otherlv_2, grammarAccess.getSelectStatementAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalD3ql.g:328:4: ( (lv_expressions_3_0= ruleSelectExpression ) )
            	    // InternalD3ql.g:329:5: (lv_expressions_3_0= ruleSelectExpression )
            	    {
            	    // InternalD3ql.g:329:5: (lv_expressions_3_0= ruleSelectExpression )
            	    // InternalD3ql.g:330:6: lv_expressions_3_0= ruleSelectExpression
            	    {

            	    						newCompositeNode(grammarAccess.getSelectStatementAccess().getExpressionsSelectExpressionParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_5);
            	    lv_expressions_3_0=ruleSelectExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSelectStatementRule());
            	    						}
            	    						add(
            	    							current,
            	    							"expressions",
            	    							lv_expressions_3_0,
            	    							"nl.coenbijlsma.languages.d3ql.D3ql.SelectExpression");
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


    // $ANTLR start "entryRuleSelectExpression"
    // InternalD3ql.g:352:1: entryRuleSelectExpression returns [EObject current=null] : iv_ruleSelectExpression= ruleSelectExpression EOF ;
    public final EObject entryRuleSelectExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectExpression = null;


        try {
            // InternalD3ql.g:352:57: (iv_ruleSelectExpression= ruleSelectExpression EOF )
            // InternalD3ql.g:353:2: iv_ruleSelectExpression= ruleSelectExpression EOF
            {
             newCompositeNode(grammarAccess.getSelectExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSelectExpression=ruleSelectExpression();

            state._fsp--;

             current =iv_ruleSelectExpression; 
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
    // $ANTLR end "entryRuleSelectExpression"


    // $ANTLR start "ruleSelectExpression"
    // InternalD3ql.g:359:1: ruleSelectExpression returns [EObject current=null] : ( ( ( (lv_expression_0_1= rulePathExpression | lv_expression_0_2= ruleFunctionCall | lv_expression_0_3= ruleLiteral ) ) ) (otherlv_1= 'as' ( (lv_alias_2_0= ruleAlias ) ) )? ) ;
    public final EObject ruleSelectExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_0_1 = null;

        EObject lv_expression_0_2 = null;

        EObject lv_expression_0_3 = null;

        EObject lv_alias_2_0 = null;



        	enterRule();

        try {
            // InternalD3ql.g:365:2: ( ( ( ( (lv_expression_0_1= rulePathExpression | lv_expression_0_2= ruleFunctionCall | lv_expression_0_3= ruleLiteral ) ) ) (otherlv_1= 'as' ( (lv_alias_2_0= ruleAlias ) ) )? ) )
            // InternalD3ql.g:366:2: ( ( ( (lv_expression_0_1= rulePathExpression | lv_expression_0_2= ruleFunctionCall | lv_expression_0_3= ruleLiteral ) ) ) (otherlv_1= 'as' ( (lv_alias_2_0= ruleAlias ) ) )? )
            {
            // InternalD3ql.g:366:2: ( ( ( (lv_expression_0_1= rulePathExpression | lv_expression_0_2= ruleFunctionCall | lv_expression_0_3= ruleLiteral ) ) ) (otherlv_1= 'as' ( (lv_alias_2_0= ruleAlias ) ) )? )
            // InternalD3ql.g:367:3: ( ( (lv_expression_0_1= rulePathExpression | lv_expression_0_2= ruleFunctionCall | lv_expression_0_3= ruleLiteral ) ) ) (otherlv_1= 'as' ( (lv_alias_2_0= ruleAlias ) ) )?
            {
            // InternalD3ql.g:367:3: ( ( (lv_expression_0_1= rulePathExpression | lv_expression_0_2= ruleFunctionCall | lv_expression_0_3= ruleLiteral ) ) )
            // InternalD3ql.g:368:4: ( (lv_expression_0_1= rulePathExpression | lv_expression_0_2= ruleFunctionCall | lv_expression_0_3= ruleLiteral ) )
            {
            // InternalD3ql.g:368:4: ( (lv_expression_0_1= rulePathExpression | lv_expression_0_2= ruleFunctionCall | lv_expression_0_3= ruleLiteral ) )
            // InternalD3ql.g:369:5: (lv_expression_0_1= rulePathExpression | lv_expression_0_2= ruleFunctionCall | lv_expression_0_3= ruleLiteral )
            {
            // InternalD3ql.g:369:5: (lv_expression_0_1= rulePathExpression | lv_expression_0_2= ruleFunctionCall | lv_expression_0_3= ruleLiteral )
            int alt4=3;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==EOF||(LA4_1>=12 && LA4_1<=13)||LA4_1==15) ) {
                    alt4=1;
                }
                else if ( (LA4_1==16) ) {
                    alt4=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA4_0>=RULE_INT && LA4_0<=RULE_STRING)||(LA4_0>=18 && LA4_0<=19)) ) {
                alt4=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalD3ql.g:370:6: lv_expression_0_1= rulePathExpression
                    {

                    						newCompositeNode(grammarAccess.getSelectExpressionAccess().getExpressionPathExpressionParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_expression_0_1=rulePathExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSelectExpressionRule());
                    						}
                    						set(
                    							current,
                    							"expression",
                    							lv_expression_0_1,
                    							"nl.coenbijlsma.languages.d3ql.D3ql.PathExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalD3ql.g:386:6: lv_expression_0_2= ruleFunctionCall
                    {

                    						newCompositeNode(grammarAccess.getSelectExpressionAccess().getExpressionFunctionCallParserRuleCall_0_0_1());
                    					
                    pushFollow(FOLLOW_6);
                    lv_expression_0_2=ruleFunctionCall();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSelectExpressionRule());
                    						}
                    						set(
                    							current,
                    							"expression",
                    							lv_expression_0_2,
                    							"nl.coenbijlsma.languages.d3ql.D3ql.FunctionCall");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 3 :
                    // InternalD3ql.g:402:6: lv_expression_0_3= ruleLiteral
                    {

                    						newCompositeNode(grammarAccess.getSelectExpressionAccess().getExpressionLiteralParserRuleCall_0_0_2());
                    					
                    pushFollow(FOLLOW_6);
                    lv_expression_0_3=ruleLiteral();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSelectExpressionRule());
                    						}
                    						set(
                    							current,
                    							"expression",
                    							lv_expression_0_3,
                    							"nl.coenbijlsma.languages.d3ql.D3ql.Literal");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;

            }


            }


            }

            // InternalD3ql.g:420:3: (otherlv_1= 'as' ( (lv_alias_2_0= ruleAlias ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==13) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalD3ql.g:421:4: otherlv_1= 'as' ( (lv_alias_2_0= ruleAlias ) )
                    {
                    otherlv_1=(Token)match(input,13,FOLLOW_4); 

                    				newLeafNode(otherlv_1, grammarAccess.getSelectExpressionAccess().getAsKeyword_1_0());
                    			
                    // InternalD3ql.g:425:4: ( (lv_alias_2_0= ruleAlias ) )
                    // InternalD3ql.g:426:5: (lv_alias_2_0= ruleAlias )
                    {
                    // InternalD3ql.g:426:5: (lv_alias_2_0= ruleAlias )
                    // InternalD3ql.g:427:6: lv_alias_2_0= ruleAlias
                    {

                    						newCompositeNode(grammarAccess.getSelectExpressionAccess().getAliasAliasParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_alias_2_0=ruleAlias();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSelectExpressionRule());
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
    // $ANTLR end "ruleSelectExpression"


    // $ANTLR start "entryRulePathExpression"
    // InternalD3ql.g:449:1: entryRulePathExpression returns [EObject current=null] : iv_rulePathExpression= rulePathExpression EOF ;
    public final EObject entryRulePathExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePathExpression = null;


        try {
            // InternalD3ql.g:449:55: (iv_rulePathExpression= rulePathExpression EOF )
            // InternalD3ql.g:450:2: iv_rulePathExpression= rulePathExpression EOF
            {
             newCompositeNode(grammarAccess.getPathExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePathExpression=rulePathExpression();

            state._fsp--;

             current =iv_rulePathExpression; 
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
    // $ANTLR end "entryRulePathExpression"


    // $ANTLR start "rulePathExpression"
    // InternalD3ql.g:456:1: rulePathExpression returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '.' ( ( (lv_tail_2_0= rulePathElement ) ) otherlv_3= '.' )* ( (lv_tail_4_0= rulePathElement ) ) )? ) ;
    public final EObject rulePathExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_tail_2_0 = null;

        EObject lv_tail_4_0 = null;



        	enterRule();

        try {
            // InternalD3ql.g:462:2: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '.' ( ( (lv_tail_2_0= rulePathElement ) ) otherlv_3= '.' )* ( (lv_tail_4_0= rulePathElement ) ) )? ) )
            // InternalD3ql.g:463:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '.' ( ( (lv_tail_2_0= rulePathElement ) ) otherlv_3= '.' )* ( (lv_tail_4_0= rulePathElement ) ) )? )
            {
            // InternalD3ql.g:463:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '.' ( ( (lv_tail_2_0= rulePathElement ) ) otherlv_3= '.' )* ( (lv_tail_4_0= rulePathElement ) ) )? )
            // InternalD3ql.g:464:3: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '.' ( ( (lv_tail_2_0= rulePathElement ) ) otherlv_3= '.' )* ( (lv_tail_4_0= rulePathElement ) ) )?
            {
            // InternalD3ql.g:464:3: ( (otherlv_0= RULE_ID ) )
            // InternalD3ql.g:465:4: (otherlv_0= RULE_ID )
            {
            // InternalD3ql.g:465:4: (otherlv_0= RULE_ID )
            // InternalD3ql.g:466:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPathExpressionRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(otherlv_0, grammarAccess.getPathExpressionAccess().getHeadNamedCrossReference_0_0());
            				

            }


            }

            // InternalD3ql.g:477:3: (otherlv_1= '.' ( ( (lv_tail_2_0= rulePathElement ) ) otherlv_3= '.' )* ( (lv_tail_4_0= rulePathElement ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==15) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalD3ql.g:478:4: otherlv_1= '.' ( ( (lv_tail_2_0= rulePathElement ) ) otherlv_3= '.' )* ( (lv_tail_4_0= rulePathElement ) )
                    {
                    otherlv_1=(Token)match(input,15,FOLLOW_4); 

                    				newLeafNode(otherlv_1, grammarAccess.getPathExpressionAccess().getFullStopKeyword_1_0());
                    			
                    // InternalD3ql.g:482:4: ( ( (lv_tail_2_0= rulePathElement ) ) otherlv_3= '.' )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==RULE_ID) ) {
                            int LA6_1 = input.LA(2);

                            if ( (LA6_1==15) ) {
                                alt6=1;
                            }


                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalD3ql.g:483:5: ( (lv_tail_2_0= rulePathElement ) ) otherlv_3= '.'
                    	    {
                    	    // InternalD3ql.g:483:5: ( (lv_tail_2_0= rulePathElement ) )
                    	    // InternalD3ql.g:484:6: (lv_tail_2_0= rulePathElement )
                    	    {
                    	    // InternalD3ql.g:484:6: (lv_tail_2_0= rulePathElement )
                    	    // InternalD3ql.g:485:7: lv_tail_2_0= rulePathElement
                    	    {

                    	    							newCompositeNode(grammarAccess.getPathExpressionAccess().getTailPathElementParserRuleCall_1_1_0_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_tail_2_0=rulePathElement();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getPathExpressionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"tail",
                    	    								lv_tail_2_0,
                    	    								"nl.coenbijlsma.languages.d3ql.D3ql.PathElement");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }

                    	    otherlv_3=(Token)match(input,15,FOLLOW_4); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getPathExpressionAccess().getFullStopKeyword_1_1_1());
                    	    				

                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    // InternalD3ql.g:507:4: ( (lv_tail_4_0= rulePathElement ) )
                    // InternalD3ql.g:508:5: (lv_tail_4_0= rulePathElement )
                    {
                    // InternalD3ql.g:508:5: (lv_tail_4_0= rulePathElement )
                    // InternalD3ql.g:509:6: lv_tail_4_0= rulePathElement
                    {

                    						newCompositeNode(grammarAccess.getPathExpressionAccess().getTailPathElementParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_tail_4_0=rulePathElement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPathExpressionRule());
                    						}
                    						add(
                    							current,
                    							"tail",
                    							lv_tail_4_0,
                    							"nl.coenbijlsma.languages.d3ql.D3ql.PathElement");
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
    // $ANTLR end "rulePathExpression"


    // $ANTLR start "entryRulePathElement"
    // InternalD3ql.g:531:1: entryRulePathElement returns [EObject current=null] : iv_rulePathElement= rulePathElement EOF ;
    public final EObject entryRulePathElement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePathElement = null;


        try {
            // InternalD3ql.g:531:52: (iv_rulePathElement= rulePathElement EOF )
            // InternalD3ql.g:532:2: iv_rulePathElement= rulePathElement EOF
            {
             newCompositeNode(grammarAccess.getPathElementRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePathElement=rulePathElement();

            state._fsp--;

             current =iv_rulePathElement; 
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
    // $ANTLR end "entryRulePathElement"


    // $ANTLR start "rulePathElement"
    // InternalD3ql.g:538:1: rulePathElement returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject rulePathElement() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalD3ql.g:544:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalD3ql.g:545:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalD3ql.g:545:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalD3ql.g:546:3: (lv_name_0_0= RULE_ID )
            {
            // InternalD3ql.g:546:3: (lv_name_0_0= RULE_ID )
            // InternalD3ql.g:547:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getPathElementAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getPathElementRule());
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
    // $ANTLR end "rulePathElement"


    // $ANTLR start "entryRuleFunctionCall"
    // InternalD3ql.g:566:1: entryRuleFunctionCall returns [EObject current=null] : iv_ruleFunctionCall= ruleFunctionCall EOF ;
    public final EObject entryRuleFunctionCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionCall = null;


        try {
            // InternalD3ql.g:566:53: (iv_ruleFunctionCall= ruleFunctionCall EOF )
            // InternalD3ql.g:567:2: iv_ruleFunctionCall= ruleFunctionCall EOF
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
    // InternalD3ql.g:573:1: ruleFunctionCall returns [EObject current=null] : ( ( (lv_function_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_arguments_2_0= ruleFunctionArgument ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleFunctionArgument ) ) )* otherlv_5= ')' ) ;
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
            // InternalD3ql.g:579:2: ( ( ( (lv_function_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_arguments_2_0= ruleFunctionArgument ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleFunctionArgument ) ) )* otherlv_5= ')' ) )
            // InternalD3ql.g:580:2: ( ( (lv_function_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_arguments_2_0= ruleFunctionArgument ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleFunctionArgument ) ) )* otherlv_5= ')' )
            {
            // InternalD3ql.g:580:2: ( ( (lv_function_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_arguments_2_0= ruleFunctionArgument ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleFunctionArgument ) ) )* otherlv_5= ')' )
            // InternalD3ql.g:581:3: ( (lv_function_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_arguments_2_0= ruleFunctionArgument ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleFunctionArgument ) ) )* otherlv_5= ')'
            {
            // InternalD3ql.g:581:3: ( (lv_function_0_0= RULE_ID ) )
            // InternalD3ql.g:582:4: (lv_function_0_0= RULE_ID )
            {
            // InternalD3ql.g:582:4: (lv_function_0_0= RULE_ID )
            // InternalD3ql.g:583:5: lv_function_0_0= RULE_ID
            {
            lv_function_0_0=(Token)match(input,RULE_ID,FOLLOW_10); 

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

            otherlv_1=(Token)match(input,16,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getFunctionCallAccess().getLeftParenthesisKeyword_1());
            		
            // InternalD3ql.g:603:3: ( (lv_arguments_2_0= ruleFunctionArgument ) )
            // InternalD3ql.g:604:4: (lv_arguments_2_0= ruleFunctionArgument )
            {
            // InternalD3ql.g:604:4: (lv_arguments_2_0= ruleFunctionArgument )
            // InternalD3ql.g:605:5: lv_arguments_2_0= ruleFunctionArgument
            {

            					newCompositeNode(grammarAccess.getFunctionCallAccess().getArgumentsFunctionArgumentParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_11);
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

            // InternalD3ql.g:622:3: (otherlv_3= ',' ( (lv_arguments_4_0= ruleFunctionArgument ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==12) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalD3ql.g:623:4: otherlv_3= ',' ( (lv_arguments_4_0= ruleFunctionArgument ) )
            	    {
            	    otherlv_3=(Token)match(input,12,FOLLOW_7); 

            	    				newLeafNode(otherlv_3, grammarAccess.getFunctionCallAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalD3ql.g:627:4: ( (lv_arguments_4_0= ruleFunctionArgument ) )
            	    // InternalD3ql.g:628:5: (lv_arguments_4_0= ruleFunctionArgument )
            	    {
            	    // InternalD3ql.g:628:5: (lv_arguments_4_0= ruleFunctionArgument )
            	    // InternalD3ql.g:629:6: lv_arguments_4_0= ruleFunctionArgument
            	    {

            	    						newCompositeNode(grammarAccess.getFunctionCallAccess().getArgumentsFunctionArgumentParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_11);
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
            	    break loop8;
                }
            } while (true);

            otherlv_5=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getFunctionCallAccess().getRightParenthesisKeyword_4());
            		

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
    // InternalD3ql.g:655:1: entryRuleFunctionArgument returns [EObject current=null] : iv_ruleFunctionArgument= ruleFunctionArgument EOF ;
    public final EObject entryRuleFunctionArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionArgument = null;


        try {
            // InternalD3ql.g:655:57: (iv_ruleFunctionArgument= ruleFunctionArgument EOF )
            // InternalD3ql.g:656:2: iv_ruleFunctionArgument= ruleFunctionArgument EOF
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
    // InternalD3ql.g:662:1: ruleFunctionArgument returns [EObject current=null] : ( ( (lv_value_0_1= rulePathExpression | lv_value_0_2= ruleLiteral ) ) ) ;
    public final EObject ruleFunctionArgument() throws RecognitionException {
        EObject current = null;

        EObject lv_value_0_1 = null;

        EObject lv_value_0_2 = null;



        	enterRule();

        try {
            // InternalD3ql.g:668:2: ( ( ( (lv_value_0_1= rulePathExpression | lv_value_0_2= ruleLiteral ) ) ) )
            // InternalD3ql.g:669:2: ( ( (lv_value_0_1= rulePathExpression | lv_value_0_2= ruleLiteral ) ) )
            {
            // InternalD3ql.g:669:2: ( ( (lv_value_0_1= rulePathExpression | lv_value_0_2= ruleLiteral ) ) )
            // InternalD3ql.g:670:3: ( (lv_value_0_1= rulePathExpression | lv_value_0_2= ruleLiteral ) )
            {
            // InternalD3ql.g:670:3: ( (lv_value_0_1= rulePathExpression | lv_value_0_2= ruleLiteral ) )
            // InternalD3ql.g:671:4: (lv_value_0_1= rulePathExpression | lv_value_0_2= ruleLiteral )
            {
            // InternalD3ql.g:671:4: (lv_value_0_1= rulePathExpression | lv_value_0_2= ruleLiteral )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                alt9=1;
            }
            else if ( ((LA9_0>=RULE_INT && LA9_0<=RULE_STRING)||(LA9_0>=18 && LA9_0<=19)) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalD3ql.g:672:5: lv_value_0_1= rulePathExpression
                    {

                    					newCompositeNode(grammarAccess.getFunctionArgumentAccess().getValuePathExpressionParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_value_0_1=rulePathExpression();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFunctionArgumentRule());
                    					}
                    					set(
                    						current,
                    						"value",
                    						lv_value_0_1,
                    						"nl.coenbijlsma.languages.d3ql.D3ql.PathExpression");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;
                case 2 :
                    // InternalD3ql.g:688:5: lv_value_0_2= ruleLiteral
                    {

                    					newCompositeNode(grammarAccess.getFunctionArgumentAccess().getValueLiteralParserRuleCall_0_1());
                    				
                    pushFollow(FOLLOW_2);
                    lv_value_0_2=ruleLiteral();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFunctionArgumentRule());
                    					}
                    					set(
                    						current,
                    						"value",
                    						lv_value_0_2,
                    						"nl.coenbijlsma.languages.d3ql.D3ql.Literal");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;

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
    // $ANTLR end "ruleFunctionArgument"


    // $ANTLR start "entryRuleLiteral"
    // InternalD3ql.g:709:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // InternalD3ql.g:709:48: (iv_ruleLiteral= ruleLiteral EOF )
            // InternalD3ql.g:710:2: iv_ruleLiteral= ruleLiteral EOF
            {
             newCompositeNode(grammarAccess.getLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLiteral=ruleLiteral();

            state._fsp--;

             current =iv_ruleLiteral; 
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
    // $ANTLR end "entryRuleLiteral"


    // $ANTLR start "ruleLiteral"
    // InternalD3ql.g:716:1: ruleLiteral returns [EObject current=null] : (this_IntegerLiteral_0= ruleIntegerLiteral | this_StringLiteral_1= ruleStringLiteral | this_BooleanLiteral_2= ruleBooleanLiteral ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_IntegerLiteral_0 = null;

        EObject this_StringLiteral_1 = null;

        EObject this_BooleanLiteral_2 = null;



        	enterRule();

        try {
            // InternalD3ql.g:722:2: ( (this_IntegerLiteral_0= ruleIntegerLiteral | this_StringLiteral_1= ruleStringLiteral | this_BooleanLiteral_2= ruleBooleanLiteral ) )
            // InternalD3ql.g:723:2: (this_IntegerLiteral_0= ruleIntegerLiteral | this_StringLiteral_1= ruleStringLiteral | this_BooleanLiteral_2= ruleBooleanLiteral )
            {
            // InternalD3ql.g:723:2: (this_IntegerLiteral_0= ruleIntegerLiteral | this_StringLiteral_1= ruleStringLiteral | this_BooleanLiteral_2= ruleBooleanLiteral )
            int alt10=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt10=1;
                }
                break;
            case RULE_STRING:
                {
                alt10=2;
                }
                break;
            case 18:
            case 19:
                {
                alt10=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalD3ql.g:724:3: this_IntegerLiteral_0= ruleIntegerLiteral
                    {

                    			newCompositeNode(grammarAccess.getLiteralAccess().getIntegerLiteralParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_IntegerLiteral_0=ruleIntegerLiteral();

                    state._fsp--;


                    			current = this_IntegerLiteral_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalD3ql.g:733:3: this_StringLiteral_1= ruleStringLiteral
                    {

                    			newCompositeNode(grammarAccess.getLiteralAccess().getStringLiteralParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_StringLiteral_1=ruleStringLiteral();

                    state._fsp--;


                    			current = this_StringLiteral_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalD3ql.g:742:3: this_BooleanLiteral_2= ruleBooleanLiteral
                    {

                    			newCompositeNode(grammarAccess.getLiteralAccess().getBooleanLiteralParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_BooleanLiteral_2=ruleBooleanLiteral();

                    state._fsp--;


                    			current = this_BooleanLiteral_2;
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
    // $ANTLR end "ruleLiteral"


    // $ANTLR start "entryRuleIntegerLiteral"
    // InternalD3ql.g:754:1: entryRuleIntegerLiteral returns [EObject current=null] : iv_ruleIntegerLiteral= ruleIntegerLiteral EOF ;
    public final EObject entryRuleIntegerLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerLiteral = null;


        try {
            // InternalD3ql.g:754:55: (iv_ruleIntegerLiteral= ruleIntegerLiteral EOF )
            // InternalD3ql.g:755:2: iv_ruleIntegerLiteral= ruleIntegerLiteral EOF
            {
             newCompositeNode(grammarAccess.getIntegerLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntegerLiteral=ruleIntegerLiteral();

            state._fsp--;

             current =iv_ruleIntegerLiteral; 
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
    // $ANTLR end "entryRuleIntegerLiteral"


    // $ANTLR start "ruleIntegerLiteral"
    // InternalD3ql.g:761:1: ruleIntegerLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleIntegerLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalD3ql.g:767:2: ( ( (lv_value_0_0= RULE_INT ) ) )
            // InternalD3ql.g:768:2: ( (lv_value_0_0= RULE_INT ) )
            {
            // InternalD3ql.g:768:2: ( (lv_value_0_0= RULE_INT ) )
            // InternalD3ql.g:769:3: (lv_value_0_0= RULE_INT )
            {
            // InternalD3ql.g:769:3: (lv_value_0_0= RULE_INT )
            // InternalD3ql.g:770:4: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getIntegerLiteralAccess().getValueINTTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getIntegerLiteralRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.eclipse.xtext.common.Terminals.INT");
            			

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
    // $ANTLR end "ruleIntegerLiteral"


    // $ANTLR start "entryRuleStringLiteral"
    // InternalD3ql.g:789:1: entryRuleStringLiteral returns [EObject current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final EObject entryRuleStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteral = null;


        try {
            // InternalD3ql.g:789:54: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // InternalD3ql.g:790:2: iv_ruleStringLiteral= ruleStringLiteral EOF
            {
             newCompositeNode(grammarAccess.getStringLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStringLiteral=ruleStringLiteral();

            state._fsp--;

             current =iv_ruleStringLiteral; 
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
    // $ANTLR end "entryRuleStringLiteral"


    // $ANTLR start "ruleStringLiteral"
    // InternalD3ql.g:796:1: ruleStringLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalD3ql.g:802:2: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // InternalD3ql.g:803:2: ( (lv_value_0_0= RULE_STRING ) )
            {
            // InternalD3ql.g:803:2: ( (lv_value_0_0= RULE_STRING ) )
            // InternalD3ql.g:804:3: (lv_value_0_0= RULE_STRING )
            {
            // InternalD3ql.g:804:3: (lv_value_0_0= RULE_STRING )
            // InternalD3ql.g:805:4: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getStringLiteralAccess().getValueSTRINGTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getStringLiteralRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.eclipse.xtext.common.Terminals.STRING");
            			

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
    // $ANTLR end "ruleStringLiteral"


    // $ANTLR start "entryRuleBooleanLiteral"
    // InternalD3ql.g:824:1: entryRuleBooleanLiteral returns [EObject current=null] : iv_ruleBooleanLiteral= ruleBooleanLiteral EOF ;
    public final EObject entryRuleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanLiteral = null;


        try {
            // InternalD3ql.g:824:55: (iv_ruleBooleanLiteral= ruleBooleanLiteral EOF )
            // InternalD3ql.g:825:2: iv_ruleBooleanLiteral= ruleBooleanLiteral EOF
            {
             newCompositeNode(grammarAccess.getBooleanLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBooleanLiteral=ruleBooleanLiteral();

            state._fsp--;

             current =iv_ruleBooleanLiteral; 
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
    // $ANTLR end "entryRuleBooleanLiteral"


    // $ANTLR start "ruleBooleanLiteral"
    // InternalD3ql.g:831:1: ruleBooleanLiteral returns [EObject current=null] : ( ( (lv_value_0_1= 'true' | lv_value_0_2= 'false' ) ) ) ;
    public final EObject ruleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_1=null;
        Token lv_value_0_2=null;


        	enterRule();

        try {
            // InternalD3ql.g:837:2: ( ( ( (lv_value_0_1= 'true' | lv_value_0_2= 'false' ) ) ) )
            // InternalD3ql.g:838:2: ( ( (lv_value_0_1= 'true' | lv_value_0_2= 'false' ) ) )
            {
            // InternalD3ql.g:838:2: ( ( (lv_value_0_1= 'true' | lv_value_0_2= 'false' ) ) )
            // InternalD3ql.g:839:3: ( (lv_value_0_1= 'true' | lv_value_0_2= 'false' ) )
            {
            // InternalD3ql.g:839:3: ( (lv_value_0_1= 'true' | lv_value_0_2= 'false' ) )
            // InternalD3ql.g:840:4: (lv_value_0_1= 'true' | lv_value_0_2= 'false' )
            {
            // InternalD3ql.g:840:4: (lv_value_0_1= 'true' | lv_value_0_2= 'false' )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==18) ) {
                alt11=1;
            }
            else if ( (LA11_0==19) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalD3ql.g:841:5: lv_value_0_1= 'true'
                    {
                    lv_value_0_1=(Token)match(input,18,FOLLOW_2); 

                    					newLeafNode(lv_value_0_1, grammarAccess.getBooleanLiteralAccess().getValueTrueKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getBooleanLiteralRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_1, null);
                    				

                    }
                    break;
                case 2 :
                    // InternalD3ql.g:852:5: lv_value_0_2= 'false'
                    {
                    lv_value_0_2=(Token)match(input,19,FOLLOW_2); 

                    					newLeafNode(lv_value_0_2, grammarAccess.getBooleanLiteralAccess().getValueFalseKeyword_0_1());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getBooleanLiteralRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_2, null);
                    				

                    }
                    break;

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
    // $ANTLR end "ruleBooleanLiteral"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000000C0070L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000021000L});

}