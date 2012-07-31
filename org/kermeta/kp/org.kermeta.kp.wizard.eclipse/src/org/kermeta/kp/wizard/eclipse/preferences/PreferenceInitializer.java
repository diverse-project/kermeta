package org.kermeta.kp.wizard.eclipse.preferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;
import org.kermeta.kp.wizard.eclipse.Activator;


/**
 * Class used to initialize default preference values.
 */
public class PreferenceInitializer extends AbstractPreferenceInitializer {

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer#initializeDefaultPreferences()
	 */
	public void initializeDefaultPreferences() {
		IPreferenceStore store = Activator.getDefault().getPreferenceStore();
		
		store.setDefault(PreferenceConstants.P_NEW_KMT_TEMPLATE_STRING, 
				"using kermeta::standard\n"+
				"using kermeta::io::StdIO => stdio\n\n"+
				"package "+"${package.name}"+"{\n"+
		        "\tclass "+"${class.name}"+
		        "\n\t{\n"+
		        "\t\toperation "+"${operation.name}"+"() : Void is do \n"+
		        "\t\t\t// TODO: implement '"+"${operation.name}"+ "' operation\n"+
		        "\t\t\tstdio.writeln(\"Hello from "+"${operation.name}"+ "\")\n"+
		        "\t\tend"+
		        "\n\t}"+
		        "\n}");
		store.setDefault(PreferenceConstants.P_NEW_KP_TEMPLATE_STRING, "KermetaProject \"${project.name}\"\n"+ 
				"\tgroupId = \"my.group\"\n" +
				"\tdefaultMainClass = \"${package.name}::${class.name}\"\n"+
				"\tdefaultMainOperation = \"${operation.name}\"\n"+
				"\tsources = {\n" +
				"\t\trequire \"${project.baseUri}/src/main/kmt/${class.name}.kmt\"\n"+  
				"\t}\n"+
				"\tdependencies = {\n"+
				"\t\t//default dependency to kermeta framework (try first in eclipse plugin, then look into maven repository)\n"+
				"\t\tdependency \"library.core\" =\"platform:/plugin/org.kermeta.language.library.core\",\"mvn:org.kermeta.language/language.library.core/2.0.4\"\n"+
				"\t}"+
				"\tpackageEquivalences={\n"+ 
				"\t\t// indicates the real java name of a given package\n"+
				"\t\t// useful for deployed thirdparty metamodels\n"+
				"\t\tpackageEquivalence \"ecore\" = \"org.eclipse.emf.ecore\"\n"+
				"\t\tpackageEquivalence \"uml\" = \"org.eclipse.uml2.uml\"\n"+
				"\t}"
				);
		
	}

}
