/**
 * <copyright>
 * </copyright>
 *
 * $Id: SelfExpressionImpl.java,v 1.2 2008-09-11 12:34:40 cfaucher Exp $
 */
package kermeta.language.behavior.impl;

import kermeta.language.behavior.BehaviorPackage;
import kermeta.language.behavior.SelfExpression;

import km2ecore.KM2EcoreContext;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Self Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class SelfExpressionImpl extends ExpressionImpl implements
		SelfExpression {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SelfExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BehaviorPackage.Literals.SELF_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createBehaviorJava(KM2EcoreContext context) {

		java.lang.String result = null;

		super.createBehaviorJava(context);

		result = "this";

		java.lang.Boolean idIfCond_566 = false;
		idIfCond_566 = kermeta.standard.helper.BooleanWrapper
				.or(
						kermeta.standard.helper.BooleanWrapper
								.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
										.isVoid(context.getCurrent_valueType())),
						context.getStaticOperationMode());

		if (idIfCond_566) {

			result = "self";
		}

		java.lang.Boolean idIfCond_567 = false;
		idIfCond_567 = context.getFtSuffixActivation();

		if (idIfCond_567) {

			result = context.getFtContextualSelf();
		}

		result = kermeta.standard.helper.StringWrapper.plus(result, this
				.endOfExpressionFixer());

		return result;

	}

} //SelfExpressionImpl
