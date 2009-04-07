/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package art;

import org.eclipse.emf.common.util.EList;

import art.instance.CompositeInstance;
import art.type.ComponentType;
import art.type.Service;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link art.System#getRoot <em>Root</em>}</li>
 *   <li>{@link art.System#getServices <em>Services</em>}</li>
 *   <li>{@link art.System#getTypes <em>Types</em>}</li>
 *   <li>{@link art.System#getDataTypes <em>Data Types</em>}</li>
 * </ul>
 * </p>
 *
 * @see art.ArtPackage#getSystem()
 * @model
 * @generated
 */
public interface System extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Root</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Root</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root</em>' containment reference.
	 * @see #setRoot(CompositeInstance)
	 * @see art.ArtPackage#getSystem_Root()
	 * @model containment="true" required="true"
	 * @generated
	 */
	CompositeInstance getRoot();

	/**
	 * Sets the value of the '{@link art.System#getRoot <em>Root</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root</em>' containment reference.
	 * @see #getRoot()
	 * @generated
	 */
	void setRoot(CompositeInstance value);

	/**
	 * Returns the value of the '<em><b>Services</b></em>' containment reference list.
	 * The list contents are of type {@link art.type.Service}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Services</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Services</em>' containment reference list.
	 * @see art.ArtPackage#getSystem_Services()
	 * @model containment="true"
	 * @generated
	 */
	EList<Service> getServices();

	/**
	 * Returns the value of the '<em><b>Types</b></em>' containment reference list.
	 * The list contents are of type {@link art.type.ComponentType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Types</em>' containment reference list.
	 * @see art.ArtPackage#getSystem_Types()
	 * @model containment="true"
	 * @generated
	 */
	EList<ComponentType> getTypes();

	/**
	 * Returns the value of the '<em><b>Data Types</b></em>' containment reference list.
	 * The list contents are of type {@link art.DataType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Types</em>' containment reference list.
	 * @see art.ArtPackage#getSystem_DataTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataType> getDataTypes();

} // System
