/**
 * <copyright>
 * </copyright>
 *
 * $Id: FolderImpl.java,v 1.10 2008-08-19 07:04:46 edaubert Exp $
 */
package jar.impl;

import jar.Folder;
import jar.JarFactory;
import jar.JarPackage;
import jar.SystemEntry;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Folder</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jar.impl.FolderImpl#getEntries <em>Entries</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FolderImpl extends SystemEntryImpl implements Folder {
	/**
	 * The cached value of the '{@link #getEntries() <em>Entries</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getEntries()
	 * @generated
	 * @ordered
	 */
	protected EList<SystemEntry> entries;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected FolderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JarPackage.Literals.FOLDER;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SystemEntry> getEntries() {
		if (entries == null) {
			entries = new EObjectContainmentEList<SystemEntry>(SystemEntry.class, this, JarPackage.FOLDER__ENTRIES);
		}
		return entries;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JarPackage.FOLDER__ENTRIES:
				return ((InternalEList<?>)getEntries()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JarPackage.FOLDER__ENTRIES:
				return getEntries();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case JarPackage.FOLDER__ENTRIES:
				getEntries().clear();
				getEntries().addAll((Collection<? extends SystemEntry>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case JarPackage.FOLDER__ENTRIES:
				getEntries().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case JarPackage.FOLDER__ENTRIES:
				return entries != null && !entries.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	public boolean addEntry(SystemEntry entry) {
		if (entry.getFullPath().contains(this.getFullPath())) {
			String[] packagesClazz = entry.getFullPath().split("/");
			String[] packages = this.getFullPath().split("/");
			int nextPackage;
			if (packages[packages.length - 1].equals("")) {
				nextPackage = packages.length - 1;
			} else {
				nextPackage = packages.length;
			}
			if (nextPackage == packagesClazz.length - 1) {
				SystemEntry p = null;
				for (SystemEntry entryTmp : getEntries()) {
					if (entryTmp.getFullPath().equals(entry.getFullPath())) {
						p = entryTmp;
						break;
					}
				}
				if (p == null) {
					return getEntries().add(entry);
				} else if (entry instanceof Folder) {
					boolean allAdded = true;
					for (SystemEntry entryTmp : ((Folder) entry).getEntries()) {
						allAdded = allAdded & ((Folder) p).addEntry(entryTmp);
					}
					p.setBundleClassPath(entry.isBundleClassPath());
					return allAdded;
				}
			} else {
				String _packageName = packagesClazz[nextPackage];
				for (SystemEntry tmp : getEntries()) {
					if (tmp instanceof Folder
							&& tmp.getFullPath().equals(
									getFullPath() + _packageName + "/")) {
						return ((Folder) tmp).addEntry(entry);
						// exist = true;
					}
				}
				Folder p = JarFactory.eINSTANCE.createFolder();
				p.setFullPath(this.getFullPath() + _packageName + "/");
				p.setName(_packageName);
				p.setBundleClassPath(entry.isBundleClassPath());
				getEntries().add(p);
				this.setBundleClassPath(entry.isBundleClassPath());
				return p.addEntry(entry);
			}
		}
		return false;
	}

	public SystemEntry getEntry(String fullPath) {
		if (fullPath.startsWith("./")) {
			fullPath = fullPath.replaceFirst("./", "");
		}
		if (fullPath.contains(this.getFullPath())) {
			String[] packagesElement = fullPath.split("/");
			String[] foldersNames = this.getFullPath().split("/");
			int nextFolder;
			if (foldersNames[foldersNames.length - 1].equals("")) {
				nextFolder = foldersNames.length - 1;
			} else {
				nextFolder = foldersNames.length;
			}
			if (nextFolder == packagesElement.length - 1) {
				for (SystemEntry tmp : getEntries()) {
					if (tmp.getFullPath().equals(fullPath)) {
						return tmp;
					}
				}
			} else {
				String folderName = packagesElement[nextFolder];
				for (SystemEntry entry : getEntries()) {
					if (entry instanceof Folder
							&& entry.getName().equals(folderName)) {
						return ((Folder) entry).getEntry(fullPath);
					}/*
						 * else if (entry.getName().equals(folderName)) { return
						 * entry; }
						 */
				}
			}
		}
		return null;
	}

} // FolderImpl
