
abstract class UmlBaseSendObjectAction extends UmlActivityAction {
  /**  returns a new send object action named 's' created under 'parent'
   * 
   *  In case it cannot be created (the name is already used or
   *  invalid, 'parent' cannot contain it etc ...) return 0 in C++
   *  and produce a RuntimeException in Java
   */
  public static UmlSendObjectAction create(UmlItem parent, String s) throws RuntimeException
  {
    return (UmlSendObjectAction) parent.create_(anItemKind.aSendObjectAction, s);
  }

  //  returns the kind of the item
  public anItemKind kind() {
    return anItemKind.aSendObjectAction;
  }

  //   the constructor, do not call it yourself !!!!!!!!!!
  protected  UmlBaseSendObjectAction(long id, String s) {
    super(id, s);
  }

}
abstract class UmlBaseUnmarshallAction extends UmlActivityAction {
  /**  returns a new unmarshall action named 's' created under 'parent'
   * 
   *  In case it cannot be created (the name is already used or
   *  invalid, 'parent' cannot contain it etc ...) return 0 in C++
   *  and produce a RuntimeException in Java
   */
  public static UmlUnmarshallAction create(UmlItem parent, String s) throws RuntimeException
  {
    return (UmlUnmarshallAction) parent.create_(anItemKind.anUnmarshallAction, s);
  }

  //  returns the kind of the item
  public anItemKind kind() {
    return anItemKind.anUnmarshallAction;
  }

  //   the constructor, do not call it yourself !!!!!!!!!!
  protected  UmlBaseUnmarshallAction(long id, String s) {
    super(id, s);
  }

}
abstract class UmlBaseSendSignalAction extends UmlOnSignalAction {
  /**  returns a new send signal action named 's' created under 'parent'
   * 
   *  In case it cannot be created (the name is already used or
   *  invalid, 'parent' cannot contain it etc ...) return 0 in C++
   *  and produce a RuntimeException in Java
   */
  public static UmlSendSignalAction create(UmlItem parent, String s) throws RuntimeException
  {
    return (UmlSendSignalAction) parent.create_(anItemKind.aSendSignalAction, s);
  }

  //  returns the kind of the item
  public anItemKind kind() {
    return anItemKind.aSendSignalAction;
  }

  //   the constructor, do not call it yourself !!!!!!!!!!
  protected  UmlBaseSendSignalAction(long id, String s) {
    super(id, s);
  }

}
abstract class UmlBaseBroadcastSignalAction extends UmlOnSignalAction {
  /**  returns a new broadcast signal action named 's' created under 'parent'
   * 
   *  In case it cannot be created (the name is already used or
   *  invalid, 'parent' cannot contain it etc ...) return 0 in C++
   *  and produce a RuntimeException in Java
   */
  public static UmlBroadcastSignalAction create(UmlItem parent, String s) throws RuntimeException
  {
    return (UmlBroadcastSignalAction) parent.create_(anItemKind.aBroadcastSignalAction, s);
  }

  //  returns the kind of the item
  public anItemKind kind() {
    return anItemKind.aBroadcastSignalAction;
  }

  //   the constructor, do not call it yourself !!!!!!!!!!
  protected  UmlBaseBroadcastSignalAction(long id, String s) {
    super(id, s);
  }

}
abstract class UmlBaseValueSpecificationAction extends UmlActivityAction {
  /**  returns a new value specification action named 's' created under 'parent'
   * 
   *  In case it cannot be created (the name is already used or
   *  invalid, 'parent' cannot contain it etc ...) return 0 in C++
   *  and produce a RuntimeException in Java
   */
  public static UmlValueSpecificationAction create(UmlItem parent, String s) throws RuntimeException
  {
    return (UmlValueSpecificationAction) parent.create_(anItemKind.aValueSpecificationAction, s);
  }

  //  returns the kind of the item
  public anItemKind kind() {
    return anItemKind.aValueSpecificationAction;
  }

