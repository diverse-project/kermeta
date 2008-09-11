/**
 * <copyright>
 * </copyright>
 *
 * $Id: ModelingUnit.java,v 1.2 2008-09-11 12:34:37 cfaucher Exp $
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
 *   <li>{@link kermeta.language.structure.ModelingUnit#getExcludeFilters <em>Exclude Filters</em>}</li>
 *   <li>{@link kermeta.language.structure.ModelingUnit#getSuperOperationsToCompileInHelper <em>Super Operations To Compile In Helper</em>}</li>
 *   <li>{@link kermeta.language.structure.ModelingUnit#getReferencedModelingUnits <em>Referenced Modeling Units</em>}</li>
 *   <li>{@link kermeta.language.structure.ModelingUnit#getRequires <em>Requires</em>}</li>
 *   <li>{@link kermeta.language.structure.ModelingUnit#getEntryPoints <em>Entry Points</em>}</li>
 * </ul>
 * </p>
 *
 * @see kermeta.language.structure.StructurePackage#getModelingUnit()
 * @model annotation="kermeta documentation='/**\n *\n \052/'"
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.language.structure.Package result = null;\n\n\tkermeta.standard.OrderedSet<java.lang.String> set_qname = kermeta.standard.helper.StringWrapper.split(qname, \"::\");\n\n\tjava.lang.Boolean idIfCond_49 = false;\n\tidIfCond_49 = kermeta.standard.helper.IntegerWrapper.equals(set_qname.size(), 0);\n\n\tif( idIfCond_49 ) {\n\n\tset_qname.add(qname);\n}\n\n\n\tkermeta.language.structure.Package pack = null;\n//BIft:detect\n\nkermeta.language.structure.Package result_ft8 = null;\n\n\tkermeta.language.structure.Package elem_ft8 = null;\n\n\tresult_ft8 = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Package> it_ft8 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Package>convertAsOrderedSet(this.getPackages()).iterator();\n\tjava.lang.Boolean idLoopCond_50 = false;\n\twhile( !idLoopCond_50 ) {\n\tidLoopCond_50 = kermeta.standard.helper.BooleanWrapper.or(it_ft8.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqual(result_ft8, null));\n\tif ( idLoopCond_50 ) {\n\t} else {\n\n\telem_ft8 = it_ft8.next();\n\n\tjava.lang.Boolean idIfCond_51 = false;\n//BIle:detector\nkermeta.language.structure.Package p_lbdExp8 = elem_ft8;\n\n\tidIfCond_51 = kermeta.standard.helper.StringWrapper.equals(p_lbdExp8.getName(), set_qname.at(0));\n//EIle:detector\n\n\n\tif( idIfCond_51 ) {\n\n\tresult_ft8 = elem_ft8;\n}\n\n}\n\t}\n}\n\n\n//CE\npack = result_ft8;\n//EIft:detect\n\n\n\t\n{\n\n\tjava.lang.Integer i = 1;\n\tjava.lang.Boolean idLoopCond_52 = false;\n\twhile( !idLoopCond_52 ) {\n\tidLoopCond_52 = kermeta.standard.helper.IntegerWrapper.isGreaterOrEqual(i, set_qname.size());\n\tif ( idLoopCond_52 ) {\n\t} else {\n\n\tpack = null;\n//BIft:detect\n\nkermeta.language.structure.Package result_ft9 = null;\n\n\tkermeta.language.structure.Package elem_ft9 = null;\n\n\tresult_ft9 = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Package> it_ft9 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Package>convertAsOrderedSet(pack.getNestedPackage()).iterator();\n\tjava.lang.Boolean idLoopCond_53 = false;\n\twhile( !idLoopCond_53 ) {\n\tidLoopCond_53 = kermeta.standard.helper.BooleanWrapper.or(it_ft9.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqual(result_ft9, null));\n\tif ( idLoopCond_53 ) {\n\t} else {\n\n\telem_ft9 = it_ft9.next();\n\n\tjava.lang.Boolean idIfCond_54 = false;\n//BIle:detector\nkermeta.language.structure.Package p_lbdExp9 = elem_ft9;\n\n\tidIfCond_54 = kermeta.standard.helper.StringWrapper.equals(p_lbdExp9.getName(), set_qname.at(i));\n//EIle:detector\n\n\n\tif( idIfCond_54 ) {\n\n\tresult_ft9 = elem_ft9;\n}\n\n}\n\t}\n}\n\n//EIft:detect\n\n\n\ti = kermeta.standard.helper.IntegerWrapper.plus(i, 1);\n}\n\t}\n}\n\n\n\tresult = pack;\n\nreturn result;\n'"
	 * @generated
	 */
	kermeta.language.structure.Package retrievePackage(String qname);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\n\t * We cannot use an Alias to define this indiretion because the concept of KRuntimeError does not exist\n\t * in framework.ecore, thus we create in this operation a new EDataType that targets the KRuntimeError Java Impl\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tecore.EDataType exception_EDataType = ((ecore.EDataType) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"ecore.EDataType\"));\n\n\texception_EDataType.setName(\"KRuntimeError\");\n\n\texception_EDataType.setInstanceClassName(context.getJAVA_CLASS_EXCEPTION_SWITCHER());\n\n\texception_EDataType.setSerializable(false);\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EClassifier>convertAsOrderedSet(this.retrievePackage(\"kermeta::exceptions\").getEcoreModelElement().getEClassifiers()).add(exception_EDataType);\n'"
	 * @generated
	 */
	void createKRuntimeError(KM2EcoreContext context);

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
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tsimk.SMContext smContext = context.getSimkModel().retrieveOrCreateContextForSuper(op, context);\n\n\tjava.lang.Boolean idIfCond_55 = false;\n\tidIfCond_55 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoid(smContext));\n\n\tif( idIfCond_55 ) {\n\n\tsimk.StaticMethod staticMethod = ((simk.StaticMethod) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"simk.StaticMethod\"));\n\n\tstaticMethod.setName(kermeta.standard.helper.StringWrapper.plus(\"super_\", ((km2ecore.helper.java.IdentifierHelper) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"km2ecore.helper.java.IdentifierHelper\")).getMangledIdentifier(op.getFinalName(), context)));\n\n\tstaticMethod.setBody(op.createBehaviorJava(context));\n\n\tstaticMethod.setUsages(simk.SMUsage.getByName(\"Super\"));\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<simk.StaticMethod>convertAsOrderedSet(context.getSimkModel().getStaticMethods()).add(staticMethod);\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<simk.StaticMethod>convertAsOrderedSet(smContext.getStaticMethods()).add(staticMethod);\n\n\tsimk.SMReturn smReturn = ((simk.SMReturn) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"simk.SMReturn\"));\n\n\tsmReturn.setType(op.getType().createBehaviorJava(context));\n\n\tjava.lang.Boolean idIfCond_56 = false;\n\tidIfCond_56 = ((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.language.structure.Operation\")).isVoidType(smReturn.getType());\n\n\tif( idIfCond_56 ) {\n\n\tsmReturn.setType(\"void\");\n}\n\n\n\tstaticMethod.setSMReturn(smReturn);\n\n\tsimk.SMParameter default_param = ((simk.SMParameter) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"simk.SMParameter\"));\n\n\tdefault_param.setName(\"self\");\n\n\tdefault_param.setType(kermeta.standard.helper.StringWrapper.replace(((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(org.kermeta.compil.runtime.helper.language.ObjectUtil.container(op), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ClassDefinition\"))).qualifiedName(), \"::\", \"\\\\.\"));\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<simk.SMParameter>convertAsOrderedSet(staticMethod.getSMParameters()).add(default_param);\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Parameter> it_ft10 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Parameter>convertAsOrderedSet(op.getOwnedParameter()).iterator();\n\tjava.lang.Boolean idLoopCond_57 = false;\n\twhile( !idLoopCond_57 ) {\n\tidLoopCond_57 = it_ft10.isOff();\n\tif ( idLoopCond_57 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Parameter p_lbdExp10 = it_ft10.next();\n\n\tsimk.SMParameter param = ((simk.SMParameter) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"simk.SMParameter\"));\n\n\tparam.setName(p_lbdExp10.getName());\n\n\tjava.lang.Boolean idIfCond_58 = false;\n\tidIfCond_58 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOf(p_lbdExp10.getType(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.FunctionType\")));\n\n\tif( idIfCond_58 ) {\n\n\tparam.setType(p_lbdExp10.getType().createBehaviorJava(context));\n\n\tjava.lang.Boolean idIfCond_59 = false;\n\tidIfCond_59 = ((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.language.structure.Operation\")).isVoidType(param.getType());\n\n\tif( idIfCond_59 ) {\n\n\tparam.setType(\"void\");\n}\n\n}\n else {\n}\n\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<simk.SMParameter>convertAsOrderedSet(staticMethod.getSMParameters()).add(param);\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n}\n\n'"
	 * @generated
	 */
	void compileStaticOperation(Operation op, KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta superOperation='kermeta::language::structure::Object'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tecore.EAnnotation ecoreAnnotation = this.createEcoreModelElement(context);\n\n\tthis.setEcoreModelElement(ecoreAnnotation);\n\n\t//BIft:eachOwnedElement\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Tag> it_ft12 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Tag>convertAsOrderedSet(this.getOwnedTags()).iterator();\n\tjava.lang.Boolean idLoopCond_60 = false;\n\twhile( !idLoopCond_60 ) {\n\tidLoopCond_60 = it_ft12.isOff();\n\tif ( idLoopCond_60 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Tag o_lbdExp12 = it_ft12.next();\n\n\t//BIle:func\nkermeta.language.structure.Tag p_lbdExp11 = o_lbdExp12;\n\n\tp_lbdExp11.applyPass1(context);\n//EIle:func\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Require> it_ft13 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Require>convertAsOrderedSet(this.getRequires()).iterator();\n\tjava.lang.Boolean idLoopCond_61 = false;\n\twhile( !idLoopCond_61 ) {\n\tidLoopCond_61 = it_ft13.isOff();\n\tif ( idLoopCond_61 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Require p_lbdExp13 = it_ft13.next();\n\n\t//BIle:func\nkermeta.language.structure.Require p_lbdExp11 = p_lbdExp13;\n\n\tp_lbdExp11.applyPass1(context);\n//EIle:func\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Using> it_ft14 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Using>convertAsOrderedSet(this.getUsings()).iterator();\n\tjava.lang.Boolean idLoopCond_62 = false;\n\twhile( !idLoopCond_62 ) {\n\tidLoopCond_62 = it_ft14.isOff();\n\tif ( idLoopCond_62 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Using p_lbdExp14 = it_ft14.next();\n\n\t//BIle:func\nkermeta.language.structure.Using p_lbdExp11 = p_lbdExp14;\n\n\tp_lbdExp11.applyPass1(context);\n//EIle:func\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Package> it_ft15 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Package>convertAsOrderedSet(this.getPackages()).iterator();\n\tjava.lang.Boolean idLoopCond_63 = false;\n\twhile( !idLoopCond_63 ) {\n\tidLoopCond_63 = it_ft15.isOff();\n\tif ( idLoopCond_63 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Package p_lbdExp15 = it_ft15.next();\n\n\t//BIle:func\nkermeta.language.structure.Package p_lbdExp11 = p_lbdExp15;\n\n\tp_lbdExp11.applyPass1(context);\n//EIle:func\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n//EIft:eachOwnedElement\n\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Package> it_ft16 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Package>convertAsOrderedSet(this.getPackages()).iterator();\n\tjava.lang.Boolean idLoopCond_64 = false;\n\twhile( !idLoopCond_64 ) {\n\tidLoopCond_64 = it_ft16.isOff();\n\tif ( idLoopCond_64 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Package p_lbdExp16 = it_ft16.next();\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EPackage>convertAsOrderedSet(this.getEcorePackages()).add(p_lbdExp16.getEcoreModelElement());\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n'"
	 * @generated
	 */
	void applyPass1(KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Operation> it_ft17 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Operation>convertAsOrderedSet(this.getSuperOperationsToCompileInHelper()).iterator();\n\tjava.lang.Boolean idLoopCond_65 = false;\n\twhile( !idLoopCond_65 ) {\n\tidLoopCond_65 = it_ft17.isOff();\n\tif ( idLoopCond_65 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Operation op_lbdExp17 = it_ft17.next();\n\n\tcontext.setStaticOperationMode(true);\n\n\tthis.compileStaticOperation(op_lbdExp17, context);\n\n\tcontext.setStaticOperationMode(false);\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n'"
	 * @generated
	 */
	void compileSuperOperation(KM2EcoreContext context);

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
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tthis.compileSuperOperation(context);\n'"
	 * @generated
	 */
	void postprocess(KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.standard.OrderedSet<kermeta.language.structure.Package> result = null;\n\n\tresult = ((kermeta.standard.OrderedSet<kermeta.language.structure.Package>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.standard.OrderedSet<kermeta.language.structure.Package>\"));\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Package> it_ft18 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Package>convertAsOrderedSet(this.getPackages()).iterator();\n\tjava.lang.Boolean idLoopCond_66 = false;\n\twhile( !idLoopCond_66 ) {\n\tidLoopCond_66 = it_ft18.isOff();\n\tif ( idLoopCond_66 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Package p_lbdExp18 = it_ft18.next();\n\n\tresult.add(p_lbdExp18);\n\n\tresult.addAll(p_lbdExp18.getAllSubPackages());\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\nreturn result;\n'"
	 * @generated
	 */
	OrderedSet<kermeta.language.structure.Package> getAllPackages();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model qnameDataType="kermeta.standard.JavaString"
	 *        annotation="kermeta documentation='/**\n\t * Get a TypeDefinition contained in the given Modeling Unit by qualifiedName\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.language.structure.TypeDefinition result = null;\n\n\tkermeta.standard.OrderedSet<java.lang.String> set_qname = kermeta.standard.helper.StringWrapper.split(qname, \"::\");\n\n\tjava.lang.Boolean idIfCond_67 = false;\n\tidIfCond_67 = kermeta.standard.helper.IntegerWrapper.equals(set_qname.size(), 0);\n\n\tif( idIfCond_67 ) {\n\n\tset_qname.add(qname);\n}\n\n\n\tkermeta.language.structure.Package pack = null;\n//BIft:detect\n\nkermeta.language.structure.Package result_ft19 = null;\n\n\tkermeta.language.structure.Package elem_ft19 = null;\n\n\tresult_ft19 = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Package> it_ft19 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Package>convertAsOrderedSet(this.getPackages()).iterator();\n\tjava.lang.Boolean idLoopCond_68 = false;\n\twhile( !idLoopCond_68 ) {\n\tidLoopCond_68 = kermeta.standard.helper.BooleanWrapper.or(it_ft19.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqual(result_ft19, null));\n\tif ( idLoopCond_68 ) {\n\t} else {\n\n\telem_ft19 = it_ft19.next();\n\n\tjava.lang.Boolean idIfCond_69 = false;\n//BIle:detector\nkermeta.language.structure.Package p_lbdExp19 = elem_ft19;\n\n\tidIfCond_69 = kermeta.standard.helper.StringWrapper.equals(p_lbdExp19.getName(), set_qname.at(0));\n//EIle:detector\n\n\n\tif( idIfCond_69 ) {\n\n\tresult_ft19 = elem_ft19;\n}\n\n}\n\t}\n}\n\n\n//CE\npack = result_ft19;\n//EIft:detect\n\n\n\t\n{\n\n\tjava.lang.Integer i = 1;\n\tjava.lang.Boolean idLoopCond_70 = false;\n\twhile( !idLoopCond_70 ) {\n\tidLoopCond_70 = kermeta.standard.helper.IntegerWrapper.isGreaterOrEqual(i, kermeta.standard.helper.IntegerWrapper.minus(set_qname.size(), 1));\n\tif ( idLoopCond_70 ) {\n\t} else {\n\n\tpack = null;\n//BIft:detect\n\nkermeta.language.structure.Package result_ft20 = null;\n\n\tkermeta.language.structure.Package elem_ft20 = null;\n\n\tresult_ft20 = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Package> it_ft20 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Package>convertAsOrderedSet(pack.getNestedPackage()).iterator();\n\tjava.lang.Boolean idLoopCond_71 = false;\n\twhile( !idLoopCond_71 ) {\n\tidLoopCond_71 = kermeta.standard.helper.BooleanWrapper.or(it_ft20.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqual(result_ft20, null));\n\tif ( idLoopCond_71 ) {\n\t} else {\n\n\telem_ft20 = it_ft20.next();\n\n\tjava.lang.Boolean idIfCond_72 = false;\n//BIle:detector\nkermeta.language.structure.Package p_lbdExp20 = elem_ft20;\n\n\tidIfCond_72 = kermeta.standard.helper.StringWrapper.equals(p_lbdExp20.getName(), set_qname.at(i));\n//EIle:detector\n\n\n\tif( idIfCond_72 ) {\n\n\tresult_ft20 = elem_ft20;\n}\n\n}\n\t}\n}\n\n//EIft:detect\n\n\n\ti = kermeta.standard.helper.IntegerWrapper.plus(i, 1);\n}\n\t}\n}\n\n\n\tresult = null;\n//BIft:detect\n\nkermeta.language.structure.TypeDefinition result_ft21 = null;\n\n\tkermeta.language.structure.TypeDefinition elem_ft21 = null;\n\n\tresult_ft21 = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.TypeDefinition> it_ft21 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.TypeDefinition>convertAsOrderedSet(pack.getOwnedTypeDefinition()).iterator();\n\tjava.lang.Boolean idLoopCond_73 = false;\n\twhile( !idLoopCond_73 ) {\n\tidLoopCond_73 = kermeta.standard.helper.BooleanWrapper.or(it_ft21.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqual(result_ft21, null));\n\tif ( idLoopCond_73 ) {\n\t} else {\n\n\telem_ft21 = it_ft21.next();\n\n\tjava.lang.Boolean idIfCond_74 = false;\n//BIle:detector\nkermeta.language.structure.TypeDefinition c_lbdExp21 = elem_ft21;\n\n\tidIfCond_74 = kermeta.standard.helper.StringWrapper.equals(c_lbdExp21.getName(), set_qname.at(kermeta.standard.helper.IntegerWrapper.minus(set_qname.size(), 1)));\n//EIle:detector\n\n\n\tif( idIfCond_74 ) {\n\n\tresult_ft21 = elem_ft21;\n}\n\n}\n\t}\n}\n\n//EIft:detect\n\n\nreturn result;\n'"
	 * @generated
	 */
	TypeDefinition getTypeDefinitionByQualifiedName(String qname);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model qnameDataType="kermeta.standard.JavaString"
	 *        annotation="kermeta documentation='/**\n\t * Get a EClassifer contained in the given Modeling Unit by qualifiedName\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\necore.EClassifier result = null;\n\n\tkermeta.standard.OrderedSet<java.lang.String> set_qname = kermeta.standard.helper.StringWrapper.split(qname, \"::\");\n\n\tjava.lang.Boolean idIfCond_75 = false;\n\tidIfCond_75 = kermeta.standard.helper.IntegerWrapper.equals(set_qname.size(), 0);\n\n\tif( idIfCond_75 ) {\n\n\tset_qname.add(qname);\n}\n\n\n\tecore.EPackage pack = null;\n//BIft:detect\n\necore.EPackage result_ft22 = null;\n\n\tecore.EPackage elem_ft22 = null;\n\n\tresult_ft22 = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<ecore.EPackage> it_ft22 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EPackage>convertAsOrderedSet(this.getEcorePackages()).iterator();\n\tjava.lang.Boolean idLoopCond_76 = false;\n\twhile( !idLoopCond_76 ) {\n\tidLoopCond_76 = kermeta.standard.helper.BooleanWrapper.or(it_ft22.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqual(result_ft22, null));\n\tif ( idLoopCond_76 ) {\n\t} else {\n\n\telem_ft22 = it_ft22.next();\n\n\tjava.lang.Boolean idIfCond_77 = false;\n//BIle:detector\necore.EPackage p_lbdExp22 = elem_ft22;\n\n\tidIfCond_77 = kermeta.standard.helper.StringWrapper.equals(p_lbdExp22.getName(), set_qname.at(0));\n//EIle:detector\n\n\n\tif( idIfCond_77 ) {\n\n\tresult_ft22 = elem_ft22;\n}\n\n}\n\t}\n}\n\n\n//CE\npack = result_ft22;\n//EIft:detect\n\n\n\t\n{\n\n\tjava.lang.Integer i = 1;\n\tjava.lang.Boolean idLoopCond_78 = false;\n\twhile( !idLoopCond_78 ) {\n\tidLoopCond_78 = kermeta.standard.helper.IntegerWrapper.isGreaterOrEqual(i, kermeta.standard.helper.IntegerWrapper.minus(set_qname.size(), 1));\n\tif ( idLoopCond_78 ) {\n\t} else {\n\n\tpack = null;\n//BIft:detect\n\necore.EPackage result_ft23 = null;\n\n\tecore.EPackage elem_ft23 = null;\n\n\tresult_ft23 = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<ecore.EPackage> it_ft23 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EPackage>convertAsOrderedSet(pack.getESubpackages()).iterator();\n\tjava.lang.Boolean idLoopCond_79 = false;\n\twhile( !idLoopCond_79 ) {\n\tidLoopCond_79 = kermeta.standard.helper.BooleanWrapper.or(it_ft23.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqual(result_ft23, null));\n\tif ( idLoopCond_79 ) {\n\t} else {\n\n\telem_ft23 = it_ft23.next();\n\n\tjava.lang.Boolean idIfCond_80 = false;\n//BIle:detector\necore.EPackage p_lbdExp23 = elem_ft23;\n\n\tidIfCond_80 = kermeta.standard.helper.StringWrapper.equals(p_lbdExp23.getName(), set_qname.at(i));\n//EIle:detector\n\n\n\tif( idIfCond_80 ) {\n\n\tresult_ft23 = elem_ft23;\n}\n\n}\n\t}\n}\n\n//EIft:detect\n\n\n\ti = kermeta.standard.helper.IntegerWrapper.plus(i, 1);\n}\n\t}\n}\n\n\n\tresult = null;\n//BIft:detect\n\necore.EClassifier result_ft24 = null;\n\n\tecore.EClassifier elem_ft24 = null;\n\n\tresult_ft24 = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<ecore.EClassifier> it_ft24 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EClassifier>convertAsOrderedSet(pack.getEClassifiers()).iterator();\n\tjava.lang.Boolean idLoopCond_81 = false;\n\twhile( !idLoopCond_81 ) {\n\tidLoopCond_81 = kermeta.standard.helper.BooleanWrapper.or(it_ft24.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqual(result_ft24, null));\n\tif ( idLoopCond_81 ) {\n\t} else {\n\n\telem_ft24 = it_ft24.next();\n\n\tjava.lang.Boolean idIfCond_82 = false;\n//BIle:detector\necore.EClassifier c_lbdExp24 = elem_ft24;\n\n\tidIfCond_82 = kermeta.standard.helper.StringWrapper.equals(c_lbdExp24.getName(), set_qname.at(kermeta.standard.helper.IntegerWrapper.minus(set_qname.size(), 1)));\n//EIle:detector\n\n\n\tif( idIfCond_82 ) {\n\n\tresult_ft24 = elem_ft24;\n}\n\n}\n\t}\n}\n\n//EIft:detect\n\n\nreturn result;\n'"
	 * @generated
	 */
	EClassifier getEClassifierByQualifiedName(String qname);

} // ModelingUnit
