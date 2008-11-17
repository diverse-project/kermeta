package org.kermeta.kompose.specialization_wizard.generator.template;

import org.kermeta.kompose.specialization_wizard.wizards.SpecializerIntermediateDataContainer;

public class PluginManifest
{
  protected static String nl;
  public static synchronized PluginManifest create(String lineSeparator)
  {
    nl = lineSeparator;
    PluginManifest result = new PluginManifest();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "Manifest-Version: 1.0" + NL + "Bundle-ManifestVersion: 2" + NL + "Bundle-Name: Kompose Specialization Composition Plug-in" + NL + "Bundle-SymbolicName: ";
  protected final String TEXT_2 = "; singleton:=true" + NL + "Bundle-Version: 0.0.1" + NL + "Bundle-Activator: ";
  protected final String TEXT_3 = ".Activator" + NL + "Bundle-Vendor: Unknown" + NL + "Bundle-Localization: plugin" + NL + "Require-Bundle: org.eclipse.ui," + NL + " org.eclipse.core.runtime," + NL + " org.eclipse.core.resources," + NL + " fr.irisa.triskell.kermeta.interpreter," + NL + " org.kermeta.kompose.ui";
  protected final String TEXT_4 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
     SpecializerIntermediateDataContainer data=(SpecializerIntermediateDataContainer)argument; 
    stringBuffer.append(TEXT_1);
    stringBuffer.append(data.getPackage_name());
    stringBuffer.append(TEXT_2);
    stringBuffer.append(data.getActivatorPackage());
    stringBuffer.append(TEXT_3);
    stringBuffer.append(TEXT_4);
    return stringBuffer.toString();
  }
}
