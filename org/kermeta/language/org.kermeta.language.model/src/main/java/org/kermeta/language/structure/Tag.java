/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.language.structure;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tag</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Tag is intended to be used to add documentation on a  model element,
 * or add some textual information that cannot be expressed with any
 * model element definition.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.language.structure.Tag#getName <em>Name</em>}</li>
 *   <li>{@link org.kermeta.language.structure.Tag#getValue <em>Value</em>}</li>
 *   <li>{@link org.kermeta.language.structure.Tag#getObject <em>Object</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.language.structure.StructurePackage#getTag()
 * @model
 * @generated
 */
public interface Tag extends KermetaModelElement {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name of the Tag
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.kermeta.language.structure.StructurePackage#getTag_Name()
	 * @model dataType="org.kermeta.language.structure.String"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.kermeta.language.structure.Tag#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * String value of the Tag
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see org.kermeta.language.structure.StructurePackage#getTag_Value()
	 * @model dataType="org.kermeta.language.structure.String"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link org.kermeta.language.structure.Tag#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Object</b></em>' reference list.
	 * The list contents are of type {@link org.kermeta.language.structure.KermetaModelElement}.
	 * It is bidirectional and its opposite is '{@link org.kermeta.language.structure.KermetaModelElement#getKTag <em>KTag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Objects to which the Tag is attached to
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Object</em>' reference list.
	 * @see org.kermeta.language.structure.StructurePackage#getTag_Object()
	 * @see org.kermeta.language.structure.KermetaModelElement#getKTag
	 * @model opposite="kTag" required="true"
	 * @generated
	 */
	EList<KermetaModelElement> getObject();

} // Tag
