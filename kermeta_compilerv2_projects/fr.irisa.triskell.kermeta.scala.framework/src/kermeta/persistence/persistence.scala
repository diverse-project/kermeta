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
import org.eclipse.emf.ecore.resource.Resource;
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

abstract class Resource  extends java.util.HashSet[Object] with collectionTraits{
	var dependentResources:Resource=null;
	var contents:Object=null;
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
} 
 

abstract class Repository  extends Object{
	var resources:Resource=null;
	def createResource(uri : String, mm_uri : String) :Resource
	def normalizeUri(uri : String) :String={return uri}
	def findDanglingModelElements() :Set[Object]={return null}
	def getResource(uri : String) :Resource={return null}
}

class EMFRepository  extends Repository with collectionTraits  {
	var useInterpreterInternalResources:Boolean=true;
	var ignoreLoadErrorUnknownMetaclass:Boolean=true;
	var ignoreAllLoadErrors:Boolean=true;
	var ignoreLoadErrorUnknownProperty:Boolean=true;
	def createResource(uri : String, mm_uri : String) :Resource={var res : EMFResource = new EMFResource()  
                                                              res.metaModelURI = mm_uri
                                                              res.uri = uri
                                                              return res}
	def registerEcoreFile(mm_uri : String)={mm_uri}
}


class EMFResource  extends Resource  with collectionTraits{
	override def remove(instance : Object)={super.remove(instance)}
	override  def save()={}
	override def saveWithNewURI(new_uri : String)={ uri = new_uri 
		this.save
	}
	def saveAndValidateWithEMF() :Boolean={save() 
                                        return true}
	def load(){
	var rs :ResourceSet = new ResourceSetImpl(); 
		var f :Resource.Factory.Registry = rs.getResourceFactoryRegistry();
		var m : Map[java.lang.String,Object]  = f.getExtensionToFactoryMap();
		m.put("km",new XMIResourceFactoryImpl());  
		m.put("ecore",new XMIResourceFactoryImpl());
		rs.getPackageRegistry().put(KmPackage.eNS_URI, KmPackage.eINSTANCE); 
		rs.getPackageRegistry().put(EcorePackage.eNS_URI, EcorePackage.eINSTANCE); 
		
		var uri1 :URI = URI.createFileURI(uri);
		var resource :org.eclipse.emf.ecore.resource.Resource  = rs.getResource(uri1, true);
		if (resource.isLoaded() && resource.getContents().size() > 0) {
			this.addAll(resource.getContents());
		} 
		
	}
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

