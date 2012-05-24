/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.tm.elibel.smartqvt.qvt.imperativeocl.util;

import fr.tm.elibel.smartqvt.qvt.emof.DataType;
import fr.tm.elibel.smartqvt.qvt.emof.Element;
import fr.tm.elibel.smartqvt.qvt.emof.NamedElement;
import fr.tm.elibel.smartqvt.qvt.emof.Type;
import fr.tm.elibel.smartqvt.qvt.emof.TypedElement;

import fr.tm.elibel.smartqvt.qvt.essentialocl.CallExp;
import fr.tm.elibel.smartqvt.qvt.essentialocl.CollectionType;
import fr.tm.elibel.smartqvt.qvt.essentialocl.FeatureCallExp;
import fr.tm.elibel.smartqvt.qvt.essentialocl.LiteralExp;
import fr.tm.elibel.smartqvt.qvt.essentialocl.LoopExp;
import fr.tm.elibel.smartqvt.qvt.essentialocl.OclExpression;
import fr.tm.elibel.smartqvt.qvt.essentialocl.OperationCallExp;

import fr.tm.elibel.smartqvt.qvt.imperativeocl.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see fr.tm.elibel.smartqvt.qvt.imperativeocl.ImperativeoclPackage
 * @generated
 */
public class ImperativeoclAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ImperativeoclPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImperativeoclAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ImperativeoclPackage.eINSTANCE;
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
	protected ImperativeoclSwitch modelSwitch =
		new ImperativeoclSwitch() {
			public Object caseAltExp(AltExp object) {
				return createAltExpAdapter();
			}
			public Object caseAssertExp(AssertExp object) {
				return createAssertExpAdapter();
			}
			public Object caseAssignExp(AssignExp object) {
				return createAssignExpAdapter();
			}
			public Object caseBlockExp(BlockExp object) {
				return createBlockExpAdapter();
			}
			public Object caseBreakExp(BreakExp object) {
				return createBreakExpAdapter();
			}
			public Object caseCatchExp(CatchExp object) {
				return createCatchExpAdapter();
			}
			public Object caseComputeExp(ComputeExp object) {
				return createComputeExpAdapter();
			}
			public Object caseContinueExp(ContinueExp object) {
				return createContinueExpAdapter();
			}
			public Object caseDictLiteralExp(DictLiteralExp object) {
				return createDictLiteralExpAdapter();
			}
			public Object caseDictLiteralPart(DictLiteralPart object) {
				return createDictLiteralPartAdapter();
			}
			public Object caseDictionaryType(DictionaryType object) {
				return createDictionaryTypeAdapter();
			}
			public Object caseForExp(ForExp object) {
				return createForExpAdapter();
			}
			public Object caseImperativeExpression(ImperativeExpression object) {
				return createImperativeExpressionAdapter();
			}
			public Object caseImperativeIterateExp(ImperativeIterateExp object) {
				return createImperativeIterateExpAdapter();
			}
			public Object caseImperativeLoopExp(ImperativeLoopExp object) {
				return createImperativeLoopExpAdapter();
			}
			public Object caseInstantiationExp(InstantiationExp object) {
				return createInstantiationExpAdapter();
			}
			public Object caseListType(ListType object) {
				return createListTypeAdapter();
			}
			public Object caseLogExp(LogExp object) {
				return createLogExpAdapter();
			}
			public Object caseOrderedTupleLiteralExp(OrderedTupleLiteralExp object) {
				return createOrderedTupleLiteralExpAdapter();
			}
			public Object caseOrderedTupleLiteralPart(OrderedTupleLiteralPart object) {
				return createOrderedTupleLiteralPartAdapter();
			}
			public Object caseOrderedTupleType(OrderedTupleType object) {
				return createOrderedTupleTypeAdapter();
			}
			public Object caseRaiseExp(RaiseExp object) {
				return createRaiseExpAdapter();
			}
			public Object caseReturnExp(ReturnExp object) {
				return createReturnExpAdapter();
			}
			public Object caseSwitchExp(SwitchExp object) {
				return createSwitchExpAdapter();
			}
			public Object caseTemplateParameterType(TemplateParameterType object) {
				return createTemplateParameterTypeAdapter();
			}
			public Object caseTryExp(TryExp object) {
				return createTryExpAdapter();
			}
			public Object caseTypedef(Typedef object) {
				return createTypedefAdapter();
			}
			public Object caseUnlinkExp(UnlinkExp object) {
				return createUnlinkExpAdapter();
			}
			public Object caseUnpackExp(UnpackExp object) {
				return createUnpackExpAdapter();
			}
			public Object caseVariableInitExp(VariableInitExp object) {
				return createVariableInitExpAdapter();
			}
			public Object caseWhileExp(WhileExp object) {
				return createWhileExpAdapter();
			}
			public Object caseObject(fr.tm.elibel.smartqvt.qvt.emof.Object object) {
				return createObjectAdapter();
			}
			public Object caseElement(Element object) {
				return createElementAdapter();
			}
			public Object caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
			}
			public Object caseTypedElement(TypedElement object) {
				return createTypedElementAdapter();
			}
			public Object caseOclExpression(OclExpression object) {
				return createOclExpressionAdapter();
			}
			public Object caseLiteralExp(LiteralExp object) {
				return createLiteralExpAdapter();
			}
			public Object caseType(Type object) {
				return createTypeAdapter();
			}
			public Object caseDataType(DataType object) {
				return createDataTypeAdapter();
			}
			public Object caseCollectionType(CollectionType object) {
				return createCollectionTypeAdapter();
			}
			public Object caseCallExp(CallExp object) {
				return createCallExpAdapter();
			}
			public Object caseLoopExp(LoopExp object) {
				return createLoopExpAdapter();
			}
			public Object caseFeatureCallExp(FeatureCallExp object) {
				return createFeatureCallExpAdapter();
			}
			public Object caseOperationCallExp(OperationCallExp object) {
				return createOperationCallExpAdapter();
			}
			public Object caseClass(fr.tm.elibel.smartqvt.qvt.emof.Class object) {
				return createClassAdapter();
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
	 * Creates a new adapter for an object of class '{@link fr.tm.elibel.smartqvt.qvt.imperativeocl.AltExp <em>Alt Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tm.elibel.smartqvt.qvt.imperativeocl.AltExp
	 * @generated
	 */
	public Adapter createAltExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tm.elibel.smartqvt.qvt.imperativeocl.AssertExp <em>Assert Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tm.elibel.smartqvt.qvt.imperativeocl.AssertExp
	 * @generated
	 */
	public Adapter createAssertExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tm.elibel.smartqvt.qvt.imperativeocl.AssignExp <em>Assign Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tm.elibel.smartqvt.qvt.imperativeocl.AssignExp
	 * @generated
	 */
	public Adapter createAssignExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tm.elibel.smartqvt.qvt.imperativeocl.BlockExp <em>Block Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tm.elibel.smartqvt.qvt.imperativeocl.BlockExp
	 * @generated
	 */
	public Adapter createBlockExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tm.elibel.smartqvt.qvt.imperativeocl.BreakExp <em>Break Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tm.elibel.smartqvt.qvt.imperativeocl.BreakExp
	 * @generated
	 */
	public Adapter createBreakExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tm.elibel.smartqvt.qvt.imperativeocl.CatchExp <em>Catch Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tm.elibel.smartqvt.qvt.imperativeocl.CatchExp
	 * @generated
	 */
	public Adapter createCatchExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tm.elibel.smartqvt.qvt.imperativeocl.ComputeExp <em>Compute Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tm.elibel.smartqvt.qvt.imperativeocl.ComputeExp
	 * @generated
	 */
	public Adapter createComputeExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tm.elibel.smartqvt.qvt.imperativeocl.ContinueExp <em>Continue Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tm.elibel.smartqvt.qvt.imperativeocl.ContinueExp
	 * @generated
	 */
	public Adapter createContinueExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tm.elibel.smartqvt.qvt.imperativeocl.DictLiteralExp <em>Dict Literal Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tm.elibel.smartqvt.qvt.imperativeocl.DictLiteralExp
	 * @generated
	 */
	public Adapter createDictLiteralExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tm.elibel.smartqvt.qvt.imperativeocl.DictLiteralPart <em>Dict Literal Part</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tm.elibel.smartqvt.qvt.imperativeocl.DictLiteralPart
	 * @generated
	 */
	public Adapter createDictLiteralPartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tm.elibel.smartqvt.qvt.imperativeocl.DictionaryType <em>Dictionary Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tm.elibel.smartqvt.qvt.imperativeocl.DictionaryType
	 * @generated
	 */
	public Adapter createDictionaryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tm.elibel.smartqvt.qvt.imperativeocl.ForExp <em>For Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tm.elibel.smartqvt.qvt.imperativeocl.ForExp
	 * @generated
	 */
	public Adapter createForExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tm.elibel.smartqvt.qvt.imperativeocl.ImperativeExpression <em>Imperative Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tm.elibel.smartqvt.qvt.imperativeocl.ImperativeExpression
	 * @generated
	 */
	public Adapter createImperativeExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tm.elibel.smartqvt.qvt.imperativeocl.ImperativeIterateExp <em>Imperative Iterate Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tm.elibel.smartqvt.qvt.imperativeocl.ImperativeIterateExp
	 * @generated
	 */
	public Adapter createImperativeIterateExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tm.elibel.smartqvt.qvt.imperativeocl.ImperativeLoopExp <em>Imperative Loop Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tm.elibel.smartqvt.qvt.imperativeocl.ImperativeLoopExp
	 * @generated
	 */
	public Adapter createImperativeLoopExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tm.elibel.smartqvt.qvt.imperativeocl.InstantiationExp <em>Instantiation Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tm.elibel.smartqvt.qvt.imperativeocl.InstantiationExp
	 * @generated
	 */
	public Adapter createInstantiationExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tm.elibel.smartqvt.qvt.imperativeocl.ListType <em>List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tm.elibel.smartqvt.qvt.imperativeocl.ListType
	 * @generated
	 */
	public Adapter createListTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tm.elibel.smartqvt.qvt.imperativeocl.LogExp <em>Log Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tm.elibel.smartqvt.qvt.imperativeocl.LogExp
	 * @generated
	 */
	public Adapter createLogExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tm.elibel.smartqvt.qvt.imperativeocl.OrderedTupleLiteralExp <em>Ordered Tuple Literal Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tm.elibel.smartqvt.qvt.imperativeocl.OrderedTupleLiteralExp
	 * @generated
	 */
	public Adapter createOrderedTupleLiteralExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tm.elibel.smartqvt.qvt.imperativeocl.OrderedTupleLiteralPart <em>Ordered Tuple Literal Part</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tm.elibel.smartqvt.qvt.imperativeocl.OrderedTupleLiteralPart
	 * @generated
	 */
	public Adapter createOrderedTupleLiteralPartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tm.elibel.smartqvt.qvt.imperativeocl.OrderedTupleType <em>Ordered Tuple Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tm.elibel.smartqvt.qvt.imperativeocl.OrderedTupleType
	 * @generated
	 */
	public Adapter createOrderedTupleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tm.elibel.smartqvt.qvt.imperativeocl.RaiseExp <em>Raise Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tm.elibel.smartqvt.qvt.imperativeocl.RaiseExp
	 * @generated
	 */
	public Adapter createRaiseExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tm.elibel.smartqvt.qvt.imperativeocl.ReturnExp <em>Return Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tm.elibel.smartqvt.qvt.imperativeocl.ReturnExp
	 * @generated
	 */
	public Adapter createReturnExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tm.elibel.smartqvt.qvt.imperativeocl.SwitchExp <em>Switch Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tm.elibel.smartqvt.qvt.imperativeocl.SwitchExp
	 * @generated
	 */
	public Adapter createSwitchExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tm.elibel.smartqvt.qvt.imperativeocl.TemplateParameterType <em>Template Parameter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tm.elibel.smartqvt.qvt.imperativeocl.TemplateParameterType
	 * @generated
	 */
	public Adapter createTemplateParameterTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tm.elibel.smartqvt.qvt.imperativeocl.TryExp <em>Try Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tm.elibel.smartqvt.qvt.imperativeocl.TryExp
	 * @generated
	 */
	public Adapter createTryExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tm.elibel.smartqvt.qvt.imperativeocl.Typedef <em>Typedef</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tm.elibel.smartqvt.qvt.imperativeocl.Typedef
	 * @generated
	 */
	public Adapter createTypedefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tm.elibel.smartqvt.qvt.imperativeocl.UnlinkExp <em>Unlink Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tm.elibel.smartqvt.qvt.imperativeocl.UnlinkExp
	 * @generated
	 */
	public Adapter createUnlinkExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tm.elibel.smartqvt.qvt.imperativeocl.UnpackExp <em>Unpack Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tm.elibel.smartqvt.qvt.imperativeocl.UnpackExp
	 * @generated
	 */
	public Adapter createUnpackExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tm.elibel.smartqvt.qvt.imperativeocl.VariableInitExp <em>Variable Init Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tm.elibel.smartqvt.qvt.imperativeocl.VariableInitExp
	 * @generated
	 */
	public Adapter createVariableInitExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tm.elibel.smartqvt.qvt.imperativeocl.WhileExp <em>While Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tm.elibel.smartqvt.qvt.imperativeocl.WhileExp
	 * @generated
	 */
	public Adapter createWhileExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tm.elibel.smartqvt.qvt.emof.Object <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tm.elibel.smartqvt.qvt.emof.Object
	 * @generated
	 */
	public Adapter createObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tm.elibel.smartqvt.qvt.emof.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tm.elibel.smartqvt.qvt.emof.Element
	 * @generated
	 */
	public Adapter createElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tm.elibel.smartqvt.qvt.emof.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tm.elibel.smartqvt.qvt.emof.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tm.elibel.smartqvt.qvt.emof.TypedElement <em>Typed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tm.elibel.smartqvt.qvt.emof.TypedElement
	 * @generated
	 */
	public Adapter createTypedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tm.elibel.smartqvt.qvt.essentialocl.OclExpression <em>Ocl Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tm.elibel.smartqvt.qvt.essentialocl.OclExpression
	 * @generated
	 */
	public Adapter createOclExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tm.elibel.smartqvt.qvt.essentialocl.LiteralExp <em>Literal Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tm.elibel.smartqvt.qvt.essentialocl.LiteralExp
	 * @generated
	 */
	public Adapter createLiteralExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tm.elibel.smartqvt.qvt.emof.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tm.elibel.smartqvt.qvt.emof.Type
	 * @generated
	 */
	public Adapter createTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tm.elibel.smartqvt.qvt.emof.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tm.elibel.smartqvt.qvt.emof.DataType
	 * @generated
	 */
	public Adapter createDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tm.elibel.smartqvt.qvt.essentialocl.CollectionType <em>Collection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tm.elibel.smartqvt.qvt.essentialocl.CollectionType
	 * @generated
	 */
	public Adapter createCollectionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tm.elibel.smartqvt.qvt.essentialocl.CallExp <em>Call Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tm.elibel.smartqvt.qvt.essentialocl.CallExp
	 * @generated
	 */
	public Adapter createCallExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tm.elibel.smartqvt.qvt.essentialocl.LoopExp <em>Loop Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tm.elibel.smartqvt.qvt.essentialocl.LoopExp
	 * @generated
	 */
	public Adapter createLoopExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tm.elibel.smartqvt.qvt.essentialocl.FeatureCallExp <em>Feature Call Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tm.elibel.smartqvt.qvt.essentialocl.FeatureCallExp
	 * @generated
	 */
	public Adapter createFeatureCallExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tm.elibel.smartqvt.qvt.essentialocl.OperationCallExp <em>Operation Call Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tm.elibel.smartqvt.qvt.essentialocl.OperationCallExp
	 * @generated
	 */
	public Adapter createOperationCallExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tm.elibel.smartqvt.qvt.emof.Class <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tm.elibel.smartqvt.qvt.emof.Class
	 * @generated
	 */
	public Adapter createClassAdapter() {
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

} //ImperativeoclAdapterFactory
