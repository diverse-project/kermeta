/**
 * <copyright>
 * </copyright>
 *
 * $Id: FileIOImpl.java,v 1.9 2008-11-27 15:49:53 cfaucher Exp $
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

		java.lang.Boolean idIfCond_1005 = false;
		idIfCond_1005 = kermeta.standard.helper.StringWrapper.equals(filename,
				null);

		if (idIfCond_1005) {

			if (true)
				throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
						((kermeta.exceptions.FileNotFoundException) org.kermeta.compil.runtime.helper.language.ClassUtil
								.newObject("kermeta.exceptions.FileNotFoundException")));

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

		java.lang.Boolean idIfCond_1006 = false;
		idIfCond_1006 = kermeta.standard.helper.StringWrapper.equals(filename,
				null);

		if (idIfCond_1006) {

			if (true)
				throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
						((kermeta.exceptions.FileNotFoundException) org.kermeta.compil.runtime.helper.language.ClassUtil
								.newObject("kermeta.exceptions.FileNotFoundException")));

		}

		java.lang.Boolean exists = null;

		java.lang.Boolean isdirectory = null;

		exists = (java.lang.Boolean) org.kermeta.compil.runtime.ExecutionContext
				.getInstance().<java.lang.Boolean> asTypeOrVoid(
						org.kermeta.compil.runtime.helper.io.SimpleFileIOUtil
								.fileExists(filename));

		isdirectory = (java.lang.Boolean) org.kermeta.compil.runtime.ExecutionContext
				.getInstance().<java.lang.Boolean> asTypeOrVoid(
						org.kermeta.compil.runtime.helper.io.SimpleFileIOUtil
								.fileIsDirectory(filename));

		java.lang.Boolean idIfCond_1007 = false;
		idIfCond_1007 = kermeta.standard.helper.BooleanWrapper.not(exists);

		if (idIfCond_1007) {

			kermeta.exceptions.FileNotFoundException e = ((kermeta.exceptions.FileNotFoundException) org.kermeta.compil.runtime.helper.language.ClassUtil
					.newObject("kermeta.exceptions.FileNotFoundException"));

			e.setMessage(filename);

			if (true)
				throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
						e);

		}

		java.lang.Boolean idIfCond_1008 = false;
		idIfCond_1008 = isdirectory;

		if (idIfCond_1008) {

			kermeta.exceptions.FileNotFoundException e = ((kermeta.exceptions.FileNotFoundException) org.kermeta.compil.runtime.helper.language.ClassUtil
					.newObject("kermeta.exceptions.FileNotFoundException"));

			e.setMessage(kermeta.standard.helper.StringWrapper.plus(filename,
					" is not a file"));

			if (true)
				throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
						e);

		}

		result = (java.lang.String) org.kermeta.compil.runtime.ExecutionContext
				.getInstance().<java.lang.String> asTypeOrVoid(
						org.kermeta.compil.runtime.helper.io.SimpleFileIOUtil
								.readTextFile(filename));

		return result;

	}

} //FileIOImpl
