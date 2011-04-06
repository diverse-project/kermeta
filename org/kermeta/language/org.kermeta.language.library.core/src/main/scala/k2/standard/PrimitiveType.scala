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
    implicit def string2kermeta(x: String) = new RichString(x)
    implicit def stringbuffer2kermeta(x: java.lang.StringBuffer) = new RichStringBuffer(x)

    implicit def boolean2kermeta(x: Boolean) = new RichBoolean(x)
    implicit def boolean2javaboolean(x: java.lang.Boolean) : Boolean = {if (x== null) return false else return x.booleanValue()}
    implicit def javaboolean2kermeta(x: java.lang.Boolean) = new RichJavaBoolean(x)
    implicit def iterator2kermeta(x: java.util.Iterator[_])= new RichIterator(x)
    implicit def iteratorEObject2kermeta(x:java.util.Iterator[_<: org.eclipse.emf.ecore.EObject]) :  _root_.java.util.Iterator[_root_.java.lang.Object] =x.asInstanceOf[_root_.java.util.Iterator[_root_.java.lang.Object]]

	
    implicit def integer2kermeta(x: Int) = new RichInteger(x)
    implicit def long2kermeta(x: Long) = new RichLong(x)
    implicit def short2kermeta(x: Short) = new RichShort(x)
        implicit def float2kermeta(x: Float) = new RichFloat(x)
  implicit def double2kermeta(x: Double) = new RichDouble(x)
  implicit def date2kermeta(x: java.util.Date) = new RichDate(x)


    implicit def character2kermeta(x: Char) = new RichCharacter(x)
    //implicit def listToEList[G](l : java.util.List[G]) = l.asInstanceOf[org.eclipse.emf.common.util.EList[G]]
	
    implicit def toInt2(in:java.lang.Integer) : Int = in.intValue
    implicit def toReal2(in:java.lang.Double) : Double = in.doubleValue
    implicit def toInt(in:java.lang.Integer) : RichInteger = new RichInteger(in.intValue)
    //implicit def toReal(in:java.lang.Double) : RichReal = new RichReal(in.doubleValue)


  
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
    def isLower(other : G) :Boolean
    def isGreaterOrEqual(other : G) :Boolean
    def compareTo(other : G) :Int
    def isLowerOrEqual(other : G) :Boolean
    def isGreater(other : G) :Boolean
}
abstract class Summable[G]  extends Object {
    def plus(other : G) :G
    //def isNotEqual(other : Any) :Boolean = {!this.equals(other) }
}
class RichNotComparableException  extends Exception  {}

class RichIterator (value: java.util.Iterator[_]) extends RichValueType[Boolean] {
  override  def isVoid():Boolean = false;
  def isOff():Boolean = {return !value.hasNext()}
    override def getValue():Object = value 
}


class RichBoolean (value: Boolean) extends RichValueType[Boolean] {
  //generated
  override def equals(arg0:Any) : Boolean = value.equals(arg0)
	 override def hashCode() : Int = value.hashCode()
//	 def compareTo(arg0:java.lang.Boolean) : Int = value.compareTo(arg0)
	 def booleanValue() : Boolean = value.booleanValue()
  //end generated

    override def isVoid():Boolean = false;
	
    def not() :Boolean={return !value}
    def xor(other : Boolean) :Boolean={(value || other) && !(value && other)}
    //override def equals(other : Object) :Boolean={return true}
    def or(other : Boolean) :Boolean={value || other}
    def nand(other : Boolean) :Boolean={!(value && other)}
    def implies(other : Boolean) :Boolean={true}
    override def toString() :java.lang.String={
        if (value){
            return "true";
        }
        else{
            return "false";
        }
    }
    def and(other : Boolean) :Boolean={value && other}
    def toBoolean() : Boolean = {value}
    def andThen(func : Boolean => Boolean):Boolean ={ if (value) {return func(value) }else return false; }
    def orElse(func : Boolean => Boolean):Boolean ={ if (!value) {return func(value)}else return true; }
    override def getValue():Object = new java.lang.Boolean(value)
    override def getMetaClass():org.kermeta.language.structure.Class={
        return createMetaClass("k2::standard::Boolean")
    }
	
}

