/* $Id: Ecore2KM.java,v 1.10 2007-05-25 15:11:08 ftanguy Exp $
 * Project    : fr.irisa.triskell.kermeta.io
 * File       : Ecore2KM.java
 * License    : EPL
 * Copyright  : IRISA / INRIA / Universite de Rennes 1
 * -------------------------------------------------------------------
 * Creation date : Jun 20, 2006
 * Authors : 
 *    zdrey <zdrey@irisa.fr>
 * Contributors :
 */
package fr.irisa.triskell.kermeta.loader.ecore;

import java.util.Hashtable;
import java.util.Iterator;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;

import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.Property;
import fr.irisa.triskell.kermeta.language.structure.Operation;


public class Ecore2KM {

	// Some values used to tune the transformation
	public static boolean isQuickFixEnabled = false;  // globally enable or disable the quickfixes
	public static boolean isMethodPropertyNameOverlapSafe = true;
	public static String methodRenamePrefix = "op_";
	public static String methodRenamePostfix = "";
	public static boolean isMethodNameOverlapSafe = true;
	public boolean isClassTypeOwner = true;
	
	protected Resource resource;
	protected EcoreUnit unit;
	/**
	 * reference to element currently visited 
	 */
	protected Property current_prop;
	protected ClassDefinition current_classdef;
	protected Operation current_op;


	protected static Hashtable<String, String> primitive_types_mapping;
	
	static {
		primitive_types_mapping = new Hashtable<String, String>();
		primitive_types_mapping.put("int", 					"kermeta::standard::Integer");
		primitive_types_mapping.put("java.lang.Integer", 	"kermeta::standard::Integer"); // Fixme : UnlimiteNatural not handled
		primitive_types_mapping.put("boolean", 				"kermeta::standard::Boolean");
		primitive_types_mapping.put("java.lang.Boolean", 	"kermeta::standard::Boolean");
		primitive_types_mapping.put("java.lang.String", 	"kermeta::standard::String");
		primitive_types_mapping.put("Object", 				"kermeta::standard::Object");
		primitive_types_mapping.put("java.lang.Object", 	"kermeta::standard::Object");
	}
	
	/**
	 * Hashtable used to manage the invariants annotations that are encoded in Ecore as annotations
	 * that refer the annotation containing the invariant.
	 * The structure enables to map the visited "invariants annotations" EAnnotations to the allocated
	 * Tag elements.
	 */
	public Hashtable<EAnnotation,fr.irisa.triskell.kermeta.language.structure.Object> nestedAnnotMap = new Hashtable<EAnnotation,fr.irisa.triskell.kermeta.language.structure.Object>();
	
	public Ecore2KM(Resource resource, EcoreUnit unit)
	{
		this.resource = resource;
		this.unit = unit;
	}
	
	public void export()
	{
		// First pass : visit all the packages, type definitions, and operations and properties without
		// their types
		Ecore2KMPass1 visitor1 = new Ecore2KMPass1(this);

		// Visit the metamodel : we visit the packages, which imply the visit of 
		// the classdefinitions and sub packages
		Iterator pkgs = resource.getContents().iterator();
		while(pkgs.hasNext()) {
			EObject obj = (EObject)pkgs.next();
			if (obj instanceof EPackage) {
				visitor1.accept(obj);
			}
			
		}
		// Second pass : visit the classes and set their supertypes
		Ecore2KMPass2 visitor2 = new Ecore2KMPass2(visitor1, this);
		visitor2.convertUnit();
		
		// Third pass : visit the operation and properties and set their types
		Ecore2KMPass3 visitor3 = new Ecore2KMPass3(visitor1, this);
		Hashtable opTable = visitor3.convertUnit();
		
		// Forth pass: visit the operations again, and apply the QuickFix corrections
		if (Ecore2KM.isQuickFixEnabled) {
			Ecore2KMPass4 visitor4 = new Ecore2KMPass4(visitor1, opTable, this);
			visitor4.fixUnit();
		}
	}
	
}
