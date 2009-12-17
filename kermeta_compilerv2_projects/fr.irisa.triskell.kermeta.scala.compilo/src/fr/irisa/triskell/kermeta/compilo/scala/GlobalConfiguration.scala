/* GlobalConfiguration.scala
 * Creation date: November 25, 2009
 * License: EPL
 * Copyright: IRISA / INRIA / Universite Rennes 1
 * Authors: Olivier BARAIS <barais@irisa.fr>
 *			Francois FOUQUET <ffouquet@irisa.fr>
 */

package fr.irisa.triskell.kermeta.compilo.scala

object GlobalConfiguration { 
	   
	
	/* Package Target For Generated Trait */
	final var frameworkGeneratedPackageName : String = "fr.irisa.triskell.scala.generated.fw"
	
	final var implicitConvTraitName : String = "ImplicitConversion"
	final var viewDefTraitName : String = "ViewType"
	final var factoryName : String = "RichFactory"
	final var outputProject : String = "fr.irisa.triskell.kermeta.scala.compilo.output"
	final var outputFolder : String = "../"+outputProject+"/src"
	final var scalaPrefix : String = "Scala"
	final var workspaceURI : String = "/local/hudson_kermeta/jobs/KermetaCompilerV2_TestCase/workspace/"
	//final var workspaceURI : String = "/Users/ffouquet/Documents/DEV/workspaces/fr.irisa.triskell.kermeta.compiloV2/"
	final var pluginURI : String = "/local/hudson_kermeta/jobs/KermetaCompilerV2_TestCase/workspace/"
	//final var pluginURI : String = "/Users/ffouquet/Documents/DEV/workspaces/fr.irisa.triskell.kermeta.compiloV2/"

} 
 