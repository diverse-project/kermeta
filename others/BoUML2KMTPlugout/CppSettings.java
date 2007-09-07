
import java.util.*;
/** This class manages settings concerning C++, configured through
 *  the 'Generation settings' dialog.
 * 
 *  This class may be defined as a 'singleton', but I prefer to use static 
 *  members allowing to just write 'CppSettings::member' rather than
 *  'CppSettings::instance()->member' or other long sentence like this.
 */
final class CppSettings extends UmlSettings {
  /** returns TRUE when the created C++ objects are initialized
   *  with the default declaration/definition
   */
  public static boolean useDefaults()
  {
    UmlCom.send_cmd(CmdFamily.cppSettingsCmd, CppSettingsCmd._getCppUseDefaultsCmd);
    return UmlCom.read_bool();
  }

  /** if y is TRUE the future created C++ objects will be initialized
   *  with the default declaration/definition
   * 
   *  On error : return FALSE in C++, produce a RuntimeException in Java
   */
  public static void set_UseDefaults(boolean y) throws RuntimeException
  {
    UmlCom.send_cmd(CmdFamily.cppSettingsCmd, CppSettingsCmd._setCppUseDefaultsCmd,
  		  (y) ? (byte) 1 : (byte) 0);
    UmlCom.check();
  }

  /** returns the C++ type corresponding to the 'UML' type given in
   *  argument, as it is configured in the first 'Generation settings'
   *  dialog's tab
   */
  public static String type(String s)
  {
    read_if_needed_();
    
    UmlBuiltin b = (UmlBuiltin) _map_builtins.get(s);
    
    return (b != null) ? b.cpp : s;
  }

  /** set the C++ type corresponding to the 'UML' type given in
   *  argument, as it is configured in the first 'Generation settings'
   *  dialog's tab
   * 
   *  On error : return FALSE in C++, produce a RuntimeException in Java
   */
  public static void set_Type(String s, String v) throws RuntimeException
  {
    UmlCom.send_cmd(CmdFamily.cppSettingsCmd, CppSettingsCmd._setCppTypeCmd, s, v);
    UmlCom.check();
    
    UmlBuiltin b = (UmlBuiltin) _map_builtins.get(s);
  
    if (b == null)
      b = UmlSettings.add_type(s);
    b.cpp = v;
  
  }

  /** reverse of the Type() operation, returns the 'UML' type corresponding
   *  to the C++ type given in argument
   */
  public static String umlType(String s)
  {
    read_if_needed_();
    
    int index = _builtins.length;
    
    while (index-- != 0)
      if (_builtins[index].cpp.equals(s))
        return _builtins[index].uml;
    
    return null;
  }

  /** returns the C++ stereotype corresponding to the 'UML' stereotype given
   *  in argument
   */
  public static String relationStereotype(String s)
  {
    read_if_needed_();
    
    UmlStereotype b = (UmlStereotype) _map_relation_stereotypes.get(s);
    
    return (b != null) ? b.cpp : s;
  }

  /** set the C++ stereotype corresponding to the 'UML' stereotype given
   *  in argument
   * 
   *  On error : return FALSE in C++, produce a RuntimeException in Java
   */
  public static void set_RelationStereotype(String s, String v) throws RuntimeException
  {
   UmlCom.send_cmd(CmdFamily.cppSettingsCmd, CppSettingsCmd._setCppRelationStereotypeCmd, s, v);
   UmlCom.check();
   
   UmlStereotype st = (UmlStereotype) _map_relation_stereotypes.get(s);
  
   if (st == null)
     st = add_rel_stereotype(s);
   st.cpp = v;
  
  }

  /** reverse of the RelationStereotype() operation, returns the 'UML' 
   *  stereotype corresponding to the C++ one given in argument
   */
  public static String relationUmlStereotype(String s)
  {
    read_if_needed_();
    
    int index = _relation_stereotypes.length;
    
    while (index-- != 0)
      if (_relation_stereotypes[index].cpp.equals(s))
        return _relation_stereotypes[index].uml;
    
    return null;
  }

  /** returns the C++ stereotype corresponding to the 'UML' stereotype given
   *  in argument
   */
  public static String classStereotype(String s)
  {
    read_if_needed_();
    
    UmlStereotype b = (UmlStereotype) _map_class_stereotypes.get(s);
    
    return (b != null) ? b.cpp : s;
  }

