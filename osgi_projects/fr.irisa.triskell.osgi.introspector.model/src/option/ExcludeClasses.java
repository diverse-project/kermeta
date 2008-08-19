/**
 * <copyright>
 * </copyright>
 *
 * $Id: ExcludeClasses.java,v 1.3 2008-08-19 07:04:44 edaubert Exp $
 */
package option;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Exclude Classes</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link option.ExcludeClasses#getClasses <em>Classes</em>}</li>
 * </ul>
 * </p>
 *
 * @see option.OptionPackage#getExcludeClasses()
 * @model
 * @generated
 */
public interface ExcludeClasses extends ExportPackageDirective {
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
	 * @see option.OptionPackage#getExcludeClasses_Classes()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<option.Class> getClasses();

	void addExclude(option.Class exclude);

} // ExcludeClasses
