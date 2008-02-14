/**
 * <copyright>
 * </copyright>
 *
 * $Id: LoaderFactoryImpl.java,v 1.2 2008-02-14 07:12:47 uid21732 Exp $
 */
package org.kermeta.io.loader.impl;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.kermeta.io.loader.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LoaderFactoryImpl extends EFactoryImpl implements LoaderFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LoaderFactory init() {
		try {
			LoaderFactory theLoaderFactory = (LoaderFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.kermeta.org/Loader"); 
			if (theLoaderFactory != null) {
				return theLoaderFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new LoaderFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoaderFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case LoaderPackage.LOADING_STEP: return createLoadingStep();
			case LoaderPackage.KMT_LOADER: return createKMTLoader();
			case LoaderPackage.ECORE_LOADER: return createEcoreLoader();
			case LoaderPackage.KM_LOADER: return createKMLoader();
			case LoaderPackage.LOADING_CONTEXT: return createLoadingContext();
			case LoaderPackage.ABSTRACT_STEP: return createAbstractStep();
			case LoaderPackage.ACTION: return createAction();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case LoaderPackage.URI:
				return createURIFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case LoaderPackage.URI:
				return convertURIToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoadingStep createLoadingStep() {
		LoadingStepImpl loadingStep = new LoadingStepImpl();
		return loadingStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KMTLoader createKMTLoader() {
		KMTLoaderImpl kmtLoader = new KMTLoaderImpl();
		return kmtLoader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EcoreLoader createEcoreLoader() {
		EcoreLoaderImpl ecoreLoader = new EcoreLoaderImpl();
		return ecoreLoader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KMLoader createKMLoader() {
		KMLoaderImpl kmLoader = new KMLoaderImpl();
		return kmLoader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoadingContext createLoadingContext() {
		LoadingContextImpl loadingContext = new LoadingContextImpl();
		return loadingContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractStep createAbstractStep() {
		AbstractStepImpl abstractStep = new AbstractStepImpl();
		return abstractStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action createAction() {
		ActionImpl action = new ActionImpl();
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public URI createURIFromString(EDataType eDataType, String initialValue) {
		return (URI)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertURIToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoaderPackage getLoaderPackage() {
		return (LoaderPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static LoaderPackage getPackage() {
		return LoaderPackage.eINSTANCE;
	}

} //LoaderFactoryImpl
