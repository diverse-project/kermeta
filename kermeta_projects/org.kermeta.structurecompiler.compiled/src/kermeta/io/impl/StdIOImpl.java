/**
 * <copyright>
 * </copyright>
 *
 * $Id: StdIOImpl.java,v 1.3 2008-09-22 14:46:10 cfaucher Exp $
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

		java.lang.Boolean idIfCond_931 = false;
		idIfCond_931 = kermeta.standard.helper.StringWrapper.equals(object,
				null);

		if (idIfCond_931) {

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

		java.lang.Boolean idIfCond_932 = false;
		idIfCond_932 = kermeta.standard.helper.StringWrapper.equals(object,
				null);

		if (idIfCond_932) {

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

		java.lang.Boolean idIfCond_933 = false;
		idIfCond_933 = kermeta.standard.helper.StringWrapper.equals(object,
				null);

		if (idIfCond_933) {

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

		java.lang.Boolean idIfCond_934 = false;
		idIfCond_934 = kermeta.standard.helper.StringWrapper.equals(object,
				null);

		if (idIfCond_934) {

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

		java.lang.Boolean idIfCond_935 = false;
		idIfCond_935 = kermeta.standard.helper.StringWrapper.equals(prompt,
				null);

		if (idIfCond_935) {

			prompt = "";
		}

		result = (java.lang.String) org.kermeta.compil.runtime.helper.io.StdIOUtil
				.read(prompt);

		return result;

	}

} //StdIOImpl
