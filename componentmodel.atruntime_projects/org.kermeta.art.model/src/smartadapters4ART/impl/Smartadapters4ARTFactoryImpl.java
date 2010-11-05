/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package smartadapters4ART.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import smartadapters4ART.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Smartadapters4ARTFactoryImpl extends EFactoryImpl implements Smartadapters4ARTFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Smartadapters4ARTFactory init() {
		try {
			Smartadapters4ARTFactory theSmartadapters4ARTFactory = (Smartadapters4ARTFactory)EPackage.Registry.INSTANCE.getEFactory("http://SmartAdapters4ART"); 
			if (theSmartadapters4ARTFactory != null) {
				return theSmartadapters4ARTFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Smartadapters4ARTFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Smartadapters4ARTFactoryImpl() {
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
			case Smartadapters4ARTPackage.ASPECT: return createAspect();
			case Smartadapters4ARTPackage.ADVICE_MODEL: return createAdviceModel();
			case Smartadapters4ARTPackage.POINTCUT_MODEL: return createPointcutModel();
			case Smartadapters4ARTPackage.GLOBAL_INSTANTIATION: return createGlobalInstantiation();
			case Smartadapters4ARTPackage.PER_ROLE_MATCH: return createPerRoleMatch();
			case Smartadapters4ARTPackage.PER_ELEMENT_MATCH: return createPerElementMatch();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case Smartadapters4ARTPackage.STRING:
				return createStringFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case Smartadapters4ARTPackage.STRING:
				return convertStringToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Aspect createAspect() {
		AspectImpl aspect = new AspectImpl();
		return aspect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdviceModel createAdviceModel() {
		AdviceModelImpl adviceModel = new AdviceModelImpl();
		return adviceModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PointcutModel createPointcutModel() {
		PointcutModelImpl pointcutModel = new PointcutModelImpl();
		return pointcutModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalInstantiation createGlobalInstantiation() {
		GlobalInstantiationImpl globalInstantiation = new GlobalInstantiationImpl();
		return globalInstantiation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerRoleMatch createPerRoleMatch() {
		PerRoleMatchImpl perRoleMatch = new PerRoleMatchImpl();
		return perRoleMatch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerElementMatch createPerElementMatch() {
		PerElementMatchImpl perElementMatch = new PerElementMatchImpl();
		return perElementMatch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createStringFromString(EDataType eDataType, String initialValue) {
		return (String)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStringToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Smartadapters4ARTPackage getSmartadapters4ARTPackage() {
		return (Smartadapters4ARTPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Smartadapters4ARTPackage getPackage() {
		return Smartadapters4ARTPackage.eINSTANCE;
	}

} //Smartadapters4ARTFactoryImpl
