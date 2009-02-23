/**
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * 
 * Generating with Kermeta <http://www.kermeta.org>
 *
 * $Id: GenericTypeDefinitionHelper.java,v 1.12 2009-02-23 15:26:55 cfaucher Exp $
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\necore.EClass result = null;\n\n\tecore.EClass specialType = null;\n\n\tjava.lang.String name_KermetaSspecialType = \"KermetaSpecialTypesAlias\";\n\n\tecore.EClassifier retrieveSpecialType = null;\n\n\t//BIft:detect\n\necore.EClassifier result_ft6 = null;\n\n\tecore.EClassifier elem_ft6 = null;\n\n\tresult_ft6 = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<ecore.EClassifier> it_ft6 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EClassifier>convertAsOrderedSet(p.getEcoreModelElement().getEClassifiers()).iterator();\n\tjava.lang.Boolean idLoopCond_25 = false;\n\twhile( !idLoopCond_25 ) {\n\tidLoopCond_25 = kermeta.standard.helper.BooleanWrapper.or(it_ft6.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(result_ft6, null));\n\tif ( idLoopCond_25 ) {\n\t} else {\n\n\telem_ft6 = it_ft6.next();\n\n\tjava.lang.Boolean idIfCond_26 = false;\n//BIle:detector\necore.EClassifier c_lbdExp6 = elem_ft6;\n\n\tidIfCond_26 = kermeta.standard.helper.BooleanWrapper.and(org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(c_lbdExp6, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"ecore.EClass\")), kermeta.standard.helper.StringWrapper.equals(c_lbdExp6.getName(), name_KermetaSspecialType));\n//EIle:detector\n\n\n\tif( idIfCond_26 ) {\n\n\tresult_ft6 = elem_ft6;\n}\n\n}\n\t}\n}\n\n\n//CE\nretrieveSpecialType = result_ft6;\n//EIft:detect\n\n\n\tjava.lang.Boolean idIfCond_27 = false;\n\tidIfCond_27 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(retrieveSpecialType));\n\n\tif( idIfCond_27 ) {\n\n\tresult = ((ecore.EClass) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(retrieveSpecialType, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"ecore.EClass\")));\n}\n else {\n\n\tspecialType = ((ecore.EClass) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(ecore.EcorePackage.eINSTANCE.getEClass()));\n\n\tspecialType.setName(name_KermetaSspecialType);\n\n\tspecialType.setInstanceClassName(\"org.eclipse.emf.ecore.EObject\");\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EClassifier>convertAsOrderedSet(p.getEcoreModelElement().getEClassifiers()).add(specialType);\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EAnnotation>convertAsOrderedSet(specialType.getEAnnotations()).add(((km2ecore.helper.ecore.EAnnotationHelper) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(km2ecore.helper.ecore.EcorePackage.eINSTANCE.getEAnnotationHelper())).createKermetaEAnnotation(kermeta.standard.helper.StringWrapper.toString(km2ecore.helper.ecore.KermetaEAnnotationKey.getByName(\"alias\").getName()), \"KermetaSpecialTypesAlias\"));\n\n\tresult = specialType;\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	EClass getKermetaSpecialType(kermeta.language.structure.Package p);

} // GenericTypeDefinitionHelper
