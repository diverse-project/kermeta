/* $Id: KermetaASTHelper.java,v 1.7 2008-04-28 11:50:25 ftanguy Exp $
 * Project   : Kermeta 
 * File      : KermetaASTHelper.java
 * License   : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : 31 janv. 07
 * Authors       : dvojtise <dvojtise.irisa.fr>
 */
package fr.irisa.triskell.kermeta.ast.helper;

import org.eclipse.gymnast.runtime.core.ast.ASTNode;

import fr.irisa.triskell.kermeta.parser.gen.ast.Annotation;
import fr.irisa.triskell.kermeta.parser.gen.ast.Annotations;
import fr.irisa.triskell.kermeta.parser.gen.ast.ClassDecl;
import fr.irisa.triskell.kermeta.parser.gen.ast.CollectionType;
import fr.irisa.triskell.kermeta.parser.gen.ast.KermetaTokenNode;
import fr.irisa.triskell.kermeta.parser.gen.ast.KwOrNamedQualifiedID;
import fr.irisa.triskell.kermeta.parser.gen.ast.Multiplicity;
import fr.irisa.triskell.kermeta.parser.gen.ast.MultiplicityExpr;
import fr.irisa.triskell.kermeta.parser.gen.ast.QualifiedID;
import fr.irisa.triskell.kermeta.parser.gen.ast.Tag;
import fr.irisa.triskell.kermeta.parser.gen.ast.TopLevelDecl;
import fr.irisa.triskell.kermeta.parser.gen.ast.TypeRef;

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
		if(node.getAspectModifier() != null) 
			return true;
		
		if(node.getParent() instanceof TopLevelDecl)
		{
			return isTagPresent(((TopLevelDecl)node.getParent()).getAnnotations(), TAGNAME_ASPECT,"true");
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
		
	/**
	 * Returns a String corresponding to the AST node of type QualifiedID, as a list
	 * of terms separated by a "::" ("this::is::an::id"=> qualified id of "id").
	 * @param node the AST representation of a Qualified ID
	 * @return a String corresponding to the QualifiedID node.
	 */
	static public String qualifiedIDAsString(QualifiedID node) {
		StringBuffer result = new StringBuffer();
		ASTNode[] ids = node.getChildren();
		for(int i=0; i<ids.length; i++) {
			if (ids[i].getTypeName().equals("QidSeparator")) continue;
			result.append(getTextForID((KermetaTokenNode)ids[i]));
			if (i != ids.length-1) result.append("::");
		}
		return result.toString();
	}
	
	static public String getTextForID(KermetaTokenNode node) {
		String result = node.getText();
		if (result.startsWith("~")) result = result.substring(1);
		return result;
	}
	
	/**
	 * Returns the upper bound of the multiplicity for a type reference.
	 * @param ref
	 * @return the upper bound of a typeref
	 */
	static public int getUpper(TypeRef ref) {
		Multiplicity mul = ref.getMultiplicity();
		if (mul == null) return 1;
		MultiplicityExpr mexp = mul.getMultiplicityExpr();
		if (mexp.getLowerBound() == null) return -1;
		if (mexp.getUpperBound() == null) {
			if (mexp.getLowerBound().getText().equals("?")) return 1;
			if (mexp.getLowerBound().getText().equals("*")) return -1;
			if (mexp.getLowerBound().getText().equals("+")) return -1;
			// mexp.getLowerBound().getText() is an int_literal
			int lower = Integer.parseInt(mexp.getLowerBound().getText());
			return lower;
		}
		else {
			if (mexp.getUpperBound().getText().equals("?")) return -2; // Unspecified...
			if (mexp.getUpperBound().getText().equals("*")) return -1;
			if (mexp.getUpperBound().getText().equals("+")) return -1; // ???
			// mexp.getUpperBound().getText() is an int_literal
			int upper = Integer.parseInt(mexp.getUpperBound().getText());
			return upper;
		}
	}
	
	/**
	 * Returns the lower bound of the multiplicity for a type reference.
	 * @param ref
	 * @return the lower bound of a typeref
	 */
	static public int getLower(TypeRef ref) {
		Multiplicity mul = ref.getMultiplicity();
		if (mul == null) return 0;
		MultiplicityExpr mexp = mul.getMultiplicityExpr();
		if (mexp.getLowerBound() == null) return 0;
		if (mexp.getLowerBound().getText().equals("?")) return 0;
		if (mexp.getLowerBound().getText().equals("*")) return 0;
		if (mexp.getLowerBound().getText().equals("+")) return 1;
		// mexp.getLowerBound().getText() is an int_literal
		int lower = Integer.parseInt(mexp.getLowerBound().getText());
		return lower;
	}
	
	/**
	 * Returns true if type reference is unique (multiplicity is 1), false
	 * otherwise.
	 * @param ref
	 * @return true if <code>ref</code> is unique (multiplicity is 1), false
	 * otherwise
	 */
	static public boolean isUnique(TypeRef ref) {
		CollectionType t = ref.getCollectionType();
		if (t==null) return true; // by default it is an ordered set
		else return t.getText().equals("oset") || t.getText().equals("set");
	}
	
	/**
	 * Returns true if ref is ordered (specified as "{isOrdered}"), false otherwise.
	 * @param ref
	 * @return true if ref is ordered, false otherwise
	 */
	static public boolean isOrdered(TypeRef ref) {
		CollectionType t = ref.getCollectionType();
		if (t==null) return true; // by default it is an ordered set
		else return t.getText().equals("oset") || t.getText().equals("seq");
	}
	
	/**
	 * Returns a String corresponding to the AST node of type QualifiedID, as a list
	 * of terms separated by a "::" ("this::is::an::id"=> qualified id of "id").
	 * @param node the AST representation of a Qualified ID
	 * @return a String corresponding to the QualifiedID node.
	 */
	static public String unprotectedIDAsString(KwOrNamedQualifiedID node) {
		StringBuffer result = new StringBuffer();
		ASTNode[] ids = node.getChildren();
		for(int i=0; i<ids.length; i++) {
			if (ids[i].getTypeName().equals("QidSeparator")) continue;
			if(ids[i] instanceof QualifiedID){ 
				result.append(qualifiedIDAsString((QualifiedID)ids[i]));
			}
			else{
				result.append(getTextForID((KermetaTokenNode)ids[i]));
				if (i != ids.length-1) result.append("::");
			}
		}
		return result.toString();
	}
}
