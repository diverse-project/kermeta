/* $Id: CompileKermetaAction.java,v 1.2 2007-11-22 13:00:24 cfaucher Exp $
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
import org.kermeta.compiler.generator.helper.model.HelperModel;
import org.kermeta.io.KermetaUnit;
import org.kermeta.io.plugin.IOPlugin;
import org.kermeta.merger.Merger;

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
		exporterOptions.isExportedWithMerger = false;
		exporterOptions.isRemoveKermetaEAnnotations = false;
		
		if(exporterOptions.isExportedWithMerger) {
			LinkedHashSet<KermetaUnit> relatedUnit = new LinkedHashSet<KermetaUnit>();
			relatedUnit.add( unit );
			relatedUnit.addAll( KermetaUnitHelper.getAllImportedKermetaUnits(unit) );
			Merger mergedVersion = new Merger();
			try {
				
				for ( KermetaUnit kunit : relatedUnit )
					kunit.setLocked(true);
				
				unit = mergedVersion.processInMemory(relatedUnit,"platform:/resource" + ecoreRelativePath);

				for ( KermetaUnit kunit : relatedUnit )
					kunit.setLocked(false);
				
			} catch (URIMalformedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		/*ResourceSet resource_set = */km2ecoreGen.exportInMemory(unit, kermetafile.getParent().getFullPath().toString(), exporterOptions);
		internalLog.info("Ecore structure has been generated");
		
		HelperModel helperModel = prettyPrintJavaCode(km2ecoreGen,unit);
		
		fixPrintJavaCode(km2ecoreGen,unit);
		internalLog.info("Java source code has been printed inside GenModel EAnnotations");
		
		km2ecoreGen.save();
		internalLog.info("Ecore file has been saved");
			
//		kermetafile.getParent().refreshLocal(1, null);
	
		Compiler compiler = new Compiler(ecorePath, unit, km2ecoreGen, helperModel);
		
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
	 * @param unit
	 */
	private static HelperModel prettyPrintJavaCode(EcoreExporter km2ecore, KermetaUnit unit) {
		
		HelperModel helperModel = new HelperModel();
		
		try {
			KM2JavaPrettyPrinter prettyPrinter = new KM2JavaPrettyPrinter();

			prettyPrinter.setHelperModel(helperModel);
			
			for(TypeDefinition aTypeDef : fr.irisa.triskell.kermeta.modelhelper.KermetaUnitHelper.getTypeDefinitions(unit)) {
				if(aTypeDef instanceof ClassDefinition) {
					ClassDefinition aClassDef = (ClassDefinition) aTypeDef;
					for(Operation op : aClassDef.getOwnedOperation()) {
						if (op.getBody() != null) {
							// (if "typedef" is false, then it means that prettyPrinter is not in typdef
							// context, so it will prettyPrint visited node accordingly)
							prettyPrinter.setTypedef(false);
							String bodyString = (String) prettyPrinter.accept(op);
							
							//if(!bodyString.equals("{}")) {
							
								/*String resultType = "";
								if(op.getType()!=null) {
									if(op.getType() instanceof VoidType) {
										
									} else {
										Object resultTypeObj = prettyPrinter.accept(op.getType());
										if(resultTypeObj!=null) {
											resultType = (String) resultTypeObj;
											if(resultType.equals("void")) {
												resultType = "";
											}
										}
									}
								}
								
								if(!resultType.equals("")) {
									bodyString = resultType + " result=null;\n" + bodyString + "\nreturn result;";
								}*/
								
								EObject eObj = km2ecore.getKm2ecoremapping().get(op);
								if(eObj != null && eObj instanceof EOperation) {
									addAnnotation( 
										(EOperation) eObj,
										KM2Ecore.ANNOTATION_GENMODEL,
										KM2Ecore.ANNOTATION_BODY_DETAILS,
										bodyString,
										null);
									
									/*EOperation eOp = (EOperation) eObj;
									
									// Duplicate the EOperation to solve the problem of multiple inheritance
									KM2EcorePass1 aKM2EcorePass1 = new KM2EcorePass1(eOp.eResource(), km2ecore.getKm2ecoremapping(), unit, null, null);
									EOperation eOp_class = (EOperation) aKM2EcorePass1.accept(op);
									eOp_class.setName(eOp_class.getName() + "_" + ((EClass) eOp.eContainer()).getName());
									((EClass) eOp.eContainer()).getEOperations().add(eOp_class);*/
								}
							//}
						}
					}
				}
			}
			helperModel = prettyPrinter.getHelperModel();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return helperModel;
	}
	
	/**
	 * Fix Java source code into GenModel Annotations
	 * @param km2ecore
	 * @param unit
	 */
	private static void fixPrintJavaCode(EcoreExporter km2ecore, KermetaUnit unit) {
		
		try {
				
			//KM2JavaPrettyPrinter2 prettyPrinter = new KM2JavaPrettyPrinter2();
			
			for(TypeDefinition aTypeDef : fr.irisa.triskell.kermeta.modelhelper.KermetaUnitHelper.getTypeDefinitions(unit)) {
				if(aTypeDef instanceof ClassDefinition) {
					ClassDefinition aClassDef = (ClassDefinition) aTypeDef;
					for(Operation op : aClassDef.getOwnedOperation()) {
						if (op.getName().equals("assert")) {
							EObject eObj = km2ecore.getKm2ecoremapping().get(op);
							if(eObj != null && eObj instanceof EOperation) {
								EOperation eOp = (EOperation) eObj;
								eOp.setName("_assert");
							}
						}
						if (op.getBody() != null) {
							EObject eObj = km2ecore.getKm2ecoremapping().get(op);
							
							if(eObj != null && eObj instanceof EOperation) {
								
								EOperation eOp = (EOperation) eObj;
								EAnnotation javaAnnotation = eOp.getEAnnotation(KM2Ecore.ANNOTATION_GENMODEL);
								if(javaAnnotation != null) {
									String fixedCode = javaAnnotation.getDetails().get(0).getValue().replace("~","");
									fixedCode = fixedCode.replace(".equals(null)"," == null");
									fixedCode = fixedCode.replace(".size().equals",".size() == ");
									fixedCode = fixedCode.replace("assert(","_assert(");
									fixedCode = fixedCode.replace("StdIO.writeln","System.out.println");
									
									javaAnnotation.getDetails().get(0).setValue(fixedCode);
								}
							}
						}
					}
				}
				/*if( aTypeDef instanceof fr.irisa.triskell.kermeta.language.structure.Class) {
					fr.irisa.triskell.kermeta.language.structure.Class aClass = (fr.irisa.triskell.kermeta.language.structure.Class) aTypeDef;
					if( aClass.getTypeDefinition() instanceof fr.irisa.triskell.kermeta.standard.String) {
						
					}
				}*/
			}
		} catch (Exception e) {
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
