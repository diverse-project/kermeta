
/*$Id: SaverOrLoader.java,v 1.6 2008-10-17 14:40:53 cfaucher Exp $
* Project : org.kermeta.framework.compiled.runtime.helper
* File : 	SaverOrLoader.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 24 juin 08
* Authors : paco
*/
package org.kermeta.compil.runtime.helper.persistence;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EPackage.Registry;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ExtensibleURIConverterImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.kermeta.compil.runtime.PersistenceMapping;

import fr.irisa.triskell.eclipse.ecore.EcoreHelper;

abstract public class SaverOrLoader {

	/**
	 * A table to map each source object to their corresponding target object.
	 * Note that the mapping is one to one.
	 */
	protected Hashtable<EObject, EObject> _instanceMapping = new Hashtable<EObject, EObject>();

	/**
	 * Get the factory to use to create target objects conforming to the generated metamodel.
	 * To do that, the factory used to create instances coming from the package with the given uri is retrieved.
	 * With that Factory, look for a mapping and get the corresponding factory.
	 * @param metamodelURI The uri of the package
	 * @return The factory if the there is a mapping or null if any.
	 */
	abstract protected EFactory getFactory(String metamodelURI);
	
	/**		*/
	private String metamodelURI;

	private String metamodelURISpecialCompiler;
	
	/**		*/
	//private List<EFactory> _factories;
	
	/**
	 * 
	 */
	/*private void initialize() {
		_factories = getFactories( getFactory(_metamodelURI).getEPackage() );
	}*/
	
	/**
	 * 
	 * @param metamodelURI
	 */
	protected SaverOrLoader(String metamodelURI) {
		this.metamodelURI = metamodelURI;
		this.metamodelURISpecialCompiler = this.metamodelURI + "/kermeta_temp_uri";
		//initialize();
	}
	
	public EPackage getRootEPackage(EPackage pack) {
		if( pack.eContainer()!=null && pack.eContainer() instanceof EPackage ) {
			getRootEPackage((EPackage) pack.eContainer());
		}
		return pack;
	}
	
	public EFactory getTargetEFactory(EPackage target_root_epack, EPackage source_epack) {
		return getTargetEFactory(target_root_epack, EcoreHelper.getQualifiedName(source_epack, "."));
	}
	
	public EFactory getTargetEFactory(EPackage target_root_epack, String source_epack_qn) {
		String[] array_qualified_name = source_epack_qn.split("\\.");
		
		for(int i=1; i<array_qualified_name.length ; i++ ) {
			target_root_epack = getEPackageBySimpleName(target_root_epack, array_qualified_name[i]);
		}
		if( target_root_epack==null ) {
			return null;
		}
		
		return target_root_epack.getEFactoryInstance();
	}
	
	public org.eclipse.emf.ecore.EClass getTargetEClass(EPackage target_root_epack, org.eclipse.emf.ecore.EClass source_eclass) {
		return getTargetEClass(target_root_epack, EcoreHelper.getQualifiedName(source_eclass, "."));
	}
	
	public org.eclipse.emf.ecore.EClass getTargetEClass(EPackage target_root_epack, String source_eclass_qn) {
		String[] array_qualified_name = source_eclass_qn.split("\\.");
		
		for(int i=1; i<(array_qualified_name.length-1) ; i++ ) {
			target_root_epack = getEPackageBySimpleName(target_root_epack, array_qualified_name[i]);
		}
		if( target_root_epack==null ) {
			return null;
		}
		
		for( org.eclipse.emf.ecore.EClassifier eclassifier : target_root_epack.getEClassifiers() ) {
			if( eclassifier instanceof org.eclipse.emf.ecore.EClass ) {
				if( eclassifier.getName().equals(array_qualified_name[array_qualified_name.length-1]) ) {
					return (org.eclipse.emf.ecore.EClass) eclassifier;
				}
			}
		}
		
		return null;
	}

	private EPackage getEPackageBySimpleName(EPackage _epack, String search_name) {
		for(EPackage epack : _epack.getESubpackages()) {
			if(epack.getName().equals(search_name)) {
				return epack;
			}
		}
		return null;
	}
	
