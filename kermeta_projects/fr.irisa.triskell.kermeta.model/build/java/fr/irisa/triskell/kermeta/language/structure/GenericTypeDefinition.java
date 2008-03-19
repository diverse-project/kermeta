/**
 * <copyright>
 * </copyright>
 *
 * $Id: GenericTypeDefinition.java,v 1.6 2008-03-19 16:34:13 cfaucher Exp $
 */
package fr.irisa.triskell.kermeta.language.structure;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generic Type Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Abstracts the definition of generic type definitions (i.e. type definitions that
 * can be parameterized), namely, for ClassDefinition and ModelTypeDefinition.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.irisa.triskell.kermeta.language.structure.GenericTypeDefinition#getTypeParameter <em>Type Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.irisa.triskell.kermeta.language.structure.StructurePackage#getGenericTypeDefinition()
 * @model abstract="true"
 * @generated
 */
public interface GenericTypeDefinition extends TypeDefinition {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "IRISA / INRIA / Universite de Rennes 1";

	/**
	 * Returns the value of the '<em><b>Type Parameter</b></em>' containment reference list.
	 * The list contents are of type {@link fr.irisa.triskell.kermeta.language.structure.TypeVariable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Parameter</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Type variables defined for the GenericTypeDefinition
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type Parameter</em>' containment reference list.
	 * @see fr.irisa.triskell.kermeta.language.structure.StructurePackage#getGenericTypeDefinition_TypeParameter()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<TypeVariable> getTypeParameter();

} // GenericTypeDefinition