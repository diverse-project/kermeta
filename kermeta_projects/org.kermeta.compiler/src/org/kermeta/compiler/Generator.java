/**
 * <copyright> 
 *
 * Copyright (c) 2002-2006 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: 
 *   IBM - Initial API and implementation
 *
 * </copyright>
 *
 * $Id: Generator.java,v 1.8 2009-01-08 17:27:27 cfaucher Exp $
 */
package org.kermeta.compiler;


import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceDescription;
import org.eclipse.core.resources.IWorkspaceRunnable;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.codegen.ecore.CodeGenEcorePlugin;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenModelFactory;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.codegen.ecore.genmodel.generator.GenBaseGeneratorAdapter;
import org.eclipse.emf.codegen.util.CodeGenUtil;
import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.emf.common.util.Monitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;
import org.xml.sax.Attributes;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.DefaultHandler;
import org.xml.sax.helpers.XMLReaderFactory;


/**
 * This implements the method {@link #run}, 
 * which is called just like main during headless workbench invocation.
 */
public class Generator extends org.eclipse.emf.codegen.ecore.Generator
{
	
	@Override
	public Object run(Object object) 
	{
		return PlatformRunnable.run(this, object);
	}
 
  public static class PlatformRunnable extends Generator implements IApplication, DeprecatedPlatformRunnable
  {
    public Object start(IApplicationContext context) throws Exception
    {
      String [] args = (String[])context.getArguments().get(IApplicationContext.APPLICATION_ARGS);
      return run(args == null ? new String[0] : args);
    }
    
    public void stop()
    {
      // Do nothing
    }
    
    /**
     * This is called with the command line arguments of a headless workbench invocation.
     */
    @Override
    public Object run(Object object) 
    {
       return run(this, object);
    }
    
