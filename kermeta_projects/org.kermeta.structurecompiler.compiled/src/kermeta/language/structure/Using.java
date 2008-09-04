/**
 * <copyright>
 * </copyright>
 *
 * $Id: Using.java,v 1.1 2008-09-04 15:40:22 cfaucher Exp $
 */
package kermeta.language.structure;

import ecore.EAnnotation;

import km2ecore.KM2EcoreContext;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Using</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kermeta.language.structure.Using#getQualifiedName <em>Qualified Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see kermeta.language.structure.StructurePackage#getUsing()
 * @model annotation="kermeta documentation='/**\n * \n \052/'"
 *        annotation="kermeta documentation='To be written'"
 * @generated
 */
public interface Using extends kermeta.language.structure.Object {
	/**
	 * Returns the value of the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qualified Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualified Name</em>' attribute.
	 * @see #setQualifiedName(String)
	 * @see kermeta.language.structure.StructurePackage#getUsing_QualifiedName()
	 * @model dataType="kermeta.standard.JavaString"
	 *        annotation="kermeta documentation='To be written'"
	 * @generated
	 */
	String getQualifiedName();

	/**
	 * Sets the value of the '{@link kermeta.language.structure.Using#getQualifiedName <em>Qualified Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qualified Name</em>' attribute.
	 * @see #getQualifiedName()
	 * @generated
	 */
	void setQualifiedName(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta superOperation='kermeta::language::structure::Object'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tthis.createEcoreModelElement(context);\n'"
	 * @generated
	 */
	void applyPass1(KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\necore.EAnnotation result = null;\n\n\tecore.EAnnotation ecoreAnnotation = ((kermeta.language.structure.ModelingUnit) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(org.kermeta.compil.runtime.helper.language.ObjectUtil.container(this), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ModelingUnit\"))).getEcoreModelElement();\n\n\tecore.EStringToStringMapEntry usingEntry = null;\n//Beginning of the Inlining of the function type: detect\n\necore.EStringToStringMapEntry result_ft77 = null;\n\n\tecore.EStringToStringMapEntry elem_ft77 = null;\n\n\tresult_ft77 = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<ecore.EStringToStringMapEntry> it_ft77 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EStringToStringMapEntry>convertAsOrderedSet(ecoreAnnotation.getDetails()).iterator();\n\tjava.lang.Boolean idLoopCond_237 = false;\n\twhile( !idLoopCond_237 ) {\n\tidLoopCond_237 = kermeta.standard.helper.BooleanWrapper.or(it_ft77.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqual(result_ft77, null));\n\tif ( idLoopCond_237 ) {\n\t} else {\n\n\telem_ft77 = it_ft77.next();\n\n\tjava.lang.Boolean idIfCond_238 = false;\n//Beginning of the Inlining of the lambda expression: detector\necore.EStringToStringMapEntry d = elem_ft77;\n\n\tidIfCond_238 = kermeta.standard.helper.StringWrapper.equals(d.getKey(), \"using\");\n//End of the Inlining of the lambda expression: detector\n\n\n\tif( idIfCond_238 ) {\n\n\tresult_ft77 = elem_ft77;\n}\n\n}\n\t}\n}\n\n\n//callElement\nusingEntry = result_ft77;\n//End of the Inlining of the function type: detect\n\n\n\tusingEntry.setValue(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(usingEntry.getValue(), this.getQualifiedName()), \"|\"));\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EStringToStringMapEntry>convertAsOrderedSet(ecoreAnnotation.getDetails()).add(usingEntry);\n\n\tresult = ecoreAnnotation;\n\nreturn result;\n'"
	 * @generated
	 */
	EAnnotation createEcoreModelElement(KM2EcoreContext context);

} // Using
