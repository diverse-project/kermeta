/**
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * 
 * Generating with Kermeta <http://www.kermeta.org>
 *
 * $Id: SIMKModel.java,v 1.12 2009-02-23 15:26:55 cfaucher Exp $
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
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tcontext.setSimkOutput(kermeta.standard.helper.StringWrapper.replaceExtension(context.getKmInput(), \"simk\"));\n\n\tkermeta.persistence.Resource simkResource = context.getOutputRepository().createResource(context.getSimkOutput(), \"http://www.kermeta.org/simk\");\n\n\tsimkResource.add(this);\n\n\tsimkResource.save();\n'"
	 * @generated
	 */
	void save(KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/** TODO TO COMMENT\052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nsimk.SMContext result = null;\n\n\tresult = null;\n\n\tsimk.SMContext sMContext = this.retrieveOrCreateContextWithClass(kermeta.standard.helper.StringWrapper.plus(op.getOwningClass().getName(), \"Super\"), kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.replace(((kermeta.language.structure.Package) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(op.getOwningClass()), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Package\"))).qualifiedName(), context.getKERMETA_SEPARATOR(), context.getJAVA_SEPARATOR()), context.getJAVA_SEPARATOR()), \"helper\"), simk.SMUsage.getByName(\"Super\"), context);\n\n\tsimk.SMMethod sm = null;\n//BIft:detect\n\nsimk.SMMethod result_ft254 = null;\n\n\tsimk.SMMethod elem_ft254 = null;\n\n\tresult_ft254 = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<simk.SMMethod> it_ft254 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<simk.SMMethod>convertAsOrderedSet(sMContext.getSMMethods()).iterator();\n\tjava.lang.Boolean idLoopCond_1129 = false;\n\twhile( !idLoopCond_1129 ) {\n\tidLoopCond_1129 = kermeta.standard.helper.BooleanWrapper.or(it_ft254.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(result_ft254, null));\n\tif ( idLoopCond_1129 ) {\n\t} else {\n\n\telem_ft254 = it_ft254.next();\n\n\tjava.lang.Boolean idIfCond_1130 = false;\n//BIle:detector\nsimk.SMMethod o_lbdExp254 = elem_ft254;\n\n\tidIfCond_1130 = kermeta.standard.helper.StringWrapper.equals(o_lbdExp254.getName(), kermeta.standard.helper.StringWrapper.plus(\"super_\", op.getFinalName(context)));\n//EIle:detector\n\n\n\tif( idIfCond_1130 ) {\n\n\tresult_ft254 = elem_ft254;\n}\n\n}\n\t}\n}\n\n\n//CE\nsm = result_ft254;\n//EIft:detect\n;\n\n\tjava.lang.Boolean idIfCond_1131 = false;\n\tidIfCond_1131 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(sm);\n\n\tif( idIfCond_1131 ) {\n\n\tresult = sMContext;\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	SMContext retrieveOrCreateContextForSuper(Operation op,
			KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/** TODO TO COMMENT\052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nsimk.SMContext result = null;\n\n\tresult = null;\n\n\tsimk.SMContext sMContext = this.retrieveOrCreateContextWithClass(kermeta.standard.helper.StringWrapper.plus(((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(constraint), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ClassDefinition\"))).getName(), \"Invariant\"), kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.replace(((kermeta.language.structure.Package) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(constraint), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ClassDefinition\")))), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Package\"))).qualifiedName(), context.getKERMETA_SEPARATOR(), context.getJAVA_SEPARATOR()), context.getJAVA_SEPARATOR()), \"helper\"), simk.SMUsage.getByName(\"Invariant\"), context);\n\n\tsimk.SMMethod sm = null;\n//BIft:detect\n\nsimk.SMMethod result_ft255 = null;\n\n\tsimk.SMMethod elem_ft255 = null;\n\n\tresult_ft255 = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<simk.SMMethod> it_ft255 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<simk.SMMethod>convertAsOrderedSet(sMContext.getSMMethods()).iterator();\n\tjava.lang.Boolean idLoopCond_1132 = false;\n\twhile( !idLoopCond_1132 ) {\n\tidLoopCond_1132 = kermeta.standard.helper.BooleanWrapper.or(it_ft255.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(result_ft255, null));\n\tif ( idLoopCond_1132 ) {\n\t} else {\n\n\telem_ft255 = it_ft255.next();\n\n\tjava.lang.Boolean idIfCond_1133 = false;\n//BIle:detector\nsimk.SMMethod o_lbdExp255 = elem_ft255;\n\n\tidIfCond_1133 = kermeta.standard.helper.StringWrapper.equals(o_lbdExp255.getName(), kermeta.standard.helper.StringWrapper.plus(\"checkInvariant_\", constraint.getId()));\n//EIle:detector\n\n\n\tif( idIfCond_1133 ) {\n\n\tresult_ft255 = elem_ft255;\n}\n\n}\n\t}\n}\n\n\n//CE\nsm = result_ft255;\n//EIft:detect\n;\n\n\tjava.lang.Boolean idIfCond_1134 = false;\n\tidIfCond_1134 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(sm);\n\n\tif( idIfCond_1134 ) {\n\n\tresult = sMContext;\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	SMContext retrieveOrCreateContextForInvariant(Constraint constraint,
			KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/** TODO TO COMMENT\052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nsimk.SMContext result = null;\n\n\tresult = null;\n\n\tsimk.SMContext sMContext = this.retrieveOrCreateContextWithClass(kermeta.standard.helper.StringWrapper.plus(context.getCurrent_valueType().getName(), \"Wrapper\"), \"kermeta.standard.helper\", simk.SMUsage.getByName(\"Wrapper\"), context);\n\n\tsimk.SMMethod sm = null;\n//BIft:detect\n\nsimk.SMMethod result_ft256 = null;\n\n\tsimk.SMMethod elem_ft256 = null;\n\n\tresult_ft256 = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<simk.SMMethod> it_ft256 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<simk.SMMethod>convertAsOrderedSet(sMContext.getSMMethods()).iterator();\n\tjava.lang.Boolean idLoopCond_1135 = false;\n\twhile( !idLoopCond_1135 ) {\n\tidLoopCond_1135 = kermeta.standard.helper.BooleanWrapper.or(it_ft256.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(result_ft256, null));\n\tif ( idLoopCond_1135 ) {\n\t} else {\n\n\telem_ft256 = it_ft256.next();\n\n\tjava.lang.Boolean idIfCond_1136 = false;\n//BIle:detector\nsimk.SMMethod o_lbdExp256 = elem_ft256;\n\n\tidIfCond_1136 = kermeta.standard.helper.StringWrapper.equals(o_lbdExp256.getName(), op.getFinalName(context));\n//EIle:detector\n\n\n\tif( idIfCond_1136 ) {\n\n\tresult_ft256 = elem_ft256;\n}\n\n}\n\t}\n}\n\n\n//CE\nsm = result_ft256;\n//EIft:detect\n;\n\n\tjava.lang.Boolean idIfCond_1137 = false;\n\tidIfCond_1137 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(sm);\n\n\tif( idIfCond_1137 ) {\n\n\tresult = sMContext;\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	SMContext retrieveOrCreateContextForWrapper(Operation op,
			KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/** TODO TO COMMENT\052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nsimk.SMContext result = null;\n\n\tresult = null;\n\n\tsimk.SMContext sMContext = this.retrieveOrCreateContextWithClass(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(op.getOwningClass().getName(), \"__\"), op.getFinalName(context)), \"__\"), \"Runner\"), kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.replace(((kermeta.language.structure.Package) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(op.getOwningClass()), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Package\"))).qualifiedName(), context.getKERMETA_SEPARATOR(), context.getJAVA_SEPARATOR()), context.getJAVA_SEPARATOR()), \"runner\"), simk.SMUsage.getByName(\"Runner\"), context);\n\n\tsimk.SMMethod sm = null;\n//BIft:detect\n\nsimk.SMMethod result_ft257 = null;\n\n\tsimk.SMMethod elem_ft257 = null;\n\n\tresult_ft257 = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<simk.SMMethod> it_ft257 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<simk.SMMethod>convertAsOrderedSet(sMContext.getSMMethods()).iterator();\n\tjava.lang.Boolean idLoopCond_1138 = false;\n\twhile( !idLoopCond_1138 ) {\n\tidLoopCond_1138 = kermeta.standard.helper.BooleanWrapper.or(it_ft257.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(result_ft257, null));\n\tif ( idLoopCond_1138 ) {\n\t} else {\n\n\telem_ft257 = it_ft257.next();\n\n\tjava.lang.Boolean idIfCond_1139 = false;\n//BIle:detector\nsimk.SMMethod o_lbdExp257 = elem_ft257;\n\n\tidIfCond_1139 = kermeta.standard.helper.StringWrapper.equals(o_lbdExp257.getName(), \"main\");\n//EIle:detector\n\n\n\tif( idIfCond_1139 ) {\n\n\tresult_ft257 = elem_ft257;\n}\n\n}\n\t}\n}\n\n\n//CE\nsm = result_ft257;\n//EIft:detect\n;\n\n\tjava.lang.Boolean idIfCond_1140 = false;\n\tidIfCond_1140 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(sm);\n\n\tif( idIfCond_1140 ) {\n\n\tresult = sMContext;\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	SMContext retrieveOrCreateContextForRunner(Operation op,
			KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model class_qnameDataType="kermeta.standard.JavaString" finalPackage_qnameDataType="kermeta.standard.JavaString"
	 *        annotation="kermeta documentation='/** TODO TO COMMENT\052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nsimk.SMContext result = null;\n\n\tsimk.SMContext sMContext = this.retrieveOrCreateContext(class_qname, finalPackage_qname, usage, context);\n\n\tjava.lang.Boolean idIfCond_1141 = false;\n\tidIfCond_1141 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(sMContext.getSMClass());\n\n\tif( idIfCond_1141 ) {\n\n\tsimk.SMClass sMClass = ((simk.SMClass) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(simk.SimkPackage.eINSTANCE.getSMClass()));\n\n\tsMContext.setSMClass(sMClass);\n\n\tsMClass.setName(class_qname);\n\n\tsMClass.setUsages(usage);\n}\n\n\n\tresult = sMContext;\n\nreturn result;\n'"
	 * @generated
	 */
	SMContext retrieveOrCreateContextWithClass(String class_qname,
			String finalPackage_qname, SMUsage usage, KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model class_qnameDataType="kermeta.standard.JavaString" finalPackage_qnameDataType="kermeta.standard.JavaString"
	 *        annotation="kermeta documentation='/** TODO TO COMMENT\052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nsimk.SMContext result = null;\n\n\tsimk.SMContext sMContext = null;\n//BIft:detect\n\nsimk.SMContext result_ft258 = null;\n\n\tsimk.SMContext elem_ft258 = null;\n\n\tresult_ft258 = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<simk.SMContext> it_ft258 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<simk.SMContext>convertAsOrderedSet(this.getSMContexts()).iterator();\n\tjava.lang.Boolean idLoopCond_1142 = false;\n\twhile( !idLoopCond_1142 ) {\n\tidLoopCond_1142 = kermeta.standard.helper.BooleanWrapper.or(it_ft258.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(result_ft258, null));\n\tif ( idLoopCond_1142 ) {\n\t} else {\n\n\telem_ft258 = it_ft258.next();\n\n\tjava.lang.Boolean idIfCond_1143 = false;\n//BIle:detector\nsimk.SMContext c_lbdExp258 = elem_ft258;\n\n\tidIfCond_1143 = kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.StringWrapper.equals(c_lbdExp258.getFinalPackageQName(), finalPackage_qname), kermeta.standard.helper.StringWrapper.equals(c_lbdExp258.getSMClass().getName(), class_qname)), org.kermeta.compil.runtime.helper.language.ObjectUtil.equalsSwitcher(c_lbdExp258.getSMClass().getUsages(), usage));\n//EIle:detector\n\n\n\tif( idIfCond_1143 ) {\n\n\tresult_ft258 = elem_ft258;\n}\n\n}\n\t}\n}\n\n\n//CE\nsMContext = result_ft258;\n//EIft:detect\n;\n\n\tjava.lang.Boolean idIfCond_1144 = false;\n\tidIfCond_1144 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(sMContext);\n\n\tif( idIfCond_1144 ) {\n\n\tsMContext = ((simk.SMContext) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(simk.SimkPackage.eINSTANCE.getSMContext()));\n\n\tsMContext.setFinalPackageQName(finalPackage_qname);\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<simk.SMContext>convertAsOrderedSet(this.getSMContexts()).add(sMContext);\n}\n\n\n\tresult = sMContext;\n\nreturn result;\n'"
	 * @generated
	 */
	SMContext retrieveOrCreateContext(String class_qname,
			String finalPackage_qname, SMUsage usage, KM2EcoreContext context);

} // SIMKModel
