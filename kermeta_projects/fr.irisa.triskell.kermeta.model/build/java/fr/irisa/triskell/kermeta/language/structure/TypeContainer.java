/**
 * <copyright>
 * </copyright>
 *
 * $Id: TypeContainer.java,v 1.7 2008-03-19 16:34:13 cfaucher Exp $
 */
package fr.irisa.triskell.kermeta.language.structure;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Phantom class : EMF reflexive editors need that any element of a metamodel 
 * has a direct or indirect containment relationship with the root model element of
 * the metamodel. This class resolves this technical requirement.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.irisa.triskell.kermeta.language.structure.TypeContainer#getContainedType <em>Contained Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.irisa.triskell.kermeta.language.structure.StructurePackage#getTypeContainer()
 * @model abstract="true"
 * @generated
 */
public interface TypeContainer extends fr.irisa.triskell.kermeta.language.structure.Object {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "IRISA / INRIA / Universite de Rennes 1";

	/**
	 * Returns the value of the '<em><b>Contained Type</b></em>' containment reference list.
	 * The list contents are of type {@link fr.irisa.triskell.kermeta.language.structure.Type}.
	 * It is bidirectional and its opposite is '{@link fr.irisa.triskell.kermeta.language.structure.Type#getTypeContainer <em>Type Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contained Type</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Contained types
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contained Type</em>' containment reference list.
	 * @see fr.irisa.triskell.kermeta.language.structure.StructurePackage#getTypeContainer_ContainedType()
	 * @see fr.irisa.triskell.kermeta.language.structure.Type#getTypeContainer
	 * @model opposite="typeContainer" containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<Type> getContainedType();

} // TypeContainer