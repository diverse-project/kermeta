
/*$Id: Kcomp_structureTestSuite.java,v 1.2 2008-01-31 15:52:20 cfaucher Exp $
* Project : org.kermeta.compiler.tests
* File : 	CompilerStructureTestSuite.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 30 janv. 08
* Authors : paco
*/

package org.kermeta.compiler.tests.structure;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses(
	{
		
		Kcomp_attributeUseCase.class
	, 
		Kcomp_classDefinitionUseCase.class
	, 
		Kcomp_containmentUseCase.class
	, 
		Kcomp_enumerationUseCase.class
	, 
		Kcomp_genericsUseCase.class
	, 
		Kcomp_inheritanceUseCase.class
	, 
		Kcomp_invariantUseCase.class
	, 
		Kcomp_multiplicityUseCase.class
	, 
		Kcomp_operationStructureUseCase.class
	, 
		Kcomp_oppositeUseCase.class
	, 
		Kcomp_packageUseCase.class
	, 
		Kcomp_parameterUseCase.class
	, 
		Kcomp_postconditionUseCase.class
	, 
		Kcomp_preconditionUseCase.class
	, 
		Kcomp_primitiveTypeUseCase.class
	, 
		Kcomp_propertyStructureUseCase.class
	, 
		Kcomp_referenceUseCase.class
	, 
		Kcomp_tagUseCase.class
	}
)
public class Kcomp_structureTestSuite {
}


