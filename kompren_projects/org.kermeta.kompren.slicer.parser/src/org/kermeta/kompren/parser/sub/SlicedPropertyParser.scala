package org.kermeta.kompren.parser.sub

import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EcoreFactory
import org.eclipse.emf.ecore.EReference
import org.kermeta.kompren.slicing.SlicedProperty
import org.kermeta.kompren.slicing.OppositeCreation
import org.kermeta.kompren.slicing.VarDecl
import org.kermeta.kompren.slicing.SlicingFactory


trait SlicedPropertyParser extends KomprenAbstractParser with BlockParser {
	def parseSlicedProperty : Parser[SlicedProperty] = "slicedProperty" ~ ":" ~ (pointedIdent | ident) ~ opt("option") ~ opt(parserOpposite) ~ 
	opt(ident) ~ opt(ident) ~ opt(parseBlock) ~ opt(parseBlock) ^^ {
	  case _ ~ _ ~ name ~ option ~ opp ~ nameVar1 ~ nameVar2 ~ exp ~ expOnRemove =>
	    val slicedProp = SlicingFactory.eINSTANCE.createSlicedProperty
	    val ref : EReference = EcoreFactory.eINSTANCE.createEReference
	    
	    ref.setName(name)
	    slicedProp.setDomain(ref)
	    slicedProp.setOpposite(if(opp.isDefined) opp.get else null)
	    slicedProp.setExpression(if(exp.isDefined) exp.get else null)
	    slicedProp.setExpOnRemove(if(expOnRemove.isDefined) expOnRemove.get else null)
	    slicedProp.setIsOption(option.isDefined && option.get.equals("option"))

	    if(nameVar1.isDefined) {
	      val src = SlicingFactory.eINSTANCE.createVarDecl
	      val clazz : EClass = EcoreFactory.eINSTANCE.createEClass
	      clazz.setName(name)
	      src.setType(clazz)
	      src.setVarName(nameVar1.get)
	      slicedProp.setSrc(src)
	    }
	      
  	    if(nameVar2.isDefined) {
  	      val tgt = SlicingFactory.eINSTANCE.createVarDecl
	      val clazz : EClass = EcoreFactory.eINSTANCE.createEClass
	      clazz.setName("#RESOLVE_OPPOSITE:" + name)
	      tgt.setType(clazz)
	      tgt.setVarName(nameVar2.get)
	      slicedProp.setTgt(tgt)
  	    }

	    slicedProp
	}
	
	
	def parserOpposite : Parser[OppositeCreation] = "opposite" ~ opt("(" ~ ident ~ ")") ^^ {
	  case _ ~ name =>
	    val opp = SlicingFactory.eINSTANCE.createOppositeCreation
	    
	    name match {
	      case Some(value) => value match { case "(" ~ nameOpp ~ ")" => opp.setName(nameOpp) }
	      case _ => opp.setName(null)
	    }
	    
	    opp
	}
}
