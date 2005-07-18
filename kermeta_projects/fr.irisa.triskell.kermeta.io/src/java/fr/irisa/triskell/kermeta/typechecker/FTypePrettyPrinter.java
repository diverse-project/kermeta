/* $Id: FTypePrettyPrinter.java,v 1.4 2005-07-18 16:59:53 zdrey Exp $
* Project : Kermeta (First iteration)
* File : FTypePrettyPrinter.java
* License : GPL
* Copyright : IRISA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 19 avr. 2005
* Author : Franck Fleurey
*/ 

package fr.irisa.triskell.kermeta.typechecker;

import fr.irisa.triskell.kermeta.structure.FClass;
import fr.irisa.triskell.kermeta.structure.FEnumeration;
import fr.irisa.triskell.kermeta.structure.FFunctionType;
import fr.irisa.triskell.kermeta.structure.FPrimitiveType;
import fr.irisa.triskell.kermeta.structure.FProductType;
import fr.irisa.triskell.kermeta.structure.FType;
import fr.irisa.triskell.kermeta.structure.FTypeVariable;
import fr.irisa.triskell.kermeta.structure.FTypeVariableBinding;
import fr.irisa.triskell.kermeta.structure.FVoidType;
import fr.irisa.triskell.kermeta.utils.KMTHelper;
import fr.irisa.triskell.kermeta.visitor.KermetaVisitor;

/**
 * @author Franck Fleurey
 * IRISA / University of rennes 1
 * Distributed under the terms of the GPL license
 */
public class FTypePrettyPrinter extends KermetaVisitor {
    
    
    protected static FTypePrettyPrinter instance = null;
    
    public static FTypePrettyPrinter getInstance() {
        if (instance == null) {
            instance = new FTypePrettyPrinter();
        }
        return instance;
    }
    

    public Object visit(FClass arg0) {
        //String result = arg0.getFClassDefinition().getFName();
        String result = KMTHelper.getQualifiedName(arg0.getFClassDefinition());
        if (arg0.getFTypeParamBinding().size() > 0) {
            result += "<";
	        for(int i=0; i<arg0.getFTypeParamBinding().size(); i++) {
		        result += this.accept(((FTypeVariableBinding)arg0.getFTypeParamBinding().get(i)).getFType());
		        if (i != arg0.getFTypeParamBinding().size()-1) result += ", ";
			}
	        result += ">";
        }
        return result;
	}
	
	public Object visit(FEnumeration arg0) {
	    return arg0.getFName();
	}
	
	public Object visit(FPrimitiveType arg0) {
		return arg0.getFName();
	}
	
	public Object visit(FProductType arg0) {
		String result = "[";
	    for(int i=0; i<arg0.getFType().size(); i++) {
	        result += this.accept((FType)arg0.getFType().get(i));
	        if (i != arg0.getFType().size()-1) result += ", ";
		}
	    result += "]";
	    return result;
	}
	
	
	public Object visit(FTypeVariable arg0) {
		String result = arg0.getFName();
		if (arg0.getFSupertype() != null) {
		    result += " : " + this.accept(arg0.getFSupertype());
		}
		return result;
	}
	
	public Object visit(FVoidType arg0) {
	    return "Void";
	}
	
	

    public Object visit(FFunctionType node) {
        return "< " + this.accept(node.getFLeft()) + " -> " + this.accept(node.getFRight()) + " >";
    }
}
