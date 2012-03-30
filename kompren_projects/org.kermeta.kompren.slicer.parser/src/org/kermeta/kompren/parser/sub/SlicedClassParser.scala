package org.kermeta.kompren.parser.sub

import org.eclipse.emf.ecore.EcoreFactory
import org.eclipse.emf.ecore.EClass
import org.kermeta.kompren.slicing.SlicedClass
import org.kermeta.kompren.slicing.VarDecl
import org.kermeta.kompren.slicing.SlicingFactory

trait SlicedClassParser extends KomprenAbstractParser with BlockParser {
	def parseSlicedClass : Parser[SlicedClass] = "slicedClass" ~ ":" ~ (pointedIdent | ident) ~ opt("option") ~ opt(ident) ~ opt(parseBlock) ~ opt(parseBlock) ^^ {
	  case _ ~ _ ~ name ~ option ~ nameVar ~ exp ~ expOnRemove =>
	    val slicedClass = SlicingFactory.eINSTANCE.createSlicedClass
	    var clazz : EClass = EcoreFactory.eINSTANCE.createEClass
	    
	    clazz.setName(name)
	    slicedClass.setExpression(if(exp.isDefined) exp.get else null)
	    slicedClass.setExpOnRemove(if(expOnRemove.isDefined) expOnRemove.get else null)
	    slicedClass.setIsOption(option.isDefined && option.get.equals("option"))
	    slicedClass.setDomain(clazz)

	    if(nameVar.isDefined) {
	      val ctx = SlicingFactory.eINSTANCE.createVarDecl
	      ctx.setType(clazz)
	      ctx.setVarName(nameVar.get)
	      slicedClass.setCtx(ctx)
	    }
	    
	    slicedClass
	}
}