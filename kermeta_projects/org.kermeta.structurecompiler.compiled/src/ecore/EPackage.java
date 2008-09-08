/**
 * <copyright>
 * </copyright>
 *
 * $Id: EPackage.java,v 1.2 2008-09-08 19:28:31 cfaucher Exp $
 */
package ecore;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EPackage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ecore.EPackage#getNsURI <em>Ns URI</em>}</li>
 *   <li>{@link ecore.EPackage#getESubpackages <em>ESubpackages</em>}</li>
 *   <li>{@link ecore.EPackage#getESuperPackage <em>ESuper Package</em>}</li>
 *   <li>{@link ecore.EPackage#getNsPrefix <em>Ns Prefix</em>}</li>
 *   <li>{@link ecore.EPackage#getEClassifiers <em>EClassifiers</em>}</li>
 *   <li>{@link ecore.EPackage#getEFactoryInstance <em>EFactory Instance</em>}</li>
 * </ul>
 * </p>
 *
 * @see ecore.EcorePackage#getEPackage()
 * @model annotation="kermeta aspect='true'"
 * @generated
 */
public interface EPackage extends ENamedElement {
	/**
	 * Returns the value of the '<em><b>Ns URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ns URI</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ns URI</em>' attribute.
	 * @see #setNsURI(String)
	 * @see ecore.EcorePackage#getEPackage_NsURI()
	 * @model dataType="ecore.EString"
	 * @generated
	 */
	String getNsURI();

	/**
	 * Sets the value of the '{@link ecore.EPackage#getNsURI <em>Ns URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ns URI</em>' attribute.
	 * @see #getNsURI()
	 * @generated
	 */
	void setNsURI(String value);

	/**
	 * Returns the value of the '<em><b>ESubpackages</b></em>' containment reference list.
	 * The list contents are of type {@link ecore.EPackage}.
	 * It is bidirectional and its opposite is '{@link ecore.EPackage#getESuperPackage <em>ESuper Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ESubpackages</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ESubpackages</em>' containment reference list.
	 * @see ecore.EcorePackage#getEPackage_ESubpackages()
	 * @see ecore.EPackage#getESuperPackage
	 * @model opposite="eSuperPackage" containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<EPackage> getESubpackages();

	/**
	 * Returns the value of the '<em><b>ESuper Package</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ecore.EPackage#getESubpackages <em>ESubpackages</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ESuper Package</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ESuper Package</em>' container reference.
	 * @see #setESuperPackage(EPackage)
	 * @see ecore.EcorePackage#getEPackage_ESuperPackage()
	 * @see ecore.EPackage#getESubpackages
	 * @model opposite="eSubpackages"
	 *        annotation="kermeta ecore.isTransient='true'"
	 * @generated
	 */
	EPackage getESuperPackage();

	/**
	 * Sets the value of the '{@link ecore.EPackage#getESuperPackage <em>ESuper Package</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ESuper Package</em>' container reference.
	 * @see #getESuperPackage()
	 * @generated
	 */
	void setESuperPackage(EPackage value);

	/**
	 * Returns the value of the '<em><b>Ns Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ns Prefix</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ns Prefix</em>' attribute.
	 * @see #setNsPrefix(String)
	 * @see ecore.EcorePackage#getEPackage_NsPrefix()
	 * @model dataType="ecore.EString"
	 * @generated
	 */
	String getNsPrefix();

	/**
	 * Sets the value of the '{@link ecore.EPackage#getNsPrefix <em>Ns Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ns Prefix</em>' attribute.
	 * @see #getNsPrefix()
	 * @generated
	 */
	void setNsPrefix(String value);

	/**
	 * Returns the value of the '<em><b>EClassifiers</b></em>' containment reference list.
	 * The list contents are of type {@link ecore.EClassifier}.
	 * It is bidirectional and its opposite is '{@link ecore.EClassifier#getEPackage <em>EPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EClassifiers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EClassifiers</em>' containment reference list.
	 * @see ecore.EcorePackage#getEPackage_EClassifiers()
	 * @see ecore.EClassifier#getEPackage
	 * @model opposite="ePackage" containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<EClassifier> getEClassifiers();

	/**
	 * Returns the value of the '<em><b>EFactory Instance</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ecore.EFactory#getEPackage <em>EPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EFactory Instance</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EFactory Instance</em>' reference.
	 * @see #setEFactoryInstance(EFactory)
	 * @see ecore.EcorePackage#getEPackage_EFactoryInstance()
	 * @see ecore.EFactory#getEPackage
	 * @model opposite="ePackage" required="true" transient="true"
	 *        annotation="kermeta ecore.isTransient='true'"
	 * @generated
	 */
	EFactory getEFactoryInstance();

	/**
	 * Sets the value of the '{@link ecore.EPackage#getEFactoryInstance <em>EFactory Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EFactory Instance</em>' reference.
	 * @see #getEFactoryInstance()
	 * @generated
	 */
	void setEFactoryInstance(EFactory value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model nameDataType="ecore.EString"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\necore.EClassifier result = null;\n\n\t//Beginning of the Inlining of the function type: select\n\nkermeta.standard.Sequence<ecore.EClassifier> result_ft215 = null;\n\n\tecore.EClassifier elem_ft215 = null;\n\n\tresult_ft215 = ((kermeta.standard.Sequence<ecore.EClassifier>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.standard.Sequence<ecore.EClassifier>\"));\n\n\t\n{\n\n\tkermeta.standard.Iterator<ecore.EClassifier> it_ft215 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EClassifier>convertAsOrderedSet(this.getEClassifiers()).iterator();\n\tjava.lang.Boolean idLoopCond_920 = false;\n\twhile( !idLoopCond_920 ) {\n\tidLoopCond_920 = it_ft215.isOff();\n\tif ( idLoopCond_920 ) {\n\t} else {\n\n\telem_ft215 = it_ft215.next();\n\n\tjava.lang.Boolean idIfCond_921 = false;\n//Beginning of the Inlining of the lambda expression: selector\necore.EClassifier c = elem_ft215;\n\n\tidIfCond_921 = kermeta.standard.helper.StringWrapper.equals(c.getName(), name);\n//End of the Inlining of the lambda expression: selector\n\n\n\tif( idIfCond_921 ) {\n\n\tresult_ft215.add(elem_ft215);\n}\n\n}\n\t}\n}\n\n//End of the Inlining of the function type: select\nresult = result_ft215.one();\n\nreturn result;\n'"
	 * @generated
	 */
	EClassifier getEClassifier(String name);

} // EPackage