  /** set the C++ stereotype corresponding to the 'UML' stereotype given
   *  in argument
   * 
   *  On error : return FALSE in C++, produce a RuntimeException in Java
   */
  public static void set_ClassStereotype(String s, String v) throws RuntimeException
  {
   UmlCom.send_cmd(CmdFamily.cppSettingsCmd, CppSettingsCmd._setCppClassStereotypeCmd, s, v);
   UmlCom.check();
   
   UmlStereotype st = (UmlStereotype) _map_class_stereotypes.get(s);
   
   if (st == null)
      st = add_class_stereotype(s);
   st.cpp = v;
  
  }

  /** reverse of the ClassStereotype() operation, returns the 'UML' 
   *  stereotype corresponding to the C++ one given in argument
   */
  public static String classUmlStereotype(String s)
  {
    read_if_needed_();
    
    int index = _class_stereotypes.length;
    
    while (index-- != 0)
      if (_class_stereotypes[index].cpp.equals(s))
        return _class_stereotypes[index].uml;
    
    return null;
  }

  /** returns the #include or other form specified in the last 
   *  'Generation settings' tab for the C++ type given in argument.
   */
  public static String include(String s)
  {
    read_if_needed_();
    
    return (String) _map_includes.get(s);
  }

  /** set the #include or other form specified in the last 
   *  'Generation settings' tab for the C++ type given in argument.
   * 
   *  On error : return FALSE in C++, produce a RuntimeException in Java
   */
  public static void set_Include(String s, String v) throws RuntimeException
  {
    UmlCom.send_cmd(CmdFamily.cppSettingsCmd, CppSettingsCmd._setCppIncludeCmd, s, v);
    UmlCom.check();
    
    if ((v != null) && (v.length() != 0))
      _map_includes.put(s, v);
    else
      _map_includes.remove(s);
  }

  //  returns the 'root' directory 
  public static String rootDir()
  {
    read_if_needed_();
    
    return _root;
  }

  /** set the 'root' directory 
   * 
   *  On error : return FALSE in C++, produce a RuntimeException in Java
   */
  public static void set_RootDir(String v) throws RuntimeException
  {
    UmlCom.send_cmd(CmdFamily.cppSettingsCmd, CppSettingsCmd._setCppRootDirCmd, v);
    UmlCom.check();
    
    _root = v;
  
  }

  //  returns the default header file content
  public static String headerContent()
  {
   read_if_needed_();
    
    return _h_content; 
  }

  /** set the default header file content
   * 
   *  On error : return FALSE in C++, produce a RuntimeException in Java
   */
  public static void set_HeaderContent(String v) throws RuntimeException
  {
    UmlCom.send_cmd(CmdFamily.cppSettingsCmd, CppSettingsCmd._setCppHeaderContentCmd, v);
    UmlCom.check();
    
    _h_content = v;
  
  }

  //  returns the default source file content
  public static String sourceContent()
  {
    read_if_needed_();
    
    return _src_content;
  }

  /** set the default source file content
   * 
   *  On error : return FALSE in C++, produce a RuntimeException in Java
   */
  public static void set_SourceContent(String v) throws RuntimeException
  {
    UmlCom.send_cmd(CmdFamily.cppSettingsCmd, CppSettingsCmd._setCppSourceContentCmd, v);
    UmlCom.check();
    
    _src_content = v;
  
  }

  /** returns the extension of the header files produced by the
   *  C++ code generator
   */
  public static String headerExtension()
  {
    read_if_needed_();
    
    return _h_ext; 
  }

  /** set the extension of the header files produced by the
   *  C++ code generator
   * 
   *  On error : return FALSE in C++, produce a RuntimeException in Java
   */
  public static void set_HeaderExtension(String v) throws RuntimeException
  {
    UmlCom.send_cmd(CmdFamily.cppSettingsCmd, CppSettingsCmd._setCppHeaderExtensionCmd, v);
    UmlCom.check();
    
    _h_ext = v;
  
  }

  /** returns the extension of the source files produced by the
   *  C++ code generator
   */
  public static String sourceExtension()
  {
    read_if_needed_();
    
    return _src_ext;
  }

  /** set the extension of the source files produced by the
   *  C++ code generator
   * 
   *  On error : return FALSE in C++, produce a RuntimeException in Java
   */
  public static void set_SourceExtension(String v) throws RuntimeException
  {
    UmlCom.send_cmd(CmdFamily.cppSettingsCmd, CppSettingsCmd._setCppSourceExtensionCmd, v);
    UmlCom.check();
    
    _src_ext = v;
  
  }

