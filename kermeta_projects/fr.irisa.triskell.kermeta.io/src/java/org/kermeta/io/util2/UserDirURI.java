/* $Id: UserDirURI.java,v 1.5 2008-04-28 11:50:24 ftanguy Exp $
 * Project : Kermeta (First iteration)
 * File : UserDirURI.java
 * License : EPL
 * Copyright : IRISA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Mar 3, 2005
 * Author : zdrey
 * Description : describe here file content
 * TODO : 
 * 	- write here your TODO actions
 *  - ...
 */
package org.kermeta.io.util2;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;

import org.eclipse.emf.common.util.URI;


/**
 * 
 */
public class UserDirURI
{
	public static String userDir=System.getProperty("user.dir")+'/';
	
	
	public static void createDirFromName(String dirname){
		String filenameWithSlashes=dirname.replaceAll("\\\\","/");
		if (filenameWithSlashes.startsWith("file:"))
			filenameWithSlashes=filenameWithSlashes.substring(5,filenameWithSlashes.length());
		int fileIndex=filenameWithSlashes.lastIndexOf('/');
		int curSlash=filenameWithSlashes.indexOf('/');
		boolean reached=false;
		do {
			if (curSlash==fileIndex) reached=true;
			String directory=filenameWithSlashes.substring(0,curSlash);
			File dir=new File(directory);
			if (! dir.exists()) {
				System.out.println("creating directory "+directory+" ...");
				dir.mkdir();
			}
			curSlash=curSlash+1+filenameWithSlashes.substring(curSlash+1).indexOf('/');
		} while (! reached);
	}
	public static File createFileFromFileName(String filename) {
	
		String filenameWithSlashes=filename.replaceAll("\\\\","/");
		if (filenameWithSlashes.startsWith("file:"))
			filenameWithSlashes=filenameWithSlashes.substring(5,filenameWithSlashes.length());
		int fileIndex=filenameWithSlashes.lastIndexOf('/');
		int curSlash=filenameWithSlashes.indexOf('/');
		boolean reached=false;
		do {
			if (curSlash==fileIndex) reached=true;
			String directory=filenameWithSlashes.substring(0,curSlash);
			File dir=new File(directory);
			if (! dir.exists()) {
				System.out.println("creating directory "+directory+" ...");
				dir.mkdir();
			}
			curSlash=curSlash+1+filenameWithSlashes.substring(curSlash+1).indexOf('/');
		} while (! reached);
		System.out.println("creating file "+filenameWithSlashes+"...");
		File lookedFile=new File(filenameWithSlashes);
		try {
			if (! lookedFile.createNewFile())
				System.err.println("Creation failed for file: "+filename+".");
			} catch (IOException e) {System.err.println("Creation failed for file: "+filename+"."); }
		return lookedFile;
	}
	
    public static URI createURI(String str_path,String defaultUriToUse,boolean createOnFailure)
    {
    	File lookedFile=null;
    	if (defaultUriToUse != null) { //use the default uri as starting point
    		String defaultWithSlashes=defaultUriToUse.replaceAll("\\\\","/");
    		int lastSlash=defaultWithSlashes.lastIndexOf('/');
    		str_path=defaultWithSlashes.substring(0,lastSlash+1)+str_path;
    	}
    	if (str_path.startsWith("file:")) {
    		lookedFile=new File(str_path.substring(5,str_path.length()));
			if (! lookedFile.exists())
				if (createOnFailure)
					lookedFile=createFileFromFileName(str_path);
				else System.err.println("looking for file "+str_path+" : this file doesn't exist.");
    	}
    	else {
    		lookedFile=new File(str_path);
    		if (! lookedFile.exists()) {
    			lookedFile=new File(userDir+str_path);
    			if (! lookedFile.exists())
    				if (createOnFailure)
    					lookedFile=createFileFromFileName(userDir+str_path);
    				else System.err.println("Cannot find file : "+userDir+str_path);
    		}
    	}
        return URI.createFileURI(lookedFile.getAbsolutePath().replaceAll("\\\\","/"));
    }
    
    public static URI createURI(URI uri)
    {
    	String absolutePath=userDir;
    	Iterator<String> it=uri.segmentsList().iterator();
    	while (it.hasNext()) {
    		absolutePath=absolutePath.concat(it.next());
    		if (it.hasNext())
    			absolutePath=absolutePath+'/';
    	}
        File lookedFile=new File(absolutePath);
        if (! lookedFile.exists()) System.err.println("looking for file "+lookedFile+" : this file doesn't exist");
        return URI.createFileURI(lookedFile.getAbsolutePath());
    	
    }
    
}
