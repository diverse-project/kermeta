/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.tm.elibel.smartqvt.qvt.essentialocl;

import fr.tm.elibel.smartqvt.qvt.emof.Property;
import fr.tm.elibel.smartqvt.qvt.emof.TypedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tuple Literal Part</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.tm.elibel.smartqvt.qvt.essentialocl.TupleLiteralPart#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link fr.tm.elibel.smartqvt.qvt.essentialocl.TupleLiteralPart#getTupleLiteralExp <em>Tuple Literal Exp</em>}</li>
 *   <li>{@link fr.tm.elibel.smartqvt.qvt.essentialocl.TupleLiteralPart#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.tm.elibel.smartqvt.qvt.essentialocl.EssentialoclPackage#getTupleLiteralPart()
 * @model
 * @generated
 */
public interface TupleLiteralPart extends TypedElement {
	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute</em>' reference.
	 * @see #setAttribute(Property)
	 * @see fr.tm.elibel.smartqvt.qvt.essentialocl.EssentialoclPackage#getTupleLiteralPart_Attribute()
	 * @model ordered="false"
	 * @generated
	 */
	Property getAttribute();

	/**
	 * Sets the value of the '{@link fr.tm.elibel.smartqvt.qvt.essentialocl.TupleLiteralPart#getAttribute <em>Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute</em>' reference.
	 * @see #getAttribute()
	 * @generated
	 */
	void setAttribute(Property value);

	/**
	 * Returns the value of the '<em><b>Tuple Literal Exp</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fr.tm.elibel.smartqvt.qvt.essentialocl.TupleLiteralExp#getPart <em>Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tuple Literal Exp</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tuple Literal Exp</em>' container reference.
	 * @see #setTupleLiteralExp(TupleLiteralExp)
	 * @see fr.tm.elibel.smartqvt.qvt.essentialocl.EssentialoclPackage#getTupleLiteralPart_TupleLiteralExp()
	 * @see fr.tm.elibel.smartqvt.qvt.essentialocl.TupleLiteralExp#getPart
	 * @model opposite="part" ordered="false"
	 * @generated
	 */
	TupleLiteralExp getTupleLiteralExp();

	/**
	 * Sets the value of the '{@link fr.tm.elibel.smartqvt.qvt.essentialocl.TupleLiteralPart#getTupleLiteralExp <em>Tuple Literal Exp</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tuple Literal Exp</em>' container reference.
	 * @see #getTupleLiteralExp()
	 * @generated
	 */
	void setTupleLiteralExp(TupleLiteralExp value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(OclExpression)
	 * @see fr.tm.elibel.smartqvt.qvt.essentialocl.EssentialoclPackage#getTupleLiteralPart_Value()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	OclExpression getValue();

	/**
	 * Sets the value of the '{@link fr.tm.elibel.smartqvt.qvt.essentialocl.TupleLiteralPart#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(OclExpression value);

} // TupleLiteralPart
