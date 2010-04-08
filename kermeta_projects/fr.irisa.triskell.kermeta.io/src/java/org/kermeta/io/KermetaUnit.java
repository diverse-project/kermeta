/**
 * <copyright>
 * </copyright>
 *
 * $Id: KermetaUnit.java,v 1.22 2008-05-28 13:37:13 dvojtise Exp $
 */
package org.kermeta.io;

import java.util.Map;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import antlr.ANTLRException;
import fr.irisa.triskell.kermeta.language.structure.ModelingUnit;
import fr.irisa.triskell.kermeta.language.structure.Require;
import fr.irisa.triskell.kermeta.language.structure.TypeDefinition;
import fr.irisa.triskell.kermeta.language.structure.TypeDefinitionContainer;
import fr.irisa.triskell.kermeta.language.structure.Using;

import fr.irisa.triskell.kermeta.typechecker.TypeCheckerContext;

import fr.irisa.triskell.traceability.helper.Tracer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Kermeta Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * a KermetaUnit is a representation of a file that can be loaded as kermeta code.
 * It can be kmt (kermeta textual syntax), km (kermeta mode), ecore, or java jar
 * It deals with various concerns like : file requirement (dependencies), syntax shortcut (using),
 *    traces, 
 * and provides some useful functions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.io.KermetaUnit#getUri <em>Uri</em>}</li>
 *   <li>{@link org.kermeta.io.KermetaUnit#getModelingUnit <em>Modeling Unit</em>}</li>
 *   <li>{@link org.kermeta.io.KermetaUnit#getInternalPackageEntries <em>Internal Package Entries</em>}</li>
 *   <li>{@link org.kermeta.io.KermetaUnit#getExternalPackageEntries <em>External Package Entries</em>}</li>
 *   <li>{@link org.kermeta.io.KermetaUnit#getImportedKermetaUnits <em>Imported Kermeta Units</em>}</li>
 *   <li>{@link org.kermeta.io.KermetaUnit#getBuildingState <em>Building State</em>}</li>
 *   <li>{@link org.kermeta.io.KermetaUnit#getMessages <em>Messages</em>}</li>
 *   <li>{@link org.kermeta.io.KermetaUnit#isNeedASTTraces <em>Need AST Traces</em>}</li>
 *   <li>{@link org.kermeta.io.KermetaUnit#isTypeChecked <em>Type Checked</em>}</li>
 *   <li>{@link org.kermeta.io.KermetaUnit#isFramework <em>Framework</em>}</li>
 *   <li>{@link org.kermeta.io.KermetaUnit#getTracer <em>Tracer</em>}</li>
 *   <li>{@link org.kermeta.io.KermetaUnit#isConstraintChecked <em>Constraint Checked</em>}</li>
 *   <li>{@link org.kermeta.io.KermetaUnit#isIsBeingTypechecked <em>Is Being Typechecked</em>}</li>
 *   <li>{@link org.kermeta.io.KermetaUnit#getTypeDefinitionCache <em>Type Definition Cache</em>}</li>
 *   <li>{@link org.kermeta.io.KermetaUnit#getKermetaUnitRequires <em>Kermeta Unit Requires</em>}</li>
 *   <li>{@link org.kermeta.io.KermetaUnit#isLocked <em>Locked</em>}</li>
 *   <li>{@link org.kermeta.io.KermetaUnit#getTypeCheckerContext <em>Type Checker Context</em>}</li>
 *   <li>{@link org.kermeta.io.KermetaUnit#getAllImportedKermetaUnitsCache <em>All Imported Kermeta Units Cache</em>}</li>
 *   <li>{@link org.kermeta.io.KermetaUnit#getTypeDefinitionContextsCache <em>Type Definition Contexts Cache</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.io.IoPackage#getKermetaUnit()
 * @model
 * @generated
 */
public interface KermetaUnit extends EObject {
	
	/**
	 * 
	 * @generated NOT
	 */
	final static public Logger internalLog = LoggerFactory.getLogger("Kermeta Unit");
	
	/**
	 * Returns the value of the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * URI of the unit. Ie. name of the file that was loaded
	 * <!-- end-model-doc -->
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
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imported Kermeta Units</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imported Kermeta Units</em>' reference list.
	 * @see org.kermeta.io.IoPackage#getKermetaUnit_ImportedKermetaUnits()
	 * @model
	 * @generated
	 */
	EList<KermetaUnit> getImportedKermetaUnits();

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
	 * Returns the value of the '<em><b>Aspects</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aspects</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aspects</em>' attribute.
	 * @see #setAspects(Map)
	 * @see org.kermeta.io.IoPackage#getKermetaUnit_Aspects()
	 * @model transient="true"
	 * @generated
	 */
	// Map<TypeDefinition, EList<TypeDefinition>> getAspects();

	/**
	 * Sets the value of the '{@link org.kermeta.io.KermetaUnit#getAspects <em>Aspects</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aspects</em>' attribute.
	 * @see #getAspects()
	 * @generated
	 */
	 // void setAspects(Map<TypeDefinition, EList<TypeDefinition>> value);

	/**
	 * Returns the value of the '<em><b>Is Being Typechecked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Being Typechecked</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Being Typechecked</em>' attribute.
	 * @see #setIsBeingTypechecked(boolean)
	 * @see org.kermeta.io.IoPackage#getKermetaUnit_IsBeingTypechecked()
	 * @model
	 * @generated
	 */
	boolean isIsBeingTypechecked();

	/**
	 * Sets the value of the '{@link org.kermeta.io.KermetaUnit#isIsBeingTypechecked <em>Is Being Typechecked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Being Typechecked</em>' attribute.
	 * @see #isIsBeingTypechecked()
	 * @generated
	 */
	void setIsBeingTypechecked(boolean value);

	/**
	 * Returns the value of the '<em><b>Type Definition Cache</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.kermeta.io.TypeDefinitionCache#getKermetaUnit <em>Kermeta Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Definition Cache</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Definition Cache</em>' reference.
	 * @see #setTypeDefinitionCache(TypeDefinitionCache)
	 * @see org.kermeta.io.IoPackage#getKermetaUnit_TypeDefinitionCache()
	 * @see org.kermeta.io.TypeDefinitionCache#getKermetaUnit
	 * @model opposite="kermetaUnit" required="true"
	 * @generated
	 */
	TypeDefinitionCache getTypeDefinitionCache();

	/**
	 * Sets the value of the '{@link org.kermeta.io.KermetaUnit#getTypeDefinitionCache <em>Type Definition Cache</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Definition Cache</em>' reference.
	 * @see #getTypeDefinitionCache()
	 * @generated
	 */
	void setTypeDefinitionCache(TypeDefinitionCache value);

	/**
	 * Returns the value of the '<em><b>Kermeta Unit Requires</b></em>' reference list.
	 * The list contents are of type {@link org.kermeta.io.KermetaUnitRequire}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kermeta Unit Requires</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kermeta Unit Requires</em>' reference list.
	 * @see org.kermeta.io.IoPackage#getKermetaUnit_KermetaUnitRequires()
	 * @model
	 * @generated
	 */
	EList<KermetaUnitRequire> getKermetaUnitRequires();

	/**
	 * Returns the value of the '<em><b>Locked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Locked</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Locked</em>' attribute.
	 * @see #setLocked(boolean)
	 * @see org.kermeta.io.IoPackage#getKermetaUnit_Locked()
	 * @model
	 * @generated
	 */
	boolean isLocked();

	/**
	 * Sets the value of the '{@link org.kermeta.io.KermetaUnit#isLocked <em>Locked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Locked</em>' attribute.
	 * @see #isLocked()
	 * @generated
	 */
	void setLocked(boolean value);

	/**
	 * Returns the value of the '<em><b>Base Aspects</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Aspects</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Aspects</em>' attribute.
	 * @see #setBaseAspects(Map)
	 * @see org.kermeta.io.IoPackage#getKermetaUnit_BaseAspects()
	 * @model transient="true"
	 * @generated
	 */
//	Map<TypeDefinition, EList<TypeDefinition>> getBaseAspects();

	/**
	 * Sets the value of the '{@link org.kermeta.io.KermetaUnit#getBaseAspects <em>Base Aspects</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Aspects</em>' attribute.
	 * @see #getBaseAspects()
	 * @generated
	 */
//	void setBaseAspects(Map<TypeDefinition, EList<TypeDefinition>> value);

	/**
	 * Returns the value of the '<em><b>Type Checker Context</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Checker Context</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Checker Context</em>' attribute.
	 * @see #setTypeCheckerContext(TypeCheckerContext)
	 * @see org.kermeta.io.IoPackage#getKermetaUnit_TypeCheckerContext()
	 * @model dataType="org.kermeta.io.TypeCheckerContext" transient="true"
	 * @generated
	 */
	TypeCheckerContext getTypeCheckerContext();

	/**
	 * Sets the value of the '{@link org.kermeta.io.KermetaUnit#getTypeCheckerContext <em>Type Checker Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Checker Context</em>' attribute.
	 * @see #getTypeCheckerContext()
	 * @generated
	 */
	void setTypeCheckerContext(TypeCheckerContext value);

	/**
	 * Returns the value of the '<em><b>All Imported Kermeta Units Cache</b></em>' reference list.
	 * The list contents are of type {@link org.kermeta.io.KermetaUnit}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Should not be used directly. 
	 * This cache is filled and used by the KermetaUnitHelper.getAllImportedUnit
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>All Imported Kermeta Units Cache</em>' reference list.
	 * @see org.kermeta.io.IoPackage#getKermetaUnit_AllImportedKermetaUnitsCache()
	 * @model
	 * @generated
	 */
	EList<KermetaUnit> getAllImportedKermetaUnitsCache();

	/**
	 * Returns the value of the '<em><b>Type Definition Contexts Cache</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Definition Contexts Cache</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Definition Contexts Cache</em>' attribute.
	 * @see #setTypeDefinitionContextsCache(Map)
	 * @see org.kermeta.io.IoPackage#getKermetaUnit_TypeDefinitionContextsCache()
	 * @model transient="true"
	 * @generated
	 */
	Map<String, TypeDefinitionContext> getTypeDefinitionContextsCache();

	/**
	 * Sets the value of the '{@link org.kermeta.io.KermetaUnit#getTypeDefinitionContextsCache <em>Type Definition Contexts Cache</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Definition Contexts Cache</em>' attribute.
	 * @see #getTypeDefinitionContextsCache()
	 * @generated
	 */
	void setTypeDefinitionContextsCache(Map<String, TypeDefinitionContext> value);

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
	 * <!-- begin-model-doc -->
	 * Creates a new "Require" object from a simple String URI and adds it to the model
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	Require addRequire(String uri, KermetaUnit kermetaUnit);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creates a new "Using" object from a simple String and adds it to the model
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	Using addUsing(String qualifiedName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns a list of the "Requires" object as a list of String. 
	 * If you need the real "Requires" object, please navigate the model.
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<String> getRequires();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model recursiveRequired="true"
	 * @generated
	 */
	void importKermetaUnit(KermetaUnit value, boolean force, boolean recursive);

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
	 * @model nameDataType="fr.irisa.triskell.kermeta.language.structure.String"
	 * @generated
	 */
	TypeDefinition getInternalTypeDefinitionByName(String name);

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
	 * <!-- begin-model-doc -->
	 * Returns a list of the "Usings" object as a list of String. 
	 * If you need the real "Usings" object, please navigate the model.
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<String> getUsings();

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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	fr.irisa.triskell.kermeta.language.structure.Package addInternalPackage(String qualifiedName, String uri);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns true if the unit contains error(s)
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isErroneous();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Return a list of all the Packages qualified names (internal and external), usefull in order to use getPackage(String)
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<String> getUniquePackageQualifiedNames();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void addTypeDefinition(TypeDefinition typeDefinition, TypeDefinitionContainer container);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model monitorDataType="org.kermeta.io.IProgressMonitor"
	 * @generated
	 */
	TypeDefinition getTypeDefinitionByName(String name, IProgressMonitor monitor);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model monitorDataType="org.kermeta.io.IProgressMonitor"
	 * @generated
	 */
	TypeDefinition getTypeDefinitionByQualifiedName(String qualifiedName, IProgressMonitor monitor);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns true if the unit contains error(s)
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isIndirectlyErroneous();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void lock();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void unlock();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	KermetaUnit copy();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void fillTypeDefinitionCache();

} // KermetaUnit
