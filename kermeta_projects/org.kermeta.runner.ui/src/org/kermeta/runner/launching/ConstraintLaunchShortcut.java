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
