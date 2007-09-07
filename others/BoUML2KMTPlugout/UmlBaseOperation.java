
//   Manage the class's operations
abstract class UmlBaseOperation extends UmlClassMember {
  /** returns a new operation named 's' created under 'parent'
   * 
   *  In case it cannot be created (the name is already used or
   *  invalid, 'parent' cannot contain it etc ...) return 0 in C++
   *  and produce a RuntimeException in Java
   */
  public static UmlOperation create(UmlClass parent, String s) throws RuntimeException
  {
    return (UmlOperation) parent.create_(anItemKind.anOperation, s);
  }

  //  returns the kind of the item
  public anItemKind kind() {
    return anItemKind.anOperation;
  }

  //  indicates if the operation is abstract, returns TRUE if yes
  public boolean isAbstract() {
    read_if_needed_();
      
    return _abstract;
  }

  /** to set the 'abstract' flag
   *  
   *  On error return FALSE in C++, produce a RuntimeException in Java
   */
  public void set_isAbstract(boolean y) throws RuntimeException {
    UmlCom.send_cmd(identifier_(), OnInstanceCmd.setIsAbstractCmd, (y) ? (byte) 1 : (byte) 0);
    UmlCom.check();
  
    _abstract =  y;
    if (y)
      ((UmlBaseClass) parent()).set_isAbstract(y);
  }

  //  returns the operation value type
  public UmlTypeSpec returnType() {
    read_if_needed_();
      
    return _return_type;
  }

  /** to set the operation value type
   *  
   *  On error return FALSE in C++, produce a RuntimeException in Java
   */
  public void set_ReturnType(UmlTypeSpec t) throws RuntimeException {
    UmlCom.send_cmd(identifier_(), OnInstanceCmd.setReturnTypeCmd, t);
    UmlCom.check();
  
    _return_type = t;
  }

  //  returns (in java a copy of) the parameters list
  public UmlParameter[] params() {
    read_if_needed_();
      
    return (UmlParameter[]) _params.clone();
  }

  /** adds a parameter at the given rank (0...)
   * 
   *  On error return FALSE in C++, produce a RuntimeException in Java
   */
  public void addParameter(int rank, UmlParameter p) throws RuntimeException {
    UmlCom.send_cmd(identifier_(), OnInstanceCmd.addParameterCmd, rank, (byte) p.dir.value(), p.name, 
  		   p.default_value, p.type);
    UmlCom.check();
    
    if (defined_()) {
      // compatible with old Java versions
      int n = _params.length;
      UmlParameter[] params = new UmlParameter[n + 1];
      int index;
      
      for (index = 0; index != rank; index += 1)
        params[index] = _params[index];
      params[index] = p.clone_it();
      while (index++ != n)
        params[index] = _params[index - 1];
      _params = params;
    }
  }

  /** remove the parameter of the given rank (0...)
   * 
   *  On error return FALSE in C++, produce a RuntimeException in Java
   */
  public void removeParameter(int rank) throws RuntimeException {
    UmlCom.send_cmd(identifier_(), OnInstanceCmd.removeParameterCmd, rank);
    UmlCom.check();
    
    if (defined_()) {
      int n = _params.length;
      UmlParameter[] params = new UmlParameter[n - 1];
      int index;
      
      for (index = 0; index != rank; index += 1)
        params[index] = _params[index];
      
      while (++index != n)
        params[index - 1] = _params[index];
      
      _params = params;
    }
  }

  /** replace the parameter at the given rank (0...)
   * 
   *  On error return FALSE in C++, produce a RuntimeException in Java
   */
  public void replaceParameter(int rank, UmlParameter p) throws RuntimeException {
    UmlCom.send_cmd(identifier_(), OnInstanceCmd.replaceParameterCmd, rank,
  		  (byte) p.dir.value(), p.name, p.default_value, p.type);
    UmlCom.check();
    
    if (defined_())
      _params[rank] = p.clone_it();
  }

  //  returns the exceptions
  public UmlTypeSpec[] exceptions() {
    read_if_needed_();
      
    return (UmlTypeSpec[]) _exceptions.clone();
  }

