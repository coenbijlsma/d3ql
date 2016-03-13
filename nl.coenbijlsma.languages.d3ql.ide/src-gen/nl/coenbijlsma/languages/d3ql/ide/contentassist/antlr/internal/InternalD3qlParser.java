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


    // $ANTLR start "entryRuleAggregateRoot"
    // InternalD3ql.g:103:1: entryRuleAggregateRoot : ruleAggregateRoot EOF ;
    public final void entryRuleAggregateRoot() throws RecognitionException {
        try {
            // InternalD3ql.g:104:1: ( ruleAggregateRoot EOF )
            // InternalD3ql.g:105:1: ruleAggregateRoot EOF
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
    // InternalD3ql.g:112:1: ruleAggregateRoot : ( ( rule__AggregateRoot__Group__0 ) ) ;
    public final void ruleAggregateRoot() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:116:2: ( ( ( rule__AggregateRoot__Group__0 ) ) )
            // InternalD3ql.g:117:2: ( ( rule__AggregateRoot__Group__0 ) )
            {
            // InternalD3ql.g:117:2: ( ( rule__AggregateRoot__Group__0 ) )
            // InternalD3ql.g:118:3: ( rule__AggregateRoot__Group__0 )
            {
             before(grammarAccess.getAggregateRootAccess().getGroup()); 
            // InternalD3ql.g:119:3: ( rule__AggregateRoot__Group__0 )
            // InternalD3ql.g:119:4: rule__AggregateRoot__Group__0
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
    // InternalD3ql.g:128:1: entryRuleAlias : ruleAlias EOF ;
    public final void entryRuleAlias() throws RecognitionException {
        try {
            // InternalD3ql.g:129:1: ( ruleAlias EOF )
            // InternalD3ql.g:130:1: ruleAlias EOF
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
    // InternalD3ql.g:137:1: ruleAlias : ( ( rule__Alias__NameAssignment ) ) ;
    public final void ruleAlias() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:141:2: ( ( ( rule__Alias__NameAssignment ) ) )
            // InternalD3ql.g:142:2: ( ( rule__Alias__NameAssignment ) )
            {
            // InternalD3ql.g:142:2: ( ( rule__Alias__NameAssignment ) )
            // InternalD3ql.g:143:3: ( rule__Alias__NameAssignment )
            {
             before(grammarAccess.getAliasAccess().getNameAssignment()); 
            // InternalD3ql.g:144:3: ( rule__Alias__NameAssignment )
            // InternalD3ql.g:144:4: rule__Alias__NameAssignment
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


    // $ANTLR start "entryRuleSelectStatement"
    // InternalD3ql.g:153:1: entryRuleSelectStatement : ruleSelectStatement EOF ;
    public final void entryRuleSelectStatement() throws RecognitionException {
        try {
            // InternalD3ql.g:154:1: ( ruleSelectStatement EOF )
            // InternalD3ql.g:155:1: ruleSelectStatement EOF
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
    // InternalD3ql.g:162:1: ruleSelectStatement : ( ( rule__SelectStatement__Group__0 ) ) ;
    public final void ruleSelectStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:166:2: ( ( ( rule__SelectStatement__Group__0 ) ) )
            // InternalD3ql.g:167:2: ( ( rule__SelectStatement__Group__0 ) )
            {
            // InternalD3ql.g:167:2: ( ( rule__SelectStatement__Group__0 ) )
            // InternalD3ql.g:168:3: ( rule__SelectStatement__Group__0 )
            {
             before(grammarAccess.getSelectStatementAccess().getGroup()); 
            // InternalD3ql.g:169:3: ( rule__SelectStatement__Group__0 )
            // InternalD3ql.g:169:4: rule__SelectStatement__Group__0
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


    // $ANTLR start "entryRulePathExpression"
    // InternalD3ql.g:178:1: entryRulePathExpression : rulePathExpression EOF ;
    public final void entryRulePathExpression() throws RecognitionException {
        try {
            // InternalD3ql.g:179:1: ( rulePathExpression EOF )
            // InternalD3ql.g:180:1: rulePathExpression EOF
            {
             before(grammarAccess.getPathExpressionRule()); 
            pushFollow(FOLLOW_1);
            rulePathExpression();

            state._fsp--;

             after(grammarAccess.getPathExpressionRule()); 
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
    // $ANTLR end "entryRulePathExpression"


    // $ANTLR start "rulePathExpression"
    // InternalD3ql.g:187:1: rulePathExpression : ( ( rule__PathExpression__Group__0 ) ) ;
    public final void rulePathExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:191:2: ( ( ( rule__PathExpression__Group__0 ) ) )
            // InternalD3ql.g:192:2: ( ( rule__PathExpression__Group__0 ) )
            {
            // InternalD3ql.g:192:2: ( ( rule__PathExpression__Group__0 ) )
            // InternalD3ql.g:193:3: ( rule__PathExpression__Group__0 )
            {
             before(grammarAccess.getPathExpressionAccess().getGroup()); 
            // InternalD3ql.g:194:3: ( rule__PathExpression__Group__0 )
            // InternalD3ql.g:194:4: rule__PathExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PathExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPathExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePathExpression"


    // $ANTLR start "entryRulePathElement"
    // InternalD3ql.g:203:1: entryRulePathElement : rulePathElement EOF ;
    public final void entryRulePathElement() throws RecognitionException {
        try {
            // InternalD3ql.g:204:1: ( rulePathElement EOF )
            // InternalD3ql.g:205:1: rulePathElement EOF
            {
             before(grammarAccess.getPathElementRule()); 
            pushFollow(FOLLOW_1);
            rulePathElement();

            state._fsp--;

             after(grammarAccess.getPathElementRule()); 
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
    // $ANTLR end "entryRulePathElement"


    // $ANTLR start "rulePathElement"
    // InternalD3ql.g:212:1: rulePathElement : ( ( rule__PathElement__NameAssignment ) ) ;
    public final void rulePathElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:216:2: ( ( ( rule__PathElement__NameAssignment ) ) )
            // InternalD3ql.g:217:2: ( ( rule__PathElement__NameAssignment ) )
            {
            // InternalD3ql.g:217:2: ( ( rule__PathElement__NameAssignment ) )
            // InternalD3ql.g:218:3: ( rule__PathElement__NameAssignment )
            {
             before(grammarAccess.getPathElementAccess().getNameAssignment()); 
            // InternalD3ql.g:219:3: ( rule__PathElement__NameAssignment )
            // InternalD3ql.g:219:4: rule__PathElement__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__PathElement__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getPathElementAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePathElement"


    // $ANTLR start "rule__Query__Group__0"
    // InternalD3ql.g:227:1: rule__Query__Group__0 : rule__Query__Group__0__Impl rule__Query__Group__1 ;
    public final void rule__Query__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:231:1: ( rule__Query__Group__0__Impl rule__Query__Group__1 )
            // InternalD3ql.g:232:2: rule__Query__Group__0__Impl rule__Query__Group__1
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
    // InternalD3ql.g:239:1: rule__Query__Group__0__Impl : ( ( rule__Query__FromStatementAssignment_0 ) ) ;
    public final void rule__Query__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:243:1: ( ( ( rule__Query__FromStatementAssignment_0 ) ) )
            // InternalD3ql.g:244:1: ( ( rule__Query__FromStatementAssignment_0 ) )
            {
            // InternalD3ql.g:244:1: ( ( rule__Query__FromStatementAssignment_0 ) )
            // InternalD3ql.g:245:2: ( rule__Query__FromStatementAssignment_0 )
            {
             before(grammarAccess.getQueryAccess().getFromStatementAssignment_0()); 
            // InternalD3ql.g:246:2: ( rule__Query__FromStatementAssignment_0 )
            // InternalD3ql.g:246:3: rule__Query__FromStatementAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Query__FromStatementAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getQueryAccess().getFromStatementAssignment_0()); 

            }


            }

        }
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
    // InternalD3ql.g:254:1: rule__Query__Group__1 : rule__Query__Group__1__Impl ;
    public final void rule__Query__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:258:1: ( rule__Query__Group__1__Impl )
            // InternalD3ql.g:259:2: rule__Query__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Query__Group__1__Impl();

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
    // InternalD3ql.g:265:1: rule__Query__Group__1__Impl : ( ( rule__Query__SelectStatementAssignment_1 ) ) ;
    public final void rule__Query__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:269:1: ( ( ( rule__Query__SelectStatementAssignment_1 ) ) )
            // InternalD3ql.g:270:1: ( ( rule__Query__SelectStatementAssignment_1 ) )
            {
            // InternalD3ql.g:270:1: ( ( rule__Query__SelectStatementAssignment_1 ) )
            // InternalD3ql.g:271:2: ( rule__Query__SelectStatementAssignment_1 )
            {
             before(grammarAccess.getQueryAccess().getSelectStatementAssignment_1()); 
            // InternalD3ql.g:272:2: ( rule__Query__SelectStatementAssignment_1 )
            // InternalD3ql.g:272:3: rule__Query__SelectStatementAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Query__SelectStatementAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getQueryAccess().getSelectStatementAssignment_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__FromStatement__Group__0"
    // InternalD3ql.g:281:1: rule__FromStatement__Group__0 : rule__FromStatement__Group__0__Impl rule__FromStatement__Group__1 ;
    public final void rule__FromStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:285:1: ( rule__FromStatement__Group__0__Impl rule__FromStatement__Group__1 )
            // InternalD3ql.g:286:2: rule__FromStatement__Group__0__Impl rule__FromStatement__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalD3ql.g:293:1: rule__FromStatement__Group__0__Impl : ( 'from' ) ;
    public final void rule__FromStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:297:1: ( ( 'from' ) )
            // InternalD3ql.g:298:1: ( 'from' )
            {
            // InternalD3ql.g:298:1: ( 'from' )
            // InternalD3ql.g:299:2: 'from'
            {
             before(grammarAccess.getFromStatementAccess().getFromKeyword_0()); 
            match(input,11,FOLLOW_2); 
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
    // InternalD3ql.g:308:1: rule__FromStatement__Group__1 : rule__FromStatement__Group__1__Impl rule__FromStatement__Group__2 ;
    public final void rule__FromStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:312:1: ( rule__FromStatement__Group__1__Impl rule__FromStatement__Group__2 )
            // InternalD3ql.g:313:2: rule__FromStatement__Group__1__Impl rule__FromStatement__Group__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalD3ql.g:320:1: rule__FromStatement__Group__1__Impl : ( ( rule__FromStatement__AggregatesAssignment_1 ) ) ;
    public final void rule__FromStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:324:1: ( ( ( rule__FromStatement__AggregatesAssignment_1 ) ) )
            // InternalD3ql.g:325:1: ( ( rule__FromStatement__AggregatesAssignment_1 ) )
            {
            // InternalD3ql.g:325:1: ( ( rule__FromStatement__AggregatesAssignment_1 ) )
            // InternalD3ql.g:326:2: ( rule__FromStatement__AggregatesAssignment_1 )
            {
             before(grammarAccess.getFromStatementAccess().getAggregatesAssignment_1()); 
            // InternalD3ql.g:327:2: ( rule__FromStatement__AggregatesAssignment_1 )
            // InternalD3ql.g:327:3: rule__FromStatement__AggregatesAssignment_1
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
    // InternalD3ql.g:335:1: rule__FromStatement__Group__2 : rule__FromStatement__Group__2__Impl ;
    public final void rule__FromStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:339:1: ( rule__FromStatement__Group__2__Impl )
            // InternalD3ql.g:340:2: rule__FromStatement__Group__2__Impl
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
    // InternalD3ql.g:346:1: rule__FromStatement__Group__2__Impl : ( ( rule__FromStatement__Group_2__0 )* ) ;
    public final void rule__FromStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:350:1: ( ( ( rule__FromStatement__Group_2__0 )* ) )
            // InternalD3ql.g:351:1: ( ( rule__FromStatement__Group_2__0 )* )
            {
            // InternalD3ql.g:351:1: ( ( rule__FromStatement__Group_2__0 )* )
            // InternalD3ql.g:352:2: ( rule__FromStatement__Group_2__0 )*
            {
             before(grammarAccess.getFromStatementAccess().getGroup_2()); 
            // InternalD3ql.g:353:2: ( rule__FromStatement__Group_2__0 )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalD3ql.g:353:3: rule__FromStatement__Group_2__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__FromStatement__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
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
    // InternalD3ql.g:362:1: rule__FromStatement__Group_2__0 : rule__FromStatement__Group_2__0__Impl rule__FromStatement__Group_2__1 ;
    public final void rule__FromStatement__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:366:1: ( rule__FromStatement__Group_2__0__Impl rule__FromStatement__Group_2__1 )
            // InternalD3ql.g:367:2: rule__FromStatement__Group_2__0__Impl rule__FromStatement__Group_2__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalD3ql.g:374:1: rule__FromStatement__Group_2__0__Impl : ( ',' ) ;
    public final void rule__FromStatement__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:378:1: ( ( ',' ) )
            // InternalD3ql.g:379:1: ( ',' )
            {
            // InternalD3ql.g:379:1: ( ',' )
            // InternalD3ql.g:380:2: ','
            {
             before(grammarAccess.getFromStatementAccess().getCommaKeyword_2_0()); 
            match(input,12,FOLLOW_2); 
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
    // InternalD3ql.g:389:1: rule__FromStatement__Group_2__1 : rule__FromStatement__Group_2__1__Impl ;
    public final void rule__FromStatement__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:393:1: ( rule__FromStatement__Group_2__1__Impl )
            // InternalD3ql.g:394:2: rule__FromStatement__Group_2__1__Impl
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
    // InternalD3ql.g:400:1: rule__FromStatement__Group_2__1__Impl : ( ( rule__FromStatement__AggregatesAssignment_2_1 ) ) ;
    public final void rule__FromStatement__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:404:1: ( ( ( rule__FromStatement__AggregatesAssignment_2_1 ) ) )
            // InternalD3ql.g:405:1: ( ( rule__FromStatement__AggregatesAssignment_2_1 ) )
            {
            // InternalD3ql.g:405:1: ( ( rule__FromStatement__AggregatesAssignment_2_1 ) )
            // InternalD3ql.g:406:2: ( rule__FromStatement__AggregatesAssignment_2_1 )
            {
             before(grammarAccess.getFromStatementAccess().getAggregatesAssignment_2_1()); 
            // InternalD3ql.g:407:2: ( rule__FromStatement__AggregatesAssignment_2_1 )
            // InternalD3ql.g:407:3: rule__FromStatement__AggregatesAssignment_2_1
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


    // $ANTLR start "rule__AggregateRoot__Group__0"
    // InternalD3ql.g:416:1: rule__AggregateRoot__Group__0 : rule__AggregateRoot__Group__0__Impl rule__AggregateRoot__Group__1 ;
    public final void rule__AggregateRoot__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:420:1: ( rule__AggregateRoot__Group__0__Impl rule__AggregateRoot__Group__1 )
            // InternalD3ql.g:421:2: rule__AggregateRoot__Group__0__Impl rule__AggregateRoot__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalD3ql.g:428:1: rule__AggregateRoot__Group__0__Impl : ( ( rule__AggregateRoot__NameAssignment_0 ) ) ;
    public final void rule__AggregateRoot__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:432:1: ( ( ( rule__AggregateRoot__NameAssignment_0 ) ) )
            // InternalD3ql.g:433:1: ( ( rule__AggregateRoot__NameAssignment_0 ) )
            {
            // InternalD3ql.g:433:1: ( ( rule__AggregateRoot__NameAssignment_0 ) )
            // InternalD3ql.g:434:2: ( rule__AggregateRoot__NameAssignment_0 )
            {
             before(grammarAccess.getAggregateRootAccess().getNameAssignment_0()); 
            // InternalD3ql.g:435:2: ( rule__AggregateRoot__NameAssignment_0 )
            // InternalD3ql.g:435:3: rule__AggregateRoot__NameAssignment_0
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
    // InternalD3ql.g:443:1: rule__AggregateRoot__Group__1 : rule__AggregateRoot__Group__1__Impl ;
    public final void rule__AggregateRoot__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:447:1: ( rule__AggregateRoot__Group__1__Impl )
            // InternalD3ql.g:448:2: rule__AggregateRoot__Group__1__Impl
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
    // InternalD3ql.g:454:1: rule__AggregateRoot__Group__1__Impl : ( ( rule__AggregateRoot__Group_1__0 )? ) ;
    public final void rule__AggregateRoot__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:458:1: ( ( ( rule__AggregateRoot__Group_1__0 )? ) )
            // InternalD3ql.g:459:1: ( ( rule__AggregateRoot__Group_1__0 )? )
            {
            // InternalD3ql.g:459:1: ( ( rule__AggregateRoot__Group_1__0 )? )
            // InternalD3ql.g:460:2: ( rule__AggregateRoot__Group_1__0 )?
            {
             before(grammarAccess.getAggregateRootAccess().getGroup_1()); 
            // InternalD3ql.g:461:2: ( rule__AggregateRoot__Group_1__0 )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalD3ql.g:461:3: rule__AggregateRoot__Group_1__0
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
    // InternalD3ql.g:470:1: rule__AggregateRoot__Group_1__0 : rule__AggregateRoot__Group_1__0__Impl rule__AggregateRoot__Group_1__1 ;
    public final void rule__AggregateRoot__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:474:1: ( rule__AggregateRoot__Group_1__0__Impl rule__AggregateRoot__Group_1__1 )
            // InternalD3ql.g:475:2: rule__AggregateRoot__Group_1__0__Impl rule__AggregateRoot__Group_1__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalD3ql.g:482:1: rule__AggregateRoot__Group_1__0__Impl : ( 'as' ) ;
    public final void rule__AggregateRoot__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:486:1: ( ( 'as' ) )
            // InternalD3ql.g:487:1: ( 'as' )
            {
            // InternalD3ql.g:487:1: ( 'as' )
            // InternalD3ql.g:488:2: 'as'
            {
             before(grammarAccess.getAggregateRootAccess().getAsKeyword_1_0()); 
            match(input,13,FOLLOW_2); 
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
    // InternalD3ql.g:497:1: rule__AggregateRoot__Group_1__1 : rule__AggregateRoot__Group_1__1__Impl ;
    public final void rule__AggregateRoot__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:501:1: ( rule__AggregateRoot__Group_1__1__Impl )
            // InternalD3ql.g:502:2: rule__AggregateRoot__Group_1__1__Impl
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
    // InternalD3ql.g:508:1: rule__AggregateRoot__Group_1__1__Impl : ( ( rule__AggregateRoot__AliasAssignment_1_1 ) ) ;
    public final void rule__AggregateRoot__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:512:1: ( ( ( rule__AggregateRoot__AliasAssignment_1_1 ) ) )
            // InternalD3ql.g:513:1: ( ( rule__AggregateRoot__AliasAssignment_1_1 ) )
            {
            // InternalD3ql.g:513:1: ( ( rule__AggregateRoot__AliasAssignment_1_1 ) )
            // InternalD3ql.g:514:2: ( rule__AggregateRoot__AliasAssignment_1_1 )
            {
             before(grammarAccess.getAggregateRootAccess().getAliasAssignment_1_1()); 
            // InternalD3ql.g:515:2: ( rule__AggregateRoot__AliasAssignment_1_1 )
            // InternalD3ql.g:515:3: rule__AggregateRoot__AliasAssignment_1_1
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


    // $ANTLR start "rule__SelectStatement__Group__0"
    // InternalD3ql.g:524:1: rule__SelectStatement__Group__0 : rule__SelectStatement__Group__0__Impl rule__SelectStatement__Group__1 ;
    public final void rule__SelectStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:528:1: ( rule__SelectStatement__Group__0__Impl rule__SelectStatement__Group__1 )
            // InternalD3ql.g:529:2: rule__SelectStatement__Group__0__Impl rule__SelectStatement__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalD3ql.g:536:1: rule__SelectStatement__Group__0__Impl : ( 'select' ) ;
    public final void rule__SelectStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:540:1: ( ( 'select' ) )
            // InternalD3ql.g:541:1: ( 'select' )
            {
            // InternalD3ql.g:541:1: ( 'select' )
            // InternalD3ql.g:542:2: 'select'
            {
             before(grammarAccess.getSelectStatementAccess().getSelectKeyword_0()); 
            match(input,14,FOLLOW_2); 
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
    // InternalD3ql.g:551:1: rule__SelectStatement__Group__1 : rule__SelectStatement__Group__1__Impl rule__SelectStatement__Group__2 ;
    public final void rule__SelectStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:555:1: ( rule__SelectStatement__Group__1__Impl rule__SelectStatement__Group__2 )
            // InternalD3ql.g:556:2: rule__SelectStatement__Group__1__Impl rule__SelectStatement__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__SelectStatement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelectStatement__Group__2();

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
    // InternalD3ql.g:563:1: rule__SelectStatement__Group__1__Impl : ( ( rule__SelectStatement__PathsAssignment_1 ) ) ;
    public final void rule__SelectStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:567:1: ( ( ( rule__SelectStatement__PathsAssignment_1 ) ) )
            // InternalD3ql.g:568:1: ( ( rule__SelectStatement__PathsAssignment_1 ) )
            {
            // InternalD3ql.g:568:1: ( ( rule__SelectStatement__PathsAssignment_1 ) )
            // InternalD3ql.g:569:2: ( rule__SelectStatement__PathsAssignment_1 )
            {
             before(grammarAccess.getSelectStatementAccess().getPathsAssignment_1()); 
            // InternalD3ql.g:570:2: ( rule__SelectStatement__PathsAssignment_1 )
            // InternalD3ql.g:570:3: rule__SelectStatement__PathsAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SelectStatement__PathsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSelectStatementAccess().getPathsAssignment_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__SelectStatement__Group__2"
    // InternalD3ql.g:578:1: rule__SelectStatement__Group__2 : rule__SelectStatement__Group__2__Impl ;
    public final void rule__SelectStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:582:1: ( rule__SelectStatement__Group__2__Impl )
            // InternalD3ql.g:583:2: rule__SelectStatement__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SelectStatement__Group__2__Impl();

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
    // $ANTLR end "rule__SelectStatement__Group__2"


    // $ANTLR start "rule__SelectStatement__Group__2__Impl"
    // InternalD3ql.g:589:1: rule__SelectStatement__Group__2__Impl : ( ( rule__SelectStatement__Group_2__0 )* ) ;
    public final void rule__SelectStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:593:1: ( ( ( rule__SelectStatement__Group_2__0 )* ) )
            // InternalD3ql.g:594:1: ( ( rule__SelectStatement__Group_2__0 )* )
            {
            // InternalD3ql.g:594:1: ( ( rule__SelectStatement__Group_2__0 )* )
            // InternalD3ql.g:595:2: ( rule__SelectStatement__Group_2__0 )*
            {
             before(grammarAccess.getSelectStatementAccess().getGroup_2()); 
            // InternalD3ql.g:596:2: ( rule__SelectStatement__Group_2__0 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==12) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalD3ql.g:596:3: rule__SelectStatement__Group_2__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__SelectStatement__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getSelectStatementAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectStatement__Group__2__Impl"


    // $ANTLR start "rule__SelectStatement__Group_2__0"
    // InternalD3ql.g:605:1: rule__SelectStatement__Group_2__0 : rule__SelectStatement__Group_2__0__Impl rule__SelectStatement__Group_2__1 ;
    public final void rule__SelectStatement__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:609:1: ( rule__SelectStatement__Group_2__0__Impl rule__SelectStatement__Group_2__1 )
            // InternalD3ql.g:610:2: rule__SelectStatement__Group_2__0__Impl rule__SelectStatement__Group_2__1
            {
            pushFollow(FOLLOW_4);
            rule__SelectStatement__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelectStatement__Group_2__1();

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
    // $ANTLR end "rule__SelectStatement__Group_2__0"


    // $ANTLR start "rule__SelectStatement__Group_2__0__Impl"
    // InternalD3ql.g:617:1: rule__SelectStatement__Group_2__0__Impl : ( ',' ) ;
    public final void rule__SelectStatement__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:621:1: ( ( ',' ) )
            // InternalD3ql.g:622:1: ( ',' )
            {
            // InternalD3ql.g:622:1: ( ',' )
            // InternalD3ql.g:623:2: ','
            {
             before(grammarAccess.getSelectStatementAccess().getCommaKeyword_2_0()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getSelectStatementAccess().getCommaKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectStatement__Group_2__0__Impl"


    // $ANTLR start "rule__SelectStatement__Group_2__1"
    // InternalD3ql.g:632:1: rule__SelectStatement__Group_2__1 : rule__SelectStatement__Group_2__1__Impl ;
    public final void rule__SelectStatement__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:636:1: ( rule__SelectStatement__Group_2__1__Impl )
            // InternalD3ql.g:637:2: rule__SelectStatement__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SelectStatement__Group_2__1__Impl();

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
    // $ANTLR end "rule__SelectStatement__Group_2__1"


    // $ANTLR start "rule__SelectStatement__Group_2__1__Impl"
    // InternalD3ql.g:643:1: rule__SelectStatement__Group_2__1__Impl : ( ( rule__SelectStatement__PathsAssignment_2_1 ) ) ;
    public final void rule__SelectStatement__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:647:1: ( ( ( rule__SelectStatement__PathsAssignment_2_1 ) ) )
            // InternalD3ql.g:648:1: ( ( rule__SelectStatement__PathsAssignment_2_1 ) )
            {
            // InternalD3ql.g:648:1: ( ( rule__SelectStatement__PathsAssignment_2_1 ) )
            // InternalD3ql.g:649:2: ( rule__SelectStatement__PathsAssignment_2_1 )
            {
             before(grammarAccess.getSelectStatementAccess().getPathsAssignment_2_1()); 
            // InternalD3ql.g:650:2: ( rule__SelectStatement__PathsAssignment_2_1 )
            // InternalD3ql.g:650:3: rule__SelectStatement__PathsAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__SelectStatement__PathsAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getSelectStatementAccess().getPathsAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectStatement__Group_2__1__Impl"


    // $ANTLR start "rule__PathExpression__Group__0"
    // InternalD3ql.g:659:1: rule__PathExpression__Group__0 : rule__PathExpression__Group__0__Impl rule__PathExpression__Group__1 ;
    public final void rule__PathExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:663:1: ( rule__PathExpression__Group__0__Impl rule__PathExpression__Group__1 )
            // InternalD3ql.g:664:2: rule__PathExpression__Group__0__Impl rule__PathExpression__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__PathExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PathExpression__Group__1();

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
    // $ANTLR end "rule__PathExpression__Group__0"


    // $ANTLR start "rule__PathExpression__Group__0__Impl"
    // InternalD3ql.g:671:1: rule__PathExpression__Group__0__Impl : ( ( rule__PathExpression__HeadAssignment_0 ) ) ;
    public final void rule__PathExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:675:1: ( ( ( rule__PathExpression__HeadAssignment_0 ) ) )
            // InternalD3ql.g:676:1: ( ( rule__PathExpression__HeadAssignment_0 ) )
            {
            // InternalD3ql.g:676:1: ( ( rule__PathExpression__HeadAssignment_0 ) )
            // InternalD3ql.g:677:2: ( rule__PathExpression__HeadAssignment_0 )
            {
             before(grammarAccess.getPathExpressionAccess().getHeadAssignment_0()); 
            // InternalD3ql.g:678:2: ( rule__PathExpression__HeadAssignment_0 )
            // InternalD3ql.g:678:3: rule__PathExpression__HeadAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__PathExpression__HeadAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getPathExpressionAccess().getHeadAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PathExpression__Group__0__Impl"


    // $ANTLR start "rule__PathExpression__Group__1"
    // InternalD3ql.g:686:1: rule__PathExpression__Group__1 : rule__PathExpression__Group__1__Impl rule__PathExpression__Group__2 ;
    public final void rule__PathExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:690:1: ( rule__PathExpression__Group__1__Impl rule__PathExpression__Group__2 )
            // InternalD3ql.g:691:2: rule__PathExpression__Group__1__Impl rule__PathExpression__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__PathExpression__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PathExpression__Group__2();

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
    // $ANTLR end "rule__PathExpression__Group__1"


    // $ANTLR start "rule__PathExpression__Group__1__Impl"
    // InternalD3ql.g:698:1: rule__PathExpression__Group__1__Impl : ( '.' ) ;
    public final void rule__PathExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:702:1: ( ( '.' ) )
            // InternalD3ql.g:703:1: ( '.' )
            {
            // InternalD3ql.g:703:1: ( '.' )
            // InternalD3ql.g:704:2: '.'
            {
             before(grammarAccess.getPathExpressionAccess().getFullStopKeyword_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getPathExpressionAccess().getFullStopKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PathExpression__Group__1__Impl"


    // $ANTLR start "rule__PathExpression__Group__2"
    // InternalD3ql.g:713:1: rule__PathExpression__Group__2 : rule__PathExpression__Group__2__Impl rule__PathExpression__Group__3 ;
    public final void rule__PathExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:717:1: ( rule__PathExpression__Group__2__Impl rule__PathExpression__Group__3 )
            // InternalD3ql.g:718:2: rule__PathExpression__Group__2__Impl rule__PathExpression__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__PathExpression__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PathExpression__Group__3();

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
    // $ANTLR end "rule__PathExpression__Group__2"


    // $ANTLR start "rule__PathExpression__Group__2__Impl"
    // InternalD3ql.g:725:1: rule__PathExpression__Group__2__Impl : ( ( rule__PathExpression__Group_2__0 )* ) ;
    public final void rule__PathExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:729:1: ( ( ( rule__PathExpression__Group_2__0 )* ) )
            // InternalD3ql.g:730:1: ( ( rule__PathExpression__Group_2__0 )* )
            {
            // InternalD3ql.g:730:1: ( ( rule__PathExpression__Group_2__0 )* )
            // InternalD3ql.g:731:2: ( rule__PathExpression__Group_2__0 )*
            {
             before(grammarAccess.getPathExpressionAccess().getGroup_2()); 
            // InternalD3ql.g:732:2: ( rule__PathExpression__Group_2__0 )*
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
            	    // InternalD3ql.g:732:3: rule__PathExpression__Group_2__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__PathExpression__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getPathExpressionAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PathExpression__Group__2__Impl"


    // $ANTLR start "rule__PathExpression__Group__3"
    // InternalD3ql.g:740:1: rule__PathExpression__Group__3 : rule__PathExpression__Group__3__Impl ;
    public final void rule__PathExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:744:1: ( rule__PathExpression__Group__3__Impl )
            // InternalD3ql.g:745:2: rule__PathExpression__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PathExpression__Group__3__Impl();

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
    // $ANTLR end "rule__PathExpression__Group__3"


    // $ANTLR start "rule__PathExpression__Group__3__Impl"
    // InternalD3ql.g:751:1: rule__PathExpression__Group__3__Impl : ( ( rule__PathExpression__TailAssignment_3 ) ) ;
    public final void rule__PathExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:755:1: ( ( ( rule__PathExpression__TailAssignment_3 ) ) )
            // InternalD3ql.g:756:1: ( ( rule__PathExpression__TailAssignment_3 ) )
            {
            // InternalD3ql.g:756:1: ( ( rule__PathExpression__TailAssignment_3 ) )
            // InternalD3ql.g:757:2: ( rule__PathExpression__TailAssignment_3 )
            {
             before(grammarAccess.getPathExpressionAccess().getTailAssignment_3()); 
            // InternalD3ql.g:758:2: ( rule__PathExpression__TailAssignment_3 )
            // InternalD3ql.g:758:3: rule__PathExpression__TailAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__PathExpression__TailAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getPathExpressionAccess().getTailAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PathExpression__Group__3__Impl"


    // $ANTLR start "rule__PathExpression__Group_2__0"
    // InternalD3ql.g:767:1: rule__PathExpression__Group_2__0 : rule__PathExpression__Group_2__0__Impl rule__PathExpression__Group_2__1 ;
    public final void rule__PathExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:771:1: ( rule__PathExpression__Group_2__0__Impl rule__PathExpression__Group_2__1 )
            // InternalD3ql.g:772:2: rule__PathExpression__Group_2__0__Impl rule__PathExpression__Group_2__1
            {
            pushFollow(FOLLOW_8);
            rule__PathExpression__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PathExpression__Group_2__1();

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
    // $ANTLR end "rule__PathExpression__Group_2__0"


    // $ANTLR start "rule__PathExpression__Group_2__0__Impl"
    // InternalD3ql.g:779:1: rule__PathExpression__Group_2__0__Impl : ( ( rule__PathExpression__TailAssignment_2_0 ) ) ;
    public final void rule__PathExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:783:1: ( ( ( rule__PathExpression__TailAssignment_2_0 ) ) )
            // InternalD3ql.g:784:1: ( ( rule__PathExpression__TailAssignment_2_0 ) )
            {
            // InternalD3ql.g:784:1: ( ( rule__PathExpression__TailAssignment_2_0 ) )
            // InternalD3ql.g:785:2: ( rule__PathExpression__TailAssignment_2_0 )
            {
             before(grammarAccess.getPathExpressionAccess().getTailAssignment_2_0()); 
            // InternalD3ql.g:786:2: ( rule__PathExpression__TailAssignment_2_0 )
            // InternalD3ql.g:786:3: rule__PathExpression__TailAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__PathExpression__TailAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getPathExpressionAccess().getTailAssignment_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PathExpression__Group_2__0__Impl"


    // $ANTLR start "rule__PathExpression__Group_2__1"
    // InternalD3ql.g:794:1: rule__PathExpression__Group_2__1 : rule__PathExpression__Group_2__1__Impl ;
    public final void rule__PathExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:798:1: ( rule__PathExpression__Group_2__1__Impl )
            // InternalD3ql.g:799:2: rule__PathExpression__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PathExpression__Group_2__1__Impl();

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
    // $ANTLR end "rule__PathExpression__Group_2__1"


    // $ANTLR start "rule__PathExpression__Group_2__1__Impl"
    // InternalD3ql.g:805:1: rule__PathExpression__Group_2__1__Impl : ( '.' ) ;
    public final void rule__PathExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:809:1: ( ( '.' ) )
            // InternalD3ql.g:810:1: ( '.' )
            {
            // InternalD3ql.g:810:1: ( '.' )
            // InternalD3ql.g:811:2: '.'
            {
             before(grammarAccess.getPathExpressionAccess().getFullStopKeyword_2_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getPathExpressionAccess().getFullStopKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PathExpression__Group_2__1__Impl"


    // $ANTLR start "rule__Query__FromStatementAssignment_0"
    // InternalD3ql.g:821:1: rule__Query__FromStatementAssignment_0 : ( ruleFromStatement ) ;
    public final void rule__Query__FromStatementAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:825:1: ( ( ruleFromStatement ) )
            // InternalD3ql.g:826:2: ( ruleFromStatement )
            {
            // InternalD3ql.g:826:2: ( ruleFromStatement )
            // InternalD3ql.g:827:3: ruleFromStatement
            {
             before(grammarAccess.getQueryAccess().getFromStatementFromStatementParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleFromStatement();

            state._fsp--;

             after(grammarAccess.getQueryAccess().getFromStatementFromStatementParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__FromStatementAssignment_0"


    // $ANTLR start "rule__Query__SelectStatementAssignment_1"
    // InternalD3ql.g:836:1: rule__Query__SelectStatementAssignment_1 : ( ruleSelectStatement ) ;
    public final void rule__Query__SelectStatementAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:840:1: ( ( ruleSelectStatement ) )
            // InternalD3ql.g:841:2: ( ruleSelectStatement )
            {
            // InternalD3ql.g:841:2: ( ruleSelectStatement )
            // InternalD3ql.g:842:3: ruleSelectStatement
            {
             before(grammarAccess.getQueryAccess().getSelectStatementSelectStatementParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSelectStatement();

            state._fsp--;

             after(grammarAccess.getQueryAccess().getSelectStatementSelectStatementParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__SelectStatementAssignment_1"


    // $ANTLR start "rule__FromStatement__AggregatesAssignment_1"
    // InternalD3ql.g:851:1: rule__FromStatement__AggregatesAssignment_1 : ( ruleAggregateRoot ) ;
    public final void rule__FromStatement__AggregatesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:855:1: ( ( ruleAggregateRoot ) )
            // InternalD3ql.g:856:2: ( ruleAggregateRoot )
            {
            // InternalD3ql.g:856:2: ( ruleAggregateRoot )
            // InternalD3ql.g:857:3: ruleAggregateRoot
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
    // InternalD3ql.g:866:1: rule__FromStatement__AggregatesAssignment_2_1 : ( ruleAggregateRoot ) ;
    public final void rule__FromStatement__AggregatesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:870:1: ( ( ruleAggregateRoot ) )
            // InternalD3ql.g:871:2: ( ruleAggregateRoot )
            {
            // InternalD3ql.g:871:2: ( ruleAggregateRoot )
            // InternalD3ql.g:872:3: ruleAggregateRoot
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


    // $ANTLR start "rule__AggregateRoot__NameAssignment_0"
    // InternalD3ql.g:881:1: rule__AggregateRoot__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__AggregateRoot__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:885:1: ( ( RULE_ID ) )
            // InternalD3ql.g:886:2: ( RULE_ID )
            {
            // InternalD3ql.g:886:2: ( RULE_ID )
            // InternalD3ql.g:887:3: RULE_ID
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
    // InternalD3ql.g:896:1: rule__AggregateRoot__AliasAssignment_1_1 : ( ruleAlias ) ;
    public final void rule__AggregateRoot__AliasAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:900:1: ( ( ruleAlias ) )
            // InternalD3ql.g:901:2: ( ruleAlias )
            {
            // InternalD3ql.g:901:2: ( ruleAlias )
            // InternalD3ql.g:902:3: ruleAlias
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
    // InternalD3ql.g:911:1: rule__Alias__NameAssignment : ( RULE_ID ) ;
    public final void rule__Alias__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:915:1: ( ( RULE_ID ) )
            // InternalD3ql.g:916:2: ( RULE_ID )
            {
            // InternalD3ql.g:916:2: ( RULE_ID )
            // InternalD3ql.g:917:3: RULE_ID
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


    // $ANTLR start "rule__SelectStatement__PathsAssignment_1"
    // InternalD3ql.g:926:1: rule__SelectStatement__PathsAssignment_1 : ( rulePathExpression ) ;
    public final void rule__SelectStatement__PathsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:930:1: ( ( rulePathExpression ) )
            // InternalD3ql.g:931:2: ( rulePathExpression )
            {
            // InternalD3ql.g:931:2: ( rulePathExpression )
            // InternalD3ql.g:932:3: rulePathExpression
            {
             before(grammarAccess.getSelectStatementAccess().getPathsPathExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulePathExpression();

            state._fsp--;

             after(grammarAccess.getSelectStatementAccess().getPathsPathExpressionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectStatement__PathsAssignment_1"


    // $ANTLR start "rule__SelectStatement__PathsAssignment_2_1"
    // InternalD3ql.g:941:1: rule__SelectStatement__PathsAssignment_2_1 : ( rulePathExpression ) ;
    public final void rule__SelectStatement__PathsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:945:1: ( ( rulePathExpression ) )
            // InternalD3ql.g:946:2: ( rulePathExpression )
            {
            // InternalD3ql.g:946:2: ( rulePathExpression )
            // InternalD3ql.g:947:3: rulePathExpression
            {
             before(grammarAccess.getSelectStatementAccess().getPathsPathExpressionParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            rulePathExpression();

            state._fsp--;

             after(grammarAccess.getSelectStatementAccess().getPathsPathExpressionParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectStatement__PathsAssignment_2_1"


    // $ANTLR start "rule__PathExpression__HeadAssignment_0"
    // InternalD3ql.g:956:1: rule__PathExpression__HeadAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__PathExpression__HeadAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:960:1: ( ( ( RULE_ID ) ) )
            // InternalD3ql.g:961:2: ( ( RULE_ID ) )
            {
            // InternalD3ql.g:961:2: ( ( RULE_ID ) )
            // InternalD3ql.g:962:3: ( RULE_ID )
            {
             before(grammarAccess.getPathExpressionAccess().getHeadNamedCrossReference_0_0()); 
            // InternalD3ql.g:963:3: ( RULE_ID )
            // InternalD3ql.g:964:4: RULE_ID
            {
             before(grammarAccess.getPathExpressionAccess().getHeadNamedIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPathExpressionAccess().getHeadNamedIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getPathExpressionAccess().getHeadNamedCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PathExpression__HeadAssignment_0"


    // $ANTLR start "rule__PathExpression__TailAssignment_2_0"
    // InternalD3ql.g:975:1: rule__PathExpression__TailAssignment_2_0 : ( rulePathElement ) ;
    public final void rule__PathExpression__TailAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:979:1: ( ( rulePathElement ) )
            // InternalD3ql.g:980:2: ( rulePathElement )
            {
            // InternalD3ql.g:980:2: ( rulePathElement )
            // InternalD3ql.g:981:3: rulePathElement
            {
             before(grammarAccess.getPathExpressionAccess().getTailPathElementParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            rulePathElement();

            state._fsp--;

             after(grammarAccess.getPathExpressionAccess().getTailPathElementParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PathExpression__TailAssignment_2_0"


    // $ANTLR start "rule__PathExpression__TailAssignment_3"
    // InternalD3ql.g:990:1: rule__PathExpression__TailAssignment_3 : ( rulePathElement ) ;
    public final void rule__PathExpression__TailAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:994:1: ( ( rulePathElement ) )
            // InternalD3ql.g:995:2: ( rulePathElement )
            {
            // InternalD3ql.g:995:2: ( rulePathElement )
            // InternalD3ql.g:996:3: rulePathElement
            {
             before(grammarAccess.getPathExpressionAccess().getTailPathElementParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            rulePathElement();

            state._fsp--;

             after(grammarAccess.getPathExpressionAccess().getTailPathElementParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PathExpression__TailAssignment_3"


    // $ANTLR start "rule__PathElement__NameAssignment"
    // InternalD3ql.g:1005:1: rule__PathElement__NameAssignment : ( RULE_ID ) ;
    public final void rule__PathElement__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:1009:1: ( ( RULE_ID ) )
            // InternalD3ql.g:1010:2: ( RULE_ID )
            {
            // InternalD3ql.g:1010:2: ( RULE_ID )
            // InternalD3ql.g:1011:3: RULE_ID
            {
             before(grammarAccess.getPathElementAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPathElementAccess().getNameIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PathElement__NameAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000012L});

}