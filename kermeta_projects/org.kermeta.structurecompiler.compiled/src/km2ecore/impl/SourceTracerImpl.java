/**
 * <copyright>
 * </copyright>
 *
 * $Id: SourceTracerImpl.java,v 1.4 2008-10-08 14:37:47 cfaucher Exp $
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

		java.lang.Boolean idIfCond_1007 = false;
		idIfCond_1007 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoid(model));

		if (idIfCond_1007) {

			//BIft:each

			{

				kermeta.standard.Iterator<traceability.Reference> it_ft229 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<traceability.Reference> convertAsSet(
								model.getReferences()).iterator();
				java.lang.Boolean idLoopCond_1008 = false;
				while (!idLoopCond_1008) {
					idLoopCond_1008 = it_ft229.isOff();
					if (idLoopCond_1008) {
					} else {

						//BIle:func
						traceability.Reference r_lbdExp229 = it_ft229.next();

						java.lang.Boolean idIfCond_1009 = false;
						idIfCond_1009 = org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isInstanceOf(
										r_lbdExp229,
										org.kermeta.compil.runtime.ExecutionContext
												.getInstance()
												.getMetaClass(
														"traceability.ModelReference"));

						if (idIfCond_1009) {

							traceability.ModelReference mr = ((traceability.ModelReference) org.kermeta.compil.runtime.helper.language.ObjectUtil
									.asType(
											r_lbdExp229,
											org.kermeta.compil.runtime.ExecutionContext
													.getInstance()
													.getMetaClass(
															"traceability.ModelReference")));

							traceability.TextReference tr = ((traceability.TraceabilityHelper) org.kermeta.compil.runtime.helper.language.ClassUtil
									.newObject("traceability.TraceabilityHelper"))
									.getFirstTextReference(mr);

							java.lang.Boolean idIfCond_1010 = false;
							idIfCond_1010 = kermeta.standard.helper.BooleanWrapper
									.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
											.isVoid(tr));

							if (idIfCond_1010) {

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
