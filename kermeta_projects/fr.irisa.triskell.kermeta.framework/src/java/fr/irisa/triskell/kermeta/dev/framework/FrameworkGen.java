/* $Id: FrameworkGen.java,v 1.4 2005-02-21 08:30:11 ffleurey Exp $
 * Created on 14 févr. 2005
 * By Franck FLEUREY (ffleurey@irisa.fr)
 * Description :
 * 
 * Todo : put TODO actions here
 */
package fr.irisa.triskell.kermeta.dev.framework;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;

import fr.irisa.triskell.kermeta.exporter.kmt.KM2KMTPrettyPrinter;
import fr.irisa.triskell.kermeta.loader.KermetaLoader;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.structure.FClassDefinition;
import fr.irisa.triskell.kermeta.structure.FOperation;
import fr.irisa.triskell.kermeta.structure.FPackage;
import fr.irisa.triskell.kermeta.structure.FTypeDefinition;
import fr.irisa.triskell.kermeta.structure.FTypeVariable;


/**
 * @author Franck Fleurey
 * IRISA / University of rennes 1
 * Distributed under the terms of the GPL license
 */
public class FrameworkGen {
	
	KermetaUnit abstract_unit;
	KermetaUnit concrete_unit;
	String KMTBODIES_DIR = "kmtbodies/";
	
	/**
	 * 
	 */
	public FrameworkGen() {
		super();
	}

	public void loadModels() {
		
		KermetaUnit.STD_LIB_URI = "src/kmt/Standard.kmt";
		
		abstract_unit = KermetaLoader.getDefaultLoader().load("src/ecore/kermeta.emf");
		
		
		
		//concrete_unit = KermetaLoader.getDefaultLoader().load("../src/ecore/kermeta.emf");
		
		if (abstract_unit.error.size() > 0) {
			System.err.println(abstract_unit.getMessagesAsString());
			System.exit(-1);
		}
		
		createVisitor(abstract_unit.packageLookup("kermeta"));
		
		makeAbstractClasses(abstract_unit.packageLookup("kermeta::structure"));
		// TODO Create the bodies of setter and getter
		
		// Create the extern file where to put the bodies
		// Convention : class_<name_of_the_meta_class>.mctbodies or classdef_<name_of_the_class>
/*		File mctbodies_file = createKMTBodiesFile("class_Class.kmtbodies");
		
		// Extract the properties and operations for a given class..
		KMTBodiesExtractor bextractor = new KMTBodiesExtractor(abstract_unit, kmtbodies_file);
		bextractor.visit(abstract_unit.getTypeDefinitionByName("kermeta::structure::Class"));
*/
		// Create the abstract.kmt reflection module
		KM2KMTPrettyPrinter pp = new KM2KMTPrettyPrinter();
		pp.ppPackage(abstract_unit.packageLookup("kermeta::structure"), new File("src/kmt/reflection/AbstractStructure.kmt"));
		pp.ppPackage(abstract_unit.packageLookup("kermeta::behavior"), new File("src/kmt/reflection/KermetaBehavior.kmt"));
		pp.ppPackage(abstract_unit.packageLookup("kermeta::structure"), new File("src/kmt/reflection/KermetaStructure.kmt"));
	}
	
	protected File createKMTBodiesFile(String filename)
	{
		String[] listdir = new File(KMTBODIES_DIR).list();
		int save_i = 0;
		for (int i=0; i < listdir.length; i++)
		{
			if (listdir[i].startsWith(filename))
			{
				save_i += 1 ;
			}
		}
		if (new File(KMTBODIES_DIR+filename).exists())
		{
			File oldf = new File(KMTBODIES_DIR+filename);
			File newf = new File(KMTBODIES_DIR+filename+".bak."+(save_i+1));
			oldf.renameTo(newf);
		}
	
		return new File(KMTBODIES_DIR+filename);
		
	}
	
	public FClassDefinition createVisitor(FPackage pkg) {
		// abstract class Visitor<ContextType> {
		FClassDefinition visitor = abstract_unit.struct_factory.createFClassDefinition();
		visitor.setFName("KMVisitor");
		visitor.setFIsAbstract(true);
		FTypeVariable typevar = abstract_unit.struct_factory.createFTypeVariable();
		typevar.setFName("ContextType");
		visitor.getFTypeParameter().add(typevar);
		// ClassVisitor
		ClassVisitor cvisitor = new ClassVisitor(abstract_unit, visitor);
		cvisitor.accept(pkg);
		pkg.getFOwnedTypeDefinition().add(visitor);
		return visitor;
		
	}
	
	/**
	 * All classes of the packages are made abstract.
	 * @param pkg
	 */
	public void makeAbstractClasses(FPackage pkg) {
		MakeAbstractClass visitor = new MakeAbstractClass();
		visitor.accept(pkg);
	}
	
/*	public void makePropertyBodies(FTypeDefinition typedef) {
		MakePropertyBodies pbodies = new MakePropertyBodies(abstract_unit);
		pbodies.accept(typedef);
	}
*/	
	
	public static void main(String[] args) {
		FrameworkGen g = new FrameworkGen();
		g.loadModels();
	}
}
