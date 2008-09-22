/**
 * <copyright>
 * </copyright>
 *
 * $Id: SIMKModel.java,v 1.3 2008-09-22 14:49:06 cfaucher Exp $
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nsimk.SMContext result = null;\n\n\tresult = null;\n\n\tsimk.SMContext sMContext = this.retrieveOrCreateContextWithClass(kermeta.standard.helper.StringWrapper.plus(((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(org.kermeta.compil.runtime.helper.language.ObjectUtil.container(op), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ClassDefinition\"))).getName(), \"Super\"), kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.replace(((kermeta.language.structure.Package) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(org.kermeta.compil.runtime.helper.language.ObjectUtil.container(((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(org.kermeta.compil.runtime.helper.language.ObjectUtil.container(op), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ClassDefinition\")))), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Package\"))).qualifiedName(), \"::\", \".\"), \".helper\"), simk.SMUsage.getByName(\"Super\"), context);\n\n\tsimk.StaticMethod sm = null;\n//BIft:detect\n\nsimk.StaticMethod result_ft244 = null;\n\n\tsimk.StaticMethod elem_ft244 = null;\n\n\tresult_ft244 = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<simk.StaticMethod> it_ft244 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<simk.StaticMethod>convertAsOrderedSet(sMContext.getStaticMethods()).iterator();\n\tjava.lang.Boolean idLoopCond_1039 = false;\n\twhile( !idLoopCond_1039 ) {\n\tidLoopCond_1039 = kermeta.standard.helper.BooleanWrapper.or(it_ft244.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqual(result_ft244, null));\n\tif ( idLoopCond_1039 ) {\n\t} else {\n\n\telem_ft244 = it_ft244.next();\n\n\tjava.lang.Boolean idIfCond_1040 = false;\n//BIle:detector\nsimk.StaticMethod o_lbdExp244 = elem_ft244;\n\n\tidIfCond_1040 = kermeta.standard.helper.StringWrapper.equals(o_lbdExp244.getName(), kermeta.standard.helper.StringWrapper.plus(\"super_\", ((km2ecore.helper.java.IdentifierHelper) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"km2ecore.helper.java.IdentifierHelper\")).getMangledIdentifier(op.getFinalName(), context)));\n//EIle:detector\n\n\n\tif( idIfCond_1040 ) {\n\n\tresult_ft244 = elem_ft244;\n}\n\n}\n\t}\n}\n\n\n//CE\nsm = result_ft244;\n//EIft:detect\n\n\n\tjava.lang.Boolean idIfCond_1041 = false;\n\tidIfCond_1041 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoid(sm);\n\n\tif( idIfCond_1041 ) {\n\n\tresult = sMContext;\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	SMContext retrieveOrCreateContextForSuper(Operation op,
			KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/** TODO TO COMMENT\052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nsimk.SMContext result = null;\n\n\tresult = null;\n\n\tsimk.SMContext sMContext = this.retrieveOrCreateContextWithClass(kermeta.standard.helper.StringWrapper.plus(context.getCurrent_valueType().getName(), \"Wrapper\"), \"kermeta.standard.helper\", simk.SMUsage.getByName(\"Wrapper\"), context);\n\n\tsimk.StaticMethod sm = null;\n//BIft:detect\n\nsimk.StaticMethod result_ft245 = null;\n\n\tsimk.StaticMethod elem_ft245 = null;\n\n\tresult_ft245 = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<simk.StaticMethod> it_ft245 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<simk.StaticMethod>convertAsOrderedSet(sMContext.getStaticMethods()).iterator();\n\tjava.lang.Boolean idLoopCond_1042 = false;\n\twhile( !idLoopCond_1042 ) {\n\tidLoopCond_1042 = kermeta.standard.helper.BooleanWrapper.or(it_ft245.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqual(result_ft245, null));\n\tif ( idLoopCond_1042 ) {\n\t} else {\n\n\telem_ft245 = it_ft245.next();\n\n\tjava.lang.Boolean idIfCond_1043 = false;\n//BIle:detector\nsimk.StaticMethod o_lbdExp245 = elem_ft245;\n\n\tidIfCond_1043 = kermeta.standard.helper.StringWrapper.equals(o_lbdExp245.getName(), ((km2ecore.helper.java.IdentifierHelper) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"km2ecore.helper.java.IdentifierHelper\")).getMangledIdentifier(op.getFinalName(), context));\n//EIle:detector\n\n\n\tif( idIfCond_1043 ) {\n\n\tresult_ft245 = elem_ft245;\n}\n\n}\n\t}\n}\n\n\n//CE\nsm = result_ft245;\n//EIft:detect\n\n\n\tjava.lang.Boolean idIfCond_1044 = false;\n\tidIfCond_1044 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoid(sm);\n\n\tif( idIfCond_1044 ) {\n\n\tresult = sMContext;\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	SMContext retrieveOrCreateContextForWrapper(Operation op,
			KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/** TODO TO COMMENT\052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nsimk.SMContext result = null;\n\n\tresult = null;\n\n\tsimk.SMContext sMContext = this.retrieveOrCreateContextWithClass(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(org.kermeta.compil.runtime.helper.language.ObjectUtil.container(op), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ClassDefinition\"))).getName(), \"__\"), ((km2ecore.helper.java.IdentifierHelper) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"km2ecore.helper.java.IdentifierHelper\")).getMangledIdentifier(op.getFinalName(), context)), \"__\"), \"Runner\"), kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.replace(((kermeta.language.structure.Package) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(org.kermeta.compil.runtime.helper.language.ObjectUtil.container(((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(org.kermeta.compil.runtime.helper.language.ObjectUtil.container(op), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ClassDefinition\")))), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Package\"))).qualifiedName(), \"::\", \".\"), \".runner\"), simk.SMUsage.getByName(\"Runner\"), context);\n\n\tsimk.StaticMethod sm = null;\n//BIft:detect\n\nsimk.StaticMethod result_ft246 = null;\n\n\tsimk.StaticMethod elem_ft246 = null;\n\n\tresult_ft246 = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<simk.StaticMethod> it_ft246 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<simk.StaticMethod>convertAsOrderedSet(sMContext.getStaticMethods()).iterator();\n\tjava.lang.Boolean idLoopCond_1045 = false;\n\twhile( !idLoopCond_1045 ) {\n\tidLoopCond_1045 = kermeta.standard.helper.BooleanWrapper.or(it_ft246.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqual(result_ft246, null));\n\tif ( idLoopCond_1045 ) {\n\t} else {\n\n\telem_ft246 = it_ft246.next();\n\n\tjava.lang.Boolean idIfCond_1046 = false;\n//BIle:detector\nsimk.StaticMethod o_lbdExp246 = elem_ft246;\n\n\tidIfCond_1046 = kermeta.standard.helper.StringWrapper.equals(o_lbdExp246.getName(), \"main\");\n//EIle:detector\n\n\n\tif( idIfCond_1046 ) {\n\n\tresult_ft246 = elem_ft246;\n}\n\n}\n\t}\n}\n\n\n//CE\nsm = result_ft246;\n//EIft:detect\n\n\n\tjava.lang.Boolean idIfCond_1047 = false;\n\tidIfCond_1047 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoid(sm);\n\n\tif( idIfCond_1047 ) {\n\n\tresult = sMContext;\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	SMContext retrieveOrCreateContextForRunner(Operation op,
			KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model class_qnameDataType="kermeta.standard.JavaString" finalPackage_qnameDataType="kermeta.standard.JavaString"
	 *        annotation="kermeta documentation='/** TODO TO COMMENT\052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nsimk.SMContext result = null;\n\n\tsimk.SMContext sMContext = this.retrieveOrCreateContext(class_qname, finalPackage_qname, usage, context);\n\n\tjava.lang.Boolean idIfCond_1048 = false;\n\tidIfCond_1048 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoid(sMContext.getSMClass());\n\n\tif( idIfCond_1048 ) {\n\n\tsimk.SMClass sMClass = ((simk.SMClass) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"simk.SMClass\"));\n\n\tsMContext.setSMClass(sMClass);\n\n\tsMClass.setName(class_qname);\n\n\tsMClass.setUsages(usage);\n}\n\n\n\tresult = sMContext;\n\nreturn result;\n'"
	 * @generated
	 */
	SMContext retrieveOrCreateContextWithClass(String class_qname,
			String finalPackage_qname, SMUsage usage, KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model class_qnameDataType="kermeta.standard.JavaString" finalPackage_qnameDataType="kermeta.standard.JavaString"
	 *        annotation="kermeta documentation='/** TODO TO COMMENT\052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nsimk.SMContext result = null;\n\n\tsimk.SMContext sMContext = null;\n//BIft:detect\n\nsimk.SMContext result_ft247 = null;\n\n\tsimk.SMContext elem_ft247 = null;\n\n\tresult_ft247 = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<simk.SMContext> it_ft247 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<simk.SMContext>convertAsOrderedSet(this.getSMContexts()).iterator();\n\tjava.lang.Boolean idLoopCond_1049 = false;\n\twhile( !idLoopCond_1049 ) {\n\tidLoopCond_1049 = kermeta.standard.helper.BooleanWrapper.or(it_ft247.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqual(result_ft247, null));\n\tif ( idLoopCond_1049 ) {\n\t} else {\n\n\telem_ft247 = it_ft247.next();\n\n\tjava.lang.Boolean idIfCond_1050 = false;\n//BIle:detector\nsimk.SMContext c_lbdExp247 = elem_ft247;\n\n\tidIfCond_1050 = kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.StringWrapper.equals(c_lbdExp247.getQualifiedNameFinalPackage(), finalPackage_qname), kermeta.standard.helper.StringWrapper.equals(c_lbdExp247.getSMClass().getName(), class_qname)), org.kermeta.compil.runtime.helper.language.ObjectUtil.equals(c_lbdExp247.getSMClass().getUsages(), usage));\n//EIle:detector\n\n\n\tif( idIfCond_1050 ) {\n\n\tresult_ft247 = elem_ft247;\n}\n\n}\n\t}\n}\n\n\n//CE\nsMContext = result_ft247;\n//EIft:detect\n\n\n\tjava.lang.Boolean idIfCond_1051 = false;\n\tidIfCond_1051 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoid(sMContext);\n\n\tif( idIfCond_1051 ) {\n\n\tsMContext = ((simk.SMContext) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"simk.SMContext\"));\n\n\tsMContext.setQualifiedNameFinalPackage(finalPackage_qname);\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<simk.SMContext>convertAsOrderedSet(this.getSMContexts()).add(sMContext);\n}\n\n\n\tresult = sMContext;\n\nreturn result;\n'"
	 * @generated
	 */
	SMContext retrieveOrCreateContext(String class_qname,
			String finalPackage_qname, SMUsage usage, KM2EcoreContext context);

} // SIMKModel
