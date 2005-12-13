/* $Id: KermetaSecurityManager.java,v 1.2 2005-12-13 18:08:58 zdrey Exp $
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
import java.net.NetPermission;
import java.net.SocketPermission;
import java.security.Permission;
import java.security.SecurityPermission;
import java.util.PropertyPermission;
import java.util.logging.LoggingPermission;

import org.osgi.framework.AdminPermission;

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
	/** 
	 * All the zapped permissions are those that throwed exception when launching the
	 * runner plugin in the debug mode.
	 * 
	 * Note : if you intend to make this class evolve, it is suggested to add the following option
	 * to the JVM (of the Runtime Workbench from where you test the Debugger plugin) :
	 * "-Dsun.rmi.server.exceptionTrace=true" 
	 *  */
	public void checkPermission(Permission perm) {
		if (perm instanceof ReflectPermission)  return;
		// This perm. is necessary to access to the plugins informations
		if (perm instanceof AdminPermission) return;
		if (perm instanceof PropertyPermission) return;
		if (perm instanceof SerializablePermission) return;
		// The 2 following perm. are necessary to allow socket connections
		if (perm instanceof NetPermission) return;
		// This perm. is equivalent to the overriding of the checkXXX methods written below 
		if (perm instanceof SocketPermission) return;
		// 
		if (perm instanceof RuntimePermission) return;
		// This perm. is necessary to access to the Registry created in our debug program.
		// (Otherwise an unprecise exception is thrown.
		if (perm instanceof LoggingPermission) return; 
		if (perm instanceof SecurityPermission) return;
		// This perm. is necessary to make the Remote interfaces available
		if (perm instanceof FilePermission) {
			FilePermission fileperm=(FilePermission) perm;
			String filename=fileperm.getName();
			String test = fileperm.getActions();
			//System.out.println("trying to read file : " + filename);
			//don't allow files to be deleted -- don't allow write permission
			if (test.indexOf("delete")==-1) return;//&& test.indexOf("write")==-1) return;
		}
		else
			//throw a security exception for anything you don't want to allow
			throw new SecurityException("access denied ? "+perm.getClass().toString()+":"+ perm.getName());
	}
	
	
	public void checkRead(FileDescriptor fd) { }
	public void checkRead(String file, Object context) { }
	
/*	public void checkConnect (String host, int port) {}
    public void checkConnect (String host, int port, Object context) {}
*/
	/** @see java.lang.SecurityManager#checkAccept(java.lang.String, int) */
/*	public void checkAccept(String host, int port) { }
	public void checkListen(int port) { }
	public void checkAccess(Thread t) { }
	public void checkAccess(ThreadGroup g) { } */
	
	
	
		 


}
