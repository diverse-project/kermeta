/* $Id: CompilationUnitBuilder.java,v 1.1 2006-05-05 12:40:46 zdrey Exp $
 * Project    : fr.irisa.triskell.kermeta.io
 * File       : CompilationUnitBuilder.java
 * License    : EPL
 * Copyright  : IRISA / INRIA / Universite de Rennes 1
 * -------------------------------------------------------------------
 * Creation date : May 2, 2006
 * Authors : 
 *    zdrey <zdrey@irisa.fr>
 * Contributors :
 */
/**
 * 
 */
package fr.irisa.triskell.kermeta.loader.compilationunit;

import fr.irisa.triskell.kermeta.compilationunit.CompilationUnit;
import fr.irisa.triskell.kermeta.compilationunit.CompilationunitFactory;
import fr.irisa.triskell.kermeta.language.structure.Package;
import fr.irisa.triskell.kermeta.language.structure.TypeDefinition;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.loader.KermetaUnitFactory;

/**
 * CompilationUnit builder. pseudo-builder pattern.
 * Used to gather methods that create from scratch a compilation unit from a given Kermeta program (kmt or km).
 * For the moment we still use KermetaUnit... but later we should replace them?
 * CompilationUnitBuilder is used by compilationUnitManager to construct CompilationUnit instances.
 */
public class CompilationUnitBuilder {

	
	
	/** The product */
	protected CompilationUnit compilationUnit;
	
	/** The uri of the corresponding kermeta file.
	 *  The uri of the related compilation unit must be exactly the same as this one except
	 *  for the extension (.kmcu!) */
	protected String kermetaFileUri;
	
	protected KermetaUnit kermetaUnit;
		
	/**
	 * Constructor
	 */
	public CompilationUnitBuilder()
	{
		
	}
	
	public CompilationUnitBuilder(String km_file_uri)
	{
		kermetaFileUri = km_file_uri;
		kermetaUnit = KermetaUnitFactory.getDefaultLoader().createKermetaUnit(km_file_uri);
        kermetaUnit.load();
	}

	public CompilationUnit buildCompilationUnit(KermetaUnit kermeta_unit)
	{
		CompilationUnit compilation_Unit = CompilationunitFactory.eINSTANCE.createCompilationUnit();
		compilation_Unit.setIsTypeChecked(false);
		// String kmcu_uri = kermetaUnit.getUri().substring(0,kermetaUnit.getUri().lastIndexOf(".kmt"))+ "kmcu";
		compilation_Unit.setUri(kermeta_unit.getUri());
		// Not sure that root package is so useful..
		compilation_Unit.setRootPackage((Package)kermeta_unit.getPackages().get(0));
		
		for (KermetaUnit u : kermeta_unit.importedUnits) {
			compilation_Unit.getRequires().add(u.getUri());
		}
		
		for (Package p : kermeta_unit.packages.values()) {
			compilation_Unit.getPackages().add(p);
		}
		for (TypeDefinition t : kermeta_unit.typeDefs.values()) {
			compilation_Unit.getTypeDefinitions().add(t);
		}		
		// todo : create "href" to "external" compilation units.
		return compilation_Unit;
	}
	
	
	/**
	 * Build the compilation unit only for the file given in the CompilationUnitBuilder
	 * constructor.
	 */
	public void buildMainCompilationUnit()
	{
		compilationUnit = buildCompilationUnit(kermetaUnit);
	}
	
	/** Build the compilation units required by the unit */
	public void buildAllCompilationUnits()
	{
		System.err.println("Build all compilation units : " + kermetaUnit.getAllImportedUnits().size() + kermetaUnit.getAllTypeDefinitions().size());
		if (compilationUnit == null)
		{
			compilationUnit = buildCompilationUnit(kermetaUnit);
			
		}
		for (KermetaUnit u : kermetaUnit.getAllImportedUnits())
		{
			System.out.println("u: " + u.getUri());
			compilationUnit.getImportedUnits().add(buildCompilationUnit(u));
		}
	}

	/**
	 * @return Returns the compilationUnit.
	 */
	public CompilationUnit getCompilationUnit() {
		return compilationUnit;
	}

	/**
	 * @return Returns the kermetaUnit.
	 */
	public KermetaUnit getKermetaUnit() {
		return kermetaUnit;
	}

	/**
	 * @return Returns the kermetaFileUri.
	 */
	public String getKermetaFileUri() {
		return kermetaFileUri;
	}

	/**
	 * @param kermetaFileUri The kermetaFileUri to set.
	 */
	public void setKermetaFileUri(String kermetaFileUri) {
		this.kermetaFileUri = kermetaFileUri;
	}

	/**
	 * @param compilationUnit The compilationUnit to set.
	 */
	public void setCompilationUnit(CompilationUnit compilationUnit) {
		this.compilationUnit = compilationUnit;
	}

	/**
	 * @param kermetaUnit The kermetaUnit to set.
	 */
	public void setKermetaUnit(KermetaUnit kermetaUnit) {
		this.kermetaUnit = kermetaUnit;
	}
	
	/**
	 * @param kermetaUnit The kermetaUnit to set.
	 */
	public void setKermetaUnit(String km_uri) {
		KermetaUnit.STD_LIB_URI = "file:///udd/zdrey/Workspaces/KMNewWorkspace/fr.irisa.triskell.kermeta/lib/framework.km";
		kermetaUnit = KermetaUnitFactory.getDefaultLoader().createKermetaUnit(km_uri);
		kermetaUnit.load();
		System.err.println("LOAD KU : " + kermetaUnit.getAllTypeDefinitions());
	}
	
	
}

