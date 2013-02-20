
package org.kermeta.alf.xtext;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class AlfStandaloneSetup extends AlfStandaloneSetupGenerated{

	public static void doSetup() {
		new AlfStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

