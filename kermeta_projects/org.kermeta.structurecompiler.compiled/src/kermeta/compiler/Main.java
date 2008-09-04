/**
 * <copyright>
 * </copyright>
 *
 * $Id: Main.java,v 1.1 2008-09-04 15:40:41 cfaucher Exp $
 */
package kermeta.compiler;

import kermeta.language.structure.TypeDefinition;

import km2ecore.CompilingMode;
import km2ecore.KM2EcoreContext;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Main</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kermeta.compiler.Main#getContext <em>Context</em>}</li>
 * </ul>
 * </p>
 *
 * @see kermeta.compiler.CompilerPackage#getMain()
 * @model
 * @generated
 */
public interface Main extends kermeta.language.structure.Object {
	/**
	 * Returns the value of the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context</em>' reference.
	 * @see #setContext(KM2EcoreContext)
	 * @see kermeta.compiler.CompilerPackage#getMain_Context()
	 * @model required="true"
	 * @generated
	 */
	KM2EcoreContext getContext();

	/**
	 * Sets the value of the '{@link kermeta.compiler.Main#getContext <em>Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' reference.
	 * @see #getContext()
	 * @generated
	 */
	void setContext(KM2EcoreContext value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model modelInputDataType="kermeta.standard.JavaString" traceInputDataType="kermeta.standard.JavaString" outputDataType="kermeta.standard.JavaString"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tthis.main_mode(modelInput, traceInput, output, km2ecore.CompilingMode.getByName(\"onlyEcore\"));\n'"
	 * @generated
	 */
	void main_km2ecore_onlyEcore(String modelInput, String traceInput,
			String output);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model modelInputDataType="kermeta.standard.JavaString" traceInputDataType="kermeta.standard.JavaString" outputDataType="kermeta.standard.JavaString"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tthis.main_mode(modelInput, traceInput, output, km2ecore.CompilingMode.getByName(\"behaviorJava\"));\n'"
	 * @generated
	 */
	void main_km2ecore_behaviorJava(String modelInput, String traceInput,
			String output);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model modelInputDataType="kermeta.standard.JavaString" traceInputDataType="kermeta.standard.JavaString" outputDataType="kermeta.standard.JavaString"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tthis.setContext(((km2ecore.KM2EcoreContext) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"km2ecore.KM2EcoreContext\")));\n\n\tthis.getContext().initialize(modelInput, traceInput);\n\n\tthis.getContext().setMode(mode);\n\n\torg.kermeta.compil.runtime.helper.io.StdIOUtil.writeln(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(\"Input model: \", modelInput), \"\\n\"));\n\n\t//Beginning of the Inlining of the function type: each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Package> it_ft125 = this.getContext().getMu().getAllPackages().iterator();\n\tjava.lang.Boolean idLoopCond_642 = false;\n\twhile( !idLoopCond_642 ) {\n\tidLoopCond_642 = it_ft125.isOff();\n\tif ( idLoopCond_642 ) {\n\t} else {\n\n\t//Beginning of the Inlining of the lambda expression: func\nkermeta.language.structure.Package p = it_ft125.next();\n\n\t//Beginning of the Inlining of the function type: eachOwnedElement\n\n\t\n\n\t//Beginning of the Inlining of the function type: each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.TypeDefinition> it_ft127 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.TypeDefinition>convertAsOrderedSet(((kermeta.language.structure.Package) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(p, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Package\"))).getOwnedTypeDefinition()).iterator();\n\tjava.lang.Boolean idLoopCond_643 = false;\n\twhile( !idLoopCond_643 ) {\n\tidLoopCond_643 = it_ft127.isOff();\n\tif ( idLoopCond_643 ) {\n\t} else {\n\n\t//Beginning of the Inlining of the lambda expression: func\nkermeta.language.structure.TypeDefinition o = it_ft127.next();\n\n\t//Beginning of the Inlining of the lambda expression: func\nkermeta.language.structure.TypeDefinition cd = o_ft127;\n\n\tjava.lang.Boolean idIfCond_644 = false;\n\tidIfCond_644 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOf(cd, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ClassDefinition\"));\n\n\tif( idIfCond_644 ) {\n\n\t//Beginning of the Inlining of the function type: eachOwnedElement\n\n\t\n\n\t//Beginning of the Inlining of the function type: each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Property> it_ft129 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Property>convertAsOrderedSet(((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(cd, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ClassDefinition\"))).getOwnedAttribute()).iterator();\n\tjava.lang.Boolean idLoopCond_645 = false;\n\twhile( !idLoopCond_645 ) {\n\tidLoopCond_645 = it_ft129.isOff();\n\tif ( idLoopCond_645 ) {\n\t} else {\n\n\t//Beginning of the Inlining of the lambda expression: func\nkermeta.language.structure.Property o = it_ft129.next();\n\n\t//Beginning of the Inlining of the lambda expression: func\nkermeta.language.structure.Property op = o_ft129;\n\n\tjava.lang.Boolean idIfCond_646 = false;\n\tidIfCond_646 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOf(op, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Operation\"));\n\n\tif( idIfCond_646 ) {\n\n\tjava.lang.Boolean idIfCond_647 = false;\n\tidIfCond_647 = kermeta.standard.helper.StringWrapper.equals(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(op, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Operation\"))).getName(), \"replaceExtension\");\n\n\tif( idIfCond_647 ) {\n\n\torg.kermeta.compil.runtime.helper.io.StdIOUtil.writeln(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(\"================= \", ((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(op, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Operation\"))).qualifiedName()), \" =================\"));\n\n\tjava.lang.String javaSourceCode = op.createBehaviorJava(this.getContext());\n\n\torg.kermeta.compil.runtime.helper.io.StdIOUtil.writeln(javaSourceCode);\n}\n\n}\n\n//End of the Inlining of the lambda expression: func\n\n//End of the Inlining of the lambda expression: func\n\n}\n\t}\n}\n\n//End of the Inlining of the function type: each\n\n\n\t//Beginning of the Inlining of the function type: each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Operation> it_ft130 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Operation>convertAsOrderedSet(this.getOwnedOperation()).iterator();\n\tjava.lang.Boolean idLoopCond_648 = false;\n\twhile( !idLoopCond_648 ) {\n\tidLoopCond_648 = it_ft130.isOff();\n\tif ( idLoopCond_648 ) {\n\t} else {\n\n\t//Beginning of the Inlining of the lambda expression: func\nkermeta.language.structure.Operation o = it_ft130.next();\n\n\tfunc;\n//End of the Inlining of the lambda expression: func\n\n}\n\t}\n}\n\n//End of the Inlining of the function type: each\n\n\n\t//Beginning of the Inlining of the function type: each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Constraint> it_ft131 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Constraint>convertAsOrderedSet(this.getInv()).iterator();\n\tjava.lang.Boolean idLoopCond_649 = false;\n\twhile( !idLoopCond_649 ) {\n\tidLoopCond_649 = it_ft131.isOff();\n\tif ( idLoopCond_649 ) {\n\t} else {\n\n\t//Beginning of the Inlining of the lambda expression: func\nkermeta.language.structure.Constraint i = it_ft131.next();\n\n\tfunc;\n//End of the Inlining of the lambda expression: func\n\n}\n\t}\n}\n\n//End of the Inlining of the function type: each\n\n\n\t//Beginning of the Inlining of the function type: each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.TypeVariable> it_ft132 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.TypeVariable>convertAsOrderedSet(this.getTypeParameter()).iterator();\n\tjava.lang.Boolean idLoopCond_650 = false;\n\twhile( !idLoopCond_650 ) {\n\tidLoopCond_650 = it_ft132.isOff();\n\tif ( idLoopCond_650 ) {\n\t} else {\n\n\t//Beginning of the Inlining of the lambda expression: func\nkermeta.language.structure.TypeVariable t = it_ft132.next();\n\n\tfunc;\n//End of the Inlining of the lambda expression: func\n\n}\n\t}\n}\n\n//End of the Inlining of the function type: each\n\n//End of the Inlining of the function type: eachOwnedElement\n\n}\n\n//End of the Inlining of the lambda expression: func\n\n//End of the Inlining of the lambda expression: func\n\n}\n\t}\n}\n\n//End of the Inlining of the function type: each\n\n\n\t//Beginning of the Inlining of the function type: each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Package> it_ft133 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Package>convertAsOrderedSet(this.getNestedPackage()).iterator();\n\tjava.lang.Boolean idLoopCond_651 = false;\n\twhile( !idLoopCond_651 ) {\n\tidLoopCond_651 = it_ft133.isOff();\n\tif ( idLoopCond_651 ) {\n\t} else {\n\n\t//Beginning of the Inlining of the lambda expression: func\nkermeta.language.structure.Package p = it_ft133.next();\n\n\tfunc;\n//End of the Inlining of the lambda expression: func\n\n}\n\t}\n}\n\n//End of the Inlining of the function type: each\n\n//End of the Inlining of the function type: eachOwnedElement\n\n//End of the Inlining of the lambda expression: func\n\n}\n\t}\n}\n\n//End of the Inlining of the function type: each\n\n\n\torg.kermeta.compil.runtime.helper.io.StdIOUtil.writeln(\"\\nFinish, warning: this exec mode has not filtered the FunctionTypes.\");\n'"
	 * @generated
	 */
	void main_mode3(String modelInput, String traceInput, String output,
			CompilingMode mode);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model modelInputDataType="kermeta.standard.JavaString" traceInputDataType="kermeta.standard.JavaString" outputDataType="kermeta.standard.JavaString"
	 *        annotation="kermeta documentation='/****************************************\052/'"
	 *        annotation="kermeta documentation='/********** METHODS FOR TESTING *********\052/'"
	 *        annotation="kermeta documentation='/****************************************\052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tthis.setContext(((km2ecore.KM2EcoreContext) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"km2ecore.KM2EcoreContext\")));\n\n\tthis.getContext().initialize(modelInput, traceInput);\n\n\tthis.getContext().setMode(mode);\n\n\torg.kermeta.compil.runtime.helper.io.StdIOUtil.writeln(this.typeDefinitionToString(this.getTypeDefinitionByQualifiedName(\"kermeta::standard::Integer\")));\n\n\torg.kermeta.compil.runtime.helper.io.StdIOUtil.writeln(this.typeDefinitionToString(this.getTypeDefinitionByQualifiedName(\"kermeta::standard::Boolean\")));\n\n\torg.kermeta.compil.runtime.helper.io.StdIOUtil.writeln(this.typeDefinitionToString(this.getTypeDefinitionByQualifiedName(\"kermeta::standard::Real\")));\n\n\torg.kermeta.compil.runtime.helper.io.StdIOUtil.writeln(this.typeDefinitionToString(this.getTypeDefinitionByQualifiedName(\"kermeta::standard::Character\")));\n\n\torg.kermeta.compil.runtime.helper.io.StdIOUtil.writeln(this.typeDefinitionToString(this.getTypeDefinitionByQualifiedName(\"kermeta::standard::String\")));\n\n\torg.kermeta.compil.runtime.helper.io.StdIOUtil.writeln(this.typeDefinitionToString(this.getTypeDefinitionByQualifiedName(\"kermeta::standard::Numeric\")));\n'"
	 * @generated
	 */
	void main_mode2(String modelInput, String traceInput, String output,
			CompilingMode mode);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tjava.lang.String modelInput = \"platform:/resource/org.kermeta.compiler.kmt/models/compilertest.km\";\n\n\tjava.lang.String output = \"platform:/resource/org.kermeta.compiler.kmt/models/compilertest.ecore\";\n\n\tjava.lang.String traceInput = \"\";\n\n\tthis.main_mode(modelInput, traceInput, output, km2ecore.CompilingMode.getByName(\"behaviorJava\"));\n'"
	 * @generated
	 */
	void main_inner();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaString"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.String result = null;\n\n\tjava.lang.Boolean idIfCond_652 = false;\n\tidIfCond_652 = kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoid(td)), org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOf(td, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ClassDefinition\")));\n\n\tif( idIfCond_652 ) {\n\n\tkermeta.language.structure.ClassDefinition cd = ((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(td, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ClassDefinition\")));\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(cd.getName(), \" \"), kermeta.standard.helper.BooleanWrapper.toString(cd.isValueType()));\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	String typeDefinitionToString(TypeDefinition td);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model qnDataType="kermeta.standard.JavaString"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.language.structure.TypeDefinition result = null;\n\n\tkermeta.language.structure.TypeDefinition td = ((kermeta.language.structure.TypeDefinition) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.language.structure.TypeDefinition\"));\n\n\tkermeta.language.structure.TypeDefinition td_tmp = this.getContext().getMu().getTypeDefinitionByQualifiedName(qn);\n\n\tjava.lang.Boolean idIfCond_653 = false;\n\tidIfCond_653 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoid(td_tmp));\n\n\tif( idIfCond_653 ) {\n\n\ttd = td_tmp;\n}\n\n\n\tresult = td;\n\nreturn result;\n'"
	 * @generated
	 */
	TypeDefinition getTypeDefinitionByQualifiedName(String qn);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model modelInputDataType="kermeta.standard.JavaString" traceInputDataType="kermeta.standard.JavaString" outputDataType="kermeta.standard.JavaString"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tthis.setContext(((km2ecore.KM2EcoreContext) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"km2ecore.KM2EcoreContext\")));\n\n\tthis.getContext().initialize(modelInput, traceInput);\n\n\tthis.getContext().setMode(mode);\n\n\tthis.getContext().getMu().applyPass1(this.getContext());\n\n\tjava.lang.Boolean idIfCond_654 = false;\n\tidIfCond_654 = org.kermeta.compil.runtime.helper.language.ObjectUtil.equals(this.getContext().getMode(), km2ecore.CompilingMode.getByName(\"onlyEcore\"));\n\n\tif( idIfCond_654 ) {\n\n\tthis.getContext().getMu().applyPass2(this.getContext());\n}\n\n\n\torg.kermeta.compil.runtime.helper.io.StdIOUtil.writeln(\"KermetaCompiler - Pass 1 is finished\");\n\n\tjava.lang.Boolean idIfCond_655 = false;\n\tidIfCond_655 = org.kermeta.compil.runtime.helper.language.ObjectUtil.equals(this.getContext().getMode(), km2ecore.CompilingMode.getByName(\"behaviorKmt\"));\n\n\tif( idIfCond_655 ) {\n\n\tthis.getContext().getMu().applyPass2BehaviorKmt(this.getContext());\n}\n\n\n\tjava.lang.Boolean idIfCond_656 = false;\n\tidIfCond_656 = org.kermeta.compil.runtime.helper.language.ObjectUtil.equals(this.getContext().getMode(), km2ecore.CompilingMode.getByName(\"behaviorJava\"));\n\n\tif( idIfCond_656 ) {\n\n\tthis.getContext().getMu().preprocess(this.getContext());\n\n\torg.kermeta.compil.runtime.helper.io.StdIOUtil.writeln(kermeta.standard.helper.StringWrapper.plus(\"KermetaCompiler - Pass 2 with the mode: \", this.getContext().getMode().getName()));\n\n\tthis.getContext().getMu().applyPass2BehaviorJava(this.getContext());\n\n\tthis.getContext().getMu().postprocess(this.getContext());\n}\n\n\n\torg.kermeta.compil.runtime.helper.io.StdIOUtil.writeln(\"KermetaCompiler - Pass 2 is finished\");\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<java.lang.String>convertAsOrderedSet(this.getContext().getEcoreOutputs()).add(output);\n\n\tkermeta.persistence.Resource ecore_resource = this.getContext().getOutputRepository().createResource(output, \"http://www.eclipse.org/emf/2002/Ecore\");\n\n\tecore_resource.instances().add(this.getContext().getMu().getEcoreModelElement());\n\n\t//Beginning of the Inlining of the function type: each\n\n\t\n{\n\n\tkermeta.standard.Iterator<ecore.EAnnotation> it_ft134 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EAnnotation>convertAsOrderedSet(this.getContext().getMu().getEntryPoints()).iterator();\n\tjava.lang.Boolean idLoopCond_657 = false;\n\twhile( !idLoopCond_657 ) {\n\tidLoopCond_657 = it_ft134.isOff();\n\tif ( idLoopCond_657 ) {\n\t} else {\n\n\t//Beginning of the Inlining of the lambda expression: func\necore.EAnnotation e = it_ft134.next();\n\n\tecore_resource.instances().add(e);\n//End of the Inlining of the lambda expression: func\n\n}\n\t}\n}\n\n//End of the Inlining of the function type: each\n\n\n\t//Beginning of the Inlining of the function type: each\n\n\t\n{\n\n\tkermeta.standard.Iterator<ecore.EPackage> it_ft135 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EPackage>convertAsOrderedSet(this.getContext().getMu().getEcorePackages()).iterator();\n\tjava.lang.Boolean idLoopCond_658 = false;\n\twhile( !idLoopCond_658 ) {\n\tidLoopCond_658 = it_ft135.isOff();\n\tif ( idLoopCond_658 ) {\n\t} else {\n\n\t//Beginning of the Inlining of the lambda expression: func\necore.EPackage p = it_ft135.next();\n\n\tecore_resource.instances().add(p);\n//End of the Inlining of the lambda expression: func\n\n}\n\t}\n}\n\n//End of the Inlining of the function type: each\n\n\n\torg.kermeta.compil.runtime.helper.io.StdIOUtil.writeln(\"Save the Ecore Model\");\n\n\tecore_resource.save();\n\n\torg.kermeta.compil.runtime.helper.io.StdIOUtil.writeln(\"The Ecore Model has been saved\");\n\n\tthis.getContext().save();\n\n\torg.kermeta.compil.runtime.helper.io.StdIOUtil.writeln(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(\"Stats:\\n\\tconditional + loop: \", kermeta.standard.helper.IntegerWrapper.toString(this.getContext().getInc_condStack())), \"\\n\\tfunction type: \"), kermeta.standard.helper.IntegerWrapper.toString(this.getContext().getInc_ftSuffix())));\n\n\torg.kermeta.compil.runtime.helper.io.StdIOUtil.writeln(\"Finish\");\n'"
	 * @generated
	 */
	void main_mode(String modelInput, String traceInput, String output,
			CompilingMode mode);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model modelInputDataType="kermeta.standard.JavaString" traceInputDataType="kermeta.standard.JavaString" outputDataType="kermeta.standard.JavaString"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tthis.main_mode(modelInput, traceInput, output, km2ecore.CompilingMode.getByName(\"behaviorJava\"));\n'"
	 * @generated
	 */
	void main(String modelInput, String traceInput, String output);

} // Main
