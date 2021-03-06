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
 * A representation of the model object '<em><b>Product Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Type corresponding to a set of Types. It represents a set of ModelElement that are instances of the Types in the ProductType.
 * The number of ModelElement is the same as the number of Types of the ProductType
 * Only used in the context of FunctionType
 * This allows to to send to the function a set of elements as parameters, each parameter is typed
 * with the types in the set of the ProductType.
 * Unfortunatly, there is no surface syntax for a literal that could help in using this type in another context.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.language.structure.ProductType#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.language.structure.StructurePackage#getProductType()
 * @model
 * @generated
 */
public interface ProductType extends TypeContainer, Type {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference list.
	 * The list contents are of type {@link org.kermeta.language.structure.Type}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Types 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' reference list.
	 * @see org.kermeta.language.structure.StructurePackage#getProductType_Type()
	 * @model
	 * @generated
	 */
	EList<Type> getType();

} // ProductType
