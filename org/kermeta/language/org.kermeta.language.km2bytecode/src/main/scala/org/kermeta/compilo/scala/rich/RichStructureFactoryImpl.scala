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
		new KermetaModelElementView
	}

	//TODO
	override def createMultiplicityElement() = {
		new MultiplicityElementImpl() with KermetaModelElementAspect
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
		new ModelImpl() with KermetaModelElementAspect
	}

	override def createModelType() : ModelType = {
		new ModelTypeImpl() with KermetaModelElementAspect
	}

	override def createObjectTypeVariable() : ObjectTypeVariable = {
		new KermetaModelElementTypeVariableView
	}

	override def createClassDefinition() : ClassDefinition = {
		new ClassDefinitionView
	}

	override def createFunctionType() : FunctionType = {
		new FunctionTypeView
	}

	override def createProductType() : ProductType = {
		new ProductTypeView
	}

	override def createPackage()  = {
		new PackageView
	}

	//TODO
	override def createTypeDefinition() : TypeDefinition = {
		new TypeDefinitionImpl() with KermetaModelElementAspect
	}
	
	override def createVoidType() : VoidType = {
		new VoidTypeView
	}
 
	//TODO
	override def createRequire() : Require = {
		new RequireImpl() with KermetaModelElementAspect
	}

	override def createUsing() : Using = {
		new UsingView
	}

	override def createModelingUnit() : ModelingUnit = {
		new ModelingUnitView()
	}



	override def createEnumeration() : Enumeration = {
		new EnumerationView
	}

	//TODO
	override def createParameter() : Parameter = {
		new ParameterImpl() with KermetaModelElementAspect
	}

	override def createPrimitiveType() : PrimitiveType = {
		new PrimitiveTypeView
	}

	//TODO
	override def createTag() : Tag = {
		new TagImpl() with KermetaModelElementAspect
	}

	override def createConstraint() : Constraint = {
		new ConstraintView
	}

	//TODO
	override def createModelTypeVariable() : ModelTypeVariable = {
		new ModelTypeVariableImpl() with KermetaModelElementAspect
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
