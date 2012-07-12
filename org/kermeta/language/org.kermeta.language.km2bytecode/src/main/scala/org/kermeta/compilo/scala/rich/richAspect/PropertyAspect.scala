package org.kermeta.compilo.scala.rich.richAspect

import org.kermeta.compilo.scala.rich._
import scala.collection.JavaConversions._
import org.kermeta.compilo.scala._
import org.kermeta.language._
import org.kermeta.language.structure._
import org.kermeta.language.behavior._
import java.util._

trait PropertyAspect extends ObjectVisitor with LogAspect {

  def visitProperty(thi: Property, res: StringBuilder): Unit = {
    if (Util.hasEcoreTag(thi.getOwningClass)) {
      if (Util.hasEcoreTag(thi)) {
        generateScalGet(thi, res, "")
        generateScalSet(thi, res, "")
      } else {
        if (!Util.hasCompilerIgnoreTag(thi)) {
          generateAttribute(thi, res)
          generateGet(thi, res, "Ker")
          generateSet(thi, res, "Ker")
          generateScalGet(thi, res, "Ker")
          generateScalSet(thi, res, "Ker")
        }

        //TODO générer getter et setter si property ajouté par un ecore
      }
      //		 		value.getGetterBody
      //		 		value.getSetterBody
    } else {
      if (!Util.hasCompilerIgnoreTag(thi)) {
        generateAttribute(thi, res)
        generateGet(thi, res, "Ker")
        generateSet(thi, res, "Ker")
        generateScalGet(thi, res, "Ker")
        generateScalSet(thi, res, "Ker")
      }

    }
  }

  def generateAttribute(thi: Property, res: StringBuilder): Unit = {
    res.append("var ")
    res.append(Util.protectScalaKeyword(thi.getName()))
    res.append(" : ")

    if (thi.getUpper > 1 || thi.getUpper == -1) {
      if (thi.getIsOrdered == null || thi.getIsOrdered) {
        if(thi.getIsUnique() == null || thi.getIsUnique())
          res.append("k2.standard.KermetaOrderedSet[")
        else
          res.append("k2.standard.KermetaSequence[")
      } else {
        if(thi.getIsUnique() == null || thi.getIsUnique())
          res.append("k2.standard.KermetaSet[")
        else
          res.append("k2.standard.KermetaBag[")
      }
      visit(thi.getType, res)
      if (thi.getIsOrdered == null || thi.getIsOrdered) {
        if(thi.getIsUnique() == null || thi.getIsUnique())
          res.append("] = k2.standard.KerRichFactory.createOrderedSet[")
        else
          res.append("] = k2.standard.KerRichFactory.createSequence[")
      } else {
        if(thi.getIsUnique() == null || thi.getIsUnique())
          res.append("] = k2.standard.KerRichFactory.createSet[")
        else
          res.append("] = k2.standard.KerRichFactory.createBag[")
      }
      visit(thi.getType, res)
      res.append("]")

    } else {
      visit(thi.getType, res)
      res.append("= _")

    }
    res.append("\n")
  }

  def generateGet(thi: Property, res: StringBuilder, prefix: String): Unit = {
    res.append("def ")
    var s: StringBuilder = new StringBuilder
    visit(thi.getType(),s)
    if (s.toString.equals("Boolean") || s.toString.equals("java.lang.Boolean") || s.toString.equals("kermeta.standard.Boolean")) {
      res.append(prefix + "is")
    } else {
      res.append(prefix + "get")
    }

    res.append(thi.getName.substring(0, 1).toUpperCase + thi.getName.substring(1, thi.getName.size) + "()")
    res.append(" : ")
    getListorType(thi, res)
    res.append("={this." + Util.protectScalaKeyword(thi.getName()) + "}")

    res.append("\n")
  }
  
