package k2.standard
//import org.k2.language.structure._
//import org.k2.language._
import scala._
import scala.collection.JavaConversions._
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.{EStructuralFeature, EClass}
import k2.exceptions.ConstraintsDiagnostic

//import org.k2.language.behavior._

    
object PrimitiveConversion{
  
  implicit def any2kermeta(o : Any)  =  o match {
    case s:String => new k2.standard.RichString(s)
    case s : java.lang.Boolean => new k2.standard.RichBoolean(s)
    case s : java.lang.Integer => new k2.standard.RichInteger(s.intValue)
    case s:  k2.standard.KermetaObject => s
    case s: java.util.Iterator[_] => new k2.standard.RichIterator(s)
    case s: java.lang.Double => new k2.standard.RichDouble(s)
    case s: java.lang.Float => new k2.standard.RichFloat(s)
    case s:java.lang.StringBuilder => new k2.standard.RichStringBuffer(s)
    case s:java.lang.Short => new k2.standard.RichShort(s)
    case s:java.lang.Long => new k2.standard.RichLong(s)
    case s:java.lang.Character=> new k2.standard.RichCharacter(s)
    case s:org.eclipse.emf.common.util.URI => new k2.standard.RichURI(s)
    case _ =>  
      if (o!=null)
        new k2.standard.RichEnum(o.asInstanceOf[java.lang.Object])
      else
        null.asInstanceOf[k2.standard.EObjectImplForPrimitive]
  }
  
    implicit def string2kermeta(x: String) = new RichString(x)
    implicit def stringbuffer2kermeta(x: java.lang.StringBuilder) = new RichStringBuffer(x)

    implicit def boolean2kermeta(x: Boolean) = new RichBoolean(x)
    // implicit def boolean2javaboolean(x: java.lang.Boolean) : Boolean = {if (x== null) return false else return x.booleanValue()}
    implicit def javaboolean2kermeta(x: java.lang.Boolean) :RichBoolean= {if (x== null) return new RichBoolean(false) else new RichBoolean(x.booleanValue())}
    implicit def iterator2kermeta(x: java.util.Iterator[_])= new RichIterator(x)
    implicit def iteratorEObject2kermeta(x:java.util.Iterator[_<: org.eclipse.emf.ecore.EObject]) :  _root_.java.util.Iterator[Any] =x.asInstanceOf[_root_.java.util.Iterator[Any]]

    implicit def random2kermeta(x: java.util.Random) = new RichRandom(x)
    implicit def integer2kermeta(x: Int) = new RichInteger(x)
    implicit def javainteger2kermeta(x: java.lang.Integer) = new RichInteger(x)
    implicit def kermeta2javainteger(x : RichInteger) = x.getValue
        
    implicit def long2kermeta(x: Long) = new RichLong(x)
    implicit def javalong2kermeta(x: java.lang.Long) = new RichLong(x)
    implicit def kermeta2javalong(x : RichLong) = x.getValue
    
    implicit def short2kermeta(x: Short) = new RichShort(x)
    implicit def javashort2kermeta(x: java.lang.Short) = new RichShort(x)
    implicit def kermeta2javashort(x : RichShort) = x.getValue
    
    implicit def float2kermeta(x: Float) = new RichFloat(x)
    implicit def javafloat2kermeta(x: java.lang.Float) = new RichFloat(x)
    implicit def kermeta2javafloat(x : RichFloat) = x.getValue
    
    implicit def double2kermeta(x: Double) = new RichDouble(x)
    implicit def javadouble2kermeta(x: java.lang.Double) = new RichDouble(x)
    implicit def kermeta2javadouble(x : RichDouble) = x.getValue
    
    implicit def date2kermeta(x: java.util.Date) = new RichDate(x)
    implicit def uri2kermeta(x: org.eclipse.emf.common.util.URI) = new RichURI(x)
    implicit def resource2KerResource(x: org.eclipse.emf.ecore.resource.Resource) = new _root_.k2.persistence.RichResource(x)
    implicit def resourceset2KerResourceset(x: org.eclipse.emf.ecore.resource.ResourceSet) = new _root_.k2.persistence.RichResourceSet(x)


    implicit def character2kermeta(x: Char) = new RichCharacter(x)
    //implicit def listToEList[G](l : java.util.List[G]) = l.asInstanceOf[org.eclipse.emf.common.util.EList[G]]
	
    //implicit def toInt2(in:java.lang.Integer) : Int = in.intValue
    //implicit def toReal2(in:java.lang.Double) : Double = in.doubleValue



    implicit def IteratorEObject2IteratorKObject(x:  java.util.Iterator[org.eclipse.emf.ecore.EObject]) :java.util.Iterator[_root_.k2.standard.KermetaObject] = {
        import k2.standard.JavaConversions._
        var res = new _root_.java.util.Iterator[_root_.k2.standard.KermetaObject]{
          def hasNext() : Boolean = x.hasNext
          def next() : _root_.k2.standard.KermetaObject = x.next.asInstanceOf[_root_.k2.standard.KermetaObject]
          def remove() = x.remove()
        }
        res
        
    }

    
    implicit def ListInteger2ListInt(x:  org.eclipse.emf.common.util.EList[java.lang.Integer]) :java.util.List[Int] = {
        import k2.standard.JavaConversions._
        var l=new java.util.ArrayList[Int]() ;
        x.foreach(e=> l.add(e.intValue) );
        return l;
    }
    implicit def ListInt2ListInteger(x: java.util.List[Int] ) :org.eclipse.emf.common.util.EList[java.lang.Integer] = {
        import k2.standard.JavaConversions._
        var l=new java.util.ArrayList[Integer]()
        x.foreach(e=> l.add(new Integer(e)))
        //return l;

    return null;
    }

