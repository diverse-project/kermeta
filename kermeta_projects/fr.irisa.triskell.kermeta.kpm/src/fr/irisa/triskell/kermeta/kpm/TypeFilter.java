/**
 * <copyright>
 * </copyright>
 *
 * $Id: TypeFilter.java,v 1.3 2008-05-28 09:26:14 ftanguy Exp $
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
 *   <li>{@link fr.irisa.triskell.kermeta.kpm.TypeFilter#getJavaClassName <em>Java Class Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.irisa.triskell.kermeta.kpm.KpmPackage#getTypeFilter()
 * @model
 * @generated
 */
public interface TypeFilter extends Filter {
	/**
	 * Returns the value of the '<em><b>Java Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Java Class Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Java Class Name</em>' attribute.
	 * @see #setJavaClassName(String)
	 * @see fr.irisa.triskell.kermeta.kpm.KpmPackage#getTypeFilter_JavaClassName()
	 * @model required="true"
	 * @generated
	 */
	String getJavaClassName();

	/**
	 * Sets the value of the '{@link fr.irisa.triskell.kermeta.kpm.TypeFilter#getJavaClassName <em>Java Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Java Class Name</em>' attribute.
	 * @see #getJavaClassName()
	 * @generated
	 */
	void setJavaClassName(String value);

} // TypeFilter