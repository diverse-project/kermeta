/**
 * <copyright>
 * </copyright>
 *
 * $Id: LoadingStepImpl.java,v 1.3 2008-02-27 15:21:09 dvojtise Exp $
 */
package org.kermeta.io.loader.impl;

import java.util.Map;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.kermeta.io.KermetaUnit;
import org.kermeta.io.loader.Action;
import org.kermeta.io.loader.ILoadingDatas;
import org.kermeta.io.loader.LoaderPackage;
import org.kermeta.io.loader.LoadingStep;
import org.kermeta.io.loader.action.ILoadingAction;
import org.kermeta.io.loader.plugin.LoaderPlugin;

import fr.irisa.triskell.kermeta.exceptions.NotRegisteredURIException;
import fr.irisa.triskell.kermeta.exceptions.URIMalformedException;
import fr.irisa.triskell.kermeta.modelhelper.KermetaUnitHelper;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Loading Step</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.kermeta.io.loader.impl.LoadingStepImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.kermeta.io.loader.impl.LoadingStepImpl#isDone <em>Done</em>}</li>
 *   <li>{@link org.kermeta.io.loader.impl.LoadingStepImpl#getAction <em>Action</em>}</li>
 *   <li>{@link org.kermeta.io.loader.impl.LoadingStepImpl#isPropagate <em>Propagate</em>}</li>
 *   <li>{@link org.kermeta.io.loader.impl.LoadingStepImpl#isPerformActionIfError <em>Perform Action If Error</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LoadingStepImpl extends AbstractStepImpl implements LoadingStep {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

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
	 * The default value of the '{@link #isDone() <em>Done</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDone()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DONE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDone() <em>Done</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDone()
	 * @generated
	 * @ordered
	 */
	protected boolean done = DONE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAction() <em>Action</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected Action action;

	/**
	 * The default value of the '{@link #isPropagate() <em>Propagate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPropagate()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PROPAGATE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPropagate() <em>Propagate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPropagate()
	 * @generated
	 * @ordered
	 */
	protected boolean propagate = PROPAGATE_EDEFAULT;

	/**
	 * The default value of the '{@link #isPerformActionIfError() <em>Perform Action If Error</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPerformActionIfError()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PERFORM_ACTION_IF_ERROR_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPerformActionIfError() <em>Perform Action If Error</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPerformActionIfError()
	 * @generated
	 * @ordered
	 */
	protected boolean performActionIfError = PERFORM_ACTION_IF_ERROR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LoadingStepImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LoaderPackage.Literals.LOADING_STEP;
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
			eNotify(new ENotificationImpl(this, Notification.SET, LoaderPackage.LOADING_STEP__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDone() {
		return done;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDone(boolean newDone) {
		boolean oldDone = done;
		done = newDone;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LoaderPackage.LOADING_STEP__DONE, oldDone, done));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action getAction() {
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAction(Action newAction, NotificationChain msgs) {
		Action oldAction = action;
		action = newAction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LoaderPackage.LOADING_STEP__ACTION, oldAction, newAction);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAction(Action newAction) {
		if (newAction != action) {
			NotificationChain msgs = null;
			if (action != null)
				msgs = ((InternalEObject)action).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LoaderPackage.LOADING_STEP__ACTION, null, msgs);
			if (newAction != null)
				msgs = ((InternalEObject)newAction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LoaderPackage.LOADING_STEP__ACTION, null, msgs);
			msgs = basicSetAction(newAction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LoaderPackage.LOADING_STEP__ACTION, newAction, newAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPropagate() {
		return propagate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPropagate(boolean newPropagate) {
		boolean oldPropagate = propagate;
		propagate = newPropagate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LoaderPackage.LOADING_STEP__PROPAGATE, oldPropagate, propagate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPerformActionIfError() {
		return performActionIfError;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPerformActionIfError(boolean newPerformActionIfError) {
		boolean oldPerformActionIfError = performActionIfError;
		performActionIfError = newPerformActionIfError;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LoaderPackage.LOADING_STEP__PERFORM_ACTION_IF_ERROR, oldPerformActionIfError, performActionIfError));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void process(ILoadingDatas datas, Map<?, ?> options) {
		
		if ( ! isDone() ) {
						
			
			if ( !performActionIfError && datas.getKermetaUnit().isErroneous() ) {
				/*
				 * 
				 * Doesn't perform the action due to previous error
				 * 
				 */
				LoaderPlugin.log.info("NOT doing " + getName() + " on " + datas.getKermetaUnit().getUri()+ " due to previous error");
				
			}
			else {
				/*
				 * 
				 * Perform the action
				 * 
				 */
				LoaderPlugin.log.debug("Stepping " + getName() + " on " + datas.getKermetaUnit().getUri());
				performAction(datas, options);
			}
			/*
			 * 
			 * Process the sub steps.
			 * 
			 */
			while ( goToNextStep() ) {
				LoadingStep currentStep = getCurrentStep();
				currentStep.process(datas, options);
			}
		
			setDone( true );
			
			/*
			 * 
			 * Propagate if necessary.
			 * 
			 */
			if ( isPropagate() ) {
				for ( KermetaUnit importedUnit : KermetaUnitHelper.getAllImportedKermetaUnits( datas.getKermetaUnit() ) )
					try {
						LoaderPlugin.getDefault().load(importedUnit.getUri(), getName(), options);
					} catch (URIMalformedException e) {
						e.printStackTrace();
					} catch (NotRegisteredURIException e) {
						e.printStackTrace();
					}
			}
		
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void performAction(ILoadingDatas datas, Map<?, ?> options) {
		Action action = getAction();
		if ( action != null ) {
			ClassLoader classLoader = this.getClass().getClassLoader();
			try {
				Class<?> c = classLoader.loadClass( action.getClass_() );
				ILoadingAction loadingAction = (ILoadingAction) c.newInstance();
				loadingAction.performAction(datas, options);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (InstantiationException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LoaderPackage.LOADING_STEP__ACTION:
				return basicSetAction(null, msgs);
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
			case LoaderPackage.LOADING_STEP__NAME:
				return getName();
			case LoaderPackage.LOADING_STEP__DONE:
				return isDone() ? Boolean.TRUE : Boolean.FALSE;
			case LoaderPackage.LOADING_STEP__ACTION:
				return getAction();
			case LoaderPackage.LOADING_STEP__PROPAGATE:
				return isPropagate() ? Boolean.TRUE : Boolean.FALSE;
			case LoaderPackage.LOADING_STEP__PERFORM_ACTION_IF_ERROR:
				return isPerformActionIfError() ? Boolean.TRUE : Boolean.FALSE;
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
			case LoaderPackage.LOADING_STEP__NAME:
				setName((String)newValue);
				return;
			case LoaderPackage.LOADING_STEP__DONE:
				setDone(((Boolean)newValue).booleanValue());
				return;
			case LoaderPackage.LOADING_STEP__ACTION:
				setAction((Action)newValue);
				return;
			case LoaderPackage.LOADING_STEP__PROPAGATE:
				setPropagate(((Boolean)newValue).booleanValue());
				return;
			case LoaderPackage.LOADING_STEP__PERFORM_ACTION_IF_ERROR:
				setPerformActionIfError(((Boolean)newValue).booleanValue());
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
			case LoaderPackage.LOADING_STEP__NAME:
				setName(NAME_EDEFAULT);
				return;
			case LoaderPackage.LOADING_STEP__DONE:
				setDone(DONE_EDEFAULT);
				return;
			case LoaderPackage.LOADING_STEP__ACTION:
				setAction((Action)null);
				return;
			case LoaderPackage.LOADING_STEP__PROPAGATE:
				setPropagate(PROPAGATE_EDEFAULT);
				return;
			case LoaderPackage.LOADING_STEP__PERFORM_ACTION_IF_ERROR:
				setPerformActionIfError(PERFORM_ACTION_IF_ERROR_EDEFAULT);
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
			case LoaderPackage.LOADING_STEP__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case LoaderPackage.LOADING_STEP__DONE:
				return done != DONE_EDEFAULT;
			case LoaderPackage.LOADING_STEP__ACTION:
				return action != null;
			case LoaderPackage.LOADING_STEP__PROPAGATE:
				return propagate != PROPAGATE_EDEFAULT;
			case LoaderPackage.LOADING_STEP__PERFORM_ACTION_IF_ERROR:
				return performActionIfError != PERFORM_ACTION_IF_ERROR_EDEFAULT;
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
		result.append(", done: ");
		result.append(done);
		result.append(", propagate: ");
		result.append(propagate);
		result.append(", performActionIfError: ");
		result.append(performActionIfError);
		result.append(')');
		return result.toString();
	}

} //LoadingStepImpl
