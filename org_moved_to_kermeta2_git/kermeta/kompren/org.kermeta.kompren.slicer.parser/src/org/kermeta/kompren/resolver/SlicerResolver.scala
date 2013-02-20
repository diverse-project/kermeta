package org.kermeta.kompren.resolver

import java.io.File

import scala.collection.JavaConversions.asScalaBuffer
import scala.collection.JavaConversions.asScalaIterator
import scala.collection.JavaConversions.seqAsJavaList

import org.eclipse.emf.common.util.EList
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EClassifier
import org.eclipse.emf.ecore.ENamedElement
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.EStructuralFeature

import org2.kermeta.kompren.slicer.SlicedClass
import org2.kermeta.kompren.slicer.SlicedProperty
import org2.kermeta.kompren.slicer.Slicer

object SlicerResolver {
	def resolve(slicer : Slicer, uriSlicerTxtModel : String) {
	  val metamodel = resolveMetamodel(slicer.getUriMetamodel, uriSlicerTxtModel)
	  
	  resolveSlicedClasses(slicer, metamodel)
	  resolveSlicedProperties(slicer, metamodel)
	  resolveRadiuses(slicer)
	  resolveInputs(slicer, metamodel)
	}
	
	
	private def resolveInputs(slicer : Slicer, metamodel : EList[EObject]) {
	  var inputs = List[EClass]()
	  
	  slicer.getInputClasses.foreach{input =>
		getResolvedEClass(metamodel, input.getName) match {
			case Some(elt) => inputs = inputs ++ List(elt)
			case _ => println("INPUT CLASS NOT RESOLVED: " + input.getName)
		}
	  }
	  
	  slicer.getInputClasses.clear
	  slicer.getInputClasses.addAll(inputs)
	}
	
	
	private def resolveRadiuses(slicer : Slicer) {
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
	
	
	
	private def resolveSlicedProperties(slicer : Slicer, metamodel : EList[EObject]) {
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
	
	
	private def getResolvedEClass(metamodel : EList[EObject], fullclassName : String) : Option[EClass] = {
	    val names = fullclassName.split("\\.")
	    val size = names.size
	    val className = names.last		

	  	val res = metamodel.get(0).eAllContents().find{_ match {
	  	  case eclass : EClass if(eclass.getName==className && isMatchingPackages(names, size-2, eclass.getEPackage)) => true
	  	  case _ => false
	  	}}

	    if(res.isDefined)
	    	Some(res.get.asInstanceOf[EClass])
	    else
	    	None
	}
	
	
	
	private def resolveSlicedClasses(slicer : Slicer, metamodel : EList[EObject]) {
	  slicer.getSlicedElements.foreach{_ match {
	    case sc : SlicedClass =>
	    	getResolvedEClass(metamodel, sc.getDomain.getName) match {
	    		case Some(value) =>
	    			sc.setDomain(value)
	    			if(sc.getCtx!=null)
  	    				sc.getCtx.setType(value)
	    		case None => println("SLICED CLASS NOT RESOLVED: " + sc.getDomain.getName)
	    	}
	    case _ =>
	  }}
	}
	
	
	private def isMatchingPackages(pkgs : Array[String], position : Integer, pkg : EPackage) : Boolean =
		(pkg==null && position<0) || (position>=0 && pkg.getName==pkgs(position) && isMatchingPackages(pkgs, position-1, pkg.getESuperPackage))	  
	

	private def resolveMetamodel(uri : String, uriSlicerTxtModel : String) : EList[EObject] = {
		val map = Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap()
		map.put("ecore", new XMIResourceFactoryImpl())
		val resSet : ResourceSet = new ResourceSetImpl()
		var res : Resource = null
		  
		if(uri.startsWith("platform:/"))
			res = resSet.getResource(URI.createURI(uri), true)
		else {
			val relativeUri = new java.net.URI(uriSlicerTxtModel).relativize(new java.net.URI(uri))
			val pathParent = new File(uriSlicerTxtModel).getParentFile().getPath
			res = resSet.getResource(URI.createFileURI(pathParent + File.separator + relativeUri.getPath), true)			
		}
			
	  return res.getContents
	}
}
