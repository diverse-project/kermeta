/**
 * <copyright>
 * </copyright>
 *
 * $Id: StdIO.java,v 1.3 2008-09-22 14:46:10 cfaucher Exp $
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tjava.lang.Boolean idIfCond_931 = false;\n\tidIfCond_931 = kermeta.standard.helper.StringWrapper.equals(object, null);\n\n\tif( idIfCond_931 ) {\n\n\tobject = \"<void>\";\n}\n\n\n\torg.kermeta.compil.runtime.helper.io.StdIOUtil.writeln(object);\n'"
	 * @generated
	 */
	void writeln(String object);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model objectDataType="kermeta.standard.JavaString"
	 *        annotation="kermeta documentation='/**\r\n\t * Writeln the object to error output\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tjava.lang.Boolean idIfCond_932 = false;\n\tidIfCond_932 = kermeta.standard.helper.StringWrapper.equals(object, null);\n\n\tif( idIfCond_932 ) {\n\n\tobject = \"<void>\";\n}\n\n\n\torg.kermeta.compil.runtime.helper.io.StdIOUtil.errorln(object);\n'"
	 * @generated
	 */
	void errorln(String object);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model objectDataType="kermeta.standard.JavaString"
	 *        annotation="kermeta documentation='/**\r\n\t * Writes the object to error output\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tjava.lang.Boolean idIfCond_933 = false;\n\tidIfCond_933 = kermeta.standard.helper.StringWrapper.equals(object, null);\n\n\tif( idIfCond_933 ) {\n\n\tobject = \"<void>\";\n}\n\n\n\torg.kermeta.compil.runtime.helper.io.StdIOUtil.error(object);\n'"
	 * @generated
	 */
	void error(String object);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model objectDataType="kermeta.standard.JavaString"
	 *        annotation="kermeta documentation='/**\r\n\t * Writes the object to standard output\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tjava.lang.Boolean idIfCond_934 = false;\n\tidIfCond_934 = kermeta.standard.helper.StringWrapper.equals(object, null);\n\n\tif( idIfCond_934 ) {\n\n\tobject = \"<void>\";\n}\n\n\n\torg.kermeta.compil.runtime.helper.io.StdIOUtil.write(object);\n'"
	 * @generated
	 */
	void write(String object);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaString" promptDataType="kermeta.standard.JavaString"
	 *        annotation="kermeta documentation='/**\r\n\t * Reads a String from standard input\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.String result = null;\n\n\tjava.lang.Boolean idIfCond_935 = false;\n\tidIfCond_935 = kermeta.standard.helper.StringWrapper.equals(prompt, null);\n\n\tif( idIfCond_935 ) {\n\n\tprompt = \"\";\n}\n\n\n\tresult = (java.lang.String) org.kermeta.compil.runtime.helper.io.StdIOUtil.read(prompt);\n\nreturn result;\n'"
	 * @generated
	 */
	String read(String prompt);

} // StdIO
