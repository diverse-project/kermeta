/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.tm.elibel.smartqvt.qvt.qvtoperational;

import fr.tm.elibel.smartqvt.qvt.emof.Element;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Module Import</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.tm.elibel.smartqvt.qvt.qvtoperational.ModuleImport#getBinding <em>Binding</em>}</li>
 *   <li>{@link fr.tm.elibel.smartqvt.qvt.qvtoperational.ModuleImport#getImportedModule <em>Imported Module</em>}</li>
 *   <li>{@link fr.tm.elibel.smartqvt.qvt.qvtoperational.ModuleImport#getKind <em>Kind</em>}</li>
 *   <li>{@link fr.tm.elibel.smartqvt.qvt.qvtoperational.ModuleImport#getModule <em>Module</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.QvtoperationalPackage#getModuleImport()
 * @model
 * @generated
 */
public interface ModuleImport extends Element {
	/**
	 * Returns the value of the '<em><b>Binding</b></em>' reference list.
	 * The list contents are of type {@link fr.tm.elibel.smartqvt.qvt.qvtoperational.ModelType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Binding</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binding</em>' reference list.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.QvtoperationalPackage#getModuleImport_Binding()
	 * @model type="fr.tm.elibel.smartqvt.qvt.qvtoperational.ModelType"
	 * @generated
	 */
	EList getBinding();

	/**
	 * Returns the value of the '<em><b>Imported Module</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imported Module</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imported Module</em>' reference.
	 * @see #setImportedModule(Module)
	 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.QvtoperationalPackage#getModuleImport_ImportedModule()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Module getImportedModule();

	/**
	 * Sets the value of the '{@link fr.tm.elibel.smartqvt.qvt.qvtoperational.ModuleImport#getImportedModule <em>Imported Module</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Imported Module</em>' reference.
	 * @see #getImportedModule()
	 * @generated
	 */
	void setImportedModule(Module value);

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link fr.tm.elibel.smartqvt.qvt.qvtoperational.ImportKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.ImportKind
	 * @see #setKind(ImportKind)
	 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.QvtoperationalPackage#getModuleImport_Kind()
	 * @model
	 * @generated
	 */
	ImportKind getKind();

	/**
	 * Sets the value of the '{@link fr.tm.elibel.smartqvt.qvt.qvtoperational.ModuleImport#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.ImportKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(ImportKind value);

	/**
	 * Returns the value of the '<em><b>Module</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fr.tm.elibel.smartqvt.qvt.qvtoperational.Module#getModuleImport <em>Module Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Module</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Module</em>' container reference.
	 * @see #setModule(Module)
	 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.QvtoperationalPackage#getModuleImport_Module()
	 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.Module#getModuleImport
	 * @model opposite="moduleImport" ordered="false"
	 * @generated
	 */
	Module getModule();

	/**
	 * Sets the value of the '{@link fr.tm.elibel.smartqvt.qvt.qvtoperational.ModuleImport#getModule <em>Module</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Module</em>' container reference.
	 * @see #getModule()
	 * @generated
	 */
	void setModule(Module value);

} // ModuleImport
