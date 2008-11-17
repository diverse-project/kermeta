package org.kermeta.kompose.specialization_wizard.wizards;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IWorkspaceRunnable;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.pde.internal.core.natures.PDE;

public class SpecializationSupport {
	private SpecializerIntermediateDataContainer data;
	private IProject project;
	private IJavaProject javaProj;
	
	public IProject prepare(SpecializerIntermediateDataContainer data) throws CoreException{
		this.data=data;
		if(this.createProject()!=null){
			this.javaProj=JavaCore.create(this.project);
			this.createFolders();
		}
		return this.project;
	}
	
	public void createFolders() throws CoreException{
		IFolder srcDir=this.project.getFolder("src");
		IFolder modelDir=this.project.getFolder("model");
		IFolder kermetaDir=this.project.getFolder("kermeta");
		IFolder binDir = this.project.getFolder("bin");
		IFolder metaInf = this.project.getFolder("META-INF");
		
		if(!srcDir.exists()){
			srcDir.create(false, true, new NullProgressMonitor());
		}
		if(!modelDir.exists()){
			modelDir.create(false, true, new NullProgressMonitor());
		}
		if(!kermetaDir.exists()){
			kermetaDir.create(false, true, new NullProgressMonitor());
		}
		if(!binDir.exists()){
			binDir.create(false, true, new NullProgressMonitor());
		}
		if(!metaInf.exists()){
			metaInf.create(false, true, new NullProgressMonitor());
		}
      /*  javaProj.setRawClasspath(

                new IClasspathEntry[] {
                      JavaCore.newVariableEntry(new Path("JRE_LIB"), null, null),
                      JavaCore.newSourceEntry(srcDir.getFullPath())
                },

                binDir.getFullPath(),
                new NullProgressMonitor());
        */
        IPackageFragment o = javaProj.getPackageFragmentRoot(srcDir).createPackageFragment(this.data.getActivatorPackage(), false, new NullProgressMonitor());

        
        this.data.setActivatorDir(((IFolder)o.getResource()).getFile("Activator.java").getLocation().toOSString());
        
        o=javaProj.getPackageFragmentRoot(srcDir).createPackageFragment(this.data.getPopupPackage(), false, new NullProgressMonitor());
        
        this.data.setPopupDir(((IFolder)o.getResource()).getFile("Composer.java").getLocation().toOSString());
        
        o=javaProj.getPackageFragmentRoot(srcDir).createPackageFragment(this.data.getStartupPackage(), false, new NullProgressMonitor());
        
        this.data.setStartupClass(((IFolder)o.getResource()).getFile("RegisterStartup.java").getLocation().toOSString());
        
        this.data.setKmtDir(kermetaDir.getFile(data.getComposer_name()+".kmt").getLocation().toOSString());
        this.data.setMetainfDir(metaInf.getFile("MANIFEST.MF").getLocation().toOSString());
        this.data.setPluginXmlDir(this.project.getFile("plugin.xml").getLocation().toOSString());
        this.data.setPropertiesDir(this.project.getFile("build.properties").getLocation().toOSString());
        this.data.setRootDir(this.project.getLocation().toOSString());
        this.data.setClassPathFile(this.project.getFile(".classpath").getLocation().toOSString());
        this.data.setModelDir(modelDir.getFile(data.getModel_name()+".ecore").getLocation().toOSString());
	}
	
	
	public IProject createProject() throws CoreException{
			final IProjectDescription description = ResourcesPlugin.getWorkspace()
				.newProjectDescription(data.getPlugin_name());
		// description.setLocation( Platform.getLocation() );
		description.setLocation(null);

		final IProject project = ResourcesPlugin.getWorkspace().getRoot()
				.getProject(data.getPlugin_name());
		IWorkspaceRunnable operation = new IWorkspaceRunnable() {
			public void run(IProgressMonitor monitor) throws CoreException {
				project.create(description, monitor);
				project.open(monitor);
				addNatureToProject(project, PDE.PLUGIN_NATURE);
				addNatureToProject(project, JavaCore.NATURE_ID);
			}
		};
		ResourcesPlugin.getWorkspace().run(operation, null);
		this.project=project;
		return project;
	}
	
	private void addNatureToProject(final IProject project, final String natureID) throws CoreException {
		IWorkspaceRunnable operation = new IWorkspaceRunnable() {
		      public void run(IProgressMonitor monitor) throws CoreException {
		    	  if ( ! doesProjectHaveNature(project, natureID) ) {
		    		  IProjectDescription description = project.getDescription();
		    		  
		    		  String[] natures = description.getNatureIds();
		    		  String[] newNatures = new String[natures.length+1];
		    		  
		    		  for (int i=0; i<natures.length; i++)
		    			  newNatures[i] = natures[i];
		    		  
		    		  newNatures[natures.length] = natureID;
		    		  
		    		  description.setNatureIds( newNatures );
		    		  project.setDescription(description, null);
		    	  }
		      }
		};
		ResourcesPlugin.getWorkspace().run(operation, null);
	}
	
	private boolean doesProjectHaveNature(IProject project, String natureID) throws CoreException {
		// To get the project description, it must be opened
		if ( ! project.isOpen() ) 
			return false;
		return project.getDescription().hasNature( natureID );
	}
}
