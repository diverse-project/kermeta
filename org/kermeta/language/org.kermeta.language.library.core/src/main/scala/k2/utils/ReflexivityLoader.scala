/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package k2.utils

import org.kermeta.language.structure.ModelingUnit
import org.kermeta.language.structure.ClassDefinition
import org.kermeta.language.structure.StructurePackage
import java.io.File
import java.io.FileInputStream
import java.io.FileOutputStream
import org.eclipse.emf.common.util.TreeIterator
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import _root_.org.osgi.framework.BundleContext
/*object ReflexivityLoader {

    var isInit:Boolean = false;

    var classdefs :java.util.List[ClassDefinition]=new java.util.ArrayList[ClassDefinition]()


    def getMetaClass(classQualifiedName: String) :  org.kermeta.language.structure.ClassDefinition={
        import scala.collection.JavaConversions._
        var classQualifiedName1 = classQualifiedName.replace("_root_.","")
        if (!isInit){
          this.loadKmModel(this.getClass().getClassLoader.getResource("Reflexivity.km").toURI().toString()).foreach(e=>
                if (e.isInstanceOf[ClassDefinition])
                    classdefs .add(e.asInstanceOf[ClassDefinition])
            )
            println("init reflexive layer")
            isInit= true
        }
        var selectedclassdefs = classdefs.filter(e=> qualifiedName(e) .equals(classQualifiedName1))

        if (selectedclassdefs.size>0){
            return selectedclassdefs.get(0);
        }
        else
            return null;
    }

    def qualifiedName(classdef : ClassDefinition):java.lang.String = {
        return qualifiedName(classdef.eContainer.asInstanceOf[ org.kermeta.language.structure.Package])  + "." + classdef.getName
    }
    def qualifiedName(pack:  org.kermeta.language.structure.Package):java.lang.String = {
        if (pack.getNestingPackage !=null){
            return  qualifiedName(pack.getNestingPackage) + "." + pack.getName
        }
        return pack.getName;
    }


    def loadKmModel( uri: String):TreeIterator[EObject] ={
        var rs : ResourceSetImpl = new ResourceSetImpl();
        rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put("*",new XMIResourceFactoryImpl());
        rs.getPackageRegistry().put(StructurePackage.eNS_URI, StructurePackage.eINSTANCE);
        return  rs.getResource(URI.createURI(uri),true).getAllContents();
    }
    def loadKmModelRoot( uri: String):ModelingUnit ={
        var rs : ResourceSetImpl = new ResourceSetImpl();
        rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put("*",new XMIResourceFactoryImpl());
        rs.getPackageRegistry().put(StructurePackage.eNS_URI, StructurePackage.eINSTANCE);
        return  rs.getResource(URI.createURI(uri),true).getContents.get(0).asInstanceOf[ModelingUnit];
    }

    def copyFile(in : File, out  : File) :Unit = {
        var fis : FileInputStream  = new FileInputStream(in);
        var fos : FileOutputStream = new FileOutputStream(out);
        var     buf :Array[Byte]  = new Array[Byte](1024);
        var i :Int= fis.read(buf);
        while (i != -1) {
            fos.write(buf, 0, i);
            i = fis.read(buf);
        }
        if (fis != null) fis.close();
        if (fos != null) fos.close();
    }
}         */
     object ReflexivityLoader {

    var _isInit:Boolean = false;
    def isInit :Boolean = _isInit
     def isInit_=(value: Boolean ) = {_isInit = value};


    var classdefs :java.util.List[ClassDefinition]=new java.util.ArrayList[ClassDefinition]()

    var prefix : String = ""
    def pref_=(arg: String){prefix = arg;isInit=false}

  def pref(arg: String)={prefix = arg;isInit=false}

    var bundleContext : BundleContext = _
    def bundleCtx_=(arg: BundleContext){bundleContext = arg}

  def bundleCtx_(arg: BundleContext)={bundleContext = arg}

  def getMetaClass(classQualifiedName: String) : org.kermeta.language.structure.ClassDefinition={
        import scala.collection.JavaConversions._
        var classQualifiedName1 = classQualifiedName.replace("_root_.","")
        if (!isInit){
          classdefs.clear();
          var c: java.lang.Class[_] = null
          if (bundleContext== null)
            c= this.getClass()
          else
             c= bundleContext.getBundle.loadClass(prefix+"runner.MainRunner")


          if(c.getClassLoader.getResource(prefix + "Reflexivity.km") == null){
            println("Failed to load "+prefix + "Reflexivity.km from "+c.getClassLoader.getResource("").toString)
          }
          this.loadKmModel(c.getClassLoader.getResource(prefix +"Reflexivity.km").toURI().toString()).foreach(e=>
                if (e.isInstanceOf[ClassDefinition])
                    classdefs .add(e.asInstanceOf[ClassDefinition])
            )
            println("init reflexive layer")
            isInit= true
        }
        var selectedclassdefs = classdefs.filter(e=> qualifiedName(e) .equals(classQualifiedName1))

        if (selectedclassdefs.size>0){
            return selectedclassdefs.get(0);
        }
        else
            return null;
    }

    def qualifiedName(classdef : ClassDefinition):java.lang.String = {
        return qualifiedName(classdef.eContainer.asInstanceOf[ org.kermeta.language.structure.Package])  + "." + classdef.getName
    }
    def qualifiedName(pack:  org.kermeta.language.structure.Package):java.lang.String = {
        if (pack.getNestingPackage !=null){
            return  qualifiedName(pack.getNestingPackage) + "." + pack.getName
        }
        return pack.getName;
    }


    def loadKmModel( uri: String):TreeIterator[EObject] ={
        var rs : ResourceSetImpl = new ResourceSetImpl();
        rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put("*",new XMIResourceFactoryImpl());
        rs.getPackageRegistry().put(StructurePackage.eNS_URI, StructurePackage.eINSTANCE);
        return  rs.getResource(URI.createURI(uri),true).getAllContents();
    }
    def loadKmModelRoot( uri: String):ModelingUnit ={
        var rs : ResourceSetImpl = new ResourceSetImpl();
        rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put("*",new XMIResourceFactoryImpl());
        rs.getPackageRegistry().put(StructurePackage.eNS_URI, StructurePackage.eINSTANCE);
        return  rs.getResource(URI.createURI(uri),true).getContents.get(0).asInstanceOf[ModelingUnit];
    }

    def copyFile(in : File, out  : File) :Unit = {
        var fis : FileInputStream  = new FileInputStream(in);
        var fos : FileOutputStream = new FileOutputStream(out);
        var     buf :Array[Byte]  = new Array[Byte](1024);
        var i :Int= fis.read(buf);
        while (i != -1) {
            fos.write(buf, 0, i);
            i = fis.read(buf);
        }
        if (fis != null) fis.close();
        if (fos != null) fos.close();
    }
     }