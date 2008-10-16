/**
 * <copyright>
 * </copyright>
 *
 * $Id: ModelAnalizer.java,v 1.5 2008-10-16 13:18:15 cfaucher Exp $
 */
package km2ecore.helper.ecore;

import ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Analizer</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see km2ecore.helper.ecore.EcorePackage#getModelAnalizer()
 * @model
 * @generated
 */
public interface ModelAnalizer extends kermeta.language.structure.Object {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaBoolean"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = kermeta.standard.helper.BooleanWrapper.not(this.isExtendedBy(extended_class, super_class));\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean isInterfaceBy(EClass extended_class, EClass super_class);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaBoolean"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = false;\n\n\tjava.lang.Boolean idIfCond_29 = false;\n\tidIfCond_29 = org.kermeta.compil.runtime.helper.language.ObjectUtil.equals(super_class, org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EGenericType>convertAsOrderedSet(extended_class.getEGenericSuperTypes()).first().getEClassifier());\n\n\tif( idIfCond_29 ) {\n\n\tresult = true;\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean isExtendedBy(EClass extended_class, EClass super_class);

} // ModelAnalizer