  //   the constructor, do not call it yourself !!!!!!!!!!
  protected  UmlBaseValueSpecificationAction(long id, String s) {
    super(id, s);
  }

  //  return the value
  public String value() {
    read_if_needed_();
    return _value;
  }

  /** set the value
   * 
   *  On error return FALSE in C++, produce a RuntimeException in Java
   */
  public void set_Value(String v) throws RuntimeException {
    UmlCom.send_cmd(identifier_(), OnInstanceCmd.setUmlActivityCmd, v);
    UmlCom.check();
  
    _value = v;
  }

  //  return the value in C++
  public String cppValue() {
    read_if_needed_();
    return _cpp_value;
  }

  /** set the value in C++
   * 
   *  On error return FALSE in C++, produce a RuntimeException in Java
   */
  public void set_CppValue(String v) throws RuntimeException {
    UmlCom.send_cmd(identifier_(), OnInstanceCmd.setCppActivityCmd, v);
    UmlCom.check();
  
    _cpp_value = v;
  }

  //  return the value in Java
  public String javaValue() {
    read_if_needed_();
    return _java_value;
  }

  /** set the value in Java
   * 
   *  On error return FALSE in C++, produce a RuntimeException in Java
   */
  public void set_JavaValue(String v) throws RuntimeException {
    UmlCom.send_cmd(identifier_(), OnInstanceCmd.setJavaActivityCmd, v);
    UmlCom.check();
  
    _java_value = v;
  }

  /** to unload the object to free memory, it will be reloaded automatically
   *  if needed. Recursively done for the sub items if 'rec' is TRUE. 
   * 
   *  if 'del' is true the sub items are deleted in C++, and removed from the
   *  internal dictionnary in C++ and Java (to allow it to be garbaged),
   *  you will have to call Children() to re-access to them
   */
  public void unload(boolean rec, boolean del) {
    _value = null;
    _cpp_value = null;
    _java_value = null;
    super.unload(rec, del);
  }

  private String _value;

  private String _cpp_value;

  private String _java_value;

  protected void read_uml_() {
    super.read_uml_();
    _value = UmlCom.read_string();
  }

  protected void read_cpp_() {
    super.read_cpp_();
    _cpp_value = UmlCom.read_string();
  }

  protected void read_java_() {
    super.read_java_();
    _java_value = UmlCom.read_string();
  }

}
abstract class UmlBaseOpaqueAction extends UmlActivityAction {
  /**  returns a new opaque action named 's' created under 'parent'
   * 
   *  In case it cannot be created (the name is already used or
   *  invalid, 'parent' cannot contain it etc ...) return 0 in C++
   *  and produce a RuntimeException in Java
   */
  public static UmlOpaqueAction create(UmlItem parent, String s) throws RuntimeException
  {
    return (UmlOpaqueAction) parent.create_(anItemKind.anOpaqueAction, s);
  }

  //  returns the kind of the item
  public anItemKind kind() {
    return anItemKind.anOpaqueAction;
  }

  //   the constructor, do not call it yourself !!!!!!!!!!
  protected  UmlBaseOpaqueAction(long id, String s) {
    super(id, s);
  }

  //  return the behavior
  public String behavior() {
    read_if_needed_();
    return _behavior;
  }

  /** set the behavior
   * 
   *  On error return FALSE in C++, produce a RuntimeException in Java
   */
  public void set_Behavior(String v) throws RuntimeException {
    UmlCom.send_cmd(identifier_(), OnInstanceCmd.setUmlActivityCmd, v);
    UmlCom.check();
  
    _behavior = v;
  }

  //  return the behavior in C++
  public String cppBehavior() {
    read_if_needed_();
    return _cpp_behavior;
  }

  /** set the behavior in C++
   * 
   *  On error return FALSE in C++, produce a RuntimeException in Java
   */
  public void set_CppBehavior(String v) throws RuntimeException {
    UmlCom.send_cmd(identifier_(), OnInstanceCmd.setCppActivityCmd, v);
    UmlCom.check();
  
    _cpp_behavior = v;
  }

