/**
 * <copyright>
 * </copyright>
 *
 * $Id: StackImpl.java,v 1.3 2008-09-22 14:49:06 cfaucher Exp $
 */
package kermeta.utils.impl;

import kermeta.standard.impl.SequenceImpl;

import kermeta.utils.Stack;
import kermeta.utils.UtilsPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Stack</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class StackImpl<G> extends SequenceImpl<G> implements Stack<G> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StackImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UtilsPackage.Literals.STACK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public G pop() {

		G result = null;

		result = this.peek();

		this.removeAt(0);

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public G peek() {

		G result = null;

		result = this.first();

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void push(G element) {

		this.addAt(0, element);

	}

} //StackImpl
