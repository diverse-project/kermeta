package org.kermeta.java.jamoppc.ecore;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.ETypedElement;
import org.eclipse.emf.ecore.impl.EcoreFactoryImpl;
import org.emftext.language.java.classifiers.Class;
import org.emftext.language.java.classifiers.Classifier;
import org.emftext.language.java.classifiers.ConcreteClassifier;
import org.emftext.language.java.classifiers.Enumeration;
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

public class Java2ECore extends AbstractVisitor {

	CompilationUnit currentCompilationUnit;
	EPackage root;
	EPackage lastPackage = root;
	EClass lastclass;
	ETypedElement lastElement;
	EOperation lastOperation;
	private Map<String,EPackage> packages= new HashMap<String,EPackage>();
	private Map<String,EClass> classes = new HashMap<String,EClass>();
	private Map<String,EAttribute> attributes = new HashMap<String,EAttribute>();
	private Map<String,EDataType> datatypes = new HashMap<String,EDataType>();
	private Map<String,EEnum> enumerations = new HashMap<String,EEnum>();
	private Map<String,java.lang.Boolean> hasSuperClass = new HashMap<String,java.lang.Boolean>();
	public Map<String,String> superclasses = new HashMap<String,String>();
	private int iparam = 0;
	public Java2ECore(EPackage r){
		this.root = r;
		lastPackage = root;
	}
	
	@Override
	public String visitCompilationUnit0(CompilationUnit e) {
		currentCompilationUnit = e;
		lastPackage = root;
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
		for (EObject c : e.getClassifiers())
			this.accept0(c);
		return "";
	}
	
	@Override
	public String visitClass0(Class e){
		if (classes.get(getClassifierQualifiedName(e)) == null){
			EClass cl = EcoreFactoryImpl.eINSTANCE.createEClass();
			cl.setName(getName(e));
			if (!getName(e).equals("Object")){
				if (e.getExtends() != null){
					superclasses.put(getClassifierQualifiedName(e),this.accept0(e.getExtends()));
					
				}
				else
					superclasses.put(getClassifierQualifiedName(e), null);
				/*for (EObject o : e.getImplements()){
					this.accept0(o);
				}*/
			}
			classes.put(getClassifierQualifiedName(e), cl);
			if (lastPackage != null)
				lastPackage.getEClassifiers().add(cl);
			else
				root.getEClassifiers().add(cl);
			// TODO uri
		}
		return getClassifierQualifiedName(e);
	}
	
	@Override
	public String visitInterface0(Interface e){
		EClass cl = EcoreFactoryImpl.eINSTANCE.createEClass();
		cl.setName(getName(e));
		cl.setInterface(true);
		lastclass = cl;
		for (EObject o: e.getExtends()){
			this.accept0(o);
		}
		/*for (EObject a : e.getMembers()) {
			this.accept0(a);
		}*/
		classes.put(getClassifierQualifiedName(e), cl);
		if (lastPackage != null)
			lastPackage.getEClassifiers().add(cl);
		else
			root.getEClassifiers().add(cl);
		// TODO uri
		return "";
	}
	
	@Override
	public String visitNameClassifierReference0(NamespaceClassifierReference e) {
		return this.accept0(e.getClassifierReferences().get(0));
	}
	
	@Override
	public String visitClassifierReference0(ClassifierReference e) {
		return this.accept0(e.getTarget());
		//String classifierName = getClassifierQualifiedName(e.getTarget());
		//visitCollectionClassifierReference(classifierName,e);
		/*if (classes.containsKey(classifierName))
			lastclass.getESuperTypes().add(classes.get(classifierName));*/
	}
	
