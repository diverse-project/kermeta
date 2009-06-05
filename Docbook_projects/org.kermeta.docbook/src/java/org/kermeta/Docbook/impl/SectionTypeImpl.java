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
import org.kermeta.Docbook.FigureType;
import org.kermeta.Docbook.InformaltableType;
import org.kermeta.Docbook.ItemizedlistType;
import org.kermeta.Docbook.MediaobjectType;
import org.kermeta.Docbook.NoteType;
import org.kermeta.Docbook.OrderedlistType;
import org.kermeta.Docbook.ParaType;
import org.kermeta.Docbook.ProgramlistingType;
import org.kermeta.Docbook.SectionType;
import org.kermeta.Docbook.TableType;
import org.kermeta.Docbook.TipType;
import org.kermeta.Docbook.TitleType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Section Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.kermeta.Docbook.impl.SectionTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.kermeta.Docbook.impl.SectionTypeImpl#getItemizedlist <em>Itemizedlist</em>}</li>
 *   <li>{@link org.kermeta.Docbook.impl.SectionTypeImpl#getMediaobject <em>Mediaobject</em>}</li>
 *   <li>{@link org.kermeta.Docbook.impl.SectionTypeImpl#getNote <em>Note</em>}</li>
 *   <li>{@link org.kermeta.Docbook.impl.SectionTypeImpl#getPara <em>Para</em>}</li>
 *   <li>{@link org.kermeta.Docbook.impl.SectionTypeImpl#getProgramlisting <em>Programlisting</em>}</li>
 *   <li>{@link org.kermeta.Docbook.impl.SectionTypeImpl#getSection <em>Section</em>}</li>
 *   <li>{@link org.kermeta.Docbook.impl.SectionTypeImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.kermeta.Docbook.impl.SectionTypeImpl#getFigure <em>Figure</em>}</li>
 *   <li>{@link org.kermeta.Docbook.impl.SectionTypeImpl#getInformaltable <em>Informaltable</em>}</li>
 *   <li>{@link org.kermeta.Docbook.impl.SectionTypeImpl#getOrderedlist <em>Orderedlist</em>}</li>
 *   <li>{@link org.kermeta.Docbook.impl.SectionTypeImpl#getTable <em>Table</em>}</li>
 *   <li>{@link org.kermeta.Docbook.impl.SectionTypeImpl#getWarning <em>Warning</em>}</li>
 *   <li>{@link org.kermeta.Docbook.impl.SectionTypeImpl#getTip <em>Tip</em>}</li>
 *   <li>{@link org.kermeta.Docbook.impl.SectionTypeImpl#getCaution <em>Caution</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SectionTypeImpl extends EObjectImpl implements SectionType {
	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group;

	/**
	 * The cached value of the '{@link #getTip() <em>Tip</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTip()
	 * @generated
	 * @ordered
	 */
	protected TipType tip;

	/**
	 * The default value of the '{@link #getCaution() <em>Caution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaution()
	 * @generated
	 * @ordered
	 */
	protected static final String CAUTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCaution() <em>Caution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaution()
	 * @generated
	 * @ordered
	 */
	protected String caution = CAUTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SectionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DocbookPackage.Literals.SECTION_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, DocbookPackage.SECTION_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ItemizedlistType> getItemizedlist() {
		return getGroup().list(DocbookPackage.Literals.SECTION_TYPE__ITEMIZEDLIST);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MediaobjectType> getMediaobject() {
		return getGroup().list(DocbookPackage.Literals.SECTION_TYPE__MEDIAOBJECT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NoteType> getNote() {
		return getGroup().list(DocbookPackage.Literals.SECTION_TYPE__NOTE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ParaType> getPara() {
		return getGroup().list(DocbookPackage.Literals.SECTION_TYPE__PARA);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProgramlistingType> getProgramlisting() {
		return getGroup().list(DocbookPackage.Literals.SECTION_TYPE__PROGRAMLISTING);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SectionType> getSection() {
		return getGroup().list(DocbookPackage.Literals.SECTION_TYPE__SECTION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TitleType> getTitle() {
		return getGroup().list(DocbookPackage.Literals.SECTION_TYPE__TITLE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FigureType> getFigure() {
		return getGroup().list(DocbookPackage.Literals.SECTION_TYPE__FIGURE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InformaltableType> getInformaltable() {
		return getGroup().list(DocbookPackage.Literals.SECTION_TYPE__INFORMALTABLE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OrderedlistType> getOrderedlist() {
		return getGroup().list(DocbookPackage.Literals.SECTION_TYPE__ORDEREDLIST);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TableType> getTable() {
		return getGroup().list(DocbookPackage.Literals.SECTION_TYPE__TABLE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getWarning() {
		return getGroup().list(DocbookPackage.Literals.SECTION_TYPE__WARNING);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TipType getTip() {
		return tip;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTip(TipType newTip, NotificationChain msgs) {
		TipType oldTip = tip;
		tip = newTip;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DocbookPackage.SECTION_TYPE__TIP, oldTip, newTip);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTip(TipType newTip) {
		if (newTip != tip) {
			NotificationChain msgs = null;
			if (tip != null)
				msgs = ((InternalEObject)tip).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DocbookPackage.SECTION_TYPE__TIP, null, msgs);
			if (newTip != null)
				msgs = ((InternalEObject)newTip).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DocbookPackage.SECTION_TYPE__TIP, null, msgs);
			msgs = basicSetTip(newTip, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.SECTION_TYPE__TIP, newTip, newTip));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCaution() {
		return caution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCaution(String newCaution) {
		String oldCaution = caution;
		caution = newCaution;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.SECTION_TYPE__CAUTION, oldCaution, caution));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DocbookPackage.SECTION_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case DocbookPackage.SECTION_TYPE__ITEMIZEDLIST:
				return ((InternalEList<?>)getItemizedlist()).basicRemove(otherEnd, msgs);
			case DocbookPackage.SECTION_TYPE__MEDIAOBJECT:
				return ((InternalEList<?>)getMediaobject()).basicRemove(otherEnd, msgs);
			case DocbookPackage.SECTION_TYPE__NOTE:
				return ((InternalEList<?>)getNote()).basicRemove(otherEnd, msgs);
			case DocbookPackage.SECTION_TYPE__PARA:
				return ((InternalEList<?>)getPara()).basicRemove(otherEnd, msgs);
			case DocbookPackage.SECTION_TYPE__PROGRAMLISTING:
				return ((InternalEList<?>)getProgramlisting()).basicRemove(otherEnd, msgs);
			case DocbookPackage.SECTION_TYPE__SECTION:
				return ((InternalEList<?>)getSection()).basicRemove(otherEnd, msgs);
			case DocbookPackage.SECTION_TYPE__TITLE:
				return ((InternalEList<?>)getTitle()).basicRemove(otherEnd, msgs);
			case DocbookPackage.SECTION_TYPE__FIGURE:
				return ((InternalEList<?>)getFigure()).basicRemove(otherEnd, msgs);
			case DocbookPackage.SECTION_TYPE__INFORMALTABLE:
				return ((InternalEList<?>)getInformaltable()).basicRemove(otherEnd, msgs);
			case DocbookPackage.SECTION_TYPE__ORDEREDLIST:
				return ((InternalEList<?>)getOrderedlist()).basicRemove(otherEnd, msgs);
			case DocbookPackage.SECTION_TYPE__TABLE:
				return ((InternalEList<?>)getTable()).basicRemove(otherEnd, msgs);
			case DocbookPackage.SECTION_TYPE__TIP:
				return basicSetTip(null, msgs);
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
			case DocbookPackage.SECTION_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case DocbookPackage.SECTION_TYPE__ITEMIZEDLIST:
				return getItemizedlist();
			case DocbookPackage.SECTION_TYPE__MEDIAOBJECT:
				return getMediaobject();
			case DocbookPackage.SECTION_TYPE__NOTE:
				return getNote();
			case DocbookPackage.SECTION_TYPE__PARA:
				return getPara();
			case DocbookPackage.SECTION_TYPE__PROGRAMLISTING:
				return getProgramlisting();
			case DocbookPackage.SECTION_TYPE__SECTION:
				return getSection();
			case DocbookPackage.SECTION_TYPE__TITLE:
				return getTitle();
			case DocbookPackage.SECTION_TYPE__FIGURE:
				return getFigure();
			case DocbookPackage.SECTION_TYPE__INFORMALTABLE:
				return getInformaltable();
			case DocbookPackage.SECTION_TYPE__ORDEREDLIST:
				return getOrderedlist();
			case DocbookPackage.SECTION_TYPE__TABLE:
				return getTable();
			case DocbookPackage.SECTION_TYPE__WARNING:
				return getWarning();
			case DocbookPackage.SECTION_TYPE__TIP:
				return getTip();
			case DocbookPackage.SECTION_TYPE__CAUTION:
				return getCaution();
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
			case DocbookPackage.SECTION_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case DocbookPackage.SECTION_TYPE__ITEMIZEDLIST:
				getItemizedlist().clear();
				getItemizedlist().addAll((Collection<? extends ItemizedlistType>)newValue);
				return;
			case DocbookPackage.SECTION_TYPE__MEDIAOBJECT:
				getMediaobject().clear();
				getMediaobject().addAll((Collection<? extends MediaobjectType>)newValue);
				return;
			case DocbookPackage.SECTION_TYPE__NOTE:
				getNote().clear();
				getNote().addAll((Collection<? extends NoteType>)newValue);
				return;
			case DocbookPackage.SECTION_TYPE__PARA:
				getPara().clear();
				getPara().addAll((Collection<? extends ParaType>)newValue);
				return;
			case DocbookPackage.SECTION_TYPE__PROGRAMLISTING:
				getProgramlisting().clear();
				getProgramlisting().addAll((Collection<? extends ProgramlistingType>)newValue);
				return;
			case DocbookPackage.SECTION_TYPE__SECTION:
				getSection().clear();
				getSection().addAll((Collection<? extends SectionType>)newValue);
				return;
			case DocbookPackage.SECTION_TYPE__TITLE:
				getTitle().clear();
				getTitle().addAll((Collection<? extends TitleType>)newValue);
				return;
			case DocbookPackage.SECTION_TYPE__FIGURE:
				getFigure().clear();
				getFigure().addAll((Collection<? extends FigureType>)newValue);
				return;
			case DocbookPackage.SECTION_TYPE__INFORMALTABLE:
				getInformaltable().clear();
				getInformaltable().addAll((Collection<? extends InformaltableType>)newValue);
				return;
			case DocbookPackage.SECTION_TYPE__ORDEREDLIST:
				getOrderedlist().clear();
				getOrderedlist().addAll((Collection<? extends OrderedlistType>)newValue);
				return;
			case DocbookPackage.SECTION_TYPE__TABLE:
				getTable().clear();
				getTable().addAll((Collection<? extends TableType>)newValue);
				return;
			case DocbookPackage.SECTION_TYPE__WARNING:
				getWarning().clear();
				getWarning().addAll((Collection<? extends String>)newValue);
				return;
			case DocbookPackage.SECTION_TYPE__TIP:
				setTip((TipType)newValue);
				return;
			case DocbookPackage.SECTION_TYPE__CAUTION:
				setCaution((String)newValue);
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
			case DocbookPackage.SECTION_TYPE__GROUP:
				getGroup().clear();
				return;
			case DocbookPackage.SECTION_TYPE__ITEMIZEDLIST:
				getItemizedlist().clear();
				return;
			case DocbookPackage.SECTION_TYPE__MEDIAOBJECT:
				getMediaobject().clear();
				return;
			case DocbookPackage.SECTION_TYPE__NOTE:
				getNote().clear();
				return;
			case DocbookPackage.SECTION_TYPE__PARA:
				getPara().clear();
				return;
			case DocbookPackage.SECTION_TYPE__PROGRAMLISTING:
				getProgramlisting().clear();
				return;
			case DocbookPackage.SECTION_TYPE__SECTION:
				getSection().clear();
				return;
			case DocbookPackage.SECTION_TYPE__TITLE:
				getTitle().clear();
				return;
			case DocbookPackage.SECTION_TYPE__FIGURE:
				getFigure().clear();
				return;
			case DocbookPackage.SECTION_TYPE__INFORMALTABLE:
				getInformaltable().clear();
				return;
			case DocbookPackage.SECTION_TYPE__ORDEREDLIST:
				getOrderedlist().clear();
				return;
			case DocbookPackage.SECTION_TYPE__TABLE:
				getTable().clear();
				return;
			case DocbookPackage.SECTION_TYPE__WARNING:
				getWarning().clear();
				return;
			case DocbookPackage.SECTION_TYPE__TIP:
				setTip((TipType)null);
				return;
			case DocbookPackage.SECTION_TYPE__CAUTION:
				setCaution(CAUTION_EDEFAULT);
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
			case DocbookPackage.SECTION_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case DocbookPackage.SECTION_TYPE__ITEMIZEDLIST:
				return !getItemizedlist().isEmpty();
			case DocbookPackage.SECTION_TYPE__MEDIAOBJECT:
				return !getMediaobject().isEmpty();
			case DocbookPackage.SECTION_TYPE__NOTE:
				return !getNote().isEmpty();
			case DocbookPackage.SECTION_TYPE__PARA:
				return !getPara().isEmpty();
			case DocbookPackage.SECTION_TYPE__PROGRAMLISTING:
				return !getProgramlisting().isEmpty();
			case DocbookPackage.SECTION_TYPE__SECTION:
				return !getSection().isEmpty();
			case DocbookPackage.SECTION_TYPE__TITLE:
				return !getTitle().isEmpty();
			case DocbookPackage.SECTION_TYPE__FIGURE:
				return !getFigure().isEmpty();
			case DocbookPackage.SECTION_TYPE__INFORMALTABLE:
				return !getInformaltable().isEmpty();
			case DocbookPackage.SECTION_TYPE__ORDEREDLIST:
				return !getOrderedlist().isEmpty();
			case DocbookPackage.SECTION_TYPE__TABLE:
				return !getTable().isEmpty();
			case DocbookPackage.SECTION_TYPE__WARNING:
				return !getWarning().isEmpty();
			case DocbookPackage.SECTION_TYPE__TIP:
				return tip != null;
			case DocbookPackage.SECTION_TYPE__CAUTION:
				return CAUTION_EDEFAULT == null ? caution != null : !CAUTION_EDEFAULT.equals(caution);
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
		result.append(" (group: ");
		result.append(group);
		result.append(", caution: ");
		result.append(caution);
		result.append(')');
		return result.toString();
	}

} //SectionTypeImpl
