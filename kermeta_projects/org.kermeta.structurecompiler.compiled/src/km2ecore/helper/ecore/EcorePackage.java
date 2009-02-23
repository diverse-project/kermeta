/**
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * 
 * Generating with Kermeta <http://www.kermeta.org>
 *
 * $Id: EcorePackage.java,v 1.12 2009-02-23 15:26:55 cfaucher Exp $
 */
package km2ecore.helper.ecore;

import kermeta.language.structure.StructurePackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see km2ecore.helper.ecore.EcoreFactory
 * @model kind="package"
 *        annotation="kermeta ecoreUri='http://www.kermeta.org/km2ecore/helper/ecore'"
 * @generated
 */
public interface EcorePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ecore";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.kermeta.org/km2ecore/helper/ecore/kermeta_temp_uri";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EcorePackage eINSTANCE = km2ecore.helper.ecore.impl.EcorePackageImpl.init();

	/**
	 * The meta object id for the '{@link km2ecore.helper.ecore.impl.EAnnotationHelperImpl <em>EAnnotation Helper</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see km2ecore.helper.ecore.impl.EAnnotationHelperImpl
	 * @see km2ecore.helper.ecore.impl.EcorePackageImpl#getEAnnotationHelper()
	 * @generated
	 */
	int EANNOTATION_HELPER = 0;

	/**
	 * The feature id for the '<em><b>File</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EANNOTATION_HELPER__FILE = StructurePackage.OBJECT__FILE;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EANNOTATION_HELPER__TAG = StructurePackage.OBJECT__TAG;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EANNOTATION_HELPER__FILE_NAME = StructurePackage.OBJECT__FILE_NAME;

	/**
	 * The feature id for the '<em><b>Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EANNOTATION_HELPER__LINE_NUMBER = StructurePackage.OBJECT__LINE_NUMBER;

	/**
	 * The feature id for the '<em><b>Owned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EANNOTATION_HELPER__OWNED_TAGS = StructurePackage.OBJECT__OWNED_TAGS;

	/**
	 * The feature id for the '<em><b>Oid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EANNOTATION_HELPER__OID = StructurePackage.OBJECT__OID;

	/**
	 * The feature id for the '<em><b>Internal Containing Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EANNOTATION_HELPER__INTERNAL_CONTAINING_RESOURCE = StructurePackage.OBJECT__INTERNAL_CONTAINING_RESOURCE;

	/**
	 * The number of structural features of the '<em>EAnnotation Helper</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EANNOTATION_HELPER_FEATURE_COUNT = StructurePackage.OBJECT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link km2ecore.helper.ecore.impl.ModelAnalizerImpl <em>Model Analizer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see km2ecore.helper.ecore.impl.ModelAnalizerImpl
	 * @see km2ecore.helper.ecore.impl.EcorePackageImpl#getModelAnalizer()
	 * @generated
	 */
	int MODEL_ANALIZER = 1;

	/**
	 * The feature id for the '<em><b>File</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ANALIZER__FILE = StructurePackage.OBJECT__FILE;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ANALIZER__TAG = StructurePackage.OBJECT__TAG;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ANALIZER__FILE_NAME = StructurePackage.OBJECT__FILE_NAME;

	/**
	 * The feature id for the '<em><b>Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ANALIZER__LINE_NUMBER = StructurePackage.OBJECT__LINE_NUMBER;

	/**
	 * The feature id for the '<em><b>Owned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ANALIZER__OWNED_TAGS = StructurePackage.OBJECT__OWNED_TAGS;

	/**
	 * The feature id for the '<em><b>Oid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ANALIZER__OID = StructurePackage.OBJECT__OID;

	/**
	 * The feature id for the '<em><b>Internal Containing Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ANALIZER__INTERNAL_CONTAINING_RESOURCE = StructurePackage.OBJECT__INTERNAL_CONTAINING_RESOURCE;

	/**
	 * The number of structural features of the '<em>Model Analizer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ANALIZER_FEATURE_COUNT = StructurePackage.OBJECT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link km2ecore.helper.ecore.impl.EcoreModelElementHelperImpl <em>Model Element Helper</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see km2ecore.helper.ecore.impl.EcoreModelElementHelperImpl
	 * @see km2ecore.helper.ecore.impl.EcorePackageImpl#getEcoreModelElementHelper()
	 * @generated
	 */
	int ECORE_MODEL_ELEMENT_HELPER = 2;

	/**
	 * The feature id for the '<em><b>File</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECORE_MODEL_ELEMENT_HELPER__FILE = StructurePackage.OBJECT__FILE;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECORE_MODEL_ELEMENT_HELPER__TAG = StructurePackage.OBJECT__TAG;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECORE_MODEL_ELEMENT_HELPER__FILE_NAME = StructurePackage.OBJECT__FILE_NAME;

	/**
	 * The feature id for the '<em><b>Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECORE_MODEL_ELEMENT_HELPER__LINE_NUMBER = StructurePackage.OBJECT__LINE_NUMBER;

	/**
	 * The feature id for the '<em><b>Owned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECORE_MODEL_ELEMENT_HELPER__OWNED_TAGS = StructurePackage.OBJECT__OWNED_TAGS;

	/**
	 * The feature id for the '<em><b>Oid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECORE_MODEL_ELEMENT_HELPER__OID = StructurePackage.OBJECT__OID;

	/**
	 * The feature id for the '<em><b>Internal Containing Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECORE_MODEL_ELEMENT_HELPER__INTERNAL_CONTAINING_RESOURCE = StructurePackage.OBJECT__INTERNAL_CONTAINING_RESOURCE;

	/**
	 * The number of structural features of the '<em>Model Element Helper</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECORE_MODEL_ELEMENT_HELPER_FEATURE_COUNT = StructurePackage.OBJECT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link km2ecore.helper.ecore.KermetaEAnnotationSource <em>Kermeta EAnnotation Source</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see km2ecore.helper.ecore.KermetaEAnnotationSource
	 * @see km2ecore.helper.ecore.impl.EcorePackageImpl#getKermetaEAnnotationSource()
	 * @generated
	 */
	int KERMETA_EANNOTATION_SOURCE = 3;

	/**
	 * The meta object id for the '{@link km2ecore.helper.ecore.KermetaEAnnotationKey <em>Kermeta EAnnotation Key</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see km2ecore.helper.ecore.KermetaEAnnotationKey
	 * @see km2ecore.helper.ecore.impl.EcorePackageImpl#getKermetaEAnnotationKey()
	 * @generated
	 */
	int KERMETA_EANNOTATION_KEY = 4;

	/**
	 * Returns the meta object for class '{@link km2ecore.helper.ecore.EAnnotationHelper <em>EAnnotation Helper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EAnnotation Helper</em>'.
	 * @see km2ecore.helper.ecore.EAnnotationHelper
	 * @generated
	 */
	EClass getEAnnotationHelper();

	/**
	 * Returns the meta object for class '{@link km2ecore.helper.ecore.ModelAnalizer <em>Model Analizer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Analizer</em>'.
	 * @see km2ecore.helper.ecore.ModelAnalizer
	 * @generated
	 */
	EClass getModelAnalizer();

	/**
	 * Returns the meta object for class '{@link km2ecore.helper.ecore.EcoreModelElementHelper <em>Model Element Helper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Element Helper</em>'.
	 * @see km2ecore.helper.ecore.EcoreModelElementHelper
	 * @generated
	 */
	EClass getEcoreModelElementHelper();

	/**
	 * Returns the meta object for enum '{@link km2ecore.helper.ecore.KermetaEAnnotationSource <em>Kermeta EAnnotation Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Kermeta EAnnotation Source</em>'.
	 * @see km2ecore.helper.ecore.KermetaEAnnotationSource
	 * @generated
	 */
	EEnum getKermetaEAnnotationSource();

	/**
	 * Returns the meta object for enum '{@link km2ecore.helper.ecore.KermetaEAnnotationKey <em>Kermeta EAnnotation Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Kermeta EAnnotation Key</em>'.
	 * @see km2ecore.helper.ecore.KermetaEAnnotationKey
	 * @generated
	 */
	EEnum getKermetaEAnnotationKey();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EcoreFactory getEcoreFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link km2ecore.helper.ecore.impl.EAnnotationHelperImpl <em>EAnnotation Helper</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see km2ecore.helper.ecore.impl.EAnnotationHelperImpl
		 * @see km2ecore.helper.ecore.impl.EcorePackageImpl#getEAnnotationHelper()
		 * @generated
		 */
		EClass EANNOTATION_HELPER = eINSTANCE.getEAnnotationHelper();

		/**
		 * The meta object literal for the '{@link km2ecore.helper.ecore.impl.ModelAnalizerImpl <em>Model Analizer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see km2ecore.helper.ecore.impl.ModelAnalizerImpl
		 * @see km2ecore.helper.ecore.impl.EcorePackageImpl#getModelAnalizer()
		 * @generated
		 */
		EClass MODEL_ANALIZER = eINSTANCE.getModelAnalizer();

		/**
		 * The meta object literal for the '{@link km2ecore.helper.ecore.impl.EcoreModelElementHelperImpl <em>Model Element Helper</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see km2ecore.helper.ecore.impl.EcoreModelElementHelperImpl
		 * @see km2ecore.helper.ecore.impl.EcorePackageImpl#getEcoreModelElementHelper()
		 * @generated
		 */
		EClass ECORE_MODEL_ELEMENT_HELPER = eINSTANCE
				.getEcoreModelElementHelper();

		/**
		 * The meta object literal for the '{@link km2ecore.helper.ecore.KermetaEAnnotationSource <em>Kermeta EAnnotation Source</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see km2ecore.helper.ecore.KermetaEAnnotationSource
		 * @see km2ecore.helper.ecore.impl.EcorePackageImpl#getKermetaEAnnotationSource()
		 * @generated
		 */
		EEnum KERMETA_EANNOTATION_SOURCE = eINSTANCE
				.getKermetaEAnnotationSource();

		/**
		 * The meta object literal for the '{@link km2ecore.helper.ecore.KermetaEAnnotationKey <em>Kermeta EAnnotation Key</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see km2ecore.helper.ecore.KermetaEAnnotationKey
		 * @see km2ecore.helper.ecore.impl.EcorePackageImpl#getKermetaEAnnotationKey()
		 * @generated
		 */
		EEnum KERMETA_EANNOTATION_KEY = eINSTANCE.getKermetaEAnnotationKey();

	}

} //EcorePackage
