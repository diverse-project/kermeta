/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kompose.impl;

import kompose.Composer;
import kompose.Context;
import kompose.Engine;
import kompose.KomposePackage;
import kompose.Matcher;
import kompose.Merger;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Composer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link kompose.impl.ComposerImpl#getContext <em>Context</em>}</li>
 *   <li>{@link kompose.impl.ComposerImpl#getEngine <em>Engine</em>}</li>
 *   <li>{@link kompose.impl.ComposerImpl#getMerger <em>Merger</em>}</li>
 *   <li>{@link kompose.impl.ComposerImpl#getMatcher <em>Matcher</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComposerImpl extends EObjectImpl implements Composer {
	/**
	 * The cached value of the '{@link #getContext() <em>Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContext()
	 * @generated
	 * @ordered
	 */
	protected Context context;

	/**
	 * The cached value of the '{@link #getEngine() <em>Engine</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEngine()
	 * @generated
	 * @ordered
	 */
	protected Engine engine;

	/**
	 * The cached value of the '{@link #getMerger() <em>Merger</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMerger()
	 * @generated
	 * @ordered
	 */
	protected Merger merger;

	/**
	 * The cached value of the '{@link #getMatcher() <em>Matcher</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatcher()
	 * @generated
	 * @ordered
	 */
	protected Matcher matcher;

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
	public Context getContext() {
		if (context != null && context.eIsProxy()) {
			InternalEObject oldContext = (InternalEObject)context;
			context = (Context)eResolveProxy(oldContext);
			if (context != oldContext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, KomposePackage.COMPOSER__CONTEXT, oldContext, context));
			}
		}
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Context basicGetContext() {
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContext(Context newContext) {
		Context oldContext = context;
		context = newContext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KomposePackage.COMPOSER__CONTEXT, oldContext, context));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Engine getEngine() {
		if (engine != null && engine.eIsProxy()) {
			InternalEObject oldEngine = (InternalEObject)engine;
			engine = (Engine)eResolveProxy(oldEngine);
			if (engine != oldEngine) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, KomposePackage.COMPOSER__ENGINE, oldEngine, engine));
			}
		}
		return engine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Engine basicGetEngine() {
		return engine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEngine(Engine newEngine) {
		Engine oldEngine = engine;
		engine = newEngine;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KomposePackage.COMPOSER__ENGINE, oldEngine, engine));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Merger getMerger() {
		if (merger != null && merger.eIsProxy()) {
			InternalEObject oldMerger = (InternalEObject)merger;
			merger = (Merger)eResolveProxy(oldMerger);
			if (merger != oldMerger) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, KomposePackage.COMPOSER__MERGER, oldMerger, merger));
			}
		}
		return merger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Merger basicGetMerger() {
		return merger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMerger(Merger newMerger) {
		Merger oldMerger = merger;
		merger = newMerger;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KomposePackage.COMPOSER__MERGER, oldMerger, merger));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Matcher getMatcher() {
		if (matcher != null && matcher.eIsProxy()) {
			InternalEObject oldMatcher = (InternalEObject)matcher;
			matcher = (Matcher)eResolveProxy(oldMatcher);
			if (matcher != oldMatcher) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, KomposePackage.COMPOSER__MATCHER, oldMatcher, matcher));
			}
		}
		return matcher;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Matcher basicGetMatcher() {
		return matcher;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMatcher(Matcher newMatcher) {
		Matcher oldMatcher = matcher;
		matcher = newMatcher;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KomposePackage.COMPOSER__MATCHER, oldMatcher, matcher));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case KomposePackage.COMPOSER__CONTEXT:
				if (resolve) return getContext();
				return basicGetContext();
			case KomposePackage.COMPOSER__ENGINE:
				if (resolve) return getEngine();
				return basicGetEngine();
			case KomposePackage.COMPOSER__MERGER:
				if (resolve) return getMerger();
				return basicGetMerger();
			case KomposePackage.COMPOSER__MATCHER:
				if (resolve) return getMatcher();
				return basicGetMatcher();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case KomposePackage.COMPOSER__CONTEXT:
				setContext((Context)newValue);
				return;
			case KomposePackage.COMPOSER__ENGINE:
				setEngine((Engine)newValue);
				return;
			case KomposePackage.COMPOSER__MERGER:
				setMerger((Merger)newValue);
				return;
			case KomposePackage.COMPOSER__MATCHER:
				setMatcher((Matcher)newValue);
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
			case KomposePackage.COMPOSER__CONTEXT:
				setContext((Context)null);
				return;
			case KomposePackage.COMPOSER__ENGINE:
				setEngine((Engine)null);
				return;
			case KomposePackage.COMPOSER__MERGER:
				setMerger((Merger)null);
				return;
			case KomposePackage.COMPOSER__MATCHER:
				setMatcher((Matcher)null);
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
			case KomposePackage.COMPOSER__CONTEXT:
				return context != null;
			case KomposePackage.COMPOSER__ENGINE:
				return engine != null;
			case KomposePackage.COMPOSER__MERGER:
				return merger != null;
			case KomposePackage.COMPOSER__MATCHER:
				return matcher != null;
		}
		return super.eIsSet(featureID);
	}

} //ComposerImpl
