/**
 * Copyright: IRISA/INRIA/Universite de Rennes 1 - License: EPL - Web site: http://www.kermeta.org
 *
 * $Id: Main.java,v 1.2 2009-02-17 13:40:53 cfaucher Exp $
 */
package comp_callResult_test001;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Main</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see comp_callResult_test001.Comp_callResult_test001Package#getMain()
 * @model
 * @generated
 */
public interface Main extends EObject
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model dataType="comp_callResult_test001.String"
   *        annotation="kermeta body='do\n\tresult := \"main\"\nend'"
   *        annotation="http://www.eclipse.org/emf/2002/GenModel body='String\nresult=null;\n\tresult = \"main\";\n\nreturn result;'"
   * @generated
   */
  String main();

} // Main
