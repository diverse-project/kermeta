/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.tm.elibel.smartqvt.qvt.qvtoperational.impl;

import fr.tm.elibel.smartqvt.qvt.essentialocl.OclExpression;

import fr.tm.elibel.smartqvt.qvt.qvtoperational.MappingOperation;
import fr.tm.elibel.smartqvt.qvt.qvtoperational.QvtoperationalPackage;

import fr.tm.elibel.smartqvt.qvt.qvtrelation.Relation;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mapping Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.tm.elibel.smartqvt.qvt.qvtoperational.impl.MappingOperationImpl#getDisjunct <em>Disjunct</em>}</li>
 *   <li>{@link fr.tm.elibel.smartqvt.qvt.qvtoperational.impl.MappingOperationImpl#getInherited <em>Inherited</em>}</li>
 *   <li>{@link fr.tm.elibel.smartqvt.qvt.qvtoperational.impl.MappingOperationImpl#getMerged <em>Merged</em>}</li>
 *   <li>{@link fr.tm.elibel.smartqvt.qvt.qvtoperational.impl.MappingOperationImpl#getRefinedRelation <em>Refined Relation</em>}</li>
 *   <li>{@link fr.tm.elibel.smartqvt.qvt.qvtoperational.impl.MappingOperationImpl#getWhen <em>When</em>}</li>
 *   <li>{@link fr.tm.elibel.smartqvt.qvt.qvtoperational.impl.MappingOperationImpl#getWhere <em>Where</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MappingOperationImpl extends ImperativeOperationImpl implements MappingOperation {
	/**
	 * The cached value of the '{@link #getDisjunct() <em>Disjunct</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisjunct()
	 * @generated
	 * @ordered
	 */
	protected EList disjunct;

	/**
	 * The cached value of the '{@link #getInherited() <em>Inherited</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInherited()
	 * @generated
	 * @ordered
	 */
	protected EList inherited;

	/**
	 * The cached value of the '{@link #getMerged() <em>Merged</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMerged()
	 * @generated
	 * @ordered
	 */
	protected EList merged;

	/**
	 * The cached value of the '{@link #getRefinedRelation() <em>Refined Relation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefinedRelation()
	 * @generated
	 * @ordered
	 */
	protected Relation refinedRelation;

	/**
	 * The cached value of the '{@link #getWhen() <em>When</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhen()
	 * @generated
	 * @ordered
	 */
	protected OclExpression when;

	/**
	 * The cached value of the '{@link #getWhere() <em>Where</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhere()
	 * @generated
	 * @ordered
	 */
	protected OclExpression where;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MappingOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return QvtoperationalPackage.Literals.MAPPING_OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getDisjunct() {
		if (disjunct == null) {
			disjunct = new EObjectResolvingEList(MappingOperation.class, this, QvtoperationalPackage.MAPPING_OPERATION__DISJUNCT);
		}
		return disjunct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getInherited() {
		if (inherited == null) {
			inherited = new EObjectResolvingEList(MappingOperation.class, this, QvtoperationalPackage.MAPPING_OPERATION__INHERITED);
		}
		return inherited;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getMerged() {
		if (merged == null) {
			merged = new EObjectResolvingEList(MappingOperation.class, this, QvtoperationalPackage.MAPPING_OPERATION__MERGED);
		}
		return merged;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Relation getRefinedRelation() {
		if (refinedRelation != null && refinedRelation.eIsProxy()) {
			InternalEObject oldRefinedRelation = (InternalEObject)refinedRelation;
			refinedRelation = (Relation)eResolveProxy(oldRefinedRelation);
			if (refinedRelation != oldRefinedRelation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, QvtoperationalPackage.MAPPING_OPERATION__REFINED_RELATION, oldRefinedRelation, refinedRelation));
			}
		}
		return refinedRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Relation basicGetRefinedRelation() {
		return refinedRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefinedRelation(Relation newRefinedRelation) {
		Relation oldRefinedRelation = refinedRelation;
		refinedRelation = newRefinedRelation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QvtoperationalPackage.MAPPING_OPERATION__REFINED_RELATION, oldRefinedRelation, refinedRelation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OclExpression getWhen() {
		return when;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWhen(OclExpression newWhen, NotificationChain msgs) {
		OclExpression oldWhen = when;
		when = newWhen;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QvtoperationalPackage.MAPPING_OPERATION__WHEN, oldWhen, newWhen);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhen(OclExpression newWhen) {
		if (newWhen != when) {
			NotificationChain msgs = null;
			if (when != null)
				msgs = ((InternalEObject)when).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QvtoperationalPackage.MAPPING_OPERATION__WHEN, null, msgs);
			if (newWhen != null)
				msgs = ((InternalEObject)newWhen).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QvtoperationalPackage.MAPPING_OPERATION__WHEN, null, msgs);
			msgs = basicSetWhen(newWhen, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QvtoperationalPackage.MAPPING_OPERATION__WHEN, newWhen, newWhen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OclExpression getWhere() {
		return where;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWhere(OclExpression newWhere, NotificationChain msgs) {
		OclExpression oldWhere = where;
		where = newWhere;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QvtoperationalPackage.MAPPING_OPERATION__WHERE, oldWhere, newWhere);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhere(OclExpression newWhere) {
		if (newWhere != where) {
			NotificationChain msgs = null;
			if (where != null)
				msgs = ((InternalEObject)where).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QvtoperationalPackage.MAPPING_OPERATION__WHERE, null, msgs);
			if (newWhere != null)
				msgs = ((InternalEObject)newWhere).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QvtoperationalPackage.MAPPING_OPERATION__WHERE, null, msgs);
			msgs = basicSetWhere(newWhere, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QvtoperationalPackage.MAPPING_OPERATION__WHERE, newWhere, newWhere));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QvtoperationalPackage.MAPPING_OPERATION__WHEN:
				return basicSetWhen(null, msgs);
			case QvtoperationalPackage.MAPPING_OPERATION__WHERE:
				return basicSetWhere(null, msgs);
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
			case QvtoperationalPackage.MAPPING_OPERATION__DISJUNCT:
				return getDisjunct();
			case QvtoperationalPackage.MAPPING_OPERATION__INHERITED:
				return getInherited();
			case QvtoperationalPackage.MAPPING_OPERATION__MERGED:
				return getMerged();
			case QvtoperationalPackage.MAPPING_OPERATION__REFINED_RELATION:
				if (resolve) return getRefinedRelation();
				return basicGetRefinedRelation();
			case QvtoperationalPackage.MAPPING_OPERATION__WHEN:
				return getWhen();
			case QvtoperationalPackage.MAPPING_OPERATION__WHERE:
				return getWhere();
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
			case QvtoperationalPackage.MAPPING_OPERATION__DISJUNCT:
				getDisjunct().clear();
				getDisjunct().addAll((Collection)newValue);
				return;
			case QvtoperationalPackage.MAPPING_OPERATION__INHERITED:
				getInherited().clear();
				getInherited().addAll((Collection)newValue);
				return;
			case QvtoperationalPackage.MAPPING_OPERATION__MERGED:
				getMerged().clear();
				getMerged().addAll((Collection)newValue);
				return;
			case QvtoperationalPackage.MAPPING_OPERATION__REFINED_RELATION:
				setRefinedRelation((Relation)newValue);
				return;
			case QvtoperationalPackage.MAPPING_OPERATION__WHEN:
				setWhen((OclExpression)newValue);
				return;
			case QvtoperationalPackage.MAPPING_OPERATION__WHERE:
				setWhere((OclExpression)newValue);
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
			case QvtoperationalPackage.MAPPING_OPERATION__DISJUNCT:
				getDisjunct().clear();
				return;
			case QvtoperationalPackage.MAPPING_OPERATION__INHERITED:
				getInherited().clear();
				return;
			case QvtoperationalPackage.MAPPING_OPERATION__MERGED:
				getMerged().clear();
				return;
			case QvtoperationalPackage.MAPPING_OPERATION__REFINED_RELATION:
				setRefinedRelation((Relation)null);
				return;
			case QvtoperationalPackage.MAPPING_OPERATION__WHEN:
				setWhen((OclExpression)null);
				return;
			case QvtoperationalPackage.MAPPING_OPERATION__WHERE:
				setWhere((OclExpression)null);
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
			case QvtoperationalPackage.MAPPING_OPERATION__DISJUNCT:
				return disjunct != null && !disjunct.isEmpty();
			case QvtoperationalPackage.MAPPING_OPERATION__INHERITED:
				return inherited != null && !inherited.isEmpty();
			case QvtoperationalPackage.MAPPING_OPERATION__MERGED:
				return merged != null && !merged.isEmpty();
			case QvtoperationalPackage.MAPPING_OPERATION__REFINED_RELATION:
				return refinedRelation != null;
			case QvtoperationalPackage.MAPPING_OPERATION__WHEN:
				return when != null;
			case QvtoperationalPackage.MAPPING_OPERATION__WHERE:
				return where != null;
		}
		return super.eIsSet(featureID);
	}

} //MappingOperationImpl
