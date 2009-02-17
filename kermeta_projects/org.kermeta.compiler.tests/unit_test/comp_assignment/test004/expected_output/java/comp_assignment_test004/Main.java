/**
 * Copyright: IRISA/INRIA/Universite de Rennes 1 - License: EPL - Web site: http://www.kermeta.org
 *
 * $Id: Main.java,v 1.2 2009-02-17 13:41:01 cfaucher Exp $
 */
package comp_assignment_test004;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Main</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see comp_assignment_test004.Comp_assignment_test004Package#getMain()
 * @model
 * @generated
 */
public interface Main extends EObject
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model annotation="kermeta body='do\n\tvar a : comp_assignment_test004::A init comp_assignment_test004::A.new\n\ta.name := \"Assignment of a feature\"\n\tvar b1 : comp_assignment_test004::B init comp_assignment_test004::B.new\n\tvar b2 : comp_assignment_test004::B init comp_assignment_test004::B.new\n\ta.b.add(b1)\n\ta.b.add(b2)\n\tstdio.writeln(\"a.name: \".plus(a.name))\n\ta.b.each{e | stdio.writeln(\"b: \".plus(e.toString))}\nend'"
   *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\tcomp_assignment_test004.A a = comp_assignment_test004.Comp_assignment_test004Factory.eINSTANCE.createA();\n\tsetA.name()(\"Assignment of a feature\");\n\tcomp_assignment_test004.B b1 = comp_assignment_test004.Comp_assignment_test004Factory.eINSTANCE.createB();\n\tcomp_assignment_test004.B b2 = comp_assignment_test004.Comp_assignment_test004Factory.eINSTANCE.createB();\n\ta.b();.add(b1)\n\ta.b();.add(b2)\n\tSystem.out.println(\"a.name: \".plus(a.name();))\n\ta.b();.each\n'"
   * @generated
   */
  void main();

} // Main
