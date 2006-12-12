/**
 * <copyright>
 * </copyright>
 *
 * $Id: Expression.java,v 1.1 2006-12-12 16:06:11 ftanguy Exp $
 */
package fr.irisa.triskell.kermeta.kpm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.irisa.triskell.kermeta.kpm.Expression#getSubExpressions <em>Sub Expressions</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.irisa.triskell.kermeta.kpm.KpmPackage#getExpression()
 * @model
 * @generated
 */
public interface Expression extends AbstractExpression {
	/**
	 * Returns the value of the '<em><b>Sub Expressions</b></em>' containment reference list.
	 * The list contents are of type {@link fr.irisa.triskell.kermeta.kpm.SuitedExpression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Expressions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Expressions</em>' containment reference list.
	 * @see fr.irisa.triskell.kermeta.kpm.KpmPackage#getExpression_SubExpressions()
	 * @model type="fr.irisa.triskell.kermeta.kpm.SuitedExpression" containment="true"
	 * @generated
	 */
	EList getSubExpressions();

} // Expression