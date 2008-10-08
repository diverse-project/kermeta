/**
 * <copyright>
 * </copyright>
 *
 * $Id: TraceabilityHelperImpl.java,v 1.4 2008-10-08 14:37:52 cfaucher Exp $
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

		kermeta.standard.Sequence<traceability.Reference> result_ft243 = null;

		result_ft243 = ((kermeta.standard.Sequence<traceability.Reference>) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject("kermeta.standard.Sequence<traceability.Reference>"));

		{

			kermeta.standard.Iterator<traceability.Trace> it_ft243 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<traceability.Trace> convertAsOrderedSet(
							mr.getSourceTraces()).iterator();
			java.lang.Boolean idLoopCond_1064 = false;
			while (!idLoopCond_1064) {
				idLoopCond_1064 = it_ft243.isOff();
				if (idLoopCond_1064) {
				} else {

					traceability.Reference result_lambda_ft243 = null;
					//BIle:collector
					traceability.Trace t_lbdExp243 = it_ft243.next();

					//BIft:detect

					traceability.Reference result_ft244 = null;

					traceability.Reference elem_ft244 = null;

					result_ft244 = null;

					{

						kermeta.standard.Iterator<traceability.Reference> it_ft244 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
								.<traceability.Reference> convertAsOrderedSet(
										t_lbdExp243.getSourceReferences())
								.iterator();
						java.lang.Boolean idLoopCond_1065 = false;
						while (!idLoopCond_1065) {
							idLoopCond_1065 = kermeta.standard.helper.BooleanWrapper
									.or(
											it_ft244.isOff(),
											org.kermeta.compil.runtime.helper.language.ObjectUtil
													.isNotEqual(result_ft244,
															null));
							if (idLoopCond_1065) {
							} else {

								elem_ft244 = it_ft244.next();

								java.lang.Boolean idIfCond_1066 = false;
								//BIle:detector
								traceability.Reference sr_lbdExp244 = elem_ft244;

								idIfCond_1066 = org.kermeta.compil.runtime.helper.language.ObjectUtil
										.isInstanceOf(
												sr_lbdExp244,
												org.kermeta.compil.runtime.ExecutionContext
														.getInstance()
														.getMetaClass(
																"traceability.TextReference"));
								//EIle:detector

								if (idIfCond_1066) {

									result_ft244 = elem_ft244;
								}

							}
						}
					}

					//EIft:detect
					result_lambda_ft243 = result_ft244;

					//EIle:collector

					result_ft243.add(result_lambda_ft243);
				}
			}
		}

		//CE
		c = result_ft243;
		//EIft:collect

		{
			try {
				traceability.TextReference tr = ((traceability.TextReference) org.kermeta.compil.runtime.helper.language.ObjectUtil
						.asType(c.first(),
								org.kermeta.compil.runtime.ExecutionContext
										.getInstance().getMetaClass(
												"traceability.TextReference")));

				result = tr;
			} catch (org.kermeta.compil.runtime.helper.error.KRuntimeError ex_switcher_5) {
				if (ex_switcher_5.getRealException() instanceof kermeta.exceptions.EmptyCollection) {
					kermeta.exceptions.EmptyCollection e = (kermeta.exceptions.EmptyCollection) ex_switcher_5
							.getRealException();
					result = null;
				}
			}
		}

		return result;

	}

} //TraceabilityHelperImpl
