/* $Id: OperationDataStructure.java,v 1.3 2006-04-11 17:29:35 zdrey Exp $
 * Project   : fr.irisa.triskell.kermeta.graphicaleditor (First iteration)
 * File      : OperationDataStructure.java
 * License   : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Feb 20, 2006
 * Authors       : zdrey
 */
/* $Id: OperationDataStructure.java,v 1.3 2006-04-11 17:29:35 zdrey Exp $
 * Project   : Kermeta (First iteration)
 * File      : OperationDataStructure.java
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

import org.eclipse.emf.ecore.EStructuralFeature;

import fr.irisa.triskell.kermeta.exporter.kmt.KM2KMTPrettyPrinter;
import fr.irisa.triskell.kermeta.language.structure.Operation;
import fr.irisa.triskell.kermeta.language.structure.Parameter;
import fr.irisa.triskell.kermeta.language.structure.Type;
import fr.irisa.triskell.kermeta.language.structure.TypeVariable;
/**
 * Provide a structure for handling Operation data <br>
 * Used for the popup-property that defines an operation (parameters, return type)  
 * @generated NOT
 */
public class OperationDataStructure
{

    /** A collection for ParameterObject objects */
    private ArrayList<ParameterObject> _dataOwnedParameters;
    private ArrayList<ParameterObject> _dataTypeParameters;
    private String _operationBody;
//  Constant to add the corrects elements to the operation data structure 
	public static final String FOPERATION_owned_parameter = "ownedParameter";
	public static final String FOPERATION_type_parameter = "typeParameter";
	
    /**
     * The constructor
     * 
     * @param operation
     */
    public OperationDataStructure(Operation operation)
    {
        _dataOwnedParameters = new ArrayList<ParameterObject>();
        _dataTypeParameters = new ArrayList<ParameterObject>();
        
        if (operation != null)
        {
            addAll(operation.getOwnedParameter());
            addAllTypeParameters(operation.getTypeParameter());
            if (operation.getBody()!=null)
            {	
            	try
            	{
            		setOperationBody((String)KermetaUtils.getDefault().getPrettyPrinter().accept(operation));
            	}
            	catch (Error e)
            	{
            		KermetaUtils.internalLog.error("The body of the operation could not be set :");
            	}
            }
        }
    }

    /**
     * Add a property to the structure
     * 
     * @param parameter
     */
    public void addOwnedParameter(Parameter parameter)
    {
   		_dataOwnedParameters.add(new ParameterObject(parameter.getName(), parameter.getType()));
    }

    /**
     * @param name
     * @param type
     */
    public void addOwnedParameter(String name, Type type)
    {
        _dataOwnedParameters.add(new ParameterObject(name, type));
    }
    
    /** Add a type parameter */
    public void addTypeParameter(TypeVariable typevar)
    {
        _dataTypeParameters.add(new ParameterObject(typevar.getName(), typevar.getSupertype()));
    }
    
    public void addTypeParameter(String name, Type supertype)
    {
        _dataTypeParameters.add(new ParameterObject(name, supertype));
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
    public void addAll(Collection<Parameter> parameters)
    {
        for (Iterator<Parameter> iterator = parameters.iterator(); iterator.hasNext();)
            addOwnedParameter(iterator.next());
    }
    
    public void addAllTypeParameters(Collection<TypeVariable> parameters)
    {
        for (Iterator<TypeVariable> iterator = parameters.iterator(); iterator.hasNext();)
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
        Type type = getType(object);
        if (type == null)
        {
            return null;
        }
        return KermetaUtils.getDefault().getLabelForType(type);
    }

    /**
     * Get the type of a given object
     * 
     * @param object OperationDataObject object
     * @return the type
     */
    public Type getType(Object object)
    {
        return ((ParameterObject) object).getType();
    }
    
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
    public void setType(Object object, Type type)
    {
        ((ParameterObject) object).setType(type);
    }

	/**
	 * @return Returns the _operationBody.
	 */
	public String getOperationBody() {
		return _operationBody;
	}

	/**
	 * @param body The _operationBody to set.
	 */
	public void setOperationBody(String body) {
		_operationBody = body;
	}
    
    
    
}