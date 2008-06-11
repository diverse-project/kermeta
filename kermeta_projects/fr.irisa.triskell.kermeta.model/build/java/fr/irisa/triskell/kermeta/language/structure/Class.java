/**
 * <copyright>
 * </copyright>
 *
 * $Id: Class.java,v 1.6 2008-06-11 20:26:33 cfaucher Exp $
 */
package fr.irisa.triskell.kermeta.language.structure;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Returns the Attributes, References, and derived Properties owned by
 * the ClassDefinition of this Class.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.irisa.triskell.kermeta.language.structure.Class#getOwnedAttribute <em>Owned Attribute</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.language.structure.Class#getOwnedOperation <em>Owned Operation</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.language.structure.Class#getSuperClass <em>Super Class</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.language.structure.Class#isIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.language.structure.Class#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.irisa.triskell.kermeta.language.structure.StructurePackage#getClass_()
 * @model
 * @generated
 */
public interface Class extends ParameterizedType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "IRISA / INRIA / Universite de Rennes 1";

	/**
	 * Returns the value of the '<em><b>Owned Attribute</b></em>' reference list.
	 * The list contents are of type {@link fr.irisa.triskell.kermeta.language.structure.Property}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Attribute</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns the Attributes, References, and derived Properties owned by
	 * the ClassDefinition of this Class.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Attribute</em>' reference list.
	 * @see fr.irisa.triskell.kermeta.language.structure.StructurePackage#getClass_OwnedAttribute()
	 * @model changeable="false" derived="true"
	 * @generated
	 */
	EList<Property> getOwnedAttribute();

	/**
	 * Returns the value of the '<em><b>Owned Operation</b></em>' reference list.
	 * The list contents are of type {@link fr.irisa.triskell.kermeta.language.structure.Operation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Operation</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns the Operations owned by the ClassDefinition of this Class.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Operation</em>' reference list.
	 * @see fr.irisa.triskell.kermeta.language.structure.StructurePackage#getClass_OwnedOperation()
	 * @model changeable="false" derived="true"
	 * @generated
	 */
	EList<Operation> getOwnedOperation();

	/**
	 * Returns the value of the '<em><b>Super Class</b></em>' reference list.
	 * The list contents are of type {@link fr.irisa.triskell.kermeta.language.structure.Class}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Super Class</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns the Classes of which the ClassDefinition of this Class inherits.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Super Class</em>' reference list.
	 * @see fr.irisa.triskell.kermeta.language.structure.StructurePackage#getClass_SuperClass()
	 * @model changeable="false" derived="true"
	 * @generated
	 */
	EList<Class> getSuperClass();

	/**
	 * Returns the value of the '<em><b>Is Abstract</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Abstract</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns a Boolean stating whether ClassDefinition of this Class is abstract.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Abstract</em>' attribute.
	 * @see fr.irisa.triskell.kermeta.language.structure.StructurePackage#getClass_IsAbstract()
	 * @model default="false" dataType="fr.irisa.triskell.kermeta.language.structure.Boolean" changeable="false" derived="true"
	 * @generated
	 */
	boolean isIsAbstract();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns the name of the ClassDefinition of this Class
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see fr.irisa.triskell.kermeta.language.structure.StructurePackage#getClass_Name()
	 * @model dataType="fr.irisa.triskell.kermeta.language.structure.String" changeable="false" derived="true"
	 * @generated
	 */
	String getName();

} // Class