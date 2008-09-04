/**
 * <copyright>
 * </copyright>
 *
 * $Id: SIMKModel.java,v 1.1 2008-09-04 15:40:41 cfaucher Exp $
 */
package simk;

import kermeta.language.structure.Operation;

import km2ecore.KM2EcoreContext;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SIMK Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link simk.SIMKModel#getSMContexts <em>SM Contexts</em>}</li>
 *   <li>{@link simk.SIMKModel#getStaticMethods <em>Static Methods</em>}</li>
 * </ul>
 * </p>
 *
 * @see simk.SimkPackage#getSIMKModel()
 * @model
 * @generated
 */
public interface SIMKModel extends SMNamedElement {
	/**
	 * Returns the value of the '<em><b>SM Contexts</b></em>' containment reference list.
	 * The list contents are of type {@link simk.SMContext}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SM Contexts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SM Contexts</em>' containment reference list.
	 * @see simk.SimkPackage#getSIMKModel_SMContexts()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<SMContext> getSMContexts();

	/**
	 * Returns the value of the '<em><b>Static Methods</b></em>' containment reference list.
	 * The list contents are of type {@link simk.StaticMethod}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Static Methods</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Static Methods</em>' containment reference list.
	 * @see simk.SimkPackage#getSIMKModel_StaticMethods()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<StaticMethod> getStaticMethods();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/** TODO TO COMMENT\052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nsimk.SMContext result = null;\n\n\tresult = null;\n\n\tsimk.SMContext sMContext = this.retrieveOrCreateContextWithClass(kermeta.standard.helper.StringWrapper.plus(((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(org.kermeta.compil.runtime.helper.language.ObjectUtil.container(op), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ClassDefinition\"))).getName(), \"Super\"), kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.replace(((kermeta.language.structure.Package) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(org.kermeta.compil.runtime.helper.language.ObjectUtil.container(((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(org.kermeta.compil.runtime.helper.language.ObjectUtil.container(op), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ClassDefinition\")))), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Package\"))).qualifiedName(), \"::\", \"\\\\.\"), \".helper\"), simk.SMUsage.getByName(\"Super\"), context);\n\n\tsimk.StaticMethod sm = null;\n//Beginning of the Inlining of the function type: detect\n\nsimk.StaticMethod result_ft194 = null;\n\n\tsimk.StaticMethod elem_ft194 = null;\n\n\tresult_ft194 = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<simk.StaticMethod> it_ft194 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<simk.StaticMethod>convertAsOrderedSet(sMContext.getStaticMethods()).iterator();\n\tjava.lang.Boolean idLoopCond_849 = false;\n\twhile( !idLoopCond_849 ) {\n\tidLoopCond_849 = kermeta.standard.helper.BooleanWrapper.or(it_ft194.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqual(result_ft194, null));\n\tif ( idLoopCond_849 ) {\n\t} else {\n\n\telem_ft194 = it_ft194.next();\n\n\tjava.lang.Boolean idIfCond_850 = false;\n//Beginning of the Inlining of the lambda expression: detector\nsimk.StaticMethod o = elem_ft194;\n\n\tidIfCond_850 = kermeta.standard.helper.StringWrapper.equals(o.getName(), kermeta.standard.helper.StringWrapper.plus(\"super_\", ((km2ecore.helper.java.IdentifierHelper) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"km2ecore.helper.java.IdentifierHelper\")).getMangledIdentifier(op.getFinalName(), context)));\n//End of the Inlining of the lambda expression: detector\n\n\n\tif( idIfCond_850 ) {\n\n\tresult_ft194 = elem_ft194;\n}\n\n}\n\t}\n}\n\n\n//callElement\nsm = result_ft194;\n//End of the Inlining of the function type: detect\n\n\n\tjava.lang.Boolean idIfCond_851 = false;\n\tidIfCond_851 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoid(sm);\n\n\tif( idIfCond_851 ) {\n\n\tresult = sMContext;\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	SMContext retrieveOrCreateContextForSuper(Operation op,
			KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="ecore.EInt"
	 *        annotation="kermeta isAbstract='true'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='java.lang.Integer result = null;\n\nreturn result;\n'"
	 * @generated
	 */
	int getNextId();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/** TODO TO COMMENT\052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nsimk.SMContext result = null;\n\n\tresult = null;\n\n\tsimk.SMContext sMContext = this.retrieveOrCreateContextWithClass(kermeta.standard.helper.StringWrapper.plus(context.getCurrent_valueType().getName(), \"Wrapper\"), \"kermeta.standard.helper\", simk.SMUsage.getByName(\"Wrapper\"), context);\n\n\tsimk.StaticMethod sm = null;\n//Beginning of the Inlining of the function type: detect\n\nsimk.StaticMethod result_ft195 = null;\n\n\tsimk.StaticMethod elem_ft195 = null;\n\n\tresult_ft195 = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<simk.StaticMethod> it_ft195 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<simk.StaticMethod>convertAsOrderedSet(sMContext.getStaticMethods()).iterator();\n\tjava.lang.Boolean idLoopCond_852 = false;\n\twhile( !idLoopCond_852 ) {\n\tidLoopCond_852 = kermeta.standard.helper.BooleanWrapper.or(it_ft195.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqual(result_ft195, null));\n\tif ( idLoopCond_852 ) {\n\t} else {\n\n\telem_ft195 = it_ft195.next();\n\n\tjava.lang.Boolean idIfCond_853 = false;\n//Beginning of the Inlining of the lambda expression: detector\nsimk.StaticMethod o = elem_ft195;\n\n\tidIfCond_853 = kermeta.standard.helper.StringWrapper.equals(o.getName(), ((km2ecore.helper.java.IdentifierHelper) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"km2ecore.helper.java.IdentifierHelper\")).getMangledIdentifier(op.getFinalName(), context));\n//End of the Inlining of the lambda expression: detector\n\n\n\tif( idIfCond_853 ) {\n\n\tresult_ft195 = elem_ft195;\n}\n\n}\n\t}\n}\n\n\n//callElement\nsm = result_ft195;\n//End of the Inlining of the function type: detect\n\n\n\tjava.lang.Boolean idIfCond_854 = false;\n\tidIfCond_854 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoid(sm);\n\n\tif( idIfCond_854 ) {\n\n\tresult = sMContext;\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	SMContext retrieveOrCreateContextForWrapper(Operation op,
			KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/** TODO TO COMMENT\052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nsimk.SMContext result = null;\n\n\tresult = null;\n\n\tsimk.SMContext sMContext = this.retrieveOrCreateContextWithClass(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(org.kermeta.compil.runtime.helper.language.ObjectUtil.container(op), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ClassDefinition\"))).getName(), \"__\"), ((km2ecore.helper.java.IdentifierHelper) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"km2ecore.helper.java.IdentifierHelper\")).getMangledIdentifier(op.getFinalName(), context)), \"__\"), \"Runner\"), kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.replace(((kermeta.language.structure.Package) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(org.kermeta.compil.runtime.helper.language.ObjectUtil.container(((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(org.kermeta.compil.runtime.helper.language.ObjectUtil.container(op), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ClassDefinition\")))), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Package\"))).qualifiedName(), \"::\", \"\\\\.\"), \".runner\"), simk.SMUsage.getByName(\"Runner\"), context);\n\n\tjava.lang.Boolean idIfCond_855 = false;\n\tidIfCond_855 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoid(sMContext);\n\n\tif( idIfCond_855 ) {\n\n\torg.kermeta.compil.runtime.helper.io.StdIOUtil.writeln(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(org.kermeta.compil.runtime.helper.language.ObjectUtil.container(op), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ClassDefinition\"))).getName(), \"__\"), ((km2ecore.helper.java.IdentifierHelper) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"km2ecore.helper.java.IdentifierHelper\")).getMangledIdentifier(op.getFinalName(), context)), \"__\"), \"Runner\"), \" - \"), kermeta.standard.helper.StringWrapper.replace(((kermeta.language.structure.Package) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(org.kermeta.compil.runtime.helper.language.ObjectUtil.container(((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(org.kermeta.compil.runtime.helper.language.ObjectUtil.container(op), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ClassDefinition\")))), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Package\"))).qualifiedName(), \"::\", \"\\\\.\")), \".runner\"));\n}\n\n\n\tsimk.StaticMethod sm = null;\n//Beginning of the Inlining of the function type: detect\n\nsimk.StaticMethod result_ft196 = null;\n\n\tsimk.StaticMethod elem_ft196 = null;\n\n\tresult_ft196 = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<simk.StaticMethod> it_ft196 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<simk.StaticMethod>convertAsOrderedSet(sMContext.getStaticMethods()).iterator();\n\tjava.lang.Boolean idLoopCond_856 = false;\n\twhile( !idLoopCond_856 ) {\n\tidLoopCond_856 = kermeta.standard.helper.BooleanWrapper.or(it_ft196.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqual(result_ft196, null));\n\tif ( idLoopCond_856 ) {\n\t} else {\n\n\telem_ft196 = it_ft196.next();\n\n\tjava.lang.Boolean idIfCond_857 = false;\n//Beginning of the Inlining of the lambda expression: detector\nsimk.StaticMethod o = elem_ft196;\n\n\tidIfCond_857 = kermeta.standard.helper.StringWrapper.equals(o.getName(), \"main\");\n//End of the Inlining of the lambda expression: detector\n\n\n\tif( idIfCond_857 ) {\n\n\tresult_ft196 = elem_ft196;\n}\n\n}\n\t}\n}\n\n\n//callElement\nsm = result_ft196;\n//End of the Inlining of the function type: detect\n\n\n\tjava.lang.Boolean idIfCond_858 = false;\n\tidIfCond_858 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoid(sm);\n\n\tif( idIfCond_858 ) {\n\n\tresult = sMContext;\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	SMContext retrieveOrCreateContextForRunner(Operation op,
			KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model class_qnameDataType="kermeta.standard.JavaString" finalPackage_qnameDataType="kermeta.standard.JavaString"
	 *        annotation="kermeta documentation='/** TODO TO COMMENT\052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nsimk.SMContext result = null;\n\n\tsimk.SMContext sMContext = this.retrieveOrCreateContext(class_qname, finalPackage_qname, usage, context);\n\n\tjava.lang.Boolean idIfCond_859 = false;\n\tidIfCond_859 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoid(sMContext.getSMClass());\n\n\tif( idIfCond_859 ) {\n\n\tsimk.SMClass sMClass = ((simk.SMClass) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"simk.SMClass\"));\n\n\tsMContext.setSMClass(sMClass);\n\n\tsMClass.setName(class_qname);\n\n\tsMClass.setUsages(usage);\n}\n\n\n\tresult = sMContext;\n\nreturn result;\n'"
	 * @generated
	 */
	SMContext retrieveOrCreateContextWithClass(String class_qname,
			String finalPackage_qname, SMUsage usage, KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model class_qnameDataType="kermeta.standard.JavaString" finalPackage_qnameDataType="kermeta.standard.JavaString"
	 *        annotation="kermeta documentation='/** TODO TO COMMENT\052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nsimk.SMContext result = null;\n\n\tsimk.SMContext sMContext = null;\n//Beginning of the Inlining of the function type: detect\n\nsimk.SMContext result_ft197 = null;\n\n\tsimk.SMContext elem_ft197 = null;\n\n\tresult_ft197 = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<simk.SMContext> it_ft197 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<simk.SMContext>convertAsOrderedSet(this.getSMContexts()).iterator();\n\tjava.lang.Boolean idLoopCond_860 = false;\n\twhile( !idLoopCond_860 ) {\n\tidLoopCond_860 = kermeta.standard.helper.BooleanWrapper.or(it_ft197.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqual(result_ft197, null));\n\tif ( idLoopCond_860 ) {\n\t} else {\n\n\telem_ft197 = it_ft197.next();\n\n\tjava.lang.Boolean idIfCond_861 = false;\n//Beginning of the Inlining of the lambda expression: detector\nsimk.SMContext c = elem_ft197;\n\n\tidIfCond_861 = kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.StringWrapper.equals(c.getQualifiedNameFinalPackage(), finalPackage_qname), kermeta.standard.helper.StringWrapper.equals(c.getSMClass().getName(), class_qname)), org.kermeta.compil.runtime.helper.language.ObjectUtil.equals(c.getSMClass().getUsages(), usage));\n//End of the Inlining of the lambda expression: detector\n\n\n\tif( idIfCond_861 ) {\n\n\tresult_ft197 = elem_ft197;\n}\n\n}\n\t}\n}\n\n\n//callElement\nsMContext = result_ft197;\n//End of the Inlining of the function type: detect\n\n\n\tjava.lang.Boolean idIfCond_862 = false;\n\tidIfCond_862 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoid(sMContext);\n\n\tif( idIfCond_862 ) {\n\n\tsMContext = ((simk.SMContext) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"simk.SMContext\"));\n\n\tsMContext.setQualifiedNameFinalPackage(finalPackage_qname);\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<simk.SMContext>convertAsOrderedSet(this.getSMContexts()).add(sMContext);\n}\n\n\n\tresult = sMContext;\n\nreturn result;\n'"
	 * @generated
	 */
	SMContext retrieveOrCreateContext(String class_qname,
			String finalPackage_qname, SMUsage usage, KM2EcoreContext context);

} // SIMKModel
