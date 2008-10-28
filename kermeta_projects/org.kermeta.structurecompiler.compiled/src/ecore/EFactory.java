/**
 * <copyright>
 * </copyright>
 *
 * $Id: EFactory.java,v 1.7 2008-10-28 13:18:25 cfaucher Exp $
 */
package ecore;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EFactory</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ecore.EFactory#getEPackage <em>EPackage</em>}</li>
 * </ul>
 * </p>
 *
 * @see ecore.EcorePackage#getEFactory()
 * @model
 * @generated
 */
public interface EFactory extends EModelElement {
	/**
	 * Returns the value of the '<em><b>EPackage</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ecore.EPackage#getEFactoryInstance <em>EFactory Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EPackage</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EPackage</em>' reference.
	 * @see #setEPackage(EPackage)
	 * @see ecore.EcorePackage#getEFactory_EPackage()
	 * @see ecore.EPackage#getEFactoryInstance
	 * @model opposite="eFactoryInstance" required="true" transient="true"
	 *        annotation="kermeta ecore.isTransient='true'"
	 * @generated
	 */
	EPackage getEPackage();

	/**
	 * Sets the value of the '{@link ecore.EFactory#getEPackage <em>EPackage</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EPackage</em>' reference.
	 * @see #getEPackage()
	 * @generated
	 */
	void setEPackage(EPackage value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="ecore.EJavaObject" literalValueDataType="ecore.EString"
	 *        annotation="kermeta isAbstract='true'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='java.lang.Object result = null;\n\nreturn result;\n'"
	 * @generated
	 */
	Object createFromString(EDataType eDataType, String literalValue);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="ecore.EString" instanceValueDataType="ecore.EJavaObject"
	 *        annotation="kermeta isAbstract='true'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='java.lang.String result = null;\n\nreturn result;\n'"
	 * @generated
	 */
	String convertToString(EDataType eDataType, Object instanceValue);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta isAbstract='true'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='ecore.EObject result = null;\n\nreturn result;\n'"
	 * @generated
	 */
	EObject create(EClass eClass);

} // EFactory
