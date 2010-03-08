/**
 * <copyright>
 * </copyright>
 *
 * $Id: IoAdapterFactory.java,v 1.10 2008-04-28 11:50:19 ftanguy Exp $
 */
package org.kermeta.io.util;


import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.kermeta.io.*;
import org.kermeta.io.ErrorMessage;
import org.kermeta.io.IBuildingState;
import org.kermeta.io.IoPackage;
import org.kermeta.io.KermetaUnit;
import org.kermeta.io.KermetaUnitLoader;
import org.kermeta.io.KermetaUnitRequire;
import org.kermeta.io.Message;
import org.kermeta.io.PackageEntry;
import org.kermeta.io.ParseErrorMessage;
import org.kermeta.io.ParsingError;
import org.kermeta.io.TypeDefinitionCache;
import org.kermeta.io.TypeDefinitionCacheEntry;
import org.kermeta.io.WarningMessage;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.kermeta.io.IoPackage
 * @generated
 */
public class IoAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static IoPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IoAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = IoPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IoSwitch<Adapter> modelSwitch =
		new IoSwitch<Adapter>() {
			@Override
			public Adapter caseKermetaUnit(KermetaUnit object) {
				return createKermetaUnitAdapter();
			}
			@Override
			public Adapter caseIBuildingState(IBuildingState object) {
				return createIBuildingStateAdapter();
			}
			@Override
			public Adapter casePackageEntry(PackageEntry object) {
				return createPackageEntryAdapter();
			}
			@Override
			public Adapter caseKermetaUnitLoader(KermetaUnitLoader object) {
				return createKermetaUnitLoaderAdapter();
			}
			@Override
			public Adapter caseMessage(Message object) {
				return createMessageAdapter();
			}
			@Override
			public Adapter caseErrorMessage(ErrorMessage object) {
				return createErrorMessageAdapter();
			}
			@Override
			public Adapter caseWarningMessage(WarningMessage object) {
				return createWarningMessageAdapter();
			}
			@Override
			public Adapter caseParseErrorMessage(ParseErrorMessage object) {
				return createParseErrorMessageAdapter();
			}
			@Override
			public Adapter caseParsingError(ParsingError object) {
				return createParsingErrorAdapter();
			}
			@Override
			public Adapter caseTypeDefinitionCache(TypeDefinitionCache object) {
				return createTypeDefinitionCacheAdapter();
			}
			@Override
			public Adapter caseTypeDefinitionCacheEntry(TypeDefinitionCacheEntry object) {
				return createTypeDefinitionCacheEntryAdapter();
			}
			@Override
			public Adapter caseKermetaUnitRequire(KermetaUnitRequire object) {
				return createKermetaUnitRequireAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.kermeta.io.KermetaUnit <em>Kermeta Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.kermeta.io.KermetaUnit
	 * @generated
	 */
	public Adapter createKermetaUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.kermeta.io.PackageEntry <em>Package Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.kermeta.io.PackageEntry
	 * @generated
	 */
	public Adapter createPackageEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.kermeta.io.IBuildingState <em>IBuilding State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.kermeta.io.IBuildingState
	 * @generated
	 */
	public Adapter createIBuildingStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.kermeta.io.KermetaUnitLoader <em>Kermeta Unit Loader</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.kermeta.io.KermetaUnitLoader
	 * @generated
	 */
	public Adapter createKermetaUnitLoaderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.kermeta.io.Message <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.kermeta.io.Message
	 * @generated
	 */
	public Adapter createMessageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.kermeta.io.ErrorMessage <em>Error Message</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.kermeta.io.ErrorMessage
	 * @generated
	 */
	public Adapter createErrorMessageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.kermeta.io.WarningMessage <em>Warning Message</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.kermeta.io.WarningMessage
	 * @generated
	 */
	public Adapter createWarningMessageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.kermeta.io.ParseErrorMessage <em>Parse Error Message</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.kermeta.io.ParseErrorMessage
	 * @generated
	 */
	public Adapter createParseErrorMessageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.kermeta.io.ParsingError <em>Parsing Error</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.kermeta.io.ParsingError
	 * @generated
	 */
	public Adapter createParsingErrorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.kermeta.io.TypeDefinitionCache <em>Type Definition Cache</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.kermeta.io.TypeDefinitionCache
	 * @generated
	 */
	public Adapter createTypeDefinitionCacheAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.kermeta.io.TypeDefinitionCacheEntry <em>Type Definition Cache Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.kermeta.io.TypeDefinitionCacheEntry
	 * @generated
	 */
	public Adapter createTypeDefinitionCacheEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.kermeta.io.KermetaUnitRequire <em>Kermeta Unit Require</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.kermeta.io.KermetaUnitRequire
	 * @generated
	 */
	public Adapter createKermetaUnitRequireAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //IoAdapterFactory
