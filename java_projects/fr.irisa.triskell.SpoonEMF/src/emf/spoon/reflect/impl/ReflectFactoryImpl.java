/**
 * <copyright>
 * </copyright>
 *
 * $Id: ReflectFactoryImpl.java,v 1.1 2007/02/14 20:38:05 barais Exp $
 */
package emf.spoon.reflect.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import emf.spoon.reflect.Dummy;
import emf.spoon.reflect.ReflectFactory;
import emf.spoon.reflect.ReflectPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ReflectFactoryImpl extends EFactoryImpl implements ReflectFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ReflectFactory init() {
		try {
			ReflectFactory theReflectFactory = (ReflectFactory)EPackage.Registry.INSTANCE.getEFactory("http://spoon#reflect"); 
			if (theReflectFactory != null) {
				return theReflectFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ReflectFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReflectFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ReflectPackage.DUMMY: return createDummy();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dummy createDummy() {
		DummyImpl dummy = new DummyImpl();
		return dummy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReflectPackage getReflectPackage() {
		return (ReflectPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	public static ReflectPackage getPackage() {
		return ReflectPackage.eINSTANCE;
	}

} //ReflectFactoryImpl
