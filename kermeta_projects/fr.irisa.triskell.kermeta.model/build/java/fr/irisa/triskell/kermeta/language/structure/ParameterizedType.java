/**
 * <copyright>
 * </copyright>
 *
 * $Id: ParameterizedType.java,v 1.3 2006-12-06 16:22:58 dvojtise Exp $
 */
package fr.irisa.triskell.kermeta.language.structure;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameterized Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.irisa.triskell.kermeta.language.structure.ParameterizedType#getVirtualTypeBinding <em>Virtual Type Binding</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.language.structure.ParameterizedType#getTypeParamBinding <em>Type Param Binding</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.language.structure.ParameterizedType#getTypeDefinition <em>Type Definition</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.irisa.triskell.kermeta.language.structure.StructurePackage#getParameterizedType()
 * @model abstract="true"
 * @generated
 */
public interface ParameterizedType extends Type {
	/**
	 * Returns the value of the '<em><b>Virtual Type Binding</b></em>' containment reference list.
	 * The list contents are of type {@link fr.irisa.triskell.kermeta.language.structure.TypeVariableBinding}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Virtual Type Binding</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Virtual Type Binding</em>' containment reference list.
	 * @see fr.irisa.triskell.kermeta.language.structure.StructurePackage#getParameterizedType_VirtualTypeBinding()
	 * @model type="fr.irisa.triskell.kermeta.language.structure.TypeVariableBinding" containment="true" resolveProxies="true"
	 * @generated
	 */
	EList getVirtualTypeBinding();

	/**
	 * Returns the value of the '<em><b>Type Param Binding</b></em>' containment reference list.
	 * The list contents are of type {@link fr.irisa.triskell.kermeta.language.structure.TypeVariableBinding}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Param Binding</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Param Binding</em>' containment reference list.
	 * @see fr.irisa.triskell.kermeta.language.structure.StructurePackage#getParameterizedType_TypeParamBinding()
	 * @model type="fr.irisa.triskell.kermeta.language.structure.TypeVariableBinding" containment="true" resolveProxies="true"
	 * @generated
	 */
	EList getTypeParamBinding();

	/**
	 * Returns the value of the '<em><b>Type Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Definition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Definition</em>' reference.
	 * @see #setTypeDefinition(GenericTypeDefinition)
	 * @see fr.irisa.triskell.kermeta.language.structure.StructurePackage#getParameterizedType_TypeDefinition()
	 * @model required="true"
	 * @generated
	 */
	GenericTypeDefinition getTypeDefinition();

	/**
	 * Sets the value of the '{@link fr.irisa.triskell.kermeta.language.structure.ParameterizedType#getTypeDefinition <em>Type Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Definition</em>' reference.
	 * @see #getTypeDefinition()
	 * @generated
	 */
	void setTypeDefinition(GenericTypeDefinition value);

} // ParameterizedType
