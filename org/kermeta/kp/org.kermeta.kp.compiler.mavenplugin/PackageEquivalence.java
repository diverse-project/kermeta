/* $Id:$ 
 * Creation : 2 mars 2011
 * Licence  : EPL 
 * Copyright: IRISA/INRIA
 * Authors  : 
 *            Didier Vojtisek <didier.vojtisek@inria.fr>
 */
package org.kermeta.kp.compiler.mavenplugin;

public class PackageEquivalence {
	
	/**
     * ecorePackageName of packageEquivalence : used to indicate when a package in the ecore is different from the generated java code
     *
     * @parameter 
     */
	private String ecorePackageName;
	/**
     * javaPackageName packageEquivalence : used to indicate when a package in the ecore is different from the generated java code
     *
     * @parameter 
     */
	private String javaPackageName;
	
	
	public PackageEquivalence() {
		super();
	}


	public String getEcorePackageName() {
		return ecorePackageName;
	}


	public void setEcorePackageName(String ecorePackageName) {
		this.ecorePackageName = ecorePackageName;
	}


	public String getJavaPackageName() {
		return javaPackageName;
	}


	public void setJavaPackageName(String javaPackageName) {
		this.javaPackageName = javaPackageName;
	}
	
	
}
