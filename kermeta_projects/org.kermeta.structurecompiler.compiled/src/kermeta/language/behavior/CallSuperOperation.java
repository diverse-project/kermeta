/**
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * 
 * Generating with Kermeta <http://www.kermeta.org>
 *
 * $Id: CallSuperOperation.java,v 1.12 2009-02-10 17:51:43 cfaucher Exp $
 */
package kermeta.language.behavior;

import kermeta.language.structure.Operation;

import km2ecore.KM2EcoreContext;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Call Super Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see kermeta.language.behavior.BehaviorPackage#getCallSuperOperation()
 * @model annotation="kermeta documentation='/** Complete \052/'"
 *        annotation="kermeta documentation='This class represents a call to the operataion in the parent class\n\tIn the following example, the type of super(element) is CallSuperOperation:\n\nclass ParentClass {\n  operation op(element : Integer) : Integer is do\n      result := element + 1\n  end\n}\n *\nclass ChildClass {\n  method op(element : Integer) : Integer is do\n      result := super(element)\n  end\n}'"
 * @generated
 */
public interface CallSuperOperation extends CallExpression {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaString"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.String result = null;\n\n\tresult = \"\";\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(result, kermeta.standard.helper.StringWrapper.replace(((kermeta.language.structure.Package) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(owningOperation.getSuperOperation().getOwningClass()), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Package\"))).qualifiedName(), \"::\", \".\")), \".helper.\"), owningOperation.getSuperOperation().getOwningClass().getName()), \"Super.super_\"), owningOperation.getSuperOperation().getFinalName(context)), \"(\");\n\n\tjava.lang.Boolean idIfCond_294 = false;\n\tidIfCond_294 = context.getStaticOperationMode();\n\n\tif( idIfCond_294 ) {\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(result, \"self\");\n}\n else {\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(result, \"this\");\n}\n\n\n\tjava.lang.Boolean idIfCond_295 = false;\n\tidIfCond_295 = kermeta.standard.helper.IntegerWrapper.isGreater(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.behavior.Expression>convertAsOrderedSet(this.getParameters()).size(), 0);\n\n\tif( idIfCond_295 ) {\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(result, \", \");\n}\n\n\n\tjava.lang.Boolean idIfCond_296 = false;\n\tidIfCond_296 = context.getStaticOperationMode();\n\n\tif( idIfCond_296 ) {\n\n\t((kermeta.language.structure.ModelingUnit) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.language.structure.StructurePackage.eINSTANCE.getModelingUnit())).compileStaticOperation(owningOperation.getSuperOperation(), context);\n}\n else {\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Operation>convertAsOrderedSet(context.getMu().getSuperOperationsToCompileInHelper()).add(owningOperation.getSuperOperation());\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	String getCallStaticSignature(Operation owningOperation,
			KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaString"
	 *        annotation="kermeta superOperation='kermeta::language::behavior::CallExpression'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.String result = null;\n\n\tsuper.createBehaviorJava(context);\n\n\tkermeta.language.structure.Operation owningOperation = ((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(this.getContainerAsType(org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Operation\")), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Operation\")));\n\n\tjava.lang.String fromOperation_cd = kermeta.standard.helper.StringWrapper.replace(owningOperation.getSuperOperation().getOwningClass().qualifiedName(), \"::\", \".\");\n\n\tresult = \"\";\n\n\tecore.EClass extended_class = ((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(this.getContainerAsType(org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ClassDefinition\")), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ClassDefinition\"))).getEcoreModelElement();\n\n\tecore.EClass super_class = owningOperation.getSuperOperation().getOwningClass().getEcoreModelElement();\n\n\tjava.lang.Boolean idIfCond_297 = false;\n\tidIfCond_297 = kermeta.standard.helper.BooleanWrapper.not(owningOperation.isFunctionType());\n\n\tif( idIfCond_297 ) {\n\n\tjava.lang.Boolean idIfCond_298 = false;\n\tidIfCond_298 = kermeta.standard.helper.BooleanWrapper.and(((km2ecore.helper.ecore.ModelAnalizer) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(km2ecore.helper.ecore.EcorePackage.eINSTANCE.getModelAnalizer())).isExtendedBy(extended_class, super_class), kermeta.standard.helper.BooleanWrapper.not(context.getStaticOperationMode()));\n\n\tif( idIfCond_298 ) {\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(result, \"super.\"), owningOperation.getFinalName(context)), \"(\");\n}\n else {\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(result, this.getCallStaticSignature(owningOperation, context));\n}\n\n\n\tthis.setBeforeLambdaExpressionResult(\"\");\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(result, ((km2ecore.helper.kermeta.CompilerHelperJava) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(km2ecore.helper.kermeta.KermetaPackage.eINSTANCE.getCompilerHelperJava())).ppComaSeparatedNodes(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.behavior.Expression>convertAsOrderedSet(this.getParameters()), context)), \")\");\n\n\tcontext.setBeforeLambdaExpressionResult(this.getBeforeLambdaExpressionResult());\n\n\tthis.setBeforeLambdaExpressionResult(\"\");\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(result, this.endOfExpressionFixer());\n}\n else {\n\n\torg.kermeta.compil.runtime.helper.io.StdIOUtil.getInstance().writeln(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(\"A callSuperFunctionType has been detected: \", owningOperation.qualifiedName()), \" - signature: \"), this.getCallStaticSignature(owningOperation, context)));\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	String createBehaviorJava(KM2EcoreContext context);

} // CallSuperOperation
