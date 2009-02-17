/**
 * Copyright: IRISA/INRIA/Universite de Rennes 1 - License: EPL - Web site: http://www.kermeta.org
 *
 * $Id: Main.java,v 1.2 2009-02-17 13:40:53 cfaucher Exp $
 */
package comp_initialization_test006;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Main</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see comp_initialization_test006.Comp_initialization_test006Package#getMain()
 * @model
 * @generated
 */
public interface Main extends EObject
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model annotation="kermeta body='do\n\tvar a : comp_initialization_test006::A\n\ta := comp_initialization_test006::A.new\n\tstdio.writeln(\"The variable a is correctly initialized: \".plus(a.toString))\nend'"
   *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\tcomp_initialization_test006.A a = comp_initialization_test006.Comp_initialization_test006Factory.eINSTANCE.createA();\n\ta = comp_initialization_test006.A.new();;\n\tSystem.out.println(\"The variable a is correctly initialized: \".plus(a.toString();))\n'"
   * @generated
   */
  void main();

} // Main
