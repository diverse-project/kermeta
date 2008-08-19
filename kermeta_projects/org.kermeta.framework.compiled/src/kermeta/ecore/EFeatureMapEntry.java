/**
 * <copyright>
 * </copyright>
 *
 * $Id: EFeatureMapEntry.java,v 1.2 2008-08-19 13:23:04 cfaucher Exp $
 */
package kermeta.ecore;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EFeature Map Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kermeta.ecore.EFeatureMapEntry#getValue <em>Value</em>}</li>
 *   <li>{@link kermeta.ecore.EFeatureMapEntry#getEStructuralFeatureName <em>EStructural Feature Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see kermeta.ecore.EcorePackage#getEFeatureMapEntry()
 * @model annotation="kermeta documentation='/**\r\n * Kermeta representation of EMF EFeatureMapEntry\r\n * it contains the name of the required feature and the actual value\r\n * <img src=\"platform:/plugin/fr.irisa.triskell.kermeta.documentation/src/figures/ecore_compatibility_package.png\"/>\r\n \052/'"
 * @generated
 */
public interface EFeatureMapEntry extends kermeta.language.structure.Object {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(kermeta.language.structure.Object)
	 * @see kermeta.ecore.EcorePackage#getEFeatureMapEntry_Value()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	kermeta.language.structure.Object getValue();

	/**
	 * Sets the value of the '{@link kermeta.ecore.EFeatureMapEntry#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(kermeta.language.structure.Object value);

	/**
	 * Returns the value of the '<em><b>EStructural Feature Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EStructural Feature Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EStructural Feature Name</em>' attribute.
	 * @see #setEStructuralFeatureName(String)
	 * @see kermeta.ecore.EcorePackage#getEFeatureMapEntry_EStructuralFeatureName()
	 * @model dataType="kermeta.standard.JavaString"
	 * @generated
	 */
	String getEStructuralFeatureName();

	/**
	 * Sets the value of the '{@link kermeta.ecore.EFeatureMapEntry#getEStructuralFeatureName <em>EStructural Feature Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EStructural Feature Name</em>' attribute.
	 * @see #getEStructuralFeatureName()
	 * @generated
	 */
	void setEStructuralFeatureName(String value);

} // EFeatureMapEntry
