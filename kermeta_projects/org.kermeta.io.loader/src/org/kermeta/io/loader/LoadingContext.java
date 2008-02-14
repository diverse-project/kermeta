/**
 * <copyright>
 * </copyright>
 *
 * $Id: LoadingContext.java,v 1.2 2008-02-14 07:12:49 uid21732 Exp $
 */
package org.kermeta.io.loader;

import java.util.Map;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;

import fr.irisa.triskell.kermeta.exceptions.NotRegisteredURIException;
import fr.irisa.triskell.kermeta.exceptions.URIMalformedException;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Loading Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.io.loader.LoadingContext#getLoaders <em>Loaders</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.io.loader.LoaderPackage#getLoadingContext()
 * @model
 * @generated
 */
public interface LoadingContext extends EObject {
	/**
	 * Returns the value of the '<em><b>Loaders</b></em>' containment reference list.
	 * The list contents are of type {@link org.kermeta.io.loader.Loader}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Loaders</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Loaders</em>' containment reference list.
	 * @see org.kermeta.io.loader.LoaderPackage#getLoadingContext_Loaders()
	 * @model containment="true"
	 * @generated
	 */
	EList<Loader> getLoaders();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void load(String uri, Map<?, ?> options) throws URIMalformedException, NotRegisteredURIException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model uriDataType="org.kermeta.io.loader.URI"
	 * @generated
	 */
	Loader getLoader(URI uri);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void load(String uri, String stepName, Map<?, ?> options) throws URIMalformedException, NotRegisteredURIException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model uriDataType="org.kermeta.io.loader.URI"
	 * @generated
	 */
	Loader getLoaderToUse(URI uri, Map<?, ?> options) throws URIMalformedException, NotRegisteredURIException;

} // LoadingContext
