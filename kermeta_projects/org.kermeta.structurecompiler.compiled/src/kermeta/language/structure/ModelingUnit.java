/**
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * 
 * Generating with Kermeta <http://www.kermeta.org>
 *
 * $Id: ModelingUnit.java,v 1.12 2009-02-23 15:26:48 cfaucher Exp $
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
	 * @model annotation="kermeta documentation='To be written'"
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.language.structure.Package result = null;\n\n\tresult = null;\n\n\tkermeta.standard.Sequence<java.lang.String> set_qname = kermeta.standard.helper.StringWrapper.split(qname, \"::\");\n\n\tjava.lang.Boolean idIfCond_100 = false;\n\tidIfCond_100 = kermeta.standard.helper.IntegerWrapper.equals(set_qname.size(), 0);\n\n\tif( idIfCond_100 ) {\n\n\tset_qname.add(qname);\n}\n\n\n\tkermeta.language.structure.Package pack = null;\n//BIft:detect\n\nkermeta.language.structure.Package result_ft32 = null;\n\n\tkermeta.language.structure.Package elem_ft32 = null;\n\n\tresult_ft32 = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Package> it_ft32 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Package>convertAsOrderedSet(this.getPackages()).iterator();\n\tjava.lang.Boolean idLoopCond_101 = false;\n\twhile( !idLoopCond_101 ) {\n\tidLoopCond_101 = kermeta.standard.helper.BooleanWrapper.or(it_ft32.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(result_ft32, null));\n\tif ( idLoopCond_101 ) {\n\t} else {\n\n\telem_ft32 = it_ft32.next();\n\n\tjava.lang.Boolean idIfCond_102 = false;\n//BIle:detector\nkermeta.language.structure.Package p_lbdExp32 = elem_ft32;\n\n\tidIfCond_102 = kermeta.standard.helper.StringWrapper.equals(p_lbdExp32.getName(), set_qname.at(0));\n//EIle:detector\n\n\n\tif( idIfCond_102 ) {\n\n\tresult_ft32 = elem_ft32;\n}\n\n}\n\t}\n}\n\n\n//CE\npack = result_ft32;\n//EIft:detect\n;\n\n\tjava.lang.Boolean idIfCond_103 = false;\n\tidIfCond_103 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(pack));\n\n\tif( idIfCond_103 ) {\n\n\t\n{\n\n\tjava.lang.Integer i = 1;\n\tjava.lang.Boolean idLoopCond_104 = false;\n\twhile( !idLoopCond_104 ) {\n\tidLoopCond_104 = kermeta.standard.helper.IntegerWrapper.isGreaterOrEqual(i, set_qname.size());\n\tif ( idLoopCond_104 ) {\n\t} else {\n\n\t//BIft:detect\n\nkermeta.language.structure.Package result_ft33 = null;\n\n\tkermeta.language.structure.Package elem_ft33 = null;\n\n\tresult_ft33 = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Package> it_ft33 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Package>convertAsOrderedSet(pack.getNestedPackage()).iterator();\n\tjava.lang.Boolean idLoopCond_105 = false;\n\twhile( !idLoopCond_105 ) {\n\tidLoopCond_105 = kermeta.standard.helper.BooleanWrapper.or(it_ft33.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(result_ft33, null));\n\tif ( idLoopCond_105 ) {\n\t} else {\n\n\telem_ft33 = it_ft33.next();\n\n\tjava.lang.Boolean idIfCond_106 = false;\n//BIle:detector\nkermeta.language.structure.Package p_lbdExp33 = elem_ft33;\n\n\tidIfCond_106 = kermeta.standard.helper.StringWrapper.equals(p_lbdExp33.getName(), set_qname.at(i));\n//EIle:detector\n\n\n\tif( idIfCond_106 ) {\n\n\tresult_ft33 = elem_ft33;\n}\n\n}\n\t}\n}\n\n\n//CE\npack = result_ft33;\n//EIft:detect\n\n\n\ti = kermeta.standard.helper.IntegerWrapper.plus(i, 1);\n}\n\t}\n}\n\n\n\tresult = pack;\n}\n\n\nreturn result;\n'"
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tecore.EAnnotation ecoreAnnotation = this.createEcoreModelElement(context);\n\n\tthis.setEcoreModelElement(ecoreAnnotation);\n\n\t//BIft:eachOwnedElement\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Tag> it_ft35 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Tag>convertAsOrderedSet(this.getOwnedTags()).iterator();\n\tjava.lang.Boolean idLoopCond_107 = false;\n\twhile( !idLoopCond_107 ) {\n\tidLoopCond_107 = it_ft35.isOff();\n\tif ( idLoopCond_107 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Tag o_lbdExp35 = it_ft35.next();\n\n\t//BIle:func\nkermeta.language.structure.Tag p_lbdExp34 = o_lbdExp35;\n\n\tp_lbdExp34.applyPass1(context);\n//EIle:func\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Require> it_ft36 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Require>convertAsOrderedSet(this.getRequires()).iterator();\n\tjava.lang.Boolean idLoopCond_108 = false;\n\twhile( !idLoopCond_108 ) {\n\tidLoopCond_108 = it_ft36.isOff();\n\tif ( idLoopCond_108 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Require p_lbdExp36 = it_ft36.next();\n\n\t//BIle:func\nkermeta.language.structure.Require p_lbdExp34 = p_lbdExp36;\n\n\tp_lbdExp34.applyPass1(context);\n//EIle:func\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Using> it_ft37 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Using>convertAsOrderedSet(this.getUsings()).iterator();\n\tjava.lang.Boolean idLoopCond_109 = false;\n\twhile( !idLoopCond_109 ) {\n\tidLoopCond_109 = it_ft37.isOff();\n\tif ( idLoopCond_109 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Using p_lbdExp37 = it_ft37.next();\n\n\t//BIle:func\nkermeta.language.structure.Using p_lbdExp34 = p_lbdExp37;\n\n\tp_lbdExp34.applyPass1(context);\n//EIle:func\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Package> it_ft38 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Package>convertAsOrderedSet(this.getPackages()).iterator();\n\tjava.lang.Boolean idLoopCond_110 = false;\n\twhile( !idLoopCond_110 ) {\n\tidLoopCond_110 = it_ft38.isOff();\n\tif ( idLoopCond_110 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Package p_lbdExp38 = it_ft38.next();\n\n\t//BIle:func\nkermeta.language.structure.Package p_lbdExp34 = p_lbdExp38;\n\n\tp_lbdExp34.applyPass1(context);\n//EIle:func\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n//EIft:eachOwnedElement\n\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Package> it_ft39 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Package>convertAsOrderedSet(this.getPackages()).iterator();\n\tjava.lang.Boolean idLoopCond_111 = false;\n\twhile( !idLoopCond_111 ) {\n\tidLoopCond_111 = it_ft39.isOff();\n\tif ( idLoopCond_111 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Package p_lbdExp39 = it_ft39.next();\n\n\tkermeta.standard.Sequence<ecore.EPackage> eps = null;\n//BIft:select\n\nkermeta.standard.Sequence<ecore.EPackage> result_ft40 = null;\n\n\tecore.EPackage elem_ft40 = null;\n\n\tresult_ft40 = ((kermeta.standard.Sequence<ecore.EPackage>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.standard.StandardPackage.eINSTANCE.getSequence()));\n\n\t\n{\n\n\tkermeta.standard.Iterator<ecore.EPackage> it_ft40 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EPackage>convertAsOrderedSet(this.getEcorePackages()).iterator();\n\tjava.lang.Boolean idLoopCond_112 = false;\n\twhile( !idLoopCond_112 ) {\n\tidLoopCond_112 = it_ft40.isOff();\n\tif ( idLoopCond_112 ) {\n\t} else {\n\n\telem_ft40 = it_ft40.next();\n\n\tjava.lang.Boolean idIfCond_113 = false;\n//BIle:selector\necore.EPackage ep_lbdExp40 = elem_ft40;\n\n\tidIfCond_113 = kermeta.standard.helper.StringWrapper.equals(kermeta.standard.helper.StringWrapper.toLowerCase(p_lbdExp39.getName()), kermeta.standard.helper.StringWrapper.toLowerCase(ep_lbdExp40.getName()));\n//EIle:selector\n\n\n\tif( idIfCond_113 ) {\n\n\tresult_ft40.add(elem_ft40);\n}\n\n}\n\t}\n}\n\n\n//CE\neps = result_ft40;\n//EIft:select\n;\n\n\tjava.lang.Boolean idIfCond_114 = false;\n\tidIfCond_114 = kermeta.standard.helper.IntegerWrapper.isGreater(eps.size(), 0);\n\n\tif( idIfCond_114 ) {\n\n\tjava.lang.Boolean idIfCond_115 = false;\n\tidIfCond_115 = kermeta.standard.helper.IntegerWrapper.equals(eps.size(), 1);\n\n\tif( idIfCond_115 ) {\n\n\t//BIft:detect\n\nkermeta.language.structure.Package result_ft41 = null;\n\n\tkermeta.language.structure.Package elem_ft41 = null;\n\n\tresult_ft41 = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Package> it_ft41 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Package>convertAsOrderedSet(this.getPackages()).iterator();\n\tjava.lang.Boolean idLoopCond_116 = false;\n\twhile( !idLoopCond_116 ) {\n\tidLoopCond_116 = kermeta.standard.helper.BooleanWrapper.or(it_ft41.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(result_ft41, null));\n\tif ( idLoopCond_116 ) {\n\t} else {\n\n\telem_ft41 = it_ft41.next();\n\n\tjava.lang.Boolean idIfCond_117 = false;\n//BIle:detector\nkermeta.language.structure.Package pack_lbdExp41 = elem_ft41;\n\n\tidIfCond_117 = kermeta.standard.helper.StringWrapper.equals(kermeta.standard.helper.StringWrapper.toLowerCase(pack_lbdExp41.getName()), kermeta.standard.helper.StringWrapper.toLowerCase(p_lbdExp39.getName()));\n//EIle:detector\n\n\n\tif( idIfCond_117 ) {\n\n\tresult_ft41 = elem_ft41;\n}\n\n}\n\t}\n}\n\n//EIft:detect\nresult_ft41.setGenModelBasePackage(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.toLowerCase(p_lbdExp39.getName()), \"0\"));\n}\n\n\n\tp_lbdExp39.setGenModelBasePackage(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.toLowerCase(p_lbdExp39.getName()), kermeta.standard.helper.IntegerWrapper.toString(eps.size())));\n}\n\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EPackage>convertAsOrderedSet(this.getEcorePackages()).add(p_lbdExp39.getEcoreModelElement());\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n'"
	 * @generated
	 */
	void applyPass1(KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\r\n\t * Compilation of super operations is only mandatory when kermeta code is using super methods from classes converted into Java interfaces\r\n\t * Super operation are declared static in Java code\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Operation> it_ft42 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Operation>convertAsOrderedSet(this.getSuperOperationsToCompileInHelper()).iterator();\n\tjava.lang.Boolean idLoopCond_118 = false;\n\twhile( !idLoopCond_118 ) {\n\tidLoopCond_118 = it_ft42.isOff();\n\tif ( idLoopCond_118 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Operation op_lbdExp42 = it_ft42.next();\n\n\tjava.lang.Boolean staticOperationMode_backup = context.getStaticOperationMode();\n\n\tcontext.setStaticOperationMode(true);\n\n\tthis.compileStaticOperation(op_lbdExp42, context);\n\n\tcontext.setStaticOperationMode(staticOperationMode_backup);\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n'"
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\necore.EClassifier result = null;\n\n\tresult = null;\n\n\tkermeta.standard.Sequence<java.lang.String> set_qname = kermeta.standard.helper.StringWrapper.split(qname, \"::\");\n\n\tjava.lang.Boolean idIfCond_119 = false;\n\tidIfCond_119 = kermeta.standard.helper.IntegerWrapper.equals(set_qname.size(), 0);\n\n\tif( idIfCond_119 ) {\n\n\tset_qname.add(qname);\n}\n\n\n\tecore.EPackage pack = null;\n//BIft:detect\n\necore.EPackage result_ft43 = null;\n\n\tecore.EPackage elem_ft43 = null;\n\n\tresult_ft43 = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<ecore.EPackage> it_ft43 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EPackage>convertAsOrderedSet(this.getEcorePackages()).iterator();\n\tjava.lang.Boolean idLoopCond_120 = false;\n\twhile( !idLoopCond_120 ) {\n\tidLoopCond_120 = kermeta.standard.helper.BooleanWrapper.or(it_ft43.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(result_ft43, null));\n\tif ( idLoopCond_120 ) {\n\t} else {\n\n\telem_ft43 = it_ft43.next();\n\n\tjava.lang.Boolean idIfCond_121 = false;\n//BIle:detector\necore.EPackage p_lbdExp43 = elem_ft43;\n\n\tidIfCond_121 = kermeta.standard.helper.StringWrapper.equals(p_lbdExp43.getName(), set_qname.at(0));\n//EIle:detector\n\n\n\tif( idIfCond_121 ) {\n\n\tresult_ft43 = elem_ft43;\n}\n\n}\n\t}\n}\n\n\n//CE\npack = result_ft43;\n//EIft:detect\n;\n\n\tjava.lang.Boolean idIfCond_122 = false;\n\tidIfCond_122 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(pack));\n\n\tif( idIfCond_122 ) {\n\n\t\n{\n\n\tjava.lang.Integer i = 1;\n\tjava.lang.Boolean idLoopCond_123 = false;\n\twhile( !idLoopCond_123 ) {\n\tidLoopCond_123 = kermeta.standard.helper.IntegerWrapper.isGreaterOrEqual(i, kermeta.standard.helper.IntegerWrapper.minus(set_qname.size(), 1));\n\tif ( idLoopCond_123 ) {\n\t} else {\n\n\t//BIft:detect\n\necore.EPackage result_ft44 = null;\n\n\tecore.EPackage elem_ft44 = null;\n\n\tresult_ft44 = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<ecore.EPackage> it_ft44 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EPackage>convertAsOrderedSet(pack.getESubpackages()).iterator();\n\tjava.lang.Boolean idLoopCond_124 = false;\n\twhile( !idLoopCond_124 ) {\n\tidLoopCond_124 = kermeta.standard.helper.BooleanWrapper.or(it_ft44.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(result_ft44, null));\n\tif ( idLoopCond_124 ) {\n\t} else {\n\n\telem_ft44 = it_ft44.next();\n\n\tjava.lang.Boolean idIfCond_125 = false;\n//BIle:detector\necore.EPackage p_lbdExp44 = elem_ft44;\n\n\tidIfCond_125 = kermeta.standard.helper.StringWrapper.equals(p_lbdExp44.getName(), set_qname.at(i));\n//EIle:detector\n\n\n\tif( idIfCond_125 ) {\n\n\tresult_ft44 = elem_ft44;\n}\n\n}\n\t}\n}\n\n\n//CE\npack = result_ft44;\n//EIft:detect\n\n\n\ti = kermeta.standard.helper.IntegerWrapper.plus(i, 1);\n}\n\t}\n}\n\n\n\t//BIft:detect\n\necore.EClassifier result_ft45 = null;\n\n\tecore.EClassifier elem_ft45 = null;\n\n\tresult_ft45 = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<ecore.EClassifier> it_ft45 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EClassifier>convertAsOrderedSet(pack.getEClassifiers()).iterator();\n\tjava.lang.Boolean idLoopCond_126 = false;\n\twhile( !idLoopCond_126 ) {\n\tidLoopCond_126 = kermeta.standard.helper.BooleanWrapper.or(it_ft45.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(result_ft45, null));\n\tif ( idLoopCond_126 ) {\n\t} else {\n\n\telem_ft45 = it_ft45.next();\n\n\tjava.lang.Boolean idIfCond_127 = false;\n//BIle:detector\necore.EClassifier c_lbdExp45 = elem_ft45;\n\n\tidIfCond_127 = kermeta.standard.helper.StringWrapper.equals(c_lbdExp45.getName(), set_qname.at(kermeta.standard.helper.IntegerWrapper.minus(set_qname.size(), 1)));\n//EIle:detector\n\n\n\tif( idIfCond_127 ) {\n\n\tresult_ft45 = elem_ft45;\n}\n\n}\n\t}\n}\n\n\n//CE\nresult = result_ft45;\n//EIft:detect\n\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	EClassifier getEClassifierByQualifiedName(String qname);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tjava.lang.Boolean idIfCond_128 = false;\n\tidIfCond_128 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(this.getEClassifierByQualifiedName(\"ecore::EObject\")));\n\n\tif( idIfCond_128 ) {\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EOperation>convertAsOrderedSet(((ecore.EClass) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(this.getEClassifierByQualifiedName(\"ecore::EObject\"), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"ecore.EClass\"))).getEOperations()).clear();\n}\n\n'"
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
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tsimk.SMContext smContext = context.getSimkModel().retrieveOrCreateContextForSuper(op, context);\n\n\tjava.lang.Boolean idIfCond_129 = false;\n\tidIfCond_129 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(smContext));\n\n\tif( idIfCond_129 ) {\n\n\tsimk.SMMethod staticMethod = ((simk.SMMethod) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(simk.SimkPackage.eINSTANCE.getSMMethod()));\n\n\tstaticMethod.setName(kermeta.standard.helper.StringWrapper.plus(\"super_\", op.getFinalName(context)));\n\n\tstaticMethod.setTypeParameters(\"G\");\n\n\tstaticMethod.setBody(op.createBehaviorJava(context));\n\n\tstaticMethod.setUsages(simk.SMUsage.getByName(\"Super\"));\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<simk.SMMethod>convertAsOrderedSet(context.getSimkModel().getSMMethods()).add(staticMethod);\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<simk.SMMethod>convertAsOrderedSet(smContext.getSMMethods()).add(staticMethod);\n\n\tsimk.SMReturn smReturn = ((simk.SMReturn) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(simk.SimkPackage.eINSTANCE.getSMReturn()));\n\n\tsmReturn.setType(op.getType().createBehaviorJava(context));\n\n\tjava.lang.Boolean idIfCond_130 = false;\n\tidIfCond_130 = ((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.language.structure.StructurePackage.eINSTANCE.getOperation())).isVoidType(smReturn.getType());\n\n\tif( idIfCond_130 ) {\n\n\tsmReturn.setType(\"void\");\n}\n\n\n\tstaticMethod.setSMReturn(smReturn);\n\n\tsimk.SMParameter default_param = ((simk.SMParameter) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(simk.SimkPackage.eINSTANCE.getSMParameter()));\n\n\tdefault_param.setName(\"self\");\n\n\tdefault_param.setType(kermeta.standard.helper.StringWrapper.replace(op.getOwningClass().qualifiedName(), context.getKERMETA_SEPARATOR(), context.getJAVA_SEPARATOR()));\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<simk.SMParameter>convertAsOrderedSet(staticMethod.getSMParameters()).add(default_param);\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Parameter> it_ft46 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Parameter>convertAsOrderedSet(op.getOwnedParameter()).iterator();\n\tjava.lang.Boolean idLoopCond_131 = false;\n\twhile( !idLoopCond_131 ) {\n\tidLoopCond_131 = it_ft46.isOff();\n\tif ( idLoopCond_131 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Parameter p_lbdExp46 = it_ft46.next();\n\n\tsimk.SMParameter param = ((simk.SMParameter) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(simk.SimkPackage.eINSTANCE.getSMParameter()));\n\n\tparam.setName(p_lbdExp46.getName());\n\n\tjava.lang.Boolean idIfCond_132 = false;\n\tidIfCond_132 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(p_lbdExp46.getType(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.FunctionType\")));\n\n\tif( idIfCond_132 ) {\n\n\tparam.setType(p_lbdExp46.getType().createBehaviorJava(context));\n\n\tjava.lang.Boolean idIfCond_133 = false;\n\tidIfCond_133 = ((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.language.structure.StructurePackage.eINSTANCE.getOperation())).isVoidType(param.getType());\n\n\tif( idIfCond_133 ) {\n\n\tparam.setType(\"void\");\n}\n\n}\n else {\n}\n\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<simk.SMParameter>convertAsOrderedSet(staticMethod.getSMParameters()).add(param);\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n}\n\n'"
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.standard.OrderedSet<kermeta.language.structure.Package> result = null;\n\n\tresult = ((kermeta.standard.OrderedSet<kermeta.language.structure.Package>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.standard.StandardPackage.eINSTANCE.getOrderedSet()));\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Package> it_ft47 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Package>convertAsOrderedSet(this.getPackages()).iterator();\n\tjava.lang.Boolean idLoopCond_134 = false;\n\twhile( !idLoopCond_134 ) {\n\tidLoopCond_134 = it_ft47.isOff();\n\tif ( idLoopCond_134 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Package p_lbdExp47 = it_ft47.next();\n\n\tresult.add(p_lbdExp47);\n\n\tresult.addAll(p_lbdExp47.getAllSubPackages());\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\nreturn result;\n'"
	 * @generated
	 */
	OrderedSet<kermeta.language.structure.Package> getAllPackages();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta superOperation='kermeta::language::structure::Object'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\t//BIft:eachOwnedElement\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Tag> it_ft49 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Tag>convertAsOrderedSet(this.getOwnedTags()).iterator();\n\tjava.lang.Boolean idLoopCond_135 = false;\n\twhile( !idLoopCond_135 ) {\n\tidLoopCond_135 = it_ft49.isOff();\n\tif ( idLoopCond_135 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Tag o_lbdExp49 = it_ft49.next();\n\n\t//BIle:func\nkermeta.language.structure.Tag p_lbdExp48 = o_lbdExp49;\n\n\tp_lbdExp48.applyPass2BehaviorJava(context);\n//EIle:func\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Require> it_ft50 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Require>convertAsOrderedSet(this.getRequires()).iterator();\n\tjava.lang.Boolean idLoopCond_136 = false;\n\twhile( !idLoopCond_136 ) {\n\tidLoopCond_136 = it_ft50.isOff();\n\tif ( idLoopCond_136 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Require p_lbdExp50 = it_ft50.next();\n\n\t//BIle:func\nkermeta.language.structure.Require p_lbdExp48 = p_lbdExp50;\n\n\tp_lbdExp48.applyPass2BehaviorJava(context);\n//EIle:func\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Using> it_ft51 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Using>convertAsOrderedSet(this.getUsings()).iterator();\n\tjava.lang.Boolean idLoopCond_137 = false;\n\twhile( !idLoopCond_137 ) {\n\tidLoopCond_137 = it_ft51.isOff();\n\tif ( idLoopCond_137 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Using p_lbdExp51 = it_ft51.next();\n\n\t//BIle:func\nkermeta.language.structure.Using p_lbdExp48 = p_lbdExp51;\n\n\tp_lbdExp48.applyPass2BehaviorJava(context);\n//EIle:func\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Package> it_ft52 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Package>convertAsOrderedSet(this.getPackages()).iterator();\n\tjava.lang.Boolean idLoopCond_138 = false;\n\twhile( !idLoopCond_138 ) {\n\tidLoopCond_138 = it_ft52.isOff();\n\tif ( idLoopCond_138 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Package p_lbdExp52 = it_ft52.next();\n\n\t//BIle:func\nkermeta.language.structure.Package p_lbdExp48 = p_lbdExp52;\n\n\tp_lbdExp48.applyPass2BehaviorJava(context);\n//EIle:func\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n//EIft:eachOwnedElement\n\n'"
	 * @generated
	 */
	void applyPass2BehaviorJava(KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model qnameDataType="kermeta.standard.JavaString"
	 *        annotation="kermeta documentation='/**\r\n\t * Get a TypeDefinition contained in the given Modeling Unit by qualifiedName\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.language.structure.TypeDefinition result = null;\n\n\tkermeta.standard.Sequence<java.lang.String> set_qname = kermeta.standard.helper.StringWrapper.split(qname, \"::\");\n\n\tjava.lang.Boolean idIfCond_139 = false;\n\tidIfCond_139 = kermeta.standard.helper.IntegerWrapper.equals(set_qname.size(), 0);\n\n\tif( idIfCond_139 ) {\n\n\tset_qname.add(qname);\n}\n\n\n\tkermeta.language.structure.Package pack = null;\n//BIft:detect\n\nkermeta.language.structure.Package result_ft53 = null;\n\n\tkermeta.language.structure.Package elem_ft53 = null;\n\n\tresult_ft53 = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Package> it_ft53 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Package>convertAsOrderedSet(this.getPackages()).iterator();\n\tjava.lang.Boolean idLoopCond_140 = false;\n\twhile( !idLoopCond_140 ) {\n\tidLoopCond_140 = kermeta.standard.helper.BooleanWrapper.or(it_ft53.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(result_ft53, null));\n\tif ( idLoopCond_140 ) {\n\t} else {\n\n\telem_ft53 = it_ft53.next();\n\n\tjava.lang.Boolean idIfCond_141 = false;\n//BIle:detector\nkermeta.language.structure.Package p_lbdExp53 = elem_ft53;\n\n\tidIfCond_141 = kermeta.standard.helper.StringWrapper.equals(p_lbdExp53.getName(), set_qname.at(0));\n//EIle:detector\n\n\n\tif( idIfCond_141 ) {\n\n\tresult_ft53 = elem_ft53;\n}\n\n}\n\t}\n}\n\n\n//CE\npack = result_ft53;\n//EIft:detect\n;\n\n\t\n{\n\n\tjava.lang.Integer i = 1;\n\tjava.lang.Boolean idLoopCond_142 = false;\n\twhile( !idLoopCond_142 ) {\n\tidLoopCond_142 = kermeta.standard.helper.IntegerWrapper.isGreaterOrEqual(i, kermeta.standard.helper.IntegerWrapper.minus(set_qname.size(), 1));\n\tif ( idLoopCond_142 ) {\n\t} else {\n\n\t//BIft:detect\n\nkermeta.language.structure.Package result_ft54 = null;\n\n\tkermeta.language.structure.Package elem_ft54 = null;\n\n\tresult_ft54 = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Package> it_ft54 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Package>convertAsOrderedSet(pack.getNestedPackage()).iterator();\n\tjava.lang.Boolean idLoopCond_143 = false;\n\twhile( !idLoopCond_143 ) {\n\tidLoopCond_143 = kermeta.standard.helper.BooleanWrapper.or(it_ft54.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(result_ft54, null));\n\tif ( idLoopCond_143 ) {\n\t} else {\n\n\telem_ft54 = it_ft54.next();\n\n\tjava.lang.Boolean idIfCond_144 = false;\n//BIle:detector\nkermeta.language.structure.Package p_lbdExp54 = elem_ft54;\n\n\tidIfCond_144 = kermeta.standard.helper.StringWrapper.equals(p_lbdExp54.getName(), set_qname.at(i));\n//EIle:detector\n\n\n\tif( idIfCond_144 ) {\n\n\tresult_ft54 = elem_ft54;\n}\n\n}\n\t}\n}\n\n\n//CE\npack = result_ft54;\n//EIft:detect\n\n\n\ti = kermeta.standard.helper.IntegerWrapper.plus(i, 1);\n}\n\t}\n}\n\n\n\t//BIft:detect\n\nkermeta.language.structure.TypeDefinition result_ft55 = null;\n\n\tkermeta.language.structure.TypeDefinition elem_ft55 = null;\n\n\tresult_ft55 = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.TypeDefinition> it_ft55 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.TypeDefinition>convertAsOrderedSet(pack.getOwnedTypeDefinition()).iterator();\n\tjava.lang.Boolean idLoopCond_145 = false;\n\twhile( !idLoopCond_145 ) {\n\tidLoopCond_145 = kermeta.standard.helper.BooleanWrapper.or(it_ft55.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(result_ft55, null));\n\tif ( idLoopCond_145 ) {\n\t} else {\n\n\telem_ft55 = it_ft55.next();\n\n\tjava.lang.Boolean idIfCond_146 = false;\n//BIle:detector\nkermeta.language.structure.TypeDefinition c_lbdExp55 = elem_ft55;\n\n\tidIfCond_146 = kermeta.standard.helper.StringWrapper.equals(c_lbdExp55.getName(), set_qname.at(kermeta.standard.helper.IntegerWrapper.minus(set_qname.size(), 1)));\n//EIle:detector\n\n\n\tif( idIfCond_146 ) {\n\n\tresult_ft55 = elem_ft55;\n}\n\n}\n\t}\n}\n\n\n//CE\nresult = result_ft55;\n//EIft:detect\n\n\nreturn result;\n'"
	 * @generated
	 */
	TypeDefinition getTypeDefinitionByQualifiedName(String qname);

} // ModelingUnit
