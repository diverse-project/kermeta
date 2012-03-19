/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package k2.standard

import scala._
import scala.collection.JavaConversions._
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.{EStructuralFeature, EClass}
import org.eclipse.emf.ecore.EObject
import k2.persistence.RichResource

trait KermetaObjectAspect extends    KermetaObject
trait KermetaObject extends org.eclipse.emf.ecore.EObject{
	
	def `assert`(test : Boolean) = { 
		if(!test) {
			throw new AssertionError("Assertation failed.")
		}
	}

	def equals(element : Any) : Boolean
	//def isNotEqual(element : Any) : Boolean = !this.equals(element)

	def isSet(property : org.kermeta.language.structure.Property) : Boolean ={
		return this.get(property)!=null
	}

	def containingResource() : RichResource = {
	  return new RichResource(eResource())
	}
	
	def removeFromContainer()  = {org.eclipse.emf.ecore.util.EcoreUtil.remove(this)}
	
  //TODO
	def invoke(op:org.kermeta.language.structure.Operation , args:java.util.List[k2.standard.KermetaObject]) ={
//		throw new RuntimeException("Operation invoke is not yet implemented.")
		if(args.length != 0)
		  throw new RuntimeException("Invoking operations with multiple arguments is not yet implemented.")
		var optionMeth : Option[java.lang.reflect.Method] = this.getClass().getMethods.find(m => m.getName() == op.getName()
		    && m.getParameterTypes().length == args.length)
		optionMeth match{
		  case Some(meth) => {meth.invoke(this)}
		  case None => {throw new NoSuchMethodException}
		}
		//TODO
		/* code for taking multiple argument
		var optionMeth : Option[java.lang.reflect.Method] = this.getClass().getMethods.find(m => m.getName() == op.getName()
		    && m.getParameterTypes().length == args.length)
		optionMeth match{
		  case None => {throw new NoSuchMethodException}
		  case Some(meth) => {
			  var argsTab : Array[AnyRef] = args.toArray()
		      meth.invoke(this, argsTab) //not working
		      //TODO : take into account the special case of arguments inheriting from RichValueType and RichEnum
		  }
		}*/
	}


  //FIXME GENERICS
  def isSuperTypeOf(ty : org.kermeta.language.structure.Type) : java.lang.Boolean = {
	if(this.isInstanceOf[org.kermeta.language.structure.Class] && ty.isInstanceOf[org.kermeta.language.structure.Class]) {
	      val thisclass = this.asInstanceOf[org.kermeta.language.structure.Class]
	      val clclass   = ty.asInstanceOf[org.kermeta.language.structure.Class]

          k2.utils.UTilScala.getQualifiedNameClassKermeta(clclass.getTypeDefinition,"::")==
          k2.utils.UTilScala.getQualifiedNameClassKermeta(thisclass.getTypeDefinition,"::") match {
	    	  case true => true
	    	  case false => clclass.getTypeDefinition.asInstanceOf[org.kermeta.language.structure.ClassDefinition].
	    	  				getSuperType.exists(e=> this.isSuperTypeOf(e))
	      }
	}
	false
  }


//	 def getOwnedTags():org.eclipse.emf.common.util.EList[org.k2.language.structure.Tag]=null;
//	 def getTag():org.eclipse.emf.common.util.EList[org.k2.language.structure.Tag]=null;

  def getMetaClass() : org.kermeta.language.structure.Class= null//this.eClass()
  //def classDefinition = this.asInstanceOf[EClass]
  //def ScalaclassDefinition = classDefinition
  def typedefinition = this
  def container() = this.eContainer().asInstanceOf[KermetaObject]
  //override def equals(o : Any) : Boolean = o == this /*TODO Need clearer explanations*/
  def equals(o : KermetaObject):java.lang.Boolean = o == this

  def isNotEqual(o : Any) : Boolean = !equals(o)

  def isDirectInstanceOf(cl : org.kermeta.language.structure.Class) : java.lang.Boolean = {//FIXME GENERICS
	  this match {
		  case thisClass : org.kermeta.language.structure.Class =>
		  k2.utils.UTilScala.getQualifiedNameClassKermeta(cl.getTypeDefinition,"::")==
		  k2.utils.UTilScala.getQualifiedNameClassKermeta(this.asInstanceOf[org.kermeta.language.structure.Class].getTypeDefinition,"::")
		  case _ => false
	  }
  }

