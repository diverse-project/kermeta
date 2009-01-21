/**
 * <copyright>
 * </copyright>
 *
 * $Id: TraceabilityHelperImpl.java,v 1.10 2009-01-21 09:16:04 cfaucher Exp $
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

		kermeta.standard.Sequence<traceability.Reference> result_ft260 = null;

		result_ft260 = ((kermeta.standard.Sequence<traceability.Reference>) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject(kermeta.standard.StandardPackage.eINSTANCE
						.getSequence()));

		{

			kermeta.standard.Iterator<traceability.Trace> it_ft260 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<traceability.Trace> convertAsOrderedSet(
							mr.getSourceTraces()).iterator();
			java.lang.Boolean idLoopCond_1134 = false;
			while (!idLoopCond_1134) {
				idLoopCond_1134 = it_ft260.isOff();
				if (idLoopCond_1134) {
				} else {

					traceability.Reference result_lambda_ft260 = null;
					//BIle:collector
					traceability.Trace t_lbdExp260 = it_ft260.next();

					//BIft:detect

					traceability.Reference result_ft261 = null;

					traceability.Reference elem_ft261 = null;

					result_ft261 = null;

					{

						kermeta.standard.Iterator<traceability.Reference> it_ft261 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
								.<traceability.Reference> convertAsOrderedSet(
										t_lbdExp260.getSourceReferences())
								.iterator();
						java.lang.Boolean idLoopCond_1135 = false;
						while (!idLoopCond_1135) {
							idLoopCond_1135 = kermeta.standard.helper.BooleanWrapper
									.or(
											it_ft261.isOff(),
											org.kermeta.compil.runtime.helper.language.ObjectUtil
													.isNotEqualSwitcher(
															result_ft261, null));
							if (idLoopCond_1135) {
							} else {

								elem_ft261 = it_ft261.next();

								java.lang.Boolean idIfCond_1136 = false;
								//BIle:detector
								traceability.Reference sr_lbdExp261 = elem_ft261;

								idIfCond_1136 = org.kermeta.compil.runtime.helper.language.ObjectUtil
										.isInstanceOfSwitcher(
												sr_lbdExp261,
												org.kermeta.compil.runtime.ExecutionContext
														.getInstance()
														.getMetaClass(
																"traceability.TextReference"));
								//EIle:detector

								if (idIfCond_1136) {

									result_ft261 = elem_ft261;
								}

							}
						}
					}

					//EIft:detect
					result_lambda_ft260 = result_ft261;

					//EIle:collector

					result_ft260.add(result_lambda_ft260);
				}
			}
		}

		//CE
		c = result_ft260;
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
