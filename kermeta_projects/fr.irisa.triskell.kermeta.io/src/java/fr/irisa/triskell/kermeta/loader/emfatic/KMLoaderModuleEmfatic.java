/*
 * Created on 10 févr. 2005
 * By Franck FLEUREY (ffleurey@irisa.fr)
 * 
 */
package fr.irisa.triskell.kermeta.loader.emfatic;

import java.io.IOException;
import java.io.InputStreamReader;


import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.impl.URIConverterImpl;

import com.ibm.eclipse.emfatic.core.parser.EmfaticLexer;
import com.ibm.eclipse.emfatic.core.parser.EmfaticParser;

import fr.irisa.triskell.kermeta.loader.KMUnitError;
import fr.irisa.triskell.kermeta.loader.KermetaLoaderModule;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;

/**
 * @author Franck Fleurey
 * IRISA / University of Rennes 1 (France)
 * Distributed under the terms of the GPL licence
 * 
 */
public class KMLoaderModuleEmfatic extends KermetaLoaderModule {

    /**
     * 
     */
    public KMLoaderModuleEmfatic() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see fr.irisa.triskell.kermeta.loader.KermetaLoaderModule#load(metacore.builder.MetaCoreUnit, java.lang.String)
     */
    public boolean load(KermetaUnit unit, String str_uri) {
        URI uri = URI.createURI(str_uri);
        URIConverter converter = new URIConverterImpl();
        
        ECore2KMPass pass;
		com.ibm.eclipse.emfatic.core.ast.CompUnit u = null;
		EmfaticParser p;
		
		try {
            p = new EmfaticParser(new EmfaticLexer(new InputStreamReader(converter.createInputStream(uri))));
        } 
		catch (IOException e1) {
            unit.error.add(new KMUnitError("i/o error loading ressource '"+str_uri+"': " + e1, null));
            return false;
		}
		
		try {
			u = p.compUnit();
		}
		catch(Exception e) {
		    unit.error.add(new KMUnitError("Parse error : " + e, null));
		    return false;
		}
		if ( u == null) {
			unit.error.add(new KMUnitError("Unknown parse error " , null));
			return false;
		}
		pass = new ECore2KMPass1(unit);	u.accept(pass);	if (unit.getError().size() > 0) return false;
		pass = new ECore2KMPass2(unit);	u.accept(pass);	if (unit.getError().size() > 0) return false;
		pass = new ECore2KMPass3(unit);	u.accept(pass);	if (unit.getError().size() > 0) return false;
		pass = new Ecore2KMPass4(unit); u.accept(pass); if (unit.getError().size() > 0) return false;
		return true;
		
    }

}
