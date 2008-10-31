/* $Id: ZipHelper.java,v 1.1 2008-10-31 10:41:03 dvojtise Exp $
 * Project : 
 * File : ZipHelper.java
 * License : EPL
 * Copyright : IRISA / INRIA
 * ----------------------------------------------------------------------------
 * Creation date : 31 oct. 2008
 * Authors : 
 * 		dvojtise
 */
package org.kermeta.core.helper;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URL;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class ZipHelper {

	/**
	 * 
	 * @param fileToUnzipURL
	 * @param destinationFolder
	 * @param stripRootFolderName if  not null,  strip the begining of the path in the zip
	 * @throws IOException 
	 */
	public static void unzip(URL fileToUnzipURL, String destinationFolder, String stripRootFolderName) throws IOException{
		ZipInputStream zipFileStream = new ZipInputStream(fileToUnzipURL.openStream());
		ZipEntry zipEntry = zipFileStream.getNextEntry();
		
		String regexedRootToStrip=null;
		if(stripRootFolderName!=null){
			// We derive a regexedProjectName so that the dots don't end up being
			//  interpreted as the dot operator in the regular expression language.
			regexedRootToStrip = stripRootFolderName.replaceAll("\\.", "\\."); //$NON-NLS-1$ //$NON-NLS-2$
			regexedRootToStrip = "^"+regexedRootToStrip+"/";
		}
		while (zipEntry != null) {
			// We will construct the new file but we will strip off the project
			//  directory from the beginning of the path because we have already
			//  created the destination project for this zip.
			File file;
			if(regexedRootToStrip != null)
				file = new File(destinationFolder, zipEntry.getName().replaceFirst(regexedRootToStrip, ""));  
			else
				file = new File(destinationFolder, zipEntry.getName());
				

			if (false == zipEntry.isDirectory()) {

				/*
				 * Copy files (and make sure parent directory exist)
				 */
				File parentFile = file.getParentFile();
				if (null != parentFile && false == parentFile.exists()) {
					parentFile.mkdirs();
				}
					OutputStream os = null;

					try {
						os = new FileOutputStream(file);

						byte[] buffer = new byte[102400];
						while (true) {
							int len = zipFileStream.read(buffer);
							if (zipFileStream.available() == 0)
								break;
							os.write(buffer, 0, len);
						}
					} finally {
						if (null != os) {
							os.close();
						}
					}
			}
			
			zipFileStream.closeEntry();
			zipEntry = zipFileStream.getNextEntry();
		}
	}
}
