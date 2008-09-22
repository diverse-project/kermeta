/**
 * <copyright>
 * </copyright>
 *
 * $Id: CallExpression.java,v 1.3 2008-09-22 14:46:28 cfaucher Exp $
 */
package kermeta.language.behavior;

import kermeta.language.structure.Type;

import km2ecore.KM2EcoreContext;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Call Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kermeta.language.behavior.CallExpression#getStaticTypeVariableBindings <em>Static Type Variable Bindings</em>}</li>
 *   <li>{@link kermeta.language.behavior.CallExpression#getName <em>Name</em>}</li>
 *   <li>{@link kermeta.language.behavior.CallExpression#getParameters <em>Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @see kermeta.language.behavior.BehaviorPackage#getCallExpression()
 * @model abstract="true"
 *        annotation="kermeta documentation='Any callable expression inherits this class, e.g : \n  - variable call\n  - feature call ( <code>a.b</code> : b is a feature call)\n\n<img alt=\"\"  height=\"90%\" width=\"90%\"  src=\"http://www.kermeta.org/docs/html.single/KerMeta-Manual/KerMeta-Manual_figures/kermeta_call_expressions.png\" />'"
 * @generated
 */
public interface CallExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>Static Type Variable Bindings</b></em>' reference list.
	 * The list contents are of type {@link kermeta.language.structure.Type}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Static Type Variable Bindings</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Static Type Variable Bindings</em>' reference list.
	 * @see kermeta.language.behavior.BehaviorPackage#getCallExpression_StaticTypeVariableBindings()
	 * @model annotation="kermeta documentation='To be written'"
	 * @generated
	 */
	EList<Type> getStaticTypeVariableBindings();

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
	 * @see kermeta.language.behavior.BehaviorPackage#getCallExpression_Name()
	 * @model dataType="kermeta.standard.JavaString"
	 *        annotation="kermeta documentation='A call must be named'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link kermeta.language.behavior.CallExpression#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link kermeta.language.behavior.Expression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see kermeta.language.behavior.BehaviorPackage#getCallExpression_Parameters()
	 * @model containment="true" resolveProxies="true"
	 *        annotation="kermeta documentation='Kermeta calls can embedd expressions as parameters'"
	 * @generated
	 */
	EList<Expression> getParameters();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="kermeta.standard.JavaBoolean"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = false;\n\n\tjava.lang.Boolean idIfCond_390 = false;\n\tidIfCond_390 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOf(this, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.CallFeature\"));\n\n\tif( idIfCond_390 ) {\n\n\tjava.lang.Boolean idIfCond_391 = false;\n\tidIfCond_391 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoid(((kermeta.language.behavior.CallFeature) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(this, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.CallFeature\"))).getStaticEnumLiteral()));\n\n\tif( idIfCond_391 ) {\n\n\tresult = true;\n}\n\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean isCallFeatureAsStaticEnumLiteral();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaString"
	 *        annotation="kermeta superOperation='kermeta::language::behavior::Expression'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.String result = null;\n\n\tsuper.createBehaviorJava(context);\n\n\tresult = org.kermeta.compil.runtime.helper.language.ObjectUtil.toString(this);\n\nreturn result;\n'"
	 * @generated
	 */
	String createBehaviorJava(KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="kermeta.standard.JavaBoolean"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = false;\n\n\tjava.lang.Boolean idIfCond_392 = false;\n\tidIfCond_392 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOf(this, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.CallFeature\"));\n\n\tif( idIfCond_392 ) {\n\n\tjava.lang.Boolean idIfCond_393 = false;\n\tidIfCond_393 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoid(((kermeta.language.behavior.CallFeature) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(this, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.CallFeature\"))).getStaticOperation()));\n\n\tif( idIfCond_393 ) {\n\n\tresult = true;\n}\n\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean isCallFeatureAsStaticOperation();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="kermeta.standard.JavaBoolean"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = false;\n\n\tjava.lang.Boolean idIfCond_394 = false;\n\tidIfCond_394 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOf(this, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.CallFeature\"));\n\n\tif( idIfCond_394 ) {\n\n\tjava.lang.Boolean idIfCond_395 = false;\n\tidIfCond_395 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoid(((kermeta.language.behavior.CallFeature) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(this, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.CallFeature\"))).getStaticProperty()));\n\n\tif( idIfCond_395 ) {\n\n\tresult = true;\n}\n\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean isCallFeatureAsStaticProperty();

} // CallExpression
