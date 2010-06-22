/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Art2Aspect.impl;

import Art2Aspect.*;

import org.eclipse.emf.ecore.EClass;
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
public class Art2AspectFactoryImpl extends EFactoryImpl implements Art2AspectFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Art2AspectFactory init() {
		try {
			Art2AspectFactory theArt2AspectFactory = (Art2AspectFactory)EPackage.Registry.INSTANCE.getEFactory("http://ArtAspect/2.0"); 
			if (theArt2AspectFactory != null) {
				return theArt2AspectFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Art2AspectFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Art2AspectFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case Art2AspectPackage.ASPECT_ROOT: return createAspectRoot();
			case Art2AspectPackage.ASPECT_DEFINITION: return createAspectDefinition();
			case Art2AspectPackage.POINTCUT_DEFINITION: return createPointcutDefinition();
			case Art2AspectPackage.BINDING_PATTERN: return createBindingPattern();
			case Art2AspectPackage.COMPONENT_TYPE_PATTERN: return createComponentTypePattern();
			case Art2AspectPackage.NODE_PATTERN: return createNodePattern();
			case Art2AspectPackage.PORT_PATTERN: return createPortPattern();
			case Art2AspectPackage.COMPONENT_PATTERN: return createComponentPattern();
			case Art2AspectPackage.PORT_TYPE_PATTERN: return createPortTypePattern();
			case Art2AspectPackage.PORT_TYPE_REF_PATTERN: return createPortTypeRefPattern();
			case Art2AspectPackage.PATTERN_NAMED_ELEMENT: return createPatternNamedElement();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AspectRoot createAspectRoot() {
		AspectRootImpl aspectRoot = new AspectRootImpl();
		return aspectRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AspectDefinition createAspectDefinition() {
		AspectDefinitionImpl aspectDefinition = new AspectDefinitionImpl();
		return aspectDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PointcutDefinition createPointcutDefinition() {
		PointcutDefinitionImpl pointcutDefinition = new PointcutDefinitionImpl();
		return pointcutDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BindingPattern createBindingPattern() {
		BindingPatternImpl bindingPattern = new BindingPatternImpl();
		return bindingPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentTypePattern createComponentTypePattern() {
		ComponentTypePatternImpl componentTypePattern = new ComponentTypePatternImpl();
		return componentTypePattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodePattern createNodePattern() {
		NodePatternImpl nodePattern = new NodePatternImpl();
		return nodePattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortPattern createPortPattern() {
		PortPatternImpl portPattern = new PortPatternImpl();
		return portPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentPattern createComponentPattern() {
		ComponentPatternImpl componentPattern = new ComponentPatternImpl();
		return componentPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortTypePattern createPortTypePattern() {
		PortTypePatternImpl portTypePattern = new PortTypePatternImpl();
		return portTypePattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortTypeRefPattern createPortTypeRefPattern() {
		PortTypeRefPatternImpl portTypeRefPattern = new PortTypeRefPatternImpl();
		return portTypeRefPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatternNamedElement createPatternNamedElement() {
		PatternNamedElementImpl patternNamedElement = new PatternNamedElementImpl();
		return patternNamedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Art2AspectPackage getArt2AspectPackage() {
		return (Art2AspectPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	public static Art2AspectPackage getPackage() {
		return Art2AspectPackage.eINSTANCE;
	}

} //Art2AspectFactoryImpl
