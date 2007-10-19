

/*$Id: EcoreExporter.java,v 1.11 2007-10-19 16:31:05 cfaucher Exp $
* Project : io
* File : 	EcoreExporter.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 12 juin 07
* Authors : paco
*/

package fr.irisa.triskell.kermeta.exporter.ecore;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;


import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.EPackage.Registry;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.kermeta.io.KermetaUnit;
import org.kermeta.io.plugin.IOPlugin;

import fr.irisa.triskell.eclipse.ecore.EcoreHelper;
import fr.irisa.triskell.eclipse.emf.EMFRegistryHelper;
import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.Operation;
import fr.irisa.triskell.kermeta.language.structure.Parameter;
import fr.irisa.triskell.kermeta.language.structure.Property;
import fr.irisa.triskell.kermeta.language.structure.TypeDefinition;
import fr.irisa.triskell.kermeta.modelhelper.ClassDefinitionHelper;
import fr.irisa.triskell.kermeta.modelhelper.KermetaUnitHelper;
import fr.irisa.triskell.kermeta.modelhelper.OperationHelper;
import fr.irisa.triskell.kermeta.modelhelper.StringHelper;

public class EcoreExporter {

	private ResourceSet resourceSet = new ResourceSetImpl();
	
	private Hashtable <KermetaUnit, Resource> resources = new Hashtable <KermetaUnit, Resource> ();
	
	private List <Resource> frameworkResources = new ArrayList <Resource> ();
	
	private Hashtable <Resource, KermetaUnit> resourcesNotToSave = new Hashtable <Resource, KermetaUnit> ();
	
	private Hashtable <KermetaUnit, String> uris = new Hashtable <KermetaUnit, String> ();
	
	private Hashtable <KermetaUnit, Boolean> loadings = new Hashtable <KermetaUnit, Boolean> ();
	
	private Hashtable <KermetaUnit, Boolean> pass1done = new Hashtable <KermetaUnit, Boolean> ();

	private Hashtable <KermetaUnit, Boolean> pass2done = new Hashtable <KermetaUnit, Boolean> ();
	
	private Hashtable <KermetaUnit, Boolean> pass3done = new Hashtable <KermetaUnit, Boolean> ();

	private ExporterOptions exporterOptions = ExporterOptions.getDefault();

	/**
	 * This datatype is used as an extra datatype to represent (in the built Ecore file)
	 * the type of elements (properties/parameters/operations) that have a kermeta specific
	 * type (TypeVariable/FunctionType) as type.
	 * Such properties/parameters/operations will have this DataType as type, as well as an
	 * annotation that contains the name of this specific type. 
	 */
	
	private EDataType kermetaTypesAlias = null;
	
	public EDataType getKermetaTypesAlias() {
		if ( kermetaTypesAlias == null ) {
			kermetaTypesAlias = EcoreFactory.eINSTANCE.createEDataType(); 
			kermetaTypesAlias.setName( KM2Ecore.KERMETA_TYPES );
			kermetaTypesAlias.setInstanceClassName("java.lang.Object");
		}
		return kermetaTypesAlias;
	}
	
	protected Hashtable<fr.irisa.triskell.kermeta.language.structure.Object,EObject> km2ecoremapping = new Hashtable<fr.irisa.triskell.kermeta.language.structure.Object,EObject> ();
	
	private String pathToRemove = "";
		
	private void initializeLoadings(KermetaUnit kermetaUnit) {
		
		loadings.put(kermetaUnit, false);
		/*
		 * 
		 * Initalizing the loadings.
		 * 
		 */
		List <KermetaUnit> units = KermetaUnitHelper.getAllImportedKermetaUnits( kermetaUnit );
		for ( KermetaUnit unit : units )
			loadings.put( unit, false );
				
		/*
		 * 
		 * Initialize the pass1done.
		 * 
		 */
		pass1done.put(kermetaUnit, false);
		
		for ( KermetaUnit unit : units )
			pass1done.put( unit, false );	
		
		/*
		 * 
		 * Initialize the pass2done.
		 * 
		 */
		pass2done.put(kermetaUnit, false);
		
		for ( KermetaUnit unit : units )
			pass2done.put( unit, false );	
		
		/*
		 * 
		 * Initialize the pass3done.
		 * 
		 */
		pass3done.put(kermetaUnit, false);
		
		for ( KermetaUnit unit : units )
			pass3done.put( unit, false );	
	}
	
