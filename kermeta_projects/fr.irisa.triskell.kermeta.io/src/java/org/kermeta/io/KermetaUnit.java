/**
 * <copyright>
 * </copyright>
 *
 * $Id: KermetaUnit.java,v 1.5 2007-08-02 13:09:01 dvojtise Exp $
 */
package org.kermeta.io;

import java.util.List;
import java.util.Set;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import antlr.ANTLRException;
import fr.irisa.triskell.kermeta.language.structure.ModelingUnit;
import fr.irisa.triskell.kermeta.language.structure.Require;
import fr.irisa.triskell.kermeta.language.structure.TypeDefinition;
import fr.irisa.triskell.kermeta.language.structure.Using;
import fr.irisa.triskell.kermeta.util.LogConfigurationHelper;
import fr.irisa.triskell.traceability.helper.Tracer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Kermeta Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.io.KermetaUnit#getStorer <em>Storer</em>}</li>
 *   <li>{@link org.kermeta.io.KermetaUnit#getUri <em>Uri</em>}</li>
 *   <li>{@link org.kermeta.io.KermetaUnit#getModelingUnit <em>Modeling Unit</em>}</li>
 *   <li>{@link org.kermeta.io.KermetaUnit#getInternalPackageEntries <em>Internal Package Entries</em>}</li>
 *   <li>{@link org.kermeta.io.KermetaUnit#getExternalPackageEntries <em>External Package Entries</em>}</li>
 *   <li>{@link org.kermeta.io.KermetaUnit#getImportedKermetaUnits <em>Imported Kermeta Units</em>}</li>
 *   <li>{@link org.kermeta.io.KermetaUnit#getImporters <em>Importers</em>}</li>
 *   <li>{@link org.kermeta.io.KermetaUnit#getBuildingState <em>Building State</em>}</li>
 *   <li>{@link org.kermeta.io.KermetaUnit#getMessages <em>Messages</em>}</li>
 *   <li>{@link org.kermeta.io.KermetaUnit#isNeedASTTraces <em>Need AST Traces</em>}</li>
 *   <li>{@link org.kermeta.io.KermetaUnit#isTypeChecked <em>Type Checked</em>}</li>
 *   <li>{@link org.kermeta.io.KermetaUnit#isFramework <em>Framework</em>}</li>
 *   <li>{@link org.kermeta.io.KermetaUnit#getTracer <em>Tracer</em>}</li>
 *   <li>{@link org.kermeta.io.KermetaUnit#isConstraintChecked <em>Constraint Checked</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.io.IoPackage#getKermetaUnit()
 * @model
 * @generated
 */
public interface KermetaUnit extends EObject {
	
	/**
	 * The default value of the '{@link #getUri() <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUri()
	 * @generated NOT
	 * @ordered
	 */
    final static public Logger internalLog = LogConfigurationHelper.getLogger("KermetaUnit");
	
	
	/**
	 * Returns the value of the '<em><b>Storer</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.kermeta.io.KermetaUnitStorer#getKermetaUnits <em>Kermeta Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Storer</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Storer</em>' container reference.
	 * @see #setStorer(KermetaUnitStorer)
	 * @see org.kermeta.io.IoPackage#getKermetaUnit_Storer()
	 * @see org.kermeta.io.KermetaUnitStorer#getKermetaUnits
	 * @model opposite="kermetaUnits" required="true" transient="false"
	 * @generated
	 */
	KermetaUnitStorer getStorer();

	/**
	 * Sets the value of the '{@link org.kermeta.io.KermetaUnit#getStorer <em>Storer</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Storer</em>' container reference.
	 * @see #getStorer()
	 * @generated
	 */
	void setStorer(KermetaUnitStorer value);

	/**
	 * Returns the value of the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uri</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uri</em>' attribute.
	 * @see #setUri(String)
	 * @see org.kermeta.io.IoPackage#getKermetaUnit_Uri()
	 * @model
	 * @generated
	 */
	String getUri();

	/**
	 * Sets the value of the '{@link org.kermeta.io.KermetaUnit#getUri <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uri</em>' attribute.
	 * @see #getUri()
	 * @generated
	 */
	void setUri(String value);

	/**
	 * Returns the value of the '<em><b>Modeling Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modeling Unit</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modeling Unit</em>' reference.
	 * @see #setModelingUnit(ModelingUnit)
	 * @see org.kermeta.io.IoPackage#getKermetaUnit_ModelingUnit()
	 * @model required="true"
	 * @generated
	 */
	ModelingUnit getModelingUnit();

	/**
	 * Sets the value of the '{@link org.kermeta.io.KermetaUnit#getModelingUnit <em>Modeling Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modeling Unit</em>' reference.
	 * @see #getModelingUnit()
	 * @generated
	 */
	void setModelingUnit(ModelingUnit value);

	/**
	 * Returns the value of the '<em><b>Internal Package Entries</b></em>' reference list.
	 * The list contents are of type {@link org.kermeta.io.PackageEntry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Internal Package Entries</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internal Package Entries</em>' reference list.
	 * @see org.kermeta.io.IoPackage#getKermetaUnit_InternalPackageEntries()
	 * @model
	 * @generated
	 */
	EList<PackageEntry> getInternalPackageEntries();

	/**
	 * Returns the value of the '<em><b>External Package Entries</b></em>' reference list.
	 * The list contents are of type {@link org.kermeta.io.PackageEntry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>External Package Entries</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External Package Entries</em>' reference list.
	 * @see org.kermeta.io.IoPackage#getKermetaUnit_ExternalPackageEntries()
	 * @model
	 * @generated
	 */
	EList<PackageEntry> getExternalPackageEntries();

	/**
	 * Returns the value of the '<em><b>Imported Kermeta Units</b></em>' reference list.
	 * The list contents are of type {@link org.kermeta.io.KermetaUnit}.
	 * It is bidirectional and its opposite is '{@link org.kermeta.io.KermetaUnit#getImporters <em>Importers</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imported Kermeta Units</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imported Kermeta Units</em>' reference list.
	 * @see org.kermeta.io.IoPackage#getKermetaUnit_ImportedKermetaUnits()
	 * @see org.kermeta.io.KermetaUnit#getImporters
	 * @model opposite="importers"
	 * @generated
	 */
	EList<KermetaUnit> getImportedKermetaUnits();

	/**
	 * Returns the value of the '<em><b>Importers</b></em>' reference list.
	 * The list contents are of type {@link org.kermeta.io.KermetaUnit}.
	 * It is bidirectional and its opposite is '{@link org.kermeta.io.KermetaUnit#getImportedKermetaUnits <em>Imported Kermeta Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Importers</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Importers</em>' reference list.
	 * @see org.kermeta.io.IoPackage#getKermetaUnit_Importers()
	 * @see org.kermeta.io.KermetaUnit#getImportedKermetaUnits
	 * @model opposite="importedKermetaUnits"
	 * @generated
	 */
	EList<KermetaUnit> getImporters();

	/**
	 * Returns the value of the '<em><b>Building State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Building State</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Building State</em>' reference.
	 * @see #setBuildingState(IBuildingState)
	 * @see org.kermeta.io.IoPackage#getKermetaUnit_BuildingState()
	 * @model required="true"
	 * @generated
	 */
	IBuildingState getBuildingState();

	/**
	 * Sets the value of the '{@link org.kermeta.io.KermetaUnit#getBuildingState <em>Building State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Building State</em>' reference.
	 * @see #getBuildingState()
	 * @generated
	 */
	void setBuildingState(IBuildingState value);

	/**
	 * Returns the value of the '<em><b>Messages</b></em>' reference list.
	 * The list contents are of type {@link org.kermeta.io.Message}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Messages</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Messages</em>' reference list.
	 * @see org.kermeta.io.IoPackage#getKermetaUnit_Messages()
	 * @model
	 * @generated
	 */
	EList<Message> getMessages();

	/**
	 * Returns the value of the '<em><b>Need AST Traces</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Need AST Traces</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Need AST Traces</em>' attribute.
	 * @see #setNeedASTTraces(boolean)
	 * @see org.kermeta.io.IoPackage#getKermetaUnit_NeedASTTraces()
	 * @model
	 * @generated
	 */
	boolean isNeedASTTraces();

	/**
	 * Sets the value of the '{@link org.kermeta.io.KermetaUnit#isNeedASTTraces <em>Need AST Traces</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Need AST Traces</em>' attribute.
	 * @see #isNeedASTTraces()
	 * @generated
	 */
	void setNeedASTTraces(boolean value);

	/**
	 * Returns the value of the '<em><b>Type Checked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Checked</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Checked</em>' attribute.
	 * @see #setTypeChecked(boolean)
	 * @see org.kermeta.io.IoPackage#getKermetaUnit_TypeChecked()
	 * @model required="true"
	 * @generated
	 */
	boolean isTypeChecked();

	/**
	 * Sets the value of the '{@link org.kermeta.io.KermetaUnit#isTypeChecked <em>Type Checked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Checked</em>' attribute.
	 * @see #isTypeChecked()
	 * @generated
	 */
	void setTypeChecked(boolean value);

	/**
	 * Returns the value of the '<em><b>Framework</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Framework</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Framework</em>' attribute.
	 * @see #setFramework(boolean)
	 * @see org.kermeta.io.IoPackage#getKermetaUnit_Framework()
	 * @model
	 * @generated
	 */
	boolean isFramework();

	/**
	 * Sets the value of the '{@link org.kermeta.io.KermetaUnit#isFramework <em>Framework</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Framework</em>' attribute.
	 * @see #isFramework()
	 * @generated
	 */
	void setFramework(boolean value);

	/**
	 * Returns the value of the '<em><b>Tracer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tracer</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tracer</em>' attribute.
	 * @see #setTracer(Tracer)
	 * @see org.kermeta.io.IoPackage#getKermetaUnit_Tracer()
	 * @model dataType="org.kermeta.io.Tracer"
	 * @generated
	 */
	Tracer getTracer();

	/**
	 * Sets the value of the '{@link org.kermeta.io.KermetaUnit#getTracer <em>Tracer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tracer</em>' attribute.
	 * @see #getTracer()
	 * @generated
	 */
	void setTracer(Tracer value);

	/**
	 * Returns the value of the '<em><b>Constraint Checked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraint Checked</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraint Checked</em>' attribute.
	 * @see #setConstraintChecked(boolean)
	 * @see org.kermeta.io.IoPackage#getKermetaUnit_ConstraintChecked()
	 * @model required="true"
	 * @generated
	 */
	boolean isConstraintChecked();

	/**
	 * Sets the value of the '{@link org.kermeta.io.KermetaUnit#isConstraintChecked <em>Constraint Checked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constraint Checked</em>' attribute.
	 * @see #isConstraintChecked()
	 * @generated
	 */
	void setConstraintChecked(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void load();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	fr.irisa.triskell.kermeta.language.structure.Package addInternalPackage(String qualifiedName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	fr.irisa.triskell.kermeta.language.structure.Package findInternalpackage(String qualifiedName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Require addRequire(String uri);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Using addUsing(String qualifiedName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="org.kermeta.io.Set"
	 * @generated
	 */
	Set getRequires();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void importKermetaUnit(KermetaUnit value, boolean force);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void addExternalPackage(fr.irisa.triskell.kermeta.language.structure.Package p);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<fr.irisa.triskell.kermeta.language.structure.Package> getPackages();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<fr.irisa.triskell.kermeta.language.structure.Package> getInternalPackages();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<fr.irisa.triskell.kermeta.language.structure.Package> getExternalPackages();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	TypeDefinition getTypeDefinitionByName(String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	TypeDefinition getTypeDefinitionByQualifiedName(String qualifiedName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EList<fr.irisa.triskell.kermeta.language.structure.Package> getPackages(String qualifiedName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	fr.irisa.triskell.kermeta.language.structure.Package getInternalPackage(String qualifiedName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EList<fr.irisa.triskell.kermeta.language.structure.Package> getExternalPackage(String qualifiedName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String print();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isLoading();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void error(String message);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void warning(String message);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isErrored();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void storeTrace(fr.irisa.triskell.kermeta.language.structure.Object modelElement, Object node);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	fr.irisa.triskell.kermeta.language.structure.Object getModelElementByNode(Object node);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Object getNodeByModelElement(fr.irisa.triskell.kermeta.language.structure.Object modelElement);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="org.kermeta.io.Set"
	 * @generated
	 */
	Set getUsings();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void error(String message, Object target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isWarned();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptionDataType="org.kermeta.io.ANTLRException"
	 * @generated
	 */
	void parsingError(ANTLRException exception);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void warning(String message, Object target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void finalize();

} // KermetaUnit