/**
 * Copyright: IRISA/INRIA/Universite de Rennes 1 - License: EPL - Web site: http://www.kermeta.org
 *
 * $Id: StdIO.java,v 1.1 2008-07-02 09:13:38 ftanguy Exp $
 */
package kermeta.io;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Std IO</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see kermeta.io.IoPackage#getStdIO()
 * @model annotation="kermeta documentation='/**\r\n * An implementation of StdIO : standard input/output\r\n * <img src=\"platform:/plugin/fr.irisa.triskell.kermeta.documentation/src/figures/io_package.png\"/>\r\n \052/'"
 * @generated
 */
public interface StdIO extends kermeta.language.structure.Object
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model objectDataType="kermeta.standard.String"
   *        annotation="kermeta documentation='/**\r\n\t * Writeln the object to standard output\r\n\t \052/'"
   * @generated
   */
  void writeln(String object);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model objectDataType="kermeta.standard.String"
   *        annotation="kermeta documentation='/**\r\n\t * Writeln the object to error output\r\n\t \052/'"
   * @generated
   */
  void errorln(String object);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model objectDataType="kermeta.standard.String"
   *        annotation="kermeta documentation='/**\r\n\t * Writes the object to error output\r\n\t \052/'"
   * @generated
   */
  void error(String object);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model objectDataType="kermeta.standard.String"
   *        annotation="kermeta documentation='/**\r\n\t * Writes the object to standard output\r\n\t \052/'"
   * @generated
   */
  void write(String object);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model dataType="kermeta.standard.String" promptDataType="kermeta.standard.String"
   *        annotation="kermeta documentation='/**\r\n\t * Reads a String from standard input\r\n\t \052/'"
   * @generated
   */
  String read(String prompt);

} // StdIO
