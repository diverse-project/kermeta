package fr.irisa.triskell.kermeta.kpm.helpers;

import java.util.Date;
import java.util.ArrayList;

import fr.irisa.triskell.kermeta.kpm.Directory;
import fr.irisa.triskell.kermeta.kpm.File;
import fr.irisa.triskell.kermeta.kpm.KPM;
import fr.irisa.triskell.kermeta.kpm.workspace.KermetaWorkspace;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.loader.StdLibKermetaUnitHelper;

public class DependencyHelper {

	static public void addTypecheckingDependencies( File file ) {
		
		String extension = file.getExtension();
		
		addUpdateDependencies(file);
		
		if ( extension.equals(".kmt") )
			addBasicTypeCheckingDependencies(file);
			//addTypecheckingDependenciesToKMTFile( file );
		
		
	}
	
	static private void addBasicTypeCheckingDependencies(File file) {
		KPM kpm = file.getKpm();
		ArrayList <String> actions = new ArrayList <String> ();
		actions = new ArrayList <String> ();
		actions.add( "fr.irisa.triskell.kermeta.kpm.actions.SimpleTypecheck" );
		kpm.createDependency(file, file, "basic_typechecking", "simple_typecheck", actions);
	}
	
	
	static private void addUpdateDependencies(File file) {
		KPM kpm = file.getKpm();
		ArrayList <String> actions = new ArrayList <String> ();
		actions.add( "fr.irisa.triskell.kermeta.kpm.actions.UpdateUnit" );
		kpm.createDependency(file, file, "synchro", "update", actions);
	}
	
	
	static public void addTypecheckingDependenciesToKMTFile(File kmtFile) {
		addTypecheckingDependenciesToKMTFile(kmtFile, kmtFile.getContainer());
	}
	
	static public void addTypecheckingDependenciesToKMTFile(File kmtFile, Directory target) {
		
		KPM kpm = kmtFile.getKpm();
		
		String fileName = StringHelper.getNewNameWithExtension(kmtFile, ".km");
		
		File kmFile = kpm.findFile(fileName, target.getRelativeName() );
		if ( kmFile == null ) {
			kmFile = kpm.createFile( fileName, target.getRelativeName() );
			kmFile.setLastTimeModified( new Date(0) );
		}		
		ArrayList <String> actions = new ArrayList <String> ();
		actions.add( "fr.irisa.triskell.kermeta.kpm.actions.SafeTypecheck" );
		kpm.createDependency(kmtFile, kmFile, "typechecking", "safe_typecheck", actions);
		//kpm.createDependency(kmFile, kmtFile, "typechecking", "safe_typecheck", actions);
		
		actions = new ArrayList <String> ();
		actions.add( "fr.irisa.triskell.kermeta.kpm.actions.Typecheck" );
		kpm.createDependency(kmtFile, kmFile, "typechecking", "typecheck", actions);
		//kpm.createDependency(kmFile, kmtFile, "typechecking", "typecheck", actions);
		
	}


	static public void addRequireDependencies( KermetaUnit unit) {
		
		if ( unit != null ) {
		
			ArrayList <String> actions = new ArrayList <String> ();
			actions.add( "fr.irisa.triskell.kermeta.kpm.actions.MarkDependingFiles" );
			
			String relativeFileName = StringHelper.getRelativeName(unit.getUri());
			
			File mainFile = KermetaWorkspace.getInstance().getFile(relativeFileName);
	
			KPM kpm = mainFile.getKpm();
			
			for ( KermetaUnit currentUnit : unit.importedUnits ) {
					
				if ( currentUnit != StdLibKermetaUnitHelper.getKermetaUnit() ) {
					String relativeImportedFileName = StringHelper.getRelativeName(currentUnit.getUri());
					File importedFile = KermetaWorkspace.getInstance().getFile(relativeImportedFileName);
					if ( importedFile != null ) {
						if ( importedFile.findDependency(mainFile, "require", "generate_marker") == null )
							kpm.createDependency(importedFile, mainFile, "require", "generate_marker", actions);
					}
				}
			}
		}
	}



}