  //  return the behavior in Java
  public String javaBehavior() {
    read_if_needed_();
    return _java_behavior;
  }

  /** set the behavior in Java
   * 
   *  On error return FALSE in C++, produce a RuntimeException in Java
   */
  public void set_JavaBehavior(String v) throws RuntimeException {
    UmlCom.send_cmd(identifier_(), OnInstanceCmd.setJavaActivityCmd, v);
    UmlCom.check();
  
    _java_behavior = v;
  }

  /** to unload the object to free memory, it will be reloaded automatically
   *  if needed. Recursively done for the sub items if 'rec' is TRUE. 
   * 
   *  if 'del' is true the sub items are deleted in C++, and removed from the
   *  internal dictionnary in C++ and Java (to allow it to be garbaged),
   *  you will have to call Children() to re-access to them
   */
  public void unload(boolean rec, boolean del) {
    _behavior = null;
    _cpp_behavior = null;
    _java_behavior = null;
    super.unload(rec, del);
  }

  private String _behavior;

  private String _cpp_behavior;

  private String _java_behavior;

  protected void read_uml_() {
    super.read_uml_();
    _behavior = UmlCom.read_string();
  }

  protected void read_cpp_() {
    super.read_cpp_();
    _cpp_behavior = UmlCom.read_string();
  }

  protected void read_java_() {
    super.read_java_();
    _java_behavior = UmlCom.read_string();
  }

}
abstract class UmlBaseAcceptEventAction extends UmlActivityAction {
  /**  returns a new accept event action named 's' created under 'parent'
   * 
   *  In case it cannot be created (the name is already used or
   *  invalid, 'parent' cannot contain it etc ...) return 0 in C++
   *  and produce a RuntimeException in Java
   */
  public static UmlAcceptEventAction create(UmlItem parent, String s) throws RuntimeException
  {
    return (UmlAcceptEventAction) parent.create_(anItemKind.anAcceptEventAction, s);
  }

  //  returns the kind of the item
  public anItemKind kind() {
    return anItemKind.anAcceptEventAction;
  }

  //   the constructor, do not call it yourself !!!!!!!!!!
  protected  UmlBaseAcceptEventAction(long id, String s) {
    super(id, s);
  }

  //  return the isUnmarshall attribute, if TRUE there are multiple output pins for attributes or the event.
  public boolean isUnmarshall() {
    read_if_needed_();
    return _unmarshall;
  }

  /** set the isUnmarshall attribute
   * 
   *  On error return FALSE in C++, produce a RuntimeException in Java
   */
  public void set_isUnmarshall(boolean v) throws RuntimeException {
    UmlCom.send_cmd(identifier_(), OnInstanceCmd.setUnmarshallCmd, (v) ? (byte) 1 : (byte) 0);
    UmlCom.check();
  
    _unmarshall = v;
  }

  //  return the isTimeEvent attribute, if TRUE the event is a time event
  public boolean isTimeEvent() {
    read_if_needed_();
    return _timeevent;
  }

  /** set the isTimeEvent attribute
   * 
   *  On error return FALSE in C++, produce a RuntimeException in Java
   */
  public void set_isTimeEvent(boolean v) throws RuntimeException {
    UmlCom.send_cmd(identifier_(), OnInstanceCmd.setTimeEventCmd, (v) ? (byte) 1 : (byte) 0);
    UmlCom.check();
  
    _timeevent = v;
  }

  //  return the trigger
  public String trigger() {
    read_if_needed_();
    return _trigger;
  }

  /** set the trigger
   * 
   *  On error return FALSE in C++, produce a RuntimeException in Java
   */
  public void set_Trigger(String v) throws RuntimeException {
    UmlCom.send_cmd(identifier_(), OnInstanceCmd.setUmlTriggerCmd, v);
    UmlCom.check();
  
    _trigger = v;
  }

  //  return the trigger in C++
  public String cppTrigger() {
    read_if_needed_();
    return _cpp_trigger;
  }

