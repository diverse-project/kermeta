/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.language.structure;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unresolved Inferred Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Special type reference which is still unresolved.
 * However we need to use a special inferrence algorithm in order  to create a real Type that points to a concrete TypeDefinition.
 * Exemple :
 * A typical use will be for the type of the lambda parameter i in :
 * operation foo(f : <Integer->Integer) is abstract
 * ...
 * foo{i | i+1 }
 * 
 * in that case, the type of i is an UnresolvedInferredType, the Resolved should find the appropriate operation foo (if there is no ambiguity)
 * 
 * <!-- end-model-doc -->
 *
 *
 * @see org.kermeta.language.structure.StructurePackage#getUnresolvedInferredType()
 * @model
 * @generated
 */
public interface UnresolvedInferredType extends Unresolved, Type {
} // UnresolvedInferredType
