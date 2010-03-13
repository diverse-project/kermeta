package fr.irisa.triskell.kermeta.language.structureScalaAspect.aspect

import org.eclipse.emf.ecore._
import org.eclipse.emf.ecore.impl._

class ClassDefinitionWrapper extends  fr.irisa.triskell.kermeta.language.structure.impl.ClassDefinitionImpl{

    var classdef:org.eclipse.emf.ecore.EClass =_
    def Scalaname : java.lang.String={classdef.getName()}.asInstanceOf[java.lang.String]
def Scalaname_=(arg : java.lang.String)={classdef.setName(arg)}

    def qualifiedName():java.lang.String = {
        return qualifiedName(classdef.getEPackage)  + "." + this.getName
    }
    def qualifiedName(pack: EPackage):java.lang.String = {
        if (pack.getESuperPackage !=null){
            return  qualifiedName(pack.getESuperPackage) + "." + pack.getName
        }
        return pack.getName;
    }

}





