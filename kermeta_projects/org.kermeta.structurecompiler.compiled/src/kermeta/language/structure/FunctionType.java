/**
 * <copyright>
 * </copyright>
 *
 * $Id: FunctionType.java,v 1.7 2008-10-29 08:29:16 cfaucher Exp $
 */
package kermeta.language.structure;

import ecore.EAnnotation;

import km2ecore.KM2EcoreContext;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kermeta.language.structure.FunctionType#getLeft <em>Left</em>}</li>
 *   <li>{@link kermeta.language.structure.FunctionType#getRight <em>Right</em>}</li>
 * </ul>
 * </p>
 *
 * @see kermeta.language.structure.StructurePackage#getFunctionType()
 * @model annotation="kermeta documentation='Type used to define the use of lambda expressions.\n Uses :\n <pre>operation forAll(func : <G -> Boolean>) : Boolean is do\n     var test : Boolean init true\n     from var it : Iterator<G> init iterator\n     until it.isOff\n     loop\n        test := test and func(it.next)\n     end\n     result := test\n end\n </pre>\n *\n In the above example, &lt;G -> Boolean&gt; is a function type f(G) -&gt; \n Boolean, with a parameter of type G and a return type of type Boolean\n The operation <code>forAll</code> takes a lambda expression as parameter.'"
 *        annotation="kermeta.inv resultType=''"
 * @generated
 */
public interface FunctionType extends TypeContainer, Type,
		Traceability<EAnnotation> {
	/**
	 * Returns the value of the '<em><b>Left</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left</em>' reference.
	 * @see #setLeft(Type)
	 * @see kermeta.language.structure.StructurePackage#getFunctionType_Left()
	 * @model annotation="kermeta documentation='Parameters of the function (a ProductType for multiple parameters)'"
	 * @generated
	 */
	Type getLeft();

	/**
	 * Sets the value of the '{@link kermeta.language.structure.FunctionType#getLeft <em>Left</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left</em>' reference.
	 * @see #getLeft()
	 * @generated
	 */
	void setLeft(Type value);

	/**
	 * Returns the value of the '<em><b>Right</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right</em>' reference.
	 * @see #setRight(Type)
	 * @see kermeta.language.structure.StructurePackage#getFunctionType_Right()
	 * @model annotation="kermeta documentation='Result type of the function'"
	 * @generated
	 */
	Type getRight();

	/**
	 * Sets the value of the '{@link kermeta.language.structure.FunctionType#getRight <em>Right</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right</em>' reference.
	 * @see #getRight()
	 * @generated
	 */
	void setRight(Type value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaString"
	 *        annotation="kermeta superOperation='kermeta::language::structure::Type'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.String result = null;\n\n\tkermeta.language.structure.helper.TypeSuper.super_createBehaviorJava(this, context);\n\n\tresult = \"\";\n\nreturn result;\n'"
	 * @generated
	 */
	String createBehaviorJava(KM2EcoreContext context);

} // FunctionType
