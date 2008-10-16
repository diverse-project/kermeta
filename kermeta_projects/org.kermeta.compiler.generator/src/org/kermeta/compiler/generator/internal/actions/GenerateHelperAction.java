/*******************************************************************************
 * Copyright (c) 2005 AIRBUS FRANCE. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse
 * Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: David Sciamma (Anyware Technologies), Mathieu Garcia (Anyware
 * Technologies), Jacques Lescot (Anyware Technologies) - initial API and
 * implementation
 ******************************************************************************/
/*$Id: GenerateHelperAction.java,v 1.9 2008-10-16 09:04:39 cfaucher Exp $
* Project : org.kermeta.compiler.generator
* File : 	GenerateHelperAction.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 28 nov. 07
* Authors : Cyril Faucher <cfaucher@irisa.fr>
*/

package org.kermeta.compiler.generator.internal.actions;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.actions.WorkspaceModifyOperation;
import org.kermeta.compiler.generator.helper.model.SimkModelHelper;
import org.kermeta.compiler.generator.internal.GeneratorPlugin;
import org.kermeta.compiler.generator.internal.generators.CompilerHelperGenerator;
import org.kermeta.generator.AbstractGenerator;
import org.kermeta.generator.util.ConfiguratorObjectManager;
import org.kermeta.io.KermetaUnit;
import org.kermeta.io.loader.plugin.LoaderPlugin;

import fr.irisa.triskell.kermeta.exceptions.NotRegisteredURIException;
import fr.irisa.triskell.kermeta.exceptions.URIMalformedException;
import fr.irisa.triskell.kermeta.exporter.ecore.EcoreExporter;

/**
 * Action that generates editor classes conforming to a default JET templates.
 * 
 * @author <a href="mailto:jacques.lescot@anyware-tech.com">Jacques LESCOT</a>
 * @author <a href="mailto:david.sciamma@anyware-tech.com">David Sciamma</a>
 */
public class GenerateHelperAction //implements IActionDelegate
{
    //private ISelection selection;

    private IProject generatedProject;

    /**
     * @see org.eclipse.ui.IActionDelegate#selectionChanged(org.eclipse.jface.action.IAction,
     *      org.eclipse.jface.viewers.ISelection)
     */
    /*public void selectionChanged(IAction action, ISelection sel) {
        selection = sel;
        action.setEnabled(true);
    }*/

    /**
     * Try to retrieve the selected file from the given selection
     * 
     * @param sel the selection
     * @return the selected file
     */
    /*private IFile convertSelection2File(ISelection sel) {
        // get the selected *.configuration file
        if (selection instanceof IStructuredSelection) {
            IStructuredSelection ssel = (IStructuredSelection) sel;
            if (!ssel.isEmpty() && ssel.size() == 1)
            {
                Object selectedObj = ssel.getFirstElement();
                if (selectedObj instanceof IFile) {
                    return (IFile) selectedObj;
                }
                // Try to adapt
                if (selectedObj instanceof IAdaptable) {
                    return (IFile) ((IAdaptable) selectedObj).getAdapter(IFile.class);
                }
            }
        }
        return null;
    }*/

    /**
     * @see org.eclipse.ui.IActionDelegate#run(org.eclipse.jface.action.IAction)
     */
    /*public void run(IAction action) {
        // get the selected *.configuration file
        final IFile file = convertSelection2File(selection);
        
        final String kmFilePath = file.getFullPath().removeFileExtension().addFileExtension("km").toString();
        
        generate(file, kmFilePath, null);
    }*/
    
    public void generate(final IFile file, final org.kermeta.compiler.generator.helper.model.Context context, final IFile simk_file) {
    	if (file == null) {
            GeneratorPlugin.displayDialog(null, "Invalid selection : Only one file can be selected.", IStatus.ERROR);
            return;
        }

        WorkspaceModifyOperation op = new WorkspaceModifyOperation() {
            public void execute(IProgressMonitor monitor) throws CoreException, InvocationTargetException, InterruptedException {
                monitor.beginTask("Compiler Helper Generation process", 11);
                try {
                    ConfiguratorObjectManager manager = new ConfiguratorObjectManager();
                    manager.load(file.getFullPath());
                    // retrieve the root model object and check if it has the expected type
                    if (manager.getRootModelObject() instanceof GenModel) {
                    	GenModel configuration = (GenModel) manager.getRootModelObject();

                        monitor.subTask("GenModel validation");
                        Diagnostician diagnostician = new Diagnostician();
                        Diagnostic diagnostic = diagnostician.validate(configuration);
                        if (diagnostic.getSeverity() <= Diagnostic.INFO) {
                            monitor.worked(1);

                            CompilerHelperGenerator generator = new CompilerHelperGenerator(configuration, context, SimkModelHelper.getSIMKModel(simk_file));
                            generatedProject = generator.generate(monitor);
                        } else {
                            GeneratorPlugin.log("Validation problem : a problem occured during the genmodel validation.", IStatus.ERROR);
                        }
                    } else {
                        GeneratorPlugin.log("The root model object has not the right type. Generation process has been aborted.", IStatus.ERROR);
                    }
                } catch (IOException ioe) {
                    IStatus status = new Status(IStatus.ERROR, GeneratorPlugin.getId(), IStatus.OK, "Operation failed.", ioe);
                    throw new CoreException(status);
                } finally {
                    monitor.done();
                }
            }
        };

        try {
            Shell shell = GeneratorPlugin.getActiveWorkbenchShell();
            ProgressMonitorDialog dialog = new ProgressMonitorDialog(shell);
            dialog.run(true, false, op);

            ConfiguratorObjectManager manager = new ConfiguratorObjectManager();
            /*manager.load(file.getFullPath());
            // retrieve the root model object and check if it has the expected type
            if (manager.getRootModelObject() instanceof GenModel) {
            	GenModel configuration = (GenModel) manager.getRootModelObject();
                if (configuration.isUpdateClasspath()) {
                    AbstractGenerator.organizeImports(generatedProject);
                }
            }*/
        } catch (Exception e) {
            GeneratorPlugin.log(e);
            GeneratorPlugin.displayDialog(null, "An error occurred during the helper generation", IStatus.ERROR);
        }
    }

}
