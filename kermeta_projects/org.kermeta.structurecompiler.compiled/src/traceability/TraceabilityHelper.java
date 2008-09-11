/**
 * <copyright>
 * </copyright>
 *
 * $Id: TraceabilityHelper.java,v 1.2 2008-09-11 12:34:42 cfaucher Exp $
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
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\ntraceability.TextReference result = null;\n\n\tkermeta.standard.Sequence<traceability.Reference> c = null;\n//BIft:collect\n\nkermeta.standard.Sequence<traceability.Reference> result_ft195 = null;\n\n\tresult_ft195 = ((kermeta.standard.Sequence<traceability.Reference>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.standard.Sequence<traceability.Reference>\"));\n\n\t\n{\n\n\tkermeta.standard.Iterator<traceability.Trace> it_ft195 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<traceability.Trace>convertAsOrderedSet(mr.getSourceTraces()).iterator();\n\tjava.lang.Boolean idLoopCond_909 = false;\n\twhile( !idLoopCond_909 ) {\n\tidLoopCond_909 = it_ft195.isOff();\n\tif ( idLoopCond_909 ) {\n\t} else {\n\ntraceability.Reference result_lambda = null;\n//BIle:collector\ntraceability.Trace t_lbdExp195 = it_ft195.next();\n\n\t//BIft:detect\n\ntraceability.Reference result_ft196 = null;\n\n\ttraceability.Reference elem_ft196 = null;\n\n\tresult_ft196 = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<traceability.Reference> it_ft196 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<traceability.Reference>convertAsOrderedSet(t_lbdExp195.getSourceReferences()).iterator();\n\tjava.lang.Boolean idLoopCond_910 = false;\n\twhile( !idLoopCond_910 ) {\n\tidLoopCond_910 = kermeta.standard.helper.BooleanWrapper.or(it_ft196.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqual(result_ft196, null));\n\tif ( idLoopCond_910 ) {\n\t} else {\n\n\telem_ft196 = it_ft196.next();\n\n\tjava.lang.Boolean idIfCond_911 = false;\n//BIle:detector\ntraceability.Reference sr_lbdExp196 = elem_ft196;\n\n\tidIfCond_911 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOf(sr_lbdExp196, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"traceability.TextReference\"));\n//EIle:detector\n\n\n\tif( idIfCond_911 ) {\n\n\tresult_ft196 = elem_ft196;\n}\n\n}\n\t}\n}\n\n//EIft:detect\nresult_lambda = result_ft196;\n\n//EIle:collector\n\n\tresult_ft195.add(result_lambda);\n}\n\t}\n}\n\n\n//CE\nc = result_ft195;\n//EIft:collect\n\n\n\t{\ntry {\n\ttraceability.TextReference tr = ((traceability.TextReference) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(c.first(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"traceability.TextReference\")));\n\n\tresult = tr;\n} catch( org.kermeta.compil.runtime.helper.error.KRuntimeError ex_switcher_5 ) {\nif( ex_switcher_5.getRealException() instanceof kermeta.exceptions.EmptyCollection ) {\nkermeta.exceptions.EmptyCollection e = (kermeta.exceptions.EmptyCollection) ex_switcher_5.getRealException();\nresult = null;\n}\n}\n}\n\nreturn result;\n'"
	 * @generated
	 */
	TextReference getFirstTextReference(ModelReference mr);

} // TraceabilityHelper
