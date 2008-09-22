package org.kermeta.compil.runtime;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

import kermeta.language.structure.Class;
import kermeta.language.structure.ClassDefinition;
import kermeta.language.structure.ModelingUnit;
import kermeta.language.structure.Object;
import kermeta.language.structure.Package;
import kermeta.language.structure.StructureFactory;
import kermeta.language.structure.TypeDefinition;
import kermeta.persistence.PersistenceFactory;
import kermeta.persistence.Repository;
import kermeta.persistence.Resource;

import org.kermeta.compil.runtime.helper.persistence.KmReflectionHelper;

public class ExecutionContext

{

	private String _modelKMURI = "platform:/resource/org.kermeta.structurecompiler.compiled/config/StructureCompiler.km";

	private List<Object> _modelKM;

	private ExecutionContext() {
		initValueTypes();
	}

	private static Map<String, String> value_types = new HashMap<String, String>();

	private Hashtable<String, kermeta.language.structure.Class> hashtable_classes = new Hashtable<String, Class>();

	static private ExecutionContext _instance;

	static public ExecutionContext getInstance() {
		if (_instance == null)
			_instance = new ExecutionContext();
		return _instance;
	}

	private static void initValueTypes() {
		value_types.put("java.lang.String", "kermeta.standard.String");
		value_types.put("java.lang.Integer", "kermeta.standard.Integer");
		value_types.put("java.lang.Boolean", "kermeta.standard.Boolean");
		value_types.put("java.lang.Character", "kermeta.standard.Character");
		value_types.put("java.lang.Double", "kermeta.standard.Real");
	}

	public void lazyInitialize() {
		if (_modelKM == null) {
			System.out
					.println("Beginning of the initialization of the reflection...");
			Repository repository = PersistenceFactory.eINSTANCE
					.createEMFRepository();
			Resource resource = repository.createResource(_modelKMURI,
					"http://www.kermeta.org/kermeta/1_2_0//kermeta");
			KmReflectionHelper.load(resource);
			_modelKM = resource.getValues();

			System.out
					.println("... end of the initialization of the reflection");
		}
	}

	public Class getMetaClass(String javaQualifiedName) {

		lazyInitialize();

		// Optimization
		if (hashtable_classes.containsKey(javaQualifiedName)) {
			return hashtable_classes.get(javaQualifiedName);
		}

		javaQualifiedName = javaQualifiedName.replace("impl.", "").replace(
				"Impl", "");

		// Optimization
		if (hashtable_classes.containsKey(javaQualifiedName)) {
			return hashtable_classes.get(javaQualifiedName);
		}

		if (value_types.containsKey(javaQualifiedName)) {
			javaQualifiedName = value_types.get(javaQualifiedName);
		}

		// Optimization
		if (hashtable_classes.containsKey(javaQualifiedName)) {
			return hashtable_classes.get(javaQualifiedName);
		}

		String[] strings = javaQualifiedName.split("\\.");
		int size = strings.length - 1;
		Package currentPackage = null;
		// size - 1 because the last last segment is Impl
		for (int i = 0; i < size; i++) {
			if (i == 0)
				currentPackage = getPackage(strings[i]);
			else if (currentPackage != null)
				currentPackage = getPackage(currentPackage, strings[i]);
			else
				break;
		}
		if (currentPackage != null) {
			ClassDefinition cd = getClassDefinition(currentPackage,
					strings[size]);
			Class c = StructureFactory.eINSTANCE.createClass();
			c.setTypeDefinition(cd);
			hashtable_classes.put(javaQualifiedName, c);
			return c;
		} else
			return null;
	}

	private Package getPackage(String packageName) {
		for (Object o : _modelKM) {
			if (o instanceof ModelingUnit) {
				ModelingUnit mu = (ModelingUnit) o;
				for (Package p : mu.getPackages())
					if (p.getName().equals(packageName))
						return p;
			}
		}
		return null;
	}

	private Package getPackage(Package p, String packageName) {
		for (Package subPackage : p.getNestedPackage())
			if (subPackage.getName().equals(packageName))
				return subPackage;
		return null;
	}

	private ClassDefinition getClassDefinition(Package p, String name) {
		for (TypeDefinition td : p.getOwnedTypeDefinition()) {
			if (td instanceof ClassDefinition) {
				ClassDefinition cd = (ClassDefinition) td;
				if (cd.getName().equals(name))
					return cd;
			}
		}
		return null;
	}

}