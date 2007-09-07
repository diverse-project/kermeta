import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class GenerateKmt implements Visitor {

	public void visit(UmlItem item) {

		switch (item.kind().value()) {
		case anItemKind._aPackage:
			this.visitPackage((UmlPackage) item);
			break;
		case anItemKind._aClass:
			this.visitClass((UmlClass) item);
			break;
		case anItemKind._anOperation:
			this.visitOperation((UmlOperation) item);
			break;
		case anItemKind._anAttribute:
			this.visitAttribute((UmlAttribute) item);
			break;
		case anItemKind._aParameterSet:
			this.visitParameterSet((UmlParameterSet) item);
			break;
		case anItemKind._aClassView:
			this.visitClassView((UmlClassView) item);
			break;
		case anItemKind._aRelation:
			this.visitRelation((UmlRelation) item);
			break;

		}

	}

	private void visitRelation(UmlRelation r) {
		switch (r.relationKind().value()) {

		case aRelationKind._aDependency:
			this.visitDependency(r);
			break;
		case aRelationKind._aDirectionalAggregation:
			this.visitDirectionalAggregation(r);
			this.classBody.append("\n");
			break;
		case aRelationKind._aDirectionalAggregationByValue:
			this.visitDirectionalAggregationByValue(r);
			this.classBody.append("\n");
			break;
		case aRelationKind._aDirectionalAssociation:
			this.visitDirectionalAssociation(r);
			this.classBody.append("\n");
			break;
		case aRelationKind._aGeneralisation:
			this.visitGeneralisation(r);
			break;
		case aRelationKind._anAggregation:
			this.visitAggregation(r);
			this.classBody.append("\n");
			break;
		case aRelationKind._anAggregationByValue:
			this.visitAggregationByValue(r);
			this.classBody.append("\n");
			break;
		case aRelationKind._anAssociation:
			this.visitAssociation(r);
			this.classBody.append("\n");
			break;
		case aRelationKind._aRealization:
			this.visitRealization(r);
			break;
		}

	}

	private void visitRealization(UmlRelation r) {
		this.visitGeneralisation(r);
	}

	private void visitAssociation(UmlRelation r) {
		this.visitAggregation(r);
	}

	private void visitAggregationByValue(UmlRelation r) {
		String warning = "";
		UmlRelation right = r.side(true);
		if (right.equals(r)) {
			right = r.side(false);
			this.visitDirectionalAggregationByValue(r);
		} else {
			this.visitDirectionalAggregation(r);
		}
		String roleName;
		if (right.roleName().length() > 0) {
			 roleName = right.roleName();
		} else {
			 roleName = right.roleType().name().toLowerCase();
			 warning = " /* GENERATED ROLE NAME: " + roleName +" */ ";
		}
		this.classBody.append(" #" + KermetaHelper.escape(roleName));
		this.classBody.append(warning);
	}

	private void visitAggregation(UmlRelation r) {
		this.visitDirectionalAggregation(r);
	}

	protected int inheritanceNumber = 0;

	protected StringBuffer classBody = new StringBuffer();
	
	protected Boolean isEnumeration = false;

	private void visitGeneralisation(UmlRelation r) {
		if (inheritanceNumber > 0)
			Main.s.append(", ");
		else
			Main.s.append(" inherits ");
		Main.s.append(this.getQualifiedName(r.roleType()));
		int number = 0;
		for (int i = 0; i < currentClass.actuals().length; i++) {
			if (currentClass.actuals()[i].superClass().equals(r.roleType())) {
				if (number == 0)
					Main.s.append("<");
				else
					Main.s.append(", ");
				Main.s.append(this.printType(currentClass.actuals()[i].value()));
			}
		}
		if (currentClass.actuals().length > 0)
			Main.s.append(">");

		inheritanceNumber++;

	}

	private void visitDirectionalAssociation(UmlRelation r) {
		this.visitDirectionalAggregation(r);
	}

	private void visitDirectionalAggregationByValue(UmlRelation r) {
		this.classBody.append( "  attribute ");
		this.printRelation(r);
	}

	private String getQualifiedName(UmlClass c) {
		StringBuffer s = new StringBuffer();
		s.append(c.name());
		UmlItem p = c;
		while (p != null) {
			do {
				p = p.parent();
			} while ((!(p instanceof UmlPackage)) && p != null);
			if (p != null)
				s.insert(0, ((UmlPackage) p).name().replace(".", "::") + "::");
		}
		return s.toString();
	}

	private void printRelation(UmlRelation r) {
		String warning = "";
		String roleName;
		if (r.roleName().length() > 0) {
			roleName = r.roleName();
		} else {
			roleName = r.roleType().name().toLowerCase();
    		warning = " /* GENERATED ROLE NAME: " + roleName + " */ ";
		}
  		this.classBody.append(KermetaHelper.escape(roleName) + " : ");
  		if (r._stereotype.contains("ordered")){
  			// TODO: should only do this if the upper cardinality is > 1
  			this.classBody.append(" oset ");
  		}
		this.classBody.append(this.getQualifiedName(r.roleType()));
		// this.printType(r.roleType());
		this.classBody.append("[");
		this.classBody.append(r.multiplicity());
		if (r.multiplicity().length() == 0) {
			warning += " /* MISSING CARDINALITY */ ";
		}
		this.classBody.append("]");
		this.classBody.append(warning);
	}

	private void visitDirectionalAggregation(UmlRelation r) {
		this.classBody.append("  reference ");
		this.printRelation(r);
	}

	private void visitDependency(UmlRelation r) {
		// Generate nothing
	}

	int packagedepth = 0;

	public void visitPackage(UmlPackage p) {
		int splitpackage = 0;
		packagedepth++;
		if (packagedepth == 1){
			Main.s.append("package  " + p.name().replace(".", "::") + ";\n");
			Main.s.append("require kermeta\n");
			Main.s.append("using kermeta::standard\n");
		}
		else {
			if (p.name().contains(".")) {
				List<String> l = new ArrayList<String>();
				StringTokenizer t = new StringTokenizer(p.name(), ".");
				while (t.hasMoreTokens()) {
					l.add(t.nextToken());
				}

				for (String s : l) {
					splitpackage++;
					Main.s.append("package  " + s + "{\n");

				}
			} else
				Main.s.append("package  " + p.name() + "{\n");

		}

		for (int i = 0; i < p.children().length; i++) {
			UmlItem u = p.children()[i];
			if (u.kind().value() == anItemKind._aClassView) {
				u.accept(this);

			}

		}
		for (int i = 0; i < p.children().length; i++) {
			UmlItem u = p.children()[i];

			if (u.kind().value() == anItemKind._aPackage) {

				u.accept(this);
			}
		}
		if (packagedepth > 1) {
			Main.s.append("}\n");
			for (int i = 1; i < splitpackage; i++)
				Main.s.append("}\n");
		}
		packagedepth--;

	}

	UmlClass currentClass;

	public void visitClass(UmlClass p) {
		if (p.stereotype().contains("enumeration")) {
			visitEnumeration(p); 
		} else {
			visitTrueClass(p);
		}
	}
	
	
	
	public void visitEnumeration(UmlClass p){
		Main.s.append("enumeration " + KermetaHelper.escape(p.name()) +" \n");
		inheritanceNumber = 0;
		isEnumeration = true;
		this.classBody.setLength(0);
		for (int i = 0; i < p.children().length; i++) {
			p.children()[i].accept(this);
		}
		isEnumeration = false;
		Main.s.append(" { \n");
		Main.s.append(this.classBody.toString());
		Main.s.append(" } \n");
	}
	
	public void visitTrueClass(UmlClass p){
		this.currentClass = p;
		Main.s.append("\n");
		if (p.isAbstract())
			Main.s.append("abstract ");
		Main.s.append("class  " + KermetaHelper.escape(p.name()));
		boolean parameterized = false;
		for (int i = 0; i < p.formals().length; i++) {
			parameterized = true;
			if (i == 0)
				Main.s.append("<");
			else
				Main.s.append(", ");
			Main.s.append(p.formals()[i]._name);
		}
		if (parameterized)
			Main.s.append(">");

		inheritanceNumber = 0;
		this.classBody.setLength(0);
		for (int i = 0; i < p.children().length; i++) {
			p.children()[i].accept(this);
		}
		Main.s.append(" { \n");
		Main.s.append(this.classBody.toString());

		Main.s.append(" } \n");

	}

	public void visitOperation(UmlOperation p) {

		this.classBody.append("operation ");

		this.classBody.append(KermetaHelper.escape(p.name()) + "(");

		for (int i = 0; i < p.params().length; i++) {
			UmlParameter u = p.params()[i];
			if (i > 0)
				this.classBody.append(",");
			this.visitParameter(u);

		}

		this.classBody.append(") : ");

		this.classBody.append(this.printType(p.returnType()));

		for (int i = 0; i < p.exceptions().length; i++) {
			if (i > 0)
				this.classBody.append(", ");
			else
				this.classBody.append("raises ");
			UmlTypeSpec exce = p.exceptions()[i];
			this.classBody.append(exce.explicit_type);
		}
		if (p.isAbstract())
			this.classBody.append(" is abstract\n");
		else
			this.body();

	}

	private void body() {
		this.classBody
				.append(" is do \n"
						+ "//TODO: implement getter for derived property eAllReferences\n"
						+ "raise kermeta::exceptions::NotImplementedException.new\n"
						+ "end\n");
	}

	public void visitAttribute(UmlAttribute p) {
		if (isEnumeration) {
			visitEnumerationElement(p);
		} else {
			visitTrueAttribute(p);
		}
	}
	
	public void visitEnumerationElement(UmlAttribute p){
		this.classBody.append(KermetaHelper.escape("  " +p.name()) + "; \n");
	}
	
	public void visitTrueAttribute(UmlAttribute p) {
		if (p.isVolatile()) {
			this.classBody.append("property  " + KermetaHelper.escape(p.name()) + ": ");
			this.classBody.append(this.printType(p.type()));
			this.classBody.append("\n" + "getter ");
			this.body();
			if (!p.isReadOnly()) {
				this.classBody.append("setter ");
				this.body();
			}
		} else {
			this.classBody.append("  attribute  " + KermetaHelper.escape(p.name()) + " : ");
			this.classBody.append(this.printType(p.type()));
			this.classBody.append("\n");
		}

	}

	public void visitParameter(UmlParameter p) {
		this.classBody.append(KermetaHelper.escape(p.name) + " : ");
		this.classBody.append(this.printType(p.type));

	}

	public void visitParameterSet(UmlParameterSet p) {
		Main.s.append("ParameterSet  " + p.name() + "\n");

	}

	public void visitClassView(UmlClassView p) {

		for (int i = 0; i < p.children().length; i++) {
			UmlItem u = p.children()[i];
			if (u.kind().value() == anItemKind._aClass) {
				u.accept(this);
			}
		}
		for (int i = 0; i < p.children().length; i++) {
			UmlItem u = p.children()[i];
			if (u.kind().value() == anItemKind._aPackage) {
				u.accept(this);
			}
		}
	}

	public void visitClassDiagram(UmlClassDiagram p) {
		Main.s.append("classDiagram " + p.name() + " " + p.kind() + "\n");

	}

	private String printType(UmlTypeSpec type) {
		String type1 = type.explicit_type;
		if (type1 == null) {
			type1 = this.getQualifiedName(type.type);
		}
		if (type1.equalsIgnoreCase("void"))
			return "kermeta::standard::~Void";
		else if (type1.equalsIgnoreCase(""))
			return "kermeta::standard::~Void";
		else if (type1.equalsIgnoreCase("string"))
			return "kermeta::standard::String";
		else {
			return type1;
		}
	}

}
