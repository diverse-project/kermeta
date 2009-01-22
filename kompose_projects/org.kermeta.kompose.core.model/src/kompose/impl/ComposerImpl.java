/**
 * <copyright>
 * </copyright>
 *
 * $Id: ComposerImpl.java,v 1.2 2009-01-22 20:26:53 mclavreu Exp $
 */
package kompose.impl;

import java.util.Collection;

import kompose.Composer;
import kompose.ElementDirective;
import kompose.KomposePackage;
import kompose.Mergeable;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Composer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link kompose.impl.ComposerImpl#getPredirectivesPM <em>Predirectives PM</em>}</li>
 *   <li>{@link kompose.impl.ComposerImpl#getPostdirectives <em>Postdirectives</em>}</li>
 *   <li>{@link kompose.impl.ComposerImpl#getPrimaryModelURI <em>Primary Model URI</em>}</li>
 *   <li>{@link kompose.impl.ComposerImpl#getAspectModelURI <em>Aspect Model URI</em>}</li>
 *   <li>{@link kompose.impl.ComposerImpl#getComposedModelURI <em>Composed Model URI</em>}</li>
 *   <li>{@link kompose.impl.ComposerImpl#getPredirectivesAM <em>Predirectives AM</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComposerImpl extends EObjectImpl implements Composer {
	/**
	 * The cached value of the '{@link #getPredirectivesPM() <em>Predirectives PM</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPredirectivesPM()
	 * @generated
	 * @ordered
	 */
	protected EList<ElementDirective> predirectivesPM;

	/**
	 * The cached value of the '{@link #getPostdirectives() <em>Postdirectives</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostdirectives()
	 * @generated
	 * @ordered
	 */
	protected EList<ElementDirective> postdirectives;

	/**
	 * The default value of the '{@link #getPrimaryModelURI() <em>Primary Model URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimaryModelURI()
	 * @generated
	 * @ordered
	 */
	protected static final String PRIMARY_MODEL_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrimaryModelURI() <em>Primary Model URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimaryModelURI()
	 * @generated
	 * @ordered
	 */
	protected String primaryModelURI = PRIMARY_MODEL_URI_EDEFAULT;

	/**
	 * The default value of the '{@link #getAspectModelURI() <em>Aspect Model URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAspectModelURI()
	 * @generated
	 * @ordered
	 */
	protected static final String ASPECT_MODEL_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAspectModelURI() <em>Aspect Model URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAspectModelURI()
	 * @generated
	 * @ordered
	 */
	protected String aspectModelURI = ASPECT_MODEL_URI_EDEFAULT;

	/**
	 * The default value of the '{@link #getComposedModelURI() <em>Composed Model URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComposedModelURI()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPOSED_MODEL_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComposedModelURI() <em>Composed Model URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComposedModelURI()
	 * @generated
	 * @ordered
	 */
	protected String composedModelURI = COMPOSED_MODEL_URI_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPredirectivesAM() <em>Predirectives AM</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPredirectivesAM()
	 * @generated
	 * @ordered
	 */
	protected EList<ElementDirective> predirectivesAM;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KomposePackage.Literals.COMPOSER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ElementDirective> getPredirectivesPM() {
		if (predirectivesPM == null) {
			predirectivesPM = new EObjectContainmentEList<ElementDirective>(ElementDirective.class, this, KomposePackage.COMPOSER__PREDIRECTIVES_PM);
		}
		return predirectivesPM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ElementDirective> getPostdirectives() {
		if (postdirectives == null) {
			postdirectives = new EObjectContainmentEList<ElementDirective>(ElementDirective.class, this, KomposePackage.COMPOSER__POSTDIRECTIVES);
		}
		return postdirectives;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPrimaryModelURI() {
		return primaryModelURI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrimaryModelURI(String newPrimaryModelURI) {
		String oldPrimaryModelURI = primaryModelURI;
		primaryModelURI = newPrimaryModelURI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KomposePackage.COMPOSER__PRIMARY_MODEL_URI, oldPrimaryModelURI, primaryModelURI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAspectModelURI() {
		return aspectModelURI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAspectModelURI(String newAspectModelURI) {
		String oldAspectModelURI = aspectModelURI;
		aspectModelURI = newAspectModelURI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KomposePackage.COMPOSER__ASPECT_MODEL_URI, oldAspectModelURI, aspectModelURI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComposedModelURI() {
		return composedModelURI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComposedModelURI(String newComposedModelURI) {
		String oldComposedModelURI = composedModelURI;
		composedModelURI = newComposedModelURI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KomposePackage.COMPOSER__COMPOSED_MODEL_URI, oldComposedModelURI, composedModelURI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ElementDirective> getPredirectivesAM() {
		if (predirectivesAM == null) {
			predirectivesAM = new EObjectContainmentEList<ElementDirective>(ElementDirective.class, this, KomposePackage.COMPOSER__PREDIRECTIVES_AM);
		}
		return predirectivesAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mergeable compose() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KomposePackage.COMPOSER__PREDIRECTIVES_PM:
				return ((InternalEList<?>)getPredirectivesPM()).basicRemove(otherEnd, msgs);
			case KomposePackage.COMPOSER__POSTDIRECTIVES:
				return ((InternalEList<?>)getPostdirectives()).basicRemove(otherEnd, msgs);
			case KomposePackage.COMPOSER__PREDIRECTIVES_AM:
				return ((InternalEList<?>)getPredirectivesAM()).basicRemove(otherEnd, msgs);
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
			case KomposePackage.COMPOSER__PREDIRECTIVES_PM:
				return getPredirectivesPM();
			case KomposePackage.COMPOSER__POSTDIRECTIVES:
				return getPostdirectives();
			case KomposePackage.COMPOSER__PRIMARY_MODEL_URI:
				return getPrimaryModelURI();
			case KomposePackage.COMPOSER__ASPECT_MODEL_URI:
				return getAspectModelURI();
			case KomposePackage.COMPOSER__COMPOSED_MODEL_URI:
				return getComposedModelURI();
			case KomposePackage.COMPOSER__PREDIRECTIVES_AM:
				return getPredirectivesAM();
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
			case KomposePackage.COMPOSER__PREDIRECTIVES_PM:
				getPredirectivesPM().clear();
				getPredirectivesPM().addAll((Collection<? extends ElementDirective>)newValue);
				return;
			case KomposePackage.COMPOSER__POSTDIRECTIVES:
				getPostdirectives().clear();
				getPostdirectives().addAll((Collection<? extends ElementDirective>)newValue);
				return;
			case KomposePackage.COMPOSER__PRIMARY_MODEL_URI:
				setPrimaryModelURI((String)newValue);
				return;
			case KomposePackage.COMPOSER__ASPECT_MODEL_URI:
				setAspectModelURI((String)newValue);
				return;
			case KomposePackage.COMPOSER__COMPOSED_MODEL_URI:
				setComposedModelURI((String)newValue);
				return;
			case KomposePackage.COMPOSER__PREDIRECTIVES_AM:
				getPredirectivesAM().clear();
				getPredirectivesAM().addAll((Collection<? extends ElementDirective>)newValue);
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
			case KomposePackage.COMPOSER__PREDIRECTIVES_PM:
				getPredirectivesPM().clear();
				return;
			case KomposePackage.COMPOSER__POSTDIRECTIVES:
				getPostdirectives().clear();
				return;
			case KomposePackage.COMPOSER__PRIMARY_MODEL_URI:
				setPrimaryModelURI(PRIMARY_MODEL_URI_EDEFAULT);
				return;
			case KomposePackage.COMPOSER__ASPECT_MODEL_URI:
				setAspectModelURI(ASPECT_MODEL_URI_EDEFAULT);
				return;
			case KomposePackage.COMPOSER__COMPOSED_MODEL_URI:
				setComposedModelURI(COMPOSED_MODEL_URI_EDEFAULT);
				return;
			case KomposePackage.COMPOSER__PREDIRECTIVES_AM:
				getPredirectivesAM().clear();
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
			case KomposePackage.COMPOSER__PREDIRECTIVES_PM:
				return predirectivesPM != null && !predirectivesPM.isEmpty();
			case KomposePackage.COMPOSER__POSTDIRECTIVES:
				return postdirectives != null && !postdirectives.isEmpty();
			case KomposePackage.COMPOSER__PRIMARY_MODEL_URI:
				return PRIMARY_MODEL_URI_EDEFAULT == null ? primaryModelURI != null : !PRIMARY_MODEL_URI_EDEFAULT.equals(primaryModelURI);
			case KomposePackage.COMPOSER__ASPECT_MODEL_URI:
				return ASPECT_MODEL_URI_EDEFAULT == null ? aspectModelURI != null : !ASPECT_MODEL_URI_EDEFAULT.equals(aspectModelURI);
			case KomposePackage.COMPOSER__COMPOSED_MODEL_URI:
				return COMPOSED_MODEL_URI_EDEFAULT == null ? composedModelURI != null : !COMPOSED_MODEL_URI_EDEFAULT.equals(composedModelURI);
			case KomposePackage.COMPOSER__PREDIRECTIVES_AM:
				return predirectivesAM != null && !predirectivesAM.isEmpty();
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
		result.append(" (primaryModelURI: ");
		result.append(primaryModelURI);
		result.append(", aspectModelURI: ");
		result.append(aspectModelURI);
		result.append(", composedModelURI: ");
		result.append(composedModelURI);
		result.append(')');
		return result.toString();
	}

} //ComposerImpl
