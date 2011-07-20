package org.kermeta.language.loader.kmt.scala.internal.printer


import org.kermeta.KmPackage
import org.kermeta.language.structure._
import org.kermeta.language.behavior._
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.kermeta.language.structure.ModelingUnit
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EObject
import scala.collection.JavaConversions._


object PrettyPrinter {


  def main(args: Array[String]): Unit = {

    var res = new StringBuffer
    print(loadKM("/home/barais/workspaces/compiloV2/org.kermeta.language.loader.kmt.scala/parsed.km"),res)
    println(res.toString)
  }

  def loadKM(fileName: String): ModelingUnit = {
    var rs = new ResourceSetImpl()
    var f = rs.getResourceFactoryRegistry()
    var m = f.getExtensionToFactoryMap()
    m.put("km", new XMIResourceFactoryImpl())
    rs.getPackageRegistry().put(KmPackage.eNS_URI, KmPackage.eINSTANCE);
    var uri = URI.createFileURI(fileName)
    var resource = rs.getResource(uri, true)
    var mu: ModelingUnit = null;
    if (resource.isLoaded() && resource.getContents().size() > 0) {
      mu = resource.getContents().get(0).asInstanceOf[ModelingUnit]
    }
    return mu;
  }

  def print(o: EObject, res: java.lang.StringBuffer): Unit = {
    o match {
      case m : ModelingUnit =>{
        m.getPackages.foreach(p=>print(p,res))
        m.getOwnedTypeDefinition.foreach(p=>print(p,res))
      }
      case p: Package => {
        res.append("package " + p.getName() + " {\n")
        p.getNestedPackage.foreach(e => print(e, res))
        p.getOwnedTypeDefinition.foreach(e => print(e, res))
        res.append("\n}\n")
      }
      case c: ClassDefinition => {
        res.append("\t")
        if (c.getIsAbstract)
          res.append("abstract ")
        if (c.getIsAspect)
          res.append("aspect ")
        if (c.getIsSingleton)
          res.append("singleton ")
        res.append("class " + c.getName() + " {\n")
        c.getOwnedAttribute.foreach { att => print(att, res) }
        c.getOwnedOperation.foreach { op => print(op, res) }
        //TODO Generic
        //TODO Invariant
        res.append("\n\t}\n")
      }
      case p: Property => {
        if (p.getIsComposite)
          res.append("\t\tattribute ")
        else
          res.append("\t\treference ")
        res.append(p.getName + " : ")
        print(p.getType, res)
        if ((p.getUpper != 1) || p.getLower != 0){
          res.append("[")
          res.append(p.getLower)
          res.append("..")
          res.append((""+p.getUpper).replace("-1","*"))
          res.append("]")
        }
          
        //TODO opposite
        //TODO getter setter for derived
        res.append("\n")
      }
      case op: Operation => {
        res.append("\t\toperation " + op.getName + "(")
        var i = 0
        op.getOwnedParameter.foreach(p => {
          if (i != 0)
            res.append(", ")
          print(p, res)
          i = i + 1
        })
        res.append(") : ")
        print(op.getType, res)
        //TODO lower upper superoperation
        res.append(" is ")
        if (op.getIsAbstract!= null && op.getIsAbstract)
          res.append(" abstract ")
        else
          print(op.getBody, res)
        //TODO pre post
        //RaiseException
        res.append("\n")
      }
      
      case p : Parameter =>{
        res.append(p.getName + " : " )
        print(p.getType,res)
          if ((p.getUpper != 1) || p.getLower != 0){
          res.append("[")
          res.append(p.getLower)
          res.append("..")
          res.append((""+p.getUpper).replace("-1","*"))
          res.append("]")
        }
      }
      case p :UnresolvedType=>{
        res.append(p.getTypeIdentifier)
        if (p.getGenerics.size>0)
          res.append("<")
        var i = 0
        p.getGenerics.foreach(g => {
          if (i != 0)
            res.append(", ")
          print(g, res)
          i = i + 1
        })
        if (p.getGenerics.size>0)
          res.append(">")
      }

      
      
      case b: Block => {
        res.append("\n\t\t\tdo\n")
        b.getStatement.foreach(s => {
          res.append("\t\t\t")
          print(s, res)
          res.append("\n")
        })

        if (b.getRescueBlock.size != 0) {
          b.getRescueBlock.foreach(s => {
            res.append("rescue ")
            print(s, res)
            res.append("\n")
          })
        }
        res.append("\t\t\tend\n")
        
      }
      case v: VariableDecl => {
        res.append("var " + v.getIdentifier + " : ")
        print(v.getType, res)
        if (v.getInitialization != null) {
          res.append(" init ")
          print(v.getInitialization, res)
        }
      }

      case c: Conditional => {
        res.append("if (")
        print(c.getCondition, res)
        res.append(") then \n")
        print(c.getThenBody, res)
        if (c.getElseBody != null) {
          res.append("\n\t\t\t else\n")
          print(c.getElseBody, res)
        }
        res.append("\n\t\t\t end \n")

      }

      case l: Loop => {
        if (l.getInitialization != null) {
          res.append("\t\t\t from ")
          print(l.getInitialization, res)
        }
        res.append(" \n\t\t\tuntil ")
        print(l.getStopCondition, res)
        res.append(" \n\t\t\tloop ")
        print(l.getBody, res)
        res.append(" \n\t\t\tend\n ")

      }

      case l: LambdaExpression => {
        res.append("{")
        var i = 0
        l.getParameters.foreach(p => {
          if (i != 0)
            res.append(", ")
          print(p, res)
          i = i + 1
        })
        res.append("|")
        print(l.getBody, res)
        res.append("\t\t\t}")
      }
      case p : LambdaParameter =>{
        res.append(p.getName)
        if (p.getType!= null){
	        res.append(" : ")
	        print(p.getType,res)
	       }
	    }
      case p : TypeReference =>{
        print(p.getType,res)
      }

      case i: IntegerLiteral => {
        res.append(i.getValue)
      }
      case i: StringLiteral => {
        res.append("\"" + i.getValue + "\"")
      }
      case i: BooleanLiteral => {
        res.append(i.getValue)
      }


      case i: VoidLiteral => {
        res.append("void")
      
      }
      case f : FunctionType =>{
          res.append("<")
        
          print(f.getLeft,res)
          res.append("->")
          print(f.getRight,res)
          
        
        
        res.append(">")
      }
     
      case u: UnresolvedCall => {
        if (u.getTarget != null) {
          print(u.getTarget, res)
        res.append("." )}
        res.append(         u.getName)
        var i = 0
        if (u.getParameters.size > 0)
          res.append("(")
        u.getParameters.foreach(p => {
          if (i != 0)
            res.append(", ")
          print(p, res)
          i = i + 1
        })
        if (u.getParameters.size > 0) {
          res.append(")")
        }
      }
      case c:CallSuperOperation =>{
        res.append("super." + c.getName)
        var i = 0
        if (c.getParameters.size > 0)
          res.append("(")
        c.getParameters.foreach(p => {
          if (i != 0)
            res.append(", ")
          print(p, res)
          i = i + 1
        })
        if (c.getParameters.size > 0) {
          res.append(")")
        }
      }
     case c: CallOperation =>{
        print(c.getTarget,res)
        res.append("." + c.getName)
        var i = 0
        if (c.getParameters.size > 0)
          res.append("(")
        c.getParameters.foreach(p => {
          if (i != 0)
            res.append(", ")
          print(p, res)
          i = i + 1
        })
        if (c.getParameters.size > 0) {
          res.append(")")
        }
        
      }
     case c: SelfExpression =>{
    	 res.append("self")
    	
      }
     
      case c: ProductType =>{
        var i = 0
        c.getType.foreach(p => {
          if (i != 0)
            res.append(",")
          print(p, res)
          i = i + 1
        })
      }

     case c: Assignment =>{
    	 print(c.getTarget,res)
    	 if (c.getIsCast != null && c.getIsCast)
    		 res.append("?=")
    	else
    	 res.append(":=")
    	 print(c.getValue,res)
    	 
    	  
      }

      case c:CallProperty =>{
        print(c.getTarget,res)
        res.append("." + c.getName)
        var i = 0
        if (c.getParameters.size > 0)
          res.append("(")
        c.getParameters.foreach(p => {
          if (i != 0)
            res.append(", ")
          print(p, res)
          i = i + 1
        })
        if (c.getParameters.size > 0) {
          res.append(")")
        }
      }
      
      case c:CallResult =>{
        res.append("result" )
      }
      case c:CallVariable =>{
        print(c.getStaticType,res)
        res.append("." + c.getName)
        var i = 0
        if (c.getParameters.size > 0)
          res.append("(")
        c.getParameters.foreach(p => {
          if (i != 0)
            res.append(", ")
          print(p, res)
          i = i + 1
        })
        if (c.getParameters.size > 0) {
          res.append(")")
        }
      }

      case c: Rescue => {
        res.append("(" + c.getExceptionName + " : ")
        print(c.getExceptionType, res)
        res.append(")\n\tdo\n")
        c.getBody.foreach{exp => {
          print(exp, res)
          res.append("\n")
        }}
        res.append("\tend\n")
      }
      
      case c: CallEnumLiteral =>{
        print(c.getStaticEnumLiteral,res)
        res.append("." + c.getName)
        var i = 0
        if (c.getParameters.size > 0)
          res.append("(")
        c.getParameters.foreach(p => {
          if (i != 0)
            res.append(", ")
          print(p, res)
          i = i + 1
        })
        if (c.getParameters.size > 0) {
          res.append(")")
        }
        
      }
      case c: CallValue =>{
        res.append(c.getName)
        var i = 0
        
        if (c.getParameters.size > 0)
          res.append("(")
        c.getParameters.foreach(p => {
          if (i != 0)
            res.append(", ")
          print(p, res)
          i = i + 1
        })
        if (c.getParameters.size > 0) {
          res.append(")")
        }
        
      }
     
      case o:EObject => res.append("todo " + o.getClass )
    }
    return ;
  }

}
 


