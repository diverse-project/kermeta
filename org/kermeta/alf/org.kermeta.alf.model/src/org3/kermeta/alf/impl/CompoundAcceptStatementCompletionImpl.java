/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org3.kermeta.alf.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org3.kermeta.alf.AcceptBlock;
import org3.kermeta.alf.AlfPackage;
import org3.kermeta.alf.Block;
import org3.kermeta.alf.CompoundAcceptStatementCompletion;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Compound Accept Statement Completion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org3.kermeta.alf.impl.CompoundAcceptStatementCompletionImpl#getBlock <em>Block</em>}</li>
 *   <li>{@link org3.kermeta.alf.impl.CompoundAcceptStatementCompletionImpl#getAcceptBlock <em>Accept Block</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CompoundAcceptStatementCompletionImpl extends EObjectImpl implements CompoundAcceptStatementCompletion {
	/**
	 * The cached value of the '{@link #getBlock() <em>Block</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlock()
	 * @generated
	 * @ordered
	 */
	protected Block block;

	/**
	 * The cached value of the '{@link #getAcceptBlock() <em>Accept Block</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcceptBlock()
	 * @generated
	 * @ordered
	 */
	protected EList acceptBlock;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompoundAcceptStatementCompletionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return AlfPackage.Literals.COMPOUND_ACCEPT_STATEMENT_COMPLETION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Block getBlock() {
		return block;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBlock(Block newBlock, NotificationChain msgs) {
		Block oldBlock = block;
		block = newBlock;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AlfPackage.COMPOUND_ACCEPT_STATEMENT_COMPLETION__BLOCK, oldBlock, newBlock);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBlock(Block newBlock) {
		if (newBlock != block) {
			NotificationChain msgs = null;
			if (block != null)
				msgs = ((InternalEObject)block).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AlfPackage.COMPOUND_ACCEPT_STATEMENT_COMPLETION__BLOCK, null, msgs);
			if (newBlock != null)
				msgs = ((InternalEObject)newBlock).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AlfPackage.COMPOUND_ACCEPT_STATEMENT_COMPLETION__BLOCK, null, msgs);
			msgs = basicSetBlock(newBlock, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlfPackage.COMPOUND_ACCEPT_STATEMENT_COMPLETION__BLOCK, newBlock, newBlock));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getAcceptBlock() {
		if (acceptBlock == null) {
			acceptBlock = new EObjectContainmentEList(AcceptBlock.class, this, AlfPackage.COMPOUND_ACCEPT_STATEMENT_COMPLETION__ACCEPT_BLOCK);
		}
		return acceptBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AlfPackage.COMPOUND_ACCEPT_STATEMENT_COMPLETION__BLOCK:
				return basicSetBlock(null, msgs);
			case AlfPackage.COMPOUND_ACCEPT_STATEMENT_COMPLETION__ACCEPT_BLOCK:
				return ((InternalEList)getAcceptBlock()).basicRemove(otherEnd, msgs);
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
			case AlfPackage.COMPOUND_ACCEPT_STATEMENT_COMPLETION__BLOCK:
				return getBlock();
			case AlfPackage.COMPOUND_ACCEPT_STATEMENT_COMPLETION__ACCEPT_BLOCK:
				return getAcceptBlock();
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
			case AlfPackage.COMPOUND_ACCEPT_STATEMENT_COMPLETION__BLOCK:
				setBlock((Block)newValue);
				return;
			case AlfPackage.COMPOUND_ACCEPT_STATEMENT_COMPLETION__ACCEPT_BLOCK:
				getAcceptBlock().clear();
				getAcceptBlock().addAll((Collection)newValue);
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
			case AlfPackage.COMPOUND_ACCEPT_STATEMENT_COMPLETION__BLOCK:
				setBlock((Block)null);
				return;
			case AlfPackage.COMPOUND_ACCEPT_STATEMENT_COMPLETION__ACCEPT_BLOCK:
				getAcceptBlock().clear();
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
			case AlfPackage.COMPOUND_ACCEPT_STATEMENT_COMPLETION__BLOCK:
				return block != null;
			case AlfPackage.COMPOUND_ACCEPT_STATEMENT_COMPLETION__ACCEPT_BLOCK:
				return acceptBlock != null && !acceptBlock.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CompoundAcceptStatementCompletionImpl