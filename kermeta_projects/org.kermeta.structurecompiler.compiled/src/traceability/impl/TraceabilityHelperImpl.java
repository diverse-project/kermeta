/**
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * 
 * Generating with Kermeta <http://www.kermeta.org>
 *
 * $Id: TraceabilityHelperImpl.java,v 1.11 2009-02-10 17:51:56 cfaucher Exp $
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

		kermeta.standard.Sequence<traceability.Reference> result_ft256 = null;

		result_ft256 = ((kermeta.standard.Sequence<traceability.Reference>) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject(kermeta.standard.StandardPackage.eINSTANCE
						.getSequence()));

		{

			kermeta.standard.Iterator<traceability.Trace> it_ft256 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<traceability.Trace> convertAsOrderedSet(
							mr.getSourceTraces()).iterator();
			java.lang.Boolean idLoopCond_1139 = false;
			while (!idLoopCond_1139) {
				idLoopCond_1139 = it_ft256.isOff();
				if (idLoopCond_1139) {
				} else {

					traceability.Reference result_lambda_ft256 = null;
					//BIle:collector
					traceability.Trace t_lbdExp256 = it_ft256.next();

					//BIft:detect

					traceability.Reference result_ft257 = null;

					traceability.Reference elem_ft257 = null;

					result_ft257 = null;

					{

						kermeta.standard.Iterator<traceability.Reference> it_ft257 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
								.<traceability.Reference> convertAsOrderedSet(
										t_lbdExp256.getSourceReferences())
								.iterator();
						java.lang.Boolean idLoopCond_1140 = false;
						while (!idLoopCond_1140) {
							idLoopCond_1140 = kermeta.standard.helper.BooleanWrapper
									.or(
											it_ft257.isOff(),
											org.kermeta.compil.runtime.helper.language.ObjectUtil
													.isNotEqualSwitcher(
															result_ft257, null));
							if (idLoopCond_1140) {
							} else {

								elem_ft257 = it_ft257.next();

								java.lang.Boolean idIfCond_1141 = false;
								//BIle:detector
								traceability.Reference sr_lbdExp257 = elem_ft257;

								idIfCond_1141 = org.kermeta.compil.runtime.helper.language.ObjectUtil
										.isInstanceOfSwitcher(
												sr_lbdExp257,
												org.kermeta.compil.runtime.ExecutionContext
														.getInstance()
														.getMetaClass(
																"traceability.TextReference"));
								//EIle:detector

								if (idIfCond_1141) {

									result_ft257 = elem_ft257;
								}

							}
						}
					}

					//EIft:detect
					result_lambda_ft256 = result_ft257;

					//EIle:collector

					result_ft256.add(result_lambda_ft256);
				}
			}
		}

		//CE
		c = result_ft256;
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
