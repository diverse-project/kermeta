/**
 * <copyright>
 * </copyright>
 *
 * $Id: KPM.java,v 1.2 2006-12-07 13:47:21 ftanguy Exp $
 */
package fr.irisa.triskell.kermeta.kpm;

import java.util.ArrayList;

import java.util.HashSet;

import java.util.Set;

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
 *   <li>{@link fr.irisa.triskell.kermeta.kpm.KPM#getUnits <em>Units</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.kpm.KPM#getDependencies <em>Dependencies</em>}</li>
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
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Units</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Units</em>' containment reference list.
	 * @see fr.irisa.triskell.kermeta.kpm.KpmPackage#getKPM_Units()
	 * @model type="fr.irisa.triskell.kermeta.kpm.Unit" containment="true"
	 * @generated
	 */
	EList getUnits();

	/**
	 * Returns the value of the '<em><b>Dependencies</b></em>' containment reference list.
	 * The list contents are of type {@link fr.irisa.triskell.kermeta.kpm.Dependency}.
	 * It is bidirectional and its opposite is '{@link fr.irisa.triskell.kermeta.kpm.Dependency#getKpm <em>Kpm</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dependencies</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependencies</em>' containment reference list.
	 * @see fr.irisa.triskell.kermeta.kpm.KpmPackage#getKPM_Dependencies()
	 * @see fr.irisa.triskell.kermeta.kpm.Dependency#getKpm
	 * @model type="fr.irisa.triskell.kermeta.kpm.Dependency" opposite="kpm" containment="true"
	 * @generated
	 */
	EList getDependencies();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model fileNameDataType="fr.irisa.triskell.kermeta.kpm.String" filePathDataType="fr.irisa.triskell.kermeta.kpm.String"
	 * @generated
	 */
	File createFileIfNecessary(String fileName, String filePath);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model iFileDataType="fr.irisa.triskell.kermeta.kpm.IFile"
	 * @generated
	 */
	File createFileIfNecessary(IFile iFile);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model fileRelativeNameDataType="fr.irisa.triskell.kermeta.kpm.String"
	 * @generated
	 */
	File createFile(String fileName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model fileNameDataType="fr.irisa.triskell.kermeta.kpm.String" filePathDataType="fr.irisa.triskell.kermeta.kpm.String"
	 * @generated
	 */
	File createFile(String fileName, String filePath);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model iFileDataType="fr.irisa.triskell.kermeta.kpm.IFile"
	 * @generated
	 */
	File createFile(IFile iFile);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model fileRelativeNameDataType="fr.irisa.triskell.kermeta.kpm.String"
	 * @generated
	 */
	File findFile(String fileRelativeName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model fileNameDataType="fr.irisa.triskell.kermeta.kpm.String" filePathDataType="fr.irisa.triskell.kermeta.kpm.String"
	 * @generated
	 */
	File findFile(String fileName, String filePath);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model iFileDataType="fr.irisa.triskell.kermeta.kpm.IFile"
	 * @generated
	 */
	File findFile(IFile iFile);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model fileNameDataType="fr.irisa.triskell.kermeta.kpm.String" filePathDataType="fr.irisa.triskell.kermeta.kpm.String"
	 * @generated
	 */
	void removeFile(String fileName, String filePath);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void removeDirectory(Directory directory);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model iFileDataType="fr.irisa.triskell.kermeta.kpm.IFile"
	 * @generated
	 */
	void removeFile(IFile iFile);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model directoryNameDataType="fr.irisa.triskell.kermeta.kpm.String" directoryPathDataType="fr.irisa.triskell.kermeta.kpm.String"
	 * @generated
	 */
	Directory createDirectoryIfNecessary(String directoryName, String directoryPath);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model iDirectoryDataType="fr.irisa.triskell.kermeta.kpm.IFolder"
	 * @generated
	 */
	Directory createDirectoryIfNecessary(IFolder iDirectory);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model directoryNameDataType="fr.irisa.triskell.kermeta.kpm.String" directoryPathDataType="fr.irisa.triskell.kermeta.kpm.String"
	 * @generated
	 */
	Directory createDirectory(String directoryName, String directoryPath);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model directoryRelativeNameDataType="fr.irisa.triskell.kermeta.kpm.String"
	 * @generated
	 */
	Directory createDirectory(String directoryName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model iDirectoryDataType="fr.irisa.triskell.kermeta.kpm.IFolder"
	 * @generated
	 */
	Directory createDirectory(IFolder iDirectory);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model directoryRelativeNameDataType="fr.irisa.triskell.kermeta.kpm.String"
	 * @generated
	 */
	Directory findDirectory(String directoryRelativeName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model directoryNameDataType="fr.irisa.triskell.kermeta.kpm.String" directoryPathDataType="fr.irisa.triskell.kermeta.kpm.String"
	 * @generated
	 */
	void removeDirectory(String directoryName, String directoryPath);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model iDirectoryDataType="fr.irisa.triskell.kermeta.kpm.IFolder"
	 * @generated
	 */
	void removeDirectory(IFolder iDirectory);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model directoryNameDataType="fr.irisa.triskell.kermeta.kpm.String" directoryPathDataType="fr.irisa.triskell.kermeta.kpm.String"
	 * @generated
	 */
	Directory findDirectory(String directoryName, String directoryPath);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model iFolderDataType="fr.irisa.triskell.kermeta.kpm.IFolder"
	 * @generated
	 */
	Directory findDirectory(IFolder iFolder);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model projectNameDataType="fr.irisa.triskell.kermeta.kpm.String"
	 * @generated
	 */
	Project createProjectIfNecessary(String projectName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model iProjectDataType="fr.irisa.triskell.kermeta.kpm.IProject"
	 * @generated
	 */
	Project createProjectIfNecessary(IProject iProject);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model projectNameDataType="fr.irisa.triskell.kermeta.kpm.String"
	 * @generated
	 */
	Project createProject(String projectName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model iProjectDataType="fr.irisa.triskell.kermeta.kpm.IProject"
	 * @generated
	 */
	Project createProject(IProject iProject);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model projectNameDataType="fr.irisa.triskell.kermeta.kpm.String"
	 * @generated
	 */
	Project findProject(String projectName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model iProjectDataType="fr.irisa.triskell.kermeta.kpm.IProject"
	 * @generated
	 */
	Project findProject(IProject iProject);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void removeFile(File file);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model projectNameDataType="fr.irisa.triskell.kermeta.kpm.String"
	 * @generated
	 */
	void removeProject(String projectName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void removeProject(Project project);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model iProjectDataType="fr.irisa.triskell.kermeta.kpm.IProject"
	 * @generated
	 */
	void removeProject(IProject iProject);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model typeNameDataType="fr.irisa.triskell.kermeta.kpm.String" eventNameDataType="fr.irisa.triskell.kermeta.kpm.String" actionsNameDataType="fr.irisa.triskell.kermeta.kpm.ArrayList"
	 * @generated
	 */
	Dependency createDependency(Unit from, Unit to, String typeName, String eventName, ArrayList actionsName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void removeDependencies(Unit unit);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void removeUnit(Unit unit);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model typeNameDataType="fr.irisa.triskell.kermeta.kpm.String" eventNameDataType="fr.irisa.triskell.kermeta.kpm.String"
	 * @generated
	 */
	Dependency findDependency(Unit from, Unit to, String typeName, String eventName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void load();

} // KPM