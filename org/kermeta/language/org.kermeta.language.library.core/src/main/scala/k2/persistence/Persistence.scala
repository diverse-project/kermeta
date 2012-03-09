package k2.persistence

import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.EPackage
import k2.io.StdIO
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.emf.ecore.EObject

/**
 * Created by IntelliJ IDEA.
 * User: barais
 * Date: 14/03/11
 * Time: 17:53
 * To change this template use File | Settings | File Templates.
 */


object EcorePackages{
    private var packs : java.util.HashMap[String,EPackage]= new java.util.HashMap[String,EPackage]()

    def getPacks() : java.util.HashMap[String,EPackage] = {
        packs
    }
    var workspaceURI : String = _
    var pluginURI : String = _

}


class RichResource(value: _root_.org.eclipse.emf.ecore.resource.Resource) extends k2.standard.EObjectImplForKO{
	 def load(options : java.util.Map[Object,Object]) : Any = value.load(options)
	 def save(options : java.util.Map[Object,Object]) : Any = {
	   // safe safe, automatically patch the resulting resource
	   try {
			value.save( options);
		}
	   catch {
	   		case e : java.lang.Exception => {
	   			StdIO.errorln("Received Exception while saving "+e)
	   			val unresolvedMap = EcoreUtil.ExternalCrossReferencer.find(value);
	   			val i : java.util.Iterator[EObject] = unresolvedMap.keySet().iterator
	   			while (i.hasNext){
	   				val myEobject = i.next
	   				StdIO.errorln("Patching dangling element "+myEobject+ 
						" referenced by "+unresolvedMap.get(myEobject) +
						"\nthe dangling element is added to the root of the resource for debug purpose")
					value.getContents().add(myEobject);
	   			}				
	   			StdIO.writeln("Retrying to save .... ")
	   			value.save( options);
	   		}
	 		case e => { throw e}
		}
	 }
	 def load() : Any = value.load(new java.util.HashMap[Any,Any]())
	 def save() : Any = this.save(new java.util.HashMap[Object,Object]())
	 def delete(arg0:java.util.Map[Object,Object]) : Any = value.delete(arg0)
	 def unload() : Any = value.unload()
	 def getURI() : org.eclipse.emf.common.util.URI = value.getURI()
	 def getAllContents() : org.eclipse.emf.common.util.TreeIterator[_root_.org.eclipse.emf.ecore.EObject] = value.getAllContents()
	 
	 // specific method that uses a proxy collection in order to retrurn the correct kermeta objects (otherwise we get compilation errors
	 // when using the functions on such collection (ex: each)
	 def kgetContents() : k2.standard.KermetaListProxy[_root_.k2.standard.KermetaObject] = new k2.standard.KermetaListProxy[_root_.k2.standard.KermetaObject](value.getContents())
	 
	 def getEObject(arg0:java.lang.String) : org.eclipse.emf.ecore.EObject = value.getEObject(arg0)
	 def getErrors() : org.eclipse.emf.common.util.EList[_root_.org.eclipse.emf.ecore.resource.Resource.Diagnostic] = value.getErrors()
	 def getResourceSet() : org.eclipse.emf.ecore.resource.ResourceSet = value.getResourceSet()
	 def getTimeStamp() : Long = value.getTimeStamp()
	 def getURIFragment(arg0:org.eclipse.emf.ecore.EObject) : java.lang.String = value.getURIFragment(arg0)
	 def getWarnings() : org.eclipse.emf.common.util.EList[_root_.org.eclipse.emf.ecore.resource.Resource.Diagnostic] = value.getWarnings()
	 def isLoaded() : Boolean = value.isLoaded()
	 def isModified() : Boolean = value.isModified()
	 def isTrackingModification() : Boolean = value.isTrackingModification()
	 def setModified(arg0:Boolean) : Any = value.setModified(arg0)
	 def setTimeStamp(arg0:Long) : Any = value.setTimeStamp(arg0)
	 def setTrackingModification(arg0:Boolean) : Any = value.setTrackingModification(arg0)
	 def setURI(arg0:org.eclipse.emf.common.util.URI) : Any = value.setURI(arg0)
	 def eAdapters() : org.eclipse.emf.common.util.EList[_root_.org.eclipse.emf.common.notify.Adapter] = value.eAdapters()
	 def eDeliver() : Boolean = value.eDeliver()
	 def eSetDeliver(arg0:Boolean) : Unit = value.eSetDeliver(arg0)
}
class RichResourceSet(value: ResourceSet) extends k2.standard.EObjectImplForKO{
	 def getResource(arg0:org.eclipse.emf.common.util.URI,arg1:Boolean) : org.eclipse.emf.ecore.resource.Resource = value.getResource(arg0,arg1)
	 def getResource(arg0:java.lang.String,arg1:Boolean) : org.eclipse.emf.ecore.resource.Resource = value.getResource(org.eclipse.emf.common.util.URI.createURI(arg0),arg1)
	 def getResources() : org.eclipse.emf.common.util.EList[_root_.org.eclipse.emf.ecore.resource.Resource] = value.getResources()
	 def getAllContents() : org.eclipse.emf.common.util.TreeIterator[_root_.org.eclipse.emf.common.notify.Notifier] = value.getAllContents()
	 def getEObject(arg0:org.eclipse.emf.common.util.URI,arg1:Boolean) : org.eclipse.emf.ecore.EObject = value.getEObject(arg0,arg1)
	 def createResource(arg0:org.eclipse.emf.common.util.URI) : org.eclipse.emf.ecore.resource.Resource = value.createResource(arg0)
	 def createResource(arg0:org.eclipse.emf.common.util.URI,arg1:java.lang.String) : org.eclipse.emf.ecore.resource.Resource = value.createResource(arg0,arg1)
	 def createResource(arg0:java.lang.String) : org.eclipse.emf.ecore.resource.Resource = value.createResource(org.eclipse.emf.common.util.URI.createURI(arg0))
	 def createResource(arg0:java.lang.String,arg1:java.lang.String) : org.eclipse.emf.ecore.resource.Resource = value.createResource(org.eclipse.emf.common.util.URI.createURI(arg0),arg1)
	 def getAdapterFactories() : org.eclipse.emf.common.util.EList[_root_.org.eclipse.emf.common.notify.AdapterFactory] = value.getAdapterFactories()
	 def getLoadOptions() : java.util.Map[Object,Object] = value.getLoadOptions()
	 def eAdapters() : org.eclipse.emf.common.util.EList[_root_.org.eclipse.emf.common.notify.Adapter] = value.eAdapters()
	 def eDeliver() : Boolean = value.eDeliver()
	 def eSetDeliver(arg0:Boolean) : Unit = value.eSetDeliver(arg0)
   def resolveAllProxies() : Unit = org.eclipse.emf.ecore.util.EcoreUtil.resolveAll(value)
}
