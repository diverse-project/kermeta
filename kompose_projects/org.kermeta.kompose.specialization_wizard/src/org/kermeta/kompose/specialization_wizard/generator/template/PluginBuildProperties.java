package org.kermeta.kompose.specialization_wizard.generator.template;

import org.kermeta.kompose.specialization_wizard.wizards.SpecializerIntermediateDataContainer;

public class PluginBuildProperties
{
  protected static String nl;
  public static synchronized PluginBuildProperties create(String lineSeparator)
  {
    nl = lineSeparator;
    PluginBuildProperties result = new PluginBuildProperties();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "source.. = src/" + NL + "output.. = bin/" + NL + "bin.includes = plugin.xml,\\" + NL + "               META-INF/,\\" + NL + "               .";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append(TEXT_1);
    return stringBuffer.toString();
  }
}
