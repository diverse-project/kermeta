/* $Id: TypeVariableLeastDerivedEnforcer.java,v 1.3 2005-05-18 23:42:28 ffleurey Exp $
* Project : Kermeta (First iteration)
* File : GenericTypeSubstitution.java
* License : GPL
* Copyright : IRISA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 12 avr. 2005
* Author : Franck Fleurey
* Description :
* Transforms a FType that contains type variables into an 
* actual Ftype by replacing type variables by their least derived
* admissible type
*/ 
package fr.irisa.triskell.kermeta.typechecker;

import java.util.Iterator;

import fr.irisa.triskell.kermeta.structure.FClass;
import fr.irisa.triskell.kermeta.structure.FEnumeration;
import fr.irisa.triskell.kermeta.structure.FFunctionType;
import fr.irisa.triskell.kermeta.structure.FPrimitiveType;
import fr.irisa.triskell.kermeta.structure.FProductType;
import fr.irisa.triskell.kermeta.structure.FType;
import fr.irisa.triskell.kermeta.structure.FTypeVariable;
import fr.irisa.triskell.kermeta.structure.FTypeVariableBinding;
import fr.irisa.triskell.kermeta.structure.StructureFactory;
import fr.irisa.triskell.kermeta.structure.impl.StructurePackageImpl;
import fr.irisa.triskell.kermeta.visitor.KermetaVisitor;

/**
 * @author Franck Fleurey
 * IRISA / University of rennes 1
 * Distributed under the terms of the GPL license
 */
public class TypeVariableLeastDerivedEnforcer extends KermetaVisitor {
	
	protected static FType getBoundType(FType generic) {
		TypeVariableLeastDerivedEnforcer visitor = new TypeVariableLeastDerivedEnforcer();
		return (FType) visitor.accept(generic);
	}
	
	protected StructureFactory struct_factory;

	
	/**
	 * Create a copy of the function type by resolving types
	 */
	public Object visit(FFunctionType arg0) {
		FFunctionType result = struct_factory.createFFunctionType();
		result.setFLeft(getBoundType(arg0.getFLeft()));
		result.setFRight(getBoundType(arg0.getFRight()));
		return result;
	}
	
	/**
	 * Create a copy of the FClass with resolved type parameters
	 */
	public Object visit(FClass arg0) {
		FClass result;
		if ( arg0.getFTypeParamBinding().size() == 0) {
			result = arg0;
		}
		else {
			result = struct_factory.createFClass();
			result.setFClassDefinition(arg0.getFClassDefinition());
			Iterator it = arg0.getFTypeParamBinding().iterator();
			while(it.hasNext()) {
				FTypeVariableBinding provided = (FTypeVariableBinding)it.next();
				FTypeVariableBinding bind = struct_factory.createFTypeVariableBinding();
				bind.setFVariable(provided.getFVariable());
				bind.setFType(getBoundType(provided.getFType()));
				result.getFTypeParamBinding().add(bind);
			}
		}
		return result;
	}
	
	public Object visit(FEnumeration arg0) {
		return arg0;
	}
	
	public Object visit(FPrimitiveType arg0) {
		return arg0;
	}
	
	public Object visit(FProductType arg0) {
		FProductType result = struct_factory.createFProductType();
		Iterator it = arg0.getFType().iterator();
		while(it.hasNext()) {
			FType t = (FType)it.next();
			result.getFType().add(getBoundType(t));
		}
		return result;
	}

	
	public Object visit(FTypeVariable arg0) {
		return TypeVariableUtility.getLeastDerivedAdmissibleType(arg0);
	}
	
	/**
	 * Constructor 
	 */
	public TypeVariableLeastDerivedEnforcer() {
		super();
		struct_factory = StructurePackageImpl.init().getStructureFactory();
	}

}
