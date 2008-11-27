/**
 * <copyright>
 * </copyright>
 *
 * $Id: IoPackage.java,v 1.9 2008-11-27 15:50:17 cfaucher Exp $
 */
package kermeta.io;

import kermeta.language.structure.StructurePackage;

import org.eclipse.emf.ecore.EClass;
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
 * @see kermeta.io.IoFactory
 * @model kind="package"
 *        annotation="kermeta ecoreUri='http://www.kermeta.org/kermeta/1_2_0//kermeta/io'"
 *        annotation="kermeta documentation='/**\n * Contains standard input/output related classes. \n \052/'"
 *        annotation="kermeta documentation='/**\n * Contains file input/output related classes. \n * <img src=\"platform:/plugin/fr.irisa.triskell.kermeta.documentation/src/figures/io_package.png\"/>\n \052/'"
 * @generated
 */
public interface IoPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "io";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.kermeta.org/kermeta/1_2_0//kermeta/io/kermeta_temp_uri";

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
	IoPackage eINSTANCE = kermeta.io.impl.IoPackageImpl.init();

	/**
	 * The meta object id for the '{@link kermeta.io.impl.StdIOImpl <em>Std IO</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kermeta.io.impl.StdIOImpl
	 * @see kermeta.io.impl.IoPackageImpl#getStdIO()
	 * @generated
	 */
	int STD_IO = 0;

	/**
	 * The feature id for the '<em><b>File</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STD_IO__FILE = StructurePackage.OBJECT__FILE;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STD_IO__TAG = StructurePackage.OBJECT__TAG;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STD_IO__FILE_NAME = StructurePackage.OBJECT__FILE_NAME;

	/**
	 * The feature id for the '<em><b>Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STD_IO__LINE_NUMBER = StructurePackage.OBJECT__LINE_NUMBER;

	/**
	 * The feature id for the '<em><b>Owned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STD_IO__OWNED_TAGS = StructurePackage.OBJECT__OWNED_TAGS;

	/**
	 * The feature id for the '<em><b>Oid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STD_IO__OID = StructurePackage.OBJECT__OID;

	/**
	 * The feature id for the '<em><b>Internal Containing Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STD_IO__INTERNAL_CONTAINING_RESOURCE = StructurePackage.OBJECT__INTERNAL_CONTAINING_RESOURCE;

	/**
	 * The number of structural features of the '<em>Std IO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STD_IO_FEATURE_COUNT = StructurePackage.OBJECT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link kermeta.io.impl.FileIOImpl <em>File IO</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kermeta.io.impl.FileIOImpl
	 * @see kermeta.io.impl.IoPackageImpl#getFileIO()
	 * @generated
	 */
	int FILE_IO = 1;

	/**
	 * The feature id for the '<em><b>File</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_IO__FILE = StructurePackage.OBJECT__FILE;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_IO__TAG = StructurePackage.OBJECT__TAG;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_IO__FILE_NAME = StructurePackage.OBJECT__FILE_NAME;

	/**
	 * The feature id for the '<em><b>Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_IO__LINE_NUMBER = StructurePackage.OBJECT__LINE_NUMBER;

	/**
	 * The feature id for the '<em><b>Owned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_IO__OWNED_TAGS = StructurePackage.OBJECT__OWNED_TAGS;

	/**
	 * The feature id for the '<em><b>Oid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_IO__OID = StructurePackage.OBJECT__OID;

	/**
	 * The feature id for the '<em><b>Internal Containing Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_IO__INTERNAL_CONTAINING_RESOURCE = StructurePackage.OBJECT__INTERNAL_CONTAINING_RESOURCE;

	/**
	 * The number of structural features of the '<em>File IO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_IO_FEATURE_COUNT = StructurePackage.OBJECT_FEATURE_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link kermeta.io.StdIO <em>Std IO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Std IO</em>'.
	 * @see kermeta.io.StdIO
	 * @generated
	 */
	EClass getStdIO();

	/**
	 * Returns the meta object for class '{@link kermeta.io.FileIO <em>File IO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File IO</em>'.
	 * @see kermeta.io.FileIO
	 * @generated
	 */
	EClass getFileIO();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	IoFactory getIoFactory();

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
		 * The meta object literal for the '{@link kermeta.io.impl.StdIOImpl <em>Std IO</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kermeta.io.impl.StdIOImpl
		 * @see kermeta.io.impl.IoPackageImpl#getStdIO()
		 * @generated
		 */
		EClass STD_IO = eINSTANCE.getStdIO();

		/**
		 * The meta object literal for the '{@link kermeta.io.impl.FileIOImpl <em>File IO</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kermeta.io.impl.FileIOImpl
		 * @see kermeta.io.impl.IoPackageImpl#getFileIO()
		 * @generated
		 */
		EClass FILE_IO = eINSTANCE.getFileIO();

	}

} //IoPackage
