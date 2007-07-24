/**
 * <copyright>
 * </copyright>
 *
 * $Id: InterestAdapterFactory.java,v 1.2 2007-07-24 13:47:11 ftanguy Exp $
 */
package fr.irisa.triskell.kermeta.kpm.interest.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

import fr.irisa.triskell.kermeta.kpm.interest.InterestEntry;
import fr.irisa.triskell.kermeta.kpm.interest.InterestHost;
import fr.irisa.triskell.kermeta.kpm.interest.InterestKey;
import fr.irisa.triskell.kermeta.kpm.interest.InterestPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see fr.irisa.triskell.kermeta.kpm.interest.InterestPackage
 * @generated
 */
public class InterestAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static InterestPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterestAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = InterestPackage.eINSTANCE;
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
	@Override
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
	protected InterestSwitch<Adapter> modelSwitch =
		new InterestSwitch<Adapter>() {
			@Override
			public Adapter caseInterestKey(InterestKey object) {
				return createInterestKeyAdapter();
			}
			@Override
			public Adapter caseInterestEntry(InterestEntry object) {
				return createInterestEntryAdapter();
			}
			@Override
			public Adapter caseInterestHost(InterestHost object) {
				return createInterestHostAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
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
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link fr.irisa.triskell.kermeta.kpm.interest.InterestKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.irisa.triskell.kermeta.kpm.interest.InterestKey
	 * @generated
	 */
	public Adapter createInterestKeyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.irisa.triskell.kermeta.kpm.interest.InterestEntry <em>Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.irisa.triskell.kermeta.kpm.interest.InterestEntry
	 * @generated
	 */
	public Adapter createInterestEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.irisa.triskell.kermeta.kpm.interest.InterestHost <em>Host</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.irisa.triskell.kermeta.kpm.interest.InterestHost
	 * @generated
	 */
	public Adapter createInterestHostAdapter() {
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

} //InterestAdapterFactory
