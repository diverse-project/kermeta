/* $Id: RunPopupDialog.java,v 1.1 2005-05-16 17:05:26 zdrey Exp $
 * Project: Kermeta (First iteration)
 * File: RunPopupDialog.java
 * License: GPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date: May 12, 2005
 * Authors: zdrey
 */
package fr.irisa.triskell.kermeta.runner.dialogs;

import java.util.Iterator;

import org.eclipse.core.resources.IFile;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.jface.dialogs.Dialog;
//import org.eclipse.swt.widgets.Dialog;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

import fr.irisa.triskell.kermeta.behavior.impl.BehaviorPackageImpl;
import fr.irisa.triskell.kermeta.loader.KMUnitError;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.loader.KermetaUnitFactory;
import fr.irisa.triskell.kermeta.loader.kmt.KMTUnit;
import fr.irisa.triskell.kermeta.structure.FTag;
import fr.irisa.triskell.kermeta.structure.impl.StructurePackageImpl;

/**
 * Dialog that appears when user clics on the popup menu of a .kmt source file
 */
public class RunPopupDialog extends Dialog {

    
    /** Describe the kind of action that implied this dialog */
    public String defaultOperationString;
    /** The source file that the user want to be executed */
    public String filenameString;
    /** The title for the dialog */
    public String dialogTitleString = "op";
    public String classQualifiedNameString = "class";
    
    /** The texts zones */
    public Text sourceFileText = null;
    public Text classQualifiedNameText = null;
    public Text defaultOperationText = null;
    
    
    /**
     * 
     */
    public RunPopupDialog(Shell parentShell, IFile ifile) {
        super(parentShell);
        // Set the selected file 
        //filenameString = pFilenameString;
        // Set the values of defaultOperationString and classQualifiedNameString;

        filenameString = ifile.getLocation().toString();
        dialogTitleString = "Kermeta popup run";
        
    }
    
    /***
     * 
     * @param pFilename the filename, given as a unix string
     */
    public void setFilenameString(String pFilename)
    {
        
        filenameString = pFilename;
    }
    
	/**
	 * Create a pretty dialog Area
	 */
	protected Control createDialogArea(Composite parent) {
		Composite area = (Composite) super.createDialogArea(parent);
		area.setLayout(new FillLayout(SWT.VERTICAL));
		// Set the field for the chosen file
		{
			final Group group = new Group(area, SWT.NONE);
			group.setText("File:");
			group.setLayout(new FillLayout(SWT.VERTICAL));
			{
				sourceFileText = new Text(group, SWT.BORDER);
				sourceFileText.setEnabled(true);
				sourceFileText.setText(filenameString);
			}
		}

		// Set the field for the operation choice
		{
			final Group group_info = new Group(area, SWT.NONE);
			group_info.setText("Chosen class:");
			group_info.setLayout(new FillLayout());
			{
				classQualifiedNameText = new Text(group_info, SWT.BORDER);
				classQualifiedNameText.setEnabled(true);
				classQualifiedNameText.setText(classQualifiedNameString);
			}
		}
		// Set the field for the operation choice
		{
			final Group group_info = new Group(area, SWT.NONE);
			group_info.setText("Chosen operation:");
			group_info.setLayout(new FillLayout());
			{
				defaultOperationText = new Text(group_info, SWT.BORDER);
				defaultOperationText.setEnabled(true);
				defaultOperationText.setText(defaultOperationString);
			}
		}
		return area;
	}
	
	/** 
	 * Create the OK and the Cancel buttons
	 * */
	protected void createButtonsForButtonBar(Composite parent) {
		createButton(
			parent,
			IDialogConstants.OK_ID,
			IDialogConstants.OK_LABEL,
			true);
		createButton(
			parent,
			IDialogConstants.CANCEL_ID,
			IDialogConstants.CANCEL_LABEL,
			false);
	}
	
	/**
	 * Configure the shell, by giving it a title
	 * @param newShell the shell
	 */
	protected void configureShell(Shell newShell) {
		super.configureShell(newShell);
		newShell.setText(dialogTitleString);
	}
    

	/**
	 * Create a Browse list to get the list of available classes
	 *
	 */
	protected void browseKermetaClasses(String filename)
	{
	    
	}
	
	
	/**
	 * Initialize the entypoint of the program according to
	 * tags on the root_package.
	 */
	public void setEntryPoint(KermetaUnit unit) 
	{
	    Iterator it = unit.rootPackage.getFTag().iterator();
	    while (it.hasNext()) {
	        FTag tag = (FTag)it.next();
	        if (tag.getFName().equals("mainClass")) 
	            classQualifiedNameString = tag.getFValue().substring(1,tag.getFValue().length()-1); //remove the " to memorize value
	        if (tag.getFName().equals("mainOperation"))
	            defaultOperationString = tag.getFValue().substring(1,tag.getFValue().length()-1); //remove the " to memorize value
	    }
	}
	
	
	/**
	 * Parse the given file and return its KermetaUnit
	 * @param file
	 * @return KermetaUnit the compilation unit for the given file
	 */
    public KermetaUnit parse(IFile file)
    {
        KermetaUnit.STD_LIB_URI = "platform:/plugin/fr.irisa.triskell.kermeta.texteditor_0.0.2/lib/framework.km";
    	
    	StructurePackageImpl.init();
    	BehaviorPackageImpl.init();
    	String uri = "platform:/resource" + file.getFullPath().toString();
    	KermetaUnitFactory.getDefaultLoader().unloadAll();
    	KMTUnit result = null;
       // System.out.println("file.getFullPath().toOSString() : " + file.getFullPath().toOSString());
        try {
        	result = (KMTUnit)KermetaUnitFactory.getDefaultLoader().createKermetaUnit(uri);
	        result.load();
	        
	        result.typeCheck();
	        
        }
        catch(Throwable e) {
            KermetaUnit.internalLog.error("load error ", e);
        	if (result == null) {
        		e.printStackTrace();
        		return null;
        	}
        	else if (result.error.size() == 0)
        		result.error.add(new KMUnitError("INTERNAL ERROR : " + e, null));
        }
        return result;
    }

	
}
