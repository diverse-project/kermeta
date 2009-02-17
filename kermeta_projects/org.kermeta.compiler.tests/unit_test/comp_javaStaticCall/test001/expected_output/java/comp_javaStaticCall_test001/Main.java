/**
 * Copyright: IRISA/INRIA/Universite de Rennes 1 - License: EPL - Web site: http://www.kermeta.org
 *
 * $Id: Main.java,v 1.2 2009-02-17 13:40:52 cfaucher Exp $
 */
package comp_javaStaticCall_test001;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Main</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see comp_javaStaticCall_test001.Comp_javaStaticCall_test001Package#getMain()
 * @model
 * @generated
 */
public interface Main extends EObject
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model annotation="kermeta body='do\n\tvar filename : kermeta::language::structure::String init \"file.txt\"\n\tvar text : kermeta::language::structure::String init \"The text\"\n\textern fr::irisa::triskell::kermeta::runtime::io::SimpleFileIO.writeTextFile(filename, text)\nend'"
   *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\tnull filename = \"file.txt\";\n\tnull text = \"The text\";\n\tfr.irisa.triskell.kermeta.runtime.io.SimpleFileIO.writeTextFile(filename, text)\n'"
   * @generated
   */
  void main();

} // Main
