/*
 * Created on 14 févr. 2005
 * By Franck FLEUREY (ffleurey@irisa.fr)
 */
package fr.irisa.triskell.kermeta.dev.framework;

import java.io.File;
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
		
		//System.out.println(abstract_unit.error.size());
		
		createVisitor(abstract_unit.packageLookup("kermeta"));
		
		makeAbstractClasses(abstract_unit.packageLookup("kermeta::structure"));
		
		KM2KMTPrettyPrinter pp = new KM2KMTPrettyPrinter();
		pp.ppPackage(abstract_unit.packageLookup("kermeta"), new File("src/kmt/reflection/abstract.kmt"));

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
	
	
	public static void main(String[] args) {
		FrameworkGen g = new FrameworkGen();
		g.loadModels();
	}
}
