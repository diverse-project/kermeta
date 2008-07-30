/**
 * <copyright>
 * </copyright>
 *
 * $Id: Singleton.java,v 1.1 2008-07-30 14:08:01 edaubert Exp $
 */
package option;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Singleton</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link option.Singleton#isSingleton <em>Singleton</em>}</li>
 * </ul>
 * </p>
 * 
 * @see option.OptionPackage#getSingleton()
 * @model
 * @generated
 */
public interface Singleton extends SymbolicNameDirective {
	/**
	 * Returns the value of the '<em><b>Singleton</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Singleton</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Singleton</em>' attribute.
	 * @see #setSingleton(boolean)
	 * @see option.OptionPackage#getSingleton_Singleton()
	 * @model dataType="manifest.boolean" required="true"
	 * @generated
	 */
	boolean isSingleton();

	/**
	 * Sets the value of the '{@link option.Singleton#isSingleton <em>Singleton</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Singleton</em>' attribute.
	 * @see #isSingleton()
	 * @generated
	 */
	void setSingleton(boolean value);

} // Singleton
