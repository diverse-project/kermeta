/**
 * <copyright>
 * </copyright>
 *
 * $Id: TraceabilityHelperImpl.java,v 1.2 2008-09-11 12:34:57 cfaucher Exp $
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

		kermeta.standard.Sequence<traceability.Reference> result_ft195 = null;

		result_ft195 = ((kermeta.standard.Sequence<traceability.Reference>) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject("kermeta.standard.Sequence<traceability.Reference>"));

		{

			kermeta.standard.Iterator<traceability.Trace> it_ft195 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<traceability.Trace> convertAsOrderedSet(
							mr.getSourceTraces()).iterator();
			java.lang.Boolean idLoopCond_909 = false;
			while (!idLoopCond_909) {
				idLoopCond_909 = it_ft195.isOff();
				if (idLoopCond_909) {
				} else {

					traceability.Reference result_lambda = null;
					//BIle:collector
					traceability.Trace t_lbdExp195 = it_ft195.next();

					//BIft:detect

					traceability.Reference result_ft196 = null;

					traceability.Reference elem_ft196 = null;

					result_ft196 = null;

					{

						kermeta.standard.Iterator<traceability.Reference> it_ft196 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
								.<traceability.Reference> convertAsOrderedSet(
										t_lbdExp195.getSourceReferences())
								.iterator();
						java.lang.Boolean idLoopCond_910 = false;
						while (!idLoopCond_910) {
							idLoopCond_910 = kermeta.standard.helper.BooleanWrapper
									.or(
											it_ft196.isOff(),
											org.kermeta.compil.runtime.helper.language.ObjectUtil
													.isNotEqual(result_ft196,
															null));
							if (idLoopCond_910) {
							} else {

								elem_ft196 = it_ft196.next();

								java.lang.Boolean idIfCond_911 = false;
								//BIle:detector
								traceability.Reference sr_lbdExp196 = elem_ft196;

								idIfCond_911 = org.kermeta.compil.runtime.helper.language.ObjectUtil
										.isInstanceOf(
												sr_lbdExp196,
												org.kermeta.compil.runtime.ExecutionContext
														.getInstance()
														.getMetaClass(
																"traceability.TextReference"));
								//EIle:detector

								if (idIfCond_911) {

									result_ft196 = elem_ft196;
								}

							}
						}
					}

					//EIft:detect
					result_lambda = result_ft196;

					//EIle:collector

					result_ft195.add(result_lambda);
				}
			}
		}

		//CE
		c = result_ft195;
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
