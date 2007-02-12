package fr.irisa.triskell.kermeta.kpm.helpers;


import java.util.Date;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;

import fr.irisa.triskell.kermeta.kpm.Action;
import fr.irisa.triskell.kermeta.kpm.And;
import fr.irisa.triskell.kermeta.kpm.Dependency;
import fr.irisa.triskell.kermeta.kpm.DependencyEvent;
import fr.irisa.triskell.kermeta.kpm.DependencyType;
import fr.irisa.triskell.kermeta.kpm.Directory;
import fr.irisa.triskell.kermeta.kpm.ExistFilter;
import fr.irisa.triskell.kermeta.kpm.Expression;
import fr.irisa.triskell.kermeta.kpm.File;
import fr.irisa.triskell.kermeta.kpm.KPM;
import fr.irisa.triskell.kermeta.kpm.KpmFactory;
import fr.irisa.triskell.kermeta.kpm.NameFilter;

public class KpmHelper {

	static public KPM createKpm() {
		
		KPM kpm = KpmFactory.eINSTANCE.createKPM();
		initializeKpm(kpm);
		return kpm;
		
	}
	
	static private void initializeKpm(KPM kpm) {
		addEvents(kpm);
		addDependencyTypes(kpm);
		addActions(kpm);
		addFilters(kpm);
		addExpressions(kpm);
		addDependencies(kpm);
	}
	
	
	static private void addEvents(KPM kpm) {
		
		// update event
		DependencyEvent event = KpmFactory.eINSTANCE.createDependencyEvent();
		event.setName( "update" );
		kpm.getEvents().add( event );
		
		// typecheck event
		event = KpmFactory.eINSTANCE.createDependencyEvent();
		event.setName( "open" );
		kpm.getEvents().add( event );
		
	}
	
	
	static private void addDependencyTypes(KPM kpm) {
		
		// Translation type
		DependencyType type = KpmFactory.eINSTANCE.createDependencyType();
		type.setName( "translation" );
		kpm.getTypes().add( type );
		
		// Translation type
		type = KpmFactory.eINSTANCE.createDependencyType();
		type.setName( "synchro" );
		kpm.getTypes().add( type );
		
	}

	
	static private void addActions(KPM kpm) {

		// Typecheck action
		Action action = KpmFactory.eINSTANCE.createAction();
		action.setName( "fr.irisa.triskell.kermeta.kpm.actions.typecheck" );
		kpm.getActions().add( action );
		
		// KMT2KM action
		action = KpmFactory.eINSTANCE.createAction();
		action.setName( "fr.irisa.triskell.kermeta.kpm.actions.kmt2km" );
		kpm.getActions().add( action );

		// KMT2Ecore action
		action = KpmFactory.eINSTANCE.createAction();
		action.setName( "fr.irisa.triskell.kermeta.kpm.actions.kmt2ecore" );
		kpm.getActions().add( action );
		
		// TypecheckKMTFile action
		/*action = KpmFactory.eINSTANCE.createAction();
		action.setName( "fr.irisa.triskell.kermeta.kpm.actions.UpdateKMT" );
		kpm.getActions().add( action );*/
		
		// MarkDependents action
		action = KpmFactory.eINSTANCE.createAction();
		action.setName( "fr.irisa.triskell.kermeta.kpm.actions.markdependents" );
		kpm.getActions().add( action );
	}

	
	static private void addFilters(KPM kpm) {
		
		// *.kmt filter
		NameFilter filter = KpmFactory.eINSTANCE.createNameFilter();
		filter.setRegexIn( ".+\\.kmt" );
		filter.setRegexOut( "*.kmt" );
		kpm.getFilters().add( filter );
		
		// *.km filter
		filter = KpmFactory.eINSTANCE.createNameFilter();
		filter.setRegexIn( ".+\\.km" );
		filter.setRegexOut( "*.km" );
		kpm.getFilters().add( filter );
		
		// *.ecore filter
		filter = KpmFactory.eINSTANCE.createNameFilter();
		filter.setRegexIn( ".+\\.ecore" );
		filter.setRegexOut( "*.ecore" );
		kpm.getFilters().add( filter );
		
		// exist filter
		ExistFilter efilter = KpmFactory.eINSTANCE.createExistFilter();
		kpm.getFilters().add( efilter );
		
	}
	
	static private void addExpressions(KPM kpm) {
		
		Expression expression = KpmFactory.eINSTANCE.createExpression();
		expression.setId("KMT expr");
		expression.setFilter( kpm.getNameFilter(".+\\.kmt") );
		kpm.getExpressions().add(expression);
		
		expression = KpmFactory.eINSTANCE.createExpression();
		expression.setId("KM expr");
		expression.setFilter( kpm.getNameFilter(".+\\.km") );
		kpm.getExpressions().add(expression);
		
		expression = KpmFactory.eINSTANCE.createExpression();
		expression.setId("Ecore expr");
		expression.setFilter( kpm.getNameFilter(".+\\.ecore") );
		And subexpression = KpmFactory.eINSTANCE.createAnd();
		subexpression.setFilter(kpm.getExistFilter());
		expression.getSubExpressions().add(subexpression);
		kpm.getExpressions().add(expression);
	}
	
