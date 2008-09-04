/**
 * <copyright>
 * </copyright>
 *
 * $Id: EClass.java,v 1.1 2008-09-04 15:40:35 cfaucher Exp $
 */
package ecore;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EClass</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ecore.EClass#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link ecore.EClass#getEStructuralFeatures <em>EStructural Features</em>}</li>
 *   <li>{@link ecore.EClass#getEAllAttributes <em>EAll Attributes</em>}</li>
 *   <li>{@link ecore.EClass#getEOperations <em>EOperations</em>}</li>
 *   <li>{@link ecore.EClass#getEReferences <em>EReferences</em>}</li>
 *   <li>{@link ecore.EClass#isInterface <em>Interface</em>}</li>
 *   <li>{@link ecore.EClass#getESuperTypes <em>ESuper Types</em>}</li>
 *   <li>{@link ecore.EClass#getEAllReferences <em>EAll References</em>}</li>
 *   <li>{@link ecore.EClass#getEAllContainments <em>EAll Containments</em>}</li>
 *   <li>{@link ecore.EClass#getEGenericSuperTypes <em>EGeneric Super Types</em>}</li>
 *   <li>{@link ecore.EClass#getEAllGenericSuperTypes <em>EAll Generic Super Types</em>}</li>
 *   <li>{@link ecore.EClass#getEAttributes <em>EAttributes</em>}</li>
 *   <li>{@link ecore.EClass#getEIDAttribute <em>EID Attribute</em>}</li>
 *   <li>{@link ecore.EClass#getEAllOperations <em>EAll Operations</em>}</li>
 *   <li>{@link ecore.EClass#getEAllStructuralFeatures <em>EAll Structural Features</em>}</li>
 *   <li>{@link ecore.EClass#getEAllSuperTypes <em>EAll Super Types</em>}</li>
 * </ul>
 * </p>
 *
 * @see ecore.EcorePackage#getEClass()
 * @model annotation="kermeta aspect='true'"
 * @generated
 */
public interface EClass extends EClassifier {
	/**
	 * Returns the value of the '<em><b>Abstract</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract</em>' attribute.
	 * @see #setAbstract(boolean)
	 * @see ecore.EcorePackage#getEClass_Abstract()
	 * @model default="false" dataType="ecore.EBoolean"
	 * @generated
	 */
	boolean isAbstract();

	/**
	 * Sets the value of the '{@link ecore.EClass#isAbstract <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abstract</em>' attribute.
	 * @see #isAbstract()
	 * @generated
	 */
	void setAbstract(boolean value);

	/**
	 * Returns the value of the '<em><b>EStructural Features</b></em>' containment reference list.
	 * The list contents are of type {@link ecore.EStructuralFeature}.
	 * It is bidirectional and its opposite is '{@link ecore.EStructuralFeature#getEContainingClass <em>EContaining Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EStructural Features</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EStructural Features</em>' containment reference list.
	 * @see ecore.EcorePackage#getEClass_EStructuralFeatures()
	 * @see ecore.EStructuralFeature#getEContainingClass
	 * @model opposite="eContainingClass" containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<EStructuralFeature> getEStructuralFeatures();

	/**
	 * Returns the value of the '<em><b>EAll Attributes</b></em>' reference list.
	 * The list contents are of type {@link ecore.EAttribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EAll Attributes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EAll Attributes</em>' reference list.
	 * @see ecore.EcorePackage#getEClass_EAllAttributes()
	 * @model derived="true"
	 *        annotation="kermeta isReadOnly='false'"
	 *        annotation="kompiledderivedProp.setter body='{\n\n\tresult = ((kermeta.standard.OrderedSet<ecore.EAttribute>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.standard.OrderedSet<ecore.EAttribute>\"));\n\n\t//Beginning of the Inlining of the function type: each\n\n\t\n{\n\n\tkermeta.standard.Iterator<ecore.EClass> it_ft171 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EClass>convertAsOrderedSet(this.getEAllSuperTypes()).iterator();\n\tjava.lang.Boolean idLoopCond_805 = false;\n\twhile( !idLoopCond_805 ) {\n\tidLoopCond_805 = it_ft171.isOff();\n\tif ( idLoopCond_805 ) {\n\t} else {\n\n\t//Beginning of the Inlining of the lambda expression: func\necore.EClass t = it_ft171.next();\n\n\tresult.addAll(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EAttribute>convertAsOrderedSet(t.getEAttributes()));\n//End of the Inlining of the lambda expression: func\n\n}\n\t}\n}\n\n//End of the Inlining of the function type: each\n\n}'"
	 *        annotation="kompiledderivedProp.getter body='{\n\n\tresult = ((kermeta.standard.OrderedSet<ecore.EAttribute>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.standard.OrderedSet<ecore.EAttribute>\"));\n\n\t//Beginning of the Inlining of the function type: each\n\n\t\n{\n\n\tkermeta.standard.Iterator<ecore.EClass> it_ft172 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EClass>convertAsOrderedSet(this.getEAllSuperTypes()).iterator();\n\tjava.lang.Boolean idLoopCond_806 = false;\n\twhile( !idLoopCond_806 ) {\n\tidLoopCond_806 = it_ft172.isOff();\n\tif ( idLoopCond_806 ) {\n\t} else {\n\n\t//Beginning of the Inlining of the lambda expression: func\necore.EClass t = it_ft172.next();\n\n\tresult.addAll(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EAttribute>convertAsOrderedSet(t.getEAttributes()));\n//End of the Inlining of the lambda expression: func\n\n}\n\t}\n}\n\n//End of the Inlining of the function type: each\n\n}'"
	 * @generated
	 */
	EList<EAttribute> getEAllAttributes();

	/**
	 * Returns the value of the '<em><b>EOperations</b></em>' containment reference list.
	 * The list contents are of type {@link ecore.EOperation}.
	 * It is bidirectional and its opposite is '{@link ecore.EOperation#getEContainingClass <em>EContaining Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EOperations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EOperations</em>' containment reference list.
	 * @see ecore.EcorePackage#getEClass_EOperations()
	 * @see ecore.EOperation#getEContainingClass
	 * @model opposite="eContainingClass" containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<EOperation> getEOperations();

	/**
	 * Returns the value of the '<em><b>EReferences</b></em>' reference list.
	 * The list contents are of type {@link ecore.EReference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EReferences</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EReferences</em>' reference list.
	 * @see ecore.EcorePackage#getEClass_EReferences()
	 * @model derived="true"
	 *        annotation="kermeta isReadOnly='false'"
	 *        annotation="kompiledderivedProp.setter body='{\n\n\tresult = ((kermeta.standard.OrderedSet<ecore.EReference>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.standard.OrderedSet<ecore.EReference>\"));\n\n\t//Beginning of the Inlining of the function type: each\n\n\t\n{\n\n\tkermeta.standard.Iterator<ecore.EStructuralFeature> it_ft173 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EStructuralFeature>convertAsOrderedSet(this.getEStructuralFeatures()).iterator();\n\tjava.lang.Boolean idLoopCond_807 = false;\n\twhile( !idLoopCond_807 ) {\n\tidLoopCond_807 = it_ft173.isOff();\n\tif ( idLoopCond_807 ) {\n\t} else {\n\n\t//Beginning of the Inlining of the lambda expression: func\necore.EStructuralFeature f = it_ft173.next();\n\n\tjava.lang.Boolean idIfCond_808 = false;\n\tidIfCond_808 = org.kermeta.compil.runtime.helper.language.TypeUtil.isInstance(org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"ecore.EReference\"), f);\n\n\tif( idIfCond_808 ) {\n\n\tecore.EReference a = null;\n\n\ta = (ecore.EReference) f;\n\n\tresult.add(a);\n}\n\n//End of the Inlining of the lambda expression: func\n\n}\n\t}\n}\n\n//End of the Inlining of the function type: each\n\n}'"
	 *        annotation="kompiledderivedProp.getter body='{\n\n\tresult = ((kermeta.standard.OrderedSet<ecore.EReference>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.standard.OrderedSet<ecore.EReference>\"));\n\n\t//Beginning of the Inlining of the function type: each\n\n\t\n{\n\n\tkermeta.standard.Iterator<ecore.EStructuralFeature> it_ft174 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EStructuralFeature>convertAsOrderedSet(this.getEStructuralFeatures()).iterator();\n\tjava.lang.Boolean idLoopCond_809 = false;\n\twhile( !idLoopCond_809 ) {\n\tidLoopCond_809 = it_ft174.isOff();\n\tif ( idLoopCond_809 ) {\n\t} else {\n\n\t//Beginning of the Inlining of the lambda expression: func\necore.EStructuralFeature f = it_ft174.next();\n\n\tjava.lang.Boolean idIfCond_810 = false;\n\tidIfCond_810 = org.kermeta.compil.runtime.helper.language.TypeUtil.isInstance(org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"ecore.EReference\"), f);\n\n\tif( idIfCond_810 ) {\n\n\tecore.EReference a = null;\n\n\ta = (ecore.EReference) f;\n\n\tresult.add(a);\n}\n\n//End of the Inlining of the lambda expression: func\n\n}\n\t}\n}\n\n//End of the Inlining of the function type: each\n\n}'"
	 * @generated
	 */
	EList<EReference> getEReferences();

	/**
	 * Returns the value of the '<em><b>Interface</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface</em>' attribute.
	 * @see #setInterface(boolean)
	 * @see ecore.EcorePackage#getEClass_Interface()
	 * @model default="false" dataType="ecore.EBoolean"
	 * @generated
	 */
	boolean isInterface();

	/**
	 * Sets the value of the '{@link ecore.EClass#isInterface <em>Interface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interface</em>' attribute.
	 * @see #isInterface()
	 * @generated
	 */
	void setInterface(boolean value);

	/**
	 * Returns the value of the '<em><b>ESuper Types</b></em>' reference list.
	 * The list contents are of type {@link ecore.EClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ESuper Types</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ESuper Types</em>' reference list.
	 * @see ecore.EcorePackage#getEClass_ESuperTypes()
	 * @model
	 * @generated
	 */
	EList<EClass> getESuperTypes();

	/**
	 * Returns the value of the '<em><b>EAll References</b></em>' reference list.
	 * The list contents are of type {@link ecore.EReference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EAll References</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EAll References</em>' reference list.
	 * @see ecore.EcorePackage#getEClass_EAllReferences()
	 * @model derived="true"
	 *        annotation="kermeta isReadOnly='false'"
	 *        annotation="kompiledderivedProp.setter body='{\n\n\tresult = ((kermeta.standard.OrderedSet<ecore.EReference>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.standard.OrderedSet<ecore.EReference>\"));\n\n\t//Beginning of the Inlining of the function type: each\n\n\t\n{\n\n\tkermeta.standard.Iterator<ecore.EClass> it_ft175 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EClass>convertAsOrderedSet(this.getEAllSuperTypes()).iterator();\n\tjava.lang.Boolean idLoopCond_811 = false;\n\twhile( !idLoopCond_811 ) {\n\tidLoopCond_811 = it_ft175.isOff();\n\tif ( idLoopCond_811 ) {\n\t} else {\n\n\t//Beginning of the Inlining of the lambda expression: func\necore.EClass t = it_ft175.next();\n\n\tresult.addAll(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EReference>convertAsOrderedSet(t.getEReferences()));\n//End of the Inlining of the lambda expression: func\n\n}\n\t}\n}\n\n//End of the Inlining of the function type: each\n\n}'"
	 *        annotation="kompiledderivedProp.getter body='{\n\n\tresult = ((kermeta.standard.OrderedSet<ecore.EReference>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.standard.OrderedSet<ecore.EReference>\"));\n\n\t//Beginning of the Inlining of the function type: each\n\n\t\n{\n\n\tkermeta.standard.Iterator<ecore.EClass> it_ft176 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EClass>convertAsOrderedSet(this.getEAllSuperTypes()).iterator();\n\tjava.lang.Boolean idLoopCond_812 = false;\n\twhile( !idLoopCond_812 ) {\n\tidLoopCond_812 = it_ft176.isOff();\n\tif ( idLoopCond_812 ) {\n\t} else {\n\n\t//Beginning of the Inlining of the lambda expression: func\necore.EClass t = it_ft176.next();\n\n\tresult.addAll(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EReference>convertAsOrderedSet(t.getEReferences()));\n//End of the Inlining of the lambda expression: func\n\n}\n\t}\n}\n\n//End of the Inlining of the function type: each\n\n}'"
	 * @generated
	 */
	EList<EReference> getEAllReferences();

	/**
	 * Returns the value of the '<em><b>EAll Containments</b></em>' reference list.
	 * The list contents are of type {@link ecore.EReference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EAll Containments</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EAll Containments</em>' reference list.
	 * @see ecore.EcorePackage#getEClass_EAllContainments()
	 * @model derived="true"
	 *        annotation="kermeta isReadOnly='false'"
	 *        annotation="kompiledderivedProp.setter body='{\n\n\tresult = ((kermeta.standard.OrderedSet<ecore.EReference>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.standard.OrderedSet<ecore.EReference>\"));\n\n\torg.kermeta.compil.runtime.helper.io.StdIOUtil.writeln(kermeta.standard.helper.StringWrapper.plus(\"contaimnet : \", kermeta.standard.helper.BooleanWrapper.toString(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EReference>convertAsOrderedSet(this.getEAllReferences()).one().getContainment())));\n\n\t//Beginning of the Inlining of the function type: select\n\nkermeta.standard.Sequence<ecore.EReference> result_ft177 = null;\n\n\tecore.EReference elem_ft177 = null;\n\n\tresult_ft177 = ((kermeta.standard.Sequence<ecore.EReference>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.standard.Sequence<ecore.EReference>\"));\n\n\t\n{\n\n\tkermeta.standard.Iterator<ecore.EReference> it_ft177 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EReference>convertAsOrderedSet(this.getEAllReferences()).iterator();\n\tjava.lang.Boolean idLoopCond_813 = false;\n\twhile( !idLoopCond_813 ) {\n\tidLoopCond_813 = it_ft177.isOff();\n\tif ( idLoopCond_813 ) {\n\t} else {\n\n\telem_ft177 = it_ft177.next();\n\n\tjava.lang.Boolean idIfCond_814 = false;\n//Beginning of the Inlining of the lambda expression: selector\necore.EReference r = elem_ft177;\n\n\tidIfCond_814 = kermeta.standard.helper.BooleanWrapper.equals(r.getContainment(), true);\n//End of the Inlining of the lambda expression: selector\n\n\n\tif( idIfCond_814 ) {\n\n\tresult_ft177.add(elem_ft177);\n}\n\n}\n\t}\n}\n\n//End of the Inlining of the function type: select\nresult.addAll(result_ft177);\n}'"
	 *        annotation="kompiledderivedProp.getter body='{\n\n\tresult = ((kermeta.standard.OrderedSet<ecore.EReference>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.standard.OrderedSet<ecore.EReference>\"));\n\n\torg.kermeta.compil.runtime.helper.io.StdIOUtil.writeln(kermeta.standard.helper.StringWrapper.plus(\"contaimnet : \", kermeta.standard.helper.BooleanWrapper.toString(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EReference>convertAsOrderedSet(this.getEAllReferences()).one().getContainment())));\n\n\t//Beginning of the Inlining of the function type: select\n\nkermeta.standard.Sequence<ecore.EReference> result_ft178 = null;\n\n\tecore.EReference elem_ft178 = null;\n\n\tresult_ft178 = ((kermeta.standard.Sequence<ecore.EReference>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.standard.Sequence<ecore.EReference>\"));\n\n\t\n{\n\n\tkermeta.standard.Iterator<ecore.EReference> it_ft178 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EReference>convertAsOrderedSet(this.getEAllReferences()).iterator();\n\tjava.lang.Boolean idLoopCond_815 = false;\n\twhile( !idLoopCond_815 ) {\n\tidLoopCond_815 = it_ft178.isOff();\n\tif ( idLoopCond_815 ) {\n\t} else {\n\n\telem_ft178 = it_ft178.next();\n\n\tjava.lang.Boolean idIfCond_816 = false;\n//Beginning of the Inlining of the lambda expression: selector\necore.EReference r = elem_ft178;\n\n\tidIfCond_816 = kermeta.standard.helper.BooleanWrapper.equals(r.getContainment(), true);\n//End of the Inlining of the lambda expression: selector\n\n\n\tif( idIfCond_816 ) {\n\n\tresult_ft178.add(elem_ft178);\n}\n\n}\n\t}\n}\n\n//End of the Inlining of the function type: select\nresult.addAll(result_ft178);\n}'"
	 * @generated
	 */
	EList<EReference> getEAllContainments();

	/**
	 * Returns the value of the '<em><b>EGeneric Super Types</b></em>' containment reference list.
	 * The list contents are of type {@link ecore.EGenericType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EGeneric Super Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EGeneric Super Types</em>' containment reference list.
	 * @see ecore.EcorePackage#getEClass_EGenericSuperTypes()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<EGenericType> getEGenericSuperTypes();

	/**
	 * Returns the value of the '<em><b>EAll Generic Super Types</b></em>' reference list.
	 * The list contents are of type {@link ecore.EGenericType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EAll Generic Super Types</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EAll Generic Super Types</em>' reference list.
	 * @see ecore.EcorePackage#getEClass_EAllGenericSuperTypes()
	 * @model transient="true" derived="true"
	 *        annotation="kermeta isReadOnly='false'"
	 *        annotation="kermeta ecore.isTransient='true'"
	 *        annotation="kompiledderivedProp.setter body=''"
	 *        annotation="kompiledderivedProp.getter body=''"
	 * @generated
	 */
	EList<EGenericType> getEAllGenericSuperTypes();

	/**
	 * Returns the value of the '<em><b>EAttributes</b></em>' reference list.
	 * The list contents are of type {@link ecore.EAttribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EAttributes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EAttributes</em>' reference list.
	 * @see ecore.EcorePackage#getEClass_EAttributes()
	 * @model transient="true" derived="true"
	 *        annotation="kermeta isReadOnly='false'"
	 *        annotation="kermeta ecore.isTransient='true'"
	 *        annotation="kompiledderivedProp.setter body='{\n\n\tresult = ((kermeta.standard.OrderedSet<ecore.EAttribute>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.standard.OrderedSet<ecore.EAttribute>\"));\n\n\t//Beginning of the Inlining of the function type: each\n\n\t\n{\n\n\tkermeta.standard.Iterator<ecore.EStructuralFeature> it_ft179 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EStructuralFeature>convertAsOrderedSet(this.getEStructuralFeatures()).iterator();\n\tjava.lang.Boolean idLoopCond_817 = false;\n\twhile( !idLoopCond_817 ) {\n\tidLoopCond_817 = it_ft179.isOff();\n\tif ( idLoopCond_817 ) {\n\t} else {\n\n\t//Beginning of the Inlining of the lambda expression: func\necore.EStructuralFeature f = it_ft179.next();\n\n\tjava.lang.Boolean idIfCond_818 = false;\n\tidIfCond_818 = org.kermeta.compil.runtime.helper.language.TypeUtil.isInstance(org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"ecore.EAttribute\"), f);\n\n\tif( idIfCond_818 ) {\n\n\tecore.EAttribute a = null;\n\n\ta = (ecore.EAttribute) f;\n\n\tresult.add(a);\n}\n\n//End of the Inlining of the lambda expression: func\n\n}\n\t}\n}\n\n//End of the Inlining of the function type: each\n\n}'"
	 *        annotation="kompiledderivedProp.getter body='{\n\n\tresult = ((kermeta.standard.OrderedSet<ecore.EAttribute>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.standard.OrderedSet<ecore.EAttribute>\"));\n\n\t//Beginning of the Inlining of the function type: each\n\n\t\n{\n\n\tkermeta.standard.Iterator<ecore.EStructuralFeature> it_ft180 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EStructuralFeature>convertAsOrderedSet(this.getEStructuralFeatures()).iterator();\n\tjava.lang.Boolean idLoopCond_819 = false;\n\twhile( !idLoopCond_819 ) {\n\tidLoopCond_819 = it_ft180.isOff();\n\tif ( idLoopCond_819 ) {\n\t} else {\n\n\t//Beginning of the Inlining of the lambda expression: func\necore.EStructuralFeature f = it_ft180.next();\n\n\tjava.lang.Boolean idIfCond_820 = false;\n\tidIfCond_820 = org.kermeta.compil.runtime.helper.language.TypeUtil.isInstance(org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"ecore.EAttribute\"), f);\n\n\tif( idIfCond_820 ) {\n\n\tecore.EAttribute a = null;\n\n\ta = (ecore.EAttribute) f;\n\n\tresult.add(a);\n}\n\n//End of the Inlining of the lambda expression: func\n\n}\n\t}\n}\n\n//End of the Inlining of the function type: each\n\n}'"
	 * @generated
	 */
	EList<EAttribute> getEAttributes();

	/**
	 * Returns the value of the '<em><b>EID Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EID Attribute</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EID Attribute</em>' reference.
	 * @see #setEIDAttribute(EAttribute)
	 * @see ecore.EcorePackage#getEClass_EIDAttribute()
	 * @model derived="true"
	 *        annotation="kermeta isReadOnly='false'"
	 *        annotation="kompiledderivedProp.setter body='{\n\n\t\nif (true)\n\tthrow new org.kermeta.compil.runtime.helper.error.KRuntimeError( ((kermeta.exceptions.NotImplementedException) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.exceptions.NotImplementedException\")) );\n\n}'"
	 *        annotation="kompiledderivedProp.getter body='{\n\n\t\nif (true)\n\tthrow new org.kermeta.compil.runtime.helper.error.KRuntimeError( ((kermeta.exceptions.NotImplementedException) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.exceptions.NotImplementedException\")) );\n\n}'"
	 * @generated
	 */
	EAttribute getEIDAttribute();

	/**
	 * Sets the value of the '{@link ecore.EClass#getEIDAttribute <em>EID Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EID Attribute</em>' reference.
	 * @see #getEIDAttribute()
	 * @generated
	 */
	void setEIDAttribute(EAttribute value);

	/**
	 * Returns the value of the '<em><b>EAll Operations</b></em>' reference list.
	 * The list contents are of type {@link ecore.EOperation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EAll Operations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EAll Operations</em>' reference list.
	 * @see ecore.EcorePackage#getEClass_EAllOperations()
	 * @model transient="true" derived="true"
	 *        annotation="kermeta isReadOnly='false'"
	 *        annotation="kermeta ecore.isTransient='true'"
	 *        annotation="kompiledderivedProp.setter body='{\n\n\tresult = ((kermeta.standard.OrderedSet<ecore.EOperation>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.standard.OrderedSet<ecore.EOperation>\"));\n\n\tresult.addAll(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EOperation>convertAsOrderedSet(this.getEOperations()));\n\n\t//Beginning of the Inlining of the function type: each\n\n\t\n{\n\n\tkermeta.standard.Iterator<ecore.EClass> it_ft181 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EClass>convertAsOrderedSet(this.getEAllSuperTypes()).iterator();\n\tjava.lang.Boolean idLoopCond_821 = false;\n\twhile( !idLoopCond_821 ) {\n\tidLoopCond_821 = it_ft181.isOff();\n\tif ( idLoopCond_821 ) {\n\t} else {\n\n\t//Beginning of the Inlining of the lambda expression: func\necore.EClass t = it_ft181.next();\n\n\tresult.addAll(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EOperation>convertAsOrderedSet(t.getEOperations()));\n//End of the Inlining of the lambda expression: func\n\n}\n\t}\n}\n\n//End of the Inlining of the function type: each\n\n}'"
	 *        annotation="kompiledderivedProp.getter body='{\n\n\tresult = ((kermeta.standard.OrderedSet<ecore.EOperation>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.standard.OrderedSet<ecore.EOperation>\"));\n\n\tresult.addAll(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EOperation>convertAsOrderedSet(this.getEOperations()));\n\n\t//Beginning of the Inlining of the function type: each\n\n\t\n{\n\n\tkermeta.standard.Iterator<ecore.EClass> it_ft182 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EClass>convertAsOrderedSet(this.getEAllSuperTypes()).iterator();\n\tjava.lang.Boolean idLoopCond_822 = false;\n\twhile( !idLoopCond_822 ) {\n\tidLoopCond_822 = it_ft182.isOff();\n\tif ( idLoopCond_822 ) {\n\t} else {\n\n\t//Beginning of the Inlining of the lambda expression: func\necore.EClass t = it_ft182.next();\n\n\tresult.addAll(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EOperation>convertAsOrderedSet(t.getEOperations()));\n//End of the Inlining of the lambda expression: func\n\n}\n\t}\n}\n\n//End of the Inlining of the function type: each\n\n}'"
	 * @generated
	 */
	EList<EOperation> getEAllOperations();

	/**
	 * Returns the value of the '<em><b>EAll Structural Features</b></em>' reference list.
	 * The list contents are of type {@link ecore.EStructuralFeature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EAll Structural Features</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EAll Structural Features</em>' reference list.
	 * @see ecore.EcorePackage#getEClass_EAllStructuralFeatures()
	 * @model derived="true"
	 *        annotation="kermeta isReadOnly='false'"
	 *        annotation="kompiledderivedProp.setter body='{\n\n\tresult = ((kermeta.standard.OrderedSet<ecore.EStructuralFeature>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.standard.OrderedSet<ecore.EStructuralFeature>\"));\n\n\tjava.lang.Boolean idIfCond_823 = false;\n\tidIfCond_823 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqual(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EStructuralFeature>convertAsOrderedSet(this.getEStructuralFeatures()), null);\n\n\tif( idIfCond_823 ) {\n\n\tresult.addAll(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EStructuralFeature>convertAsOrderedSet(this.getEStructuralFeatures()));\n}\n\n\n\t//Beginning of the Inlining of the function type: each\n\n\t\n{\n\n\tkermeta.standard.Iterator<ecore.EClass> it_ft183 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EClass>convertAsOrderedSet(this.getEAllSuperTypes()).iterator();\n\tjava.lang.Boolean idLoopCond_824 = false;\n\twhile( !idLoopCond_824 ) {\n\tidLoopCond_824 = it_ft183.isOff();\n\tif ( idLoopCond_824 ) {\n\t} else {\n\n\t//Beginning of the Inlining of the lambda expression: func\necore.EClass t = it_ft183.next();\n\n\tresult.addAll(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EStructuralFeature>convertAsOrderedSet(t.getEStructuralFeatures()));\n//End of the Inlining of the lambda expression: func\n\n}\n\t}\n}\n\n//End of the Inlining of the function type: each\n\n}'"
	 *        annotation="kompiledderivedProp.getter body='{\n\n\tresult = ((kermeta.standard.OrderedSet<ecore.EStructuralFeature>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.standard.OrderedSet<ecore.EStructuralFeature>\"));\n\n\tjava.lang.Boolean idIfCond_825 = false;\n\tidIfCond_825 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqual(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EStructuralFeature>convertAsOrderedSet(this.getEStructuralFeatures()), null);\n\n\tif( idIfCond_825 ) {\n\n\tresult.addAll(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EStructuralFeature>convertAsOrderedSet(this.getEStructuralFeatures()));\n}\n\n\n\t//Beginning of the Inlining of the function type: each\n\n\t\n{\n\n\tkermeta.standard.Iterator<ecore.EClass> it_ft184 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EClass>convertAsOrderedSet(this.getEAllSuperTypes()).iterator();\n\tjava.lang.Boolean idLoopCond_826 = false;\n\twhile( !idLoopCond_826 ) {\n\tidLoopCond_826 = it_ft184.isOff();\n\tif ( idLoopCond_826 ) {\n\t} else {\n\n\t//Beginning of the Inlining of the lambda expression: func\necore.EClass t = it_ft184.next();\n\n\tresult.addAll(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EStructuralFeature>convertAsOrderedSet(t.getEStructuralFeatures()));\n//End of the Inlining of the lambda expression: func\n\n}\n\t}\n}\n\n//End of the Inlining of the function type: each\n\n}'"
	 * @generated
	 */
	EList<EStructuralFeature> getEAllStructuralFeatures();

	/**
	 * Returns the value of the '<em><b>EAll Super Types</b></em>' reference list.
	 * The list contents are of type {@link ecore.EClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EAll Super Types</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EAll Super Types</em>' reference list.
	 * @see ecore.EcorePackage#getEClass_EAllSuperTypes()
	 * @model derived="true"
	 *        annotation="kermeta isReadOnly='false'"
	 *        annotation="kompiledderivedProp.setter body='{\n\n\tresult = ((kermeta.standard.OrderedSet<ecore.EClass>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.standard.OrderedSet<ecore.EClass>\"));\n\n\tresult.addAll(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EClass>convertAsOrderedSet(this.getESuperTypes()));\n\n\t//Beginning of the Inlining of the function type: each\n\n\t\n{\n\n\tkermeta.standard.Iterator<ecore.EClass> it_ft185 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EClass>convertAsOrderedSet(this.getESuperTypes()).iterator();\n\tjava.lang.Boolean idLoopCond_827 = false;\n\twhile( !idLoopCond_827 ) {\n\tidLoopCond_827 = it_ft185.isOff();\n\tif ( idLoopCond_827 ) {\n\t} else {\n\n\t//Beginning of the Inlining of the lambda expression: func\necore.EClass t = it_ft185.next();\n\n\tresult.addAll(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EClass>convertAsOrderedSet(t.getEAllSuperTypes()));\n//End of the Inlining of the lambda expression: func\n\n}\n\t}\n}\n\n//End of the Inlining of the function type: each\n\n}'"
	 *        annotation="kompiledderivedProp.getter body='{\n\n\tresult = ((kermeta.standard.OrderedSet<ecore.EClass>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.standard.OrderedSet<ecore.EClass>\"));\n\n\tresult.addAll(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EClass>convertAsOrderedSet(this.getESuperTypes()));\n\n\t//Beginning of the Inlining of the function type: each\n\n\t\n{\n\n\tkermeta.standard.Iterator<ecore.EClass> it_ft186 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EClass>convertAsOrderedSet(this.getESuperTypes()).iterator();\n\tjava.lang.Boolean idLoopCond_828 = false;\n\twhile( !idLoopCond_828 ) {\n\tidLoopCond_828 = it_ft186.isOff();\n\tif ( idLoopCond_828 ) {\n\t} else {\n\n\t//Beginning of the Inlining of the lambda expression: func\necore.EClass t = it_ft186.next();\n\n\tresult.addAll(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EClass>convertAsOrderedSet(t.getEAllSuperTypes()));\n//End of the Inlining of the lambda expression: func\n\n}\n\t}\n}\n\n//End of the Inlining of the function type: each\n\n}'"
	 * @generated
	 */
	EList<EClass> getEAllSuperTypes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model featureNameDataType="ecore.EString"
	 *        annotation="kermeta isAbstract='true'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='ecore.EStructuralFeature result = null;\n\nreturn result;\n'"
	 * @generated
	 */
	EStructuralFeature getEStructuralFeature(String featureName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="ecore.EInt"
	 *        annotation="kermeta documentation='/** Get a structural feature among AllStructuralFeatures \052/'"
	 *        annotation="kermeta documentation='/** Return the position of the feature in the list of AllStructuralFeatures \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Integer result = null;\n\n\tresult = kermeta.standard.helper.IntegerWrapper.uminus(1);\n\n\t\n{\n\n\tjava.lang.Integer i = 0;\n\tjava.lang.Boolean idLoopCond_829 = false;\n\twhile( !idLoopCond_829 ) {\n\tidLoopCond_829 = kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.IntegerWrapper.equals(i, org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EStructuralFeature>convertAsOrderedSet(this.getEAllStructuralFeatures()).size()), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqual(result, kermeta.standard.helper.IntegerWrapper.uminus(1)));\n\tif ( idLoopCond_829 ) {\n\t} else {\n\n\tjava.lang.Boolean idIfCond_830 = false;\n\tidIfCond_830 = org.kermeta.compil.runtime.helper.language.ObjectUtil.equals(feature, org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EStructuralFeature>convertAsOrderedSet(this.getEAllStructuralFeatures()).elementAt(i));\n\n\tif( idIfCond_830 ) {\n\n\tkermeta.standard.helper.IntegerWrapper.equals(result, i);\n}\n\n\n\ti = kermeta.standard.helper.IntegerWrapper.plus(i, 1);\n}\n\t}\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	int getFeatureID(EStructuralFeature feature);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="ecore.EBoolean"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\t//Beginning of the Inlining of the function type: detect\n\necore.EClass result_ft187 = null;\n\n\tecore.EClass elem_ft187 = null;\n\n\tresult_ft187 = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<ecore.EClass> it_ft187 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EClass>convertAsOrderedSet(someClass.getEAllSuperTypes()).iterator();\n\tjava.lang.Boolean idLoopCond_831 = false;\n\twhile( !idLoopCond_831 ) {\n\tidLoopCond_831 = kermeta.standard.helper.BooleanWrapper.or(it_ft187.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqual(result_ft187, null));\n\tif ( idLoopCond_831 ) {\n\t} else {\n\n\telem_ft187 = it_ft187.next();\n\n\tjava.lang.Boolean idIfCond_832 = false;\n//Beginning of the Inlining of the lambda expression: detector\necore.EClass t = elem_ft187;\n\n\tidIfCond_832 = org.kermeta.compil.runtime.helper.language.ObjectUtil.equals(t, this);\n//End of the Inlining of the lambda expression: detector\n\n\n\tif( idIfCond_832 ) {\n\n\tresult_ft187 = elem_ft187;\n}\n\n}\n\t}\n}\n\n//End of the Inlining of the function type: detect\nresult = org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqual(result_ft187, null);\n\nreturn result;\n'"
	 * @generated
	 */
	boolean isSuperTypeOf(EClass someClass);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="ecore.EInt"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Integer result = null;\n\n\tresult = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EStructuralFeature>convertAsOrderedSet(this.getEAllStructuralFeatures()).size();\n\nreturn result;\n'"
	 * @generated
	 */
	int getFeatureCount();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model featureNameDataType="ecore.EString"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\necore.EStructuralFeature result = null;\n\n\tresult = null;\n//Beginning of the Inlining of the function type: detect\n\necore.EStructuralFeature result_ft188 = null;\n\n\tecore.EStructuralFeature elem_ft188 = null;\n\n\tresult_ft188 = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<ecore.EStructuralFeature> it_ft188 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EStructuralFeature>convertAsOrderedSet(this.getEAllStructuralFeatures()).iterator();\n\tjava.lang.Boolean idLoopCond_833 = false;\n\twhile( !idLoopCond_833 ) {\n\tidLoopCond_833 = kermeta.standard.helper.BooleanWrapper.or(it_ft188.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqual(result_ft188, null));\n\tif ( idLoopCond_833 ) {\n\t} else {\n\n\telem_ft188 = it_ft188.next();\n\n\tjava.lang.Boolean idIfCond_834 = false;\n//Beginning of the Inlining of the lambda expression: detector\necore.EStructuralFeature e = elem_ft188;\n\n\tidIfCond_834 = kermeta.standard.helper.StringWrapper.equals(e.getName(), featureName);\n//End of the Inlining of the lambda expression: detector\n\n\n\tif( idIfCond_834 ) {\n\n\tresult_ft188 = elem_ft188;\n}\n\n}\n\t}\n}\n\n//End of the Inlining of the function type: detect\n\n\nreturn result;\n'"
	 * @generated
	 */
	EStructuralFeature getEStructuralFeature2(String featureName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model featureIDDataType="ecore.EInt"
	 *        annotation="kermeta isAbstract='true'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='ecore.EStructuralFeature result = null;\n\nreturn result;\n'"
	 * @generated
	 */
	EStructuralFeature op_getEStructuralFeature(int featureID);

} // EClass
