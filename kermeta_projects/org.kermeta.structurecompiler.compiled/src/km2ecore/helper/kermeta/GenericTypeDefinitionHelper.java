/**
 * <copyright>
 * </copyright>
 *
 * $Id: GenericTypeDefinitionHelper.java,v 1.5 2008-10-16 13:18:18 cfaucher Exp $
 */
package km2ecore.helper.kermeta;

import ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generic Type Definition Helper</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see km2ecore.helper.kermeta.KermetaPackage#getGenericTypeDefinitionHelper()
 * @model
 * @generated
 */
public interface GenericTypeDefinitionHelper extends
		kermeta.language.structure.Object {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\n\t * FIXME CF: this method should be deprecated, because the function type are included in the resulted Ecore\n\t * or we could create only the signature of the method\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\necore.EClass result = null;\n\n\tecore.EClass specialType = null;\n\n\tjava.lang.String name_KermetaSspecialType = \"KermetaSpecialTypesAlias\";\n\n\tecore.EClassifier retrieveSpecialType = null;\n\n\t//BIft:detect\n\necore.EClassifier result_ft10 = null;\n\n\tecore.EClassifier elem_ft10 = null;\n\n\tresult_ft10 = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<ecore.EClassifier> it_ft10 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EClassifier>convertAsOrderedSet(p.getEcoreModelElement().getEClassifiers()).iterator();\n\tjava.lang.Boolean idLoopCond_46 = false;\n\twhile( !idLoopCond_46 ) {\n\tidLoopCond_46 = kermeta.standard.helper.BooleanWrapper.or(it_ft10.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqual(result_ft10, null));\n\tif ( idLoopCond_46 ) {\n\t} else {\n\n\telem_ft10 = it_ft10.next();\n\n\tjava.lang.Boolean idIfCond_47 = false;\n//BIle:detector\necore.EClassifier c_lbdExp10 = elem_ft10;\n\n\tidIfCond_47 = kermeta.standard.helper.BooleanWrapper.and(org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOf(c_lbdExp10, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"ecore.EClass\")), kermeta.standard.helper.StringWrapper.equals(c_lbdExp10.getName(), name_KermetaSspecialType));\n//EIle:detector\n\n\n\tif( idIfCond_47 ) {\n\n\tresult_ft10 = elem_ft10;\n}\n\n}\n\t}\n}\n\n\n//CE\nretrieveSpecialType = result_ft10;\n//EIft:detect\n\n\n\tjava.lang.Boolean idIfCond_48 = false;\n\tidIfCond_48 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoid(retrieveSpecialType));\n\n\tif( idIfCond_48 ) {\n\n\tresult = ((ecore.EClass) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(retrieveSpecialType, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"ecore.EClass\")));\n}\n else {\n\n\tspecialType = ((ecore.EClass) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"ecore.EClass\"));\n\n\tspecialType.setName(name_KermetaSspecialType);\n\n\tspecialType.setInstanceClassName(\"org.eclipse.emf.ecore.EObject\");\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EClassifier>convertAsOrderedSet(p.getEcoreModelElement().getEClassifiers()).add(specialType);\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EAnnotation>convertAsOrderedSet(specialType.getEAnnotations()).add(((km2ecore.helper.ecore.EAnnotationHelper) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"km2ecore.helper.ecore.EAnnotationHelper\")).createKermetaEAnnotation(kermeta.standard.helper.StringWrapper.toString(km2ecore.helper.ecore.KermetaEAnnotationKey.getByName(\"alias\").getName()), \"KermetaSpecialTypesAlias\"));\n\n\tresult = specialType;\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	EClass getKermetaSpecialType(kermeta.language.structure.Package p);

} // GenericTypeDefinitionHelper
