$Id: README.txt,v 1.1 2006-08-21 15:59:59 zdrey Exp $


Leaders :
---------

F. Fleurey


Description :
-------------

This project contains the text editor


How to build this project :
---------------------------
This project is a plugin that depends on io_kermeta.jar, model_kermeta.jar, 
interpreter_kermeta.jar (located in fr.irisa.triskell.kermeta plugin project)

--------------------------------------------------
         Package description :              
--------------------------------------------------

The main packages to take a look at are 
   - fr.irisa.triskell.kermeta.texteditor.editor : 
     Contains the main editor class (Editor.java) and the satellite classes.
     Each of those satellite classes have a particular role (
     Syntax coloring (EditorScanner), reconciling strategy (to recompile the text
     currently edited after user modification). See internal javadoc for details.
   
   - fr.irisa.triskell.kermeta.texteditor.outline : 
     Contains the classes for outline display.

   - fr.irisa.triskell.kermeta.completion : 
     Contains the classes for completion assistance.
     
The others are less important :
   - icons : contains icons and classes that ease icon access

History :
---------
$Log: not supported by cvs2svn $