class RichDate(value: java.util.Date) extends KermetaObject with EObjectImplForPrimitive {
  override  def isVoid():Boolean = value==null;
    
  //generated
  override def equals(arg0:Any) : Boolean = value.equals(arg0)
	 override def toString() : java.lang.String = value.toString()
	 override def hashCode() : Int = value.hashCode()
	 override def clone() : AnyRef = value.clone
	 def compareTo(arg0:java.util.Date) : Int = value.compareTo(arg0)
//	 def compareTo(arg0:AnyRef) : Int = value.compareTo(arg0)
	 def after(arg0:java.util.Date) : Boolean = value.after(arg0)
	 def before(arg0:java.util.Date) : Boolean = value.before(arg0)
	 def getDate() : Int = value.getDate()
	 def getHours() : Int = value.getHours()
	 def getMinutes() : Int = value.getMinutes()
	 def getMonth() : Int = value.getMonth()
	 def getSeconds() : Int = value.getSeconds()
	 def getTime() : Long = value.getTime()
	 def getYear() : Int = value.getYear()
	 def setTime(arg0:Long) : Any = value.setTime(arg0)
	 def getDay() : Int = value.getDay()
	 def getTimezoneOffset() : Int = value.getTimezoneOffset()
	 def setDate(arg0:Int) : Any = value.setDate(arg0)
	 def setHours(arg0:Int) : Any = value.setHours(arg0)
	 def setMinutes(arg0:Int) : Any = value.setMinutes(arg0)
	 def setMonth(arg0:Int) : Any = value.setMonth(arg0)
	 def setSeconds(arg0:Int) : Any = value.setSeconds(arg0)
	 def setYear(arg0:Int) : Any = value.setYear(arg0)
	 def toGMTString() : java.lang.String = value.toGMTString()
	 def toLocaleString() : java.lang.String = value.toLocaleString()
  //end generated

}

class RichDouble(value: Double) extends RichNumeric[Double]{
  override  def isVoid():Boolean = false;
    def plus(other : Double) :Double={value+other}
  def mult(other : Double) :Double={value*other}
  def minus(other : Double) :Double={return value-other}
  def mod(other : Double) :Double={return value % other}
  def div(other : Double) :Double={return value/other}
  def uminus() :Double={return (value * (-1)).toDouble}

  override def isLower(other : Double) :Boolean={value<other}
  override def equals(other : Any) :Boolean={if (other.isInstanceOf[Short]) return value==other.asInstanceOf[Short]; else false}
  def equals(other : Double) :Boolean={value==other}
  def compareTo(other : Double) :Int={return value.compare(other)}
  override def isGreater(other : Double) :Boolean={return value>other}
  override def isGreaterOrEqual(other : Double) :Boolean={value>=other}
  override def isNotEqual(other : Any) :Boolean = {!this.equals(other)}
  def isLowerOrEqual(other : Double) :Boolean={return  value<=other.intValue}

override def getValue():Object = new java.lang.Double(value)
override def getMetaClass():org.kermeta.language.structure.Class={
  return createMetaClass("k2::standard::Double")
}

   //generated
  //override def equals(arg0:Any) : Boolean = value.equals(arg0)
	 override def toString() : java.lang.String = value.toString()
	 override def hashCode() : Int = value.hashCode()
	// def compareTo(arg0:java.lang.Double) : Int = value.compareTo(arg0)
	 def shortValue() : Short = value.shortValue()
	 def intValue() : Int = value.intValue()
	 def longValue() : Long = value.longValue()
	 def floatValue() : Float = value.floatValue()
	 def doubleValue() : Double = value.doubleValue()
	 def isNaN() : Boolean = value.isNaN()
	 def isInfinite() : Boolean = value.isInfinite()
 //end generated
}

