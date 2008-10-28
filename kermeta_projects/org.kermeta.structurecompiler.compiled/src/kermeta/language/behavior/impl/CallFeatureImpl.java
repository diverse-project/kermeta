/**
 * <copyright>
 * </copyright>
 *
 * $Id: CallFeatureImpl.java,v 1.8 2008-10-28 13:18:16 cfaucher Exp $
 */
package kermeta.language.behavior.impl;

import kermeta.language.behavior.BehaviorPackage;
import kermeta.language.behavior.CallFeature;
import kermeta.language.behavior.Expression;

import kermeta.language.structure.EnumerationLiteral;
import kermeta.language.structure.FunctionType;
import kermeta.language.structure.Operation;
import kermeta.language.structure.Property;
import kermeta.language.structure.Type;

import km2ecore.KM2EcoreContext;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Call Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link kermeta.language.behavior.impl.CallFeatureImpl#getStaticOperation <em>Static Operation</em>}</li>
 *   <li>{@link kermeta.language.behavior.impl.CallFeatureImpl#getCalledFtResult <em>Called Ft Result</em>}</li>
 *   <li>{@link kermeta.language.behavior.impl.CallFeatureImpl#getIsAtpre <em>Is Atpre</em>}</li>
 *   <li>{@link kermeta.language.behavior.impl.CallFeatureImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link kermeta.language.behavior.impl.CallFeatureImpl#getStaticEnumLiteral <em>Static Enum Literal</em>}</li>
 *   <li>{@link kermeta.language.behavior.impl.CallFeatureImpl#getStaticProperty <em>Static Property</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CallFeatureImpl extends CallExpressionImpl implements CallFeature {
	/**
	 * The cached value of the '{@link #getStaticOperation() <em>Static Operation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStaticOperation()
	 * @generated
	 * @ordered
	 */
	protected Operation staticOperation;

	/**
	 * The default value of the '{@link #getCalledFtResult() <em>Called Ft Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalledFtResult()
	 * @generated
	 * @ordered
	 */
	protected static final String CALLED_FT_RESULT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCalledFtResult() <em>Called Ft Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalledFtResult()
	 * @generated
	 * @ordered
	 */
	protected String calledFtResult = CALLED_FT_RESULT_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsAtpre() <em>Is Atpre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsAtpre()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_ATPRE_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getIsAtpre() <em>Is Atpre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsAtpre()
	 * @generated
	 * @ordered
	 */
	protected Boolean isAtpre = IS_ATPRE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected Expression target;

	/**
	 * The cached value of the '{@link #getStaticEnumLiteral() <em>Static Enum Literal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStaticEnumLiteral()
	 * @generated
	 * @ordered
	 */
	protected EnumerationLiteral staticEnumLiteral;

	/**
	 * The cached value of the '{@link #getStaticProperty() <em>Static Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStaticProperty()
	 * @generated
	 * @ordered
	 */
	protected Property staticProperty;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CallFeatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BehaviorPackage.Literals.CALL_FEATURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation getStaticOperation() {
		if (staticOperation != null && staticOperation.eIsProxy()) {
			InternalEObject oldStaticOperation = (InternalEObject) staticOperation;
			staticOperation = (Operation) eResolveProxy(oldStaticOperation);
			if (staticOperation != oldStaticOperation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							BehaviorPackage.CALL_FEATURE__STATIC_OPERATION,
							oldStaticOperation, staticOperation));
			}
		}
		return staticOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation basicGetStaticOperation() {
		return staticOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStaticOperation(Operation newStaticOperation) {
		Operation oldStaticOperation = staticOperation;
		staticOperation = newStaticOperation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					BehaviorPackage.CALL_FEATURE__STATIC_OPERATION,
					oldStaticOperation, staticOperation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCalledFtResult() {
		return calledFtResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCalledFtResult(String newCalledFtResult) {
		String oldCalledFtResult = calledFtResult;
		calledFtResult = newCalledFtResult;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					BehaviorPackage.CALL_FEATURE__CALLED_FT_RESULT,
					oldCalledFtResult, calledFtResult));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsAtpre() {
		return isAtpre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsAtpre(Boolean newIsAtpre) {
		Boolean oldIsAtpre = isAtpre;
		isAtpre = newIsAtpre;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					BehaviorPackage.CALL_FEATURE__IS_ATPRE, oldIsAtpre, isAtpre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject) target;
			target = (Expression) eResolveProxy(oldTarget);
			if (target != oldTarget) {
				InternalEObject newTarget = (InternalEObject) target;
				NotificationChain msgs = oldTarget.eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- BehaviorPackage.CALL_FEATURE__TARGET, null,
						null);
				if (newTarget.eInternalContainer() == null) {
					msgs = newTarget.eInverseAdd(this, EOPPOSITE_FEATURE_BASE
							- BehaviorPackage.CALL_FEATURE__TARGET, null, msgs);
				}
				if (msgs != null)
					msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							BehaviorPackage.CALL_FEATURE__TARGET, oldTarget,
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
	public Expression basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTarget(Expression newTarget,
			NotificationChain msgs) {
		Expression oldTarget = target;
		target = newTarget;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET, BehaviorPackage.CALL_FEATURE__TARGET,
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
	public void setTarget(Expression newTarget) {
		if (newTarget != target) {
			NotificationChain msgs = null;
			if (target != null)
				msgs = ((InternalEObject) target).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- BehaviorPackage.CALL_FEATURE__TARGET, null,
						msgs);
			if (newTarget != null)
				msgs = ((InternalEObject) newTarget).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- BehaviorPackage.CALL_FEATURE__TARGET, null,
						msgs);
			msgs = basicSetTarget(newTarget, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					BehaviorPackage.CALL_FEATURE__TARGET, newTarget, newTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumerationLiteral getStaticEnumLiteral() {
		if (staticEnumLiteral != null && staticEnumLiteral.eIsProxy()) {
			InternalEObject oldStaticEnumLiteral = (InternalEObject) staticEnumLiteral;
			staticEnumLiteral = (EnumerationLiteral) eResolveProxy(oldStaticEnumLiteral);
			if (staticEnumLiteral != oldStaticEnumLiteral) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							BehaviorPackage.CALL_FEATURE__STATIC_ENUM_LITERAL,
							oldStaticEnumLiteral, staticEnumLiteral));
			}
		}
		return staticEnumLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumerationLiteral basicGetStaticEnumLiteral() {
		return staticEnumLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStaticEnumLiteral(EnumerationLiteral newStaticEnumLiteral) {
		EnumerationLiteral oldStaticEnumLiteral = staticEnumLiteral;
		staticEnumLiteral = newStaticEnumLiteral;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					BehaviorPackage.CALL_FEATURE__STATIC_ENUM_LITERAL,
					oldStaticEnumLiteral, staticEnumLiteral));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property getStaticProperty() {
		if (staticProperty != null && staticProperty.eIsProxy()) {
			InternalEObject oldStaticProperty = (InternalEObject) staticProperty;
			staticProperty = (Property) eResolveProxy(oldStaticProperty);
			if (staticProperty != oldStaticProperty) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							BehaviorPackage.CALL_FEATURE__STATIC_PROPERTY,
							oldStaticProperty, staticProperty));
			}
		}
		return staticProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property basicGetStaticProperty() {
		return staticProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStaticProperty(Property newStaticProperty) {
		Property oldStaticProperty = staticProperty;
		staticProperty = newStaticProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					BehaviorPackage.CALL_FEATURE__STATIC_PROPERTY,
					oldStaticProperty, staticProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean fromUtil(KM2EcoreContext context) {

		java.lang.Boolean result = null;

		java.lang.String fName = ((km2ecore.helper.java.IdentifierHelper) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject("km2ecore.helper.java.IdentifierHelper"))
				.getMangledIdentifier(this.getName(), context);

		java.lang.Boolean idIfCond_486 = false;
		idIfCond_486 = kermeta.standard.helper.BooleanWrapper
				.or(
						kermeta.standard.helper.BooleanWrapper
								.or(
										((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil
												.asTypeSwitcher(
														org.kermeta.compil.runtime.helper.language.ObjectUtil
																.containerSwitcher(this
																		.getStaticOperation()),
														org.kermeta.compil.runtime.ExecutionContext
																.getInstance()
																.getMetaClass(
																		"kermeta.language.structure.ClassDefinition")))
												.isValueType(),
										kermeta.standard.helper.BooleanWrapper
												.and(
														kermeta.standard.helper.StringWrapper
																.equals(
																		((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil
																				.asTypeSwitcher(
																						org.kermeta.compil.runtime.helper.language.ObjectUtil
																								.containerSwitcher(this
																										.getStaticOperation()),
																						org.kermeta.compil.runtime.ExecutionContext
																								.getInstance()
																								.getMetaClass(
																										"kermeta.language.structure.ClassDefinition")))
																				.qualifiedName(),
																		"kermeta::language::structure::Object"),
														kermeta.standard.helper.BooleanWrapper
																.or(
																		org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
																				.<java.lang.String> convertAsOrderedSet(
																						context
																								.getFrameworkOperations())
																				.contains(
																						fName),
																		kermeta.standard.helper.BooleanWrapper
																				.and(
																						kermeta.standard.helper.BooleanWrapper
																								.and(
																										kermeta.standard.helper.BooleanWrapper
																												.and(
																														kermeta.standard.helper.BooleanWrapper
																																.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
																																		.isInstanceOfSwitcher(
																																				this
																																						.getTarget(),
																																				org.kermeta.compil.runtime.ExecutionContext
																																						.getInstance()
																																						.getMetaClass(
																																								"kermeta.language.behavior.CallVariable"))),
																														kermeta.standard.helper.BooleanWrapper
																																.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
																																		.isInstanceOfSwitcher(
																																				this
																																						.getTarget(),
																																				org.kermeta.compil.runtime.ExecutionContext
																																						.getInstance()
																																						.getMetaClass(
																																								"kermeta.language.behavior.CallResult")))),
																										kermeta.standard.helper.BooleanWrapper
																												.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
																														.isInstanceOfSwitcher(
																																this
																																		.getTarget(),
																																org.kermeta.compil.runtime.ExecutionContext
																																		.getInstance()
																																		.getMetaClass(
																																				"kermeta.language.behavior.CallFeature")))),
																						kermeta.standard.helper.BooleanWrapper
																								.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
																										.isInstanceOfSwitcher(
																												this
																														.getTarget(),
																												org.kermeta.compil.runtime.ExecutionContext
																														.getInstance()
																														.getMetaClass(
																																"kermeta.language.behavior.SelfExpression"))))))),
						kermeta.standard.helper.BooleanWrapper
								.and(
										kermeta.standard.helper.StringWrapper
												.equals(
														((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil
																.asTypeSwitcher(
																		org.kermeta.compil.runtime.helper.language.ObjectUtil
																				.containerSwitcher(this
																						.getStaticOperation()),
																		org.kermeta.compil.runtime.ExecutionContext
																				.getInstance()
																				.getMetaClass(
																						"kermeta.language.structure.ClassDefinition")))
																.qualifiedName(),
														"kermeta::language::structure::Type"),
										kermeta.standard.helper.BooleanWrapper
												.or(
														org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
																.<java.lang.String> convertAsOrderedSet(
																		context
																				.getFrameworkOperations())
																.contains(fName),
														kermeta.standard.helper.BooleanWrapper
																.and(
																		kermeta.standard.helper.BooleanWrapper
																				.and(
																						kermeta.standard.helper.BooleanWrapper
																								.and(
																										kermeta.standard.helper.BooleanWrapper
																												.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
																														.isInstanceOfSwitcher(
																																this
																																		.getTarget(),
																																org.kermeta.compil.runtime.ExecutionContext
																																		.getInstance()
																																		.getMetaClass(
																																				"kermeta.language.behavior.CallVariable"))),
																										kermeta.standard.helper.BooleanWrapper
																												.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
																														.isInstanceOfSwitcher(
																																this
																																		.getTarget(),
																																org.kermeta.compil.runtime.ExecutionContext
																																		.getInstance()
																																		.getMetaClass(
																																				"kermeta.language.behavior.CallResult")))),
																						kermeta.standard.helper.BooleanWrapper
																								.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
																										.isInstanceOfSwitcher(
																												this
																														.getTarget(),
																												org.kermeta.compil.runtime.ExecutionContext
																														.getInstance()
																														.getMetaClass(
																																"kermeta.language.behavior.CallFeature")))),
																		kermeta.standard.helper.BooleanWrapper
																				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
																						.isInstanceOfSwitcher(
																								this
																										.getTarget(),
																								org.kermeta.compil.runtime.ExecutionContext
																										.getInstance()
																										.getMetaClass(
																												"kermeta.language.behavior.SelfExpression")))))));

		if (idIfCond_486) {

			result = true;
		} else {

			result = false;
		}

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionType getFunctionType() {

		kermeta.language.structure.FunctionType result = null;

		//BIft:detect

		kermeta.language.structure.Type result_ft132 = null;

		kermeta.language.structure.Type elem_ft132 = null;

		result_ft132 = null;

		{

			kermeta.standard.Iterator<kermeta.language.structure.Type> it_ft132 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Type> convertAsOrderedSet(
							this.getContainedType()).iterator();
			java.lang.Boolean idLoopCond_487 = false;
			while (!idLoopCond_487) {
				idLoopCond_487 = kermeta.standard.helper.BooleanWrapper.or(
						it_ft132.isOff(),
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isNotEqualSwitcher(result_ft132, null));
				if (idLoopCond_487) {
				} else {

					elem_ft132 = it_ft132.next();

					java.lang.Boolean idIfCond_488 = false;
					//BIle:detector
					kermeta.language.structure.Type t_lbdExp132 = elem_ft132;

					idIfCond_488 = org.kermeta.compil.runtime.helper.language.ObjectUtil
							.isInstanceOfSwitcher(
									t_lbdExp132,
									org.kermeta.compil.runtime.ExecutionContext
											.getInstance()
											.getMetaClass(
													"kermeta.language.structure.FunctionType"));
					//EIle:detector

					if (idIfCond_488) {

						result_ft132 = elem_ft132;
					}

				}
			}
		}

		//CE
		result = (kermeta.language.structure.FunctionType) result_ft132;
		//EIft:detect

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

		java.lang.Boolean ppCast = false;

		java.lang.String cf_prop_suffix = "";

		java.lang.Boolean idIfCond_489 = false;
		idIfCond_489 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isVoidSwitcher(this.getTarget());

		if (idIfCond_489) {

			this
					.setTarget(((kermeta.language.behavior.SelfExpression) org.kermeta.compil.runtime.helper.language.ClassUtil
							.newObject("kermeta.language.behavior.SelfExpression")));
		}

		kermeta.language.behavior.Expression tgt = this.getTarget();

		java.lang.String fName = ((km2ecore.helper.java.IdentifierHelper) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject("km2ecore.helper.java.IdentifierHelper"))
				.getMangledIdentifier(this.getName(), context);

		java.lang.String static_call = "";

		java.lang.Boolean idIfCond_490 = false;
		idIfCond_490 = this.isCallFeatureAsStaticOperation();

		if (idIfCond_490) {

			java.lang.Boolean idIfCond_491 = false;
			idIfCond_491 = this.callsFunctionType();

			if (idIfCond_491) {

				context.getTasks_stack().push(
						context.getFUNCTION_TYPE_COMPILATION_TASK());

				context.setAfterLbdExpActivation(false);

				java.lang.String ft_str = this
						.createStringFromFunctionType(context);

				context.getTasks_stack().pop();

				result = ft_str;
			} else {

				java.lang.Boolean idIfCond_492 = false;
				idIfCond_492 = this.fromUtil(context);

				if (idIfCond_492) {

					java.lang.Boolean idIfCond_493 = false;
					idIfCond_493 = ((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil
							.asTypeSwitcher(
									org.kermeta.compil.runtime.helper.language.ObjectUtil
											.containerSwitcher(this
													.getStaticOperation()),
									org.kermeta.compil.runtime.ExecutionContext
											.getInstance()
											.getMetaClass(
													"kermeta.language.structure.ClassDefinition")))
							.isValueType();

					if (idIfCond_493) {

						static_call = this.getStaticOperation()
								.getOptimizedStaticCall(context);

						java.lang.Boolean idIfCond_494 = false;
						idIfCond_494 = kermeta.standard.helper.StringWrapper
								.equals(static_call, "");

						if (idIfCond_494) {

							static_call = kermeta.standard.helper.StringWrapper
									.plus(
											kermeta.standard.helper.StringWrapper
													.plus(
															kermeta.standard.helper.StringWrapper
																	.plus(
																			kermeta.standard.helper.StringWrapper
																					.plus(
																							kermeta.standard.helper.StringWrapper
																									.replace(
																											((kermeta.language.structure.Package) org.kermeta.compil.runtime.helper.language.ObjectUtil
																													.asTypeSwitcher(
																															org.kermeta.compil.runtime.helper.language.ObjectUtil
																																	.containerSwitcher(((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil
																																			.asTypeSwitcher(
																																					org.kermeta.compil.runtime.helper.language.ObjectUtil
																																							.containerSwitcher(this
																																									.getStaticOperation()),
																																					org.kermeta.compil.runtime.ExecutionContext
																																							.getInstance()
																																							.getMetaClass(
																																									"kermeta.language.structure.ClassDefinition")))),
																															org.kermeta.compil.runtime.ExecutionContext
																																	.getInstance()
																																	.getMetaClass(
																																			"kermeta.language.structure.Package")))
																													.qualifiedName(),
																											"::",
																											"."),
																							".helper."),
																			((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asTypeSwitcher(
																							org.kermeta.compil.runtime.helper.language.ObjectUtil
																									.containerSwitcher(this
																											.getStaticOperation()),
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.ClassDefinition")))
																					.getName()),
															"Wrapper."), fName);
						}

					} else {

						static_call = this.getStaticOperation()
								.getOptimizedStaticCall(context);

						java.lang.Boolean idIfCond_495 = false;
						idIfCond_495 = kermeta.standard.helper.StringWrapper
								.equals(static_call, "");

						if (idIfCond_495) {

							static_call = kermeta.standard.helper.StringWrapper
									.plus(
											kermeta.standard.helper.StringWrapper
													.plus(
															kermeta.standard.helper.StringWrapper
																	.plus(
																			kermeta.standard.helper.StringWrapper
																					.plus(
																							"org.kermeta.compil.runtime.helper.language.",
																							((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil
																									.asTypeSwitcher(
																											org.kermeta.compil.runtime.helper.language.ObjectUtil
																													.containerSwitcher(this
																															.getStaticOperation()),
																											org.kermeta.compil.runtime.ExecutionContext
																													.getInstance()
																													.getMetaClass(
																															"kermeta.language.structure.ClassDefinition")))
																									.getName()),
																			"Util."),
															fName), "Switcher");
						}

						java.lang.Boolean idIfCond_496 = false;
						idIfCond_496 = kermeta.standard.helper.StringWrapper
								.equals(fName, "asType");

						if (idIfCond_496) {

							ppCast = true;

							static_call = kermeta.standard.helper.StringWrapper
									.plus(
											kermeta.standard.helper.StringWrapper
													.plus(
															kermeta.standard.helper.StringWrapper
																	.plus(
																			"(",
																			org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
																					.<kermeta.language.behavior.Expression> convertAsOrderedSet(
																							this
																									.getParameters())
																					.first()
																					.createBehaviorJava(
																							context)),
															") "), static_call);
						}

					}

				} else {

					java.lang.Boolean idIfCond_497 = false;
					idIfCond_497 = kermeta.standard.helper.BooleanWrapper
							.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
									.isVoidSwitcher(tgt));

					if (idIfCond_497) {

						java.lang.Boolean idIfCond_498 = false;
						idIfCond_498 = kermeta.standard.helper.BooleanWrapper
								.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
										.isVoidSwitcher(tgt.getStaticType()));

						if (idIfCond_498) {

							java.lang.Boolean idIfCond_499 = false;
							idIfCond_499 = tgt.getStaticType().isValueType();

							if (idIfCond_499) {

								static_call = kermeta.standard.helper.StringWrapper
										.plus(
												kermeta.standard.helper.StringWrapper
														.plus(
																kermeta.standard.helper.StringWrapper
																		.plus(
																				"org.kermeta.compil.runtime.helper.basetypes.",
																				tgt
																						.getStaticType()
																						.getTypeName()),
																"Util."), fName);
							}

						}

					} else {

						java.lang.Boolean idIfCond_500 = false;
						idIfCond_500 = kermeta.standard.helper.BooleanWrapper
								.and(
										((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil
												.asTypeSwitcher(
														org.kermeta.compil.runtime.helper.language.ObjectUtil
																.containerSwitcher(this
																		.getStaticOperation()),
														org.kermeta.compil.runtime.ExecutionContext
																.getInstance()
																.getMetaClass(
																		"kermeta.language.structure.ClassDefinition")))
												.isMappedToJavaRawType(),
										kermeta.standard.helper.BooleanWrapper
												.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isVoidSwitcher(this
																.getStaticOperation()
																.getBody())));

						if (idIfCond_500) {

							static_call = this.getStaticOperation()
									.getOptimizedStaticCall(context);
						}

					}

				}

			}

		}

		java.lang.Boolean idIfCond_501 = false;
		idIfCond_501 = kermeta.standard.helper.BooleanWrapper
				.and(
						kermeta.standard.helper.BooleanWrapper
								.and(
										kermeta.standard.helper.BooleanWrapper
												.and(
														kermeta.standard.helper.BooleanWrapper
																.and(
																		kermeta.standard.helper.BooleanWrapper
																				.and(
																						kermeta.standard.helper.StringWrapper
																								.equals(
																										fName,
																										"_new"),
																						this
																								.isFromClass()),
																		kermeta.standard.helper.BooleanWrapper
																				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
																						.isInstanceOfSwitcher(
																								tgt,
																								org.kermeta.compil.runtime.ExecutionContext
																										.getInstance()
																										.getMetaClass(
																												"kermeta.language.behavior.CallVariable")))),
														kermeta.standard.helper.BooleanWrapper
																.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
																		.isInstanceOfSwitcher(
																				tgt,
																				org.kermeta.compil.runtime.ExecutionContext
																						.getInstance()
																						.getMetaClass(
																								"kermeta.language.behavior.CallFeature")))),
										kermeta.standard.helper.BooleanWrapper
												.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isInstanceOfSwitcher(
																tgt,
																org.kermeta.compil.runtime.ExecutionContext
																		.getInstance()
																		.getMetaClass(
																				"kermeta.language.behavior.SelfExpression")))),
						kermeta.standard.helper.BooleanWrapper
								.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
										.isInstanceOfSwitcher(
												tgt,
												org.kermeta.compil.runtime.ExecutionContext
														.getInstance()
														.getMetaClass(
																"kermeta.language.behavior.CallResult"))));

		if (idIfCond_501) {

			java.lang.Boolean idIfCond_502 = false;
			idIfCond_502 = kermeta.standard.helper.BooleanWrapper
					.not(kermeta.standard.helper.StringWrapper.isValueType(tgt
							.createBehaviorJava(context), context));

			if (idIfCond_502) {

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
																												"(("),
																								tgt
																										.createBehaviorJava(context)),
																				") "),
																"org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\""),
												tgt.createBehaviorJava(context)),
								"\"))");
			} else {

				result = "null";
			}

		} else {

			java.lang.Boolean idIfCond_503 = false;
			idIfCond_503 = kermeta.standard.helper.BooleanWrapper
					.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
							.isVoidSwitcher(tgt));

			if (idIfCond_503) {

				java.lang.Boolean idIfCond_504 = false;
				idIfCond_504 = kermeta.standard.helper.BooleanWrapper.not(tgt
						.callsFunctionType());

				if (idIfCond_504) {

					java.lang.Boolean idIfCond_505 = false;
					idIfCond_505 = kermeta.standard.helper.BooleanWrapper
							.not(this.callsFunctionType());

					if (idIfCond_505) {

						java.lang.String tgt_staticType_str = "";

						java.lang.Boolean idIfCond_506 = false;
						idIfCond_506 = kermeta.standard.helper.BooleanWrapper
								.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
										.isVoidSwitcher(tgt.getStaticType()));

						if (idIfCond_506) {

							tgt_staticType_str = org.kermeta.compil.runtime.helper.language.ObjectUtil
									.toStringSwitcher(tgt.getStaticType());
						}

						java.lang.Boolean idIfCond_507 = false;
						idIfCond_507 = kermeta.standard.helper.BooleanWrapper
								.and(
										org.kermeta.compil.runtime.helper.language.ObjectUtil
												.isInstanceOfSwitcher(
														tgt,
														org.kermeta.compil.runtime.ExecutionContext
																.getInstance()
																.getMetaClass(
																		"kermeta.language.behavior.TypeLiteral")),
										org.kermeta.compil.runtime.helper.language.ObjectUtil
												.isNotEqualSwitcher(
														tgt_staticType_str,
														"Enumeration"));

						if (idIfCond_507) {

							result = kermeta.standard.helper.StringWrapper
									.plus(
											kermeta.standard.helper.StringWrapper
													.plus(
															kermeta.standard.helper.StringWrapper
																	.plus(
																			result,
																			"org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\""),
															tgt
																	.createBehaviorJava(context)),
											"\")");
						} else {

							result = kermeta.standard.helper.StringWrapper
									.plus(result, tgt
											.createBehaviorJava(context));
						}

						java.lang.Boolean idIfCond_508 = false;
						idIfCond_508 = kermeta.standard.helper.StringWrapper
								.equals(static_call, "");

						if (idIfCond_508) {

							result = kermeta.standard.helper.StringWrapper
									.plus(result, ".");
						}

					} else {

						java.lang.Boolean idIfCond_509 = false;
						idIfCond_509 = kermeta.standard.helper.BooleanWrapper
								.and(
										org.kermeta.compil.runtime.helper.language.ObjectUtil
												.isInstanceOfSwitcher(
														org.kermeta.compil.runtime.helper.language.ObjectUtil
																.containerSwitcher(this),
														org.kermeta.compil.runtime.ExecutionContext
																.getInstance()
																.getMetaClass(
																		"kermeta.language.behavior.CallExpression")),
										kermeta.standard.helper.BooleanWrapper
												.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
														.containerSwitcher(this)
														.callsFunctionType()));

						if (idIfCond_509) {

							java.lang.String resultPrefix = "";

							java.lang.Boolean idIfCond_510 = false;
							idIfCond_510 = org.kermeta.compil.runtime.helper.language.ObjectUtil
									.isVoidSwitcher(this
											.getContainerAsTypeIn(
													org.kermeta.compil.runtime.ExecutionContext
															.getInstance()
															.getMetaClass(
																	"kermeta.language.behavior.Assignment"),
													org.kermeta.compil.runtime.ExecutionContext
															.getInstance()
															.getMetaClass(
																	"kermeta.language.behavior.Block")));

							if (idIfCond_510) {

								resultPrefix = context
										.getRETURN_EXPRESSION_TO_REPLACE_SPECIAL();
							}

							java.lang.Boolean idIfCond_511 = false;
							idIfCond_511 = org.kermeta.compil.runtime.helper.language.ObjectUtil
									.isVoidSwitcher(this
											.getContainerAsTypeIn(
													org.kermeta.compil.runtime.ExecutionContext
															.getInstance()
															.getMetaClass(
																	"kermeta.language.behavior.Assignment"),
													org.kermeta.compil.runtime.ExecutionContext
															.getInstance()
															.getMetaClass(
																	"kermeta.language.structure.Constraint")));

							if (idIfCond_511) {

								resultPrefix = context
										.getRETURN_EXPRESSION_TO_REPLACE_SPECIAL();
							}

							java.lang.Boolean idIfCond_512 = false;
							idIfCond_512 = org.kermeta.compil.runtime.helper.language.ObjectUtil
									.isVoidSwitcher(this
											.getContainerAsTypeIn(
													org.kermeta.compil.runtime.ExecutionContext
															.getInstance()
															.getMetaClass(
																	"kermeta.language.behavior.Assignment"),
													org.kermeta.compil.runtime.ExecutionContext
															.getInstance()
															.getMetaClass(
																	"kermeta.language.structure.Operation")));

							if (idIfCond_512) {

								resultPrefix = context
										.getRETURN_EXPRESSION_TO_REPLACE_SPECIAL();
							}

							java.lang.Boolean idIfCond_513 = false;
							idIfCond_513 = kermeta.standard.helper.BooleanWrapper
									.not(this.isParameter());

							if (idIfCond_513) {

								result = kermeta.standard.helper.StringWrapper
										.plus(
												kermeta.standard.helper.StringWrapper
														.plus(
																kermeta.standard.helper.StringWrapper
																		.plus(
																				kermeta.standard.helper.StringWrapper
																						.plus(
																								result,
																								resultPrefix),
																				context
																						.getPREVIOUS_STATEMENT_FT()),
																context
																		.getRETURN_EXPRESSION_TO_REPLACE()),
												this.getCalledFtResult());
							} else {

								result = kermeta.standard.helper.StringWrapper
										.plus(
												kermeta.standard.helper.StringWrapper
														.plus(
																kermeta.standard.helper.StringWrapper
																		.plus(
																				result,
																				resultPrefix),
																context
																		.getPREVIOUS_STATEMENT_FT()),
												this.getCalledFtResult());
							}

						}

					}

				} else {

					result = kermeta.standard.helper.StringWrapper
							.plus(
									tgt.createBehaviorJava(context),
									kermeta.standard.helper.StringWrapper
											.replace(
													result,
													context
															.getSELF_EXPRESSION_TO_REPLACE(),
													((kermeta.language.behavior.CallFeature) org.kermeta.compil.runtime.helper.language.ObjectUtil
															.asTypeSwitcher(
																	tgt,
																	org.kermeta.compil.runtime.ExecutionContext
																			.getInstance()
																			.getMetaClass(
																					"kermeta.language.behavior.CallFeature")))
															.getCalledFtResult()));
				}

			}

			java.lang.Boolean idIfCond_514 = false;
			idIfCond_514 = kermeta.standard.helper.StringWrapper.equals(
					static_call, "");

			if (idIfCond_514) {

				java.lang.Boolean idIfCond_515 = false;
				idIfCond_515 = this.isCallFeatureAsStaticEnumLiteral();

				if (idIfCond_515) {

					result = kermeta.standard.helper.StringWrapper.plus(
							kermeta.standard.helper.StringWrapper.plus(
									kermeta.standard.helper.StringWrapper.plus(
											result, "getByName(\""), fName),
							"\")");
				} else {

					java.lang.Boolean idIfCond_516 = false;
					idIfCond_516 = this.isCallFeatureAsStaticProperty();

					if (idIfCond_516) {

						java.lang.Boolean idIfCond_517 = false;
						idIfCond_517 = kermeta.standard.helper.BooleanWrapper
								.and(
										org.kermeta.compil.runtime.helper.language.ObjectUtil
												.isNotEqualSwitcher(this
														.getStaticProperty()
														.getUpper(), 1),
										kermeta.standard.helper.BooleanWrapper
												.not(this.isParameterMany()));

						if (idIfCond_517) {

							java.lang.String type_binding = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
									.<kermeta.language.structure.TypeVariableBinding> convertAsOrderedSet(
											((kermeta.language.structure.Class) org.kermeta.compil.runtime.helper.language.ObjectUtil
													.asTypeSwitcher(
															this
																	.getStaticType(),
															org.kermeta.compil.runtime.ExecutionContext
																	.getInstance()
																	.getMetaClass(
																			"kermeta.language.structure.Class")))
													.getTypeParamBinding())
									.first().getType().createBehaviorJava(
											context);

							java.lang.Boolean idIfCond_518 = false;
							idIfCond_518 = kermeta.standard.helper.BooleanWrapper
									.and(
											kermeta.standard.helper.BooleanWrapper
													.not(this
															.getStaticProperty()
															.getIsUnique()),
											kermeta.standard.helper.BooleanWrapper
													.not(this
															.getStaticProperty()
															.getIsOrdered()));

							if (idIfCond_518) {

								result = kermeta.standard.helper.StringWrapper
										.plus(
												kermeta.standard.helper.StringWrapper
														.plus(
																kermeta.standard.helper.StringWrapper
																		.plus(
																				kermeta.standard.helper.StringWrapper
																						.plus(
																								context
																										.getCOLLECTION_UTIL_CLASS(),
																								".<"),
																				type_binding),
																">convertAsBag("),
												result);
							}

							java.lang.Boolean idIfCond_519 = false;
							idIfCond_519 = kermeta.standard.helper.BooleanWrapper
									.and(
											this.getStaticProperty()
													.getIsUnique(),
											kermeta.standard.helper.BooleanWrapper
													.not(this
															.getStaticProperty()
															.getIsOrdered()));

							if (idIfCond_519) {

								result = kermeta.standard.helper.StringWrapper
										.plus(
												kermeta.standard.helper.StringWrapper
														.plus(
																kermeta.standard.helper.StringWrapper
																		.plus(
																				kermeta.standard.helper.StringWrapper
																						.plus(
																								context
																										.getCOLLECTION_UTIL_CLASS(),
																								".<"),
																				type_binding),
																">convertAsSet("),
												result);
							}

							java.lang.Boolean idIfCond_520 = false;
							idIfCond_520 = kermeta.standard.helper.BooleanWrapper
									.and(
											this.getStaticProperty()
													.getIsUnique(), this
													.getStaticProperty()
													.getIsOrdered());

							if (idIfCond_520) {

								result = kermeta.standard.helper.StringWrapper
										.plus(
												kermeta.standard.helper.StringWrapper
														.plus(
																kermeta.standard.helper.StringWrapper
																		.plus(
																				kermeta.standard.helper.StringWrapper
																						.plus(
																								context
																										.getCOLLECTION_UTIL_CLASS(),
																								".<"),
																				type_binding),
																">convertAsOrderedSet("),
												result);
							}

							java.lang.Boolean idIfCond_521 = false;
							idIfCond_521 = kermeta.standard.helper.BooleanWrapper
									.and(kermeta.standard.helper.BooleanWrapper
											.not(this.getStaticProperty()
													.getIsUnique()), this
											.getStaticProperty().getIsOrdered());

							if (idIfCond_521) {

								result = kermeta.standard.helper.StringWrapper
										.plus(
												kermeta.standard.helper.StringWrapper
														.plus(
																kermeta.standard.helper.StringWrapper
																		.plus(
																				kermeta.standard.helper.StringWrapper
																						.plus(
																								context
																										.getCOLLECTION_UTIL_CLASS(),
																								".<"),
																				type_binding),
																">convertAsSequence("),
												result);
							}

							cf_prop_suffix = ")";
						}

						result = kermeta.standard.helper.StringWrapper
								.plus(
										kermeta.standard.helper.StringWrapper
												.plus(
														kermeta.standard.helper.StringWrapper
																.plus(
																		result,
																		this
																				.printGetAccessor(context)),
														"()"), cf_prop_suffix);

						cf_prop_suffix = "";
					} else {

						java.lang.Boolean idIfCond_522 = false;
						idIfCond_522 = kermeta.standard.helper.BooleanWrapper
								.not(this.callsFunctionType());

						if (idIfCond_522) {

							java.lang.Boolean idIfCond_523 = false;
							idIfCond_523 = kermeta.standard.helper.BooleanWrapper
									.and(
											org.kermeta.compil.runtime.helper.language.ObjectUtil
													.isNotEqualSwitcher(
															this
																	.getStaticOperation()
																	.getUpper(),
															1),
											kermeta.standard.helper.BooleanWrapper
													.not(this.isParameterMany()));

							if (idIfCond_523) {

								java.lang.String type_binding = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
										.<kermeta.language.structure.TypeVariableBinding> convertAsOrderedSet(
												((kermeta.language.structure.Class) org.kermeta.compil.runtime.helper.language.ObjectUtil
														.asTypeSwitcher(
																this
																		.getStaticType(),
																org.kermeta.compil.runtime.ExecutionContext
																		.getInstance()
																		.getMetaClass(
																				"kermeta.language.structure.Class")))
														.getTypeParamBinding())
										.first().getType().createBehaviorJava(
												context);

								java.lang.Boolean idIfCond_524 = false;
								idIfCond_524 = kermeta.standard.helper.BooleanWrapper
										.and(
												kermeta.standard.helper.BooleanWrapper
														.not(this
																.getStaticOperation()
																.getIsUnique()),
												kermeta.standard.helper.BooleanWrapper
														.not(this
																.getStaticOperation()
																.getIsOrdered()));

								if (idIfCond_524) {

									result = kermeta.standard.helper.StringWrapper
											.plus(
													kermeta.standard.helper.StringWrapper
															.plus(
																	kermeta.standard.helper.StringWrapper
																			.plus(
																					kermeta.standard.helper.StringWrapper
																							.plus(
																									context
																											.getCOLLECTION_UTIL_CLASS(),
																									".<"),
																					type_binding),
																	">convertAsBag("),
													result);
								}

								java.lang.Boolean idIfCond_525 = false;
								idIfCond_525 = kermeta.standard.helper.BooleanWrapper
										.and(
												this.getStaticOperation()
														.getIsUnique(),
												kermeta.standard.helper.BooleanWrapper
														.not(this
																.getStaticOperation()
																.getIsOrdered()));

								if (idIfCond_525) {

									result = kermeta.standard.helper.StringWrapper
											.plus(
													kermeta.standard.helper.StringWrapper
															.plus(
																	kermeta.standard.helper.StringWrapper
																			.plus(
																					kermeta.standard.helper.StringWrapper
																							.plus(
																									context
																											.getCOLLECTION_UTIL_CLASS(),
																									".<"),
																					type_binding),
																	">convertAsSet("),
													result);
								}

								java.lang.Boolean idIfCond_526 = false;
								idIfCond_526 = kermeta.standard.helper.BooleanWrapper
										.and(this.getStaticOperation()
												.getIsUnique(), this
												.getStaticOperation()
												.getIsOrdered());

								if (idIfCond_526) {

									result = kermeta.standard.helper.StringWrapper
											.plus(
													kermeta.standard.helper.StringWrapper
															.plus(
																	kermeta.standard.helper.StringWrapper
																			.plus(
																					kermeta.standard.helper.StringWrapper
																							.plus(
																									context
																											.getCOLLECTION_UTIL_CLASS(),
																									".<"),
																					type_binding),
																	">convertAsOrderedSet("),
													result);
								}

								java.lang.Boolean idIfCond_527 = false;
								idIfCond_527 = kermeta.standard.helper.BooleanWrapper
										.and(
												kermeta.standard.helper.BooleanWrapper
														.not(this
																.getStaticOperation()
																.getIsUnique()),
												this.getStaticOperation()
														.getIsOrdered());

								if (idIfCond_527) {

									result = kermeta.standard.helper.StringWrapper
											.plus(
													kermeta.standard.helper.StringWrapper
															.plus(
																	kermeta.standard.helper.StringWrapper
																			.plus(
																					kermeta.standard.helper.StringWrapper
																							.plus(
																									context
																											.getCOLLECTION_UTIL_CLASS(),
																									".<"),
																					type_binding),
																	">convertAsSequence("),
													result);
								}

								cf_prop_suffix = ")";
							}

							result = kermeta.standard.helper.StringWrapper
									.plus(result, this.getStaticOperation()
											.getFinalName(context));
						} else {

							java.lang.Boolean idIfCond_528 = false;
							idIfCond_528 = kermeta.standard.helper.BooleanWrapper
									.and(
											org.kermeta.compil.runtime.helper.language.ObjectUtil
													.isInstanceOfSwitcher(
															org.kermeta.compil.runtime.helper.language.ObjectUtil
																	.containerSwitcher(this),
															org.kermeta.compil.runtime.ExecutionContext
																	.getInstance()
																	.getMetaClass(
																			"kermeta.language.behavior.CallExpression")),
											kermeta.standard.helper.BooleanWrapper
													.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
															.containerSwitcher(
																	this)
															.callsFunctionType()));

							if (idIfCond_528) {

								java.lang.Boolean idIfCond_529 = false;
								idIfCond_529 = org.kermeta.compil.runtime.helper.language.ObjectUtil
										.isInstanceOfSwitcher(
												org.kermeta.compil.runtime.helper.language.ObjectUtil
														.containerSwitcher(this),
												org.kermeta.compil.runtime.ExecutionContext
														.getInstance()
														.getMetaClass(
																"kermeta.language.behavior.CallFeature"));

								if (idIfCond_529) {

									kermeta.language.behavior.CallFeature cf_ = ((kermeta.language.behavior.CallFeature) org.kermeta.compil.runtime.helper.language.ObjectUtil
											.asTypeSwitcher(
													org.kermeta.compil.runtime.helper.language.ObjectUtil
															.containerSwitcher(this),
													org.kermeta.compil.runtime.ExecutionContext
															.getInstance()
															.getMetaClass(
																	"kermeta.language.behavior.CallFeature")));

									java.lang.Boolean idIfCond_530 = false;
									idIfCond_530 = kermeta.standard.helper.BooleanWrapper
											.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
													.isVoidSwitcher(cf_
															.getStaticOperation()));

									if (idIfCond_530) {

										java.lang.Boolean idIfCond_531 = false;
										idIfCond_531 = kermeta.standard.helper.BooleanWrapper
												.or(
														kermeta.standard.helper.BooleanWrapper
																.or(
																		cf_
																				.fromUtil(context),
																		this
																				.isParameter()),
														org.kermeta.compil.runtime.helper.language.ObjectUtil
																.isNotEqualSwitcher(
																		cf_
																				.getStaticOperation()
																				.getCompiledJavaExtern(),
																		""));

										if (idIfCond_531) {
										} else {

											result = kermeta.standard.helper.StringWrapper
													.plus(result, ".");
										}

									} else {

										java.lang.Boolean idIfCond_532 = false;
										idIfCond_532 = kermeta.standard.helper.BooleanWrapper
												.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isVoidSwitcher(cf_
																.getStaticProperty()));

										if (idIfCond_532) {

											result = kermeta.standard.helper.StringWrapper
													.plus(result, ".");
										}

									}

								}

							}

						}

					}

				}

			} else {

				java.lang.Boolean idIfCond_533 = false;
				idIfCond_533 = kermeta.standard.helper.StringWrapper.contains(
						result, context.getRETURN_EXPRESSION_TO_REPLACE());

				if (idIfCond_533) {

					result = kermeta.standard.helper.StringWrapper.replace(
							result, context.getRETURN_EXPRESSION_TO_REPLACE(),
							kermeta.standard.helper.StringWrapper.plus(
									static_call, "("));
				} else {

					java.lang.String tmp_prefix = "";

					//BIft:detect

					kermeta.language.behavior.Expression result_ft133 = null;

					kermeta.language.behavior.Expression elem_ft133 = null;

					result_ft133 = null;

					{

						kermeta.standard.Iterator<kermeta.language.behavior.Expression> it_ft133 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
								.<kermeta.language.behavior.Expression> convertAsOrderedSet(
										this.getParameters()).iterator();
						java.lang.Boolean idLoopCond_535 = false;
						while (!idLoopCond_535) {
							idLoopCond_535 = kermeta.standard.helper.BooleanWrapper
									.or(
											it_ft133.isOff(),
											org.kermeta.compil.runtime.helper.language.ObjectUtil
													.isNotEqualSwitcher(
															result_ft133, null));
							if (idLoopCond_535) {
							} else {

								elem_ft133 = it_ft133.next();

								java.lang.Boolean idIfCond_536 = false;
								//BIle:detector
								kermeta.language.behavior.Expression p_lbdExp133 = elem_ft133;

								idIfCond_536 = p_lbdExp133.callsFunctionType();
								//EIle:detector

								if (idIfCond_536) {

									result_ft133 = elem_ft133;
								}

							}
						}
					}

					//EIft:detect
					java.lang.Boolean idIfCond_534 = false;
					idIfCond_534 = kermeta.standard.helper.BooleanWrapper
							.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
									.isVoidSwitcher(result_ft133));

					if (idIfCond_534) {

						tmp_prefix = context.getRETURN_EXPRESSION_TO_REPLACE();
					}

					result = kermeta.standard.helper.StringWrapper.plus(
							kermeta.standard.helper.StringWrapper.plus(
									kermeta.standard.helper.StringWrapper.plus(
											tmp_prefix, static_call), "("),
							result);
				}

				java.lang.Boolean idIfCond_537 = false;
				idIfCond_537 = ppCast;

				if (idIfCond_537) {

					result = kermeta.standard.helper.StringWrapper.plus("(",
							result);
				}

			}

			java.lang.Boolean idIfCond_538 = false;
			idIfCond_538 = kermeta.standard.helper.BooleanWrapper.and(this
					.isCallFeatureAsStaticOperation(),
					kermeta.standard.helper.BooleanWrapper.not(this
							.callsFunctionType()));

			if (idIfCond_538) {

				java.lang.Boolean idIfCond_539 = false;
				idIfCond_539 = kermeta.standard.helper.StringWrapper.equals(
						static_call, "");

				if (idIfCond_539) {

					result = kermeta.standard.helper.StringWrapper.plus(result,
							"(");
				} else {

					static_call = "";

					java.lang.Boolean idIfCond_540 = false;
					idIfCond_540 = kermeta.standard.helper.BooleanWrapper
							.and(
									kermeta.standard.helper.BooleanWrapper
											.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
													.isVoidSwitcher(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
															.<kermeta.language.behavior.Expression> convertAsOrderedSet(this
																	.getParameters()))),
									kermeta.standard.helper.IntegerWrapper
											.isGreater(
													org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
															.<kermeta.language.behavior.Expression> convertAsOrderedSet(
																	this
																			.getParameters())
															.size(), 0));

					if (idIfCond_540) {

						result = kermeta.standard.helper.StringWrapper.plus(
								result, ", ");
					}

				}

				this.setBeforeLambdaExpressionResult("");

				result = kermeta.standard.helper.StringWrapper
						.plus(
								kermeta.standard.helper.StringWrapper
										.plus(
												kermeta.standard.helper.StringWrapper
														.plus(
																result,
																((km2ecore.helper.kermeta.CompilerHelperJava) org.kermeta.compil.runtime.helper.language.ClassUtil
																		.newObject("km2ecore.helper.kermeta.CompilerHelperJava"))
																		.ppComaSeparatedNodes(
																				org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
																						.<kermeta.language.behavior.Expression> convertAsOrderedSet(this
																								.getParameters()),
																				context)),
												")"), cf_prop_suffix);

				context.setBeforeLambdaExpressionResult(this
						.getBeforeLambdaExpressionResult());

				this.setBeforeLambdaExpressionResult("");

				java.lang.Boolean idIfCond_541 = false;
				idIfCond_541 = ppCast;

				if (idIfCond_541) {

					result = kermeta.standard.helper.StringWrapper.plus(result,
							")");

					ppCast = false;
				}

			}

		}

		result = kermeta.standard.helper.StringWrapper.plus(result, this
				.endOfExpressionFixer());

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getParamBindings() {

		java.lang.String result = null;

		result = "";

		java.lang.Integer i = 0;

		//BIft:each

		{

			kermeta.standard.Iterator<kermeta.language.behavior.Expression> it_ft134 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.behavior.Expression> convertAsOrderedSet(
							this.getParameters()).iterator();
			java.lang.Boolean idLoopCond_542 = false;
			while (!idLoopCond_542) {
				idLoopCond_542 = it_ft134.isOff();
				if (idLoopCond_542) {
				} else {

					//BIle:func
					kermeta.language.behavior.Expression param_lbdExp134 = it_ft134
							.next();

					java.lang.Boolean idIfCond_543 = false;
					idIfCond_543 = org.kermeta.compil.runtime.helper.language.ObjectUtil
							.isInstanceOfSwitcher(
									param_lbdExp134,
									org.kermeta.compil.runtime.ExecutionContext
											.getInstance()
											.getMetaClass(
													"kermeta.language.behavior.LambdaExpression"));

					if (idIfCond_543) {

						java.lang.Boolean idIfCond_544 = false;
						idIfCond_544 = org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isInstanceOfSwitcher(
										((kermeta.language.behavior.LambdaExpression) org.kermeta.compil.runtime.helper.language.ObjectUtil
												.asTypeSwitcher(
														param_lbdExp134,
														org.kermeta.compil.runtime.ExecutionContext
																.getInstance()
																.getMetaClass(
																		"kermeta.language.behavior.LambdaExpression")))
												.getStaticType(),
										org.kermeta.compil.runtime.ExecutionContext
												.getInstance()
												.getMetaClass(
														"kermeta.language.structure.ProductType"));

						if (idIfCond_544) {

							//BIft:each

							{

								kermeta.standard.Iterator<kermeta.language.structure.Type> it_ft135 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
										.<kermeta.language.structure.Type> convertAsSequence(
												((kermeta.language.structure.ProductType) org.kermeta.compil.runtime.helper.language.ObjectUtil
														.asTypeSwitcher(
																((kermeta.language.behavior.LambdaExpression) org.kermeta.compil.runtime.helper.language.ObjectUtil
																		.asTypeSwitcher(
																				param_lbdExp134,
																				org.kermeta.compil.runtime.ExecutionContext
																						.getInstance()
																						.getMetaClass(
																								"kermeta.language.behavior.LambdaExpression")))
																		.getStaticType(),
																org.kermeta.compil.runtime.ExecutionContext
																		.getInstance()
																		.getMetaClass(
																				"kermeta.language.structure.ProductType")))
														.getType()).iterator();
								java.lang.Boolean idLoopCond_545 = false;
								while (!idLoopCond_545) {
									idLoopCond_545 = it_ft135.isOff();
									if (idLoopCond_545) {
									} else {

										//BIle:func
										kermeta.language.structure.Type t_lbdExp135 = it_ft135
												.next();

										java.lang.Boolean idIfCond_546 = false;
										idIfCond_546 = kermeta.standard.helper.IntegerWrapper
												.equals(i, 1);

										if (idIfCond_546) {

											result = kermeta.standard.helper.StringWrapper
													.plus(result, ", ");
										} else {

											i = 1;
										}

										result = kermeta.standard.helper.StringWrapper
												.plus(result, t_lbdExp135
														.getTypeQName());
										//EIle:func

									}
								}
							}

							//EIft:each

						}

					}

					//EIle:func

				}
			}
		}

		//EIft:each

		java.lang.Boolean idIfCond_547 = false;
		idIfCond_547 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isNotEqualSwitcher(result, "");

		if (idIfCond_547) {

			result = kermeta.standard.helper.StringWrapper.plus(
					kermeta.standard.helper.StringWrapper.plus("<", result),
					">");
		}

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getFunctionTypeReturnType() {

		kermeta.language.structure.Type result = null;

		result = null;

		java.lang.Boolean idIfCond_548 = false;
		idIfCond_548 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoidSwitcher(this.getFunctionType()));

		if (idIfCond_548) {

			result = this.getFunctionType().getRight();
		}

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean isFromClass() {

		java.lang.Boolean result = null;

		result = false;

		java.lang.Boolean idIfCond_549 = false;
		idIfCond_549 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoidSwitcher(this.getStaticOperation()));

		if (idIfCond_549) {

			java.lang.Boolean idIfCond_550 = false;
			idIfCond_550 = kermeta.standard.helper.StringWrapper
					.equals(
							((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil
									.asTypeSwitcher(
											org.kermeta.compil.runtime.helper.language.ObjectUtil
													.containerSwitcher(this
															.getStaticOperation()),
											org.kermeta.compil.runtime.ExecutionContext
													.getInstance()
													.getMetaClass(
															"kermeta.language.structure.ClassDefinition")))
									.qualifiedName(),
							"kermeta::language::structure::Class");

			if (idIfCond_550) {

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
	public String printGetAccessor(KM2EcoreContext context) {

		java.lang.String result = null;

		result = this.getStaticProperty().printGetAccessor(context);

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String printSetAccessor(KM2EcoreContext context) {

		java.lang.String result = null;

		result = this.getStaticProperty().printSetAccessor(context);

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean isParameter() {

		java.lang.Boolean result = null;

		result = false;

		java.lang.Boolean idIfCond_551 = false;
		idIfCond_551 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isInstanceOfSwitcher(
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.containerSwitcher(this),
						org.kermeta.compil.runtime.ExecutionContext
								.getInstance()
								.getMetaClass(
										"kermeta.language.behavior.CallFeature"));

		if (idIfCond_551) {

			//BIft:detect

			kermeta.language.behavior.Expression result_ft136 = null;

			kermeta.language.behavior.Expression elem_ft136 = null;

			result_ft136 = null;

			{

				kermeta.standard.Iterator<kermeta.language.behavior.Expression> it_ft136 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<kermeta.language.behavior.Expression> convertAsOrderedSet(
								((kermeta.language.behavior.CallFeature) org.kermeta.compil.runtime.helper.language.ObjectUtil
										.asTypeSwitcher(
												org.kermeta.compil.runtime.helper.language.ObjectUtil
														.containerSwitcher(this),
												org.kermeta.compil.runtime.ExecutionContext
														.getInstance()
														.getMetaClass(
																"kermeta.language.behavior.CallFeature")))
										.getParameters()).iterator();
				java.lang.Boolean idLoopCond_552 = false;
				while (!idLoopCond_552) {
					idLoopCond_552 = kermeta.standard.helper.BooleanWrapper
							.or(
									it_ft136.isOff(),
									org.kermeta.compil.runtime.helper.language.ObjectUtil
											.isNotEqualSwitcher(result_ft136,
													null));
					if (idLoopCond_552) {
					} else {

						elem_ft136 = it_ft136.next();

						java.lang.Boolean idIfCond_553 = false;
						//BIle:detector
						kermeta.language.behavior.Expression p_lbdExp136 = elem_ft136;

						idIfCond_553 = org.kermeta.compil.runtime.helper.language.ObjectUtil
								.equalsSwitcher(p_lbdExp136, this);
						//EIle:detector

						if (idIfCond_553) {

							result_ft136 = elem_ft136;
						}

					}
				}
			}

			//EIft:detect
			result = kermeta.standard.helper.BooleanWrapper
					.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
							.isVoidSwitcher(result_ft136));
		}

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createStringFromFunctionType(KM2EcoreContext context) {

		java.lang.String result = null;

		kermeta.language.behavior.Expression tgt = this.getTarget();

		kermeta.utils.Hashtable<kermeta.language.structure.Type, kermeta.language.structure.Type> map_type = ((kermeta.utils.Hashtable<kermeta.language.structure.Type, kermeta.language.structure.Type>) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject("kermeta.utils.Hashtable<kermeta.language.structure.Type, kermeta.language.structure.Type>"));

		java.lang.Integer inc_tp = 0;

		//BIft:each

		{

			kermeta.standard.Iterator<kermeta.language.structure.Type> it_ft137 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Type> convertAsOrderedSet(
							this.getStaticTypeVariableBindings()).iterator();
			java.lang.Boolean idLoopCond_554 = false;
			while (!idLoopCond_554) {
				idLoopCond_554 = it_ft137.isOff();
				if (idLoopCond_554) {
				} else {

					//BIle:func
					kermeta.language.structure.Type type__lbdExp137 = it_ft137
							.next();

					map_type
							.put(
									org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
											.<kermeta.language.structure.TypeVariable> convertAsOrderedSet(
													this.getStaticOperation()
															.getTypeParameter())
											.elementAt(inc_tp), type__lbdExp137);

					inc_tp = kermeta.standard.helper.IntegerWrapper.plus(
							inc_tp, 1);
					//EIle:func

				}
			}
		}

		//EIft:each

		context.getFtMapTypeStack().push(map_type);

		context.pushFtSuffix();

		kermeta.language.structure.Type ftRightType = ((kermeta.language.structure.Type) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject("kermeta.language.structure.Type"));

		//BIft:detect

		kermeta.language.behavior.Expression result_ft138 = null;

		kermeta.language.behavior.Expression elem_ft138 = null;

		result_ft138 = null;

		{

			kermeta.standard.Iterator<kermeta.language.behavior.Expression> it_ft138 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.behavior.Expression> convertAsOrderedSet(
							this.getParameters()).iterator();
			java.lang.Boolean idLoopCond_556 = false;
			while (!idLoopCond_556) {
				idLoopCond_556 = kermeta.standard.helper.BooleanWrapper.or(
						it_ft138.isOff(),
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isNotEqualSwitcher(result_ft138, null));
				if (idLoopCond_556) {
				} else {

					elem_ft138 = it_ft138.next();

					java.lang.Boolean idIfCond_557 = false;
					//BIle:detector
					kermeta.language.behavior.Expression param_lbdExp138 = elem_ft138;

					idIfCond_557 = org.kermeta.compil.runtime.helper.language.ObjectUtil
							.isInstanceOfSwitcher(
									param_lbdExp138,
									org.kermeta.compil.runtime.ExecutionContext
											.getInstance()
											.getMetaClass(
													"kermeta.language.behavior.LambdaExpression"));
					//EIle:detector

					if (idIfCond_557) {

						result_ft138 = elem_ft138;
					}

				}
			}
		}

		//EIft:detect
		java.lang.Boolean idIfCond_555 = false;
		idIfCond_555 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoidSwitcher(result_ft138));

		if (idIfCond_555) {

			//BIft:detect

			kermeta.language.behavior.Expression result_ft139 = null;

			kermeta.language.behavior.Expression elem_ft139 = null;

			result_ft139 = null;

			{

				kermeta.standard.Iterator<kermeta.language.behavior.Expression> it_ft139 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<kermeta.language.behavior.Expression> convertAsOrderedSet(
								this.getParameters()).iterator();
				java.lang.Boolean idLoopCond_558 = false;
				while (!idLoopCond_558) {
					idLoopCond_558 = kermeta.standard.helper.BooleanWrapper
							.or(
									it_ft139.isOff(),
									org.kermeta.compil.runtime.helper.language.ObjectUtil
											.isNotEqualSwitcher(result_ft139,
													null));
					if (idLoopCond_558) {
					} else {

						elem_ft139 = it_ft139.next();

						java.lang.Boolean idIfCond_559 = false;
						//BIle:detector
						kermeta.language.behavior.Expression param_lbdExp139 = elem_ft139;

						idIfCond_559 = org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isInstanceOfSwitcher(
										param_lbdExp139,
										org.kermeta.compil.runtime.ExecutionContext
												.getInstance()
												.getMetaClass(
														"kermeta.language.behavior.LambdaExpression"));
						//EIle:detector

						if (idIfCond_559) {

							result_ft139 = elem_ft139;
						}

					}
				}
			}

			//EIft:detect
			kermeta.language.behavior.LambdaExpression theLambdaExp = ((kermeta.language.behavior.LambdaExpression) org.kermeta.compil.runtime.helper.language.ObjectUtil
					.asTypeSwitcher(
							result_ft139,
							org.kermeta.compil.runtime.ExecutionContext
									.getInstance()
									.getMetaClass(
											"kermeta.language.behavior.LambdaExpression")));

			context.getFtStack().push(theLambdaExp);

			this.getStaticOperation().setLambdaExpression(theLambdaExp);

			theLambdaExp.setCuid(kermeta.standard.helper.IntegerWrapper
					.toString(context.getInc_ftSuffix()));

			this.getStaticOperation().setCuid(
					kermeta.standard.helper.IntegerWrapper.toString(context
							.getInc_ftSuffix()));

			java.lang.Boolean idIfCond_560 = false;
			idIfCond_560 = org.kermeta.compil.runtime.helper.language.ObjectUtil
					.isInstanceOfSwitcher(
							theLambdaExp.getStaticType(),
							org.kermeta.compil.runtime.ExecutionContext
									.getInstance()
									.getMetaClass(
											"kermeta.language.structure.FunctionType"));

			if (idIfCond_560) {

				kermeta.language.structure.FunctionType current_functionType = ((kermeta.language.structure.FunctionType) org.kermeta.compil.runtime.helper.language.ObjectUtil
						.asTypeSwitcher(
								theLambdaExp.getStaticType(),
								org.kermeta.compil.runtime.ExecutionContext
										.getInstance()
										.getMetaClass(
												"kermeta.language.structure.FunctionType")));

				java.lang.Boolean idIfCond_561 = false;
				idIfCond_561 = org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isInstanceOfSwitcher(
								current_functionType.getLeft(),
								org.kermeta.compil.runtime.ExecutionContext
										.getInstance()
										.getMetaClass(
												"kermeta.language.structure.ProductType"));

				if (idIfCond_561) {

					context
							.getFtProductTypeStack()
							.push(
									((kermeta.language.structure.ProductType) org.kermeta.compil.runtime.helper.language.ObjectUtil
											.asTypeSwitcher(
													current_functionType
															.getLeft(),
													org.kermeta.compil.runtime.ExecutionContext
															.getInstance()
															.getMetaClass(
																	"kermeta.language.structure.ProductType"))));
				}

				ftRightType = current_functionType.getRight();
			}

		}

		java.lang.String ft_str = "";

		java.lang.Boolean idIfCond_562 = false;
		idIfCond_562 = tgt.callsFunctionType();

		if (idIfCond_562) {

			context.setFtSuffixActivation(true);

			context
					.setFtContextualSelf(context
							.getSELF_EXPRESSION_TO_REPLACE());
		} else {

			context.setFtContextualSelf(tgt.createBehaviorJava(context));
		}

		context.setFtSuffixActivation(true);

		java.lang.String callElement = "";

		java.lang.Boolean idIfCond_563 = false;
		idIfCond_563 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isInstanceOfSwitcher(
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.containerSwitcher(this),
						org.kermeta.compil.runtime.ExecutionContext
								.getInstance()
								.getMetaClass(
										"kermeta.language.behavior.VariableDecl"));

		if (idIfCond_563) {

			callElement = ((km2ecore.helper.java.IdentifierHelper) org.kermeta.compil.runtime.helper.language.ClassUtil
					.newObject("km2ecore.helper.java.IdentifierHelper"))
					.getMangledIdentifier(
							((kermeta.language.behavior.VariableDecl) org.kermeta.compil.runtime.helper.language.ObjectUtil
									.asTypeSwitcher(
											org.kermeta.compil.runtime.helper.language.ObjectUtil
													.containerSwitcher(this),
											org.kermeta.compil.runtime.ExecutionContext
													.getInstance()
													.getMetaClass(
															"kermeta.language.behavior.VariableDecl")))
									.getIdentifier(), context);
		} else {

			java.lang.Boolean idIfCond_564 = false;
			idIfCond_564 = org.kermeta.compil.runtime.helper.language.ObjectUtil
					.isInstanceOfSwitcher(
							org.kermeta.compil.runtime.helper.language.ObjectUtil
									.containerSwitcher(this),
							org.kermeta.compil.runtime.ExecutionContext
									.getInstance()
									.getMetaClass(
											"kermeta.language.behavior.CallVariable"));

			if (idIfCond_564) {

				org.kermeta.compil.runtime.helper.io.StdIOUtil
						.getInstance()
						.writeln(
								"Please contact the development team if you have this case !");

				callElement = ((km2ecore.helper.java.IdentifierHelper) org.kermeta.compil.runtime.helper.language.ClassUtil
						.newObject("km2ecore.helper.java.IdentifierHelper"))
						.getMangledIdentifier(
								((kermeta.language.behavior.CallVariable) org.kermeta.compil.runtime.helper.language.ObjectUtil
										.asTypeSwitcher(
												org.kermeta.compil.runtime.helper.language.ObjectUtil
														.containerSwitcher(this),
												org.kermeta.compil.runtime.ExecutionContext
														.getInstance()
														.getMetaClass(
																"kermeta.language.behavior.CallVariable")))
										.getName(), context);
			}

		}

		java.lang.Boolean idIfCond_565 = false;
		idIfCond_565 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isNotEqualSwitcher(callElement, "");

		if (idIfCond_565) {

			ft_str = kermeta.standard.helper.StringWrapper.plus(ft_str,
					"null;\n");
		}

		java.lang.Boolean idIfCond_566 = false;
		idIfCond_566 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isInstanceOfSwitcher(
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.containerSwitcher(this),
						org.kermeta.compil.runtime.ExecutionContext
								.getInstance().getMetaClass(
										"kermeta.language.behavior.Assignment"));

		if (idIfCond_566) {

			java.lang.Boolean idIfCond_567 = false;
			idIfCond_567 = org.kermeta.compil.runtime.helper.language.ObjectUtil
					.isInstanceOfSwitcher(
							((kermeta.language.behavior.Assignment) org.kermeta.compil.runtime.helper.language.ObjectUtil
									.asTypeSwitcher(
											org.kermeta.compil.runtime.helper.language.ObjectUtil
													.containerSwitcher(this),
											org.kermeta.compil.runtime.ExecutionContext
													.getInstance()
													.getMetaClass(
															"kermeta.language.behavior.Assignment")))
									.getTarget(),
							org.kermeta.compil.runtime.ExecutionContext
									.getInstance()
									.getMetaClass(
											"kermeta.language.behavior.CallResult"));

			if (idIfCond_567) {

				callElement = ((kermeta.language.behavior.Assignment) org.kermeta.compil.runtime.helper.language.ObjectUtil
						.asTypeSwitcher(
								org.kermeta.compil.runtime.helper.language.ObjectUtil
										.containerSwitcher(this),
								org.kermeta.compil.runtime.ExecutionContext
										.getInstance()
										.getMetaClass(
												"kermeta.language.behavior.Assignment")))
						.getTarget().createBehaviorJava(context);
			}

			java.lang.Boolean idIfCond_568 = false;
			idIfCond_568 = org.kermeta.compil.runtime.helper.language.ObjectUtil
					.isInstanceOfSwitcher(
							((kermeta.language.behavior.Assignment) org.kermeta.compil.runtime.helper.language.ObjectUtil
									.asTypeSwitcher(
											org.kermeta.compil.runtime.helper.language.ObjectUtil
													.containerSwitcher(this),
											org.kermeta.compil.runtime.ExecutionContext
													.getInstance()
													.getMetaClass(
															"kermeta.language.behavior.Assignment")))
									.getTarget(),
							org.kermeta.compil.runtime.ExecutionContext
									.getInstance()
									.getMetaClass(
											"kermeta.language.behavior.CallVariable"));

			if (idIfCond_568) {

				callElement = ((kermeta.language.behavior.Assignment) org.kermeta.compil.runtime.helper.language.ObjectUtil
						.asTypeSwitcher(
								org.kermeta.compil.runtime.helper.language.ObjectUtil
										.containerSwitcher(this),
								org.kermeta.compil.runtime.ExecutionContext
										.getInstance()
										.getMetaClass(
												"kermeta.language.behavior.Assignment")))
						.getTarget().createBehaviorJava(context);
			}

		}

		ft_str = kermeta.standard.helper.StringWrapper
				.plus(
						kermeta.standard.helper.StringWrapper
								.plus(
										kermeta.standard.helper.StringWrapper
												.plus(
														kermeta.standard.helper.StringWrapper
																.plus(
																		ft_str,
																		context
																				.getSEPARATOR_STATEMENT_FT()),
														"//BIft:"), this
												.getStaticOperation().getName()),
						"\n");

		context.setFtSuffixActivation(false);

		java.lang.String type_ftReturnType = this.getStaticType()
				.createBehaviorJava(context);

		context.setFtSuffixActivation(true);

		context.setFtReturnType(type_ftReturnType);

		ft_str = kermeta.standard.helper.StringWrapper.plus(ft_str, this
				.getStaticOperation().createBehaviorJava(context));

		java.lang.Boolean idIfCond_569 = false;
		idIfCond_569 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isNotEqualSwitcher(callElement, "");

		if (idIfCond_569) {

			ft_str = kermeta.standard.helper.StringWrapper.plus(ft_str,
					"\n//CE\n");

			java.lang.Boolean idIfCond_570 = false;
			idIfCond_570 = org.kermeta.compil.runtime.helper.language.ObjectUtil
					.isNotEqualSwitcher(context.getResultLastStatementId(), "");

			if (idIfCond_570) {

				ft_str = kermeta.standard.helper.StringWrapper
						.plus(
								kermeta.standard.helper.StringWrapper
										.plus(
												kermeta.standard.helper.StringWrapper
														.plus(
																kermeta.standard.helper.StringWrapper
																		.plus(
																				ft_str,
																				context
																						.getResultLastStatementId()),
																"result"),
												context.printFtSuffix()), ";\n");
			} else {

				ft_str = kermeta.standard.helper.StringWrapper.plus(
						kermeta.standard.helper.StringWrapper.plus(
								kermeta.standard.helper.StringWrapper.plus(
										kermeta.standard.helper.StringWrapper
												.plus(ft_str, callElement),
										" = result"), context.printFtSuffix()),
						";\n");
			}

		}

		java.lang.Boolean idIfCond_571 = false;
		idIfCond_571 = kermeta.standard.helper.BooleanWrapper
				.and(
						kermeta.standard.helper.StringWrapper.equals(
								callElement, ""),
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isInstanceOfSwitcher(
										org.kermeta.compil.runtime.helper.language.ObjectUtil
												.containerSwitcher(this),
										org.kermeta.compil.runtime.ExecutionContext
												.getInstance()
												.getMetaClass(
														"kermeta.language.behavior.Assignment")));

		if (idIfCond_571) {

			java.lang.Boolean idIfCond_572 = false;
			idIfCond_572 = org.kermeta.compil.runtime.helper.language.ObjectUtil
					.isInstanceOfSwitcher(
							((kermeta.language.behavior.Assignment) org.kermeta.compil.runtime.helper.language.ObjectUtil
									.asTypeSwitcher(
											org.kermeta.compil.runtime.helper.language.ObjectUtil
													.containerSwitcher(this),
											org.kermeta.compil.runtime.ExecutionContext
													.getInstance()
													.getMetaClass(
															"kermeta.language.behavior.Assignment")))
									.getTarget(),
							org.kermeta.compil.runtime.ExecutionContext
									.getInstance()
									.getMetaClass(
											"kermeta.language.behavior.CallResult"));

			if (idIfCond_572) {

				ft_str = kermeta.standard.helper.StringWrapper.plus(ft_str,
						"\n//CER\n");

				ft_str = kermeta.standard.helper.StringWrapper
						.plus(
								kermeta.standard.helper.StringWrapper
										.plus(
												kermeta.standard.helper.StringWrapper
														.plus(
																kermeta.standard.helper.StringWrapper
																		.plus(
																				ft_str,
																				context
																						.getRETURN_EXPRESSION_TO_REPLACE()),
																"result"),
												context.printFtSuffix()), ";\n");
			}

		}

		java.lang.Boolean idIfCond_573 = false;
		idIfCond_573 = kermeta.standard.helper.BooleanWrapper
				.and(
						kermeta.standard.helper.StringWrapper.equals(
								callElement, ""),
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isInstanceOfSwitcher(
										org.kermeta.compil.runtime.helper.language.ObjectUtil
												.containerSwitcher(this),
										org.kermeta.compil.runtime.ExecutionContext
												.getInstance()
												.getMetaClass(
														"kermeta.language.behavior.Conditional")));

		if (idIfCond_573) {

			ft_str = kermeta.standard.helper.StringWrapper.plus(ft_str,
					"\n//CEC\n");

			ft_str = kermeta.standard.helper.StringWrapper
					.plus(
							kermeta.standard.helper.StringWrapper
									.plus(
											kermeta.standard.helper.StringWrapper
													.plus(
															kermeta.standard.helper.StringWrapper
																	.plus(
																			ft_str,
																			context
																					.getResultLastStatementId()),
															"result"), context
													.printFtSuffix()), ";\n");
		}

		java.lang.Boolean idIfCond_574 = false;
		idIfCond_574 = kermeta.standard.helper.BooleanWrapper
				.and(
						kermeta.standard.helper.StringWrapper.equals(
								callElement, ""),
						kermeta.standard.helper.BooleanWrapper
								.not(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ClassUtil
										.newObject("kermeta.language.structure.Operation"))
										.isVoidType(this.getStaticType()
												.getTypeName())));

		if (idIfCond_574) {

			this.setCalledFtResult(kermeta.standard.helper.StringWrapper.plus(
					"result", context.printFtSuffix()));
		}

		ft_str = kermeta.standard.helper.StringWrapper.plus(
				kermeta.standard.helper.StringWrapper
						.plus(kermeta.standard.helper.StringWrapper.plus(
								ft_str, "//EIft:"), this.getStaticOperation()
								.getName()), "\n");

		context.setFtSuffixActivation(false);

		context.getFtMapTypeStack().pop();

		context.getFtProductTypeStack().pop();

		context.getFtSuffix().pop();

		result = ft_str;

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean isParameterMany() {

		java.lang.Boolean result = null;

		result = false;

		java.lang.Boolean idIfCond_575 = false;
		idIfCond_575 = this.isParameter();

		if (idIfCond_575) {

			kermeta.language.behavior.CallFeature cf_ = ((kermeta.language.behavior.CallFeature) org.kermeta.compil.runtime.helper.language.ObjectUtil
					.asTypeSwitcher(
							org.kermeta.compil.runtime.helper.language.ObjectUtil
									.containerSwitcher(this),
							org.kermeta.compil.runtime.ExecutionContext
									.getInstance()
									.getMetaClass(
											"kermeta.language.behavior.CallFeature")));

			java.lang.Integer i = kermeta.standard.helper.IntegerWrapper
					.uminus(1);

			kermeta.language.behavior.Expression exp = null;
			//BIft:detect

			kermeta.language.behavior.Expression result_ft140 = null;

			kermeta.language.behavior.Expression elem_ft140 = null;

			result_ft140 = null;

			{

				kermeta.standard.Iterator<kermeta.language.behavior.Expression> it_ft140 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<kermeta.language.behavior.Expression> convertAsOrderedSet(
								cf_.getParameters()).iterator();
				java.lang.Boolean idLoopCond_576 = false;
				while (!idLoopCond_576) {
					idLoopCond_576 = kermeta.standard.helper.BooleanWrapper
							.or(
									it_ft140.isOff(),
									org.kermeta.compil.runtime.helper.language.ObjectUtil
											.isNotEqualSwitcher(result_ft140,
													null));
					if (idLoopCond_576) {
					} else {

						elem_ft140 = it_ft140.next();

						java.lang.Boolean idIfCond_577 = false;
						//BIle:detector
						kermeta.language.behavior.Expression p_lbdExp140 = elem_ft140;

						i = kermeta.standard.helper.IntegerWrapper.plus(i, 1);

						idIfCond_577 = org.kermeta.compil.runtime.helper.language.ObjectUtil
								.equalsSwitcher(p_lbdExp140, this);
						//EIle:detector

						if (idIfCond_577) {

							result_ft140 = elem_ft140;
						}

					}
				}
			}

			//CE
			exp = result_ft140;
			//EIft:detect

			java.lang.Boolean idIfCond_578 = false;
			idIfCond_578 = org.kermeta.compil.runtime.helper.language.ObjectUtil
					.isNotEqualSwitcher(
							((kermeta.language.structure.Parameter) org.kermeta.compil.runtime.helper.language.ObjectUtil
									.asTypeSwitcher(
											org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
													.<kermeta.language.structure.Parameter> convertAsOrderedSet(
															cf_
																	.getStaticOperation()
																	.getOwnedParameter())
													.elementAt(i),
											org.kermeta.compil.runtime.ExecutionContext
													.getInstance()
													.getMetaClass(
															"kermeta.language.structure.Parameter")))
									.getUpper(), 1);

			if (idIfCond_578) {

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
	public Boolean isParameterSingle() {

		java.lang.Boolean result = null;

		result = false;

		java.lang.Boolean idIfCond_579 = false;
		idIfCond_579 = this.isParameter();

		if (idIfCond_579) {

			kermeta.language.behavior.CallFeature cf_ = ((kermeta.language.behavior.CallFeature) org.kermeta.compil.runtime.helper.language.ObjectUtil
					.asTypeSwitcher(
							org.kermeta.compil.runtime.helper.language.ObjectUtil
									.containerSwitcher(this),
							org.kermeta.compil.runtime.ExecutionContext
									.getInstance()
									.getMetaClass(
											"kermeta.language.behavior.CallFeature")));

			java.lang.Integer i = kermeta.standard.helper.IntegerWrapper
					.uminus(1);

			kermeta.language.behavior.Expression exp = null;
			//BIft:detect

			kermeta.language.behavior.Expression result_ft141 = null;

			kermeta.language.behavior.Expression elem_ft141 = null;

			result_ft141 = null;

			{

				kermeta.standard.Iterator<kermeta.language.behavior.Expression> it_ft141 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<kermeta.language.behavior.Expression> convertAsOrderedSet(
								cf_.getParameters()).iterator();
				java.lang.Boolean idLoopCond_580 = false;
				while (!idLoopCond_580) {
					idLoopCond_580 = kermeta.standard.helper.BooleanWrapper
							.or(
									it_ft141.isOff(),
									org.kermeta.compil.runtime.helper.language.ObjectUtil
											.isNotEqualSwitcher(result_ft141,
													null));
					if (idLoopCond_580) {
					} else {

						elem_ft141 = it_ft141.next();

						java.lang.Boolean idIfCond_581 = false;
						//BIle:detector
						kermeta.language.behavior.Expression p_lbdExp141 = elem_ft141;

						i = kermeta.standard.helper.IntegerWrapper.plus(i, 1);

						idIfCond_581 = org.kermeta.compil.runtime.helper.language.ObjectUtil
								.equalsSwitcher(p_lbdExp141, this);
						//EIle:detector

						if (idIfCond_581) {

							result_ft141 = elem_ft141;
						}

					}
				}
			}

			//CE
			exp = result_ft141;
			//EIft:detect

			java.lang.Boolean idIfCond_582 = false;
			idIfCond_582 = kermeta.standard.helper.IntegerWrapper
					.equals(
							((kermeta.language.structure.Parameter) org.kermeta.compil.runtime.helper.language.ObjectUtil
									.asTypeSwitcher(
											org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
													.<kermeta.language.structure.Parameter> convertAsOrderedSet(
															cf_
																	.getStaticOperation()
																	.getOwnedParameter())
													.elementAt(i),
											org.kermeta.compil.runtime.ExecutionContext
													.getInstance()
													.getMetaClass(
															"kermeta.language.structure.Parameter")))
									.getUpper(), 1);

			if (idIfCond_582) {

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
		case BehaviorPackage.CALL_FEATURE__TARGET:
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
		case BehaviorPackage.CALL_FEATURE__STATIC_OPERATION:
			if (resolve)
				return getStaticOperation();
			return basicGetStaticOperation();
		case BehaviorPackage.CALL_FEATURE__CALLED_FT_RESULT:
			return getCalledFtResult();
		case BehaviorPackage.CALL_FEATURE__IS_ATPRE:
			return getIsAtpre();
		case BehaviorPackage.CALL_FEATURE__TARGET:
			if (resolve)
				return getTarget();
			return basicGetTarget();
		case BehaviorPackage.CALL_FEATURE__STATIC_ENUM_LITERAL:
			if (resolve)
				return getStaticEnumLiteral();
			return basicGetStaticEnumLiteral();
		case BehaviorPackage.CALL_FEATURE__STATIC_PROPERTY:
			if (resolve)
				return getStaticProperty();
			return basicGetStaticProperty();
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
		case BehaviorPackage.CALL_FEATURE__STATIC_OPERATION:
			setStaticOperation((Operation) newValue);
			return;
		case BehaviorPackage.CALL_FEATURE__CALLED_FT_RESULT:
			setCalledFtResult((String) newValue);
			return;
		case BehaviorPackage.CALL_FEATURE__IS_ATPRE:
			setIsAtpre((Boolean) newValue);
			return;
		case BehaviorPackage.CALL_FEATURE__TARGET:
			setTarget((Expression) newValue);
			return;
		case BehaviorPackage.CALL_FEATURE__STATIC_ENUM_LITERAL:
			setStaticEnumLiteral((EnumerationLiteral) newValue);
			return;
		case BehaviorPackage.CALL_FEATURE__STATIC_PROPERTY:
			setStaticProperty((Property) newValue);
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
		case BehaviorPackage.CALL_FEATURE__STATIC_OPERATION:
			setStaticOperation((Operation) null);
			return;
		case BehaviorPackage.CALL_FEATURE__CALLED_FT_RESULT:
			setCalledFtResult(CALLED_FT_RESULT_EDEFAULT);
			return;
		case BehaviorPackage.CALL_FEATURE__IS_ATPRE:
			setIsAtpre(IS_ATPRE_EDEFAULT);
			return;
		case BehaviorPackage.CALL_FEATURE__TARGET:
			setTarget((Expression) null);
			return;
		case BehaviorPackage.CALL_FEATURE__STATIC_ENUM_LITERAL:
			setStaticEnumLiteral((EnumerationLiteral) null);
			return;
		case BehaviorPackage.CALL_FEATURE__STATIC_PROPERTY:
			setStaticProperty((Property) null);
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
		case BehaviorPackage.CALL_FEATURE__STATIC_OPERATION:
			return staticOperation != null;
		case BehaviorPackage.CALL_FEATURE__CALLED_FT_RESULT:
			return CALLED_FT_RESULT_EDEFAULT == null ? calledFtResult != null
					: !CALLED_FT_RESULT_EDEFAULT.equals(calledFtResult);
		case BehaviorPackage.CALL_FEATURE__IS_ATPRE:
			return IS_ATPRE_EDEFAULT == null ? isAtpre != null
					: !IS_ATPRE_EDEFAULT.equals(isAtpre);
		case BehaviorPackage.CALL_FEATURE__TARGET:
			return target != null;
		case BehaviorPackage.CALL_FEATURE__STATIC_ENUM_LITERAL:
			return staticEnumLiteral != null;
		case BehaviorPackage.CALL_FEATURE__STATIC_PROPERTY:
			return staticProperty != null;
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
		result.append(" (calledFtResult: ");
		result.append(calledFtResult);
		result.append(", isAtpre: ");
		result.append(isAtpre);
		result.append(')');
		return result.toString();
	}

} //CallFeatureImpl
