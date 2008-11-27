/**
 * <copyright>
 * </copyright>
 *
 * $Id: AssignmentImpl.java,v 1.10 2008-11-27 15:49:56 cfaucher Exp $
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
 *   <li>{@link kermeta.language.behavior.impl.AssignmentImpl#getValueTypeCastSuffix <em>Value Type Cast Suffix</em>}</li>
 *   <li>{@link kermeta.language.behavior.impl.AssignmentImpl#getValue <em>Value</em>}</li>
 *   <li>{@link kermeta.language.behavior.impl.AssignmentImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link kermeta.language.behavior.impl.AssignmentImpl#getIsCast <em>Is Cast</em>}</li>
 *   <li>{@link kermeta.language.behavior.impl.AssignmentImpl#getValueTypeCastPrefix <em>Value Type Cast Prefix</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AssignmentImpl extends ExpressionImpl implements Assignment {
	/**
	 * The default value of the '{@link #getValueTypeCastSuffix() <em>Value Type Cast Suffix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueTypeCastSuffix()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_TYPE_CAST_SUFFIX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValueTypeCastSuffix() <em>Value Type Cast Suffix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueTypeCastSuffix()
	 * @generated
	 * @ordered
	 */
	protected String valueTypeCastSuffix = VALUE_TYPE_CAST_SUFFIX_EDEFAULT;

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
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected CallExpression target;

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
	 * The default value of the '{@link #getValueTypeCastPrefix() <em>Value Type Cast Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueTypeCastPrefix()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_TYPE_CAST_PREFIX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValueTypeCastPrefix() <em>Value Type Cast Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueTypeCastPrefix()
	 * @generated
	 * @ordered
	 */
	protected String valueTypeCastPrefix = VALUE_TYPE_CAST_PREFIX_EDEFAULT;

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
	public String getValueTypeCastSuffix() {
		return valueTypeCastSuffix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueTypeCastSuffix(String newValueTypeCastSuffix) {
		String oldValueTypeCastSuffix = valueTypeCastSuffix;
		valueTypeCastSuffix = newValueTypeCastSuffix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					BehaviorPackage.ASSIGNMENT__VALUE_TYPE_CAST_SUFFIX,
					oldValueTypeCastSuffix, valueTypeCastSuffix));
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
	public String getValueTypeCastPrefix() {
		return valueTypeCastPrefix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueTypeCastPrefix(String newValueTypeCastPrefix) {
		String oldValueTypeCastPrefix = valueTypeCastPrefix;
		valueTypeCastPrefix = newValueTypeCastPrefix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					BehaviorPackage.ASSIGNMENT__VALUE_TYPE_CAST_PREFIX,
					oldValueTypeCastPrefix, valueTypeCastPrefix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String ppCastPrefix(KM2EcoreContext context) {

		java.lang.String result = null;

		result = "";

		java.lang.Boolean idIfCond_601 = false;
		idIfCond_601 = this.getIsCast();

		if (idIfCond_601) {

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
	public Boolean requireConversionObjectToValueType(KM2EcoreContext context) {

		java.lang.Boolean result = null;

		result = false;

		java.lang.String right_type = this.getValue().getStaticType()
				.getTypeQName();

		kermeta.standard.Set<java.lang.String> value_type_list = ((kermeta.standard.Set<java.lang.String>) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject("kermeta.standard.Set<java.lang.String>"));

		value_type_list.add("kermeta::standard::String");

		value_type_list.add("kermeta::standard::Boolean");

		value_type_list.add("kermeta::standard::Integer");

		value_type_list.add("kermeta::standard::Character");

		value_type_list.add("kermeta::standard::Real");

		java.lang.String castType = this.getCastTypeQName(context);

		java.lang.Boolean idIfCond_602 = false;
		idIfCond_602 = kermeta.standard.helper.StringWrapper.equals(right_type,
				"kermeta::language::structure::Object");

		if (idIfCond_602) {

			java.lang.Boolean idIfCond_603 = false;
			idIfCond_603 = value_type_list.contains(castType);

			if (idIfCond_603) {

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

		this.initCast(context);

		java.lang.String left = this.getTarget().createBehaviorJava(context);

		java.lang.String ppCastPrefix = this.ppCastPrefix(context);

		java.lang.String ppCastSuffix = this.ppCastSuffix();

		context
				.getResultLastStatementStack()
				.push(
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
																										left,
																										" = "),
																						ppCastPrefix),
																		this
																				.getValueTypeCastPrefix()),
														context
																.getTYPE_SEPARATOR()),
										this.getTarget().getStaticType()
												.createBehaviorJava(context)));

		java.lang.String right = this.getValue().createBehaviorJava(context);

		java.lang.Boolean idIfCond_604 = false;
		idIfCond_604 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isInstanceOfSwitcher(
						this.getValue(),
						org.kermeta.compil.runtime.ExecutionContext
								.getInstance()
								.getMetaClass(
										"kermeta.language.behavior.LambdaExpression"));

		if (idIfCond_604) {

			org.kermeta.compil.runtime.helper.io.StdIOUtil
					.getInstance()
					.errorln(
							"Please contact the Kermeta development team if you are in this case: createBehaviorJava Assignment");

			right = kermeta.standard.helper.StringWrapper.plus("function ",
					right);
		}

		java.lang.Boolean idIfCond_605 = false;
		idIfCond_605 = this.getTarget().isCallFeatureAsStaticProperty();

		if (idIfCond_605) {

			kermeta.standard.OrderedSet<java.lang.String> tabLeft = kermeta.standard.helper.StringWrapper
					.split(left, "\\.");

			result = "";

			{

				java.lang.Integer i = 0;
				java.lang.Boolean idLoopCond_606 = false;
				while (!idLoopCond_606) {
					idLoopCond_606 = kermeta.standard.helper.IntegerWrapper
							.isGreaterOrEqual(i, tabLeft.size());
					if (idLoopCond_606) {
					} else {

						java.lang.Boolean idIfCond_607 = false;
						idIfCond_607 = kermeta.standard.helper.IntegerWrapper
								.isLower(i,
										kermeta.standard.helper.IntegerWrapper
												.minus(tabLeft.size(), 1));

						if (idIfCond_607) {

							result = kermeta.standard.helper.StringWrapper
									.plus(
											kermeta.standard.helper.StringWrapper
													.plus(result, tabLeft
															.elementAt(i)), ".");
						} else {

							java.lang.Boolean idIfCond_608 = false;
							idIfCond_608 = kermeta.standard.helper.IntegerWrapper
									.equals(
											i,
											kermeta.standard.helper.IntegerWrapper
													.minus(tabLeft.size(), 1));

							if (idIfCond_608) {

								java.lang.Boolean idIfCond_609 = false;
								idIfCond_609 = this.getValue()
										.callsFunctionType();

								if (idIfCond_609) {

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
																													this
																															.getValueTypeCastPrefix()),
																									((kermeta.language.behavior.CallFeature) org.kermeta.compil.runtime.helper.language.ObjectUtil
																											.asTypeSwitcher(
																													this
																															.getValue(),
																													org.kermeta.compil.runtime.ExecutionContext
																															.getInstance()
																															.getMetaClass(
																																	"kermeta.language.behavior.CallFeature")))
																											.getCalledFtResult()),
																					this
																							.getValueTypeCastSuffix()),
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
																													this
																															.getValueTypeCastPrefix()),
																									right),
																					this
																							.getValueTypeCastSuffix()),
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

			java.lang.Boolean idIfCond_610 = false;
			idIfCond_610 = org.kermeta.compil.runtime.helper.language.ObjectUtil
					.isInstanceOfSwitcher(
							this.getValue(),
							org.kermeta.compil.runtime.ExecutionContext
									.getInstance()
									.getMetaClass(
											"kermeta.language.behavior.Conditional"));

			if (idIfCond_610) {

				result = right;
			} else {

				java.lang.Boolean idIfCond_611 = false;
				idIfCond_611 = kermeta.standard.helper.StringWrapper.contains(
						right, context.getRETURN_EXPRESSION_TO_REPLACE());

				if (idIfCond_611) {

					result = kermeta.standard.helper.StringWrapper
							.replace(
									right,
									context.getRETURN_EXPRESSION_TO_REPLACE(),
									kermeta.standard.helper.StringWrapper
											.plus(
													kermeta.standard.helper.StringWrapper
															.plus(
																	kermeta.standard.helper.StringWrapper
																			.plus(
																					left,
																					" = "),
																	ppCastPrefix),
													this
															.getValueTypeCastPrefix()));
				} else {

					java.lang.Boolean idIfCond_612 = false;
					idIfCond_612 = kermeta.standard.helper.BooleanWrapper
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

					if (idIfCond_612) {

						result = right;
					} else {

						result = kermeta.standard.helper.StringWrapper
								.plus(
										kermeta.standard.helper.StringWrapper
												.plus(
														kermeta.standard.helper.StringWrapper
																.plus(
																		kermeta.standard.helper.StringWrapper
																				.plus(
																						left,
																						" = "),
																		ppCastPrefix),
														this
																.getValueTypeCastPrefix()),
										right);
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

		java.lang.Boolean idIfCond_613 = false;
		idIfCond_613 = this.getIsCast();

		if (idIfCond_613) {

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

		java.lang.Boolean idIfCond_614 = false;
		idIfCond_614 = this.getIsCast();

		if (idIfCond_614) {

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
	public String ppValueTypeCastPrefix(KM2EcoreContext context) {

		java.lang.String result = null;

		result = "";

		java.lang.Boolean idIfCond_615 = false;
		idIfCond_615 = this.requireConversionValueTypeToObject(context);

		if (idIfCond_615) {

			result = kermeta.standard.helper.StringWrapper.plus(context
					.getOBJECT_UTIL_CLASS(), ".convertAsObject(");
		}

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initCast(KM2EcoreContext context) {

		this.setValueTypeCastPrefix(this.ppValueTypeCastPrefix(context));

		this.setValueTypeCastSuffix(this.ppValueTypeCastSuffix(context));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String ppCastSuffix() {

		java.lang.String result = null;

		result = "";

		java.lang.Boolean idIfCond_616 = false;
		idIfCond_616 = this.getIsCast();

		if (idIfCond_616) {

			result = ")";
		}

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String ppValueTypeCastSuffix(KM2EcoreContext context) {

		java.lang.String result = null;

		result = "";

		java.lang.Boolean idIfCond_617 = false;
		idIfCond_617 = this.requireConversionValueTypeToObject(context);

		if (idIfCond_617) {

			result = ")";
		}

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean requireConversionValueTypeToObject(KM2EcoreContext context) {

		java.lang.Boolean result = null;

		result = false;

		java.lang.String left_type = this.getTarget().getStaticType()
				.getTypeQName();

		kermeta.standard.Set<java.lang.String> value_type_list = ((kermeta.standard.Set<java.lang.String>) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject("kermeta.standard.Set<java.lang.String>"));

		value_type_list.add("kermeta::standard::String");

		value_type_list.add("kermeta::standard::Boolean");

		value_type_list.add("kermeta::standard::Integer");

		value_type_list.add("kermeta::standard::Character");

		value_type_list.add("kermeta::standard::Real");

		java.lang.String castType = this.getValue().getStaticType()
				.getTypeQName();

		java.lang.Boolean idIfCond_618 = false;
		idIfCond_618 = kermeta.standard.helper.StringWrapper.equals(left_type,
				"kermeta::language::structure::Object");

		if (idIfCond_618) {

			java.lang.Boolean idIfCond_619 = false;
			idIfCond_619 = value_type_list.contains(castType);

			if (idIfCond_619) {

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
		case BehaviorPackage.ASSIGNMENT__VALUE:
			return basicSetValue(null, msgs);
		case BehaviorPackage.ASSIGNMENT__TARGET:
			return basicSetTarget(null, msgs);
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
		case BehaviorPackage.ASSIGNMENT__VALUE_TYPE_CAST_SUFFIX:
			return getValueTypeCastSuffix();
		case BehaviorPackage.ASSIGNMENT__VALUE:
			if (resolve)
				return getValue();
			return basicGetValue();
		case BehaviorPackage.ASSIGNMENT__TARGET:
			if (resolve)
				return getTarget();
			return basicGetTarget();
		case BehaviorPackage.ASSIGNMENT__IS_CAST:
			return getIsCast();
		case BehaviorPackage.ASSIGNMENT__VALUE_TYPE_CAST_PREFIX:
			return getValueTypeCastPrefix();
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
		case BehaviorPackage.ASSIGNMENT__VALUE_TYPE_CAST_SUFFIX:
			setValueTypeCastSuffix((String) newValue);
			return;
		case BehaviorPackage.ASSIGNMENT__VALUE:
			setValue((Expression) newValue);
			return;
		case BehaviorPackage.ASSIGNMENT__TARGET:
			setTarget((CallExpression) newValue);
			return;
		case BehaviorPackage.ASSIGNMENT__IS_CAST:
			setIsCast((Boolean) newValue);
			return;
		case BehaviorPackage.ASSIGNMENT__VALUE_TYPE_CAST_PREFIX:
			setValueTypeCastPrefix((String) newValue);
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
		case BehaviorPackage.ASSIGNMENT__VALUE_TYPE_CAST_SUFFIX:
			setValueTypeCastSuffix(VALUE_TYPE_CAST_SUFFIX_EDEFAULT);
			return;
		case BehaviorPackage.ASSIGNMENT__VALUE:
			setValue((Expression) null);
			return;
		case BehaviorPackage.ASSIGNMENT__TARGET:
			setTarget((CallExpression) null);
			return;
		case BehaviorPackage.ASSIGNMENT__IS_CAST:
			setIsCast(IS_CAST_EDEFAULT);
			return;
		case BehaviorPackage.ASSIGNMENT__VALUE_TYPE_CAST_PREFIX:
			setValueTypeCastPrefix(VALUE_TYPE_CAST_PREFIX_EDEFAULT);
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
		case BehaviorPackage.ASSIGNMENT__VALUE_TYPE_CAST_SUFFIX:
			return VALUE_TYPE_CAST_SUFFIX_EDEFAULT == null ? valueTypeCastSuffix != null
					: !VALUE_TYPE_CAST_SUFFIX_EDEFAULT
							.equals(valueTypeCastSuffix);
		case BehaviorPackage.ASSIGNMENT__VALUE:
			return value != null;
		case BehaviorPackage.ASSIGNMENT__TARGET:
			return target != null;
		case BehaviorPackage.ASSIGNMENT__IS_CAST:
			return IS_CAST_EDEFAULT == null ? isCast != null
					: !IS_CAST_EDEFAULT.equals(isCast);
		case BehaviorPackage.ASSIGNMENT__VALUE_TYPE_CAST_PREFIX:
			return VALUE_TYPE_CAST_PREFIX_EDEFAULT == null ? valueTypeCastPrefix != null
					: !VALUE_TYPE_CAST_PREFIX_EDEFAULT
							.equals(valueTypeCastPrefix);
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
		result.append(" (valueTypeCastSuffix: ");
		result.append(valueTypeCastSuffix);
		result.append(", isCast: ");
		result.append(isCast);
		result.append(", valueTypeCastPrefix: ");
		result.append(valueTypeCastPrefix);
		result.append(')');
		return result.toString();
	}

} //AssignmentImpl
