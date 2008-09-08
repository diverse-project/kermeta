/**
 * <copyright>
 * </copyright>
 *
 * $Id: EAttribute.java,v 1.2 2008-09-08 19:28:31 cfaucher Exp $
 */
package ecore;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EAttribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ecore.EAttribute#getEAttributeType <em>EAttribute Type</em>}</li>
 *   <li>{@link ecore.EAttribute#isID <em>ID</em>}</li>
 * </ul>
 * </p>
 *
 * @see ecore.EcorePackage#getEAttribute()
 * @model annotation="kermeta documentation='/** This class refers to any EDataType feature\052/'"
 *        annotation="kermeta aspect='true'"
 * @generated
 */
public interface EAttribute extends EStructuralFeature {
	/**
	 * Returns the value of the '<em><b>EAttribute Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EAttribute Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EAttribute Type</em>' reference.
	 * @see ecore.EcorePackage#getEAttribute_EAttributeType()
	 * @model required="true" changeable="false" derived="true"
	 *        annotation="kermeta isReadOnly='false'"
	 *        annotation="kompiledderivedProp.setter body='{\n\n\tjava.lang.Boolean idIfCond_884 = false;\n\tidIfCond_884 = org.kermeta.compil.runtime.helper.language.ObjectUtil.getMetaClass(this.getEType()).equals(org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"ecore.EDataType\"));\n\n\tif( idIfCond_884 ) {\n\n\tresult = (ecore.EDataType) this.getEType();\n}\n else {\n\n\tkermeta.exceptions.Exception exception = ((kermeta.exceptions.Exception) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.exceptions.Exception\"));\n\n\texception.setMessage(\"The EClassifer pointed by this EAttribute must be of type EDataType\");\n\n\t\nif (true)\n\tthrow new org.kermeta.compil.runtime.helper.error.KRuntimeError( exception );\n\n}\n\n}'"
	 *        annotation="kompiledderivedProp.getter body='{\n\n\tjava.lang.Boolean idIfCond_885 = false;\n\tidIfCond_885 = org.kermeta.compil.runtime.helper.language.ObjectUtil.getMetaClass(this.getEType()).equals(org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"ecore.EDataType\"));\n\n\tif( idIfCond_885 ) {\n\n\tresult = (ecore.EDataType) this.getEType();\n}\n else {\n\n\tkermeta.exceptions.Exception exception = ((kermeta.exceptions.Exception) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.exceptions.Exception\"));\n\n\texception.setMessage(\"The EClassifer pointed by this EAttribute must be of type EDataType\");\n\n\t\nif (true)\n\tthrow new org.kermeta.compil.runtime.helper.error.KRuntimeError( exception );\n\n}\n\n}'"
	 * @generated
	 */
	EDataType getEAttributeType();

	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #setID(boolean)
	 * @see ecore.EcorePackage#getEAttribute_ID()
	 * @model default="false" dataType="ecore.EBoolean"
	 * @generated
	 */
	boolean isID();

	/**
	 * Sets the value of the '{@link ecore.EAttribute#isID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #isID()
	 * @generated
	 */
	void setID(boolean value);

} // EAttribute
