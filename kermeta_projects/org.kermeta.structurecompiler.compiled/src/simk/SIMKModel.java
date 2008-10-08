/**
 * <copyright>
 * </copyright>
 *
 * $Id: SIMKModel.java,v 1.4 2008-10-08 14:37:58 cfaucher Exp $
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
 *   <li>{@link simk.SIMKModel#getSMMethods <em>SM Methods</em>}</li>
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
	 * Returns the value of the '<em><b>SM Methods</b></em>' containment reference list.
	 * The list contents are of type {@link simk.SMMethod}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SM Methods</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SM Methods</em>' containment reference list.
	 * @see simk.SimkPackage#getSIMKModel_SMMethods()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<SMMethod> getSMMethods();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/** TODO TO COMMENT\052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nsimk.SMContext result = null;\n\n\tresult = null;\n\n\tsimk.SMContext sMContext = this.retrieveOrCreateContextWithClass(kermeta.standard.helper.StringWrapper.plus(((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(org.kermeta.compil.runtime.helper.language.ObjectUtil.container(op), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ClassDefinition\"))).getName(), \"Super\"), kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.replace(((kermeta.language.structure.Package) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(org.kermeta.compil.runtime.helper.language.ObjectUtil.container(((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(org.kermeta.compil.runtime.helper.language.ObjectUtil.container(op), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ClassDefinition\")))), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Package\"))).qualifiedName(), context.getKERMETA_SEPARATOR(), context.getJAVA_SEPARATOR()), context.getJAVA_SEPARATOR()), \"helper\"), simk.SMUsage.getByName(\"Super\"), context);\n\n\tsimk.SMMethod sm = null;\n//BIft:detect\n\nsimk.SMMethod result_ft239 = null;\n\n\tsimk.SMMethod elem_ft239 = null;\n\n\tresult_ft239 = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<simk.SMMethod> it_ft239 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<simk.SMMethod>convertAsOrderedSet(sMContext.getSMMethods()).iterator();\n\tjava.lang.Boolean idLoopCond_1051 = false;\n\twhile( !idLoopCond_1051 ) {\n\tidLoopCond_1051 = kermeta.standard.helper.BooleanWrapper.or(it_ft239.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqual(result_ft239, null));\n\tif ( idLoopCond_1051 ) {\n\t} else {\n\n\telem_ft239 = it_ft239.next();\n\n\tjava.lang.Boolean idIfCond_1052 = false;\n//BIle:detector\nsimk.SMMethod o_lbdExp239 = elem_ft239;\n\n\tidIfCond_1052 = kermeta.standard.helper.StringWrapper.equals(o_lbdExp239.getName(), kermeta.standard.helper.StringWrapper.plus(\"super_\", ((km2ecore.helper.java.IdentifierHelper) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"km2ecore.helper.java.IdentifierHelper\")).getMangledIdentifier(op.getFinalName(), context)));\n//EIle:detector\n\n\n\tif( idIfCond_1052 ) {\n\n\tresult_ft239 = elem_ft239;\n}\n\n}\n\t}\n}\n\n\n//CE\nsm = result_ft239;\n//EIft:detect\n\n\n\tjava.lang.Boolean idIfCond_1053 = false;\n\tidIfCond_1053 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoid(sm);\n\n\tif( idIfCond_1053 ) {\n\n\tresult = sMContext;\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	SMContext retrieveOrCreateContextForSuper(Operation op,
			KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/** TODO TO COMMENT\052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nsimk.SMContext result = null;\n\n\tresult = null;\n\n\tsimk.SMContext sMContext = this.retrieveOrCreateContextWithClass(kermeta.standard.helper.StringWrapper.plus(context.getCurrent_valueType().getName(), \"Wrapper\"), \"kermeta.standard.helper\", simk.SMUsage.getByName(\"Wrapper\"), context);\n\n\tsimk.SMMethod sm = null;\n//BIft:detect\n\nsimk.SMMethod result_ft240 = null;\n\n\tsimk.SMMethod elem_ft240 = null;\n\n\tresult_ft240 = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<simk.SMMethod> it_ft240 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<simk.SMMethod>convertAsOrderedSet(sMContext.getSMMethods()).iterator();\n\tjava.lang.Boolean idLoopCond_1054 = false;\n\twhile( !idLoopCond_1054 ) {\n\tidLoopCond_1054 = kermeta.standard.helper.BooleanWrapper.or(it_ft240.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqual(result_ft240, null));\n\tif ( idLoopCond_1054 ) {\n\t} else {\n\n\telem_ft240 = it_ft240.next();\n\n\tjava.lang.Boolean idIfCond_1055 = false;\n//BIle:detector\nsimk.SMMethod o_lbdExp240 = elem_ft240;\n\n\tidIfCond_1055 = kermeta.standard.helper.StringWrapper.equals(o_lbdExp240.getName(), ((km2ecore.helper.java.IdentifierHelper) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"km2ecore.helper.java.IdentifierHelper\")).getMangledIdentifier(op.getFinalName(), context));\n//EIle:detector\n\n\n\tif( idIfCond_1055 ) {\n\n\tresult_ft240 = elem_ft240;\n}\n\n}\n\t}\n}\n\n\n//CE\nsm = result_ft240;\n//EIft:detect\n\n\n\tjava.lang.Boolean idIfCond_1056 = false;\n\tidIfCond_1056 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoid(sm);\n\n\tif( idIfCond_1056 ) {\n\n\tresult = sMContext;\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	SMContext retrieveOrCreateContextForWrapper(Operation op,
			KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/** TODO TO COMMENT\052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nsimk.SMContext result = null;\n\n\tresult = null;\n\n\tsimk.SMContext sMContext = this.retrieveOrCreateContextWithClass(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(org.kermeta.compil.runtime.helper.language.ObjectUtil.container(op), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ClassDefinition\"))).getName(), \"__\"), ((km2ecore.helper.java.IdentifierHelper) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"km2ecore.helper.java.IdentifierHelper\")).getMangledIdentifier(op.getFinalName(), context)), \"__\"), \"Runner\"), kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.replace(((kermeta.language.structure.Package) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(org.kermeta.compil.runtime.helper.language.ObjectUtil.container(((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(org.kermeta.compil.runtime.helper.language.ObjectUtil.container(op), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ClassDefinition\")))), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Package\"))).qualifiedName(), context.getKERMETA_SEPARATOR(), context.getJAVA_SEPARATOR()), context.getJAVA_SEPARATOR()), \"runner\"), simk.SMUsage.getByName(\"Runner\"), context);\n\n\tsimk.SMMethod sm = null;\n//BIft:detect\n\nsimk.SMMethod result_ft241 = null;\n\n\tsimk.SMMethod elem_ft241 = null;\n\n\tresult_ft241 = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<simk.SMMethod> it_ft241 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<simk.SMMethod>convertAsOrderedSet(sMContext.getSMMethods()).iterator();\n\tjava.lang.Boolean idLoopCond_1057 = false;\n\twhile( !idLoopCond_1057 ) {\n\tidLoopCond_1057 = kermeta.standard.helper.BooleanWrapper.or(it_ft241.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqual(result_ft241, null));\n\tif ( idLoopCond_1057 ) {\n\t} else {\n\n\telem_ft241 = it_ft241.next();\n\n\tjava.lang.Boolean idIfCond_1058 = false;\n//BIle:detector\nsimk.SMMethod o_lbdExp241 = elem_ft241;\n\n\tidIfCond_1058 = kermeta.standard.helper.StringWrapper.equals(o_lbdExp241.getName(), \"main\");\n//EIle:detector\n\n\n\tif( idIfCond_1058 ) {\n\n\tresult_ft241 = elem_ft241;\n}\n\n}\n\t}\n}\n\n\n//CE\nsm = result_ft241;\n//EIft:detect\n\n\n\tjava.lang.Boolean idIfCond_1059 = false;\n\tidIfCond_1059 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoid(sm);\n\n\tif( idIfCond_1059 ) {\n\n\tresult = sMContext;\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	SMContext retrieveOrCreateContextForRunner(Operation op,
			KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model class_qnameDataType="kermeta.standard.JavaString" finalPackage_qnameDataType="kermeta.standard.JavaString"
	 *        annotation="kermeta documentation='/** TODO TO COMMENT\052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nsimk.SMContext result = null;\n\n\tsimk.SMContext sMContext = this.retrieveOrCreateContext(class_qname, finalPackage_qname, usage, context);\n\n\tjava.lang.Boolean idIfCond_1060 = false;\n\tidIfCond_1060 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoid(sMContext.getSMClass());\n\n\tif( idIfCond_1060 ) {\n\n\tsimk.SMClass sMClass = ((simk.SMClass) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"simk.SMClass\"));\n\n\tsMContext.setSMClass(sMClass);\n\n\tsMClass.setName(class_qname);\n\n\tsMClass.setUsages(usage);\n}\n\n\n\tresult = sMContext;\n\nreturn result;\n'"
	 * @generated
	 */
	SMContext retrieveOrCreateContextWithClass(String class_qname,
			String finalPackage_qname, SMUsage usage, KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model class_qnameDataType="kermeta.standard.JavaString" finalPackage_qnameDataType="kermeta.standard.JavaString"
	 *        annotation="kermeta documentation='/** TODO TO COMMENT\052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nsimk.SMContext result = null;\n\n\tsimk.SMContext sMContext = null;\n//BIft:detect\n\nsimk.SMContext result_ft242 = null;\n\n\tsimk.SMContext elem_ft242 = null;\n\n\tresult_ft242 = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<simk.SMContext> it_ft242 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<simk.SMContext>convertAsOrderedSet(this.getSMContexts()).iterator();\n\tjava.lang.Boolean idLoopCond_1061 = false;\n\twhile( !idLoopCond_1061 ) {\n\tidLoopCond_1061 = kermeta.standard.helper.BooleanWrapper.or(it_ft242.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqual(result_ft242, null));\n\tif ( idLoopCond_1061 ) {\n\t} else {\n\n\telem_ft242 = it_ft242.next();\n\n\tjava.lang.Boolean idIfCond_1062 = false;\n//BIle:detector\nsimk.SMContext c_lbdExp242 = elem_ft242;\n\n\tidIfCond_1062 = kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.StringWrapper.equals(c_lbdExp242.getFinalPackageQName(), finalPackage_qname), kermeta.standard.helper.StringWrapper.equals(c_lbdExp242.getSMClass().getName(), class_qname)), org.kermeta.compil.runtime.helper.language.ObjectUtil.equals(c_lbdExp242.getSMClass().getUsages(), usage));\n//EIle:detector\n\n\n\tif( idIfCond_1062 ) {\n\n\tresult_ft242 = elem_ft242;\n}\n\n}\n\t}\n}\n\n\n//CE\nsMContext = result_ft242;\n//EIft:detect\n\n\n\tjava.lang.Boolean idIfCond_1063 = false;\n\tidIfCond_1063 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoid(sMContext);\n\n\tif( idIfCond_1063 ) {\n\n\tsMContext = ((simk.SMContext) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"simk.SMContext\"));\n\n\tsMContext.setFinalPackageQName(finalPackage_qname);\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<simk.SMContext>convertAsOrderedSet(this.getSMContexts()).add(sMContext);\n}\n\n\n\tresult = sMContext;\n\nreturn result;\n'"
	 * @generated
	 */
	SMContext retrieveOrCreateContext(String class_qname,
			String finalPackage_qname, SMUsage usage, KM2EcoreContext context);

} // SIMKModel
