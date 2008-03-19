/**
 * <copyright>
 * </copyright>
 *
 * $Id: VirtualType.java,v 1.6 2008-03-19 16:34:13 cfaucher Exp $
 */
package fr.irisa.triskell.kermeta.language.structure;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Virtual Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * To be written
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.irisa.triskell.kermeta.language.structure.VirtualType#getClassDefinition <em>Class Definition</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.language.structure.VirtualType#getModelType <em>Model Type</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.language.structure.VirtualType#getTypeParamBinding <em>Type Param Binding</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.irisa.triskell.kermeta.language.structure.StructurePackage#getVirtualType()
 * @model
 * @generated
 */
public interface VirtualType extends ObjectTypeVariable {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "IRISA / INRIA / Universite de Rennes 1";

	/**
	 * Returns the value of the '<em><b>Class Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class Definition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * To be written
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Class Definition</em>' reference.
	 * @see #setClassDefinition(ClassDefinition)
	 * @see fr.irisa.triskell.kermeta.language.structure.StructurePackage#getVirtualType_ClassDefinition()
	 * @model required="true"
	 * @generated
	 */
	ClassDefinition getClassDefinition();

	/**
	 * Sets the value of the '{@link fr.irisa.triskell.kermeta.language.structure.VirtualType#getClassDefinition <em>Class Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class Definition</em>' reference.
	 * @see #getClassDefinition()
	 * @generated
	 */
	void setClassDefinition(ClassDefinition value);

	/**
	 * Returns the value of the '<em><b>Model Type</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fr.irisa.triskell.kermeta.language.structure.ModelTypeVariable#getVirtualType <em>Virtual Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model Type</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * To be written
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Model Type</em>' container reference.
	 * @see #setModelType(ModelTypeVariable)
	 * @see fr.irisa.triskell.kermeta.language.structure.StructurePackage#getVirtualType_ModelType()
	 * @see fr.irisa.triskell.kermeta.language.structure.ModelTypeVariable#getVirtualType
	 * @model opposite="virtualType" required="true" transient="false"
	 * @generated
	 */
	ModelTypeVariable getModelType();

	/**
	 * Sets the value of the '{@link fr.irisa.triskell.kermeta.language.structure.VirtualType#getModelType <em>Model Type</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Type</em>' container reference.
	 * @see #getModelType()
	 * @generated
	 */
	void setModelType(ModelTypeVariable value);

	/**
	 * Returns the value of the '<em><b>Type Param Binding</b></em>' containment reference list.
	 * The list contents are of type {@link fr.irisa.triskell.kermeta.language.structure.TypeVariableBinding}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Param Binding</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * To be written
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type Param Binding</em>' containment reference list.
	 * @see fr.irisa.triskell.kermeta.language.structure.StructurePackage#getVirtualType_TypeParamBinding()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<TypeVariableBinding> getTypeParamBinding();

} // VirtualType