/**
 * <copyright>
 * </copyright>
 *
 * $Id: ProductType.java,v 1.10 2009-01-21 09:15:59 cfaucher Exp $
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
public interface ProductType extends TypeContainer, Type {
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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model indexDataType="kermeta.standard.JavaInteger"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.language.structure.Type result = null;\n\n\tresult = null;\n\n\tjava.lang.Boolean idIfCond_351 = false;\n\tidIfCond_351 = kermeta.standard.helper.IntegerWrapper.isLower(index, org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Type>convertAsSequence(this.getType()).size());\n\n\tif( idIfCond_351 ) {\n\n\tjava.lang.Boolean idIfCond_352 = false;\n\tidIfCond_352 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Type>convertAsSequence(this.getType()).elementAt(index), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.FunctionType\"));\n\n\tif( idIfCond_352 ) {\n\n\tresult = ((kermeta.language.structure.FunctionType) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Type>convertAsSequence(this.getType()).elementAt(index), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.FunctionType\"))).getRight();\n}\n else {\n\n\tresult = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Type>convertAsSequence(this.getType()).elementAt(index);\n}\n\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	Type getTypeByIndex(Integer index);

} // ProductType
