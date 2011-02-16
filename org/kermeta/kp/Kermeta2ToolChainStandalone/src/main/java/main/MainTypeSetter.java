package main;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.kermeta.language.structure.ModelingUnit;

public class MainTypeSetter {
	
	private URI uri;
	List<ModelingUnit> modelingunit;
	List<ByteArrayOutputStream> modelingunit_ser;
	ModelingUnit mergedMU;
	ByteArrayOutputStream mergedMU_ser;
	private LoadMethod loadMethod;

	
	
	public MainTypeSetter() {
		modelingunit = new ArrayList<ModelingUnit>();
		modelingunit_ser = new ArrayList<ByteArrayOutputStream>();
		((org.eclipse.emf.ecore.EcoreFactoryWrapper) org.eclipse.emf.ecore.EcoreFactory.eINSTANCE)
				.setWrap(binaryMerger.org.eclipse.emf.ecore.RichFactory$.MODULE$);
		loadMethod = new LoadMethod();
		ecore2kmrunner.MainRunner.init();
	}
	
	
	public void k2CompileTypeSetter(List<String> urls, List<String> jars_uri,
			String properyfile, ModelingUnit mergedMU) throws IOException {
		
		// Convert Resulting Modellingunit For TypeSetter
		mergedMU_ser = loadMethod.saveMu(mergedMU);
		typeSetterrunner.MainRunner.init4eclipse();
		mergedMU = loadMethod.LoadMu(mergedMU_ser);
		// End of Convert Resulting Modellingunit For TypeSetter
		
		//Resolving
		org.kermeta.language.resolver.FullStaticResolver resolver = org.kermeta.language.resolver.RichFactory
		.createFullStaticResolver();
		resolver.resolve(mergedMU);
		//End of Resolving
		

		// Convert Resulting Modellingunit For TypeChecker
		mergedMU_ser = loadMethod.saveMu(mergedMU);
		
		System.out.println(mergedMU_ser.toString());
		
	}
	
	

}
