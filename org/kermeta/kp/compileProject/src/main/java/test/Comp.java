package test;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

public class Comp {
	
	public static void main(String [] args) {
		// Initialisation des variables
		String propertiesfilePath = "C:\\Users\\mgouyett\\Marie\\Work\\workspaceDerivation7\\runtime-New_configuration\\compileProject\\properties\\compiler.properties";
		//String projectName = "compileProjectdProductDerivation";
		String projectName = "selection";
		String classqname ="";
		String operationName ="";
		String kmargs = "";
		List<String> classpath = new ArrayList<String>(); //List qui doit contenir tous les paths absolus des jars dont vous dépendez (appel extern et jar des genmodels)
		
		// Feature model
		String pathFeature = "C:/Users/mgouyett/Marie/Work/workspaceDerivation7/runtime-New_configuration/compileProject/lib/fr.inria.featureDiagramEditor.emf-0.0.1-SNAPSHOT.jar";
		classpath.add(pathFeature);
		
		// Resolution model
		String pathModelEsolution = "C:/Users/mgouyett/Marie/Work/workspaceDerivation7/runtime-New_configuration/compileProject/lib/featureadresolution.jar";
		classpath.add(pathModelEsolution);
		
		// Useful libraries
		String emflib = "C:/Users/mgouyett/Marie/Work/workspaceDerivation7/runtime-New_configuration/compileProject/lib/emf.lib-2.6.0.jar";
		classpath.add(emflib);
		
		String kermeta1_3_0 = "C:/Users/mgouyett/Marie/Work/workspaceDerivation7/runtime-New_configuration/compileProject/lib/kermeta.model-1.3.0.jar";
		classpath.add(kermeta1_3_0);
		
		String kermeta1_4_0 = "C:/Users/mgouyett/Marie/Work/workspaceDerivation7/runtime-New_configuration/compileProject/lib/kermeta.model-1.4.0.jar";
		classpath.add(kermeta1_4_0);
		
		String lg_scala = "C:/Users/mgouyett/Marie/Work/workspaceDerivation7/runtime-New_configuration/compileProject/lib/language.framework.scala-0.10.0-SNAPSHOTS.jar";
		classpath.add( lg_scala);
		
		String runtime = "C:/Users/mgouyett/Marie/Work/workspaceDerivation7/runtime-New_configuration/compileProject/lib/org.eclipse.core.runtime-3.5.0.v20090525.jar";
		classpath.add( runtime);
		
		String osgi = "C:/Users/mgouyett/Marie/Work/workspaceDerivation7/runtime-New_configuration/compileProject/lib/org.osgi.core-4.2.0.jar";
		classpath.add( osgi);
		
		String scala_lib = "C:/Users/mgouyett/Marie/Work/workspaceDerivation7/runtime-New_configuration/compileProject/lib/scala-library-2.8.1.jar";
		classpath.add( scala_lib);
		
		String slf4j = "C:/Users/mgouyett/Marie/Work/workspaceDerivation7/runtime-New_configuration/compileProject/lib/slf4j-api-1.5.9.RC1.jar";
		classpath.add(  slf4j); 
		
		String slf4j_log4j = "C:/Users/mgouyett/Marie/Work/workspaceDerivation7/runtime-New_configuration/compileProject/lib/slf4j-api-1.5.9.RC1.jar";
		classpath.add( slf4j_log4j); 
		
		String ecore2Xml = "C:/Users/mgouyett/Marie/Work/workspaceDerivation7/runtime-New_configuration/compileProject/lib/org.eclipse.emf.mapping.ecore2xml_2.5.0.v200906151043.jar";
		classpath.add( ecore2Xml); 
		
		// Flow model
		String pathFlow = "C:/Users/mgouyett/Marie/Work/workspaceDerivation7/runtime-New_configuration/compileProject/lib/flow.jar";
		classpath.add(pathFlow);
		
		// UML
		String uml = "C:/Users/mgouyett/Marie/Work/workspaceDerivation7/runtime-New_configuration/compileProject/lib/org.eclipse.uml2.uml_3.0.1.v200908281330.jar";
		classpath.add(uml);
		
		String uml_resources = "C:/Users/mgouyett/Marie/Work/workspaceDerivation7/runtime-New_configuration/compileProject/lib/org.eclipse.uml2.uml.resources_3.0.0.v200906011111.jar";
		classpath.add(uml_resources);
		
		String uml_sources = "C:/Users/mgouyett/Marie/Work/workspaceDerivation7/runtime-New_configuration/compileProject/lib/org.eclipse.uml2.uml.source_3.0.1.v200908281330.jar";
		classpath.add(uml_sources);
		
		String uml_common = "C:/Users/mgouyett/Marie/Work/workspaceDerivation7/runtime-New_configuration/compileProject/lib/org.eclipse.uml2.common_1.5.0.v200905041045.jar";
		classpath.add(uml_common);
		
		String uml_common_source = "C:/Users/mgouyett/Marie/Work/workspaceDerivation7/runtime-New_configuration/compileProject/lib/org.eclipse.uml2.common.source_1.5.0.v200905041045.jar";
		classpath.add(uml_common_source);
		
		
		OutputStream outputStream = System.out;
		//String kmuri = "C:\\Users\\mgouyett\\Marie\\Work\\workspaceMovida43\\runtime-New_configuration\\fr.inria.product_derivation_engine\\src\\generated\\km\\CallDerivation.km";
		String kmuri = "C:\\Users\\mgouyett\\Marie\\Work\\workspaceDerivation7\\runtime-New_configuration\\fr.inria.product_derivation_engine\\src\\generated\\km\\SelectionEngine.km";
		
		// Change package name to adjust ecore model package name and corresponding EMF Java code package
		kermeta.utils.TypeEquivalence.packageEquivelence().put("flow","fr.obeo.dsl.designer.sample.flow");
		
		fr.irisa.triskell.kermeta.compilo.scala.Main.init (propertiesfilePath, projectName, classqname, operationName, classpath, kmargs, outputStream);
		String [] arg = new String[2];
		arg[0] = "-i";
		arg[1] = kmuri;
		fr.irisa.triskell.kermeta.compilo.scala.Main.main(arg);
		
	}

}
