/**
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * 
 * Generating with Kermeta <http://www.kermeta.org>
 *
 * $Id: EAnnotationHelper.java,v 1.12 2009-02-23 15:26:55 cfaucher Exp $
 */
package km2ecore.helper.ecore;

import ecore.EAnnotation;
import ecore.EModelElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EAnnotation Helper</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see km2ecore.helper.ecore.EcorePackage#getEAnnotationHelper()
 * @model
 * @generated
 */
public interface EAnnotationHelper extends kermeta.language.structure.Object {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model bodyDataType="kermeta.standard.JavaString"
	 *        annotation="kermeta documentation='/**\r\n\t * Not used\r\n\t \052/'"
	 *        annotation="kermeta deprecated='true'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tjava.lang.Boolean idIfCond_13 = false;\n\tidIfCond_13 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(eModelElement));\n\n\tif( idIfCond_13 ) {\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EAnnotation>convertAsOrderedSet(eModelElement.getEAnnotations()).add(this.create(\"kompiledderivedProp.getter\", \"body\", body));\n}\n\n'"
	 * @generated
	 */
	void addAnnotationPropGetter(EModelElement eModelElement, String body);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model sourceDataType="kermeta.standard.JavaString"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\necore.EAnnotation result = null;\n\n\tecore.EAnnotation annotation = ((ecore.EAnnotation) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(ecore.EcorePackage.eINSTANCE.getEAnnotation()));\n\n\tannotation.setSource(source);\n\n\tresult = annotation;\n\nreturn result;\n'"
	 * @generated
	 */
	EAnnotation createEmpty(String source);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaBoolean"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\t//BIft:exists\n\njava.lang.Boolean result_ft2 = null;\n\n\tjava.lang.Boolean test_ft2 = false;\n\n\t\n{\n\n\tkermeta.standard.Iterator<ecore.EAnnotation> it_ft2 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EAnnotation>convertAsOrderedSet(eModelElement.getEAnnotations()).iterator();\n\tjava.lang.Boolean idLoopCond_14 = false;\n\twhile( !idLoopCond_14 ) {\n\tidLoopCond_14 = kermeta.standard.helper.BooleanWrapper.or(it_ft2.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(test_ft2, false));\n\tif ( idLoopCond_14 ) {\n\t} else {\n\njava.lang.Boolean result_lambda_ft2 = null;\n//BIle:func\necore.EAnnotation a_lbdExp2 = it_ft2.next();\n\n\t//BIft:exists\n\njava.lang.Boolean result_ft3 = null;\n\n\tjava.lang.Boolean test_ft3 = false;\n\n\t\n{\n\n\tkermeta.standard.Iterator<ecore.EStringToStringMapEntry> it_ft3 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EStringToStringMapEntry>convertAsOrderedSet(a_lbdExp2.getDetails()).iterator();\n\tjava.lang.Boolean idLoopCond_15 = false;\n\twhile( !idLoopCond_15 ) {\n\tidLoopCond_15 = kermeta.standard.helper.BooleanWrapper.or(it_ft3.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(test_ft3, false));\n\tif ( idLoopCond_15 ) {\n\t} else {\n\njava.lang.Boolean result_lambda_ft3 = null;\n//BIle:func\necore.EStringToStringMapEntry d_lbdExp3 = it_ft3.next();\n\n\tresult_lambda_ft3 = kermeta.standard.helper.StringWrapper.equals(d_lbdExp3.getKey(), \"body\");\n//EIle:func\n\n\ttest_ft3 = kermeta.standard.helper.BooleanWrapper.or(test_ft3, result_lambda_ft3);\n}\n\t}\n}\n\n\n\tresult_ft3 = test_ft3;\n//EIft:exists\nresult_lambda_ft2 = result = kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.StringWrapper.equals(a_lbdExp2.getSource(), \"http://www.eclipse.org/emf/2002/GenModel\"), result_ft3);\n//EIle:func\n\n\ttest_ft2 = kermeta.standard.helper.BooleanWrapper.or(test_ft2, result_lambda_ft2);\n}\n\t}\n}\n\n\n\tresult_ft2 = test_ft2;\n\n//CE\nresult = result_ft2;\n//EIft:exists\n\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean existsAnnotationGenModelImpl(EModelElement eModelElement);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model keyDataType="kermeta.standard.JavaString" valueDataType="kermeta.standard.JavaString"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tecore.EStringToStringMapEntry entry = ((ecore.EStringToStringMapEntry) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(ecore.EcorePackage.eINSTANCE.getEStringToStringMapEntry()));\n\n\tentry.setKey(key);\n\n\tentry.setValue(value);\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EStringToStringMapEntry>convertAsOrderedSet(annotation.getDetails()).add(entry);\n'"
	 * @generated
	 */
	void addEntry(EAnnotation annotation, String key, String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model bodyDataType="kermeta.standard.JavaString"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tjava.lang.Boolean idIfCond_16 = false;\n//BIft:andThen\n\njava.lang.Boolean result_ft4 = null;\n\n\tjava.lang.Boolean idIfCond_17 = false;\n\tidIfCond_17 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(eModelElement));\n\n\tif( idIfCond_17 ) {\n\n\t//BIle:right\n/*This variable should be never used\052/ kermeta.language.structure.Object v_lbdExp4 = null;\n\n\tresult_ft4 = kermeta.standard.helper.BooleanWrapper.not(this.existsAnnotationGenModelImpl(eModelElement));\n//EIle:right\n\n}\n else {\n\n\tresult_ft4 = false;\n}\n\n\n//CEC\nidIfCond_16 = result_ft4;\n//EIft:andThen\n\n\n\tif( idIfCond_16 ) {\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EAnnotation>convertAsOrderedSet(eModelElement.getEAnnotations()).add(this.create(\"http://www.eclipse.org/emf/2002/GenModel\", \"body\", body));\n}\n\n'"
	 * @generated
	 */
	void addAnnotationGenModelImpl(EModelElement eModelElement, String body);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\necore.EAnnotation result = null;\n\n\tresult = null;\n\n\tjava.lang.Boolean idIfCond_18 = false;\n\tidIfCond_18 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(obj)));\n\n\tif( idIfCond_18 ) {\n\n\tkermeta.language.structure.Property ecoreMEProp = org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(obj).getPropertyValue(\"ecoreModelElement\");\n\n\tjava.lang.Boolean idIfCond_19 = false;\n\tidIfCond_19 = kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(ecoreMEProp)), kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.getSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(obj), ecoreMEProp))));\n\n\tif( idIfCond_19 ) {\n\n\t//BIft:detect\n\necore.EAnnotation result_ft5 = null;\n\n\tecore.EAnnotation elem_ft5 = null;\n\n\tresult_ft5 = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<ecore.EAnnotation> it_ft5 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EAnnotation>convertAsOrderedSet(((ecore.EModelElement) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.getSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(obj), ecoreMEProp), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"ecore.EModelElement\"))).getEAnnotations()).iterator();\n\tjava.lang.Boolean idLoopCond_20 = false;\n\twhile( !idLoopCond_20 ) {\n\tidLoopCond_20 = kermeta.standard.helper.BooleanWrapper.or(it_ft5.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(result_ft5, null));\n\tif ( idLoopCond_20 ) {\n\t} else {\n\n\telem_ft5 = it_ft5.next();\n\n\tjava.lang.Boolean idIfCond_21 = false;\n//BIle:detector\necore.EAnnotation t_lbdExp5 = elem_ft5;\n\n\tidIfCond_21 = kermeta.standard.helper.StringWrapper.equals(t_lbdExp5.getSource(), kermeta.standard.helper.StringWrapper.toString(km2ecore.helper.ecore.KermetaEAnnotationSource.getByName(\"kermeta\").getName()));\n//EIle:detector\n\n\n\tif( idIfCond_21 ) {\n\n\tresult_ft5 = elem_ft5;\n}\n\n}\n\t}\n}\n\n\n//CE\nresult = result_ft5;\n//EIft:detect\n\n\n\tjava.lang.Boolean idIfCond_22 = false;\n\tidIfCond_22 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(result);\n\n\tif( idIfCond_22 ) {\n\n\tresult = this.getEmptyKermetaEAnnotation();\n}\n\n}\n\n}\n else {\n\n\tresult = this.getEmptyKermetaEAnnotation();\n}\n\n\n\tresult = this.getEmptyKermetaEAnnotation();\n\nreturn result;\n'"
	 * @generated
	 */
	EAnnotation getKermetaEAnnotation(kermeta.language.structure.Object obj);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\necore.EAnnotation result = null;\n\n\tresult = this.createKermetaEAnnotation(kermeta.standard.helper.StringWrapper.toString(km2ecore.helper.ecore.KermetaEAnnotationKey.getByName(\"isAbstract\").getName()), \"true\");\n\nreturn result;\n'"
	 * @generated
	 */
	EAnnotation createAbstract();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model keyDataType="kermeta.standard.JavaString" valueDataType="kermeta.standard.JavaString"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\necore.EAnnotation result = null;\n\n\tresult = this.create(kermeta.standard.helper.StringWrapper.toString(km2ecore.helper.ecore.KermetaEAnnotationSource.getByName(\"kermeta\").getName()), key, value);\n\nreturn result;\n'"
	 * @generated
	 */
	EAnnotation createKermetaEAnnotation(String key, String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model bodyDataType="kermeta.standard.JavaString"
	 *        annotation="kermeta documentation='/**\r\n\t * Not used\r\n\t \052/'"
	 *        annotation="kermeta deprecated='true'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tjava.lang.Boolean idIfCond_23 = false;\n\tidIfCond_23 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(eModelElement));\n\n\tif( idIfCond_23 ) {\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EAnnotation>convertAsOrderedSet(eModelElement.getEAnnotations()).add(this.create(\"kompiledderivedProp.setter\", \"body\", body));\n}\n\n'"
	 * @generated
	 */
	void addAnnotationPropSetter(EModelElement eModelElement, String body);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\necore.EAnnotation result = null;\n\n\tecore.EAnnotation annotation = ((ecore.EAnnotation) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(ecore.EcorePackage.eINSTANCE.getEAnnotation()));\n\n\tannotation.setSource(kermeta.standard.helper.StringWrapper.toString(km2ecore.helper.ecore.KermetaEAnnotationSource.getByName(\"kermeta\").getName()));\n\n\tresult = annotation;\n\nreturn result;\n'"
	 * @generated
	 */
	EAnnotation getEmptyKermetaEAnnotation();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model sourceDataType="kermeta.standard.JavaString" keyDataType="kermeta.standard.JavaString" valueDataType="kermeta.standard.JavaString"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\necore.EAnnotation result = null;\n\n\tecore.EAnnotation annotation = this.createEmpty(source);\n\n\tthis.addEntry(annotation, key, value);\n\n\tresult = annotation;\n\nreturn result;\n'"
	 * @generated
	 */
	EAnnotation create(String source, String key, String value);

} // EAnnotationHelper
