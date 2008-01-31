/**
 * <copyright>
 * </copyright>
 *
 * $Id: AbstractCompiler.java,v 1.1 2008-01-31 13:28:18 cfaucher Exp $
 */
package org.kermeta.compiler.model.compiler;

import org.eclipse.emf.codegen.ecore.genmodel.GenModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.kermeta.simk.SIMKModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Compiler</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.compiler.model.compiler.AbstractCompiler#getSimkModel <em>Simk Model</em>}</li>
 *   <li>{@link org.kermeta.compiler.model.compiler.AbstractCompiler#getGenModels <em>Gen Models</em>}</li>
 *   <li>{@link org.kermeta.compiler.model.compiler.AbstractCompiler#getRootGenModel <em>Root Gen Model</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.compiler.model.compiler.CompilerPackage#getAbstractCompiler()
 * @model abstract="true"
 * @generated
 */
public interface AbstractCompiler extends EObject {
	/**
	 * Returns the value of the '<em><b>Simk Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Simk Model</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Simk Model</em>' containment reference.
	 * @see #setSimkModel(SIMKModel)
	 * @see org.kermeta.compiler.model.compiler.CompilerPackage#getAbstractCompiler_SimkModel()
	 * @model containment="true"
	 * @generated
	 */
	SIMKModel getSimkModel();

	/**
	 * Sets the value of the '{@link org.kermeta.compiler.model.compiler.AbstractCompiler#getSimkModel <em>Simk Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Simk Model</em>' containment reference.
	 * @see #getSimkModel()
	 * @generated
	 */
	void setSimkModel(SIMKModel value);

	/**
	 * Returns the value of the '<em><b>Gen Models</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.codegen.ecore.genmodel.GenModel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gen Models</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gen Models</em>' reference list.
	 * @see org.kermeta.compiler.model.compiler.CompilerPackage#getAbstractCompiler_GenModels()
	 * @model
	 * @generated
	 */
	EList<GenModel> getGenModels();

	/**
	 * Returns the value of the '<em><b>Root Gen Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Root Gen Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root Gen Model</em>' reference.
	 * @see #setRootGenModel(GenModel)
	 * @see org.kermeta.compiler.model.compiler.CompilerPackage#getAbstractCompiler_RootGenModel()
	 * @model required="true"
	 * @generated
	 */
	GenModel getRootGenModel();

	/**
	 * Sets the value of the '{@link org.kermeta.compiler.model.compiler.AbstractCompiler#getRootGenModel <em>Root Gen Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root Gen Model</em>' reference.
	 * @see #getRootGenModel()
	 * @generated
	 */
	void setRootGenModel(GenModel value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void run();

} // AbstractCompiler
