package fr.irisa.triskell.kermeta.compilo.scala.rich

import fr.irisa.triskell.kermeta.compilo.scala.rich._
import fr.irisa.triskell.kermeta.compilo.scala.rich.richAspect._
import scala.collection.JavaConversions._
import fr.irisa.triskell.kermeta.compilo.scala._
import fr.irisa.triskell.kermeta.language._
import fr.irisa.triskell.kermeta.language.structure._ 
import fr.irisa.triskell.kermeta.language.structure.impl._
import fr.irisa.triskell.kermeta.language.behavior._
import fr.irisa.triskell.kermeta.language.behavior.impl._

 
class AssignementView extends AssignmentImpl with AssignmentAspect
class ModelingUnitView extends ModelingUnitImpl with ModelingUnitAspect
class PackageView extends PackageImpl with PackageAspect
class ClassView extends fr.irisa.triskell.kermeta.language.structure.impl.ClassImpl with ClassAspect with TypeVariableBindingAspect
class ClassDefinitionView extends ClassDefinitionImpl with ClassDefinitionAspect
class BlockView extends BlockImpl with BlockAspect
class PrimitiveTypeView extends PrimitiveTypeImpl with PrimitiveTypeAspect
class CallResultView extends CallResultImpl with CallResultAspect
class ObjectTypeVariableView extends ObjectTypeVariableImpl with ObjectTypeVariableAspect
class EnumerationView extends EnumerationImpl with EnumerationAspect
class PropertyView extends PropertyImpl with PropertyAspect
class TypeReferenceView extends TypeReferenceImpl with TypeReferenceAspect
class OperationView extends OperationImpl with OperationAspect
class TypeLiteralView extends TypeLiteralImpl with TypeLiteralAspect
class BooleanLiteralView extends BooleanLiteralImpl with BooleanLiteralAspect
class CallValueView extends CallValueImpl with CallValueAspect
class StringLiteralView extends StringLiteralImpl with StringLiteralAspect
class VoidLiteralView extends VoidLiteralImpl with VoidLiteralAspect
class CallSuperOperationView extends CallSuperOperationImpl with CallSuperOperationAspect
class CallVariableView extends CallVariableImpl with CallVariableAspect
class CallFeatureView extends CallFeatureImpl with CallFeatureAspect
class IntegerLiteralView extends IntegerLiteralImpl with IntegerLiteralAspect
class DataTypeView extends DataTypeImpl with DataTypeAspect
class SelfExpressionView extends SelfExpressionImpl with SelfExpressionAspect
class VariableDeclView extends VariableDeclImpl with VariableDeclAspect
class CallExpressionView extends CallExpressionImpl with CallExpressionAspect
class LambdaExpressionView extends LambdaExpressionImpl with LambdaExpressionAspect
class RaiseView extends RaiseImpl with RaiseAspect
class LoopView extends LoopImpl with LoopAspect
class ConditionalView extends ConditionalImpl with ConditionalAspect
class ObjectView extends fr.irisa.triskell.kermeta.language.structure.impl.ObjectImpl with ObjectAspect
class EnumerationLiteralView extends EnumerationLiteralImpl with EnumerationLiteralAspect
class VoidTypeView extends VoidTypeImpl with VoidTypeAspect
class TypeVariableBindingView extends TypeVariableBindingImpl with TypeVariableBindingAspect
class UsingView extends UsingImpl with UsingAspect
class LambdaParameterView extends LambdaParameterImpl with LambdaParameterAspect
//class ExpressionView extends ExpressionImpl with ObjectAspect
class TypeView extends TypeImpl with TypeAspect
class ProductTypeView extends ProductTypeImpl with ProductTypeAspect
class FunctionTypeView extends FunctionTypeImpl with FunctionTypeAspect
class TypeDefinitionView extends TypeDefinitionImpl with TypeDefinitionAspect



