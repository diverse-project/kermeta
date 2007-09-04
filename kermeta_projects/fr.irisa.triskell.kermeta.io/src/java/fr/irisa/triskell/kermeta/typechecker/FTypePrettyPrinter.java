/* $Id: FTypePrettyPrinter.java,v 1.12 2007-09-04 08:29:31 ftanguy Exp $
* Project : Kermeta io
* File : FTypePrettyPrinter.java
* License : EPL
* Copyright : IRISA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 19 avr. 2005
* Author : Franck Fleurey
*/ 

package fr.irisa.triskell.kermeta.typechecker;

//import fr.irisa.triskell.kermeta.language.structure.FClass;

import fr.irisa.triskell.kermeta.language.structure.Enumeration;
import fr.irisa.triskell.kermeta.language.structure.FunctionType;
import fr.irisa.triskell.kermeta.language.structure.ModelType;
import fr.irisa.triskell.kermeta.language.structure.ModelTypeVariable;
import fr.irisa.triskell.kermeta.language.structure.ObjectTypeVariable;
import fr.irisa.triskell.kermeta.language.structure.PrimitiveType;
import fr.irisa.triskell.kermeta.language.structure.ProductType;
import fr.irisa.triskell.kermeta.language.structure.TypeVariableBinding;
import fr.irisa.triskell.kermeta.language.structure.VirtualType;
import fr.irisa.triskell.kermeta.language.structure.VoidType;
import fr.irisa.triskell.kermeta.modelhelper.NamedElementHelper;
import fr.irisa.triskell.kermeta.visitor.KermetaOptimizedVisitor;

/**
 * @author Franck Fleurey
 */
public class FTypePrettyPrinter extends KermetaOptimizedVisitor {
    
    
    protected static FTypePrettyPrinter instance = null;
    
    public static FTypePrettyPrinter getInstance() {
        if (instance == null) {
            instance = new FTypePrettyPrinter();
        }
        return instance;
    }
    

    //public Object visit(FClass arg0) {
    public Object visitClass(fr.irisa.triskell.kermeta.language.structure.Class arg0) {
        //String result = arg0.getFClassDefinition().getFName();
        String result = NamedElementHelper.getMangledQualifiedName(arg0.getTypeDefinition());
        if (arg0.getTypeParamBinding().size() > 0) {
            result += "<";
	        for(int i=0; i<arg0.getTypeParamBinding().size(); i++) {
		        result += this.accept(((TypeVariableBinding)arg0.getTypeParamBinding().get(i)).getType());
		        if (i != arg0.getTypeParamBinding().size()-1) result += ", ";
			}
	        result += ">";
        }
        return result;
	}
	
	//public Object visit(Enumeration arg0) {
    public Object visitEnumeration(Enumeration arg0) {
	    return arg0.getName();
	}
	
	//public Object visit(PrimitiveType arg0) {
    public Object visitPrimitiveType(PrimitiveType arg0) {
		return arg0.getName();
	}
	
	//public Object visit(ProductType arg0) {
    public Object visitProductType(ProductType arg0) {
		String result = "[";
	    for(int i=0; i<arg0.getType().size(); i++) {
	        result += this.accept((fr.irisa.triskell.kermeta.language.structure.Type)arg0.getType().get(i));
	        if (i != arg0.getType().size()-1) result += ", ";
		}
	    result += "]";
	    return result;
	}
	
	
    //public Object visit(ObjectTypeVariable arg0) {
    public Object visitObjectTypeVariable(ObjectTypeVariable arg0) {
		String result = arg0.getName();
		if (arg0.getSupertype() != null) {
		    result += " : " + this.accept(arg0.getSupertype());
		}
		return result;
	}
	
    public Object visitModelTypeVariable(ModelTypeVariable arg0) {
    	String result = arg0.getName();
    	result += " : " + this.accept(arg0.getSupertype());
    	return result;
    }
    
    public Object visitModelType(ModelType arg0) {
        String result = NamedElementHelper.getMangledQualifiedName(arg0);
//        if (arg0.getTypeParamBinding().size() > 0) {
//            result += "<";
//	        for(int i=0; i<arg0.getTypeParamBinding().size(); i++) {
//		        result += this.accept(((TypeVariableBinding)arg0.getTypeParamBinding().get(i)).getType());
//		        if (i != arg0.getTypeParamBinding().size()-1) result += ", ";
//			}
//	        result += ">";
//        }
        return result;
    }
    
    public Object visitVirtualType(VirtualType arg0) {
    	String result = ((ModelTypeVariable) arg0.getModelType()).getName() + "::" + arg0.getName();
    	result += " [virtual of " + NamedElementHelper.getMangledQualifiedName(arg0.getClassDefinition());
    	if (!arg0.getTypeParamBinding().isEmpty()) {
    		result += "<";
	        for(int i=0; i<arg0.getTypeParamBinding().size(); i++) {
		        result += this.accept(((TypeVariableBinding)arg0.getTypeParamBinding().get(i)).getType());
		        if (i != arg0.getTypeParamBinding().size()-1) result += ", ";
			}
	        result += ">";
    	}
    	result += "]";
    	return result;
    }
    
	//public Object visit(VoidType arg0) {
    public Object visitVoidType(VoidType arg0) {
	    return "Void";
	}
	
	

    //public Object visit(FunctionType node) {
    public Object visitFunctionType(FunctionType node) {
    	if ( node.getLeft() == null || node.getRight() == null )
    		System.out.println();
        return "< " + this.accept(node.getLeft()) + " -> " + this.accept(node.getRight()) + " >";
    }
}
