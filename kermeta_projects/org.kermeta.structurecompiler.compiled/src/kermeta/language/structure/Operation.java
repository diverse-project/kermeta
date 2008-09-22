/**
 * <copyright>
 * </copyright>
 *
 * $Id: Operation.java,v 1.3 2008-09-22 14:47:39 cfaucher Exp $
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
 * @model annotation="kermeta documentation='Every one knows what an operation is.'"
 *        annotation="kermeta documentation='/**\n *\n \052/'"
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.String result = null;\n\n\tresult = null;\n\n\tkermeta.utils.StringBuffer javaCode = ((kermeta.utils.StringBuffer) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.utils.StringBuffer\"));\n\n\tjava.lang.Boolean idIfCond_501 = false;\n\tidIfCond_501 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoid(this.getBody()));\n\n\tif( idIfCond_501 ) {\n\n\tjava.lang.String type_label = \"\";\n\n\tjava.lang.Boolean idIfCond_502 = false;\n\tidIfCond_502 = context.getFtSuffixActivation();\n\n\tif( idIfCond_502 ) {\n\n\ttype_label = context.getFtReturnType();\n\n\tcontext.setFtReturnType(\"\");\n}\n else {\n\n\ttype_label = ((km2ecore.helper.kermeta.CompilerHelperJava) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"km2ecore.helper.kermeta.CompilerHelperJava\")).ppTypeFromMultiplicityElement(this, context);\n}\n\n\n\tjava.lang.Boolean idIfCond_503 = false;\n\tidIfCond_503 = kermeta.standard.helper.BooleanWrapper.not(this.isVoidType(type_label));\n\n\tif( idIfCond_503 ) {\n\n\tjavaCode.append(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(\"\\n\", type_label), \" result\"), context.printFtSuffix()), \" = null;\\n\"));\n}\n\n\n\tjavaCode.append(this.getBody().createBehaviorJava(context));\n\n\tjava.lang.Boolean idIfCond_504 = false;\n\tidIfCond_504 = kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.BooleanWrapper.not(this.isVoidType(type_label)), kermeta.standard.helper.BooleanWrapper.not(context.getFtSuffixActivation()));\n\n\tif( idIfCond_504 ) {\n\n\tjavaCode.append(this.ppReturnResult(context));\n}\n\n}\n else {\n\n\tjava.lang.Boolean idIfCond_505 = false;\n\tidIfCond_505 = kermeta.standard.helper.BooleanWrapper.not(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.language.structure.Operation\")).isVoidType(this.getType().getTypeQName()));\n\n\tif( idIfCond_505 ) {\n\n\tjavaCode.append(kermeta.standard.helper.StringWrapper.plus(((km2ecore.helper.kermeta.CompilerHelperJava) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"km2ecore.helper.kermeta.CompilerHelperJava\")).ppTypeFromMultiplicityElement(this, context), \" result = null;\\n\"));\n\n\tjavaCode.append(this.ppReturnResult(context));\n}\n\n}\n\n\n\tjava.lang.Boolean idIfCond_506 = false;\n\tidIfCond_506 = kermeta.standard.helper.BooleanWrapper.and(org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqual(context.getTasks_stack().peek(), context.getFUNCTION_TYPE_COMPILATION_TASK()), org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoid(context.getCurrent_valueType()));\n\n\tif( idIfCond_506 ) {\n\n\t((km2ecore.helper.ecore.EAnnotationHelper) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"km2ecore.helper.ecore.EAnnotationHelper\")).addAnnotationGenModelImpl(this.getEcoreModelElement(), javaCode.toString());\n}\n\n\n\tresult = javaCode.toString();\n\nreturn result;\n'"
	 * @generated
	 */
	String createBehaviorJava(KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="kermeta.standard.JavaBoolean"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = false;\n\n\tkermeta.language.structure.Parameter param = null;\n//BIft:detect\n\nkermeta.language.structure.Parameter result_ft79 = null;\n\n\tkermeta.language.structure.Parameter elem_ft79 = null;\n\n\tresult_ft79 = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Parameter> it_ft79 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Parameter>convertAsOrderedSet(this.getOwnedParameter()).iterator();\n\tjava.lang.Boolean idLoopCond_507 = false;\n\twhile( !idLoopCond_507 ) {\n\tidLoopCond_507 = kermeta.standard.helper.BooleanWrapper.or(it_ft79.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqual(result_ft79, null));\n\tif ( idLoopCond_507 ) {\n\t} else {\n\n\telem_ft79 = it_ft79.next();\n\n\tjava.lang.Boolean idIfCond_508 = false;\n//BIle:detector\nkermeta.language.structure.Parameter param_lbdExp79 = elem_ft79;\n\n\tidIfCond_508 = kermeta.standard.helper.BooleanWrapper.not(param_lbdExp79.isRunnable());\n//EIle:detector\n\n\n\tif( idIfCond_508 ) {\n\n\tresult_ft79 = elem_ft79;\n}\n\n}\n\t}\n}\n\n\n//CE\nparam = result_ft79;\n//EIft:detect\n\n\n\tjava.lang.Boolean idIfCond_509 = false;\n\tidIfCond_509 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoid(param);\n\n\tif( idIfCond_509 ) {\n\n\tresult = true;\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean isRunnable();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaString"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.String result = null;\n\n\tresult = \"\";\n\n\tjava.lang.Boolean idIfCond_510 = false;\n\tidIfCond_510 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOf(this.getBody(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.Block\"));\n\n\tif( idIfCond_510 ) {\n\n\tjava.lang.Boolean idIfCond_511 = false;\n\tidIfCond_511 = kermeta.standard.helper.IntegerWrapper.equals(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.behavior.Expression>convertAsOrderedSet(((kermeta.language.behavior.Block) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(this.getBody(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.Block\"))).getStatement()).size(), 1);\n\n\tif( idIfCond_511 ) {\n\n\tjava.lang.Boolean idIfCond_512 = false;\n\tidIfCond_512 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOf(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.behavior.Expression>convertAsOrderedSet(((kermeta.language.behavior.Block) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(this.getBody(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.Block\"))).getStatement()), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.JavaStaticCall\"));\n\n\tif( idIfCond_512 ) {\n\n\tkermeta.standard.OrderedSet<java.lang.String> static_call_set_1 = kermeta.standard.helper.StringWrapper.split(((kermeta.language.behavior.JavaStaticCall) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.behavior.Expression>convertAsOrderedSet(((kermeta.language.behavior.Block) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(this.getBody(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.Block\"))).getStatement()), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.JavaStaticCall\"))).createBehaviorJava(context), \"(\");\n\n\tresult = static_call_set_1.first();\n}\n else {\n\n\tjava.lang.Boolean idIfCond_513 = false;\n\tidIfCond_513 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOf(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.behavior.Expression>convertAsOrderedSet(((kermeta.language.behavior.Block) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(this.getBody(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.Block\"))).getStatement()), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.Assignment\"));\n\n\tif( idIfCond_513 ) {\n\n\tjava.lang.Boolean idIfCond_514 = false;\n\tidIfCond_514 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOf(((kermeta.language.behavior.Assignment) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.behavior.Expression>convertAsOrderedSet(((kermeta.language.behavior.Block) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(this.getBody(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.Block\"))).getStatement()), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.Assignment\"))).getValue(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.JavaStaticCall\"));\n\n\tif( idIfCond_514 ) {\n\n\tkermeta.standard.OrderedSet<java.lang.String> static_call_set_2 = kermeta.standard.helper.StringWrapper.split(((kermeta.language.behavior.JavaStaticCall) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(((kermeta.language.behavior.Assignment) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.behavior.Expression>convertAsOrderedSet(((kermeta.language.behavior.Block) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(this.getBody(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.Block\"))).getStatement()), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.Assignment\"))).getValue(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.JavaStaticCall\"))).createBehaviorJava(context), \"(\");\n\n\tresult = static_call_set_2.first();\n}\n\n}\n\n}\n\n}\n\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	String getOptimizedStaticCall(KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaBoolean"
	 *        annotation="kermeta documentation='/**\n\t * Helper method to determine if an operation has to be compiled\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = true;\n\n\tkermeta.language.structure.ClassDefinition cd_container = ((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(org.kermeta.compil.runtime.helper.language.ObjectUtil.container(this), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ClassDefinition\")));\n\n\tjava.lang.Boolean idIfCond_515 = false;\n\tidIfCond_515 = cd_container.isValueType();\n\n\tif( idIfCond_515 ) {\n\n\tjava.lang.Boolean idIfCond_516 = false;\n\tidIfCond_516 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqual(cd_container.getEMFInstanceClassName(), \"\");\n\n\tif( idIfCond_516 ) {\n\n\tresult = false;\n}\n\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean mustBeCompiled();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta superOperation='kermeta::language::structure::Object'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tecore.EOperation ecoreOperation = this.createEcoreModelElement(context);\n\n\tkermeta.language.structure.ClassDefinition c = null;\n\n\tc = (kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil.container(this);\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EOperation>convertAsOrderedSet(c.getEcoreModelElement().getEOperations()).add(ecoreOperation);\n\n\tthis.setEcoreModelElement(ecoreOperation);\n\n\t//BIft:eachOwnedElement\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Tag> it_ft81 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Tag>convertAsOrderedSet(this.getOwnedTags()).iterator();\n\tjava.lang.Boolean idLoopCond_517 = false;\n\twhile( !idLoopCond_517 ) {\n\tidLoopCond_517 = it_ft81.isOff();\n\tif ( idLoopCond_517 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Tag o_lbdExp81 = it_ft81.next();\n\n\t//BIle:func\nkermeta.language.structure.Tag o_lbdExp80 = o_lbdExp81;\n\n\to_lbdExp80.applyPass1(context);\n//EIle:func\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Parameter> it_ft82 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Parameter>convertAsOrderedSet(this.getOwnedParameter()).iterator();\n\tjava.lang.Boolean idLoopCond_518 = false;\n\twhile( !idLoopCond_518 ) {\n\tidLoopCond_518 = it_ft82.isOff();\n\tif ( idLoopCond_518 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Parameter o_lbdExp82 = it_ft82.next();\n\n\t//BIle:func\nkermeta.language.structure.Parameter o_lbdExp80 = o_lbdExp82;\n\n\to_lbdExp80.applyPass1(context);\n//EIle:func\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Constraint> it_ft83 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Constraint>convertAsOrderedSet(this.getPre()).iterator();\n\tjava.lang.Boolean idLoopCond_519 = false;\n\twhile( !idLoopCond_519 ) {\n\tidLoopCond_519 = it_ft83.isOff();\n\tif ( idLoopCond_519 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Constraint o_lbdExp83 = it_ft83.next();\n\n\t//BIle:func\nkermeta.language.structure.Constraint o_lbdExp80 = o_lbdExp83;\n\n\to_lbdExp80.applyPass1(context);\n//EIle:func\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Constraint> it_ft84 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Constraint>convertAsOrderedSet(this.getPost()).iterator();\n\tjava.lang.Boolean idLoopCond_520 = false;\n\twhile( !idLoopCond_520 ) {\n\tidLoopCond_520 = it_ft84.isOff();\n\tif ( idLoopCond_520 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Constraint o_lbdExp84 = it_ft84.next();\n\n\t//BIle:func\nkermeta.language.structure.Constraint o_lbdExp80 = o_lbdExp84;\n\n\to_lbdExp80.applyPass1(context);\n//EIle:func\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.TypeVariable> it_ft85 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.TypeVariable>convertAsOrderedSet(this.getTypeParameter()).iterator();\n\tjava.lang.Boolean idLoopCond_521 = false;\n\twhile( !idLoopCond_521 ) {\n\tidLoopCond_521 = it_ft85.isOff();\n\tif ( idLoopCond_521 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.TypeVariable t_lbdExp85 = it_ft85.next();\n\n\t//BIle:func\nkermeta.language.structure.TypeVariable o_lbdExp80 = t_lbdExp85;\n\n\to_lbdExp80.applyPass1(context);\n//EIle:func\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n//EIft:eachOwnedElement\n\n'"
	 * @generated
	 */
	void applyPass1(KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta superOperation='kermeta::language::structure::Object'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tjava.lang.Boolean idIfCond_522 = false;\n\tidIfCond_522 = kermeta.standard.helper.BooleanWrapper.not(this.isFunctionType());\n\n\tif( idIfCond_522 ) {\n\n\tthis.setLinks(context);\n\n\tkermeta.language.structure.helper.ObjectSuper.super_applyPass2(this, context);\n}\n\n'"
	 * @generated
	 */
	void applyPass2(KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tkermeta.language.structure.LinkSetterForTypedElement s = ((kermeta.language.structure.LinkSetterForTypedElement) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.language.structure.LinkSetterForTypedElement\"));\n\n\ts.setLinks(this, this.getEcoreModelElement(), context);\n\n\tjava.lang.Boolean idIfCond_523 = false;\n\tidIfCond_523 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoid(this.getSuperOperation()));\n\n\tif( idIfCond_523 ) {\n\n\tjava.lang.String qualifiedName = this.getSuperOperation().getOwningClass().qualifiedName();\n\n\tecore.EAnnotation ecoreAnnotation = ((km2ecore.helper.ecore.EAnnotationHelper) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"km2ecore.helper.ecore.EAnnotationHelper\")).createKermetaEAnnotation(kermeta.standard.helper.StringWrapper.toString(km2ecore.helper.ecore.KermetaEAnnotationKey.getByName(\"superOperation\").getName()), qualifiedName);\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EAnnotation>convertAsOrderedSet(this.getEcoreModelElement().getEAnnotations()).add(ecoreAnnotation);\n}\n\n'"
	 * @generated
	 */
	void setLinks(KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="kermeta.standard.JavaBoolean"
	 *        annotation="kermeta documentation='/**\n\t * Return true if the given operation is a FunctionType\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = false;\n\n\tjava.lang.Boolean idIfCond_524 = false;\n\tidIfCond_524 = kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoid(this.getFunctionTypeParameter())), kermeta.standard.helper.IntegerWrapper.isGreater(this.getFunctionTypeParameter().size(), 0));\n\n\tif( idIfCond_524 ) {\n\n\tresult = true;\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean isFunctionType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\n\t * Compiling in Simk mode all the methods (inherited methods included) from ValueType\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tsimk.SMContext sMContext = context.getSimkModel().retrieveOrCreateContextForWrapper(this, context);\n\n\tjava.lang.Boolean idIfCond_525 = false;\n\tidIfCond_525 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoid(sMContext));\n\n\tif( idIfCond_525 ) {\n\n\tsimk.StaticMethod staticMethod = ((simk.StaticMethod) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"simk.StaticMethod\"));\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<simk.StaticMethod>convertAsOrderedSet(context.getSimkModel().getStaticMethods()).add(staticMethod);\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<simk.StaticMethod>convertAsOrderedSet(sMContext.getStaticMethods()).add(staticMethod);\n\n\tstaticMethod.setName(this.getName());\n\n\tstaticMethod.setWrapperUsage();\n\n\tsimk.SMParameter self_param = ((simk.SMParameter) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"simk.SMParameter\"));\n\n\tself_param.setName(\"self\");\n\n\tjava.lang.Boolean idIfCond_526 = false;\n\tidIfCond_526 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqual(this.getWrapperValueTypeSelfExpression(), \"\");\n\n\tif( idIfCond_526 ) {\n\n\tkermeta.utils.Hashtable<java.lang.String, java.lang.String> map_infos = kermeta.standard.helper.StringWrapper.getPropertyInfos(this.getWrapperValueTypeSelfExpression());\n\n\tjava.lang.String map_value = map_infos.getValue(context.getCurrent_valueType().getEMFInstanceClassName());\n\n\tjava.lang.Boolean idIfCond_527 = false;\n\tidIfCond_527 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoid(map_value));\n\n\tif( idIfCond_527 ) {\n\n\tself_param.setType(map_value);\n}\n\n}\n\n\n\tjava.lang.Boolean idIfCond_528 = false;\n\tidIfCond_528 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoid(self_param.getType());\n\n\tif( idIfCond_528 ) {\n\n\tself_param.setType(context.getCurrent_valueType().getEMFInstanceClassName());\n}\n\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<simk.SMParameter>convertAsOrderedSet(staticMethod.getSMParameters()).add(self_param);\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Parameter> it_ft86 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Parameter>convertAsOrderedSet(this.getOwnedParameter()).iterator();\n\tjava.lang.Boolean idLoopCond_529 = false;\n\twhile( !idLoopCond_529 ) {\n\tidLoopCond_529 = it_ft86.isOff();\n\tif ( idLoopCond_529 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Parameter p_lbdExp86 = it_ft86.next();\n\n\tsimk.SMParameter param = ((simk.SMParameter) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"simk.SMParameter\"));\n\n\tparam.setName(p_lbdExp86.getName());\n\n\tjava.lang.Boolean idIfCond_530 = false;\n\tidIfCond_530 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOf(p_lbdExp86.getType(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.FunctionType\")));\n\n\tif( idIfCond_530 ) {\n\n\tjava.lang.Boolean idIfCond_531 = false;\n\tidIfCond_531 = kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.StringWrapper.equals(p_lbdExp86.getType().getTypeQName(), ((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(org.kermeta.compil.runtime.helper.language.ObjectUtil.container(this), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ClassDefinition\"))).qualifiedName()), kermeta.standard.helper.StringWrapper.equals(p_lbdExp86.getType().getTypeQName(), \"kermeta::language::structure::Object\"));\n\n\tif( idIfCond_531 ) {\n\n\tparam.setType(context.getCurrent_valueType().getEMFInstanceClassName());\n}\n else {\n\n\tparam.setType(p_lbdExp86.getType().createBehaviorJava(context));\n\n\tjava.lang.Boolean idIfCond_532 = false;\n\tidIfCond_532 = ((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.language.structure.Operation\")).isVoidType(param.getType());\n\n\tif( idIfCond_532 ) {\n\n\tparam.setType(\"void\");\n}\n\n}\n\n}\n else {\n}\n\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<simk.SMParameter>convertAsOrderedSet(staticMethod.getSMParameters()).add(param);\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\tsimk.SMReturn sMReturn = ((simk.SMReturn) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"simk.SMReturn\"));\n\n\tstaticMethod.setSMReturn(sMReturn);\n\n\tjava.lang.Boolean idIfCond_533 = false;\n\tidIfCond_533 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqual(this.getWrapperValueTypeReturnType(), \"\");\n\n\tif( idIfCond_533 ) {\n\n\tkermeta.utils.Hashtable<java.lang.String, java.lang.String> map_infos = kermeta.standard.helper.StringWrapper.getPropertyInfos(this.getWrapperValueTypeReturnType());\n\n\tjava.lang.String map_value = map_infos.getValue(context.getCurrent_valueType().getEMFInstanceClassName());\n\n\tjava.lang.Boolean idIfCond_534 = false;\n\tidIfCond_534 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoid(map_value));\n\n\tif( idIfCond_534 ) {\n\n\tsMReturn.setType(map_value);\n}\n\n}\n\n\n\tjava.lang.Boolean idIfCond_535 = false;\n\tidIfCond_535 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoid(sMReturn.getType());\n\n\tif( idIfCond_535 ) {\n\n\tsMReturn.setType(this.getType().createBehaviorJava(context));\n\n\tjava.lang.Boolean idIfCond_536 = false;\n\tidIfCond_536 = ((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.language.structure.Operation\")).isVoidType(sMReturn.getType());\n\n\tif( idIfCond_536 ) {\n\n\tsMReturn.setType(\"void\");\n}\n\n}\n\n\n\tstaticMethod.setBody(this.createBehaviorJava(context));\n}\n\n'"
	 * @generated
	 */
	void compilingInSimkMode(KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaBoolean"
	 *        annotation="kermeta documentation='/**\n\t * Unused for the moment\n\t \052/'"
	 *        annotation="kermeta deprecated=''"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = false;\n\n\tjava.lang.Boolean idIfCond_537 = false;\n\tidIfCond_537 = kermeta.standard.helper.BooleanWrapper.or(this.getType().isValueType(), this.hasAValueTypedParameter());\n\n\tif( idIfCond_537 ) {\n\n\tresult = true;\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean mustBeDuplicated();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.standard.Sequence<kermeta.language.structure.Parameter> result = null;\n\n\tresult = null;\n\n\tkermeta.standard.Sequence<kermeta.language.structure.Parameter> ft_parameters = null;\n//BIft:select\n\nkermeta.standard.Sequence<kermeta.language.structure.Parameter> result_ft87 = null;\n\n\tkermeta.language.structure.Parameter elem_ft87 = null;\n\n\tresult_ft87 = ((kermeta.standard.Sequence<kermeta.language.structure.Parameter>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.standard.Sequence<kermeta.language.structure.Parameter>\"));\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Parameter> it_ft87 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Parameter>convertAsOrderedSet(this.getOwnedParameter()).iterator();\n\tjava.lang.Boolean idLoopCond_538 = false;\n\twhile( !idLoopCond_538 ) {\n\tidLoopCond_538 = it_ft87.isOff();\n\tif ( idLoopCond_538 ) {\n\t} else {\n\n\telem_ft87 = it_ft87.next();\n\n\tjava.lang.Boolean idIfCond_539 = false;\n//BIle:selector\nkermeta.language.structure.Parameter p_lbdExp87 = elem_ft87;\n\n\tidIfCond_539 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOf(p_lbdExp87.getType(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.FunctionType\"));\n//EIle:selector\n\n\n\tif( idIfCond_539 ) {\n\n\tresult_ft87.add(elem_ft87);\n}\n\n}\n\t}\n}\n\n\n//CE\nft_parameters = result_ft87;\n//EIft:select\n\n\n\tresult = ft_parameters;\n\nreturn result;\n'"
	 * @generated
	 */
	Sequence<Parameter> getFunctionTypeParameter();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaBoolean" type_labelDataType="kermeta.standard.JavaString"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = false;\n\n\tjava.lang.Boolean idIfCond_540 = false;\n\tidIfCond_540 = kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.StringWrapper.equals(type_label, \"null\"), kermeta.standard.helper.StringWrapper.equals(type_label, \"void\")), kermeta.standard.helper.StringWrapper.equals(type_label, \"Void\")), kermeta.standard.helper.StringWrapper.equals(type_label, \"VoidType\")), kermeta.standard.helper.StringWrapper.equals(type_label, \"kermeta::standard::Void\")), kermeta.standard.helper.StringWrapper.equals(type_label, \"kermeta::standard::VoidType\")), kermeta.standard.helper.StringWrapper.equals(type_label, \"kermeta::language::structure::Void\")), kermeta.standard.helper.StringWrapper.equals(type_label, \"kermeta::language::structure::VoidType\")), kermeta.standard.helper.StringWrapper.equals(type_label, \"kermeta.standard.Void\")), kermeta.standard.helper.StringWrapper.equals(type_label, \"kermeta.standard.VoidType\")), kermeta.standard.helper.StringWrapper.equals(type_label, \"kermeta.language.structure.Void\")), kermeta.standard.helper.StringWrapper.equals(type_label, \"kermeta.language.structure.VoidType\"));\n\n\tif( idIfCond_540 ) {\n\n\tresult = true;\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean isVoidType(String type_label);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\necore.EOperation result = null;\n\n\tecore.EOperation ecoreOperation = ((ecore.EOperation) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"ecore.EOperation\"));\n\n\tecoreOperation.setName(((km2ecore.helper.java.IdentifierHelper) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"km2ecore.helper.java.IdentifierHelper\")).getMangledIdentifier(this.getFinalName(), context));\n\n\tecoreOperation.setOrdered(this.getIsOrdered());\n\n\tecoreOperation.setUnique(this.getIsUnique());\n\n\tecoreOperation.setLowerBound(this.getLower());\n\n\tecoreOperation.setUpperBound(this.getUpper());\n\n\tjava.lang.Boolean idIfCond_541 = false;\n\tidIfCond_541 = this.getIsAbstract();\n\n\tif( idIfCond_541 ) {\n\n\tecore.EAnnotation ecoreAnnotation = ((km2ecore.helper.ecore.EAnnotationHelper) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"km2ecore.helper.ecore.EAnnotationHelper\")).createAbstract();\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EAnnotation>convertAsOrderedSet(ecoreOperation.getEAnnotations()).add(ecoreAnnotation);\n}\n\n\n\tresult = ecoreOperation;\n\nreturn result;\n'"
	 * @generated
	 */
	EOperation createEcoreModelElement(KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaBoolean"
	 *        annotation="kermeta documentation='/**\n\t * The given operation has at least a parameter having ValueType as type\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = false;\n\n\tkermeta.language.structure.Parameter p = null;\n//BIft:detect\n\nkermeta.language.structure.Parameter result_ft88 = null;\n\n\tkermeta.language.structure.Parameter elem_ft88 = null;\n\n\tresult_ft88 = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Parameter> it_ft88 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Parameter>convertAsOrderedSet(this.getOwnedParameter()).iterator();\n\tjava.lang.Boolean idLoopCond_542 = false;\n\twhile( !idLoopCond_542 ) {\n\tidLoopCond_542 = kermeta.standard.helper.BooleanWrapper.or(it_ft88.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqual(result_ft88, null));\n\tif ( idLoopCond_542 ) {\n\t} else {\n\n\telem_ft88 = it_ft88.next();\n\n\tjava.lang.Boolean idIfCond_543 = false;\n//BIle:detector\nkermeta.language.structure.Parameter p_lbdExp88 = elem_ft88;\n\n\tidIfCond_543 = p_lbdExp88.getType().isValueType();\n//EIle:detector\n\n\n\tif( idIfCond_543 ) {\n\n\tresult_ft88 = elem_ft88;\n}\n\n}\n\t}\n}\n\n\n//CE\np = result_ft88;\n//EIft:detect\n\n\n\tjava.lang.Boolean idIfCond_544 = false;\n\tidIfCond_544 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoid(p));\n\n\tif( idIfCond_544 ) {\n\n\tresult = true;\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean hasAValueTypedParameter();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta superOperation='kermeta::language::structure::Object'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tjava.lang.Boolean idIfCond_545 = false;\n\tidIfCond_545 = kermeta.standard.helper.BooleanWrapper.not(this.isFunctionType());\n\n\tif( idIfCond_545 ) {\n\n\tjava.lang.Boolean idIfCond_546 = false;\n\tidIfCond_546 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoid(context.getCurrent_valueType());\n\n\tif( idIfCond_546 ) {\n\n\tthis.setLinks(context);\n\n\t//BIft:eachOwnedElement\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Tag> it_ft90 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Tag>convertAsOrderedSet(this.getOwnedTags()).iterator();\n\tjava.lang.Boolean idLoopCond_547 = false;\n\twhile( !idLoopCond_547 ) {\n\tidLoopCond_547 = it_ft90.isOff();\n\tif ( idLoopCond_547 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Tag o_lbdExp90 = it_ft90.next();\n\n\t//BIle:func\nkermeta.language.structure.Tag p_lbdExp89 = o_lbdExp90;\n\n\tp_lbdExp89.applyPass2BehaviorJava(context);\n//EIle:func\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Parameter> it_ft91 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Parameter>convertAsOrderedSet(this.getOwnedParameter()).iterator();\n\tjava.lang.Boolean idLoopCond_548 = false;\n\twhile( !idLoopCond_548 ) {\n\tidLoopCond_548 = it_ft91.isOff();\n\tif ( idLoopCond_548 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Parameter o_lbdExp91 = it_ft91.next();\n\n\t//BIle:func\nkermeta.language.structure.Parameter p_lbdExp89 = o_lbdExp91;\n\n\tp_lbdExp89.applyPass2BehaviorJava(context);\n//EIle:func\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Constraint> it_ft92 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Constraint>convertAsOrderedSet(this.getPre()).iterator();\n\tjava.lang.Boolean idLoopCond_549 = false;\n\twhile( !idLoopCond_549 ) {\n\tidLoopCond_549 = it_ft92.isOff();\n\tif ( idLoopCond_549 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Constraint o_lbdExp92 = it_ft92.next();\n\n\t//BIle:func\nkermeta.language.structure.Constraint p_lbdExp89 = o_lbdExp92;\n\n\tp_lbdExp89.applyPass2BehaviorJava(context);\n//EIle:func\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Constraint> it_ft93 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Constraint>convertAsOrderedSet(this.getPost()).iterator();\n\tjava.lang.Boolean idLoopCond_550 = false;\n\twhile( !idLoopCond_550 ) {\n\tidLoopCond_550 = it_ft93.isOff();\n\tif ( idLoopCond_550 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Constraint o_lbdExp93 = it_ft93.next();\n\n\t//BIle:func\nkermeta.language.structure.Constraint p_lbdExp89 = o_lbdExp93;\n\n\tp_lbdExp89.applyPass2BehaviorJava(context);\n//EIle:func\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.TypeVariable> it_ft94 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.TypeVariable>convertAsOrderedSet(this.getTypeParameter()).iterator();\n\tjava.lang.Boolean idLoopCond_551 = false;\n\twhile( !idLoopCond_551 ) {\n\tidLoopCond_551 = it_ft94.isOff();\n\tif ( idLoopCond_551 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.TypeVariable t_lbdExp94 = it_ft94.next();\n\n\t//BIle:func\nkermeta.language.structure.TypeVariable p_lbdExp89 = t_lbdExp94;\n\n\tp_lbdExp89.applyPass2BehaviorJava(context);\n//EIle:func\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n//EIft:eachOwnedElement\n\n\n\tthis.createBehaviorJava(context);\n\n\tjava.lang.Boolean idIfCond_552 = false;\n\tidIfCond_552 = this.isRunnable();\n\n\tif( idIfCond_552 ) {\n\n\tsimk.SMContext smContext = context.getSimkModel().retrieveOrCreateContextForRunner(this, context);\n\n\tsimk.StaticMethod staticMethod = ((simk.StaticMethod) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"simk.StaticMethod\"));\n\n\tjava.lang.String cd_qn = kermeta.standard.helper.StringWrapper.replace(((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(org.kermeta.compil.runtime.helper.language.ObjectUtil.container(this), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ClassDefinition\"))).qualifiedName(), \"::\", \".\");\n\n\tstaticMethod.setName(\"main\");\n\n\tstaticMethod.setBody(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(\"\\n\", cd_qn), \" anExec = (\"), cd_qn), \")\"), \" org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\\\"\"), cd_qn), \"\\\");\"), \"\\nanExec.\"), ((km2ecore.helper.java.IdentifierHelper) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"km2ecore.helper.java.IdentifierHelper\")).getMangledIdentifier(this.getFinalName(), context)), \"(\"));\n\n\tjava.lang.Integer i = 0;\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Parameter> it_ft95 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Parameter>convertAsOrderedSet(this.getOwnedParameter()).iterator();\n\tjava.lang.Boolean idLoopCond_553 = false;\n\twhile( !idLoopCond_553 ) {\n\tidLoopCond_553 = it_ft95.isOff();\n\tif ( idLoopCond_553 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Parameter params_lbdExp95 = it_ft95.next();\n\n\tjava.lang.Boolean idIfCond_554 = false;\n\tidIfCond_554 = kermeta.standard.helper.IntegerWrapper.isGreater(i, 0);\n\n\tif( idIfCond_554 ) {\n\n\tstaticMethod.setBody(kermeta.standard.helper.StringWrapper.plus(staticMethod.getBody(), \", \"));\n}\n\n\n\tstaticMethod.setBody(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(staticMethod.getBody(), \" args[\"), kermeta.standard.helper.IntegerWrapper.toString(i)), \"]\"));\n\n\ti = kermeta.standard.helper.IntegerWrapper.plus(i, 1);\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\tstaticMethod.setBody(kermeta.standard.helper.StringWrapper.plus(staticMethod.getBody(), \");\\n\"));\n\n\tstaticMethod.setUsages(simk.SMUsage.getByName(\"Runner\"));\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<simk.StaticMethod>convertAsOrderedSet(context.getSimkModel().getStaticMethods()).add(staticMethod);\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<simk.StaticMethod>convertAsOrderedSet(smContext.getStaticMethods()).add(staticMethod);\n}\n\n}\n else {\n\n\tthis.compilingInSimkMode(context);\n}\n\n}\n\n'"
	 * @generated
	 */
	void applyPass2BehaviorJava(KM2EcoreContext context);

} // Operation
