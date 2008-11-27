/**
 * <copyright>
 * </copyright>
 *
 * $Id: TypeContainer.java,v 1.9 2008-11-27 15:50:02 cfaucher Exp $
 */
package kermeta.language.structure;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kermeta.language.structure.TypeContainer#getContainedType <em>Contained Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see kermeta.language.structure.StructurePackage#getTypeContainer()
 * @model abstract="true"
 *        annotation="kermeta documentation='Phantom class : EMF reflexive editors need that any element of a metamodel \nhas a direct or indirect containment relationship with the root model element of\nthe metamodel. This class resolves this technical requirement.'"
 * @generated
 */
public interface TypeContainer extends kermeta.language.structure.Object {
	/**
	 * Returns the value of the '<em><b>Contained Type</b></em>' containment reference list.
	 * The list contents are of type {@link kermeta.language.structure.Type}.
	 * It is bidirectional and its opposite is '{@link kermeta.language.structure.Type#getTypeContainer <em>Type Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contained Type</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contained Type</em>' containment reference list.
	 * @see kermeta.language.structure.StructurePackage#getTypeContainer_ContainedType()
	 * @see kermeta.language.structure.Type#getTypeContainer
	 * @model opposite="typeContainer" containment="true" resolveProxies="true"
	 *        annotation="kermeta documentation='Contained types'"
	 * @generated
	 */
	EList<Type> getContainedType();

} // TypeContainer
