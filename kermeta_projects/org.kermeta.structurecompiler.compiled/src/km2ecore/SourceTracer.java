/**
 * <copyright>
 * </copyright>
 *
 * $Id: SourceTracer.java,v 1.3 2008-09-22 14:48:57 cfaucher Exp $
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
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\ttraceability.TraceModel model = context.getTraceModel();\n\n\tjava.lang.Boolean idIfCond_983 = false;\n\tidIfCond_983 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoid(model));\n\n\tif( idIfCond_983 ) {\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<traceability.Reference> it_ft231 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<traceability.Reference>convertAsSet(model.getReferences()).iterator();\n\tjava.lang.Boolean idLoopCond_984 = false;\n\twhile( !idLoopCond_984 ) {\n\tidLoopCond_984 = it_ft231.isOff();\n\tif ( idLoopCond_984 ) {\n\t} else {\n\n\t//BIle:func\ntraceability.Reference r_lbdExp231 = it_ft231.next();\n\n\tjava.lang.Boolean idIfCond_985 = false;\n\tidIfCond_985 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOf(r_lbdExp231, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"traceability.ModelReference\"));\n\n\tif( idIfCond_985 ) {\n\n\ttraceability.ModelReference mr = ((traceability.ModelReference) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(r_lbdExp231, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"traceability.ModelReference\")));\n\n\ttraceability.TextReference tr = ((traceability.TraceabilityHelper) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"traceability.TraceabilityHelper\")).getFirstTextReference(mr);\n\n\tjava.lang.Boolean idIfCond_986 = false;\n\tidIfCond_986 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoid(tr));\n\n\tif( idIfCond_986 ) {\n\n\tmr.getRefObject().setFileName(tr.getFileURI());\n\n\tmr.getRefObject().setFile(((traceability.File) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"traceability.File\")).getFile(model, tr.getFileURI()));\n\n\tmr.getRefObject().setLineNumber(tr.getLineBeginAt());\n}\n\n}\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n}\n\n'"
	 * @generated
	 */
	void addSourceInformation(KM2EcoreContext context);

} // SourceTracer
