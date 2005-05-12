/* $Id: KMMetaBuilder.java,v 1.17 2005-05-12 08:19:46 zdrey Exp $
 * Project : Kermeta (First iteration)
 * File : KM2KMTPrettyPrinter.java
 * License : GPL
 * Copyright : IRISA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Feb 25, 2005
 * Authors : 
 * 	Franck Fleurey	ffleurey@irisa.fr
 *  Zoe Drey 		zdrey@irisa.fr
 * 
*/
package fr.irisa.triskell.kermeta.builder;

import java.io.File;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;


import fr.irisa.triskell.kermeta.behavior.*;
import fr.irisa.triskell.kermeta.parser.SimpleKWList;
import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.runtime.basetypes.Collection;
import fr.irisa.triskell.kermeta.runtime.factory.RuntimeObjectFactory;
import fr.irisa.triskell.kermeta.structure.*;
import fr.irisa.triskell.kermeta.visitor.KermetaVisitor;

import fr.irisa.triskell.kermeta.interpreter.Interpreter;
import fr.irisa.triskell.kermeta.launcher.Run;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.loader.kmt.KMT2KMPass;
import fr.irisa.triskell.kermeta.loader.kmt.KMTUnit;



/**
 * Create the runtime object representation of the language itself.
 */
public class KMMetaBuilder {

	//memorize processed units to avoid loop in exploration
	protected List processedUnits;
	protected RuntimeLoader runtimeLoader;
	// The KermetaUnit to load
	private KermetaUnit unit;
	// The runtime memory
	private RuntimeMemory memory;
	


	public KMMetaBuilder(KermetaUnit pUnit, RuntimeLoader pLoader)
	{
		this.processedUnits=new ArrayList();
		this.runtimeLoader = pLoader;
		this.unit = pUnit;
	    this.memory = runtimeLoader.runtimeMemory;
	
	}
	
	/**
	 * Load all the class definitions and process the parametric types O:)
	 */
	public void load()
	{
		unitsExplorer(unit);
		processParametricTypes();    
	}
	
	/**
	 * Get the class definitions from the given unit, and create RuntimeObjects
	 * corresponding to them. This method feeds the hashtable <code>classdef_table</code>
	 * from the RuntimeObjectFactory
	 * @param unit The unit from where we get the classdefinitions and primitive types
	 *  
	 */
	public void unitsExplorer(KermetaUnit unit) {
		this.processedUnits.add(unit);
		Iterator it=unit.importedUnits.iterator();
		RuntimeObjectFactory roFactory = memory.getROFactory();
		while(it.hasNext()) {
			KermetaUnit importedUnit=(KermetaUnit)it.next();
			if (!this.processedUnits.contains(importedUnit))
			this.unitsExplorer(importedUnit);
		}
		it=unit.typeDefs.keySet().iterator();
		while (it.hasNext()) {
			String typeName=(String)it.next();
			if (roFactory.getClassDefTable().containsKey(typeName))
				System.err.println("KMMetaBuilder : Interpreter owns twice same typenames :"+typeName);
			else {
				FTypeDefinition typedef=unit.getTypeDefinitionByName(typeName);
				if (typedef instanceof FClassDefinition || typedef instanceof FPrimitiveType) {
					roFactory.getClassDefTable().put(typeName,runtimeLoader.createROFromClassDef(typedef,roFactory.getClassClass()));
				}
				else System.err.println("KMMetaBuilder: not a good typedef kind =>"+typedef);
			}
		}
	}
	
	/**
	 * Add the type parameters to all the parametric classes
	 */
	public void processParametricTypes() {
		RuntimeObjectFactory roFactory = memory.getROFactory();
		Iterator it=roFactory.getClassDefTable().keySet().iterator();
		while (it.hasNext()) {
			RuntimeObject type=(RuntimeObject)roFactory.getClassDefTable().get(it.next());
			if (type.getData().containsKey("kcoreObject")) {
				FObject kcoreObject=(FObject)type.getData().get("kcoreObject");
				if (kcoreObject instanceof FClass) {
					FClassDefinition classdef=((FClass)kcoreObject).getFClassDefinition();
					if (classdef.getFTypeParameter().size()>0)
						addTypeParameters(type,classdef.getFTypeParameter());
				}
			}
		}
	}
	
	/**
	 * Add the type parameters in the list of ftypeParameters to the given <code>classNode</code>
	 */
	public void addTypeParameters(RuntimeObject classNode,EList fTypeParameters) {
		RuntimeObjectFactory roFactory = memory.getROFactory();
		RuntimeObject typeParams=Collection.createCollection((RuntimeObject)roFactory.getClassDefTable().get("kermeta::language::structure::Parameter"));
//		RuntimeObject typeVarMC=(RuntimeObject)roFactory.getClassDefTable().get("kermeta::reflection::TypeVariable");
		Iterator it=fTypeParameters.iterator();
		while (it.hasNext()) {
			FTypeVariable tv=(FTypeVariable)it.next();
			RuntimeObject typeParamNode=roFactory.createTypeVariable(tv);
			Collection.add(typeParams,typeParamNode);
		}
		classNode.getProperties().put("typeParameter",typeParams);
	}
}

