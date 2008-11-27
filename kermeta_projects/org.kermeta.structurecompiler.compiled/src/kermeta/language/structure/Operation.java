/**
 * <copyright>
 * </copyright>
 *
 * $Id: Operation.java,v 1.9 2008-11-27 15:50:03 cfaucher Exp $
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
 *        annotation="kermeta documentation='/**\n *\n \052/'"
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
	 * @model dataType="kermeta.standard.JavaString"
	 *        annotation="kermeta superOperation='kermeta::language::structure::Object'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.String result = null;\n\n\tresult = null;\n\n\tkermeta.utils.StringBuffer javaCode = ((kermeta.utils.StringBuffer) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.utils.StringBuffer\"));\n\n\tjava.lang.Boolean idIfCond_72 = false;\n\tidIfCond_72 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(this.getBody()));\n\n\tif( idIfCond_72 ) {\n\n\tjava.lang.String type_label = \"\";\n\n\tjava.lang.Boolean idIfCond_73 = false;\n\tidIfCond_73 = context.getFtSuffixActivation();\n\n\tif( idIfCond_73 ) {\n\n\ttype_label = context.getFtReturnType();\n\n\tcontext.setFtReturnType(\"\");\n}\n else {\n\n\ttype_label = ((km2ecore.helper.kermeta.CompilerHelperJava) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"km2ecore.helper.kermeta.CompilerHelperJava\")).ppTypeFromMultiplicityElement(this, context);\n}\n\n\n\tjava.lang.Boolean idIfCond_74 = false;\n\tidIfCond_74 = kermeta.standard.helper.BooleanWrapper.not(this.isVoidType(type_label));\n\n\tif( idIfCond_74 ) {\n\n\tjavaCode.append(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(\"\\n\", type_label), \" result\"), context.printFtSuffix()), \" = null;\\n\"));\n}\n\n\n\tjavaCode.append(this.createBehaviorJavaFromPre(context));\n\n\tjavaCode.append(this.getBody().createBehaviorJava(context));\n\n\tjavaCode.append(this.createBehaviorJavaFromPost(context));\n\n\tjava.lang.Boolean idIfCond_75 = false;\n\tidIfCond_75 = kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.BooleanWrapper.not(this.isVoidType(type_label)), kermeta.standard.helper.BooleanWrapper.not(context.getFtSuffixActivation()));\n\n\tif( idIfCond_75 ) {\n\n\tjavaCode.append(this.ppReturnResult(context));\n}\n\n}\n else {\n\n\tjava.lang.Boolean idIfCond_76 = false;\n\tidIfCond_76 = kermeta.standard.helper.BooleanWrapper.not(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.language.structure.Operation\")).isVoidType(this.getType().getTypeQName()));\n\n\tif( idIfCond_76 ) {\n\n\tjavaCode.append(kermeta.standard.helper.StringWrapper.plus(((km2ecore.helper.kermeta.CompilerHelperJava) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"km2ecore.helper.kermeta.CompilerHelperJava\")).ppTypeFromMultiplicityElement(this, context), \" result = null;\\n\"));\n\n\tjavaCode.append(this.ppReturnResult(context));\n}\n\n}\n\n\n\tjava.lang.Boolean idIfCond_77 = false;\n\tidIfCond_77 = kermeta.standard.helper.BooleanWrapper.and(org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(context.getTasks_stack().peek(), context.getFUNCTION_TYPE_COMPILATION_TASK()), org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(context.getCurrent_valueType()));\n\n\tif( idIfCond_77 ) {\n\n\t((km2ecore.helper.ecore.EAnnotationHelper) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"km2ecore.helper.ecore.EAnnotationHelper\")).addAnnotationGenModelImpl(this.getEcoreModelElement(), javaCode.toString());\n}\n\n\n\tresult = javaCode.toString();\n\nreturn result;\n'"
	 * @generated
	 */
	String createBehaviorJava(KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="kermeta.standard.JavaBoolean"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = false;\n\n\tkermeta.language.structure.Parameter param = null;\n//BIft:detect\n\nkermeta.language.structure.Parameter result_ft17 = null;\n\n\tkermeta.language.structure.Parameter elem_ft17 = null;\n\n\tresult_ft17 = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Parameter> it_ft17 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Parameter>convertAsOrderedSet(this.getOwnedParameter()).iterator();\n\tjava.lang.Boolean idLoopCond_78 = false;\n\twhile( !idLoopCond_78 ) {\n\tidLoopCond_78 = kermeta.standard.helper.BooleanWrapper.or(it_ft17.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(result_ft17, null));\n\tif ( idLoopCond_78 ) {\n\t} else {\n\n\telem_ft17 = it_ft17.next();\n\n\tjava.lang.Boolean idIfCond_79 = false;\n//BIle:detector\nkermeta.language.structure.Parameter param_lbdExp17 = elem_ft17;\n\n\tidIfCond_79 = kermeta.standard.helper.BooleanWrapper.not(param_lbdExp17.isRunnable());\n//EIle:detector\n\n\n\tif( idIfCond_79 ) {\n\n\tresult_ft17 = elem_ft17;\n}\n\n}\n\t}\n}\n\n\n//CE\nparam = result_ft17;\n//EIft:detect\n\n\n\tjava.lang.Boolean idIfCond_80 = false;\n\tidIfCond_80 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(param);\n\n\tif( idIfCond_80 ) {\n\n\tresult = true;\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean isRunnable();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaString"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.String result = null;\n\n\tresult = \"\";\n\n\tjava.lang.Boolean idIfCond_81 = false;\n\tidIfCond_81 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(this.getBody(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.Block\"));\n\n\tif( idIfCond_81 ) {\n\n\tjava.lang.Boolean idIfCond_82 = false;\n\tidIfCond_82 = kermeta.standard.helper.IntegerWrapper.equals(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.behavior.Expression>convertAsOrderedSet(((kermeta.language.behavior.Block) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(this.getBody(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.Block\"))).getStatement()).size(), 1);\n\n\tif( idIfCond_82 ) {\n\n\tjava.lang.Boolean idIfCond_83 = false;\n\tidIfCond_83 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.behavior.Expression>convertAsOrderedSet(((kermeta.language.behavior.Block) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(this.getBody(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.Block\"))).getStatement()), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.JavaStaticCall\"));\n\n\tif( idIfCond_83 ) {\n\n\tkermeta.standard.OrderedSet<java.lang.String> static_call_set_1 = kermeta.standard.helper.StringWrapper.split(((kermeta.language.behavior.JavaStaticCall) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.behavior.Expression>convertAsOrderedSet(((kermeta.language.behavior.Block) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(this.getBody(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.Block\"))).getStatement()), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.JavaStaticCall\"))).createBehaviorJava(context), \"(\");\n\n\tresult = static_call_set_1.first();\n}\n else {\n\n\tjava.lang.Boolean idIfCond_84 = false;\n\tidIfCond_84 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.behavior.Expression>convertAsOrderedSet(((kermeta.language.behavior.Block) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(this.getBody(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.Block\"))).getStatement()), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.Assignment\"));\n\n\tif( idIfCond_84 ) {\n\n\tjava.lang.Boolean idIfCond_85 = false;\n\tidIfCond_85 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(((kermeta.language.behavior.Assignment) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.behavior.Expression>convertAsOrderedSet(((kermeta.language.behavior.Block) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(this.getBody(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.Block\"))).getStatement()), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.Assignment\"))).getValue(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.JavaStaticCall\"));\n\n\tif( idIfCond_85 ) {\n\n\tkermeta.standard.OrderedSet<java.lang.String> static_call_set_2 = kermeta.standard.helper.StringWrapper.split(((kermeta.language.behavior.JavaStaticCall) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(((kermeta.language.behavior.Assignment) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.behavior.Expression>convertAsOrderedSet(((kermeta.language.behavior.Block) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(this.getBody(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.Block\"))).getStatement()), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.Assignment\"))).getValue(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.JavaStaticCall\"))).createBehaviorJava(context), \"(\");\n\n\tresult = static_call_set_2.first();\n}\n\n}\n\n}\n\n}\n\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	String getOptimizedStaticCall(KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaBoolean"
	 *        annotation="kermeta documentation='/**\n\t * Helper method to determine if an operation has to be compiled\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = true;\n\n\tkermeta.language.structure.ClassDefinition cd_container = ((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(this), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ClassDefinition\")));\n\n\tjava.lang.Boolean idIfCond_86 = false;\n\tidIfCond_86 = cd_container.isValueType();\n\n\tif( idIfCond_86 ) {\n\n\tjava.lang.Boolean idIfCond_87 = false;\n\tidIfCond_87 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(cd_container.getEMFInstanceClassName(), \"\");\n\n\tif( idIfCond_87 ) {\n\n\tresult = false;\n}\n\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean mustBeCompiled();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaString"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.String result = null;\n\n\tresult = \"\";\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Constraint> it_ft18 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Constraint>convertAsOrderedSet(this.getPost()).iterator();\n\tjava.lang.Boolean idLoopCond_88 = false;\n\twhile( !idLoopCond_88 ) {\n\tidLoopCond_88 = it_ft18.isOff();\n\tif ( idLoopCond_88 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Constraint constraint_lbdExp18 = it_ft18.next();\n\n\tcontext.getResultLastStatementStack().push(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(\"result_post = \", context.getTYPE_SEPARATOR()), \"java.lang.Boolean\"));\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(result, \"\\nif( \"), context.getJAVA_CLASS_EXECUTION_CONTEXT()), \".getInstance().mustBeChecked( \\\"post__\"), kermeta.standard.helper.IntegerWrapper.toString(org.kermeta.compil.runtime.helper.language.ObjectUtil.oidSwitcher(constraint_lbdExp18))), \"__\"), constraint_lbdExp18.getName()), \"\\\" ) ) {\\n\");\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(result, \"java.lang.Boolean result_post = false;\\n\");\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(result, constraint_lbdExp18.createBehaviorJava(context)), \"\\n\");\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(result, \"if( !result_post ) {\\n\");\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(result, \"kermeta.exceptions.ConstraintViolatedPost exp = kermeta.exceptions.ExceptionsFactory.eINSTANCE.createConstraintViolatedPost();\\n\");\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(result, \"throw new \"), context.getJAVA_CLASS_EXCEPTION_SWITCHER()), \"(exp);\\n\");\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(result, \"}\\n\");\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(result, \"}\\n\");\n\n\tcontext.getResultLastStatementStack().pop();\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\tjava.lang.Boolean idIfCond_89 = false;\n\tidIfCond_89 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(result, \"\");\n\n\tif( idIfCond_89 ) {\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(\"\\n//PostConditions Checking\\n{\", result), \"}\");\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	String createBehaviorJavaFromPost(KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta superOperation='kermeta::language::structure::Object'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tecore.EOperation ecoreOperation = this.createEcoreModelElement(context);\n\n\tkermeta.language.structure.ClassDefinition c = null;\n\n\tc = (kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.ExecutionContext.getInstance().<kermeta.language.structure.ClassDefinition>asTypeOrVoid(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(this));\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EOperation>convertAsOrderedSet(c.getEcoreModelElement().getEOperations()).add(ecoreOperation);\n\n\tthis.setEcoreModelElement(ecoreOperation);\n\n\t//BIft:eachOwnedElement\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Tag> it_ft20 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Tag>convertAsOrderedSet(this.getOwnedTags()).iterator();\n\tjava.lang.Boolean idLoopCond_90 = false;\n\twhile( !idLoopCond_90 ) {\n\tidLoopCond_90 = it_ft20.isOff();\n\tif ( idLoopCond_90 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Tag o_lbdExp20 = it_ft20.next();\n\n\t//BIle:func\nkermeta.language.structure.Tag o_lbdExp19 = o_lbdExp20;\n\n\to_lbdExp19.applyPass1(context);\n//EIle:func\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Parameter> it_ft21 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Parameter>convertAsOrderedSet(this.getOwnedParameter()).iterator();\n\tjava.lang.Boolean idLoopCond_91 = false;\n\twhile( !idLoopCond_91 ) {\n\tidLoopCond_91 = it_ft21.isOff();\n\tif ( idLoopCond_91 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Parameter o_lbdExp21 = it_ft21.next();\n\n\t//BIle:func\nkermeta.language.structure.Parameter o_lbdExp19 = o_lbdExp21;\n\n\to_lbdExp19.applyPass1(context);\n//EIle:func\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Constraint> it_ft22 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Constraint>convertAsOrderedSet(this.getPre()).iterator();\n\tjava.lang.Boolean idLoopCond_92 = false;\n\twhile( !idLoopCond_92 ) {\n\tidLoopCond_92 = it_ft22.isOff();\n\tif ( idLoopCond_92 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Constraint o_lbdExp22 = it_ft22.next();\n\n\t//BIle:func\nkermeta.language.structure.Constraint o_lbdExp19 = o_lbdExp22;\n\n\to_lbdExp19.applyPass1(context);\n//EIle:func\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Constraint> it_ft23 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Constraint>convertAsOrderedSet(this.getPost()).iterator();\n\tjava.lang.Boolean idLoopCond_93 = false;\n\twhile( !idLoopCond_93 ) {\n\tidLoopCond_93 = it_ft23.isOff();\n\tif ( idLoopCond_93 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Constraint o_lbdExp23 = it_ft23.next();\n\n\t//BIle:func\nkermeta.language.structure.Constraint o_lbdExp19 = o_lbdExp23;\n\n\to_lbdExp19.applyPass1(context);\n//EIle:func\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.TypeVariable> it_ft24 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.TypeVariable>convertAsOrderedSet(this.getTypeParameter()).iterator();\n\tjava.lang.Boolean idLoopCond_94 = false;\n\twhile( !idLoopCond_94 ) {\n\tidLoopCond_94 = it_ft24.isOff();\n\tif ( idLoopCond_94 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.TypeVariable t_lbdExp24 = it_ft24.next();\n\n\t//BIle:func\nkermeta.language.structure.TypeVariable o_lbdExp19 = t_lbdExp24;\n\n\to_lbdExp19.applyPass1(context);\n//EIle:func\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n//EIft:eachOwnedElement\n\n'"
	 * @generated
	 */
	void applyPass1(KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta superOperation='kermeta::language::structure::Object'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tjava.lang.Boolean idIfCond_95 = false;\n\tidIfCond_95 = kermeta.standard.helper.BooleanWrapper.not(this.isFunctionType());\n\n\tif( idIfCond_95 ) {\n\n\tthis.setLinks(context);\n\n\tkermeta.language.structure.helper.ObjectSuper.super_applyPass2(this, context);\n}\n\n'"
	 * @generated
	 */
	void applyPass2(KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tkermeta.language.structure.LinkSetterForTypedElement s = ((kermeta.language.structure.LinkSetterForTypedElement) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.language.structure.LinkSetterForTypedElement\"));\n\n\ts.setLinks(this, this.getEcoreModelElement(), context);\n\n\tjava.lang.Boolean idIfCond_96 = false;\n\tidIfCond_96 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(this.getSuperOperation()));\n\n\tif( idIfCond_96 ) {\n\n\tjava.lang.String qualifiedName = this.getSuperOperation().getOwningClass().qualifiedName();\n\n\tecore.EAnnotation ecoreAnnotation = ((km2ecore.helper.ecore.EAnnotationHelper) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"km2ecore.helper.ecore.EAnnotationHelper\")).createKermetaEAnnotation(kermeta.standard.helper.StringWrapper.toString(km2ecore.helper.ecore.KermetaEAnnotationKey.getByName(\"superOperation\").getName()), qualifiedName);\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EAnnotation>convertAsOrderedSet(this.getEcoreModelElement().getEAnnotations()).add(ecoreAnnotation);\n}\n\n'"
	 * @generated
	 */
	void setLinks(KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="kermeta.standard.JavaBoolean"
	 *        annotation="kermeta documentation='/**\n\t * Return true if the given operation is a FunctionType\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = false;\n\n\tjava.lang.Boolean idIfCond_97 = false;\n\tidIfCond_97 = kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(this.getFunctionTypeParameter())), kermeta.standard.helper.IntegerWrapper.isGreater(this.getFunctionTypeParameter().size(), 0));\n\n\tif( idIfCond_97 ) {\n\n\tresult = true;\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean isFunctionType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\n\t * Compiling in Simk mode all the methods (inherited methods included) from ValueType\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tsimk.SMContext sMContext = context.getSimkModel().retrieveOrCreateContextForWrapper(this, context);\n\n\tjava.lang.Boolean idIfCond_98 = false;\n\tidIfCond_98 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(sMContext));\n\n\tif( idIfCond_98 ) {\n\n\tsimk.SMMethod staticMethod = ((simk.SMMethod) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"simk.SMMethod\"));\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<simk.SMMethod>convertAsOrderedSet(context.getSimkModel().getSMMethods()).add(staticMethod);\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<simk.SMMethod>convertAsOrderedSet(sMContext.getSMMethods()).add(staticMethod);\n\n\tstaticMethod.setName(this.getName());\n\n\tstaticMethod.setWrapperUsage();\n\n\tsimk.SMParameter self_param = ((simk.SMParameter) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"simk.SMParameter\"));\n\n\tself_param.setName(\"self\");\n\n\tjava.lang.Boolean idIfCond_99 = false;\n\tidIfCond_99 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(this.getWrapperValueTypeSelfExpression(), \"\");\n\n\tif( idIfCond_99 ) {\n\n\tkermeta.utils.Hashtable<java.lang.String, java.lang.String> map_infos = kermeta.standard.helper.StringWrapper.getPropertyInfos(this.getWrapperValueTypeSelfExpression());\n\n\tjava.lang.String map_value = map_infos.getValue(context.getCurrent_valueType().getEMFInstanceClassName());\n\n\tjava.lang.Boolean idIfCond_100 = false;\n\tidIfCond_100 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(map_value));\n\n\tif( idIfCond_100 ) {\n\n\tself_param.setType(map_value);\n}\n\n}\n\n\n\tjava.lang.Boolean idIfCond_101 = false;\n\tidIfCond_101 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(self_param.getType());\n\n\tif( idIfCond_101 ) {\n\n\tself_param.setType(context.getCurrent_valueType().getEMFInstanceClassName());\n}\n\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<simk.SMParameter>convertAsOrderedSet(staticMethod.getSMParameters()).add(self_param);\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Parameter> it_ft25 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Parameter>convertAsOrderedSet(this.getOwnedParameter()).iterator();\n\tjava.lang.Boolean idLoopCond_102 = false;\n\twhile( !idLoopCond_102 ) {\n\tidLoopCond_102 = it_ft25.isOff();\n\tif ( idLoopCond_102 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Parameter p_lbdExp25 = it_ft25.next();\n\n\tsimk.SMParameter param = ((simk.SMParameter) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"simk.SMParameter\"));\n\n\tparam.setName(p_lbdExp25.getName());\n\n\tjava.lang.Boolean idIfCond_103 = false;\n\tidIfCond_103 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(p_lbdExp25.getType(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.FunctionType\")));\n\n\tif( idIfCond_103 ) {\n\n\tjava.lang.Boolean idIfCond_104 = false;\n\tidIfCond_104 = kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.StringWrapper.equals(p_lbdExp25.getType().getTypeQName(), ((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(this), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ClassDefinition\"))).qualifiedName()), kermeta.standard.helper.StringWrapper.equals(p_lbdExp25.getType().getTypeQName(), \"kermeta::language::structure::Object\"));\n\n\tif( idIfCond_104 ) {\n\n\tparam.setType(context.getCurrent_valueType().getEMFInstanceClassName());\n}\n else {\n\n\tparam.setType(p_lbdExp25.getType().createBehaviorJava(context));\n\n\tjava.lang.Boolean idIfCond_105 = false;\n\tidIfCond_105 = ((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.language.structure.Operation\")).isVoidType(param.getType());\n\n\tif( idIfCond_105 ) {\n\n\tparam.setType(\"void\");\n}\n\n}\n\n}\n else {\n}\n\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<simk.SMParameter>convertAsOrderedSet(staticMethod.getSMParameters()).add(param);\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\tsimk.SMReturn sMReturn = ((simk.SMReturn) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"simk.SMReturn\"));\n\n\tstaticMethod.setSMReturn(sMReturn);\n\n\tjava.lang.Boolean idIfCond_106 = false;\n\tidIfCond_106 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(this.getWrapperValueTypeReturnType(), \"\");\n\n\tif( idIfCond_106 ) {\n\n\tkermeta.utils.Hashtable<java.lang.String, java.lang.String> map_infos = kermeta.standard.helper.StringWrapper.getPropertyInfos(this.getWrapperValueTypeReturnType());\n\n\tjava.lang.String map_value = map_infos.getValue(context.getCurrent_valueType().getEMFInstanceClassName());\n\n\tjava.lang.Boolean idIfCond_107 = false;\n\tidIfCond_107 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(map_value));\n\n\tif( idIfCond_107 ) {\n\n\tsMReturn.setType(map_value);\n}\n\n}\n\n\n\tjava.lang.Boolean idIfCond_108 = false;\n\tidIfCond_108 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(sMReturn.getType());\n\n\tif( idIfCond_108 ) {\n\n\tsMReturn.setType(this.getType().createBehaviorJava(context));\n\n\tjava.lang.Boolean idIfCond_109 = false;\n\tidIfCond_109 = ((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.language.structure.Operation\")).isVoidType(sMReturn.getType());\n\n\tif( idIfCond_109 ) {\n\n\tsMReturn.setType(\"void\");\n}\n\n}\n\n\n\tstaticMethod.setBody(\"//Protection of the following code\\n\");\n\n\tjava.lang.Boolean idIfCond_110 = false;\n\tidIfCond_110 = kermeta.standard.helper.StringWrapper.equals(this.getName(), \"equals\");\n\n\tif( idIfCond_110 ) {\n\n\tstaticMethod.setBody(kermeta.standard.helper.StringWrapper.plus(staticMethod.getBody(), \"if( self == null || \"));\n\n\tstaticMethod.setBody(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(staticMethod.getBody(), org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Parameter>convertAsOrderedSet(this.getOwnedParameter()).first().getName()), \" == null ) {\\n\"));\n\n\tstaticMethod.setBody(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(staticMethod.getBody(), \"return self == \"), org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Parameter>convertAsOrderedSet(this.getOwnedParameter()).first().getName()), \";\\n\"));\n\n\tstaticMethod.setBody(kermeta.standard.helper.StringWrapper.plus(staticMethod.getBody(), \"}\\n\\n\"));\n}\n\n\n\tjava.lang.Boolean idIfCond_111 = false;\n\tidIfCond_111 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<java.lang.String>convertAsOrderedSet(context.getFrameworkOperations()).contains(this.getName());\n\n\tif( idIfCond_111 ) {\n\n\tstaticMethod.setBody(kermeta.standard.helper.StringWrapper.plus(staticMethod.getBody(), \"if( self == null || ((java.lang.Object) self) instanceof kermeta.language.structure.Object ) {\\n\"));\n\n\tjava.lang.Boolean idIfCond_112 = false;\n\tidIfCond_112 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(staticMethod.getSMReturn().getType(), \"void\");\n\n\tif( idIfCond_112 ) {\n\n\tstaticMethod.setBody(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(staticMethod.getBody(), \"return (\"), staticMethod.getSMReturn().getType()), \") \"));\n}\n\n\n\tstaticMethod.setBody(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(staticMethod.getBody(), context.getOBJECT_UTIL_CLASS()), \".\"), this.getName()), \"((kermeta.language.structure.Object) ((java.lang.Object) self)\"));\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Parameter> it_ft26 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Parameter>convertAsOrderedSet(this.getOwnedParameter()).iterator();\n\tjava.lang.Boolean idLoopCond_113 = false;\n\twhile( !idLoopCond_113 ) {\n\tidLoopCond_113 = it_ft26.isOff();\n\tif ( idLoopCond_113 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Parameter p_lbdExp26 = it_ft26.next();\n\n\tstaticMethod.setBody(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(staticMethod.getBody(), \", \"), p_lbdExp26.getName()));\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\tstaticMethod.setBody(kermeta.standard.helper.StringWrapper.plus(staticMethod.getBody(), \");\\n\"));\n}\n else {\n\n\tstaticMethod.setBody(kermeta.standard.helper.StringWrapper.plus(staticMethod.getBody(), \"if( self == null ) {\\n\"));\n\n\tstaticMethod.setBody(kermeta.standard.helper.StringWrapper.plus(staticMethod.getBody(), \"kermeta.exceptions.CallOnVoidTarget exp = kermeta.exceptions.ExceptionsFactory.eINSTANCE.createCallOnVoidTarget();\\n\"));\n\n\tstaticMethod.setBody(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(staticMethod.getBody(), \"exp.setMessage(\\\"Initialize the \"), context.getCurrent_valueType().getName()), \" expression\\\");\\n\"));\n\n\tstaticMethod.setBody(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(staticMethod.getBody(), \"throw new \"), context.getJAVA_CLASS_EXCEPTION_SWITCHER()), \"(exp);\\n\"));\n}\n\n\n\tstaticMethod.setBody(kermeta.standard.helper.StringWrapper.plus(staticMethod.getBody(), \"}\\n//End of the protection\\n\\n\"));\n\n\tstaticMethod.setBody(kermeta.standard.helper.StringWrapper.plus(staticMethod.getBody(), this.createBehaviorJava(context)));\n}\n\n'"
	 * @generated
	 */
	void compilingInSimkMode(KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaBoolean"
	 *        annotation="kermeta documentation='/**\n\t * Unused for the moment\n\t \052/'"
	 *        annotation="kermeta deprecated=''"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = false;\n\n\tjava.lang.Boolean idIfCond_114 = false;\n\tidIfCond_114 = kermeta.standard.helper.BooleanWrapper.or(this.getType().isValueType(), this.hasAValueTypedParameter());\n\n\tif( idIfCond_114 ) {\n\n\tresult = true;\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean mustBeDuplicated();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaString"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.String result = null;\n\n\tresult = \"\";\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Constraint> it_ft27 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Constraint>convertAsOrderedSet(this.getPre()).iterator();\n\tjava.lang.Boolean idLoopCond_115 = false;\n\twhile( !idLoopCond_115 ) {\n\tidLoopCond_115 = it_ft27.isOff();\n\tif ( idLoopCond_115 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Constraint constraint_lbdExp27 = it_ft27.next();\n\n\tcontext.getResultLastStatementStack().push(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(\"result_pre = \", context.getTYPE_SEPARATOR()), \"java.lang.Boolean\"));\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(result, \"\\nif( \"), context.getJAVA_CLASS_EXECUTION_CONTEXT()), \".getInstance().mustBeChecked( \\\"pre__\"), kermeta.standard.helper.IntegerWrapper.toString(org.kermeta.compil.runtime.helper.language.ObjectUtil.oidSwitcher(constraint_lbdExp27))), \"__\"), constraint_lbdExp27.getName()), \"\\\" ) ) {\\n\");\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(result, \"java.lang.Boolean result_pre = false;\\n\");\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(result, constraint_lbdExp27.createBehaviorJava(context)), \"\\n\");\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(result, \"if( !result_pre ) {\\n\");\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(result, \"kermeta.exceptions.ConstraintViolatedPre exp = kermeta.exceptions.ExceptionsFactory.eINSTANCE.createConstraintViolatedPre();\\n\");\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(result, \"throw new \"), context.getJAVA_CLASS_EXCEPTION_SWITCHER()), \"(exp);\\n\");\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(result, \"}\\n\");\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(result, \"}\\n\");\n\n\tcontext.getResultLastStatementStack().pop();\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\tjava.lang.Boolean idIfCond_116 = false;\n\tidIfCond_116 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(result, \"\");\n\n\tif( idIfCond_116 ) {\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(\"\\n//PreConditions Checking\\n{\", result), \"}\");\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	String createBehaviorJavaFromPre(KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.standard.Sequence<kermeta.language.structure.Parameter> result = null;\n\n\tresult = null;\n\n\tkermeta.standard.Sequence<kermeta.language.structure.Parameter> ft_parameters = null;\n//BIft:select\n\nkermeta.standard.Sequence<kermeta.language.structure.Parameter> result_ft28 = null;\n\n\tkermeta.language.structure.Parameter elem_ft28 = null;\n\n\tresult_ft28 = ((kermeta.standard.Sequence<kermeta.language.structure.Parameter>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.standard.Sequence<kermeta.language.structure.Parameter>\"));\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Parameter> it_ft28 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Parameter>convertAsOrderedSet(this.getOwnedParameter()).iterator();\n\tjava.lang.Boolean idLoopCond_117 = false;\n\twhile( !idLoopCond_117 ) {\n\tidLoopCond_117 = it_ft28.isOff();\n\tif ( idLoopCond_117 ) {\n\t} else {\n\n\telem_ft28 = it_ft28.next();\n\n\tjava.lang.Boolean idIfCond_118 = false;\n//BIle:selector\nkermeta.language.structure.Parameter p_lbdExp28 = elem_ft28;\n\n\tidIfCond_118 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(p_lbdExp28.getType(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.FunctionType\"));\n//EIle:selector\n\n\n\tif( idIfCond_118 ) {\n\n\tresult_ft28.add(elem_ft28);\n}\n\n}\n\t}\n}\n\n\n//CE\nft_parameters = result_ft28;\n//EIft:select\n\n\n\tresult = ft_parameters;\n\nreturn result;\n'"
	 * @generated
	 */
	Sequence<Parameter> getFunctionTypeParameter();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaBoolean" type_labelDataType="kermeta.standard.JavaString"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = false;\n\n\tjava.lang.Boolean idIfCond_119 = false;\n\tidIfCond_119 = kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.StringWrapper.equals(type_label, \"null\"), kermeta.standard.helper.StringWrapper.equals(type_label, \"void\")), kermeta.standard.helper.StringWrapper.equals(type_label, \"Void\")), kermeta.standard.helper.StringWrapper.equals(type_label, \"VoidType\")), kermeta.standard.helper.StringWrapper.equals(type_label, \"kermeta::standard::Void\")), kermeta.standard.helper.StringWrapper.equals(type_label, \"kermeta::language::structure::VoidType\")), kermeta.standard.helper.StringWrapper.equals(type_label, \"kermeta.standard.Void\")), kermeta.standard.helper.StringWrapper.equals(type_label, \"kermeta.language.structure.VoidType\"));\n\n\tif( idIfCond_119 ) {\n\n\tresult = true;\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean isVoidType(String type_label);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\necore.EOperation result = null;\n\n\tecore.EOperation ecoreOperation = ((ecore.EOperation) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"ecore.EOperation\"));\n\n\tecoreOperation.setName(this.getFinalName(context));\n\n\tecoreOperation.setOrdered(this.getIsOrdered());\n\n\tecoreOperation.setUnique(this.getIsUnique());\n\n\tecoreOperation.setLowerBound(this.getLower());\n\n\tecoreOperation.setUpperBound(this.getUpper());\n\n\tjava.lang.Boolean idIfCond_120 = false;\n\tidIfCond_120 = this.getIsAbstract();\n\n\tif( idIfCond_120 ) {\n\n\tecore.EAnnotation ecoreAnnotation = ((km2ecore.helper.ecore.EAnnotationHelper) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"km2ecore.helper.ecore.EAnnotationHelper\")).createAbstract();\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EAnnotation>convertAsOrderedSet(ecoreOperation.getEAnnotations()).add(ecoreAnnotation);\n}\n\n\n\tresult = ecoreOperation;\n\nreturn result;\n'"
	 * @generated
	 */
	EOperation createEcoreModelElement(KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaBoolean"
	 *        annotation="kermeta documentation='/**\n\t * The given operation has at least a parameter having ValueType as type\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = false;\n\n\tkermeta.language.structure.Parameter p = null;\n//BIft:detect\n\nkermeta.language.structure.Parameter result_ft29 = null;\n\n\tkermeta.language.structure.Parameter elem_ft29 = null;\n\n\tresult_ft29 = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Parameter> it_ft29 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Parameter>convertAsOrderedSet(this.getOwnedParameter()).iterator();\n\tjava.lang.Boolean idLoopCond_121 = false;\n\twhile( !idLoopCond_121 ) {\n\tidLoopCond_121 = kermeta.standard.helper.BooleanWrapper.or(it_ft29.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(result_ft29, null));\n\tif ( idLoopCond_121 ) {\n\t} else {\n\n\telem_ft29 = it_ft29.next();\n\n\tjava.lang.Boolean idIfCond_122 = false;\n//BIle:detector\nkermeta.language.structure.Parameter p_lbdExp29 = elem_ft29;\n\n\tidIfCond_122 = p_lbdExp29.getType().isValueType();\n//EIle:detector\n\n\n\tif( idIfCond_122 ) {\n\n\tresult_ft29 = elem_ft29;\n}\n\n}\n\t}\n}\n\n\n//CE\np = result_ft29;\n//EIft:detect\n\n\n\tjava.lang.Boolean idIfCond_123 = false;\n\tidIfCond_123 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(p));\n\n\tif( idIfCond_123 ) {\n\n\tresult = true;\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean hasAValueTypedParameter();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta superOperation='kermeta::language::structure::Object'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tjava.lang.Boolean idIfCond_124 = false;\n\tidIfCond_124 = kermeta.standard.helper.BooleanWrapper.not(this.isFunctionType());\n\n\tif( idIfCond_124 ) {\n\n\tjava.lang.Boolean idIfCond_125 = false;\n\tidIfCond_125 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(context.getCurrent_valueType());\n\n\tif( idIfCond_125 ) {\n\n\tthis.setLinks(context);\n\n\t//BIft:eachOwnedElement\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Tag> it_ft31 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Tag>convertAsOrderedSet(this.getOwnedTags()).iterator();\n\tjava.lang.Boolean idLoopCond_126 = false;\n\twhile( !idLoopCond_126 ) {\n\tidLoopCond_126 = it_ft31.isOff();\n\tif ( idLoopCond_126 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Tag o_lbdExp31 = it_ft31.next();\n\n\t//BIle:func\nkermeta.language.structure.Tag p_lbdExp30 = o_lbdExp31;\n\n\tp_lbdExp30.applyPass2BehaviorJava(context);\n//EIle:func\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Parameter> it_ft32 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Parameter>convertAsOrderedSet(this.getOwnedParameter()).iterator();\n\tjava.lang.Boolean idLoopCond_127 = false;\n\twhile( !idLoopCond_127 ) {\n\tidLoopCond_127 = it_ft32.isOff();\n\tif ( idLoopCond_127 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Parameter o_lbdExp32 = it_ft32.next();\n\n\t//BIle:func\nkermeta.language.structure.Parameter p_lbdExp30 = o_lbdExp32;\n\n\tp_lbdExp30.applyPass2BehaviorJava(context);\n//EIle:func\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Constraint> it_ft33 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Constraint>convertAsOrderedSet(this.getPre()).iterator();\n\tjava.lang.Boolean idLoopCond_128 = false;\n\twhile( !idLoopCond_128 ) {\n\tidLoopCond_128 = it_ft33.isOff();\n\tif ( idLoopCond_128 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Constraint o_lbdExp33 = it_ft33.next();\n\n\t//BIle:func\nkermeta.language.structure.Constraint p_lbdExp30 = o_lbdExp33;\n\n\tp_lbdExp30.applyPass2BehaviorJava(context);\n//EIle:func\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Constraint> it_ft34 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Constraint>convertAsOrderedSet(this.getPost()).iterator();\n\tjava.lang.Boolean idLoopCond_129 = false;\n\twhile( !idLoopCond_129 ) {\n\tidLoopCond_129 = it_ft34.isOff();\n\tif ( idLoopCond_129 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Constraint o_lbdExp34 = it_ft34.next();\n\n\t//BIle:func\nkermeta.language.structure.Constraint p_lbdExp30 = o_lbdExp34;\n\n\tp_lbdExp30.applyPass2BehaviorJava(context);\n//EIle:func\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.TypeVariable> it_ft35 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.TypeVariable>convertAsOrderedSet(this.getTypeParameter()).iterator();\n\tjava.lang.Boolean idLoopCond_130 = false;\n\twhile( !idLoopCond_130 ) {\n\tidLoopCond_130 = it_ft35.isOff();\n\tif ( idLoopCond_130 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.TypeVariable t_lbdExp35 = it_ft35.next();\n\n\t//BIle:func\nkermeta.language.structure.TypeVariable p_lbdExp30 = t_lbdExp35;\n\n\tp_lbdExp30.applyPass2BehaviorJava(context);\n//EIle:func\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n//EIft:eachOwnedElement\n\n\n\tthis.createBehaviorJava(context);\n\n\tjava.lang.Boolean idIfCond_131 = false;\n\tidIfCond_131 = this.isRunnable();\n\n\tif( idIfCond_131 ) {\n\n\tsimk.SMContext smContext = context.getSimkModel().retrieveOrCreateContextForRunner(this, context);\n\n\tsimk.SMMethod staticMethod = ((simk.SMMethod) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"simk.SMMethod\"));\n\n\tjava.lang.String cd_qn = kermeta.standard.helper.StringWrapper.replace(((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(this), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ClassDefinition\"))).qualifiedName(), \"::\", \".\");\n\n\tstaticMethod.setName(\"main\");\n\n\tstaticMethod.setBody(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(\"\\n\", cd_qn), \" anExec = (\"), cd_qn), \")\"), \" org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\\\"\"), cd_qn), \"\\\");\"), \"\\nanExec.\"), this.getFinalName(context)), \"(\"));\n\n\tjava.lang.Integer i = 0;\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Parameter> it_ft36 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Parameter>convertAsOrderedSet(this.getOwnedParameter()).iterator();\n\tjava.lang.Boolean idLoopCond_132 = false;\n\twhile( !idLoopCond_132 ) {\n\tidLoopCond_132 = it_ft36.isOff();\n\tif ( idLoopCond_132 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Parameter params_lbdExp36 = it_ft36.next();\n\n\tjava.lang.Boolean idIfCond_133 = false;\n\tidIfCond_133 = kermeta.standard.helper.IntegerWrapper.isGreater(i, 0);\n\n\tif( idIfCond_133 ) {\n\n\tstaticMethod.setBody(kermeta.standard.helper.StringWrapper.plus(staticMethod.getBody(), \", \"));\n}\n\n\n\tstaticMethod.setBody(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(staticMethod.getBody(), \" args[\"), kermeta.standard.helper.IntegerWrapper.toString(i)), \"]\"));\n\n\ti = kermeta.standard.helper.IntegerWrapper.plus(i, 1);\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\tstaticMethod.setBody(kermeta.standard.helper.StringWrapper.plus(staticMethod.getBody(), \");\\n\"));\n\n\tstaticMethod.setUsages(simk.SMUsage.getByName(\"Runner\"));\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<simk.SMMethod>convertAsOrderedSet(context.getSimkModel().getSMMethods()).add(staticMethod);\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<simk.SMMethod>convertAsOrderedSet(smContext.getSMMethods()).add(staticMethod);\n}\n\n}\n else {\n\n\tthis.compilingInSimkMode(context);\n}\n\n}\n\n'"
	 * @generated
	 */
	void applyPass2BehaviorJava(KM2EcoreContext context);

} // Operation
