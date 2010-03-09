package org.kermeta.java.jamoppc.ecore;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EcoreFactoryImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.emftext.language.java.JavaClasspath;
import org.emftext.language.java.JavaPackage;
import org.emftext.language.java.containers.CompilationUnit;
import org.emftext.language.java.resource.JavaSourceOrClassFileResourceFactoryImpl;
import org.emftext.language.java.resource.java.analysis.helper.JavaPostProcessor;
import org.emftext.runtime.IOptions;

public class Java2EcoreMain {
	public static void main(String[] args) throws IOException {
		setUp();
		JavaClasspath cp = JavaClasspath.get(rs);
		// TODO Jar path to be changed and loaded from the environment
		File jarPath = new File("/home/mclavreu/main_workspace/toto/lib/org.eclipse.emf.common_2.5.0.v200906151043.jar");
		File jarPath2 = new File("/home/mclavreu/main_workspace/toto/lib/mtep.jar");
	//	File jarPath2 = new File("/home/mclavreu/main_workspace_runtime/ical/lib/ical.jar");
		File jarPath3 = new File("/usr/lib/jvm/java-6-sun-1.6.0.15/jre/lib/rt.jar");
		
		File jarPath4 = new File("/home/mclavreu/main_workspace/toto/lib/xms.jar");
		cp.registerClassifierJar(URI.createFileURI(jarPath
				.getCanonicalPath()));
		cp.registerClassifierJar(URI.createFileURI(jarPath2
				.getCanonicalPath()));
		cp.registerClassifierJar(URI.createFileURI(jarPath3
			.getCanonicalPath()));
		cp.registerClassifierJar(URI.createFileURI(jarPath4
				.getCanonicalPath()));
		cp.registerStdLib();
		/* Used before in the demo*/
		//URI xmiuri = URI.createFileURI("/home/mclavreu/Desktop/eclipse-bundle-prototype/workspace/test_proto/models/xms/xms.xmi");
		URI xmiuri = URI.createFileURI("/home/mclavreu/Desktop/eclipse-bundle-prototype/workspace/lab2corporate/tmp/api1/api1.xmi");
		//System.out.println(args[0]);
		//URI xmiuri = URI.createFileURI(args[0]);
		XMIResource resource = (XMIResource) rs.getResource(xmiuri, true);
		
		Map<Object,Object> options = new HashMap<Object, Object>();
		options.put(XMIResource.OPTION_SCHEMA_LOCATION, Boolean.TRUE);
		options.put(XMIResource.OPTION_PROCESS_DANGLING_HREF, XMIResource.OPTION_PROCESS_DANGLING_HREF_DISCARD);
		resource.load(options);
		List<EObject> res = new ArrayList<EObject>();
		res.addAll(resource.getContents());
		//System.out.println("batard1");
		Collections.sort(res, new Comparator<EObject>() {

			//@Override
			public int compare(EObject o1, EObject o2) {
				StringBuffer p1 = new StringBuffer();
				StringBuffer p2 = new StringBuffer();
				for (String s : ((CompilationUnit)o1).getNamespaces()){
					p1.append(s);
					p1.append(".");
				}
				for (String s : ((CompilationUnit)o2).getNamespaces()){
					p2.append(s);
					p2.append(".");
				}
				
				 return p1.toString().compareTo(p2.toString());
			}
		});
		EPackage root = EcoreFactoryImpl.eINSTANCE.createEPackage();
		root.setName("root");
		//Java2ECore v = new Java2ECore(root);
		Java2Tree v = new Java2Tree(root);
		resolveAllProxies();
		for (EObject o : res){
			v.accept(o);
		}
		int index = 0;
		
		for (Tree<org.emftext.language.java.classifiers.Class> tree : v.hierarchy) {
			index += tree.getSize();
			System.out.println("hierarchy "+index);
			tree.toString();
		}
		System.out.println("total="+res.size()+" hierarchy elts="+index);
		EcoreUtil.resolveAll(rs);
		resolveAllProxies();
		for (Tree<org.emftext.language.java.classifiers.Class> tree : v.hierarchy) {
			v.accept2(tree);
		}
		/*for (String s : v.superclasses.keySet()) {
			System.out.println(s+" "+v.superclasses.get(s));
		}*/
		for (EObject o : res){
			v.accept2(o);
		}
	/*	//resolveAllProxies();
		for (EObject o : res){
			v.accept3(o);
		}
		//resolveAllProxies();
		for (EObject o : res){
			v.accept4(o);
		}*/
		//resolveAllProxies();
		URI outputUri = URI.createFileURI("/home/mclavreu/Desktop/eclipse-bundle-prototype/workspace/lab2corporate/tmp/api1/api.ecore");
		//URI outputUri = URI.createFileURI("/home/mclavreu/Desktop/eclipse-bundle-prototype/workspace/test_proto/models/xms/xms.ecore");
		//URI outputUri = URI.createFileURI(args[1]);
		XMIResource r = (XMIResource) rs.createResource(outputUri);
		//EPackage java_package = null;
		/*for (EPackage p : root.getESubpackages()) {
			if (p.getName().equals("java"))
				java_package = p;
		}*/
		//emptyPackage(java_package);
		//root.getESubpackages().remove(java_package);
		r.getContents().addAll(root.eContents());
		//System.out.println("batard8");
		r.save(null);
		//System.out.println("batard9");
	}
	/*private static void emptyPackage(EPackage p) {
		List<EClassifier> list = new ArrayList<EClassifier>();
		for (EPackage pack : p.getESubpackages()) {
			emptyPackage(pack);
		}
		for (EClassifier e : p.getEClassifiers()){
			list.add(e);
		}
		for (EClassifier eClassifier : list) {
			EcoreUtil.delete(eClassifier);
		}
		
	}*/
	protected static final ResourceSet rs = new ResourceSetImpl();
	protected static void setUp() {
		EPackage.Registry.INSTANCE.put("http://www.emftext.org/java",
				JavaPackage.eINSTANCE);
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(
				"java", new JavaSourceOrClassFileResourceFactoryImpl());
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(
				Resource.Factory.Registry.DEFAULT_EXTENSION,
				new XMIResourceFactoryImpl());
		rs.getLoadOptions().put(
				IOptions.RESOURCE_POSTPROCESSOR_PROVIDER, new JavaPostProcessor());
		
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
						//System.out.println(msg);
					}
				}
			}
		}
		return !failure;
	}
}
