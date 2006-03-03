/* $Id: TypeVariableEnforcer.java,v 1.6 2006-03-03 15:22:18 dvojtise Exp $
* Project : Kermeta (First iteration)
* File : GenericTypeSubstitution.java
* License : GPL
* Copyright : IRISA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 12 avr. 2005
* Author : Franck Fleurey
* Description :
* Transforms a fr.irisa.triskell.kermeta.language.structure.Type that contains type variables into an 
* actual fr.irisa.triskell.kermeta.language.structure.Type by replacing variables by their values.
*/ 
package fr.irisa.triskell.kermeta.typechecker;

import java.util.Hashtable;
import java.util.Iterator;

//import fr.irisa.triskell.kermeta.language.structure.FClass;
import fr.irisa.triskell.kermeta.language.structure.Enumeration;
import fr.irisa.triskell.kermeta.language.structure.FunctionType;
import fr.irisa.triskell.kermeta.language.structure.PrimitiveType;
import fr.irisa.triskell.kermeta.language.structure.ProductType;
//import fr.irisa.triskell.kermeta.language.structure.FType;
import fr.irisa.triskell.kermeta.language.structure.TypeVariable;
import fr.irisa.triskell.kermeta.language.structure.TypeVariableBinding;
import fr.irisa.triskell.kermeta.language.structure.VoidType;
import fr.irisa.triskell.kermeta.language.structure.StructureFactory;
import fr.irisa.triskell.kermeta.language.structure.impl.StructurePackageImpl;
import fr.irisa.triskell.kermeta.visitor.KermetaOptimizedVisitor;
import fr.irisa.triskell.kermeta.visitor.KermetaVisitor;

/**
 * @author Franck Fleurey
 * IRISA / University of rennes 1
 * Distributed under the terms of the GPL license
 */
public class TypeVariableEnforcer extends KermetaOptimizedVisitor {
	
	public static fr.irisa.triskell.kermeta.language.structure.Type getBoundType(fr.irisa.triskell.kermeta.language.structure.Type generic, Hashtable bindings) {
		TypeVariableEnforcer visitor = new TypeVariableEnforcer(bindings);
		return (fr.irisa.triskell.kermeta.language.structure.Type) visitor.accept(generic);
	}
	
	public static Hashtable getTypeVariableBinding(fr.irisa.triskell.kermeta.language.structure.Class c) {
		Hashtable result = new Hashtable();
		Iterator it = c.getTypeParamBinding().iterator();
		while(it.hasNext()) {
			TypeVariableBinding bind = (TypeVariableBinding)it.next();
			result.put(bind.getVariable(), bind.getType());
		}
		return result;
	}
	
	protected Hashtable bindings;
	protected StructureFactory struct_factory;

	
	/**
	 * Create a copy of the function type by resolving types
	 */
	public Object visitFunctionType(FunctionType arg0) {
		FunctionType result = struct_factory.createFunctionType();
		result.setLeft(getBoundType(arg0.getLeft(), bindings));
		result.setRight(getBoundType(arg0.getRight(), bindings));
		return result;
	}
	
	/**
	 * Create a copy of the FClass with resolved type parameters
	 */
	public Object visitClass(fr.irisa.triskell.kermeta.language.structure.Class arg0) {
		fr.irisa.triskell.kermeta.language.structure.Class result;
		if ( arg0.getTypeParamBinding().size() == 0) {
			result = arg0;
		}
		else {
			result = struct_factory.createClass();
			result.setTypeDefinition(arg0.getTypeDefinition());
			Iterator it = arg0.getTypeParamBinding().iterator();
			while(it.hasNext()) {
				TypeVariableBinding provided = (TypeVariableBinding)it.next();
				TypeVariableBinding bind = struct_factory.createTypeVariableBinding();
				bind.setVariable(provided.getVariable());
				bind.setType(getBoundType(provided.getType(), bindings));
				result.getTypeParamBinding().add(bind);
			}
		}
		return result;
	}
	
	public Object visitEnumeration(Enumeration arg0) {
		return arg0;
	}
	
	public Object visitPrimitiveType(PrimitiveType arg0) {
		return arg0;
	}
	
	public Object visitProductType(ProductType arg0) {
		ProductType result = struct_factory.createProductType();
		Iterator it = arg0.getType().iterator();
		while(it.hasNext()) {
			fr.irisa.triskell.kermeta.language.structure.Type t = (fr.irisa.triskell.kermeta.language.structure.Type)it.next();
			result.getType().add(getBoundType(t, bindings));
		}
		return result;
	}
	
	
	public Object visitTypeVariable(TypeVariable arg0) {
		if (bindings.containsKey(arg0)) return (fr.irisa.triskell.kermeta.language.structure.Type)bindings.get(arg0);
		else return arg0;
	}
	
	public Object visitVoidType(VoidType arg0) {
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
