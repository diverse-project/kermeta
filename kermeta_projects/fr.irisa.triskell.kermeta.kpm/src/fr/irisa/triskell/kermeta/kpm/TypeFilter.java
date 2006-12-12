/**
 * <copyright>
 * </copyright>
 *
 * $Id: TypeFilter.java,v 1.1 2006-12-12 16:06:12 ftanguy Exp $
 */
package fr.irisa.triskell.kermeta.kpm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Filter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.irisa.triskell.kermeta.kpm.TypeFilter#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.irisa.triskell.kermeta.kpm.KpmPackage#getTypeFilter()
 * @model
 * @generated
 */
public interface TypeFilter extends Filter {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(AbstractUnit)
	 * @see fr.irisa.triskell.kermeta.kpm.KpmPackage#getTypeFilter_Type()
	 * @model required="true"
	 * @generated
	 */
	AbstractUnit getType();

	/**
	 * Sets the value of the '{@link fr.irisa.triskell.kermeta.kpm.TypeFilter#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(AbstractUnit value);

} // TypeFilter