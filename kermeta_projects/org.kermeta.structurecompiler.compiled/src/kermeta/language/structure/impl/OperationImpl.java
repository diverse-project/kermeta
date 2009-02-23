/**
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * 
 * Generating with Kermeta <http://www.kermeta.org>
 *
 * $Id: OperationImpl.java,v 1.12 2009-02-23 15:26:39 cfaucher Exp $
 */
package kermeta.language.structure.impl;

import ecore.EOperation;

import java.util.Collection;

import kermeta.language.behavior.Expression;
import kermeta.language.behavior.LambdaExpression;

import kermeta.language.structure.ClassDefinition;
import kermeta.language.structure.Constraint;
import kermeta.language.structure.Operation;
import kermeta.language.structure.Parameter;
import kermeta.language.structure.StructurePackage;
import kermeta.language.structure.Traceability;
import kermeta.language.structure.Type;
import kermeta.language.structure.TypeVariable;

import kermeta.standard.Sequence;

import km2ecore.KM2EcoreContext;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link kermeta.language.structure.impl.OperationImpl#getEcoreModelElement <em>Ecore Model Element</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.OperationImpl#getTypeParameter <em>Type Parameter</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.OperationImpl#getBody <em>Body</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.OperationImpl#getCuid <em>Cuid</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.OperationImpl#getPost <em>Post</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.OperationImpl#getIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.OperationImpl#getOwnedParameter <em>Owned Parameter</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.OperationImpl#getRaisedException <em>Raised Exception</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.OperationImpl#getPre <em>Pre</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.OperationImpl#getSuperOperation <em>Super Operation</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.OperationImpl#getLambdaExpression <em>Lambda Expression</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.OperationImpl#getOwningClass <em>Owning Class</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OperationImpl extends MultiplicityElementImpl implements Operation {
	/**
	 * The cached value of the '{@link #getEcoreModelElement() <em>Ecore Model Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEcoreModelElement()
	 * @generated
	 * @ordered
	 */
	protected EOperation ecoreModelElement;

	/**
	 * The cached value of the '{@link #getTypeParameter() <em>Type Parameter</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeParameter()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeVariable> typeParameter;

	/**
	 * The cached value of the '{@link #getBody() <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected Expression body;

	/**
	 * The default value of the '{@link #getCuid() <em>Cuid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCuid()
	 * @generated
	 * @ordered
	 */
	protected static final String CUID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCuid() <em>Cuid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCuid()
	 * @generated
	 * @ordered
	 */
	protected String cuid = CUID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPost() <em>Post</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPost()
	 * @generated
	 * @ordered
	 */
	protected EList<Constraint> post;

	/**
	 * The default value of the '{@link #getIsAbstract() <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsAbstract()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_ABSTRACT_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getIsAbstract() <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsAbstract()
	 * @generated
	 * @ordered
	 */
	protected Boolean isAbstract = IS_ABSTRACT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOwnedParameter() <em>Owned Parameter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedParameter()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> ownedParameter;

	/**
	 * The cached value of the '{@link #getRaisedException() <em>Raised Exception</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRaisedException()
	 * @generated
	 * @ordered
	 */
	protected EList<Type> raisedException;

	/**
	 * The cached value of the '{@link #getPre() <em>Pre</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPre()
	 * @generated
	 * @ordered
	 */
	protected EList<Constraint> pre;

	/**
	 * The cached value of the '{@link #getSuperOperation() <em>Super Operation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuperOperation()
	 * @generated
	 * @ordered
	 */
	protected Operation superOperation;

	/**
	 * The cached value of the '{@link #getLambdaExpression() <em>Lambda Expression</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLambdaExpression()
	 * @generated
	 * @ordered
	 */
	protected LambdaExpression lambdaExpression;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StructurePackage.eINSTANCE.getOperation();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEcoreModelElement() {
		if (ecoreModelElement != null
				&& ((EObject) ecoreModelElement).eIsProxy()) {
			InternalEObject oldEcoreModelElement = (InternalEObject) ecoreModelElement;
			ecoreModelElement = (EOperation) eResolveProxy(oldEcoreModelElement);
			if (ecoreModelElement != oldEcoreModelElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							StructurePackage.OPERATION__ECORE_MODEL_ELEMENT,
							oldEcoreModelElement, ecoreModelElement));
			}
		}
		return ecoreModelElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation basicGetEcoreModelElement() {
		return ecoreModelElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEcoreModelElement(EOperation newEcoreModelElement) {
		EOperation oldEcoreModelElement = ecoreModelElement;
		ecoreModelElement = newEcoreModelElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					StructurePackage.OPERATION__ECORE_MODEL_ELEMENT,
					oldEcoreModelElement, ecoreModelElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeVariable> getTypeParameter() {
		if (typeParameter == null) {
			typeParameter = new EObjectResolvingEList<TypeVariable>(
					TypeVariable.class, this,
					StructurePackage.OPERATION__TYPE_PARAMETER);
		}
		return typeParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getBody() {
		if (body != null && body.eIsProxy()) {
			InternalEObject oldBody = (InternalEObject) body;
			body = (Expression) eResolveProxy(oldBody);
			if (body != oldBody) {
				InternalEObject newBody = (InternalEObject) body;
				NotificationChain msgs = oldBody.eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- StructurePackage.OPERATION__BODY, null, null);
				if (newBody.eInternalContainer() == null) {
					msgs = newBody.eInverseAdd(this, EOPPOSITE_FEATURE_BASE
							- StructurePackage.OPERATION__BODY, null, msgs);
				}
				if (msgs != null)
					msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							StructurePackage.OPERATION__BODY, oldBody, body));
			}
		}
		return body;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression basicGetBody() {
		return body;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBody(Expression newBody,
			NotificationChain msgs) {
		Expression oldBody = body;
		body = newBody;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET, StructurePackage.OPERATION__BODY,
					oldBody, newBody);
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
	public void setBody(Expression newBody) {
		if (newBody != body) {
			NotificationChain msgs = null;
			if (body != null)
				msgs = ((InternalEObject) body).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- StructurePackage.OPERATION__BODY, null, msgs);
			if (newBody != null)
				msgs = ((InternalEObject) newBody).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- StructurePackage.OPERATION__BODY, null, msgs);
			msgs = basicSetBody(newBody, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					StructurePackage.OPERATION__BODY, newBody, newBody));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCuid() {
		return cuid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCuid(String newCuid) {
		String oldCuid = cuid;
		cuid = newCuid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					StructurePackage.OPERATION__CUID, oldCuid, cuid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constraint> getPost() {
		if (post == null) {
			post = new EObjectContainmentWithInverseEList.Resolving<Constraint>(
					Constraint.class, this, StructurePackage.OPERATION__POST,
					StructurePackage.CONSTRAINT__POST_OWNER);
		}
		return post;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsAbstract() {
		return isAbstract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsAbstract(Boolean newIsAbstract) {
		Boolean oldIsAbstract = isAbstract;
		isAbstract = newIsAbstract;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					StructurePackage.OPERATION__IS_ABSTRACT, oldIsAbstract,
					isAbstract));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parameter> getOwnedParameter() {
		if (ownedParameter == null) {
			ownedParameter = new EObjectContainmentWithInverseEList.Resolving<Parameter>(
					Parameter.class, this,
					StructurePackage.OPERATION__OWNED_PARAMETER,
					StructurePackage.PARAMETER__OPERATION);
		}
		return ownedParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Type> getRaisedException() {
		if (raisedException == null) {
			raisedException = new EObjectResolvingEList<Type>(Type.class, this,
					StructurePackage.OPERATION__RAISED_EXCEPTION);
		}
		return raisedException;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constraint> getPre() {
		if (pre == null) {
			pre = new EObjectContainmentWithInverseEList.Resolving<Constraint>(
					Constraint.class, this, StructurePackage.OPERATION__PRE,
					StructurePackage.CONSTRAINT__PRE_OWNER);
		}
		return pre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation getSuperOperation() {
		if (superOperation != null && superOperation.eIsProxy()) {
			InternalEObject oldSuperOperation = (InternalEObject) superOperation;
			superOperation = (Operation) eResolveProxy(oldSuperOperation);
			if (superOperation != oldSuperOperation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							StructurePackage.OPERATION__SUPER_OPERATION,
							oldSuperOperation, superOperation));
			}
		}
		return superOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation basicGetSuperOperation() {
		return superOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuperOperation(Operation newSuperOperation) {
		Operation oldSuperOperation = superOperation;
		superOperation = newSuperOperation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					StructurePackage.OPERATION__SUPER_OPERATION,
					oldSuperOperation, superOperation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LambdaExpression getLambdaExpression() {
		if (lambdaExpression != null && lambdaExpression.eIsProxy()) {
			InternalEObject oldLambdaExpression = (InternalEObject) lambdaExpression;
			lambdaExpression = (LambdaExpression) eResolveProxy(oldLambdaExpression);
			if (lambdaExpression != oldLambdaExpression) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							StructurePackage.OPERATION__LAMBDA_EXPRESSION,
							oldLambdaExpression, lambdaExpression));
			}
		}
		return lambdaExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LambdaExpression basicGetLambdaExpression() {
		return lambdaExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLambdaExpression(LambdaExpression newLambdaExpression) {
		LambdaExpression oldLambdaExpression = lambdaExpression;
		lambdaExpression = newLambdaExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					StructurePackage.OPERATION__LAMBDA_EXPRESSION,
					oldLambdaExpression, lambdaExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassDefinition getOwningClass() {
		if (eContainerFeatureID != StructurePackage.OPERATION__OWNING_CLASS)
			return null;
		return (ClassDefinition) eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassDefinition basicGetOwningClass() {
		if (eContainerFeatureID != StructurePackage.OPERATION__OWNING_CLASS)
			return null;
		return (ClassDefinition) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwningClass(
			ClassDefinition newOwningClass, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newOwningClass,
				StructurePackage.OPERATION__OWNING_CLASS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwningClass(ClassDefinition newOwningClass) {
		if (newOwningClass != eInternalContainer()
				|| (eContainerFeatureID != StructurePackage.OPERATION__OWNING_CLASS && newOwningClass != null)) {
			if (EcoreUtil.isAncestor(this, newOwningClass))
				throw new IllegalArgumentException(
						"Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwningClass != null)
				msgs = ((InternalEObject) newOwningClass).eInverseAdd(this,
						StructurePackage.CLASS_DEFINITION__OWNED_OPERATION,
						ClassDefinition.class, msgs);
			msgs = basicSetOwningClass(newOwningClass, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					StructurePackage.OPERATION__OWNING_CLASS, newOwningClass,
					newOwningClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createBehaviorJava(KM2EcoreContext context) {

		java.lang.String result = null;

		result = null;

		kermeta.utils.StringBuffer javaCode = ((kermeta.utils.StringBuffer) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject(kermeta.utils.UtilsPackage.eINSTANCE
						.getStringBuffer()));

		java.lang.Boolean idIfCond_235 = false;
		idIfCond_235 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoidSwitcher(this.getBody()));

		if (idIfCond_235) {

			java.lang.String type_label = "";

			java.lang.Boolean idIfCond_236 = false;
			idIfCond_236 = context.getFtSuffixActivation();

			if (idIfCond_236) {

				type_label = context.getFtReturnType();

				context.setFtReturnType("");
			} else {

				type_label = ((km2ecore.helper.kermeta.CompilerHelperJava) org.kermeta.compil.runtime.helper.language.ClassUtil
						.newObject(km2ecore.helper.kermeta.KermetaPackage.eINSTANCE
								.getCompilerHelperJava()))
						.ppTypeFromMultiplicityElement(this, context);
			}

			java.lang.Boolean idIfCond_237 = false;
			idIfCond_237 = kermeta.standard.helper.BooleanWrapper.not(this
					.isVoidType(type_label));

			if (idIfCond_237) {

				javaCode.append(kermeta.standard.helper.StringWrapper.plus(
						kermeta.standard.helper.StringWrapper.plus(
								kermeta.standard.helper.StringWrapper.plus(
										kermeta.standard.helper.StringWrapper
												.plus("\n", type_label),
										" result"), context.printFtSuffix()),
						" = null;\n"));
			}

			javaCode.append(this.createBehaviorJavaFromPre(context));

			javaCode.append(this.getBody().createBehaviorJava(context));

			javaCode.append(this.createBehaviorJavaFromPost(context));

			java.lang.Boolean idIfCond_238 = false;
			idIfCond_238 = kermeta.standard.helper.BooleanWrapper.and(
					kermeta.standard.helper.BooleanWrapper.not(this
							.isVoidType(type_label)),
					kermeta.standard.helper.BooleanWrapper.not(context
							.getFtSuffixActivation()));

			if (idIfCond_238) {

				javaCode.append(this.ppReturnResult(context));
			}

		} else {

			java.lang.Boolean idIfCond_239 = false;
			idIfCond_239 = kermeta.standard.helper.BooleanWrapper
					.not(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ClassUtil
							.newObject(kermeta.language.structure.StructurePackage.eINSTANCE
									.getOperation())).isVoidType(this.getType()
							.getTypeQName()));

			if (idIfCond_239) {

				javaCode
						.append(kermeta.standard.helper.StringWrapper
								.plus(
										((km2ecore.helper.kermeta.CompilerHelperJava) org.kermeta.compil.runtime.helper.language.ClassUtil
												.newObject(km2ecore.helper.kermeta.KermetaPackage.eINSTANCE
														.getCompilerHelperJava()))
												.ppTypeFromMultiplicityElement(
														this, context),
										" result = null;\n"));

				javaCode.append(this.ppReturnResult(context));
			}

		}

		java.lang.Boolean idIfCond_240 = false;
		idIfCond_240 = kermeta.standard.helper.BooleanWrapper
				.and(
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isNotEqualSwitcher(
										context.getTasks_stack().peek(),
										org.kermeta.compil.runtime.helper.language.ObjectUtil
												.convertAsObject(context
														.getFUNCTION_TYPE_COMPILATION_TASK())),
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isVoidSwitcher(context.getCurrent_valueType()));

		if (idIfCond_240) {

			((km2ecore.helper.ecore.EAnnotationHelper) org.kermeta.compil.runtime.helper.language.ClassUtil
					.newObject(km2ecore.helper.ecore.EcorePackage.eINSTANCE
							.getEAnnotationHelper()))
					.addAnnotationGenModelImpl(this.getEcoreModelElement(),
							javaCode.toString());
		}

		result = javaCode.toString();

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean isRunnable() {

		java.lang.Boolean result = null;

		result = false;

		kermeta.language.structure.Parameter param = null;
		//BIft:detect

		kermeta.language.structure.Parameter result_ft86 = null;

		kermeta.language.structure.Parameter elem_ft86 = null;

		result_ft86 = null;

		{

			kermeta.standard.Iterator<kermeta.language.structure.Parameter> it_ft86 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Parameter> convertAsOrderedSet(
							this.getOwnedParameter()).iterator();
			java.lang.Boolean idLoopCond_241 = false;
			while (!idLoopCond_241) {
				idLoopCond_241 = kermeta.standard.helper.BooleanWrapper.or(
						it_ft86.isOff(),
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isNotEqualSwitcher(result_ft86, null));
				if (idLoopCond_241) {
				} else {

					elem_ft86 = it_ft86.next();

					java.lang.Boolean idIfCond_242 = false;
					//BIle:detector
					kermeta.language.structure.Parameter param_lbdExp86 = elem_ft86;

					idIfCond_242 = kermeta.standard.helper.BooleanWrapper
							.not(param_lbdExp86.isRunnable());
					//EIle:detector

					if (idIfCond_242) {

						result_ft86 = elem_ft86;
					}

				}
			}
		}

		//CE
		param = result_ft86;
		//EIft:detect
		;

		java.lang.Boolean idIfCond_243 = false;
		idIfCond_243 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isVoidSwitcher(param);

		if (idIfCond_243) {

			result = true;
		}

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOptimizedStaticCall(KM2EcoreContext context) {

		java.lang.String result = null;

		result = "";

		java.lang.Boolean idIfCond_244 = false;
		idIfCond_244 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isInstanceOfSwitcher(this.getBody(),
						org.kermeta.compil.runtime.ExecutionContext
								.getInstance().getMetaClass(
										"kermeta.language.behavior.Block"));

		if (idIfCond_244) {

			java.lang.Boolean idIfCond_245 = false;
			idIfCond_245 = kermeta.standard.helper.IntegerWrapper
					.equals(
							org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
									.<kermeta.language.behavior.Expression> convertAsOrderedSet(
											((kermeta.language.behavior.Block) org.kermeta.compil.runtime.helper.language.ObjectUtil
													.asTypeSwitcher(
															this.getBody(),
															org.kermeta.compil.runtime.ExecutionContext
																	.getInstance()
																	.getMetaClass(
																			"kermeta.language.behavior.Block")))
													.getStatement()).size(), 1);

			if (idIfCond_245) {

				java.lang.Boolean idIfCond_246 = false;
				idIfCond_246 = org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isInstanceOfSwitcher(
								org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
										.<kermeta.language.behavior.Expression> convertAsOrderedSet(((kermeta.language.behavior.Block) org.kermeta.compil.runtime.helper.language.ObjectUtil
												.asTypeSwitcher(
														this.getBody(),
														org.kermeta.compil.runtime.ExecutionContext
																.getInstance()
																.getMetaClass(
																		"kermeta.language.behavior.Block")))
												.getStatement()),
								org.kermeta.compil.runtime.ExecutionContext
										.getInstance()
										.getMetaClass(
												"kermeta.language.behavior.JavaStaticCall"));

				if (idIfCond_246) {

					kermeta.standard.Sequence<java.lang.String> static_call_set_1 = kermeta.standard.helper.StringWrapper
							.split(
									((kermeta.language.behavior.JavaStaticCall) org.kermeta.compil.runtime.helper.language.ObjectUtil
											.asTypeSwitcher(
													org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
															.<kermeta.language.behavior.Expression> convertAsOrderedSet(((kermeta.language.behavior.Block) org.kermeta.compil.runtime.helper.language.ObjectUtil
																	.asTypeSwitcher(
																			this
																					.getBody(),
																			org.kermeta.compil.runtime.ExecutionContext
																					.getInstance()
																					.getMetaClass(
																							"kermeta.language.behavior.Block")))
																	.getStatement()),
													org.kermeta.compil.runtime.ExecutionContext
															.getInstance()
															.getMetaClass(
																	"kermeta.language.behavior.JavaStaticCall")))
											.createBehaviorJava(context), "(");

					result = static_call_set_1.first();
				} else {

					java.lang.Boolean idIfCond_247 = false;
					idIfCond_247 = org.kermeta.compil.runtime.helper.language.ObjectUtil
							.isInstanceOfSwitcher(
									org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
											.<kermeta.language.behavior.Expression> convertAsOrderedSet(((kermeta.language.behavior.Block) org.kermeta.compil.runtime.helper.language.ObjectUtil
													.asTypeSwitcher(
															this.getBody(),
															org.kermeta.compil.runtime.ExecutionContext
																	.getInstance()
																	.getMetaClass(
																			"kermeta.language.behavior.Block")))
													.getStatement()),
									org.kermeta.compil.runtime.ExecutionContext
											.getInstance()
											.getMetaClass(
													"kermeta.language.behavior.Assignment"));

					if (idIfCond_247) {

						java.lang.Boolean idIfCond_248 = false;
						idIfCond_248 = org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isInstanceOfSwitcher(
										((kermeta.language.behavior.Assignment) org.kermeta.compil.runtime.helper.language.ObjectUtil
												.asTypeSwitcher(
														org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
																.<kermeta.language.behavior.Expression> convertAsOrderedSet(((kermeta.language.behavior.Block) org.kermeta.compil.runtime.helper.language.ObjectUtil
																		.asTypeSwitcher(
																				this
																						.getBody(),
																				org.kermeta.compil.runtime.ExecutionContext
																						.getInstance()
																						.getMetaClass(
																								"kermeta.language.behavior.Block")))
																		.getStatement()),
														org.kermeta.compil.runtime.ExecutionContext
																.getInstance()
																.getMetaClass(
																		"kermeta.language.behavior.Assignment")))
												.getValue(),
										org.kermeta.compil.runtime.ExecutionContext
												.getInstance()
												.getMetaClass(
														"kermeta.language.behavior.JavaStaticCall"));

						if (idIfCond_248) {

							kermeta.standard.Sequence<java.lang.String> static_call_set_2 = kermeta.standard.helper.StringWrapper
									.split(
											((kermeta.language.behavior.JavaStaticCall) org.kermeta.compil.runtime.helper.language.ObjectUtil
													.asTypeSwitcher(
															((kermeta.language.behavior.Assignment) org.kermeta.compil.runtime.helper.language.ObjectUtil
																	.asTypeSwitcher(
																			org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
																					.<kermeta.language.behavior.Expression> convertAsOrderedSet(((kermeta.language.behavior.Block) org.kermeta.compil.runtime.helper.language.ObjectUtil
																							.asTypeSwitcher(
																									this
																											.getBody(),
																									org.kermeta.compil.runtime.ExecutionContext
																											.getInstance()
																											.getMetaClass(
																													"kermeta.language.behavior.Block")))
																							.getStatement()),
																			org.kermeta.compil.runtime.ExecutionContext
																					.getInstance()
																					.getMetaClass(
																							"kermeta.language.behavior.Assignment")))
																	.getValue(),
															org.kermeta.compil.runtime.ExecutionContext
																	.getInstance()
																	.getMetaClass(
																			"kermeta.language.behavior.JavaStaticCall")))
													.createBehaviorJava(context),
											"(");

							result = static_call_set_2.first();
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
	public Boolean mustBeCompiled() {

		java.lang.Boolean result = null;

		result = true;

		java.lang.Boolean idIfCond_249 = false;
		idIfCond_249 = this.getOwningClass().isValueType();

		if (idIfCond_249) {

			java.lang.Boolean idIfCond_250 = false;
			idIfCond_250 = org.kermeta.compil.runtime.helper.language.ObjectUtil
					.isNotEqualSwitcher(this.getOwningClass()
							.getEMFInstanceClassName(), "");

			if (idIfCond_250) {

				result = false;
			}

		}

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createBehaviorJavaFromPost(KM2EcoreContext context) {

		java.lang.String result = null;

		result = "";

		//BIft:each

		{

			kermeta.standard.Iterator<kermeta.language.structure.Constraint> it_ft87 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Constraint> convertAsOrderedSet(
							this.getPost()).iterator();
			java.lang.Boolean idLoopCond_251 = false;
			while (!idLoopCond_251) {
				idLoopCond_251 = it_ft87.isOff();
				if (idLoopCond_251) {
				} else {

					//BIle:func
					kermeta.language.structure.Constraint constraint_lbdExp87 = it_ft87
							.next();

					context.getResultLastStatementStack().push(
							kermeta.standard.helper.StringWrapper.plus(
									kermeta.standard.helper.StringWrapper.plus(
											"result_post = ", context
													.getTYPE_SEPARATOR()),
									"java.lang.Boolean"));

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
																																	result,
																																	"\nif( "),
																													context
																															.getJAVA_CLASS_EXECUTION_CONTEXT()),
																									".getInstance().mustBeChecked( \"post__"),
																					kermeta.standard.helper.IntegerWrapper
																							.toString(org.kermeta.compil.runtime.helper.language.ObjectUtil
																									.oidSwitcher(constraint_lbdExp87))),
																	"__"),
													constraint_lbdExp87
															.getName()),
									"\" ) ) {\n");

					result = kermeta.standard.helper.StringWrapper.plus(result,
							"java.lang.Boolean result_post = false;\n");

					result = kermeta.standard.helper.StringWrapper
							.plus(kermeta.standard.helper.StringWrapper.plus(
									result, constraint_lbdExp87
											.createBehaviorJava(context)), "\n");

					result = kermeta.standard.helper.StringWrapper.plus(result,
							"if( !result_post ) {\n");

					result = kermeta.standard.helper.StringWrapper
							.plus(
									result,
									"kermeta.exceptions.ConstraintViolatedPost exp = kermeta.exceptions.ExceptionsFactory.eINSTANCE.createConstraintViolatedPost();\n");

					result = kermeta.standard.helper.StringWrapper
							.plus(
									kermeta.standard.helper.StringWrapper
											.plus(
													kermeta.standard.helper.StringWrapper
															.plus(result,
																	"throw new "),
													context
															.getJAVA_CLASS_EXCEPTION_SWITCHER()),
									"(exp);\n");

					result = kermeta.standard.helper.StringWrapper.plus(result,
							"}\n");

					result = kermeta.standard.helper.StringWrapper.plus(result,
							"}\n");

					context.getResultLastStatementStack().pop();
					//EIle:func

				}
			}
		}

		//EIft:each

		java.lang.Boolean idIfCond_252 = false;
		idIfCond_252 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isNotEqualSwitcher(result, "");

		if (idIfCond_252) {

			result = kermeta.standard.helper.StringWrapper.plus(
					kermeta.standard.helper.StringWrapper.plus(
							"\n//PostConditions Checking\n{", result), "}");
		}

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void applyPass1(KM2EcoreContext context) {

		ecore.EOperation ecoreOperation = this.createEcoreModelElement(context);

		kermeta.language.structure.ClassDefinition c = null;

		c = (kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil
				.asTypeOrVoid(
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.containerSwitcher(this),
						"kermeta.language.structure.ClassDefinition");

		org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
				.<ecore.EOperation> convertAsOrderedSet(
						c.getEcoreModelElement().getEOperations()).add(
						ecoreOperation);

		this.setEcoreModelElement(ecoreOperation);

		//BIft:eachOwnedElement

		//BIft:each

		{

			kermeta.standard.Iterator<kermeta.language.structure.Tag> it_ft89 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Tag> convertAsOrderedSet(
							this.getOwnedTags()).iterator();
			java.lang.Boolean idLoopCond_253 = false;
			while (!idLoopCond_253) {
				idLoopCond_253 = it_ft89.isOff();
				if (idLoopCond_253) {
				} else {

					//BIle:func
					kermeta.language.structure.Tag o_lbdExp89 = it_ft89.next();

					//BIle:func
					kermeta.language.structure.Tag o_lbdExp88 = o_lbdExp89;

					o_lbdExp88.applyPass1(context);
					//EIle:func

					//EIle:func

				}
			}
		}

		//EIft:each

		//BIft:each

		{

			kermeta.standard.Iterator<kermeta.language.structure.Parameter> it_ft90 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Parameter> convertAsOrderedSet(
							this.getOwnedParameter()).iterator();
			java.lang.Boolean idLoopCond_254 = false;
			while (!idLoopCond_254) {
				idLoopCond_254 = it_ft90.isOff();
				if (idLoopCond_254) {
				} else {

					//BIle:func
					kermeta.language.structure.Parameter o_lbdExp90 = it_ft90
							.next();

					//BIle:func
					kermeta.language.structure.Parameter o_lbdExp88 = o_lbdExp90;

					o_lbdExp88.applyPass1(context);
					//EIle:func

					//EIle:func

				}
			}
		}

		//EIft:each

		//BIft:each

		{

			kermeta.standard.Iterator<kermeta.language.structure.Constraint> it_ft91 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Constraint> convertAsOrderedSet(
							this.getPre()).iterator();
			java.lang.Boolean idLoopCond_255 = false;
			while (!idLoopCond_255) {
				idLoopCond_255 = it_ft91.isOff();
				if (idLoopCond_255) {
				} else {

					//BIle:func
					kermeta.language.structure.Constraint o_lbdExp91 = it_ft91
							.next();

					//BIle:func
					kermeta.language.structure.Constraint o_lbdExp88 = o_lbdExp91;

					o_lbdExp88.applyPass1(context);
					//EIle:func

					//EIle:func

				}
			}
		}

		//EIft:each

		//BIft:each

		{

			kermeta.standard.Iterator<kermeta.language.structure.Constraint> it_ft92 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Constraint> convertAsOrderedSet(
							this.getPost()).iterator();
			java.lang.Boolean idLoopCond_256 = false;
			while (!idLoopCond_256) {
				idLoopCond_256 = it_ft92.isOff();
				if (idLoopCond_256) {
				} else {

					//BIle:func
					kermeta.language.structure.Constraint o_lbdExp92 = it_ft92
							.next();

					//BIle:func
					kermeta.language.structure.Constraint o_lbdExp88 = o_lbdExp92;

					o_lbdExp88.applyPass1(context);
					//EIle:func

					//EIle:func

				}
			}
		}

		//EIft:each

		//BIft:each

		{

			kermeta.standard.Iterator<kermeta.language.structure.TypeVariable> it_ft93 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.TypeVariable> convertAsOrderedSet(
							this.getTypeParameter()).iterator();
			java.lang.Boolean idLoopCond_257 = false;
			while (!idLoopCond_257) {
				idLoopCond_257 = it_ft93.isOff();
				if (idLoopCond_257) {
				} else {

					//BIle:func
					kermeta.language.structure.TypeVariable t_lbdExp93 = it_ft93
							.next();

					//BIle:func
					kermeta.language.structure.TypeVariable o_lbdExp88 = t_lbdExp93;

					o_lbdExp88.applyPass1(context);
					//EIle:func

					//EIle:func

				}
			}
		}

		//EIft:each

		//EIft:eachOwnedElement

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void applyPass2(KM2EcoreContext context) {

		java.lang.Boolean idIfCond_258 = false;
		idIfCond_258 = kermeta.standard.helper.BooleanWrapper.not(this
				.isFunctionType());

		if (idIfCond_258) {

			this.setLinks(context);

			kermeta.language.structure.helper.ObjectSuper.super_applyPass2(
					this, context);
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinks(KM2EcoreContext context) {

		kermeta.language.structure.LinkSetterForTypedElement s = ((kermeta.language.structure.LinkSetterForTypedElement) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject(kermeta.language.structure.StructurePackage.eINSTANCE
						.getLinkSetterForTypedElement()));

		s.setLinks(this, this.getEcoreModelElement(), context);

		java.lang.Boolean idIfCond_259 = false;
		idIfCond_259 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoidSwitcher(this.getSuperOperation()));

		if (idIfCond_259) {

			java.lang.String qualifiedName = this.getSuperOperation()
					.getOwningClass().qualifiedName();

			ecore.EAnnotation ecoreAnnotation = ((km2ecore.helper.ecore.EAnnotationHelper) org.kermeta.compil.runtime.helper.language.ClassUtil
					.newObject(km2ecore.helper.ecore.EcorePackage.eINSTANCE
							.getEAnnotationHelper()))
					.createKermetaEAnnotation(
							kermeta.standard.helper.StringWrapper
									.toString(km2ecore.helper.ecore.KermetaEAnnotationKey
											.getByName("superOperation")
											.getName()), qualifiedName);

			org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<ecore.EAnnotation> convertAsOrderedSet(
							this.getEcoreModelElement().getEAnnotations()).add(
							ecoreAnnotation);
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean isFunctionType() {

		java.lang.Boolean result = null;

		result = false;

		java.lang.Boolean idIfCond_260 = false;
		idIfCond_260 = kermeta.standard.helper.BooleanWrapper
				.and(
						kermeta.standard.helper.BooleanWrapper
								.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
										.isVoidSwitcher(this
												.getFunctionTypeParameter())),
						kermeta.standard.helper.IntegerWrapper.isGreater(this
								.getFunctionTypeParameter().size(), 0));

		if (idIfCond_260) {

			result = true;
		}

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean ownedByValueType() {

		java.lang.Boolean result = null;

		result = false;

		java.lang.Boolean idIfCond_261 = false;
		idIfCond_261 = this.getOwningClass().isValueType();

		if (idIfCond_261) {

			result = true;
		}

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void compilingInSimkMode(KM2EcoreContext context) {

		simk.SMContext sMContext = context.getSimkModel()
				.retrieveOrCreateContextForWrapper(this, context);

		java.lang.Boolean idIfCond_262 = false;
		idIfCond_262 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoidSwitcher(sMContext));

		if (idIfCond_262) {

			simk.SMMethod staticMethod = ((simk.SMMethod) org.kermeta.compil.runtime.helper.language.ClassUtil
					.newObject(simk.SimkPackage.eINSTANCE.getSMMethod()));

			org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<simk.SMMethod> convertAsOrderedSet(
							context.getSimkModel().getSMMethods()).add(
							staticMethod);

			org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<simk.SMMethod> convertAsOrderedSet(
							sMContext.getSMMethods()).add(staticMethod);

			staticMethod.setName(this.getName());

			staticMethod.setWrapperUsage();

			simk.SMParameter self_param = ((simk.SMParameter) org.kermeta.compil.runtime.helper.language.ClassUtil
					.newObject(simk.SimkPackage.eINSTANCE.getSMParameter()));

			self_param.setName("self");

			java.lang.Boolean idIfCond_263 = false;
			idIfCond_263 = org.kermeta.compil.runtime.helper.language.ObjectUtil
					.isNotEqualSwitcher(this
							.getWrapperValueTypeSelfExpression(), "");

			if (idIfCond_263) {

				kermeta.utils.Hashtable<java.lang.String, java.lang.String> map_infos = kermeta.standard.helper.StringWrapper
						.getPropertyInfos(this
								.getWrapperValueTypeSelfExpression());

				java.lang.String map_value = map_infos.getValue(context
						.getCurrent_valueType().getEMFInstanceClassName());

				java.lang.Boolean idIfCond_264 = false;
				idIfCond_264 = kermeta.standard.helper.BooleanWrapper
						.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isVoidSwitcher(map_value));

				if (idIfCond_264) {

					self_param.setType(map_value);
				}

			}

			java.lang.Boolean idIfCond_265 = false;
			idIfCond_265 = org.kermeta.compil.runtime.helper.language.ObjectUtil
					.isVoidSwitcher(self_param.getType());

			if (idIfCond_265) {

				self_param.setType(context.getCurrent_valueType()
						.getEMFInstanceClassName());
			}

			org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<simk.SMParameter> convertAsOrderedSet(
							staticMethod.getSMParameters()).add(self_param);

			//BIft:each

			{

				kermeta.standard.Iterator<kermeta.language.structure.Parameter> it_ft94 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<kermeta.language.structure.Parameter> convertAsOrderedSet(
								this.getOwnedParameter()).iterator();
				java.lang.Boolean idLoopCond_266 = false;
				while (!idLoopCond_266) {
					idLoopCond_266 = it_ft94.isOff();
					if (idLoopCond_266) {
					} else {

						//BIle:func
						kermeta.language.structure.Parameter p_lbdExp94 = it_ft94
								.next();

						simk.SMParameter param = ((simk.SMParameter) org.kermeta.compil.runtime.helper.language.ClassUtil
								.newObject(simk.SimkPackage.eINSTANCE
										.getSMParameter()));

						param.setName(p_lbdExp94.getName());

						java.lang.Boolean idIfCond_267 = false;
						idIfCond_267 = kermeta.standard.helper.BooleanWrapper
								.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
										.isInstanceOfSwitcher(
												p_lbdExp94.getType(),
												org.kermeta.compil.runtime.ExecutionContext
														.getInstance()
														.getMetaClass(
																"kermeta.language.structure.FunctionType")));

						if (idIfCond_267) {

							java.lang.Boolean idIfCond_268 = false;
							idIfCond_268 = kermeta.standard.helper.BooleanWrapper
									.or(
											kermeta.standard.helper.StringWrapper
													.equals(
															p_lbdExp94
																	.getType()
																	.getTypeQName(),
															this
																	.getOwningClass()
																	.qualifiedName()),
											kermeta.standard.helper.StringWrapper
													.equals(p_lbdExp94
															.getType()
															.getTypeQName(),
															"kermeta::language::structure::Object"));

							if (idIfCond_268) {

								param.setType(context.getCurrent_valueType()
										.getEMFInstanceClassName());
							} else {

								param.setType(p_lbdExp94.getType()
										.createBehaviorJava(context));

								java.lang.Boolean idIfCond_269 = false;
								idIfCond_269 = ((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ClassUtil
										.newObject(kermeta.language.structure.StructurePackage.eINSTANCE
												.getOperation()))
										.isVoidType(param.getType());

								if (idIfCond_269) {

									param.setType("void");
								}

							}

						} else {
						}

						org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
								.<simk.SMParameter> convertAsOrderedSet(
										staticMethod.getSMParameters()).add(
										param);
						//EIle:func

					}
				}
			}

			//EIft:each

			simk.SMReturn sMReturn = ((simk.SMReturn) org.kermeta.compil.runtime.helper.language.ClassUtil
					.newObject(simk.SimkPackage.eINSTANCE.getSMReturn()));

			staticMethod.setSMReturn(sMReturn);

			java.lang.Boolean idIfCond_270 = false;
			idIfCond_270 = org.kermeta.compil.runtime.helper.language.ObjectUtil
					.isNotEqualSwitcher(this.getWrapperValueTypeReturnType(),
							"");

			if (idIfCond_270) {

				kermeta.utils.Hashtable<java.lang.String, java.lang.String> map_infos = kermeta.standard.helper.StringWrapper
						.getPropertyInfos(this.getWrapperValueTypeReturnType());

				java.lang.String map_value = map_infos.getValue(context
						.getCurrent_valueType().getEMFInstanceClassName());

				java.lang.Boolean idIfCond_271 = false;
				idIfCond_271 = kermeta.standard.helper.BooleanWrapper
						.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isVoidSwitcher(map_value));

				if (idIfCond_271) {

					sMReturn.setType(map_value);
				}

			}

			java.lang.Boolean idIfCond_272 = false;
			idIfCond_272 = org.kermeta.compil.runtime.helper.language.ObjectUtil
					.isVoidSwitcher(sMReturn.getType());

			if (idIfCond_272) {

				sMReturn.setType(this.getType().createBehaviorJava(context));

				java.lang.Boolean idIfCond_273 = false;
				idIfCond_273 = ((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ClassUtil
						.newObject(kermeta.language.structure.StructurePackage.eINSTANCE
								.getOperation()))
						.isVoidType(sMReturn.getType());

				if (idIfCond_273) {

					sMReturn.setType("void");
				}

			}

			staticMethod.setBody("//Protection of the following code\n");

			java.lang.Boolean idIfCond_274 = false;
			idIfCond_274 = kermeta.standard.helper.StringWrapper.equals(this
					.getName(), "equals");

			if (idIfCond_274) {

				staticMethod.setBody(kermeta.standard.helper.StringWrapper
						.plus(staticMethod.getBody(), "if( self == null || "));

				staticMethod
						.setBody(kermeta.standard.helper.StringWrapper
								.plus(
										kermeta.standard.helper.StringWrapper
												.plus(
														staticMethod.getBody(),
														org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
																.<kermeta.language.structure.Parameter> convertAsOrderedSet(
																		this
																				.getOwnedParameter())
																.first()
																.getName()),
										" == null ) {\n"));

				staticMethod
						.setBody(kermeta.standard.helper.StringWrapper
								.plus(
										kermeta.standard.helper.StringWrapper
												.plus(
														kermeta.standard.helper.StringWrapper
																.plus(
																		staticMethod
																				.getBody(),
																		"return self == "),
														org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
																.<kermeta.language.structure.Parameter> convertAsOrderedSet(
																		this
																				.getOwnedParameter())
																.first()
																.getName()),
										";\n"));

				staticMethod.setBody(kermeta.standard.helper.StringWrapper
						.plus(staticMethod.getBody(), "}\n\n"));
			}

			java.lang.Boolean idIfCond_275 = false;
			idIfCond_275 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<java.lang.String> convertAsOrderedSet(
							context.getFrameworkOperations()).contains(
							this.getName());

			if (idIfCond_275) {

				staticMethod
						.setBody(kermeta.standard.helper.StringWrapper
								.plus(
										staticMethod.getBody(),
										"if( self == null || ((java.lang.Object) self) instanceof kermeta.language.structure.Object ) {\n"));

				java.lang.Boolean idIfCond_276 = false;
				idIfCond_276 = org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isNotEqualSwitcher(staticMethod.getSMReturn()
								.getType(), "void");

				if (idIfCond_276) {

					staticMethod.setBody(kermeta.standard.helper.StringWrapper
							.plus(kermeta.standard.helper.StringWrapper
									.plus(kermeta.standard.helper.StringWrapper
											.plus(staticMethod.getBody(),
													"return ("), staticMethod
											.getSMReturn().getType()), ") "));
				}

				staticMethod
						.setBody(kermeta.standard.helper.StringWrapper
								.plus(
										kermeta.standard.helper.StringWrapper
												.plus(
														kermeta.standard.helper.StringWrapper
																.plus(
																		kermeta.standard.helper.StringWrapper
																				.plus(
																						staticMethod
																								.getBody(),
																						context
																								.getOBJECT_UTIL_CLASS()),
																		"."),
														this.getName()),
										"((kermeta.language.structure.Object) ((java.lang.Object) self)"));

				//BIft:each

				{

					kermeta.standard.Iterator<kermeta.language.structure.Parameter> it_ft95 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
							.<kermeta.language.structure.Parameter> convertAsOrderedSet(
									this.getOwnedParameter()).iterator();
					java.lang.Boolean idLoopCond_277 = false;
					while (!idLoopCond_277) {
						idLoopCond_277 = it_ft95.isOff();
						if (idLoopCond_277) {
						} else {

							//BIle:func
							kermeta.language.structure.Parameter p_lbdExp95 = it_ft95
									.next();

							staticMethod
									.setBody(kermeta.standard.helper.StringWrapper
											.plus(
													kermeta.standard.helper.StringWrapper
															.plus(staticMethod
																	.getBody(),
																	", "),
													p_lbdExp95.getName()));
							//EIle:func

						}
					}
				}

				//EIft:each

				staticMethod.setBody(kermeta.standard.helper.StringWrapper
						.plus(staticMethod.getBody(), ");\n"));
			} else {

				staticMethod
						.setBody(kermeta.standard.helper.StringWrapper.plus(
								staticMethod.getBody(),
								"if( self == null ) {\n"));

				staticMethod
						.setBody(kermeta.standard.helper.StringWrapper
								.plus(
										staticMethod.getBody(),
										"kermeta.exceptions.CallOnVoidTarget exp = kermeta.exceptions.ExceptionsFactory.eINSTANCE.createCallOnVoidTarget();\n"));

				staticMethod.setBody(kermeta.standard.helper.StringWrapper
						.plus(kermeta.standard.helper.StringWrapper.plus(
								kermeta.standard.helper.StringWrapper.plus(
										staticMethod.getBody(),
										"exp.setMessage(\"Initialize the "),
								context.getCurrent_valueType().getName()),
								" expression\");\n"));

				staticMethod.setBody(kermeta.standard.helper.StringWrapper
						.plus(kermeta.standard.helper.StringWrapper.plus(
								kermeta.standard.helper.StringWrapper.plus(
										staticMethod.getBody(), "throw new "),
								context.getJAVA_CLASS_EXCEPTION_SWITCHER()),
								"(exp);\n"));
			}

			staticMethod.setBody(kermeta.standard.helper.StringWrapper.plus(
					staticMethod.getBody(), "}\n//End of the protection\n\n"));

			staticMethod.setBody(kermeta.standard.helper.StringWrapper.plus(
					staticMethod.getBody(), this.createBehaviorJava(context)));
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean mustBeDuplicated() {

		java.lang.Boolean result = null;

		result = false;

		java.lang.Boolean idIfCond_278 = false;
		idIfCond_278 = kermeta.standard.helper.BooleanWrapper.or(this.getType()
				.isValueType(), this.hasAValueTypedParameter());

		if (idIfCond_278) {

			result = true;
		}

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createBehaviorJavaFromPre(KM2EcoreContext context) {

		java.lang.String result = null;

		result = "";

		//BIft:each

		{

			kermeta.standard.Iterator<kermeta.language.structure.Constraint> it_ft96 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Constraint> convertAsOrderedSet(
							this.getPre()).iterator();
			java.lang.Boolean idLoopCond_279 = false;
			while (!idLoopCond_279) {
				idLoopCond_279 = it_ft96.isOff();
				if (idLoopCond_279) {
				} else {

					//BIle:func
					kermeta.language.structure.Constraint constraint_lbdExp96 = it_ft96
							.next();

					context.getResultLastStatementStack().push(
							kermeta.standard.helper.StringWrapper.plus(
									kermeta.standard.helper.StringWrapper.plus(
											"result_pre = ", context
													.getTYPE_SEPARATOR()),
									"java.lang.Boolean"));

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
																																	result,
																																	"\nif( "),
																													context
																															.getJAVA_CLASS_EXECUTION_CONTEXT()),
																									".getInstance().mustBeChecked( \"pre__"),
																					kermeta.standard.helper.IntegerWrapper
																							.toString(org.kermeta.compil.runtime.helper.language.ObjectUtil
																									.oidSwitcher(constraint_lbdExp96))),
																	"__"),
													constraint_lbdExp96
															.getName()),
									"\" ) ) {\n");

					result = kermeta.standard.helper.StringWrapper.plus(result,
							"java.lang.Boolean result_pre = false;\n");

					result = kermeta.standard.helper.StringWrapper
							.plus(kermeta.standard.helper.StringWrapper.plus(
									result, constraint_lbdExp96
											.createBehaviorJava(context)), "\n");

					result = kermeta.standard.helper.StringWrapper.plus(result,
							"if( !result_pre ) {\n");

					result = kermeta.standard.helper.StringWrapper
							.plus(
									result,
									"kermeta.exceptions.ConstraintViolatedPre exp = kermeta.exceptions.ExceptionsFactory.eINSTANCE.createConstraintViolatedPre();\n");

					result = kermeta.standard.helper.StringWrapper
							.plus(
									kermeta.standard.helper.StringWrapper
											.plus(
													kermeta.standard.helper.StringWrapper
															.plus(result,
																	"throw new "),
													context
															.getJAVA_CLASS_EXCEPTION_SWITCHER()),
									"(exp);\n");

					result = kermeta.standard.helper.StringWrapper.plus(result,
							"}\n");

					result = kermeta.standard.helper.StringWrapper.plus(result,
							"}\n");

					context.getResultLastStatementStack().pop();
					//EIle:func

				}
			}
		}

		//EIft:each

		java.lang.Boolean idIfCond_280 = false;
		idIfCond_280 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isNotEqualSwitcher(result, "");

		if (idIfCond_280) {

			result = kermeta.standard.helper.StringWrapper.plus(
					kermeta.standard.helper.StringWrapper.plus(
							"\n//PreConditions Checking\n{", result), "}");
		}

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sequence<Parameter> getFunctionTypeParameter() {

		kermeta.standard.Sequence<kermeta.language.structure.Parameter> result = null;

		result = null;

		kermeta.standard.Sequence<kermeta.language.structure.Parameter> ft_parameters = null;
		//BIft:select

		kermeta.standard.Sequence<kermeta.language.structure.Parameter> result_ft97 = null;

		kermeta.language.structure.Parameter elem_ft97 = null;

		result_ft97 = ((kermeta.standard.Sequence<kermeta.language.structure.Parameter>) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject(kermeta.standard.StandardPackage.eINSTANCE
						.getSequence()));

		{

			kermeta.standard.Iterator<kermeta.language.structure.Parameter> it_ft97 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Parameter> convertAsOrderedSet(
							this.getOwnedParameter()).iterator();
			java.lang.Boolean idLoopCond_281 = false;
			while (!idLoopCond_281) {
				idLoopCond_281 = it_ft97.isOff();
				if (idLoopCond_281) {
				} else {

					elem_ft97 = it_ft97.next();

					java.lang.Boolean idIfCond_282 = false;
					//BIle:selector
					kermeta.language.structure.Parameter p_lbdExp97 = elem_ft97;

					idIfCond_282 = org.kermeta.compil.runtime.helper.language.ObjectUtil
							.isInstanceOfSwitcher(
									p_lbdExp97.getType(),
									org.kermeta.compil.runtime.ExecutionContext
											.getInstance()
											.getMetaClass(
													"kermeta.language.structure.FunctionType"));
					//EIle:selector

					if (idIfCond_282) {

						result_ft97.add(elem_ft97);
					}

				}
			}
		}

		//CE
		ft_parameters = result_ft97;
		//EIft:select
		;

		result = ft_parameters;

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean isVoidType(String type_label) {

		java.lang.Boolean result = null;

		result = false;

		java.lang.Boolean idIfCond_283 = false;
		idIfCond_283 = kermeta.standard.helper.BooleanWrapper
				.or(
						kermeta.standard.helper.BooleanWrapper
								.or(
										kermeta.standard.helper.BooleanWrapper
												.or(
														kermeta.standard.helper.BooleanWrapper
																.or(
																		kermeta.standard.helper.BooleanWrapper
																				.or(
																						kermeta.standard.helper.BooleanWrapper
																								.or(
																										kermeta.standard.helper.BooleanWrapper
																												.or(
																														kermeta.standard.helper.StringWrapper
																																.equals(
																																		type_label,
																																		"null"),
																														kermeta.standard.helper.StringWrapper
																																.equals(
																																		type_label,
																																		"void")),
																										kermeta.standard.helper.StringWrapper
																												.equals(
																														type_label,
																														"Void")),
																						kermeta.standard.helper.StringWrapper
																								.equals(
																										type_label,
																										"VoidType")),
																		kermeta.standard.helper.StringWrapper
																				.equals(
																						type_label,
																						"kermeta::standard::Void")),
														kermeta.standard.helper.StringWrapper
																.equals(
																		type_label,
																		"kermeta::language::structure::VoidType")),
										kermeta.standard.helper.StringWrapper
												.equals(type_label,
														"kermeta.standard.Void")),
						kermeta.standard.helper.StringWrapper.equals(
								type_label,
								"kermeta.language.structure.VoidType"));

		if (idIfCond_283) {

			result = true;
		}

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation createEcoreModelElement(KM2EcoreContext context) {

		ecore.EOperation result = null;

		ecore.EOperation ecoreOperation = ((ecore.EOperation) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject(ecore.EcorePackage.eINSTANCE.getEOperation()));

		ecoreOperation.setName(this.getFinalName(context));

		ecoreOperation.setOrdered(this.getIsOrdered());

		ecoreOperation.setUnique(this.getIsUnique());

		ecoreOperation.setLowerBound(this.getLower());

		ecoreOperation.setUpperBound(this.getUpper());

		java.lang.Boolean idIfCond_284 = false;
		idIfCond_284 = this.getIsAbstract();

		if (idIfCond_284) {

			ecore.EAnnotation ecoreAnnotation = ((km2ecore.helper.ecore.EAnnotationHelper) org.kermeta.compil.runtime.helper.language.ClassUtil
					.newObject(km2ecore.helper.ecore.EcorePackage.eINSTANCE
							.getEAnnotationHelper())).createAbstract();

			org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<ecore.EAnnotation> convertAsOrderedSet(
							ecoreOperation.getEAnnotations()).add(
							ecoreAnnotation);
		}

		result = ecoreOperation;

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean hasAValueTypedParameter() {

		java.lang.Boolean result = null;

		result = false;

		kermeta.language.structure.Parameter p = null;
		//BIft:detect

		kermeta.language.structure.Parameter result_ft98 = null;

		kermeta.language.structure.Parameter elem_ft98 = null;

		result_ft98 = null;

		{

			kermeta.standard.Iterator<kermeta.language.structure.Parameter> it_ft98 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Parameter> convertAsOrderedSet(
							this.getOwnedParameter()).iterator();
			java.lang.Boolean idLoopCond_285 = false;
			while (!idLoopCond_285) {
				idLoopCond_285 = kermeta.standard.helper.BooleanWrapper.or(
						it_ft98.isOff(),
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isNotEqualSwitcher(result_ft98, null));
				if (idLoopCond_285) {
				} else {

					elem_ft98 = it_ft98.next();

					java.lang.Boolean idIfCond_286 = false;
					//BIle:detector
					kermeta.language.structure.Parameter p_lbdExp98 = elem_ft98;

					idIfCond_286 = p_lbdExp98.getType().isValueType();
					//EIle:detector

					if (idIfCond_286) {

						result_ft98 = elem_ft98;
					}

				}
			}
		}

		//CE
		p = result_ft98;
		//EIft:detect
		;

		java.lang.Boolean idIfCond_287 = false;
		idIfCond_287 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoidSwitcher(p));

		if (idIfCond_287) {

			result = true;
		}

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void applyPass2BehaviorJava(KM2EcoreContext context) {

		java.lang.Boolean idIfCond_288 = false;
		idIfCond_288 = kermeta.standard.helper.BooleanWrapper.not(this
				.isFunctionType());

		if (idIfCond_288) {

			java.lang.Boolean idIfCond_289 = false;
			idIfCond_289 = org.kermeta.compil.runtime.helper.language.ObjectUtil
					.isVoidSwitcher(context.getCurrent_valueType());

			if (idIfCond_289) {

				this.setLinks(context);

				//BIft:eachOwnedElement

				//BIft:each

				{

					kermeta.standard.Iterator<kermeta.language.structure.Tag> it_ft100 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
							.<kermeta.language.structure.Tag> convertAsOrderedSet(
									this.getOwnedTags()).iterator();
					java.lang.Boolean idLoopCond_290 = false;
					while (!idLoopCond_290) {
						idLoopCond_290 = it_ft100.isOff();
						if (idLoopCond_290) {
						} else {

							//BIle:func
							kermeta.language.structure.Tag o_lbdExp100 = it_ft100
									.next();

							//BIle:func
							kermeta.language.structure.Tag p_lbdExp99 = o_lbdExp100;

							p_lbdExp99.applyPass2BehaviorJava(context);
							//EIle:func

							//EIle:func

						}
					}
				}

				//EIft:each

				//BIft:each

				{

					kermeta.standard.Iterator<kermeta.language.structure.Parameter> it_ft101 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
							.<kermeta.language.structure.Parameter> convertAsOrderedSet(
									this.getOwnedParameter()).iterator();
					java.lang.Boolean idLoopCond_291 = false;
					while (!idLoopCond_291) {
						idLoopCond_291 = it_ft101.isOff();
						if (idLoopCond_291) {
						} else {

							//BIle:func
							kermeta.language.structure.Parameter o_lbdExp101 = it_ft101
									.next();

							//BIle:func
							kermeta.language.structure.Parameter p_lbdExp99 = o_lbdExp101;

							p_lbdExp99.applyPass2BehaviorJava(context);
							//EIle:func

							//EIle:func

						}
					}
				}

				//EIft:each

				//BIft:each

				{

					kermeta.standard.Iterator<kermeta.language.structure.Constraint> it_ft102 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
							.<kermeta.language.structure.Constraint> convertAsOrderedSet(
									this.getPre()).iterator();
					java.lang.Boolean idLoopCond_292 = false;
					while (!idLoopCond_292) {
						idLoopCond_292 = it_ft102.isOff();
						if (idLoopCond_292) {
						} else {

							//BIle:func
							kermeta.language.structure.Constraint o_lbdExp102 = it_ft102
									.next();

							//BIle:func
							kermeta.language.structure.Constraint p_lbdExp99 = o_lbdExp102;

							p_lbdExp99.applyPass2BehaviorJava(context);
							//EIle:func

							//EIle:func

						}
					}
				}

				//EIft:each

				//BIft:each

				{

					kermeta.standard.Iterator<kermeta.language.structure.Constraint> it_ft103 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
							.<kermeta.language.structure.Constraint> convertAsOrderedSet(
									this.getPost()).iterator();
					java.lang.Boolean idLoopCond_293 = false;
					while (!idLoopCond_293) {
						idLoopCond_293 = it_ft103.isOff();
						if (idLoopCond_293) {
						} else {

							//BIle:func
							kermeta.language.structure.Constraint o_lbdExp103 = it_ft103
									.next();

							//BIle:func
							kermeta.language.structure.Constraint p_lbdExp99 = o_lbdExp103;

							p_lbdExp99.applyPass2BehaviorJava(context);
							//EIle:func

							//EIle:func

						}
					}
				}

				//EIft:each

				//BIft:each

				{

					kermeta.standard.Iterator<kermeta.language.structure.TypeVariable> it_ft104 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
							.<kermeta.language.structure.TypeVariable> convertAsOrderedSet(
									this.getTypeParameter()).iterator();
					java.lang.Boolean idLoopCond_294 = false;
					while (!idLoopCond_294) {
						idLoopCond_294 = it_ft104.isOff();
						if (idLoopCond_294) {
						} else {

							//BIle:func
							kermeta.language.structure.TypeVariable t_lbdExp104 = it_ft104
									.next();

							//BIle:func
							kermeta.language.structure.TypeVariable p_lbdExp99 = t_lbdExp104;

							p_lbdExp99.applyPass2BehaviorJava(context);
							//EIle:func

							//EIle:func

						}
					}
				}

				//EIft:each

				//EIft:eachOwnedElement

				this.createBehaviorJava(context);

				java.lang.Boolean idIfCond_295 = false;
				idIfCond_295 = this.isRunnable();

				if (idIfCond_295) {

					simk.SMContext smContext = context.getSimkModel()
							.retrieveOrCreateContextForRunner(this, context);

					simk.SMMethod staticMethod = ((simk.SMMethod) org.kermeta.compil.runtime.helper.language.ClassUtil
							.newObject(simk.SimkPackage.eINSTANCE.getSMMethod()));

					java.lang.String cd_qn = kermeta.standard.helper.StringWrapper
							.replace(this.getOwningClass().qualifiedName(),
									"::", ".");

					java.lang.String class_label = ((km2ecore.helper.kermeta.CompilerHelperJava) org.kermeta.compil.runtime.helper.language.ClassUtil
							.newObject(km2ecore.helper.kermeta.KermetaPackage.eINSTANCE
									.getCompilerHelperJava()))
							.ppEmfLikeGetEMF(cd_qn);

					staticMethod.setName("main");

					staticMethod
							.setBody(kermeta.standard.helper.StringWrapper
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
																																											kermeta.standard.helper.StringWrapper
																																													.plus(
																																															"\n",
																																															cd_qn),
																																											" anExec = ("),
																																							cd_qn),
																																			")"),
																															" org.kermeta.compil.runtime.helper.language.ClassUtil.newObject("),
																											class_label),
																							");"),
																			"\nanExec."),
															this
																	.getFinalName(context)),
											"("));

					java.lang.Integer i = 0;

					//BIft:each

					{

						kermeta.standard.Iterator<kermeta.language.structure.Parameter> it_ft105 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
								.<kermeta.language.structure.Parameter> convertAsOrderedSet(
										this.getOwnedParameter()).iterator();
						java.lang.Boolean idLoopCond_296 = false;
						while (!idLoopCond_296) {
							idLoopCond_296 = it_ft105.isOff();
							if (idLoopCond_296) {
							} else {

								//BIle:func
								kermeta.language.structure.Parameter params_lbdExp105 = it_ft105
										.next();

								java.lang.Boolean idIfCond_297 = false;
								idIfCond_297 = kermeta.standard.helper.IntegerWrapper
										.isGreater(i, 0);

								if (idIfCond_297) {

									staticMethod
											.setBody(kermeta.standard.helper.StringWrapper
													.plus(staticMethod
															.getBody(), ", "));
								}

								staticMethod
										.setBody(kermeta.standard.helper.StringWrapper
												.plus(
														kermeta.standard.helper.StringWrapper
																.plus(
																		kermeta.standard.helper.StringWrapper
																				.plus(
																						staticMethod
																								.getBody(),
																						" args["),
																		kermeta.standard.helper.IntegerWrapper
																				.toString(i)),
														"]"));

								i = kermeta.standard.helper.IntegerWrapper
										.plus(i, 1);
								//EIle:func

							}
						}
					}

					//EIft:each

					staticMethod.setBody(kermeta.standard.helper.StringWrapper
							.plus(staticMethod.getBody(), ");\n"));

					staticMethod.setUsages(simk.SMUsage.getByName("Runner"));

					org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
							.<simk.SMMethod> convertAsOrderedSet(
									context.getSimkModel().getSMMethods()).add(
									staticMethod);

					org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
							.<simk.SMMethod> convertAsOrderedSet(
									smContext.getSMMethods()).add(staticMethod);
				}

			} else {

				this.compilingInSimkMode(context);
			}

		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case StructurePackage.OPERATION__POST:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getPost())
					.basicAdd(otherEnd, msgs);
		case StructurePackage.OPERATION__OWNED_PARAMETER:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getOwnedParameter())
					.basicAdd(otherEnd, msgs);
		case StructurePackage.OPERATION__PRE:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getPre())
					.basicAdd(otherEnd, msgs);
		case StructurePackage.OPERATION__OWNING_CLASS:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetOwningClass((ClassDefinition) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
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
		case StructurePackage.OPERATION__BODY:
			return basicSetBody(null, msgs);
		case StructurePackage.OPERATION__POST:
			return ((InternalEList<?>) getPost()).basicRemove(otherEnd, msgs);
		case StructurePackage.OPERATION__OWNED_PARAMETER:
			return ((InternalEList<?>) getOwnedParameter()).basicRemove(
					otherEnd, msgs);
		case StructurePackage.OPERATION__PRE:
			return ((InternalEList<?>) getPre()).basicRemove(otherEnd, msgs);
		case StructurePackage.OPERATION__OWNING_CLASS:
			return basicSetOwningClass(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(
			NotificationChain msgs) {
		switch (eContainerFeatureID) {
		case StructurePackage.OPERATION__OWNING_CLASS:
			return eInternalContainer().eInverseRemove(this,
					StructurePackage.CLASS_DEFINITION__OWNED_OPERATION,
					ClassDefinition.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case StructurePackage.OPERATION__ECORE_MODEL_ELEMENT:
			if (resolve)
				return getEcoreModelElement();
			return basicGetEcoreModelElement();
		case StructurePackage.OPERATION__TYPE_PARAMETER:
			return getTypeParameter();
		case StructurePackage.OPERATION__BODY:
			if (resolve)
				return getBody();
			return basicGetBody();
		case StructurePackage.OPERATION__CUID:
			return getCuid();
		case StructurePackage.OPERATION__POST:
			return getPost();
		case StructurePackage.OPERATION__IS_ABSTRACT:
			return getIsAbstract();
		case StructurePackage.OPERATION__OWNED_PARAMETER:
			return getOwnedParameter();
		case StructurePackage.OPERATION__RAISED_EXCEPTION:
			return getRaisedException();
		case StructurePackage.OPERATION__PRE:
			return getPre();
		case StructurePackage.OPERATION__SUPER_OPERATION:
			if (resolve)
				return getSuperOperation();
			return basicGetSuperOperation();
		case StructurePackage.OPERATION__LAMBDA_EXPRESSION:
			if (resolve)
				return getLambdaExpression();
			return basicGetLambdaExpression();
		case StructurePackage.OPERATION__OWNING_CLASS:
			if (resolve)
				return getOwningClass();
			return basicGetOwningClass();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case StructurePackage.OPERATION__ECORE_MODEL_ELEMENT:
			setEcoreModelElement((EOperation) newValue);
			return;
		case StructurePackage.OPERATION__TYPE_PARAMETER:
			getTypeParameter().clear();
			getTypeParameter().addAll(
					(Collection<? extends TypeVariable>) newValue);
			return;
		case StructurePackage.OPERATION__BODY:
			setBody((Expression) newValue);
			return;
		case StructurePackage.OPERATION__CUID:
			setCuid((String) newValue);
			return;
		case StructurePackage.OPERATION__POST:
			getPost().clear();
			getPost().addAll((Collection<? extends Constraint>) newValue);
			return;
		case StructurePackage.OPERATION__IS_ABSTRACT:
			setIsAbstract((Boolean) newValue);
			return;
		case StructurePackage.OPERATION__OWNED_PARAMETER:
			getOwnedParameter().clear();
			getOwnedParameter().addAll(
					(Collection<? extends Parameter>) newValue);
			return;
		case StructurePackage.OPERATION__RAISED_EXCEPTION:
			getRaisedException().clear();
			getRaisedException().addAll((Collection<? extends Type>) newValue);
			return;
		case StructurePackage.OPERATION__PRE:
			getPre().clear();
			getPre().addAll((Collection<? extends Constraint>) newValue);
			return;
		case StructurePackage.OPERATION__SUPER_OPERATION:
			setSuperOperation((Operation) newValue);
			return;
		case StructurePackage.OPERATION__LAMBDA_EXPRESSION:
			setLambdaExpression((LambdaExpression) newValue);
			return;
		case StructurePackage.OPERATION__OWNING_CLASS:
			setOwningClass((ClassDefinition) newValue);
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
		case StructurePackage.OPERATION__ECORE_MODEL_ELEMENT:
			setEcoreModelElement((EOperation) null);
			return;
		case StructurePackage.OPERATION__TYPE_PARAMETER:
			getTypeParameter().clear();
			return;
		case StructurePackage.OPERATION__BODY:
			setBody((Expression) null);
			return;
		case StructurePackage.OPERATION__CUID:
			setCuid(CUID_EDEFAULT);
			return;
		case StructurePackage.OPERATION__POST:
			getPost().clear();
			return;
		case StructurePackage.OPERATION__IS_ABSTRACT:
			setIsAbstract(IS_ABSTRACT_EDEFAULT);
			return;
		case StructurePackage.OPERATION__OWNED_PARAMETER:
			getOwnedParameter().clear();
			return;
		case StructurePackage.OPERATION__RAISED_EXCEPTION:
			getRaisedException().clear();
			return;
		case StructurePackage.OPERATION__PRE:
			getPre().clear();
			return;
		case StructurePackage.OPERATION__SUPER_OPERATION:
			setSuperOperation((Operation) null);
			return;
		case StructurePackage.OPERATION__LAMBDA_EXPRESSION:
			setLambdaExpression((LambdaExpression) null);
			return;
		case StructurePackage.OPERATION__OWNING_CLASS:
			setOwningClass((ClassDefinition) null);
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
		case StructurePackage.OPERATION__ECORE_MODEL_ELEMENT:
			return ecoreModelElement != null;
		case StructurePackage.OPERATION__TYPE_PARAMETER:
			return typeParameter != null && !typeParameter.isEmpty();
		case StructurePackage.OPERATION__BODY:
			return body != null;
		case StructurePackage.OPERATION__CUID:
			return CUID_EDEFAULT == null ? cuid != null : !CUID_EDEFAULT
					.equals(cuid);
		case StructurePackage.OPERATION__POST:
			return post != null && !post.isEmpty();
		case StructurePackage.OPERATION__IS_ABSTRACT:
			return IS_ABSTRACT_EDEFAULT == null ? isAbstract != null
					: !IS_ABSTRACT_EDEFAULT.equals(isAbstract);
		case StructurePackage.OPERATION__OWNED_PARAMETER:
			return ownedParameter != null && !ownedParameter.isEmpty();
		case StructurePackage.OPERATION__RAISED_EXCEPTION:
			return raisedException != null && !raisedException.isEmpty();
		case StructurePackage.OPERATION__PRE:
			return pre != null && !pre.isEmpty();
		case StructurePackage.OPERATION__SUPER_OPERATION:
			return superOperation != null;
		case StructurePackage.OPERATION__LAMBDA_EXPRESSION:
			return lambdaExpression != null;
		case StructurePackage.OPERATION__OWNING_CLASS:
			return basicGetOwningClass() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Traceability.class) {
			switch (derivedFeatureID) {
			case StructurePackage.OPERATION__ECORE_MODEL_ELEMENT:
				return StructurePackage.TRACEABILITY__ECORE_MODEL_ELEMENT;
			default:
				return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Traceability.class) {
			switch (baseFeatureID) {
			case StructurePackage.TRACEABILITY__ECORE_MODEL_ELEMENT:
				return StructurePackage.OPERATION__ECORE_MODEL_ELEMENT;
			default:
				return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (cuid: ");
		result.append(cuid);
		result.append(", isAbstract: ");
		result.append(isAbstract);
		result.append(')');
		return result.toString();
	}

} //OperationImpl
