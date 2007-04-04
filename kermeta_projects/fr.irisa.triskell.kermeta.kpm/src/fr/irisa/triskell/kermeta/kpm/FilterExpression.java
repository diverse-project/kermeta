/**
 * <copyright>
 * </copyright>
 *
 * $Id: FilterExpression.java,v 1.1 2007-04-04 13:43:54 ftanguy Exp $
 */
package fr.irisa.triskell.kermeta.kpm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Filter Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.irisa.triskell.kermeta.kpm.FilterExpression#getFilter <em>Filter</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.irisa.triskell.kermeta.kpm.KpmPackage#getFilterExpression()
 * @model
 * @generated
 */
public interface FilterExpression extends SimpleExpression {
	/**
	 * Returns the value of the '<em><b>Filter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Filter</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filter</em>' reference.
	 * @see #setFilter(Filter)
	 * @see fr.irisa.triskell.kermeta.kpm.KpmPackage#getFilterExpression_Filter()
	 * @model required="true"
	 * @generated
	 */
	Filter getFilter();

	/**
	 * Sets the value of the '{@link fr.irisa.triskell.kermeta.kpm.FilterExpression#getFilter <em>Filter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filter</em>' reference.
	 * @see #getFilter()
	 * @generated
	 */
	void setFilter(Filter value);

} // FilterExpression