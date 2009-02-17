/**
 * Copyright: IRISA/INRIA/Universite de Rennes 1 - License: EPL - Web site: http://www.kermeta.org
 *
 * $Id: Main.java,v 1.3 2009-02-17 13:40:51 cfaucher Exp $
 */
package comp_body_test002;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Main</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see comp_body_test002.Comp_body_test002Package#getMain()
 * @model
 * @generated
 */
public interface Main extends EObject
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model annotation="kermeta body='do\n\tstdio.writeln(\"Main method has been executed\")\nend'"
   *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\tSystem.out.println(\"Main method has been executed\")\n'"
   * @generated
   */
  void main();

} // Main
