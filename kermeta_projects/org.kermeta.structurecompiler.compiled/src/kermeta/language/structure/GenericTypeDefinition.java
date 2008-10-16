/**
 * <copyright>
 * </copyright>
 *
 * $Id: GenericTypeDefinition.java,v 1.5 2008-10-16 13:17:59 cfaucher Exp $
 */
package kermeta.language.structure;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generic Type Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kermeta.language.structure.GenericTypeDefinition#getTypeParameter <em>Type Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @see kermeta.language.structure.StructurePackage#getGenericTypeDefinition()
 * @model annotation="kermeta documentation='Abstracts the definition of generic type definitions (i.e. type definitions that\ncan be parameterized), namely, for ClassDefinition and ModelTypeDefinition.'"
 * @generated
 */
public interface GenericTypeDefinition extends TypeDefinition {
	/**
	 * Returns the value of the '<em><b>Type Parameter</b></em>' containment reference list.
	 * The list contents are of type {@link kermeta.language.structure.TypeVariable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Parameter</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Parameter</em>' containment reference list.
	 * @see kermeta.language.structure.StructurePackage#getGenericTypeDefinition_TypeParameter()
	 * @model containment="true" resolveProxies="true"
	 *        annotation="kermeta documentation='Type variables defined for the GenericTypeDefinition'"
	 * @generated
	 */
	EList<TypeVariable> getTypeParameter();

} // GenericTypeDefinition
