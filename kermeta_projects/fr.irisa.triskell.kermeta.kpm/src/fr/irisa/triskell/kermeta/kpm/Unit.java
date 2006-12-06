/**
 * <copyright>
 * </copyright>
 *
 * $Id: Unit.java,v 1.2 2006-12-06 09:54:39 ftanguy Exp $
 */
package fr.irisa.triskell.kermeta.kpm;

import java.util.ArrayList;
import java.util.Date;

import java.util.EnumSet;
import java.util.HashSet;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.irisa.triskell.kermeta.kpm.Unit#getName <em>Name</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.kpm.Unit#getPath <em>Path</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.kpm.Unit#getLastTimeModified <em>Last Time Modified</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.kpm.Unit#getKpm <em>Kpm</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.kpm.Unit#getOwnedDependencies <em>Owned Dependencies</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.kpm.Unit#getProject <em>Project</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.irisa.triskell.kermeta.kpm.KpmPackage#getUnit()
 * @model abstract="true"
 * @generated
 */
public interface Unit extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see fr.irisa.triskell.kermeta.kpm.KpmPackage#getUnit_Name()
	 * @model dataType="fr.irisa.triskell.kermeta.kpm.String"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link fr.irisa.triskell.kermeta.kpm.Unit#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' attribute.
	 * @see #setPath(String)
	 * @see fr.irisa.triskell.kermeta.kpm.KpmPackage#getUnit_Path()
	 * @model dataType="fr.irisa.triskell.kermeta.kpm.String"
	 * @generated
	 */
	String getPath();

	/**
	 * Sets the value of the '{@link fr.irisa.triskell.kermeta.kpm.Unit#getPath <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' attribute.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(String value);

	/**
	 * Returns the value of the '<em><b>Last Time Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Time Modified</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Time Modified</em>' attribute.
	 * @see #setLastTimeModified(Date)
	 * @see fr.irisa.triskell.kermeta.kpm.KpmPackage#getUnit_LastTimeModified()
	 * @model dataType="fr.irisa.triskell.kermeta.kpm.Date"
	 * @generated
	 */
	Date getLastTimeModified();

	/**
	 * Sets the value of the '{@link fr.irisa.triskell.kermeta.kpm.Unit#getLastTimeModified <em>Last Time Modified</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Time Modified</em>' attribute.
	 * @see #getLastTimeModified()
	 * @generated
	 */
	void setLastTimeModified(Date value);

	/**
	 * Returns the value of the '<em><b>Kpm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kpm</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kpm</em>' reference.
	 * @see #setKpm(KPM)
	 * @see fr.irisa.triskell.kermeta.kpm.KpmPackage#getUnit_Kpm()
	 * @model
	 * @generated
	 */
	KPM getKpm();

	/**
	 * Sets the value of the '{@link fr.irisa.triskell.kermeta.kpm.Unit#getKpm <em>Kpm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kpm</em>' reference.
	 * @see #getKpm()
	 * @generated
	 */
	void setKpm(KPM value);

	/**
	 * Returns the value of the '<em><b>Owned Dependencies</b></em>' reference list.
	 * The list contents are of type {@link fr.irisa.triskell.kermeta.kpm.Dependency}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Dependencies</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Dependencies</em>' reference list.
	 * @see fr.irisa.triskell.kermeta.kpm.KpmPackage#getUnit_OwnedDependencies()
	 * @model type="fr.irisa.triskell.kermeta.kpm.Dependency"
	 * @generated
	 */
	EList getOwnedDependencies();

	/**
	 * Returns the value of the '<em><b>Project</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Project</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Project</em>' reference.
	 * @see #setProject(Project)
	 * @see fr.irisa.triskell.kermeta.kpm.KpmPackage#getUnit_Project()
	 * @model
	 * @generated
	 */
	Project getProject();

	/**
	 * Sets the value of the '{@link fr.irisa.triskell.kermeta.kpm.Unit#getProject <em>Project</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Project</em>' reference.
	 * @see #getProject()
	 * @generated
	 */
	void setProject(Project value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="fr.irisa.triskell.kermeta.kpm.boolean"
	 * @generated
	 */
	boolean isFile();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="fr.irisa.triskell.kermeta.kpm.boolean"
	 * @generated
	 */
	boolean isProject();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="fr.irisa.triskell.kermeta.kpm.boolean"
	 * @generated
	 */
	boolean isDirectory();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void changed();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="fr.irisa.triskell.kermeta.kpm.String"
	 * @generated
	 */
	String getRelativeName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="fr.irisa.triskell.kermeta.kpm.String"
	 * @generated
	 */
	String getAbsoluteName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="fr.irisa.triskell.kermeta.kpm.HashSet" typeDataType="fr.irisa.triskell.kermeta.kpm.String"
	 * @generated
	 */
	HashSet getDependencies(String type);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="fr.irisa.triskell.kermeta.kpm.String"
	 * @generated
	 */
	String getExtension();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model nameDataType="fr.irisa.triskell.kermeta.kpm.String"
	 * @generated
	 */
	void receiveEvent(String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="fr.irisa.triskell.kermeta.kpm.HashSet"
	 * @generated
	 */
	HashSet getDependencies(Unit unit);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void removeDependencies(Unit to);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model typeNameDataType="fr.irisa.triskell.kermeta.kpm.String" eventNameDataType="fr.irisa.triskell.kermeta.kpm.String"
	 * @generated
	 */
	Dependency findDependency(Unit to, String typeName, String eventName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="fr.irisa.triskell.kermeta.kpm.ArrayList"
	 * @generated
	 */
	ArrayList getDependenciesUnit();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="fr.irisa.triskell.kermeta.kpm.HashSet" eventNameDataType="fr.irisa.triskell.kermeta.kpm.String"
	 * @generated
	 */
	HashSet getDependenciesWithEvent(String eventName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void removeDependencies(Type type);


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void remove();

} // Unit