/**
 * <copyright>
 * </copyright>
 *
 * $Id: FileIOImpl.java,v 1.6 2008-10-28 13:18:14 cfaucher Exp $
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

		java.lang.Boolean idIfCond_937 = false;
		idIfCond_937 = kermeta.standard.helper.StringWrapper.equals(filename,
				null);

		if (idIfCond_937) {

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

		java.lang.Boolean idIfCond_938 = false;
		idIfCond_938 = kermeta.standard.helper.StringWrapper.equals(filename,
				null);

		if (idIfCond_938) {

			if (true)
				throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
						((kermeta.exceptions.FileNotFoundException) org.kermeta.compil.runtime.helper.language.ClassUtil
								.newObject("kermeta.exceptions.FileNotFoundException")));

		}

		java.lang.Boolean exists = null;

		java.lang.Boolean isdirectory = null;

		exists = (java.lang.Boolean) org.kermeta.compil.runtime.helper.io.SimpleFileIOUtil
				.fileExists(filename);

		isdirectory = (java.lang.Boolean) org.kermeta.compil.runtime.helper.io.SimpleFileIOUtil
				.fileIsDirectory(filename);

		java.lang.Boolean idIfCond_939 = false;
		idIfCond_939 = kermeta.standard.helper.BooleanWrapper
				.or(kermeta.standard.helper.BooleanWrapper.not(exists),
						isdirectory);

		if (idIfCond_939) {

			if (true)
				throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
						((kermeta.exceptions.FileNotFoundException) org.kermeta.compil.runtime.helper.language.ClassUtil
								.newObject("kermeta.exceptions.FileNotFoundException")));

		}

		result = (java.lang.String) org.kermeta.compil.runtime.helper.io.SimpleFileIOUtil
				.readTextFile(filename);

		return result;

	}

} //FileIOImpl
