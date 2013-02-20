/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.language.structure;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Type used to define the use of lambda expressions.
 *  Uses :
 *  <pre>operation forAll(func : <G -> Boolean>) : Boolean is do
 *      var test : Boolean init true
 *      from var it : Iterator<G> init iterator
 *      until it.isOff
 *      loop
 *         test := test and func(it.next)
 *      end
 *      result := test
 *  end
 *  </pre>
 *  *
 *  In the above example, &lt;G -> Boolean&gt; is a function type f(G) -&gt; 
 *  Boolean, with a parameter of type G and a return type of type Boolean
 *  The operation <code>forAll</code> takes a lambda expression as parameter.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.language.structure.FunctionType#getLeft <em>Left</em>}</li>
 *   <li>{@link org.kermeta.language.structure.FunctionType#getRight <em>Right</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.language.structure.StructurePackage#getFunctionType()
 * @model
 * @generated
 */
public interface FunctionType extends TypeContainer, Type {
	/**
	 * Returns the value of the '<em><b>Left</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Parameters of the function (a ProductType for multiple parameters)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Left</em>' reference.
	 * @see #setLeft(Type)
	 * @see org.kermeta.language.structure.StructurePackage#getFunctionType_Left()
	 * @model
	 * @generated
	 */
	Type getLeft();

	/**
	 * Sets the value of the '{@link org.kermeta.language.structure.FunctionType#getLeft <em>Left</em>}' reference.
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
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Result type of the function
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Right</em>' reference.
	 * @see #setRight(Type)
	 * @see org.kermeta.language.structure.StructurePackage#getFunctionType_Right()
	 * @model
	 * @generated
	 */
	Type getRight();

	/**
	 * Sets the value of the '{@link org.kermeta.language.structure.FunctionType#getRight <em>Right</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right</em>' reference.
	 * @see #getRight()
	 * @generated
	 */
	void setRight(Type value);

} // FunctionType
