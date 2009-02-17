/**
 * Copyright: IRISA/INRIA/Universite de Rennes 1 - License: EPL - Web site: http://www.kermeta.org
 *
 * $Id: Main.java,v 1.2 2009-02-17 13:40:52 cfaucher Exp $
 */
package comp_callResult_test003;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Main</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see comp_callResult_test003.Comp_callResult_test003Package#getMain()
 * @model
 * @generated
 */
public interface Main extends EObject
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model annotation="kermeta body='do\n\tresult := comp_callResult_test003::A.new\nend'"
   *        annotation="http://www.eclipse.org/emf/2002/GenModel body='A\nresult=null;\n\tresult = comp_callResult_test003.A.new();;\n\nreturn result;'"
   * @generated
   */
  A main();

} // Main
