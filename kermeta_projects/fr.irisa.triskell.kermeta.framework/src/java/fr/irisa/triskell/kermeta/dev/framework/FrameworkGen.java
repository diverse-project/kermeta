/* $Id: FrameworkGen.java,v 1.9 2005-02-25 15:26:36 zdrey Exp $
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
import java.io.IOException;
import java.util.Iterator;

import fr.irisa.triskell.kermeta.exporter.kmt.KM2KMTPrettyPrinter;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.loader.KermetaUnitFactory;
import fr.irisa.triskell.kermeta.structure.FClassDefinition;
import fr.irisa.triskell.kermeta.structure.FNamedElement;
import fr.irisa.triskell.kermeta.structure.FOperation;
import fr.irisa.triskell.kermeta.structure.FPackage;
import fr.irisa.triskell.kermeta.structure.FTypeDefinition;
import fr.irisa.triskell.kermeta.structure.FTypeVariable;
import fr.irisa.triskell.kermeta.utils.KMTBodiesExtractor;


/**
 * @author Franck Fleurey
 * IRISA / University of rennes 1
 * Distributed under the terms of the GPL license
 */
public class FrameworkGen {
	
	KermetaUnit abstract_unit;
	KermetaUnit concrete_unit;
	
	
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
		
		
		KermetaUnit.STD_LIB_URI = "src/kermeta/Standard.kmt";
		
		if (KermetaUnit.getStdLib().error.size() > 0) {
			System.err.println(KermetaUnit.getStdLib().getMessagesAsString());
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
		FPackage impl = concrete_unit.packageLookup("kermeta::structure");
		impl.setFName("structure");
		concrete_unit.packageLookup("kermeta").getFNestedPackage().remove(impl);
		
		//FClassDefinition visitorClass = createVisitor(abstract_unit.packageLookup("kermeta::structure"));
		//visitorClass.setFName("KMStructureVisitor");
		//abstract_unit.packageLookup("kermeta::structure").getFOwnedTypeDefinition().add(visitorClass);
		
		FPackage behavior = abstract_unit.packageLookup("kermeta::behavior");
		
		
		
		
		abstract_unit.packageLookup("kermeta").getFNestedPackage().remove(behavior);
		
		FPackage langpack = abstract_unit.struct_factory.createFPackage();
		langpack.setFName("language");
		langpack.setFNestingPackage(abstract_unit.packageLookup("kermeta"));
		
		langpack.getFNestedPackage().add(behavior);
		
		createVisitor(behavior, "KMExpression");
		
		//visitorClass.setFName("KMExpressionVisitor");
		//abstract_unit.packageLookup("kermeta::behavior").getFOwnedTypeDefinition().add(visitorClass);
		
		FPackage structure = concrete_unit.struct_factory.createFPackage();
		structure.setFName("language");
		structure.setFNestingPackage(concrete_unit.packageLookup("kermeta"));
		impl.setFNestingPackage(structure);
		
		// Create the concrete.kmt reflection module
		makeConcreteClasses(concrete_unit.packageLookup("kermeta::structure"));
		pp.ppPackage(concrete_unit.packageLookup("kermeta::structure"), new File("src/kmt/reflection/concrete.kmt"));
		if (abstract_unit.error.size() > 0) {
			System.err.println(abstract_unit.getMessagesAsString());
			System.exit(-1);
		}
		
		
		
		// Create the abstract classes
		makeAbstractClasses(abstract_unit.packageLookup("kermeta::structure"));
		
		makeConcreteClasses(impl);
		
		createVisitor(impl, "KMStructure");
		
		abstract_unit.packageLookup("kermeta::structure").setFName("reflection");
		
		
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
		
	
	
	public void writeAbstractStructure(FPackage abstract_structure) throws Exception {
		BufferedWriter w = new BufferedWriter(new FileWriter(new File("src/kermeta/reflection/reflection.kmt")));
		w.write("package " + abstract_unit.getQualifiedName(abstract_structure) + ";\n\n");
		w.write("require \"../standard/Collections.kmt\"\n\n");
		w.write(pp.ppPackageContents(abstract_structure) + "\n");
		w.close();
	}
	
	public void writeKermetaStructure(FPackage kermeta_structure) throws Exception {
		BufferedWriter w = new BufferedWriter(new FileWriter(new File("src/kermeta/language/structure.kmt")));
		w.write("package " + abstract_unit.getQualifiedName(kermeta_structure) + ";\n\n");
		w.write("require \"../reflection/reflection.kmt\"\n\n");
		w.write(pp.ppPackageContents(kermeta_structure) + "\n");
		w.close();
	}
	
	
	public void writeBehavior(FPackage behavior_pack) throws Exception {
		BufferedWriter w = new BufferedWriter(new FileWriter(new File("src/kermeta/language/behavior.kmt")));
		w.write("package " + abstract_unit.getQualifiedName(behavior_pack) + ";\n\n");
		w.write("require \"structure.kmt\"\n\n");
		w.write(pp.ppPackageContents(behavior_pack) + "\n");
		w.close();
	}
	
	
	
	
	ClassVisitor cvisitor;
	
	public void createVisitor(FPackage pkg, String name) {
		cvisitor =  new ClassVisitor(abstract_unit);
		cvisitor.createVisitorForPackage(pkg, name);
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
