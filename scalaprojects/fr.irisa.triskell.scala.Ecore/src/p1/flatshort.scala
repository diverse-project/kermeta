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
 implicit def e(xs : EStructuralFeature) = xs match { 
   //génération des feuiiles au noeuds
   case (ys : EAttribute) => new RichEAttribute(ys.asInstanceOf[EAttribute]);
   case (ys : EReference) => new RichEReference(ys.asInstanceOf[EReference]);
   case (ys : EStructuralFeature) => new RichEStructuralFeature(ys.asInstanceOf[EStructuralFeature]);
  }
  implicit def eop(xs: EOperation) = new RichEOperation(xs)
  implicit def epar(xs: EParameter) = new RichEParameter(xs)
}


class RichEPackage  (value: org.eclipse.emf.ecore.EPackage) extends implicit1 {
 
  def flatshort(tabsString 	: String) : String = { 
		var returnedString  : String =value.getName   +"\n"
		value.getESubpackages.foreach(e=>returnedString = returnedString +e.flatshort(tabsString))  
		value.getEClassifiers.foreach(e=>returnedString = returnedString+e.flatshort(tabsString))	
//		value.getEClassifiers.
		return returnedString;
	 }
}

class RichEClassifier(value: EClassifier)  extends implicit1  {
   
  def flatshort(tabsString 	: String) : String = {
		return null;
	 }
}

class RichEDataType(value: EDataType)  extends RichEClassifier(value: EDataType) with implicit1{
   
  override def flatshort(tabsString : String) : String = {
		return "\n" +value.getName; 
		
	 }
}

class RichEClass(aClass: EClass) extends RichEClassifier(aClass: EClassifier) with implicit1{

  override def flatshort(tabsString : String) : String = {
		var returnedString  : String = "\n" +this.short(tabsString)
		
		aClass.getESuperTypes.foreach( eSuperClass => 
            
        		returnedString = returnedString + "\n" + eSuperClass.flatshort(tabsString + "\t")
        	
        )     
		// we return the result
		
    
		 return returnedString;
		  
	 }
  def short(tabsString 	: String):String ={ 
		var returnedString  : String = tabsString + aClass.getName() + " :";
		
  		aClass.getEStructuralFeatures.foreach(p=>returnedString = returnedString+ p.short(tabsString));
  		aClass.getEOperations.foreach(op=>returnedString = returnedString+ op.short(tabsString));
  		
  		return returnedString;
	}
}

 class RichEStructuralFeature(value: EStructuralFeature) extends implicit1  {
   
   def short(tabsString 	: String) : String= {
		return null;
	 }
}

class RichEAttribute(value: EAttribute)  extends RichEStructuralFeature(value: EStructuralFeature) with implicit1{
   
  override def short(tabsString 	: String) : String = {
		var returnedString = "\n" + tabsString + "    attr  " + value.getName.toString
		returnedString = returnedString + " : " + value.getEType.getName() + "[" + value.getLowerBound().toString + ".." + value.getUpperBound().toString +"]"
		return returnedString;
	 }
	 
}

class RichEReference(value: EReference)  extends RichEStructuralFeature(value: EStructuralFeature) with implicit1{
   
  override def short(tabsString 	: String) : String = {
		var returnedString = "\n" + tabsString + "    ref  " + value.getName.toString
		returnedString = returnedString + " : " + value.getEType.getName() + "[" + value.getLowerBound().toString + ".." + value.getUpperBound().toString +"]"
				if (value.getEOpposite != null) { 
					returnedString = returnedString + " opposite of " + value.getEOpposite().getName();
				}
		return returnedString;
	 }
}

class RichEOperation(value: EOperation)  extends   implicit1{
   
   def short(tabsString 	: String) : String = {
		var returnedString = "\n" + tabsString + "    op   " + value.getName + "("
		value.getEParameters.foreach(p=>returnedString=returnedString + p.short(tabsString))	
		
		returnedString = returnedString + ")"
		if (value.getEType != null){
			returnedString = returnedString + " : " + value.getEType.getName
		}
		return returnedString;
	 }
}

class RichEParameter(value: EParameter)  extends   implicit1{
   
   def short(tabsString 	: String) : String = {
		return  value.getName + " : " + value.getEType.getName + " "
	 }
}