class RichFloat(value: Float)extends RichNumeric[Float] {
  override  def isVoid():Boolean = false;
   def plus(other : Float) :Float={value+other}
  def mult(other : Float) :Float={value*other}
  def minus(other : Float) :Float={return value-other}
  def mod(other : Float) :Float={return value % other}
  def div(other : Float) :Float={return value/other}
  def uminus() :Float={return (value * (-1)).toFloat}

  override def isLower(other : Float) :Boolean={value<other}
  override def equals(other : Any) :Boolean={if (other.isInstanceOf[Short]) return value==other.asInstanceOf[Short]; else false}
  def equals(other : Float) :Boolean={value==other}
  def compareTo(other : Float) :Int={return value.compare(other)}
  override def isGreater(other : Float) :Boolean={return value>other}
  override def isGreaterOrEqual(other : Float) :Boolean={value>=other}
  override def isNotEqual(other : Any) :Boolean = {!this.equals(other)}
  def isLowerOrEqual(other : Float) :Boolean={return  value<=other.intValue}

override def getValue():Object = new java.lang.Float(value)
override def getMetaClass():org.kermeta.language.structure.Class={
  return createMetaClass("k2::standard::Float")
}
     //generated
     // override def equals(arg0:Any) : Boolean = value.equals(arg0)
	 override def toString() : java.lang.String = value.toString()
	 override def hashCode() : Int = value.hashCode()
	 //def compareTo(arg0:java.lang.Float) : Int = value.compareTo(arg0)
	 def shortValue() : Short = value.shortValue()
	 def intValue() : Int = value.intValue()
	 def longValue() : Long = value.longValue()
	 def floatValue() : Float = value.floatValue()
	 def doubleValue() : Double = value.doubleValue()
	 def isNaN() : Boolean = value.isNaN()
	 def isInfinite() : Boolean = value.isInfinite()
   //end generated
}

