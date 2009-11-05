/**
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * 
 * Generating with Kermeta <http://www.kermeta.org>
 *
 * $Id$
 */
package ecore;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EGeneric Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ecore.EGenericType#getEUpperBound <em>EUpper Bound</em>}</li>
 *   <li>{@link ecore.EGenericType#getETypeArguments <em>EType Arguments</em>}</li>
 *   <li>{@link ecore.EGenericType#getEClassifier <em>EClassifier</em>}</li>
 *   <li>{@link ecore.EGenericType#getETypeParameter <em>EType Parameter</em>}</li>
 *   <li>{@link ecore.EGenericType#getELowerBound <em>ELower Bound</em>}</li>
 * </ul>
 * </p>
 *
 * @see ecore.EcorePackage#getEGenericType()
 * @model annotation="kermeta ecore='true'"
 * @generated
 */
public interface EGenericType extends EObject {
	/**
	 * Returns the value of the '<em><b>EUpper Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EUpper Bound</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EUpper Bound</em>' containment reference.
	 * @see #setEUpperBound(EGenericType)
	 * @see ecore.EcorePackage#getEGenericType_EUpperBound()
	 * @model containment="true" resolveProxies="true"
	 *        annotation="kermeta ecore='true'"
	 * @generated
	 */
	EGenericType getEUpperBound();

	/**
	 * Sets the value of the '{@link ecore.EGenericType#getEUpperBound <em>EUpper Bound</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EUpper Bound</em>' containment reference.
	 * @see #getEUpperBound()
	 * @generated
	 */
	void setEUpperBound(EGenericType value);

	/**
	 * Returns the value of the '<em><b>EType Arguments</b></em>' containment reference list.
	 * The list contents are of type {@link ecore.EGenericType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EType Arguments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EType Arguments</em>' containment reference list.
	 * @see ecore.EcorePackage#getEGenericType_ETypeArguments()
	 * @model containment="true" resolveProxies="true"
	 *        annotation="kermeta ecore='true'"
	 * @generated
	 */
	EList<EGenericType> getETypeArguments();

	/**
	 * Returns the value of the '<em><b>EClassifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EClassifier</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EClassifier</em>' reference.
	 * @see #setEClassifier(EClassifier)
	 * @see ecore.EcorePackage#getEGenericType_EClassifier()
	 * @model annotation="kermeta ecore='true'"
	 * @generated
	 */
	EClassifier getEClassifier();

	/**
	 * Sets the value of the '{@link ecore.EGenericType#getEClassifier <em>EClassifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EClassifier</em>' reference.
	 * @see #getEClassifier()
	 * @generated
	 */
	void setEClassifier(EClassifier value);

	/**
	 * Returns the value of the '<em><b>EType Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EType Parameter</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EType Parameter</em>' reference.
	 * @see #setETypeParameter(ETypeParameter)
	 * @see ecore.EcorePackage#getEGenericType_ETypeParameter()
	 * @model annotation="kermeta ecore='true'"
	 * @generated
	 */
	ETypeParameter getETypeParameter();

	/**
	 * Sets the value of the '{@link ecore.EGenericType#getETypeParameter <em>EType Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EType Parameter</em>' reference.
	 * @see #getETypeParameter()
	 * @generated
	 */
	void setETypeParameter(ETypeParameter value);

	/**
	 * Returns the value of the '<em><b>ELower Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ELower Bound</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ELower Bound</em>' containment reference.
	 * @see #setELowerBound(EGenericType)
	 * @see ecore.EcorePackage#getEGenericType_ELowerBound()
	 * @model containment="true" resolveProxies="true"
	 *        annotation="kermeta ecore='true'"
	 * @generated
	 */
	EGenericType getELowerBound();

	/**
	 * Sets the value of the '{@link ecore.EGenericType#getELowerBound <em>ELower Bound</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ELower Bound</em>' containment reference.
	 * @see #getELowerBound()
	 * @generated
	 */
	void setELowerBound(EGenericType value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\necore.EClassifier result = null;\n\nreturn result;\n'"
	 * @generated
	 */
	EClassifier getterERawType();

} // EGenericType