  def getGetter(thi: Property, s: StringBuilder, res: StringBuilder, prefix: String) = {
    var currentname: String = thi.getName
    if ("class".equals(currentname) && Util.hasEcoreTag(thi)) {
      currentname = currentname + "_"
    }
  	//Cas des collections uml
    if ((thi.getUpper > 1 || thi.getUpper == -1) && "uml".equals(thi.eContainer.eContainer.asInstanceOf[NamedElement].getName)) {
      currentname = getUmlExtension(thi)
    }
    
    res.append("this.")
   
    var baseName = currentname.substring(0, 1).toUpperCase + currentname.substring(1, currentname.size)
    var useIs = false
    var useGet = true
    if (Util.hasEcoreTag(thi)){
    	var s: StringBuilder = new StringBuilder
    	visit(thi.getType(),s)
    	if (s.toString.equals("Boolean") || s.toString.equals("java.lang.Boolean") ||  s.toString.equals("_root_.java.lang.Boolean") || s.toString.equals("kermeta.standard.Boolean")|| s.toString.equals("_root_.kermeta.standard.Boolean")) {
    	  val classQualifiedName = getQualifiedNamedBase(thi.eContainer.asInstanceOf[ClassDefinition])
    	  if(Util.doesMethodExists(classQualifiedName, "is"+baseName)) {
	    	useIs = true
	    	log.debug(classQualifiedName+"."+"is"+baseName + " found in additional classpath")
    	  }
    	  else{
    	    if(Util.doesMethodExists(classQualifiedName, "get"+baseName)) {
		    	useGet = true
		    	log.debug(classQualifiedName+"."+"get"+baseName + " found in additional classpath")
    	    }
    	    else{
    	      useGet = false
    	      // probably a UML case
    		  log.debug("neither " +classQualifiedName+"."+"is"+baseName + " nor "+classQualifiedName+"."+"get"+baseName + " found in additional classpath")
    		  // use to original attribute name
    		  baseName = currentname
    	    }
    	  }
    	}
    }
    if (useIs) {
      res.append(prefix + "is")    
    } else if (useGet) {
      res.append(prefix + "get")
    }

    

    res.append(baseName + "()")

  }

  def generateScalGet(thi: Property, res: StringBuilder, prefix: String): Unit = {
    var s: StringBuilder = new StringBuilder
    visit(thi.getType(),s)

    res.append("def " + GlobalConfiguration.scalaPrefix)
    //        res.append(thi.getName+"")
    res.append(thi.getName + "")
    res.append(" : ")
    getListorType(thi, res)
    res.append("={")
    if (thi.getGetterBody == null) {
      // For reflexivity

      if (thi.getUpper > 1 || thi.getUpper == -1) {

        //if (thi.getEmployees()==null) thi.setEmployees(new java.util.ArrayList[_root_.system.corporate.Employee]);
        if (Util.hasEcoreFromAPITag(thi.eContainer.asInstanceOf[KermetaModelElement])) {
          res.append(" if (")
          var res1 = new StringBuilder
          getGetter(thi, s, res1, prefix)
          res.append(res1.toString)
          res.append(" == null ) ")
          res.append(res1.toString.replace("this.get", "this.set").replace("()", "("))
          if (thi.getIsOrdered == null || thi.getIsOrdered) {
            if(thi.getIsUnique() == null || thi.getIsUnique())
              res.append("k2.standard.KerRichFactory.createOrderedSet[")
            else
              res.append("k2.standard.KerRichFactory.createSequence[")
          } else {
            if(thi.getIsUnique() == null || thi.getIsUnique())
              res.append("k2.standard.KerRichFactory.createSet[")
            else
              res.append("k2.standard.KerRichFactory.createBag[")
          }
          res.append(s.toString + "]);")
        }
        
        if (thi.getIsOrdered == null || thi.getIsOrdered) {
          if(thi.getIsUnique() == null || thi.getIsUnique())
            res.append("new k2.standard.RichKermetaOrderedSet[")
          else
            res.append("new k2.standard.RichKermetaSequence[")
        } else {
          if(thi.getIsUnique() == null || thi.getIsUnique())
            res.append("new k2.standard.RichKermetaSet[")
          else
            res.append("new k2.standard.RichKermetaBag[")
        }
        visit(thi.getType(),res)
        res.append("](")
      }

      if ("uml".equals(thi.eContainer.eContainer.asInstanceOf[NamedElement].getName) && (s.toString.equals("Boolean") || s.toString.equals("java.lang.Boolean") || s.toString.equals("kermeta.standard.Boolean"))) {
        if (thi.getName.startsWith("is"))
          res.append("this." + thi.getName + "()")
        else if (thi.getUpper > 1 || thi.getUpper == -1) {
          res.append("this.get")
          res.append(thi.getName.substring(0, 1).toUpperCase() + thi.getName.substring(1, thi.getName.length) + "s()")
        } else {
          res.append("this.is")
          res.append(thi.getName.substring(0, 1).toUpperCase() + thi.getName.substring(1, thi.getName.length) + "()")
        }

      } else {
        getGetter(thi, s, res, prefix)
      } // For reflexivity
      if (thi.getUpper > 1 || thi.getUpper == -1) {
        res.append(")")
      }
      res.append("}")
    } else {
      res.append("var `~result` : ")
      getListorType(thi, res)
      //res append "Any"
      res.append(" = null.asInstanceOf[")
      getListorType(thi, res)
      res.append("]; \n")

      res.append(visit(thi.getGetterBody, res))
      res append " \n return `~result`\n}"

      //            res.append("\n}")
    }
    var typestring = new StringBuilder
    getListorType(thi, typestring)
    res.append(".asInstanceOf[" + typestring.toString + "]")
    res.append("\n")

  }