  /** adds the exception at the given rank (0...)
   * 
   *  On error return FALSE in C++, produce a RuntimeException in Java
   */
  public void addException(int rank, UmlTypeSpec t) throws RuntimeException {
    UmlCom.send_cmd(identifier_(), OnInstanceCmd.addExceptionCmd, rank, t);
    UmlCom.check();
    
    if (defined_()) {
      // compatible with old Java versions
      int n = _exceptions.length;
      int index;
      
      UmlTypeSpec[] exceptions = new UmlTypeSpec[n + 1];
      for (index = 0; index != rank; index += 1)
        exceptions[index] = _exceptions[index];
      exceptions[index] = t.clone_it();
      while (index++ != n)
        exceptions[index] = _exceptions[index - 1];
      _exceptions = exceptions;
    }
  
  }

  /** remove the exception of the given rank (0...)
   * 
   *  On error return FALSE in C++, produce a RuntimeException in Java
   */
  public void removeException(int rank) throws RuntimeException {
    UmlCom.send_cmd(identifier_(), OnInstanceCmd.removeExceptionCmd, rank);
    UmlCom.check();
    
    if (defined_()) {
      int n = _exceptions.length;
      UmlTypeSpec[] exceptions = new UmlTypeSpec[n - 1];
      int index;
      
      for (index = 0; index != rank; index += 1)
        exceptions[index] = _exceptions[index];
      
      while (++index != n)
        exceptions[index - 1] = _exceptions[index];
      
      _exceptions = exceptions;
    }
  
  }

  /** replaces the exception at the given rank (0...)
   * 
   *  On error return FALSE in C++, produce a RuntimeException in Java
   */
  public void replaceException(int rank, UmlTypeSpec t) throws RuntimeException {
    UmlCom.send_cmd(identifier_(), OnInstanceCmd.replaceExceptionCmd, rank, t);
    UmlCom.check();
    
    if (defined_())
      _exceptions[rank] = t.clone_it();
  
  }

  /** in case the operation is a 'get' operation, returns the associated
   *  attribute or relation
   */
  public UmlClassMember getOf() {
    read_if_needed_();
      
    return _get_of;
  }

  /** in case the operation is a 'set' operation, returns the associated
   *  attribute or relation
   */
  public UmlClassMember setOf() {
    read_if_needed_();
      
    return _set_of;
  }

  //  returns TRUE if the operation is declared const in C++
  public boolean isCppConst() {
    read_if_needed_();
      
    return _cpp_const;
  }

  /** to set if the operation is declared const in C++
   *  
   *  On error return FALSE in C++, produce a RuntimeException in Java
   */
  public void set_isCppConst(boolean y) throws RuntimeException {
    UmlCom.send_cmd(identifier_(), OnInstanceCmd.setIsCppConstCmd, (y) ? (byte) 1 : (byte) 0);
    UmlCom.check();
  
    _cpp_const =  y;
  }

  //  returns TRUE if the operation is a friend in C++
  public boolean isCppFriend() {
    read_if_needed_();
      
    return _cpp_friend;
  }

  /** to set if the operation is a friend in C++
   *  
   *  On error return FALSE in C++, produce a RuntimeException in Java
   */
  public void set_isCppFriend(boolean y) throws RuntimeException {
    UmlCom.send_cmd(identifier_(), OnInstanceCmd.setIsCppFriendCmd, (y) ? (byte) 1 : (byte) 0);
    UmlCom.check();
  
    _cpp_friend =  y;
  }

  //  returns TRUE if the operation is declared virtual in C++
  public boolean isCppVirtual() {
    read_if_needed_();
      
    return _cpp_virtual;
  }

  /** to set if the operation is declared virtual in C++
   *  
   *  On error return FALSE in C++, produce a RuntimeException in Java
   */
  public void set_isCppVirtual(boolean y) throws RuntimeException {
    UmlCom.send_cmd(identifier_(), OnInstanceCmd.setIsCppVirtualCmd, (y) ? (byte) 1 : (byte) 0);
    UmlCom.check();
  
    _cpp_virtual =  y;
  }

  //  returns TRUE if the operation is declared inline in C++
  public boolean isCppInline() {
    read_if_needed_();
      
    return _cpp_inline;
  }

