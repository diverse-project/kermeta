/**
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * 
 * Generating with Kermeta <http://www.kermeta.org>
 *
 * $Id: SourceTracer.java,v 1.11 2009-02-10 17:51:44 cfaucher Exp $
 */
package km2ecore;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Source Tracer</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see km2ecore.Km2ecorePackage#getSourceTracer()
 * @model
 * @generated
 */
public interface SourceTracer extends kermeta.language.structure.Object {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\ttraceability.TraceModel model = context.getTraceModel();\n\n\tjava.lang.Boolean idIfCond_7 = false;\n\tidIfCond_7 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(model));\n\n\tif( idIfCond_7 ) {\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<traceability.Reference> it_ft1 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<traceability.Reference>convertAsSet(model.getReferences()).iterator();\n\tjava.lang.Boolean idLoopCond_8 = false;\n\twhile( !idLoopCond_8 ) {\n\tidLoopCond_8 = it_ft1.isOff();\n\tif ( idLoopCond_8 ) {\n\t} else {\n\n\t//BIle:func\ntraceability.Reference r_lbdExp1 = it_ft1.next();\n\n\tjava.lang.Boolean idIfCond_9 = false;\n\tidIfCond_9 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(r_lbdExp1, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"traceability.ModelReference\"));\n\n\tif( idIfCond_9 ) {\n\n\ttraceability.ModelReference mr = ((traceability.ModelReference) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(r_lbdExp1, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"traceability.ModelReference\")));\n\n\ttraceability.TextReference tr = ((traceability.TraceabilityHelper) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(traceability.TraceabilityPackage.eINSTANCE.getTraceabilityHelper())).getFirstTextReference(mr);\n\n\tjava.lang.Boolean idIfCond_10 = false;\n\tidIfCond_10 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(tr));\n\n\tif( idIfCond_10 ) {\n\n\tmr.getRefObject().setFileName(tr.getFileURI());\n\n\tmr.getRefObject().setFile(((traceability.File) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(traceability.TraceabilityPackage.eINSTANCE.getFile())).getFileEMF_renameAs(model, tr.getFileURI()));\n\n\tmr.getRefObject().setLineNumber(tr.getLineBeginAt());\n}\n\n}\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n}\n\n'"
	 * @generated
	 */
	void addSourceInformation(KM2EcoreContext context);

} // SourceTracer
