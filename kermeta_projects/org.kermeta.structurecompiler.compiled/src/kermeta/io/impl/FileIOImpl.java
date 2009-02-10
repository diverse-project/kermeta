/**
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * 
 * Generating with Kermeta <http://www.kermeta.org>
 *
 * $Id: FileIOImpl.java,v 1.11 2009-02-10 17:51:49 cfaucher Exp $
 */
package kermeta.io.impl;

import kermeta.io.FileIO;
import kermeta.io.IoPackage;

import kermeta.language.structure.impl.ObjectImpl;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>File IO</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class FileIOImpl extends ObjectImpl implements FileIO {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FileIOImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IoPackage.Literals.FILE_IO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void writeTextFile(String filename, String text) {

		java.lang.Boolean idIfCond_1085 = false;
		idIfCond_1085 = kermeta.standard.helper.StringWrapper.equals(filename,
				null);

		if (idIfCond_1085) {

			if (true)
				throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
						((kermeta.exceptions.FileNotFoundException) org.kermeta.compil.runtime.helper.language.ClassUtil
								.newObject(kermeta.exceptions.ExceptionsPackage.eINSTANCE
										.getFileNotFoundException())));

		}

		org.kermeta.compil.runtime.helper.io.SimpleFileIOUtil.writeTextFile(
				filename, text);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String readTextFile(String filename) {

		java.lang.String result = null;

		java.lang.Boolean idIfCond_1086 = false;
		idIfCond_1086 = kermeta.standard.helper.StringWrapper.equals(filename,
				null);

		if (idIfCond_1086) {

			if (true)
				throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
						((kermeta.exceptions.FileNotFoundException) org.kermeta.compil.runtime.helper.language.ClassUtil
								.newObject(kermeta.exceptions.ExceptionsPackage.eINSTANCE
										.getFileNotFoundException())));

		}

		java.lang.Boolean exists = null;

		java.lang.Boolean isdirectory = null;

		exists = (java.lang.Boolean) org.kermeta.compil.runtime.helper.language.ObjectUtil
				.asTypeOrVoid(
						org.kermeta.compil.runtime.helper.io.SimpleFileIOUtil
								.fileExists(filename), "java.lang.Boolean");

		isdirectory = (java.lang.Boolean) org.kermeta.compil.runtime.helper.language.ObjectUtil
				.asTypeOrVoid(
						org.kermeta.compil.runtime.helper.io.SimpleFileIOUtil
								.fileIsDirectory(filename), "java.lang.Boolean");

		java.lang.Boolean idIfCond_1087 = false;
		idIfCond_1087 = kermeta.standard.helper.BooleanWrapper.not(exists);

		if (idIfCond_1087) {

			kermeta.exceptions.FileNotFoundException e = ((kermeta.exceptions.FileNotFoundException) org.kermeta.compil.runtime.helper.language.ClassUtil
					.newObject(kermeta.exceptions.ExceptionsPackage.eINSTANCE
							.getFileNotFoundException()));

			e.setMessage(filename);

			if (true)
				throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
						e);

		}

		java.lang.Boolean idIfCond_1088 = false;
		idIfCond_1088 = isdirectory;

		if (idIfCond_1088) {

			kermeta.exceptions.FileNotFoundException e = ((kermeta.exceptions.FileNotFoundException) org.kermeta.compil.runtime.helper.language.ClassUtil
					.newObject(kermeta.exceptions.ExceptionsPackage.eINSTANCE
							.getFileNotFoundException()));

			e.setMessage(kermeta.standard.helper.StringWrapper.plus(filename,
					" is not a file"));

			if (true)
				throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
						e);

		}

		result = (java.lang.String) org.kermeta.compil.runtime.helper.language.ObjectUtil
				.asTypeOrVoid(
						org.kermeta.compil.runtime.helper.io.SimpleFileIOUtil
								.readTextFile(filename), "java.lang.String");

		return result;

	}

} //FileIOImpl
