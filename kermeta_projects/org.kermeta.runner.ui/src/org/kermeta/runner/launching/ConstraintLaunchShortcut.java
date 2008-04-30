/*$Id: ConstraintLaunchShortcut.java,v 1.3 2008-04-30 13:58:49 ftanguy Exp $
* Project : org.kermeta.runner.ui
* File : 	ConstraintLaunchShortcut.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 30 avr. 08
* Authors : ftanguy
*/
package org.kermeta.runner.launching;

import org.kermeta.runner.launching.KConstants;

public class ConstraintLaunchShortcut extends KLaunchShortcut {

	public ConstraintLaunchShortcut() {
		super( KConstants.CONSTRAINT_CONFIGURATION );
	}

	@Override
	protected boolean isConstraint() {
		return true;
	}
}
