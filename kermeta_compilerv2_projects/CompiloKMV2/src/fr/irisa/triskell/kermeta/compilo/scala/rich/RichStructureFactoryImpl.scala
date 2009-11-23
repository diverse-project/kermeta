package fr.irisa.triskell.kermeta.compilo.scala.rich

import fr.irisa.triskell.kermeta.language.structure.impl._
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import fr.irisa.triskell.kermeta.language.behavior.impl._
import fr.irisa.triskell.kermeta.language.behavior._
import fr.irisa.triskell.kermeta.language._
import fr.irisa.triskell.kermeta.language.structure._ 
import fr.irisa.triskell.kermeta.compilo.scala.rich.richAspect._

class RichStructureFactoryImpl extends StructureFactoryImpl {
  
	override def createObject() = {
		new ObjectImpl with ObjectAspect
	}

	//TODO
	override def createMultiplicityElement() = {
		new MultiplicityElementImpl() with ObjectAspect
	}

	override def createOperation() : Operation = {
		new OperationImpl() with OperationAspect
	}

	override def createProperty() : Property = {
		new PropertyImpl() with PropertyAspect
	}

	//TODO
	override def createType() : Type = {
		new TypeImpl() with ObjectAspect

	}
	
	override def createEnumerationLiteral() : EnumerationLiteral = {
		new EnumerationLiteralImpl() with EnumerationLiteralAspect
	}

	override def createTypeVariableBinding() : TypeVariableBinding = {
		new TypeVariableBindingImpl() with TypeVariableBindingAspect
	}

	override def createClass() = {
		new ClassImpl() with ClassAspect
	}

	//TODO
	override def createModel() : Model = {
		new ModelImpl() with ObjectAspect
	}

	override def createModelType() : ModelType = {
		new ModelTypeImpl() with ObjectAspect
	}

	override def createObjectTypeVariable() : ObjectTypeVariable = {
		new ObjectTypeVariableImpl() with ObjectTypeVariableAspect
	}

	//TODO
	override def createClassDefinition() : ClassDefinition = {
		new ClassDefinitionImpl() with ClassDefinitionAspect
	}

	//TODO
	override def createFunctionType() : FunctionType = {
		new FunctionTypeImpl() with ObjectAspect
	}

	//TODO
	override def createProductType() : ProductType = {
		new ProductTypeImpl() with ObjectAspect
	}

	
	override def createPackage()  = {
		new PackageImpl() with PackageAspect
	}

	//TODO
	override def createTypeDefinition() : TypeDefinition = {
		new TypeDefinitionImpl() with ObjectAspect
	}

	override def createVoidType() : VoidType = {
		new VoidTypeImpl() with VoidTypeAspect
	}
 
	//TODO
	override def createRequire() : Require = {
		new RequireImpl() with ObjectAspect
	}

	override def createUsing() : Using = {
		new UsingImpl() with UsingAspect
	}

	override def createModelingUnit() : ModelingUnit = {
		new ModelingUnitImpl() with ModelingUnitAspect
	}

	//TODO
	override def createFilter() : Filter = {
		new FilterImpl() with ObjectAspect
	}

	//TODO
	override def createEnumeration() : Enumeration = {
		new EnumerationImpl() with EnumerationAspect
	}

	//TODO
	override def createParameter() : Parameter = {
		new ParameterImpl() with ObjectAspect
	}

	override def createPrimitiveType() : PrimitiveType = {
		new PrimitiveTypeImpl() with PrimitiveTypeAspect
	}

	//TODO
	override def createTag() : Tag = {
		new TagImpl() with ObjectAspect
	}
	
	//TODO
	override def createConstraint() : Constraint = {
		new ConstraintImpl() with ObjectAspect
	}

	//TODO
	override def createModelTypeVariable() : ModelTypeVariable = {
		new ModelTypeVariableImpl() with ObjectAspect
	}

	//TODO
	override def createVirtualType() : VirtualType = {
		new VirtualTypeImpl() with ObjectAspect
	}
	
	

}
