package org.kermeta.java.jamoppc.ecore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.ETypedElement;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.impl.EcoreFactoryImpl;
import org.emftext.language.java.classifiers.Class;
import org.emftext.language.java.classifiers.Classifier;
import org.emftext.language.java.classifiers.ConcreteClassifier;
import org.emftext.language.java.classifiers.Enumeration;
import org.emftext.language.java.classifiers.Interface;
import org.emftext.language.java.commons.NamedElement;
import org.emftext.language.java.containers.CompilationUnit;
import org.emftext.language.java.generics.QualifiedTypeArgument;
import org.emftext.language.java.members.EnumConstant;
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
import org.emftext.language.java.types.TypeReference;

/**
 * Class that implements and runs the Visitor Pattern on a Tree structure.
 * @author mclavreu
 *
 */
public class Java2Tree extends TreeVisitor{
	
	// final attributes for primitiveTypes
	private final String BOOLEAN = "java.lang.Boolean";
	private final String STRING = "java.lang.String";
	private final String INTEGER = "java.lang.Integer";
	private final String CHAR = "java.lang.Character";
	private final String DOUBLE = "java.lang.Double";
	private final String FLOAT = "java.lang.Float";
	private final String VOID = "java.lang.Void";
	private final String DATE = "java.util.Date";
	private final String OBJECT = "java.lang.Object";
	private final String BYTE = "java.lang.Byte";
	private final String SHORT = "java.lang.Short";
	private final String LONG = "java.lang.Long";
	
	private final String _BOOLEAN = "boolean";
	
	private final String _BYTE = "byte";
	private final String _INTEGER = "int";
	private final String _CHAR = "char";
	private final String _DOUBLE = "double";
	private final String _FLOAT = "float";
	private final String _LONG = "long";
	private final String _SHORT = "short";
	private final String _VOID = "void";
	
	CompilationUnit currentCompilationUnit;
	EPackage root;
	EPackage lastPackage = root;
	EClass lastclass;
	ETypedElement lastElement;
	EClass superclass;
	EEnum lastenum;
	private Map<String,EPackage> packages= new HashMap<String,EPackage>();
	private Map<String,EClass> classes = new HashMap<String,EClass>();
	private Map<String,EAttribute> attributes = new HashMap<String,EAttribute>();
	private Map<String,EDataType> datatypes = new HashMap<String,EDataType>();
	private Map<String,EEnum> enumerations = new HashMap<String,EEnum>();
	public List<Tree<Class>> hierarchy = new ArrayList<Tree<Class>>();
	private Map<String,String> primitive_types = new HashMap<String,String>();
	private List<String> collections_types = new ArrayList<String>();
	
	/**
	 * Constructor
	 * @param r the package we start the visit on
	 */
	public Java2Tree(EPackage r){
		this.root = r;
		lastPackage = root;
		initPrimitiveTypesList();
		initCollectionTypesList();
	}

	/**
	 * Initializes the list of primitiveTypes
	 */
	public void initPrimitiveTypesList(){
		primitive_types.put(STRING, "String");
		primitive_types.put(BOOLEAN, "Boolean");
		primitive_types.put(INTEGER, "Integer");
		primitive_types.put(CHAR, "Char");
		primitive_types.put(DOUBLE, "Double");
		primitive_types.put(FLOAT, "Float");
		primitive_types.put(VOID, "Void");
		primitive_types.put(DATE, "Date");
		primitive_types.put(OBJECT, "Object");
		primitive_types.put(BYTE, "Byte");
		primitive_types.put(LONG, "Long");
		primitive_types.put(SHORT, "Short");
	}
	
	/**
	 * Initializes the list of collectionTypes
	 */
	private void initCollectionTypesList() {
		collections_types.add("org.eclipse.emf.common.util.EList");
		collections_types.add("java.util.Collection");
		collections_types.add("java.util.List");
		collections_types.add("java.util.ArrayList");
		collections_types.add("java.util.Map");
	}

