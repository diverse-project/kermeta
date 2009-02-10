/**
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * 
 * Generating with Kermeta <http://www.kermeta.org>
 *
 * $Id: IdentifierHelper.java,v 1.11 2009-02-10 17:51:55 cfaucher Exp $
 */
package km2ecore.helper.java;

import km2ecore.KM2EcoreContext;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Identifier Helper</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see km2ecore.helper.java.JavaPackage#getIdentifierHelper()
 * @model
 * @generated
 */
public interface IdentifierHelper extends kermeta.language.structure.Object {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaString" idDataType="kermeta.standard.JavaString"
	 *        annotation="kermeta documentation='/** An underscore is added if the identifier is used as keyword \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.String result = null;\n\n\tjava.lang.Boolean idIfCond_33 = false;\n\tidIfCond_33 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(id);\n\n\tif( idIfCond_33 ) {\n\n\tresult = id;\n}\n\n\n\tjava.lang.Boolean idIfCond_34 = false;\n\tidIfCond_34 = context.getJavaKeyWordList().isKeyword(id);\n\n\tif( idIfCond_34 ) {\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(\"_\", id);\n}\n else {\n\n\tresult = id;\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	String getMangledIdentifier(String id, KM2EcoreContext context);

} // IdentifierHelper
