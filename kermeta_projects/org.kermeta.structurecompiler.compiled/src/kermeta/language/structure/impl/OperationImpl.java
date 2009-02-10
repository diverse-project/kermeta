/**
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * 
 * Generating with Kermeta <http://www.kermeta.org>
 *
 * $Id: OperationImpl.java,v 1.11 2009-02-10 17:51:45 cfaucher Exp $
 */
package kermeta.language.structure.impl;

import ecore.EOperation;

import java.util.Collection;

import kermeta.language.behavior.Expression;
import kermeta.language.behavior.LambdaExpression;

import kermeta.language.structure.ClassDefinition;
import kermeta.language.structure.Constraint;
import kermeta.language.structure.MultiplicityElement;
import kermeta.language.structure.NamedElement;
import kermeta.language.structure.Operation;
import kermeta.language.structure.Parameter;
import kermeta.language.structure.StructurePackage;
import kermeta.language.structure.Type;
import kermeta.language.structure.TypeContainer;
import kermeta.language.structure.TypeVariable;
import kermeta.language.structure.TypedElement;

import kermeta.standard.Sequence;

import km2ecore.KM2EcoreContext;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
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
 *   <li>{@link kermeta.language.structure.impl.OperationImpl#getContainedType <em>Contained Type</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.OperationImpl#getName <em>Name</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.OperationImpl#getType <em>Type</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.OperationImpl#getIsOrdered <em>Is Ordered</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.OperationImpl#getUpper <em>Upper</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.OperationImpl#getLower <em>Lower</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.OperationImpl#getIsUnique <em>Is Unique</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.OperationImpl#getTypeParameter <em>Type Parameter</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.OperationImpl#getBody <em>Body</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.OperationImpl#getCuid <em>Cuid</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.OperationImpl#getOwnedParameter <em>Owned Parameter</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.OperationImpl#getIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.OperationImpl#getPost <em>Post</em>}</li>
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
public class OperationImpl extends TraceabilityImpl<EOperation> implements
		Operation {
	/**
	 * The cached value of the '{@link #getContainedType() <em>Contained Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedType()
	 * @generated
	 * @ordered
	 */
	protected EList<Type> containedType;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Type type;

	/**
	 * The default value of the '{@link #getIsOrdered() <em>Is Ordered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsOrdered()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_ORDERED_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getIsOrdered() <em>Is Ordered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsOrdered()
	 * @generated
	 * @ordered
	 */
	protected Boolean isOrdered = IS_ORDERED_EDEFAULT;

	/**
	 * The default value of the '{@link #getUpper() <em>Upper</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpper()
	 * @generated
	 * @ordered
	 */
	protected static final Integer UPPER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUpper() <em>Upper</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpper()
	 * @generated
	 * @ordered
	 */
	protected Integer upper = UPPER_EDEFAULT;

	/**
	 * The default value of the '{@link #getLower() <em>Lower</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLower()
	 * @generated
	 * @ordered
	 */
	protected static final Integer LOWER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLower() <em>Lower</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLower()
	 * @generated
	 * @ordered
	 */
	protected Integer lower = LOWER_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsUnique() <em>Is Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsUnique()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_UNIQUE_EDEFAULT = Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getIsUnique() <em>Is Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsUnique()
	 * @generated
	 * @ordered
	 */
	protected Boolean isUnique = IS_UNIQUE_EDEFAULT;

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
	 * The cached value of the '{@link #getOwnedParameter() <em>Owned Parameter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedParameter()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> ownedParameter;

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
	public EList<Type> getContainedType() {
		if (containedType == null) {
			containedType = new EObjectContainmentWithInverseEList.Resolving<Type>(
					Type.class, this,
					StructurePackage.OPERATION__CONTAINED_TYPE,
					StructurePackage.TYPE__TYPE_CONTAINER);
		}
		return containedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					StructurePackage.OPERATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject) type;
			type = (Type) eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							StructurePackage.OPERATION__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Type newType) {
		Type oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					StructurePackage.OPERATION__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsOrdered() {
		return isOrdered;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsOrdered(Boolean newIsOrdered) {
		Boolean oldIsOrdered = isOrdered;
		isOrdered = newIsOrdered;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					StructurePackage.OPERATION__IS_ORDERED, oldIsOrdered,
					isOrdered));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getUpper() {
		return upper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpper(Integer newUpper) {
		Integer oldUpper = upper;
		upper = newUpper;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					StructurePackage.OPERATION__UPPER, oldUpper, upper));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getLower() {
		return lower;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLower(Integer newLower) {
		Integer oldLower = lower;
		lower = newLower;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					StructurePackage.OPERATION__LOWER, oldLower, lower));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsUnique() {
		return isUnique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsUnique(Boolean newIsUnique) {
		Boolean oldIsUnique = isUnique;
		isUnique = newIsUnique;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					StructurePackage.OPERATION__IS_UNIQUE, oldIsUnique,
					isUnique));
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

		kermeta.language.structure.Parameter result_ft71 = null;

		kermeta.language.structure.Parameter elem_ft71 = null;

		result_ft71 = null;

		{

			kermeta.standard.Iterator<kermeta.language.structure.Parameter> it_ft71 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Parameter> convertAsOrderedSet(
							this.getOwnedParameter()).iterator();
			java.lang.Boolean idLoopCond_439 = false;
			while (!idLoopCond_439) {
				idLoopCond_439 = kermeta.standard.helper.BooleanWrapper.or(
						it_ft71.isOff(),
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isNotEqualSwitcher(result_ft71, null));
				if (idLoopCond_439) {
				} else {

					elem_ft71 = it_ft71.next();

					java.lang.Boolean idIfCond_440 = false;
					//BIle:detector
					kermeta.language.structure.Parameter param_lbdExp71 = elem_ft71;

					idIfCond_440 = kermeta.standard.helper.BooleanWrapper
							.not(param_lbdExp71.isRunnable());
					//EIle:detector

					if (idIfCond_440) {

						result_ft71 = elem_ft71;
					}

				}
			}
		}

		//CE
		param = result_ft71;
		//EIft:detect
		;

		java.lang.Boolean idIfCond_441 = false;
		idIfCond_441 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isVoidSwitcher(param);

		if (idIfCond_441) {

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
				.newObject(kermeta.utils.UtilsPackage.eINSTANCE
						.getStringBuffer()));

		java.lang.Boolean idIfCond_442 = false;
		idIfCond_442 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoidSwitcher(this.getBody()));

		if (idIfCond_442) {

			java.lang.String type_label = "";

			java.lang.Boolean idIfCond_443 = false;
			idIfCond_443 = context.getFtSuffixActivation();

			if (idIfCond_443) {

				type_label = context.getFtReturnType();

				context.setFtReturnType("");
			} else {

				type_label = ((km2ecore.helper.kermeta.CompilerHelperJava) org.kermeta.compil.runtime.helper.language.ClassUtil
						.newObject(km2ecore.helper.kermeta.KermetaPackage.eINSTANCE
								.getCompilerHelperJava()))
						.ppTypeFromMultiplicityElement(this, context);
			}

			java.lang.Boolean idIfCond_444 = false;
			idIfCond_444 = kermeta.standard.helper.BooleanWrapper.not(this
					.isVoidType(type_label));

			if (idIfCond_444) {

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

			java.lang.Boolean idIfCond_445 = false;
			idIfCond_445 = kermeta.standard.helper.BooleanWrapper.and(
					kermeta.standard.helper.BooleanWrapper.not(this
							.isVoidType(type_label)),
					kermeta.standard.helper.BooleanWrapper.not(context
							.getFtSuffixActivation()));

			if (idIfCond_445) {

				javaCode.append(this.ppReturnResult(context));
			}

		} else {

			java.lang.Boolean idIfCond_446 = false;
			idIfCond_446 = kermeta.standard.helper.BooleanWrapper
					.not(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ClassUtil
							.newObject(kermeta.language.structure.StructurePackage.eINSTANCE
									.getOperation())).isVoidType(this.getType()
							.getTypeQName()));

			if (idIfCond_446) {

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

		java.lang.Boolean idIfCond_447 = false;
		idIfCond_447 = kermeta.standard.helper.BooleanWrapper
				.and(
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isNotEqualSwitcher(
										context.getTasks_stack().peek(),
										org.kermeta.compil.runtime.helper.language.ObjectUtil
												.convertAsObject(context
														.getFUNCTION_TYPE_COMPILATION_TASK())),
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isVoidSwitcher(context.getCurrent_valueType()));

		if (idIfCond_447) {

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
	public Boolean mustBeCompiled() {

		java.lang.Boolean result = null;

		result = true;

		java.lang.Boolean idIfCond_448 = false;
		idIfCond_448 = this.getOwningClass().isValueType();

		if (idIfCond_448) {

			java.lang.Boolean idIfCond_449 = false;
			idIfCond_449 = org.kermeta.compil.runtime.helper.language.ObjectUtil
					.isNotEqualSwitcher(this.getOwningClass()
							.getEMFInstanceClassName(), "");

			if (idIfCond_449) {

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
	public String getOptimizedStaticCall(KM2EcoreContext context) {

		java.lang.String result = null;

		result = "";

		java.lang.Boolean idIfCond_450 = false;
		idIfCond_450 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isInstanceOfSwitcher(this.getBody(),
						org.kermeta.compil.runtime.ExecutionContext
								.getInstance().getMetaClass(
										"kermeta.language.behavior.Block"));

		if (idIfCond_450) {

			java.lang.Boolean idIfCond_451 = false;
			idIfCond_451 = kermeta.standard.helper.IntegerWrapper
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

			if (idIfCond_451) {

				java.lang.Boolean idIfCond_452 = false;
				idIfCond_452 = org.kermeta.compil.runtime.helper.language.ObjectUtil
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

				if (idIfCond_452) {

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

					java.lang.Boolean idIfCond_453 = false;
					idIfCond_453 = org.kermeta.compil.runtime.helper.language.ObjectUtil
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

					if (idIfCond_453) {

						java.lang.Boolean idIfCond_454 = false;
						idIfCond_454 = org.kermeta.compil.runtime.helper.language.ObjectUtil
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

						if (idIfCond_454) {

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
	public String createBehaviorJavaFromPost(KM2EcoreContext context) {

		java.lang.String result = null;

		result = "";

		//BIft:each

		{

			kermeta.standard.Iterator<kermeta.language.structure.Constraint> it_ft72 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Constraint> convertAsOrderedSet(
							this.getPost()).iterator();
			java.lang.Boolean idLoopCond_455 = false;
			while (!idLoopCond_455) {
				idLoopCond_455 = it_ft72.isOff();
				if (idLoopCond_455) {
				} else {

					//BIle:func
					kermeta.language.structure.Constraint constraint_lbdExp72 = it_ft72
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
																									.oidSwitcher(constraint_lbdExp72))),
																	"__"),
													constraint_lbdExp72
															.getName()),
									"\" ) ) {\n");

					result = kermeta.standard.helper.StringWrapper.plus(result,
							"java.lang.Boolean result_post = false;\n");

					result = kermeta.standard.helper.StringWrapper
							.plus(kermeta.standard.helper.StringWrapper.plus(
									result, constraint_lbdExp72
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

		java.lang.Boolean idIfCond_456 = false;
		idIfCond_456 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isNotEqualSwitcher(result, "");

		if (idIfCond_456) {

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

			kermeta.standard.Iterator<kermeta.language.structure.Tag> it_ft74 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Tag> convertAsOrderedSet(
							this.getOwnedTags()).iterator();
			java.lang.Boolean idLoopCond_457 = false;
			while (!idLoopCond_457) {
				idLoopCond_457 = it_ft74.isOff();
				if (idLoopCond_457) {
				} else {

					//BIle:func
					kermeta.language.structure.Tag o_lbdExp74 = it_ft74.next();

					//BIle:func
					kermeta.language.structure.Tag o_lbdExp73 = o_lbdExp74;

					o_lbdExp73.applyPass1(context);
					//EIle:func

					//EIle:func

				}
			}
		}

		//EIft:each

		//BIft:each

		{

			kermeta.standard.Iterator<kermeta.language.structure.Parameter> it_ft75 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Parameter> convertAsOrderedSet(
							this.getOwnedParameter()).iterator();
			java.lang.Boolean idLoopCond_458 = false;
			while (!idLoopCond_458) {
				idLoopCond_458 = it_ft75.isOff();
				if (idLoopCond_458) {
				} else {

					//BIle:func
					kermeta.language.structure.Parameter o_lbdExp75 = it_ft75
							.next();

					//BIle:func
					kermeta.language.structure.Parameter o_lbdExp73 = o_lbdExp75;

					o_lbdExp73.applyPass1(context);
					//EIle:func

					//EIle:func

				}
			}
		}

		//EIft:each

		//BIft:each

		{

			kermeta.standard.Iterator<kermeta.language.structure.Constraint> it_ft76 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Constraint> convertAsOrderedSet(
							this.getPre()).iterator();
			java.lang.Boolean idLoopCond_459 = false;
			while (!idLoopCond_459) {
				idLoopCond_459 = it_ft76.isOff();
				if (idLoopCond_459) {
				} else {

					//BIle:func
					kermeta.language.structure.Constraint o_lbdExp76 = it_ft76
							.next();

					//BIle:func
					kermeta.language.structure.Constraint o_lbdExp73 = o_lbdExp76;

					o_lbdExp73.applyPass1(context);
					//EIle:func

					//EIle:func

				}
			}
		}

		//EIft:each

		//BIft:each

		{

			kermeta.standard.Iterator<kermeta.language.structure.Constraint> it_ft77 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Constraint> convertAsOrderedSet(
							this.getPost()).iterator();
			java.lang.Boolean idLoopCond_460 = false;
			while (!idLoopCond_460) {
				idLoopCond_460 = it_ft77.isOff();
				if (idLoopCond_460) {
				} else {

					//BIle:func
					kermeta.language.structure.Constraint o_lbdExp77 = it_ft77
							.next();

					//BIle:func
					kermeta.language.structure.Constraint o_lbdExp73 = o_lbdExp77;

					o_lbdExp73.applyPass1(context);
					//EIle:func

					//EIle:func

				}
			}
		}

		//EIft:each

		//BIft:each

		{

			kermeta.standard.Iterator<kermeta.language.structure.TypeVariable> it_ft78 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.TypeVariable> convertAsOrderedSet(
							this.getTypeParameter()).iterator();
			java.lang.Boolean idLoopCond_461 = false;
			while (!idLoopCond_461) {
				idLoopCond_461 = it_ft78.isOff();
				if (idLoopCond_461) {
				} else {

					//BIle:func
					kermeta.language.structure.TypeVariable t_lbdExp78 = it_ft78
							.next();

					//BIle:func
					kermeta.language.structure.TypeVariable o_lbdExp73 = t_lbdExp78;

					o_lbdExp73.applyPass1(context);
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

		java.lang.Boolean idIfCond_462 = false;
		idIfCond_462 = kermeta.standard.helper.BooleanWrapper.not(this
				.isFunctionType());

		if (idIfCond_462) {

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

		java.lang.Boolean idIfCond_463 = false;
		idIfCond_463 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoidSwitcher(this.getSuperOperation()));

		if (idIfCond_463) {

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

		java.lang.Boolean idIfCond_464 = false;
		idIfCond_464 = kermeta.standard.helper.BooleanWrapper
				.and(
						kermeta.standard.helper.BooleanWrapper
								.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
										.isVoidSwitcher(this
												.getFunctionTypeParameter())),
						kermeta.standard.helper.IntegerWrapper.isGreater(this
								.getFunctionTypeParameter().size(), 0));

		if (idIfCond_464) {

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

		java.lang.Boolean idIfCond_465 = false;
		idIfCond_465 = this.getOwningClass().isValueType();

		if (idIfCond_465) {

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

		java.lang.Boolean idIfCond_466 = false;
		idIfCond_466 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoidSwitcher(sMContext));

		if (idIfCond_466) {

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

			java.lang.Boolean idIfCond_467 = false;
			idIfCond_467 = org.kermeta.compil.runtime.helper.language.ObjectUtil
					.isNotEqualSwitcher(this
							.getWrapperValueTypeSelfExpression(), "");

			if (idIfCond_467) {

				kermeta.utils.Hashtable<java.lang.String, java.lang.String> map_infos = kermeta.standard.helper.StringWrapper
						.getPropertyInfos(this
								.getWrapperValueTypeSelfExpression());

				java.lang.String map_value = map_infos.getValue(context
						.getCurrent_valueType().getEMFInstanceClassName());

				java.lang.Boolean idIfCond_468 = false;
				idIfCond_468 = kermeta.standard.helper.BooleanWrapper
						.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isVoidSwitcher(map_value));

				if (idIfCond_468) {

					self_param.setType(map_value);
				}

			}

			java.lang.Boolean idIfCond_469 = false;
			idIfCond_469 = org.kermeta.compil.runtime.helper.language.ObjectUtil
					.isVoidSwitcher(self_param.getType());

			if (idIfCond_469) {

				self_param.setType(context.getCurrent_valueType()
						.getEMFInstanceClassName());
			}

			org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<simk.SMParameter> convertAsOrderedSet(
							staticMethod.getSMParameters()).add(self_param);

			//BIft:each

			{

				kermeta.standard.Iterator<kermeta.language.structure.Parameter> it_ft79 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<kermeta.language.structure.Parameter> convertAsOrderedSet(
								this.getOwnedParameter()).iterator();
				java.lang.Boolean idLoopCond_470 = false;
				while (!idLoopCond_470) {
					idLoopCond_470 = it_ft79.isOff();
					if (idLoopCond_470) {
					} else {

						//BIle:func
						kermeta.language.structure.Parameter p_lbdExp79 = it_ft79
								.next();

						simk.SMParameter param = ((simk.SMParameter) org.kermeta.compil.runtime.helper.language.ClassUtil
								.newObject(simk.SimkPackage.eINSTANCE
										.getSMParameter()));

						param.setName(p_lbdExp79.getName());

						java.lang.Boolean idIfCond_471 = false;
						idIfCond_471 = kermeta.standard.helper.BooleanWrapper
								.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
										.isInstanceOfSwitcher(
												p_lbdExp79.getType(),
												org.kermeta.compil.runtime.ExecutionContext
														.getInstance()
														.getMetaClass(
																"kermeta.language.structure.FunctionType")));

						if (idIfCond_471) {

							java.lang.Boolean idIfCond_472 = false;
							idIfCond_472 = kermeta.standard.helper.BooleanWrapper
									.or(
											kermeta.standard.helper.StringWrapper
													.equals(
															p_lbdExp79
																	.getType()
																	.getTypeQName(),
															this
																	.getOwningClass()
																	.qualifiedName()),
											kermeta.standard.helper.StringWrapper
													.equals(p_lbdExp79
															.getType()
															.getTypeQName(),
															"kermeta::language::structure::Object"));

							if (idIfCond_472) {

								param.setType(context.getCurrent_valueType()
										.getEMFInstanceClassName());
							} else {

								param.setType(p_lbdExp79.getType()
										.createBehaviorJava(context));

								java.lang.Boolean idIfCond_473 = false;
								idIfCond_473 = ((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ClassUtil
										.newObject(kermeta.language.structure.StructurePackage.eINSTANCE
												.getOperation()))
										.isVoidType(param.getType());

								if (idIfCond_473) {

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

			java.lang.Boolean idIfCond_474 = false;
			idIfCond_474 = org.kermeta.compil.runtime.helper.language.ObjectUtil
					.isNotEqualSwitcher(this.getWrapperValueTypeReturnType(),
							"");

			if (idIfCond_474) {

				kermeta.utils.Hashtable<java.lang.String, java.lang.String> map_infos = kermeta.standard.helper.StringWrapper
						.getPropertyInfos(this.getWrapperValueTypeReturnType());

				java.lang.String map_value = map_infos.getValue(context
						.getCurrent_valueType().getEMFInstanceClassName());

				java.lang.Boolean idIfCond_475 = false;
				idIfCond_475 = kermeta.standard.helper.BooleanWrapper
						.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isVoidSwitcher(map_value));

				if (idIfCond_475) {

					sMReturn.setType(map_value);
				}

			}

			java.lang.Boolean idIfCond_476 = false;
			idIfCond_476 = org.kermeta.compil.runtime.helper.language.ObjectUtil
					.isVoidSwitcher(sMReturn.getType());

			if (idIfCond_476) {

				sMReturn.setType(this.getType().createBehaviorJava(context));

				java.lang.Boolean idIfCond_477 = false;
				idIfCond_477 = ((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ClassUtil
						.newObject(kermeta.language.structure.StructurePackage.eINSTANCE
								.getOperation()))
						.isVoidType(sMReturn.getType());

				if (idIfCond_477) {

					sMReturn.setType("void");
				}

			}

			staticMethod.setBody("//Protection of the following code\n");

			java.lang.Boolean idIfCond_478 = false;
			idIfCond_478 = kermeta.standard.helper.StringWrapper.equals(this
					.getName(), "equals");

			if (idIfCond_478) {

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

			java.lang.Boolean idIfCond_479 = false;
			idIfCond_479 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<java.lang.String> convertAsOrderedSet(
							context.getFrameworkOperations()).contains(
							this.getName());

			if (idIfCond_479) {

				staticMethod
						.setBody(kermeta.standard.helper.StringWrapper
								.plus(
										staticMethod.getBody(),
										"if( self == null || ((java.lang.Object) self) instanceof kermeta.language.structure.Object ) {\n"));

				java.lang.Boolean idIfCond_480 = false;
				idIfCond_480 = org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isNotEqualSwitcher(staticMethod.getSMReturn()
								.getType(), "void");

				if (idIfCond_480) {

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

					kermeta.standard.Iterator<kermeta.language.structure.Parameter> it_ft80 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
							.<kermeta.language.structure.Parameter> convertAsOrderedSet(
									this.getOwnedParameter()).iterator();
					java.lang.Boolean idLoopCond_481 = false;
					while (!idLoopCond_481) {
						idLoopCond_481 = it_ft80.isOff();
						if (idLoopCond_481) {
						} else {

							//BIle:func
							kermeta.language.structure.Parameter p_lbdExp80 = it_ft80
									.next();

							staticMethod
									.setBody(kermeta.standard.helper.StringWrapper
											.plus(
													kermeta.standard.helper.StringWrapper
															.plus(staticMethod
																	.getBody(),
																	", "),
													p_lbdExp80.getName()));
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

		java.lang.Boolean idIfCond_482 = false;
		idIfCond_482 = kermeta.standard.helper.BooleanWrapper.or(this.getType()
				.isValueType(), this.hasAValueTypedParameter());

		if (idIfCond_482) {

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

			kermeta.standard.Iterator<kermeta.language.structure.Constraint> it_ft81 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Constraint> convertAsOrderedSet(
							this.getPre()).iterator();
			java.lang.Boolean idLoopCond_483 = false;
			while (!idLoopCond_483) {
				idLoopCond_483 = it_ft81.isOff();
				if (idLoopCond_483) {
				} else {

					//BIle:func
					kermeta.language.structure.Constraint constraint_lbdExp81 = it_ft81
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
																									.oidSwitcher(constraint_lbdExp81))),
																	"__"),
													constraint_lbdExp81
															.getName()),
									"\" ) ) {\n");

					result = kermeta.standard.helper.StringWrapper.plus(result,
							"java.lang.Boolean result_pre = false;\n");

					result = kermeta.standard.helper.StringWrapper
							.plus(kermeta.standard.helper.StringWrapper.plus(
									result, constraint_lbdExp81
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

		java.lang.Boolean idIfCond_484 = false;
		idIfCond_484 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isNotEqualSwitcher(result, "");

		if (idIfCond_484) {

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

		kermeta.standard.Sequence<kermeta.language.structure.Parameter> result_ft82 = null;

		kermeta.language.structure.Parameter elem_ft82 = null;

		result_ft82 = ((kermeta.standard.Sequence<kermeta.language.structure.Parameter>) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject(kermeta.standard.StandardPackage.eINSTANCE
						.getSequence()));

		{

			kermeta.standard.Iterator<kermeta.language.structure.Parameter> it_ft82 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Parameter> convertAsOrderedSet(
							this.getOwnedParameter()).iterator();
			java.lang.Boolean idLoopCond_485 = false;
			while (!idLoopCond_485) {
				idLoopCond_485 = it_ft82.isOff();
				if (idLoopCond_485) {
				} else {

					elem_ft82 = it_ft82.next();

					java.lang.Boolean idIfCond_486 = false;
					//BIle:selector
					kermeta.language.structure.Parameter p_lbdExp82 = elem_ft82;

					idIfCond_486 = org.kermeta.compil.runtime.helper.language.ObjectUtil
							.isInstanceOfSwitcher(
									p_lbdExp82.getType(),
									org.kermeta.compil.runtime.ExecutionContext
											.getInstance()
											.getMetaClass(
													"kermeta.language.structure.FunctionType"));
					//EIle:selector

					if (idIfCond_486) {

						result_ft82.add(elem_ft82);
					}

				}
			}
		}

		//CE
		ft_parameters = result_ft82;
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

		java.lang.Boolean idIfCond_487 = false;
		idIfCond_487 = kermeta.standard.helper.BooleanWrapper
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

		if (idIfCond_487) {

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

		java.lang.Boolean idIfCond_488 = false;
		idIfCond_488 = this.getIsAbstract();

		if (idIfCond_488) {

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

		kermeta.language.structure.Parameter result_ft83 = null;

		kermeta.language.structure.Parameter elem_ft83 = null;

		result_ft83 = null;

		{

			kermeta.standard.Iterator<kermeta.language.structure.Parameter> it_ft83 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Parameter> convertAsOrderedSet(
							this.getOwnedParameter()).iterator();
			java.lang.Boolean idLoopCond_489 = false;
			while (!idLoopCond_489) {
				idLoopCond_489 = kermeta.standard.helper.BooleanWrapper.or(
						it_ft83.isOff(),
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isNotEqualSwitcher(result_ft83, null));
				if (idLoopCond_489) {
				} else {

					elem_ft83 = it_ft83.next();

					java.lang.Boolean idIfCond_490 = false;
					//BIle:detector
					kermeta.language.structure.Parameter p_lbdExp83 = elem_ft83;

					idIfCond_490 = p_lbdExp83.getType().isValueType();
					//EIle:detector

					if (idIfCond_490) {

						result_ft83 = elem_ft83;
					}

				}
			}
		}

		//CE
		p = result_ft83;
		//EIft:detect
		;

		java.lang.Boolean idIfCond_491 = false;
		idIfCond_491 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoidSwitcher(p));

		if (idIfCond_491) {

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

		java.lang.Boolean idIfCond_492 = false;
		idIfCond_492 = kermeta.standard.helper.BooleanWrapper.not(this
				.isFunctionType());

		if (idIfCond_492) {

			java.lang.Boolean idIfCond_493 = false;
			idIfCond_493 = org.kermeta.compil.runtime.helper.language.ObjectUtil
					.isVoidSwitcher(context.getCurrent_valueType());

			if (idIfCond_493) {

				this.setLinks(context);

				//BIft:eachOwnedElement

				//BIft:each

				{

					kermeta.standard.Iterator<kermeta.language.structure.Tag> it_ft85 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
							.<kermeta.language.structure.Tag> convertAsOrderedSet(
									this.getOwnedTags()).iterator();
					java.lang.Boolean idLoopCond_494 = false;
					while (!idLoopCond_494) {
						idLoopCond_494 = it_ft85.isOff();
						if (idLoopCond_494) {
						} else {

							//BIle:func
							kermeta.language.structure.Tag o_lbdExp85 = it_ft85
									.next();

							//BIle:func
							kermeta.language.structure.Tag p_lbdExp84 = o_lbdExp85;

							p_lbdExp84.applyPass2BehaviorJava(context);
							//EIle:func

							//EIle:func

						}
					}
				}

				//EIft:each

				//BIft:each

				{

					kermeta.standard.Iterator<kermeta.language.structure.Parameter> it_ft86 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
							.<kermeta.language.structure.Parameter> convertAsOrderedSet(
									this.getOwnedParameter()).iterator();
					java.lang.Boolean idLoopCond_495 = false;
					while (!idLoopCond_495) {
						idLoopCond_495 = it_ft86.isOff();
						if (idLoopCond_495) {
						} else {

							//BIle:func
							kermeta.language.structure.Parameter o_lbdExp86 = it_ft86
									.next();

							//BIle:func
							kermeta.language.structure.Parameter p_lbdExp84 = o_lbdExp86;

							p_lbdExp84.applyPass2BehaviorJava(context);
							//EIle:func

							//EIle:func

						}
					}
				}

				//EIft:each

				//BIft:each

				{

					kermeta.standard.Iterator<kermeta.language.structure.Constraint> it_ft87 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
							.<kermeta.language.structure.Constraint> convertAsOrderedSet(
									this.getPre()).iterator();
					java.lang.Boolean idLoopCond_496 = false;
					while (!idLoopCond_496) {
						idLoopCond_496 = it_ft87.isOff();
						if (idLoopCond_496) {
						} else {

							//BIle:func
							kermeta.language.structure.Constraint o_lbdExp87 = it_ft87
									.next();

							//BIle:func
							kermeta.language.structure.Constraint p_lbdExp84 = o_lbdExp87;

							p_lbdExp84.applyPass2BehaviorJava(context);
							//EIle:func

							//EIle:func

						}
					}
				}

				//EIft:each

				//BIft:each

				{

					kermeta.standard.Iterator<kermeta.language.structure.Constraint> it_ft88 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
							.<kermeta.language.structure.Constraint> convertAsOrderedSet(
									this.getPost()).iterator();
					java.lang.Boolean idLoopCond_497 = false;
					while (!idLoopCond_497) {
						idLoopCond_497 = it_ft88.isOff();
						if (idLoopCond_497) {
						} else {

							//BIle:func
							kermeta.language.structure.Constraint o_lbdExp88 = it_ft88
									.next();

							//BIle:func
							kermeta.language.structure.Constraint p_lbdExp84 = o_lbdExp88;

							p_lbdExp84.applyPass2BehaviorJava(context);
							//EIle:func

							//EIle:func

						}
					}
				}

				//EIft:each

				//BIft:each

				{

					kermeta.standard.Iterator<kermeta.language.structure.TypeVariable> it_ft89 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
							.<kermeta.language.structure.TypeVariable> convertAsOrderedSet(
									this.getTypeParameter()).iterator();
					java.lang.Boolean idLoopCond_498 = false;
					while (!idLoopCond_498) {
						idLoopCond_498 = it_ft89.isOff();
						if (idLoopCond_498) {
						} else {

							//BIle:func
							kermeta.language.structure.TypeVariable t_lbdExp89 = it_ft89
									.next();

							//BIle:func
							kermeta.language.structure.TypeVariable p_lbdExp84 = t_lbdExp89;

							p_lbdExp84.applyPass2BehaviorJava(context);
							//EIle:func

							//EIle:func

						}
					}
				}

				//EIft:each

				//EIft:eachOwnedElement

				this.createBehaviorJava(context);

				java.lang.Boolean idIfCond_499 = false;
				idIfCond_499 = this.isRunnable();

				if (idIfCond_499) {

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

						kermeta.standard.Iterator<kermeta.language.structure.Parameter> it_ft90 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
								.<kermeta.language.structure.Parameter> convertAsOrderedSet(
										this.getOwnedParameter()).iterator();
						java.lang.Boolean idLoopCond_500 = false;
						while (!idLoopCond_500) {
							idLoopCond_500 = it_ft90.isOff();
							if (idLoopCond_500) {
							} else {

								//BIle:func
								kermeta.language.structure.Parameter params_lbdExp90 = it_ft90
										.next();

								java.lang.Boolean idIfCond_501 = false;
								idIfCond_501 = kermeta.standard.helper.IntegerWrapper
										.isGreater(i, 0);

								if (idIfCond_501) {

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
	public String getRecopyInValueTypes() {

		java.lang.String result = null;

		result = this.getUniqueTagValue("RecopyInValueTypes");

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFinalName(KM2EcoreContext context) {

		java.lang.String result = null;

		result = ((km2ecore.helper.java.IdentifierHelper) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject(km2ecore.helper.java.JavaPackage.eINSTANCE
						.getIdentifierHelper())).getMangledIdentifier(this
				.getName(), context);

		java.lang.Boolean idIfCond_581 = false;
		idIfCond_581 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isNotEqualSwitcher(this.getEMFRenameAs(), "");

		if (idIfCond_581) {

			result = this.getEMFRenameAs();
		}

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEMFRenameAs() {

		java.lang.String result = null;

		result = this.getUniqueTagValue("EMF_renameAs");

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String ppReturnResult(KM2EcoreContext context) {

		java.lang.String result = null;

		result = "\nreturn ";

		java.lang.Boolean idIfCond_582 = false;
		idIfCond_582 = kermeta.standard.helper.IntegerWrapper.equals(this
				.getUpper(), 1);

		if (idIfCond_582) {

			result = kermeta.standard.helper.StringWrapper.plus(result,
					"result");
		} else {

			result = kermeta.standard.helper.StringWrapper.plus(
					kermeta.standard.helper.StringWrapper.plus(result, context
							.getCOLLECTION_UTIL_CLASS()),
					".convertAsEList(result)");
		}

		result = kermeta.standard.helper.StringWrapper.plus(result, ";\n");

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGenModelQualifiedName() {

		java.lang.String result = null;

		result = kermeta.standard.helper.StringWrapper.plus(
				kermeta.standard.helper.StringWrapper.plus(this
						.getRootPackage().getGenModelBasePackage(), "::"), this
						.qualifiedName());

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getJavaQualifiedName() {

		java.lang.String result = null;

		result = kermeta.standard.helper.StringWrapper.replace(this
				.qualifiedName(), "::", ".");

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String qualifiedName() {

		java.lang.String result = null;

		kermeta.language.structure.NamedElement elem = this;

		result = this.getName();

		java.lang.Boolean idIfCond_345 = false;
		idIfCond_345 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isInstanceOfSwitcher(
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.containerSwitcher(elem),
						org.kermeta.compil.runtime.ExecutionContext
								.getInstance()
								.getMetaClass(
										"kermeta.language.structure.NamedElement"));

		if (idIfCond_345) {

			elem = (kermeta.language.structure.NamedElement) org.kermeta.compil.runtime.helper.language.ObjectUtil
					.asTypeOrVoid(
							org.kermeta.compil.runtime.helper.language.ObjectUtil
									.containerSwitcher(elem),
							"kermeta.language.structure.NamedElement");
			java.lang.Boolean idLoopCond_346 = false;
			while (!idLoopCond_346) {
				idLoopCond_346 = org.kermeta.compil.runtime.helper.language.ObjectUtil
						.equalsSwitcher(elem, null);
				if (idLoopCond_346) {
				} else {

					result = kermeta.standard.helper.StringWrapper.plus(
							kermeta.standard.helper.StringWrapper.plus(elem
									.getName(), "::"), result);

					java.lang.Boolean idIfCond_347 = false;
					idIfCond_347 = org.kermeta.compil.runtime.helper.language.ObjectUtil
							.isInstanceOfSwitcher(
									org.kermeta.compil.runtime.helper.language.ObjectUtil
											.containerSwitcher(elem),
									org.kermeta.compil.runtime.ExecutionContext
											.getInstance()
											.getMetaClass(
													"kermeta.language.structure.NamedElement"));

					if (idIfCond_347) {

						elem = (kermeta.language.structure.NamedElement) org.kermeta.compil.runtime.helper.language.ObjectUtil
								.asTypeOrVoid(
										org.kermeta.compil.runtime.helper.language.ObjectUtil
												.containerSwitcher(elem),
										"kermeta.language.structure.NamedElement");
					} else {

						elem = null;
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
	public String getGenModelJavaQualifiedName() {

		java.lang.String result = null;

		result = kermeta.standard.helper.StringWrapper.replace(this
				.getGenModelQualifiedName(), "::", ".");

		return result;

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
		case StructurePackage.OPERATION__CONTAINED_TYPE:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getContainedType())
					.basicAdd(otherEnd, msgs);
		case StructurePackage.OPERATION__OWNED_PARAMETER:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getOwnedParameter())
					.basicAdd(otherEnd, msgs);
		case StructurePackage.OPERATION__POST:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getPost())
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
		case StructurePackage.OPERATION__CONTAINED_TYPE:
			return ((InternalEList<?>) getContainedType()).basicRemove(
					otherEnd, msgs);
		case StructurePackage.OPERATION__BODY:
			return basicSetBody(null, msgs);
		case StructurePackage.OPERATION__OWNED_PARAMETER:
			return ((InternalEList<?>) getOwnedParameter()).basicRemove(
					otherEnd, msgs);
		case StructurePackage.OPERATION__POST:
			return ((InternalEList<?>) getPost()).basicRemove(otherEnd, msgs);
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
		case StructurePackage.OPERATION__CONTAINED_TYPE:
			return getContainedType();
		case StructurePackage.OPERATION__NAME:
			return getName();
		case StructurePackage.OPERATION__TYPE:
			if (resolve)
				return getType();
			return basicGetType();
		case StructurePackage.OPERATION__IS_ORDERED:
			return getIsOrdered();
		case StructurePackage.OPERATION__UPPER:
			return getUpper();
		case StructurePackage.OPERATION__LOWER:
			return getLower();
		case StructurePackage.OPERATION__IS_UNIQUE:
			return getIsUnique();
		case StructurePackage.OPERATION__TYPE_PARAMETER:
			return getTypeParameter();
		case StructurePackage.OPERATION__BODY:
			if (resolve)
				return getBody();
			return basicGetBody();
		case StructurePackage.OPERATION__CUID:
			return getCuid();
		case StructurePackage.OPERATION__OWNED_PARAMETER:
			return getOwnedParameter();
		case StructurePackage.OPERATION__IS_ABSTRACT:
			return getIsAbstract();
		case StructurePackage.OPERATION__POST:
			return getPost();
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
		case StructurePackage.OPERATION__CONTAINED_TYPE:
			getContainedType().clear();
			getContainedType().addAll((Collection<? extends Type>) newValue);
			return;
		case StructurePackage.OPERATION__NAME:
			setName((String) newValue);
			return;
		case StructurePackage.OPERATION__TYPE:
			setType((Type) newValue);
			return;
		case StructurePackage.OPERATION__IS_ORDERED:
			setIsOrdered((Boolean) newValue);
			return;
		case StructurePackage.OPERATION__UPPER:
			setUpper((Integer) newValue);
			return;
		case StructurePackage.OPERATION__LOWER:
			setLower((Integer) newValue);
			return;
		case StructurePackage.OPERATION__IS_UNIQUE:
			setIsUnique((Boolean) newValue);
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
		case StructurePackage.OPERATION__OWNED_PARAMETER:
			getOwnedParameter().clear();
			getOwnedParameter().addAll(
					(Collection<? extends Parameter>) newValue);
			return;
		case StructurePackage.OPERATION__IS_ABSTRACT:
			setIsAbstract((Boolean) newValue);
			return;
		case StructurePackage.OPERATION__POST:
			getPost().clear();
			getPost().addAll((Collection<? extends Constraint>) newValue);
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
		case StructurePackage.OPERATION__CONTAINED_TYPE:
			getContainedType().clear();
			return;
		case StructurePackage.OPERATION__NAME:
			setName(NAME_EDEFAULT);
			return;
		case StructurePackage.OPERATION__TYPE:
			setType((Type) null);
			return;
		case StructurePackage.OPERATION__IS_ORDERED:
			setIsOrdered(IS_ORDERED_EDEFAULT);
			return;
		case StructurePackage.OPERATION__UPPER:
			setUpper(UPPER_EDEFAULT);
			return;
		case StructurePackage.OPERATION__LOWER:
			setLower(LOWER_EDEFAULT);
			return;
		case StructurePackage.OPERATION__IS_UNIQUE:
			setIsUnique(IS_UNIQUE_EDEFAULT);
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
		case StructurePackage.OPERATION__OWNED_PARAMETER:
			getOwnedParameter().clear();
			return;
		case StructurePackage.OPERATION__IS_ABSTRACT:
			setIsAbstract(IS_ABSTRACT_EDEFAULT);
			return;
		case StructurePackage.OPERATION__POST:
			getPost().clear();
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
		case StructurePackage.OPERATION__CONTAINED_TYPE:
			return containedType != null && !containedType.isEmpty();
		case StructurePackage.OPERATION__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT
					.equals(name);
		case StructurePackage.OPERATION__TYPE:
			return type != null;
		case StructurePackage.OPERATION__IS_ORDERED:
			return IS_ORDERED_EDEFAULT == null ? isOrdered != null
					: !IS_ORDERED_EDEFAULT.equals(isOrdered);
		case StructurePackage.OPERATION__UPPER:
			return UPPER_EDEFAULT == null ? upper != null : !UPPER_EDEFAULT
					.equals(upper);
		case StructurePackage.OPERATION__LOWER:
			return LOWER_EDEFAULT == null ? lower != null : !LOWER_EDEFAULT
					.equals(lower);
		case StructurePackage.OPERATION__IS_UNIQUE:
			return IS_UNIQUE_EDEFAULT == null ? isUnique != null
					: !IS_UNIQUE_EDEFAULT.equals(isUnique);
		case StructurePackage.OPERATION__TYPE_PARAMETER:
			return typeParameter != null && !typeParameter.isEmpty();
		case StructurePackage.OPERATION__BODY:
			return body != null;
		case StructurePackage.OPERATION__CUID:
			return CUID_EDEFAULT == null ? cuid != null : !CUID_EDEFAULT
					.equals(cuid);
		case StructurePackage.OPERATION__OWNED_PARAMETER:
			return ownedParameter != null && !ownedParameter.isEmpty();
		case StructurePackage.OPERATION__IS_ABSTRACT:
			return IS_ABSTRACT_EDEFAULT == null ? isAbstract != null
					: !IS_ABSTRACT_EDEFAULT.equals(isAbstract);
		case StructurePackage.OPERATION__POST:
			return post != null && !post.isEmpty();
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
		if (baseClass == TypeContainer.class) {
			switch (derivedFeatureID) {
			case StructurePackage.OPERATION__CONTAINED_TYPE:
				return StructurePackage.TYPE_CONTAINER__CONTAINED_TYPE;
			default:
				return -1;
			}
		}
		if (baseClass == NamedElement.class) {
			switch (derivedFeatureID) {
			case StructurePackage.OPERATION__NAME:
				return StructurePackage.NAMED_ELEMENT__NAME;
			default:
				return -1;
			}
		}
		if (baseClass == TypedElement.class) {
			switch (derivedFeatureID) {
			case StructurePackage.OPERATION__TYPE:
				return StructurePackage.TYPED_ELEMENT__TYPE;
			default:
				return -1;
			}
		}
		if (baseClass == MultiplicityElement.class) {
			switch (derivedFeatureID) {
			case StructurePackage.OPERATION__IS_ORDERED:
				return StructurePackage.MULTIPLICITY_ELEMENT__IS_ORDERED;
			case StructurePackage.OPERATION__UPPER:
				return StructurePackage.MULTIPLICITY_ELEMENT__UPPER;
			case StructurePackage.OPERATION__LOWER:
				return StructurePackage.MULTIPLICITY_ELEMENT__LOWER;
			case StructurePackage.OPERATION__IS_UNIQUE:
				return StructurePackage.MULTIPLICITY_ELEMENT__IS_UNIQUE;
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
		if (baseClass == TypeContainer.class) {
			switch (baseFeatureID) {
			case StructurePackage.TYPE_CONTAINER__CONTAINED_TYPE:
				return StructurePackage.OPERATION__CONTAINED_TYPE;
			default:
				return -1;
			}
		}
		if (baseClass == NamedElement.class) {
			switch (baseFeatureID) {
			case StructurePackage.NAMED_ELEMENT__NAME:
				return StructurePackage.OPERATION__NAME;
			default:
				return -1;
			}
		}
		if (baseClass == TypedElement.class) {
			switch (baseFeatureID) {
			case StructurePackage.TYPED_ELEMENT__TYPE:
				return StructurePackage.OPERATION__TYPE;
			default:
				return -1;
			}
		}
		if (baseClass == MultiplicityElement.class) {
			switch (baseFeatureID) {
			case StructurePackage.MULTIPLICITY_ELEMENT__IS_ORDERED:
				return StructurePackage.OPERATION__IS_ORDERED;
			case StructurePackage.MULTIPLICITY_ELEMENT__UPPER:
				return StructurePackage.OPERATION__UPPER;
			case StructurePackage.MULTIPLICITY_ELEMENT__LOWER:
				return StructurePackage.OPERATION__LOWER;
			case StructurePackage.MULTIPLICITY_ELEMENT__IS_UNIQUE:
				return StructurePackage.OPERATION__IS_UNIQUE;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", isOrdered: ");
		result.append(isOrdered);
		result.append(", upper: ");
		result.append(upper);
		result.append(", lower: ");
		result.append(lower);
		result.append(", isUnique: ");
		result.append(isUnique);
		result.append(", cuid: ");
		result.append(cuid);
		result.append(", isAbstract: ");
		result.append(isAbstract);
		result.append(')');
		return result.toString();
	}

} //OperationImpl
