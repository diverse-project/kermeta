/**
 * Copyright: IRISA/INRIA/Universite de Rennes 1 - License: EPL - Web site: http://www.kermeta.org
 *
 * $Id: Main.java,v 1.2 2009-02-17 13:40:54 cfaucher Exp $
 */
package comp_lambdaExpression_test001;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Main</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see comp_lambdaExpression_test001.Comp_lambdaExpression_test001Package#getMain()
 * @model
 * @generated
 */
public interface Main extends EObject
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model annotation="kermeta body='do\n\tvar a : comp_lambdaExpression_test001::A init comp_lambdaExpression_test001::A.new\n\ta.ref.add(\"Kernel\")\n\ta.ref.add(\"Metamodeling\")\n\ta.ref.add(\" \")\n\ta.ref.add(\"Compiler\")\n\ta.ref.each{r | stdio.writeln(r.toString)}\n\ta.ref.~select{r | (1) == (1)}\nend'"
   *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\tcomp_lambdaExpression_test001.A a = comp_lambdaExpression_test001.Comp_lambdaExpression_test001Factory.eINSTANCE.createA();\n\ta.ref();.add(\"Kernel\")\n\ta.ref();.add(\"Metamodeling\")\n\ta.ref();.add(\" \")\n\ta.ref();.add(\"Compiler\")\n\ta.ref();.each\n\ta.ref();.select\n'"
   * @generated
   */
  void main();

} // Main
