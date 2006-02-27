/* $Id$
 * Project   : fr.irisa.triskell.kermeta.graphicaleditor (First iteration)
 * File      : ParameterObject.java
 * License   : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Feb 21, 2006
 * Authors       : zdrey
 * Class that was encapsulated in FOperationDataStructure 
 */
package fr.irisa.triskell.kermeta.graphicaleditor.diagram.utils;

import fr.irisa.triskell.kermeta.structure.FType;
import fr.irisa.triskell.kermeta.structure.FTypeDefinition;

/**
 * The structure that encapsulate data related to an operation parameter
 * and its displayable information. 
 */
public class ParameterObject {
	
	/** Parameter name */
    private String _name;

    /** Parameter type */
    private FType _type;
    
    /** Parameter typedef associated? */
    private FTypeDefinition _typedef;
	/**
     * The constructor
     * 
     * @param name parameter name
     * @param type parameter type
     */
    public ParameterObject(String name, FType type)
    {
        _name = name;
        _type = type;
    }

    /**
     * Get property name 
     * @return name of the property
     */
    public String getName() { return _name; }

    /**
     * Get property type
     * @return type of the property
     */
    public FType getType() { return _type; }
    
    /**
     * Get property typedef
     */
    public FTypeDefinition getTypeDefinition() { return _typedef; }

    /**
     * Set new name for the parameter
     * @param name
     */
    public void setName(String name) { _name = name; }

    /**
     * Set new type for the parameter
     * @param type
     */
    public void setType(FType type) { _type = type; }

	public void setTypeDefinition(FTypeDefinition typedef) { _typedef = typedef; }

} // End internal class
