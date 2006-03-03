/* $Id: LabelPrettyPrinter.java,v 1.2 2006-03-03 15:24:04 dvojtise Exp $
 * Project : fr.irisa.triskell.kermeta.touchnavigator
 * File : LabelPrettyPrinter.java
 * License : EPL
 * Copyright : IRISA / INRIA/ Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : 11 nov. 2005
 * Authors : 
 *     	dvojtise <dvojtise@irisa.fr>
 */
package fr.irisa.triskell.kermeta.touchnavigator.graphlayout;

import fr.irisa.triskell.kermeta.language.behavior.*;
import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.touchnavigator.TouchNavigatorPlugin;
import fr.irisa.triskell.kermeta.utils.KMTHelper;
import fr.irisa.triskell.kermeta.visitor.KermetaOptimizedVisitor;

public class LabelPrettyPrinter extends KermetaOptimizedVisitor{

	public Object visitClass(fr.irisa.triskell.kermeta.language.structure.Class node) {
		String qname = KMTHelper.getQualifiedName(node.getTypeDefinition());
		/*String name = KMTHelper.getMangledIdentifier(node.getFClassDefinition().getFName());
		String result = ppTypeName(qname, name);
		if (node.getFTypeParamBinding().size() > 0) {
			result += "<" + ppComaSeparatedNodes(node.getFTypeParamBinding()) + ">";
		}*/
		TouchNavigatorPlugin.internalLog.debug("visitClass : "+qname);
		return qname;
	}
	public Object visitClassDefinition(ClassDefinition node) {
		String qname = KMTHelper.getQualifiedName(node);
		return qname;
	}
	public Object visitCallFeature(CallFeature node) {
		if (node.getStaticOperation() != null)
	    {
			TouchNavigatorPlugin.internalLog.debug("node.getFStaticOperation() : "+node.getStaticOperation());
			return accept(node.getStaticOperation().getType());
	    }
		else if (node.getStaticProperty() != null)
	    {
			TouchNavigatorPlugin.internalLog.debug("node.getFStaticProperty().getFType() : "+node.getStaticProperty().getType());
			return this.accept(node.getStaticProperty().getType());
	    }
		return null;
	}
}
