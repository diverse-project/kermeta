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
	final var outputFolder : String = "../outputScala/src"
	final var scalaPrefix : String = "Scala"
	final 	var workspaceURI : String = "/home/barais/workspaces/kermetaCompilerRuntime2/"
	final var pluginURI : String = "/home/barais/workspaces/kermetaCompilerRuntime2/"

} 
 