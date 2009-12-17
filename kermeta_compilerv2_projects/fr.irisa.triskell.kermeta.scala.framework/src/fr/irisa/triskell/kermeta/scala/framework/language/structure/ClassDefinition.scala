package fr.irisa.triskell.kermeta.scala.framework.language.structure

import org.eclipse.emf.ecore._
import org.eclipse.emf.ecore.impl._

trait ClassDefinition extends EClass with Object {
	
	def ScalatypeDefinition = this.typedefinition

}
