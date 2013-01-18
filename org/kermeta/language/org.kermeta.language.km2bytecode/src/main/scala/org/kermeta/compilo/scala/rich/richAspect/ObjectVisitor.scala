package org.kermeta.compilo.scala.rich.richAspect
import org.eclipse.emf.ecore.EObject
import org.kermeta.language.structure.PrimitiveType
import org.kermeta.language.behavior.CallTypeLiteral
import org.kermeta.language.structure.GenericTypeDefinition
import org.kermeta.language.structure.ModelTypeDefinition
import org.kermeta.language.structure.ModelElementTypeDefinition
import org.kermeta.language.structure.ClassDefinition
import org.kermeta.compilo.scala.CompilerConfiguration

trait ObjectVisitor {
  
  def visit(e:org.kermeta.language.structure.KermetaModelElement,res : StringBuilder);
  
  def generateScalaCodeEach[A <:  org.kermeta.language.structure.KermetaModelElement](res : StringBuilder,list : Iterable[A],sep : String )
    
  def generateProtectedScalaCodeEach[A <:  org.kermeta.language.structure.KermetaModelElement](res : StringBuilder,list : Iterable[A],sep : String )
      	
  def whichBoolean(thi:PrimitiveType):String 
     
  def getQualifiedNameEMap(thi: EObject):String
  def getPQualifiedNameCompilo(thi: EObject):String
  def getQualifiedNameCompilo(thi: EObject):String 
	
  def getQualifiedName(thi: EObject):String 
	
  //def getQualifiedNameKermeta(thi: Package):String

  def generateScalaCodeForInstanceOf(thi:CallTypeLiteral,res : StringBuilder) : Unit;

  def getQualifiedNamedBase(typD : GenericTypeDefinition) : String
  /** returns the qualified named up to the package */
  def getPQualifiedNamedBase(typD : GenericTypeDefinition) : String
	 
  def getQualifiedNamedAspect(typD : GenericTypeDefinition) : String
        
  def visitTypeParam(thi:org.kermeta.language.structure.Type,res:StringBuilder)
	 
  def generateParamerterClass(thi:org.kermeta.language.structure.ClassDefinition,res1:StringBuilder)
  
  def getQualifiedPathWithMetamodel(thi: EObject): String  
  def getQualifiedPathWithoutMetamodel(thi: EObject): String
  
  //MODELTYPE ADDITION
  def getTypeMemberName(td : ModelElementTypeDefinition) : String 
  def getModelTypeInterfaceQualifiedName(td : ModelElementTypeDefinition) : String
  def getModelTypeInterfaceName(td : ModelElementTypeDefinition) : String
  /*def isVisitingModelTypeDefinition() : Boolean
  def setVisitingModelTypeDefinition(b : Boolean)*/
  def getCompilerConfiguration() : CompilerConfiguration
  def isImplementingModelTypeInterface() : Boolean
  def setImplementingModelTypeInterface(b : Boolean)
  def hasTypeEquivalence(c: ClassDefinition): Boolean
}