/**
 * <copyright>
 * </copyright>
 *
 * $Id: DummyClassImpl.java,v 1.5 2008-10-16 13:17:57 cfaucher Exp $
 */
package kermeta.language.impl;

import kermeta.language.DummyClass;
import kermeta.language.LanguagePackage;

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
		return LanguagePackage.Literals.DUMMY_CLASS;
	}

} //DummyClassImpl
