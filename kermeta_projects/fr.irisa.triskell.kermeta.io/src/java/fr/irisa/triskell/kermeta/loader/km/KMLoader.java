/*
 * Created on 10 févr. 2005
 * By Franck FLEUREY (ffleurey@irisa.fr)
 * 
 */
package fr.irisa.triskell.kermeta.loader.km;

import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.Enumeration;
import fr.irisa.triskell.kermeta.language.structure.Package;
import fr.irisa.triskell.kermeta.language.structure.PrimitiveType;
import fr.irisa.triskell.kermeta.modelhelper.NamedElementHelper;
import fr.irisa.triskell.kermeta.visitor.KermetaVisitor;

/**
 * @author Franck Fleurey
 * IRISA / University of Rennes 1 (France)
 * Distributed under the terms of the GPL licence
 * 
 * This is a visitor that registers all the Class definitions, Enumerations, and Packages in the
 * KermetaUnit. Used in the preLoad() method of KermetaUnit. 
 */
public class KMLoader extends KermetaVisitor {

    protected KermetaUnit unit;
    
    /**
     * 
     * @param unit
     */
    public KMLoader(KermetaUnit unit) {
        super();
        this.unit = unit;
    }
    
    public Object visit(ClassDefinition node) {
        unit.typeDefs.put(NamedElementHelper.getQualifiedName(node), node);
        return null;
    }
    public Object visit(Enumeration node) {
        unit.typeDefs.put(NamedElementHelper.getQualifiedName(node), node);
        return null;
    }
    public Object visit(Package node) {
        if (unit.rootPackage == null) {
            unit.rootPackage = node;
        }
        unit.packages.put(NamedElementHelper.getQualifiedName(node), node);
        return super.visit(node);
    }
    public Object visit(PrimitiveType node) {
        unit.typeDefs.put(NamedElementHelper.getQualifiedName(node), node);
        return null;
    }
}
