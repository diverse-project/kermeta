/*
 * Created on 10 févr. 2005
 * By Franck FLEUREY (ffleurey@irisa.fr)
 * 
 */
package fr.irisa.triskell.kermeta.loader.kmt;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.impl.URIConverterImpl;

import fr.irisa.triskell.kermeta.ast.CompUnit;
import fr.irisa.triskell.kermeta.loader.KMUnitError;
import fr.irisa.triskell.kermeta.loader.KMUnitParseError;
import fr.irisa.triskell.kermeta.loader.KermetaLoaderModule;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.parser.KermetaLexer;
import fr.irisa.triskell.kermeta.parser.KermetaParser;


/**
 * @author Franck Fleurey
 * IRISA / University of Rennes 1 (France)
 * Distributed under the terms of the GPL licence
 * 
 */
public class KMLoaderModuleMCT extends KermetaLoaderModule {

    public KMLoaderModuleMCT() {
        super();
    }

    /**
     * @see fr.irisa.triskell.kermeta.loader.KermetaLoaderModule#load(metacore.builder.MetaCoreUnit, java.lang.String)
     */
    public boolean load(KermetaUnit unit, String str_uri) {
        URI uri = URI.createURI(str_uri);
        URIConverter converter = new URIConverterImpl();
        
        KMT2KMPass pass;
		CompUnit u = null;
		KermetaParser p;
		
		try {
            p = new KermetaParser(new KermetaLexer(new InputStreamReader(converter.createInputStream(uri))));
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
		pass = new KMT2KMPass1(unit); u.accept(pass); if (unit.getError().size() > 0) return false;
		pass = new KMT2KMPass2(unit); u.accept(pass); if (unit.getError().size() > 0) return false;
		pass = new KMT2KMPass3(unit); u.accept(pass); if (unit.getError().size() > 0) return false;
		pass = new KMT2KMPass4(unit); u.accept(pass); if (unit.getError().size() > 0) return false;
		pass = new KMT2KMPass5(unit); u.accept(pass); if (unit.getError().size() > 0) return false;
		pass = new KMT2KMPass6(unit); u.accept(pass); if (unit.getError().size() > 0) return false;
		
		return true;
    }
    
    public boolean loadFromString(KermetaUnit unit, String str_uri, String document) {
        URI uri = URI.createURI(str_uri);
        URIConverter converter = new URIConverterImpl();
        
        KMT2KMPass pass;
		CompUnit u = null;
		KermetaParser p;
		
		try {
            p = new KermetaParser(new KermetaLexer(new StringReader(document)));
        } 
		catch (Exception e1) {
            unit.error.add(new KMUnitError("i/o error loading ressource '"+str_uri+"': " + e1, null));
            return false;
		}
		
		try {
			u = p.compUnit();
		}
		catch(Exception e) {
		    unit.error.add(new KMUnitParseError(e));
		    return false;
		}
		pass = new KMT2KMPass1(unit); u.accept(pass); 
		pass = new KMT2KMPass2(unit); u.accept(pass); 
		pass = new KMT2KMPass3(unit); u.accept(pass);
		pass = new KMT2KMPass4(unit); u.accept(pass); 
		pass = new KMT2KMPass5(unit); u.accept(pass); 
		pass = new KMT2KMPass6(unit); u.accept(pass); 
		if (unit.getError().size() > 0) return false;
		
		return true;
		
        
    }

}
