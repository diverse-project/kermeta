
/** This class manages 'sequence diagrams', notes that the class 'UmlDiagram'
 *  is a mother class of all the diagrams, allowing to generalize their
 *  management
 * 
 *  You can modify it as you want (except the constructor)
 */
class UmlSequenceDiagram extends UmlBaseSequenceDiagram {
  public UmlSequenceDiagram(long id, String n){ super(id, n); }
};
