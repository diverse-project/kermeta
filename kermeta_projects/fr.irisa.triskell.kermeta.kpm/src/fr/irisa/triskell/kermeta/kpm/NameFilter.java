/**
 * <copyright>
 * </copyright>
 *
 * $Id: NameFilter.java,v 1.1 2006-12-12 16:06:12 ftanguy Exp $
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
 *   <li>{@link fr.irisa.triskell.kermeta.kpm.NameFilter#getRegexIn <em>Regex In</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.kpm.NameFilter#getRegexOut <em>Regex Out</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.irisa.triskell.kermeta.kpm.KpmPackage#getNameFilter()
 * @model
 * @generated
 */
public interface NameFilter extends Filter {
	/**
	 * Returns the value of the '<em><b>Regex In</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Regex In</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Regex In</em>' attribute.
	 * @see #setRegexIn(String)
	 * @see fr.irisa.triskell.kermeta.kpm.KpmPackage#getNameFilter_RegexIn()
	 * @model dataType="fr.irisa.triskell.kermeta.kpm.String"
	 * @generated
	 */
	String getRegexIn();

	/**
	 * Sets the value of the '{@link fr.irisa.triskell.kermeta.kpm.NameFilter#getRegexIn <em>Regex In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Regex In</em>' attribute.
	 * @see #getRegexIn()
	 * @generated
	 */
	void setRegexIn(String value);

	/**
	 * Returns the value of the '<em><b>Regex Out</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Regex Out</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Regex Out</em>' attribute.
	 * @see #setRegexOut(String)
	 * @see fr.irisa.triskell.kermeta.kpm.KpmPackage#getNameFilter_RegexOut()
	 * @model dataType="fr.irisa.triskell.kermeta.kpm.String"
	 * @generated
	 */
	String getRegexOut();

	/**
	 * Sets the value of the '{@link fr.irisa.triskell.kermeta.kpm.NameFilter#getRegexOut <em>Regex Out</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Regex Out</em>' attribute.
	 * @see #getRegexOut()
	 * @generated
	 */
	void setRegexOut(String value);

} // NameFilter