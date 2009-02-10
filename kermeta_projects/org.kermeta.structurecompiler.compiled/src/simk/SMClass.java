/**
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * 
 * Generating with Kermeta <http://www.kermeta.org>
 *
 * $Id: SMClass.java,v 1.11 2009-02-10 17:51:59 cfaucher Exp $
 */
package simk;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SM Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link simk.SMClass#getContext <em>Context</em>}</li>
 *   <li>{@link simk.SMClass#getUsages <em>Usages</em>}</li>
 * </ul>
 * </p>
 *
 * @see simk.SimkPackage#getSMClass()
 * @model
 * @generated
 */
public interface SMClass extends SMNamedElement {
	/**
	 * Returns the value of the '<em><b>Context</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link simk.SMContext#getSMClass <em>SM Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context</em>' container reference.
	 * @see #setContext(SMContext)
	 * @see simk.SimkPackage#getSMClass_Context()
	 * @see simk.SMContext#getSMClass
	 * @model opposite="sMClass" required="true" transient="false"
	 * @generated
	 */
	SMContext getContext();

	/**
	 * Sets the value of the '{@link simk.SMClass#getContext <em>Context</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' container reference.
	 * @see #getContext()
	 * @generated
	 */
	void setContext(SMContext value);

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
	 * @see simk.SimkPackage#getSMClass_Usages()
	 * @model transient="true"
	 * @generated
	 */
	SMUsage getUsages();

	/**
	 * Sets the value of the '{@link simk.SMClass#getUsages <em>Usages</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Usages</em>' attribute.
	 * @see simk.SMUsage
	 * @see #getUsages()
	 * @generated
	 */
	void setUsages(SMUsage value);

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
	 * @model kind="operation" dataType="ecore.EString"
	 *        annotation="kermeta isAbstract='true'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='java.lang.String result = null;\n\nreturn result;\n'"
	 * @generated
	 */
	String getQualifiedName();

} // SMClass
