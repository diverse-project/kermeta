/**
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * 
 * Generated with Kermeta <http://www.kermeta.org>
 *
 * $Id$
 */
package kermeta.language.behavior.impl;

import kermeta.language.behavior.BehaviorPackage;
import kermeta.language.behavior.CallFeature;
import kermeta.language.behavior.Expression;

import kermeta.language.structure.EnumerationLiteral;
import kermeta.language.structure.FunctionType;
import kermeta.language.structure.Operation;
import kermeta.language.structure.Parameter;
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
 *   <li>{@link kermeta.language.behavior.impl.CallFeatureImpl#getCalledFtResult <em>Called Ft Result</em>}</li>
 *   <li>{@link kermeta.language.behavior.impl.CallFeatureImpl#getStaticOperation <em>Static Operation</em>}</li>
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
	 * The cached value of the '{@link #getStaticOperation() <em>Static Operation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStaticOperation()
	 * @generated
	 * @ordered
	 */
	protected Operation staticOperation;

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
			java.lang.Boolean idLoopCond_444 = false;
			while (!idLoopCond_444) {
				idLoopCond_444 = kermeta.standard.helper.BooleanWrapper.or(
						it_ft132.isOff(),
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isNotEqualSwitcher(result_ft132, null));
				if (idLoopCond_444) {
				} else {

					elem_ft132 = it_ft132.next();

					java.lang.Boolean idIfCond_445 = false;
					//BIle:detector
					kermeta.language.structure.Type t_lbdExp132 = elem_ft132;

					idIfCond_445 = org.kermeta.compil.runtime.helper.language.ObjectUtil
							.isInstanceOfSwitcher(
									t_lbdExp132,
									org.kermeta.compil.runtime.ExecutionContext
											.getInstance()
											.getMetaClass(
													"kermeta.language.structure.FunctionType"));
					//EIle:detector

					if (idIfCond_445) {

						result_ft132 = elem_ft132;
					}

				}
			}
		}

		//CE
		result = (kermeta.language.structure.FunctionType) org.kermeta.compil.runtime.helper.language.ObjectUtil
				.asTypeOrVoid(result_ft132,
						"kermeta.language.structure.FunctionType");
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

		java.lang.Boolean idIfCond_446 = false;
		idIfCond_446 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isVoidSwitcher(this.getTarget());

		if (idIfCond_446) {

			this
					.setTarget(((kermeta.language.behavior.SelfExpression) org.kermeta.compil.runtime.helper.language.ClassUtil
							.newObject(kermeta.language.behavior.BehaviorPackage.eINSTANCE
									.getSelfExpression())));
		}

		kermeta.language.behavior.Expression tgt = this.getTarget();

		java.lang.String fName = ((km2ecore.helper.java.IdentifierHelper) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject(km2ecore.helper.java.JavaPackage.eINSTANCE
						.getIdentifierHelper())).getMangledIdentifier(this
				.getName(), context);

		java.lang.String static_call = "";

		java.lang.Boolean idIfCond_447 = false;
		idIfCond_447 = this.isCallFeatureAsStaticOperation();

		if (idIfCond_447) {

			java.lang.Boolean idIfCond_448 = false;
			idIfCond_448 = this.callsFunctionType();

			if (idIfCond_448) {

				context.getTasks_stack().push(
						context.getFUNCTION_TYPE_COMPILATION_TASK());

				context.setAfterLbdExpActivation(false);

				java.lang.String ft_str = this
						.createStringFromFunctionType(context);

				context.getTasks_stack().pop();

				result = ft_str;
			} else {

				java.lang.Boolean idIfCond_449 = false;
				idIfCond_449 = this.fromUtil(context);

				if (idIfCond_449) {

					java.lang.Boolean idIfCond_450 = false;
					idIfCond_450 = this.getStaticOperation().ownedByValueType();

					if (idIfCond_450) {

						static_call = this.getStaticOperation()
								.getOptimizedStaticCall(context);

						java.lang.Boolean idIfCond_451 = false;
						idIfCond_451 = kermeta.standard.helper.StringWrapper
								.equals(static_call, "");

						if (idIfCond_451) {

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
																																	.containerSwitcher(this
																																			.getStaticOperation()
																																			.getOwningClass()),
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

						java.lang.Boolean idIfCond_452 = false;
						idIfCond_452 = kermeta.standard.helper.StringWrapper
								.equals(static_call, "");

						if (idIfCond_452) {

							static_call = kermeta.standard.helper.StringWrapper
									.plus(
											kermeta.standard.helper.StringWrapper
													.plus(
															kermeta.standard.helper.StringWrapper
																	.plus(
																			kermeta.standard.helper.StringWrapper
																					.plus(
																							"org.kermeta.compil.runtime.helper.language.",
																							this
																									.getStaticOperation()
																									.getOwningClass()
																									.getName()),
																			"Util."),
															fName), "Switcher");
						}

						java.lang.Boolean idIfCond_453 = false;
						idIfCond_453 = kermeta.standard.helper.StringWrapper
								.equals(fName, "asType");

						if (idIfCond_453) {

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

					java.lang.Boolean idIfCond_454 = false;
					idIfCond_454 = kermeta.standard.helper.BooleanWrapper
							.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
									.isVoidSwitcher(tgt));

					if (idIfCond_454) {

						java.lang.Boolean idIfCond_455 = false;
						idIfCond_455 = kermeta.standard.helper.BooleanWrapper
								.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
										.isVoidSwitcher(tgt.getStaticType()));

						if (idIfCond_455) {

							java.lang.Boolean idIfCond_456 = false;
							idIfCond_456 = tgt.getStaticType().isValueType();

							if (idIfCond_456) {

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

						java.lang.Boolean idIfCond_457 = false;
						idIfCond_457 = kermeta.standard.helper.BooleanWrapper
								.and(
										this.getStaticOperation()
												.getOwningClass()
												.isMappedToJavaRawType(),
										kermeta.standard.helper.BooleanWrapper
												.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isVoidSwitcher(this
																.getStaticOperation()
																.getBody())));

						if (idIfCond_457) {

							static_call = this.getStaticOperation()
									.getOptimizedStaticCall(context);
						}

					}

				}

			}

		}

		java.lang.Boolean idIfCond_458 = false;
		idIfCond_458 = kermeta.standard.helper.BooleanWrapper
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

		if (idIfCond_458) {

			java.lang.String type_label = tgt.createBehaviorJava(context);

			java.lang.Boolean idIfCond_459 = false;
			idIfCond_459 = kermeta.standard.helper.BooleanWrapper
					.not(kermeta.standard.helper.StringWrapper.isValueType(
							type_label, context));

			if (idIfCond_459) {

				java.lang.String pojoType_label = "";

				java.lang.Boolean idIfCond_460 = false;
				idIfCond_460 = org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isInstanceOfSwitcher(
								tgt.getStaticType(),
								org.kermeta.compil.runtime.ExecutionContext
										.getInstance()
										.getMetaClass(
												"kermeta.language.structure.ParameterizedType"));

				if (idIfCond_460) {

					pojoType_label = ((kermeta.language.structure.ParameterizedType) org.kermeta.compil.runtime.helper.language.ObjectUtil
							.asTypeSwitcher(
									tgt.getStaticType(),
									org.kermeta.compil.runtime.ExecutionContext
											.getInstance()
											.getMetaClass(
													"kermeta.language.structure.ParameterizedType")))
							.getTypeDefinition().getFinalJavaClassQN();
				}

				java.lang.Boolean idIfCond_461 = false;
				idIfCond_461 = org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isNotEqualSwitcher(pojoType_label, "");

				if (idIfCond_461) {

					result = kermeta.standard.helper.StringWrapper.plus(
							kermeta.standard.helper.StringWrapper.plus("new ",
									pojoType_label), "()");
				} else {

					java.lang.String class_label = ((km2ecore.helper.kermeta.CompilerHelperJava) org.kermeta.compil.runtime.helper.language.ClassUtil
							.newObject(km2ecore.helper.kermeta.KermetaPackage.eINSTANCE
									.getCompilerHelperJava()))
							.ppEmfLikeGetEMF(type_label);

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
																									type_label),
																					") "),
																	"org.kermeta.compil.runtime.helper.language.ClassUtil.newObject("),
													class_label), "))");
				}

			} else {

				result = ((kermeta.language.structure.ParameterizedType) org.kermeta.compil.runtime.helper.language.ObjectUtil
						.asTypeSwitcher(
								tgt.getStaticType(),
								org.kermeta.compil.runtime.ExecutionContext
										.getInstance()
										.getMetaClass(
												"kermeta.language.structure.ParameterizedType")))
						.getTypeDefinition().getEMFDefaultConstructor();
			}

		} else {

			java.lang.Boolean idIfCond_462 = false;
			idIfCond_462 = kermeta.standard.helper.BooleanWrapper
					.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
							.isVoidSwitcher(tgt));

			if (idIfCond_462) {

				java.lang.Boolean idIfCond_463 = false;
				idIfCond_463 = kermeta.standard.helper.BooleanWrapper.not(tgt
						.callsFunctionType());

				if (idIfCond_463) {

					java.lang.Boolean idIfCond_464 = false;
					idIfCond_464 = kermeta.standard.helper.BooleanWrapper
							.not(this.callsFunctionType());

					if (idIfCond_464) {

						java.lang.String tgt_staticType_str = "";

						java.lang.Boolean idIfCond_465 = false;
						idIfCond_465 = kermeta.standard.helper.BooleanWrapper
								.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
										.isVoidSwitcher(tgt.getStaticType()));

						if (idIfCond_465) {

							tgt_staticType_str = org.kermeta.compil.runtime.helper.language.ObjectUtil
									.toStringSwitcher(tgt.getStaticType());
						}

						java.lang.Boolean idIfCond_466 = false;
						idIfCond_466 = kermeta.standard.helper.BooleanWrapper
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

						if (idIfCond_466) {

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

						java.lang.Boolean idIfCond_467 = false;
						idIfCond_467 = kermeta.standard.helper.StringWrapper
								.equals(static_call, "");

						if (idIfCond_467) {

							result = kermeta.standard.helper.StringWrapper
									.plus(result, ".");
						}

					} else {

						java.lang.Boolean idIfCond_468 = false;
						idIfCond_468 = kermeta.standard.helper.BooleanWrapper
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

						if (idIfCond_468) {

							java.lang.String resultPrefix = "";

							java.lang.Boolean idIfCond_469 = false;
							idIfCond_469 = org.kermeta.compil.runtime.helper.language.ObjectUtil
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

							if (idIfCond_469) {

								resultPrefix = context
										.getRETURN_EXPRESSION_TO_REPLACE_SPECIAL();
							}

							java.lang.Boolean idIfCond_470 = false;
							idIfCond_470 = org.kermeta.compil.runtime.helper.language.ObjectUtil
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

							if (idIfCond_470) {

								resultPrefix = context
										.getRETURN_EXPRESSION_TO_REPLACE_SPECIAL();
							}

							java.lang.Boolean idIfCond_471 = false;
							idIfCond_471 = org.kermeta.compil.runtime.helper.language.ObjectUtil
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

							if (idIfCond_471) {

								resultPrefix = context
										.getRETURN_EXPRESSION_TO_REPLACE_SPECIAL();
							}

							java.lang.Boolean idIfCond_472 = false;
							idIfCond_472 = kermeta.standard.helper.BooleanWrapper
									.not(this.isParameter());

							if (idIfCond_472) {

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

			java.lang.Boolean idIfCond_473 = false;
			idIfCond_473 = kermeta.standard.helper.StringWrapper.equals(
					static_call, "");

			if (idIfCond_473) {

				java.lang.Boolean idIfCond_474 = false;
				idIfCond_474 = this.isCallFeatureAsStaticEnumLiteral();

				if (idIfCond_474) {

					result = kermeta.standard.helper.StringWrapper.plus(
							kermeta.standard.helper.StringWrapper.plus(
									kermeta.standard.helper.StringWrapper.plus(
											result, "getByName(\""), fName),
							"\")");
				} else {

					java.lang.Boolean idIfCond_475 = false;
					idIfCond_475 = this.isCallFeatureAsStaticProperty();

					if (idIfCond_475) {

						java.lang.Boolean idIfCond_476 = false;
						idIfCond_476 = kermeta.standard.helper.BooleanWrapper
								.and(
										org.kermeta.compil.runtime.helper.language.ObjectUtil
												.isNotEqualSwitcher(this
														.getStaticProperty()
														.getUpper(), 1),
										kermeta.standard.helper.BooleanWrapper
												.not(this.isParameterMany()));

						if (idIfCond_476) {

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

							java.lang.Boolean idIfCond_477 = false;
							idIfCond_477 = kermeta.standard.helper.BooleanWrapper
									.and(
											kermeta.standard.helper.BooleanWrapper
													.not(this
															.getStaticProperty()
															.getIsUnique()),
											kermeta.standard.helper.BooleanWrapper
													.not(this
															.getStaticProperty()
															.getIsOrdered()));

							if (idIfCond_477) {

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

							java.lang.Boolean idIfCond_478 = false;
							idIfCond_478 = kermeta.standard.helper.BooleanWrapper
									.and(
											this.getStaticProperty()
													.getIsUnique(),
											kermeta.standard.helper.BooleanWrapper
													.not(this
															.getStaticProperty()
															.getIsOrdered()));

							if (idIfCond_478) {

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

							java.lang.Boolean idIfCond_479 = false;
							idIfCond_479 = kermeta.standard.helper.BooleanWrapper
									.and(
											this.getStaticProperty()
													.getIsUnique(), this
													.getStaticProperty()
													.getIsOrdered());

							if (idIfCond_479) {

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

							java.lang.Boolean idIfCond_480 = false;
							idIfCond_480 = kermeta.standard.helper.BooleanWrapper
									.and(kermeta.standard.helper.BooleanWrapper
											.not(this.getStaticProperty()
													.getIsUnique()), this
											.getStaticProperty().getIsOrdered());

							if (idIfCond_480) {

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

						java.lang.Boolean idIfCond_481 = false;
						idIfCond_481 = kermeta.standard.helper.BooleanWrapper
								.not(this.callsFunctionType());

						if (idIfCond_481) {

							java.lang.Boolean idIfCond_482 = false;
							idIfCond_482 = kermeta.standard.helper.BooleanWrapper
									.and(
											org.kermeta.compil.runtime.helper.language.ObjectUtil
													.isNotEqualSwitcher(
															this
																	.getStaticOperation()
																	.getUpper(),
															1),
											kermeta.standard.helper.BooleanWrapper
													.not(this.isParameterMany()));

							if (idIfCond_482) {

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

								java.lang.Boolean idIfCond_483 = false;
								idIfCond_483 = kermeta.standard.helper.BooleanWrapper
										.and(
												kermeta.standard.helper.BooleanWrapper
														.not(this
																.getStaticOperation()
																.getIsUnique()),
												kermeta.standard.helper.BooleanWrapper
														.not(this
																.getStaticOperation()
																.getIsOrdered()));

								if (idIfCond_483) {

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

								java.lang.Boolean idIfCond_484 = false;
								idIfCond_484 = kermeta.standard.helper.BooleanWrapper
										.and(
												this.getStaticOperation()
														.getIsUnique(),
												kermeta.standard.helper.BooleanWrapper
														.not(this
																.getStaticOperation()
																.getIsOrdered()));

								if (idIfCond_484) {

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

								java.lang.Boolean idIfCond_485 = false;
								idIfCond_485 = kermeta.standard.helper.BooleanWrapper
										.and(this.getStaticOperation()
												.getIsUnique(), this
												.getStaticOperation()
												.getIsOrdered());

								if (idIfCond_485) {

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

								java.lang.Boolean idIfCond_486 = false;
								idIfCond_486 = kermeta.standard.helper.BooleanWrapper
										.and(
												kermeta.standard.helper.BooleanWrapper
														.not(this
																.getStaticOperation()
																.getIsUnique()),
												this.getStaticOperation()
														.getIsOrdered());

								if (idIfCond_486) {

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

							java.lang.Boolean idIfCond_487 = false;
							idIfCond_487 = kermeta.standard.helper.BooleanWrapper
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

							if (idIfCond_487) {

								java.lang.Boolean idIfCond_488 = false;
								idIfCond_488 = org.kermeta.compil.runtime.helper.language.ObjectUtil
										.isInstanceOfSwitcher(
												org.kermeta.compil.runtime.helper.language.ObjectUtil
														.containerSwitcher(this),
												org.kermeta.compil.runtime.ExecutionContext
														.getInstance()
														.getMetaClass(
																"kermeta.language.behavior.CallFeature"));

								if (idIfCond_488) {

									kermeta.language.behavior.CallFeature cf_ = ((kermeta.language.behavior.CallFeature) org.kermeta.compil.runtime.helper.language.ObjectUtil
											.asTypeSwitcher(
													org.kermeta.compil.runtime.helper.language.ObjectUtil
															.containerSwitcher(this),
													org.kermeta.compil.runtime.ExecutionContext
															.getInstance()
															.getMetaClass(
																	"kermeta.language.behavior.CallFeature")));

									java.lang.Boolean idIfCond_489 = false;
									idIfCond_489 = kermeta.standard.helper.BooleanWrapper
											.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
													.isVoidSwitcher(cf_
															.getStaticOperation()));

									if (idIfCond_489) {

										java.lang.Boolean idIfCond_490 = false;
										idIfCond_490 = kermeta.standard.helper.BooleanWrapper
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

										if (idIfCond_490) {
										} else {

											result = kermeta.standard.helper.StringWrapper
													.plus(result, ".");
										}

									} else {

										java.lang.Boolean idIfCond_491 = false;
										idIfCond_491 = kermeta.standard.helper.BooleanWrapper
												.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isVoidSwitcher(cf_
																.getStaticProperty()));

										if (idIfCond_491) {

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

				java.lang.Boolean idIfCond_492 = false;
				idIfCond_492 = kermeta.standard.helper.StringWrapper.contains(
						result, context.getRETURN_EXPRESSION_TO_REPLACE());

				if (idIfCond_492) {

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
						java.lang.Boolean idLoopCond_494 = false;
						while (!idLoopCond_494) {
							idLoopCond_494 = kermeta.standard.helper.BooleanWrapper
									.or(
											it_ft133.isOff(),
											org.kermeta.compil.runtime.helper.language.ObjectUtil
													.isNotEqualSwitcher(
															result_ft133, null));
							if (idLoopCond_494) {
							} else {

								elem_ft133 = it_ft133.next();

								java.lang.Boolean idIfCond_495 = false;
								//BIle:detector
								kermeta.language.behavior.Expression p_lbdExp133 = elem_ft133;

								idIfCond_495 = p_lbdExp133.callsFunctionType();
								//EIle:detector

								if (idIfCond_495) {

									result_ft133 = elem_ft133;
								}

							}
						}
					}

					//EIft:detect
					java.lang.Boolean idIfCond_493 = false;
					idIfCond_493 = kermeta.standard.helper.BooleanWrapper
							.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
									.isVoidSwitcher(result_ft133));

					if (idIfCond_493) {

						tmp_prefix = context.getRETURN_EXPRESSION_TO_REPLACE();
					}

					result = kermeta.standard.helper.StringWrapper.plus(
							kermeta.standard.helper.StringWrapper.plus(
									kermeta.standard.helper.StringWrapper.plus(
											tmp_prefix, static_call), "("),
							result);
				}

				java.lang.Boolean idIfCond_496 = false;
				idIfCond_496 = ppCast;

				if (idIfCond_496) {

					result = kermeta.standard.helper.StringWrapper.plus("(",
							result);
				}

			}

			java.lang.Boolean idIfCond_497 = false;
			idIfCond_497 = kermeta.standard.helper.BooleanWrapper.and(this
					.isCallFeatureAsStaticOperation(),
					kermeta.standard.helper.BooleanWrapper.not(this
							.callsFunctionType()));

			if (idIfCond_497) {

				java.lang.Boolean idIfCond_498 = false;
				idIfCond_498 = kermeta.standard.helper.StringWrapper.equals(
						static_call, "");

				if (idIfCond_498) {

					result = kermeta.standard.helper.StringWrapper.plus(result,
							"(");
				} else {

					static_call = "";

					java.lang.Boolean idIfCond_499 = false;
					idIfCond_499 = kermeta.standard.helper.BooleanWrapper
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

					if (idIfCond_499) {

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
																		.newObject(km2ecore.helper.kermeta.KermetaPackage.eINSTANCE
																				.getCompilerHelperJava()))
																		.ppComaSeparatedNodes(
																				org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
																						.<kermeta.language.behavior.Expression> convertAsOrderedSet(this
																								.getParameters()),
																				context)),
												")"), cf_prop_suffix);

				context.setBeforeLambdaExpressionResult(this
						.getBeforeLambdaExpressionResult());

				this.setBeforeLambdaExpressionResult("");

				java.lang.Boolean idIfCond_500 = false;
				idIfCond_500 = ppCast;

				if (idIfCond_500) {

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
	public Boolean isFromUtil_MethodFragment(String fName,
			KM2EcoreContext context) {

		java.lang.Boolean result = null;

		result = kermeta.standard.helper.BooleanWrapper
				.or(
						org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
								.<java.lang.String> convertAsOrderedSet(
										context.getFrameworkOperations())
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
																				"kermeta.language.behavior.SelfExpression")))));

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

		java.lang.Boolean idIfCond_501 = false;
		idIfCond_501 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoidSwitcher(this.getStaticOperation()));

		if (idIfCond_501) {

			java.lang.Boolean idIfCond_502 = false;
			idIfCond_502 = kermeta.standard.helper.StringWrapper.equals(this
					.getStaticOperation().getOwningClass().qualifiedName(),
					"kermeta::language::structure::Class");

			if (idIfCond_502) {

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
	public Parameter getCallFeatureCorrespondingParameter() {

		kermeta.language.structure.Parameter result = null;

		result = null;

		java.lang.Boolean idIfCond_503 = false;
		idIfCond_503 = this.isParameter();

		if (idIfCond_503) {

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

			kermeta.language.behavior.Expression result_ft134 = null;

			kermeta.language.behavior.Expression elem_ft134 = null;

			result_ft134 = null;

			{

				kermeta.standard.Iterator<kermeta.language.behavior.Expression> it_ft134 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<kermeta.language.behavior.Expression> convertAsOrderedSet(
								cf_.getParameters()).iterator();
				java.lang.Boolean idLoopCond_504 = false;
				while (!idLoopCond_504) {
					idLoopCond_504 = kermeta.standard.helper.BooleanWrapper
							.or(
									it_ft134.isOff(),
									org.kermeta.compil.runtime.helper.language.ObjectUtil
											.isNotEqualSwitcher(result_ft134,
													null));
					if (idLoopCond_504) {
					} else {

						elem_ft134 = it_ft134.next();

						java.lang.Boolean idIfCond_505 = false;
						//BIle:detector
						kermeta.language.behavior.Expression p_lbdExp134 = elem_ft134;

						i = kermeta.standard.helper.IntegerWrapper.plus(i, 1);

						idIfCond_505 = org.kermeta.compil.runtime.helper.language.ObjectUtil
								.equalsSwitcher(p_lbdExp134, this);
						//EIle:detector

						if (idIfCond_505) {

							result_ft134 = elem_ft134;
						}

					}
				}
			}

			//CE
			exp = result_ft134;
			//EIft:detect
			;

			result = ((kermeta.language.structure.Parameter) org.kermeta.compil.runtime.helper.language.ObjectUtil
					.asTypeSwitcher(
							org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
									.<kermeta.language.structure.Parameter> convertAsOrderedSet(
											cf_.getStaticOperation()
													.getOwnedParameter())
									.elementAt(i),
							org.kermeta.compil.runtime.ExecutionContext
									.getInstance()
									.getMetaClass(
											"kermeta.language.structure.Parameter")));
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
				.newObject(kermeta.utils.UtilsPackage.eINSTANCE.getHashtable()));

		java.lang.Integer inc_tp = 0;

		//BIft:each

		{

			kermeta.standard.Iterator<kermeta.language.structure.Type> it_ft135 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Type> convertAsOrderedSet(
							this.getStaticTypeVariableBindings()).iterator();
			java.lang.Boolean idLoopCond_506 = false;
			while (!idLoopCond_506) {
				idLoopCond_506 = it_ft135.isOff();
				if (idLoopCond_506) {
				} else {

					//BIle:func
					kermeta.language.structure.Type type__lbdExp135 = it_ft135
							.next();

					map_type
							.put(
									org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
											.<kermeta.language.structure.TypeVariable> convertAsOrderedSet(
													this.getStaticOperation()
															.getTypeParameter())
											.elementAt(inc_tp), type__lbdExp135);

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
				.newObject(kermeta.language.structure.StructurePackage.eINSTANCE
						.getType()));

		//BIft:detect

		kermeta.language.behavior.Expression result_ft136 = null;

		kermeta.language.behavior.Expression elem_ft136 = null;

		result_ft136 = null;

		{

			kermeta.standard.Iterator<kermeta.language.behavior.Expression> it_ft136 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.behavior.Expression> convertAsOrderedSet(
							this.getParameters()).iterator();
			java.lang.Boolean idLoopCond_508 = false;
			while (!idLoopCond_508) {
				idLoopCond_508 = kermeta.standard.helper.BooleanWrapper.or(
						it_ft136.isOff(),
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isNotEqualSwitcher(result_ft136, null));
				if (idLoopCond_508) {
				} else {

					elem_ft136 = it_ft136.next();

					java.lang.Boolean idIfCond_509 = false;
					//BIle:detector
					kermeta.language.behavior.Expression param_lbdExp136 = elem_ft136;

					idIfCond_509 = org.kermeta.compil.runtime.helper.language.ObjectUtil
							.isInstanceOfSwitcher(
									param_lbdExp136,
									org.kermeta.compil.runtime.ExecutionContext
											.getInstance()
											.getMetaClass(
													"kermeta.language.behavior.LambdaExpression"));
					//EIle:detector

					if (idIfCond_509) {

						result_ft136 = elem_ft136;
					}

				}
			}
		}

		//EIft:detect
		java.lang.Boolean idIfCond_507 = false;
		idIfCond_507 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoidSwitcher(result_ft136));

		if (idIfCond_507) {

			//BIft:detect

			kermeta.language.behavior.Expression result_ft137 = null;

			kermeta.language.behavior.Expression elem_ft137 = null;

			result_ft137 = null;

			{

				kermeta.standard.Iterator<kermeta.language.behavior.Expression> it_ft137 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<kermeta.language.behavior.Expression> convertAsOrderedSet(
								this.getParameters()).iterator();
				java.lang.Boolean idLoopCond_510 = false;
				while (!idLoopCond_510) {
					idLoopCond_510 = kermeta.standard.helper.BooleanWrapper
							.or(
									it_ft137.isOff(),
									org.kermeta.compil.runtime.helper.language.ObjectUtil
											.isNotEqualSwitcher(result_ft137,
													null));
					if (idLoopCond_510) {
					} else {

						elem_ft137 = it_ft137.next();

						java.lang.Boolean idIfCond_511 = false;
						//BIle:detector
						kermeta.language.behavior.Expression param_lbdExp137 = elem_ft137;

						idIfCond_511 = org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isInstanceOfSwitcher(
										param_lbdExp137,
										org.kermeta.compil.runtime.ExecutionContext
												.getInstance()
												.getMetaClass(
														"kermeta.language.behavior.LambdaExpression"));
						//EIle:detector

						if (idIfCond_511) {

							result_ft137 = elem_ft137;
						}

					}
				}
			}

			//EIft:detect
			kermeta.language.behavior.LambdaExpression theLambdaExp = ((kermeta.language.behavior.LambdaExpression) org.kermeta.compil.runtime.helper.language.ObjectUtil
					.asTypeSwitcher(
							result_ft137,
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

			java.lang.Boolean idIfCond_512 = false;
			idIfCond_512 = org.kermeta.compil.runtime.helper.language.ObjectUtil
					.isInstanceOfSwitcher(
							theLambdaExp.getStaticType(),
							org.kermeta.compil.runtime.ExecutionContext
									.getInstance()
									.getMetaClass(
											"kermeta.language.structure.FunctionType"));

			if (idIfCond_512) {

				kermeta.language.structure.FunctionType current_functionType = ((kermeta.language.structure.FunctionType) org.kermeta.compil.runtime.helper.language.ObjectUtil
						.asTypeSwitcher(
								theLambdaExp.getStaticType(),
								org.kermeta.compil.runtime.ExecutionContext
										.getInstance()
										.getMetaClass(
												"kermeta.language.structure.FunctionType")));

				java.lang.Boolean idIfCond_513 = false;
				idIfCond_513 = org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isInstanceOfSwitcher(
								current_functionType.getLeft(),
								org.kermeta.compil.runtime.ExecutionContext
										.getInstance()
										.getMetaClass(
												"kermeta.language.structure.ProductType"));

				if (idIfCond_513) {

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

		java.lang.Boolean idIfCond_514 = false;
		idIfCond_514 = tgt.callsFunctionType();

		if (idIfCond_514) {

			context.setFtSuffixActivation(true);

			context
					.setFtContextualSelf(context
							.getSELF_EXPRESSION_TO_REPLACE());
		} else {

			context.setFtContextualSelf(tgt.createBehaviorJava(context));
		}

		context.setFtSuffixActivation(true);

		java.lang.String callElement = "";

		java.lang.Boolean idIfCond_515 = false;
		idIfCond_515 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isInstanceOfSwitcher(
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.containerSwitcher(this),
						org.kermeta.compil.runtime.ExecutionContext
								.getInstance()
								.getMetaClass(
										"kermeta.language.behavior.VariableDecl"));

		if (idIfCond_515) {

			callElement = ((km2ecore.helper.java.IdentifierHelper) org.kermeta.compil.runtime.helper.language.ClassUtil
					.newObject(km2ecore.helper.java.JavaPackage.eINSTANCE
							.getIdentifierHelper()))
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

			java.lang.Boolean idIfCond_516 = false;
			idIfCond_516 = org.kermeta.compil.runtime.helper.language.ObjectUtil
					.isInstanceOfSwitcher(
							org.kermeta.compil.runtime.helper.language.ObjectUtil
									.containerSwitcher(this),
							org.kermeta.compil.runtime.ExecutionContext
									.getInstance()
									.getMetaClass(
											"kermeta.language.behavior.CallVariable"));

			if (idIfCond_516) {

				org.kermeta.compil.runtime.helper.io.StdIOUtil
						.getInstance()
						.writeln(
								"Please contact the development team if you have this case !");

				callElement = ((km2ecore.helper.java.IdentifierHelper) org.kermeta.compil.runtime.helper.language.ClassUtil
						.newObject(km2ecore.helper.java.JavaPackage.eINSTANCE
								.getIdentifierHelper()))
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

		java.lang.Boolean idIfCond_517 = false;
		idIfCond_517 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isNotEqualSwitcher(callElement, "");

		if (idIfCond_517) {

			ft_str = kermeta.standard.helper.StringWrapper.plus(ft_str,
					"null;\n");
		}

		java.lang.String ppCastSuffix = "";

		java.lang.String ppValueTypeCastSuffix = "";

		java.lang.Boolean idIfCond_518 = false;
		idIfCond_518 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isInstanceOfSwitcher(
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.containerSwitcher(this),
						org.kermeta.compil.runtime.ExecutionContext
								.getInstance().getMetaClass(
										"kermeta.language.behavior.Assignment"));

		if (idIfCond_518) {

			ppCastSuffix = ((kermeta.language.behavior.Assignment) org.kermeta.compil.runtime.helper.language.ObjectUtil
					.asTypeSwitcher(
							org.kermeta.compil.runtime.helper.language.ObjectUtil
									.containerSwitcher(this),
							org.kermeta.compil.runtime.ExecutionContext
									.getInstance()
									.getMetaClass(
											"kermeta.language.behavior.Assignment")))
					.getCacheCastSuffix();

			ppValueTypeCastSuffix = ((kermeta.language.behavior.Assignment) org.kermeta.compil.runtime.helper.language.ObjectUtil
					.asTypeSwitcher(
							org.kermeta.compil.runtime.helper.language.ObjectUtil
									.containerSwitcher(this),
							org.kermeta.compil.runtime.ExecutionContext
									.getInstance()
									.getMetaClass(
											"kermeta.language.behavior.Assignment")))
					.getValueTypeCastSuffix();

			java.lang.Boolean idIfCond_519 = false;
			idIfCond_519 = org.kermeta.compil.runtime.helper.language.ObjectUtil
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

			if (idIfCond_519) {

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

			java.lang.Boolean idIfCond_520 = false;
			idIfCond_520 = org.kermeta.compil.runtime.helper.language.ObjectUtil
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

			if (idIfCond_520) {

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

		java.lang.Boolean idIfCond_521 = false;
		idIfCond_521 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isNotEqualSwitcher(callElement, "");

		if (idIfCond_521) {

			ft_str = kermeta.standard.helper.StringWrapper.plus(ft_str,
					"\n//CE\n");

			java.lang.Boolean idIfCond_522 = false;
			idIfCond_522 = org.kermeta.compil.runtime.helper.language.ObjectUtil
					.isNotEqualSwitcher(context.getResultLastStatementId(), "");

			if (idIfCond_522) {

				ft_str = kermeta.standard.helper.StringWrapper
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
																												ft_str,
																												context
																														.getResultLastStatementId()),
																								"result"),
																				context
																						.printFtSuffix()),
																ppValueTypeCastSuffix),
												ppCastSuffix), ";\n");
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

		java.lang.Boolean idIfCond_523 = false;
		idIfCond_523 = kermeta.standard.helper.BooleanWrapper
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

		if (idIfCond_523) {

			java.lang.Boolean idIfCond_524 = false;
			idIfCond_524 = org.kermeta.compil.runtime.helper.language.ObjectUtil
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

			if (idIfCond_524) {

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
																				kermeta.standard.helper.StringWrapper
																						.plus(
																								kermeta.standard.helper.StringWrapper
																										.plus(
																												ft_str,
																												context
																														.getRETURN_EXPRESSION_TO_REPLACE()),
																								"result"),
																				context
																						.printFtSuffix()),
																ppValueTypeCastSuffix),
												ppCastSuffix), ";\n");
			}

		}

		java.lang.Boolean idIfCond_525 = false;
		idIfCond_525 = kermeta.standard.helper.BooleanWrapper
				.and(
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isNotEqualSwitcher(callElement, ""),
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isInstanceOfSwitcher(
										org.kermeta.compil.runtime.helper.language.ObjectUtil
												.containerSwitcher(this),
										org.kermeta.compil.runtime.ExecutionContext
												.getInstance()
												.getMetaClass(
														"kermeta.language.behavior.VariableDecl")));

		if (idIfCond_525) {

			java.lang.String str_binding = kermeta.standard.helper.StringWrapper
					.replace(context.getResultLastStatementId(), " = ", "");

			java.lang.Boolean idIfCond_526 = false;
			idIfCond_526 = org.kermeta.compil.runtime.helper.language.ObjectUtil
					.isNotEqualSwitcher(str_binding, "");

			if (idIfCond_526) {

				ft_str = kermeta.standard.helper.StringWrapper.plus(ft_str,
						"\n//CEVD\n");

				ft_str = kermeta.standard.helper.StringWrapper.plus(
						kermeta.standard.helper.StringWrapper.plus(
								kermeta.standard.helper.StringWrapper.plus(
										kermeta.standard.helper.StringWrapper
												.plus(ft_str, callElement),
										" = "), str_binding), ";\n");
			}

		}

		java.lang.Boolean idIfCond_527 = false;
		idIfCond_527 = kermeta.standard.helper.BooleanWrapper
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

		if (idIfCond_527) {

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

		java.lang.Boolean idIfCond_528 = false;
		idIfCond_528 = kermeta.standard.helper.BooleanWrapper
				.and(
						kermeta.standard.helper.StringWrapper.equals(
								callElement, ""),
						kermeta.standard.helper.BooleanWrapper
								.not(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ClassUtil
										.newObject(kermeta.language.structure.StructurePackage.eINSTANCE
												.getOperation()))
										.isVoidType(this.getStaticType()
												.getTypeName())));

		if (idIfCond_528) {

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
	public Boolean requireConversionValueTypeToObject(KM2EcoreContext context) {

		java.lang.Boolean result = null;

		result = false;

		java.lang.Boolean idIfCond_529 = false;
		idIfCond_529 = this.isParameter();

		if (idIfCond_529) {

			java.lang.Boolean idIfCond_530 = false;
			idIfCond_530 = kermeta.standard.helper.BooleanWrapper
					.not(((kermeta.language.behavior.CallFeature) org.kermeta.compil.runtime.helper.language.ObjectUtil
							.asTypeSwitcher(
									org.kermeta.compil.runtime.helper.language.ObjectUtil
											.containerSwitcher(this),
									org.kermeta.compil.runtime.ExecutionContext
											.getInstance()
											.getMetaClass(
													"kermeta.language.behavior.CallFeature")))
							.isCallFeatureTargetsValueTypeOperation());

			if (idIfCond_530) {

				kermeta.language.structure.Parameter param = this
						.getCallFeatureCorrespondingParameter();

				java.lang.Boolean idIfCond_531 = false;
				idIfCond_531 = kermeta.standard.helper.BooleanWrapper
						.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isVoidSwitcher(param));

				if (idIfCond_531) {

					java.lang.String left_type = param.getType().getTypeQName();

					java.lang.Boolean idIfCond_532 = false;
					idIfCond_532 = kermeta.standard.helper.StringWrapper
							.equals(left_type,
									"kermeta::language::structure::Object");

					if (idIfCond_532) {

						java.lang.Boolean idIfCond_533 = false;
						idIfCond_533 = this.getStaticType().isValueType();

						if (idIfCond_533) {

							result = true;
						}

					}

				}

			}

		}

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

		java.lang.Boolean idIfCond_534 = false;
		idIfCond_534 = this.isParameter();

		if (idIfCond_534) {

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

			kermeta.language.behavior.Expression result_ft138 = null;

			kermeta.language.behavior.Expression elem_ft138 = null;

			result_ft138 = null;

			{

				kermeta.standard.Iterator<kermeta.language.behavior.Expression> it_ft138 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<kermeta.language.behavior.Expression> convertAsOrderedSet(
								cf_.getParameters()).iterator();
				java.lang.Boolean idLoopCond_535 = false;
				while (!idLoopCond_535) {
					idLoopCond_535 = kermeta.standard.helper.BooleanWrapper
							.or(
									it_ft138.isOff(),
									org.kermeta.compil.runtime.helper.language.ObjectUtil
											.isNotEqualSwitcher(result_ft138,
													null));
					if (idLoopCond_535) {
					} else {

						elem_ft138 = it_ft138.next();

						java.lang.Boolean idIfCond_536 = false;
						//BIle:detector
						kermeta.language.behavior.Expression p_lbdExp138 = elem_ft138;

						i = kermeta.standard.helper.IntegerWrapper.plus(i, 1);

						idIfCond_536 = org.kermeta.compil.runtime.helper.language.ObjectUtil
								.equalsSwitcher(p_lbdExp138, this);
						//EIle:detector

						if (idIfCond_536) {

							result_ft138 = elem_ft138;
						}

					}
				}
			}

			//CE
			exp = result_ft138;
			//EIft:detect
			;

			java.lang.Boolean idIfCond_537 = false;
			idIfCond_537 = org.kermeta.compil.runtime.helper.language.ObjectUtil
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

			if (idIfCond_537) {

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

		java.lang.Boolean idIfCond_538 = false;
		idIfCond_538 = this.isParameter();

		if (idIfCond_538) {

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

			kermeta.language.behavior.Expression result_ft139 = null;

			kermeta.language.behavior.Expression elem_ft139 = null;

			result_ft139 = null;

			{

				kermeta.standard.Iterator<kermeta.language.behavior.Expression> it_ft139 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<kermeta.language.behavior.Expression> convertAsOrderedSet(
								cf_.getParameters()).iterator();
				java.lang.Boolean idLoopCond_539 = false;
				while (!idLoopCond_539) {
					idLoopCond_539 = kermeta.standard.helper.BooleanWrapper
							.or(
									it_ft139.isOff(),
									org.kermeta.compil.runtime.helper.language.ObjectUtil
											.isNotEqualSwitcher(result_ft139,
													null));
					if (idLoopCond_539) {
					} else {

						elem_ft139 = it_ft139.next();

						java.lang.Boolean idIfCond_540 = false;
						//BIle:detector
						kermeta.language.behavior.Expression p_lbdExp139 = elem_ft139;

						i = kermeta.standard.helper.IntegerWrapper.plus(i, 1);

						idIfCond_540 = org.kermeta.compil.runtime.helper.language.ObjectUtil
								.equalsSwitcher(p_lbdExp139, this);
						//EIle:detector

						if (idIfCond_540) {

							result_ft139 = elem_ft139;
						}

					}
				}
			}

			//CE
			exp = result_ft139;
			//EIft:detect
			;

			java.lang.Boolean idIfCond_541 = false;
			idIfCond_541 = kermeta.standard.helper.IntegerWrapper
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

			if (idIfCond_541) {

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
	public Boolean fromUtil(KM2EcoreContext context) {

		java.lang.Boolean result = null;

		java.lang.String fName = ((km2ecore.helper.java.IdentifierHelper) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject(km2ecore.helper.java.JavaPackage.eINSTANCE
						.getIdentifierHelper())).getMangledIdentifier(this
				.getName(), context);

		java.lang.Boolean idIfCond_542 = false;
		idIfCond_542 = kermeta.standard.helper.BooleanWrapper
				.or(
						kermeta.standard.helper.BooleanWrapper
								.or(
										kermeta.standard.helper.BooleanWrapper
												.or(
														this
																.getStaticOperation()
																.ownedByValueType(),
														kermeta.standard.helper.BooleanWrapper
																.and(
																		kermeta.standard.helper.StringWrapper
																				.equals(
																						this
																								.getStaticOperation()
																								.getOwningClass()
																								.qualifiedName(),
																						"kermeta::language::structure::Object"),
																		this
																				.isFromUtil_MethodFragment(
																						fName,
																						context))),
										kermeta.standard.helper.BooleanWrapper
												.and(
														kermeta.standard.helper.StringWrapper
																.equals(
																		this
																				.getStaticOperation()
																				.getOwningClass()
																				.qualifiedName(),
																		"kermeta::language::structure::Type"),
														this
																.isFromUtil_MethodFragment(
																		fName,
																		context))),
						kermeta.standard.helper.BooleanWrapper.and(
								kermeta.standard.helper.StringWrapper.equals(
										this.getStaticOperation()
												.getOwningClass()
												.qualifiedName(),
										"kermeta::language::structure::Class"),
								this.isFromUtil_MethodFragment(fName, context)));

		if (idIfCond_542) {

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
	public String getParamBindings() {

		java.lang.String result = null;

		result = "";

		java.lang.Integer i = 0;

		//BIft:each

		{

			kermeta.standard.Iterator<kermeta.language.behavior.Expression> it_ft140 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.behavior.Expression> convertAsOrderedSet(
							this.getParameters()).iterator();
			java.lang.Boolean idLoopCond_543 = false;
			while (!idLoopCond_543) {
				idLoopCond_543 = it_ft140.isOff();
				if (idLoopCond_543) {
				} else {

					//BIle:func
					kermeta.language.behavior.Expression param_lbdExp140 = it_ft140
							.next();

					java.lang.Boolean idIfCond_544 = false;
					idIfCond_544 = org.kermeta.compil.runtime.helper.language.ObjectUtil
							.isInstanceOfSwitcher(
									param_lbdExp140,
									org.kermeta.compil.runtime.ExecutionContext
											.getInstance()
											.getMetaClass(
													"kermeta.language.behavior.LambdaExpression"));

					if (idIfCond_544) {

						java.lang.Boolean idIfCond_545 = false;
						idIfCond_545 = org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isInstanceOfSwitcher(
										((kermeta.language.behavior.LambdaExpression) org.kermeta.compil.runtime.helper.language.ObjectUtil
												.asTypeSwitcher(
														param_lbdExp140,
														org.kermeta.compil.runtime.ExecutionContext
																.getInstance()
																.getMetaClass(
																		"kermeta.language.behavior.LambdaExpression")))
												.getStaticType(),
										org.kermeta.compil.runtime.ExecutionContext
												.getInstance()
												.getMetaClass(
														"kermeta.language.structure.ProductType"));

						if (idIfCond_545) {

							//BIft:each

							{

								kermeta.standard.Iterator<kermeta.language.structure.Type> it_ft141 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
										.<kermeta.language.structure.Type> convertAsSequence(
												((kermeta.language.structure.ProductType) org.kermeta.compil.runtime.helper.language.ObjectUtil
														.asTypeSwitcher(
																((kermeta.language.behavior.LambdaExpression) org.kermeta.compil.runtime.helper.language.ObjectUtil
																		.asTypeSwitcher(
																				param_lbdExp140,
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
								java.lang.Boolean idLoopCond_546 = false;
								while (!idLoopCond_546) {
									idLoopCond_546 = it_ft141.isOff();
									if (idLoopCond_546) {
									} else {

										//BIle:func
										kermeta.language.structure.Type t_lbdExp141 = it_ft141
												.next();

										java.lang.Boolean idIfCond_547 = false;
										idIfCond_547 = kermeta.standard.helper.IntegerWrapper
												.equals(i, 1);

										if (idIfCond_547) {

											result = kermeta.standard.helper.StringWrapper
													.plus(result, ", ");
										} else {

											i = 1;
										}

										result = kermeta.standard.helper.StringWrapper
												.plus(result, t_lbdExp141
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

		java.lang.Boolean idIfCond_548 = false;
		idIfCond_548 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isNotEqualSwitcher(result, "");

		if (idIfCond_548) {

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

		java.lang.Boolean idIfCond_549 = false;
		idIfCond_549 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoidSwitcher(this.getFunctionType()));

		if (idIfCond_549) {

			result = this.getFunctionType().getRight();
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

		java.lang.Boolean idIfCond_550 = false;
		idIfCond_550 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isInstanceOfSwitcher(
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.containerSwitcher(this),
						org.kermeta.compil.runtime.ExecutionContext
								.getInstance()
								.getMetaClass(
										"kermeta.language.behavior.CallFeature"));

		if (idIfCond_550) {

			//BIft:detect

			kermeta.language.behavior.Expression result_ft142 = null;

			kermeta.language.behavior.Expression elem_ft142 = null;

			result_ft142 = null;

			{

				kermeta.standard.Iterator<kermeta.language.behavior.Expression> it_ft142 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
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
				java.lang.Boolean idLoopCond_551 = false;
				while (!idLoopCond_551) {
					idLoopCond_551 = kermeta.standard.helper.BooleanWrapper
							.or(
									it_ft142.isOff(),
									org.kermeta.compil.runtime.helper.language.ObjectUtil
											.isNotEqualSwitcher(result_ft142,
													null));
					if (idLoopCond_551) {
					} else {

						elem_ft142 = it_ft142.next();

						java.lang.Boolean idIfCond_552 = false;
						//BIle:detector
						kermeta.language.behavior.Expression p_lbdExp142 = elem_ft142;

						idIfCond_552 = org.kermeta.compil.runtime.helper.language.ObjectUtil
								.equalsSwitcher(p_lbdExp142, this);
						//EIle:detector

						if (idIfCond_552) {

							result_ft142 = elem_ft142;
						}

					}
				}
			}

			//EIft:detect
			result = kermeta.standard.helper.BooleanWrapper
					.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
							.isVoidSwitcher(result_ft142));
		}

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean isCallFeatureTargetsValueTypeOperation() {

		java.lang.Boolean result = null;

		result = false;

		java.lang.Boolean idIfCond_553 = false;
		idIfCond_553 = this.getStaticOperation().ownedByValueType();

		if (idIfCond_553) {

			result = true;
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
		case BehaviorPackage.CALL_FEATURE__CALLED_FT_RESULT:
			return getCalledFtResult();
		case BehaviorPackage.CALL_FEATURE__STATIC_OPERATION:
			if (resolve)
				return getStaticOperation();
			return basicGetStaticOperation();
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
		case BehaviorPackage.CALL_FEATURE__CALLED_FT_RESULT:
			setCalledFtResult((String) newValue);
			return;
		case BehaviorPackage.CALL_FEATURE__STATIC_OPERATION:
			setStaticOperation((Operation) newValue);
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
		case BehaviorPackage.CALL_FEATURE__CALLED_FT_RESULT:
			setCalledFtResult(CALLED_FT_RESULT_EDEFAULT);
			return;
		case BehaviorPackage.CALL_FEATURE__STATIC_OPERATION:
			setStaticOperation((Operation) null);
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
		case BehaviorPackage.CALL_FEATURE__CALLED_FT_RESULT:
			return CALLED_FT_RESULT_EDEFAULT == null ? calledFtResult != null
					: !CALLED_FT_RESULT_EDEFAULT.equals(calledFtResult);
		case BehaviorPackage.CALL_FEATURE__STATIC_OPERATION:
			return staticOperation != null;
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
