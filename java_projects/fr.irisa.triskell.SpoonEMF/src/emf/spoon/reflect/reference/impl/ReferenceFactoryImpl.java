/**
 * <copyright>
 * </copyright>
 *
 * $Id: ReferenceFactoryImpl.java,v 1.1 2007/02/14 20:38:04 barais Exp $
 */
package emf.spoon.reflect.reference.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import emf.spoon.reflect.declaration.impl.DeclarationFactoryImpl;
import emf.spoon.reflect.reference.CtArrayTypeReference;
import emf.spoon.reflect.reference.CtExecutableReference;
import emf.spoon.reflect.reference.CtFieldReference;
import emf.spoon.reflect.reference.CtGenericElementReference;
import emf.spoon.reflect.reference.CtLocalVariableReference;
import emf.spoon.reflect.reference.CtPackageReference;
import emf.spoon.reflect.reference.CtParameterReference;
import emf.spoon.reflect.reference.CtReference;
import emf.spoon.reflect.reference.CtTypeParameterReference;
import emf.spoon.reflect.reference.CtTypeReference;
import emf.spoon.reflect.reference.CtVariableReference;
import emf.spoon.reflect.reference.ReferenceFactory;
import emf.spoon.reflect.reference.ReferencePackage;
import emf.spoon.reflect.reference.impl.ext.EmfArrayTypeReferenceImpl;
import emf.spoon.reflect.reference.impl.ext.EmfExecutableReferenceImpl;
import emf.spoon.reflect.reference.impl.ext.EmfFieldReferenceImpl;
import emf.spoon.reflect.reference.impl.ext.EmfLocalVariableReferenceImpl;
import emf.spoon.reflect.reference.impl.ext.EmfPackageReferenceImpl;
import emf.spoon.reflect.reference.impl.ext.EmfParameterReferenceImpl;
import emf.spoon.reflect.reference.impl.ext.EmfTypeParameterReferenceImpl;
import emf.spoon.reflect.reference.impl.ext.EmfTypeReferenceImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ReferenceFactoryImpl extends EFactoryImpl implements ReferenceFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ReferenceFactory init() {
		try {
			ReferenceFactory theReferenceFactory = (ReferenceFactory)EPackage.Registry.INSTANCE.getEFactory("emf.spoon.reflect.reference"); 
			if (theReferenceFactory != null) {
				return theReferenceFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ReferenceFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ReferencePackage.CT_ARRAY_TYPE_REFERENCE: return createCtArrayTypeReference();
			case ReferencePackage.CT_EXECUTABLE_REFERENCE: return createCtExecutableReference();
			case ReferencePackage.CT_FIELD_REFERENCE: return createCtFieldReference();
			case ReferencePackage.CT_GENERIC_ELEMENT_REFERENCE: return createCtGenericElementReference();
			case ReferencePackage.CT_LOCAL_VARIABLE_REFERENCE: return createCtLocalVariableReference();
			case ReferencePackage.CT_PACKAGE_REFERENCE: return createCtPackageReference();
			case ReferencePackage.CT_PARAMETER_REFERENCE: return createCtParameterReference();
			case ReferencePackage.CT_REFERENCE: return createCtReference();
			case ReferencePackage.CT_TYPE_PARAMETER_REFERENCE: return createCtTypeParameterReference();
			case ReferencePackage.CT_TYPE_REFERENCE: return createCtTypeReference();
			case ReferencePackage.CT_VARIABLE_REFERENCE: return createCtVariableReference();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtArrayTypeReference createCtArrayTypeReference() {
		CtArrayTypeReferenceImpl ctArrayTypeReference = new EmfArrayTypeReferenceImpl();
		DeclarationFactoryImpl.setSpoonFactory(ctArrayTypeReference);
		return ctArrayTypeReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtExecutableReference createCtExecutableReference() {
		CtExecutableReferenceImpl ctExecutableReference = new EmfExecutableReferenceImpl();
		DeclarationFactoryImpl.setSpoonFactory(ctExecutableReference);
		return ctExecutableReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtFieldReference createCtFieldReference() {
		CtFieldReferenceImpl ctFieldReference = new EmfFieldReferenceImpl();
		DeclarationFactoryImpl.setSpoonFactory(ctFieldReference);
		return ctFieldReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtGenericElementReference createCtGenericElementReference() {
		//CtGenericElementReferenceImpl ctGenericElementReference = new CtGenericElementReferenceImpl();
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtLocalVariableReference createCtLocalVariableReference() {
		CtLocalVariableReferenceImpl ctLocalVariableReference = new EmfLocalVariableReferenceImpl();
		DeclarationFactoryImpl.setSpoonFactory(ctLocalVariableReference);
		
		return ctLocalVariableReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtPackageReference createCtPackageReference() {
		CtPackageReferenceImpl ctPackageReference = new EmfPackageReferenceImpl();
		DeclarationFactoryImpl.setSpoonFactory(ctPackageReference);
		
		return ctPackageReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtParameterReference createCtParameterReference() {
		CtParameterReferenceImpl ctParameterReference = new EmfParameterReferenceImpl();
		DeclarationFactoryImpl.setSpoonFactory(ctParameterReference);
		
		return ctParameterReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtReference createCtReference() {
		//CtReferenceImpl ctReference = new CtReferenceImpl();
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtTypeParameterReference createCtTypeParameterReference() {
		CtTypeParameterReferenceImpl ctTypeParameterReference = new EmfTypeParameterReferenceImpl();
		DeclarationFactoryImpl.setSpoonFactory(ctTypeParameterReference);
		
		return ctTypeParameterReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtTypeReference createCtTypeReference() {
		CtTypeReferenceImpl ctTypeReference = new EmfTypeReferenceImpl();
		DeclarationFactoryImpl.setSpoonFactory(ctTypeReference);
		
		return ctTypeReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtVariableReference createCtVariableReference() {
		//CtVariableReferenceImpl ctVariableReference = new CtVariableReferenceImpl();
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferencePackage getReferencePackage() {
		return (ReferencePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	public static ReferencePackage getPackage() {
		return ReferencePackage.eINSTANCE;
	}

} //ReferenceFactoryImpl