	private void initializeResourceSet() {
		
		KermetaUnit framework = IOPlugin.getDefault().getFramework();
		if ( framework == null )
			return;
		
		KermetaUnit ecore = IOPlugin.getDefault().getEcore();
		if ( ecore == null )
			return;
		
		ClassDefinition currentClassDefinition = null;
		Operation currentOperation = null;
		
		URI uri = URI.createURI( IOPlugin.getFrameWorkEcoreURI() );
		Resource ecoreFramework = resourceSet.createResource(uri);
		
		Resource ecoreResource = EcorePackage.eINSTANCE.eResource();
		
		try {
			ecoreFramework.load(null);
			EcoreUtil.resolveAll( resourceSet );
			resourceSet.getResources().add( ecoreResource );
			frameworkResources.addAll( resourceSet.getResources() );
			for ( Resource resource : (List<Resource>) resourceSet.getResources() ) {
				
				for ( TreeIterator<EObject> iterator = resource.getAllContents(); iterator.hasNext(); ) {
					
					Object o = iterator.next();

					if ( o instanceof EClassifier ) {
						String qualifiedName = EcoreHelper.getQualifiedName( (EClassifier) o );	
						TypeDefinition p = framework.getTypeDefinitionByQualifiedName( qualifiedName );
						if ( p == null )
							p = ecore.getTypeDefinitionByQualifiedName( qualifiedName );
						if ( p instanceof ClassDefinition )
							currentClassDefinition = (ClassDefinition) p;
						if ( p != null )
							km2ecoremapping.put(p, (EObject) o);
					}
					
					if ( o instanceof EAttribute ) {
						if ( currentClassDefinition != null ) {
							Property p = ClassDefinitionHelper.findPropertyByName(currentClassDefinition, ((EAttribute) o ).getName() );
							if ( p != null )
								km2ecoremapping.put(p, (EObject) o);
						}
					}
					
					if ( o instanceof EOperation ) {
						if ( currentClassDefinition != null ) {
							currentOperation = ClassDefinitionHelper.findOperationByName(currentClassDefinition, ((EOperation) o ).getName() );
							if ( currentOperation != null )
								km2ecoremapping.put(currentOperation, (EObject) o);
						}
					}
					
					if ( o instanceof EParameter ) {
						if ( currentOperation != null ) {
							Parameter p = OperationHelper.getParameter(currentOperation, ((EParameter) o ).getName() );
							if ( p != null )
								km2ecoremapping.put(p, (EObject) o);
						}
					}
					
				}
				
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	private void initialize(KermetaUnit kermetaUnit, String rep, String fileName) {

		initializeResourceSet();
		initializeLoadings(kermetaUnit);

		/*
		 * 
		 * Initializing the uris.
		 * 
		 */
		setUri(kermetaUnit, rep + "/", fileName);
	}
	
	/**
	 * 
	 * @param kermetaUnit
	 * @param rep
	 * @param fileName
	 */
	public void export(KermetaUnit kermetaUnit, String rep, String fileName, ExporterOptions exporterOptions) {
		exportInMemory(kermetaUnit, rep, fileName, exporterOptions);
		save();
	}
	
	
	public void save() {
		try {
			for (KermetaUnit currentUnit : resources.keySet()) {
				Resource resource = resources.get(currentUnit);

				if (!resourcesNotToSave.containsKey(resource)
						&& !frameworkResources.contains(resource)) {
					EAnnotation annotation = EcoreFactory.eINSTANCE
							.createEAnnotation();
					annotation.setSource("dependentResource");
					for (KermetaUnit importedUnit : KermetaUnitHelper
							.getAllImportedKermetaUnits(currentUnit))
						if (resources.get(importedUnit) != null)
							annotation.getReferences().addAll(
									resources.get(importedUnit).getContents());

					resource.getContents().add(annotation);

					resource.save(null);
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public ResourceSet exportInMemory(KermetaUnit kermetaUnit, String rep, ExporterOptions exporterOptions) {
		return exportInMemory(kermetaUnit, rep, null, exporterOptions);
	}
	
	/**
	 * 
	 * @param kermetaUnit
	 * @param rep
	 * @param fileName
	 * @return
	 */
	public ResourceSet exportInMemory(KermetaUnit kermetaUnit, String rep, String fileName, ExporterOptions exporterOptions) {
		initialize(kermetaUnit, rep, fileName);
		
		this.exporterOptions = exporterOptions;

		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ecore",new XMIResourceFactoryImpl());
		
		fillResourceSet(kermetaUnit);
		
		applyPass1ToAll(kermetaUnit);
		applyPass2ToAll(kermetaUnit);
		
		if ( exporterOptions.isIndependent )
			applyPass3ToAll(kermetaUnit);
		
		try {
			
			EPackage p = null;
			Iterator <EObject> iterator = resources.get(kermetaUnit).getContents().iterator();
			while ( iterator.hasNext() && (p == null) ) {
				EObject o = iterator.next();
				if ( o instanceof EPackage )
					p = (EPackage) o;
			}
			
			p.getEClassifiers().add( getKermetaTypesAlias() );
						

		} catch(Exception e ) {
			e.printStackTrace();
		}
		
		return resourceSet;
	}
	
	/**
	 * 
	 * @param kermetaUnit
	 * @param rep
	 */
	public void export(KermetaUnit kermetaUnit, String rep, ExporterOptions exporterOptions) {
		export(kermetaUnit, rep, null, exporterOptions);
	}
	
	/**
	 * 
	 * @param kermetaUnit
	 */
	private void applyPass1ToAll(KermetaUnit kermetaUnit) {
		
		if ( pass1done.get(kermetaUnit) )
			return;
		
		loadings.put( kermetaUnit, true );
		
		System.out.println( "pass 1 : " + kermetaUnit.getUri() );
		
		Iterator <KermetaUnit> iterator = kermetaUnit.getImportedKermetaUnits().iterator();
		while ( iterator.hasNext() ) {
			KermetaUnit currentUnit = iterator.next();
			if ( ! loadings.get( currentUnit ) )
				applyPass1ToAll( currentUnit );
		}
		
		if ( resources.get(kermetaUnit) != null ) {
			KM2EcorePass1 pass1 = new KM2EcorePass1( resources.get(kermetaUnit), km2ecoremapping, kermetaUnit, getKermetaTypesAlias(), exporterOptions );
			pass1.accept( kermetaUnit.getModelingUnit() );	
		}
		
		loadings.put(kermetaUnit, false);
		pass1done.put(kermetaUnit, true);
		
	}
	
	/**
	 * 
	 * @param kermetaUnit
	 */
	private void applyPass2ToAll(KermetaUnit kermetaUnit) {
		
		if ( pass2done.get(kermetaUnit) )
			return;
		
		loadings.put( kermetaUnit, true );
		
		System.out.println( "pass 2 : " + kermetaUnit.getUri() );
		
		Iterator <KermetaUnit> iterator = kermetaUnit.getImportedKermetaUnits().iterator();
		while ( iterator.hasNext() ) {
			KermetaUnit currentUnit = iterator.next();
			if ( ! loadings.get( currentUnit ) )
				applyPass2ToAll( currentUnit );
		}
		
		if ( resources.get(kermetaUnit) != null ) {
			KM2EcorePass2 pass2 = new KM2EcorePass2( resources.get(kermetaUnit), km2ecoremapping, kermetaUnit, getKermetaTypesAlias(), exporterOptions );
			pass2.accept( kermetaUnit.getModelingUnit() );
		}
		
		loadings.put( kermetaUnit, false );
		pass2done.put(kermetaUnit, true);
	}
	
	private void applyPass3ToAll(KermetaUnit kermetaUnit) {
		
		if ( pass3done.get(kermetaUnit) )
			return;
		
		loadings.put( kermetaUnit, true );
		
		System.out.println( "pass 3 : " + kermetaUnit.getUri() );
		
		Iterator <KermetaUnit> iterator = kermetaUnit.getImportedKermetaUnits().iterator();
		while ( iterator.hasNext() ) {
			KermetaUnit currentUnit = iterator.next();
			if ( ! loadings.get( currentUnit ) )
				applyPass3ToAll( currentUnit );
		}
		
		if ( resources.get(kermetaUnit) != null ) {
			KM2EcorePass3 pass3 = new KM2EcorePass3( resources.get(kermetaUnit), km2ecoremapping, kermetaUnit, getKermetaTypesAlias(), exporterOptions );
			pass3.accept( kermetaUnit.getModelingUnit() );
		}
		
		loadings.put( kermetaUnit, false );
		pass3done.put(kermetaUnit, true);
	}
	
	private void fillResourceSet(KermetaUnit kermetaUnit) {
		/*
		 * 
		 * Avoiding infinite loop. This is the stop condition.
		 * 
		 */
		if ( resources.containsKey(kermetaUnit) )
			return;

		/*
		 * 
		 * If the uri does not exist, it means that the current kermeta unit is a framework.
		 * It will be handled after the filling of the resource set.
		 * 
		 */
		if ( uris.get(kermetaUnit) == null )
			return;
		
		URI uri = EcoreHelper.createURI( uris.get(kermetaUnit) );
		Resource resource = resourceSet.createResource(uri);
		/*
		 * 
		 * If the resource is null, maybe the URI comes fomr the registry.
		 * 
		 */
		if ( resource == null )
			resource = EMFRegistryHelper.getResource(uri);
		
		if ( kermetaUnit.isFramework() || kermetaUnit.equals(IOPlugin.getDefault().getEcore()) ) {
			resourcesNotToSave.put( resource, kermetaUnit );
			return;
		}
		
		resources.put(kermetaUnit, resource);
		
		Iterator <KermetaUnit> iterator = kermetaUnit.getImportedKermetaUnits().iterator();
		while ( iterator.hasNext() ) {
			KermetaUnit current = iterator.next();
			fillResourceSet(current);
		}
	}
	
	/*private void addEcoreFrameworkInResourceSet() {
		
		KermetaUnit kermetaUnit = IOPlugin.getDefault().getFrameworkEcore();
		
		uris.put(kermetaUnit, kermetaUnit.getUri());
		URI uri = URI.createURI( uris.get(kermetaUnit) );
		Resource resource = resourceSet.createResource( uri );
		resources.put(kermetaUnit, resource);
				
		for ( KermetaUnit unit : KermetaUnitHelper.getAllImportedKermetaUnits(kermetaUnit) ) {
			uris.put(unit, unit.getUri());
			URI currentURI = URI.createURI( uris.get(unit) );
			Resource currentResource = resourceSet.createResource( currentURI );
			resources.put(kermetaUnit, currentResource);			
		}
		
	}*/

	/**
	 * Define a container for each element of the root package.
	 */
	/*public void fixTypeContainement(Package p) {
		TreeIterator it = p.eAllContents();
		TypeContainementFixer fixer = new TypeContainementFixer();
		while(it.hasNext()) {
			fr.irisa.triskell.kermeta.language.structure.Object o = (fr.irisa.triskell.kermeta.language.structure.Object)it.next();
			if (o instanceof CallExpression) {
			    CallExpression e = (CallExpression)o;
			    fixer.addContainedTypes(e.getStaticTypeVariableBindings(), e);
			}
			
			if (o instanceof Expression) {
				Expression e = (Expression)o;
				if (e.getStaticType() != null) {
					fixer.addContainedTypes(e.getStaticType(), e);	
				}
			}
			else if (o instanceof TypeContainer) {
				if (o != null) fixer.accept(o);
			}
		}
	}*/
	
	
	private void setUri(KermetaUnit kermetaUnit, String rep, String fileName) {
		if ( uris.containsKey(kermetaUnit) )
			return;
		
		if ( kermetaUnit.isFramework() ) {
			//uris.put(kermetaUnit, kermetaUnit.getUri());
			return;
		}
						
		String uri = kermetaUnit.getUri();
		
		if ( pathToRemove.equals("") ) {
			int index = uri.lastIndexOf("/");
			if ( index != -1 ) {
				pathToRemove = uri.substring(0, index);
				uri = rep + uri.substring(index+1);
			}
		} else {
			String temp = uri.replace(pathToRemove + "/", "");
			if ( ! uri.equals(temp) )
				uri = rep + temp;
		}

		if ( fileName != null )
			uris.put(kermetaUnit, fileName);
		else {
			uri = StringHelper.replaceExtension(uri, "ecore");
			uris.put(kermetaUnit, uri);
		}
			
		Iterator <KermetaUnit> iterator = kermetaUnit.getImportedKermetaUnits().iterator();
		while ( iterator.hasNext() ) {
			KermetaUnit current = iterator.next();
			setUri(current, rep, null);
		}
		
	}
	
	public Hashtable<fr.irisa.triskell.kermeta.language.structure.Object, EObject> getKm2ecoremapping() {
		return km2ecoremapping;
	}
}


