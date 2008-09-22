/**
 * <copyright>
 * </copyright>
 *
 * $Id: SourceTracerImpl.java,v 1.3 2008-09-22 14:49:09 cfaucher Exp $
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

		java.lang.Boolean idIfCond_983 = false;
		idIfCond_983 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoid(model));

		if (idIfCond_983) {

			//BIft:each

			{

				kermeta.standard.Iterator<traceability.Reference> it_ft231 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<traceability.Reference> convertAsSet(
								model.getReferences()).iterator();
				java.lang.Boolean idLoopCond_984 = false;
				while (!idLoopCond_984) {
					idLoopCond_984 = it_ft231.isOff();
					if (idLoopCond_984) {
					} else {

						//BIle:func
						traceability.Reference r_lbdExp231 = it_ft231.next();

						java.lang.Boolean idIfCond_985 = false;
						idIfCond_985 = org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isInstanceOf(
										r_lbdExp231,
										org.kermeta.compil.runtime.ExecutionContext
												.getInstance()
												.getMetaClass(
														"traceability.ModelReference"));

						if (idIfCond_985) {

							traceability.ModelReference mr = ((traceability.ModelReference) org.kermeta.compil.runtime.helper.language.ObjectUtil
									.asType(
											r_lbdExp231,
											org.kermeta.compil.runtime.ExecutionContext
													.getInstance()
													.getMetaClass(
															"traceability.ModelReference")));

							traceability.TextReference tr = ((traceability.TraceabilityHelper) org.kermeta.compil.runtime.helper.language.ClassUtil
									.newObject("traceability.TraceabilityHelper"))
									.getFirstTextReference(mr);

							java.lang.Boolean idIfCond_986 = false;
							idIfCond_986 = kermeta.standard.helper.BooleanWrapper
									.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
											.isVoid(tr));

							if (idIfCond_986) {

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
