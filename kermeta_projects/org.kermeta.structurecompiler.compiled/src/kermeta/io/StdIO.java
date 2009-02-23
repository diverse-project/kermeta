/**
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * 
 * Generating with Kermeta <http://www.kermeta.org>
 *
 * $Id: StdIO.java,v 1.13 2009-02-23 15:26:57 cfaucher Exp $
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tjava.lang.Boolean idIfCond_986 = false;\n\tidIfCond_986 = kermeta.standard.helper.StringWrapper.equals(object, null);\n\n\tif( idIfCond_986 ) {\n\n\tobject = \"<void>\";\n}\n\n\n\torg.kermeta.compil.runtime.helper.io.StdIOUtil.writeln(object);\n'"
	 * @generated
	 */
	void writeln(String object);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model objectDataType="kermeta.standard.JavaString"
	 *        annotation="kermeta documentation='/**\r\n\t * Writeln the object to error output\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tjava.lang.Boolean idIfCond_987 = false;\n\tidIfCond_987 = kermeta.standard.helper.StringWrapper.equals(object, null);\n\n\tif( idIfCond_987 ) {\n\n\tobject = \"<void>\";\n}\n\n\n\torg.kermeta.compil.runtime.helper.io.StdIOUtil.errorln(object);\n'"
	 * @generated
	 */
	void errorln(String object);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model objectDataType="kermeta.standard.JavaString"
	 *        annotation="kermeta documentation='/**\r\n\t * Writes the object to error output\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tjava.lang.Boolean idIfCond_988 = false;\n\tidIfCond_988 = kermeta.standard.helper.StringWrapper.equals(object, null);\n\n\tif( idIfCond_988 ) {\n\n\tobject = \"<void>\";\n}\n\n\n\torg.kermeta.compil.runtime.helper.io.StdIOUtil.error(object);\n'"
	 * @generated
	 */
	void error(String object);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model objectDataType="kermeta.standard.JavaString"
	 *        annotation="kermeta documentation='/**\r\n\t * Writes the object to standard output\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tjava.lang.Boolean idIfCond_989 = false;\n\tidIfCond_989 = kermeta.standard.helper.StringWrapper.equals(object, null);\n\n\tif( idIfCond_989 ) {\n\n\tobject = \"<void>\";\n}\n\n\n\torg.kermeta.compil.runtime.helper.io.StdIOUtil.write(object);\n'"
	 * @generated
	 */
	void write(String object);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaString" promptDataType="kermeta.standard.JavaString"
	 *        annotation="kermeta documentation='/**\r\n\t * Reads a String from standard input\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.String result = null;\n\n\tjava.lang.Boolean idIfCond_990 = false;\n\tidIfCond_990 = kermeta.standard.helper.StringWrapper.equals(prompt, null);\n\n\tif( idIfCond_990 ) {\n\n\tprompt = \"\";\n}\n\n\n\tresult = (java.lang.String) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeOrVoid(org.kermeta.compil.runtime.helper.io.StdIOUtil.read(prompt), \"java.lang.String\");\n\nreturn result;\n'"
	 * @generated
	 */
	String read(String prompt);

} // StdIO
