/**
 * <copyright>
 * </copyright>
 *
 * $Id: KermetaUnitStorerImpl.java,v 1.6 2007-07-27 13:28:27 ftanguy Exp $
 */
package org.kermeta.io.impl;


import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.Iterator;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.EPackage.Registry;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.plugin.RegistryReader;
import org.eclipse.emf.ecore.plugin.RegistryReader.PluginClassDescriptor;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.ecore.xml.type.internal.DataValue.URI.MalformedURIException;
import org.kermeta.io.IoFactory;
import org.kermeta.io.IoPackage;
import org.kermeta.io.KermetaUnit;
import org.kermeta.io.KermetaUnitStorer;
import org.kermeta.io.plugin.IOPlugin;

import fr.irisa.triskell.eclipse.emf.EMFRegistryHelper;
import fr.irisa.triskell.kermeta.exceptions.URIMalformedException;
import fr.irisa.triskell.kermeta.language.structure.Package;
import fr.irisa.triskell.kermeta.loader.ecore.Ecore2KMLoader;
import fr.irisa.triskell.kermeta.loader.ecore.EcoreBuildingState;
import fr.irisa.triskell.kermeta.loader.java.JavaBuildingState;
import fr.irisa.triskell.kermeta.loader.java.JavaKermetaUnitLoader;
import fr.irisa.triskell.kermeta.loader.km.KMUnitLoader;
import fr.irisa.triskell.kermeta.loader.km.KmBuildingState;
import fr.irisa.triskell.kermeta.loader.kmt.KMTBuildingState;
import fr.irisa.triskell.kermeta.loader.kmt.KMTUnitLoader;

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
	protected EList kermetaUnits;

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
	protected EClass eStaticClass() {
		return IoPackage.Literals.KERMETA_UNIT_STORER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getKermetaUnits() {
		if (kermetaUnits == null) {
			kermetaUnits = new EObjectContainmentWithInverseEList(KermetaUnit.class, this, IoPackage.KERMETA_UNIT_STORER__KERMETA_UNITS, IoPackage.KERMETA_UNIT__STORER);
		}
		return kermetaUnits;
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
		
		if ( uri.equals("kermeta") ) {
			kermetaUnitURI = IOPlugin.FRAMEWORK_KM_URI;
			framework = true;
		} else if ( uri.equals(IOPlugin.FRAMEWORK_KM_URI) )
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
			else if ( ! EMFRegistryHelper.isRegistered( kermetaUnitURI ) )
				kermetaUnit.error("Unknown Format. It is impossible to load this file.");
			else {
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
		Iterator <KermetaUnit> iterator = getKermetaUnits().iterator();
		while ( iterator.hasNext() ) {
			KermetaUnit current = iterator.next();
			if ( current.getUri().equals(uri) ) {
				WeakReference reference = new WeakReference( current );
		        return (KermetaUnit) reference.get();
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void load(String uri) {
		load(uri, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void unload(String uri) {
		KermetaUnit kermetaUnit = find(uri);
		if ( kermetaUnit != null )
			getKermetaUnits().remove( kermetaUnit );
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void load(String uri, String content) {
		
		int index = uri.lastIndexOf(".");
		String extension = uri.substring(index+1);
		
		if ( extension.equals("kmt") ) {
		
			KMTUnitLoader loader = new KMTUnitLoader(content);
			loader.load(uri);
		
		} else if ( extension.equals("km") ) {
			
			KMUnitLoader loader = new KMUnitLoader();
			loader.load(uri);
			
		} else if ( extension.equals("ecore") || uri.equals(IOPlugin.ECORE_URI) ) {
			
			Ecore2KMLoader loader = new Ecore2KMLoader();
			loader.load(uri, true);
			
		} else if ( extension.equals("jar") ) {
		
			JavaKermetaUnitLoader loader = new JavaKermetaUnitLoader();
			loader.load(uri);
		
		} else if ( uri.matches("http://.+") ) {
	System.out.println();
			if ( EMFRegistryHelper.isDynamicallyRegistered(uri) ) {
				System.out.println();
				// TODO
				// Looking for the factory and see if the file can be translated into kermeta.
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IoPackage.KERMETA_UNIT_STORER__KERMETA_UNITS:
				return ((InternalEList)getKermetaUnits()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IoPackage.KERMETA_UNIT_STORER__KERMETA_UNITS:
				return ((InternalEList)getKermetaUnits()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case IoPackage.KERMETA_UNIT_STORER__KERMETA_UNITS:
				getKermetaUnits().clear();
				getKermetaUnits().addAll((Collection)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case IoPackage.KERMETA_UNIT_STORER__KERMETA_UNITS:
				return kermetaUnits != null && !kermetaUnits.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //KermetaUnitStorerImpl