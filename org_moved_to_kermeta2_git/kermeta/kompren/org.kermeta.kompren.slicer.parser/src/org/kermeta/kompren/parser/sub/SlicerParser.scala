package org.kermeta.kompren.parser.sub

import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EcoreFactory
import org2.kermeta.kompren.slicer.Slicer
import org2.kermeta.kompren.slicer.SlicedElement
import org2.kermeta.kompren.slicer.SlicerFactory
import scala.collection.JavaConversions._

trait SlicerParser extends KomprenAbstractParser 
with RadiusParser 
with ConstraintParser 
with SlicedClassParser 
with SlicedPropertyParser {
  def parseSlicer : Parser[Slicer] = "slicer" ~ opt("strict") ~ opt("active") ~ ident ~ "{" ~ parseDomain ~ parseInput ~ 
		  			opt(parseRadius) ~ (parseConstraints*) ~ (parseSlicedClass*) ~ (parseSlicedProperty*) ~ opt(parseOnStart) ~ 
		  			opt(parseOnEnd) ~ opt(parseHelper) ~ "}" ^^ { 
    case _ ~ soft ~ active ~ name ~ _ ~ domain ~ inputs ~ radius ~ constraints ~ slicedClasses ~ slicedProps ~ onStart ~ onEnd ~ helper ~ _ =>
    val slicer = SlicerFactory.eINSTANCE.createSlicer
    var slicedElements : List[SlicedElement] = slicedClasses ++ slicedProps
    
    soft match {
	    case Some(_) => slicer.setStrict(true)
	    case _ => slicer.setStrict(false)
    }
    
    slicer.setName(name)
    slicer.setActive(active.isDefined)
    slicer.setUriMetamodel(domain)
    slicer.setHelper(if(helper.isDefined) helper.get else null)
    slicer.setOnEnd(if(onEnd.isDefined) onEnd.get else null)
    slicer.setOnStart(if(onStart.isDefined) onStart.get else null)
    slicer.setRadius(if(radius.isDefined) radius.get else null)
    slicer.getConstraints.addAll(constraints)
    slicer.getSlicedElements.addAll(slicedElements)
    slicer.getInputClasses.addAll(inputs)
    
    slicer
  }
  
  
  def parseDomain : Parser[String] = "domain" ~ ":" ~ stringLit ^^ { case _ ~ _ ~ uri => uri }
  
  def parseInput : Parser[List[EClass]] = "input" ~ ":" ~ rep1sep((pointedIdent | ident), ",") ^^ { 
    case _ ~ _ ~ inputs =>
      var inputClasses = List[EClass]()
      
      inputs.foreach{input =>
      	val clazz : EClass = EcoreFactory.eINSTANCE.createEClass()
      	clazz.setName(input)
      	inputClasses = inputClasses ++ List(clazz)
      }
      
      inputClasses 
  }
  
  def parseOnStart : Parser[String] = "onStart" ~ blockCode ^^ { case _ ~ code => code }
  
  def parseOnEnd : Parser[String] = "onEnd" ~ blockCode ^^ { case _ ~ code => code }
  
  def parseHelper : Parser[String] = "helper" ~ blockCode ^^ { case _ ~ code => code }
}