	/**
	 * Visits a CompilationUnit
	 * @param e a CompilationUnit that describe a class or a set of classes
	 */
	public void visitCompilationUnit(CompilationUnit e) {
		currentCompilationUnit = e;
		lastPackage = root;
		// avoid creating ecore elements for java API objects
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
						//packageName = lastPackage.getName()+"."+namespace;
						packageName += "."+namespace;
					if(!(packages.containsKey(packageName))){
						EPackage p = EcoreFactoryImpl.eINSTANCE.createEPackage();
						p.setName(namespace);
						p.setNsPrefix(namespace);
						p.setNsURI("http://"+packageName);
						//Creating tag for compiler V2
						addTagForKermetaCompilerV2(p);
						packages.put(packageName, p);
						lastPackage.getESubpackages().add(p);
						lastPackage = p;
					}
					else
						lastPackage = packages.get(packageName);
				}
				// visiting classifiers
				for (EObject c : e.getClassifiers()){
					if(!e.getNamespaces().contains("java")){
						if (c instanceof Class){
							Tree<Class> t = existsInHierarchy((Class)c);
							buildHierarchy(t,t.getRoot(),(Class)c);
							if (t.getRoot() != null){
								if (existsInHierarchy(t.getRoot().getValue()).getRoot() == null)
									this.hierarchy.add(t);
							}
						}
						this.accept(c);
					}
				}
			}
		}
	}
	
	/**
	 * Browses the hierarchy to find a class
	 * @param c a Class
	 * @return true is s is part of the hierarchy, false otherwise
	 */
	private Tree<Class> existsInHierarchy(Class c) {
		boolean exists = false;
		Tree<Class> t = new Tree<Class>();
		for (Tree<Class> tree : hierarchy) {
			exists = exists || tree.existsInHierarchy(c);
			if (exists){
				t = tree;
				break;
			}
		}
		return t;
	}

	/**
	 * Builds a Tree where Nodes are Classes
	 * @param t the tree to build
	 * @param node the current node
	 * @param c the current class to insert in the hierarchy
	 * @return the current node
	 */
	private Node<Class> buildHierarchy(Tree<Class> t,Node<Class> node, Class c) {
		Node<Class> currentNode = null;
		if(!getClassifierQualifiedName(c).contains("java")){
			currentNode = new Node<Class>(c);
			Tree<Class> tree = existsInHierarchy(c);
			// if the current node is not present in the hierarchy
			if (tree.getRoot() == null){
				// handle supertypes of the current node
				if (c.getExtends() != null){
					Node<Class> n = null;
					if (c.getExtends() instanceof NamespaceClassifierReference)
						n = buildHierarchy(t, node,(Class)((NamespaceClassifierReference)c.getExtends()).getClassifierReferences().get(0).getTarget());
					if (c.getExtends() instanceof ClassifierReference)
						n = buildHierarchy(t,node,(Class)((ClassifierReference)c.getExtends()).getTarget());
					if (n != null)
						n.addChild(currentNode);
					else
						t.setRoot(currentNode);
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

	/**
	 * Visits a Class
	 * @param c the Class object
	 */
	public void visitClass(Class c) {
		if(!getName(c).equals("Object")){
			EClass cl = EcoreFactoryImpl.eINSTANCE.createEClass();
			cl.setName(getName(c));
			//Creating tag for compiler V2
			addTagForKermetaCompilerV2(cl);
			lastclass = cl;
			classes.put(getClassifierQualifiedName(c), cl);
			// Need to process the members of the class ot create the Enumerations
			for (EObject m : c.getMembers()){
				if (m instanceof Enumeration || m instanceof Class)
					this.accept(m);
			}
			if (lastPackage != null)
				lastPackage.getEClassifiers().add(cl);
			else
				root.getEClassifiers().add(cl);
		}
	}

	/**
	 * Add a tag for the kermeta compiler v2 to identify model elements 
	 * extracted from legacy API
	 * @param o model element with which the annotation is linked
	 */
	private void addTagForKermetaCompilerV2(EModelElement o) {
		//Creating tag for compiler V2
		EAnnotation tag = EcoreFactoryImpl.eINSTANCE.createEAnnotation();
		EMap<String,String> details = tag.getDetails();
		tag.setSource("kermeta");
		details.put("ecoreFromAPI","true");
		tag.getDetails().addAll(details.entrySet());
		o.getEAnnotations().add(tag);
	}
	
	/**
	 * Visits an Interface
	 * @param c the Interface object
	 */
	public void visitInterface(Interface c) {
		if(!getName(c).equals("Object")){
			EClass cl = EcoreFactoryImpl.eINSTANCE.createEClass();
			cl.setName(getName(c));
			cl.setInterface(true);
			cl.setAbstract(true);
			lastclass = cl;
			classes.put(getClassifierQualifiedName(c), cl);
			if (lastPackage != null)
				lastPackage.getEClassifiers().add(cl);
			else
				root.getEClassifiers().add(cl);
		}
	}
	
	/**
	 * Visits an Enumeration
	 * @param e the Enumeration object
	 */
	public void visitEnum(Enumeration e) {
		String enumName = getClassifierQualifiedName(e);
		if (!enumerations.containsKey(enumName)){
			EEnum enu = EcoreFactoryImpl.eINSTANCE.createEEnum();
			enu.setName(getName(e));
			addTagForKermetaCompilerV2(enu);
			enumerations.put(enumName, enu);
			lastenum = enu;
			for (EObject l : e.getConstants()) {
				this.accept(l);
			}
			if (lastPackage != null)
				lastPackage.getEClassifiers().add(enu);
			else
				root.getEClassifiers().add(enu);
		}
	}
	
	/**
	 * Visits an EnumConstant
	 * @param o the EnumConstant object
	 */
	public void visitEnuConstant(EnumConstant o) {
		EEnumLiteral literal = EcoreFactoryImpl.eINSTANCE.createEEnumLiteral();
		literal.setName(getName(o));
		literal.setValue(lastenum.getELiterals().size());
		lastenum.getELiterals().add(literal);
	}
	
	/**
	 * Visits the Tree - second pass
	 * @param t the Tree object to visit
	 */
	@Override
	public void visitTree2(Tree<Class> t){
		this.accept2(t.getRoot());
	}
	
	/**
	 * Visits a Node of the Tree - second pass
	 * @param n the Node object to visit
	 */
	@Override
	public void visitNode2(Node<Class> n){
		this.accept2(n.getValue());
		superclass = classes.get(getClassifierQualifiedName(n.getValue()));
		for (EObject e : n.getChildren()) {
			superclass = classes.get(getClassifierQualifiedName(n.getValue()));
			this.accept2(e);
		}
		superclass = null;
	}
	
	/**
	 * Visits a Class - second pass
	 * @param c the Class object
	 */
	public void visitClass2(Class c){
		lastPackage = root;
		//CompilationUnit cu = (CompilationUnit)c.eContainer();
		String packageName = "";
		packageName = getPackageNameFromAClass(c);
		/*int index = cu.getNamespaces().size();
		for (int i = 0; i < index; i++) {
			String namespace = cu.getNamespaces().get(i);
			if (lastPackage == root)
				packageName = namespace;
			else
				packageName = lastPackage.getName()+"."+namespace;
			lastPackage = packages.get(packageName);
		}
		*/
		lastPackage = packages.get(packageName);
		lastclass = classes.get(getClassifierQualifiedName(c));
		if (superclass != null)
			lastclass.getESuperTypes().add(superclass);
		for (EObject m : c.getMembers())
			this.accept2(m);
	}
	
	private String getPackageNameFromAClass(Class c) {
		String packageName = "";
		if (c.eContainer() instanceof CompilationUnit){
			CompilationUnit cu = (CompilationUnit)c.eContainer();
			int index = cu.getNamespaces().size();
			for (int i = 0; i < index; i++) {
				String namespace = cu.getNamespaces().get(i);
				if (lastPackage == root)
					packageName = namespace;
				else
					//packageName = lastPackage.getName()+"."+namespace;
					packageName += "."+namespace;
				lastPackage = packages.get(packageName);
			}
			return packageName;
		}
		else
			return getPackageNameFromAClass((Class)c.getContainer());
	}

	/**
	 * Visits a Field of a Class - second pass
	 * @param e the Field object
	 */
	public void visitField2(Field e){
		// don't add the attribute if it comes from a superclass
		if(!attributeExistsinSuperClass(lastclass,(Field)e)){
			EStructuralFeature feature = null;
			if (e.getType() instanceof NamespaceClassifierReference && !isKermetaPrimitiveType(e.getType())
					&& !isEnum(e.getType())){
				feature = EcoreFactoryImpl.eINSTANCE.createEReference();
				feature.setName(getName(e).replace("$", ""));
				lastElement = feature;
			}
			else {
				feature = EcoreFactoryImpl.eINSTANCE.createEAttribute();
				feature.setName(getName(e).replace("$", ""));
				attributes.put(getFieldQualifiedName(e),(EAttribute)feature);
				lastElement = feature;
			}
			this.accept2(e.getType());
			lastclass.getEStructuralFeatures().add(feature);
		}
	}
	
	/**
	 * Checks if the TypeReference is an Enumeration
	 * @param type the Type to check
	 * @return true if it is an Enumeration, false otherwise
	 */
	private boolean isEnum(TypeReference type) {
		if (type instanceof NamespaceClassifierReference){
			if (((ClassifierReference)((NamespaceClassifierReference)type).getClassifierReferences().get(0)).getTarget() instanceof Enumeration)
				return true;
		}
		return false;
	}

	/**
	 * Checks if the TypeReference is a kermeta PrimitiveType
	 * @param type the Type to check
	 * @return true if it is a kermeta PrimitiveType, false otherwise
	 */
	private boolean isKermetaPrimitiveType(TypeReference type) {
		if (type instanceof NamespaceClassifierReference){
			String classifierName = getClassifierQualifiedName(((ClassifierReference)((NamespaceClassifierReference)type).getClassifierReferences().get(0)).getTarget());
			if (primitive_types.keySet().contains(classifierName)){
				return true;
			}
			else return false;
		}
		else
			return false;
	}

	/**
	 * Visits a NameClassifierReference - second pass
	 * @param e a reference to a type
	 */
	public void visitNameClassifierReference2(NamespaceClassifierReference e) {
		this.accept2(e.getClassifierReferences().get(0));
	}
	
	/**
	 * Visits a ClassifierReference - second pass
	 * @param e a reference to a type
	 */
	public void visitClassifierReference2(ClassifierReference e) {
		String classifierName = getClassifierQualifiedName(e.getTarget());
		// handle collections of objects
		//visitCollectionClassifierReference(classifierName,e);
		visitCollection(classifierName,e);
		//TODO to be extended to all primitive types that can be also objects in Java
		if (primitive_types.keySet().contains(classifierName)){
			/*EDataType dt = EcoreFactoryImpl.eINSTANCE.createEDataType();
			dt.setName(classifierName.substring(classifierName.lastIndexOf(".")+1));
			dt.setInstanceClassName(classifierName);
			dt = addDatatype(dt);*/
			EDataType dt = addDatatype(classifierName.substring(classifierName.lastIndexOf(".")+1),classifierName);
			lastElement.setEType(dt);
		}
		else {
			if (classes.containsKey(classifierName))
					lastElement.setEType(classes.get(classifierName));
			else
				// to be checked ... do not know if it works
				if (enumerations.containsKey(classifierName))
					lastElement.setEType(enumerations.get(classifierName));
		}
	}
	
	/**
	 * Visits PrimitiveTypes
	 * @param e the type
	 */
	@Override
	public void visitPrimitiveType2(PrimitiveType e) {
		// TODO primitives types have been checked to cope with Kermeta primitives types
		EDataType dt = EcoreFactoryImpl.eINSTANCE.createEDataType();
		// TODO Hack 15.03.2011 for KompilerV2
		if (e instanceof Boolean){
			dt.setName(_BOOLEAN);
			dt.setInstanceClassName(_BOOLEAN);
		}
		else if (e instanceof org.emftext.language.java.types.Byte){
			dt.setName(_BYTE);
			dt.setInstanceClassName(_BYTE);
		}
		else if (e instanceof Char){
			dt.setName(_CHAR);
			dt.setInstanceClassName(_CHAR);
		}
		else if (e instanceof Double){
			dt.setName(_DOUBLE);
			dt.setInstanceClassName(_DOUBLE);
		}
		else if (e instanceof org.emftext.language.java.types.Float){
			dt.setName(_FLOAT);
			dt.setInstanceClassName(_FLOAT);
		}
		else if (e instanceof Int){
			dt.setName(_INTEGER);
			dt.setInstanceClassName(_INTEGER);
		}
		else if (e instanceof Long){
			dt.setName(_LONG);
			dt.setInstanceClassName(_LONG);
		}
		else if (e instanceof Short){
			dt.setName(_SHORT);
			dt.setInstanceClassName(_SHORT);
		}
		dt = addDatatype(dt.getName(),dt.getInstanceClassName());
		lastElement.setEType(dt);
	}
	
	/**
	 * Handles collections of objects
	 * @param classifierName the name of the type of a member
	 * @param e the reference to the type of this member
	 */
	/*private void visitCollectionClassifierReference(String classifierName, ClassifierReference e){
		if (collections_types.contains(classifierName)){
			//System.out.println(classifierName);
			if (e.getTypeArguments().size() != 0){
				System.out.println("if "+classifierName);
				if (classifierName.equals("java.util.Map")){
					EClass m = EcoreFactory.eINSTANCE.createEClass();
					QualifiedTypeArgument arg = ((QualifiedTypeArgument)e.getTypeArguments().get(0));
					QualifiedTypeArgument arg2 = ((QualifiedTypeArgument)e.getTypeArguments().get(1));
					String a = getName(((NamespaceClassifierReference)arg.getType()).getClassifierReferences().get(0).getTarget());
					String a2 = getName(((NamespaceClassifierReference)arg2.getType()).getClassifierReferences().get(0).getTarget());
					System.out.println(a+"To"+a2);
					m.setName(a+"To"+a2);
					//m = addMap(m,addDatatype(a),addDatatype(a2));
					((EReference)lastElement).setContainment(true);
					lastElement.setEType(m);
				}
				QualifiedTypeArgument arg = ((QualifiedTypeArgument)e.getTypeArguments().get(0));
				String reference_type = getName(((ClassifierReference)arg.eContainer()).getTarget());
				System.out.println(reference_type);
				if(reference_type.equals("List")||reference_type.equals("ArrayList")||reference_type.equals("EList"))
					lastElement.setOrdered(true);
				else
					lastElement.setOrdered(false);
				this.accept2(arg.getType());
			}
			else {
				System.out.println("else for "+classifierName);
				//collection has no declared type so we bound it to Void type
				if (classifierName.equals("java.util.Map")){
					EClass m = EcoreFactory.eINSTANCE.createEClass();
					m.setName("ObjectToObject");
					m = addMap(m,null,null);
					((EReference)lastElement).setContainment(true);
					lastElement.setEType(m);
				}
			}
			lastElement.setUpperBound(-1);
		}
	}*/
	
	/**
	 * Handles collections of objects
	 * @param classifierName the name of the type of a member
	 * @param e the reference to the type of this member
	 * Visiting lists is pretty straightforward (visitor)
	 * Maps have no direct mapping to ECore metaclasses:
	 * Mapping to EMF-style declarations of Maps
	 */
	private void visitCollection(String classifierName, ClassifierReference e){
		if (collections_types.contains(classifierName)){
			// Handler for Java Maps
			if (classifierName.equals("java.util.Map")){
				EClass m = EcoreFactory.eINSTANCE.createEClass();
				// Map with generic types
				if (e.getTypeArguments().size() != 0){
					// getting generic types
					QualifiedTypeArgument arg = ((QualifiedTypeArgument)e.getTypeArguments().get(0));
					QualifiedTypeArgument arg2 = ((QualifiedTypeArgument)e.getTypeArguments().get(1));
					String a = getName(((NamespaceClassifierReference)arg.getType()).getClassifierReferences().get(0).getTarget());
					String a2 = getName(((NamespaceClassifierReference)arg2.getType()).getClassifierReferences().get(0).getTarget());
					// lookup generic types
					EClassifier key = getType(arg);
					EClassifier value = getType(arg2);
					// Gives a name and stores the new map
					m.setName(a+"To"+a2);
					m = addMap(m,key,value);
				}
				// raw map => Map<Object,Object>
				else {
					m.setName("ObjectToObject");
					m = addMap(m,null,null);
				}
				((EReference)lastElement).setContainment(true);
				lastElement.setEType(m);
			}
			else{
				// Handler for Java and ECore Lists
				if (e.getTypeArguments().size() != 0){
					QualifiedTypeArgument arg = ((QualifiedTypeArgument)e.getTypeArguments().get(0));
					this.accept2(arg.getType());
				}
				// raw list
				else {
					EDataType dt = addDatatype(primitive_types.get(OBJECT), OBJECT);
					lastElement.setEType(dt);
				}
				//Lists are ordered, Collections are not
				if(classifierName.equals("java.util.List")||
						classifierName.equals("java.util.ArrayList")||
						classifierName.equals("org.eclipse.emf.common.util.EList"))
					lastElement.setOrdered(true);
				else
					lastElement.setOrdered(false);
			}
			lastElement.setUpperBound(-1);
		}
	}
	
	/**
	 * Retrieves type of a generic type from a List/Map
	 * @param arg structure that references the generic type
	 * @return an EClass or a EDataType that already exists
	 * or a EDataType for Object
	 */
	private EClassifier getType(QualifiedTypeArgument arg) {
		String typeName = getClassifierQualifiedName(((NamespaceClassifierReference)arg.getType()).getClassifierReferences().get(0).getTarget());
		if (classes.containsKey(typeName)){
			return classes.get(typeName);
		}
		else {
			if (primitive_types.containsKey(typeName)){
				return addDatatype(primitive_types.get(typeName), typeName);
			}
		}
		return addDatatype(primitive_types.get(OBJECT),OBJECT);
	}

	/**
	 * Checks if an attribute already exist in a superclass of c
	 * @param c the current class
	 * @param f the attribute of the class
	 * @return true if the attribute already exist, false otherwise
	 */
	boolean attributeExistsinSuperClass(EClass c, Field f){
		boolean exists = false;
		if (c.getEStructuralFeature(getName(f)) != null){
			return true;
		}
		else{
			for (EClass cl : c.getESuperTypes()) {
				if (cl.getESuperTypes() != null)
					exists = attributeExistsinSuperClass(cl,f);
			}
		}
		return exists;
	}
	
	/**
	 * Adds a datatype to the list of DataTypes of the Ecore model
	 * @param dt datatype to add
	 * @return dt if the dt does not exist yet, or the existing datatype otherwise
	 */
	private EDataType addDatatype(String dt_name, String dt_icn) {
		EDataType datatype = datatypes.get(dt_name);
		if(datatype == null){
			datatype = EcoreFactory.eINSTANCE.createEDataType();
			datatype.setInstanceClassName(dt_icn);
			datatype.setName(dt_name);
			lastPackage.getEClassifiers().add(datatype);
			datatypes.put(datatype.getName(),datatype);
		}
		return datatype;
	}
	
	/**
	 * Adds a map to the list of Maps (special EClasses) of the Ecore model
	 * @param m map to add
	 * @return m if the map does not exist yet, or the existing map otherwise
	 */
	private EClass addMap(EClass m, EClassifier dt_key, EClassifier dt_value) {
		EClass map = classes.get(m.getName());
		EClassifier dt_k = dt_key;
		EClassifier dt_v = dt_value;
		if(map == null){
			EStructuralFeature key = null;
			EStructuralFeature value = null;
			if (dt_key == null || dt_value == null){ 
				/*dt_k = EcoreFactoryImpl.eINSTANCE.createEDataType();
				dt_k.setName(primitive_types.get(OBJECT));
				dt_k.setInstanceClassName(OBJECT);*/
				dt_k = addDatatype(primitive_types.get(OBJECT),OBJECT);
				dt_v = addDatatype(primitive_types.get(OBJECT),OBJECT);
				key = EcoreFactory.eINSTANCE.createEAttribute();
				value = EcoreFactory.eINSTANCE.createEAttribute();
			}
			else{
				if (dt_k instanceof EClass) {
					key = EcoreFactory.eINSTANCE.createEReference();
				} else {
					key = EcoreFactory.eINSTANCE.createEAttribute();
				}
				if (dt_v instanceof EClass) {
					value = EcoreFactory.eINSTANCE.createEReference();
				} else {
					value = EcoreFactory.eINSTANCE.createEAttribute();
				}
			}
			key.setName("key");
			value.setName("value");
			key.setEType(dt_k);
			value.setEType(dt_v);
			m.setInstanceClassName("java.util.Map$Entry");
			m.getEStructuralFeatures().add(key);
			m.getEStructuralFeatures().add(value);
			lastPackage.getEClassifiers().add(m);
			classes.put(m.getName(),m);
		}
		else
			m = map;
		return m;
	}
	
	/**
	 * Gets the name of a NamedElement from the Java language
	 * @param n the element
	 * @return the name of the element, empty string if a problem occurs
	 */
	String getName(NamedElement n){
		if (n.getName() != null)
			return ((org.emftext.language.java.commons.impl.NameImpl) n.getName()).getValue();
		else
			return "";
	}
	
	/**
	 * Gets the qualified name of a Classifier object
	 * @param o a Classifier object
	 * @return the full qualified name of o
	 */
	String getClassifierQualifiedName(Classifier o){
		String packagename = "";
		if (o.eContainer() instanceof CompilationUnit)
		for (String s :((CompilationUnit)o.eContainer()).getNamespaces())
			packagename = packagename + s + ".";
		else if(o.eContainer() instanceof Classifier)
			packagename=getClassifierQualifiedName((Classifier) o.eContainer());
			
		return packagename+getName(o);
	}
	
	/**
	 * Gets the qualified name of a Package object
	 * @param o a CompilationUnit object
	 * @return the full qualified name of o
	 */
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
	
	/**
	 * Gets the qualified name of a Field from the Java language
	 * @param f the field
	 * @return the full qualified name of the Class that contains the Field
	 * concatenated with the Field name
	 */
	String getFieldQualifiedName(Field f){
		String name = getClassifierQualifiedName((ConcreteClassifier)f.getContainer());
		return name+"."+getName(f);
	}
	
	/**
	 * Gets the namespace of a CompilationUnit
	 * @param c a CompilationUnit
	 * @return the namespace of a CompilationUnit
	 */
	String getCompilationUnitNamespace(CompilationUnit c){
		String name = "";
		for (String s : c.getNamespaces()) {
			name += s;
		}
		return name;
	}
}
