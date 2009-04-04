package p1

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

 class RichAssignment(value:Assignment)  extends RichExpression(value:Expression)  with implicit1 {
override 	 def generateVisitor(tabsString 	: String) : String = { 
		  var returnString : String = "";
		 returnString = returnString+value.getTarget.generateVisitor(tabsString)	
    	 returnString = returnString+ " = "	    	 
		 returnString = returnString+value.getValue.generateVisitor(tabsString)	
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
		  var returnString : String = "{";
     	  value.getStatement.foreach(exp => returnString = returnString + exp.generateVisitor(tabsString))
     	  returnString = returnString+ "}"
    	  return returnString;
	}  
}
 class RichCallVariable(value:CallVariable)  extends RichCallExpression(value:CallExpression)  with implicit1 {
override 	 def generateVisitor(tabsString 	: String) : String = { 
				  var returnString : String = "";
		 returnString = returnString+ "."+value.getName  +"/*CallVariable**/"
		 
//			returnString = returnString+value.getParameters.foreach(par=> par.generateVisitor(tabsString))	
//    	 returnString = returnString+ ")"
    	 return returnString;

	}  
}
 class RichCallFeature(value:CallFeature)  extends RichCallExpression(value:CallExpression)  with implicit1 {
override 	 def generateVisitor(tabsString 	: String) : String = { 
				  var returnString : String = "";
		if (value.getTarget!=null)
			returnString = returnString+value.getTarget.generateVisitor(tabsString)
			//value
      	returnString = returnString+ "."+value.getName //+"/*RichCallFeature**/"
		 
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
		 return null;
	}  
}
 class RichRescue(value:Rescue)  extends RichObject(value:Object)  with implicit1 {
override 	 def generateVisitor(tabsString 	: String) : String = { 
		 return null;
	}  
}
 class RichTypeReference(value:TypeReference)  extends RichMultiplicityElement(value:MultiplicityElement)  with implicit1 {
override 	 def generateVisitor(tabsString 	: String) : String = { 
		 return null;
	}  
}
 class RichLiteral(value:Literal)  extends RichExpression(value:Expression)  with implicit1 {
override 	 def generateVisitor(tabsString 	: String) : String = { 
		 return null;
	}  
}
 class RichEmptyExpression(value:EmptyExpression)  extends RichExpression(value:Expression)  with implicit1 {
override 	 def generateVisitor(tabsString 	: String) : String = { 
		 return null;
	}  
}
 class RichJavaStaticCall(value:JavaStaticCall)  extends RichExpression(value:Expression)  with implicit1 {
override 	 def generateVisitor(tabsString 	: String) : String = { 
		 return null;
	}  
}
 class RichLambdaExpression(value:LambdaExpression)  extends RichExpression(value:Expression)  with implicit1 {
override 	 def generateVisitor(tabsString 	: String) : String = { 
		 return null;
	}  
}
 class RichLambdaParameter(value:LambdaParameter)  extends RichObject(value:Object)  with implicit1 {
override 	 def generateVisitor(tabsString 	: String) : String = { 
		 return null;
	}  
}
 class RichIntegerLiteral(value:IntegerLiteral)  extends RichLiteral(value:Literal)  with implicit1 {
override 	 def generateVisitor(tabsString 	: String) : String = { 
		 return null;
	}  
}
 class RichStringLiteral(value:StringLiteral)  extends RichLiteral(value:Literal)  with implicit1 {
override 	 def generateVisitor(tabsString 	: String) : String = { 
		 return null;
	}  
}
 class RichBooleanLiteral(value:BooleanLiteral)  extends RichLiteral(value:Literal)  with implicit1 {
override 	 def generateVisitor(tabsString 	: String) : String = { 
		 return value.isValue().toString;
	}  
}
 class RichTypeLiteral(value:TypeLiteral)  extends RichLiteral(value:Literal)  with implicit1 {
override 	 def generateVisitor(tabsString 	: String) : String = { 
		 return null;
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
		 return null;
	}  
}
 class RichVariableDecl(value:VariableDecl)  extends RichExpression(value:Expression)  with implicit1 {
override 	 def generateVisitor(tabsString 	: String) : String = { 
		 return null;
	}  
}
 class RichObject(value:Object)  extends implicit1 {
	 def generateVisitor(tabsString 	: String) : String = { 
		 return "";
	}  
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
			  returnString = returnString +"var result : "+ value.getType().generateVisitor(tabsString)+"\n"
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
 class RichPackage(value:Package)  extends RichNamedElement(value:NamedElement)  with implicit1 {
override 	 def generateVisitor(tabsString 	: String) : String = { 
		 var returnString : String = "package "+ value.getName+";\n";
			value.getOwnedTypeDefinition.foreach(p=> returnString = returnString + p.generateVisitor(tabsString))
    		returnString = returnString + "\n"
    		return returnString;
	}  
}
 
  class RichClassDefinition(value:ClassDefinition)  extends RichGenericTypeDefinition(value:GenericTypeDefinition)  with implicit1 {
override 	 def generateVisitor(tabsString 	: String) : String = { 
		var returnString : String = "class "+ value.getName+"{\n";
			value.getOwnedAttribute foreach(a=> returnString = returnString + a.generateVisitor(tabsString))
			value.getOwnedOperation foreach(op=> returnString = returnString + op.generateVisitor(tabsString))
    		returnString = returnString + "}\n"
    		return returnString;
	}  
}

 class RichParameter(value:Parameter)  extends RichMultiplicityElement(value:MultiplicityElement)  with implicit1 {
override 	 def generateVisitor(tabsString 	: String) : String = { 
		 return null;
	}  
}
 class RichPrimitiveType(value:PrimitiveType)  extends RichDataType(value:DataType)  with implicit1 {
override 	 def generateVisitor(tabsString 	: String) : String = { 
		 return value.getName;
	}  
}
 class RichTypedElement(value:TypedElement)  extends RichTypeContainer(value:TypeContainer)  with implicit1 {
override 	 def generateVisitor(tabsString 	: String) : String = { 
		 return null;
	}  
}
 class RichTag(value:Tag)  extends RichObject(value:Object)  with implicit1 {
override 	 def generateVisitor(tabsString 	: String) : String = { 
		 return null;
	}  
}
 class RichConstraint(value:Constraint)  extends RichNamedElement(value:NamedElement)  with implicit1 {
override 	 def generateVisitor(tabsString 	: String) : String = { 
		 return null;
	}  
}

 class RichModelingUnit(value:ModelingUnit)  extends RichObject(value:Object)  with implicit1 {
override 	 def generateVisitor(tabsString 	: String) : String = { 
		 	var returnString : String = "";
			value.getPackages.foreach(p=> returnString = returnString + p.generateVisitor(tabsString))
    		return returnString;
	}  
}
 class RichRequire(value:Require)  extends RichObject(value:Object)  with implicit1 {
override 	 def generateVisitor(tabsString 	: String) : String = { 
		 return null;
	}  
}
 class RichUsing(value:Using)  extends RichObject(value:Object)  with implicit1 {
override 	 def generateVisitor(tabsString 	: String) : String = { 
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
		 return "";
	}  
}

 class RichTypeVariable(value:TypeVariable)  extends RichTypeContainer(value:TypeContainer)  with implicit1 {
override 	 def generateVisitor(tabsString 	: String) : String = { 
		 return null;
	}  
}
 class RichObjectTypeVariable(value:ObjectTypeVariable)  extends RichTypeVariable(value:TypeVariable)  with implicit1 {
override 	 def generateVisitor(tabsString 	: String) : String = { 
		 return null;
	}  
}

  class RichParameterizedType(value:ParameterizedType)  extends RichType(value:Type)  with implicit1 {
override 	 def generateVisitor(tabsString 	: String) : String = { 
		 return "";
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
