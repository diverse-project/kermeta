/**
 * <copyright>
 * </copyright>
 *
 * $Id: GenericTypeDefinition.java,v 1.5 2008-02-14 07:13:02 uid21732 Exp $
 */
package fr.irisa.triskell.kermeta.language.structure;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generic Type Definition</b></em>'.
 * <!-- end-user-doc -->
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
	 * @return the value of the '<em>Type Parameter</em>' containment reference list.
	 * @see fr.irisa.triskell.kermeta.language.structure.StructurePackage#getGenericTypeDefinition_TypeParameter()
	 * @model containment="true" resolveProxies="true"
	 *        annotation="GenModel documentation='/**\n * Type variables defined for the GenericTypeDefinition\n \052/'"
	 * @generated
	 */
	EList<TypeVariable> getTypeParameter();

} // GenericTypeDefinition