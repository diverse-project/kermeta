package fr.irisa.triskell.sintaks.main;

import java.util.ArrayList;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
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
import sts.Terminal;

import fr.irisa.triskell.sintaks.parser.MetaModelParser;
import fr.irisa.triskell.sintaks.parser.ModelParser;
import fr.irisa.triskell.sintaks.parser.ModelPrinter;
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
    
    static boolean debugProcess = false;
    static boolean debugSubProcess = false;


	/**
	 * @param mmFile
	 */
	public Master() {
		this.resSet  = new ResourceSetImpl();
		this.parser  = null;
		this.printer = null;
		this.subject = null;
	}
	
	
	/**
	 * @param ruleFile
	 * @param inputFile
	 * @return
	 */
	public boolean parse (IFile ruleFile, IFile inputFile) {
        if (debugProcess)
        	System.out.println("Parsing file: " + inputFile.getName());
        boolean ok = parser.parse(ruleFile, inputFile);
        if (debugProcess)
        	System.out.println("Parse finished");
        return ok;
	}

	
	/**
	 * @param ruleFile
	 * @param inputFile
	 */
	public void print (IFile ruleFile, IFile inputFile) {
		String realName =
			ResourcesPlugin.getWorkspace().getRoot().getLocation().toString()
			+ inputFile.getFullPath().toString();
        
		if (debugProcess)
        	System.out.println("Printing file: " + realName);
        printer.print(ruleFile, realName);
        if (debugProcess)
        	System.out.println("Print finished");
	}

	
	/**
	 * @param outputFile
	 */
	public void store (IFile outputFile) {
        if (debugProcess)
        	System.out.println("Storing file: " + outputFile.getName());
        subject.store(outputFile);
        if (debugProcess)
        	System.out.println("Store finished");
	}

	
    /**
     * @return
     */
    public boolean relink () {
        if (debugSubProcess) {
        	System.out.println("Model before relinking:");
        	subject.print(System.out);
        }
        boolean ok = subject.relink ();
        if (debugSubProcess) {
        	if (ok) {
        		System.out.println ("Relinking successfull");
        	} else {
        		System.out.println ("Relinking failed");                
        	}
    	}
        if (debugSubProcess) {
        	System.out.println("Model after relinking:");
        	subject.print(System.out);
        }
        return ok;
    }


    /**
     * @param inputFile
     * @param outputFile
     * @param ruleFile
     */
    public void getModelFromText(IFile inputFile, IFile outputFile, IFile ruleFile) {
    	
    	ArrayList<Terminal> terminals = new ArrayList<Terminal>();
        URI fileURI = URI.createURI("platform:/resource" + ruleFile.getFullPath().toString());
        ResourceSet rs = new ResourceSetImpl();
        Resource res = rs.getResource(fileURI, true);
		TreeIterator i = res.getAllContents();
		while(i.hasNext()) {
			Object o = i.next();
			if(o instanceof Terminal) terminals.add((Terminal) o);
		}
    	
    	this.subject = new ModelSubject (new MetaModel(resSet), terminals);
		this.parser  = new ModelParser (new MetaModelParser(resSet), subject);

		try {
			this.parse(ruleFile, inputFile);
            this.relink();
            this.store(outputFile);
 		}
		catch (Exception e) {
			e.printStackTrace();
		}
    }
    

    /**
     * @param inputFile
     * @param outputFile
     * @param ruleFile
     */
    public void getTextFromModel(IFile inputFile, IFile outputFile, IFile ruleFile) {

    	this.subject = new ModelSubject (new MetaModel(resSet));
        this.printer = new ModelPrinter (new MetaModelParser(resSet), subject);

    	try {
    		boolean ok = checkMetamodelUnicity(inputFile, ruleFile);
    		
    		if(ok) {
        		URI fileURI = URI.createURI("platform:/resource" + inputFile.getFullPath().toString());
        		Resource res = resSet.getResource(fileURI, true);
        		EObject e = (EObject) res.getContents().get(0);
        		
        		this.subject.initialize();
        		this.subject.setModel( e );

                this.print(ruleFile, outputFile);
    		}
    		else {
    		    MessageDialog.openWarning(
    		    	new Shell(),
    				"Error",
    				"Source and syntactic models point to different instances of target metamodel.\n"
    			);
    			
    		}
 		}
		catch (Exception e) {
			e.printStackTrace();
		}
    }
    
    
    /**
     * @param inputFile
     * @param ruleFile
     * @return
     */
    protected boolean checkMetamodelUnicity(IFile inputFile, IFile ruleFile) {
    	
    	URI fileURI = null;
    	EPackage p = null;
    	EPackage inputPack = null;
    	EPackage rulePack = null;
    	
    	// Step1:
    	fileURI = URI.createURI("platform:/resource" + inputFile.getFullPath().toString());
    	Resource inputRes = resSet.getResource(fileURI, true);
		EObject e = (EObject) inputRes.getContents().get(0);
    	p = (EPackage) e.eClass().eContainer();
    	inputPack = getRootPackage(p);
    	
    	// Step2:
    	fileURI = URI.createURI("platform:/resource" + ruleFile.getFullPath().toString());
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
    
    
    /**
     * @param p
     * @return
     */
    protected EPackage getRootPackage(EPackage p) {
    	EPackage crtPack = p;
    	EObject container = crtPack.eContainer();
    	
    	while(container instanceof EPackage) {
    		crtPack = (EPackage) container;
    		container = crtPack.eContainer();
    	}

    	return crtPack;
    }
}
