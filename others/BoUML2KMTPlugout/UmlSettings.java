
import java.util.*;
/** This class manages settings not linked with a language, configured through
 *  the 'Generation settings' dialog.
 * 
 *  This class may be defined as a 'singleton', but I prefer to use static 
 *  members allowing to just write 'UmlSettings::member' rather than
 *  'UmlSettings::instance()->member' or other long sentence like this.
 */
class UmlSettings {
  //  return the default description
  public static String artifactDescription()
  {
    read_if_needed_();
  
    return _artifact_default_description;
  }

  /** set the default description
   * 
   *  On error : return FALSE in C++, produce a RuntimeException in Java
   */
  public static void set_ArtifactDescription(String v)
  {
    UmlCom.send_cmd(CmdFamily.umlSettingsCmd, UmlSettingsCmd._setDefaultArtifactDescriptionCmd, v);
    UmlCom.check();
    _artifact_default_description = v;
  }

  //  return the default description
  public static String classDescription()
  {
    read_if_needed_();
  
    return _class_default_description;
  }

  /** set the default description
   * 
   *  On error : return FALSE in C++, produce a RuntimeException in Java
   */
  public static void set_ClassDescription(String v)
  {
    UmlCom.send_cmd(CmdFamily.umlSettingsCmd, UmlSettingsCmd._setDefaultClassDescriptionCmd, v);
    UmlCom.check();
    _class_default_description = v;
  }

  //  return the default description
  public static String operationDescription()
  {
    read_if_needed_();
  
    return _operation_default_description;
  }

  /** set the default description
   * 
   *  On error : return FALSE in C++, produce a RuntimeException in Java
   */
  public static void set_OperationDescription(String v)
  {
    UmlCom.send_cmd(CmdFamily.umlSettingsCmd, UmlSettingsCmd._setDefaultOperationDescriptionCmd, v);
    UmlCom.check();
    _operation_default_description = v;
  }

  //  return the default description
  public static String attributeDescription()
  {
    read_if_needed_();
  
    return _attribute_default_description;
  }

  /** set the default description
   * 
   *  On error : return FALSE in C++, produce a RuntimeException in Java
   */
  public static void set_AttributeDescription(String v)
  {
    UmlCom.send_cmd(CmdFamily.umlSettingsCmd, UmlSettingsCmd._setDefaultAttributeDescriptionCmd, v);
    UmlCom.check();
    _attribute_default_description = v;
  }

  //  return the default description
  public static String relationDescription()
  {
    read_if_needed_();
  
    return _relation_default_description;
  }

  /** set the default description
   * 
   *  On error : return FALSE in C++, produce a RuntimeException in Java
   */
  public static void set_RelationDescription(String v)
  {
    UmlCom.send_cmd(CmdFamily.umlSettingsCmd, UmlSettingsCmd._setDefaultRelationDescriptionCmd, v);
    UmlCom.check();
    _relation_default_description = v;
  }

  //  never called !
  protected UmlSettings(){
  }

  protected static boolean _defined;
  protected static String _artifact_default_description;

  protected static String _class_default_description;

  protected static String _operation_default_description;

  protected static String _attribute_default_description;

  protected static String _relation_default_description;

  protected static Hashtable _map_builtins;
  protected static UmlBuiltin[] _builtins;
  protected static Hashtable _map_relation_stereotypes;
  protected static UmlStereotype[] _relation_stereotypes;
  protected static Hashtable _map_class_stereotypes;
  protected static UmlStereotype[] _class_stereotypes;
  // internal, do NOT use it
  
