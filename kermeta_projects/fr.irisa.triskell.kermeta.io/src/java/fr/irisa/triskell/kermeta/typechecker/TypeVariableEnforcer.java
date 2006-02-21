/* $Id: TypeVariableEnforcer.java,v 1.5 2006-02-21 17:34:19 jsteel Exp $
* Project : Kermeta (First iteration)
* File : GenericTypeSubstitution.java
* License : GPL
* Copyright : IRISA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 12 avr. 2005
* Author : Franck Fleurey
* Description :
* Transforms a FType that contains type variables into an 
* actual Ftype by replacing variables by their values.
*/ 
package fr.irisa.triskell.kermeta.typechecker;

import java.util.Hashtable;
import java.util.Iterator;

import fr.irisa.triskell.kermeta.structure.FClass;
import fr.irisa.triskell.kermeta.structure.FEnumeration;
import fr.irisa.triskell.kermeta.structure.FFunctionType;
import fr.irisa.triskell.kermeta.structure.FPrimitiveType;
import fr.irisa.triskell.kermeta.structure.FProductType;
import fr.irisa.triskell.kermeta.structure.FType;
import fr.irisa.triskell.kermeta.structure.FTypeVariable;
import fr.irisa.triskell.kermeta.structure.FTypeVariableBinding;
import fr.irisa.triskell.kermeta.structure.FVoidType;
import fr.irisa.triskell.kermeta.structure.StructureFactory;
import fr.irisa.triskell.kermeta.structure.impl.StructurePackageImpl;
import fr.irisa.triskell.kermeta.visitor.KermetaOptimizedVisitor;
import fr.irisa.triskell.kermeta.visitor.KermetaVisitor;

/**
 * @author Franck Fleurey
 * IRISA / University of rennes 1
 * Distributed under the terms of the GPL license
 */
public class TypeVariableEnforcer extends KermetaOptimizedVisitor {
	
	public static FType getBoundType(FType generic, Hashtable bindings) {
		TypeVariableEnforcer visitor = new TypeVariableEnforcer(bindings);
		return (FType) visitor.accept(generic);
	}
	
	public static Hashtable getTypeVariableBinding(FClass c) {
		Hashtable result = new Hashtable();
		Iterator it = c.getFTypeParamBinding().iterator();
		while(it.hasNext()) {
			FTypeVariableBinding bind = (FTypeVariableBinding)it.next();
			result.put(bind.getFVariable(), bind.getFType());
		}
		return result;
	}
	
	protected Hashtable bindings;
	protected StructureFactory struct_factory;

	
	/**
	 * Create a copy of the function type by resolving types
	 */
	public Object visitFFunctionType(FFunctionType arg0) {
		FFunctionType result = struct_factory.createFFunctionType();
		result.setFLeft(getBoundType(arg0.getFLeft(), bindings));
		result.setFRight(getBoundType(arg0.getFRight(), bindings));
		return result;
	}
	
	/**
	 * Create a copy of the FClass with resolved type parameters
	 */
	public Object visitFClass(FClass arg0) {
		FClass result;
		if ( arg0.getFTypeParamBinding().size() == 0) {
			result = arg0;
		}
		else {
			result = struct_factory.createFClass();
			result.setFTypeDefinition(arg0.getFTypeDefinition());
			Iterator it = arg0.getFTypeParamBinding().iterator();
			while(it.hasNext()) {
				FTypeVariableBinding provided = (FTypeVariableBinding)it.next();
				FTypeVariableBinding bind = struct_factory.createFTypeVariableBinding();
				bind.setFVariable(provided.getFVariable());
				bind.setFType(getBoundType(provided.getFType(), bindings));
				result.getFTypeParamBinding().add(bind);
			}
		}
		return result;
	}
	
	public Object visitFEnumeration(FEnumeration arg0) {
		return arg0;
	}
	
	public Object visitFPrimitiveType(FPrimitiveType arg0) {
		return arg0;
	}
	
	public Object visitFProductType(FProductType arg0) {
		FProductType result = struct_factory.createFProductType();
		Iterator it = arg0.getFType().iterator();
		while(it.hasNext()) {
			FType t = (FType)it.next();
			result.getFType().add(getBoundType(t, bindings));
		}
		return result;
	}
	
	
	public Object visitFTypeVariable(FTypeVariable arg0) {
		if (bindings.containsKey(arg0)) return (FType)bindings.get(arg0);
		else return arg0;
	}
	
	public Object visitFVoidType(FVoidType arg0) {
	    return arg0;
	}
	
	/**
	 * Constructor 
	 */
	public TypeVariableEnforcer(Hashtable bindings) {
		super();
		this.bindings = bindings;
		struct_factory = StructurePackageImpl.init().getStructureFactory();
	}

}
