/* $Id: $
 * Project    : org.kermeta.kp.editor
 * License    : EPL
 * Copyright  : IRISA / INRIA / Universite de Rennes 1
 * -------------------------------------------------------------------
 * Creation date : 17 févr. 2011
 * Authors : 
 *            Haja Rambelontsalama <hajanirina-johary.rambelontsalama@inria.fr>
 */

package org.kermeta.kp.loader.kp;

public class RunKPLoader {

	public static void main(String[] args) {
		System.out.println("Run KP Loader");
		//System.out.println("Loading resouce at : " + uriKpResource);
		String uriKpResource = "/home/hrambelo/application/Eclipse/64/EGalileoBase/workspace/org.kermeta.kp.model/src/metamodel/sample/sample.kpt";
		KpLoader ldr = new KpLoader();
		ldr.loadKp(uriKpResource);
	}
}
