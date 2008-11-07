/**
 * <copyright>
 * </copyright>
 *
 * $Id: TraceabilityHelper.java,v 1.8 2008-11-07 08:53:56 cfaucher Exp $
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
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\ntraceability.TextReference result = null;\n\n\tkermeta.standard.Sequence<traceability.Reference> c = null;\n//BIft:collect\n\nkermeta.standard.Sequence<traceability.Reference> result_ft252 = null;\n\n\tresult_ft252 = ((kermeta.standard.Sequence<traceability.Reference>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.standard.Sequence<traceability.Reference>\"));\n\n\t\n{\n\n\tkermeta.standard.Iterator<traceability.Trace> it_ft252 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<traceability.Trace>convertAsOrderedSet(mr.getSourceTraces()).iterator();\n\tjava.lang.Boolean idLoopCond_1109 = false;\n\twhile( !idLoopCond_1109 ) {\n\tidLoopCond_1109 = it_ft252.isOff();\n\tif ( idLoopCond_1109 ) {\n\t} else {\n\ntraceability.Reference result_lambda_ft252 = null;\n//BIle:collector\ntraceability.Trace t_lbdExp252 = it_ft252.next();\n\n\t//BIft:detect\n\ntraceability.Reference result_ft253 = null;\n\n\ttraceability.Reference elem_ft253 = null;\n\n\tresult_ft253 = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<traceability.Reference> it_ft253 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<traceability.Reference>convertAsOrderedSet(t_lbdExp252.getSourceReferences()).iterator();\n\tjava.lang.Boolean idLoopCond_1110 = false;\n\twhile( !idLoopCond_1110 ) {\n\tidLoopCond_1110 = kermeta.standard.helper.BooleanWrapper.or(it_ft253.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(result_ft253, null));\n\tif ( idLoopCond_1110 ) {\n\t} else {\n\n\telem_ft253 = it_ft253.next();\n\n\tjava.lang.Boolean idIfCond_1111 = false;\n//BIle:detector\ntraceability.Reference sr_lbdExp253 = elem_ft253;\n\n\tidIfCond_1111 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(sr_lbdExp253, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"traceability.TextReference\"));\n//EIle:detector\n\n\n\tif( idIfCond_1111 ) {\n\n\tresult_ft253 = elem_ft253;\n}\n\n}\n\t}\n}\n\n//EIft:detect\nresult_lambda_ft252 = result_ft253;\n\n//EIle:collector\n\n\tresult_ft252.add(result_lambda_ft252);\n}\n\t}\n}\n\n\n//CE\nc = result_ft252;\n//EIft:collect\n\n\n\t{\ntry {\n\ttraceability.TextReference tr = ((traceability.TextReference) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(c.first(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"traceability.TextReference\")));\n\n\tresult = tr;\n} catch( org.kermeta.compil.runtime.helper.error.KRuntimeError ex_switcher_5 ) {\nif( ex_switcher_5.getRealException() instanceof kermeta.exceptions.EmptyCollection ) {\nkermeta.exceptions.EmptyCollection e = (kermeta.exceptions.EmptyCollection) ex_switcher_5.getRealException();\nresult = null;\n}\n}\n}\n\nreturn result;\n'"
	 * @generated
	 */
	TextReference getFirstTextReference(ModelReference mr);

} // TraceabilityHelper
