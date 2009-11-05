package org.kermeta.compil.runtime;

import java.util.ArrayList;
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

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.impl.ExtensibleURIConverterImpl;
import org.kermeta.compil.runtime.helper.persistence.KmReflectionHelper;

/**
 * @generated
 */
public class ExecutionContext {

	private String _modelKMURI = "config/StructureCompiler.km";

	private List<Object> _modelKM;

	public ClassLoader _classLoader;

	public ClassLoader getClassLoader() {
		return _classLoader;
	}

	/**
	 * @generated
	 */
	private ExecutionContext() {
		//Initialize the persistence mapping
		//Maybe, we can comment the following line
		PersistenceMapping.getInstance();

		initValueTypes();
		_classLoader = ExecutionContext.class.getClassLoader();
	}

	private static Map<String, String> value_types = new HashMap<String, String>();

	private Hashtable<String, kermeta.language.structure.Class> hashtable_classes = new Hashtable<String, kermeta.language.structure.Class>();

	public Hashtable<String, java.lang.Class> hashtable_java_classes = new Hashtable<String, java.lang.Class>();

	static private ExecutionContext _instance;

	/**
	 * @generated
	 */
	public static ExecutionContext getInstance() {
		if (_instance == null)
			_instance = new ExecutionContext();
		return _instance;
	}

	/**
	 * Used for pre and post conditions
	 * @generated
	 */
	public java.lang.Boolean mustBeChecked(String id) {
		return false;
	}

	/**
	 * @generated
	 */
	private static void initValueTypes() {
		value_types.put("java.lang.String", "kermeta.standard.String");
		value_types.put("java.lang.Integer", "kermeta.standard.Integer");
		value_types.put("java.lang.Boolean", "kermeta.standard.Boolean");
		value_types.put("java.lang.Character", "kermeta.standard.Character");
		value_types.put("java.lang.Double", "kermeta.standard.Real");
	}

	private static URI getWorkspaceLocationAccordingToClassLocation() {
		String local_path = ExecutionContext.class.getProtectionDomain()
				.getCodeSource().getLocation().toExternalForm();
		local_path = local_path.replace("/bin/", "");
		int index = local_path.lastIndexOf("/");

		local_path = local_path.substring(0, index + 1);
		return URI.createURI(local_path);
	}

	private static URI getProjectLocationAccordingToClassLocation() {
		String local_path = ExecutionContext.class.getProtectionDomain()
				.getCodeSource().getLocation().toExternalForm();

		if (local_path.endsWith(".jar")) {
			local_path = "jar:" + local_path + "!/";
		} else {
			local_path = local_path.replace("bin/", "");
		}
		return URI.createURI(local_path);
	}

	public static final URI URI_PLATFORM_RESOURCE = URI
			.createURI("platform:/resource/");
	public static final URI URI_PLATFORM_PLUGIN = URI
			.createURI("platform:/plugin/");

	public static void setDefaultUriMap() {
		//if the uri map is not setted then the *.class location is setted as URI_PLATFORM_RESOURCE and URI_PLATFORM_PLUGIN
		if (!ExtensibleURIConverterImpl.URI_MAP
				.containsKey(URI_PLATFORM_RESOURCE)) {
			ExtensibleURIConverterImpl.URI_MAP.put(URI_PLATFORM_RESOURCE,
					getWorkspaceLocationAccordingToClassLocation());
		}
		if (!ExtensibleURIConverterImpl.URI_MAP
				.containsKey(URI_PLATFORM_PLUGIN)) {
			ExtensibleURIConverterImpl.URI_MAP.put(URI_PLATFORM_PLUGIN,
					getWorkspaceLocationAccordingToClassLocation());
		}
	}

	/**
	 * @generated
	 */
	public void lazyInitialize() {
		if (_modelKM == null) {

			// the uri map is not setted in deployed mode
			if (!Platform.isRunning()) {
				ExecutionContext.setDefaultUriMap();
			}

			System.out
					.println("Beginning of the initialization of the reflection...");
			Repository repository = PersistenceFactory.eINSTANCE
					.createEMFRepository();

			String local_path = ExecutionContext
					.getProjectLocationAccordingToClassLocation()
					+ _modelKMURI;

			Resource resource = repository.createResource(local_path,
					"http://www.kermeta.org/kermeta/1_2_0//kermeta");
			KmReflectionHelper.load(resource);
			_modelKM = resource.getValues();

			System.out
					.println("... end of the initialization of the reflection");
		}
	}

	/**
	 * @generated
	 */
	public Class getMetaClass(String javaQualifiedName) {

		lazyInitialize();

		// Optimization
		if (hashtable_classes.containsKey(javaQualifiedName)) {
			return hashtable_classes.get(javaQualifiedName);
		}

		if (javaQualifiedName.contains("<")) {
			String[] tmp_javaQualifiedName = javaQualifiedName.split("<");
			javaQualifiedName = tmp_javaQualifiedName[0];
		}

		// Optimization
		if (hashtable_classes.containsKey(javaQualifiedName)) {
			return hashtable_classes.get(javaQualifiedName);
		}

		javaQualifiedName = javaQualifiedName.replace("impl.", "");

		if (javaQualifiedName.endsWith("Impl")) {
			javaQualifiedName = javaQualifiedName.replace("Impl", "");
		}

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

	/**
	 * @generated
	 */
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

	/**
	 * @generated
	 */
	private Package getPackage(Package p, String packageName) {
		for (Package subPackage : p.getNestedPackage())
			if (subPackage.getName().equals(packageName))
				return subPackage;
		return null;
	}

	/**
	 * @generated
	 */
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

	private static List<String> java_keywords = null;

	public static List<String> getJavaKeywords() {
		synchronized (URI_PLATFORM_PLUGIN) {
			if (java_keywords != null) {
				return java_keywords;
			}

			java_keywords = new ArrayList<String>();

			java_keywords.add("abstract");
			java_keywords.add("continue");
			java_keywords.add("for");
			java_keywords.add("new");
			java_keywords.add("switch");
			java_keywords.add("assert");
			java_keywords.add("default");
			java_keywords.add("goto");
			java_keywords.add("package");
			java_keywords.add("synchronized");
			java_keywords.add("boolean");
			java_keywords.add("do");
			java_keywords.add("if");
			java_keywords.add("private");
			java_keywords.add("this");
			java_keywords.add("break");
			java_keywords.add("double");
			java_keywords.add("implements");
			java_keywords.add("protected");
			java_keywords.add("throw");
			java_keywords.add("byte");
			java_keywords.add("else");
			java_keywords.add("import");
			java_keywords.add("public");
			java_keywords.add("throws");
			java_keywords.add("case");
			java_keywords.add("enum");
			java_keywords.add("instanceof");
			java_keywords.add("return");
			java_keywords.add("transient");
			java_keywords.add("catch");
			java_keywords.add("extends");
			java_keywords.add("int");
			java_keywords.add("short");
			java_keywords.add("try");
			java_keywords.add("char");
			java_keywords.add("final");
			java_keywords.add("interface");
			java_keywords.add("static");
			java_keywords.add("void");
			java_keywords.add("class");
			java_keywords.add("finally");
			java_keywords.add("long");
			java_keywords.add("strictfp");
			java_keywords.add("volatile");
			java_keywords.add("const");
			java_keywords.add("float");
			java_keywords.add("native");
			java_keywords.add("super");
			java_keywords.add("while");

			// To see
			java_keywords.add("true");
			java_keywords.add("false");
			java_keywords.add("null");

			// Specific to Kermeta
			java_keywords.add("result");
		}
		return java_keywords;
	}

}