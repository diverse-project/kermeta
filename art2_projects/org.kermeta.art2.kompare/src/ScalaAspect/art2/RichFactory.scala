package ScalaAspect.art2
import ScalaImplicit.org.kermeta.org.kermeta.default.aspects.ImplicitConversion._
object RichFactory extends art2.impl.Art2FactoryImpl{
 override def createComponentInstance : art2.ComponentInstance = { new ScalaAspect.art2.RichComponentInstance }
 override def createPort : art2.Port = { new ScalaAspect.art2.RichPort }
 override def createMessageHub : art2.MessageHub = { new ScalaAspect.art2.RichMessageHub }
 override def createTopic : art2.Topic = { new ScalaAspect.art2.RichTopic }
 override def createQueue : art2.Queue = { new ScalaAspect.art2.RichQueue }
 override def createBinding : art2.Binding = { new ScalaAspect.art2.RichBinding }
 override def createComponentType : art2.ComponentType = { new ScalaAspect.art2.RichComponentType }
 override def createContainerNode : art2.ContainerNode = { new ScalaAspect.art2.RichContainerNode }
 override def createContainerRoot : art2.ContainerRoot = { new ScalaAspect.art2.RichContainerRoot }
 override def createNamedElement : art2.NamedElement = { new ScalaAspect.art2.RichNamedElement }
 override def createNamespace : art2.Namespace = { new ScalaAspect.art2.RichNamespace }
 override def createDictionary : art2.Dictionary = { new ScalaAspect.art2.RichDictionary }
 override def createDictionaryType : art2.DictionaryType = { new ScalaAspect.art2.RichDictionaryType }
 override def createDictionaryAttribute : art2.DictionaryAttribute = { new ScalaAspect.art2.RichDictionaryAttribute }
 override def createTypedElement : art2.TypedElement = { new ScalaAspect.art2.RichTypedElement }
 override def createDictionaryValue : art2.DictionaryValue = { new ScalaAspect.art2.RichDictionaryValue }
 override def createCompositeType : art2.CompositeType = { new ScalaAspect.art2.RichCompositeType }
 override def createPortTypeRef : art2.PortTypeRef = { new ScalaAspect.art2.RichPortTypeRef }
 override def createWire : art2.Wire = { new ScalaAspect.art2.RichWire }
 override def createServicePortType : art2.ServicePortType = { new ScalaAspect.art2.RichServicePortType }
 override def createOperation : art2.Operation = { new ScalaAspect.art2.RichOperation }
 override def createParameter : art2.Parameter = { new ScalaAspect.art2.RichParameter }
 override def createMessagePortType : art2.MessagePortType = { new ScalaAspect.art2.RichMessagePortType }
 override def createRepository : art2.Repository = { new ScalaAspect.art2.RichRepository }
 override def createComponentTypeLibrary : art2.ComponentTypeLibrary = { new ScalaAspect.art2.RichComponentTypeLibrary }
 override def createIntegrationPattern : art2.IntegrationPattern = { new ScalaAspect.art2.RichIntegrationPattern }
 override def createExtraFonctionalProperty : art2.ExtraFonctionalProperty = { new ScalaAspect.art2.RichExtraFonctionalProperty }
 override def createMetric : art2.Metric = { new ScalaAspect.art2.RichMetric }
 override def createPortTypeMapping : art2.PortTypeMapping = { new ScalaAspect.art2.RichPortTypeMapping }
 override def createMBinding : art2.MBinding = { new ScalaAspect.art2.RichMBinding }
}

