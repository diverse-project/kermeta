/**
 * <copyright>
 * </copyright>
 *
 * $Id: EStructuralFeature.java,v 1.4 2008-09-22 14:44:19 cfaucher Exp $
 */
package ecore;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EStructural Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ecore.EStructuralFeature#isVolatile <em>Volatile</em>}</li>
 *   <li>{@link ecore.EStructuralFeature#getEContainingClass <em>EContaining Class</em>}</li>
 *   <li>{@link ecore.EStructuralFeature#getDefaultValueLiteral <em>Default Value Literal</em>}</li>
 *   <li>{@link ecore.EStructuralFeature#isTransient <em>Transient</em>}</li>
 *   <li>{@link ecore.EStructuralFeature#isUnsettable <em>Unsettable</em>}</li>
 *   <li>{@link ecore.EStructuralFeature#isDerived <em>Derived</em>}</li>
 *   <li>{@link ecore.EStructuralFeature#isChangeable <em>Changeable</em>}</li>
 * </ul>
 * </p>
 *
 * @see ecore.EcorePackage#getEStructuralFeature()
 * @model abstract="true"
 * @generated
 */
public interface EStructuralFeature extends ETypedElement {
	/**
	 * Returns the value of the '<em><b>Volatile</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Volatile</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Volatile</em>' attribute.
	 * @see #setVolatile(boolean)
	 * @see ecore.EcorePackage#getEStructuralFeature_Volatile()
	 * @model default="false" dataType="ecore.EBoolean"
	 * @generated
	 */
	boolean isVolatile();

	/**
	 * Sets the value of the '{@link ecore.EStructuralFeature#isVolatile <em>Volatile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Volatile</em>' attribute.
	 * @see #isVolatile()
	 * @generated
	 */
	void setVolatile(boolean value);

	/**
	 * Returns the value of the '<em><b>EContaining Class</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ecore.EClass#getEStructuralFeatures <em>EStructural Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EContaining Class</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EContaining Class</em>' container reference.
	 * @see #setEContainingClass(EClass)
	 * @see ecore.EcorePackage#getEStructuralFeature_EContainingClass()
	 * @see ecore.EClass#getEStructuralFeatures
	 * @model opposite="eStructuralFeatures"
	 *        annotation="kermeta ecore.isTransient='true'"
	 * @generated
	 */
	EClass getEContainingClass();

	/**
	 * Sets the value of the '{@link ecore.EStructuralFeature#getEContainingClass <em>EContaining Class</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EContaining Class</em>' container reference.
	 * @see #getEContainingClass()
	 * @generated
	 */
	void setEContainingClass(EClass value);

	/**
	 * Returns the value of the '<em><b>Default Value Literal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Value Literal</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value Literal</em>' attribute.
	 * @see #setDefaultValueLiteral(String)
	 * @see ecore.EcorePackage#getEStructuralFeature_DefaultValueLiteral()
	 * @model dataType="ecore.EString"
	 * @generated
	 */
	String getDefaultValueLiteral();

	/**
	 * Sets the value of the '{@link ecore.EStructuralFeature#getDefaultValueLiteral <em>Default Value Literal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value Literal</em>' attribute.
	 * @see #getDefaultValueLiteral()
	 * @generated
	 */
	void setDefaultValueLiteral(String value);

	/**
	 * Returns the value of the '<em><b>Transient</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transient</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transient</em>' attribute.
	 * @see #setTransient(boolean)
	 * @see ecore.EcorePackage#getEStructuralFeature_Transient()
	 * @model default="false" dataType="ecore.EBoolean"
	 * @generated
	 */
	boolean isTransient();

	/**
	 * Sets the value of the '{@link ecore.EStructuralFeature#isTransient <em>Transient</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transient</em>' attribute.
	 * @see #isTransient()
	 * @generated
	 */
	void setTransient(boolean value);

	/**
	 * Returns the value of the '<em><b>Unsettable</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unsettable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unsettable</em>' attribute.
	 * @see #setUnsettable(boolean)
	 * @see ecore.EcorePackage#getEStructuralFeature_Unsettable()
	 * @model default="false" dataType="ecore.EBoolean"
	 * @generated
	 */
	boolean isUnsettable();

	/**
	 * Sets the value of the '{@link ecore.EStructuralFeature#isUnsettable <em>Unsettable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unsettable</em>' attribute.
	 * @see #isUnsettable()
	 * @generated
	 */
	void setUnsettable(boolean value);

	/**
	 * Returns the value of the '<em><b>Derived</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Derived</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Derived</em>' attribute.
	 * @see #setDerived(boolean)
	 * @see ecore.EcorePackage#getEStructuralFeature_Derived()
	 * @model default="false" dataType="ecore.EBoolean"
	 * @generated
	 */
	boolean isDerived();

	/**
	 * Sets the value of the '{@link ecore.EStructuralFeature#isDerived <em>Derived</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Derived</em>' attribute.
	 * @see #isDerived()
	 * @generated
	 */
	void setDerived(boolean value);

	/**
	 * Returns the value of the '<em><b>Changeable</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Changeable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Changeable</em>' attribute.
	 * @see #setChangeable(boolean)
	 * @see ecore.EcorePackage#getEStructuralFeature_Changeable()
	 * @model default="false" dataType="ecore.EBoolean"
	 * @generated
	 */
	boolean isChangeable();

	/**
	 * Sets the value of the '{@link ecore.EStructuralFeature#isChangeable <em>Changeable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Changeable</em>' attribute.
	 * @see #isChangeable()
	 * @generated
	 */
	void setChangeable(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="ecore.EInt"
	 *        annotation="kermeta isAbstract='true'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='java.lang.Integer result = null;\n\nreturn result;\n'"
	 * @generated
	 */
	int getFeatureID();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="ecore.EJavaClass<?>"
	 *        annotation="kermeta isAbstract='true'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='java.lang.Class result = null;\n\nreturn result;\n'"
	 * @generated
	 */
	Class<?> getContainerClass();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="ecore.EJavaObject"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Object result = null;\n\nreturn result;\n'"
	 * @generated
	 */
	Object getterDefaultValue();

} // EStructuralFeature
