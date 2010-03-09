package org.kermeta.java.jamoppc.ecore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.ETypedElement;
import org.eclipse.emf.ecore.impl.EcoreFactoryImpl;
import org.emftext.language.java.classifiers.Class;
import org.emftext.language.java.classifiers.Classifier;
import org.emftext.language.java.classifiers.ConcreteClassifier;
import org.emftext.language.java.classifiers.Interface;
import org.emftext.language.java.commons.NamedElement;
import org.emftext.language.java.containers.CompilationUnit;
import org.emftext.language.java.generics.QualifiedTypeArgument;
import org.emftext.language.java.members.Field;
import org.emftext.language.java.types.Boolean;
import org.emftext.language.java.types.Char;
import org.emftext.language.java.types.ClassifierReference;
import org.emftext.language.java.types.Double;
import org.emftext.language.java.types.Int;
import org.emftext.language.java.types.Long;
import org.emftext.language.java.types.NamespaceClassifierReference;
import org.emftext.language.java.types.PrimitiveType;
import org.emftext.language.java.types.Short;
import org.emftext.language.java.types.Void;

public class Java2Tree {
	
	CompilationUnit currentCompilationUnit;
	EPackage root;
	EPackage lastPackage = root;
	EClass lastclass;
	ETypedElement lastElement;
	EClass superclass;
	private Map<String,EPackage> packages= new HashMap<String,EPackage>();
	private Map<String,EClass> classes = new HashMap<String,EClass>();
	private Map<String,EAttribute> attributes = new HashMap<String,EAttribute>();
	private Map<String,EDataType> datatypes = new HashMap<String,EDataType>();
	private Map<String,EEnum> enumerations = new HashMap<String,EEnum>();
	public List<Tree<Class>> hierarchy = new ArrayList<Tree<Class>>();
	private List<String> primitive_types = new ArrayList<String>();
	
	public Java2Tree(EPackage r){
		this.root = r;
		lastPackage = root;
		initPrimitiveTypesList();
	}
	
	public void initPrimitiveTypesList(){
		primitive_types.add("java.lang.String");
		primitive_types.add("java.lang.Boolean");
		primitive_types.add("java.lang.Integer");
		primitive_types.add("java.lang.Character");
		primitive_types.add("java.lang.Double");
		primitive_types.add("java.lang.Float");
		primitive_types.add("java.lang.Void");
	}
	
	public void accept(EObject o){
		if (o instanceof CompilationUnit)
			visitCompilationUnit((CompilationUnit)o);
		else if (o instanceof Class)
			visitClass((Class)o);
	}
	
	public void accept2(EObject o){
		if (o instanceof Tree)
			visitTree2((Tree)o);
		else if (o instanceof Node)
			visitNode2((Node)o);
		else if (o instanceof Class)
			visitClass2((Class)o);
		else if (o instanceof Field)
			visitField2((Field) o);
		else if (o instanceof NamespaceClassifierReference)
			visitNameClassifierReference2((NamespaceClassifierReference)o);
		else if (o instanceof ClassifierReference)
			visitClassifierReference2((ClassifierReference)o);
		else if (o instanceof PrimitiveType)
			visitPrimitiveType2((PrimitiveType) o);
	}
	
	public void visitCompilationUnit(CompilationUnit e) {
		currentCompilationUnit = e;
		lastPackage = root;
		if (!(e.getNamespaces().contains("sun")||e.getNamespaces().contains("javax")||e.getNamespaces().contains("org"))){
			if (getCompilationUnitNamespace(e).equals("java.lang")||(!e.getNamespaces().contains("java"))){
				int index = e.getNamespaces().size();
				// enumeration namespaces are defined inside a class
				// we do not create a package for this
				if(getName(e).contains("$"))
					index = index -1;
				String packageName = "";
				for (int i = 0; i < index; i++) {
					String namespace = e.getNamespaces().get(i);
					if (lastPackage == root)
						packageName = namespace;
					else
						packageName = lastPackage.getName()+"."+namespace;
					if(!(packages.containsKey(packageName))){
						EPackage p = EcoreFactoryImpl.eINSTANCE.createEPackage();
						p.setName(namespace);
						packages.put(packageName, p);
						lastPackage.getESubpackages().add(p);
						lastPackage = p;
					}
					else
						lastPackage = packages.get(packageName);
				}
				for (EObject c : e.getClassifiers()){
					//System.out.println(getName((Classifier)c));
					//if(!getName((Classifier)c).equals("Object")){
					if(!e.getNamespaces().contains("java")){
						if (c instanceof Class){
							Tree<Class> t = existsInHierarchy((Class)c);
							buildHierarchy(t,t.getRoot(),(Class)c);
							if (t.getRoot() != null){
								if (existsInHierarchy(t.getRoot().getValue()).getRoot() == null){
									this.hierarchy.add(t);
								}
							}
						}
						this.accept(c);
					}
				}
			}
		}
	}
	
