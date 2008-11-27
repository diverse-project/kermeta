/**
 * <copyright>
 * </copyright>
 *
 * $Id: TraceabilityHelperImpl.java,v 1.9 2008-11-27 15:50:09 cfaucher Exp $
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

		kermeta.standard.Sequence<traceability.Reference> result_ft248 = null;

		result_ft248 = ((kermeta.standard.Sequence<traceability.Reference>) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject("kermeta.standard.Sequence<traceability.Reference>"));

		{

			kermeta.standard.Iterator<traceability.Trace> it_ft248 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<traceability.Trace> convertAsOrderedSet(
							mr.getSourceTraces()).iterator();
			java.lang.Boolean idLoopCond_1099 = false;
			while (!idLoopCond_1099) {
				idLoopCond_1099 = it_ft248.isOff();
				if (idLoopCond_1099) {
				} else {

					traceability.Reference result_lambda_ft248 = null;
					//BIle:collector
					traceability.Trace t_lbdExp248 = it_ft248.next();

					//BIft:detect

					traceability.Reference result_ft249 = null;

					traceability.Reference elem_ft249 = null;

					result_ft249 = null;

					{

						kermeta.standard.Iterator<traceability.Reference> it_ft249 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
								.<traceability.Reference> convertAsOrderedSet(
										t_lbdExp248.getSourceReferences())
								.iterator();
						java.lang.Boolean idLoopCond_1100 = false;
						while (!idLoopCond_1100) {
							idLoopCond_1100 = kermeta.standard.helper.BooleanWrapper
									.or(
											it_ft249.isOff(),
											org.kermeta.compil.runtime.helper.language.ObjectUtil
													.isNotEqualSwitcher(
															result_ft249, null));
							if (idLoopCond_1100) {
							} else {

								elem_ft249 = it_ft249.next();

								java.lang.Boolean idIfCond_1101 = false;
								//BIle:detector
								traceability.Reference sr_lbdExp249 = elem_ft249;

								idIfCond_1101 = org.kermeta.compil.runtime.helper.language.ObjectUtil
										.isInstanceOfSwitcher(
												sr_lbdExp249,
												org.kermeta.compil.runtime.ExecutionContext
														.getInstance()
														.getMetaClass(
																"traceability.TextReference"));
								//EIle:detector

								if (idIfCond_1101) {

									result_ft249 = elem_ft249;
								}

							}
						}
					}

					//EIft:detect
					result_lambda_ft248 = result_ft249;

					//EIle:collector

					result_ft248.add(result_lambda_ft248);
				}
			}
		}

		//CE
		c = result_ft248;
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