	@Override
	public String visitField0(Field e) {
		//System.out.println(getFieldQualifiedName(e)+" "+attributeExistsinSuperClass(lastclass,(Field)e));
		if(!attributeExistsinSuperClass(lastclass,(Field)e)){
			EAttribute attr = EcoreFactoryImpl.eINSTANCE.createEAttribute();
			attr.setName(getName(e).replace("$", ""));
			attributes.put(getFieldQualifiedName(e),attr);
			lastElement = attr;
			//this.accept0(e.getType());
			lastclass.getEStructuralFeatures().add(attr);
		}
		return "";
	}

	@Override
	public void visitCompilationUnit(CompilationUnit e) {
		currentCompilationUnit = e;
		lastPackage = root;
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
		for (EObject c : e.getClassifiers())
			this.accept(c);

	}

	/*@Override
	public void visitClassifier(Classifier e) {
		if (classes.get(getClassifierQualifiedName(e)) == null){
			EClass cl = EcoreFactoryImpl.eINSTANCE.createEClass();
			cl.setName(getName(e));
			if (e instanceof Interface)
				cl.setInterface(true);
			lastclass = cl;
			classes.put(getClassifierQualifiedName(e), cl);
			if (lastPackage != null)
				lastPackage.getEClassifiers().add(cl);
			else
				root.getEClassifiers().add(cl);
		}
	}*/
	
	@Override
	public void visitClass(Class e){
		EClass cl = EcoreFactoryImpl.eINSTANCE.createEClass();
		cl.setName(getName(e));
		lastclass = cl;
		classes.put(getClassifierQualifiedName(e), cl);
		if (lastPackage != null)
			lastPackage.getEClassifiers().add(cl);
		else
			root.getEClassifiers().add(cl);
		// TODO uri
	}
	
	@Override
	public void visitInterface(Interface e){
		EClass cl = EcoreFactoryImpl.eINSTANCE.createEClass();
		cl.setName(getName(e));
		cl.setInterface(true);
		lastclass = cl;
		classes.put(getClassifierQualifiedName(e), cl);
		if (lastPackage != null)
			lastPackage.getEClassifiers().add(cl);
		else
			root.getEClassifiers().add(cl);
		// TODO uri
	}
	
	@Override
	public void visitEnumeration(Enumeration e) {
		String enumName = getClassifierQualifiedName(e);
		if (!enumerations.containsKey(enumName)){
			EEnum enu = EcoreFactoryImpl.eINSTANCE.createEEnum();
			enu.setName(getName(e));
			enumerations.put(enumName, enu);
			lastPackage.getEClassifiers().add(enu);
			for (EObject l : e.getMembers()) {
				this.accept(l);
			}
		}
	}
	
	// 2nd pass - hierarchy handling
	
	
	
	@Override
	public void visitCompilationUnit2(CompilationUnit e) {
		currentCompilationUnit = e;
		lastPackage = packages.get(getPackageQualifiedName(e));
			for (EObject c : e.getClassifiers())
				this.accept2(c);
	}
	
	@Override
	public void visitClass2(Class e){
		lastclass = classes.get(getClassifierQualifiedName(e));
		if (superclasses.get(getClassifierQualifiedName(e))==null){
			System.out.println(getClassifierQualifiedName(e));
			for (EObject o : e.getMembers()) {
				this.accept2(o);
			}
		}
	}
	
	@Override
	public void visitInterface2(Interface e){
		lastclass = classes.get(getClassifierQualifiedName(e));
	}
	
	@Override
	public void visitField2(Field e) {
		//if (!attributeExistsinSuperClass(lastclass,e)){
			EAttribute attr = EcoreFactoryImpl.eINSTANCE.createEAttribute();
			attr.setName(getName(e).replace("$", ""));
			attributes.put(getFieldQualifiedName(e),attr);
			lastclass.getEStructuralFeatures().add(attr);
		//}
	}
	
	@Override
	public void visitNameClassifierReference2(NamespaceClassifierReference e) {
		this.accept2(e.getClassifierReferences().get(0));
	}
	
