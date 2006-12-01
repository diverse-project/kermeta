package fr.irisa.triskell.kermeta.kpm.actions;

import java.util.ArrayList;
import java.util.HashSet;

import fr.irisa.triskell.kermeta.kpm.Dependency;
import fr.irisa.triskell.kermeta.kpm.File;

public class SafeTypecheck implements IAction {

	public void execute(Dependency dependency) {

		File from = (File) dependency.getFrom();
		
		File mostRecentFile = mostRecentFile( from );
		
		if ( mostRecentFile != null ) {
		
			if ( mostRecentFile == from ) {
				from.receiveEvent( "typecheck" );
			} else {
				mostRecentFile.receiveEvent( "typecheck" );
			}
			
		}
		
	}

	private File mostRecentFile( File from ) {
		File mostRecentFile = from;
		int cpt = 0;
		HashSet <Dependency> dependencies = from.getDependencies("typechecking");
		for ( Dependency currentDependency : dependencies ) {
			File to = (File) currentDependency.getTo();
			
			if ( mostRecentFile.getLastTimeModified().before(to.getLastTimeModified()) )
				mostRecentFile = to;
			else if ( mostRecentFile.getLastTimeModified().equals(to.getLastTimeModified() ) )
				cpt++;
		}
		
		if ( mostRecentFile == from ) {
			if ( cpt == dependencies.size() )
				return null;
		}	
		return mostRecentFile;
	}
	
}
