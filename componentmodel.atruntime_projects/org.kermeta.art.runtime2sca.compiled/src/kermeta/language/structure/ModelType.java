/**
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * 
 * Generating with Kermeta <http://www.kermeta.org>
 *
 * $Id$
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
 * @model annotation="kermeta ecore='true'"
 *        annotation="kermeta documentation='Type of a model, consisting of a set of included type definitions'"
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
	 * @model annotation="kermeta ecore='true'"
	 *        annotation="kermeta documentation='To be written'"
	 * @generated
	 */
	EList<TypeDefinition> getIncludedTypeDefinition();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\n\t * To be written ##########################################\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.language.structure.Model result = null;\n\n\tresult = (kermeta.language.structure.Model) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeOrVoid(org.kermeta.compil.runtime.helper.language.ModelTypeUtil.newObject(this), \"kermeta.language.structure.Model\");\n\nreturn result;\n'"
	 * @generated
	 */
	Model _new();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaBoolean"
	 *        annotation="kermeta documentation='/**\n\t * To be written ##########################################\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = (java.lang.Boolean) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeOrVoid(org.kermeta.compil.runtime.helper.language.ModelTypeUtil.isModelTypeOf(this, m), \"java.lang.Boolean\");\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean isModelTypeOf(Model m);

} // ModelType
