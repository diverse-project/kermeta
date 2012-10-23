/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.kp.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.kermeta.kp.ImportBytecodeJar;
import org.kermeta.kp.ImportFile;
import org.kermeta.kp.ImportProjectJar;
import org.kermeta.kp.ImportProjectSources;
import org.kermeta.kp.KermetaProject;
import org.kermeta.kp.KpPackage;
import org.kermeta.kp.ReusableResource;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Kermeta Project</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.kermeta.kp.impl.KermetaProjectImpl#getMetamodelName <em>Metamodel Name</em>}</li>
 *   <li>{@link org.kermeta.kp.impl.KermetaProjectImpl#getDefaultMainClass <em>Default Main Class</em>}</li>
 *   <li>{@link org.kermeta.kp.impl.KermetaProjectImpl#getDefaultMainOperation <em>Default Main Operation</em>}</li>
 *   <li>{@link org.kermeta.kp.impl.KermetaProjectImpl#getJavaBasePackage <em>Java Base Package</em>}</li>
 *   <li>{@link org.kermeta.kp.impl.KermetaProjectImpl#getReusableResources <em>Reusable Resources</em>}</li>
 *   <li>{@link org.kermeta.kp.impl.KermetaProjectImpl#getImportedProjectJars <em>Imported Project Jars</em>}</li>
 *   <li>{@link org.kermeta.kp.impl.KermetaProjectImpl#getImportedBytecodeJars <em>Imported Bytecode Jars</em>}</li>
 *   <li>{@link org.kermeta.kp.impl.KermetaProjectImpl#getImportedProjectSources <em>Imported Project Sources</em>}</li>
 *   <li>{@link org.kermeta.kp.impl.KermetaProjectImpl#getImportedFiles <em>Imported Files</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class KermetaProjectImpl extends EObjectImpl implements KermetaProject {
	/**
   * The default value of the '{@link #getMetamodelName() <em>Metamodel Name</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getMetamodelName()
   * @generated
   * @ordered
   */
	protected static final String METAMODEL_NAME_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getMetamodelName() <em>Metamodel Name</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getMetamodelName()
   * @generated
   * @ordered
   */
	protected String metamodelName = METAMODEL_NAME_EDEFAULT;

	/**
   * The default value of the '{@link #getDefaultMainClass() <em>Default Main Class</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefaultMainClass()
   * @generated
   * @ordered
   */
  protected static final String DEFAULT_MAIN_CLASS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDefaultMainClass() <em>Default Main Class</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefaultMainClass()
   * @generated
   * @ordered
   */
  protected String defaultMainClass = DEFAULT_MAIN_CLASS_EDEFAULT;

  /**
   * The default value of the '{@link #getDefaultMainOperation() <em>Default Main Operation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefaultMainOperation()
   * @generated
   * @ordered
   */
  protected static final String DEFAULT_MAIN_OPERATION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDefaultMainOperation() <em>Default Main Operation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefaultMainOperation()
   * @generated
   * @ordered
   */
  protected String defaultMainOperation = DEFAULT_MAIN_OPERATION_EDEFAULT;

  /**
   * The default value of the '{@link #getJavaBasePackage() <em>Java Base Package</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getJavaBasePackage()
   * @generated
   * @ordered
   */
	protected static final String JAVA_BASE_PACKAGE_EDEFAULT = "default";

		/**
   * The cached value of the '{@link #getJavaBasePackage() <em>Java Base Package</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getJavaBasePackage()
   * @generated
   * @ordered
   */
	protected String javaBasePackage = JAVA_BASE_PACKAGE_EDEFAULT;

		/**
   * The cached value of the '{@link #getReusableResources() <em>Reusable Resources</em>}' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getReusableResources()
   * @generated
   * @ordered
   */
	protected EList<ReusableResource> reusableResources;

				/**
   * The cached value of the '{@link #getImportedProjectJars() <em>Imported Project Jars</em>}' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getImportedProjectJars()
   * @generated
   * @ordered
   */
	protected EList<ImportProjectJar> importedProjectJars;

		/**
   * The cached value of the '{@link #getImportedBytecodeJars() <em>Imported Bytecode Jars</em>}' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getImportedBytecodeJars()
   * @generated
   * @ordered
   */
	protected EList<ImportBytecodeJar> importedBytecodeJars;

		/**
   * The cached value of the '{@link #getImportedProjectSources() <em>Imported Project Sources</em>}' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getImportedProjectSources()
   * @generated
   * @ordered
   */
	protected EList<ImportProjectSources> importedProjectSources;

		/**
   * The cached value of the '{@link #getImportedFiles() <em>Imported Files</em>}' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getImportedFiles()
   * @generated
   * @ordered
   */
	protected EList<ImportFile> importedFiles;

		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected KermetaProjectImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return KpPackage.Literals.KERMETA_PROJECT;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getMetamodelName() {
    return metamodelName;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setMetamodelName(String newMetamodelName) {
    String oldMetamodelName = metamodelName;
    metamodelName = newMetamodelName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KpPackage.KERMETA_PROJECT__METAMODEL_NAME, oldMetamodelName, metamodelName));
  }

	/**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDefaultMainClass()
  {
    return defaultMainClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDefaultMainClass(String newDefaultMainClass)
  {
    String oldDefaultMainClass = defaultMainClass;
    defaultMainClass = newDefaultMainClass;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KpPackage.KERMETA_PROJECT__DEFAULT_MAIN_CLASS, oldDefaultMainClass, defaultMainClass));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDefaultMainOperation()
  {
    return defaultMainOperation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDefaultMainOperation(String newDefaultMainOperation)
  {
    String oldDefaultMainOperation = defaultMainOperation;
    defaultMainOperation = newDefaultMainOperation;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KpPackage.KERMETA_PROJECT__DEFAULT_MAIN_OPERATION, oldDefaultMainOperation, defaultMainOperation));
  }

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getJavaBasePackage() {
    return javaBasePackage;
  }

		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setJavaBasePackage(String newJavaBasePackage) {
    String oldJavaBasePackage = javaBasePackage;
    javaBasePackage = newJavaBasePackage;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KpPackage.KERMETA_PROJECT__JAVA_BASE_PACKAGE, oldJavaBasePackage, javaBasePackage));
  }

		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<ReusableResource> getReusableResources() {
    if (reusableResources == null)
    {
      reusableResources = new EObjectContainmentEList<ReusableResource>(ReusableResource.class, this, KpPackage.KERMETA_PROJECT__REUSABLE_RESOURCES);
    }
    return reusableResources;
  }

				/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<ImportProjectJar> getImportedProjectJars() {
    if (importedProjectJars == null)
    {
      importedProjectJars = new EObjectContainmentEList<ImportProjectJar>(ImportProjectJar.class, this, KpPackage.KERMETA_PROJECT__IMPORTED_PROJECT_JARS);
    }
    return importedProjectJars;
  }

		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<ImportBytecodeJar> getImportedBytecodeJars() {
    if (importedBytecodeJars == null)
    {
      importedBytecodeJars = new EObjectContainmentEList<ImportBytecodeJar>(ImportBytecodeJar.class, this, KpPackage.KERMETA_PROJECT__IMPORTED_BYTECODE_JARS);
    }
    return importedBytecodeJars;
  }

		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<ImportProjectSources> getImportedProjectSources() {
    if (importedProjectSources == null)
    {
      importedProjectSources = new EObjectContainmentEList<ImportProjectSources>(ImportProjectSources.class, this, KpPackage.KERMETA_PROJECT__IMPORTED_PROJECT_SOURCES);
    }
    return importedProjectSources;
  }

		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<ImportFile> getImportedFiles() {
    if (importedFiles == null)
    {
      importedFiles = new EObjectContainmentEList<ImportFile>(ImportFile.class, this, KpPackage.KERMETA_PROJECT__IMPORTED_FILES);
    }
    return importedFiles;
  }

		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID)
    {
      case KpPackage.KERMETA_PROJECT__REUSABLE_RESOURCES:
        return ((InternalEList<?>)getReusableResources()).basicRemove(otherEnd, msgs);
      case KpPackage.KERMETA_PROJECT__IMPORTED_PROJECT_JARS:
        return ((InternalEList<?>)getImportedProjectJars()).basicRemove(otherEnd, msgs);
      case KpPackage.KERMETA_PROJECT__IMPORTED_BYTECODE_JARS:
        return ((InternalEList<?>)getImportedBytecodeJars()).basicRemove(otherEnd, msgs);
      case KpPackage.KERMETA_PROJECT__IMPORTED_PROJECT_SOURCES:
        return ((InternalEList<?>)getImportedProjectSources()).basicRemove(otherEnd, msgs);
      case KpPackage.KERMETA_PROJECT__IMPORTED_FILES:
        return ((InternalEList<?>)getImportedFiles()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID)
    {
      case KpPackage.KERMETA_PROJECT__METAMODEL_NAME:
        return getMetamodelName();
      case KpPackage.KERMETA_PROJECT__DEFAULT_MAIN_CLASS:
        return getDefaultMainClass();
      case KpPackage.KERMETA_PROJECT__DEFAULT_MAIN_OPERATION:
        return getDefaultMainOperation();
      case KpPackage.KERMETA_PROJECT__JAVA_BASE_PACKAGE:
        return getJavaBasePackage();
      case KpPackage.KERMETA_PROJECT__REUSABLE_RESOURCES:
        return getReusableResources();
      case KpPackage.KERMETA_PROJECT__IMPORTED_PROJECT_JARS:
        return getImportedProjectJars();
      case KpPackage.KERMETA_PROJECT__IMPORTED_BYTECODE_JARS:
        return getImportedBytecodeJars();
      case KpPackage.KERMETA_PROJECT__IMPORTED_PROJECT_SOURCES:
        return getImportedProjectSources();
      case KpPackage.KERMETA_PROJECT__IMPORTED_FILES:
        return getImportedFiles();
    }
    return super.eGet(featureID, resolve, coreType);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
    switch (featureID)
    {
      case KpPackage.KERMETA_PROJECT__METAMODEL_NAME:
        setMetamodelName((String)newValue);
        return;
      case KpPackage.KERMETA_PROJECT__DEFAULT_MAIN_CLASS:
        setDefaultMainClass((String)newValue);
        return;
      case KpPackage.KERMETA_PROJECT__DEFAULT_MAIN_OPERATION:
        setDefaultMainOperation((String)newValue);
        return;
      case KpPackage.KERMETA_PROJECT__JAVA_BASE_PACKAGE:
        setJavaBasePackage((String)newValue);
        return;
      case KpPackage.KERMETA_PROJECT__REUSABLE_RESOURCES:
        getReusableResources().clear();
        getReusableResources().addAll((Collection<? extends ReusableResource>)newValue);
        return;
      case KpPackage.KERMETA_PROJECT__IMPORTED_PROJECT_JARS:
        getImportedProjectJars().clear();
        getImportedProjectJars().addAll((Collection<? extends ImportProjectJar>)newValue);
        return;
      case KpPackage.KERMETA_PROJECT__IMPORTED_BYTECODE_JARS:
        getImportedBytecodeJars().clear();
        getImportedBytecodeJars().addAll((Collection<? extends ImportBytecodeJar>)newValue);
        return;
      case KpPackage.KERMETA_PROJECT__IMPORTED_PROJECT_SOURCES:
        getImportedProjectSources().clear();
        getImportedProjectSources().addAll((Collection<? extends ImportProjectSources>)newValue);
        return;
      case KpPackage.KERMETA_PROJECT__IMPORTED_FILES:
        getImportedFiles().clear();
        getImportedFiles().addAll((Collection<? extends ImportFile>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public void eUnset(int featureID) {
    switch (featureID)
    {
      case KpPackage.KERMETA_PROJECT__METAMODEL_NAME:
        setMetamodelName(METAMODEL_NAME_EDEFAULT);
        return;
      case KpPackage.KERMETA_PROJECT__DEFAULT_MAIN_CLASS:
        setDefaultMainClass(DEFAULT_MAIN_CLASS_EDEFAULT);
        return;
      case KpPackage.KERMETA_PROJECT__DEFAULT_MAIN_OPERATION:
        setDefaultMainOperation(DEFAULT_MAIN_OPERATION_EDEFAULT);
        return;
      case KpPackage.KERMETA_PROJECT__JAVA_BASE_PACKAGE:
        setJavaBasePackage(JAVA_BASE_PACKAGE_EDEFAULT);
        return;
      case KpPackage.KERMETA_PROJECT__REUSABLE_RESOURCES:
        getReusableResources().clear();
        return;
      case KpPackage.KERMETA_PROJECT__IMPORTED_PROJECT_JARS:
        getImportedProjectJars().clear();
        return;
      case KpPackage.KERMETA_PROJECT__IMPORTED_BYTECODE_JARS:
        getImportedBytecodeJars().clear();
        return;
      case KpPackage.KERMETA_PROJECT__IMPORTED_PROJECT_SOURCES:
        getImportedProjectSources().clear();
        return;
      case KpPackage.KERMETA_PROJECT__IMPORTED_FILES:
        getImportedFiles().clear();
        return;
    }
    super.eUnset(featureID);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public boolean eIsSet(int featureID) {
    switch (featureID)
    {
      case KpPackage.KERMETA_PROJECT__METAMODEL_NAME:
        return METAMODEL_NAME_EDEFAULT == null ? metamodelName != null : !METAMODEL_NAME_EDEFAULT.equals(metamodelName);
      case KpPackage.KERMETA_PROJECT__DEFAULT_MAIN_CLASS:
        return DEFAULT_MAIN_CLASS_EDEFAULT == null ? defaultMainClass != null : !DEFAULT_MAIN_CLASS_EDEFAULT.equals(defaultMainClass);
      case KpPackage.KERMETA_PROJECT__DEFAULT_MAIN_OPERATION:
        return DEFAULT_MAIN_OPERATION_EDEFAULT == null ? defaultMainOperation != null : !DEFAULT_MAIN_OPERATION_EDEFAULT.equals(defaultMainOperation);
      case KpPackage.KERMETA_PROJECT__JAVA_BASE_PACKAGE:
        return JAVA_BASE_PACKAGE_EDEFAULT == null ? javaBasePackage != null : !JAVA_BASE_PACKAGE_EDEFAULT.equals(javaBasePackage);
      case KpPackage.KERMETA_PROJECT__REUSABLE_RESOURCES:
        return reusableResources != null && !reusableResources.isEmpty();
      case KpPackage.KERMETA_PROJECT__IMPORTED_PROJECT_JARS:
        return importedProjectJars != null && !importedProjectJars.isEmpty();
      case KpPackage.KERMETA_PROJECT__IMPORTED_BYTECODE_JARS:
        return importedBytecodeJars != null && !importedBytecodeJars.isEmpty();
      case KpPackage.KERMETA_PROJECT__IMPORTED_PROJECT_SOURCES:
        return importedProjectSources != null && !importedProjectSources.isEmpty();
      case KpPackage.KERMETA_PROJECT__IMPORTED_FILES:
        return importedFiles != null && !importedFiles.isEmpty();
    }
    return super.eIsSet(featureID);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public String toString() {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (metamodelName: ");
    result.append(metamodelName);
    result.append(", defaultMainClass: ");
    result.append(defaultMainClass);
    result.append(", defaultMainOperation: ");
    result.append(defaultMainOperation);
    result.append(", javaBasePackage: ");
    result.append(javaBasePackage);
    result.append(')');
    return result.toString();
  }

} //KermetaProjectImpl
