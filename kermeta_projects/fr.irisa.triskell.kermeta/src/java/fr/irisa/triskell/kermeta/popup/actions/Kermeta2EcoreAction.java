/* $Id: Kermeta2EcoreAction.java,v 1.3 2005-07-21 15:41:45 dvojtise Exp $
 * Project : Kermeta
 * File : Kermeta2EcoreAction.java
 * License : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : 8 juil. 2005
 * Authors : 
 * 		Didier Vojtisek	<dvojtise@irisa.fr>
 * Description :  	
 * 	see class javadoc.	
 * History :
 */
package fr.irisa.triskell.kermeta.popup.actions;


import java.io.IOException;
import java.util.Iterator;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;

import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.loader.KermetaUnitFactory;
import fr.irisa.triskell.kermeta.tools.wizards.Ecore2kmtWizard;
import fr.irisa.triskell.kermeta.tools.wizards.EcoreExporterWizard;
import fr.irisa.triskell.kermeta.exporter.ecore.KM2EcoreExporter;

/**
 * This action will generate an ecore file from a kermeta file
 * The Ecore will have the body of the opetation as annotations 
 * The current version ovewrite the destination
 */
public class Kermeta2EcoreAction implements IObjectActionDelegate {
		
	protected StructuredSelection currentSelection;
	protected IFile kmtfile;
	    
		/**
		 * Constructor for Kermeta2EcoreAction.
		 */
		public Kermeta2EcoreAction() {
			super();
		}
		
		

		/**
		 * @see IObjectActionDelegate#setActivePart(IAction, IWorkbenchPart)
		 */
		public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		}

		/**
		 * @see IActionDelegate#run(IAction)
		 */
		public void run(IAction action) {
			Shell shell = new Shell();
		    MessageDialog.openWarning(
					shell,
					"Warning",
					"This feature has not been tested, it cannot be considered as stable.\n"
					+ "The ecore file produced may contain errors.");
		        
	    	EcoreExporterWizard wizard =  new EcoreExporterWizard();
	    	wizard.init(PlatformUI.getWorkbench(),currentSelection);
	    	WizardDialog wizDialog =  new org.eclipse.jface.wizard.WizardDialog(shell,wizard);
	    	wizDialog.setTitle("Exports this kmt file into an ecore file");
	    	wizDialog.open();
		   /* Shell shell = new Shell();
		    try {
		    	MessageDialog.openWarning(
						shell,
						"Warning",
						"This feature has not been tested, it cannot be considered as stable.\n"
						+ "The Ecore file produced might not be usable.");
		    	IFile ecorefile = kmtfile.getProject().getFile(kmtfile.getProjectRelativePath().removeFileExtension().addFileExtension("ecore"));
		        
		        String kmt_uri = "platform:/resource" + kmtfile.getFullPath().toString();
		        
		        KermetaUnitFactory.getDefaultLoader().unloadAll();
		        
		        KermetaUnit unit = KermetaUnitFactory.getDefaultLoader().createKermetaUnit(kmt_uri);
		        
		        unit.load();
		        
		        if (unit.getAllErrors().size() != 0) {
		            throw new Error("The source file contains errors : " + unit.getAllMessagesAsString());
		        }
		        
		        unit.typeCheckAllUnits();
		        
		        if (unit.getAllErrors().size() != 0) {
		            throw new Error("The source file contains type errors : " + unit.getAllMessagesAsString());
		        }
		        
		        saveAsEcoreXMI(unit, ecorefile);
		        
		        MessageDialog.openInformation(
						shell,
						"Info",
						"Done");
		        
		    }
		    catch (Throwable t) {
		        
				MessageDialog.openError(
					shell,
					"Kermeta 2 Ecore Error",
					"error : " + t);
				t.printStackTrace();
		    }*/
		}
		
		public boolean checkFileDate()
		{
		
			return true;
		}
		public void saveAsEcoreXMI(KermetaUnit builder, IFile ifile) throws Exception  {
		    Shell shell = new Shell();
		    if (ifile.exists()) {
	            if (!MessageDialog.openQuestion(shell, "File already exists", "Do you want to overwrite exiting ecore file :\n" + ifile.getFullPath().toString()))
	                return;
	        }
		    
		    // save required unit
		    /* imported units needed to recognize the imported classes...*/
		    /* TODO this may be interactive, eventually ask for the location of the required ecore file 
		     * instead of  creating a new one
		     */
		/*	Iterator it = builder.importedUnits.iterator();
			while(it.hasNext()) {
				KermetaUnit iu = (KermetaUnit)it.next();
				if (iu.rootPackage != builder.rootPackage) {
					
					if (iu instanceof KMTUnit || iu instanceof KMUnit)
					{			
						IFile importedfile = ifile.getProject().getFile(ifile.getProjectRelativePath().removeFileExtension().removeLastSegments(1).append(iu.rootPackage.getFName()).addFileExtension("ecore"));											
						saveAsEcoreXMI(iu, importedfile);
					}
				}
			} */
			
		    // create Ecore structure
		    //	TODO	  create Ecore structure
		    Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ecore",new XMIResourceFactoryImpl());
		    ResourceSet resource_set = new ResourceSetImpl();
		    Resource resource = resource_set.createResource(URI.createFileURI(ifile.getFullPath().toString()));
		    
		    KM2EcoreExporter exporter = new KM2EcoreExporter(resource);
			
			exporter.exportPackage(builder.rootPackage);
			
			
		    // Save Ecore structure	
			try {
				resource.save(null);
			} catch (IOException e) {
				KermetaUnit.internalLog.error("cannot save ecore ressource, due to Exception: ", e);
				throw new Error("Cannot save ecore ressource (" + ifile.getName() + "), due to Exception: ", e);
			}
			ifile.refreshLocal(1, null);
		}

			
			
		/**
		 * @see IActionDelegate#selectionChanged(IAction, ISelection)
		 */
		public void selectionChanged(IAction action, ISelection selection) {
			if (selection instanceof StructuredSelection)
			{
				// the selection should be a single *.kmt (or a *.km ?) file
				currentSelection = (StructuredSelection)selection;
				Iterator it = currentSelection.iterator();

				while(it.hasNext()) {
					kmtfile = (IFile)it.next();
				}

			}
		}


}
