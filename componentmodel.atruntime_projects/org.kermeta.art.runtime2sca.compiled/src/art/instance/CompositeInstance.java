/**
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * 
 * Generating with Kermeta <http://www.kermeta.org>
 *
 * $Id$
 */
package art.instance;

import art.type.Operation;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link art.instance.CompositeInstance#getSubComponent <em>Sub Component</em>}</li>
 *   <li>{@link art.instance.CompositeInstance#getDelegation <em>Delegation</em>}</li>
 * </ul>
 * </p>
 *
 * @see art.instance.InstancePackage#getCompositeInstance()
 * @model annotation="kermeta ecore='true'"
 *        annotation="kermeta.inv completeDelegationBindings=''"
 * @generated
 */
public interface CompositeInstance extends ComponentInstance {
	/**
	 * Returns the value of the '<em><b>Sub Component</b></em>' containment reference list.
	 * The list contents are of type {@link art.instance.ComponentInstance}.
	 * It is bidirectional and its opposite is '{@link art.instance.ComponentInstance#getSuperComponent <em>Super Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Component</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Component</em>' containment reference list.
	 * @see art.instance.InstancePackage#getCompositeInstance_SubComponent()
	 * @see art.instance.ComponentInstance#getSuperComponent
	 * @model opposite="superComponent" containment="true" resolveProxies="true"
	 *        annotation="kermeta ecore='true'"
	 * @generated
	 */
	EList<ComponentInstance> getSubComponent();

	/**
	 * Returns the value of the '<em><b>Delegation</b></em>' containment reference list.
	 * The list contents are of type {@link art.instance.DelegationBinding}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delegation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delegation</em>' containment reference list.
	 * @see art.instance.InstancePackage#getCompositeInstance_Delegation()
	 * @model containment="true" resolveProxies="true"
	 *        annotation="kermeta ecore='true'"
	 * @generated
	 */
	EList<DelegationBinding> getDelegation();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="kermeta EMF_renameAs='getOperationEMF_renameAs'"
	 *        annotation="kermeta superOperation='art::instance::ComponentInstance'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.standard.OrderedSet<art.type.Operation> result = null;\n\n\tresult = ((kermeta.standard.OrderedSet<art.type.Operation>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.standard.StandardPackage.eINSTANCE.getOrderedSet()));\n\n\t//BIft:collect\n\nkermeta.standard.Sequence<art.instance.ComponentInstance> result_ft116 = null;\n\n\tresult_ft116 = ((kermeta.standard.Sequence<art.instance.ComponentInstance>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.standard.StandardPackage.eINSTANCE.getSequence()));\n\n\t\n{\n\n\tkermeta.standard.Iterator<art.instance.DelegationBinding> it_ft116 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<art.instance.DelegationBinding>convertAsOrderedSet(this.getDelegation()).iterator();\n\tjava.lang.Boolean idLoopCond_413 = false;\n\twhile( !idLoopCond_413 ) {\n\tidLoopCond_413 = it_ft116.isOff();\n\tif ( idLoopCond_413 ) {\n\t} else {\n\nart.instance.ComponentInstance result_lambda_ft116 = null;\n//BIle:collector\nart.instance.DelegationBinding d_lbdExp116 = it_ft116.next();\n\n\tresult_lambda_ft116 = d_lbdExp116.getServerInstance();\n//EIle:collector\n\n\tresult_ft116.add(result_lambda_ft116);\n}\n\t}\n}\n\n//EIft:collect\n//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<art.instance.ComponentInstance> it_ft115 = result_ft116.iterator();\n\tjava.lang.Boolean idLoopCond_412 = false;\n\twhile( !idLoopCond_412 ) {\n\tidLoopCond_412 = it_ft115.isOff();\n\tif ( idLoopCond_412 ) {\n\t} else {\n\n\t//BIle:func\nart.instance.ComponentInstance c_lbdExp115 = it_ft115.next();\n\n\tresult.addAll(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<art.type.Operation>convertAsOrderedSet(c_lbdExp115.getterOperation()));\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\nreturn org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.convertAsEList(result);\n'"
	 * @generated
	 */
	EList<Operation> getOperationEMF_renameAs();

} // CompositeInstance
