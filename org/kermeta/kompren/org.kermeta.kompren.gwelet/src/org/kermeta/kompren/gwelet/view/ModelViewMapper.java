package org.kermeta.kompren.gwelet.view;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.kermeta.kompren.gwelet.model.Model;
import org.kermeta.kompren.gwelet.model.ModelUtils;
import org.kermeta.language.ecore2km.Ecore2KMImpl4Eclipse;
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
import org.malai.presentation.Presentation;

public final class ModelViewMapper {
	private static ModelViewMapper instance;

	protected Presentation<Model, MetamodelView> presentation;

	protected Map<String, List<ClassDefinition>> cdAdded;

	protected Map<ClassDefinition, ClassView> classMappings;

	protected Map<ClassView, ClassDefinition> classMappingsInverted;

	protected Map<String, InheritanceView> addedInheritances;


	public static ModelViewMapper getMapper() {
		return instance;
	}


	public static void initMapper(final Presentation<Model, MetamodelView> presentation) {
		if(instance!=null)
			instance.flush();

		instance = new ModelViewMapper(presentation);
	}


	private ModelViewMapper(final Presentation<Model, MetamodelView> presentation) {
		super();

		this.presentation = presentation;
		cdAdded = new HashMap<String, List<ClassDefinition>>();
		classMappings = new HashMap<ClassDefinition, ClassView>();
		classMappingsInverted = new HashMap<ClassView, ClassDefinition>();
		addedInheritances = new HashMap<String, InheritanceView>();
	}


	private void flush() {
		cdAdded.clear();
		classMappings.clear();
		classMappingsInverted.clear();
		addedInheritances.clear();
	}



	public ClassView getClassView(final ClassDefinition cd) {
		return classMappings.get(cd);
	}


	public List<ClassDefinition> getClassDefinitionAdded() {
		List<ClassDefinition> list = new ArrayList<ClassDefinition>();

		for(List<ClassDefinition> l : cdAdded.values())
			list.addAll(l);

		return list;
	}


	public ClassDefinition getClassDefinition(final ClassView cv) {
		return classMappingsInverted.get(cv);
	}


	private ModelingUnit loadKm(final String uri) {
		return new KmLoaderImpl().load(uri);
	}


	private ModelingUnit loadEcore(final String uri) {
		try {
			if(uri.indexOf(".ecore")!=-1) {
				String path = uri.substring(0, uri.indexOf(".ecore")+".ecore".length()).replace("file:/", "");
				Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ecore", new XMIResourceFactoryImpl());
				ResourceSet rset = new ResourceSetImpl();
				Resource resource = rset.createResource(URI.createFileURI(path));
				resource.load(null);
				EList<EObject> contents = resource.getContents();
				EPackage root = (EPackage) (contents!=null && !contents.isEmpty() && contents.get(0) instanceof EPackage ?
								contents.get(0) : null);

				if(root!=null) {
					Ecore2KMImpl4Eclipse ecore2km = new Ecore2KMImpl4Eclipse();
					return ecore2km.convertPackage(root, null);
				}
			}
		}catch(Exception ex) { ex.printStackTrace(); }
		return null;
	}


	public void build(final String uriMetamodel) {
		ModelingUnit mu = null;

		if(uriMetamodel.indexOf(".km")!=-1)
			mu = loadKm(uriMetamodel.substring(0, uriMetamodel.indexOf(".km")+".km".length()));
		else
			if(uriMetamodel.indexOf(".ecore")!=-1)
				mu = loadEcore(uriMetamodel);

		if(mu!=null) {
			final MetamodelView view = presentation.getConcretePresentation();

			flush();
			presentation.getAbstractPresentation().setUnit(mu);
			view.getEntities().clear();
			view.getRelations().clear();

			for(Package pkg : mu.getPackages())
				createPackageView(pkg, view);

			createRelationsView(view);

			view.updateLayout();
			view.update();
		}
	}


	public ClassView getClassView(final String qualifedName) {
		List<ClassDefinition> cds = cdAdded.get(qualifedName);

		if(cds!=null)
			for(ClassDefinition cd : cds)
				if(classMappings.get(cd)!=null)
					return classMappings.get(cd);

		return null;
	}


	private void createRelationsView(final MetamodelView view) {
		for(List<ClassDefinition> list : cdAdded.values())
			for(ClassDefinition cd : list) {
				createInheritanceView(cd, ModelUtils.INSTANCE.getQualifiedName(cd), view);
				createAssociations(cd, view);
			}
	}



	private void createInheritanceView(final ClassDefinition cd, final String qname, final MetamodelView view) {
		String qname2;
		InheritanceView in;

		for(Type type : cd.getSuperType()) {
			qname2 = ModelUtils.INSTANCE.getTypeQualifiedName(type);
			if(qname.length()>0 && qname2.length()>2 && addedInheritances.get(qname+","+qname2)==null) {
				in = view.addInheritanceView(classMappings.get(cd), classMappings.get(cdAdded.get(qname2).get(0)));
				addedInheritances.put(qname+","+qname2, in);
			}
		}
	}


	private void createPackageView(final Package pkg, final MetamodelView view) {
		for(TypeDefinition td : pkg.getOwnedTypeDefinition())
			if(td instanceof ClassDefinition)
				createClassDefinition((ClassDefinition)td, view);

		for(Package pkg2 : pkg.getNestedPackage())
			createPackageView(pkg2, view);
	}


	private void createClassDefinition(final ClassDefinition cd, final MetamodelView view) {
		String qname = ModelUtils.INSTANCE.getQualifiedName(cd);
		List<ClassDefinition> cdFirst = cdAdded.get(qname);
		ClassView cv = null;

		if(cdFirst==null) {
			List<ClassDefinition> cds = new ArrayList<ClassDefinition>();
			cv = new ClassView(cd.getName());
			cds.add(cd);

			addAttributes(cd, cv);

			for(Operation op : cd.getOwnedOperation())
				cv.addOperation(op.getName(), ModelUtils.INSTANCE.getTypeName(op), op.getIsAbstract());

			view.addEntity(cv);
			cdAdded.put(ModelUtils.INSTANCE.getQualifiedName(cd), cds);
		}
		else {
			// Aspects.
			cv = classMappings.get(cdFirst.get(0));

			//FIXME: check that attributes and operations not added several times.
			addAttributes(cd, cv);

			for(Operation op : cd.getOwnedOperation())
				cv.addOperation(op.getName(), ModelUtils.INSTANCE.getTypeName(op), op.getIsAbstract());
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
				oppositeCardString = ModelUtils.INSTANCE.getCardinalityString(opp);
			}

			if(type instanceof org.kermeta.language.structure.Class &&
					!ModelUtils.INSTANCE.isKermetaPrimitiveType(((org.kermeta.language.structure.Class)type).getName())) {
				cv2 = classMappings.get(((org.kermeta.language.structure.Class)type).getTypeDefinition());
				mv.addRelation(cv, cv2, prop.getIsComposite() || oppositeCompo, oppositeCompo,
						prop.getName(), oppositeName, ModelUtils.INSTANCE.getCardinalityString(prop), oppositeCardString);
			}
		}
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
				else if(type instanceof org.kermeta.language.structure.Class && ModelUtils.INSTANCE.isKermetaPrimitiveType(name))
					cv.addAttribute(prop.getName(), name);
			}
		}
	}
}
