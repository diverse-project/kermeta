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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.standard.OrderedSet<art.type.Operation> result = null;\n\n\tresult = ((kermeta.standard.OrderedSet<art.type.Operation>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.standard.StandardPackage.eINSTANCE.getOrderedSet()));\n\n\t//BIft:select\n\nkermeta.standard.Sequence<art.type.Port> result_ft99 = null;\n\n\tart.type.Port elem_ft99 = null;\n\n\tresult_ft99 = ((kermeta.standard.Sequence<art.type.Port>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.standard.StandardPackage.eINSTANCE.getSequence()));\n\n\t\n{\n\n\tkermeta.standard.Iterator<art.type.Port> it_ft99 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<art.type.Port>convertAsOrderedSet(this.getType().getPort()).iterator();\n\tjava.lang.Boolean idLoopCond_379 = false;\n\twhile( !idLoopCond_379 ) {\n\tidLoopCond_379 = it_ft99.isOff();\n\tif ( idLoopCond_379 ) {\n\t} else {\n\n\telem_ft99 = it_ft99.next();\n\n\tjava.lang.Boolean idIfCond_380 = false;\n//BIle:selector\nart.type.Port p_lbdExp99 = elem_ft99;\n\n\tidIfCond_380 = kermeta.standard.helper.StringWrapper.equals(p_lbdExp99.getRole(), \"server\");\n//EIle:selector\n\n\n\tif( idIfCond_380 ) {\n\n\tresult_ft99.add(elem_ft99);\n}\n\n}\n\t}\n}\n\n//EIft:select\n//BIft:collect\n\nkermeta.standard.Sequence<art.type.Service> result_ft98 = null;\n\n\tresult_ft98 = ((kermeta.standard.Sequence<art.type.Service>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.standard.StandardPackage.eINSTANCE.getSequence()));\n\n\t\n{\n\n\tkermeta.standard.Iterator<art.type.Port> it_ft98 = result_ft99.iterator();\n\tjava.lang.Boolean idLoopCond_378 = false;\n\twhile( !idLoopCond_378 ) {\n\tidLoopCond_378 = it_ft98.isOff();\n\tif ( idLoopCond_378 ) {\n\t} else {\n\nart.type.Service result_lambda_ft98 = null;\n//BIle:collector\nart.type.Port p_lbdExp98 = it_ft98.next();\n\n\tresult_lambda_ft98 = p_lbdExp98.getService();\n//EIle:collector\n\n\tresult_ft98.add(result_lambda_ft98);\n}\n\t}\n}\n\n//EIft:collect\n//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<art.type.Service> it_ft97 = result_ft98.iterator();\n\tjava.lang.Boolean idLoopCond_377 = false;\n\twhile( !idLoopCond_377 ) {\n\tidLoopCond_377 = it_ft97.isOff();\n\tif ( idLoopCond_377 ) {\n\t} else {\n\n\t//BIle:func\nart.type.Service s_lbdExp97 = it_ft97.next();\n\n\tresult.addAll(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<art.type.Operation>convertAsOrderedSet(s_lbdExp97.getOperation()));\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\nreturn org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.convertAsEList(result);\n'"
	 * @generated
	 */
	EList<Operation> getOperationEMF_renameAs();

} // PrimitiveInstance
