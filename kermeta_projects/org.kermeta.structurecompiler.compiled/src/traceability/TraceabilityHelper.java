/**
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * 
 * Generating with Kermeta <http://www.kermeta.org>
 *
 * $Id$
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
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\ntraceability.TextReference result = null;\n\n\tkermeta.standard.Sequence<traceability.Reference> c = null;\n//BIft:collect\n\nkermeta.standard.Sequence<traceability.Reference> result_ft277 = null;\n\n\tresult_ft277 = ((kermeta.standard.Sequence<traceability.Reference>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.standard.StandardPackage.eINSTANCE.getSequence()));\n\n\t\n{\n\n\tkermeta.standard.Iterator<traceability.Trace> it_ft277 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<traceability.Trace>convertAsOrderedSet(mr.getSourceTraces()).iterator();\n\tjava.lang.Boolean idLoopCond_1206 = false;\n\twhile( !idLoopCond_1206 ) {\n\tidLoopCond_1206 = it_ft277.isOff();\n\tif ( idLoopCond_1206 ) {\n\t} else {\n\ntraceability.Reference result_lambda_ft277 = null;\n//BIle:collector\ntraceability.Trace t_lbdExp277 = it_ft277.next();\n\n\t//BIft:detect\n\ntraceability.Reference result_ft278 = null;\n\n\ttraceability.Reference elem_ft278 = null;\n\n\tresult_ft278 = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<traceability.Reference> it_ft278 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<traceability.Reference>convertAsOrderedSet(t_lbdExp277.getSourceReferences()).iterator();\n\tjava.lang.Boolean idLoopCond_1207 = false;\n\twhile( !idLoopCond_1207 ) {\n\tidLoopCond_1207 = kermeta.standard.helper.BooleanWrapper.or(it_ft278.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(result_ft278, null));\n\tif ( idLoopCond_1207 ) {\n\t} else {\n\n\telem_ft278 = it_ft278.next();\n\n\tjava.lang.Boolean idIfCond_1208 = false;\n//BIle:detector\ntraceability.Reference sr_lbdExp278 = elem_ft278;\n\n\tidIfCond_1208 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(sr_lbdExp278, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"traceability.TextReference\"));\n//EIle:detector\n\n\n\tif( idIfCond_1208 ) {\n\n\tresult_ft278 = elem_ft278;\n}\n\n}\n\t}\n}\n\n//EIft:detect\nresult_lambda_ft277 = result_ft278;\n\n//EIle:collector\n\n\tresult_ft277.add(result_lambda_ft277);\n}\n\t}\n}\n\n\n//CE\nc = result_ft277;\n//EIft:collect\n;\n\n\t{\ntry {\n\ttraceability.TextReference tr = ((traceability.TextReference) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(c.first(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"traceability.TextReference\")));\n\n\tresult = tr;\n} catch( org.kermeta.compil.runtime.helper.error.KRuntimeError ex_switcher_7 ) {\nboolean caught_7 = false;\nif( ex_switcher_7.getRealException() instanceof kermeta.exceptions.EmptyCollection ) {\ncaught_7 = true;\nkermeta.exceptions.EmptyCollection e = (kermeta.exceptions.EmptyCollection) ex_switcher_7.getRealException();\nresult = null;\n}\nif( !caught_7 ) { throw ex_switcher_7; }\n\n}\n}\n\nreturn result;\n'"
	 * @generated
	 */
	TextReference getFirstTextReference(ModelReference mr);

} // TraceabilityHelper
