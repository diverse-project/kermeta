/**
 * <copyright>
 * </copyright>
 *
 * $Id: ConstraintViolatedException.java,v 1.7 2008-11-27 15:49:51 cfaucher Exp $
 */
package kermeta.exceptions;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constraint Violated Exception</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kermeta.exceptions.ConstraintViolatedException#getConstraintAppliedTo <em>Constraint Applied To</em>}</li>
 * </ul>
 * </p>
 *
 * @see kermeta.exceptions.ExceptionsPackage#getConstraintViolatedException()
 * @model annotation="kermeta documentation='/** Common super class for all ConstraintVioloated exceptions \052/'"
 * @generated
 */
public interface ConstraintViolatedException extends
		kermeta.exceptions.Exception {
	/**
	 * Returns the value of the '<em><b>Constraint Applied To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraint Applied To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraint Applied To</em>' reference.
	 * @see #setConstraintAppliedTo(kermeta.language.structure.Object)
	 * @see kermeta.exceptions.ExceptionsPackage#getConstraintViolatedException_ConstraintAppliedTo()
	 * @model annotation="kermeta documentation='/** Object on which the constraint was applied to\n\t * On Invariant, we can generally consider this object as the faulty Object\n\t \052/'"
	 * @generated
	 */
	kermeta.language.structure.Object getConstraintAppliedTo();

	/**
	 * Sets the value of the '{@link kermeta.exceptions.ConstraintViolatedException#getConstraintAppliedTo <em>Constraint Applied To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constraint Applied To</em>' reference.
	 * @see #getConstraintAppliedTo()
	 * @generated
	 */
	void setConstraintAppliedTo(kermeta.language.structure.Object value);

} // ConstraintViolatedException
