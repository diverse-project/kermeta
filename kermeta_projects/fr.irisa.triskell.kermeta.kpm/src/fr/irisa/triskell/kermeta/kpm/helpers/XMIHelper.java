

/*$Id: XMIHelper.java,v 1.3 2007-02-20 14:24:02 ftanguy Exp $
* Project : fr.irisa.triskell.kermeta.kpm
* File : 	sdfg.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : Feb 20, 2007
* Authors : ftanguy
*/
package fr.irisa.triskell.kermeta.kpm.helpers;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;


public class XMIHelper {

	//////////////////////
	//////////////////////
	//		Saving		//
	//////////////////////
	//////////////////////
	/**
	 * 
	 * @param fileName
	 * @param filePath
	 * @param root
	 * @throws java.io.IOException
	 */
	static public void save(String fileName, String filePath, EObject root) throws java.io.IOException {
		save(filePath + "/" + fileName, root);
	}
	
	/**
	 * 
	 * @param absoluteFileName
	 * @param root
	 * @throws java.io.IOException
	 */
	static public void save(String absoluteFileName, EObject root) throws java.io.IOException {
		save(URI.createFileURI(absoluteFileName), root);
	}
	
	/**
	 * 
	 * @param fileURI
	 * @param root
	 * @throws java.io.IOException
	 */
	static public void save(URI fileURI, EObject root) throws java.io.IOException {
		Resource res = new XMIResourceImpl(fileURI);
		res.getContents().add(root);
		res.save(null);		
	}
	//////////////////////////////
	//////////////////////////////
	//		End of Saving		//
	//////////////////////////////
	//////////////////////////////
	
	//////////////////////
	//////////////////////
	//		Loading		//
	//////////////////////
	//////////////////////
	/**
	 * 
	 * @param fileName
	 * @param filePath
	 * @param root
	 * @throws java.io.IOException
	 */
	static public Object load(String fileName, String filePath) throws java.io.IOException {
		return load(filePath + "/" + fileName);
	}
	
	/**
	 * 
	 * @param absoluteFileName
	 * @return
	 * @throws java.io.IOException
	 */
	static public Object load(String absoluteFileName) throws java.io.IOException {
		return load(URI.createFileURI(absoluteFileName));
	}
	
	/**
	 * 
	 * @param fileURI
	 * @return
	 * @throws java.io.IOException
	 */
	static public Object load(URI fileURI) throws java.io.IOException {
		Resource resource = new XMIResourceImpl(fileURI);
		resource.load(null);
		return resource.getContents().get(0);
	}
	//////////////////////////////
	//////////////////////////////
	//		End of Loading		//
	//////////////////////////////
	//////////////////////////////
	
}
