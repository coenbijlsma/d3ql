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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'from'", "','", "'as'", "'select'", "'.'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int RULE_INT=5;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

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
    // InternalD3ql.g:292:1: ruleSelectStatement returns [EObject current=null] : (otherlv_0= 'select' ( (lv_paths_1_0= rulePathExpression ) ) (otherlv_2= ',' ( (lv_paths_3_0= rulePathExpression ) ) )* ) ;
    public final EObject ruleSelectStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_paths_1_0 = null;

        EObject lv_paths_3_0 = null;



        	enterRule();

        try {
            // InternalD3ql.g:298:2: ( (otherlv_0= 'select' ( (lv_paths_1_0= rulePathExpression ) ) (otherlv_2= ',' ( (lv_paths_3_0= rulePathExpression ) ) )* ) )
            // InternalD3ql.g:299:2: (otherlv_0= 'select' ( (lv_paths_1_0= rulePathExpression ) ) (otherlv_2= ',' ( (lv_paths_3_0= rulePathExpression ) ) )* )
            {
            // InternalD3ql.g:299:2: (otherlv_0= 'select' ( (lv_paths_1_0= rulePathExpression ) ) (otherlv_2= ',' ( (lv_paths_3_0= rulePathExpression ) ) )* )
            // InternalD3ql.g:300:3: otherlv_0= 'select' ( (lv_paths_1_0= rulePathExpression ) ) (otherlv_2= ',' ( (lv_paths_3_0= rulePathExpression ) ) )*
            {
            otherlv_0=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getSelectStatementAccess().getSelectKeyword_0());
            		
            // InternalD3ql.g:304:3: ( (lv_paths_1_0= rulePathExpression ) )
            // InternalD3ql.g:305:4: (lv_paths_1_0= rulePathExpression )
            {
            // InternalD3ql.g:305:4: (lv_paths_1_0= rulePathExpression )
            // InternalD3ql.g:306:5: lv_paths_1_0= rulePathExpression
            {

            					newCompositeNode(grammarAccess.getSelectStatementAccess().getPathsPathExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
            lv_paths_1_0=rulePathExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSelectStatementRule());
            					}
            					add(
            						current,
            						"paths",
            						lv_paths_1_0,
            						"nl.coenbijlsma.languages.d3ql.D3ql.PathExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalD3ql.g:323:3: (otherlv_2= ',' ( (lv_paths_3_0= rulePathExpression ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==12) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalD3ql.g:324:4: otherlv_2= ',' ( (lv_paths_3_0= rulePathExpression ) )
            	    {
            	    otherlv_2=(Token)match(input,12,FOLLOW_4); 

            	    				newLeafNode(otherlv_2, grammarAccess.getSelectStatementAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalD3ql.g:328:4: ( (lv_paths_3_0= rulePathExpression ) )
            	    // InternalD3ql.g:329:5: (lv_paths_3_0= rulePathExpression )
            	    {
            	    // InternalD3ql.g:329:5: (lv_paths_3_0= rulePathExpression )
            	    // InternalD3ql.g:330:6: lv_paths_3_0= rulePathExpression
            	    {

            	    						newCompositeNode(grammarAccess.getSelectStatementAccess().getPathsPathExpressionParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_5);
            	    lv_paths_3_0=rulePathExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSelectStatementRule());
            	    						}
            	    						add(
            	    							current,
            	    							"paths",
            	    							lv_paths_3_0,
            	    							"nl.coenbijlsma.languages.d3ql.D3ql.PathExpression");
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


    // $ANTLR start "entryRulePathExpression"
    // InternalD3ql.g:352:1: entryRulePathExpression returns [EObject current=null] : iv_rulePathExpression= rulePathExpression EOF ;
    public final EObject entryRulePathExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePathExpression = null;


        try {
            // InternalD3ql.g:352:55: (iv_rulePathExpression= rulePathExpression EOF )
            // InternalD3ql.g:353:2: iv_rulePathExpression= rulePathExpression EOF
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
    // InternalD3ql.g:359:1: rulePathExpression returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( ( (lv_tail_2_0= rulePathElement ) ) otherlv_3= '.' )* ( (lv_tail_4_0= rulePathElement ) ) ) ;
    public final EObject rulePathExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_tail_2_0 = null;

        EObject lv_tail_4_0 = null;



        	enterRule();

        try {
            // InternalD3ql.g:365:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( ( (lv_tail_2_0= rulePathElement ) ) otherlv_3= '.' )* ( (lv_tail_4_0= rulePathElement ) ) ) )
            // InternalD3ql.g:366:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( ( (lv_tail_2_0= rulePathElement ) ) otherlv_3= '.' )* ( (lv_tail_4_0= rulePathElement ) ) )
            {
            // InternalD3ql.g:366:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( ( (lv_tail_2_0= rulePathElement ) ) otherlv_3= '.' )* ( (lv_tail_4_0= rulePathElement ) ) )
            // InternalD3ql.g:367:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( ( (lv_tail_2_0= rulePathElement ) ) otherlv_3= '.' )* ( (lv_tail_4_0= rulePathElement ) )
            {
            // InternalD3ql.g:367:3: ( (otherlv_0= RULE_ID ) )
            // InternalD3ql.g:368:4: (otherlv_0= RULE_ID )
            {
            // InternalD3ql.g:368:4: (otherlv_0= RULE_ID )
            // InternalD3ql.g:369:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPathExpressionRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(otherlv_0, grammarAccess.getPathExpressionAccess().getHeadNamedCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getPathExpressionAccess().getFullStopKeyword_1());
            		
            // InternalD3ql.g:384:3: ( ( (lv_tail_2_0= rulePathElement ) ) otherlv_3= '.' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    int LA4_1 = input.LA(2);

                    if ( (LA4_1==15) ) {
                        alt4=1;
                    }


                }


                switch (alt4) {
            	case 1 :
            	    // InternalD3ql.g:385:4: ( (lv_tail_2_0= rulePathElement ) ) otherlv_3= '.'
            	    {
            	    // InternalD3ql.g:385:4: ( (lv_tail_2_0= rulePathElement ) )
            	    // InternalD3ql.g:386:5: (lv_tail_2_0= rulePathElement )
            	    {
            	    // InternalD3ql.g:386:5: (lv_tail_2_0= rulePathElement )
            	    // InternalD3ql.g:387:6: lv_tail_2_0= rulePathElement
            	    {

            	    						newCompositeNode(grammarAccess.getPathExpressionAccess().getTailPathElementParserRuleCall_2_0_0());
            	    					
            	    pushFollow(FOLLOW_7);
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

            	    				newLeafNode(otherlv_3, grammarAccess.getPathExpressionAccess().getFullStopKeyword_2_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // InternalD3ql.g:409:3: ( (lv_tail_4_0= rulePathElement ) )
            // InternalD3ql.g:410:4: (lv_tail_4_0= rulePathElement )
            {
            // InternalD3ql.g:410:4: (lv_tail_4_0= rulePathElement )
            // InternalD3ql.g:411:5: lv_tail_4_0= rulePathElement
            {

            					newCompositeNode(grammarAccess.getPathExpressionAccess().getTailPathElementParserRuleCall_3_0());
            				
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
    // InternalD3ql.g:432:1: entryRulePathElement returns [EObject current=null] : iv_rulePathElement= rulePathElement EOF ;
    public final EObject entryRulePathElement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePathElement = null;


        try {
            // InternalD3ql.g:432:52: (iv_rulePathElement= rulePathElement EOF )
            // InternalD3ql.g:433:2: iv_rulePathElement= rulePathElement EOF
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
    // InternalD3ql.g:439:1: rulePathElement returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject rulePathElement() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalD3ql.g:445:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalD3ql.g:446:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalD3ql.g:446:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalD3ql.g:447:3: (lv_name_0_0= RULE_ID )
            {
            // InternalD3ql.g:447:3: (lv_name_0_0= RULE_ID )
            // InternalD3ql.g:448:4: lv_name_0_0= RULE_ID
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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});

}