/**
 * <copyright>
 * </copyright>
 *
 * $Id: EcoreFactoryImpl.java,v 1.9 2008-11-27 15:50:14 cfaucher Exp $
 */
package km2ecore.helper.ecore.impl;

import km2ecore.helper.ecore.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EcoreFactoryImpl extends EFactoryImpl implements EcoreFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EcoreFactory init() {
		try {
			EcoreFactory theEcoreFactory = (EcoreFactory) EPackage.Registry.INSTANCE
					.getEFactory("http://www.kermeta.org/km2ecore/helper/ecore/kermeta_temp_uri");
			if (theEcoreFactory != null) {
				return theEcoreFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EcoreFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EcoreFactoryImpl() {
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
		case EcorePackage.ENAMED_ELEMENT_HELPER:
			return createENamedElementHelper();
		case EcorePackage.MODEL_ANALIZER:
			return createModelAnalizer();
		case EcorePackage.ECORE_MODEL_ELEMENT_HELPER:
			return createEcoreModelElementHelper();
		case EcorePackage.EANNOTATION_HELPER:
			return createEAnnotationHelper();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName()
					+ "' is not a valid classifier");
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
		case EcorePackage.KERMETA_EANNOTATION_SOURCE:
			return createKermetaEAnnotationSourceFromString(eDataType,
					initialValue);
		case EcorePackage.KERMETA_EANNOTATION_KEY:
			return createKermetaEAnnotationKeyFromString(eDataType,
					initialValue);
		default:
			throw new IllegalArgumentException("The datatype '"
					+ eDataType.getName() + "' is not a valid classifier");
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
		case EcorePackage.KERMETA_EANNOTATION_SOURCE:
			return convertKermetaEAnnotationSourceToString(eDataType,
					instanceValue);
		case EcorePackage.KERMETA_EANNOTATION_KEY:
			return convertKermetaEAnnotationKeyToString(eDataType,
					instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '"
					+ eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENamedElementHelper createENamedElementHelper() {
		ENamedElementHelperImpl eNamedElementHelper = new ENamedElementHelperImpl();
		return eNamedElementHelper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelAnalizer createModelAnalizer() {
		ModelAnalizerImpl modelAnalizer = new ModelAnalizerImpl();
		return modelAnalizer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EcoreModelElementHelper createEcoreModelElementHelper() {
		EcoreModelElementHelperImpl ecoreModelElementHelper = new EcoreModelElementHelperImpl();
		return ecoreModelElementHelper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAnnotationHelper createEAnnotationHelper() {
		EAnnotationHelperImpl eAnnotationHelper = new EAnnotationHelperImpl();
		return eAnnotationHelper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KermetaEAnnotationSource createKermetaEAnnotationSourceFromString(
			EDataType eDataType, String initialValue) {
		KermetaEAnnotationSource result = KermetaEAnnotationSource
				.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException("The value '" + initialValue
					+ "' is not a valid enumerator of '" + eDataType.getName()
					+ "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertKermetaEAnnotationSourceToString(EDataType eDataType,
			Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KermetaEAnnotationKey createKermetaEAnnotationKeyFromString(
			EDataType eDataType, String initialValue) {
		KermetaEAnnotationKey result = KermetaEAnnotationKey.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException("The value '" + initialValue
					+ "' is not a valid enumerator of '" + eDataType.getName()
					+ "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertKermetaEAnnotationKeyToString(EDataType eDataType,
			Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EcorePackage getEcorePackage() {
		return (EcorePackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EcorePackage getPackage() {
		return EcorePackage.eINSTANCE;
	}

} //EcoreFactoryImpl
