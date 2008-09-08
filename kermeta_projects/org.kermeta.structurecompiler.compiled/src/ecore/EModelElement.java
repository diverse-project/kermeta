/**
 * <copyright>
 * </copyright>
 *
 * $Id: EModelElement.java,v 1.2 2008-09-08 19:28:31 cfaucher Exp $
 */
package ecore;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EModel Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ecore.EModelElement#getEAnnotations <em>EAnnotations</em>}</li>
 * </ul>
 * </p>
 *
 * @see ecore.EcorePackage#getEModelElement()
 * @model abstract="true"
 *        annotation="kermeta aspect='true'"
 * @generated
 */
public interface EModelElement extends EObject {
	/**
	 * Returns the value of the '<em><b>EAnnotations</b></em>' containment reference list.
	 * The list contents are of type {@link ecore.EAnnotation}.
	 * It is bidirectional and its opposite is '{@link ecore.EAnnotation#getEModelElement <em>EModel Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EAnnotations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EAnnotations</em>' containment reference list.
	 * @see ecore.EcorePackage#getEModelElement_EAnnotations()
	 * @see ecore.EAnnotation#getEModelElement
	 * @model opposite="eModelElement" containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<EAnnotation> getEAnnotations();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model sourceDataType="ecore.EString"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\necore.EAnnotation result = null;\n\n\tresult = null;\n//Beginning of the Inlining of the function type: detect\n\necore.EAnnotation result_ft214 = null;\n\n\tecore.EAnnotation elem_ft214 = null;\n\n\tresult_ft214 = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<ecore.EAnnotation> it_ft214 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EAnnotation>convertAsOrderedSet(this.getEAnnotations()).iterator();\n\tjava.lang.Boolean idLoopCond_918 = false;\n\twhile( !idLoopCond_918 ) {\n\tidLoopCond_918 = kermeta.standard.helper.BooleanWrapper.or(it_ft214.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqual(result_ft214, null));\n\tif ( idLoopCond_918 ) {\n\t} else {\n\n\telem_ft214 = it_ft214.next();\n\n\tjava.lang.Boolean idIfCond_919 = false;\n//Beginning of the Inlining of the lambda expression: detector\necore.EAnnotation a = elem_ft214;\n\n\tidIfCond_919 = kermeta.standard.helper.StringWrapper.equals(a.getSource(), source);\n//End of the Inlining of the lambda expression: detector\n\n\n\tif( idIfCond_919 ) {\n\n\tresult_ft214 = elem_ft214;\n}\n\n}\n\t}\n}\n\n//End of the Inlining of the function type: detect\n\n\nreturn result;\n'"
	 * @generated
	 */
	EAnnotation getEAnnotation(String source);

} // EModelElement
