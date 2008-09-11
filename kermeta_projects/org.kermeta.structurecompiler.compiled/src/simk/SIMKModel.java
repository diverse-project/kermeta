/**
 * <copyright>
 * </copyright>
 *
 * $Id: SIMKModel.java,v 1.2 2008-09-11 12:35:01 cfaucher Exp $
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nsimk.SMContext result = null;\n\n\tresult = null;\n\n\tsimk.SMContext sMContext = this.retrieveOrCreateContextWithClass(kermeta.standard.helper.StringWrapper.plus(((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(org.kermeta.compil.runtime.helper.language.ObjectUtil.container(op), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ClassDefinition\"))).getName(), \"Super\"), kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.replace(((kermeta.language.structure.Package) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(org.kermeta.compil.runtime.helper.language.ObjectUtil.container(((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(org.kermeta.compil.runtime.helper.language.ObjectUtil.container(op), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ClassDefinition\")))), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Package\"))).qualifiedName(), \"::\", \"\\\\.\"), \".helper\"), simk.SMUsage.getByName(\"Super\"), context);\n\n\tsimk.StaticMethod sm = null;\n//BIft:detect\n\nsimk.StaticMethod result_ft198 = null;\n\n\tsimk.StaticMethod elem_ft198 = null;\n\n\tresult_ft198 = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<simk.StaticMethod> it_ft198 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<simk.StaticMethod>convertAsOrderedSet(sMContext.getStaticMethods()).iterator();\n\tjava.lang.Boolean idLoopCond_915 = false;\n\twhile( !idLoopCond_915 ) {\n\tidLoopCond_915 = kermeta.standard.helper.BooleanWrapper.or(it_ft198.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqual(result_ft198, null));\n\tif ( idLoopCond_915 ) {\n\t} else {\n\n\telem_ft198 = it_ft198.next();\n\n\tjava.lang.Boolean idIfCond_916 = false;\n//BIle:detector\nsimk.StaticMethod o_lbdExp198 = elem_ft198;\n\n\tidIfCond_916 = kermeta.standard.helper.StringWrapper.equals(o_lbdExp198.getName(), kermeta.standard.helper.StringWrapper.plus(\"super_\", ((km2ecore.helper.java.IdentifierHelper) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"km2ecore.helper.java.IdentifierHelper\")).getMangledIdentifier(op.getFinalName(), context)));\n//EIle:detector\n\n\n\tif( idIfCond_916 ) {\n\n\tresult_ft198 = elem_ft198;\n}\n\n}\n\t}\n}\n\n\n//CE\nsm = result_ft198;\n//EIft:detect\n\n\n\tjava.lang.Boolean idIfCond_917 = false;\n\tidIfCond_917 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoid(sm);\n\n\tif( idIfCond_917 ) {\n\n\tresult = sMContext;\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	SMContext retrieveOrCreateContextForSuper(Operation op,
			KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/** TODO TO COMMENT\052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nsimk.SMContext result = null;\n\n\tresult = null;\n\n\tsimk.SMContext sMContext = this.retrieveOrCreateContextWithClass(kermeta.standard.helper.StringWrapper.plus(context.getCurrent_valueType().getName(), \"Wrapper\"), \"kermeta.standard.helper\", simk.SMUsage.getByName(\"Wrapper\"), context);\n\n\tsimk.StaticMethod sm = null;\n//BIft:detect\n\nsimk.StaticMethod result_ft199 = null;\n\n\tsimk.StaticMethod elem_ft199 = null;\n\n\tresult_ft199 = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<simk.StaticMethod> it_ft199 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<simk.StaticMethod>convertAsOrderedSet(sMContext.getStaticMethods()).iterator();\n\tjava.lang.Boolean idLoopCond_918 = false;\n\twhile( !idLoopCond_918 ) {\n\tidLoopCond_918 = kermeta.standard.helper.BooleanWrapper.or(it_ft199.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqual(result_ft199, null));\n\tif ( idLoopCond_918 ) {\n\t} else {\n\n\telem_ft199 = it_ft199.next();\n\n\tjava.lang.Boolean idIfCond_919 = false;\n//BIle:detector\nsimk.StaticMethod o_lbdExp199 = elem_ft199;\n\n\tidIfCond_919 = kermeta.standard.helper.StringWrapper.equals(o_lbdExp199.getName(), ((km2ecore.helper.java.IdentifierHelper) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"km2ecore.helper.java.IdentifierHelper\")).getMangledIdentifier(op.getFinalName(), context));\n//EIle:detector\n\n\n\tif( idIfCond_919 ) {\n\n\tresult_ft199 = elem_ft199;\n}\n\n}\n\t}\n}\n\n\n//CE\nsm = result_ft199;\n//EIft:detect\n\n\n\tjava.lang.Boolean idIfCond_920 = false;\n\tidIfCond_920 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoid(sm);\n\n\tif( idIfCond_920 ) {\n\n\tresult = sMContext;\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	SMContext retrieveOrCreateContextForWrapper(Operation op,
			KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/** TODO TO COMMENT\052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nsimk.SMContext result = null;\n\n\tresult = null;\n\n\tsimk.SMContext sMContext = this.retrieveOrCreateContextWithClass(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(org.kermeta.compil.runtime.helper.language.ObjectUtil.container(op), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ClassDefinition\"))).getName(), \"__\"), ((km2ecore.helper.java.IdentifierHelper) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"km2ecore.helper.java.IdentifierHelper\")).getMangledIdentifier(op.getFinalName(), context)), \"__\"), \"Runner\"), kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.replace(((kermeta.language.structure.Package) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(org.kermeta.compil.runtime.helper.language.ObjectUtil.container(((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(org.kermeta.compil.runtime.helper.language.ObjectUtil.container(op), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ClassDefinition\")))), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Package\"))).qualifiedName(), \"::\", \"\\\\.\"), \".runner\"), simk.SMUsage.getByName(\"Runner\"), context);\n\n\tjava.lang.Boolean idIfCond_921 = false;\n\tidIfCond_921 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoid(sMContext);\n\n\tif( idIfCond_921 ) {\n\n\torg.kermeta.compil.runtime.helper.io.StdIOUtil.writeln(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(org.kermeta.compil.runtime.helper.language.ObjectUtil.container(op), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ClassDefinition\"))).getName(), \"__\"), ((km2ecore.helper.java.IdentifierHelper) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"km2ecore.helper.java.IdentifierHelper\")).getMangledIdentifier(op.getFinalName(), context)), \"__\"), \"Runner\"), \" - \"), kermeta.standard.helper.StringWrapper.replace(((kermeta.language.structure.Package) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(org.kermeta.compil.runtime.helper.language.ObjectUtil.container(((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(org.kermeta.compil.runtime.helper.language.ObjectUtil.container(op), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ClassDefinition\")))), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Package\"))).qualifiedName(), \"::\", \"\\\\.\")), \".runner\"));\n}\n\n\n\tsimk.StaticMethod sm = null;\n//BIft:detect\n\nsimk.StaticMethod result_ft200 = null;\n\n\tsimk.StaticMethod elem_ft200 = null;\n\n\tresult_ft200 = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<simk.StaticMethod> it_ft200 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<simk.StaticMethod>convertAsOrderedSet(sMContext.getStaticMethods()).iterator();\n\tjava.lang.Boolean idLoopCond_922 = false;\n\twhile( !idLoopCond_922 ) {\n\tidLoopCond_922 = kermeta.standard.helper.BooleanWrapper.or(it_ft200.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqual(result_ft200, null));\n\tif ( idLoopCond_922 ) {\n\t} else {\n\n\telem_ft200 = it_ft200.next();\n\n\tjava.lang.Boolean idIfCond_923 = false;\n//BIle:detector\nsimk.StaticMethod o_lbdExp200 = elem_ft200;\n\n\tidIfCond_923 = kermeta.standard.helper.StringWrapper.equals(o_lbdExp200.getName(), \"main\");\n//EIle:detector\n\n\n\tif( idIfCond_923 ) {\n\n\tresult_ft200 = elem_ft200;\n}\n\n}\n\t}\n}\n\n\n//CE\nsm = result_ft200;\n//EIft:detect\n\n\n\tjava.lang.Boolean idIfCond_924 = false;\n\tidIfCond_924 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoid(sm);\n\n\tif( idIfCond_924 ) {\n\n\tresult = sMContext;\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	SMContext retrieveOrCreateContextForRunner(Operation op,
			KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model class_qnameDataType="kermeta.standard.JavaString" finalPackage_qnameDataType="kermeta.standard.JavaString"
	 *        annotation="kermeta documentation='/** TODO TO COMMENT\052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nsimk.SMContext result = null;\n\n\tsimk.SMContext sMContext = this.retrieveOrCreateContext(class_qname, finalPackage_qname, usage, context);\n\n\tjava.lang.Boolean idIfCond_925 = false;\n\tidIfCond_925 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoid(sMContext.getSMClass());\n\n\tif( idIfCond_925 ) {\n\n\tsimk.SMClass sMClass = ((simk.SMClass) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"simk.SMClass\"));\n\n\tsMContext.setSMClass(sMClass);\n\n\tsMClass.setName(class_qname);\n\n\tsMClass.setUsages(usage);\n}\n\n\n\tresult = sMContext;\n\nreturn result;\n'"
	 * @generated
	 */
	SMContext retrieveOrCreateContextWithClass(String class_qname,
			String finalPackage_qname, SMUsage usage, KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model class_qnameDataType="kermeta.standard.JavaString" finalPackage_qnameDataType="kermeta.standard.JavaString"
	 *        annotation="kermeta documentation='/** TODO TO COMMENT\052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nsimk.SMContext result = null;\n\n\tsimk.SMContext sMContext = null;\n//BIft:detect\n\nsimk.SMContext result_ft201 = null;\n\n\tsimk.SMContext elem_ft201 = null;\n\n\tresult_ft201 = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<simk.SMContext> it_ft201 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<simk.SMContext>convertAsOrderedSet(this.getSMContexts()).iterator();\n\tjava.lang.Boolean idLoopCond_926 = false;\n\twhile( !idLoopCond_926 ) {\n\tidLoopCond_926 = kermeta.standard.helper.BooleanWrapper.or(it_ft201.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqual(result_ft201, null));\n\tif ( idLoopCond_926 ) {\n\t} else {\n\n\telem_ft201 = it_ft201.next();\n\n\tjava.lang.Boolean idIfCond_927 = false;\n//BIle:detector\nsimk.SMContext c_lbdExp201 = elem_ft201;\n\n\tidIfCond_927 = kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.StringWrapper.equals(c_lbdExp201.getQualifiedNameFinalPackage(), finalPackage_qname), kermeta.standard.helper.StringWrapper.equals(c_lbdExp201.getSMClass().getName(), class_qname)), org.kermeta.compil.runtime.helper.language.ObjectUtil.equals(c_lbdExp201.getSMClass().getUsages(), usage));\n//EIle:detector\n\n\n\tif( idIfCond_927 ) {\n\n\tresult_ft201 = elem_ft201;\n}\n\n}\n\t}\n}\n\n\n//CE\nsMContext = result_ft201;\n//EIft:detect\n\n\n\tjava.lang.Boolean idIfCond_928 = false;\n\tidIfCond_928 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoid(sMContext);\n\n\tif( idIfCond_928 ) {\n\n\tsMContext = ((simk.SMContext) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"simk.SMContext\"));\n\n\tsMContext.setQualifiedNameFinalPackage(finalPackage_qname);\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<simk.SMContext>convertAsOrderedSet(this.getSMContexts()).add(sMContext);\n}\n\n\n\tresult = sMContext;\n\nreturn result;\n'"
	 * @generated
	 */
	SMContext retrieveOrCreateContext(String class_qname,
			String finalPackage_qname, SMUsage usage, KM2EcoreContext context);

} // SIMKModel
