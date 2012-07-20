package org.kermeta.compilo.scala.rich.richAspect
import org.eclipse.emf.ecore.EObject
import org.kermeta.language.structure.PrimitiveType
import org.kermeta.language.behavior.CallTypeLiteral
import org.kermeta.language.structure.GenericTypeDefinition

trait ObjectVisitor {
  
  def visit(e:org.kermeta.language.structure.KermetaModelElement,res : StringBuilder);
  
  
  def generateScalaCodeEach[A <:  org.kermeta.language.structure.KermetaModelElement](res : StringBuilder,list : Iterable[A],sep : String )
    
    
    
  def generateProtectedScalaCodeEach[A <:  org.kermeta.language.structure.KermetaModelElement](res : StringBuilder,list : Iterable[A],sep : String )
    
     
 

      	
  def whichBoolean(thi:PrimitiveType):String 
    
     
  def getQualifiedNameCompilo(thi: EObject):String 
	
  def getQualifiedName(thi: EObject):String 
	
  //def getQualifiedNameKermeta(thi: Package):String

   def generateScalaCodeForInstanceOf(thi:CallTypeLiteral,res : StringBuilder) : Unit;
	 def getQualifiedNamedBase(typD : GenericTypeDefinition) : String
	 
	 def getQualifiedNamedAspect(typD : GenericTypeDefinition) : String
        
  def visitTypeParam(thi:org.kermeta.language.structure.Type,res:StringBuilder)
  
}