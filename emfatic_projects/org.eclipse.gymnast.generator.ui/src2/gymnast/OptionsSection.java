/**
 * <copyright>
 * </copyright>
 *
 * $Id: OptionsSection.java,v 1.1 2007-11-21 10:22:22 ftanguy Exp $
 */
package gymnast;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Options Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gymnast.OptionsSection#getOptionList <em>Option List</em>}</li>
 * </ul>
 * </p>
 *
 * @see gymnast.gymnastPackage#getOptionsSection()
 * @model
 * @generated
 */
public interface OptionsSection extends GymnastEASTNode {
	/**
	 * Returns the value of the '<em><b>Option List</b></em>' reference list.
	 * The list contents are of type {@link gymnast.Option}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Option List</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Option List</em>' reference list.
	 * @see gymnast.gymnastPackage#getOptionsSection_OptionList()
	 * @model type="gymnast.Option"
	 * @generated
	 */
	EList<Option> getOptionList();

} // OptionsSection
