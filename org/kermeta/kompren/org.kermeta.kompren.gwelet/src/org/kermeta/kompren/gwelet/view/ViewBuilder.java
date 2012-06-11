package org.kermeta.kompren.gwelet.view;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.kermeta.kompren.gwelet.model.Model;
import org.kermeta.language.loader.km.KmLoaderImpl;
import org.kermeta.language.structure.ClassDefinition;
import org.kermeta.language.structure.DataType;
import org.kermeta.language.structure.ModelingUnit;
import org.kermeta.language.structure.NamedElement;
import org.kermeta.language.structure.Operation;
import org.kermeta.language.structure.Package;
import org.kermeta.language.structure.Property;
import org.kermeta.language.structure.Type;
import org.kermeta.language.structure.TypeDefinition;
import org.kermeta.language.structure.TypedElement;
import org.malai.presentation.Presentation;

public class ViewBuilder {
	protected Presentation<Model, MetamodelView> presentation;

	protected Map<String, List<ClassDefinition>> cdAdded;

	protected Map<ClassDefinition, ClassView> classMappings;

	protected Map<ClassView, ClassDefinition> classMappingsInverted;

	protected Map<String, InheritanceView> addedInheritances;


	public ViewBuilder(final Presentation<Model, MetamodelView> presentation) {
		super();

		this.presentation = presentation;
		cdAdded = new HashMap<String, List<ClassDefinition>>();
		classMappings = new HashMap<ClassDefinition, ClassView>();
		classMappingsInverted = new HashMap<ClassView, ClassDefinition>();
		addedInheritances = new HashMap<String, InheritanceView>();
	}


	public ClassView getClassView(final ClassDefinition cd) {
		return classMappings.get(cd);
	}


	public ClassDefinition getClassDefinition(final ClassView cv) {
		return classMappingsInverted.get(cv);
	}


	public void build(final String uriMetamodel) {
		ModelingUnit mu = new KmLoaderImpl().load(uriMetamodel);
		MetamodelView view = presentation.getConcretePresentation();

		presentation.getAbstractPresentation().setUnit(mu);

		for(Package pkg : mu.getPackages())
			createPackageView(pkg, view);

		createRelationsView(view);

		view.updateLayout();
		view.update();
	}


	protected void createRelationsView(final MetamodelView view) {
		for(List<ClassDefinition> list : cdAdded.values())
			for(ClassDefinition cd : list) {
				createInheritanceView(cd, getQualifiedName(cd), view);
				createAssociations(cd, view);
			}
	}



	protected void createInheritanceView(final ClassDefinition cd, final String qname, final MetamodelView view) {
		String qname2;
		InheritanceView in;

		for(Type type : cd.getSuperType()) {
			qname2 = getTypeQualifiedName(type);
			if(qname.length()>0 && qname2.length()>2 && addedInheritances.get(qname+","+qname2)==null) {
				in = view.addInheritanceView(classMappings.get(cd), classMappings.get(cdAdded.get(qname2).get(0)));
				addedInheritances.put(qname+","+qname2, in);
			}
		}
	}


	protected void createPackageView(final Package pkg, final MetamodelView view) {
		for(TypeDefinition td : pkg.getOwnedTypeDefinition())
			if(td instanceof ClassDefinition)
				createClassDefinition((ClassDefinition)td, view);

		for(Package pkg2 : pkg.getNestedPackage())
			createPackageView(pkg2, view);
	}


