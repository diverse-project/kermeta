/**
 * <copyright>
 * </copyright>
 *
 * $Id: EAnnotationHelper.java,v 1.3 2008-09-22 14:49:08 cfaucher Exp $
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tjava.lang.Boolean idIfCond_995 = false;\n\tidIfCond_995 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoid(eModelElement));\n\n\tif( idIfCond_995 ) {\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EAnnotation>convertAsOrderedSet(eModelElement.getEAnnotations()).add(this.create(\"kompiledderivedProp.getter\", \"body\", body));\n}\n\n'"
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\t//BIft:exists\n\njava.lang.Boolean result_ft232 = null;\n\n\tjava.lang.Boolean test_ft232 = false;\n\n\t\n{\n\n\tkermeta.standard.Iterator<ecore.EAnnotation> it_ft232 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EAnnotation>convertAsOrderedSet(eModelElement.getEAnnotations()).iterator();\n\tjava.lang.Boolean idLoopCond_996 = false;\n\twhile( !idLoopCond_996 ) {\n\tidLoopCond_996 = kermeta.standard.helper.BooleanWrapper.or(it_ft232.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqual(test_ft232, false));\n\tif ( idLoopCond_996 ) {\n\t} else {\n\njava.lang.Boolean result_lambda_ft232 = null;\n//BIle:func\necore.EAnnotation a_lbdExp232 = it_ft232.next();\n\n\tresult_lambda_ft232 = //BIft:exists\n\njava.lang.Boolean result_ft233 = null;\n\n\tjava.lang.Boolean test_ft233 = false;\n\n\t\n{\n\n\tkermeta.standard.Iterator<ecore.EStringToStringMapEntry> it_ft233 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EStringToStringMapEntry>convertAsOrderedSet(a_lbdExp232.getDetails()).iterator();\n\tjava.lang.Boolean idLoopCond_997 = false;\n\twhile( !idLoopCond_997 ) {\n\tidLoopCond_997 = kermeta.standard.helper.BooleanWrapper.or(it_ft233.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqual(test_ft233, false));\n\tif ( idLoopCond_997 ) {\n\t} else {\n\njava.lang.Boolean result_lambda_ft233 = null;\n//BIle:func\necore.EStringToStringMapEntry d_lbdExp233 = it_ft233.next();\n\n\tresult_lambda_ft233 = kermeta.standard.helper.StringWrapper.equals(d_lbdExp233.getKey(), \"body\");\n//EIle:func\n\n\ttest_ft233 = kermeta.standard.helper.BooleanWrapper.or(test_ft233, result_lambda_ft233);\n}\n\t}\n}\n\n\n\tresult_ft233 = test_ft233;\n//EIft:exists\nkermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.StringWrapper.equals(a_lbdExp232.getSource(), \"http://www.eclipse.org/emf/2002/GenModel\"), result_ft233);\n//EIle:func\n\n\ttest_ft232 = kermeta.standard.helper.BooleanWrapper.or(test_ft232, result_lambda_ft232);\n}\n\t}\n}\n\n\n\tresult_ft232 = test_ft232;\n\n//CE\nresult = result_ft232;\n//EIft:exists\n\n\nreturn result;\n'"
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tjava.lang.Boolean idIfCond_998 = false;\n//BIft:andThen\n\njava.lang.Boolean result_ft234 = null;\n\n\tjava.lang.Boolean idIfCond_999 = false;\n\tidIfCond_999 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoid(eModelElement));\n\n\tif( idIfCond_999 ) {\n\n\t//BIle:right\n/*This variable should be never used\052/ kermeta.language.structure.Object v_lbdExp234 = null;\n\n\tresult_ft234 = kermeta.standard.helper.BooleanWrapper.not(this.existsAnnotationGenModelImpl(eModelElement));\n//EIle:right\n\n}\n else {\n\n\tresult_ft234 = false;\n}\n\n\n//CEC\nidIfCond_998 = result_ft234;\n//EIft:andThen\n\n\n\tif( idIfCond_998 ) {\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EAnnotation>convertAsOrderedSet(eModelElement.getEAnnotations()).add(this.create(\"http://www.eclipse.org/emf/2002/GenModel\", \"body\", body));\n}\n\n'"
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
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\necore.EAnnotation result = null;\n\n\tresult = this.createKermetaEAnnotation(kermeta.standard.helper.StringWrapper.toString(km2ecore.helper.ecore.KermetaEAnnotationKey.getByName(\"isAbstract\").getName()), \"true\");\n\nreturn result;\n'"
	 * @generated
	 */
	EAnnotation createAbstract();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\necore.EAnnotation result = null;\n\n\tresult = null;\n\n\tjava.lang.Boolean idIfCond_1000 = false;\n\tidIfCond_1000 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoid(org.kermeta.compil.runtime.helper.language.ObjectUtil.container(obj)));\n\n\tif( idIfCond_1000 ) {\n\n\tkermeta.language.structure.Property ecoreMEProp = org.kermeta.compil.runtime.helper.language.ObjectUtil.container(obj).getPropertyValue(\"ecoreModelElement\");\n\n\tjava.lang.Boolean idIfCond_1001 = false;\n\tidIfCond_1001 = kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoid(ecoreMEProp)), kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoid(org.kermeta.compil.runtime.helper.language.ObjectUtil.get(org.kermeta.compil.runtime.helper.language.ObjectUtil.container(obj), ecoreMEProp))));\n\n\tif( idIfCond_1001 ) {\n\n\t//BIft:detect\n\necore.EAnnotation result_ft235 = null;\n\n\tecore.EAnnotation elem_ft235 = null;\n\n\tresult_ft235 = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<ecore.EAnnotation> it_ft235 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EAnnotation>convertAsOrderedSet(((ecore.EModelElement) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(org.kermeta.compil.runtime.helper.language.ObjectUtil.get(org.kermeta.compil.runtime.helper.language.ObjectUtil.container(obj), ecoreMEProp), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"ecore.EModelElement\"))).getEAnnotations()).iterator();\n\tjava.lang.Boolean idLoopCond_1002 = false;\n\twhile( !idLoopCond_1002 ) {\n\tidLoopCond_1002 = kermeta.standard.helper.BooleanWrapper.or(it_ft235.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqual(result_ft235, null));\n\tif ( idLoopCond_1002 ) {\n\t} else {\n\n\telem_ft235 = it_ft235.next();\n\n\tjava.lang.Boolean idIfCond_1003 = false;\n//BIle:detector\necore.EAnnotation t_lbdExp235 = elem_ft235;\n\n\tidIfCond_1003 = kermeta.standard.helper.StringWrapper.equals(t_lbdExp235.getSource(), kermeta.standard.helper.StringWrapper.toString(km2ecore.helper.ecore.KermetaEAnnotationSource.getByName(\"kermeta\").getName()));\n//EIle:detector\n\n\n\tif( idIfCond_1003 ) {\n\n\tresult_ft235 = elem_ft235;\n}\n\n}\n\t}\n}\n\n\n//CE\nresult = result_ft235;\n//EIft:detect\n\n\n\tjava.lang.Boolean idIfCond_1004 = false;\n\tidIfCond_1004 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoid(result);\n\n\tif( idIfCond_1004 ) {\n\n\tresult = this.getEmptyKermetaEAnnotation();\n}\n\n}\n\n}\n else {\n\n\tresult = this.getEmptyKermetaEAnnotation();\n}\n\n\n\tresult = this.getEmptyKermetaEAnnotation();\n\nreturn result;\n'"
	 * @generated
	 */
	EAnnotation getKermetaEAnnotation(kermeta.language.structure.Object obj);

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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tjava.lang.Boolean idIfCond_1005 = false;\n\tidIfCond_1005 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoid(eModelElement));\n\n\tif( idIfCond_1005 ) {\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EAnnotation>convertAsOrderedSet(eModelElement.getEAnnotations()).add(this.create(\"kompiledderivedProp.setter\", \"body\", body));\n}\n\n'"
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
