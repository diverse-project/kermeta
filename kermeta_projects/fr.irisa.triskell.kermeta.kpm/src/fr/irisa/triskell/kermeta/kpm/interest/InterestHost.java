/**
 * <copyright>
 * </copyright>
 *
 * $Id: InterestHost.java,v 1.1 2007-04-04 13:43:56 ftanguy Exp $
 */
package fr.irisa.triskell.kermeta.kpm.interest;

import fr.irisa.triskell.kermeta.extension.Interest;

import fr.irisa.triskell.kermeta.kpm.Unit;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Host</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.irisa.triskell.kermeta.kpm.interest.InterestHost#getEntries <em>Entries</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.irisa.triskell.kermeta.kpm.interest.InterestPackage#getInterestHost()
 * @model
 * @generated
 */
public interface InterestHost extends EObject {
	/**
	 * Returns the value of the '<em><b>Entries</b></em>' containment reference list.
	 * The list contents are of type {@link fr.irisa.triskell.kermeta.kpm.interest.InterestEntry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entries</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entries</em>' containment reference list.
	 * @see fr.irisa.triskell.kermeta.kpm.interest.InterestPackage#getInterestHost_Entries()
	 * @model type="fr.irisa.triskell.kermeta.kpm.interest.InterestEntry" containment="true"
	 * @generated
	 */
	EList getEntries();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model declaringObjectDataType="fr.irisa.triskell.kermeta.kpm.interest.Interest"
	 * @generated
	 */
	void declareInterest(Interest declaringObject, Unit key);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model declaringObjectDataType="fr.irisa.triskell.kermeta.kpm.interest.Interest"
	 * @generated
	 */
	void declareInterest(Interest declaringObject, Unit key, Object value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model declaringObjectDataType="fr.irisa.triskell.kermeta.kpm.interest.Interest"
	 * @generated
	 */
	InterestEntry findInterestEntry(Unit key, Interest declaringObject);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void update(Unit key, Object newValue);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model declaringObjectDataType="fr.irisa.triskell.kermeta.kpm.interest.Interest"
	 * @generated
	 */
	void undeclareInterest(Interest declaringObject, Unit key);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Object getValue(Unit key);

} // InterestHost