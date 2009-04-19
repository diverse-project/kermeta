package p1

/*
 * Attributs multuplicité
 * Aspects sur les ecores
 * getter sur les ecore
 * Protection des mots clés
 * Implanter le framework
 * Aspects sur les kmt
*/  
     
import fr.irisa.triskell.kermeta.language._
import fr.irisa.triskell.kermeta.language.structure._ 
import fr.irisa.triskell.kermeta.language.behavior._
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
 
trait implicit1 extends collectionTraits{implicit def funObject(xs : Object) =xs match {
case (ys : VirtualType) => new RichVirtualType(ys.asInstanceOf[VirtualType]);
case (ys : PrimitiveType) => new RichPrimitiveType(ys.asInstanceOf[PrimitiveType]);
case (ys : ClassDefinition) => new RichClassDefinition(ys.asInstanceOf[ClassDefinition]);
case (ys : CallResult) => new RichCallResult(ys.asInstanceOf[CallResult]);
case (ys : ModelTypeVariable) => new RichModelTypeVariable(ys.asInstanceOf[ModelTypeVariable]);
case (ys : ObjectTypeVariable) => new RichObjectTypeVariable(ys.asInstanceOf[ObjectTypeVariable]);
case (ys : Parameter) => new RichParameter(ys.asInstanceOf[Parameter]);
case (ys : Enumeration) => new RichEnumeration(ys.asInstanceOf[Enumeration]);
case (ys : Property) => new RichProperty(ys.asInstanceOf[Property]);
case (ys : TypeReference) => new RichTypeReference(ys.asInstanceOf[TypeReference]);
case (ys : Operation) => new RichOperation(ys.asInstanceOf[Operation]);
case (ys : TypeLiteral) => new RichTypeLiteral(ys.asInstanceOf[TypeLiteral]);
case (ys : BooleanLiteral) => new RichBooleanLiteral(ys.asInstanceOf[BooleanLiteral]);
case (ys : CallValue) => new RichCallValue(ys.asInstanceOf[CallValue]);
case (ys : StringLiteral) => new RichStringLiteral(ys.asInstanceOf[StringLiteral]);
case (ys : VoidLiteral) => new RichVoidLiteral(ys.asInstanceOf[VoidLiteral]);
case (ys : MultiplicityElement) => new RichMultiplicityElement(ys.asInstanceOf[MultiplicityElement]);
case (ys : TypeVariable) => new RichTypeVariable(ys.asInstanceOf[TypeVariable]);
case (ys : CallSuperOperation) => new RichCallSuperOperation(ys.asInstanceOf[CallSuperOperation]);
case (ys : CallVariable) => new RichCallVariable(ys.asInstanceOf[CallVariable]);
case (ys : CallFeature) => new RichCallFeature(ys.asInstanceOf[CallFeature]);
case (ys : IntegerLiteral) => new RichIntegerLiteral(ys.asInstanceOf[IntegerLiteral]);
case (ys : ModelType) => new RichModelType(ys.asInstanceOf[ModelType]);
case (ys : DataType) => new RichDataType(ys.asInstanceOf[DataType]);
case (ys : Assignment) => new RichAssignment(ys.asInstanceOf[Assignment]);
case (ys : SelfExpression) => new RichSelfExpression(ys.asInstanceOf[SelfExpression]);
case (ys : VariableDecl) => new RichVariableDecl(ys.asInstanceOf[VariableDecl]);
case (ys : CallExpression) => new RichCallExpression(ys.asInstanceOf[CallExpression]);
case (ys : EmptyExpression) => new RichEmptyExpression(ys.asInstanceOf[EmptyExpression]);
case (ys : Class) => new RichClass(ys.asInstanceOf[Class]);
case (ys : LambdaExpression) => new RichLambdaExpression(ys.asInstanceOf[LambdaExpression]);
case (ys : GenericTypeDefinition) => new RichGenericTypeDefinition(ys.asInstanceOf[GenericTypeDefinition]);
case (ys : ProductType) => new RichProductType(ys.asInstanceOf[ProductType]);
case (ys : TypedElement) => new RichTypedElement(ys.asInstanceOf[TypedElement]);
case (ys : Package) => new RichPackage(ys.asInstanceOf[Package]);
case (ys : JavaStaticCall) => new RichJavaStaticCall(ys.asInstanceOf[JavaStaticCall]);
case (ys : Raise) => new RichRaise(ys.asInstanceOf[Raise]);
case (ys : Block) => new RichBlock(ys.asInstanceOf[Block]);
case (ys : Literal) => new RichLiteral(ys.asInstanceOf[Literal]);
case (ys : FunctionType) => new RichFunctionType(ys.asInstanceOf[FunctionType]);
case (ys : Loop) => new RichLoop(ys.asInstanceOf[Loop]);
case (ys : Conditional) => new RichConditional(ys.asInstanceOf[Conditional]);
case (ys : Constraint) => new RichConstraint(ys.asInstanceOf[Constraint]);
case (ys : TypeDefinitionContainer) => new RichTypeDefinitionContainer(ys.asInstanceOf[TypeDefinitionContainer]);
case (ys : EnumerationLiteral) => new RichEnumerationLiteral(ys.asInstanceOf[EnumerationLiteral]);
case (ys : ParameterizedType) => new RichParameterizedType(ys.asInstanceOf[ParameterizedType]);
case (ys : VoidType) => new RichVoidType(ys.asInstanceOf[VoidType]);
case (ys : TypeDefinition) => new RichTypeDefinition(ys.asInstanceOf[TypeDefinition]);
case (ys : Expression) => new RichExpression(ys.asInstanceOf[Expression]);
case (ys : TypeVariableBinding) => new RichTypeVariableBinding(ys.asInstanceOf[TypeVariableBinding]);
case (ys : Type) => new RichType(ys.asInstanceOf[Type]); 
case (ys : NamedElement) => new RichNamedElement(ys.asInstanceOf[NamedElement]);
case (ys : Rescue) => new RichRescue(ys.asInstanceOf[Rescue]);
case (ys : Require) => new RichRequire(ys.asInstanceOf[Require]);
case (ys : Using) => new RichUsing(ys.asInstanceOf[Using]);
case (ys : ModelingUnit) => new RichModelingUnit(ys.asInstanceOf[ModelingUnit]);
case (ys : Filter) => new RichFilter(ys.asInstanceOf[Filter]);
case (ys : TypeContainer) => new RichTypeContainer(ys.asInstanceOf[TypeContainer]);
case (ys : Tag) => new RichTag(ys.asInstanceOf[Tag]);
case (ys : LambdaParameter) => new RichLambdaParameter(ys.asInstanceOf[LambdaParameter]);
case (ys : Model) => new RichModel(ys.asInstanceOf[Model]);
case (ys : Object) => new RichObject(ys.asInstanceOf[Object]);
}
implicit def funDummyClass(xs : DummyClass) = new RichDummyClass(xs);
} 

