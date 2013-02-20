/**
 * INRIA/IRISA
 * Triskell Team
 */
package org2.kermeta.kompren.slicer.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org2.kermeta.kompren.slicer.Constraint;
import org2.kermeta.kompren.slicer.OppositeCreation;
import org2.kermeta.kompren.slicer.Radius;
import org2.kermeta.kompren.slicer.SlicedClass;
import org2.kermeta.kompren.slicer.SlicedProperty;
import org2.kermeta.kompren.slicer.Slicer;
import org2.kermeta.kompren.slicer.SlicerFactory;
import org2.kermeta.kompren.slicer.SlicerPackage;
import org2.kermeta.kompren.slicer.VarDecl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SlicerFactoryImpl extends EFactoryImpl implements SlicerFactory {
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
	public static SlicerFactory init() {
		try {
			SlicerFactory theSlicerFactory = (SlicerFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.org.kermeta.kompren/org/kermeta/kompren/slicer"); 
			if (theSlicerFactory != null) {
				return theSlicerFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SlicerFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SlicerFactoryImpl() {
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
			case SlicerPackage.SLICER: return createSlicer();
			case SlicerPackage.CONSTRAINT: return createConstraint();
			case SlicerPackage.RADIUS: return createRadius();
			case SlicerPackage.SLICED_CLASS: return createSlicedClass();
			case SlicerPackage.SLICED_PROPERTY: return createSlicedProperty();
			case SlicerPackage.OPPOSITE_CREATION: return createOppositeCreation();
			case SlicerPackage.VAR_DECL: return createVarDecl();
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
	public Slicer createSlicer() {
		SlicerImpl slicer = new SlicerImpl();
		return slicer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Constraint createConstraint() {
		ConstraintImpl constraint = new ConstraintImpl();
		return constraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Radius createRadius() {
		RadiusImpl radius = new RadiusImpl();
		return radius;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SlicedClass createSlicedClass() {
		SlicedClassImpl slicedClass = new SlicedClassImpl();
		return slicedClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SlicedProperty createSlicedProperty() {
		SlicedPropertyImpl slicedProperty = new SlicedPropertyImpl();
		return slicedProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OppositeCreation createOppositeCreation() {
		OppositeCreationImpl oppositeCreation = new OppositeCreationImpl();
		return oppositeCreation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VarDecl createVarDecl() {
		VarDeclImpl varDecl = new VarDeclImpl();
		return varDecl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SlicerPackage getSlicerPackage() {
		return (SlicerPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SlicerPackage getPackage() {
		return SlicerPackage.eINSTANCE;
	}

} //SlicerFactoryImpl
