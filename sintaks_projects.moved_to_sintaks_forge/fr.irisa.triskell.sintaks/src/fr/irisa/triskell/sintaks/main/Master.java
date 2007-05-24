package fr.irisa.triskell.sintaks.main;

import java.io.PrintStream;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Shell;

import sts.Template;

import fr.irisa.triskell.sintaks.parser.MetaModelParser;
import fr.irisa.triskell.sintaks.parser.ModelParser;
import fr.irisa.triskell.sintaks.parser.ModelPrinter;
import fr.irisa.triskell.sintaks.SintaksPlugin;
import fr.irisa.triskell.sintaks.subject.ModelSubject;


/**
 * @author dtouzet
 *
 */
public class Master {
	
    private ModelParser parser;
	private ModelSubject subject;
	private ModelPrinter printer;
	private ResourceSet resSet;
    
	/**
	 * @param mmFile
	 */
	public Master() {
		this.resSet  = new ResourceSetImpl();
		this.parser  = null;
		this.printer = null;
		this.subject = null;
	}
	
	
	
	//////////////////////////////////////////
	//////////////////////////////////////////
	//		Transformation Mechanism		//
	//////////////////////////////////////////
	//////////////////////////////////////////

    /**
     * @param inputFile
     * @param outputFile
     * @param ruleFile
     */
    public EObject getModelFromText(String text, String ruleFile) {
    	this.subject = new ModelSubject (new MetaModel(resSet));
		this.parser  = new ModelParser (new MetaModelParser(resSet), subject);
		try {
			boolean ok = this.parse(ruleFile, text);
            if ( ! ok ) 
            	return null;
 
            this.relink();
            return subject.getModel();
 		}
		catch (Exception e) {
			e.printStackTrace();
			SintaksPlugin.log(e);
		}
		return null;
    }
	
	//////////////////////////////////////////////
	//////////////////////////////////////////////
	//		End of Transformation Mechanism		//
	//////////////////////////////////////////////
	//////////////////////////////////////////////

    
    
    //////////////////////////////////
    //////////////////////////////////
    //		Parsing Mechanism		//
    //////////////////////////////////
    //////////////////////////////////

	/**
	 * @param ruleFile
	 * @param inputFile
	 * @return
	 */
	private boolean parse (String ruleFile, String text) {
        boolean ok = parser.parse(ruleFile, text);
        return ok;
	}

	/**
	 * @param ruleFile
	 * @param inputFile
	 * @return
	 */
	private boolean parse (String ruleFile, IFile inputFile) {
        if (SintaksPlugin.getDefault().getOptionManager().isDebugProcess())
        	SintaksPlugin.getDefault().debugln("Parsing file: " + inputFile.getName());
        boolean ok = parser.parse(ruleFile, inputFile);
        if (SintaksPlugin.getDefault().getOptionManager().isDebugProcess())
        	SintaksPlugin.getDefault().debugln("Parse finished");
        return ok;
	}
    //////////////////////////////////////////
    //////////////////////////////////////////
    //		End of Parsing Mechanism		//
    //////////////////////////////////////////
    //////////////////////////////////////////

	
	/**
	 * @param ruleFile
	 * @param inputFile
	 */
	private void print (String ruleFile, IFile inputFile) {
		String realName =
			ResourcesPlugin.getWorkspace().getRoot().getLocation().toString()
			+ inputFile.getFullPath().toString();
        
        if (SintaksPlugin.getDefault().getOptionManager().isDebugProcess())
			SintaksPlugin.getDefault().debugln("Printing file: " + realName);
        printer.print(ruleFile, realName);
        if (SintaksPlugin.getDefault().getOptionManager().isDebugProcess())
        	SintaksPlugin.getDefault().debugln("Print finished");
	}

	
	/**
	 * @param inputFile
	 */
	private void load (IFile inputFile) {
        if (SintaksPlugin.getDefault().getOptionManager().isDebugProcess())
        	SintaksPlugin.getDefault().debugln("Loading file: " + inputFile.getName());
        subject.load( "platform:/resource" + inputFile.getFullPath().toString() );
        if (SintaksPlugin.getDefault().getOptionManager().isDebugProcess())
        	SintaksPlugin.getDefault().debugln("Load finished");
	}

