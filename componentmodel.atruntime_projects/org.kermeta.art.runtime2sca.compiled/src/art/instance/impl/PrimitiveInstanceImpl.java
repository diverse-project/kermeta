/**
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * 
 * Generating with Kermeta <http://www.kermeta.org>
 *
 * $Id$
 */
package art.instance.impl;

import art.instance.InstancePackage;
import art.instance.PrimitiveInstance;

import art.type.Operation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Primitive Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class PrimitiveInstanceImpl extends ComponentInstanceImpl implements
		PrimitiveInstance {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrimitiveInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InstancePackage.Literals.PRIMITIVE_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Operation> getOperationEMF_renameAs() {

		kermeta.standard.OrderedSet<art.type.Operation> result = null;

		result = ((kermeta.standard.OrderedSet<art.type.Operation>) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject(kermeta.standard.StandardPackage.eINSTANCE
						.getOrderedSet()));

		//BIft:select

		kermeta.standard.Sequence<art.type.Port> result_ft99 = null;

		art.type.Port elem_ft99 = null;

		result_ft99 = ((kermeta.standard.Sequence<art.type.Port>) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject(kermeta.standard.StandardPackage.eINSTANCE
						.getSequence()));

		{

			kermeta.standard.Iterator<art.type.Port> it_ft99 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<art.type.Port> convertAsOrderedSet(
							this.getType().getPort()).iterator();
			java.lang.Boolean idLoopCond_379 = false;
			while (!idLoopCond_379) {
				idLoopCond_379 = it_ft99.isOff();
				if (idLoopCond_379) {
				} else {

					elem_ft99 = it_ft99.next();

					java.lang.Boolean idIfCond_380 = false;
					//BIle:selector
					art.type.Port p_lbdExp99 = elem_ft99;

					idIfCond_380 = kermeta.standard.helper.StringWrapper
							.equals(p_lbdExp99.getRole(), "server");
					//EIle:selector

					if (idIfCond_380) {

						result_ft99.add(elem_ft99);
					}

				}
			}
		}

		//EIft:select
		//BIft:collect

		kermeta.standard.Sequence<art.type.Service> result_ft98 = null;

		result_ft98 = ((kermeta.standard.Sequence<art.type.Service>) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject(kermeta.standard.StandardPackage.eINSTANCE
						.getSequence()));

		{

			kermeta.standard.Iterator<art.type.Port> it_ft98 = result_ft99
					.iterator();
			java.lang.Boolean idLoopCond_378 = false;
			while (!idLoopCond_378) {
				idLoopCond_378 = it_ft98.isOff();
				if (idLoopCond_378) {
				} else {

					art.type.Service result_lambda_ft98 = null;
					//BIle:collector
					art.type.Port p_lbdExp98 = it_ft98.next();

					result_lambda_ft98 = p_lbdExp98.getService();
					//EIle:collector

					result_ft98.add(result_lambda_ft98);
				}
			}
		}

		//EIft:collect
		//BIft:each

		{

			kermeta.standard.Iterator<art.type.Service> it_ft97 = result_ft98
					.iterator();
			java.lang.Boolean idLoopCond_377 = false;
			while (!idLoopCond_377) {
				idLoopCond_377 = it_ft97.isOff();
				if (idLoopCond_377) {
				} else {

					//BIle:func
					art.type.Service s_lbdExp97 = it_ft97.next();

					result
							.addAll(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
									.<art.type.Operation> convertAsOrderedSet(s_lbdExp97
											.getOperation()));
					//EIle:func

				}
			}
		}

		//EIft:each

		return org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
				.convertAsEList(result);

	}

} //PrimitiveInstanceImpl
