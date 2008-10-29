/**
 * <copyright>
 * </copyright>
 *
 * $Id: IdentifierHelper.java,v 1.7 2008-10-29 08:29:19 cfaucher Exp $
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.String result = null;\n\n\tjava.lang.Boolean idIfCond_1082 = false;\n\tidIfCond_1082 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(id);\n\n\tif( idIfCond_1082 ) {\n\n\tresult = id;\n}\n\n\n\tjava.lang.Boolean idIfCond_1083 = false;\n\tidIfCond_1083 = context.getJavaKeyWordList().isKeyword(id);\n\n\tif( idIfCond_1083 ) {\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(\"_\", id);\n}\n else {\n\n\tresult = id;\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	String getMangledIdentifier(String id, KM2EcoreContext context);

} // IdentifierHelper
