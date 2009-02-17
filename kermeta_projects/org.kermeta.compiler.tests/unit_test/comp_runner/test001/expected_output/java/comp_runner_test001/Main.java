/**
 * Copyright: IRISA/INRIA/Universite de Rennes 1 - License: EPL - Web site: http://www.kermeta.org
 *
 * $Id: Main.java,v 1.2 2009-02-17 13:40:54 cfaucher Exp $
 */
package comp_runner_test001;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Main</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see comp_runner_test001.Comp_runner_test001Package#getMain()
 * @model
 * @generated
 */
public interface Main extends EObject
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model annotation="kermeta body='do\n\tstdio.writeln(\"The runner class will be generated for main0\")\nend'"
   *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\tSystem.out.println(\"The runner class will be generated for main0\")\n'"
   * @generated
   */
  void main0();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model text0DataType="comp_runner_test001.String"
   *        annotation="kermeta body='do\n\tstdio.writeln(\"The runner class will be generated for main1\")\nend'"
   *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\tSystem.out.println(\"The runner class will be generated for main1\")\n'"
   * @generated
   */
  void main1(String text0);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model text0DataType="comp_runner_test001.String" text1DataType="comp_runner_test001.String"
   *        annotation="kermeta body='do\n\tstdio.writeln(\"The runner class will be generated for main2\")\nend'"
   *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\tSystem.out.println(\"The runner class will be generated for main2\")\n'"
   * @generated
   */
  void main2(String text0, String text1);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model conditionDataType="comp_runner_test001.Boolean"
   *        annotation="kermeta body='do\n\tstdio.writeln(\"The runner class will not be generated for main3\")\nend' documentation='/****** Cases that should be in error *****\052/'"
   *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\tSystem.out.println(\"The runner class will not be generated for main3\")\n'"
   * @generated
   */
  void main3(boolean condition);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model text0DataType="comp_runner_test001.String" conditionDataType="comp_runner_test001.Boolean"
   *        annotation="kermeta body='do\n\tstdio.writeln(\"The runner class will not be generated for main4\")\nend'"
   *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\tSystem.out.println(\"The runner class will not be generated for main4\")\n'"
   * @generated
   */
  void main4(String text0, boolean condition);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model text0DataType="comp_runner_test001.String" text1DataType="comp_runner_test001.String" conditionDataType="comp_runner_test001.Boolean"
   *        annotation="kermeta body='do\n\tstdio.writeln(\"The runner class will not be generated for main5\")\nend'"
   *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\tSystem.out.println(\"The runner class will not be generated for main5\")\n'"
   * @generated
   */
  void main5(String text0, String text1, boolean condition);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model conditionDataType="comp_runner_test001.Boolean" text0DataType="comp_runner_test001.String"
   *        annotation="kermeta body='do\n\tstdio.writeln(\"MThe runner class will not be generated for main6\")\nend'"
   *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\tSystem.out.println(\"MThe runner class will not be generated for main6\")\n'"
   * @generated
   */
  void main6(boolean condition, String text0);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model text0DataType="comp_runner_test001.String" conditionDataType="comp_runner_test001.Boolean" text1DataType="comp_runner_test001.String"
   *        annotation="kermeta body='do\n\tstdio.writeln(\"The runner class will not be generated for main7\")\nend'"
   *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\tSystem.out.println(\"The runner class will not be generated for main7\")\n'"
   * @generated
   */
  void main7(String text0, boolean condition, String text1);

} // Main
