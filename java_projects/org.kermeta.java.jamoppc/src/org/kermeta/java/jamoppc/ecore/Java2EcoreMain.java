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

/**
 * Main class for the transformation from Java models to ECore models
 * @author mclavreu
 *
 */
public class Java2EcoreMain {
	public static void main(String[] args) throws IOException {
		setUp();
		// Mandatory for Ecore proxies references in models to be resolved
		JavaClasspath cp = JavaClasspath.get(rs);
		File libRT_jarPath = new File(System.getProperty("java.home")+"/lib/rt.jar");
		cp.registerClassifierJar(URI.createFileURI(libRT_jarPath
			.getCanonicalPath()));
		cp.registerStdLib();
		
		/* demo*/
		//URI xmiuri = URI.createFileURI("/home/mclavreu/Desktop/eclipse-bundle-prototype/workspace/test_proto/models/xms/xms.xmi");
		URI xmiuri = URI.createFileURI("/home/mclavreu/Desktop/eclipse-bundle-prototype/workspace/lab2corporate/tmp/api1/api11.xmi");
		
		//URI xmiuri = URI.createFileURI(args[0]);
		XMIResource resource = (XMIResource) rs.getResource(xmiuri, true);
		
		Map<Object,Object> options = new HashMap<Object, Object>();
		options.put(XMIResource.OPTION_SCHEMA_LOCATION, Boolean.TRUE);
		options.put(XMIResource.OPTION_PROCESS_DANGLING_HREF, XMIResource.OPTION_PROCESS_DANGLING_HREF_DISCARD);
		resource.load(options);
		List<EObject> res = new ArrayList<EObject>();
		res.addAll(resource.getContents());
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
		Java2Tree v = new Java2Tree(root);
		resolveAllProxies();
		
		// first pass - hierarchy
		for (EObject o : res){
			v.accept(o);
		}
		
		// debug info
		/*int index = 0;
		for (Tree<org.emftext.language.java.classifiers.Class> tree : v.hierarchy) {
			index += tree.getSize();
			System.out.println("hierarchy "+index);
			tree.toString();
		}*/
		//System.out.println("total="+res.size()+" hierarchy elts="+index);
		EcoreUtil.resolveAll(rs);
		resolveAllProxies();
		
		// second pass - ecore model
		for (Tree<org.emftext.language.java.classifiers.Class> tree : v.hierarchy) {
			v.accept2(tree);
		}
		
		URI outputUri = URI.createFileURI("/home/mclavreu/Desktop/eclipse-bundle-prototype/workspace/lab2corporate/tmp/api1/api11.ecore");
		//URI outputUri = URI.createFileURI("/home/mclavreu/Desktop/eclipse-bundle-prototype/workspace/test_proto/models/xms/xms.ecore");
		//URI outputUri = URI.createFileURI(args[1]);
		XMIResource r = (XMIResource) rs.createResource(outputUri);
		r.getContents().addAll(root.eContents());
		r.save(null);
	}
	
	protected static final ResourceSet rs = new ResourceSetImpl();
	
	/**
	 * Registry initialization with JAMOPP related resources
	 */
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
	
	/**
	 * Method that tries to resolve proxies.
	 * Proxies are references in models to external resources
	 * @return
	 */
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
}