class RichStringBuffer(value: StringBuffer) extends KermetaObject with EObjectImplForPrimitive{
  override  def isVoid():Boolean = value==null;
  	 override def toString() : java.lang.String = value.toString()
	 def append(arg0:java.lang.Object) : java.lang.StringBuffer = value.append(arg0)
	 def append(arg0:java.lang.String) : java.lang.StringBuffer = value.append(arg0)
	 def append(arg0:java.lang.StringBuffer) : java.lang.StringBuffer = value.append(arg0)
	 def append(arg0:Array[Char]) : java.lang.StringBuffer = value.append(arg0)
	 def append(arg0:Array[Char],arg1:Int,arg2:Int) : java.lang.StringBuffer = value.append(arg0,arg1,arg2)
	 def append(arg0:Boolean) : java.lang.StringBuffer = value.append(arg0)
	 def append(arg0:Char) : java.lang.StringBuffer = value.append(arg0)
	 def append(arg0:Int) : java.lang.StringBuffer = value.append(arg0)
	 def append(arg0:Long) : java.lang.StringBuffer = value.append(arg0)
	 def append(arg0:Float) : java.lang.StringBuffer = value.append(arg0)
	 def append(arg0:Double) : java.lang.StringBuffer = value.append(arg0)
	 def indexOf(arg0:java.lang.String) : Int = value.indexOf(arg0)
	 def indexOf(arg0:java.lang.String,arg1:Int) : Int = value.indexOf(arg0,arg1)
	 def charAt(arg0:Int) : Char = value.charAt(arg0)
	 def codePointAt(arg0:Int) : Int = value.codePointAt(arg0)
	 def codePointBefore(arg0:Int) : Int = value.codePointBefore(arg0)
	 def codePointCount(arg0:Int,arg1:Int) : Int = value.codePointCount(arg0,arg1)
	 def getChars(arg0:Int,arg1:Int,arg2:Array[Char],arg3:Int) : Any = value.getChars(arg0,arg1,arg2,arg3)
	 def lastIndexOf(arg0:java.lang.String) : Int = value.lastIndexOf(arg0)
	 def lastIndexOf(arg0:java.lang.String,arg1:Int) : Int = value.lastIndexOf(arg0,arg1)
	 def length() : Int = value.length()
	 def offsetByCodePoints(arg0:Int,arg1:Int) : Int = value.offsetByCodePoints(arg0,arg1)
	 def replace(arg0:Int,arg1:Int,arg2:java.lang.String) : java.lang.StringBuffer = value.replace(arg0,arg1,arg2)
	 def substring(arg0:Int) : java.lang.String = value.substring(arg0)
	 def substring(arg0:Int,arg1:Int) : java.lang.String = value.substring(arg0,arg1)
	 def appendCodePoint(arg0:Int) : java.lang.StringBuffer = value.appendCodePoint(arg0)
	 def capacity() : Int = value.capacity()
	 def delete(arg0:Int,arg1:Int) : java.lang.StringBuffer = value.delete(arg0,arg1)
	 def deleteCharAt(arg0:Int) : java.lang.StringBuffer = value.deleteCharAt(arg0)
	 def ensureCapacity(arg0:Int) : Any = value.ensureCapacity(arg0)
	 def insert(arg0:Int,arg1:Array[Char],arg2:Int,arg3:Int) : java.lang.StringBuffer = value.insert(arg0,arg1,arg2,arg3)
	 def insert(arg0:Int,arg1:java.lang.Object) : java.lang.StringBuffer = value.insert(arg0,arg1)
	 def insert(arg0:Int,arg1:java.lang.String) : java.lang.StringBuffer = value.insert(arg0,arg1)
	 def insert(arg0:Int,arg1:Array[Char]) : java.lang.StringBuffer = value.insert(arg0,arg1)
	 def insert(arg0:Int,arg1:Boolean) : java.lang.StringBuffer = value.insert(arg0,arg1)
	 def insert(arg0:Int,arg1:Char) : java.lang.StringBuffer = value.insert(arg0,arg1)
	 def insert(arg0:Int,arg1:Int) : java.lang.StringBuffer = value.insert(arg0,arg1)
	 def insert(arg0:Int,arg1:Long) : java.lang.StringBuffer = value.insert(arg0,arg1)
	 def insert(arg0:Int,arg1:Float) : java.lang.StringBuffer = value.insert(arg0,arg1)
	 def insert(arg0:Int,arg1:Double) : java.lang.StringBuffer = value.insert(arg0,arg1)
	 def reverse() : java.lang.StringBuffer = value.reverse()
	 def setCharAt(arg0:Int,arg1:Char) : Any = value.setCharAt(arg0,arg1)
	 def setLength(arg0:Int) : Any = value.setLength(arg0)
	 def trimToSize() : Any = value.trimToSize()
  override 	 def equals(arg0:Any) : Boolean = value.equals(arg0)
  override 	 def hashCode() : Int = value.hashCode()
}

class RichShort(value: Short) extends RichNumeric[Short] {



  override  def isVoid():Boolean = false;
      def plus(other : Short) :Long={value+other}
      def mult(other : Short) :Long={value*other}
      def minus(other : Short) :Long={return value-other}
      def mod(other : Short) :Long={return value % other}
      def div(other : Short) :Long={return value/other}
      def uminus() :Short={return (value * (-1)).toShort}

      override def isLower(other : Short) :Boolean={value<other}
      override def equals(other : Any) :Boolean={if (other.isInstanceOf[Short]) return value==other.asInstanceOf[Short]; else false}
      def equals(other : Short) :Boolean={value==other}
      def compareTo(other : Short) :Int={return value.compare(other)}
      override def isGreater(other : Short) :Boolean={return value>other}
      override def isGreaterOrEqual(other : Short) :Boolean={value>=other}
      override def isNotEqual(other : Any) :Boolean = {!this.equals(other)}
      def isLowerOrEqual(other : Short) :Boolean={return  value<=other.intValue}

