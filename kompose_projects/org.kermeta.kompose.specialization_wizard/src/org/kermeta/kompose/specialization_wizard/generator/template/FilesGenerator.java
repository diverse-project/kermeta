package org.kermeta.kompose.specialization_wizard.generator.template;

import java.io.FileWriter;
import java.io.IOException;

import org.kermeta.kompose.specialization_wizard.wizards.SpecializerIntermediateDataContainer;

public class FilesGenerator {
	SpecializerIntermediateDataContainer data;
	
	public FilesGenerator(SpecializerIntermediateDataContainer data){
		this.data=data;
	}
	
	public void generate() throws IOException{
		ActivatorJava activator=new ActivatorJava();
		ComposerJava composerjava=new ComposerJava();
		ComposeKMT composerkmt=new ComposeKMT();
		KomposePropertyTesterJava komposePropertyTesterJava = new KomposePropertyTesterJava();
		PluginBuildProperties properties=new PluginBuildProperties();
		PluginManifest manifest=new PluginManifest();
		PluginXMLGenerator xmlgenerator=new PluginXMLGenerator();
		ClassPathStatic classpath=new ClassPathStatic();
		ModelEcore model=new ModelEcore();
		RegisterStartupJava registerStart=new RegisterStartupJava();
		
		FileWriter outFile=new FileWriter(this.data.getActivatorDir());
		outFile.write(activator.generate(this.data));
		outFile.close();
		
		outFile = new FileWriter(this.data.getPropertyTesterClass());
		outFile.write(komposePropertyTesterJava.generate(this.data));
		outFile.close();
		
		outFile=new FileWriter(this.data.getPopupDir());
		outFile.write(composerjava.generate(this.data));
		outFile.close();
		
		outFile=new FileWriter(this.data.getKmtDir());
		outFile.write(composerkmt.generate(this.data));
		outFile.close();
		
		outFile=new FileWriter(this.data.getPropertiesDir());
		outFile.write(properties.generate(this.data));
		outFile.close();
		
		outFile=new FileWriter(this.data.getPluginXmlDir());
		outFile.write(xmlgenerator.generate(this.data));
		outFile.close();
		
		outFile=new FileWriter(this.data.getMetainfDir());
		outFile.write(manifest.generate(this.data));
		outFile.close();
		
		outFile=new FileWriter(this.data.getClassPathFile());
		outFile.write(classpath.generate(this.data));
		outFile.close();
		
		outFile=new FileWriter(this.data.getModelDir());
		outFile.write(model.generate(this.data));
		outFile.close();
		
		outFile=new FileWriter(this.data.getStartupClass());
		outFile.write(registerStart.generate(this.data));
		outFile.close();
	}
}
