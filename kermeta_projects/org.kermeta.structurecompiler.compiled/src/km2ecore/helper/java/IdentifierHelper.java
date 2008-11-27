/**
 * <copyright>
 * </copyright>
 *
 * $Id: IdentifierHelper.java,v 1.9 2008-11-27 15:50:07 cfaucher Exp $
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.String result = null;\n\n\tjava.lang.Boolean idIfCond_1097 = false;\n\tidIfCond_1097 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(id);\n\n\tif( idIfCond_1097 ) {\n\n\tresult = id;\n}\n\n\n\tjava.lang.Boolean idIfCond_1098 = false;\n\tidIfCond_1098 = context.getJavaKeyWordList().isKeyword(id);\n\n\tif( idIfCond_1098 ) {\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(\"_\", id);\n}\n else {\n\n\tresult = id;\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	String getMangledIdentifier(String id, KM2EcoreContext context);

} // IdentifierHelper
