/* $Id: FrameworkGen.java,v 1.7 2005-02-21 10:19:19 zdrey Exp $
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
	 * Constructor 
	 */
	public FrameworkGen() {
		super();
	}

	/**
	 * Loads the models of kermeta and store them in the reflection directory.
	 * - abstract.kmt : the model of kermeta (the meta-model kermeta)
	 * - concrete.kmt : the concrete classes for basic reflection
	 * - jpt.kmt      : the concrete classes for ...
	 */
	public void loadModels() {
		
		KermetaUnit.STD_LIB_URI = "src/kmt/Standard.kmt";
		
		abstract_unit = KermetaLoader.getDefaultLoader().load("src/ecore/kermeta.emf");
			
		concrete_unit = KermetaLoader.getDefaultLoader().load("src/ecore/kermeta_c.emf");
		
		//System.out.println(abstract_unit.error.size());
		
		createVisitor(abstract_unit.packageLookup("kermeta"));
		
		// Create the abstract classes
		makeAbstractClasses(abstract_unit.packageLookup("kermeta::structure"));
		
		// TODO Create the bodies of setter and getter
		
		// Create the extern file where to put the bodies
		// Convention : class_<name_of_the_meta_class>.mctbodies or classdef_<name_of_the_class>
		File kmtbodies_file = createKMTBodiesFile("class_Class.kmtbodies");
		
		// Extract the properties and operations for a given class..
		KMTBodiesExtractor bextractor = new KMTBodiesExtractor(abstract_unit, kmtbodies_file);
		bextractor.visit(abstract_unit.getTypeDefinitionByName("kermeta::structure::Class"));
		try {
            bextractor.getWriter().close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

		// Create the abstract.kmt reflection module
		KM2KMTPrettyPrinter pp = new KM2KMTPrettyPrinter();
		pp.ppPackage(abstract_unit.packageLookup("kermeta::structure"), new File("src/kmt/reflection/abstract.kmt"));

		// Define impl package
		FPackage impl = concrete_unit.packageLookup("kermeta::structure");
		impl.setFName("impl");
		
		FPackage structure = concrete_unit.struct_factory.createFPackage();
		structure.setFName("structure");
		
		structure.setFNestingPackage(concrete_unit.packageLookup("kermeta"));
		impl.setFNestingPackage(structure);
		
		
		makeConcreteClasses(concrete_unit.packageLookup("kermeta::structure"));
		pp.ppPackage(concrete_unit.packageLookup("kermeta::structure"), new File("src/kmt/reflection/concrete.kmt"));
	}
	
	protected File createKMTBodiesFile(String filename)
	{
	    File dir = new File(KMTBODIES_DIR);
	    if (!dir.exists())
	    {
	        dir.mkdir();
	    }
		String[] listdir = dir.list();
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
	
	/**
	 * All classes of the packages are made concrete, excepts the ones that are already abstract
	 * (eg ContainerType).
	 * @param pkg
	 */
	public void makeConcreteClasses(FPackage pkg) {
		MakeConcreteClass visitor = new MakeConcreteClass(abstract_unit);
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
