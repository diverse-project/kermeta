/**
 * <copyright>
 * </copyright>
 *
 * $Id: CtBreak.java,v 1.1 2007/02/14 20:38:03 barais Exp $
 */
package emf.spoon.reflect.code;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ct Break</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link emf.spoon.reflect.code.CtBreak#getLabelledStatement <em>Labelled Statement</em>}</li>
 * </ul>
 * </p>
 *
 * @see emf.spoon.reflect.code.CodePackage#getCtBreak()
 * @model
 * @generated
 */
public interface CtBreak extends CtCFlowBreak, spoon.reflect.code.CtBreak {
	/**
	 * Returns the value of the '<em><b>Labelled Statement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Labelled Statement</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Labelled Statement</em>' reference.
	 * @see #setLabelledStatement(CtStatement)
	 * @see emf.spoon.reflect.code.CodePackage#getCtBreak_LabelledStatement()
	 * @model
	 * @generated
	 */
	CtStatement getLabelledStatement();

	/**
	 * Sets the value of the '{@link emf.spoon.reflect.code.CtBreak#getLabelledStatement <em>Labelled Statement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Labelled Statement</em>' reference.
	 * @see #getLabelledStatement()
	 * @generated
	 */
	void setLabelledStatement(CtStatement value);

} // CtBreak