	/**
	 * Create an instance which metaclass comes from the target metamodel. The metaclass is retrieved with the source metaclass and the 
	 * instantiation is done by the factory.
	 * @param sourceObject
	 * @param factory
	 * @return
	 */
	protected EObject createInstance(EObject sourceObject, String metamodelURI) {
		
		// Getting the name of the method to call.
		// In factory classes, it is always something like create* where * corresponds to the class name to be created.
		String creationMethodName = "create" + sourceObject.eClass().getName();
		
		if( Registry.INSTANCE.getEFactory(metamodelURI) != null ) {
			
			if( Registry.INSTANCE.getEPackage(metamodelURI).getClass() != org.eclipse.emf.ecore.impl.EPackageImpl.class ) {
				EPackage root_pack = getRootEPackage(Registry.INSTANCE.getEPackage(metamodelURI));
				EFactory factory = getTargetEFactory(root_pack, sourceObject.eClass().getEPackage());
				
				try {
					Method method = factory.getClass().getMethod(creationMethodName, new Class[] {});
					EObject targetObject = (EObject) method.invoke(factory, new Object[] {});
					// Make the mapping between the source object and the target one.
					_instanceMapping.put(sourceObject, targetObject);
					return targetObject;
				} catch (Exception e) {
					System.out.println();
				}
			} else {
				EPackage root_pack = getRootEPackage(Registry.INSTANCE.getEPackage(metamodelURI));
				org.eclipse.emf.ecore.EClass eClass = getTargetEClass(root_pack, sourceObject.eClass());
				EObject targetObject = (EObject) EcoreUtil.create(eClass);
				// Make the mapping between the source object and the target one.
				_instanceMapping.put(sourceObject, targetObject);
				return targetObject;
			}
			                     
		} else {
			System.out.println();
		
		/*IFile file_from_uri = ResourceHelper.getIFile(uri, true);
		// the uri is a file
		
		
		
		if( file_from_uri!=null ) {

			URIConverter c = new ExtensibleURIConverterImpl();
    		URI u;
    		u.resolve(c.normalize(URI.createFileURI(file_from_uri.getLocation().toString())));
			ResourceSet resource_set = new ResourceSetImpl();
			org.eclipse.emf.ecore.resource.Resource res = resource_set.createResource(u);
			res.load(null);
			
			//Collect the uri
			for(EObject eobj : res.getContents() ) {
				if( eobj instanceof EPackage ) {
					EPackage pack = (EPackage) eobj;
					//pack
				}
			}
			
		}*/
		}
		
		
		
		/*for ( EFactory factory : _factories ) {
			// courtcircuit if possible.
			if ( sourceObject.eClass().getEPackage().getEFactoryInstance() == factory ) {
				System.out.println("Warning: SaverOrLoader.createInstance");
				return sourceObject;
			}
			try {
				Method method = factory.getClass().getMethod(creationMethodName, new Class[] {});
				EObject targetObject = (EObject) method.invoke(factory, new Object[] {});
				// Make the mapping between the source object and the target one.
				_instanceMapping.put(sourceObject, targetObject);
				return targetObject;
			} catch (Exception e) {
			}
		}*/
		return null;
	}
	
	/**
	 * Get all factories used by the given package and its subpackages.
	 * @param p
	 * @return
	 */
	private List<EFactory> getFactories(EPackage p) {
		List<EPackage> l = new ArrayList<EPackage>();
		getEPackages(l, p);
		List<EFactory> factories = new ArrayList<EFactory>();
		for ( EPackage current : l )
			factories.add(current.getEFactoryInstance());
		return factories;
	}
	
	/**
	 * Getting the list of all packages contained by the given package.
	 * @param l
	 * @param p
	 */
	private void getEPackages(List<EPackage> l, EPackage p) {
		l.add(p);
		for ( EPackage current : p.getESubpackages() )
			getEPackages(l, current);
	}
	
