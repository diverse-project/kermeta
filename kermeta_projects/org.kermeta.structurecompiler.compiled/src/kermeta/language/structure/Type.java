/**
 * <copyright>
 * </copyright>
 *
 * $Id: Type.java,v 1.3 2008-09-22 14:47:41 cfaucher Exp $
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = false;\n\n\tjava.lang.Boolean idIfCond_563 = false;\n\tidIfCond_563 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOf(this, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ParameterizedType\"));\n\n\tif( idIfCond_563 ) {\n\n\tjava.lang.Boolean idIfCond_564 = false;\n\tidIfCond_564 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOf(((kermeta.language.structure.ParameterizedType) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(this, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ParameterizedType\"))).getTypeDefinition(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ClassDefinition\"));\n\n\tif( idIfCond_564 ) {\n\n\tresult = ((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(((kermeta.language.structure.ParameterizedType) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(this, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ParameterizedType\"))).getTypeDefinition(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ClassDefinition\"))).isMappedToJavaRawType();\n}\n\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean isMappedToJavaRawType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta isAbstract='true'"
	 *        annotation="kermeta documentation='/**\r\n\t * Returns a copy of passed Object built by recursively copying attribute\r\n\t * properties, and referencing original reference properties values\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='kermeta.language.structure.Object result = null;\n\nreturn result;\n'"
	 * @generated
	 */
	kermeta.language.structure.Object clone(
			kermeta.language.structure.Object objectToClone);

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
	 *        annotation="kermeta documentation='/**\r\n\t * Returns a copy of passed Object built by recursively copying values of\r\n\t * all properties, no matter the property kind\r\n\t \052/'"
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = false;\n\n\tjava.lang.Boolean idIfCond_565 = false;\n\tidIfCond_565 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoid(this));\n\n\tif( idIfCond_565 ) {\n\n\tjava.lang.Boolean idIfCond_566 = false;\n\tidIfCond_566 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOf(this, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Class\"));\n\n\tif( idIfCond_566 ) {\n\n\tresult = kermeta.standard.helper.StringWrapper.equals(((kermeta.language.structure.Class) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(this, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Class\"))).getTypeDefinition().getName(), \"Boolean\");\n}\n else {\n\n\tjava.lang.Boolean idIfCond_567 = false;\n\tidIfCond_567 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOf(this, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.PrimitiveType\"));\n\n\tif( idIfCond_567 ) {\n\n\tjava.lang.Boolean idIfCond_568 = false;\n\tidIfCond_568 = kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.StringWrapper.equals(((kermeta.language.structure.PrimitiveType) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(this, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.PrimitiveType\"))).createBehaviorJava(context), \"kermeta::standard::Boolean\"), kermeta.standard.helper.StringWrapper.equals(((kermeta.language.structure.PrimitiveType) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(this, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.PrimitiveType\"))).createBehaviorJava(context), \"kermeta::language::structure::Boolean\")), kermeta.standard.helper.StringWrapper.equals(((kermeta.language.structure.PrimitiveType) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(this, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.PrimitiveType\"))).createBehaviorJava(context), \"java.lang.Boolean\")), kermeta.standard.helper.StringWrapper.equals(((kermeta.language.structure.PrimitiveType) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(this, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.PrimitiveType\"))).createBehaviorJava(context), \"Boolean\"));\n\n\tif( idIfCond_568 ) {\n\n\tresult = true;\n}\n\n}\n\n}\n\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean isBooleanTypeDef(KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.language.structure.Class result = null;\n\n\tjava.lang.Boolean idIfCond_569 = false;\n\tidIfCond_569 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOf(this, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.PrimitiveType\"));\n\n\tif( idIfCond_569 ) {\n\n\tkermeta.language.structure.PrimitiveType pt = ((kermeta.language.structure.PrimitiveType) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(this, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.PrimitiveType\")));\n\n\tjava.lang.Boolean idIfCond_570 = false;\n\tidIfCond_570 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOf(pt.getInstanceType(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Class\"));\n\n\tif( idIfCond_570 ) {\n\n\tresult = ((kermeta.language.structure.Class) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(pt.getInstanceType(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Class\")));\n}\n else {\n\n\tresult = pt.getInstanceType().getClassFromPrimitiveType();\n}\n\n}\n else {\n\n\tresult = null;\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	kermeta.language.structure.Class getClassFromPrimitiveType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="kermeta.standard.JavaBoolean"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = false;\n\n\tkermeta.language.structure.Type theType = null;\n\n\tjava.lang.Boolean idIfCond_571 = false;\n\tidIfCond_571 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOf(this, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.PrimitiveType\"));\n\n\tif( idIfCond_571 ) {\n\n\ttheType = ((kermeta.language.structure.Type) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(this.getClassFromPrimitiveType(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Type\")));\n}\n else {\n\n\ttheType = this;\n}\n\n\n\tjava.lang.Boolean idIfCond_572 = false;\n\tidIfCond_572 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOf(theType, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ParameterizedType\"));\n\n\tif( idIfCond_572 ) {\n\n\tkermeta.language.structure.ParameterizedType pt = ((kermeta.language.structure.ParameterizedType) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(theType, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ParameterizedType\")));\n\n\tjava.lang.Boolean idIfCond_573 = false;\n\tidIfCond_573 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOf(pt.getTypeDefinition(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ClassDefinition\"));\n\n\tif( idIfCond_573 ) {\n\n\tresult = ((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(pt.getTypeDefinition(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ClassDefinition\"))).isValueType();\n}\n\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean isValueType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaBoolean"
	 *        annotation="kermeta documentation='/**\n\t * Tests whether the Type t corresponds to a Kermeta numerical type, which can be encoded\n\t * either as the Integer/Real PrimitiveType or the Integer/Real class.\n\t * @param t : Type\n\t * @return true or false\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = false;\n\n\tjava.lang.Boolean idIfCond_574 = false;\n\tidIfCond_574 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoid(this));\n\n\tif( idIfCond_574 ) {\n\n\tjava.lang.String tName = null;\n\n\tjava.lang.Boolean idIfCond_575 = false;\n\tidIfCond_575 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOf(this, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Class\"));\n\n\tif( idIfCond_575 ) {\n\n\ttName = ((kermeta.language.structure.ParameterizedType) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(this, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ParameterizedType\"))).getTypeDefinition().getName();\n\n\tjava.lang.Boolean idIfCond_576 = false;\n\tidIfCond_576 = kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.StringWrapper.equals(tName, \"Integer\"), kermeta.standard.helper.StringWrapper.equals(tName, \"Real\"));\n\n\tif( idIfCond_576 ) {\n\n\tresult = true;\n}\n\n}\n else {\n\n\tjava.lang.Boolean idIfCond_577 = false;\n\tidIfCond_577 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOf(this, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.PrimitiveType\"));\n\n\tif( idIfCond_577 ) {\n\n\ttName = ((kermeta.language.structure.PrimitiveType) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(this, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.PrimitiveType\"))).createBehaviorJava(context);\n\n\tjava.lang.Boolean idIfCond_578 = false;\n\tidIfCond_578 = kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.StringWrapper.equals(tName, \"Integer\"), kermeta.standard.helper.StringWrapper.equals(tName, \"Real\"));\n\n\tif( idIfCond_578 ) {\n\n\tresult = true;\n}\n\n}\n\n}\n\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean isNumericalTypeDef(KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="kermeta.standard.JavaString"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.String result = null;\n\n\tresult = null;\n\n\tjava.lang.Boolean idIfCond_579 = false;\n\tidIfCond_579 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOf(this, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Class\"));\n\n\tif( idIfCond_579 ) {\n\n\tkermeta.language.structure.ClassDefinition cd = ((kermeta.language.structure.Class) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(this, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Class\"))).getClassDefinitionAsTyped();\n\n\tresult = cd.getName();\n}\n else {\n\n\tjava.lang.Boolean idIfCond_580 = false;\n\tidIfCond_580 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOf(this, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ObjectTypeVariable\"));\n\n\tif( idIfCond_580 ) {\n\n\tkermeta.language.structure.ObjectTypeVariable otv = ((kermeta.language.structure.ObjectTypeVariable) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(this, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ObjectTypeVariable\")));\n\n\tresult = otv.getName();\n}\n else {\n\n\tjava.lang.Boolean idIfCond_581 = false;\n\tidIfCond_581 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOf(this, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.PrimitiveType\"));\n\n\tif( idIfCond_581 ) {\n\n\tkermeta.language.structure.ClassDefinition cd = this.getClassFromPrimitiveType().getClassDefinitionAsTyped();\n\n\tresult = cd.getName();\n}\n else {\n\n\tjava.lang.Boolean idIfCond_582 = false;\n\tidIfCond_582 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOf(this, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Enumeration\"));\n\n\tif( idIfCond_582 ) {\n\n\tresult = ((kermeta.language.structure.Enumeration) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(this, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Enumeration\"))).getName();\n}\n else {\n\n\tjava.lang.Boolean idIfCond_583 = false;\n\tidIfCond_583 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOf(this, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.VoidType\"));\n\n\tif( idIfCond_583 ) {\n\n\tresult = \"VoidType\";\n}\n\n}\n\n}\n\n}\n\n}\n\n\n\tjava.lang.Boolean idIfCond_584 = false;\n//BIft:orElse\n\njava.lang.Boolean result_ft98 = null;\n\n\tjava.lang.Boolean idIfCond_585 = false;\n\tidIfCond_585 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoid(result);\n\n\tif( idIfCond_585 ) {\n\n\tresult_ft98 = true;\n}\n else {\n\n\t//BIle:right\n/*This variable should be never used\052/ kermeta.language.structure.Object v_lbdExp98 = null;\n\n\tresult_ft98 = ((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.language.structure.Operation\")).isVoidType(result);\n//EIle:right\n\n}\n\n\n//CEC\nidIfCond_584 = result_ft98;\n//EIft:orElse\n\n\n\tif( idIfCond_584 ) {\n\n\tresult = \"VoidType\";\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	String getTypeName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="kermeta.standard.JavaString"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.String result = null;\n\n\tresult = null;\n\n\tjava.lang.Boolean idIfCond_586 = false;\n\tidIfCond_586 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOf(this, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Class\"));\n\n\tif( idIfCond_586 ) {\n\n\tkermeta.language.structure.ClassDefinition cd = ((kermeta.language.structure.Class) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(this, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Class\"))).getClassDefinitionAsTyped();\n\n\tresult = cd.qualifiedName();\n}\n else {\n\n\tjava.lang.Boolean idIfCond_587 = false;\n\tidIfCond_587 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOf(this, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ObjectTypeVariable\"));\n\n\tif( idIfCond_587 ) {\n\n\tkermeta.language.structure.ObjectTypeVariable otv = ((kermeta.language.structure.ObjectTypeVariable) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(this, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ObjectTypeVariable\")));\n\n\tresult = otv.qualifiedName();\n}\n else {\n\n\tjava.lang.Boolean idIfCond_588 = false;\n\tidIfCond_588 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOf(this, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.PrimitiveType\"));\n\n\tif( idIfCond_588 ) {\n\n\tkermeta.language.structure.ClassDefinition cd = this.getClassFromPrimitiveType().getClassDefinitionAsTyped();\n\n\tresult = cd.qualifiedName();\n}\n else {\n\n\tjava.lang.Boolean idIfCond_589 = false;\n\tidIfCond_589 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOf(this, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Enumeration\"));\n\n\tif( idIfCond_589 ) {\n\n\tresult = ((kermeta.language.structure.Enumeration) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(this, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Enumeration\"))).qualifiedName();\n}\n else {\n\n\tjava.lang.Boolean idIfCond_590 = false;\n\tidIfCond_590 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOf(this, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.VoidType\"));\n\n\tif( idIfCond_590 ) {\n\n\tresult = \"kermeta::language::structure::VoidType\";\n}\n\n}\n\n}\n\n}\n\n}\n\n\n\tjava.lang.Boolean idIfCond_591 = false;\n//BIft:orElse\n\njava.lang.Boolean result_ft99 = null;\n\n\tjava.lang.Boolean idIfCond_592 = false;\n\tidIfCond_592 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoid(result);\n\n\tif( idIfCond_592 ) {\n\n\tresult_ft99 = true;\n}\n else {\n\n\t//BIle:right\n/*This variable should be never used\052/ kermeta.language.structure.Object v_lbdExp99 = null;\n\n\tresult_ft99 = ((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.language.structure.Operation\")).isVoidType(result);\n//EIle:right\n\n}\n\n\n//CEC\nidIfCond_591 = result_ft99;\n//EIft:orElse\n\n\n\tif( idIfCond_591 ) {\n\n\tresult = \"kermeta::language::structure::VoidType\";\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	String getTypeQName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaBoolean"
	 *        annotation="kermeta documentation='/**\r\n \t * Implements Type.isSubTypeOf(Type)\r\n \t * For technical reason, the current implementation works only with Type that comes from a kermeta declaration (ie. in a require)\r\n \t * it won\'t work with Type created programmaticaly by the user. If you need that, please ask to the kermeta developpers\r\n \t * to extend it.\r\n \t \052/'"
	 *        annotation="kermeta RecopyInValueTypes='true'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = org.kermeta.compil.runtime.helper.language.TypeUtil.isSuperTypeOf(object, this);\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean isSubTypeOf(Type object);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="kermeta.standard.JavaBoolean"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOf(this, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.PrimitiveType\"));\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean isPrimitiveType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaBoolean"
	 *        annotation="kermeta documentation='/**\r\n\t * Implements Type.isInstance(Object)\r\n\t \052/'"
	 *        annotation="kermeta RecopyInValueTypes='true'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOf(element, this);\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean isInstance(kermeta.language.structure.Object element);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="kermeta.standard.JavaBoolean"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = false;\n\n\tjava.lang.Boolean idIfCond_593 = false;\n\tidIfCond_593 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqual(this.getEMFEDataTypeInstanceClassName(), \"\");\n\n\tif( idIfCond_593 ) {\n\n\tresult = true;\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean isEDataType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaBoolean"
	 *        annotation="kermeta documentation='/**\r\n \t * Implements Type.isSuperTypeOf(Type)\r\n \t * For technical reason, the current implementation works only with Type that comes from a kermeta declaration (ie. in a require)\r\n \t * it won\'t work with Type created programmaticaly by the user. If you need that, please ask to the kermeta developpers\r\n \t * to extend it.\r\n \t \052/'"
	 *        annotation="kermeta RecopyInValueTypes='true'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = (java.lang.Boolean) org.kermeta.compil.runtime.helper.language.TypeUtil.hasSubType(this, object);\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean isSuperTypeOf(Type object);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="kermeta.standard.JavaBoolean"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOf(this, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Enumeration\"));\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean isEnumeration();

} // Type