	/**
	 * @param outputFile
	 */
	private void store (IFile outputFile) {
        if (SintaksPlugin.getDefault().getOptionManager().isDebugProcess())
        	SintaksPlugin.getDefault().debugln("Storing file: " + outputFile.getName());
        subject.store(outputFile);
        if (SintaksPlugin.getDefault().getOptionManager().isDebugProcess())
        	SintaksPlugin.getDefault().debugln("Store finished");
	}

	
    /**
     * @return
     */
	private boolean relink () {
        if (SintaksPlugin.getDefault().getOptionManager().isDebugProcess()) {
        	SintaksPlugin.getDefault().debugln("Model before relinking:");
        	subject.print(new PrintStream(SintaksPlugin.getDefault().getDebugStream()));
        }
        boolean ok = subject.relink ();
        if (SintaksPlugin.getDefault().getOptionManager().isDebugProcess()) {
        	if (ok) {
        		SintaksPlugin.getDefault().debugln ("Relinking successfull");
        	} else {
        		SintaksPlugin.getDefault().debugln ("Relinking failed");                
        	}
    	}
        if (SintaksPlugin.getDefault().getOptionManager().isDebugProcess()) {
        	SintaksPlugin.getDefault().debugln("Model after relinking:");
        	subject.print(new PrintStream(SintaksPlugin.getDefault().getDebugStream()));
        }
        return ok;
    }


    /**
     * @param inputFile
     * @param outputFile
     * @param ruleFile
     */
    public void getModelFromText(IFile inputFile, IFile outputFile, String ruleFile) {
    	
    	this.subject = new ModelSubject (new MetaModel(resSet));
		this.parser  = new ModelParser (new MetaModelParser(resSet), subject);

		try {
			this.parse(ruleFile, inputFile);
            this.relink();
            this.store(outputFile);
 		}
		catch (Exception e) {
			e.printStackTrace();
			SintaksPlugin.log(e);
		}
    }
    

    /**
     * @param inputFile
     * @param outputFile
     * @param ruleFile
     */
    public void getTextFromModel(IFile inputFile, IFile outputFile, String ruleFile) {

    	this.subject = new ModelSubject (new MetaModel(resSet));
        this.printer = new ModelPrinter (new MetaModelParser(resSet), subject);

    	try {
    		boolean ok = checkMetamodelUnicity(inputFile, ruleFile);
    		
    		if(ok) {
    			this.load (inputFile);
                this.print(ruleFile, outputFile);
    		} else {
    		    MessageDialog.openWarning(
    		    	new Shell(),
    				"Error",
    				"Source and syntactic models point to different instances of target metamodel.\n"
    			);
    			
    		}
 		}
		catch (Exception e) {
			
			/*
			 * 
			 * If the rules file does not exit, let's dispay an error message.
			 * 
			 */
			if ( e.getCause() instanceof CoreException )
	   		    MessageDialog.openWarning(
	    		    	new Shell(),
	    				"Error",
	    				e.getMessage() 
	    			);
			e.printStackTrace();
			SintaksPlugin.log(e);
		}
    }
    
    /**
     * 
     * @param inputFile inputFile must be of the form platform:/resource/*
     * @param ruleFile ruleFile must be of the form platform/resource/* or platform:/plugin/*
     * @return
     */
    private boolean checkMetamodelUnicity(String inputFile, String ruleFile) {
    	URI fileURI = null;
    	EPackage p = null;
    	EPackage inputPack = null;
    	EPackage rulePack = null;
    	
    	// Step1:
    	fileURI = URI.createURI( inputFile );
    	Resource inputRes = resSet.getResource(fileURI, true);
		EObject e = (EObject) inputRes.getContents().get(0);
    	p = (EPackage) e.eClass().eContainer();
    	inputPack = getRootPackage(p);
    	
    	// Step2:
    	fileURI = URI.createURI( ruleFile );
    	Resource ruleRes = resSet.getResource(fileURI, true);
    	TreeIterator i = ruleRes.getAllContents();
    	boolean loop = true;
    	EClass c = null;
    	while(i.hasNext() && loop) {
    		EObject obj = (EObject) i.next();
    		if(obj instanceof Template) {
    			c = ((Template) obj).getMetaclass();
    			loop = false;
    		}
    	}
    	p = (EPackage) c.eContainer();
    	rulePack = getRootPackage(p);
    	
    	return (inputPack == rulePack);
    }
    
    
    private boolean checkMetamodelUnicity(IFile inputFile, String ruleFile) {
    	String inputFileString = "platform:/resource" + inputFile.getFullPath().toString();
    	return checkMetamodelUnicity(inputFileString, ruleFile);
    }    
    
    /**
     * @param p
     * @return
     */
    private EPackage getRootPackage(EPackage p) {
    	EPackage crtPack = p;
    	EObject container = crtPack.eContainer();
    	
    	while(container instanceof EPackage) {
    		crtPack = (EPackage) container;
    		container = crtPack.eContainer();
    	}

    	return crtPack;
    }
}
