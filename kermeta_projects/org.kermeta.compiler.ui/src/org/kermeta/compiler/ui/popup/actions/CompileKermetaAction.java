/* $Id: CompileKermetaAction.java,v 1.1 2008-01-31 13:21:17 cfaucher Exp $
 * Project   : fr.irisa.triskell.kermeta.compiler
 * File      : CompileKermetaAction.java
 * License   : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Feb 22, 2007
 * Authors       : cfaucher
 */

package org.kermeta.compiler.ui.popup.actions;

import java.io.IOException;
import java.util.Iterator;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.resource.Resource;
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
import org.kermeta.io.plugin.IOPlugin;
import org.kermeta.simk.SIMKModel;
import org.kermeta.simk.SMClass;
import org.kermeta.simk.SMContext;
import org.kermeta.simk.SMPackage;
import org.kermeta.simk.SMParameter;
import org.kermeta.simk.SMUsage;
import org.kermeta.simk.SimkFactory;
import org.kermeta.simk.StaticMethod;

import fr.irisa.triskell.eclipse.ecore.EcoreHelper;
import fr.irisa.triskell.kermeta.exceptions.KermetaIOFileNotFoundException;
import fr.irisa.triskell.kermeta.exceptions.URIMalformedException;
import fr.irisa.triskell.kermeta.exporter.ecore.EcoreExporter;
import fr.irisa.triskell.kermeta.exporter.ecore.KM2Ecore;
import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.Operation;
import fr.irisa.triskell.kermeta.language.structure.TypeDefinition;
import fr.irisa.triskell.kermeta.loader.kmt.KMT2KMPass7;
import fr.irisa.triskell.kermeta.modelhelper.ModelingUnitHelper;
import fr.irisa.triskell.kermeta.modelhelper.NamedElementHelper;
import fr.irisa.triskell.kermeta.util.LogConfigurationHelper;
import fr.irisa.triskell.traceability.TraceModel;
import fr.irisa.triskell.traceability.helper.Tracer;

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
	
	public void saveKm2ecoremappingTracer(EcoreExporter km2ecoreGen) {
		URI tracerUri = URI.createURI(km2ecoreGen.getSource().getUri());
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
			KermetaUnit ku_fromFile = IOPlugin.getDefault().loadKermetaUnit(
					kermetafile, new NullProgressMonitor());
			if (!ku_fromFile.isErroneous()) {
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
	 * 
	 * @param km2ecore
	 * @param unit
	 */
	private void prettyPrintJavaCode(EcoreExporter km2ecore, KermetaUnit unit) {

		IFile simk_file = ResourcesPlugin.getWorkspace().getRoot().getFile(
				kermetafile.getFullPath().removeFileExtension()
						.addFileExtension(SimkModelHelper.SIMK_EXT));
		SIMKModel simkModel = SimkModelHelper.createSIMKModel(simk_file);
		simkModel.setName(simk_file.getName());
		// SimkModelHelper helperModel = new SimkModelHelper();

		try {
			KM2JavaPrettyPrinter prettyPrinter = new KM2JavaPrettyPrinter(
					km2ecore);

			prettyPrinter.setHelperModel(simkModel);
			
			String mainClass = ModelingUnitHelper.getMainClass(unit).getValue();
			String mainOperation = ModelingUnitHelper.getMainOperation(unit).getValue();

			for (TypeDefinition aTypeDef : fr.irisa.triskell.kermeta.modelhelper.KermetaUnitHelper
					.getTypeDefinitions(unit)) {
				if (aTypeDef instanceof ClassDefinition) {
					ClassDefinition aClassDef = (ClassDefinition) aTypeDef;
					for (Operation op : aClassDef.getOwnedOperation()) {
						if (op.getBody() != null) {
							// (if "typedef" is false, then it means that
							// prettyPrinter is not in typdef
							// context, so it will prettyPrint visited node
							// accordingly)
							prettyPrinter.setTypedef(false);
							String bodyString = (String) prettyPrinter
									.accept(op);

							// if(!bodyString.equals("{}")) {

							/*
							 * String resultType = ""; if(op.getType()!=null) {
							 * if(op.getType() instanceof VoidType) {
							 *  } else { Object resultTypeObj =
							 * prettyPrinter.accept(op.getType());
							 * if(resultTypeObj!=null) { resultType = (String)
							 * resultTypeObj; if(resultType.equals("void")) {
							 * resultType = ""; } } } }
							 * 
							 * if(!resultType.equals("")) { bodyString =
							 * resultType + " result=null;\n" + bodyString +
							 * "\nreturn result;"; }
							 */

							EObject eObj = km2ecore.getKm2ecoremapping()
									.get(op);
							if (eObj != null && eObj instanceof EOperation) {
								addAnnotation((EOperation) eObj,
										KM2Ecore.ANNOTATION_GENMODEL,
										KM2Ecore.ANNOTATION_BODY_DETAILS,
										bodyString, null);

								EOperation eOp = (EOperation) eObj;

								/*
								 * // Duplicate the EOperation to solve the
								 * problem of multiple inheritance KM2EcorePass1
								 * aKM2EcorePass1 = new
								 * KM2EcorePass1(eOp.eResource(),
								 * km2ecore.getKm2ecoremapping(), unit, null,
								 * null); EOperation eOp_class = (EOperation)
								 * aKM2EcorePass1.accept(op);
								 * eOp_class.setName(eOp_class.getName() + "_" +
								 * ((EClass) eOp.eContainer()).getName());
								 * ((EClass)
								 * eOp.eContainer()).getEOperations().add(eOp_class);
								 */

								if (isRunnable(eOp)
										&& !EcoreHelper.getQualifiedName(eOp)
												.contains("kermeta")) {
									StaticMethod newStaticMethod = SimkFactory.eINSTANCE
											.createStaticMethod();
									newStaticMethod.setParentMethod(eOp);

									SMContext newSMContext = SimkFactory.eINSTANCE
											.createSMContext();
									newStaticMethod.setSMContext(newSMContext);
									newStaticMethod.getUsages().add(
											SMUsage.RUNNER);
									
									if(mainClass.equals(NamedElementHelper.getQualifiedName(aTypeDef)) && mainOperation.equals(op.getName())) {
										newStaticMethod.getUsages().add(
												SMUsage.LAUNCHER);
									}

									for (EParameter param : eOp
											.getEParameters()) {
										SMParameter newSMParameter = SimkFactory.eINSTANCE
												.createSMParameter();
										newSMParameter.setName(param.getName());
										newSMParameter.setType(param.getEType()
												.getName());
										newStaticMethod.getSMParameters().add(
												newSMParameter);
									}

									SMClass newSMClass = SimkFactory.eINSTANCE
											.createSMClass();
									newSMClass.setName(((ENamedElement) eOp
											.eContainer()).getName());

									SMPackage newSMPackage = SimkFactory.eINSTANCE
											.createSMPackage();
									newSMPackage.setName(((ENamedElement) eOp
											.eContainer().eContainer())
											.getName());

									newSMContext.setSMClass(newSMClass);
									newSMContext.setSMPackage(newSMPackage);
									newSMClass.setSMPackage(newSMPackage);

									prettyPrinter.getHelperModel()
											.getStaticMethods().add(
													newStaticMethod);
									prettyPrinter.getHelperModel()
											.getSMContexts().add(newSMContext);
								}
							}
							// }
						}
					}
				}
			}
			
			// Save in a file the simk helper model
			prettyPrinter.getHelperModel().eResource().save(null);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Fix Java source code into GenModel Annotations
	 * 
	 * @param km2ecore
	 * @param unit
	 */
	private static void fixPrintJavaCode(EcoreExporter km2ecore,
			KermetaUnit unit) {

		try {

			// KM2JavaPrettyPrinter2 prettyPrinter = new
			// KM2JavaPrettyPrinter2();

			for (TypeDefinition aTypeDef : fr.irisa.triskell.kermeta.modelhelper.KermetaUnitHelper
					.getTypeDefinitions(unit)) {
				if (aTypeDef instanceof ClassDefinition) {
					ClassDefinition aClassDef = (ClassDefinition) aTypeDef;
					for (Operation op : aClassDef.getOwnedOperation()) {
						if (op.getName().equals("assert")) {
							EObject eObj = km2ecore.getKm2ecoremapping()
									.get(op);
							if (eObj != null && eObj instanceof EOperation) {
								EOperation eOp = (EOperation) eObj;
								eOp.setName("_assert");
							}
						}
						if (op.getBody() != null) {
							EObject eObj = km2ecore.getKm2ecoremapping()
									.get(op);

							if (eObj != null && eObj instanceof EOperation) {

								EOperation eOp = (EOperation) eObj;
								EAnnotation javaAnnotation = eOp
										.getEAnnotation(KM2Ecore.ANNOTATION_GENMODEL);
								if (javaAnnotation != null) {
									String fixedCode = javaAnnotation
											.getDetails().get(0).getValue()
											.replace("~", "");
									fixedCode = fixedCode.replace(
											".equals(null)", " == null");
									fixedCode = fixedCode.replace(
											".size().equals", ".size() == ");
									fixedCode = fixedCode.replace("assert(",
											"_assert(");
									fixedCode = fixedCode.replace(
											"StdIO.writeln",
											"System.out.println");

									javaAnnotation.getDetails().get(0)
											.setValue(fixedCode);
								}
							}
						}
					}
				}
				/*
				 * if( aTypeDef instanceof
				 * fr.irisa.triskell.kermeta.language.structure.Class) {
				 * fr.irisa.triskell.kermeta.language.structure.Class aClass =
				 * (fr.irisa.triskell.kermeta.language.structure.Class)
				 * aTypeDef; if( aClass.getTypeDefinition() instanceof
				 * fr.irisa.triskell.kermeta.standard.String) {
				 *  } }
				 */
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
			newEAnnotation.getDetails().put(KMT2KMPass7.KERMETA_DOCUMENTATION,
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
