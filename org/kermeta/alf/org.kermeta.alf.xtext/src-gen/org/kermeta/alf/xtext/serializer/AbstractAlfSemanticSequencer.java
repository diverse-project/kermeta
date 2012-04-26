package org.kermeta.alf.xtext.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.kermeta.alf.xtext.alf.AcceptBlock;
import org.kermeta.alf.xtext.alf.AcceptClause;
import org.kermeta.alf.xtext.alf.AcceptStatement;
import org.kermeta.alf.xtext.alf.AccessCompletion;
import org.kermeta.alf.xtext.alf.AdditiveExpression;
import org.kermeta.alf.xtext.alf.AlfPackage;
import org.kermeta.alf.xtext.alf.AndExpression;
import org.kermeta.alf.xtext.alf.AnnotatedStatement;
import org.kermeta.alf.xtext.alf.Annotation;
import org.kermeta.alf.xtext.alf.AssignmentCompletion;
import org.kermeta.alf.xtext.alf.BOOLEAN_LITERAL;
import org.kermeta.alf.xtext.alf.Block;
import org.kermeta.alf.xtext.alf.BlockStatement;
import org.kermeta.alf.xtext.alf.BreakStatement;
import org.kermeta.alf.xtext.alf.CLASSOP;
import org.kermeta.alf.xtext.alf.CLASSSTRUCT;
import org.kermeta.alf.xtext.alf.ClassExtentExpression;
import org.kermeta.alf.xtext.alf.ClassificationClause;
import org.kermeta.alf.xtext.alf.ClassificationExpression;
import org.kermeta.alf.xtext.alf.ClassificationFromClause;
import org.kermeta.alf.xtext.alf.ClassificationToClause;
import org.kermeta.alf.xtext.alf.ClassifyStatement;
import org.kermeta.alf.xtext.alf.CollectOrIterateOperation;
import org.kermeta.alf.xtext.alf.CompoundAcceptStatementCompletion;
import org.kermeta.alf.xtext.alf.ConcurrentClauses;
import org.kermeta.alf.xtext.alf.ConditionalAndExpression;
import org.kermeta.alf.xtext.alf.ConditionalOrExpression;
import org.kermeta.alf.xtext.alf.ConditionalTestExpression;
import org.kermeta.alf.xtext.alf.DoStatement;
import org.kermeta.alf.xtext.alf.DocumentedStatement;
import org.kermeta.alf.xtext.alf.EmptyStatement;
import org.kermeta.alf.xtext.alf.EqualityExpression;
import org.kermeta.alf.xtext.alf.ExclusiveOrExpression;
import org.kermeta.alf.xtext.alf.FinalClause;
import org.kermeta.alf.xtext.alf.ForAllOrExistsOrOneOperation;
import org.kermeta.alf.xtext.alf.ForControl;
import org.kermeta.alf.xtext.alf.ForStatement;
import org.kermeta.alf.xtext.alf.INTEGER_LITERAL;
import org.kermeta.alf.xtext.alf.IfStatement;
import org.kermeta.alf.xtext.alf.InclusiveOrExpression;
import org.kermeta.alf.xtext.alf.InlineStatement;
import org.kermeta.alf.xtext.alf.InstanceCreationExpression;
import org.kermeta.alf.xtext.alf.InstanceCreationInvocationStatement;
import org.kermeta.alf.xtext.alf.InvocationOrAssignementOrDeclarationStatement;
import org.kermeta.alf.xtext.alf.IsUniqueOperation;
import org.kermeta.alf.xtext.alf.LinkOperationExpression;
import org.kermeta.alf.xtext.alf.LinkOperationTuple;
import org.kermeta.alf.xtext.alf.LinkOperationTupleElement;
import org.kermeta.alf.xtext.alf.LocalNameDeclarationStatement;
import org.kermeta.alf.xtext.alf.LoopVariableDefinition;
import org.kermeta.alf.xtext.alf.MultiplicativeExpression;
import org.kermeta.alf.xtext.alf.NameExpression;
import org.kermeta.alf.xtext.alf.NamedTemplateBinding;
import org.kermeta.alf.xtext.alf.NonEmptyStatementSequence;
import org.kermeta.alf.xtext.alf.NonFinalClause;
import org.kermeta.alf.xtext.alf.NullExpression;
import org.kermeta.alf.xtext.alf.OperationCallExpression;
import org.kermeta.alf.xtext.alf.OperationCallExpressionWithoutDot;
import org.kermeta.alf.xtext.alf.ParenthesizedExpression;
import org.kermeta.alf.xtext.alf.PartialSequenceConstructionCompletion;
import org.kermeta.alf.xtext.alf.PrimaryExpression;
import org.kermeta.alf.xtext.alf.PropertyCallExpression;
import org.kermeta.alf.xtext.alf.QualifiedNameList;
import org.kermeta.alf.xtext.alf.QualifiedNamePath;
import org.kermeta.alf.xtext.alf.QualifiedNameWithBinding;
import org.kermeta.alf.xtext.alf.ReclassifyAllClause;
import org.kermeta.alf.xtext.alf.RelationalExpression;
import org.kermeta.alf.xtext.alf.ReturnStatement;
import org.kermeta.alf.xtext.alf.STRING_LITERAL;
import org.kermeta.alf.xtext.alf.SelectOrRejectOperation;
import org.kermeta.alf.xtext.alf.SequenceConstructionCompletion;
import org.kermeta.alf.xtext.alf.SequenceConstructionExpression;
import org.kermeta.alf.xtext.alf.SequenceConstructionOrAccessCompletion;
import org.kermeta.alf.xtext.alf.SequenceOperationExpression;
import org.kermeta.alf.xtext.alf.SequenceReductionExpression;
import org.kermeta.alf.xtext.alf.SequentialClauses;
import org.kermeta.alf.xtext.alf.ShiftExpression;
import org.kermeta.alf.xtext.alf.SimpleAcceptStatementCompletion;
import org.kermeta.alf.xtext.alf.StatementSequence;
import org.kermeta.alf.xtext.alf.SuperInvocationExpression;
import org.kermeta.alf.xtext.alf.SuperInvocationStatement;
import org.kermeta.alf.xtext.alf.SwitchCase;
import org.kermeta.alf.xtext.alf.SwitchClause;
import org.kermeta.alf.xtext.alf.SwitchDefaultClause;
import org.kermeta.alf.xtext.alf.SwitchStatement;
import org.kermeta.alf.xtext.alf.TemplateBinding;
import org.kermeta.alf.xtext.alf.ThisExpression;
import org.kermeta.alf.xtext.alf.ThisInvocationStatement;
import org.kermeta.alf.xtext.alf.Tuple;
import org.kermeta.alf.xtext.alf.TupleElement;
import org.kermeta.alf.xtext.alf.UNLIMITED_LITERAL;
import org.kermeta.alf.xtext.alf.UnaryExpression;
import org.kermeta.alf.xtext.alf.UnqualifiedName;
import org.kermeta.alf.xtext.alf.VariableDeclarationCompletion;
import org.kermeta.alf.xtext.alf.WhileStatement;
import org.kermeta.alf.xtext.services.AlfGrammarAccess;

