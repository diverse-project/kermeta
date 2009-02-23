/**
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * 
 * Generating with Kermeta <http://www.kermeta.org>
 *
 * $Id: Require.java,v 1.12 2009-02-23 15:26:48 cfaucher Exp $
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
 * @model annotation="kermeta documentation='/**\r\n * \r\n \052/'"
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
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\necore.EAnnotation result = null;\n\n\tecore.EAnnotation ecoreAnnotation = ((kermeta.language.structure.ModelingUnit) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(this), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ModelingUnit\"))).getEcoreModelElement();\n\n\tecore.EStringToStringMapEntry requireEntry = null;\n//BIft:detect\n\necore.EStringToStringMapEntry result_ft108 = null;\n\n\tecore.EStringToStringMapEntry elem_ft108 = null;\n\n\tresult_ft108 = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<ecore.EStringToStringMapEntry> it_ft108 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EStringToStringMapEntry>convertAsOrderedSet(ecoreAnnotation.getDetails()).iterator();\n\tjava.lang.Boolean idLoopCond_313 = false;\n\twhile( !idLoopCond_313 ) {\n\tidLoopCond_313 = kermeta.standard.helper.BooleanWrapper.or(it_ft108.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(result_ft108, null));\n\tif ( idLoopCond_313 ) {\n\t} else {\n\n\telem_ft108 = it_ft108.next();\n\n\tjava.lang.Boolean idIfCond_314 = false;\n//BIle:detector\necore.EStringToStringMapEntry d_lbdExp108 = elem_ft108;\n\n\tidIfCond_314 = kermeta.standard.helper.StringWrapper.equals(d_lbdExp108.getKey(), \"require\");\n//EIle:detector\n\n\n\tif( idIfCond_314 ) {\n\n\tresult_ft108 = elem_ft108;\n}\n\n}\n\t}\n}\n\n\n//CE\nrequireEntry = result_ft108;\n//EIft:detect\n;\n\n\trequireEntry.setValue(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(requireEntry.getValue(), this.getUri()), \"|\"));\n\n\tresult = ecoreAnnotation;\n\nreturn result;\n'"
	 * @generated
	 */
	EAnnotation createEcoreModelElement(KM2EcoreContext context);

} // Require
