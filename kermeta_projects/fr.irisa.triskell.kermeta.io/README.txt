$Id: README.txt,v 1.5 2008-04-28 11:50:17 ftanguy Exp $


Leaders :
---------
Z. Drey
F. Fleurey

Description :
-------------
This project contains the program necessary to parse, manipulate,
or transform textual or object representation (in java language)
of a kermeta model.


NOTE : When the first kermeta iteration will be completed, this project should be refactored.


How to build this project :
---------------------------


How the project is organized :
------------------------------

* doc : documentation. ...
* build : the generated classes
* dist : the .jar of this project
* kmt_archives :
* kmtbodies :
* 



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

- fr.irisa.triskell.kermeta.ast : 
     contains the Abstract Syntax Tree of Kermeta textual representation. 
     This package is completely generated so you must not modify its content. 
     (Generated using kermeta.ast, a grammar repr. of Kermeta text, and located 
     in fr.irisa.triskell.kermeta.parser)

- fr.irisa.triskell.kermeta.parser : 
     contains the files  (including the grammar kermeta.ast) used to generate 
     Kermeta-text AST, and the generated files (geberated by Emfatic) that are 
     specific to ANTLR

- fr.irisa.triskell.kermeta.loader : 

     Classes that load a kermeta unit from a text representation, or (another
     one) of kermeta :
     
     contains the classes that parse the following formats : 
     
     * Ecore (ecore package), 
     * KMT (kmt package),
     * KM (kermeta object representation (serialized in XMI)),
     * Emfatic -- ecore textual representation --
     * Java (kermeta textual representation of java extern calls).
     * expression (FIXME) : contains the parser for a single expression
     (-> FIXME : move to parser package?)
     
     The parsers convert 
     those formats into a KermetaUnit, that embedds the object representation 
     of a Kermeta model. (Example : fr.irisa.triskell.kermeta.loader.ecore/Ecore2KM.java)

- fr.irisa.triskell.kermeta.exporter : 
     contains classes to export the object representation of a Kermeta model to another one
     (a text format (.kmt), or ecore)

- fr.irisa.triskell.kermeta.typechecker :
     contains the classes that visit the object representation of a Kermeta model in 
     order to type-check it

- fr.irisa.triskell.kermeta.constraintchecker :
     contains the classes that visit the object representation of a Kermeta model in 
     order to type-check its constraints.

The undescribed packages mainly contain some utility functions/facilities.


History :
---------
$Log: not supported by cvs2svn $
Revision 1.4.10.1  2008/04/14 08:54:50  ftanguy
windows compatibility for the lexer

Revision 1.4  2006/08/04 09:36:25  cfaucher
added doc

Revision 1.3  2005/03/02 17:31:29  zdrey
- handling of annotations

Revision 1.2  2005/02/23 10:49:31  zdrey
add skeleton to describe the package in io.

Revision 1.1  2005/02/16 15:53:10  ffleurey
Initial revision

