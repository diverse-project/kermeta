
/*$Id: SaverOrLoader.java,v 1.13 2009-01-21 09:16:06 cfaucher Exp $
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
import org.eclipse.emf.codegen.util.CodeGenUtil;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EPackage.Registry;
import org.eclipse.emf.ecore.resource.Resource;
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
		
		for( EClassifier eclassifier : target_root_epack.getEClassifiers() ) {
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
		
		EPackage current_EPackage = Registry.INSTANCE.getEPackage(metamodelURI);
		
		if( current_EPackage == null ) {
			String tmp_ns_uri = sourceObject.eClass().getEPackage().getNsURI();
			if( tmp_ns_uri.contains(uri_suffix) ) {
				metamodelURI = tmp_ns_uri.replace(uri_suffix, "");
			} else {
				metamodelURI = tmp_ns_uri + uri_suffix;
			}
			current_EPackage = Registry.INSTANCE.getEPackage(metamodelURI);
		}
		
		if( current_EPackage != null ) {
			
			if( current_EPackage.getClass() != org.eclipse.emf.ecore.impl.EPackageImpl.class ) { //The EPackage does not come from an Ecore file
				EPackage root_pack = getRootEPackage(current_EPackage);
				
				EObject targetObject = EcoreUtil.create(getTargetEClassGenerated(root_pack, sourceObject.eClass()));
					
				// Make the mapping between the source object and the target one.
				_instanceMapping.put(sourceObject, targetObject);
				return targetObject;
				
			} else {
				EPackage root_pack = getRootEPackage(current_EPackage);
				org.eclipse.emf.ecore.EClass eClass = getTargetEClass(root_pack, sourceObject.eClass());
				EObject targetObject = (EObject) EcoreUtil.create(eClass);
				// Make the mapping between the source object and the target one.
				_instanceMapping.put(sourceObject, targetObject);
				return targetObject;
			}
			                     
		} else {
			return null;
		}
		
	}
	
	/**
	 * @generated
	 * @unused for the moment
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
	 * @unused for the moment
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

		EPackage tmp_epack = Registry.INSTANCE.getEPackage(metamodelURI);
		EPackage current_EPackage = null;
		
		if(tmp_epack==null) {
			String tmp_ns_uri = ((EPackage) sourceObject.eContainer().eContainer()).getNsURI();
			if( tmp_ns_uri.contains(uri_suffix) ) {
				current_EPackage = Registry.INSTANCE.getEPackage(tmp_ns_uri.replace(uri_suffix, ""));
			} else {
				current_EPackage = Registry.INSTANCE.getEPackage(tmp_ns_uri + uri_suffix);
			}
		} else {
			EPackage root_pack = getRootEPackage(tmp_epack);
		
			String enumQName = EcoreHelper.getQualifiedName((org.eclipse.emf.ecore.ENamedElement) sourceObject.getEEnum().eContainer(), ".");
			current_EPackage = getPackPack(root_pack, enumQName);
		}
		
		String container_name = ((org.eclipse.emf.ecore.ENamedElement) sourceObject.getEEnum().eContainer()).getName();
		
		String java_qname_package = current_EPackage.getClass().getName();
		String str_enum = java_qname_package.replace(".impl." + CodeGenUtil.capName(container_name) + "PackageImpl", "." + sourceObject.getEEnum().getName());
		
		if(str_enum.equals("ecore.impl.EcorePackageImpl") && metamodelURI.equals(org.eclipse.emf.ecore.EcorePackage.eNS_URI + this.uri_suffix)) {
			if(sourceObject.eContainer().eContainer().getClass() == org.eclipse.emf.ecore.impl.EPackageImpl.class) {
				return (Enumerator) EcoreUtil.createFromString((EEnum) sourceObject.eContainer(), sourceObject.getLiteral());
			}
		}
		
		Class<?> str_pack_Class = null;
		
		try {
			str_pack_Class = SaverOrLoader.class.getClassLoader().loadClass(str_enum);
		
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		try {
			String creationMethodName = "getByName";
			Method method = str_pack_Class.getMethod(creationMethodName, java.lang.String.class);
			Enumerator targetObject = (Enumerator) method.invoke(str_pack_Class, new Object[] {sourceObject.getLiteral()});
			return targetObject;
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println("createInstance(EEnumLiteral sourceObject, String metamodelURI): " + sourceObject.eContainer() + " - "+ sourceObject.getLiteral() + " - " + str_enum);
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
	protected java.lang.Object createInstance(Enumerator sourceObject, String metamodelURI) {
		
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
			e1.printStackTrace();
		} catch (NoSuchFieldException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		
		EFactory factory = getTargetEFactory(root_pack, _epack);
		
		try {
			String creationMethodName = "create" + sourceObject.getClass().getSimpleName() + "FromString";
			Method method = factory.getClass().getMethod(creationMethodName, new Class[] {EDataType.class, String.class});
			Enumerator targetObject = (Enumerator) method.invoke(factory, new Object[] {null, sourceObject.getLiteral()});
			return targetObject;
		} catch (Exception e) {
			if( Registry.INSTANCE.getEPackage(metamodelURI).getClass() == org.eclipse.emf.ecore.impl.EPackageImpl.class ) {
			
				if(sourceObject.getClass().isEnum()) {
					
					String u_uri = _epack.getNsURI();
					if( u_uri.contains(uri_suffix) ) {
						u_uri = u_uri.replace(uri_suffix, "");
					} else {
						u_uri += uri_suffix;
					}
					
					for(EClassifier eClassifier : Registry.INSTANCE.getEPackage(u_uri).getEClassifiers()) {
						if( eClassifier.getName().equals(sourceObject.getClass().getSimpleName()) ) {
							EDataType eenum = (EDataType) eClassifier;
							return EcoreUtil.createFromString(eenum, sourceObject.getLiteral());
						}
					}
				}
			}
			System.err.println("createInstance(Enumerator sourceObject, String metamodelURI): " + sourceObject.toString());
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
			str_clazz = PersistenceMapping.getInstance().uri_ePackageClass.get(metamodelURI);
		}
		
		if( str_clazz!=null ) {
			try {
				Class<?> clazz = SaverOrLoader.class.getClassLoader().loadClass(str_clazz);
				
				Field field = clazz.getField("eINSTANCE");
				EPackage ePackage = (EPackage) field.get(null);
				
				Registry.INSTANCE.put( metamodelURI, ePackage );
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			} catch (NoSuchFieldException e) {
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
	
	public org.eclipse.emf.ecore.EClass getTargetEClassGenerated(EPackage root_pack, org.eclipse.emf.ecore.EClass eClass) {
		for(EClassifier e : getPackPack(root_pack, EcoreHelper.getQualifiedName(eClass.getEPackage(), ".")).getEClassifiers() ) {
			if(e instanceof org.eclipse.emf.ecore.EClass && e.getName().equals(eClass.getName()) ) {
				return (org.eclipse.emf.ecore.EClass) e;
			}
		}
		return null;
	}
	
}