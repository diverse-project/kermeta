/**
 * <copyright>
 * </copyright>
 *
 * $Id: Package.java,v 1.2 2008-09-11 12:34:37 cfaucher Exp $
 */
package kermeta.language.structure;

import ecore.EPackage;

import kermeta.standard.OrderedSet;

import km2ecore.KM2EcoreContext;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kermeta.language.structure.Package#getNestingPackage <em>Nesting Package</em>}</li>
 *   <li>{@link kermeta.language.structure.Package#getNestedPackage <em>Nested Package</em>}</li>
 *   <li>{@link kermeta.language.structure.Package#getUri <em>Uri</em>}</li>
 * </ul>
 * </p>
 *
 * @see kermeta.language.structure.StructurePackage#getPackage()
 * @model annotation="kermeta documentation='/**\n *\n \052/'"
 *        annotation="kermeta documentation='Package in kermeta. Each kermeta model must have a root package. '"
 * @generated
 */
public interface Package extends NamedElement, TypeDefinitionContainer,
		Traceability<EPackage> {
	/**
	 * Returns the value of the '<em><b>Nesting Package</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link kermeta.language.structure.Package#getNestedPackage <em>Nested Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nesting Package</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nesting Package</em>' container reference.
	 * @see #setNestingPackage(Package)
	 * @see kermeta.language.structure.StructurePackage#getPackage_NestingPackage()
	 * @see kermeta.language.structure.Package#getNestedPackage
	 * @model opposite="nestedPackage"
	 *        annotation="kermeta ecore.isTransient='true'"
	 *        annotation="kermeta documentation='Owning Package, if any'"
	 * @generated
	 */
	Package getNestingPackage();

	/**
	 * Sets the value of the '{@link kermeta.language.structure.Package#getNestingPackage <em>Nesting Package</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nesting Package</em>' container reference.
	 * @see #getNestingPackage()
	 * @generated
	 */
	void setNestingPackage(Package value);

	/**
	 * Returns the value of the '<em><b>Nested Package</b></em>' containment reference list.
	 * The list contents are of type {@link kermeta.language.structure.Package}.
	 * It is bidirectional and its opposite is '{@link kermeta.language.structure.Package#getNestingPackage <em>Nesting Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nested Package</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nested Package</em>' containment reference list.
	 * @see kermeta.language.structure.StructurePackage#getPackage_NestedPackage()
	 * @see kermeta.language.structure.Package#getNestingPackage
	 * @model opposite="nestingPackage" containment="true" resolveProxies="true"
	 *        annotation="kermeta documentation='Nested Packages contained by the Package'"
	 * @generated
	 */
	EList<Package> getNestedPackage();

	/**
	 * Returns the value of the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uri</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uri</em>' attribute.
	 * @see #setUri(String)
	 * @see kermeta.language.structure.StructurePackage#getPackage_Uri()
	 * @model dataType="kermeta.standard.JavaString"
	 *        annotation="kermeta documentation='Uri of the Package'"
	 * @generated
	 */
	String getUri();

	/**
	 * Sets the value of the '{@link kermeta.language.structure.Package#getUri <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uri</em>' attribute.
	 * @see #getUri()
	 * @generated
	 */
	void setUri(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta superOperation='kermeta::language::structure::Object'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tecore.EPackage ecorePackage = this.createEcoreModelElement(context);\n\n\tkermeta.language.structure.Package p = this.getNestingPackage();\n\n\tjava.lang.Boolean idIfCond_87 = false;\n\tidIfCond_87 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqual(p, null);\n\n\tif( idIfCond_87 ) {\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EPackage>convertAsOrderedSet(p.getEcoreModelElement().getESubpackages()).add(ecorePackage);\n}\n\n\n\tthis.setEcoreModelElement(ecorePackage);\n\n\t//BIft:eachOwnedElement\n\n\tkermeta.language.structure.Package pack_ft27 = this;\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Tag> it_ft28 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Tag>convertAsOrderedSet(pack_ft27.getOwnedTags()).iterator();\n\tjava.lang.Boolean idLoopCond_88 = false;\n\twhile( !idLoopCond_88 ) {\n\tidLoopCond_88 = it_ft28.isOff();\n\tif ( idLoopCond_88 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Tag o_lbdExp28 = it_ft28.next();\n\n\t//BIle:func\nkermeta.language.structure.Tag cd_lbdExp27 = o_lbdExp28;\n\n\tjava.lang.Boolean idIfCond_89 = false;\n\tidIfCond_89 = kermeta.standard.helper.StringWrapper.equals(cd_lbdExp27.getDeprecated(), \"\");\n\n\tif( idIfCond_89 ) {\n\n\tcd_lbdExp27.applyPass1(context);\n}\n\n//EIle:func\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.TypeDefinition> it_ft29 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.TypeDefinition>convertAsOrderedSet(pack_ft27.getOwnedTypeDefinition()).iterator();\n\tjava.lang.Boolean idLoopCond_90 = false;\n\twhile( !idLoopCond_90 ) {\n\tidLoopCond_90 = it_ft29.isOff();\n\tif ( idLoopCond_90 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.TypeDefinition o_lbdExp29 = it_ft29.next();\n\n\t//BIle:func\nkermeta.language.structure.TypeDefinition cd_lbdExp27 = o_lbdExp29;\n\n\tjava.lang.Boolean idIfCond_91 = false;\n\tidIfCond_91 = kermeta.standard.helper.StringWrapper.equals(cd_lbdExp27.getDeprecated(), \"\");\n\n\tif( idIfCond_91 ) {\n\n\tcd_lbdExp27.applyPass1(context);\n}\n\n//EIle:func\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Package> it_ft30 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Package>convertAsOrderedSet(pack_ft27.getNestedPackage()).iterator();\n\tjava.lang.Boolean idLoopCond_92 = false;\n\twhile( !idLoopCond_92 ) {\n\tidLoopCond_92 = it_ft30.isOff();\n\tif ( idLoopCond_92 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Package p_lbdExp30 = it_ft30.next();\n\n\t//BIle:func\nkermeta.language.structure.Package cd_lbdExp27 = p_lbdExp30;\n\n\tjava.lang.Boolean idIfCond_93 = false;\n\tidIfCond_93 = kermeta.standard.helper.StringWrapper.equals(cd_lbdExp27.getDeprecated(), \"\");\n\n\tif( idIfCond_93 ) {\n\n\tcd_lbdExp27.applyPass1(context);\n}\n\n//EIle:func\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n//EIft:eachOwnedElement\n\n'"
	 * @generated
	 */
	void applyPass1(KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\necore.EPackage result = null;\n\n\torg.kermeta.compil.runtime.helper.io.StdIOUtil.writeln(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(\" + Package \", this.qualifiedName()), \" in progress\"));\n\n\tecore.EPackage ecorePackage = ((ecore.EPackage) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"ecore.EPackage\"));\n\n\tecorePackage.setName(((km2ecore.helper.java.IdentifierHelper) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"km2ecore.helper.java.IdentifierHelper\")).getMangledIdentifier(this.getName(), context));\n\n\tjava.lang.Boolean idIfCond_94 = false;\n\tidIfCond_94 = kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoid(this.getUri())), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqual(this.getUri(), \"\"));\n\n\tif( idIfCond_94 ) {\n\n\tecorePackage.setNsURI(kermeta.standard.helper.StringWrapper.plus(this.getUri(), \"/kermeta_temp_uri\"));\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EAnnotation>convertAsOrderedSet(ecorePackage.getEAnnotations()).add(((km2ecore.helper.ecore.EAnnotationHelper) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"km2ecore.helper.ecore.EAnnotationHelper\")).createKermetaEAnnotation(\"ecoreUri\", this.getUri()));\n}\n else {\n\n\tjava.lang.String default_uri = kermeta.standard.helper.StringWrapper.plus(\"http://www.kermeta.org/\", kermeta.standard.helper.StringWrapper.replace(this.qualifiedName(), \"::\", \"/\"));\n\n\tecorePackage.setNsURI(kermeta.standard.helper.StringWrapper.plus(default_uri, \"/kermeta_temp_uri\"));\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EAnnotation>convertAsOrderedSet(ecorePackage.getEAnnotations()).add(((km2ecore.helper.ecore.EAnnotationHelper) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"km2ecore.helper.ecore.EAnnotationHelper\")).createKermetaEAnnotation(\"ecoreUri\", default_uri));\n}\n\n\n\tecorePackage.setNsPrefix(\"\");\n\n\tresult = ecorePackage;\n\nreturn result;\n'"
	 * @generated
	 */
	EPackage createEcoreModelElement(KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.standard.OrderedSet<kermeta.language.structure.Package> result = null;\n\n\tresult = ((kermeta.standard.OrderedSet<kermeta.language.structure.Package>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.standard.OrderedSet<kermeta.language.structure.Package>\"));\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Package> it_ft31 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Package>convertAsOrderedSet(this.getNestedPackage()).iterator();\n\tjava.lang.Boolean idLoopCond_95 = false;\n\twhile( !idLoopCond_95 ) {\n\tidLoopCond_95 = it_ft31.isOff();\n\tif ( idLoopCond_95 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Package p_lbdExp31 = it_ft31.next();\n\n\tresult.add(p_lbdExp31);\n\n\tresult.addAll(p_lbdExp31.getAllSubPackages());\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\nreturn result;\n'"
	 * @generated
	 */
	OrderedSet<Package> getAllSubPackages();

} // Package
