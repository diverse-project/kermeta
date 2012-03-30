package org.kermeta.kompren.parser.sub
import org.kermeta.kompren.slicing.Constraint
import org.kermeta.kompren.slicing.impl.ConstraintImpl
import org.kermeta.kompren.slicing.SlicingFactory

trait ConstraintParser extends KomprenAbstractParser with BlockParser {
	def parseConstraints : Parser[Constraint] = "constraint" ~ ":" ~ ident ~ parseBlock ^^ {
	  case _ ~ _ ~ name ~ exp => 
	    val constraint = SlicingFactory.eINSTANCE.createConstraint 
	    constraint.setName(name)
	    constraint.setExpression(exp)
	    
	    constraint
	}
}