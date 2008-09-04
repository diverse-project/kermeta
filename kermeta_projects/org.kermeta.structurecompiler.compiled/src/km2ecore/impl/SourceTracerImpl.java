/**
 * <copyright>
 * </copyright>
 *
 * $Id: SourceTracerImpl.java,v 1.1 2008-09-04 15:40:40 cfaucher Exp $
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

		java.lang.Boolean idIfCond_756 = false;
		idIfCond_756 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoid(model));

		if (idIfCond_756) {

			//Beginning of the Inlining of the function type: each

			{

				kermeta.standard.Iterator<traceability.Reference> it_ft164 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<traceability.Reference> convertAsSet(
								model.getReferences()).iterator();
				java.lang.Boolean idLoopCond_757 = false;
				while (!idLoopCond_757) {
					idLoopCond_757 = it_ft164.isOff();
					if (idLoopCond_757) {
					} else {

						//Beginning of the Inlining of the lambda expression: func
						traceability.Reference r = it_ft164.next();

						java.lang.Boolean idIfCond_758 = false;
						idIfCond_758 = org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isInstanceOf(
										r,
										org.kermeta.compil.runtime.ExecutionContext
												.getInstance()
												.getMetaClass(
														"traceability.ModelReference"));

						if (idIfCond_758) {

							traceability.ModelReference mr = ((traceability.ModelReference) org.kermeta.compil.runtime.helper.language.ObjectUtil
									.asType(
											r,
											org.kermeta.compil.runtime.ExecutionContext
													.getInstance()
													.getMetaClass(
															"traceability.ModelReference")));

							traceability.TextReference tr = ((traceability.TraceabilityHelper) org.kermeta.compil.runtime.helper.language.ClassUtil
									.newObject("traceability.TraceabilityHelper"))
									.getFirstTextReference(mr);

							java.lang.Boolean idIfCond_759 = false;
							idIfCond_759 = kermeta.standard.helper.BooleanWrapper
									.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
											.isVoid(tr));

							if (idIfCond_759) {

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

						//End of the Inlining of the lambda expression: func

					}
				}
			}

			//End of the Inlining of the function type: each

		}

	}

} //SourceTracerImpl
