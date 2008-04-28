/**
 * <copyright>
 * </copyright>
 *
 * $Id: TypeDefinitionCache.java,v 1.5 2008-04-28 11:50:16 ftanguy Exp $
 */
package org.kermeta.io;

import fr.irisa.triskell.kermeta.language.structure.TypeDefinition;

import java.util.Map;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Definition Cache</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.io.TypeDefinitionCache#getKermetaUnit <em>Kermeta Unit</em>}</li>
 *   <li>{@link org.kermeta.io.TypeDefinitionCache#getEntries <em>Entries</em>}</li>
 *   <li>{@link org.kermeta.io.TypeDefinitionCache#isExternalSearchAuthorized <em>External Search Authorized</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.io.IoPackage#getTypeDefinitionCache()
 * @model
 * @generated
 */
public interface TypeDefinitionCache extends EObject {
	/**
	 * Returns the value of the '<em><b>Entries</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entries</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entries</em>' attribute.
	 * @see #setEntries(Map)
	 * @see org.kermeta.io.IoPackage#getTypeDefinitionCache_Entries()
	 * @model required="true" transient="true"
	 * @generated
	 */
	Map<String, TypeDefinitionCacheEntry> getEntries();

	/**
	 * Sets the value of the '{@link org.kermeta.io.TypeDefinitionCache#getEntries <em>Entries</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entries</em>' attribute.
	 * @see #getEntries()
	 * @generated
	 */
	void setEntries(Map<String, TypeDefinitionCacheEntry> value);

	/**
	 * Returns the value of the '<em><b>External Search Authorized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>External Search Authorized</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External Search Authorized</em>' attribute.
	 * @see #setExternalSearchAuthorized(boolean)
	 * @see org.kermeta.io.IoPackage#getTypeDefinitionCache_ExternalSearchAuthorized()
	 * @model required="true"
	 * @generated
	 */
	boolean isExternalSearchAuthorized();

	/**
	 * Sets the value of the '{@link org.kermeta.io.TypeDefinitionCache#isExternalSearchAuthorized <em>External Search Authorized</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>External Search Authorized</em>' attribute.
	 * @see #isExternalSearchAuthorized()
	 * @generated
	 */
	void setExternalSearchAuthorized(boolean value);

	/**
	 * Returns the value of the '<em><b>Kermeta Unit</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.kermeta.io.KermetaUnit#getTypeDefinitionCache <em>Type Definition Cache</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kermeta Unit</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kermeta Unit</em>' reference.
	 * @see #setKermetaUnit(KermetaUnit)
	 * @see org.kermeta.io.IoPackage#getTypeDefinitionCache_KermetaUnit()
	 * @see org.kermeta.io.KermetaUnit#getTypeDefinitionCache
	 * @model opposite="typeDefinitionCache" required="true"
	 * @generated
	 */
	KermetaUnit getKermetaUnit();

	/**
	 * Sets the value of the '{@link org.kermeta.io.TypeDefinitionCache#getKermetaUnit <em>Kermeta Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kermeta Unit</em>' reference.
	 * @see #getKermetaUnit()
	 * @generated
	 */
	void setKermetaUnit(KermetaUnit value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	TypeDefinition getTypeDefinitionByName(String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	TypeDefinition getTypeDefinitionByQualifiedName(String qualifiedName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void addTypeDefinition(String qualifiedName, TypeDefinition typeDefinition);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model monitorDataType="org.kermeta.io.IProgressMonitor"
	 * @generated
	 */
	TypeDefinition getTypeDefinitionByName(String name, IProgressMonitor monitor);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model monitorDataType="org.kermeta.io.IProgressMonitor"
	 * @generated
	 */
	TypeDefinition getTypeDefinitionByQualifiedName(String qualifiedName, IProgressMonitor monitor);

} // TypeDefinitionCache
