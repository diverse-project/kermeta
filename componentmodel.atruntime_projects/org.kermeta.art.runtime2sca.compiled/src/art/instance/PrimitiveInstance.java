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
 * A representation of the model object '<em><b>Primitive Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see art.instance.InstancePackage#getPrimitiveInstance()
 * @model annotation="kermeta ecore='true'"
 * @generated
 */
public interface PrimitiveInstance extends ComponentInstance {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="kermeta EMF_renameAs='getOperationEMF_renameAs'"
	 *        annotation="kermeta superOperation='art::instance::ComponentInstance'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.standard.OrderedSet<art.type.Operation> result = null;\n\n\tresult = ((kermeta.standard.OrderedSet<art.type.Operation>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.standard.StandardPackage.eINSTANCE.getOrderedSet()));\n\n\t//BIft:select\n\nkermeta.standard.Sequence<art.type.Port> result_ft114 = null;\n\n\tart.type.Port elem_ft114 = null;\n\n\tresult_ft114 = ((kermeta.standard.Sequence<art.type.Port>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.standard.StandardPackage.eINSTANCE.getSequence()));\n\n\t\n{\n\n\tkermeta.standard.Iterator<art.type.Port> it_ft114 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<art.type.Port>convertAsOrderedSet(this.getType().getPort()).iterator();\n\tjava.lang.Boolean idLoopCond_410 = false;\n\twhile( !idLoopCond_410 ) {\n\tidLoopCond_410 = it_ft114.isOff();\n\tif ( idLoopCond_410 ) {\n\t} else {\n\n\telem_ft114 = it_ft114.next();\n\n\tjava.lang.Boolean idIfCond_411 = false;\n//BIle:selector\nart.type.Port p_lbdExp114 = elem_ft114;\n\n\tidIfCond_411 = kermeta.standard.helper.StringWrapper.equals(p_lbdExp114.getRole(), \"server\");\n//EIle:selector\n\n\n\tif( idIfCond_411 ) {\n\n\tresult_ft114.add(elem_ft114);\n}\n\n}\n\t}\n}\n\n//EIft:select\n//BIft:collect\n\nkermeta.standard.Sequence<art.type.Service> result_ft113 = null;\n\n\tresult_ft113 = ((kermeta.standard.Sequence<art.type.Service>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.standard.StandardPackage.eINSTANCE.getSequence()));\n\n\t\n{\n\n\tkermeta.standard.Iterator<art.type.Port> it_ft113 = result_ft114.iterator();\n\tjava.lang.Boolean idLoopCond_409 = false;\n\twhile( !idLoopCond_409 ) {\n\tidLoopCond_409 = it_ft113.isOff();\n\tif ( idLoopCond_409 ) {\n\t} else {\n\nart.type.Service result_lambda_ft113 = null;\n//BIle:collector\nart.type.Port p_lbdExp113 = it_ft113.next();\n\n\tresult_lambda_ft113 = p_lbdExp113.getService();\n//EIle:collector\n\n\tresult_ft113.add(result_lambda_ft113);\n}\n\t}\n}\n\n//EIft:collect\n//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<art.type.Service> it_ft112 = result_ft113.iterator();\n\tjava.lang.Boolean idLoopCond_408 = false;\n\twhile( !idLoopCond_408 ) {\n\tidLoopCond_408 = it_ft112.isOff();\n\tif ( idLoopCond_408 ) {\n\t} else {\n\n\t//BIle:func\nart.type.Service s_lbdExp112 = it_ft112.next();\n\n\tresult.addAll(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<art.type.Operation>convertAsOrderedSet(s_lbdExp112.getOperation()));\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\nreturn org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.convertAsEList(result);\n'"
	 * @generated
	 */
	EList<Operation> getOperationEMF_renameAs();

} // PrimitiveInstance
