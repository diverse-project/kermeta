/* $Id: KMTBodiesHandler.java,v 1.1 2005-02-21 15:25:24 zdrey Exp $
 * Created on Feb 21, 2005
 * Author : zdrey
 * Description : describe here your class role
 * TODO : 
 * move KMTBodies*.java in io.loader package
 */
package fr.irisa.triskell.kermeta.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.impl.URIConverterImpl;

import fr.irisa.triskell.kermeta.exporter.kmt.KM2KMTPrettyPrinter;
import fr.irisa.triskell.kermeta.loader.KermetaLoader;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.loader.expression.OperationBodyLoader;

/**
 * @author zdrey
 * Description
 */
public class KMTBodiesHandler {

    protected OperationBodyLoader bodyLoader;
    protected KermetaUnit unit;
    protected String kmtbodies_dir;
    protected KM2KMTPrettyPrinter pp; 
    protected static String PKG_PREFIX = "package";
    protected static String CLASS_PREFIX = "class";
    protected static String SUFFIX = ".kmtbodies";
    
    /**
     * @param dir : the directory that contains the kmtbodies file on which we work with.
     */
    public KMTBodiesHandler(String dir) {

        kmtbodies_dir = dir;
        bodyLoader = new OperationBodyLoader();
        KM2KMTPrettyPrinter pp = new KM2KMTPrettyPrinter();
    }
    
    public void extractAndInjectForPackageFromFiles(String source_kmt, String target_kmt, String pkg_str)
    {
        // get the kermeta mmodel from file spec. by source_kmt
        KermetaUnit source_unit = KermetaLoader.getDefaultLoader().load(source_kmt);
        // get the kermeta model in which we want to inject
        KermetaUnit target_unit = KermetaLoader.getDefaultLoader().load(target_kmt);
        // extract from one to another
        extractAndInject(PKG_PREFIX, source_unit, target_unit, pkg_str);
        
    }
    
    /**
     * Extract methods/op bodies from the given kermeta unit, for the given package_qname
     * and put them in the target unit.
     * Generate a new File containing the whole KermetaUnit with the "injected" operations for all classes
     * of qname if elt_type is a package, and only the operation of the class qname if elt_type is a class.
     * @param elt_type : class, package, are to kind elements that can be given
     * @param source file from which bodies are extracted
     * @param target file in which bodies are reinjected
     * 
     */
    public KermetaUnit extractAndInject(String elt_type, KermetaUnit source_unit, KermetaUnit target_unit, String qname) {
        
        // Set a name for the extern bodies file
        String kmtb_filename = setKMTBodiesFilename(elt_type, qname);
        // extract
        KMTBodiesExtractor extractor = new KMTBodiesExtractor(source_unit);
        
        if (elt_type.equals(PKG_PREFIX))
            extractor.extractFromPackage(source_unit.packageLookup(qname), kmtb_filename);
        /*if (elt_type.equals(CLASS_PREFIX))
            extractor.visit(source_unit.getTypeDefinitionByName(qname));
            */
        
        // inject : read from source_uri
        bodyLoader.load(target_unit, kmtb_filename);
        return target_unit;
    }
    
    /**
     * Get the method in the target file from the given method name in the source extern-file
     * @param methodName
     */
    public void exportKM2KMT(KermetaUnit unit, String target_pkg, String target_file) {
        // Create the target_file.kmt module
		pp.ppPackage(unit.packageLookup(target_pkg), new File(target_file));     
    }
    
    public String setKMTBodiesFilename(String prefix, String qname)
    {
        return kmtbodies_dir + "/" + prefix + "_" + qname + SUFFIX;
    }

}
