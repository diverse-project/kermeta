/**
 * <copyright>
 * </copyright>
 *
 * $Id: KtrFactoryImpl.java,v 1.1 2007-06-05 09:55:10 dtouzet Exp $
 */
package fr.irisa.triskell.ktr.impl;

import fr.irisa.triskell.ktr.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class KtrFactoryImpl extends EFactoryImpl implements KtrFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static KtrFactory init() {
		try {
			KtrFactory theKtrFactory = (KtrFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.kermeta.org/Ktr"); 
			if (theKtrFactory != null) {
				return theKtrFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new KtrFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KtrFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case KtrPackage.INTERPRETATION_PATTERN_MODEL: return createInterpretationPatternModel();
			case KtrPackage.INTERPRETATION_RULE: return createInterpretationRule();
			case KtrPackage.RULE_VARIABLE: return createRuleVariable();
			case KtrPackage.RULE_PATTERN: return createRulePattern();
			case KtrPackage.RULE_PRODUCTION: return createRuleProduction();
			case KtrPackage.SINGLETON_RULE_PRODUCTION: return createSingletonRuleProduction();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case KtrPackage.STRING:
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
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case KtrPackage.STRING:
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
	public InterpretationPatternModel createInterpretationPatternModel() {
		InterpretationPatternModelImpl interpretationPatternModel = new InterpretationPatternModelImpl();
		return interpretationPatternModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterpretationRule createInterpretationRule() {
		InterpretationRuleImpl interpretationRule = new InterpretationRuleImpl();
		return interpretationRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuleVariable createRuleVariable() {
		RuleVariableImpl ruleVariable = new RuleVariableImpl();
		return ruleVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RulePattern createRulePattern() {
		RulePatternImpl rulePattern = new RulePatternImpl();
		return rulePattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuleProduction createRuleProduction() {
		RuleProductionImpl ruleProduction = new RuleProductionImpl();
		return ruleProduction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingletonRuleProduction createSingletonRuleProduction() {
		SingletonRuleProductionImpl singletonRuleProduction = new SingletonRuleProductionImpl();
		return singletonRuleProduction;
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
	public KtrPackage getKtrPackage() {
		return (KtrPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	public static KtrPackage getPackage() {
		return KtrPackage.eINSTANCE;
	}

} //KtrFactoryImpl
