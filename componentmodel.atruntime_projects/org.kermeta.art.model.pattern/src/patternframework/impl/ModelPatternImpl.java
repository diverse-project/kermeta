/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package patternframework.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import patternframework.ModelPattern;
import patternframework.PConstraint;
import patternframework.PModel;
import patternframework.PObject;
import patternframework.PatternframeworkPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Pattern</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link patternframework.impl.ModelPatternImpl#getPattern <em>Pattern</em>}</li>
 *   <li>{@link patternframework.impl.ModelPatternImpl#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link patternframework.impl.ModelPatternImpl#getFeatureIdentifier <em>Feature Identifier</em>}</li>
 *   <li>{@link patternframework.impl.ModelPatternImpl#getFalsepositivepatterns <em>Falsepositivepatterns</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelPatternImpl extends EObjectImpl implements ModelPattern {
	/**
	 * The cached value of the '{@link #getPattern() <em>Pattern</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPattern()
	 * @generated
	 * @ordered
	 */
	protected PModel pattern;

	/**
	 * The cached value of the '{@link #getConstraints() <em>Constraints</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraints()
	 * @generated
	 * @ordered
	 */
	protected PConstraint constraints;

	/**
	 * The cached value of the '{@link #getFeatureIdentifier() <em>Feature Identifier</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureIdentifier()
	 * @generated
	 * @ordered
	 */
	protected EList<String> featureIdentifier;

	/**
	 * The cached value of the '{@link #getFalsepositivepatterns() <em>Falsepositivepatterns</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFalsepositivepatterns()
	 * @generated
	 * @ordered
	 */
	protected EList<PModel> falsepositivepatterns;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelPatternImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PatternframeworkPackage.Literals.MODEL_PATTERN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PModel getPattern() {
		return pattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPattern(PModel newPattern, NotificationChain msgs) {
		PModel oldPattern = pattern;
		pattern = newPattern;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PatternframeworkPackage.MODEL_PATTERN__PATTERN, oldPattern, newPattern);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPattern(PModel newPattern) {
		if (newPattern != pattern) {
			NotificationChain msgs = null;
			if (pattern != null)
				msgs = ((InternalEObject)pattern).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PatternframeworkPackage.MODEL_PATTERN__PATTERN, null, msgs);
			if (newPattern != null)
				msgs = ((InternalEObject)newPattern).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PatternframeworkPackage.MODEL_PATTERN__PATTERN, null, msgs);
			msgs = basicSetPattern(newPattern, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternframeworkPackage.MODEL_PATTERN__PATTERN, newPattern, newPattern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PConstraint getConstraints() {
		return constraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConstraints(PConstraint newConstraints, NotificationChain msgs) {
		PConstraint oldConstraints = constraints;
		constraints = newConstraints;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PatternframeworkPackage.MODEL_PATTERN__CONSTRAINTS, oldConstraints, newConstraints);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstraints(PConstraint newConstraints) {
		if (newConstraints != constraints) {
			NotificationChain msgs = null;
			if (constraints != null)
				msgs = ((InternalEObject)constraints).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PatternframeworkPackage.MODEL_PATTERN__CONSTRAINTS, null, msgs);
			if (newConstraints != null)
				msgs = ((InternalEObject)newConstraints).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PatternframeworkPackage.MODEL_PATTERN__CONSTRAINTS, null, msgs);
			msgs = basicSetConstraints(newConstraints, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternframeworkPackage.MODEL_PATTERN__CONSTRAINTS, newConstraints, newConstraints));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getFeatureIdentifier() {
		if (featureIdentifier == null) {
			featureIdentifier = new EDataTypeUniqueEList<String>(String.class, this, PatternframeworkPackage.MODEL_PATTERN__FEATURE_IDENTIFIER);
		}
		return featureIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PModel> getFalsepositivepatterns() {
		if (falsepositivepatterns == null) {
			falsepositivepatterns = new EObjectContainmentEList<PModel>(PModel.class, this, PatternframeworkPackage.MODEL_PATTERN__FALSEPOSITIVEPATTERNS);
		}
		return falsepositivepatterns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PObject getRole(String roleName) {
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
			case PatternframeworkPackage.MODEL_PATTERN__PATTERN:
				return basicSetPattern(null, msgs);
			case PatternframeworkPackage.MODEL_PATTERN__CONSTRAINTS:
				return basicSetConstraints(null, msgs);
			case PatternframeworkPackage.MODEL_PATTERN__FALSEPOSITIVEPATTERNS:
				return ((InternalEList<?>)getFalsepositivepatterns()).basicRemove(otherEnd, msgs);
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
			case PatternframeworkPackage.MODEL_PATTERN__PATTERN:
				return getPattern();
			case PatternframeworkPackage.MODEL_PATTERN__CONSTRAINTS:
				return getConstraints();
			case PatternframeworkPackage.MODEL_PATTERN__FEATURE_IDENTIFIER:
				return getFeatureIdentifier();
			case PatternframeworkPackage.MODEL_PATTERN__FALSEPOSITIVEPATTERNS:
				return getFalsepositivepatterns();
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
			case PatternframeworkPackage.MODEL_PATTERN__PATTERN:
				setPattern((PModel)newValue);
				return;
			case PatternframeworkPackage.MODEL_PATTERN__CONSTRAINTS:
				setConstraints((PConstraint)newValue);
				return;
			case PatternframeworkPackage.MODEL_PATTERN__FEATURE_IDENTIFIER:
				getFeatureIdentifier().clear();
				getFeatureIdentifier().addAll((Collection<? extends String>)newValue);
				return;
			case PatternframeworkPackage.MODEL_PATTERN__FALSEPOSITIVEPATTERNS:
				getFalsepositivepatterns().clear();
				getFalsepositivepatterns().addAll((Collection<? extends PModel>)newValue);
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
			case PatternframeworkPackage.MODEL_PATTERN__PATTERN:
				setPattern((PModel)null);
				return;
			case PatternframeworkPackage.MODEL_PATTERN__CONSTRAINTS:
				setConstraints((PConstraint)null);
				return;
			case PatternframeworkPackage.MODEL_PATTERN__FEATURE_IDENTIFIER:
				getFeatureIdentifier().clear();
				return;
			case PatternframeworkPackage.MODEL_PATTERN__FALSEPOSITIVEPATTERNS:
				getFalsepositivepatterns().clear();
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
			case PatternframeworkPackage.MODEL_PATTERN__PATTERN:
				return pattern != null;
			case PatternframeworkPackage.MODEL_PATTERN__CONSTRAINTS:
				return constraints != null;
			case PatternframeworkPackage.MODEL_PATTERN__FEATURE_IDENTIFIER:
				return featureIdentifier != null && !featureIdentifier.isEmpty();
			case PatternframeworkPackage.MODEL_PATTERN__FALSEPOSITIVEPATTERNS:
				return falsepositivepatterns != null && !falsepositivepatterns.isEmpty();
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
		result.append(" (featureIdentifier: ");
		result.append(featureIdentifier);
		result.append(')');
		return result.toString();
	}

} //ModelPatternImpl