	static private void addDependencies(KPM kpm) {
		
		// d1
		Dependency dependency = KpmFactory.eINSTANCE.createDependency();
		dependency.setName( "d1" );
		dependency.setEvent( kpm.getEvent("update") );
		dependency.setType( kpm.getType("synchro") );
		dependency.setIn( kpm.getExpression("KMT expr") );
		dependency.getOuts().add( kpm.getExpression("KM expr") );
		dependency.getOuts().add( kpm.getExpression("Ecore expr") );
		//dependency.getActions().add( kpm.getAction("fr.irisa.triskell.kermeta.kpm.actions.UpdateKMT"));
		dependency.getActions().add( kpm.getAction("fr.irisa.triskell.kermeta.kpm.actions.typecheck"));
		dependency.getActions().add( kpm.getAction("fr.irisa.triskell.kermeta.kpm.actions.kmt2ecore"));
		dependency.getActions().add( kpm.getAction("fr.irisa.triskell.kermeta.kpm.actions.kmt2km"));
		dependency.getActions().add( kpm.getAction("fr.irisa.triskell.kermeta.kpm.actions.markdependents"));
		kpm.getDependencies().add(dependency);
		

		// d2
		dependency = KpmFactory.eINSTANCE.createDependency();
		dependency.setName( "d2" );
		dependency.setEvent( kpm.getEvent("open") );
		dependency.setIn( kpm.getExpression("KMT expr") );
		dependency.getActions().add( kpm.getAction("fr.irisa.triskell.kermeta.kpm.actions.typecheck") );
		kpm.getDependencies().add( dependency );
		
		// update
		dependency = KpmFactory.eINSTANCE.createDependency();
		dependency.setName( "updateEditor" );
		dependency.setEvent( kpm.getEvent("update") );
		dependency.setIn( kpm.getExpression("KMT expr") );
		dependency.setType( kpm.getType("synchro") );
		dependency.getActions().add( kpm.getAction("fr.irisa.triskell.kermeta.kpm.actions.typecheck") );
		kpm.getDependencies().add( dependency );
		
		// d2
		/*dependency = KpmFactory.eINSTANCE.createDependency();
		dependency.setName( "d2" );
		dependency.setEvent( kpm.getEvent("update") );
		dependency.setType( kpm.getType("synchro") );
		dependency.setIn( kpm.getExpression("KMT expr") );
		dependency.getOuts().add( kpm.getExpression("KM expr") );
		dependency.getOuts().add( kpm.getExpression("Ecore expr") );
		dependency.getActions().add( kpm.getAction("fr.irisa.triskell.kermeta.kpm.actions.UpdateKMT"));
		dependency.getActions().add( kpm.getAction("fr.irisa.triskell.kermeta.kpm.actions.MarkDependents"));
		kpm.getDependencies().add(dependency);*/

	}

	
	/*static public void createProject(IProject iProject, KPM kpm) {
		
		if ( kpm.findProject(iProject) != null )
			return;
		Project project = KpmFactory.eINSTANCE.createProject();
		project.setName( iProject.getName() );
		project.getDependencies().add( kpm.getDependency("d1") );
		kpm.getUnits().add( project );
		
	}*/
	
	static public File addFileWithOpenDependency(IFile ifile, KPM kpm) {
		File file = KpmFactory.eINSTANCE.createFile();
		file.setName( ifile.getName() );
		file.setPath( ifile.getFullPath().toString() );
		file.setKpm(kpm);
		file.setLastTimeModified( new Date() );
		kpm.getUnits().add( file );
		addOpenDependencyToFile(file, kpm);
		addUpdateDependencyToFile(file, kpm);
		return file;
	}
	
	static public void addOpenDependencyToFile(File file, KPM kpm) {
		Dependency dependency = kpm.getDependency("d2");
		file.getDependencies().add( dependency );
	}
	
	static public void addUpdateDependencyToFile(File file, KPM kpm) {
		Dependency dependency = kpm.getDependency("updateEditor");
		file.getDependencies().add( dependency );
	}
	
	static public File createKMTFile(IFile ifile, KPM kpm) {
		
		Dependency dependency = kpm.getDependency("d1");
		
		String containerPath = ifile.getFullPath().removeLastSegments(1).toString();
		Directory container = kpm.findDirectory(containerPath);
		if ( container == null )
			return null;
		
		File file = kpm.findFile(ifile);
		if ( file == null ) {
			file = KpmFactory.eINSTANCE.createFile();
			file.setName( ifile.getName() );
			file.setPath( ifile.getFullPath().toString() );
			file.setKpm(kpm);
			file.setLastTimeModified( new Date() );
			kpm.getUnits().add( file );
		}

		if ( dependency.couldBeExecutable(file) ) {
			file.getDependencies().add( dependency );
			container.getContents().add(file);
			file.setContainer(container);
		}
		return file;
	}
	
	
	static public Directory createDirectory(IFolder folder, KPM kpm) {
		
		if ( kpm.findDirectory(folder) != null )
			return null;
		
		String containerPath = folder.getFullPath().removeLastSegments(1).toString();
		Directory container = kpm.findDirectory(containerPath);
		if ( container == null ) 
			return null;		
		
		Directory directory = KpmFactory.eINSTANCE.createDirectory();
		directory.setName(folder.getName());
		directory.setPath(folder.getFullPath().toString());
		directory.setKpm(kpm);
		directory.setLastTimeModified( new Date() );
		container.getContents().add(directory);
		directory.setContainer(container);
		kpm.getUnits().add(directory);
		return directory;
	}
	
}
