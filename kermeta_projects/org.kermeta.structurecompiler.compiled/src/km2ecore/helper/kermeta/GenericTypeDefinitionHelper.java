/**
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * 
 * Generating with Kermeta <http://www.kermeta.org>
 *
 * $Id: GenericTypeDefinitionHelper.java,v 1.11 2009-02-10 17:51:59 cfaucher Exp $
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
	 * @model annotation="kermeta documentation='/**\r\n\t * FIXME CF: this method should be deprecated, because the function type are included in the resulted Ecore\r\n\t * or we could create only the signature of the method\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\necore.EClass result = null;\n\n\tecore.EClass specialType = null;\n\n\tjava.lang.String name_KermetaSspecialType = \"KermetaSpecialTypesAlias\";\n\n\tecore.EClassifier retrieveSpecialType = null;\n\n\t//BIft:detect\n\necore.EClassifier result_ft2 = null;\n\n\tecore.EClassifier elem_ft2 = null;\n\n\tresult_ft2 = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<ecore.EClassifier> it_ft2 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EClassifier>convertAsOrderedSet(p.getEcoreModelElement().getEClassifiers()).iterator();\n\tjava.lang.Boolean idLoopCond_11 = false;\n\twhile( !idLoopCond_11 ) {\n\tidLoopCond_11 = kermeta.standard.helper.BooleanWrapper.or(it_ft2.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(result_ft2, null));\n\tif ( idLoopCond_11 ) {\n\t} else {\n\n\telem_ft2 = it_ft2.next();\n\n\tjava.lang.Boolean idIfCond_12 = false;\n//BIle:detector\necore.EClassifier c_lbdExp2 = elem_ft2;\n\n\tidIfCond_12 = kermeta.standard.helper.BooleanWrapper.and(org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(c_lbdExp2, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"ecore.EClass\")), kermeta.standard.helper.StringWrapper.equals(c_lbdExp2.getName(), name_KermetaSspecialType));\n//EIle:detector\n\n\n\tif( idIfCond_12 ) {\n\n\tresult_ft2 = elem_ft2;\n}\n\n}\n\t}\n}\n\n\n//CE\nretrieveSpecialType = result_ft2;\n//EIft:detect\n\n\n\tjava.lang.Boolean idIfCond_13 = false;\n\tidIfCond_13 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(retrieveSpecialType));\n\n\tif( idIfCond_13 ) {\n\n\tresult = ((ecore.EClass) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(retrieveSpecialType, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"ecore.EClass\")));\n}\n else {\n\n\tspecialType = ((ecore.EClass) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(ecore.EcorePackage.eINSTANCE.getEClass()));\n\n\tspecialType.setName(name_KermetaSspecialType);\n\n\tspecialType.setInstanceClassName(\"org.eclipse.emf.ecore.EObject\");\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EClassifier>convertAsOrderedSet(p.getEcoreModelElement().getEClassifiers()).add(specialType);\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EAnnotation>convertAsOrderedSet(specialType.getEAnnotations()).add(((km2ecore.helper.ecore.EAnnotationHelper) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(km2ecore.helper.ecore.EcorePackage.eINSTANCE.getEAnnotationHelper())).createKermetaEAnnotation(kermeta.standard.helper.StringWrapper.toString(km2ecore.helper.ecore.KermetaEAnnotationKey.getByName(\"alias\").getName()), \"KermetaSpecialTypesAlias\"));\n\n\tresult = specialType;\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	EClass getKermetaSpecialType(kermeta.language.structure.Package p);

} // GenericTypeDefinitionHelper
