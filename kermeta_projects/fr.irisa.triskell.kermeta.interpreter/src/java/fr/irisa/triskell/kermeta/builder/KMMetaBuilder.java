/* $Id: KMMetaBuilder.java,v 1.7 2005-03-21 11:07:53 jpthibau Exp $
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
 *
 */
public class KMMetaBuilder {

	//memorize processed units to avoid loop in exploration
	protected List processedUnits;

	/** build all metaclases RuntimeObjects from the given unit and
	 * units required from it.
	 * 
	 */
	public KMMetaBuilder(KermetaUnit unit) {
		//update the metametaclass definition
		Run.koFactory.setClassClass((FClassDefinition)unit.getTypeDefinitionByName("kermeta::reflection::Class"));
		this.processedUnits=new ArrayList();
		unitsExplorer(unit);
		processParametricTypes();
	}
	
	public void unitsExplorer(KermetaUnit unit) {
		this.processedUnits.add(unit);
		Iterator it=unit.importedUnits.iterator();
		while(it.hasNext()) {
			KMTUnit importedUnit=(KMTUnit)it.next();
			if (!this.processedUnits.contains(importedUnit))
			this.unitsExplorer(importedUnit);
		}
		RuntimeObjectFactory runtimeFactory=Run.koFactory;
		it=unit.typeDefs.keySet().iterator();
		while (it.hasNext()) {
			String typeName=(String)it.next();
			if (runtimeFactory.getClassDefTable().containsKey(typeName))
				System.err.println("KMMetaBuilder : Interpreter owns twice same typenames :"+typeName);
			else {
				FTypeDefinition typedef=unit.getTypeDefinitionByName(typeName);
				if (typedef instanceof FClassDefinition) {
					runtimeFactory.getClassDefTable().put(typeName,runtimeFactory.createClassDefinition((FClassDefinition)typedef));
					System.out.println(typeName);
				}
				else if (typedef instanceof FPrimitiveType) {
					runtimeFactory.getClassDefTable().put(typeName,runtimeFactory.createPrimitiveType((FPrimitiveType)typedef));
					System.out.println(typeName);
				}
				else System.err.println("KMMetaBuilder: not a good typedef kind =>"+typedef);
			}
		}
	}
	
	public void processParametricTypes() {
		Iterator it=Run.koFactory.getClassDefTable().keySet().iterator();
		while (it.hasNext()) {
			RuntimeObject type=(RuntimeObject)Run.koFactory.getClassDefTable().get(it.next());
			if (type.getData().containsKey("FClassDefinition")) {
				FClassDefinition classdef=(FClassDefinition)type.getData().get("FClassDefinition");
				if (classdef.getFTypeParameter().size()>0)
					addTypeParameters(type,classdef.getFTypeParameter());
			}
		}
	}
	public static void addTypeParameters(RuntimeObject classNode,EList FTypeParameters) {
		RuntimeObject typeParams=Collection.createCollection((RuntimeObject)Run.koFactory.getClassDefTable().get("kermeta::language::structure::Parameter"));
//		RuntimeObject typeVarMC=(RuntimeObject)Run.koFactory.getClassDefTable().get("kermeta::reflection::TypeVariable");
		Iterator it=FTypeParameters.iterator();
		while (it.hasNext()) {
			FTypeVariable tv=(FTypeVariable)it.next();
			RuntimeObject typeParamNode=Run.koFactory.createTypeVariable(tv);
			Collection.add(typeParams,typeParamNode);
		}
		classNode.getProperties().put("typeParameter",typeParams);
	}
}

