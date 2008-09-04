/**
 * <copyright>
 * </copyright>
 *
 * $Id: EEnum.java,v 1.1 2008-09-04 15:40:35 cfaucher Exp $
 */
package ecore;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EEnum</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ecore.EEnum#getELiterals <em>ELiterals</em>}</li>
 * </ul>
 * </p>
 *
 * @see ecore.EcorePackage#getEEnum()
 * @model annotation="kermeta aspect='true'"
 * @generated
 */
public interface EEnum extends EDataType {
	/**
	 * Returns the value of the '<em><b>ELiterals</b></em>' containment reference list.
	 * The list contents are of type {@link ecore.EEnumLiteral}.
	 * It is bidirectional and its opposite is '{@link ecore.EEnumLiteral#getEEnum <em>EEnum</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ELiterals</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ELiterals</em>' containment reference list.
	 * @see ecore.EcorePackage#getEEnum_ELiterals()
	 * @see ecore.EEnumLiteral#getEEnum
	 * @model opposite="eEnum" containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<EEnumLiteral> getELiterals();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valueDataType="ecore.EInt"
	 *        annotation="kermeta documentation='/** returns the enum literal which name is name \052/'"
	 *        annotation="kermeta documentation='/** returns the enum literal which value is value \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\necore.EEnumLiteral result = null;\n\n\tresult = null;\n//Beginning of the Inlining of the function type: detect\n\necore.EEnumLiteral result_ft189 = null;\n\n\tecore.EEnumLiteral elem_ft189 = null;\n\n\tresult_ft189 = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<ecore.EEnumLiteral> it_ft189 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EEnumLiteral>convertAsOrderedSet(this.getELiterals()).iterator();\n\tjava.lang.Boolean idLoopCond_835 = false;\n\twhile( !idLoopCond_835 ) {\n\tidLoopCond_835 = kermeta.standard.helper.BooleanWrapper.or(it_ft189.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqual(result_ft189, null));\n\tif ( idLoopCond_835 ) {\n\t} else {\n\n\telem_ft189 = it_ft189.next();\n\n\tjava.lang.Boolean idIfCond_836 = false;\n//Beginning of the Inlining of the lambda expression: detector\necore.EEnumLiteral e = elem_ft189;\n\n\tidIfCond_836 = kermeta.standard.helper.IntegerWrapper.equals(e.getValue(), value);\n//End of the Inlining of the lambda expression: detector\n\n\n\tif( idIfCond_836 ) {\n\n\tresult_ft189 = elem_ft189;\n}\n\n}\n\t}\n}\n\n//End of the Inlining of the function type: detect\n\n\nreturn result;\n'"
	 * @generated
	 */
	EEnumLiteral getEEnumLiteral2(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model nameDataType="ecore.EString"
	 *        annotation="kermeta isAbstract='true'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='ecore.EEnumLiteral result = null;\n\nreturn result;\n'"
	 * @generated
	 */
	EEnumLiteral op_getEEnumLiteral(String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valueDataType="ecore.EInt"
	 *        annotation="kermeta isAbstract='true'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='ecore.EEnumLiteral result = null;\n\nreturn result;\n'"
	 * @generated
	 */
	EEnumLiteral getEEnumLiteral(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model literalDataType="ecore.EString"
	 *        annotation="kermeta isAbstract='true'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='ecore.EEnumLiteral result = null;\n\nreturn result;\n'"
	 * @generated
	 */
	EEnumLiteral getEEnumLiteralByLiteral(String literal);

} // EEnum
