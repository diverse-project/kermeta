

/*$Id: EcoreHelper.java,v 1.6 2007-11-16 13:14:37 cfaucher Exp $
* Project : fr.irisa.triskell.eclipse.util
* File : 	EcoreHelper.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 24 mai 07
* Authors : paco
*/

package fr.irisa.triskell.eclipse.ecore;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.impl.ExtensibleURIConverterImpl;


public class EcoreHelper {
	
	public final static String ANNOTATION_EXTENDEDMETADATA = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";
    public final static String ANNOTATION_EXTENDEDMETADATA_KIND = "kind";
    public final static String ANNOTATION_EXTENDEDMETADATA_GROUP = "group";
    public final static String ANNOTATION_EXTENDEDMETADATA_NAME = "name";
    public final static String ANNOTATION_EXTENDEDMETADATA_BASETYPE = "baseType";

	static private String QUALIFIED_SEPARATOR = "::";
	
	/**
	 * The eContainer of the element is always a ENamedElement object.
	 * @param element
	 * @return
	 */
	static public String getQualifiedName(ENamedElement element) {
		return getQualifiedName(element, QUALIFIED_SEPARATOR);
	}
	
	/**
	 * The eContainer of the element is always a ENamedElement object.
	 * @param element
	 * @param separator
	 * @return
	 */
	static public String getQualifiedName(ENamedElement element, String separator) {
		assert( element != null );
		
		if ( (element.eContainer() !=null)
			&& (element.eContainer() instanceof ENamedElement) )
			
			return getQualifiedName( (ENamedElement) element.eContainer(), separator) + separator + element.getName();
		
		else 
			return element.getName();
	}
	
	
	/**
	 * @param emfRes - EMF resource of the model for which the metamodel uri is searched 
	 * @return       - String containing the metamodel uri for the input EMF Resource,
	 *                 "null" when the uri cannot be found
	 */
	static public String getMetaModelUriFromResource(Resource emfRes) {
		// Default return value for metamodel URI
		String mmURI = "";
		
		if(! emfRes.isLoaded()) {
			try {
	    		emfRes.load(null);
	    	}
	    	catch(Exception e) {
	    		// TODO auto generated catch block
	    		e.printStackTrace();
	    	}
		}

    	EObject eObj = null;
    	if(! emfRes.getContents().isEmpty()) {
    		eObj = (EObject) emfRes.getContents().get(0);
    	
    		if(eObj != null) {
    			// Find root package of the metamodel
    			EPackage pack = (EPackage) eObj.eClass().eContainer();
    			while(pack.eContainer() != null) pack = (EPackage) pack.eContainer();
    			mmURI = pack.getNsURI();
    		}
    	}
    	
    	return mmURI;
	}
	
	/**
	 * 
	 * Transforming a uri containing substring like ../../ into a canonical uri.
	 * 
	 * @param uri
	 * @return
	 */
    static public URI getCanonicalURI(URI uri) {
        
    	/*
    	 * 
    	 * Keeping the scheme : file or platform.
    	 * 
    	 */
        String canonicalURIString = uri.scheme() + ":";
       
        if ( ! uri.toString().contains("..") )
            return uri;
       
        List <String> usefullSegments = new ArrayList <String> ();
        int cpt = 0;
        String[] segments = uri.segments();
        for ( int i = segments.length -1; i > -1; i-- ) {
           
            if ( segments[i].equals("..") )
                cpt++;
            else if ( cpt > 0 )
                cpt--;
            else
                usefullSegments.add( segments[i] );
           
        }
        Collections.reverse( usefullSegments );
        //String canonicalURIString = "platform:";
        for ( String s : usefullSegments )
            canonicalURIString += "/" + s;
       
        URI canonicalURI = URI.createURI(canonicalURIString);
        return canonicalURI;
       
    }
	
	/**
	 * 
	 * The parameter must be of the formed platform:/resource/* or platform:/plugin/*
	 * This method creates a basic uri when being in a workbench but if the mapping has been done
	 * for platform:/resource/ and platform:/plugin/ then a uri with absolute path is created.
	 * 
	 * @param uri
	 * @return
	 */
	static public URI createURI(String uri) {
		URI u = URI.createURI( uri );
		
		/*
		 * 
		 * If the loading is not done in a workbench, then uri matching platform:/resource or platform:/plugin
		 * will be useless. Need to convert them into absolute path.
		 * It works only if a mapping exist between platform:/resource and its concrete path.
		 * 
		 */
		URIConverter converter = new ExtensibleURIConverterImpl();
		u = converter.normalize(u);
		return u;
	}
	
	static public URI getPlatformPluginURI(String fileURI) {
		//fileURI = fileURI.replaceFirst("file:", "");
		URI uri = (URI) ExtensibleURIConverterImpl.URI_MAP.get( URI.createURI("platform:/plugin/") );
		if ( uri != null ) {
			fileURI = fileURI.replace( uri.toString(), "platform:/plugin/" );
		}
		return URI.createURI( fileURI );
	}
	
	static public URI getPlatformResourceURI(String fileURI) {
		//fileURI = fileURI.replaceFirst("file:", "");
		URI uri = (URI) ExtensibleURIConverterImpl.URI_MAP.get( URI.createURI("platform:/resource/") );
		if ( uri != null ) {
			fileURI = fileURI.replace( uri.toString(), "platform:/resource/" );
		}
		return URI.createURI( fileURI );
	}

	/**
	 * from an EAnnotation, analyse the basetype details and retrieve the corresponding type
	 * @param extendedMetadataAnnot
	 * @return an EClassifier
	 */
	public static EClassifier findReferedTypeFromExtendedMetadataBaseType(EClassifier annotatedObject) {
		EAnnotation extendedMetadataAnnot = annotatedObject.getEAnnotation(EcoreHelper.ANNOTATION_EXTENDEDMETADATA);
		if(extendedMetadataAnnot==null) // return nothing if there is not extendedmetadata
			return null;
		
		String baseTypeString = (String)extendedMetadataAnnot.getDetails().get(EcoreHelper.ANNOTATION_EXTENDEDMETADATA_BASETYPE);
		
		if(baseTypeString == null){
			// return nothing if this is not a baseType
			return null;
		}
		// parse the baseTypeString in order to retrieve the corresponding type
		
		EPackage searchEPackage = (EPackage) annotatedObject.eContainer();
		
		String searchedLogicalTypeString;
		String[] splittedString = baseTypeString.split("#");
		if(splittedString.length > 1){
			// TODO need to change the searcheEPackage
			
			// the logical name is the second part
			searchedLogicalTypeString = splittedString[1];
		}
		else{
			// the resulting string is the 
			// it may have removed the # prefix, meaning that we are looking in the annotated element sibling
			searchedLogicalTypeString = splittedString[0];
		}
		
		// first, try to find an element in the sibling of the annotated object
		
		for(EObject eobj : searchEPackage.eContents()){
			if(eobj instanceof EClassifier){
				if(searchedLogicalTypeString.equals(getMetaDataTypeName((EClassifier) eobj))){
					// we got it
					return (EClassifier) eobj;
				}
			}
		}
		// not found 
		return null;
	}
	
	/**
	 * return the logical name of the object, it will be the name specified in the metadata or directly its name
	 * @param eclass
	 * @return
	 */
	public static String getMetaDataTypeName(EClassifier eclass){
		// if it has an extendedmetadata, maybe it redefine the type name
		
		// by default return the class name
		return eclass.getName();
	}
	
}


