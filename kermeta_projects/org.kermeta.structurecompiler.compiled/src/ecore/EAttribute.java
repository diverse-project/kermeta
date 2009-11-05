/**
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * 
 * Generating with Kermeta <http://www.kermeta.org>
 *
 * $Id$
 */
package ecore;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EAttribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ecore.EAttribute#isID <em>ID</em>}</li>
 * </ul>
 * </p>
 *
 * @see ecore.EcorePackage#getEAttribute()
 * @model annotation="kermeta ecore='true'"
 * @generated
 */
public interface EAttribute extends EStructuralFeature {
	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #setID(boolean)
	 * @see ecore.EcorePackage#getEAttribute_ID()
	 * @model default="false" dataType="ecore.EBoolean"
	 *        annotation="kermeta ecore='true'"
	 * @generated
	 */
	boolean isID();

	/**
	 * Sets the value of the '{@link ecore.EAttribute#isID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #isID()
	 * @generated
	 */
	void setID(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\necore.EDataType result = null;\n\nreturn result;\n'"
	 * @generated
	 */
	EDataType getterEAttributeType();

} // EAttribute
