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
 *   <li>{@link art.instance.ComponentInstance#getType <em>Type</em>}</li>
 *   <li>{@link art.instance.ComponentInstance#getSuperComponent <em>Super Component</em>}</li>
 *   <li>{@link art.instance.ComponentInstance#getState <em>State</em>}</li>
 *   <li>{@link art.instance.ComponentInstance#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link art.instance.ComponentInstance#getImplem <em>Implem</em>}</li>
 * </ul>
 * </p>
 *
 * @see art.instance.InstancePackage#getComponentInstance()
 * @model abstract="true"
 *        annotation="kermeta ecore='true'"
 *        annotation="kermeta.inv completeTransmissionBindings=''"
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
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.standard.OrderedSet<art.type.Operation> result = null;\n\n\tresult = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<art.type.Operation>convertAsOrderedSet(this.getOperationEMF_renameAs());\n\nreturn org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.convertAsEList(result);\n'"
	 * @generated
	 */
	EList<Operation> getterOperation();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.standard.OrderedSet<art.instance.TransmissionBinding> result = null;\n\n\tkermeta.standard.OrderedSet<art.instance.TransmissionBinding> res = ((kermeta.standard.OrderedSet<art.instance.TransmissionBinding>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.standard.StandardPackage.eINSTANCE.getOrderedSet()));\n\n\tres.addAll(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<art.instance.TransmissionBinding>convertAsOrderedSet(this.getBinding()));\n\n\tjava.lang.Boolean idIfCond_361 = false;\n\tidIfCond_361 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(this, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"art.instance.CompositeInstance\"));\n\n\tif( idIfCond_361 ) {\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<art.instance.ComponentInstance> it_ft88 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<art.instance.ComponentInstance>convertAsOrderedSet(((art.instance.CompositeInstance) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(this, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"art.instance.CompositeInstance\"))).getSubComponent()).iterator();\n\tjava.lang.Boolean idLoopCond_362 = false;\n\twhile( !idLoopCond_362 ) {\n\tidLoopCond_362 = it_ft88.isOff();\n\tif ( idLoopCond_362 ) {\n\t} else {\n\n\t//BIle:func\nart.instance.ComponentInstance sub_lbdExp88 = it_ft88.next();\n\n\tres.addAll(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<art.instance.TransmissionBinding>convertAsOrderedSet(sub_lbdExp88.getterGetAllBindings()));\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n}\n\n\n\tresult = res;\n\nreturn org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.convertAsEList(result);\n'"
	 * @generated
	 */
	EList<TransmissionBinding> getterGetAllBindings();

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
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.standard.OrderedSet<art.instance.ComponentInstance> result = null;\n\n\tkermeta.standard.Set<art.instance.ComponentInstance> res = ((kermeta.standard.Set<art.instance.ComponentInstance>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.standard.StandardPackage.eINSTANCE.getSet()));\n\n\tart.instance.CompositeInstance composite = this.getSuperComponent();\n\n\tjava.lang.Boolean idIfCond_363 = false;\n\tidIfCond_363 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(composite, null);\n\n\tif( idIfCond_363 ) {\n\n\tjava.lang.Boolean idIfCond_364 = false;\n\tidIfCond_364 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(this, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"art.instance.CompositeInstance\"));\n\n\tif( idIfCond_364 ) {\n\n\tres.addAll(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<art.instance.ComponentInstance>convertAsOrderedSet(((art.instance.CompositeInstance) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(this, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"art.instance.CompositeInstance\"))).getSubComponent()));\n}\n\n\n\t//BIft:select\n\nkermeta.standard.Sequence<art.instance.ComponentInstance> result_ft89 = null;\n\n\tart.instance.ComponentInstance elem_ft89 = null;\n\n\tresult_ft89 = ((kermeta.standard.Sequence<art.instance.ComponentInstance>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.standard.StandardPackage.eINSTANCE.getSequence()));\n\n\t\n{\n\n\tkermeta.standard.Iterator<art.instance.ComponentInstance> it_ft89 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<art.instance.ComponentInstance>convertAsOrderedSet(composite.getSubComponent()).iterator();\n\tjava.lang.Boolean idLoopCond_365 = false;\n\twhile( !idLoopCond_365 ) {\n\tidLoopCond_365 = it_ft89.isOff();\n\tif ( idLoopCond_365 ) {\n\t} else {\n\n\telem_ft89 = it_ft89.next();\n\n\tjava.lang.Boolean idIfCond_366 = false;\n//BIle:selector\nart.instance.ComponentInstance c_lbdExp89 = elem_ft89;\n\n\t//BIft:exists\n\njava.lang.Boolean result_ft90 = null;\n\n\tjava.lang.Boolean test_ft90 = false;\n\n\t\n{\n\n\tkermeta.standard.Iterator<art.instance.TransmissionBinding> it_ft90 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<art.instance.TransmissionBinding>convertAsOrderedSet(c_lbdExp89.getBinding()).iterator();\n\tjava.lang.Boolean idLoopCond_367 = false;\n\twhile( !idLoopCond_367 ) {\n\tidLoopCond_367 = kermeta.standard.helper.BooleanWrapper.or(it_ft90.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(test_ft90, false));\n\tif ( idLoopCond_367 ) {\n\t} else {\n\njava.lang.Boolean result_lambda_ft90 = null;\n//BIle:func\nart.instance.TransmissionBinding b_lbdExp90 = it_ft90.next();\n\n\tresult_lambda_ft90 = org.kermeta.compil.runtime.helper.language.ObjectUtil.equalsSwitcher(b_lbdExp90.getServerInstance(), this);\n//EIle:func\n\n\ttest_ft90 = kermeta.standard.helper.BooleanWrapper.or(test_ft90, result_lambda_ft90);\n}\n\t}\n}\n\n\n\tresult_ft90 = test_ft90;\n//EIft:exists\nidIfCond_366 = result_ft90;\n\n//EIle:selector\n\n\n\tif( idIfCond_366 ) {\n\n\tresult_ft89.add(elem_ft89);\n}\n\n}\n\t}\n}\n\n//EIft:select\nres.addAll(result_ft89);\n\n\t//BIft:select\n\nkermeta.standard.Sequence<art.instance.ComponentInstance> result_ft93 = null;\n\n\tart.instance.ComponentInstance elem_ft93 = null;\n\n\tresult_ft93 = ((kermeta.standard.Sequence<art.instance.ComponentInstance>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.standard.StandardPackage.eINSTANCE.getSequence()));\n\n\t\n{\n\n\tkermeta.standard.Iterator<art.instance.ComponentInstance> it_ft93 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<art.instance.ComponentInstance>convertAsOrderedSet(composite.getSubComponent()).iterator();\n\tjava.lang.Boolean idLoopCond_371 = false;\n\twhile( !idLoopCond_371 ) {\n\tidLoopCond_371 = it_ft93.isOff();\n\tif ( idLoopCond_371 ) {\n\t} else {\n\n\telem_ft93 = it_ft93.next();\n\n\tjava.lang.Boolean idIfCond_372 = false;\n//BIle:selector\nart.instance.ComponentInstance c_lbdExp93 = elem_ft93;\n\n\tidIfCond_372 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(c_lbdExp93, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"art.instance.CompositeInstance\"));\n//EIle:selector\n\n\n\tif( idIfCond_372 ) {\n\n\tresult_ft93.add(elem_ft93);\n}\n\n}\n\t}\n}\n\n//EIft:select\n//BIft:select\n\nkermeta.standard.Sequence<art.instance.ComponentInstance> result_ft91 = null;\n\n\tart.instance.ComponentInstance elem_ft91 = null;\n\n\tresult_ft91 = ((kermeta.standard.Sequence<art.instance.ComponentInstance>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.standard.StandardPackage.eINSTANCE.getSequence()));\n\n\t\n{\n\n\tkermeta.standard.Iterator<art.instance.ComponentInstance> it_ft91 = result_ft93.iterator();\n\tjava.lang.Boolean idLoopCond_368 = false;\n\twhile( !idLoopCond_368 ) {\n\tidLoopCond_368 = it_ft91.isOff();\n\tif ( idLoopCond_368 ) {\n\t} else {\n\n\telem_ft91 = it_ft91.next();\n\n\tjava.lang.Boolean idIfCond_369 = false;\n//BIle:selector\nart.instance.ComponentInstance c_lbdExp91 = elem_ft91;\n\n\t//BIft:exists\n\njava.lang.Boolean result_ft92 = null;\n\n\tjava.lang.Boolean test_ft92 = false;\n\n\t\n{\n\n\tkermeta.standard.Iterator<art.instance.DelegationBinding> it_ft92 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<art.instance.DelegationBinding>convertAsOrderedSet(((art.instance.CompositeInstance) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(c_lbdExp91, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"art.instance.CompositeInstance\"))).getDelegation()).iterator();\n\tjava.lang.Boolean idLoopCond_370 = false;\n\twhile( !idLoopCond_370 ) {\n\tidLoopCond_370 = kermeta.standard.helper.BooleanWrapper.or(it_ft92.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(test_ft92, false));\n\tif ( idLoopCond_370 ) {\n\t} else {\n\njava.lang.Boolean result_lambda_ft92 = null;\n//BIle:func\nart.instance.DelegationBinding d_lbdExp92 = it_ft92.next();\n\n\tresult_lambda_ft92 = org.kermeta.compil.runtime.helper.language.ObjectUtil.equalsSwitcher(d_lbdExp92.getServerInstance(), this);\n//EIle:func\n\n\ttest_ft92 = kermeta.standard.helper.BooleanWrapper.or(test_ft92, result_lambda_ft92);\n}\n\t}\n}\n\n\n\tresult_ft92 = test_ft92;\n//EIft:exists\nidIfCond_369 = result_ft92;\n\n//EIle:selector\n\n\n\tif( idIfCond_369 ) {\n\n\tresult_ft91.add(elem_ft91);\n}\n\n}\n\t}\n}\n\n//EIft:select\n\n}\n\n\nreturn org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.convertAsEList(result);\n'"
	 * @generated
	 */
	EList<ComponentInstance> getterDependentComponents();

} // ComponentInstance
