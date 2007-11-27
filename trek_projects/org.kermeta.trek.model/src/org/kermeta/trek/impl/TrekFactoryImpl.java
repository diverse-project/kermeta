/**
 * <copyright>
 * </copyright>
 *
 * $Id: TrekFactoryImpl.java,v 1.4 2007-11-27 16:45:55 cfaucher Exp $
 */
package org.kermeta.trek.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.kermeta.trek.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TrekFactoryImpl extends EFactoryImpl implements TrekFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TrekFactory init() {
		try {
			TrekFactory theTrekFactory = (TrekFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.kermeta.org/trek"); 
			if (theTrekFactory != null) {
				return theTrekFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TrekFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrekFactoryImpl() {
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
			case TrekPackage.USE_KASE_MODEL: return createUseKaseModel();
			case TrekPackage.KUSE_CASE: return createKUseCase();
			case TrekPackage.KTEST_CASE: return createKTestCase();
			case TrekPackage.KUSER_STORY: return createKUserStory();
			case TrekPackage.KTAG_ELEMENT: return createKTagElement();
			case TrekPackage.KSTATUS: return createKStatus();
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
			case TrekPackage.KUSE_LEVEL:
				return createKUseLevelFromString(eDataType, initialValue);
			case TrekPackage.KTEST_CASE_TYPE:
				return createKTestCaseTypeFromString(eDataType, initialValue);
			case TrekPackage.KUSE_CASE_PRIORITY:
				return createKUseCasePriorityFromString(eDataType, initialValue);
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
			case TrekPackage.KUSE_LEVEL:
				return convertKUseLevelToString(eDataType, instanceValue);
			case TrekPackage.KTEST_CASE_TYPE:
				return convertKTestCaseTypeToString(eDataType, instanceValue);
			case TrekPackage.KUSE_CASE_PRIORITY:
				return convertKUseCasePriorityToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UseKaseModel createUseKaseModel() {
		UseKaseModelImpl useKaseModel = new UseKaseModelImpl();
		return useKaseModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KUseCase createKUseCase() {
		KUseCaseImpl kUseCase = new KUseCaseImpl();
		return kUseCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KTestCase createKTestCase() {
		KTestCaseImpl kTestCase = new KTestCaseImpl();
		return kTestCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KUserStory createKUserStory() {
		KUserStoryImpl kUserStory = new KUserStoryImpl();
		return kUserStory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KTagElement createKTagElement() {
		KTagElementImpl kTagElement = new KTagElementImpl();
		return kTagElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KStatus createKStatus() {
		KStatusImpl kStatus = new KStatusImpl();
		return kStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KUseLevel createKUseLevelFromString(EDataType eDataType, String initialValue) {
		KUseLevel result = KUseLevel.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertKUseLevelToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KTestCaseType createKTestCaseTypeFromString(EDataType eDataType, String initialValue) {
		KTestCaseType result = KTestCaseType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertKTestCaseTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KUseCasePriority createKUseCasePriorityFromString(EDataType eDataType, String initialValue) {
		KUseCasePriority result = KUseCasePriority.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertKUseCasePriorityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrekPackage getTrekPackage() {
		return (TrekPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TrekPackage getPackage() {
		return TrekPackage.eINSTANCE;
	}

} //TrekFactoryImpl
