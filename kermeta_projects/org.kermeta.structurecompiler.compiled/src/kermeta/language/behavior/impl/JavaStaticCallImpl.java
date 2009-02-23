/**
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * 
 * Generating with Kermeta <http://www.kermeta.org>
 *
 * $Id: JavaStaticCallImpl.java,v 1.12 2009-02-23 15:26:46 cfaucher Exp $
 */
package kermeta.language.behavior.impl;

import java.util.Collection;

import kermeta.language.behavior.BehaviorPackage;
import kermeta.language.behavior.Expression;
import kermeta.language.behavior.JavaStaticCall;

import km2ecore.KM2EcoreContext;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Java Static Call</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link kermeta.language.behavior.impl.JavaStaticCallImpl#getJmethod <em>Jmethod</em>}</li>
 *   <li>{@link kermeta.language.behavior.impl.JavaStaticCallImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link kermeta.language.behavior.impl.JavaStaticCallImpl#getJclass <em>Jclass</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class JavaStaticCallImpl extends ExpressionImpl implements
		JavaStaticCall {
	/**
	 * The default value of the '{@link #getJmethod() <em>Jmethod</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJmethod()
	 * @generated
	 * @ordered
	 */
	protected static final String JMETHOD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJmethod() <em>Jmethod</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJmethod()
	 * @generated
	 * @ordered
	 */
	protected String jmethod = JMETHOD_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<Expression> parameters;

	/**
	 * The default value of the '{@link #getJclass() <em>Jclass</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJclass()
	 * @generated
	 * @ordered
	 */
	protected static final String JCLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJclass() <em>Jclass</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJclass()
	 * @generated
	 * @ordered
	 */
	protected String jclass = JCLASS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JavaStaticCallImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BehaviorPackage.Literals.JAVA_STATIC_CALL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getJmethod() {
		return jmethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJmethod(String newJmethod) {
		String oldJmethod = jmethod;
		jmethod = newJmethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					BehaviorPackage.JAVA_STATIC_CALL__JMETHOD, oldJmethod,
					jmethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Expression> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList.Resolving<Expression>(
					Expression.class, this,
					BehaviorPackage.JAVA_STATIC_CALL__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getJclass() {
		return jclass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJclass(String newJclass) {
		String oldJclass = jclass;
		jclass = newJclass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					BehaviorPackage.JAVA_STATIC_CALL__JCLASS, oldJclass, jclass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createBehaviorJava(KM2EcoreContext context) {

		java.lang.String result = null;

		super.createBehaviorJava(context);

		java.lang.Boolean idIfCond_691 = false;
		idIfCond_691 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isNotEqualSwitcher(context.getCompiledJavaExtern(), "");

		if (idIfCond_691) {

			java.lang.Boolean idIfCond_692 = false;
			idIfCond_692 = kermeta.standard.helper.IntegerWrapper.isLower(
					kermeta.standard.helper.StringWrapper.split(
							kermeta.standard.helper.StringWrapper.replace(
									context.getCompiledJavaExtern(), "(", "%"),
							"%").size(), 2);

			if (idIfCond_692) {

				context
						.setCompiledJavaExtern(kermeta.standard.helper.StringWrapper
								.plus(
										kermeta.standard.helper.StringWrapper
												.plus(
														kermeta.standard.helper.StringWrapper
																.plus(
																		context
																				.getCompiledJavaExtern(),
																		"("),
														((km2ecore.helper.kermeta.CompilerHelperJava) org.kermeta.compil.runtime.helper.language.ClassUtil
																.newObject(km2ecore.helper.kermeta.KermetaPackage.eINSTANCE
																		.getCompilerHelperJava()))
																.ppComaSeparatedNodes(
																		org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
																				.<kermeta.language.behavior.Expression> convertAsOrderedSet(this
																						.getParameters()),
																		context)),
										")"));
			}

		}

		java.lang.Boolean idIfCond_693 = false;
		idIfCond_693 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isNotEqualSwitcher(context.getCompiledJavaExtern(), "");

		if (idIfCond_693) {

			result = context.getCompiledJavaExtern();

			context.setCompiledJavaExtern("");
		} else {

			java.lang.Boolean idIfCond_694 = false;
			idIfCond_694 = ((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil
					.asTypeSwitcher(
							this
									.getContainerAsType(org.kermeta.compil.runtime.ExecutionContext
											.getInstance()
											.getMetaClass(
													"kermeta.language.structure.ClassDefinition")),
							org.kermeta.compil.runtime.ExecutionContext
									.getInstance()
									.getMetaClass(
											"kermeta.language.structure.ClassDefinition")))
					.isValueType();

			if (idIfCond_694) {

				result = kermeta.standard.helper.StringWrapper
						.plus(
								kermeta.standard.helper.StringWrapper
										.plus(
												kermeta.standard.helper.StringWrapper
														.plus(
																"org.kermeta.compil.runtime.helper.basetypes.",
																((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil
																		.asTypeSwitcher(
																				this
																						.getContainerAsType(org.kermeta.compil.runtime.ExecutionContext
																								.getInstance()
																								.getMetaClass(
																										"kermeta.language.structure.ClassDefinition")),
																				org.kermeta.compil.runtime.ExecutionContext
																						.getInstance()
																						.getMetaClass(
																								"kermeta.language.structure.ClassDefinition")))
																		.getName()),
												"Util."), this.getJmethod());
			} else {

				result = kermeta.standard.helper.StringWrapper
						.plus(
								kermeta.standard.helper.StringWrapper.plus(
										kermeta.standard.helper.StringWrapper
												.replace(this.getJclass(),
														"::", "."), "."),
								((km2ecore.helper.java.IdentifierHelper) org.kermeta.compil.runtime.helper.language.ClassUtil
										.newObject(km2ecore.helper.java.JavaPackage.eINSTANCE
												.getIdentifierHelper()))
										.getMangledIdentifier(
												this.getJmethod(), context));
			}

			this.setBeforeLambdaExpressionResult("");

			result = kermeta.standard.helper.StringWrapper
					.plus(
							kermeta.standard.helper.StringWrapper
									.plus(
											kermeta.standard.helper.StringWrapper
													.plus(result, "("),
											((km2ecore.helper.kermeta.CompilerHelperJava) org.kermeta.compil.runtime.helper.language.ClassUtil
													.newObject(km2ecore.helper.kermeta.KermetaPackage.eINSTANCE
															.getCompilerHelperJava()))
													.ppComaSeparatedNodes(
															org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
																	.<kermeta.language.behavior.Expression> convertAsOrderedSet(this
																			.getParameters()),
															context)), ")");

			context.setBeforeLambdaExpressionResult(this
					.getBeforeLambdaExpressionResult());

			this.setBeforeLambdaExpressionResult("");
		}

		result = kermeta.standard.helper.StringWrapper.plus(result, this
				.endOfExpressionFixer());

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case BehaviorPackage.JAVA_STATIC_CALL__PARAMETERS:
			return ((InternalEList<?>) getParameters()).basicRemove(otherEnd,
					msgs);
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
		switch (featureID) {
		case BehaviorPackage.JAVA_STATIC_CALL__JMETHOD:
			return getJmethod();
		case BehaviorPackage.JAVA_STATIC_CALL__PARAMETERS:
			return getParameters();
		case BehaviorPackage.JAVA_STATIC_CALL__JCLASS:
			return getJclass();
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
		switch (featureID) {
		case BehaviorPackage.JAVA_STATIC_CALL__JMETHOD:
			setJmethod((String) newValue);
			return;
		case BehaviorPackage.JAVA_STATIC_CALL__PARAMETERS:
			getParameters().clear();
			getParameters().addAll((Collection<? extends Expression>) newValue);
			return;
		case BehaviorPackage.JAVA_STATIC_CALL__JCLASS:
			setJclass((String) newValue);
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
		switch (featureID) {
		case BehaviorPackage.JAVA_STATIC_CALL__JMETHOD:
			setJmethod(JMETHOD_EDEFAULT);
			return;
		case BehaviorPackage.JAVA_STATIC_CALL__PARAMETERS:
			getParameters().clear();
			return;
		case BehaviorPackage.JAVA_STATIC_CALL__JCLASS:
			setJclass(JCLASS_EDEFAULT);
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
		switch (featureID) {
		case BehaviorPackage.JAVA_STATIC_CALL__JMETHOD:
			return JMETHOD_EDEFAULT == null ? jmethod != null
					: !JMETHOD_EDEFAULT.equals(jmethod);
		case BehaviorPackage.JAVA_STATIC_CALL__PARAMETERS:
			return parameters != null && !parameters.isEmpty();
		case BehaviorPackage.JAVA_STATIC_CALL__JCLASS:
			return JCLASS_EDEFAULT == null ? jclass != null : !JCLASS_EDEFAULT
					.equals(jclass);
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
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (jmethod: ");
		result.append(jmethod);
		result.append(", jclass: ");
		result.append(jclass);
		result.append(')');
		return result.toString();
	}

} //JavaStaticCallImpl
