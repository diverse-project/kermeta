/**
 * <copyright>
 * </copyright>
 *
 * $Id: StsFactoryImpl.java,v 1.2 2006-11-23 16:06:15 dtouzet Exp $
 */
package sts.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import sts.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StsFactoryImpl extends EFactoryImpl implements StsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StsFactory init() {
		try {
			StsFactory theStsFactory = (StsFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.kermeta.org/sintaks"); 
			if (theStsFactory != null) {
				return theStsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new StsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case StsPackage.ITERATION: return createIteration();
			case StsPackage.ALTERNATIVE: return createAlternative();
			case StsPackage.SEQUENCE: return createSequence();
			case StsPackage.TERMINAL: return createTerminal();
			case StsPackage.PRIMITIVE_VALUE: return createPrimitiveValue();
			case StsPackage.OBJECT_REFERENCE: return createObjectReference();
			case StsPackage.TEMPLATE: return createTemplate();
			case StsPackage.POLYMORPHIC_COND: return createPolymorphicCond();
			case StsPackage.CUSTOM_COND: return createCustomCond();
			case StsPackage.ROOT: return createRoot();
			case StsPackage.RULE_REF: return createRuleRef();
			case StsPackage.ADORNMENT: return createAdornment();
			case StsPackage.CONSTANT: return createConstant();
			case StsPackage.URI_VALUE: return createURIValue();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Iteration createIteration() {
		IterationImpl iteration = new IterationImpl();
		return iteration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Alternative createAlternative() {
		AlternativeImpl alternative = new AlternativeImpl();
		return alternative;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sequence createSequence() {
		SequenceImpl sequence = new SequenceImpl();
		return sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Terminal createTerminal() {
		TerminalImpl terminal = new TerminalImpl();
		return terminal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveValue createPrimitiveValue() {
		PrimitiveValueImpl primitiveValue = new PrimitiveValueImpl();
		return primitiveValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectReference createObjectReference() {
		ObjectReferenceImpl objectReference = new ObjectReferenceImpl();
		return objectReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Template createTemplate() {
		TemplateImpl template = new TemplateImpl();
		return template;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolymorphicCond createPolymorphicCond() {
		PolymorphicCondImpl polymorphicCond = new PolymorphicCondImpl();
		return polymorphicCond;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomCond createCustomCond() {
		CustomCondImpl customCond = new CustomCondImpl();
		return customCond;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Root createRoot() {
		RootImpl root = new RootImpl();
		return root;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuleRef createRuleRef() {
		RuleRefImpl ruleRef = new RuleRefImpl();
		return ruleRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adornment createAdornment() {
		AdornmentImpl adornment = new AdornmentImpl();
		return adornment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constant createConstant() {
		ConstantImpl constant = new ConstantImpl();
		return constant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public URIValue createURIValue() {
		URIValueImpl uriValue = new URIValueImpl();
		return uriValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StsPackage getStsPackage() {
		return (StsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	public static StsPackage getPackage() {
		return StsPackage.eINSTANCE;
	}

} //StsFactoryImpl
