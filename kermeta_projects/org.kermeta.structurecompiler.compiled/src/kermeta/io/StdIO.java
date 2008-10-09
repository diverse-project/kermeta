/**
 * <copyright>
 * </copyright>
 *
 * $Id: StdIO.java,v 1.5 2008-10-09 08:50:25 cfaucher Exp $
 */
package kermeta.io;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Std IO</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see kermeta.io.IoPackage#getStdIO()
 * @model annotation="kermeta documentation='/**\r\n * An implementation of StdIO : standard input/output\r\n * <img src=\"platform:/plugin/fr.irisa.triskell.kermeta.documentation/src/figures/io_package.png\"/>\r\n \052/'"
 * @generated
 */
public interface StdIO extends kermeta.language.structure.Object {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model objectDataType="kermeta.standard.JavaString"
	 *        annotation="kermeta documentation='/**\r\n\t * Writeln the object to standard output\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tjava.lang.Boolean idIfCond_911 = false;\n\tidIfCond_911 = kermeta.standard.helper.StringWrapper.equals(object, null);\n\n\tif( idIfCond_911 ) {\n\n\tobject = \"<void>\";\n}\n\n\n\torg.kermeta.compil.runtime.helper.io.StdIOUtil.getInstance().writeln(object);\n'"
	 * @generated
	 */
	void writeln(String object);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model objectDataType="kermeta.standard.JavaString"
	 *        annotation="kermeta documentation='/**\r\n\t * Writeln the object to error output\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tjava.lang.Boolean idIfCond_912 = false;\n\tidIfCond_912 = kermeta.standard.helper.StringWrapper.equals(object, null);\n\n\tif( idIfCond_912 ) {\n\n\tobject = \"<void>\";\n}\n\n\n\torg.kermeta.compil.runtime.helper.io.StdIOUtil.getInstance().errorln(object);\n'"
	 * @generated
	 */
	void errorln(String object);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model objectDataType="kermeta.standard.JavaString"
	 *        annotation="kermeta documentation='/**\r\n\t * Writes the object to error output\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tjava.lang.Boolean idIfCond_913 = false;\n\tidIfCond_913 = kermeta.standard.helper.StringWrapper.equals(object, null);\n\n\tif( idIfCond_913 ) {\n\n\tobject = \"<void>\";\n}\n\n\n\torg.kermeta.compil.runtime.helper.io.StdIOUtil.getInstance().error(object);\n'"
	 * @generated
	 */
	void error(String object);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model objectDataType="kermeta.standard.JavaString"
	 *        annotation="kermeta documentation='/**\r\n\t * Writes the object to standard output\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tjava.lang.Boolean idIfCond_914 = false;\n\tidIfCond_914 = kermeta.standard.helper.StringWrapper.equals(object, null);\n\n\tif( idIfCond_914 ) {\n\n\tobject = \"<void>\";\n}\n\n\n\torg.kermeta.compil.runtime.helper.io.StdIOUtil.getInstance().write(object);\n'"
	 * @generated
	 */
	void write(String object);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaString" promptDataType="kermeta.standard.JavaString"
	 *        annotation="kermeta documentation='/**\r\n\t * Reads a String from standard input\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.String result = null;\n\n\tjava.lang.Boolean idIfCond_915 = false;\n\tidIfCond_915 = kermeta.standard.helper.StringWrapper.equals(prompt, null);\n\n\tif( idIfCond_915 ) {\n\n\tprompt = \"\";\n}\n\n\n\tresult = (java.lang.String) org.kermeta.compil.runtime.helper.io.StdIOUtil.getInstance().read(prompt);\n\nreturn result;\n'"
	 * @generated
	 */
	String read(String prompt);

} // StdIO
