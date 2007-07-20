/**
 * <copyright>
 * </copyright>
 *
 * $Id: TypeDefinition.java,v 1.5 2007-07-20 15:09:03 ftanguy Exp $
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
 *   <li>{@link fr.irisa.triskell.kermeta.language.structure.TypeDefinition#getBaseAspects <em>Base Aspects</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.language.structure.TypeDefinition#getAspects <em>Aspects</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.irisa.triskell.kermeta.language.structure.StructurePackage#getTypeDefinition()
 * @model
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

	/**
	 * Returns the value of the '<em><b>Base Aspects</b></em>' reference list.
	 * The list contents are of type {@link fr.irisa.triskell.kermeta.language.structure.TypeDefinition}.
	 * It is bidirectional and its opposite is '{@link fr.irisa.triskell.kermeta.language.structure.TypeDefinition#getAspects <em>Aspects</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Aspects</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Aspects</em>' reference list.
	 * @see fr.irisa.triskell.kermeta.language.structure.StructurePackage#getTypeDefinition_BaseAspects()
	 * @see fr.irisa.triskell.kermeta.language.structure.TypeDefinition#getAspects
	 * @model opposite="aspects"
	 * @generated
	 */
	EList<TypeDefinition> getBaseAspects();

	/**
	 * Returns the value of the '<em><b>Aspects</b></em>' reference list.
	 * The list contents are of type {@link fr.irisa.triskell.kermeta.language.structure.TypeDefinition}.
	 * It is bidirectional and its opposite is '{@link fr.irisa.triskell.kermeta.language.structure.TypeDefinition#getBaseAspects <em>Base Aspects</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aspects</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aspects</em>' reference list.
	 * @see fr.irisa.triskell.kermeta.language.structure.StructurePackage#getTypeDefinition_Aspects()
	 * @see fr.irisa.triskell.kermeta.language.structure.TypeDefinition#getBaseAspects
	 * @model opposite="baseAspects"
	 * @generated
	 */
	EList<TypeDefinition> getAspects();

} // TypeDefinition