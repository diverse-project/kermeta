/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kompose.impl;

import directives.CompositionDirective;
import java.util.Collection;

import kompose.Context;
import kompose.Directives;
import kompose.KomposePackage;
import kompose.Modes;

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
 * An implementation of the model object '<em><b>Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link kompose.impl.ContextImpl#getMode <em>Mode</em>}</li>
 *   <li>{@link kompose.impl.ContextImpl#getComposedModelURI <em>Composed Model URI</em>}</li>
 *   <li>{@link kompose.impl.ContextImpl#getAspectModelURI <em>Aspect Model URI</em>}</li>
 *   <li>{@link kompose.impl.ContextImpl#getPrimaryModelURI <em>Primary Model URI</em>}</li>
 *   <li>{@link kompose.impl.ContextImpl#getMetamodelName <em>Metamodel Name</em>}</li>
 *   <li>{@link kompose.impl.ContextImpl#getPredirectivesPM <em>Predirectives PM</em>}</li>
 *   <li>{@link kompose.impl.ContextImpl#getPredirectivesAM <em>Predirectives AM</em>}</li>
 *   <li>{@link kompose.impl.ContextImpl#getPostdirectives <em>Postdirectives</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContextImpl extends EObjectImpl implements Context {
	/**
	 * The default value of the '{@link #getMode() <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMode()
	 * @generated
	 * @ordered
	 */
	protected static final Modes MODE_EDEFAULT = Modes.UNION;

	/**
	 * The cached value of the '{@link #getMode() <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMode()
	 * @generated
	 * @ordered
	 */
	protected Modes mode = MODE_EDEFAULT;

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
	 * The default value of the '{@link #getMetamodelName() <em>Metamodel Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetamodelName()
	 * @generated
	 * @ordered
	 */
	protected static final String METAMODEL_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMetamodelName() <em>Metamodel Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetamodelName()
	 * @generated
	 * @ordered
	 */
	protected String metamodelName = METAMODEL_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPredirectivesPM() <em>Predirectives PM</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPredirectivesPM()
	 * @generated
	 * @ordered
	 */
	protected EList<CompositionDirective> predirectivesPM;

	/**
	 * The cached value of the '{@link #getPredirectivesAM() <em>Predirectives AM</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPredirectivesAM()
	 * @generated
	 * @ordered
	 */
	protected EList<CompositionDirective> predirectivesAM;

	/**
	 * The cached value of the '{@link #getPostdirectives() <em>Postdirectives</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostdirectives()
	 * @generated
	 * @ordered
	 */
	protected EList<CompositionDirective> postdirectives;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KomposePackage.Literals.CONTEXT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Modes getMode() {
		return mode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMode(Modes newMode) {
		Modes oldMode = mode;
		mode = newMode == null ? MODE_EDEFAULT : newMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KomposePackage.CONTEXT__MODE, oldMode, mode));
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
			eNotify(new ENotificationImpl(this, Notification.SET, KomposePackage.CONTEXT__COMPOSED_MODEL_URI, oldComposedModelURI, composedModelURI));
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
			eNotify(new ENotificationImpl(this, Notification.SET, KomposePackage.CONTEXT__ASPECT_MODEL_URI, oldAspectModelURI, aspectModelURI));
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
			eNotify(new ENotificationImpl(this, Notification.SET, KomposePackage.CONTEXT__PRIMARY_MODEL_URI, oldPrimaryModelURI, primaryModelURI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMetamodelName() {
		return metamodelName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMetamodelName(String newMetamodelName) {
		String oldMetamodelName = metamodelName;
		metamodelName = newMetamodelName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KomposePackage.CONTEXT__METAMODEL_NAME, oldMetamodelName, metamodelName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CompositionDirective> getPostdirectives() {
		if (postdirectives == null) {
			postdirectives = new EObjectContainmentEList<CompositionDirective>(CompositionDirective.class, this, KomposePackage.CONTEXT__POSTDIRECTIVES);
		}
		return postdirectives;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CompositionDirective> getPredirectivesPM() {
		if (predirectivesPM == null) {
			predirectivesPM = new EObjectContainmentEList<CompositionDirective>(CompositionDirective.class, this, KomposePackage.CONTEXT__PREDIRECTIVES_PM);
		}
		return predirectivesPM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CompositionDirective> getPredirectivesAM() {
		if (predirectivesAM == null) {
			predirectivesAM = new EObjectContainmentEList<CompositionDirective>(CompositionDirective.class, this, KomposePackage.CONTEXT__PREDIRECTIVES_AM);
		}
		return predirectivesAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KomposePackage.CONTEXT__PREDIRECTIVES_PM:
				return ((InternalEList<?>)getPredirectivesPM()).basicRemove(otherEnd, msgs);
			case KomposePackage.CONTEXT__PREDIRECTIVES_AM:
				return ((InternalEList<?>)getPredirectivesAM()).basicRemove(otherEnd, msgs);
			case KomposePackage.CONTEXT__POSTDIRECTIVES:
				return ((InternalEList<?>)getPostdirectives()).basicRemove(otherEnd, msgs);
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
			case KomposePackage.CONTEXT__MODE:
				return getMode();
			case KomposePackage.CONTEXT__COMPOSED_MODEL_URI:
				return getComposedModelURI();
			case KomposePackage.CONTEXT__ASPECT_MODEL_URI:
				return getAspectModelURI();
			case KomposePackage.CONTEXT__PRIMARY_MODEL_URI:
				return getPrimaryModelURI();
			case KomposePackage.CONTEXT__METAMODEL_NAME:
				return getMetamodelName();
			case KomposePackage.CONTEXT__PREDIRECTIVES_PM:
				return getPredirectivesPM();
			case KomposePackage.CONTEXT__PREDIRECTIVES_AM:
				return getPredirectivesAM();
			case KomposePackage.CONTEXT__POSTDIRECTIVES:
				return getPostdirectives();
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
			case KomposePackage.CONTEXT__MODE:
				setMode((Modes)newValue);
				return;
			case KomposePackage.CONTEXT__COMPOSED_MODEL_URI:
				setComposedModelURI((String)newValue);
				return;
			case KomposePackage.CONTEXT__ASPECT_MODEL_URI:
				setAspectModelURI((String)newValue);
				return;
			case KomposePackage.CONTEXT__PRIMARY_MODEL_URI:
				setPrimaryModelURI((String)newValue);
				return;
			case KomposePackage.CONTEXT__METAMODEL_NAME:
				setMetamodelName((String)newValue);
				return;
			case KomposePackage.CONTEXT__PREDIRECTIVES_PM:
				getPredirectivesPM().clear();
				getPredirectivesPM().addAll((Collection<? extends CompositionDirective>)newValue);
				return;
			case KomposePackage.CONTEXT__PREDIRECTIVES_AM:
				getPredirectivesAM().clear();
				getPredirectivesAM().addAll((Collection<? extends CompositionDirective>)newValue);
				return;
			case KomposePackage.CONTEXT__POSTDIRECTIVES:
				getPostdirectives().clear();
				getPostdirectives().addAll((Collection<? extends CompositionDirective>)newValue);
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
			case KomposePackage.CONTEXT__MODE:
				setMode(MODE_EDEFAULT);
				return;
			case KomposePackage.CONTEXT__COMPOSED_MODEL_URI:
				setComposedModelURI(COMPOSED_MODEL_URI_EDEFAULT);
				return;
			case KomposePackage.CONTEXT__ASPECT_MODEL_URI:
				setAspectModelURI(ASPECT_MODEL_URI_EDEFAULT);
				return;
			case KomposePackage.CONTEXT__PRIMARY_MODEL_URI:
				setPrimaryModelURI(PRIMARY_MODEL_URI_EDEFAULT);
				return;
			case KomposePackage.CONTEXT__METAMODEL_NAME:
				setMetamodelName(METAMODEL_NAME_EDEFAULT);
				return;
			case KomposePackage.CONTEXT__PREDIRECTIVES_PM:
				getPredirectivesPM().clear();
				return;
			case KomposePackage.CONTEXT__PREDIRECTIVES_AM:
				getPredirectivesAM().clear();
				return;
			case KomposePackage.CONTEXT__POSTDIRECTIVES:
				getPostdirectives().clear();
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
			case KomposePackage.CONTEXT__MODE:
				return mode != MODE_EDEFAULT;
			case KomposePackage.CONTEXT__COMPOSED_MODEL_URI:
				return COMPOSED_MODEL_URI_EDEFAULT == null ? composedModelURI != null : !COMPOSED_MODEL_URI_EDEFAULT.equals(composedModelURI);
			case KomposePackage.CONTEXT__ASPECT_MODEL_URI:
				return ASPECT_MODEL_URI_EDEFAULT == null ? aspectModelURI != null : !ASPECT_MODEL_URI_EDEFAULT.equals(aspectModelURI);
			case KomposePackage.CONTEXT__PRIMARY_MODEL_URI:
				return PRIMARY_MODEL_URI_EDEFAULT == null ? primaryModelURI != null : !PRIMARY_MODEL_URI_EDEFAULT.equals(primaryModelURI);
			case KomposePackage.CONTEXT__METAMODEL_NAME:
				return METAMODEL_NAME_EDEFAULT == null ? metamodelName != null : !METAMODEL_NAME_EDEFAULT.equals(metamodelName);
			case KomposePackage.CONTEXT__PREDIRECTIVES_PM:
				return predirectivesPM != null && !predirectivesPM.isEmpty();
			case KomposePackage.CONTEXT__PREDIRECTIVES_AM:
				return predirectivesAM != null && !predirectivesAM.isEmpty();
			case KomposePackage.CONTEXT__POSTDIRECTIVES:
				return postdirectives != null && !postdirectives.isEmpty();
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
		result.append(" (mode: ");
		result.append(mode);
		result.append(", composedModelURI: ");
		result.append(composedModelURI);
		result.append(", aspectModelURI: ");
		result.append(aspectModelURI);
		result.append(", primaryModelURI: ");
		result.append(primaryModelURI);
		result.append(", metamodelName: ");
		result.append(metamodelName);
		result.append(')');
		return result.toString();
	}

} //ContextImpl