    implicit def ListBoolean2ListBool(x:  org.eclipse.emf.common.util.EList[java.lang.Boolean]) :java.util.List[Boolean] = {
        import k2.standard.JavaConversions._
        var l=new java.util.ArrayList[Boolean]() ;
        x.foreach(e=> l.add(e.booleanValue) );
        return l;
    }
    implicit def ListBool2ListBoolean(x: java.util.List[Boolean] ) :org.eclipse.emf.common.util.EList[java.lang.Boolean] = {
        import k2.standard.JavaConversions._
        var l=new java.util.ArrayList[java.lang.Boolean]()
        x.foreach(e=> l.add(new java.lang.Boolean(e)))
        //return l;
return null;
    }

    implicit def throwable2kermeta(value:java.lang.Throwable):k2.exceptions.Exception = value.asInstanceOf[k2.exceptions.Exception]

}  
 

class Void  extends  EObjectImplForPrimitive //with org.k2.scala.framework.emf.aspects.KermetaObjectAspect
{
    override def toString() :java.lang.String={return  "<void>";}
}
 
abstract class RichValueType[G]  extends EObjectImplForPrimitive{
    def getValue():Object 
    override def equals(o:Any):Boolean = {
        if (o.isInstanceOf[ RichValueType[G] ]){
            return getValue() == o.asInstanceOf[ RichValueType[G] ].getValue
        }
        return getValue().equals(o)
        
    }
    //def isNotEqual(other : Any) :Boolean = {!this.equals(other)}
}

abstract class Comparable[G]  extends RichValueType[G] {
    def isLower(other : G) : java.lang.Boolean
    def isGreaterOrEqual(other : G) : java.lang.Boolean
    def compareTo(other : G) : java.lang.Integer
    def isLowerOrEqual(other : G) : java.lang.Boolean
    def isGreater(other : G) : java.lang.Boolean
}
trait Summable[G]  extends Object {
    def plus(other : G) :G
    //def isNotEqual(other : Any) :Boolean = {!this.equals(other) }
}
class RichNotComparableException  extends Exception  {}

class RichIterator (value: java.util.Iterator[_]) extends RichValueType[Boolean] {
	override  def isVoid(): java.lang.Boolean = false;
	def isOff(): java.lang.Boolean = {return !value.hasNext()}
	override def getValue():Object = value 
}


class RichBoolean (value: java.lang.Boolean) extends RichValueType[java.lang.Boolean] {
	//generated
	override def equals(arg0:Any) : Boolean = value.equals(arg0)
	override def hashCode() : Int = value.hashCode()
//	 def compareTo(arg0:java.lang.Boolean) : Int = value.compareTo(arg0)
	def booleanValue() : java.lang.Boolean = value.booleanValue()
  //end generated

    override def isVoid(): java.lang.Boolean = false;
	
    def not() : java.lang.Boolean={return !value}
    def xor(other : java.lang.Boolean) : java.lang.Boolean={(value || other) && !(value && other)}
    //override def equals(other : Object) :Boolean={return true}
    def or(other : java.lang.Boolean) : java.lang.Boolean={value || other}
    def nand(other : java.lang.Boolean) : java.lang.Boolean={!(value && other)}
    def implies(other : java.lang.Boolean) : java.lang.Boolean={true}
    override def toString() :java.lang.String={
        if (value){
            return "true";
        }
        else{
            return "false";
        }
    }
    def and(other : java.lang.Boolean) : java.lang.Boolean={value && other}
    def toBoolean() : java.lang.Boolean = {value}
    //def andThen(func : Boolean => Boolean):Boolean ={ if (value) {return func(value) }else return false; }
    def andThen(func : java.lang.Boolean => java.lang.Boolean):java.lang.Boolean ={ if (value) {return func(value) }else return false; }
    
    //def orElse(func : Boolean => Boolean):Boolean ={ if (!value) {return func(value)}else return true; }
    def orElse(func : java.lang.Boolean => java.lang.Boolean):java.lang.Boolean ={ if (!value) {return func(value)}else return true; }
    override def getValue():Object = new java.lang.Boolean(value)
    override def getMetaClass():org.kermeta.language.structure.Class={
        return createMetaClass("kermeta::standard::Boolean")
    }
	
}



class RichRandom(value : java.util.Random) extends KermetaObject with EObjectImplForPrimitive {
	override def isVoid() = value==null;
	override def equals(arg0 : Any) = value.equals(arg0)
	override def toString() = value.toString()
	override def hashCode() : Int = value.hashCode()
	
	def nextBoolean() : java.lang.Boolean = value.nextBoolean()
	def nextDouble() : java.lang.Double = value.nextDouble()
	def nextFloat() : java.lang.Float = value.nextFloat()
	def nextGaussian() : java.lang.Double = value.nextGaussian()
	def nextInt() : java.lang.Integer = value.nextInt()
	def nextInt(n : java.lang.Integer) : java.lang.Integer = value.nextInt(n)
	def nextLong() : java.lang.Long = value.nextLong()
	def setSeed(s : java.lang.Long) = value.setSeed(s)
}



class RichDate(value: java.util.Date) extends KermetaObject with EObjectImplForPrimitive {
	override  def isVoid(): java.lang.Boolean = value==null;
    
