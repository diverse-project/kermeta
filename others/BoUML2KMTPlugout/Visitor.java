
public interface Visitor {

	void visit(UmlItem item);
	void visitPackage(UmlPackage p );
	void visitClass(UmlClass p );
	void visitOperation(UmlOperation p );
	void visitAttribute(UmlAttribute p );
	void visitParameterSet(UmlParameterSet p );
	void visitClassDiagram(UmlClassDiagram p );
	//void visit(UmlAssociation p );

	
}
