/**
 * <copyright>
 * </copyright>
 *
 * $Id: SMMethod.java,v 1.1 2008-10-08 14:37:58 cfaucher Exp $
 */
package simk;

import ecore.EAttribute;
import ecore.EOperation;
import ecore.EReference;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SM Method</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link simk.SMMethod#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link simk.SMMethod#getBody <em>Body</em>}</li>
 *   <li>{@link simk.SMMethod#getParentEReference <em>Parent EReference</em>}</li>
 *   <li>{@link simk.SMMethod#isStatic <em>Static</em>}</li>
 *   <li>{@link simk.SMMethod#getTypeParameters <em>Type Parameters</em>}</li>
 *   <li>{@link simk.SMMethod#getParentEOperation <em>Parent EOperation</em>}</li>
 *   <li>{@link simk.SMMethod#getParentEAttribute <em>Parent EAttribute</em>}</li>
 *   <li>{@link simk.SMMethod#getSMParameters <em>SM Parameters</em>}</li>
 *   <li>{@link simk.SMMethod#getSMReturn <em>SM Return</em>}</li>
 *   <li>{@link simk.SMMethod#getUsages <em>Usages</em>}</li>
 *   <li>{@link simk.SMMethod#getSMContext <em>SM Context</em>}</li>
 *   <li>{@link simk.SMMethod#getAccess <em>Access</em>}</li>
 * </ul>
 * </p>
 *
 * @see simk.SimkPackage#getSMMethod()
 * @model
 * @generated
 */
public interface SMMethod extends SMNamedElement {
	/**
	 * Returns the value of the '<em><b>Abstract</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract</em>' attribute.
	 * @see #setAbstract(boolean)
	 * @see simk.SimkPackage#getSMMethod_Abstract()
	 * @model default="false" dataType="ecore.EBoolean"
	 * @generated
	 */
	boolean isAbstract();

	/**
	 * Sets the value of the '{@link simk.SMMethod#isAbstract <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abstract</em>' attribute.
	 * @see #isAbstract()
	 * @generated
	 */
	void setAbstract(boolean value);

	/**
	 * Returns the value of the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' attribute.
	 * @see #setBody(String)
	 * @see simk.SimkPackage#getSMMethod_Body()
	 * @model dataType="ecore.EString"
	 * @generated
	 */
	String getBody();

	/**
	 * Sets the value of the '{@link simk.SMMethod#getBody <em>Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' attribute.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(String value);

	/**
	 * Returns the value of the '<em><b>Parent EReference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent EReference</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent EReference</em>' reference.
	 * @see #setParentEReference(EReference)
	 * @see simk.SimkPackage#getSMMethod_ParentEReference()
	 * @model
	 * @generated
	 */
	EReference getParentEReference();

	/**
	 * Sets the value of the '{@link simk.SMMethod#getParentEReference <em>Parent EReference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent EReference</em>' reference.
	 * @see #getParentEReference()
	 * @generated
	 */
	void setParentEReference(EReference value);

	/**
	 * Returns the value of the '<em><b>Static</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Static</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Static</em>' attribute.
	 * @see #setStatic(boolean)
	 * @see simk.SimkPackage#getSMMethod_Static()
	 * @model default="true" dataType="ecore.EBoolean"
	 * @generated
	 */
	boolean isStatic();

	/**
	 * Sets the value of the '{@link simk.SMMethod#isStatic <em>Static</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Static</em>' attribute.
	 * @see #isStatic()
	 * @generated
	 */
	void setStatic(boolean value);

	/**
	 * Returns the value of the '<em><b>Type Parameters</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Parameters</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Parameters</em>' attribute.
	 * @see #setTypeParameters(String)
	 * @see simk.SimkPackage#getSMMethod_TypeParameters()
	 * @model dataType="ecore.EString"
	 * @generated
	 */
	String getTypeParameters();

	/**
	 * Sets the value of the '{@link simk.SMMethod#getTypeParameters <em>Type Parameters</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Parameters</em>' attribute.
	 * @see #getTypeParameters()
	 * @generated
	 */
	void setTypeParameters(String value);

	/**
	 * Returns the value of the '<em><b>Parent EOperation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent EOperation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent EOperation</em>' reference.
	 * @see #setParentEOperation(EOperation)
	 * @see simk.SimkPackage#getSMMethod_ParentEOperation()
	 * @model
	 * @generated
	 */
	EOperation getParentEOperation();

	/**
	 * Sets the value of the '{@link simk.SMMethod#getParentEOperation <em>Parent EOperation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent EOperation</em>' reference.
	 * @see #getParentEOperation()
	 * @generated
	 */
	void setParentEOperation(EOperation value);

	/**
	 * Returns the value of the '<em><b>Parent EAttribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent EAttribute</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent EAttribute</em>' reference.
	 * @see #setParentEAttribute(EAttribute)
	 * @see simk.SimkPackage#getSMMethod_ParentEAttribute()
	 * @model
	 * @generated
	 */
	EAttribute getParentEAttribute();

	/**
	 * Sets the value of the '{@link simk.SMMethod#getParentEAttribute <em>Parent EAttribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent EAttribute</em>' reference.
	 * @see #getParentEAttribute()
	 * @generated
	 */
	void setParentEAttribute(EAttribute value);

	/**
	 * Returns the value of the '<em><b>SM Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link simk.SMParameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SM Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SM Parameters</em>' containment reference list.
	 * @see simk.SimkPackage#getSMMethod_SMParameters()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<SMParameter> getSMParameters();

	/**
	 * Returns the value of the '<em><b>SM Return</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SM Return</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SM Return</em>' containment reference.
	 * @see #setSMReturn(SMReturn)
	 * @see simk.SimkPackage#getSMMethod_SMReturn()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	SMReturn getSMReturn();

	/**
	 * Sets the value of the '{@link simk.SMMethod#getSMReturn <em>SM Return</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SM Return</em>' containment reference.
	 * @see #getSMReturn()
	 * @generated
	 */
	void setSMReturn(SMReturn value);

	/**
	 * Returns the value of the '<em><b>Usages</b></em>' attribute.
	 * The literals are from the enumeration {@link simk.SMUsage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Usages</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usages</em>' attribute.
	 * @see simk.SMUsage
	 * @see #setUsages(SMUsage)
	 * @see simk.SimkPackage#getSMMethod_Usages()
	 * @model
	 * @generated
	 */
	SMUsage getUsages();

	/**
	 * Sets the value of the '{@link simk.SMMethod#getUsages <em>Usages</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Usages</em>' attribute.
	 * @see simk.SMUsage
	 * @see #getUsages()
	 * @generated
	 */
	void setUsages(SMUsage value);

	/**
	 * Returns the value of the '<em><b>SM Context</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link simk.SMContext#getSMMethods <em>SM Methods</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SM Context</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SM Context</em>' reference.
	 * @see #setSMContext(SMContext)
	 * @see simk.SimkPackage#getSMMethod_SMContext()
	 * @see simk.SMContext#getSMMethods
	 * @model opposite="sMMethods"
	 * @generated
	 */
	SMContext getSMContext();

	/**
	 * Sets the value of the '{@link simk.SMMethod#getSMContext <em>SM Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SM Context</em>' reference.
	 * @see #getSMContext()
	 * @generated
	 */
	void setSMContext(SMContext value);

	/**
	 * Returns the value of the '<em><b>Access</b></em>' attribute.
	 * The default value is <code>"public"</code>.
	 * The literals are from the enumeration {@link simk.SMAccess}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Access</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access</em>' attribute.
	 * @see simk.SMAccess
	 * @see #setAccess(SMAccess)
	 * @see simk.SimkPackage#getSMMethod_Access()
	 * @model default="public"
	 * @generated
	 */
	SMAccess getAccess();

	/**
	 * Sets the value of the '{@link simk.SMMethod#getAccess <em>Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access</em>' attribute.
	 * @see simk.SMAccess
	 * @see #getAccess()
	 * @generated
	 */
	void setAccess(SMAccess value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/** TODO TO COMMENT\052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tthis.setUsages(simk.SMUsage.getByName(\"Wrapper\"));\n'"
	 * @generated
	 */
	void setWrapperUsage();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="kermeta isAbstract='true'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='ecore.EOperation result = null;\n\nreturn result;\n'"
	 * @generated
	 */
	EOperation getParentEOperationFromModel();

} // SMMethod
