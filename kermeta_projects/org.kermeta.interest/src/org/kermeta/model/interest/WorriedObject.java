/**
 * <copyright>
 * </copyright>
 *
 * $Id: WorriedObject.java,v 1.2 2008-03-05 07:58:39 ftanguy Exp $
 */
package org.kermeta.model.interest;

import org.eclipse.emf.ecore.EObject;
import org.kermeta.interest.InterestedObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Worried Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A worried object holds an object that is concerned for a resource.
 * When the resource changes, the worried object is asked to update the value of the targeted object.
 * The targeted object must implement an interface so that any kind of classes can be used through the interest mechanism. 
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.model.interest.WorriedObject#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.model.interest.InterestPackage#getWorriedObject()
 * @model
 * @generated
 */
public interface WorriedObject extends EObject {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' attribute.
	 * @see #setTarget(InterestedObject)
	 * @see org.kermeta.model.interest.InterestPackage#getWorriedObject_Target()
	 * @model dataType="org.kermeta.model.interest.InterestedObject" required="true"
	 * @generated
	 */
	InterestedObject getTarget();

	/**
	 * Sets the value of the '{@link org.kermeta.model.interest.WorriedObject#getTarget <em>Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' attribute.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(InterestedObject value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void updateValue(Object value);

} // WorriedObject