    /**
     * This is called with the command line arguments of a headless workbench invocation.
     */
    public static Object run(final Generator generator, Object object) 
    {
      try
      {
        final String[] arguments = (String[])object;
        final IWorkspace workspace = ResourcesPlugin.getWorkspace();
        IWorkspaceRunnable runnable = 
          new IWorkspaceRunnable()
          {
            public void run(IProgressMonitor progressMonitor) throws CoreException
            {
              Monitor monitor = BasicMonitor.toMonitor(progressMonitor);
              try
              {
                if (arguments.length == 0)
                {
                  generator.printGenerateUsage();
                }
                else if ("-ecore2GenModel".equalsIgnoreCase(arguments[0]))
                {
                  IPath ecorePath = new Path(arguments[1]);
                  generator.basePackage = arguments[2];
                  String prefix = arguments[3];
  
                  ResourceSet resourceSet = new ResourceSetImpl();
                  resourceSet.getURIConverter().getURIMap().putAll(EcorePlugin.computePlatformURIMap()); 
                  URI ecoreURI = URI.createFileURI(ecorePath.toString());
                  Resource resource = resourceSet.getResource(ecoreURI, true);
                  // Kermeta compiler customization
                  List<EPackage> availablePackageList = new ArrayList<EPackage>();
                  for(org.eclipse.emf.ecore.EObject eObj : resource.getContents()) {
                  	if(eObj instanceof EPackage) {
                  		availablePackageList.add((EPackage) eObj);
                  	}
                  }
                  //EPackage ePackage = (EPackage)resource.getContents().get(0);
  
                  IPath genModelPath = ecorePath.removeFileExtension().addFileExtension("genmodel");
                  progressMonitor.beginTask("", 2);
                  progressMonitor.subTask("Creating " + genModelPath);
  
                  URI genModelURI = URI.createFileURI(genModelPath.toString());
                  Resource genModelResource = 
                    Resource.Factory.Registry.INSTANCE.getFactory(genModelURI).createResource(genModelURI);
                  GenModel genModel = GenModelFactory.eINSTANCE.createGenModel();
                  genModelResource.getContents().add(genModel);
                  resourceSet.getResources().add(genModelResource);
                  genModel.setModelDirectory("/TargetProject/src");
                  genModel.getForeignModel().add(ecorePath.toString());
                  // Kermeta compiler customization
                  genModel.initialize(availablePackageList/*Collections.singleton(ePackage)*/);
                  GenPackage genPackage = genModel.getGenPackages().get(0);
                  genModel.setModelName(genModelURI.trimFileExtension().lastSegment());
  
                  genPackage.setPrefix(prefix);
                  genPackage.setBasePackage(generator.basePackage);
  
                  progressMonitor.worked(1);
  
                  if (arguments.length > 4 && "-sdo".equals(arguments[4]))
                  {
                    setSDODefaults(genModel);
                  }
  
                  genModelResource.save(Collections.EMPTY_MAP);
                }
                else
                {
                  String rootLocation = null;
                  boolean dynamicTemplates = false;
                  boolean diff = false;
                  boolean forceOverwrite = false;
                  boolean generateSchema = false;
                  boolean nonNLSMarkers = false;
                  boolean codeFormatting = false;
                  String profileFile = null;
                  boolean model = false;
                  boolean edit = false;
                  boolean editor = false;
                  boolean tests = false;
                  Boolean autoBuild = null;
                  
                  int index = 0;
                  for (; index < arguments.length && arguments[index].startsWith("-"); ++index)
                  {
                    if (arguments[index].equalsIgnoreCase("-projects"))
                    {
                      rootLocation = new File(arguments[++index]).getAbsoluteFile().getCanonicalPath();
                    }
                    else if (arguments[index].equalsIgnoreCase("-autoBuild"))
                    {
                      autoBuild = Boolean.valueOf(arguments[++index]);
                    }
                    else if (arguments[index].equalsIgnoreCase("-dynamicTemplates"))
                    {
                      dynamicTemplates = true;
                    }
                    else if (arguments[index].equalsIgnoreCase("-diff"))
                    {
                      diff = true;
                    }
                    else if (arguments[index].equalsIgnoreCase("-forceOverwrite"))
                    {
                      forceOverwrite = true;
                    }
                    else if (arguments[index].equalsIgnoreCase("-generateSchema"))
                    {
                      generateSchema = true;
                    }
                    else if (arguments[index].equalsIgnoreCase("-nonNLSMarkers"))
                    {
                      nonNLSMarkers = true;
                    }
                    else if (arguments[index].equalsIgnoreCase("-codeFormatting"))
                    {
                      codeFormatting = true;
                      profileFile = arguments[++index];
                      if ("default".equals(profileFile))
                      {
                        profileFile = null;
                      }
                    }
                    else if (arguments[index].equalsIgnoreCase("-model"))
                    {
                      model = true;
                    }
                    else if (arguments[index].equalsIgnoreCase("-edit"))
                    {
                      edit = true;
                    }
                    else if (arguments[index].equalsIgnoreCase("-editor"))
                    {
                      editor = true;
                    }
                    else if (arguments[index].equalsIgnoreCase("-tests"))
                    {
                      tests = true;
                    }
                    else
                    {
                      throw new CoreException(
                        new Status(
                          IStatus.ERROR,
                          CodeGenEcorePlugin.getPlugin().getBundle().getSymbolicName(),
                          0,
                          "Unrecognized argument: '" + arguments[index] + "'",
                          null));
                    }
                  }
  
                  if (!model && !edit && !editor && !tests)
                  {
                    model = true;
                  }
  
                  // This is the name of the model.
                  //
                  String genModelName = arguments[index++];
  
                  progressMonitor.beginTask("Generating " + genModelName, 2);
                  
                  if (autoBuild != null)
                  {
                    IWorkspaceDescription description = workspace.getDescription();
                    if (description.isAutoBuilding() != autoBuild.booleanValue())
                    {
                      description.setAutoBuilding(autoBuild.booleanValue());
                      try
                      {
                        workspace.setDescription(description);
                      }
                      catch (CoreException coreException)
                      {
                        generator.printStatus(
                          "Unable to set autoBuild to " + autoBuild.toString() + ".  Code generation will proceed normally.", 
                          coreException.getStatus());
                      }
                    }
                  }
            
                  // Create a resource set and load the model file into it.
                  //
                  ResourceSet resourceSet = new ResourceSetImpl();
                  resourceSet.getURIConverter().getURIMap().putAll(EcorePlugin.computePlatformURIMap());
                  URI genModelURI = URI.createFileURI(new File(genModelName).getAbsoluteFile().getCanonicalPath());
                  Resource genModelResource = resourceSet.getResource(genModelURI, true);
                  GenModel genModel = (GenModel)genModelResource.getContents().get(0);
  
                  IStatus status = genModel.validate();
                  if (!status.isOK())
                  {
                    generator.printStatus("", status);
                  }
                  else
                  {
                    org.eclipse.emf.codegen.ecore.generator.Generator gen = new org.eclipse.emf.codegen.ecore.generator.Generator();
                    gen.setInput(genModel);

                    if (dynamicTemplates)
                    {
                      genModel.setDynamicTemplates(true);
                    }
                    if (forceOverwrite)
                    {
                      genModel.setForceOverwrite(true);
                    }
                    if (diff)
                    {
                      genModel.setRedirection(".{0}.new");
                    }
    
                    if (index < arguments.length)
                    {
                      IPath path = new Path(genModel.getModelDirectory());
                      // This is the path of the target directory.
                      //
                      IPath targetRootDirectory = new Path(arguments[index]);
                      targetRootDirectory = new Path(targetRootDirectory.toFile().getAbsoluteFile().getCanonicalPath());
                      CodeGenUtil.EclipseUtil.findOrCreateContainer
                        (new Path(path.segment(0)),
                         true,
                         targetRootDirectory,
                         //DMS Why not this?
                         //new SubProgressMonitor(progressMonitor, 1));
                         BasicMonitor.toIProgressMonitor(CodeGenUtil.EclipseUtil.createMonitor(progressMonitor, 1)));
                    }
                    // This is to handle a genmodel produced by rose2genmodel.
                    //
                    else
                    {
                      String modelDirectory = genModel.getModelDirectory();
                      genModel.setModelDirectory(generator.findOrCreateContainerHelper(rootLocation, modelDirectory, monitor));
    
                      String editDirectory = genModel.getEditDirectory();
                      if (edit && editDirectory != null)
                      {
                        genModel.setEditDirectory(generator.findOrCreateContainerHelper(rootLocation, editDirectory, monitor));
                      }
    
                      String editorDirectory = genModel.getEditorDirectory();
                      if (editor && editorDirectory != null)
                      {
                        genModel.setEditorDirectory(generator.findOrCreateContainerHelper(rootLocation, editorDirectory, monitor));
                      }
  
                      String testsDirectory = genModel.getTestsDirectory();
                      if (tests && testsDirectory != null)
                      {
                        genModel.setTestsDirectory(generator.findOrCreateContainerHelper(rootLocation, testsDirectory, monitor));
                      }
                    }
    
                    genModel.setCanGenerate(true);
                    genModel.setUpdateClasspath(false);
    
                    if (generateSchema)
                    {
                      genModel.setGenerateSchema(true);
                    }
                    if (nonNLSMarkers)
                    {
                      genModel.setNonNLSMarkers(true);
                    }
                    if (codeFormatting)
                    {
                      genModel.setCodeFormatting(true);
                    }
  
                    if (profileFile != null)
                    {
                      Map<String, String> options = CodeFormatterProfileParser.parse(profileFile);
                      if (options == null)
                      {
                        throw new CoreException
                          (new Status
                            (IStatus.ERROR,
                       		CodeGenEcorePlugin.getPlugin().getBundle().getSymbolicName(),
                             0,
                             "Unable to read profile file: '" + profileFile + "'",
                             null));
                      }
                      gen.getOptions().codeFormatterOptions = options;
                      
                    }
  
                    if (model)
                    {
                      gen.generate(genModel, GenBaseGeneratorAdapter.MODEL_PROJECT_TYPE, CodeGenUtil.EclipseUtil.createMonitor(progressMonitor, 1));
                    }
                    if (edit)
                    {
                      gen.generate(genModel, GenBaseGeneratorAdapter.EDIT_PROJECT_TYPE, CodeGenUtil.EclipseUtil.createMonitor(progressMonitor, 1));
                    }
                    if (editor)
                    {
                      gen.generate(genModel, GenBaseGeneratorAdapter.EDITOR_PROJECT_TYPE, CodeGenUtil.EclipseUtil.createMonitor(progressMonitor, 1));
                    }
                    if (tests)
                    {
                      gen.generate(genModel, GenBaseGeneratorAdapter.TESTS_PROJECT_TYPE, CodeGenUtil.EclipseUtil.createMonitor(progressMonitor, 1));
                    }
                  }
                }
              }
              catch (CoreException exception)
              {
                throw exception;
              }
              catch (Exception exception)
              {
                throw 
                  new CoreException
                    (new Status
                      (IStatus.ERROR, CodeGenEcorePlugin.getPlugin().getBundle().getSymbolicName(), 0, "EMF Error", exception));
              }
              finally
              {
                progressMonitor.done();
              }
            }
          };
        workspace.run(runnable, new CodeGenUtil.EclipseUtil.StreamProgressMonitor(System.out));
  
        return new Integer(0);
      }
      catch (Exception exception)
      {
        generator.printGenerateUsage();
        exception.printStackTrace();
        CodeGenEcorePlugin.INSTANCE.log(exception);
        return new Integer(1);
      }
    }
  }
  