  /** to set if the operation is declared inline in C++
   *  
   *  On error return FALSE in C++, produce a RuntimeException in Java
   */
  public void set_isCppInline(boolean y) throws RuntimeException {
    UmlCom.send_cmd(identifier_(), OnInstanceCmd.setIsCppInlineCmd, (y) ? (byte) 1 : (byte) 0);
    UmlCom.check();
  
    _cpp_inline =  y;
  }

  /** returns the operation's definition in C++, notes that the declaration
   *  is returned by the inherited ClassItemBase::CppDecl() operation
   */
  public String cppDef() {
    read_if_needed_();
      
    return _cpp_def;
  }

  /** sets the operation's definition in C++, notes that the declaration
   *  is set through the inherited ClassItemBase::set_CppDecl() operation
   * 
   *  On error return FALSE in C++, produce a RuntimeException in Java
   */
  public void set_CppDef(String s) throws RuntimeException {
    UmlCom.send_cmd(identifier_(), OnInstanceCmd.setCppDefCmd, s);
    UmlCom.check();
  
    _cpp_def = s;
  }

  /** returns the operation's body in C++, useless if the def does not
   *  contains ${body}. Note that the body is get each time from BOUML
   *  for memory size reason
   */
  public String cppBody() {
    // not memorized in the instance for memory size reason
    UmlCom.send_cmd(identifier_(), OnInstanceCmd.cppBodyCmd);
    return UmlCom.read_string();
  }

  /** sets the operation's body in C++, useless if the def does not 
   *  contains ${body}
   * 
   *  On error return FALSE in C++, produce a RuntimeException in Java
   */
  public void set_CppBody(String s) throws RuntimeException {
    // not memorized in the instance for memory size reason
    UmlCom.send_cmd(identifier_(), OnInstanceCmd.setCppBodyCmd, s);
    UmlCom.check();
  }

  /** in case the operation is a 'get' or 'set' operation, returns how
   *  the operation's C++ name must be generated
   */
  public String cppNameSpec() {
    read_if_needed_();
      
    return _cpp_name_spec;
  }

  /** in case the operation is a 'get' or 'set' operation, returns how
   *  the operation's C++ name must be generated
   *  
   *  On error return FALSE in C++, produce a RuntimeException in Java
   */
  public void set_CppNameSpec(String s) throws RuntimeException {
    UmlCom.send_cmd(identifier_(), OnInstanceCmd.setCppNameSpecCmd, s);
    UmlCom.check();
  
    _cpp_name_spec = s;
  }

  //  return the if the C++ definition is frozen, only for getter/setter operation
  public boolean cppGetSetFrozen() {
    read_if_needed_();
    return _cpp_get_set_frozen;
  }

  /** set the if the C++ definition is frozen, only for getter/setter operation
   * 
   *  On error return FALSE in C++, produce a RuntimeException in Java
   */
  public void set_CppGetSetFrozen(boolean v) throws RuntimeException {
    UmlCom.send_cmd(identifier_(), OnInstanceCmd.setCppFrozenCmd, (v) ? 1 : 0);
    UmlCom.check();
  
    _cpp_get_set_frozen = v;
  }

  //  returns TRUE if the operation is declared final in JAVA
  public boolean isJavaFinal() {
    read_if_needed_();
      
    return _java_final;
  }

  /** to set if the operation is declared final in JAVA
   *  
   *  On error return FALSE in C++, produce a RuntimeException in Java
   */
  public void set_isJavaFinal(boolean y) throws RuntimeException {
    UmlCom.send_cmd(identifier_(), OnInstanceCmd.setJavaFinalCmd, (y) ? (byte) 1 : (byte) 0);
    UmlCom.check();
  
    _java_final =  y;
  }

  //  returns TRUE if the operation is declared synchronized in JAVA
  public boolean isJavaSynchronized() {
    read_if_needed_();
      
    return _java_synchronized;
  }

  /** to set if the operation is declared synchronized in JAVA
   *  
   *  On error return FALSE in C++, produce a RuntimeException in Java
   */
  public void set_isJavaSynchronized(boolean y) throws RuntimeException {
    UmlCom.send_cmd(identifier_(), OnInstanceCmd.setJavaSynchronizedCmd, (y) ? (byte) 1 : (byte) 0);
    UmlCom.check();
  
    _java_synchronized =  y;
  }

