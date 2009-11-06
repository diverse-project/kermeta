/**
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * 
 * Generated with Kermeta <http://www.kermeta.org>
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
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\ntraceability.TextReference result = null;\n\n\tkermeta.standard.Sequence<traceability.Reference> c = null;\n//BIft:collect\n\nkermeta.standard.Sequence<traceability.Reference> result_ft272 = null;\n\n\tresult_ft272 = ((kermeta.standard.Sequence<traceability.Reference>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.standard.StandardPackage.eINSTANCE.getSequence()));\n\n\t\n{\n\n\tkermeta.standard.Iterator<traceability.Trace> it_ft272 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<traceability.Trace>convertAsOrderedSet(mr.getSourceTraces()).iterator();\n\tjava.lang.Boolean idLoopCond_1190 = false;\n\twhile( !idLoopCond_1190 ) {\n\tidLoopCond_1190 = it_ft272.isOff();\n\tif ( idLoopCond_1190 ) {\n\t} else {\n\ntraceability.Reference result_lambda_ft272 = null;\n//BIle:collector\ntraceability.Trace t_lbdExp272 = it_ft272.next();\n\n\t//BIft:detect\n\ntraceability.Reference result_ft273 = null;\n\n\ttraceability.Reference elem_ft273 = null;\n\n\tresult_ft273 = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<traceability.Reference> it_ft273 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<traceability.Reference>convertAsOrderedSet(t_lbdExp272.getSourceReferences()).iterator();\n\tjava.lang.Boolean idLoopCond_1191 = false;\n\twhile( !idLoopCond_1191 ) {\n\tidLoopCond_1191 = kermeta.standard.helper.BooleanWrapper.or(it_ft273.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(result_ft273, null));\n\tif ( idLoopCond_1191 ) {\n\t} else {\n\n\telem_ft273 = it_ft273.next();\n\n\tjava.lang.Boolean idIfCond_1192 = false;\n//BIle:detector\ntraceability.Reference sr_lbdExp273 = elem_ft273;\n\n\tidIfCond_1192 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(sr_lbdExp273, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"traceability.TextReference\"));\n//EIle:detector\n\n\n\tif( idIfCond_1192 ) {\n\n\tresult_ft273 = elem_ft273;\n}\n\n}\n\t}\n}\n\n//EIft:detect\nresult_lambda_ft272 = result_ft273;\n\n//EIle:collector\n\n\tresult_ft272.add(result_lambda_ft272);\n}\n\t}\n}\n\n\n//CE\nc = result_ft272;\n//EIft:collect\n;\n\n\t{\ntry {\n\ttraceability.TextReference tr = ((traceability.TextReference) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(c.first(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"traceability.TextReference\")));\n\n\tresult = tr;\n} catch( org.kermeta.compil.runtime.helper.error.KRuntimeError ex_switcher_7 ) {\nboolean caught_7 = false;\nif( ex_switcher_7.getRealException() instanceof kermeta.exceptions.EmptyCollection ) {\ncaught_7 = true;\nkermeta.exceptions.EmptyCollection e = (kermeta.exceptions.EmptyCollection) ex_switcher_7.getRealException();\nresult = null;\n}\nif( !caught_7 ) { throw ex_switcher_7; }\n\n}\n}\n\nreturn result;\n'"
	 * @generated
	 */
	TextReference getFirstTextReference(ModelReference mr);

} // TraceabilityHelper
