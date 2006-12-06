/**
 * <copyright>
 * </copyright>
 *
 * $Id: Model.java,v 1.2 2006-12-06 16:22:58 dvojtise Exp $
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
	 * @model type="fr.irisa.triskell.kermeta.language.structure.Object" changeable="false"
	 * @generated
	 */
	EList getContents();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model type="fr.irisa.triskell.kermeta.language.structure.Object"
	 * @generated
	 */
	EList filter(Type typeName);

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