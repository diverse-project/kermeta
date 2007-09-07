
//   Manage the use case diagrams
abstract class UmlBaseUseCaseDiagram extends UmlDiagram {
  /** returns a new use case diagram named 's' created under 'parent'
   * 
   *  In case it cannot be created (the name is already used or
   *  invalid, 'parent' cannot contain it etc ...) return 0 in C++
   *  and produce a RuntimeException in Java
   */
  public static UmlUseCaseDiagram create(UmlItem parent, String s) throws RuntimeException
  {
    return (UmlUseCaseDiagram) parent.create_(anItemKind.anUseCaseDiagram, s);
  }

  //  returns the kind of the item
  public anItemKind kind() {
    return anItemKind.anUseCaseDiagram;
  }

  //  the constructor, do not call it yourself !!!!!!!!!!
  protected UmlBaseUseCaseDiagram(long id, String n) { super(id, n); }

};