  def isKindOf(cl : org.kermeta.language.structure.Class) : java.lang.Boolean = {//FIXME GENERICS
	  if(this.isInstanceOf[org.kermeta.language.structure.Class] && cl.isInstanceOf[KermetaObject])
		  cl.asInstanceOf[KermetaObject].isSuperTypeOf(this.asInstanceOf[org.kermeta.language.structure.Class])

	  false
  }

  def get(prop : org.kermeta.language.structure.Property) :java.lang.Object= {
    if (prop == null){
      println ("prop est null aie")
      return null
    }


    var meth : java.lang.reflect.Method = this.getClass().getMethod("Scala"+prop.getName)
    if (meth == null){
      println ("meth is null " + prop.getName + "  " + this + " " + this.getClass)
    }
    var o =  meth.invoke(this)
        return o;
/*    if (o != null && o.isInstanceOf[java.lang.String]){
      return new k2.standard.RichString(o.asInstanceOf[java.lang.String])
    }
    else if (o != null && o.isInstanceOf[java.lang.Boolean]){
      return new k2.standard.RichJavaBoolean(o.asInstanceOf[java.lang.Boolean])
    }
    else if (o != null && o.isInstanceOf[java.lang.Integer]){
      return new k2.standard.RichInteger(o.asInstanceOf[java.lang.Integer].intValue)
    }

    if ( o.isInstanceOf[org.k2.language.structure.Object])
      return o.asInstanceOf[org.k2.language.structure.Object]
    else if (o!=null)
    {println("cannot convert " + o.getClass + " for property " + prop.getName)
     null.asInstanceOf[org.k2.language.structure.Object]}
    else
      null.asInstanceOf[org.k2.language.structure.Object]*/
  }

  def set(prop : org.kermeta.language.structure.Property,o : java.lang.Object) = {
    var m : java.lang.reflect.Method = null
    m = this.getClass().getMethods.filter(m1=>  { m1.getName.equals("Scala"+prop.getName+"_$eq")}).apply(0)
    if (m!= null){
      var numbers: Array[_<:java.lang.Object] = null
      if (o.isInstanceOf[k2.standard.RichValueType[_]])
        numbers = Array(o.asInstanceOf[k2.standard.RichValueType[_]].getValue)
      else if (m.getParameterTypes.first.getName.equals("int") && o == null){
        numbers = Array(new java.lang.Integer(0))
      }
      else if (o != null && o.isInstanceOf[k2.standard.RichInteger]){
        numbers = Array(o.asInstanceOf[k2.standard.RichInteger].getValue)
      }
      else
        numbers = Array(o)
      m.invoke(this,numbers: _*)
    }

  }


  def isSet(prop : EStructuralFeature) =  this.eIsSet(prop)
  def unset(prop : org.kermeta.language.structure.Property) = {
    var allStructualF = this.eClass.getEAllStructuralFeatures
    var sf = allStructualF.find({sf=> sf.getName.equals(prop.getName) })

    sf match {
      case Some(sf) => this.eUnset(sf)
      case None => println("Reflexivity Error KM FW")
    }


    // var structuralF = this.eClass.getEAllStructuralFeatures.toget(prop)
    //this.eUnset(structuralF);
  }
  def unset(prop : EStructuralFeature) = this.eUnset(prop);
  def oid() : Int = this.hashCode()
  override def toString : String = super.toString()//"["+this.eClass().getName()+":"+oid.toString()+"]"
  def isVoid() : Boolean = false
  def hashcode : Int = this.hashCode()
  def getKerMetaClass(): java.lang.Class[_] =this.getClass
  //def asType(t : EClass) = this.asInstanceOf[t.getName]
  //def isInstanceOf(t : EClass) = this.isInstanceOf(t.getMetaClass().getName)
	





  /* Default Method Overloaded in by each class definition */
  def checkInvariants() = {
	  //TODO
  }
  def checkAllInvariants() = { /*TODO*/ //println("todo checkAllInvariant") }

    checkInvariants()

  }
  var constraintDiagnostic : k2.exceptions.ConstraintsDiagnostic = _

  def getViolatedConstraints() : k2.exceptions.ConstraintsDiagnostic={
    /*TODO*/ println("todo getViolatedConstraints "+ constraintDiagnostic); return constraintDiagnostic;
  }



}

