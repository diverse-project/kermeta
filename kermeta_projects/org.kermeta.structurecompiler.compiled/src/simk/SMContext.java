/**
 * <copyright>
 * </copyright>
 *
 * $Id: SMContext.java,v 1.2 2008-09-11 12:35:01 cfaucher Exp $
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
 *   <li>{@link simk.SMContext#getQualifiedNameFinalPackage <em>Qualified Name Final Package</em>}</li>
 *   <li>{@link simk.SMContext#getSMClass <em>SM Class</em>}</li>
 *   <li>{@link simk.SMContext#getStaticMethods <em>Static Methods</em>}</li>
 * </ul>
 * </p>
 *
 * @see simk.SimkPackage#getSMContext()
 * @model
 * @generated
 */
public interface SMContext extends kermeta.language.structure.Object {
	/**
	 * Returns the value of the '<em><b>Qualified Name Final Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qualified Name Final Package</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualified Name Final Package</em>' attribute.
	 * @see #setQualifiedNameFinalPackage(String)
	 * @see simk.SimkPackage#getSMContext_QualifiedNameFinalPackage()
	 * @model dataType="ecore.EString"
	 * @generated
	 */
	String getQualifiedNameFinalPackage();

	/**
	 * Sets the value of the '{@link simk.SMContext#getQualifiedNameFinalPackage <em>Qualified Name Final Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qualified Name Final Package</em>' attribute.
	 * @see #getQualifiedNameFinalPackage()
	 * @generated
	 */
	void setQualifiedNameFinalPackage(String value);

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
	 * Returns the value of the '<em><b>Static Methods</b></em>' reference list.
	 * The list contents are of type {@link simk.StaticMethod}.
	 * It is bidirectional and its opposite is '{@link simk.StaticMethod#getSMContext <em>SM Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Static Methods</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Static Methods</em>' reference list.
	 * @see simk.SimkPackage#getSMContext_StaticMethods()
	 * @see simk.StaticMethod#getSMContext
	 * @model opposite="sMContext"
	 * @generated
	 */
	EList<StaticMethod> getStaticMethods();

} // SMContext
