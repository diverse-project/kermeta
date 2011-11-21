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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.kermeta.kp.Dependency;
import org.kermeta.kp.KermetaProject;
import org.kermeta.kp.KpPackage;
import org.kermeta.kp.Option;
import org.kermeta.kp.Source;
import org.kermeta.kp.WeaveDirective;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Kermeta Project</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.kermeta.kp.impl.KermetaProjectImpl#getDependencies <em>Dependencies</em>}</li>
 *   <li>{@link org.kermeta.kp.impl.KermetaProjectImpl#getSources <em>Sources</em>}</li>
 *   <li>{@link org.kermeta.kp.impl.KermetaProjectImpl#getWeaveDirectives <em>Weave Directives</em>}</li>
 *   <li>{@link org.kermeta.kp.impl.KermetaProjectImpl#getOptions <em>Options</em>}</li>
 *   <li>{@link org.kermeta.kp.impl.KermetaProjectImpl#getDefaultMainClass <em>Default Main Class</em>}</li>
 *   <li>{@link org.kermeta.kp.impl.KermetaProjectImpl#getDefaultMainOperation <em>Default Main Operation</em>}</li>
 *   <li>{@link org.kermeta.kp.impl.KermetaProjectImpl#getGroup <em>Group</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class KermetaProjectImpl extends NamedElementImpl implements KermetaProject {
	/**
   * The cached value of the '{@link #getDependencies() <em>Dependencies</em>}' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getDependencies()
   * @generated
   * @ordered
   */
	protected EList<Dependency> dependencies;

	/**
   * The cached value of the '{@link #getSources() <em>Sources</em>}' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getSources()
   * @generated
   * @ordered
   */
	protected EList<Source> sources;

	/**
   * The cached value of the '{@link #getWeaveDirectives() <em>Weave Directives</em>}' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getWeaveDirectives()
   * @generated
   * @ordered
   */
	protected EList<WeaveDirective> weaveDirectives;

	/**
   * The cached value of the '{@link #getOptions() <em>Options</em>}' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getOptions()
   * @generated
   * @ordered
   */
	protected EList<Option> options;

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
   * The default value of the '{@link #getGroup() <em>Group</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getGroup()
   * @generated
   * @ordered
   */
	protected static final String GROUP_EDEFAULT = "default";

		/**
   * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getGroup()
   * @generated
   * @ordered
   */
	protected String group = GROUP_EDEFAULT;

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
	public EList<Dependency> getDependencies() {
    if (dependencies == null)
    {
      dependencies = new EObjectContainmentEList<Dependency>(Dependency.class, this, KpPackage.KERMETA_PROJECT__DEPENDENCIES);
    }
    return dependencies;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<Source> getSources() {
    if (sources == null)
    {
      sources = new EObjectContainmentEList<Source>(Source.class, this, KpPackage.KERMETA_PROJECT__SOURCES);
    }
    return sources;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<WeaveDirective> getWeaveDirectives() {
    if (weaveDirectives == null)
    {
      weaveDirectives = new EObjectContainmentEList<WeaveDirective>(WeaveDirective.class, this, KpPackage.KERMETA_PROJECT__WEAVE_DIRECTIVES);
    }
    return weaveDirectives;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<Option> getOptions() {
    if (options == null)
    {
      options = new EObjectContainmentEList<Option>(Option.class, this, KpPackage.KERMETA_PROJECT__OPTIONS);
    }
    return options;
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
	public String getGroup() {
    return group;
  }

		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setGroup(String newGroup) {
    String oldGroup = group;
    group = newGroup;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KpPackage.KERMETA_PROJECT__GROUP, oldGroup, group));
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
      case KpPackage.KERMETA_PROJECT__DEPENDENCIES:
        return ((InternalEList<?>)getDependencies()).basicRemove(otherEnd, msgs);
      case KpPackage.KERMETA_PROJECT__SOURCES:
        return ((InternalEList<?>)getSources()).basicRemove(otherEnd, msgs);
      case KpPackage.KERMETA_PROJECT__WEAVE_DIRECTIVES:
        return ((InternalEList<?>)getWeaveDirectives()).basicRemove(otherEnd, msgs);
      case KpPackage.KERMETA_PROJECT__OPTIONS:
        return ((InternalEList<?>)getOptions()).basicRemove(otherEnd, msgs);
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
      case KpPackage.KERMETA_PROJECT__DEPENDENCIES:
        return getDependencies();
      case KpPackage.KERMETA_PROJECT__SOURCES:
        return getSources();
      case KpPackage.KERMETA_PROJECT__WEAVE_DIRECTIVES:
        return getWeaveDirectives();
      case KpPackage.KERMETA_PROJECT__OPTIONS:
        return getOptions();
      case KpPackage.KERMETA_PROJECT__DEFAULT_MAIN_CLASS:
        return getDefaultMainClass();
      case KpPackage.KERMETA_PROJECT__DEFAULT_MAIN_OPERATION:
        return getDefaultMainOperation();
      case KpPackage.KERMETA_PROJECT__GROUP:
        return getGroup();
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
      case KpPackage.KERMETA_PROJECT__DEPENDENCIES:
        getDependencies().clear();
        getDependencies().addAll((Collection<? extends Dependency>)newValue);
        return;
      case KpPackage.KERMETA_PROJECT__SOURCES:
        getSources().clear();
        getSources().addAll((Collection<? extends Source>)newValue);
        return;
      case KpPackage.KERMETA_PROJECT__WEAVE_DIRECTIVES:
        getWeaveDirectives().clear();
        getWeaveDirectives().addAll((Collection<? extends WeaveDirective>)newValue);
        return;
      case KpPackage.KERMETA_PROJECT__OPTIONS:
        getOptions().clear();
        getOptions().addAll((Collection<? extends Option>)newValue);
        return;
      case KpPackage.KERMETA_PROJECT__DEFAULT_MAIN_CLASS:
        setDefaultMainClass((String)newValue);
        return;
      case KpPackage.KERMETA_PROJECT__DEFAULT_MAIN_OPERATION:
        setDefaultMainOperation((String)newValue);
        return;
      case KpPackage.KERMETA_PROJECT__GROUP:
        setGroup((String)newValue);
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
      case KpPackage.KERMETA_PROJECT__DEPENDENCIES:
        getDependencies().clear();
        return;
      case KpPackage.KERMETA_PROJECT__SOURCES:
        getSources().clear();
        return;
      case KpPackage.KERMETA_PROJECT__WEAVE_DIRECTIVES:
        getWeaveDirectives().clear();
        return;
      case KpPackage.KERMETA_PROJECT__OPTIONS:
        getOptions().clear();
        return;
      case KpPackage.KERMETA_PROJECT__DEFAULT_MAIN_CLASS:
        setDefaultMainClass(DEFAULT_MAIN_CLASS_EDEFAULT);
        return;
      case KpPackage.KERMETA_PROJECT__DEFAULT_MAIN_OPERATION:
        setDefaultMainOperation(DEFAULT_MAIN_OPERATION_EDEFAULT);
        return;
      case KpPackage.KERMETA_PROJECT__GROUP:
        setGroup(GROUP_EDEFAULT);
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
      case KpPackage.KERMETA_PROJECT__DEPENDENCIES:
        return dependencies != null && !dependencies.isEmpty();
      case KpPackage.KERMETA_PROJECT__SOURCES:
        return sources != null && !sources.isEmpty();
      case KpPackage.KERMETA_PROJECT__WEAVE_DIRECTIVES:
        return weaveDirectives != null && !weaveDirectives.isEmpty();
      case KpPackage.KERMETA_PROJECT__OPTIONS:
        return options != null && !options.isEmpty();
      case KpPackage.KERMETA_PROJECT__DEFAULT_MAIN_CLASS:
        return DEFAULT_MAIN_CLASS_EDEFAULT == null ? defaultMainClass != null : !DEFAULT_MAIN_CLASS_EDEFAULT.equals(defaultMainClass);
      case KpPackage.KERMETA_PROJECT__DEFAULT_MAIN_OPERATION:
        return DEFAULT_MAIN_OPERATION_EDEFAULT == null ? defaultMainOperation != null : !DEFAULT_MAIN_OPERATION_EDEFAULT.equals(defaultMainOperation);
      case KpPackage.KERMETA_PROJECT__GROUP:
        return GROUP_EDEFAULT == null ? group != null : !GROUP_EDEFAULT.equals(group);
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
    result.append(" (defaultMainClass: ");
    result.append(defaultMainClass);
    result.append(", defaultMainOperation: ");
    result.append(defaultMainOperation);
    result.append(", group: ");
    result.append(group);
    result.append(')');
    return result.toString();
  }

} //KermetaProjectImpl
