/**
 * <copyright>
 * </copyright>
 *
 * $Id: NameFilter.java,v 1.2 2007-04-04 13:43:54 ftanguy Exp $
 */
package fr.irisa.triskell.kermeta.kpm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Name Filter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.irisa.triskell.kermeta.kpm.NameFilter#getRegex <em>Regex</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.irisa.triskell.kermeta.kpm.KpmPackage#getNameFilter()
 * @model
 * @generated
 */
public interface NameFilter extends Filter {
	/**
	 * Returns the value of the '<em><b>Regex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Regex</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Regex</em>' attribute.
	 * @see #setRegex(String)
	 * @see fr.irisa.triskell.kermeta.kpm.KpmPackage#getNameFilter_Regex()
	 * @model
	 * @generated
	 */
	String getRegex();

	/**
	 * Sets the value of the '{@link fr.irisa.triskell.kermeta.kpm.NameFilter#getRegex <em>Regex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Regex</em>' attribute.
	 * @see #getRegex()
	 * @generated
	 */
	void setRegex(String value);

} // NameFilter