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

import org.kermeta.Docbook.AbstractType;
import org.kermeta.Docbook.AuthorType;
import org.kermeta.Docbook.BookinfoType;
import org.kermeta.Docbook.ConfgroupType;
import org.kermeta.Docbook.DocbookPackage;
import org.kermeta.Docbook.KeywordsetType;
import org.kermeta.Docbook.PublisherType;
import org.kermeta.Docbook.TitleType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bookinfo Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.kermeta.Docbook.impl.BookinfoTypeImpl#getPubdate <em>Pubdate</em>}</li>
 *   <li>{@link org.kermeta.Docbook.impl.BookinfoTypeImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link org.kermeta.Docbook.impl.BookinfoTypeImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.kermeta.Docbook.impl.BookinfoTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.kermeta.Docbook.impl.BookinfoTypeImpl#getBibliomisc <em>Bibliomisc</em>}</li>
 *   <li>{@link org.kermeta.Docbook.impl.BookinfoTypeImpl#getDate <em>Date</em>}</li>
 *   <li>{@link org.kermeta.Docbook.impl.BookinfoTypeImpl#getKeywordset <em>Keywordset</em>}</li>
 *   <li>{@link org.kermeta.Docbook.impl.BookinfoTypeImpl#getSubtitle <em>Subtitle</em>}</li>
 *   <li>{@link org.kermeta.Docbook.impl.BookinfoTypeImpl#getAbstract <em>Abstract</em>}</li>
 *   <li>{@link org.kermeta.Docbook.impl.BookinfoTypeImpl#getPublisher <em>Publisher</em>}</li>
 *   <li>{@link org.kermeta.Docbook.impl.BookinfoTypeImpl#getConfgroup <em>Confgroup</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BookinfoTypeImpl extends EObjectImpl implements BookinfoType {
	/**
	 * The default value of the '{@link #getPubdate() <em>Pubdate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPubdate()
	 * @generated
	 * @ordered
	 */
	protected static final String PUBDATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPubdate() <em>Pubdate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPubdate()
	 * @generated
	 * @ordered
	 */
	protected String pubdate = PUBDATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAuthor() <em>Author</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthor()
	 * @generated
	 * @ordered
	 */
	protected AuthorType author;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected TitleType title;

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
	 * The cached value of the '{@link #getAbstract() <em>Abstract</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstract()
	 * @generated
	 * @ordered
	 */
	protected AbstractType abstract_;

	/**
	 * The cached value of the '{@link #getPublisher() <em>Publisher</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublisher()
	 * @generated
	 * @ordered
	 */
	protected PublisherType publisher;

	/**
	 * The cached value of the '{@link #getConfgroup() <em>Confgroup</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfgroup()
	 * @generated
	 * @ordered
	 */
	protected ConfgroupType confgroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BookinfoTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DocbookPackage.Literals.BOOKINFO_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPubdate() {
		return pubdate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPubdate(String newPubdate) {
		String oldPubdate = pubdate;
		pubdate = newPubdate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.BOOKINFO_TYPE__PUBDATE, oldPubdate, pubdate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuthorType getAuthor() {
		return author;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAuthor(AuthorType newAuthor, NotificationChain msgs) {
		AuthorType oldAuthor = author;
		author = newAuthor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DocbookPackage.BOOKINFO_TYPE__AUTHOR, oldAuthor, newAuthor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthor(AuthorType newAuthor) {
		if (newAuthor != author) {
			NotificationChain msgs = null;
			if (author != null)
				msgs = ((InternalEObject)author).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DocbookPackage.BOOKINFO_TYPE__AUTHOR, null, msgs);
			if (newAuthor != null)
				msgs = ((InternalEObject)newAuthor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DocbookPackage.BOOKINFO_TYPE__AUTHOR, null, msgs);
			msgs = basicSetAuthor(newAuthor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.BOOKINFO_TYPE__AUTHOR, newAuthor, newAuthor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TitleType getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTitle(TitleType newTitle, NotificationChain msgs) {
		TitleType oldTitle = title;
		title = newTitle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DocbookPackage.BOOKINFO_TYPE__TITLE, oldTitle, newTitle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(TitleType newTitle) {
		if (newTitle != title) {
			NotificationChain msgs = null;
			if (title != null)
				msgs = ((InternalEObject)title).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DocbookPackage.BOOKINFO_TYPE__TITLE, null, msgs);
			if (newTitle != null)
				msgs = ((InternalEObject)newTitle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DocbookPackage.BOOKINFO_TYPE__TITLE, null, msgs);
			msgs = basicSetTitle(newTitle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.BOOKINFO_TYPE__TITLE, newTitle, newTitle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, DocbookPackage.BOOKINFO_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getBibliomisc() {
		return getGroup().list(DocbookPackage.Literals.BOOKINFO_TYPE__BIBLIOMISC);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getDate() {
		return getGroup().list(DocbookPackage.Literals.BOOKINFO_TYPE__DATE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<KeywordsetType> getKeywordset() {
		return getGroup().list(DocbookPackage.Literals.BOOKINFO_TYPE__KEYWORDSET);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getSubtitle() {
		return getGroup().list(DocbookPackage.Literals.BOOKINFO_TYPE__SUBTITLE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractType getAbstract() {
		return abstract_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstract(AbstractType newAbstract, NotificationChain msgs) {
		AbstractType oldAbstract = abstract_;
		abstract_ = newAbstract;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DocbookPackage.BOOKINFO_TYPE__ABSTRACT, oldAbstract, newAbstract);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbstract(AbstractType newAbstract) {
		if (newAbstract != abstract_) {
			NotificationChain msgs = null;
			if (abstract_ != null)
				msgs = ((InternalEObject)abstract_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DocbookPackage.BOOKINFO_TYPE__ABSTRACT, null, msgs);
			if (newAbstract != null)
				msgs = ((InternalEObject)newAbstract).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DocbookPackage.BOOKINFO_TYPE__ABSTRACT, null, msgs);
			msgs = basicSetAbstract(newAbstract, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.BOOKINFO_TYPE__ABSTRACT, newAbstract, newAbstract));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PublisherType getPublisher() {
		return publisher;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPublisher(PublisherType newPublisher, NotificationChain msgs) {
		PublisherType oldPublisher = publisher;
		publisher = newPublisher;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DocbookPackage.BOOKINFO_TYPE__PUBLISHER, oldPublisher, newPublisher);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPublisher(PublisherType newPublisher) {
		if (newPublisher != publisher) {
			NotificationChain msgs = null;
			if (publisher != null)
				msgs = ((InternalEObject)publisher).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DocbookPackage.BOOKINFO_TYPE__PUBLISHER, null, msgs);
			if (newPublisher != null)
				msgs = ((InternalEObject)newPublisher).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DocbookPackage.BOOKINFO_TYPE__PUBLISHER, null, msgs);
			msgs = basicSetPublisher(newPublisher, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.BOOKINFO_TYPE__PUBLISHER, newPublisher, newPublisher));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfgroupType getConfgroup() {
		return confgroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConfgroup(ConfgroupType newConfgroup, NotificationChain msgs) {
		ConfgroupType oldConfgroup = confgroup;
		confgroup = newConfgroup;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DocbookPackage.BOOKINFO_TYPE__CONFGROUP, oldConfgroup, newConfgroup);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfgroup(ConfgroupType newConfgroup) {
		if (newConfgroup != confgroup) {
			NotificationChain msgs = null;
			if (confgroup != null)
				msgs = ((InternalEObject)confgroup).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DocbookPackage.BOOKINFO_TYPE__CONFGROUP, null, msgs);
			if (newConfgroup != null)
				msgs = ((InternalEObject)newConfgroup).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DocbookPackage.BOOKINFO_TYPE__CONFGROUP, null, msgs);
			msgs = basicSetConfgroup(newConfgroup, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.BOOKINFO_TYPE__CONFGROUP, newConfgroup, newConfgroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DocbookPackage.BOOKINFO_TYPE__AUTHOR:
				return basicSetAuthor(null, msgs);
			case DocbookPackage.BOOKINFO_TYPE__TITLE:
				return basicSetTitle(null, msgs);
			case DocbookPackage.BOOKINFO_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case DocbookPackage.BOOKINFO_TYPE__KEYWORDSET:
				return ((InternalEList<?>)getKeywordset()).basicRemove(otherEnd, msgs);
			case DocbookPackage.BOOKINFO_TYPE__ABSTRACT:
				return basicSetAbstract(null, msgs);
			case DocbookPackage.BOOKINFO_TYPE__PUBLISHER:
				return basicSetPublisher(null, msgs);
			case DocbookPackage.BOOKINFO_TYPE__CONFGROUP:
				return basicSetConfgroup(null, msgs);
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
			case DocbookPackage.BOOKINFO_TYPE__PUBDATE:
				return getPubdate();
			case DocbookPackage.BOOKINFO_TYPE__AUTHOR:
				return getAuthor();
			case DocbookPackage.BOOKINFO_TYPE__TITLE:
				return getTitle();
			case DocbookPackage.BOOKINFO_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case DocbookPackage.BOOKINFO_TYPE__BIBLIOMISC:
				return getBibliomisc();
			case DocbookPackage.BOOKINFO_TYPE__DATE:
				return getDate();
			case DocbookPackage.BOOKINFO_TYPE__KEYWORDSET:
				return getKeywordset();
			case DocbookPackage.BOOKINFO_TYPE__SUBTITLE:
				return getSubtitle();
			case DocbookPackage.BOOKINFO_TYPE__ABSTRACT:
				return getAbstract();
			case DocbookPackage.BOOKINFO_TYPE__PUBLISHER:
				return getPublisher();
			case DocbookPackage.BOOKINFO_TYPE__CONFGROUP:
				return getConfgroup();
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
			case DocbookPackage.BOOKINFO_TYPE__PUBDATE:
				setPubdate((String)newValue);
				return;
			case DocbookPackage.BOOKINFO_TYPE__AUTHOR:
				setAuthor((AuthorType)newValue);
				return;
			case DocbookPackage.BOOKINFO_TYPE__TITLE:
				setTitle((TitleType)newValue);
				return;
			case DocbookPackage.BOOKINFO_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case DocbookPackage.BOOKINFO_TYPE__BIBLIOMISC:
				getBibliomisc().clear();
				getBibliomisc().addAll((Collection<? extends String>)newValue);
				return;
			case DocbookPackage.BOOKINFO_TYPE__DATE:
				getDate().clear();
				getDate().addAll((Collection<? extends String>)newValue);
				return;
			case DocbookPackage.BOOKINFO_TYPE__KEYWORDSET:
				getKeywordset().clear();
				getKeywordset().addAll((Collection<? extends KeywordsetType>)newValue);
				return;
			case DocbookPackage.BOOKINFO_TYPE__SUBTITLE:
				getSubtitle().clear();
				getSubtitle().addAll((Collection<? extends String>)newValue);
				return;
			case DocbookPackage.BOOKINFO_TYPE__ABSTRACT:
				setAbstract((AbstractType)newValue);
				return;
			case DocbookPackage.BOOKINFO_TYPE__PUBLISHER:
				setPublisher((PublisherType)newValue);
				return;
			case DocbookPackage.BOOKINFO_TYPE__CONFGROUP:
				setConfgroup((ConfgroupType)newValue);
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
			case DocbookPackage.BOOKINFO_TYPE__PUBDATE:
				setPubdate(PUBDATE_EDEFAULT);
				return;
			case DocbookPackage.BOOKINFO_TYPE__AUTHOR:
				setAuthor((AuthorType)null);
				return;
			case DocbookPackage.BOOKINFO_TYPE__TITLE:
				setTitle((TitleType)null);
				return;
			case DocbookPackage.BOOKINFO_TYPE__GROUP:
				getGroup().clear();
				return;
			case DocbookPackage.BOOKINFO_TYPE__BIBLIOMISC:
				getBibliomisc().clear();
				return;
			case DocbookPackage.BOOKINFO_TYPE__DATE:
				getDate().clear();
				return;
			case DocbookPackage.BOOKINFO_TYPE__KEYWORDSET:
				getKeywordset().clear();
				return;
			case DocbookPackage.BOOKINFO_TYPE__SUBTITLE:
				getSubtitle().clear();
				return;
			case DocbookPackage.BOOKINFO_TYPE__ABSTRACT:
				setAbstract((AbstractType)null);
				return;
			case DocbookPackage.BOOKINFO_TYPE__PUBLISHER:
				setPublisher((PublisherType)null);
				return;
			case DocbookPackage.BOOKINFO_TYPE__CONFGROUP:
				setConfgroup((ConfgroupType)null);
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
			case DocbookPackage.BOOKINFO_TYPE__PUBDATE:
				return PUBDATE_EDEFAULT == null ? pubdate != null : !PUBDATE_EDEFAULT.equals(pubdate);
			case DocbookPackage.BOOKINFO_TYPE__AUTHOR:
				return author != null;
			case DocbookPackage.BOOKINFO_TYPE__TITLE:
				return title != null;
			case DocbookPackage.BOOKINFO_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case DocbookPackage.BOOKINFO_TYPE__BIBLIOMISC:
				return !getBibliomisc().isEmpty();
			case DocbookPackage.BOOKINFO_TYPE__DATE:
				return !getDate().isEmpty();
			case DocbookPackage.BOOKINFO_TYPE__KEYWORDSET:
				return !getKeywordset().isEmpty();
			case DocbookPackage.BOOKINFO_TYPE__SUBTITLE:
				return !getSubtitle().isEmpty();
			case DocbookPackage.BOOKINFO_TYPE__ABSTRACT:
				return abstract_ != null;
			case DocbookPackage.BOOKINFO_TYPE__PUBLISHER:
				return publisher != null;
			case DocbookPackage.BOOKINFO_TYPE__CONFGROUP:
				return confgroup != null;
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
		result.append(" (pubdate: ");
		result.append(pubdate);
		result.append(", group: ");
		result.append(group);
		result.append(')');
		return result.toString();
	}

} //BookinfoTypeImpl
