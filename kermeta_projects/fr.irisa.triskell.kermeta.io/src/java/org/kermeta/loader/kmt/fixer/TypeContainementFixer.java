/* $Id: TypeContainementFixer.java,v 1.3 2008-04-28 11:50:20 ftanguy Exp $
 * Project : Kermeta (First iteration)
 * File : KermetaUnit.java
 * License : EPL
 * Copyright : IRISA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Feb 23, 2005
 * Author : Franck Fleurey <ffleurey@irisa.fr>
 * 
 */
package org.kermeta.loader.kmt.fixer;

import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;

import fr.irisa.triskell.kermeta.language.behavior.TypeReference;
import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.FunctionType;
import fr.irisa.triskell.kermeta.language.structure.ObjectTypeVariable;
import fr.irisa.triskell.kermeta.language.structure.Operation;
import fr.irisa.triskell.kermeta.language.structure.Parameter;
import fr.irisa.triskell.kermeta.language.structure.PrimitiveType;
import fr.irisa.triskell.kermeta.language.structure.ProductType;
import fr.irisa.triskell.kermeta.language.structure.Property;
import fr.irisa.triskell.kermeta.language.structure.Type;
import fr.irisa.triskell.kermeta.language.structure.TypeContainer;
import fr.irisa.triskell.kermeta.language.structure.TypeVariableBinding;
import fr.irisa.triskell.kermeta.visitor.KermetaOptimizedVisitor;


/**
 * Visitor that adds a TypeContainer to all the types of the visited kermeta 
 * model.
 */
public class TypeContainementFixer extends KermetaOptimizedVisitor {

	
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#genericVisitChildren(org.eclipse.emf.ecore.EObject)
	 */
	public Object genericVisitChildren(EObject node) {
		// No browsering
		return null;
	}
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.structure.ClassDefinition)
	 */
	public Object visitClassDefinition(ClassDefinition node) {
		// if super types should be contained by the clessdef
		addContainedTypes(node.getSuperType(), node);
		addContainedTypes(node.getTypeParameter(), node);
		return null;
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.structure.FunctionType)
	 */
	public Object visitFunctionType(FunctionType node) {
		addContainedTypes(node.getLeft(), node);
		addContainedTypes(node.getRight(), node);
		return null;
	}
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.structure.FOperation)
	 */
	public Object visitOperation(Operation node) {
		addContainedTypes(node.getType(), node);
		addContainedTypes(node.getTypeParameter(), node);
		// RaisedException is also an EList of FTypes.
		addContainedTypes(node.getRaisedException(), node);
		return null;
	}
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.structure.Parameter)
	 */
	public Object visitParameter(Parameter node) {
		addContainedTypes(node.getType(), node);
		return null;
	}
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.structure.ProductType)
	 */
	public Object visitProductType(ProductType node) {
		addContainedTypes(node.getType(), node);
		return null;
	}
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.structure.Property)
	 */
	public Object visitProperty(Property node) {
		addContainedTypes(node.getType(), node);
		return super.visitProperty(node);
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.behavior.TypeReference)
	 */
	public Object visitTypeReference(TypeReference node) {
		addContainedTypes(node.getType(), node);
		return null;
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.structure.TypeVariable)
	 */
	public Object visitObjectTypeVariable(ObjectTypeVariable node) {
		addContainedTypes(node.getSupertype(), node);
		return null;
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.structure.TypeVariableBinding)
	 */
	public Object visitTypeVariableBinding(TypeVariableBinding node) {
		addContainedTypes(node.getType(), node);
		return super.visitTypeVariableBinding(node);
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.structure.PrimitiveType)
	 */
	public Object visitPrimitiveType(PrimitiveType node) {
		addContainedTypes(node.getInstanceType(), node);
		return super.visitPrimitiveType(node);
	}
	
	public void addContainedTypes(List types, TypeContainer container) {
		Iterator it = types.iterator();
		while(it.hasNext()) {
			addContainedTypes((Type)it.next(), container);
		}
	}
	
	
	
	
	public void addContainedTypes(Type t, TypeContainer container) {
		if (t != null && t.eContainer() == null) {
			container.getContainedType().add(t);
			// apply recussivly...
			if (t instanceof TypeContainer) this.accept(t);
			TreeIterator it = t.eAllContents();
			while(it.hasNext()) {
				fr.irisa.triskell.kermeta.language.structure.Object o = (fr.irisa.triskell.kermeta.language.structure.Object)it.next();
				if (o instanceof TypeContainer) {
					if (o != null) this.accept(o);
				}
			}
			
		}
	}
	
	
}
