package nl.coenbijlsma.languages.d3ql.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import nl.coenbijlsma.languages.d3ql.services.D3qlGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalD3qlParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'='", "'!='", "'>='", "'<='", "'>'", "'<'", "'like'", "'true'", "'false'", "'from'", "','", "'select'", "'as'", "'where'", "'or'", "'and'", "'('", "')'", "'!'", "'.'", "'{'", "'}'", "'*'", "'between'", "'in'", "'null'"
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

    	public void setGrammarAccess(D3qlGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleQuery"
    // InternalD3ql.g:53:1: entryRuleQuery : ruleQuery EOF ;
    public final void entryRuleQuery() throws RecognitionException {
        try {
            // InternalD3ql.g:54:1: ( ruleQuery EOF )
            // InternalD3ql.g:55:1: ruleQuery EOF
            {
             before(grammarAccess.getQueryRule()); 
            pushFollow(FOLLOW_1);
            ruleQuery();

            state._fsp--;

             after(grammarAccess.getQueryRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleQuery"


    // $ANTLR start "ruleQuery"
    // InternalD3ql.g:62:1: ruleQuery : ( ( rule__Query__Group__0 ) ) ;
    public final void ruleQuery() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:66:2: ( ( ( rule__Query__Group__0 ) ) )
            // InternalD3ql.g:67:2: ( ( rule__Query__Group__0 ) )
            {
            // InternalD3ql.g:67:2: ( ( rule__Query__Group__0 ) )
            // InternalD3ql.g:68:3: ( rule__Query__Group__0 )
            {
             before(grammarAccess.getQueryAccess().getGroup()); 
            // InternalD3ql.g:69:3: ( rule__Query__Group__0 )
            // InternalD3ql.g:69:4: rule__Query__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Query__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQueryAccess().getGroup()); 

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
    // $ANTLR end "ruleQuery"


    // $ANTLR start "entryRuleFromStatement"
    // InternalD3ql.g:78:1: entryRuleFromStatement : ruleFromStatement EOF ;
    public final void entryRuleFromStatement() throws RecognitionException {
        try {
            // InternalD3ql.g:79:1: ( ruleFromStatement EOF )
            // InternalD3ql.g:80:1: ruleFromStatement EOF
            {
             before(grammarAccess.getFromStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleFromStatement();

            state._fsp--;

             after(grammarAccess.getFromStatementRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFromStatement"


    // $ANTLR start "ruleFromStatement"
    // InternalD3ql.g:87:1: ruleFromStatement : ( ( rule__FromStatement__Group__0 ) ) ;
    public final void ruleFromStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:91:2: ( ( ( rule__FromStatement__Group__0 ) ) )
            // InternalD3ql.g:92:2: ( ( rule__FromStatement__Group__0 ) )
            {
            // InternalD3ql.g:92:2: ( ( rule__FromStatement__Group__0 ) )
            // InternalD3ql.g:93:3: ( rule__FromStatement__Group__0 )
            {
             before(grammarAccess.getFromStatementAccess().getGroup()); 
            // InternalD3ql.g:94:3: ( rule__FromStatement__Group__0 )
            // InternalD3ql.g:94:4: rule__FromStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FromStatement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFromStatementAccess().getGroup()); 

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
    // $ANTLR end "ruleFromStatement"


    // $ANTLR start "entryRuleSelectStatement"
    // InternalD3ql.g:103:1: entryRuleSelectStatement : ruleSelectStatement EOF ;
    public final void entryRuleSelectStatement() throws RecognitionException {
        try {
            // InternalD3ql.g:104:1: ( ruleSelectStatement EOF )
            // InternalD3ql.g:105:1: ruleSelectStatement EOF
            {
             before(grammarAccess.getSelectStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleSelectStatement();

            state._fsp--;

             after(grammarAccess.getSelectStatementRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSelectStatement"


    // $ANTLR start "ruleSelectStatement"
    // InternalD3ql.g:112:1: ruleSelectStatement : ( ( rule__SelectStatement__Group__0 ) ) ;
    public final void ruleSelectStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:116:2: ( ( ( rule__SelectStatement__Group__0 ) ) )
            // InternalD3ql.g:117:2: ( ( rule__SelectStatement__Group__0 ) )
            {
            // InternalD3ql.g:117:2: ( ( rule__SelectStatement__Group__0 ) )
            // InternalD3ql.g:118:3: ( rule__SelectStatement__Group__0 )
            {
             before(grammarAccess.getSelectStatementAccess().getGroup()); 
            // InternalD3ql.g:119:3: ( rule__SelectStatement__Group__0 )
            // InternalD3ql.g:119:4: rule__SelectStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SelectStatement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSelectStatementAccess().getGroup()); 

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
    // $ANTLR end "ruleSelectStatement"


    // $ANTLR start "entryRuleSelectionItem"
    // InternalD3ql.g:128:1: entryRuleSelectionItem : ruleSelectionItem EOF ;
    public final void entryRuleSelectionItem() throws RecognitionException {
        try {
            // InternalD3ql.g:129:1: ( ruleSelectionItem EOF )
            // InternalD3ql.g:130:1: ruleSelectionItem EOF
            {
             before(grammarAccess.getSelectionItemRule()); 
            pushFollow(FOLLOW_1);
            ruleSelectionItem();

            state._fsp--;

             after(grammarAccess.getSelectionItemRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSelectionItem"


    // $ANTLR start "ruleSelectionItem"
    // InternalD3ql.g:137:1: ruleSelectionItem : ( ( rule__SelectionItem__Group__0 ) ) ;
    public final void ruleSelectionItem() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:141:2: ( ( ( rule__SelectionItem__Group__0 ) ) )
            // InternalD3ql.g:142:2: ( ( rule__SelectionItem__Group__0 ) )
            {
            // InternalD3ql.g:142:2: ( ( rule__SelectionItem__Group__0 ) )
            // InternalD3ql.g:143:3: ( rule__SelectionItem__Group__0 )
            {
             before(grammarAccess.getSelectionItemAccess().getGroup()); 
            // InternalD3ql.g:144:3: ( rule__SelectionItem__Group__0 )
            // InternalD3ql.g:144:4: rule__SelectionItem__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SelectionItem__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSelectionItemAccess().getGroup()); 

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
    // $ANTLR end "ruleSelectionItem"


    // $ANTLR start "entryRuleWhereStatement"
    // InternalD3ql.g:153:1: entryRuleWhereStatement : ruleWhereStatement EOF ;
    public final void entryRuleWhereStatement() throws RecognitionException {
        try {
            // InternalD3ql.g:154:1: ( ruleWhereStatement EOF )
            // InternalD3ql.g:155:1: ruleWhereStatement EOF
            {
             before(grammarAccess.getWhereStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleWhereStatement();

            state._fsp--;

             after(grammarAccess.getWhereStatementRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleWhereStatement"


    // $ANTLR start "ruleWhereStatement"
    // InternalD3ql.g:162:1: ruleWhereStatement : ( ( rule__WhereStatement__Group__0 ) ) ;
    public final void ruleWhereStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:166:2: ( ( ( rule__WhereStatement__Group__0 ) ) )
            // InternalD3ql.g:167:2: ( ( rule__WhereStatement__Group__0 ) )
            {
            // InternalD3ql.g:167:2: ( ( rule__WhereStatement__Group__0 ) )
            // InternalD3ql.g:168:3: ( rule__WhereStatement__Group__0 )
            {
             before(grammarAccess.getWhereStatementAccess().getGroup()); 
            // InternalD3ql.g:169:3: ( rule__WhereStatement__Group__0 )
            // InternalD3ql.g:169:4: rule__WhereStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__WhereStatement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWhereStatementAccess().getGroup()); 

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
    // $ANTLR end "ruleWhereStatement"


    // $ANTLR start "entryRuleAggregateRoot"
    // InternalD3ql.g:178:1: entryRuleAggregateRoot : ruleAggregateRoot EOF ;
    public final void entryRuleAggregateRoot() throws RecognitionException {
        try {
            // InternalD3ql.g:179:1: ( ruleAggregateRoot EOF )
            // InternalD3ql.g:180:1: ruleAggregateRoot EOF
            {
             before(grammarAccess.getAggregateRootRule()); 
            pushFollow(FOLLOW_1);
            ruleAggregateRoot();

            state._fsp--;

             after(grammarAccess.getAggregateRootRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAggregateRoot"


    // $ANTLR start "ruleAggregateRoot"
    // InternalD3ql.g:187:1: ruleAggregateRoot : ( ( rule__AggregateRoot__Group__0 ) ) ;
    public final void ruleAggregateRoot() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:191:2: ( ( ( rule__AggregateRoot__Group__0 ) ) )
            // InternalD3ql.g:192:2: ( ( rule__AggregateRoot__Group__0 ) )
            {
            // InternalD3ql.g:192:2: ( ( rule__AggregateRoot__Group__0 ) )
            // InternalD3ql.g:193:3: ( rule__AggregateRoot__Group__0 )
            {
             before(grammarAccess.getAggregateRootAccess().getGroup()); 
            // InternalD3ql.g:194:3: ( rule__AggregateRoot__Group__0 )
            // InternalD3ql.g:194:4: rule__AggregateRoot__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AggregateRoot__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAggregateRootAccess().getGroup()); 

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
    // $ANTLR end "ruleAggregateRoot"


    // $ANTLR start "entryRuleAlias"
    // InternalD3ql.g:203:1: entryRuleAlias : ruleAlias EOF ;
    public final void entryRuleAlias() throws RecognitionException {
        try {
            // InternalD3ql.g:204:1: ( ruleAlias EOF )
            // InternalD3ql.g:205:1: ruleAlias EOF
            {
             before(grammarAccess.getAliasRule()); 
            pushFollow(FOLLOW_1);
            ruleAlias();

            state._fsp--;

             after(grammarAccess.getAliasRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAlias"


    // $ANTLR start "ruleAlias"
    // InternalD3ql.g:212:1: ruleAlias : ( ( rule__Alias__NameAssignment ) ) ;
    public final void ruleAlias() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:216:2: ( ( ( rule__Alias__NameAssignment ) ) )
            // InternalD3ql.g:217:2: ( ( rule__Alias__NameAssignment ) )
            {
            // InternalD3ql.g:217:2: ( ( rule__Alias__NameAssignment ) )
            // InternalD3ql.g:218:3: ( rule__Alias__NameAssignment )
            {
             before(grammarAccess.getAliasAccess().getNameAssignment()); 
            // InternalD3ql.g:219:3: ( rule__Alias__NameAssignment )
            // InternalD3ql.g:219:4: rule__Alias__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Alias__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getAliasAccess().getNameAssignment()); 

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
    // $ANTLR end "ruleAlias"


    // $ANTLR start "entryRuleExpression"
    // InternalD3ql.g:228:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalD3ql.g:229:1: ( ruleExpression EOF )
            // InternalD3ql.g:230:1: ruleExpression EOF
            {
             before(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalD3ql.g:237:1: ruleExpression : ( ( rule__Expression__Group__0 ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:241:2: ( ( ( rule__Expression__Group__0 ) ) )
            // InternalD3ql.g:242:2: ( ( rule__Expression__Group__0 ) )
            {
            // InternalD3ql.g:242:2: ( ( rule__Expression__Group__0 ) )
            // InternalD3ql.g:243:3: ( rule__Expression__Group__0 )
            {
             before(grammarAccess.getExpressionAccess().getGroup()); 
            // InternalD3ql.g:244:3: ( rule__Expression__Group__0 )
            // InternalD3ql.g:244:4: rule__Expression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getGroup()); 

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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleOr"
    // InternalD3ql.g:253:1: entryRuleOr : ruleOr EOF ;
    public final void entryRuleOr() throws RecognitionException {
        try {
            // InternalD3ql.g:254:1: ( ruleOr EOF )
            // InternalD3ql.g:255:1: ruleOr EOF
            {
             before(grammarAccess.getOrRule()); 
            pushFollow(FOLLOW_1);
            ruleOr();

            state._fsp--;

             after(grammarAccess.getOrRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleOr"


    // $ANTLR start "ruleOr"
    // InternalD3ql.g:262:1: ruleOr : ( ( rule__Or__Group__0 ) ) ;
    public final void ruleOr() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:266:2: ( ( ( rule__Or__Group__0 ) ) )
            // InternalD3ql.g:267:2: ( ( rule__Or__Group__0 ) )
            {
            // InternalD3ql.g:267:2: ( ( rule__Or__Group__0 ) )
            // InternalD3ql.g:268:3: ( rule__Or__Group__0 )
            {
             before(grammarAccess.getOrAccess().getGroup()); 
            // InternalD3ql.g:269:3: ( rule__Or__Group__0 )
            // InternalD3ql.g:269:4: rule__Or__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Or__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOrAccess().getGroup()); 

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
    // $ANTLR end "ruleOr"


    // $ANTLR start "entryRuleAnd"
    // InternalD3ql.g:278:1: entryRuleAnd : ruleAnd EOF ;
    public final void entryRuleAnd() throws RecognitionException {
        try {
            // InternalD3ql.g:279:1: ( ruleAnd EOF )
            // InternalD3ql.g:280:1: ruleAnd EOF
            {
             before(grammarAccess.getAndRule()); 
            pushFollow(FOLLOW_1);
            ruleAnd();

            state._fsp--;

             after(grammarAccess.getAndRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAnd"


    // $ANTLR start "ruleAnd"
    // InternalD3ql.g:287:1: ruleAnd : ( ( rule__And__Group__0 ) ) ;
    public final void ruleAnd() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:291:2: ( ( ( rule__And__Group__0 ) ) )
            // InternalD3ql.g:292:2: ( ( rule__And__Group__0 ) )
            {
            // InternalD3ql.g:292:2: ( ( rule__And__Group__0 ) )
            // InternalD3ql.g:293:3: ( rule__And__Group__0 )
            {
             before(grammarAccess.getAndAccess().getGroup()); 
            // InternalD3ql.g:294:3: ( rule__And__Group__0 )
            // InternalD3ql.g:294:4: rule__And__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__And__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAndAccess().getGroup()); 

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
    // $ANTLR end "ruleAnd"


    // $ANTLR start "entryRuleEquality"
    // InternalD3ql.g:303:1: entryRuleEquality : ruleEquality EOF ;
    public final void entryRuleEquality() throws RecognitionException {
        try {
            // InternalD3ql.g:304:1: ( ruleEquality EOF )
            // InternalD3ql.g:305:1: ruleEquality EOF
            {
             before(grammarAccess.getEqualityRule()); 
            pushFollow(FOLLOW_1);
            ruleEquality();

            state._fsp--;

             after(grammarAccess.getEqualityRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEquality"


    // $ANTLR start "ruleEquality"
    // InternalD3ql.g:312:1: ruleEquality : ( ( rule__Equality__Group__0 ) ) ;
    public final void ruleEquality() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:316:2: ( ( ( rule__Equality__Group__0 ) ) )
            // InternalD3ql.g:317:2: ( ( rule__Equality__Group__0 ) )
            {
            // InternalD3ql.g:317:2: ( ( rule__Equality__Group__0 ) )
            // InternalD3ql.g:318:3: ( rule__Equality__Group__0 )
            {
             before(grammarAccess.getEqualityAccess().getGroup()); 
            // InternalD3ql.g:319:3: ( rule__Equality__Group__0 )
            // InternalD3ql.g:319:4: rule__Equality__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Equality__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEqualityAccess().getGroup()); 

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
    // $ANTLR end "ruleEquality"


    // $ANTLR start "entryRuleComparison"
    // InternalD3ql.g:328:1: entryRuleComparison : ruleComparison EOF ;
    public final void entryRuleComparison() throws RecognitionException {
        try {
            // InternalD3ql.g:329:1: ( ruleComparison EOF )
            // InternalD3ql.g:330:1: ruleComparison EOF
            {
             before(grammarAccess.getComparisonRule()); 
            pushFollow(FOLLOW_1);
            ruleComparison();

            state._fsp--;

             after(grammarAccess.getComparisonRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleComparison"


    // $ANTLR start "ruleComparison"
    // InternalD3ql.g:337:1: ruleComparison : ( ( rule__Comparison__Group__0 ) ) ;
    public final void ruleComparison() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:341:2: ( ( ( rule__Comparison__Group__0 ) ) )
            // InternalD3ql.g:342:2: ( ( rule__Comparison__Group__0 ) )
            {
            // InternalD3ql.g:342:2: ( ( rule__Comparison__Group__0 ) )
            // InternalD3ql.g:343:3: ( rule__Comparison__Group__0 )
            {
             before(grammarAccess.getComparisonAccess().getGroup()); 
            // InternalD3ql.g:344:3: ( rule__Comparison__Group__0 )
            // InternalD3ql.g:344:4: rule__Comparison__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComparisonAccess().getGroup()); 

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
    // $ANTLR end "ruleComparison"


    // $ANTLR start "entryRulePrimary"
    // InternalD3ql.g:353:1: entryRulePrimary : rulePrimary EOF ;
    public final void entryRulePrimary() throws RecognitionException {
        try {
            // InternalD3ql.g:354:1: ( rulePrimary EOF )
            // InternalD3ql.g:355:1: rulePrimary EOF
            {
             before(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_1);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getPrimaryRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // InternalD3ql.g:362:1: rulePrimary : ( ( rule__Primary__Alternatives ) ) ;
    public final void rulePrimary() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:366:2: ( ( ( rule__Primary__Alternatives ) ) )
            // InternalD3ql.g:367:2: ( ( rule__Primary__Alternatives ) )
            {
            // InternalD3ql.g:367:2: ( ( rule__Primary__Alternatives ) )
            // InternalD3ql.g:368:3: ( rule__Primary__Alternatives )
            {
             before(grammarAccess.getPrimaryAccess().getAlternatives()); 
            // InternalD3ql.g:369:3: ( rule__Primary__Alternatives )
            // InternalD3ql.g:369:4: rule__Primary__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Primary__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryAccess().getAlternatives()); 

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
    // $ANTLR end "rulePrimary"


    // $ANTLR start "entryRuleFQN"
    // InternalD3ql.g:378:1: entryRuleFQN : ruleFQN EOF ;
    public final void entryRuleFQN() throws RecognitionException {
        try {
            // InternalD3ql.g:379:1: ( ruleFQN EOF )
            // InternalD3ql.g:380:1: ruleFQN EOF
            {
             before(grammarAccess.getFQNRule()); 
            pushFollow(FOLLOW_1);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getFQNRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFQN"


    // $ANTLR start "ruleFQN"
    // InternalD3ql.g:387:1: ruleFQN : ( ( rule__FQN__Group__0 ) ) ;
    public final void ruleFQN() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:391:2: ( ( ( rule__FQN__Group__0 ) ) )
            // InternalD3ql.g:392:2: ( ( rule__FQN__Group__0 ) )
            {
            // InternalD3ql.g:392:2: ( ( rule__FQN__Group__0 ) )
            // InternalD3ql.g:393:3: ( rule__FQN__Group__0 )
            {
             before(grammarAccess.getFQNAccess().getGroup()); 
            // InternalD3ql.g:394:3: ( rule__FQN__Group__0 )
            // InternalD3ql.g:394:4: rule__FQN__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FQN__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFQNAccess().getGroup()); 

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
    // $ANTLR end "ruleFQN"


    // $ANTLR start "entryRuleFunctionCall"
    // InternalD3ql.g:403:1: entryRuleFunctionCall : ruleFunctionCall EOF ;
    public final void entryRuleFunctionCall() throws RecognitionException {
        try {
            // InternalD3ql.g:404:1: ( ruleFunctionCall EOF )
            // InternalD3ql.g:405:1: ruleFunctionCall EOF
            {
             before(grammarAccess.getFunctionCallRule()); 
            pushFollow(FOLLOW_1);
            ruleFunctionCall();

            state._fsp--;

             after(grammarAccess.getFunctionCallRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFunctionCall"


    // $ANTLR start "ruleFunctionCall"
    // InternalD3ql.g:412:1: ruleFunctionCall : ( ( rule__FunctionCall__Group__0 ) ) ;
    public final void ruleFunctionCall() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:416:2: ( ( ( rule__FunctionCall__Group__0 ) ) )
            // InternalD3ql.g:417:2: ( ( rule__FunctionCall__Group__0 ) )
            {
            // InternalD3ql.g:417:2: ( ( rule__FunctionCall__Group__0 ) )
            // InternalD3ql.g:418:3: ( rule__FunctionCall__Group__0 )
            {
             before(grammarAccess.getFunctionCallAccess().getGroup()); 
            // InternalD3ql.g:419:3: ( rule__FunctionCall__Group__0 )
            // InternalD3ql.g:419:4: rule__FunctionCall__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FunctionCall__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFunctionCallAccess().getGroup()); 

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
    // $ANTLR end "ruleFunctionCall"


    // $ANTLR start "entryRuleFunctionArgument"
    // InternalD3ql.g:428:1: entryRuleFunctionArgument : ruleFunctionArgument EOF ;
    public final void entryRuleFunctionArgument() throws RecognitionException {
        try {
            // InternalD3ql.g:429:1: ( ruleFunctionArgument EOF )
            // InternalD3ql.g:430:1: ruleFunctionArgument EOF
            {
             before(grammarAccess.getFunctionArgumentRule()); 
            pushFollow(FOLLOW_1);
            ruleFunctionArgument();

            state._fsp--;

             after(grammarAccess.getFunctionArgumentRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFunctionArgument"


    // $ANTLR start "ruleFunctionArgument"
    // InternalD3ql.g:437:1: ruleFunctionArgument : ( ( rule__FunctionArgument__Group__0 ) ) ;
    public final void ruleFunctionArgument() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:441:2: ( ( ( rule__FunctionArgument__Group__0 ) ) )
            // InternalD3ql.g:442:2: ( ( rule__FunctionArgument__Group__0 ) )
            {
            // InternalD3ql.g:442:2: ( ( rule__FunctionArgument__Group__0 ) )
            // InternalD3ql.g:443:3: ( rule__FunctionArgument__Group__0 )
            {
             before(grammarAccess.getFunctionArgumentAccess().getGroup()); 
            // InternalD3ql.g:444:3: ( rule__FunctionArgument__Group__0 )
            // InternalD3ql.g:444:4: rule__FunctionArgument__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FunctionArgument__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFunctionArgumentAccess().getGroup()); 

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
    // $ANTLR end "ruleFunctionArgument"


    // $ANTLR start "entryRuleAtomic"
    // InternalD3ql.g:453:1: entryRuleAtomic : ruleAtomic EOF ;
    public final void entryRuleAtomic() throws RecognitionException {
        try {
            // InternalD3ql.g:454:1: ( ruleAtomic EOF )
            // InternalD3ql.g:455:1: ruleAtomic EOF
            {
             before(grammarAccess.getAtomicRule()); 
            pushFollow(FOLLOW_1);
            ruleAtomic();

            state._fsp--;

             after(grammarAccess.getAtomicRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAtomic"


    // $ANTLR start "ruleAtomic"
    // InternalD3ql.g:462:1: ruleAtomic : ( ( rule__Atomic__Alternatives ) ) ;
    public final void ruleAtomic() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:466:2: ( ( ( rule__Atomic__Alternatives ) ) )
            // InternalD3ql.g:467:2: ( ( rule__Atomic__Alternatives ) )
            {
            // InternalD3ql.g:467:2: ( ( rule__Atomic__Alternatives ) )
            // InternalD3ql.g:468:3: ( rule__Atomic__Alternatives )
            {
             before(grammarAccess.getAtomicAccess().getAlternatives()); 
            // InternalD3ql.g:469:3: ( rule__Atomic__Alternatives )
            // InternalD3ql.g:469:4: rule__Atomic__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Atomic__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAtomicAccess().getAlternatives()); 

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
    // $ANTLR end "ruleAtomic"


    // $ANTLR start "rule__SelectStatement__Alternatives_1"
    // InternalD3ql.g:477:1: rule__SelectStatement__Alternatives_1 : ( ( ( rule__SelectStatement__ArteriskAssignment_1_0 ) ) | ( ( rule__SelectStatement__Group_1_1__0 ) ) );
    public final void rule__SelectStatement__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:481:1: ( ( ( rule__SelectStatement__ArteriskAssignment_1_0 ) ) | ( ( rule__SelectStatement__Group_1_1__0 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==33) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_ID) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalD3ql.g:482:2: ( ( rule__SelectStatement__ArteriskAssignment_1_0 ) )
                    {
                    // InternalD3ql.g:482:2: ( ( rule__SelectStatement__ArteriskAssignment_1_0 ) )
                    // InternalD3ql.g:483:3: ( rule__SelectStatement__ArteriskAssignment_1_0 )
                    {
                     before(grammarAccess.getSelectStatementAccess().getArteriskAssignment_1_0()); 
                    // InternalD3ql.g:484:3: ( rule__SelectStatement__ArteriskAssignment_1_0 )
                    // InternalD3ql.g:484:4: rule__SelectStatement__ArteriskAssignment_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SelectStatement__ArteriskAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSelectStatementAccess().getArteriskAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalD3ql.g:488:2: ( ( rule__SelectStatement__Group_1_1__0 ) )
                    {
                    // InternalD3ql.g:488:2: ( ( rule__SelectStatement__Group_1_1__0 ) )
                    // InternalD3ql.g:489:3: ( rule__SelectStatement__Group_1_1__0 )
                    {
                     before(grammarAccess.getSelectStatementAccess().getGroup_1_1()); 
                    // InternalD3ql.g:490:3: ( rule__SelectStatement__Group_1_1__0 )
                    // InternalD3ql.g:490:4: rule__SelectStatement__Group_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SelectStatement__Group_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSelectStatementAccess().getGroup_1_1()); 

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
    // $ANTLR end "rule__SelectStatement__Alternatives_1"


    // $ANTLR start "rule__SelectionItem__ExpressionAlternatives_0_0"
    // InternalD3ql.g:498:1: rule__SelectionItem__ExpressionAlternatives_0_0 : ( ( ruleFQN ) | ( ruleFunctionCall ) );
    public final void rule__SelectionItem__ExpressionAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:502:1: ( ( ruleFQN ) | ( ruleFunctionCall ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==27) ) {
                    alt2=2;
                }
                else if ( (LA2_1==30) ) {
                    alt2=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalD3ql.g:503:2: ( ruleFQN )
                    {
                    // InternalD3ql.g:503:2: ( ruleFQN )
                    // InternalD3ql.g:504:3: ruleFQN
                    {
                     before(grammarAccess.getSelectionItemAccess().getExpressionFQNParserRuleCall_0_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleFQN();

                    state._fsp--;

                     after(grammarAccess.getSelectionItemAccess().getExpressionFQNParserRuleCall_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalD3ql.g:509:2: ( ruleFunctionCall )
                    {
                    // InternalD3ql.g:509:2: ( ruleFunctionCall )
                    // InternalD3ql.g:510:3: ruleFunctionCall
                    {
                     before(grammarAccess.getSelectionItemAccess().getExpressionFunctionCallParserRuleCall_0_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleFunctionCall();

                    state._fsp--;

                     after(grammarAccess.getSelectionItemAccess().getExpressionFunctionCallParserRuleCall_0_0_1()); 

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
    // $ANTLR end "rule__SelectionItem__ExpressionAlternatives_0_0"


    // $ANTLR start "rule__Equality__OpAlternatives_1_1_0"
    // InternalD3ql.g:519:1: rule__Equality__OpAlternatives_1_1_0 : ( ( '=' ) | ( '!=' ) );
    public final void rule__Equality__OpAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:523:1: ( ( '=' ) | ( '!=' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            else if ( (LA3_0==12) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalD3ql.g:524:2: ( '=' )
                    {
                    // InternalD3ql.g:524:2: ( '=' )
                    // InternalD3ql.g:525:3: '='
                    {
                     before(grammarAccess.getEqualityAccess().getOpEqualsSignKeyword_1_1_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getEqualityAccess().getOpEqualsSignKeyword_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalD3ql.g:530:2: ( '!=' )
                    {
                    // InternalD3ql.g:530:2: ( '!=' )
                    // InternalD3ql.g:531:3: '!='
                    {
                     before(grammarAccess.getEqualityAccess().getOpExclamationMarkEqualsSignKeyword_1_1_0_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getEqualityAccess().getOpExclamationMarkEqualsSignKeyword_1_1_0_1()); 

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
    // $ANTLR end "rule__Equality__OpAlternatives_1_1_0"


    // $ANTLR start "rule__Comparison__Alternatives_1"
    // InternalD3ql.g:540:1: rule__Comparison__Alternatives_1 : ( ( ( rule__Comparison__Group_1_0__0 ) ) | ( ( rule__Comparison__Group_1_1__0 ) ) | ( ( rule__Comparison__Group_1_2__0 ) ) );
    public final void rule__Comparison__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:544:1: ( ( ( rule__Comparison__Group_1_0__0 ) ) | ( ( rule__Comparison__Group_1_1__0 ) ) | ( ( rule__Comparison__Group_1_2__0 ) ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                {
                alt4=1;
                }
                break;
            case 34:
                {
                alt4=2;
                }
                break;
            case 35:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalD3ql.g:545:2: ( ( rule__Comparison__Group_1_0__0 ) )
                    {
                    // InternalD3ql.g:545:2: ( ( rule__Comparison__Group_1_0__0 ) )
                    // InternalD3ql.g:546:3: ( rule__Comparison__Group_1_0__0 )
                    {
                     before(grammarAccess.getComparisonAccess().getGroup_1_0()); 
                    // InternalD3ql.g:547:3: ( rule__Comparison__Group_1_0__0 )
                    // InternalD3ql.g:547:4: rule__Comparison__Group_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Comparison__Group_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getComparisonAccess().getGroup_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalD3ql.g:551:2: ( ( rule__Comparison__Group_1_1__0 ) )
                    {
                    // InternalD3ql.g:551:2: ( ( rule__Comparison__Group_1_1__0 ) )
                    // InternalD3ql.g:552:3: ( rule__Comparison__Group_1_1__0 )
                    {
                     before(grammarAccess.getComparisonAccess().getGroup_1_1()); 
                    // InternalD3ql.g:553:3: ( rule__Comparison__Group_1_1__0 )
                    // InternalD3ql.g:553:4: rule__Comparison__Group_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Comparison__Group_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getComparisonAccess().getGroup_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalD3ql.g:557:2: ( ( rule__Comparison__Group_1_2__0 ) )
                    {
                    // InternalD3ql.g:557:2: ( ( rule__Comparison__Group_1_2__0 ) )
                    // InternalD3ql.g:558:3: ( rule__Comparison__Group_1_2__0 )
                    {
                     before(grammarAccess.getComparisonAccess().getGroup_1_2()); 
                    // InternalD3ql.g:559:3: ( rule__Comparison__Group_1_2__0 )
                    // InternalD3ql.g:559:4: rule__Comparison__Group_1_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Comparison__Group_1_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getComparisonAccess().getGroup_1_2()); 

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
    // $ANTLR end "rule__Comparison__Alternatives_1"


    // $ANTLR start "rule__Comparison__OpAlternatives_1_0_1_0"
    // InternalD3ql.g:567:1: rule__Comparison__OpAlternatives_1_0_1_0 : ( ( '>=' ) | ( '<=' ) | ( '>' ) | ( '<' ) | ( 'like' ) );
    public final void rule__Comparison__OpAlternatives_1_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:571:1: ( ( '>=' ) | ( '<=' ) | ( '>' ) | ( '<' ) | ( 'like' ) )
            int alt5=5;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt5=1;
                }
                break;
            case 14:
                {
                alt5=2;
                }
                break;
            case 15:
                {
                alt5=3;
                }
                break;
            case 16:
                {
                alt5=4;
                }
                break;
            case 17:
                {
                alt5=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalD3ql.g:572:2: ( '>=' )
                    {
                    // InternalD3ql.g:572:2: ( '>=' )
                    // InternalD3ql.g:573:3: '>='
                    {
                     before(grammarAccess.getComparisonAccess().getOpGreaterThanSignEqualsSignKeyword_1_0_1_0_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getComparisonAccess().getOpGreaterThanSignEqualsSignKeyword_1_0_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalD3ql.g:578:2: ( '<=' )
                    {
                    // InternalD3ql.g:578:2: ( '<=' )
                    // InternalD3ql.g:579:3: '<='
                    {
                     before(grammarAccess.getComparisonAccess().getOpLessThanSignEqualsSignKeyword_1_0_1_0_1()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getComparisonAccess().getOpLessThanSignEqualsSignKeyword_1_0_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalD3ql.g:584:2: ( '>' )
                    {
                    // InternalD3ql.g:584:2: ( '>' )
                    // InternalD3ql.g:585:3: '>'
                    {
                     before(grammarAccess.getComparisonAccess().getOpGreaterThanSignKeyword_1_0_1_0_2()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getComparisonAccess().getOpGreaterThanSignKeyword_1_0_1_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalD3ql.g:590:2: ( '<' )
                    {
                    // InternalD3ql.g:590:2: ( '<' )
                    // InternalD3ql.g:591:3: '<'
                    {
                     before(grammarAccess.getComparisonAccess().getOpLessThanSignKeyword_1_0_1_0_3()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getComparisonAccess().getOpLessThanSignKeyword_1_0_1_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalD3ql.g:596:2: ( 'like' )
                    {
                    // InternalD3ql.g:596:2: ( 'like' )
                    // InternalD3ql.g:597:3: 'like'
                    {
                     before(grammarAccess.getComparisonAccess().getOpLikeKeyword_1_0_1_0_4()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getComparisonAccess().getOpLikeKeyword_1_0_1_0_4()); 

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
    // $ANTLR end "rule__Comparison__OpAlternatives_1_0_1_0"


    // $ANTLR start "rule__Primary__Alternatives"
    // InternalD3ql.g:606:1: rule__Primary__Alternatives : ( ( ( rule__Primary__Group_0__0 ) ) | ( ( rule__Primary__Group_1__0 ) ) | ( ruleFQN ) | ( ruleFunctionCall ) | ( ruleAtomic ) );
    public final void rule__Primary__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:610:1: ( ( ( rule__Primary__Group_0__0 ) ) | ( ( rule__Primary__Group_1__0 ) ) | ( ruleFQN ) | ( ruleFunctionCall ) | ( ruleAtomic ) )
            int alt6=5;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt6=1;
                }
                break;
            case 29:
                {
                alt6=2;
                }
                break;
            case RULE_ID:
                {
                switch ( input.LA(2) ) {
                case 30:
                    {
                    alt6=3;
                    }
                    break;
                case 27:
                    {
                    alt6=4;
                    }
                    break;
                case EOF:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                case 16:
                case 17:
                case 23:
                case 25:
                case 26:
                case 28:
                case 34:
                case 35:
                    {
                    alt6=5;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 3, input);

                    throw nvae;
                }

                }
                break;
            case RULE_INT:
            case RULE_STRING:
            case 18:
            case 19:
            case 31:
            case 36:
                {
                alt6=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalD3ql.g:611:2: ( ( rule__Primary__Group_0__0 ) )
                    {
                    // InternalD3ql.g:611:2: ( ( rule__Primary__Group_0__0 ) )
                    // InternalD3ql.g:612:3: ( rule__Primary__Group_0__0 )
                    {
                     before(grammarAccess.getPrimaryAccess().getGroup_0()); 
                    // InternalD3ql.g:613:3: ( rule__Primary__Group_0__0 )
                    // InternalD3ql.g:613:4: rule__Primary__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Primary__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalD3ql.g:617:2: ( ( rule__Primary__Group_1__0 ) )
                    {
                    // InternalD3ql.g:617:2: ( ( rule__Primary__Group_1__0 ) )
                    // InternalD3ql.g:618:3: ( rule__Primary__Group_1__0 )
                    {
                     before(grammarAccess.getPrimaryAccess().getGroup_1()); 
                    // InternalD3ql.g:619:3: ( rule__Primary__Group_1__0 )
                    // InternalD3ql.g:619:4: rule__Primary__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Primary__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalD3ql.g:623:2: ( ruleFQN )
                    {
                    // InternalD3ql.g:623:2: ( ruleFQN )
                    // InternalD3ql.g:624:3: ruleFQN
                    {
                     before(grammarAccess.getPrimaryAccess().getFQNParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleFQN();

                    state._fsp--;

                     after(grammarAccess.getPrimaryAccess().getFQNParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalD3ql.g:629:2: ( ruleFunctionCall )
                    {
                    // InternalD3ql.g:629:2: ( ruleFunctionCall )
                    // InternalD3ql.g:630:3: ruleFunctionCall
                    {
                     before(grammarAccess.getPrimaryAccess().getFunctionCallParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleFunctionCall();

                    state._fsp--;

                     after(grammarAccess.getPrimaryAccess().getFunctionCallParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalD3ql.g:635:2: ( ruleAtomic )
                    {
                    // InternalD3ql.g:635:2: ( ruleAtomic )
                    // InternalD3ql.g:636:3: ruleAtomic
                    {
                     before(grammarAccess.getPrimaryAccess().getAtomicParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleAtomic();

                    state._fsp--;

                     after(grammarAccess.getPrimaryAccess().getAtomicParserRuleCall_4()); 

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
    // $ANTLR end "rule__Primary__Alternatives"


    // $ANTLR start "rule__FunctionArgument__Alternatives_1"
    // InternalD3ql.g:645:1: rule__FunctionArgument__Alternatives_1 : ( ( ( rule__FunctionArgument__ReferenceAssignment_1_0 ) ) | ( ( rule__FunctionArgument__FqnAssignment_1_1 ) ) );
    public final void rule__FunctionArgument__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:649:1: ( ( ( rule__FunctionArgument__ReferenceAssignment_1_0 ) ) | ( ( rule__FunctionArgument__FqnAssignment_1_1 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==EOF||LA7_1==21||LA7_1==28) ) {
                    alt7=1;
                }
                else if ( (LA7_1==30) ) {
                    alt7=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalD3ql.g:650:2: ( ( rule__FunctionArgument__ReferenceAssignment_1_0 ) )
                    {
                    // InternalD3ql.g:650:2: ( ( rule__FunctionArgument__ReferenceAssignment_1_0 ) )
                    // InternalD3ql.g:651:3: ( rule__FunctionArgument__ReferenceAssignment_1_0 )
                    {
                     before(grammarAccess.getFunctionArgumentAccess().getReferenceAssignment_1_0()); 
                    // InternalD3ql.g:652:3: ( rule__FunctionArgument__ReferenceAssignment_1_0 )
                    // InternalD3ql.g:652:4: rule__FunctionArgument__ReferenceAssignment_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FunctionArgument__ReferenceAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFunctionArgumentAccess().getReferenceAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalD3ql.g:656:2: ( ( rule__FunctionArgument__FqnAssignment_1_1 ) )
                    {
                    // InternalD3ql.g:656:2: ( ( rule__FunctionArgument__FqnAssignment_1_1 ) )
                    // InternalD3ql.g:657:3: ( rule__FunctionArgument__FqnAssignment_1_1 )
                    {
                     before(grammarAccess.getFunctionArgumentAccess().getFqnAssignment_1_1()); 
                    // InternalD3ql.g:658:3: ( rule__FunctionArgument__FqnAssignment_1_1 )
                    // InternalD3ql.g:658:4: rule__FunctionArgument__FqnAssignment_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__FunctionArgument__FqnAssignment_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getFunctionArgumentAccess().getFqnAssignment_1_1()); 

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
    // $ANTLR end "rule__FunctionArgument__Alternatives_1"


    // $ANTLR start "rule__Atomic__Alternatives"
    // InternalD3ql.g:666:1: rule__Atomic__Alternatives : ( ( ( rule__Atomic__Group_0__0 ) ) | ( ( rule__Atomic__Group_1__0 ) ) | ( ( rule__Atomic__Group_2__0 ) ) | ( ( rule__Atomic__Group_3__0 ) ) | ( ( rule__Atomic__Group_4__0 ) ) | ( ( rule__Atomic__Group_5__0 ) ) );
    public final void rule__Atomic__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:670:1: ( ( ( rule__Atomic__Group_0__0 ) ) | ( ( rule__Atomic__Group_1__0 ) ) | ( ( rule__Atomic__Group_2__0 ) ) | ( ( rule__Atomic__Group_3__0 ) ) | ( ( rule__Atomic__Group_4__0 ) ) | ( ( rule__Atomic__Group_5__0 ) ) )
            int alt8=6;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt8=1;
                }
                break;
            case RULE_STRING:
                {
                alt8=2;
                }
                break;
            case 18:
            case 19:
                {
                alt8=3;
                }
                break;
            case 36:
                {
                alt8=4;
                }
                break;
            case 31:
                {
                alt8=5;
                }
                break;
            case RULE_ID:
                {
                alt8=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalD3ql.g:671:2: ( ( rule__Atomic__Group_0__0 ) )
                    {
                    // InternalD3ql.g:671:2: ( ( rule__Atomic__Group_0__0 ) )
                    // InternalD3ql.g:672:3: ( rule__Atomic__Group_0__0 )
                    {
                     before(grammarAccess.getAtomicAccess().getGroup_0()); 
                    // InternalD3ql.g:673:3: ( rule__Atomic__Group_0__0 )
                    // InternalD3ql.g:673:4: rule__Atomic__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Atomic__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAtomicAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalD3ql.g:677:2: ( ( rule__Atomic__Group_1__0 ) )
                    {
                    // InternalD3ql.g:677:2: ( ( rule__Atomic__Group_1__0 ) )
                    // InternalD3ql.g:678:3: ( rule__Atomic__Group_1__0 )
                    {
                     before(grammarAccess.getAtomicAccess().getGroup_1()); 
                    // InternalD3ql.g:679:3: ( rule__Atomic__Group_1__0 )
                    // InternalD3ql.g:679:4: rule__Atomic__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Atomic__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAtomicAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalD3ql.g:683:2: ( ( rule__Atomic__Group_2__0 ) )
                    {
                    // InternalD3ql.g:683:2: ( ( rule__Atomic__Group_2__0 ) )
                    // InternalD3ql.g:684:3: ( rule__Atomic__Group_2__0 )
                    {
                     before(grammarAccess.getAtomicAccess().getGroup_2()); 
                    // InternalD3ql.g:685:3: ( rule__Atomic__Group_2__0 )
                    // InternalD3ql.g:685:4: rule__Atomic__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Atomic__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAtomicAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalD3ql.g:689:2: ( ( rule__Atomic__Group_3__0 ) )
                    {
                    // InternalD3ql.g:689:2: ( ( rule__Atomic__Group_3__0 ) )
                    // InternalD3ql.g:690:3: ( rule__Atomic__Group_3__0 )
                    {
                     before(grammarAccess.getAtomicAccess().getGroup_3()); 
                    // InternalD3ql.g:691:3: ( rule__Atomic__Group_3__0 )
                    // InternalD3ql.g:691:4: rule__Atomic__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Atomic__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAtomicAccess().getGroup_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalD3ql.g:695:2: ( ( rule__Atomic__Group_4__0 ) )
                    {
                    // InternalD3ql.g:695:2: ( ( rule__Atomic__Group_4__0 ) )
                    // InternalD3ql.g:696:3: ( rule__Atomic__Group_4__0 )
                    {
                     before(grammarAccess.getAtomicAccess().getGroup_4()); 
                    // InternalD3ql.g:697:3: ( rule__Atomic__Group_4__0 )
                    // InternalD3ql.g:697:4: rule__Atomic__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Atomic__Group_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAtomicAccess().getGroup_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalD3ql.g:701:2: ( ( rule__Atomic__Group_5__0 ) )
                    {
                    // InternalD3ql.g:701:2: ( ( rule__Atomic__Group_5__0 ) )
                    // InternalD3ql.g:702:3: ( rule__Atomic__Group_5__0 )
                    {
                     before(grammarAccess.getAtomicAccess().getGroup_5()); 
                    // InternalD3ql.g:703:3: ( rule__Atomic__Group_5__0 )
                    // InternalD3ql.g:703:4: rule__Atomic__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Atomic__Group_5__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAtomicAccess().getGroup_5()); 

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
    // $ANTLR end "rule__Atomic__Alternatives"


    // $ANTLR start "rule__Atomic__ValueAlternatives_2_1_0"
    // InternalD3ql.g:711:1: rule__Atomic__ValueAlternatives_2_1_0 : ( ( 'true' ) | ( 'false' ) );
    public final void rule__Atomic__ValueAlternatives_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:715:1: ( ( 'true' ) | ( 'false' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==18) ) {
                alt9=1;
            }
            else if ( (LA9_0==19) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalD3ql.g:716:2: ( 'true' )
                    {
                    // InternalD3ql.g:716:2: ( 'true' )
                    // InternalD3ql.g:717:3: 'true'
                    {
                     before(grammarAccess.getAtomicAccess().getValueTrueKeyword_2_1_0_0()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getAtomicAccess().getValueTrueKeyword_2_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalD3ql.g:722:2: ( 'false' )
                    {
                    // InternalD3ql.g:722:2: ( 'false' )
                    // InternalD3ql.g:723:3: 'false'
                    {
                     before(grammarAccess.getAtomicAccess().getValueFalseKeyword_2_1_0_1()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getAtomicAccess().getValueFalseKeyword_2_1_0_1()); 

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
    // $ANTLR end "rule__Atomic__ValueAlternatives_2_1_0"


    // $ANTLR start "rule__Query__Group__0"
    // InternalD3ql.g:732:1: rule__Query__Group__0 : rule__Query__Group__0__Impl rule__Query__Group__1 ;
    public final void rule__Query__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:736:1: ( rule__Query__Group__0__Impl rule__Query__Group__1 )
            // InternalD3ql.g:737:2: rule__Query__Group__0__Impl rule__Query__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Query__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Query__Group__1();

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
    // $ANTLR end "rule__Query__Group__0"


    // $ANTLR start "rule__Query__Group__0__Impl"
    // InternalD3ql.g:744:1: rule__Query__Group__0__Impl : ( ( rule__Query__FromAssignment_0 ) ) ;
    public final void rule__Query__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:748:1: ( ( ( rule__Query__FromAssignment_0 ) ) )
            // InternalD3ql.g:749:1: ( ( rule__Query__FromAssignment_0 ) )
            {
            // InternalD3ql.g:749:1: ( ( rule__Query__FromAssignment_0 ) )
            // InternalD3ql.g:750:2: ( rule__Query__FromAssignment_0 )
            {
             before(grammarAccess.getQueryAccess().getFromAssignment_0()); 
            // InternalD3ql.g:751:2: ( rule__Query__FromAssignment_0 )
            // InternalD3ql.g:751:3: rule__Query__FromAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Query__FromAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getQueryAccess().getFromAssignment_0()); 

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
    // $ANTLR end "rule__Query__Group__0__Impl"


    // $ANTLR start "rule__Query__Group__1"
    // InternalD3ql.g:759:1: rule__Query__Group__1 : rule__Query__Group__1__Impl rule__Query__Group__2 ;
    public final void rule__Query__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:763:1: ( rule__Query__Group__1__Impl rule__Query__Group__2 )
            // InternalD3ql.g:764:2: rule__Query__Group__1__Impl rule__Query__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Query__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Query__Group__2();

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
    // $ANTLR end "rule__Query__Group__1"


    // $ANTLR start "rule__Query__Group__1__Impl"
    // InternalD3ql.g:771:1: rule__Query__Group__1__Impl : ( ( rule__Query__SelectAssignment_1 ) ) ;
    public final void rule__Query__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:775:1: ( ( ( rule__Query__SelectAssignment_1 ) ) )
            // InternalD3ql.g:776:1: ( ( rule__Query__SelectAssignment_1 ) )
            {
            // InternalD3ql.g:776:1: ( ( rule__Query__SelectAssignment_1 ) )
            // InternalD3ql.g:777:2: ( rule__Query__SelectAssignment_1 )
            {
             before(grammarAccess.getQueryAccess().getSelectAssignment_1()); 
            // InternalD3ql.g:778:2: ( rule__Query__SelectAssignment_1 )
            // InternalD3ql.g:778:3: rule__Query__SelectAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Query__SelectAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getQueryAccess().getSelectAssignment_1()); 

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
    // $ANTLR end "rule__Query__Group__1__Impl"


    // $ANTLR start "rule__Query__Group__2"
    // InternalD3ql.g:786:1: rule__Query__Group__2 : rule__Query__Group__2__Impl ;
    public final void rule__Query__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:790:1: ( rule__Query__Group__2__Impl )
            // InternalD3ql.g:791:2: rule__Query__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Query__Group__2__Impl();

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
    // $ANTLR end "rule__Query__Group__2"


    // $ANTLR start "rule__Query__Group__2__Impl"
    // InternalD3ql.g:797:1: rule__Query__Group__2__Impl : ( ( rule__Query__WhereAssignment_2 )? ) ;
    public final void rule__Query__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:801:1: ( ( ( rule__Query__WhereAssignment_2 )? ) )
            // InternalD3ql.g:802:1: ( ( rule__Query__WhereAssignment_2 )? )
            {
            // InternalD3ql.g:802:1: ( ( rule__Query__WhereAssignment_2 )? )
            // InternalD3ql.g:803:2: ( rule__Query__WhereAssignment_2 )?
            {
             before(grammarAccess.getQueryAccess().getWhereAssignment_2()); 
            // InternalD3ql.g:804:2: ( rule__Query__WhereAssignment_2 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==24) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalD3ql.g:804:3: rule__Query__WhereAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Query__WhereAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQueryAccess().getWhereAssignment_2()); 

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
    // $ANTLR end "rule__Query__Group__2__Impl"


    // $ANTLR start "rule__FromStatement__Group__0"
    // InternalD3ql.g:813:1: rule__FromStatement__Group__0 : rule__FromStatement__Group__0__Impl rule__FromStatement__Group__1 ;
    public final void rule__FromStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:817:1: ( rule__FromStatement__Group__0__Impl rule__FromStatement__Group__1 )
            // InternalD3ql.g:818:2: rule__FromStatement__Group__0__Impl rule__FromStatement__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__FromStatement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FromStatement__Group__1();

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
    // $ANTLR end "rule__FromStatement__Group__0"


    // $ANTLR start "rule__FromStatement__Group__0__Impl"
    // InternalD3ql.g:825:1: rule__FromStatement__Group__0__Impl : ( 'from' ) ;
    public final void rule__FromStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:829:1: ( ( 'from' ) )
            // InternalD3ql.g:830:1: ( 'from' )
            {
            // InternalD3ql.g:830:1: ( 'from' )
            // InternalD3ql.g:831:2: 'from'
            {
             before(grammarAccess.getFromStatementAccess().getFromKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getFromStatementAccess().getFromKeyword_0()); 

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
    // $ANTLR end "rule__FromStatement__Group__0__Impl"


    // $ANTLR start "rule__FromStatement__Group__1"
    // InternalD3ql.g:840:1: rule__FromStatement__Group__1 : rule__FromStatement__Group__1__Impl rule__FromStatement__Group__2 ;
    public final void rule__FromStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:844:1: ( rule__FromStatement__Group__1__Impl rule__FromStatement__Group__2 )
            // InternalD3ql.g:845:2: rule__FromStatement__Group__1__Impl rule__FromStatement__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__FromStatement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FromStatement__Group__2();

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
    // $ANTLR end "rule__FromStatement__Group__1"


    // $ANTLR start "rule__FromStatement__Group__1__Impl"
    // InternalD3ql.g:852:1: rule__FromStatement__Group__1__Impl : ( ( rule__FromStatement__AggregatesAssignment_1 ) ) ;
    public final void rule__FromStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:856:1: ( ( ( rule__FromStatement__AggregatesAssignment_1 ) ) )
            // InternalD3ql.g:857:1: ( ( rule__FromStatement__AggregatesAssignment_1 ) )
            {
            // InternalD3ql.g:857:1: ( ( rule__FromStatement__AggregatesAssignment_1 ) )
            // InternalD3ql.g:858:2: ( rule__FromStatement__AggregatesAssignment_1 )
            {
             before(grammarAccess.getFromStatementAccess().getAggregatesAssignment_1()); 
            // InternalD3ql.g:859:2: ( rule__FromStatement__AggregatesAssignment_1 )
            // InternalD3ql.g:859:3: rule__FromStatement__AggregatesAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__FromStatement__AggregatesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFromStatementAccess().getAggregatesAssignment_1()); 

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
    // $ANTLR end "rule__FromStatement__Group__1__Impl"


    // $ANTLR start "rule__FromStatement__Group__2"
    // InternalD3ql.g:867:1: rule__FromStatement__Group__2 : rule__FromStatement__Group__2__Impl ;
    public final void rule__FromStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:871:1: ( rule__FromStatement__Group__2__Impl )
            // InternalD3ql.g:872:2: rule__FromStatement__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FromStatement__Group__2__Impl();

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
    // $ANTLR end "rule__FromStatement__Group__2"


    // $ANTLR start "rule__FromStatement__Group__2__Impl"
    // InternalD3ql.g:878:1: rule__FromStatement__Group__2__Impl : ( ( rule__FromStatement__Group_2__0 )* ) ;
    public final void rule__FromStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:882:1: ( ( ( rule__FromStatement__Group_2__0 )* ) )
            // InternalD3ql.g:883:1: ( ( rule__FromStatement__Group_2__0 )* )
            {
            // InternalD3ql.g:883:1: ( ( rule__FromStatement__Group_2__0 )* )
            // InternalD3ql.g:884:2: ( rule__FromStatement__Group_2__0 )*
            {
             before(grammarAccess.getFromStatementAccess().getGroup_2()); 
            // InternalD3ql.g:885:2: ( rule__FromStatement__Group_2__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==21) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalD3ql.g:885:3: rule__FromStatement__Group_2__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__FromStatement__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getFromStatementAccess().getGroup_2()); 

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
    // $ANTLR end "rule__FromStatement__Group__2__Impl"


    // $ANTLR start "rule__FromStatement__Group_2__0"
    // InternalD3ql.g:894:1: rule__FromStatement__Group_2__0 : rule__FromStatement__Group_2__0__Impl rule__FromStatement__Group_2__1 ;
    public final void rule__FromStatement__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:898:1: ( rule__FromStatement__Group_2__0__Impl rule__FromStatement__Group_2__1 )
            // InternalD3ql.g:899:2: rule__FromStatement__Group_2__0__Impl rule__FromStatement__Group_2__1
            {
            pushFollow(FOLLOW_5);
            rule__FromStatement__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FromStatement__Group_2__1();

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
    // $ANTLR end "rule__FromStatement__Group_2__0"


    // $ANTLR start "rule__FromStatement__Group_2__0__Impl"
    // InternalD3ql.g:906:1: rule__FromStatement__Group_2__0__Impl : ( ',' ) ;
    public final void rule__FromStatement__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:910:1: ( ( ',' ) )
            // InternalD3ql.g:911:1: ( ',' )
            {
            // InternalD3ql.g:911:1: ( ',' )
            // InternalD3ql.g:912:2: ','
            {
             before(grammarAccess.getFromStatementAccess().getCommaKeyword_2_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getFromStatementAccess().getCommaKeyword_2_0()); 

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
    // $ANTLR end "rule__FromStatement__Group_2__0__Impl"


    // $ANTLR start "rule__FromStatement__Group_2__1"
    // InternalD3ql.g:921:1: rule__FromStatement__Group_2__1 : rule__FromStatement__Group_2__1__Impl ;
    public final void rule__FromStatement__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:925:1: ( rule__FromStatement__Group_2__1__Impl )
            // InternalD3ql.g:926:2: rule__FromStatement__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FromStatement__Group_2__1__Impl();

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
    // $ANTLR end "rule__FromStatement__Group_2__1"


    // $ANTLR start "rule__FromStatement__Group_2__1__Impl"
    // InternalD3ql.g:932:1: rule__FromStatement__Group_2__1__Impl : ( ( rule__FromStatement__AggregatesAssignment_2_1 ) ) ;
    public final void rule__FromStatement__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:936:1: ( ( ( rule__FromStatement__AggregatesAssignment_2_1 ) ) )
            // InternalD3ql.g:937:1: ( ( rule__FromStatement__AggregatesAssignment_2_1 ) )
            {
            // InternalD3ql.g:937:1: ( ( rule__FromStatement__AggregatesAssignment_2_1 ) )
            // InternalD3ql.g:938:2: ( rule__FromStatement__AggregatesAssignment_2_1 )
            {
             before(grammarAccess.getFromStatementAccess().getAggregatesAssignment_2_1()); 
            // InternalD3ql.g:939:2: ( rule__FromStatement__AggregatesAssignment_2_1 )
            // InternalD3ql.g:939:3: rule__FromStatement__AggregatesAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__FromStatement__AggregatesAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getFromStatementAccess().getAggregatesAssignment_2_1()); 

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
    // $ANTLR end "rule__FromStatement__Group_2__1__Impl"


    // $ANTLR start "rule__SelectStatement__Group__0"
    // InternalD3ql.g:948:1: rule__SelectStatement__Group__0 : rule__SelectStatement__Group__0__Impl rule__SelectStatement__Group__1 ;
    public final void rule__SelectStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:952:1: ( rule__SelectStatement__Group__0__Impl rule__SelectStatement__Group__1 )
            // InternalD3ql.g:953:2: rule__SelectStatement__Group__0__Impl rule__SelectStatement__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__SelectStatement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelectStatement__Group__1();

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
    // $ANTLR end "rule__SelectStatement__Group__0"


    // $ANTLR start "rule__SelectStatement__Group__0__Impl"
    // InternalD3ql.g:960:1: rule__SelectStatement__Group__0__Impl : ( 'select' ) ;
    public final void rule__SelectStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:964:1: ( ( 'select' ) )
            // InternalD3ql.g:965:1: ( 'select' )
            {
            // InternalD3ql.g:965:1: ( 'select' )
            // InternalD3ql.g:966:2: 'select'
            {
             before(grammarAccess.getSelectStatementAccess().getSelectKeyword_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getSelectStatementAccess().getSelectKeyword_0()); 

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
    // $ANTLR end "rule__SelectStatement__Group__0__Impl"


    // $ANTLR start "rule__SelectStatement__Group__1"
    // InternalD3ql.g:975:1: rule__SelectStatement__Group__1 : rule__SelectStatement__Group__1__Impl ;
    public final void rule__SelectStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:979:1: ( rule__SelectStatement__Group__1__Impl )
            // InternalD3ql.g:980:2: rule__SelectStatement__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SelectStatement__Group__1__Impl();

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
    // $ANTLR end "rule__SelectStatement__Group__1"


    // $ANTLR start "rule__SelectStatement__Group__1__Impl"
    // InternalD3ql.g:986:1: rule__SelectStatement__Group__1__Impl : ( ( rule__SelectStatement__Alternatives_1 ) ) ;
    public final void rule__SelectStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:990:1: ( ( ( rule__SelectStatement__Alternatives_1 ) ) )
            // InternalD3ql.g:991:1: ( ( rule__SelectStatement__Alternatives_1 ) )
            {
            // InternalD3ql.g:991:1: ( ( rule__SelectStatement__Alternatives_1 ) )
            // InternalD3ql.g:992:2: ( rule__SelectStatement__Alternatives_1 )
            {
             before(grammarAccess.getSelectStatementAccess().getAlternatives_1()); 
            // InternalD3ql.g:993:2: ( rule__SelectStatement__Alternatives_1 )
            // InternalD3ql.g:993:3: rule__SelectStatement__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__SelectStatement__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getSelectStatementAccess().getAlternatives_1()); 

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
    // $ANTLR end "rule__SelectStatement__Group__1__Impl"


    // $ANTLR start "rule__SelectStatement__Group_1_1__0"
    // InternalD3ql.g:1002:1: rule__SelectStatement__Group_1_1__0 : rule__SelectStatement__Group_1_1__0__Impl rule__SelectStatement__Group_1_1__1 ;
    public final void rule__SelectStatement__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:1006:1: ( rule__SelectStatement__Group_1_1__0__Impl rule__SelectStatement__Group_1_1__1 )
            // InternalD3ql.g:1007:2: rule__SelectStatement__Group_1_1__0__Impl rule__SelectStatement__Group_1_1__1
            {
            pushFollow(FOLLOW_6);
            rule__SelectStatement__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelectStatement__Group_1_1__1();

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
    // $ANTLR end "rule__SelectStatement__Group_1_1__0"


    // $ANTLR start "rule__SelectStatement__Group_1_1__0__Impl"
    // InternalD3ql.g:1014:1: rule__SelectStatement__Group_1_1__0__Impl : ( ( rule__SelectStatement__SelectionsAssignment_1_1_0 ) ) ;
    public final void rule__SelectStatement__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:1018:1: ( ( ( rule__SelectStatement__SelectionsAssignment_1_1_0 ) ) )
            // InternalD3ql.g:1019:1: ( ( rule__SelectStatement__SelectionsAssignment_1_1_0 ) )
            {
            // InternalD3ql.g:1019:1: ( ( rule__SelectStatement__SelectionsAssignment_1_1_0 ) )
            // InternalD3ql.g:1020:2: ( rule__SelectStatement__SelectionsAssignment_1_1_0 )
            {
             before(grammarAccess.getSelectStatementAccess().getSelectionsAssignment_1_1_0()); 
            // InternalD3ql.g:1021:2: ( rule__SelectStatement__SelectionsAssignment_1_1_0 )
            // InternalD3ql.g:1021:3: rule__SelectStatement__SelectionsAssignment_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__SelectStatement__SelectionsAssignment_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getSelectStatementAccess().getSelectionsAssignment_1_1_0()); 

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
    // $ANTLR end "rule__SelectStatement__Group_1_1__0__Impl"


    // $ANTLR start "rule__SelectStatement__Group_1_1__1"
    // InternalD3ql.g:1029:1: rule__SelectStatement__Group_1_1__1 : rule__SelectStatement__Group_1_1__1__Impl ;
    public final void rule__SelectStatement__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:1033:1: ( rule__SelectStatement__Group_1_1__1__Impl )
            // InternalD3ql.g:1034:2: rule__SelectStatement__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SelectStatement__Group_1_1__1__Impl();

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
    // $ANTLR end "rule__SelectStatement__Group_1_1__1"


    // $ANTLR start "rule__SelectStatement__Group_1_1__1__Impl"
    // InternalD3ql.g:1040:1: rule__SelectStatement__Group_1_1__1__Impl : ( ( rule__SelectStatement__Group_1_1_1__0 )* ) ;
    public final void rule__SelectStatement__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:1044:1: ( ( ( rule__SelectStatement__Group_1_1_1__0 )* ) )
            // InternalD3ql.g:1045:1: ( ( rule__SelectStatement__Group_1_1_1__0 )* )
            {
            // InternalD3ql.g:1045:1: ( ( rule__SelectStatement__Group_1_1_1__0 )* )
            // InternalD3ql.g:1046:2: ( rule__SelectStatement__Group_1_1_1__0 )*
            {
             before(grammarAccess.getSelectStatementAccess().getGroup_1_1_1()); 
            // InternalD3ql.g:1047:2: ( rule__SelectStatement__Group_1_1_1__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==21) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalD3ql.g:1047:3: rule__SelectStatement__Group_1_1_1__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__SelectStatement__Group_1_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getSelectStatementAccess().getGroup_1_1_1()); 

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
    // $ANTLR end "rule__SelectStatement__Group_1_1__1__Impl"


    // $ANTLR start "rule__SelectStatement__Group_1_1_1__0"
    // InternalD3ql.g:1056:1: rule__SelectStatement__Group_1_1_1__0 : rule__SelectStatement__Group_1_1_1__0__Impl rule__SelectStatement__Group_1_1_1__1 ;
    public final void rule__SelectStatement__Group_1_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:1060:1: ( rule__SelectStatement__Group_1_1_1__0__Impl rule__SelectStatement__Group_1_1_1__1 )
            // InternalD3ql.g:1061:2: rule__SelectStatement__Group_1_1_1__0__Impl rule__SelectStatement__Group_1_1_1__1
            {
            pushFollow(FOLLOW_8);
            rule__SelectStatement__Group_1_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelectStatement__Group_1_1_1__1();

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
    // $ANTLR end "rule__SelectStatement__Group_1_1_1__0"


    // $ANTLR start "rule__SelectStatement__Group_1_1_1__0__Impl"
    // InternalD3ql.g:1068:1: rule__SelectStatement__Group_1_1_1__0__Impl : ( ',' ) ;
    public final void rule__SelectStatement__Group_1_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:1072:1: ( ( ',' ) )
            // InternalD3ql.g:1073:1: ( ',' )
            {
            // InternalD3ql.g:1073:1: ( ',' )
            // InternalD3ql.g:1074:2: ','
            {
             before(grammarAccess.getSelectStatementAccess().getCommaKeyword_1_1_1_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getSelectStatementAccess().getCommaKeyword_1_1_1_0()); 

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
    // $ANTLR end "rule__SelectStatement__Group_1_1_1__0__Impl"


    // $ANTLR start "rule__SelectStatement__Group_1_1_1__1"
    // InternalD3ql.g:1083:1: rule__SelectStatement__Group_1_1_1__1 : rule__SelectStatement__Group_1_1_1__1__Impl ;
    public final void rule__SelectStatement__Group_1_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:1087:1: ( rule__SelectStatement__Group_1_1_1__1__Impl )
            // InternalD3ql.g:1088:2: rule__SelectStatement__Group_1_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SelectStatement__Group_1_1_1__1__Impl();

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
    // $ANTLR end "rule__SelectStatement__Group_1_1_1__1"


    // $ANTLR start "rule__SelectStatement__Group_1_1_1__1__Impl"
    // InternalD3ql.g:1094:1: rule__SelectStatement__Group_1_1_1__1__Impl : ( ( rule__SelectStatement__SelectionsAssignment_1_1_1_1 ) ) ;
    public final void rule__SelectStatement__Group_1_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:1098:1: ( ( ( rule__SelectStatement__SelectionsAssignment_1_1_1_1 ) ) )
            // InternalD3ql.g:1099:1: ( ( rule__SelectStatement__SelectionsAssignment_1_1_1_1 ) )
            {
            // InternalD3ql.g:1099:1: ( ( rule__SelectStatement__SelectionsAssignment_1_1_1_1 ) )
            // InternalD3ql.g:1100:2: ( rule__SelectStatement__SelectionsAssignment_1_1_1_1 )
            {
             before(grammarAccess.getSelectStatementAccess().getSelectionsAssignment_1_1_1_1()); 
            // InternalD3ql.g:1101:2: ( rule__SelectStatement__SelectionsAssignment_1_1_1_1 )
            // InternalD3ql.g:1101:3: rule__SelectStatement__SelectionsAssignment_1_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__SelectStatement__SelectionsAssignment_1_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getSelectStatementAccess().getSelectionsAssignment_1_1_1_1()); 

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
    // $ANTLR end "rule__SelectStatement__Group_1_1_1__1__Impl"


    // $ANTLR start "rule__SelectionItem__Group__0"
    // InternalD3ql.g:1110:1: rule__SelectionItem__Group__0 : rule__SelectionItem__Group__0__Impl rule__SelectionItem__Group__1 ;
    public final void rule__SelectionItem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:1114:1: ( rule__SelectionItem__Group__0__Impl rule__SelectionItem__Group__1 )
            // InternalD3ql.g:1115:2: rule__SelectionItem__Group__0__Impl rule__SelectionItem__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__SelectionItem__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelectionItem__Group__1();

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
    // $ANTLR end "rule__SelectionItem__Group__0"


    // $ANTLR start "rule__SelectionItem__Group__0__Impl"
    // InternalD3ql.g:1122:1: rule__SelectionItem__Group__0__Impl : ( ( rule__SelectionItem__ExpressionAssignment_0 ) ) ;
    public final void rule__SelectionItem__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:1126:1: ( ( ( rule__SelectionItem__ExpressionAssignment_0 ) ) )
            // InternalD3ql.g:1127:1: ( ( rule__SelectionItem__ExpressionAssignment_0 ) )
            {
            // InternalD3ql.g:1127:1: ( ( rule__SelectionItem__ExpressionAssignment_0 ) )
            // InternalD3ql.g:1128:2: ( rule__SelectionItem__ExpressionAssignment_0 )
            {
             before(grammarAccess.getSelectionItemAccess().getExpressionAssignment_0()); 
            // InternalD3ql.g:1129:2: ( rule__SelectionItem__ExpressionAssignment_0 )
            // InternalD3ql.g:1129:3: rule__SelectionItem__ExpressionAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__SelectionItem__ExpressionAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSelectionItemAccess().getExpressionAssignment_0()); 

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
    // $ANTLR end "rule__SelectionItem__Group__0__Impl"


    // $ANTLR start "rule__SelectionItem__Group__1"
    // InternalD3ql.g:1137:1: rule__SelectionItem__Group__1 : rule__SelectionItem__Group__1__Impl ;
    public final void rule__SelectionItem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:1141:1: ( rule__SelectionItem__Group__1__Impl )
            // InternalD3ql.g:1142:2: rule__SelectionItem__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SelectionItem__Group__1__Impl();

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
    // $ANTLR end "rule__SelectionItem__Group__1"


    // $ANTLR start "rule__SelectionItem__Group__1__Impl"
    // InternalD3ql.g:1148:1: rule__SelectionItem__Group__1__Impl : ( ( rule__SelectionItem__Group_1__0 )? ) ;
    public final void rule__SelectionItem__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:1152:1: ( ( ( rule__SelectionItem__Group_1__0 )? ) )
            // InternalD3ql.g:1153:1: ( ( rule__SelectionItem__Group_1__0 )? )
            {
            // InternalD3ql.g:1153:1: ( ( rule__SelectionItem__Group_1__0 )? )
            // InternalD3ql.g:1154:2: ( rule__SelectionItem__Group_1__0 )?
            {
             before(grammarAccess.getSelectionItemAccess().getGroup_1()); 
            // InternalD3ql.g:1155:2: ( rule__SelectionItem__Group_1__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==23) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalD3ql.g:1155:3: rule__SelectionItem__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SelectionItem__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSelectionItemAccess().getGroup_1()); 

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
    // $ANTLR end "rule__SelectionItem__Group__1__Impl"


    // $ANTLR start "rule__SelectionItem__Group_1__0"
    // InternalD3ql.g:1164:1: rule__SelectionItem__Group_1__0 : rule__SelectionItem__Group_1__0__Impl rule__SelectionItem__Group_1__1 ;
    public final void rule__SelectionItem__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:1168:1: ( rule__SelectionItem__Group_1__0__Impl rule__SelectionItem__Group_1__1 )
            // InternalD3ql.g:1169:2: rule__SelectionItem__Group_1__0__Impl rule__SelectionItem__Group_1__1
            {
            pushFollow(FOLLOW_5);
            rule__SelectionItem__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelectionItem__Group_1__1();

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
    // $ANTLR end "rule__SelectionItem__Group_1__0"


    // $ANTLR start "rule__SelectionItem__Group_1__0__Impl"
    // InternalD3ql.g:1176:1: rule__SelectionItem__Group_1__0__Impl : ( 'as' ) ;
    public final void rule__SelectionItem__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:1180:1: ( ( 'as' ) )
            // InternalD3ql.g:1181:1: ( 'as' )
            {
            // InternalD3ql.g:1181:1: ( 'as' )
            // InternalD3ql.g:1182:2: 'as'
            {
             before(grammarAccess.getSelectionItemAccess().getAsKeyword_1_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getSelectionItemAccess().getAsKeyword_1_0()); 

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
    // $ANTLR end "rule__SelectionItem__Group_1__0__Impl"


    // $ANTLR start "rule__SelectionItem__Group_1__1"
    // InternalD3ql.g:1191:1: rule__SelectionItem__Group_1__1 : rule__SelectionItem__Group_1__1__Impl ;
    public final void rule__SelectionItem__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:1195:1: ( rule__SelectionItem__Group_1__1__Impl )
            // InternalD3ql.g:1196:2: rule__SelectionItem__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SelectionItem__Group_1__1__Impl();

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
    // $ANTLR end "rule__SelectionItem__Group_1__1"


    // $ANTLR start "rule__SelectionItem__Group_1__1__Impl"
    // InternalD3ql.g:1202:1: rule__SelectionItem__Group_1__1__Impl : ( ( rule__SelectionItem__AliasAssignment_1_1 ) ) ;
    public final void rule__SelectionItem__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:1206:1: ( ( ( rule__SelectionItem__AliasAssignment_1_1 ) ) )
            // InternalD3ql.g:1207:1: ( ( rule__SelectionItem__AliasAssignment_1_1 ) )
            {
            // InternalD3ql.g:1207:1: ( ( rule__SelectionItem__AliasAssignment_1_1 ) )
            // InternalD3ql.g:1208:2: ( rule__SelectionItem__AliasAssignment_1_1 )
            {
             before(grammarAccess.getSelectionItemAccess().getAliasAssignment_1_1()); 
            // InternalD3ql.g:1209:2: ( rule__SelectionItem__AliasAssignment_1_1 )
            // InternalD3ql.g:1209:3: rule__SelectionItem__AliasAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__SelectionItem__AliasAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getSelectionItemAccess().getAliasAssignment_1_1()); 

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
    // $ANTLR end "rule__SelectionItem__Group_1__1__Impl"


    // $ANTLR start "rule__WhereStatement__Group__0"
    // InternalD3ql.g:1218:1: rule__WhereStatement__Group__0 : rule__WhereStatement__Group__0__Impl rule__WhereStatement__Group__1 ;
    public final void rule__WhereStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:1222:1: ( rule__WhereStatement__Group__0__Impl rule__WhereStatement__Group__1 )
            // InternalD3ql.g:1223:2: rule__WhereStatement__Group__0__Impl rule__WhereStatement__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__WhereStatement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WhereStatement__Group__1();

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
    // $ANTLR end "rule__WhereStatement__Group__0"


    // $ANTLR start "rule__WhereStatement__Group__0__Impl"
    // InternalD3ql.g:1230:1: rule__WhereStatement__Group__0__Impl : ( 'where' ) ;
    public final void rule__WhereStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:1234:1: ( ( 'where' ) )
            // InternalD3ql.g:1235:1: ( 'where' )
            {
            // InternalD3ql.g:1235:1: ( 'where' )
            // InternalD3ql.g:1236:2: 'where'
            {
             before(grammarAccess.getWhereStatementAccess().getWhereKeyword_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getWhereStatementAccess().getWhereKeyword_0()); 

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
    // $ANTLR end "rule__WhereStatement__Group__0__Impl"


    // $ANTLR start "rule__WhereStatement__Group__1"
    // InternalD3ql.g:1245:1: rule__WhereStatement__Group__1 : rule__WhereStatement__Group__1__Impl ;
    public final void rule__WhereStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:1249:1: ( rule__WhereStatement__Group__1__Impl )
            // InternalD3ql.g:1250:2: rule__WhereStatement__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WhereStatement__Group__1__Impl();

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
    // $ANTLR end "rule__WhereStatement__Group__1"


    // $ANTLR start "rule__WhereStatement__Group__1__Impl"
    // InternalD3ql.g:1256:1: rule__WhereStatement__Group__1__Impl : ( ( rule__WhereStatement__ExpressionsAssignment_1 ) ) ;
    public final void rule__WhereStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:1260:1: ( ( ( rule__WhereStatement__ExpressionsAssignment_1 ) ) )
            // InternalD3ql.g:1261:1: ( ( rule__WhereStatement__ExpressionsAssignment_1 ) )
            {
            // InternalD3ql.g:1261:1: ( ( rule__WhereStatement__ExpressionsAssignment_1 ) )
            // InternalD3ql.g:1262:2: ( rule__WhereStatement__ExpressionsAssignment_1 )
            {
             before(grammarAccess.getWhereStatementAccess().getExpressionsAssignment_1()); 
            // InternalD3ql.g:1263:2: ( rule__WhereStatement__ExpressionsAssignment_1 )
            // InternalD3ql.g:1263:3: rule__WhereStatement__ExpressionsAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__WhereStatement__ExpressionsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getWhereStatementAccess().getExpressionsAssignment_1()); 

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
    // $ANTLR end "rule__WhereStatement__Group__1__Impl"


    // $ANTLR start "rule__AggregateRoot__Group__0"
    // InternalD3ql.g:1272:1: rule__AggregateRoot__Group__0 : rule__AggregateRoot__Group__0__Impl rule__AggregateRoot__Group__1 ;
    public final void rule__AggregateRoot__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:1276:1: ( rule__AggregateRoot__Group__0__Impl rule__AggregateRoot__Group__1 )
            // InternalD3ql.g:1277:2: rule__AggregateRoot__Group__0__Impl rule__AggregateRoot__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__AggregateRoot__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AggregateRoot__Group__1();

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
    // $ANTLR end "rule__AggregateRoot__Group__0"


    // $ANTLR start "rule__AggregateRoot__Group__0__Impl"
    // InternalD3ql.g:1284:1: rule__AggregateRoot__Group__0__Impl : ( ( rule__AggregateRoot__NameAssignment_0 ) ) ;
    public final void rule__AggregateRoot__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:1288:1: ( ( ( rule__AggregateRoot__NameAssignment_0 ) ) )
            // InternalD3ql.g:1289:1: ( ( rule__AggregateRoot__NameAssignment_0 ) )
            {
            // InternalD3ql.g:1289:1: ( ( rule__AggregateRoot__NameAssignment_0 ) )
            // InternalD3ql.g:1290:2: ( rule__AggregateRoot__NameAssignment_0 )
            {
             before(grammarAccess.getAggregateRootAccess().getNameAssignment_0()); 
            // InternalD3ql.g:1291:2: ( rule__AggregateRoot__NameAssignment_0 )
            // InternalD3ql.g:1291:3: rule__AggregateRoot__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__AggregateRoot__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAggregateRootAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__AggregateRoot__Group__0__Impl"


    // $ANTLR start "rule__AggregateRoot__Group__1"
    // InternalD3ql.g:1299:1: rule__AggregateRoot__Group__1 : rule__AggregateRoot__Group__1__Impl ;
    public final void rule__AggregateRoot__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:1303:1: ( rule__AggregateRoot__Group__1__Impl )
            // InternalD3ql.g:1304:2: rule__AggregateRoot__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AggregateRoot__Group__1__Impl();

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
    // $ANTLR end "rule__AggregateRoot__Group__1"


    // $ANTLR start "rule__AggregateRoot__Group__1__Impl"
    // InternalD3ql.g:1310:1: rule__AggregateRoot__Group__1__Impl : ( ( rule__AggregateRoot__Group_1__0 )? ) ;
    public final void rule__AggregateRoot__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:1314:1: ( ( ( rule__AggregateRoot__Group_1__0 )? ) )
            // InternalD3ql.g:1315:1: ( ( rule__AggregateRoot__Group_1__0 )? )
            {
            // InternalD3ql.g:1315:1: ( ( rule__AggregateRoot__Group_1__0 )? )
            // InternalD3ql.g:1316:2: ( rule__AggregateRoot__Group_1__0 )?
            {
             before(grammarAccess.getAggregateRootAccess().getGroup_1()); 
            // InternalD3ql.g:1317:2: ( rule__AggregateRoot__Group_1__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==23) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalD3ql.g:1317:3: rule__AggregateRoot__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AggregateRoot__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAggregateRootAccess().getGroup_1()); 

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
    // $ANTLR end "rule__AggregateRoot__Group__1__Impl"


    // $ANTLR start "rule__AggregateRoot__Group_1__0"
    // InternalD3ql.g:1326:1: rule__AggregateRoot__Group_1__0 : rule__AggregateRoot__Group_1__0__Impl rule__AggregateRoot__Group_1__1 ;
    public final void rule__AggregateRoot__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:1330:1: ( rule__AggregateRoot__Group_1__0__Impl rule__AggregateRoot__Group_1__1 )
            // InternalD3ql.g:1331:2: rule__AggregateRoot__Group_1__0__Impl rule__AggregateRoot__Group_1__1
            {
            pushFollow(FOLLOW_5);
            rule__AggregateRoot__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AggregateRoot__Group_1__1();

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
    // $ANTLR end "rule__AggregateRoot__Group_1__0"


    // $ANTLR start "rule__AggregateRoot__Group_1__0__Impl"
    // InternalD3ql.g:1338:1: rule__AggregateRoot__Group_1__0__Impl : ( 'as' ) ;
    public final void rule__AggregateRoot__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:1342:1: ( ( 'as' ) )
            // InternalD3ql.g:1343:1: ( 'as' )
            {
            // InternalD3ql.g:1343:1: ( 'as' )
            // InternalD3ql.g:1344:2: 'as'
            {
             before(grammarAccess.getAggregateRootAccess().getAsKeyword_1_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getAggregateRootAccess().getAsKeyword_1_0()); 

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
    // $ANTLR end "rule__AggregateRoot__Group_1__0__Impl"


    // $ANTLR start "rule__AggregateRoot__Group_1__1"
    // InternalD3ql.g:1353:1: rule__AggregateRoot__Group_1__1 : rule__AggregateRoot__Group_1__1__Impl ;
    public final void rule__AggregateRoot__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:1357:1: ( rule__AggregateRoot__Group_1__1__Impl )
            // InternalD3ql.g:1358:2: rule__AggregateRoot__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AggregateRoot__Group_1__1__Impl();

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
    // $ANTLR end "rule__AggregateRoot__Group_1__1"


    // $ANTLR start "rule__AggregateRoot__Group_1__1__Impl"
    // InternalD3ql.g:1364:1: rule__AggregateRoot__Group_1__1__Impl : ( ( rule__AggregateRoot__AliasAssignment_1_1 ) ) ;
    public final void rule__AggregateRoot__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:1368:1: ( ( ( rule__AggregateRoot__AliasAssignment_1_1 ) ) )
            // InternalD3ql.g:1369:1: ( ( rule__AggregateRoot__AliasAssignment_1_1 ) )
            {
            // InternalD3ql.g:1369:1: ( ( rule__AggregateRoot__AliasAssignment_1_1 ) )
            // InternalD3ql.g:1370:2: ( rule__AggregateRoot__AliasAssignment_1_1 )
            {
             before(grammarAccess.getAggregateRootAccess().getAliasAssignment_1_1()); 
            // InternalD3ql.g:1371:2: ( rule__AggregateRoot__AliasAssignment_1_1 )
            // InternalD3ql.g:1371:3: rule__AggregateRoot__AliasAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__AggregateRoot__AliasAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAggregateRootAccess().getAliasAssignment_1_1()); 

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
    // $ANTLR end "rule__AggregateRoot__Group_1__1__Impl"


    // $ANTLR start "rule__Expression__Group__0"
    // InternalD3ql.g:1380:1: rule__Expression__Group__0 : rule__Expression__Group__0__Impl rule__Expression__Group__1 ;
    public final void rule__Expression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:1384:1: ( rule__Expression__Group__0__Impl rule__Expression__Group__1 )
            // InternalD3ql.g:1385:2: rule__Expression__Group__0__Impl rule__Expression__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Expression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression__Group__1();

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
    // $ANTLR end "rule__Expression__Group__0"


    // $ANTLR start "rule__Expression__Group__0__Impl"
    // InternalD3ql.g:1392:1: rule__Expression__Group__0__Impl : ( ruleOr ) ;
    public final void rule__Expression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:1396:1: ( ( ruleOr ) )
            // InternalD3ql.g:1397:1: ( ruleOr )
            {
            // InternalD3ql.g:1397:1: ( ruleOr )
            // InternalD3ql.g:1398:2: ruleOr
            {
             before(grammarAccess.getExpressionAccess().getOrParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleOr();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getOrParserRuleCall_0()); 

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
    // $ANTLR end "rule__Expression__Group__0__Impl"


    // $ANTLR start "rule__Expression__Group__1"
    // InternalD3ql.g:1407:1: rule__Expression__Group__1 : rule__Expression__Group__1__Impl ;
    public final void rule__Expression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:1411:1: ( rule__Expression__Group__1__Impl )
            // InternalD3ql.g:1412:2: rule__Expression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Group__1__Impl();

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
    // $ANTLR end "rule__Expression__Group__1"


    // $ANTLR start "rule__Expression__Group__1__Impl"
    // InternalD3ql.g:1418:1: rule__Expression__Group__1__Impl : ( ( rule__Expression__Group_1__0 )? ) ;
    public final void rule__Expression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:1422:1: ( ( ( rule__Expression__Group_1__0 )? ) )
            // InternalD3ql.g:1423:1: ( ( rule__Expression__Group_1__0 )? )
            {
            // InternalD3ql.g:1423:1: ( ( rule__Expression__Group_1__0 )? )
            // InternalD3ql.g:1424:2: ( rule__Expression__Group_1__0 )?
            {
             before(grammarAccess.getExpressionAccess().getGroup_1()); 
            // InternalD3ql.g:1425:2: ( rule__Expression__Group_1__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==23) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalD3ql.g:1425:3: rule__Expression__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Expression__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExpressionAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Expression__Group__1__Impl"


    // $ANTLR start "rule__Expression__Group_1__0"
    // InternalD3ql.g:1434:1: rule__Expression__Group_1__0 : rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1 ;
    public final void rule__Expression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:1438:1: ( rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1 )
            // InternalD3ql.g:1439:2: rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1
            {
            pushFollow(FOLLOW_9);
            rule__Expression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression__Group_1__1();

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
    // $ANTLR end "rule__Expression__Group_1__0"


    // $ANTLR start "rule__Expression__Group_1__0__Impl"
    // InternalD3ql.g:1446:1: rule__Expression__Group_1__0__Impl : ( () ) ;
    public final void rule__Expression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:1450:1: ( ( () ) )
            // InternalD3ql.g:1451:1: ( () )
            {
            // InternalD3ql.g:1451:1: ( () )
            // InternalD3ql.g:1452:2: ()
            {
             before(grammarAccess.getExpressionAccess().getExpressionLeftAction_1_0()); 
            // InternalD3ql.g:1453:2: ()
            // InternalD3ql.g:1453:3: 
            {
            }

             after(grammarAccess.getExpressionAccess().getExpressionLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_1__0__Impl"


    // $ANTLR start "rule__Expression__Group_1__1"
    // InternalD3ql.g:1461:1: rule__Expression__Group_1__1 : rule__Expression__Group_1__1__Impl rule__Expression__Group_1__2 ;
    public final void rule__Expression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:1465:1: ( rule__Expression__Group_1__1__Impl rule__Expression__Group_1__2 )
            // InternalD3ql.g:1466:2: rule__Expression__Group_1__1__Impl rule__Expression__Group_1__2
            {
            pushFollow(FOLLOW_5);
            rule__Expression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression__Group_1__2();

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
    // $ANTLR end "rule__Expression__Group_1__1"


    // $ANTLR start "rule__Expression__Group_1__1__Impl"
    // InternalD3ql.g:1473:1: rule__Expression__Group_1__1__Impl : ( 'as' ) ;
    public final void rule__Expression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:1477:1: ( ( 'as' ) )
            // InternalD3ql.g:1478:1: ( 'as' )
            {
            // InternalD3ql.g:1478:1: ( 'as' )
            // InternalD3ql.g:1479:2: 'as'
            {
             before(grammarAccess.getExpressionAccess().getAsKeyword_1_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getExpressionAccess().getAsKeyword_1_1()); 

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
    // $ANTLR end "rule__Expression__Group_1__1__Impl"


    // $ANTLR start "rule__Expression__Group_1__2"
    // InternalD3ql.g:1488:1: rule__Expression__Group_1__2 : rule__Expression__Group_1__2__Impl ;
    public final void rule__Expression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:1492:1: ( rule__Expression__Group_1__2__Impl )
            // InternalD3ql.g:1493:2: rule__Expression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Group_1__2__Impl();

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
    // $ANTLR end "rule__Expression__Group_1__2"


    // $ANTLR start "rule__Expression__Group_1__2__Impl"
    // InternalD3ql.g:1499:1: rule__Expression__Group_1__2__Impl : ( ( rule__Expression__AliasAssignment_1_2 ) ) ;
    public final void rule__Expression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:1503:1: ( ( ( rule__Expression__AliasAssignment_1_2 ) ) )
            // InternalD3ql.g:1504:1: ( ( rule__Expression__AliasAssignment_1_2 ) )
            {
            // InternalD3ql.g:1504:1: ( ( rule__Expression__AliasAssignment_1_2 ) )
            // InternalD3ql.g:1505:2: ( rule__Expression__AliasAssignment_1_2 )
            {
             before(grammarAccess.getExpressionAccess().getAliasAssignment_1_2()); 
            // InternalD3ql.g:1506:2: ( rule__Expression__AliasAssignment_1_2 )
            // InternalD3ql.g:1506:3: rule__Expression__AliasAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Expression__AliasAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getAliasAssignment_1_2()); 

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
    // $ANTLR end "rule__Expression__Group_1__2__Impl"


    // $ANTLR start "rule__Or__Group__0"
    // InternalD3ql.g:1515:1: rule__Or__Group__0 : rule__Or__Group__0__Impl rule__Or__Group__1 ;
    public final void rule__Or__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:1519:1: ( rule__Or__Group__0__Impl rule__Or__Group__1 )
            // InternalD3ql.g:1520:2: rule__Or__Group__0__Impl rule__Or__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__Or__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Or__Group__1();

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
    // $ANTLR end "rule__Or__Group__0"


    // $ANTLR start "rule__Or__Group__0__Impl"
    // InternalD3ql.g:1527:1: rule__Or__Group__0__Impl : ( ruleAnd ) ;
    public final void rule__Or__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:1531:1: ( ( ruleAnd ) )
            // InternalD3ql.g:1532:1: ( ruleAnd )
            {
            // InternalD3ql.g:1532:1: ( ruleAnd )
            // InternalD3ql.g:1533:2: ruleAnd
            {
             before(grammarAccess.getOrAccess().getAndParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleAnd();

            state._fsp--;

             after(grammarAccess.getOrAccess().getAndParserRuleCall_0()); 

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
    // $ANTLR end "rule__Or__Group__0__Impl"


    // $ANTLR start "rule__Or__Group__1"
    // InternalD3ql.g:1542:1: rule__Or__Group__1 : rule__Or__Group__1__Impl ;
    public final void rule__Or__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:1546:1: ( rule__Or__Group__1__Impl )
            // InternalD3ql.g:1547:2: rule__Or__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Or__Group__1__Impl();

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
    // $ANTLR end "rule__Or__Group__1"


    // $ANTLR start "rule__Or__Group__1__Impl"
    // InternalD3ql.g:1553:1: rule__Or__Group__1__Impl : ( ( rule__Or__Group_1__0 )* ) ;
    public final void rule__Or__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:1557:1: ( ( ( rule__Or__Group_1__0 )* ) )
            // InternalD3ql.g:1558:1: ( ( rule__Or__Group_1__0 )* )
            {
            // InternalD3ql.g:1558:1: ( ( rule__Or__Group_1__0 )* )
            // InternalD3ql.g:1559:2: ( rule__Or__Group_1__0 )*
            {
             before(grammarAccess.getOrAccess().getGroup_1()); 
            // InternalD3ql.g:1560:2: ( rule__Or__Group_1__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==25) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalD3ql.g:1560:3: rule__Or__Group_1__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Or__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getOrAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Or__Group__1__Impl"


    // $ANTLR start "rule__Or__Group_1__0"
    // InternalD3ql.g:1569:1: rule__Or__Group_1__0 : rule__Or__Group_1__0__Impl rule__Or__Group_1__1 ;
    public final void rule__Or__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:1573:1: ( rule__Or__Group_1__0__Impl rule__Or__Group_1__1 )
            // InternalD3ql.g:1574:2: rule__Or__Group_1__0__Impl rule__Or__Group_1__1
            {
            pushFollow(FOLLOW_11);
            rule__Or__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Or__Group_1__1();

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
    // $ANTLR end "rule__Or__Group_1__0"


    // $ANTLR start "rule__Or__Group_1__0__Impl"
    // InternalD3ql.g:1581:1: rule__Or__Group_1__0__Impl : ( () ) ;
    public final void rule__Or__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:1585:1: ( ( () ) )
            // InternalD3ql.g:1586:1: ( () )
            {
            // InternalD3ql.g:1586:1: ( () )
            // InternalD3ql.g:1587:2: ()
            {
             before(grammarAccess.getOrAccess().getOrLeftAction_1_0()); 
            // InternalD3ql.g:1588:2: ()
            // InternalD3ql.g:1588:3: 
            {
            }

             after(grammarAccess.getOrAccess().getOrLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group_1__0__Impl"


    // $ANTLR start "rule__Or__Group_1__1"
    // InternalD3ql.g:1596:1: rule__Or__Group_1__1 : rule__Or__Group_1__1__Impl rule__Or__Group_1__2 ;
    public final void rule__Or__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:1600:1: ( rule__Or__Group_1__1__Impl rule__Or__Group_1__2 )
            // InternalD3ql.g:1601:2: rule__Or__Group_1__1__Impl rule__Or__Group_1__2
            {
            pushFollow(FOLLOW_10);
            rule__Or__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Or__Group_1__2();

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
    // $ANTLR end "rule__Or__Group_1__1"


    // $ANTLR start "rule__Or__Group_1__1__Impl"
    // InternalD3ql.g:1608:1: rule__Or__Group_1__1__Impl : ( 'or' ) ;
    public final void rule__Or__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:1612:1: ( ( 'or' ) )
            // InternalD3ql.g:1613:1: ( 'or' )
            {
            // InternalD3ql.g:1613:1: ( 'or' )
            // InternalD3ql.g:1614:2: 'or'
            {
             before(grammarAccess.getOrAccess().getOrKeyword_1_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getOrAccess().getOrKeyword_1_1()); 

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
    // $ANTLR end "rule__Or__Group_1__1__Impl"


    // $ANTLR start "rule__Or__Group_1__2"
    // InternalD3ql.g:1623:1: rule__Or__Group_1__2 : rule__Or__Group_1__2__Impl ;
    public final void rule__Or__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:1627:1: ( rule__Or__Group_1__2__Impl )
            // InternalD3ql.g:1628:2: rule__Or__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Or__Group_1__2__Impl();

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
    // $ANTLR end "rule__Or__Group_1__2"


    // $ANTLR start "rule__Or__Group_1__2__Impl"
    // InternalD3ql.g:1634:1: rule__Or__Group_1__2__Impl : ( ( rule__Or__RightAssignment_1_2 ) ) ;
    public final void rule__Or__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:1638:1: ( ( ( rule__Or__RightAssignment_1_2 ) ) )
            // InternalD3ql.g:1639:1: ( ( rule__Or__RightAssignment_1_2 ) )
            {
            // InternalD3ql.g:1639:1: ( ( rule__Or__RightAssignment_1_2 ) )
            // InternalD3ql.g:1640:2: ( rule__Or__RightAssignment_1_2 )
            {
             before(grammarAccess.getOrAccess().getRightAssignment_1_2()); 
            // InternalD3ql.g:1641:2: ( rule__Or__RightAssignment_1_2 )
            // InternalD3ql.g:1641:3: rule__Or__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Or__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getOrAccess().getRightAssignment_1_2()); 

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
    // $ANTLR end "rule__Or__Group_1__2__Impl"


    // $ANTLR start "rule__And__Group__0"
    // InternalD3ql.g:1650:1: rule__And__Group__0 : rule__And__Group__0__Impl rule__And__Group__1 ;
    public final void rule__And__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:1654:1: ( rule__And__Group__0__Impl rule__And__Group__1 )
            // InternalD3ql.g:1655:2: rule__And__Group__0__Impl rule__And__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__And__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__And__Group__1();

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
    // $ANTLR end "rule__And__Group__0"


    // $ANTLR start "rule__And__Group__0__Impl"
    // InternalD3ql.g:1662:1: rule__And__Group__0__Impl : ( ruleEquality ) ;
    public final void rule__And__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:1666:1: ( ( ruleEquality ) )
            // InternalD3ql.g:1667:1: ( ruleEquality )
            {
            // InternalD3ql.g:1667:1: ( ruleEquality )
            // InternalD3ql.g:1668:2: ruleEquality
            {
             before(grammarAccess.getAndAccess().getEqualityParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleEquality();

            state._fsp--;

             after(grammarAccess.getAndAccess().getEqualityParserRuleCall_0()); 

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
    // $ANTLR end "rule__And__Group__0__Impl"


    // $ANTLR start "rule__And__Group__1"
    // InternalD3ql.g:1677:1: rule__And__Group__1 : rule__And__Group__1__Impl ;
    public final void rule__And__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:1681:1: ( rule__And__Group__1__Impl )
            // InternalD3ql.g:1682:2: rule__And__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__And__Group__1__Impl();

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
    // $ANTLR end "rule__And__Group__1"


    // $ANTLR start "rule__And__Group__1__Impl"
    // InternalD3ql.g:1688:1: rule__And__Group__1__Impl : ( ( rule__And__Group_1__0 )* ) ;
    public final void rule__And__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:1692:1: ( ( ( rule__And__Group_1__0 )* ) )
            // InternalD3ql.g:1693:1: ( ( rule__And__Group_1__0 )* )
            {
            // InternalD3ql.g:1693:1: ( ( rule__And__Group_1__0 )* )
            // InternalD3ql.g:1694:2: ( rule__And__Group_1__0 )*
            {
             before(grammarAccess.getAndAccess().getGroup_1()); 
            // InternalD3ql.g:1695:2: ( rule__And__Group_1__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==26) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalD3ql.g:1695:3: rule__And__Group_1__0
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__And__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getAndAccess().getGroup_1()); 

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
    // $ANTLR end "rule__And__Group__1__Impl"


    // $ANTLR start "rule__And__Group_1__0"
    // InternalD3ql.g:1704:1: rule__And__Group_1__0 : rule__And__Group_1__0__Impl rule__And__Group_1__1 ;
    public final void rule__And__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:1708:1: ( rule__And__Group_1__0__Impl rule__And__Group_1__1 )
            // InternalD3ql.g:1709:2: rule__And__Group_1__0__Impl rule__And__Group_1__1
            {
            pushFollow(FOLLOW_13);
            rule__And__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__And__Group_1__1();

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
    // $ANTLR end "rule__And__Group_1__0"


    // $ANTLR start "rule__And__Group_1__0__Impl"
    // InternalD3ql.g:1716:1: rule__And__Group_1__0__Impl : ( () ) ;
    public final void rule__And__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:1720:1: ( ( () ) )
            // InternalD3ql.g:1721:1: ( () )
            {
            // InternalD3ql.g:1721:1: ( () )
            // InternalD3ql.g:1722:2: ()
            {
             before(grammarAccess.getAndAccess().getAndLeftAction_1_0()); 
            // InternalD3ql.g:1723:2: ()
            // InternalD3ql.g:1723:3: 
            {
            }

             after(grammarAccess.getAndAccess().getAndLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group_1__0__Impl"


    // $ANTLR start "rule__And__Group_1__1"
    // InternalD3ql.g:1731:1: rule__And__Group_1__1 : rule__And__Group_1__1__Impl rule__And__Group_1__2 ;
    public final void rule__And__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:1735:1: ( rule__And__Group_1__1__Impl rule__And__Group_1__2 )
            // InternalD3ql.g:1736:2: rule__And__Group_1__1__Impl rule__And__Group_1__2
            {
            pushFollow(FOLLOW_10);
            rule__And__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__And__Group_1__2();

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
    // $ANTLR end "rule__And__Group_1__1"


    // $ANTLR start "rule__And__Group_1__1__Impl"
    // InternalD3ql.g:1743:1: rule__And__Group_1__1__Impl : ( 'and' ) ;
    public final void rule__And__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:1747:1: ( ( 'and' ) )
            // InternalD3ql.g:1748:1: ( 'and' )
            {
            // InternalD3ql.g:1748:1: ( 'and' )
            // InternalD3ql.g:1749:2: 'and'
            {
             before(grammarAccess.getAndAccess().getAndKeyword_1_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getAndAccess().getAndKeyword_1_1()); 

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
    // $ANTLR end "rule__And__Group_1__1__Impl"


    // $ANTLR start "rule__And__Group_1__2"
    // InternalD3ql.g:1758:1: rule__And__Group_1__2 : rule__And__Group_1__2__Impl ;
    public final void rule__And__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:1762:1: ( rule__And__Group_1__2__Impl )
            // InternalD3ql.g:1763:2: rule__And__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__And__Group_1__2__Impl();

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
    // $ANTLR end "rule__And__Group_1__2"


    // $ANTLR start "rule__And__Group_1__2__Impl"
    // InternalD3ql.g:1769:1: rule__And__Group_1__2__Impl : ( ( rule__And__RightAssignment_1_2 ) ) ;
    public final void rule__And__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:1773:1: ( ( ( rule__And__RightAssignment_1_2 ) ) )
            // InternalD3ql.g:1774:1: ( ( rule__And__RightAssignment_1_2 ) )
            {
            // InternalD3ql.g:1774:1: ( ( rule__And__RightAssignment_1_2 ) )
            // InternalD3ql.g:1775:2: ( rule__And__RightAssignment_1_2 )
            {
             before(grammarAccess.getAndAccess().getRightAssignment_1_2()); 
            // InternalD3ql.g:1776:2: ( rule__And__RightAssignment_1_2 )
            // InternalD3ql.g:1776:3: rule__And__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__And__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getAndAccess().getRightAssignment_1_2()); 

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
    // $ANTLR end "rule__And__Group_1__2__Impl"


    // $ANTLR start "rule__Equality__Group__0"
    // InternalD3ql.g:1785:1: rule__Equality__Group__0 : rule__Equality__Group__0__Impl rule__Equality__Group__1 ;
    public final void rule__Equality__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:1789:1: ( rule__Equality__Group__0__Impl rule__Equality__Group__1 )
            // InternalD3ql.g:1790:2: rule__Equality__Group__0__Impl rule__Equality__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__Equality__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Equality__Group__1();

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
    // $ANTLR end "rule__Equality__Group__0"


    // $ANTLR start "rule__Equality__Group__0__Impl"
    // InternalD3ql.g:1797:1: rule__Equality__Group__0__Impl : ( ruleComparison ) ;
    public final void rule__Equality__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:1801:1: ( ( ruleComparison ) )
            // InternalD3ql.g:1802:1: ( ruleComparison )
            {
            // InternalD3ql.g:1802:1: ( ruleComparison )
            // InternalD3ql.g:1803:2: ruleComparison
            {
             before(grammarAccess.getEqualityAccess().getComparisonParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleComparison();

            state._fsp--;

             after(grammarAccess.getEqualityAccess().getComparisonParserRuleCall_0()); 

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
    // $ANTLR end "rule__Equality__Group__0__Impl"


    // $ANTLR start "rule__Equality__Group__1"
    // InternalD3ql.g:1812:1: rule__Equality__Group__1 : rule__Equality__Group__1__Impl ;
    public final void rule__Equality__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:1816:1: ( rule__Equality__Group__1__Impl )
            // InternalD3ql.g:1817:2: rule__Equality__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Equality__Group__1__Impl();

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
    // $ANTLR end "rule__Equality__Group__1"


    // $ANTLR start "rule__Equality__Group__1__Impl"
    // InternalD3ql.g:1823:1: rule__Equality__Group__1__Impl : ( ( rule__Equality__Group_1__0 )* ) ;
    public final void rule__Equality__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:1827:1: ( ( ( rule__Equality__Group_1__0 )* ) )
            // InternalD3ql.g:1828:1: ( ( rule__Equality__Group_1__0 )* )
            {
            // InternalD3ql.g:1828:1: ( ( rule__Equality__Group_1__0 )* )
            // InternalD3ql.g:1829:2: ( rule__Equality__Group_1__0 )*
            {
             before(grammarAccess.getEqualityAccess().getGroup_1()); 
            // InternalD3ql.g:1830:2: ( rule__Equality__Group_1__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=11 && LA18_0<=12)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalD3ql.g:1830:3: rule__Equality__Group_1__0
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__Equality__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getEqualityAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Equality__Group__1__Impl"


    // $ANTLR start "rule__Equality__Group_1__0"
    // InternalD3ql.g:1839:1: rule__Equality__Group_1__0 : rule__Equality__Group_1__0__Impl rule__Equality__Group_1__1 ;
    public final void rule__Equality__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:1843:1: ( rule__Equality__Group_1__0__Impl rule__Equality__Group_1__1 )
            // InternalD3ql.g:1844:2: rule__Equality__Group_1__0__Impl rule__Equality__Group_1__1
            {
            pushFollow(FOLLOW_15);
            rule__Equality__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Equality__Group_1__1();

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
    // $ANTLR end "rule__Equality__Group_1__0"


    // $ANTLR start "rule__Equality__Group_1__0__Impl"
    // InternalD3ql.g:1851:1: rule__Equality__Group_1__0__Impl : ( () ) ;
    public final void rule__Equality__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:1855:1: ( ( () ) )
            // InternalD3ql.g:1856:1: ( () )
            {
            // InternalD3ql.g:1856:1: ( () )
            // InternalD3ql.g:1857:2: ()
            {
             before(grammarAccess.getEqualityAccess().getEqualityLeftAction_1_0()); 
            // InternalD3ql.g:1858:2: ()
            // InternalD3ql.g:1858:3: 
            {
            }

             after(grammarAccess.getEqualityAccess().getEqualityLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__Group_1__0__Impl"


    // $ANTLR start "rule__Equality__Group_1__1"
    // InternalD3ql.g:1866:1: rule__Equality__Group_1__1 : rule__Equality__Group_1__1__Impl rule__Equality__Group_1__2 ;
    public final void rule__Equality__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:1870:1: ( rule__Equality__Group_1__1__Impl rule__Equality__Group_1__2 )
            // InternalD3ql.g:1871:2: rule__Equality__Group_1__1__Impl rule__Equality__Group_1__2
            {
            pushFollow(FOLLOW_10);
            rule__Equality__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Equality__Group_1__2();

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
    // $ANTLR end "rule__Equality__Group_1__1"


    // $ANTLR start "rule__Equality__Group_1__1__Impl"
    // InternalD3ql.g:1878:1: rule__Equality__Group_1__1__Impl : ( ( rule__Equality__OpAssignment_1_1 ) ) ;
    public final void rule__Equality__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:1882:1: ( ( ( rule__Equality__OpAssignment_1_1 ) ) )
            // InternalD3ql.g:1883:1: ( ( rule__Equality__OpAssignment_1_1 ) )
            {
            // InternalD3ql.g:1883:1: ( ( rule__Equality__OpAssignment_1_1 ) )
            // InternalD3ql.g:1884:2: ( rule__Equality__OpAssignment_1_1 )
            {
             before(grammarAccess.getEqualityAccess().getOpAssignment_1_1()); 
            // InternalD3ql.g:1885:2: ( rule__Equality__OpAssignment_1_1 )
            // InternalD3ql.g:1885:3: rule__Equality__OpAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Equality__OpAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getEqualityAccess().getOpAssignment_1_1()); 

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
    // $ANTLR end "rule__Equality__Group_1__1__Impl"


    // $ANTLR start "rule__Equality__Group_1__2"
    // InternalD3ql.g:1893:1: rule__Equality__Group_1__2 : rule__Equality__Group_1__2__Impl ;
    public final void rule__Equality__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:1897:1: ( rule__Equality__Group_1__2__Impl )
            // InternalD3ql.g:1898:2: rule__Equality__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Equality__Group_1__2__Impl();

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
    // $ANTLR end "rule__Equality__Group_1__2"


    // $ANTLR start "rule__Equality__Group_1__2__Impl"
    // InternalD3ql.g:1904:1: rule__Equality__Group_1__2__Impl : ( ( rule__Equality__RightAssignment_1_2 ) ) ;
    public final void rule__Equality__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:1908:1: ( ( ( rule__Equality__RightAssignment_1_2 ) ) )
            // InternalD3ql.g:1909:1: ( ( rule__Equality__RightAssignment_1_2 ) )
            {
            // InternalD3ql.g:1909:1: ( ( rule__Equality__RightAssignment_1_2 ) )
            // InternalD3ql.g:1910:2: ( rule__Equality__RightAssignment_1_2 )
            {
             before(grammarAccess.getEqualityAccess().getRightAssignment_1_2()); 
            // InternalD3ql.g:1911:2: ( rule__Equality__RightAssignment_1_2 )
            // InternalD3ql.g:1911:3: rule__Equality__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Equality__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getEqualityAccess().getRightAssignment_1_2()); 

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
    // $ANTLR end "rule__Equality__Group_1__2__Impl"


    // $ANTLR start "rule__Comparison__Group__0"
    // InternalD3ql.g:1920:1: rule__Comparison__Group__0 : rule__Comparison__Group__0__Impl rule__Comparison__Group__1 ;
    public final void rule__Comparison__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:1924:1: ( rule__Comparison__Group__0__Impl rule__Comparison__Group__1 )
            // InternalD3ql.g:1925:2: rule__Comparison__Group__0__Impl rule__Comparison__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__Comparison__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Comparison__Group__1();

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
    // $ANTLR end "rule__Comparison__Group__0"


    // $ANTLR start "rule__Comparison__Group__0__Impl"
    // InternalD3ql.g:1932:1: rule__Comparison__Group__0__Impl : ( rulePrimary ) ;
    public final void rule__Comparison__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:1936:1: ( ( rulePrimary ) )
            // InternalD3ql.g:1937:1: ( rulePrimary )
            {
            // InternalD3ql.g:1937:1: ( rulePrimary )
            // InternalD3ql.g:1938:2: rulePrimary
            {
             before(grammarAccess.getComparisonAccess().getPrimaryParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getComparisonAccess().getPrimaryParserRuleCall_0()); 

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
    // $ANTLR end "rule__Comparison__Group__0__Impl"


    // $ANTLR start "rule__Comparison__Group__1"
    // InternalD3ql.g:1947:1: rule__Comparison__Group__1 : rule__Comparison__Group__1__Impl ;
    public final void rule__Comparison__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:1951:1: ( rule__Comparison__Group__1__Impl )
            // InternalD3ql.g:1952:2: rule__Comparison__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__Group__1__Impl();

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
    // $ANTLR end "rule__Comparison__Group__1"


    // $ANTLR start "rule__Comparison__Group__1__Impl"
    // InternalD3ql.g:1958:1: rule__Comparison__Group__1__Impl : ( ( rule__Comparison__Alternatives_1 )* ) ;
    public final void rule__Comparison__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:1962:1: ( ( ( rule__Comparison__Alternatives_1 )* ) )
            // InternalD3ql.g:1963:1: ( ( rule__Comparison__Alternatives_1 )* )
            {
            // InternalD3ql.g:1963:1: ( ( rule__Comparison__Alternatives_1 )* )
            // InternalD3ql.g:1964:2: ( rule__Comparison__Alternatives_1 )*
            {
             before(grammarAccess.getComparisonAccess().getAlternatives_1()); 
            // InternalD3ql.g:1965:2: ( rule__Comparison__Alternatives_1 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=13 && LA19_0<=17)||(LA19_0>=34 && LA19_0<=35)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalD3ql.g:1965:3: rule__Comparison__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__Comparison__Alternatives_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getComparisonAccess().getAlternatives_1()); 

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
    // $ANTLR end "rule__Comparison__Group__1__Impl"


    // $ANTLR start "rule__Comparison__Group_1_0__0"
    // InternalD3ql.g:1974:1: rule__Comparison__Group_1_0__0 : rule__Comparison__Group_1_0__0__Impl rule__Comparison__Group_1_0__1 ;
    public final void rule__Comparison__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:1978:1: ( rule__Comparison__Group_1_0__0__Impl rule__Comparison__Group_1_0__1 )
            // InternalD3ql.g:1979:2: rule__Comparison__Group_1_0__0__Impl rule__Comparison__Group_1_0__1
            {
            pushFollow(FOLLOW_19);
            rule__Comparison__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Comparison__Group_1_0__1();

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
    // $ANTLR end "rule__Comparison__Group_1_0__0"


    // $ANTLR start "rule__Comparison__Group_1_0__0__Impl"
    // InternalD3ql.g:1986:1: rule__Comparison__Group_1_0__0__Impl : ( () ) ;
    public final void rule__Comparison__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:1990:1: ( ( () ) )
            // InternalD3ql.g:1991:1: ( () )
            {
            // InternalD3ql.g:1991:1: ( () )
            // InternalD3ql.g:1992:2: ()
            {
             before(grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0_0()); 
            // InternalD3ql.g:1993:2: ()
            // InternalD3ql.g:1993:3: 
            {
            }

             after(grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1_0__0__Impl"


    // $ANTLR start "rule__Comparison__Group_1_0__1"
    // InternalD3ql.g:2001:1: rule__Comparison__Group_1_0__1 : rule__Comparison__Group_1_0__1__Impl rule__Comparison__Group_1_0__2 ;
    public final void rule__Comparison__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:2005:1: ( rule__Comparison__Group_1_0__1__Impl rule__Comparison__Group_1_0__2 )
            // InternalD3ql.g:2006:2: rule__Comparison__Group_1_0__1__Impl rule__Comparison__Group_1_0__2
            {
            pushFollow(FOLLOW_10);
            rule__Comparison__Group_1_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Comparison__Group_1_0__2();

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
    // $ANTLR end "rule__Comparison__Group_1_0__1"


    // $ANTLR start "rule__Comparison__Group_1_0__1__Impl"
    // InternalD3ql.g:2013:1: rule__Comparison__Group_1_0__1__Impl : ( ( rule__Comparison__OpAssignment_1_0_1 ) ) ;
    public final void rule__Comparison__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:2017:1: ( ( ( rule__Comparison__OpAssignment_1_0_1 ) ) )
            // InternalD3ql.g:2018:1: ( ( rule__Comparison__OpAssignment_1_0_1 ) )
            {
            // InternalD3ql.g:2018:1: ( ( rule__Comparison__OpAssignment_1_0_1 ) )
            // InternalD3ql.g:2019:2: ( rule__Comparison__OpAssignment_1_0_1 )
            {
             before(grammarAccess.getComparisonAccess().getOpAssignment_1_0_1()); 
            // InternalD3ql.g:2020:2: ( rule__Comparison__OpAssignment_1_0_1 )
            // InternalD3ql.g:2020:3: rule__Comparison__OpAssignment_1_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__OpAssignment_1_0_1();

            state._fsp--;


            }

             after(grammarAccess.getComparisonAccess().getOpAssignment_1_0_1()); 

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
    // $ANTLR end "rule__Comparison__Group_1_0__1__Impl"


    // $ANTLR start "rule__Comparison__Group_1_0__2"
    // InternalD3ql.g:2028:1: rule__Comparison__Group_1_0__2 : rule__Comparison__Group_1_0__2__Impl ;
    public final void rule__Comparison__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:2032:1: ( rule__Comparison__Group_1_0__2__Impl )
            // InternalD3ql.g:2033:2: rule__Comparison__Group_1_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__Group_1_0__2__Impl();

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
    // $ANTLR end "rule__Comparison__Group_1_0__2"


    // $ANTLR start "rule__Comparison__Group_1_0__2__Impl"
    // InternalD3ql.g:2039:1: rule__Comparison__Group_1_0__2__Impl : ( ( rule__Comparison__RightAssignment_1_0_2 ) ) ;
    public final void rule__Comparison__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:2043:1: ( ( ( rule__Comparison__RightAssignment_1_0_2 ) ) )
            // InternalD3ql.g:2044:1: ( ( rule__Comparison__RightAssignment_1_0_2 ) )
            {
            // InternalD3ql.g:2044:1: ( ( rule__Comparison__RightAssignment_1_0_2 ) )
            // InternalD3ql.g:2045:2: ( rule__Comparison__RightAssignment_1_0_2 )
            {
             before(grammarAccess.getComparisonAccess().getRightAssignment_1_0_2()); 
            // InternalD3ql.g:2046:2: ( rule__Comparison__RightAssignment_1_0_2 )
            // InternalD3ql.g:2046:3: rule__Comparison__RightAssignment_1_0_2
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__RightAssignment_1_0_2();

            state._fsp--;


            }

             after(grammarAccess.getComparisonAccess().getRightAssignment_1_0_2()); 

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
    // $ANTLR end "rule__Comparison__Group_1_0__2__Impl"


    // $ANTLR start "rule__Comparison__Group_1_1__0"
    // InternalD3ql.g:2055:1: rule__Comparison__Group_1_1__0 : rule__Comparison__Group_1_1__0__Impl rule__Comparison__Group_1_1__1 ;
    public final void rule__Comparison__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:2059:1: ( rule__Comparison__Group_1_1__0__Impl rule__Comparison__Group_1_1__1 )
            // InternalD3ql.g:2060:2: rule__Comparison__Group_1_1__0__Impl rule__Comparison__Group_1_1__1
            {
            pushFollow(FOLLOW_20);
            rule__Comparison__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Comparison__Group_1_1__1();

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
    // $ANTLR end "rule__Comparison__Group_1_1__0"


    // $ANTLR start "rule__Comparison__Group_1_1__0__Impl"
    // InternalD3ql.g:2067:1: rule__Comparison__Group_1_1__0__Impl : ( () ) ;
    public final void rule__Comparison__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:2071:1: ( ( () ) )
            // InternalD3ql.g:2072:1: ( () )
            {
            // InternalD3ql.g:2072:1: ( () )
            // InternalD3ql.g:2073:2: ()
            {
             before(grammarAccess.getComparisonAccess().getComparisonLeftAction_1_1_0()); 
            // InternalD3ql.g:2074:2: ()
            // InternalD3ql.g:2074:3: 
            {
            }

             after(grammarAccess.getComparisonAccess().getComparisonLeftAction_1_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1_1__0__Impl"


    // $ANTLR start "rule__Comparison__Group_1_1__1"
    // InternalD3ql.g:2082:1: rule__Comparison__Group_1_1__1 : rule__Comparison__Group_1_1__1__Impl rule__Comparison__Group_1_1__2 ;
    public final void rule__Comparison__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:2086:1: ( rule__Comparison__Group_1_1__1__Impl rule__Comparison__Group_1_1__2 )
            // InternalD3ql.g:2087:2: rule__Comparison__Group_1_1__1__Impl rule__Comparison__Group_1_1__2
            {
            pushFollow(FOLLOW_10);
            rule__Comparison__Group_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Comparison__Group_1_1__2();

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
    // $ANTLR end "rule__Comparison__Group_1_1__1"


    // $ANTLR start "rule__Comparison__Group_1_1__1__Impl"
    // InternalD3ql.g:2094:1: rule__Comparison__Group_1_1__1__Impl : ( ( rule__Comparison__OpAssignment_1_1_1 ) ) ;
    public final void rule__Comparison__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:2098:1: ( ( ( rule__Comparison__OpAssignment_1_1_1 ) ) )
            // InternalD3ql.g:2099:1: ( ( rule__Comparison__OpAssignment_1_1_1 ) )
            {
            // InternalD3ql.g:2099:1: ( ( rule__Comparison__OpAssignment_1_1_1 ) )
            // InternalD3ql.g:2100:2: ( rule__Comparison__OpAssignment_1_1_1 )
            {
             before(grammarAccess.getComparisonAccess().getOpAssignment_1_1_1()); 
            // InternalD3ql.g:2101:2: ( rule__Comparison__OpAssignment_1_1_1 )
            // InternalD3ql.g:2101:3: rule__Comparison__OpAssignment_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__OpAssignment_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getComparisonAccess().getOpAssignment_1_1_1()); 

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
    // $ANTLR end "rule__Comparison__Group_1_1__1__Impl"


    // $ANTLR start "rule__Comparison__Group_1_1__2"
    // InternalD3ql.g:2109:1: rule__Comparison__Group_1_1__2 : rule__Comparison__Group_1_1__2__Impl rule__Comparison__Group_1_1__3 ;
    public final void rule__Comparison__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:2113:1: ( rule__Comparison__Group_1_1__2__Impl rule__Comparison__Group_1_1__3 )
            // InternalD3ql.g:2114:2: rule__Comparison__Group_1_1__2__Impl rule__Comparison__Group_1_1__3
            {
            pushFollow(FOLLOW_13);
            rule__Comparison__Group_1_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Comparison__Group_1_1__3();

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
    // $ANTLR end "rule__Comparison__Group_1_1__2"


    // $ANTLR start "rule__Comparison__Group_1_1__2__Impl"
    // InternalD3ql.g:2121:1: rule__Comparison__Group_1_1__2__Impl : ( ( rule__Comparison__XAssignment_1_1_2 ) ) ;
    public final void rule__Comparison__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:2125:1: ( ( ( rule__Comparison__XAssignment_1_1_2 ) ) )
            // InternalD3ql.g:2126:1: ( ( rule__Comparison__XAssignment_1_1_2 ) )
            {
            // InternalD3ql.g:2126:1: ( ( rule__Comparison__XAssignment_1_1_2 ) )
            // InternalD3ql.g:2127:2: ( rule__Comparison__XAssignment_1_1_2 )
            {
             before(grammarAccess.getComparisonAccess().getXAssignment_1_1_2()); 
            // InternalD3ql.g:2128:2: ( rule__Comparison__XAssignment_1_1_2 )
            // InternalD3ql.g:2128:3: rule__Comparison__XAssignment_1_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__XAssignment_1_1_2();

            state._fsp--;


            }

             after(grammarAccess.getComparisonAccess().getXAssignment_1_1_2()); 

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
    // $ANTLR end "rule__Comparison__Group_1_1__2__Impl"


    // $ANTLR start "rule__Comparison__Group_1_1__3"
    // InternalD3ql.g:2136:1: rule__Comparison__Group_1_1__3 : rule__Comparison__Group_1_1__3__Impl rule__Comparison__Group_1_1__4 ;
    public final void rule__Comparison__Group_1_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:2140:1: ( rule__Comparison__Group_1_1__3__Impl rule__Comparison__Group_1_1__4 )
            // InternalD3ql.g:2141:2: rule__Comparison__Group_1_1__3__Impl rule__Comparison__Group_1_1__4
            {
            pushFollow(FOLLOW_10);
            rule__Comparison__Group_1_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Comparison__Group_1_1__4();

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
    // $ANTLR end "rule__Comparison__Group_1_1__3"


    // $ANTLR start "rule__Comparison__Group_1_1__3__Impl"
    // InternalD3ql.g:2148:1: rule__Comparison__Group_1_1__3__Impl : ( 'and' ) ;
    public final void rule__Comparison__Group_1_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:2152:1: ( ( 'and' ) )
            // InternalD3ql.g:2153:1: ( 'and' )
            {
            // InternalD3ql.g:2153:1: ( 'and' )
            // InternalD3ql.g:2154:2: 'and'
            {
             before(grammarAccess.getComparisonAccess().getAndKeyword_1_1_3()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getComparisonAccess().getAndKeyword_1_1_3()); 

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
    // $ANTLR end "rule__Comparison__Group_1_1__3__Impl"


    // $ANTLR start "rule__Comparison__Group_1_1__4"
    // InternalD3ql.g:2163:1: rule__Comparison__Group_1_1__4 : rule__Comparison__Group_1_1__4__Impl ;
    public final void rule__Comparison__Group_1_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:2167:1: ( rule__Comparison__Group_1_1__4__Impl )
            // InternalD3ql.g:2168:2: rule__Comparison__Group_1_1__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__Group_1_1__4__Impl();

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
    // $ANTLR end "rule__Comparison__Group_1_1__4"


    // $ANTLR start "rule__Comparison__Group_1_1__4__Impl"
    // InternalD3ql.g:2174:1: rule__Comparison__Group_1_1__4__Impl : ( ( rule__Comparison__YAssignment_1_1_4 ) ) ;
    public final void rule__Comparison__Group_1_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:2178:1: ( ( ( rule__Comparison__YAssignment_1_1_4 ) ) )
            // InternalD3ql.g:2179:1: ( ( rule__Comparison__YAssignment_1_1_4 ) )
            {
            // InternalD3ql.g:2179:1: ( ( rule__Comparison__YAssignment_1_1_4 ) )
            // InternalD3ql.g:2180:2: ( rule__Comparison__YAssignment_1_1_4 )
            {
             before(grammarAccess.getComparisonAccess().getYAssignment_1_1_4()); 
            // InternalD3ql.g:2181:2: ( rule__Comparison__YAssignment_1_1_4 )
            // InternalD3ql.g:2181:3: rule__Comparison__YAssignment_1_1_4
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__YAssignment_1_1_4();

            state._fsp--;


            }

             after(grammarAccess.getComparisonAccess().getYAssignment_1_1_4()); 

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
    // $ANTLR end "rule__Comparison__Group_1_1__4__Impl"


    // $ANTLR start "rule__Comparison__Group_1_2__0"
    // InternalD3ql.g:2190:1: rule__Comparison__Group_1_2__0 : rule__Comparison__Group_1_2__0__Impl rule__Comparison__Group_1_2__1 ;
    public final void rule__Comparison__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:2194:1: ( rule__Comparison__Group_1_2__0__Impl rule__Comparison__Group_1_2__1 )
            // InternalD3ql.g:2195:2: rule__Comparison__Group_1_2__0__Impl rule__Comparison__Group_1_2__1
            {
            pushFollow(FOLLOW_17);
            rule__Comparison__Group_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Comparison__Group_1_2__1();

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
    // $ANTLR end "rule__Comparison__Group_1_2__0"


    // $ANTLR start "rule__Comparison__Group_1_2__0__Impl"
    // InternalD3ql.g:2202:1: rule__Comparison__Group_1_2__0__Impl : ( () ) ;
    public final void rule__Comparison__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:2206:1: ( ( () ) )
            // InternalD3ql.g:2207:1: ( () )
            {
            // InternalD3ql.g:2207:1: ( () )
            // InternalD3ql.g:2208:2: ()
            {
             before(grammarAccess.getComparisonAccess().getComparisonLeftAction_1_2_0()); 
            // InternalD3ql.g:2209:2: ()
            // InternalD3ql.g:2209:3: 
            {
            }

             after(grammarAccess.getComparisonAccess().getComparisonLeftAction_1_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1_2__0__Impl"


    // $ANTLR start "rule__Comparison__Group_1_2__1"
    // InternalD3ql.g:2217:1: rule__Comparison__Group_1_2__1 : rule__Comparison__Group_1_2__1__Impl rule__Comparison__Group_1_2__2 ;
    public final void rule__Comparison__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:2221:1: ( rule__Comparison__Group_1_2__1__Impl rule__Comparison__Group_1_2__2 )
            // InternalD3ql.g:2222:2: rule__Comparison__Group_1_2__1__Impl rule__Comparison__Group_1_2__2
            {
            pushFollow(FOLLOW_21);
            rule__Comparison__Group_1_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Comparison__Group_1_2__2();

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
    // $ANTLR end "rule__Comparison__Group_1_2__1"


    // $ANTLR start "rule__Comparison__Group_1_2__1__Impl"
    // InternalD3ql.g:2229:1: rule__Comparison__Group_1_2__1__Impl : ( ( rule__Comparison__OpAssignment_1_2_1 ) ) ;
    public final void rule__Comparison__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:2233:1: ( ( ( rule__Comparison__OpAssignment_1_2_1 ) ) )
            // InternalD3ql.g:2234:1: ( ( rule__Comparison__OpAssignment_1_2_1 ) )
            {
            // InternalD3ql.g:2234:1: ( ( rule__Comparison__OpAssignment_1_2_1 ) )
            // InternalD3ql.g:2235:2: ( rule__Comparison__OpAssignment_1_2_1 )
            {
             before(grammarAccess.getComparisonAccess().getOpAssignment_1_2_1()); 
            // InternalD3ql.g:2236:2: ( rule__Comparison__OpAssignment_1_2_1 )
            // InternalD3ql.g:2236:3: rule__Comparison__OpAssignment_1_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__OpAssignment_1_2_1();

            state._fsp--;


            }

             after(grammarAccess.getComparisonAccess().getOpAssignment_1_2_1()); 

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
    // $ANTLR end "rule__Comparison__Group_1_2__1__Impl"


    // $ANTLR start "rule__Comparison__Group_1_2__2"
    // InternalD3ql.g:2244:1: rule__Comparison__Group_1_2__2 : rule__Comparison__Group_1_2__2__Impl rule__Comparison__Group_1_2__3 ;
    public final void rule__Comparison__Group_1_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:2248:1: ( rule__Comparison__Group_1_2__2__Impl rule__Comparison__Group_1_2__3 )
            // InternalD3ql.g:2249:2: rule__Comparison__Group_1_2__2__Impl rule__Comparison__Group_1_2__3
            {
            pushFollow(FOLLOW_10);
            rule__Comparison__Group_1_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Comparison__Group_1_2__3();

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
    // $ANTLR end "rule__Comparison__Group_1_2__2"


    // $ANTLR start "rule__Comparison__Group_1_2__2__Impl"
    // InternalD3ql.g:2256:1: rule__Comparison__Group_1_2__2__Impl : ( '(' ) ;
    public final void rule__Comparison__Group_1_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:2260:1: ( ( '(' ) )
            // InternalD3ql.g:2261:1: ( '(' )
            {
            // InternalD3ql.g:2261:1: ( '(' )
            // InternalD3ql.g:2262:2: '('
            {
             before(grammarAccess.getComparisonAccess().getLeftParenthesisKeyword_1_2_2()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getComparisonAccess().getLeftParenthesisKeyword_1_2_2()); 

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
    // $ANTLR end "rule__Comparison__Group_1_2__2__Impl"


    // $ANTLR start "rule__Comparison__Group_1_2__3"
    // InternalD3ql.g:2271:1: rule__Comparison__Group_1_2__3 : rule__Comparison__Group_1_2__3__Impl rule__Comparison__Group_1_2__4 ;
    public final void rule__Comparison__Group_1_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:2275:1: ( rule__Comparison__Group_1_2__3__Impl rule__Comparison__Group_1_2__4 )
            // InternalD3ql.g:2276:2: rule__Comparison__Group_1_2__3__Impl rule__Comparison__Group_1_2__4
            {
            pushFollow(FOLLOW_22);
            rule__Comparison__Group_1_2__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Comparison__Group_1_2__4();

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
    // $ANTLR end "rule__Comparison__Group_1_2__3"


    // $ANTLR start "rule__Comparison__Group_1_2__3__Impl"
    // InternalD3ql.g:2283:1: rule__Comparison__Group_1_2__3__Impl : ( ( rule__Comparison__ListAssignment_1_2_3 ) ) ;
    public final void rule__Comparison__Group_1_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:2287:1: ( ( ( rule__Comparison__ListAssignment_1_2_3 ) ) )
            // InternalD3ql.g:2288:1: ( ( rule__Comparison__ListAssignment_1_2_3 ) )
            {
            // InternalD3ql.g:2288:1: ( ( rule__Comparison__ListAssignment_1_2_3 ) )
            // InternalD3ql.g:2289:2: ( rule__Comparison__ListAssignment_1_2_3 )
            {
             before(grammarAccess.getComparisonAccess().getListAssignment_1_2_3()); 
            // InternalD3ql.g:2290:2: ( rule__Comparison__ListAssignment_1_2_3 )
            // InternalD3ql.g:2290:3: rule__Comparison__ListAssignment_1_2_3
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__ListAssignment_1_2_3();

            state._fsp--;


            }

             after(grammarAccess.getComparisonAccess().getListAssignment_1_2_3()); 

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
    // $ANTLR end "rule__Comparison__Group_1_2__3__Impl"


    // $ANTLR start "rule__Comparison__Group_1_2__4"
    // InternalD3ql.g:2298:1: rule__Comparison__Group_1_2__4 : rule__Comparison__Group_1_2__4__Impl rule__Comparison__Group_1_2__5 ;
    public final void rule__Comparison__Group_1_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:2302:1: ( rule__Comparison__Group_1_2__4__Impl rule__Comparison__Group_1_2__5 )
            // InternalD3ql.g:2303:2: rule__Comparison__Group_1_2__4__Impl rule__Comparison__Group_1_2__5
            {
            pushFollow(FOLLOW_22);
            rule__Comparison__Group_1_2__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Comparison__Group_1_2__5();

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
    // $ANTLR end "rule__Comparison__Group_1_2__4"


    // $ANTLR start "rule__Comparison__Group_1_2__4__Impl"
    // InternalD3ql.g:2310:1: rule__Comparison__Group_1_2__4__Impl : ( ( rule__Comparison__Group_1_2_4__0 )* ) ;
    public final void rule__Comparison__Group_1_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:2314:1: ( ( ( rule__Comparison__Group_1_2_4__0 )* ) )
            // InternalD3ql.g:2315:1: ( ( rule__Comparison__Group_1_2_4__0 )* )
            {
            // InternalD3ql.g:2315:1: ( ( rule__Comparison__Group_1_2_4__0 )* )
            // InternalD3ql.g:2316:2: ( rule__Comparison__Group_1_2_4__0 )*
            {
             before(grammarAccess.getComparisonAccess().getGroup_1_2_4()); 
            // InternalD3ql.g:2317:2: ( rule__Comparison__Group_1_2_4__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==21) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalD3ql.g:2317:3: rule__Comparison__Group_1_2_4__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Comparison__Group_1_2_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getComparisonAccess().getGroup_1_2_4()); 

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
    // $ANTLR end "rule__Comparison__Group_1_2__4__Impl"


    // $ANTLR start "rule__Comparison__Group_1_2__5"
    // InternalD3ql.g:2325:1: rule__Comparison__Group_1_2__5 : rule__Comparison__Group_1_2__5__Impl ;
    public final void rule__Comparison__Group_1_2__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:2329:1: ( rule__Comparison__Group_1_2__5__Impl )
            // InternalD3ql.g:2330:2: rule__Comparison__Group_1_2__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__Group_1_2__5__Impl();

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
    // $ANTLR end "rule__Comparison__Group_1_2__5"


    // $ANTLR start "rule__Comparison__Group_1_2__5__Impl"
    // InternalD3ql.g:2336:1: rule__Comparison__Group_1_2__5__Impl : ( ')' ) ;
    public final void rule__Comparison__Group_1_2__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:2340:1: ( ( ')' ) )
            // InternalD3ql.g:2341:1: ( ')' )
            {
            // InternalD3ql.g:2341:1: ( ')' )
            // InternalD3ql.g:2342:2: ')'
            {
             before(grammarAccess.getComparisonAccess().getRightParenthesisKeyword_1_2_5()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getComparisonAccess().getRightParenthesisKeyword_1_2_5()); 

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
    // $ANTLR end "rule__Comparison__Group_1_2__5__Impl"


    // $ANTLR start "rule__Comparison__Group_1_2_4__0"
    // InternalD3ql.g:2352:1: rule__Comparison__Group_1_2_4__0 : rule__Comparison__Group_1_2_4__0__Impl rule__Comparison__Group_1_2_4__1 ;
    public final void rule__Comparison__Group_1_2_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:2356:1: ( rule__Comparison__Group_1_2_4__0__Impl rule__Comparison__Group_1_2_4__1 )
            // InternalD3ql.g:2357:2: rule__Comparison__Group_1_2_4__0__Impl rule__Comparison__Group_1_2_4__1
            {
            pushFollow(FOLLOW_10);
            rule__Comparison__Group_1_2_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Comparison__Group_1_2_4__1();

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
    // $ANTLR end "rule__Comparison__Group_1_2_4__0"


    // $ANTLR start "rule__Comparison__Group_1_2_4__0__Impl"
    // InternalD3ql.g:2364:1: rule__Comparison__Group_1_2_4__0__Impl : ( ',' ) ;
    public final void rule__Comparison__Group_1_2_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:2368:1: ( ( ',' ) )
            // InternalD3ql.g:2369:1: ( ',' )
            {
            // InternalD3ql.g:2369:1: ( ',' )
            // InternalD3ql.g:2370:2: ','
            {
             before(grammarAccess.getComparisonAccess().getCommaKeyword_1_2_4_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getComparisonAccess().getCommaKeyword_1_2_4_0()); 

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
    // $ANTLR end "rule__Comparison__Group_1_2_4__0__Impl"


    // $ANTLR start "rule__Comparison__Group_1_2_4__1"
    // InternalD3ql.g:2379:1: rule__Comparison__Group_1_2_4__1 : rule__Comparison__Group_1_2_4__1__Impl ;
    public final void rule__Comparison__Group_1_2_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:2383:1: ( rule__Comparison__Group_1_2_4__1__Impl )
            // InternalD3ql.g:2384:2: rule__Comparison__Group_1_2_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__Group_1_2_4__1__Impl();

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
    // $ANTLR end "rule__Comparison__Group_1_2_4__1"


    // $ANTLR start "rule__Comparison__Group_1_2_4__1__Impl"
    // InternalD3ql.g:2390:1: rule__Comparison__Group_1_2_4__1__Impl : ( ( rule__Comparison__ListAssignment_1_2_4_1 ) ) ;
    public final void rule__Comparison__Group_1_2_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:2394:1: ( ( ( rule__Comparison__ListAssignment_1_2_4_1 ) ) )
            // InternalD3ql.g:2395:1: ( ( rule__Comparison__ListAssignment_1_2_4_1 ) )
            {
            // InternalD3ql.g:2395:1: ( ( rule__Comparison__ListAssignment_1_2_4_1 ) )
            // InternalD3ql.g:2396:2: ( rule__Comparison__ListAssignment_1_2_4_1 )
            {
             before(grammarAccess.getComparisonAccess().getListAssignment_1_2_4_1()); 
            // InternalD3ql.g:2397:2: ( rule__Comparison__ListAssignment_1_2_4_1 )
            // InternalD3ql.g:2397:3: rule__Comparison__ListAssignment_1_2_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__ListAssignment_1_2_4_1();

            state._fsp--;


            }

             after(grammarAccess.getComparisonAccess().getListAssignment_1_2_4_1()); 

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
    // $ANTLR end "rule__Comparison__Group_1_2_4__1__Impl"


    // $ANTLR start "rule__Primary__Group_0__0"
    // InternalD3ql.g:2406:1: rule__Primary__Group_0__0 : rule__Primary__Group_0__0__Impl rule__Primary__Group_0__1 ;
    public final void rule__Primary__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:2410:1: ( rule__Primary__Group_0__0__Impl rule__Primary__Group_0__1 )
            // InternalD3ql.g:2411:2: rule__Primary__Group_0__0__Impl rule__Primary__Group_0__1
            {
            pushFollow(FOLLOW_10);
            rule__Primary__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primary__Group_0__1();

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
    // $ANTLR end "rule__Primary__Group_0__0"


    // $ANTLR start "rule__Primary__Group_0__0__Impl"
    // InternalD3ql.g:2418:1: rule__Primary__Group_0__0__Impl : ( '(' ) ;
    public final void rule__Primary__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:2422:1: ( ( '(' ) )
            // InternalD3ql.g:2423:1: ( '(' )
            {
            // InternalD3ql.g:2423:1: ( '(' )
            // InternalD3ql.g:2424:2: '('
            {
             before(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_0_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_0_0()); 

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
    // $ANTLR end "rule__Primary__Group_0__0__Impl"


    // $ANTLR start "rule__Primary__Group_0__1"
    // InternalD3ql.g:2433:1: rule__Primary__Group_0__1 : rule__Primary__Group_0__1__Impl rule__Primary__Group_0__2 ;
    public final void rule__Primary__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:2437:1: ( rule__Primary__Group_0__1__Impl rule__Primary__Group_0__2 )
            // InternalD3ql.g:2438:2: rule__Primary__Group_0__1__Impl rule__Primary__Group_0__2
            {
            pushFollow(FOLLOW_23);
            rule__Primary__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primary__Group_0__2();

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
    // $ANTLR end "rule__Primary__Group_0__1"


    // $ANTLR start "rule__Primary__Group_0__1__Impl"
    // InternalD3ql.g:2445:1: rule__Primary__Group_0__1__Impl : ( ruleExpression ) ;
    public final void rule__Primary__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:2449:1: ( ( ruleExpression ) )
            // InternalD3ql.g:2450:1: ( ruleExpression )
            {
            // InternalD3ql.g:2450:1: ( ruleExpression )
            // InternalD3ql.g:2451:2: ruleExpression
            {
             before(grammarAccess.getPrimaryAccess().getExpressionParserRuleCall_0_1()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getPrimaryAccess().getExpressionParserRuleCall_0_1()); 

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
    // $ANTLR end "rule__Primary__Group_0__1__Impl"


    // $ANTLR start "rule__Primary__Group_0__2"
    // InternalD3ql.g:2460:1: rule__Primary__Group_0__2 : rule__Primary__Group_0__2__Impl ;
    public final void rule__Primary__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:2464:1: ( rule__Primary__Group_0__2__Impl )
            // InternalD3ql.g:2465:2: rule__Primary__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Primary__Group_0__2__Impl();

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
    // $ANTLR end "rule__Primary__Group_0__2"


    // $ANTLR start "rule__Primary__Group_0__2__Impl"
    // InternalD3ql.g:2471:1: rule__Primary__Group_0__2__Impl : ( ')' ) ;
    public final void rule__Primary__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:2475:1: ( ( ')' ) )
            // InternalD3ql.g:2476:1: ( ')' )
            {
            // InternalD3ql.g:2476:1: ( ')' )
            // InternalD3ql.g:2477:2: ')'
            {
             before(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_0_2()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_0_2()); 

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
    // $ANTLR end "rule__Primary__Group_0__2__Impl"


    // $ANTLR start "rule__Primary__Group_1__0"
    // InternalD3ql.g:2487:1: rule__Primary__Group_1__0 : rule__Primary__Group_1__0__Impl rule__Primary__Group_1__1 ;
    public final void rule__Primary__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:2491:1: ( rule__Primary__Group_1__0__Impl rule__Primary__Group_1__1 )
            // InternalD3ql.g:2492:2: rule__Primary__Group_1__0__Impl rule__Primary__Group_1__1
            {
            pushFollow(FOLLOW_24);
            rule__Primary__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primary__Group_1__1();

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
    // $ANTLR end "rule__Primary__Group_1__0"


    // $ANTLR start "rule__Primary__Group_1__0__Impl"
    // InternalD3ql.g:2499:1: rule__Primary__Group_1__0__Impl : ( () ) ;
    public final void rule__Primary__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:2503:1: ( ( () ) )
            // InternalD3ql.g:2504:1: ( () )
            {
            // InternalD3ql.g:2504:1: ( () )
            // InternalD3ql.g:2505:2: ()
            {
             before(grammarAccess.getPrimaryAccess().getNotAction_1_0()); 
            // InternalD3ql.g:2506:2: ()
            // InternalD3ql.g:2506:3: 
            {
            }

             after(grammarAccess.getPrimaryAccess().getNotAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_1__0__Impl"


    // $ANTLR start "rule__Primary__Group_1__1"
    // InternalD3ql.g:2514:1: rule__Primary__Group_1__1 : rule__Primary__Group_1__1__Impl rule__Primary__Group_1__2 ;
    public final void rule__Primary__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:2518:1: ( rule__Primary__Group_1__1__Impl rule__Primary__Group_1__2 )
            // InternalD3ql.g:2519:2: rule__Primary__Group_1__1__Impl rule__Primary__Group_1__2
            {
            pushFollow(FOLLOW_10);
            rule__Primary__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primary__Group_1__2();

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
    // $ANTLR end "rule__Primary__Group_1__1"


    // $ANTLR start "rule__Primary__Group_1__1__Impl"
    // InternalD3ql.g:2526:1: rule__Primary__Group_1__1__Impl : ( '!' ) ;
    public final void rule__Primary__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:2530:1: ( ( '!' ) )
            // InternalD3ql.g:2531:1: ( '!' )
            {
            // InternalD3ql.g:2531:1: ( '!' )
            // InternalD3ql.g:2532:2: '!'
            {
             before(grammarAccess.getPrimaryAccess().getExclamationMarkKeyword_1_1()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getPrimaryAccess().getExclamationMarkKeyword_1_1()); 

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
    // $ANTLR end "rule__Primary__Group_1__1__Impl"


    // $ANTLR start "rule__Primary__Group_1__2"
    // InternalD3ql.g:2541:1: rule__Primary__Group_1__2 : rule__Primary__Group_1__2__Impl ;
    public final void rule__Primary__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:2545:1: ( rule__Primary__Group_1__2__Impl )
            // InternalD3ql.g:2546:2: rule__Primary__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Primary__Group_1__2__Impl();

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
    // $ANTLR end "rule__Primary__Group_1__2"


    // $ANTLR start "rule__Primary__Group_1__2__Impl"
    // InternalD3ql.g:2552:1: rule__Primary__Group_1__2__Impl : ( ( rule__Primary__ExpressionAssignment_1_2 ) ) ;
    public final void rule__Primary__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:2556:1: ( ( ( rule__Primary__ExpressionAssignment_1_2 ) ) )
            // InternalD3ql.g:2557:1: ( ( rule__Primary__ExpressionAssignment_1_2 ) )
            {
            // InternalD3ql.g:2557:1: ( ( rule__Primary__ExpressionAssignment_1_2 ) )
            // InternalD3ql.g:2558:2: ( rule__Primary__ExpressionAssignment_1_2 )
            {
             before(grammarAccess.getPrimaryAccess().getExpressionAssignment_1_2()); 
            // InternalD3ql.g:2559:2: ( rule__Primary__ExpressionAssignment_1_2 )
            // InternalD3ql.g:2559:3: rule__Primary__ExpressionAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Primary__ExpressionAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryAccess().getExpressionAssignment_1_2()); 

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
    // $ANTLR end "rule__Primary__Group_1__2__Impl"


    // $ANTLR start "rule__FQN__Group__0"
    // InternalD3ql.g:2568:1: rule__FQN__Group__0 : rule__FQN__Group__0__Impl rule__FQN__Group__1 ;
    public final void rule__FQN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:2572:1: ( rule__FQN__Group__0__Impl rule__FQN__Group__1 )
            // InternalD3ql.g:2573:2: rule__FQN__Group__0__Impl rule__FQN__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__FQN__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FQN__Group__1();

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
    // $ANTLR end "rule__FQN__Group__0"


    // $ANTLR start "rule__FQN__Group__0__Impl"
    // InternalD3ql.g:2580:1: rule__FQN__Group__0__Impl : ( ( rule__FQN__HeadAssignment_0 ) ) ;
    public final void rule__FQN__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:2584:1: ( ( ( rule__FQN__HeadAssignment_0 ) ) )
            // InternalD3ql.g:2585:1: ( ( rule__FQN__HeadAssignment_0 ) )
            {
            // InternalD3ql.g:2585:1: ( ( rule__FQN__HeadAssignment_0 ) )
            // InternalD3ql.g:2586:2: ( rule__FQN__HeadAssignment_0 )
            {
             before(grammarAccess.getFQNAccess().getHeadAssignment_0()); 
            // InternalD3ql.g:2587:2: ( rule__FQN__HeadAssignment_0 )
            // InternalD3ql.g:2587:3: rule__FQN__HeadAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__FQN__HeadAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getFQNAccess().getHeadAssignment_0()); 

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
    // $ANTLR end "rule__FQN__Group__0__Impl"


    // $ANTLR start "rule__FQN__Group__1"
    // InternalD3ql.g:2595:1: rule__FQN__Group__1 : rule__FQN__Group__1__Impl rule__FQN__Group__2 ;
    public final void rule__FQN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:2599:1: ( rule__FQN__Group__1__Impl rule__FQN__Group__2 )
            // InternalD3ql.g:2600:2: rule__FQN__Group__1__Impl rule__FQN__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__FQN__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FQN__Group__2();

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
    // $ANTLR end "rule__FQN__Group__1"


    // $ANTLR start "rule__FQN__Group__1__Impl"
    // InternalD3ql.g:2607:1: rule__FQN__Group__1__Impl : ( '.' ) ;
    public final void rule__FQN__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:2611:1: ( ( '.' ) )
            // InternalD3ql.g:2612:1: ( '.' )
            {
            // InternalD3ql.g:2612:1: ( '.' )
            // InternalD3ql.g:2613:2: '.'
            {
             before(grammarAccess.getFQNAccess().getFullStopKeyword_1()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getFQNAccess().getFullStopKeyword_1()); 

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
    // $ANTLR end "rule__FQN__Group__1__Impl"


    // $ANTLR start "rule__FQN__Group__2"
    // InternalD3ql.g:2622:1: rule__FQN__Group__2 : rule__FQN__Group__2__Impl rule__FQN__Group__3 ;
    public final void rule__FQN__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:2626:1: ( rule__FQN__Group__2__Impl rule__FQN__Group__3 )
            // InternalD3ql.g:2627:2: rule__FQN__Group__2__Impl rule__FQN__Group__3
            {
            pushFollow(FOLLOW_25);
            rule__FQN__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FQN__Group__3();

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
    // $ANTLR end "rule__FQN__Group__2"


    // $ANTLR start "rule__FQN__Group__2__Impl"
    // InternalD3ql.g:2634:1: rule__FQN__Group__2__Impl : ( ( rule__FQN__TailAssignment_2 ) ) ;
    public final void rule__FQN__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:2638:1: ( ( ( rule__FQN__TailAssignment_2 ) ) )
            // InternalD3ql.g:2639:1: ( ( rule__FQN__TailAssignment_2 ) )
            {
            // InternalD3ql.g:2639:1: ( ( rule__FQN__TailAssignment_2 ) )
            // InternalD3ql.g:2640:2: ( rule__FQN__TailAssignment_2 )
            {
             before(grammarAccess.getFQNAccess().getTailAssignment_2()); 
            // InternalD3ql.g:2641:2: ( rule__FQN__TailAssignment_2 )
            // InternalD3ql.g:2641:3: rule__FQN__TailAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__FQN__TailAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFQNAccess().getTailAssignment_2()); 

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
    // $ANTLR end "rule__FQN__Group__2__Impl"


    // $ANTLR start "rule__FQN__Group__3"
    // InternalD3ql.g:2649:1: rule__FQN__Group__3 : rule__FQN__Group__3__Impl ;
    public final void rule__FQN__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:2653:1: ( rule__FQN__Group__3__Impl )
            // InternalD3ql.g:2654:2: rule__FQN__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FQN__Group__3__Impl();

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
    // $ANTLR end "rule__FQN__Group__3"


    // $ANTLR start "rule__FQN__Group__3__Impl"
    // InternalD3ql.g:2660:1: rule__FQN__Group__3__Impl : ( ( rule__FQN__Group_3__0 )* ) ;
    public final void rule__FQN__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:2664:1: ( ( ( rule__FQN__Group_3__0 )* ) )
            // InternalD3ql.g:2665:1: ( ( rule__FQN__Group_3__0 )* )
            {
            // InternalD3ql.g:2665:1: ( ( rule__FQN__Group_3__0 )* )
            // InternalD3ql.g:2666:2: ( rule__FQN__Group_3__0 )*
            {
             before(grammarAccess.getFQNAccess().getGroup_3()); 
            // InternalD3ql.g:2667:2: ( rule__FQN__Group_3__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==30) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalD3ql.g:2667:3: rule__FQN__Group_3__0
            	    {
            	    pushFollow(FOLLOW_26);
            	    rule__FQN__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getFQNAccess().getGroup_3()); 

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
    // $ANTLR end "rule__FQN__Group__3__Impl"


    // $ANTLR start "rule__FQN__Group_3__0"
    // InternalD3ql.g:2676:1: rule__FQN__Group_3__0 : rule__FQN__Group_3__0__Impl rule__FQN__Group_3__1 ;
    public final void rule__FQN__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:2680:1: ( rule__FQN__Group_3__0__Impl rule__FQN__Group_3__1 )
            // InternalD3ql.g:2681:2: rule__FQN__Group_3__0__Impl rule__FQN__Group_3__1
            {
            pushFollow(FOLLOW_5);
            rule__FQN__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FQN__Group_3__1();

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
    // $ANTLR end "rule__FQN__Group_3__0"


    // $ANTLR start "rule__FQN__Group_3__0__Impl"
    // InternalD3ql.g:2688:1: rule__FQN__Group_3__0__Impl : ( '.' ) ;
    public final void rule__FQN__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:2692:1: ( ( '.' ) )
            // InternalD3ql.g:2693:1: ( '.' )
            {
            // InternalD3ql.g:2693:1: ( '.' )
            // InternalD3ql.g:2694:2: '.'
            {
             before(grammarAccess.getFQNAccess().getFullStopKeyword_3_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getFQNAccess().getFullStopKeyword_3_0()); 

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
    // $ANTLR end "rule__FQN__Group_3__0__Impl"


    // $ANTLR start "rule__FQN__Group_3__1"
    // InternalD3ql.g:2703:1: rule__FQN__Group_3__1 : rule__FQN__Group_3__1__Impl ;
    public final void rule__FQN__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:2707:1: ( rule__FQN__Group_3__1__Impl )
            // InternalD3ql.g:2708:2: rule__FQN__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FQN__Group_3__1__Impl();

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
    // $ANTLR end "rule__FQN__Group_3__1"


    // $ANTLR start "rule__FQN__Group_3__1__Impl"
    // InternalD3ql.g:2714:1: rule__FQN__Group_3__1__Impl : ( ( rule__FQN__TailAssignment_3_1 ) ) ;
    public final void rule__FQN__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:2718:1: ( ( ( rule__FQN__TailAssignment_3_1 ) ) )
            // InternalD3ql.g:2719:1: ( ( rule__FQN__TailAssignment_3_1 ) )
            {
            // InternalD3ql.g:2719:1: ( ( rule__FQN__TailAssignment_3_1 ) )
            // InternalD3ql.g:2720:2: ( rule__FQN__TailAssignment_3_1 )
            {
             before(grammarAccess.getFQNAccess().getTailAssignment_3_1()); 
            // InternalD3ql.g:2721:2: ( rule__FQN__TailAssignment_3_1 )
            // InternalD3ql.g:2721:3: rule__FQN__TailAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__FQN__TailAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getFQNAccess().getTailAssignment_3_1()); 

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
    // $ANTLR end "rule__FQN__Group_3__1__Impl"


    // $ANTLR start "rule__FunctionCall__Group__0"
    // InternalD3ql.g:2730:1: rule__FunctionCall__Group__0 : rule__FunctionCall__Group__0__Impl rule__FunctionCall__Group__1 ;
    public final void rule__FunctionCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:2734:1: ( rule__FunctionCall__Group__0__Impl rule__FunctionCall__Group__1 )
            // InternalD3ql.g:2735:2: rule__FunctionCall__Group__0__Impl rule__FunctionCall__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__FunctionCall__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FunctionCall__Group__1();

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
    // $ANTLR end "rule__FunctionCall__Group__0"


    // $ANTLR start "rule__FunctionCall__Group__0__Impl"
    // InternalD3ql.g:2742:1: rule__FunctionCall__Group__0__Impl : ( ( rule__FunctionCall__FunctionAssignment_0 ) ) ;
    public final void rule__FunctionCall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:2746:1: ( ( ( rule__FunctionCall__FunctionAssignment_0 ) ) )
            // InternalD3ql.g:2747:1: ( ( rule__FunctionCall__FunctionAssignment_0 ) )
            {
            // InternalD3ql.g:2747:1: ( ( rule__FunctionCall__FunctionAssignment_0 ) )
            // InternalD3ql.g:2748:2: ( rule__FunctionCall__FunctionAssignment_0 )
            {
             before(grammarAccess.getFunctionCallAccess().getFunctionAssignment_0()); 
            // InternalD3ql.g:2749:2: ( rule__FunctionCall__FunctionAssignment_0 )
            // InternalD3ql.g:2749:3: rule__FunctionCall__FunctionAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__FunctionCall__FunctionAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getFunctionCallAccess().getFunctionAssignment_0()); 

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
    // $ANTLR end "rule__FunctionCall__Group__0__Impl"


    // $ANTLR start "rule__FunctionCall__Group__1"
    // InternalD3ql.g:2757:1: rule__FunctionCall__Group__1 : rule__FunctionCall__Group__1__Impl rule__FunctionCall__Group__2 ;
    public final void rule__FunctionCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:2761:1: ( rule__FunctionCall__Group__1__Impl rule__FunctionCall__Group__2 )
            // InternalD3ql.g:2762:2: rule__FunctionCall__Group__1__Impl rule__FunctionCall__Group__2
            {
            pushFollow(FOLLOW_27);
            rule__FunctionCall__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FunctionCall__Group__2();

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
    // $ANTLR end "rule__FunctionCall__Group__1"


    // $ANTLR start "rule__FunctionCall__Group__1__Impl"
    // InternalD3ql.g:2769:1: rule__FunctionCall__Group__1__Impl : ( '(' ) ;
    public final void rule__FunctionCall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:2773:1: ( ( '(' ) )
            // InternalD3ql.g:2774:1: ( '(' )
            {
            // InternalD3ql.g:2774:1: ( '(' )
            // InternalD3ql.g:2775:2: '('
            {
             before(grammarAccess.getFunctionCallAccess().getLeftParenthesisKeyword_1()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getFunctionCallAccess().getLeftParenthesisKeyword_1()); 

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
    // $ANTLR end "rule__FunctionCall__Group__1__Impl"


    // $ANTLR start "rule__FunctionCall__Group__2"
    // InternalD3ql.g:2784:1: rule__FunctionCall__Group__2 : rule__FunctionCall__Group__2__Impl rule__FunctionCall__Group__3 ;
    public final void rule__FunctionCall__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:2788:1: ( rule__FunctionCall__Group__2__Impl rule__FunctionCall__Group__3 )
            // InternalD3ql.g:2789:2: rule__FunctionCall__Group__2__Impl rule__FunctionCall__Group__3
            {
            pushFollow(FOLLOW_27);
            rule__FunctionCall__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FunctionCall__Group__3();

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
    // $ANTLR end "rule__FunctionCall__Group__2"


    // $ANTLR start "rule__FunctionCall__Group__2__Impl"
    // InternalD3ql.g:2796:1: rule__FunctionCall__Group__2__Impl : ( ( rule__FunctionCall__Group_2__0 )? ) ;
    public final void rule__FunctionCall__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:2800:1: ( ( ( rule__FunctionCall__Group_2__0 )? ) )
            // InternalD3ql.g:2801:1: ( ( rule__FunctionCall__Group_2__0 )? )
            {
            // InternalD3ql.g:2801:1: ( ( rule__FunctionCall__Group_2__0 )? )
            // InternalD3ql.g:2802:2: ( rule__FunctionCall__Group_2__0 )?
            {
             before(grammarAccess.getFunctionCallAccess().getGroup_2()); 
            // InternalD3ql.g:2803:2: ( rule__FunctionCall__Group_2__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_ID) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalD3ql.g:2803:3: rule__FunctionCall__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FunctionCall__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFunctionCallAccess().getGroup_2()); 

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
    // $ANTLR end "rule__FunctionCall__Group__2__Impl"


    // $ANTLR start "rule__FunctionCall__Group__3"
    // InternalD3ql.g:2811:1: rule__FunctionCall__Group__3 : rule__FunctionCall__Group__3__Impl ;
    public final void rule__FunctionCall__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:2815:1: ( rule__FunctionCall__Group__3__Impl )
            // InternalD3ql.g:2816:2: rule__FunctionCall__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FunctionCall__Group__3__Impl();

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
    // $ANTLR end "rule__FunctionCall__Group__3"


    // $ANTLR start "rule__FunctionCall__Group__3__Impl"
    // InternalD3ql.g:2822:1: rule__FunctionCall__Group__3__Impl : ( ')' ) ;
    public final void rule__FunctionCall__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:2826:1: ( ( ')' ) )
            // InternalD3ql.g:2827:1: ( ')' )
            {
            // InternalD3ql.g:2827:1: ( ')' )
            // InternalD3ql.g:2828:2: ')'
            {
             before(grammarAccess.getFunctionCallAccess().getRightParenthesisKeyword_3()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getFunctionCallAccess().getRightParenthesisKeyword_3()); 

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
    // $ANTLR end "rule__FunctionCall__Group__3__Impl"


    // $ANTLR start "rule__FunctionCall__Group_2__0"
    // InternalD3ql.g:2838:1: rule__FunctionCall__Group_2__0 : rule__FunctionCall__Group_2__0__Impl rule__FunctionCall__Group_2__1 ;
    public final void rule__FunctionCall__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:2842:1: ( rule__FunctionCall__Group_2__0__Impl rule__FunctionCall__Group_2__1 )
            // InternalD3ql.g:2843:2: rule__FunctionCall__Group_2__0__Impl rule__FunctionCall__Group_2__1
            {
            pushFollow(FOLLOW_6);
            rule__FunctionCall__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FunctionCall__Group_2__1();

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
    // $ANTLR end "rule__FunctionCall__Group_2__0"


    // $ANTLR start "rule__FunctionCall__Group_2__0__Impl"
    // InternalD3ql.g:2850:1: rule__FunctionCall__Group_2__0__Impl : ( ( rule__FunctionCall__ArgumentsAssignment_2_0 ) ) ;
    public final void rule__FunctionCall__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:2854:1: ( ( ( rule__FunctionCall__ArgumentsAssignment_2_0 ) ) )
            // InternalD3ql.g:2855:1: ( ( rule__FunctionCall__ArgumentsAssignment_2_0 ) )
            {
            // InternalD3ql.g:2855:1: ( ( rule__FunctionCall__ArgumentsAssignment_2_0 ) )
            // InternalD3ql.g:2856:2: ( rule__FunctionCall__ArgumentsAssignment_2_0 )
            {
             before(grammarAccess.getFunctionCallAccess().getArgumentsAssignment_2_0()); 
            // InternalD3ql.g:2857:2: ( rule__FunctionCall__ArgumentsAssignment_2_0 )
            // InternalD3ql.g:2857:3: rule__FunctionCall__ArgumentsAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__FunctionCall__ArgumentsAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getFunctionCallAccess().getArgumentsAssignment_2_0()); 

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
    // $ANTLR end "rule__FunctionCall__Group_2__0__Impl"


    // $ANTLR start "rule__FunctionCall__Group_2__1"
    // InternalD3ql.g:2865:1: rule__FunctionCall__Group_2__1 : rule__FunctionCall__Group_2__1__Impl ;
    public final void rule__FunctionCall__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:2869:1: ( rule__FunctionCall__Group_2__1__Impl )
            // InternalD3ql.g:2870:2: rule__FunctionCall__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FunctionCall__Group_2__1__Impl();

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
    // $ANTLR end "rule__FunctionCall__Group_2__1"


    // $ANTLR start "rule__FunctionCall__Group_2__1__Impl"
    // InternalD3ql.g:2876:1: rule__FunctionCall__Group_2__1__Impl : ( ( rule__FunctionCall__Group_2_1__0 )* ) ;
    public final void rule__FunctionCall__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:2880:1: ( ( ( rule__FunctionCall__Group_2_1__0 )* ) )
            // InternalD3ql.g:2881:1: ( ( rule__FunctionCall__Group_2_1__0 )* )
            {
            // InternalD3ql.g:2881:1: ( ( rule__FunctionCall__Group_2_1__0 )* )
            // InternalD3ql.g:2882:2: ( rule__FunctionCall__Group_2_1__0 )*
            {
             before(grammarAccess.getFunctionCallAccess().getGroup_2_1()); 
            // InternalD3ql.g:2883:2: ( rule__FunctionCall__Group_2_1__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==21) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalD3ql.g:2883:3: rule__FunctionCall__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__FunctionCall__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getFunctionCallAccess().getGroup_2_1()); 

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
    // $ANTLR end "rule__FunctionCall__Group_2__1__Impl"


    // $ANTLR start "rule__FunctionCall__Group_2_1__0"
    // InternalD3ql.g:2892:1: rule__FunctionCall__Group_2_1__0 : rule__FunctionCall__Group_2_1__0__Impl rule__FunctionCall__Group_2_1__1 ;
    public final void rule__FunctionCall__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:2896:1: ( rule__FunctionCall__Group_2_1__0__Impl rule__FunctionCall__Group_2_1__1 )
            // InternalD3ql.g:2897:2: rule__FunctionCall__Group_2_1__0__Impl rule__FunctionCall__Group_2_1__1
            {
            pushFollow(FOLLOW_5);
            rule__FunctionCall__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FunctionCall__Group_2_1__1();

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
    // $ANTLR end "rule__FunctionCall__Group_2_1__0"


    // $ANTLR start "rule__FunctionCall__Group_2_1__0__Impl"
    // InternalD3ql.g:2904:1: rule__FunctionCall__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__FunctionCall__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:2908:1: ( ( ',' ) )
            // InternalD3ql.g:2909:1: ( ',' )
            {
            // InternalD3ql.g:2909:1: ( ',' )
            // InternalD3ql.g:2910:2: ','
            {
             before(grammarAccess.getFunctionCallAccess().getCommaKeyword_2_1_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getFunctionCallAccess().getCommaKeyword_2_1_0()); 

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
    // $ANTLR end "rule__FunctionCall__Group_2_1__0__Impl"


    // $ANTLR start "rule__FunctionCall__Group_2_1__1"
    // InternalD3ql.g:2919:1: rule__FunctionCall__Group_2_1__1 : rule__FunctionCall__Group_2_1__1__Impl ;
    public final void rule__FunctionCall__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:2923:1: ( rule__FunctionCall__Group_2_1__1__Impl )
            // InternalD3ql.g:2924:2: rule__FunctionCall__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FunctionCall__Group_2_1__1__Impl();

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
    // $ANTLR end "rule__FunctionCall__Group_2_1__1"


    // $ANTLR start "rule__FunctionCall__Group_2_1__1__Impl"
    // InternalD3ql.g:2930:1: rule__FunctionCall__Group_2_1__1__Impl : ( ( rule__FunctionCall__ArgumentsAssignment_2_1_1 ) ) ;
    public final void rule__FunctionCall__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:2934:1: ( ( ( rule__FunctionCall__ArgumentsAssignment_2_1_1 ) ) )
            // InternalD3ql.g:2935:1: ( ( rule__FunctionCall__ArgumentsAssignment_2_1_1 ) )
            {
            // InternalD3ql.g:2935:1: ( ( rule__FunctionCall__ArgumentsAssignment_2_1_1 ) )
            // InternalD3ql.g:2936:2: ( rule__FunctionCall__ArgumentsAssignment_2_1_1 )
            {
             before(grammarAccess.getFunctionCallAccess().getArgumentsAssignment_2_1_1()); 
            // InternalD3ql.g:2937:2: ( rule__FunctionCall__ArgumentsAssignment_2_1_1 )
            // InternalD3ql.g:2937:3: rule__FunctionCall__ArgumentsAssignment_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__FunctionCall__ArgumentsAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getFunctionCallAccess().getArgumentsAssignment_2_1_1()); 

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
    // $ANTLR end "rule__FunctionCall__Group_2_1__1__Impl"


    // $ANTLR start "rule__FunctionArgument__Group__0"
    // InternalD3ql.g:2946:1: rule__FunctionArgument__Group__0 : rule__FunctionArgument__Group__0__Impl rule__FunctionArgument__Group__1 ;
    public final void rule__FunctionArgument__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:2950:1: ( rule__FunctionArgument__Group__0__Impl rule__FunctionArgument__Group__1 )
            // InternalD3ql.g:2951:2: rule__FunctionArgument__Group__0__Impl rule__FunctionArgument__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__FunctionArgument__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FunctionArgument__Group__1();

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
    // $ANTLR end "rule__FunctionArgument__Group__0"


    // $ANTLR start "rule__FunctionArgument__Group__0__Impl"
    // InternalD3ql.g:2958:1: rule__FunctionArgument__Group__0__Impl : ( () ) ;
    public final void rule__FunctionArgument__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:2962:1: ( ( () ) )
            // InternalD3ql.g:2963:1: ( () )
            {
            // InternalD3ql.g:2963:1: ( () )
            // InternalD3ql.g:2964:2: ()
            {
             before(grammarAccess.getFunctionArgumentAccess().getFunctionArgumentAction_0()); 
            // InternalD3ql.g:2965:2: ()
            // InternalD3ql.g:2965:3: 
            {
            }

             after(grammarAccess.getFunctionArgumentAccess().getFunctionArgumentAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionArgument__Group__0__Impl"


    // $ANTLR start "rule__FunctionArgument__Group__1"
    // InternalD3ql.g:2973:1: rule__FunctionArgument__Group__1 : rule__FunctionArgument__Group__1__Impl ;
    public final void rule__FunctionArgument__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:2977:1: ( rule__FunctionArgument__Group__1__Impl )
            // InternalD3ql.g:2978:2: rule__FunctionArgument__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FunctionArgument__Group__1__Impl();

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
    // $ANTLR end "rule__FunctionArgument__Group__1"


    // $ANTLR start "rule__FunctionArgument__Group__1__Impl"
    // InternalD3ql.g:2984:1: rule__FunctionArgument__Group__1__Impl : ( ( rule__FunctionArgument__Alternatives_1 ) ) ;
    public final void rule__FunctionArgument__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:2988:1: ( ( ( rule__FunctionArgument__Alternatives_1 ) ) )
            // InternalD3ql.g:2989:1: ( ( rule__FunctionArgument__Alternatives_1 ) )
            {
            // InternalD3ql.g:2989:1: ( ( rule__FunctionArgument__Alternatives_1 ) )
            // InternalD3ql.g:2990:2: ( rule__FunctionArgument__Alternatives_1 )
            {
             before(grammarAccess.getFunctionArgumentAccess().getAlternatives_1()); 
            // InternalD3ql.g:2991:2: ( rule__FunctionArgument__Alternatives_1 )
            // InternalD3ql.g:2991:3: rule__FunctionArgument__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__FunctionArgument__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getFunctionArgumentAccess().getAlternatives_1()); 

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
    // $ANTLR end "rule__FunctionArgument__Group__1__Impl"


    // $ANTLR start "rule__Atomic__Group_0__0"
    // InternalD3ql.g:3000:1: rule__Atomic__Group_0__0 : rule__Atomic__Group_0__0__Impl rule__Atomic__Group_0__1 ;
    public final void rule__Atomic__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:3004:1: ( rule__Atomic__Group_0__0__Impl rule__Atomic__Group_0__1 )
            // InternalD3ql.g:3005:2: rule__Atomic__Group_0__0__Impl rule__Atomic__Group_0__1
            {
            pushFollow(FOLLOW_28);
            rule__Atomic__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Atomic__Group_0__1();

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
    // $ANTLR end "rule__Atomic__Group_0__0"


    // $ANTLR start "rule__Atomic__Group_0__0__Impl"
    // InternalD3ql.g:3012:1: rule__Atomic__Group_0__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:3016:1: ( ( () ) )
            // InternalD3ql.g:3017:1: ( () )
            {
            // InternalD3ql.g:3017:1: ( () )
            // InternalD3ql.g:3018:2: ()
            {
             before(grammarAccess.getAtomicAccess().getIntConstantAction_0_0()); 
            // InternalD3ql.g:3019:2: ()
            // InternalD3ql.g:3019:3: 
            {
            }

             after(grammarAccess.getAtomicAccess().getIntConstantAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_0__0__Impl"


    // $ANTLR start "rule__Atomic__Group_0__1"
    // InternalD3ql.g:3027:1: rule__Atomic__Group_0__1 : rule__Atomic__Group_0__1__Impl ;
    public final void rule__Atomic__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:3031:1: ( rule__Atomic__Group_0__1__Impl )
            // InternalD3ql.g:3032:2: rule__Atomic__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Atomic__Group_0__1__Impl();

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
    // $ANTLR end "rule__Atomic__Group_0__1"


    // $ANTLR start "rule__Atomic__Group_0__1__Impl"
    // InternalD3ql.g:3038:1: rule__Atomic__Group_0__1__Impl : ( ( rule__Atomic__ValueAssignment_0_1 ) ) ;
    public final void rule__Atomic__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:3042:1: ( ( ( rule__Atomic__ValueAssignment_0_1 ) ) )
            // InternalD3ql.g:3043:1: ( ( rule__Atomic__ValueAssignment_0_1 ) )
            {
            // InternalD3ql.g:3043:1: ( ( rule__Atomic__ValueAssignment_0_1 ) )
            // InternalD3ql.g:3044:2: ( rule__Atomic__ValueAssignment_0_1 )
            {
             before(grammarAccess.getAtomicAccess().getValueAssignment_0_1()); 
            // InternalD3ql.g:3045:2: ( rule__Atomic__ValueAssignment_0_1 )
            // InternalD3ql.g:3045:3: rule__Atomic__ValueAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Atomic__ValueAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getAtomicAccess().getValueAssignment_0_1()); 

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
    // $ANTLR end "rule__Atomic__Group_0__1__Impl"


    // $ANTLR start "rule__Atomic__Group_1__0"
    // InternalD3ql.g:3054:1: rule__Atomic__Group_1__0 : rule__Atomic__Group_1__0__Impl rule__Atomic__Group_1__1 ;
    public final void rule__Atomic__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:3058:1: ( rule__Atomic__Group_1__0__Impl rule__Atomic__Group_1__1 )
            // InternalD3ql.g:3059:2: rule__Atomic__Group_1__0__Impl rule__Atomic__Group_1__1
            {
            pushFollow(FOLLOW_29);
            rule__Atomic__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Atomic__Group_1__1();

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
    // $ANTLR end "rule__Atomic__Group_1__0"


    // $ANTLR start "rule__Atomic__Group_1__0__Impl"
    // InternalD3ql.g:3066:1: rule__Atomic__Group_1__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:3070:1: ( ( () ) )
            // InternalD3ql.g:3071:1: ( () )
            {
            // InternalD3ql.g:3071:1: ( () )
            // InternalD3ql.g:3072:2: ()
            {
             before(grammarAccess.getAtomicAccess().getStringConstantAction_1_0()); 
            // InternalD3ql.g:3073:2: ()
            // InternalD3ql.g:3073:3: 
            {
            }

             after(grammarAccess.getAtomicAccess().getStringConstantAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_1__0__Impl"


    // $ANTLR start "rule__Atomic__Group_1__1"
    // InternalD3ql.g:3081:1: rule__Atomic__Group_1__1 : rule__Atomic__Group_1__1__Impl ;
    public final void rule__Atomic__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:3085:1: ( rule__Atomic__Group_1__1__Impl )
            // InternalD3ql.g:3086:2: rule__Atomic__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Atomic__Group_1__1__Impl();

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
    // $ANTLR end "rule__Atomic__Group_1__1"


    // $ANTLR start "rule__Atomic__Group_1__1__Impl"
    // InternalD3ql.g:3092:1: rule__Atomic__Group_1__1__Impl : ( ( rule__Atomic__ValueAssignment_1_1 ) ) ;
    public final void rule__Atomic__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:3096:1: ( ( ( rule__Atomic__ValueAssignment_1_1 ) ) )
            // InternalD3ql.g:3097:1: ( ( rule__Atomic__ValueAssignment_1_1 ) )
            {
            // InternalD3ql.g:3097:1: ( ( rule__Atomic__ValueAssignment_1_1 ) )
            // InternalD3ql.g:3098:2: ( rule__Atomic__ValueAssignment_1_1 )
            {
             before(grammarAccess.getAtomicAccess().getValueAssignment_1_1()); 
            // InternalD3ql.g:3099:2: ( rule__Atomic__ValueAssignment_1_1 )
            // InternalD3ql.g:3099:3: rule__Atomic__ValueAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Atomic__ValueAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAtomicAccess().getValueAssignment_1_1()); 

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
    // $ANTLR end "rule__Atomic__Group_1__1__Impl"


    // $ANTLR start "rule__Atomic__Group_2__0"
    // InternalD3ql.g:3108:1: rule__Atomic__Group_2__0 : rule__Atomic__Group_2__0__Impl rule__Atomic__Group_2__1 ;
    public final void rule__Atomic__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:3112:1: ( rule__Atomic__Group_2__0__Impl rule__Atomic__Group_2__1 )
            // InternalD3ql.g:3113:2: rule__Atomic__Group_2__0__Impl rule__Atomic__Group_2__1
            {
            pushFollow(FOLLOW_30);
            rule__Atomic__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Atomic__Group_2__1();

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
    // $ANTLR end "rule__Atomic__Group_2__0"


    // $ANTLR start "rule__Atomic__Group_2__0__Impl"
    // InternalD3ql.g:3120:1: rule__Atomic__Group_2__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:3124:1: ( ( () ) )
            // InternalD3ql.g:3125:1: ( () )
            {
            // InternalD3ql.g:3125:1: ( () )
            // InternalD3ql.g:3126:2: ()
            {
             before(grammarAccess.getAtomicAccess().getBooleanConstantAction_2_0()); 
            // InternalD3ql.g:3127:2: ()
            // InternalD3ql.g:3127:3: 
            {
            }

             after(grammarAccess.getAtomicAccess().getBooleanConstantAction_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_2__0__Impl"


    // $ANTLR start "rule__Atomic__Group_2__1"
    // InternalD3ql.g:3135:1: rule__Atomic__Group_2__1 : rule__Atomic__Group_2__1__Impl ;
    public final void rule__Atomic__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:3139:1: ( rule__Atomic__Group_2__1__Impl )
            // InternalD3ql.g:3140:2: rule__Atomic__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Atomic__Group_2__1__Impl();

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
    // $ANTLR end "rule__Atomic__Group_2__1"


    // $ANTLR start "rule__Atomic__Group_2__1__Impl"
    // InternalD3ql.g:3146:1: rule__Atomic__Group_2__1__Impl : ( ( rule__Atomic__ValueAssignment_2_1 ) ) ;
    public final void rule__Atomic__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:3150:1: ( ( ( rule__Atomic__ValueAssignment_2_1 ) ) )
            // InternalD3ql.g:3151:1: ( ( rule__Atomic__ValueAssignment_2_1 ) )
            {
            // InternalD3ql.g:3151:1: ( ( rule__Atomic__ValueAssignment_2_1 ) )
            // InternalD3ql.g:3152:2: ( rule__Atomic__ValueAssignment_2_1 )
            {
             before(grammarAccess.getAtomicAccess().getValueAssignment_2_1()); 
            // InternalD3ql.g:3153:2: ( rule__Atomic__ValueAssignment_2_1 )
            // InternalD3ql.g:3153:3: rule__Atomic__ValueAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Atomic__ValueAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getAtomicAccess().getValueAssignment_2_1()); 

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
    // $ANTLR end "rule__Atomic__Group_2__1__Impl"


    // $ANTLR start "rule__Atomic__Group_3__0"
    // InternalD3ql.g:3162:1: rule__Atomic__Group_3__0 : rule__Atomic__Group_3__0__Impl rule__Atomic__Group_3__1 ;
    public final void rule__Atomic__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:3166:1: ( rule__Atomic__Group_3__0__Impl rule__Atomic__Group_3__1 )
            // InternalD3ql.g:3167:2: rule__Atomic__Group_3__0__Impl rule__Atomic__Group_3__1
            {
            pushFollow(FOLLOW_31);
            rule__Atomic__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Atomic__Group_3__1();

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
    // $ANTLR end "rule__Atomic__Group_3__0"


    // $ANTLR start "rule__Atomic__Group_3__0__Impl"
    // InternalD3ql.g:3174:1: rule__Atomic__Group_3__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:3178:1: ( ( () ) )
            // InternalD3ql.g:3179:1: ( () )
            {
            // InternalD3ql.g:3179:1: ( () )
            // InternalD3ql.g:3180:2: ()
            {
             before(grammarAccess.getAtomicAccess().getNullConstantAction_3_0()); 
            // InternalD3ql.g:3181:2: ()
            // InternalD3ql.g:3181:3: 
            {
            }

             after(grammarAccess.getAtomicAccess().getNullConstantAction_3_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_3__0__Impl"


    // $ANTLR start "rule__Atomic__Group_3__1"
    // InternalD3ql.g:3189:1: rule__Atomic__Group_3__1 : rule__Atomic__Group_3__1__Impl ;
    public final void rule__Atomic__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:3193:1: ( rule__Atomic__Group_3__1__Impl )
            // InternalD3ql.g:3194:2: rule__Atomic__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Atomic__Group_3__1__Impl();

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
    // $ANTLR end "rule__Atomic__Group_3__1"


    // $ANTLR start "rule__Atomic__Group_3__1__Impl"
    // InternalD3ql.g:3200:1: rule__Atomic__Group_3__1__Impl : ( ( rule__Atomic__ValueAssignment_3_1 ) ) ;
    public final void rule__Atomic__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:3204:1: ( ( ( rule__Atomic__ValueAssignment_3_1 ) ) )
            // InternalD3ql.g:3205:1: ( ( rule__Atomic__ValueAssignment_3_1 ) )
            {
            // InternalD3ql.g:3205:1: ( ( rule__Atomic__ValueAssignment_3_1 ) )
            // InternalD3ql.g:3206:2: ( rule__Atomic__ValueAssignment_3_1 )
            {
             before(grammarAccess.getAtomicAccess().getValueAssignment_3_1()); 
            // InternalD3ql.g:3207:2: ( rule__Atomic__ValueAssignment_3_1 )
            // InternalD3ql.g:3207:3: rule__Atomic__ValueAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Atomic__ValueAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getAtomicAccess().getValueAssignment_3_1()); 

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
    // $ANTLR end "rule__Atomic__Group_3__1__Impl"


    // $ANTLR start "rule__Atomic__Group_4__0"
    // InternalD3ql.g:3216:1: rule__Atomic__Group_4__0 : rule__Atomic__Group_4__0__Impl rule__Atomic__Group_4__1 ;
    public final void rule__Atomic__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:3220:1: ( rule__Atomic__Group_4__0__Impl rule__Atomic__Group_4__1 )
            // InternalD3ql.g:3221:2: rule__Atomic__Group_4__0__Impl rule__Atomic__Group_4__1
            {
            pushFollow(FOLLOW_32);
            rule__Atomic__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Atomic__Group_4__1();

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
    // $ANTLR end "rule__Atomic__Group_4__0"


    // $ANTLR start "rule__Atomic__Group_4__0__Impl"
    // InternalD3ql.g:3228:1: rule__Atomic__Group_4__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:3232:1: ( ( () ) )
            // InternalD3ql.g:3233:1: ( () )
            {
            // InternalD3ql.g:3233:1: ( () )
            // InternalD3ql.g:3234:2: ()
            {
             before(grammarAccess.getAtomicAccess().getTemplatedValueAction_4_0()); 
            // InternalD3ql.g:3235:2: ()
            // InternalD3ql.g:3235:3: 
            {
            }

             after(grammarAccess.getAtomicAccess().getTemplatedValueAction_4_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_4__0__Impl"


    // $ANTLR start "rule__Atomic__Group_4__1"
    // InternalD3ql.g:3243:1: rule__Atomic__Group_4__1 : rule__Atomic__Group_4__1__Impl rule__Atomic__Group_4__2 ;
    public final void rule__Atomic__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:3247:1: ( rule__Atomic__Group_4__1__Impl rule__Atomic__Group_4__2 )
            // InternalD3ql.g:3248:2: rule__Atomic__Group_4__1__Impl rule__Atomic__Group_4__2
            {
            pushFollow(FOLLOW_5);
            rule__Atomic__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Atomic__Group_4__2();

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
    // $ANTLR end "rule__Atomic__Group_4__1"


    // $ANTLR start "rule__Atomic__Group_4__1__Impl"
    // InternalD3ql.g:3255:1: rule__Atomic__Group_4__1__Impl : ( '{' ) ;
    public final void rule__Atomic__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:3259:1: ( ( '{' ) )
            // InternalD3ql.g:3260:1: ( '{' )
            {
            // InternalD3ql.g:3260:1: ( '{' )
            // InternalD3ql.g:3261:2: '{'
            {
             before(grammarAccess.getAtomicAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getAtomicAccess().getLeftCurlyBracketKeyword_4_1()); 

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
    // $ANTLR end "rule__Atomic__Group_4__1__Impl"


    // $ANTLR start "rule__Atomic__Group_4__2"
    // InternalD3ql.g:3270:1: rule__Atomic__Group_4__2 : rule__Atomic__Group_4__2__Impl rule__Atomic__Group_4__3 ;
    public final void rule__Atomic__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:3274:1: ( rule__Atomic__Group_4__2__Impl rule__Atomic__Group_4__3 )
            // InternalD3ql.g:3275:2: rule__Atomic__Group_4__2__Impl rule__Atomic__Group_4__3
            {
            pushFollow(FOLLOW_33);
            rule__Atomic__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Atomic__Group_4__3();

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
    // $ANTLR end "rule__Atomic__Group_4__2"


    // $ANTLR start "rule__Atomic__Group_4__2__Impl"
    // InternalD3ql.g:3282:1: rule__Atomic__Group_4__2__Impl : ( ( rule__Atomic__ValueAssignment_4_2 ) ) ;
    public final void rule__Atomic__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:3286:1: ( ( ( rule__Atomic__ValueAssignment_4_2 ) ) )
            // InternalD3ql.g:3287:1: ( ( rule__Atomic__ValueAssignment_4_2 ) )
            {
            // InternalD3ql.g:3287:1: ( ( rule__Atomic__ValueAssignment_4_2 ) )
            // InternalD3ql.g:3288:2: ( rule__Atomic__ValueAssignment_4_2 )
            {
             before(grammarAccess.getAtomicAccess().getValueAssignment_4_2()); 
            // InternalD3ql.g:3289:2: ( rule__Atomic__ValueAssignment_4_2 )
            // InternalD3ql.g:3289:3: rule__Atomic__ValueAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__Atomic__ValueAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getAtomicAccess().getValueAssignment_4_2()); 

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
    // $ANTLR end "rule__Atomic__Group_4__2__Impl"


    // $ANTLR start "rule__Atomic__Group_4__3"
    // InternalD3ql.g:3297:1: rule__Atomic__Group_4__3 : rule__Atomic__Group_4__3__Impl ;
    public final void rule__Atomic__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:3301:1: ( rule__Atomic__Group_4__3__Impl )
            // InternalD3ql.g:3302:2: rule__Atomic__Group_4__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Atomic__Group_4__3__Impl();

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
    // $ANTLR end "rule__Atomic__Group_4__3"


    // $ANTLR start "rule__Atomic__Group_4__3__Impl"
    // InternalD3ql.g:3308:1: rule__Atomic__Group_4__3__Impl : ( '}' ) ;
    public final void rule__Atomic__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:3312:1: ( ( '}' ) )
            // InternalD3ql.g:3313:1: ( '}' )
            {
            // InternalD3ql.g:3313:1: ( '}' )
            // InternalD3ql.g:3314:2: '}'
            {
             before(grammarAccess.getAtomicAccess().getRightCurlyBracketKeyword_4_3()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getAtomicAccess().getRightCurlyBracketKeyword_4_3()); 

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
    // $ANTLR end "rule__Atomic__Group_4__3__Impl"


    // $ANTLR start "rule__Atomic__Group_5__0"
    // InternalD3ql.g:3324:1: rule__Atomic__Group_5__0 : rule__Atomic__Group_5__0__Impl rule__Atomic__Group_5__1 ;
    public final void rule__Atomic__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:3328:1: ( rule__Atomic__Group_5__0__Impl rule__Atomic__Group_5__1 )
            // InternalD3ql.g:3329:2: rule__Atomic__Group_5__0__Impl rule__Atomic__Group_5__1
            {
            pushFollow(FOLLOW_10);
            rule__Atomic__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Atomic__Group_5__1();

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
    // $ANTLR end "rule__Atomic__Group_5__0"


    // $ANTLR start "rule__Atomic__Group_5__0__Impl"
    // InternalD3ql.g:3336:1: rule__Atomic__Group_5__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:3340:1: ( ( () ) )
            // InternalD3ql.g:3341:1: ( () )
            {
            // InternalD3ql.g:3341:1: ( () )
            // InternalD3ql.g:3342:2: ()
            {
             before(grammarAccess.getAtomicAccess().getReferenceAction_5_0()); 
            // InternalD3ql.g:3343:2: ()
            // InternalD3ql.g:3343:3: 
            {
            }

             after(grammarAccess.getAtomicAccess().getReferenceAction_5_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_5__0__Impl"


    // $ANTLR start "rule__Atomic__Group_5__1"
    // InternalD3ql.g:3351:1: rule__Atomic__Group_5__1 : rule__Atomic__Group_5__1__Impl ;
    public final void rule__Atomic__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:3355:1: ( rule__Atomic__Group_5__1__Impl )
            // InternalD3ql.g:3356:2: rule__Atomic__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Atomic__Group_5__1__Impl();

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
    // $ANTLR end "rule__Atomic__Group_5__1"


    // $ANTLR start "rule__Atomic__Group_5__1__Impl"
    // InternalD3ql.g:3362:1: rule__Atomic__Group_5__1__Impl : ( ( rule__Atomic__ValueAssignment_5_1 ) ) ;
    public final void rule__Atomic__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:3366:1: ( ( ( rule__Atomic__ValueAssignment_5_1 ) ) )
            // InternalD3ql.g:3367:1: ( ( rule__Atomic__ValueAssignment_5_1 ) )
            {
            // InternalD3ql.g:3367:1: ( ( rule__Atomic__ValueAssignment_5_1 ) )
            // InternalD3ql.g:3368:2: ( rule__Atomic__ValueAssignment_5_1 )
            {
             before(grammarAccess.getAtomicAccess().getValueAssignment_5_1()); 
            // InternalD3ql.g:3369:2: ( rule__Atomic__ValueAssignment_5_1 )
            // InternalD3ql.g:3369:3: rule__Atomic__ValueAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Atomic__ValueAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getAtomicAccess().getValueAssignment_5_1()); 

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
    // $ANTLR end "rule__Atomic__Group_5__1__Impl"


    // $ANTLR start "rule__Query__FromAssignment_0"
    // InternalD3ql.g:3378:1: rule__Query__FromAssignment_0 : ( ruleFromStatement ) ;
    public final void rule__Query__FromAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:3382:1: ( ( ruleFromStatement ) )
            // InternalD3ql.g:3383:2: ( ruleFromStatement )
            {
            // InternalD3ql.g:3383:2: ( ruleFromStatement )
            // InternalD3ql.g:3384:3: ruleFromStatement
            {
             before(grammarAccess.getQueryAccess().getFromFromStatementParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleFromStatement();

            state._fsp--;

             after(grammarAccess.getQueryAccess().getFromFromStatementParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Query__FromAssignment_0"


    // $ANTLR start "rule__Query__SelectAssignment_1"
    // InternalD3ql.g:3393:1: rule__Query__SelectAssignment_1 : ( ruleSelectStatement ) ;
    public final void rule__Query__SelectAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:3397:1: ( ( ruleSelectStatement ) )
            // InternalD3ql.g:3398:2: ( ruleSelectStatement )
            {
            // InternalD3ql.g:3398:2: ( ruleSelectStatement )
            // InternalD3ql.g:3399:3: ruleSelectStatement
            {
             before(grammarAccess.getQueryAccess().getSelectSelectStatementParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSelectStatement();

            state._fsp--;

             after(grammarAccess.getQueryAccess().getSelectSelectStatementParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Query__SelectAssignment_1"


    // $ANTLR start "rule__Query__WhereAssignment_2"
    // InternalD3ql.g:3408:1: rule__Query__WhereAssignment_2 : ( ruleWhereStatement ) ;
    public final void rule__Query__WhereAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:3412:1: ( ( ruleWhereStatement ) )
            // InternalD3ql.g:3413:2: ( ruleWhereStatement )
            {
            // InternalD3ql.g:3413:2: ( ruleWhereStatement )
            // InternalD3ql.g:3414:3: ruleWhereStatement
            {
             before(grammarAccess.getQueryAccess().getWhereWhereStatementParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleWhereStatement();

            state._fsp--;

             after(grammarAccess.getQueryAccess().getWhereWhereStatementParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Query__WhereAssignment_2"


    // $ANTLR start "rule__FromStatement__AggregatesAssignment_1"
    // InternalD3ql.g:3423:1: rule__FromStatement__AggregatesAssignment_1 : ( ruleAggregateRoot ) ;
    public final void rule__FromStatement__AggregatesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:3427:1: ( ( ruleAggregateRoot ) )
            // InternalD3ql.g:3428:2: ( ruleAggregateRoot )
            {
            // InternalD3ql.g:3428:2: ( ruleAggregateRoot )
            // InternalD3ql.g:3429:3: ruleAggregateRoot
            {
             before(grammarAccess.getFromStatementAccess().getAggregatesAggregateRootParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAggregateRoot();

            state._fsp--;

             after(grammarAccess.getFromStatementAccess().getAggregatesAggregateRootParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__FromStatement__AggregatesAssignment_1"


    // $ANTLR start "rule__FromStatement__AggregatesAssignment_2_1"
    // InternalD3ql.g:3438:1: rule__FromStatement__AggregatesAssignment_2_1 : ( ruleAggregateRoot ) ;
    public final void rule__FromStatement__AggregatesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:3442:1: ( ( ruleAggregateRoot ) )
            // InternalD3ql.g:3443:2: ( ruleAggregateRoot )
            {
            // InternalD3ql.g:3443:2: ( ruleAggregateRoot )
            // InternalD3ql.g:3444:3: ruleAggregateRoot
            {
             before(grammarAccess.getFromStatementAccess().getAggregatesAggregateRootParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAggregateRoot();

            state._fsp--;

             after(grammarAccess.getFromStatementAccess().getAggregatesAggregateRootParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__FromStatement__AggregatesAssignment_2_1"


    // $ANTLR start "rule__SelectStatement__ArteriskAssignment_1_0"
    // InternalD3ql.g:3453:1: rule__SelectStatement__ArteriskAssignment_1_0 : ( ( '*' ) ) ;
    public final void rule__SelectStatement__ArteriskAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:3457:1: ( ( ( '*' ) ) )
            // InternalD3ql.g:3458:2: ( ( '*' ) )
            {
            // InternalD3ql.g:3458:2: ( ( '*' ) )
            // InternalD3ql.g:3459:3: ( '*' )
            {
             before(grammarAccess.getSelectStatementAccess().getArteriskAsteriskKeyword_1_0_0()); 
            // InternalD3ql.g:3460:3: ( '*' )
            // InternalD3ql.g:3461:4: '*'
            {
             before(grammarAccess.getSelectStatementAccess().getArteriskAsteriskKeyword_1_0_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getSelectStatementAccess().getArteriskAsteriskKeyword_1_0_0()); 

            }

             after(grammarAccess.getSelectStatementAccess().getArteriskAsteriskKeyword_1_0_0()); 

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
    // $ANTLR end "rule__SelectStatement__ArteriskAssignment_1_0"


    // $ANTLR start "rule__SelectStatement__SelectionsAssignment_1_1_0"
    // InternalD3ql.g:3472:1: rule__SelectStatement__SelectionsAssignment_1_1_0 : ( ruleSelectionItem ) ;
    public final void rule__SelectStatement__SelectionsAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:3476:1: ( ( ruleSelectionItem ) )
            // InternalD3ql.g:3477:2: ( ruleSelectionItem )
            {
            // InternalD3ql.g:3477:2: ( ruleSelectionItem )
            // InternalD3ql.g:3478:3: ruleSelectionItem
            {
             before(grammarAccess.getSelectStatementAccess().getSelectionsSelectionItemParserRuleCall_1_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleSelectionItem();

            state._fsp--;

             after(grammarAccess.getSelectStatementAccess().getSelectionsSelectionItemParserRuleCall_1_1_0_0()); 

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
    // $ANTLR end "rule__SelectStatement__SelectionsAssignment_1_1_0"


    // $ANTLR start "rule__SelectStatement__SelectionsAssignment_1_1_1_1"
    // InternalD3ql.g:3487:1: rule__SelectStatement__SelectionsAssignment_1_1_1_1 : ( ruleSelectionItem ) ;
    public final void rule__SelectStatement__SelectionsAssignment_1_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:3491:1: ( ( ruleSelectionItem ) )
            // InternalD3ql.g:3492:2: ( ruleSelectionItem )
            {
            // InternalD3ql.g:3492:2: ( ruleSelectionItem )
            // InternalD3ql.g:3493:3: ruleSelectionItem
            {
             before(grammarAccess.getSelectStatementAccess().getSelectionsSelectionItemParserRuleCall_1_1_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSelectionItem();

            state._fsp--;

             after(grammarAccess.getSelectStatementAccess().getSelectionsSelectionItemParserRuleCall_1_1_1_1_0()); 

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
    // $ANTLR end "rule__SelectStatement__SelectionsAssignment_1_1_1_1"


    // $ANTLR start "rule__SelectionItem__ExpressionAssignment_0"
    // InternalD3ql.g:3502:1: rule__SelectionItem__ExpressionAssignment_0 : ( ( rule__SelectionItem__ExpressionAlternatives_0_0 ) ) ;
    public final void rule__SelectionItem__ExpressionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:3506:1: ( ( ( rule__SelectionItem__ExpressionAlternatives_0_0 ) ) )
            // InternalD3ql.g:3507:2: ( ( rule__SelectionItem__ExpressionAlternatives_0_0 ) )
            {
            // InternalD3ql.g:3507:2: ( ( rule__SelectionItem__ExpressionAlternatives_0_0 ) )
            // InternalD3ql.g:3508:3: ( rule__SelectionItem__ExpressionAlternatives_0_0 )
            {
             before(grammarAccess.getSelectionItemAccess().getExpressionAlternatives_0_0()); 
            // InternalD3ql.g:3509:3: ( rule__SelectionItem__ExpressionAlternatives_0_0 )
            // InternalD3ql.g:3509:4: rule__SelectionItem__ExpressionAlternatives_0_0
            {
            pushFollow(FOLLOW_2);
            rule__SelectionItem__ExpressionAlternatives_0_0();

            state._fsp--;


            }

             after(grammarAccess.getSelectionItemAccess().getExpressionAlternatives_0_0()); 

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
    // $ANTLR end "rule__SelectionItem__ExpressionAssignment_0"


    // $ANTLR start "rule__SelectionItem__AliasAssignment_1_1"
    // InternalD3ql.g:3517:1: rule__SelectionItem__AliasAssignment_1_1 : ( ruleAlias ) ;
    public final void rule__SelectionItem__AliasAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:3521:1: ( ( ruleAlias ) )
            // InternalD3ql.g:3522:2: ( ruleAlias )
            {
            // InternalD3ql.g:3522:2: ( ruleAlias )
            // InternalD3ql.g:3523:3: ruleAlias
            {
             before(grammarAccess.getSelectionItemAccess().getAliasAliasParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAlias();

            state._fsp--;

             after(grammarAccess.getSelectionItemAccess().getAliasAliasParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__SelectionItem__AliasAssignment_1_1"


    // $ANTLR start "rule__WhereStatement__ExpressionsAssignment_1"
    // InternalD3ql.g:3532:1: rule__WhereStatement__ExpressionsAssignment_1 : ( ruleExpression ) ;
    public final void rule__WhereStatement__ExpressionsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:3536:1: ( ( ruleExpression ) )
            // InternalD3ql.g:3537:2: ( ruleExpression )
            {
            // InternalD3ql.g:3537:2: ( ruleExpression )
            // InternalD3ql.g:3538:3: ruleExpression
            {
             before(grammarAccess.getWhereStatementAccess().getExpressionsExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getWhereStatementAccess().getExpressionsExpressionParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__WhereStatement__ExpressionsAssignment_1"


    // $ANTLR start "rule__AggregateRoot__NameAssignment_0"
    // InternalD3ql.g:3547:1: rule__AggregateRoot__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__AggregateRoot__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:3551:1: ( ( RULE_ID ) )
            // InternalD3ql.g:3552:2: ( RULE_ID )
            {
            // InternalD3ql.g:3552:2: ( RULE_ID )
            // InternalD3ql.g:3553:3: RULE_ID
            {
             before(grammarAccess.getAggregateRootAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAggregateRootAccess().getNameIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__AggregateRoot__NameAssignment_0"


    // $ANTLR start "rule__AggregateRoot__AliasAssignment_1_1"
    // InternalD3ql.g:3562:1: rule__AggregateRoot__AliasAssignment_1_1 : ( ruleAlias ) ;
    public final void rule__AggregateRoot__AliasAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:3566:1: ( ( ruleAlias ) )
            // InternalD3ql.g:3567:2: ( ruleAlias )
            {
            // InternalD3ql.g:3567:2: ( ruleAlias )
            // InternalD3ql.g:3568:3: ruleAlias
            {
             before(grammarAccess.getAggregateRootAccess().getAliasAliasParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAlias();

            state._fsp--;

             after(grammarAccess.getAggregateRootAccess().getAliasAliasParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__AggregateRoot__AliasAssignment_1_1"


    // $ANTLR start "rule__Alias__NameAssignment"
    // InternalD3ql.g:3577:1: rule__Alias__NameAssignment : ( RULE_ID ) ;
    public final void rule__Alias__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:3581:1: ( ( RULE_ID ) )
            // InternalD3ql.g:3582:2: ( RULE_ID )
            {
            // InternalD3ql.g:3582:2: ( RULE_ID )
            // InternalD3ql.g:3583:3: RULE_ID
            {
             before(grammarAccess.getAliasAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAliasAccess().getNameIDTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__Alias__NameAssignment"


    // $ANTLR start "rule__Expression__AliasAssignment_1_2"
    // InternalD3ql.g:3592:1: rule__Expression__AliasAssignment_1_2 : ( ruleAlias ) ;
    public final void rule__Expression__AliasAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:3596:1: ( ( ruleAlias ) )
            // InternalD3ql.g:3597:2: ( ruleAlias )
            {
            // InternalD3ql.g:3597:2: ( ruleAlias )
            // InternalD3ql.g:3598:3: ruleAlias
            {
             before(grammarAccess.getExpressionAccess().getAliasAliasParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAlias();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getAliasAliasParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__Expression__AliasAssignment_1_2"


    // $ANTLR start "rule__Or__RightAssignment_1_2"
    // InternalD3ql.g:3607:1: rule__Or__RightAssignment_1_2 : ( ruleAnd ) ;
    public final void rule__Or__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:3611:1: ( ( ruleAnd ) )
            // InternalD3ql.g:3612:2: ( ruleAnd )
            {
            // InternalD3ql.g:3612:2: ( ruleAnd )
            // InternalD3ql.g:3613:3: ruleAnd
            {
             before(grammarAccess.getOrAccess().getRightAndParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAnd();

            state._fsp--;

             after(grammarAccess.getOrAccess().getRightAndParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__Or__RightAssignment_1_2"


    // $ANTLR start "rule__And__RightAssignment_1_2"
    // InternalD3ql.g:3622:1: rule__And__RightAssignment_1_2 : ( ruleEquality ) ;
    public final void rule__And__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:3626:1: ( ( ruleEquality ) )
            // InternalD3ql.g:3627:2: ( ruleEquality )
            {
            // InternalD3ql.g:3627:2: ( ruleEquality )
            // InternalD3ql.g:3628:3: ruleEquality
            {
             before(grammarAccess.getAndAccess().getRightEqualityParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEquality();

            state._fsp--;

             after(grammarAccess.getAndAccess().getRightEqualityParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__And__RightAssignment_1_2"


    // $ANTLR start "rule__Equality__OpAssignment_1_1"
    // InternalD3ql.g:3637:1: rule__Equality__OpAssignment_1_1 : ( ( rule__Equality__OpAlternatives_1_1_0 ) ) ;
    public final void rule__Equality__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:3641:1: ( ( ( rule__Equality__OpAlternatives_1_1_0 ) ) )
            // InternalD3ql.g:3642:2: ( ( rule__Equality__OpAlternatives_1_1_0 ) )
            {
            // InternalD3ql.g:3642:2: ( ( rule__Equality__OpAlternatives_1_1_0 ) )
            // InternalD3ql.g:3643:3: ( rule__Equality__OpAlternatives_1_1_0 )
            {
             before(grammarAccess.getEqualityAccess().getOpAlternatives_1_1_0()); 
            // InternalD3ql.g:3644:3: ( rule__Equality__OpAlternatives_1_1_0 )
            // InternalD3ql.g:3644:4: rule__Equality__OpAlternatives_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Equality__OpAlternatives_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getEqualityAccess().getOpAlternatives_1_1_0()); 

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
    // $ANTLR end "rule__Equality__OpAssignment_1_1"


    // $ANTLR start "rule__Equality__RightAssignment_1_2"
    // InternalD3ql.g:3652:1: rule__Equality__RightAssignment_1_2 : ( ruleComparison ) ;
    public final void rule__Equality__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:3656:1: ( ( ruleComparison ) )
            // InternalD3ql.g:3657:2: ( ruleComparison )
            {
            // InternalD3ql.g:3657:2: ( ruleComparison )
            // InternalD3ql.g:3658:3: ruleComparison
            {
             before(grammarAccess.getEqualityAccess().getRightComparisonParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleComparison();

            state._fsp--;

             after(grammarAccess.getEqualityAccess().getRightComparisonParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__Equality__RightAssignment_1_2"


    // $ANTLR start "rule__Comparison__OpAssignment_1_0_1"
    // InternalD3ql.g:3667:1: rule__Comparison__OpAssignment_1_0_1 : ( ( rule__Comparison__OpAlternatives_1_0_1_0 ) ) ;
    public final void rule__Comparison__OpAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:3671:1: ( ( ( rule__Comparison__OpAlternatives_1_0_1_0 ) ) )
            // InternalD3ql.g:3672:2: ( ( rule__Comparison__OpAlternatives_1_0_1_0 ) )
            {
            // InternalD3ql.g:3672:2: ( ( rule__Comparison__OpAlternatives_1_0_1_0 ) )
            // InternalD3ql.g:3673:3: ( rule__Comparison__OpAlternatives_1_0_1_0 )
            {
             before(grammarAccess.getComparisonAccess().getOpAlternatives_1_0_1_0()); 
            // InternalD3ql.g:3674:3: ( rule__Comparison__OpAlternatives_1_0_1_0 )
            // InternalD3ql.g:3674:4: rule__Comparison__OpAlternatives_1_0_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__OpAlternatives_1_0_1_0();

            state._fsp--;


            }

             after(grammarAccess.getComparisonAccess().getOpAlternatives_1_0_1_0()); 

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
    // $ANTLR end "rule__Comparison__OpAssignment_1_0_1"


    // $ANTLR start "rule__Comparison__RightAssignment_1_0_2"
    // InternalD3ql.g:3682:1: rule__Comparison__RightAssignment_1_0_2 : ( rulePrimary ) ;
    public final void rule__Comparison__RightAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:3686:1: ( ( rulePrimary ) )
            // InternalD3ql.g:3687:2: ( rulePrimary )
            {
            // InternalD3ql.g:3687:2: ( rulePrimary )
            // InternalD3ql.g:3688:3: rulePrimary
            {
             before(grammarAccess.getComparisonAccess().getRightPrimaryParserRuleCall_1_0_2_0()); 
            pushFollow(FOLLOW_2);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getComparisonAccess().getRightPrimaryParserRuleCall_1_0_2_0()); 

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
    // $ANTLR end "rule__Comparison__RightAssignment_1_0_2"


    // $ANTLR start "rule__Comparison__OpAssignment_1_1_1"
    // InternalD3ql.g:3697:1: rule__Comparison__OpAssignment_1_1_1 : ( ( 'between' ) ) ;
    public final void rule__Comparison__OpAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:3701:1: ( ( ( 'between' ) ) )
            // InternalD3ql.g:3702:2: ( ( 'between' ) )
            {
            // InternalD3ql.g:3702:2: ( ( 'between' ) )
            // InternalD3ql.g:3703:3: ( 'between' )
            {
             before(grammarAccess.getComparisonAccess().getOpBetweenKeyword_1_1_1_0()); 
            // InternalD3ql.g:3704:3: ( 'between' )
            // InternalD3ql.g:3705:4: 'between'
            {
             before(grammarAccess.getComparisonAccess().getOpBetweenKeyword_1_1_1_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getComparisonAccess().getOpBetweenKeyword_1_1_1_0()); 

            }

             after(grammarAccess.getComparisonAccess().getOpBetweenKeyword_1_1_1_0()); 

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
    // $ANTLR end "rule__Comparison__OpAssignment_1_1_1"


    // $ANTLR start "rule__Comparison__XAssignment_1_1_2"
    // InternalD3ql.g:3716:1: rule__Comparison__XAssignment_1_1_2 : ( rulePrimary ) ;
    public final void rule__Comparison__XAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:3720:1: ( ( rulePrimary ) )
            // InternalD3ql.g:3721:2: ( rulePrimary )
            {
            // InternalD3ql.g:3721:2: ( rulePrimary )
            // InternalD3ql.g:3722:3: rulePrimary
            {
             before(grammarAccess.getComparisonAccess().getXPrimaryParserRuleCall_1_1_2_0()); 
            pushFollow(FOLLOW_2);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getComparisonAccess().getXPrimaryParserRuleCall_1_1_2_0()); 

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
    // $ANTLR end "rule__Comparison__XAssignment_1_1_2"


    // $ANTLR start "rule__Comparison__YAssignment_1_1_4"
    // InternalD3ql.g:3731:1: rule__Comparison__YAssignment_1_1_4 : ( rulePrimary ) ;
    public final void rule__Comparison__YAssignment_1_1_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:3735:1: ( ( rulePrimary ) )
            // InternalD3ql.g:3736:2: ( rulePrimary )
            {
            // InternalD3ql.g:3736:2: ( rulePrimary )
            // InternalD3ql.g:3737:3: rulePrimary
            {
             before(grammarAccess.getComparisonAccess().getYPrimaryParserRuleCall_1_1_4_0()); 
            pushFollow(FOLLOW_2);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getComparisonAccess().getYPrimaryParserRuleCall_1_1_4_0()); 

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
    // $ANTLR end "rule__Comparison__YAssignment_1_1_4"


    // $ANTLR start "rule__Comparison__OpAssignment_1_2_1"
    // InternalD3ql.g:3746:1: rule__Comparison__OpAssignment_1_2_1 : ( ( 'in' ) ) ;
    public final void rule__Comparison__OpAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:3750:1: ( ( ( 'in' ) ) )
            // InternalD3ql.g:3751:2: ( ( 'in' ) )
            {
            // InternalD3ql.g:3751:2: ( ( 'in' ) )
            // InternalD3ql.g:3752:3: ( 'in' )
            {
             before(grammarAccess.getComparisonAccess().getOpInKeyword_1_2_1_0()); 
            // InternalD3ql.g:3753:3: ( 'in' )
            // InternalD3ql.g:3754:4: 'in'
            {
             before(grammarAccess.getComparisonAccess().getOpInKeyword_1_2_1_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getComparisonAccess().getOpInKeyword_1_2_1_0()); 

            }

             after(grammarAccess.getComparisonAccess().getOpInKeyword_1_2_1_0()); 

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
    // $ANTLR end "rule__Comparison__OpAssignment_1_2_1"


    // $ANTLR start "rule__Comparison__ListAssignment_1_2_3"
    // InternalD3ql.g:3765:1: rule__Comparison__ListAssignment_1_2_3 : ( ruleAtomic ) ;
    public final void rule__Comparison__ListAssignment_1_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:3769:1: ( ( ruleAtomic ) )
            // InternalD3ql.g:3770:2: ( ruleAtomic )
            {
            // InternalD3ql.g:3770:2: ( ruleAtomic )
            // InternalD3ql.g:3771:3: ruleAtomic
            {
             before(grammarAccess.getComparisonAccess().getListAtomicParserRuleCall_1_2_3_0()); 
            pushFollow(FOLLOW_2);
            ruleAtomic();

            state._fsp--;

             after(grammarAccess.getComparisonAccess().getListAtomicParserRuleCall_1_2_3_0()); 

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
    // $ANTLR end "rule__Comparison__ListAssignment_1_2_3"


    // $ANTLR start "rule__Comparison__ListAssignment_1_2_4_1"
    // InternalD3ql.g:3780:1: rule__Comparison__ListAssignment_1_2_4_1 : ( ruleAtomic ) ;
    public final void rule__Comparison__ListAssignment_1_2_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:3784:1: ( ( ruleAtomic ) )
            // InternalD3ql.g:3785:2: ( ruleAtomic )
            {
            // InternalD3ql.g:3785:2: ( ruleAtomic )
            // InternalD3ql.g:3786:3: ruleAtomic
            {
             before(grammarAccess.getComparisonAccess().getListAtomicParserRuleCall_1_2_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAtomic();

            state._fsp--;

             after(grammarAccess.getComparisonAccess().getListAtomicParserRuleCall_1_2_4_1_0()); 

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
    // $ANTLR end "rule__Comparison__ListAssignment_1_2_4_1"


    // $ANTLR start "rule__Primary__ExpressionAssignment_1_2"
    // InternalD3ql.g:3795:1: rule__Primary__ExpressionAssignment_1_2 : ( rulePrimary ) ;
    public final void rule__Primary__ExpressionAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:3799:1: ( ( rulePrimary ) )
            // InternalD3ql.g:3800:2: ( rulePrimary )
            {
            // InternalD3ql.g:3800:2: ( rulePrimary )
            // InternalD3ql.g:3801:3: rulePrimary
            {
             before(grammarAccess.getPrimaryAccess().getExpressionPrimaryParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getPrimaryAccess().getExpressionPrimaryParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__Primary__ExpressionAssignment_1_2"


    // $ANTLR start "rule__FQN__HeadAssignment_0"
    // InternalD3ql.g:3810:1: rule__FQN__HeadAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__FQN__HeadAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:3814:1: ( ( ( RULE_ID ) ) )
            // InternalD3ql.g:3815:2: ( ( RULE_ID ) )
            {
            // InternalD3ql.g:3815:2: ( ( RULE_ID ) )
            // InternalD3ql.g:3816:3: ( RULE_ID )
            {
             before(grammarAccess.getFQNAccess().getHeadNamedCrossReference_0_0()); 
            // InternalD3ql.g:3817:3: ( RULE_ID )
            // InternalD3ql.g:3818:4: RULE_ID
            {
             before(grammarAccess.getFQNAccess().getHeadNamedIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFQNAccess().getHeadNamedIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getFQNAccess().getHeadNamedCrossReference_0_0()); 

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
    // $ANTLR end "rule__FQN__HeadAssignment_0"


    // $ANTLR start "rule__FQN__TailAssignment_2"
    // InternalD3ql.g:3829:1: rule__FQN__TailAssignment_2 : ( RULE_ID ) ;
    public final void rule__FQN__TailAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:3833:1: ( ( RULE_ID ) )
            // InternalD3ql.g:3834:2: ( RULE_ID )
            {
            // InternalD3ql.g:3834:2: ( RULE_ID )
            // InternalD3ql.g:3835:3: RULE_ID
            {
             before(grammarAccess.getFQNAccess().getTailIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFQNAccess().getTailIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__FQN__TailAssignment_2"


    // $ANTLR start "rule__FQN__TailAssignment_3_1"
    // InternalD3ql.g:3844:1: rule__FQN__TailAssignment_3_1 : ( RULE_ID ) ;
    public final void rule__FQN__TailAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:3848:1: ( ( RULE_ID ) )
            // InternalD3ql.g:3849:2: ( RULE_ID )
            {
            // InternalD3ql.g:3849:2: ( RULE_ID )
            // InternalD3ql.g:3850:3: RULE_ID
            {
             before(grammarAccess.getFQNAccess().getTailIDTerminalRuleCall_3_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFQNAccess().getTailIDTerminalRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__FQN__TailAssignment_3_1"


    // $ANTLR start "rule__FunctionCall__FunctionAssignment_0"
    // InternalD3ql.g:3859:1: rule__FunctionCall__FunctionAssignment_0 : ( RULE_ID ) ;
    public final void rule__FunctionCall__FunctionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:3863:1: ( ( RULE_ID ) )
            // InternalD3ql.g:3864:2: ( RULE_ID )
            {
            // InternalD3ql.g:3864:2: ( RULE_ID )
            // InternalD3ql.g:3865:3: RULE_ID
            {
             before(grammarAccess.getFunctionCallAccess().getFunctionIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFunctionCallAccess().getFunctionIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__FunctionCall__FunctionAssignment_0"


    // $ANTLR start "rule__FunctionCall__ArgumentsAssignment_2_0"
    // InternalD3ql.g:3874:1: rule__FunctionCall__ArgumentsAssignment_2_0 : ( ruleFunctionArgument ) ;
    public final void rule__FunctionCall__ArgumentsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:3878:1: ( ( ruleFunctionArgument ) )
            // InternalD3ql.g:3879:2: ( ruleFunctionArgument )
            {
            // InternalD3ql.g:3879:2: ( ruleFunctionArgument )
            // InternalD3ql.g:3880:3: ruleFunctionArgument
            {
             before(grammarAccess.getFunctionCallAccess().getArgumentsFunctionArgumentParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleFunctionArgument();

            state._fsp--;

             after(grammarAccess.getFunctionCallAccess().getArgumentsFunctionArgumentParserRuleCall_2_0_0()); 

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
    // $ANTLR end "rule__FunctionCall__ArgumentsAssignment_2_0"


    // $ANTLR start "rule__FunctionCall__ArgumentsAssignment_2_1_1"
    // InternalD3ql.g:3889:1: rule__FunctionCall__ArgumentsAssignment_2_1_1 : ( ruleFunctionArgument ) ;
    public final void rule__FunctionCall__ArgumentsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:3893:1: ( ( ruleFunctionArgument ) )
            // InternalD3ql.g:3894:2: ( ruleFunctionArgument )
            {
            // InternalD3ql.g:3894:2: ( ruleFunctionArgument )
            // InternalD3ql.g:3895:3: ruleFunctionArgument
            {
             before(grammarAccess.getFunctionCallAccess().getArgumentsFunctionArgumentParserRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFunctionArgument();

            state._fsp--;

             after(grammarAccess.getFunctionCallAccess().getArgumentsFunctionArgumentParserRuleCall_2_1_1_0()); 

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
    // $ANTLR end "rule__FunctionCall__ArgumentsAssignment_2_1_1"


    // $ANTLR start "rule__FunctionArgument__ReferenceAssignment_1_0"
    // InternalD3ql.g:3904:1: rule__FunctionArgument__ReferenceAssignment_1_0 : ( ( RULE_ID ) ) ;
    public final void rule__FunctionArgument__ReferenceAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:3908:1: ( ( ( RULE_ID ) ) )
            // InternalD3ql.g:3909:2: ( ( RULE_ID ) )
            {
            // InternalD3ql.g:3909:2: ( ( RULE_ID ) )
            // InternalD3ql.g:3910:3: ( RULE_ID )
            {
             before(grammarAccess.getFunctionArgumentAccess().getReferenceNamedCrossReference_1_0_0()); 
            // InternalD3ql.g:3911:3: ( RULE_ID )
            // InternalD3ql.g:3912:4: RULE_ID
            {
             before(grammarAccess.getFunctionArgumentAccess().getReferenceNamedIDTerminalRuleCall_1_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFunctionArgumentAccess().getReferenceNamedIDTerminalRuleCall_1_0_0_1()); 

            }

             after(grammarAccess.getFunctionArgumentAccess().getReferenceNamedCrossReference_1_0_0()); 

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
    // $ANTLR end "rule__FunctionArgument__ReferenceAssignment_1_0"


    // $ANTLR start "rule__FunctionArgument__FqnAssignment_1_1"
    // InternalD3ql.g:3923:1: rule__FunctionArgument__FqnAssignment_1_1 : ( ruleFQN ) ;
    public final void rule__FunctionArgument__FqnAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:3927:1: ( ( ruleFQN ) )
            // InternalD3ql.g:3928:2: ( ruleFQN )
            {
            // InternalD3ql.g:3928:2: ( ruleFQN )
            // InternalD3ql.g:3929:3: ruleFQN
            {
             before(grammarAccess.getFunctionArgumentAccess().getFqnFQNParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getFunctionArgumentAccess().getFqnFQNParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__FunctionArgument__FqnAssignment_1_1"


    // $ANTLR start "rule__Atomic__ValueAssignment_0_1"
    // InternalD3ql.g:3938:1: rule__Atomic__ValueAssignment_0_1 : ( RULE_INT ) ;
    public final void rule__Atomic__ValueAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:3942:1: ( ( RULE_INT ) )
            // InternalD3ql.g:3943:2: ( RULE_INT )
            {
            // InternalD3ql.g:3943:2: ( RULE_INT )
            // InternalD3ql.g:3944:3: RULE_INT
            {
             before(grammarAccess.getAtomicAccess().getValueINTTerminalRuleCall_0_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getAtomicAccess().getValueINTTerminalRuleCall_0_1_0()); 

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
    // $ANTLR end "rule__Atomic__ValueAssignment_0_1"


    // $ANTLR start "rule__Atomic__ValueAssignment_1_1"
    // InternalD3ql.g:3953:1: rule__Atomic__ValueAssignment_1_1 : ( RULE_STRING ) ;
    public final void rule__Atomic__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:3957:1: ( ( RULE_STRING ) )
            // InternalD3ql.g:3958:2: ( RULE_STRING )
            {
            // InternalD3ql.g:3958:2: ( RULE_STRING )
            // InternalD3ql.g:3959:3: RULE_STRING
            {
             before(grammarAccess.getAtomicAccess().getValueSTRINGTerminalRuleCall_1_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getAtomicAccess().getValueSTRINGTerminalRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__Atomic__ValueAssignment_1_1"


    // $ANTLR start "rule__Atomic__ValueAssignment_2_1"
    // InternalD3ql.g:3968:1: rule__Atomic__ValueAssignment_2_1 : ( ( rule__Atomic__ValueAlternatives_2_1_0 ) ) ;
    public final void rule__Atomic__ValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:3972:1: ( ( ( rule__Atomic__ValueAlternatives_2_1_0 ) ) )
            // InternalD3ql.g:3973:2: ( ( rule__Atomic__ValueAlternatives_2_1_0 ) )
            {
            // InternalD3ql.g:3973:2: ( ( rule__Atomic__ValueAlternatives_2_1_0 ) )
            // InternalD3ql.g:3974:3: ( rule__Atomic__ValueAlternatives_2_1_0 )
            {
             before(grammarAccess.getAtomicAccess().getValueAlternatives_2_1_0()); 
            // InternalD3ql.g:3975:3: ( rule__Atomic__ValueAlternatives_2_1_0 )
            // InternalD3ql.g:3975:4: rule__Atomic__ValueAlternatives_2_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Atomic__ValueAlternatives_2_1_0();

            state._fsp--;


            }

             after(grammarAccess.getAtomicAccess().getValueAlternatives_2_1_0()); 

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
    // $ANTLR end "rule__Atomic__ValueAssignment_2_1"


    // $ANTLR start "rule__Atomic__ValueAssignment_3_1"
    // InternalD3ql.g:3983:1: rule__Atomic__ValueAssignment_3_1 : ( ( 'null' ) ) ;
    public final void rule__Atomic__ValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:3987:1: ( ( ( 'null' ) ) )
            // InternalD3ql.g:3988:2: ( ( 'null' ) )
            {
            // InternalD3ql.g:3988:2: ( ( 'null' ) )
            // InternalD3ql.g:3989:3: ( 'null' )
            {
             before(grammarAccess.getAtomicAccess().getValueNullKeyword_3_1_0()); 
            // InternalD3ql.g:3990:3: ( 'null' )
            // InternalD3ql.g:3991:4: 'null'
            {
             before(grammarAccess.getAtomicAccess().getValueNullKeyword_3_1_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getAtomicAccess().getValueNullKeyword_3_1_0()); 

            }

             after(grammarAccess.getAtomicAccess().getValueNullKeyword_3_1_0()); 

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
    // $ANTLR end "rule__Atomic__ValueAssignment_3_1"


    // $ANTLR start "rule__Atomic__ValueAssignment_4_2"
    // InternalD3ql.g:4002:1: rule__Atomic__ValueAssignment_4_2 : ( RULE_ID ) ;
    public final void rule__Atomic__ValueAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:4006:1: ( ( RULE_ID ) )
            // InternalD3ql.g:4007:2: ( RULE_ID )
            {
            // InternalD3ql.g:4007:2: ( RULE_ID )
            // InternalD3ql.g:4008:3: RULE_ID
            {
             before(grammarAccess.getAtomicAccess().getValueIDTerminalRuleCall_4_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAtomicAccess().getValueIDTerminalRuleCall_4_2_0()); 

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
    // $ANTLR end "rule__Atomic__ValueAssignment_4_2"


    // $ANTLR start "rule__Atomic__ValueAssignment_5_1"
    // InternalD3ql.g:4017:1: rule__Atomic__ValueAssignment_5_1 : ( ( RULE_ID ) ) ;
    public final void rule__Atomic__ValueAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:4021:1: ( ( ( RULE_ID ) ) )
            // InternalD3ql.g:4022:2: ( ( RULE_ID ) )
            {
            // InternalD3ql.g:4022:2: ( ( RULE_ID ) )
            // InternalD3ql.g:4023:3: ( RULE_ID )
            {
             before(grammarAccess.getAtomicAccess().getValueNamedCrossReference_5_1_0()); 
            // InternalD3ql.g:4024:3: ( RULE_ID )
            // InternalD3ql.g:4025:4: RULE_ID
            {
             before(grammarAccess.getAtomicAccess().getValueNamedIDTerminalRuleCall_5_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAtomicAccess().getValueNamedIDTerminalRuleCall_5_1_0_1()); 

            }

             after(grammarAccess.getAtomicAccess().getValueNamedCrossReference_5_1_0()); 

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
    // $ANTLR end "rule__Atomic__ValueAssignment_5_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000200000010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000012A80C0070L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000001802L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000C0003E000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000C0003E002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x000000000003E000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000010200000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000010000010L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000100000000L});

}