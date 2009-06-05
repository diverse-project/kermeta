/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.Docbook.impl;

import java.math.BigInteger;

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

import org.kermeta.Docbook.DocbookPackage;
import org.kermeta.Docbook.EntryType;
import org.kermeta.Docbook.MediaobjectType;
import org.kermeta.Docbook.ParaType;
import org.kermeta.Docbook.ProgramlistingType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entry Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.kermeta.Docbook.impl.EntryTypeImpl#getProgramlisting <em>Programlisting</em>}</li>
 *   <li>{@link org.kermeta.Docbook.impl.EntryTypeImpl#getMediaobject <em>Mediaobject</em>}</li>
 *   <li>{@link org.kermeta.Docbook.impl.EntryTypeImpl#getPara <em>Para</em>}</li>
 *   <li>{@link org.kermeta.Docbook.impl.EntryTypeImpl#getAlign <em>Align</em>}</li>
 *   <li>{@link org.kermeta.Docbook.impl.EntryTypeImpl#getMorerows <em>Morerows</em>}</li>
 *   <li>{@link org.kermeta.Docbook.impl.EntryTypeImpl#getNameend <em>Nameend</em>}</li>
 *   <li>{@link org.kermeta.Docbook.impl.EntryTypeImpl#getNamest <em>Namest</em>}</li>
 *   <li>{@link org.kermeta.Docbook.impl.EntryTypeImpl#getValign <em>Valign</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EntryTypeImpl extends EObjectImpl implements EntryType {
	/**
	 * The cached value of the '{@link #getProgramlisting() <em>Programlisting</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgramlisting()
	 * @generated
	 * @ordered
	 */
	protected EList<ProgramlistingType> programlisting;

	/**
	 * The cached value of the '{@link #getMediaobject() <em>Mediaobject</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMediaobject()
	 * @generated
	 * @ordered
	 */
	protected MediaobjectType mediaobject;

	/**
	 * The cached value of the '{@link #getPara() <em>Para</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPara()
	 * @generated
	 * @ordered
	 */
	protected EList<ParaType> para;

	/**
	 * The default value of the '{@link #getAlign() <em>Align</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlign()
	 * @generated
	 * @ordered
	 */
	protected static final String ALIGN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAlign() <em>Align</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlign()
	 * @generated
	 * @ordered
	 */
	protected String align = ALIGN_EDEFAULT;

	/**
	 * The default value of the '{@link #getMorerows() <em>Morerows</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMorerows()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger MOREROWS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMorerows() <em>Morerows</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMorerows()
	 * @generated
	 * @ordered
	 */
	protected BigInteger morerows = MOREROWS_EDEFAULT;

	/**
	 * The default value of the '{@link #getNameend() <em>Nameend</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameend()
	 * @generated
	 * @ordered
	 */
	protected static final String NAMEEND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNameend() <em>Nameend</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameend()
	 * @generated
	 * @ordered
	 */
	protected String nameend = NAMEEND_EDEFAULT;

	/**
	 * The default value of the '{@link #getNamest() <em>Namest</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamest()
	 * @generated
	 * @ordered
	 */
	protected static final String NAMEST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNamest() <em>Namest</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamest()
	 * @generated
	 * @ordered
	 */
	protected String namest = NAMEST_EDEFAULT;

	/**
	 * The default value of the '{@link #getValign() <em>Valign</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValign()
	 * @generated
	 * @ordered
	 */
	protected static final String VALIGN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValign() <em>Valign</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValign()
	 * @generated
	 * @ordered
	 */
	protected String valign = VALIGN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntryTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DocbookPackage.Literals.ENTRY_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProgramlistingType> getProgramlisting() {
		if (programlisting == null) {
			programlisting = new EObjectContainmentEList<ProgramlistingType>(ProgramlistingType.class, this, DocbookPackage.ENTRY_TYPE__PROGRAMLISTING);
		}
		return programlisting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MediaobjectType getMediaobject() {
		return mediaobject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMediaobject(MediaobjectType newMediaobject, NotificationChain msgs) {
		MediaobjectType oldMediaobject = mediaobject;
		mediaobject = newMediaobject;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DocbookPackage.ENTRY_TYPE__MEDIAOBJECT, oldMediaobject, newMediaobject);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMediaobject(MediaobjectType newMediaobject) {
		if (newMediaobject != mediaobject) {
			NotificationChain msgs = null;
			if (mediaobject != null)
				msgs = ((InternalEObject)mediaobject).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DocbookPackage.ENTRY_TYPE__MEDIAOBJECT, null, msgs);
			if (newMediaobject != null)
				msgs = ((InternalEObject)newMediaobject).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DocbookPackage.ENTRY_TYPE__MEDIAOBJECT, null, msgs);
			msgs = basicSetMediaobject(newMediaobject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.ENTRY_TYPE__MEDIAOBJECT, newMediaobject, newMediaobject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ParaType> getPara() {
		if (para == null) {
			para = new EObjectContainmentEList<ParaType>(ParaType.class, this, DocbookPackage.ENTRY_TYPE__PARA);
		}
		return para;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAlign() {
		return align;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlign(String newAlign) {
		String oldAlign = align;
		align = newAlign;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.ENTRY_TYPE__ALIGN, oldAlign, align));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getMorerows() {
		return morerows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMorerows(BigInteger newMorerows) {
		BigInteger oldMorerows = morerows;
		morerows = newMorerows;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.ENTRY_TYPE__MOREROWS, oldMorerows, morerows));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNameend() {
		return nameend;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNameend(String newNameend) {
		String oldNameend = nameend;
		nameend = newNameend;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.ENTRY_TYPE__NAMEEND, oldNameend, nameend));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNamest() {
		return namest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNamest(String newNamest) {
		String oldNamest = namest;
		namest = newNamest;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.ENTRY_TYPE__NAMEST, oldNamest, namest));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValign() {
		return valign;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValign(String newValign) {
		String oldValign = valign;
		valign = newValign;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.ENTRY_TYPE__VALIGN, oldValign, valign));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DocbookPackage.ENTRY_TYPE__PROGRAMLISTING:
				return ((InternalEList<?>)getProgramlisting()).basicRemove(otherEnd, msgs);
			case DocbookPackage.ENTRY_TYPE__MEDIAOBJECT:
				return basicSetMediaobject(null, msgs);
			case DocbookPackage.ENTRY_TYPE__PARA:
				return ((InternalEList<?>)getPara()).basicRemove(otherEnd, msgs);
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
			case DocbookPackage.ENTRY_TYPE__PROGRAMLISTING:
				return getProgramlisting();
			case DocbookPackage.ENTRY_TYPE__MEDIAOBJECT:
				return getMediaobject();
			case DocbookPackage.ENTRY_TYPE__PARA:
				return getPara();
			case DocbookPackage.ENTRY_TYPE__ALIGN:
				return getAlign();
			case DocbookPackage.ENTRY_TYPE__MOREROWS:
				return getMorerows();
			case DocbookPackage.ENTRY_TYPE__NAMEEND:
				return getNameend();
			case DocbookPackage.ENTRY_TYPE__NAMEST:
				return getNamest();
			case DocbookPackage.ENTRY_TYPE__VALIGN:
				return getValign();
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
			case DocbookPackage.ENTRY_TYPE__PROGRAMLISTING:
				getProgramlisting().clear();
				getProgramlisting().addAll((Collection<? extends ProgramlistingType>)newValue);
				return;
			case DocbookPackage.ENTRY_TYPE__MEDIAOBJECT:
				setMediaobject((MediaobjectType)newValue);
				return;
			case DocbookPackage.ENTRY_TYPE__PARA:
				getPara().clear();
				getPara().addAll((Collection<? extends ParaType>)newValue);
				return;
			case DocbookPackage.ENTRY_TYPE__ALIGN:
				setAlign((String)newValue);
				return;
			case DocbookPackage.ENTRY_TYPE__MOREROWS:
				setMorerows((BigInteger)newValue);
				return;
			case DocbookPackage.ENTRY_TYPE__NAMEEND:
				setNameend((String)newValue);
				return;
			case DocbookPackage.ENTRY_TYPE__NAMEST:
				setNamest((String)newValue);
				return;
			case DocbookPackage.ENTRY_TYPE__VALIGN:
				setValign((String)newValue);
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
			case DocbookPackage.ENTRY_TYPE__PROGRAMLISTING:
				getProgramlisting().clear();
				return;
			case DocbookPackage.ENTRY_TYPE__MEDIAOBJECT:
				setMediaobject((MediaobjectType)null);
				return;
			case DocbookPackage.ENTRY_TYPE__PARA:
				getPara().clear();
				return;
			case DocbookPackage.ENTRY_TYPE__ALIGN:
				setAlign(ALIGN_EDEFAULT);
				return;
			case DocbookPackage.ENTRY_TYPE__MOREROWS:
				setMorerows(MOREROWS_EDEFAULT);
				return;
			case DocbookPackage.ENTRY_TYPE__NAMEEND:
				setNameend(NAMEEND_EDEFAULT);
				return;
			case DocbookPackage.ENTRY_TYPE__NAMEST:
				setNamest(NAMEST_EDEFAULT);
				return;
			case DocbookPackage.ENTRY_TYPE__VALIGN:
				setValign(VALIGN_EDEFAULT);
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
			case DocbookPackage.ENTRY_TYPE__PROGRAMLISTING:
				return programlisting != null && !programlisting.isEmpty();
			case DocbookPackage.ENTRY_TYPE__MEDIAOBJECT:
				return mediaobject != null;
			case DocbookPackage.ENTRY_TYPE__PARA:
				return para != null && !para.isEmpty();
			case DocbookPackage.ENTRY_TYPE__ALIGN:
				return ALIGN_EDEFAULT == null ? align != null : !ALIGN_EDEFAULT.equals(align);
			case DocbookPackage.ENTRY_TYPE__MOREROWS:
				return MOREROWS_EDEFAULT == null ? morerows != null : !MOREROWS_EDEFAULT.equals(morerows);
			case DocbookPackage.ENTRY_TYPE__NAMEEND:
				return NAMEEND_EDEFAULT == null ? nameend != null : !NAMEEND_EDEFAULT.equals(nameend);
			case DocbookPackage.ENTRY_TYPE__NAMEST:
				return NAMEST_EDEFAULT == null ? namest != null : !NAMEST_EDEFAULT.equals(namest);
			case DocbookPackage.ENTRY_TYPE__VALIGN:
				return VALIGN_EDEFAULT == null ? valign != null : !VALIGN_EDEFAULT.equals(valign);
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
		result.append(" (align: ");
		result.append(align);
		result.append(", morerows: ");
		result.append(morerows);
		result.append(", nameend: ");
		result.append(nameend);
		result.append(", namest: ");
		result.append(namest);
		result.append(", valign: ");
		result.append(valign);
		result.append(')');
		return result.toString();
	}

} //EntryTypeImpl
