/**
 * <copyright>
 * </copyright>
 *
 * $Id: AssignmentImpl.java,v 1.9 2008-11-07 08:53:26 cfaucher Exp $
 */
package kermeta.language.behavior.impl;

import kermeta.language.behavior.Assignment;
import kermeta.language.behavior.BehaviorPackage;
import kermeta.language.behavior.CallExpression;
import kermeta.language.behavior.Expression;

import km2ecore.KM2EcoreContext;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assignment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link kermeta.language.behavior.impl.AssignmentImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link kermeta.language.behavior.impl.AssignmentImpl#getValue <em>Value</em>}</li>
 *   <li>{@link kermeta.language.behavior.impl.AssignmentImpl#getIsCast <em>Is Cast</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AssignmentImpl extends ExpressionImpl implements Assignment {
	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected CallExpression target;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected Expression value;

	/**
	 * The default value of the '{@link #getIsCast() <em>Is Cast</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsCast()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_CAST_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getIsCast() <em>Is Cast</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsCast()
	 * @generated
	 * @ordered
	 */
	protected Boolean isCast = IS_CAST_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssignmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BehaviorPackage.Literals.ASSIGNMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallExpression getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject) target;
			target = (CallExpression) eResolveProxy(oldTarget);
			if (target != oldTarget) {
				InternalEObject newTarget = (InternalEObject) target;
				NotificationChain msgs = oldTarget.eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- BehaviorPackage.ASSIGNMENT__TARGET, null,
						null);
				if (newTarget.eInternalContainer() == null) {
					msgs = newTarget.eInverseAdd(this, EOPPOSITE_FEATURE_BASE
							- BehaviorPackage.ASSIGNMENT__TARGET, null, msgs);
				}
				if (msgs != null)
					msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							BehaviorPackage.ASSIGNMENT__TARGET, oldTarget,
							target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallExpression basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTarget(CallExpression newTarget,
			NotificationChain msgs) {
		CallExpression oldTarget = target;
		target = newTarget;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET, BehaviorPackage.ASSIGNMENT__TARGET,
					oldTarget, newTarget);
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
	public void setTarget(CallExpression newTarget) {
		if (newTarget != target) {
			NotificationChain msgs = null;
			if (target != null)
				msgs = ((InternalEObject) target).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- BehaviorPackage.ASSIGNMENT__TARGET, null,
						msgs);
			if (newTarget != null)
				msgs = ((InternalEObject) newTarget).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- BehaviorPackage.ASSIGNMENT__TARGET, null,
						msgs);
			msgs = basicSetTarget(newTarget, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					BehaviorPackage.ASSIGNMENT__TARGET, newTarget, newTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getValue() {
		if (value != null && value.eIsProxy()) {
			InternalEObject oldValue = (InternalEObject) value;
			value = (Expression) eResolveProxy(oldValue);
			if (value != oldValue) {
				InternalEObject newValue = (InternalEObject) value;
				NotificationChain msgs = oldValue
						.eInverseRemove(this, EOPPOSITE_FEATURE_BASE
								- BehaviorPackage.ASSIGNMENT__VALUE, null, null);
				if (newValue.eInternalContainer() == null) {
					msgs = newValue.eInverseAdd(this, EOPPOSITE_FEATURE_BASE
							- BehaviorPackage.ASSIGNMENT__VALUE, null, msgs);
				}
				if (msgs != null)
					msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							BehaviorPackage.ASSIGNMENT__VALUE, oldValue, value));
			}
		}
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression basicGetValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValue(Expression newValue,
			NotificationChain msgs) {
		Expression oldValue = value;
		value = newValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET, BehaviorPackage.ASSIGNMENT__VALUE,
					oldValue, newValue);
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
	public void setValue(Expression newValue) {
		if (newValue != value) {
			NotificationChain msgs = null;
			if (value != null)
				msgs = ((InternalEObject) value)
						.eInverseRemove(this, EOPPOSITE_FEATURE_BASE
								- BehaviorPackage.ASSIGNMENT__VALUE, null, msgs);
			if (newValue != null)
				msgs = ((InternalEObject) newValue)
						.eInverseAdd(this, EOPPOSITE_FEATURE_BASE
								- BehaviorPackage.ASSIGNMENT__VALUE, null, msgs);
			msgs = basicSetValue(newValue, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					BehaviorPackage.ASSIGNMENT__VALUE, newValue, newValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsCast() {
		return isCast;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsCast(Boolean newIsCast) {
		Boolean oldIsCast = isCast;
		isCast = newIsCast;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					BehaviorPackage.ASSIGNMENT__IS_CAST, oldIsCast, isCast));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String ppCastPrefix(KM2EcoreContext context) {

		java.lang.String result = null;

		result = "";

		java.lang.Boolean idIfCond_647 = false;
		idIfCond_647 = this.getIsCast();

		if (idIfCond_647) {

			result = kermeta.standard.helper.StringWrapper
					.plus(
							kermeta.standard.helper.StringWrapper
									.plus(
											kermeta.standard.helper.StringWrapper
													.plus(
															kermeta.standard.helper.StringWrapper
																	.plus(
																			this
																					.ppCast(context),
																			context
																					.getJAVA_INSTANCE_EXECUTION_CONTEXT()),
															".<"), this
													.getCastTypeQName(context)),
							">asTypeOrVoid(");
		}

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean requireValueTypeConversion(KM2EcoreContext context) {

		java.lang.Boolean result = null;

		result = false;

		java.lang.String right_type = this.getValue().getStaticType()
				.getTypeQName();

		kermeta.standard.Set<java.lang.String> value_type_list = ((kermeta.standard.Set<java.lang.String>) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject("kermeta.standard.Set<java.lang.String>"));

		value_type_list.add("java.lang.String");

		value_type_list.add("java.lang.Boolean");

		value_type_list.add("java.lang.Integer");

		value_type_list.add("java.lang.Character");

		value_type_list.add("java.lang.Double");

		java.lang.String castType = this.getCastTypeQName(context);

		java.lang.Boolean idIfCond_648 = false;
		idIfCond_648 = kermeta.standard.helper.StringWrapper.equals(right_type,
				"kermeta::language::structure::Object");

		if (idIfCond_648) {

			java.lang.Boolean idIfCond_649 = false;
			idIfCond_649 = value_type_list.contains(castType);

			if (idIfCond_649) {

				org.kermeta.compil.runtime.helper.io.StdIOUtil.getInstance()
						.writeln("a conversion is required");

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
	public String createBehaviorJava(KM2EcoreContext context) {

		java.lang.String result = null;

		super.createBehaviorJava(context);

		result = "";

		java.lang.String left = this.getTarget().createBehaviorJava(context);

		java.lang.String ppCastPrefix = this.ppCastPrefix(context);

		java.lang.String ppCastSuffix = this.ppCastSuffix();

		context.getResultLastStatementStack().push(
				kermeta.standard.helper.StringWrapper.plus(
						kermeta.standard.helper.StringWrapper.plus(
								kermeta.standard.helper.StringWrapper.plus(
										kermeta.standard.helper.StringWrapper
												.plus(left, " = "),
										ppCastPrefix), context
										.getTYPE_SEPARATOR()), this.getTarget()
								.getStaticType().createBehaviorJava(context)));

		java.lang.String right = this.getValue().createBehaviorJava(context);

		java.lang.Boolean idIfCond_650 = false;
		idIfCond_650 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isInstanceOfSwitcher(
						this.getValue(),
						org.kermeta.compil.runtime.ExecutionContext
								.getInstance()
								.getMetaClass(
										"kermeta.language.behavior.LambdaExpression"));

		if (idIfCond_650) {

			org.kermeta.compil.runtime.helper.io.StdIOUtil
					.getInstance()
					.errorln(
							"Please contact the Kermeta development team if you are in this case: createBehaviorJava Assignment");

			right = kermeta.standard.helper.StringWrapper.plus("function ",
					right);
		}

		java.lang.Boolean idIfCond_651 = false;
		idIfCond_651 = this.getTarget().isCallFeatureAsStaticProperty();

		if (idIfCond_651) {

			kermeta.standard.OrderedSet<java.lang.String> tabLeft = kermeta.standard.helper.StringWrapper
					.split(left, "\\.");

			result = "";

			{

				java.lang.Integer i = 0;
				java.lang.Boolean idLoopCond_652 = false;
				while (!idLoopCond_652) {
					idLoopCond_652 = kermeta.standard.helper.IntegerWrapper
							.isGreaterOrEqual(i, tabLeft.size());
					if (idLoopCond_652) {
					} else {

						java.lang.Boolean idIfCond_653 = false;
						idIfCond_653 = kermeta.standard.helper.IntegerWrapper
								.isLower(i,
										kermeta.standard.helper.IntegerWrapper
												.minus(tabLeft.size(), 1));

						if (idIfCond_653) {

							result = kermeta.standard.helper.StringWrapper
									.plus(
											kermeta.standard.helper.StringWrapper
													.plus(result, tabLeft
															.elementAt(i)), ".");
						} else {

							java.lang.Boolean idIfCond_654 = false;
							idIfCond_654 = kermeta.standard.helper.IntegerWrapper
									.equals(
											i,
											kermeta.standard.helper.IntegerWrapper
													.minus(tabLeft.size(), 1));

							if (idIfCond_654) {

								java.lang.Boolean idIfCond_655 = false;
								idIfCond_655 = this.getValue()
										.callsFunctionType();

								if (idIfCond_655) {

									result = kermeta.standard.helper.StringWrapper
											.plus(
													kermeta.standard.helper.StringWrapper
															.plus(
																	kermeta.standard.helper.StringWrapper
																			.plus(
																					kermeta.standard.helper.StringWrapper
																							.plus(
																									kermeta.standard.helper.StringWrapper
																											.plus(
																													kermeta.standard.helper.StringWrapper
																															.plus(
																																	kermeta.standard.helper.StringWrapper
																																			.plus(
																																					right,
																																					result),
																																	((kermeta.language.behavior.CallFeature) org.kermeta.compil.runtime.helper.language.ObjectUtil
																																			.asTypeSwitcher(
																																					this
																																							.getTarget(),
																																					org.kermeta.compil.runtime.ExecutionContext
																																							.getInstance()
																																							.getMetaClass(
																																									"kermeta.language.behavior.CallFeature")))
																																			.printSetAccessor(context)),
																													"("),
																									ppCastPrefix),
																					((kermeta.language.behavior.CallFeature) org.kermeta.compil.runtime.helper.language.ObjectUtil
																							.asTypeSwitcher(
																									this
																											.getValue(),
																									org.kermeta.compil.runtime.ExecutionContext
																											.getInstance()
																											.getMetaClass(
																													"kermeta.language.behavior.CallFeature")))
																							.getCalledFtResult()),
																	ppCastSuffix),
													");");
								} else {

									result = kermeta.standard.helper.StringWrapper
											.plus(
													kermeta.standard.helper.StringWrapper
															.plus(
																	kermeta.standard.helper.StringWrapper
																			.plus(
																					kermeta.standard.helper.StringWrapper
																							.plus(
																									kermeta.standard.helper.StringWrapper
																											.plus(
																													kermeta.standard.helper.StringWrapper
																															.plus(
																																	result,
																																	((kermeta.language.behavior.CallFeature) org.kermeta.compil.runtime.helper.language.ObjectUtil
																																			.asTypeSwitcher(
																																					this
																																							.getTarget(),
																																					org.kermeta.compil.runtime.ExecutionContext
																																							.getInstance()
																																							.getMetaClass(
																																									"kermeta.language.behavior.CallFeature")))
																																			.printSetAccessor(context)),
																													"("),
																									ppCastPrefix),
																					right),
																	ppCastSuffix),
													");");
								}

							}

						}

						i = kermeta.standard.helper.IntegerWrapper.plus(i, 1);
					}
				}
			}

		} else {

			java.lang.Boolean idIfCond_656 = false;
			idIfCond_656 = org.kermeta.compil.runtime.helper.language.ObjectUtil
					.isInstanceOfSwitcher(
							this.getValue(),
							org.kermeta.compil.runtime.ExecutionContext
									.getInstance()
									.getMetaClass(
											"kermeta.language.behavior.Conditional"));

			if (idIfCond_656) {

				result = right;
			} else {

				java.lang.Boolean idIfCond_657 = false;
				idIfCond_657 = kermeta.standard.helper.StringWrapper.contains(
						right, context.getRETURN_EXPRESSION_TO_REPLACE());

				if (idIfCond_657) {

					result = kermeta.standard.helper.StringWrapper.replace(
							right, context.getRETURN_EXPRESSION_TO_REPLACE(),
							kermeta.standard.helper.StringWrapper.plus(
									kermeta.standard.helper.StringWrapper.plus(
											left, " = "), ppCastPrefix));
				} else {

					java.lang.Boolean idIfCond_658 = false;
					idIfCond_658 = kermeta.standard.helper.BooleanWrapper
							.and(
									kermeta.standard.helper.BooleanWrapper
											.or(
													org.kermeta.compil.runtime.helper.language.ObjectUtil
															.isInstanceOfSwitcher(
																	this
																			.getTarget(),
																	org.kermeta.compil.runtime.ExecutionContext
																			.getInstance()
																			.getMetaClass(
																					"kermeta.language.behavior.CallVariable")),
													org.kermeta.compil.runtime.helper.language.ObjectUtil
															.isInstanceOfSwitcher(
																	this
																			.getTarget(),
																	org.kermeta.compil.runtime.ExecutionContext
																			.getInstance()
																			.getMetaClass(
																					"kermeta.language.behavior.CallResult"))),
									kermeta.standard.helper.BooleanWrapper
											.or(this.getValue()
													.callsFunctionType(), this
													.getValue()
													.isFunctionTypeVariable()));

					if (idIfCond_658) {

						result = right;
					} else {

						result = kermeta.standard.helper.StringWrapper.plus(
								kermeta.standard.helper.StringWrapper.plus(
										kermeta.standard.helper.StringWrapper
												.plus(left, " = "),
										ppCastPrefix), right);
					}

				}

			}

		}

		context.getResultLastStatementStack().pop();

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String ppCast(KM2EcoreContext context) {

		java.lang.String result = null;

		result = "";

		java.lang.Boolean idIfCond_659 = false;
		idIfCond_659 = this.getIsCast();

		if (idIfCond_659) {

			result = kermeta.standard.helper.StringWrapper.plus(
					kermeta.standard.helper.StringWrapper.plus("(", this
							.getCastTypeQName(context)), ") ");
		}

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCastTypeQName(KM2EcoreContext context) {

		java.lang.String result = null;

		result = "";

		java.lang.Boolean idIfCond_660 = false;
		idIfCond_660 = this.getIsCast();

		if (idIfCond_660) {

			result = this.getTarget().getStaticType().createBehaviorJava(
					context);
		}

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String ppCastSuffix() {

		java.lang.String result = null;

		result = "";

		java.lang.Boolean idIfCond_661 = false;
		idIfCond_661 = this.getIsCast();

		if (idIfCond_661) {

			result = ")";
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
		case BehaviorPackage.ASSIGNMENT__TARGET:
			return basicSetTarget(null, msgs);
		case BehaviorPackage.ASSIGNMENT__VALUE:
			return basicSetValue(null, msgs);
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
		case BehaviorPackage.ASSIGNMENT__TARGET:
			if (resolve)
				return getTarget();
			return basicGetTarget();
		case BehaviorPackage.ASSIGNMENT__VALUE:
			if (resolve)
				return getValue();
			return basicGetValue();
		case BehaviorPackage.ASSIGNMENT__IS_CAST:
			return getIsCast();
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
		case BehaviorPackage.ASSIGNMENT__TARGET:
			setTarget((CallExpression) newValue);
			return;
		case BehaviorPackage.ASSIGNMENT__VALUE:
			setValue((Expression) newValue);
			return;
		case BehaviorPackage.ASSIGNMENT__IS_CAST:
			setIsCast((Boolean) newValue);
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
		case BehaviorPackage.ASSIGNMENT__TARGET:
			setTarget((CallExpression) null);
			return;
		case BehaviorPackage.ASSIGNMENT__VALUE:
			setValue((Expression) null);
			return;
		case BehaviorPackage.ASSIGNMENT__IS_CAST:
			setIsCast(IS_CAST_EDEFAULT);
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
		case BehaviorPackage.ASSIGNMENT__TARGET:
			return target != null;
		case BehaviorPackage.ASSIGNMENT__VALUE:
			return value != null;
		case BehaviorPackage.ASSIGNMENT__IS_CAST:
			return IS_CAST_EDEFAULT == null ? isCast != null
					: !IS_CAST_EDEFAULT.equals(isCast);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (isCast: ");
		result.append(isCast);
		result.append(')');
		return result.toString();
	}

} //AssignmentImpl
