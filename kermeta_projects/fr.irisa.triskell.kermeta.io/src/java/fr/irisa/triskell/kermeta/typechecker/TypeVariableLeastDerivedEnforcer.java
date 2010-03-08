/* $Id: TypeVariableLeastDerivedEnforcer.java,v 1.10 2008-04-28 11:50:10 ftanguy Exp $
* Project : Kermeta io
* File : GenericTypeSubstitution.java
* License : EPL
* Copyright : IRISA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 12 avr. 2005
* Authors : 
* 		Franck Fleurey
* 		Jim Steel
* Description :
* Transforms a fr.irisa.triskell.kermeta.language.structure.Type that contains type variables into an 
* actual Ftype by replacing type variables by their least derived
* admissible type
*/ 
package fr.irisa.triskell.kermeta.typechecker;

import java.util.Iterator;

//import fr.irisa.triskell.kermeta.language.structure.FClass;
import fr.irisa.triskell.kermeta.language.structure.Enumeration;
import fr.irisa.triskell.kermeta.language.structure.FunctionType;
import fr.irisa.triskell.kermeta.language.structure.PrimitiveType;
import fr.irisa.triskell.kermeta.language.structure.ProductType;
//import fr.irisa.triskell.kermeta.language.structure.FType;
import fr.irisa.triskell.kermeta.language.structure.ObjectTypeVariable;
import fr.irisa.triskell.kermeta.language.structure.TypeVariableBinding;
import fr.irisa.triskell.kermeta.language.structure.StructureFactory;
import fr.irisa.triskell.kermeta.language.structure.impl.StructurePackageImpl;
import fr.irisa.triskell.kermeta.visitor.KermetaOptimizedVisitor;

/*** 
 * ransforms a fr.irisa.triskell.kermeta.language.structure.Type that contains type variables into an 
 * actual Ftype by replacing type variables by their least derived
 * admissible type
 */
public class TypeVariableLeastDerivedEnforcer extends KermetaOptimizedVisitor {
	
	protected fr.irisa.triskell.kermeta.language.structure.Type getBoundType(fr.irisa.triskell.kermeta.language.structure.Type generic) {
		TypeVariableLeastDerivedEnforcer visitor = new TypeVariableLeastDerivedEnforcer(typecheckercontext);
		return (fr.irisa.triskell.kermeta.language.structure.Type) visitor.accept(generic);
	}
	
	protected StructureFactory struct_factory;   
	protected TypeCheckerContext typecheckercontext;
	protected TypeVariableUtility typeVariableUtility;

	
	/**
	 * Create a copy of the function type by resolving types
	 */
	public Object visitFunctionType(FunctionType arg0) {
		FunctionType result = struct_factory.createFunctionType();
		result.setLeft(getBoundType(arg0.getLeft()));
		result.setRight(getBoundType(arg0.getRight()));
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
			Iterator<TypeVariableBinding> it = arg0.getTypeParamBinding().iterator();
			while(it.hasNext()) {
				TypeVariableBinding provided = it.next();
				TypeVariableBinding bind = struct_factory.createTypeVariableBinding();
				bind.setVariable(provided.getVariable());
				bind.setType(getBoundType(provided.getType()));
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
		Iterator<fr.irisa.triskell.kermeta.language.structure.Type> it = arg0.getType().iterator();
		while(it.hasNext()) {
			fr.irisa.triskell.kermeta.language.structure.Type t = it.next();
			result.getType().add(getBoundType(t));
		}
		return result;
	}

	
	public Object visitObjectTypeVariable(ObjectTypeVariable arg0) {
		return typeVariableUtility.getLeastDerivedAdmissibleType(arg0);
	}
	
	/**
	 * Constructor 
	 */
	public TypeVariableLeastDerivedEnforcer(TypeCheckerContext typecheckercontext) {
		super();
		struct_factory = StructurePackageImpl.init().getStructureFactory();
		this.typecheckercontext = typecheckercontext;
		this.typeVariableUtility = new TypeVariableUtility(typecheckercontext);
	}

}
