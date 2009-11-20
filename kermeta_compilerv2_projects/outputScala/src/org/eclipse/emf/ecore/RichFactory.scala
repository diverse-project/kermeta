package org.eclipse.emf.ecore
class RichFactory extends org.eclipse.emf.ecore.ecoreFactoryImpl with fr.irisa.triskell.scala.generated.fw.ImplicitConversion{
 override def createMain : org.eclipse.emf.ecore.Main = { new org.eclipse.emf.ecore.RichMain }
 override def createEClass : org.eclipse.emf.ecore.EClass = { new org.eclipse.emf.ecore.RichEClass }
 override def createEAttribute : org.eclipse.emf.ecore.EAttribute = { new org.eclipse.emf.ecore.RichEAttribute }
 override def createEAnnotation : org.eclipse.emf.ecore.EAnnotation = { new org.eclipse.emf.ecore.RichEAnnotation }
 override def createEClassifier : org.eclipse.emf.ecore.EClassifier = { new org.eclipse.emf.ecore.RichEClassifier }
 override def createEDataType : org.eclipse.emf.ecore.EDataType = { new org.eclipse.emf.ecore.RichEDataType }
 override def createEEnum : org.eclipse.emf.ecore.EEnum = { new org.eclipse.emf.ecore.RichEEnum }
 override def createEEnumLiteral : org.eclipse.emf.ecore.EEnumLiteral = { new org.eclipse.emf.ecore.RichEEnumLiteral }
 override def createEFactory : org.eclipse.emf.ecore.EFactory = { new org.eclipse.emf.ecore.RichEFactory }
 override def createEModelElement : org.eclipse.emf.ecore.EModelElement = { new org.eclipse.emf.ecore.RichEModelElement }
 override def createENamedElement : org.eclipse.emf.ecore.ENamedElement = { new org.eclipse.emf.ecore.RichENamedElement }
 override def createEObject : org.eclipse.emf.ecore.EObject = { new org.eclipse.emf.ecore.RichEObject }
 override def createEOperation : org.eclipse.emf.ecore.EOperation = { new org.eclipse.emf.ecore.RichEOperation }
 override def createEPackage : org.eclipse.emf.ecore.EPackage = { new org.eclipse.emf.ecore.RichEPackage }
 override def createEParameter : org.eclipse.emf.ecore.EParameter = { new org.eclipse.emf.ecore.RichEParameter }
 override def createEReference : org.eclipse.emf.ecore.EReference = { new org.eclipse.emf.ecore.RichEReference }
 override def createEStructuralFeature : org.eclipse.emf.ecore.EStructuralFeature = { new org.eclipse.emf.ecore.RichEStructuralFeature }
 override def createETypedElement : org.eclipse.emf.ecore.ETypedElement = { new org.eclipse.emf.ecore.RichETypedElement }
 override def createEStringToStringMapEntry : java.util.Map$Entry[String,String] = { new org.eclipse.emf.ecore.RichEStringToStringMapEntry }
 override def createEGenericType : org.eclipse.emf.ecore.EGenericType = { new org.eclipse.emf.ecore.RichEGenericType }
 override def createETypeParameter : org.eclipse.emf.ecore.ETypeParameter = { new org.eclipse.emf.ecore.RichETypeParameter }
}

