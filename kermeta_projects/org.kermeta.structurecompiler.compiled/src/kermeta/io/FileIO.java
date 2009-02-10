/**
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * 
 * Generating with Kermeta <http://www.kermeta.org>
 *
 * $Id: FileIO.java,v 1.11 2009-02-10 17:52:00 cfaucher Exp $
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tjava.lang.Boolean idIfCond_1085 = false;\n\tidIfCond_1085 = kermeta.standard.helper.StringWrapper.equals(filename, null);\n\n\tif( idIfCond_1085 ) {\n\n\t\nif (true)\n\tthrow new org.kermeta.compil.runtime.helper.error.KRuntimeError( ((kermeta.exceptions.FileNotFoundException) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.exceptions.ExceptionsPackage.eINSTANCE.getFileNotFoundException())) );\n\n}\n\n\n\torg.kermeta.compil.runtime.helper.io.SimpleFileIOUtil.writeTextFile(filename, text);\n'"
	 * @generated
	 */
	void writeTextFile(String filename, String text);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaString" filenameDataType="kermeta.standard.JavaString"
	 *        annotation="kermeta documentation='/**\r\n\t * Reads a text file\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.String result = null;\n\n\tjava.lang.Boolean idIfCond_1086 = false;\n\tidIfCond_1086 = kermeta.standard.helper.StringWrapper.equals(filename, null);\n\n\tif( idIfCond_1086 ) {\n\n\t\nif (true)\n\tthrow new org.kermeta.compil.runtime.helper.error.KRuntimeError( ((kermeta.exceptions.FileNotFoundException) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.exceptions.ExceptionsPackage.eINSTANCE.getFileNotFoundException())) );\n\n}\n\n\n\tjava.lang.Boolean exists = null;\n\n\tjava.lang.Boolean isdirectory = null;\n\n\texists = (java.lang.Boolean) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeOrVoid(org.kermeta.compil.runtime.helper.io.SimpleFileIOUtil.fileExists(filename), \"java.lang.Boolean\");\n\n\tisdirectory = (java.lang.Boolean) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeOrVoid(org.kermeta.compil.runtime.helper.io.SimpleFileIOUtil.fileIsDirectory(filename), \"java.lang.Boolean\");\n\n\tjava.lang.Boolean idIfCond_1087 = false;\n\tidIfCond_1087 = kermeta.standard.helper.BooleanWrapper.not(exists);\n\n\tif( idIfCond_1087 ) {\n\n\tkermeta.exceptions.FileNotFoundException e = ((kermeta.exceptions.FileNotFoundException) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.exceptions.ExceptionsPackage.eINSTANCE.getFileNotFoundException()));\n\n\te.setMessage(filename);\n\n\t\nif (true)\n\tthrow new org.kermeta.compil.runtime.helper.error.KRuntimeError( e );\n\n}\n\n\n\tjava.lang.Boolean idIfCond_1088 = false;\n\tidIfCond_1088 = isdirectory;\n\n\tif( idIfCond_1088 ) {\n\n\tkermeta.exceptions.FileNotFoundException e = ((kermeta.exceptions.FileNotFoundException) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.exceptions.ExceptionsPackage.eINSTANCE.getFileNotFoundException()));\n\n\te.setMessage(kermeta.standard.helper.StringWrapper.plus(filename, \" is not a file\"));\n\n\t\nif (true)\n\tthrow new org.kermeta.compil.runtime.helper.error.KRuntimeError( e );\n\n}\n\n\n\tresult = (java.lang.String) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeOrVoid(org.kermeta.compil.runtime.helper.io.SimpleFileIOUtil.readTextFile(filename), \"java.lang.String\");\n\nreturn result;\n'"
	 * @generated
	 */
	String readTextFile(String filename);

} // FileIO
