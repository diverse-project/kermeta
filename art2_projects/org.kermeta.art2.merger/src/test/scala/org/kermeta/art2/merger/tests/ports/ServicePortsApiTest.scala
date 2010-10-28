/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.merger.tests.ports

import org.junit._
import org.scalatest.junit.AssertionsForJUnit
import org.kermeta.art2.merger.Art2MergerComponent
import org.kermeta.art2.merger.tests.MergerTestSuiteHelper
import org.kermeta.art2.ComponentType
import org.kermeta.art2.Operation
import org.kermeta.art2.Parameter
import org.kermeta.art2.Port
import org.kermeta.art2.PortType
import org.kermeta.art2.PortTypeMapping
import org.kermeta.art2.PortTypeRef
import org.kermeta.art2.ServicePortType
import org.kermeta.art2.TypeDefinition
import org.kermeta.art2.TypedElement
import org.kermeta.art2.api.service.core.merger.MergerService
import scala.collection.JavaConversions._

class ServicePortsApiTest extends MergerTestSuiteHelper  {

   var component : MergerService = null
   var serviceClass : String = "org.kermeta.art2.lib4tests.service.ServicePrimitifReturnTypes"

  @Before def initialize() {
    component = new Art2MergerComponent
  }

  @Test def verifyProvidedServiceMethodAdded() {
    var mergedModel = component.merge( model("artFragments/lib4test-ProvidedServiceMethodRemoved.art2"), model("artFragments/lib4test-base.art2"))
    mergedModel testSave ("artFragments","lib4test-ProvidedServiceMethodAddedMerged.art2")

    mergedModel.getTypeDefinitions.toArray.foreach(typeDef =>
      typeDef.asInstanceOf[TypeDefinition].getName match {
        
        //check if the mapping to the method is present
        case "ComponentPrimitiveTypeService" => {
            typeDef.asInstanceOf[ComponentType].getProvided.toArray.find(provPort => provPort.asInstanceOf[PortTypeRef].getName.equals("portPrimitiveTypes")) match {
              case Some(sport) => {
                  sport.asInstanceOf[PortTypeRef].getMappings.toArray.find(mapping => mapping.asInstanceOf[PortTypeMapping].getServiceMethodName.equals("methodInt")) match {
                    case None => fail("No mapping found for method 'methodInt' in component ComponentPrimitiveTypeService")
                    case Some(mapMethod) =>
                  }
              }
              case None => fail("ServicePort not found.")
            }
        }

        //check if operation 'methodInt' have been added to the service interface
        case serviceClass => {
          typeDef.asInstanceOf[ServicePortType].getOperations.toArray.find(op => op.asInstanceOf[Operation].getName.equals("methodInt")) match {
            case None => fail("No method 'methodInt' found in ServicePortType")
            case Some(methodInt) =>
          }
        }
        
      }
    )

    //check if 'int' DataType have been added
    mergedModel.getDataTypes.toArray.find(datatype => datatype.asInstanceOf[TypedElement].getName.equals("scala.int")) match {
      case Some(dataType) =>
      case None => fail("DataType 'int' have not been added when adding 'int methodInt(int i)' in " + serviceClass)
    }

  }

  @Test def verifyProvidedServiceMethodRemoved() {
    var mergedModel = component.merge(model("artFragments/lib4test-base.art2"), model("artFragments/lib4test-ProvidedServiceMethodRemoved.art2"))
    mergedModel testSave ("artFragments","lib4test-ProvidedServiceMethodRemovedMerged.art2")

    mergedModel.getTypeDefinitions.toArray.foreach(typeDef =>
      typeDef.asInstanceOf[TypeDefinition].getName match {

        //check if the mapping to the method is no more present
        case "ComponentPrimitiveTypeService" => {
            typeDef.asInstanceOf[ComponentType].getProvided.toArray.find(provPort => provPort.asInstanceOf[PortTypeRef].getName.equals("portPrimitiveTypes")) match {
              case Some(sport) => {
                  sport.asInstanceOf[PortTypeRef].getMappings.toArray.find(mapping => mapping.asInstanceOf[PortTypeMapping].getServiceMethodName.equals("methodInt")) match {
                    case Some(mapMethod) => fail("Mapping found for method 'methodInt' in component ComponentPrimitiveTypeService")
                    case None =>
                  }
              }
              case None => fail("ServicePort not found.")
            }
        }

        //check if operation 'methodInt' have been removed from the service interface
        case serviceClass => {
          typeDef.asInstanceOf[ServicePortType].getOperations.toArray.find(op => op.asInstanceOf[Operation].getName.equals("methodInt")) match {
            case None => 
            case Some(methodInt) => fail("Method 'methodInt' found in ServicePortType")
          }
        }

      }
    )

    //check if 'int' DataType have been removed
    mergedModel.getDataTypes.toArray.find(datatype => datatype.asInstanceOf[TypedElement].getName.equals("scala.int")) match {
      case Some(dataType) => fail("DataType 'int' have not been removed when removing 'int methodInt(int i)' in " + serviceClass)
      case None => 
    }
  }

