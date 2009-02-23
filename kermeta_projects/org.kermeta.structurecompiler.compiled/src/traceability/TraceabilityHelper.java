/**
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * 
 * Generating with Kermeta <http://www.kermeta.org>
 *
 * $Id: TraceabilityHelper.java,v 1.12 2009-02-23 15:26:53 cfaucher Exp $
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
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\ntraceability.TextReference result = null;\n\n\tkermeta.standard.Sequence<traceability.Reference> c = null;\n//BIft:collect\n\nkermeta.standard.Sequence<traceability.Reference> result_ft259 = null;\n\n\tresult_ft259 = ((kermeta.standard.Sequence<traceability.Reference>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.standard.StandardPackage.eINSTANCE.getSequence()));\n\n\t\n{\n\n\tkermeta.standard.Iterator<traceability.Trace> it_ft259 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<traceability.Trace>convertAsOrderedSet(mr.getSourceTraces()).iterator();\n\tjava.lang.Boolean idLoopCond_1145 = false;\n\twhile( !idLoopCond_1145 ) {\n\tidLoopCond_1145 = it_ft259.isOff();\n\tif ( idLoopCond_1145 ) {\n\t} else {\n\ntraceability.Reference result_lambda_ft259 = null;\n//BIle:collector\ntraceability.Trace t_lbdExp259 = it_ft259.next();\n\n\t//BIft:detect\n\ntraceability.Reference result_ft260 = null;\n\n\ttraceability.Reference elem_ft260 = null;\n\n\tresult_ft260 = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<traceability.Reference> it_ft260 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<traceability.Reference>convertAsOrderedSet(t_lbdExp259.getSourceReferences()).iterator();\n\tjava.lang.Boolean idLoopCond_1146 = false;\n\twhile( !idLoopCond_1146 ) {\n\tidLoopCond_1146 = kermeta.standard.helper.BooleanWrapper.or(it_ft260.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(result_ft260, null));\n\tif ( idLoopCond_1146 ) {\n\t} else {\n\n\telem_ft260 = it_ft260.next();\n\n\tjava.lang.Boolean idIfCond_1147 = false;\n//BIle:detector\ntraceability.Reference sr_lbdExp260 = elem_ft260;\n\n\tidIfCond_1147 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(sr_lbdExp260, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"traceability.TextReference\"));\n//EIle:detector\n\n\n\tif( idIfCond_1147 ) {\n\n\tresult_ft260 = elem_ft260;\n}\n\n}\n\t}\n}\n\n//EIft:detect\nresult_lambda_ft259 = result_ft260;\n\n//EIle:collector\n\n\tresult_ft259.add(result_lambda_ft259);\n}\n\t}\n}\n\n\n//CE\nc = result_ft259;\n//EIft:collect\n;\n\n\t{\ntry {\n\ttraceability.TextReference tr = ((traceability.TextReference) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(c.first(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"traceability.TextReference\")));\n\n\tresult = tr;\n} catch( org.kermeta.compil.runtime.helper.error.KRuntimeError ex_switcher_5 ) {\nboolean caught_5 = false;\nif( ex_switcher_5.getRealException() instanceof kermeta.exceptions.EmptyCollection ) {\ncaught_5 = true;\nkermeta.exceptions.EmptyCollection e = (kermeta.exceptions.EmptyCollection) ex_switcher_5.getRealException();\nresult = null;\n}\nif( !caught_5 ) { throw ex_switcher_5; }\n\n}\n}\n\nreturn result;\n'"
	 * @generated
	 */
	TextReference getFirstTextReference(ModelReference mr);

} // TraceabilityHelper
