
//  Manage the sequence diagrams
abstract class UmlBaseSequenceDiagram extends UmlDiagram {
  /** returns a new sequence diagram named 's' created under 'parent'
   * 
   *  In case it cannot be created (the name is already used or
   *  invalid, 'parent' cannot contain it etc ...) return 0 in C++
   *  and produce a RuntimeException in Java
   */
  public static UmlSequenceDiagram create(UmlItem parent, String s) throws RuntimeException
  {
    return (UmlSequenceDiagram) parent.create_(anItemKind.aSequenceDiagram, s);
  }

  //  returns the kind of the item
  public anItemKind kind() {
    return anItemKind.aSequenceDiagram;
  }

  //  the constructor, do not call it yourself !!!!!!!!!!
  protected UmlBaseSequenceDiagram(long id, String n) { super(id, n); }

};
