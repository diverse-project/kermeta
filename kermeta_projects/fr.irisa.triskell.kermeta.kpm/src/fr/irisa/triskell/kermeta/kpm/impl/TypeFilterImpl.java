/**
 * <copyright>
 * </copyright>
 *
 * $Id: TypeFilterImpl.java,v 1.6 2008-05-28 09:26:14 ftanguy Exp $
 */
package fr.irisa.triskell.kermeta.kpm.impl;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import fr.irisa.triskell.eclipse.resources.ResourceHelper;
import fr.irisa.triskell.kermeta.kpm.KpmPackage;
import fr.irisa.triskell.kermeta.kpm.TypeFilter;
import fr.irisa.triskell.kermeta.kpm.Unit;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Filter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.irisa.triskell.kermeta.kpm.impl.TypeFilterImpl#getJavaClassName <em>Java Class Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeFilterImpl extends FilterImpl implements TypeFilter {
	/**
	 * The default value of the '{@link #getJavaClassName() <em>Java Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJavaClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String JAVA_CLASS_NAME_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getJavaClassName() <em>Java Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJavaClassName()
	 * @generated
	 * @ordered
	 */
	protected String javaClassName = JAVA_CLASS_NAME_EDEFAULT;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeFilterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KpmPackage.Literals.TYPE_FILTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getJavaClassName() {
		return javaClassName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJavaClassName(String newJavaClassName) {
		String oldJavaClassName = javaClassName;
		javaClassName = newJavaClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KpmPackage.TYPE_FILTER__JAVA_CLASS_NAME, oldJavaClassName, javaClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case KpmPackage.TYPE_FILTER__JAVA_CLASS_NAME:
				return getJavaClassName();
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
			case KpmPackage.TYPE_FILTER__JAVA_CLASS_NAME:
				setJavaClassName((String)newValue);
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
			case KpmPackage.TYPE_FILTER__JAVA_CLASS_NAME:
				setJavaClassName(JAVA_CLASS_NAME_EDEFAULT);
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
			case KpmPackage.TYPE_FILTER__JAVA_CLASS_NAME:
				return JAVA_CLASS_NAME_EDEFAULT == null ? javaClassName != null : !JAVA_CLASS_NAME_EDEFAULT.equals(javaClassName);
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
		result.append(" (javaClassName: ");
		result.append(javaClassName);
		result.append(')');
		return result.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean matches(Unit unit) {
		
		try {
			IResource resource = null;
			Class<?> type = Class.forName( getJavaClassName() );
			IFile file = ResourceHelper.getIFile( unit.getName() );
			if ( (file != null) && file.exists() )
				resource = file;
			
			if ( resource == null ) {
				IFolder folder = ResourceHelper.getIFolder( unit.getName() );
				if ( (folder != null) && folder.exists() )
					resource = folder;
			}
			
			if ( resource == null ) {
				IProject project = ResourceHelper.getIProject( unit.getName() );
				if ( (project != null) && project.exists() )
					resource = project;
			}
			
			if ( resource == null )
				return false;
			else
				return type.isInstance( resource );
			
		} catch (ClassNotFoundException e) {
			return false;
		}

	}


} //TypeFilterImpl