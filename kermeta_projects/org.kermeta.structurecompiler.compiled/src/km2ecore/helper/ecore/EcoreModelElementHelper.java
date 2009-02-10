/**
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * 
 * Generating with Kermeta <http://www.kermeta.org>
 *
 * $Id: EcoreModelElementHelper.java,v 1.11 2009-02-10 17:51:58 cfaucher Exp $
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\necore.EOperation result = null;\n\n\tkermeta.language.structure.ClassDefinition cd = ((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.language.structure.StructurePackage.eINSTANCE.getClassDefinition()));\n\n\tcd = (kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeOrVoid(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(op), \"kermeta.language.structure.ClassDefinition\");\n\n\tecore.EOperation eop = null;\n//BIft:detect\n\necore.EOperation result_ft5 = null;\n\n\tecore.EOperation elem_ft5 = null;\n\n\tresult_ft5 = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<ecore.EOperation> it_ft5 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EOperation>convertAsOrderedSet(cd.getEcoreModelElement().getEOperations()).iterator();\n\tjava.lang.Boolean idLoopCond_36 = false;\n\twhile( !idLoopCond_36 ) {\n\tidLoopCond_36 = kermeta.standard.helper.BooleanWrapper.or(it_ft5.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(result_ft5, null));\n\tif ( idLoopCond_36 ) {\n\t} else {\n\n\telem_ft5 = it_ft5.next();\n\n\tjava.lang.Boolean idIfCond_37 = false;\n//BIle:detector\necore.EOperation c_lbdExp5 = elem_ft5;\n\n\tjava.lang.Boolean idIfCond_38 = false;\n\tidIfCond_38 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(c_lbdExp5, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"ecore.EOperation\"));\n\n\tif( idIfCond_38 ) {\n\n\tidIfCond_37 = kermeta.standard.helper.StringWrapper.equals(((ecore.EOperation) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(c_lbdExp5, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"ecore.EOperation\"))).getName(), op.getName());\n}\n\n//EIle:detector\n\n\n\tif( idIfCond_37 ) {\n\n\tresult_ft5 = elem_ft5;\n}\n\n}\n\t}\n}\n\n\n//CE\neop = result_ft5;\n//EIft:detect\n;\n\n\tresult = ((ecore.EOperation) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(eop, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"ecore.EOperation\")));\n\nreturn result;\n'"
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\necore.EClass result = null;\n\n\tkermeta.language.structure.Package pack = ((kermeta.language.structure.Package) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.language.structure.StructurePackage.eINSTANCE.getPackage()));\n\n\tpack = (kermeta.language.structure.Package) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeOrVoid(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(cd), \"kermeta.language.structure.Package\");\n\n\tecore.EClassifier eclassifier = null;\n//BIft:detect\n\necore.EClassifier result_ft6 = null;\n\n\tecore.EClassifier elem_ft6 = null;\n\n\tresult_ft6 = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<ecore.EClassifier> it_ft6 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EClassifier>convertAsOrderedSet(pack.getEcoreModelElement().getEClassifiers()).iterator();\n\tjava.lang.Boolean idLoopCond_39 = false;\n\twhile( !idLoopCond_39 ) {\n\tidLoopCond_39 = kermeta.standard.helper.BooleanWrapper.or(it_ft6.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(result_ft6, null));\n\tif ( idLoopCond_39 ) {\n\t} else {\n\n\telem_ft6 = it_ft6.next();\n\n\tjava.lang.Boolean idIfCond_40 = false;\n//BIle:detector\necore.EClassifier c_lbdExp6 = elem_ft6;\n\n\tjava.lang.Boolean idIfCond_41 = false;\n\tidIfCond_41 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(c_lbdExp6, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"ecore.EClass\"));\n\n\tif( idIfCond_41 ) {\n\n\tidIfCond_40 = kermeta.standard.helper.StringWrapper.equals(((ecore.EClass) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(c_lbdExp6, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"ecore.EClass\"))).getName(), cd.getName());\n}\n\n//EIle:detector\n\n\n\tif( idIfCond_40 ) {\n\n\tresult_ft6 = elem_ft6;\n}\n\n}\n\t}\n}\n\n\n//CE\neclassifier = result_ft6;\n//EIft:detect\n;\n\n\tresult = ((ecore.EClass) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(eclassifier, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"ecore.EClass\")));\n\nreturn result;\n'"
	 * @generated
	 */
	EClass findEClassProxy(ClassDefinition cd);

} // EcoreModelElementHelper
