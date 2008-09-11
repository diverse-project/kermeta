/**
 * <copyright>
 * </copyright>
 *
 * $Id: UnknownJavaObject.java,v 1.2 2008-09-11 12:34:45 cfaucher Exp $
 */
package kermeta.standard;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unknown Java Object</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see kermeta.standard.StandardPackage#getUnknownJavaObject()
 * @model annotation="kermeta documentation='/** \n  * This special object is used to represent java objects that cannot be concretely used with kermeta\n  * <b>the only actions possible on these objects are : assignment and passing them as parameter</b>\n  * <img src=\"platform:/plugin/fr.irisa.triskell.kermeta.documentation/src/figures/java_package.png\"/>\n  \052/'"
 * @generated
 */
public interface UnknownJavaObject extends kermeta.language.structure.Object {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaString"
	 *        annotation="kermeta documentation='/**\n \t * NOT IMPLEMENTED\n \t \052/'"
	 *        annotation="kermeta superOperation='kermeta::language::structure::Object'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.String result = null;\n\n\tresult = \"toString of  UnknownJavaObject not implemented yet\";\n\nreturn result;\n'"
	 * @generated
	 */
	String toString();

} // UnknownJavaObject
