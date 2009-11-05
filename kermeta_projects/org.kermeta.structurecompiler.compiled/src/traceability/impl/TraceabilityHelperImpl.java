/**
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * 
 * Generating with Kermeta <http://www.kermeta.org>
 *
 * $Id$
 */
package traceability.impl;

import kermeta.language.structure.impl.ObjectImpl;

import org.eclipse.emf.ecore.EClass;

import traceability.ModelReference;
import traceability.TextReference;
import traceability.TraceabilityHelper;
import traceability.TraceabilityPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Helper</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class TraceabilityHelperImpl extends ObjectImpl implements
		TraceabilityHelper {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TraceabilityHelperImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TraceabilityPackage.Literals.TRACEABILITY_HELPER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextReference getFirstTextReference(ModelReference mr) {

		traceability.TextReference result = null;

		kermeta.standard.Sequence<traceability.Reference> c = null;
		//BIft:collect

		kermeta.standard.Sequence<traceability.Reference> result_ft277 = null;

		result_ft277 = ((kermeta.standard.Sequence<traceability.Reference>) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject(kermeta.standard.StandardPackage.eINSTANCE
						.getSequence()));

		{

			kermeta.standard.Iterator<traceability.Trace> it_ft277 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<traceability.Trace> convertAsOrderedSet(
							mr.getSourceTraces()).iterator();
			java.lang.Boolean idLoopCond_1206 = false;
			while (!idLoopCond_1206) {
				idLoopCond_1206 = it_ft277.isOff();
				if (idLoopCond_1206) {
				} else {

					traceability.Reference result_lambda_ft277 = null;
					//BIle:collector
					traceability.Trace t_lbdExp277 = it_ft277.next();

					//BIft:detect

					traceability.Reference result_ft278 = null;

					traceability.Reference elem_ft278 = null;

					result_ft278 = null;

					{

						kermeta.standard.Iterator<traceability.Reference> it_ft278 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
								.<traceability.Reference> convertAsOrderedSet(
										t_lbdExp277.getSourceReferences())
								.iterator();
						java.lang.Boolean idLoopCond_1207 = false;
						while (!idLoopCond_1207) {
							idLoopCond_1207 = kermeta.standard.helper.BooleanWrapper
									.or(
											it_ft278.isOff(),
											org.kermeta.compil.runtime.helper.language.ObjectUtil
													.isNotEqualSwitcher(
															result_ft278, null));
							if (idLoopCond_1207) {
							} else {

								elem_ft278 = it_ft278.next();

								java.lang.Boolean idIfCond_1208 = false;
								//BIle:detector
								traceability.Reference sr_lbdExp278 = elem_ft278;

								idIfCond_1208 = org.kermeta.compil.runtime.helper.language.ObjectUtil
										.isInstanceOfSwitcher(
												sr_lbdExp278,
												org.kermeta.compil.runtime.ExecutionContext
														.getInstance()
														.getMetaClass(
																"traceability.TextReference"));
								//EIle:detector

								if (idIfCond_1208) {

									result_ft278 = elem_ft278;
								}

							}
						}
					}

					//EIft:detect
					result_lambda_ft277 = result_ft278;

					//EIle:collector

					result_ft277.add(result_lambda_ft277);
				}
			}
		}

		//CE
		c = result_ft277;
		//EIft:collect
		;

		{
			try {
				traceability.TextReference tr = ((traceability.TextReference) org.kermeta.compil.runtime.helper.language.ObjectUtil
						.asTypeSwitcher(c.first(),
								org.kermeta.compil.runtime.ExecutionContext
										.getInstance().getMetaClass(
												"traceability.TextReference")));

				result = tr;
			} catch (org.kermeta.compil.runtime.helper.error.KRuntimeError ex_switcher_7) {
				boolean caught_7 = false;
				if (ex_switcher_7.getRealException() instanceof kermeta.exceptions.EmptyCollection) {
					caught_7 = true;
					kermeta.exceptions.EmptyCollection e = (kermeta.exceptions.EmptyCollection) ex_switcher_7
							.getRealException();
					result = null;
				}
				if (!caught_7) {
					throw ex_switcher_7;
				}

			}
		}

		return result;

	}

} //TraceabilityHelperImpl
