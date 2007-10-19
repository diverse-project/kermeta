/**
 * <copyright>
 * </copyright>
 *
 * $Id: KUseCaseImpl.java,v 1.3 2007-10-19 14:10:06 fmunoz Exp $
 */
package org.kermeta.trek.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.kermeta.trek.KTagElement;
import org.kermeta.trek.KTestCase;
import org.kermeta.trek.KUseCase;
import org.kermeta.trek.KUseLevel;
import org.kermeta.trek.KUserStory;
import org.kermeta.trek.TrekPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>KUse Case</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.kermeta.trek.impl.KUseCaseImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.kermeta.trek.impl.KUseCaseImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.kermeta.trek.impl.KUseCaseImpl#getSummary <em>Summary</em>}</li>
 *   <li>{@link org.kermeta.trek.impl.KUseCaseImpl#getShortSummary <em>Short Summary</em>}</li>
 *   <li>{@link org.kermeta.trek.impl.KUseCaseImpl#getUse <em>Use</em>}</li>
 *   <li>{@link org.kermeta.trek.impl.KUseCaseImpl#getUsedBy <em>Used By</em>}</li>
 *   <li>{@link org.kermeta.trek.impl.KUseCaseImpl#getVerifiedBy <em>Verified By</em>}</li>
 *   <li>{@link org.kermeta.trek.impl.KUseCaseImpl#getRefines <em>Refines</em>}</li>
 *   <li>{@link org.kermeta.trek.impl.KUseCaseImpl#getRefinedBy <em>Refined By</em>}</li>
 *   <li>{@link org.kermeta.trek.impl.KUseCaseImpl#getCovers <em>Covers</em>}</li>
 *   <li>{@link org.kermeta.trek.impl.KUseCaseImpl#getLevel <em>Level</em>}</li>
 *   <li>{@link org.kermeta.trek.impl.KUseCaseImpl#getTags <em>Tags</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class KUseCaseImpl extends TrekModelElementImpl implements KUseCase {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "";

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
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getSummary() <em>Summary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSummary()
	 * @generated
	 * @ordered
	 */
	protected static final String SUMMARY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSummary() <em>Summary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSummary()
	 * @generated
	 * @ordered
	 */
	protected String summary = SUMMARY_EDEFAULT;

	/**
	 * The default value of the '{@link #getShortSummary() <em>Short Summary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShortSummary()
	 * @generated
	 * @ordered
	 */
	protected static final String SHORT_SUMMARY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShortSummary() <em>Short Summary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShortSummary()
	 * @generated
	 * @ordered
	 */
	protected String shortSummary = SHORT_SUMMARY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getUse() <em>Use</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUse()
	 * @generated
	 * @ordered
	 */
	protected EList<KUseCase> use;

	/**
	 * The cached value of the '{@link #getUsedBy() <em>Used By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsedBy()
	 * @generated
	 * @ordered
	 */
	protected EList<KUseCase> usedBy;

	/**
	 * The cached value of the '{@link #getVerifiedBy() <em>Verified By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerifiedBy()
	 * @generated
	 * @ordered
	 */
	protected EList<KTestCase> verifiedBy;

	/**
	 * The cached value of the '{@link #getRefines() <em>Refines</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefines()
	 * @generated
	 * @ordered
	 */
	protected KUseCase refines;

	/**
	 * The cached value of the '{@link #getRefinedBy() <em>Refined By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefinedBy()
	 * @generated
	 * @ordered
	 */
	protected EList<KUseCase> refinedBy;

	/**
	 * The cached value of the '{@link #getCovers() <em>Covers</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCovers()
	 * @generated
	 * @ordered
	 */
	protected EList<KUserStory> covers;

	/**
	 * The default value of the '{@link #getLevel() <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel()
	 * @generated
	 * @ordered
	 */
	protected static final KUseLevel LEVEL_EDEFAULT = KUseLevel.IMPLEMENTATION;

	/**
	 * The cached value of the '{@link #getLevel() <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel()
	 * @generated
	 * @ordered
	 */
	protected KUseLevel level = LEVEL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTags() <em>Tags</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTags()
	 * @generated
	 * @ordered
	 */
	protected EList<KTagElement> tags;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KUseCaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TrekPackage.Literals.KUSE_CASE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TrekPackage.KUSE_CASE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TrekPackage.KUSE_CASE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSummary() {
		return summary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSummary(String newSummary) {
		String oldSummary = summary;
		summary = newSummary;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TrekPackage.KUSE_CASE__SUMMARY, oldSummary, summary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getShortSummary() {
		return shortSummary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShortSummary(String newShortSummary) {
		String oldShortSummary = shortSummary;
		shortSummary = newShortSummary;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TrekPackage.KUSE_CASE__SHORT_SUMMARY, oldShortSummary, shortSummary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<KUseCase> getUse() {
		if (use == null) {
			use = new EObjectWithInverseResolvingEList.ManyInverse<KUseCase>(KUseCase.class, this, TrekPackage.KUSE_CASE__USE, TrekPackage.KUSE_CASE__USED_BY);
		}
		return use;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<KUseCase> getUsedBy() {
		if (usedBy == null) {
			usedBy = new EObjectWithInverseResolvingEList.ManyInverse<KUseCase>(KUseCase.class, this, TrekPackage.KUSE_CASE__USED_BY, TrekPackage.KUSE_CASE__USE);
		}
		return usedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<KTestCase> getVerifiedBy() {
		if (verifiedBy == null) {
			verifiedBy = new EObjectResolvingEList<KTestCase>(KTestCase.class, this, TrekPackage.KUSE_CASE__VERIFIED_BY);
		}
		return verifiedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KUseCase getRefines() {
		if (refines != null && refines.eIsProxy()) {
			InternalEObject oldRefines = (InternalEObject)refines;
			refines = (KUseCase)eResolveProxy(oldRefines);
			if (refines != oldRefines) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TrekPackage.KUSE_CASE__REFINES, oldRefines, refines));
			}
		}
		return refines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KUseCase basicGetRefines() {
		return refines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRefines(KUseCase newRefines, NotificationChain msgs) {
		KUseCase oldRefines = refines;
		refines = newRefines;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TrekPackage.KUSE_CASE__REFINES, oldRefines, newRefines);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefines(KUseCase newRefines) {
		if (newRefines != refines) {
			NotificationChain msgs = null;
			if (refines != null)
				msgs = ((InternalEObject)refines).eInverseRemove(this, TrekPackage.KUSE_CASE__REFINED_BY, KUseCase.class, msgs);
			if (newRefines != null)
				msgs = ((InternalEObject)newRefines).eInverseAdd(this, TrekPackage.KUSE_CASE__REFINED_BY, KUseCase.class, msgs);
			msgs = basicSetRefines(newRefines, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TrekPackage.KUSE_CASE__REFINES, newRefines, newRefines));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<KUseCase> getRefinedBy() {
		if (refinedBy == null) {
			refinedBy = new EObjectWithInverseResolvingEList<KUseCase>(KUseCase.class, this, TrekPackage.KUSE_CASE__REFINED_BY, TrekPackage.KUSE_CASE__REFINES);
		}
		return refinedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<KUserStory> getCovers() {
		if (covers == null) {
			covers = new EObjectWithInverseResolvingEList.ManyInverse<KUserStory>(KUserStory.class, this, TrekPackage.KUSE_CASE__COVERS, TrekPackage.KUSER_STORY__COVERED_BY);
		}
		return covers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KUseLevel getLevel() {
		return level;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLevel(KUseLevel newLevel) {
		KUseLevel oldLevel = level;
		level = newLevel == null ? LEVEL_EDEFAULT : newLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TrekPackage.KUSE_CASE__LEVEL, oldLevel, level));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<KTagElement> getTags() {
		if (tags == null) {
			tags = new EObjectResolvingEList<KTagElement>(KTagElement.class, this, TrekPackage.KUSE_CASE__TAGS);
		}
		return tags;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TrekPackage.KUSE_CASE__USE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getUse()).basicAdd(otherEnd, msgs);
			case TrekPackage.KUSE_CASE__USED_BY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getUsedBy()).basicAdd(otherEnd, msgs);
			case TrekPackage.KUSE_CASE__REFINES:
				if (refines != null)
					msgs = ((InternalEObject)refines).eInverseRemove(this, TrekPackage.KUSE_CASE__REFINED_BY, KUseCase.class, msgs);
				return basicSetRefines((KUseCase)otherEnd, msgs);
			case TrekPackage.KUSE_CASE__REFINED_BY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRefinedBy()).basicAdd(otherEnd, msgs);
			case TrekPackage.KUSE_CASE__COVERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCovers()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TrekPackage.KUSE_CASE__USE:
				return ((InternalEList<?>)getUse()).basicRemove(otherEnd, msgs);
			case TrekPackage.KUSE_CASE__USED_BY:
				return ((InternalEList<?>)getUsedBy()).basicRemove(otherEnd, msgs);
			case TrekPackage.KUSE_CASE__REFINES:
				return basicSetRefines(null, msgs);
			case TrekPackage.KUSE_CASE__REFINED_BY:
				return ((InternalEList<?>)getRefinedBy()).basicRemove(otherEnd, msgs);
			case TrekPackage.KUSE_CASE__COVERS:
				return ((InternalEList<?>)getCovers()).basicRemove(otherEnd, msgs);
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
			case TrekPackage.KUSE_CASE__NAME:
				return getName();
			case TrekPackage.KUSE_CASE__ID:
				return getId();
			case TrekPackage.KUSE_CASE__SUMMARY:
				return getSummary();
			case TrekPackage.KUSE_CASE__SHORT_SUMMARY:
				return getShortSummary();
			case TrekPackage.KUSE_CASE__USE:
				return getUse();
			case TrekPackage.KUSE_CASE__USED_BY:
				return getUsedBy();
			case TrekPackage.KUSE_CASE__VERIFIED_BY:
				return getVerifiedBy();
			case TrekPackage.KUSE_CASE__REFINES:
				if (resolve) return getRefines();
				return basicGetRefines();
			case TrekPackage.KUSE_CASE__REFINED_BY:
				return getRefinedBy();
			case TrekPackage.KUSE_CASE__COVERS:
				return getCovers();
			case TrekPackage.KUSE_CASE__LEVEL:
				return getLevel();
			case TrekPackage.KUSE_CASE__TAGS:
				return getTags();
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
			case TrekPackage.KUSE_CASE__NAME:
				setName((String)newValue);
				return;
			case TrekPackage.KUSE_CASE__ID:
				setId((String)newValue);
				return;
			case TrekPackage.KUSE_CASE__SUMMARY:
				setSummary((String)newValue);
				return;
			case TrekPackage.KUSE_CASE__SHORT_SUMMARY:
				setShortSummary((String)newValue);
				return;
			case TrekPackage.KUSE_CASE__USE:
				getUse().clear();
				getUse().addAll((Collection<? extends KUseCase>)newValue);
				return;
			case TrekPackage.KUSE_CASE__USED_BY:
				getUsedBy().clear();
				getUsedBy().addAll((Collection<? extends KUseCase>)newValue);
				return;
			case TrekPackage.KUSE_CASE__VERIFIED_BY:
				getVerifiedBy().clear();
				getVerifiedBy().addAll((Collection<? extends KTestCase>)newValue);
				return;
			case TrekPackage.KUSE_CASE__REFINES:
				setRefines((KUseCase)newValue);
				return;
			case TrekPackage.KUSE_CASE__REFINED_BY:
				getRefinedBy().clear();
				getRefinedBy().addAll((Collection<? extends KUseCase>)newValue);
				return;
			case TrekPackage.KUSE_CASE__COVERS:
				getCovers().clear();
				getCovers().addAll((Collection<? extends KUserStory>)newValue);
				return;
			case TrekPackage.KUSE_CASE__LEVEL:
				setLevel((KUseLevel)newValue);
				return;
			case TrekPackage.KUSE_CASE__TAGS:
				getTags().clear();
				getTags().addAll((Collection<? extends KTagElement>)newValue);
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
			case TrekPackage.KUSE_CASE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TrekPackage.KUSE_CASE__ID:
				setId(ID_EDEFAULT);
				return;
			case TrekPackage.KUSE_CASE__SUMMARY:
				setSummary(SUMMARY_EDEFAULT);
				return;
			case TrekPackage.KUSE_CASE__SHORT_SUMMARY:
				setShortSummary(SHORT_SUMMARY_EDEFAULT);
				return;
			case TrekPackage.KUSE_CASE__USE:
				getUse().clear();
				return;
			case TrekPackage.KUSE_CASE__USED_BY:
				getUsedBy().clear();
				return;
			case TrekPackage.KUSE_CASE__VERIFIED_BY:
				getVerifiedBy().clear();
				return;
			case TrekPackage.KUSE_CASE__REFINES:
				setRefines((KUseCase)null);
				return;
			case TrekPackage.KUSE_CASE__REFINED_BY:
				getRefinedBy().clear();
				return;
			case TrekPackage.KUSE_CASE__COVERS:
				getCovers().clear();
				return;
			case TrekPackage.KUSE_CASE__LEVEL:
				setLevel(LEVEL_EDEFAULT);
				return;
			case TrekPackage.KUSE_CASE__TAGS:
				getTags().clear();
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
			case TrekPackage.KUSE_CASE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case TrekPackage.KUSE_CASE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case TrekPackage.KUSE_CASE__SUMMARY:
				return SUMMARY_EDEFAULT == null ? summary != null : !SUMMARY_EDEFAULT.equals(summary);
			case TrekPackage.KUSE_CASE__SHORT_SUMMARY:
				return SHORT_SUMMARY_EDEFAULT == null ? shortSummary != null : !SHORT_SUMMARY_EDEFAULT.equals(shortSummary);
			case TrekPackage.KUSE_CASE__USE:
				return use != null && !use.isEmpty();
			case TrekPackage.KUSE_CASE__USED_BY:
				return usedBy != null && !usedBy.isEmpty();
			case TrekPackage.KUSE_CASE__VERIFIED_BY:
				return verifiedBy != null && !verifiedBy.isEmpty();
			case TrekPackage.KUSE_CASE__REFINES:
				return refines != null;
			case TrekPackage.KUSE_CASE__REFINED_BY:
				return refinedBy != null && !refinedBy.isEmpty();
			case TrekPackage.KUSE_CASE__COVERS:
				return covers != null && !covers.isEmpty();
			case TrekPackage.KUSE_CASE__LEVEL:
				return level != LEVEL_EDEFAULT;
			case TrekPackage.KUSE_CASE__TAGS:
				return tags != null && !tags.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(", id: ");
		result.append(id);
		result.append(", summary: ");
		result.append(summary);
		result.append(", shortSummary: ");
		result.append(shortSummary);
		result.append(", level: ");
		result.append(level);
		result.append(')');
		return result.toString();
	}

} //KUseCaseImpl
