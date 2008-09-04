/**
 * <copyright>
 * </copyright>
 *
 * $Id: Require.java,v 1.1 2008-09-04 15:40:23 cfaucher Exp $
 */
package kermeta.language.structure;

import ecore.EAnnotation;

import km2ecore.KM2EcoreContext;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Require</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kermeta.language.structure.Require#getUri <em>Uri</em>}</li>
 * </ul>
 * </p>
 *
 * @see kermeta.language.structure.StructurePackage#getRequire()
 * @model annotation="kermeta documentation='/**\n * \n \052/'"
 *        annotation="kermeta documentation='To be written'"
 * @generated
 */
public interface Require extends kermeta.language.structure.Object {
	/**
	 * Returns the value of the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uri</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uri</em>' attribute.
	 * @see #setUri(String)
	 * @see kermeta.language.structure.StructurePackage#getRequire_Uri()
	 * @model dataType="kermeta.standard.JavaString"
	 *        annotation="kermeta documentation='To be written'"
	 * @generated
	 */
	String getUri();

	/**
	 * Sets the value of the '{@link kermeta.language.structure.Require#getUri <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uri</em>' attribute.
	 * @see #getUri()
	 * @generated
	 */
	void setUri(String value);

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
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\necore.EAnnotation result = null;\n\n\tecore.EAnnotation ecoreAnnotation = ((kermeta.language.structure.ModelingUnit) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(org.kermeta.compil.runtime.helper.language.ObjectUtil.container(this), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ModelingUnit\"))).getEcoreModelElement();\n\n\tecore.EStringToStringMapEntry requireEntry = null;\n//Beginning of the Inlining of the function type: detect\n\necore.EStringToStringMapEntry result_ft76 = null;\n\n\tecore.EStringToStringMapEntry elem_ft76 = null;\n\n\tresult_ft76 = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<ecore.EStringToStringMapEntry> it_ft76 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EStringToStringMapEntry>convertAsOrderedSet(ecoreAnnotation.getDetails()).iterator();\n\tjava.lang.Boolean idLoopCond_235 = false;\n\twhile( !idLoopCond_235 ) {\n\tidLoopCond_235 = kermeta.standard.helper.BooleanWrapper.or(it_ft76.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqual(result_ft76, null));\n\tif ( idLoopCond_235 ) {\n\t} else {\n\n\telem_ft76 = it_ft76.next();\n\n\tjava.lang.Boolean idIfCond_236 = false;\n//Beginning of the Inlining of the lambda expression: detector\necore.EStringToStringMapEntry d = elem_ft76;\n\n\tidIfCond_236 = kermeta.standard.helper.StringWrapper.equals(d.getKey(), \"require\");\n//End of the Inlining of the lambda expression: detector\n\n\n\tif( idIfCond_236 ) {\n\n\tresult_ft76 = elem_ft76;\n}\n\n}\n\t}\n}\n\n\n//callElement\nrequireEntry = result_ft76;\n//End of the Inlining of the function type: detect\n\n\n\trequireEntry.setValue(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(requireEntry.getValue(), this.getUri()), \"|\"));\n\n\tresult = ecoreAnnotation;\n\nreturn result;\n'"
	 * @generated
	 */
	EAnnotation createEcoreModelElement(KM2EcoreContext context);

} // Require
