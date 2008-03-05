/**
 * <copyright>
 * </copyright>
 *
 * $Id: InterestHost.java,v 1.2 2008-03-05 07:58:39 ftanguy Exp $
 */
package org.kermeta.model.interest;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.kermeta.interest.InterestedObject;
import org.kermeta.interest.exception.IdNotFoundException;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Host</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The interest host is an holder for concerns. So some specific hosts can be created for specifics resources. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.model.interest.InterestHost#getConcerns <em>Concerns</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.model.interest.InterestPackage#getInterestHost()
 * @model
 * @generated
 */
public interface InterestHost extends EObject {
	/**
	 * Returns the value of the '<em><b>Concerns</b></em>' containment reference list.
	 * The list contents are of type {@link org.kermeta.model.interest.Concern}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concerns</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concerns</em>' containment reference list.
	 * @see org.kermeta.model.interest.InterestPackage#getInterestHost_Concerns()
	 * @model containment="true"
	 * @generated
	 */
	EList<Concern> getConcerns();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.kermeta.model.interest.IdNotFoundException"
	 * @generated
	 */
	void updateValue(String id, Object value) throws IdNotFoundException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetDataType="org.kermeta.model.interest.InterestedObject"
	 * @generated
	 */
	void beConcernedAbout(String id, InterestedObject target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetDataType="org.kermeta.model.interest.InterestedObject"
	 * @generated
	 */
	void beUnconcernedAbout(String id, InterestedObject target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Concern getConcern(String id);

} // InterestHost
