/* GlobalConfiguration.scala
 * Creation date: November 25, 2009
 * License: EPL
 * Copyright: IRISA / INRIA / Universite Rennes 1
 * Authors: Olivier BARAIS <barais@irisa.fr>
 *			Francois FOUQUET <ffouquet@irisa.fr>
 */

package org.kermeta.compilo.scala

import java.util.Properties
import java.util.ResourceBundle
import scala.collection.JavaConversions._
import org.kermeta.language.structure.ModelTypeDefinition

/**
 * Class containing the current configuration of a given compiler
 * TODO migrate all fields from GlobalConfiguration to this class
 */
class CompilerConfiguration extends LogAspect{
	var kermetaStandardMMName : String = "kermeta_standard"
	var modelTypeOperationsPrefix : String = "mt_"
}