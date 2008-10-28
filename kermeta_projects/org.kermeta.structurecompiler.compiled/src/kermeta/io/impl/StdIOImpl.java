/**
 * <copyright>
 * </copyright>
 *
 * $Id: StdIOImpl.java,v 1.7 2008-10-28 13:18:14 cfaucher Exp $
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

		java.lang.Boolean idIfCond_940 = false;
		idIfCond_940 = kermeta.standard.helper.StringWrapper.equals(object,
				null);

		if (idIfCond_940) {

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

		java.lang.Boolean idIfCond_941 = false;
		idIfCond_941 = kermeta.standard.helper.StringWrapper.equals(object,
				null);

		if (idIfCond_941) {

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

		java.lang.Boolean idIfCond_942 = false;
		idIfCond_942 = kermeta.standard.helper.StringWrapper.equals(object,
				null);

		if (idIfCond_942) {

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

		java.lang.Boolean idIfCond_943 = false;
		idIfCond_943 = kermeta.standard.helper.StringWrapper.equals(object,
				null);

		if (idIfCond_943) {

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

		java.lang.Boolean idIfCond_944 = false;
		idIfCond_944 = kermeta.standard.helper.StringWrapper.equals(prompt,
				null);

		if (idIfCond_944) {

			prompt = "";
		}

		result = (java.lang.String) org.kermeta.compil.runtime.helper.io.StdIOUtil
				.getInstance().read(prompt);

		return result;

	}

} //StdIOImpl