	/**
	 * Create an enumerator from the factory given a source enumerator.
	 * @param sourceObject
	 * @param factory
	 * @return
	 */
	protected Enumerator createInstance(Enumerator sourceObject, String metamodelURI) {

		EPackage root_pack = getRootEPackage(Registry.INSTANCE.getEPackage(metamodelURI));
		String tmp_pack_qn = sourceObject.getClass().getCanonicalName().replace("." + sourceObject.getClass().getSimpleName(), "");
		String str_pack = tmp_pack_qn;
		String[] tab_ = tmp_pack_qn.split("\\.");
		str_pack = str_pack + "." + tab_[tab_.length-1].substring(0, 1).toUpperCase() + tab_[tab_.length-1].substring(1, tab_[tab_.length-1].length()) + "Package";
		
		Class<?> str_pack_Class;

		EPackage _epack = null;
		try {
			str_pack_Class = SaverOrLoader.class.getClassLoader().loadClass(str_pack);
		
			Field field = str_pack_Class.getField("eINSTANCE");
			_epack = (EPackage) field.get(null);
		
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		EFactory factory = getTargetEFactory(root_pack, _epack);
		
		try {
			String creationMethodName = "create" + sourceObject.getClass().getSimpleName() + "FromString";
			Method method = factory.getClass().getMethod(creationMethodName, new Class[] {EDataType.class, String.class});
			Enumerator targetObject = (Enumerator) method.invoke(factory, new Object[] {null, sourceObject.getLiteral()});
			return targetObject;
		} catch (Exception e) {
		}
		//}
		return null;
	}
	
	public String getMetamodelURI() {
		return metamodelURI;
	}

	public String getMetamodelURISpecialCompiler() {
		return metamodelURISpecialCompiler;
	}
	
	public void normalizeRegistry(String _modelURI, String _metamodelURI) {
		if( !Registry.INSTANCE.containsKey(_metamodelURI) ) {
			registerTheUri(_metamodelURI);
		}

		String fileExtension = getFileExtension(_modelURI);
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(fileExtension, new XMIResourceFactoryImpl());
	}
	
	public static String getFileExtension( String modelURI ) {
		String[] seg_modelURI = modelURI.split("\\.");
		return seg_modelURI[seg_modelURI.length-1];
	}
	
	public static void registerEcoreMetamodel(String uri){
		
		//Register the Ecore metamodel
        Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(org.eclipse.emf.ecore.EcorePackage.eNAME, new XMIResourceFactoryImpl());
        ResourceSet resource_set = new ResourceSetImpl();
        URI u = URI.createURI(uri);//file.getFullPath().toString());
        u = new ExtensibleURIConverterImpl().normalize(u);
        Resource resource = resource_set.getResource(u, true);
            
        for(EObject eobj : resource.getContents()) {
        	if( eobj instanceof EPackage) {
    			registerPackages((EPackage) eobj);
    		}
    	}
	}
	
	/**
	 * Register the given EPackage and all its contained EPackages
	 * @param pack
	 */
	public static void registerPackages(EPackage pack) {
		String packNsURI = pack.getNsURI();
		if( packNsURI != null && !packNsURI.equals("") ) {
			Registry.INSTANCE.put(packNsURI, pack);

			for(EPackage subPack : pack.getESubpackages()) {
				registerPackages(subPack);
			}
		}
	}
	
	public static void registerTheUri(String metamodelURI) {
		
		String str_clazz = null;
		IConfigurationElement element = null;
		if( Platform.isRunning() ) {
			element = getIConfigurationElementByUri(metamodelURI);
		
			if( element != null ) {
				str_clazz = element.getAttribute("class");
			}
		} else {
			str_clazz = PersistenceMapping.uri_ePackageClass.get(metamodelURI);
		}
		
		if( str_clazz!=null ) {
			try {
				Class<?> clazz = SaverOrLoader.class.getClassLoader().loadClass(str_clazz);
				
				Field field = clazz.getField("eINSTANCE");
				EPackage ePackage = (EPackage) field.get(null);
				
				Registry.INSTANCE.put( metamodelURI, ePackage );
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SecurityException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (NoSuchFieldException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	private static IConfigurationElement getIConfigurationElementByUri(String metamodelURI) {
		IConfigurationElement[] elements = Platform.getExtensionRegistry().getConfigurationElementsFor("org.eclipse.emf.ecore.generated_package");
		for( IConfigurationElement currentElement : elements ) {
			if ( currentElement.getAttribute("uri").equals( metamodelURI ) ) {
				return currentElement;
			}
		}
		return null;
	}
	
}