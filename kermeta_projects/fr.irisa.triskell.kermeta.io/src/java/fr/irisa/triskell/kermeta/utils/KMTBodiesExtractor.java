/* $Id: KMTBodiesExtractor.java,v 1.3 2005-02-22 14:34:00 zdrey Exp $
 * Created on Feb 17, 2005
 * Author : zdrey@irisa.fr
 * License : GPL
 * Description : contains the BodyExtractor which extracts the operations/properties
 * and their body and write them into an external file
 * Todo : 
 * 	* Change all dirty paths to URIs
 */
package fr.irisa.triskell.kermeta.utils;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import fr.irisa.triskell.kermeta.behavior.FExpression;
import fr.irisa.triskell.kermeta.exporter.kmt.KM2KMTPrettyPrinter;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.structure.FClassDefinition;
import fr.irisa.triskell.kermeta.structure.FOperation;
import fr.irisa.triskell.kermeta.structure.FPackage;
import fr.irisa.triskell.kermeta.structure.FProperty;
import fr.irisa.triskell.kermeta.structure.FTypeDefinition;
import fr.irisa.triskell.kermeta.visitor.KermetaVisitor;

/**
 * @author zdrey
 *
 */
public class KMTBodiesExtractor extends KermetaVisitor {
	
	/**File where to store the external kmtbodies */
    protected static String KMTBODIES_DIR = "kmtbodies/";
    /**Dir. where to store the kmtbodies directory*/
    protected String rootDir = "./";
	protected File kmtbodies_file ;
	protected FileWriter w;
	protected KermetaUnit unit;
	/**To pretty print the body of visited operations/properties*/
	protected KM2KMTPrettyPrinter pprinter;
	protected String kmtbodies;
	
	/**
	 * Constructor
	 * @param u : the kermetaUnit : we need it to construct Ftags and an Emptybody
	 * @param kmtb_filename : <file>.kmtbodies to create
	 */
	public KMTBodiesExtractor(KermetaUnit u) {
		super();
		kmtbodies = "";
		unit = u;
		pprinter = new KM2KMTPrettyPrinter();
	}
	
	/**
	 * Extract bodies from package pkg and output them into a file (file)
	 * @param pkg
	 * @param basename : basename of the file (directory is "controlled" through
	 * rootDir attribute, and static KMTBODIES_DIR : which is a mandatory directory
	 * inside which users must store its kmtbodies) 
	 */
	public void extractFromPackage(FPackage pkg, String basename)
	{
	    super.visit(pkg);
	    writeKMTBodies(basename);
	}
	
	/**
	 * visit a property : get its "qualified name" and its body
	 */
	public Object visit(FProperty property)
	{
		String opHeader = "$"; // $package::class::
		opHeader += unit.getQualifiedName(property.getFOwningClass());
		opHeader += "::"+property.getFName();
		
		String setter = opHeader + "::setter";
		// prettyprint setter content
		FExpression sbody = property.getFSetterbody();
		if (property.getFSetterbody()!=null)
			setter += "\n"+(String)pprinter.accept(property.getFSetterbody());
		
		String getter = opHeader + "::getter";
		// prettyprint getter content
		if (property.getFGetterbody()!=null)
			getter += "\n"+(String)pprinter.accept(property.getFGetterbody());
		
		System.out.println(setter+"\n"+getter);
		
		String ops = setter+"\n\n"+getter+"\n\n"; 
		
		kmtbodies += ops;
		return ops;
	}
	
	/**
	 * visit an operation : get its "qualified name" and its body
	 */
	public Object visit(FOperation operation)
	{
		String op = "";
		
		if (!operation.isFIsAbstract())
		{
		    op += "$"+unit.getQualifiedName(operation.getFOwningClass());
		    op += "::"+operation.getFName();
		    System.out.println(op);
		    if (operation.getFBody()!=null)
		        op += "\n"+(String)pprinter.accept(operation.getFBody());
		}
		kmtbodies += op+"\n";
		return op;
		
	}
	
	/**
	 * @return The file writer where we write kmtbodies 
	 */
	public FileWriter getWriter()
	{
		return w;
	}
	
	/**
	 * Get the getter body of the specified property
	 * @param property
	 * @return
	 * to remove
	 */
	public String getPropertyBody(FProperty property)
	{
	    FExpression gbody = property.getFGetterbody();
		// pprinter gbody;

		
		return null;
	}
	
	/**
	 * Create the kmtbodies file from specified filename
	 * @param filename
	 * @return
	 */
	protected File createKMTBodiesFile(String filename)
	{
	    File dir = new File(rootDir+KMTBODIES_DIR);
	    if (!dir.exists())
	    {
	        dir.mkdir();
	    }
	    return backupFile(rootDir+KMTBODIES_DIR, filename);
	}
	
	protected File backupFile(String backupdir, String filename)
	{
	    File dir = new File(backupdir);
	    File newf = null;
	    String[] listdir = dir.list();
	    int save_i = 0;
	    for (int i=0; i < listdir.length; i++)
	    {
	        if (listdir[i].startsWith(filename))
	        {
	            save_i += 1 ;
	        }
	    }
	    
	    String filepath = backupdir+"/"+filename; // fixme : use java facilities
	    File oldf = new File(filepath);
	    
	    if (oldf.exists())
	    {
	        newf = new File(filepath+".bak."+(save_i+1));
	        oldf.renameTo(newf);
	    }
	    return oldf;
	}
	
	
	public void writeKMTBodies(String kmtb_filename)
	{
	    kmtbodies_file = createKMTBodiesFile(kmtb_filename);
		try {
			w = new FileWriter(kmtbodies_file);
			w.write(kmtbodies);
		    w.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void setRootDir(String rootdir)
	{
	    rootDir = rootdir+"/";
	}
	
	public String getRootDir()
	{
	    return rootDir;
	}
	
	/** Returns the "complete" path of the directory KMTBodies (rootDir+KMTBODIES_DIR) */
	public String getCompleteKMTBodiesDir()
	{
	    return rootDir+"/"+KMTBODIES_DIR;
	}
	
}















