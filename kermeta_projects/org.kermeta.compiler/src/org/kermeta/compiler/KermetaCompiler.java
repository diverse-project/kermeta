/* $Id: KermetaCompiler.java,v 1.5 2008-05-27 13:29:29 cfaucher Exp $
 * Project   : fr.irisa.triskell.kermeta.compiler
 * File      : CompileKermetaAction.java
 * License   : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Feb 22, 2007
 * Authors       : cfaucher
 */

package org.kermeta.compiler;

import java.io.IOException;
import java.util.LinkedHashSet;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFile;
import org.kermeta.compiler.model.compiler.impl.AbstractCompilerImpl;
import org.kermeta.io.KermetaUnit;
import org.kermeta.io.loader.plugin.LoaderPlugin;
import org.kermeta.merger.Merger;

import fr.irisa.triskell.eclipse.resources.URIHelper;
import fr.irisa.triskell.kermeta.exceptions.NotRegisteredURIException;
import fr.irisa.triskell.kermeta.exceptions.URIMalformedException;
import fr.irisa.triskell.kermeta.exporter.ecore.EcoreExporter;
import fr.irisa.triskell.kermeta.exporter.ecore.ExporterOptions;
import fr.irisa.triskell.kermeta.exporter.km.KmExporter;
import fr.irisa.triskell.kermeta.modelhelper.KermetaUnitHelper;
import org.kermeta.log4j.util.LogConfigurationHelper;

public class KermetaCompiler extends AbstractCompilerImpl {

	protected IFile kermetafile;
	private EcoreExporter km2ecoreGen;

	final static public Logger internalLog = LogConfigurationHelper.getLogger("KermetaCompiler");

	/**
	 * Constructor for CompileKermetaAction.
	 */
	public KermetaCompiler(IFile kermetaFile) {
		super();
		this.kermetafile = kermetaFile;
		km2ecoreGen = new EcoreExporter();
	}

	public void run() {

		String ecorePath = kermetafile.getLocation().removeFileExtension().addFileExtension("ecore").toString();
		
		// Create the KermetaUnit
		KermetaUnit unit = null;
		try {
			unit = LoaderPlugin.getDefault().load("platform:/resource/" + kermetafile.getFullPath(), null);
			unit.setLocked(true);

			this.generateEcoreVersion(unit);
			// Save the tracer that store the "km2ecoremapping" trace 
			//saveKm2ecoremappingTracer(km2ecoreGen);
			
			
			// TODO CF The prettyprinting of Java Code should be now used the Km2Java written in Kermeta
			//prettyPrintJavaCode(km2ecoreGen,unit);
	
			//fixPrintJavaCode(km2ecoreGen,unit);
			internalLog.info("Java source code has been printed inside GenModel EAnnotations");
			
			km2ecoreGen.save();
			internalLog.info("Ecore file has been saved");
			
			// kermetafile.getParent().refreshLocal(1, null);
	
			Compiler compiler = new Compiler(ecorePath, unit, km2ecoreGen);
			// run the generation of Java Classes
			compiler.run();
			internalLog.info("The compilation process is complete");
			
			//unit.setLocked(false);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			unit.setLocked(false);
		}
		
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
	}*/
	
	
	private EcoreExporter generateEcoreVersion(KermetaUnit unit) {
		// Generate Ecore in memory and saving in file
		String ecoreRelativePath = kermetafile.getFullPath().removeFileExtension().addFileExtension("ecore").toString();
		
		ExporterOptions exporterOptions = ExporterOptions.getDefault();
		exporterOptions.isIndependent = true;
		exporterOptions.isOnlyStructural = false; // method's body will be generated
		exporterOptions.isExportedWithMerger = true;
		exporterOptions.isRemoveKermetaEAnnotations = false;
		
		if(exporterOptions.isExportedWithMerger) {
			LinkedHashSet<KermetaUnit> relatedUnit = new LinkedHashSet<KermetaUnit>();
			relatedUnit.add( unit );
			relatedUnit.addAll( KermetaUnitHelper.getAllImportedKermetaUnits(unit) );
			Merger mergedVersion = new Merger();
		
			
			for ( KermetaUnit kunit : relatedUnit )
				kunit.setLocked(true);
				
			try {

					unit = mergedVersion.processInMemory(relatedUnit,"platform:/resource" + ecoreRelativePath);
			} catch (NotRegisteredURIException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (URIMalformedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			for ( KermetaUnit kunit : relatedUnit )
				kunit.setLocked(false);
		}
		
	
		/* ResourceSet resource_set = */km2ecoreGen.exportInMemory(unit, kermetafile.getParent().getFullPath().toString(), exporterOptions);
		internalLog.info("Ecore structure has been generated");
		
		KmExporter kmExporter = new KmExporter();
		kmExporter.export(unit, URIHelper.removeFileName(unit.getUri()), true);
		
		return km2ecoreGen;
	}

	/**
	 * Pretty-print Java source code into GenModel Annotations
	 * 
	 * @param km2ecore
	 * @param unit
	 */
	/*private void prettyPrintJavaCode(EcoreExporter km2ecore, KermetaUnit unit) {

		IFile simk_file = ResourcesPlugin.getWorkspace().getRoot().getFile(
				kermetafile.getFullPath().removeFileExtension()
						.addFileExtension(SimkModelHelper.SIMK_EXT));
		SIMKModel simkModel = SimkModelHelper.createSIMKModel(simk_file);
		simkModel.setName(simk_file.getName());

		try {
			KM2JavaPrettyPrinter prettyPrinter = new KM2JavaPrettyPrinter(
					km2ecore);

			prettyPrinter.setHelperModel(simkModel);
			
			String mainClass = "";
			String mainOperation = "";
			// The two parameters must be setted
			if( ModelingUnitHelper.getMainClassAsString(unit) != null && ModelingUnitHelper.getMainOperationAsString(unit) != null ) {
				mainClass = ModelingUnitHelper.getMainClassAsString(unit);
				mainOperation = ModelingUnitHelper.getMainOperationAsString(unit);
			}

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

							EObject eObj = km2ecore.getKm2ecoremapping()
									.get(op);
							if (eObj != null && eObj instanceof EOperation) {
								CompilerUtil.addAnnotation((EOperation) eObj,
										KM2Ecore.ANNOTATION_GENMODEL,
										KM2Ecore.ANNOTATION_BODY_DETAILS,
										bodyString, null);

								EOperation eOp = (EOperation) eObj;

								if ( CompilerUtil.isRunnable(eOp)
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
						}
					}
				}
			}
			
			// Save in a file the simk helper model
			prettyPrinter.getHelperModel().eResource().save(null);
		} catch (Exception e) {
			e.printStackTrace();
		}*/
	}

	/**
	 * Fix Java source code into GenModel Annotations
	 * 
	 * @param km2ecore
	 * @param unit
	 */
	/*private static void fixPrintJavaCode(EcoreExporter km2ecore,
			KermetaUnit unit) {

		try {

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
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}*/

//}
