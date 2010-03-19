/*
 * This code has been generated to visit a kermeta model
 * Creation date: Thu Jun 12 07:02:17 GMT 2008
 * Template Created on feb. 2005
 * By Franck FLEUREY (ffleurey@irisa.fr)
 * IRISA / INRIA / University of rennes 1
 * Distributed under the terms of the EPL license
 */
package fr.irisa.triskell.kermeta.visitor;

import java.lang.reflect.*;
import java.util.Iterator;
import org.eclipse.emf.ecore.EObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import fr.irisa.triskell.kermeta.error.KermetaVisitorError;

/**
 * @author Franck Fleurey
 * IRISA / INRIA / University of rennes 1
 * Distributed under the terms of the EPL license
 */
public class KermetaVisitor {

	final static public Logger internalLog = LoggerFactory.getLogger("KMT.model");
			// This is a generic visit method.
			public Object genericVisitChildren(EObject node) {
				Object result = null;
				Iterator<EObject> children = node.eContents().iterator();
				while (children.hasNext()) {
					EObject child = children.next();
					accept(child);
				}
				return result;
			}
			
			public Object accept(EObject node) {
				Object result = null;
				String cname="";
				String methodName="";
				try {
					Class<?>[] ptypes = new Class[1];
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
					if (e instanceof InvocationTargetException && ((InvocationTargetException)e).getTargetException() instanceof Error) throw (Error)((InvocationTargetException)e).getTargetException();
					Throwable cause = e.getCause();
					String message = "Kermeta visitor " + this.getClass().getName() +  ", error accepting a " + cname + " : " + e.getMessage();
		    		if (cause != null)				   
		        		if (cause.getClass().getName().compareTo("fr.irisa.triskell.kermeta.error.KermetaVisitorError")==0)
			    		{
		            		internalLog.error(message, e);
		            		// this Exception was due to a KermetaVisitorError create a new one with the precedent content
		            		throw new KermetaVisitorError(message, cause.getCause());
		        		}
		        		else
		        		{
							internalLog.error(message, e);
							throw	new KermetaVisitorError(e.getClass().getName() + " invoking "+ methodName + " on Class " +cname  ,e);
						}
		        	else
		        	{
						internalLog.error(message, e);
						throw	new KermetaVisitorError(e.getClass().getName() + " invoking "+ methodName + " on Class " +cname  ,e);
					}
				}
				return result;
			}

	public Object visit(fr.irisa.triskell.kermeta.language.behavior.CallVariable node) {
	return genericVisitChildren(node);
	}

	public Object visit(fr.irisa.triskell.kermeta.language.behavior.CallFeature node) {
	return genericVisitChildren(node);
	}

	public Object visit(fr.irisa.triskell.kermeta.language.behavior.CallSuperOperation node) {
	return genericVisitChildren(node);
	}

	public Object visit(fr.irisa.triskell.kermeta.language.behavior.CallResult node) {
	return genericVisitChildren(node);
	}

	public Object visit(fr.irisa.triskell.kermeta.language.behavior.CallValue node) {
	return genericVisitChildren(node);
	}

	public Object visit(fr.irisa.triskell.kermeta.language.behavior.Assignment node) {
	return genericVisitChildren(node);
	}

	public Object visit(fr.irisa.triskell.kermeta.language.behavior.Block node) {
	return genericVisitChildren(node);
	}

	public Object visit(fr.irisa.triskell.kermeta.language.behavior.Conditional node) {
	return genericVisitChildren(node);
	}

	public Object visit(fr.irisa.triskell.kermeta.language.behavior.Raise node) {
	return genericVisitChildren(node);
	}

	public Object visit(fr.irisa.triskell.kermeta.language.behavior.Rescue node) {
	return genericVisitChildren(node);
	}

	public Object visit(fr.irisa.triskell.kermeta.language.behavior.TypeReference node) {
	return genericVisitChildren(node);
	}

	public Object visit(fr.irisa.triskell.kermeta.language.behavior.EmptyExpression node) {
	return genericVisitChildren(node);
	}

	public Object visit(fr.irisa.triskell.kermeta.language.behavior.JavaStaticCall node) {
	return genericVisitChildren(node);
	}

	public Object visit(fr.irisa.triskell.kermeta.language.behavior.LambdaExpression node) {
	return genericVisitChildren(node);
	}

	public Object visit(fr.irisa.triskell.kermeta.language.behavior.LambdaParameter node) {
	return genericVisitChildren(node);
	}

	public Object visit(fr.irisa.triskell.kermeta.language.behavior.IntegerLiteral node) {
	return genericVisitChildren(node);
	}

	public Object visit(fr.irisa.triskell.kermeta.language.behavior.StringLiteral node) {
	return genericVisitChildren(node);
	}

