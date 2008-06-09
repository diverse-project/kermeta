

/*$Id: TextHoverLabelProvider.java,v 1.2 2008-06-09 10:02:00 ftanguy Exp $
* Project : fr.irisa.triskell.kermeta.texteditor
* File : 	TextHoverLabelProvider.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 4 juin 08
* Authors : paco
*/

package org.kermeta.texteditor;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.kermeta.io.printer.KM2KMTPrettyPrinter;
import org.kermeta.model.KermetaModelHelper;

import fr.irisa.triskell.kermeta.language.behavior.CallFeature;
import fr.irisa.triskell.kermeta.language.behavior.CallVariable;
import fr.irisa.triskell.kermeta.language.behavior.Expression;
import fr.irisa.triskell.kermeta.language.behavior.TypeLiteral;
import fr.irisa.triskell.kermeta.language.behavior.TypeReference;
import fr.irisa.triskell.kermeta.language.structure.Class;
import fr.irisa.triskell.kermeta.language.structure.Tag;
import fr.irisa.triskell.kermeta.language.structure.TypeDefinition;
import fr.irisa.triskell.kermeta.visitor.KermetaOptimizedVisitor;

public class TextHoverLabelProvider extends KermetaOptimizedVisitor {

    private KM2KMTPrettyPrinter pp = new KM2KMTPrettyPrinter();
	
	private String prettyprintTags(EList<Tag> tags) {
		String temp = "";
		for ( Tag t : tags )
			temp += t.getValue();
		temp = temp.replace("/**", "");
		temp = temp.replace("*/", "");
		temp = temp.replace("*", "");
		
		String result = "";
		String[] strings = temp.split("\n");
		for ( String s : strings )
			result += s.trim() + "\n";
		
		return result;		
	}
	
	@Override
	public Object visitTypeLiteral(TypeLiteral node) {
		return accept( node.getTyperef() );
	}
	
	@Override
	public Object visitTypeReference(TypeReference node) {
		String type = (String) pp.accept( node.getType() );
		TypeDefinition td = null;
		if ( node.getType() instanceof TypeDefinition )
			td = (TypeDefinition) node.getType();
		else if ( node.getType() instanceof Class )
			td = ((Class) node.getType()).getTypeDefinition();
		if ( td != null ) {
			String tags = prettyprintTags( td.getOwnedTags() );
			return type + "\n" + tags;
		}
		return null;
	}
	
	@Override
	public Object visitCallFeature(CallFeature node) {
		if ( node.getStaticOperation() != null ) {
			String tags = prettyprintTags( node.getStaticOperation().getOwnedTags() );
			return KermetaModelHelper.NamedElement.qualifiedName( node.getStaticOperation() ) + "\n" + tags;
		} else if ( node.getStaticProperty() != null ) {
			String type = (String) pp.accept( node.getStaticProperty().getType() );
			String tags = prettyprintTags( node.getStaticProperty().getOwnedTags() );
			return KermetaModelHelper.NamedElement.qualifiedName( node.getStaticProperty() ) + " : " + type +  "\n" + tags;
		} else if ( node.getStaticEnumLiteral() != null ) {
			String tags = prettyprintTags( node.getStaticEnumLiteral().getOwnedTags() );
			return KermetaModelHelper.NamedElement.qualifiedName( node.getStaticEnumLiteral() ) + "\n" + tags;
		}
		return super.visitCallFeature(node);
	}
	
	@Override
	public Object visitCallVariable(CallVariable node) {
		return pp.accept( node.getStaticType() );
	}
	
	@Override
	public Object genericVisitChildren(EObject node) {
		if ( node instanceof Expression ) {
			Expression e = (Expression) node;
			String type = (String) pp.accept( e.getStaticType() );
			return type;
		}
		return null;
	}
	
}


