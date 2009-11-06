/**
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * 
 * Generated with Kermeta <http://www.kermeta.org>
 *
 * $Id$
 */
package kermeta.exceptions;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Save Exception</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kermeta.exceptions.ResourceSaveException#getFailedWhileSaving <em>Failed While Saving</em>}</li>
 * </ul>
 * </p>
 *
 * @see kermeta.exceptions.ExceptionsPackage#getResourceSaveException()
 * @model annotation="kermeta documentation='/** Occurs when Resource saving fails for some reasons \052/'"
 * @generated
 */
public interface ResourceSaveException extends kermeta.exceptions.Exception {
	/**
	 * Returns the value of the '<em><b>Failed While Saving</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Failed While Saving</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Failed While Saving</em>' reference.
	 * @see #setFailedWhileSaving(kermeta.language.structure.Object)
	 * @see kermeta.exceptions.ExceptionsPackage#getResourceSaveException_FailedWhileSaving()
	 * @model annotation="kermeta documentation='/** Object on which the the saved failed\n\t * One can rescue the exception and analyse the structure next to this object, \n\t * this can give some clue about the faulty structure\n\t \052/'"
	 * @generated
	 */
	kermeta.language.structure.Object getFailedWhileSaving();

	/**
	 * Sets the value of the '{@link kermeta.exceptions.ResourceSaveException#getFailedWhileSaving <em>Failed While Saving</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Failed While Saving</em>' reference.
	 * @see #getFailedWhileSaving()
	 * @generated
	 */
	void setFailedWhileSaving(kermeta.language.structure.Object value);

} // ResourceSaveException
