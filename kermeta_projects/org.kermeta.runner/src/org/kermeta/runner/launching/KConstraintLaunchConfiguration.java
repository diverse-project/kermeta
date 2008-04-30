/*$Id: KConstraintLaunchConfiguration.java,v 1.2 2008-04-30 13:58:47 ftanguy Exp $
* Project : org.kermeta.runner
* File : 	KConstraintConfiguration.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 30 avr. 08
* Authors : ftanguy
*/
package org.kermeta.runner.launching;


public class KConstraintLaunchConfiguration extends AbstractLaunchConfiguration {

	@Override
	protected boolean isContraint() {
		return true;
	}

}
