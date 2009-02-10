/**
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * 
 * Generating with Kermeta <http://www.kermeta.org>
 *
 * $Id: SIMKModel.java,v 1.11 2009-02-10 17:51:59 cfaucher Exp $
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nsimk.SMContext result = null;\n\n\tresult = null;\n\n\tsimk.SMContext sMContext = this.retrieveOrCreateContextWithClass(kermeta.standard.helper.StringWrapper.plus(op.getOwningClass().getName(), \"Super\"), kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.replace(((kermeta.language.structure.Package) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(op.getOwningClass()), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Package\"))).qualifiedName(), context.getKERMETA_SEPARATOR(), context.getJAVA_SEPARATOR()), context.getJAVA_SEPARATOR()), \"helper\"), simk.SMUsage.getByName(\"Super\"), context);\n\n\tsimk.SMMethod sm = null;\n//BIft:detect\n\nsimk.SMMethod result_ft259 = null;\n\n\tsimk.SMMethod elem_ft259 = null;\n\n\tresult_ft259 = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<simk.SMMethod> it_ft259 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<simk.SMMethod>convertAsOrderedSet(sMContext.getSMMethods()).iterator();\n\tjava.lang.Boolean idLoopCond_1145 = false;\n\twhile( !idLoopCond_1145 ) {\n\tidLoopCond_1145 = kermeta.standard.helper.BooleanWrapper.or(it_ft259.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(result_ft259, null));\n\tif ( idLoopCond_1145 ) {\n\t} else {\n\n\telem_ft259 = it_ft259.next();\n\n\tjava.lang.Boolean idIfCond_1146 = false;\n//BIle:detector\nsimk.SMMethod o_lbdExp259 = elem_ft259;\n\n\tidIfCond_1146 = kermeta.standard.helper.StringWrapper.equals(o_lbdExp259.getName(), kermeta.standard.helper.StringWrapper.plus(\"super_\", op.getFinalName(context)));\n//EIle:detector\n\n\n\tif( idIfCond_1146 ) {\n\n\tresult_ft259 = elem_ft259;\n}\n\n}\n\t}\n}\n\n\n//CE\nsm = result_ft259;\n//EIft:detect\n;\n\n\tjava.lang.Boolean idIfCond_1147 = false;\n\tidIfCond_1147 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(sm);\n\n\tif( idIfCond_1147 ) {\n\n\tresult = sMContext;\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	SMContext retrieveOrCreateContextForSuper(Operation op,
			KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/** TODO TO COMMENT\052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nsimk.SMContext result = null;\n\n\tresult = null;\n\n\tsimk.SMContext sMContext = this.retrieveOrCreateContextWithClass(kermeta.standard.helper.StringWrapper.plus(context.getCurrent_valueType().getName(), \"Wrapper\"), \"kermeta.standard.helper\", simk.SMUsage.getByName(\"Wrapper\"), context);\n\n\tsimk.SMMethod sm = null;\n//BIft:detect\n\nsimk.SMMethod result_ft260 = null;\n\n\tsimk.SMMethod elem_ft260 = null;\n\n\tresult_ft260 = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<simk.SMMethod> it_ft260 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<simk.SMMethod>convertAsOrderedSet(sMContext.getSMMethods()).iterator();\n\tjava.lang.Boolean idLoopCond_1148 = false;\n\twhile( !idLoopCond_1148 ) {\n\tidLoopCond_1148 = kermeta.standard.helper.BooleanWrapper.or(it_ft260.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(result_ft260, null));\n\tif ( idLoopCond_1148 ) {\n\t} else {\n\n\telem_ft260 = it_ft260.next();\n\n\tjava.lang.Boolean idIfCond_1149 = false;\n//BIle:detector\nsimk.SMMethod o_lbdExp260 = elem_ft260;\n\n\tidIfCond_1149 = kermeta.standard.helper.StringWrapper.equals(o_lbdExp260.getName(), op.getFinalName(context));\n//EIle:detector\n\n\n\tif( idIfCond_1149 ) {\n\n\tresult_ft260 = elem_ft260;\n}\n\n}\n\t}\n}\n\n\n//CE\nsm = result_ft260;\n//EIft:detect\n;\n\n\tjava.lang.Boolean idIfCond_1150 = false;\n\tidIfCond_1150 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(sm);\n\n\tif( idIfCond_1150 ) {\n\n\tresult = sMContext;\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	SMContext retrieveOrCreateContextForWrapper(Operation op,
			KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/** TODO TO COMMENT\052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nsimk.SMContext result = null;\n\n\tresult = null;\n\n\tsimk.SMContext sMContext = this.retrieveOrCreateContextWithClass(kermeta.standard.helper.StringWrapper.plus(((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(constraint), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ClassDefinition\"))).getName(), \"Invariant\"), kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.replace(((kermeta.language.structure.Package) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(constraint), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ClassDefinition\")))), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Package\"))).qualifiedName(), context.getKERMETA_SEPARATOR(), context.getJAVA_SEPARATOR()), context.getJAVA_SEPARATOR()), \"helper\"), simk.SMUsage.getByName(\"Invariant\"), context);\n\n\tsimk.SMMethod sm = null;\n//BIft:detect\n\nsimk.SMMethod result_ft261 = null;\n\n\tsimk.SMMethod elem_ft261 = null;\n\n\tresult_ft261 = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<simk.SMMethod> it_ft261 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<simk.SMMethod>convertAsOrderedSet(sMContext.getSMMethods()).iterator();\n\tjava.lang.Boolean idLoopCond_1151 = false;\n\twhile( !idLoopCond_1151 ) {\n\tidLoopCond_1151 = kermeta.standard.helper.BooleanWrapper.or(it_ft261.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(result_ft261, null));\n\tif ( idLoopCond_1151 ) {\n\t} else {\n\n\telem_ft261 = it_ft261.next();\n\n\tjava.lang.Boolean idIfCond_1152 = false;\n//BIle:detector\nsimk.SMMethod o_lbdExp261 = elem_ft261;\n\n\tidIfCond_1152 = kermeta.standard.helper.StringWrapper.equals(o_lbdExp261.getName(), kermeta.standard.helper.StringWrapper.plus(\"checkInvariant_\", constraint.getId()));\n//EIle:detector\n\n\n\tif( idIfCond_1152 ) {\n\n\tresult_ft261 = elem_ft261;\n}\n\n}\n\t}\n}\n\n\n//CE\nsm = result_ft261;\n//EIft:detect\n;\n\n\tjava.lang.Boolean idIfCond_1153 = false;\n\tidIfCond_1153 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(sm);\n\n\tif( idIfCond_1153 ) {\n\n\tresult = sMContext;\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	SMContext retrieveOrCreateContextForInvariant(Constraint constraint,
			KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/** TODO TO COMMENT\052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nsimk.SMContext result = null;\n\n\tresult = null;\n\n\tsimk.SMContext sMContext = this.retrieveOrCreateContextWithClass(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(op.getOwningClass().getName(), \"__\"), op.getFinalName(context)), \"__\"), \"Runner\"), kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.replace(((kermeta.language.structure.Package) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(op.getOwningClass()), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Package\"))).qualifiedName(), context.getKERMETA_SEPARATOR(), context.getJAVA_SEPARATOR()), context.getJAVA_SEPARATOR()), \"runner\"), simk.SMUsage.getByName(\"Runner\"), context);\n\n\tsimk.SMMethod sm = null;\n//BIft:detect\n\nsimk.SMMethod result_ft262 = null;\n\n\tsimk.SMMethod elem_ft262 = null;\n\n\tresult_ft262 = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<simk.SMMethod> it_ft262 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<simk.SMMethod>convertAsOrderedSet(sMContext.getSMMethods()).iterator();\n\tjava.lang.Boolean idLoopCond_1154 = false;\n\twhile( !idLoopCond_1154 ) {\n\tidLoopCond_1154 = kermeta.standard.helper.BooleanWrapper.or(it_ft262.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(result_ft262, null));\n\tif ( idLoopCond_1154 ) {\n\t} else {\n\n\telem_ft262 = it_ft262.next();\n\n\tjava.lang.Boolean idIfCond_1155 = false;\n//BIle:detector\nsimk.SMMethod o_lbdExp262 = elem_ft262;\n\n\tidIfCond_1155 = kermeta.standard.helper.StringWrapper.equals(o_lbdExp262.getName(), \"main\");\n//EIle:detector\n\n\n\tif( idIfCond_1155 ) {\n\n\tresult_ft262 = elem_ft262;\n}\n\n}\n\t}\n}\n\n\n//CE\nsm = result_ft262;\n//EIft:detect\n;\n\n\tjava.lang.Boolean idIfCond_1156 = false;\n\tidIfCond_1156 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(sm);\n\n\tif( idIfCond_1156 ) {\n\n\tresult = sMContext;\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	SMContext retrieveOrCreateContextForRunner(Operation op,
			KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model class_qnameDataType="kermeta.standard.JavaString" finalPackage_qnameDataType="kermeta.standard.JavaString"
	 *        annotation="kermeta documentation='/** TODO TO COMMENT\052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nsimk.SMContext result = null;\n\n\tsimk.SMContext sMContext = this.retrieveOrCreateContext(class_qname, finalPackage_qname, usage, context);\n\n\tjava.lang.Boolean idIfCond_1157 = false;\n\tidIfCond_1157 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(sMContext.getSMClass());\n\n\tif( idIfCond_1157 ) {\n\n\tsimk.SMClass sMClass = ((simk.SMClass) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(simk.SimkPackage.eINSTANCE.getSMClass()));\n\n\tsMContext.setSMClass(sMClass);\n\n\tsMClass.setName(class_qname);\n\n\tsMClass.setUsages(usage);\n}\n\n\n\tresult = sMContext;\n\nreturn result;\n'"
	 * @generated
	 */
	SMContext retrieveOrCreateContextWithClass(String class_qname,
			String finalPackage_qname, SMUsage usage, KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model class_qnameDataType="kermeta.standard.JavaString" finalPackage_qnameDataType="kermeta.standard.JavaString"
	 *        annotation="kermeta documentation='/** TODO TO COMMENT\052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nsimk.SMContext result = null;\n\n\tsimk.SMContext sMContext = null;\n//BIft:detect\n\nsimk.SMContext result_ft263 = null;\n\n\tsimk.SMContext elem_ft263 = null;\n\n\tresult_ft263 = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<simk.SMContext> it_ft263 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<simk.SMContext>convertAsOrderedSet(this.getSMContexts()).iterator();\n\tjava.lang.Boolean idLoopCond_1158 = false;\n\twhile( !idLoopCond_1158 ) {\n\tidLoopCond_1158 = kermeta.standard.helper.BooleanWrapper.or(it_ft263.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(result_ft263, null));\n\tif ( idLoopCond_1158 ) {\n\t} else {\n\n\telem_ft263 = it_ft263.next();\n\n\tjava.lang.Boolean idIfCond_1159 = false;\n//BIle:detector\nsimk.SMContext c_lbdExp263 = elem_ft263;\n\n\tidIfCond_1159 = kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.StringWrapper.equals(c_lbdExp263.getFinalPackageQName(), finalPackage_qname), kermeta.standard.helper.StringWrapper.equals(c_lbdExp263.getSMClass().getName(), class_qname)), org.kermeta.compil.runtime.helper.language.ObjectUtil.equalsSwitcher(c_lbdExp263.getSMClass().getUsages(), usage));\n//EIle:detector\n\n\n\tif( idIfCond_1159 ) {\n\n\tresult_ft263 = elem_ft263;\n}\n\n}\n\t}\n}\n\n\n//CE\nsMContext = result_ft263;\n//EIft:detect\n;\n\n\tjava.lang.Boolean idIfCond_1160 = false;\n\tidIfCond_1160 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(sMContext);\n\n\tif( idIfCond_1160 ) {\n\n\tsMContext = ((simk.SMContext) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(simk.SimkPackage.eINSTANCE.getSMContext()));\n\n\tsMContext.setFinalPackageQName(finalPackage_qname);\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<simk.SMContext>convertAsOrderedSet(this.getSMContexts()).add(sMContext);\n}\n\n\n\tresult = sMContext;\n\nreturn result;\n'"
	 * @generated
	 */
	SMContext retrieveOrCreateContext(String class_qname,
			String finalPackage_qname, SMUsage usage, KM2EcoreContext context);

} // SIMKModel
