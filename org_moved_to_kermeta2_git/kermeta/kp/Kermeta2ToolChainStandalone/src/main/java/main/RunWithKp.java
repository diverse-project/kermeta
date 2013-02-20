/* $Id: $
 * Project    : Kermeta2ToolChainStandalone
 * License    : EPL
 * Copyright  : IRISA / INRIA / Universite de Rennes 1
 * -------------------------------------------------------------------
 * Creation date : 21 févr. 2011
 * Authors : 
 *            Haja Rambelontsalama <hajanirina-johary.rambelontsalama@inria.fr>
 */

package main;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.net.URL;
import java.net.URLConnection;


import org.eclipse.emf.common.util.URI;
import org.kermeta.kp.Dependency;
import org.kermeta.kp.KermetaProject;
import org.kermeta.kp.Source;
import org.kermeta.kp.SourceFolder;
import org.kermeta.kp.loader.kp.KpLoader;

public class RunWithKp {

	public static void main(String[] args) {
		Main runner = new Main();
		List<String> uris = new ArrayList<String>();
		List<String> classpath = new ArrayList<String>();
		String propertiesfilePath = "";
		//String kpUrlFile = "src/main/resource/kp/sample.kpt";
		String kpUrlFile = "src/main/resource/kp/newSample.kpt";
		
		
		/*((org.eclipse.emf.ecore.EcoreFactoryWrapper) org.eclipse.emf.ecore.EcoreFactory.eINSTANCE)
		.setWrap(binaryMerger.org.eclipse.emf.ecore.RichFactory$.MODULE$);*/
		((org.eclipse.emf.ecore.EcoreFactoryWrapper) org.eclipse.emf.ecore.EcoreFactory.eINSTANCE)
		.setWrap(org.kermeta.language.language.ecore2km.org.eclipse.emf.ecore.RichFactory$.MODULE$);
		
		KpLoader ldr = new KpLoader();
		KermetaProject kp = ldr.loadKp(kpUrlFile);
		
		//UrlResolver mvnResolver= new UrlResolver();
		
		List<Dependency> deps =  kp.getDependencies();
		for (Dependency dep : deps){
			//URLConnection connecter = mvnResolver.openConnection(new URL(dep.getDepRef().getGroup()));
			//connecter.connect();
			classpath.add(dep.getName());
		}
		
		List<Source> srcs = kp.getSources();
		for (Source src : srcs ){
			String uri = src.getUrl();
			System.out.println("URI IS : " + uri +" from : "+ src.toString());
			uris.add(uri);
		}
		propertiesfilePath = "/home/hrambelo/application/Eclipse/64/EGalileoBase/workspace/compileProject/properties/Compiler.properties";
		
		
		try {
			runner.k2Compile(uris, classpath, propertiesfilePath);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
