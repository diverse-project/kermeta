/**
 * <copyright>
 * </copyright>
 *
 * $Id: ReflectiveSequenceImpl.java,v 1.2 2008-08-19 13:23:11 cfaucher Exp $
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
public class ReflectiveSequenceImpl<G> extends OrderedSetImpl<G> implements
		ReflectiveSequence<G> {
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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void clear() {

		//Call of the super operation
		((kermeta.language.ReflectiveCollection) this).clear();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addAt(Integer index, G element) {

		org.kermeta.compil.runtime.helper.language.ReflectiveSequenceUtil
				.addAt(this, index, element);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeAt(Integer index) {

		org.kermeta.compil.runtime.helper.language.ReflectiveSequenceUtil
				.removeAt(this, index);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void remove(G element) {

		//Call of the super operation
		((kermeta.language.ReflectiveCollection) this).remove(element);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean equals(kermeta.language.structure.Object element) {

		java.lang.Boolean result = null;

		result = //Call of the super operation
		((kermeta.standard.OrderedSet) this).equals(element);

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void add(G element) {

		//Call of the super operation
		((kermeta.language.ReflectiveCollection) this).add(element);

	}

} //ReflectiveSequenceImpl
