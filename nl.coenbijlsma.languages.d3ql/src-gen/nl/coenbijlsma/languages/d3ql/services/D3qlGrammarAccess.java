/*
 * generated by Xtext 2.9.2
 */
package nl.coenbijlsma.languages.d3ql.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class D3qlGrammarAccess extends AbstractGrammarElementFinder {
	
	public class QueryElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "nl.coenbijlsma.languages.d3ql.D3ql.Query");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cFromStatementAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cFromStatementFromStatementParserRuleCall_0_0 = (RuleCall)cFromStatementAssignment_0.eContents().get(0);
		private final Assignment cSelectStatementAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cSelectStatementSelectStatementParserRuleCall_1_0 = (RuleCall)cSelectStatementAssignment_1.eContents().get(0);
		
		//Query:
		//	fromStatement=FromStatement selectStatement=SelectStatement;
		@Override public ParserRule getRule() { return rule; }
		
		//fromStatement=FromStatement selectStatement=SelectStatement
		public Group getGroup() { return cGroup; }
		
		//fromStatement=FromStatement
		public Assignment getFromStatementAssignment_0() { return cFromStatementAssignment_0; }
		
		//FromStatement
		public RuleCall getFromStatementFromStatementParserRuleCall_0_0() { return cFromStatementFromStatementParserRuleCall_0_0; }
		
		//selectStatement=SelectStatement
		public Assignment getSelectStatementAssignment_1() { return cSelectStatementAssignment_1; }
		
		//SelectStatement
		public RuleCall getSelectStatementSelectStatementParserRuleCall_1_0() { return cSelectStatementSelectStatementParserRuleCall_1_0; }
	}
	public class FromStatementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "nl.coenbijlsma.languages.d3ql.D3ql.FromStatement");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cFromKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cAggregatesAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cAggregatesAggregateRootParserRuleCall_1_0 = (RuleCall)cAggregatesAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cCommaKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cAggregatesAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cAggregatesAggregateRootParserRuleCall_2_1_0 = (RuleCall)cAggregatesAssignment_2_1.eContents().get(0);
		
		//FromStatement:
		//	'from' aggregates+=AggregateRoot (',' aggregates+=AggregateRoot)*;
		@Override public ParserRule getRule() { return rule; }
		
		//'from' aggregates+=AggregateRoot (',' aggregates+=AggregateRoot)*
		public Group getGroup() { return cGroup; }
		
		//'from'
		public Keyword getFromKeyword_0() { return cFromKeyword_0; }
		
		//aggregates+=AggregateRoot
		public Assignment getAggregatesAssignment_1() { return cAggregatesAssignment_1; }
		
		//AggregateRoot
		public RuleCall getAggregatesAggregateRootParserRuleCall_1_0() { return cAggregatesAggregateRootParserRuleCall_1_0; }
		
		//(',' aggregates+=AggregateRoot)*
		public Group getGroup_2() { return cGroup_2; }
		
		//','
		public Keyword getCommaKeyword_2_0() { return cCommaKeyword_2_0; }
		
		//aggregates+=AggregateRoot
		public Assignment getAggregatesAssignment_2_1() { return cAggregatesAssignment_2_1; }
		
		//AggregateRoot
		public RuleCall getAggregatesAggregateRootParserRuleCall_2_1_0() { return cAggregatesAggregateRootParserRuleCall_2_1_0; }
	}
	public class NamedElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "nl.coenbijlsma.languages.d3ql.D3ql.Named");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cAggregateRootParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cAliasParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//Named:
		//	AggregateRoot | Alias;
		@Override public ParserRule getRule() { return rule; }
		
		//AggregateRoot | Alias
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//AggregateRoot
		public RuleCall getAggregateRootParserRuleCall_0() { return cAggregateRootParserRuleCall_0; }
		
		//Alias
		public RuleCall getAliasParserRuleCall_1() { return cAliasParserRuleCall_1; }
	}
	public class AggregateRootElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "nl.coenbijlsma.languages.d3ql.D3ql.AggregateRoot");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameIDTerminalRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cAsKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cAliasAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cAliasAliasParserRuleCall_1_1_0 = (RuleCall)cAliasAssignment_1_1.eContents().get(0);
		
		//AggregateRoot:
		//	name=ID ('as' alias=Alias)?;
		@Override public ParserRule getRule() { return rule; }
		
		//name=ID ('as' alias=Alias)?
		public Group getGroup() { return cGroup; }
		
		//name=ID
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0_0() { return cNameIDTerminalRuleCall_0_0; }
		
		//('as' alias=Alias)?
		public Group getGroup_1() { return cGroup_1; }
		
		//'as'
		public Keyword getAsKeyword_1_0() { return cAsKeyword_1_0; }
		
		//alias=Alias
		public Assignment getAliasAssignment_1_1() { return cAliasAssignment_1_1; }
		
		//Alias
		public RuleCall getAliasAliasParserRuleCall_1_1_0() { return cAliasAliasParserRuleCall_1_1_0; }
	}
	public class AliasElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "nl.coenbijlsma.languages.d3ql.D3ql.Alias");
		private final Assignment cNameAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_0 = (RuleCall)cNameAssignment.eContents().get(0);
		
		//Alias:
		//	name=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//name=ID
		public Assignment getNameAssignment() { return cNameAssignment; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0() { return cNameIDTerminalRuleCall_0; }
	}
	public class SelectStatementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "nl.coenbijlsma.languages.d3ql.D3ql.SelectStatement");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cSelectKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cPathsAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cPathsPathExpressionParserRuleCall_1_0 = (RuleCall)cPathsAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cCommaKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cPathsAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cPathsPathExpressionParserRuleCall_2_1_0 = (RuleCall)cPathsAssignment_2_1.eContents().get(0);
		
		//SelectStatement:
		//	'select' paths+=PathExpression (',' paths+=PathExpression)*;
		@Override public ParserRule getRule() { return rule; }
		
		//'select' paths+=PathExpression (',' paths+=PathExpression)*
		public Group getGroup() { return cGroup; }
		
		//'select'
		public Keyword getSelectKeyword_0() { return cSelectKeyword_0; }
		
		//paths+=PathExpression
		public Assignment getPathsAssignment_1() { return cPathsAssignment_1; }
		
		//PathExpression
		public RuleCall getPathsPathExpressionParserRuleCall_1_0() { return cPathsPathExpressionParserRuleCall_1_0; }
		
		//(',' paths+=PathExpression)*
		public Group getGroup_2() { return cGroup_2; }
		
		//','
		public Keyword getCommaKeyword_2_0() { return cCommaKeyword_2_0; }
		
		//paths+=PathExpression
		public Assignment getPathsAssignment_2_1() { return cPathsAssignment_2_1; }
		
		//PathExpression
		public RuleCall getPathsPathExpressionParserRuleCall_2_1_0() { return cPathsPathExpressionParserRuleCall_2_1_0; }
	}
	public class PathExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "nl.coenbijlsma.languages.d3ql.D3ql.PathExpression");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cHeadAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final CrossReference cHeadNamedCrossReference_0_0 = (CrossReference)cHeadAssignment_0.eContents().get(0);
		private final RuleCall cHeadNamedIDTerminalRuleCall_0_0_1 = (RuleCall)cHeadNamedCrossReference_0_0.eContents().get(1);
		private final Keyword cFullStopKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Assignment cTailAssignment_2_0 = (Assignment)cGroup_2.eContents().get(0);
		private final RuleCall cTailPathElementParserRuleCall_2_0_0 = (RuleCall)cTailAssignment_2_0.eContents().get(0);
		private final Keyword cFullStopKeyword_2_1 = (Keyword)cGroup_2.eContents().get(1);
		private final Assignment cTailAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cTailPathElementParserRuleCall_3_0 = (RuleCall)cTailAssignment_3.eContents().get(0);
		
		//PathExpression:
		//	head=[Named] '.' (tail+=PathElement '.')* tail+=PathElement;
		@Override public ParserRule getRule() { return rule; }
		
		//head=[Named] '.' (tail+=PathElement '.')* tail+=PathElement
		public Group getGroup() { return cGroup; }
		
		//head=[Named]
		public Assignment getHeadAssignment_0() { return cHeadAssignment_0; }
		
		//[Named]
		public CrossReference getHeadNamedCrossReference_0_0() { return cHeadNamedCrossReference_0_0; }
		
		//ID
		public RuleCall getHeadNamedIDTerminalRuleCall_0_0_1() { return cHeadNamedIDTerminalRuleCall_0_0_1; }
		
		//'.'
		public Keyword getFullStopKeyword_1() { return cFullStopKeyword_1; }
		
		//(tail+=PathElement '.')*
		public Group getGroup_2() { return cGroup_2; }
		
		//tail+=PathElement
		public Assignment getTailAssignment_2_0() { return cTailAssignment_2_0; }
		
		//PathElement
		public RuleCall getTailPathElementParserRuleCall_2_0_0() { return cTailPathElementParserRuleCall_2_0_0; }
		
		//'.'
		public Keyword getFullStopKeyword_2_1() { return cFullStopKeyword_2_1; }
		
		//tail+=PathElement
		public Assignment getTailAssignment_3() { return cTailAssignment_3; }
		
		//PathElement
		public RuleCall getTailPathElementParserRuleCall_3_0() { return cTailPathElementParserRuleCall_3_0; }
	}
	public class PathElementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "nl.coenbijlsma.languages.d3ql.D3ql.PathElement");
		private final Assignment cNameAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_0 = (RuleCall)cNameAssignment.eContents().get(0);
		
		//PathElement:
		//	name=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//name=ID
		public Assignment getNameAssignment() { return cNameAssignment; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0() { return cNameIDTerminalRuleCall_0; }
	}
	
	
	private final QueryElements pQuery;
	private final FromStatementElements pFromStatement;
	private final NamedElements pNamed;
	private final AggregateRootElements pAggregateRoot;
	private final AliasElements pAlias;
	private final SelectStatementElements pSelectStatement;
	private final PathExpressionElements pPathExpression;
	private final PathElementElements pPathElement;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public D3qlGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pQuery = new QueryElements();
		this.pFromStatement = new FromStatementElements();
		this.pNamed = new NamedElements();
		this.pAggregateRoot = new AggregateRootElements();
		this.pAlias = new AliasElements();
		this.pSelectStatement = new SelectStatementElements();
		this.pPathExpression = new PathExpressionElements();
		this.pPathElement = new PathElementElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("nl.coenbijlsma.languages.d3ql.D3ql".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Query:
	//	fromStatement=FromStatement selectStatement=SelectStatement;
	public QueryElements getQueryAccess() {
		return pQuery;
	}
	
	public ParserRule getQueryRule() {
		return getQueryAccess().getRule();
	}
	
	//FromStatement:
	//	'from' aggregates+=AggregateRoot (',' aggregates+=AggregateRoot)*;
	public FromStatementElements getFromStatementAccess() {
		return pFromStatement;
	}
	
	public ParserRule getFromStatementRule() {
		return getFromStatementAccess().getRule();
	}
	
	//Named:
	//	AggregateRoot | Alias;
	public NamedElements getNamedAccess() {
		return pNamed;
	}
	
	public ParserRule getNamedRule() {
		return getNamedAccess().getRule();
	}
	
	//AggregateRoot:
	//	name=ID ('as' alias=Alias)?;
	public AggregateRootElements getAggregateRootAccess() {
		return pAggregateRoot;
	}
	
	public ParserRule getAggregateRootRule() {
		return getAggregateRootAccess().getRule();
	}
	
	//Alias:
	//	name=ID;
	public AliasElements getAliasAccess() {
		return pAlias;
	}
	
	public ParserRule getAliasRule() {
		return getAliasAccess().getRule();
	}
	
	//SelectStatement:
	//	'select' paths+=PathExpression (',' paths+=PathExpression)*;
	public SelectStatementElements getSelectStatementAccess() {
		return pSelectStatement;
	}
	
	public ParserRule getSelectStatementRule() {
		return getSelectStatementAccess().getRule();
	}
	
	//PathExpression:
	//	head=[Named] '.' (tail+=PathElement '.')* tail+=PathElement;
	public PathExpressionElements getPathExpressionAccess() {
		return pPathExpression;
	}
	
	public ParserRule getPathExpressionRule() {
		return getPathExpressionAccess().getRule();
	}
	
	//PathElement:
	//	name=ID;
	public PathElementElements getPathElementAccess() {
		return pPathElement;
	}
	
	public ParserRule getPathElementRule() {
		return getPathElementAccess().getRule();
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' |
	//	"'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/ *'->'* /';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
