/**
 * <copyright>
 * </copyright>
 *
 * $Id: Compare.java,v 1.1 2008-10-13 20:03:35 fmunoz Exp $
 */
package ocompare;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compare</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ocompare.Compare#getToCompare <em>To Compare</em>}</li>
 * </ul>
 * </p>
 *
 * @see ocompare.OcomparePackage#getCompare()
 * @model
 * @generated
 */
public interface Compare extends EObject {
	/**
	 * Returns the value of the '<em><b>To Compare</b></em>' containment reference list.
	 * The list contents are of type {@link ocompare.CompareElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Compare</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Compare</em>' containment reference list.
	 * @see ocompare.OcomparePackage#getCompare_ToCompare()
	 * @model containment="true"
	 * @generated
	 */
	EList<CompareElement> getToCompare();

} // Compare
