/**
 * <copyright>
 * </copyright>
 *
 * $Id: Value.java,v 1.2 2006-11-23 16:06:15 dtouzet Exp $
 */
package sts;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sts.Value#getFeatures <em>Features</em>}</li>
 * </ul>
 * </p>
 *
 * @see sts.StsPackage#getValue()
 * @model abstract="true"
 * @generated
 */
public interface Value extends Rule {
	/**
	 * Returns the value of the '<em><b>Features</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EStructuralFeature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Features</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Features</em>' reference list.
	 * @see sts.StsPackage#getValue_Features()
	 * @model type="org.eclipse.emf.ecore.EStructuralFeature"
	 * @generated
	 */
	EList getFeatures();

} // Value