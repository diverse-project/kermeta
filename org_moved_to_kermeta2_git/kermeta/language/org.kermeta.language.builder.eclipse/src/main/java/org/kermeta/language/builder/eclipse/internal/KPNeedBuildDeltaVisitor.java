/*$Id:  $
* License : EPL
* Copyright : IRISA / INRIA 
* ----------------------------------------------------------------------------
* Creation date : 21 avr. 2011
* Authors : 
*      Didier Vojtisek <didier.vojtisek@inria.fr>
*/
package org.kermeta.language.builder.eclipse.internal;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.runtime.CoreException;
import org.kermeta.language.builder.eclipse.Activator;
import org.kermeta.language.builder.eclipse.KermetaBuilder;
import org.kermeta.utils.systemservices.api.messaging.MessagingSystem.Kind;




/**
 * This class is in charge of dealing with Delta changes 
 * and filtering them according to a given KP project file in order to know if it has to be built or not
 */
public class KPNeedBuildDeltaVisitor implements IResourceDeltaVisitor {

	protected IFile kpProjectFile;
	
	protected boolean buildNeeded = false;
	
	protected List<URL> concernedURLs = new ArrayList<URL>();
	
	private KermetaBuilder kermetaBuilder = KermetaBuilder.getDefault();
	
	public KPNeedBuildDeltaVisitor(IFile kpProjectFile) {
		super();
		this.kpProjectFile = kpProjectFile;
		kermetaBuilder.kpBuilders.get(kermetaBuilder.generateIdentifier(kpProjectFile));
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
