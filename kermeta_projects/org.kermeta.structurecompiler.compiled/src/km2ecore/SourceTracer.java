/**
 * <copyright>
 * </copyright>
 *
 * $Id: SourceTracer.java,v 1.9 2008-11-27 15:49:48 cfaucher Exp $
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
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\ttraceability.TraceModel model = context.getTraceModel();\n\n\tjava.lang.Boolean idIfCond_1051 = false;\n\tidIfCond_1051 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(model));\n\n\tif( idIfCond_1051 ) {\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<traceability.Reference> it_ft238 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<traceability.Reference>convertAsSet(model.getReferences()).iterator();\n\tjava.lang.Boolean idLoopCond_1052 = false;\n\twhile( !idLoopCond_1052 ) {\n\tidLoopCond_1052 = it_ft238.isOff();\n\tif ( idLoopCond_1052 ) {\n\t} else {\n\n\t//BIle:func\ntraceability.Reference r_lbdExp238 = it_ft238.next();\n\n\tjava.lang.Boolean idIfCond_1053 = false;\n\tidIfCond_1053 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(r_lbdExp238, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"traceability.ModelReference\"));\n\n\tif( idIfCond_1053 ) {\n\n\ttraceability.ModelReference mr = ((traceability.ModelReference) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(r_lbdExp238, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"traceability.ModelReference\")));\n\n\ttraceability.TextReference tr = ((traceability.TraceabilityHelper) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"traceability.TraceabilityHelper\")).getFirstTextReference(mr);\n\n\tjava.lang.Boolean idIfCond_1054 = false;\n\tidIfCond_1054 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(tr));\n\n\tif( idIfCond_1054 ) {\n\n\tmr.getRefObject().setFileName(tr.getFileURI());\n\n\tmr.getRefObject().setFile(((traceability.File) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"traceability.File\")).getFileEMF_renameAs(model, tr.getFileURI()));\n\n\tmr.getRefObject().setLineNumber(tr.getLineBeginAt());\n}\n\n}\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n}\n\n'"
	 * @generated
	 */
	void addSourceInformation(KM2EcoreContext context);

} // SourceTracer
