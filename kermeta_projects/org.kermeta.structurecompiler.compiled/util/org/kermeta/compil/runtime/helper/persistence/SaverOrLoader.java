
/*$Id: SaverOrLoader.java,v 1.9 2008-10-30 17:37:06 cfaucher Exp $
* Project : org.kermeta.compiler.generator
* File : 	SaverOrLoader.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 24 juin 08
* Authors : 
* 			Francois TANGUY	<ftanguy@irisa.fr>
* 			Cyril FAUCHER	<cfaucher@irisa.fr>
*/

package org.kermeta.compil.runtime.helper.persistence;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.codegen.CodeGen;
import org.eclipse.emf.codegen.util.CodeGenUtil;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
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

/**
 * @generated
 *
 */
abstract public class SaverOrLoader {

	/**
	 * @generated
	 * A table to map each source object to their corresponding target object.
	 * Note that the mapping is one to one.
	 */
	protected Hashtable<EObject, EObject> _instanceMapping = new Hashtable<EObject, EObject>();

	/**
	 * @generated
	 * Get the factory to use to create target objects conforming to the generated metamodel.
	 * To do that, the factory used to create instances coming from the package with the given uri is retrieved.
	 * With that Factory, look for a mapping and get the corresponding factory.
	 * @param metamodelURI The uri of the package
	 * @return The factory if the there is a mapping or null if any.
	 */
	abstract protected EFactory getFactory(String metamodelURI);
	
	/**
	 * uri of the metamodel used to load or save the given resource
	 */
	private String metamodelURI;
	
	/**
	 * uri of the metamodel used to load or save the given resource in the compiled side
	 */
	private String metamodelURISpecialCompiler;

	private final String uri_suffix = "/kermeta_temp_uri";
	
	/**
	 * @generated
	 * @param metamodelURI
	 */
	protected SaverOrLoader(String metamodelURI) {
		this.metamodelURI = metamodelURI;
		this.metamodelURISpecialCompiler = this.metamodelURI + this.uri_suffix;
		//initialize();
	}
	
	/**
	 * @generated
	 * @param pack
	 * @return
	 */
	public EPackage getRootEPackage(EPackage pack) {
		if( pack.eContainer()!=null && pack.eContainer() instanceof EPackage ) {
			getRootEPackage((EPackage) pack.eContainer());
		}
		return pack;
	}
	
	/**
	 * @generated
	 * @param target_root_epack
	 * @param source_epack
	 * @return
	 */
	public EFactory getTargetEFactory(EPackage target_root_epack, EPackage source_epack) {
		
		EFactory factory = getTargetEFactory(target_root_epack, EcoreHelper.getQualifiedName(source_epack, "."));
		
		if(factory==null) {
			String tmp_ns_uri = source_epack.getNsURI();
			if( tmp_ns_uri.contains(uri_suffix) ) {
				factory = Registry.INSTANCE.getEFactory(tmp_ns_uri.replace(uri_suffix, ""));
			} else {
				factory = Registry.INSTANCE.getEFactory(tmp_ns_uri + uri_suffix);
			}
		}
		
		return factory;
	}
	
	/**
	 * @generated
	 * @param target_root_epack
	 * @param source_epack_qn
	 * @return
	 */
	public EFactory getTargetEFactory(EPackage target_root_epack, String source_epack_qn) {
		EcoreHelper.getQualifiedName(target_root_epack);
		String[] array_qualified_name = source_epack_qn.split("\\.");
		
		for(int i=1; i<array_qualified_name.length ; i++ ) {
			target_root_epack = getEPackageBySimpleName(target_root_epack, array_qualified_name[i]);
		}
		if( target_root_epack==null ) {
			return null;
		}
		
		return target_root_epack.getEFactoryInstance();
	}
	
	public EPackage getPackPack(EPackage target_root_epack, String source_epack_qn) {
		String[] array_qualified_name = source_epack_qn.split("\\.");
		
		for(int i=1; i<array_qualified_name.length ; i++ ) {
			target_root_epack = getEPackageBySimpleName(target_root_epack, array_qualified_name[i]);
		}
		if( target_root_epack==null ) {
			return null;
		}
		
		return target_root_epack;
	}
	
	/**
	 * @generated
	 * @param target_root_epack
	 * @param source_eclass
	 * @return
	 */
	public org.eclipse.emf.ecore.EClass getTargetEClass(EPackage target_root_epack, org.eclipse.emf.ecore.EClass source_eclass) {
		return getTargetEClass(target_root_epack, EcoreHelper.getQualifiedName(source_eclass, "."));
	}
	
	/**
	 * @generated
	 * @param target_root_epack
	 * @param source_eclass_qn
	 * @return
	 */
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

	/**
	 * @generated
	 * @param _epack
	 * @param search_name
	 * @return
	 */
	private EPackage getEPackageBySimpleName(EPackage _epack, String search_name) {
		for(EPackage epack : _epack.getESubpackages()) {
			if(epack.getName().equals(search_name)) {
				return epack;
			}
		}
		return null;
	}
	
