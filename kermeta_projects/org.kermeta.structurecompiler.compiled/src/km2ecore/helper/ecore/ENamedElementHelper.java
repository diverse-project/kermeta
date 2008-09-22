/**
 * <copyright>
 * </copyright>
 *
 * $Id: ENamedElementHelper.java,v 1.3 2008-09-22 14:49:08 cfaucher Exp $
 */
package km2ecore.helper.ecore;

import ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ENamed Element Helper</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see km2ecore.helper.ecore.EcorePackage#getENamedElementHelper()
 * @model
 * @generated
 */
public interface ENamedElementHelper extends kermeta.language.structure.Object {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaString"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.String result = null;\n\n\tresult = null;\n\n\tjava.lang.Boolean idIfCond_1006 = false;\n\tidIfCond_1006 = kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoid(element)), org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOf(element, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"ecore.ENamedElement\")));\n\n\tif( idIfCond_1006 ) {\n\n\tresult = ((ecore.ENamedElement) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(element, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"ecore.ENamedElement\"))).getName();\n}\n else {\n\n\tresult = org.kermeta.compil.runtime.helper.language.ObjectUtil.toString(element);\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	String asString(EObject element);

} // ENamedElementHelper
