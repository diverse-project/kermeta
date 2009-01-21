/**
 * <copyright>
 * </copyright>
 *
 * $Id: Type.java,v 1.10 2009-01-21 09:15:59 cfaucher Exp $
 */
package kermeta.language.structure;

import km2ecore.KM2EcoreContext;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kermeta.language.structure.Type#getTypeContainer <em>Type Container</em>}</li>
 * </ul>
 * </p>
 *
 * @see kermeta.language.structure.StructurePackage#getType()
 * @model annotation="kermeta documentation='Alias to kermeta::standard::Integer'"
 *        annotation="kermeta documentation='Base class definition for the <b>use</b> of a type.'"
 * @generated
 */
public interface Type extends kermeta.language.structure.Object {
	/**
	 * Returns the value of the '<em><b>Type Container</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link kermeta.language.structure.TypeContainer#getContainedType <em>Contained Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Container</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Container</em>' container reference.
	 * @see #setTypeContainer(TypeContainer)
	 * @see kermeta.language.structure.StructurePackage#getType_TypeContainer()
	 * @see kermeta.language.structure.TypeContainer#getContainedType
	 * @model opposite="containedType" transient="false"
	 *        annotation="kermeta documentation='Owning TypeContainer, if any'"
	 * @generated
	 */
	TypeContainer getTypeContainer();

