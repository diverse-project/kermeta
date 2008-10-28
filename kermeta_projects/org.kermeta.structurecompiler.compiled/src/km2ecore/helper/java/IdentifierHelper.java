/**
 * <copyright>
 * </copyright>
 *
 * $Id: IdentifierHelper.java,v 1.6 2008-10-28 13:18:24 cfaucher Exp $
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.String result = null;\n\n\tjava.lang.Boolean idIfCond_1060 = false;\n\tidIfCond_1060 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(id);\n\n\tif( idIfCond_1060 ) {\n\n\tresult = id;\n}\n\n\n\tjava.lang.Boolean idIfCond_1061 = false;\n\tidIfCond_1061 = context.getJavaKeyWordList().isKeyword(id);\n\n\tif( idIfCond_1061 ) {\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(\"_\", id);\n}\n else {\n\n\tresult = id;\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	String getMangledIdentifier(String id, KM2EcoreContext context);

} // IdentifierHelper
