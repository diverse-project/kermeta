package main;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.kermeta.language.structure.ModelingUnit;
import org.kermeta.language.structure.StructurePackage;

public class MainLoadUnit {
	
	
	private URI uri;
	List<ModelingUnit> modelingunit;
	ModelingUnit mergedMU;
	ByteArrayOutputStream mergedMU_ser;
	private LoadMethod loadMethod;

	
	
	public MainLoadUnit() {
		modelingunit = new ArrayList<ModelingUnit>();
		((org.eclipse.emf.ecore.EcoreFactoryWrapper) org.eclipse.emf.ecore.EcoreFactory.eINSTANCE)
				.setWrap(org.kermeta.language.language.merger.binarymerger.org.eclipse.emf.ecore.RichFactory$.MODULE$);
		loadMethod = new LoadMethod();
		org.kermeta.language.language.ecore2kmrunner.MainRunner.init();
	}
	
	
	public List<ModelingUnit> k2CompileLoadUnit(List<String> urls, List<String> jars_uri,
			String properyfile) throws IOException {
		
		//Load Unit
		for (String uri : urls) {
			if (uri.endsWith(".kmt")) {
				ModelingUnit mu = loadMethod.loadKMT(uri);
				if (mu != null) {
					this.modelingunit.add(mu);
				}
			}else if (uri.endsWith(".ecore")) {
				System.out.println("load ecore");
				org.kermeta.language.language.ecore2kmrunner.MainRunner.init4eclipse();
				System.out.println(StructurePackage.eINSTANCE.getEFactoryInstance());
				ModelingUnit mu = loadMethod.loadEcore(uri);
				if (mu != null) {
					
					this.modelingunit.add(mu);
				}
			}else if (uri.endsWith(".km")) {
				ModelingUnit mu = loadMethod.loadKM(uri);
				if (mu != null) {
					this.modelingunit.add(mu);
				}
			}			
		}
		return this.modelingunit;
	}

}
