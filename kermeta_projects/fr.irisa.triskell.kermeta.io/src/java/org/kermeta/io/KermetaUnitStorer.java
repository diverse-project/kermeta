/**
 * <copyright>
 * </copyright>
 *
 * $Id: KermetaUnitStorer.java,v 1.9 2008-04-28 11:50:16 ftanguy Exp $
 */
package org.kermeta.io;

import java.util.Map;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import fr.irisa.triskell.kermeta.exceptions.KermetaIOException;
import fr.irisa.triskell.kermeta.exceptions.NotRegisteredURIException;
import fr.irisa.triskell.kermeta.exceptions.URIMalformedException;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Kermeta Unit Storer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.io.KermetaUnitStorer#getKermetaUnits <em>Kermeta Units</em>}</li>
 *   <li>{@link org.kermeta.io.KermetaUnitStorer#getKermetaUnitsBeingLoaded <em>Kermeta Units Being Loaded</em>}</li>
 *   <li>{@link org.kermeta.io.KermetaUnitStorer#getKermetaUnitsBeingUnloaded <em>Kermeta Units Being Unloaded</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.io.IoPackage#getKermetaUnitStorer()
 * @model
 * @generated
 */
public interface KermetaUnitStorer extends EObject {
	/**
	 * Returns the value of the '<em><b>Kermeta Units</b></em>' containment reference list.
	 * The list contents are of type {@link org.kermeta.io.KermetaUnit}.
	 * It is bidirectional and its opposite is '{@link org.kermeta.io.KermetaUnit#getStorer <em>Storer</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kermeta Units</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kermeta Units</em>' containment reference list.
	 * @see org.kermeta.io.IoPackage#getKermetaUnitStorer_KermetaUnits()
	 * @see org.kermeta.io.KermetaUnit#getStorer
	 * @model opposite="storer" containment="true"
	 * @generated
	 */
	EList<KermetaUnit> getKermetaUnits();

	/**
	 * Returns the value of the '<em><b>Kermeta Units Being Loaded</b></em>' reference list.
	 * The list contents are of type {@link org.kermeta.io.KermetaUnit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kermeta Units Being Loaded</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kermeta Units Being Loaded</em>' reference list.
	 * @see org.kermeta.io.IoPackage#getKermetaUnitStorer_KermetaUnitsBeingLoaded()
	 * @model
	 * @generated
	 */
	EList<KermetaUnit> getKermetaUnitsBeingLoaded();

	/**
	 * Returns the value of the '<em><b>Kermeta Units Being Unloaded</b></em>' reference list.
	 * The list contents are of type {@link org.kermeta.io.KermetaUnit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kermeta Units Being Unloaded</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kermeta Units Being Unloaded</em>' reference list.
	 * @see org.kermeta.io.IoPackage#getKermetaUnitStorer_KermetaUnitsBeingUnloaded()
	 * @model
	 * @generated
	 */
	EList<KermetaUnit> getKermetaUnitsBeingUnloaded();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws KermetaIOException 
	 * @model
	 * @generated NOT
	 */
	KermetaUnit get(String uri) throws URIMalformedException, NotRegisteredURIException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	KermetaUnit find(String uri);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model monitorDataType="org.kermeta.io.IProgressMonitor"
	 * @generated
	 */
	void load(String uri, Map<Object, Object> options, IProgressMonitor monitor);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void unload(String uri);

} // KermetaUnitStorer