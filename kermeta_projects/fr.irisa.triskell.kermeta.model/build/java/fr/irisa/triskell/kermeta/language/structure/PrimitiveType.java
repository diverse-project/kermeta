/**
 * <copyright>
 * </copyright>
 *
 * $Id: PrimitiveType.java,v 1.4 2008-02-14 07:13:02 uid21732 Exp $
 */
package fr.irisa.triskell.kermeta.language.structure;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Primitive Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.irisa.triskell.kermeta.language.structure.PrimitiveType#getInstanceType <em>Instance Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.irisa.triskell.kermeta.language.structure.StructurePackage#getPrimitiveType()
 * @model annotation="GenModel documentation='/**\n * The class definition for kermeta aliases. Above statement defines a primitive\n * type called MyString, which instanceType is <code>kermeta::standard::String</code>\n * <pre>alias MyString : kermeta::standard::String</pre>\n \052/'"
 * @generated
 */
public interface PrimitiveType extends DataType, TypeContainer {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "IRISA / INRIA / Universite de Rennes 1";

	/**
	 * Returns the value of the '<em><b>Instance Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instance Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance Type</em>' reference.
	 * @see #setInstanceType(Type)
	 * @see fr.irisa.triskell.kermeta.language.structure.StructurePackage#getPrimitiveType_InstanceType()
	 * @model annotation="GenModel documentation='/**\n * The type the primitive type is linked with\n \052/'"
	 * @generated
	 */
	Type getInstanceType();

	/**
	 * Sets the value of the '{@link fr.irisa.triskell.kermeta.language.structure.PrimitiveType#getInstanceType <em>Instance Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance Type</em>' reference.
	 * @see #getInstanceType()
	 * @generated
	 */
	void setInstanceType(Type value);

} // PrimitiveType