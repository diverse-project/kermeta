/**
 * <copyright>
 * </copyright>
 *
 * $Id: ObjectReference.java,v 1.2 2006-11-23 16:06:15 dtouzet Exp $
 */
package sts;

import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sts.ObjectReference#getIdentifier <em>Identifier</em>}</li>
 * </ul>
 * </p>
 *
 * @see sts.StsPackage#getObjectReference()
 * @model
 * @generated
 */
public interface ObjectReference extends Value {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identifier</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifier</em>' reference.
	 * @see #setIdentifier(EStructuralFeature)
	 * @see sts.StsPackage#getObjectReference_Identifier()
	 * @model required="true"
	 * @generated
	 */
	EStructuralFeature getIdentifier();

	/**
	 * Sets the value of the '{@link sts.ObjectReference#getIdentifier <em>Identifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' reference.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(EStructuralFeature value);

} // ObjectReference