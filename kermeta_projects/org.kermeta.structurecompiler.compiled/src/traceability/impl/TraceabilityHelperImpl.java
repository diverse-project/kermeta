/**
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * 
 * Generated with Kermeta <http://www.kermeta.org>
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

		kermeta.standard.Sequence<traceability.Reference> result_ft272 = null;

		result_ft272 = ((kermeta.standard.Sequence<traceability.Reference>) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject(kermeta.standard.StandardPackage.eINSTANCE
						.getSequence()));

		{

			kermeta.standard.Iterator<traceability.Trace> it_ft272 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<traceability.Trace> convertAsOrderedSet(
							mr.getSourceTraces()).iterator();
			java.lang.Boolean idLoopCond_1190 = false;
			while (!idLoopCond_1190) {
				idLoopCond_1190 = it_ft272.isOff();
				if (idLoopCond_1190) {
				} else {

					traceability.Reference result_lambda_ft272 = null;
					//BIle:collector
					traceability.Trace t_lbdExp272 = it_ft272.next();

					//BIft:detect

					traceability.Reference result_ft273 = null;

					traceability.Reference elem_ft273 = null;

					result_ft273 = null;

					{

						kermeta.standard.Iterator<traceability.Reference> it_ft273 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
								.<traceability.Reference> convertAsOrderedSet(
										t_lbdExp272.getSourceReferences())
								.iterator();
						java.lang.Boolean idLoopCond_1191 = false;
						while (!idLoopCond_1191) {
							idLoopCond_1191 = kermeta.standard.helper.BooleanWrapper
									.or(
											it_ft273.isOff(),
											org.kermeta.compil.runtime.helper.language.ObjectUtil
													.isNotEqualSwitcher(
															result_ft273, null));
							if (idLoopCond_1191) {
							} else {

								elem_ft273 = it_ft273.next();

								java.lang.Boolean idIfCond_1192 = false;
								//BIle:detector
								traceability.Reference sr_lbdExp273 = elem_ft273;

								idIfCond_1192 = org.kermeta.compil.runtime.helper.language.ObjectUtil
										.isInstanceOfSwitcher(
												sr_lbdExp273,
												org.kermeta.compil.runtime.ExecutionContext
														.getInstance()
														.getMetaClass(
																"traceability.TextReference"));
								//EIle:detector

								if (idIfCond_1192) {

									result_ft273 = elem_ft273;
								}

							}
						}
					}

					//EIft:detect
					result_lambda_ft272 = result_ft273;

					//EIle:collector

					result_ft272.add(result_lambda_ft272);
				}
			}
		}

		//CE
		c = result_ft272;
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
