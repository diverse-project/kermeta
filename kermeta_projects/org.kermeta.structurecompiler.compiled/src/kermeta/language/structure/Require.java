/**
 * <copyright>
 * </copyright>
 *
 * $Id: Require.java,v 1.10 2009-01-21 09:15:58 cfaucher Exp $
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
 *        annotation="kermeta documentation='/**\r\n * \r\n \052/'"
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
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\necore.EAnnotation result = null;\n\n\tecore.EAnnotation ecoreAnnotation = ((kermeta.language.structure.ModelingUnit) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(this), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ModelingUnit\"))).getEcoreModelElement();\n\n\tecore.EStringToStringMapEntry requireEntry = null;\n//BIft:detect\n\necore.EStringToStringMapEntry result_ft116 = null;\n\n\tecore.EStringToStringMapEntry elem_ft116 = null;\n\n\tresult_ft116 = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<ecore.EStringToStringMapEntry> it_ft116 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EStringToStringMapEntry>convertAsOrderedSet(ecoreAnnotation.getDetails()).iterator();\n\tjava.lang.Boolean idLoopCond_363 = false;\n\twhile( !idLoopCond_363 ) {\n\tidLoopCond_363 = kermeta.standard.helper.BooleanWrapper.or(it_ft116.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(result_ft116, null));\n\tif ( idLoopCond_363 ) {\n\t} else {\n\n\telem_ft116 = it_ft116.next();\n\n\tjava.lang.Boolean idIfCond_364 = false;\n//BIle:detector\necore.EStringToStringMapEntry d_lbdExp116 = elem_ft116;\n\n\tidIfCond_364 = kermeta.standard.helper.StringWrapper.equals(d_lbdExp116.getKey(), \"require\");\n//EIle:detector\n\n\n\tif( idIfCond_364 ) {\n\n\tresult_ft116 = elem_ft116;\n}\n\n}\n\t}\n}\n\n\n//CE\nrequireEntry = result_ft116;\n//EIft:detect\n\n\n\trequireEntry.setValue(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(requireEntry.getValue(), this.getUri()), \"|\"));\n\n\tresult = ecoreAnnotation;\n\nreturn result;\n'"
	 * @generated
	 */
	EAnnotation createEcoreModelElement(KM2EcoreContext context);

} // Require
