package p1

 
import org.eclipse.emf.ecore._;
import scala.collection.jcl._;

trait collectionTraits{
  implicit def convertSet[T](set : java.util.Set[T]) = Set(set)
  implicit def convertList[T](set : java.util.List[T]) = Buffer(set)
  implicit def convertSortedSet[T](set : java.util.SortedSet[T]) = SortedSet(set)
  implicit def convertMap[T,E](set : java.util.Map[T,E]) = Map(set)
  implicit def convertSortedMap[T,E](set : java.util.SortedMap[T,E]) = SortedMap(set)
  
  implicit def unconvertSet[T](set : SetWrapper[T]) = set.underlying
  implicit def unconvertCollection[T](set : CollectionWrapper[T]) = set.underlying
  implicit def unconvertList[T](set : BufferWrapper[T]) = set.underlying
  implicit def unconvertSortedSet[T](set : SortedSetWrapper[T]) = set.underlying  
  implicit def unconvertMap[T,E](set : MapWrapper[T,E]) = set.underlying
  implicit def unconvertSortedMap[T,E](set : SortedMapWrapper[T,E]) = set.underlying
  
}

trait implicit1 extends collectionTraits{
 

    implicit def epack(xs: EPackage) = new RichEPackage(xs)
  implicit def e(xs : EClassifier) = xs match { 
   //génération des feuiiles au noeuds
   case (ys : EClass) => new RichEClass(ys.asInstanceOf[EClass]);
   case (ys : EDataType) => new RichEDataType(ys.asInstanceOf[EDataType]);
   case (ys : EClassifier) => new RichEClassifier(ys);
}

}


object Util{
  implicit def ecl(xs: EClass) = new RichEClass(xs)
  var traitname :String ="implicit1" 
  def generateMethod():String={ 
		  var returnedString : String =   "\t def generateVisitor(tabsString 	: String) : String = { \n\t\t return null;\n\t}";
		  return returnedString
  }
  def generateOverrideMethod():String={
		  var returnedString : String =   "override "+  generateMethod()
		  return returnedString
  }
    var subclasses :java.util.HashMap[EClass, Collection[EClass]] = new java.util.HashMap[EClass, Collection[EClass]] ();
    var concreteClass :Collection[EClass] = new ArrayList[EClass] ();
    def generateTraits(tabsString : String) : String = {
    		var returnedString  : String = "\n" + "trait collectionTraits{\n"+
  "implicit def convertSet[T](set : java.util.Set[T]) = Set(set)\n"+
  "implicit def convertList[T](set : java.util.List[T]) = Buffer(set)\n"+
  "implicit def convertSortedSet[T](set : java.util.SortedSet[T]) = SortedSet(set)\n"+
  "implicit def convertMap[T,E](set : java.util.Map[T,E]) = Map(set)\n"+
  "implicit def convertSortedMap[T,E](set : java.util.SortedMap[T,E]) = SortedMap(set)\n"+  
  "implicit def unconvertSet[T](set : SetWrapper[T]) = set.underlying\n"+
  "implicit def unconvertCollection[T](set : CollectionWrapper[T]) = set.underlying\n"+
  "implicit def unconvertList[T](set : BufferWrapper[T]) = set.underlying\n"+
  "implicit def unconvertSortedSet[T](set : SortedSetWrapper[T]) = set.underlying\n"+  
  "implicit def unconvertMap[T,E](set : MapWrapper[T,E]) = set.underlying\n"+
  "implicit def unconvertSortedMap[T,E](set : SortedMapWrapper[T,E]) = set.underlying\n}"+
  "\n\ntrait "+Util.traitname+" extends collectionTraits{";
  	  this.concreteClass.foreach({c => returnedString = returnedString +"implicit def fun"+c.getName()+"(xs : "+c.getName()+") =";
                               var v : scala.List[EClass] = List[EClass]()
                               
                                this.subclasses.keySet.toArray.foreach(kk => if ((this.subclasses.get(kk).exists(sb => 
  sb.equals(c)) && !v.exists(sb1=>sb1.equals(c)))){
                                          v=v.+(kk.asInstanceOf[EClass])
                                                                })
                               if (v.size ==0){ 
                                 returnedString = returnedString +" new Rich"+c.getName() +"(xs);\n"
                               }	else{
                            	   
                               returnedString = returnedString +"xs match {\n"; 
                               v=v.sort((e1, e2) => (this.subclasses.get(e1).size > this.subclasses.get(e2).size)) //e1.getName.compare(e2.getName)<0) 
                               v.foreach(claz=>{ 
                            		returnedString = returnedString +"case (ys : "+ claz.getName()+") => new Rich"+ claz.getName()+ "(ys.asInstanceOf["+claz.getName() +"]);\n"
                            	
                            	})
       returnedString = returnedString +"case (ys : "+ c.getName()+") => new Rich"+ c.getName()+ "(ys.asInstanceOf["+c.getName() +"]);\n"
  	returnedString = returnedString +"}\n";

                               }
      })
  	returnedString = returnedString +"}";
                              
   
      
      
      
      
 return     returnedString;
}      

}

