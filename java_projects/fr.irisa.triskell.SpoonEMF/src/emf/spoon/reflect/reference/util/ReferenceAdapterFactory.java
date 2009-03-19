/**
 * <copyright>
 * </copyright>
 *
 * $Id: ReferenceAdapterFactory.java,v 1.1 2007/02/14 20:38:04 barais Exp $
 */
package emf.spoon.reflect.reference.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

import emf.spoon.reflect.reference.CtArrayTypeReference;
import emf.spoon.reflect.reference.CtExecutableReference;
import emf.spoon.reflect.reference.CtFieldReference;
import emf.spoon.reflect.reference.CtGenericElementReference;
import emf.spoon.reflect.reference.CtLocalVariableReference;
import emf.spoon.reflect.reference.CtPackageReference;
import emf.spoon.reflect.reference.CtParameterReference;
import emf.spoon.reflect.reference.CtReference;
import emf.spoon.reflect.reference.CtTypeParameterReference;
import emf.spoon.reflect.reference.CtTypeReference;
import emf.spoon.reflect.reference.CtVariableReference;
import emf.spoon.reflect.reference.ReferencePackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see emf.spoon.reflect.reference.ReferencePackage
 * @generated
 */
public class ReferenceAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ReferencePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ReferencePackage.eINSTANCE;
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
	protected ReferenceSwitch modelSwitch =
		new ReferenceSwitch() {
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
			public Object caseFacade_CtGenericElementReference(spoon.reflect.reference.CtGenericElementReference object) {
				return createFacade_CtGenericElementReferenceAdapter();
			}
			public Object caseFacade_CtReference(spoon.reflect.reference.CtReference object) {
				return createFacade_CtReferenceAdapter();
			}
			public Object caseFacade_CtTypeReference(spoon.reflect.reference.CtTypeReference object) {
				return createFacade_CtTypeReferenceAdapter();
			}
			public Object caseFacade_CtArrayTypeReference(spoon.reflect.reference.CtArrayTypeReference object) {
				return createFacade_CtArrayTypeReferenceAdapter();
			}
			public Object caseFacade_CtExecutableReference(spoon.reflect.reference.CtExecutableReference object) {
				return createFacade_CtExecutableReferenceAdapter();
			}
			public Object caseFacade_CtVariableReference(spoon.reflect.reference.CtVariableReference object) {
				return createFacade_CtVariableReferenceAdapter();
			}
			public Object caseFacade_CtFieldReference(spoon.reflect.reference.CtFieldReference object) {
				return createFacade_CtFieldReferenceAdapter();
			}
			public Object caseFacade_CtLocalVariableReference(spoon.reflect.reference.CtLocalVariableReference object) {
				return createFacade_CtLocalVariableReferenceAdapter();
			}
			public Object caseFacade_CtPackageReference(spoon.reflect.reference.CtPackageReference object) {
				return createFacade_CtPackageReferenceAdapter();
			}
			public Object caseFacade_CtParameterReference(spoon.reflect.reference.CtParameterReference object) {
				return createFacade_CtParameterReferenceAdapter();
			}
			public Object caseFacade_CtTypeParameterReference(spoon.reflect.reference.CtTypeParameterReference object) {
				return createFacade_CtTypeParameterReferenceAdapter();
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
	 * Creates a new adapter for an object of class '{@link emf.spoon.reflect.reference.CtArrayTypeReference <em>Ct Array Type Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see emf.spoon.reflect.reference.CtArrayTypeReference
	 * @generated
	 */
	public Adapter createCtArrayTypeReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link emf.spoon.reflect.reference.CtExecutableReference <em>Ct Executable Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see emf.spoon.reflect.reference.CtExecutableReference
	 * @generated
	 */
	public Adapter createCtExecutableReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link emf.spoon.reflect.reference.CtFieldReference <em>Ct Field Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see emf.spoon.reflect.reference.CtFieldReference
	 * @generated
	 */
	public Adapter createCtFieldReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link emf.spoon.reflect.reference.CtGenericElementReference <em>Ct Generic Element Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see emf.spoon.reflect.reference.CtGenericElementReference
	 * @generated
	 */
	public Adapter createCtGenericElementReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link emf.spoon.reflect.reference.CtLocalVariableReference <em>Ct Local Variable Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see emf.spoon.reflect.reference.CtLocalVariableReference
	 * @generated
	 */
	public Adapter createCtLocalVariableReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link emf.spoon.reflect.reference.CtPackageReference <em>Ct Package Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see emf.spoon.reflect.reference.CtPackageReference
	 * @generated
	 */
	public Adapter createCtPackageReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link emf.spoon.reflect.reference.CtParameterReference <em>Ct Parameter Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see emf.spoon.reflect.reference.CtParameterReference
	 * @generated
	 */
	public Adapter createCtParameterReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link emf.spoon.reflect.reference.CtReference <em>Ct Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see emf.spoon.reflect.reference.CtReference
	 * @generated
	 */
	public Adapter createCtReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link emf.spoon.reflect.reference.CtTypeParameterReference <em>Ct Type Parameter Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see emf.spoon.reflect.reference.CtTypeParameterReference
	 * @generated
	 */
	public Adapter createCtTypeParameterReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link emf.spoon.reflect.reference.CtTypeReference <em>Ct Type Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see emf.spoon.reflect.reference.CtTypeReference
	 * @generated
	 */
	public Adapter createCtTypeReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link emf.spoon.reflect.reference.CtVariableReference <em>Ct Variable Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see emf.spoon.reflect.reference.CtVariableReference
	 * @generated
	 */
	public Adapter createCtVariableReferenceAdapter() {
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
	public Adapter createFacade_CtGenericElementReferenceAdapter() {
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
	public Adapter createFacade_CtReferenceAdapter() {
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
	public Adapter createFacade_CtTypeReferenceAdapter() {
		return null;
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
	public Adapter createFacade_CtArrayTypeReferenceAdapter() {
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
	public Adapter createFacade_CtExecutableReferenceAdapter() {
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
	public Adapter createFacade_CtVariableReferenceAdapter() {
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
	public Adapter createFacade_CtFieldReferenceAdapter() {
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
	public Adapter createFacade_CtLocalVariableReferenceAdapter() {
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
	public Adapter createFacade_CtPackageReferenceAdapter() {
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
	public Adapter createFacade_CtParameterReferenceAdapter() {
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
	public Adapter createFacade_CtTypeParameterReferenceAdapter() {
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

} //ReferenceAdapterFactory
