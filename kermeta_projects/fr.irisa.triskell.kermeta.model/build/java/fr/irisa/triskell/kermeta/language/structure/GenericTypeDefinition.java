/**
 * <copyright>
 * </copyright>
 *
 * $Id: GenericTypeDefinition.java,v 1.2 2006-10-23 15:40:50 cfaucher Exp $
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
	 * @model type="fr.irisa.triskell.kermeta.language.structure.TypeVariable" containment="true" resolveProxies="true"
	 * @generated
	 */
	EList getTypeParameter();

} // GenericTypeDefinition
