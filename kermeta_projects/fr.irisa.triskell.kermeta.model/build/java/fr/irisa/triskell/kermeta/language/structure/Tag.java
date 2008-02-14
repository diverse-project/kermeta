/**
 * <copyright>
 * </copyright>
 *
 * $Id: Tag.java,v 1.4 2008-02-14 07:13:02 uid21732 Exp $
 */
package fr.irisa.triskell.kermeta.language.structure;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tag</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.irisa.triskell.kermeta.language.structure.Tag#getName <em>Name</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.language.structure.Tag#getValue <em>Value</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.language.structure.Tag#getObject <em>Object</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.irisa.triskell.kermeta.language.structure.StructurePackage#getTag()
 * @model annotation="GenModel documentation='/**\n * Tag is intended to be used to add documentation on a  model element,\n * or add some textual information that cannot be expressed with any\n * model element definition.\n \052/'"
 * @generated
 */
public interface Tag extends fr.irisa.triskell.kermeta.language.structure.Object {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "IRISA / INRIA / Universite de Rennes 1";

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see fr.irisa.triskell.kermeta.language.structure.StructurePackage#getTag_Name()
	 * @model dataType="fr.irisa.triskell.kermeta.language.structure.String"
	 *        annotation="GenModel documentation='/**\n * Name of the Tag\n \052/'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link fr.irisa.triskell.kermeta.language.structure.Tag#getName <em>Name</em>}' attribute.
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
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see fr.irisa.triskell.kermeta.language.structure.StructurePackage#getTag_Value()
	 * @model dataType="fr.irisa.triskell.kermeta.language.structure.String"
	 *        annotation="GenModel documentation='/**\n * String value of the Tag\n \052/'"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link fr.irisa.triskell.kermeta.language.structure.Tag#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Object</b></em>' reference list.
	 * The list contents are of type {@link fr.irisa.triskell.kermeta.language.structure.Object}.
	 * It is bidirectional and its opposite is '{@link fr.irisa.triskell.kermeta.language.structure.Object#getTag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object</em>' reference list.
	 * @see fr.irisa.triskell.kermeta.language.structure.StructurePackage#getTag_Object()
	 * @see fr.irisa.triskell.kermeta.language.structure.Object#getTag
	 * @model opposite="tag" required="true"
	 *        annotation="GenModel documentation='/**\n * Objects to which the Tag is attached to\n \052/'"
	 * @generated
	 */
	EList<fr.irisa.triskell.kermeta.language.structure.Object> getObject();

} // Tag