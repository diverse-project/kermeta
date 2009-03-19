/**
 * <copyright>
 * </copyright>
 *
 * $Id: SourcePosition.java,v 1.1 2007/02/14 20:38:02 barais Exp $
 */
package emf.spoon.reflect.declaration;

import java.io.File;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Source Position</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link emf.spoon.reflect.declaration.SourcePosition#getLine <em>Line</em>}</li>
 *   <li>{@link emf.spoon.reflect.declaration.SourcePosition#getColumn <em>Column</em>}</li>
 *   <li>{@link emf.spoon.reflect.declaration.SourcePosition#getFile <em>File</em>}</li>
 * </ul>
 * </p>
 *
 * @see emf.spoon.reflect.declaration.DeclarationPackage#getSourcePosition()
 * @model
 * @generated
 */
public interface SourcePosition extends EObject, spoon.reflect.cu.SourcePosition {
	/**
	 * Returns the value of the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Line</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line</em>' attribute.
	 * @see emf.spoon.reflect.declaration.DeclarationPackage#getSourcePosition_Line()
	 * @model dataType="emf.spoon.Integer" changeable="false"
	 * @generated
	 */
	int getLine();

	/**
	 * Returns the value of the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Column</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column</em>' attribute.
	 * @see emf.spoon.reflect.declaration.DeclarationPackage#getSourcePosition_Column()
	 * @model dataType="emf.spoon.Integer" changeable="false"
	 * @generated
	 */
	int getColumn();

	/**
	 * Returns the value of the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>File</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File</em>' attribute.
	 * @see emf.spoon.reflect.declaration.DeclarationPackage#getSourcePosition_File()
	 * @model dataType="emf.spoon.File" changeable="false"
	 * @generated
	 */
	File getFile();

} // SourcePosition