	protected void createClassDefinition(final ClassDefinition cd, final MetamodelView view) {
		String qname = getQualifiedName(cd);
		List<ClassDefinition> cdFirst = cdAdded.get(qname);
		ClassView cv = null;

		if(cdFirst==null) {
			List<ClassDefinition> cds = new ArrayList<ClassDefinition>();
			cv = new ClassView(cd.getName());
			cds.add(cd);

			addAttributes(cd, cv);

			for(Operation op : cd.getOwnedOperation())
				cv.addOperation(op.getName(), getTypeName(op), op.getIsAbstract());

			view.addEntity(cv);
			cdAdded.put(getQualifiedName(cd), cds);
		}
		else {
			// Aspects.
			cv = classMappings.get(cdFirst.get(0));

			//FIXME: check that attributes and operations not added several times.
			addAttributes(cd, cv);

			for(Operation op : cd.getOwnedOperation())
				cv.addOperation(op.getName(), getTypeName(op), op.getIsAbstract());
		}

		classMappings.put(cd, cv);
		classMappingsInverted.put(cv, cd);
	}



	private void createAssociations(final ClassDefinition cd, final MetamodelView mv) {
		Type type;
		boolean oppositeCompo;
		String oppositeCardString;
		String oppositeName;
		Property opp;
		ClassView cv2;
		ClassView cv = classMappings.get(cd);

		for(Property prop : cd.getOwnedAttribute()) {
			type = prop.getType();
			oppositeCompo = prop.getIsComposite();
			oppositeCardString = "";
			oppositeName = "";

			if(prop.getOpposite() instanceof Property) {
				opp = (Property) prop.getOpposite();
				oppositeName  = opp.getName();
				oppositeCompo = opp.getIsComposite();
				oppositeCardString = getCardinalityString(opp);
			}

			if(type instanceof org.kermeta.language.structure.Class &&
					!isKermetaPrimitiveType(((org.kermeta.language.structure.Class)type).getName())) {
				cv2 = classMappings.get(((org.kermeta.language.structure.Class)type).getTypeDefinition());
				mv.addRelation(cv, cv2, prop.getIsComposite() || oppositeCompo, oppositeCompo,
						prop.getName(), oppositeName, getCardinalityString(prop), oppositeCardString);
			}
		}
	}


	private String getCardinalityString(final Property prop) {
		int upper = prop.getUpper();
		int lower = prop.getLower();

		if(upper==lower)
			return upper==-1 ? "*" : String.valueOf(upper);
		return String.valueOf(lower) + ".." + (upper==-1 ? "*" : String.valueOf(upper));
	}



	private void addAttributes(final ClassDefinition cd, final ClassView cv) {
		Type type;
		String name;

		for(Property prop : cd.getOwnedAttribute()) {
			type = prop.getType();

			if(type instanceof NamedElement) {
				name = ((NamedElement)prop.getType()).getName();

				if(type instanceof DataType)
					cv.addAttribute(prop.getName(), name);
				else if(type instanceof org.kermeta.language.structure.Class && isKermetaPrimitiveType(name))
					cv.addAttribute(prop.getName(), name);
			}
		}
	}



	private boolean isKermetaPrimitiveType(final String name) {
		return name.equals("String") || name.equals("Boolean") || name.equals("Real") || name.equals("Integer");
	}


	private String getTypeQualifiedName(final Type type) {
		if(!(type instanceof org.kermeta.language.structure.Class) || !(((org.kermeta.language.structure.Class)type).getTypeDefinition() instanceof ClassDefinition))
			return "";
		return getQualifiedName((ClassDefinition)((org.kermeta.language.structure.Class)type).getTypeDefinition());
	}


	private String getTypeName(final TypedElement te) {
		if(te.getType()==null || !(te.getType() instanceof org.kermeta.language.structure.Class))
			return "";
		return ((org.kermeta.language.structure.Class)te.getType()).getName();
	}


	private String getQualifiedName(final ClassDefinition cd) {
		String qname = cd.getName();

		if(cd.eContainer() instanceof Package)
			qname = getQualifiedName((Package)cd.eContainer()) + "." + qname;

		return qname;
	}


	private String getQualifiedName(final Package pkg) {
		String qname = pkg.getName();

		if(pkg.getNestingPackage()!=null)
			qname = getQualifiedName(pkg.getNestingPackage()) + "." + qname;

		return qname;
	}
}
