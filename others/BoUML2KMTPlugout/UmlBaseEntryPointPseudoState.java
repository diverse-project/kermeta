
abstract class UmlBaseEntryPointPseudoState extends UmlPseudoState {
  /**  returns a new entry point pseudo state named 's' created under 'parent'
   * 
   *  In case it cannot be created (the name is already used or
   *  invalid, 'parent' cannot contain it etc ...) return 0 in C++
   *  and produce a RuntimeException in Java
   */
  public static UmlEntryPointPseudoState create(UmlItem parent, String s) throws RuntimeException
  {
    return (UmlEntryPointPseudoState) parent.create_(anItemKind.anEntryPointPseudoState, s);
  }

  //  returns the kind of the item
  public anItemKind kind() {
    return anItemKind.anEntryPointPseudoState;
  }

  //   the constructor, do not call it yourself !!!!!!!!!!
  protected  UmlBaseEntryPointPseudoState(long id, String s) {
    super(id, s);
  }

}
