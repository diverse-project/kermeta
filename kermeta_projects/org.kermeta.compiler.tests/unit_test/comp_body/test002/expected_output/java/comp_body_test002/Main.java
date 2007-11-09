/**
 * Copyright : IRISA / INRIA / Universite de Rennes 1/nLicense   : EPL/nhttp://www.kermeta.org
 *
 * $Id: Main.java,v 1.1 2007-11-09 17:44:45 cfaucher Exp $
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
   * @model annotation="kermeta body='do\n\tstdio.writeln(\"\")\nend'"
   *        annotation="http://www.eclipse.org/emf/2002/GenModel body='{\tSystem.out.println(\"\")\n}'"
   * @generated
   */
  void main();

} // Main
