/* $Id: TypeContainementFixer.java,v 1.2 2005-07-19 10:27:09 zdrey Exp $
 * Project : Kermeta (First iteration)
 * File : KermetaUnit.java
 * License : EPL
 * Copyright : IRISA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Feb 23, 2005
 * Author : Franck Fleurey <ffleurey@irisa.fr>
 * 
 */
package fr.irisa.triskell.kermeta.loader;

import java.util.Iterator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;

import fr.irisa.triskell.kermeta.behavior.FTypeReference;
import fr.irisa.triskell.kermeta.structure.FClass;
import fr.irisa.triskell.kermeta.structure.FClassDefinition;
import fr.irisa.triskell.kermeta.structure.FFunctionType;
import fr.irisa.triskell.kermeta.structure.FObject;
import fr.irisa.triskell.kermeta.structure.FOperation;
import fr.irisa.triskell.kermeta.structure.FParameter;
import fr.irisa.triskell.kermeta.structure.FPrimitiveType;
import fr.irisa.triskell.kermeta.structure.FProductType;
import fr.irisa.triskell.kermeta.structure.FProperty;
import fr.irisa.triskell.kermeta.structure.FType;
import fr.irisa.triskell.kermeta.structure.FTypeContainer;
import fr.irisa.triskell.kermeta.structure.FTypeVariable;
import fr.irisa.triskell.kermeta.structure.FTypeVariableBinding;
import fr.irisa.triskell.kermeta.visitor.KermetaVisitor;


/**
 * Visitor that adds a FTypeContainer to all the types of the visited kermeta 
 * model.
 */
public class TypeContainementFixer extends KermetaVisitor {

	
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#genericVisitChildren(org.eclipse.emf.ecore.EObject)
	 */
	public Object genericVisitChildren(EObject node) {
		// No browsering
		return null;
	}
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.structure.FClassDefinition)
	 */
	public Object visit(FClassDefinition node) {
		// if super types should be contained by the clessdef
		addContainedTypes(node.getFSuperType(), node);
		addContainedTypes(node.getFTypeParameter(), node);
		return null;
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.structure.FFunctionType)
	 */
	public Object visit(FFunctionType node) {
		addContainedTypes(node.getFLeft(), node);
		addContainedTypes(node.getFRight(), node);
		return null;
	}
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.structure.FOperation)
	 */
	public Object visit(FOperation node) {
		addContainedTypes(node.getFType(), node);
		addContainedTypes(node.getFTypeParameter(), node);
		// RaisedException is also an EList of FTypes.
		addContainedTypes(node.getFRaisedException(), node);
		return null;
	}
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.structure.FParameter)
	 */
	public Object visit(FParameter node) {
		addContainedTypes(node.getFType(), node);
		return null;
	}
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.structure.FProductType)
	 */
	public Object visit(FProductType node) {
		addContainedTypes(node.getFType(), node);
		return null;
	}
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.structure.FProperty)
	 */
	public Object visit(FProperty node) {
		addContainedTypes(node.getFType(), node);
		return super.visit(node);
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.behavior.FTypeReference)
	 */
	public Object visit(FTypeReference node) {
		addContainedTypes(node.getFType(), node);
		return null;
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.structure.FTypeVariable)
	 */
	public Object visit(FTypeVariable node) {
		addContainedTypes(node.getFSupertype(), node);
		return null;
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.structure.FTypeVariableBinding)
	 */
	public Object visit(FTypeVariableBinding node) {
		addContainedTypes(node.getFType(), node);
		return super.visit(node);
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.structure.FPrimitiveType)
	 */
	public Object visit(FPrimitiveType node) {
		addContainedTypes(node.getFInstanceType(), node);
		return super.visit(node);
	}
	
	protected void addContainedTypes(EList types, FTypeContainer container) {
		Iterator it = types.iterator();
		while(it.hasNext()) {
			addContainedTypes((FType)it.next(), container);
		}
	}
	
	
	
	
	protected void addContainedTypes(FType t, FTypeContainer container) {
		if (t != null && t.eContainer() == null) {
			container.getFContainedType().add(t);
			// apply recussivly...
			if (t instanceof FTypeContainer) this.accept(t);
			TreeIterator it = t.eAllContents();
			while(it.hasNext()) {
				FObject o = (FObject)it.next();
				if (o instanceof FTypeContainer) {
					if (o != null) this.accept(o);
				}
			}
			
		}
	}
	
	
}
