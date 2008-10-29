/**
 * <copyright>
 * </copyright>
 *
 * $Id: ReflectiveCollectionImpl.java,v 1.7 2008-10-29 08:29:15 cfaucher Exp $
 */
package kermeta.language.impl;

import kermeta.language.LanguagePackage;
import kermeta.language.ReflectiveCollection;

import kermeta.standard.impl.SetImpl;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reflective Collection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ReflectiveCollectionImpl<G> extends SetImpl<G> implements
		ReflectiveCollection<G> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReflectiveCollectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LanguagePackage.Literals.REFLECTIVE_COLLECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void clear() {

		org.kermeta.compil.runtime.helper.language.ReflectiveCollectionUtil
				.clear(this);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void remove(G element) {

		org.kermeta.compil.runtime.helper.language.ReflectiveCollectionUtil
				.remove(this, element);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void add(G element) {

		org.kermeta.compil.runtime.helper.language.ReflectiveCollectionUtil
				.add(this, element);

	}

} //ReflectiveCollectionImpl
