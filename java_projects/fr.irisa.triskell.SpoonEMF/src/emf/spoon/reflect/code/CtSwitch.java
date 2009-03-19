/**
 * <copyright>
 * </copyright>
 *
 * $Id: CtSwitch.java,v 1.1 2007/02/14 20:38:03 barais Exp $
 */
package emf.spoon.reflect.code;

import java.util.List;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ct Switch</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link emf.spoon.reflect.code.CtSwitch#getSelector <em>Selector</em>}</li>
 *   <li>{@link emf.spoon.reflect.code.CtSwitch#getCases <em>Cases</em>}</li>
 * </ul>
 * </p>
 *
 * @see emf.spoon.reflect.code.CodePackage#getCtSwitch()
 * @model
 * @generated
 */
public interface CtSwitch extends CtStatement, spoon.reflect.code.CtSwitch {
	/**
	 * Returns the value of the '<em><b>Selector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selector</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selector</em>' reference.
	 * @see #setSelector(CtExpression)
	 * @see emf.spoon.reflect.code.CodePackage#getCtSwitch_Selector()
	 * @model
	 * @generated
	 */
	CtExpression getSelector();

	/**
	 * Sets the value of the '{@link emf.spoon.reflect.code.CtSwitch#getSelector <em>Selector</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selector</em>' reference.
	 * @see #getSelector()
	 * @generated
	 */
	void setSelector(CtExpression value);

	/**
	 * Returns the value of the '<em><b>Cases</b></em>' reference list.
	 * The list contents are of type {@link emf.spoon.reflect.code.CtCase}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cases</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cases</em>' reference list.
	 * @see emf.spoon.reflect.code.CodePackage#getCtSwitch_Cases()
	 * @model type="emf.spoon.reflect.code.CtCase"
	 * @generated
	 */
	List getCases();

} // CtSwitch