/**
 * <copyright>
 * </copyright>
 *
 * $Id: OperationImpl.java,v 1.6 2008-10-28 13:18:10 cfaucher Exp $
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
 *   <li>{@link kermeta.language.structure.impl.OperationImpl#getIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.OperationImpl#getPost <em>Post</em>}</li>
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
	 * The cached value of the '{@link #getPost() <em>Post</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPost()
	 * @generated
	 * @ordered
	 */
	protected EList<Constraint> post;

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
	public Boolean isRunnable() {

		java.lang.Boolean result = null;

		result = false;

		kermeta.language.structure.Parameter param = null;
		//BIft:detect

		kermeta.language.structure.Parameter result_ft75 = null;

		kermeta.language.structure.Parameter elem_ft75 = null;

		result_ft75 = null;

		{

			kermeta.standard.Iterator<kermeta.language.structure.Parameter> it_ft75 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Parameter> convertAsOrderedSet(
							this.getOwnedParameter()).iterator();
			java.lang.Boolean idLoopCond_168 = false;
			while (!idLoopCond_168) {
				idLoopCond_168 = kermeta.standard.helper.BooleanWrapper.or(
						it_ft75.isOff(),
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isNotEqualSwitcher(result_ft75, null));
				if (idLoopCond_168) {
				} else {

					elem_ft75 = it_ft75.next();

					java.lang.Boolean idIfCond_169 = false;
					//BIle:detector
					kermeta.language.structure.Parameter param_lbdExp75 = elem_ft75;

					idIfCond_169 = kermeta.standard.helper.BooleanWrapper
							.not(param_lbdExp75.isRunnable());
					//EIle:detector

					if (idIfCond_169) {

						result_ft75 = elem_ft75;
					}

				}
			}
		}

		//CE
		param = result_ft75;
		//EIft:detect

		java.lang.Boolean idIfCond_170 = false;
		idIfCond_170 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isVoidSwitcher(param);

		if (idIfCond_170) {

			result = true;
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

		result = null;

		kermeta.utils.StringBuffer javaCode = ((kermeta.utils.StringBuffer) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject("kermeta.utils.StringBuffer"));

		java.lang.Boolean idIfCond_171 = false;
		idIfCond_171 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoidSwitcher(this.getBody()));

		if (idIfCond_171) {

			java.lang.String type_label = "";

			java.lang.Boolean idIfCond_172 = false;
			idIfCond_172 = context.getFtSuffixActivation();

			if (idIfCond_172) {

				type_label = context.getFtReturnType();

				context.setFtReturnType("");
			} else {

				type_label = ((km2ecore.helper.kermeta.CompilerHelperJava) org.kermeta.compil.runtime.helper.language.ClassUtil
						.newObject("km2ecore.helper.kermeta.CompilerHelperJava"))
						.ppTypeFromMultiplicityElement(this, context);
			}

			java.lang.Boolean idIfCond_173 = false;
			idIfCond_173 = kermeta.standard.helper.BooleanWrapper.not(this
					.isVoidType(type_label));

			if (idIfCond_173) {

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

			java.lang.Boolean idIfCond_174 = false;
			idIfCond_174 = kermeta.standard.helper.BooleanWrapper.and(
					kermeta.standard.helper.BooleanWrapper.not(this
							.isVoidType(type_label)),
					kermeta.standard.helper.BooleanWrapper.not(context
							.getFtSuffixActivation()));

			if (idIfCond_174) {

				javaCode.append(this.ppReturnResult(context));
			}

		} else {

			java.lang.Boolean idIfCond_175 = false;
			idIfCond_175 = kermeta.standard.helper.BooleanWrapper
					.not(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ClassUtil
							.newObject("kermeta.language.structure.Operation"))
							.isVoidType(this.getType().getTypeQName()));

			if (idIfCond_175) {

				javaCode
						.append(kermeta.standard.helper.StringWrapper
								.plus(
										((km2ecore.helper.kermeta.CompilerHelperJava) org.kermeta.compil.runtime.helper.language.ClassUtil
												.newObject("km2ecore.helper.kermeta.CompilerHelperJava"))
												.ppTypeFromMultiplicityElement(
														this, context),
										" result = null;\n"));

				javaCode.append(this.ppReturnResult(context));
			}

		}

		java.lang.Boolean idIfCond_176 = false;
		idIfCond_176 = kermeta.standard.helper.BooleanWrapper.and(
				org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isNotEqualSwitcher(context.getTasks_stack().peek(),
								context.getFUNCTION_TYPE_COMPILATION_TASK()),
				org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoidSwitcher(context.getCurrent_valueType()));

		if (idIfCond_176) {

			((km2ecore.helper.ecore.EAnnotationHelper) org.kermeta.compil.runtime.helper.language.ClassUtil
					.newObject("km2ecore.helper.ecore.EAnnotationHelper"))
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
	public String getOptimizedStaticCall(KM2EcoreContext context) {

		java.lang.String result = null;

		result = "";

		java.lang.Boolean idIfCond_177 = false;
		idIfCond_177 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isInstanceOfSwitcher(this.getBody(),
						org.kermeta.compil.runtime.ExecutionContext
								.getInstance().getMetaClass(
										"kermeta.language.behavior.Block"));

		if (idIfCond_177) {

			java.lang.Boolean idIfCond_178 = false;
			idIfCond_178 = kermeta.standard.helper.IntegerWrapper
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

			if (idIfCond_178) {

				java.lang.Boolean idIfCond_179 = false;
				idIfCond_179 = org.kermeta.compil.runtime.helper.language.ObjectUtil
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

				if (idIfCond_179) {

					kermeta.standard.OrderedSet<java.lang.String> static_call_set_1 = kermeta.standard.helper.StringWrapper
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

					java.lang.Boolean idIfCond_180 = false;
					idIfCond_180 = org.kermeta.compil.runtime.helper.language.ObjectUtil
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

					if (idIfCond_180) {

						java.lang.Boolean idIfCond_181 = false;
						idIfCond_181 = org.kermeta.compil.runtime.helper.language.ObjectUtil
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

						if (idIfCond_181) {

							kermeta.standard.OrderedSet<java.lang.String> static_call_set_2 = kermeta.standard.helper.StringWrapper
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

		kermeta.language.structure.ClassDefinition cd_container = ((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil
				.asTypeSwitcher(
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.containerSwitcher(this),
						org.kermeta.compil.runtime.ExecutionContext
								.getInstance()
								.getMetaClass(
										"kermeta.language.structure.ClassDefinition")));

		java.lang.Boolean idIfCond_182 = false;
		idIfCond_182 = cd_container.isValueType();

		if (idIfCond_182) {

			java.lang.Boolean idIfCond_183 = false;
			idIfCond_183 = org.kermeta.compil.runtime.helper.language.ObjectUtil
					.isNotEqualSwitcher(cd_container.getEMFInstanceClassName(),
							"");

			if (idIfCond_183) {

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

			kermeta.standard.Iterator<kermeta.language.structure.Constraint> it_ft76 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Constraint> convertAsOrderedSet(
							this.getPost()).iterator();
			java.lang.Boolean idLoopCond_184 = false;
			while (!idLoopCond_184) {
				idLoopCond_184 = it_ft76.isOff();
				if (idLoopCond_184) {
				} else {

					//BIle:func
					kermeta.language.structure.Constraint constraint_lbdExp76 = it_ft76
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
																									.oidSwitcher(constraint_lbdExp76))),
																	"__"),
													constraint_lbdExp76
															.getName()),
									"\" ) ) {\n");

					result = kermeta.standard.helper.StringWrapper.plus(result,
							"java.lang.Boolean result_post = false;\n");

					result = kermeta.standard.helper.StringWrapper
							.plus(kermeta.standard.helper.StringWrapper.plus(
									result, constraint_lbdExp76
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

		java.lang.Boolean idIfCond_185 = false;
		idIfCond_185 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isNotEqualSwitcher(result, "");

		if (idIfCond_185) {

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
				.containerSwitcher(this);

		org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
				.<ecore.EOperation> convertAsOrderedSet(
						c.getEcoreModelElement().getEOperations()).add(
						ecoreOperation);

		this.setEcoreModelElement(ecoreOperation);

		//BIft:eachOwnedElement

		//BIft:each

		{

			kermeta.standard.Iterator<kermeta.language.structure.Tag> it_ft78 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Tag> convertAsOrderedSet(
							this.getOwnedTags()).iterator();
			java.lang.Boolean idLoopCond_186 = false;
			while (!idLoopCond_186) {
				idLoopCond_186 = it_ft78.isOff();
				if (idLoopCond_186) {
				} else {

					//BIle:func
					kermeta.language.structure.Tag o_lbdExp78 = it_ft78.next();

					//BIle:func
					kermeta.language.structure.Tag o_lbdExp77 = o_lbdExp78;

					o_lbdExp77.applyPass1(context);
					//EIle:func

					//EIle:func

				}
			}
		}

		//EIft:each

		//BIft:each

		{

			kermeta.standard.Iterator<kermeta.language.structure.Parameter> it_ft79 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Parameter> convertAsOrderedSet(
							this.getOwnedParameter()).iterator();
			java.lang.Boolean idLoopCond_187 = false;
			while (!idLoopCond_187) {
				idLoopCond_187 = it_ft79.isOff();
				if (idLoopCond_187) {
				} else {

					//BIle:func
					kermeta.language.structure.Parameter o_lbdExp79 = it_ft79
							.next();

					//BIle:func
					kermeta.language.structure.Parameter o_lbdExp77 = o_lbdExp79;

					o_lbdExp77.applyPass1(context);
					//EIle:func

					//EIle:func

				}
			}
		}

		//EIft:each

		//BIft:each

		{

			kermeta.standard.Iterator<kermeta.language.structure.Constraint> it_ft80 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Constraint> convertAsOrderedSet(
							this.getPre()).iterator();
			java.lang.Boolean idLoopCond_188 = false;
			while (!idLoopCond_188) {
				idLoopCond_188 = it_ft80.isOff();
				if (idLoopCond_188) {
				} else {

					//BIle:func
					kermeta.language.structure.Constraint o_lbdExp80 = it_ft80
							.next();

					//BIle:func
					kermeta.language.structure.Constraint o_lbdExp77 = o_lbdExp80;

					o_lbdExp77.applyPass1(context);
					//EIle:func

					//EIle:func

				}
			}
		}

		//EIft:each

		//BIft:each

		{

			kermeta.standard.Iterator<kermeta.language.structure.Constraint> it_ft81 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Constraint> convertAsOrderedSet(
							this.getPost()).iterator();
			java.lang.Boolean idLoopCond_189 = false;
			while (!idLoopCond_189) {
				idLoopCond_189 = it_ft81.isOff();
				if (idLoopCond_189) {
				} else {

					//BIle:func
					kermeta.language.structure.Constraint o_lbdExp81 = it_ft81
							.next();

					//BIle:func
					kermeta.language.structure.Constraint o_lbdExp77 = o_lbdExp81;

					o_lbdExp77.applyPass1(context);
					//EIle:func

					//EIle:func

				}
			}
		}

		//EIft:each

		//BIft:each

		{

			kermeta.standard.Iterator<kermeta.language.structure.TypeVariable> it_ft82 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.TypeVariable> convertAsOrderedSet(
							this.getTypeParameter()).iterator();
			java.lang.Boolean idLoopCond_190 = false;
			while (!idLoopCond_190) {
				idLoopCond_190 = it_ft82.isOff();
				if (idLoopCond_190) {
				} else {

					//BIle:func
					kermeta.language.structure.TypeVariable t_lbdExp82 = it_ft82
							.next();

					//BIle:func
					kermeta.language.structure.TypeVariable o_lbdExp77 = t_lbdExp82;

					o_lbdExp77.applyPass1(context);
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

		java.lang.Boolean idIfCond_191 = false;
		idIfCond_191 = kermeta.standard.helper.BooleanWrapper.not(this
				.isFunctionType());

		if (idIfCond_191) {

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
				.newObject("kermeta.language.structure.LinkSetterForTypedElement"));

		s.setLinks(this, this.getEcoreModelElement(), context);

		java.lang.Boolean idIfCond_192 = false;
		idIfCond_192 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoidSwitcher(this.getSuperOperation()));

		if (idIfCond_192) {

			java.lang.String qualifiedName = this.getSuperOperation()
					.getOwningClass().qualifiedName();

			ecore.EAnnotation ecoreAnnotation = ((km2ecore.helper.ecore.EAnnotationHelper) org.kermeta.compil.runtime.helper.language.ClassUtil
					.newObject("km2ecore.helper.ecore.EAnnotationHelper"))
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

		java.lang.Boolean idIfCond_193 = false;
		idIfCond_193 = kermeta.standard.helper.BooleanWrapper
				.and(
						kermeta.standard.helper.BooleanWrapper
								.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
										.isVoidSwitcher(this
												.getFunctionTypeParameter())),
						kermeta.standard.helper.IntegerWrapper.isGreater(this
								.getFunctionTypeParameter().size(), 0));

		if (idIfCond_193) {

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

		java.lang.Boolean idIfCond_194 = false;
		idIfCond_194 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoidSwitcher(sMContext));

		if (idIfCond_194) {

			simk.SMMethod staticMethod = ((simk.SMMethod) org.kermeta.compil.runtime.helper.language.ClassUtil
					.newObject("simk.SMMethod"));

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
					.newObject("simk.SMParameter"));

			self_param.setName("self");

			java.lang.Boolean idIfCond_195 = false;
			idIfCond_195 = org.kermeta.compil.runtime.helper.language.ObjectUtil
					.isNotEqualSwitcher(this
							.getWrapperValueTypeSelfExpression(), "");

			if (idIfCond_195) {

				kermeta.utils.Hashtable<java.lang.String, java.lang.String> map_infos = kermeta.standard.helper.StringWrapper
						.getPropertyInfos(this
								.getWrapperValueTypeSelfExpression());

				java.lang.String map_value = map_infos.getValue(context
						.getCurrent_valueType().getEMFInstanceClassName());

				java.lang.Boolean idIfCond_196 = false;
				idIfCond_196 = kermeta.standard.helper.BooleanWrapper
						.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isVoidSwitcher(map_value));

				if (idIfCond_196) {

					self_param.setType(map_value);
				}

			}

			java.lang.Boolean idIfCond_197 = false;
			idIfCond_197 = org.kermeta.compil.runtime.helper.language.ObjectUtil
					.isVoidSwitcher(self_param.getType());

			if (idIfCond_197) {

				self_param.setType(context.getCurrent_valueType()
						.getEMFInstanceClassName());
			}

			org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<simk.SMParameter> convertAsOrderedSet(
							staticMethod.getSMParameters()).add(self_param);

			//BIft:each

			{

				kermeta.standard.Iterator<kermeta.language.structure.Parameter> it_ft83 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<kermeta.language.structure.Parameter> convertAsOrderedSet(
								this.getOwnedParameter()).iterator();
				java.lang.Boolean idLoopCond_198 = false;
				while (!idLoopCond_198) {
					idLoopCond_198 = it_ft83.isOff();
					if (idLoopCond_198) {
					} else {

						//BIle:func
						kermeta.language.structure.Parameter p_lbdExp83 = it_ft83
								.next();

						simk.SMParameter param = ((simk.SMParameter) org.kermeta.compil.runtime.helper.language.ClassUtil
								.newObject("simk.SMParameter"));

						param.setName(p_lbdExp83.getName());

						java.lang.Boolean idIfCond_199 = false;
						idIfCond_199 = kermeta.standard.helper.BooleanWrapper
								.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
										.isInstanceOfSwitcher(
												p_lbdExp83.getType(),
												org.kermeta.compil.runtime.ExecutionContext
														.getInstance()
														.getMetaClass(
																"kermeta.language.structure.FunctionType")));

						if (idIfCond_199) {

							java.lang.Boolean idIfCond_200 = false;
							idIfCond_200 = kermeta.standard.helper.BooleanWrapper
									.or(
											kermeta.standard.helper.StringWrapper
													.equals(
															p_lbdExp83
																	.getType()
																	.getTypeQName(),
															((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil
																	.asTypeSwitcher(
																			org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.containerSwitcher(this),
																			org.kermeta.compil.runtime.ExecutionContext
																					.getInstance()
																					.getMetaClass(
																							"kermeta.language.structure.ClassDefinition")))
																	.qualifiedName()),
											kermeta.standard.helper.StringWrapper
													.equals(p_lbdExp83
															.getType()
															.getTypeQName(),
															"kermeta::language::structure::Object"));

							if (idIfCond_200) {

								param.setType(context.getCurrent_valueType()
										.getEMFInstanceClassName());
							} else {

								param.setType(p_lbdExp83.getType()
										.createBehaviorJava(context));

								java.lang.Boolean idIfCond_201 = false;
								idIfCond_201 = ((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ClassUtil
										.newObject("kermeta.language.structure.Operation"))
										.isVoidType(param.getType());

								if (idIfCond_201) {

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
					.newObject("simk.SMReturn"));

			staticMethod.setSMReturn(sMReturn);

			java.lang.Boolean idIfCond_202 = false;
			idIfCond_202 = org.kermeta.compil.runtime.helper.language.ObjectUtil
					.isNotEqualSwitcher(this.getWrapperValueTypeReturnType(),
							"");

			if (idIfCond_202) {

				kermeta.utils.Hashtable<java.lang.String, java.lang.String> map_infos = kermeta.standard.helper.StringWrapper
						.getPropertyInfos(this.getWrapperValueTypeReturnType());

				java.lang.String map_value = map_infos.getValue(context
						.getCurrent_valueType().getEMFInstanceClassName());

				java.lang.Boolean idIfCond_203 = false;
				idIfCond_203 = kermeta.standard.helper.BooleanWrapper
						.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isVoidSwitcher(map_value));

				if (idIfCond_203) {

					sMReturn.setType(map_value);
				}

			}

			java.lang.Boolean idIfCond_204 = false;
			idIfCond_204 = org.kermeta.compil.runtime.helper.language.ObjectUtil
					.isVoidSwitcher(sMReturn.getType());

			if (idIfCond_204) {

				sMReturn.setType(this.getType().createBehaviorJava(context));

				java.lang.Boolean idIfCond_205 = false;
				idIfCond_205 = ((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ClassUtil
						.newObject("kermeta.language.structure.Operation"))
						.isVoidType(sMReturn.getType());

				if (idIfCond_205) {

					sMReturn.setType("void");
				}

			}

			staticMethod.setBody(this.createBehaviorJava(context));
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

		java.lang.Boolean idIfCond_206 = false;
		idIfCond_206 = kermeta.standard.helper.BooleanWrapper.or(this.getType()
				.isValueType(), this.hasAValueTypedParameter());

		if (idIfCond_206) {

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

			kermeta.standard.Iterator<kermeta.language.structure.Constraint> it_ft84 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Constraint> convertAsOrderedSet(
							this.getPre()).iterator();
			java.lang.Boolean idLoopCond_207 = false;
			while (!idLoopCond_207) {
				idLoopCond_207 = it_ft84.isOff();
				if (idLoopCond_207) {
				} else {

					//BIle:func
					kermeta.language.structure.Constraint constraint_lbdExp84 = it_ft84
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
																									.oidSwitcher(constraint_lbdExp84))),
																	"__"),
													constraint_lbdExp84
															.getName()),
									"\" ) ) {\n");

					result = kermeta.standard.helper.StringWrapper.plus(result,
							"java.lang.Boolean result_pre = false;\n");

					result = kermeta.standard.helper.StringWrapper
							.plus(kermeta.standard.helper.StringWrapper.plus(
									result, constraint_lbdExp84
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

		java.lang.Boolean idIfCond_208 = false;
		idIfCond_208 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isNotEqualSwitcher(result, "");

		if (idIfCond_208) {

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

		kermeta.standard.Sequence<kermeta.language.structure.Parameter> result_ft85 = null;

		kermeta.language.structure.Parameter elem_ft85 = null;

		result_ft85 = ((kermeta.standard.Sequence<kermeta.language.structure.Parameter>) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject("kermeta.standard.Sequence<kermeta.language.structure.Parameter>"));

		{

			kermeta.standard.Iterator<kermeta.language.structure.Parameter> it_ft85 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Parameter> convertAsOrderedSet(
							this.getOwnedParameter()).iterator();
			java.lang.Boolean idLoopCond_209 = false;
			while (!idLoopCond_209) {
				idLoopCond_209 = it_ft85.isOff();
				if (idLoopCond_209) {
				} else {

					elem_ft85 = it_ft85.next();

					java.lang.Boolean idIfCond_210 = false;
					//BIle:selector
					kermeta.language.structure.Parameter p_lbdExp85 = elem_ft85;

					idIfCond_210 = org.kermeta.compil.runtime.helper.language.ObjectUtil
							.isInstanceOfSwitcher(
									p_lbdExp85.getType(),
									org.kermeta.compil.runtime.ExecutionContext
											.getInstance()
											.getMetaClass(
													"kermeta.language.structure.FunctionType"));
					//EIle:selector

					if (idIfCond_210) {

						result_ft85.add(elem_ft85);
					}

				}
			}
		}

		//CE
		ft_parameters = result_ft85;
		//EIft:select

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

		java.lang.Boolean idIfCond_211 = false;
		idIfCond_211 = kermeta.standard.helper.BooleanWrapper
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

		if (idIfCond_211) {

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
				.newObject("ecore.EOperation"));

		ecoreOperation.setName(this.getFinalName(context));

		ecoreOperation.setOrdered(this.getIsOrdered());

		ecoreOperation.setUnique(this.getIsUnique());

		ecoreOperation.setLowerBound(this.getLower());

		ecoreOperation.setUpperBound(this.getUpper());

		java.lang.Boolean idIfCond_212 = false;
		idIfCond_212 = this.getIsAbstract();

		if (idIfCond_212) {

			ecore.EAnnotation ecoreAnnotation = ((km2ecore.helper.ecore.EAnnotationHelper) org.kermeta.compil.runtime.helper.language.ClassUtil
					.newObject("km2ecore.helper.ecore.EAnnotationHelper"))
					.createAbstract();

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

		kermeta.language.structure.Parameter result_ft86 = null;

		kermeta.language.structure.Parameter elem_ft86 = null;

		result_ft86 = null;

		{

			kermeta.standard.Iterator<kermeta.language.structure.Parameter> it_ft86 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Parameter> convertAsOrderedSet(
							this.getOwnedParameter()).iterator();
			java.lang.Boolean idLoopCond_213 = false;
			while (!idLoopCond_213) {
				idLoopCond_213 = kermeta.standard.helper.BooleanWrapper.or(
						it_ft86.isOff(),
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isNotEqualSwitcher(result_ft86, null));
				if (idLoopCond_213) {
				} else {

					elem_ft86 = it_ft86.next();

					java.lang.Boolean idIfCond_214 = false;
					//BIle:detector
					kermeta.language.structure.Parameter p_lbdExp86 = elem_ft86;

					idIfCond_214 = p_lbdExp86.getType().isValueType();
					//EIle:detector

					if (idIfCond_214) {

						result_ft86 = elem_ft86;
					}

				}
			}
		}

		//CE
		p = result_ft86;
		//EIft:detect

		java.lang.Boolean idIfCond_215 = false;
		idIfCond_215 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoidSwitcher(p));

		if (idIfCond_215) {

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

		java.lang.Boolean idIfCond_216 = false;
		idIfCond_216 = kermeta.standard.helper.BooleanWrapper.not(this
				.isFunctionType());

		if (idIfCond_216) {

			java.lang.Boolean idIfCond_217 = false;
			idIfCond_217 = org.kermeta.compil.runtime.helper.language.ObjectUtil
					.isVoidSwitcher(context.getCurrent_valueType());

			if (idIfCond_217) {

				this.setLinks(context);

				//BIft:eachOwnedElement

				//BIft:each

				{

					kermeta.standard.Iterator<kermeta.language.structure.Tag> it_ft88 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
							.<kermeta.language.structure.Tag> convertAsOrderedSet(
									this.getOwnedTags()).iterator();
					java.lang.Boolean idLoopCond_218 = false;
					while (!idLoopCond_218) {
						idLoopCond_218 = it_ft88.isOff();
						if (idLoopCond_218) {
						} else {

							//BIle:func
							kermeta.language.structure.Tag o_lbdExp88 = it_ft88
									.next();

							//BIle:func
							kermeta.language.structure.Tag p_lbdExp87 = o_lbdExp88;

							p_lbdExp87.applyPass2BehaviorJava(context);
							//EIle:func

							//EIle:func

						}
					}
				}

				//EIft:each

				//BIft:each

				{

					kermeta.standard.Iterator<kermeta.language.structure.Parameter> it_ft89 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
							.<kermeta.language.structure.Parameter> convertAsOrderedSet(
									this.getOwnedParameter()).iterator();
					java.lang.Boolean idLoopCond_219 = false;
					while (!idLoopCond_219) {
						idLoopCond_219 = it_ft89.isOff();
						if (idLoopCond_219) {
						} else {

							//BIle:func
							kermeta.language.structure.Parameter o_lbdExp89 = it_ft89
									.next();

							//BIle:func
							kermeta.language.structure.Parameter p_lbdExp87 = o_lbdExp89;

							p_lbdExp87.applyPass2BehaviorJava(context);
							//EIle:func

							//EIle:func

						}
					}
				}

				//EIft:each

				//BIft:each

				{

					kermeta.standard.Iterator<kermeta.language.structure.Constraint> it_ft90 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
							.<kermeta.language.structure.Constraint> convertAsOrderedSet(
									this.getPre()).iterator();
					java.lang.Boolean idLoopCond_220 = false;
					while (!idLoopCond_220) {
						idLoopCond_220 = it_ft90.isOff();
						if (idLoopCond_220) {
						} else {

							//BIle:func
							kermeta.language.structure.Constraint o_lbdExp90 = it_ft90
									.next();

							//BIle:func
							kermeta.language.structure.Constraint p_lbdExp87 = o_lbdExp90;

							p_lbdExp87.applyPass2BehaviorJava(context);
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
									this.getPost()).iterator();
					java.lang.Boolean idLoopCond_221 = false;
					while (!idLoopCond_221) {
						idLoopCond_221 = it_ft91.isOff();
						if (idLoopCond_221) {
						} else {

							//BIle:func
							kermeta.language.structure.Constraint o_lbdExp91 = it_ft91
									.next();

							//BIle:func
							kermeta.language.structure.Constraint p_lbdExp87 = o_lbdExp91;

							p_lbdExp87.applyPass2BehaviorJava(context);
							//EIle:func

							//EIle:func

						}
					}
				}

				//EIft:each

				//BIft:each

				{

					kermeta.standard.Iterator<kermeta.language.structure.TypeVariable> it_ft92 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
							.<kermeta.language.structure.TypeVariable> convertAsOrderedSet(
									this.getTypeParameter()).iterator();
					java.lang.Boolean idLoopCond_222 = false;
					while (!idLoopCond_222) {
						idLoopCond_222 = it_ft92.isOff();
						if (idLoopCond_222) {
						} else {

							//BIle:func
							kermeta.language.structure.TypeVariable t_lbdExp92 = it_ft92
									.next();

							//BIle:func
							kermeta.language.structure.TypeVariable p_lbdExp87 = t_lbdExp92;

							p_lbdExp87.applyPass2BehaviorJava(context);
							//EIle:func

							//EIle:func

						}
					}
				}

				//EIft:each

				//EIft:eachOwnedElement

				this.createBehaviorJava(context);

				java.lang.Boolean idIfCond_223 = false;
				idIfCond_223 = this.isRunnable();

				if (idIfCond_223) {

					simk.SMContext smContext = context.getSimkModel()
							.retrieveOrCreateContextForRunner(this, context);

					simk.SMMethod staticMethod = ((simk.SMMethod) org.kermeta.compil.runtime.helper.language.ClassUtil
							.newObject("simk.SMMethod"));

					java.lang.String cd_qn = kermeta.standard.helper.StringWrapper
							.replace(
									((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil
											.asTypeSwitcher(
													org.kermeta.compil.runtime.helper.language.ObjectUtil
															.containerSwitcher(this),
													org.kermeta.compil.runtime.ExecutionContext
															.getInstance()
															.getMetaClass(
																	"kermeta.language.structure.ClassDefinition")))
											.qualifiedName(), "::", ".");

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
																															" org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\""),
																											cd_qn),
																							"\");"),
																			"\nanExec."),
															this
																	.getFinalName(context)),
											"("));

					java.lang.Integer i = 0;

					//BIft:each

					{

						kermeta.standard.Iterator<kermeta.language.structure.Parameter> it_ft93 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
								.<kermeta.language.structure.Parameter> convertAsOrderedSet(
										this.getOwnedParameter()).iterator();
						java.lang.Boolean idLoopCond_224 = false;
						while (!idLoopCond_224) {
							idLoopCond_224 = it_ft93.isOff();
							if (idLoopCond_224) {
							} else {

								//BIle:func
								kermeta.language.structure.Parameter params_lbdExp93 = it_ft93
										.next();

								java.lang.Boolean idIfCond_225 = false;
								idIfCond_225 = kermeta.standard.helper.IntegerWrapper
										.isGreater(i, 0);

								if (idIfCond_225) {

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
		case StructurePackage.OPERATION__IS_ABSTRACT:
			return getIsAbstract();
		case StructurePackage.OPERATION__POST:
			return getPost();
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
		case StructurePackage.OPERATION__IS_ABSTRACT:
			setIsAbstract((Boolean) newValue);
			return;
		case StructurePackage.OPERATION__POST:
			getPost().clear();
			getPost().addAll((Collection<? extends Constraint>) newValue);
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
		case StructurePackage.OPERATION__IS_ABSTRACT:
			setIsAbstract(IS_ABSTRACT_EDEFAULT);
			return;
		case StructurePackage.OPERATION__POST:
			getPost().clear();
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
		case StructurePackage.OPERATION__IS_ABSTRACT:
			return IS_ABSTRACT_EDEFAULT == null ? isAbstract != null
					: !IS_ABSTRACT_EDEFAULT.equals(isAbstract);
		case StructurePackage.OPERATION__POST:
			return post != null && !post.isEmpty();
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
