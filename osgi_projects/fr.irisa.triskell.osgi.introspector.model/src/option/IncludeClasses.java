/**
 * <copyright>
 * </copyright>
 *
 * $Id: IncludeClasses.java,v 1.3 2008-08-19 07:04:44 edaubert Exp $
 */
package option;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Include Classes</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link option.IncludeClasses#getClasses <em>Classes</em>}</li>
 * </ul>
 * </p>
 *
 * @see option.OptionPackage#getIncludeClasses()
 * @model
 * @generated
 */
public interface IncludeClasses extends ExportPackageDirective {
	/**
	 * Returns the value of the '<em><b>Classes</b></em>' containment
	 * reference list. The list contents are of type {@link option.Class}. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Classes</em>' containment reference
	 *         list.
	 * @see option.OptionPackage#getIncludeClasses_Classes()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<option.Class> getClasses();

	void addInclude(option.Class include);

} // IncludeClasses