  //generated
	override def equals(arg0:Any) : Boolean = value.equals(arg0)
	override def toString() : java.lang.String = value.toString()
	override def hashCode() : Int = value.hashCode()
	override def clone() : AnyRef = value.clone
	def compareTo(arg0:java.util.Date) : Int = value.compareTo(arg0)
//	 def compareTo(arg0:AnyRef) : Int = value.compareTo(arg0)
	def after(arg0:java.util.Date) : java.lang.Boolean = value.after(arg0)
	def before(arg0:java.util.Date) : java.lang.Boolean = value.before(arg0)
	def getDate() : java.lang.Integer = value.getDate()
	def getHours() : java.lang.Integer = value.getHours()
	def getMinutes() : java.lang.Integer = value.getMinutes()
	def getMonth() : java.lang.Integer = value.getMonth()
	def getSeconds() : java.lang.Integer = value.getSeconds()
	def getTime() : java.lang.Long = value.getTime()
	def getYear() : java.lang.Integer = value.getYear()
	def setTime(arg0:Long) : Any = value.setTime(arg0)
	def getDay() : java.lang.Integer = value.getDay()
	def getTimezoneOffset() : java.lang.Integer = value.getTimezoneOffset()
	def setDate(arg0 : java.lang.Integer) : Any = value.setDate(arg0)
	def setHours(arg0 : java.lang.Integer) : Any = value.setHours(arg0)
	def setMinutes(arg0 : java.lang.Integer) : Any = value.setMinutes(arg0)
	def setMonth(arg0 : java.lang.Integer) : Any = value.setMonth(arg0)
	def setSeconds(arg0 : java.lang.Integer) : Any = value.setSeconds(arg0)
	def setYear(arg0 : java.lang.Integer) : Any = value.setYear(arg0)
	def toGMTString() : java.lang.String = value.toGMTString()
	def toLocaleString() : java.lang.String = value.toLocaleString()
  //end generated

}

class RichDouble(value: java.lang.Double) extends RichNumeric[java.lang.Double]{
	override  def isVoid() : java.lang.Boolean = false;
	def plus(other : java.lang.Double) : java.lang.Double={value+other}
	def mult(other : java.lang.Double) : java.lang.Double={value*other}
	def minus(other : java.lang.Double) : java.lang.Double={return value-other}
	def mod(other : java.lang.Double) : java.lang.Double={return value % other}
	def div(other : java.lang.Double) : java.lang.Double={return value/other}
	def uminus() : java.lang.Double={return (value * (-1)).toDouble}

	override def isLower(other : java.lang.Double) : java.lang.Boolean={value<other}
	override def equals(other : Any) :Boolean={if (other.isInstanceOf[java.lang.Double]) return value==other.asInstanceOf[java.lang.Double]; else false}
	def equals(other : java.lang.Double) :Boolean={value==other}
	def compareTo(other : java.lang.Double) : java.lang.Integer={return value.asInstanceOf[Double].compare(other)}
	override def isGreater(other : java.lang.Double) : java.lang.Boolean={return value>other}
	override def isGreaterOrEqual(other : java.lang.Double) : java.lang.Boolean={value>=other}
	override def isNotEqual(other : Any) :java.lang.Boolean = {!this.equals(other)}
	def isLowerOrEqual(other : java.lang.Double) : java.lang.Boolean={return  value<=other.intValue}

	override def getValue():Object = new java.lang.Double(value)
	override def getMetaClass():org.kermeta.language.structure.Class={
		  return createMetaClass("kermeta::standard::Double")
	}

   //generated
  //override def equals(arg0:Any) : Boolean = value.equals(arg0)
	override def toString() : java.lang.String = value.toString()
	override def hashCode() : Int = value.hashCode()
	// def compareTo(arg0:java.lang.Double) : Int = value.compareTo(arg0)
	//def shortValue() : java.lang.Short = value.shortValue()
	//def intValue() : java.lang.Integer = value.intValue()
	//def longValue() : java.lang.Long = value.longValue()
	//def floatValue() : java.lang.Float = value.floatValue()
	//def doubleValue() : java.lang.Double = value.doubleValue()
  
	def isNaN() : Boolean = value.isNaN()
	def isInfinite() : Boolean = value.isInfinite()
   //end generated
}

class RichFloat(value: java.lang.Float)extends RichNumeric[java.lang.Float] {
  override  def isVoid(): java.lang.Boolean = false;
  def plus(other : java.lang.Float) : java.lang.Float={value+other}
  def mult(other : java.lang.Float) : java.lang.Float={value*other}
  def minus(other : java.lang.Float) : java.lang.Float={return value-other}
  def mod(other : java.lang.Float) : java.lang.Float={return value % other}
  def div(other : java.lang.Float) : java.lang.Float={return value/other}
  def uminus() : java.lang.Float={return (value * (-1)).toFloat}

  override def isLower(other : java.lang.Float) : java.lang.Boolean={value<other}
  override def equals(other : Any) : Boolean={if (other.isInstanceOf[java.lang.Float]) return value==other.asInstanceOf[java.lang.Float]; else false}
  def equals(other : java.lang.Float) : java.lang.Boolean={value==other}
  def compareTo(other : java.lang.Float) : java.lang.Integer={return value.asInstanceOf[Float].compare(other)}
  override def isGreater(other : java.lang.Float) : java.lang.Boolean={return value>other}
  override def isGreaterOrEqual(other : java.lang.Float) : java.lang.Boolean={value>=other}
  override def isNotEqual(other : Any) :java.lang.Boolean = {!this.equals(other)}
  def isLowerOrEqual(other : java.lang.Float) : java.lang.Boolean={return  value<=other.intValue}