  /** indicates to the code generator if the #include may specify
   *  the path of just the file's name
   */
  public static boolean includeWithPath()
  {
    read_if_needed_();
    
    return _incl_with_path;
  }

  /** to indicates to the code generator if the #include may specify
   *  the path of just the file's name
   * 
   *  On error : return FALSE in C++, produce a RuntimeException in Java
   */
  public static void set_IncludeWithPath(boolean v) throws RuntimeException
  {
    UmlCom.send_cmd(CmdFamily.cppSettingsCmd, CppSettingsCmd._setCppIncludeWithPathCmd,
  		  (v) ? (byte) 1 : (byte) 0);
    UmlCom.check();
    
    _incl_with_path = v;
  
  }

  /** return if a relative path must be used when the path
   *  must be generated in the produced #includes
   */
  public static boolean isRelativePath()
  {
    read_if_needed_();
  
    return _is_relative_path;
  }

  /** set if a relative path must be used when the path
   *  must be generated in the produced #includes
   * 
   *  On error : return FALSE in C++, produce a RuntimeException in Java
   */
  public static void set_IsRelativePath(boolean v)
  {
    UmlCom.send_cmd(CmdFamily.cppSettingsCmd, CppSettingsCmd._setCppRelativePathCmd,
  		   (v) ? (byte) 1 : (byte) 0);
    UmlCom.check();
    _is_relative_path = v;
  }

  /** return if the namespace prefix must be
   *  always generated before class's names
   */
  public static boolean isForceNamespacePrefixGeneration()
  {
    read_if_needed_();
  
    return _is_force_namespace_gen;
  }

  /** set if the namespace prefix must be always generated before class's names
   * 
   *  On error : return FALSE in C++, produce a RuntimeException in Java
   */
  public static void set_IsForceNamespacePrefixGeneration(boolean v)
  {
    UmlCom.send_cmd(CmdFamily.cppSettingsCmd, CppSettingsCmd._setCppForceNamespaceGenCmd,
  		   (v) ? (byte) 1 : (byte) 0);
    UmlCom.check();
    _is_force_namespace_gen = v;
  }

  /** returns the default operation 'in' parameter specification 
   *  in case its type is an enum
   */
  public static String enumIn()
  {
    read_if_needed_();
    
    return _enum_in;
  }

  /** set the default operation 'in' parameter specification 
   *  in case its type is an enum
   * 
   *  On error : return FALSE in C++, produce a RuntimeException in Java
   */
  public static void set_EnumIn(String v) throws RuntimeException
  {
    UmlCom.send_cmd(CmdFamily.cppSettingsCmd, CppSettingsCmd._setCppEnumInCmd, v);
    UmlCom.check();
    
    _enum_in = v;
  
  }

  /** returns the default operation 'out' parameter specification 
   *  in case its type is an enum
   */
  public static String enumOut()
  {
    read_if_needed_();
    
    return _enum_out;
  }

  /** set the default operation 'out' parameter specification 
   *  in case its type is an enum
   * 
   *  On error : return FALSE in C++, produce a RuntimeException in Java
   */
  public static void set_EnumOut(String v) throws RuntimeException
  {
    UmlCom.send_cmd(CmdFamily.cppSettingsCmd, CppSettingsCmd._setCppEnumOutCmd, v);
    UmlCom.check();
    
    _enum_out = v;
  
  }

  /** returns the default operation 'inout' parameter specification 
   *  in case its type is an enum
   */
  public static String enumInout()
  {
    read_if_needed_();
    
    return _enum_inout;
  }

  /** set the default operation 'inout' parameter specification 
   *  in case its type is an enum
   * 
   *  On error : return FALSE in C++, produce a RuntimeException in Java
   */
  public static void set_EnumInout(String v) throws RuntimeException
  {
    UmlCom.send_cmd(CmdFamily.cppSettingsCmd, CppSettingsCmd._setCppEnumInOutCmd, v);
    UmlCom.check();
    
    _enum_inout = v;
  
  }

  //  return the default operation value type form
  public static String enumReturn()
  {
    read_if_needed_();
  
    return _enum_return;
  }

  /** set the default operation value type form
   * 
   *  On error : return FALSE in C++, produce a RuntimeException in Java
   */
  public static void set_EnumReturn(String v)
  {
    UmlCom.send_cmd(CmdFamily.cppSettingsCmd, CppSettingsCmd._setCppEnumReturnCmd, v);
    UmlCom.check();
    _enum_return = v;
  }

