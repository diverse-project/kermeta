/**
 * Copyright: IRISA/INRIA/Universite de Rennes 1 - License: EPL - Web site: http://www.kermeta.org
 *
 * $Id: Main.java,v 1.2 2009-02-17 13:40:52 cfaucher Exp $
 */
package comp_initialization_test004;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Main</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see comp_initialization_test004.Comp_initialization_test004Package#getMain()
 * @model
 * @generated
 */
public interface Main extends EObject
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model annotation="kermeta body='do\n\tvar i : kermeta::language::structure::Integer\n\ti := 1\n\tstdio.writeln(i.toString)\nend'"
   *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\tnull i;\n\ti = 1;\n\tSystem.out.println(i.toString();)\n'"
   * @generated
   */
  void main();

} // Main
