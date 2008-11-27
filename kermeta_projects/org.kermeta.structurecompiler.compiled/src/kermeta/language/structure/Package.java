/**
 * <copyright>
 * </copyright>
 *
 * $Id: Package.java,v 1.10 2008-11-27 15:50:02 cfaucher Exp $
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
 *   <li>{@link kermeta.language.structure.Package#getGenModelBasePackage <em>Gen Model Base Package</em>}</li>
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
public interface Package extends Traceability<EPackage>, NamedElement,
		TypeDefinitionContainer {
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
	 * Returns the value of the '<em><b>Gen Model Base Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gen Model Base Package</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gen Model Base Package</em>' attribute.
	 * @see #setGenModelBasePackage(String)
	 * @see kermeta.language.structure.StructurePackage#getPackage_GenModelBasePackage()
	 * @model dataType="kermeta.standard.JavaString"
	 * @generated
	 */
	String getGenModelBasePackage();

	/**
	 * Sets the value of the '{@link kermeta.language.structure.Package#getGenModelBasePackage <em>Gen Model Base Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gen Model Base Package</em>' attribute.
	 * @see #getGenModelBasePackage()
	 * @generated
	 */
	void setGenModelBasePackage(String value);

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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tecore.EPackage ecorePackage = this.createEcoreModelElement(context);\n\n\tkermeta.language.structure.Package p = this.getNestingPackage();\n\n\tjava.lang.Boolean idIfCond_249 = false;\n\tidIfCond_249 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(p, null);\n\n\tif( idIfCond_249 ) {\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EPackage>convertAsOrderedSet(p.getEcoreModelElement().getESubpackages()).add(ecorePackage);\n}\n\n\n\tthis.setEcoreModelElement(ecorePackage);\n\n\t//BIft:eachOwnedElement\n\n\tkermeta.language.structure.Package pack_ft73 = this;\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Tag> it_ft74 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Tag>convertAsOrderedSet(pack_ft73.getOwnedTags()).iterator();\n\tjava.lang.Boolean idLoopCond_250 = false;\n\twhile( !idLoopCond_250 ) {\n\tidLoopCond_250 = it_ft74.isOff();\n\tif ( idLoopCond_250 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Tag o_lbdExp74 = it_ft74.next();\n\n\t//BIle:func\nkermeta.language.structure.Tag cd_lbdExp73 = o_lbdExp74;\n\n\tjava.lang.Boolean idIfCond_251 = false;\n\tidIfCond_251 = kermeta.standard.helper.StringWrapper.equals(cd_lbdExp73.getDeprecated(), \"\");\n\n\tif( idIfCond_251 ) {\n\n\tcd_lbdExp73.applyPass1(context);\n}\n\n//EIle:func\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.TypeDefinition> it_ft75 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.TypeDefinition>convertAsOrderedSet(pack_ft73.getOwnedTypeDefinition()).iterator();\n\tjava.lang.Boolean idLoopCond_252 = false;\n\twhile( !idLoopCond_252 ) {\n\tidLoopCond_252 = it_ft75.isOff();\n\tif ( idLoopCond_252 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.TypeDefinition o_lbdExp75 = it_ft75.next();\n\n\t//BIle:func\nkermeta.language.structure.TypeDefinition cd_lbdExp73 = o_lbdExp75;\n\n\tjava.lang.Boolean idIfCond_253 = false;\n\tidIfCond_253 = kermeta.standard.helper.StringWrapper.equals(cd_lbdExp73.getDeprecated(), \"\");\n\n\tif( idIfCond_253 ) {\n\n\tcd_lbdExp73.applyPass1(context);\n}\n\n//EIle:func\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Package> it_ft76 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Package>convertAsOrderedSet(pack_ft73.getNestedPackage()).iterator();\n\tjava.lang.Boolean idLoopCond_254 = false;\n\twhile( !idLoopCond_254 ) {\n\tidLoopCond_254 = it_ft76.isOff();\n\tif ( idLoopCond_254 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Package p_lbdExp76 = it_ft76.next();\n\n\t//BIle:func\nkermeta.language.structure.Package cd_lbdExp73 = p_lbdExp76;\n\n\tjava.lang.Boolean idIfCond_255 = false;\n\tidIfCond_255 = kermeta.standard.helper.StringWrapper.equals(cd_lbdExp73.getDeprecated(), \"\");\n\n\tif( idIfCond_255 ) {\n\n\tcd_lbdExp73.applyPass1(context);\n}\n\n//EIle:func\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n//EIft:eachOwnedElement\n\n'"
	 * @generated
	 */
	void applyPass1(KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\necore.EPackage result = null;\n\n\torg.kermeta.compil.runtime.helper.io.StdIOUtil.getInstance().writeln(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(\" + Package \", this.qualifiedName()), \" in progress\"));\n\n\tecore.EPackage ecorePackage = ((ecore.EPackage) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"ecore.EPackage\"));\n\n\tecorePackage.setName(((km2ecore.helper.java.IdentifierHelper) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"km2ecore.helper.java.IdentifierHelper\")).getMangledIdentifier(this.getName(), context));\n\n\tjava.lang.Boolean idIfCond_256 = false;\n\tidIfCond_256 = kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(this.getUri())), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(this.getUri(), \"\"));\n\n\tif( idIfCond_256 ) {\n\n\tecorePackage.setNsURI(kermeta.standard.helper.StringWrapper.plus(this.getUri(), \"/kermeta_temp_uri\"));\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EAnnotation>convertAsOrderedSet(ecorePackage.getEAnnotations()).add(((km2ecore.helper.ecore.EAnnotationHelper) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"km2ecore.helper.ecore.EAnnotationHelper\")).createKermetaEAnnotation(\"ecoreUri\", this.getUri()));\n}\n else {\n\n\tjava.lang.String default_uri = kermeta.standard.helper.StringWrapper.plus(\"http://www.kermeta.org/\", kermeta.standard.helper.StringWrapper.replace(this.qualifiedName(), \"::\", \"/\"));\n\n\tecorePackage.setNsURI(kermeta.standard.helper.StringWrapper.plus(default_uri, \"/kermeta_temp_uri\"));\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EAnnotation>convertAsOrderedSet(ecorePackage.getEAnnotations()).add(((km2ecore.helper.ecore.EAnnotationHelper) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"km2ecore.helper.ecore.EAnnotationHelper\")).createKermetaEAnnotation(\"ecoreUri\", default_uri));\n}\n\n\n\tecorePackage.setNsPrefix(\"\");\n\n\tresult = ecorePackage;\n\nreturn result;\n'"
	 * @generated
	 */
	EPackage createEcoreModelElement(KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.standard.OrderedSet<kermeta.language.structure.Package> result = null;\n\n\tresult = ((kermeta.standard.OrderedSet<kermeta.language.structure.Package>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.standard.OrderedSet<kermeta.language.structure.Package>\"));\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Package> it_ft77 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Package>convertAsOrderedSet(this.getNestedPackage()).iterator();\n\tjava.lang.Boolean idLoopCond_257 = false;\n\twhile( !idLoopCond_257 ) {\n\tidLoopCond_257 = it_ft77.isOff();\n\tif ( idLoopCond_257 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Package p_lbdExp77 = it_ft77.next();\n\n\tresult.add(p_lbdExp77);\n\n\tresult.addAll(p_lbdExp77.getAllSubPackages());\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\nreturn result;\n'"
	 * @generated
	 */
	OrderedSet<Package> getAllSubPackages();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta superOperation='kermeta::language::structure::Object'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\t//BIft:eachOwnedElement\n\n\tkermeta.language.structure.Package pack_ft78 = this;\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Tag> it_ft79 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Tag>convertAsOrderedSet(pack_ft78.getOwnedTags()).iterator();\n\tjava.lang.Boolean idLoopCond_258 = false;\n\twhile( !idLoopCond_258 ) {\n\tidLoopCond_258 = it_ft79.isOff();\n\tif ( idLoopCond_258 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Tag o_lbdExp79 = it_ft79.next();\n\n\t//BIle:func\nkermeta.language.structure.Tag p_lbdExp78 = o_lbdExp79;\n\n\tp_lbdExp78.applyPass2BehaviorJava(context);\n//EIle:func\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.TypeDefinition> it_ft80 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.TypeDefinition>convertAsOrderedSet(pack_ft78.getOwnedTypeDefinition()).iterator();\n\tjava.lang.Boolean idLoopCond_259 = false;\n\twhile( !idLoopCond_259 ) {\n\tidLoopCond_259 = it_ft80.isOff();\n\tif ( idLoopCond_259 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.TypeDefinition o_lbdExp80 = it_ft80.next();\n\n\t//BIle:func\nkermeta.language.structure.TypeDefinition p_lbdExp78 = o_lbdExp80;\n\n\tp_lbdExp78.applyPass2BehaviorJava(context);\n//EIle:func\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Package> it_ft81 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Package>convertAsOrderedSet(pack_ft78.getNestedPackage()).iterator();\n\tjava.lang.Boolean idLoopCond_260 = false;\n\twhile( !idLoopCond_260 ) {\n\tidLoopCond_260 = it_ft81.isOff();\n\tif ( idLoopCond_260 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Package p_lbdExp81 = it_ft81.next();\n\n\t//BIle:func\nkermeta.language.structure.Package p_lbdExp78 = p_lbdExp81;\n\n\tp_lbdExp78.applyPass2BehaviorJava(context);\n//EIle:func\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n//EIft:eachOwnedElement\n\n'"
	 * @generated
	 */
	void applyPass2BehaviorJava(KM2EcoreContext context);

} // Package
