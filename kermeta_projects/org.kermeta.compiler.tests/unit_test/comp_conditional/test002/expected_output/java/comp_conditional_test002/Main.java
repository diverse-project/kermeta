/**
 * Copyright: IRISA/INRIA/Universite de Rennes 1 - License: EPL - Web site: http://www.kermeta.org
 *
 * $Id: Main.java,v 1.3 2009-02-17 13:40:54 cfaucher Exp $
 */
package comp_conditional_test002;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Main</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see comp_conditional_test002.Comp_conditional_test002Package#getMain()
 * @model
 * @generated
 */
public interface Main extends EObject
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model annotation="kermeta body='do\n\tif (1) == (0) then\n\n\telse\n\t\tstdio.writeln(\"enter in else\")\n\n\tend\nend'"
   *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\tif( (1) == (0)) {\n\n\t} else {\n\t\tSystem.out.println(\"enter in else\")\n\n\t}\n'"
   * @generated
   */
  void main();

} // Main
