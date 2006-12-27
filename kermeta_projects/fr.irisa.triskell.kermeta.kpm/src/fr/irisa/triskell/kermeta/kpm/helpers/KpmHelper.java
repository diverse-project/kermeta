package fr.irisa.triskell.kermeta.kpm.helpers;


import java.util.Date;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;


import fr.irisa.triskell.kermeta.kpm.Action;
import fr.irisa.triskell.kermeta.kpm.And;
import fr.irisa.triskell.kermeta.kpm.Dependency;
import fr.irisa.triskell.kermeta.kpm.DependencyEvent;
import fr.irisa.triskell.kermeta.kpm.DependencyType;
import fr.irisa.triskell.kermeta.kpm.Directory;
import fr.irisa.triskell.kermeta.kpm.ExistFilter;
import fr.irisa.triskell.kermeta.kpm.Expression;
import fr.irisa.triskell.kermeta.kpm.File;
import fr.irisa.triskell.kermeta.kpm.Filter;
import fr.irisa.triskell.kermeta.kpm.KPM;
import fr.irisa.triskell.kermeta.kpm.KpmFactory;
import fr.irisa.triskell.kermeta.kpm.NameFilter;
import fr.irisa.triskell.kermeta.kpm.Project;

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
		event.setName( "typecheck" );
		kpm.getEvents().add( event );
		
	}
	
	
	static private void addDependencyTypes(KPM kpm) {
		
		// Translation type
		DependencyType type = KpmFactory.eINSTANCE.createDependencyType();
		type.setName( "translation" );
		kpm.getTypes().add( type );
		
	}

	
	static private void addActions(KPM kpm) {
		
		// KMT2KM action
		Action action = KpmFactory.eINSTANCE.createAction();
		action.setName( "fr.irisa.triskell.kermeta.kpm.actions.KMT2KM" );
		kpm.getActions().add( action );

		// KMT2Ecore action
		action = KpmFactory.eINSTANCE.createAction();
		action.setName( "fr.irisa.triskell.kermeta.kpm.actions.KMT2Ecore" );
		kpm.getActions().add( action );
		
		// TypecheckKMTFile action
		action = KpmFactory.eINSTANCE.createAction();
		action.setName( "fr.irisa.triskell.kermeta.kpm.actions.UpdateKMT" );
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
		expression.setId("e1");
		expression.setFilter( kpm.getNameFilter(".+\\.kmt") );
		kpm.getExpressions().add(expression);
		
		expression = KpmFactory.eINSTANCE.createExpression();
		expression.setId("e2");
		expression.setFilter( kpm.getNameFilter(".+\\.km") );
		kpm.getExpressions().add(expression);
		
		expression = KpmFactory.eINSTANCE.createExpression();
		expression.setId("ExistEcore");
		expression.setFilter( kpm.getNameFilter(".+\\.ecore") );
		And subexpression = KpmFactory.eINSTANCE.createAnd();
		subexpression.setFilter(kpm.getExistFilter());
		expression.getSubExpressions().add(subexpression);
		kpm.getExpressions().add(expression);
	}
	
	static private void addDependencies(KPM kpm) {
		
		Dependency dependency = KpmFactory.eINSTANCE.createDependency();
		dependency.setName( "d1" );
		dependency.setEvent( kpm.getEvent("update") );
		dependency.setType( kpm.getType("synchro") );
		dependency.setIn( kpm.getExpression("e1") );
		dependency.getOuts().add( kpm.getExpression("e2") );
		dependency.getOuts().add( kpm.getExpression("ExistEcore") );
		dependency.getActions().add( kpm.getAction("fr.irisa.triskell.kermeta.kpm.actions.UpdateKMT"));
		kpm.getDependencies().add(dependency);
		


	}

	
	/*static public void createProject(IProject iProject, KPM kpm) {
		
		if ( kpm.findProject(iProject) != null )
			return;
		Project project = KpmFactory.eINSTANCE.createProject();
		project.setName( iProject.getName() );
		project.getDependencies().add( kpm.getDependency("d1") );
		kpm.getUnits().add( project );
		
	}*/
	
	static public void createKMTFile(IFile ifile, KPM kpm) {
		
		if ( kpm.findFile(ifile) != null )
			return;

		String containerPath = ifile.getFullPath().removeLastSegments(1).toString();
		Directory container = kpm.findDirectory(containerPath);
		if ( container == null )
			return;
		
		Dependency dependency = kpm.getDependency("d1");
		
		File file = KpmFactory.eINSTANCE.createFile();
		
		file.setName( ifile.getName() );
		file.setPath( ifile.getFullPath().toString() );
		
		if ( dependency.couldBeExecutable(file) ) {
			file.setKpm(kpm);
			file.getDependencies().add( dependency );
			file.setLastTimeModified( new Date() );
			container.getContents().add(file);
			file.setContainer(container);
			kpm.getUnits().add( file );
		}
		
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
