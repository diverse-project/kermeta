
abstract class UmlBaseExitPointPseudoState extends UmlPseudoState {
  /**  returns a new exit point pseudo state named 's' created under 'parent'
   * 
   *  In case it cannot be created (the name is already used or
   *  invalid, 'parent' cannot contain it etc ...) return 0 in C++
   *  and produce a RuntimeException in Java
   */
  public static UmlExitPointPseudoState create(UmlItem parent, String s) throws RuntimeException
  {
    return (UmlExitPointPseudoState) parent.create_(anItemKind.anExitPointPseudoState, s);
  }

  //  returns the kind of the item
  public anItemKind kind() {
    return anItemKind.anExitPointPseudoState;
  }

  //   the constructor, do not call it yourself !!!!!!!!!!
  protected  UmlBaseExitPointPseudoState(long id, String s) {
    super(id, s);
  }

}
