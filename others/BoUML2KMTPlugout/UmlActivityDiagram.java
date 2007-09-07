
/** This class manages 'activity diagrams', notes that the class 'UmlDiagram'
 *  is a mother class of all the diagrams, allowing to generalize their
 *  management
 * 
 *  You can modify it as you want (except the constructor)
 */
class UmlActivityDiagram extends UmlBaseActivityDiagram implements UmlActivityItem {
  //   the constructor, do not call it yourself !!!!!!!!!!
  public  UmlActivityDiagram(long id, String s) {
    super(id, s);
  }

}