  override def getValue():Object = new java.lang.Short(value)
  override def getMetaClass():org.kermeta.language.structure.Class={
      return createMetaClass("k2::standard::Short")
  }

   //generated
    //override def equals(arg0:Any) : Boolean = value.equals(arg0)
	 override def toString() : java.lang.String = value.toString()
	 override def hashCode() : Int = value.hashCode()
	 //def compareTo(arg0:java.lang.Short) : Int = value.compareTo(arg0)
	 def shortValue() : Short = value.shortValue()
	 def intValue() : Int = value.intValue()
	 def longValue() : Long = value.longValue()
	 def floatValue() : Float = value.floatValue()
	 def doubleValue() : Double = value.doubleValue()
   //end generated

}


class RichJavaBoolean (value: java.lang.Boolean) extends RichValueType[Boolean] {

  //generated
  	 override def equals(arg0:Any) : Boolean = value.equals(arg0)
	 override def hashCode() : Int = value.hashCode()
	 def compareTo(arg0:java.lang.Boolean) : Int = value.compareTo(arg0)
	 def booleanValue() : Boolean = value.booleanValue()
  //end generated

    override  def isVoid():Boolean = value ==null;
	    def not() :Boolean={return !value.booleanValue}
    def xor(other : Boolean) :Boolean={(value.booleanValue || other) && !(value.booleanValue && other)}
    //override def equals(other : Object) :Boolean={return true}
    def or(other : Boolean) :Boolean={value.booleanValue || other}
    def nand(other : Boolean) :Boolean={!(value.booleanValue && other)}
    def implies(other : Boolean) :Boolean={true}
    override def toString() :java.lang.String={
        if (value.booleanValue){
            return "true";
        }
        else{
            return "false";
        }
    }
    def and(other : Boolean) :Boolean={value.booleanValue && other}
    def toBoolean() : Boolean = {value.booleanValue}
    def andThen(func : Boolean => Boolean):Boolean ={ if (value.booleanValue) {return func(value.booleanValue) }else return false; }
    def orElse(func : Boolean => Boolean):Boolean ={ if (!value.booleanValue) {return func(value.booleanValue)}else return true; }

    override def getValue():Object = value 	
    override def getMetaClass():org.kermeta.language.structure.Class={
        return createMetaClass("k2::standard::Boolean")
    }
 

}

abstract class RichNumeric[G]  extends Comparable[G]{}

class RichLong(value: Long)  extends RichNumeric[Long]{
  override  def isVoid():Boolean = false;
      def plus(other : Long) :Long={value+other}
      def mult(other : Long) :Long={value*other}
      def minus(other : Long) :Long={return value-other}
      def mod(other : Long) :Long={return value % other}
      def div(other : Long) :Long={return value/other}
      def uminus() :Long={return value * (-1);}

      override def isLower(other : Long) :Boolean={value<other}
      override def equals(other : Any) :Boolean={if (other.isInstanceOf[Long]) return value==other.asInstanceOf[Long]; else false}
      def equals(other : Long) :Boolean={value==other}
      def compareTo(other : Long) :Int={return value.compare(other.intValue)}
      override def isGreater(other : Long) :Boolean={return value>other}
      override def isGreaterOrEqual(other : Long) :Boolean={value>=other}
      override def isNotEqual(other : Any) :Boolean = {!this.equals(other)}
      def isLowerOrEqual(other : Long) :Boolean={return  value<=other.intValue}

  override def getValue():Object = new java.lang.Long(value)
  override def getMetaClass():org.kermeta.language.structure.Class={
      return createMetaClass("k2::standard::Long")
  }

