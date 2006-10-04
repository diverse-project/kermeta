/* $Id: ParameterObject.java,v 1.1 2006-10-04 08:37:16 cfaucher Exp $
 * Project   : fr.irisa.triskell.kermeta.graphicaleditor (First iteration)
 * File      : ParameterObject.java
 * License   : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Feb 21, 2006
 * Authors       : zdrey
 * Class that was encapsulated in OperationDataStructure 
 */
package fr.irisa.triskell.kermeta.graphicaleditor.diag.utils;

import fr.irisa.triskell.kermeta.language.structure.Type;
import fr.irisa.triskell.kermeta.language.structure.TypeDefinition;

/**
 * The structure that encapsulate data related to an operation parameter
 * and its displayable information. 
 */
public class ParameterObject {
	
	/** Parameter name */
    private String _name;

    /** Parameter type */
    private Type _type;
    
    /** Parameter typedef associated? */
    private TypeDefinition _typedef;
	/**
     * The constructor
     * 
     * @param name parameter name
     * @param type parameter type
     */
    public ParameterObject(String name, Type type)
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
    public Type getType() { return _type; }
    
    /**
     * Get property typedef
     */
    public TypeDefinition getTypeDefinition() { return _typedef; }

    /**
     * Set new name for the parameter
     * @param name
     */
    public void setName(String name) { _name = name; }

    /**
     * Set new type for the parameter
     * @param type
     */
    public void setType(Type type) { _type = type; }

	public void setTypeDefinition(TypeDefinition typedef) { _typedef = typedef; }

} // End internal class
