/**
 * <copyright>
 * </copyright>
 *
 * $Id: SummableImpl.java,v 1.8 2008-11-07 08:53:31 cfaucher Exp $
 */
package kermeta.standard.impl;

import kermeta.language.structure.impl.ObjectImpl;

import kermeta.standard.StandardPackage;
import kermeta.standard.Summable;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Summable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class SummableImpl<G> extends ObjectImpl implements Summable<G> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SummableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StandardPackage.Literals.SUMMABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public G plus(G other) {
		G result = null;

		return result;

	}

} //SummableImpl
