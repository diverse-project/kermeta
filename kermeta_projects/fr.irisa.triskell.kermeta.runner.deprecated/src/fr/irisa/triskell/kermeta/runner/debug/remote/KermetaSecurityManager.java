/* $Id: KermetaSecurityManager.java,v 1.1 2005-12-09 16:25:35 zdrey Exp $
 * Project   : fr.irisa.triskell.kermeta.runner (First iteration)
 * File      : KermetaSecurityManager.java
 * License   : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Dec 9, 2005
 * Authors       : zdrey
 */
package fr.irisa.triskell.kermeta.runner.debug.remote;

import java.io.FileDescriptor;
import java.io.FilePermission;
import java.io.SerializablePermission;
import java.lang.reflect.ReflectPermission;
import java.security.Permission;

/**
 * A special security manager is set to allow RMI application to download the needed
 * remote interfaces.
 * We don't use the default RMISecurityManager since it only inherits SecurityManager
 * and add no specific rights.
 * The following security manager normally allows only file reading.
 */
public class KermetaSecurityManager extends SecurityManager {
	
	// methods are set empty for anything we want to allow (in the security 
	// manager class, the default is to throw a security exception)
		 
	public void checkPermission(Permission perm) {
		if (perm instanceof ReflectPermission)  return;
		else if (perm instanceof SerializablePermission) return;
		
		else if (perm instanceof FilePermission) {
			FilePermission fileperm=(FilePermission) perm;
			String filename=fileperm.getName();
			String test = fileperm.getActions();
			
			//don't allow files to be deleted
			if (test.indexOf("delete")==-1) return;
			// don't allow write permission
			if (test.indexOf("write")==-1) return;
		}
		else
			//throw a security exception for anything you don't want to allow
			throw new SecurityException("access?"+perm.getClass().toString()+":"+ perm.getName());
	}
	
	public void checkRead(FileDescriptor fd) 
	{ }
	
	public void checkRead(String file, Object context) { }
		 


}
