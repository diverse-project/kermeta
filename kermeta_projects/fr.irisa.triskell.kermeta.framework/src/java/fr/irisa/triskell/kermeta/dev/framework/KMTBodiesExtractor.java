/*
 * Created on Feb 17, 2005
 * Author : zdrey@irisa.fr
 * License : GPL
 * Description : contains the BodyExtractor which extracts the operations/properties
 * and their body and write them into an external file
 */
package fr.irisa.triskell.kermeta.dev.framework;

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
import fr.irisa.triskell.kermeta.structure.FProperty;
import fr.irisa.triskell.kermeta.structure.FTypeDefinition;
import fr.irisa.triskell.kermeta.visitor.KermetaVisitor;

/**
 * @author zdrey
 *
 */
public class BodyExtractor extends KermetaVisitor {
	
	/**File where to store the external mctbodies */
	protected File mctbodies_file ;
	protected FileWriter w;
	protected KermetaUnit unit;
	protected FTypeDefinition dclass;
	/**To pretty print the body of visited operations/properties*/
	protected KM2KMTPrettyPrinter pprinter;
	
	/**
	 * Constructor
	 */
	public BodyExtractor(KermetaUnit unit, File file) {
		super();
		mctbodies_file = file;
		
		try {
			w = new FileWriter(mctbodies_file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		this.unit = unit;
		pprinter = new KM2KMTPrettyPrinter();
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
		
		// Write in file
		try
		{
			w.write(ops);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return ops;
	}
	
	/**
	 * visit an operation : get its "qualified name" and its body
	 */
	public Object visit(FOperation operation)
	{
		String op = "$";
		
		op += unit.getQualifiedName(operation.getFOwningClass());
		op += "::"+operation.getFName();
		System.out.println(op);
		if (operation.getFBody()!=null)
			op += "\n"+(String)pprinter.accept(operation.getFBody());
		
		// Write in file
		try
		{
			w.write(op+"\n");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return op;
		
	}
	
	/**
	 * @return The file writer where we write mctbodies 
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
	
}















