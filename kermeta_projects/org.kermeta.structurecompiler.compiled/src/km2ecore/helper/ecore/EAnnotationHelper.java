/**
 * <copyright>
 * </copyright>
 *
 * $Id: EAnnotationHelper.java,v 1.9 2008-11-27 15:50:11 cfaucher Exp $
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
	 *        annotation="kermeta documentation='/**\n\t * Not used\n\t \052/'"
	 *        annotation="kermeta deprecated='true'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tjava.lang.Boolean idIfCond_1069 = false;\n\tidIfCond_1069 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(eModelElement));\n\n\tif( idIfCond_1069 ) {\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EAnnotation>convertAsOrderedSet(eModelElement.getEAnnotations()).add(this.create(\"kompiledderivedProp.getter\", \"body\", body));\n}\n\n'"
	 * @generated
	 */
	void addAnnotationPropGetter(EModelElement eModelElement, String body);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model sourceDataType="kermeta.standard.JavaString"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\necore.EAnnotation result = null;\n\n\tecore.EAnnotation annotation = ((ecore.EAnnotation) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"ecore.EAnnotation\"));\n\n\tannotation.setSource(source);\n\n\tresult = annotation;\n\nreturn result;\n'"
	 * @generated
	 */
	EAnnotation createEmpty(String source);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaBoolean"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\t//BIft:exists\n\njava.lang.Boolean result_ft241 = null;\n\n\tjava.lang.Boolean test_ft241 = false;\n\n\t\n{\n\n\tkermeta.standard.Iterator<ecore.EAnnotation> it_ft241 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EAnnotation>convertAsOrderedSet(eModelElement.getEAnnotations()).iterator();\n\tjava.lang.Boolean idLoopCond_1070 = false;\n\twhile( !idLoopCond_1070 ) {\n\tidLoopCond_1070 = kermeta.standard.helper.BooleanWrapper.or(it_ft241.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(test_ft241, false));\n\tif ( idLoopCond_1070 ) {\n\t} else {\n\njava.lang.Boolean result_lambda_ft241 = null;\n//BIle:func\necore.EAnnotation a_lbdExp241 = it_ft241.next();\n\n\t//BIft:exists\n\njava.lang.Boolean result_ft242 = null;\n\n\tjava.lang.Boolean test_ft242 = false;\n\n\t\n{\n\n\tkermeta.standard.Iterator<ecore.EStringToStringMapEntry> it_ft242 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EStringToStringMapEntry>convertAsOrderedSet(a_lbdExp241.getDetails()).iterator();\n\tjava.lang.Boolean idLoopCond_1071 = false;\n\twhile( !idLoopCond_1071 ) {\n\tidLoopCond_1071 = kermeta.standard.helper.BooleanWrapper.or(it_ft242.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(test_ft242, false));\n\tif ( idLoopCond_1071 ) {\n\t} else {\n\njava.lang.Boolean result_lambda_ft242 = null;\n//BIle:func\necore.EStringToStringMapEntry d_lbdExp242 = it_ft242.next();\n\n\tresult_lambda_ft242 = kermeta.standard.helper.StringWrapper.equals(d_lbdExp242.getKey(), \"body\");\n//EIle:func\n\n\ttest_ft242 = kermeta.standard.helper.BooleanWrapper.or(test_ft242, result_lambda_ft242);\n}\n\t}\n}\n\n\n\tresult_ft242 = test_ft242;\n//EIft:exists\nresult_lambda_ft241 = result = kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.StringWrapper.equals(a_lbdExp241.getSource(), \"http://www.eclipse.org/emf/2002/GenModel\"), result_ft242);\n//EIle:func\n\n\ttest_ft241 = kermeta.standard.helper.BooleanWrapper.or(test_ft241, result_lambda_ft241);\n}\n\t}\n}\n\n\n\tresult_ft241 = test_ft241;\n\n//CE\nresult = result_ft241;\n//EIft:exists\n\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean existsAnnotationGenModelImpl(EModelElement eModelElement);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model keyDataType="kermeta.standard.JavaString" valueDataType="kermeta.standard.JavaString"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tecore.EStringToStringMapEntry entry = ((ecore.EStringToStringMapEntry) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"ecore.EStringToStringMapEntry\"));\n\n\tentry.setKey(key);\n\n\tentry.setValue(value);\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EStringToStringMapEntry>convertAsOrderedSet(annotation.getDetails()).add(entry);\n'"
	 * @generated
	 */
	void addEntry(EAnnotation annotation, String key, String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model bodyDataType="kermeta.standard.JavaString"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tjava.lang.Boolean idIfCond_1072 = false;\n//BIft:andThen\n\njava.lang.Boolean result_ft243 = null;\n\n\tjava.lang.Boolean idIfCond_1073 = false;\n\tidIfCond_1073 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(eModelElement));\n\n\tif( idIfCond_1073 ) {\n\n\t//BIle:right\n/*This variable should be never used\052/ kermeta.language.structure.Object v_lbdExp243 = null;\n\n\tresult_ft243 = kermeta.standard.helper.BooleanWrapper.not(this.existsAnnotationGenModelImpl(eModelElement));\n//EIle:right\n\n}\n else {\n\n\tresult_ft243 = false;\n}\n\n\n//CEC\nidIfCond_1072 = result_ft243;\n//EIft:andThen\n\n\n\tif( idIfCond_1072 ) {\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EAnnotation>convertAsOrderedSet(eModelElement.getEAnnotations()).add(this.create(\"http://www.eclipse.org/emf/2002/GenModel\", \"body\", body));\n}\n\n'"
	 * @generated
	 */
	void addAnnotationGenModelImpl(EModelElement eModelElement, String body);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\necore.EAnnotation result = null;\n\n\tresult = null;\n\n\tjava.lang.Boolean idIfCond_1074 = false;\n\tidIfCond_1074 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(obj)));\n\n\tif( idIfCond_1074 ) {\n\n\tkermeta.language.structure.Property ecoreMEProp = org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(obj).getPropertyValue(\"ecoreModelElement\");\n\n\tjava.lang.Boolean idIfCond_1075 = false;\n\tidIfCond_1075 = kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(ecoreMEProp)), kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.getSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(obj), ecoreMEProp))));\n\n\tif( idIfCond_1075 ) {\n\n\t//BIft:detect\n\necore.EAnnotation result_ft244 = null;\n\n\tecore.EAnnotation elem_ft244 = null;\n\n\tresult_ft244 = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<ecore.EAnnotation> it_ft244 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EAnnotation>convertAsOrderedSet(((ecore.EModelElement) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.getSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(obj), ecoreMEProp), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"ecore.EModelElement\"))).getEAnnotations()).iterator();\n\tjava.lang.Boolean idLoopCond_1076 = false;\n\twhile( !idLoopCond_1076 ) {\n\tidLoopCond_1076 = kermeta.standard.helper.BooleanWrapper.or(it_ft244.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(result_ft244, null));\n\tif ( idLoopCond_1076 ) {\n\t} else {\n\n\telem_ft244 = it_ft244.next();\n\n\tjava.lang.Boolean idIfCond_1077 = false;\n//BIle:detector\necore.EAnnotation t_lbdExp244 = elem_ft244;\n\n\tidIfCond_1077 = kermeta.standard.helper.StringWrapper.equals(t_lbdExp244.getSource(), kermeta.standard.helper.StringWrapper.toString(km2ecore.helper.ecore.KermetaEAnnotationSource.getByName(\"kermeta\").getName()));\n//EIle:detector\n\n\n\tif( idIfCond_1077 ) {\n\n\tresult_ft244 = elem_ft244;\n}\n\n}\n\t}\n}\n\n\n//CE\nresult = result_ft244;\n//EIft:detect\n\n\n\tjava.lang.Boolean idIfCond_1078 = false;\n\tidIfCond_1078 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(result);\n\n\tif( idIfCond_1078 ) {\n\n\tresult = this.getEmptyKermetaEAnnotation();\n}\n\n}\n\n}\n else {\n\n\tresult = this.getEmptyKermetaEAnnotation();\n}\n\n\n\tresult = this.getEmptyKermetaEAnnotation();\n\nreturn result;\n'"
	 * @generated
	 */
	EAnnotation getKermetaEAnnotation(kermeta.language.structure.Object obj);

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
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\necore.EAnnotation result = null;\n\n\tresult = this.createKermetaEAnnotation(kermeta.standard.helper.StringWrapper.toString(km2ecore.helper.ecore.KermetaEAnnotationKey.getByName(\"isAbstract\").getName()), \"true\");\n\nreturn result;\n'"
	 * @generated
	 */
	EAnnotation createAbstract();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\necore.EAnnotation result = null;\n\n\tecore.EAnnotation annotation = ((ecore.EAnnotation) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"ecore.EAnnotation\"));\n\n\tannotation.setSource(kermeta.standard.helper.StringWrapper.toString(km2ecore.helper.ecore.KermetaEAnnotationSource.getByName(\"kermeta\").getName()));\n\n\tresult = annotation;\n\nreturn result;\n'"
	 * @generated
	 */
	EAnnotation getEmptyKermetaEAnnotation();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model bodyDataType="kermeta.standard.JavaString"
	 *        annotation="kermeta documentation='/**\n\t * Not used\n\t \052/'"
	 *        annotation="kermeta deprecated='true'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tjava.lang.Boolean idIfCond_1079 = false;\n\tidIfCond_1079 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(eModelElement));\n\n\tif( idIfCond_1079 ) {\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EAnnotation>convertAsOrderedSet(eModelElement.getEAnnotations()).add(this.create(\"kompiledderivedProp.setter\", \"body\", body));\n}\n\n'"
	 * @generated
	 */
	void addAnnotationPropSetter(EModelElement eModelElement, String body);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model sourceDataType="kermeta.standard.JavaString" keyDataType="kermeta.standard.JavaString" valueDataType="kermeta.standard.JavaString"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\necore.EAnnotation result = null;\n\n\tecore.EAnnotation annotation = this.createEmpty(source);\n\n\tthis.addEntry(annotation, key, value);\n\n\tresult = annotation;\n\nreturn result;\n'"
	 * @generated
	 */
	EAnnotation create(String source, String key, String value);

} // EAnnotationHelper
