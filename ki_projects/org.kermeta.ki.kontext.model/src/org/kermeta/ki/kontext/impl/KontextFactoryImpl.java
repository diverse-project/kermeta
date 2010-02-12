/**
 * INRIA - Triskell Team
 *
 * $Id$
 */
package org.kermeta.ki.kontext.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.kermeta.ki.kontext.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class KontextFactoryImpl extends EFactoryImpl implements KontextFactory {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "INRIA - Triskell Team";

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static KontextFactory init() {
		try {
			KontextFactory theKontextFactory = (KontextFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.kermeta.org/ki/kontext"); 
			if (theKontextFactory != null) {
				return theKontextFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new KontextFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KontextFactoryImpl() {
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
			case KontextPackage.CONTEXT_TO_TASK: return createContextToTask();
			case KontextPackage.CONTEXT_TO_TASK_CONSTRAINT: return createContextToTaskConstraint();
			case KontextPackage.EXPRESSION: return createExpression();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContextToTask createContextToTask() {
		ContextToTaskImpl contextToTask = new ContextToTaskImpl();
		return contextToTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContextToTaskConstraint createContextToTaskConstraint() {
		ContextToTaskConstraintImpl contextToTaskConstraint = new ContextToTaskConstraintImpl();
		return contextToTaskConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression createExpression() {
		ExpressionImpl expression = new ExpressionImpl();
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KontextPackage getKontextPackage() {
		return (KontextPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static KontextPackage getPackage() {
		return KontextPackage.eINSTANCE;
	}

} //KontextFactoryImpl
