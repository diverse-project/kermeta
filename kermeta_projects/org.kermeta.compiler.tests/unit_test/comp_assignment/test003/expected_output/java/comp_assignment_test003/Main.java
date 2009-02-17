/**
 * Copyright: IRISA/INRIA/Universite de Rennes 1 - License: EPL - Web site: http://www.kermeta.org
 *
 * $Id: Main.java,v 1.2 2009-02-17 13:40:55 cfaucher Exp $
 */
package comp_assignment_test003;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Main</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see comp_assignment_test003.Comp_assignment_test003Package#getMain()
 * @model
 * @generated
 */
public interface Main extends EObject
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model annotation="kermeta body='do\n\tvar a : comp_assignment_test003::A init comp_assignment_test003::A.new\n\tvar aa : comp_assignment_test003::A\n\taa := a\n\tstdio.writeln(\"a: \".plus(a.toString).plus(\" - aa: \").plus(aa.toString))\nend'"
   *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\tcomp_assignment_test003.A a = comp_assignment_test003.Comp_assignment_test003Factory.eINSTANCE.createA();\n\tcomp_assignment_test003.A aa = comp_assignment_test003.Comp_assignment_test003Factory.eINSTANCE.createA();\n\taa = a;\n\tSystem.out.println(\"a: \".plus(a.toString();).plus(\" - aa: \").plus(aa.toString();))\n'"
   * @generated
   */
  void main();

} // Main