  /** set the trigger in C++
   * 
   *  On error return FALSE in C++, produce a RuntimeException in Java
   */
  public void set_CppTrigger(String v) throws RuntimeException {
    UmlCom.send_cmd(identifier_(), OnInstanceCmd.setCppTriggerCmd, v);
    UmlCom.check();
  
    _cpp_trigger = v;
  }

  //  return the trigger in Java
  public String javaTrigger() {
    read_if_needed_();
    return _java_trigger;
  }

  /** set the trigger in Java
   * 
   *  On error return FALSE in C++, produce a RuntimeException in Java
   */
  public void set_JavaTrigger(String v) throws RuntimeException {
    UmlCom.send_cmd(identifier_(), OnInstanceCmd.setJavaTriggerCmd, v);
    UmlCom.check();
  
    _java_trigger = v;
  }

  /** to unload the object to free memory, it will be reloaded automatically
   *  if needed. Recursively done for the sub items if 'rec' is TRUE. 
   * 
   *  if 'del' is true the sub items are deleted in C++, and removed from the
   *  internal dictionnary in C++ and Java (to allow it to be garbaged),
   *  you will have to call Children() to re-access to them
   */
  public void unload(boolean rec, boolean del) {
    _trigger = null;
    _cpp_trigger = null;
    _java_trigger = null;
    super.unload(rec, del);
  }

  private boolean _unmarshall;

  private boolean _timeevent;

  private String _trigger;

  private String _cpp_trigger;

  private String _java_trigger;

  protected void read_uml_() {
    super.read_uml_();
    _unmarshall = UmlCom.read_bool();
    _timeevent = UmlCom.read_bool();
    _trigger = UmlCom.read_string();
  }

  protected void read_cpp_() {
    super.read_cpp_();
    _cpp_trigger = UmlCom.read_string();
  }

  protected void read_java_() {
    super.read_java_();
    _java_trigger = UmlCom.read_string();
  }

}
abstract class UmlBaseCallOperationAction extends UmlActivityAction {
  /**  returns a new call operation action named 's' created under 'parent'
   * 
   *  In case it cannot be created (the name is already used or
   *  invalid, 'parent' cannot contain it etc ...) return 0 in C++
   *  and produce a RuntimeException in Java
   */
  public static UmlCallOperationAction create(UmlItem parent, String s) throws RuntimeException
  {
    return (UmlCallOperationAction) parent.create_(anItemKind.aCallOperationAction, s);
  }

  //  returns the kind of the item
  public anItemKind kind() {
    return anItemKind.aCallOperationAction;
  }

  //   the constructor, do not call it yourself !!!!!!!!!!
  protected  UmlBaseCallOperationAction(long id, String s) {
    super(id, s);
  }

  //  return the isSynchronous attribute, if TRUE the caller waits for the completion of the invoked behavior
  public boolean isSynchronous() {
    read_if_needed_();
    return _synchronous;
  }

  /** set the isSynchronous attribute
   * 
   *  On error return FALSE in C++, produce a RuntimeException in Java
   */
  public void set_isSynchronous(boolean v) throws RuntimeException {
    UmlCom.send_cmd(identifier_(), OnInstanceCmd.setFlagCmd, (v) ? (byte) 1 : (byte) 0);
    UmlCom.check();
  
    _synchronous = v;
  }

  //  return the operation
  public UmlOperation operation() {
    read_if_needed_();
    return _operation;
  }

  /** set the operation
   * 
   *  On error return FALSE in C++, produce a RuntimeException in Java
   */
  public void set_Operation(UmlOperation v) throws RuntimeException {
    UmlCom.send_cmd(identifier_(), OnInstanceCmd.setDefCmd, v.identifier_());
    UmlCom.check();
  
    _operation = v;
  }

  private boolean _synchronous;

  private UmlOperation _operation;