  /** returns the operation's definition in Java, notes that it is
   *  already made by the inherited JavaDecl operation
   */
  public String javaDef() {
    return javaDecl();
  }

  /** sets the operation's definition in Java, notes that it is
   *  already made by the inherited set_JavaDecl operation
   * 
   *  On error return FALSE in C++, produce a RuntimeException in Java
   */
  public void set_JavaDef(String s) throws RuntimeException {
   set_JavaDecl(s);
  }

  /** returns the operation's body in Java++, useless if the def does
   *  not contains ${body} Note that the body is get each time from BOUML
   *  for memory size reason
   */
  public String javaBody() {
    // not memorized in the instance for memory size reason
    UmlCom.send_cmd(identifier_(), OnInstanceCmd.javaBodyCmd);
    return UmlCom.read_string();
  }

  /** sets the operation's body in Java, useless if the def does not 
   *  contains ${body}
   * 
   *  On error return FALSE in C++, produce a RuntimeException in Java
   */
  public void set_JavaBody(String s) throws RuntimeException {
    // not memorized in the instance for memory size reason
    UmlCom.send_cmd(identifier_(), OnInstanceCmd.setJavaBodyCmd, s);
    UmlCom.check();
  }

  /** in case the operation is a 'get' or 'set' operation, returns how
   *  the operation's JAVA name must be generated
   */
  public String javaNameSpec() {
    read_if_needed_();
      
    return _java_name_spec;
  }

  /** in case the operation is a 'get' or 'set' operation, returns how
   *  the operation's JAVA name must be generated
   *  
   *  On error return FALSE in C++, produce a RuntimeException in Java
   */
  public void set_JavaNameSpec(String s) throws RuntimeException {
    UmlCom.send_cmd(identifier_(), OnInstanceCmd.setJavaNameSpecCmd, s);
    UmlCom.check();
  
    _java_name_spec = s;
  }

  //  return the if the Java definition is frozen, only for getter/setter operation
  public boolean javaGetSetFrozen() {
    read_if_needed_();
    return _java_get_set_frozen;
  }

  /** set the if the Java definition is frozen, only for getter/setter operation
   * 
   *  On error return FALSE in C++, produce a RuntimeException in Java
   */
  public void set_JavaGetSetFrozen(boolean v) throws RuntimeException {
    UmlCom.send_cmd(identifier_(), OnInstanceCmd.setJavaFrozenCmd, (v) ? 1 : 0);
    UmlCom.check();
  
    _java_get_set_frozen = v;
  }

  //  returns TRUE if the operation is declared oneway in IDL
  public boolean isIdlOneway() {
    read_if_needed_();
      
    return _idl_oneway;
  }

  /** to set if the operation is declared oneway in IDL
   * 
   *  On error return FALSE in C++, produce a RuntimeException in Java
   */
  public void set_isIdlOneway(boolean y) throws RuntimeException {
    UmlCom.send_cmd(identifier_(), OnInstanceCmd.setIsIdlOnewayCmd, (y) ? (byte) 1 : (byte) 0);
    UmlCom.check();
  
    _idl_oneway = y;
  }

  /** in case the operation is a 'get' or 'set' operation, returns how
   *  the operation's IDL name must be generated
   */
  public String idlNameSpec() {
    read_if_needed_();
      
    return _idl_name_spec;
  }

  /** in case the operation is a 'get' or 'set' operation, returns how
   *  the operation's IDL name must be generated
   *  
   *  On error return FALSE in C++, produce a RuntimeException in Java
   */
  public void set_IdlNameSpec(String s) throws RuntimeException {
    UmlCom.send_cmd(identifier_(), OnInstanceCmd.setIdlNameSpecCmd, s);
    UmlCom.check();
  
    _idl_name_spec = s;
  }

  //  return the if the IDL definition is frozen, only for getter/setter operation
  public boolean idlGetSetFrozen() {
    read_if_needed_();
    return _idl_get_set_frozen;
  }

