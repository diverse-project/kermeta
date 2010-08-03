/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.framework.aspects

import org.kermeta.art2._
import scala.collection.JavaConversions._
import Art2Aspects._

case class ComponentInstanceAspect(cself : ComponentInstance) {

  def isModelEquals(c : ComponentInstance) : Boolean = {
    cself.getName == c.getName
    /* TODO deep compare */
  }

  def isUpdated(c : ComponentInstance) : Boolean = {
    var result = false

    //TEST COLLECTION REQUIRE PORT
    if(c.getRequired.size == cself.getRequired.size){
      result = !(cself.getRequired.forall({p=> c.getRequired.exists({p2=>p2.isModelEquals(p)})  }))
    } else {
      result = true
    }
    if(result) return result

    //TEST COLLECTION PROVIDED PORT
    if(c.getProvided.size == cself.getProvided.size){
      result = !(cself.getProvided.forall({p=> c.getProvided.exists({p2=>p2.isModelEquals(p)})  }))
    } else {
      result = true
    }

    if(result) return result


    //ckeck all bindings from runtime where neededPorts used
    var neededBindingRuntime : List[Binding] = List()
    cself.eContainer.eContainer.asInstanceOf[ContainerRoot].getBindings.foreach{b=>
      b.getPorts.foreach{p=>
        cself.getRequired.foreach{np=>
          if(np.isModelEquals(p)) { neededBindingRuntime.add(b) }
        }
      }
    }
    //check all bindings from update node where neededPorts used
    var neededBindingUpdate : List[Binding] = List()
    cself.eContainer.eContainer.asInstanceOf[ContainerRoot].getBindings.foreach{b=>
      b.getPorts.foreach{p=>
        cself.getRequired.foreach{np=>
          if(np.isModelEquals(p)) { neededBindingUpdate.add(b) }
        }
      }
    }

    if (neededBindingRuntime.size == neededBindingUpdate.size )
    {
      //every runtime needed binding is contain in update needed binding
      neededBindingRuntime.foreach{b=>
        if (!neededBindingUpdate.exists{ b2 => b.isModelEquals(b2) })
        { result = true }
      }
    } else {
      result =true
    }

    

    result
  }

  /*

   operation isUpdated(ct : ComponentInstance) : Boolean is do
   result := false


   //TEST COLLECTION BINDINGS
   if(not(result))
   then
   //ckeck all bindings from runtime where neededPorts used
   var neededBindingRuntime : OrderedSet<Binding> init OrderedSet<Binding>.new
   self.container.container.asType(ContainerRoot).bindings.each{b|
   b.ports.each{p|
   self.required.each{np|
   if(np.isEquals(p)) then neededBindingRuntime.add(b) end
   }
   }
   }
   //check all bindings from update node where neededPorts used
   var neededBindingUpdate : OrderedSet<Binding> init OrderedSet<Binding>.new
   self.container.container.asType(ContainerRoot).bindings.each{b|
   b.ports.each{p|
   self.required.each{np|
   if(np.isEquals(p)) then neededBindingUpdate.add(b) end
   }
   }
   }

   if (neededBindingRuntime.size == neededBindingUpdate.size )
   then
   //every runtime needed binding is contain in update needed binding
   neededBindingRuntime.each{b|
   if not(neededBindingUpdate.exists{ b2 | b.isEquals(b2) })
   then result := true end
   }
   else
   result := true
   end
   end
   end

   */


}
