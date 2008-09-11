/**
 * <copyright>
 * </copyright>
 *
 * $Id: MultiplicityElement.java,v 1.2 2008-09-11 12:34:37 cfaucher Exp $
 */
package kermeta.language.structure;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multiplicity Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kermeta.language.structure.MultiplicityElement#getIsOrdered <em>Is Ordered</em>}</li>
 *   <li>{@link kermeta.language.structure.MultiplicityElement#getUpper <em>Upper</em>}</li>
 *   <li>{@link kermeta.language.structure.MultiplicityElement#getLower <em>Lower</em>}</li>
 *   <li>{@link kermeta.language.structure.MultiplicityElement#getIsUnique <em>Is Unique</em>}</li>
 * </ul>
 * </p>
 *
 * @see kermeta.language.structure.StructurePackage#getMultiplicityElement()
 * @model annotation="kermeta documentation=' Model elements with a multiplicity [lower..upper] inherit this class'"
 * @generated
 */
public interface MultiplicityElement extends TypedElement {
	/**
	 * Returns the value of the '<em><b>Is Ordered</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Ordered</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Ordered</em>' attribute.
	 * @see #setIsOrdered(Boolean)
	 * @see kermeta.language.structure.StructurePackage#getMultiplicityElement_IsOrdered()
	 * @model default="false" dataType="kermeta.standard.JavaBoolean"
	 *        annotation="kermeta documentation='Boolean stating whether the element is ordered'"
	 * @generated
	 */
	Boolean getIsOrdered();

	/**
	 * Sets the value of the '{@link kermeta.language.structure.MultiplicityElement#getIsOrdered <em>Is Ordered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Ordered</em>' attribute.
	 * @see #getIsOrdered()
	 * @generated
	 */
	void setIsOrdered(Boolean value);

	/**
	 * Returns the value of the '<em><b>Upper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Upper</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper</em>' attribute.
	 * @see #setUpper(Integer)
	 * @see kermeta.language.structure.StructurePackage#getMultiplicityElement_Upper()
	 * @model dataType="kermeta.standard.JavaInteger"
	 *        annotation="kermeta documentation='Max cardinality of the element, \'-1\' for \'*\''"
	 * @generated
	 */
	Integer getUpper();

	/**
	 * Sets the value of the '{@link kermeta.language.structure.MultiplicityElement#getUpper <em>Upper</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper</em>' attribute.
	 * @see #getUpper()
	 * @generated
	 */
	void setUpper(Integer value);

	/**
	 * Returns the value of the '<em><b>Lower</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lower</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lower</em>' attribute.
	 * @see #setLower(Integer)
	 * @see kermeta.language.structure.StructurePackage#getMultiplicityElement_Lower()
	 * @model dataType="kermeta.standard.JavaInteger"
	 *        annotation="kermeta documentation='Min cardinality of the element'"
	 * @generated
	 */
	Integer getLower();

	/**
	 * Sets the value of the '{@link kermeta.language.structure.MultiplicityElement#getLower <em>Lower</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower</em>' attribute.
	 * @see #getLower()
	 * @generated
	 */
	void setLower(Integer value);

	/**
	 * Returns the value of the '<em><b>Is Unique</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Unique</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Unique</em>' attribute.
	 * @see #setIsUnique(Boolean)
	 * @see kermeta.language.structure.StructurePackage#getMultiplicityElement_IsUnique()
	 * @model default="false" dataType="kermeta.standard.JavaBoolean"
	 *        annotation="kermeta documentation='Boolean stating whether duplicated elements are allowed'"
	 * @generated
	 */
	Boolean getIsUnique();

	/**
	 * Sets the value of the '{@link kermeta.language.structure.MultiplicityElement#getIsUnique <em>Is Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Unique</em>' attribute.
	 * @see #getIsUnique()
	 * @generated
	 */
	void setIsUnique(Boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="kermeta.standard.JavaString"
	 *        annotation="kermeta documentation='/**\n\t * Get the RecopyInValueTypes reference of an Operation\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.String result = null;\n\n\tresult = this.getUniqueTagValue(\"RecopyInValueTypes\");\n\nreturn result;\n'"
	 * @generated
	 */
	String getRecopyInValueTypes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="kermeta.standard.JavaString"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.String result = null;\n\n\tresult = this.getName();\n\n\tjava.lang.Boolean idIfCond_48 = false;\n\tidIfCond_48 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqual(this.getEMFRenameAs(), \"\");\n\n\tif( idIfCond_48 ) {\n\n\tresult = this.getEMFRenameAs();\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	String getFinalName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="kermeta.standard.JavaString"
	 *        annotation="kermeta documentation='/**\n\t * Get the EMFRenameAs reference of an Operation\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.String result = null;\n\n\tresult = this.getUniqueTagValue(\"EMF_renameAs\");\n\nreturn result;\n'"
	 * @generated
	 */
	String getEMFRenameAs();

} // MultiplicityElement