  //generated
   	 override def toString() : java.lang.String = value.toString()
	   override def hashCode() : Int = value.hashCode()
	   def shortValue() : Short = value.shortValue()
	   def intValue() : Int = value.intValue()
	   def longValue() : Long = value.longValue()
	   def floatValue() : Float = value.floatValue()
	   def doubleValue() : Double = value.doubleValue()
    //end generated



}

class RichInteger(value: Int)  extends RichNumeric[Int]{
    override  def isVoid():Boolean = false;
    override def isLower(other : Int) :Boolean={value<other}
    def plus(other : Int) :Int={value+other}
    def plus(other : Integer) :Int={value+other.intValue}
    def mult(other : Int) :Int={value*other}
    def mult(other : Integer) :Int={value*other.intValue}
    def minus(other : Integer) :Int={return value-other.intValue}
    def minus(other : Int) :Int={return value-other}
    override def equals(other : Any) :Boolean={if (other.isInstanceOf[Int]) return value==other.asInstanceOf[Int]; if (other.isInstanceOf[Integer]) return value==other.asInstanceOf[Integer].intValue;else false}
    def equals(other : Int) :Boolean={value==other}
    def equals(other : Integer) :Boolean={value == other.intValue}
    def mod(other : Int) :Int={return value % other}
    def mod(other : Integer) :Int={return value % other.intValue}
    def div(other : Int) :Int={return value/other}
    def div(other : Integer) :Int={return value/(other.intValue)}
	 override def hashCode() : Int = value.hashCode()
	 //def compareTo(arg0:java.lang.Integer) = value.compareTo(arg0)
	 def shortValue() : Short = value.shortValue()
	 def intValue() : Int = value.intValue()
	 def longValue() : Long = value.longValue()
	 def floatValue() : Float = value.floatValue()
	 def doubleValue() : Double = value.doubleValue()

  def toReal() :Double={return value}
    override def compareTo(other : Int) :Int={return value.compare(other) }
    def compareTo(other : Integer) :Int={return value.compare(other.intValue)}
    override def isGreater(other : Int) :Boolean={return value>other}
    def isGreater(other : Integer) :Boolean={return value>other.intValue}
    override def isGreaterOrEqual(other : Int) :Boolean={value>=other}
    def isGreaterOrEqual(other : Integer) :Boolean={return value>=other.intValue}
    def uminus() :Int={return value * (-1);}
    //TODO
    //def times(body : Integer=>Unit) :{}
    override def toString() :java.lang.String={return ""+value}
    override def isLowerOrEqual(other : Int) :Boolean={return  value<=other}
    def isLowerOrEqual(other : Integer) :Boolean={return  value<=other.intValue}
    def toInt() : Int = {return value}
	
    def times(func : Int => Unit):Unit ={ for(i <- 0 until value){func(i)} }
    override def isNotEqual(other : Any) :Boolean = {!this.equals(other)}
    override def getValue():Object = new java.lang.Integer(value)		
    //def isNotEqual(other : Any) :Boolean = this.equals(other)
    override def getMetaClass():org.kermeta.language.structure.Class={
        return createMetaClass("k2::standard::Integer")
    }
	
}


/*class RichReal (value: Double) extends RichNumeric[Double] with EObjectImplForPrimitive{
    def plus(other : Double) :Double={return value+other.toDouble}
    def mult(other : Double) :Double={return value*other.toDouble}
    def minus(other : Double) :Double={return value-other.toDouble}
    def toInteger() :Int={var v : Int = value.intValue
                          return v}
    def uminus() :Double={return -1 * value}
    def div(other : Double) :Double={return value/other.toDouble}
    //TODO
    override def compareTo(other : Double) :Int={return 0}

  override def toString() :java.lang.String={return ""+value}
    def toDouble() : Double = {return value}
    def isLower(other : Double) :Boolean={ value<other }
    def isGreaterOrEqual(other : Double) :Boolean={ value>=other }
    def isLowerOrEqual(other : Double) :Boolean={ value<=other }
    def isGreater(other : Double) :Boolean={ value>other }
    override def isVoid():Boolean = false;
    override def getValue():Object = new java.lang.Double(value)	
    override def getMetaClass():org.k2.language.structure.Class={
        return createMetaClass("k2::standard::Real")
    }

}*/

