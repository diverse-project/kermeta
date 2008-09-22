/**
 * <copyright>
 * </copyright>
 *
 * $Id: TraceabilityHelperImpl.java,v 1.3 2008-09-22 14:49:08 cfaucher Exp $
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

		kermeta.standard.Sequence<traceability.Reference> result_ft241 = null;

		result_ft241 = ((kermeta.standard.Sequence<traceability.Reference>) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject("kermeta.standard.Sequence<traceability.Reference>"));

		{

			kermeta.standard.Iterator<traceability.Trace> it_ft241 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<traceability.Trace> convertAsOrderedSet(
							mr.getSourceTraces()).iterator();
			java.lang.Boolean idLoopCond_1033 = false;
			while (!idLoopCond_1033) {
				idLoopCond_1033 = it_ft241.isOff();
				if (idLoopCond_1033) {
				} else {

					traceability.Reference result_lambda_ft241 = null;
					//BIle:collector
					traceability.Trace t_lbdExp241 = it_ft241.next();

					//BIft:detect

					traceability.Reference result_ft242 = null;

					traceability.Reference elem_ft242 = null;

					result_ft242 = null;

					{

						kermeta.standard.Iterator<traceability.Reference> it_ft242 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
								.<traceability.Reference> convertAsOrderedSet(
										t_lbdExp241.getSourceReferences())
								.iterator();
						java.lang.Boolean idLoopCond_1034 = false;
						while (!idLoopCond_1034) {
							idLoopCond_1034 = kermeta.standard.helper.BooleanWrapper
									.or(
											it_ft242.isOff(),
											org.kermeta.compil.runtime.helper.language.ObjectUtil
													.isNotEqual(result_ft242,
															null));
							if (idLoopCond_1034) {
							} else {

								elem_ft242 = it_ft242.next();

								java.lang.Boolean idIfCond_1035 = false;
								//BIle:detector
								traceability.Reference sr_lbdExp242 = elem_ft242;

								idIfCond_1035 = org.kermeta.compil.runtime.helper.language.ObjectUtil
										.isInstanceOf(
												sr_lbdExp242,
												org.kermeta.compil.runtime.ExecutionContext
														.getInstance()
														.getMetaClass(
																"traceability.TextReference"));
								//EIle:detector

								if (idIfCond_1035) {

									result_ft242 = elem_ft242;
								}

							}
						}
					}

					//EIft:detect
					result_lambda_ft241 = result_ft242;

					//EIle:collector

					result_ft241.add(result_lambda_ft241);
				}
			}
		}

		//CE
		c = result_ft241;
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
