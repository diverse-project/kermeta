/* $Id: CompilationUnitManager.java,v 1.1 2006-05-05 12:40:46 zdrey Exp $
 * Project    : fr.irisa.triskell.kermeta.io
 * File       : KermetaUnitManager.java
 * License    : EPL
 * Copyright  : IRISA / INRIA / Universite de Rennes 1
 * -------------------------------------------------------------------
 * Creation date : Apr 26, 2006
 * Authors : 
 *    zdrey <zdrey@irisa.fr>
 * Contributors :
 */
package fr.irisa.triskell.kermeta.loader.compilationunit;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.CommonPlugin;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.resource.impl.URIConverterImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import fr.irisa.triskell.kermeta.compilationunit.CompilationUnit;
import fr.irisa.triskell.kermeta.compilationunit.CompilationunitFactory;
import fr.irisa.triskell.kermeta.compilationunit.CompilationunitPackage;
import fr.irisa.triskell.kermeta.compilationunit.impl.CompilationunitPackageImpl;
import fr.irisa.triskell.kermeta.language.behavior.BehaviorPackage;
import fr.irisa.triskell.kermeta.language.structure.StructurePackage;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;


/**
 * This class is intended to manage whole the kermeta units, represented as EMF objects in memory, that
 * gather any necessary information of the model (kermeta program) to be interpreted correctly, by "optimizing"
 * the load/unload/reload/typecheck process, executing them only when useful.
 * 
 * TODO  : resolveURI with the relative path of the resource that is tested
 * TODO : find the best way to compare 2 uris or to store an uri in a canonical form.
 * @author zdrey
 *
 */
public class CompilationUnitManager {

	public static final String KMCU_FILE_EXTENSION = ".kmcu";
	public static final String KM_FILE_EXTENSION = ".km";
	public static final String KMT_FILE_EXTENSION = ".kmt";
	
	/** The current relative path, used to know according which edited file the required uri
	 * must be resolved. */
	protected String relativePath; 
	/** The uri of the file that is being edited */
	protected String currentKermetaFileURI;
	
	/** A resource set of KermetaUnit EMF instances. */
	protected ResourceSet resourceSet;
	
	/**
	 * CompilationUnitBuilder 
	 */
	CompilationUnitBuilder builder; 
	
	/** 
	 * Hashtable which key is an (absolute?) URI of the .km/.kmt file that has to be compiled
	 * and value is the URI of the associated compilationUnit (.kmcu file).
	 */
	protected Hashtable<String, String> map_km2kmcu;
	/** the inverted representation of map_km2kmcu*/
	protected Hashtable<String, String> map_kmcu2km;
	
	protected Hashtable<KermetaUnit, CompilationUnit> MapKermetaUnit2CompilationUnit;
	
	/**
	 * Main for testing!
	 * 
	 */
	public static void main(String[] argv)
	{
		
		String root_uri = "file:///udd/zdrey/Workspaces/KMNewWorkspace/fr.irisa.triskell.kermeta.io/test/compilationunit_tests/";
		String km_uri_test = root_uri + "CU2.kmt";
		String km_uri4 = root_uri + "CU4_deponCU2.kmt";
		String km_uri5 = root_uri + "CU5_deponCU2.kmt";
		
		//String kmcu_uri_test = root_uri + "CU2.kmcu";
		String kmcu_uri_test = root_uri + "CU2.kmcu";
		String kmcu_uri4 = root_uri + "CU4_deponCU2.kmcu";
		String kmcu_uri5 = root_uri + "CU5_deponCU2.kmcu";
		
		// Get the directory of current file for relative paths
		CompilationUnitManager manager = new CompilationUnitManager();
		URI km_u2 = manager.resolveURI(km_uri_test, "");
/*
		URI km_u4 = manager.resolveURI(km_uri4, "");
		URI km_u5 = manager.resolveURI(km_uri5, "");*/
		//System.out.println("getURI Fragment :  " + u2.path());
		manager.relativePath = root_uri;
		manager.currentKermetaFileURI = km_uri_test;
		System.err.println("Create compilation unit resources...");
		manager.createAllCompilationUnitResources(km_uri_test);
		System.err.println("...Done!");
	}
	