  def generateSet(thi: Property, res: StringBuilder, prefix: String): Unit = {
    if (!(thi.getIsReadOnly() != null && thi.getIsReadOnly())) {
      res.append("def " + prefix + "set")
      res.append(thi.getName.substring(0, 1).toUpperCase + thi.getName.substring(1, thi.getName.size) + "(arg:")
      getListorType(thi, res)
      res.append(")={ this." + Util.protectScalaKeyword(thi.getName()) + " = arg}")
      res.append("\n")
    }
  }

  def getUmlExtension(thi: Property): String = {
    var currentname: String = thi.getName
    if (currentname.endsWith("s")) {
      currentname = currentname + "es"
    } else if (currentname.endsWith("coveredBy")) {
      currentname = currentname + "s"
    } else if (currentname.endsWith("data") || currentname.endsWith("Data")) {
    } else if (currentname.endsWith("y")) {
      currentname = currentname.substring(0, currentname.size - 1) + "ies"
    } else if (currentname.endsWith("ex")) {
      currentname = currentname.substring(0, currentname.size - 2) + "ices"
    } else {
      currentname = currentname + "s"
    }
    return currentname

  }

  def generateScalSet(thi: Property, res: StringBuilder, prefix: String): Unit = {
    if (!(thi.getIsReadOnly() != null &&thi.getIsReadOnly())) {
      var currentname: String = thi.getName

      if (("uml".equals(thi.eContainer.eContainer.asInstanceOf[NamedElement].getName)) && ("class".equals(currentname))) {
        currentname = currentname + "_"
      } /*else if ("class_".equals(currentname)){
              currentname = "class"
              }*/
      //println(thi.getName)
      res.append("def " + GlobalConfiguration.scalaPrefix)
      res.append(thi.getName + "_=(")
      res.append("`~value` : ")
      var listType = new StringBuilder
      getListorType(thi, listType)
      res.append(listType.toString)
      res.append(")={")
      if (thi.getGetterBody == null && thi.getSetterBody == null) {
        //res.append(")={thi.set" + thi.getName.substring(0,1).toUpperCase + thi.getName.substring(1,thi.getName.size) + "(arg)" + "}")
        if (thi.getUpper > 1 || thi.getUpper == -1) {
          //Cas des collections uml
          if ("uml".equals(thi.eContainer.eContainer.asInstanceOf[NamedElement].getName)) {
            currentname = getUmlExtension(thi)
          }
          res.append("this." + prefix + "get" + currentname.substring(0, 1).toUpperCase + currentname.substring(1, currentname.size) + "().clear\n")
          if (isCollectionOfObject(listType.toString) && Util.hasEcoreTag(thi))
            res.append("`~value`.each(e=> this.get" + currentname.substring(0, 1).toUpperCase + currentname.substring(1, currentname.size) + "().add(e.asInstanceOf[org.kermeta.language.structure.Object]))\n")
          else
            res.append("this." + prefix + "get" + currentname.substring(0, 1).toUpperCase + currentname.substring(1, currentname.size) + "().addAll(`~value`)\n")
        } else {
          res.append("this." + prefix + "set" + currentname.substring(0, 1).toUpperCase + currentname.substring(1, currentname.size) + "(`~value`)")
        }
      } else {
        if (thi.getSetterBody != null) {

          visit(thi.getSetterBody, res)
        }

      }
      res.append("}\n")

    }
  }
  
  def isCollectionOfObject(listType:String):Boolean={
    listType.equals("k2.standard.KermetaOrderedSet[_root_.java.lang.Object]") ||
      listType.equals("k2.standard.KermetaSequence[_root_.java.lang.Object]") ||
      listType.equals("k2.standard.KermetaSet[_root_.java.lang.Object]") ||
      listType.equals("k2.standard.KermetaBag[_root_.java.lang.Object]")
  }

  def getListorType(thi: Property, res: StringBuilder) = {
    if (thi.getUpper > 1 || thi.getUpper == -1) {
      if (thi.getIsOrdered == null || thi.getIsOrdered) {
        if(thi.getIsUnique() == null || thi.getIsUnique())
          res.append("k2.standard.KermetaOrderedSet[")
        else
          res.append("k2.standard.KermetaSequence[")
      } else {
        if(thi.getIsUnique() == null || thi.getIsUnique())
          res.append("k2.standard.KermetaSet[")
        else
          res.append("k2.standard.KermetaBag[")
      }
      visit(thi.getType(),res)
      res.append("]")
    } else {
      visit(thi.getType(),res)
    }

  }
}