  /** set the if the IDL definition is frozen, only for getter/setter operation
   * 
   *  On error return FALSE in C++, produce a RuntimeException in Java
   */
  public void set_IdlGetSetFrozen(boolean v) throws RuntimeException {
    UmlCom.send_cmd(identifier_(), OnInstanceCmd.setIdlFrozenCmd, (v) ? 1 : 0);
    UmlCom.check();
  
    _idl_get_set_frozen = v;
  }

  /** to unload the object to free memory, it will be reloaded
   *  automatically if needed. args unused
   */
  public void unload(boolean rec, boolean del) {
    _return_type = null;
    _params = null;
    _exceptions = null;
    _cpp_def = null;
    _cpp_name_spec = null;
    _java_name_spec = null;
    _idl_name_spec = null;
    super.unload(rec, del);
  }

  private boolean _abstract;
  private boolean _cpp_const;
  private boolean _cpp_friend;

  private boolean _cpp_virtual;
  private boolean _cpp_inline;
  private boolean _java_final;
  private boolean _java_synchronized;

  private boolean _idl_oneway;
  private boolean _cpp_get_set_frozen;

  private boolean _java_get_set_frozen;

  private boolean _idl_get_set_frozen;

  private UmlTypeSpec _return_type;
  private UmlParameter[] _params;

  private UmlTypeSpec[] _exceptions;

  private String _cpp_def;
  private String _cpp_name_spec;
  private String _java_name_spec;
  private String _idl_name_spec;
  //  exclusive with set_of
  private UmlClassMember _get_of;

  //  exclusive with get_of
  private UmlClassMember _set_of;

  //  the constructor, do not call it yourself !!!!!!!!!!
  protected UmlBaseOperation(long id, String n) { super(id, n); }

  // internal, do NOT use it
  
  protected void read_uml_() {
    super.read_uml_();
    _return_type = new UmlTypeSpec();
    _return_type.type = (UmlClass) UmlBaseItem.read_();
    if (_return_type.type == null)
      _return_type.explicit_type = UmlCom.read_string();
    _abstract = UmlCom.read_bool();
    
    int i;
    int n;
    
    n = UmlCom.read_unsigned();
    _params = new UmlParameter[n];
  
    for (i = 0; i != n; i += 1) {
      UmlParameter param = new UmlParameter();
      
      param.dir = aDirection.fromInt(UmlCom.read_char());
      param.type.type = (UmlClass) UmlBaseItem.read_();
      if (param.type.type == null)
        param.type.explicit_type = UmlCom.read_string();
      param.name = UmlCom.read_string();
      param.default_value = UmlCom.read_string();
      _params[i] = param;
    }
    
    n = UmlCom.read_unsigned();
    _exceptions = new UmlTypeSpec[n];
    
    for (i = 0; i != n; i += 1) {
      UmlTypeSpec exception = new UmlTypeSpec();
      
      exception.type = (UmlClass) UmlBaseItem.read_();
      if (exception.type == null)
        exception.explicit_type = UmlCom.read_string();
      _exceptions[i] = exception;
    }
  
    _get_of = (UmlClassMember) UmlBaseItem.read_();
    _set_of = (UmlClassMember) UmlBaseItem.read_();
  }

  // internal, do NOT use it
  
  protected void read_cpp_() {
    super.read_cpp_();
    _cpp_const = UmlCom.read_bool();
    _cpp_friend = UmlCom.read_bool();
    _cpp_virtual = UmlCom.read_bool();
    _cpp_inline = UmlCom.read_bool();
    _cpp_def = UmlCom.read_string();
    _cpp_name_spec = UmlCom.read_string();
    _cpp_get_set_frozen = UmlCom.read_bool();
  }

  // internal, do NOT use it
  
  protected void read_java_() {
    super.read_java_();
    _java_final = UmlCom.read_bool();
    _java_synchronized = UmlCom.read_bool();
    _java_name_spec = UmlCom.read_string();
    _java_get_set_frozen = UmlCom.read_bool();
  }

  // internal, do NOT use it
  
  protected void read_idl_() {
    super.read_idl_();
    _idl_oneway = UmlCom.read_bool();
    _idl_name_spec = UmlCom.read_string();
    _idl_get_set_frozen = UmlCom.read_bool();
  }

};
