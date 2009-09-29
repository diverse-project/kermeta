/**
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * 
 * Generating with Kermeta <http://www.kermeta.org>
 *
 * $Id$
 */
package art.instance;

import art.AddElement;
import art.ModelElement;
import art.RemoveElement;
import art.UpdateElement;

import art.implem.ComponentImplementation;

import art.type.ComponentType;
import art.type.Operation;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link art.instance.ComponentInstance#getBinding <em>Binding</em>}</li>
 *   <li>{@link art.instance.ComponentInstance#getSuperComponent <em>Super Component</em>}</li>
 *   <li>{@link art.instance.ComponentInstance#getType <em>Type</em>}</li>
 *   <li>{@link art.instance.ComponentInstance#getState <em>State</em>}</li>
 *   <li>{@link art.instance.ComponentInstance#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link art.instance.ComponentInstance#getImplem <em>Implem</em>}</li>
 * </ul>
 * </p>
 *
 * @see art.instance.InstancePackage#getComponentInstance()
 * @model abstract="true"
 *        annotation="kermeta ecore='true'"
 *        annotation="kermeta.inv mandatoryClientPortBound=''"
 * @generated
 */
public interface ComponentInstance extends ModelElement, AddElement,
		RemoveElement, UpdateElement {
	/**
	 * Returns the value of the '<em><b>Binding</b></em>' containment reference list.
	 * The list contents are of type {@link art.instance.TransmissionBinding}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Binding</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binding</em>' containment reference list.
	 * @see art.instance.InstancePackage#getComponentInstance_Binding()
	 * @model containment="true" resolveProxies="true"
	 *        annotation="kermeta ecore='true'"
	 * @generated
	 */
	EList<TransmissionBinding> getBinding();

	/**
	 * Returns the value of the '<em><b>Super Component</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link art.instance.CompositeInstance#getSubComponent <em>Sub Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Super Component</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super Component</em>' container reference.
	 * @see #setSuperComponent(CompositeInstance)
	 * @see art.instance.InstancePackage#getComponentInstance_SuperComponent()
	 * @see art.instance.CompositeInstance#getSubComponent
	 * @model opposite="subComponent" transient="false"
	 *        annotation="kermeta ecore='true'"
	 * @generated
	 */
	CompositeInstance getSuperComponent();

	/**
	 * Sets the value of the '{@link art.instance.ComponentInstance#getSuperComponent <em>Super Component</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Super Component</em>' container reference.
	 * @see #getSuperComponent()
	 * @generated
	 */
	void setSuperComponent(CompositeInstance value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(ComponentType)
	 * @see art.instance.InstancePackage#getComponentInstance_Type()
	 * @model required="true"
	 *        annotation="kermeta ecore='true'"
	 * @generated
	 */
	ComponentType getType();

	/**
	 * Sets the value of the '{@link art.instance.ComponentInstance#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(ComponentType value);

	/**
	 * Returns the value of the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' attribute.
	 * @see #setState(String)
	 * @see art.instance.InstancePackage#getComponentInstance_State()
	 * @model dataType="art.String" required="true"
	 *        annotation="kermeta ecore='true'"
	 * @generated
	 */
	String getState();

	/**
	 * Sets the value of the '{@link art.instance.ComponentInstance#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' attribute.
	 * @see #getState()
	 * @generated
	 */
	void setState(String value);

	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' containment reference list.
	 * The list contents are of type {@link art.instance.ValuedAttribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute</em>' containment reference list.
	 * @see art.instance.InstancePackage#getComponentInstance_Attribute()
	 * @model containment="true" resolveProxies="true"
	 *        annotation="kermeta ecore='true'"
	 * @generated
	 */
	EList<ValuedAttribute> getAttribute();

	/**
	 * Returns the value of the '<em><b>Implem</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implem</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implem</em>' containment reference.
	 * @see #setImplem(ComponentImplementation)
	 * @see art.instance.InstancePackage#getComponentInstance_Implem()
	 * @model containment="true" resolveProxies="true"
	 *        annotation="kermeta ecore='true'"
	 * @generated
	 */
	ComponentImplementation getImplem();

	/**
	 * Sets the value of the '{@link art.instance.ComponentInstance#getImplem <em>Implem</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implem</em>' containment reference.
	 * @see #getImplem()
	 * @generated
	 */
	void setImplem(ComponentImplementation value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="kermeta isAbstract='true'"
	 *        annotation="kermeta EMF_renameAs='getOperationEMF_renameAs'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='kermeta.standard.OrderedSet<art.type.Operation> result = null;\n\nreturn org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.convertAsEList(result);\n'"
	 * @generated
	 */
	EList<Operation> getOperationEMF_renameAs();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.standard.OrderedSet<art.instance.TransmissionBinding> result = null;\n\n\tkermeta.standard.OrderedSet<art.instance.TransmissionBinding> res = ((kermeta.standard.OrderedSet<art.instance.TransmissionBinding>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.standard.StandardPackage.eINSTANCE.getOrderedSet()));\n\n\tres.addAll(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<art.instance.TransmissionBinding>convertAsOrderedSet(this.getBinding()));\n\n\tjava.lang.Boolean idIfCond_392 = false;\n\tidIfCond_392 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(this, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"art.instance.CompositeInstance\"));\n\n\tif( idIfCond_392 ) {\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<art.instance.ComponentInstance> it_ft103 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<art.instance.ComponentInstance>convertAsOrderedSet(((art.instance.CompositeInstance) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(this, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"art.instance.CompositeInstance\"))).getSubComponent()).iterator();\n\tjava.lang.Boolean idLoopCond_393 = false;\n\twhile( !idLoopCond_393 ) {\n\tidLoopCond_393 = it_ft103.isOff();\n\tif ( idLoopCond_393 ) {\n\t} else {\n\n\t//BIle:func\nart.instance.ComponentInstance sub_lbdExp103 = it_ft103.next();\n\n\tres.addAll(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<art.instance.TransmissionBinding>convertAsOrderedSet(sub_lbdExp103.getterGetAllBindings()));\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n}\n\n\n\tresult = res;\n\nreturn org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.convertAsEList(result);\n'"
	 * @generated
	 */
	EList<TransmissionBinding> getterGetAllBindings();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.standard.OrderedSet<art.type.Operation> result = null;\n\n\tresult = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<art.type.Operation>convertAsOrderedSet(this.getOperationEMF_renameAs());\n\nreturn org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.convertAsEList(result);\n'"
	 * @generated
	 */
	EList<Operation> getterOperation();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="art.String" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.standard.Sequence<java.lang.String> result = null;\n\n\tresult = null;\n\nreturn org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.convertAsEList(result);\n'"
	 * @generated
	 */
	EList<String> getterOperationAsString();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.standard.OrderedSet<art.instance.ComponentInstance> result = null;\n\n\tkermeta.standard.Set<art.instance.ComponentInstance> res = ((kermeta.standard.Set<art.instance.ComponentInstance>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.standard.StandardPackage.eINSTANCE.getSet()));\n\n\tart.instance.CompositeInstance composite = this.getSuperComponent();\n\n\tjava.lang.Boolean idIfCond_394 = false;\n\tidIfCond_394 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(composite, null);\n\n\tif( idIfCond_394 ) {\n\n\tjava.lang.Boolean idIfCond_395 = false;\n\tidIfCond_395 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(this, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"art.instance.CompositeInstance\"));\n\n\tif( idIfCond_395 ) {\n\n\tres.addAll(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<art.instance.ComponentInstance>convertAsOrderedSet(((art.instance.CompositeInstance) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(this, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"art.instance.CompositeInstance\"))).getSubComponent()));\n}\n\n\n\t//BIft:select\n\nkermeta.standard.Sequence<art.instance.ComponentInstance> result_ft104 = null;\n\n\tart.instance.ComponentInstance elem_ft104 = null;\n\n\tresult_ft104 = ((kermeta.standard.Sequence<art.instance.ComponentInstance>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.standard.StandardPackage.eINSTANCE.getSequence()));\n\n\t\n{\n\n\tkermeta.standard.Iterator<art.instance.ComponentInstance> it_ft104 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<art.instance.ComponentInstance>convertAsOrderedSet(composite.getSubComponent()).iterator();\n\tjava.lang.Boolean idLoopCond_396 = false;\n\twhile( !idLoopCond_396 ) {\n\tidLoopCond_396 = it_ft104.isOff();\n\tif ( idLoopCond_396 ) {\n\t} else {\n\n\telem_ft104 = it_ft104.next();\n\n\tjava.lang.Boolean idIfCond_397 = false;\n//BIle:selector\nart.instance.ComponentInstance c_lbdExp104 = elem_ft104;\n\n\t//BIft:exists\n\njava.lang.Boolean result_ft105 = null;\n\n\tjava.lang.Boolean test_ft105 = false;\n\n\t\n{\n\n\tkermeta.standard.Iterator<art.instance.TransmissionBinding> it_ft105 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<art.instance.TransmissionBinding>convertAsOrderedSet(c_lbdExp104.getBinding()).iterator();\n\tjava.lang.Boolean idLoopCond_398 = false;\n\twhile( !idLoopCond_398 ) {\n\tidLoopCond_398 = kermeta.standard.helper.BooleanWrapper.or(it_ft105.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(test_ft105, false));\n\tif ( idLoopCond_398 ) {\n\t} else {\n\njava.lang.Boolean result_lambda_ft105 = null;\n//BIle:func\nart.instance.TransmissionBinding b_lbdExp105 = it_ft105.next();\n\n\tresult_lambda_ft105 = org.kermeta.compil.runtime.helper.language.ObjectUtil.equalsSwitcher(b_lbdExp105.getServerInstance(), this);\n//EIle:func\n\n\ttest_ft105 = kermeta.standard.helper.BooleanWrapper.or(test_ft105, result_lambda_ft105);\n}\n\t}\n}\n\n\n\tresult_ft105 = test_ft105;\n//EIft:exists\nidIfCond_397 = result_ft105;\n\n//EIle:selector\n\n\n\tif( idIfCond_397 ) {\n\n\tresult_ft104.add(elem_ft104);\n}\n\n}\n\t}\n}\n\n//EIft:select\nres.addAll(result_ft104);\n\n\t//BIft:select\n\nkermeta.standard.Sequence<art.instance.ComponentInstance> result_ft108 = null;\n\n\tart.instance.ComponentInstance elem_ft108 = null;\n\n\tresult_ft108 = ((kermeta.standard.Sequence<art.instance.ComponentInstance>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.standard.StandardPackage.eINSTANCE.getSequence()));\n\n\t\n{\n\n\tkermeta.standard.Iterator<art.instance.ComponentInstance> it_ft108 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<art.instance.ComponentInstance>convertAsOrderedSet(composite.getSubComponent()).iterator();\n\tjava.lang.Boolean idLoopCond_402 = false;\n\twhile( !idLoopCond_402 ) {\n\tidLoopCond_402 = it_ft108.isOff();\n\tif ( idLoopCond_402 ) {\n\t} else {\n\n\telem_ft108 = it_ft108.next();\n\n\tjava.lang.Boolean idIfCond_403 = false;\n//BIle:selector\nart.instance.ComponentInstance c_lbdExp108 = elem_ft108;\n\n\tidIfCond_403 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(c_lbdExp108, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"art.instance.CompositeInstance\"));\n//EIle:selector\n\n\n\tif( idIfCond_403 ) {\n\n\tresult_ft108.add(elem_ft108);\n}\n\n}\n\t}\n}\n\n//EIft:select\n//BIft:select\n\nkermeta.standard.Sequence<art.instance.ComponentInstance> result_ft106 = null;\n\n\tart.instance.ComponentInstance elem_ft106 = null;\n\n\tresult_ft106 = ((kermeta.standard.Sequence<art.instance.ComponentInstance>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.standard.StandardPackage.eINSTANCE.getSequence()));\n\n\t\n{\n\n\tkermeta.standard.Iterator<art.instance.ComponentInstance> it_ft106 = result_ft108.iterator();\n\tjava.lang.Boolean idLoopCond_399 = false;\n\twhile( !idLoopCond_399 ) {\n\tidLoopCond_399 = it_ft106.isOff();\n\tif ( idLoopCond_399 ) {\n\t} else {\n\n\telem_ft106 = it_ft106.next();\n\n\tjava.lang.Boolean idIfCond_400 = false;\n//BIle:selector\nart.instance.ComponentInstance c_lbdExp106 = elem_ft106;\n\n\t//BIft:exists\n\njava.lang.Boolean result_ft107 = null;\n\n\tjava.lang.Boolean test_ft107 = false;\n\n\t\n{\n\n\tkermeta.standard.Iterator<art.instance.DelegationBinding> it_ft107 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<art.instance.DelegationBinding>convertAsOrderedSet(((art.instance.CompositeInstance) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(c_lbdExp106, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"art.instance.CompositeInstance\"))).getDelegation()).iterator();\n\tjava.lang.Boolean idLoopCond_401 = false;\n\twhile( !idLoopCond_401 ) {\n\tidLoopCond_401 = kermeta.standard.helper.BooleanWrapper.or(it_ft107.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(test_ft107, false));\n\tif ( idLoopCond_401 ) {\n\t} else {\n\njava.lang.Boolean result_lambda_ft107 = null;\n//BIle:func\nart.instance.DelegationBinding d_lbdExp107 = it_ft107.next();\n\n\tresult_lambda_ft107 = org.kermeta.compil.runtime.helper.language.ObjectUtil.equalsSwitcher(d_lbdExp107.getServerInstance(), this);\n//EIle:func\n\n\ttest_ft107 = kermeta.standard.helper.BooleanWrapper.or(test_ft107, result_lambda_ft107);\n}\n\t}\n}\n\n\n\tresult_ft107 = test_ft107;\n//EIft:exists\nidIfCond_400 = result_ft107;\n\n//EIle:selector\n\n\n\tif( idIfCond_400 ) {\n\n\tresult_ft106.add(elem_ft106);\n}\n\n}\n\t}\n}\n\n//EIft:select\n\n}\n\n\nreturn org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.convertAsEList(result);\n'"
	 * @generated
	 */
	EList<ComponentInstance> getterDependentComponents();

} // ComponentInstance
