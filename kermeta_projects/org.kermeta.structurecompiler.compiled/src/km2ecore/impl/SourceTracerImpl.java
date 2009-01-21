/**
 * <copyright>
 * </copyright>
 *
 * $Id: SourceTracerImpl.java,v 1.10 2009-01-21 09:16:01 cfaucher Exp $
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

		java.lang.Boolean idIfCond_1068 = false;
		idIfCond_1068 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoidSwitcher(model));

		if (idIfCond_1068) {

			//BIft:each

			{

				kermeta.standard.Iterator<traceability.Reference> it_ft245 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<traceability.Reference> convertAsSet(
								model.getReferences()).iterator();
				java.lang.Boolean idLoopCond_1069 = false;
				while (!idLoopCond_1069) {
					idLoopCond_1069 = it_ft245.isOff();
					if (idLoopCond_1069) {
					} else {

						//BIle:func
						traceability.Reference r_lbdExp245 = it_ft245.next();

						java.lang.Boolean idIfCond_1070 = false;
						idIfCond_1070 = org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isInstanceOfSwitcher(
										r_lbdExp245,
										org.kermeta.compil.runtime.ExecutionContext
												.getInstance()
												.getMetaClass(
														"traceability.ModelReference"));

						if (idIfCond_1070) {

							traceability.ModelReference mr = ((traceability.ModelReference) org.kermeta.compil.runtime.helper.language.ObjectUtil
									.asTypeSwitcher(
											r_lbdExp245,
											org.kermeta.compil.runtime.ExecutionContext
													.getInstance()
													.getMetaClass(
															"traceability.ModelReference")));

							traceability.TextReference tr = ((traceability.TraceabilityHelper) org.kermeta.compil.runtime.helper.language.ClassUtil
									.newObject(traceability.TraceabilityPackage.eINSTANCE
											.getTraceabilityHelper()))
									.getFirstTextReference(mr);

							java.lang.Boolean idIfCond_1071 = false;
							idIfCond_1071 = kermeta.standard.helper.BooleanWrapper
									.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
											.isVoidSwitcher(tr));

							if (idIfCond_1071) {

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
