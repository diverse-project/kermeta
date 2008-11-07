/**
 * <copyright>
 * </copyright>
 *
 * $Id: SIMKModel.java,v 1.8 2008-11-07 08:54:03 cfaucher Exp $
 */
package simk;

import kermeta.language.structure.Constraint;
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nsimk.SMContext result = null;\n\n\tresult = null;\n\n\tsimk.SMContext sMContext = this.retrieveOrCreateContextWithClass(kermeta.standard.helper.StringWrapper.plus(((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(op), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ClassDefinition\"))).getName(), \"Super\"), kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.replace(((kermeta.language.structure.Package) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(op), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ClassDefinition\")))), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Package\"))).qualifiedName(), context.getKERMETA_SEPARATOR(), context.getJAVA_SEPARATOR()), context.getJAVA_SEPARATOR()), \"helper\"), simk.SMUsage.getByName(\"Super\"), context);\n\n\tsimk.SMMethod sm = null;\n//BIft:detect\n\nsimk.SMMethod result_ft247 = null;\n\n\tsimk.SMMethod elem_ft247 = null;\n\n\tresult_ft247 = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<simk.SMMethod> it_ft247 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<simk.SMMethod>convertAsOrderedSet(sMContext.getSMMethods()).iterator();\n\tjava.lang.Boolean idLoopCond_1093 = false;\n\twhile( !idLoopCond_1093 ) {\n\tidLoopCond_1093 = kermeta.standard.helper.BooleanWrapper.or(it_ft247.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(result_ft247, null));\n\tif ( idLoopCond_1093 ) {\n\t} else {\n\n\telem_ft247 = it_ft247.next();\n\n\tjava.lang.Boolean idIfCond_1094 = false;\n//BIle:detector\nsimk.SMMethod o_lbdExp247 = elem_ft247;\n\n\tidIfCond_1094 = kermeta.standard.helper.StringWrapper.equals(o_lbdExp247.getName(), kermeta.standard.helper.StringWrapper.plus(\"super_\", op.getFinalName(context)));\n//EIle:detector\n\n\n\tif( idIfCond_1094 ) {\n\n\tresult_ft247 = elem_ft247;\n}\n\n}\n\t}\n}\n\n\n//CE\nsm = result_ft247;\n//EIft:detect\n\n\n\tjava.lang.Boolean idIfCond_1095 = false;\n\tidIfCond_1095 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(sm);\n\n\tif( idIfCond_1095 ) {\n\n\tresult = sMContext;\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	SMContext retrieveOrCreateContextForSuper(Operation op,
			KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/** TODO TO COMMENT\052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nsimk.SMContext result = null;\n\n\tresult = null;\n\n\tsimk.SMContext sMContext = this.retrieveOrCreateContextWithClass(kermeta.standard.helper.StringWrapper.plus(((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(constraint), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ClassDefinition\"))).getName(), \"Invariant\"), kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.replace(((kermeta.language.structure.Package) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(constraint), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ClassDefinition\")))), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Package\"))).qualifiedName(), context.getKERMETA_SEPARATOR(), context.getJAVA_SEPARATOR()), context.getJAVA_SEPARATOR()), \"helper\"), simk.SMUsage.getByName(\"Invariant\"), context);\n\n\tsimk.SMMethod sm = null;\n//BIft:detect\n\nsimk.SMMethod result_ft248 = null;\n\n\tsimk.SMMethod elem_ft248 = null;\n\n\tresult_ft248 = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<simk.SMMethod> it_ft248 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<simk.SMMethod>convertAsOrderedSet(sMContext.getSMMethods()).iterator();\n\tjava.lang.Boolean idLoopCond_1096 = false;\n\twhile( !idLoopCond_1096 ) {\n\tidLoopCond_1096 = kermeta.standard.helper.BooleanWrapper.or(it_ft248.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(result_ft248, null));\n\tif ( idLoopCond_1096 ) {\n\t} else {\n\n\telem_ft248 = it_ft248.next();\n\n\tjava.lang.Boolean idIfCond_1097 = false;\n//BIle:detector\nsimk.SMMethod o_lbdExp248 = elem_ft248;\n\n\tidIfCond_1097 = kermeta.standard.helper.StringWrapper.equals(o_lbdExp248.getName(), kermeta.standard.helper.StringWrapper.plus(\"checkInvariant_\", constraint.getId()));\n//EIle:detector\n\n\n\tif( idIfCond_1097 ) {\n\n\tresult_ft248 = elem_ft248;\n}\n\n}\n\t}\n}\n\n\n//CE\nsm = result_ft248;\n//EIft:detect\n\n\n\tjava.lang.Boolean idIfCond_1098 = false;\n\tidIfCond_1098 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(sm);\n\n\tif( idIfCond_1098 ) {\n\n\tresult = sMContext;\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	SMContext retrieveOrCreateContextForInvariant(Constraint constraint,
			KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/** TODO TO COMMENT\052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nsimk.SMContext result = null;\n\n\tresult = null;\n\n\tsimk.SMContext sMContext = this.retrieveOrCreateContextWithClass(kermeta.standard.helper.StringWrapper.plus(context.getCurrent_valueType().getName(), \"Wrapper\"), \"kermeta.standard.helper\", simk.SMUsage.getByName(\"Wrapper\"), context);\n\n\tsimk.SMMethod sm = null;\n//BIft:detect\n\nsimk.SMMethod result_ft249 = null;\n\n\tsimk.SMMethod elem_ft249 = null;\n\n\tresult_ft249 = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<simk.SMMethod> it_ft249 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<simk.SMMethod>convertAsOrderedSet(sMContext.getSMMethods()).iterator();\n\tjava.lang.Boolean idLoopCond_1099 = false;\n\twhile( !idLoopCond_1099 ) {\n\tidLoopCond_1099 = kermeta.standard.helper.BooleanWrapper.or(it_ft249.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(result_ft249, null));\n\tif ( idLoopCond_1099 ) {\n\t} else {\n\n\telem_ft249 = it_ft249.next();\n\n\tjava.lang.Boolean idIfCond_1100 = false;\n//BIle:detector\nsimk.SMMethod o_lbdExp249 = elem_ft249;\n\n\tidIfCond_1100 = kermeta.standard.helper.StringWrapper.equals(o_lbdExp249.getName(), op.getFinalName(context));\n//EIle:detector\n\n\n\tif( idIfCond_1100 ) {\n\n\tresult_ft249 = elem_ft249;\n}\n\n}\n\t}\n}\n\n\n//CE\nsm = result_ft249;\n//EIft:detect\n\n\n\tjava.lang.Boolean idIfCond_1101 = false;\n\tidIfCond_1101 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(sm);\n\n\tif( idIfCond_1101 ) {\n\n\tresult = sMContext;\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	SMContext retrieveOrCreateContextForWrapper(Operation op,
			KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/** TODO TO COMMENT\052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nsimk.SMContext result = null;\n\n\tresult = null;\n\n\tsimk.SMContext sMContext = this.retrieveOrCreateContextWithClass(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(op), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ClassDefinition\"))).getName(), \"__\"), op.getFinalName(context)), \"__\"), \"Runner\"), kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.replace(((kermeta.language.structure.Package) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(op), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ClassDefinition\")))), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Package\"))).qualifiedName(), context.getKERMETA_SEPARATOR(), context.getJAVA_SEPARATOR()), context.getJAVA_SEPARATOR()), \"runner\"), simk.SMUsage.getByName(\"Runner\"), context);\n\n\tsimk.SMMethod sm = null;\n//BIft:detect\n\nsimk.SMMethod result_ft250 = null;\n\n\tsimk.SMMethod elem_ft250 = null;\n\n\tresult_ft250 = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<simk.SMMethod> it_ft250 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<simk.SMMethod>convertAsOrderedSet(sMContext.getSMMethods()).iterator();\n\tjava.lang.Boolean idLoopCond_1102 = false;\n\twhile( !idLoopCond_1102 ) {\n\tidLoopCond_1102 = kermeta.standard.helper.BooleanWrapper.or(it_ft250.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(result_ft250, null));\n\tif ( idLoopCond_1102 ) {\n\t} else {\n\n\telem_ft250 = it_ft250.next();\n\n\tjava.lang.Boolean idIfCond_1103 = false;\n//BIle:detector\nsimk.SMMethod o_lbdExp250 = elem_ft250;\n\n\tidIfCond_1103 = kermeta.standard.helper.StringWrapper.equals(o_lbdExp250.getName(), \"main\");\n//EIle:detector\n\n\n\tif( idIfCond_1103 ) {\n\n\tresult_ft250 = elem_ft250;\n}\n\n}\n\t}\n}\n\n\n//CE\nsm = result_ft250;\n//EIft:detect\n\n\n\tjava.lang.Boolean idIfCond_1104 = false;\n\tidIfCond_1104 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(sm);\n\n\tif( idIfCond_1104 ) {\n\n\tresult = sMContext;\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	SMContext retrieveOrCreateContextForRunner(Operation op,
			KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model class_qnameDataType="kermeta.standard.JavaString" finalPackage_qnameDataType="kermeta.standard.JavaString"
	 *        annotation="kermeta documentation='/** TODO TO COMMENT\052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nsimk.SMContext result = null;\n\n\tsimk.SMContext sMContext = this.retrieveOrCreateContext(class_qname, finalPackage_qname, usage, context);\n\n\tjava.lang.Boolean idIfCond_1105 = false;\n\tidIfCond_1105 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(sMContext.getSMClass());\n\n\tif( idIfCond_1105 ) {\n\n\tsimk.SMClass sMClass = ((simk.SMClass) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"simk.SMClass\"));\n\n\tsMContext.setSMClass(sMClass);\n\n\tsMClass.setName(class_qname);\n\n\tsMClass.setUsages(usage);\n}\n\n\n\tresult = sMContext;\n\nreturn result;\n'"
	 * @generated
	 */
	SMContext retrieveOrCreateContextWithClass(String class_qname,
			String finalPackage_qname, SMUsage usage, KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model class_qnameDataType="kermeta.standard.JavaString" finalPackage_qnameDataType="kermeta.standard.JavaString"
	 *        annotation="kermeta documentation='/** TODO TO COMMENT\052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nsimk.SMContext result = null;\n\n\tsimk.SMContext sMContext = null;\n//BIft:detect\n\nsimk.SMContext result_ft251 = null;\n\n\tsimk.SMContext elem_ft251 = null;\n\n\tresult_ft251 = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<simk.SMContext> it_ft251 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<simk.SMContext>convertAsOrderedSet(this.getSMContexts()).iterator();\n\tjava.lang.Boolean idLoopCond_1106 = false;\n\twhile( !idLoopCond_1106 ) {\n\tidLoopCond_1106 = kermeta.standard.helper.BooleanWrapper.or(it_ft251.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(result_ft251, null));\n\tif ( idLoopCond_1106 ) {\n\t} else {\n\n\telem_ft251 = it_ft251.next();\n\n\tjava.lang.Boolean idIfCond_1107 = false;\n//BIle:detector\nsimk.SMContext c_lbdExp251 = elem_ft251;\n\n\tidIfCond_1107 = kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.StringWrapper.equals(c_lbdExp251.getFinalPackageQName(), finalPackage_qname), kermeta.standard.helper.StringWrapper.equals(c_lbdExp251.getSMClass().getName(), class_qname)), org.kermeta.compil.runtime.helper.language.ObjectUtil.equalsSwitcher(c_lbdExp251.getSMClass().getUsages(), usage));\n//EIle:detector\n\n\n\tif( idIfCond_1107 ) {\n\n\tresult_ft251 = elem_ft251;\n}\n\n}\n\t}\n}\n\n\n//CE\nsMContext = result_ft251;\n//EIft:detect\n\n\n\tjava.lang.Boolean idIfCond_1108 = false;\n\tidIfCond_1108 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(sMContext);\n\n\tif( idIfCond_1108 ) {\n\n\tsMContext = ((simk.SMContext) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"simk.SMContext\"));\n\n\tsMContext.setFinalPackageQName(finalPackage_qname);\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<simk.SMContext>convertAsOrderedSet(this.getSMContexts()).add(sMContext);\n}\n\n\n\tresult = sMContext;\n\nreturn result;\n'"
	 * @generated
	 */
	SMContext retrieveOrCreateContext(String class_qname,
			String finalPackage_qname, SMUsage usage, KM2EcoreContext context);

} // SIMKModel
