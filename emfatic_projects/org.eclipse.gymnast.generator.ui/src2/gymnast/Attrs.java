/**
 * <copyright>
 * </copyright>
 *
 * $Id: Attrs.java,v 1.1 2007-11-21 10:22:22 ftanguy Exp $
 */
package gymnast;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attrs</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gymnast.Attrs#getAttrList <em>Attr List</em>}</li>
 * </ul>
 * </p>
 *
 * @see gymnast.gymnastPackage#getAttrs()
 * @model
 * @generated
 */
public interface Attrs extends GymnastEASTNode {
	/**
	 * Returns the value of the '<em><b>Attr List</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attr List</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attr List</em>' attribute list.
	 * @see gymnast.gymnastPackage#getAttrs_AttrList()
	 * @model type="java.lang.String"
	 * @generated
	 */
	EList<String> getAttrList();

} // Attrs