	private Tree<Class> existsInHierarchy(Class s) {
		boolean exists = false;
		Tree<Class> t = new Tree<Class>();
		for (Tree<Class> tree : hierarchy) {
			exists = exists || tree.existsInHierarchy(s);
			if (exists){
				t = tree;
				break;
			}
		}
		return t;
	}

	private Node<Class> buildHierarchy(Tree<Class> t,Node<Class> node, Class c) {
		Node<Class> currentNode = null;
		//if(!getClassifierQualifiedName(c).equals("java.lang.Object")){
		if(!getClassifierQualifiedName(c).contains("java")){
			currentNode = new Node<Class>(c);
			Tree<Class> tree = existsInHierarchy(c);
			// if the current node is not present in the hierarchy
			if (tree.getRoot() == null){
				// handle supertypes of the current node
				if (c.getExtends() != null){
					if (c.getExtends() instanceof NamespaceClassifierReference){
						Node<Class> n = buildHierarchy(t, node,(Class)((NamespaceClassifierReference)c.getExtends()).getClassifierReferences().get(0).getTarget());
						if (n != null)
							n.addChild(currentNode);
						else
							t.setRoot(currentNode);
					}
					else {
						if (c.getExtends() instanceof ClassifierReference){
							Node<Class> n = buildHierarchy(t,node,(Class)((ClassifierReference)c.getExtends()).getTarget());
							if (n != null)
								n.addChild(currentNode);
							else
								t.setRoot(currentNode);
						}
					}
				}
				// if no supertype, current node becomes the root
				else
					t.setRoot(currentNode);
			}
			// If the current node has already been treated, find out the corresponding node in the hierarchy
			else
				return tree.findNode(c);
		}
		return currentNode;
	}

	public void visitClass(Class e) {
		if(!getName(e).equals("Object")){
			EClass cl = EcoreFactoryImpl.eINSTANCE.createEClass();
			cl.setName(getName(e));
			lastclass = cl;
			classes.put(getClassifierQualifiedName(e), cl);
			if (lastPackage != null)
				lastPackage.getEClassifiers().add(cl);
			else
				root.getEClassifiers().add(cl);
		}
	}
	
	public void visitInterface(Interface e) {
		if(!getName(e).equals("Object")){
			EClass cl = EcoreFactoryImpl.eINSTANCE.createEClass();
			cl.setName(getName(e));
			cl.setInterface(true);
			lastclass = cl;
			classes.put(getClassifierQualifiedName(e), cl);
			if (lastPackage != null)
				lastPackage.getEClassifiers().add(cl);
			else
				root.getEClassifiers().add(cl);
		}
	}
	
	public void visitTree2(Tree<Class> t){
		this.accept2(t.getRoot());
	}
	
	public void visitNode2(Node<Class> n){
		this.accept2(n.getValue());
		superclass = classes.get(getClassifierQualifiedName(n.getValue()));
		for (EObject e : n.getChilds()) {
			//System.out.println(getClassifierQualifiedName(((Node<Class>)e).getValue()));
			superclass = classes.get(getClassifierQualifiedName(n.getValue()));
			this.accept2(e);
		}
		superclass = null;
	}
	
