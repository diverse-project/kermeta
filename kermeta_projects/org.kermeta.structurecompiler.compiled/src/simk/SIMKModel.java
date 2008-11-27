/**
 * <copyright>
 * </copyright>
 *
 * $Id: SIMKModel.java,v 1.9 2008-11-27 15:50:13 cfaucher Exp $
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nsimk.SMContext result = null;\n\n\tresult = null;\n\n\tsimk.SMContext sMContext = this.retrieveOrCreateContextWithClass(kermeta.standard.helper.StringWrapper.plus(((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(op), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ClassDefinition\"))).getName(), \"Super\"), kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.replace(((kermeta.language.structure.Package) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(op), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ClassDefinition\")))), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Package\"))).qualifiedName(), context.getKERMETA_SEPARATOR(), context.getJAVA_SEPARATOR()), context.getJAVA_SEPARATOR()), \"helper\"), simk.SMUsage.getByName(\"Super\"), context);\n\n\tsimk.SMMethod sm = null;\n//BIft:detect\n\nsimk.SMMethod result_ft251 = null;\n\n\tsimk.SMMethod elem_ft251 = null;\n\n\tresult_ft251 = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<simk.SMMethod> it_ft251 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<simk.SMMethod>convertAsOrderedSet(sMContext.getSMMethods()).iterator();\n\tjava.lang.Boolean idLoopCond_1105 = false;\n\twhile( !idLoopCond_1105 ) {\n\tidLoopCond_1105 = kermeta.standard.helper.BooleanWrapper.or(it_ft251.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(result_ft251, null));\n\tif ( idLoopCond_1105 ) {\n\t} else {\n\n\telem_ft251 = it_ft251.next();\n\n\tjava.lang.Boolean idIfCond_1106 = false;\n//BIle:detector\nsimk.SMMethod o_lbdExp251 = elem_ft251;\n\n\tidIfCond_1106 = kermeta.standard.helper.StringWrapper.equals(o_lbdExp251.getName(), kermeta.standard.helper.StringWrapper.plus(\"super_\", op.getFinalName(context)));\n//EIle:detector\n\n\n\tif( idIfCond_1106 ) {\n\n\tresult_ft251 = elem_ft251;\n}\n\n}\n\t}\n}\n\n\n//CE\nsm = result_ft251;\n//EIft:detect\n\n\n\tjava.lang.Boolean idIfCond_1107 = false;\n\tidIfCond_1107 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(sm);\n\n\tif( idIfCond_1107 ) {\n\n\tresult = sMContext;\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	SMContext retrieveOrCreateContextForSuper(Operation op,
			KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/** TODO TO COMMENT\052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nsimk.SMContext result = null;\n\n\tresult = null;\n\n\tsimk.SMContext sMContext = this.retrieveOrCreateContextWithClass(kermeta.standard.helper.StringWrapper.plus(((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(constraint), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ClassDefinition\"))).getName(), \"Invariant\"), kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.replace(((kermeta.language.structure.Package) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(constraint), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ClassDefinition\")))), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Package\"))).qualifiedName(), context.getKERMETA_SEPARATOR(), context.getJAVA_SEPARATOR()), context.getJAVA_SEPARATOR()), \"helper\"), simk.SMUsage.getByName(\"Invariant\"), context);\n\n\tsimk.SMMethod sm = null;\n//BIft:detect\n\nsimk.SMMethod result_ft252 = null;\n\n\tsimk.SMMethod elem_ft252 = null;\n\n\tresult_ft252 = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<simk.SMMethod> it_ft252 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<simk.SMMethod>convertAsOrderedSet(sMContext.getSMMethods()).iterator();\n\tjava.lang.Boolean idLoopCond_1108 = false;\n\twhile( !idLoopCond_1108 ) {\n\tidLoopCond_1108 = kermeta.standard.helper.BooleanWrapper.or(it_ft252.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(result_ft252, null));\n\tif ( idLoopCond_1108 ) {\n\t} else {\n\n\telem_ft252 = it_ft252.next();\n\n\tjava.lang.Boolean idIfCond_1109 = false;\n//BIle:detector\nsimk.SMMethod o_lbdExp252 = elem_ft252;\n\n\tidIfCond_1109 = kermeta.standard.helper.StringWrapper.equals(o_lbdExp252.getName(), kermeta.standard.helper.StringWrapper.plus(\"checkInvariant_\", constraint.getId()));\n//EIle:detector\n\n\n\tif( idIfCond_1109 ) {\n\n\tresult_ft252 = elem_ft252;\n}\n\n}\n\t}\n}\n\n\n//CE\nsm = result_ft252;\n//EIft:detect\n\n\n\tjava.lang.Boolean idIfCond_1110 = false;\n\tidIfCond_1110 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(sm);\n\n\tif( idIfCond_1110 ) {\n\n\tresult = sMContext;\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	SMContext retrieveOrCreateContextForInvariant(Constraint constraint,
			KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/** TODO TO COMMENT\052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nsimk.SMContext result = null;\n\n\tresult = null;\n\n\tsimk.SMContext sMContext = this.retrieveOrCreateContextWithClass(kermeta.standard.helper.StringWrapper.plus(context.getCurrent_valueType().getName(), \"Wrapper\"), \"kermeta.standard.helper\", simk.SMUsage.getByName(\"Wrapper\"), context);\n\n\tsimk.SMMethod sm = null;\n//BIft:detect\n\nsimk.SMMethod result_ft253 = null;\n\n\tsimk.SMMethod elem_ft253 = null;\n\n\tresult_ft253 = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<simk.SMMethod> it_ft253 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<simk.SMMethod>convertAsOrderedSet(sMContext.getSMMethods()).iterator();\n\tjava.lang.Boolean idLoopCond_1111 = false;\n\twhile( !idLoopCond_1111 ) {\n\tidLoopCond_1111 = kermeta.standard.helper.BooleanWrapper.or(it_ft253.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(result_ft253, null));\n\tif ( idLoopCond_1111 ) {\n\t} else {\n\n\telem_ft253 = it_ft253.next();\n\n\tjava.lang.Boolean idIfCond_1112 = false;\n//BIle:detector\nsimk.SMMethod o_lbdExp253 = elem_ft253;\n\n\tidIfCond_1112 = kermeta.standard.helper.StringWrapper.equals(o_lbdExp253.getName(), op.getFinalName(context));\n//EIle:detector\n\n\n\tif( idIfCond_1112 ) {\n\n\tresult_ft253 = elem_ft253;\n}\n\n}\n\t}\n}\n\n\n//CE\nsm = result_ft253;\n//EIft:detect\n\n\n\tjava.lang.Boolean idIfCond_1113 = false;\n\tidIfCond_1113 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(sm);\n\n\tif( idIfCond_1113 ) {\n\n\tresult = sMContext;\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	SMContext retrieveOrCreateContextForWrapper(Operation op,
			KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/** TODO TO COMMENT\052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nsimk.SMContext result = null;\n\n\tresult = null;\n\n\tsimk.SMContext sMContext = this.retrieveOrCreateContextWithClass(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(op), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ClassDefinition\"))).getName(), \"__\"), op.getFinalName(context)), \"__\"), \"Runner\"), kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.replace(((kermeta.language.structure.Package) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(op), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ClassDefinition\")))), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Package\"))).qualifiedName(), context.getKERMETA_SEPARATOR(), context.getJAVA_SEPARATOR()), context.getJAVA_SEPARATOR()), \"runner\"), simk.SMUsage.getByName(\"Runner\"), context);\n\n\tsimk.SMMethod sm = null;\n//BIft:detect\n\nsimk.SMMethod result_ft254 = null;\n\n\tsimk.SMMethod elem_ft254 = null;\n\n\tresult_ft254 = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<simk.SMMethod> it_ft254 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<simk.SMMethod>convertAsOrderedSet(sMContext.getSMMethods()).iterator();\n\tjava.lang.Boolean idLoopCond_1114 = false;\n\twhile( !idLoopCond_1114 ) {\n\tidLoopCond_1114 = kermeta.standard.helper.BooleanWrapper.or(it_ft254.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(result_ft254, null));\n\tif ( idLoopCond_1114 ) {\n\t} else {\n\n\telem_ft254 = it_ft254.next();\n\n\tjava.lang.Boolean idIfCond_1115 = false;\n//BIle:detector\nsimk.SMMethod o_lbdExp254 = elem_ft254;\n\n\tidIfCond_1115 = kermeta.standard.helper.StringWrapper.equals(o_lbdExp254.getName(), \"main\");\n//EIle:detector\n\n\n\tif( idIfCond_1115 ) {\n\n\tresult_ft254 = elem_ft254;\n}\n\n}\n\t}\n}\n\n\n//CE\nsm = result_ft254;\n//EIft:detect\n\n\n\tjava.lang.Boolean idIfCond_1116 = false;\n\tidIfCond_1116 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(sm);\n\n\tif( idIfCond_1116 ) {\n\n\tresult = sMContext;\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	SMContext retrieveOrCreateContextForRunner(Operation op,
			KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model class_qnameDataType="kermeta.standard.JavaString" finalPackage_qnameDataType="kermeta.standard.JavaString"
	 *        annotation="kermeta documentation='/** TODO TO COMMENT\052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nsimk.SMContext result = null;\n\n\tsimk.SMContext sMContext = this.retrieveOrCreateContext(class_qname, finalPackage_qname, usage, context);\n\n\tjava.lang.Boolean idIfCond_1117 = false;\n\tidIfCond_1117 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(sMContext.getSMClass());\n\n\tif( idIfCond_1117 ) {\n\n\tsimk.SMClass sMClass = ((simk.SMClass) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"simk.SMClass\"));\n\n\tsMContext.setSMClass(sMClass);\n\n\tsMClass.setName(class_qname);\n\n\tsMClass.setUsages(usage);\n}\n\n\n\tresult = sMContext;\n\nreturn result;\n'"
	 * @generated
	 */
	SMContext retrieveOrCreateContextWithClass(String class_qname,
			String finalPackage_qname, SMUsage usage, KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model class_qnameDataType="kermeta.standard.JavaString" finalPackage_qnameDataType="kermeta.standard.JavaString"
	 *        annotation="kermeta documentation='/** TODO TO COMMENT\052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nsimk.SMContext result = null;\n\n\tsimk.SMContext sMContext = null;\n//BIft:detect\n\nsimk.SMContext result_ft255 = null;\n\n\tsimk.SMContext elem_ft255 = null;\n\n\tresult_ft255 = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<simk.SMContext> it_ft255 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<simk.SMContext>convertAsOrderedSet(this.getSMContexts()).iterator();\n\tjava.lang.Boolean idLoopCond_1118 = false;\n\twhile( !idLoopCond_1118 ) {\n\tidLoopCond_1118 = kermeta.standard.helper.BooleanWrapper.or(it_ft255.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(result_ft255, null));\n\tif ( idLoopCond_1118 ) {\n\t} else {\n\n\telem_ft255 = it_ft255.next();\n\n\tjava.lang.Boolean idIfCond_1119 = false;\n//BIle:detector\nsimk.SMContext c_lbdExp255 = elem_ft255;\n\n\tidIfCond_1119 = kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.StringWrapper.equals(c_lbdExp255.getFinalPackageQName(), finalPackage_qname), kermeta.standard.helper.StringWrapper.equals(c_lbdExp255.getSMClass().getName(), class_qname)), org.kermeta.compil.runtime.helper.language.ObjectUtil.equalsSwitcher(c_lbdExp255.getSMClass().getUsages(), usage));\n//EIle:detector\n\n\n\tif( idIfCond_1119 ) {\n\n\tresult_ft255 = elem_ft255;\n}\n\n}\n\t}\n}\n\n\n//CE\nsMContext = result_ft255;\n//EIft:detect\n\n\n\tjava.lang.Boolean idIfCond_1120 = false;\n\tidIfCond_1120 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(sMContext);\n\n\tif( idIfCond_1120 ) {\n\n\tsMContext = ((simk.SMContext) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"simk.SMContext\"));\n\n\tsMContext.setFinalPackageQName(finalPackage_qname);\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<simk.SMContext>convertAsOrderedSet(this.getSMContexts()).add(sMContext);\n}\n\n\n\tresult = sMContext;\n\nreturn result;\n'"
	 * @generated
	 */
	SMContext retrieveOrCreateContext(String class_qname,
			String finalPackage_qname, SMUsage usage, KM2EcoreContext context);

} // SIMKModel
