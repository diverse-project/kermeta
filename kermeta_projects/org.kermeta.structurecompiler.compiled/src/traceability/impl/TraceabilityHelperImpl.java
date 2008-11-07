/**
 * <copyright>
 * </copyright>
 *
 * $Id: TraceabilityHelperImpl.java,v 1.8 2008-11-07 08:53:54 cfaucher Exp $
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

		kermeta.standard.Sequence<traceability.Reference> result_ft252 = null;

		result_ft252 = ((kermeta.standard.Sequence<traceability.Reference>) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject("kermeta.standard.Sequence<traceability.Reference>"));

		{

			kermeta.standard.Iterator<traceability.Trace> it_ft252 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<traceability.Trace> convertAsOrderedSet(
							mr.getSourceTraces()).iterator();
			java.lang.Boolean idLoopCond_1109 = false;
			while (!idLoopCond_1109) {
				idLoopCond_1109 = it_ft252.isOff();
				if (idLoopCond_1109) {
				} else {

					traceability.Reference result_lambda_ft252 = null;
					//BIle:collector
					traceability.Trace t_lbdExp252 = it_ft252.next();

					//BIft:detect

					traceability.Reference result_ft253 = null;

					traceability.Reference elem_ft253 = null;

					result_ft253 = null;

					{

						kermeta.standard.Iterator<traceability.Reference> it_ft253 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
								.<traceability.Reference> convertAsOrderedSet(
										t_lbdExp252.getSourceReferences())
								.iterator();
						java.lang.Boolean idLoopCond_1110 = false;
						while (!idLoopCond_1110) {
							idLoopCond_1110 = kermeta.standard.helper.BooleanWrapper
									.or(
											it_ft253.isOff(),
											org.kermeta.compil.runtime.helper.language.ObjectUtil
													.isNotEqualSwitcher(
															result_ft253, null));
							if (idLoopCond_1110) {
							} else {

								elem_ft253 = it_ft253.next();

								java.lang.Boolean idIfCond_1111 = false;
								//BIle:detector
								traceability.Reference sr_lbdExp253 = elem_ft253;

								idIfCond_1111 = org.kermeta.compil.runtime.helper.language.ObjectUtil
										.isInstanceOfSwitcher(
												sr_lbdExp253,
												org.kermeta.compil.runtime.ExecutionContext
														.getInstance()
														.getMetaClass(
																"traceability.TextReference"));
								//EIle:detector

								if (idIfCond_1111) {

									result_ft253 = elem_ft253;
								}

							}
						}
					}

					//EIft:detect
					result_lambda_ft252 = result_ft253;

					//EIle:collector

					result_ft252.add(result_lambda_ft252);
				}
			}
		}

		//CE
		c = result_ft252;
		//EIft:collect

		{
			try {
				traceability.TextReference tr = ((traceability.TextReference) org.kermeta.compil.runtime.helper.language.ObjectUtil
						.asTypeSwitcher(c.first(),
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
