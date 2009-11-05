/**
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * 
 * Generating with Kermeta <http://www.kermeta.org>
 *
 * $Id$
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tjava.lang.Boolean idIfCond_1169 = false;\n\tidIfCond_1169 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(eModelElement));\n\n\tif( idIfCond_1169 ) {\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EAnnotation>convertAsOrderedSet(eModelElement.getEAnnotations()).add(this.create(\"kompiledderivedProp.getter\", \"body\", body));\n}\n\n'"
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\t//BIft:exists\n\njava.lang.Boolean result_ft268 = null;\n\n\tjava.lang.Boolean test_ft268 = false;\n\n\t\n{\n\n\tkermeta.standard.Iterator<ecore.EAnnotation> it_ft268 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EAnnotation>convertAsOrderedSet(eModelElement.getEAnnotations()).iterator();\n\tjava.lang.Boolean idLoopCond_1170 = false;\n\twhile( !idLoopCond_1170 ) {\n\tidLoopCond_1170 = kermeta.standard.helper.BooleanWrapper.or(it_ft268.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(test_ft268, false));\n\tif ( idLoopCond_1170 ) {\n\t} else {\n\njava.lang.Boolean result_lambda_ft268 = null;\n//BIle:func\necore.EAnnotation a_lbdExp268 = it_ft268.next();\n\n\t//BIft:exists\n\njava.lang.Boolean result_ft269 = null;\n\n\tjava.lang.Boolean test_ft269 = false;\n\n\t\n{\n\n\tkermeta.standard.Iterator<ecore.EStringToStringMapEntry> it_ft269 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EStringToStringMapEntry>convertAsOrderedSet(a_lbdExp268.getDetails()).iterator();\n\tjava.lang.Boolean idLoopCond_1171 = false;\n\twhile( !idLoopCond_1171 ) {\n\tidLoopCond_1171 = kermeta.standard.helper.BooleanWrapper.or(it_ft269.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(test_ft269, false));\n\tif ( idLoopCond_1171 ) {\n\t} else {\n\njava.lang.Boolean result_lambda_ft269 = null;\n//BIle:func\necore.EStringToStringMapEntry d_lbdExp269 = it_ft269.next();\n\n\tresult_lambda_ft269 = kermeta.standard.helper.StringWrapper.equals(d_lbdExp269.getKey(), \"body\");\n//EIle:func\n\n\ttest_ft269 = kermeta.standard.helper.BooleanWrapper.or(test_ft269, result_lambda_ft269);\n}\n\t}\n}\n\n\n\tresult_ft269 = test_ft269;\n//EIft:exists\nresult_lambda_ft268 = result = kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.StringWrapper.equals(a_lbdExp268.getSource(), \"http://www.eclipse.org/emf/2002/GenModel\"), result_ft269);\n//EIle:func\n\n\ttest_ft268 = kermeta.standard.helper.BooleanWrapper.or(test_ft268, result_lambda_ft268);\n}\n\t}\n}\n\n\n\tresult_ft268 = test_ft268;\n\n//CE\nresult = result_ft268;\n//EIft:exists\n\n\nreturn result;\n'"
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
	 * @model dataType="kermeta.standard.JavaBoolean"
	 *        annotation="kermeta documentation='/**\r\n\t * Return true if the element is from an Ecore metamodel\r\n\t *\r\n\t * Value is true or false\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\t//BIft:exists\n\njava.lang.Boolean result_ft270 = null;\n\n\tjava.lang.Boolean test_ft270 = false;\n\n\t\n{\n\n\tkermeta.standard.Iterator<ecore.EAnnotation> it_ft270 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EAnnotation>convertAsOrderedSet(eModelElement.getEAnnotations()).iterator();\n\tjava.lang.Boolean idLoopCond_1172 = false;\n\twhile( !idLoopCond_1172 ) {\n\tidLoopCond_1172 = kermeta.standard.helper.BooleanWrapper.or(it_ft270.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(test_ft270, false));\n\tif ( idLoopCond_1172 ) {\n\t} else {\n\njava.lang.Boolean result_lambda_ft270 = null;\n//BIle:func\necore.EAnnotation a_lbdExp270 = it_ft270.next();\n\n\t//BIft:exists\n\njava.lang.Boolean result_ft271 = null;\n\n\tjava.lang.Boolean test_ft271 = false;\n\n\t\n{\n\n\tkermeta.standard.Iterator<ecore.EStringToStringMapEntry> it_ft271 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EStringToStringMapEntry>convertAsOrderedSet(a_lbdExp270.getDetails()).iterator();\n\tjava.lang.Boolean idLoopCond_1173 = false;\n\twhile( !idLoopCond_1173 ) {\n\tidLoopCond_1173 = kermeta.standard.helper.BooleanWrapper.or(it_ft271.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(test_ft271, false));\n\tif ( idLoopCond_1173 ) {\n\t} else {\n\njava.lang.Boolean result_lambda_ft271 = null;\n//BIle:func\necore.EStringToStringMapEntry d_lbdExp271 = it_ft271.next();\n\n\tresult_lambda_ft271 = kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.StringWrapper.equals(d_lbdExp271.getKey(), kermeta.standard.helper.StringWrapper.toString(km2ecore.helper.ecore.KermetaEAnnotationKey.getByName(\"ecore\").getName())), kermeta.standard.helper.StringWrapper.equals(d_lbdExp271.getValue(), \"true\"));\n//EIle:func\n\n\ttest_ft271 = kermeta.standard.helper.BooleanWrapper.or(test_ft271, result_lambda_ft271);\n}\n\t}\n}\n\n\n\tresult_ft271 = test_ft271;\n//EIft:exists\nresult_lambda_ft270 = result = kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.StringWrapper.equals(a_lbdExp270.getSource(), kermeta.standard.helper.StringWrapper.toString(km2ecore.helper.ecore.KermetaEAnnotationSource.getByName(\"kermeta\").getName())), result_ft271);\n//EIle:func\n\n\ttest_ft270 = kermeta.standard.helper.BooleanWrapper.or(test_ft270, result_lambda_ft270);\n}\n\t}\n}\n\n\n\tresult_ft270 = test_ft270;\n\n//CE\nresult = result_ft270;\n//EIft:exists\n\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean isFromAnEcoreMetamodel(EModelElement eModelElement);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model bodyDataType="kermeta.standard.JavaString"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tjava.lang.Boolean idIfCond_1174 = false;\n//BIft:andThen\n\njava.lang.Boolean result_ft272 = null;\n\n\tjava.lang.Boolean idIfCond_1175 = false;\n\tidIfCond_1175 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(eModelElement));\n\n\tif( idIfCond_1175 ) {\n\n\t//BIle:right\n/*This variable should be never used\052/ kermeta.language.structure.Object v_lbdExp272 = null;\n\n\tresult_ft272 = kermeta.standard.helper.BooleanWrapper.not(this.existsAnnotationGenModelImpl(eModelElement));\n//EIle:right\n\n}\n else {\n\n\tresult_ft272 = false;\n}\n\n\n//CEC\nidIfCond_1174 = result_ft272;\n//EIft:andThen\n\n\n\tif( idIfCond_1174 ) {\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EAnnotation>convertAsOrderedSet(eModelElement.getEAnnotations()).add(this.create(\"http://www.eclipse.org/emf/2002/GenModel\", \"body\", body));\n}\n\n'"
	 * @generated
	 */
	void addAnnotationGenModelImpl(EModelElement eModelElement, String body);

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
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\necore.EAnnotation result = null;\n\n\tresult = null;\n\n\tjava.lang.Boolean idIfCond_1176 = false;\n\tidIfCond_1176 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(obj)));\n\n\tif( idIfCond_1176 ) {\n\n\tkermeta.language.structure.Property ecoreMEProp = org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(obj).getPropertyValue(\"ecoreModelElement\");\n\n\tjava.lang.Boolean idIfCond_1177 = false;\n\tidIfCond_1177 = kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(ecoreMEProp)), kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.getSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(obj), ecoreMEProp))));\n\n\tif( idIfCond_1177 ) {\n\n\t//BIft:detect\n\necore.EAnnotation result_ft273 = null;\n\n\tecore.EAnnotation elem_ft273 = null;\n\n\tresult_ft273 = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<ecore.EAnnotation> it_ft273 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EAnnotation>convertAsOrderedSet(((ecore.EModelElement) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.getSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(obj), ecoreMEProp), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"ecore.EModelElement\"))).getEAnnotations()).iterator();\n\tjava.lang.Boolean idLoopCond_1178 = false;\n\twhile( !idLoopCond_1178 ) {\n\tidLoopCond_1178 = kermeta.standard.helper.BooleanWrapper.or(it_ft273.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(result_ft273, null));\n\tif ( idLoopCond_1178 ) {\n\t} else {\n\n\telem_ft273 = it_ft273.next();\n\n\tjava.lang.Boolean idIfCond_1179 = false;\n//BIle:detector\necore.EAnnotation t_lbdExp273 = elem_ft273;\n\n\tidIfCond_1179 = kermeta.standard.helper.StringWrapper.equals(t_lbdExp273.getSource(), kermeta.standard.helper.StringWrapper.toString(km2ecore.helper.ecore.KermetaEAnnotationSource.getByName(\"kermeta\").getName()));\n//EIle:detector\n\n\n\tif( idIfCond_1179 ) {\n\n\tresult_ft273 = elem_ft273;\n}\n\n}\n\t}\n}\n\n\n//CE\nresult = result_ft273;\n//EIft:detect\n\n\n\tjava.lang.Boolean idIfCond_1180 = false;\n\tidIfCond_1180 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(result);\n\n\tif( idIfCond_1180 ) {\n\n\tresult = this.getEmptyKermetaEAnnotation();\n}\n\n}\n\n}\n else {\n\n\tresult = this.getEmptyKermetaEAnnotation();\n}\n\n\n\tresult = this.getEmptyKermetaEAnnotation();\n\nreturn result;\n'"
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
	 * @model bodyDataType="kermeta.standard.JavaString"
	 *        annotation="kermeta documentation='/**\r\n\t * Not used\r\n\t \052/'"
	 *        annotation="kermeta deprecated='true'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tjava.lang.Boolean idIfCond_1181 = false;\n\tidIfCond_1181 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(eModelElement));\n\n\tif( idIfCond_1181 ) {\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EAnnotation>convertAsOrderedSet(eModelElement.getEAnnotations()).add(this.create(\"kompiledderivedProp.setter\", \"body\", body));\n}\n\n'"
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
