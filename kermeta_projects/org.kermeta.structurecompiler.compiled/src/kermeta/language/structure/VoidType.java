/**
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * 
 * Generating with Kermeta <http://www.kermeta.org>
 *
 * $Id: VoidType.java,v 1.12 2009-02-23 15:26:48 cfaucher Exp $
 */
package kermeta.language.structure;

import km2ecore.KM2EcoreContext;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Void Type</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see kermeta.language.structure.StructurePackage#getVoidType()
 * @model annotation="kermeta documentation='Class definition for the <pre>Void</pre> type'"
 *        annotation="kermeta documentation='/** Complete \052/'"
 * @generated
 */
public interface VoidType extends Type {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaString"
	 *        annotation="kermeta superOperation='kermeta::language::structure::Type'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.String result = null;\n\n\tresult = \"null\";\n\nreturn result;\n'"
	 * @generated
	 */
	String createBehaviorJava(KM2EcoreContext context);

} // VoidType