	@Override
	public void visitClassifierReference2(ClassifierReference e) {
		/*String classifierName = getClassifierQualifiedName(e.getTarget());
		visitCollectionClassifierReference(classifierName,e);
		if (classes.containsKey(classifierName))
			lastclass.getESuperTypes().add(classes.get(classifierName));*/
	}
	
	private void visitCollectionClassifierReference(String classifierName, ClassifierReference e){
		if (classifierName.equals("org.eclipse.emf.common.util.EList")){
			QualifiedTypeArgument arg = ((QualifiedTypeArgument)e.getTypeArguments().get(0));
			NamespaceClassifierReference ref = (NamespaceClassifierReference)arg.getType();
			ClassifierReference cref = ref.getClassifierReferences().get(0);
			this.accept(cref);
			lastElement.setUpperBound(-1);
		}
		if (classifierName.equals("java.util.Collection")){
			QualifiedTypeArgument arg = ((QualifiedTypeArgument)e.getTypeArguments().get(0));
			NamespaceClassifierReference ref = (NamespaceClassifierReference)arg.getType();
			ClassifierReference cref = ref.getClassifierReferences().get(0);
			this.accept(cref);
			lastElement.setUpperBound(-1);
		}
	}
	
	/*@Override
	public void visitInterface2(Interface e){
		lastclass = classes.get(getClassifierQualifiedName(e));
		for (EObject f : e.getExtends())
			this.accept2(f);
	}
	*/
	
	//	3rd pass
	
	@Override
	public void visitCompilationUnit3(CompilationUnit e) {
		currentCompilationUnit = e;
		lastPackage = packages.get(getPackageQualifiedName(e));
		for (EObject c : e.getClassifiers()){
			//if (hasSuperClass.get(getClassifierQualifiedName((Classifier)c)) == false)
				this.accept3(c);
		}
	}
	
	@Override
	public void visitClass3(Class e){
		lastclass = classes.get(getClassifierQualifiedName(e));
		for (EObject f : e.getMembers()){
			this.accept3(f);
		}
	}
	
	@Override
	public void visitInterface3(Interface e){
		lastclass = classes.get(getClassifierQualifiedName(e));
		for (EObject f : e.getMembers()){
			this.accept3(f);
		}
	}
	
	@Override
	public void visitField3(Field e) {
		System.out.println(getFieldQualifiedName(e)+" "+attributeExistsinSuperClass(lastclass,(Field)e));
		if(!attributeExistsinSuperClass(lastclass,(Field)e)){
			EAttribute attr = EcoreFactoryImpl.eINSTANCE.createEAttribute();
			attr.setName(getName(e).replace("$", ""));
			attributes.put(getFieldQualifiedName(e),attr);
			lastElement = attr;
			this.accept3(e.getType());
			lastclass.getEStructuralFeatures().add(attr);
		}
	}
	
	@Override
	public void visitNameClassifierReference3(NamespaceClassifierReference e) {
		this.accept3(e.getClassifierReferences().get(0));
	}
	
