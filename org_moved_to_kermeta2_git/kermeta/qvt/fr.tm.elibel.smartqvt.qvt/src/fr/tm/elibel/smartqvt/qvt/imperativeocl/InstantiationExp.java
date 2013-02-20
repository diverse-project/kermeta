/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.tm.elibel.smartqvt.qvt.imperativeocl;

import fr.tm.elibel.smartqvt.qvt.essentialocl.Variable;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instantiation Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.tm.elibel.smartqvt.qvt.imperativeocl.InstantiationExp#getArgument <em>Argument</em>}</li>
 *   <li>{@link fr.tm.elibel.smartqvt.qvt.imperativeocl.InstantiationExp#getExtent <em>Extent</em>}</li>
 *   <li>{@link fr.tm.elibel.smartqvt.qvt.imperativeocl.InstantiationExp#getInstantiatedClass <em>Instantiated Class</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.tm.elibel.smartqvt.qvt.imperativeocl.ImperativeoclPackage#getInstantiationExp()
 * @model
 * @generated
 */
public interface InstantiationExp extends ImperativeExpression {
	/**
	 * Returns the value of the '<em><b>Argument</b></em>' containment reference list.
	 * The list contents are of type {@link fr.tm.elibel.smartqvt.qvt.essentialocl.OclExpression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Argument</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Argument</em>' containment reference list.
	 * @see fr.tm.elibel.smartqvt.qvt.imperativeocl.ImperativeoclPackage#getInstantiationExp_Argument()
	 * @model type="fr.tm.elibel.smartqvt.qvt.essentialocl.OclExpression" containment="true"
	 * @generated
	 */
	EList getArgument();

	/**
	 * Returns the value of the '<em><b>Extent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extent</em>' reference.
	 * @see #setExtent(Variable)
	 * @see fr.tm.elibel.smartqvt.qvt.imperativeocl.ImperativeoclPackage#getInstantiationExp_Extent()
	 * @model ordered="false"
	 * @generated
	 */
	Variable getExtent();

	/**
	 * Sets the value of the '{@link fr.tm.elibel.smartqvt.qvt.imperativeocl.InstantiationExp#getExtent <em>Extent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extent</em>' reference.
	 * @see #getExtent()
	 * @generated
	 */
	void setExtent(Variable value);

	/**
	 * Returns the value of the '<em><b>Instantiated Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instantiated Class</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instantiated Class</em>' reference.
	 * @see #setInstantiatedClass(fr.tm.elibel.smartqvt.qvt.emof.Class)
	 * @see fr.tm.elibel.smartqvt.qvt.imperativeocl.ImperativeoclPackage#getInstantiationExp_InstantiatedClass()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	fr.tm.elibel.smartqvt.qvt.emof.Class getInstantiatedClass();

	/**
	 * Sets the value of the '{@link fr.tm.elibel.smartqvt.qvt.imperativeocl.InstantiationExp#getInstantiatedClass <em>Instantiated Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instantiated Class</em>' reference.
	 * @see #getInstantiatedClass()
	 * @generated
	 */
	void setInstantiatedClass(fr.tm.elibel.smartqvt.qvt.emof.Class value);

} // InstantiationExp
