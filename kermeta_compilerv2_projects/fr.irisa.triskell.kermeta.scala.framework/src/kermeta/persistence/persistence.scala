package kermeta.persistence
 
import kermeta.standard._
import java.io.File; 
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.impl.EcorePackageImpl;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import fr.irisa.triskell.kermeta.KmPackage;
import org.eclipse.emf.ecore._;
import java.lang.String

abstract class Resource  extends java.util.ArrayList[EObject]{
	var dependentResources:Resource=null;
	//var contents:java.util.List[Object]=null;
	var repository:Repository=null;
	var metaModelURI:String="";
	var isReadOnly:Boolean=false;
	var uri:String="";
	def save()  
	def saveWithNewURI(new_uri : String)  
	def findDanglingModelElements() :Set[Object]={return null}
	def load() 
	def instances() :Resource={return this}
	def normalizedUri() :String={return metaModelURI}
	def Scalacontents_=(arg : java.util.List[EObject])={this.clear; this.addAll( arg)}
	def Scalacontents:  java.util.List[EObject]={this}
		
	
	
} 
 

abstract class Repository  extends Object{
	var resources:Resource=null;
	def createResource(uri : String, mm_uri : String) :Resource
	def normalizeUri(uri : String) :String={return uri}
	def findDanglingModelElements() :Set[Object]={return null}
	def getResource(uri : String) :Resource
}

class EMFRepository  extends Repository  {
	var useInterpreterInternalResources:Boolean=true;
	var ignoreLoadErrorUnknownMetaclass:Boolean=true;
	var ignoreAllLoadErrors:Boolean=true;
	var ignoreLoadErrorUnknownProperty:Boolean=true;
	def createResource(uri : String, mm_uri : String) :Resource={var res : EMFResource = new EMFResource()  
                                                              res.metaModelURI = mm_uri
                                                              res.uri = uri
                                                              return res}
	def registerEcoreFile(mm_uri : String)={mm_uri}
	def getResource(uri : String) :Resource={
		var res : EMFResource = new EMFResource()  
        //res.metaModelURI = mm_uri
        res.uri = uri
        
        return res
		
	}

}


class EMFResource  extends Resource  {
		
		var rs:ResourceSetImpl = new ResourceSetImpl(); 
		
		//EcorePackageImpl.init();
		var f:org.eclipse.emf.ecore.resource.Resource.Factory.Registry = rs.getResourceFactoryRegistry();
		
		var m :java.util.Map[String,Object]  = f.getExtensionToFactoryMap();
		//f.get
		
		m.put("ecore",new EcoreResourceFactoryImpl());
		m.put("*",new XMIResourceFactoryImpl());
		
		//m.put("*",new EcoreResourceFactoryImpl());
		
		/*m.put("*",
				new EcoreResourceFactoryImpl() {
					@Override
					public Resource createResource(URI uri) {
						XMIResourceImpl resource = (XMIResourceImpl) super
								.createResource(uri);
						resource.getDefaultLoadOptions().put(
								XMLResource.OPTION_RECORD_UNKNOWN_FEATURE,
								Boolean.TRUE);
						return resource;
					}
				});
*/
		
		//rs.getPackageRegistry().put(/*pack.getNsURI()*/"", pack);
		rs.getPackageRegistry().putAll(EcorePackages.getPacks())
    
	//override def remove(instance : Object)={super.remove(instance)}
	override  def save()={}
	override def saveWithNewURI(new_uri : String)={ uri = new_uri 
		this.save
	}
	def saveAndValidateWithEMF() :Boolean={save() 
                                        return true}
	def load(){
		
		var uri1 :URI = URI.createFileURI(uri)//.replace("platform:/resource/",EcorePackages.workspaceURI).replace("platform:/plugin/",EcorePackages.pluginURI ));
		var resource :org.eclipse.emf.ecore.resource.Resource  = rs.getResource(uri1,true);
		//resource.load(new java.util.HashMap)
		if (resource.isLoaded() && resource.getContents().size() > 0) {
			this.addAll(resource.getContents());
		} 
		
	}
}

object EcorePackages{
	private var packs : java.util.HashMap[String,EPackage]= new java.util.HashMap[String,EPackage]()
	
	def getPacks() : java.util.HashMap[String,EPackage] = {
		packs
	}
	var workspaceURI : String = _
	var pluginURI : String = _

	
}
/*


class DanglingDiagnostic  extends Object  with implicit1{
var referencingElement:Object;
var danglingElement:Object;
var referencingProperty:Property;
def toString() :String={var result : String=null;
{
    result = danglingElement.toString().plus(" referenced by ").plus(referencingElement.toString()).plus(".").plus(referencingProperty.name).plus(" is dangling");
}

return result;
}
}

}*/

