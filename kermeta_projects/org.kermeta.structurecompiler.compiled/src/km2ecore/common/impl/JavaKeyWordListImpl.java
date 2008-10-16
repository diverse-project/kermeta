/**
 * <copyright>
 * </copyright>
 *
 * $Id: JavaKeyWordListImpl.java,v 1.5 2008-10-16 13:18:07 cfaucher Exp $
 */
package km2ecore.common.impl;

import kermeta.language.structure.impl.ObjectImpl;

import kermeta.utils.Hashtable;

import km2ecore.common.CommonPackage;
import km2ecore.common.JavaKeyWordList;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Java Key Word List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link km2ecore.common.impl.JavaKeyWordListImpl#getKeywords <em>Keywords</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class JavaKeyWordListImpl extends ObjectImpl implements JavaKeyWordList {
	/**
	 * The cached value of the '{@link #getKeywords() <em>Keywords</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeywords()
	 * @generated
	 * @ordered
	 */
	protected Hashtable<String, String> keywords;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JavaKeyWordListImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommonPackage.Literals.JAVA_KEY_WORD_LIST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public Hashtable<String, String> getKeywords() {
		if (keywords != null && keywords.eIsProxy()) {
			InternalEObject oldKeywords = (InternalEObject) keywords;
			keywords = (Hashtable<String, String>) eResolveProxy(oldKeywords);
			if (keywords != oldKeywords) {
				InternalEObject newKeywords = (InternalEObject) keywords;
				NotificationChain msgs = oldKeywords.eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- CommonPackage.JAVA_KEY_WORD_LIST__KEYWORDS,
						null, null);
				if (newKeywords.eInternalContainer() == null) {
					msgs = newKeywords.eInverseAdd(this, EOPPOSITE_FEATURE_BASE
							- CommonPackage.JAVA_KEY_WORD_LIST__KEYWORDS, null,
							msgs);
				}
				if (msgs != null)
					msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							CommonPackage.JAVA_KEY_WORD_LIST__KEYWORDS,
							oldKeywords, keywords));
			}
		}
		return keywords;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hashtable<String, String> basicGetKeywords() {
		return keywords;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKeywords(
			Hashtable<String, String> newKeywords, NotificationChain msgs) {
		Hashtable<String, String> oldKeywords = keywords;
		keywords = newKeywords;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET,
					CommonPackage.JAVA_KEY_WORD_LIST__KEYWORDS, oldKeywords,
					newKeywords);
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
	public void setKeywords(Hashtable<String, String> newKeywords) {
		if (newKeywords != keywords) {
			NotificationChain msgs = null;
			if (keywords != null)
				msgs = ((InternalEObject) keywords).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- CommonPackage.JAVA_KEY_WORD_LIST__KEYWORDS,
						null, msgs);
			if (newKeywords != null)
				msgs = ((InternalEObject) newKeywords).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- CommonPackage.JAVA_KEY_WORD_LIST__KEYWORDS,
						null, msgs);
			msgs = basicSetKeywords(newKeywords, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CommonPackage.JAVA_KEY_WORD_LIST__KEYWORDS, newKeywords,
					newKeywords));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean isKeyword(String str) {

		java.lang.Boolean result = null;

		result = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoid(this.getKeywords().getValue(str)));

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addKeyword(String kw) {

		this.getKeywords().put(kw, kw);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initialize() {

		this
				.setKeywords(((kermeta.utils.Hashtable<java.lang.String, java.lang.String>) org.kermeta.compil.runtime.helper.language.ClassUtil
						.newObject("kermeta.utils.Hashtable<java.lang.String, java.lang.String>")));

		this.addKeyword("abstract");

		this.addKeyword("continue");

		this.addKeyword("for");

		this.addKeyword("new");

		this.addKeyword("switch");

		this.addKeyword("assert");

		this.addKeyword("default");

		this.addKeyword("goto");

		this.addKeyword("package");

		this.addKeyword("synchronized");

		this.addKeyword("boolean");

		this.addKeyword("do");

		this.addKeyword("if");

		this.addKeyword("private");

		this.addKeyword("this");

		this.addKeyword("break");

		this.addKeyword("double");

		this.addKeyword("implements");

		this.addKeyword("protected");

		this.addKeyword("throw");

		this.addKeyword("byte");

		this.addKeyword("else");

		this.addKeyword("import");

		this.addKeyword("public");

		this.addKeyword("throws");

		this.addKeyword("case");

		this.addKeyword("enum");

		this.addKeyword("instanceof");

		this.addKeyword("return");

		this.addKeyword("transient");

		this.addKeyword("catch");

		this.addKeyword("extends");

		this.addKeyword("int");

		this.addKeyword("short");

		this.addKeyword("try");

		this.addKeyword("char");

		this.addKeyword("final");

		this.addKeyword("interface");

		this.addKeyword("static");

		this.addKeyword("void");

		this.addKeyword("class");

		this.addKeyword("finally");

		this.addKeyword("long");

		this.addKeyword("strictfp");

		this.addKeyword("volatile");

		this.addKeyword("const");

		this.addKeyword("float");

		this.addKeyword("native");

		this.addKeyword("super");

		this.addKeyword("while");

		this.addKeyword("true");

		this.addKeyword("false");

		this.addKeyword("null");

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
		case CommonPackage.JAVA_KEY_WORD_LIST__KEYWORDS:
			return basicSetKeywords(null, msgs);
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
		case CommonPackage.JAVA_KEY_WORD_LIST__KEYWORDS:
			if (resolve)
				return getKeywords();
			return basicGetKeywords();
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
		case CommonPackage.JAVA_KEY_WORD_LIST__KEYWORDS:
			setKeywords((Hashtable<String, String>) newValue);
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
		case CommonPackage.JAVA_KEY_WORD_LIST__KEYWORDS:
			setKeywords((Hashtable<String, String>) null);
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
		case CommonPackage.JAVA_KEY_WORD_LIST__KEYWORDS:
			return keywords != null;
		}
		return super.eIsSet(featureID);
	}

} //JavaKeyWordListImpl
