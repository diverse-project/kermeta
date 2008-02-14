/**
 * <copyright>
 * </copyright>
 *
 * $Id: CallFeature.java,v 1.8 2008-02-14 07:13:03 uid21732 Exp $
 */
package fr.irisa.triskell.kermeta.language.behavior;

import fr.irisa.triskell.kermeta.language.structure.EnumerationLiteral;
import fr.irisa.triskell.kermeta.language.structure.Operation;
import fr.irisa.triskell.kermeta.language.structure.Property;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Call Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.irisa.triskell.kermeta.language.behavior.CallFeature#getTarget <em>Target</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.language.behavior.CallFeature#isIsAtpre <em>Is Atpre</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.language.behavior.CallFeature#getStaticProperty <em>Static Property</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.language.behavior.CallFeature#getStaticOperation <em>Static Operation</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.language.behavior.CallFeature#getStaticEnumLiteral <em>Static Enum Literal</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.irisa.triskell.kermeta.language.behavior.BehaviorPackage#getCallFeature()
 * @model annotation="GenModel documentation='/**\n * CallFeature is the model element that refers to the use of a feature, i.e either \n * a property or an operation in a statement. In <code>stdio.writeln(\"hello\")</code>, \n * <code>writeln</code> is a CallFeature.\n \052/'"
 * @generated
 */
public interface CallFeature extends CallExpression {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "IRISA / INRIA / Universite de Rennes 1";

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
	 * @see fr.irisa.triskell.kermeta.language.behavior.BehaviorPackage#getCallFeature_StaticProperty()
	 * @model annotation="GenModel documentation='/**\n * The object which will be returned (property case)\n \052/'"
	 * @generated
	 */
	Property getStaticProperty();

	/**
	 * Sets the value of the '{@link fr.irisa.triskell.kermeta.language.behavior.CallFeature#getStaticProperty <em>Static Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Static Property</em>' reference.
	 * @see #getStaticProperty()
	 * @generated
	 */
	void setStaticProperty(Property value);

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
	 * @see fr.irisa.triskell.kermeta.language.behavior.BehaviorPackage#getCallFeature_StaticOperation()
	 * @model annotation="GenModel documentation='/**\n * The method which will be executed (operation case)\n * and the result value passed to the caller\n \052/'"
	 * @generated
	 */
	Operation getStaticOperation();

	/**
	 * Sets the value of the '{@link fr.irisa.triskell.kermeta.language.behavior.CallFeature#getStaticOperation <em>Static Operation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Static Operation</em>' reference.
	 * @see #getStaticOperation()
	 * @generated
	 */
	void setStaticOperation(Operation value);

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
	 * @see fr.irisa.triskell.kermeta.language.behavior.BehaviorPackage#getCallFeature_StaticEnumLiteral()
	 * @model annotation="GenModel documentation='/**\n * To be written #################################\n \052/'"
	 * @generated
	 */
	EnumerationLiteral getStaticEnumLiteral();

	/**
	 * Sets the value of the '{@link fr.irisa.triskell.kermeta.language.behavior.CallFeature#getStaticEnumLiteral <em>Static Enum Literal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Static Enum Literal</em>' reference.
	 * @see #getStaticEnumLiteral()
	 * @generated
	 */
	void setStaticEnumLiteral(EnumerationLiteral value);

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
	 * @see fr.irisa.triskell.kermeta.language.behavior.BehaviorPackage#getCallFeature_Target()
	 * @model containment="true" resolveProxies="true"
	 *        annotation="GenModel documentation='/**\n * Target Expression (the owner of the feature)\n \052/'"
	 * @generated
	 */
	Expression getTarget();

	/**
	 * Sets the value of the '{@link fr.irisa.triskell.kermeta.language.behavior.CallFeature#getTarget <em>Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' containment reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Expression value);

	/**
	 * Returns the value of the '<em><b>Is Atpre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Atpre</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Atpre</em>' attribute.
	 * @see #setIsAtpre(boolean)
	 * @see fr.irisa.triskell.kermeta.language.behavior.BehaviorPackage#getCallFeature_IsAtpre()
	 * @model dataType="fr.irisa.triskell.kermeta.language.structure.Boolean"
	 *        annotation="GenModel documentation='/**\n * Tells whether this CallFeature represents a call to @pre in a postcondition\n \052/'"
	 * @generated
	 */
	boolean isIsAtpre();

	/**
	 * Sets the value of the '{@link fr.irisa.triskell.kermeta.language.behavior.CallFeature#isIsAtpre <em>Is Atpre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Atpre</em>' attribute.
	 * @see #isIsAtpre()
	 * @generated
	 */
	void setIsAtpre(boolean value);

} // CallFeature