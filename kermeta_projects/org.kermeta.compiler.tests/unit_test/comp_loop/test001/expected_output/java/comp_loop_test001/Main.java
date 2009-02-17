/**
 * Copyright: IRISA/INRIA/Universite de Rennes 1 - License: EPL - Web site: http://www.kermeta.org
 *
 * $Id: Main.java,v 1.2 2009-02-17 13:41:02 cfaucher Exp $
 */
package comp_loop_test001;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Main</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see comp_loop_test001.Comp_loop_test001Package#getMain()
 * @model
 * @generated
 */
public interface Main extends EObject
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model annotation="kermeta body='do\n\tfrom var i : kermeta::language::structure::Integer init 0\n\tuntil (i) == (10)\n\tloop\n\t\tstdio.writeln(i.toString)\n\t\ti := (i) + (1)\n\tend\nend'"
   *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\tnull i = 0;\nwhile ( (i) == (10) ) {\n\t\tSystem.out.println(i.toString();)\n\t\ti = (i) + (1);\n\t}\n'"
   * @generated
   */
  void main();

} // Main
