/**
 * <copyright>
 * </copyright>
 *
 * $Id: StdIOImpl.java,v 1.10 2008-11-27 15:49:53 cfaucher Exp $
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

		java.lang.Boolean idIfCond_1000 = false;
		idIfCond_1000 = kermeta.standard.helper.StringWrapper.equals(object,
				null);

		if (idIfCond_1000) {

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

		java.lang.Boolean idIfCond_1001 = false;
		idIfCond_1001 = kermeta.standard.helper.StringWrapper.equals(object,
				null);

		if (idIfCond_1001) {

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

		java.lang.Boolean idIfCond_1002 = false;
		idIfCond_1002 = kermeta.standard.helper.StringWrapper.equals(object,
				null);

		if (idIfCond_1002) {

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

		java.lang.Boolean idIfCond_1003 = false;
		idIfCond_1003 = kermeta.standard.helper.StringWrapper.equals(object,
				null);

		if (idIfCond_1003) {

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

		java.lang.Boolean idIfCond_1004 = false;
		idIfCond_1004 = kermeta.standard.helper.StringWrapper.equals(prompt,
				null);

		if (idIfCond_1004) {

			prompt = "";
		}

		result = (java.lang.String) org.kermeta.compil.runtime.ExecutionContext
				.getInstance().<java.lang.String> asTypeOrVoid(
						org.kermeta.compil.runtime.helper.io.StdIOUtil
								.read(prompt));

		return result;

	}

} //StdIOImpl
