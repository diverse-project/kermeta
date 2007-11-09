/**
 * Copyright : IRISA / INRIA / Universite de Rennes 1/nLicense   : EPL/nhttp://www.kermeta.org
 *
 * $Id: Main.java,v 1.1 2007-11-09 17:56:37 cfaucher Exp $
 */
package comp_conditional_test001;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Main</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see comp_conditional_test001.Comp_conditional_test001Package#getMain()
 * @model
 * @generated
 */
public interface Main extends EObject
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model annotation="kermeta body='do\n\tif (1) == (1) then\n\t\tstdio.writeln(\"enter in then\")\n\n\tend\nend'"
   *        annotation="http://www.eclipse.org/emf/2002/GenModel body='{\tif( (1) == (1)) {\n\t\tSystem.out.println(\"enter in then\")\n\n\t}\n}'"
   * @generated
   */
  void main();

} // Main
