/**
 * <copyright>
 * </copyright>
 *
 * $Id: KermetaUnitImpl.java,v 1.13 2007-08-21 12:55:36 dvojtise Exp $
 */
package org.kermeta.io.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.BasicEMap;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.kermeta.io.ErrorMessage;
import org.kermeta.io.IBuildingState;
import org.kermeta.io.IoFactory;
import org.kermeta.io.IoPackage;
import org.kermeta.io.KermetaUnit;
import org.kermeta.io.KermetaUnitStorer;
import org.kermeta.io.Message;
import org.kermeta.io.PackageEntry;
import org.kermeta.io.ParsingError;
import org.kermeta.io.WarningMessage;
import org.kermeta.io.plugin.IOPlugin;
import org.kermeta.io.printer.KM2KMTPrettyPrinter;

import antlr.ANTLRException;
import antlr.MismatchedTokenException;
import antlr.NoViableAltException;
import antlr.TokenStreamRecognitionException;

import com.ibm.eclipse.ldt.core.ast.ASTNode;

import fr.irisa.triskell.kermeta.language.structure.ModelingUnit;
import fr.irisa.triskell.kermeta.language.structure.Package;
import fr.irisa.triskell.kermeta.language.structure.Require;
import fr.irisa.triskell.kermeta.language.structure.StructureFactory;
import fr.irisa.triskell.kermeta.language.structure.TypeDefinition;
import fr.irisa.triskell.kermeta.language.structure.Using;
import fr.irisa.triskell.kermeta.modelhelper.KermetaUnitHelper;
import fr.irisa.triskell.kermeta.modelhelper.NamedElementHelper;
import fr.irisa.triskell.traceability.helper.Tracer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Kermeta Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.kermeta.io.impl.KermetaUnitImpl#getStorer <em>Storer</em>}</li>
 *   <li>{@link org.kermeta.io.impl.KermetaUnitImpl#getUri <em>Uri</em>}</li>
 *   <li>{@link org.kermeta.io.impl.KermetaUnitImpl#getModelingUnit <em>Modeling Unit</em>}</li>
 *   <li>{@link org.kermeta.io.impl.KermetaUnitImpl#getInternalPackageEntries <em>Internal Package Entries</em>}</li>
 *   <li>{@link org.kermeta.io.impl.KermetaUnitImpl#getExternalPackageEntries <em>External Package Entries</em>}</li>
 *   <li>{@link org.kermeta.io.impl.KermetaUnitImpl#getImportedKermetaUnits <em>Imported Kermeta Units</em>}</li>
 *   <li>{@link org.kermeta.io.impl.KermetaUnitImpl#getImporters <em>Importers</em>}</li>
 *   <li>{@link org.kermeta.io.impl.KermetaUnitImpl#getBuildingState <em>Building State</em>}</li>
 *   <li>{@link org.kermeta.io.impl.KermetaUnitImpl#getMessages <em>Messages</em>}</li>
 *   <li>{@link org.kermeta.io.impl.KermetaUnitImpl#isNeedASTTraces <em>Need AST Traces</em>}</li>
 *   <li>{@link org.kermeta.io.impl.KermetaUnitImpl#isTypeChecked <em>Type Checked</em>}</li>
 *   <li>{@link org.kermeta.io.impl.KermetaUnitImpl#isFramework <em>Framework</em>}</li>
 *   <li>{@link org.kermeta.io.impl.KermetaUnitImpl#getTracer <em>Tracer</em>}</li>
 *   <li>{@link org.kermeta.io.impl.KermetaUnitImpl#isConstraintChecked <em>Constraint Checked</em>}</li>
 *   <li>{@link org.kermeta.io.impl.KermetaUnitImpl#getAspects <em>Aspects</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class KermetaUnitImpl extends EObjectImpl implements KermetaUnit {
	
	
	/**
	 * The default value of the '{@link #getUri() <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUri()
	 * @generated
	 * @ordered
	 */
	protected static final String URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUri() <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUri()
	 * @generated
	 * @ordered
	 */
	protected String uri = URI_EDEFAULT;

	/**
	 * The cached value of the '{@link #getModelingUnit() <em>Modeling Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelingUnit()
	 * @generated
	 * @ordered
	 */
	protected ModelingUnit modelingUnit;

	/**
	 * The cached value of the '{@link #getInternalPackageEntries() <em>Internal Package Entries</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalPackageEntries()
	 * @generated
	 * @ordered
	 */
	protected EList<PackageEntry> internalPackageEntries;

	/**
	 * The cached value of the '{@link #getExternalPackageEntries() <em>External Package Entries</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalPackageEntries()
	 * @generated
	 * @ordered
	 */
	protected EList<PackageEntry> externalPackageEntries;

	/**
	 * The cached value of the '{@link #getImportedKermetaUnits() <em>Imported Kermeta Units</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportedKermetaUnits()
	 * @generated
	 * @ordered
	 */
	protected EList<KermetaUnit> importedKermetaUnits;

	/**
	 * The cached value of the '{@link #getImporters() <em>Importers</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImporters()
	 * @generated
	 * @ordered
	 */
	protected EList<KermetaUnit> importers;

	/**
	 * The cached value of the '{@link #getBuildingState() <em>Building State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuildingState()
	 * @generated
	 * @ordered
	 */
	protected IBuildingState buildingState;

	/**
	 * The cached value of the '{@link #getMessages() <em>Messages</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessages()
	 * @generated
	 * @ordered
	 */
	protected EList<Message> messages;

	/**
	 * The default value of the '{@link #isNeedASTTraces() <em>Need AST Traces</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNeedASTTraces()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NEED_AST_TRACES_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNeedASTTraces() <em>Need AST Traces</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNeedASTTraces()
	 * @generated
	 * @ordered
	 */
	protected boolean needASTTraces = NEED_AST_TRACES_EDEFAULT;

	/**
	 * The default value of the '{@link #isTypeChecked() <em>Type Checked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTypeChecked()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TYPE_CHECKED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isTypeChecked() <em>Type Checked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTypeChecked()
	 * @generated
	 * @ordered
	 */
	protected boolean typeChecked = TYPE_CHECKED_EDEFAULT;

	/**
	 * The default value of the '{@link #isFramework() <em>Framework</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFramework()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FRAMEWORK_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isFramework() <em>Framework</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFramework()
	 * @generated
	 * @ordered
	 */
	protected boolean framework = FRAMEWORK_EDEFAULT;

	/**
	 * The default value of the '{@link #getTracer() <em>Tracer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTracer()
	 * @generated
	 * @ordered
	 */
	protected static final Tracer TRACER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTracer() <em>Tracer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTracer()
	 * @generated
	 * @ordered
	 */
	protected Tracer tracer = TRACER_EDEFAULT;

	/**
	 * The default value of the '{@link #isConstraintChecked() <em>Constraint Checked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isConstraintChecked()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CONSTRAINT_CHECKED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isConstraintChecked() <em>Constraint Checked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isConstraintChecked()
	 * @generated
	 * @ordered
	 */
	protected boolean constraintChecked = CONSTRAINT_CHECKED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAspects() <em>Aspects</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAspects()
	 * @generated
	 * @ordered
	 */
	protected Map<TypeDefinition, EList<TypeDefinition>> aspects;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected KermetaUnitImpl() {
		super();
		setModelingUnit( StructureFactory.eINSTANCE.createModelingUnit() );
		aspects = new HashMap <TypeDefinition, EList<TypeDefinition> > ();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IoPackage.Literals.KERMETA_UNIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KermetaUnitStorer getStorer() {
		if (eContainerFeatureID != IoPackage.KERMETA_UNIT__STORER) return null;
		return (KermetaUnitStorer)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStorer(KermetaUnitStorer newStorer, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newStorer, IoPackage.KERMETA_UNIT__STORER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStorer(KermetaUnitStorer newStorer) {
		if (newStorer != eInternalContainer() || (eContainerFeatureID != IoPackage.KERMETA_UNIT__STORER && newStorer != null)) {
			if (EcoreUtil.isAncestor(this, newStorer))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newStorer != null)
				msgs = ((InternalEObject)newStorer).eInverseAdd(this, IoPackage.KERMETA_UNIT_STORER__KERMETA_UNITS, KermetaUnitStorer.class, msgs);
			msgs = basicSetStorer(newStorer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IoPackage.KERMETA_UNIT__STORER, newStorer, newStorer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUri() {
		return uri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUri(String newUri) {
		String oldUri = uri;
		uri = newUri;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IoPackage.KERMETA_UNIT__URI, oldUri, uri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelingUnit getModelingUnit() {
		if (modelingUnit != null && modelingUnit.eIsProxy()) {
			InternalEObject oldModelingUnit = (InternalEObject)modelingUnit;
			modelingUnit = (ModelingUnit)eResolveProxy(oldModelingUnit);
			if (modelingUnit != oldModelingUnit) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, IoPackage.KERMETA_UNIT__MODELING_UNIT, oldModelingUnit, modelingUnit));
			}
		}
		return modelingUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelingUnit basicGetModelingUnit() {
		return modelingUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModelingUnit(ModelingUnit newModelingUnit) {
		ModelingUnit oldModelingUnit = modelingUnit;
		modelingUnit = newModelingUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IoPackage.KERMETA_UNIT__MODELING_UNIT, oldModelingUnit, modelingUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PackageEntry> getInternalPackageEntries() {
		if (internalPackageEntries == null) {
			internalPackageEntries = new EObjectResolvingEList<PackageEntry>(PackageEntry.class, this, IoPackage.KERMETA_UNIT__INTERNAL_PACKAGE_ENTRIES);
		}
		return internalPackageEntries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PackageEntry> getExternalPackageEntries() {
		if (externalPackageEntries == null) {
			externalPackageEntries = new EObjectResolvingEList<PackageEntry>(PackageEntry.class, this, IoPackage.KERMETA_UNIT__EXTERNAL_PACKAGE_ENTRIES);
		}
		return externalPackageEntries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<KermetaUnit> getImportedKermetaUnits() {
		if (importedKermetaUnits == null) {
			importedKermetaUnits = new EObjectWithInverseResolvingEList.ManyInverse<KermetaUnit>(KermetaUnit.class, this, IoPackage.KERMETA_UNIT__IMPORTED_KERMETA_UNITS, IoPackage.KERMETA_UNIT__IMPORTERS);
		}
		return importedKermetaUnits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<KermetaUnit> getImporters() {
		if (importers == null) {
			importers = new EObjectWithInverseResolvingEList.ManyInverse<KermetaUnit>(KermetaUnit.class, this, IoPackage.KERMETA_UNIT__IMPORTERS, IoPackage.KERMETA_UNIT__IMPORTED_KERMETA_UNITS);
		}
		return importers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IBuildingState getBuildingState() {
		if (buildingState != null && buildingState.eIsProxy()) {
			InternalEObject oldBuildingState = (InternalEObject)buildingState;
			buildingState = (IBuildingState)eResolveProxy(oldBuildingState);
			if (buildingState != oldBuildingState) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, IoPackage.KERMETA_UNIT__BUILDING_STATE, oldBuildingState, buildingState));
			}
		}
		return buildingState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IBuildingState basicGetBuildingState() {
		return buildingState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBuildingState(IBuildingState newBuildingState) {
		IBuildingState oldBuildingState = buildingState;
		buildingState = newBuildingState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IoPackage.KERMETA_UNIT__BUILDING_STATE, oldBuildingState, buildingState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Message> getMessages() {
		if (messages == null) {
			messages = new EObjectResolvingEList<Message>(Message.class, this, IoPackage.KERMETA_UNIT__MESSAGES);
		}
		return messages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNeedASTTraces() {
		return needASTTraces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNeedASTTraces(boolean newNeedASTTraces) {
		boolean oldNeedASTTraces = needASTTraces;
		needASTTraces = newNeedASTTraces;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IoPackage.KERMETA_UNIT__NEED_AST_TRACES, oldNeedASTTraces, needASTTraces));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTypeChecked() {
		return typeChecked;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeChecked(boolean newTypeChecked) {
		boolean oldTypeChecked = typeChecked;
		typeChecked = newTypeChecked;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IoPackage.KERMETA_UNIT__TYPE_CHECKED, oldTypeChecked, typeChecked));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFramework() {
		return framework;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFramework(boolean newFramework) {
		boolean oldFramework = framework;
		framework = newFramework;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IoPackage.KERMETA_UNIT__FRAMEWORK, oldFramework, framework));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tracer getTracer() {
		return tracer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTracer(Tracer newTracer) {
		Tracer oldTracer = tracer;
		tracer = newTracer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IoPackage.KERMETA_UNIT__TRACER, oldTracer, tracer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isConstraintChecked() {
		return constraintChecked;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstraintChecked(boolean newConstraintChecked) {
		boolean oldConstraintChecked = constraintChecked;
		constraintChecked = newConstraintChecked;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IoPackage.KERMETA_UNIT__CONSTRAINT_CHECKED, oldConstraintChecked, constraintChecked));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map<TypeDefinition, EList<TypeDefinition>> getAspects() {
		return aspects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAspects(Map<TypeDefinition, EList<TypeDefinition>> newAspects) {
		Map<TypeDefinition, EList<TypeDefinition>> oldAspects = aspects;
		aspects = newAspects;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IoPackage.KERMETA_UNIT__ASPECTS, oldAspects, aspects));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void load() {
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public fr.irisa.triskell.kermeta.language.structure.Package addInternalPackage(String qualifiedName) {
			
		Package result = findInternalpackage(qualifiedName);
		if ( result != null )
			return result;
		
		String[] parts = qualifiedName.split("::");
		String currentQualifiedName = "";
		String currentName = "";
		Package currentPackage = null;
		
		for ( int i = 0; i < parts.length; i++ ) {
			
			currentQualifiedName += parts[i];
			currentName = parts[i];
			
			Package p = findInternalpackage( currentQualifiedName );
			if ( p == null ) {
				p = StructureFactory.eINSTANCE.createPackage();
				p.setName( currentName );
				getModelingUnit().getPackages().add( p );
				if ( currentPackage != null )
					currentPackage.getNestedPackage().add( p );
				
				/*
				 * 
				 * Creation of the package entry.
				 * 
				 */
				PackageEntry entry = IoFactory.eINSTANCE.createPackageEntry();
				entry.setQualifiedName( currentQualifiedName );
				entry.setPackage( p );
				getInternalPackageEntries().add( entry );
				
			} 
			currentPackage = p;
			
			currentQualifiedName += "::";
			
		}
		
		return currentPackage;		
		
		/*Package p = findInternalpackage(qualifiedName);
		if ( p == null ) {
			/*
			 * 
			 * Creation of the package.
			 * 
			 */
			/*p = StructureFactory.eINSTANCE.createPackage();
			int index = qualifiedName.lastIndexOf("::");
			String name = qualifiedName;
			if ( index != -1 )
				name = qualifiedName.substring(index+2);
			p.setName( name );
			/*
			 * 
			 * Creation of the package entry.
			 * 
			 */
			/*PackageEntry entry = IoFactory.eINSTANCE.createPackageEntry();
			entry.setQualifiedName( qualifiedName );
			entry.setPackage( p );
			getInternalPackageEntries().add( entry );
			getCompilationUnit().getPackages().add( p );
		}
		return p;*/
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public fr.irisa.triskell.kermeta.language.structure.Package findInternalpackage(String qualifiedName) {
		Iterator <PackageEntry> iterator = getInternalPackageEntries().iterator();
		while ( iterator.hasNext() ) {
			PackageEntry current = iterator.next();
			if ( current.getQualifiedName().equals(qualifiedName) )
				return current.getPackage();
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Require addRequire(String uri) {
		assert ( modelingUnit != null );
		for ( Require r : modelingUnit.getRequires() )
			if ( r.getUri().equals(uri) )
				return r;
		Require require = StructureFactory.eINSTANCE.createRequire();
		require.setUri( uri );
		modelingUnit.getRequires().add( require );
		return require;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Using addUsing(String qualifiedName) {
		assert ( modelingUnit != null );
		Using using = StructureFactory.eINSTANCE.createUsing();
		using.setQualifiedName( qualifiedName );
		modelingUnit.getUsings().add( using );
		return using;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<String> getRequires() {
		EList<String>  requires = new BasicEList<String> ();
		Iterator <Require> iterator = modelingUnit.getRequires().iterator();
		while ( iterator.hasNext() )
			requires.add( iterator.next().getUri() );
		return requires;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void importKermetaUnit(KermetaUnit value, boolean force) {
		if ( value != this ) {
			
			boolean shouldImport = true;
			
			if ( force == false ) {
			
				for ( KermetaUnit importedUnit : (List<KermetaUnit>) getImportedKermetaUnits() )
					if ( importedUnit == value )
						shouldImport = false;
			}
			
			if ( shouldImport ) {
					
				getImportedKermetaUnits().add( value );
				modelingUnit.getReferencedModelingUnits().add( value.getModelingUnit() );
				Iterator <Package> iterator = value.getPackages().iterator();
				while ( iterator.hasNext() ) {
					Package p = iterator.next();
					addExternalPackage( p );
				}
				
				for ( KermetaUnit unitToImport : KermetaUnitHelper.getAllImportedKermetaUnits( value ) ) {
					getImportedKermetaUnits().add( unitToImport );
					modelingUnit.getReferencedModelingUnits().add( unitToImport.getModelingUnit() );
					iterator = unitToImport.getPackages().iterator();
					while ( iterator.hasNext() ) {
						Package p = iterator.next();
						addExternalPackage( p );
					}
				}
				
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void addExternalPackage(fr.irisa.triskell.kermeta.language.structure.Package p) {
		/*
		 * 
		 * Look for this package in the external packages.
		 * 
		 */
		Iterator <PackageEntry> iterator = getExternalPackageEntries().iterator();
		while ( iterator.hasNext() ) {
			PackageEntry entry = iterator.next();
			if ( entry.getPackage().equals(p) )
				return;
		}
		/*
		 * 
		 * The package is not an extern package. Make it an extern.
		 * 
		 */
		PackageEntry entry = IoFactory.eINSTANCE.createPackageEntry();
		entry.setQualifiedName( NamedElementHelper.getQualifiedName(p) );
		entry.setPackage( p );
		getExternalPackageEntries().add( entry );	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Package> getPackages() {
		EList <Package> packages = new BasicEList<Package> ();
		packages.addAll( getInternalPackages() );
		packages.addAll( getExternalPackages() );
		return packages;	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Package> getInternalPackages() {
		EList <Package> packages = new BasicEList<Package> ();
		Iterator <PackageEntry> iterator = getInternalPackageEntries().iterator();
		while ( iterator.hasNext() )
			packages.add( iterator.next().getPackage() );
		return packages;	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Package> getExternalPackages() {
		EList <Package> packages = new BasicEList<Package> ();
		Iterator <PackageEntry> iterator = getExternalPackageEntries().iterator();
		while ( iterator.hasNext() )
			packages.add( iterator.next().getPackage() );
		return packages;	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public TypeDefinition getTypeDefinitionByName(String name) {
		/*
		 * 
		 * Maybe it is a qualified name.
		 * 
		 */
		if ( name.contains("::") ) {
			TypeDefinition typeDefinition = getTypeDefinitionByQualifiedName( name );
			if ( typeDefinition != null )
				return typeDefinition;
			
		}
		/*
		 * 
		 * Look into the internal packages.
		 * 
		 */
		List <Package> internalPackages = getInternalPackages();
		Iterator <Package> iterator = internalPackages.iterator();
		while ( iterator.hasNext() ) {
			Package p = iterator.next();
			String qualifiedName = NamedElementHelper.getQualifiedName(p) + "::" + name;
			int index = qualifiedName.lastIndexOf("::");
			String packageQualifedName = qualifiedName.substring(0, index);
			Package currentPackage = getInternalPackage( packageQualifedName );
			
			if ( currentPackage != null ) {
			
				Iterator <TypeDefinition> iterator2 = currentPackage.getOwnedTypeDefinition().iterator();
				while ( iterator2.hasNext() ) {
					TypeDefinition typeDefinition = iterator2.next();
					if ( NamedElementHelper.getQualifiedName(typeDefinition).equals(qualifiedName) )
						return typeDefinition;
				}
				
			}
		}
		/*
		 * 
		 * Look into the internal packages.
		 * 
		 */
		/*List <Package> internalPackages = getInternalPackages();
		Iterator <Package> iterator = internalPackages.iterator();
		while ( iterator.hasNext() ) {
			Package p = iterator.next();
			String qualifiedName = NamedElementHelper.getQualifiedName(p) + "::" + name;
			Iterator <TypeDefinition> iterator2 = p.getOwnedTypeDefinition().iterator();
			while ( iterator2.hasNext() ) {
				TypeDefinition typeDefinition = iterator2.next();
				if ( NamedElementHelper.getQualifiedName(typeDefinition).equals(qualifiedName) )
					return typeDefinition;
			}
		}*/
		/*
		 * 
		 * Look into the external packages which has the same name that an internal package.
		 * 
		 */
		iterator = getInternalPackages().iterator();
		while ( iterator.hasNext() ) {
			Package p = iterator.next();
			String packageQualifiedName = NamedElementHelper.getQualifiedName(p);
			String typeDefinitionQualifiedName = packageQualifiedName + "::" + name;
			Iterator <Package> it = getExternalPackage(packageQualifiedName).iterator();
			while ( it.hasNext() ) {
				Package externalPackage = it.next();
				Iterator <TypeDefinition> iterator2 = externalPackage.getOwnedTypeDefinition().iterator();
				while ( iterator2.hasNext() ) {
					TypeDefinition typeDefinition = iterator2.next();
					if ( NamedElementHelper.getQualifiedName(typeDefinition).equals(typeDefinitionQualifiedName) )
						return typeDefinition;
				}
			}
		}
		
		/*
		 * 
		 * Look into the external packages thanks to the usings.
		 * 
		 */
		if(getModelingUnit() == null){
			IOPlugin.internalLog.error("Problem ! modelingUnit is null, ... maybe a problem of concurrent thread ??? ");
		}
		Iterator <Using> itOnUsings = modelingUnit.getUsings().iterator();
		while ( itOnUsings.hasNext() ) {
			Using using = itOnUsings.next();
			String qualifiedName = using.getQualifiedName() + "::" + name;
			TypeDefinition typeDefinition = getTypeDefinitionByQualifiedName(qualifiedName);
			if ( typeDefinition != null )
				return typeDefinition;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public TypeDefinition getTypeDefinitionByQualifiedName(String qualifiedName) {
		String packageQualifiedName = "";
		String typeDefinitionName = "";
		int index = qualifiedName.lastIndexOf("::");
		if ( index != -1 ) {
			packageQualifiedName = qualifiedName.substring(0, index);
			typeDefinitionName = qualifiedName.substring(index+2);
		}
		List <Package> packages = getPackages(packageQualifiedName);
		Iterator <Package> iterator = packages.iterator();
		while ( iterator.hasNext() ) {
			Package p = iterator.next();
			Iterator <TypeDefinition> iterator2 = p.getOwnedTypeDefinition().iterator();
			while ( iterator2.hasNext() ) {
				TypeDefinition typeDefinition = iterator2.next();
				if ( typeDefinition.getName().equals(typeDefinitionName) )
					return typeDefinition;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Package> getPackages(String qualifiedName) {
		EList <Package> packages = new BasicEList<Package> ();
		/*
		 * 
		 * Look into the internal packages.
		 * 
		 */
		Iterator <PackageEntry> iterator = getInternalPackageEntries().iterator();
		while ( iterator.hasNext() ) {
			PackageEntry entry = iterator.next();
			if ( entry.getQualifiedName().equals(qualifiedName) )
				packages.add( entry.getPackage() );
		}
		/*
		 * 
		 * Look into the external packages.
		 * 
		 */
		iterator = getExternalPackageEntries().iterator();
		while ( iterator.hasNext() ) {
			PackageEntry entry = iterator.next();
			if ( entry.getQualifiedName().equals(qualifiedName) )
				packages.add( entry.getPackage() );
		}
		return packages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public fr.irisa.triskell.kermeta.language.structure.Package getInternalPackage(String qualifiedName) {
		Iterator <PackageEntry> iterator = getInternalPackageEntries().iterator();
		while ( iterator.hasNext() ) {
			PackageEntry entry = iterator.next();
			if ( entry.getQualifiedName().equals( qualifiedName) )
				return entry.getPackage();
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Package> getExternalPackage(String qualifiedName) {
		EList <Package> packages = new BasicEList<Package> ();
		Iterator <PackageEntry> iterator = getExternalPackageEntries().iterator();
		while ( iterator.hasNext() ) {
			PackageEntry current = iterator.next();
			if ( current.getQualifiedName().equals( qualifiedName ) )
				packages.add( current.getPackage() );
		}
		return packages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String print() {
		/*KMTPrettyPrinter printer = new KMTPrettyPrinter( compilationUnit );
		printer.accept( compilationUnit );
		return printer.getText();*/
		KM2KMTPrettyPrinter printer = new KM2KMTPrettyPrinter();
		printer.ppCompilationUnit( modelingUnit );
		return printer.getContent();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isLoading() {
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void error(String message) {
		ErrorMessage error = IoFactory.eINSTANCE.createErrorMessage();
		error.setValue( message );
		getMessages().add( error );
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void warning(String message) {
		WarningMessage warning = IoFactory.eINSTANCE.createWarningMessage();
		warning.setValue( message );
		getMessages().add( warning );
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isErrored() {
		return KermetaUnitHelper.isIndirectlyErrored(this);
	}

	/**
	 * This tables store the mapping between Metacore model elements
	 * and AST nodes in both directions.
	 * This is intensely used during the parsing but should be discarded after 
	 * because it creates references to the whole ast, and java cannot claim to get all this memory back
	 * @generated NOT
	 */
	protected Hashtable traceT2M = new Hashtable();
	protected Hashtable traceM2T = new Hashtable();
	
	/**
	 * @generated NOT
	 */
	public String traceDefaultShortDescription="Parsing of ";
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void storeTrace(fr.irisa.triskell.kermeta.language.structure.Object model_element, Object node) {
		
		assert( model_element != null );
		assert( node != null );
		
		if(needASTTraces){
			// only unit related to text using ASt need this kind of trace 
			
			traceM2T.put(model_element, node);
			traceT2M.put(node, model_element);
		
			if(tracer ==  null)			
			{	// if there is no tracer defined create a memory tracer
				// useful because at the end of the build the AST will be discarded to free the memory
				// only the tracer will remain (but it has a smaller memory footprint
				tracer = new Tracer();
			}
		   
			ASTNode astNode = (ASTNode)node;
			tracer.addTextInputTrace(this.uri, 
					-1,// this cost too much, this computation is done only on demand, ResourceHelper.calculateLineNumber(astNode.getRangeStart(),this.uri),//getLineNumber(astNode, this.uri), // todo : we MUST do a lazy count instead to avoid loosing performance!
					astNode.getRangeStart(),
					astNode.getRangeStart()+ astNode.getRangeLength(), 
					model_element, 
					traceDefaultShortDescription + astNode.getTypeName() );
			
		} 
		
	}	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public fr.irisa.triskell.kermeta.language.structure.Object getModelElementByNode(Object node) {
		return (fr.irisa.triskell.kermeta.language.structure.Object)traceT2M.get(node);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Object getNodeByModelElement(fr.irisa.triskell.kermeta.language.structure.Object object) {
		return traceM2T.get(object);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<String> getUsings() {
		EList<String> usings = new BasicEList<String> ();
		Iterator <Using> iterator = modelingUnit.getUsings().iterator();
		while ( iterator.hasNext() )
			usings.add( iterator.next().getQualifiedName() );
		return usings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void error(String message, Object target) {
		ErrorMessage error = IoFactory.eINSTANCE.createErrorMessage();
		error.setValue( message );
		error.setTarget( target );
		getMessages().add( error );
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isWarned() {
		return KermetaUnitHelper.isWarned(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void parsingError(ANTLRException exception) {
		if ( exception instanceof MismatchedTokenException ) {
			ParsingError error = IoFactory.eINSTANCE.createParsingError();
			MismatchedTokenException e = (MismatchedTokenException) exception;
			error.setOffset( e.column );
			if ( e.token.getText() == null )
				error.setLength(0);
			else
				error.setLength( e.token.getText().length() );
			error.setValue( e.getLocalizedMessage() );
			getMessages().add( error );
		} else if ( exception instanceof NoViableAltException ) {
			ParsingError error = IoFactory.eINSTANCE.createParsingError();
			NoViableAltException e = (NoViableAltException) exception;
			error.setOffset( e.column );
			if ( e.token.getText() == null )
				error.setLength(0);
			else
				error.setLength( e.token.getText().length() );
			error.setValue( e.getLocalizedMessage() );
			getMessages().add( error );
		} else if ( exception instanceof TokenStreamRecognitionException ) {
			TokenStreamRecognitionException e = (TokenStreamRecognitionException) exception;
			ParsingError error = IoFactory.eINSTANCE.createParsingError();
			error.setOffset( e.recog.column );
			error.setLength( 0 );
			error.setValue( e.getLocalizedMessage() );
			getMessages().add( error );
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void warning(String message, Object target) {
		WarningMessage warning = IoFactory.eINSTANCE.createWarningMessage();
		warning.setValue( message );
		warning.setTarget( target );
		getMessages().add( warning );
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void finalize() {
		System.out.println( "finalize " + getUri() );

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<String> getUniquePackageQualifiedNames() {
		EList<String> result = new BasicEList<String>();
		Iterator<Package> it = getPackages().iterator();
		while (it.hasNext())
		{
			Package p = it.next();
			String qualifiedName = NamedElementHelper.getQualifiedName(p);
			if (!result.contains(qualifiedName)) 
				result.add(qualifiedName);
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void importKermetaUnit(KermetaUnit value) {
		if ( value != this ) {
			
			boolean shouldImport = true;
			
			for ( KermetaUnit importedUnit : (List<KermetaUnit>) getImportedKermetaUnits() )
				if ( importedUnit == value )
					shouldImport = false;
			
			if ( shouldImport ) {
					
				getImportedKermetaUnits().add( value );
				modelingUnit.getReferencedModelingUnits().add( value.getModelingUnit() );
				Iterator <Package> iterator = value.getPackages().iterator();
				while ( iterator.hasNext() ) {
					Package p = iterator.next();
					addExternalPackage( p );
				}
				
				for ( KermetaUnit unitToImport : KermetaUnitHelper.getAllImportedKermetaUnits( value ) ) {
					getImportedKermetaUnits().add( unitToImport );
					modelingUnit.getReferencedModelingUnits().add( unitToImport.getModelingUnit() );
					iterator = unitToImport.getPackages().iterator();
					while ( iterator.hasNext() ) {
						Package p = iterator.next();
						addExternalPackage( p );
					}
				}
				
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
		@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IoPackage.KERMETA_UNIT__STORER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetStorer((KermetaUnitStorer)otherEnd, msgs);
			case IoPackage.KERMETA_UNIT__IMPORTED_KERMETA_UNITS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getImportedKermetaUnits()).basicAdd(otherEnd, msgs);
			case IoPackage.KERMETA_UNIT__IMPORTERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getImporters()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IoPackage.KERMETA_UNIT__STORER:
				return basicSetStorer(null, msgs);
			case IoPackage.KERMETA_UNIT__IMPORTED_KERMETA_UNITS:
				return ((InternalEList<?>)getImportedKermetaUnits()).basicRemove(otherEnd, msgs);
			case IoPackage.KERMETA_UNIT__IMPORTERS:
				return ((InternalEList<?>)getImporters()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID) {
			case IoPackage.KERMETA_UNIT__STORER:
				return eInternalContainer().eInverseRemove(this, IoPackage.KERMETA_UNIT_STORER__KERMETA_UNITS, KermetaUnitStorer.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IoPackage.KERMETA_UNIT__STORER:
				return getStorer();
			case IoPackage.KERMETA_UNIT__URI:
				return getUri();
			case IoPackage.KERMETA_UNIT__MODELING_UNIT:
				if (resolve) return getModelingUnit();
				return basicGetModelingUnit();
			case IoPackage.KERMETA_UNIT__INTERNAL_PACKAGE_ENTRIES:
				return getInternalPackageEntries();
			case IoPackage.KERMETA_UNIT__EXTERNAL_PACKAGE_ENTRIES:
				return getExternalPackageEntries();
			case IoPackage.KERMETA_UNIT__IMPORTED_KERMETA_UNITS:
				return getImportedKermetaUnits();
			case IoPackage.KERMETA_UNIT__IMPORTERS:
				return getImporters();
			case IoPackage.KERMETA_UNIT__BUILDING_STATE:
				if (resolve) return getBuildingState();
				return basicGetBuildingState();
			case IoPackage.KERMETA_UNIT__MESSAGES:
				return getMessages();
			case IoPackage.KERMETA_UNIT__NEED_AST_TRACES:
				return isNeedASTTraces() ? Boolean.TRUE : Boolean.FALSE;
			case IoPackage.KERMETA_UNIT__TYPE_CHECKED:
				return isTypeChecked() ? Boolean.TRUE : Boolean.FALSE;
			case IoPackage.KERMETA_UNIT__FRAMEWORK:
				return isFramework() ? Boolean.TRUE : Boolean.FALSE;
			case IoPackage.KERMETA_UNIT__TRACER:
				return getTracer();
			case IoPackage.KERMETA_UNIT__CONSTRAINT_CHECKED:
				return isConstraintChecked() ? Boolean.TRUE : Boolean.FALSE;
			case IoPackage.KERMETA_UNIT__ASPECTS:
				return getAspects();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
		@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case IoPackage.KERMETA_UNIT__STORER:
				setStorer((KermetaUnitStorer)newValue);
				return;
			case IoPackage.KERMETA_UNIT__URI:
				setUri((String)newValue);
				return;
			case IoPackage.KERMETA_UNIT__MODELING_UNIT:
				setModelingUnit((ModelingUnit)newValue);
				return;
			case IoPackage.KERMETA_UNIT__INTERNAL_PACKAGE_ENTRIES:
				getInternalPackageEntries().clear();
				getInternalPackageEntries().addAll((Collection<? extends PackageEntry>)newValue);
				return;
			case IoPackage.KERMETA_UNIT__EXTERNAL_PACKAGE_ENTRIES:
				getExternalPackageEntries().clear();
				getExternalPackageEntries().addAll((Collection<? extends PackageEntry>)newValue);
				return;
			case IoPackage.KERMETA_UNIT__IMPORTED_KERMETA_UNITS:
				getImportedKermetaUnits().clear();
				getImportedKermetaUnits().addAll((Collection<? extends KermetaUnit>)newValue);
				return;
			case IoPackage.KERMETA_UNIT__IMPORTERS:
				getImporters().clear();
				getImporters().addAll((Collection<? extends KermetaUnit>)newValue);
				return;
			case IoPackage.KERMETA_UNIT__BUILDING_STATE:
				setBuildingState((IBuildingState)newValue);
				return;
			case IoPackage.KERMETA_UNIT__MESSAGES:
				getMessages().clear();
				getMessages().addAll((Collection<? extends Message>)newValue);
				return;
			case IoPackage.KERMETA_UNIT__NEED_AST_TRACES:
				setNeedASTTraces(((Boolean)newValue).booleanValue());
				return;
			case IoPackage.KERMETA_UNIT__TYPE_CHECKED:
				setTypeChecked(((Boolean)newValue).booleanValue());
				return;
			case IoPackage.KERMETA_UNIT__FRAMEWORK:
				setFramework(((Boolean)newValue).booleanValue());
				return;
			case IoPackage.KERMETA_UNIT__TRACER:
				setTracer((Tracer)newValue);
				return;
			case IoPackage.KERMETA_UNIT__CONSTRAINT_CHECKED:
				setConstraintChecked(((Boolean)newValue).booleanValue());
				return;
			case IoPackage.KERMETA_UNIT__ASPECTS:
				setAspects((Map<TypeDefinition, EList<TypeDefinition>>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case IoPackage.KERMETA_UNIT__STORER:
				setStorer((KermetaUnitStorer)null);
				return;
			case IoPackage.KERMETA_UNIT__URI:
				setUri(URI_EDEFAULT);
				return;
			case IoPackage.KERMETA_UNIT__MODELING_UNIT:
				setModelingUnit((ModelingUnit)null);
				return;
			case IoPackage.KERMETA_UNIT__INTERNAL_PACKAGE_ENTRIES:
				getInternalPackageEntries().clear();
				return;
			case IoPackage.KERMETA_UNIT__EXTERNAL_PACKAGE_ENTRIES:
				getExternalPackageEntries().clear();
				return;
			case IoPackage.KERMETA_UNIT__IMPORTED_KERMETA_UNITS:
				getImportedKermetaUnits().clear();
				return;
			case IoPackage.KERMETA_UNIT__IMPORTERS:
				getImporters().clear();
				return;
			case IoPackage.KERMETA_UNIT__BUILDING_STATE:
				setBuildingState((IBuildingState)null);
				return;
			case IoPackage.KERMETA_UNIT__MESSAGES:
				getMessages().clear();
				return;
			case IoPackage.KERMETA_UNIT__NEED_AST_TRACES:
				setNeedASTTraces(NEED_AST_TRACES_EDEFAULT);
				return;
			case IoPackage.KERMETA_UNIT__TYPE_CHECKED:
				setTypeChecked(TYPE_CHECKED_EDEFAULT);
				return;
			case IoPackage.KERMETA_UNIT__FRAMEWORK:
				setFramework(FRAMEWORK_EDEFAULT);
				return;
			case IoPackage.KERMETA_UNIT__TRACER:
				setTracer(TRACER_EDEFAULT);
				return;
			case IoPackage.KERMETA_UNIT__CONSTRAINT_CHECKED:
				setConstraintChecked(CONSTRAINT_CHECKED_EDEFAULT);
				return;
			case IoPackage.KERMETA_UNIT__ASPECTS:
				setAspects((Map<TypeDefinition, EList<TypeDefinition>>)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case IoPackage.KERMETA_UNIT__STORER:
				return getStorer() != null;
			case IoPackage.KERMETA_UNIT__URI:
				return URI_EDEFAULT == null ? uri != null : !URI_EDEFAULT.equals(uri);
			case IoPackage.KERMETA_UNIT__MODELING_UNIT:
				return modelingUnit != null;
			case IoPackage.KERMETA_UNIT__INTERNAL_PACKAGE_ENTRIES:
				return internalPackageEntries != null && !internalPackageEntries.isEmpty();
			case IoPackage.KERMETA_UNIT__EXTERNAL_PACKAGE_ENTRIES:
				return externalPackageEntries != null && !externalPackageEntries.isEmpty();
			case IoPackage.KERMETA_UNIT__IMPORTED_KERMETA_UNITS:
				return importedKermetaUnits != null && !importedKermetaUnits.isEmpty();
			case IoPackage.KERMETA_UNIT__IMPORTERS:
				return importers != null && !importers.isEmpty();
			case IoPackage.KERMETA_UNIT__BUILDING_STATE:
				return buildingState != null;
			case IoPackage.KERMETA_UNIT__MESSAGES:
				return messages != null && !messages.isEmpty();
			case IoPackage.KERMETA_UNIT__NEED_AST_TRACES:
				return needASTTraces != NEED_AST_TRACES_EDEFAULT;
			case IoPackage.KERMETA_UNIT__TYPE_CHECKED:
				return typeChecked != TYPE_CHECKED_EDEFAULT;
			case IoPackage.KERMETA_UNIT__FRAMEWORK:
				return framework != FRAMEWORK_EDEFAULT;
			case IoPackage.KERMETA_UNIT__TRACER:
				return TRACER_EDEFAULT == null ? tracer != null : !TRACER_EDEFAULT.equals(tracer);
			case IoPackage.KERMETA_UNIT__CONSTRAINT_CHECKED:
				return constraintChecked != CONSTRAINT_CHECKED_EDEFAULT;
			case IoPackage.KERMETA_UNIT__ASPECTS:
				return aspects != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (uri: ");
		result.append(uri);
		result.append(", needASTTraces: ");
		result.append(needASTTraces);
		result.append(", typeChecked: ");
		result.append(typeChecked);
		result.append(", framework: ");
		result.append(framework);
		result.append(", tracer: ");
		result.append(tracer);
		result.append(", constraintChecked: ");
		result.append(constraintChecked);
		result.append(", aspects: ");
		result.append(aspects);
		result.append(')');
		return result.toString();
	}

} //KermetaUnitImpl