  /** returns the default operation 'in' parameter specification 
   *  in case its type is not an enum or a type specified in the
   *  first 'Generation settings' tab
   */
  public static String in()
  {
    read_if_needed_();
    
    return _in;
  }

  /** set the default operation 'in' parameter specification 
   *  in case its type is not an enum or a type specified in the
   *  first 'Generation settings' tab
   * 
   *  On error : return FALSE in C++, produce a RuntimeException in Java
   */
  public static void set_In(String v) throws RuntimeException
  {
    UmlCom.send_cmd(CmdFamily.cppSettingsCmd, CppSettingsCmd._setCppInCmd, v);
    UmlCom.check();
    
    _in = v;
  
  }

  /** returns the default operation 'out' parameter specification 
   *  in case its type is not an enum or a type specified in the
   *  first 'Generation settings' tab
   */
  public static String out()
  {
    read_if_needed_();
    
    return _out;
  }

  /** set the default operation 'out' parameter specification 
   *  in case its type is not an enum or a type specified in the
   *  first 'Generation settings' tab
   * 
   *  On error : return FALSE in C++, produce a RuntimeException in Java
   */
  public static void set_Out(String v) throws RuntimeException
  {
    UmlCom.send_cmd(CmdFamily.cppSettingsCmd, CppSettingsCmd._setCppOutCmd, v);
    UmlCom.check();
    
    _out = v;
  
  }

  /** returns the default operation 'inout' parameter specification 
   *  in case its type is not an enum or a type specified in the
   *  first 'Generation settings' tab
   */
  public static String inout()
  {
    read_if_needed_();
    
    return _inout;
  }

  /** set the default operation 'inout' parameter specification 
   *  in case its type is not an enum or a type specified in the
   *  first 'Generation settings' tab
   * 
   *  On error : return FALSE in C++, produce a RuntimeException in Java
   */
  public static void set_Inout(String v) throws RuntimeException
  {
    UmlCom.send_cmd(CmdFamily.cppSettingsCmd, CppSettingsCmd._setCppInOutCmd, v);
    UmlCom.check();
    
    _inout = v;
  
  }

  //  return the default operation value type form
  public static String Return()
  {
    read_if_needed_();
  
    return _return;
  }

  /** set the default operation value type form
   * 
   *  On error : return FALSE in C++, produce a RuntimeException in Java
   */
  public static void set_Return(String v)
  {
    UmlCom.send_cmd(CmdFamily.cppSettingsCmd, CppSettingsCmd._setCppReturnCmd, v);
    UmlCom.check();
    _return = v;
  }

  //  returns the default definition of a class
  public static String classDecl()
  {
    read_if_needed_();
    
    return _class_decl;
  }

  /** set the default definition of a class
   * 
   *  On error : return FALSE in C++, produce a RuntimeException in Java
   */
  public static void set_ClassDecl(String v) throws RuntimeException
  {
    UmlCom.send_cmd(CmdFamily.cppSettingsCmd, CppSettingsCmd._setCppClassDeclCmd, v);
    UmlCom.check();
    
    _class_decl = v;
  
  }

  //  returns the default specification for an 'external' class
  public static String externalClassDecl()
  {
    read_if_needed_();
    
    return _external_class_decl;
  }

  /** set the default specification for an 'external' class
   * 
   *  On error : return FALSE in C++, produce a RuntimeException in Java
   */
  public static void set_ExternalClassDecl(String v) throws RuntimeException
  {
    UmlCom.send_cmd(CmdFamily.cppSettingsCmd, CppSettingsCmd._setCppExternalClassDeclCmd, v);
    UmlCom.check();
    
    _external_class_decl = v;
  
  }

  //  returns the default definition of a struct
  public static String structDecl()
  {
    read_if_needed_();
    
    return _struct_decl;
  }

  /** set the default definition of a struct
   * 
   *  On error : return FALSE in C++, produce a RuntimeException in Java
   */
  public static void set_StructDecl(String v) throws RuntimeException
  {
    UmlCom.send_cmd(CmdFamily.cppSettingsCmd, CppSettingsCmd._setCppStructDeclCmd, v);
    UmlCom.check();
    
    _struct_decl = v;
  
  }

  //  returns the default definition of an union
  public static String unionDecl()
  {
    read_if_needed_();
    
    return _union_decl;
  }

