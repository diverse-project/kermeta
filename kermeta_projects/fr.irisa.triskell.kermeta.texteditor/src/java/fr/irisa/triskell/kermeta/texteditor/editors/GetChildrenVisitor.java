/*
 * Created on 13 f�vr. 2005
 * By Franck FLEUREY (ffleurey@irisa.fr)
 */
package fr.irisa.triskell.kermeta.texteditor.editors;

import java.util.ArrayList;

import org.eclipse.emf.ecore.EObject;

import fr.irisa.triskell.kermeta.structure.FClassDefinition;
import fr.irisa.triskell.kermeta.structure.FEnumeration;
import fr.irisa.triskell.kermeta.structure.FEnumerationLiteral;
import fr.irisa.triskell.kermeta.structure.FOperation;
import fr.irisa.triskell.kermeta.structure.FPackage;
import fr.irisa.triskell.kermeta.structure.FPrimitiveType;
import fr.irisa.triskell.kermeta.structure.FProperty;
import fr.irisa.triskell.kermeta.visitor.KermetaVisitor;

/**
 * @author Franck Fleurey
 * IRISA / University of rennes 1
 * Distributed under the terms of the GPL license
 */
public class GetChildrenVisitor extends KermetaVisitor {
	/**
	 * @see metacore.visitor.MetacoreVisitor#genericVisitChildren(org.eclipse.emf.ecore.EObject)
	 */
	public Object genericVisitChildren(EObject arg0) {
		return null;
	}
	/**
	 * @see metacore.visitor.MetacoreVisitor#visit(metacore.structure.FClassDefinition)
	 */
	public Object visit(FClassDefinition arg0) {
		ArrayList result = new ArrayList();
		result.addAll(arg0.getFOwnedAttributes());
		result.addAll(arg0.getFOwnedOperation());
		return result.toArray();
	}
	/**
	 * @see metacore.visitor.MetacoreVisitor#visit(metacore.structure.FEnumeration)
	 */
	public Object visit(FEnumeration arg0) {
		ArrayList result = new ArrayList();
		result.addAll(arg0.getFOwnedLiteral());
		return result.toArray();
	}
	/**
	 * @see metacore.visitor.MetacoreVisitor#visit(metacore.structure.FEnumerationLiteral)
	 */
	public Object visit(FEnumerationLiteral arg0) {
		return new Object[0];
	}
	
	/**
	 * @see metacore.visitor.MetacoreVisitor#visit(metacore.structure.FOperation)
	 */
	public Object visit(FOperation arg0) {
		return new Object[0];
	}
	/**
	 * @see metacore.visitor.MetacoreVisitor#visit(metacore.structure.FPackage)
	 */
	public Object visit(FPackage arg0) {
		ArrayList result = new ArrayList();
		result.addAll(arg0.getFNestedPackage());
		result.addAll(arg0.getFOwnedTypeDefinition());
		return result.toArray();
	}
	/**
	 * @see metacore.visitor.MetacoreVisitor#visit(metacore.structure.FPrimitiveType)
	 */
	public Object visit(FPrimitiveType arg0) {
		return new Object[0];
	}
	/**
	 * @see metacore.visitor.MetacoreVisitor#visit(metacore.structure.FProperty)
	 */
	public Object visit(FProperty arg0) {
		return new Object[0];
	}
}
