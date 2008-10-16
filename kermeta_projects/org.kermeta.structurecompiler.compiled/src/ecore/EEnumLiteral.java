/**
 * <copyright>
 * </copyright>
 *
 * $Id: EEnumLiteral.java,v 1.6 2008-10-16 13:18:10 cfaucher Exp $
 */
package ecore;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EEnum Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ecore.EEnumLiteral#getEEnum <em>EEnum</em>}</li>
 *   <li>{@link ecore.EEnumLiteral#getValue <em>Value</em>}</li>
 *   <li>{@link ecore.EEnumLiteral#getInstance <em>Instance</em>}</li>
 *   <li>{@link ecore.EEnumLiteral#getLiteral <em>Literal</em>}</li>
 * </ul>
 * </p>
 *
 * @see ecore.EcorePackage#getEEnumLiteral()
 * @model
 * @generated
 */
public interface EEnumLiteral extends ENamedElement {
	/**
	 * Returns the value of the '<em><b>EEnum</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ecore.EEnum#getELiterals <em>ELiterals</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EEnum</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EEnum</em>' container reference.
	 * @see ecore.EcorePackage#getEEnumLiteral_EEnum()
	 * @see ecore.EEnum#getELiterals
	 * @model opposite="eLiterals" changeable="false"
	 *        annotation="kermeta ecore.isTransient='true'"
	 * @generated
	 */
	EEnum getEEnum();

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(int)
	 * @see ecore.EcorePackage#getEEnumLiteral_Value()
	 * @model dataType="ecore.EInt"
	 * @generated
	 */
	int getValue();

	/**
	 * Sets the value of the '{@link ecore.EEnumLiteral#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(int value);

	/**
	 * Returns the value of the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance</em>' attribute.
	 * @see #setInstance(Enumerator)
	 * @see ecore.EcorePackage#getEEnumLiteral_Instance()
	 * @model dataType="ecore.EEnumerator" transient="true"
	 *        annotation="kermeta ecore.isTransient='true'"
	 * @generated
	 */
	Enumerator getInstance();

	/**
	 * Sets the value of the '{@link ecore.EEnumLiteral#getInstance <em>Instance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance</em>' attribute.
	 * @see #getInstance()
	 * @generated
	 */
	void setInstance(Enumerator value);

	/**
	 * Returns the value of the '<em><b>Literal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Literal</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Literal</em>' attribute.
	 * @see #setLiteral(String)
	 * @see ecore.EcorePackage#getEEnumLiteral_Literal()
	 * @model dataType="ecore.EString"
	 * @generated
	 */
	String getLiteral();

	/**
	 * Sets the value of the '{@link ecore.EEnumLiteral#getLiteral <em>Literal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Literal</em>' attribute.
	 * @see #getLiteral()
	 * @generated
	 */
	void setLiteral(String value);

} // EEnumLiteral
