package fr.irisa.triskell.kermeta.compilo.scala.rich.richAspect

import fr.irisa.triskell.kermeta.compilo.scala.rich._
import scala.collection.JavaConversions._
import fr.irisa.triskell.kermeta.compilo.scala._
import fr.irisa.triskell.kermeta.language._
import fr.irisa.triskell.kermeta.language.structure._ 
import fr.irisa.triskell.kermeta.language.behavior._
import java.util._
import fr.irisa.triskell.kermeta.compilo.scala.rich.RichAspectImplicit._

trait PropertyAspect extends ObjectAspect with LogAspect {
	
	
	
    override def generateScalaCode(res : StringBuilder) : Unit = {
	if (Util.hasEcoreTag(this.getOwningClass)){
            if (Util.hasEcoreTag(this)){
                generateScalGet(res,"")
                generateScalSet(res,"")
            }else {
                if (!Util.hasCompilerIgnoreTag(this)){
                    generateAttribute(res)
                    generateGet(res,"Ker")
                    generateSet(res,"Ker")
                    generateScalGet(res,"Ker")
                    generateScalSet(res,"Ker")
                }
		 		
			 		
                //TODO générer getter et setter si property ajouté par un ecore
            }
//		 		value.getGetterBody
//		 		value.getSetterBody
	}else {
            if (!Util.hasCompilerIgnoreTag(this)){
                generateAttribute(res)
                generateGet(res,"Ker")
                generateSet(res,"Ker")
                generateScalGet(res,"Ker")
                generateScalSet(res,"Ker")
            }
		

	}
    }
	  
    def generateAttribute(res : StringBuilder) : Unit ={
	res.append("var ")
	res.append(Util.protectScalaKeyword(this.getName()))
	res.append(" : ")
	
	if (this.getUpper>1||this.getUpper == -1){
            if (this.isIsOrdered){
                res.append("java.util.List[")
            }else{
                res.append("java.util.List[")
            }
            this.getType().generateScalaCode(res)
            res.append("] = new java.util.ArrayList[")
            this.getType().generateScalaCode(res)
            res.append("]")

	} else {
            this.getType().generateScalaCode(res)
            res.append("= _")

	}
	res.append("\n")
    }

    def generateGet(res : StringBuilder,prefix:String) : Unit ={
	res.append("def ")
	var s: StringBuilder = new StringBuilder
	this.getType().asInstanceOf[ObjectAspect].generateScalaCode(s)
	if (s.toString.equals("Boolean") || s.toString.equals("java.lang.Boolean") || s.toString.equals("kermeta.standard.Boolean")){
            res.append(prefix+"is")
	}else
	{
            res.append(prefix+"get")
	}
		
	res.append(this.getName.substring(0,1).toUpperCase + this.getName.substring(1,this.getName.size) + "()")
	res.append(" : ")
	getListorType(res)
	res.append("={this." + Util.protectScalaKeyword(this.getName()) + "}")

	
	res.append("\n")
    }

	
	
