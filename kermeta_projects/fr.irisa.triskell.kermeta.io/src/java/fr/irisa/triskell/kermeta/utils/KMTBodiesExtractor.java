/* $Id: KMTBodiesExtractor.java,v 1.5 2006-03-03 15:22:19 dvojtise Exp $
 * Created on Feb 17, 2005
 * Author : zdrey@irisa.fr
 * License : GPL
 * Description : 
 * 		contains the BodyExtractor which extracts the operations/properties
 * 		and their body and write them into an external file
 * TODO : 
 * 	* Handle filepaths correctly (use URIs..)
 */
package fr.irisa.triskell.kermeta.utils;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


import fr.irisa.triskell.kermeta.language.behavior.Expression;
import fr.irisa.triskell.kermeta.exporter.kmt.KM2KMTPrettyPrinter;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.language.structure.Operation;
import fr.irisa.triskell.kermeta.language.structure.Package;
import fr.irisa.triskell.kermeta.language.structure.Property;
import fr.irisa.triskell.kermeta.visitor.KermetaVisitor;

/**
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
	public void extractFromPackage(Package pkg, String basename)
	{
	    super.visit(pkg);
	    writeKMTBodies(basename);
	}
	
	/**
	 * visit a property : get its "qualified name" and its body
	 */
	public Object visit(Property property)
	{
		String opHeader = "$"; // $package::class::
		opHeader += unit.getQualifiedName(property.getOwningClass());
		opHeader += "::"+property.getName();
		
		String setter = opHeader + "::setter";
		// prettyprint setter content
		Expression sbody = property.getSetterBody();
		if (property.getSetterBody()!=null)
			setter += "\n"+(String)pprinter.accept(property.getSetterBody());
		
		String getter = opHeader + "::getter";
		// prettyprint getter content
		if (property.getGetterBody()!=null)
			getter += "\n"+(String)pprinter.accept(property.getGetterBody());
		
		System.out.println(setter+"\n"+getter);
		
		String ops = setter+"\n\n"+getter+"\n\n"; 
		
		kmtbodies += ops;
		return ops;
	}
	
	/**
	 * visit an operation : get its "qualified name" and its body
	 */
	public Object visit(Operation operation)
	{
		String op = "";
		
		if (!operation.isIsAbstract())
		{
		    op += "$"+unit.getQualifiedName(operation.getOwningClass());
		    op += "::"+operation.getName();
		    System.out.println(op);
		    if (operation.getBody()!=null)
		        op += "\n"+(String)pprinter.accept(operation.getBody());
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
	public String getPropertyBody(Property property)
	{
	    Expression gbody = property.getGetterBody();
		// pprinter gbody;

		
		return null;
	}
	
	/**
	 * Create the kmtbodies file from specified filename
	 * @param filename
	 * @return a new filepath corresponding to the kmtbodies file location
	 */
	protected File createKMTBodiesFile(String filename)
	{
	    File dir = new File(rootDir+File.separator+KMTBODIES_DIR);
	    if (!dir.exists())
	    {
	        dir.mkdir();
	    }
	    BackupHelper.backupFile(rootDir+KMTBODIES_DIR, filename);
	    return new File(rootDir+File.separator+KMTBODIES_DIR+File.separator+filename);
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
	    return rootDir+File.separator+KMTBODIES_DIR;
	}
	
}















