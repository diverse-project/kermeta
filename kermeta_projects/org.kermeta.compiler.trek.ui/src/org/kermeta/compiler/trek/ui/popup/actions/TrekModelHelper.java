/*$Id: TrekModelHelper.java,v 1.11 2008-06-16 13:05:37 cfaucher Exp $
* Project : org.kermeta.compiler.trek.ui
* File : 	TrekModelHelper.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 27 nov. 07
* Authors : Cyril Faucher <cfaucher@irisa.fr>
*/

package org.kermeta.compiler.trek.ui.popup.actions;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.resource.impl.URIConverterImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.kermeta.compiler.common.KCompilerConstants;
import org.kermeta.compiler.trek.ui.exception.RefinesUCWFRException;
import org.kermeta.trek.KStatus;
import org.kermeta.trek.TrekFactory;
import org.kermeta.trek.UseKaseModel;


public class TrekModelHelper {

	/**
	 * Constructor for TrekFileHelper.
	 */
	public TrekModelHelper() {

	}
	
	public static UseKaseModel createUseKaseModel(IFolder folder)
    {
		IFile trek_file = ResourcesPlugin.getWorkspace().getRoot().getFile(folder.getFullPath().append("/" + folder.getName()).addFileExtension(KCompilerConstants.TREK_EXT));
		return TrekModelHelper.createUseKaseModel(trek_file);
    }
	
	/**
	 * 
	 * @param file
	 * @return
	 */
	public static UseKaseModel createUseKaseModel(IFile file)
    {
		// Create a Trek structure
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(KCompilerConstants.TREK_EXT,new XMIResourceFactoryImpl());
		ResourceSet trek_resource_set = new ResourceSetImpl();
		URI u = URI.createURI(file.getFullPath().toString());
    	u = new URIConverterImpl().normalize(u);
		Resource trek_resource = trek_resource_set.createResource(u);
		trek_resource.getContents().add(TrekFactory.eINSTANCE.createUseKaseModel());
		return (UseKaseModel) trek_resource.getContents().get(0);
    }
	
	/**
	 * 
	 * @param file
	 * @return
	 */
	public static UseKaseModel getUseKaseModel(IFile file)
    {
		// Get a Trek structure
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(KCompilerConstants.TREK_EXT,new XMIResourceFactoryImpl());
		ResourceSet trek_resource_set = new ResourceSetImpl();
		URI u = URI.createURI(file.getFullPath().toString());
    	u = new URIConverterImpl().normalize(u);
		Resource trek_resource = trek_resource_set.getResource(u, true);
		return (UseKaseModel) trek_resource.getContents().get(0);
    }
	
	/**
	 * 
	 * @param key
	 * @param progress
	 * @return
	 */
	public static KStatus newStatus(String key, int progress) {
		KStatus newStatus = TrekFactory.eINSTANCE.createKStatus();
		newStatus.setKey(key);
		newStatus.setProgress(progress);
		return newStatus;
	}
	
	/**
	 * 
	 * @param key
	 * @param progress
	 * @return
	 */
	public static KStatus newStatusImpl(String key, int progress) {
		return newStatus(KCompilerConstants.IMPL_PREFIX, key, progress);
	}
	
	/**
	 * 
	 * @param key_prefix
	 * @param key
	 * @param progress
	 * @return
	 */
	private static KStatus newStatus(String key_prefix, String key, int progress) {
		KStatus newStatus = TrekFactory.eINSTANCE.createKStatus();
		newStatus.setKey(key_prefix + key);
		newStatus.setProgress(progress);
		return newStatus;
	}

	public static String getSummaryContent(IFolder folder) {
		IFile summary_file = ResourcesPlugin.getWorkspace().getRoot().getFile(folder.getFullPath().append("/" + KCompilerConstants.SUMMARY_PREFIX + folder.getName()).addFileExtension(KCompilerConstants.SUMMARY_EXT));
		if (summary_file.exists()) {
			try {
				return readString(summary_file.getContents());
			} catch (CoreException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return "";
	}
	
	/**
	 * 
	 * @param folder
	 * @return
	 */
	public static Collection<String> getVerifiesUCContent(IFolder folder) {
		IFile verifiesUC_file = ResourcesPlugin.getWorkspace().getRoot().getFile(folder.getFullPath().append("/" + KCompilerConstants.VERIFIES_UC_PREFIX + folder.getName()).addFileExtension(KCompilerConstants.VERIFIES_UC_EXT));
		if (verifiesUC_file.exists()) {
			try {
				return (Collection<String>) readStringByLine(verifiesUC_file.getContents()).values();
			} catch (CoreException e) {
				e.printStackTrace();
			}
		}
		return null;
	}
	
	/**
	 * 
	 * @param folder
	 * @return
	 * @throws RefinesUCWFRException 
	 */
	public static Collection<String> getRefinesUCContent(IFolder folder) throws RefinesUCWFRException {
		IFile refinesUC_file = ResourcesPlugin.getWorkspace().getRoot().getFile(folder.getFullPath().append("/" + KCompilerConstants.REFINES_UC_PREFIX + folder.getName()).addFileExtension(KCompilerConstants.REFINES_UC_EXT));
		if (refinesUC_file.exists()) {
			try {
				Collection<String> refines_uc = (Collection<String>) readStringByLine(refinesUC_file.getContents()).values();
				if( refines_uc.size() > 1 ) {
					throw new RefinesUCWFRException(refinesUC_file);
				}
				return refines_uc;
			} catch (CoreException e) {
				e.printStackTrace();
			}
		}
		return null;
	}
	
	/**
	 * 
	 * @param folder
	 * @return
	 */
	public static Map<String, String> getProgressContent(IFolder folder) {
		IFile summary_file = ResourcesPlugin.getWorkspace().getRoot().getFile(folder.getFullPath().append("/" + KCompilerConstants.PROGRESS_PREFIX + folder.getName()).addFileExtension(KCompilerConstants.SUMMARY_EXT));
		if (summary_file.exists()) {
			try {
				return readStringByLine(summary_file.getContents());
			} catch (CoreException e) {
				e.printStackTrace();
			}
		}
		return null;
	}
	
	/**
	 * 
	 * @param in
	 * @return
	 */
	public static String readString( InputStream in ){
		FileInputStream stream = (FileInputStream) in;
		return readAll(stream);
	}
	
	/**
	 * 
	 * @param in
	 * @return
	 */
	private static String readAll( InputStream in ) { 
	    StringBuffer output = new StringBuffer();
	    try
	    {
	        int c;
	        while ((c = in.read()) != -1) {
	            output.append((char)c);
	        }
	        in.close();
	    }
	    catch (IOException e) {
	        e.printStackTrace();
	    }
	    return output.toString();
	}

	/**
	 * 
	 * @param in
	 * @return
	 */
	public static Map<String, String> readStringByLine( InputStream in ){
		
		Map<String, String> map = new HashMap<String, String>();
		
		BufferedReader input = new BufferedReader(new InputStreamReader(in));
		try {
			String thisLine;
			while ((thisLine = input.readLine()) != null) {
				String[] lineContent = thisLine.split("=");
				if( lineContent.length==2 && !lineContent[1].equals("") && !lineContent[1].equals("-1") ) {
					map.put(lineContent[0], lineContent[1]);
				}
		    }
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return map;
	}
}