/*******************************************************************************
 * Copyright (c) 2005 AIRBUS FRANCE.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    David Sciamma (Anyware Technologies), Mathieu Garcia (Anyware Technologies),
 *    Jacques Lescot (Anyware Technologies) - initial API and implementation
 *******************************************************************************/
package fr.irisa.triskell.kermeta.graphicaleditor.actions.utils;

/**
 * Identifies new Action constants Creation : 19 may 2006
 * 
 * @author <a href="mailto:jacques.lescot@anyware-tech.com">Jacques LESCOT</a>
 */
public interface StructureActionConstants
{
    /** The "deleteInheritanceEdge" action identifier */
    String DELETE_INHERITANCE_EDGE = "deleteInheritanceEdge";
    
    /** Public constant defining the Validate action id. */
	//public static final String VALIDATE = "fr.irisa.triskell.kermeta.graphicaleditor.validate";
	
    /** Public constant defining the Validate action text. */
	//public static final String VALIDATE_TEXT = "Check constraints";
	
    public static final String KM2KMT = "fr.irisa.triskell.kermeta.graphicaleditor.convertKM2KMT";
	
    /** Public constant defining the Validate action text. */
	public static final String KM2KMT_TEXT = "Generate Kermeta text";
}
