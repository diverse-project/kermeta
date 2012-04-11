/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package alfDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Accept Clause</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link alfDsl.AcceptClause#getName <em>Name</em>}</li>
 *   <li>{@link alfDsl.AcceptClause#getQualifiedNameList <em>Qualified Name List</em>}</li>
 * </ul>
 * </p>
 *
 * @see alfDsl.AlfDslPackage#getAcceptClause()
 * @model
 * @generated
 */
public interface AcceptClause extends EObject {
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
	 * @see alfDsl.AlfDslPackage#getAcceptClause_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link alfDsl.AcceptClause#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Qualified Name List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qualified Name List</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualified Name List</em>' containment reference.
	 * @see #setQualifiedNameList(QualifiedNameList)
	 * @see alfDsl.AlfDslPackage#getAcceptClause_QualifiedNameList()
	 * @model containment="true"
	 * @generated
	 */
	QualifiedNameList getQualifiedNameList();

	/**
	 * Sets the value of the '{@link alfDsl.AcceptClause#getQualifiedNameList <em>Qualified Name List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qualified Name List</em>' containment reference.
	 * @see #getQualifiedNameList()
	 * @generated
	 */
	void setQualifiedNameList(QualifiedNameList value);

} // AcceptClause
