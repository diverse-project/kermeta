/**
 * <copyright>
 * </copyright>
 *
 * $Id: OperationImpl.java,v 1.9 2008-11-27 15:49:49 cfaucher Exp $
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
	public String createBehaviorJava(KM2EcoreContext context) {

		java.lang.String result = null;

		result = null;

		kermeta.utils.StringBuffer javaCode = ((kermeta.utils.StringBuffer) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject("kermeta.utils.StringBuffer"));

		java.lang.Boolean idIfCond_72 = false;
		idIfCond_72 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoidSwitcher(this.getBody()));

		if (idIfCond_72) {

			java.lang.String type_label = "";

			java.lang.Boolean idIfCond_73 = false;
			idIfCond_73 = context.getFtSuffixActivation();

			if (idIfCond_73) {

				type_label = context.getFtReturnType();

				context.setFtReturnType("");
			} else {

				type_label = ((km2ecore.helper.kermeta.CompilerHelperJava) org.kermeta.compil.runtime.helper.language.ClassUtil
						.newObject("km2ecore.helper.kermeta.CompilerHelperJava"))
						.ppTypeFromMultiplicityElement(this, context);
			}

			java.lang.Boolean idIfCond_74 = false;
			idIfCond_74 = kermeta.standard.helper.BooleanWrapper.not(this
					.isVoidType(type_label));

			if (idIfCond_74) {

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

			java.lang.Boolean idIfCond_75 = false;
			idIfCond_75 = kermeta.standard.helper.BooleanWrapper.and(
					kermeta.standard.helper.BooleanWrapper.not(this
							.isVoidType(type_label)),
					kermeta.standard.helper.BooleanWrapper.not(context
							.getFtSuffixActivation()));

			if (idIfCond_75) {

				javaCode.append(this.ppReturnResult(context));
			}

		} else {

			java.lang.Boolean idIfCond_76 = false;
			idIfCond_76 = kermeta.standard.helper.BooleanWrapper
					.not(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ClassUtil
							.newObject("kermeta.language.structure.Operation"))
							.isVoidType(this.getType().getTypeQName()));

			if (idIfCond_76) {

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

		java.lang.Boolean idIfCond_77 = false;
		idIfCond_77 = kermeta.standard.helper.BooleanWrapper.and(
				org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isNotEqualSwitcher(context.getTasks_stack().peek(),
								context.getFUNCTION_TYPE_COMPILATION_TASK()),
				org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoidSwitcher(context.getCurrent_valueType()));

		if (idIfCond_77) {

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
	public Boolean isRunnable() {

		java.lang.Boolean result = null;

		result = false;

		kermeta.language.structure.Parameter param = null;
		//BIft:detect

		kermeta.language.structure.Parameter result_ft17 = null;

		kermeta.language.structure.Parameter elem_ft17 = null;

		result_ft17 = null;

		{

			kermeta.standard.Iterator<kermeta.language.structure.Parameter> it_ft17 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Parameter> convertAsOrderedSet(
							this.getOwnedParameter()).iterator();
			java.lang.Boolean idLoopCond_78 = false;
			while (!idLoopCond_78) {
				idLoopCond_78 = kermeta.standard.helper.BooleanWrapper.or(
						it_ft17.isOff(),
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isNotEqualSwitcher(result_ft17, null));
				if (idLoopCond_78) {
				} else {

					elem_ft17 = it_ft17.next();

					java.lang.Boolean idIfCond_79 = false;
					//BIle:detector
					kermeta.language.structure.Parameter param_lbdExp17 = elem_ft17;

					idIfCond_79 = kermeta.standard.helper.BooleanWrapper
							.not(param_lbdExp17.isRunnable());
					//EIle:detector

					if (idIfCond_79) {

						result_ft17 = elem_ft17;
					}

				}
			}
		}

		//CE
		param = result_ft17;
		//EIft:detect

		java.lang.Boolean idIfCond_80 = false;
		idIfCond_80 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isVoidSwitcher(param);

		if (idIfCond_80) {

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

		java.lang.Boolean idIfCond_81 = false;
		idIfCond_81 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isInstanceOfSwitcher(this.getBody(),
						org.kermeta.compil.runtime.ExecutionContext
								.getInstance().getMetaClass(
										"kermeta.language.behavior.Block"));

		if (idIfCond_81) {

			java.lang.Boolean idIfCond_82 = false;
			idIfCond_82 = kermeta.standard.helper.IntegerWrapper
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

			if (idIfCond_82) {

				java.lang.Boolean idIfCond_83 = false;
				idIfCond_83 = org.kermeta.compil.runtime.helper.language.ObjectUtil
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

				if (idIfCond_83) {

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

					java.lang.Boolean idIfCond_84 = false;
					idIfCond_84 = org.kermeta.compil.runtime.helper.language.ObjectUtil
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

					if (idIfCond_84) {

						java.lang.Boolean idIfCond_85 = false;
						idIfCond_85 = org.kermeta.compil.runtime.helper.language.ObjectUtil
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

						if (idIfCond_85) {

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

		java.lang.Boolean idIfCond_86 = false;
		idIfCond_86 = cd_container.isValueType();

		if (idIfCond_86) {

			java.lang.Boolean idIfCond_87 = false;
			idIfCond_87 = org.kermeta.compil.runtime.helper.language.ObjectUtil
					.isNotEqualSwitcher(cd_container.getEMFInstanceClassName(),
							"");

			if (idIfCond_87) {

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

			kermeta.standard.Iterator<kermeta.language.structure.Constraint> it_ft18 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Constraint> convertAsOrderedSet(
							this.getPost()).iterator();
			java.lang.Boolean idLoopCond_88 = false;
			while (!idLoopCond_88) {
				idLoopCond_88 = it_ft18.isOff();
				if (idLoopCond_88) {
				} else {

					//BIle:func
					kermeta.language.structure.Constraint constraint_lbdExp18 = it_ft18
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
																									.oidSwitcher(constraint_lbdExp18))),
																	"__"),
													constraint_lbdExp18
															.getName()),
									"\" ) ) {\n");

					result = kermeta.standard.helper.StringWrapper.plus(result,
							"java.lang.Boolean result_post = false;\n");

					result = kermeta.standard.helper.StringWrapper
							.plus(kermeta.standard.helper.StringWrapper.plus(
									result, constraint_lbdExp18
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

		java.lang.Boolean idIfCond_89 = false;
		idIfCond_89 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isNotEqualSwitcher(result, "");

		if (idIfCond_89) {

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

		c = (kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.ExecutionContext
				.getInstance()
				.<kermeta.language.structure.ClassDefinition> asTypeOrVoid(
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.containerSwitcher(this));

		org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
				.<ecore.EOperation> convertAsOrderedSet(
						c.getEcoreModelElement().getEOperations()).add(
						ecoreOperation);

		this.setEcoreModelElement(ecoreOperation);

		//BIft:eachOwnedElement

		//BIft:each

		{

			kermeta.standard.Iterator<kermeta.language.structure.Tag> it_ft20 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Tag> convertAsOrderedSet(
							this.getOwnedTags()).iterator();
			java.lang.Boolean idLoopCond_90 = false;
			while (!idLoopCond_90) {
				idLoopCond_90 = it_ft20.isOff();
				if (idLoopCond_90) {
				} else {

					//BIle:func
					kermeta.language.structure.Tag o_lbdExp20 = it_ft20.next();

					//BIle:func
					kermeta.language.structure.Tag o_lbdExp19 = o_lbdExp20;

					o_lbdExp19.applyPass1(context);
					//EIle:func

					//EIle:func

				}
			}
		}

		//EIft:each

		//BIft:each

		{

			kermeta.standard.Iterator<kermeta.language.structure.Parameter> it_ft21 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Parameter> convertAsOrderedSet(
							this.getOwnedParameter()).iterator();
			java.lang.Boolean idLoopCond_91 = false;
			while (!idLoopCond_91) {
				idLoopCond_91 = it_ft21.isOff();
				if (idLoopCond_91) {
				} else {

					//BIle:func
					kermeta.language.structure.Parameter o_lbdExp21 = it_ft21
							.next();

					//BIle:func
					kermeta.language.structure.Parameter o_lbdExp19 = o_lbdExp21;

					o_lbdExp19.applyPass1(context);
					//EIle:func

					//EIle:func

				}
			}
		}

		//EIft:each

		//BIft:each

		{

			kermeta.standard.Iterator<kermeta.language.structure.Constraint> it_ft22 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Constraint> convertAsOrderedSet(
							this.getPre()).iterator();
			java.lang.Boolean idLoopCond_92 = false;
			while (!idLoopCond_92) {
				idLoopCond_92 = it_ft22.isOff();
				if (idLoopCond_92) {
				} else {

					//BIle:func
					kermeta.language.structure.Constraint o_lbdExp22 = it_ft22
							.next();

					//BIle:func
					kermeta.language.structure.Constraint o_lbdExp19 = o_lbdExp22;

					o_lbdExp19.applyPass1(context);
					//EIle:func

					//EIle:func

				}
			}
		}

		//EIft:each

		//BIft:each

		{

			kermeta.standard.Iterator<kermeta.language.structure.Constraint> it_ft23 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Constraint> convertAsOrderedSet(
							this.getPost()).iterator();
			java.lang.Boolean idLoopCond_93 = false;
			while (!idLoopCond_93) {
				idLoopCond_93 = it_ft23.isOff();
				if (idLoopCond_93) {
				} else {

					//BIle:func
					kermeta.language.structure.Constraint o_lbdExp23 = it_ft23
							.next();

					//BIle:func
					kermeta.language.structure.Constraint o_lbdExp19 = o_lbdExp23;

					o_lbdExp19.applyPass1(context);
					//EIle:func

					//EIle:func

				}
			}
		}

		//EIft:each

		//BIft:each

		{

			kermeta.standard.Iterator<kermeta.language.structure.TypeVariable> it_ft24 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.TypeVariable> convertAsOrderedSet(
							this.getTypeParameter()).iterator();
			java.lang.Boolean idLoopCond_94 = false;
			while (!idLoopCond_94) {
				idLoopCond_94 = it_ft24.isOff();
				if (idLoopCond_94) {
				} else {

					//BIle:func
					kermeta.language.structure.TypeVariable t_lbdExp24 = it_ft24
							.next();

					//BIle:func
					kermeta.language.structure.TypeVariable o_lbdExp19 = t_lbdExp24;

					o_lbdExp19.applyPass1(context);
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

		java.lang.Boolean idIfCond_95 = false;
		idIfCond_95 = kermeta.standard.helper.BooleanWrapper.not(this
				.isFunctionType());

		if (idIfCond_95) {

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

		java.lang.Boolean idIfCond_96 = false;
		idIfCond_96 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoidSwitcher(this.getSuperOperation()));

		if (idIfCond_96) {

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

		java.lang.Boolean idIfCond_97 = false;
		idIfCond_97 = kermeta.standard.helper.BooleanWrapper
				.and(
						kermeta.standard.helper.BooleanWrapper
								.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
										.isVoidSwitcher(this
												.getFunctionTypeParameter())),
						kermeta.standard.helper.IntegerWrapper.isGreater(this
								.getFunctionTypeParameter().size(), 0));

		if (idIfCond_97) {

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

		java.lang.Boolean idIfCond_98 = false;
		idIfCond_98 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoidSwitcher(sMContext));

		if (idIfCond_98) {

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

			java.lang.Boolean idIfCond_99 = false;
			idIfCond_99 = org.kermeta.compil.runtime.helper.language.ObjectUtil
					.isNotEqualSwitcher(this
							.getWrapperValueTypeSelfExpression(), "");

			if (idIfCond_99) {

				kermeta.utils.Hashtable<java.lang.String, java.lang.String> map_infos = kermeta.standard.helper.StringWrapper
						.getPropertyInfos(this
								.getWrapperValueTypeSelfExpression());

				java.lang.String map_value = map_infos.getValue(context
						.getCurrent_valueType().getEMFInstanceClassName());

				java.lang.Boolean idIfCond_100 = false;
				idIfCond_100 = kermeta.standard.helper.BooleanWrapper
						.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isVoidSwitcher(map_value));

				if (idIfCond_100) {

					self_param.setType(map_value);
				}

			}

			java.lang.Boolean idIfCond_101 = false;
			idIfCond_101 = org.kermeta.compil.runtime.helper.language.ObjectUtil
					.isVoidSwitcher(self_param.getType());

			if (idIfCond_101) {

				self_param.setType(context.getCurrent_valueType()
						.getEMFInstanceClassName());
			}

			org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<simk.SMParameter> convertAsOrderedSet(
							staticMethod.getSMParameters()).add(self_param);

			//BIft:each

			{

				kermeta.standard.Iterator<kermeta.language.structure.Parameter> it_ft25 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<kermeta.language.structure.Parameter> convertAsOrderedSet(
								this.getOwnedParameter()).iterator();
				java.lang.Boolean idLoopCond_102 = false;
				while (!idLoopCond_102) {
					idLoopCond_102 = it_ft25.isOff();
					if (idLoopCond_102) {
					} else {

						//BIle:func
						kermeta.language.structure.Parameter p_lbdExp25 = it_ft25
								.next();

						simk.SMParameter param = ((simk.SMParameter) org.kermeta.compil.runtime.helper.language.ClassUtil
								.newObject("simk.SMParameter"));

						param.setName(p_lbdExp25.getName());

						java.lang.Boolean idIfCond_103 = false;
						idIfCond_103 = kermeta.standard.helper.BooleanWrapper
								.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
										.isInstanceOfSwitcher(
												p_lbdExp25.getType(),
												org.kermeta.compil.runtime.ExecutionContext
														.getInstance()
														.getMetaClass(
																"kermeta.language.structure.FunctionType")));

						if (idIfCond_103) {

							java.lang.Boolean idIfCond_104 = false;
							idIfCond_104 = kermeta.standard.helper.BooleanWrapper
									.or(
											kermeta.standard.helper.StringWrapper
													.equals(
															p_lbdExp25
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
													.equals(p_lbdExp25
															.getType()
															.getTypeQName(),
															"kermeta::language::structure::Object"));

							if (idIfCond_104) {

								param.setType(context.getCurrent_valueType()
										.getEMFInstanceClassName());
							} else {

								param.setType(p_lbdExp25.getType()
										.createBehaviorJava(context));

								java.lang.Boolean idIfCond_105 = false;
								idIfCond_105 = ((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ClassUtil
										.newObject("kermeta.language.structure.Operation"))
										.isVoidType(param.getType());

								if (idIfCond_105) {

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

			java.lang.Boolean idIfCond_106 = false;
			idIfCond_106 = org.kermeta.compil.runtime.helper.language.ObjectUtil
					.isNotEqualSwitcher(this.getWrapperValueTypeReturnType(),
							"");

			if (idIfCond_106) {

				kermeta.utils.Hashtable<java.lang.String, java.lang.String> map_infos = kermeta.standard.helper.StringWrapper
						.getPropertyInfos(this.getWrapperValueTypeReturnType());

				java.lang.String map_value = map_infos.getValue(context
						.getCurrent_valueType().getEMFInstanceClassName());

				java.lang.Boolean idIfCond_107 = false;
				idIfCond_107 = kermeta.standard.helper.BooleanWrapper
						.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isVoidSwitcher(map_value));

				if (idIfCond_107) {

					sMReturn.setType(map_value);
				}

			}

			java.lang.Boolean idIfCond_108 = false;
			idIfCond_108 = org.kermeta.compil.runtime.helper.language.ObjectUtil
					.isVoidSwitcher(sMReturn.getType());

			if (idIfCond_108) {

				sMReturn.setType(this.getType().createBehaviorJava(context));

				java.lang.Boolean idIfCond_109 = false;
				idIfCond_109 = ((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ClassUtil
						.newObject("kermeta.language.structure.Operation"))
						.isVoidType(sMReturn.getType());

				if (idIfCond_109) {

					sMReturn.setType("void");
				}

			}

			staticMethod.setBody("//Protection of the following code\n");

			java.lang.Boolean idIfCond_110 = false;
			idIfCond_110 = kermeta.standard.helper.StringWrapper.equals(this
					.getName(), "equals");

			if (idIfCond_110) {

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

			java.lang.Boolean idIfCond_111 = false;
			idIfCond_111 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<java.lang.String> convertAsOrderedSet(
							context.getFrameworkOperations()).contains(
							this.getName());

			if (idIfCond_111) {

				staticMethod
						.setBody(kermeta.standard.helper.StringWrapper
								.plus(
										staticMethod.getBody(),
										"if( self == null || ((java.lang.Object) self) instanceof kermeta.language.structure.Object ) {\n"));

				java.lang.Boolean idIfCond_112 = false;
				idIfCond_112 = org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isNotEqualSwitcher(staticMethod.getSMReturn()
								.getType(), "void");

				if (idIfCond_112) {

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

					kermeta.standard.Iterator<kermeta.language.structure.Parameter> it_ft26 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
							.<kermeta.language.structure.Parameter> convertAsOrderedSet(
									this.getOwnedParameter()).iterator();
					java.lang.Boolean idLoopCond_113 = false;
					while (!idLoopCond_113) {
						idLoopCond_113 = it_ft26.isOff();
						if (idLoopCond_113) {
						} else {

							//BIle:func
							kermeta.language.structure.Parameter p_lbdExp26 = it_ft26
									.next();

							staticMethod
									.setBody(kermeta.standard.helper.StringWrapper
											.plus(
													kermeta.standard.helper.StringWrapper
															.plus(staticMethod
																	.getBody(),
																	", "),
													p_lbdExp26.getName()));
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

		java.lang.Boolean idIfCond_114 = false;
		idIfCond_114 = kermeta.standard.helper.BooleanWrapper.or(this.getType()
				.isValueType(), this.hasAValueTypedParameter());

		if (idIfCond_114) {

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

			kermeta.standard.Iterator<kermeta.language.structure.Constraint> it_ft27 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Constraint> convertAsOrderedSet(
							this.getPre()).iterator();
			java.lang.Boolean idLoopCond_115 = false;
			while (!idLoopCond_115) {
				idLoopCond_115 = it_ft27.isOff();
				if (idLoopCond_115) {
				} else {

					//BIle:func
					kermeta.language.structure.Constraint constraint_lbdExp27 = it_ft27
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
																									.oidSwitcher(constraint_lbdExp27))),
																	"__"),
													constraint_lbdExp27
															.getName()),
									"\" ) ) {\n");

					result = kermeta.standard.helper.StringWrapper.plus(result,
							"java.lang.Boolean result_pre = false;\n");

					result = kermeta.standard.helper.StringWrapper
							.plus(kermeta.standard.helper.StringWrapper.plus(
									result, constraint_lbdExp27
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

		java.lang.Boolean idIfCond_116 = false;
		idIfCond_116 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isNotEqualSwitcher(result, "");

		if (idIfCond_116) {

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

		kermeta.standard.Sequence<kermeta.language.structure.Parameter> result_ft28 = null;

		kermeta.language.structure.Parameter elem_ft28 = null;

		result_ft28 = ((kermeta.standard.Sequence<kermeta.language.structure.Parameter>) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject("kermeta.standard.Sequence<kermeta.language.structure.Parameter>"));

		{

			kermeta.standard.Iterator<kermeta.language.structure.Parameter> it_ft28 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Parameter> convertAsOrderedSet(
							this.getOwnedParameter()).iterator();
			java.lang.Boolean idLoopCond_117 = false;
			while (!idLoopCond_117) {
				idLoopCond_117 = it_ft28.isOff();
				if (idLoopCond_117) {
				} else {

					elem_ft28 = it_ft28.next();

					java.lang.Boolean idIfCond_118 = false;
					//BIle:selector
					kermeta.language.structure.Parameter p_lbdExp28 = elem_ft28;

					idIfCond_118 = org.kermeta.compil.runtime.helper.language.ObjectUtil
							.isInstanceOfSwitcher(
									p_lbdExp28.getType(),
									org.kermeta.compil.runtime.ExecutionContext
											.getInstance()
											.getMetaClass(
													"kermeta.language.structure.FunctionType"));
					//EIle:selector

					if (idIfCond_118) {

						result_ft28.add(elem_ft28);
					}

				}
			}
		}

		//CE
		ft_parameters = result_ft28;
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

		java.lang.Boolean idIfCond_119 = false;
		idIfCond_119 = kermeta.standard.helper.BooleanWrapper
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

		if (idIfCond_119) {

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

		java.lang.Boolean idIfCond_120 = false;
		idIfCond_120 = this.getIsAbstract();

		if (idIfCond_120) {

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

		kermeta.language.structure.Parameter result_ft29 = null;

		kermeta.language.structure.Parameter elem_ft29 = null;

		result_ft29 = null;

		{

			kermeta.standard.Iterator<kermeta.language.structure.Parameter> it_ft29 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Parameter> convertAsOrderedSet(
							this.getOwnedParameter()).iterator();
			java.lang.Boolean idLoopCond_121 = false;
			while (!idLoopCond_121) {
				idLoopCond_121 = kermeta.standard.helper.BooleanWrapper.or(
						it_ft29.isOff(),
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isNotEqualSwitcher(result_ft29, null));
				if (idLoopCond_121) {
				} else {

					elem_ft29 = it_ft29.next();

					java.lang.Boolean idIfCond_122 = false;
					//BIle:detector
					kermeta.language.structure.Parameter p_lbdExp29 = elem_ft29;

					idIfCond_122 = p_lbdExp29.getType().isValueType();
					//EIle:detector

					if (idIfCond_122) {

						result_ft29 = elem_ft29;
					}

				}
			}
		}

		//CE
		p = result_ft29;
		//EIft:detect

		java.lang.Boolean idIfCond_123 = false;
		idIfCond_123 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoidSwitcher(p));

		if (idIfCond_123) {

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

		java.lang.Boolean idIfCond_124 = false;
		idIfCond_124 = kermeta.standard.helper.BooleanWrapper.not(this
				.isFunctionType());

		if (idIfCond_124) {

			java.lang.Boolean idIfCond_125 = false;
			idIfCond_125 = org.kermeta.compil.runtime.helper.language.ObjectUtil
					.isVoidSwitcher(context.getCurrent_valueType());

			if (idIfCond_125) {

				this.setLinks(context);

				//BIft:eachOwnedElement

				//BIft:each

				{

					kermeta.standard.Iterator<kermeta.language.structure.Tag> it_ft31 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
							.<kermeta.language.structure.Tag> convertAsOrderedSet(
									this.getOwnedTags()).iterator();
					java.lang.Boolean idLoopCond_126 = false;
					while (!idLoopCond_126) {
						idLoopCond_126 = it_ft31.isOff();
						if (idLoopCond_126) {
						} else {

							//BIle:func
							kermeta.language.structure.Tag o_lbdExp31 = it_ft31
									.next();

							//BIle:func
							kermeta.language.structure.Tag p_lbdExp30 = o_lbdExp31;

							p_lbdExp30.applyPass2BehaviorJava(context);
							//EIle:func

							//EIle:func

						}
					}
				}

				//EIft:each

				//BIft:each

				{

					kermeta.standard.Iterator<kermeta.language.structure.Parameter> it_ft32 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
							.<kermeta.language.structure.Parameter> convertAsOrderedSet(
									this.getOwnedParameter()).iterator();
					java.lang.Boolean idLoopCond_127 = false;
					while (!idLoopCond_127) {
						idLoopCond_127 = it_ft32.isOff();
						if (idLoopCond_127) {
						} else {

							//BIle:func
							kermeta.language.structure.Parameter o_lbdExp32 = it_ft32
									.next();

							//BIle:func
							kermeta.language.structure.Parameter p_lbdExp30 = o_lbdExp32;

							p_lbdExp30.applyPass2BehaviorJava(context);
							//EIle:func

							//EIle:func

						}
					}
				}

				//EIft:each

				//BIft:each

				{

					kermeta.standard.Iterator<kermeta.language.structure.Constraint> it_ft33 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
							.<kermeta.language.structure.Constraint> convertAsOrderedSet(
									this.getPre()).iterator();
					java.lang.Boolean idLoopCond_128 = false;
					while (!idLoopCond_128) {
						idLoopCond_128 = it_ft33.isOff();
						if (idLoopCond_128) {
						} else {

							//BIle:func
							kermeta.language.structure.Constraint o_lbdExp33 = it_ft33
									.next();

							//BIle:func
							kermeta.language.structure.Constraint p_lbdExp30 = o_lbdExp33;

							p_lbdExp30.applyPass2BehaviorJava(context);
							//EIle:func

							//EIle:func

						}
					}
				}

				//EIft:each

				//BIft:each

				{

					kermeta.standard.Iterator<kermeta.language.structure.Constraint> it_ft34 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
							.<kermeta.language.structure.Constraint> convertAsOrderedSet(
									this.getPost()).iterator();
					java.lang.Boolean idLoopCond_129 = false;
					while (!idLoopCond_129) {
						idLoopCond_129 = it_ft34.isOff();
						if (idLoopCond_129) {
						} else {

							//BIle:func
							kermeta.language.structure.Constraint o_lbdExp34 = it_ft34
									.next();

							//BIle:func
							kermeta.language.structure.Constraint p_lbdExp30 = o_lbdExp34;

							p_lbdExp30.applyPass2BehaviorJava(context);
							//EIle:func

							//EIle:func

						}
					}
				}

				//EIft:each

				//BIft:each

				{

					kermeta.standard.Iterator<kermeta.language.structure.TypeVariable> it_ft35 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
							.<kermeta.language.structure.TypeVariable> convertAsOrderedSet(
									this.getTypeParameter()).iterator();
					java.lang.Boolean idLoopCond_130 = false;
					while (!idLoopCond_130) {
						idLoopCond_130 = it_ft35.isOff();
						if (idLoopCond_130) {
						} else {

							//BIle:func
							kermeta.language.structure.TypeVariable t_lbdExp35 = it_ft35
									.next();

							//BIle:func
							kermeta.language.structure.TypeVariable p_lbdExp30 = t_lbdExp35;

							p_lbdExp30.applyPass2BehaviorJava(context);
							//EIle:func

							//EIle:func

						}
					}
				}

				//EIft:each

				//EIft:eachOwnedElement

				this.createBehaviorJava(context);

				java.lang.Boolean idIfCond_131 = false;
				idIfCond_131 = this.isRunnable();

				if (idIfCond_131) {

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

						kermeta.standard.Iterator<kermeta.language.structure.Parameter> it_ft36 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
								.<kermeta.language.structure.Parameter> convertAsOrderedSet(
										this.getOwnedParameter()).iterator();
						java.lang.Boolean idLoopCond_132 = false;
						while (!idLoopCond_132) {
							idLoopCond_132 = it_ft36.isOff();
							if (idLoopCond_132) {
							} else {

								//BIle:func
								kermeta.language.structure.Parameter params_lbdExp36 = it_ft36
										.next();

								java.lang.Boolean idIfCond_133 = false;
								idIfCond_133 = kermeta.standard.helper.IntegerWrapper
										.isGreater(i, 0);

								if (idIfCond_133) {

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
				.newObject("km2ecore.helper.java.IdentifierHelper"))
				.getMangledIdentifier(this.getName(), context);

		java.lang.Boolean idIfCond_41 = false;
		idIfCond_41 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isNotEqualSwitcher(this.getEMFRenameAs(), "");

		if (idIfCond_41) {

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

		java.lang.Boolean idIfCond_42 = false;
		idIfCond_42 = kermeta.standard.helper.IntegerWrapper.equals(this
				.getUpper(), 1);

		if (idIfCond_42) {

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
	public String qualifiedName() {

		java.lang.String result = null;

		kermeta.language.structure.NamedElement elem = this;

		result = this.getName();

		java.lang.Boolean idIfCond_369 = false;
		idIfCond_369 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isInstanceOfSwitcher(
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.containerSwitcher(elem),
						org.kermeta.compil.runtime.ExecutionContext
								.getInstance()
								.getMetaClass(
										"kermeta.language.structure.NamedElement"));

		if (idIfCond_369) {

			elem = (kermeta.language.structure.NamedElement) org.kermeta.compil.runtime.ExecutionContext
					.getInstance()
					.<kermeta.language.structure.NamedElement> asTypeOrVoid(
							org.kermeta.compil.runtime.helper.language.ObjectUtil
									.containerSwitcher(elem));
			java.lang.Boolean idLoopCond_370 = false;
			while (!idLoopCond_370) {
				idLoopCond_370 = org.kermeta.compil.runtime.helper.language.ObjectUtil
						.equalsSwitcher(elem, null);
				if (idLoopCond_370) {
				} else {

					result = kermeta.standard.helper.StringWrapper.plus(
							kermeta.standard.helper.StringWrapper.plus(elem
									.getName(), "::"), result);

					java.lang.Boolean idIfCond_371 = false;
					idIfCond_371 = org.kermeta.compil.runtime.helper.language.ObjectUtil
							.isInstanceOfSwitcher(
									org.kermeta.compil.runtime.helper.language.ObjectUtil
											.containerSwitcher(elem),
									org.kermeta.compil.runtime.ExecutionContext
											.getInstance()
											.getMetaClass(
													"kermeta.language.structure.NamedElement"));

					if (idIfCond_371) {

						elem = (kermeta.language.structure.NamedElement) org.kermeta.compil.runtime.ExecutionContext
								.getInstance()
								.<kermeta.language.structure.NamedElement> asTypeOrVoid(
										org.kermeta.compil.runtime.helper.language.ObjectUtil
												.containerSwitcher(elem));
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
