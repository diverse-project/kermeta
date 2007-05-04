/**
 * <copyright>
 * </copyright>
 *
 * $Id: RuleImpl.java,v 1.2 2007-05-04 13:54:13 dvojtise Exp $
 */
package fr.irisa.triskell.kermeta.kpm.impl;

import fr.irisa.triskell.kermeta.kpm.Event;
import fr.irisa.triskell.kermeta.kpm.In;
import fr.irisa.triskell.kermeta.kpm.KPM;
import fr.irisa.triskell.kermeta.kpm.KpmPackage;
import fr.irisa.triskell.kermeta.kpm.Out;
import fr.irisa.triskell.kermeta.kpm.Rule;
import fr.irisa.triskell.kermeta.kpm.RuleType;
import fr.irisa.triskell.kermeta.kpm.Unit;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.irisa.triskell.kermeta.kpm.impl.RuleImpl#getIn <em>In</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.kpm.impl.RuleImpl#getEvent <em>Event</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.kpm.impl.RuleImpl#getOuts <em>Outs</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.kpm.impl.RuleImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.kpm.impl.RuleImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RuleImpl extends EObjectImpl implements Rule {
	/**
	 * The cached value of the '{@link #getIn() <em>In</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIn()
	 * @generated
	 * @ordered
	 */
	protected In in = null;

	/**
	 * The cached value of the '{@link #getEvent() <em>Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvent()
	 * @generated
	 * @ordered
	 */
	protected Event event = null;

	/**
	 * The cached value of the '{@link #getOuts() <em>Outs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOuts()
	 * @generated
	 * @ordered
	 */
	protected EList outs = null;

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
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected RuleType type = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return KpmPackage.Literals.RULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public In getIn() {
		return in;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIn(In newIn, NotificationChain msgs) {
		In oldIn = in;
		in = newIn;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KpmPackage.RULE__IN, oldIn, newIn);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIn(In newIn) {
		if (newIn != in) {
			NotificationChain msgs = null;
			if (in != null)
				msgs = ((InternalEObject)in).eInverseRemove(this, KpmPackage.IN__RULE, In.class, msgs);
			if (newIn != null)
				msgs = ((InternalEObject)newIn).eInverseAdd(this, KpmPackage.IN__RULE, In.class, msgs);
			msgs = basicSetIn(newIn, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KpmPackage.RULE__IN, newIn, newIn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Event getEvent() {
		if (event != null && event.eIsProxy()) {
			InternalEObject oldEvent = (InternalEObject)event;
			event = (Event)eResolveProxy(oldEvent);
			if (event != oldEvent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, KpmPackage.RULE__EVENT, oldEvent, event));
			}
		}
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Event basicGetEvent() {
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEvent(Event newEvent) {
		Event oldEvent = event;
		event = newEvent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KpmPackage.RULE__EVENT, oldEvent, event));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOuts() {
		if (outs == null) {
			outs = new EObjectContainmentWithInverseEList(Out.class, this, KpmPackage.RULE__OUTS, KpmPackage.OUT__RULE);
		}
		return outs;
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
			eNotify(new ENotificationImpl(this, Notification.SET, KpmPackage.RULE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuleType getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (RuleType)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, KpmPackage.RULE__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuleType basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(RuleType newType) {
		RuleType oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KpmPackage.RULE__TYPE, oldType, type));
	}
	 
	/**
	 * 
	 * @generated NOT
	 */
	HashMap<Unit, Boolean> mustStop = new HashMap<Unit, Boolean>();

	/**
	 * 
	 * @generated NOT
	 */
	public void processAsSynchrone(Unit unit, Map args, IProgressMonitor monitor) {

		boolean stop = false;

		synchronized (mustStop) {
			stop = mustStop.get(unit);
		}

		Iterator<Out> iterator = getOuts().iterator();
		while (!stop && iterator.hasNext()) {
			/*
			 * try { Thread.sleep(100); } catch (InterruptedException e) { //
			 * TODO Auto-generated catch block e.printStackTrace(); }
			 */
			Out currentOut = iterator.next();
			if (!currentOut.isIndependant()) {
				if (monitor == null)
					currentOut.process(unit, new NullProgressMonitor(), args);
				else
					currentOut.process(unit, monitor, args);
			} else {

				/*
				 * Job subJob = new Job("Processing Independant Out") {
				 * 
				 * 
				 * public IStatus run(IProgressMonitor monitor) {
				 * out.process(monitor); return Status.OK_STATUS; }
				 * 
				 *  }; subJob.schedule();
				 */
			}
			synchronized (mustStop) {
				stop = mustStop.get(unit);
			}
		}
		list.remove(unit);
	}

	/**
	 * 
	 * @generated NOT
	 */
	private HashMap<Unit, Job> jobs = new HashMap<Unit, Job>();

	/**
	 * 
	 * @param unit
	 * @param args
	 * @param monitor
	 * 
	 * @generated NOT
	 */
	public void processAsAsynchrone(Unit unit, Map args,
			IProgressMonitor monitor) {
		Job job;
		synchronized (jobs) {
			job = jobs.get(unit);
		}
		if (job != null)
			job.cancel();
		final Unit finalUnit = unit;
		final Map finalArgs = args;
		job = new Job("Processing Rule " + getName()) {

			public IStatus run(IProgressMonitor monitor) {

				for (Out out : (List<Out>) getOuts()) {

					/*
					 * try { Thread.sleep(100); } catch (InterruptedException e) { //
					 * TODO Auto-generated catch block e.printStackTrace(); }
					 */

					if (!out.isIndependant()) {
						out.process(finalUnit, monitor, finalArgs);
					} else {

						/*
						 * Job subJob = new Job("Processing Independant Out") {
						 * 
						 * 
						 * public IStatus run(IProgressMonitor monitor) {
						 * out.process(monitor); return Status.OK_STATUS; }
						 * 
						 *  }; subJob.schedule();
						 */
					}
				}
				jobs.remove(finalUnit);
				// list.remove(finalUnit);
				return Status.OK_STATUS;
			}
		};
		jobs.put(unit, job);
		job.schedule();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public void process(Unit unit, boolean synchrone, Map args,
			IProgressMonitor monitor) {

		if (synchrone) {
			synchronized (list) {
				if (list.contains(unit))
					mustStop.put(unit, true);
				else {
					mustStop.put(unit, false);
					list.add(unit);
				}
			}
			processAsSynchrone(unit, args, monitor);
		} else
			processAsAsynchrone(unit, args, monitor);

		/*
		 * synchronized(list) { while ( list.contains(unit) ) { try {
		 * Thread.sleep(500); System.out.println("Dependency " + getName() + "
		 * waiting. Unit : " + unit.getValue()); System.out.println(list); }
		 * catch (InterruptedException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); } } list.add(unit); }
		 * 
		 * 
		 * if ( ! getIn().evaluate(unit) ) { list.remove(unit); } else { if ( !
		 * synchrone ) { final Unit finalUnit = unit; final Map finalArgs =
		 * args; Job job = new Job("Processing Dependency " + getName()) {
		 * 
		 * 
		 * public IStatus run(IProgressMonitor monitor) {
		 * 
		 * 
		 * for ( Out out : (List<Out>) getOuts() ) {
		 * 
		 * 
		 * if ( ! out.isIndependant() ) { out.process(finalUnit, monitor,
		 * finalArgs); } else {
		 * 
		 * 
		 * /*Job subJob = new Job("Processing Independant Out") {
		 * 
		 * 
		 * public IStatus run(IProgressMonitor monitor) { out.process(monitor);
		 * return Status.OK_STATUS; }
		 * 
		 *  }; subJob.schedule(); } } list.remove(finalUnit); return
		 * Status.OK_STATUS; } }; job.schedule(); } else { for ( Out out : (List<Out>)
		 * getOuts() ) {
		 * 
		 * 
		 * if ( ! out.isIndependant() ) { if ( monitor == null )
		 * out.process(unit, new NullProgressMonitor(), args ); else
		 * out.process(unit, monitor, args); } else {
		 * 
		 * 
		 * /*Job subJob = new Job("Processing Independant Out") {
		 * 
		 * 
		 * public IStatus run(IProgressMonitor monitor) { out.process(monitor);
		 * return Status.OK_STATUS; }
		 * 
		 *  }; subJob.schedule(); } } list.remove(unit);
		 * System.out.println("ending processing dependency"); } }
		 */
	}

	final private HashSet<Unit> list = new HashSet<Unit>();


	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public void process(Unit unit, boolean synchrone, Map args) {

		synchronized (list) {
			while (list.contains(unit)) {
				try {
					Thread.currentThread().sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

		list.add(unit);
		if (getIn().evaluate(unit)) {

			if (!synchrone) {
				final Unit finalUnit = unit;
				final Map finalArgs = args;
				Job job = new Job("Processing Rule " + getName()) {

					public IStatus run(IProgressMonitor monitor) {

						for (Out out : (List<Out>) getOuts()) {

							if (!out.isIndependant()) {
								out.process(finalUnit, monitor, finalArgs);
							} else {

								/*
								 * Job subJob = new Job("Processing Independant
								 * Out") {
								 * 
								 * 
								 * public IStatus run(IProgressMonitor monitor) {
								 * out.process(monitor); return
								 * Status.OK_STATUS; }
								 * 
								 *  }; subJob.schedule();
								 */
							}
						}
						list.remove(finalUnit);
						return Status.OK_STATUS;
					}
				};
				job.schedule();
			} else {
				for (Out out : (List<Out>) getOuts()) {

					if (!out.isIndependant()) {
						out.process(unit, new NullProgressMonitor(), args);
					} else {

						/*
						 * Job subJob = new Job("Processing Independant Out") {
						 * 
						 * 
						 * public IStatus run(IProgressMonitor monitor) {
						 * out.process(monitor); return Status.OK_STATUS; }
						 * 
						 *  }; subJob.schedule();
						 */
					}
				}
				list.remove(unit);
				System.out.println("ending processing dependency");
			}
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setEvent(String name) {
		setEvent( ((KPM) eContainer()).getEvent(name) );
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setType(String name) {
		setType( ((KPM) eContainer()).getRuleType(name) );
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Out findOut(String actionId) {
		Iterator<Out> iterator = getOuts().iterator();
		while ( iterator.hasNext() ) {
			Out currentOut = iterator.next();
			if ( currentOut.getAction().getExtensionPoint().equals(actionId) )
				return currentOut;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void removeOut(String actionId) {
		Out out = findOut(actionId);
		if ( out != null )
			getOuts().remove(out);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KpmPackage.RULE__IN:
				if (in != null)
					msgs = ((InternalEObject)in).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KpmPackage.RULE__IN, null, msgs);
				return basicSetIn((In)otherEnd, msgs);
			case KpmPackage.RULE__OUTS:
				return ((InternalEList)getOuts()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KpmPackage.RULE__IN:
				return basicSetIn(null, msgs);
			case KpmPackage.RULE__OUTS:
				return ((InternalEList)getOuts()).basicRemove(otherEnd, msgs);
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
			case KpmPackage.RULE__IN:
				return getIn();
			case KpmPackage.RULE__EVENT:
				if (resolve) return getEvent();
				return basicGetEvent();
			case KpmPackage.RULE__OUTS:
				return getOuts();
			case KpmPackage.RULE__NAME:
				return getName();
			case KpmPackage.RULE__TYPE:
				if (resolve) return getType();
				return basicGetType();
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
			case KpmPackage.RULE__IN:
				setIn((In)newValue);
				return;
			case KpmPackage.RULE__EVENT:
				setEvent((Event)newValue);
				return;
			case KpmPackage.RULE__OUTS:
				getOuts().clear();
				getOuts().addAll((Collection)newValue);
				return;
			case KpmPackage.RULE__NAME:
				setName((String)newValue);
				return;
			case KpmPackage.RULE__TYPE:
				setType((RuleType)newValue);
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
			case KpmPackage.RULE__IN:
				setIn((In)null);
				return;
			case KpmPackage.RULE__EVENT:
				setEvent((Event)null);
				return;
			case KpmPackage.RULE__OUTS:
				getOuts().clear();
				return;
			case KpmPackage.RULE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case KpmPackage.RULE__TYPE:
				setType((RuleType)null);
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
			case KpmPackage.RULE__IN:
				return in != null;
			case KpmPackage.RULE__EVENT:
				return event != null;
			case KpmPackage.RULE__OUTS:
				return outs != null && !outs.isEmpty();
			case KpmPackage.RULE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case KpmPackage.RULE__TYPE:
				return type != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //RuleImpl