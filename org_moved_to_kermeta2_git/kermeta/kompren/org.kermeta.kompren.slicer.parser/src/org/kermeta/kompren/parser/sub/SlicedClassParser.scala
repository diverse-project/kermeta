package org.kermeta.kompren.parser.sub

import org.eclipse.emf.ecore.EcoreFactory
import org.eclipse.emf.ecore.EClass
import org2.kermeta.kompren.slicer.SlicedClass
import org2.kermeta.kompren.slicer.VarDecl
import org2.kermeta.kompren.slicer.SlicerFactory

trait SlicedClassParser extends KomprenAbstractParser {
	def parseSlicedClass : Parser[SlicedClass] = "slicedClass" ~ ":" ~ (pointedIdent | ident) ~ opt("option") ~ opt(ident) ~ opt(blockCode) ^^ {
	  case _ ~ _ ~ name ~ option ~ nameVar ~ exp =>
	    val slicedClass = SlicerFactory.eINSTANCE.createSlicedClass
	    var clazz : EClass = EcoreFactory.eINSTANCE.createEClass
	    
	    clazz.setName(name)
	    slicedClass.setExpression(if(exp.isDefined) exp.get else null)
	    slicedClass.setIsOption(option.isDefined && option.get.equals("option"))
	    slicedClass.setDomain(clazz)

	    if(nameVar.isDefined) {
	      val ctx = SlicerFactory.eINSTANCE.createVarDecl
	      ctx.setType(clazz)
	      ctx.setVarName(nameVar.get)
	      slicedClass.setCtx(ctx)
	    }
	    
	    slicedClass
	}
}