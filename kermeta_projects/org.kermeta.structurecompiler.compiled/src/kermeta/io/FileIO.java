/**
 * <copyright>
 * </copyright>
 *
 * $Id: FileIO.java,v 1.9 2008-11-27 15:50:17 cfaucher Exp $
 */
package kermeta.io;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>File IO</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see kermeta.io.IoPackage#getFileIO()
 * @model annotation="kermeta documentation='/**\n * Implementation of simple helpers to read ans write text files\n * <img src=\"platform:/plugin/fr.irisa.triskell.kermeta.documentation/src/figures/io_package.png\"/>\n \052/'"
 * @generated
 */
public interface FileIO extends kermeta.language.structure.Object {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model filenameDataType="kermeta.standard.JavaString" textDataType="kermeta.standard.JavaString"
	 *        annotation="kermeta documentation='/**\n\t * Writes a String in a text file\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tjava.lang.Boolean idIfCond_1005 = false;\n\tidIfCond_1005 = kermeta.standard.helper.StringWrapper.equals(filename, null);\n\n\tif( idIfCond_1005 ) {\n\n\t\nif (true)\n\tthrow new org.kermeta.compil.runtime.helper.error.KRuntimeError( ((kermeta.exceptions.FileNotFoundException) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.exceptions.FileNotFoundException\")) );\n\n}\n\n\n\torg.kermeta.compil.runtime.helper.io.SimpleFileIOUtil.writeTextFile(filename, text);\n'"
	 * @generated
	 */
	void writeTextFile(String filename, String text);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaString" filenameDataType="kermeta.standard.JavaString"
	 *        annotation="kermeta documentation='/**\n\t * Reads a text file\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.String result = null;\n\n\tjava.lang.Boolean idIfCond_1006 = false;\n\tidIfCond_1006 = kermeta.standard.helper.StringWrapper.equals(filename, null);\n\n\tif( idIfCond_1006 ) {\n\n\t\nif (true)\n\tthrow new org.kermeta.compil.runtime.helper.error.KRuntimeError( ((kermeta.exceptions.FileNotFoundException) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.exceptions.FileNotFoundException\")) );\n\n}\n\n\n\tjava.lang.Boolean exists = null;\n\n\tjava.lang.Boolean isdirectory = null;\n\n\texists = (java.lang.Boolean) org.kermeta.compil.runtime.ExecutionContext.getInstance().<java.lang.Boolean>asTypeOrVoid(org.kermeta.compil.runtime.helper.io.SimpleFileIOUtil.fileExists(filename));\n\n\tisdirectory = (java.lang.Boolean) org.kermeta.compil.runtime.ExecutionContext.getInstance().<java.lang.Boolean>asTypeOrVoid(org.kermeta.compil.runtime.helper.io.SimpleFileIOUtil.fileIsDirectory(filename));\n\n\tjava.lang.Boolean idIfCond_1007 = false;\n\tidIfCond_1007 = kermeta.standard.helper.BooleanWrapper.not(exists);\n\n\tif( idIfCond_1007 ) {\n\n\tkermeta.exceptions.FileNotFoundException e = ((kermeta.exceptions.FileNotFoundException) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.exceptions.FileNotFoundException\"));\n\n\te.setMessage(filename);\n\n\t\nif (true)\n\tthrow new org.kermeta.compil.runtime.helper.error.KRuntimeError( e );\n\n}\n\n\n\tjava.lang.Boolean idIfCond_1008 = false;\n\tidIfCond_1008 = isdirectory;\n\n\tif( idIfCond_1008 ) {\n\n\tkermeta.exceptions.FileNotFoundException e = ((kermeta.exceptions.FileNotFoundException) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.exceptions.FileNotFoundException\"));\n\n\te.setMessage(kermeta.standard.helper.StringWrapper.plus(filename, \" is not a file\"));\n\n\t\nif (true)\n\tthrow new org.kermeta.compil.runtime.helper.error.KRuntimeError( e );\n\n}\n\n\n\tresult = (java.lang.String) org.kermeta.compil.runtime.ExecutionContext.getInstance().<java.lang.String>asTypeOrVoid(org.kermeta.compil.runtime.helper.io.SimpleFileIOUtil.readTextFile(filename));\n\nreturn result;\n'"
	 * @generated
	 */
	String readTextFile(String filename);

} // FileIO
