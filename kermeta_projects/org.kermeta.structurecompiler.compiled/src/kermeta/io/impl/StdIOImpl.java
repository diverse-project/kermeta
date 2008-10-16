/**
 * <copyright>
 * </copyright>
 *
 * $Id: StdIOImpl.java,v 1.6 2008-10-16 13:17:48 cfaucher Exp $
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

		java.lang.Boolean idIfCond_1047 = false;
		idIfCond_1047 = kermeta.standard.helper.StringWrapper.equals(object,
				null);

		if (idIfCond_1047) {

			object = "<void>";
		}

		org.kermeta.compil.runtime.helper.io.StdIOUtil.getInstance().writeln(
				object);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void errorln(String object) {

		java.lang.Boolean idIfCond_1048 = false;
		idIfCond_1048 = kermeta.standard.helper.StringWrapper.equals(object,
				null);

		if (idIfCond_1048) {

			object = "<void>";
		}

		org.kermeta.compil.runtime.helper.io.StdIOUtil.getInstance().errorln(
				object);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void error(String object) {

		java.lang.Boolean idIfCond_1049 = false;
		idIfCond_1049 = kermeta.standard.helper.StringWrapper.equals(object,
				null);

		if (idIfCond_1049) {

			object = "<void>";
		}

		org.kermeta.compil.runtime.helper.io.StdIOUtil.getInstance().error(
				object);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void write(String object) {

		java.lang.Boolean idIfCond_1050 = false;
		idIfCond_1050 = kermeta.standard.helper.StringWrapper.equals(object,
				null);

		if (idIfCond_1050) {

			object = "<void>";
		}

		org.kermeta.compil.runtime.helper.io.StdIOUtil.getInstance().write(
				object);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String read(String prompt) {

		java.lang.String result = null;

		java.lang.Boolean idIfCond_1051 = false;
		idIfCond_1051 = kermeta.standard.helper.StringWrapper.equals(prompt,
				null);

		if (idIfCond_1051) {

			prompt = "";
		}

		result = (java.lang.String) org.kermeta.compil.runtime.helper.io.StdIOUtil
				.getInstance().read(prompt);

		return result;

	}

} //StdIOImpl