  protected void read_uml_() {
    super.read_uml_();
    _synchronous = UmlCom.read_bool();
    _operation = (UmlOperation) UmlBaseItem.read_();
  }

}
abstract class UmlBaseCallBehaviorAction extends UmlActivityAction {
  /**  returns a new call behavior action named 's' created under 'parent'
   * 
   *  In case it cannot be created (the name is already used or
   *  invalid, 'parent' cannot contain it etc ...) return 0 in C++
   *  and produce a RuntimeException in Java
   */
  public static UmlCallBehaviorAction create(UmlItem parent, String s) throws RuntimeException
  {
    return (UmlCallBehaviorAction) parent.create_(anItemKind.aCallBehaviorAction, s);
  }

  //  returns the kind of the item
  public anItemKind kind() {
    return anItemKind.aCallBehaviorAction;
  }

  //   the constructor, do not call it yourself !!!!!!!!!!
  protected  UmlBaseCallBehaviorAction(long id, String s) {
    super(id, s);
  }

  //  return the isSynchronous attribute, if TRUE the caller waits for the completion of the invoked behavior
  public boolean isSynchronous() {
    read_if_needed_();
    return _synchronous;
  }

  /** set the isSynchronous attribute
   * 
   *  On error return FALSE in C++, produce a RuntimeException in Java
   */
  public void set_isSynchronous(boolean v) throws RuntimeException {
    UmlCom.send_cmd(identifier_(), OnInstanceCmd.setFlagCmd, (v) ? (byte) 1 : (byte) 0);
    UmlCom.check();
  
    _synchronous = v;
  }

  //  return the behavior, may be an activity or a state machine
  public UmlItem behavior() {
    read_if_needed_();
    return _behavior;
  }

  /** set the behavior
   * 
   *  On error return FALSE in C++, produce a RuntimeException in Java
   */
  public void set_Behavior(UmlItem v) throws RuntimeException {
    UmlCom.send_cmd(identifier_(), OnInstanceCmd.setDefCmd, v.identifier_());
    UmlCom.check();
  
    _behavior = v;
  }

  private boolean _synchronous;

  private UmlItem _behavior;

  protected void read_uml_() {
    super.read_uml_();
    _synchronous = UmlCom.read_bool();
    _behavior = UmlBaseItem.read_();
  }

}
abstract class UmlBaseClearVariableValueAction extends UmlAccessVariableValueAction {
  /**  returns a new clear variable value action named 's' created under 'parent'
   * 
   *  In case it cannot be created (the name is already used or
   *  invalid, 'parent' cannot contain it etc ...) return 0 in C++
   *  and produce a RuntimeException in Java
   */
  public static UmlClearVariableValueAction create(UmlItem parent, String s) throws RuntimeException
  {
    return (UmlClearVariableValueAction) parent.create_(anItemKind.aClearVariableValueAction, s);
  }

  //  returns the kind of the item
  public anItemKind kind() {
    return anItemKind.aClearVariableValueAction;
  }

  //   the constructor, do not call it yourself !!!!!!!!!!
  protected  UmlBaseClearVariableValueAction(long id, String s) {
    super(id, s);
  }

}
abstract class UmlBaseReadVariableValueAction extends UmlAccessVariableValueAction {
  /**  returns a new read variable value action named 's' created under 'parent'
   * 
   *  In case it cannot be created (the name is already used or
   *  invalid, 'parent' cannot contain it etc ...) return 0 in C++
   *  and produce a RuntimeException in Java
   */
  public static UmlReadVariableValueAction create(UmlItem parent, String s) throws RuntimeException
  {
    return (UmlReadVariableValueAction) parent.create_(anItemKind.aReadVariableValueAction, s);
  }

  //  returns the kind of the item
  public anItemKind kind() {
    return anItemKind.aReadVariableValueAction;
  }

