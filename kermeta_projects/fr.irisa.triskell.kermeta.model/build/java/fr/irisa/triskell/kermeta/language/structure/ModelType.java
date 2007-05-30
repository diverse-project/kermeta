/**
 * <copyright>
 * </copyright>
 *
 * $Id: ModelType.java,v 1.3 2007-05-30 11:17:43 jsteel Exp $
 */
package fr.irisa.triskell.kermeta.language.structure;


import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.irisa.triskell.kermeta.language.structure.ModelType#getIncludedTypeDefinition <em>Included Type Definition</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.irisa.triskell.kermeta.language.structure.StructurePackage#getModelType()
 * @model
 * @generated
 */
public interface ModelType extends Type, TypeDefinition {
	/**
	 * Returns the value of the '<em><b>Included Type Definition</b></em>' reference list.
	 * The list contents are of type {@link fr.irisa.triskell.kermeta.language.structure.TypeDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Included Type Definition</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Included Type Definition</em>' reference list.
	 * @see fr.irisa.triskell.kermeta.language.structure.StructurePackage#getModelType_IncludedTypeDefinition()
	 * @model type="fr.irisa.triskell.kermeta.language.structure.TypeDefinition"
	 * @generated
	 */
	EList getIncludedTypeDefinition();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Model _new();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="fr.irisa.triskell.kermeta.language.structure.Boolean"
	 * @generated
	 */
	boolean isModelTypeOf(Model model);

} // ModelType