  override def getValue():Object = new java.lang.Float(value)
  override def getMetaClass():org.kermeta.language.structure.Class={
		  return createMetaClass("kermeta::standard::Float")
  }
     //generated
     // override def equals(arg0:Any) : Boolean = value.equals(arg0)
  override def toString() : java.lang.String = value.toString()
  override def hashCode() : Int = value.hashCode()
  //def shortValue() : java.lang.Short = value.shortValue()
  //def intValue() : java.lang.Integer = value.intValue()
  //def longValue() : java.lang.Long = value.longValue()
  //def floatValue() : java.lang.Float = value.floatValue()
  //def doubleValue() : java.lang.Double = value.doubleValue()
  def isNaN() : java.lang.Boolean = value.isNaN()
  def isInfinite() : java.lang.Boolean = value.isInfinite()
   //end generated
}

class RichStringBuffer(value: java.lang.StringBuilder) extends KermetaObject with EObjectImplForPrimitive{
	 override  def isVoid() : java.lang.Boolean = value==null;
  	 override def toString() : java.lang.String = value.toString()
	 def append(arg0:java.lang.Object) : java.lang.StringBuilder = value.append(arg0)
	 def append(arg0:java.lang.String) : java.lang.StringBuilder = value.append(arg0)
	 def append(arg0:java.lang.StringBuffer) : java.lang.StringBuilder = value.append(arg0)
	 def append(arg0:Array[java.lang.Character]) : java.lang.StringBuilder = value.append(arg0)
	 def append(arg0:Array[Char], arg1 : java.lang.Integer, arg2 : java.lang.Integer) : java.lang.StringBuilder = value.append(arg0,arg1,arg2)
	 def append(arg0 : java.lang.Boolean) : java.lang.StringBuilder = value.append(arg0)
	 def append(arg0 : java.lang.Character) : java.lang.StringBuilder = value.append(arg0)
	 def append(arg0 : java.lang.Integer) : java.lang.StringBuilder = value.append(arg0)
	 def append(arg0 : java.lang.Long) : java.lang.StringBuilder = value.append(arg0)
	 def append(arg0 : java.lang.Float) : java.lang.StringBuilder = value.append(arg0)
	 def append(arg0 : java.lang.Double) : java.lang.StringBuilder = value.append(arg0)
	 def indexOf(arg0 : java.lang.String) : java.lang.Integer = value.indexOf(arg0)
	 def indexOf(arg0:java.lang.String, arg1 : java.lang.Integer) : java.lang.Integer = value.indexOf(arg0,arg1)
	 def charAt(arg0 : java.lang.Integer) : java.lang.Character = value.charAt(arg0)
	 def codePointAt(arg0 : java.lang.Integer) : java.lang.Integer = value.codePointAt(arg0)
	 def codePointBefore(arg0 : java.lang.Integer) : java.lang.Integer = value.codePointBefore(arg0)
	 def codePointCount(arg0 : java.lang.Integer, arg1 : java.lang.Integer) : java.lang.Integer = value.codePointCount(arg0,arg1)
	 def getChars(arg0 : java.lang.Integer, arg1 : java.lang.Integer, arg2:Array[Char], arg3 : java.lang.Integer) : Any = value.getChars(arg0,arg1,arg2,arg3)
	 def lastIndexOf(arg0:java.lang.String) : java.lang.Integer = value.lastIndexOf(arg0)
	 def lastIndexOf(arg0:java.lang.String, arg1 : java.lang.Integer) : java.lang.Integer = value.lastIndexOf(arg0,arg1)
	 def size() : java.lang.Integer = value.length()
	 def offsetByCodePoints(arg0: java.lang.Integer,arg1: java.lang.Integer) : java.lang.Integer = value.offsetByCodePoints(arg0,arg1)
	 def replace(arg0:java.lang.Integer, arg1:java.lang.Integer, arg2:java.lang.String) : java.lang.StringBuilder = value.replace(arg0,arg1,arg2)
	 def substring(arg0: java.lang.Integer) : java.lang.String = value.substring(arg0)
	 def substring(arg0: java.lang.Integer, arg1: java.lang.Integer) : java.lang.String = value.substring(arg0,arg1)
	 def appendCodePoint(arg0: java.lang.Integer) : java.lang.StringBuilder = value.appendCodePoint(arg0)
	 def capacity() : java.lang.Integer = value.capacity()
	 def delete(arg0: java.lang.Integer, arg1: java.lang.Integer) : java.lang.StringBuilder = value.delete(arg0,arg1)
	 def deleteCharAt(arg0: java.lang.Integer) : java.lang.StringBuilder = value.deleteCharAt(arg0)
	 def ensureCapacity(arg0: java.lang.Integer) : Any = value.ensureCapacity(arg0)
	 def insert(arg0 : java.lang.Integer, arg1:Array[Char], arg2: java.lang.Integer, arg3: java.lang.Integer) : java.lang.StringBuilder = value.insert(arg0,arg1,arg2,arg3)
	 def insert(arg0 : java.lang.Integer, arg1:java.lang.Object) : java.lang.StringBuilder = value.insert(arg0,arg1)
	 def insert(arg0 : java.lang.Integer, arg1:java.lang.String) : java.lang.StringBuilder = value.insert(arg0,arg1)
	 def insert(arg0 : java.lang.Integer, arg1:Array[Char]) : java.lang.StringBuilder = value.insert(arg0,arg1)
	 def insert(arg0 : java.lang.Integer, arg1: java.lang.Boolean) : java.lang.StringBuilder = value.insert(arg0,arg1)
	 def insert(arg0 : java.lang.Integer, arg1: java.lang.Character) : java.lang.StringBuilder = value.insert(arg0,arg1)
	 def insert(arg0 : java.lang.Integer, arg1: java.lang.Integer) : java.lang.StringBuilder = value.insert(arg0,arg1)
	 def insert(arg0 : java.lang.Integer, arg1: java.lang.Long) : java.lang.StringBuilder = value.insert(arg0,arg1)
	 def insert(arg0 : java.lang.Integer, arg1: java.lang.Float) : java.lang.StringBuilder = value.insert(arg0,arg1)
	 def insert(arg0 : java.lang.Integer, arg1: java.lang.Double) : java.lang.StringBuilder = value.insert(arg0,arg1)
	 def reverse() : java.lang.StringBuilder = value.reverse()
	 def setCharAt(arg0 : java.lang.Integer,arg1: java.lang.Character) : Any = value.setCharAt(arg0,arg1)
	 def setLength(arg0 : java.lang.Integer) : Any = value.setLength(arg0)
	 def trimToSize() : Any = value.trimToSize()
	 override 	 def equals(arg0:Any) : Boolean = value.equals(arg0)
	 override 	 def hashCode() : Int = value.hashCode()
}

