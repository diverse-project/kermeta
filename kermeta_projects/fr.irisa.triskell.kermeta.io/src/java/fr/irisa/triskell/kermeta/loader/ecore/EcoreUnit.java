/* $Id: EcoreUnit.java,v 1.4 2006-06-07 16:44:36 zdrey Exp $
* Project : Kermeta (First iteration)
* File : EcoreUnit.java
* License : GPL
* Copyright : IRISA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 26 mai 2005
* Author : Franck Fleurey
*/ 

package fr.irisa.triskell.kermeta.loader.ecore;

import java.util.Hashtable;
import java.util.Iterator;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import fr.irisa.triskell.kermeta.exporter.ecore.KM2Ecore;
import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.PrimitiveType;
import fr.irisa.triskell.kermeta.language.structure.Type;
import fr.irisa.triskell.kermeta.language.structure.TypeDefinition;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.utils.KM2ECoreConversionException;

/**
 * @author Franck Fleurey
 * IRISA / University of rennes 1
 * Distributed under the terms of the GPL license
 */
public class EcoreUnit extends KermetaUnit {

    /**
     * @param uri
     * @param packages
     */
    public EcoreUnit(String uri, Hashtable packages) {
        super(uri, packages);
        ECore2Kermeta.isQuickFixEnabled = true;
    }
    
    public EcoreUnit(Resource resource, Hashtable packages) {
        this(resource.getURI().toString(), packages);
    }
    
    public void load() {
		try {
			// Load ressource
			Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ecore",new XMIResourceFactoryImpl()); 
			ResourceSet resource_set = new ResourceSetImpl();
			Resource resource = resource_set.getResource(URI.createURI(this.getUri()), true);
			this.load(resource);
		} catch (Throwable e) {
			this.messages.addError("Error loading ECore model " + this.getUri() + " : " + e, null);
			KermetaUnit.internalLog.error("Error loading ECore model " + this.getUri() + " : " + e, e);
		}
	}
    
	public void load(Resource resource) {
		try {
			ECore2Kermeta visitor = new ECore2Kermeta(this, resource);

			// Visit the metamodel
			Iterator pkgs = resource.getContents().iterator();
			while(pkgs.hasNext()) {
				EObject obj = (EObject)pkgs.next();
				if (obj instanceof EPackage) {
					visitor.accept(obj);
				}
			}
			
			for (EDataType node : visitor.datatypes.keySet()) {
				visitor.current_primitivetype = (PrimitiveType)visitor.datatypes.get(node); 
				// Get the instance class name of node
				String type_name = ((EDataType)node).getInstanceClassName();
				// dico : { javatype : kermetatype }
				if (visitor.primitive_types_mapping.containsKey(type_name)) {
					type_name = (String)visitor.primitive_types_mapping.get(type_name);
				}
				else if (node.getEAnnotation(KM2Ecore.KMT2ECORE_ANNOTATION)!=null) // IMPORTANT!
				{
					type_name = (String)visitor.accept(node.getEAnnotation(KM2Ecore.KMT2ECORE_ANNOTATION));
				}
				// Try to find in the current unit if the given type_name can be found
				TypeDefinition type = this.typeDefinitionLookup(type_name);
				// If not, search in the standard library (FIXME : standard library is not browsable anymore
				// through typeDefinition lookup!! it is no more integrated in the imported units of the current
				// unit!
				if (type == null) type = KermetaUnit.getStdLib().typeDefinitionLookup(type_name);
				// FIXME : If type is still null, replacing by the basic Object type of Kermeta is uncomplete;
				// this is not the best way to process.... -> use special tags in Kermeta to enrich the alias
				// with an extern "instanceClassName"?
				if (type == null) {
					this.messages.addWarning("cannot find instance class " + type_name + " for primitive type " + 
							visitor.getQualifiedName((EDataType)node) + " (replaced by Object)", null);
					type = KermetaUnit.getStdLib().typeDefinitionLookup("kermeta::language::structure::Object");
				}
				visitor.current_primitivetype.setInstanceType(
						visitor.createInstanceTypeForTypeDefinition(type));
			}
			
			// Visit the operations of ClassDefinitions after the other elements because 
			// the body of operation needs to know all the types that it can use.
			// idem for the super types of operations.
			Iterator cit = visitor.types.keySet().iterator();
			// FIXME > a visitor would be more pretty...
			while (cit.hasNext())
			{
				EObject node = (EObject)cit.next();
				if (node instanceof EClass)
				{
					visitor.current_classdef = (ClassDefinition)visitor.types.get(node);
					// Set the super types
					Iterator sit = ((EClass)node).getESuperTypes().iterator();
					while (sit.hasNext()) {
						EClassifier st = (EClassifier)sit.next();
						Type t = visitor.createTypeForEClassifier(st);
						if (t == null || !(t instanceof fr.irisa.triskell.kermeta.language.structure.Class)) {
							throw new KM2ECoreConversionException(
							"Internal error of ecore2kermeta :" +
							" supertypes of class " + visitor.getQualifiedName((EClass)node) + " : "+ visitor.getQualifiedName(st) +" not found");
						}
						visitor.current_classdef.getSuperType().add(t);
					}
					//visitor.acceptList(((EClass)node).getESuperTypes());
					visitor.acceptList(((EClass)node).getEStructuralFeatures());
					visitor.acceptList(((EClass)node).getEOperations());
					// Class annotations
					visitor.acceptList(((EClass)node).getEAnnotations());
				}
			}
			
			// Once the operations are defined we can set their superOperation property
			Iterator<EOperation> ops = visitor.operations.keySet().iterator(); 
			while (ops.hasNext())
			{
				EOperation node = ops.next(); 
				// TODO Has the operation an "implicit" super operation
				// (not defined in the KM2Ecore.ANNOTATION_SUPEROPERATION_DETAILS...)?
				visitor.current_op = visitor.operations.get(node);
				// it could have been resolved from the EAnnotation visit
				if (visitor.current_op.getSuperOperation()==null)
				{
					EOperation superop = visitor.findSuperOperation(node);
					if (superop != null) visitor.current_op.setSuperOperation(visitor.operations.get(superop));
				}
			}
			
		} catch (Throwable e) {
			this.messages.addError("Error loading ECore model " + this.getUri() + " : " + e, null);
			KermetaUnit.internalLog.error("Error loading ECore model " + this.getUri() + " : " + e, e);
		}
		
	}
	
    /**
     * @see fr.irisa.triskell.kermeta.loader.KermetaUnit#preLoad()
     */
    public void preLoad() {}

    /**
     * @see fr.irisa.triskell.kermeta.loader.KermetaUnit#loadAnnotations()
     */
    public void loadAnnotations() {}

    /**
     * @see fr.irisa.triskell.kermeta.loader.KermetaUnit#loadImportedUnits()
     */
    public void loadImportedUnits() {}

    /**
     * @see fr.irisa.triskell.kermeta.loader.KermetaUnit#loadTypeDefinitions()
     */
    public void loadTypeDefinitions() {}

    /**
     * @see fr.irisa.triskell.kermeta.loader.KermetaUnit#loadStructuralFeatures()
     */
    public void loadStructuralFeatures() {}

    /**
     * @see fr.irisa.triskell.kermeta.loader.KermetaUnit#loadOppositeProperties()
     */
    public void loadOppositeProperties() {}

    /**
     * @see fr.irisa.triskell.kermeta.loader.KermetaUnit#loadBodies()
     */
    public void loadBodies() {}

}
