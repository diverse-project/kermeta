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
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

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
import org.kermeta.io.plugin.IOPlugin;


/**
 * @author Franck Fleurey
 * IRISA / INRIA / University of rennes 1
 * Distributed under the terms of the EPL license
 * Bug 13044 fixed
 */
public class EcoreVisitor {
	
	// Maps for keeping data about the hierarchy of objects
	// and data about the visit methods already found
	Map<Class<?>,Set<Class<?>>> hierarchies = new HashMap<Class<?>, Set<Class<?>>>();
	Map<Class<?>,Class<?>> parents = new HashMap<Class<?>,Class<?>>();
	Map<Class<?>,Method> visits = new HashMap<Class<?>,Method>();

	// This is a generic visit method.
	public Object genericVisitChildren(EObject node) {
		Object result = null;
		Iterator<EObject> children = node.eContents().iterator();
		while (children.hasNext()) {
			EObject child = (EObject) children.next();
			accept(child);
		}
		return result;
	}

	public Object accept(EObject node) {
		Object result = null;
		String cname = "";
		cname = node.getClass().getName();

		try {

			// FIXME 2007-11-06 Say why the following source is commented and also update the class comment

			// consider EcorePackageImpl and XMLTypePackageImpl as EPackageImpl
			/*if ( cname.equals("org.eclipse.emf.ecore.impl.EcorePackageImpl") ||
			 	cname.equals("org.eclipse.emf.ecore.xml.type.impl.XMLTypePackageImpl")) { 
			 	cname = "org.eclipse.emf.ecore.impl.EPackageImpl";
			 }*/

			// ||
			// cname.equals("org.eclipse.uml2.uml.internal.impl.UMLPackageImpl")

			// if ( !cname.equals("org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl") )
			// Special case for EStringToStringMapEntry which does not have an EMF interface.
			// cname = cname.substring(0, cname.length()-4).replaceAll(".impl","").replaceAll(".internal", "");

			Class<?> c = Class.forName(cname, true, node.getClass().getClassLoader());
			Method m = null;
			// Look for the right method to invoke
			// First check if the method is accessible for the current type
			Class<?>[] ptypes = new Class[1];
			try {
				ptypes[0] = c;
				m = this.getClass().getMethod("visit", ptypes);
			} catch (NoSuchMethodException e) {
				// We voluntarily ignore this exception
				IOPlugin.internalLog.debug("[EcoreVisitor] No method visit found for " + c.toString());
			}
			if (m == null) {
				// Trying to get the method from a previous run
				if (visits.containsKey(c)) {
					m = visits.get(c);
				} else {
					// Browse the object hierarchy
					hierarchies.clear();
					// getHierarchies(c);
					buildHierarchy(c);
					m = getMethod(c);
					visits.put(c, m);
				}
			} else
				throw new NoSuchMethodException("[EcoreVisitor] No method visit found for "+ c.toString());

			Object[] params = new Object[1];
			params[0] = node;
			result = m.invoke(this, params);
		} catch (NoSuchMethodException e) {
			throw new Error(e);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	/** Call visitor on a list of elements */
	protected void acceptList(EList<?> l) {
		Iterator<?> it = l.iterator();
		while (it.hasNext()) {
			EObject o = (EObject) it.next();
			this.accept(o);
		}
	}

	/**
	 * Looks for the visit method in the hierarchy of cl
	 * @param cl the parameter of the visit method that we are 
	 * looking for
	 */
	private Method getMethod(Class<?> cl) throws NoSuchMethodException {
		Method m = null;
		// List of candidate methods
		Map<Method, Class<?>> methods = new HashMap<Method, Class<?>>();
		// Building the list of all types in hierarchy
		Set<Class<?>> listClasses = new HashSet<Class<?>>();
		listClasses.add(cl);
		for (Class<?> i : hierarchies.keySet()) {
			listClasses.add(i);
			listClasses.addAll(hierarchies.get(i));
		}
		methods = lookForMethodInInterfaces(listClasses);
		// From the set of candidate method, find the right one
		m = selectMethodInHierarchy(methods);
		return m;
	}

	/**
	 * Select one of the candidate method owned by the leaf
	 * class in the hierarchy of classes
	 * @param methods lists the candidates methods
	 */
	private Method selectMethodInHierarchy(Map<Method, Class<?>> methods) {
		// Retrieves the type of the parameter of the first method
		// for comparing types
		Method m = ((Method) methods.keySet().toArray()[0]);
		Class<?> lowerClassInHierarchy = m.getParameterTypes()[0];
		for (Method method : methods.keySet()) {
			if (method.getParameterTypes().length != 0) {
				// Find the lowest type in the hierarchy
				for (Class<?> c : method.getParameterTypes()) {
					if (isParent(lowerClassInHierarchy, c)) {
						parents.put(lowerClassInHierarchy, c);
						lowerClassInHierarchy = c;
						m = method;
					}
				}
			}
		}
		return m;
	}

	/**
	 * Checks if a type is a supertype of another class
	 * @param c is the possible parent
	 * @param c2 is the possible child
	 */
	public boolean isParent(Class<?> c, Class<?> c2) {
		// Test already run
		if ((parents.get(c) != null) && parents.get(c).equals(c2))
			return true;
		if (c.equals(c2))
			return true;
		// if c is a direct parent of c2
		if (hierarchies.get(c2).contains(c))
			return true;
		else {
			// looking among indirect parents
			boolean b = false;
			for (Class<?> i : hierarchies.get(c2)) {
				b = b || isParent(c, i);
			}
			return b;
		}
	}

	/**
	 * Browse the hierarchy to find candidate methods
	 * @param classes types of the hierarchy
	 */
	public Map<Method, Class<?>> lookForMethodInInterfaces(Set<Class<?>> classes) {
		Map<Method, Class<?>> m = new HashMap<Method, Class<?>>();
		for (Class<?> cl : classes) {
			Class<?>[] ptypes = new Class[1];
			try {
				ptypes[0] = cl;
				m.put(this.getClass().getMethod("visit", ptypes), cl);
			} catch (NoSuchMethodException e) {
				m.putAll(lookForMethodInInterfaces(hierarchies.get(cl)));
			}
		}
		return m;
	}

	/**
	 * Builds the hierarchy of types for a given type
	 * @param cl is the class from which we build the hierarchy
	 */
	public void buildHierarchy(Class<?> cl) {
		Set<Class<?>> supInterfaces = new HashSet<Class<?>>();
		for (Class<?> i : cl.getInterfaces()) {
			supInterfaces.add(i);
			if (!hierarchies.containsKey(i))
				buildHierarchy(i);
		}
		hierarchies.put(cl, supInterfaces);
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