  /** set the default definition of an union
   * 
   *  On error : return FALSE in C++, produce a RuntimeException in Java
   */
  public static void set_UnionDecl(String v) throws RuntimeException
  {
    UmlCom.send_cmd(CmdFamily.cppSettingsCmd, CppSettingsCmd._setCppUnionDeclCmd, v);
    UmlCom.check();
    
    _union_decl = v;
  
  }

  //  returns the default definition of an enum
  public static String enumDecl()
  {
    read_if_needed_();
    
    return _enum_decl;
  }

  /** set the default definition of an enum
   * 
   *  On error : return FALSE in C++, produce a RuntimeException in Java
   */
  public static void set_EnumDecl(String v) throws RuntimeException
  {
    UmlCom.send_cmd(CmdFamily.cppSettingsCmd, CppSettingsCmd._setCppEnumDeclCmd, v);
    UmlCom.check();
      
    _enum_decl = v;
  
  }

  //  returns the default definition of a typedef
  public static String typedefDecl()
  {
    read_if_needed_();
    
    return _typedef_decl;
  }

  /** set the default definition of a typedef
   * 
   *  On error : return FALSE in C++, produce a RuntimeException in Java
   */
  public static void set_TypedefDecl(String v) throws RuntimeException
  {
    UmlCom.send_cmd(CmdFamily.cppSettingsCmd, CppSettingsCmd._setCppTypedefDeclCmd, v);
    UmlCom.check();
    
    _typedef_decl = v;
  
  }

  //  returns the default definition of an attribute
  public static String attributeDecl()
  {
    read_if_needed_();
    
    return _attr_decl;
  }

  /** set the default definition of an attribute
   * 
   *  On error : return FALSE in C++, produce a RuntimeException in Java
   */
  public static void set_AttributeDecl(String v) throws RuntimeException
  {
    UmlCom.send_cmd(CmdFamily.cppSettingsCmd, CppSettingsCmd._setCppAttributeDeclCmd, v);
    UmlCom.check();
    
    _attr_decl = v;
  
  }

  //  returns the default definition of an enumeration item
  public static String enumItemDecl()
  {
    read_if_needed_();
    
    return _enum_item_decl;
  }

  /** set the default definition of an enumeration item
   * 
   *  On error : return FALSE in C++, produce a RuntimeException in Java
   */
  public static void set_EnumItemDecl(String v) throws RuntimeException
  {
    UmlCom.send_cmd(CmdFamily.cppSettingsCmd, CppSettingsCmd._setCppEnumItemDeclCmd, v);
    UmlCom.check();
    
    _enum_item_decl = v;
  
  }

  /** returns the default definition of a relation depending on it is an
   *  aggregation by value or not and the multiplicity, given in argument.
   */
  public static String relationDecl(boolean by_value, String multiplicity)
  {
    read_if_needed_();
    
    return _rel_decl[(by_value) ? 1 : 0][UmlSettings.multiplicity_column(multiplicity)];
  }

  /** set the default definition of a relation depending on it is an
   *  aggregation by value or not and the multiplicity, given in argument.
   * 
   *  On error : return FALSE in C++, produce a RuntimeException in Java
   */
  public static void set_RelationDecl(boolean by_value, String multiplicity, String v) throws RuntimeException
  {
    UmlCom.send_cmd(CmdFamily.cppSettingsCmd, CppSettingsCmd._setCppRelationDeclCmd, by_value, multiplicity, v);
    UmlCom.check();
    
    _rel_decl[(by_value) ? 1 : 0][UmlSettings.multiplicity_column(multiplicity)] = v;
  
  }

  //  returns the default declaration of an operation
  public static String operationDecl()
  {
    read_if_needed_();
    
    return _oper_decl;
  }

  /** set the default declaration of an operation
   * 
   *  On error : return FALSE in C++, produce a RuntimeException in Java
   */
  public static void set_OperationDecl(String v) throws RuntimeException
  {
    UmlCom.send_cmd(CmdFamily.cppSettingsCmd, CppSettingsCmd._setCppOperationDeclCmd, v);
    UmlCom.check();
    
    _oper_decl = v;
  
  }

  //  returns the default definition of an operation
  public static String operationDef()
  {
    read_if_needed_();
    
    return _oper_def;
  }

  /** set the default definition of an operation
   * 
   *  On error : return FALSE in C++, produce a RuntimeException in Java
   */
  public static void set_OperationDef(String v) throws RuntimeException
  {
    UmlCom.send_cmd(CmdFamily.cppSettingsCmd, CppSettingsCmd._setCppOperationDefCmd, v);
    UmlCom.check();
    
    _oper_def = v;
  
  }

