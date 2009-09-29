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
 * A representation of the model object '<em><b>Enumeration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kermeta.language.structure.Enumeration#getOwnedLiteral <em>Owned Literal</em>}</li>
 * </ul>
 * </p>
 *
 * @see kermeta.language.structure.StructurePackage#getEnumeration()
 * @model annotation="kermeta ecore='true'"
 *        annotation="kermeta documentation='Definition for Enumeration'"
 * @generated
 */
public interface Enumeration extends DataType {
	/**
	 * Returns the value of the '<em><b>Owned Literal</b></em>' containment reference list.
	 * The list contents are of type {@link kermeta.language.structure.EnumerationLiteral}.
	 * It is bidirectional and its opposite is '{@link kermeta.language.structure.EnumerationLiteral#getEnumeration <em>Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Literal</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Literal</em>' containment reference list.
	 * @see kermeta.language.structure.StructurePackage#getEnumeration_OwnedLiteral()
	 * @see kermeta.language.structure.EnumerationLiteral#getEnumeration
	 * @model opposite="enumeration" containment="true" resolveProxies="true"
	 *        annotation="kermeta ecore='true'"
	 *        annotation="kermeta documentation='Owned items in an Enumeration'"
	 * @generated
	 */
	EList<EnumerationLiteral> getOwnedLiteral();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\n\t * Implements kermeta::language::structure::Type.clone(Object)\n\t \052/'"
	 *        annotation="kermeta superOperation='kermeta::language::structure::Type'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.language.structure.Object result = null;\n\n\t\nif (true)\n\tthrow new org.kermeta.compil.runtime.helper.error.KRuntimeError( \"NOT IMPLEMENTED\" );\n\n\nreturn result;\n'"
	 * @generated
	 */
	kermeta.language.structure.Object clone(
			kermeta.language.structure.Object objectToClone);

} // Enumeration
