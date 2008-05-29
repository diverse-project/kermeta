/**
 * <copyright>
 * </copyright>
 *
 * $Id: ProcDeclarationImpl.java,v 1.3 2008-05-29 12:09:36 vmahe Exp $
 */
package fr.irisa.triskell.kmLogo.ASM.impl;

import fr.irisa.triskell.kmLogo.ASM.ASMPackage;
import fr.irisa.triskell.kmLogo.ASM.Block;
import fr.irisa.triskell.kmLogo.ASM.LogoPackage;
import fr.irisa.triskell.kmLogo.ASM.Parameter;
import fr.irisa.triskell.kmLogo.ASM.ProcCall;
import fr.irisa.triskell.kmLogo.ASM.ProcDeclaration;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Proc Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.irisa.triskell.kmLogo.ASM.impl.ProcDeclarationImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.irisa.triskell.kmLogo.ASM.impl.ProcDeclarationImpl#getArgs <em>Args</em>}</li>
 *   <li>{@link fr.irisa.triskell.kmLogo.ASM.impl.ProcDeclarationImpl#getBlock <em>Block</em>}</li>
 *   <li>{@link fr.irisa.triskell.kmLogo.ASM.impl.ProcDeclarationImpl#getProcCall <em>Proc Call</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProcDeclarationImpl extends InstructionImpl implements ProcDeclaration {
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
	 * The cached value of the '{@link #getArgs() <em>Args</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArgs()
	 * @generated
	 * @ordered
	 */
	protected EList args;

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
	 * The cached value of the '{@link #getProcCall() <em>Proc Call</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcCall()
	 * @generated
	 * @ordered
	 */
	protected EList procCall;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcDeclarationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ASMPackage.Literals.PROC_DECLARATION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ASMPackage.PROC_DECLARATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getArgs() {
		if (args == null) {
			args = new EObjectContainmentEList(Parameter.class, this, ASMPackage.PROC_DECLARATION__ARGS);
		}
		return args;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ASMPackage.PROC_DECLARATION__BLOCK, oldBlock, newBlock);
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
				msgs = ((InternalEObject)block).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ASMPackage.PROC_DECLARATION__BLOCK, null, msgs);
			if (newBlock != null)
				msgs = ((InternalEObject)newBlock).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ASMPackage.PROC_DECLARATION__BLOCK, null, msgs);
			msgs = basicSetBlock(newBlock, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ASMPackage.PROC_DECLARATION__BLOCK, newBlock, newBlock));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getProcCall() {
		if (procCall == null) {
			procCall = new EObjectWithInverseResolvingEList(ProcCall.class, this, ASMPackage.PROC_DECLARATION__PROC_CALL, ASMPackage.PROC_CALL__DECLARATION);
		}
		return procCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ASMPackage.PROC_DECLARATION__PROC_CALL:
				return ((InternalEList)getProcCall()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ASMPackage.PROC_DECLARATION__ARGS:
				return ((InternalEList)getArgs()).basicRemove(otherEnd, msgs);
			case ASMPackage.PROC_DECLARATION__BLOCK:
				return basicSetBlock(null, msgs);
			case ASMPackage.PROC_DECLARATION__PROC_CALL:
				return ((InternalEList)getProcCall()).basicRemove(otherEnd, msgs);
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
			case ASMPackage.PROC_DECLARATION__NAME:
				return getName();
			case ASMPackage.PROC_DECLARATION__ARGS:
				return getArgs();
			case ASMPackage.PROC_DECLARATION__BLOCK:
				return getBlock();
			case ASMPackage.PROC_DECLARATION__PROC_CALL:
				return getProcCall();
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
			case ASMPackage.PROC_DECLARATION__NAME:
				setName((String)newValue);
				return;
			case ASMPackage.PROC_DECLARATION__ARGS:
				getArgs().clear();
				getArgs().addAll((Collection)newValue);
				return;
			case ASMPackage.PROC_DECLARATION__BLOCK:
				setBlock((Block)newValue);
				return;
			case ASMPackage.PROC_DECLARATION__PROC_CALL:
				getProcCall().clear();
				getProcCall().addAll((Collection)newValue);
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
			case ASMPackage.PROC_DECLARATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ASMPackage.PROC_DECLARATION__ARGS:
				getArgs().clear();
				return;
			case ASMPackage.PROC_DECLARATION__BLOCK:
				setBlock((Block)null);
				return;
			case ASMPackage.PROC_DECLARATION__PROC_CALL:
				getProcCall().clear();
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
			case ASMPackage.PROC_DECLARATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ASMPackage.PROC_DECLARATION__ARGS:
				return args != null && !args.isEmpty();
			case ASMPackage.PROC_DECLARATION__BLOCK:
				return block != null;
			case ASMPackage.PROC_DECLARATION__PROC_CALL:
				return procCall != null && !procCall.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ProcDeclarationImpl