/**
 * <copyright>
 * </copyright>
 *
 * $Id: TraceabilityHelper.java,v 1.3 2008-09-22 14:48:58 cfaucher Exp $
 */
package traceability;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Helper</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see traceability.TraceabilityPackage#getTraceabilityHelper()
 * @model
 * @generated
 */
public interface TraceabilityHelper extends kermeta.language.structure.Object {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\ntraceability.TextReference result = null;\n\n\tkermeta.standard.Sequence<traceability.Reference> c = null;\n//BIft:collect\n\nkermeta.standard.Sequence<traceability.Reference> result_ft241 = null;\n\n\tresult_ft241 = ((kermeta.standard.Sequence<traceability.Reference>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.standard.Sequence<traceability.Reference>\"));\n\n\t\n{\n\n\tkermeta.standard.Iterator<traceability.Trace> it_ft241 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<traceability.Trace>convertAsOrderedSet(mr.getSourceTraces()).iterator();\n\tjava.lang.Boolean idLoopCond_1033 = false;\n\twhile( !idLoopCond_1033 ) {\n\tidLoopCond_1033 = it_ft241.isOff();\n\tif ( idLoopCond_1033 ) {\n\t} else {\n\ntraceability.Reference result_lambda_ft241 = null;\n//BIle:collector\ntraceability.Trace t_lbdExp241 = it_ft241.next();\n\n\t//BIft:detect\n\ntraceability.Reference result_ft242 = null;\n\n\ttraceability.Reference elem_ft242 = null;\n\n\tresult_ft242 = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<traceability.Reference> it_ft242 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<traceability.Reference>convertAsOrderedSet(t_lbdExp241.getSourceReferences()).iterator();\n\tjava.lang.Boolean idLoopCond_1034 = false;\n\twhile( !idLoopCond_1034 ) {\n\tidLoopCond_1034 = kermeta.standard.helper.BooleanWrapper.or(it_ft242.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqual(result_ft242, null));\n\tif ( idLoopCond_1034 ) {\n\t} else {\n\n\telem_ft242 = it_ft242.next();\n\n\tjava.lang.Boolean idIfCond_1035 = false;\n//BIle:detector\ntraceability.Reference sr_lbdExp242 = elem_ft242;\n\n\tidIfCond_1035 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOf(sr_lbdExp242, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"traceability.TextReference\"));\n//EIle:detector\n\n\n\tif( idIfCond_1035 ) {\n\n\tresult_ft242 = elem_ft242;\n}\n\n}\n\t}\n}\n\n//EIft:detect\nresult_lambda_ft241 = result_ft242;\n\n//EIle:collector\n\n\tresult_ft241.add(result_lambda_ft241);\n}\n\t}\n}\n\n\n//CE\nc = result_ft241;\n//EIft:collect\n\n\n\t{\ntry {\n\ttraceability.TextReference tr = ((traceability.TextReference) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(c.first(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"traceability.TextReference\")));\n\n\tresult = tr;\n} catch( org.kermeta.compil.runtime.helper.error.KRuntimeError ex_switcher_5 ) {\nif( ex_switcher_5.getRealException() instanceof kermeta.exceptions.EmptyCollection ) {\nkermeta.exceptions.EmptyCollection e = (kermeta.exceptions.EmptyCollection) ex_switcher_5.getRealException();\nresult = null;\n}\n}\n}\n\nreturn result;\n'"
	 * @generated
	 */
	TextReference getFirstTextReference(ModelReference mr);

} // TraceabilityHelper
