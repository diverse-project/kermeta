$Id: README.txt,v 1.1 2006-09-29 13:27:29 zdrey Exp $


Leaders :
---------
Z. Drey
F. Fleurey

Description :
-------------
This project contains the program necessary to interprete an executable kermeta model.


How to build this project :
---------------------------
launch deploy_jar_build.xml

How the project is organized :
------------------------------

* doc : documentation. ...
* build : the generated classes
* dist : the .jar of this project


How the packages are organized :
--------------------------------

--------------------------------------------------
         Package global principles :              
--------------------------------------------------

- /dev : put here any code that is used to construct the language
- [TODO]


--------------------------------------------------
         Package description :              
--------------------------------------------------

Here is a description of the main packages:

- fr.irisa.triskell.kermeta.interpreter : 

     contains the classes representing the objects necessary to the interpretation
     process :
     
     * CallFrames
     * Variables
     * Traceback tools
     * ExpressionContext
     * Interpreter visitor.

- fr.irisa.triskell.kermeta.launcher : 

     contains the main classes that launch the interpreter.

- fr.irisa.triskell.kermeta.runtime : 

     Classes that load create the runtime representation of a Kermeta model for
     the interpreter.
     
     Subpackages : 
     
     * basetypes : singleton (with static methods) classes that wrap 
       methods (equals, compare, etc.) for the basic types (like boolean).
       All those methods return RuntimeObject, representing their result.
     * io : contains the basic input output stream wrappers
     * language : contains the kermeta specific type wrappers
     * loader : contains the methods for loading and serializating EMF models
    


The undescribed packages mainly contain some utility functions/facilities.


History :
---------
$Log: not supported by cvs2svn $