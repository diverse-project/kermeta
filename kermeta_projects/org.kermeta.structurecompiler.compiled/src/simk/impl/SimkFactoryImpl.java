/**
 * <copyright>
 * </copyright>
 *
 * $Id: SimkFactoryImpl.java,v 1.5 2008-10-16 13:17:44 cfaucher Exp $
 */
package simk.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import simk.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SimkFactoryImpl extends EFactoryImpl implements SimkFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SimkFactory init() {
		try {
			SimkFactory theSimkFactory = (SimkFactory) EPackage.Registry.INSTANCE
					.getEFactory("http://www.kermeta.org/simk/kermeta_temp_uri");
			if (theSimkFactory != null) {
				return theSimkFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SimkFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimkFactoryImpl() {
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
		case SimkPackage.SIMK_MODEL:
			return createSIMKModel();
		case SimkPackage.SM_METHOD:
			return createSMMethod();
		case SimkPackage.SM_CONTEXT:
			return createSMContext();
		case SimkPackage.SM_CLASS:
			return createSMClass();
		case SimkPackage.SM_PARAMETER:
			return createSMParameter();
		case SimkPackage.SM_RETURN:
			return createSMReturn();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName()
					+ "' is not a valid classifier");
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
		case SimkPackage.SM_USAGE:
			return createSMUsageFromString(eDataType, initialValue);
		case SimkPackage.SM_ACCESS:
			return createSMAccessFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '"
					+ eDataType.getName() + "' is not a valid classifier");
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
		case SimkPackage.SM_USAGE:
			return convertSMUsageToString(eDataType, instanceValue);
		case SimkPackage.SM_ACCESS:
			return convertSMAccessToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '"
					+ eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SIMKModel createSIMKModel() {
		SIMKModelImpl simkModel = new SIMKModelImpl();
		return simkModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SMMethod createSMMethod() {
		SMMethodImpl smMethod = new SMMethodImpl();
		return smMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SMContext createSMContext() {
		SMContextImpl smContext = new SMContextImpl();
		return smContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SMClass createSMClass() {
		SMClassImpl smClass = new SMClassImpl();
		return smClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SMParameter createSMParameter() {
		SMParameterImpl smParameter = new SMParameterImpl();
		return smParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SMReturn createSMReturn() {
		SMReturnImpl smReturn = new SMReturnImpl();
		return smReturn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SMUsage createSMUsageFromString(EDataType eDataType,
			String initialValue) {
		SMUsage result = SMUsage.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException("The value '" + initialValue
					+ "' is not a valid enumerator of '" + eDataType.getName()
					+ "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSMUsageToString(EDataType eDataType,
			Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SMAccess createSMAccessFromString(EDataType eDataType,
			String initialValue) {
		SMAccess result = SMAccess.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException("The value '" + initialValue
					+ "' is not a valid enumerator of '" + eDataType.getName()
					+ "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSMAccessToString(EDataType eDataType,
			Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimkPackage getSimkPackage() {
		return (SimkPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SimkPackage getPackage() {
		return SimkPackage.eINSTANCE;
	}

} //SimkFactoryImpl
