package org.kermeta.kompren.parser.sub

import org.eclipse.emf.ecore.EcoreFactory
import org.eclipse.emf.ecore.EClass
import org.kermeta.kompren.slicing.Radius
import org.kermeta.kompren.slicing.SlicedClass
import org.kermeta.kompren.slicing.SlicingFactory
import scala.collection.JavaConversions._

trait RadiusParser extends KomprenAbstractParser {
	def parseRadius : Parser[Radius] = "radius" ~ ":" ~ rep1sep((pointedIdent | ident), ",") ^^ {
	  case _ ~ _ ~ names =>
	    var slicedClasses : List[SlicedClass] = List()
	    names.foreach{ name =>
	      val clazz = EcoreFactory.eINSTANCE.createEClass
	      val slicedClass = SlicingFactory.eINSTANCE.createSlicedClass
	      
	      clazz.setName(name)
	      slicedClass.setCtx(null)
	      slicedClass.setIsOption(false)
	      slicedClass.setDomain(clazz)
	      slicedClass.setExpOnRemove(null)
	      slicedClass.setExpression(null)
	      slicedClasses = slicedClasses ++ List(slicedClass)
	    }
	    
	    val radius = SlicingFactory.eINSTANCE.createRadius
	    radius.getFocusedClasses().addAll(slicedClasses)
	    
	    radius
	} 
}