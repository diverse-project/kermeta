/**
 * <copyright>
 * </copyright>
 *
 * $Id: CustomCond.java,v 1.1 2006-09-26 15:28:31 dtouzet Exp $
 */
package sts;

import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Custom Cond</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sts.CustomCond#getFeature <em>Feature</em>}</li>
 * </ul>
 * </p>
 *
 * @see sts.StsPackage#getCustomCond()
 * @model
 * @generated
 */
public interface CustomCond extends Condition {
	/**
	 * Returns the value of the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature</em>' reference.
	 * @see #setFeature(EStructuralFeature)
	 * @see sts.StsPackage#getCustomCond_Feature()
	 * @model required="true"
	 * @generated
	 */
	EStructuralFeature getFeature();

	/**
	 * Sets the value of the '{@link sts.CustomCond#getFeature <em>Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature</em>' reference.
	 * @see #getFeature()
	 * @generated
	 */
	void setFeature(EStructuralFeature value);

} // CustomCond