object Util{
     var subclasses :java.util.HashMap[ClassDefinition, Collection[ClassDefinition]] = new java.util.HashMap[ClassDefinition, Collection[ClassDefinition]] ();
    var concreteClass1 :Collection[ClassDefinition] = new ArrayList[ClassDefinition] ();
  
   //var traitname :String ="implicit1" 
   var concreteClass :java.util.Stack[Boolean] = new java.util.Stack[Boolean]()
   var usings : String = ""
   var outputFolder : String = "../outputScala/src"
   var traitname : String = "kermeta.standard.collectionTraits"
   def hasEcoreTag(obj : Object) : Boolean = {return obj.getOwnedTags.toArray.exists(e=> "ecore".equals(e.asInstanceOf[Tag].getName))
     
   }
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
  	  this.concreteClass1.foreach({c => returnedString = returnedString +"implicit def fun"+c.getName()+"(xs : "+c.getName()+") =";
                               var v : scala.List[ClassDefinition] = List[ClassDefinition]()
                               
                                this.subclasses.keySet.toArray.foreach(kk => if ((this.subclasses.get(kk).exists(sb => 
  sb.equals(c)) && !v.exists(sb1=>sb1.equals(c)))){
                                          v=v.+(kk.asInstanceOf[ClassDefinition])
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

   
   //var subclasses :java.util.HashMap[EClass, Collection[EClass]] = new java.util.HashMap[EClass, Collection[EClass]] ();
   // var concreteClass :Collection[EClass] = new ArrayList[EClass] ();
    
}

 class RichModelingUnit(value:ModelingUnit)  extends RichObject(value:Object)  with implicit1 {
override 	 def generateVisitor(tabsString 	: String) : String = { 
		 	var returnString : String = "";
    		Util.usings = "";
    		//value.getUsings.foreach(m => m.generateVisitor(tabsString))
    		
			value.getPackages.foreach(p=> returnString = returnString + p.generateVisitor(tabsString))
    		return returnString;
	}  
    override def createInherithanceTree():Void= {  
		value.getPackages.foreach(p=> p.createInherithanceTree())
		return null;   
    }  

}


 class RichPackage(value:Package)  extends RichNamedElement(value:NamedElement)  with implicit1 {
	 override 	 def generateVisitor(tabsString 	: String) : String = { 
		if (Util.hasEcoreTag(value))
			return generateFromEcore(tabsString)
		else if("kermeta".equals(getQualifiedName())||"kermeta.standard".equals(getQualifiedName())||"kermeta.io".equals(getQualifiedName())||"kermeta.persistence".equals(getQualifiedName())||"kermeta.utils".equals(getQualifiedName()))
			return generateFramorkAspect(tabsString)
		else
			return generateFromKM(tabsString)
		
	}  

    override def createInherithanceTree():Void= {  
     		value.getNestedPackage.foreach(e=>{e.createInherithanceTree()} )  
		 	value.getOwnedTypeDefinition.foreach(p=> {if (p.isInstanceOf[ClassDefinition]){p.asInstanceOf[ClassDefinition].createInherithanceTree()}})
		 	return null;
    } 


	def getQualifiedName():String ={ var res : String="" 
                                  if (value.getNestingPackage !=null) 
                                	  res = value.getNestingPackage.getName +"."
                                  res = res + value.getName
                                  return res
	}
	def generateFramorkAspect(tabsString 	: String) : String = {
			return ""
	  }
	def generateFromEcore(tabsString 	: String) : String = {
			return ""
	 }
	def generateFromKM(tabsString 	: String) : String = {
			var f : java.io.File = new java.io.File(Util.outputFolder + java.io.File.separator + value.getName)
  		f.mkdirs
  		var f1 : java.io.File = new java.io.File(Util.outputFolder + java.io.File.separator + value.getName + java.io.File.separator + value.getName + ".scala")
		var output : java.io.FileOutputStream = new java.io.FileOutputStream(f1)
  		var writer : java.io.PrintWriter = new java.io.PrintWriter(output)
		 var returnString : String = "package "+ value.getName+";\n";
			returnString = returnString + Util.usings
		 	value.getOwnedTypeDefinition.foreach(p=> {if (p.isInstanceOf[ClassDefinition]){returnString = returnString +p.generateVisitor(tabsString)}})
			returnString = returnString + "\n"
    		value.getNestedPackage.foreach(p=> {p.generateVisitor(tabsString)})
    		writer.println(returnString) 
    		writer.flush
    		writer.close
    		output.close
			return returnString;
	 }
	
}
 
  class RichClassDefinition(value:ClassDefinition)  extends RichGenericTypeDefinition(value:GenericTypeDefinition)  with implicit1 {
override 	 def generateVisitor(tabsString 	: String) : String = { 
		var returnString : String = "class "+ value.getName;
  		if (Util.hasEcoreTag(value)){
  		  
  		}else{
	  			//println("hasecore " +value.getName)
	  		if (value.getSuperType.size == 0){
					returnString =returnString + "  extends "+ Util.traitname
					//returnString =returnString +	Util.generateMethod
				  
				}else{
					var i:int  = 0;
					value.getSuperType.foreach(superC => 
						{
							if (i==0) {
								returnString =returnString + "  extends " +superC.asInstanceOf[Class].getTypeDefinition.getName
							}else{
								//returnedString =returnedString + ", " +superC.getName; 
							}
							i=i+1;
						}
					)
					returnString =returnString + "  with "+ Util.traitname
	
				}
	 			returnString = returnString + "{\n";
				value.getOwnedAttribute foreach(a=> returnString = returnString + a.generateVisitor(tabsString))
				value.getOwnedOperation foreach(op=> returnString = returnString + op.generateVisitor(tabsString))
	    		returnString = returnString + "}\n"
	  			}
    		return returnString;
	}   
     override def createInherithanceTree():Void= {  
				if (Util.hasEcoreTag(value)){		
    		if (value.getSuperType.size == 1 && "Object".equals(value.getSuperType.first.asInstanceOf[ParameterizedType].getTypeDefinition.asInstanceOf[ClassDefinition].getName) && !Util.hasEcoreTag(value.getSuperType.first.asInstanceOf[ParameterizedType].getTypeDefinition.asInstanceOf[ClassDefinition])){
    			if (!Util.concreteClass1.exists(c=> c.getName.equals(value.getName))){
    		    	 	  Util.concreteClass1.add(value)	  
    			}
           }else{
				Util.subclasses.put(value, value.getMainSuperClass())
           } 
 
		}
		return null;
    }   
    override def getMainSuperClass():ArrayList[ClassDefinition] = {
    	var list : ArrayList[ClassDefinition] = new ArrayList[ClassDefinition]();
		value.getSuperType().foreach(a=>    	list =list.+(a.asInstanceOf[ParameterizedType].getTypeDefinition.asInstanceOf[ClassDefinition]) )
		value.getSuperType().foreach(a=> { 
		 	
		  a.asInstanceOf[ParameterizedType].getTypeDefinition.asInstanceOf[ClassDefinition].getMainSuperClass().foreach(c =>  {if (!list .has(c)){
			  list.add(c)
		  } })})		
     	return list;
	  }



}

 class RichOperation(value:Operation)  extends RichMultiplicityElement(value:MultiplicityElement)  with implicit1 {
override 	 def generateVisitor(tabsString 	: String) : String = { 
		 	 var returnString : String = "def "+ value.getName + "(";
     		
     	var i:int  = 0;
		value.getOwnedParameter.foreach(par => 
     		{
						if (i==0) {
							returnString =returnString + par.getName +" : "+ par.getType.generateVisitor(tabsString) 
						}else{
							returnString =returnString +", "+ par.getName +" : "+ par.getType.generateVisitor(tabsString)  
						}
						i=i+1;
					}
				)
     		
       
     		returnString = returnString + ") :";// + value.getType().getClass + " ";
			returnString = returnString + value.getType().generateVisitor(tabsString) 
    		returnString = returnString + "={"; 
			if (value.getBody!= null){
			  returnString = returnString +"var result : "+ value.getType().generateVisitor(tabsString)+"=null;\n"
    		returnString = returnString + value.getBody.generateVisitor(tabsString) 
    		returnString = returnString +"\nreturn result;\n"
			}
			returnString = returnString +"}\n"
			return returnString;
  
	}  
}
 class RichProperty(value:Property)  extends RichMultiplicityElement(value:MultiplicityElement)  with implicit1 {
override 	 def generateVisitor(tabsString 	: String) : String = { 
		 		 var returnString : String = "var "+ value.getName+":";// + value.getType().getClass + " ";
		 		 
		 		 if (value.getUpper>1){
		 		   
		 		 }
		 		 returnString = returnString + value.getType().generateVisitor(tabsString) 
   
    			
    		returnString = returnString + ";\n"
    		return returnString;
	}  
}



class RichAssignment(value:Assignment)  extends RichExpression(value:Expression)  with implicit1 {
override 	 def generateVisitor(tabsString 	: String) : String = { 
		 var returnString : String = "";
		
   if (!value.isIsCast()){
		 returnString = returnString+value.getTarget.generateVisitor(tabsString)	
    	 returnString = returnString+ " = "	    	 
		 returnString = returnString+value.getValue.generateVisitor(tabsString)	
    	 }else{
    		 var target : String = value.getTarget.generateVisitor(tabsString)
    		 var targetClass : String =""
    		 var valueass :String = value.getValue.generateVisitor(tabsString)
    		 if (value.getTarget.getStaticType.isInstanceOf[NamedElement])
    			 targetClass = value.getTarget.getStaticType.asInstanceOf[NamedElement].getName
             else if (value.getTarget.getStaticType.isInstanceOf[Class])
    			 targetClass = value.getTarget.getStaticType.asInstanceOf[Class].getTypeDefinition.getName
             else
            	 targetClass = "//TODO Assignement with cast"
       
    		 returnString = returnString+ "if ("+valueass + ".isInstanceOf[" + targetClass + "]){"
    	   returnString = returnString+target	 
    	   returnString = returnString+ " = "	    	 
    	   returnString = returnString+valueass
    	   returnString = returnString+ ".asInstanceOf["	+ targetClass + "]"
         returnString = returnString+"}"
    	 }
      return returnString;
	}  
}
 class RichExpression(value:Expression)  extends RichObject(value:Object)  with implicit1 {
override 	 def generateVisitor(tabsString 	: String) : String = { 
		 return null;
	}  
}
 class RichCallExpression(value:CallExpression)  extends RichExpression(value:Expression)  with implicit1 {
override 	 def generateVisitor(tabsString 	: String) : String = { 
		  var returnString : String = "";
		 returnString = returnString+ "."+value.getName +"("
			returnString = returnString+value.getParameters.foreach(par=> par.generateVisitor(tabsString))	
    	 returnString = returnString+ ")"
    	 return returnString;
	}  
}
 class RichBlock(value:Block)  extends RichExpression(value:Expression)  with implicit1 {
override 	 def generateVisitor(tabsString 	: String) : String = { 
		  var returnString : String = "{\n";
     	  value.getStatement.foreach(exp => returnString = returnString  + "    "+exp.generateVisitor(tabsString) + ";\n")
     	  returnString = returnString+ "}\n"
    	  return returnString;
	}  
}
 class RichCallVariable(value:CallVariable)  extends RichCallExpression(value:CallExpression)  with implicit1 {
override 	 def generateVisitor(tabsString 	: String) : String = { 
				  var returnString : String = "";
		 returnString = returnString+ value.getName
		 
//			returnString = returnString+value.getParameters.foreach(par=> par.generateVisitor(tabsString))	
//    	 returnString = returnString+ ")"
    	 return returnString;

	}  
}
 class RichCallFeature(value:CallFeature)  extends RichCallExpression(value:CallExpression)  with implicit1 {
override 	 def generateVisitor(tabsString 	: String) : String = { 
				  var returnString : String = "";
		
      if ("new".equals(value.getName))
    		  {
    	  		returnString = returnString+ " "+value.getName + " "
         		 if (value.getTarget!=null)
         			 returnString = returnString+value.getTarget.generateVisitor(tabsString)
         			 returnString = returnString+ " ()"
    		  }
        else{
        		var point : String  ="" 
        		if (value.getTarget!=null){
         			 	Util.concreteClass.push(true)
        				returnString = returnString+ value.getTarget.generateVisitor(tabsString)+"."
           			 	Util.concreteClass.pop()

         			 
         			 //point = "."
        		}
          if (Util.concreteClass.size>0){
            point = ""
          }
          
         	returnString = returnString+point + value.getName
          
          
          
          
          	
         	if (value.getStaticOperation!=null){
         	  returnString = returnString+"("
         	  
         	}
          
         	returnString = returnString+point
         	Util.concreteClass.push(true)
        	Util.concreteClass.pop()	
        	var i : int = 1
         	value.getParameters.foreach(e=> {returnString = returnString+e.generateVisitor(tabsString); 
                                           if (i< value.getParameters.size()){
                                             returnString = returnString+", ";
                                           }
                                           i=i+1;})
          	
         	if (value.getStaticOperation!=null){
         	  returnString = returnString+")"
         	  
         	}

          
          }//value
//			returnString = returnString+value.getParameters.foreach(par=> par.generateVisitor(tabsString))	
//    	 returnString = returnString+ ")"
    	 return returnString;
	}  
}
 class RichCallSuperOperation(value:CallSuperOperation)  extends RichCallExpression(value:CallExpression)  with implicit1 {
override 	 def generateVisitor(tabsString 	: String) : String = { 
				  var returnString : String = "";
		 returnString = returnString+ "super." 
		 
//			returnString = returnString+value.getParameters.foreach(par=> par.generateVisitor(tabsString))	
//    	 returnString = returnString+ ")"
    	 return returnString;
	}  
}
 class RichCallResult(value:CallResult)  extends RichCallVariable(value:CallVariable)  with implicit1 {
override 	 def generateVisitor(tabsString 	: String) : String = { 
		 return "result";
	}  
}
 class RichCallValue(value:CallValue)  extends RichCallExpression(value:CallExpression)  with implicit1 {
override 	 def generateVisitor(tabsString 	: String) : String = { 
				  var returnString : String = "";
		 returnString = returnString+ value.getName +"/*CallValue**/"
//			returnString = returnString+value.getParameters.foreach(par=> par.generateVisitor(tabsString))	
//    	 returnString = returnString+ ")"
    	 return returnString;
	}  
}
 class RichConditional(value:Conditional)  extends RichExpression(value:Expression)  with implicit1 {
override 	 def generateVisitor(tabsString 	: String) : String = { 
		 var returnString : String = "if (";
		 returnString = returnString+ value.getCondition.generateVisitor(tabsString)
		 returnString = returnString+")"
		 returnString = returnString+ value.getThenBody.generateVisitor(tabsString)
		 if (value.getElseBody!=null){returnString = returnString+"else"
		 returnString = returnString+ value.getElseBody.generateVisitor(tabsString)
		 }
    	 return returnString;
	}  
}
 class RichRaise(value:Raise)  extends RichExpression(value:Expression)  with implicit1 {
override 	 def generateVisitor(tabsString 	: String) : String = { 
		var returnString : String = "throw "
		returnString = returnString +value.getExpression().generateVisitor(tabsString)
		return returnString;
	}  
}
 class RichRescue(value:Rescue)  extends RichObject(value:Object)  with implicit1 {
override 	 def generateVisitor(tabsString 	: String) : String = { 
		 return null;
	}  
}
 class RichTypeReference(value:TypeReference)  extends RichMultiplicityElement(value:MultiplicityElement)  with implicit1 {
override 	 def generateVisitor(tabsString 	: String) : String = { 
		 var returnString : String = ""
		returnString = returnString +value.getName()
		return returnString;
	}  
}
 class RichLiteral(value:Literal)  extends RichExpression(value:Expression)  with implicit1 {
override 	 def generateVisitor(tabsString 	: String) : String = { 
		 return "//TODO RichLiteral";
	}  
}
 class RichEmptyExpression(value:EmptyExpression)  extends RichExpression(value:Expression)  with implicit1 {
override 	 def generateVisitor(tabsString 	: String) : String = { 
		 return "// TODO EmptyExpression";
	}  
}
 class RichJavaStaticCall(value:JavaStaticCall)  extends RichExpression(value:Expression)  with implicit1 {
override 	 def generateVisitor(tabsString 	: String) : String = { 
		 return null;
	}  
}
class RichLambdaExpression(value:LambdaExpression)  extends RichExpression(value:Expression)  with implicit1 {
override 	 def generateVisitor(tabsString 	: String) : String = { 
		 
			var returnType :String = ""//"(";
			value.getParameters.foreach(e=>returnType = returnType + e.generateVisitor(tabsString) )
			returnType = returnType +"=>"
   			returnType = returnType + value.getBody().generateVisitor(tabsString);
//			returnType = returnType + ")";

			return returnType;
	}  
}
class RichLambdaParameter(value:LambdaParameter)  extends RichObject(value:Object)  with implicit1 {
override 	 def generateVisitor(tabsString 	: String) : String = { 
		 return value.getName;
	}  
}
 class RichIntegerLiteral(value:IntegerLiteral)  extends RichLiteral(value:Literal)  with implicit1 {
override 	 def generateVisitor(tabsString 	: String) : String = { 
		 return value.getValue.toString;
	}  
}
 class RichStringLiteral(value:StringLiteral)  extends RichLiteral(value:Literal)  with implicit1 {
override 	 def generateVisitor(tabsString 	: String) : String = { 
		 return "\"" + value.getValue.replaceAll("\n","\\\\n").replaceAll("\t","\\\\t") + "\"";
	}   
}
 class RichBooleanLiteral(value:BooleanLiteral)  extends RichLiteral(value:Literal)  with implicit1 {
override 	 def generateVisitor(tabsString 	: String) : String = { 
		 return value.isValue().toString;
	}  
}
 class RichTypeLiteral(value:TypeLiteral)  extends RichLiteral(value:Literal)  with implicit1 {
override 	 def generateVisitor(tabsString 	: String) : String = { 
		 var returnString : String = "";
		 returnString = returnString+ value.getTyperef.getName 
    	 return returnString;
	}  
}
 class RichVoidLiteral(value:VoidLiteral)  extends RichLiteral(value:Literal)  with implicit1 {
override 	 def generateVisitor(tabsString 	: String) : String = { 
		 return null;
	}  
}
 class RichLoop(value:Loop)  extends RichExpression(value:Expression)  with implicit1 {
override 	 def generateVisitor(tabsString 	: String) : String = { 
		 return null;
	}  
}
 class RichSelfExpression(value:SelfExpression)  extends RichExpression(value:Expression)  with implicit1 {
override 	 def generateVisitor(tabsString 	: String) : String = { 
		 return "this";
	}  
}
 class RichVariableDecl(value:VariableDecl)  extends RichExpression(value:Expression)  with implicit1 {
override 	 def generateVisitor(tabsString 	: String) : String = { 
		 var returnString : String = "var ";
		 returnString = returnString+ value.getIdentifier() + ":" + value.getType. generateVisitor(tabsString )  +"=";
		 if (value.getInitialization !=  null){
		   returnString = returnString+ value.getInitialization.generateVisitor(tabsString);
		 }else{
		   returnString = returnString+ "null"
		 }
    	 return returnString;
	}  
}
 class RichObject(value:Object)  extends implicit1 {
	 def generateVisitor(tabsString 	: String) : String = { 
		 return "";
	}  
  def createInherithanceTree():Void= {  
		return null;
    }  
  def getMainSuperClass():ArrayList[ClassDefinition] ={return null;}

}
 class RichModel(value:Model)  extends RichObject(value:Object)  with implicit1 {
override 	 def generateVisitor(tabsString 	: String) : String = { 
		 return null;
	}  
}
 class RichModelType(value:ModelType)  extends RichType(value:Type)  with implicit1 {
override 	 def generateVisitor(tabsString 	: String) : String = { 
		 return null;
	}  
}
 class RihType(value:Type)  extends RichObject(value:Object)  with implicit1 {
override 	 def generateVisitor(tabsString 	: String) : String = { 
		 return null;
	}  
}
 class RichTypeContainer(value:TypeContainer)  extends RichObject(value:Object)  with implicit1 {
override 	 def generateVisitor(tabsString 	: String) : String = { 
		 return null;
	}  
}
 class RichEnumerationLiteral(value:EnumerationLiteral)  extends RichNamedElement(value:NamedElement)  with implicit1 {
override 	 def generateVisitor(tabsString 	: String) : String = { 
		 return null;
	}  
}
 class RichTypeVariableBinding(value:TypeVariableBinding)  extends RichTypeContainer(value:TypeContainer)  with implicit1 {
override 	 def generateVisitor(tabsString 	: String) : String = { 
		 return null;
	}  
}
 class RichMultiplicityElement(value:MultiplicityElement)  extends RichTypedElement(value:TypedElement)  with implicit1 {
override 	 def generateVisitor(tabsString 	: String) : String = { 
		 return null;
	}  
}
 class RichTypeDefinition(value:TypeDefinition)  extends RichNamedElement(value:NamedElement)  with implicit1 {
override 	 def generateVisitor(tabsString 	: String) : String = { 
		 return "";
	}  
}
 class RichDataType(value:DataType)  extends RichType(value:Type)  with implicit1 {
override 	 def generateVisitor(tabsString 	: String) : String = { 
		 return null;
	}  
}
 class RichEnumeration(value:Enumeration)  extends RichDataType(value:DataType)  with implicit1 {
override 	 def generateVisitor(tabsString 	: String) : String = { 
		 return null;
	}  
}
 class RichNamedElement(value:NamedElement)  extends RichObject(value:Object)  with implicit1 {
override 	 def generateVisitor(tabsString 	: String) : String = { 
		 return null;
	}  
}

 class RichParameter(value:Parameter)  extends RichMultiplicityElement(value:MultiplicityElement)  with implicit1 {
override 	 def generateVisitor(tabsString 	: String) : String = { 
		 return null;
	}  
}
 class RichPrimitiveType(value:PrimitiveType)  extends RichDataType(value:DataType)  with implicit1 {
override 	 def generateVisitor(tabsString 	: String) : String = { 
		 return return value.getName;
	}  
}
 class RichTypedElement(value:TypedElement)  extends RichTypeContainer(value:TypeContainer)  with implicit1 {
override 	 def generateVisitor(tabsString 	: String) : String = { 
		 return null;
	}  
}
 class RichTag(value:Tag)  extends RichObject(value:Object)  with implicit1 {
override 	 def generateVisitor(tabsString 	: String) : String = { 
		 return "";
	}  
}
 class RichConstraint(value:Constraint)  extends RichNamedElement(value:NamedElement)  with implicit1 {
override 	 def generateVisitor(tabsString 	: String) : String = { 
		 return null;
	}  
}

 class RichRequire(value:Require)  extends RichObject(value:Object)  with implicit1 {
override 	 def generateVisitor(tabsString 	: String) : String = { 
		 return null;
	}  
}
 class RichUsing(value:Using)  extends RichObject(value:Object)  with implicit1 {
override 	 def generateVisitor(tabsString 	: String) : String = { 
		 	Util.usings = Util.usings + "import "+ value.getQualifiedName.replaceAll("::",".") +  "._\n";
    		
    		return null;
	}  
}
 class RichFilter(value:Filter)  extends RichObject(value:Object)  with implicit1 {
override 	 def generateVisitor(tabsString 	: String) : String = { 
		 return null;
	}  
}
 class RichGenericTypeDefinition(value:GenericTypeDefinition)  extends RichTypeDefinition(value:TypeDefinition)  with implicit1 {
override 	 def generateVisitor(tabsString 	: String) : String = { 
		 return "//TODO RichGenericTypeDefinition";
	}  
}

 class RichTypeVariable(value:TypeVariable)  extends RichTypeContainer(value:TypeContainer)  with implicit1 {
override 	 def generateVisitor(tabsString 	: String) : String = { 
		 return  "//TODO RichTypeVariable";
	}  
}
 class RichObjectTypeVariable(value:ObjectTypeVariable)  extends RichTypeVariable(value:TypeVariable)  with implicit1 {
override 	 def generateVisitor(tabsString 	: String) : String = { 
		 return null;
	}  
}

  class RichParameterizedType(value:ParameterizedType)  extends RichType(value:Type)  with implicit1 {
override 	 def generateVisitor(tabsString 	: String) : String = { 
		 return "//TODO ParameterizedType";
	}  
}
 
   class RichClass(value:Class)  extends RichParameterizedType(value:ParameterizedType)  with implicit1 {
override 	 def generateVisitor(tabsString 	: String) : String = { 
		return value.getTypeDefinition.getName;
	}  
}

 class RichModelTypeVariable(value:ModelTypeVariable)  extends RichTypeVariable(value:TypeVariable)  with implicit1 {
override 	 def generateVisitor(tabsString 	: String) : String = { 
		 return null;
	}  
}
 class RichVirtualType(value:VirtualType)  extends RichObjectTypeVariable(value:ObjectTypeVariable)  with implicit1 {
override 	 def generateVisitor(tabsString 	: String) : String = { 
		 return null;
	}  
}
 class RichProductType(value:ProductType)  extends RichTypeContainer(value:TypeContainer)  with implicit1 {
override 	 def generateVisitor(tabsString 	: String) : String = { 
		 return null;
	}  
}
 class RichFunctionType(value:FunctionType)  extends RichTypeContainer(value:TypeContainer)  with implicit1 {
override 	 def generateVisitor(tabsString 	: String) : String = { 
		 return null;
	}  
}
 class RichVoidType(value:VoidType)  extends RichType(value:Type)  with implicit1 {
override 	 def generateVisitor(tabsString 	: String) : String = { 
		 return "Void";
	}  
}
 class RichTypeDefinitionContainer(value:TypeDefinitionContainer)  extends RichNamedElement(value:NamedElement)  with implicit1 {
override 	 def generateVisitor(tabsString 	: String) : String = { 
		 return null;
	}  
}
 class RichDummyClass(value:DummyClass)  extends implicit1 {
	 def generateVisitor(tabsString 	: String) : String = { 
		 return null;
	}  
}
 class RichType(value:Type)  extends RichObject(value:Object)  with implicit1 {
override 	 def generateVisitor(tabsString 	: String) : String = { 
		 return null;
	}  
 } 
