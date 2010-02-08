/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package patternframework.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import patternframework.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PatternframeworkFactoryImpl extends EFactoryImpl implements PatternframeworkFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PatternframeworkFactory init() {
		try {
			PatternframeworkFactory thePatternframeworkFactory = (PatternframeworkFactory)EPackage.Registry.INSTANCE.getEFactory("platform:/resource/fr.irisa.triskell.kermeta.patternmatching/src/kermeta/pattern/metamodel/PatternFramework.ecore"); 
			if (thePatternframeworkFactory != null) {
				return thePatternframeworkFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PatternframeworkFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatternframeworkFactoryImpl() {
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
			case PatternframeworkPackage.MODEL_PATTERN: return createModelPattern();
			case PatternframeworkPackage.PMODEL: return createPModel();
			case PatternframeworkPackage.POBJECT: return createPObject();
			case PatternframeworkPackage.PCONSTRAINT: return createPConstraint();
			case PatternframeworkPackage.PROLE: return createPRole();
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
			case PatternframeworkPackage.PCONSTRAINT_LANGUAGE:
				return createPConstraintLanguageFromString(eDataType, initialValue);
			case PatternframeworkPackage.PEXPRESSION:
				return createPExpressionFromString(eDataType, initialValue);
			case PatternframeworkPackage.PLABEL:
				return createPLabelFromString(eDataType, initialValue);
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
			case PatternframeworkPackage.PCONSTRAINT_LANGUAGE:
				return convertPConstraintLanguageToString(eDataType, instanceValue);
			case PatternframeworkPackage.PEXPRESSION:
				return convertPExpressionToString(eDataType, instanceValue);
			case PatternframeworkPackage.PLABEL:
				return convertPLabelToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelPattern createModelPattern() {
		ModelPatternImpl modelPattern = new ModelPatternImpl();
		return modelPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PModel createPModel() {
		PModelImpl pModel = new PModelImpl();
		return pModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PObject createPObject() {
		PObjectImpl pObject = new PObjectImpl();
		return pObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PConstraint createPConstraint() {
		PConstraintImpl pConstraint = new PConstraintImpl();
		return pConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PRole createPRole() {
		PRoleImpl pRole = new PRoleImpl();
		return pRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PConstraintLanguage createPConstraintLanguageFromString(EDataType eDataType, String initialValue) {
		PConstraintLanguage result = PConstraintLanguage.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPConstraintLanguageToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createPExpressionFromString(EDataType eDataType, String initialValue) {
		return (String)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPExpressionToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createPLabelFromString(EDataType eDataType, String initialValue) {
		return (String)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPLabelToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatternframeworkPackage getPatternframeworkPackage() {
		return (PatternframeworkPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PatternframeworkPackage getPackage() {
		return PatternframeworkPackage.eINSTANCE;
	}

} //PatternframeworkFactoryImpl
