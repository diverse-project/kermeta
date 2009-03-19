/**
 * <copyright>
 * </copyright>
 *
 * $Id: DeclarationFactoryImpl.java,v 1.1 2007/02/14 20:38:03 barais Exp $
 */
package emf.spoon.reflect.declaration.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import spoon.processing.Environment;
import spoon.processing.FactoryAccessor;
import spoon.reflect.Factory;
import spoon.support.StandardEnvironment;
import emf.spoon.factory.EMFFactory;
import emf.spoon.reflect.declaration.CtAnnotation;
import emf.spoon.reflect.declaration.CtAnnotationElementValue;
import emf.spoon.reflect.declaration.CtAnnotationType;
import emf.spoon.reflect.declaration.CtAnonymousExecutable;
import emf.spoon.reflect.declaration.CtClass;
import emf.spoon.reflect.declaration.CtConstructor;
import emf.spoon.reflect.declaration.CtElement;
import emf.spoon.reflect.declaration.CtEnum;
import emf.spoon.reflect.declaration.CtExecutable;
import emf.spoon.reflect.declaration.CtField;
import emf.spoon.reflect.declaration.CtGenericElement;
import emf.spoon.reflect.declaration.CtInterface;
import emf.spoon.reflect.declaration.CtMethod;
import emf.spoon.reflect.declaration.CtModifiable;
import emf.spoon.reflect.declaration.CtNamedElement;
import emf.spoon.reflect.declaration.CtPackage;
import emf.spoon.reflect.declaration.CtParameter;
import emf.spoon.reflect.declaration.CtSimpleType;
import emf.spoon.reflect.declaration.CtType;
import emf.spoon.reflect.declaration.CtTypeParameter;
import emf.spoon.reflect.declaration.CtTypedElement;
import emf.spoon.reflect.declaration.CtVariable;
import emf.spoon.reflect.declaration.DeclarationFactory;
import emf.spoon.reflect.declaration.DeclarationPackage;
import emf.spoon.reflect.declaration.SourcePosition;
import emf.spoon.reflect.declaration.impl.ext.EmfAnnotationImpl;
import emf.spoon.reflect.declaration.impl.ext.EmfAnnotationTypeImpl;
import emf.spoon.reflect.declaration.impl.ext.EmfAnonymousExecutableImpl;
import emf.spoon.reflect.declaration.impl.ext.EmfClassImpl;
import emf.spoon.reflect.declaration.impl.ext.EmfConstructorImpl;
import emf.spoon.reflect.declaration.impl.ext.EmfEnumImpl;
import emf.spoon.reflect.declaration.impl.ext.EmfFieldImpl;
import emf.spoon.reflect.declaration.impl.ext.EmfInterfaceImpl;
import emf.spoon.reflect.declaration.impl.ext.EmfMethodImpl;
import emf.spoon.reflect.declaration.impl.ext.EmfPackageImpl;
import emf.spoon.reflect.declaration.impl.ext.EmfParameterImpl;
import emf.spoon.reflect.declaration.impl.ext.EmfTypeParameterImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DeclarationFactoryImpl extends EFactoryImpl implements DeclarationFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static Factory SpoonFactory = initSpoon("");

	

	private static Factory initSpoon(String outputSpoonFolder) { 
		Environment env = new StandardEnvironment();
		env.setVerbose(true);
		//Resource r = DeclarationFactoryImpl.eINSTANCE.eResource();
		//if (r==null)
		//	System.err.println("Resource is null");
		return new Factory(new EMFFactory(null ), env);
		
	}
	
	public static void setSpoonFactory(Object o){ 
		if (o instanceof FactoryAccessor) {
			((FactoryAccessor) o).setFactory(SpoonFactory);
		}
	}
	
	public static DeclarationFactory init() {
		try {
			DeclarationFactory theDeclarationFactory = (DeclarationFactory)EPackage.Registry.INSTANCE.getEFactory("emf.spoon.reflect.declaration"); 
			
			if (theDeclarationFactory != null) {
				return theDeclarationFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DeclarationFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeclarationFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case DeclarationPackage.CT_ANNOTATION: return createCtAnnotation();
			case DeclarationPackage.CT_ANNOTATION_TYPE: return createCtAnnotationType();
			case DeclarationPackage.CT_ANONYMOUS_EXECUTABLE: return createCtAnonymousExecutable();
			case DeclarationPackage.CT_CLASS: return createCtClass();
			case DeclarationPackage.CT_CONSTRUCTOR: return createCtConstructor();
			case DeclarationPackage.CT_ELEMENT: return createCtElement();
			case DeclarationPackage.CT_ENUM: return createCtEnum();
			case DeclarationPackage.CT_EXECUTABLE: return createCtExecutable();
			case DeclarationPackage.CT_FIELD: return createCtField();
			case DeclarationPackage.CT_GENERIC_ELEMENT: return createCtGenericElement();
			case DeclarationPackage.CT_INTERFACE: return createCtInterface();
			case DeclarationPackage.CT_METHOD: return createCtMethod();
			case DeclarationPackage.CT_MODIFIABLE: return createCtModifiable();
			case DeclarationPackage.CT_NAMED_ELEMENT: return createCtNamedElement();
			case DeclarationPackage.CT_PACKAGE: return createCtPackage();
			case DeclarationPackage.CT_PARAMETER: return createCtParameter();
			case DeclarationPackage.CT_SIMPLE_TYPE: return createCtSimpleType();
			case DeclarationPackage.CT_TYPE: return createCtType();
			case DeclarationPackage.CT_TYPE_PARAMETER: return createCtTypeParameter();
			case DeclarationPackage.CT_TYPED_ELEMENT: return createCtTypedElement();
			case DeclarationPackage.CT_VARIABLE: return createCtVariable();
			case DeclarationPackage.SOURCE_POSITION: return createSourcePosition();
			case DeclarationPackage.CT_ANNOTATION_ELEMENT_VALUE: return createCtAnnotationElementValue();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtAnnotation createCtAnnotation() {
		CtAnnotationImpl ctAnnotation = new EmfAnnotationImpl();
		setSpoonFactory(ctAnnotation);
		return ctAnnotation;
	}
	


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtAnnotationType createCtAnnotationType() {
		CtAnnotationTypeImpl ctAnnotationType = new EmfAnnotationTypeImpl();
		setSpoonFactory(ctAnnotationType);
		return ctAnnotationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtAnonymousExecutable createCtAnonymousExecutable() {
		CtAnonymousExecutableImpl ctAnonymousExecutable = new EmfAnonymousExecutableImpl();
		setSpoonFactory(ctAnonymousExecutable);
		return ctAnonymousExecutable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtClass createCtClass() {
		CtClassImpl ctClass = new EmfClassImpl();
		setSpoonFactory(ctClass);
		return ctClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtConstructor createCtConstructor() {
		CtConstructorImpl ctConstructor = new EmfConstructorImpl();
		setSpoonFactory(ctConstructor);
		return ctConstructor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtElement createCtElement() {
		//CtElementImpl ctElement = new CtElementImpl();
		
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtEnum createCtEnum() {
		CtEnumImpl ctEnum = new EmfEnumImpl();
		setSpoonFactory(ctEnum);
		return ctEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtExecutable createCtExecutable() {
		//CtExecutableImpl ctExecutable = new CtExecutableImpl();
		
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtField createCtField() {
		CtFieldImpl ctField = new EmfFieldImpl();
		setSpoonFactory(ctField);
		return ctField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtGenericElement createCtGenericElement() {
		//CtGenericElementImpl ctGenericElement = new CtGenericElementImpl();
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtInterface createCtInterface() {
		CtInterfaceImpl ctInterface = new EmfInterfaceImpl();
		setSpoonFactory(ctInterface);
		return ctInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtMethod createCtMethod() {
		CtMethodImpl ctMethod = new EmfMethodImpl();
		setSpoonFactory(ctMethod);
		return ctMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtModifiable createCtModifiable() {
		//CtModifiableImpl ctModifiable = new CtModifiableImpl();
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtNamedElement createCtNamedElement() {
		//CtNamedElementImpl ctNamedElement = new CtNamedElementImpl();
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtPackage createCtPackage() {
		CtPackageImpl ctPackage = new EmfPackageImpl();
		setSpoonFactory(ctPackage);
		return ctPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtParameter createCtParameter() {
		CtParameterImpl ctParameter = new EmfParameterImpl();
		setSpoonFactory(ctParameter);
		return ctParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtSimpleType createCtSimpleType() {
		//CtSimpleTypeImpl ctSimpleType = new CtSimpleTypeImpl();
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtType createCtType() {
		//CtTypeImpl ctType = new CtTypeImpl();
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtTypeParameter createCtTypeParameter() {
		CtTypeParameterImpl ctTypeParameter = new EmfTypeParameterImpl();
		setSpoonFactory(ctTypeParameter);
		return ctTypeParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtTypedElement createCtTypedElement() {
		//CtTypedElementImpl ctTypedElement = new CtTypedElementImpl();
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtVariable createCtVariable() {
		//CtVariableImpl ctVariable = new CtVariableImpl();
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourcePosition createSourcePosition() {
		SourcePositionImpl sourcePosition = new SourcePositionImpl();
		setSpoonFactory(sourcePosition);
		return sourcePosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeclarationPackage getDeclarationPackage() {
		return (DeclarationPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	public static DeclarationPackage getPackage() {
		return DeclarationPackage.eINSTANCE;
	}

	public CtAnnotationElementValue createCtAnnotationElementValue() {
		
		return new CtAnnotationElementValueImpl();
	}

} //DeclarationFactoryImpl
