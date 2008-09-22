/**
 * <copyright>
 * </copyright>
 *
 * $Id: Require.java,v 1.3 2008-09-22 14:47:40 cfaucher Exp $
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
 * @model annotation="kermeta documentation='To be written'"
 *        annotation="kermeta documentation='/**\n * \n \052/'"
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
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\necore.EAnnotation result = null;\n\n\tecore.EAnnotation ecoreAnnotation = ((kermeta.language.structure.ModelingUnit) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(org.kermeta.compil.runtime.helper.language.ObjectUtil.container(this), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ModelingUnit\"))).getEcoreModelElement();\n\n\tecore.EStringToStringMapEntry requireEntry = null;\n//BIft:detect\n\necore.EStringToStringMapEntry result_ft177 = null;\n\n\tecore.EStringToStringMapEntry elem_ft177 = null;\n\n\tresult_ft177 = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<ecore.EStringToStringMapEntry> it_ft177 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EStringToStringMapEntry>convertAsOrderedSet(ecoreAnnotation.getDetails()).iterator();\n\tjava.lang.Boolean idLoopCond_782 = false;\n\twhile( !idLoopCond_782 ) {\n\tidLoopCond_782 = kermeta.standard.helper.BooleanWrapper.or(it_ft177.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqual(result_ft177, null));\n\tif ( idLoopCond_782 ) {\n\t} else {\n\n\telem_ft177 = it_ft177.next();\n\n\tjava.lang.Boolean idIfCond_783 = false;\n//BIle:detector\necore.EStringToStringMapEntry d_lbdExp177 = elem_ft177;\n\n\tidIfCond_783 = kermeta.standard.helper.StringWrapper.equals(d_lbdExp177.getKey(), \"require\");\n//EIle:detector\n\n\n\tif( idIfCond_783 ) {\n\n\tresult_ft177 = elem_ft177;\n}\n\n}\n\t}\n}\n\n\n//CE\nrequireEntry = result_ft177;\n//EIft:detect\n\n\n\trequireEntry.setValue(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(requireEntry.getValue(), this.getUri()), \"|\"));\n\n\tresult = ecoreAnnotation;\n\nreturn result;\n'"
	 * @generated
	 */
	EAnnotation createEcoreModelElement(KM2EcoreContext context);

} // Require