	/**
	 * Constructor.
	 * Initialize a resource set
	 */
	public CompilationUnitManager()
	{	// "kmcu"?
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xmi",new XMIResourceFactoryImpl());
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("km",new XMIResourceFactoryImpl());
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ecore",new XMIResourceFactoryImpl());
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("kmcu",new XMIResourceFactoryImpl());
		// CompilationunitPackage depends on StructurePackage so we need to init the latter.
		EPackage.Registry.INSTANCE.put( "http://kermeta/kermeta.ecore#//language/structure", StructurePackage.eINSTANCE );
		EPackage.Registry.INSTANCE.put( "http://kermeta/kermeta.ecore#//language/behavior", BehaviorPackage.eINSTANCE );
		EPackage.Registry.INSTANCE.put( CompilationunitPackage.eNS_URI, CompilationunitPackage.eINSTANCE);
		EPackage.Registry.INSTANCE.put( "/fr.irisa.triskell.kermeta.io/test/compilationunit.ecore", CompilationunitPackage.eINSTANCE);
		
		relativePath = "";
		resourceSet = new ResourceSetImpl();
		map_km2kmcu = new Hashtable<String, String>();
		map_kmcu2km = new Hashtable<String, String>();
		builder = new CompilationUnitBuilder();
		MapKermetaUnit2CompilationUnit = new Hashtable<KermetaUnit, CompilationUnit>();
	}
	
	public Resource getCompileUnitResourceForKMFile(String km_uri_str)
	{
		Resource resource = null;
		if (map_km2kmcu.containsKey(getNormalizedURI(km_uri_str)))
			resource = resourceSet.getResource(resolveURI(map_km2kmcu.get(getNormalizedURI(km_uri_str)),"/"), false);
		return resource;
	}
	
	/**
	 * Get the Kermeta file corresponding to the CompilationUnit given its uri. Used
	 * to find the Kermeta files that depend on the returned one.
	 * @param kmcu_uri_str
	 * @return
	 */
	public String getKMFileForCompileUnit(String kmcu_uri_str)
	{
		String str = null;
		System.out.println("getKMFileForCompileUnit : " + getNormalizedURI(kmcu_uri_str));
		printMap(map_kmcu2km);
		// System.out.println("Normalized kmcu string : " + kmcu_uri_str);
		if (map_kmcu2km.containsKey(getNormalizedURI(kmcu_uri_str)))
			str = map_kmcu2km.get(getNormalizedURI(kmcu_uri_str));
		// System.err.println("MAP : " + str);
		return str;
	}

	/**
	 * Create all the compilation unit resources. 
	 * This methods build all the compilation units on which the first one
	 */
	public void createAllCompilationUnitResources(String km_file_uri)
	{
		// Build a new compilation unit for the given kermeta file.
		builder.setKermetaFileUri(km_file_uri);
		builder.setKermetaUnit(km_file_uri);
		builder.buildAllCompilationUnits();
		
		// Add the "Main" compilation unit in a resource
		Resource resource = createCompilationUnitResourceForKMFile(builder.getCompilationUnit().getUri());
		resource.getContents().add(builder.getCompilationUnit());
		
		// Create a resource for each compilationUnit
		// Add all the imported compilation units in the resource
		for (Object o : builder.getCompilationUnit().getImportedUnits()) {
			CompilationUnit cu = (CompilationUnit)o;
			resource = createCompilationUnitResourceForKMFile(cu.getUri());
		}
	}
	
