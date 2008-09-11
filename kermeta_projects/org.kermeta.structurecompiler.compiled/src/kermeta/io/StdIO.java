/**
 * <copyright>
 * </copyright>
 *
 * $Id: StdIO.java,v 1.2 2008-09-11 12:34:53 cfaucher Exp $
 */
package kermeta.io;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Std IO</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see kermeta.io.IoPackage#getStdIO()
 * @model annotation="kermeta documentation='/**\n * An implementation of StdIO : standard input/output\n * <img src=\"platform:/plugin/fr.irisa.triskell.kermeta.documentation/src/figures/io_package.png\"/>\n \052/'"
 * @generated
 */
public interface StdIO extends kermeta.language.structure.Object {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model objectDataType="kermeta.standard.JavaString"
	 *        annotation="kermeta documentation='/**\n\t * Writeln the object to standard output\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tjava.lang.Boolean idIfCond_607 = false;\n\tidIfCond_607 = kermeta.standard.helper.StringWrapper.equals(object, null);\n\n\tif( idIfCond_607 ) {\n\n\tobject = \"<void>\";\n}\n\n\n\torg.kermeta.compil.runtime.helper.io.StdIOUtil.writeln(object);\n'"
	 * @generated
	 */
	void writeln(String object);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model objectDataType="kermeta.standard.JavaString"
	 *        annotation="kermeta documentation='/**\n\t * Writeln the object to error output\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tjava.lang.Boolean idIfCond_608 = false;\n\tidIfCond_608 = kermeta.standard.helper.StringWrapper.equals(object, null);\n\n\tif( idIfCond_608 ) {\n\n\tobject = \"<void>\";\n}\n\n\n\torg.kermeta.compil.runtime.helper.io.StdIOUtil.errorln(object);\n'"
	 * @generated
	 */
	void errorln(String object);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model objectDataType="kermeta.standard.JavaString"
	 *        annotation="kermeta documentation='/**\n\t * Writes the object to error output\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tjava.lang.Boolean idIfCond_609 = false;\n\tidIfCond_609 = kermeta.standard.helper.StringWrapper.equals(object, null);\n\n\tif( idIfCond_609 ) {\n\n\tobject = \"<void>\";\n}\n\n\n\torg.kermeta.compil.runtime.helper.io.StdIOUtil.error(object);\n'"
	 * @generated
	 */
	void error(String object);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model objectDataType="kermeta.standard.JavaString"
	 *        annotation="kermeta documentation='/**\n\t * Writes the object to standard output\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tjava.lang.Boolean idIfCond_610 = false;\n\tidIfCond_610 = kermeta.standard.helper.StringWrapper.equals(object, null);\n\n\tif( idIfCond_610 ) {\n\n\tobject = \"<void>\";\n}\n\n\n\torg.kermeta.compil.runtime.helper.io.StdIOUtil.write(object);\n'"
	 * @generated
	 */
	void write(String object);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaString" promptDataType="kermeta.standard.JavaString"
	 *        annotation="kermeta documentation='/**\n\t * Reads a String from standard input\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.String result = null;\n\n\tjava.lang.Boolean idIfCond_611 = false;\n\tidIfCond_611 = kermeta.standard.helper.StringWrapper.equals(prompt, null);\n\n\tif( idIfCond_611 ) {\n\n\tprompt = \"\";\n}\n\n\n\tresult = (java.lang.String) org.kermeta.compil.runtime.helper.io.StdIOUtil.read(prompt);\n\nreturn result;\n'"
	 * @generated
	 */
	String read(String prompt);

} // StdIO
