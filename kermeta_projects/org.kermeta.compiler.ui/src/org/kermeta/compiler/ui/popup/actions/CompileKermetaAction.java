/* $Id: CompileKermetaAction.java,v 1.2 2008-02-06 15:40:08 cfaucher Exp $
 * Project   : fr.irisa.triskell.kermeta.compiler
 * File      : CompileKermetaAction.java
 * License   : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Feb 22, 2007
 * Authors       : cfaucher
 */

package org.kermeta.compiler.ui.popup.actions;

import java.util.Iterator;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.kermeta.compiler.KermetaCompiler;
import org.kermeta.compiler.exporter.KM2JavaPrettyPrinter;
import org.kermeta.compiler.generator.helper.model.SimkModelHelper;
import org.kermeta.io.KermetaUnit;
import org.kermeta.io.loader.plugin.LoaderPlugin;
import org.kermeta.model.KermetaModelHelper;
import org.kermeta.simk.SIMKModel;
import org.kermeta.simk.SMClass;
import org.kermeta.simk.SMContext;
import org.kermeta.simk.SMPackage;
import org.kermeta.simk.SMParameter;
import org.kermeta.simk.SMUsage;
import org.kermeta.simk.SimkFactory;
import org.kermeta.simk.StaticMethod;

import fr.irisa.triskell.eclipse.ecore.EcoreHelper;
import fr.irisa.triskell.kermeta.exceptions.NotRegisteredURIException;
import fr.irisa.triskell.kermeta.exceptions.URIMalformedException;
import fr.irisa.triskell.kermeta.exporter.ecore.EcoreExporter;
import fr.irisa.triskell.kermeta.exporter.ecore.KM2Ecore;
import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.Operation;
import fr.irisa.triskell.kermeta.language.structure.TypeDefinition;
import fr.irisa.triskell.kermeta.modelhelper.ModelingUnitHelper;
import fr.irisa.triskell.kermeta.modelhelper.NamedElementHelper;
import fr.irisa.triskell.kermeta.util.LogConfigurationHelper;

public class CompileKermetaAction implements IObjectActionDelegate {

	protected StructuredSelection currentSelection;

	protected IFile kermetafile;

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
		
		KermetaCompiler kermetaCompiler = new KermetaCompiler(kermetafile);
		kermetaCompiler.run();

		
		// Iteration on the generated Ecore files, then each Ecore file are
		// compiling
		// FIXME Does not work for the moment, because the list has never been
		// filled
		/*
		 * for(Iterator it=km2ecoreGen.getEcoreFileList().iterator();
		 * it.hasNext();) { System.err.println("DEBUG - test list " +
		 * it.next().toString());
		 * 
		 * Compiler compiler = new Compiler(it.next().toString()); try {
		 * compiler.run(); } catch (IOException e) { e.printStackTrace(); } }
		 */

	}
	
	/*public void saveKm2ecoremappingTracer(EcoreExporter km2ecoreGen) {
		//URI tracerUri = URI.createURI(km2ecoreGen.getSource().getUri());
		tracerUri = tracerUri.appendFileExtension("traceability");
		
		Resource tarcerResource = Tracer.getResource(tracerUri);
		
		Tracer tracer = km2ecoreGen.getKm2ecoremappingTracer();
		
		TraceModel traceModel = tracer.getTraceModel();
		
		tarcerResource.getContents().add(traceModel);
		
		try {
			tarcerResource.save(null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}*/

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
			KermetaUnit ku_fromFile = LoaderPlugin.getDefault().load(
					"platform:/resource/" + kermetafile.getFullPath(), null);
			if (!ku_fromFile.isErroneous()) {
				action.setEnabled(true);
			}
		} catch (URIMalformedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NotRegisteredURIException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * 
	 * FIXME CF To factorize
	 * 
	 * @param annotedModelElement
	 * @param annotationName
	 * @param annotationDetailKey
	 * @param annotationDetailValue
	 * @param referedEObject
	 */
	public static void addAnnotation(EModelElement annotedModelElement,
			String annotationName, String annotationDetailKey,
			String annotationDetailValue, EObject referedEObject) {
		// find the Annotation or create a new one
		EAnnotation newEAnnotation = annotedModelElement
				.getEAnnotation(annotationName);
		if (newEAnnotation == null) {
			newEAnnotation = EcoreFactory.eINSTANCE.createEAnnotation();
			newEAnnotation.setSource(annotationName);
			annotedModelElement.getEAnnotations().add(newEAnnotation);
		}
		// add the info in the Details map
		if (annotationDetailKey != null)
			newEAnnotation.getDetails().put(annotationDetailKey,
					annotationDetailValue);
		else {
			newEAnnotation.getDetails().put(KermetaModelHelper.Tag.KERMETA_DOCUMENTATION,
					annotationDetailValue);
		}
		// try a direct link additionnaly to the detail map.
		if (referedEObject != null) {
			internalLog.debug(" adding annotation reference for "
					+ annotationDetailKey + " = " + annotationDetailValue);
			newEAnnotation.getReferences().add(referedEObject);
		}
	}

	/**
	 * Check if an EOperation is runnable via for the generation the main and
	 * class method
	 * 
	 * @param eop
	 * @return
	 */
	public boolean isRunnable(EOperation eop) {
		boolean res = true;
		for (EParameter eparam : eop.getEParameters()) {
			if (eparam.getEType().getName().equals("String")) {
				res = true;
			} else {
				return false;
			}
		}
		return res;
	}
}
