/**
 * <copyright>
 * </copyright>
 *
 * $Id: CallResultImpl.java,v 1.8 2008-11-07 08:53:28 cfaucher Exp $
 */
package kermeta.language.behavior.impl;

import kermeta.language.behavior.BehaviorPackage;
import kermeta.language.behavior.CallResult;

import km2ecore.KM2EcoreContext;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Call Result</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class CallResultImpl extends CallVariableImpl implements CallResult {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CallResultImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BehaviorPackage.Literals.CALL_RESULT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createBehaviorJava(KM2EcoreContext context) {

		java.lang.String result = null;

		super.createBehaviorJava(context);

		result = "result";

		result = kermeta.standard.helper.StringWrapper.plus(result, context
				.printFtSuffix());

		result = kermeta.standard.helper.StringWrapper.plus(result, this
				.endOfExpressionFixer());

		return result;

	}

} //CallResultImpl
