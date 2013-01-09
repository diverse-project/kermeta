package org.kermeta.kompren.parser.sub
import org2.kermeta.kompren.slicer.Constraint
import org2.kermeta.kompren.slicer.impl.ConstraintImpl
import org2.kermeta.kompren.slicer.SlicerFactory

trait ConstraintParser extends KomprenAbstractParser {
	def parseConstraints : Parser[Constraint] = "constraint" ~ ":" ~ ident ~ blockCode ^^ {
	  case _ ~ _ ~ name ~ exp => 
	    val constraint = SlicerFactory.eINSTANCE.createConstraint 
	    constraint.setName(name)
	    constraint.setExpression(exp)
	    
	    constraint
	}
}