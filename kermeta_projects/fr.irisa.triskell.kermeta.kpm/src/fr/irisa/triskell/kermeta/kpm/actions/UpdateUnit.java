package fr.irisa.triskell.kermeta.kpm.actions;

import fr.irisa.triskell.kermeta.kpm.Dependency;
import fr.irisa.triskell.kermeta.kpm.File;

public class UpdateUnit implements IAction {

	public void execute(Dependency dependency) {

		File file = (File) dependency.getTo();
		
		if ( file.isFile() ) {
			
			String extension = file.getExtension();
			
			if ( extension.equals(".km")
				|| extension.equals(".kmt") ) {
				
				if ( ! file.getContainer().isSource() )
					file.receiveEvent("simple_typecheck");		
				else
					file.receiveEvent("safe_typecheck");
			}

			
		}

	}

}