	public void visitClass2(Class e){
		lastPackage = root;
		CompilationUnit cu = (CompilationUnit)e.eContainer();
		String packageName = "";
		int index = cu.getNamespaces().size();
		for (int i = 0; i < index; i++) {
			String namespace = cu.getNamespaces().get(i);
			if (lastPackage == root)
				packageName = namespace;
			else
				packageName = lastPackage.getName()+"."+namespace;
			lastPackage = packages.get(packageName);
		}
		lastPackage = packages.get(packageName);
		lastclass = classes.get(getClassifierQualifiedName(e));
		if (superclass != null)
			lastclass.getESuperTypes().add(superclass);
		for (EObject m : e.getMembers()) {
			System.out.println("Visiting class "+lastclass.getName());
			this.accept2(m);
		}
	}
	
	public void visitField2(Field e){
		System.out.println("Visiting Field "+getFieldQualifiedName(e));
		if(!attributeExistsinSuperClass(lastclass,(Field)e)){
			EAttribute attr = EcoreFactoryImpl.eINSTANCE.createEAttribute();
			attr.setName(getName(e).replace("$", ""));
			attributes.put(getFieldQualifiedName(e),attr);
			lastElement = attr;
			this.accept2(e.getType());
			lastclass.getEStructuralFeatures().add(attr);
		}
	}
	
	public void visitNameClassifierReference2(NamespaceClassifierReference e) {
		this.accept2(e.getClassifierReferences().get(0));
	}
	
	public void visitClassifierReference2(ClassifierReference e) {
		System.out.println("Visiting classifierRef "+getClassifierQualifiedName(e.getTarget())+" for elt "+lastElement.getName());
		String classifierName = getClassifierQualifiedName(e.getTarget());
		visitCollectionClassifierReference(classifierName,e);
		//TODO to be extended to all primitive types that can be also objects in Java
		//if (classifierName.equals("java.lang.String")){
		if (primitive_types.contains(classifierName)){
			System.out.println("type "+classifierName);
			EDataType dt = EcoreFactoryImpl.eINSTANCE.createEDataType();
			//dt.setName("String");
			dt.setName(classifierName.substring(classifierName.lastIndexOf(".")+1));
			//dt.setInstanceClassName("java.lang.String");
			dt.setInstanceClassName(classifierName);
			dt = addDatatype(dt);
			lastElement.setEType(dt);
		}
		else {
			if (classes.containsKey(classifierName))
					lastElement.setEType(classes.get(classifierName));
			else
				if (enumerations.containsKey(classifierName))
					lastElement.setEType(enumerations.get(classifierName));
		}
	}
	
	public void visitPrimitiveType2(PrimitiveType e) {
		System.out.println("Visiting primitiveTypes");
		// TODO primitives types have been changed to cope with Kermeta primitives types
		EDataType dt = EcoreFactoryImpl.eINSTANCE.createEDataType();
		if (e instanceof Boolean){
			dt.setName("Boolean");
			dt.setInstanceClassName("java.lang.Boolean");
		}
		//lastElement.setEType(EcorePackageImpl.eINSTANCE.getEBoolean());
		else if (e instanceof org.emftext.language.java.types.Byte){
			dt.setName("Int");
			dt.setInstanceClassName("java.lang.Integer");
		}
		else if (e instanceof Char){
			dt.setName("Char");
			dt.setInstanceClassName("java.lang.Character");
		}
		else if (e instanceof Double){
			dt.setName("Double");
			dt.setInstanceClassName("java.lang.Double");
		}
		else if (e instanceof org.emftext.language.java.types.Float){
			dt.setName("Float");
			dt.setInstanceClassName("java.lang.Float");
		}
		else if (e instanceof Int){
			dt.setName("Int");
			dt.setInstanceClassName("java.lang.Integer");
		}
		else if (e instanceof Long){
			dt.setName("Int");
			dt.setInstanceClassName("java.lang.Integer");
		}
		else if (e instanceof Short){
			dt.setName("Int");
			dt.setInstanceClassName("java.lang.Integer");
		}
		else if (e instanceof Void){
			dt.setName("Void");
			dt.setInstanceClassName("java.lang.Void");
		}
		dt = addDatatype(dt);
		lastElement.setEType(dt);
	}
	
