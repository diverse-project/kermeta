/**
 * <copyright>
 * </copyright>
 *
 * $Id: Loader.java,v 1.3 2008-07-18 07:11:19 dvojtise Exp $
 */
package org.kermeta.io.loader;

import java.util.Map;

import org.eclipse.emf.common.util.URI;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Loader</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.io.loader.Loader#getDatas <em>Datas</em>}</li>
 *   <li>{@link org.kermeta.io.loader.Loader#getUri <em>Uri</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.io.loader.LoaderPackage#getLoader()
 * @model abstract="true"
 * @generated
 */
public interface Loader extends AbstractStep {
	/**
	 * Returns the value of the '<em><b>Datas</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Datas</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datas</em>' containment reference.
	 * @see #setDatas(ILoadingDatas)
	 * @see org.kermeta.io.loader.LoaderPackage#getLoader_Datas()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ILoadingDatas getDatas();

	/**
	 * Sets the value of the '{@link org.kermeta.io.loader.Loader#getDatas <em>Datas</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datas</em>' containment reference.
	 * @see #getDatas()
	 * @generated
	 */
	void setDatas(ILoadingDatas value);

	/**
	 * Returns the value of the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uri</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uri</em>' attribute.
	 * @see #setUri(URI)
	 * @see org.kermeta.io.loader.LoaderPackage#getLoader_Uri()
	 * @model dataType="org.kermeta.io.loader.URI"
	 * @generated
	 */
	URI getUri();

	/**
	 * Sets the value of the '{@link org.kermeta.io.loader.Loader#getUri <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uri</em>' attribute.
	 * @see #getUri()
	 * @generated
	 */
	void setUri(URI value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void load(Map<?, ?> options);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void initialize(Map<?, ?> options);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void load(String stepName, Map<?, ?> options);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void initializeDatas();

} // Loader
