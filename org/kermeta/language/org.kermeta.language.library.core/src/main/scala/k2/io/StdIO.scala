/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package k2.io


class StdIOClass extends k2.standard.EObjectImplForPrimitive {

    // default messaging system goes to stdio
    var _messagingSystem : _root_.org.kermeta.utils.systemservices.api.messaging.MessagingSystem = new _root_.org.kermeta.utils.systemservices.api.impl.StdioSimpleMessagingSystem
    def messagingSystem_=(arg : _root_.org.kermeta.utils.systemservices.api.messaging.MessagingSystem) = {_messagingSystem = arg}

    // writebuffer is used to make sure we create an info message only when a \n is reached or another messages needs it to be flushed
    var _writeBuffer : StringBuffer = new  StringBuffer
    def write(obj : AnyRef) : Unit = {
        val message : String = obj.toString
        _writeBuffer.synchronized{         // basic way to handle buffer, flush if ends with \n
            _writeBuffer.append(message)
            if(message.endsWith("\n")){
                flushBuffers()
            }
        }
    }

    def errorln(obj : AnyRef) : Unit = {
        flushBuffers()
        _messagingSystem.error(obj.toString,"")
    }


    var _errorBuffer : StringBuffer = new  StringBuffer
    def error(obj : AnyRef) : Unit = {
      val message : String = obj.toString
      _errorBuffer.synchronized{         // basic way to handle error buffer, wait for
        _errorBuffer.append(message)
        if(message.endsWith("\n")){
            flushBuffers()
        }
      }
    }

    def flushBuffers() : Unit = {
      _errorBuffer.synchronized{         // basic way to handle error buffer,
          if(_errorBuffer.length() != 0){
              _messagingSystem.error(_errorBuffer.toString,"")
              _errorBuffer = new  StringBuffer
          }
      }
      _writeBuffer.synchronized{         // basic way to handle write buffer,
          if(_writeBuffer.length() != 0){
              _messagingSystem.info(_writeBuffer.toString,"")
              _writeBuffer = new  StringBuffer
          }
      }
    }

    def writeln(obj : AnyRef) : Unit = {
        flushBuffers()
        _messagingSystem.info(obj.toString,"")
    }

    def read(prompt : String) : String = {
        return _messagingSystem.readLine(prompt)
    }

}

object StdIO extends StdIOClass{
}