	/**
	 * Creates a compilation unit from scratch. Try to load an existing one (and then, clear it)
	 * and if it does not exist, create a new one.
	 * This method is called by createAllCompilationUnitResources
	 */
	public Resource createCompilationUnitResourceForKMFile(String km_uri_str)
	{
		// Get the kmcu_uri that would correspond to this km_uri:
		String kmcu_uri_str = getKMCUPathForKMPath(km_uri_str);
		// Creates an empty resource, or empty the existing related resource if it already exists.
		Resource resource = loadCompileUnitForKMFile(km_uri_str);
		if (resource!=null)
		{
			resource.getContents().clear();
		}
		else
		{
			// TOUNDERSTAND : If we use resolveURI (that uses URI.createURI) the resource is null
			// else if we use createURI (that uses URI.createFileURI) it is not null.
			// resource = resource_set.createResource(resolveURI(km_uri_str,""));
			resource = resourceSet.createResource(resolveURI(kmcu_uri_str,""));
			//resource = resource_set.getResource(resolveURI("titou.kmcu",""), true);
		}
		// Put kmcu uri in the resource map
		System.out.println("Normalized km key : " + getNormalizedURI(km_uri_str));
		System.out.println("Normalized kmcu string : " + kmcu_uri_str);
		map_km2kmcu.put(getNormalizedURI(km_uri_str), kmcu_uri_str);
		map_kmcu2km.put(kmcu_uri_str, getNormalizedURI(km_uri_str));
		
		return resource;
	}
	
	
	/**
	 * Loads a whole KermetaUnit given its URI (as a String, ideally "platform:/resource")
	 * If it does not exists, do not create it, and return null.
	 * @return the resource of the compilation unit for the given Kermeta file, or null if it does not
	 * exist yet.
	 */
	public Resource loadCompileUnitForKMFile(String km_uri_str)
	{
		String kmcu_uri_str = getKMCUPathForKMPath(km_uri_str);
		// Load the resource if it does not exist yet -> "true" in parameter
		URI kmcu_uri = resolveURI(kmcu_uri_str, "/");
		System.out.println("getURI Fragment :  " + kmcu_uri.path());
		// Create a resource kmcu for the given km uri
		return resourceSet.getResource(kmcu_uri, false);
	}
	
	public boolean exists(String km_uri)
	{
		return resourceSet.getResource(resolveURI(km_uri, ""), false)!=null;
	}
	
	/*
	 * Update a model element in the KermetaUnit given by its URI...
	 * In fact, it should be done automatically if we have a permanent access to a resource....
	 *
	 *
	public void updateModelElement(EObject elementToUpdate, String km_uri)
	{
		
	}*/
	
	/*
	 * 
	 *  HELPER METHODS TO LOAD CORRECTLY ALL THE CHANGED RESOURCES.
	 * 
	 * 
	 */
	
	
	/**
	 * create a compilation unit for all the km file specified in the given file_list.
	 * (Used for example by a kermeta project (project in the Eclipse meaning))
	 */
	public void createCompileUnitForKMFileList(List<String> flist)
	{
		for (String km_uri_str : flist) {
			createCompilationUnitResourceForKMFile(km_uri_str);
		}
	}
	
	/**
	 * Create is not the best word.
	 * Find all the 
	 */
	public void createAllRequiredCompileUnits(String kmcu_uri)
	{
		// By the way, build all the depending compilation units!
		for (KermetaUnit u : builder.getKermetaUnit().getAllImportedUnits())
		{
			createCompilationUnitResourceForKMFile(u.getUri());
		}

	}
	
	/**
	 * Find the Compile Unit resources that depends on the resource located at the given uri.
	 * Returns an empty list if no resources depend on it.
	 * @param the URI (must be a "canonical" one -> TODO!)
	 * @return an empty list if no resources depend on it, otherwhise the list of 
	 * the uris of the depending resources.
	 */
	protected List<Resource> findDependingResourcesFromKMCU(String kmcu_uri)
	{
		// Get the km uri for the given kmcu_uri
		String km_uri = getKMFileForCompileUnit(kmcu_uri);
		
		// Find the km uri in the requires path of the registered Compile Units.
		List<Resource> result = new ArrayList<Resource>(); int i = 0;
		Object[] resource_array = resourceSet.getResources().toArray();
		while (i< resource_array.length)
		{	// Get the "requires" attribute
			Resource resource = (Resource)resource_array[i];
			if (isContainedPathInPathList(km_uri, findRequiresInResource(resource)))
			{
				System.err.println("     Contained!");
				result.add(resource);
			}
			i+=1;
		}
		return result;
	}
	
	/**
	 * 
	 * @param path
	 * @param paths
	 * @return true if the given path is contained in the list of paths.
	 */
	protected boolean isContainedPathInPathList(String path, List<String> paths)
	{
		boolean eq = false;
		Iterator<String> it = paths.iterator();
		while ( it.hasNext() && eq == false )
			eq = comparePaths(path, it.next());
		return eq;
	}
	
	/**
	 * 
	 * @param path1
	 * @param path2
	 * @return
	 */
	protected boolean comparePaths(String path1, String path2)
	{
		System.out.println("-> compare: '" + resolveURI(path1, relativePath) + "' to '" + path2 + "' (resolved : " + resolveURI(path2,relativePath) + ")");
		boolean found = false;
		// try with kmt extension
		
		// try with km extension -- 
		return resolveURI(path1, relativePath).equals(resolveURI(path2, relativePath));
		// CommonPlugin.asLocalURI()
	}
	
