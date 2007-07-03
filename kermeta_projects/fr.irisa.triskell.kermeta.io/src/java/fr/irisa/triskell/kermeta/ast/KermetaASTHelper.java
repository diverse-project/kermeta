/* $Id: KermetaASTHelper.java,v 1.3 2007-07-03 11:44:38 dvojtise Exp $
 * Project   : Kermeta 
 * File      : KermetaASTHelper.java
 * License   : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : 31 janv. 07
 * Authors       : dvojtise <dvojtise.irisa.fr>
 */
package fr.irisa.triskell.kermeta.ast;

import com.ibm.eclipse.ldt.core.ast.ASTNode;

import fr.irisa.triskell.kermeta.loader.KermetaUnit;

/**
 * This Class provides various helper method to be used on Kermeta AST
 * @author dvojtise
 *
 */
public class KermetaASTHelper {
	
	public static final String TAGNAME_OVERLOADABLE = "overloadable";

	public static final String TAGNAME_ASPECT = "aspect";
	
	/**
	 * Does this node declares to be an aspect ?
	 * ie. is there an annotation @aspect "true" set for this node ?
	 * @param node
	 * @return
	 */
	public static boolean isAnAspect(ClassDecl node){
		if(node.getParent() instanceof TopLevelDecl)
		{
			return isTagPresent(((TopLevelDecl)node.getParent()).getAnnotations(), TAGNAME_ASPECT,"true");
		}
		return false;
	}
	public static boolean isAnAspect(DataTypeDecl node){
		if(node.getParent() instanceof TopLevelDecl)
		{
			return isTagPresent(((TopLevelDecl)node.getParent()).getAnnotations(), TAGNAME_ASPECT,"true");
		}
		return false;
	}

	public static boolean isOverloadable(OperationExpressionBody node) {
		Operation op = (Operation)node.getParent();
		ASTNode ast = node.getParent().getParent();
		if(node.getParent().getParent() instanceof AnnotableClassMemberDecl)
		{
			AnnotableClassMemberDecl parent = (AnnotableClassMemberDecl)node.getParent().getParent();
			return isTagPresent(parent.getAnnotations(), TAGNAME_OVERLOADABLE,"true");
		}
		return false;
	}
	
	private static boolean isTagPresent(Annotations annLst, String searchedTagName, String searchedTagValue){		
		if (annLst!=null && annLst.hasChildren())
	    {
	    	for (int i=0; i<annLst.getChildCount();i++)
	    	{
	    		Annotation a = (Annotation)annLst.getChild(i);
	    		if (a instanceof Tag) {
	    			String tagName = ((Tag)a).getName().getFirstToken().getText();
    				String str = ((Tag)a).getVal().getText();
    				String tagValue = str.substring(1, str.length()-1);
	    			if (tagName.equals(searchedTagName) && tagValue.equals(searchedTagValue)){
	    				return true;
	    			}
	    		}
	    	}
	    }
		return false;
	}
}
