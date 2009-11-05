/**
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * 
 * Generating with Kermeta <http://www.kermeta.org>
 *
 * $Id$
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

		java.lang.Boolean idIfCond_1158 = false;
		idIfCond_1158 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoidSwitcher(model));

		if (idIfCond_1158) {

			//BIft:each

			{

				kermeta.standard.Iterator<traceability.Reference> it_ft267 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<traceability.Reference> convertAsSet(
								model.getReferences()).iterator();
				java.lang.Boolean idLoopCond_1159 = false;
				while (!idLoopCond_1159) {
					idLoopCond_1159 = it_ft267.isOff();
					if (idLoopCond_1159) {
					} else {

						//BIle:func
						traceability.Reference r_lbdExp267 = it_ft267.next();

						java.lang.Boolean idIfCond_1160 = false;
						idIfCond_1160 = org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isInstanceOfSwitcher(
										r_lbdExp267,
										org.kermeta.compil.runtime.ExecutionContext
												.getInstance()
												.getMetaClass(
														"traceability.ModelReference"));

						if (idIfCond_1160) {

							traceability.ModelReference mr = ((traceability.ModelReference) org.kermeta.compil.runtime.helper.language.ObjectUtil
									.asTypeSwitcher(
											r_lbdExp267,
											org.kermeta.compil.runtime.ExecutionContext
													.getInstance()
													.getMetaClass(
															"traceability.ModelReference")));

							traceability.TextReference tr = ((traceability.TraceabilityHelper) org.kermeta.compil.runtime.helper.language.ClassUtil
									.newObject(traceability.TraceabilityPackage.eINSTANCE
											.getTraceabilityHelper()))
									.getFirstTextReference(mr);

							java.lang.Boolean idIfCond_1161 = false;
							idIfCond_1161 = kermeta.standard.helper.BooleanWrapper
									.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
											.isVoidSwitcher(tr));

							if (idIfCond_1161) {

								mr.getRefObject().setFileName(tr.getFileURI());

								mr
										.getRefObject()
										.setFile(
												((traceability.File) org.kermeta.compil.runtime.helper.language.ClassUtil
														.newObject(traceability.TraceabilityPackage.eINSTANCE
																.getFile()))
														.getFileEMF_renameAs(
																model,
																tr.getFileURI()));

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
