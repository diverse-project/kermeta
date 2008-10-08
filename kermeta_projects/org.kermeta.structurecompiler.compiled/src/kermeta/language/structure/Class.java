/**
 * <copyright>
 * </copyright>
 *
 * $Id: Class.java,v 1.4 2008-10-08 14:37:43 cfaucher Exp $
 */
package kermeta.language.structure;

import ecore.EGenericType;

import kermeta.standard.Set;

import km2ecore.KM2EcoreContext;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see kermeta.language.structure.StructurePackage#getClass_()
 * @model annotation="kermeta documentation='Returns the Attributes, References, and derived Properties owned by\nthe ClassDefinition of this Class.'"
 * @generated
 */
public interface Class extends Traceability<EGenericType>, ParameterizedType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta superOperation='kermeta::language::structure::Type'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.language.structure.Object result = null;\n\n\tresult = org.kermeta.compil.runtime.helper.language.ClassUtil.cloneObject(this, objectToClone);\n\nreturn result;\n'"
	 * @generated
	 */
	kermeta.language.structure.Object clone(
			kermeta.language.structure.Object objectToClone);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\r\n\t * Instantiates a new occurence for this Class\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.language.structure.Object result = null;\n\n\tresult = org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(this.getClass().getName());\n\nreturn result;\n'"
	 * @generated
	 */
	kermeta.language.structure.Object _new();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta superOperation='kermeta::language::structure::Type'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.language.structure.Object result = null;\n\n\tresult = org.kermeta.compil.runtime.helper.language.ClassUtil.deepCloneObject(this, objectToClone);\n\nreturn result;\n'"
	 * @generated
	 */
	kermeta.language.structure.Object deepClone(
			kermeta.language.structure.Object objectToClone);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/** Never used for the moment \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.standard.Set<kermeta.language.structure.Property> result = null;\n\n\tkermeta.standard.Set<kermeta.language.structure.Property> properties = ((kermeta.standard.Set<kermeta.language.structure.Property>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.standard.Set<kermeta.language.structure.Property>\"));\n\n\t//BIft:select\n\nkermeta.standard.Sequence<kermeta.language.structure.Property> result_ft125 = null;\n\n\tkermeta.language.structure.Property elem_ft125 = null;\n\n\tresult_ft125 = ((kermeta.standard.Sequence<kermeta.language.structure.Property>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.standard.Sequence<kermeta.language.structure.Property>\"));\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Property> it_ft125 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Property>convertAsOrderedSet(this.getterOwnedAttribute()).iterator();\n\tjava.lang.Boolean idLoopCond_366 = false;\n\twhile( !idLoopCond_366 ) {\n\tidLoopCond_366 = it_ft125.isOff();\n\tif ( idLoopCond_366 ) {\n\t} else {\n\n\telem_ft125 = it_ft125.next();\n\n\tjava.lang.Boolean idIfCond_367 = false;\n//BIle:selector\nkermeta.language.structure.Property p_lbdExp125 = elem_ft125;\n\n\tidIfCond_367 = p_lbdExp125.getIsComposite();\n//EIle:selector\n\n\n\tif( idIfCond_367 ) {\n\n\tresult_ft125.add(elem_ft125);\n}\n\n}\n\t}\n}\n\n//EIft:select\nproperties.addAll(result_ft125);\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Class> it_ft126 = this.allSuperClasses().iterator();\n\tjava.lang.Boolean idLoopCond_368 = false;\n\twhile( !idLoopCond_368 ) {\n\tidLoopCond_368 = it_ft126.isOff();\n\tif ( idLoopCond_368 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Class s_lbdExp126 = it_ft126.next();\n\n\t//BIft:select\n\nkermeta.standard.Sequence<kermeta.language.structure.Property> result_ft127 = null;\n\n\tkermeta.language.structure.Property elem_ft127 = null;\n\n\tresult_ft127 = ((kermeta.standard.Sequence<kermeta.language.structure.Property>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.standard.Sequence<kermeta.language.structure.Property>\"));\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Property> it_ft127 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Property>convertAsOrderedSet(s_lbdExp126.getterOwnedAttribute()).iterator();\n\tjava.lang.Boolean idLoopCond_369 = false;\n\twhile( !idLoopCond_369 ) {\n\tidLoopCond_369 = it_ft127.isOff();\n\tif ( idLoopCond_369 ) {\n\t} else {\n\n\telem_ft127 = it_ft127.next();\n\n\tjava.lang.Boolean idIfCond_370 = false;\n//BIle:selector\nkermeta.language.structure.Property p_lbdExp127 = elem_ft127;\n\n\tidIfCond_370 = p_lbdExp127.getIsComposite();\n//EIle:selector\n\n\n\tif( idIfCond_370 ) {\n\n\tresult_ft127.add(elem_ft127);\n}\n\n}\n\t}\n}\n\n//EIft:select\nproperties.addAll(result_ft127);\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\tresult = properties;\n\nreturn result;\n'"
	 * @generated
	 */
	Set<Property> allAttributes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/** Never used for the moment \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.standard.Set<kermeta.language.structure.Class> result = null;\n\n\tkermeta.standard.Set<kermeta.language.structure.Class> allSuperClasses = ((kermeta.standard.Set<kermeta.language.structure.Class>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.standard.Set<kermeta.language.structure.Class>\"));\n\n\tkermeta.standard.Set<kermeta.language.structure.Class> superClasses = ((kermeta.standard.Set<kermeta.language.structure.Class>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.standard.Set<kermeta.language.structure.Class>\"));\n\n\tsuperClasses.addAll(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Class>convertAsSet(this.getterSuperClass()));\n\n\tkermeta.standard.Set<kermeta.language.structure.Class> temp = ((kermeta.standard.Set<kermeta.language.structure.Class>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.standard.Set<kermeta.language.structure.Class>\"));\n\n\t\n\tkermeta.standard.helper.BooleanWrapper.not(superClasses.isEmpty());\n\tjava.lang.Boolean idLoopCond_371 = false;\n\twhile( !idLoopCond_371 ) {\n\tidLoopCond_371 = superClasses.isEmpty();\n\tif ( idLoopCond_371 ) {\n\t} else {\n\n\tallSuperClasses.addAll(superClasses);\n\n\ttemp.clear();\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Class> it_ft128 = superClasses.iterator();\n\tjava.lang.Boolean idLoopCond_372 = false;\n\twhile( !idLoopCond_372 ) {\n\tidLoopCond_372 = it_ft128.isOff();\n\tif ( idLoopCond_372 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Class s_lbdExp128 = it_ft128.next();\n\n\ttemp.addAll(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Class>convertAsSet(s_lbdExp128.getterSuperClass()));\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\tsuperClasses.clear();\n\n\tsuperClasses.addAll(temp);\n}\n\t}\n\n\tresult = allSuperClasses;\n\nreturn result;\n'"
	 * @generated
	 */
	Set<Class> allSuperClasses();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaBoolean"
	 *        annotation="kermeta superOperation='kermeta::language::structure::Object'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = (java.lang.Boolean) org.kermeta.compil.runtime.helper.language.ClassUtil.equals(this, other);\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean equals(kermeta.language.structure.Object other);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.TypeVariableBinding> it_ft129 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.TypeVariableBinding>convertAsOrderedSet(this.getTypeParamBinding()).iterator();\n\tjava.lang.Boolean idLoopCond_373 = false;\n\twhile( !idLoopCond_373 ) {\n\tidLoopCond_373 = it_ft129.isOff();\n\tif ( idLoopCond_373 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.TypeVariableBinding tpb_lbdExp129 = it_ft129.next();\n\n\tecore.EGenericType typeArgument = ((ecore.EGenericType) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"ecore.EGenericType\"));\n\n\tjava.lang.Boolean idIfCond_374 = false;\n\tidIfCond_374 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOf(tpb_lbdExp129.getType(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Class\"));\n\n\tif( idIfCond_374 ) {\n\n\tkermeta.language.structure.ClassDefinition cd = ((kermeta.language.structure.Class) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(tpb_lbdExp129.getType(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Class\"))).getClassDefinitionAsTyped();\n\n\tjava.lang.Boolean idIfCond_375 = false;\n\tidIfCond_375 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoid(cd.getEcoreDataType());\n\n\tif( idIfCond_375 ) {\n\n\ttypeArgument.setEClassifier(cd.getEcoreModelElement());\n}\n else {\n\n\ttypeArgument.setEClassifier(cd.getEcoreDataType());\n}\n\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EGenericType>convertAsOrderedSet(this.getEcoreModelElement().getETypeArguments()).add(typeArgument);\n\n\t((kermeta.language.structure.Class) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(tpb_lbdExp129.getType(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Class\"))).setEcoreModelElement(typeArgument);\n\n\t((kermeta.language.structure.Class) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(tpb_lbdExp129.getType(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Class\"))).setLinks(context);\n}\n else {\n\n\tjava.lang.Boolean idIfCond_376 = false;\n\tidIfCond_376 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOf(tpb_lbdExp129.getType(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ObjectTypeVariable\"));\n\n\tif( idIfCond_376 ) {\n\n\tkermeta.language.structure.ObjectTypeVariable otv = ((kermeta.language.structure.ObjectTypeVariable) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(tpb_lbdExp129.getType(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ObjectTypeVariable\")));\n\n\ttypeArgument.setETypeParameter(otv.getEcoreModelElement());\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EGenericType>convertAsOrderedSet(this.getEcoreModelElement().getETypeArguments()).add(typeArgument);\n}\n else {\n\n\tjava.lang.Boolean idIfCond_377 = false;\n\tidIfCond_377 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOf(tpb_lbdExp129.getType(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.PrimitiveType\"));\n\n\tif( idIfCond_377 ) {\n\n\tkermeta.language.structure.ClassDefinition cd = tpb_lbdExp129.getType().getClassFromPrimitiveType().getClassDefinitionAsTyped();\n\n\tjava.lang.Boolean idIfCond_378 = false;\n\tidIfCond_378 = tpb_lbdExp129.getType().isEDataType();\n\n\tif( idIfCond_378 ) {\n\n\ttypeArgument.setEClassifier(((kermeta.language.structure.PrimitiveType) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(tpb_lbdExp129.getType(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.PrimitiveType\"))).getEcoreModelElement());\n}\n else {\n\n\tjava.lang.Boolean idIfCond_379 = false;\n\tidIfCond_379 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoid(cd.getEcoreDataType());\n\n\tif( idIfCond_379 ) {\n\n\ttypeArgument.setEClassifier(cd.getEcoreModelElement());\n}\n else {\n\n\ttypeArgument.setEClassifier(cd.getEcoreDataType());\n}\n\n}\n\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EGenericType>convertAsOrderedSet(this.getEcoreModelElement().getETypeArguments()).add(typeArgument);\n}\n else {\n\n\tjava.lang.Boolean idIfCond_380 = false;\n\tidIfCond_380 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOf(tpb_lbdExp129.getType(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.VoidType\"));\n\n\tif( idIfCond_380 ) {\n}\n\n}\n\n}\n\n}\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n'"
	 * @generated
	 */
	void setLinks(KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaString"
	 *        annotation="kermeta documentation='/**\r\n\t * Returns the String representation of this class. \r\n\t *  Note : throws an exception if this class has no classDefinition\r\n\t *  or if the classDefinition is not well constructed.\r\n\t \052/'"
	 *        annotation="kermeta superOperation='kermeta::language::structure::Object'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.String result = null;\n\n\tresult = this.getTypeDefinition().getName();\n\nreturn result;\n'"
	 * @generated
	 */
	String toString();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.standard.Set<kermeta.language.structure.Operation> result = null;\n{\n\n\tkermeta.language.structure.ClassDefinition cDef = null;\n\n\tcDef = (kermeta.language.structure.ClassDefinition) this.getTypeDefinition();\n\n\tresult = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Operation>convertAsOrderedSet(cDef.getOwnedOperation());\n}\nreturn org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.convertAsEList(result);\n'"
	 * @generated
	 */
	EList<Operation> getterOwnedOperation();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.standard.Set<kermeta.language.structure.Class> result = null;\n{\n\n\tkermeta.language.structure.ClassDefinition cDef = null;\n\n\tcDef = (kermeta.language.structure.ClassDefinition) this.getTypeDefinition();\n\n\tkermeta.standard.OrderedSet<kermeta.language.structure.Class> supertypes = ((kermeta.standard.OrderedSet<kermeta.language.structure.Class>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.standard.OrderedSet<kermeta.language.structure.Class>\"));\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Type> it_ft124 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Type>convertAsOrderedSet(cDef.getSuperType()).iterator();\n\tjava.lang.Boolean idLoopCond_364 = false;\n\twhile( !idLoopCond_364 ) {\n\tidLoopCond_364 = it_ft124.isOff();\n\tif ( idLoopCond_364 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Type elem_lbdExp124 = it_ft124.next();\n\n\tjava.lang.Boolean idIfCond_365 = false;\n\tidIfCond_365 = org.kermeta.compil.runtime.helper.language.TypeUtil.isInstance(org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Class\"), elem_lbdExp124);\n\n\tif( idIfCond_365 ) {\n\n\tkermeta.language.structure.Class c = null;\n\n\tc = (kermeta.language.structure.Class) elem_lbdExp124;\n\n\tsupertypes.add(c);\n}\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\tresult = supertypes;\n}\nreturn org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.convertAsEList(result);\n'"
	 * @generated
	 */
	EList<Class> getterSuperClass();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaBoolean"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n{\n\n\tkermeta.language.structure.ClassDefinition cDef = null;\n\n\tcDef = (kermeta.language.structure.ClassDefinition) this.getTypeDefinition();\n\n\tresult = cDef.getIsAbstract();\n}\nreturn result;\n'"
	 * @generated
	 */
	Boolean getterIsAbstract();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaString"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.String result = null;\n{\n\n\tresult = this.getTypeDefinition().getName();\n}\nreturn result;\n'"
	 * @generated
	 */
	String getterName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.language.structure.ClassDefinition result = null;\n{\n\n\tresult = (kermeta.language.structure.ClassDefinition) this.getTypeDefinition();\n}\nreturn result;\n'"
	 * @generated
	 */
	ClassDefinition getterClassDefinition();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.standard.OrderedSet<kermeta.language.structure.Property> result = null;\n{\n\n\tkermeta.language.structure.ClassDefinition cDef = null;\n\n\tcDef = (kermeta.language.structure.ClassDefinition) this.getTypeDefinition();\n\n\tresult = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Property>convertAsOrderedSet(cDef.getOwnedAttribute());\n}\nreturn org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.convertAsEList(result);\n'"
	 * @generated
	 */
	EList<Property> getterOwnedAttribute();

} // Class
