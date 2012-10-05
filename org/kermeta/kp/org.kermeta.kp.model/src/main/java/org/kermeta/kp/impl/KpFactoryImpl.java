/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.kp.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.kermeta.kp.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class KpFactoryImpl extends EFactoryImpl implements KpFactory {
	/**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static KpFactory init() {
    try
    {
      KpFactory theKpFactory = (KpFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.kermeta.org/kp/1.0.0"); 
      if (theKpFactory != null)
      {
        return theKpFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new KpFactoryImpl();
  }

	/**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public KpFactoryImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public EObject create(EClass eClass) {
    switch (eClass.getClassifierID())
    {
      case KpPackage.KERMETA_PROJECT: return createKermetaProject();
      case KpPackage.IMPORT_FILE: return createImportFile();
      case KpPackage.PACKAGE_EQUIVALENCE: return createPackageEquivalence();
      case KpPackage.METAMODEL: return createMetamodel();
      case KpPackage.REUSABLE_RESOURCE: return createReusableResource();
      case KpPackage.IMPORT_PROJECT_SOURCES: return createImportProjectSources();
      case KpPackage.IMPORT_PROJECT_JAR: return createImportProjectJar();
      case KpPackage.IMPORT_BYTECODE_JAR: return createImportBytecodeJar();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public KermetaProject createKermetaProject() {
    KermetaProjectImpl kermetaProject = new KermetaProjectImpl();
    return kermetaProject;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public PackageEquivalence createPackageEquivalence() {
    PackageEquivalenceImpl packageEquivalence = new PackageEquivalenceImpl();
    return packageEquivalence;
  }

	/**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Metamodel createMetamodel()
  {
    MetamodelImpl metamodel = new MetamodelImpl();
    return metamodel;
  }

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ReusableResource createReusableResource() {
    ReusableResourceImpl reusableResource = new ReusableResourceImpl();
    return reusableResource;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ImportProjectSources createImportProjectSources() {
    ImportProjectSourcesImpl importProjectSources = new ImportProjectSourcesImpl();
    return importProjectSources;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ImportProjectJar createImportProjectJar() {
    ImportProjectJarImpl importProjectJar = new ImportProjectJarImpl();
    return importProjectJar;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ImportBytecodeJar createImportBytecodeJar() {
    ImportBytecodeJarImpl importBytecodeJar = new ImportBytecodeJarImpl();
    return importBytecodeJar;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ImportFile createImportFile() {
    ImportFileImpl importFile = new ImportFileImpl();
    return importFile;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public KpPackage getKpPackage() {
    return (KpPackage)getEPackage();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
	@Deprecated
	public static KpPackage getPackage() {
    return KpPackage.eINSTANCE;
  }

} //KpFactoryImpl