class RichShort(value: java.lang.Short) extends RichNumeric[java.lang.Short] {
	  override  def isVoid(): java.lang.Boolean = false;
      def plus(other : java.lang.Short) : java.lang.Short={(value+other).toShort}
      def mult(other : java.lang.Short) : java.lang.Short={(value*other).toShort}
      def minus(other : java.lang.Short) : java.lang.Short={(value-other).toShort}
      def mod(other : java.lang.Short) : java.lang.Short={return (value % other).toShort}
      def div(other : java.lang.Short) : java.lang.Short={return (value/other).toShort}
      def uminus() : java.lang.Short={return (value * (-1)).toShort}

      override def isLower(other : java.lang.Short) : java.lang.Boolean={value<other}
      override def equals(other : Any) :Boolean={if (other.isInstanceOf[java.lang.Short]) return value==other.asInstanceOf[java.lang.Short]; else false}
      def equals(other : java.lang.Short) :Boolean={value==other}
      def compareTo(other : java.lang.Short) : java.lang.Integer={return value.asInstanceOf[Short].compare(other)}
      def compareTo(other : java.lang.Integer) : java.lang.Integer={return value.asInstanceOf[Short].compare(other.shortValue())}
      def compareTo(other : Int) : java.lang.Integer={return value.asInstanceOf[Short].compare(other.shortValue())}
      override def isGreater(other : java.lang.Short) : java.lang.Boolean={return value>other}
      override def isGreaterOrEqual(other : java.lang.Short) : java.lang.Boolean={value>=other}
      override def isNotEqual(other : Any) :java.lang.Boolean = {!this.equals(other)}
      def isLowerOrEqual(other : java.lang.Short) : java.lang.Boolean={return  value<=other.intValue}

      override def getValue():Object = new java.lang.Short(value)
      override def getMetaClass():org.kermeta.language.structure.Class={
    		  return createMetaClass("kermeta::standard::Short")
      }

     //generated
     //override def equals(arg0:Any) : Boolean = value.equals(arg0)
	 override def toString() : java.lang.String = value.toString()
	 override def hashCode() : Int = value.hashCode()
	 //def compareTo(arg0:java.lang.Short) : Int = value.compareTo(arg0)
	 //def shortValue() : java.lang.Short = value.shortValue()
	 //def intValue() : java.lang.Integer = value.intValue()
	 //def longValue() : java.lang.Long = value.longValue()
	 //def floatValue() : java.lang.Float = value.floatValue()
	 //def doubleValue() :java.lang. Double = value.doubleValue()
     //end generated

}

abstract class RichNumeric[G]  extends Comparable[G] with Summable[G]{}

class RichLong(value: java.lang.Long)  extends RichNumeric[java.lang.Long]{
	override  def isVoid() = false
	def plus(other : java.lang.Long) : java.lang.Long = value+other
	def mult(other : java.lang.Long) : java.lang.Long = value*other
	def minus(other : java.lang.Long) : java.lang.Long = value-other
	def mod(other : java.lang.Long) : java.lang.Long = value % other
	def div(other : java.lang.Long) : java.lang.Long = value/other
	def uminus() : java.lang.Long = value * (-1)

	override def isLower(other : java.lang.Long) = value<other
	override def equals(other : Any) : Boolean={if (other.isInstanceOf[java.lang.Long]) return value==other.asInstanceOf[java.lang.Long]; else false}
	def equals(other : java.lang.Long) = value==other
	def compareTo(other : java.lang.Long) : java.lang.Integer = value.asInstanceOf[Long].compare(other.longValue)
	override def isGreater(other : java.lang.Long) : java.lang.Boolean = value>other
	override def isGreaterOrEqual(other : java.lang.Long) = value>=other
	override def isNotEqual(other : Any) = !this.equals(other)
	def isLowerOrEqual(other : java.lang.Long) = value<=other.intValue

	override def getValue() : Object = new java.lang.Long(value)
	override def getMetaClass() : org.kermeta.language.structure.Class = createMetaClass("kermeta::standard::Long")

  	//generated
	override def toString() : java.lang.String = value.toString()
	override def hashCode() : Int = value.hashCode()
	//def shortValue() : java.lang.Short = value.shortValue()
	//def intValue() : java.lang.Integer = value.intValue()
	//def longValue() : java.lang.Long = value.longValue()
	//def floatValue() : java.lang.Float = value.floatValue()
	//def doubleValue() : java.lang.Double = value.doubleValue()
    //end generated
}



