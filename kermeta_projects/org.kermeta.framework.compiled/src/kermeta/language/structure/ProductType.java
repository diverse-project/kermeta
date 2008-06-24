/**
 * Copyright: IRISA/INRIA/Universite de Rennes 1 - License: EPL - Web site: http://www.kermeta.org
 *
 * $Id: ProductType.java,v 1.1 2008-06-24 14:23:26 cfaucher Exp $
 */
package kermeta.language.structure;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kermeta.language.structure.ProductType#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see kermeta.language.structure.StructurePackage#getProductType()
 * @model annotation="kermeta documentation='Type corresponding to a set of Types\nOnly used in the context of FunctionType'"
 * @generated
 */
public interface ProductType extends TypeContainer, Type
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' reference list.
   * The list contents are of type {@link kermeta.language.structure.Type}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' reference list.
   * @see kermeta.language.structure.StructurePackage#getProductType_Type()
   * @model annotation="kermeta documentation='Types '"
   * @generated
   */
  EList<Type> getType();

} // ProductType
