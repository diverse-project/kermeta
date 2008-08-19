/**
 * <copyright>
 * </copyright>
 *
 * $Id: EmptyCollectionImpl.java,v 1.2 2008-08-19 13:23:00 cfaucher Exp $
 */
package kermeta.exceptions.impl;

import kermeta.exceptions.EmptyCollection;
import kermeta.exceptions.ExceptionsPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Empty Collection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class EmptyCollectionImpl extends ExceptionImpl implements
		EmptyCollection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EmptyCollectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExceptionsPackage.Literals.EMPTY_COLLECTION;
	}

} //EmptyCollectionImpl
