package org.kermeta.compilo.scala.rich

import org.kermeta.language.structure.impl._
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import org.kermeta.language.behavior.impl._
import org.kermeta.language.behavior._
import org.kermeta.language._
import org.kermeta.language.structure._
import org.kermeta.compilo.scala.rich.richAspect._
import org.kermeta.compilo.scala.rich._

class RichStructureFactoryImpl extends StructureFactoryImpl {
    
	override def createKermetaModelElement() = {
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
		new FunctionTypeView
	}

	//TODO
	override def createProductType() : ProductType = {
		new ProductTypeView
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


	override def createModelingUnit() : ModelingUnit = {
		new ModelingUnitView()
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
		new ConstraintView
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
