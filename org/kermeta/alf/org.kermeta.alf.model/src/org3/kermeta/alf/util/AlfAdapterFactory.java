/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org3.kermeta.alf.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org3.kermeta.alf.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org3.kermeta.alf.AlfPackage
 * @generated
 */
public class AlfAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AlfPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlfAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = AlfPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AlfSwitch modelSwitch =
		new AlfSwitch() {
			public Object caseCLASSSTRUCT(CLASSSTRUCT object) {
				return createCLASSSTRUCTAdapter();
			}
			public Object caseCLASSOP(CLASSOP object) {
				return createCLASSOPAdapter();
			}
			public Object caseLITERAL(LITERAL object) {
				return createLITERALAdapter();
			}
			public Object caseBOOLEAN_LITERAL(BOOLEAN_LITERAL object) {
				return createBOOLEAN_LITERALAdapter();
			}
			public Object caseNUMBER_LITERAL(NUMBER_LITERAL object) {
				return createNUMBER_LITERALAdapter();
			}
			public Object caseINTEGER_LITERAL(INTEGER_LITERAL object) {
				return createINTEGER_LITERALAdapter();
			}
			public Object caseUNLIMITED_LITERAL(UNLIMITED_LITERAL object) {
				return createUNLIMITED_LITERALAdapter();
			}
			public Object caseSTRING_LITERAL(STRING_LITERAL object) {
				return createSTRING_LITERALAdapter();
			}
			public Object caseNameExpression(NameExpression object) {
				return createNameExpressionAdapter();
			}
			public Object caseQualifiedNamePath(QualifiedNamePath object) {
				return createQualifiedNamePathAdapter();
			}
			public Object caseUnqualifiedName(UnqualifiedName object) {
				return createUnqualifiedNameAdapter();
			}
			public Object caseTemplateBinding(TemplateBinding object) {
				return createTemplateBindingAdapter();
			}
			public Object caseNamedTemplateBinding(NamedTemplateBinding object) {
				return createNamedTemplateBindingAdapter();
			}
			public Object caseQualifiedNameWithBinding(QualifiedNameWithBinding object) {
				return createQualifiedNameWithBindingAdapter();
			}
			public Object caseTuple(Tuple object) {
				return createTupleAdapter();
			}
			public Object caseTupleElement(TupleElement object) {
				return createTupleElementAdapter();
			}
			public Object caseExpression(Expression object) {
				return createExpressionAdapter();
			}
			public Object caseConditionalTestExpression(ConditionalTestExpression object) {
				return createConditionalTestExpressionAdapter();
			}
			public Object caseConditionalOrExpression(ConditionalOrExpression object) {
				return createConditionalOrExpressionAdapter();
			}
			public Object caseConditionalAndExpression(ConditionalAndExpression object) {
				return createConditionalAndExpressionAdapter();
			}
			public Object caseInclusiveOrExpression(InclusiveOrExpression object) {
				return createInclusiveOrExpressionAdapter();
			}
			public Object caseExclusiveOrExpression(ExclusiveOrExpression object) {
				return createExclusiveOrExpressionAdapter();
			}
			public Object caseAndExpression(AndExpression object) {
				return createAndExpressionAdapter();
			}
			public Object caseEqualityExpression(EqualityExpression object) {
				return createEqualityExpressionAdapter();
			}
			public Object caseClassificationExpression(ClassificationExpression object) {
				return createClassificationExpressionAdapter();
			}
			public Object caseRelationalExpression(RelationalExpression object) {
				return createRelationalExpressionAdapter();
			}
			public Object caseShiftExpression(ShiftExpression object) {
				return createShiftExpressionAdapter();
			}
			public Object caseAdditiveExpression(AdditiveExpression object) {
				return createAdditiveExpressionAdapter();
			}
			public Object caseMultiplicativeExpression(MultiplicativeExpression object) {
				return createMultiplicativeExpressionAdapter();
			}
			public Object caseUnaryExpression(UnaryExpression object) {
				return createUnaryExpressionAdapter();
			}
			public Object casePrimaryExpression(PrimaryExpression object) {
				return createPrimaryExpressionAdapter();
			}
			public Object caseSuffixExpression(SuffixExpression object) {
				return createSuffixExpressionAdapter();
			}
			public Object caseOperationCallExpression(OperationCallExpression object) {
				return createOperationCallExpressionAdapter();
			}
			public Object caseOperationCallExpressionWithoutDot(OperationCallExpressionWithoutDot object) {
				return createOperationCallExpressionWithoutDotAdapter();
			}
			public Object casePropertyCallExpression(PropertyCallExpression object) {
				return createPropertyCallExpressionAdapter();
			}
			public Object caseLinkOperationExpression(LinkOperationExpression object) {
				return createLinkOperationExpressionAdapter();
			}
			public Object caseLinkOperationTuple(LinkOperationTuple object) {
				return createLinkOperationTupleAdapter();
			}
			public Object caseLinkOperationTupleElement(LinkOperationTupleElement object) {
				return createLinkOperationTupleElementAdapter();
			}
			public Object caseSequenceOperationExpression(SequenceOperationExpression object) {
				return createSequenceOperationExpressionAdapter();
			}
			public Object caseSequenceReductionExpression(SequenceReductionExpression object) {
				return createSequenceReductionExpressionAdapter();
			}
			public Object caseSequenceExpansionExpression(SequenceExpansionExpression object) {
				return createSequenceExpansionExpressionAdapter();
			}
			public Object caseSelectOrRejectOperation(SelectOrRejectOperation object) {
				return createSelectOrRejectOperationAdapter();
			}
			public Object caseCollectOrIterateOperation(CollectOrIterateOperation object) {
				return createCollectOrIterateOperationAdapter();
			}
			public Object caseForAllOrExistsOrOneOperation(ForAllOrExistsOrOneOperation object) {
				return createForAllOrExistsOrOneOperationAdapter();
			}
			public Object caseIsUniqueOperation(IsUniqueOperation object) {
				return createIsUniqueOperationAdapter();
			}
			public Object caseValueSpecification(ValueSpecification object) {
				return createValueSpecificationAdapter();
			}
			public Object caseNonLiteralValueSpecification(NonLiteralValueSpecification object) {
				return createNonLiteralValueSpecificationAdapter();
			}
			public Object caseParenthesizedExpression(ParenthesizedExpression object) {
				return createParenthesizedExpressionAdapter();
			}
			public Object caseNullExpression(NullExpression object) {
				return createNullExpressionAdapter();
			}
			public Object caseThisExpression(ThisExpression object) {
				return createThisExpressionAdapter();
			}
			public Object caseSuperInvocationExpression(SuperInvocationExpression object) {
				return createSuperInvocationExpressionAdapter();
			}
			public Object caseInstanceCreationExpression(InstanceCreationExpression object) {
				return createInstanceCreationExpressionAdapter();
			}
			public Object caseSequenceConstructionOrAccessCompletion(SequenceConstructionOrAccessCompletion object) {
				return createSequenceConstructionOrAccessCompletionAdapter();
			}
			public Object caseAccessCompletion(AccessCompletion object) {
				return createAccessCompletionAdapter();
			}
			public Object casePartialSequenceConstructionCompletion(PartialSequenceConstructionCompletion object) {
				return createPartialSequenceConstructionCompletionAdapter();
			}
			public Object caseSequenceConstructionCompletion(SequenceConstructionCompletion object) {
				return createSequenceConstructionCompletionAdapter();
			}
			public Object caseSequenceConstructionExpression(SequenceConstructionExpression object) {
				return createSequenceConstructionExpressionAdapter();
			}
			public Object caseSequenceElement(SequenceElement object) {
				return createSequenceElementAdapter();
			}
			public Object caseClassExtentExpression(ClassExtentExpression object) {
				return createClassExtentExpressionAdapter();
			}
			public Object caseBlock(Block object) {
				return createBlockAdapter();
			}
			public Object caseStatementSequence(StatementSequence object) {
				return createStatementSequenceAdapter();
			}
			public Object caseInlineStatement(InlineStatement object) {
				return createInlineStatementAdapter();
			}
			public Object caseAnnotatedStatement(AnnotatedStatement object) {
				return createAnnotatedStatementAdapter();
			}
			public Object caseDocumentedStatement(DocumentedStatement object) {
				return createDocumentedStatementAdapter();
			}
			public Object caseStatement(Statement object) {
				return createStatementAdapter();
			}
			public Object caseAnnotation(Annotation object) {
				return createAnnotationAdapter();
			}
			public Object caseBlockStatement(BlockStatement object) {
				return createBlockStatementAdapter();
			}
			public Object caseEmptyStatement(EmptyStatement object) {
				return createEmptyStatementAdapter();
			}
			public Object caseLocalNameDeclarationStatement(LocalNameDeclarationStatement object) {
				return createLocalNameDeclarationStatementAdapter();
			}
			public Object caseIfStatement(IfStatement object) {
				return createIfStatementAdapter();
			}
			public Object caseSequentialClauses(SequentialClauses object) {
				return createSequentialClausesAdapter();
			}
			public Object caseConcurrentClauses(ConcurrentClauses object) {
				return createConcurrentClausesAdapter();
			}
			public Object caseNonFinalClause(NonFinalClause object) {
				return createNonFinalClauseAdapter();
			}
			public Object caseFinalClause(FinalClause object) {
				return createFinalClauseAdapter();
			}
			public Object caseSwitchStatement(SwitchStatement object) {
				return createSwitchStatementAdapter();
			}
			public Object caseSwitchClause(SwitchClause object) {
				return createSwitchClauseAdapter();
			}
			public Object caseSwitchCase(SwitchCase object) {
				return createSwitchCaseAdapter();
			}
			public Object caseSwitchDefaultClause(SwitchDefaultClause object) {
				return createSwitchDefaultClauseAdapter();
			}
			public Object caseNonEmptyStatementSequence(NonEmptyStatementSequence object) {
				return createNonEmptyStatementSequenceAdapter();
			}
			public Object caseWhileStatement(WhileStatement object) {
				return createWhileStatementAdapter();
			}
			public Object caseDoStatement(DoStatement object) {
				return createDoStatementAdapter();
			}
			public Object caseForStatement(ForStatement object) {
				return createForStatementAdapter();
			}
			public Object caseForControl(ForControl object) {
				return createForControlAdapter();
			}
			public Object caseLoopVariableDefinition(LoopVariableDefinition object) {
				return createLoopVariableDefinitionAdapter();
			}
			public Object caseBreakStatement(BreakStatement object) {
				return createBreakStatementAdapter();
			}
			public Object caseReturnStatement(ReturnStatement object) {
				return createReturnStatementAdapter();
			}
			public Object caseAcceptStatement(AcceptStatement object) {
				return createAcceptStatementAdapter();
			}
			public Object caseSimpleAcceptStatementCompletion(SimpleAcceptStatementCompletion object) {
				return createSimpleAcceptStatementCompletionAdapter();
			}
			public Object caseCompoundAcceptStatementCompletion(CompoundAcceptStatementCompletion object) {
				return createCompoundAcceptStatementCompletionAdapter();
			}
			public Object caseAcceptBlock(AcceptBlock object) {
				return createAcceptBlockAdapter();
			}
			public Object caseAcceptClause(AcceptClause object) {
				return createAcceptClauseAdapter();
			}
			public Object caseClassifyStatement(ClassifyStatement object) {
				return createClassifyStatementAdapter();
			}
			public Object caseClassificationClause(ClassificationClause object) {
				return createClassificationClauseAdapter();
			}
			public Object caseClassificationFromClause(ClassificationFromClause object) {
				return createClassificationFromClauseAdapter();
			}
			public Object caseClassificationToClause(ClassificationToClause object) {
				return createClassificationToClauseAdapter();
			}
			public Object caseReclassifyAllClause(ReclassifyAllClause object) {
				return createReclassifyAllClauseAdapter();
			}
			public Object caseQualifiedNameList(QualifiedNameList object) {
				return createQualifiedNameListAdapter();
			}
			public Object caseInvocationOrAssignementOrDeclarationStatement(InvocationOrAssignementOrDeclarationStatement object) {
				return createInvocationOrAssignementOrDeclarationStatementAdapter();
			}
			public Object caseSuperInvocationStatement(SuperInvocationStatement object) {
				return createSuperInvocationStatementAdapter();
			}
			public Object caseThisInvocationStatement(ThisInvocationStatement object) {
				return createThisInvocationStatementAdapter();
			}
			public Object caseInstanceCreationInvocationStatement(InstanceCreationInvocationStatement object) {
				return createInstanceCreationInvocationStatementAdapter();
			}
			public Object caseVariableDeclarationCompletion(VariableDeclarationCompletion object) {
				return createVariableDeclarationCompletionAdapter();
			}
			public Object caseAssignmentCompletion(AssignmentCompletion object) {
				return createAssignmentCompletionAdapter();
			}
			public Object defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	public Adapter createAdapter(Notifier target) {
		return (Adapter)modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org3.kermeta.alf.CLASSSTRUCT <em>CLASSSTRUCT</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org3.kermeta.alf.CLASSSTRUCT
	 * @generated
	 */
	public Adapter createCLASSSTRUCTAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org3.kermeta.alf.CLASSOP <em>CLASSOP</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org3.kermeta.alf.CLASSOP
	 * @generated
	 */
	public Adapter createCLASSOPAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org3.kermeta.alf.LITERAL <em>LITERAL</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org3.kermeta.alf.LITERAL
	 * @generated
	 */
	public Adapter createLITERALAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org3.kermeta.alf.BOOLEAN_LITERAL <em>BOOLEAN LITERAL</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org3.kermeta.alf.BOOLEAN_LITERAL
	 * @generated
	 */
	public Adapter createBOOLEAN_LITERALAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org3.kermeta.alf.NUMBER_LITERAL <em>NUMBER LITERAL</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org3.kermeta.alf.NUMBER_LITERAL
	 * @generated
	 */
	public Adapter createNUMBER_LITERALAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org3.kermeta.alf.INTEGER_LITERAL <em>INTEGER LITERAL</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org3.kermeta.alf.INTEGER_LITERAL
	 * @generated
	 */
	public Adapter createINTEGER_LITERALAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org3.kermeta.alf.UNLIMITED_LITERAL <em>UNLIMITED LITERAL</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org3.kermeta.alf.UNLIMITED_LITERAL
	 * @generated
	 */
	public Adapter createUNLIMITED_LITERALAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org3.kermeta.alf.STRING_LITERAL <em>STRING LITERAL</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org3.kermeta.alf.STRING_LITERAL
	 * @generated
	 */
	public Adapter createSTRING_LITERALAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org3.kermeta.alf.NameExpression <em>Name Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org3.kermeta.alf.NameExpression
	 * @generated
	 */
	public Adapter createNameExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org3.kermeta.alf.QualifiedNamePath <em>Qualified Name Path</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org3.kermeta.alf.QualifiedNamePath
	 * @generated
	 */
	public Adapter createQualifiedNamePathAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org3.kermeta.alf.UnqualifiedName <em>Unqualified Name</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org3.kermeta.alf.UnqualifiedName
	 * @generated
	 */
	public Adapter createUnqualifiedNameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org3.kermeta.alf.TemplateBinding <em>Template Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org3.kermeta.alf.TemplateBinding
	 * @generated
	 */
	public Adapter createTemplateBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org3.kermeta.alf.NamedTemplateBinding <em>Named Template Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org3.kermeta.alf.NamedTemplateBinding
	 * @generated
	 */
	public Adapter createNamedTemplateBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org3.kermeta.alf.QualifiedNameWithBinding <em>Qualified Name With Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org3.kermeta.alf.QualifiedNameWithBinding
	 * @generated
	 */
	public Adapter createQualifiedNameWithBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org3.kermeta.alf.Tuple <em>Tuple</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org3.kermeta.alf.Tuple
	 * @generated
	 */
	public Adapter createTupleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org3.kermeta.alf.TupleElement <em>Tuple Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org3.kermeta.alf.TupleElement
	 * @generated
	 */
	public Adapter createTupleElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org3.kermeta.alf.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org3.kermeta.alf.Expression
	 * @generated
	 */
	public Adapter createExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org3.kermeta.alf.ConditionalTestExpression <em>Conditional Test Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org3.kermeta.alf.ConditionalTestExpression
	 * @generated
	 */
	public Adapter createConditionalTestExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org3.kermeta.alf.ConditionalOrExpression <em>Conditional Or Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org3.kermeta.alf.ConditionalOrExpression
	 * @generated
	 */
	public Adapter createConditionalOrExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org3.kermeta.alf.ConditionalAndExpression <em>Conditional And Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org3.kermeta.alf.ConditionalAndExpression
	 * @generated
	 */
	public Adapter createConditionalAndExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org3.kermeta.alf.InclusiveOrExpression <em>Inclusive Or Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org3.kermeta.alf.InclusiveOrExpression
	 * @generated
	 */
	public Adapter createInclusiveOrExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org3.kermeta.alf.ExclusiveOrExpression <em>Exclusive Or Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org3.kermeta.alf.ExclusiveOrExpression
	 * @generated
	 */
	public Adapter createExclusiveOrExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org3.kermeta.alf.AndExpression <em>And Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org3.kermeta.alf.AndExpression
	 * @generated
	 */
	public Adapter createAndExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org3.kermeta.alf.EqualityExpression <em>Equality Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org3.kermeta.alf.EqualityExpression
	 * @generated
	 */
	public Adapter createEqualityExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org3.kermeta.alf.ClassificationExpression <em>Classification Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org3.kermeta.alf.ClassificationExpression
	 * @generated
	 */
	public Adapter createClassificationExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org3.kermeta.alf.RelationalExpression <em>Relational Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org3.kermeta.alf.RelationalExpression
	 * @generated
	 */
	public Adapter createRelationalExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org3.kermeta.alf.ShiftExpression <em>Shift Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org3.kermeta.alf.ShiftExpression
	 * @generated
	 */
	public Adapter createShiftExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org3.kermeta.alf.AdditiveExpression <em>Additive Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org3.kermeta.alf.AdditiveExpression
	 * @generated
	 */
	public Adapter createAdditiveExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org3.kermeta.alf.MultiplicativeExpression <em>Multiplicative Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org3.kermeta.alf.MultiplicativeExpression
	 * @generated
	 */
	public Adapter createMultiplicativeExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org3.kermeta.alf.UnaryExpression <em>Unary Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org3.kermeta.alf.UnaryExpression
	 * @generated
	 */
	public Adapter createUnaryExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org3.kermeta.alf.PrimaryExpression <em>Primary Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org3.kermeta.alf.PrimaryExpression
	 * @generated
	 */
	public Adapter createPrimaryExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org3.kermeta.alf.SuffixExpression <em>Suffix Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org3.kermeta.alf.SuffixExpression
	 * @generated
	 */
	public Adapter createSuffixExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org3.kermeta.alf.OperationCallExpression <em>Operation Call Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org3.kermeta.alf.OperationCallExpression
	 * @generated
	 */
	public Adapter createOperationCallExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org3.kermeta.alf.OperationCallExpressionWithoutDot <em>Operation Call Expression Without Dot</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org3.kermeta.alf.OperationCallExpressionWithoutDot
	 * @generated
	 */
	public Adapter createOperationCallExpressionWithoutDotAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org3.kermeta.alf.PropertyCallExpression <em>Property Call Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org3.kermeta.alf.PropertyCallExpression
	 * @generated
	 */
	public Adapter createPropertyCallExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org3.kermeta.alf.LinkOperationExpression <em>Link Operation Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org3.kermeta.alf.LinkOperationExpression
	 * @generated
	 */
	public Adapter createLinkOperationExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org3.kermeta.alf.LinkOperationTuple <em>Link Operation Tuple</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org3.kermeta.alf.LinkOperationTuple
	 * @generated
	 */
	public Adapter createLinkOperationTupleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org3.kermeta.alf.LinkOperationTupleElement <em>Link Operation Tuple Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org3.kermeta.alf.LinkOperationTupleElement
	 * @generated
	 */
	public Adapter createLinkOperationTupleElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org3.kermeta.alf.SequenceOperationExpression <em>Sequence Operation Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org3.kermeta.alf.SequenceOperationExpression
	 * @generated
	 */
	public Adapter createSequenceOperationExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org3.kermeta.alf.SequenceReductionExpression <em>Sequence Reduction Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org3.kermeta.alf.SequenceReductionExpression
	 * @generated
	 */
	public Adapter createSequenceReductionExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org3.kermeta.alf.SequenceExpansionExpression <em>Sequence Expansion Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org3.kermeta.alf.SequenceExpansionExpression
	 * @generated
	 */
	public Adapter createSequenceExpansionExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org3.kermeta.alf.SelectOrRejectOperation <em>Select Or Reject Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org3.kermeta.alf.SelectOrRejectOperation
	 * @generated
	 */
	public Adapter createSelectOrRejectOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org3.kermeta.alf.CollectOrIterateOperation <em>Collect Or Iterate Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org3.kermeta.alf.CollectOrIterateOperation
	 * @generated
	 */
	public Adapter createCollectOrIterateOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org3.kermeta.alf.ForAllOrExistsOrOneOperation <em>For All Or Exists Or One Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org3.kermeta.alf.ForAllOrExistsOrOneOperation
	 * @generated
	 */
	public Adapter createForAllOrExistsOrOneOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org3.kermeta.alf.IsUniqueOperation <em>Is Unique Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org3.kermeta.alf.IsUniqueOperation
	 * @generated
	 */
	public Adapter createIsUniqueOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org3.kermeta.alf.ValueSpecification <em>Value Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org3.kermeta.alf.ValueSpecification
	 * @generated
	 */
	public Adapter createValueSpecificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org3.kermeta.alf.NonLiteralValueSpecification <em>Non Literal Value Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org3.kermeta.alf.NonLiteralValueSpecification
	 * @generated
	 */
	public Adapter createNonLiteralValueSpecificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org3.kermeta.alf.ParenthesizedExpression <em>Parenthesized Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org3.kermeta.alf.ParenthesizedExpression
	 * @generated
	 */
	public Adapter createParenthesizedExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org3.kermeta.alf.NullExpression <em>Null Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org3.kermeta.alf.NullExpression
	 * @generated
	 */
	public Adapter createNullExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org3.kermeta.alf.ThisExpression <em>This Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org3.kermeta.alf.ThisExpression
	 * @generated
	 */
	public Adapter createThisExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org3.kermeta.alf.SuperInvocationExpression <em>Super Invocation Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org3.kermeta.alf.SuperInvocationExpression
	 * @generated
	 */
	public Adapter createSuperInvocationExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org3.kermeta.alf.InstanceCreationExpression <em>Instance Creation Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org3.kermeta.alf.InstanceCreationExpression
	 * @generated
	 */
	public Adapter createInstanceCreationExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org3.kermeta.alf.SequenceConstructionOrAccessCompletion <em>Sequence Construction Or Access Completion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org3.kermeta.alf.SequenceConstructionOrAccessCompletion
	 * @generated
	 */
	public Adapter createSequenceConstructionOrAccessCompletionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org3.kermeta.alf.AccessCompletion <em>Access Completion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org3.kermeta.alf.AccessCompletion
	 * @generated
	 */
	public Adapter createAccessCompletionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org3.kermeta.alf.PartialSequenceConstructionCompletion <em>Partial Sequence Construction Completion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org3.kermeta.alf.PartialSequenceConstructionCompletion
	 * @generated
	 */
	public Adapter createPartialSequenceConstructionCompletionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org3.kermeta.alf.SequenceConstructionCompletion <em>Sequence Construction Completion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org3.kermeta.alf.SequenceConstructionCompletion
	 * @generated
	 */
	public Adapter createSequenceConstructionCompletionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org3.kermeta.alf.SequenceConstructionExpression <em>Sequence Construction Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org3.kermeta.alf.SequenceConstructionExpression
	 * @generated
	 */
	public Adapter createSequenceConstructionExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org3.kermeta.alf.SequenceElement <em>Sequence Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org3.kermeta.alf.SequenceElement
	 * @generated
	 */
	public Adapter createSequenceElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org3.kermeta.alf.ClassExtentExpression <em>Class Extent Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org3.kermeta.alf.ClassExtentExpression
	 * @generated
	 */
	public Adapter createClassExtentExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org3.kermeta.alf.Block <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org3.kermeta.alf.Block
	 * @generated
	 */
	public Adapter createBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org3.kermeta.alf.StatementSequence <em>Statement Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org3.kermeta.alf.StatementSequence
	 * @generated
	 */
	public Adapter createStatementSequenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org3.kermeta.alf.InlineStatement <em>Inline Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org3.kermeta.alf.InlineStatement
	 * @generated
	 */
	public Adapter createInlineStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org3.kermeta.alf.AnnotatedStatement <em>Annotated Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org3.kermeta.alf.AnnotatedStatement
	 * @generated
	 */
	public Adapter createAnnotatedStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org3.kermeta.alf.DocumentedStatement <em>Documented Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org3.kermeta.alf.DocumentedStatement
	 * @generated
	 */
	public Adapter createDocumentedStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org3.kermeta.alf.Statement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org3.kermeta.alf.Statement
	 * @generated
	 */
	public Adapter createStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org3.kermeta.alf.Annotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org3.kermeta.alf.Annotation
	 * @generated
	 */
	public Adapter createAnnotationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org3.kermeta.alf.BlockStatement <em>Block Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org3.kermeta.alf.BlockStatement
	 * @generated
	 */
	public Adapter createBlockStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org3.kermeta.alf.EmptyStatement <em>Empty Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org3.kermeta.alf.EmptyStatement
	 * @generated
	 */
	public Adapter createEmptyStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org3.kermeta.alf.LocalNameDeclarationStatement <em>Local Name Declaration Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org3.kermeta.alf.LocalNameDeclarationStatement
	 * @generated
	 */
	public Adapter createLocalNameDeclarationStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org3.kermeta.alf.IfStatement <em>If Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org3.kermeta.alf.IfStatement
	 * @generated
	 */
	public Adapter createIfStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org3.kermeta.alf.SequentialClauses <em>Sequential Clauses</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org3.kermeta.alf.SequentialClauses
	 * @generated
	 */
	public Adapter createSequentialClausesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org3.kermeta.alf.ConcurrentClauses <em>Concurrent Clauses</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org3.kermeta.alf.ConcurrentClauses
	 * @generated
	 */
	public Adapter createConcurrentClausesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org3.kermeta.alf.NonFinalClause <em>Non Final Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org3.kermeta.alf.NonFinalClause
	 * @generated
	 */
	public Adapter createNonFinalClauseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org3.kermeta.alf.FinalClause <em>Final Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org3.kermeta.alf.FinalClause
	 * @generated
	 */
	public Adapter createFinalClauseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org3.kermeta.alf.SwitchStatement <em>Switch Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org3.kermeta.alf.SwitchStatement
	 * @generated
	 */
	public Adapter createSwitchStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org3.kermeta.alf.SwitchClause <em>Switch Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org3.kermeta.alf.SwitchClause
	 * @generated
	 */
	public Adapter createSwitchClauseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org3.kermeta.alf.SwitchCase <em>Switch Case</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org3.kermeta.alf.SwitchCase
	 * @generated
	 */
	public Adapter createSwitchCaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org3.kermeta.alf.SwitchDefaultClause <em>Switch Default Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org3.kermeta.alf.SwitchDefaultClause
	 * @generated
	 */
	public Adapter createSwitchDefaultClauseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org3.kermeta.alf.NonEmptyStatementSequence <em>Non Empty Statement Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org3.kermeta.alf.NonEmptyStatementSequence
	 * @generated
	 */
	public Adapter createNonEmptyStatementSequenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org3.kermeta.alf.WhileStatement <em>While Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org3.kermeta.alf.WhileStatement
	 * @generated
	 */
	public Adapter createWhileStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org3.kermeta.alf.DoStatement <em>Do Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org3.kermeta.alf.DoStatement
	 * @generated
	 */
	public Adapter createDoStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org3.kermeta.alf.ForStatement <em>For Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org3.kermeta.alf.ForStatement
	 * @generated
	 */
	public Adapter createForStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org3.kermeta.alf.ForControl <em>For Control</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org3.kermeta.alf.ForControl
	 * @generated
	 */
	public Adapter createForControlAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org3.kermeta.alf.LoopVariableDefinition <em>Loop Variable Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org3.kermeta.alf.LoopVariableDefinition
	 * @generated
	 */
	public Adapter createLoopVariableDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org3.kermeta.alf.BreakStatement <em>Break Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org3.kermeta.alf.BreakStatement
	 * @generated
	 */
	public Adapter createBreakStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org3.kermeta.alf.ReturnStatement <em>Return Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org3.kermeta.alf.ReturnStatement
	 * @generated
	 */
	public Adapter createReturnStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org3.kermeta.alf.AcceptStatement <em>Accept Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org3.kermeta.alf.AcceptStatement
	 * @generated
	 */
	public Adapter createAcceptStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org3.kermeta.alf.SimpleAcceptStatementCompletion <em>Simple Accept Statement Completion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org3.kermeta.alf.SimpleAcceptStatementCompletion
	 * @generated
	 */
	public Adapter createSimpleAcceptStatementCompletionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org3.kermeta.alf.CompoundAcceptStatementCompletion <em>Compound Accept Statement Completion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org3.kermeta.alf.CompoundAcceptStatementCompletion
	 * @generated
	 */
	public Adapter createCompoundAcceptStatementCompletionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org3.kermeta.alf.AcceptBlock <em>Accept Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org3.kermeta.alf.AcceptBlock
	 * @generated
	 */
	public Adapter createAcceptBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org3.kermeta.alf.AcceptClause <em>Accept Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org3.kermeta.alf.AcceptClause
	 * @generated
	 */
	public Adapter createAcceptClauseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org3.kermeta.alf.ClassifyStatement <em>Classify Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org3.kermeta.alf.ClassifyStatement
	 * @generated
	 */
	public Adapter createClassifyStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org3.kermeta.alf.ClassificationClause <em>Classification Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org3.kermeta.alf.ClassificationClause
	 * @generated
	 */
	public Adapter createClassificationClauseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org3.kermeta.alf.ClassificationFromClause <em>Classification From Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org3.kermeta.alf.ClassificationFromClause
	 * @generated
	 */
	public Adapter createClassificationFromClauseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org3.kermeta.alf.ClassificationToClause <em>Classification To Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org3.kermeta.alf.ClassificationToClause
	 * @generated
	 */
	public Adapter createClassificationToClauseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org3.kermeta.alf.ReclassifyAllClause <em>Reclassify All Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org3.kermeta.alf.ReclassifyAllClause
	 * @generated
	 */
	public Adapter createReclassifyAllClauseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org3.kermeta.alf.QualifiedNameList <em>Qualified Name List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org3.kermeta.alf.QualifiedNameList
	 * @generated
	 */
	public Adapter createQualifiedNameListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org3.kermeta.alf.InvocationOrAssignementOrDeclarationStatement <em>Invocation Or Assignement Or Declaration Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org3.kermeta.alf.InvocationOrAssignementOrDeclarationStatement
	 * @generated
	 */
	public Adapter createInvocationOrAssignementOrDeclarationStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org3.kermeta.alf.SuperInvocationStatement <em>Super Invocation Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org3.kermeta.alf.SuperInvocationStatement
	 * @generated
	 */
	public Adapter createSuperInvocationStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org3.kermeta.alf.ThisInvocationStatement <em>This Invocation Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org3.kermeta.alf.ThisInvocationStatement
	 * @generated
	 */
	public Adapter createThisInvocationStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org3.kermeta.alf.InstanceCreationInvocationStatement <em>Instance Creation Invocation Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org3.kermeta.alf.InstanceCreationInvocationStatement
	 * @generated
	 */
	public Adapter createInstanceCreationInvocationStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org3.kermeta.alf.VariableDeclarationCompletion <em>Variable Declaration Completion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org3.kermeta.alf.VariableDeclarationCompletion
	 * @generated
	 */
	public Adapter createVariableDeclarationCompletionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org3.kermeta.alf.AssignmentCompletion <em>Assignment Completion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org3.kermeta.alf.AssignmentCompletion
	 * @generated
	 */
	public Adapter createAssignmentCompletionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //AlfAdapterFactory
