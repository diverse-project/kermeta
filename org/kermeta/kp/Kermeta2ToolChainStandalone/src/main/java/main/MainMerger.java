package main;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.kermeta.language.structure.ModelingUnit;

import org.kermeta.language.language.merger.binarymergerrunner.MainRunner;

public class MainMerger {
	
	private URI uri;
	List<ModelingUnit> modelingunit;
	List<ByteArrayOutputStream> modelingunit_ser;
	ModelingUnit mergedMU;
	ByteArrayOutputStream mergedMU_ser;
	private LoadMethod loadMethod;

	
	
	public MainMerger() {
		modelingunit = new ArrayList<ModelingUnit>();
		modelingunit_ser = new ArrayList<ByteArrayOutputStream>();
		((org.eclipse.emf.ecore.EcoreFactoryWrapper) org.eclipse.emf.ecore.EcoreFactory.eINSTANCE)
				.setWrap(org.kermeta.language.language.merger.binarymerger.org.eclipse.emf.ecore.RichFactory$.MODULE$);
		loadMethod = new LoadMethod();
		ecore2kmrunner.MainRunner.init();
	}
	
	public ModelingUnit k2CompileMerger(List<String> urls, List<String> jars_uri,
			String properyfile, List<ModelingUnit> modelingunit) throws IOException {
		this.modelingunit = modelingunit;
		
		// Convert Modellingunit For Merger

		for (ModelingUnit mu : this.modelingunit){
			this.modelingunit_ser.add( loadMethod.saveMu(mu));
		}
		MainRunner.init4eclipse();

		List<ModelingUnit> newmodellingUnit = new ArrayList<ModelingUnit>();
		for (ByteArrayOutputStream muser : this.modelingunit_ser){
			newmodellingUnit.add( loadMethod.LoadMu(muser));
		}
		modelingunit.clear();
		modelingunit.addAll(newmodellingUnit);		
		// End of Convert Modellingunit For Merger
		
		
		//Merged ModellingUnit
		mergedMU = modelingunit.get(0);		
		if (modelingunit.size()>1){
			org.kermeta.language.merger.BinaryMerger b = org.kermeta.language.merger.RichFactory
			.createBinaryMerger();
			for (int i = 1;i<modelingunit.size();i++){
				mergedMU = b.merge(mergedMU, modelingunit.get(i));
				
			}			
		}
		
		// return merged modeling Unit
		return mergedMU;
		
	}
	

}
