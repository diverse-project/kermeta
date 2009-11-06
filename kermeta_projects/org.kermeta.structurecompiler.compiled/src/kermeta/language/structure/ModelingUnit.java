/**
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * 
 * Generated with Kermeta <http://www.kermeta.org>
 *
 * $Id$
 */
package kermeta.language.structure;

import ecore.EAnnotation;
import ecore.EClassifier;
import ecore.EPackage;

import kermeta.standard.OrderedSet;

import km2ecore.KM2EcoreContext;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Modeling Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kermeta.language.structure.ModelingUnit#getEcorePackages <em>Ecore Packages</em>}</li>
 *   <li>{@link kermeta.language.structure.ModelingUnit#getUsings <em>Usings</em>}</li>
 *   <li>{@link kermeta.language.structure.ModelingUnit#getPackages <em>Packages</em>}</li>
 *   <li>{@link kermeta.language.structure.ModelingUnit#getIncludeFilters <em>Include Filters</em>}</li>
 *   <li>{@link kermeta.language.structure.ModelingUnit#getSuperOperationsToCompileInHelper <em>Super Operations To Compile In Helper</em>}</li>
 *   <li>{@link kermeta.language.structure.ModelingUnit#getExcludeFilters <em>Exclude Filters</em>}</li>
 *   <li>{@link kermeta.language.structure.ModelingUnit#getReferencedModelingUnits <em>Referenced Modeling Units</em>}</li>
 *   <li>{@link kermeta.language.structure.ModelingUnit#getRequires <em>Requires</em>}</li>
 *   <li>{@link kermeta.language.structure.ModelingUnit#getEntryPoints <em>Entry Points</em>}</li>
 * </ul>
 * </p>
 *
 * @see kermeta.language.structure.StructurePackage#getModelingUnit()
 * @model annotation="kermeta documentation='/**\r\n *\r\n \052/'"
 *        annotation="kermeta ecore='true'"
 *        annotation="kermeta documentation='The modeling unit is the root of any kermeta model. It contains packages, requires and usings.\nIt also reference others modeling unit.'"
 * @generated
 */
public interface ModelingUnit extends Traceability<EAnnotation> {
	/**
	 * Returns the value of the '<em><b>Ecore Packages</b></em>' reference list.
	 * The list contents are of type {@link ecore.EPackage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ecore Packages</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ecore Packages</em>' reference list.
	 * @see kermeta.language.structure.StructurePackage#getModelingUnit_EcorePackages()
	 * @model
	 * @generated
	 */
	EList<EPackage> getEcorePackages();

	/**
	 * Returns the value of the '<em><b>Usings</b></em>' containment reference list.
	 * The list contents are of type {@link kermeta.language.structure.Using}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Usings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usings</em>' containment reference list.
	 * @see kermeta.language.structure.StructurePackage#getModelingUnit_Usings()
	 * @model containment="true" resolveProxies="true"
	 *        annotation="kermeta ecore='true'"
	 *        annotation="kermeta documentation='Set of \"using\" statement associated with this ModelingUnit. Ie. list of \"syntatic shortcut\"\nthat can be used within this unit.'"
	 * @generated
	 */
	EList<Using> getUsings();

	/**
	 * Returns the value of the '<em><b>Packages</b></em>' containment reference list.
	 * The list contents are of type {@link kermeta.language.structure.Package}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Packages</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Packages</em>' containment reference list.
	 * @see kermeta.language.structure.StructurePackage#getModelingUnit_Packages()
	 * @model containment="true" resolveProxies="true"
	 *        annotation="kermeta ecore='true'"
	 *        annotation="kermeta documentation='root packages contained by this ModelingUnit'"
	 * @generated
	 */
	EList<kermeta.language.structure.Package> getPackages();

	/**
	 * Returns the value of the '<em><b>Include Filters</b></em>' containment reference list.
	 * The list contents are of type {@link kermeta.language.structure.Filter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Include Filters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Include Filters</em>' containment reference list.
	 * @see kermeta.language.structure.StructurePackage#getModelingUnit_IncludeFilters()
	 * @model containment="true" resolveProxies="true"
	 *        annotation="kermeta ecore='true'"
	 *        annotation="kermeta documentation='list of filters that apply to this modeling unit.\nThis means that if the same unit was loaded without this filters, it would have loaded more content\nonly element whose qualified name begins with one of these filter will be loaded in the unit'"
	 * @generated
	 */
	EList<Filter> getIncludeFilters();

	/**
	 * Returns the value of the '<em><b>Super Operations To Compile In Helper</b></em>' reference list.
	 * The list contents are of type {@link kermeta.language.structure.Operation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Super Operations To Compile In Helper</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super Operations To Compile In Helper</em>' reference list.
	 * @see kermeta.language.structure.StructurePackage#getModelingUnit_SuperOperationsToCompileInHelper()
	 * @model
	 * @generated
	 */
	EList<Operation> getSuperOperationsToCompileInHelper();

	/**
	 * Returns the value of the '<em><b>Exclude Filters</b></em>' containment reference list.
	 * The list contents are of type {@link kermeta.language.structure.Filter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exclude Filters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exclude Filters</em>' containment reference list.
	 * @see kermeta.language.structure.StructurePackage#getModelingUnit_ExcludeFilters()
	 * @model containment="true" resolveProxies="true"
	 *        annotation="kermeta ecore='true'"
	 *        annotation="kermeta documentation='list of filters that apply to this modeling unit.\nThis means that if the same unit was loaded without this filters, it would have loaded more content\nelement whose qualified name begins with one of these filter will NOT be loaded in the unit'"
	 * @generated
	 */
	EList<Filter> getExcludeFilters();

	/**
	 * Returns the value of the '<em><b>Referenced Modeling Units</b></em>' reference list.
	 * The list contents are of type {@link kermeta.language.structure.ModelingUnit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referenced Modeling Units</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced Modeling Units</em>' reference list.
	 * @see kermeta.language.structure.StructurePackage#getModelingUnit_ReferencedModelingUnits()
	 * @model annotation="kermeta ecore='true'"
	 *        annotation="kermeta documentation='To be written'"
	 * @generated
	 */
	EList<ModelingUnit> getReferencedModelingUnits();

	/**
	 * Returns the value of the '<em><b>Requires</b></em>' containment reference list.
	 * The list contents are of type {@link kermeta.language.structure.Require}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requires</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requires</em>' containment reference list.
	 * @see kermeta.language.structure.StructurePackage#getModelingUnit_Requires()
	 * @model containment="true" resolveProxies="true"
	 *        annotation="kermeta ecore='true'"
	 *        annotation="kermeta documentation='Set of \"require\" statements associated with this ModelingUnit. Ie. list of the other\nfiles required to run this unit'"
	 * @generated
	 */
	EList<Require> getRequires();

	/**
	 * Returns the value of the '<em><b>Entry Points</b></em>' reference list.
	 * The list contents are of type {@link ecore.EAnnotation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entry Points</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entry Points</em>' reference list.
	 * @see kermeta.language.structure.StructurePackage#getModelingUnit_EntryPoints()
	 * @model
	 * @generated
	 */
	EList<EAnnotation> getEntryPoints();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model qnameDataType="kermeta.standard.JavaString"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.language.structure.Package result = null;\n\n\tresult = null;\n\n\tkermeta.standard.Sequence<java.lang.String> set_qname = kermeta.standard.helper.StringWrapper.split(qname, \"::\");\n\n\tjava.lang.Boolean idIfCond_8 = false;\n\tidIfCond_8 = kermeta.standard.helper.IntegerWrapper.equals(set_qname.size(), 0);\n\n\tif( idIfCond_8 ) {\n\n\tset_qname.add(qname);\n}\n\n\n\tkermeta.language.structure.Package pack = null;\n//BIft:detect\n\nkermeta.language.structure.Package result_ft1 = null;\n\n\tkermeta.language.structure.Package elem_ft1 = null;\n\n\tresult_ft1 = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Package> it_ft1 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Package>convertAsOrderedSet(this.getPackages()).iterator();\n\tjava.lang.Boolean idLoopCond_9 = false;\n\twhile( !idLoopCond_9 ) {\n\tidLoopCond_9 = kermeta.standard.helper.BooleanWrapper.or(it_ft1.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(result_ft1, null));\n\tif ( idLoopCond_9 ) {\n\t} else {\n\n\telem_ft1 = it_ft1.next();\n\n\tjava.lang.Boolean idIfCond_10 = false;\n//BIle:detector\nkermeta.language.structure.Package p_lbdExp1 = elem_ft1;\n\n\tidIfCond_10 = kermeta.standard.helper.StringWrapper.equals(p_lbdExp1.getName(), set_qname.at(0));\n//EIle:detector\n\n\n\tif( idIfCond_10 ) {\n\n\tresult_ft1 = elem_ft1;\n}\n\n}\n\t}\n}\n\n\n//CE\npack = result_ft1;\n//EIft:detect\n;\n\n\tjava.lang.Boolean idIfCond_11 = false;\n\tidIfCond_11 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(pack));\n\n\tif( idIfCond_11 ) {\n\n\t\n{\n\n\tjava.lang.Integer i = 1;\n\tjava.lang.Boolean idLoopCond_12 = false;\n\twhile( !idLoopCond_12 ) {\n\tidLoopCond_12 = kermeta.standard.helper.IntegerWrapper.isGreaterOrEqual(i, set_qname.size());\n\tif ( idLoopCond_12 ) {\n\t} else {\n\n\t//BIft:detect\n\nkermeta.language.structure.Package result_ft2 = null;\n\n\tkermeta.language.structure.Package elem_ft2 = null;\n\n\tresult_ft2 = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Package> it_ft2 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Package>convertAsOrderedSet(pack.getNestedPackage()).iterator();\n\tjava.lang.Boolean idLoopCond_13 = false;\n\twhile( !idLoopCond_13 ) {\n\tidLoopCond_13 = kermeta.standard.helper.BooleanWrapper.or(it_ft2.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(result_ft2, null));\n\tif ( idLoopCond_13 ) {\n\t} else {\n\n\telem_ft2 = it_ft2.next();\n\n\tjava.lang.Boolean idIfCond_14 = false;\n//BIle:detector\nkermeta.language.structure.Package p_lbdExp2 = elem_ft2;\n\n\tidIfCond_14 = kermeta.standard.helper.StringWrapper.equals(p_lbdExp2.getName(), set_qname.at(i));\n//EIle:detector\n\n\n\tif( idIfCond_14 ) {\n\n\tresult_ft2 = elem_ft2;\n}\n\n}\n\t}\n}\n\n\n//CE\npack = result_ft2;\n//EIft:detect\n\n\n\ti = kermeta.standard.helper.IntegerWrapper.plus(i, 1);\n}\n\t}\n}\n\n\n\tresult = pack;\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	kermeta.language.structure.Package retrievePackage(String qname);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\r\n\t * We cannot use an Alias to define this indiretion because the concept of KRuntimeError does not exist\r\n\t * in framework.ecore, thus we create in this operation a new EDataType that targets the KRuntimeError Java Impl\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tecore.EDataType exception_EDataType = ((ecore.EDataType) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(ecore.EcorePackage.eINSTANCE.getEDataType()));\n\n\texception_EDataType.setName(\"KRuntimeError\");\n\n\texception_EDataType.setInstanceClassName(context.getJAVA_CLASS_EXCEPTION_SWITCHER());\n\n\texception_EDataType.setSerializable(false);\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EClassifier>convertAsOrderedSet(this.retrievePackage(\"kermeta::exceptions\").getEcoreModelElement().getEClassifiers()).add(exception_EDataType);\n'"
	 * @generated
	 */
	void createKRuntimeError(KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta superOperation='kermeta::language::structure::Object'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tecore.EAnnotation ecoreAnnotation = this.createEcoreModelElement(context);\n\n\tthis.setEcoreModelElement(ecoreAnnotation);\n\n\t//BIft:eachOwnedElement\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Tag> it_ft4 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Tag>convertAsOrderedSet(this.getOwnedTags()).iterator();\n\tjava.lang.Boolean idLoopCond_15 = false;\n\twhile( !idLoopCond_15 ) {\n\tidLoopCond_15 = it_ft4.isOff();\n\tif ( idLoopCond_15 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Tag o_lbdExp4 = it_ft4.next();\n\n\t//BIle:func\nkermeta.language.structure.Tag p_lbdExp3 = o_lbdExp4;\n\n\tp_lbdExp3.applyPass1(context);\n//EIle:func\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Require> it_ft5 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Require>convertAsOrderedSet(this.getRequires()).iterator();\n\tjava.lang.Boolean idLoopCond_16 = false;\n\twhile( !idLoopCond_16 ) {\n\tidLoopCond_16 = it_ft5.isOff();\n\tif ( idLoopCond_16 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Require p_lbdExp5 = it_ft5.next();\n\n\t//BIle:func\nkermeta.language.structure.Require p_lbdExp3 = p_lbdExp5;\n\n\tp_lbdExp3.applyPass1(context);\n//EIle:func\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Using> it_ft6 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Using>convertAsOrderedSet(this.getUsings()).iterator();\n\tjava.lang.Boolean idLoopCond_17 = false;\n\twhile( !idLoopCond_17 ) {\n\tidLoopCond_17 = it_ft6.isOff();\n\tif ( idLoopCond_17 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Using p_lbdExp6 = it_ft6.next();\n\n\t//BIle:func\nkermeta.language.structure.Using p_lbdExp3 = p_lbdExp6;\n\n\tp_lbdExp3.applyPass1(context);\n//EIle:func\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Package> it_ft7 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Package>convertAsOrderedSet(this.getPackages()).iterator();\n\tjava.lang.Boolean idLoopCond_18 = false;\n\twhile( !idLoopCond_18 ) {\n\tidLoopCond_18 = it_ft7.isOff();\n\tif ( idLoopCond_18 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Package p_lbdExp7 = it_ft7.next();\n\n\t//BIle:func\nkermeta.language.structure.Package p_lbdExp3 = p_lbdExp7;\n\n\tp_lbdExp3.applyPass1(context);\n//EIle:func\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n//EIft:eachOwnedElement\n\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Package> it_ft8 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Package>convertAsOrderedSet(this.getPackages()).iterator();\n\tjava.lang.Boolean idLoopCond_19 = false;\n\twhile( !idLoopCond_19 ) {\n\tidLoopCond_19 = it_ft8.isOff();\n\tif ( idLoopCond_19 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Package p_lbdExp8 = it_ft8.next();\n\n\tkermeta.standard.Sequence<ecore.EPackage> eps = null;\n//BIft:select\n\nkermeta.standard.Sequence<ecore.EPackage> result_ft9 = null;\n\n\tecore.EPackage elem_ft9 = null;\n\n\tresult_ft9 = ((kermeta.standard.Sequence<ecore.EPackage>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.standard.StandardPackage.eINSTANCE.getSequence()));\n\n\t\n{\n\n\tkermeta.standard.Iterator<ecore.EPackage> it_ft9 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EPackage>convertAsOrderedSet(this.getEcorePackages()).iterator();\n\tjava.lang.Boolean idLoopCond_20 = false;\n\twhile( !idLoopCond_20 ) {\n\tidLoopCond_20 = it_ft9.isOff();\n\tif ( idLoopCond_20 ) {\n\t} else {\n\n\telem_ft9 = it_ft9.next();\n\n\tjava.lang.Boolean idIfCond_21 = false;\n//BIle:selector\necore.EPackage ep_lbdExp9 = elem_ft9;\n\n\tidIfCond_21 = kermeta.standard.helper.StringWrapper.equals(kermeta.standard.helper.StringWrapper.toLowerCase(p_lbdExp8.getName()), kermeta.standard.helper.StringWrapper.toLowerCase(ep_lbdExp9.getName()));\n//EIle:selector\n\n\n\tif( idIfCond_21 ) {\n\n\tresult_ft9.add(elem_ft9);\n}\n\n}\n\t}\n}\n\n\n//CE\neps = result_ft9;\n//EIft:select\n;\n\n\tjava.lang.Boolean idIfCond_22 = false;\n\tidIfCond_22 = kermeta.standard.helper.IntegerWrapper.isGreater(eps.size(), 0);\n\n\tif( idIfCond_22 ) {\n\n\tjava.lang.Boolean idIfCond_23 = false;\n\tidIfCond_23 = kermeta.standard.helper.IntegerWrapper.equals(eps.size(), 1);\n\n\tif( idIfCond_23 ) {\n\n\t//BIft:detect\n\nkermeta.language.structure.Package result_ft10 = null;\n\n\tkermeta.language.structure.Package elem_ft10 = null;\n\n\tresult_ft10 = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Package> it_ft10 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Package>convertAsOrderedSet(this.getPackages()).iterator();\n\tjava.lang.Boolean idLoopCond_24 = false;\n\twhile( !idLoopCond_24 ) {\n\tidLoopCond_24 = kermeta.standard.helper.BooleanWrapper.or(it_ft10.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(result_ft10, null));\n\tif ( idLoopCond_24 ) {\n\t} else {\n\n\telem_ft10 = it_ft10.next();\n\n\tjava.lang.Boolean idIfCond_25 = false;\n//BIle:detector\nkermeta.language.structure.Package pack_lbdExp10 = elem_ft10;\n\n\tidIfCond_25 = kermeta.standard.helper.StringWrapper.equals(kermeta.standard.helper.StringWrapper.toLowerCase(pack_lbdExp10.getName()), kermeta.standard.helper.StringWrapper.toLowerCase(p_lbdExp8.getName()));\n//EIle:detector\n\n\n\tif( idIfCond_25 ) {\n\n\tresult_ft10 = elem_ft10;\n}\n\n}\n\t}\n}\n\n//EIft:detect\nresult_ft10.setGenModelBasePackage(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.toLowerCase(p_lbdExp8.getName()), \"0\"));\n}\n\n\n\tp_lbdExp8.setGenModelBasePackage(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.toLowerCase(p_lbdExp8.getName()), kermeta.standard.helper.IntegerWrapper.toString(eps.size())));\n}\n\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EPackage>convertAsOrderedSet(this.getEcorePackages()).add(p_lbdExp8.getEcoreModelElement());\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n'"
	 * @generated
	 */
	void applyPass1(KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\r\n\t * Compilation of super operations is only mandatory when kermeta code is using super methods from classes converted into Java interfaces\r\n\t * Super operation are declared static in Java code\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Operation> it_ft11 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Operation>convertAsOrderedSet(this.getSuperOperationsToCompileInHelper()).iterator();\n\tjava.lang.Boolean idLoopCond_26 = false;\n\twhile( !idLoopCond_26 ) {\n\tidLoopCond_26 = it_ft11.isOff();\n\tif ( idLoopCond_26 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Operation op_lbdExp11 = it_ft11.next();\n\n\tjava.lang.Boolean staticOperationMode_backup = context.getStaticOperationMode();\n\n\tcontext.setStaticOperationMode(true);\n\n\tthis.compileStaticOperation(op_lbdExp11, context);\n\n\tcontext.setStaticOperationMode(staticOperationMode_backup);\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n'"
	 * @generated
	 */
	void compileSuperOperation(KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tthis.compileSuperOperation(context);\n\n\tthis.cleanEObject();\n'"
	 * @generated
	 */
	void postprocess(KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model qnameDataType="kermeta.standard.JavaString"
	 *        annotation="kermeta documentation='/**\r\n\t * Get a EClassifer contained in the given Modeling Unit by qualifiedName\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\necore.EClassifier result = null;\n\n\tresult = null;\n\n\tkermeta.standard.Sequence<java.lang.String> set_qname = kermeta.standard.helper.StringWrapper.split(qname, \"::\");\n\n\tjava.lang.Boolean idIfCond_27 = false;\n\tidIfCond_27 = kermeta.standard.helper.IntegerWrapper.equals(set_qname.size(), 0);\n\n\tif( idIfCond_27 ) {\n\n\tset_qname.add(qname);\n}\n\n\n\tecore.EPackage pack = null;\n//BIft:detect\n\necore.EPackage result_ft12 = null;\n\n\tecore.EPackage elem_ft12 = null;\n\n\tresult_ft12 = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<ecore.EPackage> it_ft12 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EPackage>convertAsOrderedSet(this.getEcorePackages()).iterator();\n\tjava.lang.Boolean idLoopCond_28 = false;\n\twhile( !idLoopCond_28 ) {\n\tidLoopCond_28 = kermeta.standard.helper.BooleanWrapper.or(it_ft12.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(result_ft12, null));\n\tif ( idLoopCond_28 ) {\n\t} else {\n\n\telem_ft12 = it_ft12.next();\n\n\tjava.lang.Boolean idIfCond_29 = false;\n//BIle:detector\necore.EPackage p_lbdExp12 = elem_ft12;\n\n\tidIfCond_29 = kermeta.standard.helper.StringWrapper.equals(p_lbdExp12.getName(), set_qname.at(0));\n//EIle:detector\n\n\n\tif( idIfCond_29 ) {\n\n\tresult_ft12 = elem_ft12;\n}\n\n}\n\t}\n}\n\n\n//CE\npack = result_ft12;\n//EIft:detect\n;\n\n\tjava.lang.Boolean idIfCond_30 = false;\n\tidIfCond_30 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(pack));\n\n\tif( idIfCond_30 ) {\n\n\t\n{\n\n\tjava.lang.Integer i = 1;\n\tjava.lang.Boolean idLoopCond_31 = false;\n\twhile( !idLoopCond_31 ) {\n\tidLoopCond_31 = kermeta.standard.helper.IntegerWrapper.isGreaterOrEqual(i, kermeta.standard.helper.IntegerWrapper.minus(set_qname.size(), 1));\n\tif ( idLoopCond_31 ) {\n\t} else {\n\n\t//BIft:detect\n\necore.EPackage result_ft13 = null;\n\n\tecore.EPackage elem_ft13 = null;\n\n\tresult_ft13 = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<ecore.EPackage> it_ft13 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EPackage>convertAsOrderedSet(pack.getESubpackages()).iterator();\n\tjava.lang.Boolean idLoopCond_32 = false;\n\twhile( !idLoopCond_32 ) {\n\tidLoopCond_32 = kermeta.standard.helper.BooleanWrapper.or(it_ft13.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(result_ft13, null));\n\tif ( idLoopCond_32 ) {\n\t} else {\n\n\telem_ft13 = it_ft13.next();\n\n\tjava.lang.Boolean idIfCond_33 = false;\n//BIle:detector\necore.EPackage p_lbdExp13 = elem_ft13;\n\n\tidIfCond_33 = kermeta.standard.helper.StringWrapper.equals(p_lbdExp13.getName(), set_qname.at(i));\n//EIle:detector\n\n\n\tif( idIfCond_33 ) {\n\n\tresult_ft13 = elem_ft13;\n}\n\n}\n\t}\n}\n\n\n//CE\npack = result_ft13;\n//EIft:detect\n\n\n\ti = kermeta.standard.helper.IntegerWrapper.plus(i, 1);\n}\n\t}\n}\n\n\n\t//BIft:detect\n\necore.EClassifier result_ft14 = null;\n\n\tecore.EClassifier elem_ft14 = null;\n\n\tresult_ft14 = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<ecore.EClassifier> it_ft14 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EClassifier>convertAsOrderedSet(pack.getEClassifiers()).iterator();\n\tjava.lang.Boolean idLoopCond_34 = false;\n\twhile( !idLoopCond_34 ) {\n\tidLoopCond_34 = kermeta.standard.helper.BooleanWrapper.or(it_ft14.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(result_ft14, null));\n\tif ( idLoopCond_34 ) {\n\t} else {\n\n\telem_ft14 = it_ft14.next();\n\n\tjava.lang.Boolean idIfCond_35 = false;\n//BIle:detector\necore.EClassifier c_lbdExp14 = elem_ft14;\n\n\tidIfCond_35 = kermeta.standard.helper.StringWrapper.equals(c_lbdExp14.getName(), set_qname.at(kermeta.standard.helper.IntegerWrapper.minus(set_qname.size(), 1)));\n//EIle:detector\n\n\n\tif( idIfCond_35 ) {\n\n\tresult_ft14 = elem_ft14;\n}\n\n}\n\t}\n}\n\n\n//CE\nresult = result_ft14;\n//EIft:detect\n\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	EClassifier getEClassifierByQualifiedName(String qname);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\r\n\t * Remove the operations from the Ecore metamodel for the EClass ecore::EObject => avoid many conflicts\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tjava.lang.Boolean idIfCond_36 = false;\n\tidIfCond_36 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(this.getEClassifierByQualifiedName(\"ecore::EObject\")));\n\n\tif( idIfCond_36 ) {\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<ecore.EOperation> it_ft15 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EOperation>convertAsOrderedSet(((ecore.EClass) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(this.getEClassifierByQualifiedName(\"ecore::EObject\"), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"ecore.EClass\"))).getEOperations()).iterator();\n\tjava.lang.Boolean idLoopCond_37 = false;\n\twhile( !idLoopCond_37 ) {\n\tidLoopCond_37 = it_ft15.isOff();\n\tif ( idLoopCond_37 ) {\n\t} else {\n\n\t//BIle:func\necore.EOperation op_lbdExp15 = it_ft15.next();\n\n\tjava.lang.Boolean idIfCond_38 = false;\n\tidIfCond_38 = ((km2ecore.helper.ecore.EAnnotationHelper) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(km2ecore.helper.ecore.EcorePackage.eINSTANCE.getEAnnotationHelper())).isFromAnEcoreMetamodel(op_lbdExp15);\n\n\tif( idIfCond_38 ) {\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EOperation>convertAsOrderedSet(((ecore.EClass) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(this.getEClassifierByQualifiedName(\"ecore::EObject\"), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"ecore.EClass\"))).getEOperations()).remove(op_lbdExp15);\n}\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n}\n\n'"
	 * @generated
	 */
	void cleanEObject();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tthis.createKRuntimeError(context);\n'"
	 * @generated
	 */
	void preprocess(KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tsimk.SMContext smContext = context.getSimkModel().retrieveOrCreateContextForSuper(op, context);\n\n\tjava.lang.Boolean idIfCond_39 = false;\n\tidIfCond_39 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(smContext));\n\n\tif( idIfCond_39 ) {\n\n\tsimk.SMMethod staticMethod = ((simk.SMMethod) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(simk.SimkPackage.eINSTANCE.getSMMethod()));\n\n\tstaticMethod.setName(kermeta.standard.helper.StringWrapper.plus(\"super_\", op.getFinalName(context)));\n\n\tstaticMethod.setTypeParameters(\"G\");\n\n\tstaticMethod.setBody(op.createBehaviorJava(context));\n\n\tstaticMethod.setUsages(simk.SMUsage.getByName(\"Super\"));\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<simk.SMMethod>convertAsOrderedSet(context.getSimkModel().getSMMethods()).add(staticMethod);\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<simk.SMMethod>convertAsOrderedSet(smContext.getSMMethods()).add(staticMethod);\n\n\tsimk.SMReturn smReturn = ((simk.SMReturn) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(simk.SimkPackage.eINSTANCE.getSMReturn()));\n\n\tsmReturn.setType(op.getType().createBehaviorJava(context));\n\n\tjava.lang.Boolean idIfCond_40 = false;\n\tidIfCond_40 = ((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.language.structure.StructurePackage.eINSTANCE.getOperation())).isVoidType(smReturn.getType());\n\n\tif( idIfCond_40 ) {\n\n\tsmReturn.setType(\"void\");\n}\n\n\n\tstaticMethod.setSMReturn(smReturn);\n\n\tsimk.SMParameter default_param = ((simk.SMParameter) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(simk.SimkPackage.eINSTANCE.getSMParameter()));\n\n\tdefault_param.setName(\"self\");\n\n\tdefault_param.setType(kermeta.standard.helper.StringWrapper.replace(op.getOwningClass().qualifiedName(), context.getKERMETA_SEPARATOR(), context.getJAVA_SEPARATOR()));\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<simk.SMParameter>convertAsOrderedSet(staticMethod.getSMParameters()).add(default_param);\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Parameter> it_ft16 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Parameter>convertAsOrderedSet(op.getOwnedParameter()).iterator();\n\tjava.lang.Boolean idLoopCond_41 = false;\n\twhile( !idLoopCond_41 ) {\n\tidLoopCond_41 = it_ft16.isOff();\n\tif ( idLoopCond_41 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Parameter p_lbdExp16 = it_ft16.next();\n\n\tsimk.SMParameter param = ((simk.SMParameter) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(simk.SimkPackage.eINSTANCE.getSMParameter()));\n\n\tparam.setName(p_lbdExp16.getName());\n\n\tjava.lang.Boolean idIfCond_42 = false;\n\tidIfCond_42 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(p_lbdExp16.getType(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.FunctionType\")));\n\n\tif( idIfCond_42 ) {\n\n\tparam.setType(p_lbdExp16.getType().createBehaviorJava(context));\n\n\tjava.lang.Boolean idIfCond_43 = false;\n\tidIfCond_43 = ((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.language.structure.StructurePackage.eINSTANCE.getOperation())).isVoidType(param.getType());\n\n\tif( idIfCond_43 ) {\n\n\tparam.setType(\"void\");\n}\n\n}\n else {\n}\n\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<simk.SMParameter>convertAsOrderedSet(staticMethod.getSMParameters()).add(param);\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n}\n\n'"
	 * @generated
	 */
	void compileStaticOperation(Operation op, KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\necore.EAnnotation result = null;\n\n\tecore.EAnnotation ecoreAnnotation = ((ecore.EAnnotation) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(ecore.EcorePackage.eINSTANCE.getEAnnotation()));\n\n\tecoreAnnotation.setSource(\"ModelingUnit\");\n\n\tecore.EStringToStringMapEntry requireEntry = ((ecore.EStringToStringMapEntry) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(ecore.EcorePackage.eINSTANCE.getEStringToStringMapEntry()));\n\n\trequireEntry.setKey(\"require\");\n\n\trequireEntry.setValue(\"\");\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EStringToStringMapEntry>convertAsOrderedSet(ecoreAnnotation.getDetails()).add(requireEntry);\n\n\tecore.EStringToStringMapEntry usingEntry = ((ecore.EStringToStringMapEntry) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(ecore.EcorePackage.eINSTANCE.getEStringToStringMapEntry()));\n\n\tusingEntry.setKey(\"using\");\n\n\tusingEntry.setValue(\"\");\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EStringToStringMapEntry>convertAsOrderedSet(ecoreAnnotation.getDetails()).add(usingEntry);\n\n\tresult = ecoreAnnotation;\n\nreturn result;\n'"
	 * @generated
	 */
	EAnnotation createEcoreModelElement(KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.standard.OrderedSet<kermeta.language.structure.Package> result = null;\n\n\tresult = ((kermeta.standard.OrderedSet<kermeta.language.structure.Package>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.standard.StandardPackage.eINSTANCE.getOrderedSet()));\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Package> it_ft17 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Package>convertAsOrderedSet(this.getPackages()).iterator();\n\tjava.lang.Boolean idLoopCond_44 = false;\n\twhile( !idLoopCond_44 ) {\n\tidLoopCond_44 = it_ft17.isOff();\n\tif ( idLoopCond_44 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Package p_lbdExp17 = it_ft17.next();\n\n\tresult.add(p_lbdExp17);\n\n\tresult.addAll(p_lbdExp17.getAllSubPackages());\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\nreturn result;\n'"
	 * @generated
	 */
	OrderedSet<kermeta.language.structure.Package> getAllPackages();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model qnameDataType="kermeta.standard.JavaString"
	 *        annotation="kermeta documentation='/**\r\n\t * Get a TypeDefinition contained in the given Modeling Unit by qualifiedName\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.language.structure.TypeDefinition result = null;\n\n\tkermeta.standard.Sequence<java.lang.String> set_qname = kermeta.standard.helper.StringWrapper.split(qname, \"::\");\n\n\tjava.lang.Boolean idIfCond_45 = false;\n\tidIfCond_45 = kermeta.standard.helper.IntegerWrapper.equals(set_qname.size(), 0);\n\n\tif( idIfCond_45 ) {\n\n\tset_qname.add(qname);\n}\n\n\n\tkermeta.language.structure.Package pack = null;\n//BIft:detect\n\nkermeta.language.structure.Package result_ft18 = null;\n\n\tkermeta.language.structure.Package elem_ft18 = null;\n\n\tresult_ft18 = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Package> it_ft18 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Package>convertAsOrderedSet(this.getPackages()).iterator();\n\tjava.lang.Boolean idLoopCond_46 = false;\n\twhile( !idLoopCond_46 ) {\n\tidLoopCond_46 = kermeta.standard.helper.BooleanWrapper.or(it_ft18.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(result_ft18, null));\n\tif ( idLoopCond_46 ) {\n\t} else {\n\n\telem_ft18 = it_ft18.next();\n\n\tjava.lang.Boolean idIfCond_47 = false;\n//BIle:detector\nkermeta.language.structure.Package p_lbdExp18 = elem_ft18;\n\n\tidIfCond_47 = kermeta.standard.helper.StringWrapper.equals(p_lbdExp18.getName(), set_qname.at(0));\n//EIle:detector\n\n\n\tif( idIfCond_47 ) {\n\n\tresult_ft18 = elem_ft18;\n}\n\n}\n\t}\n}\n\n\n//CE\npack = result_ft18;\n//EIft:detect\n;\n\n\t\n{\n\n\tjava.lang.Integer i = 1;\n\tjava.lang.Boolean idLoopCond_48 = false;\n\twhile( !idLoopCond_48 ) {\n\tidLoopCond_48 = kermeta.standard.helper.IntegerWrapper.isGreaterOrEqual(i, kermeta.standard.helper.IntegerWrapper.minus(set_qname.size(), 1));\n\tif ( idLoopCond_48 ) {\n\t} else {\n\n\t//BIft:detect\n\nkermeta.language.structure.Package result_ft19 = null;\n\n\tkermeta.language.structure.Package elem_ft19 = null;\n\n\tresult_ft19 = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Package> it_ft19 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Package>convertAsOrderedSet(pack.getNestedPackage()).iterator();\n\tjava.lang.Boolean idLoopCond_49 = false;\n\twhile( !idLoopCond_49 ) {\n\tidLoopCond_49 = kermeta.standard.helper.BooleanWrapper.or(it_ft19.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(result_ft19, null));\n\tif ( idLoopCond_49 ) {\n\t} else {\n\n\telem_ft19 = it_ft19.next();\n\n\tjava.lang.Boolean idIfCond_50 = false;\n//BIle:detector\nkermeta.language.structure.Package p_lbdExp19 = elem_ft19;\n\n\tidIfCond_50 = kermeta.standard.helper.StringWrapper.equals(p_lbdExp19.getName(), set_qname.at(i));\n//EIle:detector\n\n\n\tif( idIfCond_50 ) {\n\n\tresult_ft19 = elem_ft19;\n}\n\n}\n\t}\n}\n\n\n//CE\npack = result_ft19;\n//EIft:detect\n\n\n\ti = kermeta.standard.helper.IntegerWrapper.plus(i, 1);\n}\n\t}\n}\n\n\n\t//BIft:detect\n\nkermeta.language.structure.TypeDefinition result_ft20 = null;\n\n\tkermeta.language.structure.TypeDefinition elem_ft20 = null;\n\n\tresult_ft20 = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.TypeDefinition> it_ft20 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.TypeDefinition>convertAsOrderedSet(pack.getOwnedTypeDefinition()).iterator();\n\tjava.lang.Boolean idLoopCond_51 = false;\n\twhile( !idLoopCond_51 ) {\n\tidLoopCond_51 = kermeta.standard.helper.BooleanWrapper.or(it_ft20.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(result_ft20, null));\n\tif ( idLoopCond_51 ) {\n\t} else {\n\n\telem_ft20 = it_ft20.next();\n\n\tjava.lang.Boolean idIfCond_52 = false;\n//BIle:detector\nkermeta.language.structure.TypeDefinition c_lbdExp20 = elem_ft20;\n\n\tidIfCond_52 = kermeta.standard.helper.StringWrapper.equals(c_lbdExp20.getName(), set_qname.at(kermeta.standard.helper.IntegerWrapper.minus(set_qname.size(), 1)));\n//EIle:detector\n\n\n\tif( idIfCond_52 ) {\n\n\tresult_ft20 = elem_ft20;\n}\n\n}\n\t}\n}\n\n\n//CE\nresult = result_ft20;\n//EIft:detect\n\n\nreturn result;\n'"
	 * @generated
	 */
	TypeDefinition getTypeDefinitionByQualifiedName(String qname);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta superOperation='kermeta::language::structure::Object'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\t//BIft:eachOwnedElement\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Tag> it_ft22 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Tag>convertAsOrderedSet(this.getOwnedTags()).iterator();\n\tjava.lang.Boolean idLoopCond_53 = false;\n\twhile( !idLoopCond_53 ) {\n\tidLoopCond_53 = it_ft22.isOff();\n\tif ( idLoopCond_53 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Tag o_lbdExp22 = it_ft22.next();\n\n\t//BIle:func\nkermeta.language.structure.Tag p_lbdExp21 = o_lbdExp22;\n\n\tp_lbdExp21.applyPass2BehaviorJava(context);\n//EIle:func\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Require> it_ft23 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Require>convertAsOrderedSet(this.getRequires()).iterator();\n\tjava.lang.Boolean idLoopCond_54 = false;\n\twhile( !idLoopCond_54 ) {\n\tidLoopCond_54 = it_ft23.isOff();\n\tif ( idLoopCond_54 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Require p_lbdExp23 = it_ft23.next();\n\n\t//BIle:func\nkermeta.language.structure.Require p_lbdExp21 = p_lbdExp23;\n\n\tp_lbdExp21.applyPass2BehaviorJava(context);\n//EIle:func\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Using> it_ft24 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Using>convertAsOrderedSet(this.getUsings()).iterator();\n\tjava.lang.Boolean idLoopCond_55 = false;\n\twhile( !idLoopCond_55 ) {\n\tidLoopCond_55 = it_ft24.isOff();\n\tif ( idLoopCond_55 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Using p_lbdExp24 = it_ft24.next();\n\n\t//BIle:func\nkermeta.language.structure.Using p_lbdExp21 = p_lbdExp24;\n\n\tp_lbdExp21.applyPass2BehaviorJava(context);\n//EIle:func\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Package> it_ft25 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Package>convertAsOrderedSet(this.getPackages()).iterator();\n\tjava.lang.Boolean idLoopCond_56 = false;\n\twhile( !idLoopCond_56 ) {\n\tidLoopCond_56 = it_ft25.isOff();\n\tif ( idLoopCond_56 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Package p_lbdExp25 = it_ft25.next();\n\n\t//BIle:func\nkermeta.language.structure.Package p_lbdExp21 = p_lbdExp25;\n\n\tp_lbdExp21.applyPass2BehaviorJava(context);\n//EIle:func\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n//EIft:eachOwnedElement\n\n'"
	 * @generated
	 */
	void applyPass2BehaviorJava(KM2EcoreContext context);

} // ModelingUnit
