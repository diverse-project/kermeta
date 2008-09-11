/**
 * <copyright>
 * </copyright>
 *
 * $Id: TypeReferenceImpl.java,v 1.2 2008-09-11 12:34:40 cfaucher Exp $
 */
package kermeta.language.behavior.impl;

import kermeta.language.behavior.BehaviorPackage;
import kermeta.language.behavior.TypeReference;

import kermeta.language.structure.impl.MultiplicityElementImpl;

import km2ecore.KM2EcoreContext;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class TypeReferenceImpl extends MultiplicityElementImpl implements
		TypeReference {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BehaviorPackage.Literals.TYPE_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createBehaviorJava(KM2EcoreContext context) {

		java.lang.String result = null;

		kermeta.language.structure.helper.ObjectSuper.super_createBehaviorJava(
				this, context);

		result = this.getType().createBehaviorJava(context);

		return result;

	}

} //TypeReferenceImpl
