/**
 * <copyright>
 * </copyright>
 *
 * $Id: EClassifier.java,v 1.1 2008-09-04 15:40:35 cfaucher Exp $
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
 *   <li>{@link ecore.EClassifier#getInstanceClass <em>Instance Class</em>}</li>
 *   <li>{@link ecore.EClassifier#getETypeParameters <em>EType Parameters</em>}</li>
 *   <li>{@link ecore.EClassifier#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link ecore.EClassifier#getInstanceTypeName <em>Instance Type Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see ecore.EcorePackage#getEClassifier()
 * @model abstract="true"
 *        annotation="kermeta aspect='true'"
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
	 * @see #setEPackage(EPackage)
	 * @see ecore.EcorePackage#getEClassifier_EPackage()
	 * @see ecore.EPackage#getEClassifiers
	 * @model opposite="eClassifiers"
	 *        annotation="kermeta ecore.isTransient='true'"
	 * @generated
	 */
	EPackage getEPackage();

	/**
	 * Sets the value of the '{@link ecore.EClassifier#getEPackage <em>EPackage</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EPackage</em>' container reference.
	 * @see #getEPackage()
	 * @generated
	 */
	void setEPackage(EPackage value);

	/**
	 * Returns the value of the '<em><b>Instance Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instance Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance Class</em>' attribute.
	 * @see #setInstanceClass(Class)
	 * @see ecore.EcorePackage#getEClassifier_InstanceClass()
	 * @model dataType="ecore.EJavaClass<?>" derived="true"
	 *        annotation="kermeta isReadOnly='false'"
	 *        annotation="kompiledderivedProp.setter body='{\n\n\t\nif (true)\n\tthrow new org.kermeta.compil.runtime.helper.error.KRuntimeError( ((kermeta.exceptions.NotImplementedException) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.exceptions.NotImplementedException\")) );\n\n}'"
	 *        annotation="kompiledderivedProp.getter body='{\n\n\t\nif (true)\n\tthrow new org.kermeta.compil.runtime.helper.error.KRuntimeError( ((kermeta.exceptions.NotImplementedException) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.exceptions.NotImplementedException\")) );\n\n}'"
	 * @generated
	 */
	Class<?> getInstanceClass();

	/**
	 * Sets the value of the '{@link ecore.EClassifier#getInstanceClass <em>Instance Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance Class</em>' attribute.
	 * @see #getInstanceClass()
	 * @generated
	 */
	void setInstanceClass(Class<?> value);

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
	 * Returns the value of the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value</em>' attribute.
	 * @see #setDefaultValue(Object)
	 * @see ecore.EcorePackage#getEClassifier_DefaultValue()
	 * @model dataType="ecore.EJavaObject" derived="true"
	 *        annotation="kermeta isReadOnly='false'"
	 *        annotation="kompiledderivedProp.setter body='{\n\n\t\nif (true)\n\tthrow new org.kermeta.compil.runtime.helper.error.KRuntimeError( ((kermeta.exceptions.NotImplementedException) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.exceptions.NotImplementedException\")) );\n\n}'"
	 *        annotation="kompiledderivedProp.getter body='{\n\n\t\nif (true)\n\tthrow new org.kermeta.compil.runtime.helper.error.KRuntimeError( ((kermeta.exceptions.NotImplementedException) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.exceptions.NotImplementedException\")) );\n\n}'"
	 * @generated
	 */
	Object getDefaultValue();

	/**
	 * Sets the value of the '{@link ecore.EClassifier#getDefaultValue <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value</em>' attribute.
	 * @see #getDefaultValue()
	 * @generated
	 */
	void setDefaultValue(Object value);

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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\t\nif (true)\n\tthrow new org.kermeta.compil.runtime.helper.error.KRuntimeError( ((kermeta.exceptions.NotImplementedException) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.exceptions.NotImplementedException\")) );\n\n\nreturn result;\n'"
	 * @generated
	 */
	boolean isInstance(Object object);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="ecore.EInt"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Integer result = null;\n\n\t\nif (true)\n\tthrow new org.kermeta.compil.runtime.helper.error.KRuntimeError( ((kermeta.exceptions.NotImplementedException) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.exceptions.NotImplementedException\")) );\n\n\nreturn result;\n'"
	 * @generated
	 */
	int getClassifierID();

} // EClassifier
