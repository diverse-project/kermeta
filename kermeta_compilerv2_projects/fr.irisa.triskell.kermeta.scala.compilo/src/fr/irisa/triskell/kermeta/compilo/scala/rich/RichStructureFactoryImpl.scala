package fr.irisa.triskell.kermeta.compilo.scala.rich

import fr.irisa.triskell.kermeta.language.structure.impl._
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import fr.irisa.triskell.kermeta.language.behavior.impl._
import fr.irisa.triskell.kermeta.language.behavior._
import fr.irisa.triskell.kermeta.language._
import fr.irisa.triskell.kermeta.language.structure._ 
import fr.irisa.triskell.kermeta.compilo.scala.rich.richAspect._
import fr.irisa.triskell.kermeta.compilo.scala.rich._

class RichStructureFactoryImpl extends StructureFactoryImpl {
    
	override def createObject() = {
		new ObjectView
	}

	//TODO
	override def createMultiplicityElement() = {
		new MultiplicityElementImpl() with ObjectAspect
	}

	override def createOperation() : Operation = {
		new OperationView
	}

	override def createProperty() : Property = {
		new PropertyView
	}

	//TODO
	override def createType() : Type = {
		new TypeImpl with ObjectAspect

	}
	
	override def createEnumerationLiteral() : EnumerationLiteral = {
		new EnumerationLiteralView
	}

	override def createTypeVariableBinding() : TypeVariableBinding = {
		new TypeVariableBindingView
	}

	override def createClass() = {
		new ClassView
	}

	//TODO
	override def createModel() : Model = {
		new ModelImpl() with ObjectAspect
	}

	override def createModelType() : ModelType = {
		new ModelTypeImpl() with ObjectAspect
	}

	override def createObjectTypeVariable() : ObjectTypeVariable = {
		new ObjectTypeVariableView
	}

	//TODO
	override def createClassDefinition() : ClassDefinition = {
		new ClassDefinitionView
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
		new PackageView
	}

	//TODO
	override def createTypeDefinition() : TypeDefinition = {
		new TypeDefinitionImpl() with ObjectAspect
	}
	
	override def createVoidType() : VoidType = {
		new VoidTypeView
	}
 
	//TODO
	override def createRequire() : Require = {
		new RequireImpl() with ObjectAspect
	}

	override def createUsing() : Using = {
		new UsingView
	}

	override def createModelingUnit() : ModelingUnit = {
		new ModelingUnitView()
	}

	//TODO
	override def createFilter() : Filter = {
		new FilterImpl() with ObjectAspect
	}

	//TODO
	override def createEnumeration() : Enumeration = {
		new EnumerationView
	}

	//TODO
	override def createParameter() : Parameter = {
		new ParameterImpl() with ObjectAspect
	}

	override def createPrimitiveType() : PrimitiveType = {
		new PrimitiveTypeView
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
//
//	//TODO
//	override def createVirtualType() : VirtualType = {
//		new VirtualTypeImpl
//	}
//	
//	
//
}