class RichInteger(value: java.lang.Integer)  extends RichNumeric[java.lang.Integer]{
    override  def isVoid(): java.lang.Boolean = false;
    override def isLower(other : java.lang.Integer) : java.lang.Boolean={value<other}
    def plus(other : Int) :java.lang.Integer={value+other}
    def plus(other : java.lang.Integer) :java.lang.Integer={value+other.intValue}
    def mult(other : Int) :java.lang.Integer={value*other}
    def mult(other : java.lang.Integer) :java.lang.Integer={value*other.intValue}
    def minus(other : java.lang.Integer) :java.lang.Integer={return value-other.intValue}
    def minus(other : Int) :java.lang.Integer={return value-other}
    override def equals(other : Any) :Boolean={if (other.isInstanceOf[Int]) return value==other.asInstanceOf[Int]; if (other.isInstanceOf[Integer]) return value==other.asInstanceOf[Integer].intValue;else false}
    def equals(other : Int) :Boolean={value==other}
    def equals(other : Integer) :Boolean={value == other.intValue}
    def mod(other : Int) :java.lang.Integer={return value % other}
    def mod(other : java.lang.Integer) :java.lang.Integer={return value % other.intValue}
    def div(other : Int) :java.lang.Integer={return value/other}
    def div(other : java.lang.Integer) :java.lang.Integer={return value/(other.intValue)}
	override def hashCode() : Int = value.hashCode()
	//def shortValue() : java.lang.Short = value.shortValue()
	//def intValue() : java.lang.Integer = value.intValue()
	//def longValue() : java.lang.Long = value.longValue()
	//def floatValue() : java.lang.Float = value.floatValue()
	//def doubleValue() : java.lang.Double = value.doubleValue()

    def toReal() : java.lang.Double={return value.doubleValue()} // deprecated in kmt framework
	def toDouble() : java.lang.Double={return value.doubleValue()}
    override def compareTo(other : java.lang.Integer) :java.lang.Integer={return value.asInstanceOf[Int].compare(other) }
    def kcompareTo(other : Int) :java.lang.Integer={return value.asInstanceOf[Int].compare(other.intValue)}
    
    def isGreater(other : Int) :java.lang.Boolean={return value>other}
    override def isGreater(other : java.lang.Integer) :java.lang.Boolean={return value>other.intValue}
    def isGreaterOrEqual(other : Int) :java.lang.Boolean={value>=other}
    override def isGreaterOrEqual(other : java.lang.Integer) :java.lang.Boolean={return value>=other.intValue}
    def uminus() :Int={return value * (-1);}
    //TODO
    //def times(body : Integer=>Unit) :{}
    override def toString() :java.lang.String={return ""+value}
    def isLowerOrEqual(other : Int) :java.lang.Boolean={return  value<=other}
    override def isLowerOrEqual(other : java.lang.Integer) :java.lang.Boolean={return  value<=other.intValue}
    def toInt() : java.lang.Integer = {return value}
	
//    def times(func : Int => Unit):Unit ={ for(i <- 0 until value){func(i)} }
    def times(func : java.lang.Integer => Unit):Unit ={ for(i <- 0 until value){func(i)} }
    override def isNotEqual(other : Any) :java.lang.Boolean = {!this.equals(other)}
    override def getValue():Object = new java.lang.Integer(value)		
    //def isNotEqual(other : Any) :Boolean = this.equals(other)
    override def getMetaClass():org.kermeta.language.structure.Class={
        return createMetaClass("kermeta::standard::Integer")
    }
	
}


class RichCharacter(value:java.lang.Character)  extends RichValueType with EObjectImplForPrimitive{
	//generated
	override 	 def equals(arg0:Any) : Boolean = value.equals(arg0)
	override 	 def hashCode() : Int = value.hashCode()
	def compareTo(arg0 : java.lang.Character) : java.lang.Integer = value.compareTo(arg0)
	def charValue() : java.lang.Character = value.charValue()
  
  //end generated

    //TODO
    def compareTo(other : Object) :Int={//TODO
        0}
    override def toString() :java.lang.String={return ""+value}
    override  def isVoid(): java.lang.Boolean = false;
    override def getValue():Object = value
    override def getMetaClass():org.kermeta.language.structure.Class={
        return createMetaClass("kermeta::standard::Char")
    }

}


class RichEnum(value:java.lang.Object)  extends  EObjectImplForPrimitive{
    override  def isVoid(): java.lang.Boolean = value==null;
    def getValue():java.lang.Object = value
    override def getMetaClass():org.kermeta.language.structure.Class={
        return createMetaClass("kermeta::language::structure::Enumeration")
    }

}

trait EObjectImplForPrimitive extends EObjectImplForKO{
	override def eAdapters(): org.eclipse.emf.common.util.EList[org.eclipse.emf.common.notify.Adapter] =null;
    def eDeliver():Boolean =true;
    def eSetDeliver(deliver:Boolean):Unit={}

}


