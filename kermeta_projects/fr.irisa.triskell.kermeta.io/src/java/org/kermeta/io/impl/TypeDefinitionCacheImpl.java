/**
 * <copyright>
 * </copyright>
 *
 * $Id: TypeDefinitionCacheImpl.java,v 1.6 2008-04-28 11:50:12 ftanguy Exp $
 */
package org.kermeta.io.impl;

import fr.irisa.triskell.kermeta.language.structure.TypeDefinition;
import fr.irisa.triskell.kermeta.modelhelper.KermetaUnitHelper;

import java.util.HashMap;
import java.util.Map;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.kermeta.io.IoFactory;
import org.kermeta.io.IoPackage;
import org.kermeta.io.KermetaUnit;
import org.kermeta.io.TypeDefinitionCache;
import org.kermeta.io.TypeDefinitionCacheEntry;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Definition Cache</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.kermeta.io.impl.TypeDefinitionCacheImpl#getKermetaUnit <em>Kermeta Unit</em>}</li>
 *   <li>{@link org.kermeta.io.impl.TypeDefinitionCacheImpl#getEntries <em>Entries</em>}</li>
 *   <li>{@link org.kermeta.io.impl.TypeDefinitionCacheImpl#isExternalSearchAuthorized <em>External Search Authorized</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeDefinitionCacheImpl extends EObjectImpl implements TypeDefinitionCache {
	/**
	 * The cached value of the '{@link #getKermetaUnit() <em>Kermeta Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKermetaUnit()
	 * @generated
	 * @ordered
	 */
	protected KermetaUnit kermetaUnit;

	/**
	 * The cached value of the '{@link #getEntries() <em>Entries</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntries()
	 * @generated
	 * @ordered
	 */
	protected Map<String, TypeDefinitionCacheEntry> entries;

	/**
	 * The default value of the '{@link #isExternalSearchAuthorized() <em>External Search Authorized</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExternalSearchAuthorized()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EXTERNAL_SEARCH_AUTHORIZED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isExternalSearchAuthorized() <em>External Search Authorized</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExternalSearchAuthorized()
	 * @generated
	 * @ordered
	 */
	protected boolean externalSearchAuthorized = EXTERNAL_SEARCH_AUTHORIZED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected TypeDefinitionCacheImpl() {
		super();
		entries = new HashMap<String, TypeDefinitionCacheEntry> ();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IoPackage.Literals.TYPE_DEFINITION_CACHE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map<String, TypeDefinitionCacheEntry> getEntries() {
		return entries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntries(Map<String, TypeDefinitionCacheEntry> newEntries) {
		Map<String, TypeDefinitionCacheEntry> oldEntries = entries;
		entries = newEntries;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IoPackage.TYPE_DEFINITION_CACHE__ENTRIES, oldEntries, entries));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isExternalSearchAuthorized() {
		return externalSearchAuthorized;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExternalSearchAuthorized(boolean newExternalSearchAuthorized) {
		boolean oldExternalSearchAuthorized = externalSearchAuthorized;
		externalSearchAuthorized = newExternalSearchAuthorized;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IoPackage.TYPE_DEFINITION_CACHE__EXTERNAL_SEARCH_AUTHORIZED, oldExternalSearchAuthorized, externalSearchAuthorized));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KermetaUnit getKermetaUnit() {
		if (kermetaUnit != null && kermetaUnit.eIsProxy()) {
			InternalEObject oldKermetaUnit = (InternalEObject)kermetaUnit;
			kermetaUnit = (KermetaUnit)eResolveProxy(oldKermetaUnit);
			if (kermetaUnit != oldKermetaUnit) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, IoPackage.TYPE_DEFINITION_CACHE__KERMETA_UNIT, oldKermetaUnit, kermetaUnit));
			}
		}
		return kermetaUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KermetaUnit basicGetKermetaUnit() {
		return kermetaUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKermetaUnit(KermetaUnit newKermetaUnit, NotificationChain msgs) {
		KermetaUnit oldKermetaUnit = kermetaUnit;
		kermetaUnit = newKermetaUnit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IoPackage.TYPE_DEFINITION_CACHE__KERMETA_UNIT, oldKermetaUnit, newKermetaUnit);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKermetaUnit(KermetaUnit newKermetaUnit) {
		if (newKermetaUnit != kermetaUnit) {
			NotificationChain msgs = null;
			if (kermetaUnit != null)
				msgs = ((InternalEObject)kermetaUnit).eInverseRemove(this, IoPackage.KERMETA_UNIT__TYPE_DEFINITION_CACHE, KermetaUnit.class, msgs);
			if (newKermetaUnit != null)
				msgs = ((InternalEObject)newKermetaUnit).eInverseAdd(this, IoPackage.KERMETA_UNIT__TYPE_DEFINITION_CACHE, KermetaUnit.class, msgs);
			msgs = basicSetKermetaUnit(newKermetaUnit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IoPackage.TYPE_DEFINITION_CACHE__KERMETA_UNIT, newKermetaUnit, newKermetaUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public TypeDefinition getTypeDefinitionByName(String name) {
		return getTypeDefinitionByName( name, new NullProgressMonitor() );
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public TypeDefinition getTypeDefinitionByQualifiedName(String qualifiedName) {
		return getTypeDefinitionByQualifiedName( qualifiedName, new NullProgressMonitor() );
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public TypeDefinition getInternalTypeDefinitionByQualifiedName(String name) {
		TypeDefinitionCacheEntry entry = entries.get( name );
		if ( entry != null )
			return entry.getTypeDefinition();
		else {
			return null;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void addTypeDefinition(String qualifiedName, TypeDefinition typeDefinition) {
		TypeDefinitionCacheEntry entry = getEntries().get(qualifiedName);
		if ( entry == null ) {
			entry = IoFactory.eINSTANCE.createTypeDefinitionCacheEntry();
			entry.setQualifiedName( qualifiedName );
			getEntries().put(qualifiedName, entry);
		} else {
			// Here we got a problem if the definition is not an aspect.
			// That means that several type definitions with the same qualified name exist.
			if ( ! typeDefinition.isIsAspect() && ! entry.getTypeDefinition().isIsAspect() ) { 
				String message = "Type Definition " + qualifiedName + " already exists.";
				getKermetaUnit().error(message, typeDefinition);
			}
		}
		entry.setTypeDefinition( typeDefinition );
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public TypeDefinition getTypeDefinitionByName(String name, IProgressMonitor monitor) {
		TypeDefinition result = getTypeDefinitionByQualifiedName(name, monitor);
		if ( result == null ) {
			for ( String using : kermetaUnit.getUsings() ) {
				result = getTypeDefinitionByQualifiedName(using + "::" + name, monitor);
				if ( result != null )
					return result;
			}
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public TypeDefinition getTypeDefinitionByQualifiedName(String qualifiedName, IProgressMonitor monitor) {
		TypeDefinitionCacheEntry entry = entries.get( qualifiedName );
		if ( entry != null )
			return entry.getTypeDefinition();
		else {
			/*
			 * 
			 * If the external packages has not been set up, this means that the importing of kermeta unit has to be done.
			 * So even if the imported kermeta units are there, we do not search through them.
			 * 
			 */
			if ( externalSearchAuthorized ) {
				for ( KermetaUnit importedUnit : KermetaUnitHelper.getAllImportedKermetaUnits( kermetaUnit ) ) {
					entry = importedUnit.getTypeDefinitionCache().getEntries().get(qualifiedName);
						if ( entry != null )
							return entry.getTypeDefinition();
				}
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IoPackage.TYPE_DEFINITION_CACHE__KERMETA_UNIT:
				if (kermetaUnit != null)
					msgs = ((InternalEObject)kermetaUnit).eInverseRemove(this, IoPackage.KERMETA_UNIT__TYPE_DEFINITION_CACHE, KermetaUnit.class, msgs);
				return basicSetKermetaUnit((KermetaUnit)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IoPackage.TYPE_DEFINITION_CACHE__KERMETA_UNIT:
				return basicSetKermetaUnit(null, msgs);
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
			case IoPackage.TYPE_DEFINITION_CACHE__KERMETA_UNIT:
				if (resolve) return getKermetaUnit();
				return basicGetKermetaUnit();
			case IoPackage.TYPE_DEFINITION_CACHE__ENTRIES:
				return getEntries();
			case IoPackage.TYPE_DEFINITION_CACHE__EXTERNAL_SEARCH_AUTHORIZED:
				return isExternalSearchAuthorized() ? Boolean.TRUE : Boolean.FALSE;
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
			case IoPackage.TYPE_DEFINITION_CACHE__KERMETA_UNIT:
				setKermetaUnit((KermetaUnit)newValue);
				return;
			case IoPackage.TYPE_DEFINITION_CACHE__ENTRIES:
				setEntries((Map<String, TypeDefinitionCacheEntry>)newValue);
				return;
			case IoPackage.TYPE_DEFINITION_CACHE__EXTERNAL_SEARCH_AUTHORIZED:
				setExternalSearchAuthorized(((Boolean)newValue).booleanValue());
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
			case IoPackage.TYPE_DEFINITION_CACHE__KERMETA_UNIT:
				setKermetaUnit((KermetaUnit)null);
				return;
			case IoPackage.TYPE_DEFINITION_CACHE__ENTRIES:
				setEntries((Map<String, TypeDefinitionCacheEntry>)null);
				return;
			case IoPackage.TYPE_DEFINITION_CACHE__EXTERNAL_SEARCH_AUTHORIZED:
				setExternalSearchAuthorized(EXTERNAL_SEARCH_AUTHORIZED_EDEFAULT);
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
			case IoPackage.TYPE_DEFINITION_CACHE__KERMETA_UNIT:
				return kermetaUnit != null;
			case IoPackage.TYPE_DEFINITION_CACHE__ENTRIES:
				return entries != null;
			case IoPackage.TYPE_DEFINITION_CACHE__EXTERNAL_SEARCH_AUTHORIZED:
				return externalSearchAuthorized != EXTERNAL_SEARCH_AUTHORIZED_EDEFAULT;
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
		result.append(" (entries: ");
		result.append(entries);
		result.append(", externalSearchAuthorized: ");
		result.append(externalSearchAuthorized);
		result.append(')');
		return result.toString();
	}

	@Override
	protected void finalize() throws Throwable {
		entries.clear();
		setKermetaUnit(null);
		super.finalize();
	}
} //TypeDefinitionCacheImpl
