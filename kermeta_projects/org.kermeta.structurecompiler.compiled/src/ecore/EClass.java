/**
 * <copyright>
 * </copyright>
 *
 * $Id: EClass.java,v 1.2 2008-09-08 19:28:31 cfaucher Exp $
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
 *   <li>{@link ecore.EClass#getEStructuralFeatures <em>EStructural Features</em>}</li>
 *   <li>{@link ecore.EClass#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link ecore.EClass#getEOperations <em>EOperations</em>}</li>
 *   <li>{@link ecore.EClass#getEAllAttributes <em>EAll Attributes</em>}</li>
 *   <li>{@link ecore.EClass#isInterface <em>Interface</em>}</li>
 *   <li>{@link ecore.EClass#getEReferences <em>EReferences</em>}</li>
 *   <li>{@link ecore.EClass#getEAllReferences <em>EAll References</em>}</li>
 *   <li>{@link ecore.EClass#getESuperTypes <em>ESuper Types</em>}</li>
 *   <li>{@link ecore.EClass#getEAllContainments <em>EAll Containments</em>}</li>
 *   <li>{@link ecore.EClass#getEGenericSuperTypes <em>EGeneric Super Types</em>}</li>
 *   <li>{@link ecore.EClass#getEAllGenericSuperTypes <em>EAll Generic Super Types</em>}</li>
 *   <li>{@link ecore.EClass#getEAttributes <em>EAttributes</em>}</li>
 *   <li>{@link ecore.EClass#getEIDAttribute <em>EID Attribute</em>}</li>
 *   <li>{@link ecore.EClass#getEAllStructuralFeatures <em>EAll Structural Features</em>}</li>
 *   <li>{@link ecore.EClass#getEAllOperations <em>EAll Operations</em>}</li>
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
	 * @model changeable="false" derived="true"
	 *        annotation="kermeta isReadOnly='false'"
	 *        annotation="kompiledderivedProp.setter body='{\n\n\tresult = ((kermeta.standard.OrderedSet<ecore.EAttribute>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.standard.OrderedSet<ecore.EAttribute>\"));\n\n\t//Beginning of the Inlining of the function type: each\n\n\t\n{\n\n\tkermeta.standard.Iterator<ecore.EClass> it_ft195 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EClass>convertAsOrderedSet(this.getEAllSuperTypes()).iterator();\n\tjava.lang.Boolean idLoopCond_886 = false;\n\twhile( !idLoopCond_886 ) {\n\tidLoopCond_886 = it_ft195.isOff();\n\tif ( idLoopCond_886 ) {\n\t} else {\n\n\t//Beginning of the Inlining of the lambda expression: func\necore.EClass t = it_ft195.next();\n\n\tresult.addAll(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EAttribute>convertAsOrderedSet(t.getEAttributes()));\n//End of the Inlining of the lambda expression: func\n\n}\n\t}\n}\n\n//End of the Inlining of the function type: each\n\n}'"
	 *        annotation="kompiledderivedProp.getter body='{\n\n\tresult = ((kermeta.standard.OrderedSet<ecore.EAttribute>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.standard.OrderedSet<ecore.EAttribute>\"));\n\n\t//Beginning of the Inlining of the function type: each\n\n\t\n{\n\n\tkermeta.standard.Iterator<ecore.EClass> it_ft196 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EClass>convertAsOrderedSet(this.getEAllSuperTypes()).iterator();\n\tjava.lang.Boolean idLoopCond_887 = false;\n\twhile( !idLoopCond_887 ) {\n\tidLoopCond_887 = it_ft196.isOff();\n\tif ( idLoopCond_887 ) {\n\t} else {\n\n\t//Beginning of the Inlining of the lambda expression: func\necore.EClass t = it_ft196.next();\n\n\tresult.addAll(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EAttribute>convertAsOrderedSet(t.getEAttributes()));\n//End of the Inlining of the lambda expression: func\n\n}\n\t}\n}\n\n//End of the Inlining of the function type: each\n\n}'"
	 * @generated
	 */
	EList<EAttribute> getEAllAttributes();

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
	 * @model transient="true" changeable="false" derived="true"
	 *        annotation="kermeta isReadOnly='false'"
	 *        annotation="kermeta ecore.isTransient='true'"
	 *        annotation="kompiledderivedProp.setter body='{\n\n\tresult = ((kermeta.standard.OrderedSet<ecore.EReference>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.standard.OrderedSet<ecore.EReference>\"));\n\n\t//Beginning of the Inlining of the function type: each\n\n\t\n{\n\n\tkermeta.standard.Iterator<ecore.EStructuralFeature> it_ft197 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EStructuralFeature>convertAsOrderedSet(this.getEStructuralFeatures()).iterator();\n\tjava.lang.Boolean idLoopCond_888 = false;\n\twhile( !idLoopCond_888 ) {\n\tidLoopCond_888 = it_ft197.isOff();\n\tif ( idLoopCond_888 ) {\n\t} else {\n\n\t//Beginning of the Inlining of the lambda expression: func\necore.EStructuralFeature f = it_ft197.next();\n\n\tjava.lang.Boolean idIfCond_889 = false;\n\tidIfCond_889 = org.kermeta.compil.runtime.helper.language.TypeUtil.isInstance(org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"ecore.EReference\"), f);\n\n\tif( idIfCond_889 ) {\n\n\tecore.EReference a = null;\n\n\ta = (ecore.EReference) f;\n\n\tresult.add(a);\n}\n\n//End of the Inlining of the lambda expression: func\n\n}\n\t}\n}\n\n//End of the Inlining of the function type: each\n\n}'"
	 *        annotation="kompiledderivedProp.getter body='{\n\n\tresult = ((kermeta.standard.OrderedSet<ecore.EReference>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.standard.OrderedSet<ecore.EReference>\"));\n\n\t//Beginning of the Inlining of the function type: each\n\n\t\n{\n\n\tkermeta.standard.Iterator<ecore.EStructuralFeature> it_ft198 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EStructuralFeature>convertAsOrderedSet(this.getEStructuralFeatures()).iterator();\n\tjava.lang.Boolean idLoopCond_890 = false;\n\twhile( !idLoopCond_890 ) {\n\tidLoopCond_890 = it_ft198.isOff();\n\tif ( idLoopCond_890 ) {\n\t} else {\n\n\t//Beginning of the Inlining of the lambda expression: func\necore.EStructuralFeature f = it_ft198.next();\n\n\tjava.lang.Boolean idIfCond_891 = false;\n\tidIfCond_891 = org.kermeta.compil.runtime.helper.language.TypeUtil.isInstance(org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"ecore.EReference\"), f);\n\n\tif( idIfCond_891 ) {\n\n\tecore.EReference a = null;\n\n\ta = (ecore.EReference) f;\n\n\tresult.add(a);\n}\n\n//End of the Inlining of the lambda expression: func\n\n}\n\t}\n}\n\n//End of the Inlining of the function type: each\n\n}'"
	 * @generated
	 */
	EList<EReference> getEReferences();

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
	 * @model transient="true" changeable="false" derived="true"
	 *        annotation="kermeta isReadOnly='false'"
	 *        annotation="kermeta ecore.isTransient='true'"
	 *        annotation="kompiledderivedProp.setter body='{\n\n\tresult = ((kermeta.standard.OrderedSet<ecore.EReference>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.standard.OrderedSet<ecore.EReference>\"));\n\n\t//Beginning of the Inlining of the function type: each\n\n\t\n{\n\n\tkermeta.standard.Iterator<ecore.EClass> it_ft199 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EClass>convertAsOrderedSet(this.getEAllSuperTypes()).iterator();\n\tjava.lang.Boolean idLoopCond_892 = false;\n\twhile( !idLoopCond_892 ) {\n\tidLoopCond_892 = it_ft199.isOff();\n\tif ( idLoopCond_892 ) {\n\t} else {\n\n\t//Beginning of the Inlining of the lambda expression: func\necore.EClass t = it_ft199.next();\n\n\tresult.addAll(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EReference>convertAsOrderedSet(t.getEReferences()));\n//End of the Inlining of the lambda expression: func\n\n}\n\t}\n}\n\n//End of the Inlining of the function type: each\n\n}'"
	 *        annotation="kompiledderivedProp.getter body='{\n\n\tresult = ((kermeta.standard.OrderedSet<ecore.EReference>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.standard.OrderedSet<ecore.EReference>\"));\n\n\t//Beginning of the Inlining of the function type: each\n\n\t\n{\n\n\tkermeta.standard.Iterator<ecore.EClass> it_ft200 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EClass>convertAsOrderedSet(this.getEAllSuperTypes()).iterator();\n\tjava.lang.Boolean idLoopCond_893 = false;\n\twhile( !idLoopCond_893 ) {\n\tidLoopCond_893 = it_ft200.isOff();\n\tif ( idLoopCond_893 ) {\n\t} else {\n\n\t//Beginning of the Inlining of the lambda expression: func\necore.EClass t = it_ft200.next();\n\n\tresult.addAll(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EReference>convertAsOrderedSet(t.getEReferences()));\n//End of the Inlining of the lambda expression: func\n\n}\n\t}\n}\n\n//End of the Inlining of the function type: each\n\n}'"
	 * @generated
	 */
	EList<EReference> getEAllReferences();

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
	 * @model changeable="false" derived="true"
	 *        annotation="kermeta isReadOnly='false'"
	 *        annotation="kompiledderivedProp.setter body='{\n\n\tresult = ((kermeta.standard.OrderedSet<ecore.EReference>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.standard.OrderedSet<ecore.EReference>\"));\n\n\torg.kermeta.compil.runtime.helper.io.StdIOUtil.writeln(kermeta.standard.helper.StringWrapper.plus(\"contaimnet : \", kermeta.standard.helper.BooleanWrapper.toString(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EReference>convertAsOrderedSet(this.getEAllReferences()).one().getContainment())));\n\n\t//Beginning of the Inlining of the function type: select\n\nkermeta.standard.Sequence<ecore.EReference> result_ft201 = null;\n\n\tecore.EReference elem_ft201 = null;\n\n\tresult_ft201 = ((kermeta.standard.Sequence<ecore.EReference>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.standard.Sequence<ecore.EReference>\"));\n\n\t\n{\n\n\tkermeta.standard.Iterator<ecore.EReference> it_ft201 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EReference>convertAsOrderedSet(this.getEAllReferences()).iterator();\n\tjava.lang.Boolean idLoopCond_894 = false;\n\twhile( !idLoopCond_894 ) {\n\tidLoopCond_894 = it_ft201.isOff();\n\tif ( idLoopCond_894 ) {\n\t} else {\n\n\telem_ft201 = it_ft201.next();\n\n\tjava.lang.Boolean idIfCond_895 = false;\n//Beginning of the Inlining of the lambda expression: selector\necore.EReference r = elem_ft201;\n\n\tidIfCond_895 = kermeta.standard.helper.BooleanWrapper.equals(r.getContainment(), true);\n//End of the Inlining of the lambda expression: selector\n\n\n\tif( idIfCond_895 ) {\n\n\tresult_ft201.add(elem_ft201);\n}\n\n}\n\t}\n}\n\n//End of the Inlining of the function type: select\nresult.addAll(result_ft201);\n}'"
	 *        annotation="kompiledderivedProp.getter body='{\n\n\tresult = ((kermeta.standard.OrderedSet<ecore.EReference>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.standard.OrderedSet<ecore.EReference>\"));\n\n\torg.kermeta.compil.runtime.helper.io.StdIOUtil.writeln(kermeta.standard.helper.StringWrapper.plus(\"contaimnet : \", kermeta.standard.helper.BooleanWrapper.toString(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EReference>convertAsOrderedSet(this.getEAllReferences()).one().getContainment())));\n\n\t//Beginning of the Inlining of the function type: select\n\nkermeta.standard.Sequence<ecore.EReference> result_ft202 = null;\n\n\tecore.EReference elem_ft202 = null;\n\n\tresult_ft202 = ((kermeta.standard.Sequence<ecore.EReference>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.standard.Sequence<ecore.EReference>\"));\n\n\t\n{\n\n\tkermeta.standard.Iterator<ecore.EReference> it_ft202 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EReference>convertAsOrderedSet(this.getEAllReferences()).iterator();\n\tjava.lang.Boolean idLoopCond_896 = false;\n\twhile( !idLoopCond_896 ) {\n\tidLoopCond_896 = it_ft202.isOff();\n\tif ( idLoopCond_896 ) {\n\t} else {\n\n\telem_ft202 = it_ft202.next();\n\n\tjava.lang.Boolean idIfCond_897 = false;\n//Beginning of the Inlining of the lambda expression: selector\necore.EReference r = elem_ft202;\n\n\tidIfCond_897 = kermeta.standard.helper.BooleanWrapper.equals(r.getContainment(), true);\n//End of the Inlining of the lambda expression: selector\n\n\n\tif( idIfCond_897 ) {\n\n\tresult_ft202.add(elem_ft202);\n}\n\n}\n\t}\n}\n\n//End of the Inlining of the function type: select\nresult.addAll(result_ft202);\n}'"
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
	 * @model transient="true" changeable="false" derived="true"
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
	 * @model transient="true" changeable="false" derived="true"
	 *        annotation="kermeta isReadOnly='false'"
	 *        annotation="kermeta ecore.isTransient='true'"
	 *        annotation="kompiledderivedProp.setter body='{\n\n\tresult = ((kermeta.standard.OrderedSet<ecore.EAttribute>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.standard.OrderedSet<ecore.EAttribute>\"));\n\n\t//Beginning of the Inlining of the function type: each\n\n\t\n{\n\n\tkermeta.standard.Iterator<ecore.EStructuralFeature> it_ft203 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EStructuralFeature>convertAsOrderedSet(this.getEStructuralFeatures()).iterator();\n\tjava.lang.Boolean idLoopCond_898 = false;\n\twhile( !idLoopCond_898 ) {\n\tidLoopCond_898 = it_ft203.isOff();\n\tif ( idLoopCond_898 ) {\n\t} else {\n\n\t//Beginning of the Inlining of the lambda expression: func\necore.EStructuralFeature f = it_ft203.next();\n\n\tjava.lang.Boolean idIfCond_899 = false;\n\tidIfCond_899 = org.kermeta.compil.runtime.helper.language.TypeUtil.isInstance(org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"ecore.EAttribute\"), f);\n\n\tif( idIfCond_899 ) {\n\n\tecore.EAttribute a = null;\n\n\ta = (ecore.EAttribute) f;\n\n\tresult.add(a);\n}\n\n//End of the Inlining of the lambda expression: func\n\n}\n\t}\n}\n\n//End of the Inlining of the function type: each\n\n}'"
	 *        annotation="kompiledderivedProp.getter body='{\n\n\tresult = ((kermeta.standard.OrderedSet<ecore.EAttribute>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.standard.OrderedSet<ecore.EAttribute>\"));\n\n\t//Beginning of the Inlining of the function type: each\n\n\t\n{\n\n\tkermeta.standard.Iterator<ecore.EStructuralFeature> it_ft204 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EStructuralFeature>convertAsOrderedSet(this.getEStructuralFeatures()).iterator();\n\tjava.lang.Boolean idLoopCond_900 = false;\n\twhile( !idLoopCond_900 ) {\n\tidLoopCond_900 = it_ft204.isOff();\n\tif ( idLoopCond_900 ) {\n\t} else {\n\n\t//Beginning of the Inlining of the lambda expression: func\necore.EStructuralFeature f = it_ft204.next();\n\n\tjava.lang.Boolean idIfCond_901 = false;\n\tidIfCond_901 = org.kermeta.compil.runtime.helper.language.TypeUtil.isInstance(org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"ecore.EAttribute\"), f);\n\n\tif( idIfCond_901 ) {\n\n\tecore.EAttribute a = null;\n\n\ta = (ecore.EAttribute) f;\n\n\tresult.add(a);\n}\n\n//End of the Inlining of the lambda expression: func\n\n}\n\t}\n}\n\n//End of the Inlining of the function type: each\n\n}'"
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
	 * @see ecore.EcorePackage#getEClass_EIDAttribute()
	 * @model changeable="false" derived="true"
	 *        annotation="kermeta isReadOnly='false'"
	 *        annotation="kompiledderivedProp.setter body='{\n\n\t\nif (true)\n\tthrow new org.kermeta.compil.runtime.helper.error.KRuntimeError( ((kermeta.exceptions.NotImplementedException) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.exceptions.NotImplementedException\")) );\n\n}'"
	 *        annotation="kompiledderivedProp.getter body='{\n\n\t\nif (true)\n\tthrow new org.kermeta.compil.runtime.helper.error.KRuntimeError( ((kermeta.exceptions.NotImplementedException) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.exceptions.NotImplementedException\")) );\n\n}'"
	 * @generated
	 */
	EAttribute getEIDAttribute();

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
	 * @model transient="true" changeable="false" derived="true"
	 *        annotation="kermeta isReadOnly='false'"
	 *        annotation="kermeta ecore.isTransient='true'"
	 *        annotation="kompiledderivedProp.setter body='{\n\n\tresult = ((kermeta.standard.OrderedSet<ecore.EStructuralFeature>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.standard.OrderedSet<ecore.EStructuralFeature>\"));\n\n\tjava.lang.Boolean idIfCond_902 = false;\n\tidIfCond_902 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqual(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EStructuralFeature>convertAsOrderedSet(this.getEStructuralFeatures()), null);\n\n\tif( idIfCond_902 ) {\n\n\tresult.addAll(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EStructuralFeature>convertAsOrderedSet(this.getEStructuralFeatures()));\n}\n\n\n\t//Beginning of the Inlining of the function type: each\n\n\t\n{\n\n\tkermeta.standard.Iterator<ecore.EClass> it_ft205 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EClass>convertAsOrderedSet(this.getEAllSuperTypes()).iterator();\n\tjava.lang.Boolean idLoopCond_903 = false;\n\twhile( !idLoopCond_903 ) {\n\tidLoopCond_903 = it_ft205.isOff();\n\tif ( idLoopCond_903 ) {\n\t} else {\n\n\t//Beginning of the Inlining of the lambda expression: func\necore.EClass t = it_ft205.next();\n\n\tresult.addAll(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EStructuralFeature>convertAsOrderedSet(t.getEStructuralFeatures()));\n//End of the Inlining of the lambda expression: func\n\n}\n\t}\n}\n\n//End of the Inlining of the function type: each\n\n}'"
	 *        annotation="kompiledderivedProp.getter body='{\n\n\tresult = ((kermeta.standard.OrderedSet<ecore.EStructuralFeature>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.standard.OrderedSet<ecore.EStructuralFeature>\"));\n\n\tjava.lang.Boolean idIfCond_904 = false;\n\tidIfCond_904 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqual(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EStructuralFeature>convertAsOrderedSet(this.getEStructuralFeatures()), null);\n\n\tif( idIfCond_904 ) {\n\n\tresult.addAll(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EStructuralFeature>convertAsOrderedSet(this.getEStructuralFeatures()));\n}\n\n\n\t//Beginning of the Inlining of the function type: each\n\n\t\n{\n\n\tkermeta.standard.Iterator<ecore.EClass> it_ft206 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EClass>convertAsOrderedSet(this.getEAllSuperTypes()).iterator();\n\tjava.lang.Boolean idLoopCond_905 = false;\n\twhile( !idLoopCond_905 ) {\n\tidLoopCond_905 = it_ft206.isOff();\n\tif ( idLoopCond_905 ) {\n\t} else {\n\n\t//Beginning of the Inlining of the lambda expression: func\necore.EClass t = it_ft206.next();\n\n\tresult.addAll(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EStructuralFeature>convertAsOrderedSet(t.getEStructuralFeatures()));\n//End of the Inlining of the lambda expression: func\n\n}\n\t}\n}\n\n//End of the Inlining of the function type: each\n\n}'"
	 * @generated
	 */
	EList<EStructuralFeature> getEAllStructuralFeatures();

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
	 * @model transient="true" changeable="false" derived="true"
	 *        annotation="kermeta isReadOnly='false'"
	 *        annotation="kermeta ecore.isTransient='true'"
	 *        annotation="kompiledderivedProp.setter body='{\n\n\tresult = ((kermeta.standard.OrderedSet<ecore.EOperation>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.standard.OrderedSet<ecore.EOperation>\"));\n\n\tresult.addAll(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EOperation>convertAsOrderedSet(this.getEOperations()));\n\n\t//Beginning of the Inlining of the function type: each\n\n\t\n{\n\n\tkermeta.standard.Iterator<ecore.EClass> it_ft207 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EClass>convertAsOrderedSet(this.getEAllSuperTypes()).iterator();\n\tjava.lang.Boolean idLoopCond_906 = false;\n\twhile( !idLoopCond_906 ) {\n\tidLoopCond_906 = it_ft207.isOff();\n\tif ( idLoopCond_906 ) {\n\t} else {\n\n\t//Beginning of the Inlining of the lambda expression: func\necore.EClass t = it_ft207.next();\n\n\tresult.addAll(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EOperation>convertAsOrderedSet(t.getEOperations()));\n//End of the Inlining of the lambda expression: func\n\n}\n\t}\n}\n\n//End of the Inlining of the function type: each\n\n}'"
	 *        annotation="kompiledderivedProp.getter body='{\n\n\tresult = ((kermeta.standard.OrderedSet<ecore.EOperation>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.standard.OrderedSet<ecore.EOperation>\"));\n\n\tresult.addAll(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EOperation>convertAsOrderedSet(this.getEOperations()));\n\n\t//Beginning of the Inlining of the function type: each\n\n\t\n{\n\n\tkermeta.standard.Iterator<ecore.EClass> it_ft208 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EClass>convertAsOrderedSet(this.getEAllSuperTypes()).iterator();\n\tjava.lang.Boolean idLoopCond_907 = false;\n\twhile( !idLoopCond_907 ) {\n\tidLoopCond_907 = it_ft208.isOff();\n\tif ( idLoopCond_907 ) {\n\t} else {\n\n\t//Beginning of the Inlining of the lambda expression: func\necore.EClass t = it_ft208.next();\n\n\tresult.addAll(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EOperation>convertAsOrderedSet(t.getEOperations()));\n//End of the Inlining of the lambda expression: func\n\n}\n\t}\n}\n\n//End of the Inlining of the function type: each\n\n}'"
	 * @generated
	 */
	EList<EOperation> getEAllOperations();

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
	 * @model changeable="false" derived="true"
	 *        annotation="kermeta isReadOnly='false'"
	 *        annotation="kompiledderivedProp.setter body='{\n\n\tresult = ((kermeta.standard.OrderedSet<ecore.EClass>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.standard.OrderedSet<ecore.EClass>\"));\n\n\tresult.addAll(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EClass>convertAsOrderedSet(this.getESuperTypes()));\n\n\t//Beginning of the Inlining of the function type: each\n\n\t\n{\n\n\tkermeta.standard.Iterator<ecore.EClass> it_ft209 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EClass>convertAsOrderedSet(this.getESuperTypes()).iterator();\n\tjava.lang.Boolean idLoopCond_908 = false;\n\twhile( !idLoopCond_908 ) {\n\tidLoopCond_908 = it_ft209.isOff();\n\tif ( idLoopCond_908 ) {\n\t} else {\n\n\t//Beginning of the Inlining of the lambda expression: func\necore.EClass t = it_ft209.next();\n\n\tresult.addAll(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EClass>convertAsOrderedSet(t.getEAllSuperTypes()));\n//End of the Inlining of the lambda expression: func\n\n}\n\t}\n}\n\n//End of the Inlining of the function type: each\n\n}'"
	 *        annotation="kompiledderivedProp.getter body='{\n\n\tresult = ((kermeta.standard.OrderedSet<ecore.EClass>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.standard.OrderedSet<ecore.EClass>\"));\n\n\tresult.addAll(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EClass>convertAsOrderedSet(this.getESuperTypes()));\n\n\t//Beginning of the Inlining of the function type: each\n\n\t\n{\n\n\tkermeta.standard.Iterator<ecore.EClass> it_ft210 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EClass>convertAsOrderedSet(this.getESuperTypes()).iterator();\n\tjava.lang.Boolean idLoopCond_909 = false;\n\twhile( !idLoopCond_909 ) {\n\tidLoopCond_909 = it_ft210.isOff();\n\tif ( idLoopCond_909 ) {\n\t} else {\n\n\t//Beginning of the Inlining of the lambda expression: func\necore.EClass t = it_ft210.next();\n\n\tresult.addAll(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EClass>convertAsOrderedSet(t.getEAllSuperTypes()));\n//End of the Inlining of the lambda expression: func\n\n}\n\t}\n}\n\n//End of the Inlining of the function type: each\n\n}'"
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Integer result = null;\n\n\tresult = kermeta.standard.helper.IntegerWrapper.uminus(1);\n\n\t\n{\n\n\tjava.lang.Integer i = 0;\n\tjava.lang.Boolean idLoopCond_910 = false;\n\twhile( !idLoopCond_910 ) {\n\tidLoopCond_910 = kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.IntegerWrapper.equals(i, org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EStructuralFeature>convertAsOrderedSet(this.getEAllStructuralFeatures()).size()), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqual(result, kermeta.standard.helper.IntegerWrapper.uminus(1)));\n\tif ( idLoopCond_910 ) {\n\t} else {\n\n\tjava.lang.Boolean idIfCond_911 = false;\n\tidIfCond_911 = org.kermeta.compil.runtime.helper.language.ObjectUtil.equals(feature, org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EStructuralFeature>convertAsOrderedSet(this.getEAllStructuralFeatures()).elementAt(i));\n\n\tif( idIfCond_911 ) {\n\n\tkermeta.standard.helper.IntegerWrapper.equals(result, i);\n}\n\n\n\ti = kermeta.standard.helper.IntegerWrapper.plus(i, 1);\n}\n\t}\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	int getFeatureID(EStructuralFeature feature);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="ecore.EBoolean"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\t//Beginning of the Inlining of the function type: detect\n\necore.EClass result_ft211 = null;\n\n\tecore.EClass elem_ft211 = null;\n\n\tresult_ft211 = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<ecore.EClass> it_ft211 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EClass>convertAsOrderedSet(someClass.getEAllSuperTypes()).iterator();\n\tjava.lang.Boolean idLoopCond_912 = false;\n\twhile( !idLoopCond_912 ) {\n\tidLoopCond_912 = kermeta.standard.helper.BooleanWrapper.or(it_ft211.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqual(result_ft211, null));\n\tif ( idLoopCond_912 ) {\n\t} else {\n\n\telem_ft211 = it_ft211.next();\n\n\tjava.lang.Boolean idIfCond_913 = false;\n//Beginning of the Inlining of the lambda expression: detector\necore.EClass t = elem_ft211;\n\n\tidIfCond_913 = org.kermeta.compil.runtime.helper.language.ObjectUtil.equals(t, this);\n//End of the Inlining of the lambda expression: detector\n\n\n\tif( idIfCond_913 ) {\n\n\tresult_ft211 = elem_ft211;\n}\n\n}\n\t}\n}\n\n//End of the Inlining of the function type: detect\nresult = org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqual(result_ft211, null);\n\nreturn result;\n'"
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\necore.EStructuralFeature result = null;\n\n\tresult = null;\n//Beginning of the Inlining of the function type: detect\n\necore.EStructuralFeature result_ft212 = null;\n\n\tecore.EStructuralFeature elem_ft212 = null;\n\n\tresult_ft212 = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<ecore.EStructuralFeature> it_ft212 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EStructuralFeature>convertAsOrderedSet(this.getEAllStructuralFeatures()).iterator();\n\tjava.lang.Boolean idLoopCond_914 = false;\n\twhile( !idLoopCond_914 ) {\n\tidLoopCond_914 = kermeta.standard.helper.BooleanWrapper.or(it_ft212.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqual(result_ft212, null));\n\tif ( idLoopCond_914 ) {\n\t} else {\n\n\telem_ft212 = it_ft212.next();\n\n\tjava.lang.Boolean idIfCond_915 = false;\n//Beginning of the Inlining of the lambda expression: detector\necore.EStructuralFeature e = elem_ft212;\n\n\tidIfCond_915 = kermeta.standard.helper.StringWrapper.equals(e.getName(), featureName);\n//End of the Inlining of the lambda expression: detector\n\n\n\tif( idIfCond_915 ) {\n\n\tresult_ft212 = elem_ft212;\n}\n\n}\n\t}\n}\n\n//End of the Inlining of the function type: detect\n\n\nreturn result;\n'"
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
