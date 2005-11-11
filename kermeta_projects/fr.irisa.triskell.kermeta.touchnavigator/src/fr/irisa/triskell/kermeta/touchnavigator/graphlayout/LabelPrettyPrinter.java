/* $Id: LabelPrettyPrinter.java,v 1.1 2005-11-11 07:10:04 dvojtise Exp $
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

import fr.irisa.triskell.kermeta.behavior.*;
import fr.irisa.triskell.kermeta.structure.*;
import fr.irisa.triskell.kermeta.touchnavigator.TouchNavigatorPlugin;
import fr.irisa.triskell.kermeta.utils.KMTHelper;
import fr.irisa.triskell.kermeta.visitor.KermetaOptimizedVisitor;

public class LabelPrettyPrinter extends KermetaOptimizedVisitor{

	public Object visitFClass(FClass node) {
		String qname = KMTHelper.getQualifiedName(node.getFClassDefinition());
		/*String name = KMTHelper.getMangledIdentifier(node.getFClassDefinition().getFName());
		String result = ppTypeName(qname, name);
		if (node.getFTypeParamBinding().size() > 0) {
			result += "<" + ppComaSeparatedNodes(node.getFTypeParamBinding()) + ">";
		}*/
		TouchNavigatorPlugin.internalLog.debug("visitFClass : "+qname);
		return qname;
	}
	public Object visitFClassDefinition(FClassDefinition node) {
		String qname = KMTHelper.getQualifiedName(node);
		return qname;
	}
	public Object visitFCallFeature(FCallFeature node) {
		if (node.getFStaticOperation() != null)
	    {
			TouchNavigatorPlugin.internalLog.debug("node.getFStaticOperation() : "+node.getFStaticOperation());
			return accept(node.getFStaticOperation().getFType());
	    }
		else if (node.getFStaticProperty() != null)
	    {
			TouchNavigatorPlugin.internalLog.debug("node.getFStaticProperty().getFType() : "+node.getFStaticProperty().getFType());
			return this.accept(node.getFStaticProperty().getFType());
	    }
		return null;
	}
}
