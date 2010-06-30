package ScalaAspect.org.eclipse.emf.ecore
import ScalaImplicit.org.kermeta.org.kermeta.default.aspects.ImplicitConversion._
object RichFactory extends org.eclipse.emf.ecore.impl.EcoreFactoryImpl{
 override def createEAttribute : org.eclipse.emf.ecore.EAttribute = { new ScalaAspect.org.eclipse.emf.ecore.RichEAttribute }
 override def createEAnnotation : org.eclipse.emf.ecore.EAnnotation = { new ScalaAspect.org.eclipse.emf.ecore.RichEAnnotation }
 override def createEClass : org.eclipse.emf.ecore.EClass = { new ScalaAspect.org.eclipse.emf.ecore.RichEClass }
 override def createEDataType : org.eclipse.emf.ecore.EDataType = { new ScalaAspect.org.eclipse.emf.ecore.RichEDataType }
 override def createEEnum : org.eclipse.emf.ecore.EEnum = { new ScalaAspect.org.eclipse.emf.ecore.RichEEnum }
 override def createEEnumLiteral : org.eclipse.emf.ecore.EEnumLiteral = { new ScalaAspect.org.eclipse.emf.ecore.RichEEnumLiteral }
 override def createEFactory : org.eclipse.emf.ecore.EFactory = { new ScalaAspect.org.eclipse.emf.ecore.RichEFactory }
 override def createEObject : org.eclipse.emf.ecore.EObject = { new ScalaAspect.org.eclipse.emf.ecore.RichEObject }
 override def createEOperation : org.eclipse.emf.ecore.EOperation = { new ScalaAspect.org.eclipse.emf.ecore.RichEOperation }
 override def createEPackage : org.eclipse.emf.ecore.EPackage = { new ScalaAspect.org.eclipse.emf.ecore.RichEPackage }
 override def createEParameter : org.eclipse.emf.ecore.EParameter = { new ScalaAspect.org.eclipse.emf.ecore.RichEParameter }
 override def createEReference : org.eclipse.emf.ecore.EReference = { new ScalaAspect.org.eclipse.emf.ecore.RichEReference }
 override def createEStringToStringMapEntry : java.util.Map.Entry[String,String] = { new ScalaAspect.org.eclipse.emf.ecore.RichEStringToStringMapEntry }
 override def createEGenericType : org.eclipse.emf.ecore.EGenericType = { new ScalaAspect.org.eclipse.emf.ecore.RichEGenericType }
 override def createETypeParameter : org.eclipse.emf.ecore.ETypeParameter = { new ScalaAspect.org.eclipse.emf.ecore.RichETypeParameter }
}

