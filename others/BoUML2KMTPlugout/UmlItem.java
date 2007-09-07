
/** This class is a mother class for all the other Uml* classes, this
 *  allows to generalize their management, declare virtual operations etc ...
 * 
 *  You can modify it as you want (except the constructor)
 */
abstract class UmlItem extends UmlBaseItem {
  public UmlItem(long id, String n){ super(id, n); }

public void accept(Visitor v) {
	v.visit(this);
	;
}


};
