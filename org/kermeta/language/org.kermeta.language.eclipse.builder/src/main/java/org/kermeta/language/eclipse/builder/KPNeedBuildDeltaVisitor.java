/*$Id:  $
* License : EPL
* Copyright : IRISA / INRIA 
* ----------------------------------------------------------------------------
* Creation date : 21 avr. 2011
* Authors : 
*      Didier Vojtisek <didier.vojtisek@inria.fr>
*/
package org.kermeta.language.eclipse.builder;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.runtime.CoreException;
import org.kermeta.kp.KermetaProject;
import org.kermeta.kp.Source;
import org.kermeta.kp.SourceQuery;
import org.kermeta.kp.loader.kp.api.KpLoaderImpl;
import org.kermeta.kp.compiler.commandline.KpVariableExpander;
import org.kermeta.utils.systemservices.api.messaging.MessagingSystem.Kind;




/**
 * This class is in charge of dealing with Delta changes 
 * and filtering them according to a given KP project file in order to know if it has to be built or not
 */
public class KPNeedBuildDeltaVisitor implements IResourceDeltaVisitor {



	protected IFile kpProjectFile;
	
	protected boolean buildNeeded = false;
	
	protected List<URL> concernedURLs = new ArrayList<URL>();
	
	public KPNeedBuildDeltaVisitor(IFile kpProjectFile) {
		super();
		this.kpProjectFile = kpProjectFile;
		refreshFileIndex();
	}


	@Override
	public boolean visit(IResourceDelta delta) throws CoreException {
		// Flag stating whether to continue the visit or not.
		boolean processResourceChildren = true;
		IResource res = delta.getResource();
		switch( delta.getResource().getType() ) {
		case IResource.FILE :
			if ((delta.getFlags() & IResourceDelta.CONTENT) == 0)
				  // we care only about content change
                return false;
			try {
				for(URL concernedURL : concernedURLs){
					if (res.getRawLocationURI().toURL().sameFile(concernedURL)){
						System.out.println("MUST BUILD KP project");
						buildNeeded = true;
					}
					else{
						System.out.println("build not required "+res.getRawLocationURI().toURL() +" != "+concernedURL );
					}
				}
			} catch (MalformedURLException e) {
				Activator.getDefault().getMessaggingSystem().log(Kind.DevERROR,"ignoring resource that doesn't resolve to an URL", this.getClass().getName(), e);
			}
			break;
		default :
			break;
		}
		return processResourceChildren;
	}

	/**
	 * Refreshes the list of files that are concerned by this visitor according to the KP definition
	 */
	public void refreshFileIndex(){
		String kpFileURL = kpProjectFile.getRawLocation().toString();
		KpLoaderImpl ldr = new KpLoaderImpl();
		KermetaProject kp = ldr.loadKp(kpFileURL);
		KpVariableExpander varExpander = new KpVariableExpander(kpFileURL);
		if(kp == null){
			Activator.getDefault().getMessaggingSystem().log(Kind.DevDEBUG,"kp file empty or incorrect " + kpProjectFile, this.getClass().getName());
			return;
		}
		List<Source> srcs = kp.getSources();
		for (Source src : srcs ){
			try {
				if (src instanceof SourceQuery){
					// deal with srcQuery
				/*	SourceQuery srcQuery = (SourceQuery) src;
					String fromDependencyUrl = varExpander.expandVariables(srcQuery.getFrom().getUrl());
					String indirectURL = "jar:"+fromDependencyUrl+"!"+varExpander.expandVariables(srcQuery.getQuery());
					Activator.getDefault().getMessaggingSystem().log(Kind.DevDEBUG,"SourceQuery : " + srcQuery + " from "+srcQuery.getFrom().getUrl()+" (expanded to : " +indirectURL +")", this.getClass().getName());
					concernedURLs.add(new URL(indirectURL));
					*/
				}
				else{
					String sourceURLWithVariable = ((Source) src).getUrl();
					sourceURLWithVariable = sourceURLWithVariable != null ? sourceURLWithVariable : ""; // default set to emptyString rather than null
					String sourceURL = varExpander.expandVariables(sourceURLWithVariable);
					Activator.getDefault().getMessaggingSystem().log(Kind.DevDEBUG,"sourceURL : " + sourceURLWithVariable + " (expanded to : " +sourceURL +")", this.getClass().getName());
					concernedURLs.add(new URL(sourceURL));
				}
			} catch (MalformedURLException e) {
				Activator.getDefault().getMessaggingSystem().log(Kind.DevERROR,"ignoring source that doesn't resolve to an URL", this.getClass().getName(), e);
				
			}
		}
		
	}


	public IFile getKpProjectFile() {
		return kpProjectFile;
	}


	public boolean isBuildNeeded() {
		return buildNeeded;
	}

	public void setBuildNeeded(boolean buildNeeded) {
		this.buildNeeded = buildNeeded;
	}

	
	
	
}
