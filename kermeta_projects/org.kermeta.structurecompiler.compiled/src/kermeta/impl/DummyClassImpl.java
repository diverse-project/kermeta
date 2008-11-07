/**
 * <copyright>
 * </copyright>
 *
 * $Id: DummyClassImpl.java,v 1.8 2008-11-07 08:53:44 cfaucher Exp $
 */
package kermeta.impl;

import kermeta.DummyClass;
import kermeta.KermetaPackage;

import kermeta.language.structure.impl.ObjectImpl;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dummy Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class DummyClassImpl extends ObjectImpl implements DummyClass {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DummyClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KermetaPackage.Literals.DUMMY_CLASS;
	}

} //DummyClassImpl
