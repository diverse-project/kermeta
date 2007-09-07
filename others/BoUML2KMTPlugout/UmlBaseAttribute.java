
//   Manage the class's attributs

abstract class UmlBaseAttribute extends UmlClassMember {
  /** returns a new attribute named 's' created under 'parent'
   * 
   *  In case it cannot be created (the name is already used or
   *  invalid, 'parent' cannot contain it etc ...) return 0 in C++
   *  and produce a RuntimeException in Java
   */
  public static UmlAttribute create(UmlClass parent, String s) throws RuntimeException
  {
    return (UmlAttribute) parent.create_(anItemKind.anAttribute, s);
  }

  //  returns the kind of the item
  public anItemKind kind() {
    return anItemKind.anAttribute;
  }

  //  indicates if the attribute is read only, returns TRUE if yes
  public boolean isReadOnly() {
    read_if_needed_();
    
    return _read_only;
  }

  /** to set the 'read only' state of the attribute
   *  
   *  On error return FALSE in C++, produce a RuntimeException in Java
   */
  public void set_isReadOnly(boolean y) throws RuntimeException {
    UmlCom.send_cmd(identifier_(), OnInstanceCmd.setIsReadOnlyCmd, (y) ? (byte) 1 : (byte) 0);
    UmlCom.check();
  
    _read_only =  y;
  }

  //  returns the default attribute value, may be an empty string
  public String defaultValue() {
    read_if_needed_();
    
    return _default_value;
  }

  /** to set the default attribute value ("" allowed)
   *  
   *  On error return FALSE in C++, produce a RuntimeException in Java
   */
  public void set_DefaultValue(String s) throws RuntimeException {
    UmlCom.send_cmd(identifier_(), OnInstanceCmd.setDefaultValueCmd, s);
    UmlCom.check();
  
    _default_value = s;
  }

  //  returns the attribute UML type
  public UmlTypeSpec type() {
    read_if_needed_();
    
    return _type;
  }

  /** to set the attribute UML type
   *  
   *  On error return FALSE in C++, produce a RuntimeException in Java
   */
  public void set_Type(UmlTypeSpec t) throws RuntimeException {
    UmlCom.send_cmd(identifier_(), OnInstanceCmd.setTypeCmd, t);
    UmlCom.check();
  
    _type = t;
  }

  //  returns the 'get' operation of the attribute, or 0 if it does not exist
  public UmlOperation getOperation() {
    read_if_needed_();
    
    return _get_oper;
  }

  /** to generate an associated 'get' operation
   *  
   *  On error return FALSE in C++, produce a RuntimeException in Java
   */
  public void addGetOperation() throws RuntimeException {
    UmlCom.send_cmd(identifier_(), OnInstanceCmd.addGetOperCmd);
    UmlCom.check();
    
    reread_children_if_needed_();
  
  }

  //  returns the 'set' operation of the attribute, or 0 if it does not exist
  
  public UmlOperation setOperation() {
    read_if_needed_();
    
    return _set_oper;
  }

  /** to generate an associated 'set' operation
   *  
   *  On error return FALSE in C++, produce a RuntimeException in Java
   */
  public void addSetOperation() throws RuntimeException {
    UmlCom.send_cmd(identifier_(), OnInstanceCmd.addSetOperCmd);
    UmlCom.check();
    
    reread_children_if_needed_();
  
  }

  //  Indicate if the attribute is 'mutable'
  public boolean isCppMutable() {
    read_if_needed_();
    
    return _cpp_mutable;
  }

  /** Set if the attribute is 'mutable'
   * 
   *  On error return FALSE in C++, produce a RuntimeException in Java
   */
  public void set_isCppMutable(boolean y) throws RuntimeException {
    UmlCom.send_cmd(identifier_(), OnInstanceCmd.setIsCppMutableCmd, (y) ? (byte) 1 : (byte) 0);
    UmlCom.check();
  
    _cpp_mutable = y;
  }

  //  indicates if the attribute is 'transient', returns TRUE if yes
  public boolean isJavaTransient() {
    read_if_needed_();
    
    return _java_transient;
  }

  /** to set the 'transient' state of the attribute
   *  
   *  On error return FALSE in C++, produce a RuntimeException in Java
   */
  public void set_isJavaTransient(boolean y) throws RuntimeException {
    UmlCom.send_cmd(identifier_(), OnInstanceCmd.setIsJavaTransientCmd, (y) ? (byte) 1 : (byte) 0);
    UmlCom.check();
  
    _java_transient = y;
  }

  /** in case the attribute is an IDL union's member returns the
   *  corresponding 'case', an empty string in case it is not specified
   */
  public String idlCase() {
    read_if_needed_();
    
    return (_idl_case != null) ? _idl_case.name() : _idl_explicit_case;
  }

  /** to set the 'case' even the attribute is not (already) known as
   *  an IDL union's member
   * 
   *  On error return FALSE in C++, produce a RuntimeException in Java
   */
  public void set_IdlCase(UmlAttribute a) throws RuntimeException {
    UmlCom.send_cmd(identifier_(), OnInstanceCmd.setIdlCaseCmd, a.identifier_(), "");
    UmlCom.check();
    
    _idl_case = a;
    _idl_explicit_case = null;
  }

  /** to set the 'case' even the attribute is not (already) known as
   *  an IDL union's member
   * 
   *  On error return FALSE in C++, produce a RuntimeException in Java
   */
  public void set_IdlCase(String s) throws RuntimeException {
    UmlCom.send_cmd(identifier_(), OnInstanceCmd.setIdlCaseCmd, (long) 0, s);
    UmlCom.check();
    
    _idl_case = null;
    _idl_explicit_case = s;
  
  }

  /** to unload the object to free memory, it will be reloaded
   *  automatically if needed. args unused
   */
  public void unload(boolean rec, boolean del) {
    _type = null;
    _default_value = null;
    _idl_explicit_case = null;
    super.unload(rec, del);
  }

  private boolean _read_only;
  private boolean _cpp_mutable;

  private boolean _java_transient;

  private String _default_value;
  private UmlTypeSpec _type;
  private UmlOperation _get_oper;
  private UmlOperation _set_oper;
  //  exclusive with idl_explicit_case
  private UmlAttribute _idl_case;
  private String _idl_explicit_case;
  //  the constructor, do not call it yourself !!!!!!!!!!
  public UmlBaseAttribute(long id, String n) { super(id, n); }

  // internal, do NOT use it
  
  protected void read_uml_() {
    super.read_uml_();
    _type = new UmlTypeSpec();
    _type.type = (UmlClass) UmlBaseItem.read_();
    if (_type.type == null)
      _type.explicit_type = UmlCom.read_string();
    _default_value = UmlCom.read_string();
    _read_only = UmlCom.read_bool();
    _get_oper = (UmlOperation) UmlBaseItem.read_();
    _set_oper = (UmlOperation) UmlBaseItem.read_();
  }

  // internal, do NOT use it
  
  protected void read_cpp_() {
    super.read_cpp_();
    _cpp_mutable = UmlCom.read_bool();
  }

  // internal, do NOT use it
  
  protected void read_java_() {
    super.read_java_();
    _java_transient = UmlCom.read_bool();
  }

  // internal, do NOT use it
  
  protected void read_idl_() {
    super.read_idl_();
    _idl_case = (UmlAttribute) UmlBaseItem.read_();
    if (_idl_case == null)
      _idl_explicit_case = UmlCom.read_string();
  }

};
