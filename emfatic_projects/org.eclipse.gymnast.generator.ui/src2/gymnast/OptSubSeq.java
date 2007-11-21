/**
 * <copyright>
 * </copyright>
 *
 * $Id: OptSubSeq.java,v 1.1 2007-11-21 10:22:22 ftanguy Exp $
 */
package gymnast;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Opt Sub Seq</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gymnast.OptSubSeq#getSeq <em>Seq</em>}</li>
 * </ul>
 * </p>
 *
 * @see gymnast.gymnastPackage#getOptSubSeq()
 * @model
 * @generated
 */
public interface OptSubSeq extends Expr {
	/**
	 * Returns the value of the '<em><b>Seq</b></em>' reference list.
	 * The list contents are of type {@link gymnast.Expr}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Seq</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Seq</em>' reference list.
	 * @see gymnast.gymnastPackage#getOptSubSeq_Seq()
	 * @model type="gymnast.Expr" required="true"
	 * @generated
	 */
	EList<Expr> getSeq();

} // OptSubSeq
