/* $Id: KermetaASTHelper.java,v 1.1 2007-02-08 14:41:15 dvojtise Exp $
 * Project   : Kermeta 
 * File      : KermetaASTHelper.java
 * License   : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : 31 janv. 07
 * Authors       : dvojtise <dvojtise.irisa.fr>
 */
package fr.irisa.triskell.kermeta.ast;

import fr.irisa.triskell.kermeta.loader.KermetaUnit;

/**
 * This Class provides various helper method to be used on Kermeta AST
 * @author dvojtise
 *
 */
public class KermetaASTHelper {
	/**
	 * Does this node declares to be an aspect ?
	 * ie. is there an annotation @aspect "true" set for this node ?
	 * @param node
	 * @return
	 */
	public static boolean isAnAspect(ClassDecl node){
		if(node.getParent() instanceof TopLevelDecl)
		{
			TopLevelDecl topLevelDecl = (TopLevelDecl)node.getParent();
			Annotations annLst = topLevelDecl.getAnnotations();
			if (annLst!=null && annLst.hasChildren())
		    {
		    	for (int i=0; i<annLst.getChildCount();i++)
		    	{
		    		Annotation a = (Annotation)annLst.getChild(i);
		    		if (a instanceof Tag) {
		    			String tagName = ((Tag)a).getName().getFirstToken().getText();
	    				String str = ((Tag)a).getVal().getText();
	    				String tagValue = str.substring(1, str.length()-1);
		    			if (tagName.equals("aspect") && tagValue.equals("true")){
		    				return true;
		    			}
		    		}
		    	}
		    }
		}
		return false;
	}
}
