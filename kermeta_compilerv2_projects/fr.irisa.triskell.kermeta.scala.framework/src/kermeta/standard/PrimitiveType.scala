package kermeta.standard;
//import fr.irisa.triskell.kermeta.language.structure._
//import fr.irisa.triskell.kermeta.language._
import scala._
//import scala.collection.JavaConversions._
//import fr.irisa.triskell.kermeta.language.behavior._
 
    
object PrimitiveConversion{
	implicit def string2kermeta(x: String) = new RichString(x)	
	implicit def boolean2kermeta(x: Boolean) = new RichBoolean(x)	
	implicit def boolean2kermeta(x: java.lang.Boolean) : Boolean = x.booleanValue()
	implicit def iterator2kermeta(x: java.util.Iterator[_])= new RichIterator(x)

	implicit def class2kermetaclass(x: Class[_]) = new RichClass(x)	
	implicit def field2kermetaclass(x: java.lang.reflect.Field) = new RichField(x)	
	implicit def field2kermetaclass(x: org.eclipse.emf.ecore.EStructuralFeature) = new RichAttribute(x)	
	
	implicit def integer2kermeta(x: Int) = new RichInteger(x)	
	implicit def real2kermeta(x: Double) = new RichReal(x)	
	implicit def character2kermeta(x: Char) = new RichCharacter(x)	
	implicit def toInt(in:Integer) = new RichInteger(in.intValue)
}  
  
class RichClass(e:Class[_]){
	def ScalaclassDefinition():Class[_]={
		
		return e;
	}
	def ScalaeAllAttributes():java.util.List[java.lang.reflect.Field]={
		var v : java.util.List[java.lang.reflect.Field] = new java.util.ArrayList[java.lang.reflect.Field] 
		
		 e.getDeclaredFields.foreach{e=>v.add(e)}
		return v;
	}
}

class RichField(e:java.lang.reflect.Field){
	def ScalaisDerived():Boolean={
		return false;
	}
	def Scalaname():String={
			return e.getName;
	}
	
}

class RichAttribute(e:org.eclipse.emf.ecore.EStructuralFeature){
	def ScalaisDerived():Boolean={
		return false;
	}
	def Scalaname():String={
			return e.getName;
	}
	
}

class Void  extends Object //with fr.irisa.triskell.kermeta.scala.framework.emf.aspects.KermetaObjectAspect  
{
	 def isVoid() :Boolean={return true;}
	 override def toString() :java.lang.String={return  "<void>";}
}
 
class RichValueType[G]  extends Object {
		def isNotEqual(other : Any) :Boolean = {!this.equals(other)}
}

abstract class Comparable[G]  extends Object {
	def isLower(other : G) :Boolean
	def isGreaterOrEqual(other : G) :Boolean
	def compareTo(other : G) :Int
	def isLowerOrEqual(other : G) :Boolean
	def isGreater(other : G) :Boolean
	}
	abstract class Summable[G]  extends Object {
	def plus(other : G) :G
	def isNotEqual(other : Any) :Boolean = {!this.equals(other) }
}
class RichNotComparableException  extends Exception  {}

class RichIterator (value: java.util.Iterator[_]) extends RichValueType[Boolean] {
	def isOff():Boolean = {return !value.hasNext()}	
}


class RichBoolean (value: Boolean) extends RichValueType[Boolean] {
		
	def isVoid() :Boolean={return null.asInstanceOf[Boolean].equals(value)}

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

	
}
abstract class RichNumeric[G]  extends Comparable[G]{}

class RichInteger(value: Int)  extends RichNumeric[Int] {
	def isVoid() :Boolean={return null.asInstanceOf[Int].equals(value)}
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
	//TODO
	def mod(other : Int) :Int={return 0}
	//TODO
	def mod(other : Integer) :Int={return 0}
	def div(other : Int) :Int={return value/other}
	def div(other : Integer) :Int={return value/(other.intValue)}
	def toReal() :Double={return value}
	//TODO
	override def compareTo(other : Int) :Int={return 0}
	//TODO
	def compareTo(other : Integer) :Int={return 0} 
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
	def isNotEqual(other : Any) :Boolean = {!this.equals(other)}
	
	//def isNotEqual(other : Any) :Boolean = this.equals(other)
	
}


class RichReal (value: Double) extends RichNumeric[Double] {
	def isVoid() :Boolean={return null.asInstanceOf[Double].equals(value)}
	def plus(other : Double) :Double={return value+other.toDouble}
	def mult(other : Double) :Double={return value*other.toDouble}
	def minus(other : Double) :Double={return value-other.toDouble}
	def toInteger() :Int={var v : Int = value.intValue
	                          return v}
	def uminus() :Double={return -1 * value}
	def div(other : Double) :Double={return value+other.toDouble}
	//TODO
	override def compareTo(other : Double) :Int={return 0}
	override def toString() :java.lang.String={return ""+value}
    def toDouble() : Double = {return value}
    def isLower(other : Double) :Boolean={ value<other }
	def isGreaterOrEqual(other : Double) :Boolean={ value>=other }
	def isLowerOrEqual(other : Double) :Boolean={ value<=other }
	def isGreater(other : Double) :Boolean={ value>other }
	def isNotEqual(other : Any) :Boolean = {!this.equals(other)}

}

class RichCharacter(value:Char)  extends RichValueType {
	//TODO
	def isVoid() :Boolean={return null.asInstanceOf[Char].equals(value)}
	def compareTo(other : Object) :Int={0}
	override def toString() :java.lang.String={return ""+value}
}
class RichString(value: java.lang.String)  extends RichValueType {
	//TODO
	def isVoid() :Boolean={return null.asInstanceOf[String].equals(value)}
	def append(other : String):String={return value + other}
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
	override def toString() :java.lang.String={value.toString}
	def split(delimiter : String) :java.util.List[String]={
			var list: java.util.List[String] = new java.util.ArrayList[String]()
			value.split(delimiter).foreach{e=>list.add(e)}
			return list;
	}
} 
class RichUnknownJavaObject  extends Object {
	override def toString() :java.lang.String={return "toString of  UnknownJavaObject not implemented yet";
	  }
}



