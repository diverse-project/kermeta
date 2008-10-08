/**
 * <copyright>
 * </copyright>
 *
 * $Id: ModelingUnit.java,v 1.4 2008-10-08 14:37:43 cfaucher Exp $
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
 *   <li>{@link kermeta.language.structure.ModelingUnit#getIncludeFilters <em>Include Filters</em>}</li>
 *   <li>{@link kermeta.language.structure.ModelingUnit#getPackages <em>Packages</em>}</li>
 *   <li>{@link kermeta.language.structure.ModelingUnit#getExcludeFilters <em>Exclude Filters</em>}</li>
 *   <li>{@link kermeta.language.structure.ModelingUnit#getSuperOperationsToCompileInHelper <em>Super Operations To Compile In Helper</em>}</li>
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.language.structure.Package result = null;\n\n\tresult = null;\n\n\tkermeta.standard.OrderedSet<java.lang.String> set_qname = kermeta.standard.helper.StringWrapper.split(qname, \"::\");\n\n\tjava.lang.Boolean idIfCond_127 = false;\n\tidIfCond_127 = kermeta.standard.helper.IntegerWrapper.equals(set_qname.size(), 0);\n\n\tif( idIfCond_127 ) {\n\n\tset_qname.add(qname);\n}\n\n\n\tkermeta.language.structure.Package pack = null;\n//BIft:detect\n\nkermeta.language.structure.Package result_ft37 = null;\n\n\tkermeta.language.structure.Package elem_ft37 = null;\n\n\tresult_ft37 = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Package> it_ft37 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Package>convertAsOrderedSet(this.getPackages()).iterator();\n\tjava.lang.Boolean idLoopCond_128 = false;\n\twhile( !idLoopCond_128 ) {\n\tidLoopCond_128 = kermeta.standard.helper.BooleanWrapper.or(it_ft37.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqual(result_ft37, null));\n\tif ( idLoopCond_128 ) {\n\t} else {\n\n\telem_ft37 = it_ft37.next();\n\n\tjava.lang.Boolean idIfCond_129 = false;\n//BIle:detector\nkermeta.language.structure.Package p_lbdExp37 = elem_ft37;\n\n\tidIfCond_129 = kermeta.standard.helper.StringWrapper.equals(p_lbdExp37.getName(), set_qname.at(0));\n//EIle:detector\n\n\n\tif( idIfCond_129 ) {\n\n\tresult_ft37 = elem_ft37;\n}\n\n}\n\t}\n}\n\n\n//CE\npack = result_ft37;\n//EIft:detect\n\n\n\tjava.lang.Boolean idIfCond_130 = false;\n\tidIfCond_130 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoid(pack));\n\n\tif( idIfCond_130 ) {\n\n\t\n{\n\n\tjava.lang.Integer i = 1;\n\tjava.lang.Boolean idLoopCond_131 = false;\n\twhile( !idLoopCond_131 ) {\n\tidLoopCond_131 = kermeta.standard.helper.IntegerWrapper.isGreaterOrEqual(i, set_qname.size());\n\tif ( idLoopCond_131 ) {\n\t} else {\n\n\t//BIft:detect\n\nkermeta.language.structure.Package result_ft38 = null;\n\n\tkermeta.language.structure.Package elem_ft38 = null;\n\n\tresult_ft38 = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Package> it_ft38 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Package>convertAsOrderedSet(pack.getNestedPackage()).iterator();\n\tjava.lang.Boolean idLoopCond_132 = false;\n\twhile( !idLoopCond_132 ) {\n\tidLoopCond_132 = kermeta.standard.helper.BooleanWrapper.or(it_ft38.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqual(result_ft38, null));\n\tif ( idLoopCond_132 ) {\n\t} else {\n\n\telem_ft38 = it_ft38.next();\n\n\tjava.lang.Boolean idIfCond_133 = false;\n//BIle:detector\nkermeta.language.structure.Package p_lbdExp38 = elem_ft38;\n\n\tidIfCond_133 = kermeta.standard.helper.StringWrapper.equals(p_lbdExp38.getName(), set_qname.at(i));\n//EIle:detector\n\n\n\tif( idIfCond_133 ) {\n\n\tresult_ft38 = elem_ft38;\n}\n\n}\n\t}\n}\n\n\n//CE\npack = result_ft38;\n//EIft:detect\n\n\n\ti = kermeta.standard.helper.IntegerWrapper.plus(i, 1);\n}\n\t}\n}\n\n\n\tresult = pack;\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	kermeta.language.structure.Package retrievePackage(String qname);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\r\n\t * We cannot use an Alias to define this indiretion because the concept of KRuntimeError does not exist\r\n\t * in framework.ecore, thus we create in this operation a new EDataType that targets the KRuntimeError Java Impl\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tecore.EDataType exception_EDataType = ((ecore.EDataType) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"ecore.EDataType\"));\n\n\texception_EDataType.setName(\"KRuntimeError\");\n\n\texception_EDataType.setInstanceClassName(context.getJAVA_CLASS_EXCEPTION_SWITCHER());\n\n\texception_EDataType.setSerializable(false);\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EClassifier>convertAsOrderedSet(this.retrievePackage(\"kermeta::exceptions\").getEcoreModelElement().getEClassifiers()).add(exception_EDataType);\n'"
	 * @generated
	 */
	void createKRuntimeError(KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta superOperation='kermeta::language::structure::Object'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tecore.EAnnotation ecoreAnnotation = this.createEcoreModelElement(context);\n\n\tthis.setEcoreModelElement(ecoreAnnotation);\n\n\t//BIft:eachOwnedElement\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Tag> it_ft40 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Tag>convertAsOrderedSet(this.getOwnedTags()).iterator();\n\tjava.lang.Boolean idLoopCond_134 = false;\n\twhile( !idLoopCond_134 ) {\n\tidLoopCond_134 = it_ft40.isOff();\n\tif ( idLoopCond_134 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Tag o_lbdExp40 = it_ft40.next();\n\n\t//BIle:func\nkermeta.language.structure.Tag p_lbdExp39 = o_lbdExp40;\n\n\tp_lbdExp39.applyPass1(context);\n//EIle:func\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Require> it_ft41 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Require>convertAsOrderedSet(this.getRequires()).iterator();\n\tjava.lang.Boolean idLoopCond_135 = false;\n\twhile( !idLoopCond_135 ) {\n\tidLoopCond_135 = it_ft41.isOff();\n\tif ( idLoopCond_135 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Require p_lbdExp41 = it_ft41.next();\n\n\t//BIle:func\nkermeta.language.structure.Require p_lbdExp39 = p_lbdExp41;\n\n\tp_lbdExp39.applyPass1(context);\n//EIle:func\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Using> it_ft42 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Using>convertAsOrderedSet(this.getUsings()).iterator();\n\tjava.lang.Boolean idLoopCond_136 = false;\n\twhile( !idLoopCond_136 ) {\n\tidLoopCond_136 = it_ft42.isOff();\n\tif ( idLoopCond_136 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Using p_lbdExp42 = it_ft42.next();\n\n\t//BIle:func\nkermeta.language.structure.Using p_lbdExp39 = p_lbdExp42;\n\n\tp_lbdExp39.applyPass1(context);\n//EIle:func\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Package> it_ft43 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Package>convertAsOrderedSet(this.getPackages()).iterator();\n\tjava.lang.Boolean idLoopCond_137 = false;\n\twhile( !idLoopCond_137 ) {\n\tidLoopCond_137 = it_ft43.isOff();\n\tif ( idLoopCond_137 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Package p_lbdExp43 = it_ft43.next();\n\n\t//BIle:func\nkermeta.language.structure.Package p_lbdExp39 = p_lbdExp43;\n\n\tp_lbdExp39.applyPass1(context);\n//EIle:func\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n//EIft:eachOwnedElement\n\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Package> it_ft44 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Package>convertAsOrderedSet(this.getPackages()).iterator();\n\tjava.lang.Boolean idLoopCond_138 = false;\n\twhile( !idLoopCond_138 ) {\n\tidLoopCond_138 = it_ft44.isOff();\n\tif ( idLoopCond_138 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Package p_lbdExp44 = it_ft44.next();\n\n\tkermeta.standard.Sequence<ecore.EPackage> eps = null;\n//BIft:select\n\nkermeta.standard.Sequence<ecore.EPackage> result_ft45 = null;\n\n\tecore.EPackage elem_ft45 = null;\n\n\tresult_ft45 = ((kermeta.standard.Sequence<ecore.EPackage>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.standard.Sequence<ecore.EPackage>\"));\n\n\t\n{\n\n\tkermeta.standard.Iterator<ecore.EPackage> it_ft45 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EPackage>convertAsOrderedSet(this.getEcorePackages()).iterator();\n\tjava.lang.Boolean idLoopCond_139 = false;\n\twhile( !idLoopCond_139 ) {\n\tidLoopCond_139 = it_ft45.isOff();\n\tif ( idLoopCond_139 ) {\n\t} else {\n\n\telem_ft45 = it_ft45.next();\n\n\tjava.lang.Boolean idIfCond_140 = false;\n//BIle:selector\necore.EPackage ep_lbdExp45 = elem_ft45;\n\n\tidIfCond_140 = kermeta.standard.helper.StringWrapper.equals(kermeta.standard.helper.StringWrapper.toLowerCase(p_lbdExp44.getName()), kermeta.standard.helper.StringWrapper.toLowerCase(ep_lbdExp45.getName()));\n//EIle:selector\n\n\n\tif( idIfCond_140 ) {\n\n\tresult_ft45.add(elem_ft45);\n}\n\n}\n\t}\n}\n\n\n//CE\neps = result_ft45;\n//EIft:select\n\n\n\tjava.lang.Boolean idIfCond_141 = false;\n\tidIfCond_141 = kermeta.standard.helper.IntegerWrapper.isGreater(eps.size(), 0);\n\n\tif( idIfCond_141 ) {\n\n\tjava.lang.Boolean idIfCond_142 = false;\n\tidIfCond_142 = kermeta.standard.helper.IntegerWrapper.equals(eps.size(), 1);\n\n\tif( idIfCond_142 ) {\n\n\t//BIft:detect\n\nkermeta.language.structure.Package result_ft46 = null;\n\n\tkermeta.language.structure.Package elem_ft46 = null;\n\n\tresult_ft46 = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Package> it_ft46 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Package>convertAsOrderedSet(this.getPackages()).iterator();\n\tjava.lang.Boolean idLoopCond_143 = false;\n\twhile( !idLoopCond_143 ) {\n\tidLoopCond_143 = kermeta.standard.helper.BooleanWrapper.or(it_ft46.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqual(result_ft46, null));\n\tif ( idLoopCond_143 ) {\n\t} else {\n\n\telem_ft46 = it_ft46.next();\n\n\tjava.lang.Boolean idIfCond_144 = false;\n//BIle:detector\nkermeta.language.structure.Package pack_lbdExp46 = elem_ft46;\n\n\tidIfCond_144 = kermeta.standard.helper.StringWrapper.equals(kermeta.standard.helper.StringWrapper.toLowerCase(pack_lbdExp46.getName()), kermeta.standard.helper.StringWrapper.toLowerCase(p_lbdExp44.getName()));\n//EIle:detector\n\n\n\tif( idIfCond_144 ) {\n\n\tresult_ft46 = elem_ft46;\n}\n\n}\n\t}\n}\n\n//EIft:detect\nresult_ft46.setGenModelBasePackage(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.toLowerCase(p_lbdExp44.getName()), \"0\"));\n}\n\n\n\tp_lbdExp44.setGenModelBasePackage(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.toLowerCase(p_lbdExp44.getName()), kermeta.standard.helper.IntegerWrapper.toString(eps.size())));\n}\n\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EPackage>convertAsOrderedSet(this.getEcorePackages()).add(p_lbdExp44.getEcoreModelElement());\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n'"
	 * @generated
	 */
	void applyPass1(KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Operation> it_ft47 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Operation>convertAsOrderedSet(this.getSuperOperationsToCompileInHelper()).iterator();\n\tjava.lang.Boolean idLoopCond_145 = false;\n\twhile( !idLoopCond_145 ) {\n\tidLoopCond_145 = it_ft47.isOff();\n\tif ( idLoopCond_145 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Operation op_lbdExp47 = it_ft47.next();\n\n\tcontext.setStaticOperationMode(true);\n\n\tthis.compileStaticOperation(op_lbdExp47, context);\n\n\tcontext.setStaticOperationMode(false);\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n'"
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\necore.EClassifier result = null;\n\n\tresult = null;\n\n\tkermeta.standard.OrderedSet<java.lang.String> set_qname = kermeta.standard.helper.StringWrapper.split(qname, \"::\");\n\n\tjava.lang.Boolean idIfCond_146 = false;\n\tidIfCond_146 = kermeta.standard.helper.IntegerWrapper.equals(set_qname.size(), 0);\n\n\tif( idIfCond_146 ) {\n\n\tset_qname.add(qname);\n}\n\n\n\tecore.EPackage pack = null;\n//BIft:detect\n\necore.EPackage result_ft48 = null;\n\n\tecore.EPackage elem_ft48 = null;\n\n\tresult_ft48 = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<ecore.EPackage> it_ft48 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EPackage>convertAsOrderedSet(this.getEcorePackages()).iterator();\n\tjava.lang.Boolean idLoopCond_147 = false;\n\twhile( !idLoopCond_147 ) {\n\tidLoopCond_147 = kermeta.standard.helper.BooleanWrapper.or(it_ft48.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqual(result_ft48, null));\n\tif ( idLoopCond_147 ) {\n\t} else {\n\n\telem_ft48 = it_ft48.next();\n\n\tjava.lang.Boolean idIfCond_148 = false;\n//BIle:detector\necore.EPackage p_lbdExp48 = elem_ft48;\n\n\tidIfCond_148 = kermeta.standard.helper.StringWrapper.equals(p_lbdExp48.getName(), set_qname.at(0));\n//EIle:detector\n\n\n\tif( idIfCond_148 ) {\n\n\tresult_ft48 = elem_ft48;\n}\n\n}\n\t}\n}\n\n\n//CE\npack = result_ft48;\n//EIft:detect\n\n\n\tjava.lang.Boolean idIfCond_149 = false;\n\tidIfCond_149 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoid(pack));\n\n\tif( idIfCond_149 ) {\n\n\t\n{\n\n\tjava.lang.Integer i = 1;\n\tjava.lang.Boolean idLoopCond_150 = false;\n\twhile( !idLoopCond_150 ) {\n\tidLoopCond_150 = kermeta.standard.helper.IntegerWrapper.isGreaterOrEqual(i, kermeta.standard.helper.IntegerWrapper.minus(set_qname.size(), 1));\n\tif ( idLoopCond_150 ) {\n\t} else {\n\n\t//BIft:detect\n\necore.EPackage result_ft49 = null;\n\n\tecore.EPackage elem_ft49 = null;\n\n\tresult_ft49 = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<ecore.EPackage> it_ft49 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EPackage>convertAsOrderedSet(pack.getESubpackages()).iterator();\n\tjava.lang.Boolean idLoopCond_151 = false;\n\twhile( !idLoopCond_151 ) {\n\tidLoopCond_151 = kermeta.standard.helper.BooleanWrapper.or(it_ft49.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqual(result_ft49, null));\n\tif ( idLoopCond_151 ) {\n\t} else {\n\n\telem_ft49 = it_ft49.next();\n\n\tjava.lang.Boolean idIfCond_152 = false;\n//BIle:detector\necore.EPackage p_lbdExp49 = elem_ft49;\n\n\tidIfCond_152 = kermeta.standard.helper.StringWrapper.equals(p_lbdExp49.getName(), set_qname.at(i));\n//EIle:detector\n\n\n\tif( idIfCond_152 ) {\n\n\tresult_ft49 = elem_ft49;\n}\n\n}\n\t}\n}\n\n\n//CE\npack = result_ft49;\n//EIft:detect\n\n\n\ti = kermeta.standard.helper.IntegerWrapper.plus(i, 1);\n}\n\t}\n}\n\n\n\t//BIft:detect\n\necore.EClassifier result_ft50 = null;\n\n\tecore.EClassifier elem_ft50 = null;\n\n\tresult_ft50 = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<ecore.EClassifier> it_ft50 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EClassifier>convertAsOrderedSet(pack.getEClassifiers()).iterator();\n\tjava.lang.Boolean idLoopCond_153 = false;\n\twhile( !idLoopCond_153 ) {\n\tidLoopCond_153 = kermeta.standard.helper.BooleanWrapper.or(it_ft50.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqual(result_ft50, null));\n\tif ( idLoopCond_153 ) {\n\t} else {\n\n\telem_ft50 = it_ft50.next();\n\n\tjava.lang.Boolean idIfCond_154 = false;\n//BIle:detector\necore.EClassifier c_lbdExp50 = elem_ft50;\n\n\tidIfCond_154 = kermeta.standard.helper.StringWrapper.equals(c_lbdExp50.getName(), set_qname.at(kermeta.standard.helper.IntegerWrapper.minus(set_qname.size(), 1)));\n//EIle:detector\n\n\n\tif( idIfCond_154 ) {\n\n\tresult_ft50 = elem_ft50;\n}\n\n}\n\t}\n}\n\n\n//CE\nresult = result_ft50;\n//EIft:detect\n\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	EClassifier getEClassifierByQualifiedName(String qname);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tjava.lang.Boolean idIfCond_155 = false;\n\tidIfCond_155 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoid(this.getEClassifierByQualifiedName(\"ecore::EObject\")));\n\n\tif( idIfCond_155 ) {\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EOperation>convertAsOrderedSet(((ecore.EClass) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(this.getEClassifierByQualifiedName(\"ecore::EObject\"), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"ecore.EClass\"))).getEOperations()).clear();\n}\n\n'"
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
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tsimk.SMContext smContext = context.getSimkModel().retrieveOrCreateContextForSuper(op, context);\n\n\tjava.lang.Boolean idIfCond_156 = false;\n\tidIfCond_156 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoid(smContext));\n\n\tif( idIfCond_156 ) {\n\n\tsimk.SMMethod staticMethod = ((simk.SMMethod) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"simk.SMMethod\"));\n\n\tstaticMethod.setName(kermeta.standard.helper.StringWrapper.plus(\"super_\", ((km2ecore.helper.java.IdentifierHelper) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"km2ecore.helper.java.IdentifierHelper\")).getMangledIdentifier(op.getFinalName(), context)));\n\n\tstaticMethod.setBody(op.createBehaviorJava(context));\n\n\tstaticMethod.setUsages(simk.SMUsage.getByName(\"Super\"));\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<simk.SMMethod>convertAsOrderedSet(context.getSimkModel().getSMMethods()).add(staticMethod);\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<simk.SMMethod>convertAsOrderedSet(smContext.getSMMethods()).add(staticMethod);\n\n\tsimk.SMReturn smReturn = ((simk.SMReturn) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"simk.SMReturn\"));\n\n\tsmReturn.setType(op.getType().createBehaviorJava(context));\n\n\tjava.lang.Boolean idIfCond_157 = false;\n\tidIfCond_157 = ((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.language.structure.Operation\")).isVoidType(smReturn.getType());\n\n\tif( idIfCond_157 ) {\n\n\tsmReturn.setType(\"void\");\n}\n\n\n\tstaticMethod.setSMReturn(smReturn);\n\n\tsimk.SMParameter default_param = ((simk.SMParameter) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"simk.SMParameter\"));\n\n\tdefault_param.setName(\"self\");\n\n\tdefault_param.setType(kermeta.standard.helper.StringWrapper.replace(((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(org.kermeta.compil.runtime.helper.language.ObjectUtil.container(op), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ClassDefinition\"))).qualifiedName(), context.getKERMETA_SEPARATOR(), context.getJAVA_SEPARATOR()));\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<simk.SMParameter>convertAsOrderedSet(staticMethod.getSMParameters()).add(default_param);\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Parameter> it_ft51 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Parameter>convertAsOrderedSet(op.getOwnedParameter()).iterator();\n\tjava.lang.Boolean idLoopCond_158 = false;\n\twhile( !idLoopCond_158 ) {\n\tidLoopCond_158 = it_ft51.isOff();\n\tif ( idLoopCond_158 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Parameter p_lbdExp51 = it_ft51.next();\n\n\tsimk.SMParameter param = ((simk.SMParameter) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"simk.SMParameter\"));\n\n\tparam.setName(p_lbdExp51.getName());\n\n\tjava.lang.Boolean idIfCond_159 = false;\n\tidIfCond_159 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOf(p_lbdExp51.getType(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.FunctionType\")));\n\n\tif( idIfCond_159 ) {\n\n\tparam.setType(p_lbdExp51.getType().createBehaviorJava(context));\n\n\tjava.lang.Boolean idIfCond_160 = false;\n\tidIfCond_160 = ((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.language.structure.Operation\")).isVoidType(param.getType());\n\n\tif( idIfCond_160 ) {\n\n\tparam.setType(\"void\");\n}\n\n}\n else {\n}\n\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<simk.SMParameter>convertAsOrderedSet(staticMethod.getSMParameters()).add(param);\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n}\n\n'"
	 * @generated
	 */
	void compileStaticOperation(Operation op, KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\necore.EAnnotation result = null;\n\n\tecore.EAnnotation ecoreAnnotation = ((ecore.EAnnotation) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"ecore.EAnnotation\"));\n\n\tecoreAnnotation.setSource(\"ModelingUnit\");\n\n\tecore.EStringToStringMapEntry requireEntry = ((ecore.EStringToStringMapEntry) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"ecore.EStringToStringMapEntry\"));\n\n\trequireEntry.setKey(\"require\");\n\n\trequireEntry.setValue(\"\");\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EStringToStringMapEntry>convertAsOrderedSet(ecoreAnnotation.getDetails()).add(requireEntry);\n\n\tecore.EStringToStringMapEntry usingEntry = ((ecore.EStringToStringMapEntry) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"ecore.EStringToStringMapEntry\"));\n\n\tusingEntry.setKey(\"using\");\n\n\tusingEntry.setValue(\"\");\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EStringToStringMapEntry>convertAsOrderedSet(ecoreAnnotation.getDetails()).add(usingEntry);\n\n\tresult = ecoreAnnotation;\n\nreturn result;\n'"
	 * @generated
	 */
	EAnnotation createEcoreModelElement(KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.standard.OrderedSet<kermeta.language.structure.Package> result = null;\n\n\tresult = ((kermeta.standard.OrderedSet<kermeta.language.structure.Package>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.standard.OrderedSet<kermeta.language.structure.Package>\"));\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Package> it_ft52 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Package>convertAsOrderedSet(this.getPackages()).iterator();\n\tjava.lang.Boolean idLoopCond_161 = false;\n\twhile( !idLoopCond_161 ) {\n\tidLoopCond_161 = it_ft52.isOff();\n\tif ( idLoopCond_161 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Package p_lbdExp52 = it_ft52.next();\n\n\tresult.add(p_lbdExp52);\n\n\tresult.addAll(p_lbdExp52.getAllSubPackages());\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\nreturn result;\n'"
	 * @generated
	 */
	OrderedSet<kermeta.language.structure.Package> getAllPackages();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta superOperation='kermeta::language::structure::Object'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\t//BIft:eachOwnedElement\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Tag> it_ft54 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Tag>convertAsOrderedSet(this.getOwnedTags()).iterator();\n\tjava.lang.Boolean idLoopCond_162 = false;\n\twhile( !idLoopCond_162 ) {\n\tidLoopCond_162 = it_ft54.isOff();\n\tif ( idLoopCond_162 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Tag o_lbdExp54 = it_ft54.next();\n\n\t//BIle:func\nkermeta.language.structure.Tag p_lbdExp53 = o_lbdExp54;\n\n\tp_lbdExp53.applyPass2BehaviorJava(context);\n//EIle:func\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Require> it_ft55 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Require>convertAsOrderedSet(this.getRequires()).iterator();\n\tjava.lang.Boolean idLoopCond_163 = false;\n\twhile( !idLoopCond_163 ) {\n\tidLoopCond_163 = it_ft55.isOff();\n\tif ( idLoopCond_163 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Require p_lbdExp55 = it_ft55.next();\n\n\t//BIle:func\nkermeta.language.structure.Require p_lbdExp53 = p_lbdExp55;\n\n\tp_lbdExp53.applyPass2BehaviorJava(context);\n//EIle:func\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Using> it_ft56 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Using>convertAsOrderedSet(this.getUsings()).iterator();\n\tjava.lang.Boolean idLoopCond_164 = false;\n\twhile( !idLoopCond_164 ) {\n\tidLoopCond_164 = it_ft56.isOff();\n\tif ( idLoopCond_164 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Using p_lbdExp56 = it_ft56.next();\n\n\t//BIle:func\nkermeta.language.structure.Using p_lbdExp53 = p_lbdExp56;\n\n\tp_lbdExp53.applyPass2BehaviorJava(context);\n//EIle:func\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Package> it_ft57 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Package>convertAsOrderedSet(this.getPackages()).iterator();\n\tjava.lang.Boolean idLoopCond_165 = false;\n\twhile( !idLoopCond_165 ) {\n\tidLoopCond_165 = it_ft57.isOff();\n\tif ( idLoopCond_165 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Package p_lbdExp57 = it_ft57.next();\n\n\t//BIle:func\nkermeta.language.structure.Package p_lbdExp53 = p_lbdExp57;\n\n\tp_lbdExp53.applyPass2BehaviorJava(context);\n//EIle:func\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n//EIft:eachOwnedElement\n\n'"
	 * @generated
	 */
	void applyPass2BehaviorJava(KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model qnameDataType="kermeta.standard.JavaString"
	 *        annotation="kermeta documentation='/**\r\n\t * Get a TypeDefinition contained in the given Modeling Unit by qualifiedName\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.language.structure.TypeDefinition result = null;\n\n\tkermeta.standard.OrderedSet<java.lang.String> set_qname = kermeta.standard.helper.StringWrapper.split(qname, \"::\");\n\n\tjava.lang.Boolean idIfCond_166 = false;\n\tidIfCond_166 = kermeta.standard.helper.IntegerWrapper.equals(set_qname.size(), 0);\n\n\tif( idIfCond_166 ) {\n\n\tset_qname.add(qname);\n}\n\n\n\tkermeta.language.structure.Package pack = null;\n//BIft:detect\n\nkermeta.language.structure.Package result_ft58 = null;\n\n\tkermeta.language.structure.Package elem_ft58 = null;\n\n\tresult_ft58 = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Package> it_ft58 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Package>convertAsOrderedSet(this.getPackages()).iterator();\n\tjava.lang.Boolean idLoopCond_167 = false;\n\twhile( !idLoopCond_167 ) {\n\tidLoopCond_167 = kermeta.standard.helper.BooleanWrapper.or(it_ft58.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqual(result_ft58, null));\n\tif ( idLoopCond_167 ) {\n\t} else {\n\n\telem_ft58 = it_ft58.next();\n\n\tjava.lang.Boolean idIfCond_168 = false;\n//BIle:detector\nkermeta.language.structure.Package p_lbdExp58 = elem_ft58;\n\n\tidIfCond_168 = kermeta.standard.helper.StringWrapper.equals(p_lbdExp58.getName(), set_qname.at(0));\n//EIle:detector\n\n\n\tif( idIfCond_168 ) {\n\n\tresult_ft58 = elem_ft58;\n}\n\n}\n\t}\n}\n\n\n//CE\npack = result_ft58;\n//EIft:detect\n\n\n\t\n{\n\n\tjava.lang.Integer i = 1;\n\tjava.lang.Boolean idLoopCond_169 = false;\n\twhile( !idLoopCond_169 ) {\n\tidLoopCond_169 = kermeta.standard.helper.IntegerWrapper.isGreaterOrEqual(i, kermeta.standard.helper.IntegerWrapper.minus(set_qname.size(), 1));\n\tif ( idLoopCond_169 ) {\n\t} else {\n\n\t//BIft:detect\n\nkermeta.language.structure.Package result_ft59 = null;\n\n\tkermeta.language.structure.Package elem_ft59 = null;\n\n\tresult_ft59 = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Package> it_ft59 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Package>convertAsOrderedSet(pack.getNestedPackage()).iterator();\n\tjava.lang.Boolean idLoopCond_170 = false;\n\twhile( !idLoopCond_170 ) {\n\tidLoopCond_170 = kermeta.standard.helper.BooleanWrapper.or(it_ft59.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqual(result_ft59, null));\n\tif ( idLoopCond_170 ) {\n\t} else {\n\n\telem_ft59 = it_ft59.next();\n\n\tjava.lang.Boolean idIfCond_171 = false;\n//BIle:detector\nkermeta.language.structure.Package p_lbdExp59 = elem_ft59;\n\n\tidIfCond_171 = kermeta.standard.helper.StringWrapper.equals(p_lbdExp59.getName(), set_qname.at(i));\n//EIle:detector\n\n\n\tif( idIfCond_171 ) {\n\n\tresult_ft59 = elem_ft59;\n}\n\n}\n\t}\n}\n\n\n//CE\npack = result_ft59;\n//EIft:detect\n\n\n\ti = kermeta.standard.helper.IntegerWrapper.plus(i, 1);\n}\n\t}\n}\n\n\n\t//BIft:detect\n\nkermeta.language.structure.TypeDefinition result_ft60 = null;\n\n\tkermeta.language.structure.TypeDefinition elem_ft60 = null;\n\n\tresult_ft60 = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.TypeDefinition> it_ft60 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.TypeDefinition>convertAsOrderedSet(pack.getOwnedTypeDefinition()).iterator();\n\tjava.lang.Boolean idLoopCond_172 = false;\n\twhile( !idLoopCond_172 ) {\n\tidLoopCond_172 = kermeta.standard.helper.BooleanWrapper.or(it_ft60.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqual(result_ft60, null));\n\tif ( idLoopCond_172 ) {\n\t} else {\n\n\telem_ft60 = it_ft60.next();\n\n\tjava.lang.Boolean idIfCond_173 = false;\n//BIle:detector\nkermeta.language.structure.TypeDefinition c_lbdExp60 = elem_ft60;\n\n\tidIfCond_173 = kermeta.standard.helper.StringWrapper.equals(c_lbdExp60.getName(), set_qname.at(kermeta.standard.helper.IntegerWrapper.minus(set_qname.size(), 1)));\n//EIle:detector\n\n\n\tif( idIfCond_173 ) {\n\n\tresult_ft60 = elem_ft60;\n}\n\n}\n\t}\n}\n\n\n//CE\nresult = result_ft60;\n//EIft:detect\n\n\nreturn result;\n'"
	 * @generated
	 */
	TypeDefinition getTypeDefinitionByQualifiedName(String qname);

} // ModelingUnit
