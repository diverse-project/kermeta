package kermeta.standard;
//import fr.irisa.triskell.kermeta.language.structure._
//import fr.irisa.triskell.kermeta.language._
import scala._
//import fr.irisa.triskell.kermeta.language.behavior._

    
object PrimitiveConversion{
	implicit def string2kermeta(x: String) = new RichString(x)	
	implicit def boolean2kermeta(x: Boolean) = new RichBoolean(x)	
//	implicit def integer2kermeta(x: Integer) = new RichInteger(x)	
	implicit def integer2kermeta(x: Int) = new RichInteger(x)	
	implicit def real2kermeta(x: Double) = new RichReal(x)	
	implicit def character2kermeta(x: Char) = new RichCharacter(x)	
	implicit def toInt(in:Integer) = new RichInteger(in.intValue)
}  
  
class Void  extends Object //with fr.irisa.triskell.kermeta.scala.framework.emf.aspects.KermetaObjectAspect  
{
	 def isVoid() :Boolean={return true;}
	 override def toString() :java.lang.String={return  "<void>";}
}
 
class RichValueType[G]  extends Object {}

abstract class Comparable[G]  extends Object {
	def isLower(other : G) :Boolean={  true}
	def isGreaterOrEqual(other : G) :Boolean={true}
	def compareTo(other : G) :Int
	def isLowerOrEqual(other : G) :Boolean={true}
	def isGreater(other : G) :Boolean={true}
	}
	abstract class Summable[G]  extends Object {
	def plus(other : G) :G
}
class RichNotComparableException  extends Exception  {}


class RichBoolean (value: Boolean) extends RichValueType[Boolean] {
	def not() :Boolean={return !value}
	def xor(other : Boolean) :Boolean={true}
	//override def equals(other : Object) :Boolean={return true}
	def or(other : Boolean) :Boolean={true} 
	def nand(other : Boolean) :Boolean={true}
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
}
abstract class RichNumeric[G]  extends Comparable[G]{}

class RichInteger(value: Int)  extends RichNumeric[Int] {
	override def isLower(other : Int) :Boolean={true}
	def plus(other : Int) :Int={value+other}
	def plus(other : Integer) :Int={value+other.intValue}
	def mult(other : Int) :Int={value*other}
	def mult(other : Integer) :Int={value*other.intValue}
	def minus(other : Integer) :Int={return value-other.intValue}
	def minus(other : Int) :Int={return value-other}
	//def equals(other : Object) :Boolean={return value==other.asInstanceOf[Int]}
	def mod(other : Int) :Int={return 0}
	def mod(other : Integer) :Int={return 0}
	def div(other : Int) :Int={return value/other}
	def div(other : Integer) :Int={return value/(other.intValue)}
	def toReal() :Double={return 0.0}
	override def compareTo(other : Int) :Int={return 0}
	def compareTo(other : Integer) :Int={return 0} 
	override def isGreater(other : Int) :Boolean={return true}
	def isGreater(other : Integer) :Boolean={return true}
	override def isGreaterOrEqual(other : Int) :Boolean={return true}
	def isGreaterOrEqual(other : Integer) :Boolean={return true}
	def uminus() :Int={return value * (-1);}
	//def times(body : Integer=>Unit) :{}
	override def toString() :java.lang.String={return ""+value}
	override def isLowerOrEqual(other : Int) :Boolean={return true}
	def isLowerOrEqual(other : Integer) :Boolean={return true}
	def toInt() : Int = {return value}
}


class RichReal (value: Double) extends RichNumeric[Double] {
	def plus(other : Double) :Double={return value+other.toDouble}
	def mult(other : Double) :Double={return value*other.toDouble}
	def minus(other : Double) :Double={return value-other.toDouble}
	def toInteger() :Int={var v : Int = value.intValue
	                          return v}
	def uminus() :Double={return -1 * value}
	//def equals(other : Object) :Boolean={return true}
	def div(other : Double) :Double={return value+other.toDouble}
	override def compareTo(other : Double) :Int={return 0}
	override def toString() :java.lang.String={return ""+value}
    def toDouble() : Double = {return value}
}

class RichCharacter(value:Char)  extends RichValueType {
	def compareTo(other : Object) :Int={0}
	override def toString() :java.lang.String={return ""+value}
}
class RichString(value: java.lang.String)  extends RichValueType {
	def append(other : String)={}
	def plus(other : String) :java.lang.String={return value + other}
	//def equals(other : Object) :Boolean={return value.equals(other)}
	def toReal() :Double={return java.lang.Double.parseDouble(value)}
	def toBoolean() :Boolean={return java.lang.Boolean.parseBoolean(value)}
	def contains(str1 : String) :Boolean={return value.contains(str1)}
	def compareTo(other : String) :Int={return value.compareTo(other)}
	def indexOf(str : String) :Int={return value.indexOf(str)}
	def elementAt(index : Int) :Char={return value.charAt(index)}
	def size() :Int={return value.length}
	def replace(str1 : String, str2 : String) :java.lang.String={return value.replace(str1,str2)}
	def toUpperCase() :java.lang.String={return value.toUpperCase()}
	def toInteger() :Int={return java.lang.Integer.parseInt(value)}
	def toLowerCase() :java.lang.String={return value.toLowerCase()}
	def substring(startIndex : Int, endIndex : Int) :java.lang.String={return value.substring(startIndex,endIndex)}
	override def toString() :java.lang.String={value.toString}
	//def split(delimiter : String) :Sequence[String]={return value.split(delimiter)}
} 
class RichUnknownJavaObject  extends Object {
	override def toString() :java.lang.String={return "toString of  UnknownJavaObject not implemented yet";
	  }
}



