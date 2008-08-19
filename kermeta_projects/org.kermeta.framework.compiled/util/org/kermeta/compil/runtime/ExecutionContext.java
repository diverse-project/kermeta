package org.kermeta.compil.runtime;

import java.util.ArrayList;
import java.util.List;

import kermeta.language.structure.ClassDefinition;
import kermeta.language.structure.Class;
import kermeta.language.structure.ModelingUnit;
import kermeta.language.structure.Package;
import kermeta.language.structure.Object;
import kermeta.language.structure.StructureFactory;
import kermeta.language.structure.TypeDefinition;
import kermeta.persistence.PersistenceFactory;
import kermeta.persistence.Repository;
import kermeta.persistence.Resource;

public class ExecutionContext

{

	private String _modelKMURI = "platform:/resource/org.kermeta.framework.compiled/config/framework.km";

	private List<Object> _modelKM;

	private ExecutionContext() {
		initValueTypes();
	}

	private static List<String> value_types = new ArrayList<String>();

	private static void initValueTypes() {
		value_types.add("java.lang.String");
		value_types.add("java.lang.Integer");
		value_types.add("java.lang.Boolean");
		value_types.add("java.lang.Character");
		value_types.add("java.lang.Double");
	}

	public void lazyInitialize() {
		if (_modelKM == null) {
			System.out.println("Beginning of lazyInitialize...");
			Repository repository = PersistenceFactory.eINSTANCE
					.createEMFRepository();
			Resource resource = repository.createResource(_modelKMURI,
					"http://www.kermeta.org/kermeta/1_2_0//kermeta");
			resource.loadWithoutChecking();
			_modelKM = resource.getValues();
			System.out.println("... end of lazyInitialize");
		}
	}

	static private ExecutionContext _instance;

	static public ExecutionContext getInstance() {
		if (_instance == null)
			_instance = new ExecutionContext();
		return _instance;
	}

	public Class getMetaClass(String javaQualifiedName) {
		lazyInitialize();

		if (value_types.contains(javaQualifiedName)) {
			javaQualifiedName = "kermeta.language.structure.Object";
		}

		String[] strings = javaQualifiedName.split("\\.");
		int size = strings.length - 1;
		Package currentPackage = null;
		// size - 1 because the last last segment is Impl
		for (int i = 0; i < size - 1; i++) {
			if (i == 0)
				currentPackage = getPackage(strings[i]);
			else if (currentPackage != null)
				currentPackage = getPackage(currentPackage, strings[i]);
			else
				break;
		}
		if (currentPackage != null) {
			ClassDefinition cd = getClassDefinition(currentPackage,
					strings[size].replaceAll("Impl", ""));
			Class c = StructureFactory.eINSTANCE.createClass();
			c.setTypeDefinition(cd);
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
