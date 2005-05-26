/* $Id: ECore2Kermeta.java,v 1.1 2005-05-26 15:40:52 ffleurey Exp $
* Project : Kermeta (First iteration)
* File : ECore2Kermeta.java
* License : GPL
* Copyright : IRISA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 26 mai 2005
* Author : Franck Fleurey
*/ 

package fr.irisa.triskell.kermeta.loader.ecore;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Stack;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.EReference;

import fr.irisa.triskell.ecore.visitor.EcoreVisitor;
import fr.irisa.triskell.kermeta.loader.KMUnitError;
import fr.irisa.triskell.kermeta.structure.FClass;
import fr.irisa.triskell.kermeta.structure.FClassDefinition;
import fr.irisa.triskell.kermeta.structure.FEnumeration;
import fr.irisa.triskell.kermeta.structure.FOperation;
import fr.irisa.triskell.kermeta.structure.FPackage;
import fr.irisa.triskell.kermeta.structure.FProperty;
import fr.irisa.triskell.kermeta.structure.FType;
import fr.irisa.triskell.kermeta.structure.FTypeDefinition;

/**
 * @author Franck Fleurey
 * IRISA / University of rennes 1
 * Distributed under the terms of the GPL license
 */
public class ECore2Kermeta extends EcoreVisitor {

    protected EcoreUnit unit;
    
    /**
     * @param unit
     */
    
    public ECore2Kermeta(EcoreUnit unit) {
        super();
        this.unit = unit;
    }
    
    // table of types : EType -> FType
    protected Hashtable types = new Hashtable();
    
    protected Stack current_pack = new Stack();
    protected FClassDefinition current_classdef;
    protected FEnumeration current_enum;
    protected FOperation current_op;
    
    protected FPackage getCurrentPackage() {
        return (FPackage)current_pack.peek();
    }
    
    protected void acceptList(EList l) {
        Iterator it = l.iterator();
        while (it.hasNext()) {
            EObject o = (EObject)it.next();
            this.accept(o);
        }
    }
    
    public Object visit(EPackage node) {
        FPackage pack = unit.packageLookup(getQualifiedName(node));
        if (pack == null) {
            pack = unit.struct_factory.createFPackage();
            pack.setFName(node.getName());
            pack.setFUri(node.getNsURI());
            if (getCurrentPackage() != null)
                pack.setFNestingPackage(getCurrentPackage());
            else
                unit.rootPackage = pack;
            unit.packages.put(getQualifiedName(node), pack);
        }
        
        current_pack.push(pack);
        
        acceptList(node.getEClassifiers());
        acceptList(node.getESubpackages());
        
        current_pack.pop();
        
        return pack;
    }
    
    public Object visit(EClass node) {
        
        FTypeDefinition td = unit.typeDefinitionLookup(getQualifiedName(node));
        if (td != null) {
            unit.error.add(new KMUnitError("Duplicate definition of type " + getQualifiedName(node), td));
        }
        
        current_classdef = unit.struct_factory.createFClassDefinition();
        current_classdef.setFName(node.getName());
        current_classdef.setFIsAbstract(node.isAbstract() || node.isInterface());
        
        getCurrentPackage().getFOwnedTypeDefinition().add(current_classdef);
        
        // set super types
        Iterator it = node.getEAllSuperTypes().iterator();
        while (it.hasNext()) {
            FType t = (FType)types.get(it.next());
            if (t == null || !(t instanceof FClass)) {
                throw new Error("Internal error of ecore2kermeta transfo : supertypes of class " + getQualifiedName(node) + " not found");
            }
            current_classdef.getFSuperType().add(t);
        }
        
        // properties and operations:
        acceptList(node.getEStructuralFeatures());
        
        unit.typeDefs.put(getQualifiedName(node), current_classdef);
        
        return current_classdef;
    }
    
    public Object visit(EAttribute node) {
       FProperty prop = unit.struct_factory.createFProperty();
       
       prop.setFName(node.getName());
       prop.setFIsComposite(true);
       
       prop.setFIsOrdered(node.isOrdered());
       prop.setFIsUnique(node.isUnique());
       prop.setFUpper(node.getUpperBound());
       prop.setFLower(node.getLowerBound());
       
       prop.setFDefault(node.getDefaultValueLiteral());
       
       prop.setFIsDerived(node.isDerived());
       prop.setFIsID(node.isID());
       
       prop.setFOwningClass(current_classdef);
       
       FType t = (FType)types.get(node.getEType());
       if (t == null || !(t instanceof FClass)) {
           throw new Error("Internal error of ecore2kermeta transfo : type of property " + getQualifiedName(node) + " not found");
       }
       prop.setFType(t);
       
       return prop;
    }
    
    /**
     * Properties indexed by their qualified names
     * used to set opposites
     */
    private Hashtable properties = new Hashtable();
    
    public Object visit(EReference node) {
        FProperty prop = (FProperty)properties.get(getQualifiedName(node));
        if (prop == null) {
            prop = unit.struct_factory.createFProperty();
            properties.put(getQualifiedName(node), prop);
        }
        
        prop.setFName(node.getName());
        prop.setFIsComposite(node.isContainment());
        
        prop.setFIsOrdered(node.isOrdered());
        prop.setFIsUnique(node.isUnique());
        prop.setFUpper(node.getUpperBound());
        prop.setFLower(node.getLowerBound());
        
        prop.setFDefault(node.getDefaultValueLiteral());
        
        prop.setFIsDerived(node.isDerived());
        prop.setFIsID(false);
        
        prop.setFOwningClass(current_classdef);
        
        FType t = (FType)types.get(node.getEType());
        if (t == null || !(t instanceof FClass)) {
            throw new Error("Internal error of ecore2kermeta transfo : type of property " + getQualifiedName(node) + " not found");
        }
        prop.setFType(t);
        
        if (node.getEOpposite() != null) {
            FProperty oprop = (FProperty)properties.get(getQualifiedName(node.getEOpposite()));
            if ( oprop == null) {
                oprop = unit.struct_factory.createFProperty();
                properties.put(getQualifiedName(node.getEOpposite()), oprop);
            }
            prop.setFOpposite(oprop);
        }
        
        return prop;
    }
    
    public Object visit(EOperation node) {
        // TODO Auto-generated method stub
        return super.visit(node);
    }
    
    public Object visit(EAnnotation node) {
        // TODO Auto-generated method stub
        return super.visit(node);
    }


    public Object visit(EDataType node) {
        // TODO Auto-generated method stub
        return super.visit(node);
    }
    public Object visit(EEnum node) {
        // TODO Auto-generated method stub
        return super.visit(node);
    }
    public Object visit(EEnumLiteral node) {
        // TODO Auto-generated method stub
        return super.visit(node);
    }
    
    
    
    public Object visit(EParameter node) {
        // TODO Auto-generated method stub
        return super.visit(node);
    }
    
    
    public String getQualifiedName(ENamedElement e) {
        if (e.eContainer() instanceof ENamedElement) 
            return getQualifiedName((ENamedElement)e.eContainer()) + "::" + e.getName();
        else return e.getName();
    }
    
}