class RichCharacter(value:java.lang.Character)  extends RichValueType with EObjectImplForPrimitive{
  //generated
  override 	 def equals(arg0:Any) : Boolean = value.equals(arg0)
  override 	 def hashCode() : Int = value.hashCode()
      def compareTo(arg0:Char) : Int = value.compareTo(arg0)
     def charValue() : Char = value.charValue()
  
  //end generated

    //TODO
    def compareTo(other : Object) :Int={//TODO
        0}
    override def toString() :java.lang.String={return ""+value}
    override  def isVoid():Boolean = false;
    override def getValue():Object = value
    override def getMetaClass():org.kermeta.language.structure.Class={
        return createMetaClass("k2::standard::Char")
    }

}


class RichEnum(value:java.lang.Object)  extends  EObjectImplForPrimitive{
    override  def isVoid():Boolean = value==null;
    def getValue():java.lang.Object = value
    override def getMetaClass():org.kermeta.language.structure.Class={
        return createMetaClass("k2::language::structure::Enumeration")
    }

}

trait EObjectImplForPrimitive extends EObjectImplForKO{
  override def eAdapters(): org.eclipse.emf.common.util.EList[org.eclipse.emf.common.notify.Adapter] =null;
      def eDeliver():Boolean =true;
      def eSetDeliver(deliver:Boolean):Unit={}

}