@SuppressWarnings("restriction")
public class AbstractAlfSemanticSequencer extends AbstractSemanticSequencer {

	@Inject
	protected AlfGrammarAccess grammarAccess;
	
	@Inject
	protected ISemanticSequencerDiagnosticProvider diagnosticProvider;
	
	@Inject
	protected ITransientValueService transientValues;
	
	@Inject
	@GenericSequencer
	protected Provider<ISemanticSequencer> genericSequencerProvider;
	
	protected ISemanticSequencer genericSequencer;
	
	
	@Override
	public void init(ISemanticSequencer sequencer, ISemanticSequenceAcceptor sequenceAcceptor, Acceptor errorAcceptor) {
		super.init(sequencer, sequenceAcceptor, errorAcceptor);
		this.genericSequencer = genericSequencerProvider.get();
		this.genericSequencer.init(sequencer, sequenceAcceptor, errorAcceptor);
	}
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == AlfPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case AlfPackage.ACCEPT_BLOCK:
				if(context == grammarAccess.getAcceptBlockRule()) {
					sequence_AcceptBlock(context, (AcceptBlock) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.ACCEPT_CLAUSE:
				if(context == grammarAccess.getAcceptClauseRule()) {
					sequence_AcceptClause(context, (AcceptClause) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.ACCEPT_STATEMENT:
				if(context == grammarAccess.getAcceptStatementRule() ||
				   context == grammarAccess.getStatementRule()) {
					sequence_AcceptStatement(context, (AcceptStatement) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.ACCESS_COMPLETION:
				if(context == grammarAccess.getAccessCompletionRule()) {
					sequence_AccessCompletion(context, (AccessCompletion) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.ADDITIVE_EXPRESSION:
				if(context == grammarAccess.getAdditiveExpressionRule()) {
					sequence_AdditiveExpression(context, (AdditiveExpression) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.AND_EXPRESSION:
				if(context == grammarAccess.getAndExpressionRule()) {
					sequence_AndExpression(context, (AndExpression) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.ANNOTATED_STATEMENT:
				if(context == grammarAccess.getAnnotatedStatementRule() ||
				   context == grammarAccess.getStatementRule()) {
					sequence_AnnotatedStatement(context, (AnnotatedStatement) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.ANNOTATION:
				if(context == grammarAccess.getAnnotationRule()) {
					sequence_Annotation(context, (Annotation) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.ASSIGNMENT_COMPLETION:
				if(context == grammarAccess.getAssignmentCompletionRule()) {
					sequence_AssignmentCompletion(context, (AssignmentCompletion) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.BOOLEAN_LITERAL:
				if(context == grammarAccess.getBOOLEAN_LITERALRule() ||
				   context == grammarAccess.getLITERALRule() ||
				   context == grammarAccess.getValueSpecificationRule()) {
					sequence_BOOLEAN_LITERAL(context, (BOOLEAN_LITERAL) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.BLOCK:
				if(context == grammarAccess.getBlockRule()) {
					sequence_Block(context, (Block) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.BLOCK_STATEMENT:
				if(context == grammarAccess.getBlockStatementRule() ||
				   context == grammarAccess.getStatementRule()) {
					sequence_BlockStatement(context, (BlockStatement) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.BREAK_STATEMENT:
				if(context == grammarAccess.getBreakStatementRule() ||
				   context == grammarAccess.getStatementRule()) {
					sequence_Statement(context, (BreakStatement) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.CLASSOP:
				if(context == grammarAccess.getCLASSOPRule()) {
					sequence_CLASSOP(context, (CLASSOP) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.CLASSSTRUCT:
				if(context == grammarAccess.getCLASSSTRUCTRule()) {
					sequence_CLASSSTRUCT(context, (CLASSSTRUCT) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.CLASS_EXTENT_EXPRESSION:
				if(context == grammarAccess.getClassExtentExpressionRule() ||
				   context == grammarAccess.getSuffixExpressionRule()) {
					sequence_SuffixExpression(context, (ClassExtentExpression) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.CLASSIFICATION_CLAUSE:
				if(context == grammarAccess.getClassificationClauseRule()) {
					sequence_ClassificationClause(context, (ClassificationClause) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.CLASSIFICATION_EXPRESSION:
				if(context == grammarAccess.getClassificationExpressionRule()) {
					sequence_ClassificationExpression(context, (ClassificationExpression) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.CLASSIFICATION_FROM_CLAUSE:
				if(context == grammarAccess.getClassificationFromClauseRule()) {
					sequence_ClassificationFromClause(context, (ClassificationFromClause) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.CLASSIFICATION_TO_CLAUSE:
				if(context == grammarAccess.getClassificationToClauseRule()) {
					sequence_ClassificationToClause(context, (ClassificationToClause) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.CLASSIFY_STATEMENT:
				if(context == grammarAccess.getClassifyStatementRule() ||
				   context == grammarAccess.getStatementRule()) {
					sequence_ClassifyStatement(context, (ClassifyStatement) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.COLLECT_OR_ITERATE_OPERATION:
				if(context == grammarAccess.getCollectOrIterateOperationRule() ||
				   context == grammarAccess.getSequenceExpansionExpressionRule() ||
				   context == grammarAccess.getSuffixExpressionRule()) {
					sequence_CollectOrIterateOperation(context, (CollectOrIterateOperation) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.COMPOUND_ACCEPT_STATEMENT_COMPLETION:
				if(context == grammarAccess.getCompoundAcceptStatementCompletionRule()) {
					sequence_CompoundAcceptStatementCompletion(context, (CompoundAcceptStatementCompletion) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.CONCURRENT_CLAUSES:
				if(context == grammarAccess.getConcurrentClausesRule()) {
					sequence_ConcurrentClauses(context, (ConcurrentClauses) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.CONDITIONAL_AND_EXPRESSION:
				if(context == grammarAccess.getConditionalAndExpressionRule()) {
					sequence_ConditionalAndExpression(context, (ConditionalAndExpression) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.CONDITIONAL_OR_EXPRESSION:
				if(context == grammarAccess.getConditionalOrExpressionRule()) {
					sequence_ConditionalOrExpression(context, (ConditionalOrExpression) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.CONDITIONAL_TEST_EXPRESSION:
				if(context == grammarAccess.getConditionalTestExpressionRule() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getSequenceElementRule()) {
					sequence_ConditionalTestExpression(context, (ConditionalTestExpression) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.DO_STATEMENT:
				if(context == grammarAccess.getDoStatementRule() ||
				   context == grammarAccess.getStatementRule()) {
					sequence_DoStatement(context, (DoStatement) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.DOCUMENTED_STATEMENT:
				if(context == grammarAccess.getDocumentedStatementRule()) {
					sequence_DocumentedStatement(context, (DocumentedStatement) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.EMPTY_STATEMENT:
				if(context == grammarAccess.getEmptyStatementRule() ||
				   context == grammarAccess.getStatementRule()) {
					sequence_Statement(context, (EmptyStatement) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.EQUALITY_EXPRESSION:
				if(context == grammarAccess.getEqualityExpressionRule()) {
					sequence_EqualityExpression(context, (EqualityExpression) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.EXCLUSIVE_OR_EXPRESSION:
				if(context == grammarAccess.getExclusiveOrExpressionRule()) {
					sequence_ExclusiveOrExpression(context, (ExclusiveOrExpression) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.FINAL_CLAUSE:
				if(context == grammarAccess.getFinalClauseRule()) {
					sequence_FinalClause(context, (FinalClause) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.FOR_ALL_OR_EXISTS_OR_ONE_OPERATION:
				if(context == grammarAccess.getForAllOrExistsOrOneOperationRule() ||
				   context == grammarAccess.getSequenceExpansionExpressionRule() ||
				   context == grammarAccess.getSuffixExpressionRule()) {
					sequence_ForAllOrExistsOrOneOperation(context, (ForAllOrExistsOrOneOperation) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.FOR_CONTROL:
				if(context == grammarAccess.getForControlRule()) {
					sequence_ForControl(context, (ForControl) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.FOR_STATEMENT:
				if(context == grammarAccess.getForStatementRule() ||
				   context == grammarAccess.getStatementRule()) {
					sequence_ForStatement(context, (ForStatement) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.INTEGER_LITERAL:
				if(context == grammarAccess.getINTEGER_LITERALRule() ||
				   context == grammarAccess.getLITERALRule() ||
				   context == grammarAccess.getNUMBER_LITERALRule() ||
				   context == grammarAccess.getValueSpecificationRule()) {
					sequence_INTEGER_LITERAL(context, (INTEGER_LITERAL) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.IF_STATEMENT:
				if(context == grammarAccess.getIfStatementRule() ||
				   context == grammarAccess.getStatementRule()) {
					sequence_IfStatement(context, (IfStatement) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.INCLUSIVE_OR_EXPRESSION:
				if(context == grammarAccess.getInclusiveOrExpressionRule()) {
					sequence_InclusiveOrExpression(context, (InclusiveOrExpression) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.INLINE_STATEMENT:
				if(context == grammarAccess.getInlineStatementRule() ||
				   context == grammarAccess.getStatementRule()) {
					sequence_InlineStatement(context, (InlineStatement) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.INSTANCE_CREATION_EXPRESSION:
				if(context == grammarAccess.getInstanceCreationExpressionRule() ||
				   context == grammarAccess.getNonLiteralValueSpecificationRule() ||
				   context == grammarAccess.getValueSpecificationRule()) {
					sequence_InstanceCreationExpression(context, (InstanceCreationExpression) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.INSTANCE_CREATION_INVOCATION_STATEMENT:
				if(context == grammarAccess.getInstanceCreationInvocationStatementRule() ||
				   context == grammarAccess.getStatementRule()) {
					sequence_InstanceCreationInvocationStatement(context, (InstanceCreationInvocationStatement) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.INVOCATION_OR_ASSIGNEMENT_OR_DECLARATION_STATEMENT:
				if(context == grammarAccess.getInvocationOrAssignementOrDeclarationStatementRule() ||
				   context == grammarAccess.getStatementRule()) {
					sequence_InvocationOrAssignementOrDeclarationStatement(context, (InvocationOrAssignementOrDeclarationStatement) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.IS_UNIQUE_OPERATION:
				if(context == grammarAccess.getIsUniqueOperationRule() ||
				   context == grammarAccess.getSequenceExpansionExpressionRule() ||
				   context == grammarAccess.getSuffixExpressionRule()) {
					sequence_IsUniqueOperation(context, (IsUniqueOperation) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.LINK_OPERATION_EXPRESSION:
				if(context == grammarAccess.getLinkOperationExpressionRule() ||
				   context == grammarAccess.getSuffixExpressionRule()) {
					sequence_LinkOperationExpression(context, (LinkOperationExpression) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.LINK_OPERATION_TUPLE:
				if(context == grammarAccess.getLinkOperationTupleRule()) {
					sequence_LinkOperationTuple(context, (LinkOperationTuple) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.LINK_OPERATION_TUPLE_ELEMENT:
				if(context == grammarAccess.getLinkOperationTupleElementRule()) {
					sequence_LinkOperationTupleElement(context, (LinkOperationTupleElement) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.LOCAL_NAME_DECLARATION_STATEMENT:
				if(context == grammarAccess.getLocalNameDeclarationStatementRule() ||
				   context == grammarAccess.getStatementRule()) {
					sequence_LocalNameDeclarationStatement(context, (LocalNameDeclarationStatement) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.LOOP_VARIABLE_DEFINITION:
				if(context == grammarAccess.getLoopVariableDefinitionRule()) {
					sequence_LoopVariableDefinition(context, (LoopVariableDefinition) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.MULTIPLICATIVE_EXPRESSION:
				if(context == grammarAccess.getMultiplicativeExpressionRule()) {
					sequence_MultiplicativeExpression(context, (MultiplicativeExpression) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.NAME_EXPRESSION:
				if(context == grammarAccess.getNameExpressionRule() ||
				   context == grammarAccess.getNonLiteralValueSpecificationRule() ||
				   context == grammarAccess.getValueSpecificationRule()) {
					sequence_NameExpression(context, (NameExpression) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.NAMED_TEMPLATE_BINDING:
				if(context == grammarAccess.getNamedTemplateBindingRule()) {
					sequence_NamedTemplateBinding(context, (NamedTemplateBinding) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.NON_EMPTY_STATEMENT_SEQUENCE:
				if(context == grammarAccess.getNonEmptyStatementSequenceRule()) {
					sequence_NonEmptyStatementSequence(context, (NonEmptyStatementSequence) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.NON_FINAL_CLAUSE:
				if(context == grammarAccess.getNonFinalClauseRule()) {
					sequence_NonFinalClause(context, (NonFinalClause) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.NULL_EXPRESSION:
				if(context == grammarAccess.getNullExpressionRule() ||
				   context == grammarAccess.getValueSpecificationRule()) {
					sequence_ValueSpecification(context, (NullExpression) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.OPERATION_CALL_EXPRESSION:
				if(context == grammarAccess.getOperationCallExpressionRule() ||
				   context == grammarAccess.getSuffixExpressionRule()) {
					sequence_OperationCallExpression(context, (OperationCallExpression) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.OPERATION_CALL_EXPRESSION_WITHOUT_DOT:
				if(context == grammarAccess.getOperationCallExpressionWithoutDotRule()) {
					sequence_OperationCallExpressionWithoutDot(context, (OperationCallExpressionWithoutDot) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.PARENTHESIZED_EXPRESSION:
				if(context == grammarAccess.getNonLiteralValueSpecificationRule() ||
				   context == grammarAccess.getParenthesizedExpressionRule() ||
				   context == grammarAccess.getValueSpecificationRule()) {
					sequence_ParenthesizedExpression(context, (ParenthesizedExpression) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.PARTIAL_SEQUENCE_CONSTRUCTION_COMPLETION:
				if(context == grammarAccess.getPartialSequenceConstructionCompletionRule()) {
					sequence_PartialSequenceConstructionCompletion(context, (PartialSequenceConstructionCompletion) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.PRIMARY_EXPRESSION:
				if(context == grammarAccess.getPrimaryExpressionRule()) {
					sequence_PrimaryExpression(context, (PrimaryExpression) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.PROPERTY_CALL_EXPRESSION:
				if(context == grammarAccess.getPropertyCallExpressionRule() ||
				   context == grammarAccess.getSuffixExpressionRule()) {
					sequence_PropertyCallExpression(context, (PropertyCallExpression) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.QUALIFIED_NAME_LIST:
				if(context == grammarAccess.getQualifiedNameListRule()) {
					sequence_QualifiedNameList(context, (QualifiedNameList) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.QUALIFIED_NAME_PATH:
				if(context == grammarAccess.getQualifiedNamePathRule()) {
					sequence_QualifiedNamePath(context, (QualifiedNamePath) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.QUALIFIED_NAME_WITH_BINDING:
				if(context == grammarAccess.getQualifiedNameWithBindingRule()) {
					sequence_QualifiedNameWithBinding(context, (QualifiedNameWithBinding) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.RECLASSIFY_ALL_CLAUSE:
				if(context == grammarAccess.getReclassifyAllClauseRule()) {
					sequence_ReclassifyAllClause(context, (ReclassifyAllClause) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.RELATIONAL_EXPRESSION:
				if(context == grammarAccess.getRelationalExpressionRule()) {
					sequence_RelationalExpression(context, (RelationalExpression) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.RETURN_STATEMENT:
				if(context == grammarAccess.getReturnStatementRule() ||
				   context == grammarAccess.getStatementRule()) {
					sequence_ReturnStatement(context, (ReturnStatement) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.STRING_LITERAL:
				if(context == grammarAccess.getLITERALRule() ||
				   context == grammarAccess.getSTRING_LITERALRule() ||
				   context == grammarAccess.getValueSpecificationRule()) {
					sequence_STRING_LITERAL(context, (STRING_LITERAL) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.SELECT_OR_REJECT_OPERATION:
				if(context == grammarAccess.getSelectOrRejectOperationRule() ||
				   context == grammarAccess.getSequenceExpansionExpressionRule() ||
				   context == grammarAccess.getSuffixExpressionRule()) {
					sequence_SelectOrRejectOperation(context, (SelectOrRejectOperation) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.SEQUENCE_CONSTRUCTION_COMPLETION:
				if(context == grammarAccess.getSequenceConstructionCompletionRule()) {
					sequence_SequenceConstructionCompletion(context, (SequenceConstructionCompletion) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.SEQUENCE_CONSTRUCTION_EXPRESSION:
				if(context == grammarAccess.getSequenceConstructionExpressionRule() ||
				   context == grammarAccess.getSequenceElementRule()) {
					sequence_SequenceConstructionExpression(context, (SequenceConstructionExpression) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.SEQUENCE_CONSTRUCTION_OR_ACCESS_COMPLETION:
				if(context == grammarAccess.getSequenceConstructionOrAccessCompletionRule()) {
					sequence_SequenceConstructionOrAccessCompletion(context, (SequenceConstructionOrAccessCompletion) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.SEQUENCE_OPERATION_EXPRESSION:
				if(context == grammarAccess.getSequenceOperationExpressionRule() ||
				   context == grammarAccess.getSuffixExpressionRule()) {
					sequence_SequenceOperationExpression(context, (SequenceOperationExpression) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.SEQUENCE_REDUCTION_EXPRESSION:
				if(context == grammarAccess.getSequenceReductionExpressionRule() ||
				   context == grammarAccess.getSuffixExpressionRule()) {
					sequence_SequenceReductionExpression(context, (SequenceReductionExpression) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.SEQUENTIAL_CLAUSES:
				if(context == grammarAccess.getSequentialClausesRule()) {
					sequence_SequentialClauses(context, (SequentialClauses) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.SHIFT_EXPRESSION:
				if(context == grammarAccess.getShiftExpressionRule()) {
					sequence_ShiftExpression(context, (ShiftExpression) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.SIMPLE_ACCEPT_STATEMENT_COMPLETION:
				if(context == grammarAccess.getSimpleAcceptStatementCompletionRule()) {
					sequence_SimpleAcceptStatementCompletion(context, (SimpleAcceptStatementCompletion) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.STATEMENT_SEQUENCE:
				if(context == grammarAccess.getStatementSequenceRule()) {
					sequence_StatementSequence(context, (StatementSequence) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.SUPER_INVOCATION_EXPRESSION:
				if(context == grammarAccess.getNonLiteralValueSpecificationRule() ||
				   context == grammarAccess.getSuperInvocationExpressionRule() ||
				   context == grammarAccess.getValueSpecificationRule()) {
					sequence_SuperInvocationExpression(context, (SuperInvocationExpression) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.SUPER_INVOCATION_STATEMENT:
				if(context == grammarAccess.getStatementRule() ||
				   context == grammarAccess.getSuperInvocationStatementRule()) {
					sequence_SuperInvocationStatement(context, (SuperInvocationStatement) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.SWITCH_CASE:
				if(context == grammarAccess.getSwitchCaseRule()) {
					sequence_SwitchCase(context, (SwitchCase) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.SWITCH_CLAUSE:
				if(context == grammarAccess.getSwitchClauseRule()) {
					sequence_SwitchClause(context, (SwitchClause) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.SWITCH_DEFAULT_CLAUSE:
				if(context == grammarAccess.getSwitchDefaultClauseRule()) {
					sequence_SwitchDefaultClause(context, (SwitchDefaultClause) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.SWITCH_STATEMENT:
				if(context == grammarAccess.getStatementRule() ||
				   context == grammarAccess.getSwitchStatementRule()) {
					sequence_SwitchStatement(context, (SwitchStatement) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.TEMPLATE_BINDING:
				if(context == grammarAccess.getTemplateBindingRule()) {
					sequence_TemplateBinding(context, (TemplateBinding) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.THIS_EXPRESSION:
				if(context == grammarAccess.getNonLiteralValueSpecificationRule() ||
				   context == grammarAccess.getThisExpressionRule() ||
				   context == grammarAccess.getValueSpecificationRule()) {
					sequence_ThisExpression(context, (ThisExpression) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.THIS_INVOCATION_STATEMENT:
				if(context == grammarAccess.getStatementRule() ||
				   context == grammarAccess.getThisInvocationStatementRule()) {
					sequence_ThisInvocationStatement(context, (ThisInvocationStatement) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.TUPLE:
				if(context == grammarAccess.getTupleRule()) {
					sequence_Tuple(context, (Tuple) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.TUPLE_ELEMENT:
				if(context == grammarAccess.getTupleElementRule()) {
					sequence_TupleElement(context, (TupleElement) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.UNLIMITED_LITERAL:
				if(context == grammarAccess.getLITERALRule() ||
				   context == grammarAccess.getNUMBER_LITERALRule() ||
				   context == grammarAccess.getUNLIMITED_LITERALRule() ||
				   context == grammarAccess.getValueSpecificationRule()) {
					sequence_UNLIMITED_LITERAL(context, (UNLIMITED_LITERAL) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.UNARY_EXPRESSION:
				if(context == grammarAccess.getUnaryExpressionRule()) {
					sequence_UnaryExpression(context, (UnaryExpression) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.UNQUALIFIED_NAME:
				if(context == grammarAccess.getUnqualifiedNameRule()) {
					sequence_UnqualifiedName(context, (UnqualifiedName) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.VARIABLE_DECLARATION_COMPLETION:
				if(context == grammarAccess.getVariableDeclarationCompletionRule()) {
					sequence_VariableDeclarationCompletion(context, (VariableDeclarationCompletion) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.WHILE_STATEMENT:
				if(context == grammarAccess.getStatementRule() ||
				   context == grammarAccess.getWhileStatementRule()) {
					sequence_WhileStatement(context, (WhileStatement) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (clause=AcceptClause block=Block)
	 */
	protected void sequence_AcceptBlock(EObject context, AcceptBlock semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AlfPackage.Literals.ACCEPT_BLOCK__CLAUSE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlfPackage.Literals.ACCEPT_BLOCK__CLAUSE));
			if(transientValues.isValueTransient(semanticObject, AlfPackage.Literals.ACCEPT_BLOCK__BLOCK) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlfPackage.Literals.ACCEPT_BLOCK__BLOCK));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAcceptBlockAccess().getClauseAcceptClauseParserRuleCall_0_0(), semanticObject.getClause());
		feeder.accept(grammarAccess.getAcceptBlockAccess().getBlockBlockParserRuleCall_1_0(), semanticObject.getBlock());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID? qualifiedNameList=QualifiedNameList)
	 */
	protected void sequence_AcceptClause(EObject context, AcceptClause semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (clause=AcceptClause (simpleAccept=SimpleAcceptStatementCompletion | compoundAccept=CompoundAcceptStatementCompletion))
	 */
	protected void sequence_AcceptStatement(EObject context, AcceptStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     accessIndex=Expression
	 */
	protected void sequence_AccessCompletion(EObject context, AccessCompletion semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AlfPackage.Literals.ACCESS_COMPLETION__ACCESS_INDEX) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlfPackage.Literals.ACCESS_COMPLETION__ACCESS_INDEX));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAccessCompletionAccess().getAccessIndexExpressionParserRuleCall_0_0(), semanticObject.getAccessIndex());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (exp+=MultiplicativeExpression ((op+='+' | op+='-') exp+=MultiplicativeExpression)*)
	 */
	protected void sequence_AdditiveExpression(EObject context, AdditiveExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (exp+=EqualityExpression exp+=EqualityExpression*)
	 */
	protected void sequence_AndExpression(EObject context, AndExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (annotation=Annotation block=Block)
	 */
	protected void sequence_AnnotatedStatement(EObject context, AnnotatedStatement semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AlfPackage.Literals.ANNOTATED_STATEMENT__ANNOTATION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlfPackage.Literals.ANNOTATED_STATEMENT__ANNOTATION));
			if(transientValues.isValueTransient(semanticObject, AlfPackage.Literals.ANNOTATED_STATEMENT__BLOCK) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlfPackage.Literals.ANNOTATED_STATEMENT__BLOCK));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAnnotatedStatementAccess().getAnnotationAnnotationParserRuleCall_1_0(), semanticObject.getAnnotation());
		feeder.accept(grammarAccess.getAnnotatedStatementAccess().getBlockBlockParserRuleCall_2_0(), semanticObject.getBlock());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (kind=AnnotationKind (args+=ID args+=ID*)?)
	 */
	protected void sequence_Annotation(EObject context, Annotation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (op=AssignmentOperator rightHandSide=Expression)
	 */
	protected void sequence_AssignmentCompletion(EObject context, AssignmentCompletion semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AlfPackage.Literals.ASSIGNMENT_COMPLETION__OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlfPackage.Literals.ASSIGNMENT_COMPLETION__OP));
			if(transientValues.isValueTransient(semanticObject, AlfPackage.Literals.ASSIGNMENT_COMPLETION__RIGHT_HAND_SIDE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlfPackage.Literals.ASSIGNMENT_COMPLETION__RIGHT_HAND_SIDE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAssignmentCompletionAccess().getOpAssignmentOperatorEnumRuleCall_0_0(), semanticObject.getOp());
		feeder.accept(grammarAccess.getAssignmentCompletionAccess().getRightHandSideExpressionParserRuleCall_1_0(), semanticObject.getRightHandSide());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value=BooleanValue suffix=SuffixExpression?)
	 */
	protected void sequence_BOOLEAN_LITERAL(EObject context, BOOLEAN_LITERAL semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     block=Block
	 */
	protected void sequence_BlockStatement(EObject context, BlockStatement semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AlfPackage.Literals.BLOCK_STATEMENT__BLOCK) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlfPackage.Literals.BLOCK_STATEMENT__BLOCK));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getBlockStatementAccess().getBlockBlockParserRuleCall_0(), semanticObject.getBlock());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (sequence=StatementSequence?)
	 */
	protected void sequence_Block(EObject context, Block semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID stat+=Statement*)
	 */
	protected void sequence_CLASSOP(EObject context, CLASSOP semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID clsop+=CLASSOP*)
	 */
	protected void sequence_CLASSSTRUCT(EObject context, CLASSSTRUCT semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (classifyFromClause=ClassificationFromClause classifyToClause=ClassificationToClause?) | 
	 *         (reclassyAllClause=ReclassifyAllClause? classifyToClause=ClassificationToClause)
	 *     )
	 */
	protected void sequence_ClassificationClause(EObject context, ClassificationClause semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (exp=RelationalExpression ((op='instanceof' | op='hastype') typeName=NameExpression)?)
	 */
	protected void sequence_ClassificationExpression(EObject context, ClassificationExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     qualifiedNameList=QualifiedNameList
	 */
	protected void sequence_ClassificationFromClause(EObject context, ClassificationFromClause semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AlfPackage.Literals.CLASSIFICATION_FROM_CLAUSE__QUALIFIED_NAME_LIST) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlfPackage.Literals.CLASSIFICATION_FROM_CLAUSE__QUALIFIED_NAME_LIST));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getClassificationFromClauseAccess().getQualifiedNameListQualifiedNameListParserRuleCall_1_0(), semanticObject.getQualifiedNameList());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     qualifiedNameList=QualifiedNameList
	 */
	protected void sequence_ClassificationToClause(EObject context, ClassificationToClause semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AlfPackage.Literals.CLASSIFICATION_TO_CLAUSE__QUALIFIED_NAME_LIST) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlfPackage.Literals.CLASSIFICATION_TO_CLAUSE__QUALIFIED_NAME_LIST));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getClassificationToClauseAccess().getQualifiedNameListQualifiedNameListParserRuleCall_1_0(), semanticObject.getQualifiedNameList());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (expression=Expression clause=ClassificationClause)
	 */
	protected void sequence_ClassifyStatement(EObject context, ClassifyStatement semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AlfPackage.Literals.CLASSIFY_STATEMENT__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlfPackage.Literals.CLASSIFY_STATEMENT__EXPRESSION));
			if(transientValues.isValueTransient(semanticObject, AlfPackage.Literals.CLASSIFY_STATEMENT__CLAUSE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlfPackage.Literals.CLASSIFY_STATEMENT__CLAUSE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getClassifyStatementAccess().getExpressionExpressionParserRuleCall_1_0(), semanticObject.getExpression());
		feeder.accept(grammarAccess.getClassifyStatementAccess().getClauseClassificationClauseParserRuleCall_2_0(), semanticObject.getClause());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (op=CollectOrIterateOperator name=ID expr=Expression suffix=SuffixExpression?)
	 */
	protected void sequence_CollectOrIterateOperation(EObject context, CollectOrIterateOperation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (block=Block acceptBlock+=AcceptBlock*)
	 */
	protected void sequence_CompoundAcceptStatementCompletion(EObject context, CompoundAcceptStatementCompletion semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (nonFinalClause+=NonFinalClause nonFinalClause+=NonFinalClause*)
	 */
	protected void sequence_ConcurrentClauses(EObject context, ConcurrentClauses semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (exp+=InclusiveOrExpression exp+=InclusiveOrExpression*)
	 */
	protected void sequence_ConditionalAndExpression(EObject context, ConditionalAndExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (exp+=ConditionalAndExpression exp+=ConditionalAndExpression*)
	 */
	protected void sequence_ConditionalOrExpression(EObject context, ConditionalOrExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (exp=ConditionalOrExpression (whenTrue=ConditionalTestExpression whenFalse=ConditionalTestExpression)?)
	 */
	protected void sequence_ConditionalTestExpression(EObject context, ConditionalTestExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (block=Block condition=Expression)
	 */
	protected void sequence_DoStatement(EObject context, DoStatement semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AlfPackage.Literals.DO_STATEMENT__BLOCK) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlfPackage.Literals.DO_STATEMENT__BLOCK));
			if(transientValues.isValueTransient(semanticObject, AlfPackage.Literals.DO_STATEMENT__CONDITION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlfPackage.Literals.DO_STATEMENT__CONDITION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDoStatementAccess().getBlockBlockParserRuleCall_1_0(), semanticObject.getBlock());
		feeder.accept(grammarAccess.getDoStatementAccess().getConditionExpressionParserRuleCall_4_0(), semanticObject.getCondition());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     ((comment=ML_COMMENT | comment=SL_COMMENT)? statement=Statement)
	 */
	protected void sequence_DocumentedStatement(EObject context, DocumentedStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (exp+=ClassificationExpression ((op+='==' | op+='!=') exp+=ClassificationExpression)*)
	 */
	protected void sequence_EqualityExpression(EObject context, EqualityExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (exp+=AndExpression exp+=AndExpression*)
	 */
	protected void sequence_ExclusiveOrExpression(EObject context, ExclusiveOrExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     block=Block
	 */
	protected void sequence_FinalClause(EObject context, FinalClause semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AlfPackage.Literals.FINAL_CLAUSE__BLOCK) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlfPackage.Literals.FINAL_CLAUSE__BLOCK));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getFinalClauseAccess().getBlockBlockParserRuleCall_1_0(), semanticObject.getBlock());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (op=ForAllOrExistsOrOneOperator name=ID expr=Expression suffix=SuffixExpression?)
	 */
	protected void sequence_ForAllOrExistsOrOneOperation(EObject context, ForAllOrExistsOrOneOperation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (loopVariableDefinition+=LoopVariableDefinition loopVariableDefinition+=LoopVariableDefinition*)
	 */
	protected void sequence_ForControl(EObject context, ForControl semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (control=ForControl block=Block)
	 */
	protected void sequence_ForStatement(EObject context, ForStatement semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AlfPackage.Literals.FOR_STATEMENT__CONTROL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlfPackage.Literals.FOR_STATEMENT__CONTROL));
			if(transientValues.isValueTransient(semanticObject, AlfPackage.Literals.FOR_STATEMENT__BLOCK) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlfPackage.Literals.FOR_STATEMENT__BLOCK));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getForStatementAccess().getControlForControlParserRuleCall_2_0(), semanticObject.getControl());
		feeder.accept(grammarAccess.getForStatementAccess().getBlockBlockParserRuleCall_4_0(), semanticObject.getBlock());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value=IntegerValue suffix=SuffixExpression?)
	 */
	protected void sequence_INTEGER_LITERAL(EObject context, INTEGER_LITERAL semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (sequentialClausses=SequentialClauses finalClause=FinalClause?)
	 */
	protected void sequence_IfStatement(EObject context, IfStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (exp+=ExclusiveOrExpression exp+=ExclusiveOrExpression*)
	 */
	protected void sequence_InclusiveOrExpression(EObject context, InclusiveOrExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (langageName=ID body=STRING)
	 */
	protected void sequence_InlineStatement(EObject context, InlineStatement semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AlfPackage.Literals.INLINE_STATEMENT__LANGAGE_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlfPackage.Literals.INLINE_STATEMENT__LANGAGE_NAME));
			if(transientValues.isValueTransient(semanticObject, AlfPackage.Literals.INLINE_STATEMENT__BODY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlfPackage.Literals.INLINE_STATEMENT__BODY));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getInlineStatementAccess().getLangageNameIDTerminalRuleCall_2_0(), semanticObject.getLangageName());
		feeder.accept(grammarAccess.getInlineStatementAccess().getBodySTRINGTerminalRuleCall_3_0(), semanticObject.getBody());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (constructor=QualifiedNameWithBinding (tuple=Tuple | sequenceConstuctionCompletion=SequenceConstructionCompletion) suffix=SuffixExpression?)
	 */
	protected void sequence_InstanceCreationExpression(EObject context, InstanceCreationExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     _new=InstanceCreationExpression
	 */
	protected void sequence_InstanceCreationInvocationStatement(EObject context, InstanceCreationInvocationStatement semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AlfPackage.Literals.INSTANCE_CREATION_INVOCATION_STATEMENT__NEW) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlfPackage.Literals.INSTANCE_CREATION_INVOCATION_STATEMENT__NEW));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getInstanceCreationInvocationStatementAccess().get_newInstanceCreationExpressionParserRuleCall_0_0(), semanticObject.get_new());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         typePart_OR_assignedPart_OR_invocationPart=NameExpression 
	 *         (variableDeclarationCompletion=VariableDeclarationCompletion | assignmentCompletion=AssignmentCompletion)?
	 *     )
	 */
	protected void sequence_InvocationOrAssignementOrDeclarationStatement(EObject context, InvocationOrAssignementOrDeclarationStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID expr=Expression suffix=SuffixExpression?)
	 */
	protected void sequence_IsUniqueOperation(EObject context, IsUniqueOperation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (kind=LinkOperationKind tuple=LinkOperationTuple)
	 */
	protected void sequence_LinkOperationExpression(EObject context, LinkOperationExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AlfPackage.Literals.LINK_OPERATION_EXPRESSION__KIND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlfPackage.Literals.LINK_OPERATION_EXPRESSION__KIND));
			if(transientValues.isValueTransient(semanticObject, AlfPackage.Literals.LINK_OPERATION_EXPRESSION__TUPLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlfPackage.Literals.LINK_OPERATION_EXPRESSION__TUPLE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getLinkOperationExpressionAccess().getKindLinkOperationKindEnumRuleCall_1_0(), semanticObject.getKind());
		feeder.accept(grammarAccess.getLinkOperationExpressionAccess().getTupleLinkOperationTupleParserRuleCall_2_0(), semanticObject.getTuple());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (objectOrRole=ID (roleIndex=Expression? object=ID)?)
	 */
	protected void sequence_LinkOperationTupleElement(EObject context, LinkOperationTupleElement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (linkOperationTupleElement+=LinkOperationTupleElement linkOperationTupleElement+=LinkOperationTupleElement*)
	 */
	protected void sequence_LinkOperationTuple(EObject context, LinkOperationTuple semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (varName=ID type=QualifiedNameWithBinding multiplicityIndicator?='['? init=Expression)
	 */
	protected void sequence_LocalNameDeclarationStatement(EObject context, LocalNameDeclarationStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((name=ID expression1=Expression expression2=Expression?) | (type=QualifiedNameWithBinding name=ID expression=Expression))
	 */
	protected void sequence_LoopVariableDefinition(EObject context, LoopVariableDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (exp+=UnaryExpression ((op+='*' | op+='/' | op+='%') exp+=UnaryExpression)*)
	 */
	protected void sequence_MultiplicativeExpression(EObject context, MultiplicativeExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (
	 *             ((prefixOp='++' | prefixOp='--') path=QualifiedNamePath? id=ID) | 
	 *             (
	 *                 path=QualifiedNamePath? 
	 *                 id=ID 
	 *                 (invocationCompletion=Tuple | sequenceConstructionCompletion=SequenceConstructionOrAccessCompletion | postfixOp='++' | postfixOp='--')?
	 *             )
	 *         ) 
	 *         suffix=SuffixExpression?
	 *     )
	 */
	protected void sequence_NameExpression(EObject context, NameExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (formal=ID actual=QualifiedNameWithBinding)
	 */
	protected void sequence_NamedTemplateBinding(EObject context, NamedTemplateBinding semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AlfPackage.Literals.NAMED_TEMPLATE_BINDING__FORMAL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlfPackage.Literals.NAMED_TEMPLATE_BINDING__FORMAL));
			if(transientValues.isValueTransient(semanticObject, AlfPackage.Literals.NAMED_TEMPLATE_BINDING__ACTUAL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlfPackage.Literals.NAMED_TEMPLATE_BINDING__ACTUAL));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNamedTemplateBindingAccess().getFormalIDTerminalRuleCall_0_0(), semanticObject.getFormal());
		feeder.accept(grammarAccess.getNamedTemplateBindingAccess().getActualQualifiedNameWithBindingParserRuleCall_2_0(), semanticObject.getActual());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     statement+=DocumentedStatement+
	 */
	protected void sequence_NonEmptyStatementSequence(EObject context, NonEmptyStatementSequence semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (condition=Expression block=Block)
	 */
	protected void sequence_NonFinalClause(EObject context, NonFinalClause semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AlfPackage.Literals.NON_FINAL_CLAUSE__CONDITION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlfPackage.Literals.NON_FINAL_CLAUSE__CONDITION));
			if(transientValues.isValueTransient(semanticObject, AlfPackage.Literals.NON_FINAL_CLAUSE__BLOCK) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlfPackage.Literals.NON_FINAL_CLAUSE__BLOCK));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNonFinalClauseAccess().getConditionExpressionParserRuleCall_1_0(), semanticObject.getCondition());
		feeder.accept(grammarAccess.getNonFinalClauseAccess().getBlockBlockParserRuleCall_3_0(), semanticObject.getBlock());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (operationName=ID tuple=Tuple suffix=SuffixExpression?)
	 */
	protected void sequence_OperationCallExpressionWithoutDot(EObject context, OperationCallExpressionWithoutDot semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (operationName=ID tuple=Tuple suffix=SuffixExpression?)
	 */
	protected void sequence_OperationCallExpression(EObject context, OperationCallExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (expOrTypeCast=Expression (casted=NonLiteralValueSpecification | suffix=SuffixExpression)?)
	 */
	protected void sequence_ParenthesizedExpression(EObject context, ParenthesizedExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     expression=SequenceConstructionExpression
	 */
	protected void sequence_PartialSequenceConstructionCompletion(EObject context, PartialSequenceConstructionCompletion semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AlfPackage.Literals.PARTIAL_SEQUENCE_CONSTRUCTION_COMPLETION__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlfPackage.Literals.PARTIAL_SEQUENCE_CONSTRUCTION_COMPLETION__EXPRESSION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPartialSequenceConstructionCompletionAccess().getExpressionSequenceConstructionExpressionParserRuleCall_1_0(), semanticObject.getExpression());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     prefix=ValueSpecification
	 */
	protected void sequence_PrimaryExpression(EObject context, PrimaryExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AlfPackage.Literals.PRIMARY_EXPRESSION__PREFIX) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlfPackage.Literals.PRIMARY_EXPRESSION__PREFIX));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPrimaryExpressionAccess().getPrefixValueSpecificationParserRuleCall_0(), semanticObject.getPrefix());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (propertyName=ID index=Expression? suffix=SuffixExpression?)
	 */
	protected void sequence_PropertyCallExpression(EObject context, PropertyCallExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (qualifiedName+=QualifiedNameWithBinding qualifiedName+=QualifiedNameWithBinding*)
	 */
	protected void sequence_QualifiedNameList(EObject context, QualifiedNameList semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     namespace+=UnqualifiedName+
	 */
	protected void sequence_QualifiedNamePath(EObject context, QualifiedNamePath semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (id=ID binding=TemplateBinding? remaining=QualifiedNameWithBinding?)
	 */
	protected void sequence_QualifiedNameWithBinding(EObject context, QualifiedNameWithBinding semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {ReclassifyAllClause}
	 */
	protected void sequence_ReclassifyAllClause(EObject context, ReclassifyAllClause semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=ShiftExpression ((op='<' | op='>' | op='<=' | op='>=') right=ShiftExpression)?)
	 */
	protected void sequence_RelationalExpression(EObject context, RelationalExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     expression=Expression
	 */
	protected void sequence_ReturnStatement(EObject context, ReturnStatement semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AlfPackage.Literals.RETURN_STATEMENT__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlfPackage.Literals.RETURN_STATEMENT__EXPRESSION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getReturnStatementAccess().getExpressionExpressionParserRuleCall_1_0(), semanticObject.getExpression());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value=STRING suffix=SuffixExpression?)
	 */
	protected void sequence_STRING_LITERAL(EObject context, STRING_LITERAL semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (op=SelectOrRejectOperator name=ID expr=Expression suffix=SuffixExpression?)
	 */
	protected void sequence_SelectOrRejectOperation(EObject context, SelectOrRejectOperation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (multiplicityIndicator?='['? expression=SequenceConstructionExpression)
	 */
	protected void sequence_SequenceConstructionCompletion(EObject context, SequenceConstructionCompletion semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (sequenceElement+=SequenceElement (sequenceElement+=SequenceElement* | rangeUpper=Expression))
	 */
	protected void sequence_SequenceConstructionExpression(EObject context, SequenceConstructionExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (multiplicityIndicator?='[' (accessCompletion=AccessCompletion | sequenceCompletion=PartialSequenceConstructionCompletion)) | 
	 *         expression=SequenceConstructionExpression
	 *     )
	 */
	protected void sequence_SequenceConstructionOrAccessCompletion(EObject context, SequenceConstructionOrAccessCompletion semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (operationName=ID tuple=Tuple suffix=SuffixExpression?)
	 */
	protected void sequence_SequenceOperationExpression(EObject context, SequenceOperationExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (isOrdered?='ordered'? behavior=QualifiedNameWithBinding suffix=SuffixExpression?)
	 */
	protected void sequence_SequenceReductionExpression(EObject context, SequenceReductionExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (conccurentClauses+=ConcurrentClauses conccurentClauses+=ConcurrentClauses*)
	 */
	protected void sequence_SequentialClauses(EObject context, SequentialClauses semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (exp+=AdditiveExpression ((op='<<' | op='>>' | op='>>>') exp+=AdditiveExpression)?)
	 */
	protected void sequence_ShiftExpression(EObject context, ShiftExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {SimpleAcceptStatementCompletion}
	 */
	protected void sequence_SimpleAcceptStatementCompletion(EObject context, SimpleAcceptStatementCompletion semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     statements+=DocumentedStatement+
	 */
	protected void sequence_StatementSequence(EObject context, StatementSequence semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {BreakStatement}
	 */
	protected void sequence_Statement(EObject context, BreakStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {EmptyStatement}
	 */
	protected void sequence_Statement(EObject context, EmptyStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {ClassExtentExpression}
	 */
	protected void sequence_SuffixExpression(EObject context, ClassExtentExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((className=ID operationCallWithoutDot=OperationCallExpressionWithoutDot) | operationCall=OperationCallExpression)
	 */
	protected void sequence_SuperInvocationExpression(EObject context, SuperInvocationExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     _super=SuperInvocationExpression
	 */
	protected void sequence_SuperInvocationStatement(EObject context, SuperInvocationStatement semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AlfPackage.Literals.SUPER_INVOCATION_STATEMENT__SUPER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlfPackage.Literals.SUPER_INVOCATION_STATEMENT__SUPER));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSuperInvocationStatementAccess().get_superSuperInvocationExpressionParserRuleCall_0_0(), semanticObject.get_super());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     expression=Expression
	 */
	protected void sequence_SwitchCase(EObject context, SwitchCase semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AlfPackage.Literals.SWITCH_CASE__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlfPackage.Literals.SWITCH_CASE__EXPRESSION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSwitchCaseAccess().getExpressionExpressionParserRuleCall_1_0(), semanticObject.getExpression());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (switchCase+=SwitchCase switchCase+=SwitchCase* statementSequence=NonEmptyStatementSequence)
	 */
	protected void sequence_SwitchClause(EObject context, SwitchClause semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     statementSequence=NonEmptyStatementSequence
	 */
	protected void sequence_SwitchDefaultClause(EObject context, SwitchDefaultClause semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AlfPackage.Literals.SWITCH_DEFAULT_CLAUSE__STATEMENT_SEQUENCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlfPackage.Literals.SWITCH_DEFAULT_CLAUSE__STATEMENT_SEQUENCE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSwitchDefaultClauseAccess().getStatementSequenceNonEmptyStatementSequenceParserRuleCall_2_0(), semanticObject.getStatementSequence());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (expression=Expression switchClause+=SwitchClause* defaultClause=SwitchDefaultClause?)
	 */
	protected void sequence_SwitchStatement(EObject context, SwitchStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (bindings+=NamedTemplateBinding bindings+=NamedTemplateBinding*)
	 */
	protected void sequence_TemplateBinding(EObject context, TemplateBinding semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (suffix=SuffixExpression?)
	 */
	protected void sequence_ThisExpression(EObject context, ThisExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (_this=ThisExpression assignmentCompletion=AssignmentCompletion?)
	 */
	protected void sequence_ThisInvocationStatement(EObject context, ThisInvocationStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     argument=Expression
	 */
	protected void sequence_TupleElement(EObject context, TupleElement semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AlfPackage.Literals.TUPLE_ELEMENT__ARGUMENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlfPackage.Literals.TUPLE_ELEMENT__ARGUMENT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTupleElementAccess().getArgumentExpressionParserRuleCall_0(), semanticObject.getArgument());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     ((tupleElements+=TupleElement tupleElements+=TupleElement*)?)
	 */
	protected void sequence_Tuple(EObject context, Tuple semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (value='*' suffix=SuffixExpression?)
	 */
	protected void sequence_UNLIMITED_LITERAL(EObject context, UNLIMITED_LITERAL semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((op='!' | op='-' | op='+' | op='$' | op='~')? exp=PrimaryExpression)
	 */
	protected void sequence_UnaryExpression(EObject context, UnaryExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID templateBinding=TemplateBinding?)
	 */
	protected void sequence_UnqualifiedName(EObject context, UnqualifiedName semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {NullExpression}
	 */
	protected void sequence_ValueSpecification(EObject context, NullExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (multiplicityIndicator?='['? variableName=ID initValue=AssignmentCompletion)
	 */
	protected void sequence_VariableDeclarationCompletion(EObject context, VariableDeclarationCompletion semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (condition=Expression block=Block)
	 */
	protected void sequence_WhileStatement(EObject context, WhileStatement semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AlfPackage.Literals.WHILE_STATEMENT__CONDITION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlfPackage.Literals.WHILE_STATEMENT__CONDITION));
			if(transientValues.isValueTransient(semanticObject, AlfPackage.Literals.WHILE_STATEMENT__BLOCK) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlfPackage.Literals.WHILE_STATEMENT__BLOCK));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getWhileStatementAccess().getConditionExpressionParserRuleCall_2_0(), semanticObject.getCondition());
		feeder.accept(grammarAccess.getWhileStatementAccess().getBlockBlockParserRuleCall_4_0(), semanticObject.getBlock());
		feeder.finish();
	}
}
