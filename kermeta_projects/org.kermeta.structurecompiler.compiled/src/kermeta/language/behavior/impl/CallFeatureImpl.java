/**
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * 
 * Generating with Kermeta <http://www.kermeta.org>
 *
 * $Id: CallFeatureImpl.java,v 1.16 2009-02-23 15:26:46 cfaucher Exp $
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

		kermeta.language.structure.Type result_ft141 = null;

		kermeta.language.structure.Type elem_ft141 = null;

		result_ft141 = null;

		{

			kermeta.standard.Iterator<kermeta.language.structure.Type> it_ft141 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Type> convertAsOrderedSet(
							this.getContainedType()).iterator();
			java.lang.Boolean idLoopCond_562 = false;
			while (!idLoopCond_562) {
				idLoopCond_562 = kermeta.standard.helper.BooleanWrapper.or(
						it_ft141.isOff(),
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isNotEqualSwitcher(result_ft141, null));
				if (idLoopCond_562) {
				} else {

					elem_ft141 = it_ft141.next();

					java.lang.Boolean idIfCond_563 = false;
					//BIle:detector
					kermeta.language.structure.Type t_lbdExp141 = elem_ft141;

					idIfCond_563 = org.kermeta.compil.runtime.helper.language.ObjectUtil
							.isInstanceOfSwitcher(
									t_lbdExp141,
									org.kermeta.compil.runtime.ExecutionContext
											.getInstance()
											.getMetaClass(
													"kermeta.language.structure.FunctionType"));
					//EIle:detector

					if (idIfCond_563) {

						result_ft141 = elem_ft141;
					}

				}
			}
		}

		//CE
		result = (kermeta.language.structure.FunctionType) org.kermeta.compil.runtime.helper.language.ObjectUtil
				.asTypeOrVoid(result_ft141,
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

			java.lang.Boolean idIfCond_500 = false;
			idIfCond_500 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(this.getTarget());

			if( idIfCond_500 ) {

			this.setTarget(((kermeta.language.behavior.SelfExpression) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.language.behavior.BehaviorPackage.eINSTANCE.getSelfExpression())));
		}


			kermeta.language.behavior.Expression tgt = this.getTarget();

			java.lang.String fName = ((km2ecore.helper.java.IdentifierHelper) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(km2ecore.helper.java.JavaPackage.eINSTANCE.getIdentifierHelper())).getMangledIdentifier(this.getName(), context);

			java.lang.String static_call = "";

			java.lang.Boolean idIfCond_501 = false;
			idIfCond_501 = this.isCallFeatureAsStaticOperation();

			if( idIfCond_501 ) {

			java.lang.Boolean idIfCond_502 = false;
			idIfCond_502 = this.callsFunctionType();

			if( idIfCond_502 ) {

			context.getTasks_stack().push(context.getFUNCTION_TYPE_COMPILATION_TASK());

			context.setAfterLbdExpActivation(false);

			java.lang.String ft_str = this.createStringFromFunctionType(context);

			context.getTasks_stack().pop();

			result = ft_str;
		}
		 else {

			java.lang.Boolean idIfCond_503 = false;
			idIfCond_503 = this.fromUtil(context);

			if( idIfCond_503 ) {

			java.lang.Boolean idIfCond_504 = false;
			idIfCond_504 = this.getStaticOperation().ownedByValueType();

			if( idIfCond_504 ) {

			static_call = this.getStaticOperation().getOptimizedStaticCall(context);

			java.lang.Boolean idIfCond_505 = false;
			idIfCond_505 = kermeta.standard.helper.StringWrapper.equals(static_call, "");

			if( idIfCond_505 ) {

			static_call = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.replace(((kermeta.language.structure.Package) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(this.getStaticOperation().getOwningClass()), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass("kermeta.language.structure.Package"))).qualifiedName(), "::", "."), ".helper."), ((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(this.getStaticOperation()), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass("kermeta.language.structure.ClassDefinition"))).getName()), "Wrapper."), fName);
		}

		}
		 else {

			static_call = this.getStaticOperation().getOptimizedStaticCall(context);

			java.lang.Boolean idIfCond_506 = false;
			idIfCond_506 = kermeta.standard.helper.StringWrapper.equals(static_call, "");

			if( idIfCond_506 ) {

			static_call = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus("org.kermeta.compil.runtime.helper.language.", this.getStaticOperation().getOwningClass().getName()), "Util."), fName), "Switcher");
		}


			java.lang.Boolean idIfCond_507 = false;
			idIfCond_507 = kermeta.standard.helper.StringWrapper.equals(fName, "asType");

			if( idIfCond_507 ) {

			ppCast = true;

			static_call = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus("(", org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.behavior.Expression>convertAsOrderedSet(this.getParameters()).first().createBehaviorJava(context)), ") "), static_call);
		}

		}

		}
		 else {

			java.lang.Boolean idIfCond_508 = false;
			idIfCond_508 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(tgt));

			if( idIfCond_508 ) {

			java.lang.Boolean idIfCond_509 = false;
			idIfCond_509 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(tgt.getStaticType()));

			if( idIfCond_509 ) {

			java.lang.Boolean idIfCond_510 = false;
			idIfCond_510 = tgt.getStaticType().isValueType();

			if( idIfCond_510 ) {

			static_call = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus("org.kermeta.compil.runtime.helper.basetypes.", tgt.getStaticType().getTypeName()), "Util."), fName);
		}

		}

		}
		 else {

			java.lang.Boolean idIfCond_511 = false;
			idIfCond_511 = kermeta.standard.helper.BooleanWrapper.and(this.getStaticOperation().getOwningClass().isMappedToJavaRawType(), kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(this.getStaticOperation().getBody())));

			if( idIfCond_511 ) {

			static_call = this.getStaticOperation().getOptimizedStaticCall(context);
		}

		}

		}

		}

		}


			java.lang.Boolean idIfCond_512 = false;
			idIfCond_512 = kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.StringWrapper.equals(fName, "_new"), this.isFromClass()), kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(tgt, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass("kermeta.language.behavior.CallVariable")))), kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(tgt, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass("kermeta.language.behavior.CallFeature")))), kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(tgt, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass("kermeta.language.behavior.SelfExpression")))), kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(tgt, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass("kermeta.language.behavior.CallResult"))));

			if( idIfCond_512 ) {

			java.lang.String type_label = tgt.createBehaviorJava(context);

			java.lang.Boolean idIfCond_513 = false;
			idIfCond_513 = kermeta.standard.helper.BooleanWrapper.not(kermeta.standard.helper.StringWrapper.isValueType(type_label, context));

			if( idIfCond_513 ) {

			java.lang.String pojoType_label = "";

			java.lang.Boolean idIfCond_514 = false;
			idIfCond_514 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(tgt.getStaticType(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass("kermeta.language.structure.ParameterizedType"));

			if( idIfCond_514 ) {

			pojoType_label = ((kermeta.language.structure.ParameterizedType) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(tgt.getStaticType(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass("kermeta.language.structure.ParameterizedType"))).getTypeDefinition().getFinalJavaClassQN();
		}


			java.lang.Boolean idIfCond_515 = false;
			idIfCond_515 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(pojoType_label, "");

			if( idIfCond_515 ) {

			result = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus("new ", pojoType_label), "()");
		}
		 else {

			java.lang.String class_label = ((km2ecore.helper.kermeta.CompilerHelperJava) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(km2ecore.helper.kermeta.KermetaPackage.eINSTANCE.getCompilerHelperJava())).ppEmfLikeGetEMF(type_label);

			result = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(result, "(("), type_label), ") "), "org.kermeta.compil.runtime.helper.language.ClassUtil.newObject("), class_label), "))");
		}

		}
		 else {

			result = ((kermeta.language.structure.ParameterizedType) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(tgt.getStaticType(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass("kermeta.language.structure.ParameterizedType"))).getTypeDefinition().getEMFDefaultConstructor();
		}

		}
		 else {

			java.lang.Boolean idIfCond_516 = false;
			idIfCond_516 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(tgt));

			if( idIfCond_516 ) {

			java.lang.Boolean idIfCond_517 = false;
			idIfCond_517 = kermeta.standard.helper.BooleanWrapper.not(tgt.callsFunctionType());

			if( idIfCond_517 ) {

			java.lang.Boolean idIfCond_518 = false;
			idIfCond_518 = kermeta.standard.helper.BooleanWrapper.not(this.callsFunctionType());

			if( idIfCond_518 ) {

			java.lang.String tgt_staticType_str = "";

			java.lang.Boolean idIfCond_519 = false;
			idIfCond_519 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(tgt.getStaticType()));

			if( idIfCond_519 ) {

			tgt_staticType_str = org.kermeta.compil.runtime.helper.language.ObjectUtil.toStringSwitcher(tgt.getStaticType());
		}


			java.lang.Boolean idIfCond_520 = false;
			idIfCond_520 = kermeta.standard.helper.BooleanWrapper.and(org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(tgt, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass("kermeta.language.behavior.TypeLiteral")), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(tgt_staticType_str, "Enumeration"));

			if( idIfCond_520 ) {

			result = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(result, "org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\""), tgt.createBehaviorJava(context)), "\")");
		}
		 else {

			result = kermeta.standard.helper.StringWrapper.plus(result, tgt.createBehaviorJava(context));
		}


			java.lang.Boolean idIfCond_521 = false;
			idIfCond_521 = kermeta.standard.helper.StringWrapper.equals(static_call, "");

			if( idIfCond_521 ) {

			result = kermeta.standard.helper.StringWrapper.plus(result, ".");
		}

		}
		 else {

			java.lang.Boolean idIfCond_522 = false;
			idIfCond_522 = kermeta.standard.helper.BooleanWrapper.and(org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(this), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass("kermeta.language.behavior.CallExpression")), kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(this).callsFunctionType()));

			if( idIfCond_522 ) {

			java.lang.String resultPrefix = "";

			java.lang.Boolean idIfCond_523 = false;
			idIfCond_523 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(this.getContainerAsTypeIn(org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass("kermeta.language.behavior.Assignment"), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass("kermeta.language.behavior.Block")));

			if( idIfCond_523 ) {

			resultPrefix = context.getRETURN_EXPRESSION_TO_REPLACE_SPECIAL();
		}


			java.lang.Boolean idIfCond_524 = false;
			idIfCond_524 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(this.getContainerAsTypeIn(org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass("kermeta.language.behavior.Assignment"), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass("kermeta.language.structure.Constraint")));

			if( idIfCond_524 ) {

			resultPrefix = context.getRETURN_EXPRESSION_TO_REPLACE_SPECIAL();
		}


			java.lang.Boolean idIfCond_525 = false;
			idIfCond_525 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(this.getContainerAsTypeIn(org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass("kermeta.language.behavior.Assignment"), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass("kermeta.language.structure.Operation")));

			if( idIfCond_525 ) {

			resultPrefix = context.getRETURN_EXPRESSION_TO_REPLACE_SPECIAL();
		}


			java.lang.Boolean idIfCond_526 = false;
			idIfCond_526 = kermeta.standard.helper.BooleanWrapper.not(this.isParameter());

			if( idIfCond_526 ) {

			result = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(result, resultPrefix), context.getPREVIOUS_STATEMENT_FT()), context.getRETURN_EXPRESSION_TO_REPLACE()), this.getCalledFtResult());
		}
		 else {

			result = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(result, resultPrefix), context.getPREVIOUS_STATEMENT_FT()), this.getCalledFtResult());
		}

		}

		}

		}
		 else {

			result = kermeta.standard.helper.StringWrapper.plus(tgt.createBehaviorJava(context), kermeta.standard.helper.StringWrapper.replace(result, context.getSELF_EXPRESSION_TO_REPLACE(), ((kermeta.language.behavior.CallFeature) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(tgt, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass("kermeta.language.behavior.CallFeature"))).getCalledFtResult()));
		}

		}


			java.lang.Boolean idIfCond_527 = false;
			idIfCond_527 = kermeta.standard.helper.StringWrapper.equals(static_call, "");

			if( idIfCond_527 ) {

			java.lang.Boolean idIfCond_528 = false;
			idIfCond_528 = this.isCallFeatureAsStaticEnumLiteral();

			if( idIfCond_528 ) {

			result = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(result, "getByName(\""), fName), "\")");
		}
		 else {

			java.lang.Boolean idIfCond_529 = false;
			idIfCond_529 = this.isCallFeatureAsStaticProperty();

			if( idIfCond_529 ) {

			java.lang.Boolean idIfCond_530 = false;
			idIfCond_530 = kermeta.standard.helper.BooleanWrapper.and(org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(this.getStaticProperty().getUpper(), 1), kermeta.standard.helper.BooleanWrapper.not(this.isParameterMany()));

			if( idIfCond_530 ) {

			java.lang.String type_binding = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.TypeVariableBinding>convertAsOrderedSet(((kermeta.language.structure.Class) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(this.getStaticType(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass("kermeta.language.structure.Class"))).getTypeParamBinding()).first().getType().createBehaviorJava(context);

			java.lang.Boolean idIfCond_531 = false;
			idIfCond_531 = kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.BooleanWrapper.not(this.getStaticProperty().getIsUnique()), kermeta.standard.helper.BooleanWrapper.not(this.getStaticProperty().getIsOrdered()));

			if( idIfCond_531 ) {

			result = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(context.getCOLLECTION_UTIL_CLASS(), ".<"), type_binding), ">convertAsBag("), result);
		}


			java.lang.Boolean idIfCond_532 = false;
			idIfCond_532 = kermeta.standard.helper.BooleanWrapper.and(this.getStaticProperty().getIsUnique(), kermeta.standard.helper.BooleanWrapper.not(this.getStaticProperty().getIsOrdered()));

			if( idIfCond_532 ) {

			result = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(context.getCOLLECTION_UTIL_CLASS(), ".<"), type_binding), ">convertAsSet("), result);
		}


			java.lang.Boolean idIfCond_533 = false;
			idIfCond_533 = kermeta.standard.helper.BooleanWrapper.and(this.getStaticProperty().getIsUnique(), this.getStaticProperty().getIsOrdered());

			if( idIfCond_533 ) {

			result = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(context.getCOLLECTION_UTIL_CLASS(), ".<"), type_binding), ">convertAsOrderedSet("), result);
		}


			java.lang.Boolean idIfCond_534 = false;
			idIfCond_534 = kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.BooleanWrapper.not(this.getStaticProperty().getIsUnique()), this.getStaticProperty().getIsOrdered());

			if( idIfCond_534 ) {

			result = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(context.getCOLLECTION_UTIL_CLASS(), ".<"), type_binding), ">convertAsSequence("), result);
		}


			cf_prop_suffix = ")";
		}


			result = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(result, this.printGetAccessor(context)), "()"), cf_prop_suffix);

			cf_prop_suffix = "";
		}
		 else {

			java.lang.Boolean idIfCond_535 = false;
			idIfCond_535 = kermeta.standard.helper.BooleanWrapper.not(this.callsFunctionType());

			if( idIfCond_535 ) {

			java.lang.Boolean idIfCond_536 = false;
			idIfCond_536 = kermeta.standard.helper.BooleanWrapper.and(org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(this.getStaticOperation().getUpper(), 1), kermeta.standard.helper.BooleanWrapper.not(this.isParameterMany()));

			if( idIfCond_536 ) {

			java.lang.String type_binding = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.TypeVariableBinding>convertAsOrderedSet(((kermeta.language.structure.Class) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(this.getStaticType(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass("kermeta.language.structure.Class"))).getTypeParamBinding()).first().getType().createBehaviorJava(context);

			java.lang.Boolean idIfCond_537 = false;
			idIfCond_537 = kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.BooleanWrapper.not(this.getStaticOperation().getIsUnique()), kermeta.standard.helper.BooleanWrapper.not(this.getStaticOperation().getIsOrdered()));

			if( idIfCond_537 ) {

			result = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(context.getCOLLECTION_UTIL_CLASS(), ".<"), type_binding), ">convertAsBag("), result);
		}


			java.lang.Boolean idIfCond_538 = false;
			idIfCond_538 = kermeta.standard.helper.BooleanWrapper.and(this.getStaticOperation().getIsUnique(), kermeta.standard.helper.BooleanWrapper.not(this.getStaticOperation().getIsOrdered()));

			if( idIfCond_538 ) {

			result = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(context.getCOLLECTION_UTIL_CLASS(), ".<"), type_binding), ">convertAsSet("), result);
		}


			java.lang.Boolean idIfCond_539 = false;
			idIfCond_539 = kermeta.standard.helper.BooleanWrapper.and(this.getStaticOperation().getIsUnique(), this.getStaticOperation().getIsOrdered());

			if( idIfCond_539 ) {

			result = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(context.getCOLLECTION_UTIL_CLASS(), ".<"), type_binding), ">convertAsOrderedSet("), result);
		}


			java.lang.Boolean idIfCond_540 = false;
			idIfCond_540 = kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.BooleanWrapper.not(this.getStaticOperation().getIsUnique()), this.getStaticOperation().getIsOrdered());

			if( idIfCond_540 ) {

			result = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(context.getCOLLECTION_UTIL_CLASS(), ".<"), type_binding), ">convertAsSequence("), result);
		}


			cf_prop_suffix = ")";
		}


			result = kermeta.standard.helper.StringWrapper.plus(result, this.getStaticOperation().getFinalName(context));
		}
		 else {

			java.lang.Boolean idIfCond_541 = false;
			idIfCond_541 = kermeta.standard.helper.BooleanWrapper.and(org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(this), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass("kermeta.language.behavior.CallExpression")), kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(this).callsFunctionType()));

			if( idIfCond_541 ) {

			java.lang.Boolean idIfCond_542 = false;
			idIfCond_542 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(this), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass("kermeta.language.behavior.CallFeature"));

			if( idIfCond_542 ) {

			kermeta.language.behavior.CallFeature cf_ = ((kermeta.language.behavior.CallFeature) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(this), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass("kermeta.language.behavior.CallFeature")));

			java.lang.Boolean idIfCond_543 = false;
			idIfCond_543 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(cf_.getStaticOperation()));

			if( idIfCond_543 ) {

			java.lang.Boolean idIfCond_544 = false;
			idIfCond_544 = kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.BooleanWrapper.or(cf_.fromUtil(context), this.isParameter()), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(cf_.getStaticOperation().getCompiledJavaExtern(), ""));

			if( idIfCond_544 ) {
		}
		 else {

			result = kermeta.standard.helper.StringWrapper.plus(result, ".");
		}

		}
		 else {

			java.lang.Boolean idIfCond_545 = false;
			idIfCond_545 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(cf_.getStaticProperty()));

			if( idIfCond_545 ) {

			result = kermeta.standard.helper.StringWrapper.plus(result, ".");
		}

		}

		}

		}

		}

		}

		}

		}
		 else {

			java.lang.Boolean idIfCond_546 = false;
			idIfCond_546 = kermeta.standard.helper.StringWrapper.contains(result, context.getRETURN_EXPRESSION_TO_REPLACE());

			if( idIfCond_546 ) {

			result = kermeta.standard.helper.StringWrapper.replace(result, context.getRETURN_EXPRESSION_TO_REPLACE(), kermeta.standard.helper.StringWrapper.plus(static_call, "("));
		}
		 else {

			java.lang.String tmp_prefix = "";

			//BIft:detect

		kermeta.language.behavior.Expression result_ft140 = null;

			kermeta.language.behavior.Expression elem_ft140 = null;

			result_ft140 = null;

			
		{

			kermeta.standard.Iterator<kermeta.language.behavior.Expression> it_ft140 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.behavior.Expression>convertAsOrderedSet(this.getParameters()).iterator();
			java.lang.Boolean idLoopCond_548 = false;
			while( !idLoopCond_548 ) {
			idLoopCond_548 = kermeta.standard.helper.BooleanWrapper.or(it_ft140.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(result_ft140, null));
			if ( idLoopCond_548 ) {
			} else {

			elem_ft140 = it_ft140.next();

			java.lang.Boolean idIfCond_549 = false;
		//BIle:detector
		kermeta.language.behavior.Expression p_lbdExp140 = elem_ft140;

			idIfCond_549 = p_lbdExp140.callsFunctionType();
		//EIle:detector


			if( idIfCond_549 ) {

			result_ft140 = elem_ft140;
		}

		}
			}
		}

		//EIft:detect
		java.lang.Boolean idIfCond_547 = false;
			idIfCond_547 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(result_ft140));

			if( idIfCond_547 ) {

			tmp_prefix = context.getRETURN_EXPRESSION_TO_REPLACE();
		}


			result = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(tmp_prefix, static_call), "("), result);
		}


			java.lang.Boolean idIfCond_550 = false;
			idIfCond_550 = ppCast;

			if( idIfCond_550 ) {

			result = kermeta.standard.helper.StringWrapper.plus("(", result);
		}

		}


			java.lang.Boolean idIfCond_551 = false;
			idIfCond_551 = kermeta.standard.helper.BooleanWrapper.and(this.isCallFeatureAsStaticOperation(), kermeta.standard.helper.BooleanWrapper.not(this.callsFunctionType()));

			if( idIfCond_551 ) {

			java.lang.Boolean idIfCond_552 = false;
			idIfCond_552 = kermeta.standard.helper.StringWrapper.equals(static_call, "");

			if( idIfCond_552 ) {

			result = kermeta.standard.helper.StringWrapper.plus(result, "(");
		}
		 else {

			static_call = "";

			java.lang.Boolean idIfCond_553 = false;
			idIfCond_553 = kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.behavior.Expression>convertAsOrderedSet(this.getParameters()))), kermeta.standard.helper.IntegerWrapper.isGreater(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.behavior.Expression>convertAsOrderedSet(this.getParameters()).size(), 0));

			if( idIfCond_553 ) {

			result = kermeta.standard.helper.StringWrapper.plus(result, ", ");
		}

		}


			this.setBeforeLambdaExpressionResult("");

			result = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(result, ((km2ecore.helper.kermeta.CompilerHelperJava) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(km2ecore.helper.kermeta.KermetaPackage.eINSTANCE.getCompilerHelperJava())).ppComaSeparatedNodes(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.behavior.Expression>convertAsOrderedSet(this.getParameters()), context)), ")"), cf_prop_suffix);

			context.setBeforeLambdaExpressionResult(this.getBeforeLambdaExpressionResult());

			this.setBeforeLambdaExpressionResult("");

			java.lang.Boolean idIfCond_554 = false;
			idIfCond_554 = ppCast;

			if( idIfCond_554 ) {

			result = kermeta.standard.helper.StringWrapper.plus(result, ")");

			ppCast = false;
		}

		}

		}


			result = kermeta.standard.helper.StringWrapper.plus(result, this.endOfExpressionFixer());

		return result;

		
		/*java.lang.String result = null;

		super.createBehaviorJava(context);

		result = "";

		java.lang.Boolean ppCast = false;

		java.lang.String cf_prop_suffix = "";

		java.lang.Boolean idIfCond_564 = false;
		idIfCond_564 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isVoidSwitcher(this.getTarget());

		if (idIfCond_564) {

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

		java.lang.Boolean idIfCond_565 = false;
		idIfCond_565 = this.isCallFeatureAsStaticOperation();

		if (idIfCond_565) {

			java.lang.Boolean idIfCond_566 = false;
			idIfCond_566 = this.callsFunctionType();

			if (idIfCond_566) {

				context.getTasks_stack().push(
						context.getFUNCTION_TYPE_COMPILATION_TASK());

				context.setAfterLbdExpActivation(false);

				java.lang.String ft_str = this
						.createStringFromFunctionType(context);

				context.getTasks_stack().pop();

				result = ft_str;
			} else {

				java.lang.Boolean idIfCond_567 = false;
				idIfCond_567 = this.fromUtil(context);

				if (idIfCond_567) {

					java.lang.Boolean idIfCond_568 = false;
					idIfCond_568 = this.getStaticOperation().ownedByValueType();

					if (idIfCond_568) {

						static_call = this.getStaticOperation()
								.getOptimizedStaticCall(context);

						java.lang.Boolean idIfCond_569 = false;
						idIfCond_569 = kermeta.standard.helper.StringWrapper
								.equals(static_call, "");

						if (idIfCond_569) {

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

						java.lang.Boolean idIfCond_570 = false;
						idIfCond_570 = kermeta.standard.helper.StringWrapper
								.equals(static_call, "");

						if (idIfCond_570) {

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

						java.lang.Boolean idIfCond_571 = false;
						idIfCond_571 = kermeta.standard.helper.StringWrapper
								.equals(fName, "asType");

						if (idIfCond_571) {

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

					java.lang.Boolean idIfCond_572 = false;
					idIfCond_572 = kermeta.standard.helper.BooleanWrapper
							.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
									.isVoidSwitcher(tgt));

					if (idIfCond_572) {

						java.lang.Boolean idIfCond_573 = false;
						idIfCond_573 = kermeta.standard.helper.BooleanWrapper
								.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
										.isVoidSwitcher(tgt.getStaticType()));

						if (idIfCond_573) {

							java.lang.Boolean idIfCond_574 = false;
							idIfCond_574 = tgt.getStaticType().isValueType();

							if (idIfCond_574) {

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

						java.lang.Boolean idIfCond_575 = false;
						idIfCond_575 = kermeta.standard.helper.BooleanWrapper
								.and(
										this.getStaticOperation()
												.getOwningClass()
												.isMappedToJavaRawType(),
										kermeta.standard.helper.BooleanWrapper
												.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isVoidSwitcher(this
																.getStaticOperation()
																.getBody())));

						if (idIfCond_575) {

							static_call = this.getStaticOperation()
									.getOptimizedStaticCall(context);
						}

					}

				}

			}

		}

		java.lang.Boolean idIfCond_576 = false;
		idIfCond_576 = kermeta.standard.helper.BooleanWrapper
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

		if (idIfCond_576) {

			java.lang.String type_label = tgt.createBehaviorJava(context);

			java.lang.Boolean idIfCond_577 = false;
			idIfCond_577 = kermeta.standard.helper.BooleanWrapper
					.not(kermeta.standard.helper.StringWrapper.isValueType(
							type_label, context));

			if (idIfCond_577) {

				java.lang.String pojoType_label = "";

				java.lang.Boolean idIfCond_578 = false;
				idIfCond_578 = org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isInstanceOfSwitcher(
								tgt.getStaticType(),
								org.kermeta.compil.runtime.ExecutionContext
										.getInstance()
										.getMetaClass(
												"kermeta.language.structure.ParameterizedType"));

				if (idIfCond_578) {

					pojoType_label = ((kermeta.language.structure.ParameterizedType) org.kermeta.compil.runtime.helper.language.ObjectUtil
							.asTypeSwitcher(
									tgt.getStaticType(),
									org.kermeta.compil.runtime.ExecutionContext
											.getInstance()
											.getMetaClass(
													"kermeta.language.structure.ParameterizedType")))
							.getTypeDefinition().getFinalJavaClassQN();
				}

				java.lang.Boolean idIfCond_579 = false;
				idIfCond_579 = org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isNotEqualSwitcher(pojoType_label, "");

				if (idIfCond_579) {

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

			java.lang.Boolean idIfCond_580 = false;
			idIfCond_580 = kermeta.standard.helper.BooleanWrapper
					.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
							.isVoidSwitcher(tgt));

			if (idIfCond_580) {

				java.lang.Boolean idIfCond_581 = false;
				idIfCond_581 = kermeta.standard.helper.BooleanWrapper.not(tgt
						.callsFunctionType());

				if (idIfCond_581) {

					java.lang.Boolean idIfCond_582 = false;
					idIfCond_582 = kermeta.standard.helper.BooleanWrapper
							.not(this.callsFunctionType());

					if (idIfCond_582) {

						java.lang.String tgt_staticType_str = "";

						java.lang.Boolean idIfCond_583 = false;
						idIfCond_583 = kermeta.standard.helper.BooleanWrapper
								.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
										.isVoidSwitcher(tgt.getStaticType()));

						if (idIfCond_583) {

							tgt_staticType_str = org.kermeta.compil.runtime.helper.language.ObjectUtil
									.toStringSwitcher(tgt.getStaticType());
						}

						java.lang.Boolean idIfCond_584 = false;
						idIfCond_584 = kermeta.standard.helper.BooleanWrapper
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

						if (idIfCond_584) {

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

						java.lang.Boolean idIfCond_585 = false;
						idIfCond_585 = kermeta.standard.helper.StringWrapper
								.equals(static_call, "");

						if (idIfCond_585) {

							result = kermeta.standard.helper.StringWrapper
									.plus(result, ".");
						}

					} else {

						java.lang.Boolean idIfCond_586 = false;
						idIfCond_586 = kermeta.standard.helper.BooleanWrapper
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

						if (idIfCond_586) {

							java.lang.String resultPrefix = "";

							java.lang.Boolean idIfCond_587 = false;
							idIfCond_587 = org.kermeta.compil.runtime.helper.language.ObjectUtil
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

							if (idIfCond_587) {

								resultPrefix = context
										.getRETURN_EXPRESSION_TO_REPLACE_SPECIAL();
							}

							java.lang.Boolean idIfCond_588 = false;
							idIfCond_588 = org.kermeta.compil.runtime.helper.language.ObjectUtil
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

							if (idIfCond_588) {

								resultPrefix = context
										.getRETURN_EXPRESSION_TO_REPLACE_SPECIAL();
							}

							java.lang.Boolean idIfCond_589 = false;
							idIfCond_589 = org.kermeta.compil.runtime.helper.language.ObjectUtil
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

							if (idIfCond_589) {

								resultPrefix = context
										.getRETURN_EXPRESSION_TO_REPLACE_SPECIAL();
							}

							java.lang.Boolean idIfCond_590 = false;
							idIfCond_590 = kermeta.standard.helper.BooleanWrapper
									.not(this.isParameter());

							if (idIfCond_590) {

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

			java.lang.Boolean idIfCond_591 = false;
			idIfCond_591 = kermeta.standard.helper.StringWrapper.equals(
					static_call, "");

			if (idIfCond_591) {

				java.lang.Boolean idIfCond_592 = false;
				idIfCond_592 = this.isCallFeatureAsStaticEnumLiteral();

				if (idIfCond_592) {

					result = kermeta.standard.helper.StringWrapper.plus(
							kermeta.standard.helper.StringWrapper.plus(
									kermeta.standard.helper.StringWrapper.plus(
											result, "getByName(\""), fName),
							"\")");
				} else {

					java.lang.Boolean idIfCond_593 = false;
					idIfCond_593 = this.isCallFeatureAsStaticProperty();

					if (idIfCond_593) {

						java.lang.Boolean idIfCond_594 = false;
						idIfCond_594 = kermeta.standard.helper.BooleanWrapper
								.and(
										org.kermeta.compil.runtime.helper.language.ObjectUtil
												.isNotEqualSwitcher(this
														.getStaticProperty()
														.getUpper(), 1),
										kermeta.standard.helper.BooleanWrapper
												.not(this.isParameterMany()));

						if (idIfCond_594) {

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

							java.lang.Boolean idIfCond_595 = false;
							idIfCond_595 = kermeta.standard.helper.BooleanWrapper
									.and(
											kermeta.standard.helper.BooleanWrapper
													.not(this
															.getStaticProperty()
															.getIsUnique()),
											kermeta.standard.helper.BooleanWrapper
													.not(this
															.getStaticProperty()
															.getIsOrdered()));

							if (idIfCond_595) {

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

							java.lang.Boolean idIfCond_596 = false;
							idIfCond_596 = kermeta.standard.helper.BooleanWrapper
									.and(
											this.getStaticProperty()
													.getIsUnique(),
											kermeta.standard.helper.BooleanWrapper
													.not(this
															.getStaticProperty()
															.getIsOrdered()));

							if (idIfCond_596) {

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

							java.lang.Boolean idIfCond_597 = false;
							idIfCond_597 = kermeta.standard.helper.BooleanWrapper
									.and(
											this.getStaticProperty()
													.getIsUnique(), this
													.getStaticProperty()
													.getIsOrdered());

							if (idIfCond_597) {

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

							java.lang.Boolean idIfCond_598 = false;
							idIfCond_598 = kermeta.standard.helper.BooleanWrapper
									.and(kermeta.standard.helper.BooleanWrapper
											.not(this.getStaticProperty()
													.getIsUnique()), this
											.getStaticProperty().getIsOrdered());

							if (idIfCond_598) {

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

						java.lang.Boolean idIfCond_599 = false;
						idIfCond_599 = kermeta.standard.helper.BooleanWrapper
								.not(this.callsFunctionType());

						if (idIfCond_599) {

							java.lang.Boolean idIfCond_600 = false;
							idIfCond_600 = kermeta.standard.helper.BooleanWrapper
									.and(
											org.kermeta.compil.runtime.helper.language.ObjectUtil
													.isNotEqualSwitcher(
															this
																	.getStaticOperation()
																	.getUpper(),
															1),
											kermeta.standard.helper.BooleanWrapper
													.not(this.isParameterMany()));

							if (idIfCond_600) {

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

								java.lang.Boolean idIfCond_601 = false;
								idIfCond_601 = kermeta.standard.helper.BooleanWrapper
										.and(
												kermeta.standard.helper.BooleanWrapper
														.not(this
																.getStaticOperation()
																.getIsUnique()),
												kermeta.standard.helper.BooleanWrapper
														.not(this
																.getStaticOperation()
																.getIsOrdered()));

								if (idIfCond_601) {

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

								java.lang.Boolean idIfCond_602 = false;
								idIfCond_602 = kermeta.standard.helper.BooleanWrapper
										.and(
												this.getStaticOperation()
														.getIsUnique(),
												kermeta.standard.helper.BooleanWrapper
														.not(this
																.getStaticOperation()
																.getIsOrdered()));

								if (idIfCond_602) {

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

								java.lang.Boolean idIfCond_603 = false;
								idIfCond_603 = kermeta.standard.helper.BooleanWrapper
										.and(this.getStaticOperation()
												.getIsUnique(), this
												.getStaticOperation()
												.getIsOrdered());

								if (idIfCond_603) {

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

								java.lang.Boolean idIfCond_604 = false;
								idIfCond_604 = kermeta.standard.helper.BooleanWrapper
										.and(
												kermeta.standard.helper.BooleanWrapper
														.not(this
																.getStaticOperation()
																.getIsUnique()),
												this.getStaticOperation()
														.getIsOrdered());

								if (idIfCond_604) {

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

							java.lang.Boolean idIfCond_605 = false;
							idIfCond_605 = kermeta.standard.helper.BooleanWrapper
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

							if (idIfCond_605) {

								java.lang.Boolean idIfCond_606 = false;
								idIfCond_606 = org.kermeta.compil.runtime.helper.language.ObjectUtil
										.isInstanceOfSwitcher(
												org.kermeta.compil.runtime.helper.language.ObjectUtil
														.containerSwitcher(this),
												org.kermeta.compil.runtime.ExecutionContext
														.getInstance()
														.getMetaClass(
																"kermeta.language.behavior.CallFeature"));

								if (idIfCond_606) {

									kermeta.language.behavior.CallFeature cf_ = ((kermeta.language.behavior.CallFeature) org.kermeta.compil.runtime.helper.language.ObjectUtil
											.asTypeSwitcher(
													org.kermeta.compil.runtime.helper.language.ObjectUtil
															.containerSwitcher(this),
													org.kermeta.compil.runtime.ExecutionContext
															.getInstance()
															.getMetaClass(
																	"kermeta.language.behavior.CallFeature")));

									java.lang.Boolean idIfCond_607 = false;
									idIfCond_607 = kermeta.standard.helper.BooleanWrapper
											.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
													.isVoidSwitcher(cf_
															.getStaticOperation()));

									if (idIfCond_607) {

										java.lang.Boolean idIfCond_608 = false;
										idIfCond_608 = kermeta.standard.helper.BooleanWrapper
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

										if (idIfCond_608) {
										} else {

											result = kermeta.standard.helper.StringWrapper
													.plus(result, ".");
										}

									} else {

										java.lang.Boolean idIfCond_609 = false;
										idIfCond_609 = kermeta.standard.helper.BooleanWrapper
												.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isVoidSwitcher(cf_
																.getStaticProperty()));

										if (idIfCond_609) {

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

				java.lang.Boolean idIfCond_610 = false;
				idIfCond_610 = kermeta.standard.helper.StringWrapper.contains(
						result, context.getRETURN_EXPRESSION_TO_REPLACE());

				if (idIfCond_610) {

					result = kermeta.standard.helper.StringWrapper.replace(
							result, context.getRETURN_EXPRESSION_TO_REPLACE(),
							kermeta.standard.helper.StringWrapper.plus(
									static_call, "("));
				} else {

					java.lang.String tmp_prefix = "";

					//BIft:detect

					kermeta.language.behavior.Expression result_ft142 = null;

					kermeta.language.behavior.Expression elem_ft142 = null;

					result_ft142 = null;

					{

						kermeta.standard.Iterator<kermeta.language.behavior.Expression> it_ft142 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
								.<kermeta.language.behavior.Expression> convertAsOrderedSet(
										this.getParameters()).iterator();
						java.lang.Boolean idLoopCond_612 = false;
						while (!idLoopCond_612) {
							idLoopCond_612 = kermeta.standard.helper.BooleanWrapper
									.or(
											it_ft142.isOff(),
											org.kermeta.compil.runtime.helper.language.ObjectUtil
													.isNotEqualSwitcher(
															result_ft142, null));
							if (idLoopCond_612) {
							} else {

								elem_ft142 = it_ft142.next();

								java.lang.Boolean idIfCond_613 = false;
								//BIle:detector
								kermeta.language.behavior.Expression p_lbdExp142 = elem_ft142;

								idIfCond_613 = p_lbdExp142.callsFunctionType();
								//EIle:detector

								if (idIfCond_613) {

									result_ft142 = elem_ft142;
								}

							}
						}
					}

					//EIft:detect
					java.lang.Boolean idIfCond_611 = false;
					idIfCond_611 = kermeta.standard.helper.BooleanWrapper
							.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
									.isVoidSwitcher(result_ft142));

					if (idIfCond_611) {

						tmp_prefix = context.getRETURN_EXPRESSION_TO_REPLACE();
					}

					result = kermeta.standard.helper.StringWrapper.plus(
							kermeta.standard.helper.StringWrapper.plus(
									kermeta.standard.helper.StringWrapper.plus(
											tmp_prefix, static_call), "("),
							result);
				}

				java.lang.Boolean idIfCond_614 = false;
				idIfCond_614 = ppCast;

				if (idIfCond_614) {

					result = kermeta.standard.helper.StringWrapper.plus("(",
							result);
				}

			}

			java.lang.Boolean idIfCond_615 = false;
			idIfCond_615 = kermeta.standard.helper.BooleanWrapper.and(this
					.isCallFeatureAsStaticOperation(),
					kermeta.standard.helper.BooleanWrapper.not(this
							.callsFunctionType()));

			if (idIfCond_615) {

				java.lang.Boolean idIfCond_616 = false;
				idIfCond_616 = kermeta.standard.helper.StringWrapper.equals(
						static_call, "");

				if (idIfCond_616) {

					result = kermeta.standard.helper.StringWrapper.plus(result,
							"(");
				} else {

					static_call = "";

					java.lang.Boolean idIfCond_617 = false;
					idIfCond_617 = kermeta.standard.helper.BooleanWrapper
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

					if (idIfCond_617) {

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

				java.lang.Boolean idIfCond_618 = false;
				idIfCond_618 = ppCast;

				if (idIfCond_618) {

					result = kermeta.standard.helper.StringWrapper.plus(result,
							")");

					ppCast = false;
				}

			}

		}

		result = kermeta.standard.helper.StringWrapper.plus(result, this
				.endOfExpressionFixer());

		return result;*/

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean isFromClass() {

		java.lang.Boolean result = null;

		result = false;

		java.lang.Boolean idIfCond_619 = false;
		idIfCond_619 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoidSwitcher(this.getStaticOperation()));

		if (idIfCond_619) {

			java.lang.Boolean idIfCond_620 = false;
			idIfCond_620 = kermeta.standard.helper.StringWrapper.equals(this
					.getStaticOperation().getOwningClass().qualifiedName(),
					"kermeta::language::structure::Class");

			if (idIfCond_620) {

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
	public Parameter getCallFeatureCorrespondingParameter() {

		kermeta.language.structure.Parameter result = null;

		result = null;

		java.lang.Boolean idIfCond_621 = false;
		idIfCond_621 = this.isParameter();

		if (idIfCond_621) {

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

			kermeta.language.behavior.Expression result_ft143 = null;

			kermeta.language.behavior.Expression elem_ft143 = null;

			result_ft143 = null;

			{

				kermeta.standard.Iterator<kermeta.language.behavior.Expression> it_ft143 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<kermeta.language.behavior.Expression> convertAsOrderedSet(
								cf_.getParameters()).iterator();
				java.lang.Boolean idLoopCond_622 = false;
				while (!idLoopCond_622) {
					idLoopCond_622 = kermeta.standard.helper.BooleanWrapper
							.or(
									it_ft143.isOff(),
									org.kermeta.compil.runtime.helper.language.ObjectUtil
											.isNotEqualSwitcher(result_ft143,
													null));
					if (idLoopCond_622) {
					} else {

						elem_ft143 = it_ft143.next();

						java.lang.Boolean idIfCond_623 = false;
						//BIle:detector
						kermeta.language.behavior.Expression p_lbdExp143 = elem_ft143;

						i = kermeta.standard.helper.IntegerWrapper.plus(i, 1);

						idIfCond_623 = org.kermeta.compil.runtime.helper.language.ObjectUtil
								.equalsSwitcher(p_lbdExp143, this);
						//EIle:detector

						if (idIfCond_623) {

							result_ft143 = elem_ft143;
						}

					}
				}
			}

			//CE
			exp = result_ft143;
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

			kermeta.standard.Iterator<kermeta.language.structure.Type> it_ft144 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Type> convertAsOrderedSet(
							this.getStaticTypeVariableBindings()).iterator();
			java.lang.Boolean idLoopCond_624 = false;
			while (!idLoopCond_624) {
				idLoopCond_624 = it_ft144.isOff();
				if (idLoopCond_624) {
				} else {

					//BIle:func
					kermeta.language.structure.Type type__lbdExp144 = it_ft144
							.next();

					map_type
							.put(
									org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
											.<kermeta.language.structure.TypeVariable> convertAsOrderedSet(
													this.getStaticOperation()
															.getTypeParameter())
											.elementAt(inc_tp), type__lbdExp144);

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

		kermeta.language.behavior.Expression result_ft145 = null;

		kermeta.language.behavior.Expression elem_ft145 = null;

		result_ft145 = null;

		{

			kermeta.standard.Iterator<kermeta.language.behavior.Expression> it_ft145 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.behavior.Expression> convertAsOrderedSet(
							this.getParameters()).iterator();
			java.lang.Boolean idLoopCond_626 = false;
			while (!idLoopCond_626) {
				idLoopCond_626 = kermeta.standard.helper.BooleanWrapper.or(
						it_ft145.isOff(),
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isNotEqualSwitcher(result_ft145, null));
				if (idLoopCond_626) {
				} else {

					elem_ft145 = it_ft145.next();

					java.lang.Boolean idIfCond_627 = false;
					//BIle:detector
					kermeta.language.behavior.Expression param_lbdExp145 = elem_ft145;

					idIfCond_627 = org.kermeta.compil.runtime.helper.language.ObjectUtil
							.isInstanceOfSwitcher(
									param_lbdExp145,
									org.kermeta.compil.runtime.ExecutionContext
											.getInstance()
											.getMetaClass(
													"kermeta.language.behavior.LambdaExpression"));
					//EIle:detector

					if (idIfCond_627) {

						result_ft145 = elem_ft145;
					}

				}
			}
		}

		//EIft:detect
		java.lang.Boolean idIfCond_625 = false;
		idIfCond_625 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoidSwitcher(result_ft145));

		if (idIfCond_625) {

			//BIft:detect

			kermeta.language.behavior.Expression result_ft146 = null;

			kermeta.language.behavior.Expression elem_ft146 = null;

			result_ft146 = null;

			{

				kermeta.standard.Iterator<kermeta.language.behavior.Expression> it_ft146 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<kermeta.language.behavior.Expression> convertAsOrderedSet(
								this.getParameters()).iterator();
				java.lang.Boolean idLoopCond_628 = false;
				while (!idLoopCond_628) {
					idLoopCond_628 = kermeta.standard.helper.BooleanWrapper
							.or(
									it_ft146.isOff(),
									org.kermeta.compil.runtime.helper.language.ObjectUtil
											.isNotEqualSwitcher(result_ft146,
													null));
					if (idLoopCond_628) {
					} else {

						elem_ft146 = it_ft146.next();

						java.lang.Boolean idIfCond_629 = false;
						//BIle:detector
						kermeta.language.behavior.Expression param_lbdExp146 = elem_ft146;

						idIfCond_629 = org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isInstanceOfSwitcher(
										param_lbdExp146,
										org.kermeta.compil.runtime.ExecutionContext
												.getInstance()
												.getMetaClass(
														"kermeta.language.behavior.LambdaExpression"));
						//EIle:detector

						if (idIfCond_629) {

							result_ft146 = elem_ft146;
						}

					}
				}
			}

			//EIft:detect
			kermeta.language.behavior.LambdaExpression theLambdaExp = ((kermeta.language.behavior.LambdaExpression) org.kermeta.compil.runtime.helper.language.ObjectUtil
					.asTypeSwitcher(
							result_ft146,
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

			java.lang.Boolean idIfCond_630 = false;
			idIfCond_630 = org.kermeta.compil.runtime.helper.language.ObjectUtil
					.isInstanceOfSwitcher(
							theLambdaExp.getStaticType(),
							org.kermeta.compil.runtime.ExecutionContext
									.getInstance()
									.getMetaClass(
											"kermeta.language.structure.FunctionType"));

			if (idIfCond_630) {

				kermeta.language.structure.FunctionType current_functionType = ((kermeta.language.structure.FunctionType) org.kermeta.compil.runtime.helper.language.ObjectUtil
						.asTypeSwitcher(
								theLambdaExp.getStaticType(),
								org.kermeta.compil.runtime.ExecutionContext
										.getInstance()
										.getMetaClass(
												"kermeta.language.structure.FunctionType")));

				java.lang.Boolean idIfCond_631 = false;
				idIfCond_631 = org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isInstanceOfSwitcher(
								current_functionType.getLeft(),
								org.kermeta.compil.runtime.ExecutionContext
										.getInstance()
										.getMetaClass(
												"kermeta.language.structure.ProductType"));

				if (idIfCond_631) {

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

		java.lang.Boolean idIfCond_632 = false;
		idIfCond_632 = tgt.callsFunctionType();

		if (idIfCond_632) {

			context.setFtSuffixActivation(true);

			context
					.setFtContextualSelf(context
							.getSELF_EXPRESSION_TO_REPLACE());
		} else {

			context.setFtContextualSelf(tgt.createBehaviorJava(context));
		}

		context.setFtSuffixActivation(true);

		java.lang.String callElement = "";

		java.lang.Boolean idIfCond_633 = false;
		idIfCond_633 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isInstanceOfSwitcher(
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.containerSwitcher(this),
						org.kermeta.compil.runtime.ExecutionContext
								.getInstance()
								.getMetaClass(
										"kermeta.language.behavior.VariableDecl"));

		if (idIfCond_633) {

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

			java.lang.Boolean idIfCond_634 = false;
			idIfCond_634 = org.kermeta.compil.runtime.helper.language.ObjectUtil
					.isInstanceOfSwitcher(
							org.kermeta.compil.runtime.helper.language.ObjectUtil
									.containerSwitcher(this),
							org.kermeta.compil.runtime.ExecutionContext
									.getInstance()
									.getMetaClass(
											"kermeta.language.behavior.CallVariable"));

			if (idIfCond_634) {

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

		java.lang.Boolean idIfCond_635 = false;
		idIfCond_635 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isNotEqualSwitcher(callElement, "");

		if (idIfCond_635) {

			ft_str = kermeta.standard.helper.StringWrapper.plus(ft_str,
					"null;\n");
		}

		java.lang.String ppCastSuffix = "";

		java.lang.String ppValueTypeCastSuffix = "";

		java.lang.Boolean idIfCond_636 = false;
		idIfCond_636 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isInstanceOfSwitcher(
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.containerSwitcher(this),
						org.kermeta.compil.runtime.ExecutionContext
								.getInstance().getMetaClass(
										"kermeta.language.behavior.Assignment"));

		if (idIfCond_636) {

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

			java.lang.Boolean idIfCond_637 = false;
			idIfCond_637 = org.kermeta.compil.runtime.helper.language.ObjectUtil
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

			if (idIfCond_637) {

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

			java.lang.Boolean idIfCond_638 = false;
			idIfCond_638 = org.kermeta.compil.runtime.helper.language.ObjectUtil
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

			if (idIfCond_638) {

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

		java.lang.Boolean idIfCond_639 = false;
		idIfCond_639 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isNotEqualSwitcher(callElement, "");

		if (idIfCond_639) {

			ft_str = kermeta.standard.helper.StringWrapper.plus(ft_str,
					"\n//CE\n");

			java.lang.Boolean idIfCond_640 = false;
			idIfCond_640 = org.kermeta.compil.runtime.helper.language.ObjectUtil
					.isNotEqualSwitcher(context.getResultLastStatementId(), "");

			if (idIfCond_640) {

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

		java.lang.Boolean idIfCond_641 = false;
		idIfCond_641 = kermeta.standard.helper.BooleanWrapper
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

		if (idIfCond_641) {

			java.lang.Boolean idIfCond_642 = false;
			idIfCond_642 = org.kermeta.compil.runtime.helper.language.ObjectUtil
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

			if (idIfCond_642) {

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

		java.lang.Boolean idIfCond_643 = false;
		idIfCond_643 = kermeta.standard.helper.BooleanWrapper
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

		if (idIfCond_643) {

			java.lang.String str_binding = kermeta.standard.helper.StringWrapper
					.replace(context.getResultLastStatementId(), " = ", "");

			java.lang.Boolean idIfCond_644 = false;
			idIfCond_644 = org.kermeta.compil.runtime.helper.language.ObjectUtil
					.isNotEqualSwitcher(str_binding, "");

			if (idIfCond_644) {

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

		java.lang.Boolean idIfCond_645 = false;
		idIfCond_645 = kermeta.standard.helper.BooleanWrapper
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

		if (idIfCond_645) {

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

		java.lang.Boolean idIfCond_646 = false;
		idIfCond_646 = kermeta.standard.helper.BooleanWrapper
				.and(
						kermeta.standard.helper.StringWrapper.equals(
								callElement, ""),
						kermeta.standard.helper.BooleanWrapper
								.not(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ClassUtil
										.newObject(kermeta.language.structure.StructurePackage.eINSTANCE
												.getOperation()))
										.isVoidType(this.getStaticType()
												.getTypeName())));

		if (idIfCond_646) {

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

		java.lang.Boolean idIfCond_647 = false;
		idIfCond_647 = this.isParameter();

		if (idIfCond_647) {

			java.lang.Boolean idIfCond_648 = false;
			idIfCond_648 = kermeta.standard.helper.BooleanWrapper
					.not(((kermeta.language.behavior.CallFeature) org.kermeta.compil.runtime.helper.language.ObjectUtil
							.asTypeSwitcher(
									org.kermeta.compil.runtime.helper.language.ObjectUtil
											.containerSwitcher(this),
									org.kermeta.compil.runtime.ExecutionContext
											.getInstance()
											.getMetaClass(
													"kermeta.language.behavior.CallFeature")))
							.isCallFeatureTargetsValueTypeOperation());

			if (idIfCond_648) {

				kermeta.language.structure.Parameter param = this
						.getCallFeatureCorrespondingParameter();

				java.lang.Boolean idIfCond_649 = false;
				idIfCond_649 = kermeta.standard.helper.BooleanWrapper
						.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isVoidSwitcher(param));

				if (idIfCond_649) {

					java.lang.String left_type = param.getType().getTypeQName();

					java.lang.Boolean idIfCond_650 = false;
					idIfCond_650 = kermeta.standard.helper.StringWrapper
							.equals(left_type,
									"kermeta::language::structure::Object");

					if (idIfCond_650) {

						java.lang.Boolean idIfCond_651 = false;
						idIfCond_651 = this.getStaticType().isValueType();

						if (idIfCond_651) {

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

		java.lang.Boolean idIfCond_652 = false;
		idIfCond_652 = this.isParameter();

		if (idIfCond_652) {

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

			kermeta.language.behavior.Expression result_ft147 = null;

			kermeta.language.behavior.Expression elem_ft147 = null;

			result_ft147 = null;

			{

				kermeta.standard.Iterator<kermeta.language.behavior.Expression> it_ft147 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<kermeta.language.behavior.Expression> convertAsOrderedSet(
								cf_.getParameters()).iterator();
				java.lang.Boolean idLoopCond_653 = false;
				while (!idLoopCond_653) {
					idLoopCond_653 = kermeta.standard.helper.BooleanWrapper
							.or(
									it_ft147.isOff(),
									org.kermeta.compil.runtime.helper.language.ObjectUtil
											.isNotEqualSwitcher(result_ft147,
													null));
					if (idLoopCond_653) {
					} else {

						elem_ft147 = it_ft147.next();

						java.lang.Boolean idIfCond_654 = false;
						//BIle:detector
						kermeta.language.behavior.Expression p_lbdExp147 = elem_ft147;

						i = kermeta.standard.helper.IntegerWrapper.plus(i, 1);

						idIfCond_654 = org.kermeta.compil.runtime.helper.language.ObjectUtil
								.equalsSwitcher(p_lbdExp147, this);
						//EIle:detector

						if (idIfCond_654) {

							result_ft147 = elem_ft147;
						}

					}
				}
			}

			//CE
			exp = result_ft147;
			//EIft:detect
			;

			java.lang.Boolean idIfCond_655 = false;
			idIfCond_655 = org.kermeta.compil.runtime.helper.language.ObjectUtil
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
	public Boolean isParameterSingle() {

		java.lang.Boolean result = null;

		result = false;

		java.lang.Boolean idIfCond_656 = false;
		idIfCond_656 = this.isParameter();

		if (idIfCond_656) {

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

			kermeta.language.behavior.Expression result_ft148 = null;

			kermeta.language.behavior.Expression elem_ft148 = null;

			result_ft148 = null;

			{

				kermeta.standard.Iterator<kermeta.language.behavior.Expression> it_ft148 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<kermeta.language.behavior.Expression> convertAsOrderedSet(
								cf_.getParameters()).iterator();
				java.lang.Boolean idLoopCond_657 = false;
				while (!idLoopCond_657) {
					idLoopCond_657 = kermeta.standard.helper.BooleanWrapper
							.or(
									it_ft148.isOff(),
									org.kermeta.compil.runtime.helper.language.ObjectUtil
											.isNotEqualSwitcher(result_ft148,
													null));
					if (idLoopCond_657) {
					} else {

						elem_ft148 = it_ft148.next();

						java.lang.Boolean idIfCond_658 = false;
						//BIle:detector
						kermeta.language.behavior.Expression p_lbdExp148 = elem_ft148;

						i = kermeta.standard.helper.IntegerWrapper.plus(i, 1);

						idIfCond_658 = org.kermeta.compil.runtime.helper.language.ObjectUtil
								.equalsSwitcher(p_lbdExp148, this);
						//EIle:detector

						if (idIfCond_658) {

							result_ft148 = elem_ft148;
						}

					}
				}
			}

			//CE
			exp = result_ft148;
			//EIft:detect
			;

			java.lang.Boolean idIfCond_659 = false;
			idIfCond_659 = kermeta.standard.helper.IntegerWrapper
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

			if (idIfCond_659) {

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

		java.lang.Boolean idIfCond_660 = false;
		idIfCond_660 = kermeta.standard.helper.BooleanWrapper
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

		if (idIfCond_660) {

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

			kermeta.standard.Iterator<kermeta.language.behavior.Expression> it_ft149 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.behavior.Expression> convertAsOrderedSet(
							this.getParameters()).iterator();
			java.lang.Boolean idLoopCond_661 = false;
			while (!idLoopCond_661) {
				idLoopCond_661 = it_ft149.isOff();
				if (idLoopCond_661) {
				} else {

					//BIle:func
					kermeta.language.behavior.Expression param_lbdExp149 = it_ft149
							.next();

					java.lang.Boolean idIfCond_662 = false;
					idIfCond_662 = org.kermeta.compil.runtime.helper.language.ObjectUtil
							.isInstanceOfSwitcher(
									param_lbdExp149,
									org.kermeta.compil.runtime.ExecutionContext
											.getInstance()
											.getMetaClass(
													"kermeta.language.behavior.LambdaExpression"));

					if (idIfCond_662) {

						java.lang.Boolean idIfCond_663 = false;
						idIfCond_663 = org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isInstanceOfSwitcher(
										((kermeta.language.behavior.LambdaExpression) org.kermeta.compil.runtime.helper.language.ObjectUtil
												.asTypeSwitcher(
														param_lbdExp149,
														org.kermeta.compil.runtime.ExecutionContext
																.getInstance()
																.getMetaClass(
																		"kermeta.language.behavior.LambdaExpression")))
												.getStaticType(),
										org.kermeta.compil.runtime.ExecutionContext
												.getInstance()
												.getMetaClass(
														"kermeta.language.structure.ProductType"));

						if (idIfCond_663) {

							//BIft:each

							{

								kermeta.standard.Iterator<kermeta.language.structure.Type> it_ft150 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
										.<kermeta.language.structure.Type> convertAsSequence(
												((kermeta.language.structure.ProductType) org.kermeta.compil.runtime.helper.language.ObjectUtil
														.asTypeSwitcher(
																((kermeta.language.behavior.LambdaExpression) org.kermeta.compil.runtime.helper.language.ObjectUtil
																		.asTypeSwitcher(
																				param_lbdExp149,
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
								java.lang.Boolean idLoopCond_664 = false;
								while (!idLoopCond_664) {
									idLoopCond_664 = it_ft150.isOff();
									if (idLoopCond_664) {
									} else {

										//BIle:func
										kermeta.language.structure.Type t_lbdExp150 = it_ft150
												.next();

										java.lang.Boolean idIfCond_665 = false;
										idIfCond_665 = kermeta.standard.helper.IntegerWrapper
												.equals(i, 1);

										if (idIfCond_665) {

											result = kermeta.standard.helper.StringWrapper
													.plus(result, ", ");
										} else {

											i = 1;
										}

										result = kermeta.standard.helper.StringWrapper
												.plus(result, t_lbdExp150
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

		java.lang.Boolean idIfCond_666 = false;
		idIfCond_666 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isNotEqualSwitcher(result, "");

		if (idIfCond_666) {

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

		java.lang.Boolean idIfCond_667 = false;
		idIfCond_667 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoidSwitcher(this.getFunctionType()));

		if (idIfCond_667) {

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
	public Boolean isParameter() {

		java.lang.Boolean result = null;

		result = false;

		java.lang.Boolean idIfCond_668 = false;
		idIfCond_668 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isInstanceOfSwitcher(
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.containerSwitcher(this),
						org.kermeta.compil.runtime.ExecutionContext
								.getInstance()
								.getMetaClass(
										"kermeta.language.behavior.CallFeature"));

		if (idIfCond_668) {

			//BIft:detect

			kermeta.language.behavior.Expression result_ft151 = null;

			kermeta.language.behavior.Expression elem_ft151 = null;

			result_ft151 = null;

			{

				kermeta.standard.Iterator<kermeta.language.behavior.Expression> it_ft151 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
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
				java.lang.Boolean idLoopCond_669 = false;
				while (!idLoopCond_669) {
					idLoopCond_669 = kermeta.standard.helper.BooleanWrapper
							.or(
									it_ft151.isOff(),
									org.kermeta.compil.runtime.helper.language.ObjectUtil
											.isNotEqualSwitcher(result_ft151,
													null));
					if (idLoopCond_669) {
					} else {

						elem_ft151 = it_ft151.next();

						java.lang.Boolean idIfCond_670 = false;
						//BIle:detector
						kermeta.language.behavior.Expression p_lbdExp151 = elem_ft151;

						idIfCond_670 = org.kermeta.compil.runtime.helper.language.ObjectUtil
								.equalsSwitcher(p_lbdExp151, this);
						//EIle:detector

						if (idIfCond_670) {

							result_ft151 = elem_ft151;
						}

					}
				}
			}

			//EIft:detect
			result = kermeta.standard.helper.BooleanWrapper
					.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
							.isVoidSwitcher(result_ft151));
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
	public Boolean isCallFeatureTargetsValueTypeOperation() {

		java.lang.Boolean result = null;

		result = false;

		java.lang.Boolean idIfCond_671 = false;
		idIfCond_671 = this.getStaticOperation().ownedByValueType();

		if (idIfCond_671) {

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