	/**
	 * Find the requires textual representation, resolve them, 
	 */
	protected synchronized List<String> findRequiresInResource(Resource resource)
	{
		List<String> result = new ArrayList<String>();
		boolean found_requires = false;
		// Get the "requires" 
		Iterator treeIt = resource.getContents().iterator();
		while ( treeIt.hasNext() && found_requires == false )
		{
			Object next = treeIt.next();
			if ( next instanceof EObject )
			{
				EObject eobject = (EObject)next;
				found_requires = true;
				result = get_requires(eobject);
			}
		}
		return result;
	}
	
	/**
	 * 
	 * @return the list of requires. Returns an empty list if not filled
	 */
	public List<String> get_requires(EObject cunit)
	{
		List<String> requires = new ArrayList<String>();
		CompilationUnit compunit = (CompilationUnit)cunit; 
		Iterator it = compunit.getRequires().iterator();
		while (it.hasNext())
		{
			System.out.println("      | " + it.next());
		}
		// Just to convert an EList into a List...
		requires.addAll((List<String>) compunit.getRequires());
		return requires;
	}
	
	/**
	 * This method already exists in EMFRuntimeUnit.java
	 * If there is no associated File with this URI, than create a FileURI
	 * @param uri
	 * @param rel_path
	 * @return
	 */
	 public URI resolveURI(String uri, String rel_path)
	 {   // hem -> because file:/ is not equal to file:///
		 uri = uri.replaceAll("///", "/");
		 rel_path = rel_path.replaceAll("///", "/");
		 URI u = null;
		 if (!URI.createURI(uri).isFile()) u = URI.createFileURI(uri);
		 else u = URI.createURI(uri);
		 if (u.isRelative()) {
			 URIConverter c = new URIConverterImpl();
			 u = u.resolve(c.normalize(URI.createURI(rel_path)));    			
		 }
		 return u;
	 }
	 
	 public ResourceSet getResourceSet()
	 {
		 return resourceSet;
	 }
	 
	 /**
	  * 
	  *
	  */
	 public String getKMCUPathForKMPath(String km_uri)
	 {
		 String result = "";
		 // Try a dirty pseudo-normalization
		 km_uri = getNormalizedURI(km_uri);
		 if (km_uri.endsWith(KM_FILE_EXTENSION))
			 result = km_uri.substring(0, km_uri.length()-KM_FILE_EXTENSION.length());
		 else if (km_uri.endsWith(KMT_FILE_EXTENSION))
			 result = km_uri.substring(0, km_uri.length()-KMT_FILE_EXTENSION.length());
		 else throw new Error(km_uri + " has not a valid extension.");
		 result += KMCU_FILE_EXTENSION;
		 return result;
	 }
	 
	 public String getKMPathForKMCUPath(String kmcu_uri)
	 {
		 String result = "";
		 // Try a dirty pseudo-normalization
		 kmcu_uri = getNormalizedURI(kmcu_uri);
		 if (kmcu_uri.endsWith(KMCU_FILE_EXTENSION) || kmcu_uri.endsWith(".xmi"))
			 result = map_kmcu2km.get(kmcu_uri);
		 else throw new Error("Given compile unit uri '" +  kmcu_uri + "' has not a valid extension.");
		 return result;
	 }
	 
	 /**
	  * 
	  */
	 public String getNormalizedURI(String uri)
	 {
		 String result = resolveURI(uri, "").toString();
		 return result;
	 }
	 
	 public void printMap(Map map)
	 {
		 Iterator it = map.keySet().iterator();
		 System.out.println("{ ");
		 while (it.hasNext())
		 {
			 Object n = it.next();
			 System.out.println( "\"" + n + "\": " + map.get(n) + "; \n");
		 }
		 System.out.println(" }");
	 }

	/**
	 * @return Returns the relativePath.
	 */
	public String getRelativePath() {
		return relativePath;
	}

	/**
	 * @param relativePath The relativePath to set.
	 */
	public void setRelativePath(String relativePath) {
		this.relativePath = relativePath;
	}

	 
	 
}
