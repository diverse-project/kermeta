/**
 * <copyright>
 * </copyright>
 *
 * $Id: StdIOImpl.java,v 1.2 2008-09-11 12:34:52 cfaucher Exp $
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

		java.lang.Boolean idIfCond_607 = false;
		idIfCond_607 = kermeta.standard.helper.StringWrapper.equals(object,
				null);

		if (idIfCond_607) {

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

		java.lang.Boolean idIfCond_608 = false;
		idIfCond_608 = kermeta.standard.helper.StringWrapper.equals(object,
				null);

		if (idIfCond_608) {

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

		java.lang.Boolean idIfCond_609 = false;
		idIfCond_609 = kermeta.standard.helper.StringWrapper.equals(object,
				null);

		if (idIfCond_609) {

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

		java.lang.Boolean idIfCond_610 = false;
		idIfCond_610 = kermeta.standard.helper.StringWrapper.equals(object,
				null);

		if (idIfCond_610) {

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

		java.lang.Boolean idIfCond_611 = false;
		idIfCond_611 = kermeta.standard.helper.StringWrapper.equals(prompt,
				null);

		if (idIfCond_611) {

			prompt = "";
		}

		result = (java.lang.String) org.kermeta.compil.runtime.helper.io.StdIOUtil
				.read(prompt);

		return result;

	}

} //StdIOImpl
