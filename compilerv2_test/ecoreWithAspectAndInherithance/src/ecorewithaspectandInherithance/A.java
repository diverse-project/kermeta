/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ecorewithaspectandInherithance;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>A</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ecorewithaspectandInherithance.A#getFoo <em>Foo</em>}</li>
 * </ul>
 * </p>
 *
 * @see ecorewithaspectandInherithance.EcorewithaspectandInherithancePackage#getA()
 * @model
 * @generated
 */
public interface A extends EObject {
	/**
	 * Returns the value of the '<em><b>Foo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Foo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Foo</em>' attribute.
	 * @see #setFoo(String)
	 * @see ecorewithaspectandInherithance.EcorewithaspectandInherithancePackage#getA_Foo()
	 * @model
	 * @generated
	 */
	String getFoo();

	/**
	 * Sets the value of the '{@link ecorewithaspectandInherithance.A#getFoo <em>Foo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Foo</em>' attribute.
	 * @see #getFoo()
	 * @generated
	 */
	void setFoo(String value);

} // A
