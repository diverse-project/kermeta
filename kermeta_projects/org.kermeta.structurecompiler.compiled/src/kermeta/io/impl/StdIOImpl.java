/**
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * 
 * Generating with Kermeta <http://www.kermeta.org>
 *
 * $Id: StdIOImpl.java,v 1.12 2009-02-10 17:51:49 cfaucher Exp $
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

		java.lang.Boolean idIfCond_1080 = false;
		idIfCond_1080 = kermeta.standard.helper.StringWrapper.equals(object,
				null);

		if (idIfCond_1080) {

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

		java.lang.Boolean idIfCond_1081 = false;
		idIfCond_1081 = kermeta.standard.helper.StringWrapper.equals(object,
				null);

		if (idIfCond_1081) {

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

		java.lang.Boolean idIfCond_1082 = false;
		idIfCond_1082 = kermeta.standard.helper.StringWrapper.equals(object,
				null);

		if (idIfCond_1082) {

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

		java.lang.Boolean idIfCond_1083 = false;
		idIfCond_1083 = kermeta.standard.helper.StringWrapper.equals(object,
				null);

		if (idIfCond_1083) {

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

		java.lang.Boolean idIfCond_1084 = false;
		idIfCond_1084 = kermeta.standard.helper.StringWrapper.equals(prompt,
				null);

		if (idIfCond_1084) {

			prompt = "";
		}

		result = (java.lang.String) org.kermeta.compil.runtime.helper.language.ObjectUtil
				.asTypeOrVoid(org.kermeta.compil.runtime.helper.io.StdIOUtil
						.read(prompt), "java.lang.String");

		return result;

	}

} //StdIOImpl
