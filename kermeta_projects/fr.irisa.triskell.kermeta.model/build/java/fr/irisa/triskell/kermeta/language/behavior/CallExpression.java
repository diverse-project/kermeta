/**
 * <copyright>
 * </copyright>
 *
 * $Id: CallExpression.java,v 1.7 2008-02-14 07:13:03 uid21732 Exp $
 */
package fr.irisa.triskell.kermeta.language.behavior;

import fr.irisa.triskell.kermeta.language.structure.Type;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Call Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.irisa.triskell.kermeta.language.behavior.CallExpression#getParameters <em>Parameters</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.language.behavior.CallExpression#getName <em>Name</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.language.behavior.CallExpression#getStaticTypeVariableBindings <em>Static Type Variable Bindings</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.irisa.triskell.kermeta.language.behavior.BehaviorPackage#getCallExpression()
 * @model abstract="true"
 *        annotation="GenModel documentation='/**\n * Any callable expression inherits this class, e.g : \n *   - variable call\n *   - feature call ( <code>a.b</code> : b is a feature call)\n *\n * <img alt=\"\"  height=\"90%\" width=\"90%\"  src=\"http://www.kermeta.org/docs/html.single/KerMeta-Manual/KerMeta-Manual_figures/kermeta_call_expressions.png\" />\n *\n \052/'"
 * @generated
 */
public interface CallExpression extends Expression {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "IRISA / INRIA / Universite de Rennes 1";

	/**
	 * Returns the value of the '<em><b>Static Type Variable Bindings</b></em>' reference list.
	 * The list contents are of type {@link fr.irisa.triskell.kermeta.language.structure.Type}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Static Type Variable Bindings</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Static Type Variable Bindings</em>' reference list.
	 * @see fr.irisa.triskell.kermeta.language.behavior.BehaviorPackage#getCallExpression_StaticTypeVariableBindings()
	 * @model annotation="GenModel documentation='/**\n * to be written #########################################\n \052/'"
	 * @generated
	 */
	EList<Type> getStaticTypeVariableBindings();

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link fr.irisa.triskell.kermeta.language.behavior.Expression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see fr.irisa.triskell.kermeta.language.behavior.BehaviorPackage#getCallExpression_Parameters()
	 * @model containment="true" resolveProxies="true"
	 *        annotation="GenModel documentation='/**\n * Kermeta calls can embedd expressions as parameters\n \052/'"
	 * @generated
	 */
	EList<Expression> getParameters();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see fr.irisa.triskell.kermeta.language.behavior.BehaviorPackage#getCallExpression_Name()
	 * @model dataType="fr.irisa.triskell.kermeta.language.structure.String"
	 *        annotation="GenModel documentation='/**\n * A call must be named\n \052/'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link fr.irisa.triskell.kermeta.language.behavior.CallExpression#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // CallExpression