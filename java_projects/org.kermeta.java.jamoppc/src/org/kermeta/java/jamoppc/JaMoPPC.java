package org.kermeta.java.jamoppc;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.emftext.language.java.JavaClasspath;
import org.emftext.language.java.JavaPackage;
import org.emftext.language.java.classifiers.Classifier;
import org.emftext.language.java.commons.Name;
import org.emftext.language.java.containers.CompilationUnit;
import org.emftext.language.java.resource.JavaSourceOrClassFileResourceFactoryImpl;
import org.emftext.language.java.resource.java.analysis.helper.JavaPostProcessor;
import org.emftext.language.primitive_types.Primitive_typesPackage;
import org.emftext.runtime.IOptions;

public class JaMoPPC {

	protected static ResourceSet rs = new ResourceSetImpl();

	public static void main(String[] args) throws IOException {
		if (args.length < 3) {
			System.out
					.println("Usage: jamoppc <source folder path> <target folder path> <jar file paths>*");
			return;
		}
		setUp();

		File srcFolder = new File(args[0]);
		System.out.println(srcFolder.getPath());
		if (!srcFolder.exists()) {
			System.out.println("not found: " + args[0]);
			return;
		}
		File outFolder = new File(args[1]);
		System.out.println(outFolder.getPath());
		JavaClasspath cp = JavaClasspath.get(rs);

		// register jar files
		for (int i = 3; i < args.length; i++) {
			System.out.println("jar path: "+args[i]);
			File jarPath = new File(args[i]);
			if (!jarPath.exists()) {
				System.out.println("not found: " + args[i]);
				return;
			}
			cp.registerClassifierJar(URI.createFileURI(jarPath
					.getCanonicalPath()));
		}

		// load all java files into resource set
		loadAllFilesInResourceSet(srcFolder, "java");

		resolveAllProxies();
		List<Resource> result = new ArrayList<Resource>();

		Resource xmiResource = rs.createResource(URI.createFileURI(outFolder
				.getCanonicalPath()
				+ "/" + args[2] + ".xmi"));

		for (Resource javaResource : new ArrayList<Resource>(rs.getResources())) {
			URI srcURI = javaResource.getURI();
			srcURI = rs.getURIConverter().normalize(srcURI);

			if (javaResource.getContents().size() != 0)
				xmiResource.getContents().addAll(javaResource.getContents());
		}
		result.add(xmiResource);
		
		// save the metamodels (schemas) for dynamic loading
		serializeMetamodel(outFolder);
		for (Resource xmiResource1 : result) {
			Map<Object, Object> options = new HashMap<Object, Object>();
			options.put(XMIResource.OPTION_SCHEMA_LOCATION, Boolean.TRUE);
			options.put(XMIResource.OPTION_PROCESS_DANGLING_HREF,
					XMIResource.OPTION_PROCESS_DANGLING_HREF_DISCARD);
			xmiResource1.save(options);
		}
		rs = new ResourceSetImpl();
	}

	static String getQualifiedName(Classifier o) {
		String packagename = "";
		if (o.eContainer() instanceof CompilationUnit)
			for (String s : ((CompilationUnit) o.eContainer()).getNamespaces())
				packagename = packagename + s + ".";
		else if (o.eContainer() instanceof Classifier)
			packagename = getQualifiedName((Classifier) o.eContainer());
		return packagename + ((Name) o.getName()).getValue();
	}

	protected static void setUp() {
		EPackage.Registry.INSTANCE.put("http://www.emftext.org/java",
				JavaPackage.eINSTANCE);
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(
				"java", new JavaSourceOrClassFileResourceFactoryImpl());
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(
				Resource.Factory.Registry.DEFAULT_EXTENSION,
				new XMIResourceFactoryImpl());
		rs.getLoadOptions().put(IOptions.RESOURCE_POSTPROCESSOR_PROVIDER,
				new JavaPostProcessor());

	}

	protected static void serializeMetamodel(File outFolder) throws IOException {
		URI outUri = URI.createFileURI(outFolder.getCanonicalPath());

		URI ptEcoreURI = outUri.appendSegment("primitive_types.ecore");
		Resource ptEcoreResource = rs.createResource(ptEcoreURI);
		ptEcoreResource.getContents().add(Primitive_typesPackage.eINSTANCE);

		URI javaEcoreURI = outUri.appendSegment("java.ecore");
		Resource javaEcoreResource = rs.createResource(javaEcoreURI);
		EList<EPackage> pp = JavaPackage.eINSTANCE.getESubpackages();
		javaEcoreResource.getContents().addAll(pp);
		ptEcoreResource.save(null);
		javaEcoreResource.save(null);
	}

	protected static void loadAllFilesInResourceSet(File startFolder,
			String extension) throws IOException {
		for (File member : startFolder.listFiles()) {
			if (member.isFile()) {
				if (member.getName().endsWith(extension))
					parseResource(member);
			}
			if (member.isDirectory()) {
				if (!member.getName().startsWith("."))
					loadAllFilesInResourceSet(member, extension);
			}
		}
	}

	protected static boolean resolveAllProxies() {
		boolean failure = false;
		String msg = "";

		for (Iterator<Notifier> i = rs.getAllContents(); i.hasNext();) {
			Notifier next = i.next();
			if (next instanceof EObject) {
				InternalEObject nextElement = (InternalEObject) next;
				for (EObject crElement : nextElement.eCrossReferences()) {
					crElement = EcoreUtil.resolve(crElement, rs);
					if (crElement.eIsProxy()) {
						msg += "\nCan not find referenced element in classpath: "
								+ ((InternalEObject) crElement).eProxyURI();
						failure = true;
					}
				}
			}
		}
		return !failure;
	}

	protected static void parseResource(File file) throws IOException {
		loadResource(file.getCanonicalPath());
	}

	protected static void parseResource(ZipFile file, ZipEntry entry)
			throws IOException {
		loadResource(URI.createURI("archive:file:///"
				+ new File(".").getAbsoluteFile().toURI().getRawPath()
				+ file.getName().replaceAll("\\\\", "/") + "!/"
				+ entry.getName()));
	}

	protected static void loadResource(String filePath) throws IOException {
		loadResource(URI.createFileURI(filePath));
	}

	protected static void loadResource(URI uri) throws IOException {
		rs.getResource(uri, true);
	}
}