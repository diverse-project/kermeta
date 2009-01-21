/**
 * <copyright>
 * </copyright>
 *
 * $Id: Operation.java,v 1.10 2009-01-21 09:15:59 cfaucher Exp $
 */
package kermeta.language.structure;

import ecore.EOperation;

import kermeta.language.behavior.Expression;
import kermeta.language.behavior.LambdaExpression;

import kermeta.standard.Sequence;

import km2ecore.KM2EcoreContext;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kermeta.language.structure.Operation#getTypeParameter <em>Type Parameter</em>}</li>
 *   <li>{@link kermeta.language.structure.Operation#getBody <em>Body</em>}</li>
 *   <li>{@link kermeta.language.structure.Operation#getCuid <em>Cuid</em>}</li>
 *   <li>{@link kermeta.language.structure.Operation#getOwnedParameter <em>Owned Parameter</em>}</li>
 *   <li>{@link kermeta.language.structure.Operation#getIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link kermeta.language.structure.Operation#getPost <em>Post</em>}</li>
 *   <li>{@link kermeta.language.structure.Operation#getRaisedException <em>Raised Exception</em>}</li>
 *   <li>{@link kermeta.language.structure.Operation#getPre <em>Pre</em>}</li>
 *   <li>{@link kermeta.language.structure.Operation#getSuperOperation <em>Super Operation</em>}</li>
 *   <li>{@link kermeta.language.structure.Operation#getLambdaExpression <em>Lambda Expression</em>}</li>
 *   <li>{@link kermeta.language.structure.Operation#getOwningClass <em>Owning Class</em>}</li>
 * </ul>
 * </p>
 *
 * @see kermeta.language.structure.StructurePackage#getOperation()
 * @model annotation="kermeta documentation='/** We have to visit operation in order to print the result initialization and the return statement \052/'"
 *        annotation="kermeta documentation='Every one knows what an operation is.'"
 *        annotation="kermeta documentation='/**\r\n *\r\n \052/'"
 * @generated
 */
public interface Operation extends MultiplicityElement,
		Traceability<EOperation> {
	/**
	 * Returns the value of the '<em><b>Type Parameter</b></em>' reference list.
	 * The list contents are of type {@link kermeta.language.structure.TypeVariable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Parameter</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Parameter</em>' reference list.
	 * @see kermeta.language.structure.StructurePackage#getOperation_TypeParameter()
	 * @model annotation="kermeta documentation='TypeParameters of the Operation'"
	 * @generated
	 */
	EList<TypeVariable> getTypeParameter();

	/**
	 * Returns the value of the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' containment reference.
	 * @see #setBody(Expression)
	 * @see kermeta.language.structure.StructurePackage#getOperation_Body()
	 * @model containment="true" resolveProxies="true"
	 *        annotation="kermeta documentation='Body of the Operation, expressed as a KerMeta expression'"
	 * @generated
	 */
	Expression getBody();

	/**
	 * Sets the value of the '{@link kermeta.language.structure.Operation#getBody <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' containment reference.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(Expression value);

	/**
	 * Returns the value of the '<em><b>Cuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cuid</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cuid</em>' attribute.
	 * @see #setCuid(String)
	 * @see kermeta.language.structure.StructurePackage#getOperation_Cuid()
	 * @model dataType="kermeta.standard.JavaString"
	 * @generated
	 */
	String getCuid();

	/**
	 * Sets the value of the '{@link kermeta.language.structure.Operation#getCuid <em>Cuid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cuid</em>' attribute.
	 * @see #getCuid()
	 * @generated
	 */
	void setCuid(String value);

	/**
	 * Returns the value of the '<em><b>Owned Parameter</b></em>' containment reference list.
	 * The list contents are of type {@link kermeta.language.structure.Parameter}.
	 * It is bidirectional and its opposite is '{@link kermeta.language.structure.Parameter#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Parameter</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Parameter</em>' containment reference list.
	 * @see kermeta.language.structure.StructurePackage#getOperation_OwnedParameter()
	 * @see kermeta.language.structure.Parameter#getOperation
	 * @model opposite="operation" containment="true" resolveProxies="true"
	 *        annotation="kermeta documentation='Parameters of the Operation'"
	 * @generated
	 */
	EList<Parameter> getOwnedParameter();

	/**
	 * Returns the value of the '<em><b>Is Abstract</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Abstract</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Abstract</em>' attribute.
	 * @see #setIsAbstract(Boolean)
	 * @see kermeta.language.structure.StructurePackage#getOperation_IsAbstract()
	 * @model default="false" dataType="kermeta.standard.JavaBoolean"
	 *        annotation="kermeta documentation='Boolean stating whether the Operation is abstract'"
	 * @generated
	 */
	Boolean getIsAbstract();

	/**
	 * Sets the value of the '{@link kermeta.language.structure.Operation#getIsAbstract <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Abstract</em>' attribute.
	 * @see #getIsAbstract()
	 * @generated
	 */
	void setIsAbstract(Boolean value);

	/**
	 * Returns the value of the '<em><b>Post</b></em>' containment reference list.
	 * The list contents are of type {@link kermeta.language.structure.Constraint}.
	 * It is bidirectional and its opposite is '{@link kermeta.language.structure.Constraint#getPostOwner <em>Post Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Post</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Post</em>' containment reference list.
	 * @see kermeta.language.structure.StructurePackage#getOperation_Post()
	 * @see kermeta.language.structure.Constraint#getPostOwner
	 * @model opposite="postOwner" containment="true" resolveProxies="true"
	 *        annotation="kermeta documentation='Post-conditions of the Operation'"
	 * @generated
	 */
	EList<Constraint> getPost();

	/**
	 * Returns the value of the '<em><b>Raised Exception</b></em>' reference list.
	 * The list contents are of type {@link kermeta.language.structure.Type}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Raised Exception</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Raised Exception</em>' reference list.
	 * @see kermeta.language.structure.StructurePackage#getOperation_RaisedException()
	 * @model annotation="kermeta documentation='Exceptions raised by the Operation'"
	 * @generated
	 */
	EList<Type> getRaisedException();

	/**
	 * Returns the value of the '<em><b>Pre</b></em>' containment reference list.
	 * The list contents are of type {@link kermeta.language.structure.Constraint}.
	 * It is bidirectional and its opposite is '{@link kermeta.language.structure.Constraint#getPreOwner <em>Pre Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pre</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pre</em>' containment reference list.
	 * @see kermeta.language.structure.StructurePackage#getOperation_Pre()
	 * @see kermeta.language.structure.Constraint#getPreOwner
	 * @model opposite="preOwner" containment="true" resolveProxies="true"
	 *        annotation="kermeta documentation='Pre-conditions of the Operation'"
	 * @generated
	 */
	EList<Constraint> getPre();

	/**
	 * Returns the value of the '<em><b>Super Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Super Operation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super Operation</em>' reference.
	 * @see #setSuperOperation(Operation)
	 * @see kermeta.language.structure.StructurePackage#getOperation_SuperOperation()
	 * @model annotation="kermeta documentation='Super-operation of the Operation, if any'"
	 * @generated
	 */
	Operation getSuperOperation();

	/**
	 * Sets the value of the '{@link kermeta.language.structure.Operation#getSuperOperation <em>Super Operation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Super Operation</em>' reference.
	 * @see #getSuperOperation()
	 * @generated
	 */
	void setSuperOperation(Operation value);

	/**
	 * Returns the value of the '<em><b>Lambda Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lambda Expression</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lambda Expression</em>' reference.
	 * @see #setLambdaExpression(LambdaExpression)
	 * @see kermeta.language.structure.StructurePackage#getOperation_LambdaExpression()
	 * @model
	 * @generated
	 */
	LambdaExpression getLambdaExpression();

	/**
	 * Sets the value of the '{@link kermeta.language.structure.Operation#getLambdaExpression <em>Lambda Expression</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lambda Expression</em>' reference.
	 * @see #getLambdaExpression()
	 * @generated
	 */
	void setLambdaExpression(LambdaExpression value);

	/**
	 * Returns the value of the '<em><b>Owning Class</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link kermeta.language.structure.ClassDefinition#getOwnedOperation <em>Owned Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owning Class</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owning Class</em>' container reference.
	 * @see #setOwningClass(ClassDefinition)
	 * @see kermeta.language.structure.StructurePackage#getOperation_OwningClass()
	 * @see kermeta.language.structure.ClassDefinition#getOwnedOperation
	 * @model opposite="ownedOperation" transient="false"
	 *        annotation="kermeta documentation='ClassDefinition owning the Operation'"
	 * @generated
	 */
	ClassDefinition getOwningClass();

	/**
	 * Sets the value of the '{@link kermeta.language.structure.Operation#getOwningClass <em>Owning Class</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Class</em>' container reference.
	 * @see #getOwningClass()
	 * @generated
	 */
	void setOwningClass(ClassDefinition value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="kermeta.standard.JavaBoolean"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = false;\n\n\tkermeta.language.structure.Parameter param = null;\n//BIft:detect\n\nkermeta.language.structure.Parameter result_ft76 = null;\n\n\tkermeta.language.structure.Parameter elem_ft76 = null;\n\n\tresult_ft76 = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Parameter> it_ft76 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Parameter>convertAsOrderedSet(this.getOwnedParameter()).iterator();\n\tjava.lang.Boolean idLoopCond_170 = false;\n\twhile( !idLoopCond_170 ) {\n\tidLoopCond_170 = kermeta.standard.helper.BooleanWrapper.or(it_ft76.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(result_ft76, null));\n\tif ( idLoopCond_170 ) {\n\t} else {\n\n\telem_ft76 = it_ft76.next();\n\n\tjava.lang.Boolean idIfCond_171 = false;\n//BIle:detector\nkermeta.language.structure.Parameter param_lbdExp76 = elem_ft76;\n\n\tidIfCond_171 = kermeta.standard.helper.BooleanWrapper.not(param_lbdExp76.isRunnable());\n//EIle:detector\n\n\n\tif( idIfCond_171 ) {\n\n\tresult_ft76 = elem_ft76;\n}\n\n}\n\t}\n}\n\n\n//CE\nparam = result_ft76;\n//EIft:detect\n\n\n\tjava.lang.Boolean idIfCond_172 = false;\n\tidIfCond_172 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(param);\n\n\tif( idIfCond_172 ) {\n\n\tresult = true;\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean isRunnable();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaString"
	 *        annotation="kermeta superOperation='kermeta::language::structure::Object'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.String result = null;\n\n\tresult = null;\n\n\tkermeta.utils.StringBuffer javaCode = ((kermeta.utils.StringBuffer) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.utils.UtilsPackage.eINSTANCE.getStringBuffer()));\n\n\tjava.lang.Boolean idIfCond_173 = false;\n\tidIfCond_173 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(this.getBody()));\n\n\tif( idIfCond_173 ) {\n\n\tjava.lang.String type_label = \"\";\n\n\tjava.lang.Boolean idIfCond_174 = false;\n\tidIfCond_174 = context.getFtSuffixActivation();\n\n\tif( idIfCond_174 ) {\n\n\ttype_label = context.getFtReturnType();\n\n\tcontext.setFtReturnType(\"\");\n}\n else {\n\n\ttype_label = ((km2ecore.helper.kermeta.CompilerHelperJava) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(km2ecore.helper.kermeta.KermetaPackage.eINSTANCE.getCompilerHelperJava())).ppTypeFromMultiplicityElement(this, context);\n}\n\n\n\tjava.lang.Boolean idIfCond_175 = false;\n\tidIfCond_175 = kermeta.standard.helper.BooleanWrapper.not(this.isVoidType(type_label));\n\n\tif( idIfCond_175 ) {\n\n\tjavaCode.append(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(\"\\n\", type_label), \" result\"), context.printFtSuffix()), \" = null;\\n\"));\n}\n\n\n\tjavaCode.append(this.createBehaviorJavaFromPre(context));\n\n\tjavaCode.append(this.getBody().createBehaviorJava(context));\n\n\tjavaCode.append(this.createBehaviorJavaFromPost(context));\n\n\tjava.lang.Boolean idIfCond_176 = false;\n\tidIfCond_176 = kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.BooleanWrapper.not(this.isVoidType(type_label)), kermeta.standard.helper.BooleanWrapper.not(context.getFtSuffixActivation()));\n\n\tif( idIfCond_176 ) {\n\n\tjavaCode.append(this.ppReturnResult(context));\n}\n\n}\n else {\n\n\tjava.lang.Boolean idIfCond_177 = false;\n\tidIfCond_177 = kermeta.standard.helper.BooleanWrapper.not(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.language.structure.StructurePackage.eINSTANCE.getOperation())).isVoidType(this.getType().getTypeQName()));\n\n\tif( idIfCond_177 ) {\n\n\tjavaCode.append(kermeta.standard.helper.StringWrapper.plus(((km2ecore.helper.kermeta.CompilerHelperJava) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(km2ecore.helper.kermeta.KermetaPackage.eINSTANCE.getCompilerHelperJava())).ppTypeFromMultiplicityElement(this, context), \" result = null;\\n\"));\n\n\tjavaCode.append(this.ppReturnResult(context));\n}\n\n}\n\n\n\tjava.lang.Boolean idIfCond_178 = false;\n\tidIfCond_178 = kermeta.standard.helper.BooleanWrapper.and(org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(context.getTasks_stack().peek(), context.getFUNCTION_TYPE_COMPILATION_TASK()), org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(context.getCurrent_valueType()));\n\n\tif( idIfCond_178 ) {\n\n\t((km2ecore.helper.ecore.EAnnotationHelper) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(km2ecore.helper.ecore.EcorePackage.eINSTANCE.getEAnnotationHelper())).addAnnotationGenModelImpl(this.getEcoreModelElement(), javaCode.toString());\n}\n\n\n\tresult = javaCode.toString();\n\nreturn result;\n'"
	 * @generated
	 */
	String createBehaviorJava(KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaBoolean"
	 *        annotation="kermeta documentation='/**\r\n\t * Helper method to determine if an operation has to be compiled\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = true;\n\n\tkermeta.language.structure.ClassDefinition cd_container = ((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(this), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ClassDefinition\")));\n\n\tjava.lang.Boolean idIfCond_179 = false;\n\tidIfCond_179 = cd_container.isValueType();\n\n\tif( idIfCond_179 ) {\n\n\tjava.lang.Boolean idIfCond_180 = false;\n\tidIfCond_180 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(cd_container.getEMFInstanceClassName(), \"\");\n\n\tif( idIfCond_180 ) {\n\n\tresult = false;\n}\n\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean mustBeCompiled();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaString"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.String result = null;\n\n\tresult = \"\";\n\n\tjava.lang.Boolean idIfCond_181 = false;\n\tidIfCond_181 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(this.getBody(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.Block\"));\n\n\tif( idIfCond_181 ) {\n\n\tjava.lang.Boolean idIfCond_182 = false;\n\tidIfCond_182 = kermeta.standard.helper.IntegerWrapper.equals(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.behavior.Expression>convertAsOrderedSet(((kermeta.language.behavior.Block) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(this.getBody(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.Block\"))).getStatement()).size(), 1);\n\n\tif( idIfCond_182 ) {\n\n\tjava.lang.Boolean idIfCond_183 = false;\n\tidIfCond_183 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.behavior.Expression>convertAsOrderedSet(((kermeta.language.behavior.Block) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(this.getBody(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.Block\"))).getStatement()), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.JavaStaticCall\"));\n\n\tif( idIfCond_183 ) {\n\n\tkermeta.standard.Sequence<java.lang.String> static_call_set_1 = kermeta.standard.helper.StringWrapper.split(((kermeta.language.behavior.JavaStaticCall) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.behavior.Expression>convertAsOrderedSet(((kermeta.language.behavior.Block) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(this.getBody(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.Block\"))).getStatement()), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.JavaStaticCall\"))).createBehaviorJava(context), \"(\");\n\n\tresult = static_call_set_1.first();\n}\n else {\n\n\tjava.lang.Boolean idIfCond_184 = false;\n\tidIfCond_184 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.behavior.Expression>convertAsOrderedSet(((kermeta.language.behavior.Block) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(this.getBody(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.Block\"))).getStatement()), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.Assignment\"));\n\n\tif( idIfCond_184 ) {\n\n\tjava.lang.Boolean idIfCond_185 = false;\n\tidIfCond_185 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(((kermeta.language.behavior.Assignment) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.behavior.Expression>convertAsOrderedSet(((kermeta.language.behavior.Block) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(this.getBody(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.Block\"))).getStatement()), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.Assignment\"))).getValue(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.JavaStaticCall\"));\n\n\tif( idIfCond_185 ) {\n\n\tkermeta.standard.Sequence<java.lang.String> static_call_set_2 = kermeta.standard.helper.StringWrapper.split(((kermeta.language.behavior.JavaStaticCall) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(((kermeta.language.behavior.Assignment) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.behavior.Expression>convertAsOrderedSet(((kermeta.language.behavior.Block) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(this.getBody(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.Block\"))).getStatement()), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.Assignment\"))).getValue(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.JavaStaticCall\"))).createBehaviorJava(context), \"(\");\n\n\tresult = static_call_set_2.first();\n}\n\n}\n\n}\n\n}\n\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	String getOptimizedStaticCall(KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaString"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.String result = null;\n\n\tresult = \"\";\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Constraint> it_ft77 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Constraint>convertAsOrderedSet(this.getPost()).iterator();\n\tjava.lang.Boolean idLoopCond_186 = false;\n\twhile( !idLoopCond_186 ) {\n\tidLoopCond_186 = it_ft77.isOff();\n\tif ( idLoopCond_186 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Constraint constraint_lbdExp77 = it_ft77.next();\n\n\tcontext.getResultLastStatementStack().push(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(\"result_post = \", context.getTYPE_SEPARATOR()), \"java.lang.Boolean\"));\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(result, \"\\nif( \"), context.getJAVA_CLASS_EXECUTION_CONTEXT()), \".getInstance().mustBeChecked( \\\"post__\"), kermeta.standard.helper.IntegerWrapper.toString(org.kermeta.compil.runtime.helper.language.ObjectUtil.oidSwitcher(constraint_lbdExp77))), \"__\"), constraint_lbdExp77.getName()), \"\\\" ) ) {\\n\");\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(result, \"java.lang.Boolean result_post = false;\\n\");\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(result, constraint_lbdExp77.createBehaviorJava(context)), \"\\n\");\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(result, \"if( !result_post ) {\\n\");\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(result, \"kermeta.exceptions.ConstraintViolatedPost exp = kermeta.exceptions.ExceptionsFactory.eINSTANCE.createConstraintViolatedPost();\\n\");\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(result, \"throw new \"), context.getJAVA_CLASS_EXCEPTION_SWITCHER()), \"(exp);\\n\");\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(result, \"}\\n\");\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(result, \"}\\n\");\n\n\tcontext.getResultLastStatementStack().pop();\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\tjava.lang.Boolean idIfCond_187 = false;\n\tidIfCond_187 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(result, \"\");\n\n\tif( idIfCond_187 ) {\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(\"\\n//PostConditions Checking\\n{\", result), \"}\");\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	String createBehaviorJavaFromPost(KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta superOperation='kermeta::language::structure::Object'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tecore.EOperation ecoreOperation = this.createEcoreModelElement(context);\n\n\tkermeta.language.structure.ClassDefinition c = null;\n\n\tc = (kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeOrVoid(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(this), \"kermeta.language.structure.ClassDefinition\");\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EOperation>convertAsOrderedSet(c.getEcoreModelElement().getEOperations()).add(ecoreOperation);\n\n\tthis.setEcoreModelElement(ecoreOperation);\n\n\t//BIft:eachOwnedElement\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Tag> it_ft79 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Tag>convertAsOrderedSet(this.getOwnedTags()).iterator();\n\tjava.lang.Boolean idLoopCond_188 = false;\n\twhile( !idLoopCond_188 ) {\n\tidLoopCond_188 = it_ft79.isOff();\n\tif ( idLoopCond_188 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Tag o_lbdExp79 = it_ft79.next();\n\n\t//BIle:func\nkermeta.language.structure.Tag o_lbdExp78 = o_lbdExp79;\n\n\to_lbdExp78.applyPass1(context);\n//EIle:func\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Parameter> it_ft80 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Parameter>convertAsOrderedSet(this.getOwnedParameter()).iterator();\n\tjava.lang.Boolean idLoopCond_189 = false;\n\twhile( !idLoopCond_189 ) {\n\tidLoopCond_189 = it_ft80.isOff();\n\tif ( idLoopCond_189 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Parameter o_lbdExp80 = it_ft80.next();\n\n\t//BIle:func\nkermeta.language.structure.Parameter o_lbdExp78 = o_lbdExp80;\n\n\to_lbdExp78.applyPass1(context);\n//EIle:func\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Constraint> it_ft81 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Constraint>convertAsOrderedSet(this.getPre()).iterator();\n\tjava.lang.Boolean idLoopCond_190 = false;\n\twhile( !idLoopCond_190 ) {\n\tidLoopCond_190 = it_ft81.isOff();\n\tif ( idLoopCond_190 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Constraint o_lbdExp81 = it_ft81.next();\n\n\t//BIle:func\nkermeta.language.structure.Constraint o_lbdExp78 = o_lbdExp81;\n\n\to_lbdExp78.applyPass1(context);\n//EIle:func\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Constraint> it_ft82 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Constraint>convertAsOrderedSet(this.getPost()).iterator();\n\tjava.lang.Boolean idLoopCond_191 = false;\n\twhile( !idLoopCond_191 ) {\n\tidLoopCond_191 = it_ft82.isOff();\n\tif ( idLoopCond_191 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Constraint o_lbdExp82 = it_ft82.next();\n\n\t//BIle:func\nkermeta.language.structure.Constraint o_lbdExp78 = o_lbdExp82;\n\n\to_lbdExp78.applyPass1(context);\n//EIle:func\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.TypeVariable> it_ft83 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.TypeVariable>convertAsOrderedSet(this.getTypeParameter()).iterator();\n\tjava.lang.Boolean idLoopCond_192 = false;\n\twhile( !idLoopCond_192 ) {\n\tidLoopCond_192 = it_ft83.isOff();\n\tif ( idLoopCond_192 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.TypeVariable t_lbdExp83 = it_ft83.next();\n\n\t//BIle:func\nkermeta.language.structure.TypeVariable o_lbdExp78 = t_lbdExp83;\n\n\to_lbdExp78.applyPass1(context);\n//EIle:func\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n//EIft:eachOwnedElement\n\n'"
	 * @generated
	 */
	void applyPass1(KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta superOperation='kermeta::language::structure::Object'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tjava.lang.Boolean idIfCond_193 = false;\n\tidIfCond_193 = kermeta.standard.helper.BooleanWrapper.not(this.isFunctionType());\n\n\tif( idIfCond_193 ) {\n\n\tthis.setLinks(context);\n\n\tkermeta.language.structure.helper.ObjectSuper.super_applyPass2(this, context);\n}\n\n'"
	 * @generated
	 */
	void applyPass2(KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tkermeta.language.structure.LinkSetterForTypedElement s = ((kermeta.language.structure.LinkSetterForTypedElement) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.language.structure.StructurePackage.eINSTANCE.getLinkSetterForTypedElement()));\n\n\ts.setLinks(this, this.getEcoreModelElement(), context);\n\n\tjava.lang.Boolean idIfCond_194 = false;\n\tidIfCond_194 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(this.getSuperOperation()));\n\n\tif( idIfCond_194 ) {\n\n\tjava.lang.String qualifiedName = this.getSuperOperation().getOwningClass().qualifiedName();\n\n\tecore.EAnnotation ecoreAnnotation = ((km2ecore.helper.ecore.EAnnotationHelper) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(km2ecore.helper.ecore.EcorePackage.eINSTANCE.getEAnnotationHelper())).createKermetaEAnnotation(kermeta.standard.helper.StringWrapper.toString(km2ecore.helper.ecore.KermetaEAnnotationKey.getByName(\"superOperation\").getName()), qualifiedName);\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EAnnotation>convertAsOrderedSet(this.getEcoreModelElement().getEAnnotations()).add(ecoreAnnotation);\n}\n\n'"
	 * @generated
	 */
	void setLinks(KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="kermeta.standard.JavaBoolean"
	 *        annotation="kermeta documentation='/**\r\n\t * Return true if the given operation is a FunctionType\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = false;\n\n\tjava.lang.Boolean idIfCond_195 = false;\n\tidIfCond_195 = kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(this.getFunctionTypeParameter())), kermeta.standard.helper.IntegerWrapper.isGreater(this.getFunctionTypeParameter().size(), 0));\n\n\tif( idIfCond_195 ) {\n\n\tresult = true;\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean isFunctionType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\r\n\t * Compiling in Simk mode all the methods (inherited methods included) from ValueType\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tsimk.SMContext sMContext = context.getSimkModel().retrieveOrCreateContextForWrapper(this, context);\n\n\tjava.lang.Boolean idIfCond_196 = false;\n\tidIfCond_196 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(sMContext));\n\n\tif( idIfCond_196 ) {\n\n\tsimk.SMMethod staticMethod = ((simk.SMMethod) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(simk.SimkPackage.eINSTANCE.getSMMethod()));\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<simk.SMMethod>convertAsOrderedSet(context.getSimkModel().getSMMethods()).add(staticMethod);\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<simk.SMMethod>convertAsOrderedSet(sMContext.getSMMethods()).add(staticMethod);\n\n\tstaticMethod.setName(this.getName());\n\n\tstaticMethod.setWrapperUsage();\n\n\tsimk.SMParameter self_param = ((simk.SMParameter) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(simk.SimkPackage.eINSTANCE.getSMParameter()));\n\n\tself_param.setName(\"self\");\n\n\tjava.lang.Boolean idIfCond_197 = false;\n\tidIfCond_197 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(this.getWrapperValueTypeSelfExpression(), \"\");\n\n\tif( idIfCond_197 ) {\n\n\tkermeta.utils.Hashtable<java.lang.String, java.lang.String> map_infos = kermeta.standard.helper.StringWrapper.getPropertyInfos(this.getWrapperValueTypeSelfExpression());\n\n\tjava.lang.String map_value = map_infos.getValue(context.getCurrent_valueType().getEMFInstanceClassName());\n\n\tjava.lang.Boolean idIfCond_198 = false;\n\tidIfCond_198 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(map_value));\n\n\tif( idIfCond_198 ) {\n\n\tself_param.setType(map_value);\n}\n\n}\n\n\n\tjava.lang.Boolean idIfCond_199 = false;\n\tidIfCond_199 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(self_param.getType());\n\n\tif( idIfCond_199 ) {\n\n\tself_param.setType(context.getCurrent_valueType().getEMFInstanceClassName());\n}\n\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<simk.SMParameter>convertAsOrderedSet(staticMethod.getSMParameters()).add(self_param);\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Parameter> it_ft84 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Parameter>convertAsOrderedSet(this.getOwnedParameter()).iterator();\n\tjava.lang.Boolean idLoopCond_200 = false;\n\twhile( !idLoopCond_200 ) {\n\tidLoopCond_200 = it_ft84.isOff();\n\tif ( idLoopCond_200 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Parameter p_lbdExp84 = it_ft84.next();\n\n\tsimk.SMParameter param = ((simk.SMParameter) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(simk.SimkPackage.eINSTANCE.getSMParameter()));\n\n\tparam.setName(p_lbdExp84.getName());\n\n\tjava.lang.Boolean idIfCond_201 = false;\n\tidIfCond_201 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(p_lbdExp84.getType(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.FunctionType\")));\n\n\tif( idIfCond_201 ) {\n\n\tjava.lang.Boolean idIfCond_202 = false;\n\tidIfCond_202 = kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.StringWrapper.equals(p_lbdExp84.getType().getTypeQName(), ((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(this), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ClassDefinition\"))).qualifiedName()), kermeta.standard.helper.StringWrapper.equals(p_lbdExp84.getType().getTypeQName(), \"kermeta::language::structure::Object\"));\n\n\tif( idIfCond_202 ) {\n\n\tparam.setType(context.getCurrent_valueType().getEMFInstanceClassName());\n}\n else {\n\n\tparam.setType(p_lbdExp84.getType().createBehaviorJava(context));\n\n\tjava.lang.Boolean idIfCond_203 = false;\n\tidIfCond_203 = ((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.language.structure.StructurePackage.eINSTANCE.getOperation())).isVoidType(param.getType());\n\n\tif( idIfCond_203 ) {\n\n\tparam.setType(\"void\");\n}\n\n}\n\n}\n else {\n}\n\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<simk.SMParameter>convertAsOrderedSet(staticMethod.getSMParameters()).add(param);\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\tsimk.SMReturn sMReturn = ((simk.SMReturn) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(simk.SimkPackage.eINSTANCE.getSMReturn()));\n\n\tstaticMethod.setSMReturn(sMReturn);\n\n\tjava.lang.Boolean idIfCond_204 = false;\n\tidIfCond_204 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(this.getWrapperValueTypeReturnType(), \"\");\n\n\tif( idIfCond_204 ) {\n\n\tkermeta.utils.Hashtable<java.lang.String, java.lang.String> map_infos = kermeta.standard.helper.StringWrapper.getPropertyInfos(this.getWrapperValueTypeReturnType());\n\n\tjava.lang.String map_value = map_infos.getValue(context.getCurrent_valueType().getEMFInstanceClassName());\n\n\tjava.lang.Boolean idIfCond_205 = false;\n\tidIfCond_205 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(map_value));\n\n\tif( idIfCond_205 ) {\n\n\tsMReturn.setType(map_value);\n}\n\n}\n\n\n\tjava.lang.Boolean idIfCond_206 = false;\n\tidIfCond_206 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(sMReturn.getType());\n\n\tif( idIfCond_206 ) {\n\n\tsMReturn.setType(this.getType().createBehaviorJava(context));\n\n\tjava.lang.Boolean idIfCond_207 = false;\n\tidIfCond_207 = ((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.language.structure.StructurePackage.eINSTANCE.getOperation())).isVoidType(sMReturn.getType());\n\n\tif( idIfCond_207 ) {\n\n\tsMReturn.setType(\"void\");\n}\n\n}\n\n\n\tstaticMethod.setBody(\"//Protection of the following code\\n\");\n\n\tjava.lang.Boolean idIfCond_208 = false;\n\tidIfCond_208 = kermeta.standard.helper.StringWrapper.equals(this.getName(), \"equals\");\n\n\tif( idIfCond_208 ) {\n\n\tstaticMethod.setBody(kermeta.standard.helper.StringWrapper.plus(staticMethod.getBody(), \"if( self == null || \"));\n\n\tstaticMethod.setBody(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(staticMethod.getBody(), org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Parameter>convertAsOrderedSet(this.getOwnedParameter()).first().getName()), \" == null ) {\\n\"));\n\n\tstaticMethod.setBody(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(staticMethod.getBody(), \"return self == \"), org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Parameter>convertAsOrderedSet(this.getOwnedParameter()).first().getName()), \";\\n\"));\n\n\tstaticMethod.setBody(kermeta.standard.helper.StringWrapper.plus(staticMethod.getBody(), \"}\\n\\n\"));\n}\n\n\n\tjava.lang.Boolean idIfCond_209 = false;\n\tidIfCond_209 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<java.lang.String>convertAsOrderedSet(context.getFrameworkOperations()).contains(this.getName());\n\n\tif( idIfCond_209 ) {\n\n\tstaticMethod.setBody(kermeta.standard.helper.StringWrapper.plus(staticMethod.getBody(), \"if( self == null || ((java.lang.Object) self) instanceof kermeta.language.structure.Object ) {\\n\"));\n\n\tjava.lang.Boolean idIfCond_210 = false;\n\tidIfCond_210 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(staticMethod.getSMReturn().getType(), \"void\");\n\n\tif( idIfCond_210 ) {\n\n\tstaticMethod.setBody(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(staticMethod.getBody(), \"return (\"), staticMethod.getSMReturn().getType()), \") \"));\n}\n\n\n\tstaticMethod.setBody(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(staticMethod.getBody(), context.getOBJECT_UTIL_CLASS()), \".\"), this.getName()), \"((kermeta.language.structure.Object) ((java.lang.Object) self)\"));\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Parameter> it_ft85 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Parameter>convertAsOrderedSet(this.getOwnedParameter()).iterator();\n\tjava.lang.Boolean idLoopCond_211 = false;\n\twhile( !idLoopCond_211 ) {\n\tidLoopCond_211 = it_ft85.isOff();\n\tif ( idLoopCond_211 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Parameter p_lbdExp85 = it_ft85.next();\n\n\tstaticMethod.setBody(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(staticMethod.getBody(), \", \"), p_lbdExp85.getName()));\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\tstaticMethod.setBody(kermeta.standard.helper.StringWrapper.plus(staticMethod.getBody(), \");\\n\"));\n}\n else {\n\n\tstaticMethod.setBody(kermeta.standard.helper.StringWrapper.plus(staticMethod.getBody(), \"if( self == null ) {\\n\"));\n\n\tstaticMethod.setBody(kermeta.standard.helper.StringWrapper.plus(staticMethod.getBody(), \"kermeta.exceptions.CallOnVoidTarget exp = kermeta.exceptions.ExceptionsFactory.eINSTANCE.createCallOnVoidTarget();\\n\"));\n\n\tstaticMethod.setBody(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(staticMethod.getBody(), \"exp.setMessage(\\\"Initialize the \"), context.getCurrent_valueType().getName()), \" expression\\\");\\n\"));\n\n\tstaticMethod.setBody(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(staticMethod.getBody(), \"throw new \"), context.getJAVA_CLASS_EXCEPTION_SWITCHER()), \"(exp);\\n\"));\n}\n\n\n\tstaticMethod.setBody(kermeta.standard.helper.StringWrapper.plus(staticMethod.getBody(), \"}\\n//End of the protection\\n\\n\"));\n\n\tstaticMethod.setBody(kermeta.standard.helper.StringWrapper.plus(staticMethod.getBody(), this.createBehaviorJava(context)));\n}\n\n'"
	 * @generated
	 */
	void compilingInSimkMode(KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaBoolean"
	 *        annotation="kermeta documentation='/**\r\n\t * Unused for the moment\r\n\t \052/'"
	 *        annotation="kermeta deprecated=''"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = false;\n\n\tjava.lang.Boolean idIfCond_212 = false;\n\tidIfCond_212 = kermeta.standard.helper.BooleanWrapper.or(this.getType().isValueType(), this.hasAValueTypedParameter());\n\n\tif( idIfCond_212 ) {\n\n\tresult = true;\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean mustBeDuplicated();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaString"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.String result = null;\n\n\tresult = \"\";\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Constraint> it_ft86 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Constraint>convertAsOrderedSet(this.getPre()).iterator();\n\tjava.lang.Boolean idLoopCond_213 = false;\n\twhile( !idLoopCond_213 ) {\n\tidLoopCond_213 = it_ft86.isOff();\n\tif ( idLoopCond_213 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Constraint constraint_lbdExp86 = it_ft86.next();\n\n\tcontext.getResultLastStatementStack().push(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(\"result_pre = \", context.getTYPE_SEPARATOR()), \"java.lang.Boolean\"));\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(result, \"\\nif( \"), context.getJAVA_CLASS_EXECUTION_CONTEXT()), \".getInstance().mustBeChecked( \\\"pre__\"), kermeta.standard.helper.IntegerWrapper.toString(org.kermeta.compil.runtime.helper.language.ObjectUtil.oidSwitcher(constraint_lbdExp86))), \"__\"), constraint_lbdExp86.getName()), \"\\\" ) ) {\\n\");\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(result, \"java.lang.Boolean result_pre = false;\\n\");\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(result, constraint_lbdExp86.createBehaviorJava(context)), \"\\n\");\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(result, \"if( !result_pre ) {\\n\");\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(result, \"kermeta.exceptions.ConstraintViolatedPre exp = kermeta.exceptions.ExceptionsFactory.eINSTANCE.createConstraintViolatedPre();\\n\");\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(result, \"throw new \"), context.getJAVA_CLASS_EXCEPTION_SWITCHER()), \"(exp);\\n\");\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(result, \"}\\n\");\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(result, \"}\\n\");\n\n\tcontext.getResultLastStatementStack().pop();\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\tjava.lang.Boolean idIfCond_214 = false;\n\tidIfCond_214 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(result, \"\");\n\n\tif( idIfCond_214 ) {\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(\"\\n//PreConditions Checking\\n{\", result), \"}\");\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	String createBehaviorJavaFromPre(KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.standard.Sequence<kermeta.language.structure.Parameter> result = null;\n\n\tresult = null;\n\n\tkermeta.standard.Sequence<kermeta.language.structure.Parameter> ft_parameters = null;\n//BIft:select\n\nkermeta.standard.Sequence<kermeta.language.structure.Parameter> result_ft87 = null;\n\n\tkermeta.language.structure.Parameter elem_ft87 = null;\n\n\tresult_ft87 = ((kermeta.standard.Sequence<kermeta.language.structure.Parameter>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.standard.StandardPackage.eINSTANCE.getSequence()));\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Parameter> it_ft87 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Parameter>convertAsOrderedSet(this.getOwnedParameter()).iterator();\n\tjava.lang.Boolean idLoopCond_215 = false;\n\twhile( !idLoopCond_215 ) {\n\tidLoopCond_215 = it_ft87.isOff();\n\tif ( idLoopCond_215 ) {\n\t} else {\n\n\telem_ft87 = it_ft87.next();\n\n\tjava.lang.Boolean idIfCond_216 = false;\n//BIle:selector\nkermeta.language.structure.Parameter p_lbdExp87 = elem_ft87;\n\n\tidIfCond_216 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(p_lbdExp87.getType(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.FunctionType\"));\n//EIle:selector\n\n\n\tif( idIfCond_216 ) {\n\n\tresult_ft87.add(elem_ft87);\n}\n\n}\n\t}\n}\n\n\n//CE\nft_parameters = result_ft87;\n//EIft:select\n\n\n\tresult = ft_parameters;\n\nreturn result;\n'"
	 * @generated
	 */
	Sequence<Parameter> getFunctionTypeParameter();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaBoolean" type_labelDataType="kermeta.standard.JavaString"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = false;\n\n\tjava.lang.Boolean idIfCond_217 = false;\n\tidIfCond_217 = kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.StringWrapper.equals(type_label, \"null\"), kermeta.standard.helper.StringWrapper.equals(type_label, \"void\")), kermeta.standard.helper.StringWrapper.equals(type_label, \"Void\")), kermeta.standard.helper.StringWrapper.equals(type_label, \"VoidType\")), kermeta.standard.helper.StringWrapper.equals(type_label, \"kermeta::standard::Void\")), kermeta.standard.helper.StringWrapper.equals(type_label, \"kermeta::language::structure::VoidType\")), kermeta.standard.helper.StringWrapper.equals(type_label, \"kermeta.standard.Void\")), kermeta.standard.helper.StringWrapper.equals(type_label, \"kermeta.language.structure.VoidType\"));\n\n\tif( idIfCond_217 ) {\n\n\tresult = true;\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean isVoidType(String type_label);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\necore.EOperation result = null;\n\n\tecore.EOperation ecoreOperation = ((ecore.EOperation) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(ecore.EcorePackage.eINSTANCE.getEOperation()));\n\n\tecoreOperation.setName(this.getFinalName(context));\n\n\tecoreOperation.setOrdered(this.getIsOrdered());\n\n\tecoreOperation.setUnique(this.getIsUnique());\n\n\tecoreOperation.setLowerBound(this.getLower());\n\n\tecoreOperation.setUpperBound(this.getUpper());\n\n\tjava.lang.Boolean idIfCond_218 = false;\n\tidIfCond_218 = this.getIsAbstract();\n\n\tif( idIfCond_218 ) {\n\n\tecore.EAnnotation ecoreAnnotation = ((km2ecore.helper.ecore.EAnnotationHelper) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(km2ecore.helper.ecore.EcorePackage.eINSTANCE.getEAnnotationHelper())).createAbstract();\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EAnnotation>convertAsOrderedSet(ecoreOperation.getEAnnotations()).add(ecoreAnnotation);\n}\n\n\n\tresult = ecoreOperation;\n\nreturn result;\n'"
	 * @generated
	 */
	EOperation createEcoreModelElement(KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaBoolean"
	 *        annotation="kermeta documentation='/**\r\n\t * The given operation has at least a parameter having ValueType as type\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = false;\n\n\tkermeta.language.structure.Parameter p = null;\n//BIft:detect\n\nkermeta.language.structure.Parameter result_ft88 = null;\n\n\tkermeta.language.structure.Parameter elem_ft88 = null;\n\n\tresult_ft88 = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Parameter> it_ft88 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Parameter>convertAsOrderedSet(this.getOwnedParameter()).iterator();\n\tjava.lang.Boolean idLoopCond_219 = false;\n\twhile( !idLoopCond_219 ) {\n\tidLoopCond_219 = kermeta.standard.helper.BooleanWrapper.or(it_ft88.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(result_ft88, null));\n\tif ( idLoopCond_219 ) {\n\t} else {\n\n\telem_ft88 = it_ft88.next();\n\n\tjava.lang.Boolean idIfCond_220 = false;\n//BIle:detector\nkermeta.language.structure.Parameter p_lbdExp88 = elem_ft88;\n\n\tidIfCond_220 = p_lbdExp88.getType().isValueType();\n//EIle:detector\n\n\n\tif( idIfCond_220 ) {\n\n\tresult_ft88 = elem_ft88;\n}\n\n}\n\t}\n}\n\n\n//CE\np = result_ft88;\n//EIft:detect\n\n\n\tjava.lang.Boolean idIfCond_221 = false;\n\tidIfCond_221 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(p));\n\n\tif( idIfCond_221 ) {\n\n\tresult = true;\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean hasAValueTypedParameter();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta superOperation='kermeta::language::structure::Object'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tjava.lang.Boolean idIfCond_222 = false;\n\tidIfCond_222 = kermeta.standard.helper.BooleanWrapper.not(this.isFunctionType());\n\n\tif( idIfCond_222 ) {\n\n\tjava.lang.Boolean idIfCond_223 = false;\n\tidIfCond_223 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(context.getCurrent_valueType());\n\n\tif( idIfCond_223 ) {\n\n\tthis.setLinks(context);\n\n\t//BIft:eachOwnedElement\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Tag> it_ft90 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Tag>convertAsOrderedSet(this.getOwnedTags()).iterator();\n\tjava.lang.Boolean idLoopCond_224 = false;\n\twhile( !idLoopCond_224 ) {\n\tidLoopCond_224 = it_ft90.isOff();\n\tif ( idLoopCond_224 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Tag o_lbdExp90 = it_ft90.next();\n\n\t//BIle:func\nkermeta.language.structure.Tag p_lbdExp89 = o_lbdExp90;\n\n\tp_lbdExp89.applyPass2BehaviorJava(context);\n//EIle:func\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Parameter> it_ft91 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Parameter>convertAsOrderedSet(this.getOwnedParameter()).iterator();\n\tjava.lang.Boolean idLoopCond_225 = false;\n\twhile( !idLoopCond_225 ) {\n\tidLoopCond_225 = it_ft91.isOff();\n\tif ( idLoopCond_225 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Parameter o_lbdExp91 = it_ft91.next();\n\n\t//BIle:func\nkermeta.language.structure.Parameter p_lbdExp89 = o_lbdExp91;\n\n\tp_lbdExp89.applyPass2BehaviorJava(context);\n//EIle:func\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Constraint> it_ft92 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Constraint>convertAsOrderedSet(this.getPre()).iterator();\n\tjava.lang.Boolean idLoopCond_226 = false;\n\twhile( !idLoopCond_226 ) {\n\tidLoopCond_226 = it_ft92.isOff();\n\tif ( idLoopCond_226 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Constraint o_lbdExp92 = it_ft92.next();\n\n\t//BIle:func\nkermeta.language.structure.Constraint p_lbdExp89 = o_lbdExp92;\n\n\tp_lbdExp89.applyPass2BehaviorJava(context);\n//EIle:func\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Constraint> it_ft93 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Constraint>convertAsOrderedSet(this.getPost()).iterator();\n\tjava.lang.Boolean idLoopCond_227 = false;\n\twhile( !idLoopCond_227 ) {\n\tidLoopCond_227 = it_ft93.isOff();\n\tif ( idLoopCond_227 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Constraint o_lbdExp93 = it_ft93.next();\n\n\t//BIle:func\nkermeta.language.structure.Constraint p_lbdExp89 = o_lbdExp93;\n\n\tp_lbdExp89.applyPass2BehaviorJava(context);\n//EIle:func\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.TypeVariable> it_ft94 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.TypeVariable>convertAsOrderedSet(this.getTypeParameter()).iterator();\n\tjava.lang.Boolean idLoopCond_228 = false;\n\twhile( !idLoopCond_228 ) {\n\tidLoopCond_228 = it_ft94.isOff();\n\tif ( idLoopCond_228 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.TypeVariable t_lbdExp94 = it_ft94.next();\n\n\t//BIle:func\nkermeta.language.structure.TypeVariable p_lbdExp89 = t_lbdExp94;\n\n\tp_lbdExp89.applyPass2BehaviorJava(context);\n//EIle:func\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n//EIft:eachOwnedElement\n\n\n\tthis.createBehaviorJava(context);\n\n\tjava.lang.Boolean idIfCond_229 = false;\n\tidIfCond_229 = this.isRunnable();\n\n\tif( idIfCond_229 ) {\n\n\tsimk.SMContext smContext = context.getSimkModel().retrieveOrCreateContextForRunner(this, context);\n\n\tsimk.SMMethod staticMethod = ((simk.SMMethod) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(simk.SimkPackage.eINSTANCE.getSMMethod()));\n\n\tjava.lang.String cd_qn = kermeta.standard.helper.StringWrapper.replace(((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(this), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ClassDefinition\"))).qualifiedName(), \"::\", \".\");\n\n\tjava.lang.String class_label = ((km2ecore.helper.kermeta.CompilerHelperJava) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(km2ecore.helper.kermeta.KermetaPackage.eINSTANCE.getCompilerHelperJava())).ppEmfLikeGetEMF(cd_qn);\n\n\tstaticMethod.setName(\"main\");\n\n\tstaticMethod.setBody(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(\"\\n\", cd_qn), \" anExec = (\"), cd_qn), \")\"), \" org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"), class_label), \");\"), \"\\nanExec.\"), this.getFinalName(context)), \"(\"));\n\n\tjava.lang.Integer i = 0;\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Parameter> it_ft95 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Parameter>convertAsOrderedSet(this.getOwnedParameter()).iterator();\n\tjava.lang.Boolean idLoopCond_230 = false;\n\twhile( !idLoopCond_230 ) {\n\tidLoopCond_230 = it_ft95.isOff();\n\tif ( idLoopCond_230 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Parameter params_lbdExp95 = it_ft95.next();\n\n\tjava.lang.Boolean idIfCond_231 = false;\n\tidIfCond_231 = kermeta.standard.helper.IntegerWrapper.isGreater(i, 0);\n\n\tif( idIfCond_231 ) {\n\n\tstaticMethod.setBody(kermeta.standard.helper.StringWrapper.plus(staticMethod.getBody(), \", \"));\n}\n\n\n\tstaticMethod.setBody(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(staticMethod.getBody(), \" args[\"), kermeta.standard.helper.IntegerWrapper.toString(i)), \"]\"));\n\n\ti = kermeta.standard.helper.IntegerWrapper.plus(i, 1);\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\tstaticMethod.setBody(kermeta.standard.helper.StringWrapper.plus(staticMethod.getBody(), \");\\n\"));\n\n\tstaticMethod.setUsages(simk.SMUsage.getByName(\"Runner\"));\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<simk.SMMethod>convertAsOrderedSet(context.getSimkModel().getSMMethods()).add(staticMethod);\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<simk.SMMethod>convertAsOrderedSet(smContext.getSMMethods()).add(staticMethod);\n}\n\n}\n else {\n\n\tthis.compilingInSimkMode(context);\n}\n\n}\n\n'"
	 * @generated
	 */
	void applyPass2BehaviorJava(KM2EcoreContext context);

} // Operation
