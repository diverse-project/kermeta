
//   Manage the collaboration diagrams
abstract class UmlBaseCollaborationDiagram extends UmlDiagram {
  /** returns a new collaboration diagram named 's' created under 'parent'
   * 
   *  In case it cannot be created (the name is already used or
   *  invalid, 'parent' cannot contain it etc ...) return 0 in C++
   *  and produce a RuntimeException in Java
   */
  public static UmlCollaborationDiagram create(UmlItem parent, String s) throws RuntimeException
  {
    return (UmlCollaborationDiagram) parent.create_(anItemKind.aCollaborationDiagram, s);
  }

  //  returns the kind of the item
  public anItemKind kind() {
    return anItemKind.aCollaborationDiagram;
  }

  //  the constructor, do not call it yourself !!!!!!!!!!
  protected UmlBaseCollaborationDiagram(long id, String n) { super(id, n); }

};
