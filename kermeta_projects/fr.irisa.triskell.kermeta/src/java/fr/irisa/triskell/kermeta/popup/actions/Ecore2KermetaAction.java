package fr.irisa.triskell.kermeta.popup.actions;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Iterator;

import org.eclipse.core.resources.IFile;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

import fr.irisa.triskell.kermeta.exporter.kmt.KM2KMTPrettyPrinter;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.loader.KermetaUnitFactory;
import fr.irisa.triskell.kermeta.loader.km.KMUnit;
import fr.irisa.triskell.kermeta.loader.kmt.KMTUnit;

public class Ecore2KermetaAction implements IObjectActionDelegate {

    protected IFile ecorefile;
    
	/**
	 * Constructor for Action1.
	 */
	public Ecore2KermetaAction() {
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
	    try {
	        
	        IFile kmtfile = ecorefile.getProject().getFile(ecorefile.getProjectRelativePath().removeFileExtension().addFileExtension("kmt"));
			
	        String ecorefile_uri = "platform:/resource" + ecorefile.getFullPath().toString();
	        
	        KermetaUnitFactory.getDefaultLoader().unloadAll();
	        
	        KermetaUnit unit = KermetaUnitFactory.getDefaultLoader().createKermetaUnit(ecorefile_uri);
	        
	        writeUnit(unit, kmtfile);
	        
	    }
	    catch (Throwable t) {
	        
			MessageDialog.openError(
				shell,
				"Ecore 2 Kermeta Error",
				"error : " + t);
			t.printStackTrace();
	    }
	}
	
	
	public void writeUnit(KermetaUnit builder, IFile ifile) throws Exception  {
	    Shell shell = new Shell();
	    if (ifile.exists()) {
            if (!MessageDialog.openQuestion(shell, "File already exists", "Do you want to overwrite exiting kmt file :\n" + ifile.getFullPath().toString()))
                return;
        }
	    
	    
		KM2KMTPrettyPrinter pp = new KM2KMTPrettyPrinter();
		
		BufferedWriter w = new BufferedWriter(new FileWriter(ifile.getLocation().toFile()));
		String pkg_name = "package " + builder.getQualifiedName(builder.rootPackage) + ";\n\n";
		
		w.write("package " + builder.getQualifiedName(builder.rootPackage) + ";\n\n");
	
		/* imported units needed to recognize the imported classes...*/
		Iterator it = builder.importedUnits.iterator();
		while(it.hasNext()) {
			KermetaUnit iu = (KermetaUnit)it.next();
			if (iu.rootPackage != builder.rootPackage) {
				
				if (iu instanceof KMTUnit || iu instanceof KMUnit)
					w.write("require \"" + iu.getUri() + "\"\n");
				else {
								
					IFile importedfile = ifile.getProject().getFile(ifile.getProjectRelativePath().removeFileExtension().removeLastSegments(1).append(iu.rootPackage.getFName()).addFileExtension("kmt"));
					
					
					writeUnit(iu, importedfile);
					w.write("require \"" + iu.rootPackage.getFName() + ".kmt\"\n");
				}
			}
		}
		
		String str_kmt = pp.ppPackage(builder.rootPackage);
		// Do not write again the package declaration..
		w.write(str_kmt.substring(pkg_name.length()));
		w.close();
		ifile.refreshLocal(1, null);
	}

	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
		StructuredSelection currentSelection;
		if (selection instanceof StructuredSelection)
		{
			// the se=lection should be a single *.ecore file
			currentSelection = (StructuredSelection)selection;
			Iterator it = currentSelection.iterator();

			while(it.hasNext()) {
				ecorefile = (IFile)it.next();
			}

		}
	}


}
