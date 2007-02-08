/**
 * <copyright>
 * </copyright>
 *
 * $Id: UnitImpl.java,v 1.8 2007-02-08 15:37:03 ftanguy Exp $
 */
package fr.irisa.triskell.kermeta.kpm.impl;

import fr.irisa.triskell.kermeta.kpm.AbstractDirectory;
import fr.irisa.triskell.kermeta.kpm.AbstractFile;
import fr.irisa.triskell.kermeta.kpm.AbstractProject;
import fr.irisa.triskell.kermeta.kpm.Dependency;
import fr.irisa.triskell.kermeta.kpm.KPM;
import fr.irisa.triskell.kermeta.kpm.KpmPackage;
import fr.irisa.triskell.kermeta.kpm.Unit;

import fr.irisa.triskell.kermeta.kpm.workspace.KermetaUnitInterest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import java.util.Hashtable;

import org.eclipse.core.runtime.IProgressMonitor;

import java.util.Iterator;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.irisa.triskell.kermeta.kpm.impl.UnitImpl#getDependencies <em>Dependencies</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.kpm.impl.UnitImpl#getKpm <em>Kpm</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.kpm.impl.UnitImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.kpm.impl.UnitImpl#getPath <em>Path</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.kpm.impl.UnitImpl#getLastTimeModified <em>Last Time Modified</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class UnitImpl extends AbstractUnitImpl implements Unit {
	/**
	 * The cached value of the '{@link #getDependencies() <em>Dependencies</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependencies()
	 * @generated
	 * @ordered
	 */
	protected EList dependencies = null;

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
	 * The default value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected static final String PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected String path = PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastTimeModified() <em>Last Time Modified</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastTimeModified()
	 * @generated
	 * @ordered
	 */
	protected static final Date LAST_TIME_MODIFIED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastTimeModified() <em>Last Time Modified</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastTimeModified()
	 * @generated
	 * @ordered
	 */
	protected Date lastTimeModified = LAST_TIME_MODIFIED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return KpmPackage.Literals.UNIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getDependencies() {
		if (dependencies == null) {
			dependencies = new EObjectResolvingEList(Dependency.class, this, KpmPackage.UNIT__DEPENDENCIES);
		}
		return dependencies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KPM getKpm() {
		if (eContainerFeatureID != KpmPackage.UNIT__KPM) return null;
		return (KPM)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKpm(KPM newKpm, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newKpm, KpmPackage.UNIT__KPM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKpm(KPM newKpm) {
		if (newKpm != eInternalContainer() || (eContainerFeatureID != KpmPackage.UNIT__KPM && newKpm != null)) {
			if (EcoreUtil.isAncestor(this, newKpm))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newKpm != null)
				msgs = ((InternalEObject)newKpm).eInverseAdd(this, KpmPackage.KPM__UNITS, KPM.class, msgs);
			msgs = basicSetKpm(newKpm, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KpmPackage.UNIT__KPM, newKpm, newKpm));
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
			eNotify(new ENotificationImpl(this, Notification.SET, KpmPackage.UNIT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPath() {
		return path;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPath(String newPath) {
		String oldPath = path;
		path = newPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KpmPackage.UNIT__PATH, oldPath, path));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getLastTimeModified() {
		return lastTimeModified;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastTimeModified(Date newLastTimeModified) {
		Date oldLastTimeModified = lastTimeModified;
		lastTimeModified = newLastTimeModified;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KpmPackage.UNIT__LAST_TIME_MODIFIED, oldLastTimeModified, lastTimeModified));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void receiveEvent(String eventName, Hashtable params, IProgressMonitor monitor) {
		ArrayList <Dependency> dependencies = getDependenciesWithEvent(eventName);
				
		for ( Dependency d : dependencies ) {
			
			d.process(this,params, monitor);
			
		}
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public ArrayList getDependenciesWithEvent(String eventName) {
		ArrayList <Dependency> foundDependencies = new ArrayList <Dependency> ();
		Iterator <Dependency> itOnDependencies = getDependencies().iterator();
		while ( itOnDependencies.hasNext() ) {
			
			Dependency currentDependency = itOnDependencies.next();
			if ( currentDependency.getEvent().equals(eventName) )
				foundDependencies.add(currentDependency);
			
		}
		return foundDependencies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isFile() {
		return typeName.equals( AbstractFile.value );
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isDirectory() {
		return typeName.equals( AbstractDirectory.value );
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isProject() {
		return typeName.equals( AbstractProject.value );
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void changed(KermetaUnitInterest changer, IProgressMonitor monitor) {
		setLastTimeModified( new Date() );
		Hashtable params = new Hashtable();
		if ( changer != null )
			params.put("changer", changer);
		receiveEvent("update", params, monitor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void remove() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KpmPackage.UNIT__KPM:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetKpm((KPM)otherEnd, msgs);
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
			case KpmPackage.UNIT__KPM:
				return basicSetKpm(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID) {
			case KpmPackage.UNIT__KPM:
				return eInternalContainer().eInverseRemove(this, KpmPackage.KPM__UNITS, KPM.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case KpmPackage.UNIT__DEPENDENCIES:
				return getDependencies();
			case KpmPackage.UNIT__KPM:
				return getKpm();
			case KpmPackage.UNIT__NAME:
				return getName();
			case KpmPackage.UNIT__PATH:
				return getPath();
			case KpmPackage.UNIT__LAST_TIME_MODIFIED:
				return getLastTimeModified();
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
			case KpmPackage.UNIT__DEPENDENCIES:
				getDependencies().clear();
				getDependencies().addAll((Collection)newValue);
				return;
			case KpmPackage.UNIT__KPM:
				setKpm((KPM)newValue);
				return;
			case KpmPackage.UNIT__NAME:
				setName((String)newValue);
				return;
			case KpmPackage.UNIT__PATH:
				setPath((String)newValue);
				return;
			case KpmPackage.UNIT__LAST_TIME_MODIFIED:
				setLastTimeModified((Date)newValue);
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
			case KpmPackage.UNIT__DEPENDENCIES:
				getDependencies().clear();
				return;
			case KpmPackage.UNIT__KPM:
				setKpm((KPM)null);
				return;
			case KpmPackage.UNIT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case KpmPackage.UNIT__PATH:
				setPath(PATH_EDEFAULT);
				return;
			case KpmPackage.UNIT__LAST_TIME_MODIFIED:
				setLastTimeModified(LAST_TIME_MODIFIED_EDEFAULT);
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
			case KpmPackage.UNIT__DEPENDENCIES:
				return dependencies != null && !dependencies.isEmpty();
			case KpmPackage.UNIT__KPM:
				return getKpm() != null;
			case KpmPackage.UNIT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case KpmPackage.UNIT__PATH:
				return PATH_EDEFAULT == null ? path != null : !PATH_EDEFAULT.equals(path);
			case KpmPackage.UNIT__LAST_TIME_MODIFIED:
				return LAST_TIME_MODIFIED_EDEFAULT == null ? lastTimeModified != null : !LAST_TIME_MODIFIED_EDEFAULT.equals(lastTimeModified);
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
		result.append(", path: ");
		result.append(path);
		result.append(", lastTimeModified: ");
		result.append(lastTimeModified);
		result.append(')');
		return result.toString();
	}

} //UnitImpl