  /** return TRUE if the operations profile must contain 'throw()'
   *  when the operations does not have exception
   */
  public static boolean operationForceThrow()
  {
    read_if_needed_();
    
    return _force_oper_throw;
  }

  /** set if the operations profile must contain 'throw()'
   *  when the operations does not have exception
   * 
   *  On error : return FALSE in C++, produce a RuntimeException in Java
   */
  public static void set_OperationForceThrow(boolean v) throws RuntimeException
  {
    UmlCom.send_cmd(CmdFamily.cppSettingsCmd, CppSettingsCmd._setCppOperationForceThrowCmd,
  		  (v) ? (byte) 1 : (byte) 0);
    UmlCom.check();
    
    _force_oper_throw = v;
  
  }

  /** returns the default visibility of a 'get' operation generated
   *  through the attribute and relation 'add get operation' menu
   */
  public static aVisibility getVisibility()
  {
    read_if_needed_();
    
    return _get_visibility;
  }

  /** set the default visibility of a 'get' operation generated
   *  through the attribute and relation 'add get operation' menu
   * 
   *  On error : return FALSE in C++, produce a RuntimeException in Java
   */
  public static void set_GetVisibility(aVisibility v) throws RuntimeException
  {
    UmlCom.send_cmd(CmdFamily.cppSettingsCmd, CppSettingsCmd._setCppGetVisibilityCmd,
  		  (byte) v.value());
    UmlCom.check();
    
    _get_visibility = v;
  
  }

  /** returns the default name of a 'get' operation generated 
   *  through the attribute and relation 'add get operation' menu
   */
  public static String getName()
  {
    read_if_needed_();
    
    return _get_name;
  }

  /** set the default name of a 'get' operation generated 
   *  through the attribute and relation 'add get operation' menu
   * 
   *  On error : return FALSE in C++, produce a RuntimeException in Java
   */
  public static void set_GetName(String v) throws RuntimeException
  {
    UmlCom.send_cmd(CmdFamily.cppSettingsCmd, CppSettingsCmd._setCppGetNameCmd, v);
    UmlCom.check();
    
    _get_name = v;
  
  }

  /** returns if a 'get' operation generated through the attribute
   *  and relation 'add get operation' menu is inline by default
   */
  public static boolean isGetInline()
  {
    read_if_needed_();
    
    return _is_get_inline;
  }

  /** set if a 'get' operation generated through the attribute
   *  and relation 'add get operation' menu is inline by default
   * 
   *  On error : return FALSE in C++, produce a RuntimeException in Java
   */
  public static void set_IsGetInline(boolean v) throws RuntimeException
  {
    UmlCom.send_cmd(CmdFamily.cppSettingsCmd, CppSettingsCmd._setCppIsGetInlineCmd,
  		  (v) ? (byte) 1 : (byte) 0);
    UmlCom.check();
    
    _is_get_inline = v;
  
  }

  /** returns if a 'get' operation generated through the attribute
   *  and relation 'add get operation' menu is const by default
   */
  public static boolean isGetConst()
  {
    read_if_needed_();
    
    return _is_get_const;
  }

  /** set if a 'get' operation generated through the attribute
   *  and relation 'add get operation' menu is const by default
   * 
   *  On error : return FALSE in C++, produce a RuntimeException in Java
   */
  public static void set_IsGetConst(boolean v) throws RuntimeException
  {
    UmlCom.send_cmd(CmdFamily.cppSettingsCmd, CppSettingsCmd._setCppIsGetConstCmd,
  		  (v) ? (byte) 1 : (byte) 0);
    UmlCom.check();
    
    _is_get_const = v;
  
  }

  /** returns if the value returned by a 'get' operation generated through
   *  the attribute and relation 'add get operation' menu is const by default
   */
  public static boolean isGetValueConst()
  {
    read_if_needed_();
    
    return _is_get_value_const;
  }

  /** set if the value returned by a 'get' operation generated through
   *  the attribute and relation 'add get operation' menu is const by default
   * 
   * 
   *  On error : return FALSE in C++, produce a RuntimeException in Java
   */
  public static void set_IsGetValueConst(boolean v) throws RuntimeException
  {
    UmlCom.send_cmd(CmdFamily.cppSettingsCmd, CppSettingsCmd._setCppIsGetValueConstCmd,
  		  (v) ? (byte) 1 : (byte) 0);
    UmlCom.check();
    
    _is_get_value_const = v;
  
  }

