/**
 * <copyright>
 * </copyright>
 *
 * $Id: ReflectiveSequenceImpl.java,v 1.1 2008-07-02 09:43:58 ftanguy Exp $
 */
package kermeta.language.impl;

import kermeta.language.LanguagePackage;
import kermeta.language.ReflectiveSequence;

import kermeta.standard.impl.OrderedSetImpl;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reflective Sequence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ReflectiveSequenceImpl<G> extends OrderedSetImpl<G> implements ReflectiveSequence<G> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReflectiveSequenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LanguagePackage.Literals.REFLECTIVE_SEQUENCE;
	}

} //ReflectiveSequenceImpl
