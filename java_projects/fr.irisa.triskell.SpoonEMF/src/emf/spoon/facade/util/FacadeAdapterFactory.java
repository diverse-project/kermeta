/**
 * <copyright>
 * </copyright>
 *
 * $Id: FacadeAdapterFactory.java,v 1.1 2007/02/14 20:38:05 barais Exp $
 */
package emf.spoon.facade.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

import spoon.reflect.code.CtAbstractInvocation;
import spoon.reflect.code.CtArrayAccess;
import spoon.reflect.code.CtAssert;
import spoon.reflect.code.CtAssignment;
import spoon.reflect.code.CtBinaryOperator;
import spoon.reflect.code.CtBlock;
import spoon.reflect.code.CtBreak;
import spoon.reflect.code.CtCFlowBreak;
import spoon.reflect.code.CtCase;
import spoon.reflect.code.CtCatch;
import spoon.reflect.code.CtCodeElement;
import spoon.reflect.code.CtConditional;
import spoon.reflect.code.CtContinue;
import spoon.reflect.code.CtDo;
import spoon.reflect.code.CtExpression;
import spoon.reflect.code.CtFieldAccess;
import spoon.reflect.code.CtFor;
import spoon.reflect.code.CtForEach;
import spoon.reflect.code.CtIf;
import spoon.reflect.code.CtInvocation;
import spoon.reflect.code.CtLiteral;
import spoon.reflect.code.CtLocalVariable;
import spoon.reflect.code.CtLoop;
import spoon.reflect.code.CtNewArray;
import spoon.reflect.code.CtNewClass;
import spoon.reflect.code.CtOperatorAssignment;
import spoon.reflect.code.CtReturn;
import spoon.reflect.code.CtStatement;
import spoon.reflect.code.CtStatementList;
import spoon.reflect.code.CtSwitch;
import spoon.reflect.code.CtSynchronized;
import spoon.reflect.code.CtTargetedExpression;
import spoon.reflect.code.CtThrow;
import spoon.reflect.code.CtTry;
import spoon.reflect.code.CtUnaryOperator;
import spoon.reflect.code.CtVariableAccess;
import spoon.reflect.code.CtWhile;
import spoon.reflect.cu.SourcePosition;
import spoon.reflect.declaration.CtAnnotation;
import spoon.reflect.declaration.CtAnnotationType;
import spoon.reflect.declaration.CtAnonymousExecutable;
import spoon.reflect.declaration.CtClass;
import spoon.reflect.declaration.CtConstructor;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.declaration.CtEnum;
import spoon.reflect.declaration.CtExecutable;
import spoon.reflect.declaration.CtField;
import spoon.reflect.declaration.CtGenericElement;
import spoon.reflect.declaration.CtInterface;
import spoon.reflect.declaration.CtMethod;
import spoon.reflect.declaration.CtModifiable;
import spoon.reflect.declaration.CtNamedElement;
import spoon.reflect.declaration.CtPackage;
import spoon.reflect.declaration.CtParameter;
import spoon.reflect.declaration.CtSimpleType;
import spoon.reflect.declaration.CtType;
import spoon.reflect.declaration.CtTypeParameter;
import spoon.reflect.declaration.CtTypedElement;
import spoon.reflect.declaration.CtVariable;
import spoon.reflect.reference.CtArrayTypeReference;
import spoon.reflect.reference.CtExecutableReference;
import spoon.reflect.reference.CtFieldReference;
import spoon.reflect.reference.CtGenericElementReference;
import spoon.reflect.reference.CtLocalVariableReference;
import spoon.reflect.reference.CtPackageReference;
import spoon.reflect.reference.CtParameterReference;
import spoon.reflect.reference.CtReference;
import spoon.reflect.reference.CtTypeParameterReference;
import spoon.reflect.reference.CtTypeReference;
import spoon.reflect.reference.CtVariableReference;
import emf.spoon.facade.FacadePackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see emf.spoon.facade.FacadePackage
 * @generated
 */
