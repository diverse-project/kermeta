/* $Id: CompileKermetaAction.java,v 1.1 2007-10-17 08:56:20 cfaucher Exp $
 * Project   : fr.irisa.triskell.kermeta.compiler
 * File      : CompileKermetaAction.java
 * License   : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Feb 22, 2007
 * Authors       : cfaucher
 */

package org.kermeta.compiler.popup.actions;

import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashSet;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.kermeta.compiler.Compiler;
import org.kermeta.compiler.exporter.KM2JavaPrettyPrinter;
import org.kermeta.io.KermetaUnit;
import org.kermeta.io.plugin.IOPlugin;
import org.kermeta.merger.Merger;

import fr.irisa.triskell.eclipse.resources.ResourceHelper;
import fr.irisa.triskell.kermeta.exceptions.KermetaIOFileNotFoundException;
import fr.irisa.triskell.kermeta.exceptions.URIMalformedException;
import fr.irisa.triskell.kermeta.exporter.ecore.EcoreExporter;
import fr.irisa.triskell.kermeta.exporter.ecore.ExporterOptions;
import fr.irisa.triskell.kermeta.exporter.ecore.KM2Ecore;
import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.Operation;
import fr.irisa.triskell.kermeta.language.structure.TypeDefinition;
import fr.irisa.triskell.kermeta.loader.kmt.KMT2KMPass7;
import fr.irisa.triskell.kermeta.modelhelper.KermetaUnitHelper;
import fr.irisa.triskell.kermeta.util.LogConfigurationHelper;

public class CompileKermetaAction implements IObjectActionDelegate {

	protected StructuredSelection currentSelection;

	protected IFile kermetafile;

	public final static String ANNOTATION_GENMODEL = "http://www.eclipse.org/emf/2002/GenModel";
	
	final static public Logger internalLog = LogConfigurationHelper.getLogger("KermetaCompiler");

	/**
	 * Constructor for CompileKermetaAction.
	 */
	public CompileKermetaAction() {
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

		String ecorePath = kermetafile.getLocation().removeFileExtension().addFileExtension("ecore").toString();
		String ecoreRelativePath = kermetafile.getFullPath().removeFileExtension().addFileExtension("ecore").toString();
		
		// Create the KermetaUnit
		KermetaUnit unit = null;
		try {
			unit = IOPlugin.getDefault().loadKermetaUnit(kermetafile, new NullProgressMonitor());
		} catch (KermetaIOFileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (URIMalformedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		//ResourceSet resource_set;// = new ResourceSetImpl();
		//Resource resource = resource_set.createResource(URI.createFileURI(ecorePath));
		// Generate Ecore in memory and saving
		EcoreExporter km2ecoreGen = new EcoreExporter();
		
		ExporterOptions exporterOptions = ExporterOptions.getDefault();
		exporterOptions.isIndependent = true;
		exporterOptions.isOnlyStructural = false; // method's body will be generated
		exporterOptions.isExportedWithMerger = true;
		
		if(exporterOptions.isExportedWithMerger) {
			LinkedHashSet<KermetaUnit> tuiti = new LinkedHashSet<KermetaUnit>();
			tuiti.add( unit );
			tuiti.addAll( KermetaUnitHelper.getAllImportedKermetaUnits(unit) );
			Merger mergedVersion = new Merger();
			try {
				unit = mergedVersion.processInMemory(tuiti,"platform:/resource" + ecoreRelativePath);
			} catch (URIMalformedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		/*ResourceSet resource_set = */km2ecoreGen.exportInMemory(unit, kermetafile.getParent().getFullPath().toString(), exporterOptions);
		internalLog.info("Ecore structure has been generated");
		
		prettyPrintJavaCode(km2ecoreGen,unit);
		internalLog.info("Java source code has been printed inside GenModel EAnnotations");
		
		km2ecoreGen.save();
		internalLog.info("Ecore file has been saved");
			
//		kermetafile.getParent().refreshLocal(1, null);
	
		Compiler compiler = new Compiler(ecorePath);
		
		try {
			compiler.run();
			internalLog.info("The compilation process is complete");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// Iteration on the generated Ecore files, then each Ecore file are compiling
		// FIXME Does not work for the moment, because the list has never been filled
		/*for(Iterator it=km2ecoreGen.getEcoreFileList().iterator(); it.hasNext();) {
			System.err.println("DEBUG - test list " + it.next().toString());
			
			Compiler compiler = new Compiler(it.next().toString());
			try {
				compiler.run();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}*/

	}

	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
		if (selection instanceof StructuredSelection) {
			// the selection should be a single *.ecore file
			currentSelection = (StructuredSelection) selection;
			Iterator<IFile> it = currentSelection.iterator();

			while (it.hasNext()) {
				kermetafile = (IFile) it.next();
			}
		}
		try {
			action.setEnabled(false);
			KermetaUnit ku_fromFile = IOPlugin.getDefault().loadKermetaUnit(kermetafile, new NullProgressMonitor());
			if(!ku_fromFile.isErroneous()) {
				action.setEnabled(true);
			}
		} catch (KermetaIOFileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (URIMalformedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * Pretty-print Java source code into GenModel Annotations
	 * @param km2ecore
	 */
	private static void prettyPrintJavaCode(EcoreExporter km2ecore, KermetaUnit unit) {
		
		try {
				
			KM2JavaPrettyPrinter prettyPrinter = new KM2JavaPrettyPrinter();
			
			for(TypeDefinition aTypeDef : fr.irisa.triskell.kermeta.modelhelper.KermetaUnitHelper.getTypeDefinitions(unit)) {
					if(aTypeDef instanceof ClassDefinition) {
					ClassDefinition aClassDef = (ClassDefinition) aTypeDef;
					for(Operation op : aClassDef.getOwnedOperation()) {
						if (op.getBody() != null) {
							// (if "typedef" is false, then it means that prettyPrinter is not in typdef
							// context, so it will prettyPrint visited node accordingly)
							prettyPrinter.setTypedef(false);
							String bodyString = (String) prettyPrinter.accept(op.getBody());
							
							EObject eObj = km2ecore.getKm2ecoremapping().get(op);
							if(eObj != null && eObj instanceof EOperation) {
								addAnnotation( 
									(EOperation) eObj,
									ANNOTATION_GENMODEL,
									KM2Ecore.ANNOTATION_BODY_DETAILS,
									bodyString,
									null);	
							}
						}
					}
				}
			}
		} catch (Exception e) {
			System.out.println();
			e.printStackTrace();
		}
	}
	
	public static void addAnnotation( 
			EModelElement annotedModelElement,
			String annotationName,
			String annotationDetailKey,
			String annotationDetailValue,
			EObject referedEObject
			) {
		// find the Annotation or create a new one
		EAnnotation newEAnnotation = annotedModelElement.getEAnnotation(annotationName);
		if (newEAnnotation == null){
			newEAnnotation = EcoreFactory.eINSTANCE.createEAnnotation();
			newEAnnotation.setSource(annotationName);
			annotedModelElement.getEAnnotations().add( newEAnnotation );
		}
		// add the info in the Details map
		if (annotationDetailKey != null)
			newEAnnotation.getDetails().put(annotationDetailKey, 
					annotationDetailValue);
		else {
			newEAnnotation.getDetails().put(KMT2KMPass7.KERMETA_DOCUMENTATION, annotationDetailValue);
		}
		// try a direct link additionnaly to the detail map. 
		if (referedEObject != null) 
		{
			internalLog.debug(" adding annotation reference for " +annotationDetailKey + " = " + annotationDetailValue);
			newEAnnotation.getReferences().add(referedEObject);
		}
	}

}
