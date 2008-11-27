/**
 * <copyright>
 * </copyright>
 *
 * $Id: ENamedElementHelper.java,v 1.9 2008-11-27 15:50:11 cfaucher Exp $
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.String result = null;\n\n\tresult = null;\n\n\tjava.lang.Boolean idIfCond_1061 = false;\n\tidIfCond_1061 = kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(element)), org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(element, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"ecore.ENamedElement\")));\n\n\tif( idIfCond_1061 ) {\n\n\tresult = ((ecore.ENamedElement) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(element, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"ecore.ENamedElement\"))).getName();\n}\n else {\n\n\tresult = org.kermeta.compil.runtime.helper.language.ObjectUtil.toStringSwitcher(element);\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	String asString(EObject element);

} // ENamedElementHelper
