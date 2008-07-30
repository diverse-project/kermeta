/**
 * <copyright>
 * </copyright>
 *
 * $Id: ExcludeClasses.java,v 1.1 2008-07-30 14:08:01 edaubert Exp $
 */
package option;

import jar.Class;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Exclude Classes</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link option.ExcludeClasses#getClasses <em>Classes</em>}</li>
 * </ul>
 * </p>
 * 
 * @see option.OptionPackage#getExcludeClasses()
 * @model
 * @generated
 */
public interface ExcludeClasses extends ExportPackageDirective {
	/**
	 * Returns the value of the '<em><b>Classes</b></em>' reference list.
	 * The list contents are of type {@link jar.Class}. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Classes</em>' reference list.
	 * @see option.OptionPackage#getExcludeClasses_Classes()
	 * @model required="true"
	 * @generated
	 */
	EList<jar.Class> getClasses();

	void addExclude(Class exclude);

} // ExcludeClasses
