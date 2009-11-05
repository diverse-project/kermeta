/**
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * 
 * Generating with Kermeta <http://www.kermeta.org>
 *
 * $Id$
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
 *   <li>{@link ecore.EClass#is_abstract <em>abstract</em>}</li>
 *   <li>{@link ecore.EClass#getEOperations <em>EOperations</em>}</li>
 *   <li>{@link ecore.EClass#is_interface <em>interface</em>}</li>
 *   <li>{@link ecore.EClass#getESuperTypes <em>ESuper Types</em>}</li>
 *   <li>{@link ecore.EClass#getEGenericSuperTypes <em>EGeneric Super Types</em>}</li>
 * </ul>
 * </p>
 *
 * @see ecore.EcorePackage#getEClass()
 * @model annotation="kermeta ecore='true'"
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
	 *        annotation="kermeta ecore='true'"
	 * @generated
	 */
	EList<EStructuralFeature> getEStructuralFeatures();

	/**
	 * Returns the value of the '<em><b>abstract</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>abstract</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>abstract</em>' attribute.
	 * @see #set_abstract(boolean)
	 * @see ecore.EcorePackage#getEClass__abstract()
	 * @model default="false"
	 *        annotation="kermeta ecore='true'"
	 * @generated
	 */
	boolean is_abstract();

	/**
	 * Sets the value of the '{@link ecore.EClass#is_abstract <em>abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>abstract</em>' attribute.
	 * @see #is_abstract()
	 * @generated
	 */
	void set_abstract(boolean value);

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
	 *        annotation="kermeta ecore='true'"
	 * @generated
	 */
	EList<EOperation> getEOperations();

	/**
	 * Returns the value of the '<em><b>interface</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>interface</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>interface</em>' attribute.
	 * @see #set_interface(boolean)
	 * @see ecore.EcorePackage#getEClass__interface()
	 * @model default="false"
	 *        annotation="kermeta ecore='true'"
	 * @generated
	 */
	boolean is_interface();

	/**
	 * Sets the value of the '{@link ecore.EClass#is_interface <em>interface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>interface</em>' attribute.
	 * @see #is_interface()
	 * @generated
	 */
	void set_interface(boolean value);

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
	 * @model annotation="kermeta ecore='true'"
	 * @generated
	 */
	EList<EClass> getESuperTypes();

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
	 *        annotation="kermeta ecore='true'"
	 * @generated
	 */
	EList<EGenericType> getEGenericSuperTypes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta isAbstract='true'"
	 *        annotation="kermeta ecore='true'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='java.lang.Integer result = null;\n\nreturn result;\n'"
	 * @generated
	 */
	int getFeatureID(EStructuralFeature feature);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta isAbstract='true'"
	 *        annotation="kermeta ecore='true'"
	 *        annotation="kermeta ecore='true'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='ecore.EStructuralFeature result = null;\n\nreturn result;\n'"
	 * @generated
	 */
	EStructuralFeature getEStructuralFeature(String featureName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta isAbstract='true'"
	 *        annotation="kermeta ecore='true'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='java.lang.Boolean result = null;\n\nreturn result;\n'"
	 * @generated
	 */
	boolean isSuperTypeOf(EClass someClass);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="kermeta isAbstract='true'"
	 *        annotation="kermeta ecore='true'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='java.lang.Integer result = null;\n\nreturn result;\n'"
	 * @generated
	 */
	int getFeatureCount();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.standard.OrderedSet<ecore.EAttribute> result = null;\n\nreturn org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.convertAsEList(result);\n'"
	 * @generated
	 */
	EList<EAttribute> getterEAllAttributes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.standard.OrderedSet<ecore.EReference> result = null;\n\nreturn org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.convertAsEList(result);\n'"
	 * @generated
	 */
	EList<EReference> getterEReferences();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.standard.OrderedSet<ecore.EReference> result = null;\n\nreturn org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.convertAsEList(result);\n'"
	 * @generated
	 */
	EList<EReference> getterEAllReferences();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.standard.OrderedSet<ecore.EReference> result = null;\n\nreturn org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.convertAsEList(result);\n'"
	 * @generated
	 */
	EList<EReference> getterEAllContainments();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.standard.OrderedSet<ecore.EGenericType> result = null;\n\nreturn org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.convertAsEList(result);\n'"
	 * @generated
	 */
	EList<EGenericType> getterEAllGenericSuperTypes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.standard.OrderedSet<ecore.EAttribute> result = null;\n\nreturn org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.convertAsEList(result);\n'"
	 * @generated
	 */
	EList<EAttribute> getterEAttributes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\necore.EAttribute result = null;\n\nreturn result;\n'"
	 * @generated
	 */
	EAttribute getterEIDAttribute();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.standard.OrderedSet<ecore.EOperation> result = null;\n\nreturn org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.convertAsEList(result);\n'"
	 * @generated
	 */
	EList<EOperation> getterEAllOperations();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.standard.OrderedSet<ecore.EStructuralFeature> result = null;\n\nreturn org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.convertAsEList(result);\n'"
	 * @generated
	 */
	EList<EStructuralFeature> getterEAllStructuralFeatures();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.standard.OrderedSet<ecore.EClass> result = null;\n\nreturn org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.convertAsEList(result);\n'"
	 * @generated
	 */
	EList<EClass> getterEAllSuperTypes();

} // EClass
