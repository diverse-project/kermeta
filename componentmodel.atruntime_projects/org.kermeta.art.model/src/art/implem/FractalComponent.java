/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package art.implem;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fractal Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link art.implem.FractalComponent#getControllerDesc <em>Controller Desc</em>}</li>
 *   <li>{@link art.implem.FractalComponent#getContentDesc <em>Content Desc</em>}</li>
 * </ul>
 * </p>
 *
 * @see art.implem.ImplemPackage#getFractalComponent()
 * @model
 * @generated
 */
public interface FractalComponent extends ComponentImplementation {
	/**
	 * Returns the value of the '<em><b>Controller Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Controller Desc</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Controller Desc</em>' attribute.
	 * @see #setControllerDesc(String)
	 * @see art.implem.ImplemPackage#getFractalComponent_ControllerDesc()
	 * @model dataType="art.String" required="true"
	 * @generated
	 */
	String getControllerDesc();

	/**
	 * Sets the value of the '{@link art.implem.FractalComponent#getControllerDesc <em>Controller Desc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Controller Desc</em>' attribute.
	 * @see #getControllerDesc()
	 * @generated
	 */
	void setControllerDesc(String value);

	/**
	 * Returns the value of the '<em><b>Content Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content Desc</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Desc</em>' attribute.
	 * @see #setContentDesc(String)
	 * @see art.implem.ImplemPackage#getFractalComponent_ContentDesc()
	 * @model dataType="art.String" required="true"
	 * @generated
	 */
	String getContentDesc();

	/**
	 * Sets the value of the '{@link art.implem.FractalComponent#getContentDesc <em>Content Desc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Desc</em>' attribute.
	 * @see #getContentDesc()
	 * @generated
	 */
	void setContentDesc(String value);

} // FractalComponent