    def generateScalGet(res : StringBuilder,prefix:String) : Unit ={
        var s: StringBuilder = new StringBuilder
        this.getType().asInstanceOf[ObjectAspect].generateScalaCode(s)
        var currentname : String = this.getName
        if ("class".equals(currentname)){
            currentname = currentname + "_"
        }
		
        if ("uml".equals(this.eContainer.eContainer.asInstanceOf[NamedElement].getName)&&(s.toString.equals("Boolean") || s.toString.equals("java.lang.Boolean") || s.toString.equals("kermeta.standard.Boolean"))){
            return
        }
		
		
		
        res.append("def "+GlobalConfiguration.scalaPrefix)
        res.append(this.getName+"")
        res.append(" : ")
        getListorType(res)
        res.append("={")
        if (this.getGetterBody == null){
            res.append("this.")
            if (s.toString.equals("Boolean") || s.toString.equals("java.lang.Boolean") || s.toString.equals("kermeta.standard.Boolean")){
                if (this.getType().isInstanceOf[PrimitiveType]
                    && !(
                        "fr.irisa.triskell.kermeta.language.structure.Boolean".equals(this.getType().asInstanceOf[PrimitiveType].whichBoolean) ||
                        "org.eclipse.emf.ecore.EBoolean".equals(this.getType().asInstanceOf[PrimitiveType].whichBoolean) || "Ker".equals(prefix) )                    
                )
                {
                    log.info("ECHO TYPE "+s+" "+this.getType().asInstanceOf[PrimitiveType].getQualifiedNameCompilo)
                    res.append(prefix+"get")
                }else{
                    
                    res.append(prefix+"is")
                }
            }
            else
            {
                res.append(prefix+"get")
            }
		
		
		
            //Cas des collections uml
            if ((this.getUpper>1 ||this.getUpper == -1) && "uml".equals(this.eContainer.eContainer.asInstanceOf[NamedElement].getName)){
                currentname = getUmlExtension
            }
		
            res.append( currentname.substring(0,1).toUpperCase() + currentname.substring(1,currentname.length) + "()" + "}")

        }else{
            res.append("var result : ")
            this.getListorType(res)
            //res append "Any"
            res.append(" = null.asInstanceOf[")
            this.getListorType(res)
            res.append("]; \n")

            res.append(this.getGetterBody.generateScalaCode(res))
            res append " \n return result\n}"

//            res.append("\n}")
        }
        var typestring = new StringBuilder
        this.getListorType(typestring)
        res.append(".asInstanceOf[" + typestring.toString + "]")
        res.append("\n")

    }

	
    def generateSet(res : StringBuilder,prefix:String) : Unit ={
        if (!this.isIsReadOnly()){
            res.append("def "+prefix+"set")
            res.append(this.getName.substring(0,1).toUpperCase + this.getName.substring(1,this.getName.size)+"(arg:")
            getListorType(res)
            res.append(")={ this." + Util.protectScalaKeyword(this.getName()) + " = arg}")
            res.append("\n")
        }
    }
	
    def getUmlExtension():String={
        var currentname : String = this.getName
        if (currentname.endsWith("s")){
            currentname =currentname + "es"
        }else if (currentname.endsWith("coveredBy")){
            currentname =currentname + "s"
        }else if (currentname.endsWith("data") ||currentname.endsWith("Data")){
        }else if (currentname.endsWith("y")){
            currentname =currentname.substring(0, currentname.size -1) + "ies"
        }
        else if (currentname.endsWith("ex")){
            currentname =currentname.substring(0, currentname.size -2) + "ices"
        }
        else{
            currentname =currentname + "s"
        }
        return currentname

    }
	
    def generateScalSet(res : StringBuilder,prefix:String) : Unit ={
        if (!this.isIsReadOnly()){
            var currentname : String = this.getName
            
            if (("uml".equals(this.eContainer.eContainer.asInstanceOf[NamedElement].getName))&&("class".equals(currentname))){
                currentname=currentname+"_"
            }/*else if ("class_".equals(currentname)){
                currentname = "class"
            }*/
            //println(this.getName)
            res.append("def "+GlobalConfiguration.scalaPrefix)
            res.append(this.getName+"_=(")
            res.append("value : ")
            getListorType(res)
            res.append(")={")
            if (this.getGetterBody == null  && this.getSetterBody==null){
                //res.append(")={this.set" + this.getName.substring(0,1).toUpperCase + this.getName.substring(1,this.getName.size) + "(arg)" + "}")
                if (this.getUpper>1 ||this.getUpper == -1){
                    //Cas des collections uml
                    if ("uml".equals(this.eContainer.eContainer.asInstanceOf[NamedElement].getName)){
                        currentname =getUmlExtension
                    }
                    res.append("this."+prefix+"get" + currentname.substring(0,1).toUpperCase + currentname.substring(1,currentname.size) + "().clear\n")
                    res.append("this."+prefix+"get" + currentname.substring(0,1).toUpperCase + currentname.substring(1,currentname.size) + "().addAll(value)\n")
                }else{
                    res.append( "this."+prefix+"set" + currentname.substring(0,1).toUpperCase + currentname.substring(1,currentname.size) + "(value)")
                }
            }else{
                this.getSetterBody.generateScalaCode(res)

            }
            res.append("}\n")
		
        }
    }

	
    def getListorType(res:StringBuilder)={
	if (this.getUpper>1 ||this.getUpper == -1){
            if (this.isIsOrdered){
                res.append("java.util.List[")
            }else{
                //TODO gestion des SETs
                res.append("java.util.List[")
            }
            this.getType().asInstanceOf[ObjectAspect].generateScalaCode(res)
            res.append("]")
	} else {
            this.getType().asInstanceOf[ObjectAspect].generateScalaCode(res)
	}
	
	
    }
}