trait EObjectImplForKO extends KermetaObject {
    def eUnset(feature: org.eclipse.emf.ecore.EStructuralFeature)={}
    def eIsSet(feature: org.eclipse.emf.ecore.EStructuralFeature): Boolean = true
    def eSet(feature: org.eclipse.emf.ecore.EStructuralFeature,x:Any):Unit={}
    def eGet(feature: org.eclipse.emf.ecore.EStructuralFeature,resolv: Boolean):java.lang.Object={null}
    def eGet(feature: org.eclipse.emf.ecore.EStructuralFeature):java.lang.Object={null}
    def eCrossReferences():  org.eclipse.emf.common.util.EList[org.eclipse.emf.ecore.EObject] = null
    def eIsProxy(): Boolean = false
    def eAllContents(): org.eclipse.emf.common.util.TreeIterator[org.eclipse.emf.ecore.EObject] =null
    def eContents():  org.eclipse.emf.common.util.EList[org.eclipse.emf.ecore.EObject] = null
    def eContainmentFeature():org.eclipse.emf.ecore.EReference =null;
    def eContainingFeature():   org.eclipse.emf.ecore.EStructuralFeature =null
    def eContainer() : org.eclipse.emf.ecore.EObject =null
    def eResource() :   org.eclipse.emf.ecore.resource.Resource =null;
    def eClass() : org.eclipse.emf.ecore.EClass = null;
    def eNotify( notification:org.eclipse.emf.common.notify.Notification):Unit=null;
    override  def isVoid(): java.lang.Boolean;
    def eInvoke(x1: org.eclipse.emf.ecore.EOperation,x2: org.eclipse.emf.common.util.EList[_]):java.lang.Object = null

    def createMetaClass(name:String):org.kermeta.language.structure.Class={
        var factoryName = "ScalaAspect.org.k2.language.structure.RichFactory$"
        var methodName = "createClass"
        var methodNameClassDef = "createClassDefinition"
        val clazz = java.lang.Class.forName(factoryName)
        val obj = clazz.getField("MODULE$").get(clazz)
        var meth :java.lang.reflect.Method = clazz.getMethods.filter(m=> m.getName.equals(methodName)).first
        //println(meth.getName + " " + meth.getParameterTypes.size)
        val numbers = Array()
        var mclazz : org.kermeta.language.structure.Class = meth.invoke(obj, numbers: _*).asInstanceOf[org.kermeta.language.structure.Class]

        var meth1 :java.lang.reflect.Method = clazz.getMethods.filter(m=> m.getName.equals(methodNameClassDef)).first
        var mclazzDef : org.kermeta.language.structure.ClassDefinition = meth1.invoke(obj, numbers: _*).asInstanceOf[org.kermeta.language.structure.ClassDefinition]
        mclazzDef.setName(name)
        mclazz.setTypeDefinition(mclazzDef)        
        return mclazz
    }
}

class RichString(value: java.lang.String)  extends RichValueType with EObjectImplForPrimitive{
    //TODO

	
    //def size():Int={return value.size}
  /*  def append(other : String):String={return value + other}
    def toReal() :Double={return java.lang.Double.parseDouble(value)}
    def toBoolean() :Boolean={return java.lang.Boolean.parseBoolean(value)}
    def contains(str1 : String) :Boolean={return value.contains(str1)}
    def compareTo(other : String) :Int={return value.compareTo(other)}
    def indexOf(str : String) :Int={return value.indexOf(str)}
    def elementAt(index : Int) :Char={return value.charAt(index)}
    def ksize() :Int={return value.length}
    def replace(str1 : String, str2 : String) :java.lang.String={return value.replace(str1,str2)}
    def toUpperCase() :java.lang.String={return value.toUpperCase()}
    def toInteger() :Int={return java.lang.Integer.parseInt(value)}
    def toLowerCase() :java.lang.String={return value.toLowerCase()}
    def substring(startIndex : Int, endIndex : Int) :java.lang.String={return value.substring(startIndex,endIndex)}
    override def toString() :java.lang.String={if (value != null) {return value.toString} else { return null}}
*/
   //override def equals(arg0:Any) : Boolean = value.equals(arg0)
	 override def toString() : java.lang.String = value.toString()
	 override def hashCode() : Int = value.hashCode()
	 def plus(other : Object) : java.lang.String={return value + other.toString()}
	 def compareTo(arg0:java.lang.String) : java.lang.Integer = value.compareTo(arg0)
	 def indexOf(arg0:java.lang.Integer) : java.lang.Integer = value.indexOf(arg0)
	 def indexOf(arg0 : java.lang.Integer, arg1 : java.lang.Integer) : java.lang.Integer = value.indexOf(arg0,arg1)
	 def indexOf(arg0 : java.lang.String) : java.lang.Integer = value.indexOf(arg0)
	 def indexOf(arg0 : java.lang.String, arg1:java.lang.Integer) : java.lang.Integer = value.indexOf(arg0,arg1)
	 def charAt(arg0 : java.lang.Integer) : java.lang.Character = value.charAt(arg0)
	 def codePointAt(arg0:java.lang.Integer) : java.lang.Integer = value.codePointAt(arg0)
	 def codePointBefore(arg0:java.lang.Integer) : java.lang.Integer = value.codePointBefore(arg0)
	 def codePointCount(arg0:java.lang.Integer, arg1:java.lang.Integer) : java.lang.Integer = value.codePointCount(arg0,arg1)
	 def compareToIgnoreCase(arg0:java.lang.String) : java.lang.Integer = value.compareToIgnoreCase(arg0)
	 def concat(arg0:java.lang.String) : java.lang.String = value.concat(arg0)
	 def contentEquals(arg0:java.lang.StringBuffer) : java.lang.Boolean = value.contentEquals(arg0)
	 def endsWith(arg0:java.lang.String) : java.lang.Boolean = value.endsWith(arg0)
	 def equalsIgnoreCase(arg0:java.lang.String) : java.lang.Boolean = value.equalsIgnoreCase(arg0)
	 def getChars(arg0 : java.lang.Integer, arg1 : java.lang.Integer, arg2:Array[Char], arg3 : java.lang.Integer) : Any = value.getChars(arg0,arg1,arg2,arg3)
	 def intern() : java.lang.String = value.intern()
	 def isEmpty() : java.lang.Boolean = value.isEmpty()
	 def lastIndexOf(arg0 : java.lang.Integer) : java.lang.Integer = value.lastIndexOf(arg0)
	 def lastIndexOf(arg0 : java.lang.Integer, arg1 : java.lang.Integer) : java.lang.Integer = value.lastIndexOf(arg0,arg1)
	 def lastIndexOf(arg0 : java.lang.String) : java.lang.Integer = value.lastIndexOf(arg0)
	 def lastIndexOf(arg0 : java.lang.String, arg1 : java.lang.Integer) : java.lang.Integer = value.lastIndexOf(arg0,arg1)
	 def size() : java.lang.Integer = value.length()
	 def ksize() : java.lang.Integer = value.length()
	 def matches(arg0 : java.lang.String) : java.lang.Boolean = value.matches(arg0)
	 def offsetByCodePoints(arg0 : java.lang.Integer, arg1 : java.lang.Integer) : java.lang.Integer = value.offsetByCodePoints(arg0,arg1)
	 def regionMatches(arg0 : java.lang.Integer, arg1 : java.lang.String, arg2 : java.lang.Integer, arg3 : java.lang.Integer) : java.lang.Boolean 
	 	= value.regionMatches(arg0,arg1,arg2,arg3)
	 def regionMatches(arg0 : java.lang.Boolean, arg1 : java.lang.Integer, arg2 : java.lang.String, arg3 : java.lang.Integer, arg4 : java.lang.Integer) : java.lang.Boolean 
	 	= value.regionMatches(arg0,arg1,arg2,arg3,arg4)
	 //def replace(arg0:java.lang.String,arg1:java.lang.String) : java.lang.String = value.replaceAll(arg0,arg1)
	 def replaceAll(arg0:java.lang.String,arg1:java.lang.String) : java.lang.String = value.replaceAll(arg0,arg1)
	 def replaceFirst(arg0:java.lang.String,arg1:java.lang.String) : java.lang.String = value.replaceFirst(arg0,arg1)
	 def ksplit(arg0 : java.lang.String, arg1 : java.lang.Integer) : java.util.List[java.lang.String] = java.util.Arrays.asList(value.split(arg0,arg1): _*)
     def ksplit(delimiter : java.lang.String) :java.util.List[String] = java.util.Arrays.asList(value.split(delimiter): _*)
	 def startsWith(arg0 : java.lang.String, arg1 : java.lang.Integer) : java.lang.Boolean = value.startsWith(arg0,arg1)
	 def startsWith(arg0 : java.lang.String) : Boolean = value.startsWith(arg0)
	 def substring(arg0 : java.lang.Integer) : java.lang.String = value.substring(arg0)
	 def substring(arg0 : java.lang.Integer, arg1 : java.lang.Integer) : java.lang.String = value.substring(arg0,arg1)
	 def toCharArray() : Array[Char] = value.toCharArray()
	 def toLowerCase() : java.lang.String = value.toLowerCase()
	 def toUpperCase() : java.lang.String = value.toUpperCase()
	 def trim() : java.lang.String = value.trim()

