/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package art_relaxed.group_relaxed.impl;

import art_relaxed.group_relaxed.*;

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
public class Group_relaxedFactoryImpl extends EFactoryImpl implements Group_relaxedFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Group_relaxedFactory init() {
		try {
			Group_relaxedFactory theGroup_relaxedFactory = (Group_relaxedFactory)EPackage.Registry.INSTANCE.getEFactory("http://art/group_relaxed"); 
			if (theGroup_relaxedFactory != null) {
				return theGroup_relaxedFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Group_relaxedFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Group_relaxedFactoryImpl() {
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
			case Group_relaxedPackage.TYPE_GROUP: return createTypeGroup();
			case Group_relaxedPackage.INSTANCE_GROUP: return createInstanceGroup();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeGroup createTypeGroup() {
		TypeGroupImpl typeGroup = new TypeGroupImpl();
		return typeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstanceGroup createInstanceGroup() {
		InstanceGroupImpl instanceGroup = new InstanceGroupImpl();
		return instanceGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Group_relaxedPackage getGroup_relaxedPackage() {
		return (Group_relaxedPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Group_relaxedPackage getPackage() {
		return Group_relaxedPackage.eINSTANCE;
	}

} //Group_relaxedFactoryImpl
