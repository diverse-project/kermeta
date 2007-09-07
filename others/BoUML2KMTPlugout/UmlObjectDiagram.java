
/** This class manages 'object diagrams', notes that the class 'UmlDiagram'
 *  is a mother class of all the diagrams, allowing to generalize their
 *  management
 * 
 *  You can modify it as you want (except the constructor)
 */
class UmlObjectDiagram extends UmlBaseObjectDiagram {
  //   the constructor, do not call it yourself !!!!!!!!!!
  public  UmlObjectDiagram(long id, String s) {
    super(id, s);
  }

}
