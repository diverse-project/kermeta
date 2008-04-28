

/*$Id: ReturnTypeChecker.java,v 1.3 2008-04-28 11:50:11 ftanguy Exp $
* Project : fr.irisa.triskell.kermeta.io
* File : 	ReturnTypeChecker.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 14 sept. 07
* Authors : paco
*/

package fr.irisa.triskell.kermeta.constraintchecker;

import fr.irisa.triskell.kermeta.language.behavior.Assignment;
import fr.irisa.triskell.kermeta.language.behavior.Raise;
import fr.irisa.triskell.kermeta.language.structure.Class;
import fr.irisa.triskell.kermeta.language.structure.Operation;
import fr.irisa.triskell.kermeta.language.structure.VoidType;
import fr.irisa.triskell.kermeta.modelhelper.NamedElementHelper;
import fr.irisa.triskell.kermeta.visitor.KermetaOptimizedVisitor;

public class ReturnTypeChecker extends KermetaOptimizedVisitor {
	
	private boolean reportError = true;
	
    public static boolean typeCheckExpression(Operation operation) {
    	ReturnTypeChecker visitor = new ReturnTypeChecker();
     	
    	boolean returnsType = ! operation.isIsAbstract() && (operation.getType() != null) && !(operation.getType() instanceof VoidType);
    	
    	if ( returnsType && operation.getType() instanceof Class )
    		if ( NamedElementHelper.getQualifiedName( ((Class) operation.getType()).getTypeDefinition() ).equals("kermeta::standard::Void") )
    			returnsType = false;
    	
    	visitor.accept( operation );
    	
    	if ( returnsType )
    		return ! visitor.reportError;
    	else
    		return true;
   }
        
	
	@Override
	public Object visitAssignment(Assignment node) {
		
		if ( node.getTarget().getName().equals("result") )
			reportError = false;
		
		return super.visitAssignment(node);
	}
	
	@Override
	public Object visitRaise(Raise node) {
		reportError = false;
		return super.visitRaise(node);
	}
}


