/**
 * <copyright>
 * </copyright>
 *
 * $Id: Model.java,v 1.3 2007-07-11 14:41:51 cfaucher Exp $
 */
package fr.irisa.triskell.kermeta.language.structure;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.irisa.triskell.kermeta.language.structure.Model#getContents <em>Contents</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.irisa.triskell.kermeta.language.structure.StructurePackage#getModel()
 * @model
 * @generated
 */
public interface Model extends fr.irisa.triskell.kermeta.language.structure.Object {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "IRISA / INRIA / Universite de Rennes 1";

	/**
	 * Returns the value of the '<em><b>Contents</b></em>' reference list.
	 * The list contents are of type {@link fr.irisa.triskell.kermeta.language.structure.Object}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contents</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contents</em>' reference list.
	 * @see fr.irisa.triskell.kermeta.language.structure.StructurePackage#getModel_Contents()
	 * @model changeable="false"
	 * @generated
	 */
	EList<fr.irisa.triskell.kermeta.language.structure.Object> getContents();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EList<fr.irisa.triskell.kermeta.language.structure.Object> filter(Type typeName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void add(fr.irisa.triskell.kermeta.language.structure.Object obj);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void remove(fr.irisa.triskell.kermeta.language.structure.Object obj);

} // Model