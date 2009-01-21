/**
 * <copyright>
 * </copyright>
 *
 * $Id: ValueType.java,v 1.10 2009-01-21 09:15:57 cfaucher Exp $
 */
package kermeta.standard;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value Type</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see kermeta.standard.StandardPackage#getValueType()
 * @model abstract="true"
 *        annotation="kermeta documentation='/**\n * The abstract class ValueType does not contain any feature.\n * However, any instance of a sub-class of ValueType will be passed by value \n * instead of by reference for any other objects.\n * that means that each time you := such object it will call the clone function associated to it (Not implemented yet except for Integer, String and boolean!!!)\n * \n \052/'"
 * @generated
 */
public interface ValueType extends kermeta.language.structure.Object {
} // ValueType