	 //Add missing methods from Kermeta V1
	 def allCharacters() : Array[Char] = value.toCharArray()
	def append(arg0:java.lang.String) : java.lang.String = {return value+arg0}
	def contains(arg0 : java.lang.String) : java.lang.Boolean = value.contains(arg0)
	def elementAt(arg0 : java.lang.Integer) : java.lang.Character = value.charAt(arg0)
	def replace(arg0:java.lang.String,arg1:java.lang.String) : java.lang.String = value.replaceAll(arg0,arg1)
	def replaceKeyword(arg0:java.lang.String,arg1:java.lang.String) : java.lang.String = value.replaceAll(arg0,arg1)
	def toInteger() : java.lang.Integer = _root_.java.lang.Integer.parseInt(value)
	def toReal() : java.lang.Double = _root_.java.lang.Double.parseDouble(value) // deprecated in framework
	def ktoDouble() : java.lang.Double = _root_.java.lang.Double.parseDouble(value) 
	def toURI() : org.eclipse.emf.common.util.URI = org.eclipse.emf.common.util.URI.createURI(value)
	def toBoolean() : java.lang.Boolean = _root_.java.lang.Boolean.parseBoolean(value)


	override def isVoid() : java.lang.Boolean = value ==null;
    override def getValue():Object = value 		   
    override def equals(o:Any):Boolean ={
        if (o.isInstanceOf[String]){
            return value == o.asInstanceOf[String]
        }else        if (o.isInstanceOf[RichString]){
            return value == o.asInstanceOf[RichString].getValue
        }
        return value.equals(o)

        
    }

  

    override def getMetaClass():org.kermeta.language.structure.Class={
        return createMetaClass("kermeta::standard::String")
    }

}
class RichURI(value : org.eclipse.emf.common.util.URI)  extends RichValueType with EObjectImplForPrimitive {
	override def getValue():Object = value
    override def toString() :java.lang.String={return value.toString();
    }
	def appendSegment(segmentPath : String) : org.eclipse.emf.common.util.URI = { return value.appendSegment(segmentPath)} 
	def appendSegments(segmentPaths : java.util.List[String]) : org.eclipse.emf.common.util.URI = {	 
	  return value.appendSegments(segmentPaths.toArray().asInstanceOf[Array[String]])
	}
}

class RichUnknownJavaObject  extends Object {
    override def toString() :java.lang.String={return "toString of  UnknownJavaObject not implemented yet";
    }
}



