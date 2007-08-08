/**
 * <copyright>
 * </copyright>
 *
 * $Id: TreeItem.java,v 1.2 2007-08-08 12:58:23 dvojtise Exp $
 */
package fr.irisa.triskell.kermeta.ui;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tree Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.irisa.triskell.kermeta.ui.TreeItem#getChildren <em>Children</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.ui.TreeItem#getParent <em>Parent</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.ui.TreeItem#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.irisa.triskell.kermeta.ui.UiPackage#getTreeItem()
 * @model abstract="true"
 * @generated
 */
public interface TreeItem extends EObject {
	/**
	 * Returns the value of the '<em><b>Children</b></em>' reference list.
	 * The list contents are of type {@link fr.irisa.triskell.kermeta.ui.TreeItem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' reference list.
	 * @see fr.irisa.triskell.kermeta.ui.UiPackage#getTreeItem_Children()
	 * @model
	 * @generated
	 */
	EList<TreeItem> getChildren();

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' reference.
	 * @see #setParent(TreeItem)
	 * @see fr.irisa.triskell.kermeta.ui.UiPackage#getTreeItem_Parent()
	 * @model
	 * @generated
	 */
	TreeItem getParent();

	/**
	 * Sets the value of the '{@link fr.irisa.triskell.kermeta.ui.TreeItem#getParent <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(TreeItem value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(Object)
	 * @see fr.irisa.triskell.kermeta.ui.UiPackage#getTreeItem_Value()
	 * @model required="true"
	 * @generated
	 */
	Object getValue();

	/**
	 * Sets the value of the '{@link fr.irisa.triskell.kermeta.ui.TreeItem#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Object value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String toText();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void calculateChildren();

} // TreeItem