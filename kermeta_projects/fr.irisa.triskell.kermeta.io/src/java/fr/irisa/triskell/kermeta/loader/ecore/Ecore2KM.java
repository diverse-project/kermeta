/* $Id: Ecore2KM.java,v 1.15 2008-03-05 08:15:04 ftanguy Exp $
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

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.resource.Resource;

import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.Operation;
import fr.irisa.triskell.kermeta.language.structure.Property;


public class Ecore2KM {

	// Some values used to tune the transformation
	public static boolean isQuickFixEnabled = false;  // globally enable or disable the quickfixes
	public static boolean isMethodPropertyNameOverlapSafe = true;
	public static String methodRenamePrefix = "op_";
	public static String methodRenamePostfix = "";
	public static boolean isMethodNameOverlapSafe = true;
	public boolean isClassTypeOwner = true;
	
	protected Resource resource;
	/**
	 * reference to element currently visited 
	 */
	protected Property current_prop;
	protected ClassDefinition current_classdef;
	protected Operation current_op;

	
	/**
	 * Hashtable used to manage the invariants annotations that are encoded in Ecore as annotations
	 * that refer the annotation containing the invariant.
	 * The structure enables to map the visited "invariants annotations" EAnnotations to the allocated
	 * Tag elements.
	 */
	public Hashtable<EAnnotation,fr.irisa.triskell.kermeta.language.structure.Object> nestedAnnotMap = new Hashtable<EAnnotation,fr.irisa.triskell.kermeta.language.structure.Object>();

	/** this map is used to determine the java object corresponding to a kermeta primitive type */ 
    public static Hashtable<String,String> primitive_types_mapping;
    static {
    	primitive_types_mapping = new Hashtable<String,String>();
    	primitive_types_mapping.put("char", "kermeta::standard::Character");
    	//primitive_types_mapping.put("kermeta::standard::Character",	"java.lang.Character");
    	primitive_types_mapping.put("java.lang.Integer", "kermeta::language::structure::Integer");
    	primitive_types_mapping.put("boolean", "kermeta::language::structure::Boolean");
    	primitive_types_mapping.put("java.lang.Boolean", "kermeta::standard::Boolean");
    	primitive_types_mapping.put("java.lang.String", "kermeta::language::structure::String");
    	primitive_types_mapping.put("java.lang.Object", "kermeta::standard::Object");
    	primitive_types_mapping.put("java.lang.Integer", "kermeta::language::structure::UnlimitedNatural");
    	primitive_types_mapping.put("java.lang.Double", "kermeta::standard::Real");
    }
	
}
