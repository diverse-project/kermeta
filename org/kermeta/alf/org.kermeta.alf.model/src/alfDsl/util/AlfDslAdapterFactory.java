/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package alfDsl.util;

import alfDsl.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see alfDsl.AlfDslPackage
 * @generated
 */
public class AlfDslAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AlfDslPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlfDslAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = AlfDslPackage.eINSTANCE;
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
	protected AlfDslSwitch modelSwitch =
		new AlfDslSwitch() {
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
	 * Creates a new adapter for an object of class '{@link alfDsl.CLASSSTRUCT <em>CLASSSTRUCT</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see alfDsl.CLASSSTRUCT
	 * @generated
	 */
	public Adapter createCLASSSTRUCTAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link alfDsl.CLASSOP <em>CLASSOP</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see alfDsl.CLASSOP
	 * @generated
	 */
	public Adapter createCLASSOPAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link alfDsl.LITERAL <em>LITERAL</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see alfDsl.LITERAL
	 * @generated
	 */
	public Adapter createLITERALAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link alfDsl.BOOLEAN_LITERAL <em>BOOLEAN LITERAL</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see alfDsl.BOOLEAN_LITERAL
	 * @generated
	 */
	public Adapter createBOOLEAN_LITERALAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link alfDsl.NUMBER_LITERAL <em>NUMBER LITERAL</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see alfDsl.NUMBER_LITERAL
	 * @generated
	 */
	public Adapter createNUMBER_LITERALAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link alfDsl.INTEGER_LITERAL <em>INTEGER LITERAL</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see alfDsl.INTEGER_LITERAL
	 * @generated
	 */
	public Adapter createINTEGER_LITERALAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link alfDsl.UNLIMITED_LITERAL <em>UNLIMITED LITERAL</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see alfDsl.UNLIMITED_LITERAL
	 * @generated
	 */
	public Adapter createUNLIMITED_LITERALAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link alfDsl.STRING_LITERAL <em>STRING LITERAL</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see alfDsl.STRING_LITERAL
	 * @generated
	 */
	public Adapter createSTRING_LITERALAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link alfDsl.NameExpression <em>Name Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see alfDsl.NameExpression
	 * @generated
	 */
	public Adapter createNameExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link alfDsl.QualifiedNamePath <em>Qualified Name Path</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see alfDsl.QualifiedNamePath
	 * @generated
	 */
	public Adapter createQualifiedNamePathAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link alfDsl.UnqualifiedName <em>Unqualified Name</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see alfDsl.UnqualifiedName
	 * @generated
	 */
	public Adapter createUnqualifiedNameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link alfDsl.TemplateBinding <em>Template Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see alfDsl.TemplateBinding
	 * @generated
	 */
	public Adapter createTemplateBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link alfDsl.NamedTemplateBinding <em>Named Template Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see alfDsl.NamedTemplateBinding
	 * @generated
	 */
	public Adapter createNamedTemplateBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link alfDsl.QualifiedNameWithBinding <em>Qualified Name With Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see alfDsl.QualifiedNameWithBinding
	 * @generated
	 */
	public Adapter createQualifiedNameWithBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link alfDsl.Tuple <em>Tuple</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see alfDsl.Tuple
	 * @generated
	 */
	public Adapter createTupleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link alfDsl.TupleElement <em>Tuple Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see alfDsl.TupleElement
	 * @generated
	 */
	public Adapter createTupleElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link alfDsl.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see alfDsl.Expression
	 * @generated
	 */
	public Adapter createExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link alfDsl.ConditionalTestExpression <em>Conditional Test Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see alfDsl.ConditionalTestExpression
	 * @generated
	 */
	public Adapter createConditionalTestExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link alfDsl.ConditionalOrExpression <em>Conditional Or Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see alfDsl.ConditionalOrExpression
	 * @generated
	 */
	public Adapter createConditionalOrExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link alfDsl.ConditionalAndExpression <em>Conditional And Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see alfDsl.ConditionalAndExpression
	 * @generated
	 */
	public Adapter createConditionalAndExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link alfDsl.InclusiveOrExpression <em>Inclusive Or Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see alfDsl.InclusiveOrExpression
	 * @generated
	 */
	public Adapter createInclusiveOrExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link alfDsl.ExclusiveOrExpression <em>Exclusive Or Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see alfDsl.ExclusiveOrExpression
	 * @generated
	 */
	public Adapter createExclusiveOrExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link alfDsl.AndExpression <em>And Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see alfDsl.AndExpression
	 * @generated
	 */
	public Adapter createAndExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link alfDsl.EqualityExpression <em>Equality Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see alfDsl.EqualityExpression
	 * @generated
	 */
	public Adapter createEqualityExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link alfDsl.ClassificationExpression <em>Classification Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see alfDsl.ClassificationExpression
	 * @generated
	 */
	public Adapter createClassificationExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link alfDsl.RelationalExpression <em>Relational Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see alfDsl.RelationalExpression
	 * @generated
	 */
	public Adapter createRelationalExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link alfDsl.ShiftExpression <em>Shift Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see alfDsl.ShiftExpression
	 * @generated
	 */
	public Adapter createShiftExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link alfDsl.AdditiveExpression <em>Additive Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see alfDsl.AdditiveExpression
	 * @generated
	 */
	public Adapter createAdditiveExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link alfDsl.MultiplicativeExpression <em>Multiplicative Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see alfDsl.MultiplicativeExpression
	 * @generated
	 */
	public Adapter createMultiplicativeExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link alfDsl.UnaryExpression <em>Unary Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see alfDsl.UnaryExpression
	 * @generated
	 */
	public Adapter createUnaryExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link alfDsl.PrimaryExpression <em>Primary Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see alfDsl.PrimaryExpression
	 * @generated
	 */
	public Adapter createPrimaryExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link alfDsl.SuffixExpression <em>Suffix Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see alfDsl.SuffixExpression
	 * @generated
	 */
	public Adapter createSuffixExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link alfDsl.OperationCallExpression <em>Operation Call Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see alfDsl.OperationCallExpression
	 * @generated
	 */
	public Adapter createOperationCallExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link alfDsl.OperationCallExpressionWithoutDot <em>Operation Call Expression Without Dot</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see alfDsl.OperationCallExpressionWithoutDot
	 * @generated
	 */
	public Adapter createOperationCallExpressionWithoutDotAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link alfDsl.PropertyCallExpression <em>Property Call Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see alfDsl.PropertyCallExpression
	 * @generated
	 */
	public Adapter createPropertyCallExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link alfDsl.LinkOperationExpression <em>Link Operation Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see alfDsl.LinkOperationExpression
	 * @generated
	 */
	public Adapter createLinkOperationExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link alfDsl.LinkOperationTuple <em>Link Operation Tuple</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see alfDsl.LinkOperationTuple
	 * @generated
	 */
	public Adapter createLinkOperationTupleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link alfDsl.LinkOperationTupleElement <em>Link Operation Tuple Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see alfDsl.LinkOperationTupleElement
	 * @generated
	 */
	public Adapter createLinkOperationTupleElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link alfDsl.SequenceOperationExpression <em>Sequence Operation Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see alfDsl.SequenceOperationExpression
	 * @generated
	 */
	public Adapter createSequenceOperationExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link alfDsl.SequenceReductionExpression <em>Sequence Reduction Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see alfDsl.SequenceReductionExpression
	 * @generated
	 */
	public Adapter createSequenceReductionExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link alfDsl.SequenceExpansionExpression <em>Sequence Expansion Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see alfDsl.SequenceExpansionExpression
	 * @generated
	 */
	public Adapter createSequenceExpansionExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link alfDsl.SelectOrRejectOperation <em>Select Or Reject Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see alfDsl.SelectOrRejectOperation
	 * @generated
	 */
	public Adapter createSelectOrRejectOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link alfDsl.CollectOrIterateOperation <em>Collect Or Iterate Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see alfDsl.CollectOrIterateOperation
	 * @generated
	 */
	public Adapter createCollectOrIterateOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link alfDsl.ForAllOrExistsOrOneOperation <em>For All Or Exists Or One Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see alfDsl.ForAllOrExistsOrOneOperation
	 * @generated
	 */
	public Adapter createForAllOrExistsOrOneOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link alfDsl.IsUniqueOperation <em>Is Unique Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see alfDsl.IsUniqueOperation
	 * @generated
	 */
	public Adapter createIsUniqueOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link alfDsl.ValueSpecification <em>Value Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see alfDsl.ValueSpecification
	 * @generated
	 */
	public Adapter createValueSpecificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link alfDsl.NonLiteralValueSpecification <em>Non Literal Value Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see alfDsl.NonLiteralValueSpecification
	 * @generated
	 */
	public Adapter createNonLiteralValueSpecificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link alfDsl.ParenthesizedExpression <em>Parenthesized Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see alfDsl.ParenthesizedExpression
	 * @generated
	 */
	public Adapter createParenthesizedExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link alfDsl.NullExpression <em>Null Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see alfDsl.NullExpression
	 * @generated
	 */
	public Adapter createNullExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link alfDsl.ThisExpression <em>This Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see alfDsl.ThisExpression
	 * @generated
	 */
	public Adapter createThisExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link alfDsl.SuperInvocationExpression <em>Super Invocation Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see alfDsl.SuperInvocationExpression
	 * @generated
	 */
	public Adapter createSuperInvocationExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link alfDsl.InstanceCreationExpression <em>Instance Creation Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see alfDsl.InstanceCreationExpression
	 * @generated
	 */
	public Adapter createInstanceCreationExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link alfDsl.SequenceConstructionOrAccessCompletion <em>Sequence Construction Or Access Completion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see alfDsl.SequenceConstructionOrAccessCompletion
	 * @generated
	 */
	public Adapter createSequenceConstructionOrAccessCompletionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link alfDsl.AccessCompletion <em>Access Completion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see alfDsl.AccessCompletion
	 * @generated
	 */
	public Adapter createAccessCompletionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link alfDsl.PartialSequenceConstructionCompletion <em>Partial Sequence Construction Completion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see alfDsl.PartialSequenceConstructionCompletion
	 * @generated
	 */
	public Adapter createPartialSequenceConstructionCompletionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link alfDsl.SequenceConstructionCompletion <em>Sequence Construction Completion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see alfDsl.SequenceConstructionCompletion
	 * @generated
	 */
	public Adapter createSequenceConstructionCompletionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link alfDsl.SequenceConstructionExpression <em>Sequence Construction Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see alfDsl.SequenceConstructionExpression
	 * @generated
	 */
	public Adapter createSequenceConstructionExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link alfDsl.SequenceElement <em>Sequence Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see alfDsl.SequenceElement
	 * @generated
	 */
	public Adapter createSequenceElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link alfDsl.ClassExtentExpression <em>Class Extent Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see alfDsl.ClassExtentExpression
	 * @generated
	 */
	public Adapter createClassExtentExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link alfDsl.Block <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see alfDsl.Block
	 * @generated
	 */
	public Adapter createBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link alfDsl.StatementSequence <em>Statement Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see alfDsl.StatementSequence
	 * @generated
	 */
	public Adapter createStatementSequenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link alfDsl.InlineStatement <em>Inline Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see alfDsl.InlineStatement
	 * @generated
	 */
	public Adapter createInlineStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link alfDsl.AnnotatedStatement <em>Annotated Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see alfDsl.AnnotatedStatement
	 * @generated
	 */
	public Adapter createAnnotatedStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link alfDsl.DocumentedStatement <em>Documented Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see alfDsl.DocumentedStatement
	 * @generated
	 */
	public Adapter createDocumentedStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link alfDsl.Statement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see alfDsl.Statement
	 * @generated
	 */
	public Adapter createStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link alfDsl.Annotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see alfDsl.Annotation
	 * @generated
	 */
	public Adapter createAnnotationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link alfDsl.BlockStatement <em>Block Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see alfDsl.BlockStatement
	 * @generated
	 */
	public Adapter createBlockStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link alfDsl.EmptyStatement <em>Empty Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see alfDsl.EmptyStatement
	 * @generated
	 */
	public Adapter createEmptyStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link alfDsl.LocalNameDeclarationStatement <em>Local Name Declaration Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see alfDsl.LocalNameDeclarationStatement
	 * @generated
	 */
	public Adapter createLocalNameDeclarationStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link alfDsl.IfStatement <em>If Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see alfDsl.IfStatement
	 * @generated
	 */
	public Adapter createIfStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link alfDsl.SequentialClauses <em>Sequential Clauses</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see alfDsl.SequentialClauses
	 * @generated
	 */
	public Adapter createSequentialClausesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link alfDsl.ConcurrentClauses <em>Concurrent Clauses</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see alfDsl.ConcurrentClauses
	 * @generated
	 */
	public Adapter createConcurrentClausesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link alfDsl.NonFinalClause <em>Non Final Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see alfDsl.NonFinalClause
	 * @generated
	 */
	public Adapter createNonFinalClauseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link alfDsl.FinalClause <em>Final Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see alfDsl.FinalClause
	 * @generated
	 */
	public Adapter createFinalClauseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link alfDsl.SwitchStatement <em>Switch Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see alfDsl.SwitchStatement
	 * @generated
	 */
	public Adapter createSwitchStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link alfDsl.SwitchClause <em>Switch Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see alfDsl.SwitchClause
	 * @generated
	 */
	public Adapter createSwitchClauseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link alfDsl.SwitchCase <em>Switch Case</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see alfDsl.SwitchCase
	 * @generated
	 */
	public Adapter createSwitchCaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link alfDsl.SwitchDefaultClause <em>Switch Default Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see alfDsl.SwitchDefaultClause
	 * @generated
	 */
	public Adapter createSwitchDefaultClauseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link alfDsl.NonEmptyStatementSequence <em>Non Empty Statement Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see alfDsl.NonEmptyStatementSequence
	 * @generated
	 */
	public Adapter createNonEmptyStatementSequenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link alfDsl.WhileStatement <em>While Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see alfDsl.WhileStatement
	 * @generated
	 */
	public Adapter createWhileStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link alfDsl.DoStatement <em>Do Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see alfDsl.DoStatement
	 * @generated
	 */
	public Adapter createDoStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link alfDsl.ForStatement <em>For Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see alfDsl.ForStatement
	 * @generated
	 */
	public Adapter createForStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link alfDsl.ForControl <em>For Control</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see alfDsl.ForControl
	 * @generated
	 */
	public Adapter createForControlAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link alfDsl.LoopVariableDefinition <em>Loop Variable Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see alfDsl.LoopVariableDefinition
	 * @generated
	 */
	public Adapter createLoopVariableDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link alfDsl.BreakStatement <em>Break Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see alfDsl.BreakStatement
	 * @generated
	 */
	public Adapter createBreakStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link alfDsl.ReturnStatement <em>Return Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see alfDsl.ReturnStatement
	 * @generated
	 */
	public Adapter createReturnStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link alfDsl.AcceptStatement <em>Accept Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see alfDsl.AcceptStatement
	 * @generated
	 */
	public Adapter createAcceptStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link alfDsl.SimpleAcceptStatementCompletion <em>Simple Accept Statement Completion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see alfDsl.SimpleAcceptStatementCompletion
	 * @generated
	 */
	public Adapter createSimpleAcceptStatementCompletionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link alfDsl.CompoundAcceptStatementCompletion <em>Compound Accept Statement Completion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see alfDsl.CompoundAcceptStatementCompletion
	 * @generated
	 */
	public Adapter createCompoundAcceptStatementCompletionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link alfDsl.AcceptBlock <em>Accept Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see alfDsl.AcceptBlock
	 * @generated
	 */
	public Adapter createAcceptBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link alfDsl.AcceptClause <em>Accept Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see alfDsl.AcceptClause
	 * @generated
	 */
	public Adapter createAcceptClauseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link alfDsl.ClassifyStatement <em>Classify Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see alfDsl.ClassifyStatement
	 * @generated
	 */
	public Adapter createClassifyStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link alfDsl.ClassificationClause <em>Classification Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see alfDsl.ClassificationClause
	 * @generated
	 */
	public Adapter createClassificationClauseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link alfDsl.ClassificationFromClause <em>Classification From Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see alfDsl.ClassificationFromClause
	 * @generated
	 */
	public Adapter createClassificationFromClauseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link alfDsl.ClassificationToClause <em>Classification To Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see alfDsl.ClassificationToClause
	 * @generated
	 */
	public Adapter createClassificationToClauseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link alfDsl.ReclassifyAllClause <em>Reclassify All Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see alfDsl.ReclassifyAllClause
	 * @generated
	 */
	public Adapter createReclassifyAllClauseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link alfDsl.QualifiedNameList <em>Qualified Name List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see alfDsl.QualifiedNameList
	 * @generated
	 */
	public Adapter createQualifiedNameListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link alfDsl.InvocationOrAssignementOrDeclarationStatement <em>Invocation Or Assignement Or Declaration Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see alfDsl.InvocationOrAssignementOrDeclarationStatement
	 * @generated
	 */
	public Adapter createInvocationOrAssignementOrDeclarationStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link alfDsl.SuperInvocationStatement <em>Super Invocation Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see alfDsl.SuperInvocationStatement
	 * @generated
	 */
	public Adapter createSuperInvocationStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link alfDsl.ThisInvocationStatement <em>This Invocation Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see alfDsl.ThisInvocationStatement
	 * @generated
	 */
	public Adapter createThisInvocationStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link alfDsl.InstanceCreationInvocationStatement <em>Instance Creation Invocation Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see alfDsl.InstanceCreationInvocationStatement
	 * @generated
	 */
	public Adapter createInstanceCreationInvocationStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link alfDsl.VariableDeclarationCompletion <em>Variable Declaration Completion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see alfDsl.VariableDeclarationCompletion
	 * @generated
	 */
	public Adapter createVariableDeclarationCompletionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link alfDsl.AssignmentCompletion <em>Assignment Completion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see alfDsl.AssignmentCompletion
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

} //AlfDslAdapterFactory
