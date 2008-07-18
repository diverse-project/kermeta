/**
 * <copyright>
 * </copyright>
 *
 * $Id: EcoreLoaderImpl.java,v 1.5 2008-07-18 07:11:19 dvojtise Exp $
 */
package org.kermeta.io.loader.impl;

import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.kermeta.io.KermetaUnit;
import org.kermeta.io.loader.EcoreLoader;
import org.kermeta.io.loader.LoaderPackage;
import org.kermeta.io.loader.datas.EcoreLoadingDatas;
import org.kermeta.io.loader.plugin.LoaderPlugin;

import fr.irisa.triskell.kermeta.modelhelper.KermetaUnitHelper;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ecore Loader</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class EcoreLoaderImpl extends LoaderImpl implements EcoreLoader {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EcoreLoaderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LoaderPackage.Literals.ECORE_LOADER;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void initialize(Map<?, ?> options) {
		super.initialize(options);
		/*
		 * 
		 * Adding automatically the framework.
		 * 
		 */
		KermetaUnit framework = LoaderPlugin.getDefault().getFramework();
		if ( framework != null ) {
			KermetaUnit unit = getDatas().getKermetaUnit();
			unit.getImportedKermetaUnits().add(framework);
			for ( KermetaUnit unitToImport : KermetaUnitHelper.getAllImportedKermetaUnits(framework) )
				unit.getImportedKermetaUnits().add( unitToImport );
		}
		/*
		 * 
		 * Adding Ecore.ecore
		 * 
		 */
		/*if ( ! datas.getKermetaUnit().getUri().equals(IOPlugin.ECORE_URI) && ! datas.getKermetaUnit().isFramework() ) {
			KermetaUnit ecore = LoaderPlugin.getDefault().getEcore();
			datas.getKermetaUnit().getImportedKermetaUnits().add( ecore );			
			datas.getKermetaUnit().addRequire(IOPlugin.ECORE_URI, ecore);
		}*/
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void initializeDatas() {
		setDatas( new EcoreLoadingDatas() );
	}
	
} //EcoreLoaderImpl