	public Object visit(fr.irisa.triskell.kermeta.language.behavior.BooleanLiteral node) {
	return genericVisitChildren(node);
	}

	public Object visit(fr.irisa.triskell.kermeta.language.behavior.TypeLiteral node) {
	return genericVisitChildren(node);
	}

	public Object visit(fr.irisa.triskell.kermeta.language.behavior.VoidLiteral node) {
	return genericVisitChildren(node);
	}

	public Object visit(fr.irisa.triskell.kermeta.language.behavior.Loop node) {
	return genericVisitChildren(node);
	}

	public Object visit(fr.irisa.triskell.kermeta.language.behavior.SelfExpression node) {
	return genericVisitChildren(node);
	}

	public Object visit(fr.irisa.triskell.kermeta.language.behavior.VariableDecl node) {
	return genericVisitChildren(node);
	}

	public Object visit(fr.irisa.triskell.kermeta.language.structure.Operation node) {
	return genericVisitChildren(node);
	}

	public Object visit(fr.irisa.triskell.kermeta.language.structure.Property node) {
	return genericVisitChildren(node);
	}

	public Object visit(fr.irisa.triskell.kermeta.language.structure.Type node) {
	return genericVisitChildren(node);
	}

	public Object visit(fr.irisa.triskell.kermeta.language.structure.EnumerationLiteral node) {
	return genericVisitChildren(node);
	}

	public Object visit(fr.irisa.triskell.kermeta.language.structure.TypeVariableBinding node) {
	return genericVisitChildren(node);
	}

	public Object visit(fr.irisa.triskell.kermeta.language.structure.Object node) {
	return genericVisitChildren(node);
	}

	public Object visit(fr.irisa.triskell.kermeta.language.structure.MultiplicityElement node) {
	return genericVisitChildren(node);
	}

	public Object visit(fr.irisa.triskell.kermeta.language.structure.TypeDefinition node) {
	return genericVisitChildren(node);
	}

	public Object visit(fr.irisa.triskell.kermeta.language.structure.Class node) {
	return genericVisitChildren(node);
	}

	public Object visit(fr.irisa.triskell.kermeta.language.structure.Enumeration node) {
	return genericVisitChildren(node);
	}

	public Object visit(fr.irisa.triskell.kermeta.language.structure.Package node) {
	return genericVisitChildren(node);
	}

	public Object visit(fr.irisa.triskell.kermeta.language.structure.Parameter node) {
	return genericVisitChildren(node);
	}

	public Object visit(fr.irisa.triskell.kermeta.language.structure.PrimitiveType node) {
	return genericVisitChildren(node);
	}

	public Object visit(fr.irisa.triskell.kermeta.language.structure.Tag node) {
	return genericVisitChildren(node);
	}

	public Object visit(fr.irisa.triskell.kermeta.language.structure.Constraint node) {
	return genericVisitChildren(node);
	}

	public Object visit(fr.irisa.triskell.kermeta.language.structure.ClassDefinition node) {
	return genericVisitChildren(node);
	}

	public Object visit(fr.irisa.triskell.kermeta.language.structure.ObjectTypeVariable node) {
	return genericVisitChildren(node);
	}

	public Object visit(fr.irisa.triskell.kermeta.language.structure.ModelType node) {
	return genericVisitChildren(node);
	}

	public Object visit(fr.irisa.triskell.kermeta.language.structure.ModelTypeVariable node) {
	return genericVisitChildren(node);
	}

	public Object visit(fr.irisa.triskell.kermeta.language.structure.VirtualType node) {
	return genericVisitChildren(node);
	}

	public Object visit(fr.irisa.triskell.kermeta.language.structure.Model node) {
	return genericVisitChildren(node);
	}

	public Object visit(fr.irisa.triskell.kermeta.language.structure.ModelingUnit node) {
	return genericVisitChildren(node);
	}

	public Object visit(fr.irisa.triskell.kermeta.language.structure.Require node) {
	return genericVisitChildren(node);
	}

	public Object visit(fr.irisa.triskell.kermeta.language.structure.Using node) {
	return genericVisitChildren(node);
	}

	public Object visit(fr.irisa.triskell.kermeta.language.structure.Filter node) {
	return genericVisitChildren(node);
	}

	public Object visit(fr.irisa.triskell.kermeta.language.structure.ProductType node) {
	return genericVisitChildren(node);
	}

	public Object visit(fr.irisa.triskell.kermeta.language.structure.FunctionType node) {
	return genericVisitChildren(node);
	}

	public Object visit(fr.irisa.triskell.kermeta.language.structure.VoidType node) {
	return genericVisitChildren(node);
	}



}
