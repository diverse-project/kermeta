/**
 * <copyright>
 * </copyright>
 *
 * $Id: KermetaUnitStorerImpl.java,v 1.22 2007-12-06 14:10:53 ftanguy Exp $
 */
package org.kermeta.io.impl;


import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.EPackage.Registry;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.ecore.xml.type.internal.DataValue.URI.MalformedURIException;
import org.kermeta.io.IoFactory;
import org.kermeta.io.IoPackage;
import org.kermeta.io.KermetaUnit;
import org.kermeta.io.KermetaUnitStorer;
import org.kermeta.io.plugin.IOPlugin;
import org.kermeta.loader.FrameworkMapping;

import fr.irisa.triskell.eclipse.emf.EMFRegistryHelper;
import fr.irisa.triskell.kermeta.exceptions.URIMalformedException;
import fr.irisa.triskell.kermeta.language.structure.Package;
import fr.irisa.triskell.kermeta.language.structure.TypeDefinition;
import fr.irisa.triskell.kermeta.loader.ecore.Ecore2KMLoader;
import fr.irisa.triskell.kermeta.loader.ecore.EcoreBuildingState;
import fr.irisa.triskell.kermeta.loader.java.JavaBuildingState;
import fr.irisa.triskell.kermeta.loader.java.JavaKermetaUnitLoader;
import fr.irisa.triskell.kermeta.loader.km.KMUnitLoader;
import fr.irisa.triskell.kermeta.loader.km.KmBuildingState;
import fr.irisa.triskell.kermeta.loader.kmt.AbstractBuildingState;
import fr.irisa.triskell.kermeta.loader.kmt.KMTBuildingState;
import fr.irisa.triskell.kermeta.loader.kmt.KMTUnitLoader;
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
 *   <li>{@link org.kermeta.io.impl.KermetaUnitStorerImpl#getKermetaUnitsBeingLoaded <em>Kermeta Units Being Loaded</em>}</li>
 *   <li>{@link org.kermeta.io.impl.KermetaUnitStorerImpl#getKermetaUnitsBeingUnloaded <em>Kermeta Units Being Unloaded</em>}</li>
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
	 * The cached value of the '{@link #getKermetaUnitsBeingLoaded() <em>Kermeta Units Being Loaded</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKermetaUnitsBeingLoaded()
	 * @generated
	 * @ordered
	 */
	protected EList<KermetaUnit> kermetaUnitsBeingLoaded;

	/**
	 * The cached value of the '{@link #getKermetaUnitsBeingUnloaded() <em>Kermeta Units Being Unloaded</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKermetaUnitsBeingUnloaded()
	 * @generated
	 * @ordered
	 */
	protected EList<KermetaUnit> kermetaUnitsBeingUnloaded;

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
	 * @generated
	 */
	public EList<KermetaUnit> getKermetaUnitsBeingLoaded() {
		if (kermetaUnitsBeingLoaded == null) {
			kermetaUnitsBeingLoaded = new EObjectResolvingEList<KermetaUnit>(KermetaUnit.class, this, IoPackage.KERMETA_UNIT_STORER__KERMETA_UNITS_BEING_LOADED);
		}
		return kermetaUnitsBeingLoaded;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<KermetaUnit> getKermetaUnitsBeingUnloaded() {
		if (kermetaUnitsBeingUnloaded == null) {
			kermetaUnitsBeingUnloaded = new EObjectResolvingEList<KermetaUnit>(KermetaUnit.class, this, IoPackage.KERMETA_UNIT_STORER__KERMETA_UNITS_BEING_UNLOADED);
		}
		return kermetaUnitsBeingUnloaded;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws MalformedURIException 
	 * @generated NOT
	 */
	public KermetaUnit get(String uri) throws URIMalformedException {
			
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
			if ( extension.equals("kmt") )
				kermetaUnit.setBuildingState( new KMTBuildingState() );
			else if ( extension.equals("ecore") || uri.equals(IOPlugin.ECORE_URI) )
				kermetaUnit.setBuildingState( new EcoreBuildingState() );
			else if ( extension.equals("km") )
				kermetaUnit.setBuildingState( new KmBuildingState() );
			else if ( extension.equals("jar") )
				kermetaUnit.setBuildingState( new JavaBuildingState() );
			else if ( ! EMFRegistryHelper.isRegistered( kermetaUnitURI ) ) {
				kermetaUnit.setBuildingState( new AbstractBuildingState() );
				kermetaUnit.error("Unknown Format. It is impossible to load this file.\n You may have to register this URI.");
			} else {
				Object o = Registry.INSTANCE.get( kermetaUnitURI );
				if ( o instanceof Package )
					kermetaUnit.setBuildingState( new KmBuildingState() );
				else if ( o instanceof EPackage.Descriptor ) {
					EPackage p = ((EPackage.Descriptor) o).getEPackage();
					if ( p instanceof Package )
						kermetaUnit.setBuildingState( new KmBuildingState() );
					else
						kermetaUnit.setBuildingState( new EcoreBuildingState() );
				}
				else if ( o instanceof EPackage ) {
					kermetaUnit.setBuildingState( new EcoreBuildingState() );
				} else
					kermetaUnit.error("Unknown Format. It is impossible to load this registered resource.");
				
			}

			WeakReference reference = new WeakReference( kermetaUnit );
	        return (KermetaUnit) reference.get();

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
		
		Iterator <KermetaUnit> iterator = getKermetaUnits().iterator();
		while ( iterator.hasNext() ) {
			KermetaUnit current = iterator.next();
			if ( current.getUri().equals(realURI) ) {
				WeakReference reference = new WeakReference( current );
		        return (KermetaUnit) reference.get();
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws URIMalformedException 
	 * @generated NOT
	 */
	public void load(String uri, Map<Object, Object> options, IProgressMonitor monitor) throws URIMalformedException {
		int index = uri.lastIndexOf(".");
		String extension = uri.substring(index+1);
		
		KermetaUnit kermetaUnit = get(uri);
		kermetaUnit.lock();
/*		
 * synchronized( getKermetaUnitsBeingUnloaded() ) {
			while ( getKermetaUnitsBeingUnloaded().contains(kermetaUnit) ) {
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			getKermetaUnitsBeingLoaded().add( kermetaUnit );
		}*/

		synchronized( getKermetaUnitsBeingLoaded() ) {
			getKermetaUnitsBeingLoaded().add( kermetaUnit );
		}

		try {
			
			if ( extension.equals("kmt") ) {
			
				KMTUnitLoader loader = new KMTUnitLoader(options, monitor);
				loader.load(uri);
			
			} else if ( extension.equals("km") ) {
				
				KMUnitLoader loader = new KMUnitLoader(options, monitor);
				loader.load(uri);
				
			} else if ( extension.equals("ecore") || uri.equals(IOPlugin.ECORE_URI) ) {
				
				Ecore2KMLoader loader = new Ecore2KMLoader(options, monitor);
				loader.load(uri);
				
			} else if ( extension.equals("jar") ) {
			
				JavaKermetaUnitLoader loader = new JavaKermetaUnitLoader(options, monitor);
				loader.load(uri);
			
			} else if ( uri.matches("http://.+") ) {
				if ( EMFRegistryHelper.isDynamicallyRegistered(uri) ) {
					// TODO
					// Looking for the factory and see if the file can be translated into kermeta.
				}
			}

		} finally {
			synchronized( getKermetaUnitsBeingLoaded() ) {
				getKermetaUnitsBeingLoaded().remove( kermetaUnit );
				getKermetaUnitsBeingLoaded().notify();
			}
		}		
		kermetaUnit.unlock();
		
		/*synchronized( getKermetaUnitsBeingLoaded() ) {
			getKermetaUnitsBeingLoaded().remove( kermetaUnit );
			notify();
		}*/
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws URIMalformedException 
	 * @generated NOT
	 */
	public void load(String uri, IProgressMonitor monitor) throws URIMalformedException {
		load(uri, new HashMap<Object, Object>(), monitor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	synchronized public void unload(String uri) {

		KermetaUnit kermetaUnit = find(uri);
		if ( kermetaUnit != null ) {
			
			while ( getKermetaUnitsBeingLoaded().contains(kermetaUnit) ) {
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
/*			synchronized ( getKermetaUnitsBeingLoaded() ) {
				while ( getKermetaUnitsBeingLoaded().contains(kermetaUnit) ) {
					try {
						wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				getKermetaUnitsBeingUnloaded().add( kermetaUnit );
			}*/
			
			getKermetaUnits().remove( kermetaUnit );
		
			for ( TypeDefinition typeDefinition : KermetaUnitHelper.getInternalTypeDefinitions( kermetaUnit ) ) {
				//typeDefinition.getAspects().clear();
				typeDefinition.getBaseAspects().clear();
				typeDefinition.getOwnedTag().clear();
				typeDefinition.getTag().clear();

				for ( KermetaUnit importer : kermetaUnit.getImportedKermetaUnits() ) {
					String qualifiedName1 = NamedElementHelper.getQualifiedName(typeDefinition);
					for ( TypeDefinition baseClass : importer.getAspects().keySet() ) {
						String qualifiedName2 = NamedElementHelper.getQualifiedName(baseClass);
						if ( qualifiedName1.equals(qualifiedName2) )
							importer.getAspects().get(baseClass).remove( typeDefinition );
					}
					AbstractBuildingState state = (AbstractBuildingState) importer.getBuildingState();
					state.aspectsDone = false;
				}
			
			}
			
			kermetaUnit.getImportedKermetaUnits().clear();			
			kermetaUnit.getImporters().clear();		
			
			for ( Package p : (List<Package>) kermetaUnit.getInternalPackages() ) {
				p.getOwnedTag().clear();
				p.getTag().clear();
				p.getOwnedTypeDefinition().clear();
			}
			
			for ( List<TypeDefinition> l : kermetaUnit.getAspects().values() ) {
				l.clear();
			}
			
			kermetaUnit.getAspects().clear();
			kermetaUnit.getInternalPackageEntries().clear();
			kermetaUnit.getExternalPackageEntries().clear();
			kermetaUnit.getMessages().clear();
			kermetaUnit.setTracer(null);
			kermetaUnit.setModelingUnit(null);
			kermetaUnit.setStorer(null);
			kermetaUnit.setTypeDefinitionCache(null);
			
			/*synchronized( getKermetaUnitsBeingUnloaded() ) {
				getKermetaUnitsBeingUnloaded().remove( kermetaUnit );
				notify();
			}*/
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
			case IoPackage.KERMETA_UNIT_STORER__KERMETA_UNITS_BEING_LOADED:
				return getKermetaUnitsBeingLoaded();
			case IoPackage.KERMETA_UNIT_STORER__KERMETA_UNITS_BEING_UNLOADED:
				return getKermetaUnitsBeingUnloaded();
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
			case IoPackage.KERMETA_UNIT_STORER__KERMETA_UNITS_BEING_LOADED:
				getKermetaUnitsBeingLoaded().clear();
				getKermetaUnitsBeingLoaded().addAll((Collection<? extends KermetaUnit>)newValue);
				return;
			case IoPackage.KERMETA_UNIT_STORER__KERMETA_UNITS_BEING_UNLOADED:
				getKermetaUnitsBeingUnloaded().clear();
				getKermetaUnitsBeingUnloaded().addAll((Collection<? extends KermetaUnit>)newValue);
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
			case IoPackage.KERMETA_UNIT_STORER__KERMETA_UNITS_BEING_LOADED:
				getKermetaUnitsBeingLoaded().clear();
				return;
			case IoPackage.KERMETA_UNIT_STORER__KERMETA_UNITS_BEING_UNLOADED:
				getKermetaUnitsBeingUnloaded().clear();
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
			case IoPackage.KERMETA_UNIT_STORER__KERMETA_UNITS_BEING_LOADED:
				return kermetaUnitsBeingLoaded != null && !kermetaUnitsBeingLoaded.isEmpty();
			case IoPackage.KERMETA_UNIT_STORER__KERMETA_UNITS_BEING_UNLOADED:
				return kermetaUnitsBeingUnloaded != null && !kermetaUnitsBeingUnloaded.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //KermetaUnitStorerImpl