/**
 * <copyright>
 * </copyright>
 *
 * $Id: TraceabilityHelper.java,v 1.6 2008-10-28 13:18:26 cfaucher Exp $
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
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\ntraceability.TextReference result = null;\n\n\tkermeta.standard.Sequence<traceability.Reference> c = null;\n//BIft:collect\n\nkermeta.standard.Sequence<traceability.Reference> result_ft251 = null;\n\n\tresult_ft251 = ((kermeta.standard.Sequence<traceability.Reference>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.standard.Sequence<traceability.Reference>\"));\n\n\t\n{\n\n\tkermeta.standard.Iterator<traceability.Trace> it_ft251 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<traceability.Trace>convertAsOrderedSet(mr.getSourceTraces()).iterator();\n\tjava.lang.Boolean idLoopCond_1098 = false;\n\twhile( !idLoopCond_1098 ) {\n\tidLoopCond_1098 = it_ft251.isOff();\n\tif ( idLoopCond_1098 ) {\n\t} else {\n\ntraceability.Reference result_lambda_ft251 = null;\n//BIle:collector\ntraceability.Trace t_lbdExp251 = it_ft251.next();\n\n\t//BIft:detect\n\ntraceability.Reference result_ft252 = null;\n\n\ttraceability.Reference elem_ft252 = null;\n\n\tresult_ft252 = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<traceability.Reference> it_ft252 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<traceability.Reference>convertAsOrderedSet(t_lbdExp251.getSourceReferences()).iterator();\n\tjava.lang.Boolean idLoopCond_1099 = false;\n\twhile( !idLoopCond_1099 ) {\n\tidLoopCond_1099 = kermeta.standard.helper.BooleanWrapper.or(it_ft252.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(result_ft252, null));\n\tif ( idLoopCond_1099 ) {\n\t} else {\n\n\telem_ft252 = it_ft252.next();\n\n\tjava.lang.Boolean idIfCond_1100 = false;\n//BIle:detector\ntraceability.Reference sr_lbdExp252 = elem_ft252;\n\n\tidIfCond_1100 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(sr_lbdExp252, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"traceability.TextReference\"));\n//EIle:detector\n\n\n\tif( idIfCond_1100 ) {\n\n\tresult_ft252 = elem_ft252;\n}\n\n}\n\t}\n}\n\n//EIft:detect\nresult_lambda_ft251 = result_ft252;\n\n//EIle:collector\n\n\tresult_ft251.add(result_lambda_ft251);\n}\n\t}\n}\n\n\n//CE\nc = result_ft251;\n//EIft:collect\n\n\n\t{\ntry {\n\ttraceability.TextReference tr = ((traceability.TextReference) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(c.first(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"traceability.TextReference\")));\n\n\tresult = tr;\n} catch( org.kermeta.compil.runtime.helper.error.KRuntimeError ex_switcher_5 ) {\nif( ex_switcher_5.getRealException() instanceof kermeta.exceptions.EmptyCollection ) {\nkermeta.exceptions.EmptyCollection e = (kermeta.exceptions.EmptyCollection) ex_switcher_5.getRealException();\nresult = null;\n}\n}\n}\n\nreturn result;\n'"
	 * @generated
	 */
	TextReference getFirstTextReference(ModelReference mr);

} // TraceabilityHelper
