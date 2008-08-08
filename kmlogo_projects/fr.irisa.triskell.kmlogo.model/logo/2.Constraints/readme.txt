if the generated kmt has an error on the line :
require "http://www.kermeta.org/kmLogo"

this is because you forgot to register the file logo/1.Metamodel/ASMLogo.ecore
In deployed mode (ie. in a runtime workbench), the ecore is automatically 
registered by the plugin, in development mode, you need to manually register it.