  /**
   * This parses a code formatter profile file, recording the options it sepecifies in a map.
   */
  static class CodeFormatterProfileParser extends DefaultHandler
  {
    private Map<String, String> options = null;

    private String SETTING = "setting";
    private String ID = "id";
    private String VALUE = "value";
    private String EMPTY = "";

    @Override
    public void startDocument()
    {
      options = new HashMap<String, String>();
    }

    @Override
    public void startElement(String namespaceURI, String localName, String qualifiedName, Attributes atts)
    {
      if (EMPTY.equals(namespaceURI) && SETTING.equals(localName))
      {
        String id = atts.getValue(EMPTY, ID); 
        String value = atts.getValue(EMPTY, VALUE);

        if (id != null && value != null)
        {
          options.put(id, value);
        }
      }
    }

    public Map<String, String> getOptions()
    {
      return options;
    }
 
    public static Map<String, String> parse(String systemID)
    {
      try
      {
        XMLReader parser = XMLReaderFactory.createXMLReader();
        CodeFormatterProfileParser handler = new CodeFormatterProfileParser();
        parser.setContentHandler(handler);
        parser.parse(systemID);
        return handler.getOptions();
      }
      catch (Exception e)
      {
        // Ignore
      }
      return null;
    }
  }

}

@SuppressWarnings("deprecation")
interface DeprecatedPlatformRunnable extends org.eclipse.core.runtime.IPlatformRunnable
{
  // Empty extension to limit the effect of suppressing the deprecation warning.
}
