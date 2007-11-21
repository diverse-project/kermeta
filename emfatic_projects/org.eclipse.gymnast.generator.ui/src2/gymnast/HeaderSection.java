/**
 * <copyright>
 * </copyright>
 *
 * $Id: HeaderSection.java,v 1.1 2007-11-21 10:22:22 ftanguy Exp $
 */
package gymnast;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Header Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gymnast.HeaderSection#getName <em>Name</em>}</li>
 *   <li>{@link gymnast.HeaderSection#getOptionsSection <em>Options Section</em>}</li>
 * </ul>
 * </p>
 *
 * @see gymnast.gymnastPackage#getHeaderSection()
 * @model
 * @generated
 */
public interface HeaderSection extends GymnastEASTNode {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see gymnast.gymnastPackage#getHeaderSection_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link gymnast.HeaderSection#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Options Section</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Options Section</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Options Section</em>' reference.
	 * @see #setOptionsSection(OptionsSection)
	 * @see gymnast.gymnastPackage#getHeaderSection_OptionsSection()
	 * @model
	 * @generated
	 */
	OptionsSection getOptionsSection();

	/**
	 * Sets the value of the '{@link gymnast.HeaderSection#getOptionsSection <em>Options Section</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Options Section</em>' reference.
	 * @see #getOptionsSection()
	 * @generated
	 */
	void setOptionsSection(OptionsSection value);

} // HeaderSection
