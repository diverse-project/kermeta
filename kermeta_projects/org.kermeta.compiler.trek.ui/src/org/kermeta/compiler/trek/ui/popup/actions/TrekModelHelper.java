/*$Id: TrekModelHelper.java,v 1.3 2007-11-30 13:24:53 cfaucher Exp $
* Project : org.kermeta.compiler.trek.ui
* File : 	TrekModelHelper.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 27 nov. 07
* Authors : cfaucher <cfaucher@irisa.fr>
*/

package org.kermeta.compiler.trek.ui.popup.actions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.resource.impl.URIConverterImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.ui.internal.ide.IDEWorkbenchPlugin;
import org.kermeta.compiler.trek.ui.KCompilerConstants;
import org.kermeta.trek.KStatus;
import org.kermeta.trek.TrekFactory;
import org.kermeta.trek.UseKaseModel;


public class TrekModelHelper {

	/**
	 * Constructor for TrekFileHelper.
	 */
	public TrekModelHelper() {

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
		return newStatus("Impl", key, progress);
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
		newStatus.setKey(key_prefix + "_" + key);
		newStatus.setProgress(progress);
		return newStatus;
	}

	public static String getSummaryContent(IFolder folder) {
		IFile summary_file = IDEWorkbenchPlugin.getPluginWorkspace().getRoot().getFile(folder.getFullPath().append("/summary_" + folder.getName()).addFileExtension(KCompilerConstants.SUMMARY_EXT));
		if(summary_file.exists()) {
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
	
	public static String readString( InputStream in){
		BufferedReader input = new BufferedReader(new InputStreamReader(in));
		try {
			return input.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "";
	}
}