  /** returns the default visibility of a 'set' operation generated
   *  through the attribute and relation 'add set operation' menu
   */
  public static aVisibility setVisibility()
  {
    read_if_needed_();
    
    return _set_visibility;
  }

  /** set the default visibility of a 'set' operation generated
   *  through the attribute and relation 'add set operation' menu
   * 
   * 
   *  On error : return FALSE in C++, produce a RuntimeException in Java
   */
  public static void set_SetVisibility(aVisibility v) throws RuntimeException
  {
    UmlCom.send_cmd(CmdFamily.cppSettingsCmd, CppSettingsCmd._setCppSetVisibilityCmd,
  		  (byte) v.value());
    UmlCom.check();
    
    _set_visibility = v;
  
  }

  /** returns the default name of a 'set' operation generated 
   *  through the attribute and relation 'add set operation' menu
   */
  public static String setName()
  {
    read_if_needed_();
    
    return _set_name;
  }

  /** set the default name of a 'set' operation generated 
   *  through the attribute and relation 'add set operation' menu
   * 
   * 
   *  On error : return FALSE in C++, produce a RuntimeException in Java
   */
  public static void set_SetName(String v) throws RuntimeException
  {
    UmlCom.send_cmd(CmdFamily.cppSettingsCmd, CppSettingsCmd._setCppSetNameCmd, v);
    UmlCom.check();
    
    _set_name = v;
  
  }

  /** returns if a 'set' operation generated through the attribute
   *  and relation 'add set operation' menu is inline by default
   */
  public static boolean isSetInline()
  {
    read_if_needed_();
    
    return _is_set_inline;
  }

  /** set if a 'set' operation generated through the attribute
   *  and relation 'add set operation' menu is inline by default
   * 
   * 
   *  On error : return FALSE in C++, produce a RuntimeException in Java
   */
  public static void set_IsSetInline(boolean v) throws RuntimeException
  {
    UmlCom.send_cmd(CmdFamily.cppSettingsCmd, CppSettingsCmd._setCppIsSetInlineCmd,
  		  (v) ? (byte) 1 : (byte) 0);
    UmlCom.check();
    
    _is_set_inline = v;
  
  }

  /** returns if the parameters of a 'set' operation generated through the
   *  attribute and relation 'add set operation' menu are const by default
   */
  public static boolean isSetParamConst()
  {
    read_if_needed_();
    
    return _is_set_param_const;
  }

  /** set if the parameters of a 'set' operation generated through the
   *  attribute and relation 'add set operation' menu are const by default
   * 
   * 
   *  On error : return FALSE in C++, produce a RuntimeException in Java
   */
  public static void set_IsSetParamConst(boolean v) throws RuntimeException
  {
    UmlCom.send_cmd(CmdFamily.cppSettingsCmd, CppSettingsCmd._setCppIsSetParamConstCmd,
  		  (v) ? (byte) 1 : (byte) 0);
    UmlCom.check();
    
    _is_set_param_const = v;
  
  }

  /** return if the parameter of a 'set' operation generated through the
   *  attribute and relation 'add set operation' menu is a reference by default
   */
  public static boolean isSetParamRef()
  {
    read_if_needed_();
  
    return _is_set_param_ref;
  }

  /** set if the parameter of a 'set' operation generated through the
   *  attribute and relation 'add set operation' menu is a reference by default
   * 
   *  On error : return FALSE in C++, produce a RuntimeException in Java
   */
  public static void set_IsSetParamRef(boolean v) throws RuntimeException
  {
    UmlCom.send_cmd(CmdFamily.cppSettingsCmd, CppSettingsCmd._setCppIsSetParamRefCmd,
  		  (v) ? (byte) 1 : (byte) 0);
    UmlCom.check();
    
    _is_set_param_ref = v;
  }

  //  never called !
  private CppSettings(){
  }

  private static boolean _defined;

  private static String _root;
  private static String _in;
  private static String _out;
  private static String _inout;
  private static String _return;

  private static String _enum_in;
  private static String _enum_out;
  private static String _enum_inout;
  private static String _enum_return;

  private static String _class_decl;
  private static String _external_class_decl;

