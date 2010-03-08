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
package fr.irisa.triskell.kermeta.loader.ecore.ecore2km;

import java.lang.reflect.Method;
import java.util.Iterator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.ETypeParameter;
import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;


/**
 * @author Franck Fleurey
 * IRISA / INRIA / University of rennes 1
 * Distributed under the terms of the EPL license
 */
public class EcoreVisitor {

			// This is a generic visit method.
			public Object genericVisitChildren(EObject node) {
				Object result = null;
				Iterator<EObject> children = node.eContents().iterator();
				while (children.hasNext()) {
					EObject child = (EObject)children.next();
					accept(child);
				}
				return result;
			}
			
			public Object accept(EObject node) {
				Object result = null;
				String cname="";
				cname = node.getClass().getName();
				
				try {
					
					// FIXME 2007-11-06 Say why the following source is commented and also update the class comment
					
					// consider EcorePackageImpl and XMLTypePackageImpl as EPackageImpl
					/*if ( cname.equals("org.eclipse.emf.ecore.impl.EcorePackageImpl") ||
						 cname.equals("org.eclipse.emf.ecore.xml.type.impl.XMLTypePackageImpl")) {
						cname = "org.eclipse.emf.ecore.impl.EPackageImpl";
					} */
					
//					|| 
//					 cname.equals("org.eclipse.uml2.uml.internal.impl.UMLPackageImpl")
					
					//if ( ! cname.equals("org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl") )
						// Special case for EStringToStringMapEntry which does not have an EMF interface.
						//cname = cname.substring(0, cname.length()-4).replaceAll(".impl", "").replaceAll(".internal", "");					
					
					Class<?> c = Class.forName(cname, true, node.getClass().getClassLoader());
					Method m =  getMethod( c );
					if ( m == null )
						throw new NoSuchMethodException("No method visit found for " + c.toString() );
					
					Object[] params = new Object[1];
					params[0] = node;
					result = m.invoke(this, params);
				}
				catch (NoSuchMethodException e) {
					throw new Error(e);
				}
				catch (Exception e) {
					e.printStackTrace();
				}
				return result;
			}
			
			
			/** Call visitor on a list of elements */
			protected void acceptList(EList<?> l) {
				Iterator<?> it = l.iterator();
				while (it.hasNext()) {
					EObject o = (EObject)it.next();
					this.accept(o);
				}
			}

			
			private Method getMethod(Class<?> cl) throws NoSuchMethodException {
				Method m = null;
				Class<?>[] ptypes = new Class[1];
				try {
					ptypes[0] = cl;
					m = this.getClass().getMethod("visit", ptypes);
				} catch (NoSuchMethodException e) {}
				
				Class<?>[] interfaces = cl.getInterfaces();
				int index = 0;
				while ( m == null ) {
					m = getMethod( interfaces[index++] );
				}
				
				return m;
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
