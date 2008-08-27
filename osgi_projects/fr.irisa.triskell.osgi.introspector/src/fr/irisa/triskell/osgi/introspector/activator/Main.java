package fr.irisa.triskell.osgi.introspector.activator;

import java.io.File;

import fr.irisa.triskell.osgi.introspector.OSGiIntrospectorStatic;
import fr.irisa.triskell.osgi.introspector.util.OSGiIntrospectorUtilStatic;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		if (args.length != 3) {
			System.out.println("You must specify 3 and only 3 parameters :");
			System.out.println("First, the frameworkFolder which is the path of the folder which contains all bundles of the framework.");
			System.out.println("Second, the path of a file whe the model will be saved.");
			System.out.println("Third, true or false, to define if the resources of the bundle must be modelized.");
		} else {
			File frameworkFolder = new File(args[0]);
			File destination = new File(args[1]);
			if (frameworkFolder.isDirectory() && destination.isDirectory() && (args[2].equalsIgnoreCase("true") || args[2].equalsIgnoreCase("false"))) {
				OSGiIntrospectorStatic introspector = new OSGiIntrospectorStatic(new OSGiIntrospectorUtilStatic());
				introspector.generateFramework(args[0], args[1], Boolean.parseBoolean(args[2]));
			}
		}

	}

}