	private void visitCollectionClassifierReference(String classifierName, ClassifierReference e){
		if (classifierName.equals("org.eclipse.emf.common.util.EList")){
			QualifiedTypeArgument arg = ((QualifiedTypeArgument)e.getTypeArguments().get(0));
				//NamespaceClassifierReference ref = (NamespaceClassifierReference)arg.getType();
				//ClassifierReference cref = ref.getClassifierReferences().get(0);
				this.accept2(arg.getType());
				//this.accept2(e);
				lastElement.setUpperBound(-1);
		}
		if (classifierName.equals("java.util.Collection")){
			QualifiedTypeArgument arg = ((QualifiedTypeArgument)e.getTypeArguments().get(0));
			//NamespaceClassifierReference ref = (NamespaceClassifierReference)arg.getType();
			//ClassifierReference cref = ref.getClassifierReferences().get(0);
			//this.accept2(cref);
			this.accept2(arg.getType());
			lastElement.setUpperBound(-1);
		}
		if (classifierName.equals("java.util.List")){
			QualifiedTypeArgument arg = ((QualifiedTypeArgument)e.getTypeArguments().get(0));
			//NamespaceClassifierReference ref = (NamespaceClassifierReference)arg.getType();
			//ClassifierReference cref = ref.getClassifierReferences().get(0);
			//this.accept2(cref);
			this.accept2(arg.getType());
			lastElement.setUpperBound(-1);
		}
		if (classifierName.equals("java.util.ArrayList")){
			QualifiedTypeArgument arg = ((QualifiedTypeArgument)e.getTypeArguments().get(0));
			//NamespaceClassifierReference ref = (NamespaceClassifierReference)arg.getType();
			//ClassifierReference cref = ref.getClassifierReferences().get(0);
			//this.accept2(cref);
			this.accept2(arg.getType());
			lastElement.setUpperBound(-1);
		}
	}
	
	boolean attributeExistsinSuperClass(EClass c, Field f){
		boolean exists = false;
		if (c.getEStructuralFeature(getName(f)) != null){
			return true;
		}
		else{
			for (EClass cl : c.getESuperTypes()) {
				//System.out.println(cl.getEStructuralFeature(getName(f)));
				if (cl.getESuperTypes() != null)
					exists = attributeExistsinSuperClass(cl,f);
			}
		}
		return exists;
	}
	
	/**
	 * @param dt
	 * @return
	 */
	private EDataType addDatatype(EDataType dt) {
		EDataType datatype = datatypes.get(dt.getName());
		if(datatype == null){
			//root.getEClassifiers().add(dt);
			lastPackage.getEClassifiers().add(dt);
			datatypes.put(dt.getName(),dt);
		}
		else
			dt = datatype;
		return dt;
	}
	
	String getName(NamedElement n){
		if (n.getName() != null)
			return ((org.emftext.language.java.commons.impl.NameImpl) n.getName()).getValue();
		else
			return "";
	}
	
	String getClassifierQualifiedName(Classifier o){
		String packagename = "";
		if (o.eContainer() instanceof CompilationUnit)
		for (String s :((CompilationUnit)o.eContainer()).getNamespaces())
			packagename = packagename + s + ".";
		else if(o.eContainer() instanceof Classifier)
			packagename=getClassifierQualifiedName((Classifier) o.eContainer());
			
		return packagename+getName(o);
	}
	
	String getPackageQualifiedName(CompilationUnit o){
		String packagename = "";
		for (Iterator<String> iterator = o.getNamespaces().iterator(); iterator.hasNext();) {
			String s = (String) iterator.next();
			packagename = packagename + s;
			if (iterator.hasNext())
				packagename += ".";
		}
			
		return packagename;
	}
	
	String getFieldQualifiedName(Field f){
		String name = getClassifierQualifiedName((ConcreteClassifier)f.getContainer());
		return name+"."+getName(f);
	}
	
	String getCompilationUnitNamespace(CompilationUnit c){
		String name = "";
		for (String s : c.getNamespaces()) {
			name += s;
		}
		return name;
	}
}
