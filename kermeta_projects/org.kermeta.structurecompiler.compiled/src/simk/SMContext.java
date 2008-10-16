/**
 * <copyright>
 * </copyright>
 *
 * $Id: SMContext.java,v 1.5 2008-10-16 13:18:17 cfaucher Exp $
 */
package simk;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SM Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link simk.SMContext#getSMClass <em>SM Class</em>}</li>
 *   <li>{@link simk.SMContext#getSMMethods <em>SM Methods</em>}</li>
 *   <li>{@link simk.SMContext#getFinalPackageQName <em>Final Package QName</em>}</li>
 * </ul>
 * </p>
 *
 * @see simk.SimkPackage#getSMContext()
 * @model
 * @generated
 */
public interface SMContext extends kermeta.language.structure.Object {
	/**
	 * Returns the value of the '<em><b>SM Class</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link simk.SMClass#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SM Class</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SM Class</em>' containment reference.
	 * @see #setSMClass(SMClass)
	 * @see simk.SimkPackage#getSMContext_SMClass()
	 * @see simk.SMClass#getContext
	 * @model opposite="context" containment="true" resolveProxies="true"
	 * @generated
	 */
	SMClass getSMClass();

	/**
	 * Sets the value of the '{@link simk.SMContext#getSMClass <em>SM Class</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SM Class</em>' containment reference.
	 * @see #getSMClass()
	 * @generated
	 */
	void setSMClass(SMClass value);

	/**
	 * Returns the value of the '<em><b>SM Methods</b></em>' reference list.
	 * The list contents are of type {@link simk.SMMethod}.
	 * It is bidirectional and its opposite is '{@link simk.SMMethod#getSMContext <em>SM Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SM Methods</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SM Methods</em>' reference list.
	 * @see simk.SimkPackage#getSMContext_SMMethods()
	 * @see simk.SMMethod#getSMContext
	 * @model opposite="sMContext"
	 * @generated
	 */
	EList<SMMethod> getSMMethods();

	/**
	 * Returns the value of the '<em><b>Final Package QName</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Final Package QName</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Final Package QName</em>' attribute.
	 * @see #setFinalPackageQName(String)
	 * @see simk.SimkPackage#getSMContext_FinalPackageQName()
	 * @model dataType="ecore.EString"
	 * @generated
	 */
	String getFinalPackageQName();

	/**
	 * Sets the value of the '{@link simk.SMContext#getFinalPackageQName <em>Final Package QName</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Final Package QName</em>' attribute.
	 * @see #getFinalPackageQName()
	 * @generated
	 */
	void setFinalPackageQName(String value);

} // SMContext
