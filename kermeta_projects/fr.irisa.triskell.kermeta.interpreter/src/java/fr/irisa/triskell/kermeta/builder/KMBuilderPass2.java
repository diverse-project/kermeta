/* $Id: KMBuilderPass2.java,v 1.4 2005-05-12 08:19:45 zdrey Exp $
 * Project : Kermeta (First iteration)
 * File : KM2KMTPrettyPrinter.java
 * License : GPL
 * Copyright : IRISA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Feb 25, 2005
 * Authors : 
 * 	Franck Fleurey	ffleurey@irisa.fr
 *  Zoe Drey 		zdrey@irisa.fr
 * Description :
 * 	Prints a kermeta model into a human-readable form (which is KMT)
 * 
 * 
*/
package fr.irisa.triskell.kermeta.builder;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;


import fr.irisa.triskell.kermeta.ast.Property;
import fr.irisa.triskell.kermeta.behavior.*;
import fr.irisa.triskell.kermeta.parser.SimpleKWList;
import fr.irisa.triskell.kermeta.reflect.KMReflect;
import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.runtime.basetypes.Boolean;
import fr.irisa.triskell.kermeta.runtime.basetypes.Collection;
import fr.irisa.triskell.kermeta.runtime.factory.RuntimeObjectFactory;
import fr.irisa.triskell.kermeta.runtime.language.ReflectiveCollection;
import fr.irisa.triskell.kermeta.structure.*;
import fr.irisa.triskell.kermeta.visitor.KermetaVisitor;

import fr.irisa.triskell.kermeta.interpreter.Interpreter;
import fr.irisa.triskell.kermeta.launcher.Run;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.loader.kmt.KMT2KMPass;
import fr.irisa.triskell.kermeta.loader.kmt.KMTUnitLoadError;



/**
 * Pass that sets the opposite properties
 */
public class KMBuilderPass2 extends KermetaVisitor {

    
    protected KermetaUnit unit;
    protected RuntimeMemory memory;
    protected RuntimeObject currentClassDef;
	
    public KMBuilderPass2(KermetaUnit pUnit, RuntimeMemory pMem)
    {
        this.unit = pUnit;
        this.memory = pMem;
    }
    
    
    /**
     * Get the Runtime Object representation of the property specified by its name.
     *   
     * @return
     */
    public RuntimeObject findROPropertyByName(String pname, RuntimeObject classdef)
	{
        // Get the class Definition that contains it
        RuntimeObject result = null; 
        RuntimeObject propROList=(RuntimeObject)classdef.getProperties().get("ownedAttribute");
        ArrayList propAList = (ArrayList)propROList.getData().get("CollectionArrayList");
        // Get the property named "pname" in the list of ownedAttributes of this class
        int i = 0;
        while (i<propAList.size() && result == null)
        { 
            if (((RuntimeObject)propAList.get(i)).getProperties().get("name").equals(pname))
                result = (RuntimeObject)propAList.get(i); 
            i++;
        }
	    return result;
	}
	
    
    public Object visit(FClassDefinition node)
    {
        this.currentClassDef = memory.getROFactory().getTypeDefinitionByName(node.getFName());
        return null;
    }

    
    
	/*
	 * manage property <-> ooposite property link for runtimeObjects
	 * 
	 * similar to KMBuilderPass1, where link is done at TODO in KMBuilderPasss1
	 * Build only the link opposite, All other buildings are already done in Pass1 !
	 */
	/**
	 * @see kermeta.ast.MetacoreASTNodeVisitor#beginVisit(metacore.ast.Property)
	 */
	public Object visit(FProperty node)
	{
	    if (node.getFOpposite() != null) {
		    
		    // Get the RO representation of this property
	        RuntimeObject roproperty = findROPropertyByName(node.getFName(), this.currentClassDef); 
		    
		    // Get the name of this property's opposite
	        // The opposite property already exists as a String in the properties of the Runtime Object
	        // property. We convert here this String into the corresponding
	        // Runtime Object.
	        String opname = (String)roproperty.getProperties().get("opposite");
		    
		    // Get the class definition of the current property 
	        FClassDefinition classdef = ((FClass)node.getFType()).getFClassDefinition();
	        // ClassDefinition as a RO
		    RuntimeObject roclassdef = memory.getROFactory().getTypeDefinitionByName(unit.getQualifiedName(classdef));
		    // Get the Runtime representation of this property, from its name
		    RuntimeObject oppositeproperty = findROPropertyByName(opname, roclassdef);
		    // Set the "opposite" property in the Hashtable to this ROproperty
		    roproperty.getProperties().put("opposite", oppositeproperty);
		}
		return null;
	}
    
    
}

