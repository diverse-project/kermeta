/**
 * INRIA/IRISA
 * Triskell Team
 */
package org2.kermeta.kompren.slicing.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org2.kermeta.kompren.slicing.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SlicingFactoryImpl extends EFactoryImpl implements SlicingFactory {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "INRIA/IRISA\nTriskell Team";

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SlicingFactory init() {
		try {
			SlicingFactory theSlicingFactory = (SlicingFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.org.kermeta.kompren/org/kermeta/kompren/slicing"); 
			if (theSlicingFactory != null) {
				return theSlicingFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SlicingFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SlicingFactoryImpl() {
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
			case SlicingPackage.SLICER: return createSlicer();
			case SlicingPackage.CONSTRAINT: return createConstraint();
			case SlicingPackage.RADIUS: return createRadius();
			case SlicingPackage.SLICED_CLASS: return createSlicedClass();
			case SlicingPackage.SLICED_PROPERTY: return createSlicedProperty();
			case SlicingPackage.OPPOSITE_CREATION: return createOppositeCreation();
			case SlicingPackage.VAR_DECL: return createVarDecl();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Slicer createSlicer() {
		SlicerImpl slicer = new SlicerImpl();
		return slicer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint createConstraint() {
		ConstraintImpl constraint = new ConstraintImpl();
		return constraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Radius createRadius() {
		RadiusImpl radius = new RadiusImpl();
		return radius;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SlicedClass createSlicedClass() {
		SlicedClassImpl slicedClass = new SlicedClassImpl();
		return slicedClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SlicedProperty createSlicedProperty() {
		SlicedPropertyImpl slicedProperty = new SlicedPropertyImpl();
		return slicedProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OppositeCreation createOppositeCreation() {
		OppositeCreationImpl oppositeCreation = new OppositeCreationImpl();
		return oppositeCreation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VarDecl createVarDecl() {
		VarDeclImpl varDecl = new VarDeclImpl();
		return varDecl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SlicingPackage getSlicingPackage() {
		return (SlicingPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SlicingPackage getPackage() {
		return SlicingPackage.eINSTANCE;
	}

} //SlicingFactoryImpl
