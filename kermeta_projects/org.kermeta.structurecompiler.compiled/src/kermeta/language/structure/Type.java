/**
 * <copyright>
 * </copyright>
 *
 * $Id: Type.java,v 1.9 2008-11-27 15:50:02 cfaucher Exp $
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = false;\n\n\tjava.lang.Boolean idIfCond_134 = false;\n\tidIfCond_134 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(this, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ParameterizedType\"));\n\n\tif( idIfCond_134 ) {\n\n\tjava.lang.Boolean idIfCond_135 = false;\n\tidIfCond_135 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(((kermeta.language.structure.ParameterizedType) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(this, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ParameterizedType\"))).getTypeDefinition(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ClassDefinition\"));\n\n\tif( idIfCond_135 ) {\n\n\tresult = ((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(((kermeta.language.structure.ParameterizedType) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(this, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ParameterizedType\"))).getTypeDefinition(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ClassDefinition\"))).isMappedToJavaRawType();\n}\n\n}\n\n\nreturn result;\n'"
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
	 * @model dataType="kermeta.standard.JavaBoolean"
	 *        annotation="kermeta documentation='/**\n\t * Tests whether the Type t corresponds to the Kermeta Boolean type, which can be encoded\n\t * either as the Boolean PrimitiveType or the Boolean class.\n\t * @param t : Type\n\t * @return true or false\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = false;\n\n\tjava.lang.Boolean idIfCond_136 = false;\n\tidIfCond_136 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(this));\n\n\tif( idIfCond_136 ) {\n\n\tjava.lang.Boolean idIfCond_137 = false;\n\tidIfCond_137 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(this, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Class\"));\n\n\tif( idIfCond_137 ) {\n\n\tresult = kermeta.standard.helper.StringWrapper.equals(((kermeta.language.structure.Class) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(this, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Class\"))).getTypeDefinition().getName(), \"Boolean\");\n}\n else {\n\n\tjava.lang.Boolean idIfCond_138 = false;\n\tidIfCond_138 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(this, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.PrimitiveType\"));\n\n\tif( idIfCond_138 ) {\n\n\tjava.lang.Boolean idIfCond_139 = false;\n\tidIfCond_139 = kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.StringWrapper.equals(((kermeta.language.structure.PrimitiveType) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(this, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.PrimitiveType\"))).createBehaviorJava(context), \"kermeta::standard::Boolean\"), kermeta.standard.helper.StringWrapper.equals(((kermeta.language.structure.PrimitiveType) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(this, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.PrimitiveType\"))).createBehaviorJava(context), \"kermeta::language::structure::Boolean\")), kermeta.standard.helper.StringWrapper.equals(((kermeta.language.structure.PrimitiveType) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(this, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.PrimitiveType\"))).createBehaviorJava(context), \"java.lang.Boolean\")), kermeta.standard.helper.StringWrapper.equals(((kermeta.language.structure.PrimitiveType) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(this, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.PrimitiveType\"))).createBehaviorJava(context), \"Boolean\"));\n\n\tif( idIfCond_139 ) {\n\n\tresult = true;\n}\n\n}\n\n}\n\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean isBooleanTypeDef(KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.language.structure.Class result = null;\n\n\tjava.lang.Boolean idIfCond_140 = false;\n\tidIfCond_140 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(this, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.PrimitiveType\"));\n\n\tif( idIfCond_140 ) {\n\n\tkermeta.language.structure.PrimitiveType pt = ((kermeta.language.structure.PrimitiveType) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(this, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.PrimitiveType\")));\n\n\tjava.lang.Boolean idIfCond_141 = false;\n\tidIfCond_141 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(pt.getInstanceType(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Class\"));\n\n\tif( idIfCond_141 ) {\n\n\tresult = ((kermeta.language.structure.Class) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(pt.getInstanceType(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Class\")));\n}\n else {\n\n\tresult = pt.getInstanceType().getClassFromPrimitiveType();\n}\n\n}\n else {\n\n\tresult = null;\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	kermeta.language.structure.Class getClassFromPrimitiveType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="kermeta.standard.JavaBoolean"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = false;\n\n\tkermeta.language.structure.Type theType = null;\n\n\tjava.lang.Boolean idIfCond_142 = false;\n\tidIfCond_142 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(this, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.PrimitiveType\"));\n\n\tif( idIfCond_142 ) {\n\n\ttheType = ((kermeta.language.structure.Type) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(this.getClassFromPrimitiveType(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Type\")));\n}\n else {\n\n\ttheType = this;\n}\n\n\n\tjava.lang.Boolean idIfCond_143 = false;\n\tidIfCond_143 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(theType, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ParameterizedType\"));\n\n\tif( idIfCond_143 ) {\n\n\tkermeta.language.structure.ParameterizedType pt = ((kermeta.language.structure.ParameterizedType) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(theType, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ParameterizedType\")));\n\n\tjava.lang.Boolean idIfCond_144 = false;\n\tidIfCond_144 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(pt.getTypeDefinition(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ClassDefinition\"));\n\n\tif( idIfCond_144 ) {\n\n\tresult = ((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(pt.getTypeDefinition(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ClassDefinition\"))).isValueType();\n}\n\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean isValueType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="kermeta.standard.JavaString"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.String result = null;\n\n\tresult = null;\n\n\tjava.lang.Boolean idIfCond_145 = false;\n\tidIfCond_145 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(this, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Class\"));\n\n\tif( idIfCond_145 ) {\n\n\tkermeta.language.structure.ClassDefinition cd = ((kermeta.language.structure.Class) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(this, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Class\"))).getClassDefinitionAsTyped();\n\n\tresult = cd.getName();\n}\n else {\n\n\tjava.lang.Boolean idIfCond_146 = false;\n\tidIfCond_146 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(this, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ObjectTypeVariable\"));\n\n\tif( idIfCond_146 ) {\n\n\tkermeta.language.structure.ObjectTypeVariable otv = ((kermeta.language.structure.ObjectTypeVariable) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(this, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ObjectTypeVariable\")));\n\n\tresult = otv.getName();\n}\n else {\n\n\tjava.lang.Boolean idIfCond_147 = false;\n\tidIfCond_147 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(this, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.PrimitiveType\"));\n\n\tif( idIfCond_147 ) {\n\n\tkermeta.language.structure.ClassDefinition cd = this.getClassFromPrimitiveType().getClassDefinitionAsTyped();\n\n\tresult = cd.getName();\n}\n else {\n\n\tjava.lang.Boolean idIfCond_148 = false;\n\tidIfCond_148 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(this, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Enumeration\"));\n\n\tif( idIfCond_148 ) {\n\n\tresult = ((kermeta.language.structure.Enumeration) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(this, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Enumeration\"))).getName();\n}\n else {\n\n\tjava.lang.Boolean idIfCond_149 = false;\n\tidIfCond_149 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(this, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.VoidType\"));\n\n\tif( idIfCond_149 ) {\n\n\tresult = \"VoidType\";\n}\n\n}\n\n}\n\n}\n\n}\n\n\n\tjava.lang.Boolean idIfCond_150 = false;\n//BIft:orElse\n\njava.lang.Boolean result_ft37 = null;\n\n\tjava.lang.Boolean idIfCond_151 = false;\n\tidIfCond_151 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(result);\n\n\tif( idIfCond_151 ) {\n\n\tresult_ft37 = true;\n}\n else {\n\n\t//BIle:right\n/*This variable should be never used\052/ kermeta.language.structure.Object v_lbdExp37 = null;\n\n\tresult_ft37 = ((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.language.structure.Operation\")).isVoidType(result);\n//EIle:right\n\n}\n\n\n//CEC\nidIfCond_150 = result_ft37;\n//EIft:orElse\n\n\n\tif( idIfCond_150 ) {\n\n\tresult = \"VoidType\";\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	String getTypeName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaBoolean"
	 *        annotation="kermeta documentation='/**\n\t * Tests whether the Type t corresponds to a Kermeta numerical type, which can be encoded\n\t * either as the Integer/Real PrimitiveType or the Integer/Real class.\n\t * @param t : Type\n\t * @return true or false\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = false;\n\n\tjava.lang.Boolean idIfCond_152 = false;\n\tidIfCond_152 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(this));\n\n\tif( idIfCond_152 ) {\n\n\tjava.lang.String tName = null;\n\n\tjava.lang.Boolean idIfCond_153 = false;\n\tidIfCond_153 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(this, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Class\"));\n\n\tif( idIfCond_153 ) {\n\n\ttName = ((kermeta.language.structure.ParameterizedType) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(this, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ParameterizedType\"))).getTypeDefinition().getName();\n\n\tjava.lang.Boolean idIfCond_154 = false;\n\tidIfCond_154 = kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.StringWrapper.equals(tName, \"Integer\"), kermeta.standard.helper.StringWrapper.equals(tName, \"Real\"));\n\n\tif( idIfCond_154 ) {\n\n\tresult = true;\n}\n\n}\n else {\n\n\tjava.lang.Boolean idIfCond_155 = false;\n\tidIfCond_155 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(this, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.PrimitiveType\"));\n\n\tif( idIfCond_155 ) {\n\n\ttName = ((kermeta.language.structure.PrimitiveType) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(this, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.PrimitiveType\"))).createBehaviorJava(context);\n\n\tjava.lang.Boolean idIfCond_156 = false;\n\tidIfCond_156 = kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.StringWrapper.equals(tName, \"Integer\"), kermeta.standard.helper.StringWrapper.equals(tName, \"Real\"));\n\n\tif( idIfCond_156 ) {\n\n\tresult = true;\n}\n\n}\n\n}\n\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean isNumericalTypeDef(KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="kermeta.standard.JavaString"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.String result = null;\n\n\tresult = null;\n\n\tjava.lang.Boolean idIfCond_157 = false;\n\tidIfCond_157 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(this, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Class\"));\n\n\tif( idIfCond_157 ) {\n\n\tkermeta.language.structure.ClassDefinition cd = ((kermeta.language.structure.Class) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(this, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Class\"))).getClassDefinitionAsTyped();\n\n\tresult = cd.qualifiedName();\n}\n else {\n\n\tjava.lang.Boolean idIfCond_158 = false;\n\tidIfCond_158 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(this, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ObjectTypeVariable\"));\n\n\tif( idIfCond_158 ) {\n\n\tkermeta.language.structure.ObjectTypeVariable otv = ((kermeta.language.structure.ObjectTypeVariable) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(this, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ObjectTypeVariable\")));\n\n\tresult = otv.qualifiedName();\n}\n else {\n\n\tjava.lang.Boolean idIfCond_159 = false;\n\tidIfCond_159 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(this, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.PrimitiveType\"));\n\n\tif( idIfCond_159 ) {\n\n\tkermeta.language.structure.ClassDefinition cd = this.getClassFromPrimitiveType().getClassDefinitionAsTyped();\n\n\tresult = cd.qualifiedName();\n}\n else {\n\n\tjava.lang.Boolean idIfCond_160 = false;\n\tidIfCond_160 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(this, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Enumeration\"));\n\n\tif( idIfCond_160 ) {\n\n\tresult = ((kermeta.language.structure.Enumeration) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(this, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Enumeration\"))).qualifiedName();\n}\n else {\n\n\tjava.lang.Boolean idIfCond_161 = false;\n\tidIfCond_161 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(this, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.VoidType\"));\n\n\tif( idIfCond_161 ) {\n\n\tresult = \"kermeta::language::structure::VoidType\";\n}\n\n}\n\n}\n\n}\n\n}\n\n\n\tjava.lang.Boolean idIfCond_162 = false;\n//BIft:orElse\n\njava.lang.Boolean result_ft38 = null;\n\n\tjava.lang.Boolean idIfCond_163 = false;\n\tidIfCond_163 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(result);\n\n\tif( idIfCond_163 ) {\n\n\tresult_ft38 = true;\n}\n else {\n\n\t//BIle:right\n/*This variable should be never used\052/ kermeta.language.structure.Object v_lbdExp38 = null;\n\n\tresult_ft38 = ((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.language.structure.Operation\")).isVoidType(result);\n//EIle:right\n\n}\n\n\n//CEC\nidIfCond_162 = result_ft38;\n//EIft:orElse\n\n\n\tif( idIfCond_162 ) {\n\n\tresult = \"kermeta::language::structure::VoidType\";\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	String getTypeQName();

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
	 *        annotation="kermeta documentation='/**\n \t * Implements Type.isSubTypeOf(Type)\n \t * For technical reason, the current implementation works only with Type that comes from a kermeta declaration (ie. in a require)\n \t * it won\'t work with Type created programmaticaly by the user. If you need that, please ask to the kermeta developpers\n \t * to extend it.\n \t \052/'"
	 *        annotation="kermeta RecopyInValueTypes='true'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = org.kermeta.compil.runtime.helper.language.TypeUtil.isSuperTypeOfSwitcher(object, this);\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean isSubTypeOf(Type object);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaBoolean"
	 *        annotation="kermeta documentation='/**\n \t * Implements Type.isSuperTypeOf(Type)\n \t * For technical reason, the current implementation works only with Type that comes from a kermeta declaration (ie. in a require)\n \t * it won\'t work with Type created programmaticaly by the user. If you need that, please ask to the kermeta developpers\n \t * to extend it.\n \t \052/'"
	 *        annotation="kermeta RecopyInValueTypes='true'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = (java.lang.Boolean) org.kermeta.compil.runtime.ExecutionContext.getInstance().<java.lang.Boolean>asTypeOrVoid(org.kermeta.compil.runtime.helper.language.TypeUtil.hasSubType(this, object));\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean isSuperTypeOf(Type object);

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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = false;\n\n\tjava.lang.Boolean idIfCond_164 = false;\n\tidIfCond_164 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(this.getEMFEDataTypeInstanceClassName(), \"\");\n\n\tif( idIfCond_164 ) {\n\n\tresult = true;\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean isEDataType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="kermeta.standard.JavaBoolean"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(this, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Enumeration\"));\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean isEnumeration();

} // Type
