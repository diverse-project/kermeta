/**
 * <copyright>
 * </copyright>
 *
 * $Id: Class.java,v 1.10 2009-01-21 09:15:58 cfaucher Exp $
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
public interface Class extends ParameterizedType, Traceability<EGenericType> {
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
	 * @model annotation="kermeta superOperation='kermeta::language::structure::Type'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.language.structure.Object result = null;\n\n\tresult = org.kermeta.compil.runtime.helper.language.ClassUtil.deepCloneObject(this, objectToClone);\n\nreturn result;\n'"
	 * @generated
	 */
	kermeta.language.structure.Object deepClone(
			kermeta.language.structure.Object objectToClone);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\n\t * Instantiates a new occurence for this Class\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.language.structure.Object result = null;\n\n\tresult = org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(this.getTypeDefinition().qualifiedName().replace(\"::\", \".\"));\n\nreturn result;\n'"
	 * @generated
	 */
	kermeta.language.structure.Object _new();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/** Never used for the moment \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.standard.Set<kermeta.language.structure.Property> result = null;\n\n\tkermeta.standard.Set<kermeta.language.structure.Property> properties = ((kermeta.standard.Set<kermeta.language.structure.Property>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.standard.StandardPackage.eINSTANCE.getSet()));\n\n\t//BIft:select\n\nkermeta.standard.Sequence<kermeta.language.structure.Property> result_ft97 = null;\n\n\tkermeta.language.structure.Property elem_ft97 = null;\n\n\tresult_ft97 = ((kermeta.standard.Sequence<kermeta.language.structure.Property>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.standard.StandardPackage.eINSTANCE.getSequence()));\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Property> it_ft97 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Property>convertAsOrderedSet(this.getterOwnedAttribute()).iterator();\n\tjava.lang.Boolean idLoopCond_234 = false;\n\twhile( !idLoopCond_234 ) {\n\tidLoopCond_234 = it_ft97.isOff();\n\tif ( idLoopCond_234 ) {\n\t} else {\n\n\telem_ft97 = it_ft97.next();\n\n\tjava.lang.Boolean idIfCond_235 = false;\n//BIle:selector\nkermeta.language.structure.Property p_lbdExp97 = elem_ft97;\n\n\tidIfCond_235 = p_lbdExp97.getIsComposite();\n//EIle:selector\n\n\n\tif( idIfCond_235 ) {\n\n\tresult_ft97.add(elem_ft97);\n}\n\n}\n\t}\n}\n\n//EIft:select\nproperties.addAll(result_ft97);\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Class> it_ft98 = this.allSuperClasses().iterator();\n\tjava.lang.Boolean idLoopCond_236 = false;\n\twhile( !idLoopCond_236 ) {\n\tidLoopCond_236 = it_ft98.isOff();\n\tif ( idLoopCond_236 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Class s_lbdExp98 = it_ft98.next();\n\n\t//BIft:select\n\nkermeta.standard.Sequence<kermeta.language.structure.Property> result_ft99 = null;\n\n\tkermeta.language.structure.Property elem_ft99 = null;\n\n\tresult_ft99 = ((kermeta.standard.Sequence<kermeta.language.structure.Property>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.standard.StandardPackage.eINSTANCE.getSequence()));\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Property> it_ft99 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Property>convertAsOrderedSet(s_lbdExp98.getterOwnedAttribute()).iterator();\n\tjava.lang.Boolean idLoopCond_237 = false;\n\twhile( !idLoopCond_237 ) {\n\tidLoopCond_237 = it_ft99.isOff();\n\tif ( idLoopCond_237 ) {\n\t} else {\n\n\telem_ft99 = it_ft99.next();\n\n\tjava.lang.Boolean idIfCond_238 = false;\n//BIle:selector\nkermeta.language.structure.Property p_lbdExp99 = elem_ft99;\n\n\tidIfCond_238 = p_lbdExp99.getIsComposite();\n//EIle:selector\n\n\n\tif( idIfCond_238 ) {\n\n\tresult_ft99.add(elem_ft99);\n}\n\n}\n\t}\n}\n\n//EIft:select\nproperties.addAll(result_ft99);\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\tresult = properties;\n\nreturn result;\n'"
	 * @generated
	 */
	Set<Property> allAttributes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/** Never used for the moment \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.standard.Set<kermeta.language.structure.Class> result = null;\n\n\tkermeta.standard.Set<kermeta.language.structure.Class> allSuperClasses = ((kermeta.standard.Set<kermeta.language.structure.Class>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.standard.StandardPackage.eINSTANCE.getSet()));\n\n\tkermeta.standard.Set<kermeta.language.structure.Class> superClasses = ((kermeta.standard.Set<kermeta.language.structure.Class>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.standard.StandardPackage.eINSTANCE.getSet()));\n\n\tsuperClasses.addAll(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Class>convertAsOrderedSet(this.getterSuperClass()));\n\n\tkermeta.standard.Set<kermeta.language.structure.Class> temp = ((kermeta.standard.Set<kermeta.language.structure.Class>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.standard.StandardPackage.eINSTANCE.getSet()));\n\n\t\n\tkermeta.standard.helper.BooleanWrapper.not(superClasses.isEmpty());\n\tjava.lang.Boolean idLoopCond_239 = false;\n\twhile( !idLoopCond_239 ) {\n\tidLoopCond_239 = superClasses.isEmpty();\n\tif ( idLoopCond_239 ) {\n\t} else {\n\n\tallSuperClasses.addAll(superClasses);\n\n\ttemp.clear();\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Class> it_ft100 = superClasses.iterator();\n\tjava.lang.Boolean idLoopCond_240 = false;\n\twhile( !idLoopCond_240 ) {\n\tidLoopCond_240 = it_ft100.isOff();\n\tif ( idLoopCond_240 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Class s_lbdExp100 = it_ft100.next();\n\n\ttemp.addAll(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Class>convertAsOrderedSet(s_lbdExp100.getterSuperClass()));\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\tsuperClasses.clear();\n\n\tsuperClasses.addAll(temp);\n}\n\t}\n\n\tresult = allSuperClasses;\n\nreturn result;\n'"
	 * @generated
	 */
	Set<Class> allSuperClasses();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaBoolean"
	 *        annotation="kermeta superOperation='kermeta::language::structure::Object'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = (java.lang.Boolean) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeOrVoid(org.kermeta.compil.runtime.helper.language.ClassUtil.equals(this, other), \"java.lang.Boolean\");\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean equals(kermeta.language.structure.Object other);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaString"
	 *        annotation="kermeta documentation='/**\n\t * Returns the String representation of this class. \n\t *  Note : throws an exception if this class has no classDefinition\n\t *  or if the classDefinition is not well constructed.\n\t \052/'"
	 *        annotation="kermeta superOperation='kermeta::language::structure::Object'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.String result = null;\n\n\tresult = this.getTypeDefinition().getName();\n\nreturn result;\n'"
	 * @generated
	 */
	String toString();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.TypeVariableBinding> it_ft101 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.TypeVariableBinding>convertAsOrderedSet(this.getTypeParamBinding()).iterator();\n\tjava.lang.Boolean idLoopCond_241 = false;\n\twhile( !idLoopCond_241 ) {\n\tidLoopCond_241 = it_ft101.isOff();\n\tif ( idLoopCond_241 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.TypeVariableBinding tpb_lbdExp101 = it_ft101.next();\n\n\tecore.EGenericType typeArgument = ((ecore.EGenericType) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(ecore.EcorePackage.eINSTANCE.getEGenericType()));\n\n\tjava.lang.Boolean idIfCond_242 = false;\n\tidIfCond_242 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(tpb_lbdExp101.getType(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Class\"));\n\n\tif( idIfCond_242 ) {\n\n\tkermeta.language.structure.ClassDefinition cd = ((kermeta.language.structure.Class) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(tpb_lbdExp101.getType(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Class\"))).getClassDefinitionAsTyped();\n\n\tjava.lang.Boolean idIfCond_243 = false;\n\tidIfCond_243 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(cd.getEcoreDataType());\n\n\tif( idIfCond_243 ) {\n\n\ttypeArgument.setEClassifier(cd.getEcoreModelElement());\n}\n else {\n\n\ttypeArgument.setEClassifier(cd.getEcoreDataType());\n}\n\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EGenericType>convertAsOrderedSet(this.getEcoreModelElement().getETypeArguments()).add(typeArgument);\n\n\t((kermeta.language.structure.Class) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(tpb_lbdExp101.getType(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Class\"))).setEcoreModelElement(typeArgument);\n\n\t((kermeta.language.structure.Class) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(tpb_lbdExp101.getType(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Class\"))).setLinks(context);\n}\n else {\n\n\tjava.lang.Boolean idIfCond_244 = false;\n\tidIfCond_244 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(tpb_lbdExp101.getType(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ObjectTypeVariable\"));\n\n\tif( idIfCond_244 ) {\n\n\tkermeta.language.structure.ObjectTypeVariable otv = ((kermeta.language.structure.ObjectTypeVariable) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(tpb_lbdExp101.getType(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ObjectTypeVariable\")));\n\n\ttypeArgument.setETypeParameter(otv.getEcoreModelElement());\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EGenericType>convertAsOrderedSet(this.getEcoreModelElement().getETypeArguments()).add(typeArgument);\n}\n else {\n\n\tjava.lang.Boolean idIfCond_245 = false;\n\tidIfCond_245 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(tpb_lbdExp101.getType(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.PrimitiveType\"));\n\n\tif( idIfCond_245 ) {\n\n\tkermeta.language.structure.ClassDefinition cd = tpb_lbdExp101.getType().getClassFromPrimitiveType().getClassDefinitionAsTyped();\n\n\tjava.lang.Boolean idIfCond_246 = false;\n\tidIfCond_246 = tpb_lbdExp101.getType().isEDataType();\n\n\tif( idIfCond_246 ) {\n\n\ttypeArgument.setEClassifier(((kermeta.language.structure.PrimitiveType) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(tpb_lbdExp101.getType(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.PrimitiveType\"))).getEcoreModelElement());\n}\n else {\n\n\tjava.lang.Boolean idIfCond_247 = false;\n\tidIfCond_247 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(cd.getEcoreDataType());\n\n\tif( idIfCond_247 ) {\n\n\ttypeArgument.setEClassifier(cd.getEcoreModelElement());\n}\n else {\n\n\ttypeArgument.setEClassifier(cd.getEcoreDataType());\n}\n\n}\n\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EGenericType>convertAsOrderedSet(this.getEcoreModelElement().getETypeArguments()).add(typeArgument);\n}\n else {\n\n\tjava.lang.Boolean idIfCond_248 = false;\n\tidIfCond_248 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(tpb_lbdExp101.getType(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.VoidType\"));\n\n\tif( idIfCond_248 ) {\n}\n\n}\n\n}\n\n}\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n'"
	 * @generated
	 */
	void setLinks(KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.standard.Set<kermeta.language.structure.Operation> result = null;\n\n\tkermeta.language.structure.ClassDefinition cDef = null;\n\n\tcDef = (kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeOrVoid(this.getTypeDefinition(), \"kermeta.language.structure.ClassDefinition\");\n\n\tresult = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Operation>convertAsOrderedSet(cDef.getOwnedOperation());\n\nreturn org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.convertAsEList(result);\n'"
	 * @generated
	 */
	EList<Operation> getterOwnedOperation();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.standard.OrderedSet<kermeta.language.structure.Class> result = null;\n\n\tkermeta.language.structure.ClassDefinition cDef = null;\n\n\tcDef = (kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeOrVoid(this.getTypeDefinition(), \"kermeta.language.structure.ClassDefinition\");\n\n\tkermeta.standard.OrderedSet<kermeta.language.structure.Class> supertypes = ((kermeta.standard.OrderedSet<kermeta.language.structure.Class>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.standard.StandardPackage.eINSTANCE.getOrderedSet()));\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Type> it_ft96 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Type>convertAsOrderedSet(cDef.getSuperType()).iterator();\n\tjava.lang.Boolean idLoopCond_232 = false;\n\twhile( !idLoopCond_232 ) {\n\tidLoopCond_232 = it_ft96.isOff();\n\tif ( idLoopCond_232 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Type elem_lbdExp96 = it_ft96.next();\n\n\tjava.lang.Boolean idIfCond_233 = false;\n\tidIfCond_233 = org.kermeta.compil.runtime.helper.language.TypeUtil.isInstanceSwitcher(org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Class\"), elem_lbdExp96);\n\n\tif( idIfCond_233 ) {\n\n\tkermeta.language.structure.Class c = null;\n\n\tc = (kermeta.language.structure.Class) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeOrVoid(elem_lbdExp96, \"kermeta.language.structure.Class\");\n\n\tsupertypes.add(c);\n}\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\tresult = supertypes;\n\nreturn org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.convertAsEList(result);\n'"
	 * @generated
	 */
	EList<Class> getterSuperClass();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaBoolean"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tkermeta.language.structure.ClassDefinition cDef = null;\n\n\tcDef = (kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeOrVoid(this.getTypeDefinition(), \"kermeta.language.structure.ClassDefinition\");\n\n\tresult = cDef.getIsAbstract();\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean getterIsAbstract();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaString"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.String result = null;\n\n\tresult = this.getTypeDefinition().getName();\n\nreturn result;\n'"
	 * @generated
	 */
	String getterName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.language.structure.ClassDefinition result = null;\n\n\tresult = (kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeOrVoid(this.getTypeDefinition(), \"kermeta.language.structure.ClassDefinition\");\n\nreturn result;\n'"
	 * @generated
	 */
	ClassDefinition getterClassDefinition();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.standard.OrderedSet<kermeta.language.structure.Property> result = null;\n\n\tkermeta.language.structure.ClassDefinition cDef = null;\n\n\tcDef = (kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeOrVoid(this.getTypeDefinition(), \"kermeta.language.structure.ClassDefinition\");\n\n\tresult = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Property>convertAsOrderedSet(cDef.getOwnedAttribute());\n\nreturn org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.convertAsEList(result);\n'"
	 * @generated
	 */
	EList<Property> getterOwnedAttribute();

} // Class
