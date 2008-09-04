/**
 * <copyright>
 * </copyright>
 *
 * $Id: TraceabilityHelper.java,v 1.1 2008-09-04 15:40:27 cfaucher Exp $
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
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\ntraceability.TextReference result = null;\n\n\tkermeta.standard.Sequence<traceability.Reference> c = null;\n//Beginning of the Inlining of the function type: collect\n\nkermeta.standard.Sequence<traceability.Reference> result_ft198 = null;\n\n\tresult_ft198 = ((kermeta.standard.Sequence<traceability.Reference>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.standard.Sequence<traceability.Reference>\"));\n\n\t\n{\n\n\tkermeta.standard.Iterator<traceability.Trace> it_ft198 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<traceability.Trace>convertAsOrderedSet(mr.getSourceTraces()).iterator();\n\tjava.lang.Boolean idLoopCond_863 = false;\n\twhile( !idLoopCond_863 ) {\n\tidLoopCond_863 = it_ft198.isOff();\n\tif ( idLoopCond_863 ) {\n\t} else {\n\ntraceability.Reference result_lambda = null;\n//Beginning of the Inlining of the lambda expression: collector\ntraceability.Trace t = it_ft198.next();\n\n\tresult_lambda = //Beginning of the Inlining of the function type: detect\n\ntraceability.Reference result_ft199 = null;\n\n\ttraceability.Reference elem_ft199 = null;\n\n\tresult_ft199 = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<traceability.Reference> it_ft199 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<traceability.Reference>convertAsOrderedSet(t.getSourceReferences()).iterator();\n\tjava.lang.Boolean idLoopCond_864 = false;\n\twhile( !idLoopCond_864 ) {\n\tidLoopCond_864 = kermeta.standard.helper.BooleanWrapper.or(it_ft199.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqual(result_ft199, null));\n\tif ( idLoopCond_864 ) {\n\t} else {\n\n\telem_ft199 = it_ft199.next();\n\n\tjava.lang.Boolean idIfCond_865 = false;\n//Beginning of the Inlining of the lambda expression: detector\ntraceability.Reference sr = elem_ft199;\n\n\tidIfCond_865 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOf(sr, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"traceability.TextReference\"));\n//End of the Inlining of the lambda expression: detector\n\n\n\tif( idIfCond_865 ) {\n\n\tresult_ft199 = elem_ft199;\n}\n\n}\n\t}\n}\n\n//End of the Inlining of the function type: detect\n\n//End of the Inlining of the lambda expression: collector\n\n\tresult_ft198.add(result_lambda);\n}\n\t}\n}\n\n\n//callElement\nc = result_ft198;\n//End of the Inlining of the function type: collect\n\n\n\t{\ntry {\n\ttraceability.TextReference tr = ((traceability.TextReference) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(c.first(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"traceability.TextReference\")));\n\n\tresult = tr;\n} catch( org.kermeta.compil.runtime.helper.error.KRuntimeError ex_switcher_5 ) {\nif( ex_switcher_5.getRealException() instanceof kermeta.exceptions.EmptyCollection ) {\nkermeta.exceptions.EmptyCollection e = (kermeta.exceptions.EmptyCollection) ex_switcher_5.getRealException();\nresult = null;\n}\n}\n}\n\nreturn result;\n'"
	 * @generated
	 */
	TextReference getFirstTextReference(ModelReference mr);

} // TraceabilityHelper
