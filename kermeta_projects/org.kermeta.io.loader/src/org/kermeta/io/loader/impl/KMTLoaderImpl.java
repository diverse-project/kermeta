/**
 * <copyright>
 * </copyright>
 *
 * $Id: KMTLoaderImpl.java,v 1.2 2008-02-14 07:12:47 uid21732 Exp $
 */
package org.kermeta.io.loader.impl;

import org.eclipse.emf.ecore.EClass;
import org.kermeta.io.loader.KMTLoader;
import org.kermeta.io.loader.LoaderPackage;
import org.kermeta.io.loader.datas.KMTLoadingDatas;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>KMT Loader</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class KMTLoaderImpl extends LoaderImpl implements KMTLoader {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KMTLoaderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LoaderPackage.Literals.KMT_LOADER;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void initializeDatas() {
		setDatas( new KMTLoadingDatas() );
	}
	
} //KMTLoaderImpl
