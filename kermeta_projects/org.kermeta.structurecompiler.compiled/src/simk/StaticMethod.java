/**
 * <copyright>
 * </copyright>
 *
 * $Id: StaticMethod.java,v 1.1 2008-09-04 15:40:41 cfaucher Exp $
 */
package simk;

import ecore.EAttribute;
import ecore.EOperation;
import ecore.EReference;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Static Method</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link simk.StaticMethod#getBody <em>Body</em>}</li>
 *   <li>{@link simk.StaticMethod#getTypeParameters <em>Type Parameters</em>}</li>
 *   <li>{@link simk.StaticMethod#getParentAttribute <em>Parent Attribute</em>}</li>
 *   <li>{@link simk.StaticMethod#getSMParameters <em>SM Parameters</em>}</li>
 *   <li>{@link simk.StaticMethod#getSMReturn <em>SM Return</em>}</li>
 *   <li>{@link simk.StaticMethod#getUsages <em>Usages</em>}</li>
 *   <li>{@link simk.StaticMethod#getParentMethod <em>Parent Method</em>}</li>
 *   <li>{@link simk.StaticMethod#getSMContext <em>SM Context</em>}</li>
 *   <li>{@link simk.StaticMethod#getParentReference <em>Parent Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @see simk.SimkPackage#getStaticMethod()
 * @model
 * @generated
 */
public interface StaticMethod extends SMNamedElement {
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
	 * @see simk.SimkPackage#getStaticMethod_Body()
	 * @model dataType="ecore.EString"
	 * @generated
	 */
	String getBody();

	/**
	 * Sets the value of the '{@link simk.StaticMethod#getBody <em>Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' attribute.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(String value);

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
	 * @see simk.SimkPackage#getStaticMethod_TypeParameters()
	 * @model dataType="ecore.EString"
	 * @generated
	 */
	String getTypeParameters();

	/**
	 * Sets the value of the '{@link simk.StaticMethod#getTypeParameters <em>Type Parameters</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Parameters</em>' attribute.
	 * @see #getTypeParameters()
	 * @generated
	 */
	void setTypeParameters(String value);

	/**
	 * Returns the value of the '<em><b>Parent Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Attribute</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Attribute</em>' reference.
	 * @see #setParentAttribute(EAttribute)
	 * @see simk.SimkPackage#getStaticMethod_ParentAttribute()
	 * @model
	 * @generated
	 */
	EAttribute getParentAttribute();

	/**
	 * Sets the value of the '{@link simk.StaticMethod#getParentAttribute <em>Parent Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Attribute</em>' reference.
	 * @see #getParentAttribute()
	 * @generated
	 */
	void setParentAttribute(EAttribute value);

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
	 * @see simk.SimkPackage#getStaticMethod_SMParameters()
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
	 * @see simk.SimkPackage#getStaticMethod_SMReturn()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	SMReturn getSMReturn();

	/**
	 * Sets the value of the '{@link simk.StaticMethod#getSMReturn <em>SM Return</em>}' containment reference.
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
	 * @see simk.SimkPackage#getStaticMethod_Usages()
	 * @model
	 * @generated
	 */
	SMUsage getUsages();

	/**
	 * Sets the value of the '{@link simk.StaticMethod#getUsages <em>Usages</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Usages</em>' attribute.
	 * @see simk.SMUsage
	 * @see #getUsages()
	 * @generated
	 */
	void setUsages(SMUsage value);

	/**
	 * Returns the value of the '<em><b>Parent Method</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Method</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Method</em>' reference.
	 * @see #setParentMethod(EOperation)
	 * @see simk.SimkPackage#getStaticMethod_ParentMethod()
	 * @model
	 * @generated
	 */
	EOperation getParentMethod();

	/**
	 * Sets the value of the '{@link simk.StaticMethod#getParentMethod <em>Parent Method</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Method</em>' reference.
	 * @see #getParentMethod()
	 * @generated
	 */
	void setParentMethod(EOperation value);

	/**
	 * Returns the value of the '<em><b>SM Context</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link simk.SMContext#getStaticMethods <em>Static Methods</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SM Context</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SM Context</em>' reference.
	 * @see #setSMContext(SMContext)
	 * @see simk.SimkPackage#getStaticMethod_SMContext()
	 * @see simk.SMContext#getStaticMethods
	 * @model opposite="staticMethods"
	 * @generated
	 */
	SMContext getSMContext();

	/**
	 * Sets the value of the '{@link simk.StaticMethod#getSMContext <em>SM Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SM Context</em>' reference.
	 * @see #getSMContext()
	 * @generated
	 */
	void setSMContext(SMContext value);

	/**
	 * Returns the value of the '<em><b>Parent Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Reference</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Reference</em>' reference.
	 * @see #setParentReference(EReference)
	 * @see simk.SimkPackage#getStaticMethod_ParentReference()
	 * @model
	 * @generated
	 */
	EReference getParentReference();

	/**
	 * Sets the value of the '{@link simk.StaticMethod#getParentReference <em>Parent Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Reference</em>' reference.
	 * @see #getParentReference()
	 * @generated
	 */
	void setParentReference(EReference value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="kermeta isAbstract='true'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='ecore.EOperation result = null;\n\nreturn result;\n'"
	 * @generated
	 */
	EOperation getParentMethodFromModel();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/** TODO TO COMMENT\052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tthis.setUsages(simk.SMUsage.getByName(\"Wrapper\"));\n'"
	 * @generated
	 */
	void setWrapperUsage();

} // StaticMethod
