/**
 * <copyright>
 * </copyright>
 *
 * $Id: Enumeration.java,v 1.2 2006-10-23 15:40:50 cfaucher Exp $
 */
package fr.irisa.triskell.kermeta.language.structure;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enumeration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.irisa.triskell.kermeta.language.structure.Enumeration#getOwnedLiteral <em>Owned Literal</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.irisa.triskell.kermeta.language.structure.StructurePackage#getEnumeration()
 * @model
 * @generated
 */
public interface Enumeration extends DataType {
	/**
	 * Returns the value of the '<em><b>Owned Literal</b></em>' containment reference list.
	 * The list contents are of type {@link fr.irisa.triskell.kermeta.language.structure.EnumerationLiteral}.
	 * It is bidirectional and its opposite is '{@link fr.irisa.triskell.kermeta.language.structure.EnumerationLiteral#getEnumeration <em>Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Literal</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Literal</em>' containment reference list.
	 * @see fr.irisa.triskell.kermeta.language.structure.StructurePackage#getEnumeration_OwnedLiteral()
	 * @see fr.irisa.triskell.kermeta.language.structure.EnumerationLiteral#getEnumeration
	 * @model type="fr.irisa.triskell.kermeta.language.structure.EnumerationLiteral" opposite="enumeration" containment="true" resolveProxies="true"
	 * @generated
	 */
	EList getOwnedLiteral();

} // Enumeration
