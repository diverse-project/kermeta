/**
 * <copyright>
 * </copyright>
 *
 * $Id: TypeReference.java,v 1.9 2008-11-27 15:49:47 cfaucher Exp $
 */
package kermeta.language.behavior;

import kermeta.language.structure.MultiplicityElement;

import km2ecore.KM2EcoreContext;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see kermeta.language.behavior.BehaviorPackage#getTypeReference()
 * @model annotation="kermeta documentation='TypeReference refers to the type used in a variable declaration'"
 * @generated
 */
public interface TypeReference extends MultiplicityElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaString"
	 *        annotation="kermeta superOperation='kermeta::language::structure::Object'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.String result = null;\n\n\tkermeta.language.structure.helper.ObjectSuper.super_createBehaviorJava(this, context);\n\n\tresult = this.getType().createBehaviorJava(context);\n\nreturn result;\n'"
	 * @generated
	 */
	String createBehaviorJava(KM2EcoreContext context);

} // TypeReference