	@Override
	public void visitClassifierReference3(ClassifierReference e) {
		//System.out.println("");
		String classifierName = getClassifierQualifiedName(e.getTarget());
		//System.out.println("classifierName "+classifierName+" : "+e.getTarget());
		visitCollectionClassifierReference(classifierName,e);
		if (classifierName.equals("java.lang.String")){
			EDataType dt = EcoreFactoryImpl.eINSTANCE.createEDataType();
			dt.setName("EString");
			dt.setInstanceClassName("java.lang.String");
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

	/*@Override
	public void visitClassMethod(ClassMethod e) {
		iparam = 0;
		if (getPackageQualifiedName((CompilationUnit)e.eContainer().eContainer()).startsWith("net")){
		EOperation op = EcoreFactoryImpl.eINSTANCE.createEOperation();
		op.setName(getName(e));
		lastElement = op;
		this.accept(e.getType());
		lastclass.getEOperations().add(op);
		lastOperation = op;
		}
	}

	@Override
	public void visitParameter(Parameter e) {
		EParameter p = EcoreFactoryImpl.eINSTANCE.createEParameter();
		//System.out.println(((Name)e.getName()));
		p.setName("param"+iparam);
		lastElement = p;
		//System.out.println("##########origin "+e.getType());
		this.accept(e.getType());
		//System.out.println("##########target "+p.getEType().getName());
		lastOperation.getEParameters().add(p);
	}*/

	@Override
	public void visitPrimitiveType3(PrimitiveType e) {
		// TODO primitives types have been changed to cope with Kermeta primitives types
		EDataType dt = EcoreFactoryImpl.eINSTANCE.createEDataType();
		if (e instanceof Boolean){
			dt.setName("EBoolean");
			dt.setInstanceClassName("java.lang.Boolean");
		}
		//lastElement.setEType(EcorePackageImpl.eINSTANCE.getEBoolean());
		else if (e instanceof org.emftext.language.java.types.Byte){
			dt.setName("EInt");
			dt.setInstanceClassName("java.lang.Integer");
		}
		else if (e instanceof Char){
			dt.setName("EChar");
			dt.setInstanceClassName("java.lang.Character");
		}
		else if (e instanceof Double){
			dt.setName("EDouble");
			dt.setInstanceClassName("java.lang.Double");
		}
		else if (e instanceof org.emftext.language.java.types.Float){
			dt.setName("EFloat");
			dt.setInstanceClassName("java.lang.Float");
		}
		else if (e instanceof Int){
			dt.setName("EInt");
			dt.setInstanceClassName("java.lang.Integer");
		}
		else if (e instanceof Long){
			dt.setName("EInt");
			dt.setInstanceClassName("java.lang.Integer");
		}
		else if (e instanceof Short){
			dt.setName("EInt");
			dt.setInstanceClassName("java.lang.Integer");
		}
		else if (e instanceof Void){
			dt.setName("EVoid");
			dt.setInstanceClassName("java.lang.Void");
		}
		dt = addDatatype(dt);
		lastElement.setEType(dt);
	}
	
	// 4th pass
	@Override
	public void visitCompilationUnit4(CompilationUnit e) {
		currentCompilationUnit = e;
		lastPackage = packages.get(getPackageQualifiedName(e));
		for (EObject c : e.getClassifiers()){
			//if (hasSuperClass.get(getClassifierQualifiedName((Classifier)c)) == true)
				this.accept4(c);
		}
	}
	
	@Override
	public void visitClass4(Class e){
		lastclass = classes.get(getClassifierQualifiedName(e));
		for (EObject f : e.getMembers()){
			this.accept4(f);
		}
	}
	
	@Override
	public void visitInterface4(Interface e){
		lastclass = classes.get(getClassifierQualifiedName(e));
		for (EObject f : e.getMembers()){
			this.accept4(f);
		}
	}
	
	@Override
	public void visitField4(Field e) {
		System.out.println(getFieldQualifiedName(e)+" "+attributeExistsinSuperClass(lastclass,(Field)e));
		if(!attributeExistsinSuperClass(lastclass,(Field)e)){
			EAttribute attr = EcoreFactoryImpl.eINSTANCE.createEAttribute();
			attr.setName(getName(e).replace("$", ""));
			attributes.put(getFieldQualifiedName(e),attr);
			lastElement = attr;
			this.accept4(e.getType());
			lastclass.getEStructuralFeatures().add(attr);
		}
		else {
			System.out.println("Removing "+getFieldQualifiedName(e));
			attributes.remove(e);
			lastclass.getEStructuralFeatures().remove(e);
		}
	}

	/**
	 * @param dt
	 * @return
	 */
	private EDataType addDatatype(EDataType dt) {
		EDataType datatype = datatypes.get(dt.getName());
		if(datatype == null){
			root.getEClassifiers().add(dt);
			datatypes.put(dt.getName(),dt);
		}
		else
			dt = datatype;
		return dt;
	}
	
	/*@Override
	public void visitClassifier2(Classifier e) {
		lastclass = classes.get(getClassifierQualifiedName(e));
		for (EObject f : ((ConcreteClassifier)e).getMembers())
			this.accept2(f);
	}
	
	@Override
	public void visitClass3(org.emftext.language.java.classifiers.Class e){
		//System.out.println("Visiting class "+e.getName());
		lastclass = classes.get(getClassifierQualifiedName(e));
		this.accept2(e.getExtends());
		for (EObject f : e.getMembers()){
			if (f instanceof Field){
				if (!attributeExistsinSuperClass(lastclass,(Field)f)){
					if(attributes.get(getFieldQualifiedName((Field)f)) == null)
						this.accept(f);
					this.accept2(f);
				}
			}
			else
				this.accept2(f);
		}
		for (EObject f : e.getImplements())
			this.accept2(f);
	}
	
	@Override
	public void visitInterface3(Interface e){
		//System.out.println("Visiting interface "+e.getName());
		lastclass = classes.get(getClassifierQualifiedName(e));
		for (EObject f : e.getExtends())
			this.accept2(f);
		for (EObject f : e.getMembers()){
			if (f instanceof Field){
				if (!attributeExistsinSuperClass(lastclass,(Field)f)){
					if(attributes.get(getFieldQualifiedName((Field)f)) == null)
						this.accept(f);
					this.accept2(f);
				}
			}
			else
				this.accept2(f);
		}
	}*/
	
	/*@Override
	public void visitField2(Field e) {
		lastElement = attributes.get(getFieldQualifiedName(e));
		// TODO should be able to generalize the name of the package to isolate
		if (getPackageQualifiedName((CompilationUnit)e.eContainer().eContainer()).startsWith("net"))
		this.accept(e.getType());
	}
	
	@Override
	public void visitNameClassifierReference2(NamespaceClassifierReference e) {
		this.accept2(e.getClassifierReferences().get(0));
	}*/
	
	String getClassifierQualifiedName(Classifier o){
		String packagename = "";
		//System.out.println(o);
		//System.out.println("o.container(): "+o.eContainer());
		if (o.eContainer() instanceof CompilationUnit)
		for (String s :((CompilationUnit)o.eContainer()).getNamespaces())
			packagename = packagename + s + ".";
		else if(o.eContainer() instanceof Classifier)
			packagename=getClassifierQualifiedName((Classifier) o.eContainer());
			
		return packagename+getName(o);
	}
	
	String getName(NamedElement n){
		if (n.getName() != null)
			return ((org.emftext.language.java.commons.impl.NameImpl) n.getName()).getValue();
		else
			return "";
	}
	
	String getFieldQualifiedName(Field f){
		String name = getClassifierQualifiedName((ConcreteClassifier)f.getContainer());
		return name+"."+getName(f);
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

	/*boolean attributeExistsinSuperClass2(Class c, Field f){
		boolean exists = false;
		if (c.getExtends() != null){
			//System.out.println(c.getExtends().toString());
			if (c.getExtends() instanceof NamespaceClassifierReference)
				exists = attributeExistsinSuperClass2((Class)((NamespaceClassifierReference)c.getExtends()).getClassifierReferences().get(0).getTarget(), f);
			else {
				if (c.getExtends() instanceof ClassifierReference)
					exists = attributeExistsinSuperClass2((Class)((ClassifierReference)c.getExtends()).getTarget(), f);
			}
		}
		else
			for (EObject m : c.getMembers()) {
				if(m instanceof Field) {
					if (getName((Field)m).equals(getName((Field)f))){
						exists = true;
						break;
					}
				}
			}
		return exists;
	}*/
	
	boolean attributeExistsinSuperClass(EClass c, Field f){
		//System.out.println("Class "+c.getName()+"."+getName(f));
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
}