  private static String _struct_decl;
  private static String _union_decl;
  private static String _enum_decl;
  private static String _typedef_decl;
  private static String _attr_decl;
  private static String _enum_item_decl;
  private static String[][] _rel_decl;
  private static String _oper_decl;
  private static String _oper_def;
  private static boolean _force_oper_throw;

  private static aVisibility _get_visibility;
  private static String _get_name;
  private static boolean _is_get_inline;
  private static boolean _is_get_const;
  private static boolean _is_get_value_const;
  private static aVisibility _set_visibility;
  private static String _set_name;
  private static boolean _is_set_inline;
  private static boolean _is_set_param_const;
  private static boolean _is_set_param_ref;

  private static String _h_content;
  private static String _src_content;
  private static String _h_ext;
  private static String _src_ext;
  private static boolean _incl_with_path;
  private static boolean _is_relative_path;

  private static boolean _is_force_namespace_gen;

  private static Hashtable _map_includes;
  // internal, do NOT use it
  
  protected static void read_()
  {
    _root = UmlCom.read_string();
    
    int n;
    int index;
    
    n = UmlCom.read_unsigned();
    
    for (index = 0; index != n; index += 1) {
      UmlSettings._builtins[index].cpp = UmlCom.read_string();
      UmlSettings._builtins[index].cpp_in = UmlCom.read_string();
      UmlSettings._builtins[index].cpp_out = UmlCom.read_string();
      UmlSettings._builtins[index].cpp_inout = UmlCom.read_string();
      UmlSettings._builtins[index].cpp_return = UmlCom.read_string();
    }
    
    n = UmlCom.read_unsigned();
    
    for (index = 0; index != n; index += 1)
      UmlSettings._relation_stereotypes[index].cpp = UmlCom.read_string();
    
    n = UmlCom.read_unsigned();
    
    for (index = 0; index != n; index += 1)
      UmlSettings._class_stereotypes[index].cpp = UmlCom.read_string();
    
    n = UmlCom.read_unsigned();
    _map_includes = new Hashtable((n == 0) ? 1 : n);
    
    for (index = 0; index != n; index += 1) {
      String t = UmlCom.read_string();
      String i = UmlCom.read_string();
      
      _map_includes.put(t, i);
    }
    
    _h_content = UmlCom.read_string();
    _src_content = UmlCom.read_string();
    _h_ext = UmlCom.read_string();
    _src_ext = UmlCom.read_string();
    _incl_with_path = UmlCom.read_bool();
  
    _in = UmlCom.read_string();
    _out = UmlCom.read_string();
    _inout = UmlCom.read_string();
    _return = UmlCom.read_string();
    _enum_in = UmlCom.read_string();
    _enum_out = UmlCom.read_string();
    _enum_inout = UmlCom.read_string();
    _enum_return = UmlCom.read_string();
    _class_decl = UmlCom.read_string();
    _external_class_decl = UmlCom.read_string();
    _struct_decl = UmlCom.read_string();
    _union_decl = UmlCom.read_string();
    _enum_decl = UmlCom.read_string();
    _typedef_decl = UmlCom.read_string();
    _attr_decl = UmlCom.read_string();
    _enum_item_decl = UmlCom.read_string();
    _rel_decl = new String[2][3];
    for (index = 0; index != 3; index += 1) {
      _rel_decl[0][index] = UmlCom.read_string();
      _rel_decl[1][index] = UmlCom.read_string();
    }
    _oper_decl = UmlCom.read_string();
    _oper_def = UmlCom.read_string();
    _force_oper_throw = UmlCom.read_bool();
    _get_visibility = aVisibility.fromInt(UmlCom.read_char());
    _get_name = UmlCom.read_string();
    _is_get_inline = UmlCom.read_bool();
    _is_get_const = UmlCom.read_bool();
    _is_get_value_const = UmlCom.read_bool();
    _set_visibility = aVisibility.fromInt(UmlCom.read_char());
    _set_name = UmlCom.read_string();
    _is_set_inline = UmlCom.read_bool();
    _is_set_param_const = UmlCom.read_bool();
    _is_set_param_ref = UmlCom.read_bool();
    _is_relative_path = UmlCom.read_bool();
    _is_force_namespace_gen = UmlCom.read_bool();
  }

  // internal, do NOT use it
  
  protected static void read_if_needed_()
  {
    UmlSettings.read_if_needed_();
    if (!_defined) {
      UmlCom.send_cmd(CmdFamily.cppSettingsCmd, CppSettingsCmd._getCppSettingsCmd);
      read_();
      _defined = true;
    }
  }

};
