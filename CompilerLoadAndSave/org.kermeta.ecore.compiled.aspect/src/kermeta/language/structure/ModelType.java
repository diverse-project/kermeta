/**
 * <copyright>
 * </copyright>
 *
 * $Id: ModelType.java,v 1.1 2008-07-02 09:43:45 ftanguy Exp $
 */
package kermeta.language.structure;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kermeta.language.structure.ModelType#getIncludedTypeDefinition <em>Included Type Definition</em>}</li>
 * </ul>
 * </p>
 *
 * @see kermeta.language.structure.StructurePackage#getModelType()
 * @model annotation="kermeta documentation='Type of a model, consisting of a set of included type definitions'"
 * @generated
 */
public interface ModelType extends Type, TypeDefinition {
	/**
	 * Returns the value of the '<em><b>Included Type Definition</b></em>' reference list.
	 * The list contents are of type {@link kermeta.language.structure.TypeDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Included Type Definition</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Included Type Definition</em>' reference list.
	 * @see kermeta.language.structure.StructurePackage#getModelType_IncludedTypeDefinition()
	 * @model annotation="kermeta documentation='To be written'"
	 * @generated
	 */
	EList<TypeDefinition> getIncludedTypeDefinition();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\r\n\t * To be written ##########################################\r\n\t \052/'"
	 * @generated
	 */
	Model _new();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.Boolean"
	 *        annotation="kermeta documentation='/**\r\n\t * To be written ##########################################\r\n\t \052/'"
	 * @generated
	 */
	boolean isModelTypeOf(Model m);

} // ModelType
