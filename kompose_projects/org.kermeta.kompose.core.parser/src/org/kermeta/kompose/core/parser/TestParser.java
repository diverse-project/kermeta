package org.kermeta.kompose.core.parser;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import kompose.*;

public class TestParser {

	
	public static String input = "models/blp.comp";
	public static String output = "models/blp_comp.xmi";
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		 DirectivesLexer lexer = new DirectivesLexer(new ANTLRFileStream(input));
		 CommonTokenStream tokens = new CommonTokenStream(lexer);
	     DirectivesParser parser = new DirectivesParser(tokens);
	     Composer c = null;
	     try {
			c=parser.dirUnit();
		} catch (RecognitionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	     //AST t = parser.getAST();
	     //System.out.println(t.toStringTree());
		
		/*
		CompositionFactory factory = CompositionPackageImpl.init().getCompositionFactory();
		Composer c = factory.createComposer();
		
		Create createD = factory.createCreate();
		createD.setClassName("Class");
		createD.setIdentifier("c");
		
		c.getPredirectives().add(createD);
		
		Set setD = factory.createSet();
		setD.setPropertyName("name");
		IDRef setDt = factory.createIDRef();
		setDt.setIdentifier("c");
		setD.setTarget(setDt);
		StringLiteral setDv = factory.createStringLiteral();
		setDv.setValue("C");
		setD.setValue(setDv);
		
		c.getPredirectives().add(setD);
		
		Add addD = factory.createAdd();
		addD.setPropertyName("eClassifiers");
		NameRef addDt = factory.createNameRef();
		addDt.setQname("Package");
		IDRef addDv = factory.createIDRef();
		addDv.setIdentifier("c");
		addD.setTarget(addDt);
		addD.setValue(addDv);
		
		c.getPredirectives().add(addD);
		*/
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xmi",new XMIResourceFactoryImpl()); 
		ResourceSet resource_set = new ResourceSetImpl();
		
		Resource res = resource_set.createResource(URI.createFileURI(output));
		res.getContents().add(c);
		res.save(null);
		
		// fix the ns uri
		BufferedReader br = new BufferedReader(new FileReader(output));
		
		String xmi="";
		while(br.ready()) xmi += br.readLine() + "\n";
		br.close();
		
		xmi = xmi.replaceAll("composition=\"directives.ecore\"", "composition=\"directives.ecore\" xsi:schemaLocation=\"directives.ecore ../metamodel/directives.ecore\"");
		
		BufferedWriter bw = new BufferedWriter(new FileWriter(output));
		bw.write(xmi);
		bw.close();
	}

}
