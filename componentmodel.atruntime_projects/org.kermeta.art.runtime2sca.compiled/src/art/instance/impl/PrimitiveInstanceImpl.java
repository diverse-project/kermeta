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

		kermeta.standard.Sequence<art.type.Port> result_ft114 = null;

		art.type.Port elem_ft114 = null;

		result_ft114 = ((kermeta.standard.Sequence<art.type.Port>) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject(kermeta.standard.StandardPackage.eINSTANCE
						.getSequence()));

		{

			kermeta.standard.Iterator<art.type.Port> it_ft114 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<art.type.Port> convertAsOrderedSet(
							this.getType().getPort()).iterator();
			java.lang.Boolean idLoopCond_410 = false;
			while (!idLoopCond_410) {
				idLoopCond_410 = it_ft114.isOff();
				if (idLoopCond_410) {
				} else {

					elem_ft114 = it_ft114.next();

					java.lang.Boolean idIfCond_411 = false;
					//BIle:selector
					art.type.Port p_lbdExp114 = elem_ft114;

					idIfCond_411 = kermeta.standard.helper.StringWrapper
							.equals(p_lbdExp114.getRole(), "server");
					//EIle:selector

					if (idIfCond_411) {

						result_ft114.add(elem_ft114);
					}

				}
			}
		}

		//EIft:select
		//BIft:collect

		kermeta.standard.Sequence<art.type.Service> result_ft113 = null;

		result_ft113 = ((kermeta.standard.Sequence<art.type.Service>) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject(kermeta.standard.StandardPackage.eINSTANCE
						.getSequence()));

		{

			kermeta.standard.Iterator<art.type.Port> it_ft113 = result_ft114
					.iterator();
			java.lang.Boolean idLoopCond_409 = false;
			while (!idLoopCond_409) {
				idLoopCond_409 = it_ft113.isOff();
				if (idLoopCond_409) {
				} else {

					art.type.Service result_lambda_ft113 = null;
					//BIle:collector
					art.type.Port p_lbdExp113 = it_ft113.next();

					result_lambda_ft113 = p_lbdExp113.getService();
					//EIle:collector

					result_ft113.add(result_lambda_ft113);
				}
			}
		}

		//EIft:collect
		//BIft:each

		{

			kermeta.standard.Iterator<art.type.Service> it_ft112 = result_ft113
					.iterator();
			java.lang.Boolean idLoopCond_408 = false;
			while (!idLoopCond_408) {
				idLoopCond_408 = it_ft112.isOff();
				if (idLoopCond_408) {
				} else {

					//BIle:func
					art.type.Service s_lbdExp112 = it_ft112.next();

					result
							.addAll(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
									.<art.type.Operation> convertAsOrderedSet(s_lbdExp112
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
