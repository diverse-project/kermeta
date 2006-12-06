/**
 * <copyright>
 * </copyright>
 *
 * $Id: ProjectImpl.java,v 1.2 2006-12-06 09:54:39 ftanguy Exp $
 */
package fr.irisa.triskell.kermeta.kpm.impl;

import fr.irisa.triskell.kermeta.kpm.KpmPackage;
import fr.irisa.triskell.kermeta.kpm.Project;

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
} //ProjectImpl