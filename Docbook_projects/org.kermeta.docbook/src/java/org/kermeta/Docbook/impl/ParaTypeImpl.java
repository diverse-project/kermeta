/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.Docbook.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.kermeta.Docbook.DocbookPackage;
import org.kermeta.Docbook.EmphasisType;
import org.kermeta.Docbook.FootnoteType;
import org.kermeta.Docbook.LinkType;
import org.kermeta.Docbook.LiteralType;
import org.kermeta.Docbook.ParaType;
import org.kermeta.Docbook.UlinkType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Para Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.kermeta.Docbook.impl.ParaTypeImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.kermeta.Docbook.impl.ParaTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.kermeta.Docbook.impl.ParaTypeImpl#getEmphasis <em>Emphasis</em>}</li>
 *   <li>{@link org.kermeta.Docbook.impl.ParaTypeImpl#getLiteral <em>Literal</em>}</li>
 *   <li>{@link org.kermeta.Docbook.impl.ParaTypeImpl#getUlink <em>Ulink</em>}</li>
 *   <li>{@link org.kermeta.Docbook.impl.ParaTypeImpl#getFootnote <em>Footnote</em>}</li>
 *   <li>{@link org.kermeta.Docbook.impl.ParaTypeImpl#getLink <em>Link</em>}</li>
 *   <li>{@link org.kermeta.Docbook.impl.ParaTypeImpl#getRole <em>Role</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ParaTypeImpl extends EObjectImpl implements ParaType {
	/**
	 * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMixed()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap mixed;

	/**
	 * The default value of the '{@link #getRole() <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected static final String ROLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRole() <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected String role = ROLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParaTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DocbookPackage.Literals.PARA_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, DocbookPackage.PARA_TYPE__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		return (FeatureMap)getMixed().<FeatureMap.Entry>list(DocbookPackage.Literals.PARA_TYPE__GROUP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EmphasisType> getEmphasis() {
		return getGroup().list(DocbookPackage.Literals.PARA_TYPE__EMPHASIS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LiteralType> getLiteral() {
		return getGroup().list(DocbookPackage.Literals.PARA_TYPE__LITERAL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UlinkType> getUlink() {
		return getGroup().list(DocbookPackage.Literals.PARA_TYPE__ULINK);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FootnoteType> getFootnote() {
		return getGroup().list(DocbookPackage.Literals.PARA_TYPE__FOOTNOTE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LinkType> getLink() {
		return getGroup().list(DocbookPackage.Literals.PARA_TYPE__LINK);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRole() {
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRole(String newRole) {
		String oldRole = role;
		role = newRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.PARA_TYPE__ROLE, oldRole, role));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DocbookPackage.PARA_TYPE__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case DocbookPackage.PARA_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case DocbookPackage.PARA_TYPE__EMPHASIS:
				return ((InternalEList<?>)getEmphasis()).basicRemove(otherEnd, msgs);
			case DocbookPackage.PARA_TYPE__LITERAL:
				return ((InternalEList<?>)getLiteral()).basicRemove(otherEnd, msgs);
			case DocbookPackage.PARA_TYPE__ULINK:
				return ((InternalEList<?>)getUlink()).basicRemove(otherEnd, msgs);
			case DocbookPackage.PARA_TYPE__FOOTNOTE:
				return ((InternalEList<?>)getFootnote()).basicRemove(otherEnd, msgs);
			case DocbookPackage.PARA_TYPE__LINK:
				return ((InternalEList<?>)getLink()).basicRemove(otherEnd, msgs);
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
			case DocbookPackage.PARA_TYPE__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case DocbookPackage.PARA_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case DocbookPackage.PARA_TYPE__EMPHASIS:
				return getEmphasis();
			case DocbookPackage.PARA_TYPE__LITERAL:
				return getLiteral();
			case DocbookPackage.PARA_TYPE__ULINK:
				return getUlink();
			case DocbookPackage.PARA_TYPE__FOOTNOTE:
				return getFootnote();
			case DocbookPackage.PARA_TYPE__LINK:
				return getLink();
			case DocbookPackage.PARA_TYPE__ROLE:
				return getRole();
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
			case DocbookPackage.PARA_TYPE__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case DocbookPackage.PARA_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case DocbookPackage.PARA_TYPE__EMPHASIS:
				getEmphasis().clear();
				getEmphasis().addAll((Collection<? extends EmphasisType>)newValue);
				return;
			case DocbookPackage.PARA_TYPE__LITERAL:
				getLiteral().clear();
				getLiteral().addAll((Collection<? extends LiteralType>)newValue);
				return;
			case DocbookPackage.PARA_TYPE__ULINK:
				getUlink().clear();
				getUlink().addAll((Collection<? extends UlinkType>)newValue);
				return;
			case DocbookPackage.PARA_TYPE__FOOTNOTE:
				getFootnote().clear();
				getFootnote().addAll((Collection<? extends FootnoteType>)newValue);
				return;
			case DocbookPackage.PARA_TYPE__LINK:
				getLink().clear();
				getLink().addAll((Collection<? extends LinkType>)newValue);
				return;
			case DocbookPackage.PARA_TYPE__ROLE:
				setRole((String)newValue);
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
			case DocbookPackage.PARA_TYPE__MIXED:
				getMixed().clear();
				return;
			case DocbookPackage.PARA_TYPE__GROUP:
				getGroup().clear();
				return;
			case DocbookPackage.PARA_TYPE__EMPHASIS:
				getEmphasis().clear();
				return;
			case DocbookPackage.PARA_TYPE__LITERAL:
				getLiteral().clear();
				return;
			case DocbookPackage.PARA_TYPE__ULINK:
				getUlink().clear();
				return;
			case DocbookPackage.PARA_TYPE__FOOTNOTE:
				getFootnote().clear();
				return;
			case DocbookPackage.PARA_TYPE__LINK:
				getLink().clear();
				return;
			case DocbookPackage.PARA_TYPE__ROLE:
				setRole(ROLE_EDEFAULT);
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
			case DocbookPackage.PARA_TYPE__MIXED:
				return mixed != null && !mixed.isEmpty();
			case DocbookPackage.PARA_TYPE__GROUP:
				return !getGroup().isEmpty();
			case DocbookPackage.PARA_TYPE__EMPHASIS:
				return !getEmphasis().isEmpty();
			case DocbookPackage.PARA_TYPE__LITERAL:
				return !getLiteral().isEmpty();
			case DocbookPackage.PARA_TYPE__ULINK:
				return !getUlink().isEmpty();
			case DocbookPackage.PARA_TYPE__FOOTNOTE:
				return !getFootnote().isEmpty();
			case DocbookPackage.PARA_TYPE__LINK:
				return !getLink().isEmpty();
			case DocbookPackage.PARA_TYPE__ROLE:
				return ROLE_EDEFAULT == null ? role != null : !ROLE_EDEFAULT.equals(role);
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
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (mixed: ");
		result.append(mixed);
		result.append(", role: ");
		result.append(role);
		result.append(')');
		return result.toString();
	}

} //ParaTypeImpl
