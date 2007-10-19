/* $Id: KermetaASTHelper.java,v 1.4 2007-10-19 16:23:25 cfaucher Exp $
 * Project   : Kermeta 
 * File      : KermetaASTHelper.java
 * License   : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : 31 janv. 07
 * Authors       : dvojtise <dvojtise.irisa.fr>
 */
package fr.irisa.triskell.kermeta.ast.helper;


import com.ibm.eclipse.ldt.core.ast.ASTNode;

import fr.irisa.triskell.kermeta.ast.AnnotableClassMemberDecl;
import fr.irisa.triskell.kermeta.ast.AnnotableElement;
import fr.irisa.triskell.kermeta.ast.Annotation;
import fr.irisa.triskell.kermeta.ast.Annotations;
import fr.irisa.triskell.kermeta.ast.ClassDecl;
import fr.irisa.triskell.kermeta.ast.OperationExpressionBody;
import fr.irisa.triskell.kermeta.ast.PackageDecl;
import fr.irisa.triskell.kermeta.ast.Tag;
import fr.irisa.triskell.kermeta.ast.TopLevelDecl;

/**
 * This Class provides various helper method to be used on Kermeta AST
 * @author dvojtise
 *
 */
public class KermetaASTHelper {
	
	public static final String TAGNAME_OVERLOADABLE = "overloadable";

	public static final String TAGNAME_ASPECT = "aspect";
	
	public static final String TAGNAME_URI = "uri";
	
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

	public static boolean isOverloadable(OperationExpressionBody node) {
		ASTNode ast = node.getParent().getParent();
		if(ast instanceof AnnotableClassMemberDecl)
		{
			AnnotableClassMemberDecl parent = (AnnotableClassMemberDecl)ast;
			return isTagPresent(parent.getAnnotations(), TAGNAME_OVERLOADABLE,"true");
		}
		return false;
	}
	
	public static String getURI(PackageDecl node) {
		return getTagContent(node.getAnnotations(), TAGNAME_URI);
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
	
	private static String getTagContent(Annotations annLst, String searchedTagName){		
		if (annLst!=null && annLst.hasChildren())
	    {
	    	for (int i=0; i<annLst.getChildCount();i++)
	    	{
	    		Annotation a = (Annotation)annLst.getChild(i);
	    		if (a instanceof Tag) {
	    			String tagName = ((Tag)a).getName().getFirstToken().getText();
    				String str = ((Tag)a).getVal().getText();
    				String tagValue = str.substring(1, str.length()-1);
	    			if (tagName.equals(searchedTagName)){
	    				return tagValue;
	    			}
	    		}
	    	}
	    }
		return null;
	}
}
