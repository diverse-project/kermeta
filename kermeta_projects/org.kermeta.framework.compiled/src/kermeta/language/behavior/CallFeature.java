/**
 * <copyright>
 * </copyright>
 *
 * $Id: CallFeature.java,v 1.2 2008-08-19 13:22:59 cfaucher Exp $
 */
package kermeta.language.behavior;

import kermeta.language.structure.EnumerationLiteral;
import kermeta.language.structure.Operation;
import kermeta.language.structure.Property;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Call Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kermeta.language.behavior.CallFeature#getIsAtpre <em>Is Atpre</em>}</li>
 *   <li>{@link kermeta.language.behavior.CallFeature#getStaticOperation <em>Static Operation</em>}</li>
 *   <li>{@link kermeta.language.behavior.CallFeature#getTarget <em>Target</em>}</li>
 *   <li>{@link kermeta.language.behavior.CallFeature#getStaticEnumLiteral <em>Static Enum Literal</em>}</li>
 *   <li>{@link kermeta.language.behavior.CallFeature#getStaticProperty <em>Static Property</em>}</li>
 * </ul>
 * </p>
 *
 * @see kermeta.language.behavior.BehaviorPackage#getCallFeature()
 * @model annotation="kermeta documentation='CallFeature is the model element that refers to the use of a feature, i.e either \na property or an operation in a statement. In <code>stdio.writeln(\"hello\")</code>, \n<code>writeln</code> is a CallFeature.'"
 * @generated
 */
public interface CallFeature extends CallExpression {
	/**
	 * Returns the value of the '<em><b>Is Atpre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Atpre</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Atpre</em>' attribute.
	 * @see #setIsAtpre(Boolean)
	 * @see kermeta.language.behavior.BehaviorPackage#getCallFeature_IsAtpre()
	 * @model dataType="kermeta.standard.JavaBoolean"
	 *        annotation="kermeta documentation='Tells whether this CallFeature represents a call to @pre in a postcondition'"
	 * @generated
	 */
	Boolean getIsAtpre();

	/**
	 * Sets the value of the '{@link kermeta.language.behavior.CallFeature#getIsAtpre <em>Is Atpre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Atpre</em>' attribute.
	 * @see #getIsAtpre()
	 * @generated
	 */
	void setIsAtpre(Boolean value);

	/**
	 * Returns the value of the '<em><b>Static Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Static Operation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Static Operation</em>' reference.
	 * @see #setStaticOperation(Operation)
	 * @see kermeta.language.behavior.BehaviorPackage#getCallFeature_StaticOperation()
	 * @model annotation="kermeta documentation='The method which will be executed (operation case)\nand the result value passed to the caller'"
	 * @generated
	 */
	Operation getStaticOperation();

	/**
	 * Sets the value of the '{@link kermeta.language.behavior.CallFeature#getStaticOperation <em>Static Operation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Static Operation</em>' reference.
	 * @see #getStaticOperation()
	 * @generated
	 */
	void setStaticOperation(Operation value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' containment reference.
	 * @see #setTarget(Expression)
	 * @see kermeta.language.behavior.BehaviorPackage#getCallFeature_Target()
	 * @model containment="true" resolveProxies="true"
	 *        annotation="kermeta documentation='Target Expression (the owner of the feature)'"
	 * @generated
	 */
	Expression getTarget();

	/**
	 * Sets the value of the '{@link kermeta.language.behavior.CallFeature#getTarget <em>Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' containment reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Expression value);

	/**
	 * Returns the value of the '<em><b>Static Enum Literal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Static Enum Literal</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Static Enum Literal</em>' reference.
	 * @see #setStaticEnumLiteral(EnumerationLiteral)
	 * @see kermeta.language.behavior.BehaviorPackage#getCallFeature_StaticEnumLiteral()
	 * @model annotation="kermeta documentation='To be written'"
	 * @generated
	 */
	EnumerationLiteral getStaticEnumLiteral();

	/**
	 * Sets the value of the '{@link kermeta.language.behavior.CallFeature#getStaticEnumLiteral <em>Static Enum Literal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Static Enum Literal</em>' reference.
	 * @see #getStaticEnumLiteral()
	 * @generated
	 */
	void setStaticEnumLiteral(EnumerationLiteral value);

	/**
	 * Returns the value of the '<em><b>Static Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Static Property</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Static Property</em>' reference.
	 * @see #setStaticProperty(Property)
	 * @see kermeta.language.behavior.BehaviorPackage#getCallFeature_StaticProperty()
	 * @model annotation="kermeta documentation='The object which will be returned (property case)'"
	 * @generated
	 */
	Property getStaticProperty();

	/**
	 * Sets the value of the '{@link kermeta.language.behavior.CallFeature#getStaticProperty <em>Static Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Static Property</em>' reference.
	 * @see #getStaticProperty()
	 * @generated
	 */
	void setStaticProperty(Property value);

} // CallFeature
