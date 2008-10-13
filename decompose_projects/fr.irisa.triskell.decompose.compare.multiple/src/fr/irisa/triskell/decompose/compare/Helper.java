package fr.irisa.triskell.decompose.compare;

import java.io.IOException;
import java.util.Collections;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import fr.irisa.triskell.eclipse.resources.URIHelper;

public class Helper {

	public static EObject load(String spath,IPath mpath) throws IOException{
		IPath path;
		URI fileURI;
		if(mpath==null){
			path=new Path(URIHelper.getPathFromPlatformURI(spath));
			IFile file=ResourcesPlugin.getPlugin().getWorkspace().getRoot().getFile(path);
			fileURI = URI.createFileURI(file.getLocation().makeAbsolute().toOSString());
		}
		else{
			path=mpath;
			fileURI=URI.createFileURI(path.makeAbsolute().toOSString());
		}
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource resource = resourceSet.createResource(fileURI);
		resource.load(null);
		resource.getContents().get(0);
		return resource.getContents().get(0);
	}
	
	
	public static void save(EObject object,String dpath,IPath mpath) throws IOException{
		IPath path;
		URI fileURI;
		if(mpath==null){
			path=new Path(URIHelper.getPathFromPlatformURI(dpath));
			IFile file=ResourcesPlugin.getPlugin().getWorkspace().getRoot().getFile(path);
			fileURI = URI.createFileURI(file.getLocation().makeAbsolute().toOSString());
		}
		else{
			path=mpath;
			fileURI=URI.createFileURI(path.makeAbsolute().toOSString());
		}
		System.out.println("saving to: "+fileURI);
		ResourceSet resourceSet=new ResourceSetImpl();
		Resource resource = resourceSet.createResource(fileURI);
		resource.getContents().add(object);
		resource.save(Collections.EMPTY_MAP);
	}
}