	/**
	 * Sets the value of the '{@link kermeta.language.structure.Type#getTypeContainer <em>Type Container</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Container</em>' container reference.
	 * @see #getTypeContainer()
	 * @generated
	 */
	void setTypeContainer(TypeContainer value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="kermeta.standard.JavaBoolean"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = false;\n\n\tjava.lang.Boolean idIfCond_291 = false;\n\tidIfCond_291 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(this, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ParameterizedType\"));\n\n\tif( idIfCond_291 ) {\n\n\tjava.lang.Boolean idIfCond_292 = false;\n\tidIfCond_292 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(((kermeta.language.structure.ParameterizedType) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(this, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ParameterizedType\"))).getTypeDefinition(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ClassDefinition\"));\n\n\tif( idIfCond_292 ) {\n\n\tresult = ((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(((kermeta.language.structure.ParameterizedType) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(this, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ParameterizedType\"))).getTypeDefinition(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ClassDefinition\"))).isMappedToJavaRawType();\n}\n\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean isMappedToJavaRawType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaString"
	 *        annotation="kermeta superOperation='kermeta::language::structure::Object'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.String result = null;\n\n\tresult = \"\";\n\nreturn result;\n'"
	 * @generated
	 */
	String createBehaviorJava(KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta isAbstract='true'"
	 *        annotation="kermeta documentation='/**\n\t * Returns a copy of passed Object built by recursively copying attribute\n\t * properties, and referencing original reference properties values\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='kermeta.language.structure.Object result = null;\n\nreturn result;\n'"
	 * @generated
	 */
	kermeta.language.structure.Object clone(
			kermeta.language.structure.Object objectToClone);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta isAbstract='true'"
	 *        annotation="kermeta documentation='/**\n\t * Returns a copy of passed Object built by recursively copying values of\n\t * all properties, no matter the property kind\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='kermeta.language.structure.Object result = null;\n\nreturn result;\n'"
	 * @generated
	 */
	kermeta.language.structure.Object deepClone(
			kermeta.language.structure.Object objectToClone);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.language.structure.Class result = null;\n\n\tjava.lang.Boolean idIfCond_293 = false;\n\tidIfCond_293 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(this, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.PrimitiveType\"));\n\n\tif( idIfCond_293 ) {\n\n\tkermeta.language.structure.PrimitiveType pt = ((kermeta.language.structure.PrimitiveType) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(this, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.PrimitiveType\")));\n\n\tjava.lang.Boolean idIfCond_294 = false;\n\tidIfCond_294 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(pt.getInstanceType(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Class\"));\n\n\tif( idIfCond_294 ) {\n\n\tresult = ((kermeta.language.structure.Class) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(pt.getInstanceType(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Class\")));\n}\n else {\n\n\tresult = pt.getInstanceType().getClassFromPrimitiveType();\n}\n\n}\n else {\n\n\tresult = null;\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	kermeta.language.structure.Class getClassFromPrimitiveType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaBoolean"
	 *        annotation="kermeta documentation='/**\r\n\t * Tests whether the Type t corresponds to the Kermeta Boolean type, which can be encoded\r\n\t * either as the Boolean PrimitiveType or the Boolean class.\r\n\t * @param t : Type\r\n\t * @return true or false\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = false;\n\n\tjava.lang.Boolean idIfCond_295 = false;\n\tidIfCond_295 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(this));\n\n\tif( idIfCond_295 ) {\n\n\tjava.lang.Boolean idIfCond_296 = false;\n\tidIfCond_296 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(this, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Class\"));\n\n\tif( idIfCond_296 ) {\n\n\tresult = kermeta.standard.helper.StringWrapper.equals(((kermeta.language.structure.Class) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(this, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Class\"))).getTypeDefinition().getName(), \"Boolean\");\n}\n else {\n\n\tjava.lang.Boolean idIfCond_297 = false;\n\tidIfCond_297 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(this, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.PrimitiveType\"));\n\n\tif( idIfCond_297 ) {\n\n\tjava.lang.Boolean idIfCond_298 = false;\n\tidIfCond_298 = kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.StringWrapper.equals(((kermeta.language.structure.PrimitiveType) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(this, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.PrimitiveType\"))).createBehaviorJava(context), \"kermeta::standard::Boolean\"), kermeta.standard.helper.StringWrapper.equals(((kermeta.language.structure.PrimitiveType) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(this, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.PrimitiveType\"))).createBehaviorJava(context), \"kermeta::language::structure::Boolean\")), kermeta.standard.helper.StringWrapper.equals(((kermeta.language.structure.PrimitiveType) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(this, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.PrimitiveType\"))).createBehaviorJava(context), \"java.lang.Boolean\")), kermeta.standard.helper.StringWrapper.equals(((kermeta.language.structure.PrimitiveType) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(this, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.PrimitiveType\"))).createBehaviorJava(context), \"Boolean\"));\n\n\tif( idIfCond_298 ) {\n\n\tresult = true;\n}\n\n}\n\n}\n\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean isBooleanTypeDef(KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="kermeta.standard.JavaBoolean"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = false;\n\n\tkermeta.language.structure.Type theType = null;\n\n\tjava.lang.Boolean idIfCond_299 = false;\n\tidIfCond_299 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(this, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.PrimitiveType\"));\n\n\tif( idIfCond_299 ) {\n\n\ttheType = ((kermeta.language.structure.Type) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(this.getClassFromPrimitiveType(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Type\")));\n}\n else {\n\n\ttheType = this;\n}\n\n\n\tjava.lang.Boolean idIfCond_300 = false;\n\tidIfCond_300 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(theType, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ParameterizedType\"));\n\n\tif( idIfCond_300 ) {\n\n\tkermeta.language.structure.ParameterizedType pt = ((kermeta.language.structure.ParameterizedType) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(theType, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ParameterizedType\")));\n\n\tjava.lang.Boolean idIfCond_301 = false;\n\tidIfCond_301 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(pt.getTypeDefinition(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ClassDefinition\"));\n\n\tif( idIfCond_301 ) {\n\n\tresult = ((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(pt.getTypeDefinition(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ClassDefinition\"))).isValueType();\n}\n\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean isValueType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="kermeta.standard.JavaString"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.String result = null;\n\n\tresult = null;\n\n\tjava.lang.Boolean idIfCond_302 = false;\n\tidIfCond_302 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(this, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Class\"));\n\n\tif( idIfCond_302 ) {\n\n\tkermeta.language.structure.ClassDefinition cd = ((kermeta.language.structure.Class) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(this, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Class\"))).getClassDefinitionAsTyped();\n\n\tresult = cd.getName();\n}\n else {\n\n\tjava.lang.Boolean idIfCond_303 = false;\n\tidIfCond_303 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(this, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ObjectTypeVariable\"));\n\n\tif( idIfCond_303 ) {\n\n\tkermeta.language.structure.ObjectTypeVariable otv = ((kermeta.language.structure.ObjectTypeVariable) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(this, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ObjectTypeVariable\")));\n\n\tresult = otv.getName();\n}\n else {\n\n\tjava.lang.Boolean idIfCond_304 = false;\n\tidIfCond_304 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(this, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.PrimitiveType\"));\n\n\tif( idIfCond_304 ) {\n\n\tkermeta.language.structure.ClassDefinition cd = this.getClassFromPrimitiveType().getClassDefinitionAsTyped();\n\n\tresult = cd.getName();\n}\n else {\n\n\tjava.lang.Boolean idIfCond_305 = false;\n\tidIfCond_305 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(this, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Enumeration\"));\n\n\tif( idIfCond_305 ) {\n\n\tresult = ((kermeta.language.structure.Enumeration) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(this, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Enumeration\"))).getName();\n}\n else {\n\n\tjava.lang.Boolean idIfCond_306 = false;\n\tidIfCond_306 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(this, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.VoidType\"));\n\n\tif( idIfCond_306 ) {\n\n\tresult = \"VoidType\";\n}\n\n}\n\n}\n\n}\n\n}\n\n\n\tjava.lang.Boolean idIfCond_307 = false;\n//BIft:orElse\n\njava.lang.Boolean result_ft109 = null;\n\n\tjava.lang.Boolean idIfCond_308 = false;\n\tidIfCond_308 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(result);\n\n\tif( idIfCond_308 ) {\n\n\tresult_ft109 = true;\n}\n else {\n\n\t//BIle:right\n/*This variable should be never used\052/ kermeta.language.structure.Object v_lbdExp109 = null;\n\n\tresult_ft109 = ((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.language.structure.StructurePackage.eINSTANCE.getOperation())).isVoidType(result);\n//EIle:right\n\n}\n\n\n//CEC\nidIfCond_307 = result_ft109;\n//EIft:orElse\n\n\n\tif( idIfCond_307 ) {\n\n\tresult = \"VoidType\";\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	String getTypeName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaBoolean"
	 *        annotation="kermeta documentation='/**\r\n\t * Tests whether the Type t corresponds to a Kermeta numerical type, which can be encoded\r\n\t * either as the Integer/Real PrimitiveType or the Integer/Real class.\r\n\t * @param t : Type\r\n\t * @return true or false\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = false;\n\n\tjava.lang.Boolean idIfCond_309 = false;\n\tidIfCond_309 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(this));\n\n\tif( idIfCond_309 ) {\n\n\tjava.lang.String tName = null;\n\n\tjava.lang.Boolean idIfCond_310 = false;\n\tidIfCond_310 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(this, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Class\"));\n\n\tif( idIfCond_310 ) {\n\n\ttName = ((kermeta.language.structure.ParameterizedType) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(this, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ParameterizedType\"))).getTypeDefinition().getName();\n\n\tjava.lang.Boolean idIfCond_311 = false;\n\tidIfCond_311 = kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.StringWrapper.equals(tName, \"Integer\"), kermeta.standard.helper.StringWrapper.equals(tName, \"Real\"));\n\n\tif( idIfCond_311 ) {\n\n\tresult = true;\n}\n\n}\n else {\n\n\tjava.lang.Boolean idIfCond_312 = false;\n\tidIfCond_312 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(this, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.PrimitiveType\"));\n\n\tif( idIfCond_312 ) {\n\n\ttName = ((kermeta.language.structure.PrimitiveType) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(this, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.PrimitiveType\"))).createBehaviorJava(context);\n\n\tjava.lang.Boolean idIfCond_313 = false;\n\tidIfCond_313 = kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.StringWrapper.equals(tName, \"Integer\"), kermeta.standard.helper.StringWrapper.equals(tName, \"Real\"));\n\n\tif( idIfCond_313 ) {\n\n\tresult = true;\n}\n\n}\n\n}\n\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean isNumericalTypeDef(KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="kermeta.standard.JavaString"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.String result = null;\n\n\tresult = null;\n\n\tjava.lang.Boolean idIfCond_314 = false;\n\tidIfCond_314 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(this, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Class\"));\n\n\tif( idIfCond_314 ) {\n\n\tkermeta.language.structure.ClassDefinition cd = ((kermeta.language.structure.Class) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(this, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Class\"))).getClassDefinitionAsTyped();\n\n\tresult = cd.qualifiedName();\n}\n else {\n\n\tjava.lang.Boolean idIfCond_315 = false;\n\tidIfCond_315 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(this, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ObjectTypeVariable\"));\n\n\tif( idIfCond_315 ) {\n\n\tkermeta.language.structure.ObjectTypeVariable otv = ((kermeta.language.structure.ObjectTypeVariable) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(this, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ObjectTypeVariable\")));\n\n\tresult = otv.qualifiedName();\n}\n else {\n\n\tjava.lang.Boolean idIfCond_316 = false;\n\tidIfCond_316 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(this, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.PrimitiveType\"));\n\n\tif( idIfCond_316 ) {\n\n\tkermeta.language.structure.ClassDefinition cd = this.getClassFromPrimitiveType().getClassDefinitionAsTyped();\n\n\tresult = cd.qualifiedName();\n}\n else {\n\n\tjava.lang.Boolean idIfCond_317 = false;\n\tidIfCond_317 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(this, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Enumeration\"));\n\n\tif( idIfCond_317 ) {\n\n\tresult = ((kermeta.language.structure.Enumeration) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(this, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Enumeration\"))).qualifiedName();\n}\n else {\n\n\tjava.lang.Boolean idIfCond_318 = false;\n\tidIfCond_318 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(this, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.VoidType\"));\n\n\tif( idIfCond_318 ) {\n\n\tresult = \"kermeta::language::structure::VoidType\";\n}\n\n}\n\n}\n\n}\n\n}\n\n\n\tjava.lang.Boolean idIfCond_319 = false;\n//BIft:orElse\n\njava.lang.Boolean result_ft110 = null;\n\n\tjava.lang.Boolean idIfCond_320 = false;\n\tidIfCond_320 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(result);\n\n\tif( idIfCond_320 ) {\n\n\tresult_ft110 = true;\n}\n else {\n\n\t//BIle:right\n/*This variable should be never used\052/ kermeta.language.structure.Object v_lbdExp110 = null;\n\n\tresult_ft110 = ((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.language.structure.StructurePackage.eINSTANCE.getOperation())).isVoidType(result);\n//EIle:right\n\n}\n\n\n//CEC\nidIfCond_319 = result_ft110;\n//EIft:orElse\n\n\n\tif( idIfCond_319 ) {\n\n\tresult = \"kermeta::language::structure::VoidType\";\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	String getTypeQName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaBoolean"
	 *        annotation="kermeta documentation='/**\n \t * Implements Type.isSubTypeOf(Type)\n \t * For technical reason, the current implementation works only with Type that comes from a kermeta declaration (ie. in a require)\n \t * it won\'t work with Type created programmaticaly by the user. If you need that, please ask to the kermeta developpers\n \t * to extend it.\n \t \052/'"
	 *        annotation="kermeta RecopyInValueTypes='true'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = org.kermeta.compil.runtime.helper.language.TypeUtil.isSuperTypeOfSwitcher(object, this);\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean isSubTypeOf(Type object);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="kermeta.standard.JavaBoolean"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(this, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.PrimitiveType\"));\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean isPrimitiveType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaBoolean"
	 *        annotation="kermeta documentation='/**\n \t * Implements Type.isSuperTypeOf(Type)\n \t * For technical reason, the current implementation works only with Type that comes from a kermeta declaration (ie. in a require)\n \t * it won\'t work with Type created programmaticaly by the user. If you need that, please ask to the kermeta developpers\n \t * to extend it.\n \t \052/'"
	 *        annotation="kermeta RecopyInValueTypes='true'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = (java.lang.Boolean) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeOrVoid(org.kermeta.compil.runtime.helper.language.TypeUtil.hasSubType(this, object), \"java.lang.Boolean\");\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean isSuperTypeOf(Type object);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="kermeta.standard.JavaBoolean"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = false;\n\n\tjava.lang.Boolean idIfCond_321 = false;\n\tidIfCond_321 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(this.getEMFEDataTypeInstanceClassName(), \"\");\n\n\tif( idIfCond_321 ) {\n\n\tresult = true;\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean isEDataType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaBoolean"
	 *        annotation="kermeta documentation='/**\n\t * Implements Type.isInstance(Object)\n\t \052/'"
	 *        annotation="kermeta RecopyInValueTypes='true'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(element, this);\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean isInstance(kermeta.language.structure.Object element);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="kermeta.standard.JavaBoolean"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(this, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Enumeration\"));\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean isEnumeration();

} // Type
