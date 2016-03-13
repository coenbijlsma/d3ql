/*
 * generated by Xtext 2.9.2
 */
package nl.coenbijlsma.languages.d3ql.serializer;

import com.google.inject.Inject;
import java.util.Set;
import nl.coenbijlsma.languages.d3ql.d3ql.AggregateRoot;
import nl.coenbijlsma.languages.d3ql.d3ql.Alias;
import nl.coenbijlsma.languages.d3ql.d3ql.D3qlPackage;
import nl.coenbijlsma.languages.d3ql.d3ql.FromStatement;
import nl.coenbijlsma.languages.d3ql.d3ql.PathElement;
import nl.coenbijlsma.languages.d3ql.d3ql.PathExpression;
import nl.coenbijlsma.languages.d3ql.d3ql.Query;
import nl.coenbijlsma.languages.d3ql.d3ql.SelectStatement;
import nl.coenbijlsma.languages.d3ql.services.D3qlGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class D3qlSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private D3qlGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == D3qlPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case D3qlPackage.AGGREGATE_ROOT:
				sequence_AggregateRoot(context, (AggregateRoot) semanticObject); 
				return; 
			case D3qlPackage.ALIAS:
				sequence_Alias(context, (Alias) semanticObject); 
				return; 
			case D3qlPackage.FROM_STATEMENT:
				sequence_FromStatement(context, (FromStatement) semanticObject); 
				return; 
			case D3qlPackage.PATH_ELEMENT:
				sequence_PathElement(context, (PathElement) semanticObject); 
				return; 
			case D3qlPackage.PATH_EXPRESSION:
				sequence_PathExpression(context, (PathExpression) semanticObject); 
				return; 
			case D3qlPackage.QUERY:
				sequence_Query(context, (Query) semanticObject); 
				return; 
			case D3qlPackage.SELECT_STATEMENT:
				sequence_SelectStatement(context, (SelectStatement) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Named returns AggregateRoot
	 *     AggregateRoot returns AggregateRoot
	 *
	 * Constraint:
	 *     (name=ID alias=Alias?)
	 */
	protected void sequence_AggregateRoot(ISerializationContext context, AggregateRoot semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Named returns Alias
	 *     Alias returns Alias
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Alias(ISerializationContext context, Alias semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, D3qlPackage.Literals.NAMED__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, D3qlPackage.Literals.NAMED__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAliasAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     FromStatement returns FromStatement
	 *
	 * Constraint:
	 *     (aggregates+=AggregateRoot aggregates+=AggregateRoot*)
	 */
	protected void sequence_FromStatement(ISerializationContext context, FromStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     PathElement returns PathElement
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_PathElement(ISerializationContext context, PathElement semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, D3qlPackage.Literals.PATH_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, D3qlPackage.Literals.PATH_ELEMENT__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPathElementAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     PathExpression returns PathExpression
	 *
	 * Constraint:
	 *     (head=[Named|ID] tail+=PathElement* tail+=PathElement)
	 */
	protected void sequence_PathExpression(ISerializationContext context, PathExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Query returns Query
	 *
	 * Constraint:
	 *     (fromStatement=FromStatement selectStatement=SelectStatement)
	 */
	protected void sequence_Query(ISerializationContext context, Query semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, D3qlPackage.Literals.QUERY__FROM_STATEMENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, D3qlPackage.Literals.QUERY__FROM_STATEMENT));
			if (transientValues.isValueTransient(semanticObject, D3qlPackage.Literals.QUERY__SELECT_STATEMENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, D3qlPackage.Literals.QUERY__SELECT_STATEMENT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getQueryAccess().getFromStatementFromStatementParserRuleCall_0_0(), semanticObject.getFromStatement());
		feeder.accept(grammarAccess.getQueryAccess().getSelectStatementSelectStatementParserRuleCall_1_0(), semanticObject.getSelectStatement());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     SelectStatement returns SelectStatement
	 *
	 * Constraint:
	 *     (paths+=PathExpression paths+=PathExpression*)
	 */
	protected void sequence_SelectStatement(ISerializationContext context, SelectStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
