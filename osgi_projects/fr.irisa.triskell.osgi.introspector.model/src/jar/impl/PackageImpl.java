/**
 * <copyright>
 * </copyright>
 *
 * $Id: PackageImpl.java,v 1.7 2008-08-04 13:46:15 edaubert Exp $
 */
package jar.impl;

import jar.BundleEntry;
import jar.Class;
import jar.JarFactory;
import jar.JarPackage;
import jar.Package;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jar.impl.PackageImpl#getClasses <em>Classes</em>}</li>
 *   <li>{@link jar.impl.PackageImpl#getSubPackages <em>Sub Packages</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PackageImpl extends BundleEntryImpl implements jar.Package {
	/**
	 * The cached value of the '{@link #getClasses() <em>Classes</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getClasses()
	 * @generated
	 * @ordered
	 */
	protected EList<jar.Class> classes;

	/**
	 * The cached value of the '{@link #getSubPackages() <em>Sub Packages</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getSubPackages()
	 * @generated
	 * @ordered
	 */
	protected EList<jar.Package> subPackages;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected PackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JarPackage.Literals.PACKAGE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<jar.Class> getClasses() {
		if (classes == null) {
			classes = new EObjectContainmentEList<jar.Class>(jar.Class.class, this, JarPackage.PACKAGE__CLASSES);
		}
		return classes;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<jar.Package> getSubPackages() {
		if (subPackages == null) {
			subPackages = new EObjectContainmentEList<jar.Package>(jar.Package.class, this, JarPackage.PACKAGE__SUB_PACKAGES);
		}
		return subPackages;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JarPackage.PACKAGE__CLASSES:
				return ((InternalEList<?>)getClasses()).basicRemove(otherEnd, msgs);
			case JarPackage.PACKAGE__SUB_PACKAGES:
				return ((InternalEList<?>)getSubPackages()).basicRemove(otherEnd, msgs);
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
			case JarPackage.PACKAGE__CLASSES:
				return getClasses();
			case JarPackage.PACKAGE__SUB_PACKAGES:
				return getSubPackages();
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
			case JarPackage.PACKAGE__CLASSES:
				getClasses().clear();
				getClasses().addAll((Collection<? extends jar.Class>)newValue);
				return;
			case JarPackage.PACKAGE__SUB_PACKAGES:
				getSubPackages().clear();
				getSubPackages().addAll((Collection<? extends jar.Package>)newValue);
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
			case JarPackage.PACKAGE__CLASSES:
				getClasses().clear();
				return;
			case JarPackage.PACKAGE__SUB_PACKAGES:
				getSubPackages().clear();
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
			case JarPackage.PACKAGE__CLASSES:
				return classes != null && !classes.isEmpty();
			case JarPackage.PACKAGE__SUB_PACKAGES:
				return subPackages != null && !subPackages.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	public void addClass(Class clazz) {
		if (clazz.getFullPath().contains(this.getFullPath())) {
			String[] packagesClazz = clazz.getFullPath().split("\\.");
			String[] packages = this.getFullPath().split("\\.");
			int nextPackage;
			if (packages[packages.length - 1] == "") {
				nextPackage = packages.length - 1;
			} else {
				nextPackage = packages.length;
			}
			if (nextPackage == packagesClazz.length - 1) {
				boolean exist = false;
				for (Class tmp : getClasses()) {
					if (tmp.getFullPath().equals(clazz.getFullPath())) {
						exist = true;
						break;
					}
				}
				if (!exist) {
					getClasses().add(clazz);	
				}
			} else {
				String _packageName = packagesClazz[nextPackage];
				boolean exist = false;
				Iterator<Package> packagesIterator = getSubPackages()
						.iterator();
				while (!exist && packagesIterator.hasNext()) {
					Package p = packagesIterator.next();
					if (p.getFullPath().equals(
							getFullPath() + "." + _packageName)) {
						p.addClass(clazz);
						exist = true;
					}
				}
				if (!exist) {
					Package p = JarFactory.eINSTANCE.createPackage();
					p.setFullPath(this.getFullPath() + "." + _packageName);
					p.setName(_packageName);
					getSubPackages().add(p);
					p.addClass(clazz);
				}
			}
		}
	}

	public Class getClass(String fullPath) {
		if (fullPath.contains(this.getFullPath())) {
			String[] packagesClazz = fullPath.split("\\.");
			String[] packages = this.getFullPath().split("\\.");
			int nextPackage;
			if (packages[packages.length - 1] == "") {
				nextPackage = packages.length - 1;
			} else {
				nextPackage = packages.length;
			}
			if (nextPackage == packagesClazz.length - 1) {
				for (Iterator<Class> classesIterator = getClasses().iterator(); classesIterator
						.hasNext();) {
					Class tmp = classesIterator.next();
					if (tmp.getFullPath().equals(fullPath)) {
						return tmp;
					}
				}
			} else {
				String _packageName = packagesClazz[nextPackage];
				Iterator<Package> packagesIterator = getSubPackages()
						.iterator();
				while (packagesIterator.hasNext()) {
					Package p = packagesIterator.next();
					if (getFullPath().equals("")) {
						if (p.getFullPath().equals(_packageName)) {
							return p.getClass(fullPath);
						}
					}
					if (p.getFullPath().equals(
							getFullPath() + "." + _packageName)) {
						return p.getClass(fullPath);
					}
				}
			}
		}
		return null;
	}

	public BundleEntry getSubElement(String fullPath) {

		if (fullPath.contains(this.getFullPath())) {
			String[] packagesElement = fullPath.split("\\.");
			String[] packages = this.getFullPath().split("\\.");
			int nextPackage = packages.length;
			if (nextPackage == packagesElement.length - 1) {
				for (Iterator<Class> classesIterator = getClasses().iterator(); classesIterator
						.hasNext();) {
					Class tmp = classesIterator.next();
					if (tmp.getFullPath().equals(fullPath)) {
						return tmp;
					}
				}
				for (Iterator<Package> packagesIterator = getSubPackages()
						.iterator(); packagesIterator.hasNext();) {
					Package tmp = packagesIterator.next();
					if (tmp.getFullPath().equals(fullPath)) {
						return tmp;
					}
				}
			} else {
				String _packageName = packagesElement[nextPackage];
				Iterator<Package> packagesIterator = getSubPackages()
						.iterator();
				while (packagesIterator.hasNext()) {
					Package p = packagesIterator.next();
					if (p.getFullPath().equals(
							getFullPath() + "." + _packageName)) {
						return p.getSubElement(fullPath);
					}
				}
			}
		}

		return null;
	}

	public void addPackage(Package _package) {
		if (_package.getFullPath().contains(this.getFullPath())) {
			String[] packagesClazz = _package.getFullPath().split("\\.");
			String[] packages = this.getFullPath().split("\\.");
			int nextPackage;
			if (packages[packages.length - 1] == "") {
				nextPackage = packages.length - 1;
			} else {
				nextPackage = packages.length;
			}
			if (nextPackage == packagesClazz.length - 1) {
				Package p = null;
				for (Package tmp : getSubPackages()) {
					if (tmp.getFullPath().equals(_package.getFullPath())) {
						p = tmp;
						break;
					}
				}
				if (p == null) {
					getSubPackages().add(_package);
				} else {
					// To prevent ConcurrentModificationException, we need to use integer and not iterator
					// because package are detach from there parent and next attach into another parent.
					// so _package.getSubPackages() is modified.
					int i = 0;
					int size = _package.getSubPackages().size();
					while (i < size) {
						Package tmp = _package.getSubPackages().get(i);
						p.addPackage(tmp);
						if (size == _package.getSubPackages().size()) {
							i++;
						}
						size = _package.getSubPackages().size();
					}
					
					i = 0;
					size = _package.getClasses().size();
					while (i < size) {
						Class tmp = _package.getClasses().get(i);
						p.addClass(tmp);
						if (size == _package.getClasses().size()) {
							i++;
						}
						size = _package.getClasses().size();
					}
				}
			} else {
				String _packageName = packagesClazz[nextPackage];
				boolean exist = false;
				Iterator<Package> packagesIterator = getSubPackages()
						.iterator();
				while (!exist && packagesIterator.hasNext()) {
					Package p = packagesIterator.next();
					if (p.getFullPath().equals(
							getFullPath() + "." + _packageName)) {
						p.addPackage(_package);
						exist = true;
					}
				}
				if (!exist) {
					Package p = JarFactory.eINSTANCE.createPackage();
					p.setFullPath(this.getFullPath() + "." + _packageName);
					p.setName(_packageName);
					getSubPackages().add(p);
					p.addPackage(_package);
				}
			}
		}

	}

	public Package getPackage(String fullPath) {
		if (fullPath.contains(this.getFullPath())) {
			String[] packagesClazz = fullPath.split("\\.");
			String[] packages = this.getFullPath().split("\\.");
			int nextPackage;
			if (packages[packages.length - 1] == "") {
				nextPackage = packages.length - 1;
			} else {
				nextPackage = packages.length;
			}
			if (nextPackage == packagesClazz.length - 1) {
				for (Package tmp : getSubPackages()) {
					if (tmp.getFullPath().equals(fullPath)) {
						return tmp;
					}
				}
			} else {
				String _packageName = packagesClazz[nextPackage];
				Iterator<Package> packagesIterator = getSubPackages()
						.iterator();
				while (packagesIterator.hasNext()) {
					Package p = packagesIterator.next();
					if (getFullPath().equals("")) {
						if (p.getFullPath().equals(_packageName)) {
							return p.getPackage(fullPath);
						}
					} else {
						if (p.getFullPath().equals(
								getFullPath() + "." + _packageName)) {
							return p.getPackage(fullPath);
						}
					}
				}
			}
		}
		return null;
	}

	public List<Class> getClassWithRegex(String regex) {
		List<Class> classes = new ArrayList<Class>();
		if (!regex.contains("*")) {
			Class clazz = this.getClass(getFullPath() + regex);
			if (clazz != null) {
				classes.add(clazz);
			}
		} else {
			for (Iterator<Class> classesIterator = getClasses().iterator(); classesIterator
					.hasNext();) {
				Class tmp = classesIterator.next();
				if (tmp.getName().matches(regex)) {
					classes.add(tmp);
				}
			}
		}
		return classes;
	}

} // PackageImpl
