/**
 * <copyright>
 * </copyright>
 *
 * $Id: TypeVariable.java,v 1.7 2008-03-19 16:34:13 cfaucher Exp $
 */
package fr.irisa.triskell.kermeta.language.structure;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Definition of a type variable for generic types :  
 * in class definition <pre>class AClass<X,Y> {}</pre>, X and Y are type variables.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.irisa.triskell.kermeta.language.structure.TypeVariable#getSupertype <em>Supertype</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.irisa.triskell.kermeta.language.structure.StructurePackage#getTypeVariable()
 * @model abstract="true"
 * @generated
 */
public interface TypeVariable extends TypeContainer, Type, NamedElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "IRISA / INRIA / Universite de Rennes 1";

	/**
	 * Returns the value of the '<em><b>Supertype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supertype</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reference to the supertype, if any
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supertype</em>' reference.
	 * @see #setSupertype(Type)
	 * @see fr.irisa.triskell.kermeta.language.structure.StructurePackage#getTypeVariable_Supertype()
	 * @model
	 * @generated
	 */
	Type getSupertype();

	/**
	 * Sets the value of the '{@link fr.irisa.triskell.kermeta.language.structure.TypeVariable#getSupertype <em>Supertype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supertype</em>' reference.
	 * @see #getSupertype()
	 * @generated
	 */
	void setSupertype(Type value);

} // TypeVariable