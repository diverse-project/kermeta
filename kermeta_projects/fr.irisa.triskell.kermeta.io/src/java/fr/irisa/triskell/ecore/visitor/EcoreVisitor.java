/*
 * This code has been generated to visit an ecore model
 * Creation date: Thu May 26 16:29:12 CEST 2005
 * Template Created on 7 févr. 2005
 * By Franck FLEUREY (ffleurey@irisa.fr)
 */
package fr.irisa.triskell.ecore.visitor;

import java.lang.reflect.*;
import java.util.Iterator;

import org.eclipse.emf.ecore.*;

/**
 * @author Franck Fleurey
 * IRISA / INRIA / University of rennes 1
 * Distributed under the terms of the GPL license
 */
public class EcoreVisitor {

			// This is a generic visit method.
			public Object genericVisitChildren(EObject node) {
				Object result = null;
				Iterator children = node.eContents().iterator();
				while (children.hasNext()) {
					EObject child = (EObject)children.next();
					accept(child);
				}
				return result;
			}
			
			public Object accept(EObject node) {
				Object result = null;
				String cname="";
				String methodName="";
				try {
					Class[] ptypes = new Class[1];
					cname = node.getClass().getName();
					cname = cname.substring(0, cname.length()-4).replaceAll(".impl", "");
					ptypes[0] = Class.forName(cname);
					Method m = this.getClass().getMethod("visit", ptypes);
					methodName = m.getName();
					Object[] params = new Object[1];
					params[0] = node;
					result = m.invoke(this, params);
				}
				catch (Exception e) {
				    throw new Error(e);
				}
				return result;
			}

	public Object visit(EAttribute node) {
	return genericVisitChildren(node);
	}

	public Object visit(EAnnotation node) {
	return genericVisitChildren(node);
	}

	public Object visit(EClass node) {
	return genericVisitChildren(node);
	}

	public Object visit(EDataType node) {
	return genericVisitChildren(node);
	}

	public Object visit(EEnum node) {
	return genericVisitChildren(node);
	}

	public Object visit(EEnumLiteral node) {
	return genericVisitChildren(node);
	}

	public Object visit(EFactory node) {
	return genericVisitChildren(node);
	}

	public Object visit(EObject node) {
	return genericVisitChildren(node);
	}

	public Object visit(EOperation node) {
	return genericVisitChildren(node);
	}

	public Object visit(EPackage node) {
	return genericVisitChildren(node);
	}

	public Object visit(EParameter node) {
	return genericVisitChildren(node);
	}

	public Object visit(EReference node) {
	return genericVisitChildren(node);
	}

}
