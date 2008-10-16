/**
 * <copyright>
 * </copyright>
 *
 * $Id: ConditionalImpl.java,v 1.5 2008-10-16 13:17:52 cfaucher Exp $
 */
package kermeta.language.behavior.impl;

import kermeta.language.behavior.BehaviorPackage;
import kermeta.language.behavior.Conditional;
import kermeta.language.behavior.Expression;

import km2ecore.KM2EcoreContext;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conditional</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link kermeta.language.behavior.impl.ConditionalImpl#getThenBody <em>Then Body</em>}</li>
 *   <li>{@link kermeta.language.behavior.impl.ConditionalImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link kermeta.language.behavior.impl.ConditionalImpl#getElseBody <em>Else Body</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConditionalImpl extends ExpressionImpl implements Conditional {
	/**
	 * The cached value of the '{@link #getThenBody() <em>Then Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThenBody()
	 * @generated
	 * @ordered
	 */
	protected Expression thenBody;

	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected Expression condition;

	/**
	 * The cached value of the '{@link #getElseBody() <em>Else Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElseBody()
	 * @generated
	 * @ordered
	 */
	protected Expression elseBody;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConditionalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BehaviorPackage.Literals.CONDITIONAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getThenBody() {
		if (thenBody != null && thenBody.eIsProxy()) {
			InternalEObject oldThenBody = (InternalEObject) thenBody;
			thenBody = (Expression) eResolveProxy(oldThenBody);
			if (thenBody != oldThenBody) {
				InternalEObject newThenBody = (InternalEObject) thenBody;
				NotificationChain msgs = oldThenBody.eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- BehaviorPackage.CONDITIONAL__THEN_BODY, null,
						null);
				if (newThenBody.eInternalContainer() == null) {
					msgs = newThenBody.eInverseAdd(this, EOPPOSITE_FEATURE_BASE
							- BehaviorPackage.CONDITIONAL__THEN_BODY, null,
							msgs);
				}
				if (msgs != null)
					msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							BehaviorPackage.CONDITIONAL__THEN_BODY,
							oldThenBody, thenBody));
			}
		}
		return thenBody;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression basicGetThenBody() {
		return thenBody;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetThenBody(Expression newThenBody,
			NotificationChain msgs) {
		Expression oldThenBody = thenBody;
		thenBody = newThenBody;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET, BehaviorPackage.CONDITIONAL__THEN_BODY,
					oldThenBody, newThenBody);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThenBody(Expression newThenBody) {
		if (newThenBody != thenBody) {
			NotificationChain msgs = null;
			if (thenBody != null)
				msgs = ((InternalEObject) thenBody).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- BehaviorPackage.CONDITIONAL__THEN_BODY, null,
						msgs);
			if (newThenBody != null)
				msgs = ((InternalEObject) newThenBody).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- BehaviorPackage.CONDITIONAL__THEN_BODY, null,
						msgs);
			msgs = basicSetThenBody(newThenBody, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					BehaviorPackage.CONDITIONAL__THEN_BODY, newThenBody,
					newThenBody));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getCondition() {
		if (condition != null && condition.eIsProxy()) {
			InternalEObject oldCondition = (InternalEObject) condition;
			condition = (Expression) eResolveProxy(oldCondition);
			if (condition != oldCondition) {
				InternalEObject newCondition = (InternalEObject) condition;
				NotificationChain msgs = oldCondition.eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- BehaviorPackage.CONDITIONAL__CONDITION, null,
						null);
				if (newCondition.eInternalContainer() == null) {
					msgs = newCondition.eInverseAdd(this,
							EOPPOSITE_FEATURE_BASE
									- BehaviorPackage.CONDITIONAL__CONDITION,
							null, msgs);
				}
				if (msgs != null)
					msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							BehaviorPackage.CONDITIONAL__CONDITION,
							oldCondition, condition));
			}
		}
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression basicGetCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCondition(Expression newCondition,
			NotificationChain msgs) {
		Expression oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET, BehaviorPackage.CONDITIONAL__CONDITION,
					oldCondition, newCondition);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCondition(Expression newCondition) {
		if (newCondition != condition) {
			NotificationChain msgs = null;
			if (condition != null)
				msgs = ((InternalEObject) condition).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- BehaviorPackage.CONDITIONAL__CONDITION, null,
						msgs);
			if (newCondition != null)
				msgs = ((InternalEObject) newCondition).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- BehaviorPackage.CONDITIONAL__CONDITION, null,
						msgs);
			msgs = basicSetCondition(newCondition, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					BehaviorPackage.CONDITIONAL__CONDITION, newCondition,
					newCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getElseBody() {
		if (elseBody != null && elseBody.eIsProxy()) {
			InternalEObject oldElseBody = (InternalEObject) elseBody;
			elseBody = (Expression) eResolveProxy(oldElseBody);
			if (elseBody != oldElseBody) {
				InternalEObject newElseBody = (InternalEObject) elseBody;
				NotificationChain msgs = oldElseBody.eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- BehaviorPackage.CONDITIONAL__ELSE_BODY, null,
						null);
				if (newElseBody.eInternalContainer() == null) {
					msgs = newElseBody.eInverseAdd(this, EOPPOSITE_FEATURE_BASE
							- BehaviorPackage.CONDITIONAL__ELSE_BODY, null,
							msgs);
				}
				if (msgs != null)
					msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							BehaviorPackage.CONDITIONAL__ELSE_BODY,
							oldElseBody, elseBody));
			}
		}
		return elseBody;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression basicGetElseBody() {
		return elseBody;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElseBody(Expression newElseBody,
			NotificationChain msgs) {
		Expression oldElseBody = elseBody;
		elseBody = newElseBody;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET, BehaviorPackage.CONDITIONAL__ELSE_BODY,
					oldElseBody, newElseBody);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElseBody(Expression newElseBody) {
		if (newElseBody != elseBody) {
			NotificationChain msgs = null;
			if (elseBody != null)
				msgs = ((InternalEObject) elseBody).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- BehaviorPackage.CONDITIONAL__ELSE_BODY, null,
						msgs);
			if (newElseBody != null)
				msgs = ((InternalEObject) newElseBody).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- BehaviorPackage.CONDITIONAL__ELSE_BODY, null,
						msgs);
			msgs = basicSetElseBody(newElseBody, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					BehaviorPackage.CONDITIONAL__ELSE_BODY, newElseBody,
					newElseBody));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createBehaviorJava(KM2EcoreContext context) {

		java.lang.String result = null;

		super.createBehaviorJava(context);

		context.pushCondStack();

		result = kermeta.standard.helper.StringWrapper.plus(
				kermeta.standard.helper.StringWrapper.plus(
						"java.lang.Boolean ", context.getIfConditionId()),
				" = false;");

		java.lang.String str_condition = "";

		java.lang.Boolean idIfCond_645 = false;
		idIfCond_645 = this.conditionIsCallFeatureThatCallsFunctionType();

		if (idIfCond_645) {

			context.getResultLastStatementStack().push(
					kermeta.standard.helper.StringWrapper.plus(
							kermeta.standard.helper.StringWrapper.plus(
									kermeta.standard.helper.StringWrapper.plus(
											context.getIfConditionId(), " = "),
									context.getTYPE_SEPARATOR()),
							"java.lang.Boolean"));

			str_condition = kermeta.standard.helper.StringWrapper.plus(
					kermeta.standard.helper.StringWrapper.plus(str_condition,
							"\n"), this.getCondition().createBehaviorJava(
							context));

			context.getResultLastStatementStack().pop();
		} else {

			java.lang.Boolean idIfCond_646 = false;
			idIfCond_646 = kermeta.standard.helper.StringWrapper.equals(context
					.printFtSuffix(), "");

			if (idIfCond_646) {

				str_condition = kermeta.standard.helper.StringWrapper.plus(
						kermeta.standard.helper.StringWrapper.plus(
								kermeta.standard.helper.StringWrapper.plus(
										kermeta.standard.helper.StringWrapper
												.plus(str_condition, "\n\t"),
										context.getIfConditionId()), " = "),
						this.getCondition().createBehaviorJava(context));
			} else {

				java.lang.Boolean idIfCond_647 = false;
				idIfCond_647 = kermeta.standard.helper.BooleanWrapper
						.or(
								kermeta.standard.helper.BooleanWrapper
										.or(
												org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isInstanceOf(
																this
																		.getCondition(),
																org.kermeta.compil.runtime.ExecutionContext
																		.getInstance()
																		.getMetaClass(
																				"kermeta.language.behavior.CallVariable")),
												org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isInstanceOf(
																this
																		.getCondition(),
																org.kermeta.compil.runtime.ExecutionContext
																		.getInstance()
																		.getMetaClass(
																				"kermeta.language.behavior.SelfExpression"))),
								org.kermeta.compil.runtime.helper.language.ObjectUtil
										.isInstanceOf(
												this.getCondition(),
												org.kermeta.compil.runtime.ExecutionContext
														.getInstance()
														.getMetaClass(
																"kermeta.language.behavior.CallResult")));

				if (idIfCond_647) {

					kermeta.language.structure.Parameter ftParam = null;

					java.lang.Boolean idIfCond_648 = false;
					idIfCond_648 = org.kermeta.compil.runtime.helper.language.ObjectUtil
							.isInstanceOf(
									this.getCondition(),
									org.kermeta.compil.runtime.ExecutionContext
											.getInstance()
											.getMetaClass(
													"kermeta.language.behavior.CallVariable"));

					if (idIfCond_648) {

						ftParam = ((kermeta.language.behavior.CallVariable) org.kermeta.compil.runtime.helper.language.ObjectUtil
								.asType(
										this.getCondition(),
										org.kermeta.compil.runtime.ExecutionContext
												.getInstance()
												.getMetaClass(
														"kermeta.language.behavior.CallVariable")))
								.getFunctionTypeParameter();
					}

					java.lang.Boolean idIfCond_649 = false;
					idIfCond_649 = kermeta.standard.helper.BooleanWrapper
							.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
									.isVoid(ftParam));

					if (idIfCond_649) {

						java.lang.Boolean idIfCond_650 = false;
						idIfCond_650 = ftParam.isBooleanFunctionType(context);

						if (idIfCond_650) {

							context
									.getResultLastStatementStack()
									.push(
											kermeta.standard.helper.StringWrapper
													.plus(
															kermeta.standard.helper.StringWrapper
																	.plus(
																			kermeta.standard.helper.StringWrapper
																					.plus(
																							context
																									.getIfConditionId(),
																							" = "),
																			context
																					.getTYPE_SEPARATOR()),
															"java.lang.Boolean"));

							str_condition = kermeta.standard.helper.StringWrapper
									.plus(kermeta.standard.helper.StringWrapper
											.plus(str_condition, "\n"), this
											.getCondition().createBehaviorJava(
													context));

							context.getResultLastStatementStack().pop();
						} else {

							str_condition = kermeta.standard.helper.StringWrapper
									.plus(
											kermeta.standard.helper.StringWrapper
													.plus(
															kermeta.standard.helper.StringWrapper
																	.plus(
																			kermeta.standard.helper.StringWrapper
																					.plus(
																							str_condition,
																							"\n\t"),
																			context
																					.getIfConditionId()),
															" = "),
											this
													.getCondition()
													.createBehaviorJava(context));
						}

					}

				}

				java.lang.Boolean idIfCond_651 = false;
				idIfCond_651 = org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isInstanceOf(
								this.getCondition(),
								org.kermeta.compil.runtime.ExecutionContext
										.getInstance()
										.getMetaClass(
												"kermeta.language.behavior.SelfExpression"));

				if (idIfCond_651) {

					str_condition = kermeta.standard.helper.StringWrapper
							.plus(
									kermeta.standard.helper.StringWrapper
											.plus(
													kermeta.standard.helper.StringWrapper
															.plus(
																	kermeta.standard.helper.StringWrapper
																			.plus(
																					str_condition,
																					"\n\t"),
																	context
																			.getIfConditionId()),
													" = "), this.getCondition()
											.createBehaviorJava(context));
				}

			}

		}

		result = kermeta.standard.helper.StringWrapper.plus(result,
				str_condition);

		result = kermeta.standard.helper.StringWrapper.plus(
				kermeta.standard.helper.StringWrapper.plus(
						kermeta.standard.helper.StringWrapper.plus(result,
								"\n\n\tif( "), context.getIfConditionId()),
				" ) ");

		java.lang.Boolean idIfCond_652 = false;
		idIfCond_652 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoid(this.getThenBody()));

		if (idIfCond_652) {

			result = kermeta.standard.helper.StringWrapper.plus(
					kermeta.standard.helper.StringWrapper.plus(result, this
							.getThenBody().createBehaviorJava(context)), "\n");
		}

		java.lang.Boolean idIfCond_653 = false;
		idIfCond_653 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoid(this.getElseBody()));

		if (idIfCond_653) {

			result = kermeta.standard.helper.StringWrapper.plus(result,
					" else ");

			result = kermeta.standard.helper.StringWrapper.plus(
					kermeta.standard.helper.StringWrapper.plus(result, this
							.getElseBody().createBehaviorJava(context)), "\n");
		}

		context.getCondStack().pop();

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean conditionIsCallFeatureThatCallsFunctionType() {

		java.lang.Boolean result = null;

		result = false;

		java.lang.Boolean idIfCond_654 = false;
		idIfCond_654 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isInstanceOf(
						this.getCondition(),
						org.kermeta.compil.runtime.ExecutionContext
								.getInstance()
								.getMetaClass(
										"kermeta.language.behavior.CallFeature"));

		if (idIfCond_654) {

			java.lang.Boolean idIfCond_655 = false;
			idIfCond_655 = ((kermeta.language.behavior.CallFeature) org.kermeta.compil.runtime.helper.language.ObjectUtil
					.asType(
							this.getCondition(),
							org.kermeta.compil.runtime.ExecutionContext
									.getInstance()
									.getMetaClass(
											"kermeta.language.behavior.CallFeature")))
					.callsFunctionType();

			if (idIfCond_655) {

				result = true;
			}

		}

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case BehaviorPackage.CONDITIONAL__THEN_BODY:
			return basicSetThenBody(null, msgs);
		case BehaviorPackage.CONDITIONAL__CONDITION:
			return basicSetCondition(null, msgs);
		case BehaviorPackage.CONDITIONAL__ELSE_BODY:
			return basicSetElseBody(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case BehaviorPackage.CONDITIONAL__THEN_BODY:
			if (resolve)
				return getThenBody();
			return basicGetThenBody();
		case BehaviorPackage.CONDITIONAL__CONDITION:
			if (resolve)
				return getCondition();
			return basicGetCondition();
		case BehaviorPackage.CONDITIONAL__ELSE_BODY:
			if (resolve)
				return getElseBody();
			return basicGetElseBody();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case BehaviorPackage.CONDITIONAL__THEN_BODY:
			setThenBody((Expression) newValue);
			return;
		case BehaviorPackage.CONDITIONAL__CONDITION:
			setCondition((Expression) newValue);
			return;
		case BehaviorPackage.CONDITIONAL__ELSE_BODY:
			setElseBody((Expression) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case BehaviorPackage.CONDITIONAL__THEN_BODY:
			setThenBody((Expression) null);
			return;
		case BehaviorPackage.CONDITIONAL__CONDITION:
			setCondition((Expression) null);
			return;
		case BehaviorPackage.CONDITIONAL__ELSE_BODY:
			setElseBody((Expression) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case BehaviorPackage.CONDITIONAL__THEN_BODY:
			return thenBody != null;
		case BehaviorPackage.CONDITIONAL__CONDITION:
			return condition != null;
		case BehaviorPackage.CONDITIONAL__ELSE_BODY:
			return elseBody != null;
		}
		return super.eIsSet(featureID);
	}

} //ConditionalImpl
