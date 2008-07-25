package fr.irisa.triskell.kermeta.ocl;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Collections;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.impl.URIConverterImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.ocl.ParserException;

import fr.irisa.triskell.kermeta.modelhelper.URIMapUtil;

/**
 * An OCL File Parser parses the contents of a file of OCL source text.
 */
public class OCLFileParser {

	/**
	 * Recursively add all cross-references to the resource.
	 * @param resource
	 * @param xrefs
	 */
	protected static void saveCrossReferences(Resource resource, EList xrefs) {
		for (Object o1 : xrefs) {
			EObject o = (EObject) o1;
			resource.getContents().add(o);
			saveCrossReferences(resource, o.eCrossReferences());
		}
	}
	
	/**
	 * Parse the given OCL Source text and save the resulting object tree, together with 
	 * its cross-references, in a file described by the given URI
	 * @param oclSourceText - the text to parse
	 * @param outputXmiURI - the URI of the output XMI file 
	 * @throws ParserException
	 */
	public static void parseToXMIFile(String oclSourceText, URI outputXmiURI) throws ParserException {
		MyOCLParser parser = new MyOCLParser(oclSourceText);
		EObject constraint = null;
		constraint = parser.parse();
		if (constraint != null) {
			Resource resource = new XMIResourceFactoryImpl().createResource(outputXmiURI);
			resource.getContents().add(constraint);
			saveCrossReferences(resource, constraint.eCrossReferences());
			try {
				resource.save(Collections.EMPTY_MAP);
				System.out.println("saved: " + outputXmiURI);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
		
	/**
	 * Read the contents of the specified source file, parse it and save the results in the output XMI file
	 * @param sourceTextURI
	 * @param outputXmiURI
	 * @throws ParserException
	 * @throws IOException 
	 */
	public static void parseTextFileToXmiFile(URI sourceTextURI, URI outputXmiURI) throws ParserException, IOException {
		String oclSourceText =  getContents(sourceTextURI);
		parseToXMIFile(oclSourceText, outputXmiURI);
	}
	
	/**
	 * Return the contents of the file specified by oclURI as a single large string
	 * @param oclURI
	 * @return
	 * @throws IOException 
	 */
	 private static String getContents(URI oclURI) throws IOException{
		 URIConverter converter = new URIConverterImpl();
		 StringBuffer contents = new StringBuffer();
		 BufferedReader input = null;
		 try {
    		InputStream in = converter.createInputStream(oclURI);
    		input = new BufferedReader( 	new	InputStreamReader(in));
    	      String line = null; 
    	      while (( line = input.readLine()) != null){
    	        contents.append(line);
    	        contents.append(System.getProperty("line.separator"));
    	      }		  
		  } finally {
			  try {
				  if (input!= null) {
					  input.close();
				  }
			  } catch (IOException ex) {
				  ex.printStackTrace();
			  }
		  }
		  return contents.toString();
	 }
	  
	 public static void main(String[] args){
		URIConverter.URI_MAP.putAll(URIMapUtil.readMapFile(new File("uri.map")));
		 URI testfile = URI.createURI("platform:/resource/fr.irisa.triskell.kermeta.ocl/ocl/70.ocl");
		 try {
			System.out.println( getContents(testfile));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 }
	

}
