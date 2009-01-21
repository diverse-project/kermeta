/**
 * <copyright>
 * </copyright>
 *
 * $Id: EcoreModelElementHelper.java,v 1.10 2009-01-21 09:16:05 cfaucher Exp $
 */
package km2ecore.helper.ecore;

import ecore.EClass;
import ecore.EOperation;
import ecore.EStructuralFeature;

import kermeta.language.structure.ClassDefinition;
import kermeta.language.structure.Operation;
import kermeta.language.structure.Property;

import km2ecore.KM2EcoreContext;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Element Helper</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see km2ecore.helper.ecore.EcorePackage#getEcoreModelElementHelper()
 * @model
 * @generated
 */
public interface EcoreModelElementHelper extends
		kermeta.language.structure.Object {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta deprecated='unused'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\necore.EOperation result = null;\n\n\tkermeta.language.structure.ClassDefinition cd = ((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.language.structure.StructurePackage.eINSTANCE.getClassDefinition()));\n\n\tcd = (kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeOrVoid(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(op), \"kermeta.language.structure.ClassDefinition\");\n\n\tecore.EOperation eop = null;\n//BIft:detect\n\necore.EOperation result_ft249 = null;\n\n\tecore.EOperation elem_ft249 = null;\n\n\tresult_ft249 = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<ecore.EOperation> it_ft249 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EOperation>convertAsOrderedSet(cd.getEcoreModelElement().getEOperations()).iterator();\n\tjava.lang.Boolean idLoopCond_1098 = false;\n\twhile( !idLoopCond_1098 ) {\n\tidLoopCond_1098 = kermeta.standard.helper.BooleanWrapper.or(it_ft249.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(result_ft249, null));\n\tif ( idLoopCond_1098 ) {\n\t} else {\n\n\telem_ft249 = it_ft249.next();\n\n\tjava.lang.Boolean idIfCond_1099 = false;\n//BIle:detector\necore.EOperation c_lbdExp249 = elem_ft249;\n\n\tjava.lang.Boolean idIfCond_1100 = false;\n\tidIfCond_1100 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(c_lbdExp249, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"ecore.EOperation\"));\n\n\tif( idIfCond_1100 ) {\n\n\tidIfCond_1099 = kermeta.standard.helper.StringWrapper.equals(((ecore.EOperation) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(c_lbdExp249, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"ecore.EOperation\"))).getName(), op.getName());\n}\n\n//EIle:detector\n\n\n\tif( idIfCond_1099 ) {\n\n\tresult_ft249 = elem_ft249;\n}\n\n}\n\t}\n}\n\n\n//CE\neop = result_ft249;\n//EIft:detect\n\n\n\tresult = ((ecore.EOperation) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(eop, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"ecore.EOperation\")));\n\nreturn result;\n'"
	 * @generated
	 */
	EOperation findEOperationProxy(Operation op);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tecoreStructuralFeature.setName(self_.getFinalName(context));\n\n\tecoreStructuralFeature.setOrdered(self_.getIsOrdered());\n\n\tecoreStructuralFeature.setUnique(self_.getIsUnique());\n\n\tecoreStructuralFeature.setLowerBound(self_.getLower());\n\n\tecoreStructuralFeature.setUpperBound(self_.getUpper());\n\n\tecoreStructuralFeature.setChangeable(kermeta.standard.helper.BooleanWrapper.not(self_.getIsReadOnly()));\n\n\tecoreStructuralFeature.setDefaultValueLiteral(self_.get_default());\n\n\tecoreStructuralFeature.setDerived(self_.getIsDerived());\n'"
	 * @generated
	 */
	void setEStructuralFeatureProperties(Property self_,
			EStructuralFeature ecoreStructuralFeature, KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta deprecated='unused'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\necore.EClass result = null;\n\n\tkermeta.language.structure.Package pack = ((kermeta.language.structure.Package) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.language.structure.StructurePackage.eINSTANCE.getPackage()));\n\n\tpack = (kermeta.language.structure.Package) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeOrVoid(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(cd), \"kermeta.language.structure.Package\");\n\n\tecore.EClassifier eclassifier = null;\n//BIft:detect\n\necore.EClassifier result_ft250 = null;\n\n\tecore.EClassifier elem_ft250 = null;\n\n\tresult_ft250 = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<ecore.EClassifier> it_ft250 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EClassifier>convertAsOrderedSet(pack.getEcoreModelElement().getEClassifiers()).iterator();\n\tjava.lang.Boolean idLoopCond_1101 = false;\n\twhile( !idLoopCond_1101 ) {\n\tidLoopCond_1101 = kermeta.standard.helper.BooleanWrapper.or(it_ft250.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(result_ft250, null));\n\tif ( idLoopCond_1101 ) {\n\t} else {\n\n\telem_ft250 = it_ft250.next();\n\n\tjava.lang.Boolean idIfCond_1102 = false;\n//BIle:detector\necore.EClassifier c_lbdExp250 = elem_ft250;\n\n\tjava.lang.Boolean idIfCond_1103 = false;\n\tidIfCond_1103 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(c_lbdExp250, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"ecore.EClass\"));\n\n\tif( idIfCond_1103 ) {\n\n\tidIfCond_1102 = kermeta.standard.helper.StringWrapper.equals(((ecore.EClass) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(c_lbdExp250, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"ecore.EClass\"))).getName(), cd.getName());\n}\n\n//EIle:detector\n\n\n\tif( idIfCond_1102 ) {\n\n\tresult_ft250 = elem_ft250;\n}\n\n}\n\t}\n}\n\n\n//CE\neclassifier = result_ft250;\n//EIft:detect\n\n\n\tresult = ((ecore.EClass) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(eclassifier, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"ecore.EClass\")));\n\nreturn result;\n'"
	 * @generated
	 */
	EClass findEClassProxy(ClassDefinition cd);

} // EcoreModelElementHelper
