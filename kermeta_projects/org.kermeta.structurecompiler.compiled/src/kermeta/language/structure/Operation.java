/**
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * 
 * Generating with Kermeta <http://www.kermeta.org>
 *
 * $Id: Operation.java,v 1.11 2009-02-10 17:51:53 cfaucher Exp $
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
 *        annotation="kermeta documentation='/**\r\n *\r\n \052/'"
 *        annotation="kermeta documentation='Every one knows what an operation is.'"
 * @generated
 */
public interface Operation extends Traceability<EOperation>,
		MultiplicityElement {
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = false;\n\n\tkermeta.language.structure.Parameter param = null;\n//BIft:detect\n\nkermeta.language.structure.Parameter result_ft71 = null;\n\n\tkermeta.language.structure.Parameter elem_ft71 = null;\n\n\tresult_ft71 = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Parameter> it_ft71 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Parameter>convertAsOrderedSet(this.getOwnedParameter()).iterator();\n\tjava.lang.Boolean idLoopCond_439 = false;\n\twhile( !idLoopCond_439 ) {\n\tidLoopCond_439 = kermeta.standard.helper.BooleanWrapper.or(it_ft71.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(result_ft71, null));\n\tif ( idLoopCond_439 ) {\n\t} else {\n\n\telem_ft71 = it_ft71.next();\n\n\tjava.lang.Boolean idIfCond_440 = false;\n//BIle:detector\nkermeta.language.structure.Parameter param_lbdExp71 = elem_ft71;\n\n\tidIfCond_440 = kermeta.standard.helper.BooleanWrapper.not(param_lbdExp71.isRunnable());\n//EIle:detector\n\n\n\tif( idIfCond_440 ) {\n\n\tresult_ft71 = elem_ft71;\n}\n\n}\n\t}\n}\n\n\n//CE\nparam = result_ft71;\n//EIft:detect\n;\n\n\tjava.lang.Boolean idIfCond_441 = false;\n\tidIfCond_441 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(param);\n\n\tif( idIfCond_441 ) {\n\n\tresult = true;\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean isRunnable();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaString"
	 *        annotation="kermeta superOperation='kermeta::language::structure::Object'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.String result = null;\n\n\tresult = null;\n\n\tkermeta.utils.StringBuffer javaCode = ((kermeta.utils.StringBuffer) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.utils.UtilsPackage.eINSTANCE.getStringBuffer()));\n\n\tjava.lang.Boolean idIfCond_442 = false;\n\tidIfCond_442 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(this.getBody()));\n\n\tif( idIfCond_442 ) {\n\n\tjava.lang.String type_label = \"\";\n\n\tjava.lang.Boolean idIfCond_443 = false;\n\tidIfCond_443 = context.getFtSuffixActivation();\n\n\tif( idIfCond_443 ) {\n\n\ttype_label = context.getFtReturnType();\n\n\tcontext.setFtReturnType(\"\");\n}\n else {\n\n\ttype_label = ((km2ecore.helper.kermeta.CompilerHelperJava) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(km2ecore.helper.kermeta.KermetaPackage.eINSTANCE.getCompilerHelperJava())).ppTypeFromMultiplicityElement(this, context);\n}\n\n\n\tjava.lang.Boolean idIfCond_444 = false;\n\tidIfCond_444 = kermeta.standard.helper.BooleanWrapper.not(this.isVoidType(type_label));\n\n\tif( idIfCond_444 ) {\n\n\tjavaCode.append(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(\"\\n\", type_label), \" result\"), context.printFtSuffix()), \" = null;\\n\"));\n}\n\n\n\tjavaCode.append(this.createBehaviorJavaFromPre(context));\n\n\tjavaCode.append(this.getBody().createBehaviorJava(context));\n\n\tjavaCode.append(this.createBehaviorJavaFromPost(context));\n\n\tjava.lang.Boolean idIfCond_445 = false;\n\tidIfCond_445 = kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.BooleanWrapper.not(this.isVoidType(type_label)), kermeta.standard.helper.BooleanWrapper.not(context.getFtSuffixActivation()));\n\n\tif( idIfCond_445 ) {\n\n\tjavaCode.append(this.ppReturnResult(context));\n}\n\n}\n else {\n\n\tjava.lang.Boolean idIfCond_446 = false;\n\tidIfCond_446 = kermeta.standard.helper.BooleanWrapper.not(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.language.structure.StructurePackage.eINSTANCE.getOperation())).isVoidType(this.getType().getTypeQName()));\n\n\tif( idIfCond_446 ) {\n\n\tjavaCode.append(kermeta.standard.helper.StringWrapper.plus(((km2ecore.helper.kermeta.CompilerHelperJava) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(km2ecore.helper.kermeta.KermetaPackage.eINSTANCE.getCompilerHelperJava())).ppTypeFromMultiplicityElement(this, context), \" result = null;\\n\"));\n\n\tjavaCode.append(this.ppReturnResult(context));\n}\n\n}\n\n\n\tjava.lang.Boolean idIfCond_447 = false;\n\tidIfCond_447 = kermeta.standard.helper.BooleanWrapper.and(org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(context.getTasks_stack().peek(), org.kermeta.compil.runtime.helper.language.ObjectUtil.convertAsObject(context.getFUNCTION_TYPE_COMPILATION_TASK())), org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(context.getCurrent_valueType()));\n\n\tif( idIfCond_447 ) {\n\n\t((km2ecore.helper.ecore.EAnnotationHelper) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(km2ecore.helper.ecore.EcorePackage.eINSTANCE.getEAnnotationHelper())).addAnnotationGenModelImpl(this.getEcoreModelElement(), javaCode.toString());\n}\n\n\n\tresult = javaCode.toString();\n\nreturn result;\n'"
	 * @generated
	 */
	String createBehaviorJava(KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaBoolean"
	 *        annotation="kermeta documentation='/**\r\n\t * Helper method to determine if an operation has to be compiled\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = true;\n\n\tjava.lang.Boolean idIfCond_448 = false;\n\tidIfCond_448 = this.getOwningClass().isValueType();\n\n\tif( idIfCond_448 ) {\n\n\tjava.lang.Boolean idIfCond_449 = false;\n\tidIfCond_449 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(this.getOwningClass().getEMFInstanceClassName(), \"\");\n\n\tif( idIfCond_449 ) {\n\n\tresult = false;\n}\n\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean mustBeCompiled();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaString"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.String result = null;\n\n\tresult = \"\";\n\n\tjava.lang.Boolean idIfCond_450 = false;\n\tidIfCond_450 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(this.getBody(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.Block\"));\n\n\tif( idIfCond_450 ) {\n\n\tjava.lang.Boolean idIfCond_451 = false;\n\tidIfCond_451 = kermeta.standard.helper.IntegerWrapper.equals(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.behavior.Expression>convertAsOrderedSet(((kermeta.language.behavior.Block) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(this.getBody(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.Block\"))).getStatement()).size(), 1);\n\n\tif( idIfCond_451 ) {\n\n\tjava.lang.Boolean idIfCond_452 = false;\n\tidIfCond_452 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.behavior.Expression>convertAsOrderedSet(((kermeta.language.behavior.Block) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(this.getBody(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.Block\"))).getStatement()), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.JavaStaticCall\"));\n\n\tif( idIfCond_452 ) {\n\n\tkermeta.standard.Sequence<java.lang.String> static_call_set_1 = kermeta.standard.helper.StringWrapper.split(((kermeta.language.behavior.JavaStaticCall) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.behavior.Expression>convertAsOrderedSet(((kermeta.language.behavior.Block) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(this.getBody(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.Block\"))).getStatement()), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.JavaStaticCall\"))).createBehaviorJava(context), \"(\");\n\n\tresult = static_call_set_1.first();\n}\n else {\n\n\tjava.lang.Boolean idIfCond_453 = false;\n\tidIfCond_453 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.behavior.Expression>convertAsOrderedSet(((kermeta.language.behavior.Block) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(this.getBody(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.Block\"))).getStatement()), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.Assignment\"));\n\n\tif( idIfCond_453 ) {\n\n\tjava.lang.Boolean idIfCond_454 = false;\n\tidIfCond_454 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(((kermeta.language.behavior.Assignment) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.behavior.Expression>convertAsOrderedSet(((kermeta.language.behavior.Block) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(this.getBody(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.Block\"))).getStatement()), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.Assignment\"))).getValue(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.JavaStaticCall\"));\n\n\tif( idIfCond_454 ) {\n\n\tkermeta.standard.Sequence<java.lang.String> static_call_set_2 = kermeta.standard.helper.StringWrapper.split(((kermeta.language.behavior.JavaStaticCall) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(((kermeta.language.behavior.Assignment) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.behavior.Expression>convertAsOrderedSet(((kermeta.language.behavior.Block) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(this.getBody(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.Block\"))).getStatement()), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.Assignment\"))).getValue(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.JavaStaticCall\"))).createBehaviorJava(context), \"(\");\n\n\tresult = static_call_set_2.first();\n}\n\n}\n\n}\n\n}\n\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	String getOptimizedStaticCall(KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaString"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.String result = null;\n\n\tresult = \"\";\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Constraint> it_ft72 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Constraint>convertAsOrderedSet(this.getPost()).iterator();\n\tjava.lang.Boolean idLoopCond_455 = false;\n\twhile( !idLoopCond_455 ) {\n\tidLoopCond_455 = it_ft72.isOff();\n\tif ( idLoopCond_455 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Constraint constraint_lbdExp72 = it_ft72.next();\n\n\tcontext.getResultLastStatementStack().push(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(\"result_post = \", context.getTYPE_SEPARATOR()), \"java.lang.Boolean\"));\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(result, \"\\nif( \"), context.getJAVA_CLASS_EXECUTION_CONTEXT()), \".getInstance().mustBeChecked( \\\"post__\"), kermeta.standard.helper.IntegerWrapper.toString(org.kermeta.compil.runtime.helper.language.ObjectUtil.oidSwitcher(constraint_lbdExp72))), \"__\"), constraint_lbdExp72.getName()), \"\\\" ) ) {\\n\");\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(result, \"java.lang.Boolean result_post = false;\\n\");\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(result, constraint_lbdExp72.createBehaviorJava(context)), \"\\n\");\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(result, \"if( !result_post ) {\\n\");\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(result, \"kermeta.exceptions.ConstraintViolatedPost exp = kermeta.exceptions.ExceptionsFactory.eINSTANCE.createConstraintViolatedPost();\\n\");\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(result, \"throw new \"), context.getJAVA_CLASS_EXCEPTION_SWITCHER()), \"(exp);\\n\");\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(result, \"}\\n\");\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(result, \"}\\n\");\n\n\tcontext.getResultLastStatementStack().pop();\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\tjava.lang.Boolean idIfCond_456 = false;\n\tidIfCond_456 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(result, \"\");\n\n\tif( idIfCond_456 ) {\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(\"\\n//PostConditions Checking\\n{\", result), \"}\");\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	String createBehaviorJavaFromPost(KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta superOperation='kermeta::language::structure::Object'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tecore.EOperation ecoreOperation = this.createEcoreModelElement(context);\n\n\tkermeta.language.structure.ClassDefinition c = null;\n\n\tc = (kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeOrVoid(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(this), \"kermeta.language.structure.ClassDefinition\");\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EOperation>convertAsOrderedSet(c.getEcoreModelElement().getEOperations()).add(ecoreOperation);\n\n\tthis.setEcoreModelElement(ecoreOperation);\n\n\t//BIft:eachOwnedElement\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Tag> it_ft74 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Tag>convertAsOrderedSet(this.getOwnedTags()).iterator();\n\tjava.lang.Boolean idLoopCond_457 = false;\n\twhile( !idLoopCond_457 ) {\n\tidLoopCond_457 = it_ft74.isOff();\n\tif ( idLoopCond_457 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Tag o_lbdExp74 = it_ft74.next();\n\n\t//BIle:func\nkermeta.language.structure.Tag o_lbdExp73 = o_lbdExp74;\n\n\to_lbdExp73.applyPass1(context);\n//EIle:func\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Parameter> it_ft75 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Parameter>convertAsOrderedSet(this.getOwnedParameter()).iterator();\n\tjava.lang.Boolean idLoopCond_458 = false;\n\twhile( !idLoopCond_458 ) {\n\tidLoopCond_458 = it_ft75.isOff();\n\tif ( idLoopCond_458 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Parameter o_lbdExp75 = it_ft75.next();\n\n\t//BIle:func\nkermeta.language.structure.Parameter o_lbdExp73 = o_lbdExp75;\n\n\to_lbdExp73.applyPass1(context);\n//EIle:func\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Constraint> it_ft76 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Constraint>convertAsOrderedSet(this.getPre()).iterator();\n\tjava.lang.Boolean idLoopCond_459 = false;\n\twhile( !idLoopCond_459 ) {\n\tidLoopCond_459 = it_ft76.isOff();\n\tif ( idLoopCond_459 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Constraint o_lbdExp76 = it_ft76.next();\n\n\t//BIle:func\nkermeta.language.structure.Constraint o_lbdExp73 = o_lbdExp76;\n\n\to_lbdExp73.applyPass1(context);\n//EIle:func\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Constraint> it_ft77 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Constraint>convertAsOrderedSet(this.getPost()).iterator();\n\tjava.lang.Boolean idLoopCond_460 = false;\n\twhile( !idLoopCond_460 ) {\n\tidLoopCond_460 = it_ft77.isOff();\n\tif ( idLoopCond_460 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Constraint o_lbdExp77 = it_ft77.next();\n\n\t//BIle:func\nkermeta.language.structure.Constraint o_lbdExp73 = o_lbdExp77;\n\n\to_lbdExp73.applyPass1(context);\n//EIle:func\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.TypeVariable> it_ft78 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.TypeVariable>convertAsOrderedSet(this.getTypeParameter()).iterator();\n\tjava.lang.Boolean idLoopCond_461 = false;\n\twhile( !idLoopCond_461 ) {\n\tidLoopCond_461 = it_ft78.isOff();\n\tif ( idLoopCond_461 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.TypeVariable t_lbdExp78 = it_ft78.next();\n\n\t//BIle:func\nkermeta.language.structure.TypeVariable o_lbdExp73 = t_lbdExp78;\n\n\to_lbdExp73.applyPass1(context);\n//EIle:func\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n//EIft:eachOwnedElement\n\n'"
	 * @generated
	 */
	void applyPass1(KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta superOperation='kermeta::language::structure::Object'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tjava.lang.Boolean idIfCond_462 = false;\n\tidIfCond_462 = kermeta.standard.helper.BooleanWrapper.not(this.isFunctionType());\n\n\tif( idIfCond_462 ) {\n\n\tthis.setLinks(context);\n\n\tkermeta.language.structure.helper.ObjectSuper.super_applyPass2(this, context);\n}\n\n'"
	 * @generated
	 */
	void applyPass2(KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tkermeta.language.structure.LinkSetterForTypedElement s = ((kermeta.language.structure.LinkSetterForTypedElement) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.language.structure.StructurePackage.eINSTANCE.getLinkSetterForTypedElement()));\n\n\ts.setLinks(this, this.getEcoreModelElement(), context);\n\n\tjava.lang.Boolean idIfCond_463 = false;\n\tidIfCond_463 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(this.getSuperOperation()));\n\n\tif( idIfCond_463 ) {\n\n\tjava.lang.String qualifiedName = this.getSuperOperation().getOwningClass().qualifiedName();\n\n\tecore.EAnnotation ecoreAnnotation = ((km2ecore.helper.ecore.EAnnotationHelper) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(km2ecore.helper.ecore.EcorePackage.eINSTANCE.getEAnnotationHelper())).createKermetaEAnnotation(kermeta.standard.helper.StringWrapper.toString(km2ecore.helper.ecore.KermetaEAnnotationKey.getByName(\"superOperation\").getName()), qualifiedName);\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EAnnotation>convertAsOrderedSet(this.getEcoreModelElement().getEAnnotations()).add(ecoreAnnotation);\n}\n\n'"
	 * @generated
	 */
	void setLinks(KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="kermeta.standard.JavaBoolean"
	 *        annotation="kermeta documentation='/**\r\n\t * Return true if the given operation is a FunctionType\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = false;\n\n\tjava.lang.Boolean idIfCond_464 = false;\n\tidIfCond_464 = kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(this.getFunctionTypeParameter())), kermeta.standard.helper.IntegerWrapper.isGreater(this.getFunctionTypeParameter().size(), 0));\n\n\tif( idIfCond_464 ) {\n\n\tresult = true;\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean isFunctionType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaBoolean"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = false;\n\n\tjava.lang.Boolean idIfCond_465 = false;\n\tidIfCond_465 = this.getOwningClass().isValueType();\n\n\tif( idIfCond_465 ) {\n\n\tresult = true;\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean ownedByValueType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\r\n\t * Compiling in Simk mode all the methods (inherited methods included) from ValueType\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tsimk.SMContext sMContext = context.getSimkModel().retrieveOrCreateContextForWrapper(this, context);\n\n\tjava.lang.Boolean idIfCond_466 = false;\n\tidIfCond_466 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(sMContext));\n\n\tif( idIfCond_466 ) {\n\n\tsimk.SMMethod staticMethod = ((simk.SMMethod) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(simk.SimkPackage.eINSTANCE.getSMMethod()));\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<simk.SMMethod>convertAsOrderedSet(context.getSimkModel().getSMMethods()).add(staticMethod);\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<simk.SMMethod>convertAsOrderedSet(sMContext.getSMMethods()).add(staticMethod);\n\n\tstaticMethod.setName(this.getName());\n\n\tstaticMethod.setWrapperUsage();\n\n\tsimk.SMParameter self_param = ((simk.SMParameter) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(simk.SimkPackage.eINSTANCE.getSMParameter()));\n\n\tself_param.setName(\"self\");\n\n\tjava.lang.Boolean idIfCond_467 = false;\n\tidIfCond_467 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(this.getWrapperValueTypeSelfExpression(), \"\");\n\n\tif( idIfCond_467 ) {\n\n\tkermeta.utils.Hashtable<java.lang.String, java.lang.String> map_infos = kermeta.standard.helper.StringWrapper.getPropertyInfos(this.getWrapperValueTypeSelfExpression());\n\n\tjava.lang.String map_value = map_infos.getValue(context.getCurrent_valueType().getEMFInstanceClassName());\n\n\tjava.lang.Boolean idIfCond_468 = false;\n\tidIfCond_468 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(map_value));\n\n\tif( idIfCond_468 ) {\n\n\tself_param.setType(map_value);\n}\n\n}\n\n\n\tjava.lang.Boolean idIfCond_469 = false;\n\tidIfCond_469 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(self_param.getType());\n\n\tif( idIfCond_469 ) {\n\n\tself_param.setType(context.getCurrent_valueType().getEMFInstanceClassName());\n}\n\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<simk.SMParameter>convertAsOrderedSet(staticMethod.getSMParameters()).add(self_param);\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Parameter> it_ft79 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Parameter>convertAsOrderedSet(this.getOwnedParameter()).iterator();\n\tjava.lang.Boolean idLoopCond_470 = false;\n\twhile( !idLoopCond_470 ) {\n\tidLoopCond_470 = it_ft79.isOff();\n\tif ( idLoopCond_470 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Parameter p_lbdExp79 = it_ft79.next();\n\n\tsimk.SMParameter param = ((simk.SMParameter) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(simk.SimkPackage.eINSTANCE.getSMParameter()));\n\n\tparam.setName(p_lbdExp79.getName());\n\n\tjava.lang.Boolean idIfCond_471 = false;\n\tidIfCond_471 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(p_lbdExp79.getType(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.FunctionType\")));\n\n\tif( idIfCond_471 ) {\n\n\tjava.lang.Boolean idIfCond_472 = false;\n\tidIfCond_472 = kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.StringWrapper.equals(p_lbdExp79.getType().getTypeQName(), this.getOwningClass().qualifiedName()), kermeta.standard.helper.StringWrapper.equals(p_lbdExp79.getType().getTypeQName(), \"kermeta::language::structure::Object\"));\n\n\tif( idIfCond_472 ) {\n\n\tparam.setType(context.getCurrent_valueType().getEMFInstanceClassName());\n}\n else {\n\n\tparam.setType(p_lbdExp79.getType().createBehaviorJava(context));\n\n\tjava.lang.Boolean idIfCond_473 = false;\n\tidIfCond_473 = ((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.language.structure.StructurePackage.eINSTANCE.getOperation())).isVoidType(param.getType());\n\n\tif( idIfCond_473 ) {\n\n\tparam.setType(\"void\");\n}\n\n}\n\n}\n else {\n}\n\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<simk.SMParameter>convertAsOrderedSet(staticMethod.getSMParameters()).add(param);\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\tsimk.SMReturn sMReturn = ((simk.SMReturn) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(simk.SimkPackage.eINSTANCE.getSMReturn()));\n\n\tstaticMethod.setSMReturn(sMReturn);\n\n\tjava.lang.Boolean idIfCond_474 = false;\n\tidIfCond_474 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(this.getWrapperValueTypeReturnType(), \"\");\n\n\tif( idIfCond_474 ) {\n\n\tkermeta.utils.Hashtable<java.lang.String, java.lang.String> map_infos = kermeta.standard.helper.StringWrapper.getPropertyInfos(this.getWrapperValueTypeReturnType());\n\n\tjava.lang.String map_value = map_infos.getValue(context.getCurrent_valueType().getEMFInstanceClassName());\n\n\tjava.lang.Boolean idIfCond_475 = false;\n\tidIfCond_475 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(map_value));\n\n\tif( idIfCond_475 ) {\n\n\tsMReturn.setType(map_value);\n}\n\n}\n\n\n\tjava.lang.Boolean idIfCond_476 = false;\n\tidIfCond_476 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(sMReturn.getType());\n\n\tif( idIfCond_476 ) {\n\n\tsMReturn.setType(this.getType().createBehaviorJava(context));\n\n\tjava.lang.Boolean idIfCond_477 = false;\n\tidIfCond_477 = ((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.language.structure.StructurePackage.eINSTANCE.getOperation())).isVoidType(sMReturn.getType());\n\n\tif( idIfCond_477 ) {\n\n\tsMReturn.setType(\"void\");\n}\n\n}\n\n\n\tstaticMethod.setBody(\"//Protection of the following code\\n\");\n\n\tjava.lang.Boolean idIfCond_478 = false;\n\tidIfCond_478 = kermeta.standard.helper.StringWrapper.equals(this.getName(), \"equals\");\n\n\tif( idIfCond_478 ) {\n\n\tstaticMethod.setBody(kermeta.standard.helper.StringWrapper.plus(staticMethod.getBody(), \"if( self == null || \"));\n\n\tstaticMethod.setBody(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(staticMethod.getBody(), org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Parameter>convertAsOrderedSet(this.getOwnedParameter()).first().getName()), \" == null ) {\\n\"));\n\n\tstaticMethod.setBody(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(staticMethod.getBody(), \"return self == \"), org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Parameter>convertAsOrderedSet(this.getOwnedParameter()).first().getName()), \";\\n\"));\n\n\tstaticMethod.setBody(kermeta.standard.helper.StringWrapper.plus(staticMethod.getBody(), \"}\\n\\n\"));\n}\n\n\n\tjava.lang.Boolean idIfCond_479 = false;\n\tidIfCond_479 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<java.lang.String>convertAsOrderedSet(context.getFrameworkOperations()).contains(this.getName());\n\n\tif( idIfCond_479 ) {\n\n\tstaticMethod.setBody(kermeta.standard.helper.StringWrapper.plus(staticMethod.getBody(), \"if( self == null || ((java.lang.Object) self) instanceof kermeta.language.structure.Object ) {\\n\"));\n\n\tjava.lang.Boolean idIfCond_480 = false;\n\tidIfCond_480 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(staticMethod.getSMReturn().getType(), \"void\");\n\n\tif( idIfCond_480 ) {\n\n\tstaticMethod.setBody(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(staticMethod.getBody(), \"return (\"), staticMethod.getSMReturn().getType()), \") \"));\n}\n\n\n\tstaticMethod.setBody(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(staticMethod.getBody(), context.getOBJECT_UTIL_CLASS()), \".\"), this.getName()), \"((kermeta.language.structure.Object) ((java.lang.Object) self)\"));\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Parameter> it_ft80 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Parameter>convertAsOrderedSet(this.getOwnedParameter()).iterator();\n\tjava.lang.Boolean idLoopCond_481 = false;\n\twhile( !idLoopCond_481 ) {\n\tidLoopCond_481 = it_ft80.isOff();\n\tif ( idLoopCond_481 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Parameter p_lbdExp80 = it_ft80.next();\n\n\tstaticMethod.setBody(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(staticMethod.getBody(), \", \"), p_lbdExp80.getName()));\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\tstaticMethod.setBody(kermeta.standard.helper.StringWrapper.plus(staticMethod.getBody(), \");\\n\"));\n}\n else {\n\n\tstaticMethod.setBody(kermeta.standard.helper.StringWrapper.plus(staticMethod.getBody(), \"if( self == null ) {\\n\"));\n\n\tstaticMethod.setBody(kermeta.standard.helper.StringWrapper.plus(staticMethod.getBody(), \"kermeta.exceptions.CallOnVoidTarget exp = kermeta.exceptions.ExceptionsFactory.eINSTANCE.createCallOnVoidTarget();\\n\"));\n\n\tstaticMethod.setBody(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(staticMethod.getBody(), \"exp.setMessage(\\\"Initialize the \"), context.getCurrent_valueType().getName()), \" expression\\\");\\n\"));\n\n\tstaticMethod.setBody(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(staticMethod.getBody(), \"throw new \"), context.getJAVA_CLASS_EXCEPTION_SWITCHER()), \"(exp);\\n\"));\n}\n\n\n\tstaticMethod.setBody(kermeta.standard.helper.StringWrapper.plus(staticMethod.getBody(), \"}\\n//End of the protection\\n\\n\"));\n\n\tstaticMethod.setBody(kermeta.standard.helper.StringWrapper.plus(staticMethod.getBody(), this.createBehaviorJava(context)));\n}\n\n'"
	 * @generated
	 */
	void compilingInSimkMode(KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaBoolean"
	 *        annotation="kermeta documentation='/**\r\n\t * Unused for the moment\r\n\t \052/'"
	 *        annotation="kermeta deprecated=''"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = false;\n\n\tjava.lang.Boolean idIfCond_482 = false;\n\tidIfCond_482 = kermeta.standard.helper.BooleanWrapper.or(this.getType().isValueType(), this.hasAValueTypedParameter());\n\n\tif( idIfCond_482 ) {\n\n\tresult = true;\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean mustBeDuplicated();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaString"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.String result = null;\n\n\tresult = \"\";\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Constraint> it_ft81 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Constraint>convertAsOrderedSet(this.getPre()).iterator();\n\tjava.lang.Boolean idLoopCond_483 = false;\n\twhile( !idLoopCond_483 ) {\n\tidLoopCond_483 = it_ft81.isOff();\n\tif ( idLoopCond_483 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Constraint constraint_lbdExp81 = it_ft81.next();\n\n\tcontext.getResultLastStatementStack().push(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(\"result_pre = \", context.getTYPE_SEPARATOR()), \"java.lang.Boolean\"));\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(result, \"\\nif( \"), context.getJAVA_CLASS_EXECUTION_CONTEXT()), \".getInstance().mustBeChecked( \\\"pre__\"), kermeta.standard.helper.IntegerWrapper.toString(org.kermeta.compil.runtime.helper.language.ObjectUtil.oidSwitcher(constraint_lbdExp81))), \"__\"), constraint_lbdExp81.getName()), \"\\\" ) ) {\\n\");\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(result, \"java.lang.Boolean result_pre = false;\\n\");\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(result, constraint_lbdExp81.createBehaviorJava(context)), \"\\n\");\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(result, \"if( !result_pre ) {\\n\");\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(result, \"kermeta.exceptions.ConstraintViolatedPre exp = kermeta.exceptions.ExceptionsFactory.eINSTANCE.createConstraintViolatedPre();\\n\");\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(result, \"throw new \"), context.getJAVA_CLASS_EXCEPTION_SWITCHER()), \"(exp);\\n\");\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(result, \"}\\n\");\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(result, \"}\\n\");\n\n\tcontext.getResultLastStatementStack().pop();\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\tjava.lang.Boolean idIfCond_484 = false;\n\tidIfCond_484 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(result, \"\");\n\n\tif( idIfCond_484 ) {\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(\"\\n//PreConditions Checking\\n{\", result), \"}\");\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	String createBehaviorJavaFromPre(KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.standard.Sequence<kermeta.language.structure.Parameter> result = null;\n\n\tresult = null;\n\n\tkermeta.standard.Sequence<kermeta.language.structure.Parameter> ft_parameters = null;\n//BIft:select\n\nkermeta.standard.Sequence<kermeta.language.structure.Parameter> result_ft82 = null;\n\n\tkermeta.language.structure.Parameter elem_ft82 = null;\n\n\tresult_ft82 = ((kermeta.standard.Sequence<kermeta.language.structure.Parameter>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.standard.StandardPackage.eINSTANCE.getSequence()));\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Parameter> it_ft82 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Parameter>convertAsOrderedSet(this.getOwnedParameter()).iterator();\n\tjava.lang.Boolean idLoopCond_485 = false;\n\twhile( !idLoopCond_485 ) {\n\tidLoopCond_485 = it_ft82.isOff();\n\tif ( idLoopCond_485 ) {\n\t} else {\n\n\telem_ft82 = it_ft82.next();\n\n\tjava.lang.Boolean idIfCond_486 = false;\n//BIle:selector\nkermeta.language.structure.Parameter p_lbdExp82 = elem_ft82;\n\n\tidIfCond_486 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(p_lbdExp82.getType(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.FunctionType\"));\n//EIle:selector\n\n\n\tif( idIfCond_486 ) {\n\n\tresult_ft82.add(elem_ft82);\n}\n\n}\n\t}\n}\n\n\n//CE\nft_parameters = result_ft82;\n//EIft:select\n;\n\n\tresult = ft_parameters;\n\nreturn result;\n'"
	 * @generated
	 */
	Sequence<Parameter> getFunctionTypeParameter();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaBoolean" type_labelDataType="kermeta.standard.JavaString"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = false;\n\n\tjava.lang.Boolean idIfCond_487 = false;\n\tidIfCond_487 = kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.StringWrapper.equals(type_label, \"null\"), kermeta.standard.helper.StringWrapper.equals(type_label, \"void\")), kermeta.standard.helper.StringWrapper.equals(type_label, \"Void\")), kermeta.standard.helper.StringWrapper.equals(type_label, \"VoidType\")), kermeta.standard.helper.StringWrapper.equals(type_label, \"kermeta::standard::Void\")), kermeta.standard.helper.StringWrapper.equals(type_label, \"kermeta::language::structure::VoidType\")), kermeta.standard.helper.StringWrapper.equals(type_label, \"kermeta.standard.Void\")), kermeta.standard.helper.StringWrapper.equals(type_label, \"kermeta.language.structure.VoidType\"));\n\n\tif( idIfCond_487 ) {\n\n\tresult = true;\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean isVoidType(String type_label);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\necore.EOperation result = null;\n\n\tecore.EOperation ecoreOperation = ((ecore.EOperation) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(ecore.EcorePackage.eINSTANCE.getEOperation()));\n\n\tecoreOperation.setName(this.getFinalName(context));\n\n\tecoreOperation.setOrdered(this.getIsOrdered());\n\n\tecoreOperation.setUnique(this.getIsUnique());\n\n\tecoreOperation.setLowerBound(this.getLower());\n\n\tecoreOperation.setUpperBound(this.getUpper());\n\n\tjava.lang.Boolean idIfCond_488 = false;\n\tidIfCond_488 = this.getIsAbstract();\n\n\tif( idIfCond_488 ) {\n\n\tecore.EAnnotation ecoreAnnotation = ((km2ecore.helper.ecore.EAnnotationHelper) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(km2ecore.helper.ecore.EcorePackage.eINSTANCE.getEAnnotationHelper())).createAbstract();\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EAnnotation>convertAsOrderedSet(ecoreOperation.getEAnnotations()).add(ecoreAnnotation);\n}\n\n\n\tresult = ecoreOperation;\n\nreturn result;\n'"
	 * @generated
	 */
	EOperation createEcoreModelElement(KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaBoolean"
	 *        annotation="kermeta documentation='/**\r\n\t * The given operation has at least a parameter having ValueType as type\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = false;\n\n\tkermeta.language.structure.Parameter p = null;\n//BIft:detect\n\nkermeta.language.structure.Parameter result_ft83 = null;\n\n\tkermeta.language.structure.Parameter elem_ft83 = null;\n\n\tresult_ft83 = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Parameter> it_ft83 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Parameter>convertAsOrderedSet(this.getOwnedParameter()).iterator();\n\tjava.lang.Boolean idLoopCond_489 = false;\n\twhile( !idLoopCond_489 ) {\n\tidLoopCond_489 = kermeta.standard.helper.BooleanWrapper.or(it_ft83.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(result_ft83, null));\n\tif ( idLoopCond_489 ) {\n\t} else {\n\n\telem_ft83 = it_ft83.next();\n\n\tjava.lang.Boolean idIfCond_490 = false;\n//BIle:detector\nkermeta.language.structure.Parameter p_lbdExp83 = elem_ft83;\n\n\tidIfCond_490 = p_lbdExp83.getType().isValueType();\n//EIle:detector\n\n\n\tif( idIfCond_490 ) {\n\n\tresult_ft83 = elem_ft83;\n}\n\n}\n\t}\n}\n\n\n//CE\np = result_ft83;\n//EIft:detect\n;\n\n\tjava.lang.Boolean idIfCond_491 = false;\n\tidIfCond_491 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(p));\n\n\tif( idIfCond_491 ) {\n\n\tresult = true;\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean hasAValueTypedParameter();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta superOperation='kermeta::language::structure::Object'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tjava.lang.Boolean idIfCond_492 = false;\n\tidIfCond_492 = kermeta.standard.helper.BooleanWrapper.not(this.isFunctionType());\n\n\tif( idIfCond_492 ) {\n\n\tjava.lang.Boolean idIfCond_493 = false;\n\tidIfCond_493 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(context.getCurrent_valueType());\n\n\tif( idIfCond_493 ) {\n\n\tthis.setLinks(context);\n\n\t//BIft:eachOwnedElement\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Tag> it_ft85 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Tag>convertAsOrderedSet(this.getOwnedTags()).iterator();\n\tjava.lang.Boolean idLoopCond_494 = false;\n\twhile( !idLoopCond_494 ) {\n\tidLoopCond_494 = it_ft85.isOff();\n\tif ( idLoopCond_494 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Tag o_lbdExp85 = it_ft85.next();\n\n\t//BIle:func\nkermeta.language.structure.Tag p_lbdExp84 = o_lbdExp85;\n\n\tp_lbdExp84.applyPass2BehaviorJava(context);\n//EIle:func\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Parameter> it_ft86 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Parameter>convertAsOrderedSet(this.getOwnedParameter()).iterator();\n\tjava.lang.Boolean idLoopCond_495 = false;\n\twhile( !idLoopCond_495 ) {\n\tidLoopCond_495 = it_ft86.isOff();\n\tif ( idLoopCond_495 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Parameter o_lbdExp86 = it_ft86.next();\n\n\t//BIle:func\nkermeta.language.structure.Parameter p_lbdExp84 = o_lbdExp86;\n\n\tp_lbdExp84.applyPass2BehaviorJava(context);\n//EIle:func\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Constraint> it_ft87 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Constraint>convertAsOrderedSet(this.getPre()).iterator();\n\tjava.lang.Boolean idLoopCond_496 = false;\n\twhile( !idLoopCond_496 ) {\n\tidLoopCond_496 = it_ft87.isOff();\n\tif ( idLoopCond_496 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Constraint o_lbdExp87 = it_ft87.next();\n\n\t//BIle:func\nkermeta.language.structure.Constraint p_lbdExp84 = o_lbdExp87;\n\n\tp_lbdExp84.applyPass2BehaviorJava(context);\n//EIle:func\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Constraint> it_ft88 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Constraint>convertAsOrderedSet(this.getPost()).iterator();\n\tjava.lang.Boolean idLoopCond_497 = false;\n\twhile( !idLoopCond_497 ) {\n\tidLoopCond_497 = it_ft88.isOff();\n\tif ( idLoopCond_497 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Constraint o_lbdExp88 = it_ft88.next();\n\n\t//BIle:func\nkermeta.language.structure.Constraint p_lbdExp84 = o_lbdExp88;\n\n\tp_lbdExp84.applyPass2BehaviorJava(context);\n//EIle:func\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.TypeVariable> it_ft89 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.TypeVariable>convertAsOrderedSet(this.getTypeParameter()).iterator();\n\tjava.lang.Boolean idLoopCond_498 = false;\n\twhile( !idLoopCond_498 ) {\n\tidLoopCond_498 = it_ft89.isOff();\n\tif ( idLoopCond_498 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.TypeVariable t_lbdExp89 = it_ft89.next();\n\n\t//BIle:func\nkermeta.language.structure.TypeVariable p_lbdExp84 = t_lbdExp89;\n\n\tp_lbdExp84.applyPass2BehaviorJava(context);\n//EIle:func\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n//EIft:eachOwnedElement\n\n\n\tthis.createBehaviorJava(context);\n\n\tjava.lang.Boolean idIfCond_499 = false;\n\tidIfCond_499 = this.isRunnable();\n\n\tif( idIfCond_499 ) {\n\n\tsimk.SMContext smContext = context.getSimkModel().retrieveOrCreateContextForRunner(this, context);\n\n\tsimk.SMMethod staticMethod = ((simk.SMMethod) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(simk.SimkPackage.eINSTANCE.getSMMethod()));\n\n\tjava.lang.String cd_qn = kermeta.standard.helper.StringWrapper.replace(this.getOwningClass().qualifiedName(), \"::\", \".\");\n\n\tjava.lang.String class_label = ((km2ecore.helper.kermeta.CompilerHelperJava) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(km2ecore.helper.kermeta.KermetaPackage.eINSTANCE.getCompilerHelperJava())).ppEmfLikeGetEMF(cd_qn);\n\n\tstaticMethod.setName(\"main\");\n\n\tstaticMethod.setBody(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(\"\\n\", cd_qn), \" anExec = (\"), cd_qn), \")\"), \" org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"), class_label), \");\"), \"\\nanExec.\"), this.getFinalName(context)), \"(\"));\n\n\tjava.lang.Integer i = 0;\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Parameter> it_ft90 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Parameter>convertAsOrderedSet(this.getOwnedParameter()).iterator();\n\tjava.lang.Boolean idLoopCond_500 = false;\n\twhile( !idLoopCond_500 ) {\n\tidLoopCond_500 = it_ft90.isOff();\n\tif ( idLoopCond_500 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Parameter params_lbdExp90 = it_ft90.next();\n\n\tjava.lang.Boolean idIfCond_501 = false;\n\tidIfCond_501 = kermeta.standard.helper.IntegerWrapper.isGreater(i, 0);\n\n\tif( idIfCond_501 ) {\n\n\tstaticMethod.setBody(kermeta.standard.helper.StringWrapper.plus(staticMethod.getBody(), \", \"));\n}\n\n\n\tstaticMethod.setBody(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(staticMethod.getBody(), \" args[\"), kermeta.standard.helper.IntegerWrapper.toString(i)), \"]\"));\n\n\ti = kermeta.standard.helper.IntegerWrapper.plus(i, 1);\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\tstaticMethod.setBody(kermeta.standard.helper.StringWrapper.plus(staticMethod.getBody(), \");\\n\"));\n\n\tstaticMethod.setUsages(simk.SMUsage.getByName(\"Runner\"));\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<simk.SMMethod>convertAsOrderedSet(context.getSimkModel().getSMMethods()).add(staticMethod);\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<simk.SMMethod>convertAsOrderedSet(smContext.getSMMethods()).add(staticMethod);\n}\n\n}\n else {\n\n\tthis.compilingInSimkMode(context);\n}\n\n}\n\n'"
	 * @generated
	 */
	void applyPass2BehaviorJava(KM2EcoreContext context);

} // Operation