  @Test def verifyProvidedServiceMethodRenamed() {
    var mergedModel = component.merge(model("artFragments/lib4test-base.art2"), model("artFragments/lib4test-ProvidedServiceMethodRenamed.art2"))
    mergedModel testSave ("artFragments","lib4test-ProvidedServiceMethodRenamedMerged.art2")

    mergedModel.getTypeDefinitions.toArray.foreach(typeDef =>
      typeDef.asInstanceOf[TypeDefinition].getName match {

        //check if the mapping to the method have been renamed
        case "ComponentPrimitiveTypeService" => {
            typeDef.asInstanceOf[ComponentType].getProvided.toArray.find(provPort => provPort.asInstanceOf[PortTypeRef].getName.equals("portPrimitiveTypes")) match {
              case Some(sport) => {
                  sport.asInstanceOf[PortTypeRef].getMappings.toArray.find(mapping => mapping.asInstanceOf[PortTypeMapping].getServiceMethodName.equals("methodInt")) match {
                    case Some(mapMethod) => fail("Mapping found for method 'methodInt' in component ComponentPrimitiveTypeService")
                    case None =>
                  }

                  sport.asInstanceOf[PortTypeRef].getMappings.toArray.find(mapping => mapping.asInstanceOf[PortTypeMapping].getServiceMethodName.equals("methodIntRENAMED")) match {
                    case Some(mapMethod) =>
                    case None => fail("Mapping not found for method 'methodIntRENAMED' in component ComponentPrimitiveTypeService")
                  }
              }
              case None => fail("ServicePort not found.")
            }
        }

        //check if operation 'methodInt' have been removed from the service interface
        case serviceClass => {
          typeDef.asInstanceOf[ServicePortType].getOperations.toArray.find(op => op.asInstanceOf[Operation].getName.equals("methodInt")) match {
            case None =>
            case Some(methodInt) => fail("Method 'methodInt' found in ServicePortType")
          }

          typeDef.asInstanceOf[ServicePortType].getOperations.toArray.find(op => op.asInstanceOf[Operation].getName.equals("methodIntRENAMED")) match {
            case None => fail("Method 'methodIntRENAMED' not found in ServicePortType")
            case Some(methodInt) =>
          }
        }

      }
    )
  }

  @Test def verifyProvidedServiceMethodParameterAdded() {
    var mergedModel = component.merge(model("artFragments/lib4test-ProvidedServiceMethodParameterRemoved.art2"), model("artFragments/lib4test-base.art2"))
    mergedModel testSave ("artFragments","lib4test-ProvidedServiceMethodParameterAddedMerged.art2")

    mergedModel.getTypeDefinitions.toArray.foreach(typeDef =>
      typeDef.asInstanceOf[TypeDefinition].getName match {

        //check if operation 'methodInt' have a parameter
        case serviceClass => {
          typeDef.asInstanceOf[ServicePortType].getOperations.toArray.find(op => op.asInstanceOf[Operation].getName.equals("methodInt")) match {
            case None => error("No methodInt in " + serviceClass)
            case Some(methodInt) => {
                if( methodInt.asInstanceOf[Operation].getParameters.size != 1 ) {
                  fail("Parameter not added to methodInt")
                }
            }
          }
        }
      }
    )
  }

