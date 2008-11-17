package org.kermeta.kompose.specialization_wizard.generator.template;

public class ClassPathStatic
{
  protected static String nl;
  public static synchronized ClassPathStatic create(String lineSeparator)
  {
    nl = lineSeparator;
    ClassPathStatic result = new ClassPathStatic();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" + NL + "<classpath>" + NL + "\t<classpathentry kind=\"src\" path=\"src\"/>" + NL + "\t<classpathentry kind=\"con\" path=\"org.eclipse.jdt.launching.JRE_CONTAINER\"/>" + NL + "\t<classpathentry kind=\"con\" path=\"org.eclipse.pde.core.requiredPlugins\"/>" + NL + "\t<classpathentry kind=\"output\" path=\"bin\"/>" + NL + "</classpath>";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append(TEXT_1);
    return stringBuffer.toString();
  }
}