trait EObjectImplForKO extends KermetaObject {
    def eUnset(feature: org.eclipse.emf.ecore.EStructuralFeature)={}
    def eIsSet(feature: org.eclipse.emf.ecore.EStructuralFeature):Boolean = true
    def eSet(feature: org.eclipse.emf.ecore.EStructuralFeature,x:Any):Unit={}
    def eGet(feature: org.eclipse.emf.ecore.EStructuralFeature,resolv: Boolean):java.lang.Object={null}
    def eGet(feature: org.eclipse.emf.ecore.EStructuralFeature):java.lang.Object={null}
    def eCrossReferences():  org.eclipse.emf.common.util.EList[org.eclipse.emf.ecore.EObject] = null
    def eIsProxy():Boolean = false
    def eAllContents(): org.eclipse.emf.common.util.TreeIterator[org.eclipse.emf.ecore.EObject] =null
    def eContents():  org.eclipse.emf.common.util.EList[org.eclipse.emf.ecore.EObject] = null
    def eContainmentFeature():org.eclipse.emf.ecore.EReference =null;
    def eContainingFeature():   org.eclipse.emf.ecore.EStructuralFeature =null
    def eContainer() : org.eclipse.emf.ecore.EObject =null
    def eResource() :   org.eclipse.emf.ecore.resource.Resource =null;
    def eClass() : org.eclipse.emf.ecore.EClass = null;
    def eNotify( notification:org.eclipse.emf.common.notify.Notification):Unit=null;
    override  def isVoid():Boolean;
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
    def plus(other : String) :java.lang.String={return value + other}
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
    def ksplit(delimiter : String) :java.util.List[String]={
        var list: java.util.List[String] = new java.util.ArrayList[String]()
        value.split(delimiter).foreach{e=>list.add(e)}
        return list;
    }*/
   //override def equals(arg0:Any) : Boolean = value.equals(arg0)
	 override def toString() : java.lang.String = value.toString()
	 override def hashCode() : Int = value.hashCode()
	 def compareTo(arg0:java.lang.String) : Int = value.compareTo(arg0)
	 def indexOf(arg0:Int) : Int = value.indexOf(arg0)
	 def indexOf(arg0:Int,arg1:Int) : Int = value.indexOf(arg0,arg1)
	 def indexOf(arg0:java.lang.String) : Int = value.indexOf(arg0)
	 def indexOf(arg0:java.lang.String,arg1:Int) : Int = value.indexOf(arg0,arg1)
	 def charAt(arg0:Int) : Char = value.charAt(arg0)
	 def codePointAt(arg0:Int) : Int = value.codePointAt(arg0)
	 def codePointBefore(arg0:Int) : Int = value.codePointBefore(arg0)
	 def codePointCount(arg0:Int,arg1:Int) : Int = value.codePointCount(arg0,arg1)
	 def compareToIgnoreCase(arg0:java.lang.String) : Int = value.compareToIgnoreCase(arg0)
	 def concat(arg0:java.lang.String) : java.lang.String = value.concat(arg0)
	 def contentEquals(arg0:java.lang.StringBuffer) : Boolean = value.contentEquals(arg0)
	 def endsWith(arg0:java.lang.String) : Boolean = value.endsWith(arg0)
	 def equalsIgnoreCase(arg0:java.lang.String) : Boolean = value.equalsIgnoreCase(arg0)
	 def getChars(arg0:Int,arg1:Int,arg2:Array[Char],arg3:Int) : Any = value.getChars(arg0,arg1,arg2,arg3)
	 def intern() : java.lang.String = value.intern()
	 def isEmpty() : Boolean = value.isEmpty()
	 def lastIndexOf(arg0:Int) : Int = value.lastIndexOf(arg0)
	 def lastIndexOf(arg0:Int,arg1:Int) : Int = value.lastIndexOf(arg0,arg1)
	 def lastIndexOf(arg0:java.lang.String) : Int = value.lastIndexOf(arg0)
	 def lastIndexOf(arg0:java.lang.String,arg1:Int) : Int = value.lastIndexOf(arg0,arg1)
	 def length() : Int = value.length()
	 def matches(arg0:java.lang.String) : Boolean = value.matches(arg0)
	 def offsetByCodePoints(arg0:Int,arg1:Int) : Int = value.offsetByCodePoints(arg0,arg1)
	 def regionMatches(arg0:Int,arg1:java.lang.String,arg2:Int,arg3:Int) : Boolean = value.regionMatches(arg0,arg1,arg2,arg3)
	 def regionMatches(arg0:Boolean,arg1:Int,arg2:java.lang.String,arg3:Int,arg4:Int) : Boolean = value.regionMatches(arg0,arg1,arg2,arg3,arg4)
	 def replace(arg0:Char,arg1:Char) : java.lang.String = value.replace(arg0,arg1)
	 def replaceAll(arg0:java.lang.String,arg1:java.lang.String) : java.lang.String = value.replaceAll(arg0,arg1)
	 def replaceFirst(arg0:java.lang.String,arg1:java.lang.String) : java.lang.String = value.replaceFirst(arg0,arg1)
	 def split(arg0:java.lang.String,arg1:Int) : Array[java.lang.String] = value.split(arg0,arg1)
	 def split(arg0:java.lang.String) : Array[java.lang.String] = value.split(arg0)
	 def startsWith(arg0:java.lang.String,arg1:Int) : Boolean = value.startsWith(arg0,arg1)
	 def startsWith(arg0:java.lang.String) : Boolean = value.startsWith(arg0)
	 def substring(arg0:Int) : java.lang.String = value.substring(arg0)
	 def substring(arg0:Int,arg1:Int) : java.lang.String = value.substring(arg0,arg1)
	 def toCharArray() : Array[Char] = value.toCharArray()
	 def toLowerCase() : java.lang.String = value.toLowerCase()
	 def toUpperCase() : java.lang.String = value.toUpperCase()
	 def trim() : java.lang.String = value.trim()

    override def isVoid():Boolean = value ==null;
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
        return createMetaClass("k2::standard::String")
    }

} 
class RichUnknownJavaObject  extends Object {
    override def toString() :java.lang.String={return "toString of  UnknownJavaObject not implemented yet";
    }
}



