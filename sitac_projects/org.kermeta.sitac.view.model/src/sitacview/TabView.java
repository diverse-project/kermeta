/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package sitacview;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tab View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sitacview.TabView#getChilds <em>Childs</em>}</li>
 *   <li>{@link sitacview.TabView#getSelected <em>Selected</em>}</li>
 * </ul>
 * </p>
 *
 * @see sitacview.SitacviewPackage#getTabView()
 * @model
 * @generated
 */
public interface TabView extends View {
	/**
	 * Returns the value of the '<em><b>Childs</b></em>' containment reference list.
	 * The list contents are of type {@link sitacview.TitledView}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Childs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Childs</em>' containment reference list.
	 * @see sitacview.SitacviewPackage#getTabView_Childs()
	 * @model type="sitacview.TitledView" containment="true"
	 * @generated
	 */
	EList getChilds();

	/**
	 * Returns the value of the '<em><b>Selected</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selected</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selected</em>' reference.
	 * @see #setSelected(TitledView)
	 * @see sitacview.SitacviewPackage#getTabView_Selected()
	 * @model
	 * @generated
	 */
	TitledView getSelected();

	/**
	 * Sets the value of the '{@link sitacview.TabView#getSelected <em>Selected</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selected</em>' reference.
	 * @see #getSelected()
	 * @generated
	 */
	void setSelected(TitledView value);

} // TabView
