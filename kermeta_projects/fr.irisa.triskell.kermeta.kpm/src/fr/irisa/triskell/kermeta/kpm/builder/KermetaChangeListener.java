package fr.irisa.triskell.kermeta.kpm.builder;

import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.runtime.CoreException;

import fr.irisa.triskell.kermeta.kpm.KPM;

public class KermetaChangeListener implements IResourceChangeListener {

	private KPM kpm;
	
	public KermetaChangeListener(KPM kpm) {
		this.kpm = kpm;
	}
	
	public void resourceChanged(IResourceChangeEvent event) {
		
		switch ( event.getType() ) {
		
		case IResourceChangeEvent.POST_CHANGE :
			KermetaDeltaVisitor visitor = new KermetaDeltaVisitor(kpm);
			try {
				event.getDelta().accept(visitor);
			} catch (CoreException exception) {
				System.out.println("POST_CHANGE exception : ");
				exception.printStackTrace();
			}
			break;
			
		default :
			break;
		
		}

	}

}
