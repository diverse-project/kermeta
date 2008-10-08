/**
 * <copyright>
 * </copyright>
 *
 * $Id: StdIOImpl.java,v 1.4 2008-10-08 14:37:35 cfaucher Exp $
 */
package kermeta.io.impl;

import kermeta.io.IoPackage;
import kermeta.io.StdIO;

import kermeta.language.structure.impl.ObjectImpl;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Std IO</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class StdIOImpl extends ObjectImpl implements StdIO {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StdIOImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IoPackage.Literals.STD_IO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void writeln(String object) {

		java.lang.Boolean idIfCond_911 = false;
		idIfCond_911 = kermeta.standard.helper.StringWrapper.equals(object,
				null);

		if (idIfCond_911) {

			object = "<void>";
		}

		org.kermeta.compil.runtime.helper.io.StdIOUtil.writeln(object);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void errorln(String object) {

		java.lang.Boolean idIfCond_912 = false;
		idIfCond_912 = kermeta.standard.helper.StringWrapper.equals(object,
				null);

		if (idIfCond_912) {

			object = "<void>";
		}

		org.kermeta.compil.runtime.helper.io.StdIOUtil.errorln(object);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void error(String object) {

		java.lang.Boolean idIfCond_913 = false;
		idIfCond_913 = kermeta.standard.helper.StringWrapper.equals(object,
				null);

		if (idIfCond_913) {

			object = "<void>";
		}

		org.kermeta.compil.runtime.helper.io.StdIOUtil.error(object);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void write(String object) {

		java.lang.Boolean idIfCond_914 = false;
		idIfCond_914 = kermeta.standard.helper.StringWrapper.equals(object,
				null);

		if (idIfCond_914) {

			object = "<void>";
		}

		org.kermeta.compil.runtime.helper.io.StdIOUtil.write(object);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String read(String prompt) {

		java.lang.String result = null;

		java.lang.Boolean idIfCond_915 = false;
		idIfCond_915 = kermeta.standard.helper.StringWrapper.equals(prompt,
				null);

		if (idIfCond_915) {

			prompt = "";
		}

		result = (java.lang.String) org.kermeta.compil.runtime.helper.io.StdIOUtil
				.read(prompt);

		return result;

	}

} //StdIOImpl
