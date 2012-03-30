package org.kermeta.kompren.resolver
import org.eclipse.emf.ecore.EcoreFactory
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import org.eclipse.emf.common.util.URI
import java.util.Map
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.common.util.EList
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EClass
import scala.collection.JavaConversions._
import org.eclipse.emf.ecore.EStructuralFeature
import org.eclipse.emf.ecore.ENamedElement
import org.eclipse.emf.ecore.EClassifier
import org.kermeta.kompren.slicing.Slicer
import org.kermeta.kompren.slicing.SlicedClass
import org.kermeta.kompren.slicing.SlicedProperty
import java.io.File


object SlicerResolver {
	def resolve(slicer : Slicer, uriSlicerTxtModel : String) {
	  val metamodel = resolveMetamodel(slicer.getUriMetamodel, uriSlicerTxtModel)
	  
	  resolveSlicedClasses(slicer, metamodel)
	  resolveSlicedProperties(slicer, metamodel)
	  resolveRadiuses(slicer)
	  resolveInputs(slicer)
	}
	
	
	private def resolveInputs(slicer : Slicer) = {
	  var inputs = List[EClass]()
	  
	  slicer.getInputClasses.foreach{input =>
		val res = slicer.getSlicedElements.find{_ match {
		  case sc : SlicedClass => getQualifiedPath(sc.getDomain)==input.getName
		  case _ => false
		}}
	    
		res match {
			case Some(elt) if(elt.isInstanceOf[SlicedClass]) => inputs = inputs ++ List(elt.asInstanceOf[SlicedClass].getDomain)
			case _ => println("INPUT CLASS NOT RESOLVED: " + input.getName)
		}
	  }
	  
	  slicer.getInputClasses.clear
	  slicer.getInputClasses.addAll(inputs)
	}
	
	
	private def resolveRadiuses(slicer : Slicer) = {
	  var focusedClasses = List[SlicedClass]()
	  
	  if(slicer.getRadius!=null) {
		  slicer.getRadius.getFocusedClasses.foreach{fc =>
		      val res = slicer.getSlicedElements.find{_ match {
		        case sc : SlicedClass => getQualifiedPath(sc.getDomain)==fc.getDomain.getName
		        case _ => false
		      }}
		      
		      res match {
		        case Some(elt) if(elt.isInstanceOf[SlicedClass]) => focusedClasses = focusedClasses ++ List(elt.asInstanceOf[SlicedClass])
		        case _ => println("RADIUS CLASS NOT RESOLVED: " + fc.getDomain.getName)
		      }
		    }
		    
		    slicer.getRadius.getFocusedClasses.clear
		    slicer.getRadius.getFocusedClasses.addAll(focusedClasses)
	  }
	}
	
	
	private def getQualifiedPath(elt : ENamedElement) : String = {
		var superElt : ENamedElement = null
		
		elt match {
		  case eclass : EClassifier => 
		    getQualifiedPath(eclass.getEPackage) match {
		      case "" => eclass.getName
		      case str => str + "." + eclass.getName
		    }
		  case pkg : EPackage =>
  		    getQualifiedPath(pkg.getESuperPackage) match {
		      case "" => pkg.getName
		      case str => str + "." + pkg.getName
		    }
		  case _ => ""
		}
	}
	
	
	
	private def resolveSlicedProperties(slicer : Slicer, metamodel : EList[EObject]) = {
	  slicer.getSlicedElements.foreach{_ match {
	    case sp : SlicedProperty =>
		    val names = sp.getDomain.getName.split("\\.")
		    val size = names.size
		    val className = names.last
		    
		  	val res = metamodel.get(0).eAllContents.find{_ match {
		  	  case eref : EStructuralFeature if(isMatchingStructuralFeature(names, eref)) => 
	    			sp.setDomain(eref)
	    			if(sp.getSrc!=null)
	    			  sp.getSrc.setType(eref.getEContainingClass)
	    			if(sp.getTgt!=null)
	    			  sp.getTgt.setType(eref.getEType.asInstanceOf[EClass])//FIXME un-safe cast
	    			  
	    			 true
		  	  case _ => false
		  	}}
		    
		    if(!res.isDefined)
		      println("SLICED PROPERTY NOT RESOLVED: " + sp.getDomain.getName)
	    case _ =>
	  }}
	}

	
	private def isMatchingStructuralFeature(names : Array[String], eref : EStructuralFeature) : Boolean = {
	   val size = names.size

	   size>1 && eref.getName==names.last &&  eref.getEContainingClass!=null && eref.getEContainingClass.getName==names(size-2) &&
	   isMatchingPackages(names, size-3, eref.getEContainingClass.getEPackage)
	}
	
	
	private def resolveSlicedClasses(slicer : Slicer, metamodel : EList[EObject]) = {
	  slicer.getSlicedElements.foreach{_ match {
	    case sc : SlicedClass =>
		    val names = sc.getDomain.getName.split("\\.")
		    val size = names.size
		    val className = names.last
		    
		  	val res = metamodel.get(0).eAllContents().find{_ match {
		  	  case eclass : EClass if(eclass.getName==className && isMatchingPackages(names, size-2, eclass.getEPackage)) => 
		  	    			sc.setDomain(eclass)
		  	    			if(sc.getCtx!=null)
		  	    			  sc.getCtx.setType(eclass)
		  	    			  
		  	    			true
		  	  case _ => false
		  	}}
		    
		    if(!res.isDefined)
		      println("SLICED CLASS NOT RESOLVED: " + sc.getDomain.getName)
	    case _ =>
	  }}
	}
	
	
	private def isMatchingPackages(pkgs : Array[String], position : Integer, pkg : EPackage) : Boolean =
		(pkg==null && position<0) || (position>=0 && pkg.getName==pkgs(position) && isMatchingPackages(pkgs, position-1, pkg.getESuperPackage))	  
	

	private def resolveMetamodel(uri : String, uriSlicerTxtModel : String) : EList[EObject] = {
	  val relativeUri = new java.net.URI(uriSlicerTxtModel).relativize(new java.net.URI(uri))
	  val pathParent = new File(uriSlicerTxtModel).getParentFile().getPath
	  
	  val map = Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap()
	  map.put("ecore", new XMIResourceFactoryImpl())
	  val resSet : ResourceSet = new ResourceSetImpl()
	  val res : Resource = resSet.getResource(URI.createFileURI(pathParent + File.separator + relativeUri.getPath), true)
	  
	  res.getContents
	}
}

