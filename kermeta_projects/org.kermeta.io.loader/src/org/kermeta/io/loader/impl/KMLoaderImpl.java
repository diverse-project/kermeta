/**
 * <copyright>
 * </copyright>
 *
 * $Id: KMLoaderImpl.java,v 1.2 2008-02-14 07:12:47 uid21732 Exp $
 */
package org.kermeta.io.loader.impl;

import org.eclipse.emf.ecore.EClass;
import org.kermeta.io.loader.KMLoader;
import org.kermeta.io.loader.LoaderPackage;
import org.kermeta.io.loader.datas.KMLoadingDatas;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>KM Loader</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class KMLoaderImpl extends LoaderImpl implements KMLoader {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KMLoaderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LoaderPackage.Literals.KM_LOADER;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void initializeDatas() {
		setDatas( new KMLoadingDatas() );
	}
	
} //KMLoaderImpl
