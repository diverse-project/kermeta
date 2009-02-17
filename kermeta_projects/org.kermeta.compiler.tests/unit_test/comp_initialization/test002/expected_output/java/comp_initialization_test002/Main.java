/**
 * Copyright: IRISA/INRIA/Universite de Rennes 1 - License: EPL - Web site: http://www.kermeta.org
 *
 * $Id: Main.java,v 1.2 2009-02-17 13:40:55 cfaucher Exp $
 */
package comp_initialization_test002;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Main</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see comp_initialization_test002.Comp_initialization_test002Package#getMain()
 * @model
 * @generated
 */
public interface Main extends EObject
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model annotation="kermeta body='do\n\tvar s : kermeta::language::structure::String\n\ts := \"InitStringIndirect\"\n\tstdio.writeln(s)\nend'"
   *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\tnull s;\n\ts = \"InitStringIndirect\";\n\tSystem.out.println(s)\n'"
   * @generated
   */
  void main();

} // Main
