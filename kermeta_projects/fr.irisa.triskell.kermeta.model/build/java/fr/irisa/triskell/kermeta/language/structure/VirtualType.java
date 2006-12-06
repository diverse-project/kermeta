/**
 * <copyright>
 * </copyright>
 *
 * $Id: VirtualType.java,v 1.2 2006-12-06 16:22:58 dvojtise Exp $
 */
package fr.irisa.triskell.kermeta.language.structure;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Virtual Type</b></em>'.
 * <!-- end-user-doc -->
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
	 * Returns the value of the '<em><b>Class Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class Definition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
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
	 * It is bidirectional and its opposite is '{@link fr.irisa.triskell.kermeta.language.structure.VirtualTypeContainer#getVirtualType <em>Virtual Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model Type</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Type</em>' container reference.
	 * @see #setModelType(VirtualTypeContainer)
	 * @see fr.irisa.triskell.kermeta.language.structure.StructurePackage#getVirtualType_ModelType()
	 * @see fr.irisa.triskell.kermeta.language.structure.VirtualTypeContainer#getVirtualType
	 * @model opposite="virtualType" required="true"
	 * @generated
	 */
	VirtualTypeContainer getModelType();

	/**
	 * Sets the value of the '{@link fr.irisa.triskell.kermeta.language.structure.VirtualType#getModelType <em>Model Type</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Type</em>' container reference.
	 * @see #getModelType()
	 * @generated
	 */
	void setModelType(VirtualTypeContainer value);

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
	 * @see fr.irisa.triskell.kermeta.language.structure.StructurePackage#getVirtualType_TypeParamBinding()
	 * @model type="fr.irisa.triskell.kermeta.language.structure.TypeVariableBinding" containment="true" resolveProxies="true"
	 * @generated
	 */
	EList getTypeParamBinding();

} // VirtualType