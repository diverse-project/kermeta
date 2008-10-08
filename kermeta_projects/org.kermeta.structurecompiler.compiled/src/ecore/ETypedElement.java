/**
 * <copyright>
 * </copyright>
 *
 * $Id: ETypedElement.java,v 1.5 2008-10-08 14:37:50 cfaucher Exp $
 */
package ecore;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ETyped Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ecore.ETypedElement#getLowerBound <em>Lower Bound</em>}</li>
 *   <li>{@link ecore.ETypedElement#isUnique <em>Unique</em>}</li>
 *   <li>{@link ecore.ETypedElement#getEType <em>EType</em>}</li>
 *   <li>{@link ecore.ETypedElement#isOrdered <em>Ordered</em>}</li>
 *   <li>{@link ecore.ETypedElement#getUpperBound <em>Upper Bound</em>}</li>
 *   <li>{@link ecore.ETypedElement#getEGenericType <em>EGeneric Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see ecore.EcorePackage#getETypedElement()
 * @model abstract="true"
 * @generated
 */
public interface ETypedElement extends ENamedElement {
	/**
	 * Returns the value of the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lower Bound</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lower Bound</em>' attribute.
	 * @see #setLowerBound(int)
	 * @see ecore.EcorePackage#getETypedElement_LowerBound()
	 * @model dataType="ecore.EInt"
	 * @generated
	 */
	int getLowerBound();

	/**
	 * Sets the value of the '{@link ecore.ETypedElement#getLowerBound <em>Lower Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower Bound</em>' attribute.
	 * @see #getLowerBound()
	 * @generated
	 */
	void setLowerBound(int value);

	/**
	 * Returns the value of the '<em><b>Unique</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unique</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unique</em>' attribute.
	 * @see #setUnique(boolean)
	 * @see ecore.EcorePackage#getETypedElement_Unique()
	 * @model default="true" dataType="ecore.EBoolean"
	 * @generated
	 */
	boolean isUnique();

	/**
	 * Sets the value of the '{@link ecore.ETypedElement#isUnique <em>Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unique</em>' attribute.
	 * @see #isUnique()
	 * @generated
	 */
	void setUnique(boolean value);

	/**
	 * Returns the value of the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EType</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EType</em>' reference.
	 * @see #setEType(EClassifier)
	 * @see ecore.EcorePackage#getETypedElement_EType()
	 * @model
	 * @generated
	 */
	EClassifier getEType();

	/**
	 * Sets the value of the '{@link ecore.ETypedElement#getEType <em>EType</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EType</em>' reference.
	 * @see #getEType()
	 * @generated
	 */
	void setEType(EClassifier value);

	/**
	 * Returns the value of the '<em><b>Ordered</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ordered</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ordered</em>' attribute.
	 * @see #setOrdered(boolean)
	 * @see ecore.EcorePackage#getETypedElement_Ordered()
	 * @model default="true" dataType="ecore.EBoolean"
	 * @generated
	 */
	boolean isOrdered();

	/**
	 * Sets the value of the '{@link ecore.ETypedElement#isOrdered <em>Ordered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ordered</em>' attribute.
	 * @see #isOrdered()
	 * @generated
	 */
	void setOrdered(boolean value);

	/**
	 * Returns the value of the '<em><b>Upper Bound</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Upper Bound</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper Bound</em>' attribute.
	 * @see #setUpperBound(int)
	 * @see ecore.EcorePackage#getETypedElement_UpperBound()
	 * @model default="1" dataType="ecore.EInt"
	 * @generated
	 */
	int getUpperBound();

	/**
	 * Sets the value of the '{@link ecore.ETypedElement#getUpperBound <em>Upper Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper Bound</em>' attribute.
	 * @see #getUpperBound()
	 * @generated
	 */
	void setUpperBound(int value);

	/**
	 * Returns the value of the '<em><b>EGeneric Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EGeneric Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EGeneric Type</em>' containment reference.
	 * @see #setEGenericType(EGenericType)
	 * @see ecore.EcorePackage#getETypedElement_EGenericType()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EGenericType getEGenericType();

	/**
	 * Sets the value of the '{@link ecore.ETypedElement#getEGenericType <em>EGeneric Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EGeneric Type</em>' containment reference.
	 * @see #getEGenericType()
	 * @generated
	 */
	void setEGenericType(EGenericType value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="ecore.EBoolean"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\nreturn result;\n'"
	 * @generated
	 */
	boolean getterMany();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="ecore.EBoolean"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\nreturn result;\n'"
	 * @generated
	 */
	boolean getterRequired();

} // ETypedElement
