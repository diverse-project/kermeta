package fr.irisa.triskell.kermeta.kpm.helpers;

import java.util.ArrayList;
import java.util.Date;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Set;

import fr.irisa.triskell.kermeta.kpm.Action;
import fr.irisa.triskell.kermeta.kpm.Dependency;
import fr.irisa.triskell.kermeta.kpm.Directory;
import fr.irisa.triskell.kermeta.kpm.Event;
import fr.irisa.triskell.kermeta.kpm.File;
import fr.irisa.triskell.kermeta.kpm.KpmFactory;
import fr.irisa.triskell.kermeta.kpm.Project;
import fr.irisa.triskell.kermeta.kpm.Type;

public class KPMHelper {

	static public File createFile (String fileName, String filePath) {
		File file = KpmFactory.eINSTANCE.createFile();
		file.setName(fileName);
		file.setPath(filePath);
		file.setLastTimeModified( new Date() );
		return file;
	}
	
	static public Directory createDirectory (String directoryName, String directoryPath) {
		Directory directory = KpmFactory.eINSTANCE.createDirectory();
		directory.setName(directoryName);
		directory.setPath(directoryPath);
		directory.setLastTimeModified( new Date() );
		return directory;
	}
	
	static public Project createProject (String projectName) {
		Project project = KpmFactory.eINSTANCE.createProject();
		project.setName(projectName);
		project.setPath("/");
		project.setLastTimeModified( new Date() );
		return project;
	}
	
	static public Dependency createDependency (String typeName, String eventName, ArrayList actionsName) {
		Dependency dependency = KpmFactory.eINSTANCE.createDependency();
		Type type = KpmFactory.eINSTANCE.createType();
		type.setName(typeName);
		dependency.setType( type );
		Event event = KpmFactory.eINSTANCE.createEvent();
		event.setName( eventName );
		dependency.setEvent(event);
		
		for ( String actionName : (ArrayList<String>) actionsName ) {
			Action action = KpmFactory.eINSTANCE.createAction();
			action.setName(actionName);		
			dependency.getActions().add(action);
		}
		
		return dependency;
	}
}