  protected static void read_()
  {
    int n;
    int index;
    
    n = UmlCom.read_unsigned();
    
    _builtins = new UmlBuiltin[n];
    _map_builtins = new Hashtable((n == 0) ? 1 : n);
    
    for (index = 0; index != n; index += 1) {
      _builtins[index] = new UmlBuiltin();
      _builtins[index].uml = UmlCom.read_string();
      _map_builtins.put(_builtins[index].uml, _builtins[index]);
    }
    
    n = UmlCom.read_unsigned();
    
    _relation_stereotypes = new UmlStereotype[n];
    _map_relation_stereotypes = new Hashtable((n == 0) ? 1 : n);
    
    for (index = 0; index != n; index += 1) {
      _relation_stereotypes[index] = new UmlStereotype();
      _relation_stereotypes[index].uml = UmlCom.read_string();
      _map_relation_stereotypes.put(_relation_stereotypes[index].uml,
  				  _relation_stereotypes[index]);
    }
    
    n = UmlCom.read_unsigned();
    
    _class_stereotypes = new UmlStereotype[n];
    _map_class_stereotypes = new Hashtable((n == 0) ? 1 : n);
    
    for (index = 0; index != n; index += 1) {
      _class_stereotypes[index] = new UmlStereotype();
      _class_stereotypes[index].uml = UmlCom.read_string();
      _map_class_stereotypes.put(_class_stereotypes[index].uml,
  			       _class_stereotypes[index]);
    }
  
    _artifact_default_description = UmlCom.read_string();
    _class_default_description = UmlCom.read_string();
    _operation_default_description = UmlCom.read_string();
    _attribute_default_description = UmlCom.read_string();
    _relation_default_description = UmlCom.read_string();
  }

  // internal, do NOT use it
  
  protected static void read_if_needed_()
  {
    if (!_defined) {
      UmlCom.send_cmd(CmdFamily.umlSettingsCmd, UmlSettingsCmd._getUmlSettingsCmd);
      read_();
      _defined = true;
    }
  }

  // internal, do NOT use it
  
  protected static int multiplicity_column(String mult)
  {
    if ((mult == null) || (mult.length() == 0) || mult.equals("1"))
      return 0;
  
    if (mult.equals("*") || (mult.indexOf("..") != -1))
      return 1;
  
    return 2;
  }

  // internal, do NOT use it
  
  protected static UmlBuiltin add_type(String s)
  {
    int n = _builtins.length;
    int index;
  
    UmlBuiltin[] builtins = new UmlBuiltin[n + 1];
  
    for (index = 0; index != n; index += 1)
      builtins[index] = _builtins[index];
      
    UmlBuiltin builtin = new UmlBuiltin();
    
    builtins[index] = builtin;
    builtin.uml = s;
    builtin.cpp = s;
    builtin.cpp_in = "const ${type}";
    builtin.cpp_out = "${type} &";
    builtin.cpp_inout = "${type} &";
    builtin.java = s;
    builtin.idl = s;
  
    _map_builtins.put(s, builtin);
  
    _builtins = builtins;
    
    return builtin;
  }

  // internal, do NOT use it
  
  protected static UmlStereotype add_rel_stereotype(String s)
  {
    int n = _relation_stereotypes.length;
    int index;
  
    UmlStereotype[] relation_stereotypes = new UmlStereotype[n + 1];
  
    for (index = 0; index != n; index += 1)
      relation_stereotypes[index] = _relation_stereotypes[index];
      
    UmlStereotype st = new UmlStereotype();
    
    relation_stereotypes[index] = st;
    st.uml = s;
    st.cpp = s;
    st.java = s;
    st.idl = s;
  
    _map_relation_stereotypes.put(s, st);
  
    _relation_stereotypes = relation_stereotypes;
  
    return st;
  }

  // internal, do NOT use it
  
  protected static UmlStereotype add_class_stereotype(String s)
  {
    int n = _class_stereotypes.length;
    int index;
  
    UmlStereotype[] class_stereotypes = new UmlStereotype[n + 1];
  
    for (index = 0; index != n; index += 1)
      class_stereotypes[index] = _class_stereotypes[index];
      
    UmlStereotype st = new UmlStereotype();
    
    class_stereotypes[index] = st;
    st.uml = s;
    st.cpp = s;
    st.java = s;
    st.idl = s;
  
    _map_class_stereotypes.put(s, st);
  
    _class_stereotypes = class_stereotypes;
  
    return st;
  }

};
