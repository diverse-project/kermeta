/**
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * 
 * Generating with Kermeta <http://www.kermeta.org>
 *
 * $Id: Operation.java,v 1.12 2009-02-23 15:26:48 cfaucher Exp $
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
 *   <li>{@link kermeta.language.structure.Operation#getPost <em>Post</em>}</li>
 *   <li>{@link kermeta.language.structure.Operation#getIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link kermeta.language.structure.Operation#getOwnedParameter <em>Owned Parameter</em>}</li>
 *   <li>{@link kermeta.language.structure.Operation#getRaisedException <em>Raised Exception</em>}</li>
 *   <li>{@link kermeta.language.structure.Operation#getPre <em>Pre</em>}</li>
 *   <li>{@link kermeta.language.structure.Operation#getSuperOperation <em>Super Operation</em>}</li>
 *   <li>{@link kermeta.language.structure.Operation#getLambdaExpression <em>Lambda Expression</em>}</li>
 *   <li>{@link kermeta.language.structure.Operation#getOwningClass <em>Owning Class</em>}</li>
 * </ul>
 * </p>
 *
 * @see kermeta.language.structure.StructurePackage#getOperation()
 * @model annotation="kermeta documentation='/**\r\n *\r\n \052/'"
 *        annotation="kermeta documentation='Every one knows what an operation is.'"
 *        annotation="kermeta documentation='/** We have to visit operation in order to print the result initialization and the return statement \052/'"
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
	 * @model dataType="kermeta.standard.JavaString"
	 *        annotation="kermeta superOperation='kermeta::language::structure::Object'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.String result = null;\n\n\tresult = null;\n\n\tkermeta.utils.StringBuffer javaCode = ((kermeta.utils.StringBuffer) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.utils.UtilsPackage.eINSTANCE.getStringBuffer()));\n\n\tjava.lang.Boolean idIfCond_235 = false;\n\tidIfCond_235 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(this.getBody()));\n\n\tif( idIfCond_235 ) {\n\n\tjava.lang.String type_label = \"\";\n\n\tjava.lang.Boolean idIfCond_236 = false;\n\tidIfCond_236 = context.getFtSuffixActivation();\n\n\tif( idIfCond_236 ) {\n\n\ttype_label = context.getFtReturnType();\n\n\tcontext.setFtReturnType(\"\");\n}\n else {\n\n\ttype_label = ((km2ecore.helper.kermeta.CompilerHelperJava) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(km2ecore.helper.kermeta.KermetaPackage.eINSTANCE.getCompilerHelperJava())).ppTypeFromMultiplicityElement(this, context);\n}\n\n\n\tjava.lang.Boolean idIfCond_237 = false;\n\tidIfCond_237 = kermeta.standard.helper.BooleanWrapper.not(this.isVoidType(type_label));\n\n\tif( idIfCond_237 ) {\n\n\tjavaCode.append(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(\"\\n\", type_label), \" result\"), context.printFtSuffix()), \" = null;\\n\"));\n}\n\n\n\tjavaCode.append(this.createBehaviorJavaFromPre(context));\n\n\tjavaCode.append(this.getBody().createBehaviorJava(context));\n\n\tjavaCode.append(this.createBehaviorJavaFromPost(context));\n\n\tjava.lang.Boolean idIfCond_238 = false;\n\tidIfCond_238 = kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.BooleanWrapper.not(this.isVoidType(type_label)), kermeta.standard.helper.BooleanWrapper.not(context.getFtSuffixActivation()));\n\n\tif( idIfCond_238 ) {\n\n\tjavaCode.append(this.ppReturnResult(context));\n}\n\n}\n else {\n\n\tjava.lang.Boolean idIfCond_239 = false;\n\tidIfCond_239 = kermeta.standard.helper.BooleanWrapper.not(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.language.structure.StructurePackage.eINSTANCE.getOperation())).isVoidType(this.getType().getTypeQName()));\n\n\tif( idIfCond_239 ) {\n\n\tjavaCode.append(kermeta.standard.helper.StringWrapper.plus(((km2ecore.helper.kermeta.CompilerHelperJava) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(km2ecore.helper.kermeta.KermetaPackage.eINSTANCE.getCompilerHelperJava())).ppTypeFromMultiplicityElement(this, context), \" result = null;\\n\"));\n\n\tjavaCode.append(this.ppReturnResult(context));\n}\n\n}\n\n\n\tjava.lang.Boolean idIfCond_240 = false;\n\tidIfCond_240 = kermeta.standard.helper.BooleanWrapper.and(org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(context.getTasks_stack().peek(), org.kermeta.compil.runtime.helper.language.ObjectUtil.convertAsObject(context.getFUNCTION_TYPE_COMPILATION_TASK())), org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(context.getCurrent_valueType()));\n\n\tif( idIfCond_240 ) {\n\n\t((km2ecore.helper.ecore.EAnnotationHelper) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(km2ecore.helper.ecore.EcorePackage.eINSTANCE.getEAnnotationHelper())).addAnnotationGenModelImpl(this.getEcoreModelElement(), javaCode.toString());\n}\n\n\n\tresult = javaCode.toString();\n\nreturn result;\n'"
	 * @generated
	 */
	String createBehaviorJava(KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="kermeta.standard.JavaBoolean"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = false;\n\n\tkermeta.language.structure.Parameter param = null;\n//BIft:detect\n\nkermeta.language.structure.Parameter result_ft86 = null;\n\n\tkermeta.language.structure.Parameter elem_ft86 = null;\n\n\tresult_ft86 = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Parameter> it_ft86 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Parameter>convertAsOrderedSet(this.getOwnedParameter()).iterator();\n\tjava.lang.Boolean idLoopCond_241 = false;\n\twhile( !idLoopCond_241 ) {\n\tidLoopCond_241 = kermeta.standard.helper.BooleanWrapper.or(it_ft86.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(result_ft86, null));\n\tif ( idLoopCond_241 ) {\n\t} else {\n\n\telem_ft86 = it_ft86.next();\n\n\tjava.lang.Boolean idIfCond_242 = false;\n//BIle:detector\nkermeta.language.structure.Parameter param_lbdExp86 = elem_ft86;\n\n\tidIfCond_242 = kermeta.standard.helper.BooleanWrapper.not(param_lbdExp86.isRunnable());\n//EIle:detector\n\n\n\tif( idIfCond_242 ) {\n\n\tresult_ft86 = elem_ft86;\n}\n\n}\n\t}\n}\n\n\n//CE\nparam = result_ft86;\n//EIft:detect\n;\n\n\tjava.lang.Boolean idIfCond_243 = false;\n\tidIfCond_243 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(param);\n\n\tif( idIfCond_243 ) {\n\n\tresult = true;\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean isRunnable();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaString"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.String result = null;\n\n\tresult = \"\";\n\n\tjava.lang.Boolean idIfCond_244 = false;\n\tidIfCond_244 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(this.getBody(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.Block\"));\n\n\tif( idIfCond_244 ) {\n\n\tjava.lang.Boolean idIfCond_245 = false;\n\tidIfCond_245 = kermeta.standard.helper.IntegerWrapper.equals(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.behavior.Expression>convertAsOrderedSet(((kermeta.language.behavior.Block) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(this.getBody(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.Block\"))).getStatement()).size(), 1);\n\n\tif( idIfCond_245 ) {\n\n\tjava.lang.Boolean idIfCond_246 = false;\n\tidIfCond_246 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.behavior.Expression>convertAsOrderedSet(((kermeta.language.behavior.Block) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(this.getBody(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.Block\"))).getStatement()), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.JavaStaticCall\"));\n\n\tif( idIfCond_246 ) {\n\n\tkermeta.standard.Sequence<java.lang.String> static_call_set_1 = kermeta.standard.helper.StringWrapper.split(((kermeta.language.behavior.JavaStaticCall) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.behavior.Expression>convertAsOrderedSet(((kermeta.language.behavior.Block) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(this.getBody(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.Block\"))).getStatement()), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.JavaStaticCall\"))).createBehaviorJava(context), \"(\");\n\n\tresult = static_call_set_1.first();\n}\n else {\n\n\tjava.lang.Boolean idIfCond_247 = false;\n\tidIfCond_247 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.behavior.Expression>convertAsOrderedSet(((kermeta.language.behavior.Block) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(this.getBody(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.Block\"))).getStatement()), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.Assignment\"));\n\n\tif( idIfCond_247 ) {\n\n\tjava.lang.Boolean idIfCond_248 = false;\n\tidIfCond_248 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(((kermeta.language.behavior.Assignment) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.behavior.Expression>convertAsOrderedSet(((kermeta.language.behavior.Block) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(this.getBody(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.Block\"))).getStatement()), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.Assignment\"))).getValue(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.JavaStaticCall\"));\n\n\tif( idIfCond_248 ) {\n\n\tkermeta.standard.Sequence<java.lang.String> static_call_set_2 = kermeta.standard.helper.StringWrapper.split(((kermeta.language.behavior.JavaStaticCall) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(((kermeta.language.behavior.Assignment) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.behavior.Expression>convertAsOrderedSet(((kermeta.language.behavior.Block) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(this.getBody(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.Block\"))).getStatement()), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.Assignment\"))).getValue(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.JavaStaticCall\"))).createBehaviorJava(context), \"(\");\n\n\tresult = static_call_set_2.first();\n}\n\n}\n\n}\n\n}\n\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	String getOptimizedStaticCall(KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaBoolean"
	 *        annotation="kermeta documentation='/**\r\n\t * Helper method to determine if an operation has to be compiled\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = true;\n\n\tjava.lang.Boolean idIfCond_249 = false;\n\tidIfCond_249 = this.getOwningClass().isValueType();\n\n\tif( idIfCond_249 ) {\n\n\tjava.lang.Boolean idIfCond_250 = false;\n\tidIfCond_250 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(this.getOwningClass().getEMFInstanceClassName(), \"\");\n\n\tif( idIfCond_250 ) {\n\n\tresult = false;\n}\n\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean mustBeCompiled();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaString"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.String result = null;\n\n\tresult = \"\";\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Constraint> it_ft87 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Constraint>convertAsOrderedSet(this.getPost()).iterator();\n\tjava.lang.Boolean idLoopCond_251 = false;\n\twhile( !idLoopCond_251 ) {\n\tidLoopCond_251 = it_ft87.isOff();\n\tif ( idLoopCond_251 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Constraint constraint_lbdExp87 = it_ft87.next();\n\n\tcontext.getResultLastStatementStack().push(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(\"result_post = \", context.getTYPE_SEPARATOR()), \"java.lang.Boolean\"));\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(result, \"\\nif( \"), context.getJAVA_CLASS_EXECUTION_CONTEXT()), \".getInstance().mustBeChecked( \\\"post__\"), kermeta.standard.helper.IntegerWrapper.toString(org.kermeta.compil.runtime.helper.language.ObjectUtil.oidSwitcher(constraint_lbdExp87))), \"__\"), constraint_lbdExp87.getName()), \"\\\" ) ) {\\n\");\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(result, \"java.lang.Boolean result_post = false;\\n\");\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(result, constraint_lbdExp87.createBehaviorJava(context)), \"\\n\");\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(result, \"if( !result_post ) {\\n\");\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(result, \"kermeta.exceptions.ConstraintViolatedPost exp = kermeta.exceptions.ExceptionsFactory.eINSTANCE.createConstraintViolatedPost();\\n\");\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(result, \"throw new \"), context.getJAVA_CLASS_EXCEPTION_SWITCHER()), \"(exp);\\n\");\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(result, \"}\\n\");\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(result, \"}\\n\");\n\n\tcontext.getResultLastStatementStack().pop();\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\tjava.lang.Boolean idIfCond_252 = false;\n\tidIfCond_252 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(result, \"\");\n\n\tif( idIfCond_252 ) {\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(\"\\n//PostConditions Checking\\n{\", result), \"}\");\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	String createBehaviorJavaFromPost(KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta superOperation='kermeta::language::structure::Object'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tecore.EOperation ecoreOperation = this.createEcoreModelElement(context);\n\n\tkermeta.language.structure.ClassDefinition c = null;\n\n\tc = (kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeOrVoid(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(this), \"kermeta.language.structure.ClassDefinition\");\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EOperation>convertAsOrderedSet(c.getEcoreModelElement().getEOperations()).add(ecoreOperation);\n\n\tthis.setEcoreModelElement(ecoreOperation);\n\n\t//BIft:eachOwnedElement\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Tag> it_ft89 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Tag>convertAsOrderedSet(this.getOwnedTags()).iterator();\n\tjava.lang.Boolean idLoopCond_253 = false;\n\twhile( !idLoopCond_253 ) {\n\tidLoopCond_253 = it_ft89.isOff();\n\tif ( idLoopCond_253 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Tag o_lbdExp89 = it_ft89.next();\n\n\t//BIle:func\nkermeta.language.structure.Tag o_lbdExp88 = o_lbdExp89;\n\n\to_lbdExp88.applyPass1(context);\n//EIle:func\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Parameter> it_ft90 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Parameter>convertAsOrderedSet(this.getOwnedParameter()).iterator();\n\tjava.lang.Boolean idLoopCond_254 = false;\n\twhile( !idLoopCond_254 ) {\n\tidLoopCond_254 = it_ft90.isOff();\n\tif ( idLoopCond_254 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Parameter o_lbdExp90 = it_ft90.next();\n\n\t//BIle:func\nkermeta.language.structure.Parameter o_lbdExp88 = o_lbdExp90;\n\n\to_lbdExp88.applyPass1(context);\n//EIle:func\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Constraint> it_ft91 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Constraint>convertAsOrderedSet(this.getPre()).iterator();\n\tjava.lang.Boolean idLoopCond_255 = false;\n\twhile( !idLoopCond_255 ) {\n\tidLoopCond_255 = it_ft91.isOff();\n\tif ( idLoopCond_255 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Constraint o_lbdExp91 = it_ft91.next();\n\n\t//BIle:func\nkermeta.language.structure.Constraint o_lbdExp88 = o_lbdExp91;\n\n\to_lbdExp88.applyPass1(context);\n//EIle:func\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Constraint> it_ft92 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Constraint>convertAsOrderedSet(this.getPost()).iterator();\n\tjava.lang.Boolean idLoopCond_256 = false;\n\twhile( !idLoopCond_256 ) {\n\tidLoopCond_256 = it_ft92.isOff();\n\tif ( idLoopCond_256 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Constraint o_lbdExp92 = it_ft92.next();\n\n\t//BIle:func\nkermeta.language.structure.Constraint o_lbdExp88 = o_lbdExp92;\n\n\to_lbdExp88.applyPass1(context);\n//EIle:func\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.TypeVariable> it_ft93 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.TypeVariable>convertAsOrderedSet(this.getTypeParameter()).iterator();\n\tjava.lang.Boolean idLoopCond_257 = false;\n\twhile( !idLoopCond_257 ) {\n\tidLoopCond_257 = it_ft93.isOff();\n\tif ( idLoopCond_257 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.TypeVariable t_lbdExp93 = it_ft93.next();\n\n\t//BIle:func\nkermeta.language.structure.TypeVariable o_lbdExp88 = t_lbdExp93;\n\n\to_lbdExp88.applyPass1(context);\n//EIle:func\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n//EIft:eachOwnedElement\n\n'"
	 * @generated
	 */
	void applyPass1(KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta superOperation='kermeta::language::structure::Object'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tjava.lang.Boolean idIfCond_258 = false;\n\tidIfCond_258 = kermeta.standard.helper.BooleanWrapper.not(this.isFunctionType());\n\n\tif( idIfCond_258 ) {\n\n\tthis.setLinks(context);\n\n\tkermeta.language.structure.helper.ObjectSuper.super_applyPass2(this, context);\n}\n\n'"
	 * @generated
	 */
	void applyPass2(KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tkermeta.language.structure.LinkSetterForTypedElement s = ((kermeta.language.structure.LinkSetterForTypedElement) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.language.structure.StructurePackage.eINSTANCE.getLinkSetterForTypedElement()));\n\n\ts.setLinks(this, this.getEcoreModelElement(), context);\n\n\tjava.lang.Boolean idIfCond_259 = false;\n\tidIfCond_259 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(this.getSuperOperation()));\n\n\tif( idIfCond_259 ) {\n\n\tjava.lang.String qualifiedName = this.getSuperOperation().getOwningClass().qualifiedName();\n\n\tecore.EAnnotation ecoreAnnotation = ((km2ecore.helper.ecore.EAnnotationHelper) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(km2ecore.helper.ecore.EcorePackage.eINSTANCE.getEAnnotationHelper())).createKermetaEAnnotation(kermeta.standard.helper.StringWrapper.toString(km2ecore.helper.ecore.KermetaEAnnotationKey.getByName(\"superOperation\").getName()), qualifiedName);\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EAnnotation>convertAsOrderedSet(this.getEcoreModelElement().getEAnnotations()).add(ecoreAnnotation);\n}\n\n'"
	 * @generated
	 */
	void setLinks(KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="kermeta.standard.JavaBoolean"
	 *        annotation="kermeta documentation='/**\r\n\t * Return true if the given operation is a FunctionType\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = false;\n\n\tjava.lang.Boolean idIfCond_260 = false;\n\tidIfCond_260 = kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(this.getFunctionTypeParameter())), kermeta.standard.helper.IntegerWrapper.isGreater(this.getFunctionTypeParameter().size(), 0));\n\n\tif( idIfCond_260 ) {\n\n\tresult = true;\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean isFunctionType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaBoolean"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = false;\n\n\tjava.lang.Boolean idIfCond_261 = false;\n\tidIfCond_261 = this.getOwningClass().isValueType();\n\n\tif( idIfCond_261 ) {\n\n\tresult = true;\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean ownedByValueType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\r\n\t * Compiling in Simk mode all the methods (inherited methods included) from ValueType\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tsimk.SMContext sMContext = context.getSimkModel().retrieveOrCreateContextForWrapper(this, context);\n\n\tjava.lang.Boolean idIfCond_262 = false;\n\tidIfCond_262 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(sMContext));\n\n\tif( idIfCond_262 ) {\n\n\tsimk.SMMethod staticMethod = ((simk.SMMethod) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(simk.SimkPackage.eINSTANCE.getSMMethod()));\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<simk.SMMethod>convertAsOrderedSet(context.getSimkModel().getSMMethods()).add(staticMethod);\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<simk.SMMethod>convertAsOrderedSet(sMContext.getSMMethods()).add(staticMethod);\n\n\tstaticMethod.setName(this.getName());\n\n\tstaticMethod.setWrapperUsage();\n\n\tsimk.SMParameter self_param = ((simk.SMParameter) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(simk.SimkPackage.eINSTANCE.getSMParameter()));\n\n\tself_param.setName(\"self\");\n\n\tjava.lang.Boolean idIfCond_263 = false;\n\tidIfCond_263 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(this.getWrapperValueTypeSelfExpression(), \"\");\n\n\tif( idIfCond_263 ) {\n\n\tkermeta.utils.Hashtable<java.lang.String, java.lang.String> map_infos = kermeta.standard.helper.StringWrapper.getPropertyInfos(this.getWrapperValueTypeSelfExpression());\n\n\tjava.lang.String map_value = map_infos.getValue(context.getCurrent_valueType().getEMFInstanceClassName());\n\n\tjava.lang.Boolean idIfCond_264 = false;\n\tidIfCond_264 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(map_value));\n\n\tif( idIfCond_264 ) {\n\n\tself_param.setType(map_value);\n}\n\n}\n\n\n\tjava.lang.Boolean idIfCond_265 = false;\n\tidIfCond_265 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(self_param.getType());\n\n\tif( idIfCond_265 ) {\n\n\tself_param.setType(context.getCurrent_valueType().getEMFInstanceClassName());\n}\n\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<simk.SMParameter>convertAsOrderedSet(staticMethod.getSMParameters()).add(self_param);\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Parameter> it_ft94 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Parameter>convertAsOrderedSet(this.getOwnedParameter()).iterator();\n\tjava.lang.Boolean idLoopCond_266 = false;\n\twhile( !idLoopCond_266 ) {\n\tidLoopCond_266 = it_ft94.isOff();\n\tif ( idLoopCond_266 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Parameter p_lbdExp94 = it_ft94.next();\n\n\tsimk.SMParameter param = ((simk.SMParameter) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(simk.SimkPackage.eINSTANCE.getSMParameter()));\n\n\tparam.setName(p_lbdExp94.getName());\n\n\tjava.lang.Boolean idIfCond_267 = false;\n\tidIfCond_267 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(p_lbdExp94.getType(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.FunctionType\")));\n\n\tif( idIfCond_267 ) {\n\n\tjava.lang.Boolean idIfCond_268 = false;\n\tidIfCond_268 = kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.StringWrapper.equals(p_lbdExp94.getType().getTypeQName(), this.getOwningClass().qualifiedName()), kermeta.standard.helper.StringWrapper.equals(p_lbdExp94.getType().getTypeQName(), \"kermeta::language::structure::Object\"));\n\n\tif( idIfCond_268 ) {\n\n\tparam.setType(context.getCurrent_valueType().getEMFInstanceClassName());\n}\n else {\n\n\tparam.setType(p_lbdExp94.getType().createBehaviorJava(context));\n\n\tjava.lang.Boolean idIfCond_269 = false;\n\tidIfCond_269 = ((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.language.structure.StructurePackage.eINSTANCE.getOperation())).isVoidType(param.getType());\n\n\tif( idIfCond_269 ) {\n\n\tparam.setType(\"void\");\n}\n\n}\n\n}\n else {\n}\n\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<simk.SMParameter>convertAsOrderedSet(staticMethod.getSMParameters()).add(param);\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\tsimk.SMReturn sMReturn = ((simk.SMReturn) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(simk.SimkPackage.eINSTANCE.getSMReturn()));\n\n\tstaticMethod.setSMReturn(sMReturn);\n\n\tjava.lang.Boolean idIfCond_270 = false;\n\tidIfCond_270 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(this.getWrapperValueTypeReturnType(), \"\");\n\n\tif( idIfCond_270 ) {\n\n\tkermeta.utils.Hashtable<java.lang.String, java.lang.String> map_infos = kermeta.standard.helper.StringWrapper.getPropertyInfos(this.getWrapperValueTypeReturnType());\n\n\tjava.lang.String map_value = map_infos.getValue(context.getCurrent_valueType().getEMFInstanceClassName());\n\n\tjava.lang.Boolean idIfCond_271 = false;\n\tidIfCond_271 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(map_value));\n\n\tif( idIfCond_271 ) {\n\n\tsMReturn.setType(map_value);\n}\n\n}\n\n\n\tjava.lang.Boolean idIfCond_272 = false;\n\tidIfCond_272 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(sMReturn.getType());\n\n\tif( idIfCond_272 ) {\n\n\tsMReturn.setType(this.getType().createBehaviorJava(context));\n\n\tjava.lang.Boolean idIfCond_273 = false;\n\tidIfCond_273 = ((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.language.structure.StructurePackage.eINSTANCE.getOperation())).isVoidType(sMReturn.getType());\n\n\tif( idIfCond_273 ) {\n\n\tsMReturn.setType(\"void\");\n}\n\n}\n\n\n\tstaticMethod.setBody(\"//Protection of the following code\\n\");\n\n\tjava.lang.Boolean idIfCond_274 = false;\n\tidIfCond_274 = kermeta.standard.helper.StringWrapper.equals(this.getName(), \"equals\");\n\n\tif( idIfCond_274 ) {\n\n\tstaticMethod.setBody(kermeta.standard.helper.StringWrapper.plus(staticMethod.getBody(), \"if( self == null || \"));\n\n\tstaticMethod.setBody(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(staticMethod.getBody(), org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Parameter>convertAsOrderedSet(this.getOwnedParameter()).first().getName()), \" == null ) {\\n\"));\n\n\tstaticMethod.setBody(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(staticMethod.getBody(), \"return self == \"), org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Parameter>convertAsOrderedSet(this.getOwnedParameter()).first().getName()), \";\\n\"));\n\n\tstaticMethod.setBody(kermeta.standard.helper.StringWrapper.plus(staticMethod.getBody(), \"}\\n\\n\"));\n}\n\n\n\tjava.lang.Boolean idIfCond_275 = false;\n\tidIfCond_275 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<java.lang.String>convertAsOrderedSet(context.getFrameworkOperations()).contains(this.getName());\n\n\tif( idIfCond_275 ) {\n\n\tstaticMethod.setBody(kermeta.standard.helper.StringWrapper.plus(staticMethod.getBody(), \"if( self == null || ((java.lang.Object) self) instanceof kermeta.language.structure.Object ) {\\n\"));\n\n\tjava.lang.Boolean idIfCond_276 = false;\n\tidIfCond_276 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(staticMethod.getSMReturn().getType(), \"void\");\n\n\tif( idIfCond_276 ) {\n\n\tstaticMethod.setBody(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(staticMethod.getBody(), \"return (\"), staticMethod.getSMReturn().getType()), \") \"));\n}\n\n\n\tstaticMethod.setBody(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(staticMethod.getBody(), context.getOBJECT_UTIL_CLASS()), \".\"), this.getName()), \"((kermeta.language.structure.Object) ((java.lang.Object) self)\"));\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Parameter> it_ft95 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Parameter>convertAsOrderedSet(this.getOwnedParameter()).iterator();\n\tjava.lang.Boolean idLoopCond_277 = false;\n\twhile( !idLoopCond_277 ) {\n\tidLoopCond_277 = it_ft95.isOff();\n\tif ( idLoopCond_277 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Parameter p_lbdExp95 = it_ft95.next();\n\n\tstaticMethod.setBody(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(staticMethod.getBody(), \", \"), p_lbdExp95.getName()));\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\tstaticMethod.setBody(kermeta.standard.helper.StringWrapper.plus(staticMethod.getBody(), \");\\n\"));\n}\n else {\n\n\tstaticMethod.setBody(kermeta.standard.helper.StringWrapper.plus(staticMethod.getBody(), \"if( self == null ) {\\n\"));\n\n\tstaticMethod.setBody(kermeta.standard.helper.StringWrapper.plus(staticMethod.getBody(), \"kermeta.exceptions.CallOnVoidTarget exp = kermeta.exceptions.ExceptionsFactory.eINSTANCE.createCallOnVoidTarget();\\n\"));\n\n\tstaticMethod.setBody(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(staticMethod.getBody(), \"exp.setMessage(\\\"Initialize the \"), context.getCurrent_valueType().getName()), \" expression\\\");\\n\"));\n\n\tstaticMethod.setBody(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(staticMethod.getBody(), \"throw new \"), context.getJAVA_CLASS_EXCEPTION_SWITCHER()), \"(exp);\\n\"));\n}\n\n\n\tstaticMethod.setBody(kermeta.standard.helper.StringWrapper.plus(staticMethod.getBody(), \"}\\n//End of the protection\\n\\n\"));\n\n\tstaticMethod.setBody(kermeta.standard.helper.StringWrapper.plus(staticMethod.getBody(), this.createBehaviorJava(context)));\n}\n\n'"
	 * @generated
	 */
	void compilingInSimkMode(KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaBoolean"
	 *        annotation="kermeta documentation='/**\r\n\t * Unused for the moment\r\n\t \052/'"
	 *        annotation="kermeta deprecated=''"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = false;\n\n\tjava.lang.Boolean idIfCond_278 = false;\n\tidIfCond_278 = kermeta.standard.helper.BooleanWrapper.or(this.getType().isValueType(), this.hasAValueTypedParameter());\n\n\tif( idIfCond_278 ) {\n\n\tresult = true;\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean mustBeDuplicated();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaString"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.String result = null;\n\n\tresult = \"\";\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Constraint> it_ft96 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Constraint>convertAsOrderedSet(this.getPre()).iterator();\n\tjava.lang.Boolean idLoopCond_279 = false;\n\twhile( !idLoopCond_279 ) {\n\tidLoopCond_279 = it_ft96.isOff();\n\tif ( idLoopCond_279 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Constraint constraint_lbdExp96 = it_ft96.next();\n\n\tcontext.getResultLastStatementStack().push(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(\"result_pre = \", context.getTYPE_SEPARATOR()), \"java.lang.Boolean\"));\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(result, \"\\nif( \"), context.getJAVA_CLASS_EXECUTION_CONTEXT()), \".getInstance().mustBeChecked( \\\"pre__\"), kermeta.standard.helper.IntegerWrapper.toString(org.kermeta.compil.runtime.helper.language.ObjectUtil.oidSwitcher(constraint_lbdExp96))), \"__\"), constraint_lbdExp96.getName()), \"\\\" ) ) {\\n\");\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(result, \"java.lang.Boolean result_pre = false;\\n\");\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(result, constraint_lbdExp96.createBehaviorJava(context)), \"\\n\");\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(result, \"if( !result_pre ) {\\n\");\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(result, \"kermeta.exceptions.ConstraintViolatedPre exp = kermeta.exceptions.ExceptionsFactory.eINSTANCE.createConstraintViolatedPre();\\n\");\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(result, \"throw new \"), context.getJAVA_CLASS_EXCEPTION_SWITCHER()), \"(exp);\\n\");\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(result, \"}\\n\");\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(result, \"}\\n\");\n\n\tcontext.getResultLastStatementStack().pop();\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\tjava.lang.Boolean idIfCond_280 = false;\n\tidIfCond_280 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(result, \"\");\n\n\tif( idIfCond_280 ) {\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(\"\\n//PreConditions Checking\\n{\", result), \"}\");\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	String createBehaviorJavaFromPre(KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.standard.Sequence<kermeta.language.structure.Parameter> result = null;\n\n\tresult = null;\n\n\tkermeta.standard.Sequence<kermeta.language.structure.Parameter> ft_parameters = null;\n//BIft:select\n\nkermeta.standard.Sequence<kermeta.language.structure.Parameter> result_ft97 = null;\n\n\tkermeta.language.structure.Parameter elem_ft97 = null;\n\n\tresult_ft97 = ((kermeta.standard.Sequence<kermeta.language.structure.Parameter>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.standard.StandardPackage.eINSTANCE.getSequence()));\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Parameter> it_ft97 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Parameter>convertAsOrderedSet(this.getOwnedParameter()).iterator();\n\tjava.lang.Boolean idLoopCond_281 = false;\n\twhile( !idLoopCond_281 ) {\n\tidLoopCond_281 = it_ft97.isOff();\n\tif ( idLoopCond_281 ) {\n\t} else {\n\n\telem_ft97 = it_ft97.next();\n\n\tjava.lang.Boolean idIfCond_282 = false;\n//BIle:selector\nkermeta.language.structure.Parameter p_lbdExp97 = elem_ft97;\n\n\tidIfCond_282 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(p_lbdExp97.getType(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.FunctionType\"));\n//EIle:selector\n\n\n\tif( idIfCond_282 ) {\n\n\tresult_ft97.add(elem_ft97);\n}\n\n}\n\t}\n}\n\n\n//CE\nft_parameters = result_ft97;\n//EIft:select\n;\n\n\tresult = ft_parameters;\n\nreturn result;\n'"
	 * @generated
	 */
	Sequence<Parameter> getFunctionTypeParameter();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaBoolean" type_labelDataType="kermeta.standard.JavaString"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = false;\n\n\tjava.lang.Boolean idIfCond_283 = false;\n\tidIfCond_283 = kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.StringWrapper.equals(type_label, \"null\"), kermeta.standard.helper.StringWrapper.equals(type_label, \"void\")), kermeta.standard.helper.StringWrapper.equals(type_label, \"Void\")), kermeta.standard.helper.StringWrapper.equals(type_label, \"VoidType\")), kermeta.standard.helper.StringWrapper.equals(type_label, \"kermeta::standard::Void\")), kermeta.standard.helper.StringWrapper.equals(type_label, \"kermeta::language::structure::VoidType\")), kermeta.standard.helper.StringWrapper.equals(type_label, \"kermeta.standard.Void\")), kermeta.standard.helper.StringWrapper.equals(type_label, \"kermeta.language.structure.VoidType\"));\n\n\tif( idIfCond_283 ) {\n\n\tresult = true;\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean isVoidType(String type_label);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\necore.EOperation result = null;\n\n\tecore.EOperation ecoreOperation = ((ecore.EOperation) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(ecore.EcorePackage.eINSTANCE.getEOperation()));\n\n\tecoreOperation.setName(this.getFinalName(context));\n\n\tecoreOperation.setOrdered(this.getIsOrdered());\n\n\tecoreOperation.setUnique(this.getIsUnique());\n\n\tecoreOperation.setLowerBound(this.getLower());\n\n\tecoreOperation.setUpperBound(this.getUpper());\n\n\tjava.lang.Boolean idIfCond_284 = false;\n\tidIfCond_284 = this.getIsAbstract();\n\n\tif( idIfCond_284 ) {\n\n\tecore.EAnnotation ecoreAnnotation = ((km2ecore.helper.ecore.EAnnotationHelper) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(km2ecore.helper.ecore.EcorePackage.eINSTANCE.getEAnnotationHelper())).createAbstract();\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EAnnotation>convertAsOrderedSet(ecoreOperation.getEAnnotations()).add(ecoreAnnotation);\n}\n\n\n\tresult = ecoreOperation;\n\nreturn result;\n'"
	 * @generated
	 */
	EOperation createEcoreModelElement(KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaBoolean"
	 *        annotation="kermeta documentation='/**\r\n\t * The given operation has at least a parameter having ValueType as type\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = false;\n\n\tkermeta.language.structure.Parameter p = null;\n//BIft:detect\n\nkermeta.language.structure.Parameter result_ft98 = null;\n\n\tkermeta.language.structure.Parameter elem_ft98 = null;\n\n\tresult_ft98 = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Parameter> it_ft98 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Parameter>convertAsOrderedSet(this.getOwnedParameter()).iterator();\n\tjava.lang.Boolean idLoopCond_285 = false;\n\twhile( !idLoopCond_285 ) {\n\tidLoopCond_285 = kermeta.standard.helper.BooleanWrapper.or(it_ft98.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(result_ft98, null));\n\tif ( idLoopCond_285 ) {\n\t} else {\n\n\telem_ft98 = it_ft98.next();\n\n\tjava.lang.Boolean idIfCond_286 = false;\n//BIle:detector\nkermeta.language.structure.Parameter p_lbdExp98 = elem_ft98;\n\n\tidIfCond_286 = p_lbdExp98.getType().isValueType();\n//EIle:detector\n\n\n\tif( idIfCond_286 ) {\n\n\tresult_ft98 = elem_ft98;\n}\n\n}\n\t}\n}\n\n\n//CE\np = result_ft98;\n//EIft:detect\n;\n\n\tjava.lang.Boolean idIfCond_287 = false;\n\tidIfCond_287 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(p));\n\n\tif( idIfCond_287 ) {\n\n\tresult = true;\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean hasAValueTypedParameter();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta superOperation='kermeta::language::structure::Object'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tjava.lang.Boolean idIfCond_288 = false;\n\tidIfCond_288 = kermeta.standard.helper.BooleanWrapper.not(this.isFunctionType());\n\n\tif( idIfCond_288 ) {\n\n\tjava.lang.Boolean idIfCond_289 = false;\n\tidIfCond_289 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(context.getCurrent_valueType());\n\n\tif( idIfCond_289 ) {\n\n\tthis.setLinks(context);\n\n\t//BIft:eachOwnedElement\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Tag> it_ft100 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Tag>convertAsOrderedSet(this.getOwnedTags()).iterator();\n\tjava.lang.Boolean idLoopCond_290 = false;\n\twhile( !idLoopCond_290 ) {\n\tidLoopCond_290 = it_ft100.isOff();\n\tif ( idLoopCond_290 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Tag o_lbdExp100 = it_ft100.next();\n\n\t//BIle:func\nkermeta.language.structure.Tag p_lbdExp99 = o_lbdExp100;\n\n\tp_lbdExp99.applyPass2BehaviorJava(context);\n//EIle:func\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Parameter> it_ft101 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Parameter>convertAsOrderedSet(this.getOwnedParameter()).iterator();\n\tjava.lang.Boolean idLoopCond_291 = false;\n\twhile( !idLoopCond_291 ) {\n\tidLoopCond_291 = it_ft101.isOff();\n\tif ( idLoopCond_291 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Parameter o_lbdExp101 = it_ft101.next();\n\n\t//BIle:func\nkermeta.language.structure.Parameter p_lbdExp99 = o_lbdExp101;\n\n\tp_lbdExp99.applyPass2BehaviorJava(context);\n//EIle:func\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Constraint> it_ft102 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Constraint>convertAsOrderedSet(this.getPre()).iterator();\n\tjava.lang.Boolean idLoopCond_292 = false;\n\twhile( !idLoopCond_292 ) {\n\tidLoopCond_292 = it_ft102.isOff();\n\tif ( idLoopCond_292 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Constraint o_lbdExp102 = it_ft102.next();\n\n\t//BIle:func\nkermeta.language.structure.Constraint p_lbdExp99 = o_lbdExp102;\n\n\tp_lbdExp99.applyPass2BehaviorJava(context);\n//EIle:func\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Constraint> it_ft103 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Constraint>convertAsOrderedSet(this.getPost()).iterator();\n\tjava.lang.Boolean idLoopCond_293 = false;\n\twhile( !idLoopCond_293 ) {\n\tidLoopCond_293 = it_ft103.isOff();\n\tif ( idLoopCond_293 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Constraint o_lbdExp103 = it_ft103.next();\n\n\t//BIle:func\nkermeta.language.structure.Constraint p_lbdExp99 = o_lbdExp103;\n\n\tp_lbdExp99.applyPass2BehaviorJava(context);\n//EIle:func\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.TypeVariable> it_ft104 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.TypeVariable>convertAsOrderedSet(this.getTypeParameter()).iterator();\n\tjava.lang.Boolean idLoopCond_294 = false;\n\twhile( !idLoopCond_294 ) {\n\tidLoopCond_294 = it_ft104.isOff();\n\tif ( idLoopCond_294 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.TypeVariable t_lbdExp104 = it_ft104.next();\n\n\t//BIle:func\nkermeta.language.structure.TypeVariable p_lbdExp99 = t_lbdExp104;\n\n\tp_lbdExp99.applyPass2BehaviorJava(context);\n//EIle:func\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n//EIft:eachOwnedElement\n\n\n\tthis.createBehaviorJava(context);\n\n\tjava.lang.Boolean idIfCond_295 = false;\n\tidIfCond_295 = this.isRunnable();\n\n\tif( idIfCond_295 ) {\n\n\tsimk.SMContext smContext = context.getSimkModel().retrieveOrCreateContextForRunner(this, context);\n\n\tsimk.SMMethod staticMethod = ((simk.SMMethod) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(simk.SimkPackage.eINSTANCE.getSMMethod()));\n\n\tjava.lang.String cd_qn = kermeta.standard.helper.StringWrapper.replace(this.getOwningClass().qualifiedName(), \"::\", \".\");\n\n\tjava.lang.String class_label = ((km2ecore.helper.kermeta.CompilerHelperJava) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(km2ecore.helper.kermeta.KermetaPackage.eINSTANCE.getCompilerHelperJava())).ppEmfLikeGetEMF(cd_qn);\n\n\tstaticMethod.setName(\"main\");\n\n\tstaticMethod.setBody(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(\"\\n\", cd_qn), \" anExec = (\"), cd_qn), \")\"), \" org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"), class_label), \");\"), \"\\nanExec.\"), this.getFinalName(context)), \"(\"));\n\n\tjava.lang.Integer i = 0;\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Parameter> it_ft105 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Parameter>convertAsOrderedSet(this.getOwnedParameter()).iterator();\n\tjava.lang.Boolean idLoopCond_296 = false;\n\twhile( !idLoopCond_296 ) {\n\tidLoopCond_296 = it_ft105.isOff();\n\tif ( idLoopCond_296 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Parameter params_lbdExp105 = it_ft105.next();\n\n\tjava.lang.Boolean idIfCond_297 = false;\n\tidIfCond_297 = kermeta.standard.helper.IntegerWrapper.isGreater(i, 0);\n\n\tif( idIfCond_297 ) {\n\n\tstaticMethod.setBody(kermeta.standard.helper.StringWrapper.plus(staticMethod.getBody(), \", \"));\n}\n\n\n\tstaticMethod.setBody(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(staticMethod.getBody(), \" args[\"), kermeta.standard.helper.IntegerWrapper.toString(i)), \"]\"));\n\n\ti = kermeta.standard.helper.IntegerWrapper.plus(i, 1);\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\tstaticMethod.setBody(kermeta.standard.helper.StringWrapper.plus(staticMethod.getBody(), \");\\n\"));\n\n\tstaticMethod.setUsages(simk.SMUsage.getByName(\"Runner\"));\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<simk.SMMethod>convertAsOrderedSet(context.getSimkModel().getSMMethods()).add(staticMethod);\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<simk.SMMethod>convertAsOrderedSet(smContext.getSMMethods()).add(staticMethod);\n}\n\n}\n else {\n\n\tthis.compilingInSimkMode(context);\n}\n\n}\n\n'"
	 * @generated
	 */
	void applyPass2BehaviorJava(KM2EcoreContext context);

} // Operation
