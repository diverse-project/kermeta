/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.kp.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.kermeta.kp.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.kermeta.kp.KpPackage
 * @generated
 */
public class KpAdapterFactory extends AdapterFactoryImpl {
	/**
   * The cached model package.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected static KpPackage modelPackage;

	/**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public KpAdapterFactory() {
    if (modelPackage == null)
    {
      modelPackage = KpPackage.eINSTANCE;
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
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
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
	protected KpSwitch<Adapter> modelSwitch =
		new KpSwitch<Adapter>()
    {
      @Override
      public Adapter caseKermetaProject(KermetaProject object)
      {
        return createKermetaProjectAdapter();
      }
      @Override
      public Adapter caseImportFile(ImportFile object)
      {
        return createImportFileAdapter();
      }
      @Override
      public Adapter casePackageEquivalence(PackageEquivalence object)
      {
        return createPackageEquivalenceAdapter();
      }
      @Override
      public Adapter caseReusableResource(ReusableResource object)
      {
        return createReusableResourceAdapter();
      }
      @Override
      public Adapter caseImportProjectSources(ImportProjectSources object)
      {
        return createImportProjectSourcesAdapter();
      }
      @Override
      public Adapter caseImportProjectJar(ImportProjectJar object)
      {
        return createImportProjectJarAdapter();
      }
      @Override
      public Adapter caseImportBytecodeJar(ImportBytecodeJar object)
      {
        return createImportBytecodeJarAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
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
   * Creates a new adapter for an object of class '{@link org.kermeta.kp.KermetaProject <em>Kermeta Project</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.kermeta.kp.KermetaProject
   * @generated
   */
	public Adapter createKermetaProjectAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.kermeta.kp.PackageEquivalence <em>Package Equivalence</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.kermeta.kp.PackageEquivalence
   * @generated
   */
	public Adapter createPackageEquivalenceAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.kermeta.kp.ReusableResource <em>Reusable Resource</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.kermeta.kp.ReusableResource
   * @generated
   */
	public Adapter createReusableResourceAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.kermeta.kp.ImportProjectSources <em>Import Project Sources</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.kermeta.kp.ImportProjectSources
   * @generated
   */
	public Adapter createImportProjectSourcesAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.kermeta.kp.ImportProjectJar <em>Import Project Jar</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.kermeta.kp.ImportProjectJar
   * @generated
   */
	public Adapter createImportProjectJarAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.kermeta.kp.ImportBytecodeJar <em>Import Bytecode Jar</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.kermeta.kp.ImportBytecodeJar
   * @generated
   */
	public Adapter createImportBytecodeJarAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.kermeta.kp.ImportFile <em>Import File</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.kermeta.kp.ImportFile
   * @generated
   */
	public Adapter createImportFileAdapter() {
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

} //KpAdapterFactory
