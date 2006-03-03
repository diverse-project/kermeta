/* $Id: KMTBodiesHandler.java,v 1.6 2006-03-03 15:22:19 dvojtise Exp $
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
import java.util.Hashtable;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.impl.URIConverterImpl;

import fr.irisa.triskell.kermeta.exporter.kmt.KM2KMTPrettyPrinter;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.loader.KermetaUnitFactory;

/**
 * @author zdrey
 * Description
 */
public class KMTBodiesHandler {

    /** The class containing the method to load operation */
    protected OperationBodyLoader bodyLoader;
    /** The directory where one can find kmtbodies (a/path/+"kmtbodies") */
    protected String kmtbodies_dir;
    /** A pretty printer to extract the bodies and "copy"(inject) them in the target unit*/
    protected KM2KMTPrettyPrinter pp; 
    /** A set of static strings ..*/
    protected static String PKG_PREFIX = "package";
    protected static String CLASS_PREFIX = "class";
    protected static String SUFFIX = ".kmtbodies";
    protected static String ARCH_DIR = "kmt_archives";
    
    /**
     * @param dir : the directory that contains the kmtbodies file on which we work with.
     */
    public KMTBodiesHandler(String dir) {

        kmtbodies_dir = dir;
        bodyLoader = new OperationBodyLoader();
        pp = new KM2KMTPrettyPrinter();
    }
    
    /**
     * Extract bodies from source_kmt file (in pkg_str) and inject them in target_kmt file
     * @param source_kmt
     * @param target_kmt
     * @param pkg_str
     */
    public void extractAndInjectForPackageFromFiles(String source_kmt, String target_kmt, String pkg_str)
    {
        // get the kermeta mmodel from file spec. by source_kmt
        KermetaUnit source_unit = KermetaUnitFactory.getDefaultLoader().createKermetaUnit(source_kmt, new Hashtable());
        source_unit.load();
        // get the kermeta model in which we want to inject
        KermetaUnit target_unit = KermetaUnitFactory.getDefaultLoader().createKermetaUnit(target_kmt, new Hashtable());
        
        // extract from one to another
        this.extractAndInject(PKG_PREFIX, source_unit, target_unit, pkg_str);
        
        // load the target unit so that we can pretty print its content from its root package...
        target_unit.load();
        
        // archivate the target_kmt before modifying it
        String rootpkgstr = target_unit.rootPackage.getName();
        
        // save new injected-file, and archive former ones
        File dir = new File(ARCH_DIR);
	    if (!dir.exists()) 
	        dir.mkdir();
        exportKM2KMT(target_unit, rootpkgstr, target_kmt);
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
        // Create the extractor
        KMTBodiesExtractor extractor = new KMTBodiesExtractor(source_unit);
        extractor.setRootDir(kmtbodies_dir); // directory in which we work
        if (elt_type.equals(PKG_PREFIX))
            extractor.extractFromPackage(source_unit.packageLookup(qname), kmtb_filename);
        /*if (elt_type.equals(CLASS_PREFIX))
            extractor.visit(source_unit.getTypeDefinitionByName(qname));
            */

        // We want to archive the target unit before modifying it.
        
        // Inject : read from kmtb_filename the bodies
        // FIXME : work with URI, refactor extractor? (put it in the handler?)
        bodyLoader.load(target_unit, extractor.getCompleteKMTBodiesDir()+"/"+kmtb_filename);
        return target_unit;
    }
    
    /**
     * export the kermeta <b>unit</b> to the file specified by target_file.
     * @param unit the kermeta unit to save
     * @param target_pkg the package from which we begin the export (usually, should be 
     * the rootPackage) 
     * @param target_file : the target filepath in which we save the kermeta unit
     */
    public void exportKM2KMT(KermetaUnit unit, String target_pkg, String target_file) {
        // Create the target_file.kmt module
        KMTBodiesExtractor extractor = new KMTBodiesExtractor(unit);
        BackupHelper.backupFile(ARCH_DIR, target_file); //fixme
        unit.load();
        pp.ppPackage(unit.packageLookup(target_pkg), new File(target_file));
        
        

        
    }
    
    /**
     * @param prefix : "package" or "class" (usually, package). Use class if operations of only one 
     * one class are written in this kmtbodies file
     * @param qname the qualified name of the package or class in which we injected 
     * @return a appropriate name for the &lt;file&gt;.kmtbodies...
     */
    public String setKMTBodiesFilename(String prefix, String qname)
    {
        return prefix + "_" + qname + SUFFIX;
    }

}
