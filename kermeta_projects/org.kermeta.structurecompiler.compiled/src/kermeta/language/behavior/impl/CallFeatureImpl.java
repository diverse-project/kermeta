/**
 * <copyright>
 * </copyright>
 *
 * $Id: CallFeatureImpl.java,v 1.14 2009-01-21 09:15:57 cfaucher Exp $
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
 *   <li>{@link kermeta.language.behavior.impl.CallFeatureImpl#getIsAtpre <em>Is Atpre</em>}</li>
 *   <li>{@link kermeta.language.behavior.impl.CallFeatureImpl#getCalledFtResult <em>Called Ft Result</em>}</li>
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

		kermeta.language.structure.Type result_ft126 = null;

		kermeta.language.structure.Type elem_ft126 = null;

		result_ft126 = null;

		{

			kermeta.standard.Iterator<kermeta.language.structure.Type> it_ft126 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Type> convertAsOrderedSet(
							this.getContainedType()).iterator();
			java.lang.Boolean idLoopCond_420 = false;
			while (!idLoopCond_420) {
				idLoopCond_420 = kermeta.standard.helper.BooleanWrapper.or(
						it_ft126.isOff(),
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isNotEqualSwitcher(result_ft126, null));
				if (idLoopCond_420) {
				} else {

					elem_ft126 = it_ft126.next();

					java.lang.Boolean idIfCond_421 = false;
					//BIle:detector
					kermeta.language.structure.Type t_lbdExp126 = elem_ft126;

					idIfCond_421 = org.kermeta.compil.runtime.helper.language.ObjectUtil
							.isInstanceOfSwitcher(
									t_lbdExp126,
									org.kermeta.compil.runtime.ExecutionContext
											.getInstance()
											.getMetaClass(
													"kermeta.language.structure.FunctionType"));
					//EIle:detector

					if (idIfCond_421) {

						result_ft126 = elem_ft126;
					}

				}
			}
		}

		//CE
		result = (kermeta.language.structure.FunctionType) org.kermeta.compil.runtime.helper.language.ObjectUtil
				.asTypeOrVoid(result_ft126,
						"kermeta.language.structure.FunctionType");
		//EIft:detect

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

		java.lang.Boolean idIfCond_422 = false;
		idIfCond_422 = kermeta.standard.helper.BooleanWrapper
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

		if (idIfCond_422) {

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
	public String createBehaviorJava(KM2EcoreContext context) {

		java.lang.String result = null;

		super.createBehaviorJava(context);

		result = "";

		java.lang.Boolean ppCast = false;

		java.lang.String cf_prop_suffix = "";

		java.lang.Boolean idIfCond_423 = false;
		idIfCond_423 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isVoidSwitcher(this.getTarget());

		if (idIfCond_423) {

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

		java.lang.Boolean idIfCond_424 = false;
		idIfCond_424 = this.isCallFeatureAsStaticOperation();

		if (idIfCond_424) {

			java.lang.Boolean idIfCond_425 = false;
			idIfCond_425 = this.callsFunctionType();

			if (idIfCond_425) {

				context.getTasks_stack().push(
						context.getFUNCTION_TYPE_COMPILATION_TASK());

				context.setAfterLbdExpActivation(false);

				java.lang.String ft_str = this
						.createStringFromFunctionType(context);

				context.getTasks_stack().pop();

				result = ft_str;
			} else {

				java.lang.Boolean idIfCond_426 = false;
				idIfCond_426 = this.fromUtil(context);

				if (idIfCond_426) {

					java.lang.Boolean idIfCond_427 = false;
					idIfCond_427 = ((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil
							.asTypeSwitcher(
									org.kermeta.compil.runtime.helper.language.ObjectUtil
											.containerSwitcher(this
													.getStaticOperation()),
									org.kermeta.compil.runtime.ExecutionContext
											.getInstance()
											.getMetaClass(
													"kermeta.language.structure.ClassDefinition")))
							.isValueType();

					if (idIfCond_427) {

						static_call = this.getStaticOperation()
								.getOptimizedStaticCall(context);

						java.lang.Boolean idIfCond_428 = false;
						idIfCond_428 = kermeta.standard.helper.StringWrapper
								.equals(static_call, "");

						if (idIfCond_428) {

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

						java.lang.Boolean idIfCond_429 = false;
						idIfCond_429 = kermeta.standard.helper.StringWrapper
								.equals(static_call, "");

						if (idIfCond_429) {

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

						java.lang.Boolean idIfCond_430 = false;
						idIfCond_430 = kermeta.standard.helper.StringWrapper
								.equals(fName, "asType");

						if (idIfCond_430) {

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

					java.lang.Boolean idIfCond_431 = false;
					idIfCond_431 = kermeta.standard.helper.BooleanWrapper
							.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
									.isVoidSwitcher(tgt));

					if (idIfCond_431) {

						java.lang.Boolean idIfCond_432 = false;
						idIfCond_432 = kermeta.standard.helper.BooleanWrapper
								.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
										.isVoidSwitcher(tgt.getStaticType()));

						if (idIfCond_432) {

							java.lang.Boolean idIfCond_433 = false;
							idIfCond_433 = tgt.getStaticType().isValueType();

							if (idIfCond_433) {

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

						java.lang.Boolean idIfCond_434 = false;
						idIfCond_434 = kermeta.standard.helper.BooleanWrapper
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

						if (idIfCond_434) {

							static_call = this.getStaticOperation()
									.getOptimizedStaticCall(context);
						}

					}

				}

			}

		}

		java.lang.Boolean idIfCond_435 = false;
		idIfCond_435 = kermeta.standard.helper.BooleanWrapper
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

		if (idIfCond_435) {

			java.lang.String type_label = tgt.createBehaviorJava(context);

			java.lang.Boolean idIfCond_436 = false;
			idIfCond_436 = kermeta.standard.helper.BooleanWrapper
					.not(kermeta.standard.helper.StringWrapper.isValueType(
							type_label, context));

			if (idIfCond_436) {

				java.lang.String pojoType_label = "";

				java.lang.Boolean idIfCond_437 = false;
				idIfCond_437 = org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isInstanceOfSwitcher(
								tgt.getStaticType(),
								org.kermeta.compil.runtime.ExecutionContext
										.getInstance()
										.getMetaClass(
												"kermeta.language.structure.ParameterizedType"));

				if (idIfCond_437) {

					pojoType_label = ((kermeta.language.structure.ParameterizedType) org.kermeta.compil.runtime.helper.language.ObjectUtil
							.asTypeSwitcher(
									tgt.getStaticType(),
									org.kermeta.compil.runtime.ExecutionContext
											.getInstance()
											.getMetaClass(
													"kermeta.language.structure.ParameterizedType")))
							.getTypeDefinition().getFinalJavaClassQN();
				}

				java.lang.Boolean idIfCond_438 = false;
				idIfCond_438 = org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isNotEqualSwitcher(pojoType_label, "");

				if (idIfCond_438) {

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

				result = kermeta.standard.helper.StringWrapper.plus(
						kermeta.standard.helper.StringWrapper.plus("new ",
								type_label), "()");
			}

		} else {

			java.lang.Boolean idIfCond_439 = false;
			idIfCond_439 = kermeta.standard.helper.BooleanWrapper
					.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
							.isVoidSwitcher(tgt));

			if (idIfCond_439) {

				java.lang.Boolean idIfCond_440 = false;
				idIfCond_440 = kermeta.standard.helper.BooleanWrapper.not(tgt
						.callsFunctionType());

				if (idIfCond_440) {

					java.lang.Boolean idIfCond_441 = false;
					idIfCond_441 = kermeta.standard.helper.BooleanWrapper
							.not(this.callsFunctionType());

					if (idIfCond_441) {

						java.lang.String tgt_staticType_str = "";

						java.lang.Boolean idIfCond_442 = false;
						idIfCond_442 = kermeta.standard.helper.BooleanWrapper
								.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
										.isVoidSwitcher(tgt.getStaticType()));

						if (idIfCond_442) {

							tgt_staticType_str = org.kermeta.compil.runtime.helper.language.ObjectUtil
									.toStringSwitcher(tgt.getStaticType());
						}

						java.lang.Boolean idIfCond_443 = false;
						idIfCond_443 = kermeta.standard.helper.BooleanWrapper
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

						if (idIfCond_443) {

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

						java.lang.Boolean idIfCond_444 = false;
						idIfCond_444 = kermeta.standard.helper.StringWrapper
								.equals(static_call, "");

						if (idIfCond_444) {

							result = kermeta.standard.helper.StringWrapper
									.plus(result, ".");
						}

					} else {

						java.lang.Boolean idIfCond_445 = false;
						idIfCond_445 = kermeta.standard.helper.BooleanWrapper
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

						if (idIfCond_445) {

							java.lang.String resultPrefix = "";

							java.lang.Boolean idIfCond_446 = false;
							idIfCond_446 = org.kermeta.compil.runtime.helper.language.ObjectUtil
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

							if (idIfCond_446) {

								resultPrefix = context
										.getRETURN_EXPRESSION_TO_REPLACE_SPECIAL();
							}

							java.lang.Boolean idIfCond_447 = false;
							idIfCond_447 = org.kermeta.compil.runtime.helper.language.ObjectUtil
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

							if (idIfCond_447) {

								resultPrefix = context
										.getRETURN_EXPRESSION_TO_REPLACE_SPECIAL();
							}

							java.lang.Boolean idIfCond_448 = false;
							idIfCond_448 = org.kermeta.compil.runtime.helper.language.ObjectUtil
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

							if (idIfCond_448) {

								resultPrefix = context
										.getRETURN_EXPRESSION_TO_REPLACE_SPECIAL();
							}

							java.lang.Boolean idIfCond_449 = false;
							idIfCond_449 = kermeta.standard.helper.BooleanWrapper
									.not(this.isParameter());

							if (idIfCond_449) {

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

			java.lang.Boolean idIfCond_450 = false;
			idIfCond_450 = kermeta.standard.helper.StringWrapper.equals(
					static_call, "");

			if (idIfCond_450) {

				java.lang.Boolean idIfCond_451 = false;
				idIfCond_451 = this.isCallFeatureAsStaticEnumLiteral();

				if (idIfCond_451) {

					result = kermeta.standard.helper.StringWrapper.plus(
							kermeta.standard.helper.StringWrapper.plus(
									kermeta.standard.helper.StringWrapper.plus(
											result, "getByName(\""), fName),
							"\")");
				} else {

					java.lang.Boolean idIfCond_452 = false;
					idIfCond_452 = this.isCallFeatureAsStaticProperty();

					if (idIfCond_452) {

						java.lang.Boolean idIfCond_453 = false;
						idIfCond_453 = kermeta.standard.helper.BooleanWrapper
								.and(
										org.kermeta.compil.runtime.helper.language.ObjectUtil
												.isNotEqualSwitcher(this
														.getStaticProperty()
														.getUpper(), 1),
										kermeta.standard.helper.BooleanWrapper
												.not(this.isParameterMany()));

						if (idIfCond_453) {

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

							java.lang.Boolean idIfCond_454 = false;
							idIfCond_454 = kermeta.standard.helper.BooleanWrapper
									.and(
											kermeta.standard.helper.BooleanWrapper
													.not(this
															.getStaticProperty()
															.getIsUnique()),
											kermeta.standard.helper.BooleanWrapper
													.not(this
															.getStaticProperty()
															.getIsOrdered()));

							if (idIfCond_454) {

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

							java.lang.Boolean idIfCond_455 = false;
							idIfCond_455 = kermeta.standard.helper.BooleanWrapper
									.and(
											this.getStaticProperty()
													.getIsUnique(),
											kermeta.standard.helper.BooleanWrapper
													.not(this
															.getStaticProperty()
															.getIsOrdered()));

							if (idIfCond_455) {

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

							java.lang.Boolean idIfCond_456 = false;
							idIfCond_456 = kermeta.standard.helper.BooleanWrapper
									.and(
											this.getStaticProperty()
													.getIsUnique(), this
													.getStaticProperty()
													.getIsOrdered());

							if (idIfCond_456) {

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

							java.lang.Boolean idIfCond_457 = false;
							idIfCond_457 = kermeta.standard.helper.BooleanWrapper
									.and(kermeta.standard.helper.BooleanWrapper
											.not(this.getStaticProperty()
													.getIsUnique()), this
											.getStaticProperty().getIsOrdered());

							if (idIfCond_457) {

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

						java.lang.Boolean idIfCond_458 = false;
						idIfCond_458 = kermeta.standard.helper.BooleanWrapper
								.not(this.callsFunctionType());

						if (idIfCond_458) {

							java.lang.Boolean idIfCond_459 = false;
							idIfCond_459 = kermeta.standard.helper.BooleanWrapper
									.and(
											org.kermeta.compil.runtime.helper.language.ObjectUtil
													.isNotEqualSwitcher(
															this
																	.getStaticOperation()
																	.getUpper(),
															1),
											kermeta.standard.helper.BooleanWrapper
													.not(this.isParameterMany()));

							if (idIfCond_459) {

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

								java.lang.Boolean idIfCond_460 = false;
								idIfCond_460 = kermeta.standard.helper.BooleanWrapper
										.and(
												kermeta.standard.helper.BooleanWrapper
														.not(this
																.getStaticOperation()
																.getIsUnique()),
												kermeta.standard.helper.BooleanWrapper
														.not(this
																.getStaticOperation()
																.getIsOrdered()));

								if (idIfCond_460) {

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

								java.lang.Boolean idIfCond_461 = false;
								idIfCond_461 = kermeta.standard.helper.BooleanWrapper
										.and(
												this.getStaticOperation()
														.getIsUnique(),
												kermeta.standard.helper.BooleanWrapper
														.not(this
																.getStaticOperation()
																.getIsOrdered()));

								if (idIfCond_461) {

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

								java.lang.Boolean idIfCond_462 = false;
								idIfCond_462 = kermeta.standard.helper.BooleanWrapper
										.and(this.getStaticOperation()
												.getIsUnique(), this
												.getStaticOperation()
												.getIsOrdered());

								if (idIfCond_462) {

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

								java.lang.Boolean idIfCond_463 = false;
								idIfCond_463 = kermeta.standard.helper.BooleanWrapper
										.and(
												kermeta.standard.helper.BooleanWrapper
														.not(this
																.getStaticOperation()
																.getIsUnique()),
												this.getStaticOperation()
														.getIsOrdered());

								if (idIfCond_463) {

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

							java.lang.Boolean idIfCond_464 = false;
							idIfCond_464 = kermeta.standard.helper.BooleanWrapper
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

							if (idIfCond_464) {

								java.lang.Boolean idIfCond_465 = false;
								idIfCond_465 = org.kermeta.compil.runtime.helper.language.ObjectUtil
										.isInstanceOfSwitcher(
												org.kermeta.compil.runtime.helper.language.ObjectUtil
														.containerSwitcher(this),
												org.kermeta.compil.runtime.ExecutionContext
														.getInstance()
														.getMetaClass(
																"kermeta.language.behavior.CallFeature"));

								if (idIfCond_465) {

									kermeta.language.behavior.CallFeature cf_ = ((kermeta.language.behavior.CallFeature) org.kermeta.compil.runtime.helper.language.ObjectUtil
											.asTypeSwitcher(
													org.kermeta.compil.runtime.helper.language.ObjectUtil
															.containerSwitcher(this),
													org.kermeta.compil.runtime.ExecutionContext
															.getInstance()
															.getMetaClass(
																	"kermeta.language.behavior.CallFeature")));

									java.lang.Boolean idIfCond_466 = false;
									idIfCond_466 = kermeta.standard.helper.BooleanWrapper
											.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
													.isVoidSwitcher(cf_
															.getStaticOperation()));

									if (idIfCond_466) {

										java.lang.Boolean idIfCond_467 = false;
										idIfCond_467 = kermeta.standard.helper.BooleanWrapper
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

										if (idIfCond_467) {
										} else {

											result = kermeta.standard.helper.StringWrapper
													.plus(result, ".");
										}

									} else {

										java.lang.Boolean idIfCond_468 = false;
										idIfCond_468 = kermeta.standard.helper.BooleanWrapper
												.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isVoidSwitcher(cf_
																.getStaticProperty()));

										if (idIfCond_468) {

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

				java.lang.Boolean idIfCond_469 = false;
				idIfCond_469 = kermeta.standard.helper.StringWrapper.contains(
						result, context.getRETURN_EXPRESSION_TO_REPLACE());

				if (idIfCond_469) {

					result = kermeta.standard.helper.StringWrapper.replace(
							result, context.getRETURN_EXPRESSION_TO_REPLACE(),
							kermeta.standard.helper.StringWrapper.plus(
									static_call, "("));
				} else {

					java.lang.String tmp_prefix = "";

					//BIft:detect

					kermeta.language.behavior.Expression result_ft127 = null;

					kermeta.language.behavior.Expression elem_ft127 = null;

					result_ft127 = null;

					{

						kermeta.standard.Iterator<kermeta.language.behavior.Expression> it_ft127 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
								.<kermeta.language.behavior.Expression> convertAsOrderedSet(
										this.getParameters()).iterator();
						java.lang.Boolean idLoopCond_471 = false;
						while (!idLoopCond_471) {
							idLoopCond_471 = kermeta.standard.helper.BooleanWrapper
									.or(
											it_ft127.isOff(),
											org.kermeta.compil.runtime.helper.language.ObjectUtil
													.isNotEqualSwitcher(
															result_ft127, null));
							if (idLoopCond_471) {
							} else {

								elem_ft127 = it_ft127.next();

								java.lang.Boolean idIfCond_472 = false;
								//BIle:detector
								kermeta.language.behavior.Expression p_lbdExp127 = elem_ft127;

								idIfCond_472 = p_lbdExp127.callsFunctionType();
								//EIle:detector

								if (idIfCond_472) {

									result_ft127 = elem_ft127;
								}

							}
						}
					}

					//EIft:detect
					java.lang.Boolean idIfCond_470 = false;
					idIfCond_470 = kermeta.standard.helper.BooleanWrapper
							.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
									.isVoidSwitcher(result_ft127));

					if (idIfCond_470) {

						tmp_prefix = context.getRETURN_EXPRESSION_TO_REPLACE();
					}

					result = kermeta.standard.helper.StringWrapper.plus(
							kermeta.standard.helper.StringWrapper.plus(
									kermeta.standard.helper.StringWrapper.plus(
											tmp_prefix, static_call), "("),
							result);
				}

				java.lang.Boolean idIfCond_473 = false;
				idIfCond_473 = ppCast;

				if (idIfCond_473) {

					result = kermeta.standard.helper.StringWrapper.plus("(",
							result);
				}

			}

			java.lang.Boolean idIfCond_474 = false;
			idIfCond_474 = kermeta.standard.helper.BooleanWrapper.and(this
					.isCallFeatureAsStaticOperation(),
					kermeta.standard.helper.BooleanWrapper.not(this
							.callsFunctionType()));

			if (idIfCond_474) {

				java.lang.Boolean idIfCond_475 = false;
				idIfCond_475 = kermeta.standard.helper.StringWrapper.equals(
						static_call, "");

				if (idIfCond_475) {

					result = kermeta.standard.helper.StringWrapper.plus(result,
							"(");
				} else {

					static_call = "";

					java.lang.Boolean idIfCond_476 = false;
					idIfCond_476 = kermeta.standard.helper.BooleanWrapper
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

					if (idIfCond_476) {

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

				java.lang.Boolean idIfCond_477 = false;
				idIfCond_477 = ppCast;

				if (idIfCond_477) {

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

			kermeta.standard.Iterator<kermeta.language.behavior.Expression> it_ft128 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.behavior.Expression> convertAsOrderedSet(
							this.getParameters()).iterator();
			java.lang.Boolean idLoopCond_478 = false;
			while (!idLoopCond_478) {
				idLoopCond_478 = it_ft128.isOff();
				if (idLoopCond_478) {
				} else {

					//BIle:func
					kermeta.language.behavior.Expression param_lbdExp128 = it_ft128
							.next();

					java.lang.Boolean idIfCond_479 = false;
					idIfCond_479 = org.kermeta.compil.runtime.helper.language.ObjectUtil
							.isInstanceOfSwitcher(
									param_lbdExp128,
									org.kermeta.compil.runtime.ExecutionContext
											.getInstance()
											.getMetaClass(
													"kermeta.language.behavior.LambdaExpression"));

					if (idIfCond_479) {

						java.lang.Boolean idIfCond_480 = false;
						idIfCond_480 = org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isInstanceOfSwitcher(
										((kermeta.language.behavior.LambdaExpression) org.kermeta.compil.runtime.helper.language.ObjectUtil
												.asTypeSwitcher(
														param_lbdExp128,
														org.kermeta.compil.runtime.ExecutionContext
																.getInstance()
																.getMetaClass(
																		"kermeta.language.behavior.LambdaExpression")))
												.getStaticType(),
										org.kermeta.compil.runtime.ExecutionContext
												.getInstance()
												.getMetaClass(
														"kermeta.language.structure.ProductType"));

						if (idIfCond_480) {

							//BIft:each

							{

								kermeta.standard.Iterator<kermeta.language.structure.Type> it_ft129 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
										.<kermeta.language.structure.Type> convertAsSequence(
												((kermeta.language.structure.ProductType) org.kermeta.compil.runtime.helper.language.ObjectUtil
														.asTypeSwitcher(
																((kermeta.language.behavior.LambdaExpression) org.kermeta.compil.runtime.helper.language.ObjectUtil
																		.asTypeSwitcher(
																				param_lbdExp128,
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
								java.lang.Boolean idLoopCond_481 = false;
								while (!idLoopCond_481) {
									idLoopCond_481 = it_ft129.isOff();
									if (idLoopCond_481) {
									} else {

										//BIle:func
										kermeta.language.structure.Type t_lbdExp129 = it_ft129
												.next();

										java.lang.Boolean idIfCond_482 = false;
										idIfCond_482 = kermeta.standard.helper.IntegerWrapper
												.equals(i, 1);

										if (idIfCond_482) {

											result = kermeta.standard.helper.StringWrapper
													.plus(result, ", ");
										} else {

											i = 1;
										}

										result = kermeta.standard.helper.StringWrapper
												.plus(result, t_lbdExp129
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

		java.lang.Boolean idIfCond_483 = false;
		idIfCond_483 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isNotEqualSwitcher(result, "");

		if (idIfCond_483) {

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

		java.lang.Boolean idIfCond_484 = false;
		idIfCond_484 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoidSwitcher(this.getFunctionType()));

		if (idIfCond_484) {

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

		java.lang.Boolean idIfCond_485 = false;
		idIfCond_485 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoidSwitcher(this.getStaticOperation()));

		if (idIfCond_485) {

			java.lang.Boolean idIfCond_486 = false;
			idIfCond_486 = kermeta.standard.helper.StringWrapper
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

			if (idIfCond_486) {

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
	public Boolean isParameter() {

		java.lang.Boolean result = null;

		result = false;

		java.lang.Boolean idIfCond_487 = false;
		idIfCond_487 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isInstanceOfSwitcher(
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.containerSwitcher(this),
						org.kermeta.compil.runtime.ExecutionContext
								.getInstance()
								.getMetaClass(
										"kermeta.language.behavior.CallFeature"));

		if (idIfCond_487) {

			//BIft:detect

			kermeta.language.behavior.Expression result_ft130 = null;

			kermeta.language.behavior.Expression elem_ft130 = null;

			result_ft130 = null;

			{

				kermeta.standard.Iterator<kermeta.language.behavior.Expression> it_ft130 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
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
				java.lang.Boolean idLoopCond_488 = false;
				while (!idLoopCond_488) {
					idLoopCond_488 = kermeta.standard.helper.BooleanWrapper
							.or(
									it_ft130.isOff(),
									org.kermeta.compil.runtime.helper.language.ObjectUtil
											.isNotEqualSwitcher(result_ft130,
													null));
					if (idLoopCond_488) {
					} else {

						elem_ft130 = it_ft130.next();

						java.lang.Boolean idIfCond_489 = false;
						//BIle:detector
						kermeta.language.behavior.Expression p_lbdExp130 = elem_ft130;

						idIfCond_489 = org.kermeta.compil.runtime.helper.language.ObjectUtil
								.equalsSwitcher(p_lbdExp130, this);
						//EIle:detector

						if (idIfCond_489) {

							result_ft130 = elem_ft130;
						}

					}
				}
			}

			//EIft:detect
			result = kermeta.standard.helper.BooleanWrapper
					.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
							.isVoidSwitcher(result_ft130));
		}

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
	public String createStringFromFunctionType(KM2EcoreContext context) {

		java.lang.String result = null;

		kermeta.language.behavior.Expression tgt = this.getTarget();

		kermeta.utils.Hashtable<kermeta.language.structure.Type, kermeta.language.structure.Type> map_type = ((kermeta.utils.Hashtable<kermeta.language.structure.Type, kermeta.language.structure.Type>) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject(kermeta.utils.UtilsPackage.eINSTANCE.getHashtable()));

		java.lang.Integer inc_tp = 0;

		//BIft:each

		{

			kermeta.standard.Iterator<kermeta.language.structure.Type> it_ft131 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Type> convertAsOrderedSet(
							this.getStaticTypeVariableBindings()).iterator();
			java.lang.Boolean idLoopCond_490 = false;
			while (!idLoopCond_490) {
				idLoopCond_490 = it_ft131.isOff();
				if (idLoopCond_490) {
				} else {

					//BIle:func
					kermeta.language.structure.Type type__lbdExp131 = it_ft131
							.next();

					map_type
							.put(
									org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
											.<kermeta.language.structure.TypeVariable> convertAsOrderedSet(
													this.getStaticOperation()
															.getTypeParameter())
											.elementAt(inc_tp), type__lbdExp131);

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

		kermeta.language.behavior.Expression result_ft132 = null;

		kermeta.language.behavior.Expression elem_ft132 = null;

		result_ft132 = null;

		{

			kermeta.standard.Iterator<kermeta.language.behavior.Expression> it_ft132 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.behavior.Expression> convertAsOrderedSet(
							this.getParameters()).iterator();
			java.lang.Boolean idLoopCond_492 = false;
			while (!idLoopCond_492) {
				idLoopCond_492 = kermeta.standard.helper.BooleanWrapper.or(
						it_ft132.isOff(),
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isNotEqualSwitcher(result_ft132, null));
				if (idLoopCond_492) {
				} else {

					elem_ft132 = it_ft132.next();

					java.lang.Boolean idIfCond_493 = false;
					//BIle:detector
					kermeta.language.behavior.Expression param_lbdExp132 = elem_ft132;

					idIfCond_493 = org.kermeta.compil.runtime.helper.language.ObjectUtil
							.isInstanceOfSwitcher(
									param_lbdExp132,
									org.kermeta.compil.runtime.ExecutionContext
											.getInstance()
											.getMetaClass(
													"kermeta.language.behavior.LambdaExpression"));
					//EIle:detector

					if (idIfCond_493) {

						result_ft132 = elem_ft132;
					}

				}
			}
		}

		//EIft:detect
		java.lang.Boolean idIfCond_491 = false;
		idIfCond_491 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoidSwitcher(result_ft132));

		if (idIfCond_491) {

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
											.isNotEqualSwitcher(result_ft133,
													null));
					if (idLoopCond_494) {
					} else {

						elem_ft133 = it_ft133.next();

						java.lang.Boolean idIfCond_495 = false;
						//BIle:detector
						kermeta.language.behavior.Expression param_lbdExp133 = elem_ft133;

						idIfCond_495 = org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isInstanceOfSwitcher(
										param_lbdExp133,
										org.kermeta.compil.runtime.ExecutionContext
												.getInstance()
												.getMetaClass(
														"kermeta.language.behavior.LambdaExpression"));
						//EIle:detector

						if (idIfCond_495) {

							result_ft133 = elem_ft133;
						}

					}
				}
			}

			//EIft:detect
			kermeta.language.behavior.LambdaExpression theLambdaExp = ((kermeta.language.behavior.LambdaExpression) org.kermeta.compil.runtime.helper.language.ObjectUtil
					.asTypeSwitcher(
							result_ft133,
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

			java.lang.Boolean idIfCond_496 = false;
			idIfCond_496 = org.kermeta.compil.runtime.helper.language.ObjectUtil
					.isInstanceOfSwitcher(
							theLambdaExp.getStaticType(),
							org.kermeta.compil.runtime.ExecutionContext
									.getInstance()
									.getMetaClass(
											"kermeta.language.structure.FunctionType"));

			if (idIfCond_496) {

				kermeta.language.structure.FunctionType current_functionType = ((kermeta.language.structure.FunctionType) org.kermeta.compil.runtime.helper.language.ObjectUtil
						.asTypeSwitcher(
								theLambdaExp.getStaticType(),
								org.kermeta.compil.runtime.ExecutionContext
										.getInstance()
										.getMetaClass(
												"kermeta.language.structure.FunctionType")));

				java.lang.Boolean idIfCond_497 = false;
				idIfCond_497 = org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isInstanceOfSwitcher(
								current_functionType.getLeft(),
								org.kermeta.compil.runtime.ExecutionContext
										.getInstance()
										.getMetaClass(
												"kermeta.language.structure.ProductType"));

				if (idIfCond_497) {

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

		java.lang.Boolean idIfCond_498 = false;
		idIfCond_498 = tgt.callsFunctionType();

		if (idIfCond_498) {

			context.setFtSuffixActivation(true);

			context
					.setFtContextualSelf(context
							.getSELF_EXPRESSION_TO_REPLACE());
		} else {

			context.setFtContextualSelf(tgt.createBehaviorJava(context));
		}

		context.setFtSuffixActivation(true);

		java.lang.String callElement = "";

		java.lang.Boolean idIfCond_499 = false;
		idIfCond_499 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isInstanceOfSwitcher(
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.containerSwitcher(this),
						org.kermeta.compil.runtime.ExecutionContext
								.getInstance()
								.getMetaClass(
										"kermeta.language.behavior.VariableDecl"));

		if (idIfCond_499) {

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

			java.lang.Boolean idIfCond_500 = false;
			idIfCond_500 = org.kermeta.compil.runtime.helper.language.ObjectUtil
					.isInstanceOfSwitcher(
							org.kermeta.compil.runtime.helper.language.ObjectUtil
									.containerSwitcher(this),
							org.kermeta.compil.runtime.ExecutionContext
									.getInstance()
									.getMetaClass(
											"kermeta.language.behavior.CallVariable"));

			if (idIfCond_500) {

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

		java.lang.Boolean idIfCond_501 = false;
		idIfCond_501 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isNotEqualSwitcher(callElement, "");

		if (idIfCond_501) {

			ft_str = kermeta.standard.helper.StringWrapper.plus(ft_str,
					"null;\n");
		}

		java.lang.String ppCastSuffix = "";

		java.lang.String ppValueTypeCastSuffix = "";

		java.lang.Boolean idIfCond_502 = false;
		idIfCond_502 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isInstanceOfSwitcher(
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.containerSwitcher(this),
						org.kermeta.compil.runtime.ExecutionContext
								.getInstance().getMetaClass(
										"kermeta.language.behavior.Assignment"));

		if (idIfCond_502) {

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

			java.lang.Boolean idIfCond_503 = false;
			idIfCond_503 = org.kermeta.compil.runtime.helper.language.ObjectUtil
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

			if (idIfCond_503) {

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

			java.lang.Boolean idIfCond_504 = false;
			idIfCond_504 = org.kermeta.compil.runtime.helper.language.ObjectUtil
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

			if (idIfCond_504) {

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

		java.lang.Boolean idIfCond_505 = false;
		idIfCond_505 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isNotEqualSwitcher(callElement, "");

		if (idIfCond_505) {

			ft_str = kermeta.standard.helper.StringWrapper.plus(ft_str,
					"\n//CE\n");

			java.lang.Boolean idIfCond_506 = false;
			idIfCond_506 = org.kermeta.compil.runtime.helper.language.ObjectUtil
					.isNotEqualSwitcher(context.getResultLastStatementId(), "");

			if (idIfCond_506) {

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

		java.lang.Boolean idIfCond_507 = false;
		idIfCond_507 = kermeta.standard.helper.BooleanWrapper
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

		if (idIfCond_507) {

			java.lang.Boolean idIfCond_508 = false;
			idIfCond_508 = org.kermeta.compil.runtime.helper.language.ObjectUtil
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

			if (idIfCond_508) {

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

		java.lang.Boolean idIfCond_509 = false;
		idIfCond_509 = kermeta.standard.helper.BooleanWrapper
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

		if (idIfCond_509) {

			java.lang.String str_binding = kermeta.standard.helper.StringWrapper
					.replace(context.getResultLastStatementId(), " = ", "");

			java.lang.Boolean idIfCond_510 = false;
			idIfCond_510 = org.kermeta.compil.runtime.helper.language.ObjectUtil
					.isNotEqualSwitcher(str_binding, "");

			if (idIfCond_510) {

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

		java.lang.Boolean idIfCond_511 = false;
		idIfCond_511 = kermeta.standard.helper.BooleanWrapper
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

		if (idIfCond_511) {

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

		java.lang.Boolean idIfCond_512 = false;
		idIfCond_512 = kermeta.standard.helper.BooleanWrapper
				.and(
						kermeta.standard.helper.StringWrapper.equals(
								callElement, ""),
						kermeta.standard.helper.BooleanWrapper
								.not(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ClassUtil
										.newObject(kermeta.language.structure.StructurePackage.eINSTANCE
												.getOperation()))
										.isVoidType(this.getStaticType()
												.getTypeName())));

		if (idIfCond_512) {

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

		java.lang.Boolean idIfCond_513 = false;
		idIfCond_513 = this.isParameter();

		if (idIfCond_513) {

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
				java.lang.Boolean idLoopCond_514 = false;
				while (!idLoopCond_514) {
					idLoopCond_514 = kermeta.standard.helper.BooleanWrapper
							.or(
									it_ft134.isOff(),
									org.kermeta.compil.runtime.helper.language.ObjectUtil
											.isNotEqualSwitcher(result_ft134,
													null));
					if (idLoopCond_514) {
					} else {

						elem_ft134 = it_ft134.next();

						java.lang.Boolean idIfCond_515 = false;
						//BIle:detector
						kermeta.language.behavior.Expression p_lbdExp134 = elem_ft134;

						i = kermeta.standard.helper.IntegerWrapper.plus(i, 1);

						idIfCond_515 = org.kermeta.compil.runtime.helper.language.ObjectUtil
								.equalsSwitcher(p_lbdExp134, this);
						//EIle:detector

						if (idIfCond_515) {

							result_ft134 = elem_ft134;
						}

					}
				}
			}

			//CE
			exp = result_ft134;
			//EIft:detect

			java.lang.Boolean idIfCond_516 = false;
			idIfCond_516 = org.kermeta.compil.runtime.helper.language.ObjectUtil
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

			if (idIfCond_516) {

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

		java.lang.Boolean idIfCond_517 = false;
		idIfCond_517 = this.isParameter();

		if (idIfCond_517) {

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

			kermeta.language.behavior.Expression result_ft135 = null;

			kermeta.language.behavior.Expression elem_ft135 = null;

			result_ft135 = null;

			{

				kermeta.standard.Iterator<kermeta.language.behavior.Expression> it_ft135 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<kermeta.language.behavior.Expression> convertAsOrderedSet(
								cf_.getParameters()).iterator();
				java.lang.Boolean idLoopCond_518 = false;
				while (!idLoopCond_518) {
					idLoopCond_518 = kermeta.standard.helper.BooleanWrapper
							.or(
									it_ft135.isOff(),
									org.kermeta.compil.runtime.helper.language.ObjectUtil
											.isNotEqualSwitcher(result_ft135,
													null));
					if (idLoopCond_518) {
					} else {

						elem_ft135 = it_ft135.next();

						java.lang.Boolean idIfCond_519 = false;
						//BIle:detector
						kermeta.language.behavior.Expression p_lbdExp135 = elem_ft135;

						i = kermeta.standard.helper.IntegerWrapper.plus(i, 1);

						idIfCond_519 = org.kermeta.compil.runtime.helper.language.ObjectUtil
								.equalsSwitcher(p_lbdExp135, this);
						//EIle:detector

						if (idIfCond_519) {

							result_ft135 = elem_ft135;
						}

					}
				}
			}

			//CE
			exp = result_ft135;
			//EIft:detect

			java.lang.Boolean idIfCond_520 = false;
			idIfCond_520 = kermeta.standard.helper.IntegerWrapper
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

			if (idIfCond_520) {

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
		case BehaviorPackage.CALL_FEATURE__IS_ATPRE:
			return getIsAtpre();
		case BehaviorPackage.CALL_FEATURE__CALLED_FT_RESULT:
			return getCalledFtResult();
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
		case BehaviorPackage.CALL_FEATURE__IS_ATPRE:
			setIsAtpre((Boolean) newValue);
			return;
		case BehaviorPackage.CALL_FEATURE__CALLED_FT_RESULT:
			setCalledFtResult((String) newValue);
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
		case BehaviorPackage.CALL_FEATURE__IS_ATPRE:
			setIsAtpre(IS_ATPRE_EDEFAULT);
			return;
		case BehaviorPackage.CALL_FEATURE__CALLED_FT_RESULT:
			setCalledFtResult(CALLED_FT_RESULT_EDEFAULT);
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
		case BehaviorPackage.CALL_FEATURE__IS_ATPRE:
			return IS_ATPRE_EDEFAULT == null ? isAtpre != null
					: !IS_ATPRE_EDEFAULT.equals(isAtpre);
		case BehaviorPackage.CALL_FEATURE__CALLED_FT_RESULT:
			return CALLED_FT_RESULT_EDEFAULT == null ? calledFtResult != null
					: !CALLED_FT_RESULT_EDEFAULT.equals(calledFtResult);
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
		result.append(" (isAtpre: ");
		result.append(isAtpre);
		result.append(", calledFtResult: ");
		result.append(calledFtResult);
		result.append(')');
		return result.toString();
	}

} //CallFeatureImpl
