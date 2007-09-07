
//   Mother class of the all the class's items including the class themself
abstract class UmlBaseClassItem extends UmlItem {
  //   return the C++ declaration
  
  public String cppDecl() {
    read_if_needed_();
    
    return _cpp_decl;
  }

  /**  to set the C++ declaration
   * 
   *  On error return FALSE in C++, produce a RuntimeException in Java
   */
  public void set_CppDecl(String s) throws RuntimeException {
    UmlCom.send_cmd(identifier_(), OnInstanceCmd.setCppDeclCmd, s);
    UmlCom.check();
  
    _cpp_decl = s;
  }

  //   return the Java defininition
  
  public String javaDecl() {
    read_if_needed_();
    
    return _java_decl;
  }

  /**  to set the Java definition
   * 
   *  On error return FALSE in C++, produce a RuntimeException in Java
   */
  public void set_JavaDecl(String s) throws RuntimeException {
    UmlCom.send_cmd(identifier_(), OnInstanceCmd.setJavaDeclCmd, s);
    UmlCom.check();
  
    _java_decl = s;
  }

  //   return the IDL declaration
  
  public String idlDecl() {
    read_if_needed_();
    
    return _idl_decl;
  }

  /**  set the IDL declaration
   * 
   *  On error return FALSE in C++, produce a RuntimeException in Java
   */
  public void set_IdlDecl(String s) throws RuntimeException {
    UmlCom.send_cmd(identifier_(), OnInstanceCmd.setIdlDeclCmd, s);
    UmlCom.check();
  
    _idl_decl = s;
  }

  public void unload(boolean rec, boolean del) {
    _cpp_decl = null;
    _java_decl = null;
    _idl_decl = null;
    super.unload(rec, del);
  }

  private String _cpp_decl;
  private String _java_decl;
  private String _idl_decl;
  protected UmlBaseClassItem(long id, String n) { super(id, n); }

  // internal, do NOT use it
  
  protected void read_cpp_() {
    _cpp_decl = UmlCom.read_string();
  }

  // internal, do NOT use it
  
  protected void read_java_() {
    _java_decl = UmlCom.read_string();
  }

  // internal, do NOT use it
  
  protected void read_idl_() {
    _idl_decl = UmlCom.read_string();
  }

};
