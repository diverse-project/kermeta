/* $Id: KMTBodiesExtractor.java,v 1.11 2007-08-02 09:25:27 dvojtise Exp $
 * Created on Feb 17, 2005
 * Author : zdrey@irisa.fr
 * License : EPL
 * Description : contains the BodyExtractor which extracts the operations/properties
 * and their body and write them into an external file
 */
package fr.irisa.triskell.kermeta.dev.framework;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.kermeta.io.KermetaUnit;
import org.kermeta.io.printer.KM2KMTPrettyPrinter;


import fr.irisa.triskell.kermeta.language.behavior.Expression;

import fr.irisa.triskell.kermeta.language.structure.Operation;
import fr.irisa.triskell.kermeta.language.structure.Property;
import fr.irisa.triskell.kermeta.modelhelper.NamedElementHelper;

import fr.irisa.triskell.kermeta.visitor.KermetaVisitor;

/**
 * @author zdrey
 *
 */
public class KMTBodiesExtractor extends KermetaVisitor {
	
	/**File where to store the external kmtbodies */
    String KMTBODIES_DIR = "kmtbodies/";
	protected File kmtbodies_file ;
	protected FileWriter w;
	protected KermetaUnit unit;
	/**To pretty print the body of visited operations/properties*/
	protected KM2KMTPrettyPrinter pprinter;
	
	/**
	 * Constructor
	 * @param u : the kermetaUnit : we need it to construct Ftags and an Emptybody
	 * @param kmtb_filename : <file>.kmtbodies to create
	 */
	public KMTBodiesExtractor(KermetaUnit u, String kmtb_filename) {
		super();
		kmtbodies_file = createKMTBodiesFile(kmtb_filename);
		unit = u;
		pprinter = new KM2KMTPrettyPrinter();
		try {
			w = new FileWriter(kmtbodies_file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * visit a property : get its "qualified name" and its body
	 */
	public Object visit(Property property)
	{
		String opHeader = "$"; // $package::class::
		opHeader += NamedElementHelper.getQualifiedName(property.getOwningClass());
		opHeader += "::"+property.getName();
		
		String setter = opHeader + "::setter";
		// prettyprint setter content
		Expression sbody = property.getSetterBody();
		if (sbody !=null)
			setter += "\n"+(String)pprinter.accept(sbody);
		
		String getter = opHeader + "::getter";
		// prettyprint getter content
		if (property.getGetterBody()!=null)
			getter += "\n"+(String)pprinter.accept(sbody);
		
		System.out.println(setter+"\n"+getter);
		
		String ops = setter+"\n\n"+getter+"\n\n"; 
		
		// Write in file
		try
		{
			w.write(ops);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
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
		    op += "$"+NamedElementHelper.getQualifiedName(operation.getOwningClass());
		    op += "::"+operation.getName();
		    System.out.println(op);
		    if (operation.getBody()!=null)
		        op += "\n"+(String)pprinter.accept(operation.getBody());
		    
		    // Write in file
		    try
		    {
		        w.write(op+"\n");
		    } catch (IOException e) {
		        e.printStackTrace();
		    }
		}
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
	 * Create the kmtbodies file from specified filename
	 * @param filename
	 * @return
	 */
	protected File createKMTBodiesFile(String filename)
	{
	    File dir = new File(KMTBODIES_DIR);
	    if (!dir.exists())
	    {
	        dir.mkdir();
	    }
		String[] listdir = dir.list();
		int save_i = 0;
		
		for (int i=0; i < listdir.length; i++)
		{
			if (listdir[i].startsWith(filename))
			{
				save_i += 1 ;
			}
		}
		if (new File(KMTBODIES_DIR+filename).exists())
		{
			File oldf = new File(KMTBODIES_DIR+filename);
			File newf = new File(KMTBODIES_DIR+filename+".bak."+(save_i+1));
			oldf.renameTo(newf);
		}
	
		return new File(KMTBODIES_DIR+filename);
		
	}
	
}















