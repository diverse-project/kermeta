package org.kermeta.kompose.specialization_wizard.generator.template;

import org.kermeta.kompose.specialization_wizard.wizards.SpecializerIntermediateDataContainer;

public class ModelEcore
{
  protected static String nl;
  public static synchronized ModelEcore create(String lineSeparator)
  {
    nl = lineSeparator;
    ModelEcore result = new ModelEcore();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" + NL + "<ecore:EPackage xmi:version=\"2.0\" " + NL + "\txmlns:xmi=\"http://www.omg.org/XMI\" " + NL + "\txmlns:ecore=\"http://www.eclipse.org/emf/2002/Ecore\" " + NL + "\tname=\"";
  protected final String TEXT_2 = "\"" + NL + "\tnsURI=\"http://";
  protected final String TEXT_3 = ".ecore\" " + NL + "\tnsPrefix=\"";
  protected final String TEXT_4 = "\"/>";
  protected final String TEXT_5 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
     SpecializerIntermediateDataContainer data=(SpecializerIntermediateDataContainer)argument; 
    stringBuffer.append(TEXT_1);
    stringBuffer.append(data.getMainKmtPackage());
    stringBuffer.append(TEXT_2);
    stringBuffer.append(data.getMetamodelURI());
    stringBuffer.append(TEXT_3);
    stringBuffer.append(data.getMainKmtPackage());
    stringBuffer.append(TEXT_4);
    stringBuffer.append(TEXT_5);
    return stringBuffer.toString();
  }
}
