/**
 * <copyright>
 * </copyright>
 *
 * $Id: ValueType.java,v 1.2 2008-08-19 13:23:04 cfaucher Exp $
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
 *        annotation="kermeta documentation='/**\r\n * The abstract class ValueType does not contain any feature.\r\n * However, any instance of a sub-class of ValueType will be passed by value \r\n * instead of by reference for any other objects.\r\n * that means that each time you := such object it will call the clone function associated to it (Not implemented yet except for Integer, String and boolean!!!)\r\n * \r\n \052/'"
 * @generated
 */
public interface ValueType extends kermeta.language.structure.Object {
} // ValueType
