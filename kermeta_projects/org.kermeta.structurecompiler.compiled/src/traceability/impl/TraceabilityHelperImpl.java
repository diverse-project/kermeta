/**
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * 
 * Generating with Kermeta <http://www.kermeta.org>
 *
 * $Id: TraceabilityHelperImpl.java,v 1.12 2009-02-23 15:26:52 cfaucher Exp $
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

		kermeta.standard.Sequence<traceability.Reference> result_ft259 = null;

		result_ft259 = ((kermeta.standard.Sequence<traceability.Reference>) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject(kermeta.standard.StandardPackage.eINSTANCE
						.getSequence()));

		{

			kermeta.standard.Iterator<traceability.Trace> it_ft259 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<traceability.Trace> convertAsOrderedSet(
							mr.getSourceTraces()).iterator();
			java.lang.Boolean idLoopCond_1145 = false;
			while (!idLoopCond_1145) {
				idLoopCond_1145 = it_ft259.isOff();
				if (idLoopCond_1145) {
				} else {

					traceability.Reference result_lambda_ft259 = null;
					//BIle:collector
					traceability.Trace t_lbdExp259 = it_ft259.next();

					//BIft:detect

					traceability.Reference result_ft260 = null;

					traceability.Reference elem_ft260 = null;

					result_ft260 = null;

					{

						kermeta.standard.Iterator<traceability.Reference> it_ft260 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
								.<traceability.Reference> convertAsOrderedSet(
										t_lbdExp259.getSourceReferences())
								.iterator();
						java.lang.Boolean idLoopCond_1146 = false;
						while (!idLoopCond_1146) {
							idLoopCond_1146 = kermeta.standard.helper.BooleanWrapper
									.or(
											it_ft260.isOff(),
											org.kermeta.compil.runtime.helper.language.ObjectUtil
													.isNotEqualSwitcher(
															result_ft260, null));
							if (idLoopCond_1146) {
							} else {

								elem_ft260 = it_ft260.next();

								java.lang.Boolean idIfCond_1147 = false;
								//BIle:detector
								traceability.Reference sr_lbdExp260 = elem_ft260;

								idIfCond_1147 = org.kermeta.compil.runtime.helper.language.ObjectUtil
										.isInstanceOfSwitcher(
												sr_lbdExp260,
												org.kermeta.compil.runtime.ExecutionContext
														.getInstance()
														.getMetaClass(
																"traceability.TextReference"));
								//EIle:detector

								if (idIfCond_1147) {

									result_ft260 = elem_ft260;
								}

							}
						}
					}

					//EIft:detect
					result_lambda_ft259 = result_ft260;

					//EIle:collector

					result_ft259.add(result_lambda_ft259);
				}
			}
		}

		//CE
		c = result_ft259;
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
			} catch (org.kermeta.compil.runtime.helper.error.KRuntimeError ex_switcher_5) {
				boolean caught_5 = false;
				if (ex_switcher_5.getRealException() instanceof kermeta.exceptions.EmptyCollection) {
					caught_5 = true;
					kermeta.exceptions.EmptyCollection e = (kermeta.exceptions.EmptyCollection) ex_switcher_5
							.getRealException();
					result = null;
				}
				if (!caught_5) {
					throw ex_switcher_5;
				}

			}
		}

		return result;

	}

} //TraceabilityHelperImpl
