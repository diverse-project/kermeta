/**
 * <copyright>
 * </copyright>
 *
 * $Id: KermetaUnitStorerImpl.java,v 1.28 2008-07-22 12:55:42 dvojtise Exp $
 */
package org.kermeta.io.impl;


import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.EPackage.Registry;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.ecore.xml.type.internal.DataValue.URI.MalformedURIException;
import org.kermeta.io.IoFactory;
import org.kermeta.io.IoPackage;
import org.kermeta.io.KermetaUnit;
import org.kermeta.io.KermetaUnitStorer;
import org.kermeta.io.plugin.IOPlugin;
import org.kermeta.loader.FrameworkMapping;

import fr.irisa.triskell.eclipse.emf.EMFRegistryHelper;
import fr.irisa.triskell.kermeta.exceptions.NotRegisteredURIException;
import fr.irisa.triskell.kermeta.exceptions.URIMalformedException;
import fr.irisa.triskell.kermeta.language.structure.Package;
import fr.irisa.triskell.kermeta.language.structure.TypeDefinition;
import fr.irisa.triskell.kermeta.loader.ecore.EcoreBuildingState;
import fr.irisa.triskell.kermeta.loader.java.JavaBuildingState;
import fr.irisa.triskell.kermeta.loader.km.KmBuildingState;
import fr.irisa.triskell.kermeta.loader.kmt.KMTBuildingState;
import fr.irisa.triskell.kermeta.modelhelper.KermetaUnitHelper;
import fr.irisa.triskell.kermeta.modelhelper.NamedElementHelper;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Kermeta Unit Storer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.kermeta.io.impl.KermetaUnitStorerImpl#getKermetaUnits <em>Kermeta Units</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class KermetaUnitStorerImpl extends EObjectImpl implements KermetaUnitStorer {
	/**
	 * The cached value of the '{@link #getKermetaUnits() <em>Kermeta Units</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKermetaUnits()
	 * @generated
	 * @ordered
	 */
	protected EList<KermetaUnit> kermetaUnits;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KermetaUnitStorerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IoPackage.Literals.KERMETA_UNIT_STORER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<KermetaUnit> getKermetaUnits() {
		if (kermetaUnits == null) {
			kermetaUnits = new EObjectContainmentWithInverseEList<KermetaUnit>(KermetaUnit.class, this, IoPackage.KERMETA_UNIT_STORER__KERMETA_UNITS, IoPackage.KERMETA_UNIT__STORER);
		}
		return kermetaUnits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws MalformedURIException 
	 * @generated NOT
	 */
	public KermetaUnit get(String uri) throws URIMalformedException, NotRegisteredURIException {
			
		assert( uri != null );
		boolean framework = false;
		
		String kermetaUnitURI = uri;
		
		String uriMapped = FrameworkMapping.mapping.get(kermetaUnitURI);
		if ( uriMapped != null )
			kermetaUnitURI = uriMapped;
		
		if ( uri.equals("kermeta") ) {
			kermetaUnitURI = IOPlugin.getFrameWorkURI();
			framework = true;
		} else if ( uri.equals(IOPlugin.getFrameWorkURI()) )
			framework = true;
		else if ( uri.equals(IOPlugin.getFrameWorkEcoreURI()) )
			framework = true;
		else if ( uri.equals("java_rt_jar") ) {
	    		// if this is java declaration that are required
	    		String javahome = System.getProperty("java.home");
	    		javahome = javahome.replace("\\", "/");
	    		kermetaUnitURI = "file:/"+javahome+"/lib/rt.jar";
		}
		
		if ( 	! kermetaUnitURI.matches("platform:/plugin/.+") 
			&& 	! kermetaUnitURI.matches("platform://plugin/.+")
			&& 	! kermetaUnitURI.matches("platform:/resource/.+") 
			&&	! kermetaUnitURI.matches("http://.+")  
			&&	! kermetaUnitURI.matches("jar:file:.+")
			&&	! kermetaUnitURI.matches("file:.+") )
			throw new URIMalformedException( uri );

		KermetaUnit kermetaUnit = find(kermetaUnitURI);
		if ( kermetaUnit == null ) {
			/*
			 * 
			 * Creating the Kermeta Unit.
			 * 
			 */		
			kermetaUnit = IoFactory.eINSTANCE.createKermetaUnit();
			kermetaUnit.setUri( kermetaUnitURI );
			kermetaUnit.setFramework( framework );
			
			getKermetaUnits().add( kermetaUnit );
			/*
			 * 
			 * Setting the loader for the kermeta unit.
			 * 
			 */
			int index = kermetaUnitURI.lastIndexOf(".");
			String extension = kermetaUnitURI.substring(index+1);
			if ( extension.equals("kmt") ) {
				kermetaUnit.setBuildingState( new KMTBuildingState() );
				kermetaUnit.setNeedASTTraces(true);
			} else if ( extension.equals("ecore") || uri.equals(IOPlugin.ECORE_URI) )
				kermetaUnit.setBuildingState( new EcoreBuildingState() );
			else if ( extension.equals("km") )
				kermetaUnit.setBuildingState( new KmBuildingState() );
			else if ( extension.equals("jar") )
				kermetaUnit.setBuildingState( new JavaBuildingState() );
			else if ( ! EMFRegistryHelper.isRegistered( kermetaUnitURI ) ) {
//				kermetaUnit.setBuildingState( new AbstractBuildingState() );
//				kermetaUnit.error("Unknown Format. It is impossible to load this file.\n You may have to register this URI.");
				kermetaUnits.remove(kermetaUnit);
				throw new NotRegisteredURIException(kermetaUnitURI);
			} else {
				EPackage p = Registry.INSTANCE.getEPackage(kermetaUnitURI);
				if(p != null){
					kermetaUnit.setBuildingState( new EcoreBuildingState() );
				}				
				
			}

			WeakReference<KermetaUnit> reference = new WeakReference<KermetaUnit>( kermetaUnit );
	        return reference.get();

		} else
			return kermetaUnit;
			}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public KermetaUnit find(String uri) {
		String realURI = FrameworkMapping.mapping.get(uri);
		if ( realURI == null )
			realURI = uri;
		
		if ( realURI.equals("kermeta") )
			realURI = IOPlugin.getFrameWorkURI();
		
		for ( KermetaUnit current : getKermetaUnits() ) {
			if ( current.getUri().equals(realURI) ) {
				WeakReference<KermetaUnit> reference = new WeakReference<KermetaUnit>( current );
		        return reference.get();
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	synchronized public void unload(String uri) {

		KermetaUnit kermetaUnit = find(uri);
		if ( kermetaUnit != null ) {
				
			getKermetaUnits().remove( kermetaUnit );
		
			for ( TypeDefinition typeDefinition : KermetaUnitHelper.getInternalTypeDefinitions( kermetaUnit ) ) {
				String qualifiedName1 = NamedElementHelper.getQualifiedName(typeDefinition);
				for ( KermetaUnit importer : kermetaUnit.getImportedKermetaUnits() ) {
					/*
					 * 
					 * Removing the base class from the aspect.
					 * 
					 */
					for ( TypeDefinition aspect : importer.getAspects().keySet() ) {
						String qualifiedName2 = NamedElementHelper.getQualifiedName(aspect);
						if ( qualifiedName1.equals(qualifiedName2) )
							importer.getAspects().get(aspect).remove( typeDefinition );
					}
					
					/*
					 * 
					 * Removing the aspect from the base classes.
					 * 
					 */
					for ( TypeDefinition baseClass : importer.getBaseAspects().keySet() ) {
						String qualifiedName2 = NamedElementHelper.getQualifiedName(baseClass);
						if ( qualifiedName1.equals(qualifiedName2) )
							importer.getBaseAspects().get(baseClass).remove( typeDefinition );
					}

				}
								
				typeDefinition.getOwnedTags().clear();
				typeDefinition.getTag().clear();
			
			}
			
			kermetaUnit.getImportedKermetaUnits().clear();			
			kermetaUnit.getImporters().clear();		
			
			for ( Package p : (List<Package>) kermetaUnit.getInternalPackages() ) {
				p.getOwnedTags().clear();
				p.getTag().clear();
				p.getOwnedTypeDefinition().clear();
			}
			
			for ( List<TypeDefinition> l : kermetaUnit.getAspects().values() )
				l.clear();
			
			for ( List<TypeDefinition> l : kermetaUnit.getBaseAspects().values() )
				l.clear();
			
			kermetaUnit.getAspects().clear();
			kermetaUnit.getInternalPackageEntries().clear();
			kermetaUnit.getExternalPackageEntries().clear();
			kermetaUnit.getMessages().clear();
			kermetaUnit.setTracer(null);
			kermetaUnit.setModelingUnit(null);
			kermetaUnit.setStorer(null);
			kermetaUnit.setTypeDefinitionCache(null);
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
			case IoPackage.KERMETA_UNIT_STORER__KERMETA_UNITS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getKermetaUnits()).basicAdd(otherEnd, msgs);
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
			case IoPackage.KERMETA_UNIT_STORER__KERMETA_UNITS:
				return ((InternalEList<?>)getKermetaUnits()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IoPackage.KERMETA_UNIT_STORER__KERMETA_UNITS:
				return getKermetaUnits();
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
			case IoPackage.KERMETA_UNIT_STORER__KERMETA_UNITS:
				getKermetaUnits().clear();
				getKermetaUnits().addAll((Collection<? extends KermetaUnit>)newValue);
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
			case IoPackage.KERMETA_UNIT_STORER__KERMETA_UNITS:
				getKermetaUnits().clear();
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
			case IoPackage.KERMETA_UNIT_STORER__KERMETA_UNITS:
				return kermetaUnits != null && !kermetaUnits.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //KermetaUnitStorerImpl