/**
 * <copyright>
 * </copyright>
 *
 */
package org.kermeta.alf.xtext.alf.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.kermeta.alf.xtext.alf.AlfPackage;
import org.kermeta.alf.xtext.alf.Expression;
import org.kermeta.alf.xtext.alf.LocalNameDeclarationStatement;
import org.kermeta.alf.xtext.alf.QualifiedNameWithBinding;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Local Name Declaration Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.kermeta.alf.xtext.alf.impl.LocalNameDeclarationStatementImpl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link org.kermeta.alf.xtext.alf.impl.LocalNameDeclarationStatementImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.kermeta.alf.xtext.alf.impl.LocalNameDeclarationStatementImpl#isMultiplicityIndicator <em>Multiplicity Indicator</em>}</li>
 *   <li>{@link org.kermeta.alf.xtext.alf.impl.LocalNameDeclarationStatementImpl#getInit <em>Init</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LocalNameDeclarationStatementImpl extends StatementImpl implements LocalNameDeclarationStatement
{
  /**
   * The default value of the '{@link #getVarName() <em>Var Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVarName()
   * @generated
   * @ordered
   */
  protected static final String VAR_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getVarName() <em>Var Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVarName()
   * @generated
   * @ordered
   */
  protected String varName = VAR_NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected QualifiedNameWithBinding type;

  /**
   * The default value of the '{@link #isMultiplicityIndicator() <em>Multiplicity Indicator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isMultiplicityIndicator()
   * @generated
   * @ordered
   */
  protected static final boolean MULTIPLICITY_INDICATOR_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isMultiplicityIndicator() <em>Multiplicity Indicator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isMultiplicityIndicator()
   * @generated
   * @ordered
   */
  protected boolean multiplicityIndicator = MULTIPLICITY_INDICATOR_EDEFAULT;

  /**
   * The cached value of the '{@link #getInit() <em>Init</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInit()
   * @generated
   * @ordered
   */
  protected Expression init;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LocalNameDeclarationStatementImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return AlfPackage.Literals.LOCAL_NAME_DECLARATION_STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getVarName()
  {
    return varName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVarName(String newVarName)
  {
    String oldVarName = varName;
    varName = newVarName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AlfPackage.LOCAL_NAME_DECLARATION_STATEMENT__VAR_NAME, oldVarName, varName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QualifiedNameWithBinding getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetType(QualifiedNameWithBinding newType, NotificationChain msgs)
  {
    QualifiedNameWithBinding oldType = type;
    type = newType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AlfPackage.LOCAL_NAME_DECLARATION_STATEMENT__TYPE, oldType, newType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(QualifiedNameWithBinding newType)
  {
    if (newType != type)
    {
      NotificationChain msgs = null;
      if (type != null)
        msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AlfPackage.LOCAL_NAME_DECLARATION_STATEMENT__TYPE, null, msgs);
      if (newType != null)
        msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AlfPackage.LOCAL_NAME_DECLARATION_STATEMENT__TYPE, null, msgs);
      msgs = basicSetType(newType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AlfPackage.LOCAL_NAME_DECLARATION_STATEMENT__TYPE, newType, newType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isMultiplicityIndicator()
  {
    return multiplicityIndicator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMultiplicityIndicator(boolean newMultiplicityIndicator)
  {
    boolean oldMultiplicityIndicator = multiplicityIndicator;
    multiplicityIndicator = newMultiplicityIndicator;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AlfPackage.LOCAL_NAME_DECLARATION_STATEMENT__MULTIPLICITY_INDICATOR, oldMultiplicityIndicator, multiplicityIndicator));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getInit()
  {
    return init;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInit(Expression newInit, NotificationChain msgs)
  {
    Expression oldInit = init;
    init = newInit;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AlfPackage.LOCAL_NAME_DECLARATION_STATEMENT__INIT, oldInit, newInit);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInit(Expression newInit)
  {
    if (newInit != init)
    {
      NotificationChain msgs = null;
      if (init != null)
        msgs = ((InternalEObject)init).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AlfPackage.LOCAL_NAME_DECLARATION_STATEMENT__INIT, null, msgs);
      if (newInit != null)
        msgs = ((InternalEObject)newInit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AlfPackage.LOCAL_NAME_DECLARATION_STATEMENT__INIT, null, msgs);
      msgs = basicSetInit(newInit, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AlfPackage.LOCAL_NAME_DECLARATION_STATEMENT__INIT, newInit, newInit));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case AlfPackage.LOCAL_NAME_DECLARATION_STATEMENT__TYPE:
        return basicSetType(null, msgs);
      case AlfPackage.LOCAL_NAME_DECLARATION_STATEMENT__INIT:
        return basicSetInit(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case AlfPackage.LOCAL_NAME_DECLARATION_STATEMENT__VAR_NAME:
        return getVarName();
      case AlfPackage.LOCAL_NAME_DECLARATION_STATEMENT__TYPE:
        return getType();
      case AlfPackage.LOCAL_NAME_DECLARATION_STATEMENT__MULTIPLICITY_INDICATOR:
        return isMultiplicityIndicator();
      case AlfPackage.LOCAL_NAME_DECLARATION_STATEMENT__INIT:
        return getInit();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case AlfPackage.LOCAL_NAME_DECLARATION_STATEMENT__VAR_NAME:
        setVarName((String)newValue);
        return;
      case AlfPackage.LOCAL_NAME_DECLARATION_STATEMENT__TYPE:
        setType((QualifiedNameWithBinding)newValue);
        return;
      case AlfPackage.LOCAL_NAME_DECLARATION_STATEMENT__MULTIPLICITY_INDICATOR:
        setMultiplicityIndicator((Boolean)newValue);
        return;
      case AlfPackage.LOCAL_NAME_DECLARATION_STATEMENT__INIT:
        setInit((Expression)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case AlfPackage.LOCAL_NAME_DECLARATION_STATEMENT__VAR_NAME:
        setVarName(VAR_NAME_EDEFAULT);
        return;
      case AlfPackage.LOCAL_NAME_DECLARATION_STATEMENT__TYPE:
        setType((QualifiedNameWithBinding)null);
        return;
      case AlfPackage.LOCAL_NAME_DECLARATION_STATEMENT__MULTIPLICITY_INDICATOR:
        setMultiplicityIndicator(MULTIPLICITY_INDICATOR_EDEFAULT);
        return;
      case AlfPackage.LOCAL_NAME_DECLARATION_STATEMENT__INIT:
        setInit((Expression)null);
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case AlfPackage.LOCAL_NAME_DECLARATION_STATEMENT__VAR_NAME:
        return VAR_NAME_EDEFAULT == null ? varName != null : !VAR_NAME_EDEFAULT.equals(varName);
      case AlfPackage.LOCAL_NAME_DECLARATION_STATEMENT__TYPE:
        return type != null;
      case AlfPackage.LOCAL_NAME_DECLARATION_STATEMENT__MULTIPLICITY_INDICATOR:
        return multiplicityIndicator != MULTIPLICITY_INDICATOR_EDEFAULT;
      case AlfPackage.LOCAL_NAME_DECLARATION_STATEMENT__INIT:
        return init != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (varName: ");
    result.append(varName);
    result.append(", multiplicityIndicator: ");
    result.append(multiplicityIndicator);
    result.append(')');
    return result.toString();
  }

} //LocalNameDeclarationStatementImpl