  //   the constructor, do not call it yourself !!!!!!!!!!
  protected  UmlBaseReadVariableValueAction(long id, String s) {
    super(id, s);
  }

}
abstract class UmlBaseWriteVariableValueAction extends UmlAccessVariableValueAction {
  /**  returns a new write variable value action named 's' created under 'parent'
   * 
   *  In case it cannot be created (the name is already used or
   *  invalid, 'parent' cannot contain it etc ...) return 0 in C++
   *  and produce a RuntimeException in Java
   */
  public static UmlWriteVariableValueAction create(UmlItem parent, String s) throws RuntimeException
  {
    return (UmlWriteVariableValueAction) parent.create_(anItemKind.aWriteVariableValueAction, s);
  }

  //  returns the kind of the item
  public anItemKind kind() {
    return anItemKind.aWriteVariableValueAction;
  }

  //   the constructor, do not call it yourself !!!!!!!!!!
  protected  UmlBaseWriteVariableValueAction(long id, String s) {
    super(id, s);
  }

}
abstract class UmlBaseAddVariableValueAction extends UmlAccessVariableValueAction {
  /**  returns a new add variable value action named 's' created under 'parent'
   * 
   *  In case it cannot be created (the name is already used or
   *  invalid, 'parent' cannot contain it etc ...) return 0 in C++
   *  and produce a RuntimeException in Java
   */
  public static UmlAddVariableValueAction create(UmlItem parent, String s) throws RuntimeException
  {
    return (UmlAddVariableValueAction) parent.create_(anItemKind.anAddVariableValueAction, s);
  }

  //  returns the kind of the item
  public anItemKind kind() {
    return anItemKind.anAddVariableValueAction;
  }

  //   the constructor, do not call it yourself !!!!!!!!!!
  protected  UmlBaseAddVariableValueAction(long id, String s) {
    super(id, s);
  }

  //  return the isReplaceAll attribute, if TRUE existing values of the variable must be removed before adding the new value
  public boolean isReplaceAll() {
    read_if_needed_();
    return _replace_all;
  }

  /** set the isReplaceAll attribute
   * 
   *  On error return FALSE in C++, produce a RuntimeException in Java
   */
  public void set_isReplaceAll(boolean v) throws RuntimeException {
    UmlCom.send_cmd(identifier_(), OnInstanceCmd.setFlagCmd, (v) ? (byte) 1 : (byte) 0);
    UmlCom.check();
  
    _replace_all = v;
  }

  private boolean _replace_all;

  protected void read_uml_() {
    super.read_uml_();
    _replace_all = UmlCom.read_bool();
  }

}
abstract class UmlBaseRemoveVariableValueAction extends UmlAccessVariableValueAction {
  /**  returns a new remove variable value action named 's' created under 'parent'
   * 
   *  In case it cannot be created (the name is already used or
   *  invalid, 'parent' cannot contain it etc ...) return 0 in C++
   *  and produce a RuntimeException in Java
   */
  public static UmlRemoveVariableValueAction create(UmlItem parent, String s) throws RuntimeException
  {
    return (UmlRemoveVariableValueAction) parent.create_(anItemKind.aRemoveVariableValueAction, s);
  }

  //  returns the kind of the item
  public anItemKind kind() {
    return anItemKind.aRemoveVariableValueAction;
  }

  //   the constructor, do not call it yourself !!!!!!!!!!
  protected  UmlBaseRemoveVariableValueAction(long id, String s) {
    super(id, s);
  }

  //  return the isRemoveDuplicates attribute, if TRUE remove duplicates of the value if non-unique
  public boolean isRemoveDuplicates() {
    read_if_needed_();
    return _remove_duplicates;
  }

  /** set the isRemoveDuplicates attribute
   * 
   *  On error return FALSE in C++, produce a RuntimeException in Java
   */
  public void set_isRemoveDuplicates(boolean v) throws RuntimeException {
    UmlCom.send_cmd(identifier_(), OnInstanceCmd.setFlagCmd, (v) ? (byte) 1 : (byte) 0);
    UmlCom.check();
  
    _remove_duplicates = v;
  }

  private boolean _remove_duplicates;

  protected void read_uml_() {
    super.read_uml_();
    _remove_duplicates = UmlCom.read_bool();
  }

}
