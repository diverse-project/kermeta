/**
 * <copyright>
 * </copyright>
 *
 * $Id: TypeDefinition.java,v 1.7 2008-02-14 07:13:02 uid21732 Exp $
 */
package fr.irisa.triskell.kermeta.language.structure;


import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.irisa.triskell.kermeta.language.structure.TypeDefinition#isIsAspect <em>Is Aspect</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.irisa.triskell.kermeta.language.structure.StructurePackage#getTypeDefinition()
 * @model annotation="GenModel documentation='/**\n * This boolean allows to tell if this Type definition is an aspect or not\n * If it is an aspect, then at runtime, its definition will be merged with the definition of another\n * TypeDefinition that has exactly the same qualified name\n \052/'"
 * @generated
 */
public interface TypeDefinition extends NamedElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "IRISA / INRIA / Universite de Rennes 1";

	/**
	 * Returns the value of the '<em><b>Is Aspect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Aspect</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Aspect</em>' attribute.
	 * @see #setIsAspect(boolean)
	 * @see fr.irisa.triskell.kermeta.language.structure.StructurePackage#getTypeDefinition_IsAspect()
	 * @model dataType="fr.irisa.triskell.kermeta.language.structure.Boolean"
	 * @generated
	 */
	boolean isIsAspect();

	/**
	 * Sets the value of the '{@link fr.irisa.triskell.kermeta.language.structure.TypeDefinition#isIsAspect <em>Is Aspect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Aspect</em>' attribute.
	 * @see #isIsAspect()
	 * @generated
	 */
	void setIsAspect(boolean value);

} // TypeDefinition