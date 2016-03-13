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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'true'", "'false'", "'from'", "','", "'as'", "'select'", "'.'", "'('", "')'"
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


    // $ANTLR start "entryRuleSelectExpression"
    // InternalD3ql.g:178:1: entryRuleSelectExpression : ruleSelectExpression EOF ;
    public final void entryRuleSelectExpression() throws RecognitionException {
        try {
            // InternalD3ql.g:179:1: ( ruleSelectExpression EOF )
            // InternalD3ql.g:180:1: ruleSelectExpression EOF
            {
             before(grammarAccess.getSelectExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleSelectExpression();

            state._fsp--;

             after(grammarAccess.getSelectExpressionRule()); 
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
    // $ANTLR end "entryRuleSelectExpression"


    // $ANTLR start "ruleSelectExpression"
    // InternalD3ql.g:187:1: ruleSelectExpression : ( ( rule__SelectExpression__Group__0 ) ) ;
    public final void ruleSelectExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:191:2: ( ( ( rule__SelectExpression__Group__0 ) ) )
            // InternalD3ql.g:192:2: ( ( rule__SelectExpression__Group__0 ) )
            {
            // InternalD3ql.g:192:2: ( ( rule__SelectExpression__Group__0 ) )
            // InternalD3ql.g:193:3: ( rule__SelectExpression__Group__0 )
            {
             before(grammarAccess.getSelectExpressionAccess().getGroup()); 
            // InternalD3ql.g:194:3: ( rule__SelectExpression__Group__0 )
            // InternalD3ql.g:194:4: rule__SelectExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SelectExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSelectExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSelectExpression"


    // $ANTLR start "entryRulePathExpression"
    // InternalD3ql.g:203:1: entryRulePathExpression : rulePathExpression EOF ;
    public final void entryRulePathExpression() throws RecognitionException {
        try {
            // InternalD3ql.g:204:1: ( rulePathExpression EOF )
            // InternalD3ql.g:205:1: rulePathExpression EOF
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
    // InternalD3ql.g:212:1: rulePathExpression : ( ( rule__PathExpression__Group__0 ) ) ;
    public final void rulePathExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:216:2: ( ( ( rule__PathExpression__Group__0 ) ) )
            // InternalD3ql.g:217:2: ( ( rule__PathExpression__Group__0 ) )
            {
            // InternalD3ql.g:217:2: ( ( rule__PathExpression__Group__0 ) )
            // InternalD3ql.g:218:3: ( rule__PathExpression__Group__0 )
            {
             before(grammarAccess.getPathExpressionAccess().getGroup()); 
            // InternalD3ql.g:219:3: ( rule__PathExpression__Group__0 )
            // InternalD3ql.g:219:4: rule__PathExpression__Group__0
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
    // InternalD3ql.g:228:1: entryRulePathElement : rulePathElement EOF ;
    public final void entryRulePathElement() throws RecognitionException {
        try {
            // InternalD3ql.g:229:1: ( rulePathElement EOF )
            // InternalD3ql.g:230:1: rulePathElement EOF
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
    // InternalD3ql.g:237:1: rulePathElement : ( ( rule__PathElement__NameAssignment ) ) ;
    public final void rulePathElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:241:2: ( ( ( rule__PathElement__NameAssignment ) ) )
            // InternalD3ql.g:242:2: ( ( rule__PathElement__NameAssignment ) )
            {
            // InternalD3ql.g:242:2: ( ( rule__PathElement__NameAssignment ) )
            // InternalD3ql.g:243:3: ( rule__PathElement__NameAssignment )
            {
             before(grammarAccess.getPathElementAccess().getNameAssignment()); 
            // InternalD3ql.g:244:3: ( rule__PathElement__NameAssignment )
            // InternalD3ql.g:244:4: rule__PathElement__NameAssignment
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


    // $ANTLR start "entryRuleFunctionCall"
    // InternalD3ql.g:253:1: entryRuleFunctionCall : ruleFunctionCall EOF ;
    public final void entryRuleFunctionCall() throws RecognitionException {
        try {
            // InternalD3ql.g:254:1: ( ruleFunctionCall EOF )
            // InternalD3ql.g:255:1: ruleFunctionCall EOF
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
    // InternalD3ql.g:262:1: ruleFunctionCall : ( ( rule__FunctionCall__Group__0 ) ) ;
    public final void ruleFunctionCall() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:266:2: ( ( ( rule__FunctionCall__Group__0 ) ) )
            // InternalD3ql.g:267:2: ( ( rule__FunctionCall__Group__0 ) )
            {
            // InternalD3ql.g:267:2: ( ( rule__FunctionCall__Group__0 ) )
            // InternalD3ql.g:268:3: ( rule__FunctionCall__Group__0 )
            {
             before(grammarAccess.getFunctionCallAccess().getGroup()); 
            // InternalD3ql.g:269:3: ( rule__FunctionCall__Group__0 )
            // InternalD3ql.g:269:4: rule__FunctionCall__Group__0
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
    // InternalD3ql.g:278:1: entryRuleFunctionArgument : ruleFunctionArgument EOF ;
    public final void entryRuleFunctionArgument() throws RecognitionException {
        try {
            // InternalD3ql.g:279:1: ( ruleFunctionArgument EOF )
            // InternalD3ql.g:280:1: ruleFunctionArgument EOF
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
    // InternalD3ql.g:287:1: ruleFunctionArgument : ( ( rule__FunctionArgument__ValueAssignment ) ) ;
    public final void ruleFunctionArgument() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:291:2: ( ( ( rule__FunctionArgument__ValueAssignment ) ) )
            // InternalD3ql.g:292:2: ( ( rule__FunctionArgument__ValueAssignment ) )
            {
            // InternalD3ql.g:292:2: ( ( rule__FunctionArgument__ValueAssignment ) )
            // InternalD3ql.g:293:3: ( rule__FunctionArgument__ValueAssignment )
            {
             before(grammarAccess.getFunctionArgumentAccess().getValueAssignment()); 
            // InternalD3ql.g:294:3: ( rule__FunctionArgument__ValueAssignment )
            // InternalD3ql.g:294:4: rule__FunctionArgument__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__FunctionArgument__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getFunctionArgumentAccess().getValueAssignment()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleLiteral"
    // InternalD3ql.g:303:1: entryRuleLiteral : ruleLiteral EOF ;
    public final void entryRuleLiteral() throws RecognitionException {
        try {
            // InternalD3ql.g:304:1: ( ruleLiteral EOF )
            // InternalD3ql.g:305:1: ruleLiteral EOF
            {
             before(grammarAccess.getLiteralRule()); 
            pushFollow(FOLLOW_1);
            ruleLiteral();

            state._fsp--;

             after(grammarAccess.getLiteralRule()); 
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
    // $ANTLR end "entryRuleLiteral"


    // $ANTLR start "ruleLiteral"
    // InternalD3ql.g:312:1: ruleLiteral : ( ( rule__Literal__Alternatives ) ) ;
    public final void ruleLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:316:2: ( ( ( rule__Literal__Alternatives ) ) )
            // InternalD3ql.g:317:2: ( ( rule__Literal__Alternatives ) )
            {
            // InternalD3ql.g:317:2: ( ( rule__Literal__Alternatives ) )
            // InternalD3ql.g:318:3: ( rule__Literal__Alternatives )
            {
             before(grammarAccess.getLiteralAccess().getAlternatives()); 
            // InternalD3ql.g:319:3: ( rule__Literal__Alternatives )
            // InternalD3ql.g:319:4: rule__Literal__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Literal__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLiteralAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLiteral"


    // $ANTLR start "entryRuleIntegerLiteral"
    // InternalD3ql.g:328:1: entryRuleIntegerLiteral : ruleIntegerLiteral EOF ;
    public final void entryRuleIntegerLiteral() throws RecognitionException {
        try {
            // InternalD3ql.g:329:1: ( ruleIntegerLiteral EOF )
            // InternalD3ql.g:330:1: ruleIntegerLiteral EOF
            {
             before(grammarAccess.getIntegerLiteralRule()); 
            pushFollow(FOLLOW_1);
            ruleIntegerLiteral();

            state._fsp--;

             after(grammarAccess.getIntegerLiteralRule()); 
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
    // $ANTLR end "entryRuleIntegerLiteral"


    // $ANTLR start "ruleIntegerLiteral"
    // InternalD3ql.g:337:1: ruleIntegerLiteral : ( ( rule__IntegerLiteral__ValueAssignment ) ) ;
    public final void ruleIntegerLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:341:2: ( ( ( rule__IntegerLiteral__ValueAssignment ) ) )
            // InternalD3ql.g:342:2: ( ( rule__IntegerLiteral__ValueAssignment ) )
            {
            // InternalD3ql.g:342:2: ( ( rule__IntegerLiteral__ValueAssignment ) )
            // InternalD3ql.g:343:3: ( rule__IntegerLiteral__ValueAssignment )
            {
             before(grammarAccess.getIntegerLiteralAccess().getValueAssignment()); 
            // InternalD3ql.g:344:3: ( rule__IntegerLiteral__ValueAssignment )
            // InternalD3ql.g:344:4: rule__IntegerLiteral__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__IntegerLiteral__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getIntegerLiteralAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIntegerLiteral"


    // $ANTLR start "entryRuleStringLiteral"
    // InternalD3ql.g:353:1: entryRuleStringLiteral : ruleStringLiteral EOF ;
    public final void entryRuleStringLiteral() throws RecognitionException {
        try {
            // InternalD3ql.g:354:1: ( ruleStringLiteral EOF )
            // InternalD3ql.g:355:1: ruleStringLiteral EOF
            {
             before(grammarAccess.getStringLiteralRule()); 
            pushFollow(FOLLOW_1);
            ruleStringLiteral();

            state._fsp--;

             after(grammarAccess.getStringLiteralRule()); 
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
    // $ANTLR end "entryRuleStringLiteral"


    // $ANTLR start "ruleStringLiteral"
    // InternalD3ql.g:362:1: ruleStringLiteral : ( ( rule__StringLiteral__ValueAssignment ) ) ;
    public final void ruleStringLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:366:2: ( ( ( rule__StringLiteral__ValueAssignment ) ) )
            // InternalD3ql.g:367:2: ( ( rule__StringLiteral__ValueAssignment ) )
            {
            // InternalD3ql.g:367:2: ( ( rule__StringLiteral__ValueAssignment ) )
            // InternalD3ql.g:368:3: ( rule__StringLiteral__ValueAssignment )
            {
             before(grammarAccess.getStringLiteralAccess().getValueAssignment()); 
            // InternalD3ql.g:369:3: ( rule__StringLiteral__ValueAssignment )
            // InternalD3ql.g:369:4: rule__StringLiteral__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__StringLiteral__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getStringLiteralAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStringLiteral"


    // $ANTLR start "entryRuleBooleanLiteral"
    // InternalD3ql.g:378:1: entryRuleBooleanLiteral : ruleBooleanLiteral EOF ;
    public final void entryRuleBooleanLiteral() throws RecognitionException {
        try {
            // InternalD3ql.g:379:1: ( ruleBooleanLiteral EOF )
            // InternalD3ql.g:380:1: ruleBooleanLiteral EOF
            {
             before(grammarAccess.getBooleanLiteralRule()); 
            pushFollow(FOLLOW_1);
            ruleBooleanLiteral();

            state._fsp--;

             after(grammarAccess.getBooleanLiteralRule()); 
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
    // $ANTLR end "entryRuleBooleanLiteral"


    // $ANTLR start "ruleBooleanLiteral"
    // InternalD3ql.g:387:1: ruleBooleanLiteral : ( ( rule__BooleanLiteral__ValueAssignment ) ) ;
    public final void ruleBooleanLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:391:2: ( ( ( rule__BooleanLiteral__ValueAssignment ) ) )
            // InternalD3ql.g:392:2: ( ( rule__BooleanLiteral__ValueAssignment ) )
            {
            // InternalD3ql.g:392:2: ( ( rule__BooleanLiteral__ValueAssignment ) )
            // InternalD3ql.g:393:3: ( rule__BooleanLiteral__ValueAssignment )
            {
             before(grammarAccess.getBooleanLiteralAccess().getValueAssignment()); 
            // InternalD3ql.g:394:3: ( rule__BooleanLiteral__ValueAssignment )
            // InternalD3ql.g:394:4: rule__BooleanLiteral__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__BooleanLiteral__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getBooleanLiteralAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBooleanLiteral"


    // $ANTLR start "rule__SelectExpression__ExpressionAlternatives_0_0"
    // InternalD3ql.g:402:1: rule__SelectExpression__ExpressionAlternatives_0_0 : ( ( rulePathExpression ) | ( ruleFunctionCall ) | ( ruleLiteral ) );
    public final void rule__SelectExpression__ExpressionAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:406:1: ( ( rulePathExpression ) | ( ruleFunctionCall ) | ( ruleLiteral ) )
            int alt1=3;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_ID) ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==EOF||(LA1_1>=14 && LA1_1<=15)||LA1_1==17) ) {
                    alt1=1;
                }
                else if ( (LA1_1==18) ) {
                    alt1=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA1_0>=RULE_INT && LA1_0<=RULE_STRING)||(LA1_0>=11 && LA1_0<=12)) ) {
                alt1=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalD3ql.g:407:2: ( rulePathExpression )
                    {
                    // InternalD3ql.g:407:2: ( rulePathExpression )
                    // InternalD3ql.g:408:3: rulePathExpression
                    {
                     before(grammarAccess.getSelectExpressionAccess().getExpressionPathExpressionParserRuleCall_0_0_0()); 
                    pushFollow(FOLLOW_2);
                    rulePathExpression();

                    state._fsp--;

                     after(grammarAccess.getSelectExpressionAccess().getExpressionPathExpressionParserRuleCall_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalD3ql.g:413:2: ( ruleFunctionCall )
                    {
                    // InternalD3ql.g:413:2: ( ruleFunctionCall )
                    // InternalD3ql.g:414:3: ruleFunctionCall
                    {
                     before(grammarAccess.getSelectExpressionAccess().getExpressionFunctionCallParserRuleCall_0_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleFunctionCall();

                    state._fsp--;

                     after(grammarAccess.getSelectExpressionAccess().getExpressionFunctionCallParserRuleCall_0_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalD3ql.g:419:2: ( ruleLiteral )
                    {
                    // InternalD3ql.g:419:2: ( ruleLiteral )
                    // InternalD3ql.g:420:3: ruleLiteral
                    {
                     before(grammarAccess.getSelectExpressionAccess().getExpressionLiteralParserRuleCall_0_0_2()); 
                    pushFollow(FOLLOW_2);
                    ruleLiteral();

                    state._fsp--;

                     after(grammarAccess.getSelectExpressionAccess().getExpressionLiteralParserRuleCall_0_0_2()); 

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
    // $ANTLR end "rule__SelectExpression__ExpressionAlternatives_0_0"


    // $ANTLR start "rule__FunctionArgument__ValueAlternatives_0"
    // InternalD3ql.g:429:1: rule__FunctionArgument__ValueAlternatives_0 : ( ( rulePathExpression ) | ( ruleLiteral ) );
    public final void rule__FunctionArgument__ValueAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:433:1: ( ( rulePathExpression ) | ( ruleLiteral ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                alt2=1;
            }
            else if ( ((LA2_0>=RULE_INT && LA2_0<=RULE_STRING)||(LA2_0>=11 && LA2_0<=12)) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalD3ql.g:434:2: ( rulePathExpression )
                    {
                    // InternalD3ql.g:434:2: ( rulePathExpression )
                    // InternalD3ql.g:435:3: rulePathExpression
                    {
                     before(grammarAccess.getFunctionArgumentAccess().getValuePathExpressionParserRuleCall_0_0()); 
                    pushFollow(FOLLOW_2);
                    rulePathExpression();

                    state._fsp--;

                     after(grammarAccess.getFunctionArgumentAccess().getValuePathExpressionParserRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalD3ql.g:440:2: ( ruleLiteral )
                    {
                    // InternalD3ql.g:440:2: ( ruleLiteral )
                    // InternalD3ql.g:441:3: ruleLiteral
                    {
                     before(grammarAccess.getFunctionArgumentAccess().getValueLiteralParserRuleCall_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleLiteral();

                    state._fsp--;

                     after(grammarAccess.getFunctionArgumentAccess().getValueLiteralParserRuleCall_0_1()); 

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
    // $ANTLR end "rule__FunctionArgument__ValueAlternatives_0"


    // $ANTLR start "rule__Literal__Alternatives"
    // InternalD3ql.g:450:1: rule__Literal__Alternatives : ( ( ruleIntegerLiteral ) | ( ruleStringLiteral ) | ( ruleBooleanLiteral ) );
    public final void rule__Literal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:454:1: ( ( ruleIntegerLiteral ) | ( ruleStringLiteral ) | ( ruleBooleanLiteral ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt3=1;
                }
                break;
            case RULE_STRING:
                {
                alt3=2;
                }
                break;
            case 11:
            case 12:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalD3ql.g:455:2: ( ruleIntegerLiteral )
                    {
                    // InternalD3ql.g:455:2: ( ruleIntegerLiteral )
                    // InternalD3ql.g:456:3: ruleIntegerLiteral
                    {
                     before(grammarAccess.getLiteralAccess().getIntegerLiteralParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleIntegerLiteral();

                    state._fsp--;

                     after(grammarAccess.getLiteralAccess().getIntegerLiteralParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalD3ql.g:461:2: ( ruleStringLiteral )
                    {
                    // InternalD3ql.g:461:2: ( ruleStringLiteral )
                    // InternalD3ql.g:462:3: ruleStringLiteral
                    {
                     before(grammarAccess.getLiteralAccess().getStringLiteralParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleStringLiteral();

                    state._fsp--;

                     after(grammarAccess.getLiteralAccess().getStringLiteralParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalD3ql.g:467:2: ( ruleBooleanLiteral )
                    {
                    // InternalD3ql.g:467:2: ( ruleBooleanLiteral )
                    // InternalD3ql.g:468:3: ruleBooleanLiteral
                    {
                     before(grammarAccess.getLiteralAccess().getBooleanLiteralParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleBooleanLiteral();

                    state._fsp--;

                     after(grammarAccess.getLiteralAccess().getBooleanLiteralParserRuleCall_2()); 

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
    // $ANTLR end "rule__Literal__Alternatives"


    // $ANTLR start "rule__BooleanLiteral__ValueAlternatives_0"
    // InternalD3ql.g:477:1: rule__BooleanLiteral__ValueAlternatives_0 : ( ( 'true' ) | ( 'false' ) );
    public final void rule__BooleanLiteral__ValueAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:481:1: ( ( 'true' ) | ( 'false' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==11) ) {
                alt4=1;
            }
            else if ( (LA4_0==12) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalD3ql.g:482:2: ( 'true' )
                    {
                    // InternalD3ql.g:482:2: ( 'true' )
                    // InternalD3ql.g:483:3: 'true'
                    {
                     before(grammarAccess.getBooleanLiteralAccess().getValueTrueKeyword_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getBooleanLiteralAccess().getValueTrueKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalD3ql.g:488:2: ( 'false' )
                    {
                    // InternalD3ql.g:488:2: ( 'false' )
                    // InternalD3ql.g:489:3: 'false'
                    {
                     before(grammarAccess.getBooleanLiteralAccess().getValueFalseKeyword_0_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getBooleanLiteralAccess().getValueFalseKeyword_0_1()); 

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
    // $ANTLR end "rule__BooleanLiteral__ValueAlternatives_0"


    // $ANTLR start "rule__Query__Group__0"
    // InternalD3ql.g:498:1: rule__Query__Group__0 : rule__Query__Group__0__Impl rule__Query__Group__1 ;
    public final void rule__Query__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:502:1: ( rule__Query__Group__0__Impl rule__Query__Group__1 )
            // InternalD3ql.g:503:2: rule__Query__Group__0__Impl rule__Query__Group__1
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
    // InternalD3ql.g:510:1: rule__Query__Group__0__Impl : ( ( rule__Query__FromStatementAssignment_0 ) ) ;
    public final void rule__Query__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:514:1: ( ( ( rule__Query__FromStatementAssignment_0 ) ) )
            // InternalD3ql.g:515:1: ( ( rule__Query__FromStatementAssignment_0 ) )
            {
            // InternalD3ql.g:515:1: ( ( rule__Query__FromStatementAssignment_0 ) )
            // InternalD3ql.g:516:2: ( rule__Query__FromStatementAssignment_0 )
            {
             before(grammarAccess.getQueryAccess().getFromStatementAssignment_0()); 
            // InternalD3ql.g:517:2: ( rule__Query__FromStatementAssignment_0 )
            // InternalD3ql.g:517:3: rule__Query__FromStatementAssignment_0
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
    // InternalD3ql.g:525:1: rule__Query__Group__1 : rule__Query__Group__1__Impl ;
    public final void rule__Query__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:529:1: ( rule__Query__Group__1__Impl )
            // InternalD3ql.g:530:2: rule__Query__Group__1__Impl
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
    // InternalD3ql.g:536:1: rule__Query__Group__1__Impl : ( ( rule__Query__SelectStatementAssignment_1 ) ) ;
    public final void rule__Query__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:540:1: ( ( ( rule__Query__SelectStatementAssignment_1 ) ) )
            // InternalD3ql.g:541:1: ( ( rule__Query__SelectStatementAssignment_1 ) )
            {
            // InternalD3ql.g:541:1: ( ( rule__Query__SelectStatementAssignment_1 ) )
            // InternalD3ql.g:542:2: ( rule__Query__SelectStatementAssignment_1 )
            {
             before(grammarAccess.getQueryAccess().getSelectStatementAssignment_1()); 
            // InternalD3ql.g:543:2: ( rule__Query__SelectStatementAssignment_1 )
            // InternalD3ql.g:543:3: rule__Query__SelectStatementAssignment_1
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
    // InternalD3ql.g:552:1: rule__FromStatement__Group__0 : rule__FromStatement__Group__0__Impl rule__FromStatement__Group__1 ;
    public final void rule__FromStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:556:1: ( rule__FromStatement__Group__0__Impl rule__FromStatement__Group__1 )
            // InternalD3ql.g:557:2: rule__FromStatement__Group__0__Impl rule__FromStatement__Group__1
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
    // InternalD3ql.g:564:1: rule__FromStatement__Group__0__Impl : ( 'from' ) ;
    public final void rule__FromStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:568:1: ( ( 'from' ) )
            // InternalD3ql.g:569:1: ( 'from' )
            {
            // InternalD3ql.g:569:1: ( 'from' )
            // InternalD3ql.g:570:2: 'from'
            {
             before(grammarAccess.getFromStatementAccess().getFromKeyword_0()); 
            match(input,13,FOLLOW_2); 
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
    // InternalD3ql.g:579:1: rule__FromStatement__Group__1 : rule__FromStatement__Group__1__Impl rule__FromStatement__Group__2 ;
    public final void rule__FromStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:583:1: ( rule__FromStatement__Group__1__Impl rule__FromStatement__Group__2 )
            // InternalD3ql.g:584:2: rule__FromStatement__Group__1__Impl rule__FromStatement__Group__2
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
    // InternalD3ql.g:591:1: rule__FromStatement__Group__1__Impl : ( ( rule__FromStatement__AggregatesAssignment_1 ) ) ;
    public final void rule__FromStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:595:1: ( ( ( rule__FromStatement__AggregatesAssignment_1 ) ) )
            // InternalD3ql.g:596:1: ( ( rule__FromStatement__AggregatesAssignment_1 ) )
            {
            // InternalD3ql.g:596:1: ( ( rule__FromStatement__AggregatesAssignment_1 ) )
            // InternalD3ql.g:597:2: ( rule__FromStatement__AggregatesAssignment_1 )
            {
             before(grammarAccess.getFromStatementAccess().getAggregatesAssignment_1()); 
            // InternalD3ql.g:598:2: ( rule__FromStatement__AggregatesAssignment_1 )
            // InternalD3ql.g:598:3: rule__FromStatement__AggregatesAssignment_1
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
    // InternalD3ql.g:606:1: rule__FromStatement__Group__2 : rule__FromStatement__Group__2__Impl ;
    public final void rule__FromStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:610:1: ( rule__FromStatement__Group__2__Impl )
            // InternalD3ql.g:611:2: rule__FromStatement__Group__2__Impl
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
    // InternalD3ql.g:617:1: rule__FromStatement__Group__2__Impl : ( ( rule__FromStatement__Group_2__0 )* ) ;
    public final void rule__FromStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:621:1: ( ( ( rule__FromStatement__Group_2__0 )* ) )
            // InternalD3ql.g:622:1: ( ( rule__FromStatement__Group_2__0 )* )
            {
            // InternalD3ql.g:622:1: ( ( rule__FromStatement__Group_2__0 )* )
            // InternalD3ql.g:623:2: ( rule__FromStatement__Group_2__0 )*
            {
             before(grammarAccess.getFromStatementAccess().getGroup_2()); 
            // InternalD3ql.g:624:2: ( rule__FromStatement__Group_2__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==14) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalD3ql.g:624:3: rule__FromStatement__Group_2__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__FromStatement__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
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
    // InternalD3ql.g:633:1: rule__FromStatement__Group_2__0 : rule__FromStatement__Group_2__0__Impl rule__FromStatement__Group_2__1 ;
    public final void rule__FromStatement__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:637:1: ( rule__FromStatement__Group_2__0__Impl rule__FromStatement__Group_2__1 )
            // InternalD3ql.g:638:2: rule__FromStatement__Group_2__0__Impl rule__FromStatement__Group_2__1
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
    // InternalD3ql.g:645:1: rule__FromStatement__Group_2__0__Impl : ( ',' ) ;
    public final void rule__FromStatement__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:649:1: ( ( ',' ) )
            // InternalD3ql.g:650:1: ( ',' )
            {
            // InternalD3ql.g:650:1: ( ',' )
            // InternalD3ql.g:651:2: ','
            {
             before(grammarAccess.getFromStatementAccess().getCommaKeyword_2_0()); 
            match(input,14,FOLLOW_2); 
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
    // InternalD3ql.g:660:1: rule__FromStatement__Group_2__1 : rule__FromStatement__Group_2__1__Impl ;
    public final void rule__FromStatement__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:664:1: ( rule__FromStatement__Group_2__1__Impl )
            // InternalD3ql.g:665:2: rule__FromStatement__Group_2__1__Impl
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
    // InternalD3ql.g:671:1: rule__FromStatement__Group_2__1__Impl : ( ( rule__FromStatement__AggregatesAssignment_2_1 ) ) ;
    public final void rule__FromStatement__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:675:1: ( ( ( rule__FromStatement__AggregatesAssignment_2_1 ) ) )
            // InternalD3ql.g:676:1: ( ( rule__FromStatement__AggregatesAssignment_2_1 ) )
            {
            // InternalD3ql.g:676:1: ( ( rule__FromStatement__AggregatesAssignment_2_1 ) )
            // InternalD3ql.g:677:2: ( rule__FromStatement__AggregatesAssignment_2_1 )
            {
             before(grammarAccess.getFromStatementAccess().getAggregatesAssignment_2_1()); 
            // InternalD3ql.g:678:2: ( rule__FromStatement__AggregatesAssignment_2_1 )
            // InternalD3ql.g:678:3: rule__FromStatement__AggregatesAssignment_2_1
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
    // InternalD3ql.g:687:1: rule__AggregateRoot__Group__0 : rule__AggregateRoot__Group__0__Impl rule__AggregateRoot__Group__1 ;
    public final void rule__AggregateRoot__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:691:1: ( rule__AggregateRoot__Group__0__Impl rule__AggregateRoot__Group__1 )
            // InternalD3ql.g:692:2: rule__AggregateRoot__Group__0__Impl rule__AggregateRoot__Group__1
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
    // InternalD3ql.g:699:1: rule__AggregateRoot__Group__0__Impl : ( ( rule__AggregateRoot__NameAssignment_0 ) ) ;
    public final void rule__AggregateRoot__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:703:1: ( ( ( rule__AggregateRoot__NameAssignment_0 ) ) )
            // InternalD3ql.g:704:1: ( ( rule__AggregateRoot__NameAssignment_0 ) )
            {
            // InternalD3ql.g:704:1: ( ( rule__AggregateRoot__NameAssignment_0 ) )
            // InternalD3ql.g:705:2: ( rule__AggregateRoot__NameAssignment_0 )
            {
             before(grammarAccess.getAggregateRootAccess().getNameAssignment_0()); 
            // InternalD3ql.g:706:2: ( rule__AggregateRoot__NameAssignment_0 )
            // InternalD3ql.g:706:3: rule__AggregateRoot__NameAssignment_0
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
    // InternalD3ql.g:714:1: rule__AggregateRoot__Group__1 : rule__AggregateRoot__Group__1__Impl ;
    public final void rule__AggregateRoot__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:718:1: ( rule__AggregateRoot__Group__1__Impl )
            // InternalD3ql.g:719:2: rule__AggregateRoot__Group__1__Impl
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
    // InternalD3ql.g:725:1: rule__AggregateRoot__Group__1__Impl : ( ( rule__AggregateRoot__Group_1__0 )? ) ;
    public final void rule__AggregateRoot__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:729:1: ( ( ( rule__AggregateRoot__Group_1__0 )? ) )
            // InternalD3ql.g:730:1: ( ( rule__AggregateRoot__Group_1__0 )? )
            {
            // InternalD3ql.g:730:1: ( ( rule__AggregateRoot__Group_1__0 )? )
            // InternalD3ql.g:731:2: ( rule__AggregateRoot__Group_1__0 )?
            {
             before(grammarAccess.getAggregateRootAccess().getGroup_1()); 
            // InternalD3ql.g:732:2: ( rule__AggregateRoot__Group_1__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==15) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalD3ql.g:732:3: rule__AggregateRoot__Group_1__0
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
    // InternalD3ql.g:741:1: rule__AggregateRoot__Group_1__0 : rule__AggregateRoot__Group_1__0__Impl rule__AggregateRoot__Group_1__1 ;
    public final void rule__AggregateRoot__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:745:1: ( rule__AggregateRoot__Group_1__0__Impl rule__AggregateRoot__Group_1__1 )
            // InternalD3ql.g:746:2: rule__AggregateRoot__Group_1__0__Impl rule__AggregateRoot__Group_1__1
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
    // InternalD3ql.g:753:1: rule__AggregateRoot__Group_1__0__Impl : ( 'as' ) ;
    public final void rule__AggregateRoot__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:757:1: ( ( 'as' ) )
            // InternalD3ql.g:758:1: ( 'as' )
            {
            // InternalD3ql.g:758:1: ( 'as' )
            // InternalD3ql.g:759:2: 'as'
            {
             before(grammarAccess.getAggregateRootAccess().getAsKeyword_1_0()); 
            match(input,15,FOLLOW_2); 
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
    // InternalD3ql.g:768:1: rule__AggregateRoot__Group_1__1 : rule__AggregateRoot__Group_1__1__Impl ;
    public final void rule__AggregateRoot__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:772:1: ( rule__AggregateRoot__Group_1__1__Impl )
            // InternalD3ql.g:773:2: rule__AggregateRoot__Group_1__1__Impl
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
    // InternalD3ql.g:779:1: rule__AggregateRoot__Group_1__1__Impl : ( ( rule__AggregateRoot__AliasAssignment_1_1 ) ) ;
    public final void rule__AggregateRoot__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:783:1: ( ( ( rule__AggregateRoot__AliasAssignment_1_1 ) ) )
            // InternalD3ql.g:784:1: ( ( rule__AggregateRoot__AliasAssignment_1_1 ) )
            {
            // InternalD3ql.g:784:1: ( ( rule__AggregateRoot__AliasAssignment_1_1 ) )
            // InternalD3ql.g:785:2: ( rule__AggregateRoot__AliasAssignment_1_1 )
            {
             before(grammarAccess.getAggregateRootAccess().getAliasAssignment_1_1()); 
            // InternalD3ql.g:786:2: ( rule__AggregateRoot__AliasAssignment_1_1 )
            // InternalD3ql.g:786:3: rule__AggregateRoot__AliasAssignment_1_1
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
    // InternalD3ql.g:795:1: rule__SelectStatement__Group__0 : rule__SelectStatement__Group__0__Impl rule__SelectStatement__Group__1 ;
    public final void rule__SelectStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:799:1: ( rule__SelectStatement__Group__0__Impl rule__SelectStatement__Group__1 )
            // InternalD3ql.g:800:2: rule__SelectStatement__Group__0__Impl rule__SelectStatement__Group__1
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
    // InternalD3ql.g:807:1: rule__SelectStatement__Group__0__Impl : ( 'select' ) ;
    public final void rule__SelectStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:811:1: ( ( 'select' ) )
            // InternalD3ql.g:812:1: ( 'select' )
            {
            // InternalD3ql.g:812:1: ( 'select' )
            // InternalD3ql.g:813:2: 'select'
            {
             before(grammarAccess.getSelectStatementAccess().getSelectKeyword_0()); 
            match(input,16,FOLLOW_2); 
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
    // InternalD3ql.g:822:1: rule__SelectStatement__Group__1 : rule__SelectStatement__Group__1__Impl rule__SelectStatement__Group__2 ;
    public final void rule__SelectStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:826:1: ( rule__SelectStatement__Group__1__Impl rule__SelectStatement__Group__2 )
            // InternalD3ql.g:827:2: rule__SelectStatement__Group__1__Impl rule__SelectStatement__Group__2
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
    // InternalD3ql.g:834:1: rule__SelectStatement__Group__1__Impl : ( ( rule__SelectStatement__ExpressionsAssignment_1 ) ) ;
    public final void rule__SelectStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:838:1: ( ( ( rule__SelectStatement__ExpressionsAssignment_1 ) ) )
            // InternalD3ql.g:839:1: ( ( rule__SelectStatement__ExpressionsAssignment_1 ) )
            {
            // InternalD3ql.g:839:1: ( ( rule__SelectStatement__ExpressionsAssignment_1 ) )
            // InternalD3ql.g:840:2: ( rule__SelectStatement__ExpressionsAssignment_1 )
            {
             before(grammarAccess.getSelectStatementAccess().getExpressionsAssignment_1()); 
            // InternalD3ql.g:841:2: ( rule__SelectStatement__ExpressionsAssignment_1 )
            // InternalD3ql.g:841:3: rule__SelectStatement__ExpressionsAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SelectStatement__ExpressionsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSelectStatementAccess().getExpressionsAssignment_1()); 

            }


            }

        }
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
    // InternalD3ql.g:849:1: rule__SelectStatement__Group__2 : rule__SelectStatement__Group__2__Impl ;
    public final void rule__SelectStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:853:1: ( rule__SelectStatement__Group__2__Impl )
            // InternalD3ql.g:854:2: rule__SelectStatement__Group__2__Impl
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
    // InternalD3ql.g:860:1: rule__SelectStatement__Group__2__Impl : ( ( rule__SelectStatement__Group_2__0 )* ) ;
    public final void rule__SelectStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:864:1: ( ( ( rule__SelectStatement__Group_2__0 )* ) )
            // InternalD3ql.g:865:1: ( ( rule__SelectStatement__Group_2__0 )* )
            {
            // InternalD3ql.g:865:1: ( ( rule__SelectStatement__Group_2__0 )* )
            // InternalD3ql.g:866:2: ( rule__SelectStatement__Group_2__0 )*
            {
             before(grammarAccess.getSelectStatementAccess().getGroup_2()); 
            // InternalD3ql.g:867:2: ( rule__SelectStatement__Group_2__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==14) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalD3ql.g:867:3: rule__SelectStatement__Group_2__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__SelectStatement__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
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
    // InternalD3ql.g:876:1: rule__SelectStatement__Group_2__0 : rule__SelectStatement__Group_2__0__Impl rule__SelectStatement__Group_2__1 ;
    public final void rule__SelectStatement__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:880:1: ( rule__SelectStatement__Group_2__0__Impl rule__SelectStatement__Group_2__1 )
            // InternalD3ql.g:881:2: rule__SelectStatement__Group_2__0__Impl rule__SelectStatement__Group_2__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalD3ql.g:888:1: rule__SelectStatement__Group_2__0__Impl : ( ',' ) ;
    public final void rule__SelectStatement__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:892:1: ( ( ',' ) )
            // InternalD3ql.g:893:1: ( ',' )
            {
            // InternalD3ql.g:893:1: ( ',' )
            // InternalD3ql.g:894:2: ','
            {
             before(grammarAccess.getSelectStatementAccess().getCommaKeyword_2_0()); 
            match(input,14,FOLLOW_2); 
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
    // InternalD3ql.g:903:1: rule__SelectStatement__Group_2__1 : rule__SelectStatement__Group_2__1__Impl ;
    public final void rule__SelectStatement__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:907:1: ( rule__SelectStatement__Group_2__1__Impl )
            // InternalD3ql.g:908:2: rule__SelectStatement__Group_2__1__Impl
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
    // InternalD3ql.g:914:1: rule__SelectStatement__Group_2__1__Impl : ( ( rule__SelectStatement__ExpressionsAssignment_2_1 ) ) ;
    public final void rule__SelectStatement__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:918:1: ( ( ( rule__SelectStatement__ExpressionsAssignment_2_1 ) ) )
            // InternalD3ql.g:919:1: ( ( rule__SelectStatement__ExpressionsAssignment_2_1 ) )
            {
            // InternalD3ql.g:919:1: ( ( rule__SelectStatement__ExpressionsAssignment_2_1 ) )
            // InternalD3ql.g:920:2: ( rule__SelectStatement__ExpressionsAssignment_2_1 )
            {
             before(grammarAccess.getSelectStatementAccess().getExpressionsAssignment_2_1()); 
            // InternalD3ql.g:921:2: ( rule__SelectStatement__ExpressionsAssignment_2_1 )
            // InternalD3ql.g:921:3: rule__SelectStatement__ExpressionsAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__SelectStatement__ExpressionsAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getSelectStatementAccess().getExpressionsAssignment_2_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__SelectExpression__Group__0"
    // InternalD3ql.g:930:1: rule__SelectExpression__Group__0 : rule__SelectExpression__Group__0__Impl rule__SelectExpression__Group__1 ;
    public final void rule__SelectExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:934:1: ( rule__SelectExpression__Group__0__Impl rule__SelectExpression__Group__1 )
            // InternalD3ql.g:935:2: rule__SelectExpression__Group__0__Impl rule__SelectExpression__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__SelectExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelectExpression__Group__1();

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
    // $ANTLR end "rule__SelectExpression__Group__0"


    // $ANTLR start "rule__SelectExpression__Group__0__Impl"
    // InternalD3ql.g:942:1: rule__SelectExpression__Group__0__Impl : ( ( rule__SelectExpression__ExpressionAssignment_0 ) ) ;
    public final void rule__SelectExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:946:1: ( ( ( rule__SelectExpression__ExpressionAssignment_0 ) ) )
            // InternalD3ql.g:947:1: ( ( rule__SelectExpression__ExpressionAssignment_0 ) )
            {
            // InternalD3ql.g:947:1: ( ( rule__SelectExpression__ExpressionAssignment_0 ) )
            // InternalD3ql.g:948:2: ( rule__SelectExpression__ExpressionAssignment_0 )
            {
             before(grammarAccess.getSelectExpressionAccess().getExpressionAssignment_0()); 
            // InternalD3ql.g:949:2: ( rule__SelectExpression__ExpressionAssignment_0 )
            // InternalD3ql.g:949:3: rule__SelectExpression__ExpressionAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__SelectExpression__ExpressionAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSelectExpressionAccess().getExpressionAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectExpression__Group__0__Impl"


    // $ANTLR start "rule__SelectExpression__Group__1"
    // InternalD3ql.g:957:1: rule__SelectExpression__Group__1 : rule__SelectExpression__Group__1__Impl ;
    public final void rule__SelectExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:961:1: ( rule__SelectExpression__Group__1__Impl )
            // InternalD3ql.g:962:2: rule__SelectExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SelectExpression__Group__1__Impl();

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
    // $ANTLR end "rule__SelectExpression__Group__1"


    // $ANTLR start "rule__SelectExpression__Group__1__Impl"
    // InternalD3ql.g:968:1: rule__SelectExpression__Group__1__Impl : ( ( rule__SelectExpression__Group_1__0 )? ) ;
    public final void rule__SelectExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:972:1: ( ( ( rule__SelectExpression__Group_1__0 )? ) )
            // InternalD3ql.g:973:1: ( ( rule__SelectExpression__Group_1__0 )? )
            {
            // InternalD3ql.g:973:1: ( ( rule__SelectExpression__Group_1__0 )? )
            // InternalD3ql.g:974:2: ( rule__SelectExpression__Group_1__0 )?
            {
             before(grammarAccess.getSelectExpressionAccess().getGroup_1()); 
            // InternalD3ql.g:975:2: ( rule__SelectExpression__Group_1__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==15) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalD3ql.g:975:3: rule__SelectExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SelectExpression__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSelectExpressionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectExpression__Group__1__Impl"


    // $ANTLR start "rule__SelectExpression__Group_1__0"
    // InternalD3ql.g:984:1: rule__SelectExpression__Group_1__0 : rule__SelectExpression__Group_1__0__Impl rule__SelectExpression__Group_1__1 ;
    public final void rule__SelectExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:988:1: ( rule__SelectExpression__Group_1__0__Impl rule__SelectExpression__Group_1__1 )
            // InternalD3ql.g:989:2: rule__SelectExpression__Group_1__0__Impl rule__SelectExpression__Group_1__1
            {
            pushFollow(FOLLOW_4);
            rule__SelectExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelectExpression__Group_1__1();

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
    // $ANTLR end "rule__SelectExpression__Group_1__0"


    // $ANTLR start "rule__SelectExpression__Group_1__0__Impl"
    // InternalD3ql.g:996:1: rule__SelectExpression__Group_1__0__Impl : ( 'as' ) ;
    public final void rule__SelectExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:1000:1: ( ( 'as' ) )
            // InternalD3ql.g:1001:1: ( 'as' )
            {
            // InternalD3ql.g:1001:1: ( 'as' )
            // InternalD3ql.g:1002:2: 'as'
            {
             before(grammarAccess.getSelectExpressionAccess().getAsKeyword_1_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getSelectExpressionAccess().getAsKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectExpression__Group_1__0__Impl"


    // $ANTLR start "rule__SelectExpression__Group_1__1"
    // InternalD3ql.g:1011:1: rule__SelectExpression__Group_1__1 : rule__SelectExpression__Group_1__1__Impl ;
    public final void rule__SelectExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:1015:1: ( rule__SelectExpression__Group_1__1__Impl )
            // InternalD3ql.g:1016:2: rule__SelectExpression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SelectExpression__Group_1__1__Impl();

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
    // $ANTLR end "rule__SelectExpression__Group_1__1"


    // $ANTLR start "rule__SelectExpression__Group_1__1__Impl"
    // InternalD3ql.g:1022:1: rule__SelectExpression__Group_1__1__Impl : ( ( rule__SelectExpression__AliasAssignment_1_1 ) ) ;
    public final void rule__SelectExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:1026:1: ( ( ( rule__SelectExpression__AliasAssignment_1_1 ) ) )
            // InternalD3ql.g:1027:1: ( ( rule__SelectExpression__AliasAssignment_1_1 ) )
            {
            // InternalD3ql.g:1027:1: ( ( rule__SelectExpression__AliasAssignment_1_1 ) )
            // InternalD3ql.g:1028:2: ( rule__SelectExpression__AliasAssignment_1_1 )
            {
             before(grammarAccess.getSelectExpressionAccess().getAliasAssignment_1_1()); 
            // InternalD3ql.g:1029:2: ( rule__SelectExpression__AliasAssignment_1_1 )
            // InternalD3ql.g:1029:3: rule__SelectExpression__AliasAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__SelectExpression__AliasAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getSelectExpressionAccess().getAliasAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectExpression__Group_1__1__Impl"


    // $ANTLR start "rule__PathExpression__Group__0"
    // InternalD3ql.g:1038:1: rule__PathExpression__Group__0 : rule__PathExpression__Group__0__Impl rule__PathExpression__Group__1 ;
    public final void rule__PathExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:1042:1: ( rule__PathExpression__Group__0__Impl rule__PathExpression__Group__1 )
            // InternalD3ql.g:1043:2: rule__PathExpression__Group__0__Impl rule__PathExpression__Group__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalD3ql.g:1050:1: rule__PathExpression__Group__0__Impl : ( ( rule__PathExpression__HeadAssignment_0 ) ) ;
    public final void rule__PathExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:1054:1: ( ( ( rule__PathExpression__HeadAssignment_0 ) ) )
            // InternalD3ql.g:1055:1: ( ( rule__PathExpression__HeadAssignment_0 ) )
            {
            // InternalD3ql.g:1055:1: ( ( rule__PathExpression__HeadAssignment_0 ) )
            // InternalD3ql.g:1056:2: ( rule__PathExpression__HeadAssignment_0 )
            {
             before(grammarAccess.getPathExpressionAccess().getHeadAssignment_0()); 
            // InternalD3ql.g:1057:2: ( rule__PathExpression__HeadAssignment_0 )
            // InternalD3ql.g:1057:3: rule__PathExpression__HeadAssignment_0
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
    // InternalD3ql.g:1065:1: rule__PathExpression__Group__1 : rule__PathExpression__Group__1__Impl ;
    public final void rule__PathExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:1069:1: ( rule__PathExpression__Group__1__Impl )
            // InternalD3ql.g:1070:2: rule__PathExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PathExpression__Group__1__Impl();

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
    // InternalD3ql.g:1076:1: rule__PathExpression__Group__1__Impl : ( ( rule__PathExpression__Group_1__0 )? ) ;
    public final void rule__PathExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:1080:1: ( ( ( rule__PathExpression__Group_1__0 )? ) )
            // InternalD3ql.g:1081:1: ( ( rule__PathExpression__Group_1__0 )? )
            {
            // InternalD3ql.g:1081:1: ( ( rule__PathExpression__Group_1__0 )? )
            // InternalD3ql.g:1082:2: ( rule__PathExpression__Group_1__0 )?
            {
             before(grammarAccess.getPathExpressionAccess().getGroup_1()); 
            // InternalD3ql.g:1083:2: ( rule__PathExpression__Group_1__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==17) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalD3ql.g:1083:3: rule__PathExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PathExpression__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPathExpressionAccess().getGroup_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__PathExpression__Group_1__0"
    // InternalD3ql.g:1092:1: rule__PathExpression__Group_1__0 : rule__PathExpression__Group_1__0__Impl rule__PathExpression__Group_1__1 ;
    public final void rule__PathExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:1096:1: ( rule__PathExpression__Group_1__0__Impl rule__PathExpression__Group_1__1 )
            // InternalD3ql.g:1097:2: rule__PathExpression__Group_1__0__Impl rule__PathExpression__Group_1__1
            {
            pushFollow(FOLLOW_4);
            rule__PathExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PathExpression__Group_1__1();

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
    // $ANTLR end "rule__PathExpression__Group_1__0"


    // $ANTLR start "rule__PathExpression__Group_1__0__Impl"
    // InternalD3ql.g:1104:1: rule__PathExpression__Group_1__0__Impl : ( '.' ) ;
    public final void rule__PathExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:1108:1: ( ( '.' ) )
            // InternalD3ql.g:1109:1: ( '.' )
            {
            // InternalD3ql.g:1109:1: ( '.' )
            // InternalD3ql.g:1110:2: '.'
            {
             before(grammarAccess.getPathExpressionAccess().getFullStopKeyword_1_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getPathExpressionAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PathExpression__Group_1__0__Impl"


    // $ANTLR start "rule__PathExpression__Group_1__1"
    // InternalD3ql.g:1119:1: rule__PathExpression__Group_1__1 : rule__PathExpression__Group_1__1__Impl rule__PathExpression__Group_1__2 ;
    public final void rule__PathExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:1123:1: ( rule__PathExpression__Group_1__1__Impl rule__PathExpression__Group_1__2 )
            // InternalD3ql.g:1124:2: rule__PathExpression__Group_1__1__Impl rule__PathExpression__Group_1__2
            {
            pushFollow(FOLLOW_4);
            rule__PathExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PathExpression__Group_1__2();

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
    // $ANTLR end "rule__PathExpression__Group_1__1"


    // $ANTLR start "rule__PathExpression__Group_1__1__Impl"
    // InternalD3ql.g:1131:1: rule__PathExpression__Group_1__1__Impl : ( ( rule__PathExpression__Group_1_1__0 )* ) ;
    public final void rule__PathExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:1135:1: ( ( ( rule__PathExpression__Group_1_1__0 )* ) )
            // InternalD3ql.g:1136:1: ( ( rule__PathExpression__Group_1_1__0 )* )
            {
            // InternalD3ql.g:1136:1: ( ( rule__PathExpression__Group_1_1__0 )* )
            // InternalD3ql.g:1137:2: ( rule__PathExpression__Group_1_1__0 )*
            {
             before(grammarAccess.getPathExpressionAccess().getGroup_1_1()); 
            // InternalD3ql.g:1138:2: ( rule__PathExpression__Group_1_1__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    int LA10_1 = input.LA(2);

                    if ( (LA10_1==17) ) {
                        alt10=1;
                    }


                }


                switch (alt10) {
            	case 1 :
            	    // InternalD3ql.g:1138:3: rule__PathExpression__Group_1_1__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__PathExpression__Group_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getPathExpressionAccess().getGroup_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PathExpression__Group_1__1__Impl"


    // $ANTLR start "rule__PathExpression__Group_1__2"
    // InternalD3ql.g:1146:1: rule__PathExpression__Group_1__2 : rule__PathExpression__Group_1__2__Impl ;
    public final void rule__PathExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:1150:1: ( rule__PathExpression__Group_1__2__Impl )
            // InternalD3ql.g:1151:2: rule__PathExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PathExpression__Group_1__2__Impl();

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
    // $ANTLR end "rule__PathExpression__Group_1__2"


    // $ANTLR start "rule__PathExpression__Group_1__2__Impl"
    // InternalD3ql.g:1157:1: rule__PathExpression__Group_1__2__Impl : ( ( rule__PathExpression__TailAssignment_1_2 ) ) ;
    public final void rule__PathExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:1161:1: ( ( ( rule__PathExpression__TailAssignment_1_2 ) ) )
            // InternalD3ql.g:1162:1: ( ( rule__PathExpression__TailAssignment_1_2 ) )
            {
            // InternalD3ql.g:1162:1: ( ( rule__PathExpression__TailAssignment_1_2 ) )
            // InternalD3ql.g:1163:2: ( rule__PathExpression__TailAssignment_1_2 )
            {
             before(grammarAccess.getPathExpressionAccess().getTailAssignment_1_2()); 
            // InternalD3ql.g:1164:2: ( rule__PathExpression__TailAssignment_1_2 )
            // InternalD3ql.g:1164:3: rule__PathExpression__TailAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__PathExpression__TailAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getPathExpressionAccess().getTailAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PathExpression__Group_1__2__Impl"


    // $ANTLR start "rule__PathExpression__Group_1_1__0"
    // InternalD3ql.g:1173:1: rule__PathExpression__Group_1_1__0 : rule__PathExpression__Group_1_1__0__Impl rule__PathExpression__Group_1_1__1 ;
    public final void rule__PathExpression__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:1177:1: ( rule__PathExpression__Group_1_1__0__Impl rule__PathExpression__Group_1_1__1 )
            // InternalD3ql.g:1178:2: rule__PathExpression__Group_1_1__0__Impl rule__PathExpression__Group_1_1__1
            {
            pushFollow(FOLLOW_9);
            rule__PathExpression__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PathExpression__Group_1_1__1();

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
    // $ANTLR end "rule__PathExpression__Group_1_1__0"


    // $ANTLR start "rule__PathExpression__Group_1_1__0__Impl"
    // InternalD3ql.g:1185:1: rule__PathExpression__Group_1_1__0__Impl : ( ( rule__PathExpression__TailAssignment_1_1_0 ) ) ;
    public final void rule__PathExpression__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:1189:1: ( ( ( rule__PathExpression__TailAssignment_1_1_0 ) ) )
            // InternalD3ql.g:1190:1: ( ( rule__PathExpression__TailAssignment_1_1_0 ) )
            {
            // InternalD3ql.g:1190:1: ( ( rule__PathExpression__TailAssignment_1_1_0 ) )
            // InternalD3ql.g:1191:2: ( rule__PathExpression__TailAssignment_1_1_0 )
            {
             before(grammarAccess.getPathExpressionAccess().getTailAssignment_1_1_0()); 
            // InternalD3ql.g:1192:2: ( rule__PathExpression__TailAssignment_1_1_0 )
            // InternalD3ql.g:1192:3: rule__PathExpression__TailAssignment_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__PathExpression__TailAssignment_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getPathExpressionAccess().getTailAssignment_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PathExpression__Group_1_1__0__Impl"


    // $ANTLR start "rule__PathExpression__Group_1_1__1"
    // InternalD3ql.g:1200:1: rule__PathExpression__Group_1_1__1 : rule__PathExpression__Group_1_1__1__Impl ;
    public final void rule__PathExpression__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:1204:1: ( rule__PathExpression__Group_1_1__1__Impl )
            // InternalD3ql.g:1205:2: rule__PathExpression__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PathExpression__Group_1_1__1__Impl();

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
    // $ANTLR end "rule__PathExpression__Group_1_1__1"


    // $ANTLR start "rule__PathExpression__Group_1_1__1__Impl"
    // InternalD3ql.g:1211:1: rule__PathExpression__Group_1_1__1__Impl : ( '.' ) ;
    public final void rule__PathExpression__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:1215:1: ( ( '.' ) )
            // InternalD3ql.g:1216:1: ( '.' )
            {
            // InternalD3ql.g:1216:1: ( '.' )
            // InternalD3ql.g:1217:2: '.'
            {
             before(grammarAccess.getPathExpressionAccess().getFullStopKeyword_1_1_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getPathExpressionAccess().getFullStopKeyword_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PathExpression__Group_1_1__1__Impl"


    // $ANTLR start "rule__FunctionCall__Group__0"
    // InternalD3ql.g:1227:1: rule__FunctionCall__Group__0 : rule__FunctionCall__Group__0__Impl rule__FunctionCall__Group__1 ;
    public final void rule__FunctionCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:1231:1: ( rule__FunctionCall__Group__0__Impl rule__FunctionCall__Group__1 )
            // InternalD3ql.g:1232:2: rule__FunctionCall__Group__0__Impl rule__FunctionCall__Group__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalD3ql.g:1239:1: rule__FunctionCall__Group__0__Impl : ( ( rule__FunctionCall__FunctionAssignment_0 ) ) ;
    public final void rule__FunctionCall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:1243:1: ( ( ( rule__FunctionCall__FunctionAssignment_0 ) ) )
            // InternalD3ql.g:1244:1: ( ( rule__FunctionCall__FunctionAssignment_0 ) )
            {
            // InternalD3ql.g:1244:1: ( ( rule__FunctionCall__FunctionAssignment_0 ) )
            // InternalD3ql.g:1245:2: ( rule__FunctionCall__FunctionAssignment_0 )
            {
             before(grammarAccess.getFunctionCallAccess().getFunctionAssignment_0()); 
            // InternalD3ql.g:1246:2: ( rule__FunctionCall__FunctionAssignment_0 )
            // InternalD3ql.g:1246:3: rule__FunctionCall__FunctionAssignment_0
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
    // InternalD3ql.g:1254:1: rule__FunctionCall__Group__1 : rule__FunctionCall__Group__1__Impl rule__FunctionCall__Group__2 ;
    public final void rule__FunctionCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:1258:1: ( rule__FunctionCall__Group__1__Impl rule__FunctionCall__Group__2 )
            // InternalD3ql.g:1259:2: rule__FunctionCall__Group__1__Impl rule__FunctionCall__Group__2
            {
            pushFollow(FOLLOW_8);
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
    // InternalD3ql.g:1266:1: rule__FunctionCall__Group__1__Impl : ( '(' ) ;
    public final void rule__FunctionCall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:1270:1: ( ( '(' ) )
            // InternalD3ql.g:1271:1: ( '(' )
            {
            // InternalD3ql.g:1271:1: ( '(' )
            // InternalD3ql.g:1272:2: '('
            {
             before(grammarAccess.getFunctionCallAccess().getLeftParenthesisKeyword_1()); 
            match(input,18,FOLLOW_2); 
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
    // InternalD3ql.g:1281:1: rule__FunctionCall__Group__2 : rule__FunctionCall__Group__2__Impl rule__FunctionCall__Group__3 ;
    public final void rule__FunctionCall__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:1285:1: ( rule__FunctionCall__Group__2__Impl rule__FunctionCall__Group__3 )
            // InternalD3ql.g:1286:2: rule__FunctionCall__Group__2__Impl rule__FunctionCall__Group__3
            {
            pushFollow(FOLLOW_12);
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
    // InternalD3ql.g:1293:1: rule__FunctionCall__Group__2__Impl : ( ( rule__FunctionCall__ArgumentsAssignment_2 ) ) ;
    public final void rule__FunctionCall__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:1297:1: ( ( ( rule__FunctionCall__ArgumentsAssignment_2 ) ) )
            // InternalD3ql.g:1298:1: ( ( rule__FunctionCall__ArgumentsAssignment_2 ) )
            {
            // InternalD3ql.g:1298:1: ( ( rule__FunctionCall__ArgumentsAssignment_2 ) )
            // InternalD3ql.g:1299:2: ( rule__FunctionCall__ArgumentsAssignment_2 )
            {
             before(grammarAccess.getFunctionCallAccess().getArgumentsAssignment_2()); 
            // InternalD3ql.g:1300:2: ( rule__FunctionCall__ArgumentsAssignment_2 )
            // InternalD3ql.g:1300:3: rule__FunctionCall__ArgumentsAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__FunctionCall__ArgumentsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFunctionCallAccess().getArgumentsAssignment_2()); 

            }


            }

        }
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
    // InternalD3ql.g:1308:1: rule__FunctionCall__Group__3 : rule__FunctionCall__Group__3__Impl rule__FunctionCall__Group__4 ;
    public final void rule__FunctionCall__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:1312:1: ( rule__FunctionCall__Group__3__Impl rule__FunctionCall__Group__4 )
            // InternalD3ql.g:1313:2: rule__FunctionCall__Group__3__Impl rule__FunctionCall__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__FunctionCall__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FunctionCall__Group__4();

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
    // InternalD3ql.g:1320:1: rule__FunctionCall__Group__3__Impl : ( ( rule__FunctionCall__Group_3__0 )* ) ;
    public final void rule__FunctionCall__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:1324:1: ( ( ( rule__FunctionCall__Group_3__0 )* ) )
            // InternalD3ql.g:1325:1: ( ( rule__FunctionCall__Group_3__0 )* )
            {
            // InternalD3ql.g:1325:1: ( ( rule__FunctionCall__Group_3__0 )* )
            // InternalD3ql.g:1326:2: ( rule__FunctionCall__Group_3__0 )*
            {
             before(grammarAccess.getFunctionCallAccess().getGroup_3()); 
            // InternalD3ql.g:1327:2: ( rule__FunctionCall__Group_3__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==14) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalD3ql.g:1327:3: rule__FunctionCall__Group_3__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__FunctionCall__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getFunctionCallAccess().getGroup_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__FunctionCall__Group__4"
    // InternalD3ql.g:1335:1: rule__FunctionCall__Group__4 : rule__FunctionCall__Group__4__Impl ;
    public final void rule__FunctionCall__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:1339:1: ( rule__FunctionCall__Group__4__Impl )
            // InternalD3ql.g:1340:2: rule__FunctionCall__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FunctionCall__Group__4__Impl();

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
    // $ANTLR end "rule__FunctionCall__Group__4"


    // $ANTLR start "rule__FunctionCall__Group__4__Impl"
    // InternalD3ql.g:1346:1: rule__FunctionCall__Group__4__Impl : ( ')' ) ;
    public final void rule__FunctionCall__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:1350:1: ( ( ')' ) )
            // InternalD3ql.g:1351:1: ( ')' )
            {
            // InternalD3ql.g:1351:1: ( ')' )
            // InternalD3ql.g:1352:2: ')'
            {
             before(grammarAccess.getFunctionCallAccess().getRightParenthesisKeyword_4()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getFunctionCallAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Group__4__Impl"


    // $ANTLR start "rule__FunctionCall__Group_3__0"
    // InternalD3ql.g:1362:1: rule__FunctionCall__Group_3__0 : rule__FunctionCall__Group_3__0__Impl rule__FunctionCall__Group_3__1 ;
    public final void rule__FunctionCall__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:1366:1: ( rule__FunctionCall__Group_3__0__Impl rule__FunctionCall__Group_3__1 )
            // InternalD3ql.g:1367:2: rule__FunctionCall__Group_3__0__Impl rule__FunctionCall__Group_3__1
            {
            pushFollow(FOLLOW_8);
            rule__FunctionCall__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FunctionCall__Group_3__1();

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
    // $ANTLR end "rule__FunctionCall__Group_3__0"


    // $ANTLR start "rule__FunctionCall__Group_3__0__Impl"
    // InternalD3ql.g:1374:1: rule__FunctionCall__Group_3__0__Impl : ( ',' ) ;
    public final void rule__FunctionCall__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:1378:1: ( ( ',' ) )
            // InternalD3ql.g:1379:1: ( ',' )
            {
            // InternalD3ql.g:1379:1: ( ',' )
            // InternalD3ql.g:1380:2: ','
            {
             before(grammarAccess.getFunctionCallAccess().getCommaKeyword_3_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getFunctionCallAccess().getCommaKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Group_3__0__Impl"


    // $ANTLR start "rule__FunctionCall__Group_3__1"
    // InternalD3ql.g:1389:1: rule__FunctionCall__Group_3__1 : rule__FunctionCall__Group_3__1__Impl ;
    public final void rule__FunctionCall__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:1393:1: ( rule__FunctionCall__Group_3__1__Impl )
            // InternalD3ql.g:1394:2: rule__FunctionCall__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FunctionCall__Group_3__1__Impl();

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
    // $ANTLR end "rule__FunctionCall__Group_3__1"


    // $ANTLR start "rule__FunctionCall__Group_3__1__Impl"
    // InternalD3ql.g:1400:1: rule__FunctionCall__Group_3__1__Impl : ( ( rule__FunctionCall__ArgumentsAssignment_3_1 ) ) ;
    public final void rule__FunctionCall__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:1404:1: ( ( ( rule__FunctionCall__ArgumentsAssignment_3_1 ) ) )
            // InternalD3ql.g:1405:1: ( ( rule__FunctionCall__ArgumentsAssignment_3_1 ) )
            {
            // InternalD3ql.g:1405:1: ( ( rule__FunctionCall__ArgumentsAssignment_3_1 ) )
            // InternalD3ql.g:1406:2: ( rule__FunctionCall__ArgumentsAssignment_3_1 )
            {
             before(grammarAccess.getFunctionCallAccess().getArgumentsAssignment_3_1()); 
            // InternalD3ql.g:1407:2: ( rule__FunctionCall__ArgumentsAssignment_3_1 )
            // InternalD3ql.g:1407:3: rule__FunctionCall__ArgumentsAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__FunctionCall__ArgumentsAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getFunctionCallAccess().getArgumentsAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Group_3__1__Impl"


    // $ANTLR start "rule__Query__FromStatementAssignment_0"
    // InternalD3ql.g:1416:1: rule__Query__FromStatementAssignment_0 : ( ruleFromStatement ) ;
    public final void rule__Query__FromStatementAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:1420:1: ( ( ruleFromStatement ) )
            // InternalD3ql.g:1421:2: ( ruleFromStatement )
            {
            // InternalD3ql.g:1421:2: ( ruleFromStatement )
            // InternalD3ql.g:1422:3: ruleFromStatement
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
    // InternalD3ql.g:1431:1: rule__Query__SelectStatementAssignment_1 : ( ruleSelectStatement ) ;
    public final void rule__Query__SelectStatementAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:1435:1: ( ( ruleSelectStatement ) )
            // InternalD3ql.g:1436:2: ( ruleSelectStatement )
            {
            // InternalD3ql.g:1436:2: ( ruleSelectStatement )
            // InternalD3ql.g:1437:3: ruleSelectStatement
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
    // InternalD3ql.g:1446:1: rule__FromStatement__AggregatesAssignment_1 : ( ruleAggregateRoot ) ;
    public final void rule__FromStatement__AggregatesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:1450:1: ( ( ruleAggregateRoot ) )
            // InternalD3ql.g:1451:2: ( ruleAggregateRoot )
            {
            // InternalD3ql.g:1451:2: ( ruleAggregateRoot )
            // InternalD3ql.g:1452:3: ruleAggregateRoot
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
    // InternalD3ql.g:1461:1: rule__FromStatement__AggregatesAssignment_2_1 : ( ruleAggregateRoot ) ;
    public final void rule__FromStatement__AggregatesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:1465:1: ( ( ruleAggregateRoot ) )
            // InternalD3ql.g:1466:2: ( ruleAggregateRoot )
            {
            // InternalD3ql.g:1466:2: ( ruleAggregateRoot )
            // InternalD3ql.g:1467:3: ruleAggregateRoot
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
    // InternalD3ql.g:1476:1: rule__AggregateRoot__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__AggregateRoot__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:1480:1: ( ( RULE_ID ) )
            // InternalD3ql.g:1481:2: ( RULE_ID )
            {
            // InternalD3ql.g:1481:2: ( RULE_ID )
            // InternalD3ql.g:1482:3: RULE_ID
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
    // InternalD3ql.g:1491:1: rule__AggregateRoot__AliasAssignment_1_1 : ( ruleAlias ) ;
    public final void rule__AggregateRoot__AliasAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:1495:1: ( ( ruleAlias ) )
            // InternalD3ql.g:1496:2: ( ruleAlias )
            {
            // InternalD3ql.g:1496:2: ( ruleAlias )
            // InternalD3ql.g:1497:3: ruleAlias
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
    // InternalD3ql.g:1506:1: rule__Alias__NameAssignment : ( RULE_ID ) ;
    public final void rule__Alias__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:1510:1: ( ( RULE_ID ) )
            // InternalD3ql.g:1511:2: ( RULE_ID )
            {
            // InternalD3ql.g:1511:2: ( RULE_ID )
            // InternalD3ql.g:1512:3: RULE_ID
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


    // $ANTLR start "rule__SelectStatement__ExpressionsAssignment_1"
    // InternalD3ql.g:1521:1: rule__SelectStatement__ExpressionsAssignment_1 : ( ruleSelectExpression ) ;
    public final void rule__SelectStatement__ExpressionsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:1525:1: ( ( ruleSelectExpression ) )
            // InternalD3ql.g:1526:2: ( ruleSelectExpression )
            {
            // InternalD3ql.g:1526:2: ( ruleSelectExpression )
            // InternalD3ql.g:1527:3: ruleSelectExpression
            {
             before(grammarAccess.getSelectStatementAccess().getExpressionsSelectExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSelectExpression();

            state._fsp--;

             after(grammarAccess.getSelectStatementAccess().getExpressionsSelectExpressionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectStatement__ExpressionsAssignment_1"


    // $ANTLR start "rule__SelectStatement__ExpressionsAssignment_2_1"
    // InternalD3ql.g:1536:1: rule__SelectStatement__ExpressionsAssignment_2_1 : ( ruleSelectExpression ) ;
    public final void rule__SelectStatement__ExpressionsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:1540:1: ( ( ruleSelectExpression ) )
            // InternalD3ql.g:1541:2: ( ruleSelectExpression )
            {
            // InternalD3ql.g:1541:2: ( ruleSelectExpression )
            // InternalD3ql.g:1542:3: ruleSelectExpression
            {
             before(grammarAccess.getSelectStatementAccess().getExpressionsSelectExpressionParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSelectExpression();

            state._fsp--;

             after(grammarAccess.getSelectStatementAccess().getExpressionsSelectExpressionParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectStatement__ExpressionsAssignment_2_1"


    // $ANTLR start "rule__SelectExpression__ExpressionAssignment_0"
    // InternalD3ql.g:1551:1: rule__SelectExpression__ExpressionAssignment_0 : ( ( rule__SelectExpression__ExpressionAlternatives_0_0 ) ) ;
    public final void rule__SelectExpression__ExpressionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:1555:1: ( ( ( rule__SelectExpression__ExpressionAlternatives_0_0 ) ) )
            // InternalD3ql.g:1556:2: ( ( rule__SelectExpression__ExpressionAlternatives_0_0 ) )
            {
            // InternalD3ql.g:1556:2: ( ( rule__SelectExpression__ExpressionAlternatives_0_0 ) )
            // InternalD3ql.g:1557:3: ( rule__SelectExpression__ExpressionAlternatives_0_0 )
            {
             before(grammarAccess.getSelectExpressionAccess().getExpressionAlternatives_0_0()); 
            // InternalD3ql.g:1558:3: ( rule__SelectExpression__ExpressionAlternatives_0_0 )
            // InternalD3ql.g:1558:4: rule__SelectExpression__ExpressionAlternatives_0_0
            {
            pushFollow(FOLLOW_2);
            rule__SelectExpression__ExpressionAlternatives_0_0();

            state._fsp--;


            }

             after(grammarAccess.getSelectExpressionAccess().getExpressionAlternatives_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectExpression__ExpressionAssignment_0"


    // $ANTLR start "rule__SelectExpression__AliasAssignment_1_1"
    // InternalD3ql.g:1566:1: rule__SelectExpression__AliasAssignment_1_1 : ( ruleAlias ) ;
    public final void rule__SelectExpression__AliasAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:1570:1: ( ( ruleAlias ) )
            // InternalD3ql.g:1571:2: ( ruleAlias )
            {
            // InternalD3ql.g:1571:2: ( ruleAlias )
            // InternalD3ql.g:1572:3: ruleAlias
            {
             before(grammarAccess.getSelectExpressionAccess().getAliasAliasParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAlias();

            state._fsp--;

             after(grammarAccess.getSelectExpressionAccess().getAliasAliasParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectExpression__AliasAssignment_1_1"


    // $ANTLR start "rule__PathExpression__HeadAssignment_0"
    // InternalD3ql.g:1581:1: rule__PathExpression__HeadAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__PathExpression__HeadAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:1585:1: ( ( ( RULE_ID ) ) )
            // InternalD3ql.g:1586:2: ( ( RULE_ID ) )
            {
            // InternalD3ql.g:1586:2: ( ( RULE_ID ) )
            // InternalD3ql.g:1587:3: ( RULE_ID )
            {
             before(grammarAccess.getPathExpressionAccess().getHeadNamedCrossReference_0_0()); 
            // InternalD3ql.g:1588:3: ( RULE_ID )
            // InternalD3ql.g:1589:4: RULE_ID
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


    // $ANTLR start "rule__PathExpression__TailAssignment_1_1_0"
    // InternalD3ql.g:1600:1: rule__PathExpression__TailAssignment_1_1_0 : ( rulePathElement ) ;
    public final void rule__PathExpression__TailAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:1604:1: ( ( rulePathElement ) )
            // InternalD3ql.g:1605:2: ( rulePathElement )
            {
            // InternalD3ql.g:1605:2: ( rulePathElement )
            // InternalD3ql.g:1606:3: rulePathElement
            {
             before(grammarAccess.getPathExpressionAccess().getTailPathElementParserRuleCall_1_1_0_0()); 
            pushFollow(FOLLOW_2);
            rulePathElement();

            state._fsp--;

             after(grammarAccess.getPathExpressionAccess().getTailPathElementParserRuleCall_1_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PathExpression__TailAssignment_1_1_0"


    // $ANTLR start "rule__PathExpression__TailAssignment_1_2"
    // InternalD3ql.g:1615:1: rule__PathExpression__TailAssignment_1_2 : ( rulePathElement ) ;
    public final void rule__PathExpression__TailAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:1619:1: ( ( rulePathElement ) )
            // InternalD3ql.g:1620:2: ( rulePathElement )
            {
            // InternalD3ql.g:1620:2: ( rulePathElement )
            // InternalD3ql.g:1621:3: rulePathElement
            {
             before(grammarAccess.getPathExpressionAccess().getTailPathElementParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            rulePathElement();

            state._fsp--;

             after(grammarAccess.getPathExpressionAccess().getTailPathElementParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PathExpression__TailAssignment_1_2"


    // $ANTLR start "rule__PathElement__NameAssignment"
    // InternalD3ql.g:1630:1: rule__PathElement__NameAssignment : ( RULE_ID ) ;
    public final void rule__PathElement__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:1634:1: ( ( RULE_ID ) )
            // InternalD3ql.g:1635:2: ( RULE_ID )
            {
            // InternalD3ql.g:1635:2: ( RULE_ID )
            // InternalD3ql.g:1636:3: RULE_ID
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


    // $ANTLR start "rule__FunctionCall__FunctionAssignment_0"
    // InternalD3ql.g:1645:1: rule__FunctionCall__FunctionAssignment_0 : ( RULE_ID ) ;
    public final void rule__FunctionCall__FunctionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:1649:1: ( ( RULE_ID ) )
            // InternalD3ql.g:1650:2: ( RULE_ID )
            {
            // InternalD3ql.g:1650:2: ( RULE_ID )
            // InternalD3ql.g:1651:3: RULE_ID
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


    // $ANTLR start "rule__FunctionCall__ArgumentsAssignment_2"
    // InternalD3ql.g:1660:1: rule__FunctionCall__ArgumentsAssignment_2 : ( ruleFunctionArgument ) ;
    public final void rule__FunctionCall__ArgumentsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:1664:1: ( ( ruleFunctionArgument ) )
            // InternalD3ql.g:1665:2: ( ruleFunctionArgument )
            {
            // InternalD3ql.g:1665:2: ( ruleFunctionArgument )
            // InternalD3ql.g:1666:3: ruleFunctionArgument
            {
             before(grammarAccess.getFunctionCallAccess().getArgumentsFunctionArgumentParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleFunctionArgument();

            state._fsp--;

             after(grammarAccess.getFunctionCallAccess().getArgumentsFunctionArgumentParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__ArgumentsAssignment_2"


    // $ANTLR start "rule__FunctionCall__ArgumentsAssignment_3_1"
    // InternalD3ql.g:1675:1: rule__FunctionCall__ArgumentsAssignment_3_1 : ( ruleFunctionArgument ) ;
    public final void rule__FunctionCall__ArgumentsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:1679:1: ( ( ruleFunctionArgument ) )
            // InternalD3ql.g:1680:2: ( ruleFunctionArgument )
            {
            // InternalD3ql.g:1680:2: ( ruleFunctionArgument )
            // InternalD3ql.g:1681:3: ruleFunctionArgument
            {
             before(grammarAccess.getFunctionCallAccess().getArgumentsFunctionArgumentParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFunctionArgument();

            state._fsp--;

             after(grammarAccess.getFunctionCallAccess().getArgumentsFunctionArgumentParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__ArgumentsAssignment_3_1"


    // $ANTLR start "rule__FunctionArgument__ValueAssignment"
    // InternalD3ql.g:1690:1: rule__FunctionArgument__ValueAssignment : ( ( rule__FunctionArgument__ValueAlternatives_0 ) ) ;
    public final void rule__FunctionArgument__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:1694:1: ( ( ( rule__FunctionArgument__ValueAlternatives_0 ) ) )
            // InternalD3ql.g:1695:2: ( ( rule__FunctionArgument__ValueAlternatives_0 ) )
            {
            // InternalD3ql.g:1695:2: ( ( rule__FunctionArgument__ValueAlternatives_0 ) )
            // InternalD3ql.g:1696:3: ( rule__FunctionArgument__ValueAlternatives_0 )
            {
             before(grammarAccess.getFunctionArgumentAccess().getValueAlternatives_0()); 
            // InternalD3ql.g:1697:3: ( rule__FunctionArgument__ValueAlternatives_0 )
            // InternalD3ql.g:1697:4: rule__FunctionArgument__ValueAlternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__FunctionArgument__ValueAlternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getFunctionArgumentAccess().getValueAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionArgument__ValueAssignment"


    // $ANTLR start "rule__IntegerLiteral__ValueAssignment"
    // InternalD3ql.g:1705:1: rule__IntegerLiteral__ValueAssignment : ( RULE_INT ) ;
    public final void rule__IntegerLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:1709:1: ( ( RULE_INT ) )
            // InternalD3ql.g:1710:2: ( RULE_INT )
            {
            // InternalD3ql.g:1710:2: ( RULE_INT )
            // InternalD3ql.g:1711:3: RULE_INT
            {
             before(grammarAccess.getIntegerLiteralAccess().getValueINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getIntegerLiteralAccess().getValueINTTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerLiteral__ValueAssignment"


    // $ANTLR start "rule__StringLiteral__ValueAssignment"
    // InternalD3ql.g:1720:1: rule__StringLiteral__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__StringLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:1724:1: ( ( RULE_STRING ) )
            // InternalD3ql.g:1725:2: ( RULE_STRING )
            {
            // InternalD3ql.g:1725:2: ( RULE_STRING )
            // InternalD3ql.g:1726:3: RULE_STRING
            {
             before(grammarAccess.getStringLiteralAccess().getValueSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getStringLiteralAccess().getValueSTRINGTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringLiteral__ValueAssignment"


    // $ANTLR start "rule__BooleanLiteral__ValueAssignment"
    // InternalD3ql.g:1735:1: rule__BooleanLiteral__ValueAssignment : ( ( rule__BooleanLiteral__ValueAlternatives_0 ) ) ;
    public final void rule__BooleanLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalD3ql.g:1739:1: ( ( ( rule__BooleanLiteral__ValueAlternatives_0 ) ) )
            // InternalD3ql.g:1740:2: ( ( rule__BooleanLiteral__ValueAlternatives_0 ) )
            {
            // InternalD3ql.g:1740:2: ( ( rule__BooleanLiteral__ValueAlternatives_0 ) )
            // InternalD3ql.g:1741:3: ( rule__BooleanLiteral__ValueAlternatives_0 )
            {
             before(grammarAccess.getBooleanLiteralAccess().getValueAlternatives_0()); 
            // InternalD3ql.g:1742:3: ( rule__BooleanLiteral__ValueAlternatives_0 )
            // InternalD3ql.g:1742:4: rule__BooleanLiteral__ValueAlternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__BooleanLiteral__ValueAlternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getBooleanLiteralAccess().getValueAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanLiteral__ValueAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000001870L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000084000L});

}