	/**
	 * @generated
	 * Create an instance which metaclass comes from the target metamodel. The metaclass is retrieved with the source metaclass and the 
	 * instantiation is done by the factory.
	 * @param sourceObject
	 * @param factory
	 * @return
	 */
	protected EObject createInstance(EObject sourceObject, String metamodelURI) {
		
		//System.out.println("Registry.INSTANCE.getEFactory(metamodelURI): " + Registry.INSTANCE.getEFactory(metamodelURI).toString());
		
		//System.out.println(sourceObject.eClass().getEPackage().getNsURI());
		
		if( Registry.INSTANCE.getEFactory(metamodelURI) != null ) {
			
			if( Registry.INSTANCE.getEPackage(metamodelURI).getClass() != org.eclipse.emf.ecore.impl.EPackageImpl.class ) { //The EPackage does not come from an Ecore file
				EPackage root_pack = getRootEPackage(Registry.INSTANCE.getEPackage(metamodelURI));
				//System.out.println("pack: " + EcoreHelper.getQualifiedName(sourceObject.eClass().getEPackage(), "._"));
				EFactory factory = getTargetEFactory(root_pack, sourceObject.eClass().getEPackage());
				
				try {
					// Getting the name of the method to call.
					// In factory classes, it is always something like create* where * corresponds to the class name to be created.
					String creationMethodName = "create" + sourceObject.eClass().getName();
					
					Method method = factory.getClass().getMethod(creationMethodName, new Class[] {});
					EObject targetObject = (EObject) method.invoke(factory, new Object[] {});
					// Make the mapping between the source object and the target one.
					_instanceMapping.put(sourceObject, targetObject);
					return targetObject;
				} catch (Exception e) {
					e.printStackTrace();
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
			return null;
		}
		
		return null;
	}
	
	/**
	 * @generated
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
	 * @generated
	 * Getting the list of all packages contained by the given package.
	 * @param l
	 * @param p
	 */
	private void getEPackages(List<EPackage> l, EPackage p) {
		l.add(p);
		for ( EPackage current : p.getESubpackages() )
			getEPackages(l, current);
	}
	
	protected Enumerator createInstance(EEnumLiteral sourceObject, String metamodelURI) {
		
		EPackage root_pack = getRootEPackage(Registry.INSTANCE.getEPackage(metamodelURI));
		
		String enumQName = EcoreHelper.getQualifiedName((org.eclipse.emf.ecore.ENamedElement) sourceObject.getEEnum().eContainer(), ".");
		EPackage epapa = getPackPack(root_pack, enumQName);
		
		String pppp_name = ((org.eclipse.emf.ecore.ENamedElement) sourceObject.getEEnum().eContainer()).getName();
		
		String toto = epapa.getClass().getName();
		String str_enum = toto.replace(".impl." + CodeGenUtil.capName(pppp_name) + "PackageImpl", "." + sourceObject.getEEnum().getName());
		
		
		Class<?> str_pack_Class = null;
		
		try {
			str_pack_Class = SaverOrLoader.class.getClassLoader().loadClass(str_enum);
		
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			String creationMethodName = "getByName";
			Method method = str_pack_Class.getClass().getMethod(creationMethodName, new Class[] {});
			Enumerator targetObject = (Enumerator) method.invoke(str_pack_Class, new Object[] {sourceObject.getLiteral()});
			return targetObject;
		} catch (Exception e) {
		}
		
		return null;
	}
	
	/**
	 * @generated
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
			//System.out.println("sourceObject.getClass().getSimpleName(): " + sourceObject.getClass().getSimpleName() + " - " + factory.getClass().getName());
			String creationMethodName = "create" + sourceObject.getClass().getSimpleName() + "FromString";
			Method method = factory.getClass().getMethod(creationMethodName, new Class[] {EDataType.class, String.class});
			Enumerator targetObject = (Enumerator) method.invoke(factory, new Object[] {null, sourceObject.getLiteral()});
			return targetObject;
		} catch (Exception e) {
		}
		
		return null;
	}
	
	/**
	 * @generated
	 * @return
	 */
	public String getMetamodelURI() {
		return metamodelURI;
	}

	/**
	 * @generated
	 * @return
	 */
	public String getMetamodelURISpecialCompiler() {
		return metamodelURISpecialCompiler;
	}
	
	/**
	 * @generated
	 * @param _modelURI
	 * @param _metamodelURI
	 */
	public void normalizeRegistry(String _modelURI, String _metamodelURI) {
		if( !Registry.INSTANCE.containsKey(_metamodelURI) ) {
			registerTheUri(_metamodelURI);
		}
		String fileExtension = getFileExtension(_modelURI);
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(fileExtension, new XMIResourceFactoryImpl());
	}
	
	/**
	 * @generated
	 * @param modelURI
	 * @return
	 */
	public static String getFileExtension( String modelURI ) {
		String[] seg_modelURI = modelURI.split("\\.");
		return seg_modelURI[seg_modelURI.length-1];
	}
	
	/**
	 * @generated
	 * @param uri
	 */
	public static void registerEcoreMetamodel(String uri){
		
		//Get the Ecore metamodel
        Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(org.eclipse.emf.ecore.EcorePackage.eNAME, new XMIResourceFactoryImpl());
        ResourceSet resource_set = new ResourceSetImpl();
        URI u = URI.createURI(uri);
        u = new ExtensibleURIConverterImpl().normalize(u);
        Resource resource = resource_set.getResource(u, true);
            
        for(EObject eobj : resource.getContents()) {
        	if( eobj instanceof EPackage) {
    			registerPackages((EPackage) eobj);
    		}
    	}
	}
	
	/**
	 * @generated
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
	
	/**
	 * @generated
	 * @param metamodelURI
	 */
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
	
	/**
	 * @generated
	 * @param metamodelURI
	 * @return
	 */
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