class RichEPackage  (value: org.eclipse.emf.ecore.EPackage) extends implicit1 {

  
  
    def createInherithanceTree():Void= { 
		
    		value.getESubpackages.foreach(e=>{e.createInherithanceTree()} )  
			value.getEClassifiers.foreach(c=>c.createInherithanceTree)	
			return null;
		}

  
  def generateVisitor(tabsString 	: String) : String = { 
		
		var returnedString  : String =""
		value.getESubpackages.foreach(e=>returnedString = returnedString +e.generateVisitor(tabsString))  
		value.getEClassifiers.foreach(e=>returnedString = returnedString+e.generateVisitor(tabsString))	
		return returnedString;
	 }
} 

class RichEClassifier(value: EClassifier)  extends implicit1  {
   
  def generateVisitor(tabsString 	: String) : String = {
		return "";
	 }
  def generateTraits(tabsString : String) : String = {
		return "";
	 }
  def createInherithanceTree() = {
	 }
  
}

class RichEDataType(value: EDataType)  extends RichEClassifier(value: EDataType) with implicit1{
     
  override def generateVisitor(tabsString : String) : String = {
		return "";
		
	 }
  override def generateTraits(tabsString : String) : String = {
		return "";
	 }
  override def createInherithanceTree() = {
	 }
  
				
  }


class RichEClass(aClass: EClass) extends RichEClassifier(aClass: EClassifier) with implicit1{
  implicit def e(xs : EClass) =  new RichEClass(xs.asInstanceOf[EClass])
  override def generateVisitor(tabsString : String) : String = {
		var returnedString  : String = "\n" + " class Rich"+ aClass.getName +"(value:"+ aClass.getName+")"
			if (aClass.getESuperTypes.size == 0){
				returnedString =returnedString + "  extends "+ Util.traitname+" {\n"
				returnedString =returnedString +	Util.generateMethod
			  
			}else{
				var i:int  = 0;
				aClass.getESuperTypes.foreach(superC => 
					{
						if (i==0) {
							returnedString =returnedString + "  extends Rich" +superC.getName +"(value:"+ superC.getName+")"
						}else{
							//returnedString =returnedString + ", " +superC.getName; 
						}
						i=i+1;
					}
				)
				returnedString =returnedString + "  with "+ Util.traitname+" {\n"

				returnedString =returnedString +	Util.generateOverrideMethod
			}
		
				returnedString =returnedString + "  \n}"
  
		 return returnedString;
	 }
     override def createInherithanceTree() = {
    		if (aClass.getESuperTypes.size == 0){
    			if (!Util.concreteClass.exists(c=> c.getName.equals(aClass.getName))){
    		    	 	  Util.concreteClass.add(aClass)	  
    			}
           }else{
				Util.subclasses.put(aClass, aClass.getMainSuperClass())
    	} 
	 }
     def getMainSuperClass():ArrayList[EClass] = {
    	var list : ArrayList[EClass] = new ArrayList[EClass]();
		aClass.getEAllSuperTypes().foreach(a=>    	list =list.+(a) )
		aClass.getEAllSuperTypes().foreach(a=> { 
			
		  a.getMainSuperClass().foreach(c =>  {if (!list .has(c)){
			  list.add(c)
		  } })})		
     	return list;
	  }
}




