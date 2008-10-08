/**
 * <copyright>
 * </copyright>
 *
 * $Id: FileIO.java,v 1.4 2008-10-08 14:38:05 cfaucher Exp $
 */
package kermeta.io;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>File IO</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see kermeta.io.IoPackage#getFileIO()
 * @model annotation="kermeta documentation='/**\r\n * Implementation of simple helpers to read ans write text files\r\n * <img src=\"platform:/plugin/fr.irisa.triskell.kermeta.documentation/src/figures/io_package.png\"/>\r\n \052/'"
 * @generated
 */
public interface FileIO extends kermeta.language.structure.Object {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model filenameDataType="kermeta.standard.JavaString" textDataType="kermeta.standard.JavaString"
	 *        annotation="kermeta documentation='/**\r\n\t * Writes a String in a text file\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tjava.lang.Boolean idIfCond_916 = false;\n\tidIfCond_916 = kermeta.standard.helper.StringWrapper.equals(filename, null);\n\n\tif( idIfCond_916 ) {\n\n\t\nif (true)\n\tthrow new org.kermeta.compil.runtime.helper.error.KRuntimeError( ((kermeta.exceptions.FileNotFoundException) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.exceptions.FileNotFoundException\")) );\n\n}\n\n\n\torg.kermeta.compil.runtime.helper.io.SimpleFileIOUtil.writeTextFile(filename, text);\n'"
	 * @generated
	 */
	void writeTextFile(String filename, String text);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaString" filenameDataType="kermeta.standard.JavaString"
	 *        annotation="kermeta documentation='/**\r\n\t * Reads a text file\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.String result = null;\n\n\tjava.lang.Boolean idIfCond_917 = false;\n\tidIfCond_917 = kermeta.standard.helper.StringWrapper.equals(filename, null);\n\n\tif( idIfCond_917 ) {\n\n\t\nif (true)\n\tthrow new org.kermeta.compil.runtime.helper.error.KRuntimeError( ((kermeta.exceptions.FileNotFoundException) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.exceptions.FileNotFoundException\")) );\n\n}\n\n\n\tjava.lang.Boolean exists = null;\n\n\tjava.lang.Boolean isdirectory = null;\n\n\texists = (java.lang.Boolean) org.kermeta.compil.runtime.helper.io.SimpleFileIOUtil.fileExists(filename);\n\n\tisdirectory = (java.lang.Boolean) org.kermeta.compil.runtime.helper.io.SimpleFileIOUtil.fileIsDirectory(filename);\n\n\tjava.lang.Boolean idIfCond_918 = false;\n\tidIfCond_918 = kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.BooleanWrapper.not(exists), isdirectory);\n\n\tif( idIfCond_918 ) {\n\n\t\nif (true)\n\tthrow new org.kermeta.compil.runtime.helper.error.KRuntimeError( ((kermeta.exceptions.FileNotFoundException) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.exceptions.FileNotFoundException\")) );\n\n}\n\n\n\tresult = (java.lang.String) org.kermeta.compil.runtime.helper.io.SimpleFileIOUtil.readTextFile(filename);\n\nreturn result;\n'"
	 * @generated
	 */
	String readTextFile(String filename);

} // FileIO
