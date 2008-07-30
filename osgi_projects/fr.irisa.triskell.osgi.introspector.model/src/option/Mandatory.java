/**
 * <copyright>
 * </copyright>
 *
 * $Id: Mandatory.java,v 1.1 2008-07-30 14:08:01 edaubert Exp $
 */
package option;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Mandatory</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link option.Mandatory#getAttributs <em>Attributs</em>}</li>
 * </ul>
 * </p>
 * 
 * @see option.OptionPackage#getMandatory()
 * @model
 * @generated
 */
public interface Mandatory extends ExportPackageDirective {
	/**
	 * Returns the value of the '<em><b>Attributs</b></em>' reference list.
	 * The list contents are of type {@link option.AttributEntry}. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributs</em>' reference list isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Attributs</em>' reference list.
	 * @see option.OptionPackage#getMandatory_Attributs()
	 * @model
	 * @generated
	 */
	EList<AttributEntry> getAttributs();

	void addAttribut(AttributEntry attribut);

} // Mandatory