  @Test def verifyProvidedServiceMethodParameterRemoved() {
    var mergedModel = component.merge(model("artFragments/lib4test-base.art2"), model("artFragments/lib4test-ProvidedServiceMethodParameterRemoved.art2"))
    mergedModel testSave ("artFragments","lib4test-ProvidedServiceMethodParameterRemovedMerged.art2")

    mergedModel.getTypeDefinitions.toArray.foreach(typeDef =>
      typeDef.asInstanceOf[TypeDefinition].getName match {

        //check if operation 'methodInt' have a parameter
        case serviceClass => {
          typeDef.asInstanceOf[ServicePortType].getOperations.toArray.find(op => op.asInstanceOf[Operation].getName.equals("methodInt")) match {
            case None => error("No methodInt in " + serviceClass)
            case Some(methodInt : Operation) => {
                if( methodInt.getParameters.size != 0 ) {
                  fail("Parameter not removed from methodInt. Parameter count should be 0, found " + methodInt.getParameters.size)
                }
            }
          }
        }
      }
    )
  }

  @Test def verifyProvidedServiceMethodParameterRenamed() {
    var mergedModel = component.merge(model("artFragments/lib4test-base.art2"), model("artFragments/lib4test-ProvidedServiceMethodParameterRenamed.art2"))
    mergedModel testSave ("artFragments","lib4test-ProvidedServiceMethodParameterRenamedMerged.art2")

    mergedModel.getTypeDefinitions.toArray.foreach(typeDef =>
      typeDef.asInstanceOf[TypeDefinition].getName match {

        //check if operation 'methodInt' have a parameter
        case serviceClass => {
          typeDef.asInstanceOf[ServicePortType].getOperations.toArray.find(op => op.asInstanceOf[Operation].getName.equals("methodInt")) match {
            case None => error("No methodInt in " + serviceClass)
            case Some(methodInt) => {
                methodInt.asInstanceOf[Operation].getParameters.find(param => param.getName.equals("i")) match {
                  case Some(p) => fail("Parameter 'i' should not exist anymore in method 'methodInt'.")
                  case None =>
                }
                methodInt.asInstanceOf[Operation].getParameters.find(param => param.getName.equals("iRenamed")) match {
                  case Some(p) =>
                  case None => fail("Parameter 'iRenamed' not found in method 'methodInt'.")
                }
            }
          }
        }
      }
    )
  }

  @Test def verifyProvidedServiceMethodParameterTypeChanged() {
    var mergedModel = component.merge(model("artFragments/lib4test-base.art2"), model("artFragments/lib4test-ProvidedServiceMethodParameterTypeChanged.art2"))
    mergedModel testSave ("artFragments","lib4test-ProvidedServiceMethodParameterTypeChangedMerged.art2")

    mergedModel.getTypeDefinitions.toArray.foreach(typeDef =>
      typeDef.asInstanceOf[TypeDefinition].getName match {

        //check if operation 'methodInt' have a parameter
        case serviceClass => {
          typeDef.asInstanceOf[ServicePortType].getOperations.toArray.find(op => op.asInstanceOf[Operation].getName.equals("methodInt")) match {
            case None => error("No methodInt in " + serviceClass)
            case Some(methodInt) => {
                methodInt.asInstanceOf[Operation].getParameters.find(param => param.getName.equals("i")) match {
                  case Some(p : Parameter) => {
                      p.getType.getName match {
                        case "scala.Int" => fail("Parameter 'i' should be of type 'scala.boolean' found 'scala.Int'.")
                      }
                  }
                  case None =>
                  case _ =>
                }
            }
          }
        }
      }
    )
  }

  

  @Test def verifyProvidedServiceMethodReturnTypeChanged() {
   var mergedModel = component.merge(model("artFragments/lib4test-base.art2"), model("artFragments/lib4test-ProvidedServiceMethodReturnTypeChanged.art2"))
    mergedModel testSave ("artFragments","lib4test-ProvidedServiceMethodReturnTypeChangedMerged.art2")

    mergedModel.getTypeDefinitions.foreach(typeDef =>
      typeDef.getName match {

        //check if operation 'methodInt' have a parameter
        case serviceClass => {
          typeDef.asInstanceOf[ServicePortType].getOperations.toArray.find(op => op.asInstanceOf[Operation].getName.equals("methodInt")) match {
            case None => error("No methodInt in " + serviceClass)
            case Some(methodInt : Operation) => {
                methodInt.getReturnType.getName match {
                  case "scala.Int" => fail("Method return type have not been updated. Expected 'scala.boolean', found 'scala.int'")
                  case _ =>
                }
            }
          }
        }
      }
    )
  }

}
