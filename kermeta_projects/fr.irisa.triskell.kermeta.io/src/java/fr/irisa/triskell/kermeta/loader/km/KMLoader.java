/*
 * Created on 10 févr. 2005
 * By Franck FLEUREY (ffleurey@irisa.fr)
 * 
 */
package fr.irisa.triskell.kermeta.loader.km;

import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.structure.FClassDefinition;
import fr.irisa.triskell.kermeta.structure.FEnumeration;
import fr.irisa.triskell.kermeta.structure.FPackage;
import fr.irisa.triskell.kermeta.structure.FPrimitiveType;
import fr.irisa.triskell.kermeta.visitor.KermetaVisitor;

/**
 * @author Franck Fleurey
 * IRISA / University of Rennes 1 (France)
 * Distributed under the terms of the GPL licence
 * 
 */
public class KMLoader extends KermetaVisitor {

    protected KermetaUnit unit;
    
    /**
     * @param unit
     */
    public KMLoader(KermetaUnit unit) {
        super();
        this.unit = unit;
    }
    
    public Object visit(FClassDefinition node) {
        unit.typeDefs.put(unit.getQualifiedName(node), node);
        return null;
    }
    public Object visit(FEnumeration node) {
        unit.typeDefs.put(unit.getQualifiedName(node), node);
        return null;
    }
    public Object visit(FPackage node) {
        if (unit.rootPackage == null) {
            unit.rootPackage = node;
        }
        unit.packages.put(unit.getQualifiedName(node), node);
        return super.visit(node);
    }
    public Object visit(FPrimitiveType node) {
        unit.typeDefs.put(unit.getQualifiedName(node), node);
        return null;
    }
}
