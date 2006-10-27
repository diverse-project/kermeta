/* $Id: FrameworkGen.java,v 1.16 2006-10-27 08:26:58 dvojtise Exp $
 * Created on 14 févr. 2005
 * By Franck FLEUREY (ffleurey@irisa.fr)
 * Description :
 * 
 * Todo : put TODO actions here
 */
package fr.irisa.triskell.kermeta.dev.framework;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

import fr.irisa.triskell.kermeta.exporter.kmt.KM2KMTPrettyPrinter;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.loader.KermetaUnitFactory;
import fr.irisa.triskell.kermeta.loader.StdLibKermetaUnitHelper;

import fr.irisa.triskell.kermeta.language.structure.Package;
import fr.irisa.triskell.kermeta.modelhelper.NamedElementHelper;

import fr.irisa.triskell.kermeta.utils.KMTBodiesExtractor;


/**
 * @author Franck Fleurey
 * IRISA / University of rennes 1
 * Distributed under the terms of the GPL license
 */
public class FrameworkGen {
	
	KermetaUnit abstract_unit;
	KermetaUnit concrete_unit;
	KM2KMTPrettyPrinter pp;
	
	
	/**
	 * Constructor 
	 */
	public FrameworkGen() {
		super();
		pp = new KM2KMTPrettyPrinter();
		
	}

	/**
	 * Loads the models of kermeta and store them in the reflection directory.
	 * - abstract.kmt : the model of kermeta (the meta-model kermeta)
	 * - concrete.kmt : the concrete classes for basic reflection
	 * - jpt.kmt      : the concrete classes for ...
	 */
	public void loadModels() {
		
		
		StdLibKermetaUnitHelper.STD_LIB_URI = "src/kermeta/Standard.kmt";
		
		
		if (StdLibKermetaUnitHelper.getKermetaUnit().messages.unitHasError) {
			System.err.println(StdLibKermetaUnitHelper.getKermetaUnit().messages.getMessagesAsString());
			System.exit(-1);
		}
		
		
		abstract_unit = KermetaUnitFactory.getDefaultLoader().createKermetaUnit("src/ecore/kermeta.emf");
		abstract_unit.load();
		concrete_unit = KermetaUnitFactory.getDefaultLoader().createKermetaUnit("src/ecore/kermeta_c.emf");
		concrete_unit.load();
		
		
		// TODO Create the bodies of setter and getter
		
		// Create the extern file where to put the bodies
		// Convention : class_<name_of_the_meta_class>.kmtbodies or classdef_<name_of_the_class>
		// pkg_<pkg name>.kmtbodies
		// Extract the properties and operations for a given class..
		KMTBodiesExtractor bextractor = new KMTBodiesExtractor(abstract_unit);
		bextractor.extractFromPackage(abstract_unit.packageLookup("kermeta::structure"), "package_structure.kmtbodies");

		// Create the abstract.kmt reflection module
	
		
		// Define impl package
		Package impl = concrete_unit.packageLookup("kermeta::structure");
		impl.setName("structure");
		concrete_unit.packageLookup("kermeta").getNestedPackage().remove(impl);
		
		//FClassDefinition visitorClass = createVisitor(abstract_unit.packageLookup("kermeta::structure"));
		//visitorClass.setFName("KMStructureVisitor");
		//abstract_unit.packageLookup("kermeta::structure").getFOwnedTypeDefinition().add(visitorClass);
		
		Package behavior = abstract_unit.packageLookup("kermeta::behavior");
		
		
		
		
		abstract_unit.packageLookup("kermeta").getNestedPackage().remove(behavior);
		
		Package langpack = abstract_unit.struct_factory.createPackage();
		langpack.setName("language");
		langpack.setNestingPackage(abstract_unit.packageLookup("kermeta"));
		
		langpack.getNestedPackage().add(behavior);
		
		createVisitor(behavior, "KMExpression");
		
		//visitorClass.setFName("KMExpressionVisitor");
		//abstract_unit.packageLookup("kermeta::behavior").getFOwnedTypeDefinition().add(visitorClass);
		
		Package structure = concrete_unit.struct_factory.createPackage();
		structure.setName("language");
		structure.setNestingPackage(concrete_unit.packageLookup("kermeta"));
		impl.setNestingPackage(structure);
		
				
		if (abstract_unit.messages.unitHasError) {
			System.err.println(abstract_unit.messages.getMessagesAsString());
			System.exit(-1);
		}
		
		
		
		// Create the abstract classes
		makeAbstractClasses(abstract_unit.packageLookup("kermeta::structure"));
		// Create the concrete.kmt reflection module
		makeConcreteClasses(impl);
		
		createVisitor(impl, "KMStructure");
		
		abstract_unit.packageLookup("kermeta::structure").setName("reflection");
		
		
		try {
			writeAbstractStructure(abstract_unit.packageLookup("kermeta::structure"));
			writeKermetaStructure(impl);
//			//writeVisitor(visitorClass);
			writeBehavior(abstract_unit.packageLookup("kermeta::behavior"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	public void writeAbstractStructure(Package abstract_structure) throws Exception {
		BufferedWriter w = new BufferedWriter(new FileWriter(new File("src/kermeta/reflection/reflection.kmt")));
		w.write("package " + NamedElementHelper.getQualifiedName(abstract_structure) + ";\n\n");
		w.write("require \"../standard/Collections.kmt\"\n\n");
		w.write(pp.ppPackageContents(abstract_structure) + "\n");
		w.close();
	}
	
	public void writeKermetaStructure(Package kermeta_structure) throws Exception {
		BufferedWriter w = new BufferedWriter(new FileWriter(new File("src/kermeta/language/structure.kmt")));
		w.write("package " + NamedElementHelper.getQualifiedName(kermeta_structure) + ";\n\n");
		w.write("require \"../reflection/reflection.kmt\"\n\n");
		w.write(pp.ppPackageContents(kermeta_structure) + "\n");
		w.close();
	}
	
	
	public void writeBehavior(Package behavior_pack) throws Exception {
		BufferedWriter w = new BufferedWriter(new FileWriter(new File("src/kermeta/language/behavior.kmt")));
		w.write("package " + NamedElementHelper.getQualifiedName(behavior_pack) + ";\n\n");
		w.write("require \"structure.kmt\"\n\n");
		w.write(pp.ppPackageContents(behavior_pack) + "\n");
		w.close();
	}
	
	
	
	
	ClassVisitor cvisitor;
	
	public void createVisitor(Package pkg, String name) {
		cvisitor =  new ClassVisitor(abstract_unit);
		cvisitor.createVisitorForPackage(pkg, name);
	}
	
	/**
	 * All classes of the packages are made abstract.
	 * @param pkg
	 */
	public void makeAbstractClasses(Package pkg) {
		MakeAbstractClass visitor = new MakeAbstractClass();
		visitor.accept(pkg);
	}
	
	/**
	 * All classes of the packages are made concrete, excepts the ones that are already abstract
	 * (eg ContainerType).
	 * @param pkg
	 */
	public void makeConcreteClasses(Package pkg) {
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
