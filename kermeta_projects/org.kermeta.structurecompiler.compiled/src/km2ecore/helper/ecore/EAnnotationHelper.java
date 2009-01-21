/**
 * <copyright>
 * </copyright>
 *
 * $Id: EAnnotationHelper.java,v 1.10 2009-01-21 09:16:05 cfaucher Exp $
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tjava.lang.Boolean idIfCond_1105 = false;\n\tidIfCond_1105 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(eModelElement));\n\n\tif( idIfCond_1105 ) {\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EAnnotation>convertAsOrderedSet(eModelElement.getEAnnotations()).add(this.create(\"kompiledderivedProp.getter\", \"body\", body));\n}\n\n'"
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\t//BIft:exists\n\njava.lang.Boolean result_ft251 = null;\n\n\tjava.lang.Boolean test_ft251 = false;\n\n\t\n{\n\n\tkermeta.standard.Iterator<ecore.EAnnotation> it_ft251 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EAnnotation>convertAsOrderedSet(eModelElement.getEAnnotations()).iterator();\n\tjava.lang.Boolean idLoopCond_1106 = false;\n\twhile( !idLoopCond_1106 ) {\n\tidLoopCond_1106 = kermeta.standard.helper.BooleanWrapper.or(it_ft251.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(test_ft251, false));\n\tif ( idLoopCond_1106 ) {\n\t} else {\n\njava.lang.Boolean result_lambda_ft251 = null;\n//BIle:func\necore.EAnnotation a_lbdExp251 = it_ft251.next();\n\n\t//BIft:exists\n\njava.lang.Boolean result_ft252 = null;\n\n\tjava.lang.Boolean test_ft252 = false;\n\n\t\n{\n\n\tkermeta.standard.Iterator<ecore.EStringToStringMapEntry> it_ft252 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EStringToStringMapEntry>convertAsOrderedSet(a_lbdExp251.getDetails()).iterator();\n\tjava.lang.Boolean idLoopCond_1107 = false;\n\twhile( !idLoopCond_1107 ) {\n\tidLoopCond_1107 = kermeta.standard.helper.BooleanWrapper.or(it_ft252.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(test_ft252, false));\n\tif ( idLoopCond_1107 ) {\n\t} else {\n\njava.lang.Boolean result_lambda_ft252 = null;\n//BIle:func\necore.EStringToStringMapEntry d_lbdExp252 = it_ft252.next();\n\n\tresult_lambda_ft252 = kermeta.standard.helper.StringWrapper.equals(d_lbdExp252.getKey(), \"body\");\n//EIle:func\n\n\ttest_ft252 = kermeta.standard.helper.BooleanWrapper.or(test_ft252, result_lambda_ft252);\n}\n\t}\n}\n\n\n\tresult_ft252 = test_ft252;\n//EIft:exists\nresult_lambda_ft251 = result = kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.StringWrapper.equals(a_lbdExp251.getSource(), \"http://www.eclipse.org/emf/2002/GenModel\"), result_ft252);\n//EIle:func\n\n\ttest_ft251 = kermeta.standard.helper.BooleanWrapper.or(test_ft251, result_lambda_ft251);\n}\n\t}\n}\n\n\n\tresult_ft251 = test_ft251;\n\n//CE\nresult = result_ft251;\n//EIft:exists\n\n\nreturn result;\n'"
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tjava.lang.Boolean idIfCond_1108 = false;\n//BIft:andThen\n\njava.lang.Boolean result_ft253 = null;\n\n\tjava.lang.Boolean idIfCond_1109 = false;\n\tidIfCond_1109 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(eModelElement));\n\n\tif( idIfCond_1109 ) {\n\n\t//BIle:right\n/*This variable should be never used\052/ kermeta.language.structure.Object v_lbdExp253 = null;\n\n\tresult_ft253 = kermeta.standard.helper.BooleanWrapper.not(this.existsAnnotationGenModelImpl(eModelElement));\n//EIle:right\n\n}\n else {\n\n\tresult_ft253 = false;\n}\n\n\n//CEC\nidIfCond_1108 = result_ft253;\n//EIft:andThen\n\n\n\tif( idIfCond_1108 ) {\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EAnnotation>convertAsOrderedSet(eModelElement.getEAnnotations()).add(this.create(\"http://www.eclipse.org/emf/2002/GenModel\", \"body\", body));\n}\n\n'"
	 * @generated
	 */
	void addAnnotationGenModelImpl(EModelElement eModelElement, String body);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\necore.EAnnotation result = null;\n\n\tresult = null;\n\n\tjava.lang.Boolean idIfCond_1110 = false;\n\tidIfCond_1110 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(obj)));\n\n\tif( idIfCond_1110 ) {\n\n\tkermeta.language.structure.Property ecoreMEProp = org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(obj).getPropertyValue(\"ecoreModelElement\");\n\n\tjava.lang.Boolean idIfCond_1111 = false;\n\tidIfCond_1111 = kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(ecoreMEProp)), kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.getSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(obj), ecoreMEProp))));\n\n\tif( idIfCond_1111 ) {\n\n\t//BIft:detect\n\necore.EAnnotation result_ft254 = null;\n\n\tecore.EAnnotation elem_ft254 = null;\n\n\tresult_ft254 = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<ecore.EAnnotation> it_ft254 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EAnnotation>convertAsOrderedSet(((ecore.EModelElement) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.getSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(obj), ecoreMEProp), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"ecore.EModelElement\"))).getEAnnotations()).iterator();\n\tjava.lang.Boolean idLoopCond_1112 = false;\n\twhile( !idLoopCond_1112 ) {\n\tidLoopCond_1112 = kermeta.standard.helper.BooleanWrapper.or(it_ft254.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(result_ft254, null));\n\tif ( idLoopCond_1112 ) {\n\t} else {\n\n\telem_ft254 = it_ft254.next();\n\n\tjava.lang.Boolean idIfCond_1113 = false;\n//BIle:detector\necore.EAnnotation t_lbdExp254 = elem_ft254;\n\n\tidIfCond_1113 = kermeta.standard.helper.StringWrapper.equals(t_lbdExp254.getSource(), kermeta.standard.helper.StringWrapper.toString(km2ecore.helper.ecore.KermetaEAnnotationSource.getByName(\"kermeta\").getName()));\n//EIle:detector\n\n\n\tif( idIfCond_1113 ) {\n\n\tresult_ft254 = elem_ft254;\n}\n\n}\n\t}\n}\n\n\n//CE\nresult = result_ft254;\n//EIft:detect\n\n\n\tjava.lang.Boolean idIfCond_1114 = false;\n\tidIfCond_1114 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(result);\n\n\tif( idIfCond_1114 ) {\n\n\tresult = this.getEmptyKermetaEAnnotation();\n}\n\n}\n\n}\n else {\n\n\tresult = this.getEmptyKermetaEAnnotation();\n}\n\n\n\tresult = this.getEmptyKermetaEAnnotation();\n\nreturn result;\n'"
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tjava.lang.Boolean idIfCond_1115 = false;\n\tidIfCond_1115 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(eModelElement));\n\n\tif( idIfCond_1115 ) {\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EAnnotation>convertAsOrderedSet(eModelElement.getEAnnotations()).add(this.create(\"kompiledderivedProp.setter\", \"body\", body));\n}\n\n'"
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
