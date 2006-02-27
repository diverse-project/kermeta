/* $Id$
 * Project   : fr.irisa.triskell.kermeta.graphicaleditor (First iteration)
 * File      : FOperationDataStructure.java
 * License   : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Feb 20, 2006
 * Authors       : zdrey
 */
/* $Id$
 * Project   : Kermeta (First iteration)
 * File      : FOperationDataStructure.java
 * License   : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Feb 20, 2006
 * Authors       : zdrey
 * Contributors (this class is an adapted copy of topcased ecore editor) :
 *    David Sciamma (Anyware Technologies), Mathieu Garcia (Anyware Technologies),
 *     Jacques Lescot (Anyware Technologies) - initial API and implementation
 * ---------------------------------------------------------------------------- */  
package fr.irisa.triskell.kermeta.graphicaleditor.diagram.utils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import fr.irisa.triskell.kermeta.structure.FOperation;
import fr.irisa.triskell.kermeta.structure.FParameter;
import fr.irisa.triskell.kermeta.structure.FType;
import fr.irisa.triskell.kermeta.structure.FTypeVariable;
/**
 * Provide a structure for handling Operation data <br>
 * Used for the popup-property that defines an operation (parameters, return type)  
 * @generated NOT
 */
public class FOperationDataStructure
{

    /** A collection for ParameterObject objects */
    private ArrayList<ParameterObject> _dataOwnedParameters;
    private ArrayList<ParameterObject> _dataTypeParameters;
//  Constant to add the corrects elements to the operation data structure 
	public static final String FOPERATION_owned_parameter = "ownedParameter";
	public static final String FOPERATION_type_parameter = "typeParameter";
	

    /**
     * The constructor
     * 
     * @param operation
     */
    public FOperationDataStructure(FOperation operation)
    {
        _dataOwnedParameters = new ArrayList<ParameterObject>();
        _dataTypeParameters = new ArrayList<ParameterObject>();
        if (operation != null)
        {
            addAll(operation.getFOwnedParameter());
            addAllTypeParameters(operation.getFTypeParameter());
        }
    }

    /**
     * Add a property to the structure
     * 
     * @param parameter
     */
    public void addOwnedParameter(FParameter parameter)
    {
   		_dataOwnedParameters.add(new ParameterObject(parameter.getFName(), parameter.getFType()));
    }

    /**
     * @param name
     * @param type
     */
    public void addOwnedParameter(String name, FType type)
    {
        _dataOwnedParameters.add(new ParameterObject(name, type));
    }
    
    /** Add a type parameter */
    public void addTypeParameter(FTypeVariable typevar)
    {
        _dataTypeParameters.add(new ParameterObject(typevar.getFName(), typevar.getFSupertype()));
    }
    
    public void addTypeParameter(String name, FType supertype)
    {
        _dataTypeParameters.add(new ParameterObject(name, supertype));
        System.err.println("pouete");
    }

    /**
     * @param object
     */
    public void removeOwnedParameter(Object object)
    {
        _dataOwnedParameters.remove(object);
    }
    
    public void removeTypeParameter(Object object) { _dataTypeParameters.remove(object); }

    /**
     * Add a collection of properties to an instance specification
     * 
     * @param parameters
     */
    public void addAll(Collection<FParameter> parameters)
    {
        for (Iterator<FParameter> iterator = parameters.iterator(); iterator.hasNext();)
            addOwnedParameter(iterator.next());
    }
    
    public void addAllTypeParameters(Collection<FTypeVariable> parameters)
    {
        for (Iterator<FTypeVariable> iterator = parameters.iterator(); iterator.hasNext();)
            addTypeParameter(iterator.next());
    }

    /**
     * get the data collection
     * 
     * @return a Collection of InstanceStructureObject objects
     */
    public Collection<ParameterObject> getDataOwnedParameters()
    {
        return _dataOwnedParameters;
    }
    
    public Collection<ParameterObject> getDataTypeParameters()
    {
        return _dataTypeParameters;
    }


    /**
     * Get the name of a given object
     * 
     * @param object OperationDataObject object
     * @return the name
     */
    public String getDisplayName(Object object)
    {
        String result = ((ParameterObject) object).getName();
        if (result == null || result.equals(""))
        {
            result = "not set";
        }
        return result;
    }

    /**
     * Get the type name of a given object
     * 
     * @param object OperationDataObject object
     * @return the name of the type
     */
    public String getDisplayType(Object object)
    {
        FType type = getType(object);
        if (type == null)
        {
            return null;
        }
        return KermetaUtils.getDefault().getLabelForFType(type);
    }

    /**
     * Get the type of a given object
     * 
     * @param object OperationDataObject object
     * @return the type
     */
    public FType getType(Object object)
    {
        return ((ParameterObject) object).getType();
    }
 /*   
    public FTypeDefinition getTypeDefinition(Object object)
    {
        return KermetaUtils.getDefault().((ParameterObject) object).getType();
    }
*/
    /**
     * 
     * @param object
     * @param name
     */
    public void setName(Object object, String name)
    {
        ((ParameterObject) object).setName(name);
    }

    /**
     * Set the given type to the ParameterObject
     * @param object
     * @param type
     */
    public void setType(Object object, FType type)
    {
        ((ParameterObject) object).setType(type);
    }
    /**
     * 
     * @param object
     * @param type
     */
    public void setTypeDefinition(Object object, FType type)
    {
        //((ParameterObject) object).setTypeDefinition();
    }
}