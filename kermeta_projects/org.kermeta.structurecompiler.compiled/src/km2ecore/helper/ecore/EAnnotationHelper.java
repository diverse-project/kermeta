/**
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * 
 * Generating with Kermeta <http://www.kermeta.org>
 *
 * $Id: EAnnotationHelper.java,v 1.11 2009-02-10 17:51:58 cfaucher Exp $
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tjava.lang.Boolean idIfCond_42 = false;\n\tidIfCond_42 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(eModelElement));\n\n\tif( idIfCond_42 ) {\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EAnnotation>convertAsOrderedSet(eModelElement.getEAnnotations()).add(this.create(\"kompiledderivedProp.getter\", \"body\", body));\n}\n\n'"
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\t//BIft:exists\n\njava.lang.Boolean result_ft7 = null;\n\n\tjava.lang.Boolean test_ft7 = false;\n\n\t\n{\n\n\tkermeta.standard.Iterator<ecore.EAnnotation> it_ft7 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EAnnotation>convertAsOrderedSet(eModelElement.getEAnnotations()).iterator();\n\tjava.lang.Boolean idLoopCond_43 = false;\n\twhile( !idLoopCond_43 ) {\n\tidLoopCond_43 = kermeta.standard.helper.BooleanWrapper.or(it_ft7.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(test_ft7, false));\n\tif ( idLoopCond_43 ) {\n\t} else {\n\njava.lang.Boolean result_lambda_ft7 = null;\n//BIle:func\necore.EAnnotation a_lbdExp7 = it_ft7.next();\n\n\t//BIft:exists\n\njava.lang.Boolean result_ft8 = null;\n\n\tjava.lang.Boolean test_ft8 = false;\n\n\t\n{\n\n\tkermeta.standard.Iterator<ecore.EStringToStringMapEntry> it_ft8 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EStringToStringMapEntry>convertAsOrderedSet(a_lbdExp7.getDetails()).iterator();\n\tjava.lang.Boolean idLoopCond_44 = false;\n\twhile( !idLoopCond_44 ) {\n\tidLoopCond_44 = kermeta.standard.helper.BooleanWrapper.or(it_ft8.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(test_ft8, false));\n\tif ( idLoopCond_44 ) {\n\t} else {\n\njava.lang.Boolean result_lambda_ft8 = null;\n//BIle:func\necore.EStringToStringMapEntry d_lbdExp8 = it_ft8.next();\n\n\tresult_lambda_ft8 = kermeta.standard.helper.StringWrapper.equals(d_lbdExp8.getKey(), \"body\");\n//EIle:func\n\n\ttest_ft8 = kermeta.standard.helper.BooleanWrapper.or(test_ft8, result_lambda_ft8);\n}\n\t}\n}\n\n\n\tresult_ft8 = test_ft8;\n//EIft:exists\nresult_lambda_ft7 = result = kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.StringWrapper.equals(a_lbdExp7.getSource(), \"http://www.eclipse.org/emf/2002/GenModel\"), result_ft8);\n//EIle:func\n\n\ttest_ft7 = kermeta.standard.helper.BooleanWrapper.or(test_ft7, result_lambda_ft7);\n}\n\t}\n}\n\n\n\tresult_ft7 = test_ft7;\n\n//CE\nresult = result_ft7;\n//EIft:exists\n\n\nreturn result;\n'"
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tjava.lang.Boolean idIfCond_45 = false;\n//BIft:andThen\n\njava.lang.Boolean result_ft9 = null;\n\n\tjava.lang.Boolean idIfCond_46 = false;\n\tidIfCond_46 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(eModelElement));\n\n\tif( idIfCond_46 ) {\n\n\t//BIle:right\n/*This variable should be never used\052/ kermeta.language.structure.Object v_lbdExp9 = null;\n\n\tresult_ft9 = kermeta.standard.helper.BooleanWrapper.not(this.existsAnnotationGenModelImpl(eModelElement));\n//EIle:right\n\n}\n else {\n\n\tresult_ft9 = false;\n}\n\n\n//CEC\nidIfCond_45 = result_ft9;\n//EIft:andThen\n\n\n\tif( idIfCond_45 ) {\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EAnnotation>convertAsOrderedSet(eModelElement.getEAnnotations()).add(this.create(\"http://www.eclipse.org/emf/2002/GenModel\", \"body\", body));\n}\n\n'"
	 * @generated
	 */
	void addAnnotationGenModelImpl(EModelElement eModelElement, String body);

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
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\necore.EAnnotation result = null;\n\n\tresult = null;\n\n\tjava.lang.Boolean idIfCond_47 = false;\n\tidIfCond_47 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(obj)));\n\n\tif( idIfCond_47 ) {\n\n\tkermeta.language.structure.Property ecoreMEProp = org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(obj).getPropertyValue(\"ecoreModelElement\");\n\n\tjava.lang.Boolean idIfCond_48 = false;\n\tidIfCond_48 = kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(ecoreMEProp)), kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.getSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(obj), ecoreMEProp))));\n\n\tif( idIfCond_48 ) {\n\n\t//BIft:detect\n\necore.EAnnotation result_ft10 = null;\n\n\tecore.EAnnotation elem_ft10 = null;\n\n\tresult_ft10 = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<ecore.EAnnotation> it_ft10 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EAnnotation>convertAsOrderedSet(((ecore.EModelElement) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.getSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(obj), ecoreMEProp), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"ecore.EModelElement\"))).getEAnnotations()).iterator();\n\tjava.lang.Boolean idLoopCond_49 = false;\n\twhile( !idLoopCond_49 ) {\n\tidLoopCond_49 = kermeta.standard.helper.BooleanWrapper.or(it_ft10.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(result_ft10, null));\n\tif ( idLoopCond_49 ) {\n\t} else {\n\n\telem_ft10 = it_ft10.next();\n\n\tjava.lang.Boolean idIfCond_50 = false;\n//BIle:detector\necore.EAnnotation t_lbdExp10 = elem_ft10;\n\n\tidIfCond_50 = kermeta.standard.helper.StringWrapper.equals(t_lbdExp10.getSource(), kermeta.standard.helper.StringWrapper.toString(km2ecore.helper.ecore.KermetaEAnnotationSource.getByName(\"kermeta\").getName()));\n//EIle:detector\n\n\n\tif( idIfCond_50 ) {\n\n\tresult_ft10 = elem_ft10;\n}\n\n}\n\t}\n}\n\n\n//CE\nresult = result_ft10;\n//EIft:detect\n\n\n\tjava.lang.Boolean idIfCond_51 = false;\n\tidIfCond_51 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(result);\n\n\tif( idIfCond_51 ) {\n\n\tresult = this.getEmptyKermetaEAnnotation();\n}\n\n}\n\n}\n else {\n\n\tresult = this.getEmptyKermetaEAnnotation();\n}\n\n\n\tresult = this.getEmptyKermetaEAnnotation();\n\nreturn result;\n'"
	 * @generated
	 */
	EAnnotation getKermetaEAnnotation(kermeta.language.structure.Object obj);

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
	 * @model bodyDataType="kermeta.standard.JavaString"
	 *        annotation="kermeta documentation='/**\r\n\t * Not used\r\n\t \052/'"
	 *        annotation="kermeta deprecated='true'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tjava.lang.Boolean idIfCond_52 = false;\n\tidIfCond_52 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(eModelElement));\n\n\tif( idIfCond_52 ) {\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EAnnotation>convertAsOrderedSet(eModelElement.getEAnnotations()).add(this.create(\"kompiledderivedProp.setter\", \"body\", body));\n}\n\n'"
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
