/**
 * <copyright>
 * </copyright>
 *
 * $Id: Concern.java,v 1.2 2008-03-05 07:58:39 ftanguy Exp $
 */
package org.kermeta.model.interest;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.kermeta.interest.InterestedObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Concern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A concern object holds two things :
 * - the id of a resource
 * - a list of worried objects that must be warned as soon as the resource has changed
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.model.interest.Concern#getId <em>Id</em>}</li>
 *   <li>{@link org.kermeta.model.interest.Concern#getListeners <em>Listeners</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.model.interest.InterestPackage#getConcern()
 * @model
 * @generated
 */
public interface Concern extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.kermeta.model.interest.InterestPackage#getConcern_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.kermeta.model.interest.Concern#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Listeners</b></em>' containment reference list.
	 * The list contents are of type {@link org.kermeta.model.interest.WorriedObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Listeners</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Listeners</em>' containment reference list.
	 * @see org.kermeta.model.interest.InterestPackage#getConcern_Listeners()
	 * @model containment="true"
	 * @generated
	 */
	EList<WorriedObject> getListeners();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void updateValue(Object value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetDataType="org.kermeta.model.interest.InterestedObject"
	 * @generated
	 */
	void beConcernedAbout(InterestedObject target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetDataType="org.kermeta.model.interest.InterestedObject"
	 * @generated
	 */
	void beUnconcernedAbout(InterestedObject target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	WorriedObject getWorriedObject(Object target);

} // Concern