public class FacadeAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static FacadePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FacadeAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = FacadePackage.eINSTANCE;
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
	 * The switch the delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FacadeSwitch modelSwitch =
		new FacadeSwitch() {
			public Object caseCtArrayTypeReference(CtArrayTypeReference object) {
				return createCtArrayTypeReferenceAdapter();
			}
			public Object caseCtExecutableReference(CtExecutableReference object) {
				return createCtExecutableReferenceAdapter();
			}
			public Object caseCtFieldReference(CtFieldReference object) {
				return createCtFieldReferenceAdapter();
			}
			public Object caseCtGenericElementReference(CtGenericElementReference object) {
				return createCtGenericElementReferenceAdapter();
			}
			public Object caseCtLocalVariableReference(CtLocalVariableReference object) {
				return createCtLocalVariableReferenceAdapter();
			}
			public Object caseCtPackageReference(CtPackageReference object) {
				return createCtPackageReferenceAdapter();
			}
			public Object caseCtParameterReference(CtParameterReference object) {
				return createCtParameterReferenceAdapter();
			}
			public Object caseCtReference(CtReference object) {
				return createCtReferenceAdapter();
			}
			public Object caseCtTypeParameterReference(CtTypeParameterReference object) {
				return createCtTypeParameterReferenceAdapter();
			}
			public Object caseCtTypeReference(CtTypeReference object) {
				return createCtTypeReferenceAdapter();
			}
			public Object caseCtVariableReference(CtVariableReference object) {
				return createCtVariableReferenceAdapter();
			}
			public Object caseCtAbstractInvocation(CtAbstractInvocation object) {
				return createCtAbstractInvocationAdapter();
			}
			public Object caseCtArrayAccess(CtArrayAccess object) {
				return createCtArrayAccessAdapter();
			}
			public Object caseCtAssert(CtAssert object) {
				return createCtAssertAdapter();
			}
			public Object caseCtAssignment(CtAssignment object) {
				return createCtAssignmentAdapter();
			}
			public Object caseCtBinaryOperator(CtBinaryOperator object) {
				return createCtBinaryOperatorAdapter();
			}
			public Object caseCtBlock(CtBlock object) {
				return createCtBlockAdapter();
			}
			public Object caseCtBreak(CtBreak object) {
				return createCtBreakAdapter();
			}
			public Object caseCtCFlowBreak(CtCFlowBreak object) {
				return createCtCFlowBreakAdapter();
			}
			public Object caseCtCase(CtCase object) {
				return createCtCaseAdapter();
			}
			public Object caseCtCatch(CtCatch object) {
				return createCtCatchAdapter();
			}
			public Object caseCtCodeElement(CtCodeElement object) {
				return createCtCodeElementAdapter();
			}
			public Object caseCtConditional(CtConditional object) {
				return createCtConditionalAdapter();
			}
			public Object caseCtContinue(CtContinue object) {
				return createCtContinueAdapter();
			}
			public Object caseCtDo(CtDo object) {
				return createCtDoAdapter();
			}
			public Object caseCtExpression(CtExpression object) {
				return createCtExpressionAdapter();
			}
			public Object caseCtFieldAccess(CtFieldAccess object) {
				return createCtFieldAccessAdapter();
			}
			public Object caseCtFor(CtFor object) {
				return createCtForAdapter();
			}
			public Object caseCtForEach(CtForEach object) {
				return createCtForEachAdapter();
			}
			public Object caseCtIf(CtIf object) {
				return createCtIfAdapter();
			}
			public Object caseCtInvocation(CtInvocation object) {
				return createCtInvocationAdapter();
			}
			public Object caseCtLiteral(CtLiteral object) {
				return createCtLiteralAdapter();
			}
			public Object caseCtLocalVariable(CtLocalVariable object) {
				return createCtLocalVariableAdapter();
			}
			public Object caseCtLoop(CtLoop object) {
				return createCtLoopAdapter();
			}
			public Object caseCtNewArray(CtNewArray object) {
				return createCtNewArrayAdapter();
			}
			public Object caseCtNewClass(CtNewClass object) {
				return createCtNewClassAdapter();
			}
			public Object caseCtOperatorAssignment(CtOperatorAssignment object) {
				return createCtOperatorAssignmentAdapter();
			}
			public Object caseCtReturn(CtReturn object) {
				return createCtReturnAdapter();
			}
			public Object caseCtStatement(CtStatement object) {
				return createCtStatementAdapter();
			}
			public Object caseCtStatementList(CtStatementList object) {
				return createCtStatementListAdapter();
			}
			public Object caseCtSwitch(CtSwitch object) {
				return createCtSwitchAdapter();
			}
			public Object caseCtSynchronized(CtSynchronized object) {
				return createCtSynchronizedAdapter();
			}
			public Object caseCtTargetedExpression(CtTargetedExpression object) {
				return createCtTargetedExpressionAdapter();
			}
			public Object caseCtThrow(CtThrow object) {
				return createCtThrowAdapter();
			}
			public Object caseCtTry(CtTry object) {
				return createCtTryAdapter();
			}
			public Object caseCtUnaryOperator(CtUnaryOperator object) {
				return createCtUnaryOperatorAdapter();
			}
			public Object caseCtVariableAccess(CtVariableAccess object) {
				return createCtVariableAccessAdapter();
			}
			public Object caseCtWhile(CtWhile object) {
				return createCtWhileAdapter();
			}
			public Object caseCtAnnotation(CtAnnotation object) {
				return createCtAnnotationAdapter();
			}
			public Object caseCtAnnotationType(CtAnnotationType object) {
				return createCtAnnotationTypeAdapter();
			}
			public Object caseCtAnonymousExecutable(CtAnonymousExecutable object) {
				return createCtAnonymousExecutableAdapter();
			}
			public Object caseCtClass(CtClass object) {
				return createCtClassAdapter();
			}
			public Object caseCtConstructor(CtConstructor object) {
				return createCtConstructorAdapter();
			}
			public Object caseCtElement(CtElement object) {
				return createCtElementAdapter();
			}
			public Object caseCtEnum(CtEnum object) {
				return createCtEnumAdapter();
			}
			public Object caseCtExecutable(CtExecutable object) {
				return createCtExecutableAdapter();
			}
			public Object caseCtField(CtField object) {
				return createCtFieldAdapter();
			}
			public Object caseCtGenericElement(CtGenericElement object) {
				return createCtGenericElementAdapter();
			}
			public Object caseCtInterface(CtInterface object) {
				return createCtInterfaceAdapter();
			}
			public Object caseCtMethod(CtMethod object) {
				return createCtMethodAdapter();
			}
			public Object caseCtModifiable(CtModifiable object) {
				return createCtModifiableAdapter();
			}
			public Object caseCtNamedElement(CtNamedElement object) {
				return createCtNamedElementAdapter();
			}
			public Object caseCtPackage(CtPackage object) {
				return createCtPackageAdapter();
			}
			public Object caseCtParameter(CtParameter object) {
				return createCtParameterAdapter();
			}
			public Object caseCtSimpleType(CtSimpleType object) {
				return createCtSimpleTypeAdapter();
			}
			public Object caseCtType(CtType object) {
				return createCtTypeAdapter();
			}
			public Object caseCtTypeParameter(CtTypeParameter object) {
				return createCtTypeParameterAdapter();
			}
			public Object caseCtTypedElement(CtTypedElement object) {
				return createCtTypedElementAdapter();
			}
			public Object caseCtVariable(CtVariable object) {
				return createCtVariableAdapter();
			}
			public Object caseSourcePosition(SourcePosition object) {
				return createSourcePositionAdapter();
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
	 * Creates a new adapter for an object of class '{@link spoon.reflect.reference.CtArrayTypeReference <em>Ct Array Type Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spoon.reflect.reference.CtArrayTypeReference
	 * @generated
	 */
	public Adapter createCtArrayTypeReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spoon.reflect.reference.CtExecutableReference <em>Ct Executable Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spoon.reflect.reference.CtExecutableReference
	 * @generated
	 */
	public Adapter createCtExecutableReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spoon.reflect.reference.CtFieldReference <em>Ct Field Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spoon.reflect.reference.CtFieldReference
	 * @generated
	 */
	public Adapter createCtFieldReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spoon.reflect.reference.CtGenericElementReference <em>Ct Generic Element Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spoon.reflect.reference.CtGenericElementReference
	 * @generated
	 */
	public Adapter createCtGenericElementReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spoon.reflect.reference.CtLocalVariableReference <em>Ct Local Variable Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spoon.reflect.reference.CtLocalVariableReference
	 * @generated
	 */
	public Adapter createCtLocalVariableReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spoon.reflect.reference.CtPackageReference <em>Ct Package Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spoon.reflect.reference.CtPackageReference
	 * @generated
	 */
	public Adapter createCtPackageReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spoon.reflect.reference.CtParameterReference <em>Ct Parameter Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spoon.reflect.reference.CtParameterReference
	 * @generated
	 */
	public Adapter createCtParameterReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spoon.reflect.reference.CtReference <em>Ct Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spoon.reflect.reference.CtReference
	 * @generated
	 */
	public Adapter createCtReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spoon.reflect.reference.CtTypeParameterReference <em>Ct Type Parameter Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spoon.reflect.reference.CtTypeParameterReference
	 * @generated
	 */
	public Adapter createCtTypeParameterReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spoon.reflect.reference.CtTypeReference <em>Ct Type Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spoon.reflect.reference.CtTypeReference
	 * @generated
	 */
	public Adapter createCtTypeReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spoon.reflect.reference.CtVariableReference <em>Ct Variable Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spoon.reflect.reference.CtVariableReference
	 * @generated
	 */
	public Adapter createCtVariableReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spoon.reflect.code.CtAbstractInvocation <em>Ct Abstract Invocation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spoon.reflect.code.CtAbstractInvocation
	 * @generated
	 */
	public Adapter createCtAbstractInvocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spoon.reflect.code.CtArrayAccess <em>Ct Array Access</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spoon.reflect.code.CtArrayAccess
	 * @generated
	 */
	public Adapter createCtArrayAccessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spoon.reflect.code.CtAssert <em>Ct Assert</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spoon.reflect.code.CtAssert
	 * @generated
	 */
	public Adapter createCtAssertAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spoon.reflect.code.CtAssignment <em>Ct Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spoon.reflect.code.CtAssignment
	 * @generated
	 */
	public Adapter createCtAssignmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spoon.reflect.code.CtBinaryOperator <em>Ct Binary Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spoon.reflect.code.CtBinaryOperator
	 * @generated
	 */
	public Adapter createCtBinaryOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spoon.reflect.code.CtBlock <em>Ct Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spoon.reflect.code.CtBlock
	 * @generated
	 */
	public Adapter createCtBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spoon.reflect.code.CtBreak <em>Ct Break</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spoon.reflect.code.CtBreak
	 * @generated
	 */
	public Adapter createCtBreakAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spoon.reflect.code.CtCFlowBreak <em>Ct CFlow Break</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spoon.reflect.code.CtCFlowBreak
	 * @generated
	 */
	public Adapter createCtCFlowBreakAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spoon.reflect.code.CtCase <em>Ct Case</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spoon.reflect.code.CtCase
	 * @generated
	 */
	public Adapter createCtCaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spoon.reflect.code.CtCatch <em>Ct Catch</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spoon.reflect.code.CtCatch
	 * @generated
	 */
	public Adapter createCtCatchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spoon.reflect.code.CtCodeElement <em>Ct Code Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spoon.reflect.code.CtCodeElement
	 * @generated
	 */
	public Adapter createCtCodeElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spoon.reflect.code.CtConditional <em>Ct Conditional</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spoon.reflect.code.CtConditional
	 * @generated
	 */
	public Adapter createCtConditionalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spoon.reflect.code.CtContinue <em>Ct Continue</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spoon.reflect.code.CtContinue
	 * @generated
	 */
	public Adapter createCtContinueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spoon.reflect.code.CtDo <em>Ct Do</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spoon.reflect.code.CtDo
	 * @generated
	 */
	public Adapter createCtDoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spoon.reflect.code.CtExpression <em>Ct Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spoon.reflect.code.CtExpression
	 * @generated
	 */
	public Adapter createCtExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spoon.reflect.code.CtFieldAccess <em>Ct Field Access</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spoon.reflect.code.CtFieldAccess
	 * @generated
	 */
	public Adapter createCtFieldAccessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spoon.reflect.code.CtFor <em>Ct For</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spoon.reflect.code.CtFor
	 * @generated
	 */
	public Adapter createCtForAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spoon.reflect.code.CtForEach <em>Ct For Each</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spoon.reflect.code.CtForEach
	 * @generated
	 */
	public Adapter createCtForEachAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spoon.reflect.code.CtIf <em>Ct If</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spoon.reflect.code.CtIf
	 * @generated
	 */
	public Adapter createCtIfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spoon.reflect.code.CtInvocation <em>Ct Invocation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spoon.reflect.code.CtInvocation
	 * @generated
	 */
	public Adapter createCtInvocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spoon.reflect.code.CtLiteral <em>Ct Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spoon.reflect.code.CtLiteral
	 * @generated
	 */
	public Adapter createCtLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spoon.reflect.code.CtLocalVariable <em>Ct Local Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spoon.reflect.code.CtLocalVariable
	 * @generated
	 */
	public Adapter createCtLocalVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spoon.reflect.code.CtLoop <em>Ct Loop</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spoon.reflect.code.CtLoop
	 * @generated
	 */
	public Adapter createCtLoopAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spoon.reflect.code.CtNewArray <em>Ct New Array</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spoon.reflect.code.CtNewArray
	 * @generated
	 */
	public Adapter createCtNewArrayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spoon.reflect.code.CtNewClass <em>Ct New Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spoon.reflect.code.CtNewClass
	 * @generated
	 */
	public Adapter createCtNewClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spoon.reflect.code.CtOperatorAssignment <em>Ct Operator Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spoon.reflect.code.CtOperatorAssignment
	 * @generated
	 */
	public Adapter createCtOperatorAssignmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spoon.reflect.code.CtReturn <em>Ct Return</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spoon.reflect.code.CtReturn
	 * @generated
	 */
	public Adapter createCtReturnAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spoon.reflect.code.CtStatement <em>Ct Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spoon.reflect.code.CtStatement
	 * @generated
	 */
	public Adapter createCtStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spoon.reflect.code.CtStatementList <em>Ct Statement List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spoon.reflect.code.CtStatementList
	 * @generated
	 */
	public Adapter createCtStatementListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spoon.reflect.code.CtSwitch <em>Ct Switch</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spoon.reflect.code.CtSwitch
	 * @generated
	 */
	public Adapter createCtSwitchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spoon.reflect.code.CtSynchronized <em>Ct Synchronized</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spoon.reflect.code.CtSynchronized
	 * @generated
	 */
	public Adapter createCtSynchronizedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spoon.reflect.code.CtTargetedExpression <em>Ct Targeted Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spoon.reflect.code.CtTargetedExpression
	 * @generated
	 */
	public Adapter createCtTargetedExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spoon.reflect.code.CtThrow <em>Ct Throw</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spoon.reflect.code.CtThrow
	 * @generated
	 */
	public Adapter createCtThrowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spoon.reflect.code.CtTry <em>Ct Try</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spoon.reflect.code.CtTry
	 * @generated
	 */
	public Adapter createCtTryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spoon.reflect.code.CtUnaryOperator <em>Ct Unary Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spoon.reflect.code.CtUnaryOperator
	 * @generated
	 */
	public Adapter createCtUnaryOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spoon.reflect.code.CtVariableAccess <em>Ct Variable Access</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spoon.reflect.code.CtVariableAccess
	 * @generated
	 */
	public Adapter createCtVariableAccessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spoon.reflect.code.CtWhile <em>Ct While</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spoon.reflect.code.CtWhile
	 * @generated
	 */
	public Adapter createCtWhileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spoon.reflect.declaration.CtAnnotation <em>Ct Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spoon.reflect.declaration.CtAnnotation
	 * @generated
	 */
	public Adapter createCtAnnotationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spoon.reflect.declaration.CtAnnotationType <em>Ct Annotation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spoon.reflect.declaration.CtAnnotationType
	 * @generated
	 */
	public Adapter createCtAnnotationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spoon.reflect.declaration.CtAnonymousExecutable <em>Ct Anonymous Executable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spoon.reflect.declaration.CtAnonymousExecutable
	 * @generated
	 */
	public Adapter createCtAnonymousExecutableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spoon.reflect.declaration.CtClass <em>Ct Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spoon.reflect.declaration.CtClass
	 * @generated
	 */
	public Adapter createCtClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spoon.reflect.declaration.CtConstructor <em>Ct Constructor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spoon.reflect.declaration.CtConstructor
	 * @generated
	 */
	public Adapter createCtConstructorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spoon.reflect.declaration.CtElement <em>Ct Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spoon.reflect.declaration.CtElement
	 * @generated
	 */
	public Adapter createCtElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spoon.reflect.declaration.CtEnum <em>Ct Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spoon.reflect.declaration.CtEnum
	 * @generated
	 */
	public Adapter createCtEnumAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spoon.reflect.declaration.CtExecutable <em>Ct Executable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spoon.reflect.declaration.CtExecutable
	 * @generated
	 */
	public Adapter createCtExecutableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spoon.reflect.declaration.CtField <em>Ct Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spoon.reflect.declaration.CtField
	 * @generated
	 */
	public Adapter createCtFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spoon.reflect.declaration.CtGenericElement <em>Ct Generic Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spoon.reflect.declaration.CtGenericElement
	 * @generated
	 */
	public Adapter createCtGenericElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spoon.reflect.declaration.CtInterface <em>Ct Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spoon.reflect.declaration.CtInterface
	 * @generated
	 */
	public Adapter createCtInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spoon.reflect.declaration.CtMethod <em>Ct Method</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spoon.reflect.declaration.CtMethod
	 * @generated
	 */
	public Adapter createCtMethodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spoon.reflect.declaration.CtModifiable <em>Ct Modifiable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spoon.reflect.declaration.CtModifiable
	 * @generated
	 */
	public Adapter createCtModifiableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spoon.reflect.declaration.CtNamedElement <em>Ct Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spoon.reflect.declaration.CtNamedElement
	 * @generated
	 */
	public Adapter createCtNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spoon.reflect.declaration.CtPackage <em>Ct Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spoon.reflect.declaration.CtPackage
	 * @generated
	 */
	public Adapter createCtPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spoon.reflect.declaration.CtParameter <em>Ct Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spoon.reflect.declaration.CtParameter
	 * @generated
	 */
	public Adapter createCtParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spoon.reflect.declaration.CtSimpleType <em>Ct Simple Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spoon.reflect.declaration.CtSimpleType
	 * @generated
	 */
	public Adapter createCtSimpleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spoon.reflect.declaration.CtType <em>Ct Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spoon.reflect.declaration.CtType
	 * @generated
	 */
	public Adapter createCtTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spoon.reflect.declaration.CtTypeParameter <em>Ct Type Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spoon.reflect.declaration.CtTypeParameter
	 * @generated
	 */
	public Adapter createCtTypeParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spoon.reflect.declaration.CtTypedElement <em>Ct Typed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spoon.reflect.declaration.CtTypedElement
	 * @generated
	 */
	public Adapter createCtTypedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spoon.reflect.declaration.CtVariable <em>Ct Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spoon.reflect.declaration.CtVariable
	 * @generated
	 */
	public Adapter createCtVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spoon.reflect.declaration.SourcePosition <em>Source Position</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spoon.reflect.declaration.SourcePosition
	 * @generated
	 */
	public Adapter createSourcePositionAdapter() {
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

} //FacadeAdapterFactory
