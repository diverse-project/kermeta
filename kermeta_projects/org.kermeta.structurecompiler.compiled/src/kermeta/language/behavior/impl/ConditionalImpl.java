/**
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * 
 * Generating with Kermeta <http://www.kermeta.org>
 *
 * $Id: ConditionalImpl.java,v 1.12 2009-02-23 15:26:46 cfaucher Exp $
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

		/*java.lang.String result = null;

		super.createBehaviorJava(context);

		context.pushCondStack();

		result = kermeta.standard.helper.StringWrapper.plus(
				kermeta.standard.helper.StringWrapper.plus(
						"java.lang.Boolean ", context.getIfConditionId()),
				" = false;");

		java.lang.String str_condition = "";

		java.lang.Boolean idIfCond_677 = false;
		idIfCond_677 = this.conditionIsCallFeatureThatCallsFunctionType();

		if (idIfCond_677) {

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

			java.lang.Boolean idIfCond_678 = false;
			idIfCond_678 = kermeta.standard.helper.StringWrapper.equals(context
					.printFtSuffix(), "");

			if (idIfCond_678) {

				str_condition = kermeta.standard.helper.StringWrapper.plus(
						kermeta.standard.helper.StringWrapper.plus(
								kermeta.standard.helper.StringWrapper.plus(
										kermeta.standard.helper.StringWrapper
												.plus(str_condition, "\n\t"),
										context.getIfConditionId()), " = "),
						this.getCondition().createBehaviorJava(context));
			} else {

				java.lang.Boolean idIfCond_679 = false;
				idIfCond_679 = kermeta.standard.helper.BooleanWrapper
						.or(
								kermeta.standard.helper.BooleanWrapper
										.or(
												org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isInstanceOfSwitcher(
																this
																		.getCondition(),
																org.kermeta.compil.runtime.ExecutionContext
																		.getInstance()
																		.getMetaClass(
																				"kermeta.language.behavior.CallVariable")),
												org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isInstanceOfSwitcher(
																this
																		.getCondition(),
																org.kermeta.compil.runtime.ExecutionContext
																		.getInstance()
																		.getMetaClass(
																				"kermeta.language.behavior.SelfExpression"))),
								org.kermeta.compil.runtime.helper.language.ObjectUtil
										.isInstanceOfSwitcher(
												this.getCondition(),
												org.kermeta.compil.runtime.ExecutionContext
														.getInstance()
														.getMetaClass(
																"kermeta.language.behavior.CallResult")));

				if (idIfCond_679) {

					kermeta.language.structure.Parameter ftParam = null;

					java.lang.Boolean idIfCond_680 = false;
					idIfCond_680 = org.kermeta.compil.runtime.helper.language.ObjectUtil
							.isInstanceOfSwitcher(
									this.getCondition(),
									org.kermeta.compil.runtime.ExecutionContext
											.getInstance()
											.getMetaClass(
													"kermeta.language.behavior.CallVariable"));

					if (idIfCond_680) {

						ftParam = ((kermeta.language.behavior.CallVariable) org.kermeta.compil.runtime.helper.language.ObjectUtil
								.asTypeSwitcher(
										this.getCondition(),
										org.kermeta.compil.runtime.ExecutionContext
												.getInstance()
												.getMetaClass(
														"kermeta.language.behavior.CallVariable")))
								.getFunctionTypeParameter();
					}

					java.lang.Boolean idIfCond_681 = false;
					idIfCond_681 = kermeta.standard.helper.BooleanWrapper
							.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
									.isVoidSwitcher(ftParam));

					if (idIfCond_681) {

						java.lang.Boolean idIfCond_682 = false;
						idIfCond_682 = ftParam.isBooleanFunctionType(context);

						if (idIfCond_682) {

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

				java.lang.Boolean idIfCond_683 = false;
				idIfCond_683 = org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isInstanceOfSwitcher(
								this.getCondition(),
								org.kermeta.compil.runtime.ExecutionContext
										.getInstance()
										.getMetaClass(
												"kermeta.language.behavior.SelfExpression"));

				if (idIfCond_683) {

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

		java.lang.Boolean idIfCond_684 = false;
		idIfCond_684 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoidSwitcher(this.getThenBody()));

		if (idIfCond_684) {

			result = kermeta.standard.helper.StringWrapper.plus(
					kermeta.standard.helper.StringWrapper.plus(result, this
							.getThenBody().createBehaviorJava(context)), "\n");
		}

		java.lang.Boolean idIfCond_685 = false;
		idIfCond_685 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoidSwitcher(this.getElseBody()));

		if (idIfCond_685) {

			result = kermeta.standard.helper.StringWrapper.plus(result,
					" else ");

			result = kermeta.standard.helper.StringWrapper.plus(
					kermeta.standard.helper.StringWrapper.plus(result, this
							.getElseBody().createBehaviorJava(context)), "\n");
		}

		context.getCondStack().pop();

		return result;*/
		
		// Fixed bug #7838
		java.lang.String result = null;

			super.createBehaviorJava(context);

			context.pushCondStack();

			result = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus("java.lang.Boolean ", context.getIfConditionId()), " = false;");

			java.lang.String str_condition = "";

			java.lang.Boolean idIfCond_661 = false;
			idIfCond_661 = this.conditionIsCallFeatureThatCallsFunctionType();

			if( idIfCond_661 ) {

			context.getResultLastStatementStack().push(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(context.getIfConditionId(), " = "), context.getTYPE_SEPARATOR()), "java.lang.Boolean"));

			str_condition = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(str_condition, "\n"), this.getCondition().createBehaviorJava(context));

			context.getResultLastStatementStack().pop();
		}
		 else {

			java.lang.Boolean idIfCond_662 = false;
			idIfCond_662 = kermeta.standard.helper.StringWrapper.equals(context.printFtSuffix(), "");

			if( idIfCond_662 ) {

			str_condition = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(str_condition, "\n\t"), context.getIfConditionId()), " = "), this.getCondition().createBehaviorJava(context));
		}
		 else {

			java.lang.Boolean idIfCond_663 = false;
			idIfCond_663 = kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.BooleanWrapper.or(org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(this.getCondition(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass("kermeta.language.behavior.CallVariable")), org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(this.getCondition(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass("kermeta.language.behavior.SelfExpression"))), org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(this.getCondition(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass("kermeta.language.behavior.CallResult")));

			if( idIfCond_663 ) {

			kermeta.language.structure.Parameter ftParam = null;

			java.lang.Boolean idIfCond_664 = false;
			idIfCond_664 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(this.getCondition(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass("kermeta.language.behavior.CallVariable"));

			if( idIfCond_664 ) {

			ftParam = ((kermeta.language.behavior.CallVariable) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(this.getCondition(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass("kermeta.language.behavior.CallVariable"))).getFunctionTypeParameter();
		}


			java.lang.Boolean idIfCond_665 = false;
			idIfCond_665 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(ftParam));

			if( idIfCond_665 ) {

			java.lang.Boolean idIfCond_666 = false;
			idIfCond_666 = ftParam.isBooleanFunctionType(context);

			if( idIfCond_666 ) {

			context.getResultLastStatementStack().push(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(context.getIfConditionId(), " = "), context.getTYPE_SEPARATOR()), "java.lang.Boolean"));

			str_condition = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(str_condition, "\n"), this.getCondition().createBehaviorJava(context));

			context.getResultLastStatementStack().pop();
		}
		 else {

			str_condition = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(str_condition, "\n\t"), context.getIfConditionId()), " = "), this.getCondition().createBehaviorJava(context));
		}

		}

		}


			java.lang.Boolean idIfCond_667 = false;
			idIfCond_667 = kermeta.standard.helper.StringWrapper.equals(str_condition, "");

			if( idIfCond_667 ) {

			str_condition = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(str_condition, "\n\t"), context.getIfConditionId()), " = "), this.getCondition().createBehaviorJava(context));
		}

		}

		}


			result = kermeta.standard.helper.StringWrapper.plus(result, str_condition);

			result = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(result, "\n\n\tif( "), context.getIfConditionId()), " ) ");

			java.lang.Boolean idIfCond_668 = false;
			idIfCond_668 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(this.getThenBody()));

			if( idIfCond_668 ) {

			result = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(result, this.getThenBody().createBehaviorJava(context)), "\n");
		}


			java.lang.Boolean idIfCond_669 = false;
			idIfCond_669 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(this.getElseBody()));

			if( idIfCond_669 ) {

			result = kermeta.standard.helper.StringWrapper.plus(result, " else ");

			result = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(result, this.getElseBody().createBehaviorJava(context)), "\n");
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

		java.lang.Boolean idIfCond_686 = false;
		idIfCond_686 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isInstanceOfSwitcher(
						this.getCondition(),
						org.kermeta.compil.runtime.ExecutionContext
								.getInstance()
								.getMetaClass(
										"kermeta.language.behavior.CallFeature"));

		if (idIfCond_686) {

			java.lang.Boolean idIfCond_687 = false;
			idIfCond_687 = ((kermeta.language.behavior.CallFeature) org.kermeta.compil.runtime.helper.language.ObjectUtil
					.asTypeSwitcher(
							this.getCondition(),
							org.kermeta.compil.runtime.ExecutionContext
									.getInstance()
									.getMetaClass(
											"kermeta.language.behavior.CallFeature")))
					.callsFunctionType();

			if (idIfCond_687) {

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
