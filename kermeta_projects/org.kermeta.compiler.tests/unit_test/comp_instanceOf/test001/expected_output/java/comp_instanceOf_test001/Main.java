/**
 * Copyright: IRISA/INRIA/Universite de Rennes 1 - License: EPL - Web site: http://www.kermeta.org
 *
 * $Id: Main.java,v 1.2 2009-02-17 13:40:51 cfaucher Exp $
 */
package comp_instanceOf_test001;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Main</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see comp_instanceOf_test001.Comp_instanceOf_test001Package#getMain()
 * @model
 * @generated
 */
public interface Main extends EObject
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model annotation="kermeta body='do\n\tvar a : comp_instanceOf_test001::A\n\tif a.isInstanceOf(comp_instanceOf_test001::A) then\n\t\tstdio.writeln(\"a is instance of A\")\n\n\tend\nend'"
   *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\tcomp_instanceOf_test001.A a = comp_instanceOf_test001.Comp_instanceOf_test001Factory.eINSTANCE.createA();\n\tif( a.isInstanceOf(comp_instanceOf_test001.A)) {\n\t\tSystem.out.println(\"a is instance of A\")\n\n\t}\n'"
   * @generated
   */
  void main();

} // Main
