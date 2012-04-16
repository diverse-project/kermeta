/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.alf.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.kermeta.alf.AlfPackage;
import org.kermeta.alf.InstanceCreationExpression;
import org.kermeta.alf.QualifiedNameWithBinding;
import org.kermeta.alf.SequenceConstructionCompletion;
import org.kermeta.alf.SuffixExpression;
import org.kermeta.alf.Tuple;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Instance Creation Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.kermeta.alf.impl.InstanceCreationExpressionImpl#getConstructor <em>Constructor</em>}</li>
 *   <li>{@link org.kermeta.alf.impl.InstanceCreationExpressionImpl#getTuple <em>Tuple</em>}</li>
 *   <li>{@link org.kermeta.alf.impl.InstanceCreationExpressionImpl#getSequenceConstuctionCompletion <em>Sequence Constuction Completion</em>}</li>
 *   <li>{@link org.kermeta.alf.impl.InstanceCreationExpressionImpl#getSuffix <em>Suffix</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InstanceCreationExpressionImpl extends ValueSpecificationImpl implements InstanceCreationExpression {
	/**
	 * The cached value of the '{@link #getConstructor() <em>Constructor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstructor()
	 * @generated
	 * @ordered
	 */
	protected QualifiedNameWithBinding constructor;

	/**
	 * The cached value of the '{@link #getTuple() <em>Tuple</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTuple()
	 * @generated
	 * @ordered
	 */
	protected Tuple tuple;

	/**
	 * The cached value of the '{@link #getSequenceConstuctionCompletion() <em>Sequence Constuction Completion</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequenceConstuctionCompletion()
	 * @generated
	 * @ordered
	 */
	protected SequenceConstructionCompletion sequenceConstuctionCompletion;

	/**
	 * The cached value of the '{@link #getSuffix() <em>Suffix</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuffix()
	 * @generated
	 * @ordered
	 */
	protected SuffixExpression suffix;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InstanceCreationExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return AlfPackage.Literals.INSTANCE_CREATION_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QualifiedNameWithBinding getConstructor() {
		return constructor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConstructor(QualifiedNameWithBinding newConstructor, NotificationChain msgs) {
		QualifiedNameWithBinding oldConstructor = constructor;
		constructor = newConstructor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AlfPackage.INSTANCE_CREATION_EXPRESSION__CONSTRUCTOR, oldConstructor, newConstructor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstructor(QualifiedNameWithBinding newConstructor) {
		if (newConstructor != constructor) {
			NotificationChain msgs = null;
			if (constructor != null)
				msgs = ((InternalEObject)constructor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AlfPackage.INSTANCE_CREATION_EXPRESSION__CONSTRUCTOR, null, msgs);
			if (newConstructor != null)
				msgs = ((InternalEObject)newConstructor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AlfPackage.INSTANCE_CREATION_EXPRESSION__CONSTRUCTOR, null, msgs);
			msgs = basicSetConstructor(newConstructor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlfPackage.INSTANCE_CREATION_EXPRESSION__CONSTRUCTOR, newConstructor, newConstructor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tuple getTuple() {
		return tuple;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTuple(Tuple newTuple, NotificationChain msgs) {
		Tuple oldTuple = tuple;
		tuple = newTuple;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AlfPackage.INSTANCE_CREATION_EXPRESSION__TUPLE, oldTuple, newTuple);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTuple(Tuple newTuple) {
		if (newTuple != tuple) {
			NotificationChain msgs = null;
			if (tuple != null)
				msgs = ((InternalEObject)tuple).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AlfPackage.INSTANCE_CREATION_EXPRESSION__TUPLE, null, msgs);
			if (newTuple != null)
				msgs = ((InternalEObject)newTuple).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AlfPackage.INSTANCE_CREATION_EXPRESSION__TUPLE, null, msgs);
			msgs = basicSetTuple(newTuple, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlfPackage.INSTANCE_CREATION_EXPRESSION__TUPLE, newTuple, newTuple));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequenceConstructionCompletion getSequenceConstuctionCompletion() {
		return sequenceConstuctionCompletion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSequenceConstuctionCompletion(SequenceConstructionCompletion newSequenceConstuctionCompletion, NotificationChain msgs) {
		SequenceConstructionCompletion oldSequenceConstuctionCompletion = sequenceConstuctionCompletion;
		sequenceConstuctionCompletion = newSequenceConstuctionCompletion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AlfPackage.INSTANCE_CREATION_EXPRESSION__SEQUENCE_CONSTUCTION_COMPLETION, oldSequenceConstuctionCompletion, newSequenceConstuctionCompletion);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSequenceConstuctionCompletion(SequenceConstructionCompletion newSequenceConstuctionCompletion) {
		if (newSequenceConstuctionCompletion != sequenceConstuctionCompletion) {
			NotificationChain msgs = null;
			if (sequenceConstuctionCompletion != null)
				msgs = ((InternalEObject)sequenceConstuctionCompletion).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AlfPackage.INSTANCE_CREATION_EXPRESSION__SEQUENCE_CONSTUCTION_COMPLETION, null, msgs);
			if (newSequenceConstuctionCompletion != null)
				msgs = ((InternalEObject)newSequenceConstuctionCompletion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AlfPackage.INSTANCE_CREATION_EXPRESSION__SEQUENCE_CONSTUCTION_COMPLETION, null, msgs);
			msgs = basicSetSequenceConstuctionCompletion(newSequenceConstuctionCompletion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlfPackage.INSTANCE_CREATION_EXPRESSION__SEQUENCE_CONSTUCTION_COMPLETION, newSequenceConstuctionCompletion, newSequenceConstuctionCompletion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SuffixExpression getSuffix() {
		return suffix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSuffix(SuffixExpression newSuffix, NotificationChain msgs) {
		SuffixExpression oldSuffix = suffix;
		suffix = newSuffix;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AlfPackage.INSTANCE_CREATION_EXPRESSION__SUFFIX, oldSuffix, newSuffix);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuffix(SuffixExpression newSuffix) {
		if (newSuffix != suffix) {
			NotificationChain msgs = null;
			if (suffix != null)
				msgs = ((InternalEObject)suffix).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AlfPackage.INSTANCE_CREATION_EXPRESSION__SUFFIX, null, msgs);
			if (newSuffix != null)
				msgs = ((InternalEObject)newSuffix).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AlfPackage.INSTANCE_CREATION_EXPRESSION__SUFFIX, null, msgs);
			msgs = basicSetSuffix(newSuffix, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlfPackage.INSTANCE_CREATION_EXPRESSION__SUFFIX, newSuffix, newSuffix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AlfPackage.INSTANCE_CREATION_EXPRESSION__CONSTRUCTOR:
				return basicSetConstructor(null, msgs);
			case AlfPackage.INSTANCE_CREATION_EXPRESSION__TUPLE:
				return basicSetTuple(null, msgs);
			case AlfPackage.INSTANCE_CREATION_EXPRESSION__SEQUENCE_CONSTUCTION_COMPLETION:
				return basicSetSequenceConstuctionCompletion(null, msgs);
			case AlfPackage.INSTANCE_CREATION_EXPRESSION__SUFFIX:
				return basicSetSuffix(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AlfPackage.INSTANCE_CREATION_EXPRESSION__CONSTRUCTOR:
				return getConstructor();
			case AlfPackage.INSTANCE_CREATION_EXPRESSION__TUPLE:
				return getTuple();
			case AlfPackage.INSTANCE_CREATION_EXPRESSION__SEQUENCE_CONSTUCTION_COMPLETION:
				return getSequenceConstuctionCompletion();
			case AlfPackage.INSTANCE_CREATION_EXPRESSION__SUFFIX:
				return getSuffix();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AlfPackage.INSTANCE_CREATION_EXPRESSION__CONSTRUCTOR:
				setConstructor((QualifiedNameWithBinding)newValue);
				return;
			case AlfPackage.INSTANCE_CREATION_EXPRESSION__TUPLE:
				setTuple((Tuple)newValue);
				return;
			case AlfPackage.INSTANCE_CREATION_EXPRESSION__SEQUENCE_CONSTUCTION_COMPLETION:
				setSequenceConstuctionCompletion((SequenceConstructionCompletion)newValue);
				return;
			case AlfPackage.INSTANCE_CREATION_EXPRESSION__SUFFIX:
				setSuffix((SuffixExpression)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case AlfPackage.INSTANCE_CREATION_EXPRESSION__CONSTRUCTOR:
				setConstructor((QualifiedNameWithBinding)null);
				return;
			case AlfPackage.INSTANCE_CREATION_EXPRESSION__TUPLE:
				setTuple((Tuple)null);
				return;
			case AlfPackage.INSTANCE_CREATION_EXPRESSION__SEQUENCE_CONSTUCTION_COMPLETION:
				setSequenceConstuctionCompletion((SequenceConstructionCompletion)null);
				return;
			case AlfPackage.INSTANCE_CREATION_EXPRESSION__SUFFIX:
				setSuffix((SuffixExpression)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case AlfPackage.INSTANCE_CREATION_EXPRESSION__CONSTRUCTOR:
				return constructor != null;
			case AlfPackage.INSTANCE_CREATION_EXPRESSION__TUPLE:
				return tuple != null;
			case AlfPackage.INSTANCE_CREATION_EXPRESSION__SEQUENCE_CONSTUCTION_COMPLETION:
				return sequenceConstuctionCompletion != null;
			case AlfPackage.INSTANCE_CREATION_EXPRESSION__SUFFIX:
				return suffix != null;
		}
		return super.eIsSet(featureID);
	}

} //InstanceCreationExpressionImpl
