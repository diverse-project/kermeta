/**
 * <copyright>
 * </copyright>
 *
 * $Id: CompUnit.java,v 1.1 2007-11-21 10:22:22 ftanguy Exp $
 */
package gymnast;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Comp Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gymnast.CompUnit#getHeaderSection <em>Header Section</em>}</li>
 *   <li>{@link gymnast.CompUnit#getGrammar <em>Grammar</em>}</li>
 * </ul>
 * </p>
 *
 * @see gymnast.gymnastPackage#getCompUnit()
 * @model
 * @generated
 */
public interface CompUnit extends GymnastEASTNode {
	/**
	 * Returns the value of the '<em><b>Header Section</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Header Section</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Header Section</em>' reference.
	 * @see #setHeaderSection(HeaderSection)
	 * @see gymnast.gymnastPackage#getCompUnit_HeaderSection()
	 * @model required="true"
	 * @generated
	 */
	HeaderSection getHeaderSection();

	/**
	 * Sets the value of the '{@link gymnast.CompUnit#getHeaderSection <em>Header Section</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Header Section</em>' reference.
	 * @see #getHeaderSection()
	 * @generated
	 */
	void setHeaderSection(HeaderSection value);

	/**
	 * Returns the value of the '<em><b>Grammar</b></em>' reference list.
	 * The list contents are of type {@link gymnast.Rule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Grammar</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grammar</em>' reference list.
	 * @see gymnast.gymnastPackage#getCompUnit_Grammar()
	 * @model type="gymnast.Rule"
	 * @generated
	 */
	EList<Rule> getGrammar();

} // CompUnit
