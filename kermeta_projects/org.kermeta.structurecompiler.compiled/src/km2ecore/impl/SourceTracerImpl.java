/**
 * <copyright>
 * </copyright>
 *
 * $Id: SourceTracerImpl.java,v 1.8 2008-11-07 08:53:46 cfaucher Exp $
 */
package km2ecore.impl;

import kermeta.language.structure.impl.ObjectImpl;

import km2ecore.KM2EcoreContext;
import km2ecore.Km2ecorePackage;
import km2ecore.SourceTracer;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Source Tracer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class SourceTracerImpl extends ObjectImpl implements SourceTracer {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SourceTracerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Km2ecorePackage.Literals.SOURCE_TRACER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addSourceInformation(KM2EcoreContext context) {

		traceability.TraceModel model = context.getTraceModel();

		java.lang.Boolean idIfCond_1 = false;
		idIfCond_1 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoidSwitcher(model));

		if (idIfCond_1) {

			//BIft:each

			{

				kermeta.standard.Iterator<traceability.Reference> it_ft1 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<traceability.Reference> convertAsSet(
								model.getReferences()).iterator();
				java.lang.Boolean idLoopCond_2 = false;
				while (!idLoopCond_2) {
					idLoopCond_2 = it_ft1.isOff();
					if (idLoopCond_2) {
					} else {

						//BIle:func
						traceability.Reference r_lbdExp1 = it_ft1.next();

						java.lang.Boolean idIfCond_3 = false;
						idIfCond_3 = org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isInstanceOfSwitcher(
										r_lbdExp1,
										org.kermeta.compil.runtime.ExecutionContext
												.getInstance()
												.getMetaClass(
														"traceability.ModelReference"));

						if (idIfCond_3) {

							traceability.ModelReference mr = ((traceability.ModelReference) org.kermeta.compil.runtime.helper.language.ObjectUtil
									.asTypeSwitcher(
											r_lbdExp1,
											org.kermeta.compil.runtime.ExecutionContext
													.getInstance()
													.getMetaClass(
															"traceability.ModelReference")));

							traceability.TextReference tr = ((traceability.TraceabilityHelper) org.kermeta.compil.runtime.helper.language.ClassUtil
									.newObject("traceability.TraceabilityHelper"))
									.getFirstTextReference(mr);

							java.lang.Boolean idIfCond_4 = false;
							idIfCond_4 = kermeta.standard.helper.BooleanWrapper
									.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
											.isVoidSwitcher(tr));

							if (idIfCond_4) {

								mr.getRefObject().setFileName(tr.getFileURI());

								mr
										.getRefObject()
										.setFile(
												((traceability.File) org.kermeta.compil.runtime.helper.language.ClassUtil
														.newObject("traceability.File"))
														.getFile(model, tr
																.getFileURI()));

								mr.getRefObject().setLineNumber(
										tr.getLineBeginAt());
							}

						}

						//EIle:func

					}
				}
			}

			//EIft:each

		}

	}

} //SourceTracerImpl
