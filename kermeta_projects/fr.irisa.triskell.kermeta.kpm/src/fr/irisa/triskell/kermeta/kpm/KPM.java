/**
 * <copyright>
 * </copyright>
 *
 * $Id: KPM.java,v 1.4 2006-12-12 16:06:12 ftanguy Exp $
 */
package fr.irisa.triskell.kermeta.kpm;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>KPM</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.irisa.triskell.kermeta.kpm.KPM#getEvents <em>Events</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.kpm.KPM#getDependencies <em>Dependencies</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.kpm.KPM#getActions <em>Actions</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.kpm.KPM#getFilters <em>Filters</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.kpm.KPM#getTypes <em>Types</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.kpm.KPM#getExpressions <em>Expressions</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.kpm.KPM#getUnits <em>Units</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.irisa.triskell.kermeta.kpm.KpmPackage#getKPM()
 * @model
 * @generated
 */
public interface KPM extends EObject {
	/**
	 * Returns the value of the '<em><b>Units</b></em>' containment reference list.
	 * The list contents are of type {@link fr.irisa.triskell.kermeta.kpm.Unit}.
	 * It is bidirectional and its opposite is '{@link fr.irisa.triskell.kermeta.kpm.Unit#getKpm <em>Kpm</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Units</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Units</em>' containment reference list.
	 * @see fr.irisa.triskell.kermeta.kpm.KpmPackage#getKPM_Units()
	 * @see fr.irisa.triskell.kermeta.kpm.Unit#getKpm
	 * @model type="fr.irisa.triskell.kermeta.kpm.Unit" opposite="kpm" containment="true"
	 * @generated
	 */
	EList getUnits();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model regexDataType="fr.irisa.triskell.kermeta.kpm.String"
	 * @generated
	 */
	NameFilter getNameFilter(String regex);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model nameDataType="fr.irisa.triskell.kermeta.kpm.String"
	 * @generated
	 */
	Action getAction(String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model nameDataType="fr.irisa.triskell.kermeta.kpm.String"
	 * @generated
	 */
	DependencyEvent getEvent(String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model nameDataType="fr.irisa.triskell.kermeta.kpm.String"
	 * @generated
	 */
	Expression getExpression(String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model nameDataType="fr.irisa.triskell.kermeta.kpm.String"
	 * @generated
	 */
	Dependency getDependency(String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model relativeNameDataType="fr.irisa.triskell.kermeta.kpm.String"
	 * @generated
	 */
	File findFile(String relativeName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model nameDataType="fr.irisa.triskell.kermeta.kpm.String" pathDataType="fr.irisa.triskell.kermeta.kpm.String"
	 * @generated
	 */
	File findFile(String name, String path);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ifileDataType="fr.irisa.triskell.kermeta.kpm.IFile"
	 * @generated
	 */
	File findFile(IFile ifile);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model relativeNameDataType="fr.irisa.triskell.kermeta.kpm.String"
	 * @generated
	 */
	Directory findDirectory(String relativeName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model nameDataType="fr.irisa.triskell.kermeta.kpm.String" pathDataType="fr.irisa.triskell.kermeta.kpm.String"
	 * @generated
	 */
	Directory findDirectory(String name, String path);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ifolderDataType="fr.irisa.triskell.kermeta.kpm.IFolder"
	 * @generated
	 */
	Directory findDirectory(IFolder ifolder);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model relativeNameDataType="fr.irisa.triskell.kermeta.kpm.String"
	 * @generated
	 */
	Project findProject(String relativeName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model nameDataType="fr.irisa.triskell.kermeta.kpm.String" pathDataType="fr.irisa.triskell.kermeta.kpm.String"
	 * @generated
	 */
	Project findProject(String name, String path);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model iprojectDataType="fr.irisa.triskell.kermeta.kpm.IProject"
	 * @generated
	 */
	Project findProject(IProject iproject);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void removeFile(File unit);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void removeDirectory(Directory unit);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void removeProject(Project unit);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unitDataType="fr.irisa.triskell.kermeta.kpm.IFile"
	 * @generated
	 */
	void removeFile(IFile unit);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unitDataType="fr.irisa.triskell.kermeta.kpm.IFolder"
	 * @generated
	 */
	void removeDirectory(IFolder unit);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unitDataType="fr.irisa.triskell.kermeta.kpm.IProject"
	 * @generated
	 */
	void removeProject(IProject unit);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ifolderDataType="fr.irisa.triskell.kermeta.kpm.IFolder"
	 * @generated
	 */
	Directory createDirectory(IFolder ifolder);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model nameDataType="fr.irisa.triskell.kermeta.kpm.String"
	 * @generated
	 */
	DependencyType getType(String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	ExistFilter getExistFilter();

	/**
	 * Returns the value of the '<em><b>Events</b></em>' containment reference list.
	 * The list contents are of type {@link fr.irisa.triskell.kermeta.kpm.DependencyEvent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Events</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Events</em>' containment reference list.
	 * @see fr.irisa.triskell.kermeta.kpm.KpmPackage#getKPM_Events()
	 * @model type="fr.irisa.triskell.kermeta.kpm.DependencyEvent" containment="true"
	 * @generated
	 */
	EList getEvents();

	/**
	 * Returns the value of the '<em><b>Dependencies</b></em>' containment reference list.
	 * The list contents are of type {@link fr.irisa.triskell.kermeta.kpm.Dependency}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dependencies</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependencies</em>' containment reference list.
	 * @see fr.irisa.triskell.kermeta.kpm.KpmPackage#getKPM_Dependencies()
	 * @model type="fr.irisa.triskell.kermeta.kpm.Dependency" containment="true"
	 * @generated
	 */
	EList getDependencies();

	/**
	 * Returns the value of the '<em><b>Actions</b></em>' containment reference list.
	 * The list contents are of type {@link fr.irisa.triskell.kermeta.kpm.Action}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions</em>' containment reference list.
	 * @see fr.irisa.triskell.kermeta.kpm.KpmPackage#getKPM_Actions()
	 * @model type="fr.irisa.triskell.kermeta.kpm.Action" containment="true"
	 * @generated
	 */
	EList getActions();

	/**
	 * Returns the value of the '<em><b>Filters</b></em>' containment reference list.
	 * The list contents are of type {@link fr.irisa.triskell.kermeta.kpm.Filter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Filters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filters</em>' containment reference list.
	 * @see fr.irisa.triskell.kermeta.kpm.KpmPackage#getKPM_Filters()
	 * @model type="fr.irisa.triskell.kermeta.kpm.Filter" containment="true"
	 * @generated
	 */
	EList getFilters();

	/**
	 * Returns the value of the '<em><b>Types</b></em>' containment reference list.
	 * The list contents are of type {@link fr.irisa.triskell.kermeta.kpm.DependencyType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Types</em>' containment reference list.
	 * @see fr.irisa.triskell.kermeta.kpm.KpmPackage#getKPM_Types()
	 * @model type="fr.irisa.triskell.kermeta.kpm.DependencyType" containment="true"
	 * @generated
	 */
	EList getTypes();

	/**
	 * Returns the value of the '<em><b>Expressions</b></em>' containment reference list.
	 * The list contents are of type {@link fr.irisa.triskell.kermeta.kpm.Expression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expressions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expressions</em>' containment reference list.
	 * @see fr.irisa.triskell.kermeta.kpm.KpmPackage#getKPM_Expressions()
	 * @model type="fr.irisa.triskell.kermeta.kpm.Expression" containment="true"
	 * @generated
	 */
	EList getExpressions();

} // KPM