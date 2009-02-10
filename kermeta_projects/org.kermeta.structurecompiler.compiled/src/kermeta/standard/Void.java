/**
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * 
 * Generating with Kermeta <http://www.kermeta.org>
 *
 * $Id: Void.java,v 1.11 2009-02-10 17:51:50 cfaucher Exp $
 */
package kermeta.standard;

import java.lang.Boolean;
import java.lang.String;

import kermeta.language.structure.Type;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Void</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see kermeta.standard.StandardPackage#getVoid()
 * @model annotation="kermeta documentation='/**\r\n * The class Void \r\n * By convention it is a sub-type of everything\r\n \052/'"
 * @generated
 */
public interface Void extends kermeta.language.structure.Object {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="kermeta.standard.JavaBoolean"
	 *        annotation="kermeta documentation='/**\r\n\t * Return true\r\n\t \052/'"
	 *        annotation="kermeta superOperation='kermeta::language::structure::Object'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = true;\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean isVoid();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaBoolean"
	 *        annotation="kermeta documentation='/**\r\n\t * Returns true\r\n\t \052/'"
	 *        annotation="kermeta superOperation='kermeta::language::structure::Object'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = true;\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean isInstanceOf(Type type);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaString"
	 *        annotation="kermeta documentation='/**\r\n\t * Returns the String identifier \'<void>\'\r\n\t \052/'"
	 *        annotation="kermeta superOperation='kermeta::language::structure::Object'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.String result = null;\n\n\tresult = \"<void>\";\n\nreturn result;\n'"
	 * @generated
	 */
	String toString();

} // Void
