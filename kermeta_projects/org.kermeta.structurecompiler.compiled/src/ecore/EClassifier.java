/**
 * <copyright>
 * </copyright>
 *
 * $Id: EClassifier.java,v 1.9 2008-11-07 08:53:51 cfaucher Exp $
 */
package ecore;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EClassifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ecore.EClassifier#getInstanceClassName <em>Instance Class Name</em>}</li>
 *   <li>{@link ecore.EClassifier#getEPackage <em>EPackage</em>}</li>
 *   <li>{@link ecore.EClassifier#getETypeParameters <em>EType Parameters</em>}</li>
 *   <li>{@link ecore.EClassifier#getInstanceTypeName <em>Instance Type Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see ecore.EcorePackage#getEClassifier()
 * @model abstract="true"
 * @generated
 */
public interface EClassifier extends ENamedElement {
	/**
	 * Returns the value of the '<em><b>Instance Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instance Class Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance Class Name</em>' attribute.
	 * @see #setInstanceClassName(String)
	 * @see ecore.EcorePackage#getEClassifier_InstanceClassName()
	 * @model dataType="ecore.EString"
	 * @generated
	 */
	String getInstanceClassName();

	/**
	 * Sets the value of the '{@link ecore.EClassifier#getInstanceClassName <em>Instance Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance Class Name</em>' attribute.
	 * @see #getInstanceClassName()
	 * @generated
	 */
	void setInstanceClassName(String value);

	/**
	 * Returns the value of the '<em><b>EPackage</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ecore.EPackage#getEClassifiers <em>EClassifiers</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EPackage</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EPackage</em>' container reference.
	 * @see ecore.EcorePackage#getEClassifier_EPackage()
	 * @see ecore.EPackage#getEClassifiers
	 * @model opposite="eClassifiers" changeable="false"
	 *        annotation="kermeta ecore.isTransient='true'"
	 * @generated
	 */
	EPackage getEPackage();

	/**
	 * Returns the value of the '<em><b>EType Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link ecore.ETypeParameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EType Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EType Parameters</em>' containment reference list.
	 * @see ecore.EcorePackage#getEClassifier_ETypeParameters()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<ETypeParameter> getETypeParameters();

	/**
	 * Returns the value of the '<em><b>Instance Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instance Type Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance Type Name</em>' attribute.
	 * @see #setInstanceTypeName(String)
	 * @see ecore.EcorePackage#getEClassifier_InstanceTypeName()
	 * @model dataType="ecore.EString"
	 * @generated
	 */
	String getInstanceTypeName();

	/**
	 * Sets the value of the '{@link ecore.EClassifier#getInstanceTypeName <em>Instance Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance Type Name</em>' attribute.
	 * @see #getInstanceTypeName()
	 * @generated
	 */
	void setInstanceTypeName(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="ecore.EBoolean" objectDataType="ecore.EJavaObject"
	 *        annotation="kermeta isAbstract='true'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='java.lang.Boolean result = null;\n\nreturn result;\n'"
	 * @generated
	 */
	boolean isInstance(Object object);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="ecore.EInt"
	 *        annotation="kermeta isAbstract='true'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='java.lang.Integer result = null;\n\nreturn result;\n'"
	 * @generated
	 */
	int getClassifierID();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="ecore.EJavaClass<?>"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Class result = null;\n\nreturn result;\n'"
	 * @generated
	 */
	Class<?> getterInstanceClass();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="ecore.EJavaObject"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Object result = null;\n\nreturn result;\n'"
	 * @generated
	 */
	Object getterDefaultValue();

} // EClassifier
