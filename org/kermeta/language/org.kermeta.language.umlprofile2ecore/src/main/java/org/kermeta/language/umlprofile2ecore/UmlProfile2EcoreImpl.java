package org.kermeta.language.umlprofile2ecore;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.util.UMLUtil;
import org.kermeta.language.umlprofile2ecore.api.UmlProfile2Ecore;

public class UmlProfile2EcoreImpl implements UmlProfile2Ecore{

	//@Override
	public Collection<EPackage> convertUmlProfile(Profile profile) {


   	Map<String, String> options = setOptions();
    	
    	//final BasicDiagnostic diagnostics = new BasicDiagnostic();

		//Map<Object, Object> context = new HashMap<Object, Object>();

		//Resource resource = /*package_*/profile.eResource();
		//ResourceSet resourceSet = resource.getResourceSet();
		/*URI uri = resourceSet.getURIConverter().normalize(
			resource.getURI()).trimFileExtension()
			.trimSegments(1);*/

		//List<Resource> resources = new ArrayList<Resource>();

		Collection<EPackage> packages = UMLUtil.convertToEcore(profile, options);
				
		// Saving resources ?
		/*
		for (EPackage ePackage : UMLUtil.convertToEcore(
			umlProfile, options, diagnostics, context)) {

			resources.add(resource = resourceSet
				.createResource(uri.appendSegment(
					ePackage.getName())
					.appendFileExtension(
						"ecore")));

			resource.getContents().add(ePackage);
		}
		for (Resource r : resources) {

			try {
				r.save(null);
			} catch (Exception e) {
				//UMLExamplesUIPlugin.INSTANCE.log(e);
				//log
				System.err.println(e.getStackTrace());
			}
		}

		*/
		/*handleDiagnostic(progressMonitor.isCanceled()
			? Diagnostic.CANCEL_INSTANCE
			: diagnostics, label);*/
    	
    	// TODO Auto-generated method stub
		return packages;

		
	}


    private Map<String, String> setOptions() {
    	Map<String, String> options = new HashMap<String,String>();
    	
    	options.put(UMLUtil.UML2EcoreConverter.OPTION__ECORE_TAGGED_VALUES, UMLUtil.OPTION__PROCESS);
    	options.put(UMLUtil.UML2EcoreConverter.OPTION__DERIVED_FEATURES, UMLUtil.OPTION__PROCESS);
    	options.put(UMLUtil.UML2EcoreConverter.OPTION__DUPLICATE_FEATURE_INHERITANCE,UMLUtil.OPTION__PROCESS);
    	options.put(UMLUtil.UML2EcoreConverter.OPTION__DUPLICATE_FEATURES,UMLUtil.OPTION__PROCESS);
    	options.put(UMLUtil.UML2EcoreConverter.OPTION__DUPLICATE_OPERATION_INHERITANCE,UMLUtil.OPTION__PROCESS);
		options.put(UMLUtil.UML2EcoreConverter.OPTION__DUPLICATE_OPERATIONS,UMLUtil.OPTION__PROCESS);
		options.put(UMLUtil.UML2EcoreConverter.OPTION__REDEFINING_OPERATIONS,UMLUtil.OPTION__PROCESS);
		options.put(UMLUtil.UML2EcoreConverter.OPTION__REDEFINING_PROPERTIES,UMLUtil.OPTION__PROCESS);
		options.put(UMLUtil.UML2EcoreConverter.OPTION__SUBSETTING_PROPERTIES,UMLUtil.OPTION__PROCESS);
		options.put(UMLUtil.UML2EcoreConverter.OPTION__UNION_PROPERTIES, UMLUtil.OPTION__PROCESS);
		options.put(UMLUtil.UML2EcoreConverter.OPTION__SUPER_CLASS_ORDER, UMLUtil.OPTION__PROCESS);
		options.put(UMLUtil.UML2EcoreConverter.OPTION__ANNOTATION_DETAILS, UMLUtil.OPTION__PROCESS);
		options.put(UMLUtil.UML2EcoreConverter.OPTION__INVARIANT_CONSTRAINTS,UMLUtil.OPTION__PROCESS);
		options.put(UMLUtil.UML2EcoreConverter.OPTION__OPERATION_BODIES, UMLUtil.OPTION__PROCESS);
		options.put(UMLUtil.UML2EcoreConverter.OPTION__COMMENTS, UMLUtil.OPTION__PROCESS);
		options.put(UMLUtil.UML2EcoreConverter.OPTION__CAMEL_CASE_NAMES, UMLUtil.OPTION__IGNORE);
    	
		return options;
    }

	
}
