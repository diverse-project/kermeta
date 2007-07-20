/*
 * This code has been generated to visit an ecore model
 * Creation date: Thu May 26 16:29:12 CEST 2005
 * Template Created on 7 f�vr. 2005
 * By Franck FLEUREY (ffleurey@irisa.fr)
 * 
 * Important : DVK : I've manually modified this class in order to take into account some 
 *   node for special purpose:
 *   for example when the ecore comes from a xsd2ecore, it needs to take into account 
 *   org.eclipse.emf.ecore.xml.type.impl.XMLTypePackageImpl
 *   I still dont know how to automatically generate the visitor for both ecore and xml
 *   be carefull need to update the visitor that inherit from this one ..
 */
package fr.irisa.triskell.kermeta.loader.ecore;

import java.lang.reflect.*;
import java.util.Iterator;

import org.eclipse.emf.common.util.BasicEMap;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.*;
import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;


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
				try {
					Class[] ptypes = new Class[1];
					cname = node.getClass().getName();
					
					
					// consider EcorePackageImpl and XMLTypePackageImpl as EPackageImpl
					if ( cname.equals("org.eclipse.emf.ecore.impl.EcorePackageImpl") ||
						 cname.equals("org.eclipse.emf.ecore.xml.type.impl.XMLTypePackageImpl")	) {
						cname = "org.eclipse.emf.ecore.impl.EPackageImpl";
					}

					// Special case for EStringToStringMapEntry which does not have an EMF interface.
					if ( ! cname.equals("org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl") )
						cname = cname.substring(0, cname.length()-4).replaceAll(".impl", "");
					
					ptypes[0] = Class.forName(cname);
					Method m = this.getClass().getMethod("visit", ptypes);
					Object[] params = new Object[1];
					params[0] = node;
					result = m.invoke(this, params);
				}
				catch (NoSuchMethodException e) {
					//KermetaUnit.internalLog.error("NoSuchMethodException during accept");
					//KermetaUnit.internalLog.error("Class of the node : " + node.getClass().getName(), e);
					throw new Error(e);
				}
				catch (Exception e) {
					e.printStackTrace();
				}
				return result;
			}
			
			
			/** Call visitor on a list of elements */
			protected void acceptList(EList l) {
				Iterator it = l.iterator();
				while (it.hasNext()) {
					EObject o = (EObject)it.next();
					this.accept(o);
				}
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

	public Object visit(EStringToStringMapEntryImpl node) {
	return genericVisitChildren(node);
	}
	
	public Object visit(EGenericType node) {
		return genericVisitChildren(node);
	}
	
	public Object visit(ETypeParameter node) {
		return genericVisitChildren(node);
	}
}
