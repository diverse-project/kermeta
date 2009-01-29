package org.kermeta.kompose.specialization_wizard.generator.template;

import org.kermeta.kompose.specialization_wizard.wizards.SpecializerIntermediateDataContainer;

public class PluginXMLGenerator
{
  protected static String nl;
  public static synchronized PluginXMLGenerator create(String lineSeparator)
  {
    nl = lineSeparator;
    PluginXMLGenerator result = new PluginXMLGenerator();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" + NL + "<?eclipse version=\"3.2\"?>" + NL + "<plugin>" + NL + "   <extension" + NL + "         point=\"org.eclipse.ui.popupMenus\">" + NL + "      <objectContribution" + NL + "            objectClass=\"org.eclipse.core.resources.IFile\"" + NL + "            nameFilter=\"*.kompose\"" + NL + "            id=\"";
  protected final String TEXT_2 = ".contribution1\">" + NL + "         <menu" + NL + "               label=\"Kompose\"" + NL + "               path=\"additions\"" + NL + "               id=\"org.kermeta.kompose.specialization.kompose.menu1\">" + NL + "            <separator" + NL + "                  name=\"group1\">" + NL + "            </separator>" + NL + "         </menu>" + NL + "         <action" + NL + "               label=\"Compose Models (";
  protected final String TEXT_3 = ")\"" + NL + "               class=\"";
  protected final String TEXT_4 = ".Composer\"" + NL + "               menubarPath=\"org.kermeta.kompose.specialization.kompose.menu1/group1\"" + NL + "               enablesFor=\"1\"" + NL + "               id=\"";
  protected final String TEXT_5 = ".composer\">" + NL + "         </action>" + NL + "      </objectContribution>" + NL + "   </extension>" + NL + "   <extension" + NL + "         point=\"org.eclipse.ui.startup\">" + NL + "      <startup class=\"";
  protected final String TEXT_6 = ".RegisterStartup\"/>" + NL + "   </extension>" + NL + "</plugin>";
  protected final String TEXT_7 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
     SpecializerIntermediateDataContainer data=(SpecializerIntermediateDataContainer)argument; 
    stringBuffer.append(TEXT_1);
    stringBuffer.append(data.getPackage_name());
    stringBuffer.append(TEXT_2);
    stringBuffer.append(data.getModel_name());
    stringBuffer.append(TEXT_3);
    stringBuffer.append(data.getPopupPackage());
    stringBuffer.append(TEXT_4);
    stringBuffer.append(data.getPackage_name());
    stringBuffer.append(TEXT_5);
    stringBuffer.append(data.getStartupPackage());
    stringBuffer.append(TEXT_6);
    stringBuffer.append(TEXT_7);
    return stringBuffer.toString();
  }
}
