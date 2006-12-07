/**
 * <copyright>
 * </copyright>
 *
 * $Id: ProjectImpl.java,v 1.3 2006-12-07 13:47:21 ftanguy Exp $
 */
package fr.irisa.triskell.kermeta.kpm.impl;

import fr.irisa.triskell.kermeta.kpm.KpmPackage;
import fr.irisa.triskell.kermeta.kpm.Project;
import fr.irisa.triskell.kermeta.kpm.helpers.IResourceHelper;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Project</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ProjectImpl extends DirectoryImpl implements Project {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return KpmPackage.Literals.PROJECT;
	}

	public boolean isProject() {
		return true;
	}
	
	public boolean isDirectory() {
		return true;
	}

	public String getRelativeName() {
		return getPath() + getName();
	}
	
	public void remove() {
		kpm.removeProject(this);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void load() {
		setValue( IResourceHelper.getIProject( this ) );
	}
} //ProjectImpl